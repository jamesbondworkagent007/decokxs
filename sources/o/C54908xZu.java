package o;

import com.okinc.wallet.core.mpc.HDWalletCoin;
import com.okinc.wallet.core.mpc.WalletAddressList;
import com.okinc.wallet.core.wallet.KeystoneAddressInfo;
import com.okinc.wallet.core.wallet.KeystonePubKeyInfo;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xZu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C54908xZu {
    public static final C54908xZu AEQbTJ = new C54908xZu();

    private C54908xZu() {
    }

    public final java.util.List<WalletAddressList> EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.util.List<HDWalletCoin> list, @NotNull java.lang.String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return xXV.KWHzl.KWHzl(str, str2, list, str3);
    }

    public final WalletAddressList KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, long j, long j2, int i, int i2, @NotNull java.lang.String str3, boolean z, boolean z2, @NotNull java.lang.String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        return xXV.KWHzl.copydefault(str, str2, j, j2, i, i2, str3, z, z2, str4);
    }

    public final WalletAddressList KWHzl(@NotNull java.lang.String str, long j, long j2, int i, @NotNull java.lang.String str2, boolean z, @NotNull java.lang.String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return xXV.KWHzl.AEQbTJ(str, j, j2, i, str2, z, str3);
    }

    public final java.util.List<KeystoneAddressInfo> copydefault(@NotNull java.util.List<KeystonePubKeyInfo> list) {
        Intrinsics.checkNotNullParameter(list, "");
        return xXV.KWHzl.KWHzl(list);
    }
}
