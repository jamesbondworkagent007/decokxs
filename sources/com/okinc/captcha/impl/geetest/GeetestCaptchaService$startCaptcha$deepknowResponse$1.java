package com.okinc.captcha.impl.geetest;

import com.okinc.captcha.impl.data.CaptchaScene;
import com.okinc.network.okg.cor.SubdomainStrategy;
import com.okinc.network.okg.response.ResponseData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;
import o.lVC;
import o.lVD;

/* JADX INFO: loaded from: classes7.dex */
public final class GeetestCaptchaService$startCaptcha$deepknowResponse$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super DeepknowResponse>, Object> {
    final /* synthetic */ String $areaCode;
    final /* synthetic */ String $loginName;
    final /* synthetic */ CaptchaScene $scene;
    final /* synthetic */ String $sessionId;
    final /* synthetic */ SubdomainStrategy $subdomainStrategy;
    int label;
    final /* synthetic */ lVC this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GeetestCaptchaService$startCaptcha$deepknowResponse$1(String str, CaptchaScene captchaScene, String str2, String str3, lVC lvc, SubdomainStrategy subdomainStrategy, Continuation<? super GeetestCaptchaService$startCaptcha$deepknowResponse$1> continuation) {
        super(2, continuation);
        this.$sessionId = str;
        this.$scene = captchaScene;
        this.$loginName = str2;
        this.$areaCode = str3;
        this.this$0 = lvc;
        this.$subdomainStrategy = subdomainStrategy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GeetestCaptchaService$startCaptcha$deepknowResponse$1(this.$sessionId, this.$scene, this.$loginName, this.$areaCode, this.this$0, this.$subdomainStrategy, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super DeepknowResponse> continuation) {
        return ((GeetestCaptchaService$startCaptcha$deepknowResponse$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            DeepknowRequest deepknowRequest = new DeepknowRequest(this.$sessionId, this.$scene.getKey(), this.$loginName, this.$areaCode);
            lVD lvd = this.this$0.AEQbTJ;
            String string = this.$subdomainStrategy.toString();
            this.label = 1;
            obj = lvd.copydefault(deepknowRequest, string, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        Object data = ((ResponseData) obj).getData();
        Intrinsics.copydefault(data);
        return data;
    }
}
