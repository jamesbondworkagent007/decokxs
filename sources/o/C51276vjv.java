package o;

import android.text.TextUtils;
import android.view.View;
import com.okinc.tradingbot.impl.market_place.bot_copy.itembinder.DcaCopyConfirmTipsData;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import o.C32113mPz;
import o.C48033uCm;
import o.C55688xof;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.vjv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C51276vjv extends AbstractC59533zio<DcaCopyConfirmTipsData, C51280vjz> {
    public boolean EZpvd;

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public C51280vjz onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        android.view.View viewInflate = layoutInflater.inflate(C48033uCm.Activity.fBE, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "");
        return new C51280vjz(viewInflate);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull final C51280vjz c51280vjz, @NotNull DcaCopyConfirmTipsData dcaCopyConfirmTipsData) {
        Intrinsics.checkNotNullParameter(c51280vjz, "");
        Intrinsics.checkNotNullParameter(dcaCopyConfirmTipsData, "");
        final java.util.ArrayList arrayList = new java.util.ArrayList();
        if (!dcaCopyConfirmTipsData.OLrzqt()) {
            arrayList.add(C33070mpX.AYXKKw(C55688xof.Application.sCB));
        }
        if (C33129mqd.AEQbTJ(dcaCopyConfirmTipsData.copydefault(), 1) && !dcaCopyConfirmTipsData.EZpvd()) {
            arrayList.add(C33070mpX.AYXKKw(dcaCopyConfirmTipsData.OLrzqt() ? C55688xof.Application.gkJEwt : C55688xof.Application.zFtALg));
        }
        arrayList.add(C33070mpX.AYXKKw(dcaCopyConfirmTipsData.OLrzqt() ? C55688xof.Application.iRxXKY : C55688xof.Application.hGuIrQ));
        boolean zAEQbTJ = C33129mqd.AEQbTJ(java.lang.Integer.valueOf(arrayList.size()), 1);
        c51280vjz.AEQbTJ().setVisibility(zAEQbTJ ? 0 : 8);
        android.widget.LinearLayout linearLayoutKWHzl = c51280vjz.KWHzl();
        android.content.Context context = c51280vjz.itemView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        linearLayoutKWHzl.addView(AEQbTJ(context, (java.lang.String) CollectionsKt___CollectionsKt.AuCTelauCTel(arrayList), !zAEQbTJ));
        c51280vjz.AEQbTJ().setOnClickListener(new View.OnClickListener() { // from class: o.vjy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C51276vjv.KWHzl(this.AEQbTJ, c51280vjz, arrayList, view);
            }
        });
    }

    public static final void KWHzl(C51276vjv c51276vjv, C51280vjz c51280vjz, java.util.List list, android.view.View view) {
        c51276vjv.EZpvd = !c51276vjv.EZpvd;
        c51280vjz.KWHzl().removeAllViews();
        int i = 0;
        if (!c51276vjv.EZpvd) {
            android.widget.LinearLayout linearLayoutKWHzl = c51280vjz.KWHzl();
            android.content.Context context = c51280vjz.itemView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            linearLayoutKWHzl.addView(c51276vjv.AEQbTJ(context, (java.lang.String) CollectionsKt___CollectionsKt.AuCTelauCTel(list), false));
        } else {
            for (java.lang.Object obj : list) {
                if (i < 0) {
                    yDY.AYXKKw();
                }
                android.widget.LinearLayout linearLayoutKWHzl2 = c51280vjz.KWHzl();
                android.content.Context context2 = c51280vjz.itemView.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "");
                linearLayoutKWHzl2.addView(c51276vjv.AEQbTJ(context2, (java.lang.String) obj, true), i);
                i++;
            }
        }
        c51280vjz.AEQbTJ().setText(C33070mpX.AYXKKw(c51276vjv.EZpvd ? C55688xof.Application.getNavigationItemCount : C55688xof.Application.getDisplayOptions));
    }

    public final android.widget.TextView AEQbTJ(android.content.Context context, java.lang.String str, boolean z) {
        android.widget.TextView textView = new android.widget.TextView(context);
        textView.setTextColor(C33070mpX.copydefault(C32113mPz.ActionBar.iwGUEr));
        textView.setTextSize(2, 12.0f);
        textView.setTypeface(C55051xce.OLrzqt.valueOf());
        textView.setMaxLines(z ? Integer.MAX_VALUE : 2);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setText(str);
        return textView;
    }
}
