// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ChangeTeamNameRsp.proto

package emu.grasscutter.net.proto;

public final class ChangeTeamNameRspOuterClass {
  private ChangeTeamNameRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ChangeTeamNameRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:ChangeTeamNameRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>string team_name = 2;</code>
     * @return The teamName.
     */
    java.lang.String getTeamName();
    /**
     * <code>string team_name = 2;</code>
     * @return The bytes for teamName.
     */
    com.google.protobuf.ByteString
        getTeamNameBytes();

    /**
     * <code>int32 team_id = 9;</code>
     * @return The teamId.
     */
    int getTeamId();

    /**
     * <code>int32 retcode = 10;</code>
     * @return The retcode.
     */
    int getRetcode();
  }
  /**
   * <pre>
   * Name: FIBMNIJEMKD
   * CmdId: 1664
   * </pre>
   *
   * Protobuf type {@code ChangeTeamNameRsp}
   */
  public static final class ChangeTeamNameRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:ChangeTeamNameRsp)
      ChangeTeamNameRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ChangeTeamNameRsp.newBuilder() to construct.
    private ChangeTeamNameRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ChangeTeamNameRsp() {
      teamName_ = "";
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new ChangeTeamNameRsp();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private ChangeTeamNameRsp(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 18: {
              java.lang.String s = input.readStringRequireUtf8();

              teamName_ = s;
              break;
            }
            case 72: {

              teamId_ = input.readInt32();
              break;
            }
            case 80: {

              retcode_ = input.readInt32();
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.ChangeTeamNameRspOuterClass.internal_static_ChangeTeamNameRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.ChangeTeamNameRspOuterClass.internal_static_ChangeTeamNameRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.ChangeTeamNameRspOuterClass.ChangeTeamNameRsp.class, emu.grasscutter.net.proto.ChangeTeamNameRspOuterClass.ChangeTeamNameRsp.Builder.class);
    }

    public static final int TEAM_NAME_FIELD_NUMBER = 2;
    private volatile java.lang.Object teamName_;
    /**
     * <code>string team_name = 2;</code>
     * @return The teamName.
     */
    @java.lang.Override
    public java.lang.String getTeamName() {
      java.lang.Object ref = teamName_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        teamName_ = s;
        return s;
      }
    }
    /**
     * <code>string team_name = 2;</code>
     * @return The bytes for teamName.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getTeamNameBytes() {
      java.lang.Object ref = teamName_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        teamName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int TEAM_ID_FIELD_NUMBER = 9;
    private int teamId_;
    /**
     * <code>int32 team_id = 9;</code>
     * @return The teamId.
     */
    @java.lang.Override
    public int getTeamId() {
      return teamId_;
    }

    public static final int RETCODE_FIELD_NUMBER = 10;
    private int retcode_;
    /**
     * <code>int32 retcode = 10;</code>
     * @return The retcode.
     */
    @java.lang.Override
    public int getRetcode() {
      return retcode_;
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(teamName_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, teamName_);
      }
      if (teamId_ != 0) {
        output.writeInt32(9, teamId_);
      }
      if (retcode_ != 0) {
        output.writeInt32(10, retcode_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(teamName_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, teamName_);
      }
      if (teamId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(9, teamId_);
      }
      if (retcode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(10, retcode_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof emu.grasscutter.net.proto.ChangeTeamNameRspOuterClass.ChangeTeamNameRsp)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.ChangeTeamNameRspOuterClass.ChangeTeamNameRsp other = (emu.grasscutter.net.proto.ChangeTeamNameRspOuterClass.ChangeTeamNameRsp) obj;

      if (!getTeamName()
          .equals(other.getTeamName())) return false;
      if (getTeamId()
          != other.getTeamId()) return false;
      if (getRetcode()
          != other.getRetcode()) return false;
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + TEAM_NAME_FIELD_NUMBER;
      hash = (53 * hash) + getTeamName().hashCode();
      hash = (37 * hash) + TEAM_ID_FIELD_NUMBER;
      hash = (53 * hash) + getTeamId();
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.ChangeTeamNameRspOuterClass.ChangeTeamNameRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ChangeTeamNameRspOuterClass.ChangeTeamNameRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ChangeTeamNameRspOuterClass.ChangeTeamNameRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ChangeTeamNameRspOuterClass.ChangeTeamNameRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ChangeTeamNameRspOuterClass.ChangeTeamNameRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ChangeTeamNameRspOuterClass.ChangeTeamNameRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ChangeTeamNameRspOuterClass.ChangeTeamNameRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ChangeTeamNameRspOuterClass.ChangeTeamNameRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ChangeTeamNameRspOuterClass.ChangeTeamNameRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ChangeTeamNameRspOuterClass.ChangeTeamNameRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ChangeTeamNameRspOuterClass.ChangeTeamNameRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ChangeTeamNameRspOuterClass.ChangeTeamNameRsp parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(emu.grasscutter.net.proto.ChangeTeamNameRspOuterClass.ChangeTeamNameRsp prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * <pre>
     * Name: FIBMNIJEMKD
     * CmdId: 1664
     * </pre>
     *
     * Protobuf type {@code ChangeTeamNameRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:ChangeTeamNameRsp)
        emu.grasscutter.net.proto.ChangeTeamNameRspOuterClass.ChangeTeamNameRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.ChangeTeamNameRspOuterClass.internal_static_ChangeTeamNameRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.ChangeTeamNameRspOuterClass.internal_static_ChangeTeamNameRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.ChangeTeamNameRspOuterClass.ChangeTeamNameRsp.class, emu.grasscutter.net.proto.ChangeTeamNameRspOuterClass.ChangeTeamNameRsp.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.ChangeTeamNameRspOuterClass.ChangeTeamNameRsp.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        teamName_ = "";

        teamId_ = 0;

        retcode_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.ChangeTeamNameRspOuterClass.internal_static_ChangeTeamNameRsp_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ChangeTeamNameRspOuterClass.ChangeTeamNameRsp getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.ChangeTeamNameRspOuterClass.ChangeTeamNameRsp.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ChangeTeamNameRspOuterClass.ChangeTeamNameRsp build() {
        emu.grasscutter.net.proto.ChangeTeamNameRspOuterClass.ChangeTeamNameRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ChangeTeamNameRspOuterClass.ChangeTeamNameRsp buildPartial() {
        emu.grasscutter.net.proto.ChangeTeamNameRspOuterClass.ChangeTeamNameRsp result = new emu.grasscutter.net.proto.ChangeTeamNameRspOuterClass.ChangeTeamNameRsp(this);
        result.teamName_ = teamName_;
        result.teamId_ = teamId_;
        result.retcode_ = retcode_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof emu.grasscutter.net.proto.ChangeTeamNameRspOuterClass.ChangeTeamNameRsp) {
          return mergeFrom((emu.grasscutter.net.proto.ChangeTeamNameRspOuterClass.ChangeTeamNameRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.ChangeTeamNameRspOuterClass.ChangeTeamNameRsp other) {
        if (other == emu.grasscutter.net.proto.ChangeTeamNameRspOuterClass.ChangeTeamNameRsp.getDefaultInstance()) return this;
        if (!other.getTeamName().isEmpty()) {
          teamName_ = other.teamName_;
          onChanged();
        }
        if (other.getTeamId() != 0) {
          setTeamId(other.getTeamId());
        }
        if (other.getRetcode() != 0) {
          setRetcode(other.getRetcode());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        emu.grasscutter.net.proto.ChangeTeamNameRspOuterClass.ChangeTeamNameRsp parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.ChangeTeamNameRspOuterClass.ChangeTeamNameRsp) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private java.lang.Object teamName_ = "";
      /**
       * <code>string team_name = 2;</code>
       * @return The teamName.
       */
      public java.lang.String getTeamName() {
        java.lang.Object ref = teamName_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          teamName_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string team_name = 2;</code>
       * @return The bytes for teamName.
       */
      public com.google.protobuf.ByteString
          getTeamNameBytes() {
        java.lang.Object ref = teamName_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          teamName_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string team_name = 2;</code>
       * @param value The teamName to set.
       * @return This builder for chaining.
       */
      public Builder setTeamName(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        teamName_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string team_name = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearTeamName() {
        
        teamName_ = getDefaultInstance().getTeamName();
        onChanged();
        return this;
      }
      /**
       * <code>string team_name = 2;</code>
       * @param value The bytes for teamName to set.
       * @return This builder for chaining.
       */
      public Builder setTeamNameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        teamName_ = value;
        onChanged();
        return this;
      }

      private int teamId_ ;
      /**
       * <code>int32 team_id = 9;</code>
       * @return The teamId.
       */
      @java.lang.Override
      public int getTeamId() {
        return teamId_;
      }
      /**
       * <code>int32 team_id = 9;</code>
       * @param value The teamId to set.
       * @return This builder for chaining.
       */
      public Builder setTeamId(int value) {
        
        teamId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 team_id = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearTeamId() {
        
        teamId_ = 0;
        onChanged();
        return this;
      }

      private int retcode_ ;
      /**
       * <code>int32 retcode = 10;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 10;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(int value) {
        
        retcode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearRetcode() {
        
        retcode_ = 0;
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:ChangeTeamNameRsp)
    }

    // @@protoc_insertion_point(class_scope:ChangeTeamNameRsp)
    private static final emu.grasscutter.net.proto.ChangeTeamNameRspOuterClass.ChangeTeamNameRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.ChangeTeamNameRspOuterClass.ChangeTeamNameRsp();
    }

    public static emu.grasscutter.net.proto.ChangeTeamNameRspOuterClass.ChangeTeamNameRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ChangeTeamNameRsp>
        PARSER = new com.google.protobuf.AbstractParser<ChangeTeamNameRsp>() {
      @java.lang.Override
      public ChangeTeamNameRsp parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new ChangeTeamNameRsp(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<ChangeTeamNameRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ChangeTeamNameRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.ChangeTeamNameRspOuterClass.ChangeTeamNameRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ChangeTeamNameRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ChangeTeamNameRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\027ChangeTeamNameRsp.proto\"H\n\021ChangeTeamN" +
      "ameRsp\022\021\n\tteam_name\030\002 \001(\t\022\017\n\007team_id\030\t \001" +
      "(\005\022\017\n\007retcode\030\n \001(\005B\033\n\031emu.grasscutter.n" +
      "et.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_ChangeTeamNameRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ChangeTeamNameRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ChangeTeamNameRsp_descriptor,
        new java.lang.String[] { "TeamName", "TeamId", "Retcode", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
