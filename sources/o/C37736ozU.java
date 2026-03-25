package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: o.ozU, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C37736ozU {
    public static final Activity Companion = new Activity(null);
    public static final int KWHzl = 8;
    public final android.graphics.drawable.Drawable AEQbTJ;
    public final int OLrzqt;
    public final java.lang.CharSequence copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C37736ozU copy$default(C37736ozU c37736ozU, int i, android.graphics.drawable.Drawable drawable, java.lang.CharSequence charSequence, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = c37736ozU.OLrzqt;
        }
        if ((i2 & 2) != 0) {
            drawable = c37736ozU.AEQbTJ;
        }
        if ((i2 & 4) != 0) {
            charSequence = c37736ozU.copydefault;
        }
        return c37736ozU.EZpvd(i, drawable, charSequence);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.CharSequence EZpvd() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C37736ozU EZpvd(int i, android.graphics.drawable.Drawable drawable, java.lang.CharSequence charSequence) {
        return new C37736ozU(i, drawable, charSequence);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final android.graphics.drawable.Drawable copydefault() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C37736ozU)) {
            return false;
        }
        C37736ozU c37736ozU = (C37736ozU) obj;
        return this.OLrzqt == c37736ozU.OLrzqt && Intrinsics.EZpvd(this.AEQbTJ, c37736ozU.AEQbTJ) && Intrinsics.EZpvd(this.copydefault, c37736ozU.copydefault);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = java.lang.Integer.hashCode(this.OLrzqt);
        android.graphics.drawable.Drawable drawable = this.AEQbTJ;
        int iHashCode2 = drawable == null ? 0 : drawable.hashCode();
        java.lang.CharSequence charSequence = this.copydefault;
        return (((iHashCode * 31) + iHashCode2) * 31) + (charSequence != null ? charSequence.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "AddEntry(id=" + this.OLrzqt + ", icon=" + this.AEQbTJ + ", title=" + ((java.lang.Object) this.copydefault) + ")";
    }

    public C37736ozU(int i, android.graphics.drawable.Drawable drawable, java.lang.CharSequence charSequence) {
        this.OLrzqt = i;
        this.AEQbTJ = drawable;
        this.copydefault = charSequence;
    }

    /* JADX INFO: renamed from: o.ozU$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.ozU.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }
}
