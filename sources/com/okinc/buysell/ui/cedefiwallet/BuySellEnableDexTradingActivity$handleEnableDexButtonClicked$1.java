package com.okinc.buysell.ui.cedefiwallet;

import com.okinc.buysell.data.cedefi.BuySellDexCreateWalletResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class BuySellEnableDexTradingActivity$handleEnableDexButtonClicked$1 extends FunctionReferenceImpl implements Function1<BuySellDexCreateWalletResult, Unit> {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public BuySellEnableDexTradingActivity$handleEnableDexButtonClicked$1(Object obj) {
        super(1, obj, BuySellEnableDexTradingActivity.class, "handleWalletCreationResult", "handleWalletCreationResult(Lcom/okinc/buysell/data/cedefi/BuySellDexCreateWalletResult;)V", 0);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(BuySellDexCreateWalletResult buySellDexCreateWalletResult) {
        invoke2(buySellDexCreateWalletResult);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(BuySellDexCreateWalletResult buySellDexCreateWalletResult) {
        Intrinsics.checkNotNullParameter(buySellDexCreateWalletResult, "");
        ((BuySellEnableDexTradingActivity) this.receiver).EZpvd(buySellDexCreateWalletResult);
    }
}
