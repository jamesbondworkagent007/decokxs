package com.okinc.auth.impl.passkey.ui.management.cefi;

import com.okinc.auth.impl.passkey.ui.management.cefi.SecurityFido2AuthenticatorViewModel;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.C32989mnw;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.InterfaceC8196ayF;

/* JADX INFO: loaded from: classes3.dex */
public final class SecurityFido2AuthenticatorViewModel$clickRegister$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ SecurityFido2AuthenticatorViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SecurityFido2AuthenticatorViewModel$clickRegister$1(SecurityFido2AuthenticatorViewModel securityFido2AuthenticatorViewModel, Continuation<? super SecurityFido2AuthenticatorViewModel$clickRegister$1> continuation) {
        super(2, continuation);
        this.this$0 = securityFido2AuthenticatorViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SecurityFido2AuthenticatorViewModel$clickRegister$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SecurityFido2AuthenticatorViewModel$clickRegister$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC8196ayF interfaceC8196ayF = this.this$0.fARcdN;
            this.label = 1;
            obj = interfaceC8196ayF.AEQbTJ(this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        if (((Boolean) obj).booleanValue()) {
            if (Intrinsics.EZpvd(this.this$0.copydefault.getValue(), C56443yFo.KWHzl(true))) {
                this.this$0.fJNWhG.setValue(Unit.INSTANCE);
            } else if (Intrinsics.EZpvd(this.this$0.KWHzl.getValue(), C56443yFo.KWHzl(true))) {
                this.this$0.AuCTel.setValue(Unit.INSTANCE);
            } else if (Intrinsics.EZpvd(this.this$0.AYXKKw.getValue(), C56443yFo.KWHzl(false))) {
                this.this$0.EZpvd.setValue(new C32989mnw(SecurityFido2AuthenticatorViewModel.StateListAnimator.TaskDescription.copydefault));
            } else if (Intrinsics.EZpvd(this.this$0.DbNXlk().getValue(), C56443yFo.KWHzl(true))) {
                this.this$0.KWHzl();
            } else if (Intrinsics.EZpvd(this.this$0.DbNXlk().getValue(), C56443yFo.KWHzl(false))) {
                this.this$0.AuCTelauCTel();
            }
        } else if (!Intrinsics.EZpvd(this.this$0.AYXKKw.getValue(), C56443yFo.KWHzl(true))) {
            if (Intrinsics.EZpvd(this.this$0.AYXKKw.getValue(), C56443yFo.KWHzl(false))) {
                this.this$0.EZpvd.setValue(new C32989mnw(SecurityFido2AuthenticatorViewModel.StateListAnimator.TaskDescription.copydefault));
            } else {
                this.this$0.EZpvd.setValue(new C32989mnw(SecurityFido2AuthenticatorViewModel.StateListAnimator.TaskDescription.copydefault));
            }
        } else if (Intrinsics.EZpvd(this.this$0.DbNXlk().getValue(), C56443yFo.KWHzl(true))) {
            this.this$0.KWHzl();
        } else if (Intrinsics.EZpvd(this.this$0.DbNXlk().getValue(), C56443yFo.KWHzl(false))) {
            this.this$0.AuCTelauCTel();
        }
        this.this$0.KWHzl("add");
        return Unit.INSTANCE;
    }
}
