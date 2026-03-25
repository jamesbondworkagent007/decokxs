package o;

import android.view.View;
import com.okinc.unify_trade.bot.data.RecommendCardData;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import org.jetbrains.annotations.NotNull;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: renamed from: o.wfQ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C53114wfQ extends AbstractC59533zio<RecommendCardData, C53120wfW> {
    public final Function1<java.lang.Integer, Unit> AEQbTJ;
    public final Function1<java.lang.Integer, Unit> KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Function1<java.lang.Integer, Unit> AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Function1<java.lang.Integer, Unit> KWHzl() {
        return this.KWHzl;
    }

    /* JADX INFO: renamed from: o.wfQ$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ C53114wfQ OLrzqt;
        public final /* synthetic */ C53120wfW copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, C53114wfQ c53114wfQ, C53120wfW c53120wfW) {
            this.AEQbTJ = view;
            this.KWHzl = j;
            this.OLrzqt = c53114wfQ;
            this.copydefault = c53120wfW;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.KWHzl || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                this.OLrzqt.AEQbTJ().invoke(java.lang.Integer.valueOf(this.copydefault.getBindingAdapterPosition()));
            }
        }
    }

    /* JADX INFO: renamed from: o.wfQ$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ C53120wfW EZpvd;
        public final /* synthetic */ C53114wfQ OLrzqt;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, C53114wfQ c53114wfQ, C53120wfW c53120wfW) {
            this.copydefault = view;
            this.AEQbTJ = j;
            this.OLrzqt = c53114wfQ;
            this.EZpvd = c53120wfW;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.AEQbTJ || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                this.OLrzqt.KWHzl().invoke(java.lang.Integer.valueOf(this.EZpvd.getBindingAdapterPosition()));
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public C53114wfQ(@NotNull Function1<? super java.lang.Integer, Unit> function1, @NotNull Function1<? super java.lang.Integer, Unit> function12) {
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function12, "");
        this.AEQbTJ = function1;
        this.KWHzl = function12;
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public C53120wfW onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        android.view.View viewInflate = layoutInflater.inflate(C48033uCm.Activity.isInitInProgress, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "");
        return new C53120wfW(viewInflate);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull C53120wfW c53120wfW, @NotNull RecommendCardData recommendCardData) {
        Intrinsics.checkNotNullParameter(c53120wfW, "");
        Intrinsics.checkNotNullParameter(recommendCardData, "");
        c53120wfW.valueOf().setText(recommendCardData.getTitle());
        c53120wfW.AhwBna().setVisibility(C33129mqd.OLrzqt((java.lang.CharSequence) recommendCardData.getTag()) ? 0 : 8);
        c53120wfW.AhwBna().setText(recommendCardData.getTag());
        c53120wfW.KWHzl().setVisibility(C33129mqd.OLrzqt((java.lang.CharSequence) recommendCardData.getLabel1()) ? 0 : 8);
        c53120wfW.KWHzl().setText(recommendCardData.getLabel1());
        c53120wfW.OLrzqt().setVisibility(C33129mqd.OLrzqt((java.lang.CharSequence) recommendCardData.getLabel2()) ? 0 : 8);
        c53120wfW.OLrzqt().setText(recommendCardData.getLabel2());
        c53120wfW.EZpvd().setTextColor(android.content.res.ColorStateList.valueOf(C33129mqd.AhwBna(recommendCardData.getBenefitColor())));
        c53120wfW.EZpvd().setText(recommendCardData.getBenefit());
        c53120wfW.AEQbTJ().copydefault(recommendCardData.getDistributeList());
        c53120wfW.djBIcL().setText(recommendCardData.getUserCount());
        c53120wfW.copydefault().setText(recommendCardData.getSummary());
        C52794wYp c52794wYpAYXKKw = c53120wfW.AYXKKw();
        c52794wYpAYXKKw.setOnClickListener(new Application(c52794wYpAYXKKw, 1000L, this, c53120wfW));
        android.view.View view = c53120wfW.itemView;
        view.setOnClickListener(new ActionBar(view, 1000L, this, c53120wfW));
        c53120wfW.valueOf().setMaxWidth(c53120wfW.AhwBna().getVisibility() == 0 ? C55298xhM.dpInt$default(CipherSuite.TLS_DH_RSA_WITH_AES_128_GCM_SHA256, (android.content.Context) null, 1, (java.lang.Object) null) : Integer.MAX_VALUE);
    }
}
