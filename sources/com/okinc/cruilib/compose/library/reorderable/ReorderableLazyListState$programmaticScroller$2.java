package com.okinc.cruilib.compose.library.reorderable;

import androidx.compose.foundation.lazy.LazyListItemInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import o.mEL;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class ReorderableLazyListState$programmaticScroller$2 extends FunctionReferenceImpl implements Function2<LazyListItemInfo, LazyListItemInfo, Unit> {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ReorderableLazyListState$programmaticScroller$2(Object obj) {
        super(2, obj, mEL.class, "swapItems", "swapItems(Landroidx/compose/foundation/lazy/LazyListItemInfo;Landroidx/compose/foundation/lazy/LazyListItemInfo;)V", 0);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(LazyListItemInfo lazyListItemInfo, LazyListItemInfo lazyListItemInfo2) {
        invoke2(lazyListItemInfo, lazyListItemInfo2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(LazyListItemInfo lazyListItemInfo, LazyListItemInfo lazyListItemInfo2) {
        Intrinsics.checkNotNullParameter(lazyListItemInfo, "");
        Intrinsics.checkNotNullParameter(lazyListItemInfo2, "");
        ((mEL) this.receiver).copydefault(lazyListItemInfo, lazyListItemInfo2);
    }
}
