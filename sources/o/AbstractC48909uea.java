package o;

/* JADX INFO: renamed from: o.uea, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public abstract class AbstractC48909uea extends androidx.fragment.app.Fragment {
    public abstract void EZpvd(boolean z);

    public abstract void OLrzqt(boolean z);

    @Override // androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean z) {
        super.onHiddenChanged(z);
        if (z) {
            EZpvd(false);
        } else {
            OLrzqt(false);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        OLrzqt(true);
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        EZpvd(true);
    }
}
