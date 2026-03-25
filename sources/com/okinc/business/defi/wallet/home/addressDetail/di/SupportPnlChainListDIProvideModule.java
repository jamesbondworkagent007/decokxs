package com.okinc.business.defi.wallet.home.addressDetail.di;

import android.content.Context;
import com.okinc.business.defi.biz.database.extra.ExtraDatabase;
import kotlin.jvm.internal.Intrinsics;
import o.C11285cIo;
import o.cHZ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class SupportPnlChainListDIProvideModule {
    public static final SupportPnlChainListDIProvideModule EZpvd = new SupportPnlChainListDIProvideModule();

    private SupportPnlChainListDIProvideModule() {
    }

    public final cHZ AEQbTJ(@NotNull ExtraDatabase extraDatabase) {
        Intrinsics.checkNotNullParameter(extraDatabase, "");
        return extraDatabase.fARcdN();
    }

    public final C11285cIo EZpvd(@NotNull cHZ chz) {
        Intrinsics.checkNotNullParameter(chz, "");
        return new C11285cIo(chz, null, 2, 0 == true ? 1 : 0);
    }

    public final ExtraDatabase copydefault(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        return ExtraDatabase.Companion.AEQbTJ(context);
    }
}
