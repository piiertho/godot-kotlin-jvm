// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.StringName
import godot.core.VariantType.BOOL
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.STRING_NAME
import godot.core.VariantType.VECTOR2
import godot.core.Vector2
import godot.core.memory.TransferContext
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmOverloads

/**
 * A state machine with multiple [godot.AnimationRootNode]s, used by [godot.AnimationTree].
 *
 * Tutorials:
 * [$DOCS_URL/tutorials/animation/animation_tree.html]($DOCS_URL/tutorials/animation/animation_tree.html)
 *
 * Contains multiple [godot.AnimationRootNode]s representing animation states, connected in a graph. State transitions can be configured to happen automatically or via code, using a shortest-path algorithm. Retrieve the [godot.AnimationNodeStateMachinePlayback] object from the [godot.AnimationTree] node to control it programmatically.
 *
 * **Example:**
 *
 * [codeblocks]
 *
 * [gdscript]
 *
 * var state_machine = $AnimationTree.get("parameters/playback")
 *
 * state_machine.travel("some_state")
 *
 * [/gdscript]
 *
 * [csharp]
 *
 * var stateMachine = GetNode<AnimationTree>("AnimationTree").Get("parameters/playback") as AnimationNodeStateMachinePlayback;
 *
 * stateMachine.Travel("some_state");
 *
 * [/csharp]
 *
 * [/codeblocks]
 */
