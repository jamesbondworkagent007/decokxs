package com.okinc.business.defi.wallet.tee.activate.ui;

import android.content.Context;
import androidx.core.content.ContextCompat;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.CoroutineScope;
import o.C16485ekn;
import o.C33492mxV;
import o.C52761wXj;
import o.C56391yDq;
import o.C56442yFn;
import o.fST;
import o.xWJ;

/* JADX INFO: loaded from: classes5.dex */
public final class ActivateSAGuideBottomSheet$onCreateContent$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ C16485ekn $binding;
    Object L$0;
    int label;
    final /* synthetic */ fST this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActivateSAGuideBottomSheet$onCreateContent$1(fST fst, C16485ekn c16485ekn, Continuation<? super ActivateSAGuideBottomSheet$onCreateContent$1> continuation) {
        super(2, continuation);
        this.this$0 = fst;
        this.$binding = c16485ekn;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ActivateSAGuideBottomSheet$onCreateContent$1(this.this$0, this.$binding, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ActivateSAGuideBottomSheet$onCreateContent$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Context context;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            Context context2 = this.this$0.getContext();
            if (context2 == null) {
                return Unit.INSTANCE;
            }
            xWJ xwjValueOf = this.this$0.valueOf();
            this.L$0 = context2;
            this.label = 1;
            Object objAEQbTJ = xwjValueOf.AEQbTJ(this);
            if (objAEQbTJ == objCopydefault) {
                return objCopydefault;
            }
            context = context2;
            obj = objAEQbTJ;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            context = (Context) this.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        this.this$0.DbNXlk = StringsKt__StringsKt.contains$default((CharSequence) obj, (CharSequence) "中文", false, 2, (Object) null);
        this.this$0.AkhnZx = C33492mxV.OLrzqt();
        fST fst = this.this$0;
        fst.djBIcL = fst.EZpvd();
        this.$binding.KWHzl.setColors(ContextCompat.getColor(context, C52761wXj.Activity.QwvEab), ContextCompat.getColor(context, C52761wXj.Activity.DTeKQX));
        this.$binding.KWHzl.setCount(4);
        this.this$0.EZpvd(context, this.$binding);
        fST fst2 = this.this$0;
        fst2.KWHzl(fst2.AEQbTJ().AEQbTJ().getValue(), false);
        this.this$0.KWHzl(context, this.$binding);
        return Unit.INSTANCE;
    }
}
