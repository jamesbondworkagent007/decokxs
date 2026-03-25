package o;

import android.graphics.Color;
import android.view.ViewGroup;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.LifecycleOwner;
import com.amplifyframework.core.model.ModelIdentifier;
import com.immomo.mls.fun.constants.TextAlign;
import com.okinc.ok_kyc_core.data.remote.networkmodel.ButtonStyle;
import com.okinc.ok_kyc_core.data.remote.networkmodel.CTAButtonAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.CtaIcon;
import com.okinc.ok_kyc_core.data.remote.networkmodel.DynamicTitle;
import com.okinc.ok_kyc_core.data.remote.networkmodel.UIAlignment;
import com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponentAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.ViewStatus;
import com.okinc.ok_kyc_core_api.ComplianceTheme;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C43662rtX;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.rLw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C42249rLw extends android.widget.FrameLayout {
    public final C42519rVw AEQbTJ;
    public AbstractC43890rxn EZpvd;
    public java.lang.String KWHzl;
    public CTAButtonAppModel OLrzqt;
    public ViewStatus copydefault;

    /* JADX INFO: renamed from: o.rLw$Application */
    public final /* synthetic */ class Application {
        public static final /* synthetic */ int[] EZpvd;
        public static final /* synthetic */ int[] OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[ButtonStyle.values().length];
            try {
                iArr[ButtonStyle.Primary.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[ButtonStyle.Secondary.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[ButtonStyle.Tertiary.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[ButtonStyle.Text.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[ButtonStyle.Image.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            EZpvd = iArr;
            int[] iArr2 = new int[UIAlignment.values().length];
            try {
                iArr2[UIAlignment.Trailing.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr2[UIAlignment.Leading.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                iArr2[UIAlignment.Center.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            OLrzqt = iArr2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C42249rLw(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C42249rLw(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AbstractC43890rxn AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void KWHzl(@NotNull UIComponentAppModel uIComponentAppModel, @NotNull AbstractC42074rFj abstractC42074rFj, @NotNull LifecycleOwner lifecycleOwner) {
        Intrinsics.checkNotNullParameter(uIComponentAppModel, "");
        Intrinsics.checkNotNullParameter(abstractC42074rFj, "");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCtaButtonAppModel(@NotNull CTAButtonAppModel cTAButtonAppModel) {
        Intrinsics.checkNotNullParameter(cTAButtonAppModel, "");
        this.OLrzqt = cTAButtonAppModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setId(java.lang.String str) {
        this.KWHzl = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMBinding(AbstractC43890rxn abstractC43890rxn) {
        this.EZpvd = abstractC43890rxn;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setViewStatus(@NotNull ViewStatus viewStatus) {
        Intrinsics.checkNotNullParameter(viewStatus, "");
        this.copydefault = viewStatus;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:int:0x0009: SGET  A[WRAPPED] o.rtX.FragmentManager.copydefault int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:44) call: o.rLw.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C42249rLw(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? C43662rtX.FragmentManager.copydefault : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C42249rLw(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.AEQbTJ = new C42519rVw(context, attributeSet, i);
        this.KWHzl = "";
        this.copydefault = ViewStatus.Form;
        this.EZpvd = (AbstractC43890rxn) DataBindingUtil.inflate(android.view.LayoutInflater.from(context), C43662rtX.TaskDescription.dxcTrN, this, true);
    }

    public final CTAButtonAppModel KWHzl() {
        CTAButtonAppModel cTAButtonAppModel = this.OLrzqt;
        if (cTAButtonAppModel != null) {
            return cTAButtonAppModel;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    public void AEQbTJ(@NotNull UIComponentAppModel uIComponentAppModel) {
        java.lang.String text;
        CtaIcon icon;
        android.graphics.drawable.Drawable drawableKWHzl;
        int iCopydefault;
        Intrinsics.checkNotNullParameter(uIComponentAppModel, "");
        java.lang.Float leftMargin = uIComponentAppModel.getLeftMargin();
        float fFloatValue = leftMargin != null ? leftMargin.floatValue() : 0.0f;
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        int iCopydefault2 = C55298xhM.copydefault(fFloatValue, context);
        rQR rqr = rQR.AEQbTJ;
        android.content.Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        setPaddingRelative(iCopydefault2, 0, 0, rqr.AEQbTJ(context2, this.copydefault, uIComponentAppModel.getBottomMargin()));
        CTAButtonAppModel cTAButtonAppModel = uIComponentAppModel instanceof CTAButtonAppModel ? (CTAButtonAppModel) uIComponentAppModel : null;
        if (cTAButtonAppModel != null) {
            CTAButtonAppModel cTAButtonAppModel2 = (CTAButtonAppModel) uIComponentAppModel;
            setCtaButtonAppModel(cTAButtonAppModel2);
            this.KWHzl = cTAButtonAppModel.getId();
            AbstractC43890rxn abstractC43890rxn = this.EZpvd;
            if (abstractC43890rxn != null) {
                if (C33129mqd.OLrzqt((java.lang.CharSequence) cTAButtonAppModel.getId())) {
                    abstractC43890rxn.AEQbTJ.setContentDescription(cTAButtonAppModel.getId() + "_cta_button");
                } else {
                    abstractC43890rxn.AEQbTJ.setContentDescription("default_cta_button");
                }
                C52794wYp c52794wYp = abstractC43890rxn.AEQbTJ;
                Intrinsics.checkNotNullExpressionValue(c52794wYp, "");
                java.lang.Boolean boolIsHidden = KWHzl().isHidden();
                c52794wYp.setVisibility((boolIsHidden == null || !boolIsHidden.booleanValue()) ? 0 : 8);
                C52794wYp c52794wYp2 = abstractC43890rxn.AEQbTJ;
                DynamicTitle dynamicText = cTAButtonAppModel.getDynamicText();
                if (dynamicText != null) {
                    if (!C33129mqd.OLrzqt((java.lang.CharSequence) cTAButtonAppModel.getInfoFormId()) ? (text = dynamicText.getCreate()) == null : (text = dynamicText.getUpdate()) == null) {
                        text = "";
                    }
                } else {
                    text = cTAButtonAppModel.getText();
                }
                c52794wYp2.setText(text);
                ButtonStyle style = cTAButtonAppModel2.getStyle();
                int i = style == null ? -1 : Application.EZpvd[style.ordinal()];
                if (i == 1) {
                    abstractC43890rxn.AEQbTJ.setEnabled(false);
                    abstractC43890rxn.AEQbTJ.setOKDSType(257);
                } else if (i == 2) {
                    abstractC43890rxn.AEQbTJ.setEnabled(true);
                    abstractC43890rxn.AEQbTJ.setOKDSType(260);
                } else if (i == 3) {
                    abstractC43890rxn.AEQbTJ.setEnabled(true);
                    abstractC43890rxn.AEQbTJ.setOKDSType(258);
                } else if (i == 4) {
                    C52794wYp c52794wYp3 = abstractC43890rxn.AEQbTJ;
                    c52794wYp3.setEnabled(true);
                    Intrinsics.copydefault(c52794wYp3);
                    wYA.OLrzqt(c52794wYp3, false);
                    if (((rSF) C43251rlk.copydefault(rSF.class)).copydefault() == ComplianceTheme.OKX_LITE) {
                        c52794wYp3.setBackgroundResource(C43662rtX.Activity.OLrzqt);
                    }
                    android.util.TypedValue typedValue = new android.util.TypedValue();
                    c52794wYp3.getContext().getTheme().resolveAttribute(C43662rtX.Application.copydefault, typedValue, true);
                    android.content.Context context3 = c52794wYp3.getContext();
                    Intrinsics.checkNotNullExpressionValue(context3, "");
                    setDrawableRight(c52794wYp3, context3, C43662rtX.Activity.uzCIH);
                    int iComplexToDimensionPixelSize = android.util.TypedValue.complexToDimensionPixelSize(typedValue.data, c52794wYp3.getContext().getResources().getDisplayMetrics());
                    setCtaButtonMarginVertical(iComplexToDimensionPixelSize, iComplexToDimensionPixelSize);
                    Intrinsics.copydefault(c52794wYp3);
                } else if (i == 5) {
                    C52794wYp c52794wYp4 = abstractC43890rxn.AEQbTJ;
                    c52794wYp4.setEnabled(true);
                    c52794wYp4.setOKDSType(257);
                    if (cTAButtonAppModel2.getBackgroundColor() != null) {
                        abstractC43890rxn.AEQbTJ.setBackgroundTintList(android.content.res.ColorStateList.valueOf(Color.parseColor(ModelIdentifier.Helper.PRIMARY_KEY_DELIMITER + cTAButtonAppModel2.getBackgroundColor())));
                    }
                } else {
                    abstractC43890rxn.AEQbTJ.setEnabled(false);
                    abstractC43890rxn.AEQbTJ.setOKDSType(257);
                }
                if (cTAButtonAppModel2.getStyle() != ButtonStyle.Text && (icon = cTAButtonAppModel2.getIcon()) != null && (drawableKWHzl = rqr.KWHzl(icon.getName(), this.AEQbTJ)) != null) {
                    android.graphics.drawable.Drawable drawableWrap = DrawableCompat.wrap(drawableKWHzl.mutate());
                    Intrinsics.checkNotNullExpressionValue(drawableWrap, "");
                    if (C33129mqd.djBIcL(icon.getWidth()) > 0.0f && C33129mqd.djBIcL(icon.getHeight()) > 0.0f) {
                        drawableWrap.setBounds(0, 0, C55298xhM.dp2px$default(C33129mqd.djBIcL(icon.getWidth()), null, 1, null), C55298xhM.dp2px$default(C33129mqd.djBIcL(icon.getHeight()), null, 1, null));
                    } else {
                        drawableWrap.setBounds(0, 0, drawableWrap.getIntrinsicWidth(), drawableWrap.getIntrinsicHeight());
                    }
                    java.lang.Integer numCopydefault = rqr.copydefault(icon.getRenderColor(), this.AEQbTJ);
                    if (numCopydefault != null) {
                        DrawableCompat.setTint(drawableWrap, numCopydefault.intValue());
                    } else if (cTAButtonAppModel.getStyle() != ButtonStyle.Image) {
                        if (cTAButtonAppModel.getStyle() == ButtonStyle.Primary) {
                            iCopydefault = C33070mpX.copydefault(C52761wXj.Activity.htlTjW);
                        } else {
                            iCopydefault = C33070mpX.copydefault(C52761wXj.Activity.fdOvFl);
                        }
                        DrawableCompat.setTint(drawableWrap, iCopydefault);
                    }
                    UIAlignment position = icon.getPosition();
                    if (position != null && Application.OLrzqt[position.ordinal()] == 1) {
                        abstractC43890rxn.AEQbTJ.setCompoundDrawablesRelative(null, null, drawableWrap, null);
                    } else {
                        abstractC43890rxn.AEQbTJ.setCompoundDrawablesRelative(drawableWrap, null, null, null);
                    }
                }
                UIAlignment align = cTAButtonAppModel2.getAlign();
                int i2 = align == null ? -1 : Application.OLrzqt[align.ordinal()];
                if (i2 != -1) {
                    if (i2 == 1) {
                        abstractC43890rxn.AEQbTJ.setButtonGravity(TextAlign.RIGHT);
                        return;
                    } else if (i2 == 2) {
                        abstractC43890rxn.AEQbTJ.setButtonGravity(TextAlign.LEFT);
                        return;
                    } else if (i2 != 3) {
                        return;
                    }
                }
                abstractC43890rxn.AEQbTJ.setButtonGravity(17);
            }
        }
    }

    public final void setDrawableRight(android.widget.TextView textView, android.content.Context context, @androidx.annotation.DrawableRes int i) {
        android.graphics.drawable.Drawable drawable = context.getResources().getDrawable(i, null);
        DrawableCompat.setTint(drawable, C33070mpX.copydefault(C52761wXj.Activity.aappFQ));
        textView.setCompoundDrawablesRelativeWithIntrinsicBounds((android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null, drawable, (android.graphics.drawable.Drawable) null);
    }

    public final void setCtaButtonMarginVertical(int i, int i2) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        AbstractC43890rxn abstractC43890rxn = this.EZpvd;
        if (abstractC43890rxn != null) {
            ViewGroup.LayoutParams layoutParams = abstractC43890rxn.AEQbTJ.getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            } else {
                marginLayoutParams = new ViewGroup.MarginLayoutParams(layoutParams);
            }
            marginLayoutParams.topMargin = i;
            marginLayoutParams.bottomMargin = i2;
            abstractC43890rxn.AEQbTJ.setLayoutParams(marginLayoutParams);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        C52794wYp c52794wYp;
        super.onDetachedFromWindow();
        AbstractC43890rxn abstractC43890rxn = this.EZpvd;
        if (abstractC43890rxn != null && (c52794wYp = abstractC43890rxn.AEQbTJ) != null) {
            c52794wYp.fIwbmz();
        }
        this.EZpvd = null;
    }
}
