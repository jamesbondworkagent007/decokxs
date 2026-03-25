package com.reown.android.internal.common.modal.data.model;

import android.net.Uri;

/* JADX INFO: loaded from: classes24.dex */
public final class WalletKt {
    public static final String extractPackage(String str) {
        return Uri.parse(str).getQueryParameter("id");
    }
}
