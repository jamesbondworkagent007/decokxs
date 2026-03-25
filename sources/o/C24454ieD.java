package o;

import android.view.View;
import androidx.activity.result.ActivityResultLauncher;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.okinc.business.dex.trade.core.domain.model.V6QuoteAndCalldataRequest;
import com.okinc.business.dex.trade.core.domain.model.V6QuoteRequest;
import com.okinc.business.dex.trade.core.domain.model.common.AccountInfo;
import com.okinc.business.dex.trade.core.domain.model.common.LiquidityConfig;
import com.okinc.business.dex.trade.core.domain.model.common.NetworkFee;
import com.okinc.business.dex.trade.core.domain.model.common.PreSetConfig;
import com.okinc.business.dex.trade.core.domain.model.common.QuoteExt;
import com.okinc.business.dex.trade.core.domain.model.common.SlippageConfig;
import com.okinc.business.dex.trade.swap.market.priorityfee.domain.model.MarketTransactionFeeCacheParams;
import com.okinc.business.dexlogic.bean.DeFiPlatformForSwap;
import com.okinc.business.dexlogic.bean.PriorityFeeType;
import com.okinc.business.dexlogic.bean.QuotePriceReq;
import com.okinc.business.dexlogic.bean.QuotePriceRes;
import com.okinc.business.dexlogic.bean.TradeMode;
import com.okinc.business.dexlogic.bean.track.ButtonType;
import com.okinc.business.dexlogic.track.enums.DexSwapFullClick;
import com.okinc.business.dexui.main.swap.trade.single.defiplatform.DeFiPlatformSelectionSource;
import com.okinc.business.dexui.main.swap.trade.single.defiplatform.data.V6QuoteRequestWrapper;
import com.okinc.business.dexui.main.swap.widget.slippage.SlippageMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC22408hem;
import o.ActivityC25022ioq;
import o.C23274hvD;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ieD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C24454ieD extends AbstractC24459ieI {
    public C21636hGs EZpvd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C24454ieD(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        KWHzl();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C24454ieD(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C24454ieD(@NotNull android.content.Context context) {
        this(context, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    public final void KWHzl() {
        C55258xgZ c55258xgZ;
        C21636hGs c21636hGsEZpvd = C21636hGs.EZpvd(android.view.LayoutInflater.from(getContext()), DbNXlk(), true);
        this.EZpvd = c21636hGsEZpvd;
        if (c21636hGsEZpvd == null || (c55258xgZ = c21636hGsEZpvd.gEmmrt) == null) {
            return;
        }
        c55258xgZ.setHelperLabelType(2);
    }

    @Override // o.AbstractC24459ieI
    public android.view.View AEQbTJ() {
        C21636hGs c21636hGs = this.EZpvd;
        if (c21636hGs != null) {
            return c21636hGs.valueOf;
        }
        return null;
    }

    public final void setupDeFiPlatformSettingsView(@NotNull java.lang.String str, @NotNull java.lang.String str2, QuotePriceReq quotePriceReq, @NotNull QuotePriceRes quotePriceRes, @NotNull AbstractC23101hrq abstractC23101hrq, boolean z, Function1<? super AbstractC22408hem, Unit> function1) {
        java.lang.Object next;
        android.graphics.drawable.Drawable drawable;
        android.graphics.drawable.Drawable drawable2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(quotePriceRes, "");
        Intrinsics.checkNotNullParameter(abstractC23101hrq, "");
        C21636hGs c21636hGs = this.EZpvd;
        if (c21636hGs != null) {
            java.util.Iterator<T> it = quotePriceRes.getDefiPlatformInfoList().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                } else {
                    next = it.next();
                    if (Intrinsics.EZpvd((java.lang.Object) ((DeFiPlatformForSwap) next).getDefiPlatformId(), (java.lang.Object) str2)) {
                        break;
                    }
                }
            }
            DeFiPlatformForSwap deFiPlatformForSwap = (DeFiPlatformForSwap) next;
            c21636hGs.EZpvd.setText(deFiPlatformForSwap != null ? deFiPlatformForSwap.getName() : null);
            android.widget.ImageView imageView = c21636hGs.OLrzqt;
            Intrinsics.checkNotNullExpressionValue(imageView, "");
            java.lang.String logo = deFiPlatformForSwap != null ? deFiPlatformForSwap.getLogo() : null;
            java.lang.String str3 = logo != null ? logo : "";
            android.graphics.drawable.Drawable drawableKWHzl = C33070mpX.KWHzl(C52761wXj.TaskDescription.gasjUx);
            if (drawableKWHzl != null) {
                drawableKWHzl.setTint(C25382ivf.KWHzl(C23274hvD.StateListAnimator.copydefault));
                Unit unit = Unit.INSTANCE;
                drawable = drawableKWHzl;
            } else {
                drawable = null;
            }
            android.graphics.drawable.Drawable drawableKWHzl2 = C33070mpX.KWHzl(C52761wXj.TaskDescription.gasjUx);
            if (drawableKWHzl2 != null) {
                drawableKWHzl2.setTint(C25382ivf.KWHzl(C23274hvD.StateListAnimator.copydefault));
                Unit unit2 = Unit.INSTANCE;
                drawable2 = drawableKWHzl2;
            } else {
                drawable2 = null;
            }
            C25386ivj.KWHzl(imageView, str3, new C25385ivi(drawable, drawable2, 0.0f, 0, 12, null));
            ConstraintLayout constraintLayout = c21636hGs.valueOf;
            constraintLayout.setOnClickListener(new StateListAnimator(constraintLayout, 1000L, function1, str, quotePriceRes, abstractC23101hrq, this, deFiPlatformForSwap, quotePriceReq, z));
        }
    }

    public final V6QuoteRequestWrapper AEQbTJ(QuotePriceReq quotePriceReq, java.lang.String str, java.lang.String str2, AbstractC23101hrq abstractC23101hrq) {
        QuoteExt quoteExt;
        NetworkFee networkFee;
        QuoteExt quoteExt2;
        java.lang.String strOLrzqt = C24695iig.OLrzqt(str);
        MarketTransactionFeeCacheParams marketTransactionFeeCacheParamsAwvSrB = abstractC23101hrq.AwvSrB();
        if (abstractC23101hrq.spnCvw()) {
            java.lang.String chainId = quotePriceReq != null ? quotePriceReq.getChainId() : null;
            java.lang.String str3 = chainId == null ? "" : chainId;
            java.lang.String fromTokenAddress = quotePriceReq != null ? quotePriceReq.getFromTokenAddress() : null;
            java.lang.String str4 = fromTokenAddress == null ? "" : fromTokenAddress;
            java.lang.String toTokenAddress = quotePriceReq != null ? quotePriceReq.getToTokenAddress() : null;
            java.lang.String str5 = toTokenAddress == null ? "" : toTokenAddress;
            java.lang.String amount = quotePriceReq != null ? quotePriceReq.getAmount() : null;
            java.lang.String str6 = amount == null ? "" : amount;
            java.lang.String userWalletAddress = quotePriceReq != null ? quotePriceReq.getUserWalletAddress() : null;
            java.lang.String str7 = userWalletAddress == null ? "" : userWalletAddress;
            SlippageConfig slippageConfig = new SlippageConfig(quotePriceReq != null ? quotePriceReq.getMaxSlippage() : null, Intrinsics.EZpvd((java.lang.Object) (quotePriceReq != null ? quotePriceReq.getSlippageType() : null), (java.lang.Object) C33129mqd.gEmmrt(java.lang.Integer.valueOf(SlippageMode.Fixed.getType()))) ? quotePriceReq.getSlippage() : null, C33129mqd.gEmmrt(java.lang.Integer.valueOf(SlippageMode.Companion.EZpvd(C33129mqd.AhwBna(quotePriceReq != null ? quotePriceReq.getSlippageType() : null)).getType())));
            LiquidityConfig liquidityConfig = new LiquidityConfig(strOLrzqt, (java.lang.String) null, str2, 2, (DefaultConstructorMarker) null);
            if (C33129mqd.OLrzqt((java.lang.CharSequence) (quotePriceReq != null ? quotePriceReq.getRefCode() : null))) {
                quoteExt2 = new QuoteExt(quotePriceReq != null ? quotePriceReq.getRefCode() : null, quotePriceReq != null ? quotePriceReq.getReferralCommissionJsVersion() : null, (java.lang.Boolean) null, (java.lang.String) null, 12, (DefaultConstructorMarker) null);
            } else {
                quoteExt2 = null;
            }
            return new V6QuoteRequestWrapper(new V6QuoteRequest(str7, C33129mqd.gEmmrt(java.lang.Integer.valueOf(TradeMode.SwapMode.getType())), slippageConfig, liquidityConfig, quoteExt2, str3, str4, str5, str6, (AccountInfo) null, 512, (DefaultConstructorMarker) null), (V6QuoteAndCalldataRequest) null, 2, (DefaultConstructorMarker) null);
        }
        java.lang.String chainId2 = quotePriceReq != null ? quotePriceReq.getChainId() : null;
        java.lang.String str8 = chainId2 == null ? "" : chainId2;
        java.lang.String fromTokenAddress2 = quotePriceReq != null ? quotePriceReq.getFromTokenAddress() : null;
        java.lang.String str9 = fromTokenAddress2 == null ? "" : fromTokenAddress2;
        java.lang.String toTokenAddress2 = quotePriceReq != null ? quotePriceReq.getToTokenAddress() : null;
        java.lang.String str10 = toTokenAddress2 == null ? "" : toTokenAddress2;
        java.lang.String amount2 = quotePriceReq != null ? quotePriceReq.getAmount() : null;
        java.lang.String str11 = amount2 == null ? "" : amount2;
        java.lang.String userWalletAddress2 = quotePriceReq != null ? quotePriceReq.getUserWalletAddress() : null;
        java.lang.String str12 = userWalletAddress2 == null ? "" : userWalletAddress2;
        SlippageConfig slippageConfig2 = new SlippageConfig(quotePriceReq != null ? quotePriceReq.getMaxSlippage() : null, Intrinsics.EZpvd((java.lang.Object) (quotePriceReq != null ? quotePriceReq.getSlippageType() : null), (java.lang.Object) C33129mqd.gEmmrt(java.lang.Integer.valueOf(SlippageMode.Fixed.getType()))) ? quotePriceReq.getSlippage() : null, C33129mqd.gEmmrt(java.lang.Integer.valueOf(SlippageMode.Companion.EZpvd(C33129mqd.AhwBna(quotePriceReq != null ? quotePriceReq.getSlippageType() : null)).getType())));
        LiquidityConfig liquidityConfig2 = new LiquidityConfig(strOLrzqt, (java.lang.String) null, str2, 2, (DefaultConstructorMarker) null);
        PreSetConfig preSetConfig = new PreSetConfig(abstractC23101hrq.OqFWZa().getValue());
        if (C33129mqd.OLrzqt((java.lang.CharSequence) (quotePriceReq != null ? quotePriceReq.getRefCode() : null))) {
            quoteExt = new QuoteExt(quotePriceReq != null ? quotePriceReq.getRefCode() : null, quotePriceReq != null ? quotePriceReq.getReferralCommissionJsVersion() : null, (java.lang.Boolean) null, (java.lang.String) null, 12, (DefaultConstructorMarker) null);
        } else {
            quoteExt = null;
        }
        java.lang.String strGEmmrt = C33129mqd.gEmmrt(java.lang.Integer.valueOf(TradeMode.SwapMode.getType()));
        java.lang.String strKWHzl = AbstractC22421hez.Companion.KWHzl();
        AccountInfo accountInfo = quotePriceReq != null ? quotePriceReq.getAccountInfo() : null;
        if ((marketTransactionFeeCacheParamsAwvSrB != null ? marketTransactionFeeCacheParamsAwvSrB.AEQbTJ() : null) == null) {
            networkFee = null;
        } else {
            networkFee = new NetworkFee(marketTransactionFeeCacheParamsAwvSrB.AEQbTJ() == PriorityFeeType.PriorityCustom ? marketTransactionFeeCacheParamsAwvSrB.EZpvd() : null, C33129mqd.gEmmrt(java.lang.Integer.valueOf(marketTransactionFeeCacheParamsAwvSrB.AEQbTJ().getValue())));
        }
        return new V6QuoteRequestWrapper((V6QuoteRequest) null, new V6QuoteAndCalldataRequest(java.lang.Boolean.FALSE, slippageConfig2, liquidityConfig2, preSetConfig, quoteExt, strGEmmrt, strKWHzl, networkFee, str8, str9, str10, str11, str12, null, accountInfo), 1, (DefaultConstructorMarker) null);
    }

    /* JADX INFO: renamed from: o.ieD$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ QuotePriceReq AEQbTJ;
        public final /* synthetic */ android.view.View AYXKKw;
        public final /* synthetic */ C24454ieD AhwBna;
        public final /* synthetic */ QuotePriceRes EZpvd;
        public final /* synthetic */ DeFiPlatformForSwap KWHzl;
        public final /* synthetic */ Function1 OLrzqt;
        public final /* synthetic */ boolean copydefault;
        public final /* synthetic */ java.lang.String djBIcL;
        public final /* synthetic */ long gEmmrt;
        public final /* synthetic */ AbstractC23101hrq valueOf;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, Function1 function1, java.lang.String str, QuotePriceRes quotePriceRes, AbstractC23101hrq abstractC23101hrq, C24454ieD c24454ieD, DeFiPlatformForSwap deFiPlatformForSwap, QuotePriceReq quotePriceReq, boolean z) {
            this.AYXKKw = view;
            this.gEmmrt = j;
            this.OLrzqt = function1;
            this.djBIcL = str;
            this.EZpvd = quotePriceRes;
            this.valueOf = abstractC23101hrq;
            this.AhwBna = c24454ieD;
            this.KWHzl = deFiPlatformForSwap;
            this.AEQbTJ = quotePriceReq;
            this.copydefault = z;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AYXKKw) > this.gEmmrt || (this.AYXKKw instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AYXKKw, jCurrentTimeMillis);
                Function1 function1 = this.OLrzqt;
                if (function1 != null) {
                    function1.invoke(new AbstractC22408hem.TaskDescription("provider_select_enter", ButtonType.OTHERS.getType()));
                }
                InterfaceC22693hkF interfaceC22693hkFDbNXlk = C22380heK.OLrzqt.copydefault(this.djBIcL).DbNXlk();
                Intrinsics.copydefault(interfaceC22693hkFDbNXlk, "");
                ((C22692hkE) interfaceC22693hkFDbNXlk).copydefault(this.EZpvd.fromToken(), this.EZpvd.toToken(), this.EZpvd.getCommonDexInfo().getFromTokenAmount(), this.valueOf.zLjUOn());
                C22877hne.trackDexSwapFullClick$default(C22877hne.OLrzqt, this.djBIcL, DexSwapFullClick.PROVIDERLIST.getValue(), false, this.valueOf.QCjLjM(), 4, null);
                ActivityC25022ioq.StateListAnimator stateListAnimator = ActivityC25022ioq.Companion;
                android.content.Context context = this.AhwBna.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                java.lang.String str = this.djBIcL;
                DeFiPlatformForSwap deFiPlatformForSwap = this.KWHzl;
                java.lang.String defiPlatformId = deFiPlatformForSwap != null ? deFiPlatformForSwap.getDefiPlatformId() : null;
                java.lang.String str2 = defiPlatformId == null ? "" : defiPlatformId;
                DeFiPlatformForSwap deFiPlatformForSwap2 = this.KWHzl;
                java.lang.String name = deFiPlatformForSwap2 != null ? deFiPlatformForSwap2.getName() : null;
                java.lang.String str3 = name == null ? "" : name;
                C24454ieD c24454ieD = this.AhwBna;
                QuotePriceReq quotePriceReq = this.AEQbTJ;
                java.lang.String str4 = this.djBIcL;
                DeFiPlatformForSwap deFiPlatformForSwap3 = this.KWHzl;
                java.lang.String defiPlatformId2 = deFiPlatformForSwap3 != null ? deFiPlatformForSwap3.getDefiPlatformId() : null;
                android.content.Intent intentAEQbTJ = stateListAnimator.AEQbTJ(context, str, str2, str3, c24454ieD.AEQbTJ(quotePriceReq, str4, defiPlatformId2 != null ? defiPlatformId2 : "", this.valueOf), gYM.EZpvd.EZpvd(), DeFiPlatformSelectionSource.SWAP_MODE, this.copydefault);
                ActivityResultLauncher<android.content.Intent> activityResultLauncherAYXKKw = this.valueOf.AYXKKw();
                if (activityResultLauncherAYXKKw != null) {
                    activityResultLauncherAYXKKw.launch(intentAEQbTJ);
                }
            }
        }
    }
}
