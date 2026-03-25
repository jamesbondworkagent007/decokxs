package com.okinc.web3.security.utils.internal;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public interface WrapUtilsBase {
    SupportLevel getSupportLevel();

    void init();

    boolean isHardwareBacked();

    byte[] unwrap(@NotNull byte[] bArr);

    byte[] wrap(@NotNull byte[] bArr);
}
