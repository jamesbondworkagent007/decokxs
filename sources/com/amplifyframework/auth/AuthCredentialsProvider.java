package com.amplifyframework.auth;

import com.amplifyframework.annotations.InternalApiWarning;
import com.amplifyframework.core.Consumer;
import kotlin.coroutines.Continuation;
import o.InterfaceC52805wZ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@InternalApiWarning
public interface AuthCredentialsProvider extends InterfaceC52805wZ {
    void getAccessToken(@NotNull Consumer<String> consumer, @NotNull Consumer<Exception> consumer2);

    Object getIdentityId(@NotNull Continuation<? super String> continuation);
}
