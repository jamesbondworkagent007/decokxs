package o;

import com.okinc.components.security.api.ProtectionMode;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.miC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C32678miC {
    public static final C32678miC AEQbTJ;
    public static final C32678miC EZpvd;
    public static final C32678miC copydefault;
    public final ProtectionMode OLrzqt;
    public final ProtectionMode djBIcL;
    public final ProtectionMode gEmmrt;
    public static final ActionBar Companion = new ActionBar(null);
    public static final C32678miC KWHzl = new C32678miC(null, null, null, 7, null);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C32678miC() {
        this(null, null, null, 7, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C32678miC copy$default(C32678miC c32678miC, ProtectionMode protectionMode, ProtectionMode protectionMode2, ProtectionMode protectionMode3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            protectionMode = c32678miC.OLrzqt;
        }
        if ((i & 2) != 0) {
            protectionMode2 = c32678miC.gEmmrt;
        }
        if ((i & 4) != 0) {
            protectionMode3 = c32678miC.djBIcL;
        }
        return c32678miC.AEQbTJ(protectionMode, protectionMode2, protectionMode3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ProtectionMode AEQbTJ() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C32678miC AEQbTJ(@NotNull ProtectionMode protectionMode, @NotNull ProtectionMode protectionMode2, @NotNull ProtectionMode protectionMode3) {
        Intrinsics.checkNotNullParameter(protectionMode, "");
        Intrinsics.checkNotNullParameter(protectionMode2, "");
        Intrinsics.checkNotNullParameter(protectionMode3, "");
        return new C32678miC(protectionMode, protectionMode2, protectionMode3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ProtectionMode EZpvd() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ProtectionMode copydefault() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C32678miC)) {
            return false;
        }
        C32678miC c32678miC = (C32678miC) obj;
        return this.OLrzqt == c32678miC.OLrzqt && this.gEmmrt == c32678miC.gEmmrt && this.djBIcL == c32678miC.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.OLrzqt.hashCode() * 31) + this.gEmmrt.hashCode()) * 31) + this.djBIcL.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "SecurityProtectionConfig(accessibilityMode=" + this.OLrzqt + ", touchEventMode=" + this.gEmmrt + ", viewOverlayMode=" + this.djBIcL + ")";
    }

    public C32678miC(@NotNull ProtectionMode protectionMode, @NotNull ProtectionMode protectionMode2, @NotNull ProtectionMode protectionMode3) {
        Intrinsics.checkNotNullParameter(protectionMode, "");
        Intrinsics.checkNotNullParameter(protectionMode2, "");
        Intrinsics.checkNotNullParameter(protectionMode3, "");
        this.OLrzqt = protectionMode;
        this.gEmmrt = protectionMode2;
        this.djBIcL = protectionMode3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0012: CONSTRUCTOR 
  (wrap:com.okinc.components.security.api.ProtectionMode:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:com.okinc.components.security.api.ProtectionMode:0x0004: SGET  A[WRAPPED] (LINE:10) com.okinc.components.security.api.ProtectionMode.DISABLED com.okinc.components.security.api.ProtectionMode) : (r1v0 com.okinc.components.security.api.ProtectionMode))
  (wrap:com.okinc.components.security.api.ProtectionMode:?: TERNARY null = ((wrap:int:0x0006: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:com.okinc.components.security.api.ProtectionMode:0x000a: SGET  A[WRAPPED] (LINE:15) com.okinc.components.security.api.ProtectionMode.DISABLED com.okinc.components.security.api.ProtectionMode) : (r2v0 com.okinc.components.security.api.ProtectionMode))
  (wrap:com.okinc.components.security.api.ProtectionMode:?: TERNARY null = ((wrap:int:0x000c: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:com.okinc.components.security.api.ProtectionMode:0x0010: SGET  A[WRAPPED] (LINE:20) com.okinc.components.security.api.ProtectionMode.DISABLED com.okinc.components.security.api.ProtectionMode) : (r3v0 com.okinc.components.security.api.ProtectionMode))
 A[MD:(com.okinc.components.security.api.ProtectionMode, com.okinc.components.security.api.ProtectionMode, com.okinc.components.security.api.ProtectionMode):void (m)] (LINE:6) call: o.miC.<init>(com.okinc.components.security.api.ProtectionMode, com.okinc.components.security.api.ProtectionMode, com.okinc.components.security.api.ProtectionMode):void type: THIS */
    public /* synthetic */ C32678miC(ProtectionMode protectionMode, ProtectionMode protectionMode2, ProtectionMode protectionMode3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? ProtectionMode.DISABLED : protectionMode, (i & 2) != 0 ? ProtectionMode.DISABLED : protectionMode2, (i & 4) != 0 ? ProtectionMode.DISABLED : protectionMode3);
    }

    /* JADX INFO: renamed from: o.miC$ActionBar */
    /* JADX INFO: loaded from: classes18.dex */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.miC.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    static {
        ProtectionMode protectionMode = ProtectionMode.BLOCKING;
        C32678miC c32678miC = new C32678miC(protectionMode, protectionMode, protectionMode);
        copydefault = c32678miC;
        ProtectionMode protectionMode2 = ProtectionMode.DETECTION_ONLY;
        AEQbTJ = new C32678miC(protectionMode2, protectionMode2, protectionMode2);
        EZpvd = c32678miC;
    }
}
