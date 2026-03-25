package o;

import com.okinc.wallet.api.bean.ReferralInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.htx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C23214htx implements InterfaceC23209hts {
    public final xWP KWHzl;

    @yCM
    public C23214htx(@NotNull xWP xwp) {
        Intrinsics.checkNotNullParameter(xwp, "");
        this.KWHzl = xwp;
    }

    @Override // o.InterfaceC23209hts
    public ReferralInfo EZpvd(java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str2, "");
        ReferralInfo referralInfoOLrzqt = this.KWHzl.OLrzqt(str, str2);
        if (referralInfoOLrzqt != null) {
            pUU.KWHzl("WalletReferralRepository", "referCode:>>>>>>" + referralInfoOLrzqt.getReferralCode() + ">>>>>>>referralAddress>>>>>>" + referralInfoOLrzqt.getReferralAddress());
            return referralInfoOLrzqt;
        }
        xWP xwp = this.KWHzl;
        if (str == null) {
            str = "";
        }
        ReferralInfo referralInfoAEQbTJ = xwp.AEQbTJ(str, str2);
        if (referralInfoAEQbTJ == null) {
            return null;
        }
        pUU.copydefault("WalletReferralRepository", "referCode:>>>>>>" + referralInfoAEQbTJ.getReferralCode() + ">>>>>>>referralAddress>>>>>>" + referralInfoAEQbTJ.getReferralAddress());
        return referralInfoAEQbTJ;
    }

    @Override // o.InterfaceC23209hts
    public void AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull Function2<? super java.lang.Boolean, ? super java.lang.String, Unit> function2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(function2, "");
        ReferralInfo referralInfoOLrzqt = this.KWHzl.OLrzqt(str, str2);
        if (referralInfoOLrzqt != null) {
            this.KWHzl.OLrzqt(referralInfoOLrzqt, str, function2);
            return;
        }
        ReferralInfo referralInfoAEQbTJ = AEQbTJ(str, str2);
        if (referralInfoAEQbTJ == null) {
            return;
        }
        this.KWHzl.AEQbTJ(referralInfoAEQbTJ, str, function2);
    }

    @Override // o.InterfaceC23209hts
    public void AEQbTJ(@NotNull android.content.Context context, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.util.Map<java.lang.String, java.lang.String> map, @NotNull Function1<? super java.lang.Boolean, Unit> function1) {
        ReferralInfo referralInfoAEQbTJ;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(function1, "");
        if (copydefault(str, str2) || (referralInfoAEQbTJ = AEQbTJ(str, str2)) == null) {
            return;
        }
        this.KWHzl.EZpvd(context, str, referralInfoAEQbTJ, map, function1);
    }

    public boolean copydefault(java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str2, "");
        return this.KWHzl.OLrzqt(str, str2) != null;
    }

    @Override // o.InterfaceC23209hts
    public boolean OLrzqt(java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str2, "");
        ReferralInfo referralInfoAEQbTJ = this.KWHzl.AEQbTJ(str == null ? "" : str, str2);
        java.lang.String referralCode = referralInfoAEQbTJ != null ? referralInfoAEQbTJ.getReferralCode() : null;
        java.lang.String str3 = referralCode != null ? referralCode : "";
        boolean zCopydefault = copydefault(str, str2);
        boolean z = referralInfoAEQbTJ != null && referralInfoAEQbTJ.getIpAllowed();
        pUU.KWHzl("isBindReferralCode", "isBindReferral:>>>" + zCopydefault + ">>>>>>>preRefCode:" + str3 + ">>>>>isAllowed:" + z);
        return !zCopydefault && str3.length() > 0 && z;
    }

    @Override // o.InterfaceC23209hts
    public void KWHzl(java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str2, "");
        ReferralInfo referralInfoEZpvd = EZpvd(str, str2);
        if (referralInfoEZpvd != null) {
            xWP xwp = this.KWHzl;
            if (str == null) {
                str = "";
            }
            xwp.OLrzqt(referralInfoEZpvd, str);
        }
    }

    @Override // o.InterfaceC23209hts
    public java.lang.String OLrzqt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return this.KWHzl.EZpvd(str);
    }

    public final ReferralInfo AEQbTJ(java.lang.String str, java.lang.String str2) {
        return this.KWHzl.AEQbTJ(str, str2);
    }
}
