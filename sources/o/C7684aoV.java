package o;

import android.view.View;
import android.widget.AdapterView;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.aoV, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C7684aoV {
    public java.lang.String AEQbTJ;
    public java.lang.String AYXKKw;
    public java.util.List<C7766apy> EZpvd;
    public View.OnClickListener KWHzl;
    public java.lang.String OLrzqt;
    public AdapterView.OnItemClickListener copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C7684aoV() {
        this(null, null, null, null, null, null, 63, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: o.aoV */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C7684aoV copy$default(C7684aoV c7684aoV, java.lang.String str, java.lang.String str2, java.lang.String str3, java.util.List list, View.OnClickListener onClickListener, AdapterView.OnItemClickListener onItemClickListener, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = c7684aoV.AYXKKw;
        }
        if ((i & 2) != 0) {
            str2 = c7684aoV.AEQbTJ;
        }
        java.lang.String str4 = str2;
        if ((i & 4) != 0) {
            str3 = c7684aoV.OLrzqt;
        }
        java.lang.String str5 = str3;
        if ((i & 8) != 0) {
            list = c7684aoV.EZpvd;
        }
        java.util.List list2 = list;
        if ((i & 16) != 0) {
            onClickListener = c7684aoV.KWHzl;
        }
        View.OnClickListener onClickListener2 = onClickListener;
        if ((i & 32) != 0) {
            onItemClickListener = c7684aoV.copydefault;
        }
        return c7684aoV.KWHzl(str, str4, str5, list2, onClickListener2, onItemClickListener);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<C7766apy> EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(View.OnClickListener onClickListener) {
        this.KWHzl = onClickListener;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(java.lang.String str) {
        this.AYXKKw = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final View.OnClickListener KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C7684aoV KWHzl(java.lang.String str, java.lang.String str2, java.lang.String str3, @NotNull java.util.List<C7766apy> list, View.OnClickListener onClickListener, AdapterView.OnItemClickListener onItemClickListener) {
        Intrinsics.checkNotNullParameter(list, "");
        return new C7684aoV(str, str2, str3, list, onClickListener, onItemClickListener);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(AdapterView.OnItemClickListener onItemClickListener) {
        this.copydefault = onItemClickListener;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(java.lang.String str) {
        this.OLrzqt = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AdapterView.OnItemClickListener OLrzqt() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(java.lang.String str) {
        this.AEQbTJ = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String djBIcL() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7684aoV)) {
            return false;
        }
        C7684aoV c7684aoV = (C7684aoV) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.AYXKKw, (java.lang.Object) c7684aoV.AYXKKw) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) c7684aoV.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) c7684aoV.OLrzqt) && Intrinsics.EZpvd(this.EZpvd, c7684aoV.EZpvd) && Intrinsics.EZpvd(this.KWHzl, c7684aoV.KWHzl) && Intrinsics.EZpvd(this.copydefault, c7684aoV.copydefault);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        java.lang.String str = this.AYXKKw;
        int iHashCode = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.AEQbTJ;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        java.lang.String str3 = this.OLrzqt;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        int iHashCode4 = this.EZpvd.hashCode();
        View.OnClickListener onClickListener = this.KWHzl;
        int iHashCode5 = onClickListener == null ? 0 : onClickListener.hashCode();
        AdapterView.OnItemClickListener onItemClickListener = this.copydefault;
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (onItemClickListener != null ? onItemClickListener.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "BottomSheetAttributes(title=" + this.AYXKKw + ", subTitle=" + this.AEQbTJ + ", footer=" + this.OLrzqt + ", selections=" + this.EZpvd + ", onFooterClickCallback=" + this.KWHzl + ", onItemClickCallback=" + this.copydefault + ")";
    }

    public C7684aoV(java.lang.String str, java.lang.String str2, java.lang.String str3, @NotNull java.util.List<C7766apy> list, View.OnClickListener onClickListener, AdapterView.OnItemClickListener onItemClickListener) {
        Intrinsics.checkNotNullParameter(list, "");
        this.AYXKKw = str;
        this.AEQbTJ = str2;
        this.OLrzqt = str3;
        this.EZpvd = list;
        this.KWHzl = onClickListener;
        this.copydefault = onItemClickListener;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0034: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r12v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r6v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0008: ARITH (r12v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r7v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000f: ARITH (r12v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r8v0 java.lang.String))
  (wrap:java.util.List:0x001f: TERNARY null = ((wrap:int:0x0016: ARITH (r12v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x001c: CONSTRUCTOR  A[MD:():void (c), WRAPPED] (LINE:10) call: java.util.ArrayList.<init>():void type: CONSTRUCTOR) : (r9v0 java.util.List))
  (wrap:android.view.View$OnClickListener:?: TERNARY null = ((wrap:int:0x0020: ARITH (r12v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null android.view.View$OnClickListener) : (r10v0 android.view.View$OnClickListener))
  (wrap:android.widget.AdapterView$OnItemClickListener:?: TERNARY null = ((wrap:int:0x0027: ARITH (r12v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null android.widget.AdapterView$OnItemClickListener) : (r11v0 android.widget.AdapterView$OnItemClickListener))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.util.List<o.apy>, android.view.View$OnClickListener, android.widget.AdapterView$OnItemClickListener):void (m)] (LINE:6) call: o.aoV.<init>(java.lang.String, java.lang.String, java.lang.String, java.util.List, android.view.View$OnClickListener, android.widget.AdapterView$OnItemClickListener):void type: THIS */
    public /* synthetic */ C7684aoV(java.lang.String str, java.lang.String str2, java.lang.String str3, java.util.List list, View.OnClickListener onClickListener, AdapterView.OnItemClickListener onItemClickListener, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? new java.util.ArrayList() : list, (i & 16) != 0 ? null : onClickListener, (i & 32) != 0 ? null : onItemClickListener);
    }
}
