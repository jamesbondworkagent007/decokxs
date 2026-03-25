package o;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class UTFDataFormatException {
    public final java.util.List<java.lang.Object> KWHzl;
    public final java.util.Map<java.lang.String, java.lang.String> copydefault;
    public static final TaskDescription OLrzqt = new TaskDescription(null);
    public static final C57737yo<UTFDataFormatException> AEQbTJ = new C57737yo<>("CustomUserAgentMetadata");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public UTFDataFormatException() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.Map<java.lang.String, java.lang.String> KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<java.lang.Object> copydefault() {
        return this.KWHzl;
    }

    public UTFDataFormatException(@NotNull java.util.Map<java.lang.String, java.lang.String> map, @NotNull java.util.List<? extends java.lang.Object> list) {
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.copydefault = C56424yEw.isConnected(map);
        this.KWHzl = CollectionsKt___CollectionsKt.fJNWhG((java.util.Collection) list);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (wrap:java.util.Map:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.Map:0x0004: INVOKE  STATIC call: o.yEw.KWHzl():java.util.Map A[MD:<K, V>:():java.util.Map<K, V> (m), WRAPPED] (LINE:23)) : (r1v0 java.util.Map))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0008: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x000c: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:24)) : (r2v0 java.util.List))
 A[MD:(java.util.Map<java.lang.String, java.lang.String>, java.util.List<? extends java.lang.Object>):void (m)] (LINE:22) call: o.UTFDataFormatException.<init>(java.util.Map, java.util.List):void type: THIS */
    public /* synthetic */ UTFDataFormatException(java.util.Map map, java.util.List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C56424yEw.KWHzl() : map, (i & 2) != 0 ? yDY.AhwBna() : list);
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.UTFDataFormatException.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final C57737yo<UTFDataFormatException> AEQbTJ() {
            return UTFDataFormatException.AEQbTJ;
        }

        public final UTFDataFormatException EZpvd(@NotNull HM hm) {
            Intrinsics.checkNotNullParameter(hm, "");
            return new UTFDataFormatException(C56424yEw.OLrzqt(KWHzl(hm.copydefault(), "AWS_CUSTOM_METADATA_"), KWHzl(hm.OLrzqt(), "aws.customMetadata.")), null, 2, 0 == true ? 1 : 0);
        }

        public static final java.util.Map<java.lang.String, java.lang.String> KWHzl(java.util.Map<java.lang.String, java.lang.String> map, java.lang.String str) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<java.lang.String, java.lang.String> entry : map.entrySet()) {
                if (C59449zhJ.startsWith$default(entry.getKey(), str, false, 2, null)) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(C56423yEv.copydefault(linkedHashMap.size()));
            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                java.lang.String strSubstring = ((java.lang.String) entry2.getKey()).substring(str.length());
                Intrinsics.checkNotNullExpressionValue(strSubstring, "");
                linkedHashMap2.put(strSubstring, entry2.getValue());
            }
            return linkedHashMap2;
        }
    }

    public final void OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.copydefault.put(str, str2);
    }

    public final UTFDataFormatException copydefault(@NotNull UTFDataFormatException uTFDataFormatException) {
        Intrinsics.checkNotNullParameter(uTFDataFormatException, "");
        return new UTFDataFormatException(C56424yEw.OLrzqt(this.copydefault, uTFDataFormatException.copydefault), CollectionsKt___CollectionsKt.djBIcL((java.util.Collection) this.KWHzl, (java.lang.Iterable) uTFDataFormatException.KWHzl));
    }
}
