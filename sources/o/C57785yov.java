package o;

import com.onesignal.OneSignal;

/* JADX INFO: renamed from: o.yov, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public class C57785yov implements InterfaceC57738yoA {
    @Override // o.InterfaceC57738yoA
    public void EZpvd(@androidx.annotation.NonNull java.lang.String str) {
        OneSignal.KWHzl(OneSignal.LOG_LEVEL.VERBOSE, str);
    }

    @Override // o.InterfaceC57738yoA
    public void OLrzqt(@androidx.annotation.NonNull java.lang.String str) {
        OneSignal.KWHzl(OneSignal.LOG_LEVEL.DEBUG, str);
    }

    @Override // o.InterfaceC57738yoA
    public void copydefault(@androidx.annotation.NonNull java.lang.String str) {
        OneSignal.KWHzl(OneSignal.LOG_LEVEL.INFO, str);
    }

    @Override // o.InterfaceC57738yoA
    public void AEQbTJ(@androidx.annotation.NonNull java.lang.String str) {
        OneSignal.KWHzl(OneSignal.LOG_LEVEL.WARN, str);
    }

    @Override // o.InterfaceC57738yoA
    public void KWHzl(@androidx.annotation.NonNull java.lang.String str) {
        OneSignal.KWHzl(OneSignal.LOG_LEVEL.ERROR, str);
    }

    @Override // o.InterfaceC57738yoA
    public void KWHzl(@androidx.annotation.NonNull java.lang.String str, @androidx.annotation.NonNull java.lang.Throwable th) {
        OneSignal.OLrzqt(OneSignal.LOG_LEVEL.ERROR, str, th);
    }
}
