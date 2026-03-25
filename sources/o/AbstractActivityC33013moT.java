package o;

import o.C52761wXj;

/* JADX INFO: renamed from: o.moT, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractActivityC33013moT extends AbstractActivityC33041mov {
    public static final int $stable = 8;
    private final int brandThemeId = C52761wXj.LoaderManager.fdOvFl;
    private final android.util.SparseArray<C33510mxn> switchThemePairs = C33503mxg.EZpvd();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.ActivityC52757wXf
    public int getBrandThemeId() {
        return this.brandThemeId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractActivityC33041mov
    public android.util.SparseArray<C33510mxn> getSwitchThemePairs() {
        return this.switchThemePairs;
    }

    @Override // o.ActivityC52757wXf
    public int getColorThemeId() {
        return C33512mxp.AEQbTJ.isConnected() == 1 ? C52761wXj.LoaderManager.ixgjPv : C52761wXj.LoaderManager.DCUTEIdCUTEI;
    }

    @Override // o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        java.lang.Integer numKWHzl = C33503mxg.KWHzl(this.switchThemePairs);
        if (numKWHzl != null) {
            setTheme(numKWHzl.intValue());
        }
        super.onCreate(bundle);
    }

    @Override // o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
