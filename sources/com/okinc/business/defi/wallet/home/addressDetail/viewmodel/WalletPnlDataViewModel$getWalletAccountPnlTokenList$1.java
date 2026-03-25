package com.okinc.business.defi.wallet.home.addressDetail.viewmodel;

import com.okinc.business.defi.biz.net.bean.WalletPnlTokenBean;
import com.okinc.business.defi.biz.net.bean.WalletPnlTokenListResponse;
import com.okinc.network.okg.response.OKServerException;
import java.util.ArrayList;
import java.util.List;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import o.AbstractC43419rot;
import o.C14738drC;
import o.C15835eXa;
import o.C56391yDq;
import o.C56403yEb;
import o.C56442yFn;
import o.C56443yFo;
import o.yDY;

/* JADX INFO: loaded from: classes5.dex */
public final class WalletPnlDataViewModel$getWalletAccountPnlTokenList$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $accountId;
    final /* synthetic */ long $chainIndex;
    final /* synthetic */ boolean $isAsc;
    final /* synthetic */ int $limit;
    final /* synthetic */ int $offset;
    final /* synthetic */ int $sortType;
    Object L$0;
    int label;
    final /* synthetic */ WalletPnlDataViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalletPnlDataViewModel$getWalletAccountPnlTokenList$1(WalletPnlDataViewModel walletPnlDataViewModel, String str, long j, int i, boolean z, int i2, int i3, Continuation<? super WalletPnlDataViewModel$getWalletAccountPnlTokenList$1> continuation) {
        super(2, continuation);
        this.this$0 = walletPnlDataViewModel;
        this.$accountId = str;
        this.$chainIndex = j;
        this.$sortType = i;
        this.$isAsc = z;
        this.$offset = i2;
        this.$limit = i3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new WalletPnlDataViewModel$getWalletAccountPnlTokenList$1(this.this$0, this.$accountId, this.$chainIndex, this.$sortType, this.$isAsc, this.$offset, this.$limit, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((WalletPnlDataViewModel$getWalletAccountPnlTokenList$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:75:0x013f  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objEZpvd;
        AbstractC43419rot abstractC43419rot;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C15835eXa c15835eXa = this.this$0.gEmmrt;
            String str = this.$accountId;
            long j = this.$chainIndex;
            Long lKWHzl = j == Long.MIN_VALUE ? null : C56443yFo.KWHzl(j);
            int i2 = this.$sortType;
            boolean z = this.$isAsc;
            int i3 = this.$offset;
            int i4 = this.$limit;
            this.label = 1;
            objEZpvd = c15835eXa.EZpvd(str, lKWHzl, i2, z, i3, i4, this);
            if (objEZpvd == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                    return Unit.INSTANCE;
                }
                abstractC43419rot = (AbstractC43419rot) this.L$0;
                C56391yDq.AEQbTJ(obj);
                WalletPnlDataViewModel walletPnlDataViewModel = this.this$0;
                if (abstractC43419rot instanceof AbstractC43419rot.ActionBar) {
                    OKServerException oKServerException = (OKServerException) ((AbstractC43419rot.ActionBar) abstractC43419rot).KWHzl();
                    MutableSharedFlow mutableSharedFlow = walletPnlDataViewModel.copydefault;
                    Result.Application application = Result.Companion;
                    Result resultM7376boximpl = Result.m7376boximpl(Result.m7377constructorimpl(C56391yDq.EZpvd(oKServerException)));
                    this.L$0 = abstractC43419rot;
                    this.label = 3;
                    if (mutableSharedFlow.emit(resultM7376boximpl, this) == objCopydefault) {
                        return objCopydefault;
                    }
                }
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
            objEZpvd = obj;
        }
        abstractC43419rot = (AbstractC43419rot) objEZpvd;
        WalletPnlDataViewModel walletPnlDataViewModel2 = this.this$0;
        if (abstractC43419rot instanceof AbstractC43419rot.StateListAnimator) {
            WalletPnlTokenListResponse walletPnlTokenListResponse = (WalletPnlTokenListResponse) ((AbstractC43419rot.StateListAnimator) abstractC43419rot).KWHzl();
            MutableSharedFlow mutableSharedFlow2 = walletPnlDataViewModel2.copydefault;
            Result.Application application2 = Result.Companion;
            List<WalletPnlTokenBean> tokenList = walletPnlTokenListResponse.getTokenList();
            if (tokenList == null) {
                tokenList = yDY.AhwBna();
            }
            ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(tokenList, 10));
            for (WalletPnlTokenBean walletPnlTokenBean : tokenList) {
                String tokenLogoUrl = walletPnlTokenBean.getTokenLogoUrl();
                String str2 = tokenLogoUrl == null ? "" : tokenLogoUrl;
                String chainLogo = walletPnlTokenBean.getChainLogo();
                String str3 = chainLogo == null ? "" : chainLogo;
                String chainId = walletPnlTokenBean.getChainId();
                String str4 = chainId == null ? "" : chainId;
                String tokenContractAddress = walletPnlTokenBean.getTokenContractAddress();
                String str5 = tokenContractAddress == null ? "" : tokenContractAddress;
                String tokenSymbol = walletPnlTokenBean.getTokenSymbol();
                String str6 = tokenSymbol == null ? "" : tokenSymbol;
                String totalPnl = walletPnlTokenBean.getTotalPnl();
                String str7 = totalPnl == null ? "--" : totalPnl;
                String totalPnlPercentage = walletPnlTokenBean.getTotalPnlPercentage();
                String str8 = totalPnlPercentage == null ? "--" : totalPnlPercentage;
                String latestTime = walletPnlTokenBean.getLatestTime();
                if (latestTime == null) {
                    latestTime = "0";
                }
                String str9 = latestTime;
                Long rowId = walletPnlTokenBean.getRowId();
                long jLongValue = rowId != null ? rowId.longValue() : 0L;
                Integer riskLevel = walletPnlTokenBean.getRiskLevel();
                arrayList.add(new C14738drC(str2, str3, str4, str5, str6, null, str7, str8, str9, jLongValue, riskLevel != null && riskLevel.intValue() == 4, 32, null));
            }
            Result resultM7376boximpl2 = Result.m7376boximpl(Result.m7377constructorimpl(arrayList));
            this.L$0 = abstractC43419rot;
            this.label = 2;
            if (mutableSharedFlow2.emit(resultM7376boximpl2, this) == objCopydefault) {
                return objCopydefault;
            }
        }
        WalletPnlDataViewModel walletPnlDataViewModel3 = this.this$0;
        if (abstractC43419rot instanceof AbstractC43419rot.ActionBar) {
        }
        return Unit.INSTANCE;
    }
}
