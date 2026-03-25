package o;

import com.okinc.liveness.lca.EopTrackEvent;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.aZO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6966aZO {
    public final kYC KWHzl;

    @yCM
    public C6966aZO(@NotNull kYC kyc) {
        Intrinsics.checkNotNullParameter(kyc, "");
        this.KWHzl = kyc;
    }

    public final void AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, @NotNull java.util.Map<java.lang.String, java.lang.String> map) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(map, "");
        java.lang.String strOLrzqt = this.KWHzl.OLrzqt(C33129mqd.valueOf(str2));
        java.lang.String strKWHzl = AbstractC22421hez.Companion.KWHzl();
        InterfaceC9738bbJ interfaceC9738bbJCopydefault = this.KWHzl.copydefault();
        C25437iwh.KWHzl("DEXTrade_Home_FullPage_Click", new C22402heg(strOLrzqt, "no", strKWHzl, str3, str5, str4, str, (interfaceC9738bbJCopydefault == null || !interfaceC9738bbJCopydefault.RJOkX()) ? "no" : "yes"), map, (java.util.List<java.lang.String>) yDY.gEmmrt(EopTrackEvent.KEY_BUTTON_NAME, "button_type", "popup_source"));
    }
}
