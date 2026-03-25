package o;

import android.os.Build;
import androidx.appcompat.app.AppCompatDelegate;
import com.okinc.rxutils.SubHelper;
import o.C32113mPz;
import o.C52761wXj;

/* JADX INFO: renamed from: o.moJ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@java.lang.Deprecated
public class C33003moJ extends androidx.fragment.app.DialogFragment {
    public static java.lang.String AuCTel = "nightModeV2Sp";
    public static java.lang.String getFieldNames = "nightNo";
    public static java.lang.String hDKMBd = "config";
    public static java.lang.String iwGUEr = "nightYes";
    public static java.lang.String uzCIH = "nightFollowSys";
    public DialogC33577mzA getNewProxyInstance;

    public boolean AhwBna() {
        return true;
    }

    public int fJNWhG() {
        return 3;
    }

    @Override // androidx.fragment.app.DialogFragment
    public android.app.Dialog onCreateDialog(android.os.Bundle bundle) {
        DialogC33577mzA dialogC33577mzA = new DialogC33577mzA(getActivity(), getTheme());
        this.getNewProxyInstance = dialogC33577mzA;
        android.view.Window window = dialogC33577mzA.getWindow();
        if (fIwbmz()) {
            window.setNavigationBarColor(getContext().getResources().getColor(C52761wXj.Activity.fAklCm));
        } else if (Build.VERSION.SDK_INT < 26) {
            window.setNavigationBarColor(getContext().getResources().getColor(C32113mPz.ActionBar.AEQbTJ));
        } else {
            window.setNavigationBarColor(getContext().getResources().getColor(C52761wXj.Activity.fAklCm));
            window.getDecorView().setSystemUiVisibility(window.getDecorView().getSystemUiVisibility() | 16);
        }
        return this.getNewProxyInstance;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        AEQbTJ();
    }

    public void AEQbTJ() {
        setStyle(0, C32113mPz.Dialog.AEQbTJ);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        if (this.getNewProxyInstance.copydefault() != null) {
            this.getNewProxyInstance.copydefault().setState(fJNWhG());
        }
        this.getNewProxyInstance.EZpvd(AhwBna());
    }

    @Override // androidx.fragment.app.DialogFragment
    public void setCancelable(boolean z) {
        this.getNewProxyInstance.setCancelable(z);
    }

    public void KWHzl(boolean z) {
        this.getNewProxyInstance.setCanceledOnTouchOutside(z);
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(@androidx.annotation.NonNull android.content.DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        SubHelper.AEQbTJ(this);
    }

    public final boolean fIwbmz() {
        int defaultNightMode = AppCompatDelegate.getDefaultNightMode();
        if (defaultNightMode == 2) {
            return true;
        }
        if (defaultNightMode == 1) {
            return false;
        }
        if (defaultNightMode == -1) {
            return (getContext().getResources().getConfiguration().uiMode & 48) == 32;
        }
        try {
            getContext().getSharedPreferences(hDKMBd, 0).getString(AuCTel, "");
        } catch (java.lang.Exception unused) {
        }
        if (android.text.TextUtils.equals("", iwGUEr)) {
            return true;
        }
        return !android.text.TextUtils.equals("", getFieldNames) && android.text.TextUtils.equals("", uzCIH) && (getContext().getResources().getConfiguration().uiMode & 48) == 32;
    }
}
