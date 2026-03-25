package com.okinc.debugbox.track.report;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class ReportMonitorManager$reportDataAdapter$1 extends FunctionReferenceImpl implements Function1<Integer, Unit> {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ReportMonitorManager$reportDataAdapter$1(Object obj) {
        super(1, obj, ReportMonitorManager.class, "onItemClick", "onItemClick(I)V", 0);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // kotlin.jvm.functions.Function1
    public /* synthetic */ Unit invoke(Integer num) {
        invoke(num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(int i) {
        ((ReportMonitorManager) this.receiver).OLrzqt(i);
    }
}
