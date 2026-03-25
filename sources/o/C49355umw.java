package o;

import androidx.core.content.ContextCompat;
import androidx.core.widget.ImageViewCompat;
import androidx.lifecycle.LifecycleOwner;
import com.okinc.share.bean.LayoutType;
import com.okinc.share.bean.ShareFooterInfo;
import com.okinc.share.view.FootViewTheme;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C32113mPz;
import o.C48894ueL;
import o.C48931uew;
import o.InterfaceC49348ump;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.umw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C49355umw extends android.widget.FrameLayout implements InterfaceC49348ump {
    public FootViewTheme AEQbTJ;
    public final InterfaceC56387yDm AYXKKw;
    public java.lang.CharSequence AhwBna;
    public final InterfaceC56387yDm DbNXlk;
    public boolean EZpvd;
    public boolean KWHzl;
    public boolean OLrzqt;
    public final InterfaceC56387yDm copydefault;
    public java.lang.String djBIcL;
    public final InterfaceC56387yDm fetchVPNInfo;
    public java.lang.CharSequence gEmmrt;
    public android.view.View valueOf;
    public java.lang.String values;

    /* JADX INFO: renamed from: o.umw$TaskDescription */
    public final /* synthetic */ class TaskDescription {
        public static final /* synthetic */ int[] AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[FootViewTheme.values().length];
            try {
                iArr[FootViewTheme.FOLLOW_APP.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[FootViewTheme.FIXED_LIGHT.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[FootViewTheme.FIXED_DARK.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[FootViewTheme.FIXED_VIP.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            AEQbTJ = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC48895ueM
    public boolean EZpvd() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC48895ueM
    public FootViewTheme copydefault() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean fetchVPNInfo() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean isConnected() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC48895ueM
    public void setFrom(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.values = str;
    }

    @Override // o.InterfaceC49348ump, o.InterfaceC48895ueM
    public void KWHzl(LifecycleOwner lifecycleOwner, java.lang.String str, @NotNull C48891ueI c48891ueI, @NotNull Function1<? super C48887ueE, Unit> function1) {
        InterfaceC49348ump.ActionBar.AEQbTJ(this, lifecycleOwner, str, c48891ueI, function1);
    }

    @Override // o.InterfaceC49348ump, o.InterfaceC48895ueM
    public java.lang.String OLrzqt() {
        return InterfaceC49348ump.ActionBar.AEQbTJ(this);
    }

    @Override // o.InterfaceC48895ueM
    public void setIcon(android.graphics.drawable.Drawable drawable) {
        InterfaceC49348ump.ActionBar.KWHzl(this, drawable);
    }

    @Override // o.InterfaceC49348ump
    public void setIconInternal(android.graphics.drawable.Drawable drawable) {
        InterfaceC49348ump.ActionBar.EZpvd(this, drawable);
    }

    @Override // o.InterfaceC49348ump
    public void setQRCodeInternal(java.lang.String str, boolean z) {
        InterfaceC49348ump.ActionBar.AEQbTJ(this, str, z);
    }

    @Override // o.InterfaceC48895ueM
    public void setSrcFrom(@NotNull java.lang.String str, @NotNull Function0<Unit> function0) {
        InterfaceC49348ump.ActionBar.EZpvd(this, str, function0);
    }

    @Override // o.InterfaceC49348ump
    public void setSubTitleInternal(java.lang.CharSequence charSequence) {
        InterfaceC49348ump.ActionBar.EZpvd(this, charSequence);
    }

    @Override // o.InterfaceC49348ump
    public void setTitleInternal(java.lang.CharSequence charSequence) {
        InterfaceC49348ump.ActionBar.OLrzqt(this, charSequence);
    }

    public static final android.widget.ImageView KWHzl(C49355umw c49355umw) {
        android.view.View view = c49355umw.valueOf;
        if (view == null) {
            Intrinsics.gEmmrt("");
            view = null;
        }
        return (android.widget.ImageView) view.findViewById(C48931uew.StateListAnimator.djSkpj);
    }

    @Override // o.InterfaceC49348ump
    public android.widget.ImageView djBIcL() {
        return (android.widget.ImageView) this.copydefault.getValue();
    }

    public static final android.widget.TextView djBIcL(C49355umw c49355umw) {
        android.view.View view = c49355umw.valueOf;
        if (view == null) {
            Intrinsics.gEmmrt("");
            view = null;
        }
        return (android.widget.TextView) view.findViewById(C48931uew.StateListAnimator.gwTjWJ);
    }

    @Override // o.InterfaceC49348ump
    public android.widget.TextView valueOf() {
        return (android.widget.TextView) this.fetchVPNInfo.getValue();
    }

    public static final android.widget.TextView valueOf(C49355umw c49355umw) {
        android.view.View view = c49355umw.valueOf;
        if (view == null) {
            Intrinsics.gEmmrt("");
            view = null;
        }
        return (android.widget.TextView) view.findViewById(C48931uew.StateListAnimator.QkdxfA);
    }

    @Override // o.InterfaceC49348ump
    public android.widget.TextView AYXKKw() {
        return (android.widget.TextView) this.DbNXlk.getValue();
    }

    public static final C6995aZr gEmmrt(C49355umw c49355umw) {
        android.view.View view = c49355umw.valueOf;
        if (view == null) {
            Intrinsics.gEmmrt("");
            view = null;
        }
        return (C6995aZr) view.findViewById(C48931uew.StateListAnimator.gGvvIC);
    }

    @Override // o.InterfaceC49348ump
    public C6995aZr AhwBna() {
        java.lang.Object value = this.AYXKKw.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        return (C6995aZr) value;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C49355umw(@NotNull android.content.Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "");
        this.copydefault = C56392yDr.copydefault(new Function0() { // from class: o.umv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C49355umw.KWHzl(this.KWHzl);
            }
        });
        this.fetchVPNInfo = C56392yDr.copydefault(new Function0() { // from class: o.umy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C49355umw.djBIcL(this.AEQbTJ);
            }
        });
        this.DbNXlk = C56392yDr.copydefault(new Function0() { // from class: o.umA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C49355umw.valueOf(this.copydefault);
            }
        });
        this.AYXKKw = C56392yDr.copydefault(new Function0() { // from class: o.umC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C49355umw.gEmmrt(this.EZpvd);
            }
        });
        this.AEQbTJ = FootViewTheme.FOLLOW_APP;
        AEQbTJ(context, (android.util.AttributeSet) null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C49355umw(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        this.copydefault = C56392yDr.copydefault(new Function0() { // from class: o.umv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C49355umw.KWHzl(this.KWHzl);
            }
        });
        this.fetchVPNInfo = C56392yDr.copydefault(new Function0() { // from class: o.umy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C49355umw.djBIcL(this.AEQbTJ);
            }
        });
        this.DbNXlk = C56392yDr.copydefault(new Function0() { // from class: o.umA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C49355umw.valueOf(this.copydefault);
            }
        });
        this.AYXKKw = C56392yDr.copydefault(new Function0() { // from class: o.umC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C49355umw.gEmmrt(this.EZpvd);
            }
        });
        this.AEQbTJ = FootViewTheme.FOLLOW_APP;
        AEQbTJ(context, attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C49355umw(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.copydefault = C56392yDr.copydefault(new Function0() { // from class: o.umv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C49355umw.KWHzl(this.KWHzl);
            }
        });
        this.fetchVPNInfo = C56392yDr.copydefault(new Function0() { // from class: o.umy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C49355umw.djBIcL(this.AEQbTJ);
            }
        });
        this.DbNXlk = C56392yDr.copydefault(new Function0() { // from class: o.umA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C49355umw.valueOf(this.copydefault);
            }
        });
        this.AYXKKw = C56392yDr.copydefault(new Function0() { // from class: o.umC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C49355umw.gEmmrt(this.EZpvd);
            }
        });
        this.AEQbTJ = FootViewTheme.FOLLOW_APP;
        AEQbTJ(context, attributeSet);
    }

    public final void AEQbTJ(android.content.Context context, android.util.AttributeSet attributeSet) {
        this.valueOf = android.view.LayoutInflater.from(context).inflate(C48931uew.Application.zLjUOn, this).findViewById(C48931uew.StateListAnimator.gasjUx);
        int i = context.getApplicationContext().getResources().getConfiguration().getLayoutDirection() == 1 ? 1 : 0;
        android.view.View view = this.valueOf;
        if (view == null) {
            Intrinsics.gEmmrt("");
            view = null;
        }
        view.setLayoutDirection(i);
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C32113mPz.PendingIntent.UeEOUB);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "");
        InterfaceC49000ugL interfaceC49000ugLDTwDnp = ((InterfaceC48893ueK) C43251rlk.copydefault(InterfaceC48893ueK.class)).DTwDnp();
        java.lang.CharSequence text = typedArrayObtainStyledAttributes.getText(C32113mPz.PendingIntent.RcXXUw);
        java.lang.String string = text != null ? text.toString() : null;
        setFrom(string != null ? string : "");
        copydefault(context, attributeSet);
        android.graphics.drawable.Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(C32113mPz.PendingIntent.dvKsVJ);
        if (drawable == null) {
            drawable = interfaceC49000ugLDTwDnp.gEmmrt();
        }
        setIconInternal(drawable);
        java.lang.CharSequence text2 = typedArrayObtainStyledAttributes.getText(C32113mPz.PendingIntent.finit);
        java.lang.CharSequence charSequenceAYXKKw = interfaceC49000ugLDTwDnp.AYXKKw();
        if (text2 == null) {
            text2 = charSequenceAYXKKw;
        }
        this.gEmmrt = text2;
        setTitleInternal(text2);
        java.lang.CharSequence text3 = typedArrayObtainStyledAttributes.getText(C32113mPz.PendingIntent.fFgQHt);
        java.lang.CharSequence charSequenceAhwBna = interfaceC49000ugLDTwDnp.AhwBna();
        if (text3 == null) {
            text3 = charSequenceAhwBna;
        }
        this.AhwBna = text3;
        setSubTitleInternal(text3);
        java.lang.CharSequence text4 = typedArrayObtainStyledAttributes.getText(C32113mPz.PendingIntent.fZBcTu);
        java.lang.String string2 = text4 != null ? text4.toString() : null;
        java.lang.String strDjBIcL = interfaceC49000ugLDTwDnp.djBIcL();
        if (string2 == null) {
            string2 = strDjBIcL;
        }
        this.djBIcL = string2;
        if (((InterfaceC33171mrS) C43251rlk.copydefault(InterfaceC33171mrS.class)).fIwbmz()) {
            setQRCodeInternal(this.djBIcL, true);
            if (gEmmrt()) {
                setVisibility(8);
                return;
            }
            return;
        }
        setQRCodeInternal(this.djBIcL, ShareFooterInfo.Companion.AEQbTJ(((InterfaceC48893ueK) C43251rlk.copydefault(InterfaceC48893ueK.class)).zuBGHE().getReferralFooterInfo()) != LayoutType.TYPE3);
    }

    @Override // o.InterfaceC48895ueM
    public void setTheme(@NotNull FootViewTheme footViewTheme) {
        Intrinsics.checkNotNullParameter(footViewTheme, "");
        android.content.Context context = getContext();
        Intrinsics.copydefault(context);
        KWHzl(footViewTheme, copydefault(context, footViewTheme), KWHzl(context, footViewTheme), OLrzqt(context, footViewTheme), AEQbTJ(context, footViewTheme));
    }

    public final boolean gEmmrt() {
        java.lang.CharSequence charSequence;
        java.lang.String str;
        java.lang.CharSequence charSequence2 = this.gEmmrt;
        return (charSequence2 == null || charSequence2.length() == 0) && ((charSequence = this.AhwBna) == null || charSequence.length() == 0) && ((str = this.djBIcL) == null || str.length() == 0);
    }

    @Override // o.InterfaceC48895ueM
    public void setTitle(java.lang.CharSequence charSequence) {
        this.KWHzl = true;
        InterfaceC49348ump.ActionBar.copydefault(this, charSequence);
    }

    @Override // o.InterfaceC48895ueM
    public void setSubTitle(java.lang.CharSequence charSequence) {
        this.OLrzqt = true;
        InterfaceC49348ump.ActionBar.AEQbTJ(this, charSequence);
    }

    @Override // o.InterfaceC48895ueM
    public boolean KWHzl() {
        return isConnected() || EZpvd() || fetchVPNInfo();
    }

    public final void copydefault(android.content.Context context, android.util.AttributeSet attributeSet) {
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C48894ueL.Activity.OLrzqt);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "");
        try {
            try {
                android.graphics.drawable.Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(C48894ueL.Activity.EZpvd);
                android.view.View view = null;
                if (drawable != null) {
                    android.view.View view2 = this.valueOf;
                    if (view2 == null) {
                        Intrinsics.gEmmrt("");
                    } else {
                        view = view2;
                    }
                    view.setBackground(drawable);
                } else {
                    android.view.View view3 = this.valueOf;
                    if (view3 == null) {
                        Intrinsics.gEmmrt("");
                    } else {
                        view = view3;
                    }
                    view.setBackgroundResource(C48894ueL.ActionBar.EZpvd);
                }
                android.content.res.ColorStateList colorStateList = typedArrayObtainStyledAttributes.getColorStateList(C48894ueL.Activity.valueOf);
                if (colorStateList != null) {
                    android.widget.TextView textViewValueOf = valueOf();
                    if (textViewValueOf != null) {
                        textViewValueOf.setTextColor(colorStateList);
                    }
                } else {
                    android.widget.TextView textViewValueOf2 = valueOf();
                    if (textViewValueOf2 != null) {
                        textViewValueOf2.setTextColor(ContextCompat.getColor(context, C48894ueL.TaskDescription.djBIcL));
                    }
                }
                android.content.res.ColorStateList colorStateList2 = typedArrayObtainStyledAttributes.getColorStateList(C48894ueL.Activity.copydefault);
                if (colorStateList2 != null) {
                    android.widget.TextView textViewAYXKKw = AYXKKw();
                    if (textViewAYXKKw != null) {
                        textViewAYXKKw.setTextColor(colorStateList2);
                    }
                } else {
                    android.widget.TextView textViewAYXKKw2 = AYXKKw();
                    if (textViewAYXKKw2 != null) {
                        textViewAYXKKw2.setTextColor(ContextCompat.getColor(context, C48894ueL.TaskDescription.OLrzqt));
                    }
                }
                android.widget.ImageView imageViewDjBIcL = djBIcL();
                if (imageViewDjBIcL != null) {
                    android.content.res.ColorStateList colorStateList3 = typedArrayObtainStyledAttributes.getColorStateList(C48894ueL.Activity.KWHzl);
                    if (colorStateList3 != null) {
                        ImageViewCompat.setImageTintList(imageViewDjBIcL, colorStateList3);
                    } else {
                        ImageViewCompat.setImageTintList(imageViewDjBIcL, ContextCompat.getColorStateList(context, C48894ueL.TaskDescription.AEQbTJ));
                    }
                }
                int i = C48894ueL.Activity.AEQbTJ;
                FootViewTheme footViewTheme = FootViewTheme.FOLLOW_APP;
                int i2 = typedArrayObtainStyledAttributes.getInt(i, footViewTheme.getTheme());
                FootViewTheme footViewThemeValueOf = FootViewTheme.CREATOR.valueOf(i2);
                if (footViewThemeValueOf != null) {
                    footViewTheme = footViewThemeValueOf;
                }
                this.AEQbTJ = footViewTheme;
                pUU.KWHzl("FootView", "loadDefaultTheme-> themeValue:" + i2 + "  footViewTheme:" + footViewThemeValueOf + "  getTheme:" + copydefault());
            } catch (java.lang.Exception e) {
                e.printStackTrace();
                pUU.copydefault("FootView", "loadDefaultTheme-> error:" + e.getMessage());
            }
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public final void KWHzl(FootViewTheme footViewTheme, android.graphics.drawable.Drawable drawable, android.content.res.ColorStateList colorStateList, android.content.res.ColorStateList colorStateList2, android.content.res.ColorStateList colorStateList3) {
        android.widget.TextView textViewAYXKKw;
        android.widget.TextView textViewValueOf;
        android.view.View view = this.valueOf;
        if (view == null) {
            Intrinsics.gEmmrt("");
            view = null;
        }
        view.setBackground(drawable);
        if (colorStateList != null && (textViewValueOf = valueOf()) != null) {
            textViewValueOf.setTextColor(colorStateList);
        }
        if (colorStateList2 != null && (textViewAYXKKw = AYXKKw()) != null) {
            textViewAYXKKw.setTextColor(colorStateList2);
        }
        android.widget.ImageView imageViewDjBIcL = djBIcL();
        if (imageViewDjBIcL != null) {
            ImageViewCompat.setImageTintList(imageViewDjBIcL, colorStateList3);
        }
        this.AEQbTJ = footViewTheme;
        pUU.KWHzl("FootView", "updateFooterTheme-> theme:" + footViewTheme);
        setQRCodeInternal(OLrzqt(), true);
    }

    public final android.graphics.drawable.Drawable copydefault(android.content.Context context, FootViewTheme footViewTheme) {
        int i = TaskDescription.AEQbTJ[footViewTheme.ordinal()];
        if (i == 1) {
            return ContextCompat.getDrawable(context, C48894ueL.ActionBar.EZpvd);
        }
        if (i == 2) {
            return ContextCompat.getDrawable(context, C48894ueL.ActionBar.iwGUEr);
        }
        if (i == 3) {
            return ContextCompat.getDrawable(context, C48894ueL.ActionBar.hDKMBd);
        }
        if (i != 4) {
            throw new NoWhenBranchMatchedException();
        }
        return ContextCompat.getDrawable(context, C48894ueL.ActionBar.copydefault);
    }

    public final android.content.res.ColorStateList KWHzl(android.content.Context context, FootViewTheme footViewTheme) {
        int i = TaskDescription.AEQbTJ[footViewTheme.ordinal()];
        if (i == 1) {
            return ContextCompat.getColorStateList(context, C48894ueL.TaskDescription.djBIcL);
        }
        if (i == 2) {
            return ContextCompat.getColorStateList(context, C48894ueL.TaskDescription.fetchVPNInfo);
        }
        if (i == 3) {
            return ContextCompat.getColorStateList(context, C48894ueL.TaskDescription.valueOf);
        }
        if (i != 4) {
            throw new NoWhenBranchMatchedException();
        }
        return ContextCompat.getColorStateList(context, C48894ueL.TaskDescription.DbNXlk);
    }

    public final android.content.res.ColorStateList OLrzqt(android.content.Context context, FootViewTheme footViewTheme) {
        int i = TaskDescription.AEQbTJ[footViewTheme.ordinal()];
        if (i == 1) {
            return ContextCompat.getColorStateList(context, C48894ueL.TaskDescription.OLrzqt);
        }
        if (i == 2) {
            return ContextCompat.getColorStateList(context, C48894ueL.TaskDescription.AhwBna);
        }
        if (i == 3) {
            return ContextCompat.getColorStateList(context, C48894ueL.TaskDescription.AYXKKw);
        }
        if (i != 4) {
            throw new NoWhenBranchMatchedException();
        }
        return ContextCompat.getColorStateList(context, C48894ueL.TaskDescription.gEmmrt);
    }

    public final android.content.res.ColorStateList AEQbTJ(android.content.Context context, FootViewTheme footViewTheme) {
        int i = TaskDescription.AEQbTJ[footViewTheme.ordinal()];
        if (i == 1) {
            return ContextCompat.getColorStateList(context, C48894ueL.TaskDescription.AEQbTJ);
        }
        if (i == 2) {
            return ContextCompat.getColorStateList(context, C48894ueL.TaskDescription.copydefault);
        }
        if (i == 3) {
            return ContextCompat.getColorStateList(context, C48894ueL.TaskDescription.KWHzl);
        }
        if (i != 4) {
            throw new NoWhenBranchMatchedException();
        }
        return ContextCompat.getColorStateList(context, C48894ueL.TaskDescription.EZpvd);
    }

    @Override // o.InterfaceC48895ueM
    public void setQRCode(java.lang.String str) {
        pUU.KWHzl("FootView", "setQRCode-> qrcode:" + str + " from:" + AEQbTJ() + " content:" + str);
        this.EZpvd = true;
        setQRCodeInternal(str, true);
    }

    @Override // o.InterfaceC48895ueM
    public java.lang.String AEQbTJ() {
        java.lang.String str = this.values;
        if (str != null) {
            return str;
        }
        Intrinsics.gEmmrt("");
        return null;
    }
}
