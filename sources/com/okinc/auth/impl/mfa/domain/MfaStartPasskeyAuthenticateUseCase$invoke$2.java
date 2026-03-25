package com.okinc.auth.impl.mfa.domain;

import com.okinc.auth.api.passkey.PasskeyScenario;
import com.okinc.auth.api.passkey.PasskeyVersionState;
import com.okinc.auth.impl.mfa.model.MfaFailure;
import com.okinc.auth.impl.passkey.model.AuthenticationStartResponse;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.C5767aCg;
import o.C5774aCn;
import o.InterfaceC8196ayF;
import o.pUU;

/* JADX INFO: loaded from: classes3.dex */
public final class MfaStartPasskeyAuthenticateUseCase$invoke$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super C5767aCg.ActionBar>, Object> {
    final /* synthetic */ AuthenticationStartResponse $authStartResponse;
    final /* synthetic */ boolean $forceFido2Fallback;
    final /* synthetic */ boolean $isSyncOnlyScenario;
    int I$0;
    int I$1;
    int label;
    final /* synthetic */ C5767aCg this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MfaStartPasskeyAuthenticateUseCase$invoke$2(AuthenticationStartResponse authenticationStartResponse, boolean z, C5767aCg c5767aCg, boolean z2, Continuation<? super MfaStartPasskeyAuthenticateUseCase$invoke$2> continuation) {
        super(2, continuation);
        this.$authStartResponse = authenticationStartResponse;
        this.$isSyncOnlyScenario = z;
        this.this$0 = c5767aCg;
        this.$forceFido2Fallback = z2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MfaStartPasskeyAuthenticateUseCase$invoke$2(this.$authStartResponse, this.$isSyncOnlyScenario, this.this$0, this.$forceFido2Fallback, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super C5767aCg.ActionBar> continuation) {
        return ((MfaStartPasskeyAuthenticateUseCase$invoke$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C5767aCg.ActionBar.StateListAnimator stateListAnimator;
        int i;
        int i2;
        PasskeyVersionState passkeyVersionState;
        Object objCopydefault = C56442yFn.copydefault();
        int i3 = this.label;
        try {
            if (i3 == 0) {
                C56391yDq.AEQbTJ(obj);
                List<AuthenticationStartResponse.AdditionalData> additionalData = this.$authStartResponse.getAdditionalData();
                i = 0;
                if (additionalData != null && !additionalData.isEmpty()) {
                    Iterator<T> it = additionalData.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        if (Intrinsics.EZpvd(((AuthenticationStartResponse.AdditionalData) it.next()).getInHouse(), C56443yFo.KWHzl(false))) {
                            if (!this.$isSyncOnlyScenario) {
                                i2 = 1;
                            }
                        }
                    }
                }
                i2 = 0;
                List<AuthenticationStartResponse.AdditionalData> additionalData2 = this.$authStartResponse.getAdditionalData();
                if (additionalData2 != null && !additionalData2.isEmpty()) {
                    Iterator<T> it2 = additionalData2.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        if (Intrinsics.EZpvd(((AuthenticationStartResponse.AdditionalData) it2.next()).getInHouse(), C56443yFo.KWHzl(true))) {
                            i = 1;
                            break;
                        }
                    }
                }
                InterfaceC8196ayF interfaceC8196ayF = this.this$0.AEQbTJ;
                PasskeyScenario.Account account = PasskeyScenario.Account.AEQbTJ;
                this.I$0 = i2;
                this.I$1 = i;
                this.label = 1;
                obj = interfaceC8196ayF.AEQbTJ(account, true, this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i3 != 1) {
                    if (i3 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                    return (C5767aCg.ActionBar) obj;
                }
                i = this.I$1;
                i2 = this.I$0;
                C56391yDq.AEQbTJ(obj);
            }
            passkeyVersionState = (PasskeyVersionState) obj;
        } catch (Exception e) {
            String message = e.getMessage();
            if (message == null) {
                message = "";
            }
            pUU.copydefault("MfaStartPasskeyAuthenticateUseCase", message);
            stateListAnimator = new C5767aCg.ActionBar.StateListAnimator(C5774aCn.EZpvd(e));
        }
        if (Intrinsics.EZpvd(passkeyVersionState, PasskeyVersionState.Fido2ScreenLockDisabled.INSTANCE)) {
            return C5767aCg.ActionBar.Application.OLrzqt;
        }
        if (Intrinsics.EZpvd(passkeyVersionState, PasskeyVersionState.Fido2Compatible.INSTANCE)) {
            if (i2 == 0) {
                if (i != 0) {
                    return new C5767aCg.ActionBar.PendingIntent(this.$authStartResponse);
                }
                stateListAnimator = new C5767aCg.ActionBar.StateListAnimator(new MfaFailure.GenericFailure(null, "list has no fido2 or fido1 keys", 1, null));
                return stateListAnimator;
            }
            C5767aCg c5767aCg = this.this$0;
            AuthenticationStartResponse authenticationStartResponse = this.$authStartResponse;
            boolean z = this.$forceFido2Fallback;
            this.label = 2;
            obj = c5767aCg.KWHzl(authenticationStartResponse, z, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
            return (C5767aCg.ActionBar) obj;
        }
        if (Intrinsics.EZpvd(passkeyVersionState, PasskeyVersionState.Fido1BiometricNotEnrolled.INSTANCE)) {
            return C5767aCg.ActionBar.Activity.AEQbTJ;
        }
        if (!Intrinsics.EZpvd(passkeyVersionState, PasskeyVersionState.Fido1v2Compatible.INSTANCE) && !Intrinsics.EZpvd(passkeyVersionState, PasskeyVersionState.Fido1v1Compatible.INSTANCE)) {
            if (!Intrinsics.EZpvd(passkeyVersionState, PasskeyVersionState.DeviceIncompatible.INSTANCE) && !Intrinsics.EZpvd(passkeyVersionState, PasskeyVersionState.Fido1AndroidVersionIncompatible.INSTANCE) && !Intrinsics.EZpvd(passkeyVersionState, PasskeyVersionState.Fido1HardwareIncompatible.INSTANCE) && !Intrinsics.EZpvd(passkeyVersionState, PasskeyVersionState.Fido2ChinaIp.INSTANCE) && !Intrinsics.EZpvd(passkeyVersionState, PasskeyVersionState.Fido1NotInGreyScale.INSTANCE)) {
                throw new NoWhenBranchMatchedException();
            }
            return C5767aCg.ActionBar.TaskDescription.KWHzl;
        }
        if (i != 0) {
            return new C5767aCg.ActionBar.PendingIntent(this.$authStartResponse);
        }
        if (i2 != 0) {
            return C5767aCg.ActionBar.C0814ActionBar.KWHzl;
        }
        return C5767aCg.ActionBar.TaskDescription.KWHzl;
    }
}
