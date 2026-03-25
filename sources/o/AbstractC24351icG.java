package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwner;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.icG, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC24351icG extends wXX implements LifecycleOwner {
    public C23499hzQ AEQbTJ;
    public wXQ copydefault;
    public final InterfaceC56387yDm KWHzl = C31200lpY.copydefault(this);
    public final float EZpvd = 273.0f;
    public final boolean OLrzqt = true;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C23499hzQ AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean EZpvd() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final wXQ KWHzl() {
        return this.copydefault;
    }

    public abstract void OLrzqt(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup);

    public final java.lang.String OLrzqt() {
        return (java.lang.String) this.KWHzl.getValue();
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        android.view.View viewInflate;
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        C23499hzQ c23499hzQKWHzl = C23499hzQ.KWHzl(getCustomLayoutInflater(), constraintLayout, true);
        this.AEQbTJ = c23499hzQKWHzl;
        if (c23499hzQKWHzl != null) {
            if (EZpvd()) {
                viewInflate = c23499hzQKWHzl.copydefault.inflate();
            } else {
                viewInflate = c23499hzQKWHzl.OLrzqt.inflate();
            }
            android.view.ViewGroup viewGroup = viewInflate != null ? (android.view.ViewGroup) viewInflate.findViewById(C23274hvD.Application.findRealOwner) : null;
            if (viewGroup != null) {
                OLrzqt(getCustomLayoutInflater(), viewGroup);
            }
        }
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        this.copydefault = wxq;
        wxq.AEQbTJ().setVisibility(8);
        wxq.setStyle(2);
        wxq.EZpvd().setVisibility(0);
    }

    public static /* synthetic */ void hasMinHeight$default(AbstractC24351icG abstractC24351icG, boolean z, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: hasMinHeight");
        }
        if ((i & 1) != 0) {
            z = false;
        }
        abstractC24351icG.KWHzl(z);
    }

    public final void KWHzl(boolean z) {
        int iEZpvd;
        C23499hzQ c23499hzQ = this.AEQbTJ;
        if (c23499hzQ != null) {
            android.widget.LinearLayout linearLayout = c23499hzQ.AEQbTJ;
            if (z) {
                FragmentActivity activity = getActivity();
                iEZpvd = C57676yms.EZpvd(activity != null ? activity.getApplicationContext() : null, this.EZpvd);
            } else {
                iEZpvd = 0;
            }
            linearLayout.setMinimumHeight(iEZpvd);
        }
    }

    public final int copydefault() {
        C23499hzQ c23499hzQ = this.AEQbTJ;
        if (c23499hzQ != null) {
            return c23499hzQ.AEQbTJ.getHeight();
        }
        return C33129mqd.KWHzl(C56523yIn.AEQbTJ, (java.lang.Object) java.lang.Float.valueOf(this.EZpvd));
    }
}
