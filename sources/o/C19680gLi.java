package o;

import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.fragment.app.FragmentActivity;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.gLi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C19680gLi {
    public final InterfaceC19679gLh KWHzl;

    public C19680gLi(@NotNull InterfaceC19679gLh interfaceC19679gLh) {
        Intrinsics.checkNotNullParameter(interfaceC19679gLh, "");
        this.KWHzl = interfaceC19679gLh;
    }

    public final void EZpvd() {
        LinearLayoutCompat linearLayoutCompatCopydefault;
        InterfaceC19682gLk interfaceC19682gLkAEQbTJ = AEQbTJ();
        if (interfaceC19682gLkAEQbTJ == null || (linearLayoutCompatCopydefault = interfaceC19682gLkAEQbTJ.copydefault()) == null) {
            return;
        }
        OLrzqt();
        android.view.View viewCopydefault = this.KWHzl.copydefault();
        if (viewCopydefault != null) {
            linearLayoutCompatCopydefault.addView(viewCopydefault);
        }
    }

    public final void OLrzqt() {
        LinearLayoutCompat linearLayoutCompatCopydefault;
        InterfaceC19682gLk interfaceC19682gLkAEQbTJ = AEQbTJ();
        if (interfaceC19682gLkAEQbTJ == null || (linearLayoutCompatCopydefault = interfaceC19682gLkAEQbTJ.copydefault()) == null) {
            return;
        }
        linearLayoutCompatCopydefault.removeAllViews();
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:29:? */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3, types: [androidx.fragment.app.Fragment] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    public final InterfaceC19682gLk AEQbTJ() {
        InterfaceC19682gLk interfaceC19682gLk;
        java.lang.Object obj = this.KWHzl;
        ?? parentFragment = obj instanceof androidx.fragment.app.Fragment ? (androidx.fragment.app.Fragment) obj : 0;
        while (true) {
            parentFragment = parentFragment != 0 ? parentFragment.getParentFragment() : 0;
            if (parentFragment instanceof InterfaceC19682gLk) {
                interfaceC19682gLk = (InterfaceC19682gLk) parentFragment;
                break;
            }
            if (parentFragment == 0) {
                interfaceC19682gLk = null;
                break;
            }
        }
        if (interfaceC19682gLk != null) {
            return interfaceC19682gLk;
        }
        java.lang.Object obj2 = this.KWHzl;
        androidx.fragment.app.Fragment fragment = obj2 instanceof androidx.fragment.app.Fragment ? (androidx.fragment.app.Fragment) obj2 : null;
        FragmentActivity activity = fragment != null ? fragment.getActivity() : null;
        if (activity instanceof InterfaceC19682gLk) {
            return (InterfaceC19682gLk) activity;
        }
        return null;
    }
}
