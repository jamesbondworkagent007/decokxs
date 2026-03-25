package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.noP, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C35069noP implements InterfaceC40516qYt {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public final java.lang.String AEQbTJ;
    public final java.lang.String AYXKKw;
    public final java.lang.String AhwBna;
    public final java.lang.String AkhnZx;
    public final java.lang.String AuCTel;
    public final java.lang.String DbNXlk;
    public final java.lang.String EZpvd;
    public final java.lang.String KWHzl;
    public final java.lang.Integer OLrzqt;
    public final java.lang.String copydefault;
    public final java.lang.String djBIcL;
    public final java.lang.String fARcdN;
    public final java.lang.String fetchVPNInfo;
    public final java.lang.String gEmmrt;
    public final boolean isConnected;
    public final java.lang.String valueOf;
    public final java.lang.String values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C35069noP copy$default(C35069noP c35069noP, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8, java.lang.String str9, java.lang.String str10, boolean z, java.lang.String str11, java.lang.String str12, java.lang.Integer num, java.lang.String str13, java.lang.String str14, java.lang.String str15, int i, java.lang.Object obj) {
        return c35069noP.OLrzqt((i & 1) != 0 ? c35069noP.AhwBna : str, (i & 2) != 0 ? c35069noP.EZpvd : str2, (i & 4) != 0 ? c35069noP.values : str3, (i & 8) != 0 ? c35069noP.AkhnZx : str4, (i & 16) != 0 ? c35069noP.DbNXlk : str5, (i & 32) != 0 ? c35069noP.KWHzl : str6, (i & 64) != 0 ? c35069noP.AEQbTJ : str7, (i & 128) != 0 ? c35069noP.fARcdN : str8, (i & 256) != 0 ? c35069noP.AuCTel : str9, (i & 512) != 0 ? c35069noP.gEmmrt : str10, (i & 1024) != 0 ? c35069noP.isConnected : z, (i & 2048) != 0 ? c35069noP.djBIcL : str11, (i & 4096) != 0 ? c35069noP.valueOf : str12, (i & 8192) != 0 ? c35069noP.OLrzqt : num, (i & 16384) != 0 ? c35069noP.copydefault : str13, (i & 32768) != 0 ? c35069noP.fetchVPNInfo : str14, (i & 65536) != 0 ? c35069noP.AYXKKw : str15);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Integer AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AYXKKw() {
        return this.DbNXlk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AhwBna() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String DbNXlk() {
        return this.AuCTel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C35069noP OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8, java.lang.String str9, java.lang.String str10, boolean z, java.lang.String str11, java.lang.String str12, java.lang.Integer num, java.lang.String str13, java.lang.String str14, java.lang.String str15) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        return new C35069noP(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, z, str11, str12, num, str13, str14, str15);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String djBIcL() {
        return this.AkhnZx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C35069noP)) {
            return false;
        }
        C35069noP c35069noP = (C35069noP) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.AhwBna, (java.lang.Object) c35069noP.AhwBna) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) c35069noP.EZpvd) && Intrinsics.EZpvd((java.lang.Object) this.values, (java.lang.Object) c35069noP.values) && Intrinsics.EZpvd((java.lang.Object) this.AkhnZx, (java.lang.Object) c35069noP.AkhnZx) && Intrinsics.EZpvd((java.lang.Object) this.DbNXlk, (java.lang.Object) c35069noP.DbNXlk) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) c35069noP.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) c35069noP.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.fARcdN, (java.lang.Object) c35069noP.fARcdN) && Intrinsics.EZpvd((java.lang.Object) this.AuCTel, (java.lang.Object) c35069noP.AuCTel) && Intrinsics.EZpvd((java.lang.Object) this.gEmmrt, (java.lang.Object) c35069noP.gEmmrt) && this.isConnected == c35069noP.isConnected && Intrinsics.EZpvd((java.lang.Object) this.djBIcL, (java.lang.Object) c35069noP.djBIcL) && Intrinsics.EZpvd((java.lang.Object) this.valueOf, (java.lang.Object) c35069noP.valueOf) && Intrinsics.EZpvd(this.OLrzqt, c35069noP.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) c35069noP.copydefault) && Intrinsics.EZpvd((java.lang.Object) this.fetchVPNInfo, (java.lang.Object) c35069noP.fetchVPNInfo) && Intrinsics.EZpvd((java.lang.Object) this.AYXKKw, (java.lang.Object) c35069noP.AYXKKw);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String fetchVPNInfo() {
        return this.fetchVPNInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String gEmmrt() {
        return this.values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.AhwBna.hashCode();
        int iHashCode2 = this.EZpvd.hashCode();
        int iHashCode3 = this.values.hashCode();
        int iHashCode4 = this.AkhnZx.hashCode();
        java.lang.String str = this.DbNXlk;
        int iHashCode5 = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.KWHzl;
        int iHashCode6 = str2 == null ? 0 : str2.hashCode();
        java.lang.String str3 = this.AEQbTJ;
        int iHashCode7 = str3 == null ? 0 : str3.hashCode();
        java.lang.String str4 = this.fARcdN;
        int iHashCode8 = str4 == null ? 0 : str4.hashCode();
        java.lang.String str5 = this.AuCTel;
        int iHashCode9 = str5 == null ? 0 : str5.hashCode();
        java.lang.String str6 = this.gEmmrt;
        int iHashCode10 = str6 == null ? 0 : str6.hashCode();
        int iHashCode11 = java.lang.Boolean.hashCode(this.isConnected);
        java.lang.String str7 = this.djBIcL;
        int iHashCode12 = str7 == null ? 0 : str7.hashCode();
        java.lang.String str8 = this.valueOf;
        int iHashCode13 = str8 == null ? 0 : str8.hashCode();
        java.lang.Integer num = this.OLrzqt;
        int iHashCode14 = num == null ? 0 : num.hashCode();
        java.lang.String str9 = this.copydefault;
        int iHashCode15 = str9 == null ? 0 : str9.hashCode();
        java.lang.String str10 = this.fetchVPNInfo;
        int iHashCode16 = str10 == null ? 0 : str10.hashCode();
        java.lang.String str11 = this.AYXKKw;
        return (((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + (str11 == null ? 0 : str11.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "MarketHomeStockItemVo(instId=" + this.AhwBna + ", baseCcy=" + this.EZpvd + ", quoteCcy=" + this.values + ", instType=" + this.AkhnZx + ", priceValue=" + this.DbNXlk + ", displayId=" + this.KWHzl + ", changeRatioValue=" + this.AEQbTJ + ", volumeValue=" + this.fARcdN + ", turnoverValue=" + this.AuCTel + ", iconUrl=" + this.gEmmrt + ", isWatching=" + this.isConnected + ", formattedPrice=" + this.djBIcL + ", formattedChangeRatio=" + this.valueOf + ", changeRatioColor=" + this.OLrzqt + ", cupTickerPrice=" + this.copydefault + ", quoteCupTickerPrice=" + this.fetchVPNInfo + ", formattedQuotePrice=" + this.AYXKKw + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String valueOf() {
        return this.gEmmrt;
    }

    public C35069noP(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8, java.lang.String str9, java.lang.String str10, boolean z, java.lang.String str11, java.lang.String str12, java.lang.Integer num, java.lang.String str13, java.lang.String str14, java.lang.String str15) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.AhwBna = str;
        this.EZpvd = str2;
        this.values = str3;
        this.AkhnZx = str4;
        this.DbNXlk = str5;
        this.KWHzl = str6;
        this.AEQbTJ = str7;
        this.fARcdN = str8;
        this.AuCTel = str9;
        this.gEmmrt = str10;
        this.isConnected = z;
        this.djBIcL = str11;
        this.valueOf = str12;
        this.OLrzqt = num;
        this.copydefault = str13;
        this.fetchVPNInfo = str14;
        this.AYXKKw = str15;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x007e: CONSTRUCTOR 
  (r22v0 java.lang.String)
  (r23v0 java.lang.String)
  (r24v0 java.lang.String)
  (r25v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r39v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r26v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r39v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r27v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0013: ARITH (r39v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r28v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001b: ARITH (r39v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r29v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0023: ARITH (r39v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r30v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002b: ARITH (r39v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r31v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0033: ARITH (r39v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? false : (r32v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003c: ARITH (r39v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r33v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0044: ARITH (r39v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r34v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x004d: ARITH (r39v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r35v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0056: ARITH (r39v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r36v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0062: ARITH (32768 int) & (r39v0 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r37v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x006c: ARITH (r39v0 int) & (65536 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r38v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:11) call: o.noP.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ C35069noP(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8, java.lang.String str9, java.lang.String str10, boolean z, java.lang.String str11, java.lang.String str12, java.lang.Integer num, java.lang.String str13, java.lang.String str14, java.lang.String str15, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? null : str8, (i & 256) != 0 ? null : str9, (i & 512) != 0 ? null : str10, (i & 1024) != 0 ? false : z, (i & 2048) != 0 ? null : str11, (i & 4096) != 0 ? null : str12, (i & 8192) != 0 ? null : num, (i & 16384) != 0 ? null : str13, (32768 & i) != 0 ? null : str14, (i & 65536) != 0 ? null : str15);
    }

    /* JADX INFO: renamed from: o.noP$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.noP.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final InterfaceC35073noT EZpvd() {
            return new ActionBar();
        }

        /* JADX INFO: renamed from: o.noP$StateListAnimator$ActionBar */
        public static final class ActionBar implements InterfaceC35073noT {
            @Override // o.InterfaceC35073noT
            public C35069noP AEQbTJ(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8, java.lang.String str9, java.lang.String str10, java.lang.String str11, java.lang.Integer num) {
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(str3, "");
                Intrinsics.checkNotNullParameter(str4, "");
                Intrinsics.checkNotNullParameter(str5, "");
                return new C35069noP(str, str3, str4, str5, str6, str2, str7, str8, str9, str10, false, null, str11, num, null, null, null, 117760, null);
            }
        }
    }

    public final C35069noP AEQbTJ(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6) {
        return copy$default(this, null, null, null, null, str, null, str2, str3, null, null, false, null, null, null, str4, str5, str6, 16175, null);
    }

    @Override // o.InterfaceC40516qYt
    public boolean onCompareItems(@NotNull InterfaceC40516qYt interfaceC40516qYt) {
        Intrinsics.checkNotNullParameter(interfaceC40516qYt, "");
        return (interfaceC40516qYt instanceof C35069noP) && Intrinsics.EZpvd((java.lang.Object) this.AhwBna, (java.lang.Object) ((C35069noP) interfaceC40516qYt).AhwBna);
    }

    @Override // o.InterfaceC40516qYt
    public boolean onCompareContents(@NotNull InterfaceC40516qYt interfaceC40516qYt) {
        Intrinsics.checkNotNullParameter(interfaceC40516qYt, "");
        return Intrinsics.EZpvd(interfaceC40516qYt, this);
    }
}
