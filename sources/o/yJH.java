package o;

import java.lang.reflect.WildcardType;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class yJH implements WildcardType, yJC {
    public static final StateListAnimator AEQbTJ = new StateListAnimator(null);
    public static final yJH KWHzl = new yJH(null, null);
    public final java.lang.reflect.Type EZpvd;
    public final java.lang.reflect.Type OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // java.lang.reflect.WildcardType
    public java.lang.reflect.Type[] getLowerBounds() {
        java.lang.reflect.Type type = this.OLrzqt;
        return type == null ? new java.lang.reflect.Type[0] : new java.lang.reflect.Type[]{type};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // java.lang.reflect.WildcardType
    public java.lang.reflect.Type[] getUpperBounds() {
        java.lang.reflect.Type[] typeArr = new java.lang.reflect.Type[1];
        java.lang.reflect.Type type = this.EZpvd;
        if (type == null) {
            type = java.lang.Object.class;
        }
        typeArr[0] = type;
        return typeArr;
    }

    public yJH(java.lang.reflect.Type type, java.lang.reflect.Type type2) {
        this.EZpvd = type;
        this.OLrzqt = type2;
    }

    @Override // java.lang.reflect.Type
    public java.lang.String getTypeName() {
        if (this.OLrzqt != null) {
            return "? super " + yJB.EZpvd(this.OLrzqt);
        }
        java.lang.reflect.Type type = this.EZpvd;
        if (type == null || Intrinsics.EZpvd(type, java.lang.Object.class)) {
            return "?";
        }
        return "? extends " + yJB.EZpvd(this.EZpvd);
    }

    public boolean equals(java.lang.Object obj) {
        if (obj instanceof WildcardType) {
            WildcardType wildcardType = (WildcardType) obj;
            if (java.util.Arrays.equals(getUpperBounds(), wildcardType.getUpperBounds()) && java.util.Arrays.equals(getLowerBounds(), wildcardType.getLowerBounds())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return java.util.Arrays.hashCode(getUpperBounds()) ^ java.util.Arrays.hashCode(getLowerBounds());
    }

    public java.lang.String toString() {
        return getTypeName();
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.yJH.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final yJH copydefault() {
            return yJH.KWHzl;
        }
    }
}
