package com.sun.jna;

/* JADX INFO: loaded from: classes12.dex */
public interface NativeMapped {
    Object fromNative(Object obj, FromNativeContext fromNativeContext);

    Class<?> nativeType();

    Object toNative();
}
