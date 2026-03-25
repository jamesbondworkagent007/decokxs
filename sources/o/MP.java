package o;

/* JADX INFO: loaded from: classes21.dex */
public class MP extends androidx.fragment.app.Fragment {
    public MN AEQbTJ;

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        MV.OLrzqt("onStart: ");
        MN mn = this.AEQbTJ;
        if (mn != null) {
            mn.EZpvd();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        MN mn = this.AEQbTJ;
        if (mn != null) {
            mn.AEQbTJ();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        MN mn = this.AEQbTJ;
        if (mn != null) {
            mn.OLrzqt();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        MV.OLrzqt("onDestroy: ");
        MN mn = this.AEQbTJ;
        if (mn != null) {
            mn.KWHzl();
        }
    }
}
