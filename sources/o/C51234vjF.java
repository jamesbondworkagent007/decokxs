package o;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.tradingbot.impl.market_place.bot_copy.itembinder.BotParamMultiContentData;
import com.okinc.tradingbot.impl.market_place.bot_copy.itembinder.PriceRangeInfo;
import com.okinc.tradingbot.impl.order.strategy.smartportfolio.itembinder.SmartCoinsData;
import com.okinc.unify_trade.biz.AutoVipProfitInfo;
import com.okinc.unify_trade.biz.BotParamTickerData;
import com.okinc.unify_trade.bot.data.BotParamColorItemData;
import com.okinc.unify_trade.bot.data.BotParamItemData;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.vjF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C51234vjF extends AbstractC59533zio<C51237vjI, C51238vjJ> {
    public final C43316rmw AEQbTJ;
    public int KWHzl;
    public final Function0<Unit> OLrzqt;

    public C51234vjF(@NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        this.OLrzqt = function0;
        this.AEQbTJ = new C43316rmw();
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public C51238vjJ onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        android.view.View viewInflate = layoutInflater.inflate(C48033uCm.Activity.RzdrRQ, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "");
        return new C51238vjJ(viewInflate);
    }

    public final void KWHzl(int i, RecyclerView recyclerView) {
        int itemCount;
        if (this.KWHzl != 0 || (itemCount = this.AEQbTJ.getItemCount()) < 0) {
            return;
        }
        int i2 = 0;
        while (true) {
            if (i2 < i) {
                android.view.View childAt = recyclerView.getChildAt(i2);
                this.KWHzl += (childAt != null ? childAt.getMeasuredHeight() : 0) + C55298xhM.dp2px$default(12.0f, null, 1, null);
            }
            if (i2 == itemCount) {
                return;
            } else {
                i2++;
            }
        }
    }

    public final void copydefault(RecyclerView recyclerView, int i) {
        ViewGroup.LayoutParams layoutParams = recyclerView.getLayoutParams();
        Intrinsics.copydefault(layoutParams, "");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.height = i;
        recyclerView.setLayoutParams(marginLayoutParams);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull final C51238vjJ c51238vjJ, @NotNull final C51237vjI c51237vjI) {
        Intrinsics.checkNotNullParameter(c51238vjJ, "");
        Intrinsics.checkNotNullParameter(c51237vjI, "");
        c51238vjJ.copydefault().setLayoutManager(new LinearLayoutManager(c51238vjJ.itemView.getContext()));
        c51238vjJ.copydefault().setAdapter(this.AEQbTJ);
        byte b = 0;
        byte b2 = 0;
        if (c51238vjJ.copydefault().getItemDecorationCount() == 0) {
            c51238vjJ.copydefault().addItemDecoration(new C31703mAu(C55298xhM.dp2px$default(12.0f, null, 1, null), 0));
        }
        this.AEQbTJ.register(AutoVipProfitInfo.class, new C54145wyo(0, false, 3, null));
        this.AEQbTJ.register(BotParamColorItemData.class, new C51261vjg());
        this.AEQbTJ.register(BotParamItemData.class, new C51263vji());
        this.AEQbTJ.register(C55848xrg.class, new C51233vjE());
        this.AEQbTJ.register(BotParamTickerData.class, new C51269vjo(b2 == true ? 1 : 0, i, b == true ? 1 : 0));
        this.AEQbTJ.register(BotParamMultiContentData.class, new C51268vjn());
        this.AEQbTJ.register(SmartCoinsData.class, new C53186wgj());
        this.AEQbTJ.register(PriceRangeInfo.class, new C51240vjL());
        c51238vjJ.AEQbTJ().setVisibility(c51237vjI.KWHzl() ^ true ? 0 : 8);
        android.widget.TextView textViewAEQbTJ = c51238vjJ.AEQbTJ();
        textViewAEQbTJ.setOnClickListener(new TaskDescription(textViewAEQbTJ, 1000L, this));
        int size = c51237vjI.AEQbTJ().size();
        C51277vjw c51277vjwCopydefault = c51237vjI.copydefault();
        i = size <= (c51277vjwCopydefault != null ? c51277vjwCopydefault.copydefault() : 0) ? 0 : 1;
        android.widget.ImageView imageViewEZpvd = c51238vjJ.EZpvd();
        C51277vjw c51277vjwCopydefault2 = c51237vjI.copydefault();
        imageViewEZpvd.setVisibility(((c51277vjwCopydefault2 != null ? c51277vjwCopydefault2.OLrzqt() : null) == null || i == 0) ? 8 : 0);
        c51238vjJ.EZpvd().setOnClickListener(new View.OnClickListener() { // from class: o.vjG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C51234vjF.copydefault(this.EZpvd, c51237vjI, c51238vjJ, view);
            }
        });
        C33064mpR.OLrzqt(this.AEQbTJ, (java.util.List<? extends java.lang.Object>) c51237vjI.AEQbTJ());
        c51238vjJ.copydefault().post(new java.lang.Runnable() { // from class: o.vjH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C51234vjF.OLrzqt(c51238vjJ, c51237vjI, this);
            }
        });
    }

    public static final void copydefault(C51234vjF c51234vjF, C51237vjI c51237vjI, C51238vjJ c51238vjJ, android.view.View view) {
        java.lang.Boolean boolOLrzqt;
        C51277vjw c51277vjwCopydefault = c51237vjI.copydefault();
        Intrinsics.copydefault(c51277vjwCopydefault);
        c51234vjF.KWHzl(c51277vjwCopydefault.copydefault(), c51238vjJ.copydefault());
        RecyclerView recyclerViewCopydefault = c51238vjJ.copydefault();
        C51277vjw c51277vjwCopydefault2 = c51237vjI.copydefault();
        c51234vjF.copydefault(recyclerViewCopydefault, (c51277vjwCopydefault2 == null || !Intrinsics.EZpvd(c51277vjwCopydefault2.OLrzqt(), java.lang.Boolean.TRUE)) ? c51234vjF.KWHzl : -2);
        C51277vjw c51277vjwCopydefault3 = c51237vjI.copydefault();
        if (c51277vjwCopydefault3 != null) {
            C51277vjw c51277vjwCopydefault4 = c51237vjI.copydefault();
            c51277vjwCopydefault3.copydefault((c51277vjwCopydefault4 == null || (boolOLrzqt = c51277vjwCopydefault4.OLrzqt()) == null) ? null : java.lang.Boolean.valueOf(!boolOLrzqt.booleanValue()));
        }
        android.widget.ImageView imageViewEZpvd = c51238vjJ.EZpvd();
        C51277vjw c51277vjwCopydefault5 = c51237vjI.copydefault();
        imageViewEZpvd.setSelected(c51277vjwCopydefault5 != null ? Intrinsics.EZpvd(c51277vjwCopydefault5.OLrzqt(), java.lang.Boolean.TRUE) : false);
        if (c51237vjI.KWHzl()) {
            return;
        }
        android.widget.TextView textViewAEQbTJ = c51238vjJ.AEQbTJ();
        C51277vjw c51277vjwCopydefault6 = c51237vjI.copydefault();
        textViewAEQbTJ.setVisibility((c51277vjwCopydefault6 == null || !Intrinsics.EZpvd(c51277vjwCopydefault6.OLrzqt(), java.lang.Boolean.FALSE)) ? 8 : 0);
    }

    public static final void OLrzqt(C51238vjJ c51238vjJ, C51237vjI c51237vjI, C51234vjF c51234vjF) {
        if (c51238vjJ.EZpvd().getVisibility() == 0) {
            android.widget.ImageView imageViewEZpvd = c51238vjJ.EZpvd();
            C51277vjw c51277vjwCopydefault = c51237vjI.copydefault();
            imageViewEZpvd.setSelected(c51277vjwCopydefault != null ? Intrinsics.EZpvd(c51277vjwCopydefault.OLrzqt(), java.lang.Boolean.TRUE) : false);
            C51277vjw c51277vjwCopydefault2 = c51237vjI.copydefault();
            Intrinsics.copydefault(c51277vjwCopydefault2);
            c51234vjF.KWHzl(c51277vjwCopydefault2.copydefault(), c51238vjJ.copydefault());
            c51234vjF.copydefault(c51238vjJ.copydefault(), c51234vjF.KWHzl);
            c51238vjJ.AEQbTJ().setVisibility(8);
        }
    }

    /* JADX INFO: renamed from: o.vjF$TaskDescription */
    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ C51234vjF KWHzl;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, C51234vjF c51234vjF) {
            this.AEQbTJ = view;
            this.copydefault = j;
            this.KWHzl = c51234vjF;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.copydefault || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                this.KWHzl.OLrzqt.invoke();
            }
        }
    }
}
