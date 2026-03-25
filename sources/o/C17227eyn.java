package o;

import com.okinc.business.defi.wallet.debug.WalletDebugSettingType;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.eyn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C17227eyn {
    public final java.lang.String EZpvd;
    public final WalletDebugSettingType OLrzqt;
    public final java.lang.String copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final WalletDebugSettingType EZpvd() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.EZpvd;
    }

    public C17227eyn(@NotNull WalletDebugSettingType walletDebugSettingType, @NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(walletDebugSettingType, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.OLrzqt = walletDebugSettingType;
        this.EZpvd = str;
        this.copydefault = str2;
    }
}
