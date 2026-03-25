package com.okinc.business.invest_biz.mln.vm;

import androidx.lifecycle.ViewModelKt;
import kotlin.jvm.internal.Intrinsics;
import o.C23931iOq;
import o.C26492jdO;
import o.C27493jwI;
import o.iOK;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class DeFiMiniDetailsCacheBonsInfoViewModel extends iOK {
    public final C23931iOq AEQbTJ;
    public final C26492jdO OLrzqt;

    @yCM
    public DeFiMiniDetailsCacheBonsInfoViewModel(@NotNull C23931iOq c23931iOq, @NotNull C26492jdO c26492jdO) {
        Intrinsics.checkNotNullParameter(c23931iOq, "");
        Intrinsics.checkNotNullParameter(c26492jdO, "");
        this.AEQbTJ = c23931iOq;
        this.OLrzqt = c26492jdO;
    }

    @Override // o.iOK
    public void EZpvd(long j) {
        C27493jwI.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new DeFiMiniDetailsCacheBonsInfoViewModel$loadData$1(this, j, null), 3, null);
    }
}
