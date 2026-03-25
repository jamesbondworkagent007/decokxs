package com.amplifyframework.auth.options;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes14.dex */
public abstract class AuthUpdateUserAttributeOptions {

    /* JADX INFO: loaded from: classes21.dex */
    public static abstract class Builder<T extends Builder<T>> {
        public abstract AuthUpdateUserAttributeOptions build();

        public abstract T getThis();
    }

    public static DefaultAuthUpdateUserAttributeOptions defaults() {
        return new DefaultAuthUpdateUserAttributeOptions();
    }

    /* JADX INFO: loaded from: classes21.dex */
    public static final class DefaultAuthUpdateUserAttributeOptions extends AuthUpdateUserAttributeOptions {
        private DefaultAuthUpdateUserAttributeOptions() {
        }

        public int hashCode() {
            return DefaultAuthUpdateUserAttributeOptions.class.hashCode();
        }

        public boolean equals(@Nullable Object obj) {
            return obj instanceof DefaultAuthUpdateUserAttributeOptions;
        }

        public String toString() {
            return DefaultAuthUpdateUserAttributeOptions.class.getSimpleName();
        }
    }
}
