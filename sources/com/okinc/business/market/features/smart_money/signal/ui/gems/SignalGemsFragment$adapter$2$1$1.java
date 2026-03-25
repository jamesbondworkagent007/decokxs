package com.okinc.business.market.features.smart_money.signal.ui.gems;

import com.okinc.business.market.features.smart_money.signal.ui.model.SignalGemsCardsUiModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import o.C29571kwE;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class SignalGemsFragment$adapter$2$1$1 extends FunctionReferenceImpl implements Function1<SignalGemsCardsUiModel, Unit> {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public SignalGemsFragment$adapter$2$1$1(Object obj) {
        super(1, obj, C29571kwE.class, "onGemsItemClick", "onGemsItemClick(Lcom/okinc/business/market/features/smart_money/signal/ui/model/SignalGemsCardsUiModel;)V", 0);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(SignalGemsCardsUiModel signalGemsCardsUiModel) {
        invoke2(signalGemsCardsUiModel);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(SignalGemsCardsUiModel signalGemsCardsUiModel) {
        Intrinsics.checkNotNullParameter(signalGemsCardsUiModel, "");
        ((C29571kwE) this.receiver).copydefault(signalGemsCardsUiModel);
    }
}
