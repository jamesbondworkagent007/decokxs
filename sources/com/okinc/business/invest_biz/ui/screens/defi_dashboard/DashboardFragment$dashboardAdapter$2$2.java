package com.okinc.business.invest_biz.ui.screens.defi_dashboard;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC27286jsN;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class DashboardFragment$dashboardAdapter$2$2 extends FunctionReferenceImpl implements Function1<InterfaceC27286jsN.PendingIntent, Unit> {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public DashboardFragment$dashboardAdapter$2$2(Object obj) {
        super(1, obj, DashboardFragment.class, "toggleProtocolDetails", "toggleProtocolDetails(Lcom/okinc/business/invest_biz/ui/widget/defi_dashboard/DashboardClickAction$ViewProtocolDetails;)V", 0);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC27286jsN.PendingIntent pendingIntent) {
        invoke2(pendingIntent);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(InterfaceC27286jsN.PendingIntent pendingIntent) {
        Intrinsics.checkNotNullParameter(pendingIntent, "");
        ((DashboardFragment) this.receiver).KWHzl(pendingIntent);
    }
}
