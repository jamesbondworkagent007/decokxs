package o;

import androidx.fragment.app.FragmentActivity;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.giR, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC20518giR extends AbstractC14668dpm {
    public java.lang.Boolean copydefault;

    public final boolean KWHzl() {
        java.lang.Boolean bool = this.copydefault;
        if (bool == null) {
            androidx.fragment.app.Fragment parentFragment = getParentFragment();
            while (true) {
                if (parentFragment == null) {
                    break;
                }
                if (parentFragment instanceof androidx.fragment.app.DialogFragment) {
                    bool = java.lang.Boolean.TRUE;
                    break;
                }
                parentFragment = parentFragment.getParentFragment();
            }
            if (bool == null) {
                bool = java.lang.Boolean.FALSE;
            }
            this.copydefault = bool;
        }
        return bool.booleanValue();
    }

    @Override // o.AbstractC57212yeE
    public void AEQbTJ(android.os.Bundle bundle) {
        if (KWHzl()) {
            super.AEQbTJ(bundle);
            return;
        }
        FragmentActivity activity = getActivity();
        if (activity != null) {
            if (bundle == null) {
                activity.setResult(-1);
            } else {
                activity.setResult(-1, new android.content.Intent().putExtras(bundle));
            }
            activity.finish();
        }
    }

    public static /* synthetic */ void finish$default(AbstractC20518giR abstractC20518giR, int i, android.os.Bundle bundle, int i2, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: finish");
        }
        if ((i2 & 1) != 0) {
            i = 0;
        }
        abstractC20518giR.copydefault(i, bundle);
    }

    public final void copydefault(int i, android.os.Bundle bundle) {
        if (KWHzl()) {
            if (i != 0) {
                super.AEQbTJ(bundle);
                return;
            }
            return;
        }
        FragmentActivity activity = getActivity();
        if (activity != null) {
            if (bundle == null) {
                activity.setResult(i);
            } else {
                activity.setResult(i, new android.content.Intent().putExtras(bundle));
            }
            activity.finish();
        }
    }

    @Override // o.AbstractC57212yeE, o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        if (KWHzl()) {
            return;
        }
        AEQbTJ();
    }
}
