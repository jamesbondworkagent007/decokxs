package com.amplifyframework.auth.options;

import androidx.core.util.ObjectsCompat;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public class AuthFetchSessionOptions {
    public static final Companion Companion = new Companion(null);
    private final boolean forceRefresh;

    /* JADX INFO: loaded from: classes14.dex */
    public static final class CoreBuilder extends Builder<CoreBuilder> {
        /* JADX DEBUG: Method merged with bridge method: getThis()Lcom/amplifyframework/auth/options/AuthFetchSessionOptions$Builder; */
        @Override // com.amplifyframework.auth.options.AuthFetchSessionOptions.Builder
        public CoreBuilder getThis() {
            return this;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final Builder<?> builder() {
        return Companion.builder();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final AuthFetchSessionOptions defaults() {
        return Companion.defaults();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getForceRefresh() {
        return this.forceRefresh;
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.amplifyframework.auth.options.AuthFetchSessionOptions.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final AuthFetchSessionOptions defaults() {
            return new AuthFetchSessionOptions(false);
        }

        public final Builder<?> builder() {
            return new CoreBuilder();
        }
    }

    public AuthFetchSessionOptions(boolean z) {
        this.forceRefresh = z;
    }

    public int hashCode() {
        return ObjectsCompat.hash(Boolean.valueOf(this.forceRefresh));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !Intrinsics.EZpvd(getClass(), obj.getClass())) {
            return false;
        }
        return ObjectsCompat.equals(Boolean.valueOf(this.forceRefresh), Boolean.valueOf(((AuthFetchSessionOptions) obj).forceRefresh));
    }

    public String toString() {
        return "AuthFetchSessionOptions{forceRefresh=" + this.forceRefresh + "}";
    }

    /* JADX INFO: loaded from: classes14.dex */
    public static abstract class Builder<T extends Builder<T>> {
        private boolean forceRefresh;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Builder<T> forceRefresh(boolean z) {
            this.forceRefresh = z;
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean getForceRefresh() {
            return this.forceRefresh;
        }

        public abstract T getThis();

        public AuthFetchSessionOptions build() {
            return new AuthFetchSessionOptions(this.forceRefresh);
        }
    }
}
