//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: config.proto

package com.airship.flutter.config;

@kotlin.jvm.JvmSynthetic
public inline fun androidConfig(block: com.airship.flutter.config.AndroidConfigKt.Dsl.() -> kotlin.Unit): com.airship.flutter.config.Config.AndroidConfig =
  com.airship.flutter.config.AndroidConfigKt.Dsl._create(com.airship.flutter.config.Config.AndroidConfig.newBuilder()).apply { block() }._build()
public object AndroidConfigKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: com.airship.flutter.config.Config.AndroidConfig.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: com.airship.flutter.config.Config.AndroidConfig.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): com.airship.flutter.config.Config.AndroidConfig = _builder.build()

    /**
     * <pre>
     *&#47; App store URI
     * </pre>
     *
     * <code>string app_store_uri = 1;</code>
     */
    public var appStoreUri: kotlin.String
      @JvmName("getAppStoreUri")
      get() = _builder.getAppStoreUri()
      @JvmName("setAppStoreUri")
      set(value) {
        _builder.setAppStoreUri(value)
      }
    /**
     * <pre>
     *&#47; App store URI
     * </pre>
     *
     * <code>string app_store_uri = 1;</code>
     */
    public fun clearAppStoreUri() {
      _builder.clearAppStoreUri()
    }

    /**
     * <pre>
     *&#47; Fcm app name if using multiple FCM projects.
     * </pre>
     *
     * <code>string fcm_firebase_app_name = 2;</code>
     */
    public var fcmFirebaseAppName: kotlin.String
      @JvmName("getFcmFirebaseAppName")
      get() = _builder.getFcmFirebaseAppName()
      @JvmName("setFcmFirebaseAppName")
      set(value) {
        _builder.setFcmFirebaseAppName(value)
      }
    /**
     * <pre>
     *&#47; Fcm app name if using multiple FCM projects.
     * </pre>
     *
     * <code>string fcm_firebase_app_name = 2;</code>
     */
    public fun clearFcmFirebaseAppName() {
      _builder.clearFcmFirebaseAppName()
    }

    /**
     * <pre>
     *&#47; Notification config.
     * </pre>
     *
     * <code>.AndroidNotificationConfig notification = 3;</code>
     */
    public var notification: com.airship.flutter.config.Config.AndroidNotificationConfig
      @JvmName("getNotification")
      get() = _builder.getNotification()
      @JvmName("setNotification")
      set(value) {
        _builder.setNotification(value)
      }
    /**
     * <pre>
     *&#47; Notification config.
     * </pre>
     *
     * <code>.AndroidNotificationConfig notification = 3;</code>
     */
    public fun clearNotification() {
      _builder.clearNotification()
    }
    /**
     * <pre>
     *&#47; Notification config.
     * </pre>
     *
     * <code>.AndroidNotificationConfig notification = 3;</code>
     * @return Whether the notification field is set.
     */
    public fun hasNotification(): kotlin.Boolean {
      return _builder.hasNotification()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun com.airship.flutter.config.Config.AndroidConfig.copy(block: com.airship.flutter.config.AndroidConfigKt.Dsl.() -> kotlin.Unit): com.airship.flutter.config.Config.AndroidConfig =
  com.airship.flutter.config.AndroidConfigKt.Dsl._create(this.toBuilder()).apply { block() }._build()