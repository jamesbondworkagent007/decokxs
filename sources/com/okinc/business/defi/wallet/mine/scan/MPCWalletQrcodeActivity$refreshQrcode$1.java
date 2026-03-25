package com.okinc.business.defi.wallet.mine.scan;

import android.app.Activity;
import android.graphics.Bitmap;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC16344eiE;
import o.ActivityC18845fqB;
import o.C18856fqM;
import o.C56391yDq;
import o.C56442yFn;
import o.C6999aZv;
import o.rVN;

/* JADX INFO: loaded from: classes15.dex */
public final class MPCWalletQrcodeActivity$refreshQrcode$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ ActivityC18845fqB this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MPCWalletQrcodeActivity$refreshQrcode$1(ActivityC18845fqB activityC18845fqB, Continuation<? super MPCWalletQrcodeActivity$refreshQrcode$1> continuation) {
        super(2, continuation);
        this.this$0 = activityC18845fqB;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MPCWalletQrcodeActivity$refreshQrcode$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MPCWalletQrcodeActivity$refreshQrcode$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objKWHzl;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C18856fqM c18856fqMEZpvd = this.this$0.EZpvd();
            this.label = 1;
            objKWHzl = c18856fqMEZpvd.KWHzl(this);
            if (objKWHzl == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            objKWHzl = obj;
        }
        Bitmap bitmapAEQbTJ = C6999aZv.AEQbTJ((String) objKWHzl, this.this$0.copydefault, this.this$0.copydefault, (1948 & 4) != 0 ? -16777216 : 0, (1948 & 8) != 0 ? -1 : 0, (1948 & 16) != 0 ? 0 : 0, (1948 & 32) != 0 ? 0 : 2, (1948 & 64) != 0 ? 0 : 1, (1948 & 128) != 0 ? 1.0f : 0.0f, (1948 & 256) != 0 ? 1.0f : 0.0f, (1948 & 512) != 0 ? Bitmap.Config.RGB_565 : null, (1948 & 1024) != 0 ? 0.0f : 0.0f, (1948 & 2048) != 0 ? ErrorCorrectionLevel.H : ErrorCorrectionLevel.L);
        AbstractC16344eiE abstractC16344eiE = this.this$0.EZpvd;
        if (abstractC16344eiE == null) {
            Intrinsics.gEmmrt("");
            abstractC16344eiE = null;
        }
        abstractC16344eiE.KWHzl.setImageBitmap(bitmapAEQbTJ);
        rVN.reportFullyDrawn$default((Activity) this.this$0, true, (String) null, 2, (Object) null);
        this.this$0.OLrzqt.sendEmptyMessageDelayed(this.this$0.gEmmrt, 300000L);
        this.this$0.AEQbTJ();
        return Unit.INSTANCE;
    }
}
