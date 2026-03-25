package com.okinc.business.invest_biz.ui.screens.transaction.invest;

import com.okinc.business.invest_biz.data.bean.InvestTransactionLossInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import o.C26640jgD;

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class InvestSubscriptionFragment$transactionDetailAdapter$2$1 extends FunctionReferenceImpl implements Function1<InvestTransactionLossInfo, Unit> {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public InvestSubscriptionFragment$transactionDetailAdapter$2$1(Object obj) {
        super(1, obj, C26640jgD.class, "showTransactionLossDialog", "showTransactionLossDialog(Lcom/okinc/business/invest_biz/data/bean/InvestTransactionLossInfo;)V", 0);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(InvestTransactionLossInfo investTransactionLossInfo) {
        invoke2(investTransactionLossInfo);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(InvestTransactionLossInfo investTransactionLossInfo) {
        Intrinsics.checkNotNullParameter(investTransactionLossInfo, "");
        ((C26640jgD) this.receiver).KWHzl(investTransactionLossInfo);
    }
}
