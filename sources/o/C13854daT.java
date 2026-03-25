package o;

import com.okinc.business.defi.biz.constant.HardwareType;
import com.okinc.business.defi.biz.database.wallet.entity.HardwareInfoEntity;
import com.okinc.business.defi.biz.model.wallet.OneKeyAccountInfo;
import com.okinc.business.defi.biz.model.wallet.OneKeyHardwareData;
import com.okinc.wallet.hardware.api.keystone.KeystoneMultiAccount;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.DeserializationStrategy;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.daT, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C13854daT {
    public java.lang.String AEQbTJ;
    public HardwareType AYXKKw;
    public java.lang.String EZpvd;
    public java.lang.String KWHzl;
    public long OLrzqt;
    public java.lang.String copydefault;
    public java.lang.String gEmmrt;
    public java.lang.String valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C13854daT() {
        this(null, null, null, null, null, null, 0L, null, 255, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C13854daT AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull HardwareType hardwareType, @NotNull java.lang.String str5, long j, @NotNull java.lang.String str6) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(hardwareType, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        return new C13854daT(str, str2, str3, str4, hardwareType, str5, j, str6);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AYXKKw() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final HardwareType KWHzl() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.gEmmrt = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13854daT)) {
            return false;
        }
        C13854daT c13854daT = (C13854daT) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.valueOf, (java.lang.Object) c13854daT.valueOf) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) c13854daT.copydefault) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) c13854daT.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) c13854daT.EZpvd) && this.AYXKKw == c13854daT.AYXKKw && Intrinsics.EZpvd((java.lang.Object) this.gEmmrt, (java.lang.Object) c13854daT.gEmmrt) && this.OLrzqt == c13854daT.OLrzqt && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) c13854daT.AEQbTJ);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((this.valueOf.hashCode() * 31) + this.copydefault.hashCode()) * 31) + this.KWHzl.hashCode()) * 31) + this.EZpvd.hashCode()) * 31) + this.AYXKKw.hashCode()) * 31) + this.gEmmrt.hashCode()) * 31) + java.lang.Long.hashCode(this.OLrzqt)) * 31) + this.AEQbTJ.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "HardwareInfo(hardwareUniqueId=" + this.valueOf + ", hardwarePassphraseId=" + this.copydefault + ", hardwareName=" + this.KWHzl + ", hardwareSystem=" + this.EZpvd + ", hardwareType=" + this.AYXKKw + ", rootWalletId=" + this.gEmmrt + ", createAt=" + this.OLrzqt + ", hardwareData=" + this.AEQbTJ + ")";
    }

    public C13854daT(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull HardwareType hardwareType, @NotNull java.lang.String str5, long j, @NotNull java.lang.String str6) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(hardwareType, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        this.valueOf = str;
        this.copydefault = str2;
        this.KWHzl = str3;
        this.EZpvd = str4;
        this.AYXKKw = hardwareType;
        this.gEmmrt = str5;
        this.OLrzqt = j;
        this.AEQbTJ = str6;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x004d: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r20v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r11v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r20v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r12v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0012: ARITH (r20v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r13v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0019: ARITH (r20v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r14v0 java.lang.String))
  (wrap:com.okinc.business.defi.biz.constant.HardwareType:?: TERNARY null = ((wrap:int:0x0020: ARITH (r20v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0024: SGET  A[WRAPPED] (LINE:14) com.okinc.business.defi.biz.constant.HardwareType.LedgerNanoX com.okinc.business.defi.biz.constant.HardwareType) : (r15v0 com.okinc.business.defi.biz.constant.HardwareType))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0028: ARITH (r20v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r16v0 java.lang.String))
  (wrap:long:?: TERNARY null = ((wrap:int:0x0030: ARITH (r20v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r17v0 long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0039: ARITH (r20v0 int) & (128 int) A[WRAPPED]) == (0 int)) ? (r19v0 java.lang.String) : (""))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.business.defi.biz.constant.HardwareType, java.lang.String, long, java.lang.String):void (m)] (LINE:9) call: o.daT.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.business.defi.biz.constant.HardwareType, java.lang.String, long, java.lang.String):void type: THIS */
    public /* synthetic */ C13854daT(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, HardwareType hardwareType, java.lang.String str5, long j, java.lang.String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? HardwareType.LedgerNanoX : hardwareType, (i & 32) != 0 ? "" : str5, (i & 64) != 0 ? 0L : j, (i & 128) == 0 ? str6 : "");
    }

    public final HardwareInfoEntity EZpvd() {
        return new HardwareInfoEntity(this.valueOf, this.copydefault, this.KWHzl, this.EZpvd, this.AYXKKw.ordinal(), this.gEmmrt, this.OLrzqt, this.AEQbTJ);
    }

    public final void EZpvd(@NotNull KeystoneMultiAccount keystoneMultiAccount) {
        Intrinsics.checkNotNullParameter(keystoneMultiAccount, "");
        this.AEQbTJ = KWHzl(C33489mxS.KWHzl.KWHzl(KeystoneMultiAccount.Companion.serializer(), keystoneMultiAccount));
    }

    public final KeystoneMultiAccount AhwBna() {
        return (KeystoneMultiAccount) C33489mxS.KWHzl.OLrzqt((DeserializationStrategy) KeystoneMultiAccount.Companion.serializer(), AEQbTJ(this.AEQbTJ));
    }

    public final void KWHzl(@NotNull OneKeyHardwareData oneKeyHardwareData) {
        Intrinsics.checkNotNullParameter(oneKeyHardwareData, "");
        this.AEQbTJ = KWHzl(C33489mxS.KWHzl.KWHzl(OneKeyHardwareData.Companion.serializer(), oneKeyHardwareData));
    }

    public final java.util.List<OneKeyAccountInfo> djBIcL() {
        java.util.List<OneKeyAccountInfo> accountInfo = gEmmrt().getAccountInfo();
        return accountInfo == null ? yDY.AhwBna() : accountInfo;
    }

    public final java.lang.String valueOf() {
        java.lang.String deviceId = gEmmrt().getDeviceId();
        return deviceId == null ? "" : deviceId;
    }

    public final OneKeyHardwareData gEmmrt() {
        return (OneKeyHardwareData) C33489mxS.KWHzl.OLrzqt((DeserializationStrategy) OneKeyHardwareData.Companion.serializer(), AEQbTJ(this.AEQbTJ));
    }

    public final java.lang.String KWHzl(java.lang.String str) {
        return xZW.EZpvd.EZpvd(str);
    }

    public final java.lang.String AEQbTJ(java.lang.String str) {
        return xZW.EZpvd.copydefault(str);
    }
}
