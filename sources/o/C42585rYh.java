package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.rYh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C42585rYh {
    public static final ActionBar Companion = new ActionBar(null);
    public final java.lang.String KWHzl;
    public final int OLrzqt;
    public final int copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C42585rYh copy$default(C42585rYh c42585rYh, java.lang.String str, int i, int i2, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            str = c42585rYh.KWHzl;
        }
        if ((i3 & 2) != 0) {
            i = c42585rYh.OLrzqt;
        }
        if ((i3 & 4) != 0) {
            i2 = c42585rYh.copydefault;
        }
        return c42585rYh.copydefault(str, i, i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C42585rYh copydefault(@NotNull java.lang.String str, int i, int i2) {
        Intrinsics.checkNotNullParameter(str, "");
        return new C42585rYh(str, i, i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C42585rYh)) {
            return false;
        }
        C42585rYh c42585rYh = (C42585rYh) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) c42585rYh.KWHzl) && this.OLrzqt == c42585rYh.OLrzqt && this.copydefault == c42585rYh.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.KWHzl.hashCode() * 31) + java.lang.Integer.hashCode(this.OLrzqt)) * 31) + java.lang.Integer.hashCode(this.copydefault);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "ToastEvent(toastMessage=" + this.KWHzl + ", iconId=" + this.OLrzqt + ", duration=" + this.copydefault + ")";
    }

    public C42585rYh(@NotNull java.lang.String str, int i, int i2) {
        Intrinsics.checkNotNullParameter(str, "");
        this.KWHzl = str;
        this.OLrzqt = i;
        this.copydefault = i2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (r2v0 java.lang.String)
  (wrap:int:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r4v0 int))
 A[MD:(java.lang.String, int, int):void (m)] (LINE:5) call: o.rYh.<init>(java.lang.String, int, int):void type: THIS */
    public /* synthetic */ C42585rYh(java.lang.String str, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i3 & 2) != 0 ? 0 : i, (i3 & 4) != 0 ? 0 : i2);
    }

    /* JADX INFO: renamed from: o.rYh$ActionBar */
    /* JADX INFO: loaded from: classes19.dex */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.rYh.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final C42585rYh EZpvd(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return new C42585rYh(str, 0, 0, 6, null);
        }
    }
}
