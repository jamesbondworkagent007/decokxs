package com.okinc.wallet.hardware.impl.onekey;

import com.okinc.wallet.hardware.api.onekey.OneKeyDevice;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;
import o.C57138yck;

/* JADX INFO: loaded from: classes12.dex */
public final class OneKeyManagerImpl$ensureDeviceReady$2$connectDevice$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super OneKeyDevice>, Object> {
    final /* synthetic */ OneKeyDevice $device;
    int label;
    final /* synthetic */ C57138yck this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneKeyManagerImpl$ensureDeviceReady$2$connectDevice$1(C57138yck c57138yck, OneKeyDevice oneKeyDevice, Continuation<? super OneKeyManagerImpl$ensureDeviceReady$2$connectDevice$1> continuation) {
        super(2, continuation);
        this.this$0 = c57138yck;
        this.$device = oneKeyDevice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OneKeyManagerImpl$ensureDeviceReady$2$connectDevice$1(this.this$0, this.$device, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super OneKeyDevice> continuation) {
        return ((OneKeyManagerImpl$ensureDeviceReady$2$connectDevice$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0047 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0048 A[PHI: r5
  0x0048: PHI (r5v10 java.lang.Object) = (r5v7 java.lang.Object), (r5v0 java.lang.Object) binds: [B:18:0x0045, B:6:0x000e] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        OneKeyDevice oneKeyDevice;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            if (this.this$0.AEQbTJ(this.$device)) {
                C57138yck c57138yck = this.this$0;
                OneKeyDevice oneKeyDevice2 = this.$device;
                this.label = 1;
                obj = c57138yck.AEQbTJ(oneKeyDevice2, this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                oneKeyDevice = this.$device;
                C57138yck c57138yck2 = this.this$0;
                this.label = 2;
                obj = c57138yck2.OLrzqt(oneKeyDevice, this);
                return obj != objCopydefault ? objCopydefault : obj;
            }
        } else {
            if (i != 1) {
                if (i == 2) {
                    C56391yDq.AEQbTJ(obj);
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        oneKeyDevice = (OneKeyDevice) obj;
        C57138yck c57138yck22 = this.this$0;
        this.label = 2;
        obj = c57138yck22.OLrzqt(oneKeyDevice, this);
        if (obj != objCopydefault) {
        }
    }
}
