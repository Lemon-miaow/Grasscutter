// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: AvatarSatiationDataNotify.proto

package emu.grasscutter.net.proto;

public final class AvatarSatiationDataNotifyOuterClass {
  private AvatarSatiationDataNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface AvatarSatiationDataNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:AvatarSatiationDataNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated .AvatarSatiationData satiationDataList = 9;</code>
     */
    java.util.List<emu.grasscutter.net.proto.AvatarSatiationDataOuterClass.AvatarSatiationData> 
        getSatiationDataListList();
    /**
     * <code>repeated .AvatarSatiationData satiationDataList = 9;</code>
     */
    emu.grasscutter.net.proto.AvatarSatiationDataOuterClass.AvatarSatiationData getSatiationDataList(int index);
    /**
     * <code>repeated .AvatarSatiationData satiationDataList = 9;</code>
     */
    int getSatiationDataListCount();
    /**
     * <code>repeated .AvatarSatiationData satiationDataList = 9;</code>
     */
    java.util.List<? extends emu.grasscutter.net.proto.AvatarSatiationDataOuterClass.AvatarSatiationDataOrBuilder> 
        getSatiationDataListOrBuilderList();
    /**
     * <code>repeated .AvatarSatiationData satiationDataList = 9;</code>
     */
    emu.grasscutter.net.proto.AvatarSatiationDataOuterClass.AvatarSatiationDataOrBuilder getSatiationDataListOrBuilder(
        int index);
  }
  /**
   * <pre>
   *enum JKBKGEDKLLG {
   *	option allow_alias= true;
   *	NONE = 0;
   *	PEPPOHPHJOJ = 1722;
   *	DCDNILFDFLB = 0;
   *	NNBKOLMPOEA = 1;
   *}
   * </pre>
   *
   * Protobuf type {@code AvatarSatiationDataNotify}
   */
  public static final class AvatarSatiationDataNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:AvatarSatiationDataNotify)
      AvatarSatiationDataNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use AvatarSatiationDataNotify.newBuilder() to construct.
    private AvatarSatiationDataNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private AvatarSatiationDataNotify() {
      satiationDataList_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new AvatarSatiationDataNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private AvatarSatiationDataNotify(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
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
            case 74: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                satiationDataList_ = new java.util.ArrayList<emu.grasscutter.net.proto.AvatarSatiationDataOuterClass.AvatarSatiationData>();
                mutable_bitField0_ |= 0x00000001;
              }
              satiationDataList_.add(
                  input.readMessage(emu.grasscutter.net.proto.AvatarSatiationDataOuterClass.AvatarSatiationData.parser(), extensionRegistry));
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
        if (((mutable_bitField0_ & 0x00000001) != 0)) {
          satiationDataList_ = java.util.Collections.unmodifiableList(satiationDataList_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.AvatarSatiationDataNotifyOuterClass.internal_static_AvatarSatiationDataNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.AvatarSatiationDataNotifyOuterClass.internal_static_AvatarSatiationDataNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.AvatarSatiationDataNotifyOuterClass.AvatarSatiationDataNotify.class, emu.grasscutter.net.proto.AvatarSatiationDataNotifyOuterClass.AvatarSatiationDataNotify.Builder.class);
    }

    public static final int SATIATIONDATALIST_FIELD_NUMBER = 9;
    private java.util.List<emu.grasscutter.net.proto.AvatarSatiationDataOuterClass.AvatarSatiationData> satiationDataList_;
    /**
     * <code>repeated .AvatarSatiationData satiationDataList = 9;</code>
     */
    @java.lang.Override
    public java.util.List<emu.grasscutter.net.proto.AvatarSatiationDataOuterClass.AvatarSatiationData> getSatiationDataListList() {
      return satiationDataList_;
    }
    /**
     * <code>repeated .AvatarSatiationData satiationDataList = 9;</code>
     */
    @java.lang.Override
    public java.util.List<? extends emu.grasscutter.net.proto.AvatarSatiationDataOuterClass.AvatarSatiationDataOrBuilder> 
        getSatiationDataListOrBuilderList() {
      return satiationDataList_;
    }
    /**
     * <code>repeated .AvatarSatiationData satiationDataList = 9;</code>
     */
    @java.lang.Override
    public int getSatiationDataListCount() {
      return satiationDataList_.size();
    }
    /**
     * <code>repeated .AvatarSatiationData satiationDataList = 9;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.AvatarSatiationDataOuterClass.AvatarSatiationData getSatiationDataList(int index) {
      return satiationDataList_.get(index);
    }
    /**
     * <code>repeated .AvatarSatiationData satiationDataList = 9;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.AvatarSatiationDataOuterClass.AvatarSatiationDataOrBuilder getSatiationDataListOrBuilder(
        int index) {
      return satiationDataList_.get(index);
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
      for (int i = 0; i < satiationDataList_.size(); i++) {
        output.writeMessage(9, satiationDataList_.get(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < satiationDataList_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(9, satiationDataList_.get(i));
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
      if (!(obj instanceof emu.grasscutter.net.proto.AvatarSatiationDataNotifyOuterClass.AvatarSatiationDataNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.AvatarSatiationDataNotifyOuterClass.AvatarSatiationDataNotify other = (emu.grasscutter.net.proto.AvatarSatiationDataNotifyOuterClass.AvatarSatiationDataNotify) obj;

      if (!getSatiationDataListList()
          .equals(other.getSatiationDataListList())) return false;
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
      if (getSatiationDataListCount() > 0) {
        hash = (37 * hash) + SATIATIONDATALIST_FIELD_NUMBER;
        hash = (53 * hash) + getSatiationDataListList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.AvatarSatiationDataNotifyOuterClass.AvatarSatiationDataNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.AvatarSatiationDataNotifyOuterClass.AvatarSatiationDataNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AvatarSatiationDataNotifyOuterClass.AvatarSatiationDataNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.AvatarSatiationDataNotifyOuterClass.AvatarSatiationDataNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AvatarSatiationDataNotifyOuterClass.AvatarSatiationDataNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.AvatarSatiationDataNotifyOuterClass.AvatarSatiationDataNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AvatarSatiationDataNotifyOuterClass.AvatarSatiationDataNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.AvatarSatiationDataNotifyOuterClass.AvatarSatiationDataNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AvatarSatiationDataNotifyOuterClass.AvatarSatiationDataNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.AvatarSatiationDataNotifyOuterClass.AvatarSatiationDataNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AvatarSatiationDataNotifyOuterClass.AvatarSatiationDataNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.AvatarSatiationDataNotifyOuterClass.AvatarSatiationDataNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.AvatarSatiationDataNotifyOuterClass.AvatarSatiationDataNotify prototype) {
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
     *enum JKBKGEDKLLG {
     *	option allow_alias= true;
     *	NONE = 0;
     *	PEPPOHPHJOJ = 1722;
     *	DCDNILFDFLB = 0;
     *	NNBKOLMPOEA = 1;
     *}
     * </pre>
     *
     * Protobuf type {@code AvatarSatiationDataNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:AvatarSatiationDataNotify)
        emu.grasscutter.net.proto.AvatarSatiationDataNotifyOuterClass.AvatarSatiationDataNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.AvatarSatiationDataNotifyOuterClass.internal_static_AvatarSatiationDataNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.AvatarSatiationDataNotifyOuterClass.internal_static_AvatarSatiationDataNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.AvatarSatiationDataNotifyOuterClass.AvatarSatiationDataNotify.class, emu.grasscutter.net.proto.AvatarSatiationDataNotifyOuterClass.AvatarSatiationDataNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.AvatarSatiationDataNotifyOuterClass.AvatarSatiationDataNotify.newBuilder()
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
          getSatiationDataListFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (satiationDataListBuilder_ == null) {
          satiationDataList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          satiationDataListBuilder_.clear();
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.AvatarSatiationDataNotifyOuterClass.internal_static_AvatarSatiationDataNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.AvatarSatiationDataNotifyOuterClass.AvatarSatiationDataNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.AvatarSatiationDataNotifyOuterClass.AvatarSatiationDataNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.AvatarSatiationDataNotifyOuterClass.AvatarSatiationDataNotify build() {
        emu.grasscutter.net.proto.AvatarSatiationDataNotifyOuterClass.AvatarSatiationDataNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.AvatarSatiationDataNotifyOuterClass.AvatarSatiationDataNotify buildPartial() {
        emu.grasscutter.net.proto.AvatarSatiationDataNotifyOuterClass.AvatarSatiationDataNotify result = new emu.grasscutter.net.proto.AvatarSatiationDataNotifyOuterClass.AvatarSatiationDataNotify(this);
        int from_bitField0_ = bitField0_;
        if (satiationDataListBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            satiationDataList_ = java.util.Collections.unmodifiableList(satiationDataList_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.satiationDataList_ = satiationDataList_;
        } else {
          result.satiationDataList_ = satiationDataListBuilder_.build();
        }
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
        if (other instanceof emu.grasscutter.net.proto.AvatarSatiationDataNotifyOuterClass.AvatarSatiationDataNotify) {
          return mergeFrom((emu.grasscutter.net.proto.AvatarSatiationDataNotifyOuterClass.AvatarSatiationDataNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.AvatarSatiationDataNotifyOuterClass.AvatarSatiationDataNotify other) {
        if (other == emu.grasscutter.net.proto.AvatarSatiationDataNotifyOuterClass.AvatarSatiationDataNotify.getDefaultInstance()) return this;
        if (satiationDataListBuilder_ == null) {
          if (!other.satiationDataList_.isEmpty()) {
            if (satiationDataList_.isEmpty()) {
              satiationDataList_ = other.satiationDataList_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureSatiationDataListIsMutable();
              satiationDataList_.addAll(other.satiationDataList_);
            }
            onChanged();
          }
        } else {
          if (!other.satiationDataList_.isEmpty()) {
            if (satiationDataListBuilder_.isEmpty()) {
              satiationDataListBuilder_.dispose();
              satiationDataListBuilder_ = null;
              satiationDataList_ = other.satiationDataList_;
              bitField0_ = (bitField0_ & ~0x00000001);
              satiationDataListBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getSatiationDataListFieldBuilder() : null;
            } else {
              satiationDataListBuilder_.addAllMessages(other.satiationDataList_);
            }
          }
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
        emu.grasscutter.net.proto.AvatarSatiationDataNotifyOuterClass.AvatarSatiationDataNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.AvatarSatiationDataNotifyOuterClass.AvatarSatiationDataNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.util.List<emu.grasscutter.net.proto.AvatarSatiationDataOuterClass.AvatarSatiationData> satiationDataList_ =
        java.util.Collections.emptyList();
      private void ensureSatiationDataListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          satiationDataList_ = new java.util.ArrayList<emu.grasscutter.net.proto.AvatarSatiationDataOuterClass.AvatarSatiationData>(satiationDataList_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.AvatarSatiationDataOuterClass.AvatarSatiationData, emu.grasscutter.net.proto.AvatarSatiationDataOuterClass.AvatarSatiationData.Builder, emu.grasscutter.net.proto.AvatarSatiationDataOuterClass.AvatarSatiationDataOrBuilder> satiationDataListBuilder_;

      /**
       * <code>repeated .AvatarSatiationData satiationDataList = 9;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.AvatarSatiationDataOuterClass.AvatarSatiationData> getSatiationDataListList() {
        if (satiationDataListBuilder_ == null) {
          return java.util.Collections.unmodifiableList(satiationDataList_);
        } else {
          return satiationDataListBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .AvatarSatiationData satiationDataList = 9;</code>
       */
      public int getSatiationDataListCount() {
        if (satiationDataListBuilder_ == null) {
          return satiationDataList_.size();
        } else {
          return satiationDataListBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .AvatarSatiationData satiationDataList = 9;</code>
       */
      public emu.grasscutter.net.proto.AvatarSatiationDataOuterClass.AvatarSatiationData getSatiationDataList(int index) {
        if (satiationDataListBuilder_ == null) {
          return satiationDataList_.get(index);
        } else {
          return satiationDataListBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .AvatarSatiationData satiationDataList = 9;</code>
       */
      public Builder setSatiationDataList(
          int index, emu.grasscutter.net.proto.AvatarSatiationDataOuterClass.AvatarSatiationData value) {
        if (satiationDataListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureSatiationDataListIsMutable();
          satiationDataList_.set(index, value);
          onChanged();
        } else {
          satiationDataListBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .AvatarSatiationData satiationDataList = 9;</code>
       */
      public Builder setSatiationDataList(
          int index, emu.grasscutter.net.proto.AvatarSatiationDataOuterClass.AvatarSatiationData.Builder builderForValue) {
        if (satiationDataListBuilder_ == null) {
          ensureSatiationDataListIsMutable();
          satiationDataList_.set(index, builderForValue.build());
          onChanged();
        } else {
          satiationDataListBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .AvatarSatiationData satiationDataList = 9;</code>
       */
      public Builder addSatiationDataList(emu.grasscutter.net.proto.AvatarSatiationDataOuterClass.AvatarSatiationData value) {
        if (satiationDataListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureSatiationDataListIsMutable();
          satiationDataList_.add(value);
          onChanged();
        } else {
          satiationDataListBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .AvatarSatiationData satiationDataList = 9;</code>
       */
      public Builder addSatiationDataList(
          int index, emu.grasscutter.net.proto.AvatarSatiationDataOuterClass.AvatarSatiationData value) {
        if (satiationDataListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureSatiationDataListIsMutable();
          satiationDataList_.add(index, value);
          onChanged();
        } else {
          satiationDataListBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .AvatarSatiationData satiationDataList = 9;</code>
       */
      public Builder addSatiationDataList(
          emu.grasscutter.net.proto.AvatarSatiationDataOuterClass.AvatarSatiationData.Builder builderForValue) {
        if (satiationDataListBuilder_ == null) {
          ensureSatiationDataListIsMutable();
          satiationDataList_.add(builderForValue.build());
          onChanged();
        } else {
          satiationDataListBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .AvatarSatiationData satiationDataList = 9;</code>
       */
      public Builder addSatiationDataList(
          int index, emu.grasscutter.net.proto.AvatarSatiationDataOuterClass.AvatarSatiationData.Builder builderForValue) {
        if (satiationDataListBuilder_ == null) {
          ensureSatiationDataListIsMutable();
          satiationDataList_.add(index, builderForValue.build());
          onChanged();
        } else {
          satiationDataListBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .AvatarSatiationData satiationDataList = 9;</code>
       */
      public Builder addAllSatiationDataList(
          java.lang.Iterable<? extends emu.grasscutter.net.proto.AvatarSatiationDataOuterClass.AvatarSatiationData> values) {
        if (satiationDataListBuilder_ == null) {
          ensureSatiationDataListIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, satiationDataList_);
          onChanged();
        } else {
          satiationDataListBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .AvatarSatiationData satiationDataList = 9;</code>
       */
      public Builder clearSatiationDataList() {
        if (satiationDataListBuilder_ == null) {
          satiationDataList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          satiationDataListBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .AvatarSatiationData satiationDataList = 9;</code>
       */
      public Builder removeSatiationDataList(int index) {
        if (satiationDataListBuilder_ == null) {
          ensureSatiationDataListIsMutable();
          satiationDataList_.remove(index);
          onChanged();
        } else {
          satiationDataListBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .AvatarSatiationData satiationDataList = 9;</code>
       */
      public emu.grasscutter.net.proto.AvatarSatiationDataOuterClass.AvatarSatiationData.Builder getSatiationDataListBuilder(
          int index) {
        return getSatiationDataListFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .AvatarSatiationData satiationDataList = 9;</code>
       */
      public emu.grasscutter.net.proto.AvatarSatiationDataOuterClass.AvatarSatiationDataOrBuilder getSatiationDataListOrBuilder(
          int index) {
        if (satiationDataListBuilder_ == null) {
          return satiationDataList_.get(index);  } else {
          return satiationDataListBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .AvatarSatiationData satiationDataList = 9;</code>
       */
      public java.util.List<? extends emu.grasscutter.net.proto.AvatarSatiationDataOuterClass.AvatarSatiationDataOrBuilder> 
           getSatiationDataListOrBuilderList() {
        if (satiationDataListBuilder_ != null) {
          return satiationDataListBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(satiationDataList_);
        }
      }
      /**
       * <code>repeated .AvatarSatiationData satiationDataList = 9;</code>
       */
      public emu.grasscutter.net.proto.AvatarSatiationDataOuterClass.AvatarSatiationData.Builder addSatiationDataListBuilder() {
        return getSatiationDataListFieldBuilder().addBuilder(
            emu.grasscutter.net.proto.AvatarSatiationDataOuterClass.AvatarSatiationData.getDefaultInstance());
      }
      /**
       * <code>repeated .AvatarSatiationData satiationDataList = 9;</code>
       */
      public emu.grasscutter.net.proto.AvatarSatiationDataOuterClass.AvatarSatiationData.Builder addSatiationDataListBuilder(
          int index) {
        return getSatiationDataListFieldBuilder().addBuilder(
            index, emu.grasscutter.net.proto.AvatarSatiationDataOuterClass.AvatarSatiationData.getDefaultInstance());
      }
      /**
       * <code>repeated .AvatarSatiationData satiationDataList = 9;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.AvatarSatiationDataOuterClass.AvatarSatiationData.Builder> 
           getSatiationDataListBuilderList() {
        return getSatiationDataListFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.AvatarSatiationDataOuterClass.AvatarSatiationData, emu.grasscutter.net.proto.AvatarSatiationDataOuterClass.AvatarSatiationData.Builder, emu.grasscutter.net.proto.AvatarSatiationDataOuterClass.AvatarSatiationDataOrBuilder> 
          getSatiationDataListFieldBuilder() {
        if (satiationDataListBuilder_ == null) {
          satiationDataListBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              emu.grasscutter.net.proto.AvatarSatiationDataOuterClass.AvatarSatiationData, emu.grasscutter.net.proto.AvatarSatiationDataOuterClass.AvatarSatiationData.Builder, emu.grasscutter.net.proto.AvatarSatiationDataOuterClass.AvatarSatiationDataOrBuilder>(
                  satiationDataList_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          satiationDataList_ = null;
        }
        return satiationDataListBuilder_;
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


      // @@protoc_insertion_point(builder_scope:AvatarSatiationDataNotify)
    }

    // @@protoc_insertion_point(class_scope:AvatarSatiationDataNotify)
    private static final emu.grasscutter.net.proto.AvatarSatiationDataNotifyOuterClass.AvatarSatiationDataNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.AvatarSatiationDataNotifyOuterClass.AvatarSatiationDataNotify();
    }

    public static emu.grasscutter.net.proto.AvatarSatiationDataNotifyOuterClass.AvatarSatiationDataNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<AvatarSatiationDataNotify>
        PARSER = new com.google.protobuf.AbstractParser<AvatarSatiationDataNotify>() {
      @java.lang.Override
      public AvatarSatiationDataNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new AvatarSatiationDataNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<AvatarSatiationDataNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<AvatarSatiationDataNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.AvatarSatiationDataNotifyOuterClass.AvatarSatiationDataNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_AvatarSatiationDataNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_AvatarSatiationDataNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\037AvatarSatiationDataNotify.proto\032\031Avata" +
      "rSatiationData.proto\"L\n\031AvatarSatiationD" +
      "ataNotify\022/\n\021satiationDataList\030\t \003(\0132\024.A" +
      "vatarSatiationDataB\033\n\031emu.grasscutter.ne" +
      "t.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.AvatarSatiationDataOuterClass.getDescriptor(),
        });
    internal_static_AvatarSatiationDataNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_AvatarSatiationDataNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_AvatarSatiationDataNotify_descriptor,
        new java.lang.String[] { "SatiationDataList", });
    emu.grasscutter.net.proto.AvatarSatiationDataOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
