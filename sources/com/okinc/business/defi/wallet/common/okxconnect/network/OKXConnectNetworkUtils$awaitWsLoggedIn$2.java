package com.okinc.business.defi.wallet.common.okxconnect.network;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.TimeoutKt;
import o.C16000ebf;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.C59462zhW;
import o.C59519zia;
import o.pUU;

/* JADX INFO: loaded from: classes4.dex */
public final class OKXConnectNetworkUtils$awaitWsLoggedIn$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
    int label;
    final /* synthetic */ C16000ebf this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OKXConnectNetworkUtils$awaitWsLoggedIn$2(C16000ebf c16000ebf, Continuation<? super OKXConnectNetworkUtils$awaitWsLoggedIn$2> continuation) {
        super(2, continuation);
        this.this$0 = c16000ebf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OKXConnectNetworkUtils$awaitWsLoggedIn$2(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Boolean> continuation) {
        return ((OKXConnectNetworkUtils$awaitWsLoggedIn$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            this.this$0.fIwbmz();
            C59462zhW.Activity activity = C59462zhW.OLrzqt;
            long jAEQbTJ = C59519zia.AEQbTJ(this.this$0.gEmmrt(), DurationUnit.SECONDS);
            OKXConnectNetworkUtils$awaitWsLoggedIn$2$isWsLoggedIn$1 oKXConnectNetworkUtils$awaitWsLoggedIn$2$isWsLoggedIn$1 = new OKXConnectNetworkUtils$awaitWsLoggedIn$2$isWsLoggedIn$1(this.this$0, null);
            this.label = 1;
            obj = TimeoutKt.m7403withTimeoutOrNullKLykuaI(jAEQbTJ, oKXConnectNetworkUtils$awaitWsLoggedIn$2$isWsLoggedIn$1, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        Boolean bool = (Boolean) obj;
        boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
        pUU.KWHzl("OKXConnectNetworkUtils", "isWsLoggedIn: " + zBooleanValue);
        return C56443yFo.KWHzl(zBooleanValue);
    }
}
