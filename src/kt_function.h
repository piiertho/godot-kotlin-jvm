#ifndef GODOT_JVM_KT_FUNCTION_H
#define GODOT_JVM_KT_FUNCTION_H

#include "java_instance_wrapper.h"
#include "kt_object.h"
#include "kt_property.h"
#include "kt_rpc_config.h"

struct KtFunctionInfo : public JavaInstanceWrapper {
    KtFunctionInfo(jni::JObject p_wrapped);
    ~KtFunctionInfo();

    String name;
    List<KtPropertyInfo*> arguments;
    KtPropertyInfo* return_val;
    KtRpcConfig* rpc_config;

    MethodInfo to_method_info() const;

    // clang-format off
    DECLARE_JNI_METHODS(
            JNI_METHOD(GET_NAME, "getName", "()Ljava/lang/String;")
            JNI_METHOD(GET_ARGUMENTS, "getArguments", "()[Lgodot/core/KtPropertyInfo;")
            JNI_METHOD(GET_RETURN_VAL, "getReturnVal", "()Lgodot/core/KtPropertyInfo;")
            JNI_METHOD(GET_RPC_CONFIG, "getRpcConfig", "()Lgodot/core/KtRpcConfig;")
    )
    // clang-format on
};

class KtFunction : public JavaInstanceWrapper {
private:
    int parameter_count;
    KtFunctionInfo* method_info;

public:
    KtFunction(jni::JObject p_wrapped);
    ~KtFunction();

    StringName get_name() const;
    int get_parameter_count() const;
    KtRpcConfig* get_rpc_config() const;

    MethodInfo get_member_info();
    KtFunctionInfo* get_kt_function_info();

    void invoke(const KtObject* instance, const Variant** p_args, int args_count, Variant& r_ret);

    // clang-format off
    DECLARE_JNI_METHODS(
            JNI_METHOD(GET_FUNCTION_INFO, "getFunctionInfo", "()Lgodot/core/KtFunctionInfo;")
            JNI_METHOD(GET_PARAMETER_COUNT, "getParameterCount", "()I")
            JNI_METHOD(INVOKE, "invoke", "(Lgodot/core/KtObject;)V")
    )
    // clang-format on
};

#endif// GODOT_JVM_KT_FUNCTION_H
