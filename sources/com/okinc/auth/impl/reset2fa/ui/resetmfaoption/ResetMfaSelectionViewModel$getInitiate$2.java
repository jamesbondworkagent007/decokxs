package com.okinc.auth.impl.reset2fa.ui.resetmfaoption;

import com.okinc.auth.api.reset2fa.RebindMfaEntryPoint;
import com.okinc.auth.api.reset2fa.data.model.ResetMfaInitiateRequest;
import com.okinc.auth.api.reset2fa.data.model.ResetMfaInitiateResponse;
import com.okinc.network.okg.cor.SubdomainStrategy;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.C32989mnw;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.C6624aSp;
import o.C8206ayP;

/* JADX INFO: loaded from: classes3.dex */
public final class ResetMfaSelectionViewModel$getInitiate$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ List<String> $resetTypeList;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ResetMfaSelectionViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ResetMfaSelectionViewModel$getInitiate$2(ResetMfaSelectionViewModel resetMfaSelectionViewModel, List<String> list, Continuation<? super ResetMfaSelectionViewModel$getInitiate$2> continuation) {
        super(2, continuation);
        this.this$0 = resetMfaSelectionViewModel;
        this.$resetTypeList = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ResetMfaSelectionViewModel$getInitiate$2 resetMfaSelectionViewModel$getInitiate$2 = new ResetMfaSelectionViewModel$getInitiate$2(this.this$0, this.$resetTypeList, continuation);
        resetMfaSelectionViewModel$getInitiate$2.L$0 = obj;
        return resetMfaSelectionViewModel$getInitiate$2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ResetMfaSelectionViewModel$getInitiate$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        ResetMfaInitiateRequest resetMfaInitiateRequest;
        Object objEZpvd;
        String nextStep;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            this.this$0.AEQbTJ.setValue(new C32989mnw(C56443yFo.KWHzl(true)));
            if (this.this$0.OLrzqt() instanceof RebindMfaEntryPoint.ForgetPassword) {
                List<String> list = this.$resetTypeList;
                RebindMfaEntryPoint rebindMfaEntryPointOLrzqt = this.this$0.OLrzqt();
                Intrinsics.copydefault(rebindMfaEntryPointOLrzqt, "");
                resetMfaInitiateRequest = new ResetMfaInitiateRequest(list, (String) null, (String) null, ((RebindMfaEntryPoint.ForgetPassword) rebindMfaEntryPointOLrzqt).getToken(), 6, (DefaultConstructorMarker) null);
            } else {
                resetMfaInitiateRequest = new ResetMfaInitiateRequest(this.$resetTypeList, (String) null, (String) null, (String) null, 14, (DefaultConstructorMarker) null);
            }
            C6624aSp c6624aSp = this.this$0.isConnected;
            boolean z = this.this$0.OLrzqt() instanceof RebindMfaEntryPoint.ForgetPassword;
            SubdomainStrategy subdomainStrategyFetchVPNInfo = this.this$0.fetchVPNInfo();
            this.L$0 = coroutineScope;
            this.label = 1;
            objEZpvd = c6624aSp.EZpvd(z, resetMfaInitiateRequest, subdomainStrategyFetchVPNInfo, this);
            if (objEZpvd == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            objEZpvd = obj;
        }
        ResetMfaSelectionViewModel resetMfaSelectionViewModel = this.this$0;
        C6624aSp.Application application = (C6624aSp.Application) objEZpvd;
        resetMfaSelectionViewModel.AEQbTJ.setValue(new C32989mnw(C56443yFo.KWHzl(false)));
        if (application instanceof C6624aSp.Application.Activity) {
            C6624aSp.Application.Activity activity = (C6624aSp.Application.Activity) application;
            ResetMfaInitiateResponse resetMfaInitiateResponseEZpvd = activity.EZpvd();
            if (resetMfaInitiateResponseEZpvd == null || (nextStep = resetMfaInitiateResponseEZpvd.getNextStep()) == null) {
                resetMfaSelectionViewModel.copydefault.setValue(new C32989mnw(resetMfaSelectionViewModel.DbNXlk(C8206ayP.Dialog.DPHNDa)));
            } else {
                resetMfaSelectionViewModel.OLrzqt.setValue(new C32989mnw(new Pair(nextStep, activity.EZpvd())));
            }
        } else if (application instanceof C6624aSp.Application.ActionBar) {
            resetMfaSelectionViewModel.gEmmrt.setValue(new C32989mnw(((C6624aSp.Application.ActionBar) application).KWHzl()));
        } else if (application instanceof C6624aSp.Application.TaskDescription) {
            resetMfaSelectionViewModel.copydefault.setValue(new C32989mnw(((C6624aSp.Application.TaskDescription) application).KWHzl()));
        } else if (application instanceof C6624aSp.Application.StateListAnimator) {
            resetMfaSelectionViewModel.EZpvd.setValue(new C32989mnw(((C6624aSp.Application.StateListAnimator) application).AEQbTJ()));
        } else if (application instanceof C6624aSp.Application.C0822Application) {
            resetMfaSelectionViewModel.AhwBna.setValue(new C32989mnw(Unit.INSTANCE));
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return Unit.INSTANCE;
    }
}
