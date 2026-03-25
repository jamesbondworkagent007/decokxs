package com.okinc.web;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC43238rlX;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC43294rma;

/* JADX INFO: loaded from: classes19.dex */
public final class WebActivity$OkWebViewClient$shouldOverrideUrlLoading$5$status$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super AbstractC43238rlX>, Object> {
    final /* synthetic */ InterfaceC43294rma $deeplinkService;
    final /* synthetic */ String $url;
    int label;
    final /* synthetic */ WebActivity this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebActivity$OkWebViewClient$shouldOverrideUrlLoading$5$status$1(InterfaceC43294rma interfaceC43294rma, WebActivity webActivity, String str, Continuation<? super WebActivity$OkWebViewClient$shouldOverrideUrlLoading$5$status$1> continuation) {
        super(2, continuation);
        this.$deeplinkService = interfaceC43294rma;
        this.this$0 = webActivity;
        this.$url = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new WebActivity$OkWebViewClient$shouldOverrideUrlLoading$5$status$1(this.$deeplinkService, this.this$0, this.$url, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super AbstractC43238rlX> continuation) {
        return ((WebActivity$OkWebViewClient$shouldOverrideUrlLoading$5$status$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC43294rma interfaceC43294rma = this.$deeplinkService;
            WebActivity webActivity = this.this$0;
            String str = this.$url;
            this.label = 1;
            obj = interfaceC43294rma.EZpvd(webActivity, str, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return obj;
    }
}
