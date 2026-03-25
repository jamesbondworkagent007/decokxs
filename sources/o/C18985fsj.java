package o;

import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import com.okinc.business.defi.wallet.mine.search.data.model.TagWrapper;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fsj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C18985fsj {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int EZpvd = 8;
    public final java.lang.String AEQbTJ;
    public final android.text.SpannedString AhwBna;
    public final android.graphics.drawable.Drawable KWHzl;
    public final java.lang.String OLrzqt;
    public final java.lang.Integer copydefault;
    public final java.lang.String djBIcL;
    public final java.lang.String gEmmrt;
    public final boolean valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Integer AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final android.text.SpannedString EZpvd() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C18985fsj EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, android.graphics.drawable.Drawable drawable, @NotNull android.text.SpannedString spannedString, boolean z, java.lang.Integer num, @NotNull java.lang.String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(spannedString, "");
        Intrinsics.checkNotNullParameter(str4, "");
        return new C18985fsj(str, str2, str3, drawable, spannedString, z, num, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final android.graphics.drawable.Drawable KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.gEmmrt.hashCode();
        int iHashCode2 = this.OLrzqt.hashCode();
        int iHashCode3 = this.djBIcL.hashCode();
        android.graphics.drawable.Drawable drawable = this.KWHzl;
        int iHashCode4 = drawable == null ? 0 : drawable.hashCode();
        int iHashCode5 = this.AhwBna.hashCode();
        int iHashCode6 = java.lang.Boolean.hashCode(this.valueOf);
        java.lang.Integer num = this.copydefault;
        return (((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + (num != null ? num.hashCode() : 0)) * 31) + this.AEQbTJ.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        java.lang.String str = this.gEmmrt;
        java.lang.String str2 = this.OLrzqt;
        java.lang.String str3 = this.djBIcL;
        android.graphics.drawable.Drawable drawable = this.KWHzl;
        android.text.SpannedString spannedString = this.AhwBna;
        return "TagUiModel(key=" + str + ", icon=" + str2 + ", title=" + str3 + ", defaultIcon=" + drawable + ", text=" + ((java.lang.Object) spannedString) + ", showText=" + this.valueOf + ", iconTint=" + this.copydefault + ", description=" + this.AEQbTJ + ")";
    }

    public C18985fsj(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, android.graphics.drawable.Drawable drawable, @NotNull android.text.SpannedString spannedString, boolean z, java.lang.Integer num, @NotNull java.lang.String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(spannedString, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.gEmmrt = str;
        this.OLrzqt = str2;
        this.djBIcL = str3;
        this.KWHzl = drawable;
        this.AhwBna = spannedString;
        this.valueOf = z;
        this.copydefault = num;
        this.AEQbTJ = str4;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0047: CONSTRUCTOR 
  (r10v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r18v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r11v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r18v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r12v0 java.lang.String))
  (wrap:android.graphics.drawable.Drawable:?: TERNARY null = ((wrap:int:0x0012: ARITH (r18v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null android.graphics.drawable.Drawable) : (r13v0 android.graphics.drawable.Drawable))
  (wrap:android.text.SpannedString:?: TERNARY null = ((wrap:int:0x001a: ARITH (r18v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0020: CONSTRUCTOR ("") A[MD:(java.lang.CharSequence):void (c), WRAPPED] (LINE:26) call: android.text.SpannedString.<init>(java.lang.CharSequence):void type: CONSTRUCTOR) : (r14v0 android.text.SpannedString))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0025: ARITH (r18v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? true : (r15v0 boolean))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x002c: ARITH (r18v0 int) & (64 int) A[WRAPPED]) == (0 int)) ? (r16v0 java.lang.Integer) : (null java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0033: ARITH (r18v0 int) & (128 int) A[WRAPPED]) == (0 int)) ? (r17v0 java.lang.String) : (""))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, android.graphics.drawable.Drawable, android.text.SpannedString, boolean, java.lang.Integer, java.lang.String):void (m)] (LINE:21) call: o.fsj.<init>(java.lang.String, java.lang.String, java.lang.String, android.graphics.drawable.Drawable, android.text.SpannedString, boolean, java.lang.Integer, java.lang.String):void type: THIS */
    public /* synthetic */ C18985fsj(java.lang.String str, java.lang.String str2, java.lang.String str3, android.graphics.drawable.Drawable drawable, android.text.SpannedString spannedString, boolean z, java.lang.Integer num, java.lang.String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? null : drawable, (i & 16) != 0 ? new android.text.SpannedString("") : spannedString, (i & 32) != 0 ? true : z, (i & 64) == 0 ? num : null, (i & 128) == 0 ? str4 : "");
    }

    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof C18985fsj)) {
            return false;
        }
        C18985fsj c18985fsj = (C18985fsj) obj;
        boolean zEZpvd = Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) c18985fsj.OLrzqt);
        return !this.valueOf ? zEZpvd : zEZpvd && Intrinsics.EZpvd(this.AhwBna, c18985fsj.AhwBna);
    }

    /* JADX INFO: renamed from: o.fsj$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.fsj.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public static /* synthetic */ java.util.List fromTagWrapperList$default(StateListAnimator stateListAnimator, java.util.List list, boolean z, android.content.Context context, int i, java.lang.Object obj) {
            if ((i & 2) != 0) {
                z = true;
            }
            if ((i & 4) != 0) {
                context = null;
            }
            return stateListAnimator.EZpvd(list, z, context);
        }

        public final C18985fsj copydefault(@NotNull android.content.Context context, @androidx.annotation.DrawableRes int i, @androidx.annotation.ColorRes java.lang.Integer num, @androidx.annotation.StringRes int i2) {
            Intrinsics.checkNotNullParameter(context, "");
            android.graphics.drawable.Drawable drawable = ContextCompat.getDrawable(context, i);
            if (drawable != null && num != null) {
                DrawableCompat.setTint(drawable, ContextCompat.getColor(context, num.intValue()));
            }
            java.lang.String string = context.getString(i2);
            Intrinsics.checkNotNullExpressionValue(string, "");
            return new C18985fsj("", "", string, drawable, null, true, null, "", 16, null);
        }

        /* JADX DEBUG: Class process forced to load method for inline: o.fsr.OLrzqt(com.okinc.business.defi.wallet.mine.search.data.model.TagWrapper, boolean, android.content.Context):o.fsj */
        public final java.util.List<C18985fsj> EZpvd(@NotNull java.util.List<TagWrapper> list, boolean z, android.content.Context context) {
            Intrinsics.checkNotNullParameter(list, "");
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                C18985fsj c18985fsjKWHzl = C18993fsr.KWHzl((TagWrapper) it.next(), z, context);
                if (c18985fsjKWHzl != null) {
                    arrayList.add(c18985fsjKWHzl);
                }
            }
            return arrayList;
        }
    }
}
