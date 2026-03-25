package o;

import androidx.appcompat.app.AppCompatActivity;
import com.okinc.business.defi.biz.constant.WalletType;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ezW, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C17263ezW {
    public final AppCompatActivity AEQbTJ;
    public final WalletType AYXKKw;
    public final WalletType EZpvd;
    public final boolean KWHzl;
    public final Function1<java.lang.String, Unit> OLrzqt;
    public final java.lang.String copydefault;
    public final java.lang.String valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: o.ezW */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C17263ezW copy$default(C17263ezW c17263ezW, AppCompatActivity appCompatActivity, java.lang.String str, WalletType walletType, WalletType walletType2, boolean z, java.lang.String str2, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            appCompatActivity = c17263ezW.AEQbTJ;
        }
        if ((i & 2) != 0) {
            str = c17263ezW.valueOf;
        }
        java.lang.String str3 = str;
        if ((i & 4) != 0) {
            walletType = c17263ezW.AYXKKw;
        }
        WalletType walletType3 = walletType;
        if ((i & 8) != 0) {
            walletType2 = c17263ezW.EZpvd;
        }
        WalletType walletType4 = walletType2;
        if ((i & 16) != 0) {
            z = c17263ezW.KWHzl;
        }
        boolean z2 = z;
        if ((i & 32) != 0) {
            str2 = c17263ezW.copydefault;
        }
        java.lang.String str4 = str2;
        if ((i & 64) != 0) {
            function1 = c17263ezW.OLrzqt;
        }
        return c17263ezW.KWHzl(appCompatActivity, str3, walletType3, walletType4, z2, str4, function1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final WalletType AEQbTJ() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AYXKKw() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Function1<java.lang.String, Unit> EZpvd() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C17263ezW KWHzl(@NotNull AppCompatActivity appCompatActivity, @NotNull java.lang.String str, @NotNull WalletType walletType, WalletType walletType2, boolean z, java.lang.String str2, Function1<? super java.lang.String, Unit> function1) {
        Intrinsics.checkNotNullParameter(appCompatActivity, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(walletType, "");
        return new C17263ezW(appCompatActivity, str, walletType, walletType2, z, str2, function1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AppCompatActivity OLrzqt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final WalletType copydefault() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String djBIcL() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17263ezW)) {
            return false;
        }
        C17263ezW c17263ezW = (C17263ezW) obj;
        return Intrinsics.EZpvd(this.AEQbTJ, c17263ezW.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.valueOf, (java.lang.Object) c17263ezW.valueOf) && this.AYXKKw == c17263ezW.AYXKKw && this.EZpvd == c17263ezW.EZpvd && this.KWHzl == c17263ezW.KWHzl && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) c17263ezW.copydefault) && Intrinsics.EZpvd(this.OLrzqt, c17263ezW.OLrzqt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.AEQbTJ.hashCode();
        int iHashCode2 = this.valueOf.hashCode();
        int iHashCode3 = this.AYXKKw.hashCode();
        WalletType walletType = this.EZpvd;
        int iHashCode4 = walletType == null ? 0 : walletType.hashCode();
        int iHashCode5 = java.lang.Boolean.hashCode(this.KWHzl);
        java.lang.String str = this.copydefault;
        int iHashCode6 = str == null ? 0 : str.hashCode();
        Function1<java.lang.String, Unit> function1 = this.OLrzqt;
        return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + (function1 != null ? function1.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "WalletDeleteParams(activity=" + this.AEQbTJ + ", walletId=" + this.valueOf + ", type=" + this.AYXKKw + ", rootType=" + this.EZpvd + ", isNeedHandleJump=" + this.KWHzl + ", screenName=" + this.copydefault + ", onWalletDeleted=" + this.OLrzqt + ")";
    }

    /* JADX DEBUG: Multi-variable search result rejected for r8v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public C17263ezW(@NotNull AppCompatActivity appCompatActivity, @NotNull java.lang.String str, @NotNull WalletType walletType, WalletType walletType2, boolean z, java.lang.String str2, Function1<? super java.lang.String, Unit> function1) {
        Intrinsics.checkNotNullParameter(appCompatActivity, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(walletType, "");
        this.AEQbTJ = appCompatActivity;
        this.valueOf = str;
        this.AYXKKw = walletType;
        this.EZpvd = walletType2;
        this.KWHzl = z;
        this.copydefault = str2;
        this.OLrzqt = function1;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x001d: CONSTRUCTOR 
  (r11v0 androidx.appcompat.app.AppCompatActivity)
  (r12v0 java.lang.String)
  (r13v0 com.okinc.business.defi.biz.constant.WalletType)
  (wrap:com.okinc.business.defi.biz.constant.WalletType:?: TERNARY null = ((wrap:int:0x0000: ARITH (r18v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.defi.biz.constant.WalletType) : (r14v0 com.okinc.business.defi.biz.constant.WalletType))
  (r15v0 boolean)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0008: ARITH (r18v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r16v0 java.lang.String))
  (wrap:kotlin.jvm.functions.Function1:?: TERNARY null = ((wrap:int:0x0010: ARITH (r18v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null kotlin.jvm.functions.Function1) : (r17v0 kotlin.jvm.functions.Function1))
 A[MD:(androidx.appcompat.app.AppCompatActivity, java.lang.String, com.okinc.business.defi.biz.constant.WalletType, com.okinc.business.defi.biz.constant.WalletType, boolean, java.lang.String, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit>):void (m)] (LINE:11) call: o.ezW.<init>(androidx.appcompat.app.AppCompatActivity, java.lang.String, com.okinc.business.defi.biz.constant.WalletType, com.okinc.business.defi.biz.constant.WalletType, boolean, java.lang.String, kotlin.jvm.functions.Function1):void type: THIS */
    public /* synthetic */ C17263ezW(AppCompatActivity appCompatActivity, java.lang.String str, WalletType walletType, WalletType walletType2, boolean z, java.lang.String str2, Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(appCompatActivity, str, walletType, (i & 8) != 0 ? null : walletType2, z, (i & 32) != 0 ? null : str2, (i & 64) != 0 ? null : function1);
    }
}
