package com.okinc.ok_kyc_core.presentation.base;

import androidx.fragment.app.FragmentActivity;
import com.okinc.network.okg.response.ResponseFailedException;
import com.okinc.ok_kyc_core.data.NavOptions;
import com.okinc.ok_kyc_core.data.remote.networkmodel.ButtonAction;
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
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC42074rFj;
import o.AbstractC43728ruk;
import o.C33129mqd;
import o.C41957rBa;
import o.C42463rTu;
import o.C43700ruI;
import o.C43734ruq;
import o.C52794wYp;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.rBJ;

/* JADX INFO: loaded from: classes10.dex */
public final class BaseKYCViewModel$postOnboarding$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ FragmentActivity $activity;
    final /* synthetic */ ButtonAction $buttonAction;
    final /* synthetic */ String $certificateType;
    final /* synthetic */ String $cor;
    final /* synthetic */ Map<String, String> $ctaValue;
    final /* synthetic */ String $featureUri;
    final /* synthetic */ C41957rBa $form;
    final /* synthetic */ String $id;
    final /* synthetic */ Function1<String, Unit> $onErrorCallable;
    final /* synthetic */ Function0<Unit> $onSuccessCallable;
    final /* synthetic */ Map<String, String> $params;
    final /* synthetic */ String $playbook;
    final /* synthetic */ String $redirectUrl;
    final /* synthetic */ String $refreshType;
    final /* synthetic */ String $target;
    final /* synthetic */ C52794wYp $view;
    int label;
    final /* synthetic */ AbstractC42074rFj this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r19v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public BaseKYCViewModel$postOnboarding$1(String str, AbstractC42074rFj abstractC42074rFj, String str2, String str3, String str4, Map<String, String> map, String str5, C41957rBa c41957rBa, Map<String, String> map2, String str6, String str7, C52794wYp c52794wYp, FragmentActivity fragmentActivity, String str8, Function0<Unit> function0, Function1<? super String, Unit> function1, ButtonAction buttonAction, Continuation<? super BaseKYCViewModel$postOnboarding$1> continuation) {
        super(2, continuation);
        this.$cor = str;
        this.this$0 = abstractC42074rFj;
        this.$playbook = str2;
        this.$featureUri = str3;
        this.$target = str4;
        this.$ctaValue = map;
        this.$id = str5;
        this.$form = c41957rBa;
        this.$params = map2;
        this.$certificateType = str6;
        this.$refreshType = str7;
        this.$view = c52794wYp;
        this.$activity = fragmentActivity;
        this.$redirectUrl = str8;
        this.$onSuccessCallable = function0;
        this.$onErrorCallable = function1;
        this.$buttonAction = buttonAction;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BaseKYCViewModel$postOnboarding$1(this.$cor, this.this$0, this.$playbook, this.$featureUri, this.$target, this.$ctaValue, this.$id, this.$form, this.$params, this.$certificateType, this.$refreshType, this.$view, this.$activity, this.$redirectUrl, this.$onSuccessCallable, this.$onErrorCallable, this.$buttonAction, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((BaseKYCViewModel$postOnboarding$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objEZpvd;
        NavOptions navOptions;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            Pair<String, String> pairCopydefault = C42463rTu.KWHzl.copydefault(this.$cor);
            String strComponent1 = pairCopydefault.component1();
            String strComponent2 = pairCopydefault.component2();
            rBJ rbjFARcdN = this.this$0.fARcdN();
            String str = this.$playbook;
            String str2 = this.$featureUri;
            String str3 = this.$target;
            Map<String, String> map = this.$ctaValue;
            String str4 = this.$id;
            C41957rBa c41957rBa = this.$form;
            Map<String, String> map2 = this.$params;
            String str5 = this.$certificateType;
            String str6 = this.$refreshType;
            this.label = 1;
            objEZpvd = rbjFARcdN.EZpvd(str, str2, str3, map, str4, c41957rBa, map2, strComponent1, strComponent2, str5, str6, this);
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
        AbstractC43728ruk abstractC43728ruk = (AbstractC43728ruk) objEZpvd;
        AbstractC42074rFj abstractC42074rFj = this.this$0;
        C52794wYp c52794wYp = this.$view;
        FragmentActivity fragmentActivity = this.$activity;
        String str7 = this.$playbook;
        String str8 = this.$redirectUrl;
        Map<String, String> map3 = this.$params;
        Function0<Unit> function0 = this.$onSuccessCallable;
        if (abstractC43728ruk instanceof AbstractC43728ruk.ActionBar) {
            OnDemandKYCAppModel onDemandKYCAppModel = (OnDemandKYCAppModel) ((AbstractC43728ruk.ActionBar) abstractC43728ruk).KWHzl();
            if (!(onDemandKYCAppModel.getViewModel() instanceof VirtualActionAppModel)) {
                abstractC42074rFj.copydefault(c52794wYp, fragmentActivity, true);
            }
            PageComponentAppModel viewModel = onDemandKYCAppModel.getViewModel();
            if (viewModel != null) {
                if ((viewModel instanceof FormAppModel) && Intrinsics.EZpvd(((FormAppModel) viewModel).getCanGoBack(), C56443yFo.KWHzl(false))) {
                    navOptions = NavOptions.CleanBackStack;
                } else if ((viewModel instanceof ResultAppModel) && !Intrinsics.EZpvd(((ResultAppModel) viewModel).getCanGoBack(), C56443yFo.KWHzl(true))) {
                    navOptions = NavOptions.CleanBackStack;
                } else if (viewModel instanceof ProcessingAppModel) {
                    if (((ProcessingAppModel) viewModel).getItems().isEmpty()) {
                        navOptions = NavOptions.CleanBackStackWithNoAmin;
                    } else {
                        navOptions = NavOptions.CleanBackStack;
                    }
                } else {
                    navOptions = NavOptions.Default;
                }
                abstractC42074rFj.iwGUEr().setValue(new C43734ruq<>(new Pair(new C43700ruI(onDemandKYCAppModel, str7, str8, new HashMap(map3), navOptions, null, 32, null), c52794wYp)));
                if (function0 != null) {
                    function0.invoke();
                }
            }
        }
        AbstractC42074rFj abstractC42074rFj2 = this.this$0;
        C52794wYp c52794wYp2 = this.$view;
        FragmentActivity fragmentActivity2 = this.$activity;
        Function1<String, Unit> function1 = this.$onErrorCallable;
        ButtonAction buttonAction = this.$buttonAction;
        if (abstractC43728ruk instanceof AbstractC43728ruk.TaskDescription) {
            ResponseFailedException responseFailedException = (ResponseFailedException) ((AbstractC43728ruk.TaskDescription) abstractC43728ruk).OLrzqt();
            AbstractC42074rFj.cancelLoading$default(abstractC42074rFj2, c52794wYp2, fragmentActivity2, false, 4, null);
            if (function1 != null) {
                function1.invoke(responseFailedException.getMessage());
            }
            String strGEmmrt = C33129mqd.gEmmrt(responseFailedException.getMessage());
            if (buttonAction == ButtonAction.SubmitGps) {
                abstractC42074rFj2.EZpvd(strGEmmrt, 1);
            } else {
                abstractC42074rFj2.getNewProxyInstance().setValue(new C43734ruq<>(strGEmmrt));
            }
        }
        return Unit.INSTANCE;
    }
}
