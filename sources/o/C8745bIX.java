package o;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.reflect.TypeToken;
import com.okinc.business.defi.api.model.tx.SignAuthType;
import com.okinc.business.defi.api.model.tx.SubmitTxExpandBean;
import com.okinc.business.defi.api.model.tx.signdata.CosmosContractSignMessageData;
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
import com.okinc.wallet.core.sign.cosmos.CosmosSignMessageTransaction;
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
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.bIX, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C8745bIX extends AbstractC8601bFm<C8843bKP, CosmosContractSignMessageData> implements InterfaceC8802bJb {
    public CosmosSignInfo AYXKKw;
    public java.lang.String AhwBna;
    public final InterfaceC56387yDm valueOf = C56392yDr.copydefault(new Function0() { // from class: o.bJA
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C8745bIX.OLrzqt(this.KWHzl);
        }
    });
    public final InterfaceC56387yDm djBIcL = C56392yDr.copydefault(new Function0() { // from class: o.bJz
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C8745bIX.KWHzl(this.OLrzqt);
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void AEQbTJ(@NotNull CosmosSignInfo cosmosSignInfo) {
        Intrinsics.checkNotNullParameter(cosmosSignInfo, "");
        this.AYXKKw = cosmosSignInfo;
    }

    @Override // o.AbstractC8564bFB
    public boolean DCUTEI() {
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void copydefault(java.lang.String str) {
        this.AhwBna = str;
    }

    /* JADX DEBUG: Method merged with bridge method: DXXBbs()Lo/bCW; */
    @Override // o.AbstractC8564bFB
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public C8843bKP DXXBbs() {
        return (C8843bKP) this.valueOf.getValue();
    }

    public static final C8843bKP OLrzqt(C8745bIX c8745bIX) {
        return new C8843bKP(c8745bIX, c8745bIX);
    }

    public final C8842bKO djBIcL() {
        return (C8842bKO) this.djBIcL.getValue();
    }

    public static final C8842bKO KWHzl(C8745bIX c8745bIX) {
        return new C8842bKO(c8745bIX);
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
    public static final kotlin.Pair EZpvd(Function2 function2, java.lang.Object obj, java.lang.Object obj2) {
        Intrinsics.checkNotNullParameter(obj, "");
        Intrinsics.checkNotNullParameter(obj2, "");
        return (kotlin.Pair) function2.invoke(obj, obj2);
    }

    @Override // o.AbstractC8601bFm, o.AbstractC8564bFB
    public AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> r_() {
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXR_ = super.r_();
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXUeEOUB = UeEOUB();
        final Function2 function2 = new Function2() { // from class: o.bJu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C8745bIX.EZpvd(this.KWHzl, (kotlin.Pair) obj, (kotlin.Pair) obj2);
            }
        };
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXEZpvd = AbstractC58185ywX.EZpvd(abstractC58185ywXR_, abstractC58185ywXUeEOUB, new InterfaceC58223yxI() { // from class: o.bJv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58223yxI
            public final java.lang.Object apply(java.lang.Object obj, java.lang.Object obj2) {
                return C8745bIX.EZpvd(function2, obj, obj2);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXEZpvd, "");
        return abstractC58185ywXEZpvd;
    }

    public static final kotlin.Pair EZpvd(C8745bIX c8745bIX, kotlin.Pair pair, kotlin.Pair pair2) {
        Intrinsics.checkNotNullParameter(pair, "");
        Intrinsics.checkNotNullParameter(pair2, "");
        if (!((java.lang.Boolean) pair.getFirst()).booleanValue()) {
            return pair;
        }
        if (!((java.lang.Boolean) pair2.getFirst()).booleanValue()) {
            return pair2;
        }
        c8745bIX.DXXBbs().KWHzl(0);
        return C56390yDp.OLrzqt(java.lang.Boolean.TRUE, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Pair gkJEwt(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (kotlin.Pair) function1.invoke(obj);
    }

    /* JADX DEBUG: Type inference failed for r0v1. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> */
    @Override // o.AbstractC8564bFB
    public AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> ffGIBT() {
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXUeEOUB = UeEOUB();
        final Function1 function1 = new Function1() { // from class: o.bJw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C8745bIX.AYXKKw(this.AEQbTJ, (kotlin.Pair) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXAEQbTJ = abstractC58185ywXUeEOUB.AEQbTJ(new InterfaceC58229yxO() { // from class: o.bJy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C8745bIX.gkJEwt(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        return abstractC58185ywXAEQbTJ;
    }

    public static final kotlin.Pair AYXKKw(C8745bIX c8745bIX, kotlin.Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        if (((java.lang.Boolean) pair.getFirst()).booleanValue()) {
            c8745bIX.DXXBbs().KWHzl(1);
        }
        return pair;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: SignData */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction
    public java.lang.String ag_() {
        java.lang.String from = ((CosmosContractSignMessageData) QVsKAR()).getFrom();
        return from == null ? "" : from;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: SignData */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractC8601bFm
    public java.lang.String zuBGHE() {
        return ((CosmosContractSignMessageData) QVsKAR()).getValue();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: SignData */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractC8564bFB
    public java.lang.String zLjUOn() {
        java.lang.String to = ((CosmosContractSignMessageData) QVsKAR()).getTo();
        return to == null ? "" : to;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AxsJAYaxsJAY(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (Unit) function1.invoke(obj);
    }

    /* JADX DEBUG: Type inference failed for r0v1. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<kotlin.Unit> */
    @Override // o.AbstractC8601bFm, o.AbstractC8564bFB
    public AbstractC58185ywX<Unit> p_() {
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXUeEOUB = UeEOUB();
        final Function1 function1 = new Function1() { // from class: o.bJi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C8745bIX.EZpvd(this.copydefault, (kotlin.Pair) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXAEQbTJ = abstractC58185ywXUeEOUB.AEQbTJ(new InterfaceC58229yxO() { // from class: o.bJk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C8745bIX.AxsJAYaxsJAY(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        return abstractC58185ywXAEQbTJ;
    }

    public static final Unit EZpvd(C8745bIX c8745bIX, kotlin.Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        if (((java.lang.Boolean) pair.getFirst()).booleanValue()) {
            c8745bIX.DXXBbs().KWHzl(3);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC60096zvd iZzfmt(Function1 function1, java.lang.Object obj) {
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
            abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(new Activity(cosmosSignInfoEZpvd, str), BackpressureStrategy.BUFFER).copydefault(yBP.AEQbTJ()).KWHzl(C58266yxz.OLrzqt());
            Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        }
        final Function1 function1 = new Function1() { // from class: o.bJE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C8745bIX.copydefault(this.AEQbTJ, (CosmosSignInfo) obj);
            }
        };
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXKWHzl2 = abstractC58185ywXKWHzl.KWHzl(new InterfaceC58229yxO() { // from class: o.bJD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C8745bIX.iZzfmt(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl2, "");
        return abstractC58185ywXKWHzl2;
    }

    public static final InterfaceC60096zvd copydefault(C8745bIX c8745bIX, CosmosSignInfo cosmosSignInfo) {
        Intrinsics.checkNotNullParameter(cosmosSignInfo, "");
        c8745bIX.AEQbTJ(cosmosSignInfo);
        return c8745bIX.KWHzl();
    }

    public final AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> KWHzl() {
        fARcdN();
        return aKErDB();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: SignData */
    /* JADX WARN: Multi-variable type inference failed */
    public final void fARcdN() {
        CosmosContractSignMessageData cosmosContractSignMessageData = (CosmosContractSignMessageData) QVsKAR();
        cosmosContractSignMessageData.setChain_id(EZpvd().getChainId());
        cosmosContractSignMessageData.setAccount_number(C54862xYb.convertToBigIntegerString$default(EZpvd().getAccountNumber(), false, (RoundingMode) null, 3, (java.lang.Object) null));
        cosmosContractSignMessageData.setSequence(C54862xYb.convertToBigIntegerString$default(EZpvd().getSequence(), false, (RoundingMode) null, 3, (java.lang.Object) null));
        cosmosContractSignMessageData.setFee(new CosmosContractSignMessageData.Fee(C8843bKP.getGasLimit$default(DXXBbs(), 0, 1, null), C56402yEa.EZpvd(new CosmosContractSignMessageData.Fee.FeeAmount(EZpvd().getFeeDemon(), DXXBbs().AEQbTJ()))));
        if (cosmosContractSignMessageData.getMemo() == null) {
            cosmosContractSignMessageData.setMemo("");
        }
    }

    /* JADX DEBUG: Type inference failed for r0v1. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> */
    private final AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> UeEOUB() {
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXDjSkpj = djSkpj();
        final Function1 function1 = new Function1() { // from class: o.bJt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C8745bIX.KWHzl(this.OLrzqt, (kotlin.Pair) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXKWHzl = abstractC58185ywXDjSkpj.KWHzl(new InterfaceC58229yxO() { // from class: o.bJs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C8745bIX.giSNqX(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        return abstractC58185ywXKWHzl;
    }

    public static final InterfaceC60096zvd giSNqX(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public static final InterfaceC60096zvd KWHzl(C8745bIX c8745bIX, kotlin.Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        if (((java.lang.Boolean) pair.getFirst()).booleanValue()) {
            return c8745bIX.aKErDB();
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
        java.lang.String address = fERRXa().getAddress();
        java.lang.String strZLjUOn = zLjUOn();
        int iAi_ = ai_();
        java.lang.String inputData$default = AbstractC8601bFm.getInputData$default(this, false, 1, null);
        java.lang.String strZuBGHE = zuBGHE();
        AbstractC58185ywX<ResponseData<SignInfo>> abstractC58185ywXCopydefault = c13934dbuIxgjPv.copydefault(strOxVOHk, strDmq, new SignInfoReq(java.lang.String.valueOf(jAhwBna), address, strZLjUOn, iAi_, inputData$default, strZuBGHE == null ? "" : strZuBGHE, (java.lang.String) null, (java.lang.Integer) null, (java.lang.Long) null, (java.lang.Long) null, (java.lang.String) null, (java.lang.Integer) null, (java.lang.Boolean) null, 8128, (DefaultConstructorMarker) null));
        final Function1 function1 = new Function1() { // from class: o.bJF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C8745bIX.gEmmrt(this.OLrzqt, (ResponseData) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXAEQbTJ = abstractC58185ywXCopydefault.AEQbTJ(new InterfaceC58229yxO() { // from class: o.bJe
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C8745bIX.gGvvIC(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        return abstractC58185ywXAEQbTJ;
    }

    public static final kotlin.Pair gGvvIC(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (kotlin.Pair) function1.invoke(obj);
    }

    private final AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> aKErDB() {
        C13934dbu c13934dbuIxgjPv = ixgjPv();
        java.lang.String address = fERRXa().getAddress();
        java.lang.String tx = djBIcL().AEQbTJ().getTx();
        if (tx == null) {
            tx = "";
        }
        AbstractC58185ywX abstractC58185ywXCopydefault = c13934dbuIxgjPv.copydefault(address, tx, "", (496 & 8) != 0 ? null : java.lang.Long.valueOf(dHguZz().AhwBna()), (496 & 16) != 0 ? null : null, (496 & 32) != 0, (java.util.List<EVMAuthorization>) ((496 & 64) != 0 ? null : null), (496 & 128) != 0 ? null : null, (java.util.List<EVMStateOverride>) ((496 & 256) != 0 ? null : null));
        final Function1 function1 = new Function1() { // from class: o.bJd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C8745bIX.OLrzqt(this.copydefault, (ResponseData) obj);
            }
        };
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXAEQbTJ = abstractC58185ywXCopydefault.AEQbTJ(new InterfaceC58229yxO() { // from class: o.bJf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C8745bIX.flVtFt(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        return abstractC58185ywXAEQbTJ;
    }

    public static final kotlin.Pair flVtFt(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (kotlin.Pair) function1.invoke(obj);
    }

    /* JADX DEBUG: Type inference failed for r4v1. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<com.okinc.network.okg.response.ResponseData<com.okinc.business.defi.biz.core.transaction.bean.BatchBroadcastModel>> */
    @Override // com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction
    public AbstractC58185ywX<ResponseData<BatchBroadcastModel>> OLrzqt(@NotNull final java.lang.String str, SubmitTxExpandBean submitTxExpandBean) {
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXKWHzl;
        Intrinsics.checkNotNullParameter(str, "");
        if (OuxcSI()) {
            abstractC58185ywXKWHzl = UeEOUB();
        } else {
            abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(C56390yDp.OLrzqt(java.lang.Boolean.TRUE, ""));
            Intrinsics.copydefault(abstractC58185ywXKWHzl);
        }
        final Function1 function1 = new Function1() { // from class: o.bJC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C8745bIX.EZpvd(this.OLrzqt, str, (kotlin.Pair) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXKWHzl2 = abstractC58185ywXKWHzl.KWHzl(new InterfaceC58229yxO() { // from class: o.bJB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C8745bIX.iRxXKY(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl2, "");
        return abstractC58185ywXKWHzl2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC60096zvd iRxXKY(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public static final InterfaceC60096zvd EZpvd(C8745bIX c8745bIX, java.lang.String str, kotlin.Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        if (((java.lang.Boolean) pair.getFirst()).booleanValue()) {
            CosmosSignedTx cosmosSignedTxKWHzl = c8745bIX.djBIcL().KWHzl(str);
            java.lang.String tx = cosmosSignedTxKWHzl.getTx();
            if (tx == null || tx.length() == 0) {
                return AbstractC58185ywX.KWHzl(new ResponseData(-5005, null, null, null, null, null, 62, null));
            }
            java.lang.String tx2 = cosmosSignedTxKWHzl.getTx();
            Intrinsics.copydefault((java.lang.Object) tx2);
            java.lang.String txHash = cosmosSignedTxKWHzl.getTxHash();
            BroadcastBean broadcastBeanGenerateBroadcastModel$default = AbstractC8601bFm.generateBroadcastModel$default(c8745bIX, tx2, txHash == null ? "" : txHash, null, null, 12, null);
            broadcastBeanGenerateBroadcastModel$default.setSignRawData(c8745bIX.djBIcL().KWHzl(cosmosSignedTxKWHzl));
            Unit unit = Unit.INSTANCE;
            return AbstractC58185ywX.KWHzl(new ResponseData(-5001, null, null, null, new BatchBroadcastModel(C56402yEa.EZpvd(broadcastBeanGenerateBroadcastModel$default), (java.util.List) null, (java.lang.Boolean) null, (java.lang.String) null, (java.lang.Boolean) null, (java.lang.Integer) null, (java.lang.String) null, (SignAuthType) null, 254, (DefaultConstructorMarker) null), null, 46, null));
        }
        return AbstractC58185ywX.KWHzl(new ResponseData(-5000, (java.lang.String) pair.getSecond(), null, null, null, null, 60, null));
    }

    @Override // com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction
    public AbstractC58185ywX<ResponseData<BatchBroadcastModel>> EZpvd(@NotNull final java.lang.String str, SubmitTxExpandBean submitTxExpandBean) {
        Intrinsics.checkNotNullParameter(str, "");
        final CosmosSignMessageTransaction cosmosSignMessageTransactionOLrzqt = djBIcL().OLrzqt();
        AbstractC58185ywX<ResponseData<CosmosSignedTx>> abstractC58185ywXAEQbTJ = AEQbTJ(str, cosmosSignMessageTransactionOLrzqt);
        final Function1 function1 = new Function1() { // from class: o.bJo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C8745bIX.AEQbTJ(this.copydefault, str, cosmosSignMessageTransactionOLrzqt, (ResponseData) obj);
            }
        };
        AbstractC58185ywX<R> abstractC58185ywXKWHzl = abstractC58185ywXAEQbTJ.KWHzl(new InterfaceC58229yxO() { // from class: o.bJq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C8745bIX.fvQaOB(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        return KWHzl((AbstractC58185ywX<ResponseData<CosmosSignedTx>>) abstractC58185ywXKWHzl);
    }

    public static final InterfaceC60096zvd fvQaOB(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public static final InterfaceC60096zvd AEQbTJ(C8745bIX c8745bIX, java.lang.String str, CosmosSignMessageTransaction cosmosSignMessageTransaction, final ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        if (c8745bIX.QwvEab() == 2) {
            AbstractC58185ywX<ResponseData<CosmosSignedTx>> abstractC58185ywXCopydefault = c8745bIX.copydefault(str, cosmosSignMessageTransaction);
            final Function1 function1 = new Function1() { // from class: o.bJr
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C8745bIX.AEQbTJ(responseData, (ResponseData) obj);
                }
            };
            return abstractC58185ywXCopydefault.AEQbTJ(new InterfaceC58229yxO() { // from class: o.bJx
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58229yxO
                public final java.lang.Object apply(java.lang.Object obj) {
                    return C8745bIX.gasjUx(function1, obj);
                }
            });
        }
        return AbstractC58185ywX.KWHzl(responseData);
    }

    public static final ResponseData gasjUx(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (ResponseData) function1.invoke(obj);
    }

    public static final ResponseData AEQbTJ(ResponseData responseData, ResponseData responseData2) {
        Intrinsics.checkNotNullParameter(responseData2, "");
        if (responseData2.getCode() == -5001) {
            java.lang.Object data = responseData.getData();
            Intrinsics.copydefault(data);
            java.lang.Object data2 = responseData2.getData();
            Intrinsics.copydefault(data2);
            return ResponseData.copy$default(responseData, 0, null, null, null, CosmosSignedTx.copy$default((CosmosSignedTx) data, null, ((CosmosSignedTx) data2).getSignature(), null, 5, null), null, 47, null);
        }
        return new ResponseData(-5005, null, null, null, null, null, 62, null);
    }

    public final AbstractC58185ywX<ResponseData<CosmosSignedTx>> AEQbTJ(java.lang.String str, final CosmosSignMessageTransaction cosmosSignMessageTransaction) {
        return C10965byR.OLrzqt.OLrzqt(str, dUDNAs(), dHguZz(), new Function0() { // from class: o.bJc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C8745bIX.AEQbTJ(this.copydefault, cosmosSignMessageTransaction);
            }
        }, new Function2() { // from class: o.bJg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C8745bIX.AEQbTJ(this.copydefault, (java.lang.String) obj, (RSV) obj2);
            }
        }, new Function1() { // from class: o.bJp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Boolean.valueOf(C8745bIX.copydefault((CosmosSignedTx) obj));
            }
        });
    }

    public static final TxMessage AEQbTJ(C8745bIX c8745bIX, CosmosSignMessageTransaction cosmosSignMessageTransaction) {
        return xYV.copydefault.AEQbTJ(c8745bIX.fERRXa().getPublicKey(), cosmosSignMessageTransaction, SignType.SignTypeAmino.getType());
    }

    public static final CosmosSignedTx AEQbTJ(C8745bIX c8745bIX, java.lang.String str, RSV rsv) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(rsv, "");
        return xYV.copydefault.EZpvd(c8745bIX.dHguZz().QKVWgx(), new RSVSignatureRawValue(rsv.getR(), rsv.getS(), rsv.getV(), str, null, 16, null));
    }

    public static final boolean copydefault(CosmosSignedTx cosmosSignedTx) {
        Intrinsics.checkNotNullParameter(cosmosSignedTx, "");
        java.lang.String tx = cosmosSignedTx.getTx();
        return !(tx == null || tx.length() == 0);
    }

    public final AbstractC58185ywX<ResponseData<CosmosSignedTx>> copydefault(java.lang.String str, final CosmosSignMessageTransaction cosmosSignMessageTransaction) {
        return C10965byR.OLrzqt.OLrzqt(str, dUDNAs(), dHguZz(), new Function0() { // from class: o.bJh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C8745bIX.KWHzl(this.EZpvd, cosmosSignMessageTransaction);
            }
        }, new Function2() { // from class: o.bJl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C8745bIX.OLrzqt(this.EZpvd, (java.lang.String) obj, (RSV) obj2);
            }
        }, new Function1() { // from class: o.bJj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Boolean.valueOf(C8745bIX.EZpvd((CosmosSignedTx) obj));
            }
        });
    }

    public static final TxMessage KWHzl(C8745bIX c8745bIX, CosmosSignMessageTransaction cosmosSignMessageTransaction) {
        return xYV.copydefault.AEQbTJ(c8745bIX.fERRXa().getPublicKey(), cosmosSignMessageTransaction, SignType.SignTypeAminoMsg.getType());
    }

    public static final CosmosSignedTx OLrzqt(C8745bIX c8745bIX, java.lang.String str, RSV rsv) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(rsv, "");
        return xYV.copydefault.EZpvd(c8745bIX.dHguZz().QKVWgx(), new RSVSignatureRawValue(rsv.getR(), rsv.getS(), rsv.getV(), str, java.lang.Integer.valueOf(SignType.SignTypeAminoMsg.getType())));
    }

    /* JADX INFO: renamed from: o.bIX$Activity */
    public static final class Activity<T> implements InterfaceC58187ywZ {
        public final /* synthetic */ java.lang.Object OLrzqt;
        public final /* synthetic */ java.lang.String copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(java.lang.Object obj, java.lang.String str) {
            this.OLrzqt = obj;
            this.copydefault = str;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: o.ywW<com.okinc.business.defi.biz.core.transaction.sign.cosmos.bean.CosmosSignInfo> */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // o.InterfaceC58187ywZ
        public final void subscribe(InterfaceC58184ywW<CosmosSignInfo> interfaceC58184ywW) {
            java.lang.Object objM7377constructorimpl;
            Intrinsics.checkNotNullParameter(interfaceC58184ywW, "");
            java.lang.String str = this.copydefault;
            java.lang.Object obj = this.OLrzqt;
            try {
                Result.Application application = Result.Companion;
                JsonObject asJsonObject = ((JsonObject) new Gson().fromJson(str, new TypeToken<JsonObject>() { // from class: o.bIX.Activity.2
                }.getType())).getAsJsonObject();
                if (asJsonObject.has("gasPrice") && asJsonObject.get("gasPrice").isJsonObject()) {
                    asJsonObject = ((JsonObject) new Gson().fromJson(str, new TypeToken<JsonObject>() { // from class: o.bIX.Activity.4
                    }.getType())).get("gasPrice").getAsJsonObject();
                }
                JsonObject jsonObject = (JsonObject) new Gson().fromJson(obj != null ? C33488mxR.EZpvd(obj) : null, new TypeToken<JsonObject>() { // from class: o.bIX.Activity.1
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

    public static final boolean EZpvd(CosmosSignedTx cosmosSignedTx) {
        Intrinsics.checkNotNullParameter(cosmosSignedTx, "");
        java.lang.String signature = cosmosSignedTx.getSignature();
        return !(signature == null || signature.length() == 0);
    }

    /* JADX DEBUG: Type inference failed for r3v1. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<com.okinc.network.okg.response.ResponseData<com.okinc.business.defi.biz.core.transaction.bean.BatchBroadcastModel>> */
    private final AbstractC58185ywX<ResponseData<BatchBroadcastModel>> KWHzl(AbstractC58185ywX<ResponseData<CosmosSignedTx>> abstractC58185ywX) {
        final Function1 function1 = new Function1() { // from class: o.bJn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C8745bIX.EZpvd(this.AEQbTJ, (ResponseData) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXAEQbTJ = abstractC58185ywX.AEQbTJ(new InterfaceC58229yxO() { // from class: o.bJm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C8745bIX.finit(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        return abstractC58185ywXAEQbTJ;
    }

    public static final ResponseData finit(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (ResponseData) function1.invoke(obj);
    }

    public static final ResponseData EZpvd(C8745bIX c8745bIX, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == -5001) {
            java.lang.Object data = responseData.getData();
            Intrinsics.copydefault(data);
            java.lang.String tx = ((CosmosSignedTx) data).getTx();
            Intrinsics.copydefault((java.lang.Object) tx);
            java.lang.Object data2 = responseData.getData();
            Intrinsics.copydefault(data2);
            java.lang.String txHash = ((CosmosSignedTx) data2).getTxHash();
            BroadcastBean broadcastBeanGenerateBroadcastModel$default = AbstractC8601bFm.generateBroadcastModel$default(c8745bIX, tx, txHash == null ? "" : txHash, null, null, 12, null);
            C8842bKO c8842bKODjBIcL = c8745bIX.djBIcL();
            java.lang.Object data3 = responseData.getData();
            Intrinsics.copydefault(data3);
            broadcastBeanGenerateBroadcastModel$default.setSignRawData(c8842bKODjBIcL.KWHzl((CosmosSignedTx) data3));
            Unit unit = Unit.INSTANCE;
            return new ResponseData(-5001, null, null, null, new BatchBroadcastModel(C56402yEa.EZpvd(broadcastBeanGenerateBroadcastModel$default), (java.util.List) null, (java.lang.Boolean) null, (java.lang.String) null, (java.lang.Boolean) null, (java.lang.Integer) null, (java.lang.String) null, (SignAuthType) null, 254, (DefaultConstructorMarker) null), null, 46, null);
        }
        return new ResponseData(responseData.getCode(), responseData.getMsg(), null, null, null, responseData.getError_code(), 28, null);
    }

    public static final kotlin.Pair gEmmrt(C8745bIX c8745bIX, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            java.lang.Object data = responseData.getData();
            Intrinsics.copydefault(data);
            c8745bIX.copydefault(((SignInfo) data).getSupportPush());
            KSerializer<CosmosSignInfo> kSerializerSerializer = CosmosSignInfo.Companion.serializer();
            java.lang.Object data2 = responseData.getData();
            Intrinsics.copydefault(data2);
            kotlinx.serialization.json.JsonObject info = ((SignInfo) data2).getInfo();
            Intrinsics.copydefault(info);
            c8745bIX.AEQbTJ((CosmosSignInfo) C54907xZt.OLrzqt(kSerializerSerializer, info.toString()));
            c8745bIX.ac_().OLrzqt(c8745bIX.EZpvd().getReserveFeeRatio());
            c8745bIX.fARcdN();
            return C56390yDp.OLrzqt(java.lang.Boolean.TRUE, "");
        }
        return C56390yDp.OLrzqt(java.lang.Boolean.FALSE, responseData.getMsg());
    }

    public static final kotlin.Pair OLrzqt(C8745bIX c8745bIX, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            java.lang.Object data = responseData.getData();
            Intrinsics.copydefault(data);
            c8745bIX.copydefault(C54862xYb.convertToBigIntegerString$default(((WalletGasLimitRes) data).getGasLimit(), false, (RoundingMode) null, 3, (java.lang.Object) null));
            c8745bIX.fARcdN();
            return C56390yDp.OLrzqt(java.lang.Boolean.TRUE, "");
        }
        return C56390yDp.OLrzqt(java.lang.Boolean.FALSE, responseData.getMsg());
    }
}
