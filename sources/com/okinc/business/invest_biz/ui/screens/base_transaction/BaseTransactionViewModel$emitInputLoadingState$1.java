package com.okinc.business.invest_biz.ui.screens.base_transaction;

import com.okinc.business.invest_biz.data.models.InvestTokenWithAmount;
import com.okinc.business.invest_biz.ui.screens.base_transaction.model.DetailItemType;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC24170iXm;
import o.C24177iXt;
import o.C56391yDq;
import o.C56402yEa;
import o.C56442yFn;
import o.InterfaceC24178iXu;
import o.InterfaceC24182iXy;
import o.iCP;
import o.iXA;
import o.iXB;
import o.iXC;

/* JADX INFO: loaded from: classes6.dex */
public final class BaseTransactionViewModel$emitInputLoadingState$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ iXC $currentContent;
    final /* synthetic */ iXB $userInput;
    int label;
    final /* synthetic */ AbstractC24170iXm this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseTransactionViewModel$emitInputLoadingState$1(iXC ixc, iXB ixb, AbstractC24170iXm abstractC24170iXm, Continuation<? super BaseTransactionViewModel$emitInputLoadingState$1> continuation) {
        super(2, continuation);
        this.$currentContent = ixc;
        this.$userInput = ixb;
        this.this$0 = abstractC24170iXm;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BaseTransactionViewModel$emitInputLoadingState$1(this.$currentContent, this.$userInput, this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((BaseTransactionViewModel$emitInputLoadingState$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x0109  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        String strEZpvd;
        InvestTokenWithAmount investTokenWithAmountValues;
        List<InvestTokenWithAmount> listAYXKKw;
        int iIndexOf;
        InterfaceC24178iXu interfaceC24178iXuGEmmrt;
        List<InvestTokenWithAmount> listCopydefault;
        InvestTokenWithAmount investTokenWithAmountOLrzqt;
        InvestTokenWithAmount investTokenWithAmountDjBIcL;
        InvestTokenWithAmount investTokenWithAmountDjBIcL2;
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            iXA ixaEZpvd = this.$currentContent.EZpvd();
            iXB ixb = this.$userInput;
            if (ixb == null || (strEZpvd = ixb.EZpvd()) == null) {
                strEZpvd = "0";
            }
            String str = strEZpvd;
            iXB ixb2 = this.$userInput;
            if (ixb2 == null || (investTokenWithAmountValues = ixb2.djBIcL()) == null) {
                investTokenWithAmountValues = this.$currentContent.EZpvd().values();
            }
            InvestTokenWithAmount investTokenWithAmount = investTokenWithAmountValues;
            iXB ixb3 = this.$userInput;
            if (ixb3 == null || (investTokenWithAmountDjBIcL2 = ixb3.djBIcL()) == null || (listAYXKKw = C56402yEa.EZpvd(investTokenWithAmountDjBIcL2)) == null) {
                listAYXKKw = this.$currentContent.EZpvd().AYXKKw();
            }
            List<InvestTokenWithAmount> list = listAYXKKw;
            iXB ixb4 = this.$userInput;
            if (ixb4 == null || (investTokenWithAmountDjBIcL = ixb4.djBIcL()) == null) {
                iIndexOf = 0;
            } else {
                iXC ixc = this.$currentContent;
                iIndexOf = ixc.EZpvd().AYXKKw().indexOf(iCP.KWHzl(ixc.EZpvd().AYXKKw(), investTokenWithAmountDjBIcL));
            }
            iXA ixaAEQbTJ = ixaEZpvd.AEQbTJ((1032191 & 1) != 0 ? ixaEZpvd.AuCTel : null, (1032191 & 2) != 0 ? ixaEZpvd.DbNXlk : true, (1032191 & 4) != 0 ? ixaEZpvd.copydefault : null, (1032191 & 8) != 0 ? ixaEZpvd.AYXKKw : null, (1032191 & 16) != 0 ? ixaEZpvd.ejfBZ : investTokenWithAmount, (1032191 & 32) != 0 ? ixaEZpvd.fARcdN : list, (1032191 & 64) != 0 ? ixaEZpvd.djBIcL : null, (1032191 & 128) != 0 ? ixaEZpvd.EZpvd : iIndexOf, (1032191 & 256) != 0 ? ixaEZpvd.fIwbmz : 0, (1032191 & 512) != 0 ? ixaEZpvd.AkhnZx : false, (1032191 & 1024) != 0 ? ixaEZpvd.values : false, (1032191 & 2048) != 0 ? ixaEZpvd.fJNWhG : null, (1032191 & 4096) != 0 ? ixaEZpvd.KWHzl : str, (1032191 & 8192) != 0 ? ixaEZpvd.AEQbTJ : null, (1032191 & 16384) != 0 ? ixaEZpvd.isConnected : null, (1032191 & 32768) != 0 ? ixaEZpvd.AhwBna : false, (1032191 & 65536) != 0 ? ixaEZpvd.valueOf : false, (1032191 & 131072) != 0 ? ixaEZpvd.OLrzqt : false, (1032191 & 262144) != 0 ? ixaEZpvd.fetchVPNInfo : false, (1032191 & 524288) != 0 ? ixaEZpvd.gEmmrt : false);
            C24177iXt c24177iXtKWHzl = this.$currentContent.KWHzl();
            C24177iXt c24177iXtCopydefault = c24177iXtKWHzl.copydefault((247 & 1) != 0 ? c24177iXtKWHzl.copydefault : null, (247 & 2) != 0 ? c24177iXtKWHzl.valueOf : null, (247 & 4) != 0 ? c24177iXtKWHzl.djBIcL : 0, (247 & 8) != 0 ? c24177iXtKWHzl.OLrzqt : false, (247 & 16) != 0 ? c24177iXtKWHzl.EZpvd : false, (247 & 32) != 0 ? c24177iXtKWHzl.AEQbTJ : null, (247 & 64) != 0 ? c24177iXtKWHzl.AYXKKw : 0, (247 & 128) != 0 ? c24177iXtKWHzl.KWHzl : 0);
            if (this.this$0.uzCIH.AxsJAY()) {
                InterfaceC24178iXu interfaceC24178iXuGEmmrt2 = this.$currentContent.gEmmrt();
                InterfaceC24178iXu.LoaderManager loaderManagerCopydefault = null;
                if ((interfaceC24178iXuGEmmrt2 != null ? interfaceC24178iXuGEmmrt2.EZpvd() : null) == DetailItemType.RECEIVE_TOKEN) {
                    InterfaceC24178iXu interfaceC24178iXuGEmmrt3 = this.$currentContent.gEmmrt();
                    InterfaceC24178iXu.LoaderManager loaderManager = interfaceC24178iXuGEmmrt3 instanceof InterfaceC24178iXu.LoaderManager ? (InterfaceC24178iXu.LoaderManager) interfaceC24178iXuGEmmrt3 : null;
                    if (loaderManager != null) {
                        iXB ixb5 = this.$userInput;
                        if (ixb5 == null || (investTokenWithAmountOLrzqt = ixb5.OLrzqt()) == null || (listCopydefault = C56402yEa.EZpvd(investTokenWithAmountOLrzqt)) == null) {
                            listCopydefault = ((InterfaceC24178iXu.LoaderManager) this.$currentContent.gEmmrt()).copydefault();
                        }
                        loaderManagerCopydefault = loaderManager.copydefault((503 & 1) != 0 ? loaderManager.AhwBna : 0, (503 & 2) != 0 ? loaderManager.gEmmrt : listCopydefault, (503 & 4) != 0 ? loaderManager.KWHzl : 0, (503 & 8) != 0 ? loaderManager.EZpvd : false, (503 & 16) != 0 ? loaderManager.AEQbTJ : false, (503 & 32) != 0 ? loaderManager.copydefault : null, (503 & 64) != 0 ? loaderManager.OLrzqt : false, (503 & 128) != 0 ? loaderManager.valueOf : null, (503 & 256) != 0 ? loaderManager.djBIcL : null);
                    }
                    interfaceC24178iXuGEmmrt = loaderManagerCopydefault;
                } else {
                    interfaceC24178iXuGEmmrt = this.$currentContent.gEmmrt();
                }
            }
            iXC ixc2 = this.$currentContent;
            this.this$0.copydefault.setValue(new InterfaceC24182iXy.Activity(ixc2.KWHzl((16777087 & 1) != 0 ? ixc2.AkhnZx : true, (16777087 & 2) != 0 ? ixc2.fetchVPNInfo : false, (16777087 & 4) != 0 ? ixc2.valueOf : null, (16777087 & 8) != 0 ? ixc2.values : 0L, (16777087 & 16) != 0 ? ixc2.djBIcL : 0, (16777087 & 32) != 0 ? ixc2.EZpvd : 0L, (16777087 & 64) != 0 ? ixc2.DbNXlk : 0, (16777087 & 128) != 0 ? ixc2.fARcdN : null, (16777087 & 256) != 0 ? ixc2.fIwbmz : null, (16777087 & 512) != 0 ? ixc2.KWHzl : ixaAEQbTJ, (16777087 & 1024) != 0 ? ixc2.gEmmrt : null, (16777087 & 2048) != 0 ? ixc2.AYXKKw : interfaceC24178iXuGEmmrt, (16777087 & 4096) != 0 ? ixc2.iwGUEr : null, (16777087 & 8192) != 0 ? ixc2.OLrzqt : c24177iXtCopydefault, (16777087 & 16384) != 0 ? ixc2.getNewProxyInstance : null, (16777087 & 32768) != 0 ? ixc2.getFieldNames : null, (16777087 & 65536) != 0 ? ixc2.ejfBZ : null, (16777087 & 131072) != 0 ? ixc2.isConnected : false, (16777087 & 262144) != 0 ? ixc2.uzCIH : null, (16777087 & 524288) != 0 ? ixc2.AhwBna : null, (16777087 & 1048576) != 0 ? ixc2.copydefault : null, (16777087 & 2097152) != 0 ? ixc2.AuCTel : null, (16777087 & 4194304) != 0 ? ixc2.fJNWhG : null, (16777087 & 8388608) != 0 ? ixc2.AEQbTJ : 0)));
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
