package com.okinc.business.defi.wallet.common.okxconnect.util;

import android.content.Context;
import com.okinc.business.defi.wallet.common.okxconnect.model.DAppInfo;
import com.okinc.business.defi.wallet.common.okxconnect.model.DAppWrapper;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C15974ebF;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes4.dex */
public final class DAppMethodHelper$getMethodResult$2$1$1 extends SuspendLambda implements Function1<Continuation<? super String>, Object> {
    final /* synthetic */ String $connectFrom;
    final /* synthetic */ DAppInfo $dAppInfo;
    final /* synthetic */ String $messageId;
    final /* synthetic */ String $method;
    final /* synthetic */ DAppWrapper $params;
    final /* synthetic */ String $walletId;
    int label;
    final /* synthetic */ C15974ebF this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DAppMethodHelper$getMethodResult$2$1$1(C15974ebF c15974ebF, String str, DAppWrapper dAppWrapper, String str2, DAppInfo dAppInfo, String str3, String str4, Continuation<? super DAppMethodHelper$getMethodResult$2$1$1> continuation) {
        super(1, continuation);
        this.this$0 = c15974ebF;
        this.$method = str;
        this.$params = dAppWrapper;
        this.$walletId = str2;
        this.$dAppInfo = dAppInfo;
        this.$connectFrom = str3;
        this.$messageId = str4;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new DAppMethodHelper$getMethodResult$2$1$1(this.this$0, this.$method, this.$params, this.$walletId, this.$dAppInfo, this.$connectFrom, this.$messageId, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super String> continuation) {
        return ((DAppMethodHelper$getMethodResult$2$1$1) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Exception {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C15974ebF c15974ebF = this.this$0;
            this.label = 1;
            obj = c15974ebF.OLrzqt((Continuation<? super WeakReference<Context>>) this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i == 2) {
                    C56391yDq.AEQbTJ(obj);
                    return (String) obj;
                }
                if (i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                return (String) obj;
            }
            C56391yDq.AEQbTJ(obj);
        }
        WeakReference weakReference = (WeakReference) obj;
        String str = this.$method;
        if (Intrinsics.EZpvd((Object) str, (Object) "ton_signProof")) {
            DAppWrapper dAppWrapper = this.$params;
            if (dAppWrapper instanceof DAppWrapper.DAppSignWrapper) {
                DAppInfo dAppInfo = this.$dAppInfo;
                String str2 = this.$connectFrom;
                String str3 = this.$messageId;
                this.label = 2;
                obj = this.this$0.KWHzl(weakReference, this.$walletId, this.$method, (DAppWrapper.DAppSignWrapper) dAppWrapper, dAppInfo, str2, str3, this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
                return (String) obj;
            }
            throw new IllegalArgumentException("DAppSignWrapper required".toString());
        }
        if (Intrinsics.EZpvd((Object) str, (Object) "ton_sendTransaction")) {
            DAppWrapper dAppWrapper2 = this.$params;
            if (dAppWrapper2 instanceof DAppWrapper.DAppInteractionWrapper) {
                DAppInfo dAppInfo2 = this.$dAppInfo;
                String str4 = this.$connectFrom;
                String str5 = this.$messageId;
                this.label = 3;
                obj = this.this$0.EZpvd((WeakReference<Context>) weakReference, this.$walletId, this.$method, (DAppWrapper.DAppInteractionWrapper) dAppWrapper2, dAppInfo2, str4, str5, (Continuation<? super String>) this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
                return (String) obj;
            }
            throw new IllegalArgumentException("DAppInteractionWrapper required".toString());
        }
        throw new Exception("Method not supported");
    }
}
