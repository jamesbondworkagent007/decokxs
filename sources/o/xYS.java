package o;

import com.okinc.wallet.core.mnemonic.MnemonicValidateResult;
import com.okinc.web3.security.bridge.MnemonicKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class xYS {
    public static final xYS copydefault = new xYS();

    private xYS() {
    }

    public static /* synthetic */ java.lang.String randomMnemonic$default(xYS xys, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = MnemonicKt.MnemonicLanguageEnglish;
        }
        return xys.KWHzl(str);
    }

    public final java.lang.String KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return xXV.KWHzl.uzCIH(str);
    }

    public final MnemonicValidateResult copydefault(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return xXV.KWHzl.zsXlph(str);
    }

    public final java.lang.String KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, long j, boolean z, int i, int i2, @NotNull java.lang.String str3, boolean z2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return xXV.KWHzl.EZpvd(str, str2, j, z, i, i2, str3, z2);
    }
}
