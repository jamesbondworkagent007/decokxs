package o;

import android.view.View;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.okinc.business.market.features.meme.protocol_filter.ui.ProtocolViewBinder$1;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import o.C52761wXj;
import o.InterfaceC28823khz;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.khx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C28821khx extends AbstractC25436iwg<InterfaceC28823khz.ActionBar, hCN> {
    public final Function1<java.lang.String, java.lang.Boolean> EZpvd;
    public final int KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Function1<java.lang.String, java.lang.Boolean> KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0007: CONSTRUCTOR 
  (r1v0 kotlin.jvm.functions.Function1)
  (wrap:int:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (8388611 int) : (r2v0 int))
 A[MD:(kotlin.jvm.functions.Function1<? super java.lang.String, java.lang.Boolean>, int):void (m)] (LINE:13) call: o.khx.<init>(kotlin.jvm.functions.Function1, int):void type: THIS */
    public /* synthetic */ C28821khx(Function1 function1, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(function1, (i2 & 2) != 0 ? 8388611 : i);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.String, java.lang.Boolean> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C28821khx(@NotNull Function1<? super java.lang.String, java.lang.Boolean> function1, int i) {
        super(ProtocolViewBinder$1.INSTANCE);
        Intrinsics.checkNotNullParameter(function1, "");
        this.EZpvd = function1;
        this.KWHzl = i;
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull C25435iwf<hCN> c25435iwf, @NotNull InterfaceC28823khz.ActionBar actionBar) {
        Intrinsics.checkNotNullParameter(c25435iwf, "");
        Intrinsics.checkNotNullParameter(actionBar, "");
        hCN hcn = (hCN) c25435iwf.EZpvd();
        hcn.KWHzl.setText(actionBar.copydefault());
        hcn.KWHzl.setGravity(this.KWHzl);
        android.widget.ImageView imageView = hcn.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        imageView.setVisibility(actionBar.KWHzl().length() > 0 ? 0 : 8);
        if (actionBar.KWHzl().length() > 0) {
            android.widget.ImageView imageView2 = hcn.OLrzqt;
            Intrinsics.checkNotNullExpressionValue(imageView2, "");
            C57659ymb.EZpvd(imageView2, actionBar.KWHzl(), C52761wXj.TaskDescription.dzCpvv);
        }
        int i = C23274hvD.ActionBar.AEQbTJ;
        android.content.Context context = hcn.getRoot().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        android.graphics.drawable.Drawable drawableEZpvd = C33070mpX.EZpvd(i, context);
        int i2 = C23274hvD.ActionBar.dxcTrN;
        android.content.Context context2 = hcn.getRoot().getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        android.graphics.drawable.Drawable drawableEZpvd2 = C33070mpX.EZpvd(i2, context2);
        hcn.EZpvd.setBackground(actionBar.EZpvd() ? drawableEZpvd : drawableEZpvd2);
        LinearLayoutCompat linearLayoutCompat = hcn.EZpvd;
        linearLayoutCompat.setOnClickListener(new StateListAnimator(linearLayoutCompat, 1000L, this, actionBar, hcn, drawableEZpvd, drawableEZpvd2));
    }

    /* JADX INFO: renamed from: o.khx$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ android.graphics.drawable.Drawable AEQbTJ;
        public final /* synthetic */ long AYXKKw;
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ android.graphics.drawable.Drawable KWHzl;
        public final /* synthetic */ InterfaceC28823khz.ActionBar OLrzqt;
        public final /* synthetic */ hCN copydefault;
        public final /* synthetic */ C28821khx gEmmrt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, C28821khx c28821khx, InterfaceC28823khz.ActionBar actionBar, hCN hcn, android.graphics.drawable.Drawable drawable, android.graphics.drawable.Drawable drawable2) {
            this.EZpvd = view;
            this.AYXKKw = j;
            this.gEmmrt = c28821khx;
            this.OLrzqt = actionBar;
            this.copydefault = hcn;
            this.KWHzl = drawable;
            this.AEQbTJ = drawable2;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.AYXKKw || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                this.copydefault.EZpvd.setBackground(this.gEmmrt.KWHzl().invoke(this.OLrzqt.OLrzqt()).booleanValue() ? this.KWHzl : this.AEQbTJ);
            }
        }
    }
}
