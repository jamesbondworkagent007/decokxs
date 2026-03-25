package com.okinc.ok_kyc_core.presentation;

import android.content.Context;
import android.os.Bundle;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC43238rlX;
import o.ActivityC42054rEq;
import o.C43251rlk;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC43294rma;

/* JADX INFO: loaded from: classes10.dex */
public final class OKComplianceWebActivity$Companion$openPage$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ Bundle $params;
    final /* synthetic */ Integer $requestCode;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OKComplianceWebActivity$Companion$openPage$1(Context context, Bundle bundle, Integer num, Continuation<? super OKComplianceWebActivity$Companion$openPage$1> continuation) {
        super(2, continuation);
        this.$context = context;
        this.$params = bundle;
        this.$requestCode = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OKComplianceWebActivity$Companion$openPage$1(this.$context, this.$params, this.$requestCode, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((OKComplianceWebActivity$Companion$openPage$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC43294rma interfaceC43294rma = (InterfaceC43294rma) C43251rlk.copydefault(InterfaceC43294rma.class);
            Context context = this.$context;
            String string = this.$params.getString("url");
            if (string == null) {
                string = "";
            }
            this.label = 1;
            obj = interfaceC43294rma.EZpvd(context, string, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        if (!Intrinsics.EZpvd(obj, AbstractC43238rlX.StateListAnimator.OLrzqt)) {
            ActivityC42054rEq.Companion.OLrzqt(this.$context, this.$params, this.$requestCode);
        }
        return Unit.INSTANCE;
    }
}
