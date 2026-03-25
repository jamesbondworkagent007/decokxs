package o;

/* JADX INFO: renamed from: o.zwZ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C60136zwZ extends AbstractC60131zwU<androidx.fragment.app.Fragment> {
    public C60136zwZ(@androidx.annotation.NonNull androidx.fragment.app.Fragment fragment) {
        super(fragment);
    }

    @Override // o.AbstractC60131zwU
    public androidx.fragment.app.FragmentManager KWHzl() {
        return AEQbTJ().getChildFragmentManager();
    }

    @Override // o.AbstractC60132zwV
    public void AEQbTJ(int i, @androidx.annotation.NonNull java.lang.String... strArr) {
        AEQbTJ().requestPermissions(strArr, i);
    }

    @Override // o.AbstractC60132zwV
    public boolean OLrzqt(@androidx.annotation.NonNull java.lang.String str) {
        return AEQbTJ().shouldShowRequestPermissionRationale(str);
    }

    @Override // o.AbstractC60132zwV
    public android.content.Context OLrzqt() {
        return AEQbTJ().getActivity();
    }
}
