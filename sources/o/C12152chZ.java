package o;

import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import com.okinc.business.defi.api.bean.SimpleSubmitTxReq;
import com.okinc.business.defi.api.model.tx.SignAuthType;
import com.okinc.business.defi.api.model.tx.SubmitTxExpandBean;
import com.okinc.business.defi.api.model.tx.signdata.BTCMessageSignData;
import com.okinc.business.defi.biz.core.dapp.interaction.bean.DappTxResultBean;
import com.okinc.business.defi.biz.core.transaction.bean.BatchBroadcastModel;
import com.okinc.business.defi.biz.core.transaction.bean.BroadcastBean;
import com.okinc.business.defi.biz.model.ChainAddress;
import com.okinc.business.defi.biz.net.bean.DappBTCUTXOAllInfo;
import com.okinc.business.defi.biz.net.bean.DappBTCUTXOInfo;
import com.okinc.business.defi.biz.net.bean.DappBTCUTXOResp;
import com.okinc.business.defi.biz.net.bean.DappBTCXRCAssets;
import com.okinc.business.defi.biz.net.bean.DappBtcUtxoFeeReq;
import com.okinc.business.defi.biz.net.bean.TxToastCheckReq;
import com.okinc.business.defi.biz.net.bean.TxToastCheckRes;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.wallet.core.sign.utxo.MPCBRC20PsbtResult;
import com.okinc.wallet.core.sign.utxo.MPCBtcMessage;
import com.okinc.wallet.core.sign.utxo.MPCRawPsbtTx;
import com.okinc.wallet.core.sign.utxo.RSV;
import io.reactivex.BackpressureStrategy;
import java.util.UUID;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import o.C13754dXa;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.chZ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C12152chZ extends AbstractC8610bFv<BTCMessageSignData> {
    public int AEQbTJ;
    public final C12797ctk OLrzqt = new C12797ctk();
    public java.util.List<DappBTCUTXOAllInfo> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final kotlin.Pair KWHzl(kotlin.Pair pair, java.lang.Boolean bool) {
        Intrinsics.checkNotNullParameter(pair, "");
        Intrinsics.checkNotNullParameter(bool, "");
        return pair;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final java.lang.String fARcdN(MPCBRC20PsbtResult mPCBRC20PsbtResult) {
        Intrinsics.checkNotNullParameter(mPCBRC20PsbtResult, "");
        return "";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final java.lang.String isConnected(MPCBRC20PsbtResult mPCBRC20PsbtResult) {
        Intrinsics.checkNotNullParameter(mPCBRC20PsbtResult, "");
        return "";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(int i) {
        this.AEQbTJ = i;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: SignData */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction
    public java.lang.String ag_() throws java.lang.Exception {
        java.lang.String from = ((BTCMessageSignData) QVsKAR()).getFrom();
        if (from != null) {
            return from;
        }
        throw new java.lang.Exception(C33069mpW.copydefault(C13754dXa.FragmentManager.launch, C56423yEv.EZpvd(C56390yDp.OLrzqt("chainName", dHguZz().djBIcL()))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Pair gEmmrt(Function2 function2, java.lang.Object obj, java.lang.Object obj2) {
        Intrinsics.checkNotNullParameter(obj, "");
        Intrinsics.checkNotNullParameter(obj2, "");
        return (kotlin.Pair) function2.invoke(obj, obj2);
    }

    @Override // o.AbstractC8610bFv
    public AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> EZpvd() {
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXEZpvd = super.EZpvd();
        AbstractC58185ywX<java.lang.Boolean> abstractC58185ywXGEmmrt = gEmmrt();
        final Function2 function2 = new Function2() { // from class: o.cig
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C12152chZ.KWHzl((kotlin.Pair) obj, (java.lang.Boolean) obj2);
            }
        };
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXEZpvd2 = AbstractC58185ywX.EZpvd(abstractC58185ywXEZpvd, abstractC58185ywXGEmmrt, new InterfaceC58223yxI() { // from class: o.cid
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58223yxI
            public final java.lang.Object apply(java.lang.Object obj, java.lang.Object obj2) {
                return C12152chZ.gEmmrt(function2, obj, obj2);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXEZpvd2, "");
        return abstractC58185ywXEZpvd2;
    }

    @Override // o.AbstractC8610bFv, com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction
    public java.util.ArrayList<java.lang.Integer> getNewProxyInstance() {
        return yDY.copydefault(9);
    }

    @Override // com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction
    public TxToastCheckReq i_() {
        TxToastCheckReq txToastCheckReqI_ = super.i_();
        txToastCheckReqI_.setCoinId(java.lang.Long.valueOf(dHguZz().AhwBna()));
        txToastCheckReqI_.setChainId(dHguZz().fetchVPNInfo());
        txToastCheckReqI_.setFrom(htlTjW());
        txToastCheckReqI_.setTo("");
        txToastCheckReqI_.setRequestId(UUID.randomUUID().toString());
        return txToastCheckReqI_;
    }

    @Override // o.AbstractC8610bFv
    public AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> AEQbTJ() {
        return EZpvd();
    }

    public final AbstractC58185ywX<java.lang.Boolean> gEmmrt() {
        if (valueOf()) {
            AbstractC58185ywX<java.lang.Boolean> abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(java.lang.Boolean.TRUE);
            Intrinsics.copydefault(abstractC58185ywXKWHzl);
            return abstractC58185ywXKWHzl;
        }
        AbstractC58185ywX<java.lang.Boolean> abstractC58185ywXKWHzl2 = AbstractC58185ywX.KWHzl(new InterfaceC58187ywZ() { // from class: o.chX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58187ywZ
            public final void subscribe(InterfaceC58184ywW interfaceC58184ywW) {
                C12152chZ.AEQbTJ(this.KWHzl, interfaceC58184ywW);
            }
        }, BackpressureStrategy.BUFFER);
        Intrinsics.copydefault(abstractC58185ywXKWHzl2);
        return abstractC58185ywXKWHzl2;
    }

    public static final void AEQbTJ(final C12152chZ c12152chZ, final InterfaceC58184ywW interfaceC58184ywW) {
        Intrinsics.checkNotNullParameter(interfaceC58184ywW, "");
        AbstractC58185ywX<ResponseData<DappBTCUTXOResp>> abstractC58185ywXEZpvd = new C13934dbu().EZpvd(c12152chZ.KWHzl());
        final Function1 function1 = new Function1() { // from class: o.cil
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C12152chZ.AEQbTJ(this.AEQbTJ, interfaceC58184ywW, (ResponseData) obj);
            }
        };
        InterfaceC58227yxM<? super ResponseData<DappBTCUTXOResp>> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.cij
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C12152chZ.AkhnZx(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.cik
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C12152chZ.AEQbTJ(this.AEQbTJ, interfaceC58184ywW, (java.lang.Throwable) obj);
            }
        };
        abstractC58185ywXEZpvd.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.cim
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C12152chZ.DbNXlk(function12, obj);
            }
        });
    }

    public static final void AkhnZx(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AEQbTJ(C12152chZ c12152chZ, InterfaceC58184ywW interfaceC58184ywW, ResponseData responseData) {
        AbstractC9832bcy c9818bck;
        java.lang.Integer analysisStatus;
        DappBTCUTXOResp dappBTCUTXOResp = (DappBTCUTXOResp) responseData.getData();
        java.lang.Object obj = null;
        c12152chZ.copydefault = dappBTCUTXOResp != null ? dappBTCUTXOResp.getUtxoAllInfos() : null;
        C8497bDo c8497bDoDLWbHP = c12152chZ.DLWbHP();
        boolean z = false;
        if (responseData.getCode() == 1100004) {
            c9818bck = new C9820bcm(false, C33070mpX.AYXKKw(C13754dXa.FragmentManager.zqaRxl));
        } else {
            if (responseData.getCode() == 0 && responseData.getData() != null) {
                java.util.List<DappBTCUTXOAllInfo> list = c12152chZ.copydefault;
                if (list != null) {
                    for (java.lang.Object obj2 : list) {
                        DappBTCUTXOAllInfo dappBTCUTXOAllInfo = (DappBTCUTXOAllInfo) obj2;
                        java.lang.Integer analysisStatus2 = dappBTCUTXOAllInfo.getAnalysisStatus();
                        if ((analysisStatus2 != null && analysisStatus2.intValue() == 1) || ((analysisStatus = dappBTCUTXOAllInfo.getAnalysisStatus()) != null && analysisStatus.intValue() == 2)) {
                            obj = obj2;
                            break;
                        }
                    }
                    obj = (DappBTCUTXOAllInfo) obj;
                }
                if (obj == null) {
                    z = true;
                }
            }
            c9818bck = new C9818bck(z, C33070mpX.AYXKKw(C13754dXa.FragmentManager.zqaRxl));
        }
        c8497bDoDLWbHP.AEQbTJ(c9818bck);
        interfaceC58184ywW.onNext(java.lang.Boolean.TRUE);
        interfaceC58184ywW.onComplete();
        return Unit.INSTANCE;
    }

    public static final void DbNXlk(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AEQbTJ(C12152chZ c12152chZ, InterfaceC58184ywW interfaceC58184ywW, java.lang.Throwable th) {
        c12152chZ.DLWbHP().AEQbTJ(new C9818bck(false, C33070mpX.AYXKKw(C13754dXa.FragmentManager.zqaRxl)));
        interfaceC58184ywW.onNext(java.lang.Boolean.TRUE);
        interfaceC58184ywW.onComplete();
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v10, resolved type: SignData */
    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: SignData */
    /* JADX WARN: Multi-variable type inference failed */
    public final DappBtcUtxoFeeReq KWHzl() {
        java.util.List<java.lang.String> listAhwBna;
        if (DbNXlk()) {
            java.lang.String psbtHex = ((BTCMessageSignData) QVsKAR()).getPsbtHex();
            if (psbtHex == null) {
                psbtHex = "";
            }
            listAhwBna = C56402yEa.EZpvd(psbtHex);
        } else if (!fetchVPNInfo() || (listAhwBna = ((BTCMessageSignData) QVsKAR()).getPsbtHexs()) == null) {
            listAhwBna = yDY.AhwBna();
        }
        return new DappBtcUtxoFeeReq(htlTjW(), listAhwBna, dHguZz().fetchVPNInfo(), (java.util.List) null, 8, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v12, resolved type: SignData */
    /* JADX DEBUG: Multi-variable search result rejected for r2v3, resolved type: SignData */
    /* JADX DEBUG: Multi-variable search result rejected for r2v6, resolved type: SignData */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractC8610bFv
    public java.lang.String AEQbTJ(boolean z) {
        if (DbNXlk()) {
            return ((BTCMessageSignData) QVsKAR()).getPsbtHex();
        }
        if (fetchVPNInfo()) {
            java.util.List<java.lang.String> psbtHexs = ((BTCMessageSignData) QVsKAR()).getPsbtHexs();
            if (psbtHexs != null) {
                return (java.lang.String) CollectionsKt___CollectionsKt.AkhnZx(psbtHexs, this.AEQbTJ);
            }
            return null;
        }
        return ((BTCMessageSignData) QVsKAR()).getSignStr();
    }

    @Override // com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction
    public AbstractC58185ywX<ResponseData<BatchBroadcastModel>> OLrzqt(@NotNull final java.lang.String str, SubmitTxExpandBean submitTxExpandBean) {
        Intrinsics.checkNotNullParameter(str, "");
        if (!isConnected()) {
            AbstractC58185ywX<ResponseData<BatchBroadcastModel>> abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(new ResponseData(-5006, null, null, null, null, null, 62, null));
            Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
            return abstractC58185ywXKWHzl;
        }
        AbstractC58185ywX abstractC58185ywXAEQbTJ = AbstractC58185ywX.AEQbTJ(new Callable() { // from class: o.cic
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return C12152chZ.copydefault(this.OLrzqt, str);
            }
        });
        final Function1 function1 = new Function1() { // from class: o.cii
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C12152chZ.OLrzqt((java.lang.Throwable) obj);
            }
        };
        AbstractC58185ywX<ResponseData<java.lang.String>> abstractC58185ywXDjBIcL = abstractC58185ywXAEQbTJ.djBIcL(new InterfaceC58229yxO() { // from class: o.cih
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C12152chZ.fetchVPNInfo(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXDjBIcL, "");
        return OLrzqt(abstractC58185ywXDjBIcL);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v11, resolved type: SignData */
    /* JADX DEBUG: Multi-variable search result rejected for r1v2, resolved type: SignData */
    /* JADX DEBUG: Multi-variable search result rejected for r1v7, resolved type: SignData */
    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: SignData */
    /* JADX WARN: Multi-variable type inference failed */
    public static final ResponseData copydefault(C12152chZ c12152chZ, java.lang.String str) {
        java.lang.String strOLrzqt;
        java.lang.String signStr;
        strOLrzqt = "";
        if (c12152chZ.DbNXlk()) {
            signStr = ((BTCMessageSignData) c12152chZ.QVsKAR()).getData();
            if (C33490mxT.OLrzqt(signStr) != null) {
                C54904xZq c54904xZq = C54904xZq.copydefault;
                JsonObject jsonObjectOLrzqt = C33490mxT.OLrzqt(signStr);
                Intrinsics.copydefault(jsonObjectOLrzqt);
                strOLrzqt = c54904xZq.OLrzqt(str, jsonObjectOLrzqt);
            }
        } else if (c12152chZ.fetchVPNInfo()) {
            signStr = ((BTCMessageSignData) c12152chZ.QVsKAR()).getData();
            if (C33490mxT.OLrzqt(signStr) != null) {
                C54904xZq c54904xZq2 = C54904xZq.copydefault;
                JsonObject jsonObjectOLrzqt2 = C33490mxT.OLrzqt(signStr);
                Intrinsics.copydefault(jsonObjectOLrzqt2);
                strOLrzqt = c54904xZq2.EZpvd(str, jsonObjectOLrzqt2);
            }
        } else {
            signStr = ((BTCMessageSignData) c12152chZ.QVsKAR()).getSignStr();
            if (signStr == null) {
                signStr = "";
            }
            C54904xZq c54904xZq3 = C54904xZq.copydefault;
            java.lang.String address = c12152chZ.fERRXa().getAddress();
            java.lang.String type = ((BTCMessageSignData) c12152chZ.QVsKAR()).getType();
            strOLrzqt = c54904xZq3.OLrzqt(str, address, signStr, type != null ? type : "");
        }
        java.lang.String str2 = strOLrzqt;
        if (C33129mqd.OLrzqt((java.lang.CharSequence) signStr) && str2.length() > 0) {
            return new ResponseData(-5001, null, null, null, str2, null, 46, null);
        }
        return new ResponseData(-5000, null, null, null, null, null, 62, null);
    }

    public static final ResponseData fetchVPNInfo(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (ResponseData) function1.invoke(obj);
    }

    public static final ResponseData OLrzqt(java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        C43296rmc.copydefault("OKWBTCSignMessage", "BTC sign failed", th);
        return new ResponseData(-5000, null, null, null, null, null, 62, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v2, resolved type: SignData */
    /* JADX DEBUG: Multi-variable search result rejected for r1v5, resolved type: SignData */
    /* JADX DEBUG: Multi-variable search result rejected for r1v9, resolved type: SignData */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction
    public AbstractC58185ywX<ResponseData<BatchBroadcastModel>> EZpvd(@NotNull java.lang.String str, SubmitTxExpandBean submitTxExpandBean) {
        AbstractC58185ywX<ResponseData<java.lang.String>> abstractC58185ywXKWHzl;
        Intrinsics.checkNotNullParameter(str, "");
        if (!isConnected()) {
            AbstractC58185ywX<ResponseData<BatchBroadcastModel>> abstractC58185ywXKWHzl2 = AbstractC58185ywX.KWHzl(new ResponseData(-5006, null, null, null, null, null, 62, null));
            Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl2, "");
            return abstractC58185ywXKWHzl2;
        }
        C10854bwM c10854bwMDHguZz = dHguZz();
        if (DbNXlk()) {
            abstractC58185ywXKWHzl = AEQbTJ(((BTCMessageSignData) QVsKAR()).getPsbtHex(), c10854bwMDHguZz, str);
        } else {
            abstractC58185ywXKWHzl = fetchVPNInfo() ? KWHzl(((BTCMessageSignData) QVsKAR()).getPsbtHexs(), c10854bwMDHguZz, str) : KWHzl(((BTCMessageSignData) QVsKAR()).getSignStr(), c10854bwMDHguZz, str);
        }
        final Function1 function1 = new Function1() { // from class: o.ciw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C12152chZ.KWHzl((java.lang.Throwable) obj);
            }
        };
        AbstractC58185ywX<ResponseData<java.lang.String>> abstractC58185ywXDjBIcL = abstractC58185ywXKWHzl.djBIcL(new InterfaceC58229yxO() { // from class: o.ciE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C12152chZ.values(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXDjBIcL, "");
        return OLrzqt(abstractC58185ywXDjBIcL);
    }

    public static final ResponseData values(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (ResponseData) function1.invoke(obj);
    }

    public static final ResponseData KWHzl(java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        C43296rmc.copydefault("OKWBTCSignMessage", "BTC sign failed", th);
        return new ResponseData(-5000, null, null, null, null, null, 62, null);
    }

    public final AbstractC58185ywX<ResponseData<java.lang.String>> AEQbTJ(java.lang.String str, C10854bwM c10854bwM, java.lang.String str2) {
        if (str == null || str.length() == 0) {
            AbstractC58185ywX<ResponseData<java.lang.String>> abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(new ResponseData(-5000, null, null, null, null, null, 62, null));
            Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
            return abstractC58185ywXKWHzl;
        }
        final MPCRawPsbtTx mPCRawPsbtTx = new MPCRawPsbtTx(str, fERRXa().getPublicKey(), (java.util.List) null, 4, (DefaultConstructorMarker) null);
        return C10965byR.OLrzqt.AEQbTJ(str2, dUDNAs(), c10854bwM, new Function0() { // from class: o.ciA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C12152chZ.AEQbTJ(mPCRawPsbtTx);
            }
        }, new Function1() { // from class: o.ciC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Boolean.valueOf(C12152chZ.fJNWhG((MPCBRC20PsbtResult) obj));
            }
        }, new Function1() { // from class: o.ciB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C12152chZ.ejfBZ((MPCBRC20PsbtResult) obj);
            }
        }, new Function1() { // from class: o.ciF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C12152chZ.fARcdN((MPCBRC20PsbtResult) obj);
            }
        }, new Function2() { // from class: o.ciD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C12152chZ.EZpvd(mPCRawPsbtTx, this, (java.lang.String) obj, (java.util.List) obj2);
            }
        }, new Function1() { // from class: o.ciG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Boolean.valueOf(C12152chZ.AuCTel((MPCBRC20PsbtResult) obj));
            }
        }, new Function1() { // from class: o.ciI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C12152chZ.fIwbmz((MPCBRC20PsbtResult) obj);
            }
        });
    }

    public static final MPCBRC20PsbtResult AEQbTJ(MPCRawPsbtTx mPCRawPsbtTx) {
        return C54904xZq.copydefault.copydefault(mPCRawPsbtTx);
    }

    public static final boolean fJNWhG(MPCBRC20PsbtResult mPCBRC20PsbtResult) {
        Intrinsics.checkNotNullParameter(mPCBRC20PsbtResult, "");
        java.util.List<java.lang.String> signHashList = mPCBRC20PsbtResult.getSignHashList();
        return !(signHashList == null || signHashList.isEmpty());
    }

    public static final java.lang.String ejfBZ(MPCBRC20PsbtResult mPCBRC20PsbtResult) {
        Intrinsics.checkNotNullParameter(mPCBRC20PsbtResult, "");
        KSerializer kSerializerListSerializer = BuiltinSerializersKt.ListSerializer(BuiltinSerializersKt.serializer(C56529yIt.KWHzl));
        java.util.List<java.lang.String> signHashList = mPCBRC20PsbtResult.getSignHashList();
        if (signHashList == null) {
            signHashList = yDY.AhwBna();
        }
        return C54907xZt.encodeToString$default(kSerializerListSerializer, signHashList, false, 2, null);
    }

    public static final boolean AuCTel(MPCBRC20PsbtResult mPCBRC20PsbtResult) {
        java.lang.String psbtTx = mPCBRC20PsbtResult != null ? mPCBRC20PsbtResult.getPsbtTx() : null;
        return !(psbtTx == null || psbtTx.length() == 0);
    }

    public static final java.lang.String fIwbmz(MPCBRC20PsbtResult mPCBRC20PsbtResult) {
        java.lang.String psbtTx = mPCBRC20PsbtResult != null ? mPCBRC20PsbtResult.getPsbtTx() : null;
        return psbtTx == null ? "" : psbtTx;
    }

    public final AbstractC58185ywX<ResponseData<java.lang.String>> KWHzl(final java.util.List<java.lang.String> list, C10854bwM c10854bwM, java.lang.String str) {
        if (list == null || list.isEmpty()) {
            AbstractC58185ywX<ResponseData<java.lang.String>> abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(new ResponseData(-5000, null, null, null, null, null, 62, null));
            Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
            return abstractC58185ywXKWHzl;
        }
        final java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(AEQbTJ((java.lang.String) it.next(), c10854bwM, str));
        }
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        AbstractC58185ywX<ResponseData<java.lang.String>> abstractC58185ywXCopydefault = AbstractC58185ywX.KWHzl(new InterfaceC58187ywZ() { // from class: o.cir
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58187ywZ
            public final void subscribe(InterfaceC58184ywW interfaceC58184ywW) {
                C12152chZ.OLrzqt(objectRef, arrayList, list, interfaceC58184ywW);
            }
        }, BackpressureStrategy.BUFFER).copydefault(new InterfaceC58222yxH() { // from class: o.ciz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58222yxH
            public final void run() {
                C12152chZ.OLrzqt(objectRef);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXCopydefault, "");
        return abstractC58185ywXCopydefault;
    }

    /* JADX WARN: Type inference failed for: r9v1, types: [T, o.yxC] */
    public static final void OLrzqt(Ref.ObjectRef objectRef, java.util.List list, final java.util.List list2, final InterfaceC58184ywW interfaceC58184ywW) {
        Intrinsics.checkNotNullParameter(interfaceC58184ywW, "");
        final java.util.ArrayList arrayList = new java.util.ArrayList();
        AbstractC58185ywX abstractC58185ywXAEQbTJ = AbstractC58185ywX.AEQbTJ((java.lang.Iterable) list);
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        objectRef.element = yBI.subscribeBy$default(abstractC58185ywXAEQbTJ, new Function1() { // from class: o.cie
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C12152chZ.OLrzqt(interfaceC58184ywW, (java.lang.Throwable) obj);
            }
        }, (Function0) null, new Function1() { // from class: o.cif
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C12152chZ.KWHzl(interfaceC58184ywW, arrayList, list2, (ResponseData) obj);
            }
        }, 2, (java.lang.Object) null);
    }

    public static final Unit KWHzl(InterfaceC58184ywW interfaceC58184ywW, java.util.ArrayList arrayList, java.util.List list, ResponseData responseData) {
        if (responseData.getCode() != -5001) {
            interfaceC58184ywW.onNext(new ResponseData(-5005, null, null, null, null, null, 62, null));
            interfaceC58184ywW.onComplete();
            return Unit.INSTANCE;
        }
        java.lang.String str = (java.lang.String) responseData.getData();
        if (str == null) {
            str = "";
        }
        arrayList.add(str);
        if (arrayList.size() == list.size()) {
            interfaceC58184ywW.onNext(new ResponseData(-5001, null, null, null, new GsonBuilder().disableHtmlEscaping().create().toJson(arrayList), null, 46, null));
            interfaceC58184ywW.onComplete();
        }
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(InterfaceC58184ywW interfaceC58184ywW, java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        interfaceC58184ywW.onError(th);
        interfaceC58184ywW.onComplete();
        return Unit.INSTANCE;
    }

    public static final void OLrzqt(Ref.ObjectRef objectRef) {
        InterfaceC58217yxC interfaceC58217yxC = (InterfaceC58217yxC) objectRef.element;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: SignData */
    /* JADX WARN: Multi-variable type inference failed */
    public final AbstractC58185ywX<ResponseData<java.lang.String>> KWHzl(java.lang.String str, C10854bwM c10854bwM, java.lang.String str2) {
        if (str == null || str.length() == 0) {
            AbstractC58185ywX<ResponseData<java.lang.String>> abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(new ResponseData(-5000, null, null, null, null, null, 62, null));
            Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
            return abstractC58185ywXKWHzl;
        }
        ChainAddress chainAddressFERRXa = fERRXa();
        java.lang.String type = ((BTCMessageSignData) QVsKAR()).getType();
        final MPCBtcMessage mPCBtcMessage = new MPCBtcMessage(str, type == null ? "" : type, chainAddressFERRXa.getAddress(), chainAddressFERRXa.getPublicKey(), (java.util.List) null, 16, (DefaultConstructorMarker) null);
        return C10965byR.OLrzqt.AEQbTJ(str2, dUDNAs(), c10854bwM, new Function0() { // from class: o.ciq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C12152chZ.copydefault(mPCBtcMessage);
            }
        }, new Function1() { // from class: o.cin
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Boolean.valueOf(C12152chZ.DbNXlk((MPCBRC20PsbtResult) obj));
            }
        }, new Function1() { // from class: o.cip
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C12152chZ.values((MPCBRC20PsbtResult) obj);
            }
        }, new Function1() { // from class: o.cit
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C12152chZ.isConnected((MPCBRC20PsbtResult) obj);
            }
        }, new Function2() { // from class: o.civ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C12152chZ.OLrzqt(mPCBtcMessage, this, (java.lang.String) obj, (java.util.List) obj2);
            }
        }, new Function1() { // from class: o.ciu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Boolean.valueOf(C12152chZ.AkhnZx((MPCBRC20PsbtResult) obj));
            }
        }, new Function1() { // from class: o.cis
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C12152chZ.fetchVPNInfo((MPCBRC20PsbtResult) obj);
            }
        });
    }

    public static final MPCBRC20PsbtResult copydefault(MPCBtcMessage mPCBtcMessage) {
        return C54904xZq.copydefault.KWHzl(mPCBtcMessage);
    }

    public static final boolean DbNXlk(MPCBRC20PsbtResult mPCBRC20PsbtResult) {
        Intrinsics.checkNotNullParameter(mPCBRC20PsbtResult, "");
        java.util.List<java.lang.String> signHashList = mPCBRC20PsbtResult.getSignHashList();
        return !(signHashList == null || signHashList.isEmpty());
    }

    public static final java.lang.String values(MPCBRC20PsbtResult mPCBRC20PsbtResult) {
        Intrinsics.checkNotNullParameter(mPCBRC20PsbtResult, "");
        KSerializer kSerializerListSerializer = BuiltinSerializersKt.ListSerializer(BuiltinSerializersKt.serializer(C56529yIt.KWHzl));
        java.util.List<java.lang.String> signHashList = mPCBRC20PsbtResult.getSignHashList();
        if (signHashList == null) {
            signHashList = yDY.AhwBna();
        }
        return C54907xZt.encodeToString$default(kSerializerListSerializer, signHashList, false, 2, null);
    }

    public static final boolean AkhnZx(MPCBRC20PsbtResult mPCBRC20PsbtResult) {
        java.lang.String psbtTx = mPCBRC20PsbtResult != null ? mPCBRC20PsbtResult.getPsbtTx() : null;
        return !(psbtTx == null || psbtTx.length() == 0);
    }

    public static final java.lang.String fetchVPNInfo(MPCBRC20PsbtResult mPCBRC20PsbtResult) {
        java.lang.String psbtTx = mPCBRC20PsbtResult != null ? mPCBRC20PsbtResult.getPsbtTx() : null;
        return psbtTx == null ? "" : psbtTx;
    }

    public static final ResponseData djBIcL(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (ResponseData) function1.invoke(obj);
    }

    /* JADX DEBUG: Type inference failed for r3v1. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<com.okinc.network.okg.response.ResponseData<com.okinc.business.defi.biz.core.transaction.bean.BatchBroadcastModel>> */
    public final AbstractC58185ywX<ResponseData<BatchBroadcastModel>> OLrzqt(AbstractC58185ywX<ResponseData<java.lang.String>> abstractC58185ywX) {
        final Function1 function1 = new Function1() { // from class: o.cix
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C12152chZ.copydefault(this.copydefault, (ResponseData) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXAEQbTJ = abstractC58185ywX.AEQbTJ(new InterfaceC58229yxO() { // from class: o.ciy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C12152chZ.djBIcL(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        return abstractC58185ywXAEQbTJ;
    }

    public static final ResponseData copydefault(C12152chZ c12152chZ, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == -5001 && C33129mqd.OLrzqt((java.lang.CharSequence) responseData.getData())) {
            java.lang.String str = (java.lang.String) responseData.getData();
            return new ResponseData(-5001, null, null, null, new BatchBroadcastModel(C56402yEa.EZpvd(AbstractC8610bFv.generateCommonBroadcastModel$default(c12152chZ, str != null ? str : "", null, 2, null)), (java.util.List) null, (java.lang.Boolean) null, (java.lang.String) null, (java.lang.Boolean) null, (java.lang.Integer) null, (java.lang.String) null, (SignAuthType) null, 254, (DefaultConstructorMarker) null), null, 46, null);
        }
        return new ResponseData(-5005, null, null, null, null, null, 62, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: SignData */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractC8610bFv, com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction
    public AbstractC58185ywX<ResponseData<DappTxResultBean>> copydefault(@NotNull BatchBroadcastModel batchBroadcastModel, SubmitTxExpandBean submitTxExpandBean) {
        AbstractC58185ywX<ResponseData<DappTxResultBean>> abstractC58185ywXKWHzl;
        Intrinsics.checkNotNullParameter(batchBroadcastModel, "");
        if (DbNXlk() && Intrinsics.EZpvd(((BTCMessageSignData) QVsKAR()).getNeedBroadcast(), java.lang.Boolean.TRUE)) {
            BroadcastBean broadcastBean = (BroadcastBean) CollectionsKt___CollectionsKt.firstOrNull(batchBroadcastModel.getTxList());
            java.lang.String signedTx = broadcastBean != null ? broadcastBean.getSignedTx() : null;
            final java.lang.String str = signedTx != null ? signedTx : "";
            xYW xyw = xYW.AEQbTJ;
            java.lang.String strAhwBna = xyw.AhwBna(str);
            if (strAhwBna.length() > 0) {
                final java.lang.String strOLrzqt = xyw.OLrzqt(strAhwBna, dHguZz().QKVWgx());
                AbstractC58185ywX<ResponseData<java.lang.String>> abstractC58185ywXAEQbTJ = ((InterfaceC9854bdT) C43251rlk.copydefault(InterfaceC9854bdT.class)).AEQbTJ(Dmq(), new SimpleSubmitTxReq(strOLrzqt, strAhwBna, htlTjW(), dmfpNf(), QwvEab()));
                final Function1 function1 = new Function1() { // from class: o.chY
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C12152chZ.EZpvd(strOLrzqt, str, (ResponseData) obj);
                    }
                };
                abstractC58185ywXKWHzl = abstractC58185ywXAEQbTJ.AEQbTJ(new InterfaceC58229yxO() { // from class: o.cio
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.InterfaceC58229yxO
                    public final java.lang.Object apply(java.lang.Object obj) {
                        return C12152chZ.valueOf(function1, obj);
                    }
                });
            } else {
                abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(new ResponseData(-5005, null, null, null, null, null, 62, null));
            }
            Intrinsics.copydefault(abstractC58185ywXKWHzl);
            return abstractC58185ywXKWHzl;
        }
        return super.copydefault(batchBroadcastModel, submitTxExpandBean);
    }

    public static final ResponseData valueOf(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (ResponseData) function1.invoke(obj);
    }

    public static final ResponseData EZpvd(java.lang.String str, java.lang.String str2, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        return new ResponseData(responseData.getCode(), responseData.getMsg(), null, null, new DappTxResultBean((java.lang.String) null, (java.lang.String) null, str, str2, (java.lang.Boolean) null, (java.lang.Boolean) null, (java.lang.String) null, 115, (DefaultConstructorMarker) null), null, 44, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: SignData */
    /* JADX WARN: Multi-variable type inference failed */
    public final boolean DbNXlk() {
        return Intrinsics.EZpvd((java.lang.Object) ((BTCMessageSignData) QVsKAR()).getMethod(), (java.lang.Object) "btc_psbt");
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: SignData */
    /* JADX WARN: Multi-variable type inference failed */
    public final boolean fetchVPNInfo() {
        return Intrinsics.EZpvd((java.lang.Object) ((BTCMessageSignData) QVsKAR()).getMethod(), (java.lang.Object) "btc_psbts");
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: SignData */
    /* JADX WARN: Multi-variable type inference failed */
    public final boolean valueOf() {
        return Intrinsics.EZpvd((java.lang.Object) ((BTCMessageSignData) QVsKAR()).getMethod(), (java.lang.Object) "btc_message");
    }

    public final boolean isConnected() {
        return DbNXlk() || fetchVPNInfo() || valueOf();
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0072  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean djBIcL() {
        DappBTCUTXOInfo dappBTCUTXOInfo;
        java.lang.Object next;
        if (DbNXlk() || fetchVPNInfo()) {
            java.util.List<DappBTCUTXOAllInfo> list = this.copydefault;
            java.lang.Object obj = null;
            if (list != null) {
                java.util.Iterator<T> it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    java.lang.Object next2 = it.next();
                    java.util.List<DappBTCUTXOInfo> inputInfo = ((DappBTCUTXOAllInfo) next2).getInputInfo();
                    if (inputInfo != null) {
                        java.util.Iterator<T> it2 = inputInfo.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it2.next();
                            java.util.List<DappBTCXRCAssets> xrcAssets = ((DappBTCUTXOInfo) next).getXrcAssets();
                            if (xrcAssets != null) {
                                java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(xrcAssets, 10));
                                java.util.Iterator<T> it3 = xrcAssets.iterator();
                                while (it3.hasNext()) {
                                    arrayList.add(((DappBTCXRCAssets) it3.next()).getProtocolId());
                                }
                                java.util.HashSet hashSetQKudOq = CollectionsKt___CollectionsKt.QKudOq(arrayList);
                                java.lang.Integer numValueOf = hashSetQKudOq != null ? java.lang.Integer.valueOf(hashSetQKudOq.size()) : null;
                                if (C33129mqd.AEQbTJ(numValueOf, 1)) {
                                    break;
                                }
                            }
                        }
                        dappBTCUTXOInfo = (DappBTCUTXOInfo) next;
                    } else {
                        dappBTCUTXOInfo = null;
                    }
                    if (dappBTCUTXOInfo != null) {
                        obj = next2;
                        break;
                    }
                }
                obj = (DappBTCUTXOAllInfo) obj;
            }
            if (obj != null) {
                return true;
            }
        }
        return false;
    }

    public final boolean AhwBna() {
        java.util.List<DappBTCUTXOAllInfo> list;
        java.util.List<DappBTCUTXOInfo> outputInfo;
        java.util.List<DappBTCXRCAssets> xrcAssets;
        java.util.List<DappBTCXRCAssets> xrcAssets2;
        if (DbNXlk() && (list = this.copydefault) != null) {
            for (DappBTCUTXOAllInfo dappBTCUTXOAllInfo : list) {
                java.util.HashMap map = new java.util.HashMap();
                java.util.List<DappBTCUTXOInfo> inputInfo = dappBTCUTXOAllInfo.getInputInfo();
                if (inputInfo != null) {
                    for (DappBTCUTXOInfo dappBTCUTXOInfo : inputInfo) {
                        java.util.List<java.lang.String> address = dappBTCUTXOInfo.getAddress();
                        if (address != null && address.contains(htlTjW()) && (xrcAssets2 = dappBTCUTXOInfo.getXrcAssets()) != null) {
                            for (DappBTCXRCAssets dappBTCXRCAssets : xrcAssets2) {
                                java.lang.Integer protocolId = dappBTCXRCAssets.getProtocolId();
                                if (protocolId != null) {
                                    int iIntValue = protocolId.intValue();
                                    if (map.get(java.lang.Integer.valueOf(iIntValue)) == null) {
                                        map.put(java.lang.Integer.valueOf(iIntValue), new java.util.HashSet());
                                    }
                                    java.util.HashSet hashSet = (java.util.HashSet) map.get(java.lang.Integer.valueOf(iIntValue));
                                    if (hashSet != null) {
                                        java.lang.String symbol = dappBTCXRCAssets.getSymbol();
                                        if (symbol == null) {
                                            symbol = "";
                                        }
                                        hashSet.add(symbol);
                                    }
                                }
                            }
                        }
                    }
                }
                if (!map.isEmpty() && (outputInfo = dappBTCUTXOAllInfo.getOutputInfo()) != null) {
                    for (DappBTCUTXOInfo dappBTCUTXOInfo2 : outputInfo) {
                        java.util.List<java.lang.String> address2 = dappBTCUTXOInfo2.getAddress();
                        if (address2 != null && address2.contains(htlTjW()) && (xrcAssets = dappBTCUTXOInfo2.getXrcAssets()) != null) {
                            for (DappBTCXRCAssets dappBTCXRCAssets2 : xrcAssets) {
                                java.lang.Integer protocolId2 = dappBTCXRCAssets2.getProtocolId();
                                if (protocolId2 != null) {
                                    java.util.HashSet hashSet2 = (java.util.HashSet) map.get(java.lang.Integer.valueOf(protocolId2.intValue()));
                                    if (hashSet2 == null) {
                                        return true;
                                    }
                                    java.lang.String symbol2 = dappBTCXRCAssets2.getSymbol();
                                    if (symbol2 == null) {
                                        symbol2 = "";
                                    }
                                    if (!hashSet2.contains(symbol2)) {
                                        return true;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final boolean AkhnZx() {
        DappBTCUTXOAllInfo dappBTCUTXOAllInfoOLrzqt;
        return (DbNXlk() || fetchVPNInfo()) && (dappBTCUTXOAllInfoOLrzqt = OLrzqt()) != null && Intrinsics.EZpvd(dappBTCUTXOAllInfoOLrzqt.isShowFee(), java.lang.Boolean.TRUE);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: SignData */
    /* JADX WARN: Multi-variable type inference failed */
    public final boolean values() {
        if (fetchVPNInfo()) {
            java.util.List<java.lang.String> psbtHexs = ((BTCMessageSignData) QVsKAR()).getPsbtHexs();
            if (C33129mqd.AEQbTJ(psbtHexs != null ? java.lang.Integer.valueOf(psbtHexs.size()) : null, 1)) {
                return true;
            }
        }
        return false;
    }

    public final DappBTCUTXOAllInfo OLrzqt() {
        java.util.List<DappBTCUTXOAllInfo> list;
        if (DbNXlk()) {
            java.util.List<DappBTCUTXOAllInfo> list2 = this.copydefault;
            if (list2 != null) {
                return (DappBTCUTXOAllInfo) CollectionsKt___CollectionsKt.firstOrNull(list2);
            }
        } else if (fetchVPNInfo() && (list = this.copydefault) != null) {
            return (DappBTCUTXOAllInfo) CollectionsKt___CollectionsKt.AkhnZx(list, this.AEQbTJ);
        }
        return null;
    }

    @Override // o.AbstractC8610bFv, com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction
    public void AEQbTJ(@NotNull java.util.List<TxToastCheckRes> list) {
        java.util.List<java.lang.String> causeRiskItem;
        Intrinsics.checkNotNullParameter(list, "");
        boolean z = true;
        for (TxToastCheckRes txToastCheckRes : list) {
            java.lang.Integer checkType = txToastCheckRes.getCheckType();
            if (checkType != null && checkType.intValue() == 9 && (causeRiskItem = txToastCheckRes.getCauseRiskItem()) != null && causeRiskItem.contains(TxToastCheckRes.FROM_RISK_REJECT)) {
                z = false;
            }
        }
        DLWbHP().AEQbTJ(new C9788bcG(z, true));
    }

    public static final MPCBRC20PsbtResult EZpvd(MPCRawPsbtTx mPCRawPsbtTx, C12152chZ c12152chZ, java.lang.String str, java.util.List list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(c12152chZ.OLrzqt.KWHzl((RSV) it.next()));
        }
        return C54904xZq.copydefault.KWHzl(MPCRawPsbtTx.copy$default(mPCRawPsbtTx, null, null, arrayList, 3, null));
    }

    public static final MPCBRC20PsbtResult OLrzqt(MPCBtcMessage mPCBtcMessage, C12152chZ c12152chZ, java.lang.String str, java.util.List list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(c12152chZ.OLrzqt.KWHzl((RSV) it.next()));
        }
        return C54904xZq.copydefault.copydefault(MPCBtcMessage.copy$default(mPCBtcMessage, null, null, null, null, arrayList, 15, null));
    }
}
