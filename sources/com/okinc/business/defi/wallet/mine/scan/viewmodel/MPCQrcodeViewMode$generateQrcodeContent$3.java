package com.okinc.business.defi.wallet.mine.scan.viewmodel;

import com.google.gson.Gson;
import com.okinc.business.defi.wallet.mine.scan.bean.MpcQRCodeParseBean;
import com.okinc.wallet.core.keypair.KeyPair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C18856fqM;
import o.C56391yDq;
import o.C56442yFn;
import o.dZP;
import o.xXX;

/* JADX INFO: loaded from: classes18.dex */
public final class MPCQrcodeViewMode$generateQrcodeContent$3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super String>, Object> {
    int label;
    final /* synthetic */ C18856fqM this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MPCQrcodeViewMode$generateQrcodeContent$3(C18856fqM c18856fqM, Continuation<? super MPCQrcodeViewMode$generateQrcodeContent$3> continuation) {
        super(2, continuation);
        this.this$0 = c18856fqM;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MPCQrcodeViewMode$generateQrcodeContent$3(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super String> continuation) {
        return ((MPCQrcodeViewMode$generateQrcodeContent$3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        String pubKey;
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            String strEZpvd = dZP.OLrzqt.EZpvd();
            Gson gson = new Gson();
            KeyPair keyPairKWHzl = this.this$0.KWHzl();
            if (keyPairKWHzl == null || (pubKey = keyPairKWHzl.getPubKey()) == null) {
                pubKey = "";
            }
            return "okx_mpc:" + xXX.EZpvd.AEQbTJ(gson.toJson(new MpcQRCodeParseBean(pubKey, strEZpvd, System.currentTimeMillis())).toString(), strEZpvd);
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
