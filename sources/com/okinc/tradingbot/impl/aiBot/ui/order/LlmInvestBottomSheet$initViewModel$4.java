package com.okinc.tradingbot.impl.aiBot.ui.order;

import androidx.fragment.app.FragmentActivity;
import com.google.gson.JsonObject;
import com.okinc.business.defi.biz.core.error.WalletImportError;
import com.okinc.network.okg.response.OKServerException;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.tradingbot.impl.aiBot.ui.order.LlmInvestViewModel;
import com.okinc.unify_trade.biz.StrategyResponse;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.json.Json;
import o.ActivityC51150vhb;
import o.C33070mpX;
import o.C43284rmQ;
import o.C48033uCm;
import o.C55326xho;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.uEG;

/* JADX INFO: loaded from: classes11.dex */
public final class LlmInvestBottomSheet$initViewModel$4 extends SuspendLambda implements Function2<LlmInvestViewModel.ActionBar, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ uEG this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LlmInvestBottomSheet$initViewModel$4(uEG ueg, Continuation<? super LlmInvestBottomSheet$initViewModel$4> continuation) {
        super(2, continuation);
        this.this$0 = ueg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        LlmInvestBottomSheet$initViewModel$4 llmInvestBottomSheet$initViewModel$4 = new LlmInvestBottomSheet$initViewModel$4(this.this$0, continuation);
        llmInvestBottomSheet$initViewModel$4.L$0 = obj;
        return llmInvestBottomSheet$initViewModel$4;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(LlmInvestViewModel.ActionBar actionBar, Continuation<? super Unit> continuation) {
        return ((LlmInvestBottomSheet$initViewModel$4) create(actionBar, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x008d  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        String strAYXKKw;
        OKServerException oKServerException;
        String sMsg;
        JsonObject response;
        StrategyResponse strategyResponse;
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            LlmInvestViewModel.ActionBar actionBar = (LlmInvestViewModel.ActionBar) this.L$0;
            if (actionBar instanceof LlmInvestViewModel.ActionBar.TaskDescription) {
                try {
                    Result.Application application = Result.Companion;
                    Throwable thAEQbTJ = ((LlmInvestViewModel.ActionBar.TaskDescription) actionBar).AEQbTJ();
                    oKServerException = thAEQbTJ instanceof OKServerException ? (OKServerException) thAEQbTJ : null;
                } catch (Throwable th) {
                    Result.Application application2 = Result.Companion;
                    objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                }
                if (oKServerException == null || (response = oKServerException.getResponse()) == null) {
                    sMsg = null;
                    objM7377constructorimpl = Result.m7377constructorimpl(sMsg);
                    if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
                        objM7377constructorimpl = null;
                    }
                    String str = (String) objM7377constructorimpl;
                    strAYXKKw = str != null ? str : "";
                    if (strAYXKKw.length() == 0) {
                        strAYXKKw = C33070mpX.AYXKKw(C48033uCm.Fragment.RTWSvT);
                    }
                    C55326xho.toastWithFailedIcon$default(strAYXKKw, 0, 1, (Object) null);
                } else {
                    Json jsonKWHzl = C43284rmQ.KWHzl();
                    String string = response.toString();
                    Intrinsics.checkNotNullExpressionValue(string, "");
                    jsonKWHzl.getSerializersModule();
                    List list = (List) ((ResponseData) jsonKWHzl.decodeFromString(ResponseData.Companion.serializer(new ArrayListSerializer(StrategyResponse.Companion.serializer())), string)).getData();
                    if (list != null && (strategyResponse = (StrategyResponse) CollectionsKt___CollectionsKt.AuCTelauCTel(list)) != null) {
                        sMsg = strategyResponse.getSMsg();
                    }
                    objM7377constructorimpl = Result.m7377constructorimpl(sMsg);
                    if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
                    }
                    String str2 = (String) objM7377constructorimpl;
                    if (str2 != null) {
                    }
                    if (strAYXKKw.length() == 0) {
                    }
                    C55326xho.toastWithFailedIcon$default(strAYXKKw, 0, 1, (Object) null);
                }
            } else {
                if (!(actionBar instanceof LlmInvestViewModel.ActionBar.C0635ActionBar)) {
                    throw new NoWhenBranchMatchedException();
                }
                this.this$0.dismiss();
                ActivityC51150vhb.Application application3 = ActivityC51150vhb.Companion;
                FragmentActivity fragmentActivityRequireActivity = this.this$0.requireActivity();
                Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
                application3.AEQbTJ(fragmentActivityRequireActivity, (WalletImportError.ERROR_CODE_AA_EXIST & 2) != 0 ? null : "ai_bot", (WalletImportError.ERROR_CODE_AA_EXIST & 4) != 0 ? null : ((LlmInvestViewModel.ActionBar.C0635ActionBar) actionBar).copydefault().getAlgoId(), (WalletImportError.ERROR_CODE_AA_EXIST & 8) != 0 ? null : null, (WalletImportError.ERROR_CODE_AA_EXIST & 16) != 0 ? false : false, (WalletImportError.ERROR_CODE_AA_EXIST & 32) != 0 ? null : null, (WalletImportError.ERROR_CODE_AA_EXIST & 64) == 0 ? C56443yFo.AEQbTJ(0) : null);
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
