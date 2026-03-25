package com.okinc.localization.report;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import o.C38291pTi;
import o.pSQ;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class LocalizationReportManager$buildProcessor$1$1 extends FunctionReferenceImpl implements Function1<List<C38291pTi>, Unit> {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public LocalizationReportManager$buildProcessor$1$1(Object obj) {
        super(1, obj, pSQ.class, "insertSourceList", "insertSourceList$OKLocalization_localization(Ljava/util/List;)V", 0);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(List<C38291pTi> list) {
        invoke2(list);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(List<C38291pTi> list) {
        Intrinsics.checkNotNullParameter(list, "");
        ((pSQ) this.receiver).OLrzqt(list);
    }
}
