package o;

import com.okinc.business.market.features.analysis.futures.sub.funding.data.datasource.impl.FundingFeeDataSourceImpl$queryEstimateFundingFee$1;
import com.okinc.business.market.features.analysis.futures.sub.funding.data.datasource.impl.FundingFeeDataSourceImpl$queryFundingFee$1;
import com.okinc.business.market.features.analysis.futures.sub.funding.data.datasource.impl.FundingFeeDataSourceImpl$querySwapCoins$1;
import com.okinc.business.market.features.analysis.futures.sub.funding.data.model.FundindFeeRateInfoPo;
import com.okinc.business.market.features.analysis.futures.sub.funding.data.model.FundingFeePo;
import com.okinc.business.market.features.analysis.futures.sub.funding.data.model.SwapCoinPairPo;
import com.okinc.network.okg.response.ResponseData;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jJr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C25877jJr {
    public final InterfaceC25875jJp copydefault = (InterfaceC25875jJp) C43417ror.OLrzqt(C56524yIo.AEQbTJ(InterfaceC25875jJp.class));

    @yCM
    public C25877jJr() {
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, java.lang.String str3, java.lang.String str4, @NotNull Continuation<? super java.util.List<FundingFeePo>> continuation) throws java.lang.Throwable {
        FundingFeeDataSourceImpl$queryFundingFee$1 fundingFeeDataSourceImpl$queryFundingFee$1;
        if (continuation instanceof FundingFeeDataSourceImpl$queryFundingFee$1) {
            fundingFeeDataSourceImpl$queryFundingFee$1 = (FundingFeeDataSourceImpl$queryFundingFee$1) continuation;
            int i = fundingFeeDataSourceImpl$queryFundingFee$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                fundingFeeDataSourceImpl$queryFundingFee$1.label = i - Integer.MIN_VALUE;
            } else {
                fundingFeeDataSourceImpl$queryFundingFee$1 = new FundingFeeDataSourceImpl$queryFundingFee$1(this, continuation);
            }
        }
        FundingFeeDataSourceImpl$queryFundingFee$1 fundingFeeDataSourceImpl$queryFundingFee$12 = fundingFeeDataSourceImpl$queryFundingFee$1;
        java.lang.Object objOLrzqt = fundingFeeDataSourceImpl$queryFundingFee$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = fundingFeeDataSourceImpl$queryFundingFee$12.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objOLrzqt);
            InterfaceC25875jJp interfaceC25875jJp = this.copydefault;
            fundingFeeDataSourceImpl$queryFundingFee$12.label = 1;
            objOLrzqt = interfaceC25875jJp.OLrzqt(str, str2, str3, str4, fundingFeeDataSourceImpl$queryFundingFee$12);
            if (objOLrzqt == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objOLrzqt);
        }
        return ((ResponseData) objOLrzqt).getData();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object EZpvd(@NotNull java.lang.String str, java.lang.String str2, @NotNull Continuation<? super java.util.List<FundindFeeRateInfoPo>> continuation) throws java.lang.Throwable {
        FundingFeeDataSourceImpl$queryEstimateFundingFee$1 fundingFeeDataSourceImpl$queryEstimateFundingFee$1;
        if (continuation instanceof FundingFeeDataSourceImpl$queryEstimateFundingFee$1) {
            fundingFeeDataSourceImpl$queryEstimateFundingFee$1 = (FundingFeeDataSourceImpl$queryEstimateFundingFee$1) continuation;
            int i = fundingFeeDataSourceImpl$queryEstimateFundingFee$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                fundingFeeDataSourceImpl$queryEstimateFundingFee$1.label = i - Integer.MIN_VALUE;
            } else {
                fundingFeeDataSourceImpl$queryEstimateFundingFee$1 = new FundingFeeDataSourceImpl$queryEstimateFundingFee$1(this, continuation);
            }
        }
        java.lang.Object objKWHzl = fundingFeeDataSourceImpl$queryEstimateFundingFee$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = fundingFeeDataSourceImpl$queryEstimateFundingFee$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objKWHzl);
            InterfaceC25875jJp interfaceC25875jJp = this.copydefault;
            fundingFeeDataSourceImpl$queryEstimateFundingFee$1.label = 1;
            objKWHzl = interfaceC25875jJp.KWHzl(str, str2, fundingFeeDataSourceImpl$queryEstimateFundingFee$1);
            if (objKWHzl == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objKWHzl);
        }
        return ((ResponseData) objKWHzl).getData();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object OLrzqt(java.lang.String str, @NotNull Continuation<? super java.util.List<SwapCoinPairPo>> continuation) throws java.lang.Throwable {
        FundingFeeDataSourceImpl$querySwapCoins$1 fundingFeeDataSourceImpl$querySwapCoins$1;
        if (continuation instanceof FundingFeeDataSourceImpl$querySwapCoins$1) {
            fundingFeeDataSourceImpl$querySwapCoins$1 = (FundingFeeDataSourceImpl$querySwapCoins$1) continuation;
            int i = fundingFeeDataSourceImpl$querySwapCoins$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                fundingFeeDataSourceImpl$querySwapCoins$1.label = i - Integer.MIN_VALUE;
            } else {
                fundingFeeDataSourceImpl$querySwapCoins$1 = new FundingFeeDataSourceImpl$querySwapCoins$1(this, continuation);
            }
        }
        java.lang.Object objKWHzl = fundingFeeDataSourceImpl$querySwapCoins$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = fundingFeeDataSourceImpl$querySwapCoins$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objKWHzl);
            InterfaceC25875jJp interfaceC25875jJp = this.copydefault;
            fundingFeeDataSourceImpl$querySwapCoins$1.label = 1;
            objKWHzl = interfaceC25875jJp.KWHzl(str, fundingFeeDataSourceImpl$querySwapCoins$1);
            if (objKWHzl == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objKWHzl);
        }
        return ((ResponseData) objKWHzl).getData();
    }
}
