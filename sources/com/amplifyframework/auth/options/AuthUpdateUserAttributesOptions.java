package com.amplifyframework.auth.options;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes14.dex */
public abstract class AuthUpdateUserAttributesOptions {

    /* JADX INFO: loaded from: classes21.dex */
    public static abstract class Builder<T extends Builder<T>> {
        public abstract AuthUpdateUserAttributesOptions build();

        public abstract T getThis();
    }

    public static DefaultAuthUpdateUserAttributesOptions defaults() {
        return new DefaultAuthUpdateUserAttributesOptions();
    }

    /* JADX INFO: loaded from: classes21.dex */
    public static final class DefaultAuthUpdateUserAttributesOptions extends AuthUpdateUserAttributesOptions {
        private DefaultAuthUpdateUserAttributesOptions() {
        }

        public int hashCode() {
            return DefaultAuthUpdateUserAttributesOptions.class.hashCode();
        }

        public boolean equals(@Nullable Object obj) {
            return obj instanceof DefaultAuthUpdateUserAttributesOptions;
        }

        public String toString() {
            return DefaultAuthUpdateUserAttributesOptions.class.getSimpleName();
        }
    }
}
