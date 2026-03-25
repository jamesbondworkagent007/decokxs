package com.okinc.kline.ui.earn;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.FlowLiveDataConversions;
import com.okinc.unify_trade.biz.TradeCoinInfo;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import o.C33129mqd;
import o.C39408prk;
import o.C39409prl;
import o.C39417pru;
import o.C43296rmc;
import o.C56391yDq;
import o.C56402yEa;
import o.C56442yFn;
import o.C56443yFo;
import o.C59534zip;
import o.InterfaceC54581xNr;
import o.pWO;
import o.rVN;

/* JADX INFO: loaded from: classes18.dex */
public final class CoinEarnFragment$onCreate$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ C39409prl this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoinEarnFragment$onCreate$1(C39409prl c39409prl, Continuation<? super CoinEarnFragment$onCreate$1> continuation) {
        super(2, continuation);
        this.this$0 = c39409prl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CoinEarnFragment$onCreate$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CoinEarnFragment$onCreate$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.okinc.kline.ui.earn.CoinEarnFragment$onCreate$1$2, reason: invalid class name */
    public static final class AnonymousClass2<T> implements FlowCollector {
        public final /* synthetic */ C39409prl copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AnonymousClass2(C39409prl c39409prl) {
            this.copydefault = c39409prl;
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(Pair<String, String> pair, Continuation<? super Unit> continuation) throws Throwable {
            CoinEarnFragment$onCreate$1$1$emit$1 coinEarnFragment$onCreate$1$1$emit$1;
            C39409prl c39409prl;
            TradeCoinInfo tradeCoinInfoAhwBna;
            String id;
            if (continuation instanceof CoinEarnFragment$onCreate$1$1$emit$1) {
                coinEarnFragment$onCreate$1$1$emit$1 = (CoinEarnFragment$onCreate$1$1$emit$1) continuation;
                int i = coinEarnFragment$onCreate$1$1$emit$1.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    coinEarnFragment$onCreate$1$1$emit$1.label = i - Integer.MIN_VALUE;
                } else {
                    coinEarnFragment$onCreate$1$1$emit$1 = new CoinEarnFragment$onCreate$1$1$emit$1(this, continuation);
                }
            }
            Object objEZpvd = coinEarnFragment$onCreate$1$1$emit$1.result;
            Object objCopydefault = C56442yFn.copydefault();
            int i2 = coinEarnFragment$onCreate$1$1$emit$1.label;
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objEZpvd);
                InterfaceC54581xNr interfaceC54581xNrOLrzqt = pWO.KWHzl().OLrzqt();
                Integer numAEQbTJ = (interfaceC54581xNrOLrzqt == null || (tradeCoinInfoAhwBna = interfaceC54581xNrOLrzqt.AhwBna(pair.getFirst())) == null || (id = tradeCoinInfoAhwBna.getId()) == null) ? null : C56443yFo.AEQbTJ(C33129mqd.AhwBna(id));
                this.copydefault.AEQbTJ().AEQbTJ(pair.getFirst());
                if (numAEQbTJ != null) {
                    c39409prl = this.copydefault;
                    int iIntValue = numAEQbTJ.intValue();
                    C39408prk c39408prkAEQbTJ = c39409prl.AEQbTJ();
                    coinEarnFragment$onCreate$1$1$emit$1.L$0 = numAEQbTJ;
                    coinEarnFragment$onCreate$1$1$emit$1.L$1 = c39409prl;
                    coinEarnFragment$onCreate$1$1$emit$1.label = 1;
                    objEZpvd = c39408prkAEQbTJ.EZpvd(String.valueOf(iIntValue), coinEarnFragment$onCreate$1$1$emit$1);
                    if (objEZpvd == objCopydefault) {
                        return objCopydefault;
                    }
                }
                return Unit.INSTANCE;
            }
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c39409prl = (C39409prl) coinEarnFragment$onCreate$1$1$emit$1.L$1;
            C56391yDq.AEQbTJ(objEZpvd);
            List list = (List) objEZpvd;
            if (list.isEmpty()) {
                C59534zip c59534zipEZpvd = c39409prl.EZpvd();
                if (c59534zipEZpvd != null) {
                    c59534zipEZpvd.setItems(C56402yEa.EZpvd(Unit.INSTANCE));
                }
            } else {
                C59534zip c59534zipEZpvd2 = c39409prl.EZpvd();
                if (c59534zipEZpvd2 != null) {
                    c59534zipEZpvd2.setItems(c39409prl.AEQbTJ().copydefault((C39417pru) CollectionsKt___CollectionsKt.AuCTelauCTel(list)));
                }
            }
            C59534zip c59534zipEZpvd3 = c39409prl.EZpvd();
            if (c59534zipEZpvd3 != null) {
                c59534zipEZpvd3.notifyDataSetChanged();
            }
            rVN.reportFullyDrawn$default((Fragment) c39409prl, true, (String) null, 2, (Object) null);
            C43296rmc.EZpvd(c39409prl.getTAG(), "get result \n " + list);
            return Unit.INSTANCE;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            Flow flowConflate = FlowKt.conflate(FlowLiveDataConversions.asFlow(this.this$0.copydefault().ejfBZ()));
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0);
            this.label = 1;
            if (flowConflate.collect(anonymousClass2, this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return Unit.INSTANCE;
    }
}
