package com.amplifyframework.auth.cognito.data;

import android.content.Context;
import com.amplifyframework.core.store.EncryptedKeyValueRepository;
import com.amplifyframework.core.store.InMemoryKeyValueRepository;
import com.amplifyframework.core.store.KeyValueRepository;
import kotlin.jvm.internal.Intrinsics;
import o.C59449zhJ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class KeyValueRepositoryFactory {
    public static /* synthetic */ KeyValueRepository create$default(KeyValueRepositoryFactory keyValueRepositoryFactory, Context context, String str, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = true;
        }
        return keyValueRepositoryFactory.create(context, str, z);
    }

    public final KeyValueRepository create(@NotNull Context context, @NotNull String str, boolean z) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        if (Intrinsics.EZpvd((Object) str, (Object) AWSCognitoAuthCredentialStore.awsKeyValueStoreIdentifier)) {
            if (z) {
                return new EncryptedKeyValueRepository(context, str);
            }
            return new InMemoryKeyValueRepository();
        }
        if (Intrinsics.EZpvd((Object) str, (Object) AWSCognitoLegacyCredentialStore.AWS_KEY_VALUE_STORE_NAMESPACE_IDENTIFIER) || Intrinsics.EZpvd((Object) str, (Object) AWSCognitoLegacyCredentialStore.APP_TOKENS_INFO_CACHE) || Intrinsics.EZpvd((Object) str, (Object) AWSCognitoLegacyCredentialStore.AWS_MOBILE_CLIENT_PROVIDER) || C59449zhJ.startsWith$default(str, AWSCognitoLegacyCredentialStore.APP_DEVICE_INFO_CACHE, false, 2, null)) {
            return new LegacyKeyValueRepository(context, str, false, 4, null);
        }
        return new InMemoryKeyValueRepository();
    }
}
