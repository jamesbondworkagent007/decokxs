package o;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.tradingbot.impl.market_place.bot_copy.itembinder.PriceRangeInfo;
import com.okinc.tradingbot.impl.market_place.bot_copy.itembinder.PriceRangeItemInfo;
import com.okinc.unify_trade.biz.RecurringListItem;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.vjL, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C51240vjL extends AbstractC59533zio<PriceRangeInfo, C51242vjN> {
    public final C59534zip KWHzl = new C59534zip();

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public C51242vjN onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        AbstractC48647uZd abstractC48647uZdCopydefault = AbstractC48647uZd.copydefault(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(abstractC48647uZdCopydefault, "");
        return new C51242vjN(abstractC48647uZdCopydefault);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull final C51242vjN c51242vjN, @NotNull final PriceRangeInfo priceRangeInfo) {
        Intrinsics.checkNotNullParameter(c51242vjN, "");
        Intrinsics.checkNotNullParameter(priceRangeInfo, "");
        final java.util.ArrayList arrayList = new java.util.ArrayList();
        for (RecurringListItem recurringListItem : priceRangeInfo.copydefault()) {
            PriceRangeItemInfo priceRangeItemInfo = new PriceRangeItemInfo(null, null, null, null, 15, null);
            priceRangeItemInfo.EZpvd(recurringListItem.getCcy());
            priceRangeItemInfo.AEQbTJ(recurringListItem.getMinPrice());
            priceRangeItemInfo.copydefault(recurringListItem.getMaxPrice());
            priceRangeItemInfo.KWHzl(priceRangeInfo.OLrzqt());
            arrayList.add(priceRangeItemInfo);
        }
        final java.util.ArrayList arrayList2 = new java.util.ArrayList();
        PriceRangeItemInfo priceRangeItemInfo2 = new PriceRangeItemInfo(null, null, null, null, 15, null);
        priceRangeItemInfo2.EZpvd(priceRangeInfo.copydefault().get(0).getCcy());
        priceRangeItemInfo2.AEQbTJ(priceRangeInfo.copydefault().get(0).getMinPrice());
        priceRangeItemInfo2.copydefault(priceRangeInfo.copydefault().get(0).getMaxPrice());
        priceRangeItemInfo2.KWHzl(priceRangeInfo.OLrzqt());
        arrayList2.add(priceRangeItemInfo2);
        android.content.Context context = c51242vjN.itemView.getContext();
        c51242vjN.copydefault().OLrzqt.setText(priceRangeInfo.KWHzl());
        android.widget.ImageView imageView = c51242vjN.copydefault().KWHzl;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        imageView.setVisibility(priceRangeInfo.EZpvd() ? 0 : 8);
        if (arrayList.isEmpty() || C33129mqd.valueOf(java.lang.Integer.valueOf(arrayList.size()), 1)) {
            android.widget.ImageView imageView2 = c51242vjN.copydefault().KWHzl;
            Intrinsics.checkNotNullExpressionValue(imageView2, "");
            imageView2.setVisibility(8);
        }
        RecyclerView recyclerView = c51242vjN.copydefault().AEQbTJ;
        recyclerView.setLayoutManager(new LinearLayoutManager(context));
        recyclerView.setNestedScrollingEnabled(false);
        this.KWHzl.register(PriceRangeItemInfo.class, new C51241vjM());
        recyclerView.setAdapter(this.KWHzl);
        C33064mpR.OLrzqt(this.KWHzl, priceRangeInfo.AEQbTJ() ? arrayList : arrayList2);
        c51242vjN.copydefault().copydefault.setOnClickListener(new View.OnClickListener() { // from class: o.vjO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C51240vjL.AEQbTJ(this.EZpvd, c51242vjN, priceRangeInfo, arrayList, arrayList2, view);
            }
        });
    }

    public static final void AEQbTJ(C51240vjL c51240vjL, C51242vjN c51242vjN, PriceRangeInfo priceRangeInfo, java.util.ArrayList arrayList, java.util.ArrayList arrayList2, android.view.View view) {
        c51240vjL.KWHzl(c51242vjN, priceRangeInfo, arrayList, arrayList2);
    }

    public final void KWHzl(C51242vjN c51242vjN, PriceRangeInfo priceRangeInfo, java.util.ArrayList<PriceRangeItemInfo> arrayList, java.util.ArrayList<PriceRangeItemInfo> arrayList2) {
        android.graphics.drawable.Drawable drawableKWHzl;
        priceRangeInfo.AEQbTJ(!priceRangeInfo.AEQbTJ());
        if (priceRangeInfo.AEQbTJ()) {
            drawableKWHzl = C33070mpX.KWHzl(C52761wXj.TaskDescription.ExKek);
        } else {
            drawableKWHzl = C33070mpX.KWHzl(C52761wXj.TaskDescription.DfrfUJ);
        }
        if (drawableKWHzl != null) {
            C33057mpK.copydefault(drawableKWHzl, C33070mpX.copydefault(C52761wXj.Activity.Dff));
            c51242vjN.copydefault().KWHzl.setImageDrawable(drawableKWHzl);
        }
        if (!priceRangeInfo.AEQbTJ()) {
            arrayList = arrayList2;
        }
        C33064mpR.OLrzqt(this.KWHzl, arrayList);
    }
}
