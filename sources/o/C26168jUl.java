package o;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.core.util.SPUtils;
import kotlin.jvm.internal.Intrinsics;
import o.C52812wZg;
import o.qZH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jUl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C26168jUl {
    public static final C26168jUl AEQbTJ = new C26168jUl();

    public static final boolean EZpvd(int i, int i2) {
        return (i & i2) == i2;
    }

    private C26168jUl() {
    }

    public final void AEQbTJ(@NotNull android.content.Context context, @NotNull C42683raz c42683raz) {
        RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition;
        java.lang.Integer numValueOf;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(c42683raz, "");
        java.lang.Integer num = SPUtils.getInt("market.favorites_cryptos_edit_guiding_displayed_flag1", 0);
        Intrinsics.copydefault(num);
        if (EZpvd(num.intValue(), 15) || (viewHolderFindViewHolderForAdapterPosition = c42683raz.AYXKKw.findViewHolderForAdapterPosition(1)) == null) {
            return;
        }
        C42814rdX c42814rdXCopydefault = C42814rdX.copydefault(viewHolderFindViewHolderForAdapterPosition.itemView);
        Intrinsics.checkNotNullExpressionValue(c42814rdXCopydefault, "");
        AppCompatImageView appCompatImageView = c42814rdXCopydefault.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(appCompatImageView, "");
        AppCompatImageView appCompatImageView2 = c42814rdXCopydefault.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(appCompatImageView2, "");
        AppCompatTextView appCompatTextView = c42683raz.copydefault;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView, "");
        AppCompatTextView appCompatTextView2 = c42683raz.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView2, "");
        int iAEQbTJ = (int) C55298xhM.AEQbTJ(8, context);
        float fAEQbTJ = C55298xhM.AEQbTJ(30, context);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (EZpvd(num.intValue(), 1)) {
            numValueOf = num;
        } else {
            numValueOf = java.lang.Integer.valueOf(num.intValue() | 1);
            C52812wZg.StateListAnimator stateListAnimator = new C52812wZg.StateListAnimator(appCompatImageView);
            stateListAnimator.EZpvd(1);
            stateListAnimator.copydefault(iAEQbTJ);
            stateListAnimator.AEQbTJ(iAEQbTJ);
            stateListAnimator.KWHzl(iAEQbTJ);
            stateListAnimator.OLrzqt(iAEQbTJ);
            stateListAnimator.AEQbTJ(fAEQbTJ);
            stateListAnimator.AEQbTJ(context.getString(qZH.PendingIntent.gGNlxh));
            stateListAnimator.OLrzqt(context.getString(qZH.PendingIntent.glVQsU));
            arrayList.add(stateListAnimator);
        }
        if (!EZpvd(num.intValue(), 2)) {
            numValueOf = java.lang.Integer.valueOf(numValueOf.intValue() | 2);
            C52812wZg.StateListAnimator stateListAnimator2 = new C52812wZg.StateListAnimator(appCompatImageView2);
            stateListAnimator2.EZpvd(1);
            stateListAnimator2.copydefault(iAEQbTJ);
            stateListAnimator2.AEQbTJ(iAEQbTJ);
            stateListAnimator2.KWHzl(iAEQbTJ);
            stateListAnimator2.OLrzqt(iAEQbTJ);
            stateListAnimator2.AEQbTJ(fAEQbTJ);
            stateListAnimator2.AEQbTJ(context.getString(qZH.PendingIntent.QWpYiD));
            stateListAnimator2.OLrzqt(context.getString(qZH.PendingIntent.abAflu));
            arrayList.add(stateListAnimator2);
        }
        if (!EZpvd(num.intValue(), 4)) {
            numValueOf = java.lang.Integer.valueOf(numValueOf.intValue() | 4);
            C52812wZg.StateListAnimator stateListAnimator3 = new C52812wZg.StateListAnimator(appCompatTextView);
            stateListAnimator3.EZpvd(3);
            int i = -iAEQbTJ;
            stateListAnimator3.copydefault(i);
            stateListAnimator3.AEQbTJ(i);
            stateListAnimator3.KWHzl(i);
            stateListAnimator3.OLrzqt(i);
            stateListAnimator3.AEQbTJ(iAEQbTJ);
            stateListAnimator3.AEQbTJ(context.getString(qZH.PendingIntent.fiXcQa));
            stateListAnimator3.OLrzqt(context.getString(qZH.PendingIntent.DcMfJKsgNvtZ));
            arrayList.add(stateListAnimator3);
        }
        if (!EZpvd(num.intValue(), 8)) {
            numValueOf = java.lang.Integer.valueOf(8 | numValueOf.intValue());
            C52812wZg.StateListAnimator stateListAnimator4 = new C52812wZg.StateListAnimator(appCompatTextView2);
            stateListAnimator4.EZpvd(3);
            int i2 = -iAEQbTJ;
            stateListAnimator4.copydefault(i2);
            stateListAnimator4.AEQbTJ(i2);
            stateListAnimator4.KWHzl(i2);
            stateListAnimator4.OLrzqt(i2);
            stateListAnimator4.AEQbTJ(iAEQbTJ);
            stateListAnimator4.AEQbTJ(context.getString(qZH.PendingIntent.QKDJJA));
            stateListAnimator4.OLrzqt(context.getString(qZH.PendingIntent.DwQSDd));
            arrayList.add(stateListAnimator4);
        }
        if (!arrayList.isEmpty()) {
            SPUtils.put("market.favorites_cryptos_edit_guiding_displayed_flag1", numValueOf);
            C52812wZg c52812wZg = new C52812wZg(context);
            c52812wZg.EZpvd(arrayList);
            c52812wZg.OLrzqt(3);
            c52812wZg.fARcdN();
            pUU.EZpvd("MarketFavoritesCryptosEditingCoachMark", "showCoachMark flag: " + numValueOf);
        }
    }
}
