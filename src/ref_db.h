#ifndef GODOT_JVM_REF_DB_H
#define GODOT_JVM_REF_DB_H

#include <cstdint>
#include <core/object/ref_counted.h>
#include <core/os/mutex.h>

class RefDB {
private:
    RefDB();
    ~RefDB() = default;

    struct RefIndex{
        uint64_t index = 0;
        uint32_t counter = 0;
    };

    BinaryMutex mut;
    HashMap<uint64_t, RefIndex> ref_map;
    List<RefIndex> freeIds;

public:
    RefDB(RefDB const &other) = delete;
    RefDB& operator=(const RefDB&)= delete;
    
    uint64_t get_ref_id(RefCounted* ref);
    void remove_ref(RefCounted* ref, uint32_t counter);
    static RefDB& get_instance();

};

#endif //GODOT_JVM_REF_DB_H
