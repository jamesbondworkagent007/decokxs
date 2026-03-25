package o;

import com.okinc.planet.biz_content.input.ContentValidationType;
import com.okinc.planet.biz_content.input.ValidationStatus;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tsj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C47577tsj {
    public final boolean OLrzqt;
    public final java.util.Map<ContentValidationType, C47572tse> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C47577tsj() {
        this(null, false, 3, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.tsj */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C47577tsj copy$default(C47577tsj c47577tsj, java.util.Map map, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            map = c47577tsj.copydefault;
        }
        if ((i & 2) != 0) {
            z = c47577tsj.OLrzqt;
        }
        return c47577tsj.copydefault(map, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.Map<ContentValidationType, C47572tse> OLrzqt() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C47577tsj copydefault(@NotNull java.util.Map<ContentValidationType, C47572tse> map, boolean z) {
        Intrinsics.checkNotNullParameter(map, "");
        return new C47577tsj(map, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C47577tsj)) {
            return false;
        }
        C47577tsj c47577tsj = (C47577tsj) obj;
        return Intrinsics.EZpvd(this.copydefault, c47577tsj.copydefault) && this.OLrzqt == c47577tsj.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.copydefault.hashCode() * 31) + java.lang.Boolean.hashCode(this.OLrzqt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "ContentValidationState(results=" + this.copydefault + ", canPublish=" + this.OLrzqt + ")";
    }

    public C47577tsj(@NotNull java.util.Map<ContentValidationType, C47572tse> map, boolean z) {
        Intrinsics.checkNotNullParameter(map, "");
        this.copydefault = map;
        this.OLrzqt = z;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000d: CONSTRUCTOR 
  (wrap:java.util.Map:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.Map:0x0004: INVOKE  STATIC call: o.yEw.KWHzl():java.util.Map A[MD:<K, V>:():java.util.Map<K, V> (m), WRAPPED] (LINE:334)) : (r1v0 java.util.Map))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0008: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? true : (r2v0 boolean))
 A[MD:(java.util.Map<com.okinc.planet.biz_content.input.ContentValidationType, o.tse>, boolean):void (m)] (LINE:333) call: o.tsj.<init>(java.util.Map, boolean):void type: THIS */
    public /* synthetic */ C47577tsj(java.util.Map map, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C56424yEw.KWHzl() : map, (i & 2) != 0 ? true : z);
    }

    public final java.util.List<C47572tse> EZpvd() {
        java.util.Collection<C47572tse> collectionValues = this.copydefault.values();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : collectionValues) {
            if (((C47572tse) obj).EZpvd() == ValidationStatus.FAIL) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final boolean copydefault() {
        java.util.Collection<C47572tse> collectionValues = this.copydefault.values();
        if (!(collectionValues instanceof java.util.Collection) || !collectionValues.isEmpty()) {
            java.util.Iterator<T> it = collectionValues.iterator();
            while (it.hasNext()) {
                if (((C47572tse) it.next()).KWHzl() == ContentValidationType.BLANK_ALL) {
                    return true;
                }
            }
        }
        return false;
    }
}
