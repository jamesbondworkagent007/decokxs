package com.okinc.business.invest_biz.mln;

import androidx.camera.video.AudioStats;
import com.okinc.core.livelistener.OKWsConnectionState;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;
import org.luaj.vm2.LuaFunction;
import org.luaj.vm2.LuaValue;

/* JADX INFO: loaded from: classes6.dex */
public final class DeFiWSListenerBridge$createListener$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ OKWsConnectionState $state;
    int label;
    final /* synthetic */ DeFiWSListenerBridge this$0;

    /* JADX INFO: loaded from: classes23.dex */
    public final /* synthetic */ class Application {
        public static final /* synthetic */ int[] KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[OKWsConnectionState.values().length];
            try {
                iArr[OKWsConnectionState.OPEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OKWsConnectionState.CLOSED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[OKWsConnectionState.FAILURE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            KWHzl = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeFiWSListenerBridge$createListener$2$1(OKWsConnectionState oKWsConnectionState, DeFiWSListenerBridge deFiWSListenerBridge, Continuation<? super DeFiWSListenerBridge$createListener$2$1> continuation) {
        super(2, continuation);
        this.$state = oKWsConnectionState;
        this.this$0 = deFiWSListenerBridge;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DeFiWSListenerBridge$createListener$2$1(this.$state, this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((DeFiWSListenerBridge$createListener$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            int i = Application.KWHzl[this.$state.ordinal()];
            if (i == 1) {
                LuaFunction luaFunction = this.this$0.stateCallback;
                if (luaFunction != null) {
                    luaFunction.invoke(LuaValue.rNumber(1.0d));
                }
            } else if (i == 2) {
                LuaFunction luaFunction2 = this.this$0.stateCallback;
                if (luaFunction2 != null) {
                    luaFunction2.invoke(LuaValue.rNumber(AudioStats.AUDIO_AMPLITUDE_NONE));
                }
            } else if (i != 3) {
                LuaFunction luaFunction3 = this.this$0.stateCallback;
                if (luaFunction3 != null) {
                    luaFunction3.invoke(LuaValue.rNumber(AudioStats.AUDIO_AMPLITUDE_NONE));
                }
            } else {
                LuaFunction luaFunction4 = this.this$0.stateCallback;
                if (luaFunction4 != null) {
                    luaFunction4.invoke(LuaValue.rNumber(2.0d));
                }
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
