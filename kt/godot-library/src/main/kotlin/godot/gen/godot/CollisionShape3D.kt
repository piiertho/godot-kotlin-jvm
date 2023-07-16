// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.VariantType.BOOL
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.memory.TransferContext
import kotlin.Boolean
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit

/**
 * A node that provides a [godot.Shape3D] to a [godot.CollisionObject3D] parent.
 *
 * Tutorials:
 * [https://godotengine.org/asset-library/asset/678](https://godotengine.org/asset-library/asset/678)
 *
 * A node that provides a [godot.Shape3D] to a [godot.CollisionObject3D] parent and allows to edit it. This can give a detection shape to an [godot.Area3D] or turn a [godot.PhysicsBody3D] into a solid object.
 *
 * **Warning:** A non-uniformly scaled [godot.CollisionShape3D] will likely not behave as expected. Make sure to keep its scale the same on all axes and adjust its [shape] resource instead.
 */
@GodotBaseType
public open class CollisionShape3D : Node3D() {
  /**
   * The actual shape owned by this collision shape.
   */
  public var shape: Shape3D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_COLLISIONSHAPE3D_GET_SHAPE,
          OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Shape3D?)
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_COLLISIONSHAPE3D_SET_SHAPE, NIL)
    }

  /**
   * A disabled collision shape has no effect in the world.
   */
  public var disabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_COLLISIONSHAPE3D_IS_DISABLED,
          BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_COLLISIONSHAPE3D_SET_DISABLED,
          NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_COLLISIONSHAPE3D, scriptIndex)
    return true
  }

  /**
   * If this method exists within a script it will be called whenever the shape resource has been modified.
   */
  public fun resourceChanged(resource: Resource): Unit {
    TransferContext.writeArguments(OBJECT to resource)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_COLLISIONSHAPE3D_RESOURCE_CHANGED,
        NIL)
  }

  /**
   * Sets the collision shape's shape to the addition of all its convexed [godot.MeshInstance3D] siblings geometry.
   */
  public fun makeConvexFromSiblings(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_COLLISIONSHAPE3D_MAKE_CONVEX_FROM_SIBLINGS, NIL)
  }

  public companion object
}
