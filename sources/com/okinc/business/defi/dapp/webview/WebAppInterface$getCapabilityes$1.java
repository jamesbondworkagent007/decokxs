package com.okinc.business.defi.dapp.webview;

import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.C13241dEa;
import o.C43248rlh;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC9738bbJ;
import o.InterfaceC9854bdT;

/* JADX INFO: loaded from: classes4.dex */
public final class WebAppInterface$getCapabilityes$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ List<String> $chains;
    final /* synthetic */ Object $id;
    final /* synthetic */ InterfaceC9738bbJ $mainWallet;
    final /* synthetic */ C13241dEa $webView;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebAppInterface$getCapabilityes$1(InterfaceC9738bbJ interfaceC9738bbJ, List<String> list, Object obj, C13241dEa c13241dEa, Continuation<? super WebAppInterface$getCapabilityes$1> continuation) {
        super(2, continuation);
        this.$mainWallet = interfaceC9738bbJ;
        this.$chains = list;
        this.$id = obj;
        this.$webView = c13241dEa;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new WebAppInterface$getCapabilityes$1(this.$mainWallet, this.$chains, this.$id, this.$webView, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((WebAppInterface$getCapabilityes$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        String str;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC9854bdT interfaceC9854bdT = (InterfaceC9854bdT) C43248rlh.KWHzl.AEQbTJ(InterfaceC9854bdT.class);
            InterfaceC9738bbJ interfaceC9738bbJ = this.$mainWallet;
            Intrinsics.copydefault(interfaceC9738bbJ);
            String strDbNXlk = interfaceC9738bbJ.DbNXlk();
            List<String> list = this.$chains;
            this.label = 1;
            obj = interfaceC9854bdT.KWHzl(strDbNXlk, list, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        String str2 = (String) obj;
        if (str2 != null && str2.length() != 0) {
            str = "window.okxwallet.sendResponse(" + this.$id + ", " + str2 + ")";
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
