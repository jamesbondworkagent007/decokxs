package com.okinc.business.trade.features.home.ui.cefi.placeorder.strategy;

import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C30626leh;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.yHS;

/* JADX INFO: loaded from: classes7.dex */
public final class BaseAdvancedOrderStrategy$observeTradeChanges$2 extends SuspendLambda implements yHS<C30626leh, List<? extends String>, Boolean, String, Continuation<? super C30626leh>, Object> {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    /* synthetic */ Object L$2;
    /* synthetic */ boolean Z$0;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public BaseAdvancedOrderStrategy$observeTradeChanges$2(Continuation<? super BaseAdvancedOrderStrategy$observeTradeChanges$2> continuation) {
        super(5, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object] */
    @Override // o.yHS
    public /* synthetic */ Object invoke(C30626leh c30626leh, List<? extends String> list, Boolean bool, String str, Continuation<? super C30626leh> continuation) {
        return invoke(c30626leh, (List<String>) list, bool.booleanValue(), str, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Object invoke(C30626leh c30626leh, List<String> list, boolean z, String str, Continuation<? super C30626leh> continuation) {
        BaseAdvancedOrderStrategy$observeTradeChanges$2 baseAdvancedOrderStrategy$observeTradeChanges$2 = new BaseAdvancedOrderStrategy$observeTradeChanges$2(continuation);
        baseAdvancedOrderStrategy$observeTradeChanges$2.L$0 = c30626leh;
        baseAdvancedOrderStrategy$observeTradeChanges$2.L$1 = list;
        baseAdvancedOrderStrategy$observeTradeChanges$2.Z$0 = z;
        baseAdvancedOrderStrategy$observeTradeChanges$2.L$2 = str;
        return baseAdvancedOrderStrategy$observeTradeChanges$2.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            C30626leh c30626leh = (C30626leh) this.L$0;
            List list = (List) this.L$1;
            boolean z = this.Z$0;
            return c30626leh.KWHzl((895 & 1) != 0 ? c30626leh.valueOf : null, (895 & 2) != 0 ? c30626leh.EZpvd : null, (895 & 4) != 0 ? c30626leh.AYXKKw : null, (895 & 8) != 0 ? c30626leh.AEQbTJ : null, (895 & 16) != 0 ? c30626leh.AhwBna : null, (895 & 32) != 0 ? c30626leh.OLrzqt : list, (895 & 64) != 0 ? c30626leh.KWHzl : false, (895 & 128) != 0 ? c30626leh.djBIcL : null, (895 & 256) != 0 ? c30626leh.gEmmrt : C56443yFo.KWHzl(z), (895 & 512) != 0 ? c30626leh.copydefault : z ? (String) this.L$2 : null);
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
