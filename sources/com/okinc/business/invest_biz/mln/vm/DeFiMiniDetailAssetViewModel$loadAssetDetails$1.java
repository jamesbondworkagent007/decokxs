package com.okinc.business.invest_biz.mln.vm;

import com.okinc.business.invest_biz.data.bean.RewardType;
import com.okinc.business.invest_biz.data.models.ChainInfo;
import com.okinc.business.invest_biz.data.repository.defi_dashboard.model.InvestmentAssetDetails;
import com.okinc.business.invest_biz.data.repository.product_details.model.ProductDetailsByChain;
import com.okinc.business.invest_biz.ui.screens.defi_dashboard.asset_details.AssetBottomSheetData;
import com.okinc.business.invest_biz.ui.screens.defi_dashboard.asset_details.AssetDetailsParams;
import com.okinc.business.invest_biz.ui.screens.defi_dashboard.asset_details.AssetRawData;
import com.okinc.business.invest_biz.ui.screens.defi_dashboard.asset_details.SheetType;
import java.util.List;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C23650iEf;
import o.C23928iOn;
import o.C27296jsX;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.iYN;
import o.iYR;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: loaded from: classes6.dex */
public final class DeFiMiniDetailAssetViewModel$loadAssetDetails$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ AssetDetailsParams $params;
    int label;
    final /* synthetic */ DeFiMiniDetailAssetViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeFiMiniDetailAssetViewModel$loadAssetDetails$1(AssetDetailsParams assetDetailsParams, DeFiMiniDetailAssetViewModel deFiMiniDetailAssetViewModel, Continuation<? super DeFiMiniDetailAssetViewModel$loadAssetDetails$1> continuation) {
        super(2, continuation);
        this.$params = assetDetailsParams;
        this.this$0 = deFiMiniDetailAssetViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DeFiMiniDetailAssetViewModel$loadAssetDetails$1(this.$params, this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((DeFiMiniDetailAssetViewModel$loadAssetDetails$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0149  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM8616getStoredPositionDatahUnOzRk$default;
        ProductDetailsByChain productDetailsByChainAEQbTJ;
        Object objEZpvd;
        ProductDetailsByChain productDetailsByChainAEQbTJ2;
        AssetBottomSheetData.BonusBottomSheetData bonusBottomSheetData;
        List<C27296jsX> listAEQbTJ;
        AssetBottomSheetData.PositionBottomSheetData positionBottomSheetData;
        ProductDetailsByChain productDetailsByChainAEQbTJ3;
        ChainInfo chainInfoAEQbTJ;
        Long lEZpvd;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        lKWHzl = null;
        lKWHzl = null;
        Long lKWHzl = null;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            if (this.$params.KWHzl() == SheetType.BONUS) {
                AssetRawData assetRawDataCopydefault = this.$params.copydefault();
                if (((assetRawDataCopydefault == null || (productDetailsByChainAEQbTJ2 = assetRawDataCopydefault.AEQbTJ()) == null) ? null : C56443yFo.KWHzl(productDetailsByChainAEQbTJ2.OLrzqt())) == null) {
                    this.this$0.OLrzqt().setValue(new iYR.TaskDescription("Missing params"));
                    return Unit.INSTANCE;
                }
                C23928iOn c23928iOn = this.this$0.AEQbTJ;
                long jOLrzqt = this.$params.copydefault().AEQbTJ().OLrzqt();
                RewardType rewardTypeAhwBna = this.$params.copydefault().AhwBna();
                this.label = 1;
                objEZpvd = c23928iOn.EZpvd(jOLrzqt, rewardTypeAhwBna, this);
                if (objEZpvd == objCopydefault) {
                    return objCopydefault;
                }
                bonusBottomSheetData = (AssetBottomSheetData.BonusBottomSheetData) (Result.m7383isFailureimpl(objEZpvd) ? null : objEZpvd);
                if (bonusBottomSheetData != null) {
                }
            } else {
                AssetRawData assetRawDataCopydefault2 = this.$params.copydefault();
                if (((assetRawDataCopydefault2 == null || (productDetailsByChainAEQbTJ = assetRawDataCopydefault2.AEQbTJ()) == null) ? null : C56443yFo.KWHzl(productDetailsByChainAEQbTJ.OLrzqt())) == null || this.$params.copydefault().djBIcL() == null) {
                    this.this$0.OLrzqt().setValue(new iYR.TaskDescription("Missing params"));
                    return Unit.INSTANCE;
                }
                C23928iOn c23928iOn2 = this.this$0.AEQbTJ;
                long jOLrzqt2 = this.$params.copydefault().AEQbTJ().OLrzqt();
                String strDjBIcL = this.$params.copydefault().djBIcL();
                String strEZpvd = this.$params.copydefault().AEQbTJ().EZpvd();
                this.label = 2;
                objM8616getStoredPositionDatahUnOzRk$default = iYN.m8616getStoredPositionDatahUnOzRk$default(c23928iOn2, jOLrzqt2, strDjBIcL, strEZpvd, 0L, 0L, this, 24, null);
                if (objM8616getStoredPositionDatahUnOzRk$default == objCopydefault) {
                    return objCopydefault;
                }
                if (Result.m7383isFailureimpl(objM8616getStoredPositionDatahUnOzRk$default)) {
                }
                positionBottomSheetData = (AssetBottomSheetData.PositionBottomSheetData) objM8616getStoredPositionDatahUnOzRk$default;
                if (positionBottomSheetData != null) {
                }
            }
        } else if (i == 1) {
            C56391yDq.AEQbTJ(obj);
            objEZpvd = ((Result) obj).m7386unboximpl();
            bonusBottomSheetData = (AssetBottomSheetData.BonusBottomSheetData) (Result.m7383isFailureimpl(objEZpvd) ? null : objEZpvd);
            if (bonusBottomSheetData != null) {
                this.this$0.OLrzqt().setValue(new iYR.TaskDescription("No data found"));
                return Unit.INSTANCE;
            }
            listAEQbTJ = this.this$0.copydefault.AEQbTJ(this.$params, bonusBottomSheetData);
        } else {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            objM8616getStoredPositionDatahUnOzRk$default = ((Result) obj).m7386unboximpl();
            if (Result.m7383isFailureimpl(objM8616getStoredPositionDatahUnOzRk$default)) {
                objM8616getStoredPositionDatahUnOzRk$default = null;
            }
            positionBottomSheetData = (AssetBottomSheetData.PositionBottomSheetData) objM8616getStoredPositionDatahUnOzRk$default;
            if (positionBottomSheetData != null) {
                this.this$0.OLrzqt().setValue(new iYR.TaskDescription("No data found"));
                return Unit.INSTANCE;
            }
            C23650iEf c23650iEf = this.this$0.OLrzqt;
            InvestmentAssetDetails investmentAssetDetails = new InvestmentAssetDetails(positionBottomSheetData.copydefault(), null, positionBottomSheetData.KWHzl(), null, positionBottomSheetData.AEQbTJ(), null, this.$params.copydefault(), null, CipherSuite.TLS_DHE_PSK_WITH_AES_128_GCM_SHA256, null);
            AssetRawData assetRawDataCopydefault3 = this.$params.copydefault();
            if (assetRawDataCopydefault3 == null || (lEZpvd = assetRawDataCopydefault3.EZpvd()) == null) {
                AssetRawData assetRawDataCopydefault4 = this.$params.copydefault();
                if (assetRawDataCopydefault4 != null && (productDetailsByChainAEQbTJ3 = assetRawDataCopydefault4.AEQbTJ()) != null && (chainInfoAEQbTJ = productDetailsByChainAEQbTJ3.AEQbTJ()) != null) {
                    lKWHzl = C56443yFo.KWHzl(chainInfoAEQbTJ.OLrzqt());
                }
            } else {
                lKWHzl = lEZpvd;
            }
            listAEQbTJ = c23650iEf.EZpvd(investmentAssetDetails, lKWHzl);
        }
        this.this$0.OLrzqt().setValue(new iYR.Application(this.$params.isConnected(), this.$params.valueOf(), this.$params.OLrzqt(), this.$params.djBIcL(), this.$params.AYXKKw(), this.$params.DbNXlk(), this.$params.gEmmrt(), this.$params.AEQbTJ(), this.$params.values(), this.$params.AkhnZx(), listAEQbTJ, 0L, 0L, 6144, null));
        return Unit.INSTANCE;
    }
}
