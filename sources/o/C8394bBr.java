package o;

import com.okinc.business.defi.api.model.tx.FeeType;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.bBr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C8394bBr implements InterfaceC9752bbX {
    public java.lang.String AEQbTJ;
    public java.lang.String AYXKKw;
    public boolean AhwBna;
    public C9745bbQ EZpvd;
    public final boolean KWHzl;
    public final boolean OLrzqt;
    public InterfaceC9731bbC copydefault;
    public java.lang.CharSequence djBIcL;
    public final FeeType gEmmrt;
    public final AbstractC8564bFB<?, ?> valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC9752bbX
    public java.lang.String AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC9752bbX
    public FeeType AYXKKw() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC9752bbX
    public java.lang.CharSequence AhwBna() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC9752bbX
    public InterfaceC9731bbC EZpvd() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC9752bbX
    public C9745bbQ KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC9752bbX
    public java.lang.String OLrzqt() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC9752bbX
    public boolean gEmmrt() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC9752bbX
    public boolean h_() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AbstractC8564bFB<?, ?> valueOf() {
        return this.valueOf;
    }

    public C8394bBr(@NotNull AbstractC8564bFB<?, ?> abstractC8564bFB, @NotNull FeeType feeType, @NotNull InterfaceC9731bbC interfaceC9731bbC, @NotNull java.lang.String str, boolean z, @NotNull java.lang.String str2, boolean z2, @NotNull C9745bbQ c9745bbQ, boolean z3, java.lang.CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(abstractC8564bFB, "");
        Intrinsics.checkNotNullParameter(feeType, "");
        Intrinsics.checkNotNullParameter(interfaceC9731bbC, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(c9745bbQ, "");
        this.valueOf = abstractC8564bFB;
        this.gEmmrt = feeType;
        this.copydefault = interfaceC9731bbC;
        this.AEQbTJ = str;
        this.KWHzl = z;
        this.AYXKKw = str2;
        this.OLrzqt = z2;
        this.EZpvd = c9745bbQ;
        this.AhwBna = z3;
        this.djBIcL = charSequence;
    }

    @Override // o.InterfaceC9752bbX
    public java.lang.String EZpvd(@NotNull java.lang.String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        return AbstractC8426bCW.formatToFeeCoinAmount$default(this.valueOf.QKudOq(), str, false, z, false, 10, null);
    }

    @Override // o.InterfaceC9752bbX
    public java.lang.String KWHzl(@NotNull java.lang.String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        return AbstractC8426bCW.formatToFeeCurrencyAmount$default(this.valueOf.QKudOq(), str, false, false, z, 6, null);
    }
}
