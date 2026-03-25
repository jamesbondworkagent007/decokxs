package o;

import androidx.fragment.app.FragmentActivity;

/* JADX INFO: renamed from: o.aGB, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5948aGB implements InterfaceC5995aGw {
    public static final C5948aGB EZpvd = new C5948aGB();

    private C5948aGB() {
    }

    @Override // o.InterfaceC5995aGw
    public FragmentActivity KWHzl() {
        pUU.KWHzl("NativePasskeyKeyProviderImpl", "currentActivity");
        android.app.Activity activityAEQbTJ = C54819xWm.KWHzl().AEQbTJ();
        if (activityAEQbTJ instanceof FragmentActivity) {
            return (FragmentActivity) activityAEQbTJ;
        }
        return null;
    }
}
