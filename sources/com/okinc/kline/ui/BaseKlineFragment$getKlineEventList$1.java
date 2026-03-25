package com.okinc.kline.ui;

import com.okinc.kline.data.KLineEventBean;
import com.okinc.kline.library.data.ChartViewOutSideConfig;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C33129mqd;
import o.C36250oUv;
import o.C56391yDq;
import o.C56404yEc;
import o.C56442yFn;
import o.C56443yFo;
import o.InterfaceC39563puh;
import o.oLY;
import o.oYA;
import o.pED;

/* JADX INFO: loaded from: classes8.dex */
public final class BaseKlineFragment$getKlineEventList$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ List<oLY> $data;
    int label;
    final /* synthetic */ oYA this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.List<? extends o.oLY> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public BaseKlineFragment$getKlineEventList$1(oYA oya, List<? extends oLY> list, Continuation<? super BaseKlineFragment$getKlineEventList$1> continuation) {
        super(2, continuation);
        this.this$0 = oya;
        this.$data = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BaseKlineFragment$getKlineEventList$1(this.this$0, this.$data, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((BaseKlineFragment$getKlineEventList$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0055  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        ArrayList<KLineEventBean> arrayList;
        ChartViewOutSideConfig chartViewOutSideConfigAkhnZx;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC39563puh.StateListAnimator stateListAnimatorDNCPSb = this.this$0.dNCPSb();
            if (stateListAnimatorDNCPSb != null) {
                pED ped = pED.KWHzl;
                String strGEmmrt = C33129mqd.gEmmrt(C56443yFo.KWHzl(ped.AEQbTJ(1)));
                String strGEmmrt2 = C33129mqd.gEmmrt(C56443yFo.KWHzl(((oLY) CollectionsKt___CollectionsKt.AubY(this.$data)).EZpvd));
                String strEZpvd = ped.EZpvd();
                this.label = 1;
                obj = stateListAnimatorDNCPSb.KWHzl(strGEmmrt, strGEmmrt2, strEZpvd, this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                arrayList = null;
                if (arrayList != null) {
                    oYA oya = this.this$0;
                    C56404yEc.zsXlph(arrayList);
                    C36250oUv c36250oUv = oya.DTwDnp;
                    if (c36250oUv != null && (chartViewOutSideConfigAkhnZx = c36250oUv.AkhnZx()) != null) {
                        chartViewOutSideConfigAkhnZx.setKlineEventList(arrayList);
                        oya.zuBGHE().OLrzqt(arrayList);
                        C36250oUv c36250oUv2 = oya.DTwDnp;
                        if (c36250oUv2 != null) {
                            c36250oUv2.invalidate();
                        }
                    }
                }
                return Unit.INSTANCE;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        arrayList = (ArrayList) obj;
        if (arrayList != null) {
        }
        return Unit.INSTANCE;
    }
}
