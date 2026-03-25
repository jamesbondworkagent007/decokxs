package com.okinc.unify_trade.trade.source.watch;

import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import o.xUG;

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class WatchMarketDataSource$initWatch$1$pair$1 extends FunctionReferenceImpl implements Function2<LinkedHashMap<String, String>, String, Unit> {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public WatchMarketDataSource$initWatch$1$pair$1(Object obj) {
        super(2, obj, xUG.class, "putCoinsMap", "putCoinsMap(Ljava/util/LinkedHashMap;Ljava/lang/String;)V", 0);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(LinkedHashMap<String, String> linkedHashMap, String str) {
        invoke2(linkedHashMap, str);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(LinkedHashMap<String, String> linkedHashMap, String str) {
        Intrinsics.checkNotNullParameter(linkedHashMap, "");
        Intrinsics.checkNotNullParameter(str, "");
        ((xUG) this.receiver).KWHzl(linkedHashMap, str);
    }
}
