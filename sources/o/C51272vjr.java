package o;

import android.view.View;
import com.okinc.tradingbot.impl.market_place.bot_copy.itembinder.CoinTipsData;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C48033uCm;
import o.C52761wXj;
import o.C55688xof;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.vjr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C51272vjr extends AbstractC59533zio<CoinTipsData, C51271vjq> {
    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public C51271vjq onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        android.view.View viewInflate = layoutInflater.inflate(C48033uCm.Activity.RZNAhV, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "");
        return new C51271vjq(viewInflate);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull C51271vjq c51271vjq, @NotNull CoinTipsData coinTipsData) {
        Intrinsics.checkNotNullParameter(c51271vjq, "");
        Intrinsics.checkNotNullParameter(coinTipsData, "");
        c51271vjq.EZpvd().setText(coinTipsData.EZpvd());
        c51271vjq.copydefault().setText(coinTipsData.OLrzqt());
        java.lang.String strOLrzqt = coinTipsData.OLrzqt();
        if (strOLrzqt == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strOLrzqt)) {
            c51271vjq.copydefault().setVisibility(8);
            c51271vjq.KWHzl().setVisibility(8);
        } else {
            c51271vjq.KWHzl().setVisibility(0);
            c51271vjq.KWHzl().setText(copydefault(coinTipsData.KWHzl()));
            if (coinTipsData.KWHzl()) {
                c51271vjq.copydefault().setVisibility(0);
                c51271vjq.EZpvd().setMaxLines(Integer.MAX_VALUE);
                c51271vjq.EZpvd().setTextColor(C33070mpX.copydefault(C52761wXj.Activity.DeEinT));
                c51271vjq.copydefault().setTextColor(C33070mpX.copydefault(C52761wXj.Activity.DeEinT));
            } else {
                c51271vjq.copydefault().setVisibility(8);
                c51271vjq.EZpvd().setMaxLines(2);
                c51271vjq.EZpvd().setTextColor(C33070mpX.copydefault(C52761wXj.Activity.aappFQ));
                c51271vjq.copydefault().setTextColor(C33070mpX.copydefault(C52761wXj.Activity.aappFQ));
            }
            android.widget.TextView textViewKWHzl = c51271vjq.KWHzl();
            textViewKWHzl.setOnClickListener(new ActionBar(textViewKWHzl, 1000L, c51271vjq, this));
        }
        C55296xhK.margin$default(c51271vjq.AEQbTJ(), null, java.lang.Float.valueOf(coinTipsData.AEQbTJ()), null, null, 13, null);
    }

    public final java.lang.String copydefault(boolean z) {
        if (z) {
            return C33070mpX.AYXKKw(C55688xof.Application.getNavigationItemCount);
        }
        return C33070mpX.AYXKKw(C55688xof.Application.getDisplayOptions);
    }

    /* JADX INFO: renamed from: o.vjr$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ C51271vjq KWHzl;
        public final /* synthetic */ C51272vjr OLrzqt;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, C51271vjq c51271vjq, C51272vjr c51272vjr) {
            this.copydefault = view;
            this.AEQbTJ = j;
            this.KWHzl = c51271vjq;
            this.OLrzqt = c51272vjr;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.AEQbTJ || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                boolean z = !(this.KWHzl.copydefault().getVisibility() == 0);
                this.KWHzl.copydefault().setVisibility(z ? 0 : 8);
                this.KWHzl.EZpvd().setMaxLines(z ? Integer.MAX_VALUE : 2);
                this.KWHzl.KWHzl().setText(this.OLrzqt.copydefault(z));
            }
        }
    }
}
