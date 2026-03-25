package o;

import kotlin.jvm.internal.Intrinsics;
import o.AbstractC22421hez;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.aZR, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6969aZR {
    public final kYC OLrzqt;

    @yCM
    public C6969aZR(@NotNull kYC kyc) {
        Intrinsics.checkNotNullParameter(kyc, "");
        this.OLrzqt = kyc;
    }

    public final void copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, java.util.Map<java.lang.String, java.lang.String> map, @NotNull java.util.List<java.lang.String> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(list, "");
        java.lang.String strOLrzqt = this.OLrzqt.OLrzqt(C33129mqd.valueOf(str));
        AbstractC22421hez.Application application = AbstractC22421hez.Companion;
        java.lang.String strEZpvd = application.EZpvd();
        java.lang.String strKWHzl = application.KWHzl();
        InterfaceC9738bbJ interfaceC9738bbJCopydefault = this.OLrzqt.copydefault();
        C25437iwh.EZpvd("DEXTrade_Confirm_Page_Click", new C22402heg(strOLrzqt, strEZpvd, strKWHzl, str3, str5, str4, str2, (interfaceC9738bbJCopydefault == null || !interfaceC9738bbJCopydefault.RJOkX()) ? "no" : "yes"), map, list);
    }
}
