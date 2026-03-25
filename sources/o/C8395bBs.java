package o;

import com.okinc.business.defi.api.model.tx.FeeType;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.bBs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C8395bBs extends C8394bBr implements InterfaceC9749bbU {
    public int DbNXlk;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC9749bbU
    public int copydefault() {
        return this.DbNXlk;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8395bBs(int i, @NotNull AbstractC8564bFB<?, ?> abstractC8564bFB, @NotNull FeeType feeType, @NotNull InterfaceC9731bbC interfaceC9731bbC, @NotNull java.lang.String str, boolean z, @NotNull java.lang.String str2, boolean z2, @NotNull C9745bbQ c9745bbQ, boolean z3, java.lang.CharSequence charSequence) {
        super(abstractC8564bFB, feeType, interfaceC9731bbC, str, z, str2, z2, c9745bbQ, z3, charSequence);
        Intrinsics.checkNotNullParameter(abstractC8564bFB, "");
        Intrinsics.checkNotNullParameter(feeType, "");
        Intrinsics.checkNotNullParameter(interfaceC9731bbC, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(c9745bbQ, "");
        this.DbNXlk = i;
    }
}
