package com.okinc.business.invest_biz.ui.screens.product_details.bonus_info;

import androidx.lifecycle.ViewModelKt;
import kotlin.jvm.internal.Intrinsics;
import o.C26492jdO;
import o.C27493jwI;
import o.iEM;
import o.iOK;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class ProductDetailsBonusInfoViewModel extends iOK {
    public final iEM AEQbTJ;
    public final C26492jdO OLrzqt;

    @yCM
    public ProductDetailsBonusInfoViewModel(@NotNull iEM iem, @NotNull C26492jdO c26492jdO) {
        Intrinsics.checkNotNullParameter(iem, "");
        Intrinsics.checkNotNullParameter(c26492jdO, "");
        this.AEQbTJ = iem;
        this.OLrzqt = c26492jdO;
    }

    @Override // o.iOK
    public void EZpvd(long j) {
        C27493jwI.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new ProductDetailsBonusInfoViewModel$loadData$1(this, j, null), 3, null);
    }
}
