package o;

import com.google.gson.Gson;
import com.okinc.business.defi.api.bean.TrxDappSignData;
import com.okinc.business.defi.api.model.tx.SignAuthType;
import com.okinc.business.defi.api.model.tx.SubmitTxExpandBean;
import com.okinc.business.defi.api.model.tx.signdata.TronContractSignData;
import com.okinc.business.defi.api.model.tx.signdata.TronMessageSignData;
import com.okinc.business.defi.biz.core.transaction.bean.BatchBroadcastModel;
import com.okinc.business.defi.biz.net.bean.AuthGroups;
import com.okinc.business.defi.biz.net.bean.BeforeAndAfterPermission;
import com.okinc.business.defi.biz.net.bean.Exposures;
import com.okinc.business.defi.biz.net.bean.PermissionDetail;
import com.okinc.business.defi.biz.net.bean.SignCallDataCheckReq;
import com.okinc.business.defi.biz.net.bean.SignCallDataCheckRes;
import com.okinc.business.defi.biz.net.bean.Spender;
import com.okinc.business.defi.biz.net.bean.TxToastCheckReq;
import com.okinc.business.defi.biz.net.bean.TxToastCheckRes;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.wallet.core.sign.utxo.RSV;
import kotlin.Result;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.cef, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C11999cef extends AbstractC8610bFv<TronMessageSignData> {
    public boolean EZpvd;
    public final InterfaceC56387yDm copydefault = C56392yDr.copydefault(new Function0() { // from class: o.cep
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C11999cef.copydefault(this.AEQbTJ);
        }
    });
    public java.util.HashSet<java.lang.String> OLrzqt = new java.util.HashSet<>();
    public java.lang.String AEQbTJ = "";
    public java.lang.String AYXKKw = "";

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final kotlin.Pair copydefault(kotlin.Pair pair, java.lang.Boolean bool) {
        Intrinsics.checkNotNullParameter(pair, "");
        Intrinsics.checkNotNullParameter(bool, "");
        return pair;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.HashSet<java.lang.String> AhwBna() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction
    public java.lang.String ag_() {
        return "";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean djBIcL() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String gEmmrt() {
        return this.AYXKKw;
    }

    public final C11988ceU KWHzl() {
        return (C11988ceU) this.copydefault.getValue();
    }

    public static final C11988ceU copydefault(C11999cef c11999cef) {
        return new C11988ceU(c11999cef);
    }

    @Override // o.AbstractC8610bFv
    public AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> EZpvd() {
        isConnected();
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXEZpvd = super.EZpvd();
        AbstractC58185ywX<java.lang.Boolean> abstractC58185ywXOLrzqt = OLrzqt();
        final Function2 function2 = new Function2() { // from class: o.cel
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C11999cef.copydefault((kotlin.Pair) obj, (java.lang.Boolean) obj2);
            }
        };
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXEZpvd2 = AbstractC58185ywX.EZpvd(abstractC58185ywXEZpvd, abstractC58185ywXOLrzqt, new InterfaceC58223yxI() { // from class: o.cer
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58223yxI
            public final java.lang.Object apply(java.lang.Object obj, java.lang.Object obj2) {
                return C11999cef.AYXKKw(function2, obj, obj2);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXEZpvd2, "");
        return abstractC58185ywXEZpvd2;
    }

    public static final kotlin.Pair AYXKKw(Function2 function2, java.lang.Object obj, java.lang.Object obj2) {
        Intrinsics.checkNotNullParameter(obj, "");
        Intrinsics.checkNotNullParameter(obj2, "");
        return (kotlin.Pair) function2.invoke(obj, obj2);
    }

    @Override // o.AbstractC8610bFv
    public AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> AEQbTJ() {
        return EZpvd();
    }

    @Override // o.AbstractC8610bFv, com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction
    public java.util.ArrayList<java.lang.Integer> getNewProxyInstance() {
        isConnected();
        java.util.ArrayList<java.lang.Integer> newProxyInstance = super.getNewProxyInstance();
        if (this.EZpvd) {
            newProxyInstance.add(9);
        }
        return newProxyInstance;
    }

    @Override // com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction
    public TxToastCheckReq i_() {
        TxToastCheckReq txToastCheckReqI_ = super.i_();
        txToastCheckReqI_.setCoinId(java.lang.Long.valueOf(dHguZz().AhwBna()));
        txToastCheckReqI_.setAdditionalData(this.EZpvd ? C56423yEv.EZpvd(C56390yDp.OLrzqt("tronHexData", AbstractC8610bFv.getData$default(this, false, 1, null))) : null);
        return txToastCheckReqI_;
    }

    @Override // com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction
    public AbstractC58185ywX<ResponseData<BatchBroadcastModel>> OLrzqt(@NotNull java.lang.String str, SubmitTxExpandBean submitTxExpandBean) {
        AbstractC58185ywX<ResponseData<java.lang.String>> abstractC58185ywXKWHzl;
        Intrinsics.checkNotNullParameter(str, "");
        java.lang.String strAEQbTJ = KWHzl().AEQbTJ(C54910xZw.EZpvd(str));
        if (strAEQbTJ.length() == 0) {
            abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(new ResponseData(-5005, null, null, null, null, null, 62, null));
            Intrinsics.copydefault(abstractC58185ywXKWHzl);
        } else {
            abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(new ResponseData(-5001, null, null, null, KWHzl().KWHzl(strAEQbTJ), null, 46, null));
            Intrinsics.copydefault(abstractC58185ywXKWHzl);
        }
        return AEQbTJ(abstractC58185ywXKWHzl);
    }

    @Override // com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction
    public AbstractC58185ywX<ResponseData<BatchBroadcastModel>> EZpvd(@NotNull java.lang.String str, SubmitTxExpandBean submitTxExpandBean) {
        Intrinsics.checkNotNullParameter(str, "");
        return AEQbTJ(C10965byR.OLrzqt.KWHzl(str, dUDNAs(), dHguZz(), new Function0() { // from class: o.cem
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C11999cef.EZpvd(this.EZpvd);
            }
        }, new Function1() { // from class: o.cek
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C11999cef.AEQbTJ(this.OLrzqt, (RSV) obj);
            }
        }, new Function1() { // from class: o.ceo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C11999cef.EZpvd(this.copydefault, (java.lang.String) obj);
            }
        }));
    }

    public static final java.lang.String EZpvd(C11999cef c11999cef) {
        return c11999cef.KWHzl().EZpvd();
    }

    public static final java.lang.String AEQbTJ(C11999cef c11999cef, RSV rsv) {
        Intrinsics.checkNotNullParameter(rsv, "");
        return c11999cef.KWHzl().KWHzl(rsv);
    }

    public static final java.lang.String EZpvd(C11999cef c11999cef, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return c11999cef.KWHzl().KWHzl(str);
    }

    /* JADX DEBUG: Type inference failed for r3v1. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<com.okinc.network.okg.response.ResponseData<com.okinc.business.defi.biz.core.transaction.bean.BatchBroadcastModel>> */
    private final AbstractC58185ywX<ResponseData<BatchBroadcastModel>> AEQbTJ(AbstractC58185ywX<ResponseData<java.lang.String>> abstractC58185ywX) {
        final Function1 function1 = new Function1() { // from class: o.ceh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C11999cef.AYXKKw(this.OLrzqt, (ResponseData) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXAEQbTJ = abstractC58185ywX.AEQbTJ(new InterfaceC58229yxO() { // from class: o.cen
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C11999cef.djBIcL(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        return abstractC58185ywXAEQbTJ;
    }

    public static final ResponseData djBIcL(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (ResponseData) function1.invoke(obj);
    }

    public static final ResponseData AYXKKw(C11999cef c11999cef, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == -5001) {
            java.lang.String str = (java.lang.String) responseData.getData();
            return new ResponseData(-5001, null, null, null, new BatchBroadcastModel(C56402yEa.EZpvd(AbstractC8610bFv.generateCommonBroadcastModel$default(c11999cef, str != null ? str : "", null, 2, null)), (java.util.List) null, (java.lang.Boolean) null, (java.lang.String) null, (java.lang.Boolean) null, (java.lang.Integer) null, (java.lang.String) null, (SignAuthType) null, 254, (DefaultConstructorMarker) null), null, 46, null);
        }
        return new ResponseData(responseData.getCode(), responseData.getMsg(), null, null, null, responseData.getError_code(), 28, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: SignData */
    /* JADX WARN: Multi-variable type inference failed */
    public final TrxDappSignData valueOf() {
        if (this.EZpvd) {
            return (TrxDappSignData) new Gson().fromJson(((TronMessageSignData) QVsKAR()).getData(), TrxDappSignData.class);
        }
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: SignData */
    /* JADX DEBUG: Type inference failed for r0v3. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<java.lang.Boolean> */
    /* JADX WARN: Multi-variable type inference failed */
    public final AbstractC58185ywX<java.lang.Boolean> OLrzqt() {
        if (QwvEab() != 2) {
            AbstractC58185ywX<java.lang.Boolean> abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(java.lang.Boolean.TRUE);
            Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
            return abstractC58185ywXKWHzl;
        }
        AbstractC58185ywX<ResponseData<SignCallDataCheckRes>> abstractC58185ywXEZpvd = OFhtUX().EZpvd(new SignCallDataCheckReq("", ((TronMessageSignData) QVsKAR()).getData(), java.lang.String.valueOf(OJuSTm().getGeneralChainId()), "signMessage", "2"));
        final Function1 function1 = new Function1() { // from class: o.ces
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C11999cef.AEQbTJ(this.OLrzqt, (ResponseData) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXKWHzl2 = abstractC58185ywXEZpvd.KWHzl(new InterfaceC58229yxO() { // from class: o.cet
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C11999cef.valueOf(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl2, "");
        return abstractC58185ywXKWHzl2;
    }

    public static final InterfaceC60096zvd valueOf(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public static final InterfaceC60096zvd AEQbTJ(final C11999cef c11999cef, ResponseData responseData) {
        java.lang.String risk;
        java.lang.String tokenAddress;
        Intrinsics.checkNotNullParameter(responseData, "");
        SignCallDataCheckRes signCallDataCheckRes = (SignCallDataCheckRes) responseData.getData();
        if (responseData.getCode() == 0 && responseData.getData() != null && signCallDataCheckRes != null && (risk = signCallDataCheckRes.getRisk()) != null && risk.length() > 0) {
            java.lang.String contractAddress = signCallDataCheckRes.getContractAddress();
            C9758bbd c9758bbd = new C9758bbd(signCallDataCheckRes.getRisk(), (contractAddress == null || contractAddress.length() <= 0 || (tokenAddress = signCallDataCheckRes.getTokenAddress()) == null || tokenAddress.length() <= 0 || signCallDataCheckRes.getAddtion() == null) ? null : new C9701baZ(signCallDataCheckRes.getAddtion().getValue(), signCallDataCheckRes.getContractAddress(), signCallDataCheckRes.getContractName(), signCallDataCheckRes.getContractIcon(), signCallDataCheckRes.getTokenAddress(), signCallDataCheckRes.getTokenSymbol(), signCallDataCheckRes.getTokenIcon()));
            if (c9758bbd.KWHzl()) {
                c11999cef.DLWbHP().AEQbTJ(new C9835bdA(false, c9758bbd));
            } else {
                c11999cef.DLWbHP().AEQbTJ(new C9835bdA(true, c9758bbd));
            }
            AbstractC58185ywX<ResponseData<java.util.List<TxToastCheckRes>>> abstractC58185ywXCopydefault = c11999cef.OFhtUX().copydefault(new TxToastCheckReq(C56402yEa.EZpvd(1), java.lang.Long.valueOf(c11999cef.dHguZz().AhwBna()), 2, null, c11999cef.fERRXa().getAddress(), "", "", null, null, null, null, null, null, 6, null, null, c11999cef.dHguZz().fetchVPNInfo(), null, null, null, null, null, 4120448, null));
            final Function1 function1 = new Function1() { // from class: o.cei
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C11999cef.copydefault(this.KWHzl, (ResponseData) obj);
                }
            };
            return abstractC58185ywXCopydefault.AEQbTJ(new InterfaceC58229yxO() { // from class: o.cej
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58229yxO
                public final java.lang.Object apply(java.lang.Object obj) {
                    return C11999cef.AYXKKw(function1, obj);
                }
            });
        }
        return AbstractC58185ywX.KWHzl(java.lang.Boolean.TRUE);
    }

    public static final java.lang.Boolean AYXKKw(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (java.lang.Boolean) function1.invoke(obj);
    }

    @Override // o.AbstractC8610bFv, com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction
    public void AEQbTJ(@NotNull java.util.List<TxToastCheckRes> list) {
        java.lang.String strOLrzqt;
        java.lang.String strGEmmrt;
        java.util.Collection<Spender> collectionValues;
        Spender spender;
        com.okinc.business.defi.biz.net.bean.Permission after;
        java.util.List<PermissionDetail> detail;
        com.okinc.business.defi.biz.net.bean.Permission after2;
        java.util.List<PermissionDetail> detail2;
        java.util.List<BeforeAndAfterPermission> list2;
        Intrinsics.checkNotNullParameter(list, "");
        super.AEQbTJ(list);
        java.lang.String str = "";
        boolean z = true;
        boolean z2 = true;
        for (TxToastCheckRes txToastCheckRes : list) {
            java.lang.Integer checkType = txToastCheckRes.getCheckType();
            if (checkType != null && checkType.intValue() == 1) {
                if (!Intrinsics.EZpvd(txToastCheckRes.getResult(), java.lang.Boolean.TRUE)) {
                    z = false;
                }
            } else if (checkType != null && checkType.intValue() == 9) {
                java.lang.String permissionMsg = txToastCheckRes.getPermissionMsg();
                str = permissionMsg == null ? "" : permissionMsg;
                java.util.Map<java.lang.String, java.util.List<BeforeAndAfterPermission>> permissions = txToastCheckRes.getPermissions();
                java.lang.String name = null;
                BeforeAndAfterPermission beforeAndAfterPermission = (permissions == null || (list2 = permissions.get(fERRXa().getAddress())) == null) ? null : (BeforeAndAfterPermission) CollectionsKt___CollectionsKt.firstOrNull(list2);
                if (beforeAndAfterPermission != null) {
                    C12764ctD c12764ctD = C12764ctD.OLrzqt;
                    java.lang.String json = new Gson().toJson(beforeAndAfterPermission);
                    Intrinsics.checkNotNullExpressionValue(json, "");
                    strOLrzqt = c12764ctD.OLrzqt(json);
                } else {
                    strOLrzqt = "";
                }
                this.AEQbTJ = strOLrzqt;
                boolean zValueOf = C33129mqd.valueOf((beforeAndAfterPermission == null || (after2 = beforeAndAfterPermission.getAfter()) == null || (detail2 = after2.getDetail()) == null) ? null : java.lang.Integer.valueOf(detail2.size()), 0);
                if (beforeAndAfterPermission != null && (after = beforeAndAfterPermission.getAfter()) != null && (detail = after.getDetail()) != null) {
                    java.util.Iterator<T> it = detail.iterator();
                    while (it.hasNext()) {
                        java.util.List<AuthGroups> authGrous = ((PermissionDetail) it.next()).getAuthGrous();
                        if (authGrous != null) {
                            for (AuthGroups authGroups : authGrous) {
                                if (C33129mqd.OLrzqt((java.lang.CharSequence) authGroups.getAddress())) {
                                    java.util.HashSet<java.lang.String> hashSet = this.OLrzqt;
                                    java.lang.String address = authGroups.getAddress();
                                    if (address == null) {
                                        address = "";
                                    }
                                    hashSet.add(address);
                                }
                            }
                        }
                    }
                }
                java.util.Map<java.lang.String, java.util.List<Exposures>> exposures = txToastCheckRes.getExposures();
                if (exposures == null || exposures.isEmpty()) {
                    strGEmmrt = "";
                } else {
                    java.util.Map<java.lang.String, Spender> spenders = ((Exposures) ((java.util.List) CollectionsKt___CollectionsKt.dNCPSb(exposures.values())).get(0)).getSpenders();
                    if (spenders != null && (collectionValues = spenders.values()) != null && (spender = (Spender) CollectionsKt___CollectionsKt.dNCPSb(collectionValues)) != null) {
                        name = spender.getName();
                    }
                    strGEmmrt = C33129mqd.gEmmrt(name);
                }
                this.AYXKKw = strGEmmrt;
                z2 = zValueOf;
            }
        }
        DLWbHP().OLrzqt(yDY.gEmmrt(new C9837bdC(z), new C9838bdD(z2, str), new C9839bdE(z2)));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v5, resolved type: SignData */
    /* JADX WARN: Multi-variable type inference failed */
    public final void isConnected() {
        java.lang.Object objM7377constructorimpl;
        try {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl((TronContractSignData) new Gson().fromJson(((TronMessageSignData) QVsKAR()).getData(), TronContractSignData.class));
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (Result.m7384isSuccessimpl(objM7377constructorimpl)) {
            this.EZpvd = true;
        }
        if (Result.m7380exceptionOrNullimpl(objM7377constructorimpl) != null) {
            this.EZpvd = false;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v4, resolved type: SignData */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractC8610bFv
    public java.lang.String AEQbTJ(boolean z) {
        if (C33129mqd.OLrzqt((java.lang.CharSequence) this.AEQbTJ)) {
            return this.AEQbTJ;
        }
        if (this.EZpvd) {
            TrxDappSignData trxDappSignDataValueOf = valueOf();
            java.lang.String raw_data_hex = trxDappSignDataValueOf != null ? trxDappSignDataValueOf.getRaw_data_hex() : null;
            return raw_data_hex == null ? "" : raw_data_hex;
        }
        return ((TronMessageSignData) QVsKAR()).getData();
    }

    public static final java.lang.Boolean copydefault(C11999cef c11999cef, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == 0 && responseData.getData() != null && C33129mqd.KWHzl((java.util.Collection) responseData.getData()) && ((java.util.List) responseData.getData()) != null) {
            java.lang.Object data = responseData.getData();
            Intrinsics.copydefault(data);
            c11999cef.AEQbTJ((java.util.List<TxToastCheckRes>) data);
        }
        return true;
    }
}
