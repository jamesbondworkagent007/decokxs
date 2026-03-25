package com.amplifyframework.auth;

import android.content.Context;
import androidx.annotation.NonNull;
import com.amplifyframework.AmplifyException;
import com.amplifyframework.auth.options.AuthVerifyTOTPSetupOptions;
import com.amplifyframework.core.Action;
import com.amplifyframework.core.Consumer;
import com.amplifyframework.core.category.CategoryType;
import com.amplifyframework.core.plugin.Plugin;

/* JADX INFO: loaded from: classes2.dex */
public abstract class AuthPlugin<E> implements AuthCategoryBehavior, Plugin<E> {
    @Override // com.amplifyframework.core.plugin.Plugin
    public void initialize(@NonNull Context context) throws AmplifyException {
    }

    @Override // com.amplifyframework.core.category.CategoryTypeable
    public final CategoryType getCategoryType() {
        return CategoryType.AUTH;
    }

    @Override // com.amplifyframework.auth.AuthCategoryBehavior
    public void setUpTOTP(@NonNull Consumer<TOTPSetupDetails> consumer, @NonNull Consumer<AuthException> consumer2) {
        throw new UnsupportedOperationException("TOTP is not implemented in this plugin");
    }

    @Override // com.amplifyframework.auth.AuthCategoryBehavior
    public void verifyTOTPSetup(@NonNull String str, @NonNull Action action, @NonNull Consumer<AuthException> consumer) {
        throw new UnsupportedOperationException("TOTP is not implemented in this plugin");
    }

    @Override // com.amplifyframework.auth.AuthCategoryBehavior
    public void verifyTOTPSetup(@NonNull String str, @NonNull AuthVerifyTOTPSetupOptions authVerifyTOTPSetupOptions, @NonNull Action action, @NonNull Consumer<AuthException> consumer) {
        throw new UnsupportedOperationException("TOTP is not implemented in this plugin");
    }
}
