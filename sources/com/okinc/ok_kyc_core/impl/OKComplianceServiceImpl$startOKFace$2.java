package com.okinc.ok_kyc_core.impl;

import android.content.Context;
import com.okinc.kyc.api.biz.bean.FacialExtParams;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C42467rTy;
import o.C43251rlk;
import o.C56391yDq;
import o.C56442yFn;
import o.rSB;

/* JADX INFO: loaded from: classes10.dex */
public final class OKComplianceServiceImpl$startOKFace$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ FacialExtParams $extParams;
    final /* synthetic */ String $sessionId;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OKComplianceServiceImpl$startOKFace$2(Context context, String str, FacialExtParams facialExtParams, Continuation<? super OKComplianceServiceImpl$startOKFace$2> continuation) {
        super(2, continuation);
        this.$context = context;
        this.$sessionId = str;
        this.$extParams = facialExtParams;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OKComplianceServiceImpl$startOKFace$2(this.$context, this.$sessionId, this.$extParams, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((OKComplianceServiceImpl$startOKFace$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        rSB rsb;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C42467rTy c42467rTy = C42467rTy.KWHzl;
            Context context = this.$context;
            this.label = 1;
            obj = c42467rTy.OLrzqt(context, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        if (((Boolean) obj).booleanValue() && (rsb = (rSB) C43251rlk.OLrzqt(rSB.class)) != null) {
            rsb.copydefault(this.$context, this.$sessionId, this.$extParams);
        }
        return Unit.INSTANCE;
    }
}
