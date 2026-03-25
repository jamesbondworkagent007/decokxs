package com.okinc.auth.impl.passkey.ui.resetremove.mfa;

import androidx.lifecycle.MutableLiveData;
import com.okinc.auth.api.passkey.PasskeyPromotionAuthenticator;
import com.okinc.auth.api.passkey.PasskeyRebindRequest;
import com.okinc.auth.api.passkey.PasskeyScenario;
import com.okinc.auth.impl.passkey.model.ResetMfaInitiateResponse;
import com.okinc.auth.impl.passkey.ui.resetremove.mfa.ResetRemovePasskeyMfaViewModel;
import com.okinc.auth.impl.passkey.ui.resetremove.mfa.ResetRemovePasskeyMfaViewModel$resetInit$1;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import java.util.Arrays;
import java.util.List;
import kotlin.Pair;
import kotlin.Result;
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
import o.C33070mpX;
import o.C56390yDp;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.C5917aFX;
import o.C5922aFc;
import o.C8206ayP;
import o.yDY;

/* JADX INFO: loaded from: classes3.dex */
public final class ResetRemovePasskeyMfaViewModel$resetInit$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ PasskeyScenario $passkeyScenario;
    final /* synthetic */ String $sessionId;
    Object L$0;
    int label;
    final /* synthetic */ ResetRemovePasskeyMfaViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ResetRemovePasskeyMfaViewModel$resetInit$1(ResetRemovePasskeyMfaViewModel resetRemovePasskeyMfaViewModel, String str, PasskeyScenario passkeyScenario, Continuation<? super ResetRemovePasskeyMfaViewModel$resetInit$1> continuation) {
        super(2, continuation);
        this.this$0 = resetRemovePasskeyMfaViewModel;
        this.$sessionId = str;
        this.$passkeyScenario = passkeyScenario;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ResetRemovePasskeyMfaViewModel$resetInit$1(this.this$0, this.$sessionId, this.$passkeyScenario, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ResetRemovePasskeyMfaViewModel$resetInit$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [254=4] */
    /* JADX DEBUG: Multi-variable search result rejected for r15v14, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r15v22, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r1v4, resolved type: T */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0086 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01f3  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objEZpvd;
        MutableSharedFlow mutableSharedFlow;
        Boolean boolKWHzl;
        Object obj2;
        Throwable thM7380exceptionOrNullimpl;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            MutableSharedFlow mutableSharedFlow2 = this.this$0.AYXKKw;
            Boolean boolKWHzl2 = C56443yFo.KWHzl(true);
            this.label = 1;
            if (mutableSharedFlow2.emit(boolKWHzl2, this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i == 2) {
                    C56391yDq.AEQbTJ(obj);
                    objEZpvd = ((Result) obj).m7386unboximpl();
                    mutableSharedFlow = this.this$0.AYXKKw;
                    boolKWHzl = C56443yFo.KWHzl(false);
                    this.L$0 = objEZpvd;
                    this.label = 3;
                    if (mutableSharedFlow.emit(boolKWHzl, this) != objCopydefault) {
                        return objCopydefault;
                    }
                    obj2 = objEZpvd;
                    ResetRemovePasskeyMfaViewModel resetRemovePasskeyMfaViewModel = this.this$0;
                    PasskeyScenario passkeyScenario = this.$passkeyScenario;
                    if (Result.m7384isSuccessimpl(obj2)) {
                    }
                    ResetRemovePasskeyMfaViewModel resetRemovePasskeyMfaViewModel2 = this.this$0;
                    thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(obj2);
                    if (thM7380exceptionOrNullimpl != null) {
                    }
                    return Unit.INSTANCE;
                }
                if (i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                obj2 = this.L$0;
                C56391yDq.AEQbTJ(obj);
                ResetRemovePasskeyMfaViewModel resetRemovePasskeyMfaViewModel3 = this.this$0;
                PasskeyScenario passkeyScenario2 = this.$passkeyScenario;
                if (Result.m7384isSuccessimpl(obj2)) {
                    ResetMfaInitiateResponse resetMfaInitiateResponse = (ResetMfaInitiateResponse) obj2;
                    MutableLiveData mutableLiveData = resetRemovePasskeyMfaViewModel3.OLrzqt;
                    String workflowToken = resetMfaInitiateResponse.getWorkflowToken();
                    if (workflowToken == null) {
                        workflowToken = "";
                    }
                    mutableLiveData.setValue(workflowToken);
                    C5922aFc c5922aFc = C5922aFc.KWHzl;
                    ResetRemovePasskeyMfaViewModel.Application application = ResetRemovePasskeyMfaViewModel.Companion;
                    C5922aFc.log$default(c5922aFc, "[RESET/REMOVE]", null, application.EZpvd() + " reset init nextStep: " + resetMfaInitiateResponse.getNextStep(), 2, null);
                    String nextStep = resetMfaInitiateResponse.getNextStep();
                    if (nextStep != null) {
                        switch (nextStep.hashCode()) {
                            case -1464364582:
                                if (!nextStep.equals("UPLOAD_DOCUMENTS")) {
                                    String str = "resetInit nextStep is " + resetMfaInitiateResponse.getNextStep();
                                    C5922aFc.log$default(c5922aFc, "[RESET/REMOVE]", null, application.EZpvd() + " this", 2, null);
                                    resetRemovePasskeyMfaViewModel3.djBIcL.setValue(str);
                                } else {
                                    MutableLiveData mutableLiveData2 = resetRemovePasskeyMfaViewModel3.AkhnZx;
                                    String str2 = (String) resetRemovePasskeyMfaViewModel3.OLrzqt.getValue();
                                    if (str2 == null) {
                                        str2 = "";
                                    }
                                    String reminderContent = resetMfaInitiateResponse.getReminderContent();
                                    if (reminderContent == null) {
                                        reminderContent = "";
                                    }
                                    mutableLiveData2.setValue(new C32989mnw(C56390yDp.OLrzqt(str2, reminderContent)));
                                }
                                break;
                            case -1149187101:
                                if (nextStep.equals("SUCCESS")) {
                                    TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
                                    C32866mlf.EZpvd("PasskeySingleRemoveSuccessfully_Account_API_View", (TrackChannel[]) Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.aOY
                                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                        @Override // kotlin.jvm.functions.Function1
                                        public final java.lang.Object invoke(java.lang.Object obj3) {
                                            return ResetRemovePasskeyMfaViewModel$resetInit$1.invokeSuspend$lambda$2$lambda$0((EventParamsList) obj3);
                                        }
                                    });
                                    resetRemovePasskeyMfaViewModel3.gEmmrt.setValue(C33070mpX.AYXKKw(C8206ayP.Dialog.djSkpj));
                                    break;
                                }
                                break;
                            case -1043629244:
                                if (nextStep.equals("LINK_NEW_MFA")) {
                                    List<String> new2FaType = resetMfaInitiateResponse.getNew2FaType();
                                    if (new2FaType != null && new2FaType.contains("PASSKEY")) {
                                        MutableLiveData mutableLiveData3 = resetRemovePasskeyMfaViewModel3.values;
                                        String str3 = (String) resetRemovePasskeyMfaViewModel3.OLrzqt.getValue();
                                        if (str3 == null) {
                                            str3 = "";
                                        }
                                        PasskeyPromotionAuthenticator.All all = PasskeyPromotionAuthenticator.All.KWHzl;
                                        if (passkeyScenario2 == null) {
                                            passkeyScenario2 = PasskeyScenario.Account.AEQbTJ;
                                        }
                                        mutableLiveData3.setValue(new C32989mnw(new PasskeyRebindRequest(str3, all, passkeyScenario2)));
                                    } else {
                                        resetRemovePasskeyMfaViewModel3.djBIcL.setValue("new2FaType is: " + resetMfaInitiateResponse.getNew2FaType());
                                    }
                                    break;
                                }
                                break;
                            case -253070488:
                                if (nextStep.equals("TICKET_SUBMITTED")) {
                                    resetRemovePasskeyMfaViewModel3.AhwBna.setValue(new C32989mnw(Unit.INSTANCE));
                                    break;
                                }
                                break;
                        }
                    }
                }
                ResetRemovePasskeyMfaViewModel resetRemovePasskeyMfaViewModel22 = this.this$0;
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(obj2);
                if (thM7380exceptionOrNullimpl != null) {
                    C5922aFc c5922aFc2 = C5922aFc.KWHzl;
                    String strEZpvd = ResetRemovePasskeyMfaViewModel.Companion.EZpvd();
                    String message = thM7380exceptionOrNullimpl.getMessage();
                    if (message == null) {
                        message = "";
                    }
                    C5922aFc.log$default(c5922aFc2, "[RESET/REMOVE]", null, strEZpvd + " resetInit() " + message, 2, null);
                    MutableLiveData mutableLiveData4 = resetRemovePasskeyMfaViewModel22.djBIcL;
                    String message2 = thM7380exceptionOrNullimpl.getMessage();
                    mutableLiveData4.setValue(message2 != null ? message2 : "");
                }
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
        }
        C5917aFX c5917aFX = this.this$0.AuCTelauCTel;
        Pair pair = (Pair) this.this$0.AEQbTJ.getValue();
        List<String> listAhwBna = pair != null ? (List) pair.getSecond() : null;
        if (listAhwBna == null) {
            listAhwBna = yDY.AhwBna();
        }
        String str4 = this.$sessionId;
        this.label = 2;
        objEZpvd = c5917aFX.EZpvd(listAhwBna, str4, this);
        if (objEZpvd == objCopydefault) {
            return objCopydefault;
        }
        mutableSharedFlow = this.this$0.AYXKKw;
        boolKWHzl = C56443yFo.KWHzl(false);
        this.L$0 = objEZpvd;
        this.label = 3;
        if (mutableSharedFlow.emit(boolKWHzl, this) != objCopydefault) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$2$lambda$0(EventParamsList eventParamsList) {
        eventParamsList.put("flow", "2fa", true);
        return Unit.INSTANCE;
    }
}
