package o;

import androidx.viewbinding.ViewBinding;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.hOm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC21846hOm<VB extends ViewBinding> extends AbstractC32998moE {
    public VB OLrzqt;

    public void EZpvd() {
    }

    public abstract VB KWHzl(@NotNull android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle);

    public abstract void KWHzl(@NotNull VB vb, android.os.Bundle bundle);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final VB aX_() {
        return this.OLrzqt;
    }

    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return -1;
    }

    @Override // o.AbstractC32998moE
    public void onInvisible() {
    }

    @Override // o.AbstractC32998moE
    public void onVisible() {
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
    }

    @Override // o.AbstractC32996moC, androidx.fragment.app.Fragment
    public final android.view.View onCreateView(@NotNull android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        VB vb = (VB) KWHzl(layoutInflater, viewGroup, bundle);
        this.OLrzqt = vb;
        if (vb != null) {
            return vb.getRoot();
        }
        return null;
    }

    @Override // o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        EZpvd();
    }

    @Override // o.AbstractC32996moC
    public final void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        VB vb = this.OLrzqt;
        if (vb != null) {
            KWHzl(vb, bundle);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.OLrzqt = null;
    }
}