@GodotBaseType
public open class AnimationNodeStateMachine : AnimationRootNode() {
  /**
   * This property can define the process of transitions for different use cases. See also [enum AnimationNodeStateMachine.StateMachineType].
   */
  public var stateMachineType: StateMachineType
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODESTATEMACHINE_GET_STATE_MACHINE_TYPE, LONG)
      return AnimationNodeStateMachine.StateMachineType.values()[(TransferContext.readReturnValue(LONG) as Long).toInt()]
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODESTATEMACHINE_SET_STATE_MACHINE_TYPE, NIL)
    }

  /**
   * If `true`, allows teleport to the self state with [godot.AnimationNodeStateMachinePlayback.travel]. When the reset option is enabled in [godot.AnimationNodeStateMachinePlayback.travel], the animation is restarted. If `false`, nothing happens on the teleportation to the self state.
   */
  public var allowTransitionToSelf: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODESTATEMACHINE_IS_ALLOW_TRANSITION_TO_SELF, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODESTATEMACHINE_SET_ALLOW_TRANSITION_TO_SELF, NIL)
    }

  /**
   * If `true`, treat the cross-fade to the start and end nodes as a blend with the RESET animation.
   *
   * In most cases, when additional cross-fades are performed in the parent [godot.AnimationNode] of the state machine, setting this property to `false` and matching the cross-fade time of the parent [godot.AnimationNode] and the state machine's start node and end node gives good results.
   */
  public var resetEnds: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODESTATEMACHINE_ARE_ENDS_RESET, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODESTATEMACHINE_SET_RESET_ENDS, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_ANIMATIONNODESTATEMACHINE, scriptIndex)
    return true
  }

  /**
   * Adds a new animation node to the graph. The [position] is used for display in the editor.
   */
  @JvmOverloads
  public fun addNode(
    name: StringName,
    node: AnimationNode,
    position: Vector2 = Vector2(0, 0),
  ): Unit {
    TransferContext.writeArguments(STRING_NAME to name, OBJECT to node, VECTOR2 to position)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATIONNODESTATEMACHINE_ADD_NODE,
        NIL)
  }

  /**
   *
   */
  public fun replaceNode(name: StringName, node: AnimationNode): Unit {
    TransferContext.writeArguments(STRING_NAME to name, OBJECT to node)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATIONNODESTATEMACHINE_REPLACE_NODE, NIL)
  }

  /**
   * Returns the animation node with the given name.
   */
  public fun getNode(name: StringName): AnimationNode? {
    TransferContext.writeArguments(STRING_NAME to name)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATIONNODESTATEMACHINE_GET_NODE,
        OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as AnimationNode?)
  }

  /**
   * Deletes the given animation node from the graph.
   */
  public fun removeNode(name: StringName): Unit {
    TransferContext.writeArguments(STRING_NAME to name)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATIONNODESTATEMACHINE_REMOVE_NODE, NIL)
  }

  /**
   * Renames the given animation node.
   */
  public fun renameNode(name: StringName, newName: StringName): Unit {
    TransferContext.writeArguments(STRING_NAME to name, STRING_NAME to newName)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATIONNODESTATEMACHINE_RENAME_NODE, NIL)
  }

  /**
   * Returns `true` if the graph contains the given animation node.
   */
  public fun hasNode(name: StringName): Boolean {
    TransferContext.writeArguments(STRING_NAME to name)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATIONNODESTATEMACHINE_HAS_NODE,
        BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Returns the given animation node's name.
   */
  public fun getNodeName(node: AnimationNode): StringName {
    TransferContext.writeArguments(OBJECT to node)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATIONNODESTATEMACHINE_GET_NODE_NAME, STRING_NAME)
    return (TransferContext.readReturnValue(STRING_NAME, false) as StringName)
  }

  /**
   * Sets the animation node's coordinates. Used for display in the editor.
   */
  public fun setNodePosition(name: StringName, position: Vector2): Unit {
    TransferContext.writeArguments(STRING_NAME to name, VECTOR2 to position)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATIONNODESTATEMACHINE_SET_NODE_POSITION, NIL)
  }

  /**
   * Returns the given animation node's coordinates. Used for display in the editor.
   */
  public fun getNodePosition(name: StringName): Vector2 {
    TransferContext.writeArguments(STRING_NAME to name)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATIONNODESTATEMACHINE_GET_NODE_POSITION, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
  }

  /**
   * Returns `true` if there is a transition between the given animation nodes.
   */
  public fun hasTransition(from: StringName, to: StringName): Boolean {
    TransferContext.writeArguments(STRING_NAME to from, STRING_NAME to to)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATIONNODESTATEMACHINE_HAS_TRANSITION, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Adds a transition between the given animation nodes.
   */
  public fun addTransition(
    from: StringName,
    to: StringName,
    transition: AnimationNodeStateMachineTransition,
  ): Unit {
    TransferContext.writeArguments(STRING_NAME to from, STRING_NAME to to, OBJECT to transition)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATIONNODESTATEMACHINE_ADD_TRANSITION, NIL)
  }

  /**
   * Returns the given transition.
   */
  public fun getTransition(idx: Int): AnimationNodeStateMachineTransition? {
    TransferContext.writeArguments(LONG to idx.toLong())
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATIONNODESTATEMACHINE_GET_TRANSITION, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as AnimationNodeStateMachineTransition?)
  }

  /**
   * Returns the given transition's start node.
   */
  public fun getTransitionFrom(idx: Int): StringName {
    TransferContext.writeArguments(LONG to idx.toLong())
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATIONNODESTATEMACHINE_GET_TRANSITION_FROM, STRING_NAME)
    return (TransferContext.readReturnValue(STRING_NAME, false) as StringName)
  }

  /**
   * Returns the given transition's end node.
   */
  public fun getTransitionTo(idx: Int): StringName {
    TransferContext.writeArguments(LONG to idx.toLong())
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATIONNODESTATEMACHINE_GET_TRANSITION_TO, STRING_NAME)
    return (TransferContext.readReturnValue(STRING_NAME, false) as StringName)
  }

  /**
   * Returns the number of connections in the graph.
   */
  public fun getTransitionCount(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATIONNODESTATEMACHINE_GET_TRANSITION_COUNT, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Deletes the given transition by index.
   */
  public fun removeTransitionByIndex(idx: Int): Unit {
    TransferContext.writeArguments(LONG to idx.toLong())
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATIONNODESTATEMACHINE_REMOVE_TRANSITION_BY_INDEX, NIL)
  }

  /**
   * Deletes the transition between the two specified animation nodes.
   */
  public fun removeTransition(from: StringName, to: StringName): Unit {
    TransferContext.writeArguments(STRING_NAME to from, STRING_NAME to to)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATIONNODESTATEMACHINE_REMOVE_TRANSITION, NIL)
  }

  /**
   * Sets the draw offset of the graph. Used for display in the editor.
   */
  public fun setGraphOffset(offset: Vector2): Unit {
    TransferContext.writeArguments(VECTOR2 to offset)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATIONNODESTATEMACHINE_SET_GRAPH_OFFSET, NIL)
  }

  /**
   * Returns the draw offset of the graph. Used for display in the editor.
   */
  public fun getGraphOffset(): Vector2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATIONNODESTATEMACHINE_GET_GRAPH_OFFSET, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
  }

  public enum class StateMachineType(
    id: Long,
  ) {
    /**
     * Seeking to the beginning is treated as playing from the start state. Transition to the end state is treated as exiting the state machine.
     */
    STATE_MACHINE_TYPE_ROOT(0),
    /**
     * Seeking to the beginning is treated as seeking to the beginning of the animation in the current state. Transition to the end state, or the absence of transitions in each state, is treated as exiting the state machine.
     */
    STATE_MACHINE_TYPE_NESTED(1),
    /**
     * This is a grouped state machine that can be controlled from a parent state machine. It does not work on standalone. There must be a state machine with [stateMachineType] of [STATE_MACHINE_TYPE_ROOT] or [STATE_MACHINE_TYPE_NESTED] in the parent or ancestor.
     */
    STATE_MACHINE_TYPE_GROUPED(2),
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
