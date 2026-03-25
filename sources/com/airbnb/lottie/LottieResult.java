package com.airbnb.lottie;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class LottieResult<V> {
    private final Throwable exception;
    private final V value;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public Throwable getException() {
        return this.exception;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public V getValue() {
        return this.value;
    }

    public LottieResult(V v) {
        this.value = v;
        this.exception = null;
    }

    public LottieResult(Throwable th) {
        this.exception = th;
        this.value = null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LottieResult)) {
            return false;
        }
        LottieResult lottieResult = (LottieResult) obj;
        if (getValue() != null && getValue().equals(lottieResult.getValue())) {
            return true;
        }
        if (getException() == null || lottieResult.getException() == null) {
            return false;
        }
        return getException().toString().equals(getException().toString());
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{getValue(), getException()});
    }
}
