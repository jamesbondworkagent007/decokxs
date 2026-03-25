package o;

import androidx.core.graphics.drawable.DrawableCompat;
import com.okinc.dexkline.market.features.tag.domain.TagWrapper;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nfI, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C34604nfI {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int EZpvd = 8;
    public final java.lang.Integer AEQbTJ;
    public final java.lang.String AhwBna;
    public final android.graphics.drawable.Drawable KWHzl;
    public final java.lang.String OLrzqt;
    public final java.lang.String copydefault;
    public final android.text.SpannedString djBIcL;
    public final boolean valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C34604nfI copy$default(C34604nfI c34604nfI, java.lang.String str, java.lang.String str2, android.graphics.drawable.Drawable drawable, android.text.SpannedString spannedString, boolean z, java.lang.Integer num, java.lang.String str3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = c34604nfI.AhwBna;
        }
        if ((i & 2) != 0) {
            str2 = c34604nfI.OLrzqt;
        }
        java.lang.String str4 = str2;
        if ((i & 4) != 0) {
            drawable = c34604nfI.KWHzl;
        }
        android.graphics.drawable.Drawable drawable2 = drawable;
        if ((i & 8) != 0) {
            spannedString = c34604nfI.djBIcL;
        }
        android.text.SpannedString spannedString2 = spannedString;
        if ((i & 16) != 0) {
            z = c34604nfI.valueOf;
        }
        boolean z2 = z;
        if ((i & 32) != 0) {
            num = c34604nfI.AEQbTJ;
        }
        java.lang.Integer num2 = num;
        if ((i & 64) != 0) {
            str3 = c34604nfI.copydefault;
        }
        return c34604nfI.EZpvd(str, str4, drawable2, spannedString2, z2, num2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C34604nfI EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2, android.graphics.drawable.Drawable drawable, @NotNull android.text.SpannedString spannedString, boolean z, java.lang.Integer num, @NotNull java.lang.String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(spannedString, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new C34604nfI(str, str2, drawable, spannedString, z, num, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Integer KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final android.graphics.drawable.Drawable copydefault() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final android.text.SpannedString gEmmrt() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.AhwBna.hashCode();
        int iHashCode2 = this.OLrzqt.hashCode();
        android.graphics.drawable.Drawable drawable = this.KWHzl;
        int iHashCode3 = drawable == null ? 0 : drawable.hashCode();
        int iHashCode4 = this.djBIcL.hashCode();
        int iHashCode5 = java.lang.Boolean.hashCode(this.valueOf);
        java.lang.Integer num = this.AEQbTJ;
        return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (num != null ? num.hashCode() : 0)) * 31) + this.copydefault.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        java.lang.String str = this.AhwBna;
        java.lang.String str2 = this.OLrzqt;
        android.graphics.drawable.Drawable drawable = this.KWHzl;
        android.text.SpannedString spannedString = this.djBIcL;
        return "TagUiModel(key=" + str + ", icon=" + str2 + ", defaultIcon=" + drawable + ", text=" + ((java.lang.Object) spannedString) + ", showText=" + this.valueOf + ", iconTint=" + this.AEQbTJ + ", description=" + this.copydefault + ")";
    }

    public C34604nfI(@NotNull java.lang.String str, @NotNull java.lang.String str2, android.graphics.drawable.Drawable drawable, @NotNull android.text.SpannedString spannedString, boolean z, java.lang.Integer num, @NotNull java.lang.String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(spannedString, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.AhwBna = str;
        this.OLrzqt = str2;
        this.KWHzl = drawable;
        this.djBIcL = spannedString;
        this.valueOf = z;
        this.AEQbTJ = num;
        this.copydefault = str3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0038: CONSTRUCTOR 
  (r8v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r15v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r9v0 java.lang.String))
  (wrap:android.graphics.drawable.Drawable:?: TERNARY null = ((wrap:int:0x0009: ARITH (r15v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null android.graphics.drawable.Drawable) : (r10v0 android.graphics.drawable.Drawable))
  (wrap:android.text.SpannedString:?: TERNARY null = ((wrap:int:0x0011: ARITH (r15v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0017: CONSTRUCTOR ("") A[MD:(java.lang.CharSequence):void (c), WRAPPED] (LINE:28) call: android.text.SpannedString.<init>(java.lang.CharSequence):void type: CONSTRUCTOR) : (r11v0 android.text.SpannedString))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x001c: ARITH (r15v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? true : (r12v0 boolean))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0023: ARITH (r15v0 int) & (32 int) A[WRAPPED]) == (0 int)) ? (r13v0 java.lang.Integer) : (null java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0029: ARITH (r15v0 int) & (64 int) A[WRAPPED]) == (0 int)) ? (r14v0 java.lang.String) : (""))
 A[MD:(java.lang.String, java.lang.String, android.graphics.drawable.Drawable, android.text.SpannedString, boolean, java.lang.Integer, java.lang.String):void (m)] (LINE:24) call: o.nfI.<init>(java.lang.String, java.lang.String, android.graphics.drawable.Drawable, android.text.SpannedString, boolean, java.lang.Integer, java.lang.String):void type: THIS */
    public /* synthetic */ C34604nfI(java.lang.String str, java.lang.String str2, android.graphics.drawable.Drawable drawable, android.text.SpannedString spannedString, boolean z, java.lang.Integer num, java.lang.String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? null : drawable, (i & 8) != 0 ? new android.text.SpannedString("") : spannedString, (i & 16) != 0 ? true : z, (i & 32) == 0 ? num : null, (i & 64) == 0 ? str3 : "");
    }

    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof C34604nfI)) {
            return false;
        }
        C34604nfI c34604nfI = (C34604nfI) obj;
        boolean zEZpvd = Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) c34604nfI.OLrzqt);
        return !this.valueOf ? zEZpvd : zEZpvd && Intrinsics.EZpvd(this.djBIcL, c34604nfI.djBIcL);
    }

    /* JADX INFO: renamed from: o.nfI$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.nfI.StateListAnimator.<init>():void type: THIS */
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
            return stateListAnimator.OLrzqt(list, z, context);
        }

        public static /* synthetic */ C34604nfI buildCustomIcon$default(StateListAnimator stateListAnimator, android.graphics.drawable.Drawable drawable, java.lang.String str, java.lang.String str2, java.lang.Integer num, java.lang.Integer num2, int i, java.lang.Object obj) {
            if ((i & 8) != 0) {
                num = null;
            }
            java.lang.Integer num3 = num;
            if ((i & 16) != 0) {
                num2 = java.lang.Integer.valueOf(C33070mpX.copydefault(C52761wXj.Activity.fdOvFl));
            }
            return stateListAnimator.OLrzqt(drawable, str, str2, num3, num2);
        }

        public final C34604nfI OLrzqt(@NotNull android.graphics.drawable.Drawable drawable, @NotNull java.lang.String str, @NotNull java.lang.String str2, @androidx.annotation.ColorRes java.lang.Integer num, @androidx.annotation.ColorRes java.lang.Integer num2) {
            Intrinsics.checkNotNullParameter(drawable, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            if (num != null) {
                DrawableCompat.setTint(drawable, num.intValue());
            }
            android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder();
            spannableStringBuilder.append((java.lang.CharSequence) str);
            if (num2 != null) {
                spannableStringBuilder.setSpan(new android.text.style.ForegroundColorSpan(num2.intValue()), 0, str.length(), 33);
            }
            return new C34604nfI("", "", drawable, new android.text.SpannedString(spannableStringBuilder), false, null, str2, 48, null);
        }

        public final java.util.List<C34604nfI> OLrzqt(@NotNull java.util.List<TagWrapper> list, boolean z, android.content.Context context) {
            Intrinsics.checkNotNullParameter(list, "");
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                C34604nfI c34604nfIAEQbTJ = C34609nfN.AEQbTJ((TagWrapper) it.next(), z, context);
                if (c34604nfIAEQbTJ != null) {
                    arrayList.add(c34604nfIAEQbTJ);
                }
            }
            return arrayList;
        }
    }
}
