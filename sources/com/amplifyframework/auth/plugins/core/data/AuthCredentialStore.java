package com.amplifyframework.auth.plugins.core.data;

import android.content.Context;
import com.amplifyframework.core.store.EncryptedKeyValueRepository;
import com.amplifyframework.core.store.InMemoryKeyValueRepository;
import com.amplifyframework.core.store.KeyValueRepository;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class AuthCredentialStore {
    private final KeyValueRepository keyValue;
    private final String keyValueStoreIdentifier;

    public AuthCredentialStore(@NotNull Context context, @NotNull String str, boolean z) {
        KeyValueRepository inMemoryKeyValueRepository;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        String str2 = "com.amplify.credentialStore." + str;
        this.keyValueStoreIdentifier = str2;
        if (z) {
            inMemoryKeyValueRepository = new EncryptedKeyValueRepository(context, str2);
        } else {
            inMemoryKeyValueRepository = new InMemoryKeyValueRepository();
        }
        this.keyValue = inMemoryKeyValueRepository;
    }

    public final void put(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.keyValue.put(str, str2);
    }

    public final String get(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return this.keyValue.get(str);
    }

    public final void remove(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.keyValue.remove(str);
    }

    public final void removeAll() {
        this.keyValue.removeAll();
    }
}
