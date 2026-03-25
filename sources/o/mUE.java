package o;

import androidx.lifecycle.LifecycleOwnerKt;
import androidx.viewbinding.ViewBinding;
import com.okinc.dexkline.dexui.main.swap.BaseSwapFragment$onStart$1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
public abstract class mUE<VB extends ViewBinding> extends AbstractC32998moE {
    public VB OLrzqt;
    public final InterfaceC56387yDm copydefault = C34656ngH.EZpvd(this);

    public abstract VB AEQbTJ(@NotNull android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle);

    public abstract void AEQbTJ(@NotNull VB vb, android.os.Bundle bundle);

    public void EZpvd() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final VB KWHzl() {
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

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        LifecycleOwnerKt.getLifecycleScope(this).launchWhenResumed(new BaseSwapFragment$onStart$1(null));
    }

    @Override // o.AbstractC32996moC, androidx.fragment.app.Fragment
    public final android.view.View onCreateView(@NotNull android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        VB vb = (VB) AEQbTJ(layoutInflater, viewGroup, bundle);
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
        view.post(new java.lang.Runnable() { // from class: o.mUI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                mUE.EZpvd(this.OLrzqt);
            }
        });
    }

    public static final void EZpvd(mUE mue) {
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) mue, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    @Override // o.AbstractC32996moC
    public final void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        VB vb = this.OLrzqt;
        if (vb != null) {
            AEQbTJ(vb, bundle);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.OLrzqt = null;
    }
}
