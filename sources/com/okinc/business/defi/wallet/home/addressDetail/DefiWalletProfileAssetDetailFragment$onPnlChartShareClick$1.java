package com.okinc.business.defi.wallet.home.addressDetail;

import androidx.fragment.app.FragmentActivity;
import com.okinc.business.defi.biz.net.bean.WalletPnlAnalysisResponse;
import com.okinc.business.defi.wallet.home.addressDetail.ui.ProfileAssetChooseNetworkDialogFragment;
import com.okinc.business.defi.wallet.home.addressDetail.utils.WalletPnlShareInfo;
import com.okinc.business.defi.wallet.home.addressDetail.viewmodel.WalletSelfAddressCheckerViewModel;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractActivityC33041mov;
import o.C15911eZw;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.InterfaceC13655dTj;
import o.eVR;
import o.pUU;

/* JADX INFO: loaded from: classes5.dex */
public final class DefiWalletProfileAssetDetailFragment$onPnlChartShareClick$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ WalletPnlAnalysisResponse $response;
    int label;
    final /* synthetic */ eVR this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefiWalletProfileAssetDetailFragment$onPnlChartShareClick$1(eVR evr, WalletPnlAnalysisResponse walletPnlAnalysisResponse, Continuation<? super DefiWalletProfileAssetDetailFragment$onPnlChartShareClick$1> continuation) {
        super(2, continuation);
        this.this$0 = evr;
        this.$response = walletPnlAnalysisResponse;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DefiWalletProfileAssetDetailFragment$onPnlChartShareClick$1(this.this$0, this.$response, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((DefiWalletProfileAssetDetailFragment$onPnlChartShareClick$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c1  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        Object objM7377constructorimpl2;
        String str;
        Object objOLrzqt;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                this.this$0.zsXlph();
                eVR evr = this.this$0;
                Result.Application application = Result.Companion;
                WalletSelfAddressCheckerViewModel walletSelfAddressCheckerViewModelAhwBna = evr.AhwBna();
                String strSSMYrx = evr.sSMYrx();
                this.label = 1;
                objOLrzqt = walletSelfAddressCheckerViewModelAhwBna.OLrzqt(strSSMYrx, this);
                if (objOLrzqt == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                objOLrzqt = obj;
            }
            objM7377constructorimpl = Result.m7377constructorimpl(C56443yFo.KWHzl(((Boolean) objOLrzqt).booleanValue()));
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        eVR evr2 = this.this$0;
        Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
            pUU.copydefault(evr2.getTAG(), "onPnlChartShareClick isSelfWalletAddress error: " + thM7380exceptionOrNullimpl);
        }
        Boolean boolKWHzl = C56443yFo.KWHzl(false);
        if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
            objM7377constructorimpl = boolKWHzl;
        }
        boolean zBooleanValue = ((Boolean) objM7377constructorimpl).booleanValue();
        this.this$0.KWHzl(zBooleanValue);
        eVR evr3 = this.this$0;
        WalletPnlAnalysisResponse walletPnlAnalysisResponse = this.$response;
        try {
            Result.Application application3 = Result.Companion;
            String str2 = evr3.AubY;
            switch (str2.hashCode()) {
                case 51:
                    str = !str2.equals("3") ? "" : "7";
                    break;
                case 52:
                    if (str2.equals("4")) {
                        str = "30";
                        break;
                    }
                    break;
                case 53:
                    if (str2.equals("5")) {
                        str = "90";
                        break;
                    }
                    break;
                default:
                    break;
            }
            String str3 = str;
            String totalPnlRoi = walletPnlAnalysisResponse.getTotalPnlRoi();
            String str4 = totalPnlRoi == null ? "0" : totalPnlRoi;
            String totalPnl = walletPnlAnalysisResponse.getTotalPnl();
            String str5 = totalPnl == null ? "0" : totalPnl;
            String totalWinRate = walletPnlAnalysisResponse.getTotalWinRate();
            String str6 = totalWinRate == null ? "0" : totalWinRate;
            String totalTxsBuy = walletPnlAnalysisResponse.getTotalTxsBuy();
            String str7 = totalTxsBuy == null ? "0" : totalTxsBuy;
            String totalTxsSell = walletPnlAnalysisResponse.getTotalTxsSell();
            if (totalTxsSell == null) {
                totalTxsSell = "0";
            }
            ProfileAssetChooseNetworkDialogFragment.NetworkData networkData = evr3.sSMYrx;
            Unit unit = null;
            WalletPnlShareInfo walletPnlShareInfo = new WalletPnlShareInfo(str3, str4, str5, str6, str7, totalTxsSell, networkData != null ? networkData.getCoinUrl() : null, evr3.sSMYrx(), C56443yFo.KWHzl(zBooleanValue), evr3.DTwDnp);
            FragmentActivity activity = evr3.getActivity();
            AbstractActivityC33041mov abstractActivityC33041mov = activity instanceof AbstractActivityC33041mov ? (AbstractActivityC33041mov) activity : null;
            if (abstractActivityC33041mov != null) {
                C15911eZw.EZpvd(abstractActivityC33041mov, String.valueOf(evr3.values), evr3.sSMYrx(), evr3.AubY, walletPnlShareInfo, evr3.values().KWHzl(), new Activity(evr3));
                unit = Unit.INSTANCE;
            }
            objM7377constructorimpl2 = Result.m7377constructorimpl(unit);
        } catch (CancellationException e2) {
            throw e2;
        } catch (Throwable th2) {
            Result.Application application4 = Result.Companion;
            objM7377constructorimpl2 = Result.m7377constructorimpl(C56391yDq.EZpvd(th2));
        }
        eVR evr4 = this.this$0;
        Throwable thM7380exceptionOrNullimpl2 = Result.m7380exceptionOrNullimpl(objM7377constructorimpl2);
        if (thM7380exceptionOrNullimpl2 != null) {
            evr4.AYXKKw();
            pUU.copydefault(evr4.getTAG(), "onPnlChartShareClick error: " + thM7380exceptionOrNullimpl2);
        }
        return Unit.INSTANCE;
    }

    public static final class Activity implements InterfaceC13655dTj {
        public final /* synthetic */ eVR OLrzqt;

        @Override // o.InterfaceC13655dTj
        public void copydefault() {
        }

        public Activity(eVR evr) {
            this.OLrzqt = evr;
        }

        @Override // o.InterfaceC13655dTj
        public void AEQbTJ() {
            this.OLrzqt.AYXKKw();
        }
    }
}
