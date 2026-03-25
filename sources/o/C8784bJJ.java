package o;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.reflect.TypeToken;
import com.okinc.business.defi.api.model.tx.SignAuthType;
import com.okinc.business.defi.api.model.tx.SubmitTxExpandBean;
import com.okinc.business.defi.api.model.tx.signdata.CosmosContractSignDirectData;
import com.okinc.business.defi.api.model.tx.signdata.EVMAuthorization;
import com.okinc.business.defi.api.model.tx.signdata.EVMStateOverride;
import com.okinc.business.defi.biz.core.transaction.bean.BatchBroadcastModel;
import com.okinc.business.defi.biz.core.transaction.bean.BroadcastBean;
import com.okinc.business.defi.biz.core.transaction.sign.cosmos.bean.CosmosSignInfo;
import com.okinc.business.defi.biz.core.transaction.sign.cosmos.bean.SignType;
import com.okinc.business.defi.biz.net.bean.SignInfo;
import com.okinc.business.defi.biz.net.bean.SignInfoReq;
import com.okinc.business.defi.biz.net.bean.WalletGasLimitRes;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.wallet.core.sign.TxMessage;
import com.okinc.wallet.core.sign.cosmos.CosmosFeeAmountAndGas;
import com.okinc.wallet.core.sign.cosmos.CosmosSignDocTransaction;
import com.okinc.wallet.core.sign.cosmos.CosmosSignedTx;
import com.okinc.wallet.core.sign.cosmos.RSVSignatureRawValue;
import com.okinc.wallet.core.sign.utxo.RSV;
import io.reactivex.BackpressureStrategy;
import java.math.RoundingMode;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.json.JsonObject;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.bJJ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C8784bJJ extends AbstractC8601bFm<C8843bKP, CosmosContractSignDirectData> implements InterfaceC8802bJb {
    public CosmosSignInfo AYXKKw;
    public java.lang.String AhwBna;
    public final InterfaceC56387yDm valueOf = C56392yDr.copydefault(new Function0() { // from class: o.bKc
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C8784bJJ.EZpvd(this.copydefault);
        }
    });
    public final InterfaceC56387yDm djBIcL = C56392yDr.copydefault(new Function0() { // from class: o.bKb
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C8784bJJ.KWHzl(this.OLrzqt);
        }
    });

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC8802bJb
    public java.lang.String AEQbTJ() {
        return this.AhwBna;
    }

    @Override // o.AbstractC8601bFm
    public java.lang.String AEQbTJ(boolean z) {
        return null;
    }

    @Override // o.AbstractC8564bFB
    public boolean DCUTEI() {
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void KWHzl(java.lang.String str) {
        this.AhwBna = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction
    public java.lang.String ag_() {
        return "";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void copydefault(@NotNull CosmosSignInfo cosmosSignInfo) {
        Intrinsics.checkNotNullParameter(cosmosSignInfo, "");
        this.AYXKKw = cosmosSignInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC8564bFB
    public java.lang.String zLjUOn() {
        return "";
    }

    @Override // o.AbstractC8601bFm
    public java.lang.String zuBGHE() {
        return null;
    }

    /* JADX DEBUG: Method merged with bridge method: DXXBbs()Lo/bCW; */
    @Override // o.AbstractC8564bFB
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public C8843bKP DXXBbs() {
        return (C8843bKP) this.valueOf.getValue();
    }

    public static final C8843bKP EZpvd(C8784bJJ c8784bJJ) {
        return new C8843bKP(c8784bJJ, c8784bJJ);
    }

    public final C8850bKW OLrzqt() {
        return (C8850bKW) this.djBIcL.getValue();
    }

    public static final C8850bKW KWHzl(C8784bJJ c8784bJJ) {
        return new C8850bKW(c8784bJJ);
    }

    @Override // o.InterfaceC8802bJb
    public CosmosSignInfo EZpvd() {
        CosmosSignInfo cosmosSignInfo = this.AYXKKw;
        if (cosmosSignInfo != null) {
            return cosmosSignInfo;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Pair copydefault(Function2 function2, java.lang.Object obj, java.lang.Object obj2) {
        Intrinsics.checkNotNullParameter(obj, "");
        Intrinsics.checkNotNullParameter(obj2, "");
        return (kotlin.Pair) function2.invoke(obj, obj2);
    }

    @Override // o.AbstractC8601bFm, o.AbstractC8564bFB
    public AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> r_() {
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXR_ = super.r_();
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXRcXXUw = RcXXUw();
        final Function2 function2 = new Function2() { // from class: o.bJR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C8784bJJ.AEQbTJ(this.AEQbTJ, (kotlin.Pair) obj, (kotlin.Pair) obj2);
            }
        };
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXEZpvd = AbstractC58185ywX.EZpvd(abstractC58185ywXR_, abstractC58185ywXRcXXUw, new InterfaceC58223yxI() { // from class: o.bJX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58223yxI
            public final java.lang.Object apply(java.lang.Object obj, java.lang.Object obj2) {
                return C8784bJJ.copydefault(function2, obj, obj2);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXEZpvd, "");
        return abstractC58185ywXEZpvd;
    }

    public static final kotlin.Pair AEQbTJ(C8784bJJ c8784bJJ, kotlin.Pair pair, kotlin.Pair pair2) {
        Intrinsics.checkNotNullParameter(pair, "");
        Intrinsics.checkNotNullParameter(pair2, "");
        if (!((java.lang.Boolean) pair.getFirst()).booleanValue()) {
            return pair;
        }
        if (!((java.lang.Boolean) pair2.getFirst()).booleanValue()) {
            return pair2;
        }
        c8784bJJ.DXXBbs().KWHzl(0);
        return C56390yDp.OLrzqt(java.lang.Boolean.TRUE, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Pair gGvvIC(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (kotlin.Pair) function1.invoke(obj);
    }

    /* JADX DEBUG: Type inference failed for r0v1. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> */
    @Override // o.AbstractC8564bFB
    public AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> ffGIBT() {
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXRcXXUw = RcXXUw();
        final Function1 function1 = new Function1() { // from class: o.bJS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C8784bJJ.AYXKKw(this.AEQbTJ, (kotlin.Pair) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXAEQbTJ = abstractC58185ywXRcXXUw.AEQbTJ(new InterfaceC58229yxO() { // from class: o.bJU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C8784bJJ.gGvvIC(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        return abstractC58185ywXAEQbTJ;
    }

    public static final kotlin.Pair AYXKKw(C8784bJJ c8784bJJ, kotlin.Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        if (((java.lang.Boolean) pair.getFirst()).booleanValue()) {
            c8784bJJ.DXXBbs().KWHzl(1);
        }
        return pair;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit giSNqX(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (Unit) function1.invoke(obj);
    }

    /* JADX DEBUG: Type inference failed for r0v1. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<kotlin.Unit> */
    @Override // o.AbstractC8601bFm, o.AbstractC8564bFB
    public AbstractC58185ywX<Unit> p_() {
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXRcXXUw = RcXXUw();
        final Function1 function1 = new Function1() { // from class: o.bJO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C8784bJJ.copydefault(this.OLrzqt, (kotlin.Pair) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXAEQbTJ = abstractC58185ywXRcXXUw.AEQbTJ(new InterfaceC58229yxO() { // from class: o.bJM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C8784bJJ.giSNqX(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        return abstractC58185ywXAEQbTJ;
    }

    public static final Unit copydefault(C8784bJJ c8784bJJ, kotlin.Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        if (((java.lang.Boolean) pair.getFirst()).booleanValue()) {
            c8784bJJ.DXXBbs().KWHzl(3);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC60096zvd gasjUx(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    @Override // o.AbstractC8564bFB
    public AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> DbNXlk(@NotNull java.lang.String str) {
        AbstractC58185ywX abstractC58185ywXKWHzl;
        Intrinsics.checkNotNullParameter(str, "");
        CosmosSignInfo cosmosSignInfoEZpvd = EZpvd();
        if (cosmosSignInfoEZpvd == null || str.length() == 0) {
            abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(cosmosSignInfoEZpvd);
            Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        } else {
            abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(new Application(cosmosSignInfoEZpvd, str), BackpressureStrategy.BUFFER).copydefault(yBP.AEQbTJ()).KWHzl(C58266yxz.OLrzqt());
            Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        }
        final Function1 function1 = new Function1() { // from class: o.bJK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C8784bJJ.AEQbTJ(this.AEQbTJ, (CosmosSignInfo) obj);
            }
        };
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXKWHzl2 = abstractC58185ywXKWHzl.KWHzl(new InterfaceC58229yxO() { // from class: o.bJG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C8784bJJ.gasjUx(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl2, "");
        return abstractC58185ywXKWHzl2;
    }

    public static final InterfaceC60096zvd AEQbTJ(C8784bJJ c8784bJJ, CosmosSignInfo cosmosSignInfo) {
        Intrinsics.checkNotNullParameter(cosmosSignInfo, "");
        c8784bJJ.copydefault(cosmosSignInfo);
        return c8784bJJ.djBIcL();
    }

    private final AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> djBIcL() {
        UeEOUB();
        return fARcdN();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: SignData */
    /* JADX WARN: Multi-variable type inference failed */
    private final void UeEOUB() {
        CosmosContractSignDirectData cosmosContractSignDirectData = (CosmosContractSignDirectData) QVsKAR();
        xYW xyw = xYW.AEQbTJ;
        CosmosFeeAmountAndGas cosmosFeeAmountAndGas = new CosmosFeeAmountAndGas(EZpvd().getFeeDemon(), DXXBbs().AEQbTJ(), C8843bKP.getGasLimit$default(DXXBbs(), 0, 1, null));
        CosmosContractSignDirectData.SignDoc sign_doc = cosmosContractSignDirectData.getSign_doc();
        java.lang.String chainId = sign_doc != null ? sign_doc.getChainId() : null;
        CosmosContractSignDirectData.SignDoc sign_doc2 = cosmosContractSignDirectData.getSign_doc();
        java.lang.String accountNumber = sign_doc2 != null ? sign_doc2.getAccountNumber() : null;
        CosmosContractSignDirectData.SignDoc sign_doc3 = cosmosContractSignDirectData.getSign_doc();
        java.lang.String bodyBytes = sign_doc3 != null ? sign_doc3.getBodyBytes() : null;
        CosmosContractSignDirectData.SignDoc sign_doc4 = cosmosContractSignDirectData.getSign_doc();
        CosmosSignDocTransaction cosmosSignDocTransactionKWHzl = xyw.KWHzl(cosmosFeeAmountAndGas, new CosmosSignDocTransaction(chainId, accountNumber, bodyBytes, sign_doc4 != null ? sign_doc4.getAuthInfoBytes() : null));
        cosmosContractSignDirectData.setSign_doc(new CosmosContractSignDirectData.SignDoc(cosmosSignDocTransactionKWHzl != null ? cosmosSignDocTransactionKWHzl.getChainId() : null, cosmosSignDocTransactionKWHzl != null ? cosmosSignDocTransactionKWHzl.getAccountNumber() : null, cosmosSignDocTransactionKWHzl != null ? cosmosSignDocTransactionKWHzl.getBodyBytes() : null, cosmosSignDocTransactionKWHzl != null ? cosmosSignDocTransactionKWHzl.getAuthInfoBytes() : null));
    }

    /* JADX DEBUG: Type inference failed for r0v1. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> */
    private final AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> RcXXUw() {
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXDjSkpj = djSkpj();
        final Function1 function1 = new Function1() { // from class: o.bJP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C8784bJJ.KWHzl(this.EZpvd, (kotlin.Pair) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXKWHzl = abstractC58185ywXDjSkpj.KWHzl(new InterfaceC58229yxO() { // from class: o.bJQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C8784bJJ.flVtFt(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        return abstractC58185ywXKWHzl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC60096zvd flVtFt(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public static final InterfaceC60096zvd KWHzl(C8784bJJ c8784bJJ, kotlin.Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        if (((java.lang.Boolean) pair.getFirst()).booleanValue()) {
            return c8784bJJ.fARcdN();
        }
        AbstractC58185ywX abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(pair);
        Intrinsics.copydefault(abstractC58185ywXKWHzl);
        return abstractC58185ywXKWHzl;
    }

    /* JADX DEBUG: Type inference failed for r1v2. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> */
    private final AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> djSkpj() {
        C13934dbu c13934dbuIxgjPv = ixgjPv();
        java.lang.String strOxVOHk = OxVOHk();
        java.lang.String strDmq = Dmq();
        long jAhwBna = dHguZz().AhwBna();
        AbstractC58185ywX<ResponseData<SignInfo>> abstractC58185ywXCopydefault = c13934dbuIxgjPv.copydefault(strOxVOHk, strDmq, new SignInfoReq(java.lang.String.valueOf(jAhwBna), fERRXa().getAddress(), zLjUOn(), ai_(), AbstractC8601bFm.getInputData$default(this, false, 1, null), "", (java.lang.String) null, (java.lang.Integer) null, (java.lang.Long) null, (java.lang.Long) null, (java.lang.String) null, (java.lang.Integer) null, (java.lang.Boolean) null, 8128, (DefaultConstructorMarker) null));
        final Function1 function1 = new Function1() { // from class: o.bJV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C8784bJJ.djBIcL(this.AEQbTJ, (ResponseData) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXAEQbTJ = abstractC58185ywXCopydefault.AEQbTJ(new InterfaceC58229yxO() { // from class: o.bJW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C8784bJJ.finit(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        return abstractC58185ywXAEQbTJ;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Pair finit(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (kotlin.Pair) function1.invoke(obj);
    }

    private final AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> fARcdN() {
        C13934dbu c13934dbuIxgjPv = ixgjPv();
        java.lang.String address = fERRXa().getAddress();
        java.lang.String tx = OLrzqt().copydefault().getTx();
        if (tx == null) {
            tx = "";
        }
        AbstractC58185ywX abstractC58185ywXCopydefault = c13934dbuIxgjPv.copydefault(address, tx, "", (496 & 8) != 0 ? null : java.lang.Long.valueOf(dHguZz().AhwBna()), (496 & 16) != 0 ? null : null, (496 & 32) != 0, (java.util.List<EVMAuthorization>) ((496 & 64) != 0 ? null : null), (496 & 128) != 0 ? null : null, (java.util.List<EVMStateOverride>) ((496 & 256) != 0 ? null : null));
        final Function1 function1 = new Function1() { // from class: o.bKa
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C8784bJJ.copydefault(this.copydefault, (ResponseData) obj);
            }
        };
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXAEQbTJ = abstractC58185ywXCopydefault.AEQbTJ(new InterfaceC58229yxO() { // from class: o.bKe
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C8784bJJ.dvKsVJ(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        return abstractC58185ywXAEQbTJ;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Pair dvKsVJ(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (kotlin.Pair) function1.invoke(obj);
    }

    /* JADX DEBUG: Type inference failed for r4v1. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<com.okinc.network.okg.response.ResponseData<com.okinc.business.defi.biz.core.transaction.bean.BatchBroadcastModel>> */
    @Override // com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction
    public AbstractC58185ywX<ResponseData<BatchBroadcastModel>> OLrzqt(@NotNull final java.lang.String str, SubmitTxExpandBean submitTxExpandBean) {
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXKWHzl;
        Intrinsics.checkNotNullParameter(str, "");
        if (OuxcSI()) {
            abstractC58185ywXKWHzl = RcXXUw();
        } else {
            abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(C56390yDp.OLrzqt(java.lang.Boolean.TRUE, ""));
            Intrinsics.copydefault(abstractC58185ywXKWHzl);
        }
        final Function1 function1 = new Function1() { // from class: o.bJL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C8784bJJ.OLrzqt(this.OLrzqt, str, (kotlin.Pair) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXKWHzl2 = abstractC58185ywXKWHzl.KWHzl(new InterfaceC58229yxO() { // from class: o.bJN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C8784bJJ.fvQaOB(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl2, "");
        return abstractC58185ywXKWHzl2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC60096zvd fvQaOB(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public static final InterfaceC60096zvd OLrzqt(C8784bJJ c8784bJJ, java.lang.String str, kotlin.Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        if (((java.lang.Boolean) pair.getFirst()).booleanValue()) {
            CosmosSignedTx cosmosSignedTxEZpvd = c8784bJJ.OLrzqt().EZpvd(str);
            java.lang.String tx = cosmosSignedTxEZpvd.getTx();
            if (tx == null || tx.length() == 0) {
                return AbstractC58185ywX.KWHzl(new ResponseData(-5005, null, null, null, null, null, 62, null));
            }
            java.lang.String tx2 = cosmosSignedTxEZpvd.getTx();
            Intrinsics.copydefault((java.lang.Object) tx2);
            java.lang.String txHash = cosmosSignedTxEZpvd.getTxHash();
            BroadcastBean broadcastBeanGenerateBroadcastModel$default = AbstractC8601bFm.generateBroadcastModel$default(c8784bJJ, tx2, txHash == null ? "" : txHash, null, null, 12, null);
            broadcastBeanGenerateBroadcastModel$default.setSignRawData(c8784bJJ.OLrzqt().KWHzl(cosmosSignedTxEZpvd));
            Unit unit = Unit.INSTANCE;
            return AbstractC58185ywX.KWHzl(new ResponseData(-5001, null, null, null, new BatchBroadcastModel(C56402yEa.EZpvd(broadcastBeanGenerateBroadcastModel$default), (java.util.List) null, (java.lang.Boolean) null, (java.lang.String) null, (java.lang.Boolean) null, (java.lang.Integer) null, (java.lang.String) null, (SignAuthType) null, 254, (DefaultConstructorMarker) null), null, 46, null));
        }
        return AbstractC58185ywX.KWHzl(new ResponseData(-5000, (java.lang.String) pair.getSecond(), null, null, null, null, 60, null));
    }

    @Override // com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction
    public AbstractC58185ywX<ResponseData<BatchBroadcastModel>> EZpvd(@NotNull java.lang.String str, SubmitTxExpandBean submitTxExpandBean) {
        Intrinsics.checkNotNullParameter(str, "");
        return copydefault(C10965byR.OLrzqt.OLrzqt(str, dUDNAs(), dHguZz(), new Function0() { // from class: o.bJT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C8784bJJ.AYXKKw(this.AEQbTJ);
            }
        }, new Function2() { // from class: o.bJY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C8784bJJ.AEQbTJ(this.OLrzqt, (java.lang.String) obj, (RSV) obj2);
            }
        }, new Function1() { // from class: o.bJZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Boolean.valueOf(C8784bJJ.OLrzqt((CosmosSignedTx) obj));
            }
        }));
    }

    public static final TxMessage AYXKKw(C8784bJJ c8784bJJ) {
        return xYV.copydefault.AEQbTJ(c8784bJJ.fERRXa().getPublicKey(), c8784bJJ.OLrzqt().OLrzqt(), SignType.SignTypeDirect.getType());
    }

    public static final CosmosSignedTx AEQbTJ(C8784bJJ c8784bJJ, java.lang.String str, RSV rsv) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(rsv, "");
        return xYV.copydefault.EZpvd(c8784bJJ.dHguZz().QKVWgx(), new RSVSignatureRawValue(rsv.getR(), rsv.getS(), rsv.getV(), str, null, 16, null));
    }

    public static final boolean OLrzqt(CosmosSignedTx cosmosSignedTx) {
        Intrinsics.checkNotNullParameter(cosmosSignedTx, "");
        java.lang.String tx = cosmosSignedTx.getTx();
        return !(tx == null || tx.length() == 0);
    }

    /* JADX DEBUG: Type inference failed for r3v1. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<com.okinc.network.okg.response.ResponseData<com.okinc.business.defi.biz.core.transaction.bean.BatchBroadcastModel>> */
    private final AbstractC58185ywX<ResponseData<BatchBroadcastModel>> copydefault(AbstractC58185ywX<ResponseData<CosmosSignedTx>> abstractC58185ywX) {
        final Function1 function1 = new Function1() { // from class: o.bJI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C8784bJJ.OLrzqt(this.OLrzqt, (ResponseData) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXAEQbTJ = abstractC58185ywX.AEQbTJ(new InterfaceC58229yxO() { // from class: o.bJH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C8784bJJ.fFgQHt(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        return abstractC58185ywXAEQbTJ;
    }

    public static final ResponseData fFgQHt(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (ResponseData) function1.invoke(obj);
    }

    public static final ResponseData OLrzqt(C8784bJJ c8784bJJ, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == -5001) {
            java.lang.Object data = responseData.getData();
            Intrinsics.copydefault(data);
            java.lang.String tx = ((CosmosSignedTx) data).getTx();
            Intrinsics.copydefault((java.lang.Object) tx);
            java.lang.Object data2 = responseData.getData();
            Intrinsics.copydefault(data2);
            java.lang.String txHash = ((CosmosSignedTx) data2).getTxHash();
            BroadcastBean broadcastBeanGenerateBroadcastModel$default = AbstractC8601bFm.generateBroadcastModel$default(c8784bJJ, tx, txHash == null ? "" : txHash, null, null, 12, null);
            C8850bKW c8850bKWOLrzqt = c8784bJJ.OLrzqt();
            java.lang.Object data3 = responseData.getData();
            Intrinsics.copydefault(data3);
            broadcastBeanGenerateBroadcastModel$default.setSignRawData(c8850bKWOLrzqt.KWHzl((CosmosSignedTx) data3));
            Unit unit = Unit.INSTANCE;
            return new ResponseData(-5001, null, null, null, new BatchBroadcastModel(C56402yEa.EZpvd(broadcastBeanGenerateBroadcastModel$default), (java.util.List) null, (java.lang.Boolean) null, (java.lang.String) null, (java.lang.Boolean) null, (java.lang.Integer) null, (java.lang.String) null, (SignAuthType) null, 254, (DefaultConstructorMarker) null), null, 46, null);
        }
        return new ResponseData(responseData.getCode(), responseData.getMsg(), null, null, null, responseData.getError_code(), 28, null);
    }

    public static final kotlin.Pair djBIcL(C8784bJJ c8784bJJ, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            java.lang.Object data = responseData.getData();
            Intrinsics.copydefault(data);
            c8784bJJ.copydefault(((SignInfo) data).getSupportPush());
            KSerializer<CosmosSignInfo> kSerializerSerializer = CosmosSignInfo.Companion.serializer();
            java.lang.Object data2 = responseData.getData();
            Intrinsics.copydefault(data2);
            JsonObject info = ((SignInfo) data2).getInfo();
            Intrinsics.copydefault(info);
            c8784bJJ.copydefault((CosmosSignInfo) C54907xZt.OLrzqt(kSerializerSerializer, info.toString()));
            c8784bJJ.ac_().OLrzqt(c8784bJJ.EZpvd().getReserveFeeRatio());
            c8784bJJ.UeEOUB();
            return C56390yDp.OLrzqt(java.lang.Boolean.TRUE, "");
        }
        return C56390yDp.OLrzqt(java.lang.Boolean.FALSE, responseData.getMsg());
    }

    /* JADX INFO: renamed from: o.bJJ$Application */
    public static final class Application<T> implements InterfaceC58187ywZ {
        public final /* synthetic */ java.lang.String EZpvd;
        public final /* synthetic */ java.lang.Object OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(java.lang.Object obj, java.lang.String str) {
            this.OLrzqt = obj;
            this.EZpvd = str;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: o.ywW<com.okinc.business.defi.biz.core.transaction.sign.cosmos.bean.CosmosSignInfo> */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // o.InterfaceC58187ywZ
        public final void subscribe(InterfaceC58184ywW<CosmosSignInfo> interfaceC58184ywW) {
            java.lang.Object objM7377constructorimpl;
            Intrinsics.checkNotNullParameter(interfaceC58184ywW, "");
            java.lang.String str = this.EZpvd;
            java.lang.Object obj = this.OLrzqt;
            try {
                Result.Application application = Result.Companion;
                com.google.gson.JsonObject asJsonObject = ((com.google.gson.JsonObject) new Gson().fromJson(str, new TypeToken<com.google.gson.JsonObject>() { // from class: o.bJJ.Application.5
                }.getType())).getAsJsonObject();
                if (asJsonObject.has("gasPrice") && asJsonObject.get("gasPrice").isJsonObject()) {
                    asJsonObject = ((com.google.gson.JsonObject) new Gson().fromJson(str, new TypeToken<com.google.gson.JsonObject>() { // from class: o.bJJ.Application.1
                    }.getType())).get("gasPrice").getAsJsonObject();
                }
                com.google.gson.JsonObject jsonObject = (com.google.gson.JsonObject) new Gson().fromJson(obj != null ? C33488mxR.EZpvd(obj) : null, new TypeToken<com.google.gson.JsonObject>() { // from class: o.bJJ.Application.2
                }.getType());
                C12764ctD c12764ctD = C12764ctD.OLrzqt;
                Intrinsics.copydefault(jsonObject);
                Intrinsics.copydefault(asJsonObject);
                objM7377constructorimpl = Result.m7377constructorimpl(new Gson().fromJson((JsonElement) c12764ctD.OLrzqt(jsonObject, asJsonObject), (java.lang.Class) CosmosSignInfo.class));
            } catch (java.lang.Throwable th) {
                Result.Application application2 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
            java.lang.Object obj2 = Result.m7383isFailureimpl(objM7377constructorimpl) ? null : objM7377constructorimpl;
            if (obj2 == null) {
                obj2 = this.OLrzqt;
            }
            interfaceC58184ywW.onNext(obj2);
            interfaceC58184ywW.onComplete();
        }
    }

    public static final kotlin.Pair copydefault(C8784bJJ c8784bJJ, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            java.lang.Object data = responseData.getData();
            Intrinsics.copydefault(data);
            c8784bJJ.KWHzl(C54862xYb.convertToBigIntegerString$default(((WalletGasLimitRes) data).getGasLimit(), false, (RoundingMode) null, 3, (java.lang.Object) null));
            c8784bJJ.UeEOUB();
            return C56390yDp.OLrzqt(java.lang.Boolean.TRUE, "");
        }
        return C56390yDp.OLrzqt(java.lang.Boolean.FALSE, responseData.getMsg());
    }
}
