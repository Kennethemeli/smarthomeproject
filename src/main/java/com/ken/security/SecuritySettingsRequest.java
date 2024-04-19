// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: SecurityService.proto

package com.ken.security;

/**
 * <pre>
 * Request for security settings via client-side streaming
 * </pre>
 *
 * Protobuf type {@code com.ken.security.SecuritySettingsRequest}
 */
public  final class SecuritySettingsRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.ken.security.SecuritySettingsRequest)
    SecuritySettingsRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SecuritySettingsRequest.newBuilder() to construct.
  private SecuritySettingsRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SecuritySettingsRequest() {
    alarmOn_ = false;
    lock_ = false;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private SecuritySettingsRequest(
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
          case 8: {

            alarmOn_ = input.readBool();
            break;
          }
          case 16: {

            lock_ = input.readBool();
            break;
          }
          default: {
            if (!parseUnknownFieldProto3(
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
    return com.ken.security.SecurityServiceProto.internal_static_com_ken_security_SecuritySettingsRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.ken.security.SecurityServiceProto.internal_static_com_ken_security_SecuritySettingsRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.ken.security.SecuritySettingsRequest.class, com.ken.security.SecuritySettingsRequest.Builder.class);
  }

  public static final int ALARMON_FIELD_NUMBER = 1;
  private boolean alarmOn_;
  /**
   * <pre>
   * true to turn on, false to turn off
   * </pre>
   *
   * <code>bool alarmOn = 1;</code>
   */
  public boolean getAlarmOn() {
    return alarmOn_;
  }

  public static final int LOCK_FIELD_NUMBER = 2;
  private boolean lock_;
  /**
   * <pre>
   * true to lock, false to unlock
   * </pre>
   *
   * <code>bool lock = 2;</code>
   */
  public boolean getLock() {
    return lock_;
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
    if (alarmOn_ != false) {
      output.writeBool(1, alarmOn_);
    }
    if (lock_ != false) {
      output.writeBool(2, lock_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (alarmOn_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(1, alarmOn_);
    }
    if (lock_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(2, lock_);
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
    if (!(obj instanceof com.ken.security.SecuritySettingsRequest)) {
      return super.equals(obj);
    }
    com.ken.security.SecuritySettingsRequest other = (com.ken.security.SecuritySettingsRequest) obj;

    boolean result = true;
    result = result && (getAlarmOn()
        == other.getAlarmOn());
    result = result && (getLock()
        == other.getLock());
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + ALARMON_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getAlarmOn());
    hash = (37 * hash) + LOCK_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getLock());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.ken.security.SecuritySettingsRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ken.security.SecuritySettingsRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ken.security.SecuritySettingsRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ken.security.SecuritySettingsRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ken.security.SecuritySettingsRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ken.security.SecuritySettingsRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ken.security.SecuritySettingsRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.ken.security.SecuritySettingsRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.ken.security.SecuritySettingsRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.ken.security.SecuritySettingsRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.ken.security.SecuritySettingsRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.ken.security.SecuritySettingsRequest parseFrom(
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
  public static Builder newBuilder(com.ken.security.SecuritySettingsRequest prototype) {
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
   * Request for security settings via client-side streaming
   * </pre>
   *
   * Protobuf type {@code com.ken.security.SecuritySettingsRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.ken.security.SecuritySettingsRequest)
      com.ken.security.SecuritySettingsRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.ken.security.SecurityServiceProto.internal_static_com_ken_security_SecuritySettingsRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.ken.security.SecurityServiceProto.internal_static_com_ken_security_SecuritySettingsRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.ken.security.SecuritySettingsRequest.class, com.ken.security.SecuritySettingsRequest.Builder.class);
    }

    // Construct using com.ken.security.SecuritySettingsRequest.newBuilder()
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
      alarmOn_ = false;

      lock_ = false;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.ken.security.SecurityServiceProto.internal_static_com_ken_security_SecuritySettingsRequest_descriptor;
    }

    @java.lang.Override
    public com.ken.security.SecuritySettingsRequest getDefaultInstanceForType() {
      return com.ken.security.SecuritySettingsRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.ken.security.SecuritySettingsRequest build() {
      com.ken.security.SecuritySettingsRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.ken.security.SecuritySettingsRequest buildPartial() {
      com.ken.security.SecuritySettingsRequest result = new com.ken.security.SecuritySettingsRequest(this);
      result.alarmOn_ = alarmOn_;
      result.lock_ = lock_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return (Builder) super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.ken.security.SecuritySettingsRequest) {
        return mergeFrom((com.ken.security.SecuritySettingsRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.ken.security.SecuritySettingsRequest other) {
      if (other == com.ken.security.SecuritySettingsRequest.getDefaultInstance()) return this;
      if (other.getAlarmOn() != false) {
        setAlarmOn(other.getAlarmOn());
      }
      if (other.getLock() != false) {
        setLock(other.getLock());
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
      com.ken.security.SecuritySettingsRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.ken.security.SecuritySettingsRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private boolean alarmOn_ ;
    /**
     * <pre>
     * true to turn on, false to turn off
     * </pre>
     *
     * <code>bool alarmOn = 1;</code>
     */
    public boolean getAlarmOn() {
      return alarmOn_;
    }
    /**
     * <pre>
     * true to turn on, false to turn off
     * </pre>
     *
     * <code>bool alarmOn = 1;</code>
     */
    public Builder setAlarmOn(boolean value) {
      
      alarmOn_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * true to turn on, false to turn off
     * </pre>
     *
     * <code>bool alarmOn = 1;</code>
     */
    public Builder clearAlarmOn() {
      
      alarmOn_ = false;
      onChanged();
      return this;
    }

    private boolean lock_ ;
    /**
     * <pre>
     * true to lock, false to unlock
     * </pre>
     *
     * <code>bool lock = 2;</code>
     */
    public boolean getLock() {
      return lock_;
    }
    /**
     * <pre>
     * true to lock, false to unlock
     * </pre>
     *
     * <code>bool lock = 2;</code>
     */
    public Builder setLock(boolean value) {
      
      lock_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * true to lock, false to unlock
     * </pre>
     *
     * <code>bool lock = 2;</code>
     */
    public Builder clearLock() {
      
      lock_ = false;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:com.ken.security.SecuritySettingsRequest)
  }

  // @@protoc_insertion_point(class_scope:com.ken.security.SecuritySettingsRequest)
  private static final com.ken.security.SecuritySettingsRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.ken.security.SecuritySettingsRequest();
  }

  public static com.ken.security.SecuritySettingsRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SecuritySettingsRequest>
      PARSER = new com.google.protobuf.AbstractParser<SecuritySettingsRequest>() {
    @java.lang.Override
    public SecuritySettingsRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new SecuritySettingsRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<SecuritySettingsRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SecuritySettingsRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.ken.security.SecuritySettingsRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

