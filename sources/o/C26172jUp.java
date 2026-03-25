package o;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.core.util.SPUtils;
import kotlin.jvm.internal.Intrinsics;
import o.C52812wZg;
import o.qZH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jUp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C26172jUp {
    public static final C26172jUp AEQbTJ = new C26172jUp();

    public static final boolean copydefault(int i, int i2) {
        return (i & i2) == i2;
    }

    private C26172jUp() {
    }

    public final void copydefault(@NotNull android.content.Context context, @NotNull C42633raB c42633raB, @NotNull java.util.List<InterfaceC40516qYt> list) {
        int i;
        int iIntValue;
        java.lang.Integer numValueOf;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(c42633raB, "");
        Intrinsics.checkNotNullParameter(list, "");
        if (list.isEmpty()) {
            return;
        }
        int i2 = 0;
        java.lang.Integer num = SPUtils.getInt("market.favorites_groups_edit_guiding_displayed_flag", 0);
        Intrinsics.copydefault(num);
        if (copydefault(num.intValue(), 15)) {
            return;
        }
        java.util.Iterator<InterfaceC40516qYt> it = list.iterator();
        int i3 = 0;
        while (true) {
            i = -1;
            if (!it.hasNext()) {
                i3 = -1;
                break;
            }
            InterfaceC40516qYt next = it.next();
            C26170jUn c26170jUn = next instanceof C26170jUn ? (C26170jUn) next : null;
            if (c26170jUn != null && !c26170jUn.AhwBna()) {
                break;
            } else {
                i3++;
            }
        }
        java.lang.Integer numValueOf2 = java.lang.Integer.valueOf(i3);
        if (numValueOf2.intValue() < 0) {
            numValueOf2 = null;
        }
        if (numValueOf2 != null) {
            iIntValue = numValueOf2.intValue();
        } else {
            java.util.Iterator<InterfaceC40516qYt> it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                InterfaceC40516qYt next2 = it2.next();
                C26170jUn c26170jUn2 = next2 instanceof C26170jUn ? (C26170jUn) next2 : null;
                if (c26170jUn2 != null && !c26170jUn2.EZpvd()) {
                    i = i2;
                    break;
                }
                i2++;
            }
            java.lang.Integer numValueOf3 = java.lang.Integer.valueOf(i);
            if (numValueOf3.intValue() < 0) {
                numValueOf3 = null;
            }
            if (numValueOf3 == null) {
                return;
            } else {
                iIntValue = numValueOf3.intValue();
            }
        }
        RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition = c42633raB.AYXKKw.findViewHolderForAdapterPosition(iIntValue);
        if (viewHolderFindViewHolderForAdapterPosition == null) {
            return;
        }
        C42813rdW c42813rdWEZpvd = C42813rdW.EZpvd(viewHolderFindViewHolderForAdapterPosition.itemView);
        Intrinsics.checkNotNullExpressionValue(c42813rdWEZpvd, "");
        int iAEQbTJ = (int) C55298xhM.AEQbTJ(8, context);
        float fAEQbTJ = C55298xhM.AEQbTJ(30, context);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int iAhwBna = C7857arj.AhwBna(context) / 2;
        C52794wYp c52794wYp = c42633raB.copydefault;
        if (!(!copydefault(num.intValue(), 1))) {
            c52794wYp = null;
        }
        if (c52794wYp != null) {
            numValueOf = java.lang.Integer.valueOf(num.intValue() | 1);
            C52812wZg.StateListAnimator stateListAnimator = new C52812wZg.StateListAnimator(c52794wYp);
            stateListAnimator.EZpvd(3);
            stateListAnimator.copydefault(iAEQbTJ);
            stateListAnimator.AEQbTJ(iAEQbTJ);
            stateListAnimator.KWHzl(iAEQbTJ);
            stateListAnimator.OLrzqt(iAEQbTJ);
            stateListAnimator.AEQbTJ(iAEQbTJ);
            stateListAnimator.AEQbTJ(context.getString(qZH.PendingIntent.QFTsTN));
            stateListAnimator.OLrzqt(context.getString(qZH.PendingIntent.XW));
            arrayList.add(stateListAnimator);
        } else {
            numValueOf = num;
        }
        AppCompatImageView appCompatImageView = c42813rdWEZpvd.AEQbTJ;
        Intrinsics.copydefault(appCompatImageView);
        if (appCompatImageView.getVisibility() != 0) {
            appCompatImageView = null;
        }
        if (appCompatImageView != null) {
            if (!(!copydefault(num.intValue(), 2))) {
                appCompatImageView = null;
            }
            if (appCompatImageView != null) {
                numValueOf = java.lang.Integer.valueOf(2 | numValueOf.intValue());
                C52812wZg.StateListAnimator stateListAnimator2 = new C52812wZg.StateListAnimator(appCompatImageView);
                stateListAnimator2.EZpvd(EZpvd(iAhwBna, appCompatImageView));
                stateListAnimator2.copydefault(iAEQbTJ);
                stateListAnimator2.AEQbTJ(iAEQbTJ);
                stateListAnimator2.KWHzl(iAEQbTJ);
                stateListAnimator2.OLrzqt(iAEQbTJ);
                stateListAnimator2.AEQbTJ(fAEQbTJ);
                stateListAnimator2.AEQbTJ(context.getString(qZH.PendingIntent.DDjfYY));
                stateListAnimator2.OLrzqt(context.getString(qZH.PendingIntent.DlABUU));
                arrayList.add(stateListAnimator2);
            }
        }
        AppCompatImageView appCompatImageView2 = c42813rdWEZpvd.copydefault;
        Intrinsics.copydefault(appCompatImageView2);
        if (appCompatImageView2.getVisibility() != 0) {
            appCompatImageView2 = null;
        }
        if (appCompatImageView2 != null) {
            if (!(!copydefault(num.intValue(), 4))) {
                appCompatImageView2 = null;
            }
            if (appCompatImageView2 != null) {
                numValueOf = java.lang.Integer.valueOf(numValueOf.intValue() | 4);
                C52812wZg.StateListAnimator stateListAnimator3 = new C52812wZg.StateListAnimator(appCompatImageView2);
                stateListAnimator3.EZpvd(EZpvd(iAhwBna, appCompatImageView2));
                stateListAnimator3.copydefault(iAEQbTJ);
                stateListAnimator3.AEQbTJ(iAEQbTJ);
                stateListAnimator3.KWHzl(iAEQbTJ);
                stateListAnimator3.OLrzqt(iAEQbTJ);
                stateListAnimator3.AEQbTJ(fAEQbTJ);
                stateListAnimator3.AEQbTJ(context.getString(qZH.PendingIntent.DGGHxk));
                stateListAnimator3.OLrzqt(context.getString(qZH.PendingIntent.bindToGooglePlayService));
                arrayList.add(stateListAnimator3);
            }
        }
        AppCompatImageView appCompatImageView3 = copydefault(num.intValue(), 8) ^ true ? c42813rdWEZpvd.EZpvd : null;
        if (appCompatImageView3 != null) {
            numValueOf = java.lang.Integer.valueOf(numValueOf.intValue() | 8);
            C52812wZg.StateListAnimator stateListAnimator4 = new C52812wZg.StateListAnimator(appCompatImageView3);
            stateListAnimator4.EZpvd(EZpvd(iAhwBna, appCompatImageView3));
            stateListAnimator4.copydefault(iAEQbTJ);
            stateListAnimator4.AEQbTJ(iAEQbTJ);
            stateListAnimator4.KWHzl(iAEQbTJ);
            stateListAnimator4.OLrzqt(iAEQbTJ);
            stateListAnimator4.AEQbTJ(fAEQbTJ);
            stateListAnimator4.AEQbTJ(context.getString(qZH.PendingIntent.QslYrK));
            stateListAnimator4.OLrzqt(context.getString(qZH.PendingIntent.DxnCrt));
            arrayList.add(stateListAnimator4);
        }
        if (!arrayList.isEmpty()) {
            SPUtils.put("market.favorites_groups_edit_guiding_displayed_flag", numValueOf);
            C52812wZg c52812wZg = new C52812wZg(context);
            c52812wZg.EZpvd(arrayList);
            c52812wZg.OLrzqt(3);
            c52812wZg.fARcdN();
            pUU.EZpvd("MarketFavoritesGroupsEditingCoachMark", "showCoachMark flag: " + numValueOf);
        }
    }

    public static final int EZpvd(int i, android.view.View view) {
        return C41431qqg.copydefault(view).y > i ? 3 : 1;
    }
}
