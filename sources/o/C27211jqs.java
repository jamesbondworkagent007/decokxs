package o;

import android.text.TextUtils;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.core.widget.ImageViewCompat;
import androidx.databinding.DataBindingUtil;
import com.okinc.business.invest_biz.data.bean.InvestPopUpData;
import com.okinc.business.invest_biz.data.bean.InvestTipInfoVo;
import com.okinc.business.invest_biz.data.bean.InvestUnderlyingToken;
import com.okinc.business.invest_biz.data.bean.InvestmentLogoData;
import kotlin.jvm.internal.Intrinsics;
import o.C25493ixk;
import o.C32113mPz;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jqs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C27211jqs extends ConstraintLayout {
    public iLC copydefault;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C27211jqs(@NotNull android.content.Context context) {
        this(context, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C27211jqs(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27211jqs(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        KWHzl();
    }

    private final void KWHzl() {
        this.copydefault = (iLC) DataBindingUtil.inflate(android.view.LayoutInflater.from(getContext()), C25493ixk.Activity.iKEqwx, this, true);
    }

    public final void setSubViewData(@NotNull ActionBar actionBar) {
        java.util.List<java.lang.String> tokenLogo;
        Intrinsics.checkNotNullParameter(actionBar, "");
        iLC ilc = this.copydefault;
        if (ilc != null) {
            ilc.AhwBna.setText(actionBar.AYXKKw());
            if (actionBar.OLrzqt() != null) {
                android.graphics.drawable.Drawable drawableKWHzl = C33070mpX.KWHzl(actionBar.djBIcL());
                if (drawableKWHzl != null) {
                    android.content.Context context = getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "");
                    int iCopydefault = C55298xhM.copydefault(16.0f, context);
                    android.content.Context context2 = getContext();
                    Intrinsics.checkNotNullExpressionValue(context2, "");
                    drawableKWHzl.setBounds(0, 0, iCopydefault, C55298xhM.copydefault(16.0f, context2));
                }
                ilc.AhwBna.setCompoundDrawablesRelative(null, null, drawableKWHzl, null);
                ilc.AhwBna.setOnClickListener(actionBar.OLrzqt());
            }
            if (actionBar.DbNXlk() == null || (tokenLogo = actionBar.DbNXlk().getTokenLogo()) == null || tokenLogo.isEmpty()) {
                ilc.KWHzl.setVisibility(8);
                ilc.djBIcL.setVisibility(8);
                ilc.OLrzqt.setVisibility(8);
                ilc.copydefault.setVisibility(8);
                android.widget.TextView textView = ilc.EZpvd;
                Intrinsics.checkNotNullExpressionValue(textView, "");
                textView.setVisibility(C33129mqd.OLrzqt((java.lang.CharSequence) actionBar.EZpvd()) ? 0 : 8);
                ilc.EZpvd.setText(actionBar.EZpvd());
            } else {
                java.util.List<java.lang.String> tokenLogo2 = actionBar.DbNXlk().getTokenLogo();
                Intrinsics.copydefault(tokenLogo2);
                if (tokenLogo2.size() == 2) {
                    ilc.OLrzqt.setVisibility(8);
                    ilc.copydefault.setVisibility(8);
                    ilc.EZpvd.setVisibility(8);
                    ilc.KWHzl.setVisibility(0);
                    C27538jxA c27538jxA = C27538jxA.EZpvd;
                    android.content.Context context3 = getContext();
                    Intrinsics.checkNotNullExpressionValue(context3, "");
                    c27538jxA.OLrzqt(context3, ilc.KWHzl, actionBar.DbNXlk(), 20.0f, (48 & 16) != 0 ? C32113mPz.ActionBar.fJNWhG : 0, (48 & 32) != 0 ? 0.5f : 0.0f, (48 & 64) != 0 ? C27569jxf.OLrzqt.EZpvd() : actionBar.AEQbTJ());
                    ilc.djBIcL.setVisibility(0);
                    ilc.djBIcL.setText(actionBar.EZpvd());
                } else {
                    java.util.List<java.lang.String> tokenLogo3 = actionBar.DbNXlk().getTokenLogo();
                    Intrinsics.copydefault(tokenLogo3);
                    if (tokenLogo3.size() > 2) {
                        ilc.KWHzl.setVisibility(8);
                        ilc.OLrzqt.setVisibility(8);
                        ilc.djBIcL.setVisibility(8);
                        ilc.EZpvd.setVisibility(8);
                        ilc.copydefault.setVisibility(0);
                        C27569jxf c27569jxf = C27569jxf.OLrzqt;
                        android.content.Context context4 = getContext();
                        Intrinsics.checkNotNullExpressionValue(context4, "");
                        android.widget.LinearLayout linearLayout = ilc.copydefault;
                        Intrinsics.checkNotNullExpressionValue(linearLayout, "");
                        c27569jxf.KWHzl(context4, linearLayout, actionBar.valueOf());
                    } else {
                        ilc.KWHzl.setVisibility(8);
                        ilc.djBIcL.setVisibility(8);
                        ilc.copydefault.setVisibility(8);
                        ilc.OLrzqt.setVisibility(0);
                        android.widget.TextView textView2 = ilc.EZpvd;
                        Intrinsics.checkNotNullExpressionValue(textView2, "");
                        textView2.setVisibility(C33129mqd.OLrzqt((java.lang.CharSequence) actionBar.EZpvd()) ? 0 : 8);
                        ilc.EZpvd.setText(actionBar.EZpvd());
                        C27569jxf c27569jxf2 = C27569jxf.OLrzqt;
                        android.widget.ImageView imageView = ilc.OLrzqt;
                        Intrinsics.checkNotNullExpressionValue(imageView, "");
                        java.util.List<java.lang.String> tokenLogo4 = actionBar.DbNXlk().getTokenLogo();
                        Intrinsics.copydefault(tokenLogo4);
                        c27569jxf2.KWHzl(imageView, tokenLogo4.get(0), actionBar.AEQbTJ(), C32113mPz.ActionBar.fJNWhG, 0.5f);
                    }
                }
            }
            if (actionBar.KWHzl() != null) {
                android.widget.ImageView imageView2 = ilc.gEmmrt;
                Intrinsics.checkNotNullExpressionValue(imageView2, "");
                imageView2.setVisibility(0);
                android.graphics.drawable.Drawable drawable = ContextCompat.getDrawable(getContext(), actionBar.gEmmrt());
                java.lang.Integer numAhwBna = actionBar.AhwBna();
                if (numAhwBna != null) {
                    ImageViewCompat.setImageTintList(ilc.gEmmrt, android.content.res.ColorStateList.valueOf(ContextCompat.getColor(getContext(), numAhwBna.intValue())));
                }
                ilc.gEmmrt.setImageDrawable(drawable);
                ilc.gEmmrt.setOnClickListener(actionBar.KWHzl());
                ilc.EZpvd.setOnClickListener(actionBar.KWHzl());
            } else {
                android.widget.ImageView imageView3 = ilc.gEmmrt;
                Intrinsics.checkNotNullExpressionValue(imageView3, "");
                imageView3.setVisibility(8);
            }
            InvestTipInfoVo investTipInfoVoCopydefault = actionBar.copydefault();
            if (investTipInfoVoCopydefault != null) {
                OLrzqt(investTipInfoVoCopydefault);
            }
        }
    }

    public final void setRateMaxLine(int i) {
        iLC ilc = this.copydefault;
        if (ilc != null) {
            ilc.EZpvd.setMaxLines(i);
            ilc.EZpvd.setEllipsize(TextUtils.TruncateAt.END);
        }
    }

    public final void setTradingFeeVisible(@NotNull View.OnClickListener onClickListener) {
        Intrinsics.checkNotNullParameter(onClickListener, "");
        iLC ilc = this.copydefault;
        if (ilc != null) {
            C55258xgZ c55258xgZ = ilc.AYXKKw;
            Intrinsics.checkNotNullExpressionValue(c55258xgZ, "");
            c55258xgZ.setVisibility(0);
            android.widget.ImageView imageView = ilc.AEQbTJ;
            Intrinsics.checkNotNullExpressionValue(imageView, "");
            imageView.setVisibility(0);
            ilc.AYXKKw.setOnClickListener(onClickListener);
        }
    }

    private final void OLrzqt(InvestTipInfoVo investTipInfoVo) {
        final java.lang.String content;
        iLC ilc = this.copydefault;
        if (ilc != null) {
            C55258xgZ c55258xgZ = ilc.AYXKKw;
            Intrinsics.checkNotNullExpressionValue(c55258xgZ, "");
            c55258xgZ.setVisibility(0);
            android.widget.ImageView imageView = ilc.AEQbTJ;
            Intrinsics.checkNotNullExpressionValue(imageView, "");
            imageView.setVisibility(8);
            ilc.AYXKKw.setText(investTipInfoVo.getTipContent());
            InvestPopUpData popUpData = investTipInfoVo.getPopUpData();
            if (popUpData == null || (content = popUpData.getContent()) == null) {
                return;
            }
            ilc.AYXKKw.setOnClickListener(new View.OnClickListener() { // from class: o.jqu
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C27211jqs.setAdditionalTextTip$lambda$9$lambda$8$lambda$7(this.EZpvd, content, view);
                }
            });
        }
    }

    public static final void setAdditionalTextTip$lambda$9$lambda$8$lambda$7(C27211jqs c27211jqs, java.lang.String str, android.view.View view) {
        android.content.Context context = c27211jqs.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(context);
        viewOnClickListenerC54939xaY.EZpvd(str);
        java.lang.String string = viewOnClickListenerC54939xaY.getContext().getString(C25493ixk.FragmentManager.DMb);
        Intrinsics.checkNotNullExpressionValue(string, "");
        viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) string, new View.OnClickListener() { // from class: o.jqr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view2) {
                viewOnClickListenerC54939xaY.dismiss();
            }
        });
        viewOnClickListenerC54939xaY.show();
    }

    /* JADX INFO: renamed from: o.jqs$ActionBar */
    /* JADX INFO: loaded from: classes15.dex */
    public static final class ActionBar {
        public final int AEQbTJ;
        public final java.lang.Integer AYXKKw;
        public final java.lang.String AhwBna;
        public final View.OnClickListener EZpvd;
        public final InvestTipInfoVo KWHzl;
        public final java.lang.String OLrzqt;
        public final View.OnClickListener copydefault;
        public final int djBIcL;
        public final java.util.List<InvestUnderlyingToken> gEmmrt;
        public final int valueOf;
        public final InvestmentLogoData values;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int AEQbTJ() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AYXKKw() {
            return this.AhwBna;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Integer AhwBna() {
            return this.AYXKKw;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final InvestmentLogoData DbNXlk() {
            return this.values;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String EZpvd() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ActionBar EZpvd(@NotNull java.lang.String str, InvestmentLogoData investmentLogoData, @NotNull java.lang.String str2, int i, @NotNull java.util.List<InvestUnderlyingToken> list, @androidx.annotation.DrawableRes int i2, @androidx.annotation.ColorRes java.lang.Integer num, View.OnClickListener onClickListener, @androidx.annotation.DrawableRes int i3, View.OnClickListener onClickListener2, InvestTipInfoVo investTipInfoVo) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(list, "");
            return new ActionBar(str, investmentLogoData, str2, i, list, i2, num, onClickListener, i3, onClickListener2, investTipInfoVo);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final View.OnClickListener KWHzl() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final View.OnClickListener OLrzqt() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final InvestTipInfoVo copydefault() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int djBIcL() {
            return this.djBIcL;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ActionBar)) {
                return false;
            }
            ActionBar actionBar = (ActionBar) obj;
            return Intrinsics.EZpvd((java.lang.Object) this.AhwBna, (java.lang.Object) actionBar.AhwBna) && Intrinsics.EZpvd(this.values, actionBar.values) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) actionBar.OLrzqt) && this.AEQbTJ == actionBar.AEQbTJ && Intrinsics.EZpvd(this.gEmmrt, actionBar.gEmmrt) && this.valueOf == actionBar.valueOf && Intrinsics.EZpvd(this.AYXKKw, actionBar.AYXKKw) && Intrinsics.EZpvd(this.EZpvd, actionBar.EZpvd) && this.djBIcL == actionBar.djBIcL && Intrinsics.EZpvd(this.copydefault, actionBar.copydefault) && Intrinsics.EZpvd(this.KWHzl, actionBar.KWHzl);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int gEmmrt() {
            return this.valueOf;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = this.AhwBna.hashCode();
            InvestmentLogoData investmentLogoData = this.values;
            int iHashCode2 = investmentLogoData == null ? 0 : investmentLogoData.hashCode();
            int iHashCode3 = this.OLrzqt.hashCode();
            int iHashCode4 = java.lang.Integer.hashCode(this.AEQbTJ);
            int iHashCode5 = this.gEmmrt.hashCode();
            int iHashCode6 = java.lang.Integer.hashCode(this.valueOf);
            java.lang.Integer num = this.AYXKKw;
            int iHashCode7 = num == null ? 0 : num.hashCode();
            View.OnClickListener onClickListener = this.EZpvd;
            int iHashCode8 = onClickListener == null ? 0 : onClickListener.hashCode();
            int iHashCode9 = java.lang.Integer.hashCode(this.djBIcL);
            View.OnClickListener onClickListener2 = this.copydefault;
            int iHashCode10 = onClickListener2 == null ? 0 : onClickListener2.hashCode();
            InvestTipInfoVo investTipInfoVo = this.KWHzl;
            return (((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + (investTipInfoVo != null ? investTipInfoVo.hashCode() : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "SubViewData(titleName=" + this.AhwBna + ", tokenLogoList=" + this.values + ", subName=" + this.OLrzqt + ", placeholder=" + this.AEQbTJ + ", tokenList=" + this.gEmmrt + ", subTextRightDrawable=" + this.valueOf + ", subTextRightDrawableTint=" + this.AYXKKw + ", onSubTextClickListener=" + this.EZpvd + ", titleRightDrawable=" + this.djBIcL + ", onTitleClickListener=" + this.copydefault + ", additionalTextTip=" + this.KWHzl + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<InvestUnderlyingToken> valueOf() {
            return this.gEmmrt;
        }

        public ActionBar(@NotNull java.lang.String str, InvestmentLogoData investmentLogoData, @NotNull java.lang.String str2, int i, @NotNull java.util.List<InvestUnderlyingToken> list, @androidx.annotation.DrawableRes int i2, @androidx.annotation.ColorRes java.lang.Integer num, View.OnClickListener onClickListener, @androidx.annotation.DrawableRes int i3, View.OnClickListener onClickListener2, InvestTipInfoVo investTipInfoVo) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(list, "");
            this.AhwBna = str;
            this.values = investmentLogoData;
            this.OLrzqt = str2;
            this.AEQbTJ = i;
            this.gEmmrt = list;
            this.valueOf = i2;
            this.AYXKKw = num;
            this.EZpvd = onClickListener;
            this.djBIcL = i3;
            this.copydefault = onClickListener2;
            this.KWHzl = investTipInfoVo;
        }
    }
}
