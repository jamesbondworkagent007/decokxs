package o;

import com.okinc.business.defi.biz.model.ChainAddress;
import com.okinc.business.defi.wallet.eip7702.data.model.EIP7702WalletStatus;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC9738bbJ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fQs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C17745fQs {
    public final long AEQbTJ;
    public final boolean AYXKKw;
    public final EIP7702WalletStatus AhwBna;
    public final long EZpvd;
    public final long KWHzl;
    public final boolean OLrzqt;
    public final java.lang.String copydefault;
    public final boolean djBIcL;
    public final java.lang.String gEmmrt;
    public final AbstractC12782ctV isConnected;
    public final boolean valueOf;
    public final java.lang.String values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long AYXKKw() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AhwBna() {
        return this.values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AbstractC12782ctV DbNXlk() {
        return this.isConnected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long copydefault() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String djBIcL() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean gEmmrt() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isConnected() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean valueOf() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean values() {
        long j = this.KWHzl;
        return j == 0 || j == 70000061;
    }

    public C17745fQs(@NotNull AbstractC12782ctV abstractC12782ctV, long j, @NotNull java.lang.String str, boolean z, java.lang.String str2, @NotNull java.lang.String str3, boolean z2, boolean z3, long j2, long j3, @NotNull EIP7702WalletStatus eIP7702WalletStatus, boolean z4) {
        Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(eIP7702WalletStatus, "");
        this.isConnected = abstractC12782ctV;
        this.KWHzl = j;
        this.values = str;
        this.AYXKKw = z;
        this.copydefault = str2;
        this.gEmmrt = str3;
        this.valueOf = z2;
        this.OLrzqt = z3;
        this.EZpvd = j2;
        this.AEQbTJ = j3;
        this.AhwBna = eIP7702WalletStatus;
        this.djBIcL = z4;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x004e: CONSTRUCTOR 
  (r19v0 o.ctV)
  (r20v0 long)
  (r22v0 java.lang.String)
  (r23v0 boolean)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r34v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x000a: INVOKE (r19v0 o.ctV) VIRTUAL call: o.ctV.AEQbTJ():java.lang.String A[MD:():java.lang.String (m), WRAPPED] (LINE:16)) : (r24v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000e: ARITH (r34v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x001e: INVOKE 
  (wrap:o.fEj:0x0014: INVOKE (wrap:o.fRA:0x0012: SGET  A[WRAPPED] (LINE:17) o.fRA.OLrzqt o.fRA) VIRTUAL call: o.fRA.EZpvd():o.fEj A[MD:():o.fEj (m), WRAPPED] (LINE:17))
  (r19v0 o.ctV)
 VIRTUAL call: o.fEj.copydefault(o.ctV):java.lang.String A[MD:(o.ctV):java.lang.String (m), WRAPPED] (LINE:17)) : (r25v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0024: ARITH (r34v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x002c: INVOKE (r19v0 o.ctV) VIRTUAL call: o.ctV.zuWLRA():boolean A[MD:():boolean (m), WRAPPED] (LINE:18)) : (r26v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0030: ARITH (r34v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0038: INVOKE (r19v0 o.ctV) VIRTUAL call: o.ctV.getFieldNames():boolean A[MD:():boolean (m), WRAPPED] (LINE:19)) : (r27v0 boolean))
  (r28v0 long)
  (r30v0 long)
  (r32v0 com.okinc.business.defi.wallet.eip7702.data.model.EIP7702WalletStatus)
  (r33v0 boolean)
 A[MD:(o.ctV, long, java.lang.String, boolean, java.lang.String, java.lang.String, boolean, boolean, long, long, com.okinc.business.defi.wallet.eip7702.data.model.EIP7702WalletStatus, boolean):void (m)] (LINE:11) call: o.fQs.<init>(o.ctV, long, java.lang.String, boolean, java.lang.String, java.lang.String, boolean, boolean, long, long, com.okinc.business.defi.wallet.eip7702.data.model.EIP7702WalletStatus, boolean):void type: THIS */
    public /* synthetic */ C17745fQs(AbstractC12782ctV abstractC12782ctV, long j, java.lang.String str, boolean z, java.lang.String str2, java.lang.String str3, boolean z2, boolean z3, long j2, long j3, EIP7702WalletStatus eIP7702WalletStatus, boolean z4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(abstractC12782ctV, j, str, z, (i & 16) != 0 ? abstractC12782ctV.AEQbTJ() : str2, (i & 32) != 0 ? fRA.OLrzqt.EZpvd().copydefault(abstractC12782ctV) : str3, (i & 64) != 0 ? abstractC12782ctV.zuWLRA() : z2, (i & 128) != 0 ? abstractC12782ctV.getFieldNames() : z3, j2, j3, eIP7702WalletStatus, z4);
    }

    public final java.lang.String KWHzl() {
        long j = this.KWHzl;
        if (j != Long.MIN_VALUE) {
            ChainAddress chainAddress = (ChainAddress) InterfaceC9738bbJ.StateListAnimator.addressFromRealChainId$default(this.isConnected, j, null, 2, null);
            java.lang.String address = chainAddress != null ? chainAddress.getAddress() : null;
            if (address != null) {
                return address;
            }
        }
        return "";
    }

    public final java.lang.String OLrzqt() {
        return this.KWHzl == Long.MIN_VALUE ? "" : C14079deg.getAddressStr$default(C14079deg.EZpvd, KWHzl(), false, 2, null);
    }
}
