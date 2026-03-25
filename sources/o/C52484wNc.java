package o;

import android.view.View;
import com.okinc.unify_trade.biz.CoinRatioParam;
import com.okinc.unify_trade.bot.data.TacticsCoinsInsideItemData;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wNc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C52484wNc extends AbstractC59533zio<TacticsCoinsInsideItemData, C52486wNe> {
    public final Function1<java.lang.String, Unit> KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Function1<java.lang.String, Unit> copydefault() {
        return this.KWHzl;
    }

    /* JADX INFO: renamed from: o.wNc$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ C52484wNc AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ android.view.View OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, C52484wNc c52484wNc) {
            this.OLrzqt = view;
            this.EZpvd = j;
            this.AEQbTJ = c52484wNc;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.EZpvd || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                Function1<java.lang.String, Unit> function1Copydefault = this.AEQbTJ.copydefault();
                if (function1Copydefault != null) {
                    function1Copydefault.invoke("coins");
                }
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public C52484wNc(Function1<? super java.lang.String, Unit> function1) {
        this.KWHzl = function1;
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public C52486wNe onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        android.view.View viewInflate = layoutInflater.inflate(C48033uCm.Activity.GiPPlLRPuVlr, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "");
        return new C52486wNe(viewInflate);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull C52486wNe c52486wNe, @NotNull TacticsCoinsInsideItemData tacticsCoinsInsideItemData) {
        C55312xha c55312xhaValueOf;
        C55320xhi c55320xhiKWHzl;
        C55312xha c55312xhaValueOf2;
        C55320xhi c55320xhiKWHzl2;
        C55320xhi c55320xhiKWHzl3;
        Intrinsics.checkNotNullParameter(c52486wNe, "");
        Intrinsics.checkNotNullParameter(tacticsCoinsInsideItemData, "");
        C55312xha c55312xhaValueOf3 = c52486wNe.KWHzl().valueOf();
        if (c55312xhaValueOf3 != null && (c55320xhiKWHzl3 = c55312xhaValueOf3.KWHzl()) != null) {
            c55320xhiKWHzl3.setText(tacticsCoinsInsideItemData.getTitle());
        }
        C51601vqB c51601vqBOLrzqt = c52486wNe.OLrzqt();
        java.util.List<CoinRatioParam> coins = tacticsCoinsInsideItemData.getCoins();
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(coins, 10));
        java.util.Iterator<T> it = coins.iterator();
        while (it.hasNext()) {
            arrayList.add(((CoinRatioParam) it.next()).getCcy());
        }
        C51601vqB.refreshCircleCoins$default(c51601vqBOLrzqt, arrayList, 2, 0, 4, null);
        android.view.View view = c52486wNe.itemView;
        view.setOnClickListener(new ActionBar(view, 1000L, this));
        if (C33129mqd.AhwBna(java.lang.Integer.valueOf(tacticsCoinsInsideItemData.getTitleStyle()), 0) && (c55312xhaValueOf2 = c52486wNe.KWHzl().valueOf()) != null && (c55320xhiKWHzl2 = c55312xhaValueOf2.KWHzl()) != null) {
            c55320xhiKWHzl2.setTextAppearance(tacticsCoinsInsideItemData.getTitleStyle());
        }
        if (!C33129mqd.AhwBna(java.lang.Integer.valueOf(tacticsCoinsInsideItemData.getTitleColor()), 0) || (c55312xhaValueOf = c52486wNe.KWHzl().valueOf()) == null || (c55320xhiKWHzl = c55312xhaValueOf.KWHzl()) == null) {
            return;
        }
        c55320xhiKWHzl.setTextColor(tacticsCoinsInsideItemData.getTitleColor());
    }
}
