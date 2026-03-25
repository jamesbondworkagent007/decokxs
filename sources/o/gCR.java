package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import com.okinc.business.defi.biz.core.dapp.interaction.bean.DappTxResultBean;
import com.okinc.business.defi.biz.core.tx.speedup.bean.SpeedUpInfoBean;
import com.okinc.business.defi.biz.core.ws.channel.WalletTxHistorySubManager;
import com.okinc.business.defi.biz.model.ChainAddress;
import com.okinc.business.defi.biz.net.bean.CoinAndAddressHistoryDetail;
import com.okinc.business.defi.biz.net.bean.TxIdOrHashHistoryDetail;
import com.okinc.business.defi.biz.net.bean.TxRecord;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.wallet.api.bean.WalletTxDetailBean;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC12413cmV;
import o.C13754dXa;
import o.C9694baS;
import o.eGH;
import o.xZF;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public abstract class gCR<B extends SpeedUpInfoBean, T extends AbstractC12413cmV<B>> extends wXX implements View.OnClickListener {
    public InterfaceC58217yxC AYXKKw;
    public Function1<? super java.lang.Boolean, Unit> EZpvd;
    public yHO<? super java.lang.Boolean, ? super java.lang.String, ? super java.lang.String, Unit> copydefault;
    public boolean gEmmrt = true;
    public xZF.TaskDescription<WalletTxHistorySubManager.SubResponse> valueOf;

    public abstract void AEQbTJ();

    public abstract void EZpvd();

    public abstract void OLrzqt();

    public abstract void copydefault(@NotNull java.lang.String str, java.lang.String str2);

    public abstract T gEmmrt();

    @Override // o.wXX, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        AYXKKw();
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        constraintLayout.setBackgroundResource(C13754dXa.Activity.AhwBna);
    }

    public final void AYXKKw() {
        java.lang.String string;
        OLrzqt();
        AbstractC12413cmV abstractC12413cmVGEmmrt = gEmmrt();
        android.os.Bundle arguments = getArguments();
        if (arguments == null || (string = arguments.getString("walletId")) == null) {
            string = "";
        }
        android.os.Bundle arguments2 = getArguments();
        CoinAndAddressHistoryDetail coinAndAddressHistoryDetail = arguments2 != null ? (CoinAndAddressHistoryDetail) arguments2.getParcelable("coinDetail") : null;
        android.os.Bundle arguments3 = getArguments();
        TxIdOrHashHistoryDetail txIdOrHashHistoryDetail = arguments3 != null ? (TxIdOrHashHistoryDetail) arguments3.getParcelable("tradeDetail") : null;
        android.os.Bundle arguments4 = getArguments();
        TxRecord txRecord = arguments4 != null ? (TxRecord) arguments4.getParcelable("txHistory") : null;
        android.os.Bundle arguments5 = getArguments();
        AbstractC58185ywX abstractC58185ywXKWHzl = C11607cUn.KWHzl(abstractC12413cmVGEmmrt.EZpvd(string, coinAndAddressHistoryDetail, txIdOrHashHistoryDetail, txRecord, arguments5 != null ? (WalletTxDetailBean) arguments5.getParcelable("walletTxDetailBean") : null));
        final Function1 function1 = new Function1() { // from class: o.gCW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return gCR.copydefault(this.OLrzqt, (kotlin.Pair) obj);
            }
        };
        InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.gCX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                gCR.djBIcL(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.gCT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return gCR.OLrzqt(this.copydefault, (java.lang.Throwable) obj);
            }
        };
        this.AYXKKw = abstractC58185ywXKWHzl.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.gCU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                gCR.KWHzl(function12, obj);
            }
        });
    }

    public static final void djBIcL(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit copydefault(gCR gcr, kotlin.Pair pair) {
        java.lang.String str;
        gcr.EZpvd();
        if (((java.lang.Boolean) pair.getFirst()).booleanValue()) {
            gcr.copydefault();
        } else {
            gcr.AEQbTJ();
            if (C33129mqd.OLrzqt((java.lang.CharSequence) pair.getSecond()) && (str = (java.lang.String) pair.getSecond()) != null) {
                C55326xho.toastWithFailedIcon$default(str, 0, 1, (java.lang.Object) null);
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void KWHzl(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit OLrzqt(gCR gcr, java.lang.Throwable th) {
        gcr.EZpvd();
        gcr.AEQbTJ();
        return Unit.INSTANCE;
    }

    public void copydefault() {
        C10854bwM c10854bwMOLrzqt = gEmmrt().OLrzqt();
        if (c10854bwMOLrzqt == null || !c10854bwMOLrzqt.DarRvM()) {
            java.lang.String name = getClass().getName();
            SpeedUpInfoBean speedUpInfoBeanFJNWhG = gEmmrt().fJNWhG();
            this.valueOf = new Activity(this, name + "-" + (speedUpInfoBeanFJNWhG != null ? speedUpInfoBeanFJNWhG.getTxId() : null), new xZA(0L, 300L, null, 4, null));
            WalletTxHistorySubManager walletTxHistorySubManagerAxsJAY = C11205cFp.EZpvd.AxsJAY();
            xZF.TaskDescription<WalletTxHistorySubManager.SubResponse> taskDescription = this.valueOf;
            Intrinsics.copydefault(taskDescription);
            walletTxHistorySubManagerAxsJAY.AEQbTJ(taskDescription);
        }
    }

    public static final class Activity extends xZF.TaskDescription<WalletTxHistorySubManager.SubResponse> {
        public final /* synthetic */ gCR<B, T> AEQbTJ;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Activity(gCR<B, T> gcr, java.lang.String str, xZA xza) {
            super(str, xza);
            this.AEQbTJ = gcr;
        }

        @Override // o.xZF.TaskDescription
        public void EZpvd(java.util.List<WalletTxHistorySubManager.SubResponse> list) {
            Intrinsics.checkNotNullParameter(list, "");
            gCR<B, T> gcr = this.AEQbTJ;
            for (WalletTxHistorySubManager.SubResponse subResponse : list) {
                java.lang.String txId = subResponse.getTxId();
                SpeedUpInfoBean speedUpInfoBeanFJNWhG = gcr.gEmmrt().fJNWhG();
                if (!Intrinsics.EZpvd((java.lang.Object) txId, (java.lang.Object) (speedUpInfoBeanFJNWhG != null ? speedUpInfoBeanFJNWhG.getTxId() : null))) {
                    if (C33129mqd.OLrzqt((java.lang.CharSequence) subResponse.getOrderId())) {
                        java.lang.String orderId = subResponse.getOrderId();
                        SpeedUpInfoBean speedUpInfoBeanFJNWhG2 = gcr.gEmmrt().fJNWhG();
                        if (!Intrinsics.EZpvd((java.lang.Object) orderId, (java.lang.Object) (speedUpInfoBeanFJNWhG2 != null ? speedUpInfoBeanFJNWhG2.getOrderId() : null))) {
                            continue;
                        }
                    } else {
                        continue;
                    }
                }
                if (subResponse.getTxStatus() >= 2) {
                    gcr.gEmmrt = false;
                    return;
                }
            }
        }
    }

    public static /* synthetic */ void onPwdInputComplete$default(gCR gcr, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onPwdInputComplete");
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        gcr.copydefault(str, str2);
    }

    public final void EZpvd(@NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull java.lang.String str, Function1<? super java.lang.Boolean, Unit> function1) {
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.EZpvd = function1;
        show(fragmentManager, str);
    }

    public final void copydefault(@NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull java.lang.String str, yHO<? super java.lang.Boolean, ? super java.lang.String, ? super java.lang.String, Unit> yho) {
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.copydefault = yho;
        show(fragmentManager, str);
    }

    public final void valueOf() {
        AbstractC12782ctV abstractC12782ctVEjfBZ;
        AbstractC12782ctV abstractC12782ctVEjfBZ2 = gEmmrt().ejfBZ();
        if (abstractC12782ctVEjfBZ2 != null && abstractC12782ctVEjfBZ2.gHZMYf()) {
            OLrzqt("");
            return;
        }
        if (gEmmrt().ejfBZ() == null || getActivity() == null || gEmmrt().OLrzqt() == null || (abstractC12782ctVEjfBZ = gEmmrt().ejfBZ()) == null) {
            return;
        }
        C15691eRs c15691eRs = C15691eRs.AEQbTJ;
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
        AbstractC58185ywX abstractC58185ywXEZpvd = C58156yvv.EZpvd(c15691eRs.copydefault(abstractC12782ctVEjfBZ, fragmentActivityRequireActivity, this), this);
        final Function1 function1 = new Function1() { // from class: o.gCS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return gCR.copydefault(this.OLrzqt, (java.lang.Boolean) obj);
            }
        };
        abstractC58185ywXEZpvd.AEQbTJ(new InterfaceC58227yxM() { // from class: o.gCO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                gCR.gEmmrt(function1, obj);
            }
        });
    }

    public static final void gEmmrt(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit copydefault(final gCR gcr, java.lang.Boolean bool) {
        if (bool.booleanValue()) {
            return Unit.INSTANCE;
        }
        androidx.fragment.app.FragmentManager childFragmentManager = gcr.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        new C14461dlr(childFragmentManager, "speedUpTx", new Function1() { // from class: o.gCP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return gCR.copydefault(this.OLrzqt, (java.lang.String) obj);
            }
        }, null, null, false, 48, null).EZpvd();
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(gCR gcr, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        gcr.OLrzqt(str);
        return Unit.INSTANCE;
    }

    public final void OLrzqt(java.lang.String str) {
        if (!this.gEmmrt) {
            C55326xho.toastWithFailedIcon$default(C13754dXa.FragmentManager.fsw, 0, 1, (java.lang.Object) null);
            dismissAllowingStateLoss();
            Function1<? super java.lang.Boolean, Unit> function1 = this.EZpvd;
            if (function1 != null) {
                function1.invoke(java.lang.Boolean.FALSE);
            }
            yHO<? super java.lang.Boolean, ? super java.lang.String, ? super java.lang.String, Unit> yho = this.copydefault;
            if (yho != null) {
                yho.invoke(java.lang.Boolean.FALSE, null, null);
                return;
            }
            return;
        }
        onPwdInputComplete$default(this, str, null, 2, null);
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.eGH.Application.getIntent$default(o.eGH$Application, android.content.Context, java.lang.String, java.lang.String, long, long, java.lang.String, java.lang.String, java.lang.Integer, com.okinc.business.defi.api.bean.SignType, int, java.lang.Object):android.content.Intent */
    public final void OLrzqt(@NotNull ResponseData<DappTxResultBean> responseData, @NotNull java.lang.String str) {
        java.lang.String strDbNXlk;
        java.lang.String address;
        java.lang.String strAuCTelauCTel;
        java.lang.String strRJOkX;
        java.lang.Integer numValueOf;
        Intrinsics.checkNotNullParameter(responseData, "");
        Intrinsics.checkNotNullParameter(str, "");
        int code = responseData.getCode();
        if (code == -5015) {
            if (C33129mqd.OLrzqt((java.lang.CharSequence) responseData.getMsg())) {
                KWHzl(responseData.getCode(), responseData.getMsg());
                return;
            }
            return;
        }
        if (code == -5013) {
            C9694baS.Application application = C9694baS.Companion;
            eGH.Application application2 = eGH.Companion;
            FragmentActivity activity = getActivity();
            if (activity == null) {
                return;
            }
            AbstractC12782ctV abstractC12782ctVEjfBZ = gEmmrt().ejfBZ();
            if (abstractC12782ctVEjfBZ == null || (strDbNXlk = abstractC12782ctVEjfBZ.DbNXlk()) == null) {
                strDbNXlk = "";
            }
            ChainAddress chainAddressHDKMBd = gEmmrt().hDKMBd();
            if (chainAddressHDKMBd == null || (address = chainAddressHDKMBd.getAddress()) == null) {
                address = "";
            }
            C10854bwM c10854bwMOLrzqt = gEmmrt().OLrzqt();
            long jAhwBna = c10854bwMOLrzqt != null ? c10854bwMOLrzqt.AhwBna() : 0L;
            if (gEmmrt() instanceof AbstractC12521coY) {
                AbstractC12413cmV abstractC12413cmVGEmmrt = gEmmrt();
                Intrinsics.copydefault(abstractC12413cmVGEmmrt, "");
                strAuCTelauCTel = ((AbstractC12521coY) abstractC12413cmVGEmmrt).AuCTelauCTel();
            } else {
                strAuCTelauCTel = "";
            }
            if (gEmmrt() instanceof AbstractC12521coY) {
                AbstractC12413cmV abstractC12413cmVGEmmrt2 = gEmmrt();
                Intrinsics.copydefault(abstractC12413cmVGEmmrt2, "");
                strRJOkX = ((AbstractC12521coY) abstractC12413cmVGEmmrt2).RJOkX();
            } else {
                strRJOkX = null;
            }
            if (gEmmrt() instanceof AbstractC12521coY) {
                AbstractC12413cmV abstractC12413cmVGEmmrt3 = gEmmrt();
                Intrinsics.copydefault(abstractC12413cmVGEmmrt3, "");
                numValueOf = java.lang.Integer.valueOf(((AbstractC12521coY) abstractC12413cmVGEmmrt3).QUSxYX());
            } else {
                numValueOf = null;
            }
            application.KWHzl(this, application2.AEQbTJ(activity, strDbNXlk, address, jAhwBna, (16 & 16) != 0 ? 0L : 0L, strAuCTelauCTel, strRJOkX, numValueOf, null), new Function2() { // from class: o.gCV
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return gCR.KWHzl(this.EZpvd, ((java.lang.Integer) obj).intValue(), (android.content.Intent) obj2);
                }
            });
            return;
        }
        if (code != 0) {
            switch (code) {
                case -5007:
                    break;
                case -5006:
                    int code2 = responseData.getCode();
                    java.lang.String string = getString(C13754dXa.FragmentManager.Dfm);
                    Intrinsics.checkNotNullExpressionValue(string, "");
                    KWHzl(code2, string);
                    break;
                case -5005:
                    int code3 = responseData.getCode();
                    java.lang.String string2 = getString(C13754dXa.FragmentManager.DRGLNw);
                    Intrinsics.checkNotNullExpressionValue(string2, "");
                    KWHzl(code3, string2);
                    break;
                case -5004:
                    int code4 = responseData.getCode();
                    java.lang.String string3 = getString(C13754dXa.FragmentManager.sYcwUD);
                    Intrinsics.checkNotNullExpressionValue(string3, "");
                    KWHzl(code4, string3);
                    break;
                case -5003:
                    int code5 = responseData.getCode();
                    java.lang.String string4 = getString(C13754dXa.FragmentManager.zpGcln);
                    Intrinsics.checkNotNullExpressionValue(string4, "");
                    KWHzl(code5, string4);
                    break;
                case -5002:
                    int code6 = responseData.getCode();
                    java.lang.String string5 = getString(C13754dXa.FragmentManager.FhERFw);
                    Intrinsics.checkNotNullExpressionValue(string5, "");
                    KWHzl(code6, string5);
                    break;
                case -5001:
                    break;
                case -5000:
                    int code7 = responseData.getCode();
                    java.lang.String string6 = getString(C13754dXa.FragmentManager.Dfm);
                    Intrinsics.checkNotNullExpressionValue(string6, "");
                    KWHzl(code7, string6);
                    break;
                default:
                    KWHzl(responseData.getCode(), responseData.getMsg());
                    break;
            }
            return;
        }
        DappTxResultBean data = responseData.getData();
        if (data == null) {
            return;
        }
        KWHzl(data, str);
    }

    public static final Unit KWHzl(gCR gcr, int i, android.content.Intent intent) {
        if (i == -1) {
            gcr.copydefault("", intent != null ? intent.getStringExtra("result") : null);
        }
        return Unit.INSTANCE;
    }

    public void KWHzl(@NotNull DappTxResultBean dappTxResultBean, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(dappTxResultBean, "");
        Intrinsics.checkNotNullParameter(str, "");
        dismissAllowingStateLoss();
        Function1<? super java.lang.Boolean, Unit> function1 = this.EZpvd;
        if (function1 != null) {
            function1.invoke(java.lang.Boolean.TRUE);
        }
        yHO<? super java.lang.Boolean, ? super java.lang.String, ? super java.lang.String, Unit> yho = this.copydefault;
        if (yho != null) {
            yho.invoke(java.lang.Boolean.TRUE, dappTxResultBean.getTxId(), dappTxResultBean.getTxHash());
        }
    }

    public void KWHzl(int i, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (str.length() == 0) {
            C55326xho.toastWithFailedIcon$default(C13754dXa.FragmentManager.Dfm, 0, 1, (java.lang.Object) null);
        } else {
            C55326xho.toastWithFailedIcon$default(str, 0, 1, (java.lang.Object) null);
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        if (this.valueOf != null) {
            WalletTxHistorySubManager walletTxHistorySubManagerAxsJAY = C11205cFp.EZpvd.AxsJAY();
            xZF.TaskDescription<WalletTxHistorySubManager.SubResponse> taskDescription = this.valueOf;
            Intrinsics.copydefault(taskDescription);
            walletTxHistorySubManagerAxsJAY.OLrzqt(taskDescription);
        }
        InterfaceC58217yxC interfaceC58217yxC = this.AYXKKw;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
    }
}
