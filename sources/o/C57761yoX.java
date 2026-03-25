package o;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import com.onesignal.OneSignal;
import java.lang.ref.WeakReference;
import o.C57712ynb;

/* JADX INFO: renamed from: o.yoX, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public class C57761yoX {
    public static final java.lang.String copydefault = "com.onesignal.OSSystemConditionController";
    public final StateListAnimator AEQbTJ;

    /* JADX INFO: renamed from: o.yoX$StateListAnimator */
    public interface StateListAnimator {
        void isConnected();
    }

    /* JADX INFO: renamed from: o.yoX$TaskDescription */
    public interface TaskDescription {
        void KWHzl(@androidx.annotation.NonNull java.lang.String str, @androidx.annotation.NonNull C57712ynb.ActionBar actionBar);
    }

    public C57761yoX(StateListAnimator stateListAnimator) {
        this.AEQbTJ = stateListAnimator;
    }

    public boolean KWHzl() {
        if (OneSignal.getNewProxyInstance() == null) {
            OneSignal.AEQbTJ(OneSignal.LOG_LEVEL.WARN, "OSSystemConditionObserver curActivity null");
            return false;
        }
        try {
            if (AEQbTJ(OneSignal.getNewProxyInstance())) {
                OneSignal.AEQbTJ(OneSignal.LOG_LEVEL.WARN, "OSSystemConditionObserver dialog fragment detected");
                return false;
            }
        } catch (java.lang.NoClassDefFoundError e) {
            OneSignal.AEQbTJ(OneSignal.LOG_LEVEL.INFO, "AppCompatActivity is not used in this app, skipping 'isDialogFragmentShowing' check: " + e);
        }
        C57712ynb c57712ynbCopydefault = C57714ynd.copydefault();
        boolean zKWHzl = C57823ypg.KWHzl((WeakReference<android.app.Activity>) new WeakReference(OneSignal.getNewProxyInstance()));
        if (zKWHzl && c57712ynbCopydefault != null) {
            c57712ynbCopydefault.OLrzqt(copydefault, this.AEQbTJ);
            OneSignal.AEQbTJ(OneSignal.LOG_LEVEL.WARN, "OSSystemConditionObserver keyboard up detected");
        }
        return !zKWHzl;
    }

    public boolean AEQbTJ(android.content.Context context) throws java.lang.NoClassDefFoundError {
        if (context instanceof AppCompatActivity) {
            final androidx.fragment.app.FragmentManager supportFragmentManager = ((AppCompatActivity) context).getSupportFragmentManager();
            supportFragmentManager.registerFragmentLifecycleCallbacks(new FragmentManager.FragmentLifecycleCallbacks() { // from class: o.yoX.2
                @Override // androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks
                public void onFragmentDetached(@androidx.annotation.NonNull androidx.fragment.app.FragmentManager fragmentManager, @androidx.annotation.NonNull androidx.fragment.app.Fragment fragment) {
                    super.onFragmentDetached(fragmentManager, fragment);
                    if (fragment instanceof androidx.fragment.app.DialogFragment) {
                        supportFragmentManager.unregisterFragmentLifecycleCallbacks(this);
                        C57761yoX.this.AEQbTJ.isConnected();
                    }
                }
            }, true);
            java.util.List<androidx.fragment.app.Fragment> fragments = supportFragmentManager.getFragments();
            int size = fragments.size();
            if (size > 0) {
                androidx.fragment.app.Fragment fragment = fragments.get(size - 1);
                if (fragment.isVisible() && (fragment instanceof androidx.fragment.app.DialogFragment)) {
                    return true;
                }
            }
        }
        return false;
    }
}
