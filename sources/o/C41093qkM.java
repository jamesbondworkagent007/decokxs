package o;

import com.okinc.market.ext.UpDownColor;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qkM, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C41093qkM implements InterfaceC40516qYt {
    public final int EZpvd;
    public final LinkedHashMap<java.lang.String, java.util.List<ActionBar>> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C41093qkM() {
        this(0, null, 3, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.qkM */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C41093qkM copy$default(C41093qkM c41093qkM, int i, LinkedHashMap linkedHashMap, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = c41093qkM.EZpvd;
        }
        if ((i2 & 2) != 0) {
            linkedHashMap = c41093qkM.copydefault;
        }
        return c41093qkM.copydefault(i, linkedHashMap);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LinkedHashMap<java.lang.String, java.util.List<ActionBar>> copydefault() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C41093qkM copydefault(int i, LinkedHashMap<java.lang.String, java.util.List<ActionBar>> linkedHashMap) {
        return new C41093qkM(i, linkedHashMap);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C41093qkM)) {
            return false;
        }
        C41093qkM c41093qkM = (C41093qkM) obj;
        return this.EZpvd == c41093qkM.EZpvd && Intrinsics.EZpvd(this.copydefault, c41093qkM.copydefault);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = java.lang.Integer.hashCode(this.EZpvd);
        LinkedHashMap<java.lang.String, java.util.List<ActionBar>> linkedHashMap = this.copydefault;
        return (iHashCode * 31) + (linkedHashMap == null ? 0 : linkedHashMap.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "MarketDiscoverTrendingHotCategoriesVo(size=" + this.EZpvd + ", map=" + this.copydefault + ")";
    }

    public C41093qkM(int i, LinkedHashMap<java.lang.String, java.util.List<ActionBar>> linkedHashMap) {
        this.EZpvd = i;
        this.copydefault = linkedHashMap;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000e: CONSTRUCTOR 
  (wrap:int:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r1v0 int))
  (wrap:java.util.LinkedHashMap:?: TERNARY null = ((wrap:int:0x0005: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.LinkedHashMap:0x000b: CONSTRUCTOR  A[MD:():void (c), WRAPPED] (LINE:8) call: java.util.LinkedHashMap.<init>():void type: CONSTRUCTOR) : (r2v0 java.util.LinkedHashMap))
 A[MD:(int, java.util.LinkedHashMap<java.lang.String, java.util.List<o.qkM$ActionBar>>):void (m)] (LINE:6) call: o.qkM.<init>(int, java.util.LinkedHashMap):void type: THIS */
    public /* synthetic */ C41093qkM(int i, LinkedHashMap linkedHashMap, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? new LinkedHashMap() : linkedHashMap);
    }

    /* JADX INFO: renamed from: o.qkM$ActionBar */
    public static final class ActionBar {
        public final java.lang.String AEQbTJ;
        public final java.lang.String AYXKKw;
        public final UpDownColor AhwBna;
        public int AkhnZx;
        public final float DbNXlk;
        public int EZpvd;
        public final java.lang.String KWHzl;
        public final float OLrzqt;
        public final float copydefault;
        public boolean djBIcL;
        public final java.lang.String fetchVPNInfo;
        public boolean gEmmrt;
        public final float isConnected;
        public final int valueOf;
        public final java.util.List<java.lang.String> values;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AEQbTJ() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AYXKKw() {
            return this.AYXKKw;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<java.lang.String> AhwBna() {
            return this.values;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final float AkhnZx() {
            return this.DbNXlk;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String EZpvd() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(int i) {
            this.AkhnZx = i;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final float KWHzl() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ActionBar KWHzl(int i, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull UpDownColor upDownColor, @NotNull java.util.List<java.lang.String> list, java.lang.String str4, float f, float f2, float f3, float f4, int i2, boolean z, boolean z2, int i3) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(upDownColor, "");
            Intrinsics.checkNotNullParameter(list, "");
            return new ActionBar(i, str, str2, str3, upDownColor, list, str4, f, f2, f3, f4, i2, z, z2, i3);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(boolean z) {
            this.djBIcL = z;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int OLrzqt() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(int i) {
            this.EZpvd = i;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final float copydefault() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(boolean z) {
            this.gEmmrt = z;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String djBIcL() {
            return this.fetchVPNInfo;
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
            return this.valueOf == actionBar.valueOf && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) actionBar.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) actionBar.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.AYXKKw, (java.lang.Object) actionBar.AYXKKw) && this.AhwBna == actionBar.AhwBna && Intrinsics.EZpvd(this.values, actionBar.values) && Intrinsics.EZpvd((java.lang.Object) this.fetchVPNInfo, (java.lang.Object) actionBar.fetchVPNInfo) && java.lang.Float.compare(this.DbNXlk, actionBar.DbNXlk) == 0 && java.lang.Float.compare(this.OLrzqt, actionBar.OLrzqt) == 0 && java.lang.Float.compare(this.isConnected, actionBar.isConnected) == 0 && java.lang.Float.compare(this.copydefault, actionBar.copydefault) == 0 && this.EZpvd == actionBar.EZpvd && this.djBIcL == actionBar.djBIcL && this.gEmmrt == actionBar.gEmmrt && this.AkhnZx == actionBar.AkhnZx;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean gEmmrt() {
            return this.gEmmrt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = java.lang.Integer.hashCode(this.valueOf);
            int iHashCode2 = this.AEQbTJ.hashCode();
            int iHashCode3 = this.KWHzl.hashCode();
            int iHashCode4 = this.AYXKKw.hashCode();
            int iHashCode5 = this.AhwBna.hashCode();
            int iHashCode6 = this.values.hashCode();
            java.lang.String str = this.fetchVPNInfo;
            return (((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + (str == null ? 0 : str.hashCode())) * 31) + java.lang.Float.hashCode(this.DbNXlk)) * 31) + java.lang.Float.hashCode(this.OLrzqt)) * 31) + java.lang.Float.hashCode(this.isConnected)) * 31) + java.lang.Float.hashCode(this.copydefault)) * 31) + java.lang.Integer.hashCode(this.EZpvd)) * 31) + java.lang.Boolean.hashCode(this.djBIcL)) * 31) + java.lang.Boolean.hashCode(this.gEmmrt)) * 31) + java.lang.Integer.hashCode(this.AkhnZx);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final float isConnected() {
            return this.isConnected;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "MarketDiscoverHotCategoryVo(position=" + this.valueOf + ", categoryId=" + this.AEQbTJ + ", categoryName=" + this.KWHzl + ", profit=" + this.AYXKKw + ", profitColor=" + this.AhwBna + ", showIconList=" + this.values + ", showNum=" + this.fetchVPNInfo + ", topLeftRadius=" + this.DbNXlk + ", bottomLeftRadius=" + this.OLrzqt + ", topRightRadius=" + this.isConnected + ", bottomRightRadius=" + this.copydefault + ", height=" + this.EZpvd + ", isVisible=" + this.djBIcL + ", showCoinList=" + this.gEmmrt + ", style=" + this.AkhnZx + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int valueOf() {
            return this.valueOf;
        }

        public ActionBar(int i, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull UpDownColor upDownColor, @NotNull java.util.List<java.lang.String> list, java.lang.String str4, float f, float f2, float f3, float f4, int i2, boolean z, boolean z2, int i3) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(upDownColor, "");
            Intrinsics.checkNotNullParameter(list, "");
            this.valueOf = i;
            this.AEQbTJ = str;
            this.KWHzl = str2;
            this.AYXKKw = str3;
            this.AhwBna = upDownColor;
            this.values = list;
            this.fetchVPNInfo = str4;
            this.DbNXlk = f;
            this.OLrzqt = f2;
            this.isConnected = f3;
            this.copydefault = f4;
            this.EZpvd = i2;
            this.djBIcL = z;
            this.gEmmrt = z2;
            this.AkhnZx = i3;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0067: CONSTRUCTOR 
  (wrap:int:?: TERNARY null = ((wrap:int:0x0002: ARITH (r35v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r20v0 int))
  (r21v0 java.lang.String)
  (r22v0 java.lang.String)
  (r23v0 java.lang.String)
  (wrap:com.okinc.market.ext.UpDownColor:?: TERNARY null = ((wrap:int:0x000b: ARITH (r35v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0011: SGET  A[WRAPPED] (LINE:16) com.okinc.market.ext.UpDownColor.NEUTRAL com.okinc.market.ext.UpDownColor) : (r24v0 com.okinc.market.ext.UpDownColor))
  (r25v0 java.util.List)
  (r26v0 java.lang.String)
  (wrap:float:?: TERNARY null = ((wrap:int:0x0015: ARITH (r35v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (0.0f float) : (r27v0 float))
  (wrap:float:?: TERNARY null = ((wrap:int:0x001e: ARITH (r35v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (0.0f float) : (r28v0 float))
  (wrap:float:?: TERNARY null = ((wrap:int:0x0026: ARITH (r35v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (0.0f float) : (r29v0 float))
  (wrap:float:?: TERNARY null = ((wrap:int:0x002e: ARITH (r35v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (0.0f float) : (r30v0 float))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0036: ARITH (r35v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r31v0 int))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x003e: ARITH (r35v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? false : (r32v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0047: ARITH (r35v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? true : (r33v0 boolean))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0051: ARITH (r35v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? (-1 int) : (r34v0 int))
 A[MD:(int, java.lang.String, java.lang.String, java.lang.String, com.okinc.market.ext.UpDownColor, java.util.List<java.lang.String>, java.lang.String, float, float, float, float, int, boolean, boolean, int):void (m)] (LINE:11) call: o.qkM.ActionBar.<init>(int, java.lang.String, java.lang.String, java.lang.String, com.okinc.market.ext.UpDownColor, java.util.List, java.lang.String, float, float, float, float, int, boolean, boolean, int):void type: THIS */
        public /* synthetic */ ActionBar(int i, java.lang.String str, java.lang.String str2, java.lang.String str3, UpDownColor upDownColor, java.util.List list, java.lang.String str4, float f, float f2, float f3, float f4, int i2, boolean z, boolean z2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
            this((i4 & 1) != 0 ? 0 : i, str, str2, str3, (i4 & 16) != 0 ? UpDownColor.NEUTRAL : upDownColor, list, str4, (i4 & 128) != 0 ? 0.0f : f, (i4 & 256) != 0 ? 0.0f : f2, (i4 & 512) != 0 ? 0.0f : f3, (i4 & 1024) != 0 ? 0.0f : f4, (i4 & 2048) != 0 ? 0 : i2, (i4 & 4096) != 0 ? false : z, (i4 & 8192) != 0 ? true : z2, (i4 & 16384) != 0 ? -1 : i3);
        }
    }

    @Override // o.InterfaceC40516qYt
    public boolean onCompareItems(@NotNull InterfaceC40516qYt interfaceC40516qYt) {
        Intrinsics.checkNotNullParameter(interfaceC40516qYt, "");
        return (interfaceC40516qYt instanceof C41093qkM) && Intrinsics.EZpvd(this, interfaceC40516qYt);
    }

    @Override // o.InterfaceC40516qYt
    public boolean onCompareContents(@NotNull InterfaceC40516qYt interfaceC40516qYt) {
        Intrinsics.checkNotNullParameter(interfaceC40516qYt, "");
        return Intrinsics.EZpvd(interfaceC40516qYt, this);
    }
}
