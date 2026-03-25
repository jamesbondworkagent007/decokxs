package com.reown.android.utils;

import kotlin.jvm.internal.Intrinsics;
import o.C60134zwX;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class TimberKt {
    public static final void plantTimber() {
    }

    /* JADX INFO: renamed from: com.reown.android.utils.TimberKt$plantTimber$1, reason: invalid class name */
    public static final class AnonymousClass1 extends C60134zwX.StateListAnimator {
        @Override // o.C60134zwX.StateListAnimator, o.C60134zwX.Application
        public void log(int i, String str, @NotNull String str2, Throwable th) {
            Intrinsics.checkNotNullParameter(str2, "");
            super.log(i, "WalletConnectV2", str2, th);
        }
    }
}
