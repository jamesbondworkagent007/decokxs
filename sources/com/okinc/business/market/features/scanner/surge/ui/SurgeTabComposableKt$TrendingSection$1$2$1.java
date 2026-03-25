package com.okinc.business.market.features.scanner.surge.ui;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import o.C29347krt;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class SurgeTabComposableKt$TrendingSection$1$2$1 extends FunctionReferenceImpl implements Function1<FilterType, Unit> {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public SurgeTabComposableKt$TrendingSection$1$2$1(Object obj) {
        super(1, obj, C29347krt.class, "onRemoveFilter", "onRemoveFilter(Lcom/okinc/business/market/features/scanner/surge/ui/SurgeTabViewModel;Lcom/okinc/business/market/features/scanner/surge/ui/FilterType;)V", 1);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(FilterType filterType) {
        invoke2(filterType);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(FilterType filterType) {
        Intrinsics.checkNotNullParameter(filterType, "");
        C29347krt.AEQbTJ((SurgeTabViewModel) this.receiver, filterType);
    }
}
