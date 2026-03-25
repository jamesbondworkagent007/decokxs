package com.okinc.auth.impl.passkey.ui.rename;

import com.okinc.auth.impl.passkey.model.AuthenticatorDisplayModel;
import com.okinc.auth.impl.passkey.model.CredentialType;
import com.okinc.auth.impl.passkey.ui.rename.SecurityFido2RenameViewModel$renameSuccessHandling$1;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import o.C32866mlf;
import o.C32868mlh;
import o.C32989mnw;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes3.dex */
public final class SecurityFido2RenameViewModel$renameSuccessHandling$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ SecurityFido2RenameViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SecurityFido2RenameViewModel$renameSuccessHandling$1(SecurityFido2RenameViewModel securityFido2RenameViewModel, Continuation<? super SecurityFido2RenameViewModel$renameSuccessHandling$1> continuation) {
        super(2, continuation);
        this.this$0 = securityFido2RenameViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SecurityFido2RenameViewModel$renameSuccessHandling$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SecurityFido2RenameViewModel$renameSuccessHandling$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
            TrackChannel[] trackChannelArr = (TrackChannel[]) Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length);
            final SecurityFido2RenameViewModel securityFido2RenameViewModel = this.this$0;
            C32866mlf.EZpvd("FidoManagement_RenameFido_Api_Success", trackChannelArr, (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.aOp
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return SecurityFido2RenameViewModel$renameSuccessHandling$1.invokeSuspend$lambda$0(securityFido2RenameViewModel, (EventParamsList) obj2);
                }
            });
            MutableSharedFlow mutableSharedFlow = this.this$0.OLrzqt;
            C32989mnw c32989mnw = new C32989mnw(Unit.INSTANCE);
            this.label = 1;
            if (mutableSharedFlow.emit(c32989mnw, this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$0(SecurityFido2RenameViewModel securityFido2RenameViewModel, EventParamsList eventParamsList) {
        String trackingValue;
        CredentialType credentialTypeKWHzl;
        AuthenticatorDisplayModel authenticatorDisplayModel = securityFido2RenameViewModel.gEmmrt;
        if (authenticatorDisplayModel == null || (credentialTypeKWHzl = authenticatorDisplayModel.KWHzl()) == null || (trackingValue = credentialTypeKWHzl.getTrackingValue()) == null) {
            trackingValue = "";
        }
        EventParamsList.put$default(eventParamsList, "key_type", trackingValue, false, 4, null);
        return Unit.INSTANCE;
    }
}
