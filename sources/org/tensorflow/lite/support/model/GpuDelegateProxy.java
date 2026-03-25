package org.tensorflow.lite.support.model;

import java.io.Closeable;
import java.io.IOException;
import org.tensorflow.lite.Delegate;

/* JADX INFO: loaded from: classes25.dex */
class GpuDelegateProxy implements Delegate, Closeable {
    private static final String TAG = "GpuDelegateProxy";
    private final Closeable proxiedCloseable;
    private final Delegate proxiedDelegate;

    public static GpuDelegateProxy maybeNewInstance() {
        try {
            return new GpuDelegateProxy(Class.forName("org.tensorflow.lite.gpu.GpuDelegate").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
        } catch (ReflectiveOperationException unused) {
            return null;
        }
    }

    @Override // org.tensorflow.lite.Delegate, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        try {
            this.proxiedCloseable.close();
        } catch (IOException unused) {
        }
    }

    @Override // org.tensorflow.lite.Delegate
    public long getNativeHandle() {
        return this.proxiedDelegate.getNativeHandle();
    }

    private GpuDelegateProxy(Object obj) {
        this.proxiedCloseable = (Closeable) obj;
        this.proxiedDelegate = (Delegate) obj;
    }
}
