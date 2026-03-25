package com.okinc.ok_kyc_core.presentation.base;

import androidx.fragment.app.FragmentActivity;
import com.okinc.network.okg.response.ResponseFailedException;
import com.okinc.ok_kyc_core.data.NavOptions;
import com.okinc.ok_kyc_core.data.remote.networkmodel.FormAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.OnDemandKYCAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.PageComponentAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.ProcessingAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.ResultAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.VirtualActionAppModel;
import java.util.HashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC42074rFj;
import o.AbstractC43728ruk;
import o.C33129mqd;
import o.C42463rTu;
import o.C43700ruI;
import o.C43734ruq;
import o.C52794wYp;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.rBG;

/* JADX INFO: loaded from: classes10.dex */
public final class BaseKYCViewModel$getOnboarding$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ FragmentActivity $activity;
    final /* synthetic */ boolean $closeVerifyCenter;
    final /* synthetic */ String $featureUri;
    final /* synthetic */ Function1<String, Unit> $onErrorCallable;
    final /* synthetic */ Map<String, String> $params;
    final /* synthetic */ String $playbook;
    final /* synthetic */ C52794wYp $view;
    int label;
    final /* synthetic */ AbstractC42074rFj this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r8v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public BaseKYCViewModel$getOnboarding$1(AbstractC42074rFj abstractC42074rFj, String str, String str2, Map<String, String> map, C52794wYp c52794wYp, FragmentActivity fragmentActivity, boolean z, Function1<? super String, Unit> function1, Continuation<? super BaseKYCViewModel$getOnboarding$1> continuation) {
        super(2, continuation);
        this.this$0 = abstractC42074rFj;
        this.$playbook = str;
        this.$featureUri = str2;
        this.$params = map;
        this.$view = c52794wYp;
        this.$activity = fragmentActivity;
        this.$closeVerifyCenter = z;
        this.$onErrorCallable = function1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BaseKYCViewModel$getOnboarding$1(this.this$0, this.$playbook, this.$featureUri, this.$params, this.$view, this.$activity, this.$closeVerifyCenter, this.$onErrorCallable, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((BaseKYCViewModel$getOnboarding$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objOLrzqt;
        NavOptions navOptions;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            Pair pairResolveCorAndLanguage$default = C42463rTu.resolveCorAndLanguage$default(C42463rTu.KWHzl, null, 1, null);
            String str = (String) pairResolveCorAndLanguage$default.component1();
            String str2 = (String) pairResolveCorAndLanguage$default.component2();
            rBG rbgValueOf = this.this$0.valueOf();
            String str3 = this.$playbook;
            String str4 = this.$featureUri;
            Map<String, String> map = this.$params;
            this.label = 1;
            objOLrzqt = rbgValueOf.OLrzqt(str3, str4, map, str, str2, this);
            if (objOLrzqt == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            objOLrzqt = obj;
        }
        AbstractC43728ruk abstractC43728ruk = (AbstractC43728ruk) objOLrzqt;
        AbstractC42074rFj abstractC42074rFj = this.this$0;
        C52794wYp c52794wYp = this.$view;
        FragmentActivity fragmentActivity = this.$activity;
        boolean z = this.$closeVerifyCenter;
        String str5 = this.$playbook;
        Map<String, String> map2 = this.$params;
        if (abstractC43728ruk instanceof AbstractC43728ruk.ActionBar) {
            OnDemandKYCAppModel onDemandKYCAppModel = (OnDemandKYCAppModel) ((AbstractC43728ruk.ActionBar) abstractC43728ruk).KWHzl();
            if (!(onDemandKYCAppModel.getViewModel() instanceof VirtualActionAppModel)) {
                AbstractC42074rFj.cancelLoading$default(abstractC42074rFj, c52794wYp, fragmentActivity, false, 4, null);
            }
            PageComponentAppModel viewModel = onDemandKYCAppModel.getViewModel();
            if (viewModel != null) {
                boolean z2 = viewModel instanceof FormAppModel;
                if (z2 && z) {
                    FormAppModel formAppModel = (FormAppModel) viewModel;
                    if (formAppModel.getCanGoBack() == null) {
                        formAppModel.setCanGoBack(C56443yFo.KWHzl(false));
                    }
                }
                if (z2 && Intrinsics.EZpvd(((FormAppModel) viewModel).getCanGoBack(), C56443yFo.KWHzl(false))) {
                    navOptions = NavOptions.CleanBackStack;
                } else if ((viewModel instanceof ResultAppModel) && !Intrinsics.EZpvd(((ResultAppModel) viewModel).getCanGoBack(), C56443yFo.KWHzl(true))) {
                    navOptions = NavOptions.CleanBackStack;
                } else if (viewModel instanceof ProcessingAppModel) {
                    if (((ProcessingAppModel) viewModel).getItems().isEmpty()) {
                        navOptions = NavOptions.CleanBackStackWithNoAmin;
                    } else {
                        navOptions = NavOptions.CleanBackStack;
                    }
                } else if (z) {
                    navOptions = NavOptions.CleanBackStack;
                } else {
                    navOptions = NavOptions.Default;
                }
                abstractC42074rFj.iwGUEr().setValue(new C43734ruq<>(new Pair(new C43700ruI(onDemandKYCAppModel, str5, null, new HashMap(map2), navOptions, C56443yFo.KWHzl(true)), c52794wYp)));
            }
        }
        AbstractC42074rFj abstractC42074rFj2 = this.this$0;
        C52794wYp c52794wYp2 = this.$view;
        FragmentActivity fragmentActivity2 = this.$activity;
        Function1<String, Unit> function1 = this.$onErrorCallable;
        if (abstractC43728ruk instanceof AbstractC43728ruk.TaskDescription) {
            ResponseFailedException responseFailedException = (ResponseFailedException) ((AbstractC43728ruk.TaskDescription) abstractC43728ruk).OLrzqt();
            AbstractC42074rFj.cancelLoading$default(abstractC42074rFj2, c52794wYp2, fragmentActivity2, false, 4, null);
            if (function1 != null) {
                function1.invoke(C33129mqd.gEmmrt(responseFailedException.getMessage()));
            }
            abstractC42074rFj2.getNewProxyInstance().setValue(new C43734ruq<>(C33129mqd.gEmmrt(responseFailedException.getMessage())));
        }
        return Unit.INSTANCE;
    }
}
