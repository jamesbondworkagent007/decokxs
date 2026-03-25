package com.okinc.ok_kyc_core.extension;

import android.graphics.drawable.Drawable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC43764rvT;
import o.C43251rlk;
import o.C55326xho;
import o.C56391yDq;
import o.C56442yFn;
import o.pUU;
import o.rBZ;
import o.rTU;

/* JADX INFO: loaded from: classes16.dex */
public final class OKPdfTestActivity$initListener$1$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ AbstractC43764rvT $this_apply;
    int label;
    final /* synthetic */ rBZ this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OKPdfTestActivity$initListener$1$2$1(AbstractC43764rvT abstractC43764rvT, rBZ rbz, Continuation<? super OKPdfTestActivity$initListener$1$2$1> continuation) {
        super(2, continuation);
        this.$this_apply = abstractC43764rvT;
        this.this$0 = rbz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OKPdfTestActivity$initListener$1$2$1(this.$this_apply, this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((OKPdfTestActivity$initListener$1$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            String strValueOf = String.valueOf(this.$this_apply.EZpvd.getText());
            String strValueOf2 = String.valueOf(this.$this_apply.AEQbTJ.getText());
            pUU.KWHzl(this.this$0.getTAG(), "filesDir = " + this.this$0.getApplicationContext().getFilesDir());
            rTU rtu = (rTU) C43251rlk.copydefault(rTU.class);
            rBZ rbz = this.this$0;
            this.label = 1;
            obj = rtu.AEQbTJ(rbz, strValueOf, "/storage/emulated/0/Android/data/com.okx.tr/files/pdf_test/output/test.pdf", strValueOf2, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        C55326xho.toast$default("是否解密成功 " + ((Boolean) obj), (Drawable) null, 0, (Integer) null, 0, 0, 31, (Object) null);
        return Unit.INSTANCE;
    }
}
