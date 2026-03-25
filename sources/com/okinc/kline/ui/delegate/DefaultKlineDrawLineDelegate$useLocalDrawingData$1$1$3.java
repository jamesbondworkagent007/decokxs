package com.okinc.kline.ui.delegate;

import com.okinc.kline.library.drawline.DrawLineData;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;
import o.C36250oUv;
import o.C37897pEt;
import o.C39295ppc;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes8.dex */
public final class DefaultKlineDrawLineDelegate$useLocalDrawingData$1$1$3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Ref.ObjectRef<ArrayList<DrawLineData.DrawLineItem>> $allList;
    final /* synthetic */ C36250oUv $chartView;
    Object L$0;
    int label;
    final /* synthetic */ C39295ppc this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultKlineDrawLineDelegate$useLocalDrawingData$1$1$3(Ref.ObjectRef<ArrayList<DrawLineData.DrawLineItem>> objectRef, C39295ppc c39295ppc, C36250oUv c36250oUv, Continuation<? super DefaultKlineDrawLineDelegate$useLocalDrawingData$1$1$3> continuation) {
        super(2, continuation);
        this.$allList = objectRef;
        this.this$0 = c39295ppc;
        this.$chartView = c36250oUv;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DefaultKlineDrawLineDelegate$useLocalDrawingData$1$1$3(this.$allList, this.this$0, this.$chartView, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((DefaultKlineDrawLineDelegate$useLocalDrawingData$1$1$3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r5v2, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r5v3, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r5v7, resolved type: T */
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
        this.this$0.AEQbTJ(this.$chartView, (ArrayList<DrawLineData.DrawLineItem>) this.$allList.element);
        return Unit.INSTANCE;
    }
}
