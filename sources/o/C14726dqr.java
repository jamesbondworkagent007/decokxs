package o;

import android.view.ViewGroup;
import androidx.appcompat.content.res.AppCompatResources;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.dqr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C14726dqr {
    public static final C14726dqr OLrzqt = new C14726dqr();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int OLrzqt() {
        return C52761wXj.TaskDescription.aHXSQp;
    }

    private C14726dqr() {
    }

    public final android.graphics.drawable.Drawable OLrzqt(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        return AppCompatResources.getDrawable(context, C52761wXj.TaskDescription.aHXSQp);
    }

    public final android.graphics.drawable.Drawable KWHzl(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        return AppCompatResources.getDrawable(context, C13754dXa.Activity.dNCPSb);
    }

    public final android.graphics.drawable.Drawable EZpvd(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        return AppCompatResources.getDrawable(context, C13754dXa.Activity.AxsJAYaxsJAY);
    }

    public final void KWHzl(C57440yiU c57440yiU, @NotNull java.util.List<java.lang.String> list, int i, int i2, float f, float f2, int i3) {
        java.util.List<java.lang.String> listFJNWhG;
        Intrinsics.checkNotNullParameter(list, "");
        if (list.isEmpty() || c57440yiU == null) {
            return;
        }
        android.content.Context context = c57440yiU.getContext();
        if (list.size() >= i2) {
            listFJNWhG = CollectionsKt___CollectionsKt.fJNWhG((java.util.Collection) CollectionsKt___CollectionsKt.AhwBna((java.lang.Iterable) CollectionsKt___CollectionsKt.fJNWhG((java.util.Collection) list), i3));
            listFJNWhG.add("");
        } else {
            listFJNWhG = list;
        }
        android.view.LayoutInflater layoutInflaterFrom = android.view.LayoutInflater.from(context);
        c57440yiU.removeAllViews();
        int size = listFJNWhG.size();
        int i4 = 0;
        while (i4 < size) {
            android.view.View viewInflate = layoutInflaterFrom.inflate(C13754dXa.TaskDescription.ibnZAm, (android.view.ViewGroup) c57440yiU, false);
            android.view.View viewFindViewById = viewInflate.findViewById(C13754dXa.ActionBar.ardYFU);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "");
            android.widget.ImageView imageView = (android.widget.ImageView) viewFindViewById;
            ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
            if (layoutParams != null) {
                Intrinsics.copydefault(context);
                layoutParams.width = C55298xhM.OLrzqt(i, context);
                layoutParams.height = C55298xhM.OLrzqt(i, context);
                imageView.setLayoutParams(layoutParams);
                C14725dqq.loadFixSizeBorderImage$default(imageView, listFJNWhG.get(i4), (list.size() < i2 || i4 != i3) ? C13754dXa.Activity.aKErDB : C13754dXa.Activity.ODWQjV, f, f2, 0, list.size() >= i2 && i4 == i3, 16, null);
                c57440yiU.addView(viewInflate);
                i4++;
            } else {
                throw new java.lang.NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
        }
    }

    public static /* synthetic */ java.util.ArrayList getChainSquareIconList$default(C14726dqr c14726dqr, java.util.List list, int i, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            i = 5;
        }
        return c14726dqr.KWHzl(list, i);
    }

    public final java.util.ArrayList<java.lang.Integer> KWHzl(@NotNull java.util.List<C10854bwM> list, int i) {
        Intrinsics.checkNotNullParameter(list, "");
        java.util.ArrayList<java.lang.Integer> arrayList = new java.util.ArrayList<>(i);
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            long jFetchVPNInfo = ((C10854bwM) it.next()).fetchVPNInfo();
            if (jFetchVPNInfo == 1) {
                arrayList.add(java.lang.Integer.valueOf(C13754dXa.Activity.OuxcSI));
            } else if (jFetchVPNInfo == 196) {
                arrayList.add(java.lang.Integer.valueOf(C13754dXa.Activity.OBJEWx));
            } else if (jFetchVPNInfo == 8453) {
                arrayList.add(java.lang.Integer.valueOf(C13754dXa.Activity.ffGIBT));
            } else if (jFetchVPNInfo == 66) {
                arrayList.add(java.lang.Integer.valueOf(C13754dXa.Activity.RKDWNf));
            } else if (jFetchVPNInfo == 59144) {
                arrayList.add(java.lang.Integer.valueOf(C13754dXa.Activity.getPostValueLengthLimit));
            } else if (jFetchVPNInfo == 10) {
                arrayList.add(java.lang.Integer.valueOf(C13754dXa.Activity.QkdxfA));
            } else if (jFetchVPNInfo == 42161) {
                arrayList.add(java.lang.Integer.valueOf(C13754dXa.Activity.DXXBbs));
            } else if (jFetchVPNInfo == 43114) {
                arrayList.add(java.lang.Integer.valueOf(C13754dXa.Activity.zuWLRA));
            } else if (jFetchVPNInfo == 137) {
                arrayList.add(java.lang.Integer.valueOf(C13754dXa.Activity.QSBOWP));
            } else if (jFetchVPNInfo == 56) {
                arrayList.add(java.lang.Integer.valueOf(C13754dXa.Activity.DCUTEI));
            }
            if (arrayList.size() == i) {
                break;
            }
        }
        return arrayList;
    }
}
