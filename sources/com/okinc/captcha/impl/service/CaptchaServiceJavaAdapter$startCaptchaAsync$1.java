package com.okinc.captcha.impl.service;

import androidx.fragment.app.FragmentActivity;
import com.okinc.captcha.impl.data.CaptchaScene;
import com.okinc.captcha.impl.data.CaptchaVendor;
import com.okinc.network.okg.cor.SubdomainStrategy;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC30369lVv;
import o.C56391yDq;
import o.C56442yFn;
import o.lWe;

/* JADX INFO: loaded from: classes15.dex */
public final class CaptchaServiceJavaAdapter$startCaptchaAsync$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super AbstractC30369lVv>, Object> {
    final /* synthetic */ FragmentActivity $activity;
    final /* synthetic */ String $areaCode;
    final /* synthetic */ String $loginName;
    final /* synthetic */ CaptchaScene $scene;
    final /* synthetic */ String $sourcePage;
    final /* synthetic */ SubdomainStrategy $subdomainStrategy;
    final /* synthetic */ lWe $this_startCaptchaAsync;
    final /* synthetic */ CaptchaVendor $vendor;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CaptchaServiceJavaAdapter$startCaptchaAsync$1(lWe lwe, FragmentActivity fragmentActivity, CaptchaScene captchaScene, String str, CaptchaVendor captchaVendor, String str2, String str3, SubdomainStrategy subdomainStrategy, Continuation<? super CaptchaServiceJavaAdapter$startCaptchaAsync$1> continuation) {
        super(2, continuation);
        this.$this_startCaptchaAsync = lwe;
        this.$activity = fragmentActivity;
        this.$scene = captchaScene;
        this.$sourcePage = str;
        this.$vendor = captchaVendor;
        this.$loginName = str2;
        this.$areaCode = str3;
        this.$subdomainStrategy = subdomainStrategy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CaptchaServiceJavaAdapter$startCaptchaAsync$1(this.$this_startCaptchaAsync, this.$activity, this.$scene, this.$sourcePage, this.$vendor, this.$loginName, this.$areaCode, this.$subdomainStrategy, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super AbstractC30369lVv> continuation) {
        return ((CaptchaServiceJavaAdapter$startCaptchaAsync$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            return obj;
        }
        C56391yDq.AEQbTJ(obj);
        lWe lwe = this.$this_startCaptchaAsync;
        FragmentActivity fragmentActivity = this.$activity;
        CaptchaScene captchaScene = this.$scene;
        String str = this.$sourcePage;
        CaptchaVendor captchaVendor = this.$vendor;
        String str2 = this.$loginName;
        String str3 = this.$areaCode;
        SubdomainStrategy subdomainStrategy = this.$subdomainStrategy;
        this.label = 1;
        Object objStartCaptcha$default = lWe.StateListAnimator.startCaptcha$default(lwe, fragmentActivity, captchaScene, str, captchaVendor, str2, str3, subdomainStrategy, null, null, null, false, null, null, this, 8064, null);
        return objStartCaptcha$default == objCopydefault ? objCopydefault : objStartCaptcha$default;
    }
}
