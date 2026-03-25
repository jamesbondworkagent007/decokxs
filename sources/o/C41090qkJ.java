package o;

import com.okinc.market.ext.UpDownColor;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qkJ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C41090qkJ implements InterfaceC40516qYt {
    public final LinkedHashMap<java.lang.String, java.util.List<ActionBar>> AEQbTJ;
    public final int EZpvd;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C41090qkJ() {
        this(0, null, 3, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.qkJ */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C41090qkJ copy$default(C41090qkJ c41090qkJ, int i, LinkedHashMap linkedHashMap, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = c41090qkJ.EZpvd;
        }
        if ((i2 & 2) != 0) {
            linkedHashMap = c41090qkJ.AEQbTJ;
        }
        return c41090qkJ.AEQbTJ(i, linkedHashMap);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C41090qkJ AEQbTJ(int i, @NotNull LinkedHashMap<java.lang.String, java.util.List<ActionBar>> linkedHashMap) {
        Intrinsics.checkNotNullParameter(linkedHashMap, "");
        return new C41090qkJ(i, linkedHashMap);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LinkedHashMap<java.lang.String, java.util.List<ActionBar>> EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int copydefault() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C41090qkJ)) {
            return false;
        }
        C41090qkJ c41090qkJ = (C41090qkJ) obj;
        return this.EZpvd == c41090qkJ.EZpvd && Intrinsics.EZpvd(this.AEQbTJ, c41090qkJ.AEQbTJ);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (java.lang.Integer.hashCode(this.EZpvd) * 31) + this.AEQbTJ.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "MarketDiscoverCategoryTopMoversVo(size=" + this.EZpvd + ", map=" + this.AEQbTJ + ")";
    }

    public C41090qkJ(int i, @NotNull LinkedHashMap<java.lang.String, java.util.List<ActionBar>> linkedHashMap) {
        Intrinsics.checkNotNullParameter(linkedHashMap, "");
        this.EZpvd = i;
        this.AEQbTJ = linkedHashMap;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000e: CONSTRUCTOR 
  (wrap:int:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r1v0 int))
  (wrap:java.util.LinkedHashMap:?: TERNARY null = ((wrap:int:0x0005: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.LinkedHashMap:0x000b: CONSTRUCTOR  A[MD:():void (c), WRAPPED] (LINE:8) call: java.util.LinkedHashMap.<init>():void type: CONSTRUCTOR) : (r2v0 java.util.LinkedHashMap))
 A[MD:(int, java.util.LinkedHashMap<java.lang.String, java.util.List<o.qkJ$ActionBar>>):void (m)] (LINE:6) call: o.qkJ.<init>(int, java.util.LinkedHashMap):void type: THIS */
    public /* synthetic */ C41090qkJ(int i, LinkedHashMap linkedHashMap, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? new LinkedHashMap() : linkedHashMap);
    }

    @Override // o.InterfaceC40516qYt
    public boolean onCompareItems(@NotNull InterfaceC40516qYt interfaceC40516qYt) {
        Intrinsics.checkNotNullParameter(interfaceC40516qYt, "");
        return (interfaceC40516qYt instanceof C41090qkJ) && Intrinsics.EZpvd(this, interfaceC40516qYt);
    }

    @Override // o.InterfaceC40516qYt
    public boolean onCompareContents(@NotNull InterfaceC40516qYt interfaceC40516qYt) {
        Intrinsics.checkNotNullParameter(interfaceC40516qYt, "");
        return Intrinsics.EZpvd(interfaceC40516qYt, this);
    }

    /* JADX INFO: renamed from: o.qkJ$ActionBar */
    public static final class ActionBar {
        public int AEQbTJ;
        public final java.lang.String AYXKKw;
        public final java.lang.String AhwBna;
        public final UpDownColor AkhnZx;
        public int DbNXlk;
        public final java.lang.String EZpvd;
        public final float KWHzl;
        public java.lang.String OLrzqt;
        public final float copydefault;
        public boolean djBIcL;
        public final float ejfBZ;
        public final float fIwbmz;
        public boolean fetchVPNInfo;
        public final java.lang.String gEmmrt;
        public final int isConnected;
        public final int valueOf;
        public java.lang.String values;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final float AEQbTJ() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AYXKKw() {
            return this.gEmmrt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AhwBna() {
            return this.AhwBna;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final float DbNXlk() {
            return this.ejfBZ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String EZpvd() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int KWHzl() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(boolean z) {
            this.djBIcL = z;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String OLrzqt() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(int i) {
            this.AEQbTJ = i;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.OLrzqt = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final float copydefault() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ActionBar copydefault(int i, @NotNull java.lang.String str, @NotNull java.lang.String str2, int i2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, @NotNull UpDownColor upDownColor, @NotNull java.lang.String str6, float f, float f2, float f3, float f4, int i3, boolean z, boolean z2, int i4) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            Intrinsics.checkNotNullParameter(str5, "");
            Intrinsics.checkNotNullParameter(upDownColor, "");
            Intrinsics.checkNotNullParameter(str6, "");
            return new ActionBar(i, str, str2, i2, str3, str4, str5, upDownColor, str6, f, f2, f3, f4, i3, z, z2, i4);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(int i) {
            this.DbNXlk = i;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(boolean z) {
            this.fetchVPNInfo = z;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String djBIcL() {
            return this.values;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ActionBar)) {
                return false;
            }
            ActionBar actionBar = (ActionBar) obj;
            return this.isConnected == actionBar.isConnected && Intrinsics.EZpvd((java.lang.Object) this.gEmmrt, (java.lang.Object) actionBar.gEmmrt) && Intrinsics.EZpvd((java.lang.Object) this.AhwBna, (java.lang.Object) actionBar.AhwBna) && this.valueOf == actionBar.valueOf && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) actionBar.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) actionBar.EZpvd) && Intrinsics.EZpvd((java.lang.Object) this.values, (java.lang.Object) actionBar.values) && this.AkhnZx == actionBar.AkhnZx && Intrinsics.EZpvd((java.lang.Object) this.AYXKKw, (java.lang.Object) actionBar.AYXKKw) && java.lang.Float.compare(this.fIwbmz, actionBar.fIwbmz) == 0 && java.lang.Float.compare(this.copydefault, actionBar.copydefault) == 0 && java.lang.Float.compare(this.ejfBZ, actionBar.ejfBZ) == 0 && java.lang.Float.compare(this.KWHzl, actionBar.KWHzl) == 0 && this.AEQbTJ == actionBar.AEQbTJ && this.djBIcL == actionBar.djBIcL && this.fetchVPNInfo == actionBar.fetchVPNInfo && this.DbNXlk == actionBar.DbNXlk;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean fetchVPNInfo() {
            return this.fetchVPNInfo;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String gEmmrt() {
            return this.AYXKKw;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((((((((((((((((((((((((((((((java.lang.Integer.hashCode(this.isConnected) * 31) + this.gEmmrt.hashCode()) * 31) + this.AhwBna.hashCode()) * 31) + java.lang.Integer.hashCode(this.valueOf)) * 31) + this.OLrzqt.hashCode()) * 31) + this.EZpvd.hashCode()) * 31) + this.values.hashCode()) * 31) + this.AkhnZx.hashCode()) * 31) + this.AYXKKw.hashCode()) * 31) + java.lang.Float.hashCode(this.fIwbmz)) * 31) + java.lang.Float.hashCode(this.copydefault)) * 31) + java.lang.Float.hashCode(this.ejfBZ)) * 31) + java.lang.Float.hashCode(this.KWHzl)) * 31) + java.lang.Integer.hashCode(this.AEQbTJ)) * 31) + java.lang.Boolean.hashCode(this.djBIcL)) * 31) + java.lang.Boolean.hashCode(this.fetchVPNInfo)) * 31) + java.lang.Integer.hashCode(this.DbNXlk);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "CryptoVo(position=" + this.isConnected + ", instId=" + this.gEmmrt + ", instType=" + this.AhwBna + ", index=" + this.valueOf + ", iconUrl=" + this.OLrzqt + ", coinName=" + this.EZpvd + ", profit=" + this.values + ", profitColor=" + this.AkhnZx + ", lastPrice=" + this.AYXKKw + ", topLeftRadius=" + this.fIwbmz + ", bottomLeftRadius=" + this.copydefault + ", topRightRadius=" + this.ejfBZ + ", bottomRightRadius=" + this.KWHzl + ", height=" + this.AEQbTJ + ", isVisible=" + this.djBIcL + ", showPrice=" + this.fetchVPNInfo + ", style=" + this.DbNXlk + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int valueOf() {
            return this.isConnected;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final float values() {
            return this.fIwbmz;
        }

        public ActionBar(int i, @NotNull java.lang.String str, @NotNull java.lang.String str2, int i2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, @NotNull UpDownColor upDownColor, @NotNull java.lang.String str6, float f, float f2, float f3, float f4, int i3, boolean z, boolean z2, int i4) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            Intrinsics.checkNotNullParameter(str5, "");
            Intrinsics.checkNotNullParameter(upDownColor, "");
            Intrinsics.checkNotNullParameter(str6, "");
            this.isConnected = i;
            this.gEmmrt = str;
            this.AhwBna = str2;
            this.valueOf = i2;
            this.OLrzqt = str3;
            this.EZpvd = str4;
            this.values = str5;
            this.AkhnZx = upDownColor;
            this.AYXKKw = str6;
            this.fIwbmz = f;
            this.copydefault = f2;
            this.ejfBZ = f3;
            this.KWHzl = f4;
            this.AEQbTJ = i3;
            this.djBIcL = z;
            this.fetchVPNInfo = z2;
            this.DbNXlk = i4;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0098: CONSTRUCTOR 
  (wrap:int:?: TERNARY null = ((wrap:int:0x0002: ARITH (r39v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r22v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r39v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r23v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0015: ARITH (r39v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r24v0 java.lang.String))
  (r25v0 int)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001d: ARITH (r39v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r26v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0025: ARITH (r39v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("--") : (r27v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002f: ARITH (r39v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("--") : (r28v0 java.lang.String))
  (wrap:com.okinc.market.ext.UpDownColor:?: TERNARY null = ((wrap:int:0x0037: ARITH (r39v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x003d: SGET  A[WRAPPED] (LINE:27) com.okinc.market.ext.UpDownColor.NEUTRAL com.okinc.market.ext.UpDownColor) : (r29v0 com.okinc.market.ext.UpDownColor))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0041: ARITH (r39v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("--") : (r30v0 java.lang.String))
  (wrap:float:?: TERNARY null = ((wrap:int:0x0049: ARITH (r39v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (0.0f float) : (r31v0 float))
  (wrap:float:?: TERNARY null = ((wrap:int:0x0052: ARITH (r39v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (0.0f float) : (r32v0 float))
  (wrap:float:?: TERNARY null = ((wrap:int:0x005a: ARITH (r39v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (0.0f float) : (r33v0 float))
  (wrap:float:?: TERNARY null = ((wrap:int:0x0062: ARITH (r39v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (0.0f float) : (r34v0 float))
  (wrap:int:?: TERNARY null = ((wrap:int:0x006b: ARITH (r39v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r35v0 int))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0074: ARITH (r39v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? false : (r36v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0080: ARITH (32768 int) & (r39v0 int) A[WRAPPED]) != (0 int)) ? true : (r37v0 boolean))
  (wrap:int:?: TERNARY null = ((wrap:int:0x008b: ARITH (r39v0 int) & (65536 int) A[WRAPPED]) != (0 int)) ? (-1 int) : (r38v0 int))
 A[MD:(int, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, com.okinc.market.ext.UpDownColor, java.lang.String, float, float, float, float, int, boolean, boolean, int):void (m)] (LINE:19) call: o.qkJ.ActionBar.<init>(int, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, com.okinc.market.ext.UpDownColor, java.lang.String, float, float, float, float, int, boolean, boolean, int):void type: THIS */
        public /* synthetic */ ActionBar(int i, java.lang.String str, java.lang.String str2, int i2, java.lang.String str3, java.lang.String str4, java.lang.String str5, UpDownColor upDownColor, java.lang.String str6, float f, float f2, float f3, float f4, int i3, boolean z, boolean z2, int i4, int i5, DefaultConstructorMarker defaultConstructorMarker) {
            this((i5 & 1) != 0 ? 0 : i, (i5 & 2) != 0 ? "" : str, (i5 & 4) != 0 ? "" : str2, i2, (i5 & 16) != 0 ? "" : str3, (i5 & 32) != 0 ? "--" : str4, (i5 & 64) != 0 ? "--" : str5, (i5 & 128) != 0 ? UpDownColor.NEUTRAL : upDownColor, (i5 & 256) != 0 ? "--" : str6, (i5 & 512) != 0 ? 0.0f : f, (i5 & 1024) != 0 ? 0.0f : f2, (i5 & 2048) != 0 ? 0.0f : f3, (i5 & 4096) != 0 ? 0.0f : f4, (i5 & 8192) != 0 ? 0 : i3, (i5 & 16384) != 0 ? false : z, (32768 & i5) != 0 ? true : z2, (i5 & 65536) != 0 ? -1 : i4);
        }
    }
}
