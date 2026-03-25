package o;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import uniffi.RustBuffer;
import uniffi.UniffiRustCallStatus;
import uniffi.account.FfiConverterString;
import uniffi.account.FfiConverterTypePasskeyVerifyInfo;
import uniffi.account.UniffiLib;

/* JADX INFO: renamed from: o.zZo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C59056zZo {
    public static final int $stable = 8;
    public java.lang.String copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C59056zZo copy$default(C59056zZo c59056zZo, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = c59056zZo.copydefault;
        }
        return c59056zZo.AEQbTJ(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C59056zZo AEQbTJ(java.lang.String str) {
        return new C59056zZo(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C59056zZo) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) ((C59056zZo) obj).copydefault);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        java.lang.String str = this.copydefault;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public C59056zZo(java.lang.String str) {
        this.copydefault = str;
    }

    public java.lang.String toString() {
        return FfiConverterString.INSTANCE.lift2((RustBuffer.ByValue) C60173zxj.uniffiRustCall(C60230zyn.uniffiRustBuffer, new Function1() { // from class: o.zZm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C59056zZo.toString$lambda$0(this.OLrzqt, (UniffiRustCallStatus) obj);
            }
        }));
    }

    public static final RustBuffer.ByValue toString$lambda$0(C59056zZo c59056zZo, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_account_fn_method_passkeyverifyinfo_uniffi_trait_debug(FfiConverterTypePasskeyVerifyInfo.INSTANCE.lower2((java.lang.Object) c59056zZo), uniffiRustCallStatus);
    }
}
