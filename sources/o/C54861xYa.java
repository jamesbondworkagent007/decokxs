package o;

import com.okinc.wallet.core.aa.AAGenOriPaymasterTokenV7;
import com.okinc.wallet.core.aa.AAParseInitCode;
import com.okinc.wallet.core.aa.AAParsePaymasterDataV7;
import com.okinc.wallet.core.aa.AAPaymasterAndTokenParams;
import com.okinc.wallet.core.aa.AAPaymasterAndTokenParamsV7;
import com.okinc.wallet.core.aa.AAPaymasterDataAndSignature;
import com.okinc.wallet.core.aa.AAPaymasterDataAndSignatureV7;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xYa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C54861xYa {
    public static final C54861xYa AEQbTJ = new C54861xYa();

    private C54861xYa() {
    }

    public final java.util.List<AAPaymasterDataAndSignature> OLrzqt(@NotNull AAPaymasterAndTokenParams aAPaymasterAndTokenParams) {
        Intrinsics.checkNotNullParameter(aAPaymasterAndTokenParams, "");
        return xXV.KWHzl.AEQbTJ(aAPaymasterAndTokenParams);
    }

    public final java.util.List<AAPaymasterDataAndSignatureV7> KWHzl(@NotNull AAPaymasterAndTokenParamsV7 aAPaymasterAndTokenParamsV7) {
        Intrinsics.checkNotNullParameter(aAPaymasterAndTokenParamsV7, "");
        return xXV.KWHzl.EZpvd(aAPaymasterAndTokenParamsV7);
    }

    public final AAParseInitCode copydefault(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return xXV.KWHzl.AEQbTJ(str);
    }

    public final AAGenOriPaymasterTokenV7 AEQbTJ(@NotNull java.lang.String str, int i, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return xXV.KWHzl.copydefault(str, i, str2);
    }

    public final AAParsePaymasterDataV7 AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return xXV.KWHzl.copydefault(str);
    }
}
