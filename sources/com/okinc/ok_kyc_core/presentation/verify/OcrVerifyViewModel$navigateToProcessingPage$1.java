package com.okinc.ok_kyc_core.presentation.verify;

import androidx.core.os.BundleKt;
import com.google.android.gms.common.Scopes;
import com.okinc.ok_kyc_core.data.NavOptions;
import com.okinc.ok_kyc_core.data.remote.networkmodel.PageComponentAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.PageComponentProfile;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C42203rKd;
import o.C43662rtX;
import o.C56390yDp;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes23.dex */
public final class OcrVerifyViewModel$navigateToProcessingPage$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ PageComponentAppModel $arg;
    final /* synthetic */ NavOptions $navOptions;
    final /* synthetic */ String $playbook;
    final /* synthetic */ HashMap<String, String> $playbookParams;
    final /* synthetic */ PageComponentProfile $profile;
    final /* synthetic */ String $redirectUrl;
    int label;
    final /* synthetic */ C42203rKd this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OcrVerifyViewModel$navigateToProcessingPage$1(C42203rKd c42203rKd, PageComponentAppModel pageComponentAppModel, String str, String str2, HashMap<String, String> map, PageComponentProfile pageComponentProfile, NavOptions navOptions, Continuation<? super OcrVerifyViewModel$navigateToProcessingPage$1> continuation) {
        super(2, continuation);
        this.this$0 = c42203rKd;
        this.$arg = pageComponentAppModel;
        this.$playbook = str;
        this.$redirectUrl = str2;
        this.$playbookParams = map;
        this.$profile = pageComponentProfile;
        this.$navOptions = navOptions;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OcrVerifyViewModel$navigateToProcessingPage$1(this.this$0, this.$arg, this.$playbook, this.$redirectUrl, this.$playbookParams, this.$profile, this.$navOptions, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((OcrVerifyViewModel$navigateToProcessingPage$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            this.this$0.copydefault(C43662rtX.ActionBar.fetchVPNInfo, BundleKt.bundleOf(C56390yDp.OLrzqt("arg", this.$arg), C56390yDp.OLrzqt("playbook", this.$playbook), C56390yDp.OLrzqt("redirectUrl", this.$redirectUrl), C56390yDp.OLrzqt("playbookParams", this.$playbookParams), C56390yDp.OLrzqt(Scopes.PROFILE, this.$profile)), this.$navOptions);
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
