package com.okinc.liveness.lca.ui;

import com.okinc.liveness.lca.debugtool.data.LcaDebugJwstRepository;
import com.okinc.liveness.lca.debugtool.data.LcaJwstWsSessionIdData;
import com.okinc.liveness.lca.manager.LcaSdkManager;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes19.dex */
public final class LcaLivenessScanViewModel$fetchJwstConfiguration$1$wsSessionDeferred$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super LcaDebugJwstRepository.Result<? extends LcaJwstWsSessionIdData>>, Object> {
    int label;
    final /* synthetic */ LcaLivenessScanViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LcaLivenessScanViewModel$fetchJwstConfiguration$1$wsSessionDeferred$1(LcaLivenessScanViewModel lcaLivenessScanViewModel, Continuation<? super LcaLivenessScanViewModel$fetchJwstConfiguration$1$wsSessionDeferred$1> continuation) {
        super(2, continuation);
        this.this$0 = lcaLivenessScanViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new LcaLivenessScanViewModel$fetchJwstConfiguration$1$wsSessionDeferred$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super LcaDebugJwstRepository.Result<? extends LcaJwstWsSessionIdData>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super LcaDebugJwstRepository.Result<LcaJwstWsSessionIdData>>) continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super LcaDebugJwstRepository.Result<LcaJwstWsSessionIdData>> continuation) {
        return ((LcaLivenessScanViewModel$fetchJwstConfiguration$1$wsSessionDeferred$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            LcaDebugJwstRepository lcaDebugJwstRepository = this.this$0.lcaDebugJwstRepository;
            if (lcaDebugJwstRepository == null) {
                return null;
            }
            String str = this.this$0.bizSessionId;
            String pubKey = LcaSdkManager.Companion.getInstance().getConfiguration().getPubKey();
            this.label = 1;
            obj = lcaDebugJwstRepository.getWsSessionId(str, pubKey, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return (LcaDebugJwstRepository.Result) obj;
    }
}
