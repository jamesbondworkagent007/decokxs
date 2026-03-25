package o;

import o.C32986mnt;
import uniffi.app_state.AppState;

/* JADX INFO: renamed from: o.mfB, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C32518mfB implements InterfaceC3563AoM {
    @Override // o.InterfaceC3563AoM
    public AppState KWHzl() {
        if (C32986mnt.EZpvd.valueOf()) {
            return AppState.ACTIVE;
        }
        return AppState.BACKGROUND;
    }

    public final void copydefault() {
        C32986mnt.EZpvd.copydefault(new Application());
    }

    /* JADX INFO: renamed from: o.mfB$Application */
    public static final class Application implements C32986mnt.Application {
        @Override // o.C32986mnt.Application
        public void AEQbTJ() {
            C3567AoQ.appSupportNotifyStateChange(AppState.ACTIVE);
        }

        @Override // o.C32986mnt.Application
        public void OLrzqt() {
            C3567AoQ.appSupportNotifyStateChange(AppState.BACKGROUND);
        }
    }
}
