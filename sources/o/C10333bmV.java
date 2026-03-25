package o;

import com.okinc.business.defi.biz.constant.WalletType;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.bmV, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C10333bmV {
    public static final C10333bmV EZpvd = new C10333bmV();

    private C10333bmV() {
    }

    public final boolean EZpvd(@NotNull WalletType walletType) {
        Intrinsics.checkNotNullParameter(walletType, "");
        return walletType == WalletType.HDWallet || walletType == WalletType.KeyWallet || walletType == WalletType.MPCWallet || walletType == WalletType.TonWallet;
    }
}
