// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.memory.TransferContext
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

/**
 * A physics joint that connects two 3D physics bodies in a way that simulates a ball-and-socket joint.
 *
 * A physics joint that connects two 3D physics bodies in a way that simulates a ball-and-socket joint. The twist axis is initiated as the X axis of the [godot.ConeTwistJoint3D]. Once the physics bodies swing, the twist axis is calculated as the middle of the X axes of the joint in the local space of the two physics bodies. Useful for limbs like shoulders and hips, lamps hanging off a ceiling, etc.
 */
@GodotBaseType
public open class ConeTwistJoint3D : Joint3D() {
  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_CONETWISTJOINT3D, scriptIndex)
    return true
  }

  /**
   * Sets the value of the specified parameter.
   */
  public fun setParam(`param`: Param, `value`: Float): Unit {
    TransferContext.writeArguments(LONG to param.id, DOUBLE to value.toDouble())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CONETWISTJOINT3D_SET_PARAM, NIL)
  }

  /**
   * Returns the value of the specified parameter.
   */
  public fun getParam(`param`: Param): Float {
    TransferContext.writeArguments(LONG to param.id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CONETWISTJOINT3D_GET_PARAM, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  public enum class Param(
    id: Long,
  ) {
    /**
     * Swing is rotation from side to side, around the axis perpendicular to the twist axis.
     *
     * The swing span defines, how much rotation will not get corrected along the swing axis.
     *
     * Could be defined as looseness in the [godot.ConeTwistJoint3D].
     *
     * If below 0.05, this behavior is locked.
     */
    PARAM_SWING_SPAN(0),
    /**
     * Twist is the rotation around the twist axis, this value defined how far the joint can twist.
     *
     * Twist is locked if below 0.05.
     */
    PARAM_TWIST_SPAN(1),
    /**
     * The speed with which the swing or twist will take place.
     *
     * The higher, the faster.
     */
    PARAM_BIAS(2),
    /**
     * The ease with which the joint starts to twist. If it's too low, it takes more force to start twisting the joint.
     */
    PARAM_SOFTNESS(3),
    /**
     * Defines, how fast the swing- and twist-speed-difference on both sides gets synced.
     */
    PARAM_RELAXATION(4),
    /**
     * Represents the size of the [enum Param] enum.
     */
    PARAM_MAX(5),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public companion object
}
