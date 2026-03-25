package o;

import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.core.widget.ImageViewCompat;
import androidx.core.widget.TextViewCompat;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import com.okinc.business.dexlogic.bean.MevUnstableShowLevelType;
import com.okinc.business.dexlogic.bean.PresetRouteType;
import com.okinc.business.dexlogic.bean.PriorityFeeType;
import com.okinc.business.dexui.main.swap.widget.slippage.SlippageMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import o.C32113mPz;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.iug, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C25330iug extends AbstractC24459ieI {
    public java.lang.String AEQbTJ;
    public java.lang.String AYXKKw;
    public SlippageMode AhwBna;
    public java.lang.Boolean EZpvd;
    public boolean KWHzl;
    public C21585hEv OLrzqt;
    public boolean copydefault;
    public java.lang.String gEmmrt;
    public boolean isConnected;
    public java.lang.String values;

    /* JADX INFO: renamed from: o.iug$Application */
    public final /* synthetic */ class Application {
        public static final /* synthetic */ int[] AEQbTJ;
        public static final /* synthetic */ int[] KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[PriorityFeeType.values().length];
            try {
                iArr[PriorityFeeType.PriorityMarket.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[PriorityFeeType.PriorityFast.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[PriorityFeeType.PriorityTurbo.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[PriorityFeeType.PriorityCustom.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            KWHzl = iArr;
            int[] iArr2 = new int[SlippageMode.values().length];
            try {
                iArr2[SlippageMode.Dynamic.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr2[SlippageMode.Fixed.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            AEQbTJ = iArr2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C25330iug(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        KWHzl();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C25330iug(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C25330iug(@NotNull android.content.Context context) {
        this(context, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    private final void KWHzl() {
        C21585hEv c21585hEvCopydefault = C21585hEv.copydefault(android.view.LayoutInflater.from(getContext()), DbNXlk(), true);
        this.OLrzqt = c21585hEvCopydefault;
        AppCompatTextView appCompatTextView = c21585hEvCopydefault != null ? c21585hEvCopydefault.isConnected : null;
        Intrinsics.copydefault(appCompatTextView);
        C25352ivB.KWHzl(appCompatTextView, ContextCompat.getDrawable(getContext(), C52761wXj.TaskDescription.Slwtri), getResources().getDimensionPixelSize(C32113mPz.StateListAnimator.gEmmrt));
        C21585hEv c21585hEv = this.OLrzqt;
        C25352ivB.KWHzl(c21585hEv != null ? c21585hEv.AuCTel : null, ContextCompat.getDrawable(getContext(), C52761wXj.TaskDescription.pause), getResources().getDimensionPixelSize(C32113mPz.StateListAnimator.gEmmrt));
        C21585hEv c21585hEv2 = this.OLrzqt;
        C25352ivB.KWHzl(c21585hEv2 != null ? c21585hEv2.fetchVPNInfo : null, ContextCompat.getDrawable(getContext(), C52761wXj.TaskDescription.dhOYXF), getResources().getDimensionPixelSize(C32113mPz.StateListAnimator.AkhnZx));
        C21585hEv c21585hEv3 = this.OLrzqt;
        C25352ivB.KWHzl(c21585hEv3 != null ? c21585hEv3.DbNXlk : null, ContextCompat.getDrawable(getContext(), C52761wXj.TaskDescription.Slwtri), getResources().getDimensionPixelSize(C32113mPz.StateListAnimator.gEmmrt));
        C21585hEv c21585hEv4 = this.OLrzqt;
        C25352ivB.KWHzl(c21585hEv4 != null ? c21585hEv4.ejfBZ : null, ContextCompat.getDrawable(getContext(), C52761wXj.TaskDescription.pause), getResources().getDimensionPixelSize(C32113mPz.StateListAnimator.gEmmrt));
        C21585hEv c21585hEv5 = this.OLrzqt;
        C25352ivB.KWHzl(c21585hEv5 != null ? c21585hEv5.fJNWhG : null, ContextCompat.getDrawable(getContext(), C52761wXj.TaskDescription.dhOYXF), getResources().getDimensionPixelSize(C32113mPz.StateListAnimator.AkhnZx));
        gEmmrt();
    }

    public final void setPriorityFeeValue(@NotNull java.lang.String str) {
        AppCompatTextView appCompatTextView;
        AppCompatTextView appCompatTextView2;
        Intrinsics.checkNotNullParameter(str, "");
        this.AYXKKw = str;
        if (isEnabled()) {
            java.lang.String showDataWithPrefix$default = str.length() == 0 ? "--" : C23272hvB.getShowDataWithPrefix$default(C23272hvB.KWHzl, str, false, false, null, false, 30, null);
            C21585hEv c21585hEv = this.OLrzqt;
            if (c21585hEv != null && (appCompatTextView2 = c21585hEv.AuCTel) != null) {
                appCompatTextView2.setText(showDataWithPrefix$default);
            }
            C21585hEv c21585hEv2 = this.OLrzqt;
            if (c21585hEv2 == null || (appCompatTextView = c21585hEv2.ejfBZ) == null) {
                return;
            }
            appCompatTextView.setText(showDataWithPrefix$default);
        }
    }

    public final void setInitPriorityFee(@NotNull PriorityFeeType priorityFeeType, @NotNull java.lang.String str) {
        java.lang.String strAYXKKw;
        AppCompatTextView appCompatTextView;
        AppCompatTextView appCompatTextView2;
        Intrinsics.checkNotNullParameter(priorityFeeType, "");
        Intrinsics.checkNotNullParameter(str, "");
        int i = Application.KWHzl[priorityFeeType.ordinal()];
        if (i == 1) {
            strAYXKKw = C33070mpX.AYXKKw(C23274hvD.Fragment.DAgZj);
        } else if (i == 2) {
            strAYXKKw = C33070mpX.AYXKKw(C23274hvD.Fragment.setIconBitmap);
        } else if (i == 3) {
            strAYXKKw = C33070mpX.AYXKKw(C23274hvD.Fragment.newInstance);
        } else {
            if (i != 4) {
                throw new NoWhenBranchMatchedException();
            }
            strAYXKKw = C23272hvB.getShowDataWithPrefix$default(C23272hvB.KWHzl, str, false, false, null, false, 30, null);
        }
        C21585hEv c21585hEv = this.OLrzqt;
        if (c21585hEv != null && (appCompatTextView2 = c21585hEv.AuCTel) != null) {
            appCompatTextView2.setText(strAYXKKw);
        }
        C21585hEv c21585hEv2 = this.OLrzqt;
        if (c21585hEv2 == null || (appCompatTextView = c21585hEv2.ejfBZ) == null) {
            return;
        }
        appCompatTextView.setText(strAYXKKw);
    }

    public final void setSlippageValue(@NotNull SlippageMode slippageMode, @NotNull java.lang.String str) {
        java.lang.String percent$default;
        AppCompatTextView appCompatTextView;
        AppCompatTextView appCompatTextView2;
        Intrinsics.checkNotNullParameter(slippageMode, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.values = str;
        this.AhwBna = slippageMode;
        int i = Application.AEQbTJ[slippageMode.ordinal()];
        if (i != 1) {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            percent$default = C23311hvo.formatPercent$default(str, true, 0, 0, null, null, 30, null);
        } else if (str.length() == 0) {
            percent$default = C33070mpX.AYXKKw(C23274hvD.Fragment.setPlaybackToLocal);
        } else {
            percent$default = C23311hvo.formatPercent$default(str, true, 0, 0, null, null, 30, null);
        }
        C21585hEv c21585hEv = this.OLrzqt;
        if (c21585hEv != null && (appCompatTextView2 = c21585hEv.isConnected) != null) {
            appCompatTextView2.setText(percent$default);
        }
        C21585hEv c21585hEv2 = this.OLrzqt;
        if (c21585hEv2 == null || (appCompatTextView = c21585hEv2.DbNXlk) == null) {
            return;
        }
        appCompatTextView.setText(percent$default);
    }

    @Override // android.widget.RelativeLayout, android.view.View
    public void onMeasure(int i, int i2) {
        ConstraintLayout constraintLayout;
        ConstraintLayout constraintLayout2;
        ConstraintLayout constraintLayout3;
        ConstraintLayout constraintLayout4;
        ConstraintLayout constraintLayout5;
        super.onMeasure(i, i2);
        C21585hEv c21585hEv = this.OLrzqt;
        int measuredWidth = (c21585hEv == null || (constraintLayout5 = c21585hEv.AEQbTJ) == null) ? 0 : constraintLayout5.getMeasuredWidth();
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        if (measuredWidth > C55298xhM.OLrzqt(PsExtractor.VIDEO_STREAM_MASK, context)) {
            C21585hEv c21585hEv2 = this.OLrzqt;
            if (c21585hEv2 != null && (constraintLayout4 = c21585hEv2.AEQbTJ) != null) {
                constraintLayout4.setVisibility(8);
            }
            C21585hEv c21585hEv3 = this.OLrzqt;
            if (c21585hEv3 == null || (constraintLayout3 = c21585hEv3.KWHzl) == null) {
                return;
            }
            constraintLayout3.setVisibility(0);
            return;
        }
        C21585hEv c21585hEv4 = this.OLrzqt;
        if (c21585hEv4 != null && (constraintLayout2 = c21585hEv4.AEQbTJ) != null) {
            constraintLayout2.setVisibility(0);
        }
        C21585hEv c21585hEv5 = this.OLrzqt;
        if (c21585hEv5 == null || (constraintLayout = c21585hEv5.KWHzl) == null) {
            return;
        }
        constraintLayout.setVisibility(8);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v17, resolved type: byte */
    /* JADX DEBUG: Multi-variable search result rejected for r1v5, resolved type: byte */
    /* JADX DEBUG: Multi-variable search result rejected for r1v6, resolved type: byte */
    /* JADX WARN: Multi-variable type inference failed */
    public final void setMevDisplayForSol(@NotNull java.lang.String str, boolean z, java.lang.String str2, boolean z2) {
        AppCompatTextView appCompatTextView;
        AppCompatTextView appCompatTextView2;
        android.content.res.ColorStateList colorStateList;
        int color;
        android.graphics.drawable.Drawable drawable;
        AppCompatTextView appCompatTextView3;
        android.graphics.drawable.Drawable drawable2;
        AppCompatTextView appCompatTextView4;
        AppCompatTextView appCompatTextView5;
        Intrinsics.checkNotNullParameter(str, "");
        if (!z2) {
            EZpvd();
            return;
        }
        this.EZpvd = java.lang.Boolean.TRUE;
        this.AEQbTJ = str;
        this.KWHzl = z;
        this.gEmmrt = str2;
        this.isConnected = z2;
        if (isEnabled()) {
            boolean zEZpvd = Intrinsics.EZpvd((java.lang.Object) str2, (java.lang.Object) MevUnstableShowLevelType.ERROR.getType());
            boolean zEZpvd2 = Intrinsics.EZpvd((java.lang.Object) str2, (java.lang.Object) MevUnstableShowLevelType.WARNING.getType());
            byte b = z && zEZpvd;
            boolean z3 = z && zEZpvd2;
            C21585hEv c21585hEv = this.OLrzqt;
            if (c21585hEv != null && (appCompatTextView5 = c21585hEv.values) != null) {
                appCompatTextView5.setVisibility(b == true ? 0 : 8);
            }
            C21585hEv c21585hEv2 = this.OLrzqt;
            if (c21585hEv2 == null || (appCompatTextView = c21585hEv2.fetchVPNInfo) == null) {
                return;
            }
            android.graphics.drawable.Drawable drawable3 = null;
            if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) PresetRouteType.RouteTypeMev.getValue())) {
                OLrzqt();
                int i = b != false ? C52761wXj.Activity.DQzvGN : z3 ? C52761wXj.Activity.gdmIOq : C52761wXj.Activity.QwvEab;
                int i2 = b != false ? C52761wXj.Activity.DQzvGN : z3 ? C52761wXj.Activity.gdmIOq : C52761wXj.Activity.fdOvFl;
                C21585hEv c21585hEv3 = this.OLrzqt;
                AppCompatTextView appCompatTextView6 = c21585hEv3 != null ? c21585hEv3.fetchVPNInfo : null;
                android.content.Context context = getContext();
                int i3 = C52761wXj.TaskDescription.dhOYXF;
                android.content.Context context2 = getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "");
                C33057mpK.EZpvd(i3, context2, i);
                Unit unit = Unit.INSTANCE;
                android.graphics.drawable.Drawable drawable4 = ContextCompat.getDrawable(context, i3);
                if (b == true || z3) {
                    android.content.Context context3 = getContext();
                    int i4 = C52761wXj.TaskDescription.UPzgla;
                    android.content.Context context4 = getContext();
                    Intrinsics.checkNotNullExpressionValue(context4, "");
                    C33057mpK.EZpvd(i4, context4, i);
                    drawable2 = ContextCompat.getDrawable(context3, i4);
                } else {
                    drawable2 = null;
                }
                C25352ivB.KWHzl(appCompatTextView6, drawable4, drawable2, getResources().getDimensionPixelSize(C32113mPz.StateListAnimator.AkhnZx));
                android.content.res.ColorStateList colorStateList2 = ContextCompat.getColorStateList(getContext(), i);
                TextViewCompat.setCompoundDrawableTintList(appCompatTextView, colorStateList2);
                appCompatTextView.setTextColor(C33070mpX.copydefault(i2));
                appCompatTextView.setText(getContext().getString(C23274hvD.Fragment.MediaControllerCompatCallback));
                C21585hEv c21585hEv4 = this.OLrzqt;
                if (c21585hEv4 == null || (appCompatTextView4 = c21585hEv4.fJNWhG) == null) {
                    return;
                }
                android.graphics.drawable.Drawable drawable5 = ContextCompat.getDrawable(getContext(), C52761wXj.TaskDescription.dhOYXF);
                if (b != false || z3) {
                    android.content.Context context5 = getContext();
                    int i5 = C52761wXj.TaskDescription.UPzgla;
                    android.content.Context context6 = getContext();
                    Intrinsics.checkNotNullExpressionValue(context6, "");
                    C33057mpK.EZpvd(i5, context6, i);
                    drawable3 = ContextCompat.getDrawable(context5, i5);
                }
                C25352ivB.KWHzl(appCompatTextView4, drawable5, drawable3, getResources().getDimensionPixelSize(C32113mPz.StateListAnimator.AkhnZx));
                TextViewCompat.setCompoundDrawableTintList(appCompatTextView4, colorStateList2);
                appCompatTextView4.setTextColor(C33070mpX.copydefault(i2));
                appCompatTextView4.setText(getContext().getString(C23274hvD.Fragment.MediaControllerCompatCallback));
                return;
            }
            if (!Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) PresetRouteType.RouteTypeAuto.getValue())) {
                if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) PresetRouteType.RouteTypeFast.getValue())) {
                    OLrzqt();
                    appCompatTextView.setCompoundDrawablesRelative(null, null, null, null);
                    ContextCompat.getColorStateList(getContext(), C52761wXj.Activity.QwvEab);
                    android.content.res.ColorStateList colorStateList3 = ContextCompat.getColorStateList(getContext(), C52761wXj.Activity.QwvEab);
                    int color2 = ContextCompat.getColor(getContext(), C52761wXj.Activity.QwvEab);
                    android.graphics.drawable.Drawable drawable6 = ContextCompat.getDrawable(getContext(), C52761wXj.TaskDescription.dtVxwd);
                    if (drawable6 != null) {
                        drawable6.setTint(color2);
                    }
                    C21585hEv c21585hEv5 = this.OLrzqt;
                    C25352ivB.KWHzl(c21585hEv5 != null ? c21585hEv5.fetchVPNInfo : null, drawable6, getResources().getDimensionPixelSize(C32113mPz.StateListAnimator.AkhnZx));
                    TextViewCompat.setCompoundDrawableTintList(appCompatTextView, colorStateList3);
                    android.content.res.ColorStateList colorStateList4 = ContextCompat.getColorStateList(getContext(), C52761wXj.Activity.fdOvFl);
                    appCompatTextView.setTextColor(colorStateList4);
                    appCompatTextView.setText(getContext().getString(C23274hvD.Fragment.binderDied));
                    C21585hEv c21585hEv6 = this.OLrzqt;
                    if (c21585hEv6 == null || (appCompatTextView2 = c21585hEv6.fJNWhG) == null) {
                        return;
                    }
                    appCompatTextView2.setCompoundDrawablesRelative(null, null, null, null);
                    appCompatTextView2.setTextColor(colorStateList4);
                    appCompatTextView2.setText(getContext().getString(C23274hvD.Fragment.binderDied));
                    return;
                }
                EZpvd();
                return;
            }
            if (!z2) {
                EZpvd();
                return;
            }
            OLrzqt();
            if (z) {
                colorStateList = ContextCompat.getColorStateList(getContext(), C52761wXj.Activity.DQYQgr);
            } else {
                colorStateList = ContextCompat.getColorStateList(getContext(), C52761wXj.Activity.QwvEab);
            }
            if (z) {
                color = ContextCompat.getColor(getContext(), C52761wXj.Activity.QwvEab);
            } else {
                color = ContextCompat.getColor(getContext(), C52761wXj.Activity.QwvEab);
            }
            if (z) {
                drawable = ContextCompat.getDrawable(getContext(), C52761wXj.TaskDescription.dhOYXF);
            } else {
                drawable = ContextCompat.getDrawable(getContext(), C52761wXj.TaskDescription.dtVxwd);
            }
            if (drawable != null) {
                drawable.setTint(color);
            }
            C21585hEv c21585hEv7 = this.OLrzqt;
            C25352ivB.KWHzl(c21585hEv7 != null ? c21585hEv7.fetchVPNInfo : null, drawable, getResources().getDimensionPixelSize(C32113mPz.StateListAnimator.AkhnZx));
            TextViewCompat.setCompoundDrawableTintList(appCompatTextView, colorStateList);
            android.content.res.ColorStateList colorStateList5 = ContextCompat.getColorStateList(getContext(), C52761wXj.Activity.fdOvFl);
            appCompatTextView.setTextColor(colorStateList5);
            int i6 = z ? C23274hvD.Fragment.MediaControllerCompatCallback : C23274hvD.Fragment.binderDied;
            appCompatTextView.setText(getContext().getString(i6));
            C21585hEv c21585hEv8 = this.OLrzqt;
            if (c21585hEv8 == null || (appCompatTextView3 = c21585hEv8.fJNWhG) == null) {
                return;
            }
            C25352ivB.KWHzl(appCompatTextView3, drawable, getResources().getDimensionPixelSize(C32113mPz.StateListAnimator.AkhnZx));
            TextViewCompat.setCompoundDrawableTintList(appCompatTextView3, colorStateList);
            appCompatTextView3.setTextColor(colorStateList5);
            appCompatTextView3.setText(getContext().getString(i6));
        }
    }

    public final void setMevDisplayForEVM(@NotNull java.lang.String str, boolean z, java.lang.String str2, boolean z2) {
        AppCompatTextView appCompatTextView;
        AppCompatTextView appCompatTextView2;
        android.content.res.ColorStateList colorStateList;
        int color;
        android.graphics.drawable.Drawable drawable;
        AppCompatTextView appCompatTextView3;
        android.graphics.drawable.Drawable drawable2;
        AppCompatTextView appCompatTextView4;
        AppCompatTextView appCompatTextView5;
        Intrinsics.checkNotNullParameter(str, "");
        if (!z2) {
            EZpvd();
            return;
        }
        this.EZpvd = java.lang.Boolean.FALSE;
        this.AEQbTJ = str;
        this.KWHzl = z;
        this.gEmmrt = str2;
        this.isConnected = z2;
        if (isEnabled()) {
            boolean zEZpvd = Intrinsics.EZpvd((java.lang.Object) str2, (java.lang.Object) MevUnstableShowLevelType.ERROR.getType());
            boolean zEZpvd2 = Intrinsics.EZpvd((java.lang.Object) str2, (java.lang.Object) MevUnstableShowLevelType.WARNING.getType());
            C21585hEv c21585hEv = this.OLrzqt;
            if (c21585hEv != null && (appCompatTextView5 = c21585hEv.values) != null) {
                appCompatTextView5.setVisibility((zEZpvd && Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) PresetRouteType.RouteTypeMev.getValue())) ? 0 : 8);
            }
            C21585hEv c21585hEv2 = this.OLrzqt;
            if (c21585hEv2 == null || (appCompatTextView = c21585hEv2.fetchVPNInfo) == null) {
                return;
            }
            android.graphics.drawable.Drawable drawable3 = null;
            if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) PresetRouteType.RouteTypeMev.getValue())) {
                OLrzqt();
                int i = zEZpvd ? C52761wXj.Activity.DQzvGN : zEZpvd2 ? C52761wXj.Activity.gdmIOq : C52761wXj.Activity.QwvEab;
                int i2 = zEZpvd ? C52761wXj.Activity.DQzvGN : zEZpvd2 ? C52761wXj.Activity.gdmIOq : C52761wXj.Activity.fdOvFl;
                C21585hEv c21585hEv3 = this.OLrzqt;
                AppCompatTextView appCompatTextView6 = c21585hEv3 != null ? c21585hEv3.fetchVPNInfo : null;
                android.graphics.drawable.Drawable drawable4 = ContextCompat.getDrawable(getContext(), C52761wXj.TaskDescription.dhOYXF);
                if (zEZpvd || zEZpvd2) {
                    android.content.Context context = getContext();
                    int i3 = C52761wXj.TaskDescription.UPzgla;
                    android.content.Context context2 = getContext();
                    Intrinsics.checkNotNullExpressionValue(context2, "");
                    C33057mpK.EZpvd(i3, context2, i);
                    Unit unit = Unit.INSTANCE;
                    drawable2 = ContextCompat.getDrawable(context, i3);
                } else {
                    drawable2 = null;
                }
                C25352ivB.KWHzl(appCompatTextView6, drawable4, drawable2, getResources().getDimensionPixelSize(C32113mPz.StateListAnimator.AkhnZx));
                android.content.res.ColorStateList colorStateList2 = ContextCompat.getColorStateList(getContext(), i);
                TextViewCompat.setCompoundDrawableTintList(appCompatTextView, colorStateList2);
                appCompatTextView.setTextColor(C33070mpX.copydefault(i2));
                appCompatTextView.setText(getContext().getString(C23274hvD.Fragment.MediaControllerCompatCallback));
                C21585hEv c21585hEv4 = this.OLrzqt;
                if (c21585hEv4 == null || (appCompatTextView4 = c21585hEv4.fJNWhG) == null) {
                    return;
                }
                android.content.Context context3 = getContext();
                int i4 = C52761wXj.TaskDescription.dhOYXF;
                android.content.Context context4 = getContext();
                Intrinsics.checkNotNullExpressionValue(context4, "");
                C33057mpK.EZpvd(i4, context4, i);
                Unit unit2 = Unit.INSTANCE;
                android.graphics.drawable.Drawable drawable5 = ContextCompat.getDrawable(context3, i4);
                if (zEZpvd || zEZpvd2) {
                    android.content.Context context5 = getContext();
                    int i5 = C52761wXj.TaskDescription.UPzgla;
                    android.content.Context context6 = getContext();
                    Intrinsics.checkNotNullExpressionValue(context6, "");
                    C33057mpK.EZpvd(i5, context6, i);
                    drawable3 = ContextCompat.getDrawable(context5, i5);
                }
                C25352ivB.KWHzl(appCompatTextView4, drawable5, drawable3, getResources().getDimensionPixelSize(C32113mPz.StateListAnimator.AkhnZx));
                TextViewCompat.setCompoundDrawableTintList(appCompatTextView4, colorStateList2);
                appCompatTextView4.setTextColor(C33070mpX.copydefault(i2));
                appCompatTextView4.setText(getContext().getString(C23274hvD.Fragment.MediaControllerCompatCallback));
                return;
            }
            if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) PresetRouteType.RouteTypeAuto.getValue())) {
                OLrzqt();
                if (z) {
                    colorStateList = ContextCompat.getColorStateList(getContext(), C52761wXj.Activity.QwvEab);
                } else {
                    colorStateList = ContextCompat.getColorStateList(getContext(), C52761wXj.Activity.DQYQgr);
                }
                if (z) {
                    color = ContextCompat.getColor(getContext(), C52761wXj.Activity.QwvEab);
                } else {
                    color = ContextCompat.getColor(getContext(), C52761wXj.Activity.QwvEab);
                }
                if (z) {
                    drawable = ContextCompat.getDrawable(getContext(), C52761wXj.TaskDescription.dhOYXF);
                } else {
                    drawable = ContextCompat.getDrawable(getContext(), C52761wXj.TaskDescription.dtVxwd);
                }
                if (drawable != null) {
                    drawable.setTint(color);
                }
                C21585hEv c21585hEv5 = this.OLrzqt;
                C25352ivB.KWHzl(c21585hEv5 != null ? c21585hEv5.fetchVPNInfo : null, drawable, getResources().getDimensionPixelSize(C32113mPz.StateListAnimator.AkhnZx));
                TextViewCompat.setCompoundDrawableTintList(appCompatTextView, colorStateList);
                android.content.res.ColorStateList colorStateList3 = ContextCompat.getColorStateList(getContext(), C52761wXj.Activity.fdOvFl);
                appCompatTextView.setTextColor(colorStateList3);
                int i6 = z ? C23274hvD.Fragment.MediaControllerCompatCallback : C23274hvD.Fragment.binderDied;
                appCompatTextView.setText(getContext().getString(i6));
                C21585hEv c21585hEv6 = this.OLrzqt;
                if (c21585hEv6 == null || (appCompatTextView3 = c21585hEv6.fJNWhG) == null) {
                    return;
                }
                C25352ivB.KWHzl(appCompatTextView3, drawable, getResources().getDimensionPixelSize(C32113mPz.StateListAnimator.AkhnZx));
                TextViewCompat.setCompoundDrawableTintList(appCompatTextView3, colorStateList);
                appCompatTextView3.setTextColor(colorStateList3);
                appCompatTextView3.setText(getContext().getString(i6));
                return;
            }
            if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) PresetRouteType.RouteTypeFast.getValue())) {
                OLrzqt();
                appCompatTextView.setCompoundDrawablesRelative(null, null, null, null);
                ContextCompat.getColorStateList(getContext(), C52761wXj.Activity.QwvEab);
                android.content.res.ColorStateList colorStateList4 = ContextCompat.getColorStateList(getContext(), C52761wXj.Activity.QwvEab);
                int color2 = ContextCompat.getColor(getContext(), C52761wXj.Activity.QwvEab);
                android.graphics.drawable.Drawable drawable6 = ContextCompat.getDrawable(getContext(), C52761wXj.TaskDescription.dtVxwd);
                if (drawable6 != null) {
                    drawable6.setTint(color2);
                }
                C21585hEv c21585hEv7 = this.OLrzqt;
                C25352ivB.KWHzl(c21585hEv7 != null ? c21585hEv7.fetchVPNInfo : null, drawable6, getResources().getDimensionPixelSize(C32113mPz.StateListAnimator.AkhnZx));
                TextViewCompat.setCompoundDrawableTintList(appCompatTextView, colorStateList4);
                android.content.res.ColorStateList colorStateList5 = ContextCompat.getColorStateList(getContext(), C52761wXj.Activity.fdOvFl);
                appCompatTextView.setTextColor(colorStateList5);
                appCompatTextView.setText(getContext().getString(C23274hvD.Fragment.binderDied));
                C21585hEv c21585hEv8 = this.OLrzqt;
                if (c21585hEv8 == null || (appCompatTextView2 = c21585hEv8.fJNWhG) == null) {
                    return;
                }
                appCompatTextView2.setCompoundDrawablesRelative(null, null, null, null);
                appCompatTextView2.setTextColor(colorStateList5);
                appCompatTextView2.setText(getContext().getString(C23274hvD.Fragment.binderDied));
                return;
            }
            EZpvd();
        }
    }

    public final void setSlippageColor(boolean z) {
        AppCompatTextView appCompatTextView;
        AppCompatTextView appCompatTextView2;
        AppCompatTextView appCompatTextView3;
        AppCompatTextView appCompatTextView4;
        AppCompatTextView appCompatTextView5;
        AppCompatTextView appCompatTextView6;
        this.copydefault = z;
        C21585hEv c21585hEv = this.OLrzqt;
        if (c21585hEv != null && (appCompatTextView4 = c21585hEv.isConnected) != null) {
            if (z) {
                TextViewCompat.setCompoundDrawableTintList(appCompatTextView4, ContextCompat.getColorStateList(appCompatTextView4.getContext(), C52761wXj.Activity.gdmIOq));
                C21585hEv c21585hEv2 = this.OLrzqt;
                if (c21585hEv2 != null && (appCompatTextView6 = c21585hEv2.isConnected) != null) {
                    appCompatTextView6.setTextColor(ContextCompat.getColorStateList(appCompatTextView4.getContext(), C52761wXj.Activity.gdmIOq));
                }
            } else {
                TextViewCompat.setCompoundDrawableTintList(appCompatTextView4, ContextCompat.getColorStateList(appCompatTextView4.getContext(), C52761wXj.Activity.QwvEab));
                C21585hEv c21585hEv3 = this.OLrzqt;
                if (c21585hEv3 != null && (appCompatTextView5 = c21585hEv3.isConnected) != null) {
                    appCompatTextView5.setTextColor(ContextCompat.getColorStateList(appCompatTextView4.getContext(), C52761wXj.Activity.fdOvFl));
                }
            }
        }
        C21585hEv c21585hEv4 = this.OLrzqt;
        if (c21585hEv4 == null || (appCompatTextView = c21585hEv4.DbNXlk) == null) {
            return;
        }
        if (z) {
            TextViewCompat.setCompoundDrawableTintList(appCompatTextView, ContextCompat.getColorStateList(appCompatTextView.getContext(), C52761wXj.Activity.gdmIOq));
            C21585hEv c21585hEv5 = this.OLrzqt;
            if (c21585hEv5 == null || (appCompatTextView3 = c21585hEv5.DbNXlk) == null) {
                return;
            }
            appCompatTextView3.setTextColor(ContextCompat.getColorStateList(appCompatTextView.getContext(), C52761wXj.Activity.gdmIOq));
            return;
        }
        TextViewCompat.setCompoundDrawableTintList(appCompatTextView, ContextCompat.getColorStateList(appCompatTextView.getContext(), C52761wXj.Activity.QwvEab));
        C21585hEv c21585hEv6 = this.OLrzqt;
        if (c21585hEv6 == null || (appCompatTextView2 = c21585hEv6.DbNXlk) == null) {
            return;
        }
        appCompatTextView2.setTextColor(ContextCompat.getColorStateList(appCompatTextView.getContext(), C52761wXj.Activity.fdOvFl));
    }

    @Override // o.AbstractC24459ieI
    public android.view.View AEQbTJ() {
        C21585hEv c21585hEv = this.OLrzqt;
        if (c21585hEv != null) {
            return c21585hEv.fIwbmz;
        }
        return null;
    }

    public final void setPresetName(@NotNull java.lang.String str) {
        android.widget.TextView textView;
        Intrinsics.checkNotNullParameter(str, "");
        C21585hEv c21585hEv = this.OLrzqt;
        if (c21585hEv == null || (textView = c21585hEv.fARcdN) == null) {
            return;
        }
        textView.setText(str);
    }

    public final void EZpvd() {
        android.view.View view;
        android.view.View view2;
        AppCompatTextView appCompatTextView;
        AppCompatTextView appCompatTextView2;
        C21585hEv c21585hEv = this.OLrzqt;
        if (c21585hEv != null && (appCompatTextView2 = c21585hEv.fetchVPNInfo) != null) {
            appCompatTextView2.setVisibility(8);
        }
        C21585hEv c21585hEv2 = this.OLrzqt;
        if (c21585hEv2 != null && (appCompatTextView = c21585hEv2.fJNWhG) != null) {
            appCompatTextView.setVisibility(8);
        }
        C21585hEv c21585hEv3 = this.OLrzqt;
        if (c21585hEv3 != null && (view2 = c21585hEv3.AYXKKw) != null) {
            view2.setVisibility(8);
        }
        C21585hEv c21585hEv4 = this.OLrzqt;
        if (c21585hEv4 == null || (view = c21585hEv4.gEmmrt) == null) {
            return;
        }
        view.setVisibility(8);
    }

    public final void OLrzqt() {
        android.view.View view;
        android.view.View view2;
        AppCompatTextView appCompatTextView;
        AppCompatTextView appCompatTextView2;
        C21585hEv c21585hEv = this.OLrzqt;
        if (c21585hEv != null && (appCompatTextView2 = c21585hEv.fetchVPNInfo) != null) {
            appCompatTextView2.setVisibility(0);
        }
        C21585hEv c21585hEv2 = this.OLrzqt;
        if (c21585hEv2 != null && (appCompatTextView = c21585hEv2.fJNWhG) != null) {
            appCompatTextView.setVisibility(0);
        }
        C21585hEv c21585hEv3 = this.OLrzqt;
        if (c21585hEv3 != null && (view2 = c21585hEv3.AYXKKw) != null) {
            view2.setVisibility(0);
        }
        C21585hEv c21585hEv4 = this.OLrzqt;
        if (c21585hEv4 == null || (view = c21585hEv4.gEmmrt) == null) {
            return;
        }
        view.setVisibility(0);
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        java.lang.String str;
        super.setEnabled(z);
        C21585hEv c21585hEv = this.OLrzqt;
        if (c21585hEv == null) {
            return;
        }
        android.content.res.ColorStateList colorStateList = ContextCompat.getColorStateList(getContext(), z ? C52761wXj.Activity.QwvEab : C52761wXj.Activity.UlJrfe);
        c21585hEv.fARcdN.setTextColor(colorStateList);
        int color = ContextCompat.getColor(getContext(), z ? C52761wXj.Activity.fdOvFl : C52761wXj.Activity.UlJrfe);
        c21585hEv.isConnected.setTextColor(color);
        c21585hEv.DbNXlk.setTextColor(color);
        c21585hEv.AuCTel.setTextColor(color);
        c21585hEv.ejfBZ.setTextColor(color);
        c21585hEv.fetchVPNInfo.setTextColor(color);
        c21585hEv.fJNWhG.setTextColor(color);
        TextViewCompat.setCompoundDrawableTintList(c21585hEv.isConnected, colorStateList);
        TextViewCompat.setCompoundDrawableTintList(c21585hEv.DbNXlk, colorStateList);
        TextViewCompat.setCompoundDrawableTintList(c21585hEv.AuCTel, colorStateList);
        TextViewCompat.setCompoundDrawableTintList(c21585hEv.ejfBZ, colorStateList);
        TextViewCompat.setCompoundDrawableTintList(c21585hEv.fetchVPNInfo, colorStateList);
        TextViewCompat.setCompoundDrawableTintList(c21585hEv.fJNWhG, colorStateList);
        ImageViewCompat.setImageTintList(c21585hEv.djBIcL, ContextCompat.getColorStateList(getContext(), z ? C52761wXj.Activity.Dmq : C52761wXj.Activity.UlJrfe));
        if (z) {
            java.lang.String str2 = this.AYXKKw;
            if (str2 != null) {
                setPriorityFeeValue(str2);
            }
            java.lang.String str3 = this.values;
            if (str3 != null) {
                SlippageMode slippageMode = this.AhwBna;
                if (slippageMode == null) {
                    slippageMode = SlippageMode.Dynamic;
                }
                setSlippageValue(slippageMode, str3);
            }
            java.lang.Boolean bool = this.EZpvd;
            if (Intrinsics.EZpvd(bool, java.lang.Boolean.TRUE)) {
                java.lang.String str4 = this.AEQbTJ;
                if (str4 != null) {
                    setMevDisplayForSol(str4, this.KWHzl, this.gEmmrt, this.isConnected);
                    return;
                }
                return;
            }
            if (!Intrinsics.EZpvd(bool, java.lang.Boolean.FALSE) || (str = this.AEQbTJ) == null) {
                return;
            }
            setMevDisplayForEVM(str, this.KWHzl, this.gEmmrt, this.isConnected);
        }
    }
}
