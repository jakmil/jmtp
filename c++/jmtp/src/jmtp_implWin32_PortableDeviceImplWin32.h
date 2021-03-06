/* DO NOT EDIT THIS FILE - it is machine generated */
#include <jni.h>
/* Header for class jmtp_implWin32_PortableDeviceImplWin32 */

#ifndef _Included_jmtp_implWin32_PortableDeviceImplWin32
#define _Included_jmtp_implWin32_PortableDeviceImplWin32
#ifdef __cplusplus
extern "C" {
#endif
/*
 * Class:     jmtp_implWin32_PortableDeviceImplWin32
 * Method:    getDeviceFriendlyName
 * Signature: (Ljava/lang/String;)Ljava/lang/String;
 */
JNIEXPORT jstring JNICALL Java_jmtp_implWin32_PortableDeviceImplWin32_getDeviceFriendlyName
  (JNIEnv *, jobject, jstring);

/*
 * Class:     jmtp_implWin32_PortableDeviceImplWin32
 * Method:    getDeviceManufacturer
 * Signature: (Ljava/lang/String;)Ljava/lang/String;
 */
JNIEXPORT jstring JNICALL Java_jmtp_implWin32_PortableDeviceImplWin32_getDeviceManufacturer
  (JNIEnv *, jobject, jstring);

/*
 * Class:     jmtp_implWin32_PortableDeviceImplWin32
 * Method:    getDeviceDescription
 * Signature: (Ljava/lang/String;)Ljava/lang/String;
 */
JNIEXPORT jstring JNICALL Java_jmtp_implWin32_PortableDeviceImplWin32_getDeviceDescription
  (JNIEnv *, jobject, jstring);

/*
 * Class:     jmtp_implWin32_PortableDeviceImplWin32
 * Method:    openImpl
 * Signature: (Ljmtp/implWin32/PortableDeviceValuesImplWin32;)V
 */
JNIEXPORT void JNICALL Java_jmtp_implWin32_PortableDeviceImplWin32_openImpl
  (JNIEnv *, jobject, jobject);

/*
 * Class:     jmtp_implWin32_PortableDeviceImplWin32
 * Method:    closeImpl
 * Signature: ()V
 */
JNIEXPORT void JNICALL Java_jmtp_implWin32_PortableDeviceImplWin32_closeImpl
  (JNIEnv *, jobject);

/*
 * Class:     jmtp_implWin32_PortableDeviceImplWin32
 * Method:    getDeviceContent
 * Signature: ()Ljmtp/implWin32/PortableDeviceContentImplWin32;
 */
JNIEXPORT jobject JNICALL Java_jmtp_implWin32_PortableDeviceImplWin32_getDeviceContent
  (JNIEnv *, jobject);

/*
 * Class:     jmtp_implWin32_PortableDeviceImplWin32
 * Method:    getDeviceResources
 * Signature: ()Ljmtp/implWin32/PortableDeviceResourcesImplWin32;
 */
JNIEXPORT jobject JNICALL Java_jmtp_implWin32_PortableDeviceImplWin32_getDeviceResources
  (JNIEnv *, jobject);

/*
 * Class:     jmtp_implWin32_PortableDeviceImplWin32
 * Method:    sendCommand
 * Signature: (Ljmtp/implWin32/PortableDeviceValuesImplWin32;)Ljmtp/implWin32/PortableDeviceValuesImplWin32;
 */
JNIEXPORT jobject JNICALL Java_jmtp_implWin32_PortableDeviceImplWin32_sendCommand
  (JNIEnv *, jobject, jobject);

#ifdef __cplusplus
}
#endif
#endif
