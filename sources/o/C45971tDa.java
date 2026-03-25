package o;

import android.view.View;
import android.view.ViewGroup;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.bumptech.glide.Glide;
import com.okinc.planet.biz_plugin.future.data.FutureCustomizeType;
import com.okinc.planet.biz_plugin.future.data.FuturePositionBean;
import com.okinc.planet_api.publisher.PlanetPublisherPluginPreviewType;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C47501trL;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tDa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C45971tDa extends android.widget.FrameLayout {
    public boolean EZpvd;
    public java.lang.String OLrzqt;
    public final AbstractC46299tPe copydefault;

    /* JADX INFO: renamed from: o.tDa$TaskDescription */
    public final /* synthetic */ class TaskDescription {
        public static final /* synthetic */ int[] copydefault;

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
            copydefault = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C45971tDa(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C45971tDa(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:57) call: o.tDa.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C45971tDa(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C45971tDa(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        ViewDataBinding viewDataBindingInflate = DataBindingUtil.inflate(android.view.LayoutInflater.from(context), C47501trL.Application.akftKQ, this, true);
        Intrinsics.checkNotNullExpressionValue(viewDataBindingInflate, "");
        this.copydefault = (AbstractC46299tPe) viewDataBindingInflate;
    }

    public static /* synthetic */ void bindData$default(C45971tDa c45971tDa, FuturePositionBean futurePositionBean, FutureCustomizeType futureCustomizeType, PlanetPublisherPluginPreviewType planetPublisherPluginPreviewType, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            futureCustomizeType = FutureCustomizeType.Future_Customize_PnlPercent;
        }
        if ((i & 4) != 0) {
            planetPublisherPluginPreviewType = null;
        }
        c45971tDa.KWHzl(futurePositionBean, futureCustomizeType, planetPublisherPluginPreviewType);
    }

    public final void KWHzl(@NotNull FuturePositionBean futurePositionBean, FutureCustomizeType futureCustomizeType, final PlanetPublisherPluginPreviewType planetPublisherPluginPreviewType) {
        java.lang.String strCopydefault;
        Intrinsics.checkNotNullParameter(futurePositionBean, "");
        boolean zIsSelect = futurePositionBean.isSelect();
        Glide.AEQbTJ(getContext()).EZpvd(futurePositionBean.getTradePositionPlanetBean().getTokenIcon()).KWHzl(C47501trL.ActionBar.fARcdN).copydefault(C47501trL.ActionBar.fARcdN).EZpvd((NN<android.graphics.Bitmap>) new C5405Ql()).EZpvd(this.copydefault.AYXKKw);
        this.copydefault.values.setText(futurePositionBean.getTradePositionPlanetBean().getInstName());
        C45996tDz c45996tDz = this.copydefault.DbNXlk;
        C43248rlh c43248rlh = C43248rlh.KWHzl;
        c45996tDz.AEQbTJ(((InterfaceC49513upv) c43248rlh.AEQbTJ(InterfaceC49513upv.class)).EZpvd(futurePositionBean.getTradePositionPlanetBean().getTag()), futurePositionBean.getTradePositionPlanetBean().getLeverage(), ((InterfaceC49513upv) c43248rlh.AEQbTJ(InterfaceC49513upv.class)).AEQbTJ(futurePositionBean.getTradePositionPlanetBean().getShareType()), C33070mpX.AYXKKw(C47501trL.Fragment.fMBJsc), zIsSelect, futurePositionBean.getTradePositionPlanetBean().getSide());
        this.copydefault.isConnected.AEQbTJ(((InterfaceC49513upv) c43248rlh.AEQbTJ(InterfaceC49513upv.class)).EZpvd(futurePositionBean.getTradePositionPlanetBean().getTag()), futurePositionBean.getTradePositionPlanetBean().getLeverage(), ((InterfaceC49513upv) c43248rlh.AEQbTJ(InterfaceC49513upv.class)).AEQbTJ(futurePositionBean.getTradePositionPlanetBean().getShareType()), C33070mpX.AYXKKw(C47501trL.Fragment.fMBJsc), zIsSelect, futurePositionBean.getTradePositionPlanetBean().getSide());
        tBM tbm = tBM.copydefault;
        java.lang.String pnlRiseFall = futurePositionBean.getTradePositionPlanetBean().getPnlRiseFall();
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        int iOLrzqt = tbm.OLrzqt(pnlRiseFall, context, bool);
        java.lang.String pnlRiseFall2 = futurePositionBean.getTradePositionPlanetBean().getPnlRiseFall();
        android.content.Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        int iEZpvd = tbm.EZpvd(pnlRiseFall2, context2, bool);
        java.lang.String posId = futurePositionBean.getTradePositionPlanetBean().getPosId();
        boolean z = !futurePositionBean.getKlineList().isEmpty();
        if (!Intrinsics.EZpvd((java.lang.Object) posId, (java.lang.Object) this.OLrzqt)) {
            if (z) {
                this.copydefault.copydefault.setData(tBT.OLrzqt(futurePositionBean.getKlineList()), tBT.KWHzl(futurePositionBean.getBuySellMarkerList()), java.lang.Integer.valueOf(iEZpvd));
                this.OLrzqt = posId;
                this.EZpvd = true;
            } else {
                this.copydefault.copydefault.clear();
                this.OLrzqt = posId;
                this.EZpvd = false;
            }
        } else if (!this.EZpvd && z) {
            this.copydefault.copydefault.setData(tBT.OLrzqt(futurePositionBean.getKlineList()), tBT.KWHzl(futurePositionBean.getBuySellMarkerList()), java.lang.Integer.valueOf(iEZpvd));
            this.EZpvd = true;
        } else if (!z) {
            this.EZpvd = false;
        }
        this.copydefault.fIwbmz.setText(((InterfaceC49513upv) c43248rlh.AEQbTJ(InterfaceC49513upv.class)).KWHzl(futurePositionBean.getTradePositionPlanetBean().getPnl(), false));
        android.widget.TextView textView = this.copydefault.ejfBZ;
        FutureCustomizeType futureCustomizeType2 = FutureCustomizeType.Future_Customize_PnlPercent;
        if (futureCustomizeType == futureCustomizeType2) {
            strCopydefault = C33070mpX.AYXKKw(C47501trL.Fragment.gVEiQJ);
        } else {
            strCopydefault = C33069mpW.copydefault(C47501trL.Fragment.Dfm, C56423yEv.EZpvd(C56390yDp.OLrzqt("ccy", futurePositionBean.getTradePositionPlanetBean().getPnlUnit())));
        }
        textView.setText(strCopydefault);
        this.copydefault.iwGUEr.setText(C33069mpW.copydefault(C47501trL.Fragment.gbIfDn, C56423yEv.EZpvd(C56390yDp.OLrzqt("ccy", futurePositionBean.getTradePositionPlanetBean().getPnlUnit()))));
        this.copydefault.fARcdN.setText(((InterfaceC49513upv) c43248rlh.AEQbTJ(InterfaceC49513upv.class)).KWHzl(futurePositionBean.getTradePositionPlanetBean().getPnlRate()));
        this.copydefault.fIwbmz.setTextColor(iOLrzqt);
        this.copydefault.fARcdN.setTextColor(iOLrzqt);
        this.copydefault.zsXlph.setText(((InterfaceC49513upv) c43248rlh.AEQbTJ(InterfaceC49513upv.class)).KWHzl(futurePositionBean.getTradePositionPlanetBean().getPnl(), false));
        this.copydefault.zsXlph.setTextColor(iOLrzqt);
        this.copydefault.fJNWhG.setText(((InterfaceC49513upv) c43248rlh.AEQbTJ(InterfaceC49513upv.class)).AEQbTJ(futurePositionBean.getTradePositionPlanetBean().getEntryPrice(), !futurePositionBean.getTradePositionPlanetBean().isPositive()));
        this.copydefault.getFieldNames.setText(((InterfaceC49513upv) c43248rlh.AEQbTJ(InterfaceC49513upv.class)).AEQbTJ(futurePositionBean.getTradePositionPlanetBean().getPnlPrice(), !futurePositionBean.getTradePositionPlanetBean().isPositive()));
        this.copydefault.getNewProxyInstance.setText(((InterfaceC49513upv) c43248rlh.AEQbTJ(InterfaceC49513upv.class)).OLrzqt(futurePositionBean.getTradePositionPlanetBean().getPnlPriceLabel()));
        AbstractC46299tPe abstractC46299tPe = this.copydefault;
        abstractC46299tPe.hDKMBd.setText(abstractC46299tPe.getFieldNames.getText());
        AbstractC46299tPe abstractC46299tPe2 = this.copydefault;
        abstractC46299tPe2.uzCIH.setText(abstractC46299tPe2.getNewProxyInstance.getText());
        this.copydefault.AuCTelauCTel.setVisibility(8);
        if (zIsSelect) {
            this.copydefault.AkhnZx.setVisibility(8);
            if (futureCustomizeType == futureCustomizeType2) {
                this.copydefault.fIwbmz.setVisibility(8);
            } else {
                this.copydefault.fIwbmz.setVisibility(0);
            }
            int i = planetPublisherPluginPreviewType == null ? -1 : TaskDescription.copydefault[planetPublisherPluginPreviewType.ordinal()];
            if (i == -1) {
                this.copydefault.fetchVPNInfo.setVisibility(8);
            } else if (i == 1 || i == 2) {
                this.copydefault.fetchVPNInfo.setVisibility(0);
                this.copydefault.KWHzl.setVisibility(0);
                android.widget.LinearLayout linearLayout = this.copydefault.AEQbTJ;
                Intrinsics.checkNotNullExpressionValue(linearLayout, "");
                tbm.copydefault(linearLayout, futurePositionBean.getTradePositionPlanetBean().getPnlRiseFall());
            } else {
                if (i != 3 && i != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                this.copydefault.fetchVPNInfo.setVisibility(8);
                this.copydefault.KWHzl.setVisibility(0);
                android.widget.LinearLayout linearLayout2 = this.copydefault.AEQbTJ;
                Intrinsics.checkNotNullExpressionValue(linearLayout2, "");
                tbm.copydefault(linearLayout2, futurePositionBean.getTradePositionPlanetBean().getPnlRiseFall());
            }
            post(new java.lang.Runnable() { // from class: o.tDc
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    C45971tDa.copydefault(this.EZpvd, planetPublisherPluginPreviewType);
                }
            });
            return;
        }
        this.copydefault.AkhnZx.setVisibility(0);
        this.copydefault.AhwBna.setVisibility(8);
        this.copydefault.valueOf.setVisibility(8);
        this.copydefault.fetchVPNInfo.setVisibility(8);
        if (planetPublisherPluginPreviewType != null) {
            this.copydefault.KWHzl.setVisibility(8);
        }
        AEQbTJ(planetPublisherPluginPreviewType);
    }

    public static final void copydefault(C45971tDa c45971tDa, PlanetPublisherPluginPreviewType planetPublisherPluginPreviewType) {
        c45971tDa.AEQbTJ();
        c45971tDa.OLrzqt(planetPublisherPluginPreviewType);
    }

    public final void KWHzl() {
        this.copydefault.djBIcL.setVisibility(0);
    }

    public final void copydefault() {
        this.copydefault.djBIcL.setVisibility(8);
    }

    public final void AEQbTJ() {
        if (this.copydefault.OLrzqt.getWidth() <= 0) {
            post(new java.lang.Runnable() { // from class: o.tDi
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    C45971tDa.valueOf(this.copydefault);
                }
            });
            return;
        }
        this.copydefault.AhwBna.setVisibility(4);
        this.copydefault.valueOf.setVisibility(4);
        KWHzl(EZpvd());
    }

    public static final void valueOf(C45971tDa c45971tDa) {
        c45971tDa.AEQbTJ();
    }

    public static /* synthetic */ void updateTagLayoutWithSelect$default(C45971tDa c45971tDa, PlanetPublisherPluginPreviewType planetPublisherPluginPreviewType, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            planetPublisherPluginPreviewType = null;
        }
        c45971tDa.OLrzqt(planetPublisherPluginPreviewType);
    }

    public final void OLrzqt(PlanetPublisherPluginPreviewType planetPublisherPluginPreviewType) {
        this.copydefault.DbNXlk.setVisibility(4);
        this.copydefault.isConnected.setVisibility(4);
        OLrzqt(KWHzl(planetPublisherPluginPreviewType));
    }

    public static /* synthetic */ void updateTagLayoutWithUnSelect$default(C45971tDa c45971tDa, PlanetPublisherPluginPreviewType planetPublisherPluginPreviewType, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            planetPublisherPluginPreviewType = null;
        }
        c45971tDa.AEQbTJ(planetPublisherPluginPreviewType);
    }

    public final void AEQbTJ(final PlanetPublisherPluginPreviewType planetPublisherPluginPreviewType) {
        post(new java.lang.Runnable() { // from class: o.tDe
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C45971tDa.EZpvd(this.AEQbTJ, planetPublisherPluginPreviewType);
            }
        });
    }

    public static final void EZpvd(C45971tDa c45971tDa, PlanetPublisherPluginPreviewType planetPublisherPluginPreviewType) {
        c45971tDa.copydefault.DbNXlk.setVisibility(4);
        c45971tDa.copydefault.isConnected.setVisibility(4);
        c45971tDa.OLrzqt(c45971tDa.KWHzl(planetPublisherPluginPreviewType));
    }

    public static /* synthetic */ boolean calculateTagsChoice$default(C45971tDa c45971tDa, PlanetPublisherPluginPreviewType planetPublisherPluginPreviewType, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            planetPublisherPluginPreviewType = null;
        }
        return c45971tDa.KWHzl(planetPublisherPluginPreviewType);
    }

    public final boolean KWHzl(PlanetPublisherPluginPreviewType planetPublisherPluginPreviewType) {
        int width = this.copydefault.AYXKKw.getWidth();
        int width2 = this.copydefault.values.getWidth();
        android.widget.TextView textView = this.copydefault.AuCTelauCTel;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        int width3 = textView.getVisibility() == 0 ? this.copydefault.AuCTelauCTel.getWidth() : 0;
        C52794wYp c52794wYp = this.copydefault.fetchVPNInfo;
        Intrinsics.checkNotNullExpressionValue(c52794wYp, "");
        return this.copydefault.DbNXlk.EZpvd() <= this.copydefault.gEmmrt.getWidth() - (((((width + width2) + width3) + (c52794wYp.getVisibility() == 0 ? this.copydefault.fetchVPNInfo.getWidth() : 0)) + (C55298xhM.dp2px$default(4.0f, null, 1, null) * 6)) + (planetPublisherPluginPreviewType == PlanetPublisherPluginPreviewType.PUBLISHER ? C55298xhM.dp2px$default(22.0f, null, 1, null) : 0));
    }

    public final void OLrzqt(boolean z) {
        if (z) {
            this.copydefault.DbNXlk.setVisibility(0);
            this.copydefault.isConnected.setVisibility(8);
        } else {
            this.copydefault.DbNXlk.setVisibility(8);
            this.copydefault.isConnected.setVisibility(0);
        }
    }

    public final boolean EZpvd() {
        int measuredWidth;
        this.copydefault.AhwBna.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        int measuredWidth2 = this.copydefault.AhwBna.getMeasuredWidth();
        android.widget.LinearLayout linearLayout = this.copydefault.AkhnZx;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "");
        if (linearLayout.getVisibility() == 0) {
            this.copydefault.AkhnZx.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
            measuredWidth = this.copydefault.AkhnZx.getMeasuredWidth();
        } else {
            measuredWidth = 0;
        }
        this.copydefault.AuCTel.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        int measuredWidth3 = this.copydefault.AuCTel.getMeasuredWidth();
        this.copydefault.fJNWhG.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        return measuredWidth2 <= this.copydefault.OLrzqt.getWidth() - (measuredWidth + ((measuredWidth3 + this.copydefault.fJNWhG.getMeasuredWidth()) + C55298xhM.dp2px$default(4.0f, null, 1, null)));
    }

    public final void KWHzl(boolean z) {
        if (z) {
            this.copydefault.AhwBna.setVisibility(0);
            this.copydefault.valueOf.setVisibility(8);
        } else {
            this.copydefault.AhwBna.setVisibility(8);
            this.copydefault.valueOf.setVisibility(0);
        }
    }

    public static /* synthetic */ void setExpanded$default(C45971tDa c45971tDa, boolean z, boolean z2, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z2 = true;
        }
        c45971tDa.setExpanded(z, z2, str);
    }

    public final void setExpanded(boolean z, boolean z2, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.copydefault.DbNXlk.setVisibility(4);
        if (!z2) {
            this.copydefault.KWHzl.setVisibility(z ? 0 : 8);
            if (z) {
                this.copydefault.AhwBna.setVisibility(4);
                ConstraintLayout constraintLayout = this.copydefault.KWHzl;
                ViewGroup.LayoutParams layoutParams = constraintLayout.getLayoutParams();
                layoutParams.height = -2;
                constraintLayout.setLayoutParams(layoutParams);
                constraintLayout.setAlpha(1.0f);
                tBM tbm = tBM.copydefault;
                android.widget.LinearLayout linearLayout = this.copydefault.AEQbTJ;
                Intrinsics.checkNotNullExpressionValue(linearLayout, "");
                tbm.copydefault(linearLayout, str);
                CardView cardView = this.copydefault.EZpvd;
                Intrinsics.checkNotNullExpressionValue(cardView, "");
                tbm.EZpvd((android.view.View) cardView, true, 0);
                post(new java.lang.Runnable() { // from class: o.tDf
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // java.lang.Runnable
                    public final void run() {
                        C45971tDa.gEmmrt(this.KWHzl);
                    }
                });
                return;
            }
            tBM tbm2 = tBM.copydefault;
            android.widget.LinearLayout linearLayout2 = this.copydefault.AEQbTJ;
            Intrinsics.checkNotNullExpressionValue(linearLayout2, "");
            tbm2.AEQbTJ(linearLayout2);
            CardView cardView2 = this.copydefault.EZpvd;
            Intrinsics.checkNotNullExpressionValue(cardView2, "");
            tbm2.EZpvd((android.view.View) cardView2, false, 0);
            updateTagLayoutWithUnSelect$default(this, null, 1, null);
            return;
        }
        if (z) {
            this.copydefault.AhwBna.setVisibility(4);
            ConstraintLayout constraintLayout2 = this.copydefault.KWHzl;
            constraintLayout2.setVisibility(4);
            constraintLayout2.measure(View.MeasureSpec.makeMeasureSpec(constraintLayout2.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
            ViewGroup.LayoutParams layoutParams2 = constraintLayout2.getLayoutParams();
            layoutParams2.height = 1;
            constraintLayout2.setLayoutParams(layoutParams2);
            constraintLayout2.setAlpha(0.0f);
            this.copydefault.KWHzl.post(new java.lang.Runnable() { // from class: o.tDg
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    C45971tDa.AkhnZx(this.EZpvd);
                }
            });
            tBM tbm3 = tBM.copydefault;
            android.widget.LinearLayout linearLayout3 = this.copydefault.AEQbTJ;
            Intrinsics.checkNotNullExpressionValue(linearLayout3, "");
            tbm3.copydefault(linearLayout3, str);
            CardView cardView3 = this.copydefault.EZpvd;
            Intrinsics.checkNotNullExpressionValue(cardView3, "");
            tbm3.KWHzl((android.view.View) cardView3, true);
            return;
        }
        tBM tbm4 = tBM.copydefault;
        ConstraintLayout constraintLayout3 = this.copydefault.KWHzl;
        Intrinsics.checkNotNullExpressionValue(constraintLayout3, "");
        tbm4.OLrzqt(constraintLayout3, new Function0() { // from class: o.tDh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C45971tDa.djBIcL(this.KWHzl);
            }
        });
        android.widget.LinearLayout linearLayout4 = this.copydefault.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(linearLayout4, "");
        tbm4.AEQbTJ(linearLayout4);
        CardView cardView4 = this.copydefault.EZpvd;
        Intrinsics.checkNotNullExpressionValue(cardView4, "");
        tbm4.KWHzl((android.view.View) cardView4, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AkhnZx(final C45971tDa c45971tDa) {
        c45971tDa.copydefault.KWHzl.setVisibility(0);
        tBM tbm = tBM.copydefault;
        ConstraintLayout constraintLayout = c45971tDa.copydefault.KWHzl;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
        tbm.EZpvd(constraintLayout, new Function0() { // from class: o.tDb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C45971tDa.AhwBna(this.KWHzl);
            }
        });
    }

    public static final Unit AhwBna(final C45971tDa c45971tDa) {
        c45971tDa.post(new java.lang.Runnable() { // from class: o.tDd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C45971tDa.DbNXlk(this.EZpvd);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void DbNXlk(C45971tDa c45971tDa) {
        c45971tDa.AEQbTJ();
        updateTagLayoutWithSelect$default(c45971tDa, null, 1, null);
    }

    public static final Unit djBIcL(C45971tDa c45971tDa) {
        updateTagLayoutWithUnSelect$default(c45971tDa, null, 1, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void gEmmrt(C45971tDa c45971tDa) {
        c45971tDa.AEQbTJ();
        updateTagLayoutWithSelect$default(c45971tDa, null, 1, null);
    }
}
