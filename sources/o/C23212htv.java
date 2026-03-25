package o;

import com.okinc.wallet.api.bean.ReferralInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.htv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C23212htv {
    public final InterfaceC23209hts KWHzl;
    public final kYC copydefault;

    @yCM
    public C23212htv(@NotNull kYC kyc, @NotNull InterfaceC23209hts interfaceC23209hts) {
        Intrinsics.checkNotNullParameter(kyc, "");
        Intrinsics.checkNotNullParameter(interfaceC23209hts, "");
        this.copydefault = kyc;
        this.KWHzl = interfaceC23209hts;
    }

    public final ReferralInfo AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        java.lang.String strKWHzl = this.copydefault.KWHzl();
        ReferralInfo referralInfoEZpvd = this.KWHzl.EZpvd(strKWHzl, str);
        pUU.KWHzl("WalletReferralUseCase", "accountId:" + strKWHzl + ",chainId:" + str + ",referCode:>>>>>>" + (referralInfoEZpvd != null ? referralInfoEZpvd.getReferralCode() : null) + ">>>>>>>referralAddress>>>>>>" + (referralInfoEZpvd != null ? referralInfoEZpvd.getReferralAddress() : null));
        return referralInfoEZpvd;
    }

    public final java.lang.String OLrzqt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        ReferralInfo referralInfoAEQbTJ = AEQbTJ(str);
        return (referralInfoAEQbTJ == null || !referralInfoAEQbTJ.getIpAllowed()) ? "" : referralInfoAEQbTJ.getReferralCode();
    }

    public final java.lang.String copydefault(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        ReferralInfo referralInfoAEQbTJ = AEQbTJ(str);
        java.lang.String version = referralInfoAEQbTJ != null ? referralInfoAEQbTJ.getVersion() : null;
        return version == null ? "" : version;
    }

    public final void copydefault(@NotNull java.lang.String str, @NotNull Function2<? super java.lang.Boolean, ? super java.lang.String, Unit> function2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(function2, "");
        this.KWHzl.AEQbTJ(this.copydefault.KWHzl(), str, function2);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.htv */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void showReferralCodeApplyPanel$default(C23212htv c23212htv, android.content.Context context, java.lang.String str, java.util.Map map, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            map = C56424yEw.KWHzl();
        }
        c23212htv.OLrzqt(context, str, map, function1);
    }

    public final void OLrzqt(@NotNull android.content.Context context, @NotNull java.lang.String str, @NotNull java.util.Map<java.lang.String, java.lang.String> map, @NotNull Function1<? super java.lang.Boolean, Unit> function1) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(function1, "");
        this.KWHzl.AEQbTJ(context, this.copydefault.KWHzl(), str, map, function1);
    }

    public final boolean KWHzl(@NotNull java.lang.String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        return this.KWHzl.OLrzqt(this.copydefault.KWHzl(), str);
    }

    public final void EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.KWHzl.KWHzl(this.copydefault.KWHzl(), str);
    }

    public final java.lang.String copydefault() {
        return this.KWHzl.OLrzqt(this.copydefault.KWHzl());
    }
}
