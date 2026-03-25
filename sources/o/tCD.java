package o;

import android.view.View;
import android.view.ViewGroup;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.bumptech.glide.Glide;
import com.okinc.localization.util.format.OKDateEnum;
import com.okinc.localization.util.format.OKTimeEnum;
import com.okinc.planet.biz_plugin.future.data.FutureCustomizeType;
import com.okinc.planet.biz_plugin.future.data.FutureHistoryBean;
import com.okinc.planet_api.publisher.PlanetPublisherPluginPreviewType;
import java.util.Date;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C47501trL;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class tCD extends android.widget.FrameLayout {
    public java.lang.String AEQbTJ;
    public final AbstractC46299tPe EZpvd;
    public boolean KWHzl;

    public final /* synthetic */ class Activity {
        public static final /* synthetic */ int[] AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[PlanetPublisherPluginPreviewType.values().length];
            try {
                iArr[PlanetPublisherPluginPreviewType.LIST.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[PlanetPublisherPluginPreviewType.DETAIL.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[PlanetPublisherPluginPreviewType.FEED_SHARE.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[PlanetPublisherPluginPreviewType.PUBLISHER.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            AEQbTJ = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public tCD(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public tCD(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:63) call: o.tCD.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ tCD(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tCD(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        ViewDataBinding viewDataBindingInflate = DataBindingUtil.inflate(android.view.LayoutInflater.from(context), C47501trL.Application.akftKQ, this, true);
        Intrinsics.checkNotNullExpressionValue(viewDataBindingInflate, "");
        this.EZpvd = (AbstractC46299tPe) viewDataBindingInflate;
    }

    public static /* synthetic */ void bindData$default(tCD tcd, FutureHistoryBean futureHistoryBean, FutureCustomizeType futureCustomizeType, PlanetPublisherPluginPreviewType planetPublisherPluginPreviewType, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            futureCustomizeType = FutureCustomizeType.Future_Customize_PnlPercent;
        }
        if ((i & 4) != 0) {
            planetPublisherPluginPreviewType = null;
        }
        tcd.KWHzl(futureHistoryBean, futureCustomizeType, planetPublisherPluginPreviewType);
    }

    public final void KWHzl(@NotNull FutureHistoryBean futureHistoryBean, FutureCustomizeType futureCustomizeType, final PlanetPublisherPluginPreviewType planetPublisherPluginPreviewType) {
        java.lang.String strCopydefault;
        boolean z;
        Intrinsics.checkNotNullParameter(futureHistoryBean, "");
        boolean zIsSelect = futureHistoryBean.isSelect();
        Glide.AEQbTJ(getContext()).EZpvd(futureHistoryBean.getTradeHisPositionPlanetBean().getTokenIcon()).KWHzl(C47501trL.ActionBar.fARcdN).copydefault(C47501trL.ActionBar.fARcdN).EZpvd((NN<android.graphics.Bitmap>) new C5405Ql()).EZpvd(this.EZpvd.AYXKKw);
        this.EZpvd.values.setText(futureHistoryBean.getTradeHisPositionPlanetBean().getInstName());
        this.EZpvd.AuCTelauCTel.setVisibility(zIsSelect ? 8 : 0);
        this.EZpvd.AuCTelauCTel.setText(pTA.format$default(new Date(C33129mqd.valueOf(futureHistoryBean.getTradeHisPositionPlanetBean().getUTimestamp())), OKDateEnum.DATE_FORMAT_SIMPLE, OKTimeEnum.TIME_FORMAT_SIMPLE_HM, null, null, false, 28, null));
        C45996tDz c45996tDz = this.EZpvd.DbNXlk;
        C43248rlh c43248rlh = C43248rlh.KWHzl;
        c45996tDz.AEQbTJ(((InterfaceC49513upv) c43248rlh.AEQbTJ(InterfaceC49513upv.class)).EZpvd(futureHistoryBean.getTradeHisPositionPlanetBean().getTag()), futureHistoryBean.getTradeHisPositionPlanetBean().getLeverage(), ((InterfaceC49513upv) c43248rlh.AEQbTJ(InterfaceC49513upv.class)).AEQbTJ(futureHistoryBean.getTradeHisPositionPlanetBean().getShareType()), C33070mpX.AYXKKw(C47501trL.Fragment.hbZCHz), zIsSelect, futureHistoryBean.getTradeHisPositionPlanetBean().getSide());
        this.EZpvd.isConnected.AEQbTJ(((InterfaceC49513upv) c43248rlh.AEQbTJ(InterfaceC49513upv.class)).EZpvd(futureHistoryBean.getTradeHisPositionPlanetBean().getTag()), futureHistoryBean.getTradeHisPositionPlanetBean().getLeverage(), ((InterfaceC49513upv) c43248rlh.AEQbTJ(InterfaceC49513upv.class)).AEQbTJ(futureHistoryBean.getTradeHisPositionPlanetBean().getShareType()), C33070mpX.AYXKKw(C47501trL.Fragment.hbZCHz), zIsSelect, futureHistoryBean.getTradeHisPositionPlanetBean().getSide());
        tBM tbm = tBM.copydefault;
        java.lang.String pnlRiseFall = futureHistoryBean.getTradeHisPositionPlanetBean().getPnlRiseFall();
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        int iOLrzqt = tbm.OLrzqt(pnlRiseFall, context, bool);
        java.lang.String pnlRiseFall2 = futureHistoryBean.getTradeHisPositionPlanetBean().getPnlRiseFall();
        android.content.Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        int iEZpvd = tbm.EZpvd(pnlRiseFall2, context2, bool);
        android.widget.TextView textView = this.EZpvd.ejfBZ;
        FutureCustomizeType futureCustomizeType2 = FutureCustomizeType.Future_Customize_PnlPercent;
        if (futureCustomizeType == futureCustomizeType2) {
            strCopydefault = C33070mpX.AYXKKw(C47501trL.Fragment.gVEiQJ);
        } else {
            strCopydefault = C33069mpW.copydefault(C47501trL.Fragment.Dfm, C56423yEv.EZpvd(C56390yDp.OLrzqt("ccy", futureHistoryBean.getTradeHisPositionPlanetBean().getPnlUnit())));
        }
        textView.setText(strCopydefault);
        this.EZpvd.iwGUEr.setText(C33069mpW.copydefault(C47501trL.Fragment.gbIfDn, C56423yEv.EZpvd(C56390yDp.OLrzqt("ccy", futureHistoryBean.getTradeHisPositionPlanetBean().getPnlUnit()))));
        this.EZpvd.fIwbmz.setText(((InterfaceC49513upv) c43248rlh.AEQbTJ(InterfaceC49513upv.class)).KWHzl(futureHistoryBean.getTradeHisPositionPlanetBean().getPnl(), false));
        this.EZpvd.fARcdN.setText(((InterfaceC49513upv) c43248rlh.AEQbTJ(InterfaceC49513upv.class)).KWHzl(futureHistoryBean.getTradeHisPositionPlanetBean().getPnlRate()));
        this.EZpvd.fIwbmz.setTextColor(iOLrzqt);
        this.EZpvd.fARcdN.setTextColor(iOLrzqt);
        java.lang.String posId = futureHistoryBean.getTradeHisPositionPlanetBean().getPosId();
        boolean z2 = !futureHistoryBean.getKlineList().isEmpty();
        if (!(!Intrinsics.EZpvd((java.lang.Object) posId, (java.lang.Object) this.AEQbTJ))) {
            if (!this.KWHzl && z2) {
                this.EZpvd.copydefault.setData(tBT.OLrzqt(futureHistoryBean.getKlineList()), tBT.KWHzl(futureHistoryBean.getBuySellMarkerList()), java.lang.Integer.valueOf(iEZpvd));
                this.KWHzl = true;
            } else if (!z2) {
                z = false;
                this.KWHzl = false;
            }
            z = false;
        } else if (z2) {
            this.EZpvd.copydefault.setData(tBT.OLrzqt(futureHistoryBean.getKlineList()), tBT.KWHzl(futureHistoryBean.getBuySellMarkerList()), java.lang.Integer.valueOf(iEZpvd));
            this.AEQbTJ = posId;
            this.KWHzl = true;
            z = false;
        } else {
            this.EZpvd.copydefault.clear();
            this.AEQbTJ = posId;
            z = false;
            this.KWHzl = false;
        }
        this.EZpvd.zsXlph.setText(((InterfaceC49513upv) c43248rlh.AEQbTJ(InterfaceC49513upv.class)).KWHzl(futureHistoryBean.getTradeHisPositionPlanetBean().getPnl(), z));
        this.EZpvd.zsXlph.setTextColor(iOLrzqt);
        this.EZpvd.fJNWhG.setText(((InterfaceC49513upv) c43248rlh.AEQbTJ(InterfaceC49513upv.class)).AEQbTJ(futureHistoryBean.getTradeHisPositionPlanetBean().getEntryPrice(), !futureHistoryBean.getTradeHisPositionPlanetBean().isPositive()));
        this.EZpvd.getFieldNames.setText(((InterfaceC49513upv) c43248rlh.AEQbTJ(InterfaceC49513upv.class)).AEQbTJ(futureHistoryBean.getTradeHisPositionPlanetBean().getExitPrice(), !futureHistoryBean.getTradeHisPositionPlanetBean().isPositive()));
        this.EZpvd.getNewProxyInstance.setText(C33070mpX.AYXKKw(C47501trL.Fragment.sVvuFk));
        AbstractC46299tPe abstractC46299tPe = this.EZpvd;
        abstractC46299tPe.hDKMBd.setText(abstractC46299tPe.getFieldNames.getText());
        AbstractC46299tPe abstractC46299tPe2 = this.EZpvd;
        abstractC46299tPe2.uzCIH.setText(abstractC46299tPe2.getNewProxyInstance.getText());
        if (zIsSelect) {
            this.EZpvd.AkhnZx.setVisibility(8);
            if (futureCustomizeType == futureCustomizeType2) {
                this.EZpvd.fIwbmz.setVisibility(8);
            } else {
                this.EZpvd.fIwbmz.setVisibility(0);
            }
            int i = planetPublisherPluginPreviewType == null ? -1 : Activity.AEQbTJ[planetPublisherPluginPreviewType.ordinal()];
            if (i == -1) {
                this.EZpvd.fetchVPNInfo.setVisibility(8);
            } else if (i == 1 || i == 2) {
                this.EZpvd.fetchVPNInfo.setVisibility(0);
                this.EZpvd.KWHzl.setVisibility(0);
                android.widget.LinearLayout linearLayout = this.EZpvd.AEQbTJ;
                Intrinsics.checkNotNullExpressionValue(linearLayout, "");
                tbm.copydefault(linearLayout, futureHistoryBean.getTradeHisPositionPlanetBean().getPnlRiseFall());
            } else {
                if (i != 3 && i != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                this.EZpvd.fetchVPNInfo.setVisibility(8);
                this.EZpvd.KWHzl.setVisibility(0);
                android.widget.LinearLayout linearLayout2 = this.EZpvd.AEQbTJ;
                Intrinsics.checkNotNullExpressionValue(linearLayout2, "");
                tbm.copydefault(linearLayout2, futureHistoryBean.getTradeHisPositionPlanetBean().getPnlRiseFall());
            }
            post(new java.lang.Runnable() { // from class: o.tCF
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    tCD.KWHzl(this.copydefault, planetPublisherPluginPreviewType);
                }
            });
            return;
        }
        this.EZpvd.AkhnZx.setVisibility(0);
        this.EZpvd.AhwBna.setVisibility(8);
        this.EZpvd.valueOf.setVisibility(8);
        this.EZpvd.fetchVPNInfo.setVisibility(8);
        if (planetPublisherPluginPreviewType != null) {
            this.EZpvd.KWHzl.setVisibility(8);
        }
        OLrzqt(planetPublisherPluginPreviewType);
    }

    public static final void KWHzl(tCD tcd, PlanetPublisherPluginPreviewType planetPublisherPluginPreviewType) {
        tcd.copydefault();
        tcd.EZpvd(planetPublisherPluginPreviewType);
    }

    public final void EZpvd() {
        this.EZpvd.djBIcL.setVisibility(0);
    }

    public final void AEQbTJ() {
        this.EZpvd.djBIcL.setVisibility(8);
    }

    public final void copydefault() {
        if (this.EZpvd.OLrzqt.getWidth() <= 0) {
            post(new java.lang.Runnable() { // from class: o.tCJ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    tCD.AYXKKw(this.EZpvd);
                }
            });
            return;
        }
        this.EZpvd.AhwBna.setVisibility(4);
        this.EZpvd.valueOf.setVisibility(4);
        EZpvd(OLrzqt());
    }

    public static final void AYXKKw(tCD tcd) {
        tcd.copydefault();
    }

    public static /* synthetic */ void updateTagLayoutWithSelect$default(tCD tcd, PlanetPublisherPluginPreviewType planetPublisherPluginPreviewType, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            planetPublisherPluginPreviewType = null;
        }
        tcd.EZpvd(planetPublisherPluginPreviewType);
    }

    public final void EZpvd(PlanetPublisherPluginPreviewType planetPublisherPluginPreviewType) {
        this.EZpvd.DbNXlk.setVisibility(4);
        this.EZpvd.isConnected.setVisibility(4);
        AEQbTJ(copydefault(planetPublisherPluginPreviewType));
    }

    public static /* synthetic */ void updateTagLayoutWithUnSelect$default(tCD tcd, PlanetPublisherPluginPreviewType planetPublisherPluginPreviewType, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            planetPublisherPluginPreviewType = null;
        }
        tcd.OLrzqt(planetPublisherPluginPreviewType);
    }

    public final void OLrzqt(final PlanetPublisherPluginPreviewType planetPublisherPluginPreviewType) {
        post(new java.lang.Runnable() { // from class: o.tCI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                tCD.OLrzqt(this.KWHzl, planetPublisherPluginPreviewType);
            }
        });
    }

    public static final void OLrzqt(tCD tcd, PlanetPublisherPluginPreviewType planetPublisherPluginPreviewType) {
        tcd.EZpvd.DbNXlk.setVisibility(4);
        tcd.EZpvd.isConnected.setVisibility(4);
        tcd.AEQbTJ(tcd.copydefault(planetPublisherPluginPreviewType));
    }

    public static /* synthetic */ boolean calculateTagsChoice$default(tCD tcd, PlanetPublisherPluginPreviewType planetPublisherPluginPreviewType, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            planetPublisherPluginPreviewType = null;
        }
        return tcd.copydefault(planetPublisherPluginPreviewType);
    }

    public final boolean copydefault(PlanetPublisherPluginPreviewType planetPublisherPluginPreviewType) {
        int width = this.EZpvd.AYXKKw.getWidth();
        int width2 = this.EZpvd.values.getWidth();
        android.widget.TextView textView = this.EZpvd.AuCTelauCTel;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        int width3 = textView.getVisibility() == 0 ? this.EZpvd.AuCTelauCTel.getWidth() : 0;
        C52794wYp c52794wYp = this.EZpvd.fetchVPNInfo;
        Intrinsics.checkNotNullExpressionValue(c52794wYp, "");
        return this.EZpvd.DbNXlk.EZpvd() <= this.EZpvd.gEmmrt.getWidth() - (((((width + width2) + width3) + (c52794wYp.getVisibility() == 0 ? this.EZpvd.fetchVPNInfo.getWidth() : 0)) + (C55298xhM.dp2px$default(4.0f, null, 1, null) * 6)) + (planetPublisherPluginPreviewType == PlanetPublisherPluginPreviewType.PUBLISHER ? C55298xhM.dp2px$default(22.0f, null, 1, null) : 0));
    }

    public final void AEQbTJ(boolean z) {
        if (z) {
            this.EZpvd.DbNXlk.setVisibility(0);
            this.EZpvd.isConnected.setVisibility(8);
        } else {
            this.EZpvd.DbNXlk.setVisibility(8);
            this.EZpvd.isConnected.setVisibility(0);
        }
    }

    public final boolean OLrzqt() {
        int measuredWidth;
        this.EZpvd.AhwBna.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        int measuredWidth2 = this.EZpvd.AhwBna.getMeasuredWidth();
        android.widget.LinearLayout linearLayout = this.EZpvd.AkhnZx;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "");
        if (linearLayout.getVisibility() == 0) {
            this.EZpvd.AkhnZx.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
            measuredWidth = this.EZpvd.AkhnZx.getMeasuredWidth();
        } else {
            measuredWidth = 0;
        }
        this.EZpvd.AuCTel.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        int measuredWidth3 = this.EZpvd.AuCTel.getMeasuredWidth();
        this.EZpvd.fJNWhG.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        return measuredWidth2 <= this.EZpvd.OLrzqt.getWidth() - (measuredWidth + ((measuredWidth3 + this.EZpvd.fJNWhG.getMeasuredWidth()) + C55298xhM.dp2px$default(4.0f, null, 1, null)));
    }

    public final void EZpvd(boolean z) {
        if (z) {
            this.EZpvd.AhwBna.setVisibility(0);
            this.EZpvd.valueOf.setVisibility(8);
        } else {
            this.EZpvd.AhwBna.setVisibility(8);
            this.EZpvd.valueOf.setVisibility(0);
        }
    }

    public static /* synthetic */ void setExpanded$default(tCD tcd, boolean z, boolean z2, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z2 = true;
        }
        tcd.setExpanded(z, z2, str);
    }

    public final void setExpanded(boolean z, boolean z2, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (!z2) {
            this.EZpvd.KWHzl.setVisibility(z ? 0 : 8);
            if (z) {
                this.EZpvd.AhwBna.setVisibility(4);
                ConstraintLayout constraintLayout = this.EZpvd.KWHzl;
                ViewGroup.LayoutParams layoutParams = constraintLayout.getLayoutParams();
                layoutParams.height = -2;
                constraintLayout.setLayoutParams(layoutParams);
                constraintLayout.setAlpha(1.0f);
                tBM tbm = tBM.copydefault;
                android.widget.LinearLayout linearLayout = this.EZpvd.AEQbTJ;
                Intrinsics.checkNotNullExpressionValue(linearLayout, "");
                tbm.copydefault(linearLayout, str);
                CardView cardView = this.EZpvd.EZpvd;
                Intrinsics.checkNotNullExpressionValue(cardView, "");
                tbm.EZpvd((android.view.View) cardView, true, 0);
                post(new java.lang.Runnable() { // from class: o.tCG
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // java.lang.Runnable
                    public final void run() {
                        tCD.djBIcL(this.OLrzqt);
                    }
                });
                return;
            }
            tBM tbm2 = tBM.copydefault;
            android.widget.LinearLayout linearLayout2 = this.EZpvd.AEQbTJ;
            Intrinsics.checkNotNullExpressionValue(linearLayout2, "");
            tbm2.AEQbTJ(linearLayout2);
            CardView cardView2 = this.EZpvd.EZpvd;
            Intrinsics.checkNotNullExpressionValue(cardView2, "");
            tbm2.EZpvd((android.view.View) cardView2, false, 0);
            updateTagLayoutWithUnSelect$default(this, null, 1, null);
            return;
        }
        if (z) {
            ConstraintLayout constraintLayout2 = this.EZpvd.KWHzl;
            constraintLayout2.setVisibility(4);
            constraintLayout2.measure(View.MeasureSpec.makeMeasureSpec(constraintLayout2.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
            ViewGroup.LayoutParams layoutParams2 = constraintLayout2.getLayoutParams();
            layoutParams2.height = 1;
            constraintLayout2.setLayoutParams(layoutParams2);
            constraintLayout2.setAlpha(0.0f);
            this.EZpvd.KWHzl.post(new java.lang.Runnable() { // from class: o.tCB
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    tCD.isConnected(this.OLrzqt);
                }
            });
            tBM tbm3 = tBM.copydefault;
            android.widget.LinearLayout linearLayout3 = this.EZpvd.AEQbTJ;
            Intrinsics.checkNotNullExpressionValue(linearLayout3, "");
            tbm3.copydefault(linearLayout3, str);
            CardView cardView3 = this.EZpvd.EZpvd;
            Intrinsics.checkNotNullExpressionValue(cardView3, "");
            tbm3.KWHzl((android.view.View) cardView3, true);
            return;
        }
        tBM tbm4 = tBM.copydefault;
        ConstraintLayout constraintLayout3 = this.EZpvd.KWHzl;
        Intrinsics.checkNotNullExpressionValue(constraintLayout3, "");
        tbm4.OLrzqt(constraintLayout3, new Function0() { // from class: o.tCE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return tCD.gEmmrt(this.EZpvd);
            }
        });
        android.widget.LinearLayout linearLayout4 = this.EZpvd.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(linearLayout4, "");
        tbm4.AEQbTJ(linearLayout4);
        CardView cardView4 = this.EZpvd.EZpvd;
        Intrinsics.checkNotNullExpressionValue(cardView4, "");
        tbm4.KWHzl((android.view.View) cardView4, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void isConnected(final tCD tcd) {
        tcd.EZpvd.KWHzl.setVisibility(0);
        tBM tbm = tBM.copydefault;
        ConstraintLayout constraintLayout = tcd.EZpvd.KWHzl;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
        tbm.EZpvd(constraintLayout, new Function0() { // from class: o.tCA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return tCD.valueOf(this.AEQbTJ);
            }
        });
    }

    public static final Unit valueOf(final tCD tcd) {
        tcd.post(new java.lang.Runnable() { // from class: o.tCH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                tCD.DbNXlk(this.EZpvd);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void DbNXlk(tCD tcd) {
        tcd.copydefault();
        updateTagLayoutWithSelect$default(tcd, null, 1, null);
    }

    public static final Unit gEmmrt(tCD tcd) {
        updateTagLayoutWithUnSelect$default(tcd, null, 1, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void djBIcL(tCD tcd) {
        tcd.copydefault();
        updateTagLayoutWithSelect$default(tcd, null, 1, null);
    }
}
