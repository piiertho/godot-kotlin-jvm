#ifndef GODOT_JVM_VARIANT_ARRAY_BRIDGE_H
#define GODOT_JVM_VARIANT_ARRAY_BRIDGE_H

#include "java_instance_wrapper.h"

namespace bridges {

    class VariantArrayBridge : public JavaInstanceWrapper {
    public:
        VariantArrayBridge(jni::JObject p_wrapped);
        ~VariantArrayBridge() = default;

        static uintptr_t engine_call_constructor(JNIEnv* p_raw_env, jobject p_instance);
        static uintptr_t engine_call_constructor_typed(JNIEnv* p_raw_env, jobject p_instance);

        static void engine_call_size(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr);
        static void engine_call_clear(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr);
        static void engine_call_is_empty(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr);
        static void engine_call_hash(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr);
        static void engine_call_reverse(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr);
        static void engine_call_remove_at(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr);
        static void engine_call_resize(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr);
        static void engine_call_shuffle(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr);
        static void engine_call_sort(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr);
        static void engine_call_sortCustom(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr);
        static void engine_call_append(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr);
        static void engine_call_bsearch(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr);
        static void engine_call_bsearchCustom(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr);
        static void engine_call_count(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr);
        static void engine_call_duplicate(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr);
        static void engine_call_erase(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr);
        static void engine_call_find(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr);
        static void engine_call_front(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr);
        static void engine_call_has(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr);
        static void engine_call_insert(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr);
        static void engine_call_max(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr);
        static void engine_call_min(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr);
        static void engine_call_popBack(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr);
        static void engine_call_popFront(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr);
        static void engine_call_pushBack(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr);
        static void engine_call_pushFront(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr);
        static void engine_call_rfind(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr);
        static void engine_call_slice(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr);
        static void engine_call_operator_set(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr);
        static void engine_call_operator_get(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr);
        static void engine_call_all(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr);
        static void engine_call_any(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr);
        static void engine_call_appendArray(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr);
        static void engine_call_back(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr);
        static void engine_call_fill(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr);
        static void engine_call_filter(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr);
        static void engine_call_getTypedClassName(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr);
        static void engine_call_getTypedScript(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr);
        static void engine_call_isReadOnly(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr);
        static void engine_call_isTyped(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr);
        static void engine_call_map(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr);
        static void engine_call_pickRandom(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr);
        static void engine_call_reduce(JNIEnv* p_raw_env, jobject p_instance, jlong p_raw_ptr);

        // clang-format off
        DECLARE_JNI_METHODS()
        // clang-format on
    };

}// namespace bridges

#endif// GODOT_JVM_VARIANT_ARRAY_BRIDGE_H
