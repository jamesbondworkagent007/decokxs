package com.okinc.tradingbot.impl.aiBot.ui.order;

import android.content.Intent;
import androidx.fragment.app.FragmentManager;
import com.okinc.tradingbot.impl.aiBot.dto.AiHomeDto;
import com.okinc.tradingbot.impl.aiBot.dto.InvestLimitDto;
import com.okinc.tradingbot.impl.aiBot.dto.LlmDisclaimerInfoDto;
import com.okinc.tradingbot.impl.aiBot.dto.TpSlLimitDto;
import com.okinc.tradingbot.impl.aiBot.ui.order.LlmOrderViewModel;
import com.okinc.unify_trade.biz.AiOrderReq;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.ActivityC43071riP;
import o.C43056riA;
import o.C48112uFk;
import o.C51468vnb;
import o.C53418wlC;
import o.C55326xho;
import o.C56390yDp;
import o.C56391yDq;
import o.C56424yEw;
import o.C56442yFn;
import o.C56443yFo;
import o.uEG;
import o.wJM;

/* JADX INFO: loaded from: classes16.dex */
public final class LlmOrderFragment$initViewModel$7 extends SuspendLambda implements Function2<LlmOrderViewModel.Application, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C48112uFk this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LlmOrderFragment$initViewModel$7(C48112uFk c48112uFk, Continuation<? super LlmOrderFragment$initViewModel$7> continuation) {
        super(2, continuation);
        this.this$0 = c48112uFk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        LlmOrderFragment$initViewModel$7 llmOrderFragment$initViewModel$7 = new LlmOrderFragment$initViewModel$7(this.this$0, continuation);
        llmOrderFragment$initViewModel$7.L$0 = obj;
        return llmOrderFragment$initViewModel$7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(LlmOrderViewModel.Application application, Continuation<? super Unit> continuation) {
        return ((LlmOrderFragment$initViewModel$7) create(application, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            LlmOrderViewModel.Application application = (LlmOrderViewModel.Application) this.L$0;
            if (application instanceof LlmOrderViewModel.Application.C0636Application) {
                LlmDisclaimerInfoDto llmDisclaimerInfoDtoOLrzqt = ((LlmOrderViewModel.Application.C0636Application) application).OLrzqt();
                Intent intent = new Intent(this.this$0.getContext(), (Class<?>) ActivityC43071riP.class);
                intent.putExtras(C43056riA.AEQbTJ.OLrzqt("okluatradingeco", "/bot/ai/disclaimer", C56424yEw.gEmmrt(C56390yDp.OLrzqt("disclaimerVersion", llmDisclaimerInfoDtoOLrzqt.KWHzl()), C56390yDp.OLrzqt("disclaimerName", llmDisclaimerInfoDtoOLrzqt.OLrzqt()), C56390yDp.OLrzqt("disclaimerContent", llmDisclaimerInfoDtoOLrzqt.copydefault()))));
                this.this$0.valueOf.launch(intent);
            } else if (application instanceof LlmOrderViewModel.Application.StateListAnimator) {
                wJM.StateListAnimator stateListAnimator = wJM.Companion;
                FragmentManager parentFragmentManager = this.this$0.getParentFragmentManager();
                Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "");
                stateListAnimator.KWHzl(parentFragmentManager, C51468vnb.AkhnZx());
                this.this$0.fetchVPNInfo().copydefault(((LlmOrderViewModel.Application.StateListAnimator) application).copydefault());
            } else {
                if (application instanceof LlmOrderViewModel.Application.TaskDescription) {
                    uEG.Activity activity = uEG.Companion;
                    FragmentManager parentFragmentManager2 = this.this$0.getParentFragmentManager();
                    Intrinsics.checkNotNullExpressionValue(parentFragmentManager2, "");
                    AiHomeDto aiHomeDtoCopydefault = this.this$0.fetchVPNInfo().copydefault();
                    List<InvestLimitDto> listAhwBna = aiHomeDtoCopydefault != null ? aiHomeDtoCopydefault.AhwBna() : null;
                    AiOrderReq aiOrderReqDbNXlk = this.this$0.fetchVPNInfo().DbNXlk();
                    AiHomeDto aiHomeDtoCopydefault2 = this.this$0.fetchVPNInfo().copydefault();
                    TpSlLimitDto tpSlLimitDtoAuCTel = aiHomeDtoCopydefault2 != null ? aiHomeDtoCopydefault2.AuCTel() : null;
                    String strAEQbTJ = C53418wlC.AEQbTJ(this.this$0.fetchVPNInfo().AkhnZx().getValue().OLrzqt());
                    AiHomeDto aiHomeDtoCopydefault3 = this.this$0.fetchVPNInfo().copydefault();
                    Boolean boolKWHzl = aiHomeDtoCopydefault3 != null ? C56443yFo.KWHzl(aiHomeDtoCopydefault3.fJNWhG()) : null;
                    AiHomeDto aiHomeDtoCopydefault4 = this.this$0.fetchVPNInfo().copydefault();
                    activity.AEQbTJ(parentFragmentManager2, listAhwBna, aiOrderReqDbNXlk, tpSlLimitDtoAuCTel, strAEQbTJ, boolKWHzl, aiHomeDtoCopydefault4 != null ? C56443yFo.KWHzl(aiHomeDtoCopydefault4.AkhnZx()) : null);
                } else {
                    if (!(application instanceof LlmOrderViewModel.Application.ActionBar)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    C55326xho.toastWithFailedIcon$default(((LlmOrderViewModel.Application.ActionBar) application).copydefault(), 0, 1, (Object) null);
                }
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
