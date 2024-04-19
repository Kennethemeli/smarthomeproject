// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: LightService.proto

package com.ken.light;

/**
 * <pre>
 * Request for interactive light control
 * </pre>
 *
 * Protobuf type {@code com.ken.light.LightControlRequest}
 */
public  final class LightControlRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.ken.light.LightControlRequest)
    LightControlRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use LightControlRequest.newBuilder() to construct.
  private LightControlRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private LightControlRequest() {
    lightId_ = "";
    on_ = false;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private LightControlRequest(
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
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            lightId_ = s;
            break;
          }
          case 16: {

            on_ = input.readBool();
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
    return com.ken.light.LightServiceProto.internal_static_com_ken_light_LightControlRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.ken.light.LightServiceProto.internal_static_com_ken_light_LightControlRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.ken.light.LightControlRequest.class, com.ken.light.LightControlRequest.Builder.class);
  }

  public static final int LIGHTID_FIELD_NUMBER = 1;
  private volatile java.lang.Object lightId_;
  /**
   * <code>string lightId = 1;</code>
   */
  public java.lang.String getLightId() {
    java.lang.Object ref = lightId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      lightId_ = s;
      return s;
    }
  }
  /**
   * <code>string lightId = 1;</code>
   */
  public com.google.protobuf.ByteString
      getLightIdBytes() {
    java.lang.Object ref = lightId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      lightId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ON_FIELD_NUMBER = 2;
  private boolean on_;
  /**
   * <code>bool on = 2;</code>
   */
  public boolean getOn() {
    return on_;
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
    if (!getLightIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, lightId_);
    }
    if (on_ != false) {
      output.writeBool(2, on_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getLightIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, lightId_);
    }
    if (on_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(2, on_);
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
    if (!(obj instanceof com.ken.light.LightControlRequest)) {
      return super.equals(obj);
    }
    com.ken.light.LightControlRequest other = (com.ken.light.LightControlRequest) obj;

    boolean result = true;
    result = result && getLightId()
        .equals(other.getLightId());
    result = result && (getOn()
        == other.getOn());
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
    hash = (37 * hash) + LIGHTID_FIELD_NUMBER;
    hash = (53 * hash) + getLightId().hashCode();
    hash = (37 * hash) + ON_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getOn());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.ken.light.LightControlRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ken.light.LightControlRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ken.light.LightControlRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ken.light.LightControlRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ken.light.LightControlRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ken.light.LightControlRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ken.light.LightControlRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.ken.light.LightControlRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.ken.light.LightControlRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.ken.light.LightControlRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.ken.light.LightControlRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.ken.light.LightControlRequest parseFrom(
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
  public static Builder newBuilder(com.ken.light.LightControlRequest prototype) {
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
   * Request for interactive light control
   * </pre>
   *
   * Protobuf type {@code com.ken.light.LightControlRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.ken.light.LightControlRequest)
      com.ken.light.LightControlRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.ken.light.LightServiceProto.internal_static_com_ken_light_LightControlRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.ken.light.LightServiceProto.internal_static_com_ken_light_LightControlRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.ken.light.LightControlRequest.class, com.ken.light.LightControlRequest.Builder.class);
    }

    // Construct using com.ken.light.LightControlRequest.newBuilder()
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
      lightId_ = "";

      on_ = false;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.ken.light.LightServiceProto.internal_static_com_ken_light_LightControlRequest_descriptor;
    }

    @java.lang.Override
    public com.ken.light.LightControlRequest getDefaultInstanceForType() {
      return com.ken.light.LightControlRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.ken.light.LightControlRequest build() {
      com.ken.light.LightControlRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.ken.light.LightControlRequest buildPartial() {
      com.ken.light.LightControlRequest result = new com.ken.light.LightControlRequest(this);
      result.lightId_ = lightId_;
      result.on_ = on_;
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
      if (other instanceof com.ken.light.LightControlRequest) {
        return mergeFrom((com.ken.light.LightControlRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.ken.light.LightControlRequest other) {
      if (other == com.ken.light.LightControlRequest.getDefaultInstance()) return this;
      if (!other.getLightId().isEmpty()) {
        lightId_ = other.lightId_;
        onChanged();
      }
      if (other.getOn() != false) {
        setOn(other.getOn());
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
      com.ken.light.LightControlRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.ken.light.LightControlRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object lightId_ = "";
    /**
     * <code>string lightId = 1;</code>
     */
    public java.lang.String getLightId() {
      java.lang.Object ref = lightId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        lightId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string lightId = 1;</code>
     */
    public com.google.protobuf.ByteString
        getLightIdBytes() {
      java.lang.Object ref = lightId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        lightId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string lightId = 1;</code>
     */
    public Builder setLightId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      lightId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string lightId = 1;</code>
     */
    public Builder clearLightId() {
      
      lightId_ = getDefaultInstance().getLightId();
      onChanged();
      return this;
    }
    /**
     * <code>string lightId = 1;</code>
     */
    public Builder setLightIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      lightId_ = value;
      onChanged();
      return this;
    }

    private boolean on_ ;
    /**
     * <code>bool on = 2;</code>
     */
    public boolean getOn() {
      return on_;
    }
    /**
     * <code>bool on = 2;</code>
     */
    public Builder setOn(boolean value) {
      
      on_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool on = 2;</code>
     */
    public Builder clearOn() {
      
      on_ = false;
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


    // @@protoc_insertion_point(builder_scope:com.ken.light.LightControlRequest)
  }

  // @@protoc_insertion_point(class_scope:com.ken.light.LightControlRequest)
  private static final com.ken.light.LightControlRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.ken.light.LightControlRequest();
  }

  public static com.ken.light.LightControlRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<LightControlRequest>
      PARSER = new com.google.protobuf.AbstractParser<LightControlRequest>() {
    @java.lang.Override
    public LightControlRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new LightControlRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<LightControlRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<LightControlRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.ken.light.LightControlRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
