package o;

import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import com.okinc.business.market.features.tag.domain.TagGroup;
import com.okinc.business.market.features.tag.domain.TagWrapper;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kNw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C28072kNw {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int EZpvd = 8;
    public final java.lang.String AEQbTJ;
    public final java.lang.Integer AYXKKw;
    public final TagGroup AhwBna;
    public final boolean KWHzl;
    public final android.graphics.drawable.Drawable OLrzqt;
    public final java.lang.String copydefault;
    public final boolean djBIcL;
    public final java.lang.String gEmmrt;
    public final android.text.SpannedString valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final android.graphics.drawable.Drawable AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TagGroup AYXKKw() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C28072kNw KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, android.graphics.drawable.Drawable drawable, @NotNull android.text.SpannedString spannedString, boolean z, java.lang.Integer num, @NotNull java.lang.String str3, boolean z2, @NotNull TagGroup tagGroup) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(spannedString, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(tagGroup, "");
        return new C28072kNw(str, str2, drawable, spannedString, z, num, str3, z2, tagGroup);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Integer copydefault() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.gEmmrt.hashCode();
        int iHashCode2 = this.AEQbTJ.hashCode();
        android.graphics.drawable.Drawable drawable = this.OLrzqt;
        int iHashCode3 = drawable == null ? 0 : drawable.hashCode();
        int iHashCode4 = this.valueOf.hashCode();
        int iHashCode5 = java.lang.Boolean.hashCode(this.djBIcL);
        java.lang.Integer num = this.AYXKKw;
        return (((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (num != null ? num.hashCode() : 0)) * 31) + this.copydefault.hashCode()) * 31) + java.lang.Boolean.hashCode(this.KWHzl)) * 31) + this.AhwBna.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        java.lang.String str = this.gEmmrt;
        java.lang.String str2 = this.AEQbTJ;
        android.graphics.drawable.Drawable drawable = this.OLrzqt;
        android.text.SpannedString spannedString = this.valueOf;
        return "TagUiModel(key=" + str + ", icon=" + str2 + ", defaultIcon=" + drawable + ", text=" + ((java.lang.Object) spannedString) + ", showText=" + this.djBIcL + ", iconTint=" + this.AYXKKw + ", description=" + this.copydefault + ", forceRoundingIcon=" + this.KWHzl + ", tagShowGroup=" + this.AhwBna + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final android.text.SpannedString valueOf() {
        return this.valueOf;
    }

    public C28072kNw(@NotNull java.lang.String str, @NotNull java.lang.String str2, android.graphics.drawable.Drawable drawable, @NotNull android.text.SpannedString spannedString, boolean z, java.lang.Integer num, @NotNull java.lang.String str3, boolean z2, @NotNull TagGroup tagGroup) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(spannedString, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(tagGroup, "");
        this.gEmmrt = str;
        this.AEQbTJ = str2;
        this.OLrzqt = drawable;
        this.valueOf = spannedString;
        this.djBIcL = z;
        this.AYXKKw = num;
        this.copydefault = str3;
        this.KWHzl = z2;
        this.AhwBna = tagGroup;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0050: CONSTRUCTOR 
  (r9v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r18v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r10v0 java.lang.String))
  (wrap:android.graphics.drawable.Drawable:?: TERNARY null = ((wrap:int:0x000b: ARITH (r18v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null android.graphics.drawable.Drawable) : (r11v0 android.graphics.drawable.Drawable))
  (wrap:android.text.SpannedString:?: TERNARY null = ((wrap:int:0x0013: ARITH (r18v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0019: CONSTRUCTOR ("") A[MD:(java.lang.CharSequence):void (c), WRAPPED] (LINE:24) call: android.text.SpannedString.<init>(java.lang.CharSequence):void type: CONSTRUCTOR) : (r12v0 android.text.SpannedString))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x001e: ARITH (r18v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? true : (r13v0 boolean))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0025: ARITH (r18v0 int) & (32 int) A[WRAPPED]) == (0 int)) ? (r14v0 java.lang.Integer) : (null java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002b: ARITH (r18v0 int) & (64 int) A[WRAPPED]) == (0 int)) ? (r15v0 java.lang.String) : (""))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0031: ARITH (r18v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? false : (r16v0 boolean))
  (wrap:com.okinc.business.market.features.tag.domain.TagGroup:?: TERNARY null = ((wrap:int:0x0039: ARITH (r18v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x003d: SGET  A[WRAPPED] (LINE:29) com.okinc.business.market.features.tag.domain.TagGroup.NONE com.okinc.business.market.features.tag.domain.TagGroup) : (r17v0 com.okinc.business.market.features.tag.domain.TagGroup))
 A[MD:(java.lang.String, java.lang.String, android.graphics.drawable.Drawable, android.text.SpannedString, boolean, java.lang.Integer, java.lang.String, boolean, com.okinc.business.market.features.tag.domain.TagGroup):void (m)] (LINE:20) call: o.kNw.<init>(java.lang.String, java.lang.String, android.graphics.drawable.Drawable, android.text.SpannedString, boolean, java.lang.Integer, java.lang.String, boolean, com.okinc.business.market.features.tag.domain.TagGroup):void type: THIS */
    public /* synthetic */ C28072kNw(java.lang.String str, java.lang.String str2, android.graphics.drawable.Drawable drawable, android.text.SpannedString spannedString, boolean z, java.lang.Integer num, java.lang.String str3, boolean z2, TagGroup tagGroup, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? null : drawable, (i & 8) != 0 ? new android.text.SpannedString("") : spannedString, (i & 16) != 0 ? true : z, (i & 32) == 0 ? num : null, (i & 64) == 0 ? str3 : "", (i & 128) != 0 ? false : z2, (i & 256) != 0 ? TagGroup.NONE : tagGroup);
    }

    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof C28072kNw)) {
            return false;
        }
        C28072kNw c28072kNw = (C28072kNw) obj;
        boolean zEZpvd = Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) c28072kNw.AEQbTJ);
        return !this.djBIcL ? zEZpvd : zEZpvd && Intrinsics.EZpvd(this.valueOf, c28072kNw.valueOf);
    }

    /* JADX INFO: renamed from: o.kNw$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.kNw.StateListAnimator.<init>():void type: THIS */
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
            return stateListAnimator.KWHzl(list, z, context);
        }

        public final C28072kNw copydefault(@NotNull android.content.Context context, @androidx.annotation.DrawableRes int i, @androidx.annotation.ColorRes java.lang.Integer num, @androidx.annotation.StringRes int i2) {
            Intrinsics.checkNotNullParameter(context, "");
            android.graphics.drawable.Drawable drawable = ContextCompat.getDrawable(context, i);
            if (drawable != null && num != null) {
                DrawableCompat.setTint(drawable, C25382ivf.copydefault(num.intValue(), context));
            }
            android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder();
            spannableStringBuilder.append(context.getText(i2));
            return new C28072kNw("", "", drawable, new android.text.SpannedString(spannableStringBuilder), false, null, null, false, TagGroup.NONE, PsExtractor.VIDEO_STREAM_MASK, null);
        }

        public final java.util.List<C28072kNw> KWHzl(@NotNull java.util.List<TagWrapper> list, boolean z, android.content.Context context) {
            Intrinsics.checkNotNullParameter(list, "");
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                C28072kNw c28072kNwEZpvd = C28074kNy.EZpvd((TagWrapper) it.next(), z, context);
                if (c28072kNwEZpvd != null) {
                    arrayList.add(c28072kNwEZpvd);
                }
            }
            return arrayList;
        }
    }
}
