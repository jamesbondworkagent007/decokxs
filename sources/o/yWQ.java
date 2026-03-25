package o;

import com.reown.foundation.util.jwt.JwtUtilsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public abstract class yWQ {
    public static final ActionBar AEQbTJ = new ActionBar(null);
    public final int[] AhwBna;
    public final int OLrzqt;
    public final int djBIcL;
    public final java.util.List<java.lang.Integer> gEmmrt;
    public final int valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean EZpvd(int i, int i2, int i3) {
        int i4 = this.OLrzqt;
        if (i4 < i) {
            return true;
        }
        if (i4 > i) {
            return false;
        }
        int i5 = this.djBIcL;
        if (i5 < i2) {
            return true;
        }
        return i5 <= i2 && this.valueOf <= i3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int[] KWHzl() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int OLrzqt() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean OLrzqt(int i, int i2, int i3) {
        int i4 = this.OLrzqt;
        if (i4 > i) {
            return true;
        }
        if (i4 < i) {
            return false;
        }
        int i5 = this.djBIcL;
        if (i5 > i2) {
            return true;
        }
        return i5 >= i2 && this.valueOf >= i3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int copydefault() {
        return this.djBIcL;
    }

    public yWQ(@NotNull int... iArr) {
        java.util.List<java.lang.Integer> listAhwBna;
        Intrinsics.checkNotNullParameter(iArr, "");
        this.AhwBna = iArr;
        java.lang.Integer numGEmmrt = yDV.gEmmrt(iArr, 0);
        this.OLrzqt = numGEmmrt != null ? numGEmmrt.intValue() : -1;
        java.lang.Integer numGEmmrt2 = yDV.gEmmrt(iArr, 1);
        this.djBIcL = numGEmmrt2 != null ? numGEmmrt2.intValue() : -1;
        java.lang.Integer numGEmmrt3 = yDV.gEmmrt(iArr, 2);
        this.valueOf = numGEmmrt3 != null ? numGEmmrt3.intValue() : -1;
        if (iArr.length > 3) {
            if (iArr.length > 1024) {
                throw new java.lang.IllegalArgumentException("BinaryVersion with length more than 1024 are not supported. Provided length " + iArr.length + '.');
            }
            listAhwBna = CollectionsKt___CollectionsKt.AxsJAYsNCnLh(yDT.AuCTel(iArr).subList(3, iArr.length));
        } else {
            listAhwBna = yDY.AhwBna();
        }
        this.gEmmrt = listAhwBna;
    }

    public final boolean OLrzqt(@NotNull yWQ ywq) {
        Intrinsics.checkNotNullParameter(ywq, "");
        int i = this.OLrzqt;
        return i != 0 ? !(i != ywq.OLrzqt || this.djBIcL > ywq.djBIcL) : ywq.OLrzqt == 0 && this.djBIcL == ywq.djBIcL;
    }

    public final boolean AEQbTJ(@NotNull yWQ ywq) {
        Intrinsics.checkNotNullParameter(ywq, "");
        return OLrzqt(ywq.OLrzqt, ywq.djBIcL, ywq.valueOf);
    }

    public java.lang.String toString() {
        int[] iArrKWHzl = KWHzl();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i : iArrKWHzl) {
            if (i == -1) {
                break;
            }
            arrayList.add(java.lang.Integer.valueOf(i));
        }
        return arrayList.isEmpty() ? "unknown" : CollectionsKt___CollectionsKt.joinToString$default(arrayList, JwtUtilsKt.JWT_DELIMITER, null, null, 0, null, null, 62, null);
    }

    public boolean equals(java.lang.Object obj) {
        if (obj != null && Intrinsics.EZpvd(getClass(), obj.getClass())) {
            yWQ ywq = (yWQ) obj;
            if (this.OLrzqt == ywq.OLrzqt && this.djBIcL == ywq.djBIcL && this.valueOf == ywq.valueOf && Intrinsics.EZpvd(this.gEmmrt, ywq.gEmmrt)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i = this.OLrzqt;
        int i2 = i + (i * 31) + this.djBIcL;
        int i3 = i2 + (i2 * 31) + this.valueOf;
        return i3 + (i3 * 31) + this.gEmmrt.hashCode();
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.yWQ.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }
}
