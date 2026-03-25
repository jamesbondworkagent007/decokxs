package o;

import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import com.okinc.business.dexui.main.swap.widget.slippage.FixedItemBinder$1;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.iuG, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C25304iuG extends AbstractC25436iwg<C25302iuE, C21619hGb> {
    public final Function2<java.lang.Integer, C25302iuE, Unit> EZpvd;

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super o.iuE, kotlin.Unit> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C25304iuG(@NotNull Function2<? super java.lang.Integer, ? super C25302iuE, Unit> function2) {
        super(FixedItemBinder$1.INSTANCE);
        Intrinsics.checkNotNullParameter(function2, "");
        this.EZpvd = function2;
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull C25435iwf<C21619hGb> c25435iwf, @NotNull C25302iuE c25302iuE) {
        int color;
        Intrinsics.checkNotNullParameter(c25435iwf, "");
        Intrinsics.checkNotNullParameter(c25302iuE, "");
        C21619hGb c21619hGb = (C21619hGb) c25435iwf.EZpvd();
        c21619hGb.OLrzqt.setText(C23311hvo.formatPercent$default(c25302iuE.copydefault(), false, 0, 0, null, null, 31, null));
        c21619hGb.OLrzqt.setSelected(c25302iuE.EZpvd());
        AppCompatTextView appCompatTextView = c21619hGb.OLrzqt;
        if (c25302iuE.EZpvd()) {
            color = c21619hGb.getRoot().getContext().getColor(C52761wXj.Activity.fdOvFl);
        } else {
            color = c21619hGb.getRoot().getContext().getColor(C52761wXj.Activity.QwvEab);
        }
        appCompatTextView.setTextColor(color);
        AppCompatTextView appCompatTextView2 = c21619hGb.OLrzqt;
        appCompatTextView2.setOnClickListener(new StateListAnimator(appCompatTextView2, 1000L, this, c25435iwf, c25302iuE));
        if (getPosition(c25435iwf) == 2) {
            c21619hGb.OLrzqt.setContentDescription("web3_dex_slippage_fixed_chip_2");
        }
    }

    /* JADX INFO: renamed from: o.iuG$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ C25302iuE KWHzl;
        public final /* synthetic */ C25435iwf OLrzqt;
        public final /* synthetic */ C25304iuG copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, C25304iuG c25304iuG, C25435iwf c25435iwf, C25302iuE c25302iuE) {
            this.EZpvd = view;
            this.AEQbTJ = j;
            this.copydefault = c25304iuG;
            this.OLrzqt = c25435iwf;
            this.KWHzl = c25302iuE;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.AEQbTJ || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                this.copydefault.EZpvd.invoke(java.lang.Integer.valueOf(this.copydefault.getPosition(this.OLrzqt)), this.KWHzl);
            }
        }
    }
}
