package o;

import com.okinc.okpush.sdk.config.OKPushConfig;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tgc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C46938tgc {
    public static final C46938tgc copydefault = new C46938tgc();
    public static C46944tgi OLrzqt = new C46944tgi();
    public static final int EZpvd = 8;

    private C46938tgc() {
    }

    public final void copydefault(@NotNull InterfaceC46936tga interfaceC46936tga) {
        Intrinsics.checkNotNullParameter(interfaceC46936tga, "");
        OLrzqt.copydefault(interfaceC46936tga);
    }

    public final void AEQbTJ(@NotNull C46941tgf c46941tgf) {
        Intrinsics.checkNotNullParameter(c46941tgf, "");
        for (InterfaceC46936tga interfaceC46936tga : OLrzqt.copydefault()) {
            if (interfaceC46936tga.OLrzqt(c46941tgf)) {
                pUU.KWHzl("OKPushDispatcher", "message: " + c46941tgf + " has been handle with interceptor desc: " + interfaceC46936tga.EZpvd() + ", interceptor: " + interfaceC46936tga);
                return;
            }
        }
        try {
            java.lang.String strCopydefault = c46941tgf.copydefault();
            pUU.EZpvd("OKPushDispatcher", "deeplink url: " + strCopydefault);
            if (C33129mqd.OLrzqt((java.lang.CharSequence) strCopydefault)) {
                Function1<java.lang.String, Unit> function1AYXKKw = OKPushConfig.copydefault.AYXKKw();
                if (function1AYXKKw != null) {
                    function1AYXKKw.invoke(strCopydefault);
                    return;
                }
                return;
            }
            pUU.KWHzl("OKPushDispatcher", "dispatchClickMessage exception cause deeplink url is null! msg: " + c46941tgf);
            if (C32986mnt.EZpvd.valueOf()) {
                return;
            }
            C32979mnm c32979mnm = C32979mnm.EZpvd;
            android.content.Intent launchIntentForPackage = c32979mnm.OLrzqt().getPackageManager().getLaunchIntentForPackage(c32979mnm.OLrzqt().getPackageName());
            if (launchIntentForPackage != null) {
                launchIntentForPackage.addFlags(268435456);
            }
            c32979mnm.OLrzqt().startActivity(launchIntentForPackage);
        } catch (java.lang.Exception e) {
            pUU.copydefault("OKPushDispatcher", "dispatchClickMessage exception: " + e);
        }
    }
}
