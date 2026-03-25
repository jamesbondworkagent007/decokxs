package com.okinc.business.market.market.fragment.watchlist;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import o.kIH;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class WatchListNewQuoteFragment$initTouchDrag$1$2 extends FunctionReferenceImpl implements Function2<Integer, Integer, Unit> {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public WatchListNewQuoteFragment$initTouchDrag$1$2(Object obj) {
        super(2, obj, kIH.class, "onItemMove", "onItemMove(II)V", 0);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // kotlin.jvm.functions.Function2
    public /* synthetic */ Unit invoke(Integer num, Integer num2) {
        invoke(num.intValue(), num2.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(int i, int i2) {
        ((kIH) this.receiver).KWHzl(i, i2);
    }
}
