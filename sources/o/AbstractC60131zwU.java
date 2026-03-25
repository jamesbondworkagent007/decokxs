package o;

/* JADX INFO: renamed from: o.zwU, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public abstract class AbstractC60131zwU<T> extends AbstractC60132zwV<T> {
    public abstract androidx.fragment.app.FragmentManager KWHzl();

    public AbstractC60131zwU(@androidx.annotation.NonNull T t) {
        super(t);
    }

    @Override // o.AbstractC60132zwV
    public void OLrzqt(@androidx.annotation.NonNull java.lang.String str, @androidx.annotation.NonNull java.lang.String str2, @androidx.annotation.NonNull java.lang.String str3, @androidx.annotation.StyleRes int i, int i2, @androidx.annotation.NonNull java.lang.String... strArr) {
        androidx.fragment.app.FragmentManager fragmentManagerKWHzl = KWHzl();
        if (fragmentManagerKWHzl.findFragmentByTag("RationaleDialogFragmentCompat") instanceof C60130zwT) {
            return;
        }
        C60130zwT.AEQbTJ(str, str2, str3, i, i2, strArr).copydefault(fragmentManagerKWHzl, "RationaleDialogFragmentCompat");
    }
}
