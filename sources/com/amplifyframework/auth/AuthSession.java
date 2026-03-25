package com.amplifyframework.auth;

import androidx.core.util.ObjectsCompat;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public class AuthSession {
    private final boolean isSignedIn;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean isSignedIn() {
        return this.isSignedIn;
    }

    public AuthSession(boolean z) {
        this.isSignedIn = z;
    }

    public int hashCode() {
        return ObjectsCompat.hash(Boolean.valueOf(isSignedIn()));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.EZpvd(getClass(), obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.copydefault(obj, "");
        return isSignedIn() == ((AuthSession) obj).isSignedIn();
    }

    public String toString() {
        return "AuthSession{isSignedIn=" + isSignedIn() + "}";
    }
}
