package o;

import android.view.View;
import android.view.ViewGroup;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.bumptech.glide.Glide;
import com.okinc.planet.biz_plugin.spot.data.SpotCustomizeType;
import com.okinc.planet.biz_plugin.spot.data.SpotHoldingBean;
import com.okinc.planet_api.publisher.PlanetPublisherPluginPreviewType;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C47501trL;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tEd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C46001tEd extends android.widget.FrameLayout {
    public final AbstractC46305tPk EZpvd;
    public java.lang.String OLrzqt;
    public boolean copydefault;

    /* JADX INFO: renamed from: o.tEd$TaskDescription */
    public final /* synthetic */ class TaskDescription {
        public static final /* synthetic */ int[] EZpvd;

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
            EZpvd = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C46001tEd(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C46001tEd(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:35) call: o.tEd.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C46001tEd(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C46001tEd(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        ViewDataBinding viewDataBindingInflate = DataBindingUtil.inflate(android.view.LayoutInflater.from(context), C47501trL.Application.dLBcXg, this, true);
        Intrinsics.checkNotNullExpressionValue(viewDataBindingInflate, "");
        this.EZpvd = (AbstractC46305tPk) viewDataBindingInflate;
    }

    public static /* synthetic */ void bindData$default(C46001tEd c46001tEd, SpotHoldingBean spotHoldingBean, SpotCustomizeType spotCustomizeType, PlanetPublisherPluginPreviewType planetPublisherPluginPreviewType, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            spotCustomizeType = SpotCustomizeType.Spot_Customize_PnlPercent;
        }
        if ((i & 4) != 0) {
            planetPublisherPluginPreviewType = null;
        }
        c46001tEd.AEQbTJ(spotHoldingBean, spotCustomizeType, planetPublisherPluginPreviewType);
    }

    public final void AEQbTJ(@NotNull SpotHoldingBean spotHoldingBean, SpotCustomizeType spotCustomizeType, PlanetPublisherPluginPreviewType planetPublisherPluginPreviewType) {
        Intrinsics.checkNotNullParameter(spotHoldingBean, "");
        boolean zIsSelect = spotHoldingBean.isSelect();
        Glide.AEQbTJ(getContext()).EZpvd(spotHoldingBean.getTradeAssetPlanetBean().getTokenIcon()).KWHzl(C47501trL.ActionBar.fARcdN).copydefault(C47501trL.ActionBar.fARcdN).EZpvd((NN<android.graphics.Bitmap>) new C5405Ql()).EZpvd(this.EZpvd.AYXKKw);
        this.EZpvd.AkhnZx.setText(spotHoldingBean.getTradeAssetPlanetBean().getTokenName());
        this.EZpvd.isConnected.setVisibility(8);
        this.EZpvd.fJNWhG.setTagType(12);
        C55251xgS.setBorder$default(this.EZpvd.fJNWhG, C33070mpX.copydefault(C52761wXj.Activity.DCUTEIddSDPG), 0, 2, null);
        this.EZpvd.fJNWhG.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.DCUTEIddSDPG));
        tBM tbm = tBM.copydefault;
        java.lang.String pnlRiseFall = spotHoldingBean.getTradeAssetPlanetBean().getPnlRiseFall();
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        int iOLrzqt = tbm.OLrzqt(pnlRiseFall, context, bool);
        java.lang.String pnlRiseFall2 = spotHoldingBean.getTradeAssetPlanetBean().getPnlRiseFall();
        android.content.Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        int iEZpvd = tbm.EZpvd(pnlRiseFall2, context2, bool);
        android.widget.TextView textView = this.EZpvd.fARcdN;
        C43248rlh c43248rlh = C43248rlh.KWHzl;
        textView.setText(((InterfaceC49513upv) c43248rlh.AEQbTJ(InterfaceC49513upv.class)).KWHzl(spotHoldingBean.getTradeAssetPlanetBean().getPnl(), true));
        this.EZpvd.ejfBZ.setText(((InterfaceC49513upv) c43248rlh.AEQbTJ(InterfaceC49513upv.class)).KWHzl(spotHoldingBean.getTradeAssetPlanetBean().getPnlRate()));
        this.EZpvd.fARcdN.setTextColor(iOLrzqt);
        this.EZpvd.ejfBZ.setTextColor(iOLrzqt);
        java.lang.String instId = spotHoldingBean.getTradeAssetPlanetBean().getInstId();
        if (instId == null) {
            instId = "";
        }
        boolean z = !spotHoldingBean.getKlineList().isEmpty();
        if (!Intrinsics.EZpvd((java.lang.Object) instId, (java.lang.Object) this.OLrzqt)) {
            if (z) {
                C46496tWm.setData$default(this.EZpvd.EZpvd, tBT.OLrzqt(spotHoldingBean.getKlineList()), null, java.lang.Integer.valueOf(iEZpvd), 2, null);
                this.OLrzqt = instId;
                this.copydefault = true;
            } else {
                this.EZpvd.EZpvd.clear();
                this.OLrzqt = instId;
                this.copydefault = false;
            }
        } else if (!this.copydefault && z) {
            C46496tWm.setData$default(this.EZpvd.EZpvd, tBT.OLrzqt(spotHoldingBean.getKlineList()), null, java.lang.Integer.valueOf(iEZpvd), 2, null);
            this.copydefault = true;
        } else if (!z) {
            this.copydefault = false;
        }
        this.EZpvd.AuCTelauCTel.setText(((InterfaceC49513upv) c43248rlh.AEQbTJ(InterfaceC49513upv.class)).KWHzl(spotHoldingBean.getTradeAssetPlanetBean().getPnl(), true));
        this.EZpvd.AuCTelauCTel.setTextColor(iOLrzqt);
        this.EZpvd.fIwbmz.setText(((InterfaceC49513upv) c43248rlh.AEQbTJ(InterfaceC49513upv.class)).AEQbTJ(spotHoldingBean.getTradeAssetPlanetBean().getCostPrice(), true));
        this.EZpvd.iwGUEr.setText(((InterfaceC49513upv) c43248rlh.AEQbTJ(InterfaceC49513upv.class)).AEQbTJ(spotHoldingBean.getTradeAssetPlanetBean().getLastPrice(), true));
        AbstractC46305tPk abstractC46305tPk = this.EZpvd;
        abstractC46305tPk.getNewProxyInstance.setText(abstractC46305tPk.iwGUEr.getText());
        if (zIsSelect) {
            this.EZpvd.KWHzl.setAlpha(1.0f);
            this.EZpvd.DbNXlk.setVisibility(8);
            this.EZpvd.fJNWhG.setVisibility(0);
            this.EZpvd.fetchVPNInfo.setVisibility(8);
            if (spotCustomizeType == SpotCustomizeType.Spot_Customize_PnlPercent) {
                this.EZpvd.fARcdN.setVisibility(8);
            } else {
                this.EZpvd.fARcdN.setVisibility(0);
            }
            int i = planetPublisherPluginPreviewType == null ? -1 : TaskDescription.EZpvd[planetPublisherPluginPreviewType.ordinal()];
            if (i == -1) {
                this.EZpvd.isConnected.setVisibility(8);
            } else if (i == 1 || i == 2) {
                this.EZpvd.isConnected.setVisibility(0);
                this.EZpvd.OLrzqt.setVisibility(0);
                android.widget.LinearLayout linearLayout = this.EZpvd.copydefault;
                Intrinsics.checkNotNullExpressionValue(linearLayout, "");
                tbm.copydefault(linearLayout, spotHoldingBean.getTradeAssetPlanetBean().getPnlRiseFall());
            } else {
                if (i != 3 && i != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                this.EZpvd.isConnected.setVisibility(8);
                this.EZpvd.OLrzqt.setVisibility(0);
                android.widget.LinearLayout linearLayout2 = this.EZpvd.copydefault;
                Intrinsics.checkNotNullExpressionValue(linearLayout2, "");
                tbm.copydefault(linearLayout2, spotHoldingBean.getTradeAssetPlanetBean().getPnlRiseFall());
            }
            AEQbTJ();
            return;
        }
        if (C33129mqd.OLrzqt((java.lang.CharSequence) spotHoldingBean.getTradeAssetPlanetBean().getCostPrice())) {
            this.EZpvd.DbNXlk.setVisibility(8);
            this.EZpvd.KWHzl.setAlpha(1.0f);
        } else {
            this.EZpvd.DbNXlk.setVisibility(0);
            this.EZpvd.KWHzl.setAlpha(0.5f);
        }
        this.EZpvd.fJNWhG.setVisibility(8);
        this.EZpvd.fetchVPNInfo.setVisibility(0);
        this.EZpvd.gEmmrt.setVisibility(8);
        this.EZpvd.valueOf.setVisibility(8);
        if (planetPublisherPluginPreviewType != null) {
            this.EZpvd.OLrzqt.setVisibility(8);
        }
    }

    public final void OLrzqt() {
        this.EZpvd.AhwBna.setVisibility(0);
    }

    public final void KWHzl() {
        this.EZpvd.AhwBna.setVisibility(8);
    }

    public final void AEQbTJ() {
        post(new java.lang.Runnable() { // from class: o.tEl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C46001tEd.djBIcL(this.KWHzl);
            }
        });
    }

    public static final void djBIcL(final C46001tEd c46001tEd) {
        if (c46001tEd.EZpvd.AEQbTJ.getWidth() <= 0) {
            c46001tEd.post(new java.lang.Runnable() { // from class: o.tEi
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    C46001tEd.AYXKKw(this.AEQbTJ);
                }
            });
            return;
        }
        c46001tEd.EZpvd.gEmmrt.setVisibility(4);
        c46001tEd.EZpvd.valueOf.setVisibility(4);
        c46001tEd.OLrzqt(c46001tEd.copydefault());
    }

    public static final void AYXKKw(C46001tEd c46001tEd) {
        c46001tEd.AEQbTJ();
    }

    public final boolean copydefault() {
        int measuredWidth;
        this.EZpvd.gEmmrt.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        int measuredWidth2 = this.EZpvd.gEmmrt.getMeasuredWidth();
        android.widget.LinearLayout linearLayout = this.EZpvd.fetchVPNInfo;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "");
        if (linearLayout.getVisibility() == 0) {
            this.EZpvd.fetchVPNInfo.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
            measuredWidth = this.EZpvd.fetchVPNInfo.getMeasuredWidth();
        } else {
            measuredWidth = 0;
        }
        this.EZpvd.values.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        int measuredWidth3 = this.EZpvd.values.getMeasuredWidth();
        this.EZpvd.fIwbmz.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        return measuredWidth2 <= this.EZpvd.AEQbTJ.getWidth() - (measuredWidth + ((measuredWidth3 + this.EZpvd.fIwbmz.getMeasuredWidth()) + C55298xhM.dp2px$default(4.0f, null, 1, null)));
    }

    public final void OLrzqt(boolean z) {
        if (z) {
            this.EZpvd.gEmmrt.setVisibility(0);
            this.EZpvd.valueOf.setVisibility(8);
        } else {
            this.EZpvd.gEmmrt.setVisibility(8);
            this.EZpvd.valueOf.setVisibility(0);
        }
    }

    public static /* synthetic */ void setExpanded$default(C46001tEd c46001tEd, boolean z, boolean z2, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z2 = true;
        }
        c46001tEd.setExpanded(z, z2, str);
    }

    public final void setExpanded(boolean z, boolean z2, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (!z2) {
            this.EZpvd.OLrzqt.setVisibility(z ? 0 : 8);
            if (z) {
                ConstraintLayout constraintLayout = this.EZpvd.OLrzqt;
                ViewGroup.LayoutParams layoutParams = constraintLayout.getLayoutParams();
                layoutParams.height = -2;
                constraintLayout.setLayoutParams(layoutParams);
                constraintLayout.setAlpha(1.0f);
                AEQbTJ();
                tBM tbm = tBM.copydefault;
                android.widget.LinearLayout linearLayout = this.EZpvd.copydefault;
                Intrinsics.checkNotNullExpressionValue(linearLayout, "");
                tbm.copydefault(linearLayout, str);
                CardView cardView = this.EZpvd.KWHzl;
                Intrinsics.checkNotNullExpressionValue(cardView, "");
                tbm.EZpvd((android.view.View) cardView, true, 0);
                return;
            }
            tBM tbm2 = tBM.copydefault;
            android.widget.LinearLayout linearLayout2 = this.EZpvd.copydefault;
            Intrinsics.checkNotNullExpressionValue(linearLayout2, "");
            tbm2.AEQbTJ(linearLayout2);
            CardView cardView2 = this.EZpvd.KWHzl;
            Intrinsics.checkNotNullExpressionValue(cardView2, "");
            tbm2.EZpvd((android.view.View) cardView2, false, 0);
            return;
        }
        if (z) {
            ConstraintLayout constraintLayout2 = this.EZpvd.OLrzqt;
            constraintLayout2.setVisibility(4);
            constraintLayout2.measure(View.MeasureSpec.makeMeasureSpec(constraintLayout2.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
            ViewGroup.LayoutParams layoutParams2 = constraintLayout2.getLayoutParams();
            layoutParams2.height = 1;
            constraintLayout2.setLayoutParams(layoutParams2);
            constraintLayout2.setAlpha(0.0f);
            this.EZpvd.OLrzqt.post(new java.lang.Runnable() { // from class: o.tEh
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    C46001tEd.gEmmrt(this.EZpvd);
                }
            });
            tBM tbm3 = tBM.copydefault;
            android.widget.LinearLayout linearLayout3 = this.EZpvd.copydefault;
            Intrinsics.checkNotNullExpressionValue(linearLayout3, "");
            tbm3.copydefault(linearLayout3, str);
            CardView cardView3 = this.EZpvd.KWHzl;
            Intrinsics.checkNotNullExpressionValue(cardView3, "");
            tbm3.KWHzl((android.view.View) cardView3, true);
            return;
        }
        tBM tbm4 = tBM.copydefault;
        ConstraintLayout constraintLayout3 = this.EZpvd.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(constraintLayout3, "");
        tBM.playCollapseAnimation$default(tbm4, constraintLayout3, null, 1, null);
        android.widget.LinearLayout linearLayout4 = this.EZpvd.copydefault;
        Intrinsics.checkNotNullExpressionValue(linearLayout4, "");
        tbm4.AEQbTJ(linearLayout4);
        CardView cardView4 = this.EZpvd.KWHzl;
        Intrinsics.checkNotNullExpressionValue(cardView4, "");
        tbm4.KWHzl((android.view.View) cardView4, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void gEmmrt(final C46001tEd c46001tEd) {
        c46001tEd.EZpvd.OLrzqt.setVisibility(0);
        tBM tbm = tBM.copydefault;
        ConstraintLayout constraintLayout = c46001tEd.EZpvd.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
        tbm.EZpvd(constraintLayout, new Function0() { // from class: o.tEj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C46001tEd.OLrzqt(this.KWHzl);
            }
        });
    }

    public static final Unit OLrzqt(C46001tEd c46001tEd) {
        c46001tEd.AEQbTJ();
        return Unit.INSTANCE;
    }
}
