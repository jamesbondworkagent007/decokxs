package com.okinc.business.invest_biz.ui.screens.base_transaction;

import com.google.api.client.googleapis.media.MediaHttpDownloader;
import com.okinc.business.invest_biz.data.bean.InvestTxModel;
import com.okinc.business.invest_biz.data.logic.InvestTradeManager;
import com.okinc.business.invest_biz.ui.screens.base_transaction.model.TransactionConfig;
import com.okinc.network.okg.response.OKServerException;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import o.AbstractC24170iXm;
import o.C24181iXx;
import o.C24183iXz;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC24178iXu;
import o.InterfaceC24182iXy;
import o.iXC;
import o.iXD;
import o.iXN;

/* JADX INFO: loaded from: classes6.dex */
public final class BaseTransactionViewModel$settleTransaction$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $fromUSDTDialog;
    Object L$0;
    int label;
    final /* synthetic */ AbstractC24170iXm this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseTransactionViewModel$settleTransaction$1(AbstractC24170iXm abstractC24170iXm, boolean z, Continuation<? super BaseTransactionViewModel$settleTransaction$1> continuation) {
        super(2, continuation);
        this.this$0 = abstractC24170iXm;
        this.$fromUSDTDialog = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BaseTransactionViewModel$settleTransaction$1(this.this$0, this.$fromUSDTDialog, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((BaseTransactionViewModel$settleTransaction$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x016f  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        InvestTxModel investTxModelOLrzqt;
        InvestTxModel investTxModelCopy;
        Object objCopydefault;
        Object next;
        Object obj2;
        Object objCopydefault2 = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            iXC ixcAEQbTJ = C24181iXx.AEQbTJ(this.this$0.AhwBna().getValue());
            if (ixcAEQbTJ == null || (investTxModelOLrzqt = ixcAEQbTJ.OLrzqt()) == null) {
                throw new IllegalArgumentException("There should always be at least 1 active Transaction");
            }
            InvestTradeManager investTradeManager = InvestTradeManager.OLrzqt;
            if (investTradeManager.AEQbTJ(investTxModelOLrzqt.getOrderType())) {
                Integer approveType = investTxModelOLrzqt.getApproveType();
                if (investTradeManager.KWHzl(approveType != null ? approveType.intValue() : 0) && !this.$fromUSDTDialog) {
                    MutableSharedFlow mutableSharedFlow = this.this$0.AYXKKw;
                    iXD.TaskDescription taskDescription = new iXD.TaskDescription(new OKServerException(111000111, "", null, null, 12, null), null, 2, null);
                    this.label = 1;
                    if (mutableSharedFlow.emit(taskDescription, this) == objCopydefault2) {
                        return objCopydefault2;
                    }
                    return Unit.INSTANCE;
                }
            }
            List<InterfaceC24178iXu> listAuCTel = ixcAEQbTJ.AuCTel();
            if (listAuCTel != null) {
                Iterator<T> it = listAuCTel.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    if (((InterfaceC24178iXu) next) instanceof InterfaceC24178iXu.SharedElementCallback) {
                        break;
                    }
                }
                InterfaceC24178iXu interfaceC24178iXu = (InterfaceC24178iXu) next;
                if (interfaceC24178iXu != null) {
                    AbstractC24170iXm abstractC24170iXm = this.this$0;
                    if (interfaceC24178iXu instanceof InterfaceC24178iXu.SharedElementCallback) {
                        InterfaceC24178iXu.SharedElementCallback sharedElementCallback = (InterfaceC24178iXu.SharedElementCallback) interfaceC24178iXu;
                        investTxModelCopy = investTxModelOLrzqt.copy(((-1) & 1) != 0 ? investTxModelOLrzqt.orderType : 0, ((-1) & 2) != 0 ? investTxModelOLrzqt.walletId : null, ((-1) & 4) != 0 ? investTxModelOLrzqt.address : null, ((-1) & 8) != 0 ? investTxModelOLrzqt.investmentId : null, ((-1) & 16) != 0 ? investTxModelOLrzqt.coinId : null, ((-1) & 32) != 0 ? investTxModelOLrzqt.chainId : 0L, ((-1) & 64) != 0 ? investTxModelOLrzqt.totalValue : null, ((-1) & 128) != 0 ? investTxModelOLrzqt.expectOutputList : null, ((-1) & 256) != 0 ? investTxModelOLrzqt.expectTokenList : null, ((-1) & 512) != 0 ? investTxModelOLrzqt.assetsList : null, ((-1) & 1024) != 0 ? investTxModelOLrzqt.userInputList : null, ((-1) & 2048) != 0 ? investTxModelOLrzqt.gasRate : null, ((-1) & 4096) != 0 ? investTxModelOLrzqt.gasPrice : null, ((-1) & 8192) != 0 ? investTxModelOLrzqt.gasLimit : null, ((-1) & 16384) != 0 ? investTxModelOLrzqt.priorityFee : null, ((-1) & 32768) != 0 ? investTxModelOLrzqt.slipPoint : null, ((-1) & 65536) != 0 ? investTxModelOLrzqt.contextJson : null, ((-1) & 131072) != 0 ? investTxModelOLrzqt.redeemAll : 0, ((-1) & 262144) != 0 ? investTxModelOLrzqt.isAvailableClaim : false, ((-1) & 524288) != 0 ? investTxModelOLrzqt.analysisPlatformId : null, ((-1) & 1048576) != 0 ? investTxModelOLrzqt.platform : null, ((-1) & 2097152) != 0 ? investTxModelOLrzqt.drawableRes : 0, ((-1) & 4194304) != 0 ? investTxModelOLrzqt.claimIndex : null, ((-1) & 8388608) != 0 ? investTxModelOLrzqt.claimOverdue : null, ((-1) & 16777216) != 0 ? investTxModelOLrzqt.callDataExtJsonList : null, ((-1) & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? investTxModelOLrzqt.redeemExtra : null, ((-1) & 67108864) != 0 ? investTxModelOLrzqt.rewardingAddress : null, ((-1) & 134217728) != 0 ? investTxModelOLrzqt.tokenId : null, ((-1) & 268435456) != 0 ? investTxModelOLrzqt.callDataExtJson : null, ((-1) & 536870912) != 0 ? investTxModelOLrzqt.tickLower : null, ((-1) & 1073741824) != 0 ? investTxModelOLrzqt.tickUpper : null, ((-1) & Integer.MIN_VALUE) != 0 ? investTxModelOLrzqt.fromToken : null, (32767 & 1) != 0 ? investTxModelOLrzqt.approveType : null, (32767 & 2) != 0 ? investTxModelOLrzqt.needApproveAmount : null, (32767 & 4) != 0 ? investTxModelOLrzqt.callDataExtraFromBE : null, (32767 & 8) != 0 ? investTxModelOLrzqt.redeemPercent : null, (32767 & 16) != 0 ? investTxModelOLrzqt.pubkey : null, (32767 & 32) != 0 ? investTxModelOLrzqt.platformName : null, (32767 & 64) != 0 ? investTxModelOLrzqt.platformLogo : null, (32767 & 128) != 0 ? investTxModelOLrzqt.btcMode : null, (32767 & 256) != 0 ? investTxModelOLrzqt.providerPubkey : null, (32767 & 512) != 0 ? investTxModelOLrzqt.subscribeCallDataExtInfo : null, (32767 & 1024) != 0 ? investTxModelOLrzqt.openZap : false, (32767 & 2048) != 0 ? investTxModelOLrzqt.isSingle : false, (32767 & 4096) != 0 ? investTxModelOLrzqt.swapSlipPoint : abstractC24170iXm.EZpvd(sharedElementCallback.AEQbTJ(), sharedElementCallback.AhwBna(), sharedElementCallback.gEmmrt(), sharedElementCallback.KWHzl(), sharedElementCallback.copydefault()), (32767 & 8192) != 0 ? investTxModelOLrzqt.feeEarning : null, (32767 & 16384) != 0 ? investTxModelOLrzqt.isOpenMEV : false, (32767 & 32768) != 0 ? investTxModelOLrzqt.stakeId : null);
                    } else {
                        investTxModelCopy = investTxModelOLrzqt;
                    }
                    if (investTxModelCopy == null) {
                        investTxModelCopy = investTxModelOLrzqt;
                    }
                    iXN ixn = this.this$0.ejfBZ;
                    TransactionConfig transactionConfig = this.this$0.uzCIH;
                    InterfaceC24182iXy value = this.this$0.AhwBna().getValue();
                    this.label = 2;
                    objCopydefault = ixn.copydefault(transactionConfig, value, investTxModelCopy, this);
                    if (objCopydefault == objCopydefault2) {
                        return objCopydefault2;
                    }
                    AbstractC24170iXm abstractC24170iXm2 = this.this$0;
                    if (Result.m7384isSuccessimpl(objCopydefault)) {
                    }
                }
            }
        } else {
            if (i == 1) {
                C56391yDq.AEQbTJ(obj);
                return Unit.INSTANCE;
            }
            if (i == 2) {
                C56391yDq.AEQbTJ(obj);
                objCopydefault = ((Result) obj).m7386unboximpl();
                AbstractC24170iXm abstractC24170iXm22 = this.this$0;
                if (Result.m7384isSuccessimpl(objCopydefault)) {
                    MutableSharedFlow mutableSharedFlow2 = abstractC24170iXm22.AYXKKw;
                    iXD ixdKWHzl = ((C24183iXz) objCopydefault).KWHzl();
                    this.L$0 = objCopydefault;
                    this.label = 3;
                    if (mutableSharedFlow2.emit(ixdKWHzl, this) == objCopydefault2) {
                        return objCopydefault2;
                    }
                    obj2 = objCopydefault;
                    objCopydefault = obj2;
                }
            } else {
                if (i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                obj2 = this.L$0;
                C56391yDq.AEQbTJ(obj);
                objCopydefault = obj2;
            }
        }
        AbstractC24170iXm abstractC24170iXm3 = this.this$0;
        Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objCopydefault);
        if (thM7380exceptionOrNullimpl != null) {
            AbstractC24170iXm.emitError$default(abstractC24170iXm3, new iXD.TaskDescription(thM7380exceptionOrNullimpl, null, 2, null), null, 2, null);
        }
        return Unit.INSTANCE;
    }
}
