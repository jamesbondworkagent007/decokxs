package com.okinc.kline.ui;

import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.C36246oUr;
import o.C56391yDq;
import o.C56442yFn;
import o.ViewOnClickListenerC38857phO;
import o.pDX;
import o.uBU;

/* JADX INFO: loaded from: classes8.dex */
public final class MarketKlinePortraitFragment$initView$9$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int I$0;
    int label;
    final /* synthetic */ ViewOnClickListenerC38857phO this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarketKlinePortraitFragment$initView$9$1(ViewOnClickListenerC38857phO viewOnClickListenerC38857phO, Continuation<? super MarketKlinePortraitFragment$initView$9$1> continuation) {
        super(2, continuation);
        this.this$0 = viewOnClickListenerC38857phO;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MarketKlinePortraitFragment$initView$9$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MarketKlinePortraitFragment$initView$9$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = this.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            if (pDX.AEQbTJ.AEQbTJ() && !Intrinsics.EZpvd((Object) this.this$0.fIwbmz(), (Object) "OPTION")) {
                int i3 = !C36246oUr.copydefault().zLjUOn().isCeFiMCapMode() ? 1 : 0;
                uBU ubuIsConnected = this.this$0.isConnected();
                String strFIwbmz = this.this$0.fIwbmz();
                if (strFIwbmz == null) {
                    strFIwbmz = "";
                }
                this.I$0 = i3;
                this.label = 1;
                Object objOLrzqt = ubuIsConnected.OLrzqt(strFIwbmz, this);
                if (objOLrzqt == objCopydefault) {
                    return objCopydefault;
                }
                i = i3;
                obj = objOLrzqt;
            }
            return Unit.INSTANCE;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        i = this.I$0;
        C56391yDq.AEQbTJ(obj);
        Pair pair = (Pair) obj;
        boolean zBooleanValue = ((Boolean) pair.getFirst()).booleanValue();
        this.this$0.gEmmrt = (String) pair.getSecond();
        this.this$0.AEQbTJ(i != 0, !zBooleanValue);
        return Unit.INSTANCE;
    }
}
