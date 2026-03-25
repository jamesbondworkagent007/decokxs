package com.okinc.tradingbot.impl.strategy.view;

import android.view.View;
import android.widget.Checkable;
import android.widget.TextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.okinc.tradingbot.impl.dto.EstFeeVO;
import com.okinc.tradingbot.impl.dto.EstReduceInfo;
import com.okinc.tradingbot.impl.dto.EstReducePosVO;
import com.okinc.tradingbot.impl.dto.EstReturnVO;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C33129mqd;
import o.C55296xhK;
import o.C55326xho;
import o.C56033xvF;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.uST;
import o.vNB;
import o.wQD;

/* JADX INFO: loaded from: classes11.dex */
public final class SmartArbReducePosBottomSheet$onCreateContent$1$4 extends SuspendLambda implements Function2<vNB<? extends EstReduceInfo>, Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $isStaking;
    final /* synthetic */ uST $this_apply;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ wQD this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SmartArbReducePosBottomSheet$onCreateContent$1$4(uST ust, wQD wqd, boolean z, Continuation<? super SmartArbReducePosBottomSheet$onCreateContent$1$4> continuation) {
        super(2, continuation);
        this.$this_apply = ust;
        this.this$0 = wqd;
        this.$isStaking = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        SmartArbReducePosBottomSheet$onCreateContent$1$4 smartArbReducePosBottomSheet$onCreateContent$1$4 = new SmartArbReducePosBottomSheet$onCreateContent$1$4(this.$this_apply, this.this$0, this.$isStaking, continuation);
        smartArbReducePosBottomSheet$onCreateContent$1$4.L$0 = obj;
        return smartArbReducePosBottomSheet$onCreateContent$1$4;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(vNB<? extends EstReduceInfo> vnb, Continuation<? super Unit> continuation) {
        return invoke2((vNB<EstReduceInfo>) vnb, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(vNB<EstReduceInfo> vnb, Continuation<? super Unit> continuation) {
        return ((SmartArbReducePosBottomSheet$onCreateContent$1$4) create(vnb, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            vNB vnb = (vNB) this.L$0;
            if (vnb instanceof vNB.StateListAnimator) {
                String message = ((vNB.StateListAnimator) vnb).AEQbTJ().getMessage();
                C55326xho.toastWithFailedIcon$default(message != null ? message : "", 0, 1, (Object) null);
                return Unit.INSTANCE;
            }
            if (!(vnb instanceof vNB.TaskDescription)) {
                return Unit.INSTANCE;
            }
            EstReduceInfo estReduceInfo = (EstReduceInfo) ((vNB.TaskDescription) vnb).AEQbTJ();
            this.$this_apply.KWHzl.setText(C56033xvF.copydefault(estReduceInfo.OLrzqt()));
            TextView textView = this.$this_apply.djBIcL;
            Intrinsics.checkNotNullExpressionValue(textView, "");
            textView.setVisibility(estReduceInfo.copydefault() ? 0 : 8);
            EstReturnVO estReturnVOAEQbTJ = estReduceInfo.AEQbTJ();
            uST ust = this.$this_apply;
            TextView textView2 = ust.valueOf;
            wQD wqd = this.this$0;
            textView2.setText(wqd.AEQbTJ(estReturnVOAEQbTJ.OLrzqt()));
            Intrinsics.copydefault(ust);
            wqd.OLrzqt(ust);
            textView2.setOnClickListener(new Application(textView2, 1000L, ust, wqd));
            this.$this_apply.values.setText(this.this$0.AEQbTJ(estReturnVOAEQbTJ.EZpvd()));
            this.$this_apply.DbNXlk.setText(this.this$0.AEQbTJ(estReturnVOAEQbTJ.copydefault()));
            EstFeeVO estFeeVOKWHzl = estReturnVOAEQbTJ.KWHzl();
            this.$this_apply.AuCTel.setText(this.this$0.AEQbTJ(estFeeVOKWHzl.EZpvd()));
            this.$this_apply.fARcdN.setText(this.this$0.AEQbTJ(estFeeVOKWHzl.KWHzl()));
            this.$this_apply.uzCIH.setText(this.this$0.AEQbTJ(estFeeVOKWHzl.copydefault()));
            EstReducePosVO estReducePosVOEZpvd = estReduceInfo.EZpvd();
            String strEZpvd = estReducePosVOEZpvd.EZpvd();
            String strCopydefault = this.this$0.copydefault(estReducePosVOEZpvd.OLrzqt(), strEZpvd, this.$isStaking);
            LinearLayoutCompat linearLayoutCompat = this.$this_apply.copydefault;
            Intrinsics.checkNotNullExpressionValue(linearLayoutCompat, "");
            linearLayoutCompat.setVisibility(true ^ StringsKt__StringsKt.fARcdN((CharSequence) strCopydefault) ? 0 : 8);
            this.$this_apply.EZpvd.setText(strCopydefault);
            LinearLayoutCompat linearLayoutCompat2 = this.$this_apply.isConnected;
            Intrinsics.checkNotNullExpressionValue(linearLayoutCompat2, "");
            LinearLayoutCompat linearLayoutCompat3 = this.$this_apply.copydefault;
            Intrinsics.checkNotNullExpressionValue(linearLayoutCompat3, "");
            linearLayoutCompat2.setVisibility((linearLayoutCompat3.getVisibility() == 0 && this.$isStaking && C33129mqd.AEQbTJ(strEZpvd, C56443yFo.AEQbTJ(0))) ? 0 : 8);
            this.$this_apply.AkhnZx.setText(this.this$0.KWHzl(estReducePosVOEZpvd.AEQbTJ()));
            this.$this_apply.OLrzqt.setText(wQD.formatBasePrice$default(this.this$0, estReducePosVOEZpvd.copydefault(), false, false, 6, null));
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ uST AEQbTJ;
        public final /* synthetic */ wQD EZpvd;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(View view, long j, uST ust, wQD wqd) {
            this.copydefault = view;
            this.OLrzqt = j;
            this.AEQbTJ = ust;
            this.EZpvd = wqd;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.OLrzqt || (this.copydefault instanceof Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                LinearLayoutCompat linearLayoutCompat = this.AEQbTJ.AYXKKw;
                Intrinsics.checkNotNullExpressionValue(linearLayoutCompat, "");
                LinearLayoutCompat linearLayoutCompat2 = this.AEQbTJ.AYXKKw;
                Intrinsics.checkNotNullExpressionValue(linearLayoutCompat2, "");
                linearLayoutCompat.setVisibility((linearLayoutCompat2.getVisibility() == 0) ^ true ? 0 : 8);
                wQD wqd = this.EZpvd;
                Intrinsics.copydefault(this.AEQbTJ);
                wqd.OLrzqt(this.AEQbTJ);
            }
        }
    }
}
