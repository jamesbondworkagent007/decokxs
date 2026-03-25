package com.okinc.wallet.hardware.impl.onekey;

import com.okinc.wallet.hardware.api.onekey.OneKeyDevice;
import com.okinc.wallet.hardware.api.onekey.OneKeyException;
import com.okinc.wallet.hardware.api.onekey.OneKeySDKError;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import o.C56391yDq;
import o.C56442yFn;
import o.C57138yck;

/* JADX INFO: loaded from: classes12.dex */
public final class OneKeyManagerImpl$ensureDeviceReady$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super OneKeyDevice>, Object> {
    final /* synthetic */ OneKeyDevice $device;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C57138yck this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneKeyManagerImpl$ensureDeviceReady$2(C57138yck c57138yck, OneKeyDevice oneKeyDevice, Continuation<? super OneKeyManagerImpl$ensureDeviceReady$2> continuation) {
        super(2, continuation);
        this.this$0 = c57138yck;
        this.$device = oneKeyDevice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        OneKeyManagerImpl$ensureDeviceReady$2 oneKeyManagerImpl$ensureDeviceReady$2 = new OneKeyManagerImpl$ensureDeviceReady$2(this.this$0, this.$device, continuation);
        oneKeyManagerImpl$ensureDeviceReady$2.L$0 = obj;
        return oneKeyManagerImpl$ensureDeviceReady$2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super OneKeyDevice> continuation) {
        return ((OneKeyManagerImpl$ensureDeviceReady$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Deferred deferredAsync$default;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            deferredAsync$default = BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new OneKeyManagerImpl$ensureDeviceReady$2$connectDevice$1(this.this$0, this.$device, null), 3, null);
            Deferred deferredAsync$default2 = BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new OneKeyManagerImpl$ensureDeviceReady$2$downloadJSBundle$1(this.this$0, null), 3, null);
            this.L$0 = deferredAsync$default;
            this.label = 1;
            obj = deferredAsync$default2.await(this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                return (OneKeyDevice) obj;
            }
            deferredAsync$default = (Deferred) this.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        if (!((Boolean) obj).booleanValue()) {
            throw new OneKeyException(OneKeySDKError.SDKUnavailable, null, 2, null);
        }
        this.L$0 = null;
        this.label = 2;
        obj = deferredAsync$default.await(this);
        if (obj == objCopydefault) {
            return objCopydefault;
        }
        return (OneKeyDevice) obj;
    }
}
