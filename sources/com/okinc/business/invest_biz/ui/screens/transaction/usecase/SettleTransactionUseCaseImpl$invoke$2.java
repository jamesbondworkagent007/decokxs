package com.okinc.business.invest_biz.ui.screens.transaction.usecase;

import com.google.api.client.googleapis.media.MediaHttpDownloader;
import com.okinc.business.invest_biz.data.bean.InvestCallDataResult;
import com.okinc.business.invest_biz.data.bean.InvestTxModel;
import com.okinc.business.invest_biz.ui.screens.base_transaction.model.TransactionConfig;
import com.okinc.network.okg.response.OKServerException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C24183iXz;
import o.C25493ixk;
import o.C26758jiP;
import o.C33070mpX;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC24182iXy;
import o.iFG;
import o.iFJ;
import o.iXD;

/* JADX INFO: loaded from: classes6.dex */
public final class SettleTransactionUseCaseImpl$invoke$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends C24183iXz>>, Object> {
    final /* synthetic */ InterfaceC24182iXy $screenState;
    final /* synthetic */ TransactionConfig $transactionConfig;
    final /* synthetic */ InvestTxModel $txModel;
    Object L$0;
    int label;
    final /* synthetic */ C26758jiP this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SettleTransactionUseCaseImpl$invoke$2(InvestTxModel investTxModel, TransactionConfig transactionConfig, C26758jiP c26758jiP, InterfaceC24182iXy interfaceC24182iXy, Continuation<? super SettleTransactionUseCaseImpl$invoke$2> continuation) {
        super(2, continuation);
        this.$txModel = investTxModel;
        this.$transactionConfig = transactionConfig;
        this.this$0 = c26758jiP;
        this.$screenState = interfaceC24182iXy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SettleTransactionUseCaseImpl$invoke$2(this.$txModel, this.$transactionConfig, this.this$0, this.$screenState, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends C24183iXz>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super Result<C24183iXz>>) continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super Result<C24183iXz>> continuation) {
        return ((SettleTransactionUseCaseImpl$invoke$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00d2  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        InvestTxModel investTxModel;
        Object taskDescription;
        Object objM7377constructorimpl;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            InvestTxModel investTxModel2 = this.$txModel;
            InvestTxModel investTxModelCopy = investTxModel2.copy(((-1) & 1) != 0 ? investTxModel2.orderType : 0, ((-1) & 2) != 0 ? investTxModel2.walletId : null, ((-1) & 4) != 0 ? investTxModel2.address : null, ((-1) & 8) != 0 ? investTxModel2.investmentId : null, ((-1) & 16) != 0 ? investTxModel2.coinId : null, ((-1) & 32) != 0 ? investTxModel2.chainId : 0L, ((-1) & 64) != 0 ? investTxModel2.totalValue : null, ((-1) & 128) != 0 ? investTxModel2.expectOutputList : null, ((-1) & 256) != 0 ? investTxModel2.expectTokenList : null, ((-1) & 512) != 0 ? investTxModel2.assetsList : null, ((-1) & 1024) != 0 ? investTxModel2.userInputList : null, ((-1) & 2048) != 0 ? investTxModel2.gasRate : null, ((-1) & 4096) != 0 ? investTxModel2.gasPrice : null, ((-1) & 8192) != 0 ? investTxModel2.gasLimit : null, ((-1) & 16384) != 0 ? investTxModel2.priorityFee : null, ((-1) & 32768) != 0 ? investTxModel2.slipPoint : null, ((-1) & 65536) != 0 ? investTxModel2.contextJson : null, ((-1) & 131072) != 0 ? investTxModel2.redeemAll : 0, ((-1) & 262144) != 0 ? investTxModel2.isAvailableClaim : false, ((-1) & 524288) != 0 ? investTxModel2.analysisPlatformId : null, ((-1) & 1048576) != 0 ? investTxModel2.platform : null, ((-1) & 2097152) != 0 ? investTxModel2.drawableRes : 0, ((-1) & 4194304) != 0 ? investTxModel2.claimIndex : null, ((-1) & 8388608) != 0 ? investTxModel2.claimOverdue : null, ((-1) & 16777216) != 0 ? investTxModel2.callDataExtJsonList : null, ((-1) & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? investTxModel2.redeemExtra : null, ((-1) & 67108864) != 0 ? investTxModel2.rewardingAddress : null, ((-1) & 134217728) != 0 ? investTxModel2.tokenId : null, ((-1) & 268435456) != 0 ? investTxModel2.callDataExtJson : null, ((-1) & 536870912) != 0 ? investTxModel2.tickLower : null, ((-1) & 1073741824) != 0 ? investTxModel2.tickUpper : null, ((-1) & Integer.MIN_VALUE) != 0 ? investTxModel2.fromToken : null, (32767 & 1) != 0 ? investTxModel2.approveType : null, (32767 & 2) != 0 ? investTxModel2.needApproveAmount : null, (32767 & 4) != 0 ? investTxModel2.callDataExtraFromBE : null, (32767 & 8) != 0 ? investTxModel2.redeemPercent : null, (32767 & 16) != 0 ? investTxModel2.pubkey : null, (32767 & 32) != 0 ? investTxModel2.platformName : null, (32767 & 64) != 0 ? investTxModel2.platformLogo : null, (32767 & 128) != 0 ? investTxModel2.btcMode : null, (32767 & 256) != 0 ? investTxModel2.providerPubkey : null, (32767 & 512) != 0 ? investTxModel2.subscribeCallDataExtInfo : null, (32767 & 1024) != 0 ? investTxModel2.openZap : false, (32767 & 2048) != 0 ? investTxModel2.isSingle : false, (32767 & 4096) != 0 ? investTxModel2.swapSlipPoint : null, (32767 & 8192) != 0 ? investTxModel2.feeEarning : null, (32767 & 16384) != 0 ? investTxModel2.isOpenMEV : false, (32767 & 32768) != 0 ? investTxModel2.stakeId : this.$transactionConfig.fARcdN());
            iFJ ifj = this.this$0.copydefault;
            this.L$0 = investTxModelCopy;
            this.label = 1;
            Object objOLrzqt = ifj.OLrzqt(investTxModelCopy, this);
            if (objOLrzqt == objCopydefault) {
                return objCopydefault;
            }
            investTxModel = investTxModelCopy;
            taskDescription = objOLrzqt;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            InvestTxModel investTxModel3 = (InvestTxModel) this.L$0;
            C56391yDq.AEQbTJ(obj);
            taskDescription = ((Result) obj).m7386unboximpl();
            investTxModel = investTxModel3;
        }
        TransactionConfig transactionConfig = this.$transactionConfig;
        C26758jiP c26758jiP = this.this$0;
        if (Result.m7384isSuccessimpl(taskDescription)) {
            Result.Application application = Result.Companion;
            InvestCallDataResult investCallDataResult = (InvestCallDataResult) taskDescription;
            if (investCallDataResult.EZpvd().length() != 0) {
                iFG.StateListAnimator stateListAnimator = iFG.Companion;
                if (stateListAnimator.AEQbTJ(investCallDataResult.EZpvd(), investTxModel).getSignDataJson().length() != 0) {
                    if (transactionConfig.zLjUOn() || transactionConfig.getNewProxyInstance()) {
                        taskDescription = new iXD.StateListAnimator(investTxModel, stateListAnimator.copydefault(investCallDataResult.EZpvd(), investTxModel), investCallDataResult, c26758jiP.AYXKKw, c26758jiP.djBIcL);
                    } else {
                        taskDescription = new iXD.ActionBar(investTxModel, stateListAnimator.AEQbTJ(investCallDataResult.EZpvd(), investTxModel), c26758jiP.AYXKKw, c26758jiP.djBIcL);
                    }
                }
            } else {
                taskDescription = new iXD.TaskDescription(new OKServerException(-1, C33070mpX.AYXKKw(C25493ixk.FragmentManager.iRxXKY), null, null, 12, null), null, 2, null);
            }
        }
        Object objM7377constructorimpl2 = Result.m7377constructorimpl(taskDescription);
        InterfaceC24182iXy interfaceC24182iXy = this.$screenState;
        if (Result.m7384isSuccessimpl(objM7377constructorimpl2)) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(new C24183iXz((iXD) objM7377constructorimpl2, interfaceC24182iXy));
        } else {
            objM7377constructorimpl = Result.m7377constructorimpl(objM7377constructorimpl2);
        }
        return Result.m7376boximpl(objM7377constructorimpl);
    }
}
