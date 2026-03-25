package o;

import kotlin.jvm.internal.Intrinsics;
import o.AbstractC22421hez;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.aZY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6976aZY {
    public final kYC AEQbTJ;

    @yCM
    public C6976aZY(@NotNull kYC kyc) {
        Intrinsics.checkNotNullParameter(kyc, "");
        this.AEQbTJ = kyc;
    }

    public final void copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, java.util.Map<java.lang.String, java.lang.String> map, @NotNull java.util.List<java.lang.String> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(list, "");
        java.lang.String strOLrzqt = this.AEQbTJ.OLrzqt(C33129mqd.valueOf(str2));
        AbstractC22421hez.Application application = AbstractC22421hez.Companion;
        java.lang.String strEZpvd = application.EZpvd();
        java.lang.String strKWHzl = application.KWHzl();
        InterfaceC9738bbJ interfaceC9738bbJCopydefault = this.AEQbTJ.copydefault();
        C25437iwh.EZpvd("DEXTrade_Home_FullPage_View", new C22402heg(strOLrzqt, strEZpvd, strKWHzl, str3, str5, str4, str, (interfaceC9738bbJCopydefault == null || !interfaceC9738bbJCopydefault.RJOkX()) ? "no" : "yes"), map, list);
    }
}
