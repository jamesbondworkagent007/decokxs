package o;

import android.widget.FrameLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwner;
import com.okinc.okimcore.model.im.OKMessage;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.C35922oIr;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.oIq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C35921oIq implements InterfaceC35920oIp {
    public android.view.ViewGroup AEQbTJ;
    public FragmentActivity EZpvd;
    public int KWHzl;
    public LifecycleOwner OLrzqt;
    public androidx.fragment.app.FragmentManager copydefault;

    @Override // o.InterfaceC35920oIp
    public void copydefault(@NotNull androidx.fragment.app.Fragment fragment, @androidx.annotation.Dimension(unit = 0) int i, @androidx.annotation.ColorInt int i2) {
        Intrinsics.checkNotNullParameter(fragment, "");
        this.EZpvd = fragment.requireActivity();
        this.OLrzqt = fragment.getViewLifecycleOwner();
        FragmentActivity fragmentActivity = this.EZpvd;
        FragmentActivity fragmentActivity2 = null;
        if (fragmentActivity == null) {
            Intrinsics.gEmmrt("");
            fragmentActivity = null;
        }
        this.copydefault = fragmentActivity.getSupportFragmentManager();
        this.KWHzl = i2;
        FragmentActivity fragmentActivity3 = this.EZpvd;
        if (fragmentActivity3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            fragmentActivity2 = fragmentActivity3;
        }
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) fragmentActivity2.findViewById(android.R.id.content);
        if (viewGroup != null) {
            this.AEQbTJ = viewGroup;
        }
    }

    public boolean KWHzl(@NotNull android.view.View view, @NotNull InterfaceC35924oIt interfaceC35924oIt, C35922oIr.ActionBar actionBar, @NotNull OKMessage oKMessage, boolean z) {
        FragmentActivity fragmentActivity;
        FragmentActivity fragmentActivity2;
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(interfaceC35924oIt, "");
        Intrinsics.checkNotNullParameter(oKMessage, "");
        if (this.AEQbTJ == null) {
            return false;
        }
        C55168xep c55168xep = C55168xep.EZpvd;
        FragmentActivity fragmentActivity3 = this.EZpvd;
        android.view.ViewGroup viewGroup = null;
        if (fragmentActivity3 == null) {
            Intrinsics.gEmmrt("");
            fragmentActivity = null;
        } else {
            fragmentActivity = fragmentActivity3;
        }
        C55168xep.vibrate$default(c55168xep, fragmentActivity, 0L, 2, null);
        FragmentActivity fragmentActivity4 = this.EZpvd;
        if (fragmentActivity4 == null) {
            Intrinsics.gEmmrt("");
            fragmentActivity2 = null;
        } else {
            fragmentActivity2 = fragmentActivity4;
        }
        final C35922oIr c35922oIr = new C35922oIr(fragmentActivity2, null, 0, 6, null);
        android.view.ViewGroup viewGroup2 = this.AEQbTJ;
        if (viewGroup2 == null) {
            Intrinsics.gEmmrt("");
        } else {
            viewGroup = viewGroup2;
        }
        viewGroup.addView(c35922oIr, new FrameLayout.LayoutParams(-1, -1));
        c35922oIr.setDismissListener(new Function0() { // from class: o.oIs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C35921oIq.copydefault(this.AEQbTJ, c35922oIr);
            }
        });
        c35922oIr.KWHzl(this.KWHzl, view, interfaceC35924oIt, actionBar, oKMessage, z);
        return true;
    }

    public static final Unit copydefault(C35921oIq c35921oIq, C35922oIr c35922oIr) {
        android.view.ViewGroup viewGroup = c35921oIq.AEQbTJ;
        if (viewGroup == null) {
            Intrinsics.gEmmrt("");
            viewGroup = null;
        }
        viewGroup.removeView(c35922oIr);
        return Unit.INSTANCE;
    }
}
