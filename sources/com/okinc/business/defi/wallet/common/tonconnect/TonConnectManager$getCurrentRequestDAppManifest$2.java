package com.okinc.business.defi.wallet.common.tonconnect;

import com.okinc.business.defi.wallet.common.tonconnect.model.DAppManifest;
import com.okinc.business.defi.wallet.common.tonconnect.model.request.DAppInitialRequest;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C16058eck;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes4.dex */
public final class TonConnectManager$getCurrentRequestDAppManifest$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends DAppManifest>>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C16058eck this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TonConnectManager$getCurrentRequestDAppManifest$2(C16058eck c16058eck, Continuation<? super TonConnectManager$getCurrentRequestDAppManifest$2> continuation) {
        super(2, continuation);
        this.this$0 = c16058eck;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        TonConnectManager$getCurrentRequestDAppManifest$2 tonConnectManager$getCurrentRequestDAppManifest$2 = new TonConnectManager$getCurrentRequestDAppManifest$2(this.this$0, continuation);
        tonConnectManager$getCurrentRequestDAppManifest$2.L$0 = obj;
        return tonConnectManager$getCurrentRequestDAppManifest$2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends DAppManifest>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super Result<DAppManifest>>) continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super Result<DAppManifest>> continuation) {
        return ((TonConnectManager$getCurrentRequestDAppManifest$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        DAppInitialRequest.ConnectRequest connectRequestOLrzqt;
        String manifestUrl;
        DAppManifest dAppManifest;
        Object objOLrzqt;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
        } catch (Throwable th) {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C16058eck c16058eck = this.this$0;
            Result.Application application2 = Result.Companion;
            c16058eck.djBIcL();
            DAppInitialRequest dAppInitialRequest = c16058eck.AEQbTJ;
            if (dAppInitialRequest != null && (connectRequestOLrzqt = dAppInitialRequest.OLrzqt()) != null && (manifestUrl = connectRequestOLrzqt.getManifestUrl()) != null) {
                dAppManifest = c16058eck.fARcdN.KWHzl().get(manifestUrl);
                if (dAppManifest == null) {
                    this.label = 1;
                    objOLrzqt = c16058eck.OLrzqt(manifestUrl, this);
                    if (objOLrzqt == objCopydefault) {
                        return objCopydefault;
                    }
                }
                objM7377constructorimpl = Result.m7377constructorimpl(dAppManifest);
                return Result.m7376boximpl(objM7377constructorimpl);
            }
            throw new Exception("No request found");
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C56391yDq.AEQbTJ(obj);
        objOLrzqt = ((Result) obj).m7386unboximpl();
        C56391yDq.AEQbTJ(objOLrzqt);
        dAppManifest = (DAppManifest) objOLrzqt;
        objM7377constructorimpl = Result.m7377constructorimpl(dAppManifest);
        return Result.m7376boximpl(objM7377constructorimpl);
    }
}
