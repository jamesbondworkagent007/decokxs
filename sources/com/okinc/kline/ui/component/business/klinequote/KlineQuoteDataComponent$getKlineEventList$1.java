package com.okinc.kline.ui.component.business.klinequote;

import com.okinc.kline.data.KLineEventBean;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C33129mqd;
import o.C56391yDq;
import o.C56404yEc;
import o.C56442yFn;
import o.C56443yFo;
import o.InterfaceC39563puh;
import o.oLY;
import o.pED;

/* JADX INFO: loaded from: classes8.dex */
public final class KlineQuoteDataComponent$getKlineEventList$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ List<oLY> $data;
    int label;
    final /* synthetic */ KlineQuoteDataComponent this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.List<? extends o.oLY> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public KlineQuoteDataComponent$getKlineEventList$1(KlineQuoteDataComponent klineQuoteDataComponent, List<? extends oLY> list, Continuation<? super KlineQuoteDataComponent$getKlineEventList$1> continuation) {
        super(2, continuation);
        this.this$0 = klineQuoteDataComponent;
        this.$data = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new KlineQuoteDataComponent$getKlineEventList$1(this.this$0, this.$data, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((KlineQuoteDataComponent$getKlineEventList$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0055  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        ArrayList<KLineEventBean> arrayList;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC39563puh.StateListAnimator stateListAnimatorUzCIH = this.this$0.uzCIH();
            if (stateListAnimatorUzCIH != null) {
                pED ped = pED.KWHzl;
                String strGEmmrt = C33129mqd.gEmmrt(C56443yFo.KWHzl(ped.AEQbTJ(1)));
                String strGEmmrt2 = C33129mqd.gEmmrt(C56443yFo.KWHzl(((oLY) CollectionsKt___CollectionsKt.AubY(this.$data)).EZpvd));
                String strEZpvd = ped.EZpvd();
                this.label = 1;
                obj = stateListAnimatorUzCIH.KWHzl(strGEmmrt, strGEmmrt2, strEZpvd, this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                arrayList = null;
                if (arrayList != null) {
                    KlineQuoteDataComponent klineQuoteDataComponent = this.this$0;
                    C56404yEc.zsXlph(arrayList);
                    klineQuoteDataComponent.values().EZpvd(arrayList);
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
