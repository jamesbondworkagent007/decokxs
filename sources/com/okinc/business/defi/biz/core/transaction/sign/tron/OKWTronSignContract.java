package com.okinc.business.defi.biz.core.transaction.sign.tron;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.reflect.TypeToken;
import com.okinc.business.defi.api.model.tx.SignAuthType;
import com.okinc.business.defi.api.model.tx.SubmitTxExpandBean;
import com.okinc.business.defi.api.model.tx.signdata.SignDataArgs;
import com.okinc.business.defi.api.model.tx.signdata.TronContractSignData;
import com.okinc.business.defi.biz.core.transaction.bean.BatchBroadcastModel;
import com.okinc.business.defi.biz.core.transaction.bean.BroadcastBean;
import com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction;
import com.okinc.business.defi.biz.core.transaction.sign.tron.OKWTronSignContract;
import com.okinc.business.defi.biz.core.transaction.sign.tron.bean.TronSignInfo;
import com.okinc.business.defi.biz.net.bean.AuthGroups;
import com.okinc.business.defi.biz.net.bean.BeforeAndAfterPermission;
import com.okinc.business.defi.biz.net.bean.Permission;
import com.okinc.business.defi.biz.net.bean.PermissionDetail;
import com.okinc.business.defi.biz.net.bean.SignInfo;
import com.okinc.business.defi.biz.net.bean.SignInfoReq;
import com.okinc.business.defi.biz.net.bean.TxToastCheckReq;
import com.okinc.business.defi.biz.net.bean.TxToastCheckRes;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.wallet.core.sign.SignedTx;
import com.okinc.wallet.core.sign.TxMessage;
import com.okinc.wallet.core.sign.tron.SignedTransaction;
import com.okinc.wallet.core.sign.utxo.RSV;
import io.reactivex.BackpressureStrategy;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.json.Json;
import o.AbstractC12782ctV;
import o.AbstractC58185ywX;
import o.AbstractC8601bFm;
import o.AbstractC9832bcy;
import o.C10854bwM;
import o.C10965byR;
import o.C11987ceT;
import o.C12764ctD;
import o.C13934dbu;
import o.C33129mqd;
import o.C33488mxR;
import o.C33489mxS;
import o.C56390yDp;
import o.C56391yDq;
import o.C56392yDr;
import o.C56402yEa;
import o.C56423yEv;
import o.C58266yxz;
import o.C8429bCZ;
import o.C8497bDo;
import o.C9838bdD;
import o.C9839bdE;
import o.InterfaceC56387yDm;
import o.InterfaceC58184ywW;
import o.InterfaceC58187ywZ;
import o.InterfaceC58223yxI;
import o.InterfaceC58229yxO;
import o.InterfaceC60096zvd;
import o.xYW;
import o.yBP;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public class OKWTronSignContract<SignData extends TronContractSignData> extends AbstractC8601bFm<C8429bCZ, SignData> {
    public TronSignInfo OcIXYQ;
    public TronContractSignData djBIcL;
    public final InterfaceC56387yDm valueOf = C56392yDr.copydefault(new Function0() { // from class: o.cdY
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return OKWTronSignContract.copydefault(this.EZpvd);
        }
    });
    public final InterfaceC56387yDm fetchVPNInfo = C56392yDr.copydefault(new Function0() { // from class: o.cdW
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return OKWTronSignContract.AhwBna(this.AEQbTJ);
        }
    });
    public HashSet<String> ORxRYg = new HashSet<>();
    public String QVAiDq = "";
    public String AhwBna = "0";

    public final /* synthetic */ class Activity {
        public static final /* synthetic */ int[] OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[OKWBaseTransaction.TransactionType.values().length];
            try {
                iArr[OKWBaseTransaction.TransactionType.Approve.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OKWBaseTransaction.TransactionType.CancelApprove.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[OKWBaseTransaction.TransactionType.Contract.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[OKWBaseTransaction.TransactionType.DappTransfer.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            OLrzqt = iArr;
        }
    }

    @Override // o.AbstractC8564bFB
    public boolean DCUTEI() {
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final HashSet<String> DcqEDu() {
        return this.ORxRYg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction
    public String ag_() {
        return "";
    }

    public String fARcdN() {
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String flVtFt() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Method merged with bridge method: DXXBbs()Lo/bCW; */
    @Override // o.AbstractC8564bFB
    /* JADX INFO: renamed from: giSNqX, reason: merged with bridge method [inline-methods] */
    public C8429bCZ fJNWhG() {
        return (C8429bCZ) this.valueOf.getValue();
    }

    public static final C8429bCZ copydefault(OKWTronSignContract oKWTronSignContract) {
        return new C8429bCZ(oKWTronSignContract);
    }

    public final C11987ceT iZzfmt() {
        return (C11987ceT) this.fetchVPNInfo.getValue();
    }

    public static final C11987ceT AhwBna(OKWTronSignContract oKWTronSignContract) {
        return new C11987ceT(oKWTronSignContract);
    }

    @Override // o.AbstractC8564bFB, com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction
    public boolean KWHzl(@NotNull AbstractC12782ctV abstractC12782ctV, @NotNull C10854bwM c10854bwM, @NotNull SignDataArgs<SignData> signDataArgs) {
        OKWBaseTransaction.TransactionType transactionType;
        Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
        Intrinsics.checkNotNullParameter(c10854bwM, "");
        Intrinsics.checkNotNullParameter(signDataArgs, "");
        boolean zKWHzl = super.KWHzl(abstractC12782ctV, c10854bwM, signDataArgs);
        String inputData$default = AbstractC8601bFm.getInputData$default(this, false, 1, null);
        if ((inputData$default != null ? inputData$default : "").length() == 0) {
            transactionType = OKWBaseTransaction.TransactionType.DappTransfer;
        } else {
            transactionType = OKWBaseTransaction.TransactionType.Contract;
        }
        OLrzqt(transactionType);
        return zKWHzl;
    }

    public final TronSignInfo DGOPHZ() {
        TronSignInfo tronSignInfo = this.OcIXYQ;
        if (tronSignInfo != null) {
            return tronSignInfo;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    @Override // o.AbstractC8601bFm, o.AbstractC8564bFB
    public boolean q_() {
        UrRBLY();
        super.q_();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Pair copydefault(Function2 function2, Object obj, Object obj2) {
        Intrinsics.checkNotNullParameter(obj, "");
        Intrinsics.checkNotNullParameter(obj2, "");
        return (Pair) function2.invoke(obj, obj2);
    }

    @Override // o.AbstractC8601bFm, o.AbstractC8564bFB
    public AbstractC58185ywX<Pair<Boolean, String>> r_() {
        AbstractC58185ywX<Pair<Boolean, String>> abstractC58185ywXR_ = super.r_();
        AbstractC58185ywX<Pair<Boolean, String>> abstractC58185ywXDWgRXt = DWgRXt();
        final Function2 function2 = new Function2() { // from class: o.cdL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return OKWTronSignContract.copydefault(this.AEQbTJ, (kotlin.Pair) obj, (kotlin.Pair) obj2);
            }
        };
        AbstractC58185ywX<Pair<Boolean, String>> abstractC58185ywXEZpvd = AbstractC58185ywX.EZpvd(abstractC58185ywXR_, abstractC58185ywXDWgRXt, new InterfaceC58223yxI() { // from class: o.cdP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58223yxI
            public final java.lang.Object apply(java.lang.Object obj, java.lang.Object obj2) {
                return OKWTronSignContract.copydefault(function2, obj, obj2);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXEZpvd, "");
        return abstractC58185ywXEZpvd;
    }

    public static final Pair copydefault(OKWTronSignContract oKWTronSignContract, Pair pair, Pair pair2) {
        Intrinsics.checkNotNullParameter(pair, "");
        Intrinsics.checkNotNullParameter(pair2, "");
        if (!((Boolean) pair.getFirst()).booleanValue()) {
            return pair;
        }
        if (!((Boolean) pair2.getFirst()).booleanValue()) {
            return pair2;
        }
        C8429bCZ c8429bCZFJNWhG = oKWTronSignContract.fJNWhG();
        String fee = oKWTronSignContract.DGOPHZ().getFee();
        c8429bCZFJNWhG.EZpvd(fee != null ? fee : "");
        oKWTronSignContract.fJNWhG().KWHzl(0);
        return C56390yDp.OLrzqt(Boolean.TRUE, null);
    }

    @Override // o.AbstractC8601bFm, com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction
    public ArrayList<Integer> getNewProxyInstance() {
        ArrayList<Integer> newProxyInstance = super.getNewProxyInstance();
        newProxyInstance.add(9);
        int iQwvEab = QwvEab();
        if ((iQwvEab == 2 || iQwvEab == 3 || iQwvEab == 5 || iQwvEab == 7) && newProxyInstance.contains(2)) {
            newProxyInstance.remove((Object) 2);
        }
        return newProxyInstance;
    }

    @Override // o.AbstractC8601bFm, o.AbstractC8564bFB, com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction
    public TxToastCheckReq i_() {
        TxToastCheckReq txToastCheckReqI_ = super.i_();
        String raw_data_hex = gasjUx().getRaw_data_hex();
        if (raw_data_hex == null) {
            raw_data_hex = "";
        }
        txToastCheckReqI_.setAdditionalData(C56423yEv.EZpvd(C56390yDp.OLrzqt("tronHexData", raw_data_hex)));
        return txToastCheckReqI_;
    }

    public final void UrRBLY() {
        List<TronContractSignData.Contract> contract;
        TronContractSignData.Contract contract2;
        TronContractSignData.Parameter parameter;
        TronContractSignData.Value value;
        Boolean visible = QVsKAR().getVisible();
        Boolean bool = Boolean.TRUE;
        if (Intrinsics.EZpvd(visible, bool)) {
            this.djBIcL = QVsKAR();
            return;
        }
        SignData signdataQVsKAR = QVsKAR();
        signdataQVsKAR.setVisible(bool);
        TronContractSignData.RawData raw_data = signdataQVsKAR.getRaw_data();
        if (raw_data != null && (contract = raw_data.getContract()) != null && (contract2 = (TronContractSignData.Contract) CollectionsKt___CollectionsKt.firstOrNull(contract)) != null && (parameter = contract2.getParameter()) != null && (value = parameter.getValue()) != null) {
            xYW xyw = xYW.AEQbTJ;
            String owner_address = value.getOwner_address();
            if (owner_address == null) {
                owner_address = "";
            }
            value.setOwner_address(xyw.isConnected(owner_address));
            String contract_address = value.getContract_address();
            if (contract_address == null) {
                contract_address = "";
            }
            value.setContract_address(xyw.isConnected(contract_address));
            String to_address = value.getTo_address();
            value.setTo_address(xyw.isConnected(to_address != null ? to_address : ""));
        }
        this.djBIcL = signdataQVsKAR;
    }

    /* JADX DEBUG: Type inference failed for r1v2. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> */
    public final AbstractC58185ywX<Pair<Boolean, String>> DWgRXt() {
        C13934dbu c13934dbuOFhtUX = OFhtUX();
        String strOxVOHk = OxVOHk();
        String strDmq = Dmq();
        long jRcXXUw = RcXXUw();
        String address = fERRXa().getAddress();
        String strZLjUOn = zLjUOn();
        int iFHqPtx = fHqPtx();
        String inputData$default = AbstractC8601bFm.getInputData$default(this, false, 1, null);
        String strZuBGHE = zuBGHE();
        TronContractSignData.Value valueFvQaOB = fvQaOB();
        Long call_value = valueFvQaOB != null ? valueFvQaOB.getCall_value() : null;
        TronContractSignData.RawData raw_data = gasjUx().getRaw_data();
        Long fee_limit = raw_data != null ? raw_data.getFee_limit() : null;
        AbstractC58185ywX<ResponseData<SignInfo>> abstractC58185ywXCopydefault = c13934dbuOFhtUX.copydefault(strOxVOHk, strDmq, new SignInfoReq(String.valueOf(jRcXXUw), address, strZLjUOn, iFHqPtx, inputData$default, strZuBGHE, (String) null, (Integer) null, call_value, fee_limit, gasjUx().getFunctionSelector(), Integer.valueOf(C33129mqd.AhwBna(this.AhwBna)), gasjUx().getVisible(), 192, (DefaultConstructorMarker) null));
        final Function1 function1 = new Function1() { // from class: o.cec
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return OKWTronSignContract.EZpvd(this.KWHzl, (ResponseData) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXAEQbTJ = abstractC58185ywXCopydefault.AEQbTJ(new InterfaceC58229yxO() { // from class: o.cea
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return OKWTronSignContract.fvQaOB(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        return abstractC58185ywXAEQbTJ;
    }

    public static final Pair fvQaOB(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (Pair) function1.invoke(obj);
    }

    public long RcXXUw() {
        return dHguZz().AhwBna();
    }

    public final int fHqPtx() {
        int i = Activity.OLrzqt[aUsmxb().ordinal()];
        if (i == 1 || i == 2) {
            return 4;
        }
        if (i != 3) {
            return i != 4 ? 0 : 6;
        }
        return 3;
    }

    @Override // o.AbstractC8601bFm
    public String zuBGHE() {
        TronContractSignData.Value valueFvQaOB = fvQaOB();
        if (valueFvQaOB == null) {
            valueFvQaOB = new TronContractSignData.Value(null, null, null, null, null, null, 63, null);
        }
        if (aUsmxb() == OKWBaseTransaction.TransactionType.DappTransfer) {
            return C33129mqd.gEmmrt(valueFvQaOB.getAmount());
        }
        return C33129mqd.gEmmrt(valueFvQaOB.getCall_value());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Pair copydefault(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (Pair) function1.invoke(obj);
    }

    /* JADX DEBUG: Type inference failed for r0v1. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> */
    @Override // o.AbstractC8564bFB
    public AbstractC58185ywX<Pair<Boolean, String>> ffGIBT() {
        AbstractC58185ywX<Pair<Boolean, String>> abstractC58185ywXDWgRXt = DWgRXt();
        final Function1 function1 = new Function1() { // from class: o.cdS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return OKWTronSignContract.OLrzqt(this.KWHzl, (kotlin.Pair) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXAEQbTJ = abstractC58185ywXDWgRXt.AEQbTJ(new InterfaceC58229yxO() { // from class: o.cdZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return OKWTronSignContract.copydefault(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        return abstractC58185ywXAEQbTJ;
    }

    public static final Pair OLrzqt(OKWTronSignContract oKWTronSignContract, Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        if (((Boolean) pair.getFirst()).booleanValue()) {
            C8429bCZ c8429bCZFJNWhG = oKWTronSignContract.fJNWhG();
            String fee = oKWTronSignContract.DGOPHZ().getFee();
            c8429bCZFJNWhG.EZpvd(fee != null ? fee : "");
            oKWTronSignContract.fJNWhG().KWHzl(1);
        }
        return pair;
    }

    @Override // o.AbstractC8601bFm, o.AbstractC8564bFB
    public void OLrzqt(@NotNull List<TxToastCheckRes> list) {
        Intrinsics.checkNotNullParameter(list, "");
        super.OLrzqt(list);
        for (TxToastCheckRes txToastCheckRes : list) {
            Integer checkType = txToastCheckRes.getCheckType();
            if (checkType != null && checkType.intValue() == 1) {
                Integer trxPermissionId = txToastCheckRes.getTrxPermissionId();
                this.AhwBna = String.valueOf(trxPermissionId != null ? trxPermissionId.intValue() : 0);
            }
        }
    }

    @Override // o.AbstractC8601bFm, com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction
    public void AEQbTJ(@NotNull List<TxToastCheckRes> list) {
        Integer numValueOf;
        Object next;
        String strOLrzqt;
        Permission after;
        List<PermissionDetail> detail;
        Permission after2;
        List<PermissionDetail> detail2;
        List<BeforeAndAfterPermission> list2;
        Intrinsics.checkNotNullParameter(list, "");
        super.AEQbTJ(list);
        Iterator<T> it = list.iterator();
        while (true) {
            numValueOf = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            Integer checkType = ((TxToastCheckRes) next).getCheckType();
            if (checkType != null && checkType.intValue() == 9) {
                break;
            }
        }
        TxToastCheckRes txToastCheckRes = (TxToastCheckRes) next;
        if (txToastCheckRes == null) {
            return;
        }
        Map<String, List<BeforeAndAfterPermission>> permissions = txToastCheckRes.getPermissions();
        BeforeAndAfterPermission beforeAndAfterPermission = (permissions == null || (list2 = permissions.get(fERRXa().getAddress())) == null) ? null : (BeforeAndAfterPermission) CollectionsKt___CollectionsKt.firstOrNull(list2);
        if (beforeAndAfterPermission != null && (after2 = beforeAndAfterPermission.getAfter()) != null && (detail2 = after2.getDetail()) != null) {
            numValueOf = Integer.valueOf(detail2.size());
        }
        boolean zValueOf = C33129mqd.valueOf(numValueOf, 0);
        if (beforeAndAfterPermission != null) {
            C12764ctD c12764ctD = C12764ctD.OLrzqt;
            String json = new Gson().toJson(beforeAndAfterPermission);
            Intrinsics.checkNotNullExpressionValue(json, "");
            strOLrzqt = c12764ctD.OLrzqt(json);
        } else {
            strOLrzqt = "";
        }
        this.QVAiDq = strOLrzqt;
        if (beforeAndAfterPermission != null && (after = beforeAndAfterPermission.getAfter()) != null && (detail = after.getDetail()) != null) {
            Iterator<T> it2 = detail.iterator();
            while (it2.hasNext()) {
                List<AuthGroups> authGrous = ((PermissionDetail) it2.next()).getAuthGrous();
                if (authGrous != null) {
                    for (AuthGroups authGroups : authGrous) {
                        if (C33129mqd.OLrzqt((CharSequence) authGroups.getAddress())) {
                            HashSet<String> hashSet = this.ORxRYg;
                            String address = authGroups.getAddress();
                            if (address == null) {
                                address = "";
                            }
                            hashSet.add(address);
                        }
                    }
                }
            }
        }
        C8497bDo c8497bDoDLWbHP = DLWbHP();
        AbstractC9832bcy[] abstractC9832bcyArr = new AbstractC9832bcy[2];
        String permissionMsg = txToastCheckRes.getPermissionMsg();
        abstractC9832bcyArr[0] = new C9838bdD(zValueOf, permissionMsg != null ? permissionMsg : "");
        abstractC9832bcyArr[1] = new C9839bdE(zValueOf);
        c8497bDoDLWbHP.OLrzqt(yDY.gEmmrt(abstractC9832bcyArr));
    }

    @Override // o.AbstractC8601bFm, o.AbstractC8564bFB
    public ArrayList<Integer> AuCTelauCTel() {
        ArrayList<Integer> arrayListAuCTelauCTel = super.AuCTelauCTel();
        arrayListAuCTelauCTel.add(1);
        return arrayListAuCTelauCTel;
    }

    public static final Unit flVtFt(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (Unit) function1.invoke(obj);
    }

    /* JADX DEBUG: Type inference failed for r0v1. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<kotlin.Unit> */
    @Override // o.AbstractC8601bFm, o.AbstractC8564bFB
    public AbstractC58185ywX<Unit> p_() {
        AbstractC58185ywX<Pair<Boolean, String>> abstractC58185ywXDWgRXt = DWgRXt();
        final Function1 function1 = new Function1() { // from class: o.cee
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return OKWTronSignContract.AEQbTJ(this.AEQbTJ, (kotlin.Pair) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXAEQbTJ = abstractC58185ywXDWgRXt.AEQbTJ(new InterfaceC58229yxO() { // from class: o.ceb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return OKWTronSignContract.flVtFt(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        return abstractC58185ywXAEQbTJ;
    }

    public static final Unit AEQbTJ(OKWTronSignContract oKWTronSignContract, Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        if (((Boolean) pair.getFirst()).booleanValue()) {
            C8429bCZ c8429bCZFJNWhG = oKWTronSignContract.fJNWhG();
            String fee = oKWTronSignContract.DGOPHZ().getFee();
            c8429bCZFJNWhG.EZpvd(fee != null ? fee : "");
            oKWTronSignContract.fJNWhG().KWHzl(3);
        }
        return Unit.INSTANCE;
    }

    public static final InterfaceC60096zvd giSNqX(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    @Override // o.AbstractC8564bFB
    public AbstractC58185ywX<Pair<Boolean, String>> DbNXlk(@NotNull final String str) {
        AbstractC58185ywX abstractC58185ywXKWHzl;
        Intrinsics.checkNotNullParameter(str, "");
        TronSignInfo tronSignInfoDGOPHZ = DGOPHZ();
        if (tronSignInfoDGOPHZ == null || str.length() == 0) {
            abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(tronSignInfoDGOPHZ);
            Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        } else {
            abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(new StateListAnimator(tronSignInfoDGOPHZ, str), BackpressureStrategy.BUFFER).copydefault(yBP.AEQbTJ()).KWHzl(C58266yxz.OLrzqt());
            Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        }
        final Function1 function1 = new Function1() { // from class: o.ced
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return OKWTronSignContract.copydefault(this.OLrzqt, str, (TronSignInfo) obj);
            }
        };
        AbstractC58185ywX<Pair<Boolean, String>> abstractC58185ywXKWHzl2 = abstractC58185ywXKWHzl.KWHzl(new InterfaceC58229yxO() { // from class: o.ceg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return OKWTronSignContract.giSNqX(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl2, "");
        return abstractC58185ywXKWHzl2;
    }

    public static final InterfaceC60096zvd copydefault(OKWTronSignContract oKWTronSignContract, String str, TronSignInfo tronSignInfo) {
        Intrinsics.checkNotNullParameter(tronSignInfo, "");
        oKWTronSignContract.OcIXYQ = tronSignInfo;
        C8429bCZ c8429bCZFJNWhG = oKWTronSignContract.fJNWhG();
        String fee = oKWTronSignContract.DGOPHZ().getFee();
        c8429bCZFJNWhG.EZpvd(fee != null ? fee : "");
        return super.DbNXlk(str);
    }

    @Override // o.AbstractC8564bFB
    public String zLjUOn() {
        TronContractSignData.Value valueFvQaOB = fvQaOB();
        if (valueFvQaOB == null) {
            valueFvQaOB = new TronContractSignData.Value(null, null, null, null, null, null, 63, null);
        }
        if (aUsmxb() == OKWBaseTransaction.TransactionType.DappTransfer) {
            String to_address = valueFvQaOB.getTo_address();
            if (to_address != null) {
                return to_address;
            }
        } else {
            String contract_address = valueFvQaOB.getContract_address();
            if (contract_address != null) {
                return contract_address;
            }
        }
        return "";
    }

    /* JADX DEBUG: Type inference failed for r4v1. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<com.okinc.network.okg.response.ResponseData<com.okinc.business.defi.biz.core.transaction.bean.BatchBroadcastModel>> */
    @Override // com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction
    public AbstractC58185ywX<ResponseData<BatchBroadcastModel>> OLrzqt(@NotNull String str, SubmitTxExpandBean submitTxExpandBean) {
        AbstractC58185ywX<Pair<Boolean, String>> abstractC58185ywXKWHzl;
        Intrinsics.checkNotNullParameter(str, "");
        if (OuxcSI()) {
            abstractC58185ywXKWHzl = DWgRXt();
        } else {
            abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(C56390yDp.OLrzqt(Boolean.TRUE, ""));
            Intrinsics.copydefault(abstractC58185ywXKWHzl);
        }
        final ActionBar actionBar = new ActionBar(this, str);
        AbstractC58185ywX abstractC58185ywXKWHzl2 = abstractC58185ywXKWHzl.KWHzl(new InterfaceC58229yxO() { // from class: o.cdT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return OKWTronSignContract.gasjUx(actionBar, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl2, "");
        return abstractC58185ywXKWHzl2;
    }

    public static final class ActionBar implements Function1<?, InterfaceC60096zvd<? extends ResponseData<BatchBroadcastModel>>> {
        public final /* synthetic */ OKWTronSignContract<SignData> EZpvd;
        public final /* synthetic */ String copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(OKWTronSignContract<SignData> oKWTronSignContract, String str) {
            this.EZpvd = oKWTronSignContract;
            this.copydefault = str;
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public final InterfaceC60096zvd<? extends ResponseData<BatchBroadcastModel>> invoke(Pair<Boolean, String> pair) {
            Intrinsics.checkNotNullParameter(pair, "");
            if (pair.getFirst().booleanValue()) {
                C8429bCZ c8429bCZFJNWhG = this.EZpvd.fJNWhG();
                String fee = this.EZpvd.DGOPHZ().getFee();
                if (fee == null) {
                    fee = "";
                }
                c8429bCZFJNWhG.EZpvd(fee);
                SignedTx signedTxKWHzl = this.EZpvd.KWHzl(this.copydefault);
                String tx = signedTxKWHzl.getTx();
                if (tx == null || tx.length() == 0) {
                    return AbstractC58185ywX.KWHzl(new ResponseData(-5005, null, null, null, null, null, 62, null));
                }
                OKWTronSignContract<SignData> oKWTronSignContract = this.EZpvd;
                String tx2 = signedTxKWHzl.getTx();
                String str = tx2 == null ? "" : tx2;
                String txHash = signedTxKWHzl.getTxHash();
                BroadcastBean broadcastBeanGenerateBroadcastModel$default = AbstractC8601bFm.generateBroadcastModel$default(oKWTronSignContract, str, txHash == null ? "" : txHash, null, null, 12, null);
                OKWTronSignContract<SignData> oKWTronSignContract2 = this.EZpvd;
                broadcastBeanGenerateBroadcastModel$default.setApprovalAddress(oKWTronSignContract2.fARcdN());
                if (oKWTronSignContract2.OJuSTm().getBroadcastDelegate() != null && oKWTronSignContract2.QwvEab() == 2) {
                    broadcastBeanGenerateBroadcastModel$default.setOriginData(oKWTronSignContract2.iZzfmt().AEQbTJ(signedTxKWHzl.getTx(), signedTxKWHzl.getTxHash(), signedTxKWHzl.getOriginSignature()));
                }
                Unit unit = Unit.INSTANCE;
                return AbstractC58185ywX.KWHzl(new ResponseData(-5001, null, null, null, new BatchBroadcastModel(C56402yEa.EZpvd(broadcastBeanGenerateBroadcastModel$default), (List) null, (Boolean) null, (String) null, (Boolean) null, (Integer) null, (String) null, (SignAuthType) null, 254, (DefaultConstructorMarker) null), null, 46, null));
            }
            String second = pair.getSecond();
            return AbstractC58185ywX.KWHzl(new ResponseData(-5000, second == null ? "" : second, null, null, null, null, 60, null));
        }
    }

    public static final InterfaceC60096zvd gasjUx(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public static final class StateListAnimator<T> implements InterfaceC58187ywZ {
        public final /* synthetic */ Object OLrzqt;
        public final /* synthetic */ String copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(Object obj, String str) {
            this.OLrzqt = obj;
            this.copydefault = str;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: o.ywW<com.okinc.business.defi.biz.core.transaction.sign.tron.bean.TronSignInfo> */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // o.InterfaceC58187ywZ
        public final void subscribe(InterfaceC58184ywW<TronSignInfo> interfaceC58184ywW) {
            Object objM7377constructorimpl;
            Intrinsics.checkNotNullParameter(interfaceC58184ywW, "");
            String str = this.copydefault;
            Object obj = this.OLrzqt;
            try {
                Result.Application application = Result.Companion;
                JsonObject asJsonObject = ((JsonObject) new Gson().fromJson(str, new TypeToken<JsonObject>() { // from class: com.okinc.business.defi.biz.core.transaction.sign.tron.OKWTronSignContract.StateListAnimator.1
                }.getType())).getAsJsonObject();
                if (asJsonObject.has("gasPrice") && asJsonObject.get("gasPrice").isJsonObject()) {
                    asJsonObject = ((JsonObject) new Gson().fromJson(str, new TypeToken<JsonObject>() { // from class: com.okinc.business.defi.biz.core.transaction.sign.tron.OKWTronSignContract.StateListAnimator.3
                    }.getType())).get("gasPrice").getAsJsonObject();
                }
                JsonObject jsonObject = (JsonObject) new Gson().fromJson(obj != null ? C33488mxR.EZpvd(obj) : null, new TypeToken<JsonObject>() { // from class: com.okinc.business.defi.biz.core.transaction.sign.tron.OKWTronSignContract.StateListAnimator.4
                }.getType());
                C12764ctD c12764ctD = C12764ctD.OLrzqt;
                Intrinsics.copydefault(jsonObject);
                Intrinsics.copydefault(asJsonObject);
                objM7377constructorimpl = Result.m7377constructorimpl(new Gson().fromJson((JsonElement) c12764ctD.OLrzqt(jsonObject, asJsonObject), (Class) TronSignInfo.class));
            } catch (Throwable th) {
                Result.Application application2 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
            Object obj2 = Result.m7383isFailureimpl(objM7377constructorimpl) ? null : objM7377constructorimpl;
            if (obj2 == null) {
                obj2 = this.OLrzqt;
            }
            interfaceC58184ywW.onNext(obj2);
            interfaceC58184ywW.onComplete();
        }
    }

    @Override // com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction
    public AbstractC58185ywX<ResponseData<BatchBroadcastModel>> EZpvd(@NotNull String str, SubmitTxExpandBean submitTxExpandBean) {
        Intrinsics.checkNotNullParameter(str, "");
        return OLrzqt(C10965byR.OLrzqt.OLrzqt(str, dUDNAs(), dHguZz(), new Function0() { // from class: o.cdQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return OKWTronSignContract.djBIcL(this.copydefault);
            }
        }, new Function2() { // from class: o.cdU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return OKWTronSignContract.copydefault(this.copydefault, (java.lang.String) obj, (RSV) obj2);
            }
        }, new Function1() { // from class: o.cdR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Boolean.valueOf(OKWTronSignContract.EZpvd((SignedTransaction) obj));
            }
        }));
    }

    public static final TxMessage djBIcL(OKWTronSignContract oKWTronSignContract) {
        return oKWTronSignContract.djBIcL();
    }

    public static final SignedTransaction copydefault(OKWTronSignContract oKWTronSignContract, String str, RSV rsv) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(rsv, "");
        return oKWTronSignContract.iZzfmt().KWHzl(str, rsv);
    }

    public static final boolean EZpvd(SignedTransaction signedTransaction) {
        Intrinsics.checkNotNullParameter(signedTransaction, "");
        return signedTransaction.isValid();
    }

    /* JADX DEBUG: Type inference failed for r3v1. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<com.okinc.network.okg.response.ResponseData<com.okinc.business.defi.biz.core.transaction.bean.BatchBroadcastModel>> */
    private final AbstractC58185ywX<ResponseData<BatchBroadcastModel>> OLrzqt(AbstractC58185ywX<ResponseData<SignedTransaction>> abstractC58185ywX) {
        final Function1 function1 = new Function1() { // from class: o.cdV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return OKWTronSignContract.copydefault(this.AEQbTJ, (ResponseData) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXAEQbTJ = abstractC58185ywX.AEQbTJ(new InterfaceC58229yxO() { // from class: o.cdX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return OKWTronSignContract.finit(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        return abstractC58185ywXAEQbTJ;
    }

    public static final ResponseData finit(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (ResponseData) function1.invoke(obj);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v5, resolved type: SignData */
    /* JADX DEBUG: Multi-variable search result rejected for r3v1, resolved type: SignData */
    /* JADX WARN: Multi-variable type inference failed */
    public static final ResponseData copydefault(OKWTronSignContract oKWTronSignContract, ResponseData responseData) {
        String json;
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == -5001) {
            SignedTransaction signedTransaction = (SignedTransaction) responseData.getData();
            if (signedTransaction == null) {
                signedTransaction = new SignedTransaction((String) null, (String) null, (String) null, 7, (DefaultConstructorMarker) null);
            }
            BroadcastBean broadcastBeanGenerateBroadcastModel$default = AbstractC8601bFm.generateBroadcastModel$default(oKWTronSignContract, signedTransaction.getRawTx(), signedTransaction.getTxHash(), null, null, 12, null);
            broadcastBeanGenerateBroadcastModel$default.setApprovalAddress(oKWTronSignContract.fARcdN());
            if (oKWTronSignContract.OJuSTm().getBroadcastDelegate() != null && oKWTronSignContract.QwvEab() == 2) {
                json = oKWTronSignContract.iZzfmt().AEQbTJ(signedTransaction.getRawTx(), signedTransaction.getTxHash(), signedTransaction.getSignature());
            } else {
                json = new GsonBuilder().disableHtmlEscaping().create().toJson(new TronSignResultData(true, ((TronContractSignData) oKWTronSignContract.QVsKAR()).getTxID(), (TronContractSignData) oKWTronSignContract.QVsKAR()));
            }
            broadcastBeanGenerateBroadcastModel$default.setOriginData(json);
            Unit unit = Unit.INSTANCE;
            return new ResponseData(-5001, null, null, null, new BatchBroadcastModel(C56402yEa.EZpvd(broadcastBeanGenerateBroadcastModel$default), (List) null, (Boolean) null, (String) null, (Boolean) null, (Integer) null, (String) null, (SignAuthType) null, 254, (DefaultConstructorMarker) null), null, 46, null);
        }
        return new ResponseData(responseData.getCode(), responseData.getMsg(), null, null, null, responseData.getError_code(), 28, null);
    }

    public SignedTx KWHzl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return iZzfmt().AEQbTJ(str);
    }

    public TxMessage djBIcL() {
        return iZzfmt().EZpvd();
    }

    public final TronContractSignData.Value fvQaOB() {
        List<TronContractSignData.Contract> contract;
        TronContractSignData.Contract contract2;
        TronContractSignData.Parameter parameter;
        TronContractSignData tronContractSignData = this.djBIcL;
        if (tronContractSignData == null) {
            Intrinsics.gEmmrt("");
            tronContractSignData = null;
        }
        TronContractSignData.RawData raw_data = tronContractSignData.getRaw_data();
        if (raw_data == null || (contract = raw_data.getContract()) == null || (contract2 = (TronContractSignData.Contract) CollectionsKt___CollectionsKt.firstOrNull(contract)) == null || (parameter = contract2.getParameter()) == null) {
            return null;
        }
        return parameter.getValue();
    }

    public final TronContractSignData gasjUx() {
        TronContractSignData tronContractSignData = this.djBIcL;
        if (tronContractSignData != null) {
            return tronContractSignData;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    @Override // o.AbstractC8601bFm
    public String AEQbTJ(boolean z) {
        if (C33129mqd.OLrzqt((CharSequence) this.QVAiDq)) {
            return this.QVAiDq;
        }
        TronContractSignData.Value valueFvQaOB = fvQaOB();
        if (valueFvQaOB != null) {
            return valueFvQaOB.getData();
        }
        return null;
    }

    public static final class TronSignResultData {
        public static final int $stable = 8;
        private boolean result;
        private TronContractSignData transaction;
        private final String txid;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ TronSignResultData copy$default(TronSignResultData tronSignResultData, boolean z, String str, TronContractSignData tronContractSignData, int i, Object obj) {
            if ((i & 1) != 0) {
                z = tronSignResultData.result;
            }
            if ((i & 2) != 0) {
                str = tronSignResultData.txid;
            }
            if ((i & 4) != 0) {
                tronContractSignData = tronSignResultData.transaction;
            }
            return tronSignResultData.copy(z, str, tronContractSignData);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean component1() {
            return this.result;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component2() {
            return this.txid;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TronContractSignData component3() {
            return this.transaction;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TronSignResultData copy(boolean z, String str, TronContractSignData tronContractSignData) {
            return new TronSignResultData(z, str, tronContractSignData);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TronSignResultData)) {
                return false;
            }
            TronSignResultData tronSignResultData = (TronSignResultData) obj;
            return this.result == tronSignResultData.result && Intrinsics.EZpvd((Object) this.txid, (Object) tronSignResultData.txid) && Intrinsics.EZpvd(this.transaction, tronSignResultData.transaction);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean getResult() {
            return this.result;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TronContractSignData getTransaction() {
            return this.transaction;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getTxid() {
            return this.txid;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = Boolean.hashCode(this.result);
            String str = this.txid;
            int iHashCode2 = str == null ? 0 : str.hashCode();
            TronContractSignData tronContractSignData = this.transaction;
            return (((iHashCode * 31) + iHashCode2) * 31) + (tronContractSignData != null ? tronContractSignData.hashCode() : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setResult(boolean z) {
            this.result = z;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setTransaction(TronContractSignData tronContractSignData) {
            this.transaction = tronContractSignData;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "TronSignResultData(result=" + this.result + ", txid=" + this.txid + ", transaction=" + this.transaction + ")";
        }

        public TronSignResultData(boolean z, String str, TronContractSignData tronContractSignData) {
            this.result = z;
            this.txid = str;
            this.transaction = tronContractSignData;
        }
    }

    public static final Pair EZpvd(OKWTronSignContract oKWTronSignContract, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            SignInfo signInfo = (SignInfo) responseData.getData();
            oKWTronSignContract.copydefault(signInfo != null ? signInfo.getSupportPush() : false);
            Json jsonAEQbTJ = C33489mxS.KWHzl.AEQbTJ();
            KSerializer<TronSignInfo> kSerializerSerializer = TronSignInfo.Companion.serializer();
            SignInfo signInfo2 = (SignInfo) responseData.getData();
            kotlinx.serialization.json.JsonObject info = signInfo2 != null ? signInfo2.getInfo() : null;
            Intrinsics.copydefault(info);
            oKWTronSignContract.OcIXYQ = (TronSignInfo) jsonAEQbTJ.decodeFromJsonElement(kSerializerSerializer, info);
            oKWTronSignContract.ac_().OLrzqt(oKWTronSignContract.DGOPHZ().getReserveFeeRatio());
            return C56390yDp.OLrzqt(Boolean.TRUE, null);
        }
        return C56390yDp.OLrzqt(Boolean.FALSE, responseData.getMsg());
    }
}
