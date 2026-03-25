package com.okinc.business.market.features.floatwindow.state;

import com.okinc.business.market.features.floatwindow.DexFloatWindowManager;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;
import o.jWQ;

/* JADX INFO: loaded from: classes7.dex */
public final class FloatWindowStateManager$saveWindowState$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ DexFloatWindowManager.DexFloatWindowMode $mode;
    final /* synthetic */ boolean $wasVisible;
    final /* synthetic */ int $x;
    final /* synthetic */ int $y;
    int label;
    final /* synthetic */ jWQ this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FloatWindowStateManager$saveWindowState$2(jWQ jwq, boolean z, DexFloatWindowManager.DexFloatWindowMode dexFloatWindowMode, int i, int i2, Continuation<? super FloatWindowStateManager$saveWindowState$2> continuation) {
        super(2, continuation);
        this.this$0 = jwq;
        this.$wasVisible = z;
        this.$mode = dexFloatWindowMode;
        this.$x = i;
        this.$y = i2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FloatWindowStateManager$saveWindowState$2(this.this$0, this.$wasVisible, this.$mode, this.$x, this.$y, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((FloatWindowStateManager$saveWindowState$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            jWQ jwq = this.this$0;
            boolean z = this.$wasVisible;
            DexFloatWindowManager.DexFloatWindowMode dexFloatWindowMode = this.$mode;
            int i2 = this.$x;
            int i3 = this.$y;
            this.label = 1;
            if (jwq.AEQbTJ(z, dexFloatWindowMode, i2, i3, this) == objCopydefault) {
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
