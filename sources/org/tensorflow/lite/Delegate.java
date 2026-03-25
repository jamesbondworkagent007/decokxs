package org.tensorflow.lite;

import java.io.Closeable;

/* JADX INFO: loaded from: classes13.dex */
public interface Delegate extends Closeable {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    default void close() {
    }

    long getNativeHandle();
}
