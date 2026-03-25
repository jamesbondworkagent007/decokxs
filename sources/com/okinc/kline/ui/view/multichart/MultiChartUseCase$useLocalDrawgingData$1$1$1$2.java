package com.okinc.kline.ui.view.multichart;

import com.okinc.kline.library.drawline.DrawLineData;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;
import o.C37897pEt;
import o.C56391yDq;
import o.C56442yFn;
import o.pAR;

/* JADX INFO: loaded from: classes9.dex */
public final class MultiChartUseCase$useLocalDrawgingData$1$1$1$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Ref.ObjectRef<ArrayList<DrawLineData.DrawLineItem>> $allList;
    Object L$0;
    int label;
    final /* synthetic */ pAR this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultiChartUseCase$useLocalDrawgingData$1$1$1$2(Ref.ObjectRef<ArrayList<DrawLineData.DrawLineItem>> objectRef, pAR par, Continuation<? super MultiChartUseCase$useLocalDrawgingData$1$1$1$2> continuation) {
        super(2, continuation);
        this.$allList = objectRef;
        this.this$0 = par;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MultiChartUseCase$useLocalDrawgingData$1$1$1$2(this.$allList, this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MultiChartUseCase$useLocalDrawgingData$1$1$1$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r5v2, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r5v3, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r5v8, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Ref.ObjectRef<ArrayList<DrawLineData.DrawLineItem>> objectRef;
        T t;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            Ref.ObjectRef<ArrayList<DrawLineData.DrawLineItem>> objectRef2 = this.$allList;
            C37897pEt c37897pEt = C37897pEt.KWHzl;
            ArrayList<DrawLineData.DrawLineItem> arrayList = objectRef2.element;
            this.L$0 = objectRef2;
            this.label = 1;
            Object objOLrzqt = c37897pEt.OLrzqt(arrayList, this);
            if (objOLrzqt == objCopydefault) {
                return objCopydefault;
            }
            objectRef = objectRef2;
            t = objOLrzqt;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            objectRef = (Ref.ObjectRef) this.L$0;
            C56391yDq.AEQbTJ(obj);
            t = obj;
        }
        objectRef.element = t;
        this.this$0.copydefault().OLrzqt(this.$allList.element);
        return Unit.INSTANCE;
    }
}
