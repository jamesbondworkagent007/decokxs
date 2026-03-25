package com.amplifyframework.auth.options;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes14.dex */
public abstract class AuthConfirmSignInOptions {

    /* JADX INFO: loaded from: classes21.dex */
    public static abstract class Builder<T extends Builder<T>> {
        public abstract AuthConfirmSignInOptions build();

        public abstract T getThis();
    }

    public static DefaultAuthConfirmSignInOptions defaults() {
        return new DefaultAuthConfirmSignInOptions();
    }

    /* JADX INFO: loaded from: classes21.dex */
    public static final class DefaultAuthConfirmSignInOptions extends AuthConfirmSignInOptions {
        private DefaultAuthConfirmSignInOptions() {
        }

        public int hashCode() {
            return DefaultAuthConfirmSignInOptions.class.hashCode();
        }

        public boolean equals(@Nullable Object obj) {
            return obj instanceof DefaultAuthConfirmSignInOptions;
        }

        public String toString() {
            return DefaultAuthConfirmSignInOptions.class.getSimpleName();
        }
    }
}
