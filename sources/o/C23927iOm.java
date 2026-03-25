package o;

import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentResultListener;
import com.amplifyframework.core.model.ModelIdentifier;
import com.okinc.business.dex.api.bean.OKDCoinDetailConfig;
import com.okinc.business.dex.api.bean.OKDSourceType;
import com.okinc.business.invest_biz.data.bean.InvestAssetPositionType;
import com.okinc.business.invest_biz.data.bean.InvestTipInfoVo;
import com.okinc.business.invest_biz.data.bean.InvestUserAssetDetailByPosition;
import com.okinc.business.invest_biz.data.bean.InvestUserAssetDetailClaimPromptInformation;
import com.okinc.business.invest_biz.data.bean.InvestUserRewardElementInfo;
import com.okinc.business.invest_biz.data.bean.InvestUserRewardInfoByInvestment;
import com.okinc.business.invest_biz.data.bean.InvestUserRewardsAction;
import com.okinc.business.invest_biz.data.bean.RewardType;
import com.okinc.business.invest_biz.data.bean.SecurityDetailsInfo;
import com.okinc.business.invest_biz.data.contants.InvestAction;
import com.okinc.business.invest_biz.data.contants.InvestmentKind;
import com.okinc.business.invest_biz.data.models.ChainInfo;
import com.okinc.business.invest_biz.data.repository.product_details.model.ProductDetailsByChain;
import com.okinc.business.invest_biz.ui.screens.defi_dashboard.asset_details.AssetDetailsBottomSheet;
import com.okinc.business.invest_biz.ui.screens.defi_dashboard.asset_details.AssetDetailsParams;
import com.okinc.business.invest_biz.ui.screens.defi_dashboard.asset_details.AssetDetailsResult;
import com.okinc.business.invest_biz.ui.screens.defi_dashboard.asset_details.AssetDetailsResultType;
import com.okinc.business.invest_biz.ui.screens.defi_dashboard.asset_details.AssetDetailsSource;
import com.okinc.business.invest_biz.ui.screens.defi_dashboard.asset_details.AssetRawData;
import com.okinc.business.invest_biz.ui.screens.defi_dashboard.asset_details.SheetType;
import com.okinc.business.invest_biz.ui.widget.product_details.ProductDetailsClickAction;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C24102iUz;
import o.C25493ixk;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.iOm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C23927iOm implements InterfaceC27395juQ {
    public final FragmentActivity copydefault;

    /* JADX INFO: renamed from: o.iOm$ActionBar */
    public final /* synthetic */ class ActionBar {
        public static final /* synthetic */ int[] EZpvd;
        public static final /* synthetic */ int[] OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[InvestAssetPositionType.values().length];
            try {
                iArr[InvestAssetPositionType.UNI_V3_POSITION.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[InvestAssetPositionType.EXPIRY_POSITION.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            EZpvd = iArr;
            int[] iArr2 = new int[AssetDetailsResultType.values().length];
            try {
                iArr2[AssetDetailsResultType.ADD_LIQUIDITY.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            OLrzqt = iArr2;
        }
    }

    public final void copydefault(ProductDetailsClickAction.Dialog dialog) {
    }

    public C23927iOm(@NotNull FragmentActivity fragmentActivity) {
        Intrinsics.checkNotNullParameter(fragmentActivity, "");
        this.copydefault = fragmentActivity;
    }

    @Override // o.InterfaceC27395juQ
    public void KWHzl(@NotNull ProductDetailsClickAction productDetailsClickAction) throws java.io.UnsupportedEncodingException {
        Intrinsics.checkNotNullParameter(productDetailsClickAction, "");
        if (productDetailsClickAction instanceof ProductDetailsClickAction.PendingIntent) {
            copydefault(((ProductDetailsClickAction.PendingIntent) productDetailsClickAction).copydefault());
            return;
        }
        if (productDetailsClickAction instanceof ProductDetailsClickAction.ActionBar) {
            AEQbTJ(((ProductDetailsClickAction.ActionBar) productDetailsClickAction).AEQbTJ());
            return;
        }
        if (productDetailsClickAction instanceof ProductDetailsClickAction.SharedElementCallback) {
            EZpvd((ProductDetailsClickAction.SharedElementCallback) productDetailsClickAction);
            return;
        }
        if (productDetailsClickAction instanceof ProductDetailsClickAction.TaskStackBuilder) {
            copydefault(((ProductDetailsClickAction.TaskStackBuilder) productDetailsClickAction).AEQbTJ());
            return;
        }
        if (productDetailsClickAction instanceof ProductDetailsClickAction.Fragment) {
            AEQbTJ((ProductDetailsClickAction.Fragment) productDetailsClickAction);
            return;
        }
        if (productDetailsClickAction instanceof ProductDetailsClickAction.AssistContent) {
            EZpvd((ProductDetailsClickAction.AssistContent) productDetailsClickAction);
            return;
        }
        if (productDetailsClickAction instanceof ProductDetailsClickAction.ClipData) {
            ProductDetailsClickAction.ClipData clipData = (ProductDetailsClickAction.ClipData) productDetailsClickAction;
            copydefault(clipData.copydefault(), clipData.EZpvd());
            return;
        }
        if (productDetailsClickAction instanceof ProductDetailsClickAction.TaskDescription) {
            ProductDetailsClickAction.TaskDescription taskDescription = (ProductDetailsClickAction.TaskDescription) productDetailsClickAction;
            KWHzl(taskDescription.EZpvd(), C33129mqd.valueOf(java.lang.Long.valueOf(taskDescription.copydefault())), taskDescription.OLrzqt(), taskDescription.KWHzl());
            return;
        }
        if (productDetailsClickAction instanceof ProductDetailsClickAction.StateListAnimator) {
            KWHzl((ProductDetailsClickAction.StateListAnimator) productDetailsClickAction);
            return;
        }
        if (productDetailsClickAction instanceof ProductDetailsClickAction.Dialog) {
            copydefault((ProductDetailsClickAction.Dialog) productDetailsClickAction);
            return;
        }
        if (productDetailsClickAction instanceof ProductDetailsClickAction.VoiceInteractor) {
            EZpvd((ProductDetailsClickAction.VoiceInteractor) productDetailsClickAction);
            return;
        }
        if (productDetailsClickAction instanceof ProductDetailsClickAction.Application) {
            OLrzqt((ProductDetailsClickAction.Application) productDetailsClickAction);
        } else if (productDetailsClickAction instanceof ProductDetailsClickAction.PictureInPictureParams) {
            KWHzl((ProductDetailsClickAction.PictureInPictureParams) productDetailsClickAction);
        } else if (productDetailsClickAction instanceof ProductDetailsClickAction.FragmentManager) {
            AEQbTJ((ProductDetailsClickAction.FragmentManager) productDetailsClickAction);
        }
    }

    public final void copydefault(InvestTipInfoVo investTipInfoVo) throws java.io.UnsupportedEncodingException {
        C27569jxf.handleTipInfo$default(C27569jxf.OLrzqt, this.copydefault, investTipInfoVo, null, null, 12, null);
    }

    public final void AEQbTJ(java.lang.String str) {
        C27569jxf.OLrzqt.copydefault((android.content.Context) this.copydefault, str, true);
    }

    public final void copydefault(java.lang.String str, java.lang.String str2) {
        C27508jwX.AEQbTJ.copydefault(this.copydefault, str, str2, "detail");
    }

    public final void EZpvd(ProductDetailsClickAction.AssistContent assistContent) {
        C24102iUz.TaskDescription taskDescription = C24102iUz.Companion;
        SecurityDetailsInfo securityDetailsInfoKWHzl = assistContent.KWHzl();
        taskDescription.KWHzl(securityDetailsInfoKWHzl.copy((255 & 1) != 0 ? securityDetailsInfoKWHzl.alertsScore : null, (255 & 2) != 0 ? securityDetailsInfoKWHzl.highlightsScore : null, (255 & 4) != 0 ? securityDetailsInfoKWHzl.scoreExplain : null, (255 & 8) != 0 ? securityDetailsInfoKWHzl.securityScores : null, (255 & 16) != 0 ? securityDetailsInfoKWHzl.websiteLogo : null, (255 & 32) != 0 ? securityDetailsInfoKWHzl.websiteName : null, (255 & 64) != 0 ? securityDetailsInfoKWHzl.websiteUrl : null, (255 & 128) != 0 ? securityDetailsInfoKWHzl.nightWebsiteLogo : null, (255 & 256) != 0 ? securityDetailsInfoKWHzl.securityScoreColor : assistContent.OLrzqt())).show(this.copydefault.getSupportFragmentManager(), (java.lang.String) null);
    }

    public final void AEQbTJ(ProductDetailsClickAction.Fragment fragment) {
        C26768jiZ c26768jiZKWHzl = C26768jiZ.Companion.KWHzl(fragment.OLrzqt(), fragment.AEQbTJ());
        androidx.fragment.app.FragmentManager supportFragmentManager = this.copydefault.getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
        c26768jiZKWHzl.show(supportFragmentManager);
    }

    public final void KWHzl(long j, long j2, int i, int i2) {
        C27508jwX.AEQbTJ.OLrzqt(this.copydefault, j, j2, i, i2);
    }

    public final void copydefault(java.lang.String str) {
        C27508jwX.AEQbTJ.copydefault(this.copydefault, str);
    }

    public final void KWHzl(ProductDetailsClickAction.StateListAnimator stateListAnimator) {
        C27508jwX.AEQbTJ.EZpvd(this.copydefault, stateListAnimator.copydefault(), stateListAnimator.AEQbTJ(), (56 & 4) != 0 ? "" : stateListAnimator.KWHzl(), (56 & 8) != 0 ? false : false, (56 & 16) != 0 ? null : null, (56 & 32) != 0 ? null : null);
    }

    public final void EZpvd(ProductDetailsClickAction.VoiceInteractor voiceInteractor) {
        C24124iVu c24124iVuCopydefault = C24124iVu.Companion.copydefault(voiceInteractor.AEQbTJ().OLrzqt(), voiceInteractor.AEQbTJ().AYXKKw(), voiceInteractor.AEQbTJ().EZpvd(), voiceInteractor.AEQbTJ().copydefault(), voiceInteractor.AEQbTJ().KWHzl(), voiceInteractor.AEQbTJ().AEQbTJ());
        androidx.fragment.app.FragmentManager supportFragmentManager = this.copydefault.getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
        c24124iVuCopydefault.show(supportFragmentManager);
    }

    public final void OLrzqt(ProductDetailsClickAction.Application application) {
        kotlin.Pair pairOLrzqt;
        java.lang.String str;
        InvestUserAssetDetailByPosition investUserAssetDetailByPositionKWHzl = application.KWHzl();
        InvestAssetPositionType assetPositionType = application.KWHzl().getAssetPositionType();
        int i = assetPositionType == null ? -1 : ActionBar.EZpvd[assetPositionType.ordinal()];
        if (i != 1) {
            if (i == 2) {
                if (investUserAssetDetailByPositionKWHzl.isActive()) {
                    pairOLrzqt = C56390yDp.OLrzqt(java.lang.Integer.valueOf(C25493ixk.FragmentManager.hCLrkq), 7);
                } else {
                    pairOLrzqt = C56390yDp.OLrzqt(java.lang.Integer.valueOf(C25493ixk.FragmentManager.DGOPHZDGOPHZ), 11);
                }
            } else {
                pairOLrzqt = C56390yDp.OLrzqt(null, null);
            }
        } else if (investUserAssetDetailByPositionKWHzl.isActive()) {
            pairOLrzqt = C56390yDp.OLrzqt(java.lang.Integer.valueOf(C25493ixk.FragmentManager.RihMUf), 7);
        } else {
            pairOLrzqt = C56390yDp.OLrzqt(java.lang.Integer.valueOf(C25493ixk.FragmentManager.resume), 11);
        }
        java.lang.Integer num = (java.lang.Integer) pairOLrzqt.component1();
        java.lang.Integer num2 = (java.lang.Integer) pairOLrzqt.component2();
        InvestAssetPositionType assetPositionType2 = application.KWHzl().getAssetPositionType();
        InvestAssetPositionType investAssetPositionType = InvestAssetPositionType.UNI_V3_POSITION;
        if (assetPositionType2 == investAssetPositionType) {
            str = ModelIdentifier.Helper.PRIMARY_KEY_DELIMITER + investUserAssetDetailByPositionKWHzl.getTokenId();
        } else {
            str = "";
        }
        java.lang.String range = investUserAssetDetailByPositionKWHzl.getRange();
        java.lang.String totalValue = investUserAssetDetailByPositionKWHzl.getTotalValue();
        if (totalValue == null) {
            totalValue = "";
        }
        AssetDetailsBottomSheet assetDetailsBottomSheetKWHzl = AssetDetailsBottomSheet.Companion.KWHzl(new AssetDetailsParams(null, null, num, num2, str, range, application.KWHzl().getAssetPositionType() == investAssetPositionType ? application.KWHzl().getReverseRange() : "", false, totalValue, null, null, SheetType.POSITION, new AssetRawData(InvestAction.Claim, InvestUserRewardsAction.COMMON, null, null, new ProductDetailsByChain(application.AEQbTJ(), InvestmentKind.Default, application.EZpvd(), false, null, null, null, false, 248, null), investUserAssetDetailByPositionKWHzl.getTokenId(), null, application.KWHzl().getShowIncreaseLiquidity(), null, null, false, 1868, null), AssetDetailsSource.MINI_PROJECT, 1667, null));
        androidx.fragment.app.FragmentManager supportFragmentManager = this.copydefault.getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
        assetDetailsBottomSheetKWHzl.show(supportFragmentManager);
        this.copydefault.getSupportFragmentManager().setFragmentResultListener("result.asset_details", this.copydefault, new FragmentResultListener() { // from class: o.iOi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.fragment.app.FragmentResultListener
            public final void onFragmentResult(java.lang.String str2, android.os.Bundle bundle) throws java.io.UnsupportedEncodingException {
                C23927iOm.EZpvd(this.AEQbTJ, str2, bundle);
            }
        });
    }

    public static final void EZpvd(C23927iOm c23927iOm, java.lang.String str, android.os.Bundle bundle) throws java.io.UnsupportedEncodingException {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(bundle, "");
        AssetDetailsResult assetDetailsResult = (AssetDetailsResult) bundle.getParcelable("result.asset_details");
        if (assetDetailsResult != null) {
            if (ActionBar.OLrzqt[assetDetailsResult.copydefault().ordinal()] == 1) {
                c23927iOm.KWHzl((ProductDetailsClickAction) new ProductDetailsClickAction.StateListAnimator(assetDetailsResult.AEQbTJ(), assetDetailsResult.OLrzqt(), assetDetailsResult.EZpvd()));
            }
        }
    }

    public final void KWHzl(ProductDetailsClickAction.PictureInPictureParams pictureInPictureParams) {
        java.lang.String strAYXKKw;
        InvestAction investAction;
        java.lang.Object next;
        InvestUserAssetDetailClaimPromptInformation extraData;
        InvestTipInfoVo claimTipInfo;
        java.util.List<InvestUserRewardInfoByInvestment> listKWHzl = pictureInPictureParams.KWHzl();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : listKWHzl) {
            if (C25540iye.copydefault(((InvestUserRewardInfoByInvestment) obj).getRewardType())) {
                arrayList.add(obj);
            }
        }
        if (arrayList.size() <= 1 || pictureInPictureParams.OLrzqt() != RewardType.OKX_BONUS) {
            java.util.List<InvestUserRewardInfoByInvestment> listKWHzl2 = pictureInPictureParams.KWHzl();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            for (java.lang.Object obj2 : listKWHzl2) {
                if (C25540iye.copydefault(((InvestUserRewardInfoByInvestment) obj2).getRewardType())) {
                    arrayList2.add(obj2);
                }
            }
            strAYXKKw = (arrayList2.size() <= 1 || pictureInPictureParams.OLrzqt() != RewardType.MERKL_BONUS) ? C33070mpX.AYXKKw(C25493ixk.FragmentManager.QIZEnU) : C33070mpX.AYXKKw(C25493ixk.FragmentManager.iwGUEr);
        } else {
            strAYXKKw = C33070mpX.AYXKKw(C25493ixk.FragmentManager.hDKMBd);
        }
        java.lang.String str = strAYXKKw;
        java.lang.String strAEQbTJ = C27491jwG.AEQbTJ(pictureInPictureParams.KWHzl(), new Function1() { // from class: o.iOl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj3) {
                return C23927iOm.OLrzqt((InvestUserRewardInfoByInvestment) obj3);
            }
        });
        SheetType sheetType = SheetType.BONUS;
        if (pictureInPictureParams.OLrzqt() == RewardType.OKX_BONUS) {
            investAction = InvestAction.Bonus;
        } else {
            investAction = InvestAction.MerklBonus;
        }
        InvestAction investAction2 = investAction;
        java.util.Iterator<T> it = pictureInPictureParams.KWHzl().iterator();
        while (true) {
            if (it.hasNext()) {
                next = it.next();
                if (C33129mqd.OLrzqt((java.lang.CharSequence) ((InvestUserRewardInfoByInvestment) next).getCallDataExtJson())) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        InvestUserRewardInfoByInvestment investUserRewardInfoByInvestment = (InvestUserRewardInfoByInvestment) next;
        java.lang.String callDataExtJson = investUserRewardInfoByInvestment != null ? investUserRewardInfoByInvestment.getCallDataExtJson() : null;
        AssetRawData assetRawData = new AssetRawData(investAction2, null, callDataExtJson == null ? "" : callDataExtJson, null, new ProductDetailsByChain(pictureInPictureParams.EZpvd(), InvestmentKind.Default, new ChainInfo(pictureInPictureParams.AEQbTJ(), pictureInPictureParams.copydefault(), null, null, null, 28, null), false, null, null, null, false, 248, null), null, pictureInPictureParams.OLrzqt(), false, null, null, false, 1962, null);
        AssetDetailsSource assetDetailsSource = AssetDetailsSource.MINI_PROJECT;
        InvestUserRewardInfoByInvestment investUserRewardInfoByInvestment2 = (InvestUserRewardInfoByInvestment) CollectionsKt___CollectionsKt.firstOrNull(pictureInPictureParams.KWHzl());
        AssetDetailsBottomSheet assetDetailsBottomSheetKWHzl = AssetDetailsBottomSheet.Companion.KWHzl(new AssetDetailsParams(str, null, null, null, null, null, null, false, strAEQbTJ, null, (investUserRewardInfoByInvestment2 == null || (extraData = investUserRewardInfoByInvestment2.getExtraData()) == null || (claimTipInfo = extraData.getClaimTipInfo()) == null) ? null : claimTipInfo.getTipContent(), sheetType, assetRawData, assetDetailsSource, 766, null));
        androidx.fragment.app.FragmentManager supportFragmentManager = this.copydefault.getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
        assetDetailsBottomSheetKWHzl.show(supportFragmentManager);
    }

    public static final java.lang.String EZpvd(InvestUserRewardElementInfo investUserRewardElementInfo) {
        Intrinsics.checkNotNullParameter(investUserRewardElementInfo, "");
        java.lang.String currencyAmount = investUserRewardElementInfo.getCurrencyAmount();
        return currencyAmount == null ? "0.0" : currencyAmount;
    }

    public static final java.lang.String OLrzqt(InvestUserRewardInfoByInvestment investUserRewardInfoByInvestment) {
        java.lang.String strAEQbTJ;
        Intrinsics.checkNotNullParameter(investUserRewardInfoByInvestment, "");
        java.util.List<InvestUserRewardElementInfo> baseDefiTokenInfos = investUserRewardInfoByInvestment.getBaseDefiTokenInfos();
        return (baseDefiTokenInfos == null || (strAEQbTJ = C27491jwG.AEQbTJ(baseDefiTokenInfos, new Function1() { // from class: o.iOk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C23927iOm.EZpvd((InvestUserRewardElementInfo) obj);
            }
        })) == null) ? "0.0" : strAEQbTJ;
    }

    public final void AEQbTJ(ProductDetailsClickAction.FragmentManager fragmentManager) throws java.io.UnsupportedEncodingException {
        C27508jwX.openUrl$default(C27508jwX.AEQbTJ, this.copydefault, fragmentManager.OLrzqt(), false, 2, null);
    }

    public final void EZpvd(ProductDetailsClickAction.SharedElementCallback sharedElementCallback) {
        InterfaceC23916iOb interfaceC23916iOb = (InterfaceC23916iOb) C43251rlk.copydefault(InterfaceC23916iOb.class);
        FragmentActivity fragmentActivity = this.copydefault;
        OKDSourceType oKDSourceType = OKDSourceType.YIELD_SOURCE;
        long jEZpvd = sharedElementCallback.EZpvd();
        interfaceC23916iOb.OLrzqt(fragmentActivity, new OKDCoinDetailConfig(oKDSourceType, java.lang.String.valueOf(jEZpvd), sharedElementCallback.AEQbTJ(), sharedElementCallback.djBIcL(), sharedElementCallback.KWHzl(), sharedElementCallback.OLrzqt(), sharedElementCallback.copydefault(), null, 128, null));
    }
}
