// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: SecurityService.proto

package com.ken.security;

public final class SecurityServiceProto {
  private SecurityServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_ken_security_LockRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_ken_security_LockRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_ken_security_LockResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_ken_security_LockResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_ken_security_SecuritySettingsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_ken_security_SecuritySettingsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_ken_security_SecuritySettingsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_ken_security_SecuritySettingsResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\025SecurityService.proto\022\020com.ken.securit" +
      "y\"\033\n\013LockRequest\022\014\n\004lock\030\001 \001(\010\"\037\n\014LockRe" +
      "sponse\022\017\n\007success\030\001 \001(\010\"8\n\027SecuritySetti" +
      "ngsRequest\022\017\n\007alarmOn\030\001 \001(\010\022\014\n\004lock\030\002 \001(" +
      "\010\"+\n\030SecuritySettingsResponse\022\017\n\007success" +
      "\030\001 \001(\0102\322\001\n\017SecurityService\022M\n\nToggleLock" +
      "\022\035.com.ken.security.LockRequest\032\036.com.ke" +
      "n.security.LockResponse\"\000\022p\n\023SetSecurity" +
      "Settings\022).com.ken.security.SecuritySett" +
      "ingsRequest\032*.com.ken.security.SecurityS" +
      "ettingsResponse\"\000(\001B*\n\020com.ken.securityB" +
      "\024SecurityServiceProtoP\001b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_com_ken_security_LockRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_ken_security_LockRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_ken_security_LockRequest_descriptor,
        new java.lang.String[] { "Lock", });
    internal_static_com_ken_security_LockResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_com_ken_security_LockResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_ken_security_LockResponse_descriptor,
        new java.lang.String[] { "Success", });
    internal_static_com_ken_security_SecuritySettingsRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_com_ken_security_SecuritySettingsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_ken_security_SecuritySettingsRequest_descriptor,
        new java.lang.String[] { "AlarmOn", "Lock", });
    internal_static_com_ken_security_SecuritySettingsResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_com_ken_security_SecuritySettingsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_ken_security_SecuritySettingsResponse_descriptor,
        new java.lang.String[] { "Success", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}