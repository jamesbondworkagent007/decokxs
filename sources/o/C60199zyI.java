package o;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.UniffiRustCallStatus;
import uniffi.account.FfiConverterString;
import uniffi.account.FfiConverterTypeAccountsState;
import uniffi.account.UniffiLib;

/* JADX INFO: renamed from: o.zyI, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C60199zyI {
    public static final int $stable = 8;
    public java.util.List<? extends AbstractC3251AiS> AEQbTJ;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.zyI */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C60199zyI copy$default(C60199zyI c60199zyI, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            list = c60199zyI.AEQbTJ;
        }
        return c60199zyI.copydefault(list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends o.AiS>, java.util.List<o.AiS> */
    public final java.util.List<AbstractC3251AiS> OLrzqt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C60199zyI copydefault(@NotNull java.util.List<? extends AbstractC3251AiS> list) {
        Intrinsics.checkNotNullParameter(list, "");
        return new C60199zyI(list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C60199zyI) && Intrinsics.EZpvd(this.AEQbTJ, ((C60199zyI) obj).AEQbTJ);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return this.AEQbTJ.hashCode();
    }

    public C60199zyI(@NotNull java.util.List<? extends AbstractC3251AiS> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.AEQbTJ = list;
    }

    public java.lang.String toString() {
        return FfiConverterString.INSTANCE.lift2((RustBuffer.ByValue) C60173zxj.uniffiRustCall(C60230zyn.uniffiRustBuffer, new Function1() { // from class: o.zyF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C60199zyI.toString$lambda$0(this.KWHzl, (UniffiRustCallStatus) obj);
            }
        }));
    }

    public static final RustBuffer.ByValue toString$lambda$0(C60199zyI c60199zyI, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_account_fn_method_accountsstate_uniffi_trait_debug(FfiConverterTypeAccountsState.INSTANCE.lower2((java.lang.Object) c60199zyI), uniffiRustCallStatus);
    }
}
