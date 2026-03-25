package com.okinc.business.invest_biz.mln;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;
import o.pUU;
import org.luaj.vm2.LuaFunction;
import org.luaj.vm2.LuaValue;

/* JADX INFO: loaded from: classes6.dex */
public final class DeFiWSListenerBridge$createListener$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $data;
    int label;
    final /* synthetic */ DeFiWSListenerBridge this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeFiWSListenerBridge$createListener$1$1(DeFiWSListenerBridge deFiWSListenerBridge, String str, Continuation<? super DeFiWSListenerBridge$createListener$1$1> continuation) {
        super(2, continuation);
        this.this$0 = deFiWSListenerBridge;
        this.$data = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DeFiWSListenerBridge$createListener$1$1(this.this$0, this.$data, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((DeFiWSListenerBridge$createListener$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            if (this.this$0.dataCallback != null) {
                pUU.copydefault("DeFiWSListenerBridge", this.$data + " " + this.this$0.dataCallback);
                LuaFunction luaFunction = this.this$0.dataCallback;
                if (luaFunction != null) {
                    luaFunction.invoke(LuaValue.rString(this.$data));
                }
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
