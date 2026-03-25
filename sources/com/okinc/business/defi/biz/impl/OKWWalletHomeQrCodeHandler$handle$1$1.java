package com.okinc.business.defi.biz.impl;

import com.okinc.business.defi.wallet.home.WcConnectExtra;
import com.okinc.core.util.ScannerActivity;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C11694cXt;
import o.C15733eTg;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes4.dex */
public final class OKWWalletHomeQrCodeHandler$handle$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ ScannerActivity $activity;
    final /* synthetic */ String $qrCode;
    int label;
    final /* synthetic */ C11694cXt this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OKWWalletHomeQrCodeHandler$handle$1$1(C11694cXt c11694cXt, ScannerActivity scannerActivity, String str, Continuation<? super OKWWalletHomeQrCodeHandler$handle$1$1> continuation) {
        super(2, continuation);
        this.this$0 = c11694cXt;
        this.$activity = scannerActivity;
        this.$qrCode = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OKWWalletHomeQrCodeHandler$handle$1$1(this.this$0, this.$activity, this.$qrCode, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((OKWWalletHomeQrCodeHandler$handle$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C15733eTg c15733eTg = this.this$0.copydefault;
            ScannerActivity scannerActivity = this.$activity;
            String str = this.$qrCode;
            this.label = 1;
            if (c15733eTg.EZpvd(scannerActivity, str, (WcConnectExtra) null, this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return Unit.INSTANCE;
    }
}
