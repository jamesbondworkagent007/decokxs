package com.amplifyframework.auth.options;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes14.dex */
public abstract class AuthSignInOptions {

    /* JADX INFO: loaded from: classes21.dex */
    public static abstract class Builder<T extends Builder<T>> {
        public abstract AuthSignInOptions build();

        public abstract T getThis();
    }

    public static DefaultAuthSignInOptions defaults() {
        return new DefaultAuthSignInOptions();
    }

    /* JADX INFO: loaded from: classes21.dex */
    public static final class DefaultAuthSignInOptions extends AuthSignInOptions {
        private DefaultAuthSignInOptions() {
        }

        public int hashCode() {
            return DefaultAuthSignInOptions.class.hashCode();
        }

        public boolean equals(@Nullable Object obj) {
            return obj instanceof DefaultAuthSignInOptions;
        }

        public String toString() {
            return DefaultAuthSignInOptions.class.getSimpleName();
        }
    }
}
