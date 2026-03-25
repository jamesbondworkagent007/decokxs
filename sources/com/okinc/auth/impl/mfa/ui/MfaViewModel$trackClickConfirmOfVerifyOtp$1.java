package com.okinc.auth.impl.mfa.ui;

import com.okinc.auth.impl.mfa.ui.MfaViewModel$trackClickConfirmOfVerifyOtp$1;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.unify_trade.biz.BotWebHook;
import com.okinc.web3.security.track.Web3SecurityTrackEvent;
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
public final class MfaViewModel$trackClickConfirmOfVerifyOtp$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ MfaViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MfaViewModel$trackClickConfirmOfVerifyOtp$1(MfaViewModel mfaViewModel, Continuation<? super MfaViewModel$trackClickConfirmOfVerifyOtp$1> continuation) {
        super(2, continuation);
        this.this$0 = mfaViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MfaViewModel$trackClickConfirmOfVerifyOtp$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MfaViewModel$trackClickConfirmOfVerifyOtp$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
            TrackChannel[] trackChannelArr = (TrackChannel[]) Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length);
            final MfaViewModel mfaViewModel = this.this$0;
            C32866mlf.EZpvd("VerificationCenter_Verify2FA_FullPage_Click", trackChannelArr, (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.aCL
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return MfaViewModel$trackClickConfirmOfVerifyOtp$1.invokeSuspend$lambda$0(mfaViewModel, (EventParamsList) obj2);
                }
            });
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
        eventParamsList.put("is_trigger_resend", "no", false);
        eventParamsList.put("is_switch_to_other_2fa", "no", false);
        eventParamsList.put("is_verify_2fa", Web3SecurityTrackEvent.VALUE_CONFIRM, false);
        return Unit.INSTANCE;
    }
}
