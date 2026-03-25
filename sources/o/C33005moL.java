package o;

import androidx.lifecycle.LifecycleOwner;
import com.okinc.rxutils.SubHelper;
import o.C32113mPz;

/* JADX INFO: renamed from: o.moL, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@java.lang.Deprecated
public class C33005moL extends androidx.fragment.app.DialogFragment implements LifecycleOwner {
    public DialogC33577mzA AkhnZx;

    public int AYXKKw() {
        return 3;
    }

    public boolean AhwBna() {
        return true;
    }

    public boolean gEmmrt() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public DialogC33577mzA valueOf() {
        return this.AkhnZx;
    }

    @Override // androidx.fragment.app.DialogFragment
    public android.app.Dialog onCreateDialog(android.os.Bundle bundle) {
        DialogC33577mzA dialogC33577mzA = new DialogC33577mzA(getActivity(), getTheme());
        this.AkhnZx = dialogC33577mzA;
        return dialogC33577mzA;
    }

    public java.lang.Integer djBIcL() {
        return java.lang.Integer.valueOf(getResources().getColor(C32113mPz.ActionBar.QKVWgx));
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setStyle(0, C32113mPz.Dialog.AEQbTJ);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        java.lang.Integer numDjBIcL = djBIcL();
        C33472mxB c33472mxB = new C33472mxB(requireContext(), this.AkhnZx.getWindow());
        boolean zCopydefault = c33472mxB.copydefault();
        if (numDjBIcL != null) {
            c33472mxB.KWHzl(numDjBIcL.intValue(), zCopydefault);
        }
        c33472mxB.EZpvd(false, !zCopydefault);
        this.AkhnZx.copydefault().setSkipCollapsed(gEmmrt());
        this.AkhnZx.copydefault().setState(AYXKKw());
        this.AkhnZx.EZpvd(AhwBna());
    }

    @Override // androidx.fragment.app.DialogFragment
    public void setCancelable(boolean z) {
        this.AkhnZx.setCancelable(z);
    }

    public void KWHzl(boolean z) {
        this.AkhnZx.setCanceledOnTouchOutside(z);
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(@androidx.annotation.NonNull android.content.DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        SubHelper.AEQbTJ(this);
    }
}
