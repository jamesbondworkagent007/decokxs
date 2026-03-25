package com.okinc.tradingbot.impl.signalClone.ui;

import android.content.Context;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.google.gson.JsonObject;
import com.okinc.business.defi.biz.core.error.WalletImportError;
import com.okinc.network.okg.response.OKServerException;
import com.okinc.network.okg.response.ResponseData;
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
import o.C33054mpH;
import o.C33070mpX;
import o.C43284rmQ;
import o.C48033uCm;
import o.C53826wsn;
import o.C55326xho;
import o.C56391yDq;
import o.C56442yFn;
import o.uSN;

/* JADX INFO: loaded from: classes16.dex */
public final class SignalCloneBottomSheet$onCreateContent$1$10 extends SuspendLambda implements Function2<C53826wsn.TaskDescription, Continuation<? super Unit>, Object> {
    final /* synthetic */ uSN $this_apply;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ SignalCloneBottomSheet this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SignalCloneBottomSheet$onCreateContent$1$10(uSN usn, SignalCloneBottomSheet signalCloneBottomSheet, Continuation<? super SignalCloneBottomSheet$onCreateContent$1$10> continuation) {
        super(2, continuation);
        this.$this_apply = usn;
        this.this$0 = signalCloneBottomSheet;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        SignalCloneBottomSheet$onCreateContent$1$10 signalCloneBottomSheet$onCreateContent$1$10 = new SignalCloneBottomSheet$onCreateContent$1$10(this.$this_apply, this.this$0, continuation);
        signalCloneBottomSheet$onCreateContent$1$10.L$0 = obj;
        return signalCloneBottomSheet$onCreateContent$1$10;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(C53826wsn.TaskDescription taskDescription, Continuation<? super Unit> continuation) {
        return ((SignalCloneBottomSheet$onCreateContent$1$10) create(taskDescription, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        StrategyResponse strategyResponse;
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            C53826wsn.TaskDescription taskDescription = (C53826wsn.TaskDescription) this.L$0;
            if (taskDescription instanceof C53826wsn.TaskDescription.Activity) {
                try {
                    Result.Application application = Result.Companion;
                    Throwable thKWHzl = ((C53826wsn.TaskDescription.Activity) taskDescription).KWHzl();
                    OKServerException oKServerException = thKWHzl instanceof OKServerException ? (OKServerException) thKWHzl : null;
                    JsonObject response = oKServerException != null ? oKServerException.getResponse() : null;
                    Intrinsics.copydefault(response);
                    Json jsonKWHzl = C43284rmQ.KWHzl();
                    String string = response.toString();
                    Intrinsics.checkNotNullExpressionValue(string, "");
                    jsonKWHzl.getSerializersModule();
                    List list = (List) ((ResponseData) jsonKWHzl.decodeFromString(ResponseData.Companion.serializer(new ArrayListSerializer(StrategyResponse.Companion.serializer())), string)).getData();
                    objM7377constructorimpl = Result.m7377constructorimpl((list == null || (strategyResponse = (StrategyResponse) CollectionsKt___CollectionsKt.AuCTelauCTel(list)) == null) ? null : strategyResponse.getSMsg());
                } catch (Throwable th) {
                    Result.Application application2 = Result.Companion;
                    objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                }
                if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
                    objM7377constructorimpl = null;
                }
                String str = (String) objM7377constructorimpl;
                String strAYXKKw = str != null ? str : "";
                if (strAYXKKw.length() == 0) {
                    strAYXKKw = C33070mpX.AYXKKw(C48033uCm.Fragment.RTWSvT);
                }
                C55326xho.toastWithFailedIcon$default(strAYXKKw, 0, 1, (Object) null);
            } else {
                if (!(taskDescription instanceof C53826wsn.TaskDescription.ActionBar)) {
                    throw new NoWhenBranchMatchedException();
                }
                Fragment fragmentFindFragmentByTag = this.this$0.getChildFragmentManager().findFragmentByTag("BotConfirmationSheet");
                DialogFragment dialogFragment = fragmentFindFragmentByTag instanceof DialogFragment ? (DialogFragment) fragmentFindFragmentByTag : null;
                if (dialogFragment != null) {
                    dialogFragment.dismiss();
                }
                FragmentActivity activity = this.this$0.getActivity();
                if (activity != null) {
                    C33054mpH.OLrzqt(activity, this.this$0.getView());
                }
                this.this$0.dismissAllowingStateLoss();
                ActivityC51150vhb.Application application3 = ActivityC51150vhb.Companion;
                Context contextRequireContext = this.this$0.requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
                application3.AEQbTJ(contextRequireContext, (WalletImportError.ERROR_CODE_AA_EXIST & 2) != 0 ? null : this.this$0.copydefault(), (WalletImportError.ERROR_CODE_AA_EXIST & 4) != 0 ? null : ((C53826wsn.TaskDescription.ActionBar) taskDescription).OLrzqt().getAlgoId(), (WalletImportError.ERROR_CODE_AA_EXIST & 8) != 0 ? null : null, (WalletImportError.ERROR_CODE_AA_EXIST & 16) != 0 ? false : false, (WalletImportError.ERROR_CODE_AA_EXIST & 32) != 0 ? null : null, (WalletImportError.ERROR_CODE_AA_EXIST & 64) == 0 ? null : null);
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
