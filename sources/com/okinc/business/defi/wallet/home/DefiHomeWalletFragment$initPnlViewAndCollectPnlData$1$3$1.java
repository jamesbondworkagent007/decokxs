package com.okinc.business.defi.wallet.home;

import androidx.fragment.app.FragmentActivity;
import com.okinc.business.defi.biz.model.ChainAddress;
import com.okinc.business.defi.biz.net.bean.WalletPnlAnalysisResponse;
import com.okinc.business.defi.wallet.home.addressDetail.utils.WalletPnlShareInfo;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractActivityC33041mov;
import o.AbstractC12782ctV;
import o.C10854bwM;
import o.C15911eZw;
import o.C16595emr;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.InterfaceC13655dTj;
import o.ePI;
import o.pUU;

/* JADX INFO: loaded from: classes5.dex */
public final class DefiHomeWalletFragment$initPnlViewAndCollectPnlData$1$3$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ ChainAddress $chainAddress;
    final /* synthetic */ C10854bwM $chainMeta;
    final /* synthetic */ WalletPnlAnalysisResponse $response;
    final /* synthetic */ C16595emr $this_with;
    int label;
    final /* synthetic */ ePI this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefiHomeWalletFragment$initPnlViewAndCollectPnlData$1$3$1(ePI epi, C16595emr c16595emr, WalletPnlAnalysisResponse walletPnlAnalysisResponse, C10854bwM c10854bwM, ChainAddress chainAddress, Continuation<? super DefiHomeWalletFragment$initPnlViewAndCollectPnlData$1$3$1> continuation) {
        super(2, continuation);
        this.this$0 = epi;
        this.$this_with = c16595emr;
        this.$response = walletPnlAnalysisResponse;
        this.$chainMeta = c10854bwM;
        this.$chainAddress = chainAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DefiHomeWalletFragment$initPnlViewAndCollectPnlData$1$3$1(this.this$0, this.$this_with, this.$response, this.$chainMeta, this.$chainAddress, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((DefiHomeWalletFragment$initPnlViewAndCollectPnlData$1$3$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r23v0, resolved type: java.lang.String */
    /* JADX DEBUG: Multi-variable search result rejected for r23v1, resolved type: java.lang.String */
    /* JADX DEBUG: Multi-variable search result rejected for r23v2, resolved type: java.lang.String */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        String str;
        String str2;
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            this.this$0.showLoading();
            C16595emr c16595emr = this.$this_with;
            WalletPnlAnalysisResponse walletPnlAnalysisResponse = this.$response;
            C10854bwM c10854bwM = this.$chainMeta;
            ChainAddress chainAddress = this.$chainAddress;
            ePI epi = this.this$0;
            try {
                Result.Application application = Result.Companion;
                String strCopydefault = c16595emr.fARcdN.copydefault();
                switch (strCopydefault.hashCode()) {
                    case 51:
                        if (!strCopydefault.equals("3")) {
                            str = "";
                        } else {
                            str2 = "7";
                            str = str2;
                        }
                        break;
                    case 52:
                        if (!strCopydefault.equals("4")) {
                            str = "";
                        } else {
                            str2 = "30";
                            str = str2;
                        }
                        break;
                    case 53:
                        if (!strCopydefault.equals("5")) {
                            str = "";
                        } else {
                            str2 = "90";
                            str = str2;
                        }
                        break;
                    default:
                        str = "";
                        break;
                }
                String totalPnlRoi = walletPnlAnalysisResponse.getTotalPnlRoi();
                String str3 = totalPnlRoi == null ? "0" : totalPnlRoi;
                String totalPnl = walletPnlAnalysisResponse.getTotalPnl();
                String str4 = totalPnl == null ? "0" : totalPnl;
                String totalWinRate = walletPnlAnalysisResponse.getTotalWinRate();
                String str5 = totalWinRate == null ? "0" : totalWinRate;
                String totalTxsBuy = walletPnlAnalysisResponse.getTotalTxsBuy();
                String str6 = totalTxsBuy == null ? "0" : totalTxsBuy;
                String totalTxsSell = walletPnlAnalysisResponse.getTotalTxsSell();
                WalletPnlShareInfo walletPnlShareInfo = new WalletPnlShareInfo(str, str3, str4, str5, str6, totalTxsSell == null ? "0" : totalTxsSell, c10854bwM.AYXKKw(), chainAddress.getAddress(), C56443yFo.KWHzl(true), "");
                FragmentActivity activity = epi.getActivity();
                AbstractActivityC33041mov abstractActivityC33041mov = activity instanceof AbstractActivityC33041mov ? (AbstractActivityC33041mov) activity : null;
                if (abstractActivityC33041mov != null) {
                    long jFetchVPNInfo = c10854bwM.fetchVPNInfo();
                    String address = chainAddress.getAddress();
                    String strCopydefault2 = c16595emr.fARcdN.copydefault();
                    AbstractC12782ctV abstractC12782ctV = epi.fIwbmz;
                    objDbNXlk = abstractC12782ctV != null ? abstractC12782ctV.DbNXlk() : null;
                    C15911eZw.EZpvd(abstractActivityC33041mov, String.valueOf(jFetchVPNInfo), address, strCopydefault2, walletPnlShareInfo, objDbNXlk == null ? "" : objDbNXlk, new ActionBar(epi));
                    objDbNXlk = Unit.INSTANCE;
                }
                objM7377constructorimpl = Result.m7377constructorimpl(objDbNXlk);
            } catch (CancellationException e) {
                throw e;
            } catch (Throwable th) {
                Result.Application application2 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
            ePI epi2 = this.this$0;
            Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
            if (thM7380exceptionOrNullimpl != null) {
                epi2.dismissLoading();
                pUU.copydefault(epi2.getTAG(), "onPnlChartShareClick error: " + thM7380exceptionOrNullimpl);
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    public static final class ActionBar implements InterfaceC13655dTj {
        public final /* synthetic */ ePI AEQbTJ;

        @Override // o.InterfaceC13655dTj
        public void copydefault() {
        }

        public ActionBar(ePI epi) {
            this.AEQbTJ = epi;
        }

        @Override // o.InterfaceC13655dTj
        public void AEQbTJ() {
            this.AEQbTJ.dismissLoading();
        }
    }
}
