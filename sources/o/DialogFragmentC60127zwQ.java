package o;

import android.os.Build;
import o.C60121zwJ;

/* JADX INFO: renamed from: o.zwQ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class DialogFragmentC60127zwQ extends android.app.DialogFragment {
    public boolean EZpvd = false;
    public C60121zwJ.StateListAnimator KWHzl;
    public C60121zwJ.Activity OLrzqt;

    public static DialogFragmentC60127zwQ AEQbTJ(@androidx.annotation.NonNull java.lang.String str, @androidx.annotation.NonNull java.lang.String str2, @androidx.annotation.NonNull java.lang.String str3, @androidx.annotation.StyleRes int i, int i2, @androidx.annotation.NonNull java.lang.String[] strArr) {
        DialogFragmentC60127zwQ dialogFragmentC60127zwQ = new DialogFragmentC60127zwQ();
        dialogFragmentC60127zwQ.setArguments(new C60126zwP(str, str2, str3, i, i2, strArr).AEQbTJ());
        return dialogFragmentC60127zwQ;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: android.content.Context */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.app.DialogFragment, android.app.Fragment
    public void onAttach(android.content.Context context) {
        super.onAttach(context);
        if (getParentFragment() != null) {
            if (getParentFragment() instanceof C60121zwJ.Activity) {
                this.OLrzqt = (C60121zwJ.Activity) getParentFragment();
            }
            if (getParentFragment() instanceof C60121zwJ.StateListAnimator) {
                this.KWHzl = (C60121zwJ.StateListAnimator) getParentFragment();
            }
        }
        if (context instanceof C60121zwJ.Activity) {
            this.OLrzqt = (C60121zwJ.Activity) context;
        }
        if (context instanceof C60121zwJ.StateListAnimator) {
            this.KWHzl = (C60121zwJ.StateListAnimator) context;
        }
    }

    @Override // android.app.DialogFragment, android.app.Fragment
    public void onSaveInstanceState(android.os.Bundle bundle) {
        this.EZpvd = true;
        super.onSaveInstanceState(bundle);
    }

    public void OLrzqt(android.app.FragmentManager fragmentManager, java.lang.String str) {
        if ((Build.VERSION.SDK_INT < 26 || !fragmentManager.isStateSaved()) && !this.EZpvd) {
            show(fragmentManager, str);
        }
    }

    @Override // android.app.DialogFragment, android.app.Fragment
    public void onDetach() {
        super.onDetach();
        this.OLrzqt = null;
    }

    @Override // android.app.DialogFragment
    public android.app.Dialog onCreateDialog(android.os.Bundle bundle) {
        setCancelable(false);
        C60126zwP c60126zwP = new C60126zwP(getArguments());
        return c60126zwP.AEQbTJ(getActivity(), new DialogInterfaceOnClickListenerC60124zwN(this, c60126zwP, this.OLrzqt, this.KWHzl));
    }

    @Override // android.app.DialogFragment, android.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
    }
}
