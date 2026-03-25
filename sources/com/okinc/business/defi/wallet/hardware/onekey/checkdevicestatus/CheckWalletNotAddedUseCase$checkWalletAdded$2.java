package com.okinc.business.defi.wallet.hardware.onekey.checkdevicestatus;

import com.okinc.business.defi.wallet.hardware.onekey.OneKeyConnectEvent;
import com.okinc.wallet.hardware.api.onekey.OneKeyConnectedDevice;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.sequences.Sequence;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import o.C15432eIc;
import o.C15450eIu;
import o.C56391yDq;
import o.C56442yFn;
import o.C59449zhJ;
import o.pUU;

/* JADX INFO: loaded from: classes5.dex */
public final class CheckWalletNotAddedUseCase$checkWalletAdded$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super OneKeyConnectEvent>, Object> {
    final /* synthetic */ String $connectId;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ C15432eIc this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheckWalletNotAddedUseCase$checkWalletAdded$2(C15432eIc c15432eIc, String str, Continuation<? super CheckWalletNotAddedUseCase$checkWalletAdded$2> continuation) {
        super(2, continuation);
        this.this$0 = c15432eIc;
        this.$connectId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        CheckWalletNotAddedUseCase$checkWalletAdded$2 checkWalletNotAddedUseCase$checkWalletAdded$2 = new CheckWalletNotAddedUseCase$checkWalletAdded$2(this.this$0, this.$connectId, continuation);
        checkWalletNotAddedUseCase$checkWalletAdded$2.L$0 = obj;
        return checkWalletNotAddedUseCase$checkWalletAdded$2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super OneKeyConnectEvent> continuation) {
        return ((CheckWalletNotAddedUseCase$checkWalletAdded$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0088  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Deferred deferred;
        String str;
        OneKeyConnectedDevice oneKeyConnectedDevice;
        Iterator it;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            Deferred deferredAsync$default = BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new CheckWalletNotAddedUseCase$checkWalletAdded$2$getAddressFromDevice$1(this.this$0, this.$connectId, 0, null), 3, null);
            Deferred deferredAsync$default2 = BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new CheckWalletNotAddedUseCase$checkWalletAdded$2$addressesFromWallet$1(this.this$0, this.$connectId, 0, null), 3, null);
            this.L$0 = deferredAsync$default2;
            this.label = 1;
            Object objAwait = deferredAsync$default.await(this);
            if (objAwait == objCopydefault) {
                return objCopydefault;
            }
            deferred = deferredAsync$default2;
            obj = objAwait;
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str = (String) this.L$1;
                oneKeyConnectedDevice = (OneKeyConnectedDevice) this.L$0;
                C56391yDq.AEQbTJ(obj);
                it = ((Sequence) obj).iterator();
                while (it.hasNext()) {
                    if (C59449zhJ.gEmmrt((String) it.next(), str, true)) {
                        pUU.copydefault("CheckWalletNotAddedUseCase", "checkWalletAdded: wallet already added");
                        return OneKeyConnectEvent.ShowNotification.WalletAlreadyAdded;
                    }
                }
                return new OneKeyConnectEvent.Activity(oneKeyConnectedDevice);
            }
            deferred = (Deferred) this.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        C15450eIu c15450eIu = (C15450eIu) obj;
        OneKeyConnectedDevice oneKeyConnectedDeviceCopydefault = c15450eIu.copydefault();
        String strKWHzl = c15450eIu.KWHzl();
        this.L$0 = oneKeyConnectedDeviceCopydefault;
        this.L$1 = strKWHzl;
        this.label = 2;
        Object objAwait2 = deferred.await(this);
        if (objAwait2 == objCopydefault) {
            return objCopydefault;
        }
        str = strKWHzl;
        obj = objAwait2;
        oneKeyConnectedDevice = oneKeyConnectedDeviceCopydefault;
        it = ((Sequence) obj).iterator();
        while (it.hasNext()) {
        }
        return new OneKeyConnectEvent.Activity(oneKeyConnectedDevice);
    }
}
