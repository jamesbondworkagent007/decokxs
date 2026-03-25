package com.okinc.kline.ui;

import android.graphics.Bitmap;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C36246oUr;
import o.C56391yDq;
import o.C56442yFn;
import o.ViewOnClickListenerC38532pbH;

/* JADX INFO: loaded from: classes8.dex */
public final class KLineCompareFullScreenFragment$setCompareBitmap$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ ViewOnClickListenerC38532pbH this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KLineCompareFullScreenFragment$setCompareBitmap$1(ViewOnClickListenerC38532pbH viewOnClickListenerC38532pbH, Continuation<? super KLineCompareFullScreenFragment$setCompareBitmap$1> continuation) {
        super(2, continuation);
        this.this$0 = viewOnClickListenerC38532pbH;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new KLineCompareFullScreenFragment$setCompareBitmap$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((KLineCompareFullScreenFragment$setCompareBitmap$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            ViewOnClickListenerC38532pbH viewOnClickListenerC38532pbH = this.this$0;
            this.label = 1;
            obj = viewOnClickListenerC38532pbH.OLrzqt((Continuation<? super List<Bitmap>>) this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        C36246oUr.copydefault().zLjUOn().setCompareBitmapList((List) obj);
        return Unit.INSTANCE;
    }
}
