package com.okinc.business.defi.dapp.webview;

import com.okinc.business.defi.api.bean.PlatformItem;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.C13241dEa;
import o.C14923duc;
import o.C43248rlh;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC9854bdT;
import o.dGQ;

/* JADX INFO: loaded from: classes4.dex */
public final class WebAppInterface$getCallsStatus$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Object $id;
    final /* synthetic */ String $statusId;
    final /* synthetic */ C13241dEa $webView;
    int label;
    final /* synthetic */ dGQ this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebAppInterface$getCallsStatus$1(dGQ dgq, String str, Object obj, C13241dEa c13241dEa, Continuation<? super WebAppInterface$getCallsStatus$1> continuation) {
        super(2, continuation);
        this.this$0 = dgq;
        this.$statusId = str;
        this.$id = obj;
        this.$webView = c13241dEa;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new WebAppInterface$getCallsStatus$1(this.this$0, this.$statusId, this.$id, this.$webView, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((WebAppInterface$getCallsStatus$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        String url;
        String str;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC9854bdT interfaceC9854bdT = (InterfaceC9854bdT) C43248rlh.KWHzl.AEQbTJ(InterfaceC9854bdT.class);
            C14923duc c14923duc = C14923duc.EZpvd;
            PlatformItem platformItemAhwBna = this.this$0.AhwBna();
            if (platformItemAhwBna == null || (url = platformItemAhwBna.getUrl()) == null) {
                url = "";
            }
            String strKWHzl = c14923duc.KWHzl(url);
            String str2 = this.$statusId;
            Intrinsics.copydefault((Object) str2);
            this.label = 1;
            obj = interfaceC9854bdT.KWHzl(strKWHzl, str2, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        String str3 = (String) obj;
        if (str3 != null && str3.length() != 0) {
            str = "window.okxwallet.sendResponse(" + this.$id + ", " + str3 + ")";
        } else {
            str = "window.okxwallet.sendError(" + this.$id + ")";
        }
        C13241dEa c13241dEa = this.$webView;
        if (c13241dEa != null) {
            c13241dEa.evaluateJavascript(str, null);
        }
        return Unit.INSTANCE;
    }
}
