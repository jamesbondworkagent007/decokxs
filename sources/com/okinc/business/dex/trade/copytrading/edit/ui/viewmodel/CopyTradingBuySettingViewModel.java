package com.okinc.business.dex.trade.copytrading.edit.ui.viewmodel;

import kotlin.jvm.internal.Intrinsics;
import o.C19866gSf;
import o.kKG;
import o.kVP;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class CopyTradingBuySettingViewModel extends CopyTradingBaseBuySettingViewModel {
    public final kKG AYXKKw;
    public final C19866gSf gEmmrt;
    public final kVP valueOf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @yCM
    public CopyTradingBuySettingViewModel(@NotNull C19866gSf c19866gSf, @NotNull kVP kvp, @NotNull kKG kkg) {
        super(c19866gSf, kvp, kkg);
        Intrinsics.checkNotNullParameter(c19866gSf, "");
        Intrinsics.checkNotNullParameter(kvp, "");
        Intrinsics.checkNotNullParameter(kkg, "");
        this.gEmmrt = c19866gSf;
        this.valueOf = kvp;
        this.AYXKKw = kkg;
    }
}
