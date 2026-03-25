package com.okinc.auth.impl.mfa.ui;

import com.okinc.auth.impl.mfa.model.MfaNextStep;
import com.okinc.auth.impl.mfa.model.MfaResponse;
import com.okinc.auth.impl.mfa.ui.MfaViewModel$trackClickCloseButton$1;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.liveness.lca.EopTrackEvent;
import com.okinc.unify_trade.biz.BotWebHook;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C32866mlf;
import o.C32868mlh;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes3.dex */
public final class MfaViewModel$trackClickCloseButton$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ MfaViewModel this$0;

    /* JADX INFO: loaded from: classes17.dex */
    public final /* synthetic */ class TaskDescription {
        public static final /* synthetic */ int[] OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[MfaNextStep.values().length];
            try {
                iArr[MfaNextStep.PASSKEY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MfaNextStep.PASSWORD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[MfaNextStep.AUTHENTICATOR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[MfaNextStep.EMAIL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[MfaNextStep.PHONE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            OLrzqt = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MfaViewModel$trackClickCloseButton$1(MfaViewModel mfaViewModel, Continuation<? super MfaViewModel$trackClickCloseButton$1> continuation) {
        super(2, continuation);
        this.this$0 = mfaViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MfaViewModel$trackClickCloseButton$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MfaViewModel$trackClickCloseButton$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            MfaResponse value = this.this$0.valueOf().getValue();
            MfaNextStep.ActionBar actionBar = MfaNextStep.Companion;
            String strDjBIcL = value != null ? value.djBIcL() : null;
            if (strDjBIcL == null) {
                strDjBIcL = "";
            }
            int i = TaskDescription.OLrzqt[actionBar.KWHzl(strDjBIcL).ordinal()];
            if (i == 1) {
                TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
                TrackChannel[] trackChannelArr = (TrackChannel[]) Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length);
                final MfaViewModel mfaViewModel = this.this$0;
                C32866mlf.EZpvd("VerificationCenter_VerifyPasskey_FullPage_Click", trackChannelArr, (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.aCE
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return MfaViewModel$trackClickCloseButton$1.invokeSuspend$lambda$0(mfaViewModel, (EventParamsList) obj2);
                    }
                });
            } else if (i == 2) {
                TrackChannel[] trackChannelArrCopydefault2 = C32868mlh.OLrzqt.copydefault();
                TrackChannel[] trackChannelArr2 = (TrackChannel[]) Arrays.copyOf(trackChannelArrCopydefault2, trackChannelArrCopydefault2.length);
                final MfaViewModel mfaViewModel2 = this.this$0;
                C32866mlf.EZpvd("VerificationCenter_VerifyCurrentPWD_FullPage_Click", trackChannelArr2, (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.aCD
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return MfaViewModel$trackClickCloseButton$1.invokeSuspend$lambda$1(mfaViewModel2, (EventParamsList) obj2);
                    }
                });
            } else if (i == 3 || i == 4 || i == 5) {
                TrackChannel[] trackChannelArrCopydefault3 = C32868mlh.OLrzqt.copydefault();
                TrackChannel[] trackChannelArr3 = (TrackChannel[]) Arrays.copyOf(trackChannelArrCopydefault3, trackChannelArrCopydefault3.length);
                final MfaViewModel mfaViewModel3 = this.this$0;
                C32866mlf.EZpvd("VerificationCenter_Verify2FA_FullPage_Click", trackChannelArr3, (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.aCC
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return MfaViewModel$trackClickCloseButton$1.invokeSuspend$lambda$2(mfaViewModel3, (EventParamsList) obj2);
                    }
                });
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$0(MfaViewModel mfaViewModel, EventParamsList eventParamsList) {
        eventParamsList.put("business", (String) mfaViewModel.OLrzqt().getFirst(), false);
        eventParamsList.put(BotWebHook.KEY_ACTION, (String) mfaViewModel.OLrzqt().getSecond(), false);
        eventParamsList.put("total_steps", (String) mfaViewModel.AuCTel().getFirst(), false);
        eventParamsList.put("current_step", (String) mfaViewModel.AuCTel().getSecond(), false);
        eventParamsList.put("verify_current_pwd", EopTrackEvent.CLOSE, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$1(MfaViewModel mfaViewModel, EventParamsList eventParamsList) {
        eventParamsList.put("business", (String) mfaViewModel.OLrzqt().getFirst(), false);
        eventParamsList.put(BotWebHook.KEY_ACTION, (String) mfaViewModel.OLrzqt().getSecond(), false);
        eventParamsList.put("total_steps", (String) mfaViewModel.AuCTel().getFirst(), false);
        eventParamsList.put("current_step", (String) mfaViewModel.AuCTel().getSecond(), false);
        eventParamsList.put("verify_current_pwd", EopTrackEvent.CLOSE, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$2(MfaViewModel mfaViewModel, EventParamsList eventParamsList) {
        eventParamsList.put("business", (String) mfaViewModel.OLrzqt().getFirst(), false);
        eventParamsList.put(BotWebHook.KEY_ACTION, (String) mfaViewModel.OLrzqt().getSecond(), false);
        eventParamsList.put("total_steps", (String) mfaViewModel.AuCTel().getFirst(), false);
        eventParamsList.put("current_step", (String) mfaViewModel.AuCTel().getSecond(), false);
        eventParamsList.put("is_trigger_resend", "no", false);
        eventParamsList.put("is_switch_to_other_2fa", "no", false);
        eventParamsList.put("is_verify_2fa", EopTrackEvent.CLOSE, false);
        return Unit.INSTANCE;
    }
}
