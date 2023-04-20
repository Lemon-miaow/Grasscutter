// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: MotionState.proto

package emu.grasscutter.net.proto;

public final class MotionStateOuterClass {
  private MotionStateOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  /**
   * <pre>
   * Name: KKAMMHDBPKH
   * </pre>
   *
   * Protobuf enum {@code MotionState}
   */
  public enum MotionState
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>MOTION_STATE_NONE = 0;</code>
     */
    MOTION_STATE_NONE(0),
    /**
     * <code>MOTION_STATE_RESET = 1;</code>
     */
    MOTION_STATE_RESET(1),
    /**
     * <code>MOTION_STATE_STANDBY = 2;</code>
     */
    MOTION_STATE_STANDBY(2),
    /**
     * <code>MOTION_STATE_STANDBY_MOVE = 3;</code>
     */
    MOTION_STATE_STANDBY_MOVE(3),
    /**
     * <code>MOTION_STATE_WALK = 4;</code>
     */
    MOTION_STATE_WALK(4),
    /**
     * <code>MOTION_STATE_RUN = 5;</code>
     */
    MOTION_STATE_RUN(5),
    /**
     * <code>MOTION_STATE_DASH = 6;</code>
     */
    MOTION_STATE_DASH(6),
    /**
     * <code>MOTION_STATE_CLIMB = 7;</code>
     */
    MOTION_STATE_CLIMB(7),
    /**
     * <code>MOTION_STATE_CLIMB_JUMP = 8;</code>
     */
    MOTION_STATE_CLIMB_JUMP(8),
    /**
     * <code>MOTION_STATE_STANDBY_TO_CLIMB = 9;</code>
     */
    MOTION_STATE_STANDBY_TO_CLIMB(9),
    /**
     * <code>MOTION_STATE_FIGHT = 10;</code>
     */
    MOTION_STATE_FIGHT(10),
    /**
     * <code>MOTION_STATE_JUMP = 11;</code>
     */
    MOTION_STATE_JUMP(11),
    /**
     * <code>MOTION_STATE_DROP = 12;</code>
     */
    MOTION_STATE_DROP(12),
    /**
     * <code>MOTION_STATE_FLY = 13;</code>
     */
    MOTION_STATE_FLY(13),
    /**
     * <code>MOTION_STATE_SWIM_MOVE = 14;</code>
     */
    MOTION_STATE_SWIM_MOVE(14),
    /**
     * <code>MOTION_STATE_SWIM_IDLE = 15;</code>
     */
    MOTION_STATE_SWIM_IDLE(15),
    /**
     * <code>MOTION_STATE_SWIM_DASH = 16;</code>
     */
    MOTION_STATE_SWIM_DASH(16),
    /**
     * <code>MOTION_STATE_SWIM_JUMP = 17;</code>
     */
    MOTION_STATE_SWIM_JUMP(17),
    /**
     * <code>MOTION_STATE_SLIP = 18;</code>
     */
    MOTION_STATE_SLIP(18),
    /**
     * <code>MOTION_STATE_GO_UPSTAIRS = 19;</code>
     */
    MOTION_STATE_GO_UPSTAIRS(19),
    /**
     * <code>MOTION_STATE_FALL_ON_GROUND = 20;</code>
     */
    MOTION_STATE_FALL_ON_GROUND(20),
    /**
     * <code>MOTION_STATE_JUMP_UP_WALL_FOR_STANDBY = 21;</code>
     */
    MOTION_STATE_JUMP_UP_WALL_FOR_STANDBY(21),
    /**
     * <code>MOTION_STATE_JUMP_OFF_WALL = 22;</code>
     */
    MOTION_STATE_JUMP_OFF_WALL(22),
    /**
     * <code>MOTION_STATE_POWERED_FLY = 23;</code>
     */
    MOTION_STATE_POWERED_FLY(23),
    /**
     * <code>MOTION_STATE_LADDER_IDLE = 24;</code>
     */
    MOTION_STATE_LADDER_IDLE(24),
    /**
     * <code>MOTION_STATE_LADDER_MOVE = 25;</code>
     */
    MOTION_STATE_LADDER_MOVE(25),
    /**
     * <code>MOTION_STATE_LADDER_SLIP = 26;</code>
     */
    MOTION_STATE_LADDER_SLIP(26),
    /**
     * <code>MOTION_STATE_STANDBY_TO_LADDER = 27;</code>
     */
    MOTION_STATE_STANDBY_TO_LADDER(27),
    /**
     * <code>MOTION_STATE_LADDER_TO_STANDBY = 28;</code>
     */
    MOTION_STATE_LADDER_TO_STANDBY(28),
    /**
     * <code>MOTION_STATE_DANGER_STANDBY = 29;</code>
     */
    MOTION_STATE_DANGER_STANDBY(29),
    /**
     * <code>MOTION_STATE_DANGER_STANDBY_MOVE = 30;</code>
     */
    MOTION_STATE_DANGER_STANDBY_MOVE(30),
    /**
     * <code>MOTION_STATE_DANGER_WALK = 31;</code>
     */
    MOTION_STATE_DANGER_WALK(31),
    /**
     * <code>MOTION_STATE_DANGER_RUN = 32;</code>
     */
    MOTION_STATE_DANGER_RUN(32),
    /**
     * <code>MOTION_STATE_DANGER_DASH = 33;</code>
     */
    MOTION_STATE_DANGER_DASH(33),
    /**
     * <code>MOTION_STATE_CROUCH_IDLE = 34;</code>
     */
    MOTION_STATE_CROUCH_IDLE(34),
    /**
     * <code>MOTION_STATE_CROUCH_MOVE = 35;</code>
     */
    MOTION_STATE_CROUCH_MOVE(35),
    /**
     * <code>MOTION_STATE_CROUCH_ROLL = 36;</code>
     */
    MOTION_STATE_CROUCH_ROLL(36),
    /**
     * <code>MOTION_STATE_NOTIFY = 37;</code>
     */
    MOTION_STATE_NOTIFY(37),
    /**
     * <code>MOTION_STATE_LAND_SPEED = 38;</code>
     */
    MOTION_STATE_LAND_SPEED(38),
    /**
     * <code>MOTION_STATE_MOVE_FAIL_ACK = 39;</code>
     */
    MOTION_STATE_MOVE_FAIL_ACK(39),
    /**
     * <code>MOTION_STATE_WATERFALL = 40;</code>
     */
    MOTION_STATE_WATERFALL(40),
    /**
     * <code>MOTION_STATE_DASH_BEFORE_SHAKE = 41;</code>
     */
    MOTION_STATE_DASH_BEFORE_SHAKE(41),
    /**
     * <code>MOTION_STATE_SIT_IDLE = 42;</code>
     */
    MOTION_STATE_SIT_IDLE(42),
    /**
     * <code>MOTION_STATE_FORCE_SET_POS = 43;</code>
     */
    MOTION_STATE_FORCE_SET_POS(43),
    /**
     * <code>MOTION_STATE_QUEST_FORCE_DRAG = 44;</code>
     */
    MOTION_STATE_QUEST_FORCE_DRAG(44),
    /**
     * <code>MOTION_STATE_FOLLOW_ROUTE = 45;</code>
     */
    MOTION_STATE_FOLLOW_ROUTE(45),
    /**
     * <code>MOTION_STATE_SKIFF_BOARDING = 46;</code>
     */
    MOTION_STATE_SKIFF_BOARDING(46),
    /**
     * <code>MOTION_STATE_SKIFF_NORMAL = 47;</code>
     */
    MOTION_STATE_SKIFF_NORMAL(47),
    /**
     * <code>MOTION_STATE_SKIFF_DASH = 48;</code>
     */
    MOTION_STATE_SKIFF_DASH(48),
    /**
     * <code>MOTION_STATE_SKIFF_POWERED_DASH = 49;</code>
     */
    MOTION_STATE_SKIFF_POWERED_DASH(49),
    /**
     * <code>MOTION_STATE_DESTROY_VEHICLE = 50;</code>
     */
    MOTION_STATE_DESTROY_VEHICLE(50),
    /**
     * <code>MOTION_STATE_FLY_IDLE = 51;</code>
     */
    MOTION_STATE_FLY_IDLE(51),
    /**
     * <code>MOTION_STATE_FLY_SLOW = 52;</code>
     */
    MOTION_STATE_FLY_SLOW(52),
    /**
     * <code>MOTION_STATE_FLY_FAST = 53;</code>
     */
    MOTION_STATE_FLY_FAST(53),
    /**
     * <code>MOTION_STATE_AIM_MOVE = 54;</code>
     */
    MOTION_STATE_AIM_MOVE(54),
    /**
     * <code>MOTION_STATE_AIR_COMPENSATION = 55;</code>
     */
    MOTION_STATE_AIR_COMPENSATION(55),
    /**
     * <code>MOTION_STATE_NUM = 56;</code>
     */
    MOTION_STATE_NUM(56),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>MOTION_STATE_NONE = 0;</code>
     */
    public static final int MOTION_STATE_NONE_VALUE = 0;
    /**
     * <code>MOTION_STATE_RESET = 1;</code>
     */
    public static final int MOTION_STATE_RESET_VALUE = 1;
    /**
     * <code>MOTION_STATE_STANDBY = 2;</code>
     */
    public static final int MOTION_STATE_STANDBY_VALUE = 2;
    /**
     * <code>MOTION_STATE_STANDBY_MOVE = 3;</code>
     */
    public static final int MOTION_STATE_STANDBY_MOVE_VALUE = 3;
    /**
     * <code>MOTION_STATE_WALK = 4;</code>
     */
    public static final int MOTION_STATE_WALK_VALUE = 4;
    /**
     * <code>MOTION_STATE_RUN = 5;</code>
     */
    public static final int MOTION_STATE_RUN_VALUE = 5;
    /**
     * <code>MOTION_STATE_DASH = 6;</code>
     */
    public static final int MOTION_STATE_DASH_VALUE = 6;
    /**
     * <code>MOTION_STATE_CLIMB = 7;</code>
     */
    public static final int MOTION_STATE_CLIMB_VALUE = 7;
    /**
     * <code>MOTION_STATE_CLIMB_JUMP = 8;</code>
     */
    public static final int MOTION_STATE_CLIMB_JUMP_VALUE = 8;
    /**
     * <code>MOTION_STATE_STANDBY_TO_CLIMB = 9;</code>
     */
    public static final int MOTION_STATE_STANDBY_TO_CLIMB_VALUE = 9;
    /**
     * <code>MOTION_STATE_FIGHT = 10;</code>
     */
    public static final int MOTION_STATE_FIGHT_VALUE = 10;
    /**
     * <code>MOTION_STATE_JUMP = 11;</code>
     */
    public static final int MOTION_STATE_JUMP_VALUE = 11;
    /**
     * <code>MOTION_STATE_DROP = 12;</code>
     */
    public static final int MOTION_STATE_DROP_VALUE = 12;
    /**
     * <code>MOTION_STATE_FLY = 13;</code>
     */
    public static final int MOTION_STATE_FLY_VALUE = 13;
    /**
     * <code>MOTION_STATE_SWIM_MOVE = 14;</code>
     */
    public static final int MOTION_STATE_SWIM_MOVE_VALUE = 14;
    /**
     * <code>MOTION_STATE_SWIM_IDLE = 15;</code>
     */
    public static final int MOTION_STATE_SWIM_IDLE_VALUE = 15;
    /**
     * <code>MOTION_STATE_SWIM_DASH = 16;</code>
     */
    public static final int MOTION_STATE_SWIM_DASH_VALUE = 16;
    /**
     * <code>MOTION_STATE_SWIM_JUMP = 17;</code>
     */
    public static final int MOTION_STATE_SWIM_JUMP_VALUE = 17;
    /**
     * <code>MOTION_STATE_SLIP = 18;</code>
     */
    public static final int MOTION_STATE_SLIP_VALUE = 18;
    /**
     * <code>MOTION_STATE_GO_UPSTAIRS = 19;</code>
     */
    public static final int MOTION_STATE_GO_UPSTAIRS_VALUE = 19;
    /**
     * <code>MOTION_STATE_FALL_ON_GROUND = 20;</code>
     */
    public static final int MOTION_STATE_FALL_ON_GROUND_VALUE = 20;
    /**
     * <code>MOTION_STATE_JUMP_UP_WALL_FOR_STANDBY = 21;</code>
     */
    public static final int MOTION_STATE_JUMP_UP_WALL_FOR_STANDBY_VALUE = 21;
    /**
     * <code>MOTION_STATE_JUMP_OFF_WALL = 22;</code>
     */
    public static final int MOTION_STATE_JUMP_OFF_WALL_VALUE = 22;
    /**
     * <code>MOTION_STATE_POWERED_FLY = 23;</code>
     */
    public static final int MOTION_STATE_POWERED_FLY_VALUE = 23;
    /**
     * <code>MOTION_STATE_LADDER_IDLE = 24;</code>
     */
    public static final int MOTION_STATE_LADDER_IDLE_VALUE = 24;
    /**
     * <code>MOTION_STATE_LADDER_MOVE = 25;</code>
     */
    public static final int MOTION_STATE_LADDER_MOVE_VALUE = 25;
    /**
     * <code>MOTION_STATE_LADDER_SLIP = 26;</code>
     */
    public static final int MOTION_STATE_LADDER_SLIP_VALUE = 26;
    /**
     * <code>MOTION_STATE_STANDBY_TO_LADDER = 27;</code>
     */
    public static final int MOTION_STATE_STANDBY_TO_LADDER_VALUE = 27;
    /**
     * <code>MOTION_STATE_LADDER_TO_STANDBY = 28;</code>
     */
    public static final int MOTION_STATE_LADDER_TO_STANDBY_VALUE = 28;
    /**
     * <code>MOTION_STATE_DANGER_STANDBY = 29;</code>
     */
    public static final int MOTION_STATE_DANGER_STANDBY_VALUE = 29;
    /**
     * <code>MOTION_STATE_DANGER_STANDBY_MOVE = 30;</code>
     */
    public static final int MOTION_STATE_DANGER_STANDBY_MOVE_VALUE = 30;
    /**
     * <code>MOTION_STATE_DANGER_WALK = 31;</code>
     */
    public static final int MOTION_STATE_DANGER_WALK_VALUE = 31;
    /**
     * <code>MOTION_STATE_DANGER_RUN = 32;</code>
     */
    public static final int MOTION_STATE_DANGER_RUN_VALUE = 32;
    /**
     * <code>MOTION_STATE_DANGER_DASH = 33;</code>
     */
    public static final int MOTION_STATE_DANGER_DASH_VALUE = 33;
    /**
     * <code>MOTION_STATE_CROUCH_IDLE = 34;</code>
     */
    public static final int MOTION_STATE_CROUCH_IDLE_VALUE = 34;
    /**
     * <code>MOTION_STATE_CROUCH_MOVE = 35;</code>
     */
    public static final int MOTION_STATE_CROUCH_MOVE_VALUE = 35;
    /**
     * <code>MOTION_STATE_CROUCH_ROLL = 36;</code>
     */
    public static final int MOTION_STATE_CROUCH_ROLL_VALUE = 36;
    /**
     * <code>MOTION_STATE_NOTIFY = 37;</code>
     */
    public static final int MOTION_STATE_NOTIFY_VALUE = 37;
    /**
     * <code>MOTION_STATE_LAND_SPEED = 38;</code>
     */
    public static final int MOTION_STATE_LAND_SPEED_VALUE = 38;
    /**
     * <code>MOTION_STATE_MOVE_FAIL_ACK = 39;</code>
     */
    public static final int MOTION_STATE_MOVE_FAIL_ACK_VALUE = 39;
    /**
     * <code>MOTION_STATE_WATERFALL = 40;</code>
     */
    public static final int MOTION_STATE_WATERFALL_VALUE = 40;
    /**
     * <code>MOTION_STATE_DASH_BEFORE_SHAKE = 41;</code>
     */
    public static final int MOTION_STATE_DASH_BEFORE_SHAKE_VALUE = 41;
    /**
     * <code>MOTION_STATE_SIT_IDLE = 42;</code>
     */
    public static final int MOTION_STATE_SIT_IDLE_VALUE = 42;
    /**
     * <code>MOTION_STATE_FORCE_SET_POS = 43;</code>
     */
    public static final int MOTION_STATE_FORCE_SET_POS_VALUE = 43;
    /**
     * <code>MOTION_STATE_QUEST_FORCE_DRAG = 44;</code>
     */
    public static final int MOTION_STATE_QUEST_FORCE_DRAG_VALUE = 44;
    /**
     * <code>MOTION_STATE_FOLLOW_ROUTE = 45;</code>
     */
    public static final int MOTION_STATE_FOLLOW_ROUTE_VALUE = 45;
    /**
     * <code>MOTION_STATE_SKIFF_BOARDING = 46;</code>
     */
    public static final int MOTION_STATE_SKIFF_BOARDING_VALUE = 46;
    /**
     * <code>MOTION_STATE_SKIFF_NORMAL = 47;</code>
     */
    public static final int MOTION_STATE_SKIFF_NORMAL_VALUE = 47;
    /**
     * <code>MOTION_STATE_SKIFF_DASH = 48;</code>
     */
    public static final int MOTION_STATE_SKIFF_DASH_VALUE = 48;
    /**
     * <code>MOTION_STATE_SKIFF_POWERED_DASH = 49;</code>
     */
    public static final int MOTION_STATE_SKIFF_POWERED_DASH_VALUE = 49;
    /**
     * <code>MOTION_STATE_DESTROY_VEHICLE = 50;</code>
     */
    public static final int MOTION_STATE_DESTROY_VEHICLE_VALUE = 50;
    /**
     * <code>MOTION_STATE_FLY_IDLE = 51;</code>
     */
    public static final int MOTION_STATE_FLY_IDLE_VALUE = 51;
    /**
     * <code>MOTION_STATE_FLY_SLOW = 52;</code>
     */
    public static final int MOTION_STATE_FLY_SLOW_VALUE = 52;
    /**
     * <code>MOTION_STATE_FLY_FAST = 53;</code>
     */
    public static final int MOTION_STATE_FLY_FAST_VALUE = 53;
    /**
     * <code>MOTION_STATE_AIM_MOVE = 54;</code>
     */
    public static final int MOTION_STATE_AIM_MOVE_VALUE = 54;
    /**
     * <code>MOTION_STATE_AIR_COMPENSATION = 55;</code>
     */
    public static final int MOTION_STATE_AIR_COMPENSATION_VALUE = 55;
    /**
     * <code>MOTION_STATE_NUM = 56;</code>
     */
    public static final int MOTION_STATE_NUM_VALUE = 56;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static MotionState valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static MotionState forNumber(int value) {
      switch (value) {
        case 0: return MOTION_STATE_NONE;
        case 1: return MOTION_STATE_RESET;
        case 2: return MOTION_STATE_STANDBY;
        case 3: return MOTION_STATE_STANDBY_MOVE;
        case 4: return MOTION_STATE_WALK;
        case 5: return MOTION_STATE_RUN;
        case 6: return MOTION_STATE_DASH;
        case 7: return MOTION_STATE_CLIMB;
        case 8: return MOTION_STATE_CLIMB_JUMP;
        case 9: return MOTION_STATE_STANDBY_TO_CLIMB;
        case 10: return MOTION_STATE_FIGHT;
        case 11: return MOTION_STATE_JUMP;
        case 12: return MOTION_STATE_DROP;
        case 13: return MOTION_STATE_FLY;
        case 14: return MOTION_STATE_SWIM_MOVE;
        case 15: return MOTION_STATE_SWIM_IDLE;
        case 16: return MOTION_STATE_SWIM_DASH;
        case 17: return MOTION_STATE_SWIM_JUMP;
        case 18: return MOTION_STATE_SLIP;
        case 19: return MOTION_STATE_GO_UPSTAIRS;
        case 20: return MOTION_STATE_FALL_ON_GROUND;
        case 21: return MOTION_STATE_JUMP_UP_WALL_FOR_STANDBY;
        case 22: return MOTION_STATE_JUMP_OFF_WALL;
        case 23: return MOTION_STATE_POWERED_FLY;
        case 24: return MOTION_STATE_LADDER_IDLE;
        case 25: return MOTION_STATE_LADDER_MOVE;
        case 26: return MOTION_STATE_LADDER_SLIP;
        case 27: return MOTION_STATE_STANDBY_TO_LADDER;
        case 28: return MOTION_STATE_LADDER_TO_STANDBY;
        case 29: return MOTION_STATE_DANGER_STANDBY;
        case 30: return MOTION_STATE_DANGER_STANDBY_MOVE;
        case 31: return MOTION_STATE_DANGER_WALK;
        case 32: return MOTION_STATE_DANGER_RUN;
        case 33: return MOTION_STATE_DANGER_DASH;
        case 34: return MOTION_STATE_CROUCH_IDLE;
        case 35: return MOTION_STATE_CROUCH_MOVE;
        case 36: return MOTION_STATE_CROUCH_ROLL;
        case 37: return MOTION_STATE_NOTIFY;
        case 38: return MOTION_STATE_LAND_SPEED;
        case 39: return MOTION_STATE_MOVE_FAIL_ACK;
        case 40: return MOTION_STATE_WATERFALL;
        case 41: return MOTION_STATE_DASH_BEFORE_SHAKE;
        case 42: return MOTION_STATE_SIT_IDLE;
        case 43: return MOTION_STATE_FORCE_SET_POS;
        case 44: return MOTION_STATE_QUEST_FORCE_DRAG;
        case 45: return MOTION_STATE_FOLLOW_ROUTE;
        case 46: return MOTION_STATE_SKIFF_BOARDING;
        case 47: return MOTION_STATE_SKIFF_NORMAL;
        case 48: return MOTION_STATE_SKIFF_DASH;
        case 49: return MOTION_STATE_SKIFF_POWERED_DASH;
        case 50: return MOTION_STATE_DESTROY_VEHICLE;
        case 51: return MOTION_STATE_FLY_IDLE;
        case 52: return MOTION_STATE_FLY_SLOW;
        case 53: return MOTION_STATE_FLY_FAST;
        case 54: return MOTION_STATE_AIM_MOVE;
        case 55: return MOTION_STATE_AIR_COMPENSATION;
        case 56: return MOTION_STATE_NUM;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<MotionState>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        MotionState> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<MotionState>() {
            public MotionState findValueByNumber(int number) {
              return MotionState.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalStateException(
            "Can't get the descriptor of an unrecognized enum value.");
      }
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.MotionStateOuterClass.getDescriptor().getEnumTypes().get(0);
    }

    private static final MotionState[] VALUES = values();

    public static MotionState valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private MotionState(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:MotionState)
  }


  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021MotionState.proto*\224\r\n\013MotionState\022\025\n\021M" +
      "OTION_STATE_NONE\020\000\022\026\n\022MOTION_STATE_RESET" +
      "\020\001\022\030\n\024MOTION_STATE_STANDBY\020\002\022\035\n\031MOTION_S" +
      "TATE_STANDBY_MOVE\020\003\022\025\n\021MOTION_STATE_WALK" +
      "\020\004\022\024\n\020MOTION_STATE_RUN\020\005\022\025\n\021MOTION_STATE" +
      "_DASH\020\006\022\026\n\022MOTION_STATE_CLIMB\020\007\022\033\n\027MOTIO" +
      "N_STATE_CLIMB_JUMP\020\010\022!\n\035MOTION_STATE_STA" +
      "NDBY_TO_CLIMB\020\t\022\026\n\022MOTION_STATE_FIGHT\020\n\022" +
      "\025\n\021MOTION_STATE_JUMP\020\013\022\025\n\021MOTION_STATE_D" +
      "ROP\020\014\022\024\n\020MOTION_STATE_FLY\020\r\022\032\n\026MOTION_ST" +
      "ATE_SWIM_MOVE\020\016\022\032\n\026MOTION_STATE_SWIM_IDL" +
      "E\020\017\022\032\n\026MOTION_STATE_SWIM_DASH\020\020\022\032\n\026MOTIO" +
      "N_STATE_SWIM_JUMP\020\021\022\025\n\021MOTION_STATE_SLIP" +
      "\020\022\022\034\n\030MOTION_STATE_GO_UPSTAIRS\020\023\022\037\n\033MOTI" +
      "ON_STATE_FALL_ON_GROUND\020\024\022)\n%MOTION_STAT" +
      "E_JUMP_UP_WALL_FOR_STANDBY\020\025\022\036\n\032MOTION_S" +
      "TATE_JUMP_OFF_WALL\020\026\022\034\n\030MOTION_STATE_POW" +
      "ERED_FLY\020\027\022\034\n\030MOTION_STATE_LADDER_IDLE\020\030" +
      "\022\034\n\030MOTION_STATE_LADDER_MOVE\020\031\022\034\n\030MOTION" +
      "_STATE_LADDER_SLIP\020\032\022\"\n\036MOTION_STATE_STA" +
      "NDBY_TO_LADDER\020\033\022\"\n\036MOTION_STATE_LADDER_" +
      "TO_STANDBY\020\034\022\037\n\033MOTION_STATE_DANGER_STAN" +
      "DBY\020\035\022$\n MOTION_STATE_DANGER_STANDBY_MOV" +
      "E\020\036\022\034\n\030MOTION_STATE_DANGER_WALK\020\037\022\033\n\027MOT" +
      "ION_STATE_DANGER_RUN\020 \022\034\n\030MOTION_STATE_D" +
      "ANGER_DASH\020!\022\034\n\030MOTION_STATE_CROUCH_IDLE" +
      "\020\"\022\034\n\030MOTION_STATE_CROUCH_MOVE\020#\022\034\n\030MOTI" +
      "ON_STATE_CROUCH_ROLL\020$\022\027\n\023MOTION_STATE_N" +
      "OTIFY\020%\022\033\n\027MOTION_STATE_LAND_SPEED\020&\022\036\n\032" +
      "MOTION_STATE_MOVE_FAIL_ACK\020\'\022\032\n\026MOTION_S" +
      "TATE_WATERFALL\020(\022\"\n\036MOTION_STATE_DASH_BE" +
      "FORE_SHAKE\020)\022\031\n\025MOTION_STATE_SIT_IDLE\020*\022" +
      "\036\n\032MOTION_STATE_FORCE_SET_POS\020+\022!\n\035MOTIO" +
      "N_STATE_QUEST_FORCE_DRAG\020,\022\035\n\031MOTION_STA" +
      "TE_FOLLOW_ROUTE\020-\022\037\n\033MOTION_STATE_SKIFF_" +
      "BOARDING\020.\022\035\n\031MOTION_STATE_SKIFF_NORMAL\020" +
      "/\022\033\n\027MOTION_STATE_SKIFF_DASH\0200\022#\n\037MOTION" +
      "_STATE_SKIFF_POWERED_DASH\0201\022 \n\034MOTION_ST" +
      "ATE_DESTROY_VEHICLE\0202\022\031\n\025MOTION_STATE_FL" +
      "Y_IDLE\0203\022\031\n\025MOTION_STATE_FLY_SLOW\0204\022\031\n\025M" +
      "OTION_STATE_FLY_FAST\0205\022\031\n\025MOTION_STATE_A" +
      "IM_MOVE\0206\022!\n\035MOTION_STATE_AIR_COMPENSATI" +
      "ON\0207\022\024\n\020MOTION_STATE_NUM\0208B\033\n\031emu.grassc" +
      "utter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
