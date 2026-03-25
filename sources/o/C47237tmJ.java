package o;

import com.okinc.okex.safety.NativeApi;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tmJ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C47237tmJ implements InterfaceC47238tmK {
    @yCM
    public C47237tmJ() {
    }

    @Override // o.InterfaceC47238tmK
    public java.lang.String OLrzqt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        java.lang.String strEncryptAccount = NativeApi.encryptAccount(str);
        Intrinsics.checkNotNullExpressionValue(strEncryptAccount, "");
        return strEncryptAccount;
    }

    @Override // o.InterfaceC47238tmK
    public java.lang.String KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        java.lang.String strDecryptAccount = NativeApi.decryptAccount(str);
        Intrinsics.checkNotNullExpressionValue(strDecryptAccount, "");
        return strDecryptAccount;
    }
}
