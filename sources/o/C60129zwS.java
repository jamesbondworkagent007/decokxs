package o;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

/* JADX INFO: renamed from: o.zwS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C60129zwS extends AbstractC60131zwU<AppCompatActivity> {
    public C60129zwS(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
    }

    @Override // o.AbstractC60131zwU
    public androidx.fragment.app.FragmentManager KWHzl() {
        return AEQbTJ().getSupportFragmentManager();
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
}
