package o;

import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C13754dXa;

/* JADX INFO: renamed from: o.emt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C16597emt implements ViewBinding {
    public final C16749epm AEQbTJ;
    public final android.widget.FrameLayout EZpvd;
    public final android.widget.FrameLayout KWHzl;
    public final C17109ewb OLrzqt;
    public final RecyclerView copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public android.widget.FrameLayout getRoot() {
        return this.EZpvd;
    }

    public C16597emt(@androidx.annotation.NonNull android.widget.FrameLayout frameLayout, @androidx.annotation.NonNull C17109ewb c17109ewb, @androidx.annotation.NonNull android.widget.FrameLayout frameLayout2, @androidx.annotation.NonNull RecyclerView recyclerView, @androidx.annotation.NonNull C16749epm c16749epm) {
        this.EZpvd = frameLayout;
        this.OLrzqt = c17109ewb;
        this.KWHzl = frameLayout2;
        this.copydefault = recyclerView;
        this.AEQbTJ = c16749epm;
    }

    public static C16597emt KWHzl(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C13754dXa.TaskDescription.hrjNmC, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return EZpvd(viewInflate);
    }

    public static C16597emt EZpvd(@androidx.annotation.NonNull android.view.View view) {
        android.view.View viewFindChildViewById;
        int i = C13754dXa.ActionBar.GQzpsZsQwTVT;
        android.view.View viewFindChildViewById2 = ViewBindings.findChildViewById(view, i);
        if (viewFindChildViewById2 != null) {
            C17109ewb c17109ewbCopydefault = C17109ewb.copydefault(viewFindChildViewById2);
            android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) view;
            i = C13754dXa.ActionBar.getTag;
            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
            if (recyclerView != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = C13754dXa.ActionBar.getActiveQueueItemId))) != null) {
                return new C16597emt(frameLayout, c17109ewbCopydefault, frameLayout, recyclerView, C16749epm.EZpvd(viewFindChildViewById));
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
