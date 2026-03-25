package o;

import com.okinc.business.defi.biz.constant.WalletType;
import com.okinc.business.defi.biz.database.wallet.entity.RootWalletEntity;
import java.util.UUID;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ctZ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C12786ctZ {
    public java.lang.String AEQbTJ;
    public int EZpvd;
    public long KWHzl;
    public int OLrzqt;
    public java.lang.String copydefault;
    public WalletType gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C12786ctZ copy$default(C12786ctZ c12786ctZ, java.lang.String str, java.lang.String str2, WalletType walletType, long j, int i, int i2, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            str = c12786ctZ.copydefault;
        }
        if ((i3 & 2) != 0) {
            str2 = c12786ctZ.AEQbTJ;
        }
        java.lang.String str3 = str2;
        if ((i3 & 4) != 0) {
            walletType = c12786ctZ.gEmmrt;
        }
        WalletType walletType2 = walletType;
        if ((i3 & 8) != 0) {
            j = c12786ctZ.KWHzl;
        }
        long j2 = j;
        if ((i3 & 16) != 0) {
            i = c12786ctZ.EZpvd;
        }
        int i4 = i;
        if ((i3 & 32) != 0) {
            i2 = c12786ctZ.OLrzqt;
        }
        return c12786ctZ.EZpvd(str, str3, walletType2, j2, i4, i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C12786ctZ EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull WalletType walletType, long j, int i, int i2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(walletType, "");
        return new C12786ctZ(str, str2, walletType, j, i, i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(int i) {
        this.EZpvd = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long copydefault() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C12786ctZ)) {
            return false;
        }
        C12786ctZ c12786ctZ = (C12786ctZ) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) c12786ctZ.copydefault) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) c12786ctZ.AEQbTJ) && this.gEmmrt == c12786ctZ.gEmmrt && this.KWHzl == c12786ctZ.KWHzl && this.EZpvd == c12786ctZ.EZpvd && this.OLrzqt == c12786ctZ.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((this.copydefault.hashCode() * 31) + this.AEQbTJ.hashCode()) * 31) + this.gEmmrt.hashCode()) * 31) + java.lang.Long.hashCode(this.KWHzl)) * 31) + java.lang.Integer.hashCode(this.EZpvd)) * 31) + java.lang.Integer.hashCode(this.OLrzqt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "RootWalletEntityBean(id=" + this.copydefault + ", name=" + this.AEQbTJ + ", type=" + this.gEmmrt + ", createAt=" + this.KWHzl + ", sortIndex=" + this.EZpvd + ", createIndex=" + this.OLrzqt + ")";
    }

    public C12786ctZ(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull WalletType walletType, long j, int i, int i2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(walletType, "");
        this.copydefault = str;
        this.AEQbTJ = str2;
        this.gEmmrt = walletType;
        this.KWHzl = j;
        this.EZpvd = i;
        this.OLrzqt = i2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x002e: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r17v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x000c: INVOKE 
  (wrap:java.util.UUID:0x0004: INVOKE  STATIC call: java.util.UUID.randomUUID():java.util.UUID A[MD:():java.util.UUID (c), WRAPPED] (LINE:15))
 VIRTUAL call: java.util.UUID.toString():java.lang.String A[MD:():java.lang.String (c), WRAPPED] (LINE:15)) : (r10v0 java.lang.String))
  (r11v0 java.lang.String)
  (r12v0 com.okinc.business.defi.biz.constant.WalletType)
  (wrap:long:?: TERNARY null = ((wrap:int:0x000f: ARITH (r17v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0017: INVOKE  STATIC call: java.lang.System.currentTimeMillis():long A[MD:():long (c), WRAPPED] (LINE:18)) : (r13v0 long))
  (wrap:int:?: TERNARY null = ((wrap:int:0x001a: ARITH (r17v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r15v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0022: ARITH (r17v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (-1 int) : (r16v0 int))
 A[MD:(java.lang.String, java.lang.String, com.okinc.business.defi.biz.constant.WalletType, long, int, int):void (m)] (LINE:14) call: o.ctZ.<init>(java.lang.String, java.lang.String, com.okinc.business.defi.biz.constant.WalletType, long, int, int):void type: THIS */
    public /* synthetic */ C12786ctZ(java.lang.String str, java.lang.String str2, WalletType walletType, long j, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? UUID.randomUUID().toString() : str, str2, walletType, (i3 & 8) != 0 ? java.lang.System.currentTimeMillis() : j, (i3 & 16) != 0 ? 0 : i, (i3 & 32) != 0 ? -1 : i2);
    }

    public final RootWalletEntity KWHzl() {
        return new RootWalletEntity(this.copydefault, this.AEQbTJ, this.EZpvd, this.KWHzl, this.OLrzqt);
    }
}
