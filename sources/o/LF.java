package o;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class LF {
    public static final Application Companion = new Application(null);
    public final java.lang.String AEQbTJ;
    public final java.lang.String AYXKKw;
    public final java.lang.String AhwBna;
    public final java.lang.String AkhnZx;
    public final java.util.Map<java.lang.String, java.lang.Object> AuCTel;
    public final java.lang.String DbNXlk;
    public final java.lang.String EZpvd;
    public final java.lang.String KWHzl;
    public final java.lang.String OLrzqt;
    public final java.lang.String copydefault;
    public final java.util.Map<java.lang.String, java.util.Set<java.lang.String>> djBIcL;
    public final java.lang.String ejfBZ;
    public final java.lang.String fARcdN;
    public final java.lang.String fetchVPNInfo;
    public final java.lang.String gEmmrt;
    public final java.lang.String isConnected;
    public final java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.Object>>> valueOf;
    public final java.lang.String values;

    /* JADX DEBUG: Multi-variable search result rejected for r19v0, resolved type: java.util.Map<java.lang.String, ? extends java.util.Set<java.lang.String>> */
    /* JADX DEBUG: Multi-variable search result rejected for r20v0, resolved type: java.util.Map<java.lang.String, ? extends java.util.Map<java.lang.String, ? extends java.util.Map<java.lang.String, ? extends java.lang.Object>>> */
    /* JADX WARN: Multi-variable type inference failed */
    public LF(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8, java.lang.String str9, java.lang.String str10, java.lang.String str11, java.lang.String str12, java.lang.String str13, java.lang.String str14, java.lang.String str15, java.util.Map<java.lang.String, ? extends java.lang.Object> map, java.util.Map<java.lang.String, ? extends java.util.Set<java.lang.String>> map2, java.util.Map<java.lang.String, ? extends java.util.Map<java.lang.String, ? extends java.util.Map<java.lang.String, ? extends java.lang.Object>>> map3) {
        this.ejfBZ = str;
        this.copydefault = str2;
        this.KWHzl = str3;
        this.DbNXlk = str4;
        this.gEmmrt = str5;
        this.OLrzqt = str6;
        this.isConnected = str7;
        this.values = str8;
        this.fARcdN = str9;
        this.fetchVPNInfo = str10;
        this.AhwBna = str11;
        this.EZpvd = str12;
        this.AYXKKw = str13;
        this.AEQbTJ = str14;
        this.AkhnZx = str15;
        this.AuCTel = map;
        this.djBIcL = map2;
        this.valueOf = map3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x00c1: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r38v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r20v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000a: ARITH (r38v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r21v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0012: ARITH (r38v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r22v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001a: ARITH (r38v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r23v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0022: ARITH (r38v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r24v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002a: ARITH (r38v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r25v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0032: ARITH (r38v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r26v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003a: ARITH (r38v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r27v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0042: ARITH (r38v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r28v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004a: ARITH (r38v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r29v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0052: ARITH (r38v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r30v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005a: ARITH (r38v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r31v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0062: ARITH (r38v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r32v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x006a: ARITH (r38v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r33v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0072: ARITH (r38v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r34v0 java.lang.String))
  (wrap:java.util.Map:?: TERNARY null = ((wrap:int:0x007d: ARITH (r38v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? (null java.util.Map) : (r35v0 java.util.Map))
  (wrap:java.util.Map:?: TERNARY null = ((wrap:int:0x0088: ARITH (r38v0 int) & (65536 int) A[WRAPPED]) != (0 int)) ? (null java.util.Map) : (r36v0 java.util.Map))
  (wrap:java.util.Map:?: TERNARY null = ((wrap:int:0x0093: ARITH (r38v0 int) & (131072 int) A[WRAPPED]) != (0 int)) ? (null java.util.Map) : (r37v0 java.util.Map))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.Map<java.lang.String, ? extends java.lang.Object>, java.util.Map<java.lang.String, ? extends java.util.Set<java.lang.String>>, java.util.Map<java.lang.String, ? extends java.util.Map<java.lang.String, ? extends java.util.Map<java.lang.String, ? extends java.lang.Object>>>):void (m)] (LINE:22) call: o.LF.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.Map, java.util.Map, java.util.Map):void type: THIS */
    public /* synthetic */ LF(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8, java.lang.String str9, java.lang.String str10, java.lang.String str11, java.lang.String str12, java.lang.String str13, java.lang.String str14, java.lang.String str15, java.util.Map map, java.util.Map map2, java.util.Map map3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? null : str8, (i & 256) != 0 ? null : str9, (i & 512) != 0 ? null : str10, (i & 1024) != 0 ? null : str11, (i & 2048) != 0 ? null : str12, (i & 4096) != 0 ? null : str13, (i & 8192) != 0 ? null : str14, (i & 16384) != 0 ? null : str15, (i & 32768) != 0 ? null : map, (i & 65536) != 0 ? null : map2, (i & 131072) != 0 ? null : map3);
    }

    public LF() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 262142, null);
    }

    public final TaskDescription AEQbTJ() {
        return Companion.copydefault().fetchVPNInfo(this.ejfBZ).copydefault(this.copydefault).KWHzl(this.KWHzl).isConnected(this.DbNXlk).AhwBna(this.gEmmrt).OLrzqt(this.OLrzqt).djBIcL(this.isConnected).values(this.values).DbNXlk(this.fARcdN).AkhnZx(this.fetchVPNInfo).gEmmrt(this.AhwBna).AEQbTJ(this.EZpvd).valueOf(this.AYXKKw).EZpvd(this.AEQbTJ).AYXKKw(this.AkhnZx).OLrzqt(this.AuCTel).KWHzl(this.djBIcL).AEQbTJ(this.valueOf);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.EZpvd(LF.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.copydefault(obj, "");
        LF lf = (LF) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.ejfBZ, (java.lang.Object) lf.ejfBZ) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) lf.copydefault) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) lf.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.DbNXlk, (java.lang.Object) lf.DbNXlk) && Intrinsics.EZpvd((java.lang.Object) this.gEmmrt, (java.lang.Object) lf.gEmmrt) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) lf.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.isConnected, (java.lang.Object) lf.isConnected) && Intrinsics.EZpvd((java.lang.Object) this.values, (java.lang.Object) lf.values) && Intrinsics.EZpvd((java.lang.Object) this.fARcdN, (java.lang.Object) lf.fARcdN) && Intrinsics.EZpvd((java.lang.Object) this.fetchVPNInfo, (java.lang.Object) lf.fetchVPNInfo) && Intrinsics.EZpvd((java.lang.Object) this.AhwBna, (java.lang.Object) lf.AhwBna) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) lf.EZpvd) && Intrinsics.EZpvd((java.lang.Object) this.AYXKKw, (java.lang.Object) lf.AYXKKw) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) lf.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.AkhnZx, (java.lang.Object) lf.AkhnZx) && Intrinsics.EZpvd(this.AuCTel, lf.AuCTel) && Intrinsics.EZpvd(this.djBIcL, lf.djBIcL) && Intrinsics.EZpvd(this.valueOf, lf.valueOf);
    }

    public int hashCode() {
        java.lang.String str = this.ejfBZ;
        int iHashCode = str != null ? str.hashCode() : 0;
        java.lang.String str2 = this.copydefault;
        int iHashCode2 = str2 != null ? str2.hashCode() : 0;
        java.lang.String str3 = this.KWHzl;
        int iHashCode3 = str3 != null ? str3.hashCode() : 0;
        java.lang.String str4 = this.DbNXlk;
        int iHashCode4 = str4 != null ? str4.hashCode() : 0;
        java.lang.String str5 = this.gEmmrt;
        int iHashCode5 = str5 != null ? str5.hashCode() : 0;
        java.lang.String str6 = this.OLrzqt;
        int iHashCode6 = str6 != null ? str6.hashCode() : 0;
        java.lang.String str7 = this.isConnected;
        int iHashCode7 = str7 != null ? str7.hashCode() : 0;
        java.lang.String str8 = this.values;
        int iHashCode8 = str8 != null ? str8.hashCode() : 0;
        java.lang.String str9 = this.fARcdN;
        int iHashCode9 = str9 != null ? str9.hashCode() : 0;
        java.lang.String str10 = this.fetchVPNInfo;
        int iHashCode10 = str10 != null ? str10.hashCode() : 0;
        java.lang.String str11 = this.AhwBna;
        int iHashCode11 = str11 != null ? str11.hashCode() : 0;
        java.lang.String str12 = this.EZpvd;
        int iHashCode12 = str12 != null ? str12.hashCode() : 0;
        java.lang.String str13 = this.AYXKKw;
        int iHashCode13 = str13 != null ? str13.hashCode() : 0;
        java.lang.String str14 = this.AEQbTJ;
        int iHashCode14 = str14 != null ? str14.hashCode() : 0;
        java.lang.String str15 = this.AkhnZx;
        int iHashCode15 = str15 != null ? str15.hashCode() : 0;
        java.util.Map<java.lang.String, java.lang.Object> map = this.AuCTel;
        int iHashCode16 = map != null ? map.hashCode() : 0;
        java.util.Map<java.lang.String, java.util.Set<java.lang.String>> map2 = this.djBIcL;
        int iHashCode17 = map2 != null ? map2.hashCode() : 0;
        java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.Object>>> map3 = this.valueOf;
        return (((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + (map3 != null ? map3.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "ExperimentUser(userId=" + this.ejfBZ + ", deviceId=" + this.copydefault + ", country=" + this.KWHzl + ", region=" + this.DbNXlk + ", dma=" + this.gEmmrt + ", city=" + this.OLrzqt + ", language=" + this.isConnected + ", platform=" + this.values + ", version=" + this.fARcdN + ", os=" + this.fetchVPNInfo + ", deviceManufacturer=" + this.AhwBna + ", deviceBrand=" + this.EZpvd + ", deviceModel=" + this.AYXKKw + ", carrier=" + this.AEQbTJ + ", library=" + this.AkhnZx + ", userProperties=" + this.AuCTel + ", groups=" + this.djBIcL + ", groupProperties=" + this.valueOf + ')';
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.LF.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final TaskDescription copydefault() {
            return new TaskDescription();
        }
    }

    public static final class TaskDescription {
        public java.lang.String AEQbTJ;
        public java.lang.String AYXKKw;
        public java.lang.String AhwBna;
        public java.lang.String AkhnZx;
        public java.lang.String DbNXlk;
        public java.lang.String EZpvd;
        public java.lang.String KWHzl;
        public java.lang.String OLrzqt;
        public java.lang.String copydefault;
        public java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.Object>>> djBIcL;
        public java.util.Map<java.lang.String, java.lang.Object> ejfBZ;
        public java.lang.String fARcdN;
        public java.lang.String fJNWhG;
        public java.lang.String fetchVPNInfo;
        public java.util.Map<java.lang.String, java.util.Set<java.lang.String>> gEmmrt;
        public java.lang.String isConnected;
        public java.lang.String valueOf;
        public java.lang.String values;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TaskDescription AEQbTJ(java.lang.String str) {
            this.KWHzl = str;
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TaskDescription AYXKKw(java.lang.String str) {
            this.isConnected = str;
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TaskDescription AhwBna(java.lang.String str) {
            this.valueOf = str;
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TaskDescription AkhnZx(java.lang.String str) {
            this.DbNXlk = str;
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TaskDescription DbNXlk(java.lang.String str) {
            this.fARcdN = str;
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TaskDescription EZpvd(java.lang.String str) {
            this.EZpvd = str;
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TaskDescription KWHzl(java.lang.String str) {
            this.OLrzqt = str;
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TaskDescription OLrzqt(java.lang.String str) {
            this.AEQbTJ = str;
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TaskDescription copydefault(java.lang.String str) {
            this.copydefault = str;
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TaskDescription djBIcL(java.lang.String str) {
            this.AkhnZx = str;
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TaskDescription fetchVPNInfo(java.lang.String str) {
            this.fJNWhG = str;
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TaskDescription gEmmrt(java.lang.String str) {
            this.AhwBna = str;
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TaskDescription isConnected(java.lang.String str) {
            this.fetchVPNInfo = str;
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TaskDescription valueOf(java.lang.String str) {
            this.AYXKKw = str;
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TaskDescription values(java.lang.String str) {
            this.values = str;
            return this;
        }

        public final TaskDescription OLrzqt(java.util.Map<java.lang.String, ? extends java.lang.Object> map) {
            this.ejfBZ = map != null ? C56424yEw.isConnected(map) : null;
            return this;
        }

        public final TaskDescription KWHzl(java.util.Map<java.lang.String, ? extends java.util.Set<java.lang.String>> map) {
            this.gEmmrt = map != null ? C56424yEw.isConnected(map) : null;
            return this;
        }

        public final LF OLrzqt() {
            return new LF(this.fJNWhG, this.copydefault, this.OLrzqt, this.fetchVPNInfo, this.valueOf, this.AEQbTJ, this.AkhnZx, this.values, this.fARcdN, this.DbNXlk, this.AhwBna, this.KWHzl, this.AYXKKw, this.EZpvd, this.isConnected, this.ejfBZ, this.gEmmrt, this.djBIcL);
        }

        public final TaskDescription AEQbTJ(java.util.Map<java.lang.String, ? extends java.util.Map<java.lang.String, ? extends java.util.Map<java.lang.String, ? extends java.lang.Object>>> map) {
            java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.Object>>> mapIsConnected;
            if (map != null) {
                LinkedHashMap linkedHashMap = new LinkedHashMap(C56423yEv.copydefault(map.size()));
                java.util.Iterator<T> it = map.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    java.lang.Object key = entry.getKey();
                    java.util.Map mapIsConnected2 = C56424yEw.isConnected((java.util.Map) entry.getValue());
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap(C56423yEv.copydefault(mapIsConnected2.size()));
                    for (Map.Entry entry2 : mapIsConnected2.entrySet()) {
                        linkedHashMap2.put(entry2.getKey(), C56424yEw.isConnected((java.util.Map) entry2.getValue()));
                    }
                    linkedHashMap.put(key, C56424yEw.isConnected(linkedHashMap2));
                }
                mapIsConnected = C56424yEw.isConnected(linkedHashMap);
            } else {
                mapIsConnected = null;
            }
            this.djBIcL = mapIsConnected;
            return this;
        }
    }
}
