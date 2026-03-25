package o;

import androidx.core.app.ActivityCompat;

/* JADX INFO: renamed from: o.zwW, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C60133zwW extends AbstractC60132zwV<android.app.Activity> {
    public C60133zwW(android.app.Activity activity) {
        super(activity);
    }

    @Override // o.AbstractC60132zwV
    public void AEQbTJ(int i, @androidx.annotation.NonNull java.lang.String... strArr) {
        ActivityCompat.requestPermissions(AEQbTJ(), strArr, i);
    }

    @Override // o.AbstractC60132zwV
    public boolean OLrzqt(@androidx.annotation.NonNull java.lang.String str) {
        return ActivityCompat.shouldShowRequestPermissionRationale(AEQbTJ(), str);
    }

    @Override // o.AbstractC60132zwV
    public android.content.Context OLrzqt() {
        return AEQbTJ();
    }

    @Override // o.AbstractC60132zwV
    public void OLrzqt(@androidx.annotation.NonNull java.lang.String str, @androidx.annotation.NonNull java.lang.String str2, @androidx.annotation.NonNull java.lang.String str3, @androidx.annotation.StyleRes int i, int i2, @androidx.annotation.NonNull java.lang.String... strArr) {
        android.app.FragmentManager fragmentManager = AEQbTJ().getFragmentManager();
        if (fragmentManager.findFragmentByTag("RationaleDialogFragment") instanceof DialogFragmentC60127zwQ) {
            return;
        }
        DialogFragmentC60127zwQ.AEQbTJ(str2, str3, str, i, i2, strArr).OLrzqt(fragmentManager, "RationaleDialogFragment");
    }
}
