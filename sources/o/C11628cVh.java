package o;

import com.okinc.business.defi.utm.Web3UtmParamManager;
import com.okinc.wallet.api.bean.Web3BusinessLine;
import com.okinc.wallet.api.bean.Web3ReferralCodeSource;
import kotlin.jvm.internal.Intrinsics;
import o.C17668fNw;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.cVh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C11628cVh extends AbstractC43215rlA implements pKI {
    @Override // o.pKI
    public void copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        C17668fNw.Activity.getInstance$default(C17668fNw.Companion, null, 1, null).KWHzl(str2, str, Web3ReferralCodeSource.URL, Web3BusinessLine.DEX_REFERRAL);
    }

    @Override // o.pKI
    public void EZpvd(@NotNull java.lang.String str, pKM pkm, java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        if (str2 == null && pkm == null) {
            return;
        }
        Web3UtmParamManager instance$default = Web3UtmParamManager.TaskDescription.getInstance$default(Web3UtmParamManager.Companion, null, 1, null);
        java.lang.String strOLrzqt = pkm != null ? pkm.OLrzqt() : null;
        instance$default.KWHzl(new Web3UtmParamManager.UTMParamCachedBean(pkm != null ? pkm.copydefault() : null, pkm != null ? pkm.AEQbTJ() : null, pkm != null ? pkm.EZpvd() : null, pkm != null ? pkm.KWHzl() : null, strOLrzqt, java.lang.System.currentTimeMillis(), str, str2));
    }
}
