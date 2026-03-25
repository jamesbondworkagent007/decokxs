package o;

import com.okinc.market.quotation.ui.model.dex.DexChainGroupVo;
import java.util.SortedMap;
import kotlin.Triple;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qIn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C40078qIn {
    public final java.util.List<C39994qFk> AEQbTJ;
    public final java.util.List<C39994qFk> AYXKKw;
    public final java.util.List<C39999qFp> AhwBna;
    public final SortedMap<java.lang.Long, java.util.List<C40005qFv>> AkhnZx;
    public final C40009qFz DbNXlk;
    public final C39998qFo EZpvd;
    public final java.util.List<C39992qFi> KWHzl;
    public final java.util.List<C39995qFl> OLrzqt;
    public final java.util.List<C39993qFj> copydefault;
    public final java.util.List<C39996qFm> djBIcL;
    public final Triple<java.lang.String, java.util.List<DexChainGroupVo>, java.util.List<InterfaceC41655qus>> fetchVPNInfo;
    public final C40001qFr gEmmrt;
    public final java.util.List<C40006qFw> isConnected;
    public final java.lang.String valueOf;
    public final java.util.List<C39994qFk> values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<C39995qFl> AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<C39999qFp> AYXKKw() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<C39994qFk> AhwBna() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<C39994qFk> AkhnZx() {
        return this.values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SortedMap<java.lang.Long, java.util.List<C40005qFv>> DbNXlk() {
        return this.AkhnZx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C39998qFo EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C40078qIn EZpvd(@NotNull java.lang.String str, java.util.List<C39994qFk> list, java.util.List<C39994qFk> list2, java.util.List<C39994qFk> list3, SortedMap<java.lang.Long, java.util.List<C40005qFv>> sortedMap, java.util.List<C39996qFm> list4, java.util.List<C40006qFw> list5, java.util.List<C39995qFl> list6, java.util.List<C39999qFp> list7, C40009qFz c40009qFz, java.util.List<C39992qFi> list8, java.util.List<C39993qFj> list9, C39998qFo c39998qFo, C40001qFr c40001qFr, Triple<java.lang.String, ? extends java.util.List<DexChainGroupVo>, ? extends java.util.List<? extends InterfaceC41655qus>> triple) {
        Intrinsics.checkNotNullParameter(str, "");
        return new C40078qIn(str, list, list2, list3, sortedMap, list4, list5, list6, list7, c40009qFz, list8, list9, c39998qFo, c40001qFr, triple);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<C39994qFk> KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<C39992qFi> OLrzqt() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<C39993qFj> copydefault() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C40001qFr djBIcL() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C40078qIn)) {
            return false;
        }
        C40078qIn c40078qIn = (C40078qIn) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.valueOf, (java.lang.Object) c40078qIn.valueOf) && Intrinsics.EZpvd(this.AEQbTJ, c40078qIn.AEQbTJ) && Intrinsics.EZpvd(this.values, c40078qIn.values) && Intrinsics.EZpvd(this.AYXKKw, c40078qIn.AYXKKw) && Intrinsics.EZpvd(this.AkhnZx, c40078qIn.AkhnZx) && Intrinsics.EZpvd(this.djBIcL, c40078qIn.djBIcL) && Intrinsics.EZpvd(this.isConnected, c40078qIn.isConnected) && Intrinsics.EZpvd(this.OLrzqt, c40078qIn.OLrzqt) && Intrinsics.EZpvd(this.AhwBna, c40078qIn.AhwBna) && Intrinsics.EZpvd(this.DbNXlk, c40078qIn.DbNXlk) && Intrinsics.EZpvd(this.KWHzl, c40078qIn.KWHzl) && Intrinsics.EZpvd(this.copydefault, c40078qIn.copydefault) && Intrinsics.EZpvd(this.EZpvd, c40078qIn.EZpvd) && Intrinsics.EZpvd(this.gEmmrt, c40078qIn.gEmmrt) && Intrinsics.EZpvd(this.fetchVPNInfo, c40078qIn.fetchVPNInfo);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Triple<java.lang.String, java.util.List<DexChainGroupVo>, java.util.List<InterfaceC41655qus>> fetchVPNInfo() {
        return this.fetchVPNInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String gEmmrt() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.valueOf.hashCode();
        java.util.List<C39994qFk> list = this.AEQbTJ;
        int iHashCode2 = list == null ? 0 : list.hashCode();
        java.util.List<C39994qFk> list2 = this.values;
        int iHashCode3 = list2 == null ? 0 : list2.hashCode();
        java.util.List<C39994qFk> list3 = this.AYXKKw;
        int iHashCode4 = list3 == null ? 0 : list3.hashCode();
        SortedMap<java.lang.Long, java.util.List<C40005qFv>> sortedMap = this.AkhnZx;
        int iHashCode5 = sortedMap == null ? 0 : sortedMap.hashCode();
        java.util.List<C39996qFm> list4 = this.djBIcL;
        int iHashCode6 = list4 == null ? 0 : list4.hashCode();
        java.util.List<C40006qFw> list5 = this.isConnected;
        int iHashCode7 = list5 == null ? 0 : list5.hashCode();
        java.util.List<C39995qFl> list6 = this.OLrzqt;
        int iHashCode8 = list6 == null ? 0 : list6.hashCode();
        java.util.List<C39999qFp> list7 = this.AhwBna;
        int iHashCode9 = list7 == null ? 0 : list7.hashCode();
        C40009qFz c40009qFz = this.DbNXlk;
        int iHashCode10 = c40009qFz == null ? 0 : c40009qFz.hashCode();
        java.util.List<C39992qFi> list8 = this.KWHzl;
        int iHashCode11 = list8 == null ? 0 : list8.hashCode();
        java.util.List<C39993qFj> list9 = this.copydefault;
        int iHashCode12 = list9 == null ? 0 : list9.hashCode();
        C39998qFo c39998qFo = this.EZpvd;
        int iHashCode13 = c39998qFo == null ? 0 : c39998qFo.hashCode();
        C40001qFr c40001qFr = this.gEmmrt;
        int iHashCode14 = c40001qFr == null ? 0 : c40001qFr.hashCode();
        Triple<java.lang.String, java.util.List<DexChainGroupVo>, java.util.List<InterfaceC41655qus>> triple = this.fetchVPNInfo;
        return (((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + (triple == null ? 0 : triple.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<C40006qFw> isConnected() {
        return this.isConnected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<C39996qFm> valueOf() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C40009qFz values() {
        return this.DbNXlk;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r18v0, resolved type: kotlin.Triple<java.lang.String, ? extends java.util.List<com.okinc.market.quotation.ui.model.dex.DexChainGroupVo>, ? extends java.util.List<? extends o.qus>> */
    /* JADX WARN: Multi-variable type inference failed */
    public C40078qIn(@NotNull java.lang.String str, java.util.List<C39994qFk> list, java.util.List<C39994qFk> list2, java.util.List<C39994qFk> list3, SortedMap<java.lang.Long, java.util.List<C40005qFv>> sortedMap, java.util.List<C39996qFm> list4, java.util.List<C40006qFw> list5, java.util.List<C39995qFl> list6, java.util.List<C39999qFp> list7, C40009qFz c40009qFz, java.util.List<C39992qFi> list8, java.util.List<C39993qFj> list9, C39998qFo c39998qFo, C40001qFr c40001qFr, Triple<java.lang.String, ? extends java.util.List<DexChainGroupVo>, ? extends java.util.List<? extends InterfaceC41655qus>> triple) {
        Intrinsics.checkNotNullParameter(str, "");
        this.valueOf = str;
        this.AEQbTJ = list;
        this.values = list2;
        this.AYXKKw = list3;
        this.AkhnZx = sortedMap;
        this.djBIcL = list4;
        this.isConnected = list5;
        this.OLrzqt = list6;
        this.AhwBna = list7;
        this.DbNXlk = c40009qFz;
        this.KWHzl = list8;
        this.copydefault = list9;
        this.EZpvd = c39998qFo;
        this.gEmmrt = c40001qFr;
        this.fetchVPNInfo = triple;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0092: CONSTRUCTOR 
  (r16v0 java.lang.String)
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0002: ARITH (r31v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r17v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x000b: ARITH (r31v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r18v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0013: ARITH (r31v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r19v0 java.util.List))
  (wrap:java.util.SortedMap:?: TERNARY null = ((wrap:int:0x001b: ARITH (r31v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.util.SortedMap) : (r20v0 java.util.SortedMap))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0023: ARITH (r31v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r21v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x002b: ARITH (r31v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r22v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0033: ARITH (r31v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r23v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x003b: ARITH (r31v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r24v0 java.util.List))
  (wrap:o.qFz:?: TERNARY null = ((wrap:int:0x0043: ARITH (r31v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null o.qFz) : (r25v0 o.qFz))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x004b: ARITH (r31v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r26v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0053: ARITH (r31v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r27v0 java.util.List))
  (wrap:o.qFo:?: TERNARY null = ((wrap:int:0x005b: ARITH (r31v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (null o.qFo) : (r28v0 o.qFo))
  (wrap:o.qFr:?: TERNARY null = ((wrap:int:0x0063: ARITH (r31v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? (null o.qFr) : (r29v0 o.qFr))
  (wrap:kotlin.Triple:?: TERNARY null = ((wrap:int:0x006b: ARITH (r31v0 int) & (16384 int) A[WRAPPED]) == (0 int)) ? (r30v0 kotlin.Triple) : (null kotlin.Triple))
 A[MD:(java.lang.String, java.util.List<o.qFk>, java.util.List<o.qFk>, java.util.List<o.qFk>, java.util.SortedMap<java.lang.Long, java.util.List<o.qFv>>, java.util.List<o.qFm>, java.util.List<o.qFw>, java.util.List<o.qFl>, java.util.List<o.qFp>, o.qFz, java.util.List<o.qFi>, java.util.List<o.qFj>, o.qFo, o.qFr, kotlin.Triple<java.lang.String, ? extends java.util.List<com.okinc.market.quotation.ui.model.dex.DexChainGroupVo>, ? extends java.util.List<? extends o.qus>>):void (m)] (LINE:21) call: o.qIn.<init>(java.lang.String, java.util.List, java.util.List, java.util.List, java.util.SortedMap, java.util.List, java.util.List, java.util.List, java.util.List, o.qFz, java.util.List, java.util.List, o.qFo, o.qFr, kotlin.Triple):void type: THIS */
    public /* synthetic */ C40078qIn(java.lang.String str, java.util.List list, java.util.List list2, java.util.List list3, SortedMap sortedMap, java.util.List list4, java.util.List list5, java.util.List list6, java.util.List list7, C40009qFz c40009qFz, java.util.List list8, java.util.List list9, C39998qFo c39998qFo, C40001qFr c40001qFr, Triple triple, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : list, (i & 4) != 0 ? null : list2, (i & 8) != 0 ? null : list3, (i & 16) != 0 ? null : sortedMap, (i & 32) != 0 ? null : list4, (i & 64) != 0 ? null : list5, (i & 128) != 0 ? null : list6, (i & 256) != 0 ? null : list7, (i & 512) != 0 ? null : c40009qFz, (i & 1024) != 0 ? null : list8, (i & 2048) != 0 ? null : list9, (i & 4096) != 0 ? null : c39998qFo, (i & 8192) != 0 ? null : c40001qFr, (i & 16384) == 0 ? triple : null);
    }

    public final boolean fIwbmz() {
        java.util.List<C39994qFk> list;
        SortedMap<java.lang.Long, java.util.List<C40005qFv>> sortedMap;
        java.util.List<C39996qFm> list2;
        java.util.List<C40006qFw> list3;
        java.util.List<C39995qFl> list4;
        java.util.List<C39999qFp> list5;
        java.util.List<C39994qFk> list6;
        java.util.List<C39992qFi> list7;
        java.util.List<C39993qFj> list8;
        C39998qFo c39998qFo;
        C40001qFr c40001qFr;
        java.util.List<C39994qFk> list9 = this.values;
        return (list9 == null || list9.isEmpty()) && ((list = this.AYXKKw) == null || list.isEmpty()) && (((sortedMap = this.AkhnZx) == null || sortedMap.isEmpty()) && fARcdN() && (((list2 = this.djBIcL) == null || list2.isEmpty()) && (((list3 = this.isConnected) == null || list3.isEmpty()) && (((list4 = this.OLrzqt) == null || list4.isEmpty()) && (((list5 = this.AhwBna) == null || list5.isEmpty()) && (((list6 = this.AEQbTJ) == null || list6.isEmpty()) && this.DbNXlk == null && (((list7 = this.KWHzl) == null || list7.isEmpty()) && (((list8 = this.copydefault) == null || list8.isEmpty()) && (((c39998qFo = this.EZpvd) == null || !c39998qFo.AhwBna()) && ((c40001qFr = this.gEmmrt) == null || !c40001qFr.AEQbTJ()))))))))));
    }

    public final boolean fARcdN() {
        java.util.List<InterfaceC41655qus> third;
        Triple<java.lang.String, java.util.List<DexChainGroupVo>, java.util.List<InterfaceC41655qus>> triple = this.fetchVPNInfo;
        return triple == null || (C33129mqd.OLrzqt((java.lang.CharSequence) triple.getFirst()) && ((third = this.fetchVPNInfo.getThird()) == null || third.isEmpty()));
    }

    public java.lang.String toString() {
        java.util.List<InterfaceC41655qus> third;
        java.util.List<DexChainGroupVo> second;
        java.util.List<C40004qFu> listOLrzqt;
        java.util.List<C39997qFn> listAEQbTJ;
        java.util.List<C39991qFh> listOLrzqt2;
        java.lang.String str = this.valueOf;
        java.util.List<C39994qFk> list = this.values;
        java.lang.Integer numValueOf = list != null ? java.lang.Integer.valueOf(list.size()) : null;
        java.util.List<C39994qFk> list2 = this.AYXKKw;
        java.lang.Integer numValueOf2 = list2 != null ? java.lang.Integer.valueOf(list2.size()) : null;
        SortedMap<java.lang.Long, java.util.List<C40005qFv>> sortedMap = this.AkhnZx;
        java.lang.Integer numValueOf3 = sortedMap != null ? java.lang.Integer.valueOf(sortedMap.size()) : null;
        java.util.List<C39996qFm> list3 = this.djBIcL;
        java.lang.Integer numValueOf4 = list3 != null ? java.lang.Integer.valueOf(list3.size()) : null;
        java.util.List<C40006qFw> list4 = this.isConnected;
        java.lang.Integer numValueOf5 = list4 != null ? java.lang.Integer.valueOf(list4.size()) : null;
        java.util.List<C39995qFl> list5 = this.OLrzqt;
        java.lang.Integer numValueOf6 = list5 != null ? java.lang.Integer.valueOf(list5.size()) : null;
        java.util.List<C39999qFp> list6 = this.AhwBna;
        java.lang.Integer numValueOf7 = list6 != null ? java.lang.Integer.valueOf(list6.size()) : null;
        java.util.List<C39994qFk> list7 = this.AEQbTJ;
        java.lang.Integer numValueOf8 = list7 != null ? java.lang.Integer.valueOf(list7.size()) : null;
        C40009qFz c40009qFz = this.DbNXlk;
        java.util.List<C39992qFi> list8 = this.KWHzl;
        java.lang.Integer numValueOf9 = list8 != null ? java.lang.Integer.valueOf(list8.size()) : null;
        java.util.List<C39993qFj> list9 = this.copydefault;
        java.lang.Integer numValueOf10 = list9 != null ? java.lang.Integer.valueOf(list9.size()) : null;
        C39998qFo c39998qFo = this.EZpvd;
        java.lang.Integer numValueOf11 = (c39998qFo == null || (listOLrzqt2 = c39998qFo.OLrzqt()) == null) ? null : java.lang.Integer.valueOf(listOLrzqt2.size());
        C39998qFo c39998qFo2 = this.EZpvd;
        java.lang.Integer numValueOf12 = (c39998qFo2 == null || (listAEQbTJ = c39998qFo2.AEQbTJ()) == null) ? null : java.lang.Integer.valueOf(listAEQbTJ.size());
        C40001qFr c40001qFr = this.gEmmrt;
        java.lang.Integer numValueOf13 = (c40001qFr == null || (listOLrzqt = c40001qFr.OLrzqt()) == null) ? null : java.lang.Integer.valueOf(listOLrzqt.size());
        Triple<java.lang.String, java.util.List<DexChainGroupVo>, java.util.List<InterfaceC41655qus>> triple = this.fetchVPNInfo;
        java.lang.Integer numValueOf14 = (triple == null || (second = triple.getSecond()) == null) ? null : java.lang.Integer.valueOf(second.size());
        Triple<java.lang.String, java.util.List<DexChainGroupVo>, java.util.List<InterfaceC41655qus>> triple2 = this.fetchVPNInfo;
        return C59442zhC.fJNWhG("\n            MarketSearchResultVo(\n                keyword='" + str + "', \n                spotVoList=" + numValueOf + ", \n                futuresVoList=" + numValueOf2 + ", \n                optionsVoMap=" + numValueOf3 + ", \n                earnProductsPoList=" + numValueOf4 + ", \n                traderVoList=" + numValueOf5 + ", \n                botVoList=" + numValueOf6 + ", \n                defiWeb3VoList=" + numValueOf7 + ", \n                coinVoList=" + numValueOf8 + ", \n                p2pAndDepositFunctionData=" + c40009qFz + ", \n                campaignVoList=" + numValueOf9 + ", \n                announcementVoList=" + numValueOf10 + ", \n                contentVo=" + numValueOf11 + ", " + numValueOf12 + ", \n                imChatVo=" + numValueOf13 + ", \n                searchDexVosResult=" + numValueOf14 + ", " + ((triple2 == null || (third = triple2.getThird()) == null) ? null : java.lang.Integer.valueOf(third.size())) + "\n            )\n        ");
    }
}
