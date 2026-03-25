package o;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.iuX, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C25321iuX {
    public static final C25321iuX AEQbTJ = new C25321iuX();

    private C25321iuX() {
    }

    public final void copydefault(@NotNull final RecyclerView recyclerView, int i, int i2, int i3, long j, float f, @NotNull final Function0<Unit> function0) {
        android.view.View view;
        android.view.View view2;
        Intrinsics.checkNotNullParameter(recyclerView, "");
        Intrinsics.checkNotNullParameter(function0, "");
        int iDp2px$default = C55298xhM.dp2px$default(f, null, 1, null);
        final RecyclerView.ItemAnimator itemAnimator = recyclerView.getItemAnimator();
        final java.util.ArrayList arrayList = new java.util.ArrayList();
        final java.util.ArrayList arrayList2 = new java.util.ArrayList();
        int size = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition = recyclerView.findViewHolderForAdapterPosition(i + 1 + i4);
            if (viewHolderFindViewHolderForAdapterPosition != null && (view2 = viewHolderFindViewHolderForAdapterPosition.itemView) != null) {
                arrayList.add(view2);
                size += view2.getHeight() + iDp2px$default;
            }
        }
        int size2 = i2 - arrayList.size();
        if (size2 > 0) {
            size += (arrayList.isEmpty() ^ true ? size / arrayList.size() : 0) * size2;
        }
        for (int i5 = i + 1 + i2; i5 < i3; i5++) {
            RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition2 = recyclerView.findViewHolderForAdapterPosition(i5);
            if (viewHolderFindViewHolderForAdapterPosition2 != null && (view = viewHolderFindViewHolderForAdapterPosition2.itemView) != null) {
                arrayList2.add(view);
            }
        }
        if (arrayList.isEmpty()) {
            function0.invoke();
            return;
        }
        recyclerView.suppressLayout(true);
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((android.view.View) it.next()).animate().cancel();
        }
        java.util.Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            ((android.view.View) it2.next()).animate().cancel();
        }
        android.view.animation.DecelerateInterpolator decelerateInterpolator = new android.view.animation.DecelerateInterpolator();
        java.util.Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            ((android.view.View) it3.next()).animate().alpha(0.0f).setDuration(j).setInterpolator(decelerateInterpolator).start();
        }
        java.util.Iterator it4 = arrayList2.iterator();
        while (it4.hasNext()) {
            ((android.view.View) it4.next()).animate().translationY(-size).setDuration(j).setInterpolator(decelerateInterpolator).start();
        }
        recyclerView.postDelayed(new java.lang.Runnable() { // from class: o.iva
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C25321iuX.AEQbTJ(arrayList, arrayList2, recyclerView, function0, itemAnimator);
            }
        }, j);
    }

    public static final void OLrzqt(RecyclerView recyclerView, RecyclerView.ItemAnimator itemAnimator) {
        recyclerView.setItemAnimator(itemAnimator);
    }

    public static final void AEQbTJ(java.util.List list, java.util.List list2, final RecyclerView recyclerView, Function0 function0, final RecyclerView.ItemAnimator itemAnimator) {
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            android.view.View view = (android.view.View) it.next();
            view.animate().cancel();
            view.setAlpha(1.0f);
        }
        java.util.Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            android.view.View view2 = (android.view.View) it2.next();
            view2.animate().cancel();
            view2.setTranslationY(0.0f);
        }
        recyclerView.setItemAnimator(null);
        recyclerView.suppressLayout(false);
        function0.invoke();
        recyclerView.post(new java.lang.Runnable() { // from class: o.iuW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C25321iuX.OLrzqt(recyclerView, itemAnimator);
            }
        });
    }
}
