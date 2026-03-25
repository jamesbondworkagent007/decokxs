package o;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.business.trade.features.home.domain.model.TradingType;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import o.C57406yhn;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.hdi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C22351hdi extends AbstractC59533zio<C22353hdk, StateListAnimator> {
    public TradingType EZpvd;
    public final Function1<C22353hdk, Unit> KWHzl;

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super o.hdk, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public C22351hdi(@NotNull TradingType tradingType, @NotNull Function1<? super C22353hdk, Unit> function1) {
        Intrinsics.checkNotNullParameter(tradingType, "");
        Intrinsics.checkNotNullParameter(function1, "");
        this.EZpvd = tradingType;
        this.KWHzl = function1;
    }

    /* JADX INFO: renamed from: o.hdi$StateListAnimator */
    public static final class StateListAnimator extends RecyclerView.ViewHolder {
        public final C21551hDo EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C21551hDo copydefault() {
            return this.EZpvd;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StateListAnimator(@NotNull C21551hDo c21551hDo) {
            super(c21551hDo.getRoot());
            Intrinsics.checkNotNullParameter(c21551hDo, "");
            this.EZpvd = c21551hDo;
        }
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public StateListAnimator onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        C21551hDo c21551hDoEZpvd = C21551hDo.EZpvd(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c21551hDoEZpvd, "");
        return new StateListAnimator(c21551hDoEZpvd);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull StateListAnimator stateListAnimator, @NotNull C22353hdk c22353hdk) {
        Intrinsics.checkNotNullParameter(stateListAnimator, "");
        Intrinsics.checkNotNullParameter(c22353hdk, "");
        boolean z = c22353hdk.KWHzl() == this.EZpvd;
        C21551hDo c21551hDoCopydefault = stateListAnimator.copydefault();
        c21551hDoCopydefault.EZpvd.setImageResource(c22353hdk.KWHzl().getTradingModeProvider().KWHzl());
        c21551hDoCopydefault.getRoot().setTag(c22353hdk);
        c21551hDoCopydefault.AEQbTJ.setText(c22353hdk.KWHzl().getTradingModeProvider().EZpvd());
        AppCompatImageView appCompatImageView = c21551hDoCopydefault.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(appCompatImageView, "");
        appCompatImageView.setVisibility(z ? 0 : 8);
        if (z) {
            c21551hDoCopydefault.getRoot().setBackgroundResource(C33492mxV.OLrzqt() ? C57406yhn.Activity.DbNXlk : C57406yhn.Activity.AkhnZx);
        } else {
            c21551hDoCopydefault.getRoot().setBackground(null);
        }
        if (c22353hdk.EZpvd()) {
            c21551hDoCopydefault.EZpvd.setImageTintList(android.content.res.ColorStateList.valueOf(C25382ivf.KWHzl(C52761wXj.Activity.fdOvFl)));
            c21551hDoCopydefault.AEQbTJ.setTextColor(C25382ivf.KWHzl(C52761wXj.Activity.fdOvFl));
        } else {
            c21551hDoCopydefault.EZpvd.setImageTintList(android.content.res.ColorStateList.valueOf(C25382ivf.KWHzl(C52761wXj.Activity.UlJrfe)));
            c21551hDoCopydefault.AEQbTJ.setTextColor(C25382ivf.KWHzl(C52761wXj.Activity.UlJrfe));
        }
        LinearLayoutCompat root = c21551hDoCopydefault.getRoot();
        root.setOnClickListener(new Application(root, 1000L, this));
        c21551hDoCopydefault.getRoot().setContentDescription(c22353hdk.KWHzl().getAccessibilityId());
    }

    /* JADX INFO: renamed from: o.hdi$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ C22351hdi copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, C22351hdi c22351hdi) {
            this.AEQbTJ = view;
            this.OLrzqt = j;
            this.copydefault = c22351hdi;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.OLrzqt || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                java.lang.Object tag = ((LinearLayoutCompat) this.AEQbTJ).getTag();
                C22353hdk c22353hdk = tag instanceof C22353hdk ? (C22353hdk) tag : null;
                if (c22353hdk != null) {
                    this.copydefault.EZpvd = c22353hdk.KWHzl();
                    this.copydefault.KWHzl.invoke(c22353hdk);
                }
            }
        }
    }
}
