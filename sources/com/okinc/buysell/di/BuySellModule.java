package com.okinc.buysell.di;

import android.content.Context;
import com.google.android.gms.wallet.PaymentsClient;
import kotlin.jvm.internal.Intrinsics;
import o.lTW;
import o.yCR;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class BuySellModule {
    public static final BuySellModule KWHzl = new BuySellModule();

    private BuySellModule() {
    }

    @yCR
    public final PaymentsClient copydefault(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        return lTW.KWHzl.EZpvd(context);
    }
}
