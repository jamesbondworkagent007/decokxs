package o;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.reflect.TypeToken;
import com.okinc.business.defi.api.bean.SolDataFunction;
import com.okinc.business.defi.api.model.tx.SignAuthType;
import com.okinc.business.defi.api.model.tx.SubmitTxExpandBean;
import com.okinc.business.defi.api.model.tx.signdata.SolanaContractSignData;
import com.okinc.business.defi.biz.core.dapp.interaction.bean.DappTxResultBean;
import com.okinc.business.defi.biz.core.error.CoinMetaError;
import com.okinc.business.defi.biz.core.transaction.bean.BatchBroadcastModel;
import com.okinc.business.defi.biz.core.transaction.sign.solana.bean.SolanaExtJson;
import com.okinc.business.defi.biz.core.transaction.sign.solana.bean.SolanaSignInfo;
import com.okinc.business.defi.biz.core.transaction.sign.solana.bean.SolanaTxResult;
import com.okinc.business.defi.biz.core.transaction.sign.solana.bean.SolanaWCSignResult;
import com.okinc.business.defi.biz.net.bean.KYSPreTxCheckInfo;
import com.okinc.business.defi.biz.net.bean.PreExecTransactionReq;
import com.okinc.business.defi.biz.net.bean.SignInfo;
import com.okinc.business.defi.biz.net.bean.SignInfoReq;
import com.okinc.business.defi.biz.net.bean.SimulateTransactionParam;
import com.okinc.business.defi.biz.net.bean.TxToastCheckReq;
import com.okinc.business.defi.biz.net.bean.TxToastCheckRes;
import com.okinc.business.defi.wallet.transaction.moduleModel.bean.PreExecTransactionRes;
import com.okinc.business.defi.wallet.transaction.moduleModel.bean.TxInfoItem;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.wallet.core.sign.SignParams;
import com.okinc.wallet.core.sign.SignedTx;
import com.okinc.wallet.core.sign.solana.SolUnitLimitAndPrice;
import io.reactivex.BackpressureStrategy;
import java.math.BigDecimal;
import java.math.RoundingMode;
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
import o.InterfaceC9462bVz;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: o.bVC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C9413bVC extends AbstractC8601bFm<C9592bYW, SolanaContractSignData> implements InterfaceC9462bVz {
    public java.lang.String ORxRYg;
    public C9785bcD QUSxYX;
    public boolean QVAiDq;
    public SolanaSignInfo QbewEr;
    public java.util.List<SolUnitLimitAndPrice> dNCPSb;
    public int djSkpj;
    public java.lang.String fetchVPNInfo;
    public java.lang.String QfsBiF = "1";
    public java.util.List<SolDataFunction> djBIcL = yDY.AhwBna();
    public final java.util.ArrayList<java.lang.String> AYXKKw = new java.util.ArrayList<>();
    public final InterfaceC56387yDm OcIXYQ = C56392yDr.copydefault(new Function0() { // from class: o.bVQ
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C9413bVC.KWHzl(this.AEQbTJ);
        }
    });
    public final InterfaceC56387yDm RJOkX = C56392yDr.copydefault(new Function0() { // from class: o.bWf
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C9413bVC.copydefault(this.EZpvd);
        }
    });
    public boolean AhwBna = true;
    public boolean valueOf = true;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final kotlin.Pair valueOf(kotlin.Pair pair, kotlin.Pair pair2) {
        Intrinsics.checkNotNullParameter(pair2, "");
        return pair;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction
    public void AYXKKw(boolean z) {
        this.valueOf = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction
    public void AhwBna(boolean z) {
        this.AhwBna = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC9462bVz
    public SolanaSignInfo AkhnZx() {
        return this.QbewEr;
    }

    @Override // o.AbstractC8564bFB
    public boolean DCUTEI() {
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void EZpvd(SolanaSignInfo solanaSignInfo) {
        this.QbewEr = solanaSignInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction
    public boolean ODXsMY() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction
    public boolean gwTjWJ() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC9462bVz
    public int isConnected() {
        return this.djSkpj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC9462bVz
    public java.util.ArrayList<java.lang.String> valueOf() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String values() {
        return this.QfsBiF;
    }

    @Override // o.InterfaceC9462bVz
    public java.lang.String AEQbTJ() {
        return InterfaceC9462bVz.Application.KWHzl(this);
    }

    public void AEQbTJ(int i) {
        InterfaceC9462bVz.Application.copydefault(this, i);
    }

    public void AEQbTJ(@NotNull AbstractC8564bFB<?, ?> abstractC8564bFB, @NotNull TxToastCheckRes txToastCheckRes) {
        InterfaceC9462bVz.Application.KWHzl(this, abstractC8564bFB, txToastCheckRes);
    }

    @Override // o.InterfaceC9462bVz
    public boolean AEQbTJ(java.lang.String str, java.lang.String str2) {
        return InterfaceC9462bVz.Application.copydefault(this, str, str2);
    }

    public boolean AhwBna(@NotNull AbstractC8564bFB<?, ?> abstractC8564bFB) {
        return InterfaceC9462bVz.Application.KWHzl(this, abstractC8564bFB);
    }

    @Override // o.InterfaceC9462bVz
    public java.lang.String EZpvd(java.lang.String str, java.lang.String str2) {
        return InterfaceC9462bVz.Application.KWHzl(this, str, str2);
    }

    @Override // o.InterfaceC9462bVz
    public BigDecimal EZpvd(java.lang.String str) {
        return InterfaceC9462bVz.Application.copydefault(this, str);
    }

    public C9785bcD EZpvd(@NotNull AbstractC8564bFB<?, ?> abstractC8564bFB, @NotNull TxToastCheckRes txToastCheckRes) {
        return InterfaceC9462bVz.Application.copydefault(this, abstractC8564bFB, txToastCheckRes);
    }

    @Override // o.InterfaceC9462bVz
    public boolean KWHzl() {
        return InterfaceC9462bVz.Application.copydefault(this);
    }

    @Override // o.InterfaceC9462bVz
    public java.lang.String OLrzqt(java.lang.String str, java.lang.String str2) {
        return InterfaceC9462bVz.Application.EZpvd(this, str, str2);
    }

    @Override // o.InterfaceC9462bVz
    public java.lang.String OLrzqt(boolean z, boolean z2) {
        return InterfaceC9462bVz.Application.EZpvd(this, z, z2);
    }

    @Override // o.InterfaceC9462bVz
    public java.util.List<java.lang.String> OLrzqt() {
        return InterfaceC9462bVz.Application.EZpvd(this);
    }

    @Override // o.InterfaceC9462bVz
    public java.lang.String copydefault(boolean z, boolean z2) {
        return InterfaceC9462bVz.Application.KWHzl(this, z, z2);
    }

    @Override // o.InterfaceC9462bVz
    public void copydefault(@NotNull java.util.List<java.lang.String> list) {
        InterfaceC9462bVz.Application.EZpvd(this, list);
    }

    @Override // o.InterfaceC9462bVz
    public boolean copydefault(java.lang.String str, java.lang.String str2) {
        return InterfaceC9462bVz.Application.AEQbTJ(this, str, str2);
    }

    @Override // o.InterfaceC9462bVz
    public boolean copydefault(@NotNull AbstractC8564bFB<?, ?> abstractC8564bFB, @NotNull TxToastCheckRes txToastCheckRes) {
        return InterfaceC9462bVz.Application.OLrzqt(this, abstractC8564bFB, txToastCheckRes);
    }

    public void fvQaOB() {
        InterfaceC9462bVz.Application.valueOf(this);
    }

    public SolanaExtJson giSNqX() {
        return InterfaceC9462bVz.Application.AEQbTJ(this);
    }

    /* JADX DEBUG: Method merged with bridge method: DXXBbs()Lo/bCW; */
    @Override // o.AbstractC8564bFB
    /* JADX INFO: renamed from: djBIcL, reason: merged with bridge method [inline-methods] */
    public C9592bYW fJNWhG() {
        return (C9592bYW) this.OcIXYQ.getValue();
    }

    public static final C9592bYW KWHzl(C9413bVC c9413bVC) {
        return new C9592bYW(c9413bVC, c9413bVC);
    }

    public final C9649bZa flVtFt() {
        return (C9649bZa) this.RJOkX.getValue();
    }

    public static final C9649bZa copydefault(C9413bVC c9413bVC) {
        return new C9649bZa(c9413bVC);
    }

    @Override // o.AbstractC8564bFB
    public AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> RJOkX() {
        return RcXXUw();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: SignData */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractC8601bFm
    public java.lang.String zuBGHE() {
        return ((SolanaContractSignData) QVsKAR()).getValue();
    }

    @Override // o.AbstractC8601bFm, o.AbstractC8564bFB
    public void x_() {
        super.x_();
        AhwBna(this);
    }

    public static final ResponseData DCJXGO(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (ResponseData) function1.invoke(obj);
    }

    /* JADX DEBUG: Type inference failed for r0v1. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<com.okinc.network.okg.response.ResponseData<java.lang.String>> */
    public AbstractC58185ywX<ResponseData<java.lang.String>> UeEOUB() {
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXFARcdN = fARcdN();
        final Function1 function1 = new Function1() { // from class: o.bWy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C9413bVC.copydefault((kotlin.Pair) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXAEQbTJ = abstractC58185ywXFARcdN.AEQbTJ(new InterfaceC58229yxO() { // from class: o.bWz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C9413bVC.DCJXGO(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        return abstractC58185ywXAEQbTJ;
    }

    public static final ResponseData copydefault(kotlin.Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        if (((java.lang.Boolean) pair.getFirst()).booleanValue()) {
            return new ResponseData(-5001, "", null, null, null, null, 60, null);
        }
        java.lang.String str = (java.lang.String) pair.getSecond();
        return new ResponseData(-5000, str == null ? "" : str, null, null, null, null, 60, null);
    }

    public boolean DbNXlk() {
        java.lang.String strZuBGHE = zuBGHE();
        return strZuBGHE == null || strZuBGHE.length() == 0 || C33129mqd.OLrzqt(zuBGHE(), "0");
    }

    public java.util.List<SolUnitLimitAndPrice> EZpvd() {
        java.lang.String computeUnitPrice;
        java.util.List<SolUnitLimitAndPrice> list = this.dNCPSb;
        if (list != null && !list.isEmpty() && !this.QVAiDq) {
            return this.dNCPSb;
        }
        this.QVAiDq = false;
        java.lang.String str = this.ORxRYg;
        if (str == null) {
            str = "";
        }
        java.util.List<SolUnitLimitAndPrice> listEZpvd = EZpvd(C56402yEa.EZpvd(str));
        this.dNCPSb = listEZpvd;
        SolUnitLimitAndPrice solUnitLimitAndPrice = listEZpvd != null ? (SolUnitLimitAndPrice) CollectionsKt___CollectionsKt.firstOrNull(listEZpvd) : null;
        if (solUnitLimitAndPrice == null || !solUnitLimitAndPrice.getDeserialized() || (computeUnitPrice = solUnitLimitAndPrice.getComputeUnitPrice()) == null || computeUnitPrice.length() == 0) {
            fvQaOB();
            java.util.List<SolUnitLimitAndPrice> list2 = this.dNCPSb;
            if (list2 == null || list2.isEmpty()) {
                SolanaSignInfo solanaSignInfoAkhnZx = AkhnZx();
                this.dNCPSb = C56402yEa.EZpvd(new SolUnitLimitAndPrice(true, solanaSignInfoAkhnZx != null ? solanaSignInfoAkhnZx.getComputeUnitPrice() : null, (java.lang.String) CollectionsKt___CollectionsKt.firstOrNull(OLrzqt())));
            }
        }
        return this.dNCPSb;
    }

    public final java.util.List<SolUnitLimitAndPrice> EZpvd(java.util.List<java.lang.String> list) {
        return C54892xZe.KWHzl.copydefault(new SignParams(dHguZz().QKVWgx(), dHguZz().fetchVPNInfo(), null, null, null, null, 0, null, true, false, null, 1788, null), C56423yEv.EZpvd(C56390yDp.OLrzqt("messages", list)));
    }

    public final boolean gasjUx() {
        java.util.List<java.lang.Integer> solanaFeePay;
        java.lang.Integer num;
        KYSPreTxCheckInfo kYSPreTxCheckInfoAb_ = ab_();
        return (kYSPreTxCheckInfoAb_ == null || (solanaFeePay = kYSPreTxCheckInfoAb_.getSolanaFeePay()) == null || (num = (java.lang.Integer) CollectionsKt___CollectionsKt.firstOrNull(solanaFeePay)) == null || num.intValue() != 0) ? false : true;
    }

    @Override // o.AbstractC8601bFm, o.AbstractC8564bFB
    public AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> r_() {
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXR_ = super.r_();
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXFARcdN = fARcdN();
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXRcXXUw = RcXXUw();
        final yHO yho = new yHO() { // from class: o.bWr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.yHO
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return C9413bVC.EZpvd((kotlin.Pair) obj, (kotlin.Pair) obj2, (kotlin.Pair) obj3);
            }
        };
        AbstractC58185ywX abstractC58185ywXEZpvd = AbstractC58185ywX.EZpvd(abstractC58185ywXR_, abstractC58185ywXFARcdN, abstractC58185ywXRcXXUw, new InterfaceC58228yxN() { // from class: o.bWs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58228yxN
            public final java.lang.Object AEQbTJ(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return C9413bVC.OLrzqt(yho, obj, obj2, obj3);
            }
        });
        final Function1 function1 = new Function1() { // from class: o.bWt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C9413bVC.gEmmrt(this.AEQbTJ, (kotlin.Pair) obj);
            }
        };
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXAEQbTJ = abstractC58185ywXEZpvd.AEQbTJ(new InterfaceC58229yxO() { // from class: o.bWu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C9413bVC.getPostValueLengthLimit(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        return abstractC58185ywXAEQbTJ;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Pair OLrzqt(yHO yho, java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        Intrinsics.checkNotNullParameter(obj, "");
        Intrinsics.checkNotNullParameter(obj2, "");
        Intrinsics.checkNotNullParameter(obj3, "");
        return (kotlin.Pair) yho.invoke(obj, obj2, obj3);
    }

    public static final kotlin.Pair EZpvd(kotlin.Pair pair, kotlin.Pair pair2, kotlin.Pair pair3) {
        Intrinsics.checkNotNullParameter(pair, "");
        Intrinsics.checkNotNullParameter(pair2, "");
        Intrinsics.checkNotNullParameter(pair3, "");
        return !((java.lang.Boolean) pair.getFirst()).booleanValue() ? pair : !((java.lang.Boolean) pair2.getFirst()).booleanValue() ? pair2 : !((java.lang.Boolean) pair3.getFirst()).booleanValue() ? pair3 : C56390yDp.OLrzqt(java.lang.Boolean.TRUE, null);
    }

    public static final kotlin.Pair getPostValueLengthLimit(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (kotlin.Pair) function1.invoke(obj);
    }

    public static final kotlin.Pair gEmmrt(C9413bVC c9413bVC, kotlin.Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        if (((java.lang.Boolean) pair.getFirst()).booleanValue()) {
            c9413bVC.AEQbTJ(0);
            return pair;
        }
        if (c9413bVC.UlJrfe().AEQbTJ(C56524yIo.AEQbTJ(C9868bdh.class)) || c9413bVC.fetchVPNInfo == null) {
            return pair;
        }
        c9413bVC.UlJrfe().AEQbTJ(new C9868bdh(false, c9413bVC.fetchVPNInfo, null, null, 12, null));
        return C56390yDp.OLrzqt(java.lang.Boolean.TRUE, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r5v6, resolved type: SignData */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractC8601bFm
    public java.lang.String AEQbTJ(boolean z) {
        if (z) {
            if (this.djBIcL.isEmpty()) {
                java.lang.String data = ((SolanaContractSignData) QVsKAR()).getData();
                if (data != null) {
                    return data;
                }
            } else {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                int i = 0;
                for (java.lang.Object obj : this.djBIcL) {
                    if (i < 0) {
                        yDY.AYXKKw();
                    }
                    SolDataFunction solDataFunction = (SolDataFunction) obj;
                    sb.append(solDataFunction.getMethodName());
                    sb.append("\n");
                    sb.append(solDataFunction.getData());
                    if (i < this.djBIcL.size() - 1) {
                        sb.append("\n\n");
                    }
                    i++;
                }
                java.lang.String string = sb.toString();
                Intrinsics.copydefault((java.lang.Object) string);
                return string;
            }
        }
        return "";
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: SignData */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractC8564bFB
    public java.lang.String zLjUOn() {
        java.lang.String to = ((SolanaContractSignData) QVsKAR()).getTo();
        return to == null ? "" : to;
    }

    public static final Unit DXXBbs(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (Unit) function1.invoke(obj);
    }

    /* JADX DEBUG: Type inference failed for r0v1. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<kotlin.Unit> */
    @Override // o.AbstractC8601bFm, o.AbstractC8564bFB
    public AbstractC58185ywX<Unit> p_() {
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXFARcdN = fARcdN();
        final Function1 function1 = new Function1() { // from class: o.bVH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C9413bVC.AhwBna(this.OLrzqt, (kotlin.Pair) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXAEQbTJ = abstractC58185ywXFARcdN.AEQbTJ(new InterfaceC58229yxO() { // from class: o.bVK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C9413bVC.DXXBbs(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        return abstractC58185ywXAEQbTJ;
    }

    public static final Unit AhwBna(C9413bVC c9413bVC, kotlin.Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        if (((java.lang.Boolean) pair.getFirst()).booleanValue()) {
            c9413bVC.AEQbTJ(3);
        }
        return Unit.INSTANCE;
    }

    public static final InterfaceC60096zvd OuxcSI(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    @Override // o.AbstractC8564bFB
    public AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> DbNXlk(@NotNull final java.lang.String str) {
        AbstractC58185ywX abstractC58185ywXKWHzl;
        Intrinsics.checkNotNullParameter(str, "");
        SolanaSignInfo solanaSignInfoAkhnZx = AkhnZx();
        if (solanaSignInfoAkhnZx == null || str.length() == 0) {
            abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(solanaSignInfoAkhnZx);
            Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        } else {
            abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(new Activity(solanaSignInfoAkhnZx, str), BackpressureStrategy.BUFFER).copydefault(yBP.AEQbTJ()).KWHzl(C58266yxz.OLrzqt());
            Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        }
        final Function1 function1 = new Function1() { // from class: o.bWm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C9413bVC.copydefault(this.copydefault, str, (SolanaSignInfo) obj);
            }
        };
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXKWHzl2 = abstractC58185ywXKWHzl.KWHzl(new InterfaceC58229yxO() { // from class: o.bWl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C9413bVC.OuxcSI(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl2, "");
        return abstractC58185ywXKWHzl2;
    }

    public static final InterfaceC60096zvd copydefault(C9413bVC c9413bVC, java.lang.String str, SolanaSignInfo solanaSignInfo) {
        Intrinsics.checkNotNullParameter(solanaSignInfo, "");
        c9413bVC.EZpvd(solanaSignInfo);
        return super.DbNXlk(str);
    }

    @Override // o.AbstractC8601bFm, com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction
    public java.util.ArrayList<java.lang.Integer> getNewProxyInstance() {
        java.util.ArrayList<java.lang.Integer> arrayList = new java.util.ArrayList<>();
        arrayList.add(8);
        arrayList.add(9);
        return arrayList;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v2, resolved type: SignData */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction
    public PreExecTransactionReq RdAHlO() {
        PreExecTransactionReq preExecTransactionReqRdAHlO = super.RdAHlO();
        Gson gson = new Gson();
        java.lang.String str = this.ORxRYg;
        if (str == null) {
            str = "";
        }
        preExecTransactionReqRdAHlO.setDappData(gson.toJson(C56402yEa.EZpvd(new SimulateTransactionParam(str, false, true))));
        java.lang.String solanaMethod = ((SolanaContractSignData) QVsKAR()).getSolanaMethod();
        if (solanaMethod == null) {
            solanaMethod = "wallet_sol_contact";
        }
        preExecTransactionReqRdAHlO.setMethod(solanaMethod);
        return preExecTransactionReqRdAHlO;
    }

    public static final InterfaceC60096zvd zuWLRA(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    /* JADX DEBUG: Type inference failed for r5v1. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<com.okinc.network.okg.response.ResponseData<o.bbT>> */
    @Override // com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction
    public AbstractC58185ywX<ResponseData<C9748bbT>> AEQbTJ(@NotNull final java.lang.String str, final SubmitTxExpandBean submitTxExpandBean) {
        Intrinsics.checkNotNullParameter(str, "");
        AbstractC58185ywX<ResponseData<java.lang.String>> abstractC58185ywXUeEOUB = UeEOUB();
        final Function1 function1 = new Function1() { // from class: o.bWa
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C9413bVC.KWHzl(this.OLrzqt, str, submitTxExpandBean, (ResponseData) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXKWHzl = abstractC58185ywXUeEOUB.KWHzl(new InterfaceC58229yxO() { // from class: o.bVY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C9413bVC.zuWLRA(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        return abstractC58185ywXKWHzl;
    }

    public static final InterfaceC60096zvd KWHzl(C9413bVC c9413bVC, java.lang.String str, SubmitTxExpandBean submitTxExpandBean, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == -5001) {
            return super.AEQbTJ(str, submitTxExpandBean);
        }
        AbstractC58185ywX abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(new ResponseData(responseData.getCode(), responseData.getMsg(), null, null, null, responseData.getError_code(), 28, null));
        Intrinsics.copydefault(abstractC58185ywXKWHzl);
        return abstractC58185ywXKWHzl;
    }

    @Override // com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction
    public AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> KWHzl(boolean z) {
        if (!z) {
            AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(C56390yDp.OLrzqt(java.lang.Boolean.TRUE, null));
            Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
            return abstractC58185ywXKWHzl;
        }
        return RcXXUw();
    }

    @Override // o.AbstractC8601bFm, o.AbstractC8564bFB, com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction
    public TxToastCheckReq i_() {
        TxToastCheckReq txToastCheckReqI_ = super.i_();
        java.lang.String str = this.ORxRYg;
        if (str == null) {
            str = "";
        }
        txToastCheckReqI_.setSimulateTransactionParamList(C56402yEa.EZpvd(new SimulateTransactionParam(str, false, true)));
        return txToastCheckReqI_;
    }

    @Override // o.AbstractC8601bFm, com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction
    public void AEQbTJ(@NotNull java.util.List<TxToastCheckRes> list) {
        Intrinsics.checkNotNullParameter(list, "");
        super.AEQbTJ(list);
        for (TxToastCheckRes txToastCheckRes : list) {
            java.lang.Integer checkType = txToastCheckRes.getCheckType();
            if (checkType != null && checkType.intValue() == 8) {
                this.QUSxYX = EZpvd(this, txToastCheckRes);
            } else if (checkType != null && checkType.intValue() == 9) {
                AEQbTJ(this, txToastCheckRes);
            }
        }
    }

    /* JADX INFO: renamed from: o.bVC$Activity */
    public static final class Activity<T> implements InterfaceC58187ywZ {
        public final /* synthetic */ java.lang.Object AEQbTJ;
        public final /* synthetic */ java.lang.String copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(java.lang.Object obj, java.lang.String str) {
            this.AEQbTJ = obj;
            this.copydefault = str;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: o.ywW<com.okinc.business.defi.biz.core.transaction.sign.solana.bean.SolanaSignInfo> */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // o.InterfaceC58187ywZ
        public final void subscribe(InterfaceC58184ywW<SolanaSignInfo> interfaceC58184ywW) {
            java.lang.Object objM7377constructorimpl;
            Intrinsics.checkNotNullParameter(interfaceC58184ywW, "");
            java.lang.String str = this.copydefault;
            java.lang.Object obj = this.AEQbTJ;
            try {
                Result.Application application = Result.Companion;
                JsonObject asJsonObject = ((JsonObject) new Gson().fromJson(str, new TypeToken<JsonObject>() { // from class: o.bVC.Activity.3
                }.getType())).getAsJsonObject();
                if (asJsonObject.has("gasPrice") && asJsonObject.get("gasPrice").isJsonObject()) {
                    asJsonObject = ((JsonObject) new Gson().fromJson(str, new TypeToken<JsonObject>() { // from class: o.bVC.Activity.4
                    }.getType())).get("gasPrice").getAsJsonObject();
                }
                JsonObject jsonObject = (JsonObject) new Gson().fromJson(obj != null ? C33488mxR.EZpvd(obj) : null, new TypeToken<JsonObject>() { // from class: o.bVC.Activity.2
                }.getType());
                C12764ctD c12764ctD = C12764ctD.OLrzqt;
                Intrinsics.copydefault(jsonObject);
                Intrinsics.copydefault(asJsonObject);
                objM7377constructorimpl = Result.m7377constructorimpl(new Gson().fromJson((JsonElement) c12764ctD.OLrzqt(jsonObject, asJsonObject), (java.lang.Class) SolanaSignInfo.class));
            } catch (java.lang.Throwable th) {
                Result.Application application2 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
            java.lang.Object obj2 = Result.m7383isFailureimpl(objM7377constructorimpl) ? null : objM7377constructorimpl;
            if (obj2 == null) {
                obj2 = this.AEQbTJ;
            }
            interfaceC58184ywW.onNext(obj2);
            interfaceC58184ywW.onComplete();
        }
    }

    @Override // o.AbstractC8601bFm, com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction
    public void KWHzl(@NotNull PreExecTransactionRes preExecTransactionRes) {
        java.util.List<java.lang.String> listAhwBna;
        Intrinsics.checkNotNullParameter(preExecTransactionRes, "");
        super.KWHzl(preExecTransactionRes);
        TxInfoItem txInfo = preExecTransactionRes.getTxInfo();
        if (txInfo == null || (listAhwBna = txInfo.getUnitGasLimitList()) == null) {
            listAhwBna = yDY.AhwBna();
        }
        copydefault(listAhwBna);
        EZpvd();
    }

    @Override // o.AbstractC8601bFm, o.AbstractC8564bFB
    public void AhwBna() throws CoinMetaError {
        if (this.QUSxYX instanceof C9784bcC) {
            return;
        }
        super.AhwBna();
    }

    public static final kotlin.Pair DCUTEI(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (kotlin.Pair) function1.invoke(obj);
    }

    /* JADX DEBUG: Type inference failed for r0v1. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> */
    @Override // o.AbstractC8564bFB
    public AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> ffGIBT() {
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXFARcdN = fARcdN();
        final Function1 function1 = new Function1() { // from class: o.bVE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C9413bVC.AYXKKw(this.KWHzl, (kotlin.Pair) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXAEQbTJ = abstractC58185ywXFARcdN.AEQbTJ(new InterfaceC58229yxO() { // from class: o.bVF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C9413bVC.DCUTEI(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        return abstractC58185ywXAEQbTJ;
    }

    public static final kotlin.Pair AYXKKw(C9413bVC c9413bVC, kotlin.Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        if (((java.lang.Boolean) pair.getFirst()).booleanValue()) {
            c9413bVC.AEQbTJ(1);
        }
        return pair;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: SignData */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction
    public java.lang.String ag_() {
        java.lang.String from = ((SolanaContractSignData) QVsKAR()).getFrom();
        return from == null ? "" : from;
    }

    public static final InterfaceC58261yxu ffGIBT(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58261yxu) function1.invoke(obj);
    }

    @Override // com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction
    public AbstractC58185ywX<ResponseData<BatchBroadcastModel>> OLrzqt(@NotNull final java.lang.String str, SubmitTxExpandBean submitTxExpandBean) {
        Intrinsics.checkNotNullParameter(str, "");
        AbstractC58260yxt<ResponseData<SolanaTxResult>> abstractC58260yxtGEmmrt = gEmmrt(true);
        final Function1 function1 = new Function1() { // from class: o.bWv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C9413bVC.OLrzqt(this.OLrzqt, str, (ResponseData) obj);
            }
        };
        AbstractC58185ywX<ResponseData<SignedTx>> abstractC58185ywXEZpvd = abstractC58260yxtGEmmrt.OLrzqt(new InterfaceC58229yxO() { // from class: o.bWA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C9413bVC.ffGIBT(function1, obj);
            }
        }).EZpvd();
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXEZpvd, "");
        return OLrzqt(abstractC58185ywXEZpvd);
    }

    public static final InterfaceC58261yxu OLrzqt(C9413bVC c9413bVC, java.lang.String str, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == -5001) {
            return c9413bVC.flVtFt().OLrzqt(str, (SolanaTxResult) responseData.getData());
        }
        AbstractC58260yxt abstractC58260yxtCopydefault = AbstractC58260yxt.copydefault(new ResponseData(responseData.getCode(), responseData.getMsg(), null, null, null, null, 60, null));
        Intrinsics.copydefault(abstractC58260yxtCopydefault);
        return abstractC58260yxtCopydefault;
    }

    @Override // com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction
    public java.lang.String KWHzl(@NotNull ResponseData<DappTxResultBean> responseData) {
        java.lang.String txHash;
        Intrinsics.checkNotNullParameter(responseData, "");
        DappTxResultBean data = responseData.getData();
        if (data == null || (txHash = data.getTxHash()) == null) {
            return null;
        }
        return C54907xZt.encodeToString$default(SolanaWCSignResult.Companion.serializer(), new SolanaWCSignResult(txHash), false, 2, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r5v2, resolved type: SignData */
    /* JADX DEBUG: Type inference failed for r0v2. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> */
    /* JADX WARN: Multi-variable type inference failed */
    private final AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> fARcdN() {
        C13934dbu c13934dbuIxgjPv = ixgjPv();
        java.lang.String strOxVOHk = OxVOHk();
        java.lang.String strDmq = Dmq();
        long jAhwBna = dHguZz().AhwBna();
        AbstractC58185ywX<ResponseData<SignInfo>> abstractC58185ywXCopydefault = c13934dbuIxgjPv.copydefault(strOxVOHk, strDmq, new SignInfoReq(java.lang.String.valueOf(jAhwBna), fERRXa().getAddress(), zLjUOn(), ai_(), (java.lang.String) null, C54862xYb.convertToBigIntegerString$default(zuBGHE(), true, (RoundingMode) null, 2, (java.lang.Object) null), ((SolanaContractSignData) QVsKAR()).getAccountLength(), (java.lang.Integer) null, (java.lang.Long) null, (java.lang.Long) null, (java.lang.String) null, (java.lang.Integer) null, (java.lang.Boolean) null, 8064, (DefaultConstructorMarker) null));
        final Function1 function1 = new Function1() { // from class: o.bVZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C9413bVC.AYXKKw(this.copydefault, (ResponseData) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXAEQbTJ = abstractC58185ywXCopydefault.AEQbTJ(new InterfaceC58229yxO() { // from class: o.bWd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C9413bVC.ODWQjV(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        return abstractC58185ywXAEQbTJ;
    }

    public static final kotlin.Pair ODWQjV(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (kotlin.Pair) function1.invoke(obj);
    }

    /* JADX DEBUG: Type inference failed for r0v2. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> */
    public final AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> RcXXUw() {
        if (!ODXsMY() && getNewProxyInstance().isEmpty()) {
            AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(C56390yDp.OLrzqt(java.lang.Boolean.TRUE, null));
            Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
            return abstractC58185ywXKWHzl;
        }
        AbstractC58260yxt<ResponseData<SolanaTxResult>> abstractC58260yxtDjSkpj = djSkpj();
        final Function1 function1 = new Function1() { // from class: o.bWi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C9413bVC.djBIcL(this.EZpvd, (ResponseData) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXKWHzl2 = abstractC58260yxtDjSkpj.KWHzl(new InterfaceC58229yxO() { // from class: o.bWo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C9413bVC.accept(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl2, "");
        return abstractC58185ywXKWHzl2;
    }

    public static final InterfaceC60096zvd accept(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public static final InterfaceC60096zvd djBIcL(final C9413bVC c9413bVC, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == -5001) {
            SolanaTxResult solanaTxResult = (SolanaTxResult) responseData.getData();
            c9413bVC.ORxRYg = solanaTxResult != null ? solanaTxResult.getEncodeTransactionStr() : null;
            AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXKWHzl = super.KWHzl(true);
            final Function1 function1 = new Function1() { // from class: o.bVI
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C9413bVC.valueOf(this.AEQbTJ, (kotlin.Pair) obj);
                }
            };
            return abstractC58185ywXKWHzl.KWHzl(new InterfaceC58229yxO() { // from class: o.bVL
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58229yxO
                public final java.lang.Object apply(java.lang.Object obj) {
                    return C9413bVC.RlQdEF(function1, obj);
                }
            });
        }
        return AbstractC58185ywX.KWHzl(C56390yDp.OLrzqt(java.lang.Boolean.FALSE, responseData.getMsg()));
    }

    public static final InterfaceC60096zvd RlQdEF(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: SignData */
    /* JADX WARN: Multi-variable type inference failed */
    public static final InterfaceC60096zvd valueOf(final C9413bVC c9413bVC, final kotlin.Pair pair) {
        AbstractC58185ywX abstractC58185ywXKWHzl;
        Intrinsics.checkNotNullParameter(pair, "");
        if (C33129mqd.OLrzqt((java.lang.CharSequence) ((SolanaContractSignData) c9413bVC.QVsKAR()).getData())) {
            AbstractC58260yxt<ResponseData<SolanaTxResult>> abstractC58260yxtGEmmrt = c9413bVC.gEmmrt(true);
            final Function1 function1 = new Function1() { // from class: o.bWg
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C9413bVC.EZpvd(this.OLrzqt, pair, (ResponseData) obj);
                }
            };
            abstractC58185ywXKWHzl = abstractC58260yxtGEmmrt.KWHzl(new InterfaceC58229yxO() { // from class: o.bWk
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58229yxO
                public final java.lang.Object apply(java.lang.Object obj) {
                    return C9413bVC.DAIeex(function1, obj);
                }
            });
        } else {
            abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(pair);
        }
        final Function1 function12 = new Function1() { // from class: o.bWh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C9413bVC.djBIcL(this.AEQbTJ, (kotlin.Pair) obj);
            }
        };
        return abstractC58185ywXKWHzl.KWHzl(new InterfaceC58229yxO() { // from class: o.bWj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C9413bVC.AxsJAYsNCnLh(function12, obj);
            }
        });
    }

    public static final InterfaceC60096zvd DAIeex(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public static final InterfaceC60096zvd EZpvd(C9413bVC c9413bVC, kotlin.Pair pair, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == -5001) {
            SolanaTxResult solanaTxResult = (SolanaTxResult) responseData.getData();
            c9413bVC.ORxRYg = solanaTxResult != null ? solanaTxResult.getEncodeTransactionStr() : null;
            c9413bVC.QVAiDq = true;
            c9413bVC.EZpvd();
            if (c9413bVC.AkhnZx() != null) {
                c9413bVC.AEQbTJ(2);
            }
        }
        return AbstractC58185ywX.KWHzl(pair);
    }

    public static final InterfaceC60096zvd AxsJAYsNCnLh(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public static final kotlin.Pair QKudOq(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (kotlin.Pair) function1.invoke(obj);
    }

    public static final InterfaceC60096zvd djBIcL(C9413bVC c9413bVC, final kotlin.Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        java.lang.String str = c9413bVC.ORxRYg;
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXKWHzl = c9413bVC.KWHzl(str != null ? str : "");
        final Function1 function1 = new Function1() { // from class: o.bVJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C9413bVC.valueOf(pair, (kotlin.Pair) obj);
            }
        };
        return abstractC58185ywXKWHzl.AEQbTJ(new InterfaceC58229yxO() { // from class: o.bVN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C9413bVC.QKudOq(function1, obj);
            }
        });
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: SignData */
    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: SignData */
    /* JADX DEBUG: Multi-variable search result rejected for r0v6, resolved type: SignData */
    /* JADX DEBUG: Type inference failed for r0v16. Raw type applied. Possible types: o.yxt<R>, java.lang.Object, o.yxt<com.okinc.network.okg.response.ResponseData<com.okinc.business.defi.biz.core.transaction.sign.solana.bean.SolanaTxResult>> */
    /* JADX WARN: Multi-variable type inference failed */
    public final AbstractC58260yxt<ResponseData<SolanaTxResult>> djSkpj() {
        java.lang.String url = ((SolanaContractSignData) QVsKAR()).getUrl();
        if (url != null && url.length() != 0) {
            AbstractC58260yxt<ResponseData<SolanaTxResult>> abstractC58260yxtFZBcTu = fZBcTu();
            final Function1 function1 = new Function1() { // from class: o.bVM
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C9413bVC.valueOf(this.AEQbTJ, (ResponseData) obj);
                }
            };
            AbstractC58260yxt abstractC58260yxtCopydefault = abstractC58260yxtFZBcTu.copydefault(new InterfaceC58229yxO() { // from class: o.bVV
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58229yxO
                public final java.lang.Object apply(java.lang.Object obj) {
                    return C9413bVC.gkJEwt(function1, obj);
                }
            });
            Intrinsics.copydefault(abstractC58260yxtCopydefault);
            return abstractC58260yxtCopydefault;
        }
        if (((SolanaContractSignData) QVsKAR()).getEncodeStr() != null) {
            return dvKsVJ();
        }
        java.lang.String data = ((SolanaContractSignData) QVsKAR()).getData();
        if (data == null) {
            data = "";
        }
        AbstractC58260yxt<ResponseData<SolanaTxResult>> abstractC58260yxtCopydefault2 = AbstractC58260yxt.copydefault(new ResponseData(-5001, null, null, null, new SolanaTxResult((java.lang.String) null, data, 1, (DefaultConstructorMarker) null), null, 46, null));
        Intrinsics.copydefault(abstractC58260yxtCopydefault2);
        return abstractC58260yxtCopydefault2;
    }

    public static final ResponseData gkJEwt(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (ResponseData) function1.invoke(obj);
    }

    public static final ResponseData valueOf(C9413bVC c9413bVC, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        c9413bVC.fetchVPNInfo = responseData.getCode() == -5001 ? null : responseData.getMsg();
        return responseData;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: SignData */
    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: SignData */
    /* JADX WARN: Multi-variable type inference failed */
    public final AbstractC58260yxt<ResponseData<SolanaTxResult>> gEmmrt(boolean z) {
        java.lang.String url = ((SolanaContractSignData) QVsKAR()).getUrl();
        if (url != null && url.length() != 0) {
            return fZBcTu();
        }
        if (((SolanaContractSignData) QVsKAR()).getEncodeStr() != null) {
            return dvKsVJ();
        }
        return valueOf(z);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: SignData */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: SignData */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: SignData */
    /* JADX DEBUG: Type inference failed for r0v5. Raw type applied. Possible types: o.yxt<R>, java.lang.Object, o.yxt<com.okinc.network.okg.response.ResponseData<com.okinc.business.defi.biz.core.transaction.sign.solana.bean.SolanaTxResult>> */
    /* JADX WARN: Multi-variable type inference failed */
    public final AbstractC58260yxt<ResponseData<SolanaTxResult>> fZBcTu() {
        java.lang.String method = ((SolanaContractSignData) QVsKAR()).getMethod();
        java.lang.String url = ((SolanaContractSignData) QVsKAR()).getUrl();
        Intrinsics.copydefault((java.lang.Object) url);
        java.util.Map<java.lang.String, java.lang.Object> params = ((SolanaContractSignData) QVsKAR()).getParams();
        Intrinsics.copydefault(params);
        AbstractC58260yxt<JSONObject> abstractC58260yxtOLrzqt = OLrzqt(method, url, (java.util.Map<java.lang.String, ? extends java.lang.Object>) params).OLrzqt(new JSONObject());
        final Function1 function1 = new Function1() { // from class: o.bVW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C9413bVC.EZpvd(this.copydefault, (JSONObject) obj);
            }
        };
        AbstractC58260yxt abstractC58260yxtOLrzqt2 = abstractC58260yxtOLrzqt.OLrzqt(new InterfaceC58229yxO() { // from class: o.bVX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C9413bVC.DarRvM(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtOLrzqt2, "");
        return abstractC58260yxtOLrzqt2;
    }

    public static final InterfaceC58261yxu DarRvM(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58261yxu) function1.invoke(obj);
    }

    public static final InterfaceC58261yxu EZpvd(final C9413bVC c9413bVC, final JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(jSONObject, "");
        return AbstractC58260yxt.OLrzqt(new InterfaceC58259yxs() { // from class: o.bWw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58259yxs
            public final void subscribe(InterfaceC58257yxq interfaceC58257yxq) throws JSONException {
                C9413bVC.KWHzl(jSONObject, c9413bVC, interfaceC58257yxq);
            }
        });
    }

    public static final void KWHzl(JSONObject jSONObject, final C9413bVC c9413bVC, final InterfaceC58257yxq interfaceC58257yxq) throws JSONException {
        Intrinsics.checkNotNullParameter(interfaceC58257yxq, "");
        int i = jSONObject.getInt("code");
        if (i != 0) {
            interfaceC58257yxq.onSuccess(generateTxResultData$default(c9413bVC, null, C10857bwP.AEQbTJ("OKWSolanaSignContract", "code is " + i), 1, null));
            return;
        }
        C9649bZa c9649bZaFlVtFt = c9413bVC.flVtFt();
        Intrinsics.copydefault(jSONObject);
        JSONArray jSONArrayAEQbTJ = c9649bZaFlVtFt.AEQbTJ(jSONObject);
        if (jSONArrayAEQbTJ == null) {
            interfaceC58257yxq.onSuccess(generateTxResultData$default(c9413bVC, null, C10857bwP.AEQbTJ("OKWSolanaSignContract", "buffer is null"), 1, null));
        } else {
            c9413bVC.flVtFt().AEQbTJ(jSONArrayAEQbTJ, new Function1() { // from class: o.bVD
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C9413bVC.copydefault(interfaceC58257yxq, c9413bVC, (SolanaTxResult) obj);
                }
            });
        }
    }

    public static final Unit copydefault(InterfaceC58257yxq interfaceC58257yxq, C9413bVC c9413bVC, SolanaTxResult solanaTxResult) {
        java.lang.String encodeTransactionStr = solanaTxResult != null ? solanaTxResult.getEncodeTransactionStr() : null;
        if (encodeTransactionStr == null || encodeTransactionStr.length() == 0) {
            interfaceC58257yxq.onSuccess(generateTxResultData$default(c9413bVC, null, C10857bwP.AEQbTJ("OKWSolanaSignContract", "encodeTransactionStr is null or empty"), 1, null));
        } else {
            interfaceC58257yxq.onSuccess(generateTxResultData$default(c9413bVC, solanaTxResult, null, 2, null));
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: SignData */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: SignData */
    /* JADX WARN: Multi-variable type inference failed */
    public final AbstractC58260yxt<ResponseData<SolanaTxResult>> dvKsVJ() {
        java.lang.String encodeStr = ((SolanaContractSignData) QVsKAR()).getEncodeStr();
        if (encodeStr == null) {
            encodeStr = "";
        }
        java.lang.String encodeTransactionStr = ((SolanaContractSignData) QVsKAR()).getEncodeTransactionStr();
        if (encodeTransactionStr == null) {
            encodeTransactionStr = "";
        }
        AbstractC58260yxt<ResponseData<SolanaTxResult>> abstractC58260yxtCopydefault = AbstractC58260yxt.copydefault(new ResponseData(-5001, null, null, null, new SolanaTxResult(encodeStr, encodeTransactionStr), null, 46, null));
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtCopydefault, "");
        return abstractC58260yxtCopydefault;
    }

    public static /* synthetic */ AbstractC58260yxt generateTransactionWithNewBlockHash$default(C9413bVC c9413bVC, boolean z, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: generateTransactionWithNewBlockHash");
        }
        if ((i & 1) != 0) {
            z = false;
        }
        return c9413bVC.valueOf(z);
    }

    public final AbstractC58260yxt<ResponseData<SolanaTxResult>> valueOf(final boolean z) {
        AbstractC58260yxt<ResponseData<SolanaTxResult>> abstractC58260yxtOLrzqt = AbstractC58260yxt.OLrzqt(new InterfaceC58259yxs() { // from class: o.bVP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58259yxs
            public final void subscribe(InterfaceC58257yxq interfaceC58257yxq) {
                C9413bVC.KWHzl(this.OLrzqt, z, interfaceC58257yxq);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtOLrzqt, "");
        return abstractC58260yxtOLrzqt;
    }

    public static final void KWHzl(final C9413bVC c9413bVC, final boolean z, final InterfaceC58257yxq interfaceC58257yxq) {
        Intrinsics.checkNotNullParameter(interfaceC58257yxq, "");
        ((InterfaceC9846bdL) C43251rlk.copydefault(InterfaceC9846bdL.class)).copydefault("501", new Function1() { // from class: o.bWp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C9413bVC.EZpvd(this.KWHzl, interfaceC58257yxq, z, (java.lang.String) obj);
            }
        }, new Function1() { // from class: o.bWq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C9413bVC.KWHzl(this.EZpvd, interfaceC58257yxq, z, (java.lang.String) obj);
            }
        });
    }

    public static final Unit EZpvd(C9413bVC c9413bVC, InterfaceC58257yxq interfaceC58257yxq, boolean z, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (!C33129mqd.OLrzqt((java.lang.CharSequence) str)) {
            str = "/fullnode/sol/discover/rpc";
        }
        C9649bZa c9649bZaFlVtFt = c9413bVC.flVtFt();
        Intrinsics.copydefault(interfaceC58257yxq);
        c9649bZaFlVtFt.copydefault((InterfaceC58257yxq<ResponseData<SolanaTxResult>>) interfaceC58257yxq, str, z, false);
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(C9413bVC c9413bVC, InterfaceC58257yxq interfaceC58257yxq, boolean z, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C9649bZa c9649bZaFlVtFt = c9413bVC.flVtFt();
        Intrinsics.copydefault(interfaceC58257yxq);
        c9649bZaFlVtFt.copydefault((InterfaceC58257yxq<ResponseData<SolanaTxResult>>) interfaceC58257yxq, "/fullnode/sol/discover/rpc", z, false);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ ResponseData generateTxResultData$default(C9413bVC c9413bVC, SolanaTxResult solanaTxResult, java.lang.String str, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: generateTxResultData");
        }
        if ((i & 1) != 0) {
            solanaTxResult = null;
        }
        if ((i & 2) != 0) {
            str = "";
        }
        return c9413bVC.copydefault(solanaTxResult, str);
    }

    public final ResponseData<SolanaTxResult> copydefault(SolanaTxResult solanaTxResult, java.lang.String str) {
        java.lang.String encodeStr = solanaTxResult != null ? solanaTxResult.getEncodeStr() : null;
        if (encodeStr != null && encodeStr.length() != 0) {
            java.lang.String encodeTransactionStr = solanaTxResult != null ? solanaTxResult.getEncodeTransactionStr() : null;
            if (encodeTransactionStr != null && encodeTransactionStr.length() != 0) {
                return new ResponseData<>(-5001, null, null, null, solanaTxResult, null, 46, null);
            }
        }
        return new ResponseData<>(-5005, str, null, null, null, null, 60, null);
    }

    public static final ResponseData iZzfmt(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (ResponseData) function1.invoke(obj);
    }

    /* JADX DEBUG: Type inference failed for r4v1. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<com.okinc.network.okg.response.ResponseData<com.okinc.business.defi.biz.core.transaction.bean.BatchBroadcastModel>> */
    public final AbstractC58185ywX<ResponseData<BatchBroadcastModel>> OLrzqt(@NotNull AbstractC58185ywX<ResponseData<SignedTx>> abstractC58185ywX) {
        Intrinsics.checkNotNullParameter(abstractC58185ywX, "");
        final Function1 function1 = new Function1() { // from class: o.bWc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C9413bVC.OLrzqt(this.EZpvd, (ResponseData) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXAEQbTJ = abstractC58185ywX.AEQbTJ(new InterfaceC58229yxO() { // from class: o.bWb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C9413bVC.iZzfmt(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        return abstractC58185ywXAEQbTJ;
    }

    public static final ResponseData OLrzqt(C9413bVC c9413bVC, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == -5001) {
            SignedTx signedTx = (SignedTx) responseData.getData();
            java.lang.String tx = signedTx != null ? signedTx.getTx() : null;
            java.lang.String str = tx == null ? "" : tx;
            SignedTx signedTx2 = (SignedTx) responseData.getData();
            java.lang.String txHash = signedTx2 != null ? signedTx2.getTxHash() : null;
            return new ResponseData(-5001, null, null, null, new BatchBroadcastModel(C56402yEa.EZpvd(AbstractC8601bFm.generateBroadcastModel$default(c9413bVC, str, txHash == null ? "" : txHash, null, c9413bVC.giSNqX(), 4, null)), (java.util.List) null, (java.lang.Boolean) null, (java.lang.String) null, (java.lang.Boolean) null, (java.lang.Integer) null, (java.lang.String) null, (SignAuthType) null, 254, (DefaultConstructorMarker) null), null, 46, null);
        }
        return new ResponseData(responseData.getCode(), responseData.getMsg(), null, null, null, responseData.getError_code(), 28, null);
    }

    public final AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> KWHzl(java.lang.String str) {
        final java.util.List listEZpvd = C56402yEa.EZpvd(str);
        InterfaceC58187ywZ interfaceC58187ywZ = new InterfaceC58187ywZ() { // from class: o.bVS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58187ywZ
            public final void subscribe(InterfaceC58184ywW interfaceC58184ywW) {
                C9413bVC.OLrzqt(this.copydefault, listEZpvd, interfaceC58184ywW);
            }
        };
        BackpressureStrategy backpressureStrategy = BackpressureStrategy.BUFFER;
        AbstractC58185ywX abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(interfaceC58187ywZ, backpressureStrategy);
        AbstractC58185ywX abstractC58185ywXKWHzl2 = AbstractC58185ywX.KWHzl(new InterfaceC58187ywZ() { // from class: o.bVU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58187ywZ
            public final void subscribe(InterfaceC58184ywW interfaceC58184ywW) {
                C9413bVC.EZpvd(this.AEQbTJ, listEZpvd, interfaceC58184ywW);
            }
        }, backpressureStrategy);
        final Function2 function2 = new Function2() { // from class: o.bVR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C9413bVC.KWHzl((Unit) obj, (Unit) obj2);
            }
        };
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXEZpvd = AbstractC58185ywX.EZpvd(abstractC58185ywXKWHzl, abstractC58185ywXKWHzl2, new InterfaceC58223yxI() { // from class: o.bVT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58223yxI
            public final java.lang.Object apply(java.lang.Object obj, java.lang.Object obj2) {
                return C9413bVC.copydefault(function2, obj, obj2);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXEZpvd, "");
        return abstractC58185ywXEZpvd;
    }

    public static final void OLrzqt(final C9413bVC c9413bVC, java.util.List list, final InterfaceC58184ywW interfaceC58184ywW) {
        Intrinsics.checkNotNullParameter(interfaceC58184ywW, "");
        c9413bVC.flVtFt().AEQbTJ((java.util.List<java.lang.String>) list, new Function1() { // from class: o.bVO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C9413bVC.EZpvd(this.copydefault, interfaceC58184ywW, (java.lang.String) obj);
            }
        });
    }

    public static final Unit EZpvd(C9413bVC c9413bVC, InterfaceC58184ywW interfaceC58184ywW, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        c9413bVC.QfsBiF = str;
        Unit unit = Unit.INSTANCE;
        interfaceC58184ywW.onNext(unit);
        interfaceC58184ywW.onComplete();
        return unit;
    }

    public static final void EZpvd(final C9413bVC c9413bVC, java.util.List list, final InterfaceC58184ywW interfaceC58184ywW) {
        Intrinsics.checkNotNullParameter(interfaceC58184ywW, "");
        c9413bVC.flVtFt().KWHzl((java.util.List<java.lang.String>) list, new Function1() { // from class: o.bWe
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C9413bVC.copydefault(this.EZpvd, interfaceC58184ywW, (java.util.List) obj);
            }
        });
    }

    public static final Unit copydefault(C9413bVC c9413bVC, InterfaceC58184ywW interfaceC58184ywW, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        java.util.List<SolDataFunction> listAhwBna = (java.util.List) CollectionsKt___CollectionsKt.firstOrNull(list);
        if (listAhwBna == null) {
            listAhwBna = yDY.AhwBna();
        }
        c9413bVC.djBIcL = listAhwBna;
        Unit unit = Unit.INSTANCE;
        interfaceC58184ywW.onNext(unit);
        interfaceC58184ywW.onComplete();
        return unit;
    }

    public static final kotlin.Pair copydefault(Function2 function2, java.lang.Object obj, java.lang.Object obj2) {
        Intrinsics.checkNotNullParameter(obj, "");
        Intrinsics.checkNotNullParameter(obj2, "");
        return (kotlin.Pair) function2.invoke(obj, obj2);
    }

    public static final kotlin.Pair KWHzl(Unit unit, Unit unit2) {
        Intrinsics.checkNotNullParameter(unit, "");
        Intrinsics.checkNotNullParameter(unit2, "");
        return C56390yDp.OLrzqt(java.lang.Boolean.TRUE, "");
    }

    /* JADX DEBUG: Type inference failed for r3v4. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<org.json.JSONObject> */
    public final AbstractC58185ywX<JSONObject> OLrzqt(java.lang.String str, java.lang.String str2, java.util.Map<java.lang.String, ? extends java.lang.Object> map) {
        AbstractC58185ywX<kotlinx.serialization.json.JsonObject> abstractC58185ywXCopydefault;
        C13926dbm c13926dbm = new C13926dbm();
        if (Intrinsics.EZpvd((java.lang.Object) "post", (java.lang.Object) str)) {
            abstractC58185ywXCopydefault = c13926dbm.KWHzl(str2, map);
        } else {
            abstractC58185ywXCopydefault = c13926dbm.copydefault(str2, map);
        }
        final Function1 function1 = new Function1() { // from class: o.bWn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C9413bVC.OLrzqt((kotlinx.serialization.json.JsonObject) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXAEQbTJ = abstractC58185ywXCopydefault.AEQbTJ(new InterfaceC58229yxO() { // from class: o.bWx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C9413bVC.OqFWZa(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        return abstractC58185ywXAEQbTJ;
    }

    public static final JSONObject OqFWZa(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (JSONObject) function1.invoke(obj);
    }

    public static final JSONObject OLrzqt(kotlinx.serialization.json.JsonObject jsonObject) {
        Intrinsics.checkNotNullParameter(jsonObject, "");
        return new JSONObject(jsonObject.toString());
    }

    public static final kotlin.Pair AYXKKw(C9413bVC c9413bVC, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            SignInfo signInfo = (SignInfo) responseData.getData();
            c9413bVC.copydefault(signInfo != null ? signInfo.getSupportPush() : false);
            Json jsonAEQbTJ = C33489mxS.KWHzl.AEQbTJ();
            KSerializer<SolanaSignInfo> kSerializerSerializer = SolanaSignInfo.Companion.serializer();
            SignInfo signInfo2 = (SignInfo) responseData.getData();
            kotlinx.serialization.json.JsonObject info = signInfo2 != null ? signInfo2.getInfo() : null;
            Intrinsics.copydefault(info);
            c9413bVC.EZpvd((SolanaSignInfo) jsonAEQbTJ.decodeFromJsonElement(kSerializerSerializer, info));
            C8518bEI c8518bEIAc_ = c9413bVC.ac_();
            SolanaSignInfo solanaSignInfoAkhnZx = c9413bVC.AkhnZx();
            c8518bEIAc_.OLrzqt(solanaSignInfoAkhnZx != null ? solanaSignInfoAkhnZx.getReserveFeeRatio() : null);
            return C56390yDp.OLrzqt(java.lang.Boolean.TRUE, "");
        }
        return C56390yDp.OLrzqt(java.lang.Boolean.FALSE, responseData.getMsg());
    }
}
