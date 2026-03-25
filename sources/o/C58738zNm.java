package o;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.UniffiRustCallStatus;
import uniffi.account.FfiConverterString;
import uniffi.account.FfiConverterTypeNewDeviceSingleOtpState;
import uniffi.account.UniffiLib;

/* JADX INFO: renamed from: o.zNm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C58738zNm {
    public static final int $stable = 8;
    public AbstractC58950zVm AEQbTJ;
    public java.util.List<? extends AbstractC58950zVm> OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.zNm */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C58738zNm copy$default(C58738zNm c58738zNm, AbstractC58950zVm abstractC58950zVm, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            abstractC58950zVm = c58738zNm.AEQbTJ;
        }
        if ((i & 2) != 0) {
            list = c58738zNm.OLrzqt;
        }
        return c58738zNm.AEQbTJ(abstractC58950zVm, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C58738zNm AEQbTJ(@NotNull AbstractC58950zVm abstractC58950zVm, @NotNull java.util.List<? extends AbstractC58950zVm> list) {
        Intrinsics.checkNotNullParameter(abstractC58950zVm, "");
        Intrinsics.checkNotNullParameter(list, "");
        return new C58738zNm(abstractC58950zVm, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AbstractC58950zVm EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends o.zVm>, java.util.List<o.zVm> */
    public final java.util.List<AbstractC58950zVm> KWHzl() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C58738zNm)) {
            return false;
        }
        C58738zNm c58738zNm = (C58738zNm) obj;
        return Intrinsics.EZpvd(this.AEQbTJ, c58738zNm.AEQbTJ) && Intrinsics.EZpvd(this.OLrzqt, c58738zNm.OLrzqt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.AEQbTJ.hashCode() * 31) + this.OLrzqt.hashCode();
    }

    public C58738zNm(@NotNull AbstractC58950zVm abstractC58950zVm, @NotNull java.util.List<? extends AbstractC58950zVm> list) {
        Intrinsics.checkNotNullParameter(abstractC58950zVm, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.AEQbTJ = abstractC58950zVm;
        this.OLrzqt = list;
    }

    public java.lang.String toString() {
        return FfiConverterString.INSTANCE.lift2((RustBuffer.ByValue) C60173zxj.uniffiRustCall(C60230zyn.uniffiRustBuffer, new Function1() { // from class: o.zNp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C58738zNm.toString$lambda$0(this.OLrzqt, (UniffiRustCallStatus) obj);
            }
        }));
    }

    public static final RustBuffer.ByValue toString$lambda$0(C58738zNm c58738zNm, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_account_fn_method_newdevicesingleotpstate_uniffi_trait_debug(FfiConverterTypeNewDeviceSingleOtpState.INSTANCE.lower2((java.lang.Object) c58738zNm), uniffiRustCallStatus);
    }
}
