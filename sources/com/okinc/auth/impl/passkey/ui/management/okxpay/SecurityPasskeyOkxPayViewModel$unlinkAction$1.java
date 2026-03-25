package com.okinc.auth.impl.passkey.ui.management.okxpay;

import com.okinc.auth.impl.passkey.model.AuthenticatorDisplayModel;
import com.okinc.auth.impl.passkey.ui.management.okxpay.SecurityPasskeyOkxPayViewModel$unlinkAction$1;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import java.util.Arrays;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import o.AbstractC5979aGg;
import o.C32866mlf;
import o.C32868mlh;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.C5985aGm;
import o.C8206ayP;

/* JADX INFO: loaded from: classes3.dex */
public final class SecurityPasskeyOkxPayViewModel$unlinkAction$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ AuthenticatorDisplayModel $model;
    final /* synthetic */ String $unlockToken;
    Object L$0;
    int label;
    final /* synthetic */ SecurityPasskeyOkxPayViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SecurityPasskeyOkxPayViewModel$unlinkAction$1(SecurityPasskeyOkxPayViewModel securityPasskeyOkxPayViewModel, AuthenticatorDisplayModel authenticatorDisplayModel, String str, Continuation<? super SecurityPasskeyOkxPayViewModel$unlinkAction$1> continuation) {
        super(2, continuation);
        this.this$0 = securityPasskeyOkxPayViewModel;
        this.$model = authenticatorDisplayModel;
        this.$unlockToken = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SecurityPasskeyOkxPayViewModel$unlinkAction$1(this.this$0, this.$model, this.$unlockToken, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SecurityPasskeyOkxPayViewModel$unlinkAction$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x007f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0084  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        AbstractC5979aGg abstractC5979aGg;
        MutableSharedFlow mutableSharedFlow;
        Boolean boolKWHzl;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            MutableSharedFlow mutableSharedFlow2 = this.this$0.AEQbTJ;
            Boolean boolKWHzl2 = C56443yFo.KWHzl(true);
            this.label = 1;
            if (mutableSharedFlow2.emit(boolKWHzl2, this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i == 2) {
                    C56391yDq.AEQbTJ(obj);
                    abstractC5979aGg = (AbstractC5979aGg) obj;
                    mutableSharedFlow = this.this$0.AEQbTJ;
                    boolKWHzl = C56443yFo.KWHzl(false);
                    this.L$0 = abstractC5979aGg;
                    this.label = 3;
                    if (mutableSharedFlow.emit(boolKWHzl, this) == objCopydefault) {
                        return objCopydefault;
                    }
                    if (!(abstractC5979aGg instanceof AbstractC5979aGg.StateListAnimator)) {
                    }
                    return Unit.INSTANCE;
                }
                if (i != 3) {
                    if (i != 4) {
                        if (i != 5) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C56391yDq.AEQbTJ(obj);
                        return Unit.INSTANCE;
                    }
                    C56391yDq.AEQbTJ(obj);
                    this.this$0.copydefault((AuthenticatorDisplayModel) null);
                    this.this$0.AkhnZx();
                    return Unit.INSTANCE;
                }
                abstractC5979aGg = (AbstractC5979aGg) this.L$0;
                C56391yDq.AEQbTJ(obj);
                if (!(abstractC5979aGg instanceof AbstractC5979aGg.StateListAnimator)) {
                    if (abstractC5979aGg instanceof AbstractC5979aGg.TaskDescription) {
                        TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
                        TrackChannel[] trackChannelArr = (TrackChannel[]) Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length);
                        final AuthenticatorDisplayModel authenticatorDisplayModel = this.$model;
                        C32866mlf.EZpvd("FidoManagement_RemoveFido_Api_Success", trackChannelArr, (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.aLf
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj2) {
                                return SecurityPasskeyOkxPayViewModel$unlinkAction$1.invokeSuspend$lambda$0(authenticatorDisplayModel, (EventParamsList) obj2);
                            }
                        });
                        MutableSharedFlow mutableSharedFlow3 = this.this$0.djBIcL;
                        Integer numAEQbTJ = C56443yFo.AEQbTJ(C8206ayP.Dialog.djSkpj);
                        this.L$0 = null;
                        this.label = 4;
                        if (mutableSharedFlow3.emit(numAEQbTJ, this) == objCopydefault) {
                            return objCopydefault;
                        }
                        this.this$0.copydefault((AuthenticatorDisplayModel) null);
                        this.this$0.AkhnZx();
                    } else if (abstractC5979aGg instanceof AbstractC5979aGg.Application) {
                        MutableSharedFlow mutableSharedFlow4 = this.this$0.AYXKKw;
                        String strOLrzqt = ((AbstractC5979aGg.Application) abstractC5979aGg).OLrzqt();
                        if (strOLrzqt == null) {
                            strOLrzqt = "";
                        }
                        this.L$0 = null;
                        this.label = 5;
                        if (mutableSharedFlow4.emit(strOLrzqt, this) == objCopydefault) {
                            return objCopydefault;
                        }
                    } else if (abstractC5979aGg instanceof AbstractC5979aGg.Activity) {
                        this.this$0.AhwBna.setValue(null);
                        this.this$0.AYXKKw();
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                }
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
        }
        C5985aGm c5985aGm = this.this$0.isConnected;
        String strCopydefault = this.$model.copydefault();
        String str = this.$unlockToken;
        this.label = 2;
        obj = c5985aGm.copydefault(str, strCopydefault, this);
        if (obj == objCopydefault) {
            return objCopydefault;
        }
        abstractC5979aGg = (AbstractC5979aGg) obj;
        mutableSharedFlow = this.this$0.AEQbTJ;
        boolKWHzl = C56443yFo.KWHzl(false);
        this.L$0 = abstractC5979aGg;
        this.label = 3;
        if (mutableSharedFlow.emit(boolKWHzl, this) == objCopydefault) {
        }
        if (!(abstractC5979aGg instanceof AbstractC5979aGg.StateListAnimator)) {
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$0(AuthenticatorDisplayModel authenticatorDisplayModel, EventParamsList eventParamsList) {
        EventParamsList.put$default(eventParamsList, "key_type", authenticatorDisplayModel.KWHzl().getTrackingValue(), false, 4, null);
        return Unit.INSTANCE;
    }
}
