package com.okinc.ok_kyc_core.presentation.formTemplate;

import androidx.core.os.BundleKt;
import com.google.android.gms.common.Scopes;
import com.okinc.ok_kyc_core.data.NavOptions;
import com.okinc.ok_kyc_core.data.remote.networkmodel.FormAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.PageComponentAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.PageComponentProfile;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.C43662rtX;
import o.C56390yDp;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.rGL;

/* JADX INFO: loaded from: classes16.dex */
public final class FormViewModel$navigateToFormPage$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ PageComponentAppModel $arg;
    final /* synthetic */ NavOptions $navOptions;
    final /* synthetic */ String $playbook;
    final /* synthetic */ HashMap<String, String> $playbookParams;
    final /* synthetic */ PageComponentProfile $profile;
    int label;
    final /* synthetic */ rGL this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FormViewModel$navigateToFormPage$1(PageComponentAppModel pageComponentAppModel, NavOptions navOptions, rGL rgl, String str, HashMap<String, String> map, PageComponentProfile pageComponentProfile, Continuation<? super FormViewModel$navigateToFormPage$1> continuation) {
        super(2, continuation);
        this.$arg = pageComponentAppModel;
        this.$navOptions = navOptions;
        this.this$0 = rgl;
        this.$playbook = str;
        this.$playbookParams = map;
        this.$profile = pageComponentProfile;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FormViewModel$navigateToFormPage$1(this.$arg, this.$navOptions, this.this$0, this.$playbook, this.$playbookParams, this.$profile, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((FormViewModel$navigateToFormPage$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            PageComponentAppModel pageComponentAppModel = this.$arg;
            FormAppModel formAppModel = pageComponentAppModel instanceof FormAppModel ? (FormAppModel) pageComponentAppModel : null;
            this.this$0.copydefault(C43662rtX.ActionBar.EZpvd, BundleKt.bundleOf(C56390yDp.OLrzqt("arg", this.$arg), C56390yDp.OLrzqt("playbook", this.$playbook), C56390yDp.OLrzqt("playbookParams", this.$playbookParams), C56390yDp.OLrzqt(Scopes.PROFILE, this.$profile)), (formAppModel == null || !Intrinsics.EZpvd(formAppModel.isFormRefresh(), C56443yFo.KWHzl(true))) ? this.$navOptions : NavOptions.NoAnimation);
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
