package com.okinc.business.defi.wallet.home.addressDetail.viewmodel;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC33073mpa;
import o.eWZ;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class WalletSelfAddressCheckerViewModel extends AbstractC33073mpa {
    public final eWZ AEQbTJ;

    @yCM
    public WalletSelfAddressCheckerViewModel(@NotNull eWZ ewz) {
        Intrinsics.checkNotNullParameter(ewz, "");
        this.AEQbTJ = ewz;
    }

    public final Object OLrzqt(@NotNull String str, @NotNull Continuation<? super Boolean> continuation) {
        return this.AEQbTJ.OLrzqt(str, continuation);
    }
}
