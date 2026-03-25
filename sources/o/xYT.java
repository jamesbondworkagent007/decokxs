package o;

import com.okinc.wallet.core.mpc.PrivateKeyOriginData;
import com.okinc.wallet.core.tee.HPKEEncryptData;
import com.okinc.wallet.core.tee.HPKEKeypair;
import com.okinc.wallet.core.tee.TeeAttestationVerifyData;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class xYT {
    public static final xYT KWHzl = new xYT();

    private xYT() {
    }

    public final HPKEKeypair copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return xXV.KWHzl.ejfBZ(str, str2);
    }

    public final TeeAttestationVerifyData KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return xXV.KWHzl.iwGUEr(str);
    }

    public final boolean EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return xXV.KWHzl.AhwBna(str, str2, str3);
    }

    public final java.lang.String OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return xXV.KWHzl.fIwbmz(str, str2);
    }

    public final HPKEEncryptData EZpvd(@NotNull java.util.List<PrivateKeyOriginData> list, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return xXV.KWHzl.AEQbTJ(list, str, str2, str3);
    }

    public final boolean AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        return xXV.KWHzl.AEQbTJ(str, str2, str3, str4, str5);
    }

    public final boolean AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return xXV.KWHzl.KWHzl(str, str2, str3);
    }

    public final java.lang.String EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return xXV.KWHzl.isConnected(str);
    }

    public final java.lang.String KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        xXV xxv = xXV.KWHzl;
        return xxv.AuCTel(C54910xZw.EZpvd(xxv.copydefault(str, str2, true)));
    }
}
