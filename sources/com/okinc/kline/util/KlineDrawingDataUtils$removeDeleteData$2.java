package com.okinc.kline.util;

import com.okinc.kline.library.drawline.DrawLineData;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56406yEe;
import o.C56442yFn;
import o.pUU;

/* JADX INFO: loaded from: classes9.dex */
public final class KlineDrawingDataUtils$removeDeleteData$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ArrayList<DrawLineData.DrawLineItem>>, Object> {
    final /* synthetic */ ArrayList<DrawLineData.DrawLineItem> $drawingList;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KlineDrawingDataUtils$removeDeleteData$2(ArrayList<DrawLineData.DrawLineItem> arrayList, Continuation<? super KlineDrawingDataUtils$removeDeleteData$2> continuation) {
        super(2, continuation);
        this.$drawingList = arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new KlineDrawingDataUtils$removeDeleteData$2(this.$drawingList, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ArrayList<DrawLineData.DrawLineItem>> continuation) {
        return ((KlineDrawingDataUtils$removeDeleteData$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            try {
                C56406yEe.AEQbTJ(this.$drawingList, new Function1() { // from class: o.pEq
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return java.lang.Boolean.valueOf(((DrawLineData.DrawLineItem) obj2).isDelete());
                    }
                });
                return this.$drawingList;
            } catch (Exception e) {
                pUU.copydefault("KlineDrawingDataUtils", "removeDeleteData error: " + e.getMessage());
                return this.$drawingList;
            }
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
