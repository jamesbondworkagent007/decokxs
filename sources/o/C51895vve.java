package o;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.unify_trade.biz.SignalProviderSignalBean;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C32113mPz;
import o.C52761wXj;
import o.C55688xof;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.vve, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C51895vve extends AbstractC59533zio<SignalProviderSignalBean, StateListAnimator> {
    public final Function1<SignalProviderSignalBean, Unit> KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C51895vve() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Function1<SignalProviderSignalBean, Unit> AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (wrap:kotlin.jvm.functions.Function1:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null kotlin.jvm.functions.Function1) : (r1v0 kotlin.jvm.functions.Function1))
 A[MD:(kotlin.jvm.functions.Function1<? super com.okinc.unify_trade.biz.SignalProviderSignalBean, kotlin.Unit>):void (m)] (LINE:21) call: o.vve.<init>(kotlin.jvm.functions.Function1):void type: THIS */
    public /* synthetic */ C51895vve(Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : function1);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.jvm.functions.Function1<? super com.okinc.unify_trade.biz.SignalProviderSignalBean, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public C51895vve(Function1<? super SignalProviderSignalBean, Unit> function1) {
        this.KWHzl = function1;
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public StateListAnimator onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        AbstractC48435uRh abstractC48435uRhOLrzqt = AbstractC48435uRh.OLrzqt(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(abstractC48435uRhOLrzqt, "");
        return new StateListAnimator(abstractC48435uRhOLrzqt);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0058  */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onBindViewHolder(@NotNull StateListAnimator stateListAnimator, @NotNull SignalProviderSignalBean signalProviderSignalBean) {
        Intrinsics.checkNotNullParameter(stateListAnimator, "");
        Intrinsics.checkNotNullParameter(signalProviderSignalBean, "");
        AbstractC48435uRh abstractC48435uRhKWHzl = stateListAnimator.KWHzl();
        abstractC48435uRhKWHzl.AhwBna.setText(signalProviderSignalBean.getSignalChanName());
        android.widget.TextView textView = abstractC48435uRhKWHzl.copydefault;
        java.lang.String signalDescription = signalProviderSignalBean.getSignalDescription();
        java.lang.String strAYXKKw = C33070mpX.AYXKKw(C55688xof.Application.newSessionWithExtras);
        if (signalDescription == null || signalDescription.length() == 0 || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) signalDescription)) {
            signalDescription = strAYXKKw;
        }
        textView.setText(signalDescription);
        java.lang.String approvalStatus = signalProviderSignalBean.getApprovalStatus();
        if (approvalStatus != null) {
            switch (approvalStatus.hashCode()) {
                case 3237136:
                    if (approvalStatus.equals("init")) {
                        android.widget.TextView textView2 = abstractC48435uRhKWHzl.KWHzl;
                        textView2.setText(C33070mpX.AYXKKw(C55688xof.Application.hrnhsO));
                        textView2.setTextColor(C33070mpX.copydefault(C32113mPz.ActionBar.zLjUOn));
                        C52794wYp c52794wYp = abstractC48435uRhKWHzl.OLrzqt;
                        c52794wYp.setEnabled(true);
                        c52794wYp.setText(C33070mpX.AYXKKw(C55688xof.Application.apLTlu));
                        Intrinsics.copydefault(c52794wYp);
                    }
                    break;
                case 14018990:
                    if (approvalStatus.equals("publish_rejected")) {
                        android.widget.TextView textView3 = abstractC48435uRhKWHzl.KWHzl;
                        textView3.setText(C33070mpX.AYXKKw(C55688xof.Application.invokespecialhrnhsO));
                        textView3.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.DPhTBN));
                        C52794wYp c52794wYp2 = abstractC48435uRhKWHzl.OLrzqt;
                        c52794wYp2.setEnabled(true);
                        c52794wYp2.setText(C33070mpX.AYXKKw(C55688xof.Application.zFZsbn));
                        Intrinsics.copydefault(c52794wYp2);
                    }
                    break;
                case 371871391:
                    if (approvalStatus.equals("under_review")) {
                        android.widget.TextView textView4 = abstractC48435uRhKWHzl.KWHzl;
                        textView4.setText(C33070mpX.AYXKKw(C55688xof.Application.QhsCdEQhsCdE));
                        textView4.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.iLAtSv));
                        C52794wYp c52794wYp3 = abstractC48435uRhKWHzl.OLrzqt;
                        c52794wYp3.setEnabled(false);
                        c52794wYp3.setText(C33070mpX.AYXKKw(C55688xof.Application.apLTlu));
                        Intrinsics.copydefault(c52794wYp3);
                    }
                    break;
                case 2135147264:
                    if (approvalStatus.equals("pending_review")) {
                    }
                    break;
            }
        }
        C52794wYp c52794wYp4 = abstractC48435uRhKWHzl.OLrzqt;
        c52794wYp4.setOnClickListener(new ActionBar(c52794wYp4, 1000L, this, signalProviderSignalBean));
    }

    /* JADX INFO: renamed from: o.vve$StateListAnimator */
    public static final class StateListAnimator extends RecyclerView.ViewHolder {
        public final AbstractC48435uRh KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final AbstractC48435uRh KWHzl() {
            return this.KWHzl;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StateListAnimator(@NotNull AbstractC48435uRh abstractC48435uRh) {
            super(abstractC48435uRh.getRoot());
            Intrinsics.checkNotNullParameter(abstractC48435uRh, "");
            this.KWHzl = abstractC48435uRh;
        }
    }

    /* JADX INFO: renamed from: o.vve$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ SignalProviderSignalBean KWHzl;
        public final /* synthetic */ C51895vve OLrzqt;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, C51895vve c51895vve, SignalProviderSignalBean signalProviderSignalBean) {
            this.copydefault = view;
            this.EZpvd = j;
            this.OLrzqt = c51895vve;
            this.KWHzl = signalProviderSignalBean;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.EZpvd || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                Function1<SignalProviderSignalBean, Unit> function1AEQbTJ = this.OLrzqt.AEQbTJ();
                if (function1AEQbTJ != null) {
                    function1AEQbTJ.invoke(this.KWHzl);
                }
            }
        }
    }
}
