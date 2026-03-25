package o;

import androidx.appcompat.app.AppCompatDialogFragment;
import o.C60121zwJ;

/* JADX INFO: renamed from: o.zwT, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C60130zwT extends AppCompatDialogFragment {
    public C60121zwJ.Activity EZpvd;
    public C60121zwJ.StateListAnimator KWHzl;

    public static C60130zwT AEQbTJ(@androidx.annotation.NonNull java.lang.String str, @androidx.annotation.NonNull java.lang.String str2, @androidx.annotation.NonNull java.lang.String str3, @androidx.annotation.StyleRes int i, int i2, @androidx.annotation.NonNull java.lang.String[] strArr) {
        C60130zwT c60130zwT = new C60130zwT();
        c60130zwT.setArguments(new C60126zwP(str2, str3, str, i, i2, strArr).AEQbTJ());
        return c60130zwT;
    }

    public void copydefault(androidx.fragment.app.FragmentManager fragmentManager, java.lang.String str) {
        if (fragmentManager.isStateSaved()) {
            return;
        }
        show(fragmentManager, str);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: android.content.Context */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onAttach(android.content.Context context) {
        super.onAttach(context);
        if (getParentFragment() != null) {
            if (getParentFragment() instanceof C60121zwJ.Activity) {
                this.EZpvd = (C60121zwJ.Activity) getParentFragment();
            }
            if (getParentFragment() instanceof C60121zwJ.StateListAnimator) {
                this.KWHzl = (C60121zwJ.StateListAnimator) getParentFragment();
            }
        }
        if (context instanceof C60121zwJ.Activity) {
            this.EZpvd = (C60121zwJ.Activity) context;
        }
        if (context instanceof C60121zwJ.StateListAnimator) {
            this.KWHzl = (C60121zwJ.StateListAnimator) context;
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDetach() {
        super.onDetach();
        this.EZpvd = null;
        this.KWHzl = null;
    }

    @Override // androidx.appcompat.app.AppCompatDialogFragment, androidx.fragment.app.DialogFragment
    public android.app.Dialog onCreateDialog(android.os.Bundle bundle) {
        setCancelable(false);
        C60126zwP c60126zwP = new C60126zwP(getArguments());
        return c60126zwP.KWHzl(getContext(), new DialogInterfaceOnClickListenerC60124zwN(this, c60126zwP, this.EZpvd, this.KWHzl));
    }
}
