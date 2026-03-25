package o;

import com.fasterxml.jackson.core.JsonPointer;
import com.google.common.base.Ascii;
import com.google.common.primitives.UnsignedBytes;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringNumberConversionsKt;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.InterfaceC5164He;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.Hh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5167Hh implements InterfaceC5164He {
    public static final java.util.Set<java.lang.Character> AEQbTJ;
    public static final InterfaceC5164He AYXKKw;
    public static final java.util.Set<java.lang.Character> AhwBna;
    public static final java.util.Set<java.lang.Character> AkhnZx;
    public static final java.util.Set<java.lang.Character> AuCTel;
    public static final java.util.Set<java.lang.Character> DbNXlk;
    public static final InterfaceC5164He EZpvd;
    public static final ActionBar KWHzl = new ActionBar(null);
    public static final java.util.Set<java.lang.Character> OLrzqt;
    public static final InterfaceC5164He djBIcL;
    public static final InterfaceC5164He ejfBZ;
    public static final java.util.Set<java.lang.Character> fARcdN;
    public static final java.util.Set<java.lang.Character> fIwbmz;
    public static final java.util.Set<java.lang.Character> fJNWhG;
    public static final InterfaceC5164He fetchVPNInfo;
    public static final InterfaceC5164He gEmmrt;
    public static final InterfaceC5164He isConnected;
    public static final InterfaceC5164He valueOf;
    public static final java.util.Set<java.lang.Character> values;
    public final java.util.Set<java.lang.Character> AuCTelauCTel;
    public final java.lang.String getFieldNames;
    public final java.util.Map<java.lang.Character, java.lang.String> getNewProxyInstance;
    public final java.util.Map<java.lang.Character, java.lang.String> hDKMBd;
    public final java.util.Map<java.lang.Character, java.lang.Character> iwGUEr;
    public final java.util.Map<java.lang.Character, java.lang.Character> uzCIH;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC5164He
    public java.lang.String OLrzqt() {
        return this.getFieldNames;
    }

    public C5167Hh(@NotNull java.lang.String str, @NotNull java.util.Set<java.lang.Character> set, @NotNull java.util.Map<java.lang.Character, java.lang.Character> map) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(set, "");
        Intrinsics.checkNotNullParameter(map, "");
        this.getFieldNames = str;
        this.AuCTelauCTel = set;
        this.uzCIH = map;
        kotlin.ranges.IntRange intRangeAhwBna = C56548yJl.AhwBna(0, 128);
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(intRangeAhwBna, 10));
        java.util.Iterator<java.lang.Integer> it = intRangeAhwBna.iterator();
        while (it.hasNext()) {
            arrayList.add(java.lang.Character.valueOf((char) ((AbstractC56415yEn) it).nextInt()));
        }
        java.util.Set<java.lang.Character> set2 = this.AuCTelauCTel;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (java.lang.Object obj : arrayList) {
            if (!set2.contains(java.lang.Character.valueOf(((java.lang.Character) obj).charValue()))) {
                arrayList2.add(obj);
            }
        }
        ActionBar actionBar = KWHzl;
        LinkedHashMap linkedHashMap = new LinkedHashMap(C56548yJl.copydefault(C56423yEv.copydefault(C56403yEb.AYXKKw(arrayList2, 10)), 16));
        for (java.lang.Object obj2 : arrayList2) {
            linkedHashMap.put(obj2, actionBar.AEQbTJ(((java.lang.Character) obj2).charValue()));
        }
        this.hDKMBd = linkedHashMap;
        java.util.Map<java.lang.Character, java.lang.Character> map2 = this.uzCIH;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(C56423yEv.copydefault(map2.size()));
        java.util.Iterator<T> it2 = map2.entrySet().iterator();
        while (it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it2.next();
            linkedHashMap2.put(entry.getKey(), java.lang.String.valueOf(((java.lang.Character) entry.getValue()).charValue()));
        }
        this.getNewProxyInstance = C56424yEw.OLrzqt(linkedHashMap, linkedHashMap2);
        java.util.Set<java.lang.Character> set3 = this.AuCTelauCTel;
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(C56548yJl.copydefault(C56423yEv.copydefault(C56403yEb.AYXKKw(set3, 10)), 16));
        for (java.lang.Object obj3 : set3) {
            linkedHashMap3.put(obj3, java.lang.Character.valueOf(((java.lang.Character) obj3).charValue()));
        }
        java.util.Set<Map.Entry> setEntrySet = C56424yEw.OLrzqt(linkedHashMap3, this.uzCIH).entrySet();
        LinkedHashMap linkedHashMap4 = new LinkedHashMap(C56548yJl.copydefault(C56423yEv.copydefault(C56403yEb.AYXKKw(setEntrySet, 10)), 16));
        for (Map.Entry entry2 : setEntrySet) {
            kotlin.Pair pairOLrzqt = C56390yDp.OLrzqt(java.lang.Character.valueOf(((java.lang.Character) entry2.getValue()).charValue()), java.lang.Character.valueOf(((java.lang.Character) entry2.getKey()).charValue()));
            linkedHashMap4.put(pairOLrzqt.getFirst(), pairOLrzqt.getSecond());
        }
        this.iwGUEr = linkedHashMap4;
    }

    @Override // o.InterfaceC5164He
    public C5166Hg AEQbTJ(@NotNull java.lang.String str) {
        return InterfaceC5164He.StateListAnimator.copydefault(this, str);
    }

    @Override // o.InterfaceC5164He
    public C5166Hg OLrzqt(@NotNull java.lang.String str) {
        return InterfaceC5164He.StateListAnimator.KWHzl(this, str);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0008: CONSTRUCTOR 
  (r1v0 java.lang.String)
  (r2v0 java.util.Set)
  (wrap:java.util.Map:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.Map:0x0004: INVOKE  STATIC call: o.yEw.KWHzl():java.util.Map A[MD:<K, V>:():java.util.Map<K, V> (m), WRAPPED] (LINE:21)) : (r3v0 java.util.Map))
 A[MD:(java.lang.String, java.util.Set<java.lang.Character>, java.util.Map<java.lang.Character, java.lang.Character>):void (m)] (LINE:18) call: o.Hh.<init>(java.lang.String, java.util.Set, java.util.Map):void type: THIS */
    public /* synthetic */ C5167Hh(java.lang.String str, java.util.Set set, java.util.Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, set, (i & 4) != 0 ? C56424yEw.KWHzl() : map);
    }

    /* JADX INFO: renamed from: o.Hh$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.Hh.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final InterfaceC5164He copydefault() {
            return C5167Hh.djBIcL;
        }

        public final InterfaceC5164He djBIcL() {
            return C5167Hh.ejfBZ;
        }

        public final InterfaceC5164He KWHzl() {
            return C5167Hh.valueOf;
        }

        public final InterfaceC5164He EZpvd() {
            return C5167Hh.AYXKKw;
        }

        public final InterfaceC5164He OLrzqt() {
            return C5167Hh.gEmmrt;
        }

        public final InterfaceC5164He AEQbTJ() {
            return C5167Hh.EZpvd;
        }

        public final InterfaceC5164He gEmmrt() {
            return C5167Hh.fetchVPNInfo;
        }

        public final InterfaceC5164He AhwBna() {
            return C5167Hh.isConnected;
        }

        /* JADX DEBUG: TODO: convert one arg to string using `String.valueOf()`, args: 37, (wrap:char:INVOKE), (wrap:char:INVOKE) */
        public final java.lang.String AEQbTJ(char c) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append('%');
            sb.append("0123456789ABCDEF".charAt((c & 255) >> 4));
            sb.append("0123456789ABCDEF".charAt(c & 15));
            java.lang.String string = sb.toString();
            Intrinsics.checkNotNullExpressionValue(string, "");
            return string;
        }

        public final void copydefault(java.lang.StringBuilder sb, byte b) {
            sb.append('%');
            sb.append("0123456789ABCDEF".charAt((b & UnsignedBytes.MAX_VALUE) >> 4));
            sb.append("0123456789ABCDEF".charAt(b & Ascii.SI));
        }
    }

    static {
        java.util.Set<java.lang.Character> setOqFWZa = CollectionsKt___CollectionsKt.OqFWZa(CollectionsKt___CollectionsKt.valueOf(new yIU('A', 'Z'), new yIU('a', 'z')));
        OLrzqt = setOqFWZa;
        java.util.Set<java.lang.Character> setOqFWZa2 = CollectionsKt___CollectionsKt.OqFWZa(new yIU('0', '9'));
        AEQbTJ = setOqFWZa2;
        java.util.Set<java.lang.Character> setKWHzl = yEJ.KWHzl(yEJ.KWHzl(setOqFWZa, setOqFWZa2), yEE.AhwBna('-', '.', '_', '~'));
        AkhnZx = setKWHzl;
        java.util.Set<java.lang.Character> setAhwBna = yEE.AhwBna('!', '$', '&', '\'', '(', ')', '*', '+', java.lang.Character.valueOf(AbstractJsonLexerKt.COMMA), ';', '=');
        values = setAhwBna;
        java.util.Set<java.lang.Character> setKWHzl2 = yEJ.KWHzl(setKWHzl, setAhwBna);
        fJNWhG = setKWHzl2;
        java.lang.Character chValueOf = java.lang.Character.valueOf(AbstractJsonLexerKt.COLON);
        java.util.Set<java.lang.Character> setKWHzl3 = yEJ.KWHzl(setKWHzl2, yEE.AhwBna(chValueOf, '@'));
        fARcdN = setKWHzl3;
        java.util.Set<java.lang.Character> setKWHzl4 = yEJ.KWHzl(setKWHzl3, yEE.AhwBna(java.lang.Character.valueOf(JsonPointer.SEPARATOR), '?'));
        AuCTel = setKWHzl4;
        java.util.Set<java.lang.Character> setEZpvd = yEJ.EZpvd((java.util.Set) setKWHzl4, (java.lang.Iterable) yEE.AhwBna('&', '='));
        fIwbmz = setEZpvd;
        DbNXlk = setKWHzl;
        AhwBna = setKWHzl;
        djBIcL = new C5167Hh("host", yEJ.OLrzqt(setKWHzl, chValueOf), null, 4, null);
        ejfBZ = new C5167Hh("user info", setKWHzl2, null, 4, null);
        valueOf = new C5167Hh("path", setKWHzl3, null, 4, null);
        AYXKKw = new C5167Hh("query string", setEZpvd, null, 4, null);
        gEmmrt = new C5167Hh("fragment", setKWHzl4, null, 4, 0 == true ? 1 : 0);
        java.util.Map map = null;
        int i = 4;
        DefaultConstructorMarker defaultConstructorMarker = null;
        EZpvd = new C5167Hh("form URL", setKWHzl, map, i, defaultConstructorMarker);
        fetchVPNInfo = new C5167Hh("Smithy label", setKWHzl, map, i, defaultConstructorMarker);
        isConnected = new C5167Hh("SigV4", setKWHzl, map, i, defaultConstructorMarker);
    }

    @Override // o.InterfaceC5164He
    public java.lang.String copydefault(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        java.lang.StringBuilder sb = new java.lang.StringBuilder(str.length());
        byte[] bArr = null;
        int i = 0;
        while (i < str.length()) {
            char cCharAt = str.charAt(i);
            if (cCharAt == '%') {
                if (bArr == null) {
                    bArr = new byte[(str.length() - i) / 3];
                }
                int i2 = 0;
                while (i + 2 < str.length() && cCharAt == '%') {
                    int i3 = i + 3;
                    java.lang.String strSubstring = str.substring(i + 1, i3);
                    Intrinsics.checkNotNullExpressionValue(strSubstring, "");
                    java.lang.Integer numAhwBna = StringsKt__StringNumberConversionsKt.AhwBna(strSubstring, 16);
                    if (numAhwBna == null) {
                        break;
                    }
                    bArr[i2] = (byte) numAhwBna.intValue();
                    if (i3 < str.length()) {
                        cCharAt = str.charAt(i3);
                    }
                    i2++;
                    i = i3;
                }
                sb.append(C59449zhJ.decodeToString$default(bArr, 0, i2, false, 5, null));
                if (i != str.length() && cCharAt == '%') {
                    sb.append(cCharAt);
                }
            } else {
                java.lang.Character ch = this.iwGUEr.get(java.lang.Character.valueOf(cCharAt));
                if (ch != null) {
                    cCharAt = ch.charValue();
                }
                sb.append(cCharAt);
            }
            i++;
        }
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    @Override // o.InterfaceC5164He
    public java.lang.String EZpvd(@NotNull java.lang.String str) {
        java.lang.StringBuilder sb;
        Intrinsics.checkNotNullParameter(str, "");
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder(str.length());
        for (byte b : C59449zhJ.getNewProxyInstance(str)) {
            char c = (char) b;
            if (this.AuCTelauCTel.contains(java.lang.Character.valueOf(c))) {
                sb2.append(c);
            } else {
                java.lang.String str2 = this.getNewProxyInstance.get(java.lang.Character.valueOf(c));
                if (str2 != null) {
                    sb2.append(str2);
                    sb = sb2;
                } else {
                    sb = null;
                }
                if (sb == null) {
                    KWHzl.copydefault(sb2, b);
                } else {
                    Intrinsics.copydefault(sb);
                }
            }
        }
        java.lang.String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }
}
