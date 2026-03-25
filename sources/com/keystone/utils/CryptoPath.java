package com.keystone.utils;

import com.keystone.module.HDPath;
import com.keystone.sdk.KeystoneBaseSDK;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
public final class CryptoPath extends KeystoneBaseSDK {
    public final HDPath parseHDPath(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return (HDPath) KeystoneBaseSDK.fromJson$default(this, getNative$library_release().parseHDPath(str), HDPath.class, null, 4, null);
    }
}
