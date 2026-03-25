package com.okinc.auth.impl.passkey.ui.management.cefi;

import androidx.lifecycle.MutableLiveData;
import com.okinc.auth.impl.passkey.model.passkeytoggle.SwitchPasskeyToggleRequest;
import com.okinc.auth.impl.passkey.ui.management.cefi.SecurityFido2AuthenticatorViewModel;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import o.AbstractC5981aGi;
import o.C32989mnw;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.C5974aGb;

/* JADX INFO: loaded from: classes3.dex */
public final class SecurityFido2AuthenticatorViewModel$sessionIdToSwitchToggle$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $sessionId;
    Object L$0;
    int label;
    final /* synthetic */ SecurityFido2AuthenticatorViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SecurityFido2AuthenticatorViewModel$sessionIdToSwitchToggle$1(SecurityFido2AuthenticatorViewModel securityFido2AuthenticatorViewModel, String str, Continuation<? super SecurityFido2AuthenticatorViewModel$sessionIdToSwitchToggle$1> continuation) {
        super(2, continuation);
        this.this$0 = securityFido2AuthenticatorViewModel;
        this.$sessionId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SecurityFido2AuthenticatorViewModel$sessionIdToSwitchToggle$1(this.this$0, this.$sessionId, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SecurityFido2AuthenticatorViewModel$sessionIdToSwitchToggle$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v9, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a4  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        MutableSharedFlow mutableSharedFlow;
        Boolean boolKWHzl;
        AbstractC5981aGi abstractC5981aGi;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            MutableSharedFlow mutableSharedFlow2 = this.this$0.gEmmrt;
            Boolean boolKWHzl2 = C56443yFo.KWHzl(true);
            this.label = 1;
            if (mutableSharedFlow2.emit(boolKWHzl2, this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i == 2) {
                    C56391yDq.AEQbTJ(obj);
                    AbstractC5981aGi abstractC5981aGi2 = (AbstractC5981aGi) obj;
                    mutableSharedFlow = this.this$0.gEmmrt;
                    boolKWHzl = C56443yFo.KWHzl(false);
                    this.L$0 = abstractC5981aGi2;
                    this.label = 3;
                    if (mutableSharedFlow.emit(boolKWHzl, this) != objCopydefault) {
                        return objCopydefault;
                    }
                    abstractC5981aGi = abstractC5981aGi2;
                    if (!(abstractC5981aGi instanceof AbstractC5981aGi.Application)) {
                    }
                    return Unit.INSTANCE;
                }
                if (i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                abstractC5981aGi = (AbstractC5981aGi) this.L$0;
                C56391yDq.AEQbTJ(obj);
                if (!(abstractC5981aGi instanceof AbstractC5981aGi.Application)) {
                    this.this$0.isConnected.setValue(Unit.INSTANCE);
                    MutableLiveData mutableLiveData = this.this$0.EZpvd;
                    String str = (String) this.this$0.fIwbmz.getValue();
                    mutableLiveData.setValue(new C32989mnw(new SecurityFido2AuthenticatorViewModel.StateListAnimator.PendingIntent(str != null ? str : "")));
                } else if (abstractC5981aGi instanceof AbstractC5981aGi.ActionBar) {
                    MutableLiveData mutableLiveData2 = this.this$0.EZpvd;
                    String strOLrzqt = ((AbstractC5981aGi.ActionBar) abstractC5981aGi).OLrzqt();
                    mutableLiveData2.setValue(new C32989mnw(new SecurityFido2AuthenticatorViewModel.StateListAnimator.FragmentManager(strOLrzqt != null ? strOLrzqt : "")));
                } else {
                    throw new NoWhenBranchMatchedException();
                }
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
        }
        C5974aGb c5974aGb = this.this$0.zuBGHE;
        SwitchPasskeyToggleRequest switchPasskeyToggleRequest = new SwitchPasskeyToggleRequest(this.$sessionId);
        this.label = 2;
        obj = c5974aGb.EZpvd(switchPasskeyToggleRequest, this);
        if (obj == objCopydefault) {
            return objCopydefault;
        }
        AbstractC5981aGi abstractC5981aGi22 = (AbstractC5981aGi) obj;
        mutableSharedFlow = this.this$0.gEmmrt;
        boolKWHzl = C56443yFo.KWHzl(false);
        this.L$0 = abstractC5981aGi22;
        this.label = 3;
        if (mutableSharedFlow.emit(boolKWHzl, this) != objCopydefault) {
        }
    }
}
