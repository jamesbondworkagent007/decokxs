package o;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.reflect.TypeToken;
import com.okinc.business.defi.api.bean.SolDataFunction;
import com.okinc.business.defi.api.bean.SolanaSignType;
import com.okinc.business.defi.api.model.tx.SignAuthType;
import com.okinc.business.defi.api.model.tx.SubmitTxExpandBean;
import com.okinc.business.defi.api.model.tx.signdata.SolanaContractSignData;
import com.okinc.business.defi.api.model.tx.signdata.SolanaMultiContractSignData;
import com.okinc.business.defi.biz.core.error.CoinMetaError;
import com.okinc.business.defi.biz.core.transaction.bean.BatchBroadcastModel;
import com.okinc.business.defi.biz.core.transaction.bean.BroadcastBean;
import com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction;
import com.okinc.business.defi.biz.core.transaction.sign.solana.bean.SolanaExtJson;
import com.okinc.business.defi.biz.core.transaction.sign.solana.bean.SolanaSignInfo;
import com.okinc.business.defi.biz.core.transaction.sign.solana.bean.SolanaTxResult;
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
import com.okinc.wallet.core.sign.solana.GenerateRawTransactionBean;
import com.okinc.wallet.core.sign.solana.MultiUnitPriceAndLimit;
import com.okinc.wallet.core.sign.solana.SolUnitLimitAndPrice;
import io.reactivex.BackpressureStrategy;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
import kotlin.Result;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.json.Json;
import o.InterfaceC9462bVz;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: o.bWL, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C9475bWL extends AbstractC8601bFm<C9592bYW, SolanaMultiContractSignData> implements InterfaceC9462bVz {
    public SolanaSignInfo OcIXYQ;
    public C9785bcD QUSxYX;
    public boolean QbewEr;
    public java.util.List<SimulateTransactionParam> QfsBiF;
    public java.lang.String RcXXUw;
    public java.lang.String UeEOUB;
    public java.util.List<SimulateTransactionParam> aKErDB;
    public java.util.List<SolUnitLimitAndPrice> dNCPSb;
    public int djSkpj;
    public OKWBaseTransaction.TransactionType RJOkX = OKWBaseTransaction.TransactionType.SolanaMultiSign;
    public java.lang.String QVAiDq = "1";
    public java.util.List<? extends java.util.List<SolDataFunction>> valueOf = yDY.AhwBna();
    public final java.util.ArrayList<java.lang.String> AhwBna = new java.util.ArrayList<>();
    public final InterfaceC56387yDm fetchVPNInfo = C56392yDr.copydefault(new Function0() { // from class: o.bYf
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C9475bWL.KWHzl(this.KWHzl);
        }
    });
    public final InterfaceC56387yDm ORxRYg = C56392yDr.copydefault(new Function0() { // from class: o.bYm
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C9475bWL.copydefault(this.KWHzl);
        }
    });
    public boolean AYXKKw = true;
    public boolean djBIcL = true;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void AEQbTJ(SolanaSignInfo solanaSignInfo) {
        this.OcIXYQ = solanaSignInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction
    public void AYXKKw(boolean z) {
        this.djBIcL = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction
    public void AhwBna(boolean z) {
        this.AYXKKw = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC9462bVz
    public SolanaSignInfo AkhnZx() {
        return this.OcIXYQ;
    }

    @Override // o.AbstractC8564bFB
    public boolean DCUTEI() {
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction
    public boolean ODXsMY() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC8601bFm
    public void OLrzqt(@NotNull OKWBaseTransaction.TransactionType transactionType) {
        Intrinsics.checkNotNullParameter(transactionType, "");
        this.RJOkX = transactionType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction
    public java.lang.String ag_() {
        return "";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction
    public boolean gwTjWJ() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC9462bVz
    public int isConnected() {
        return this.djSkpj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC8601bFm, com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction
    public OKWBaseTransaction.TransactionType k_() {
        return this.RJOkX;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC9462bVz
    public java.util.ArrayList<java.lang.String> valueOf() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC9462bVz
    public java.lang.String values() {
        return this.QVAiDq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC8564bFB
    public java.lang.String zLjUOn() {
        return "";
    }

    @Override // o.InterfaceC9462bVz
    public java.lang.String AEQbTJ() {
        return InterfaceC9462bVz.Application.KWHzl(this);
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

    public void EZpvd(int i) {
        InterfaceC9462bVz.Application.copydefault(this, i);
    }

    public void EZpvd(@NotNull AbstractC8564bFB<?, ?> abstractC8564bFB, @NotNull TxToastCheckRes txToastCheckRes) {
        InterfaceC9462bVz.Application.KWHzl(this, abstractC8564bFB, txToastCheckRes);
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

    public C9785bcD OLrzqt(@NotNull AbstractC8564bFB<?, ?> abstractC8564bFB, @NotNull TxToastCheckRes txToastCheckRes) {
        return InterfaceC9462bVz.Application.copydefault(this, abstractC8564bFB, txToastCheckRes);
    }

    public SolanaExtJson UeEOUB() {
        return InterfaceC9462bVz.Application.AEQbTJ(this);
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

    /* JADX DEBUG: Method merged with bridge method: DXXBbs()Lo/bCW; */
    @Override // o.AbstractC8564bFB
    /* JADX INFO: renamed from: djBIcL, reason: merged with bridge method [inline-methods] */
    public C9592bYW fJNWhG() {
        return (C9592bYW) this.fetchVPNInfo.getValue();
    }

    public static final C9592bYW KWHzl(C9475bWL c9475bWL) {
        return new C9592bYW(c9475bWL, c9475bWL);
    }

    public final C9658bZj RcXXUw() {
        return (C9658bZj) this.ORxRYg.getValue();
    }

    public static final C9658bZj copydefault(C9475bWL c9475bWL) {
        return new C9658bZj(c9475bWL);
    }

    @Override // o.AbstractC8601bFm
    public java.lang.String zuBGHE() {
        java.lang.String str = this.RcXXUw;
        if (str != null) {
            return str;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    @Override // o.AbstractC8564bFB
    public AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> RJOkX() {
        return fZBcTu();
    }

    @Override // o.AbstractC8601bFm, o.AbstractC8564bFB
    public void x_() {
        super.x_();
        AhwBna(this);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: SignData */
    /* JADX WARN: Multi-variable type inference failed */
    public final AbstractC58260yxt<ResponseData<java.util.List<SimulateTransactionParam>>> djBIcL(final boolean z) {
        int i = 0;
        C10856bwO.copydefault("OKWSolanaSignMultiContract", 0, "multi sign ");
        final TreeMap treeMap = new TreeMap();
        final LinkedHashMap linkedHashMap = new LinkedHashMap();
        final LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        final java.util.HashMap map = new java.util.HashMap();
        java.util.Iterator<T> it = ((SolanaMultiContractSignData) QVsKAR()).getArray().iterator();
        while (true) {
            if (it.hasNext()) {
                java.lang.Object next = it.next();
                if (i < 0) {
                    yDY.AYXKKw();
                }
                SolanaContractSignData solanaContractSignData = (SolanaContractSignData) next;
                java.lang.String url = solanaContractSignData.getUrl();
                if (url != null && url.length() != 0) {
                    linkedHashMap.put(java.lang.Integer.valueOf(i), solanaContractSignData);
                } else if (solanaContractSignData.getEncodeStr() != null) {
                    java.lang.String encodeStr = solanaContractSignData.getEncodeStr();
                    Intrinsics.copydefault((java.lang.Object) encodeStr);
                    java.lang.String encodeTransactionStr = solanaContractSignData.getEncodeTransactionStr();
                    map.put(java.lang.Integer.valueOf(i), C56390yDp.OLrzqt(encodeStr, encodeTransactionStr != null ? encodeTransactionStr : ""));
                } else {
                    java.lang.String data = solanaContractSignData.getData();
                    linkedHashMap2.put(java.lang.Integer.valueOf(i), data != null ? data : "");
                }
                i++;
            } else {
                AbstractC58260yxt abstractC58260yxtCopydefault = AbstractC58260yxt.copydefault(Unit.INSTANCE);
                final Function1 function1 = new Function1() { // from class: o.bXu
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C9475bWL.KWHzl(this.KWHzl, treeMap, linkedHashMap, (Unit) obj);
                    }
                };
                AbstractC58260yxt abstractC58260yxtOLrzqt = abstractC58260yxtCopydefault.OLrzqt(new InterfaceC58229yxO() { // from class: o.bXt
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.InterfaceC58229yxO
                    public final java.lang.Object apply(java.lang.Object obj) {
                        return C9475bWL.gwTjWJ(function1, obj);
                    }
                });
                final Function1 function12 = new Function1() { // from class: o.bXB
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C9475bWL.EZpvd(this.AEQbTJ, treeMap, linkedHashMap2, z, (Unit) obj);
                    }
                };
                AbstractC58260yxt abstractC58260yxtOLrzqt2 = abstractC58260yxtOLrzqt.OLrzqt(new InterfaceC58229yxO() { // from class: o.bXy
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.InterfaceC58229yxO
                    public final java.lang.Object apply(java.lang.Object obj) {
                        return C9475bWL.OHqIaq(function12, obj);
                    }
                });
                final Function1 function13 = new Function1() { // from class: o.bXz
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C9475bWL.AEQbTJ(this.OLrzqt, treeMap, map, (Unit) obj);
                    }
                };
                AbstractC58260yxt abstractC58260yxtOLrzqt3 = abstractC58260yxtOLrzqt2.OLrzqt(new InterfaceC58229yxO() { // from class: o.bXC
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.InterfaceC58229yxO
                    public final java.lang.Object apply(java.lang.Object obj) {
                        return C9475bWL.OFhtUX(function13, obj);
                    }
                });
                final Function1 function14 = new Function1() { // from class: o.bXA
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C9475bWL.copydefault(treeMap, (Unit) obj);
                    }
                };
                AbstractC58260yxt abstractC58260yxtOLrzqt4 = abstractC58260yxtOLrzqt3.OLrzqt(new InterfaceC58229yxO() { // from class: o.bXD
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.InterfaceC58229yxO
                    public final java.lang.Object apply(java.lang.Object obj) {
                        return C9475bWL.dHguZz(function14, obj);
                    }
                });
                final Function1 function15 = new Function1() { // from class: o.bXF
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C9475bWL.copydefault((kotlin.Pair) obj);
                    }
                };
                AbstractC58260yxt<ResponseData<java.util.List<SimulateTransactionParam>>> abstractC58260yxtCopydefault2 = abstractC58260yxtOLrzqt4.copydefault(new InterfaceC58229yxO() { // from class: o.bXE
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.InterfaceC58229yxO
                    public final java.lang.Object apply(java.lang.Object obj) {
                        return C9475bWL.hBpjJd(function15, obj);
                    }
                });
                Intrinsics.checkNotNullExpressionValue(abstractC58260yxtCopydefault2, "");
                return abstractC58260yxtCopydefault2;
            }
        }
    }

    public static final InterfaceC58261yxu KWHzl(C9475bWL c9475bWL, TreeMap treeMap, LinkedHashMap linkedHashMap, Unit unit) {
        Intrinsics.checkNotNullParameter(unit, "");
        return c9475bWL.OLrzqt((TreeMap<java.lang.Integer, kotlin.Pair<java.lang.String, java.lang.String>>) treeMap, (LinkedHashMap<java.lang.Integer, SolanaContractSignData>) linkedHashMap);
    }

    public static final InterfaceC58261yxu gwTjWJ(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58261yxu) function1.invoke(obj);
    }

    public static final InterfaceC58261yxu EZpvd(C9475bWL c9475bWL, TreeMap treeMap, LinkedHashMap linkedHashMap, boolean z, Unit unit) {
        Intrinsics.checkNotNullParameter(unit, "");
        return c9475bWL.EZpvd((TreeMap<java.lang.Integer, kotlin.Pair<java.lang.String, java.lang.String>>) treeMap, (LinkedHashMap<java.lang.Integer, java.lang.String>) linkedHashMap, z);
    }

    public static final InterfaceC58261yxu OHqIaq(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58261yxu) function1.invoke(obj);
    }

    public static final InterfaceC58261yxu AEQbTJ(C9475bWL c9475bWL, TreeMap treeMap, java.util.HashMap map, Unit unit) {
        Intrinsics.checkNotNullParameter(unit, "");
        return c9475bWL.copydefault((TreeMap<java.lang.Integer, kotlin.Pair<java.lang.String, java.lang.String>>) treeMap, (java.util.HashMap<java.lang.Integer, kotlin.Pair<java.lang.String, java.lang.String>>) map);
    }

    public static final InterfaceC58261yxu OFhtUX(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58261yxu) function1.invoke(obj);
    }

    public static final InterfaceC58261yxu copydefault(TreeMap treeMap, Unit unit) {
        Intrinsics.checkNotNullParameter(unit, "");
        return AbstractC58260yxt.copydefault(C56390yDp.OLrzqt(-5001, treeMap));
    }

    public static final InterfaceC58261yxu dHguZz(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58261yxu) function1.invoke(obj);
    }

    public static final ResponseData hBpjJd(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (ResponseData) function1.invoke(obj);
    }

    public static final ResponseData copydefault(kotlin.Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        TreeMap treeMap = (TreeMap) pair.getSecond();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Collection collectionValues = treeMap.values();
        Intrinsics.checkNotNullExpressionValue(collectionValues, "");
        java.util.Iterator it = collectionValues.iterator();
        while (it.hasNext()) {
            arrayList.add(new SimulateTransactionParam((java.lang.String) ((kotlin.Pair) it.next()).getSecond(), false, true));
        }
        return new ResponseData(((java.lang.Number) pair.getFirst()).intValue(), null, null, null, arrayList, null, 46, null);
    }

    @Override // o.InterfaceC9462bVz
    public boolean DbNXlk() {
        return zuBGHE().length() == 0 || C33129mqd.OLrzqt(zuBGHE(), "0");
    }

    @Override // o.InterfaceC9462bVz
    public java.util.List<SolUnitLimitAndPrice> EZpvd() {
        java.util.List<SolUnitLimitAndPrice> list = this.dNCPSb;
        if (list == null || list.isEmpty() || this.QbewEr) {
            this.QbewEr = false;
            this.dNCPSb = EZpvd(this.aKErDB);
        }
        return this.dNCPSb;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r6v1, resolved type: java.lang.String */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Integer, kotlin.jvm.internal.DefaultConstructorMarker] */
    /* JADX WARN: Type inference failed for: r6v6 */
    public final java.util.ArrayList<MultiUnitPriceAndLimit> aKErDB() {
        java.util.ArrayList<MultiUnitPriceAndLimit> arrayList = new java.util.ArrayList<>();
        java.util.List<SolUnitLimitAndPrice> listEZpvd = EZpvd();
        if (listEZpvd != null) {
            int i = 0;
            for (java.lang.Object obj : listEZpvd) {
                if (i < 0) {
                    yDY.AYXKKw();
                }
                SolUnitLimitAndPrice solUnitLimitAndPrice = (SolUnitLimitAndPrice) obj;
                int i2 = 3;
                if (solUnitLimitAndPrice.getDeserialized() && C33129mqd.OLrzqt((java.lang.CharSequence) solUnitLimitAndPrice.getComputeUnitPrice())) {
                    arrayList.add(new MultiUnitPriceAndLimit((java.lang.Integer) str, (java.lang.Integer) str, i2, (DefaultConstructorMarker) str));
                } else if (i < OLrzqt().size()) {
                    SolanaSignInfo solanaSignInfoAkhnZx = AkhnZx();
                    java.lang.String strEZpvd = EZpvd(solanaSignInfoAkhnZx != null ? solanaSignInfoAkhnZx.getComputeUnitPrice() : null, OLrzqt().get(i));
                    SolanaSignInfo solanaSignInfoAkhnZx2 = AkhnZx();
                    if (C33129mqd.valueOf(strEZpvd, solanaSignInfoAkhnZx2 != null ? solanaSignInfoAkhnZx2.getFeelimit() : null)) {
                        int iAhwBna = C33129mqd.AhwBna(OLrzqt().get(i));
                        SolanaSignInfo solanaSignInfoAkhnZx3 = AkhnZx();
                        arrayList.add(new MultiUnitPriceAndLimit(java.lang.Integer.valueOf(iAhwBna), java.lang.Integer.valueOf(C33129mqd.AhwBna(solanaSignInfoAkhnZx3 != null ? solanaSignInfoAkhnZx3.getComputeUnitPrice() : null))));
                    } else {
                        SolanaSignInfo solanaSignInfoAkhnZx4 = AkhnZx();
                        arrayList.add(new MultiUnitPriceAndLimit(java.lang.Integer.valueOf(C33129mqd.AhwBna(OLrzqt().get(i))), java.lang.Integer.valueOf(C33129mqd.AhwBna(OLrzqt(solanaSignInfoAkhnZx4 != null ? solanaSignInfoAkhnZx4.getFeelimit() : 0, OLrzqt().get(i))))));
                    }
                } else {
                    arrayList.add(new MultiUnitPriceAndLimit((java.lang.Integer) str, (java.lang.Integer) str, i2, (DefaultConstructorMarker) str));
                }
                i++;
            }
        }
        return arrayList;
    }

    public final java.util.List<SolUnitLimitAndPrice> EZpvd(java.util.List<SimulateTransactionParam> list) {
        SignParams signParams = new SignParams(dHguZz().QKVWgx(), dHguZz().fetchVPNInfo(), null, null, null, null, 0, null, true, false, null, 1788, null);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (list != null) {
            java.util.Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((SimulateTransactionParam) it.next()).getTransaction());
            }
        }
        return C54892xZe.KWHzl.copydefault(signParams, C56423yEv.EZpvd(C56390yDp.OLrzqt("messages", arrayList)));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: SignData */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractC8601bFm, o.AbstractC8564bFB
    public boolean q_() {
        java.util.List<SolanaContractSignData> array = ((SolanaMultiContractSignData) QVsKAR()).getArray();
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(0L);
        Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "");
        java.util.Iterator<T> it = array.iterator();
        while (it.hasNext()) {
            bigDecimalValueOf = bigDecimalValueOf.add(C33129mqd.copydefault(((SolanaContractSignData) it.next()).getValue()));
            Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "");
        }
        this.RcXXUw = bigDecimalValueOf.toString();
        super.q_();
        return true;
    }

    @Override // o.AbstractC8601bFm, o.AbstractC8564bFB
    public AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> r_() {
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXR_ = super.r_();
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXCopydefault = copydefault(true, 0);
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXDvKsVJ = dvKsVJ();
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXFZBcTu = fZBcTu();
        final yHT yht = new yHT() { // from class: o.bYv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.yHT
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
                return C9475bWL.copydefault((kotlin.Pair) obj, (kotlin.Pair) obj2, (kotlin.Pair) obj3, (kotlin.Pair) obj4);
            }
        };
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXCopydefault2 = AbstractC58185ywX.copydefault(abstractC58185ywXR_, abstractC58185ywXCopydefault, abstractC58185ywXDvKsVJ, abstractC58185ywXFZBcTu, new InterfaceC58230yxP() { // from class: o.bWR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58230yxP
            public final java.lang.Object EZpvd(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
                return C9475bWL.EZpvd(yht, obj, obj2, obj3, obj4);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXCopydefault2, "");
        return abstractC58185ywXCopydefault2;
    }

    public static final kotlin.Pair EZpvd(yHT yht, java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
        Intrinsics.checkNotNullParameter(obj, "");
        Intrinsics.checkNotNullParameter(obj2, "");
        Intrinsics.checkNotNullParameter(obj3, "");
        Intrinsics.checkNotNullParameter(obj4, "");
        return (kotlin.Pair) yht.invoke(obj, obj2, obj3, obj4);
    }

    public static final kotlin.Pair copydefault(kotlin.Pair pair, kotlin.Pair pair2, kotlin.Pair pair3, kotlin.Pair pair4) {
        Intrinsics.checkNotNullParameter(pair, "");
        Intrinsics.checkNotNullParameter(pair2, "");
        Intrinsics.checkNotNullParameter(pair3, "");
        Intrinsics.checkNotNullParameter(pair4, "");
        return !((java.lang.Boolean) pair.getFirst()).booleanValue() ? pair : !((java.lang.Boolean) pair2.getFirst()).booleanValue() ? pair2 : !((java.lang.Boolean) pair4.getFirst()).booleanValue() ? pair4 : C56390yDp.OLrzqt(java.lang.Boolean.TRUE, null);
    }

    @Override // o.AbstractC8601bFm
    public java.lang.String AEQbTJ(boolean z) {
        if (!z) {
            return "";
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        int i = 0;
        for (java.lang.Object obj : this.valueOf) {
            if (i < 0) {
                yDY.AYXKKw();
            }
            int i2 = 0;
            for (java.lang.Object obj2 : (java.util.List) obj) {
                if (i2 < 0) {
                    yDY.AYXKKw();
                }
                SolDataFunction solDataFunction = (SolDataFunction) obj2;
                sb.append(solDataFunction.getMethodName());
                sb.append("\n");
                sb.append(solDataFunction.getData());
                if (i2 < r3.size() - 1) {
                    sb.append("\n\n");
                }
                i2++;
            }
            if (i < this.valueOf.size() - 1) {
                sb.append("\n\n");
            }
            i++;
        }
        java.lang.String string = sb.toString();
        Intrinsics.copydefault((java.lang.Object) string);
        return string;
    }

    /* JADX DEBUG: Type inference failed for r0v2. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<kotlin.Unit> */
    @Override // o.AbstractC8601bFm, o.AbstractC8564bFB
    public AbstractC58185ywX<Unit> p_() {
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXCopydefault = copydefault(true, 3);
        final Function1 function1 = new Function1() { // from class: o.bWP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C9475bWL.KWHzl((kotlin.Pair) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXAEQbTJ = abstractC58185ywXCopydefault.AEQbTJ(new InterfaceC58229yxO() { // from class: o.bWT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C9475bWL.QCjLjM(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        return abstractC58185ywXAEQbTJ;
    }

    public static final Unit KWHzl(kotlin.Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        return Unit.INSTANCE;
    }

    public static final Unit QCjLjM(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (Unit) function1.invoke(obj);
    }

    public static final InterfaceC60096zvd QVsKAR(Function1 function1, java.lang.Object obj) {
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
            abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(new StateListAnimator(solanaSignInfoAkhnZx, str), BackpressureStrategy.BUFFER).copydefault(yBP.AEQbTJ()).KWHzl(C58266yxz.OLrzqt());
            Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        }
        final Function1 function1 = new Function1() { // from class: o.bYu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C9475bWL.KWHzl(this.OLrzqt, str, (SolanaSignInfo) obj);
            }
        };
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXKWHzl2 = abstractC58185ywXKWHzl.KWHzl(new InterfaceC58229yxO() { // from class: o.bYr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C9475bWL.QVsKAR(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl2, "");
        return abstractC58185ywXKWHzl2;
    }

    public static final InterfaceC60096zvd KWHzl(C9475bWL c9475bWL, java.lang.String str, SolanaSignInfo solanaSignInfo) {
        Intrinsics.checkNotNullParameter(solanaSignInfo, "");
        c9475bWL.AEQbTJ(solanaSignInfo);
        return super.DbNXlk(str);
    }

    @Override // o.AbstractC8601bFm, com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction
    public java.util.ArrayList<java.lang.Integer> getNewProxyInstance() {
        java.util.ArrayList<java.lang.Integer> arrayList = new java.util.ArrayList<>();
        arrayList.add(8);
        arrayList.add(9);
        return arrayList;
    }

    @Override // com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction
    public AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> KWHzl(boolean z) {
        if (!z) {
            AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(C56390yDp.OLrzqt(java.lang.Boolean.TRUE, null));
            Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
            return abstractC58185ywXKWHzl;
        }
        return fZBcTu();
    }

    @Override // o.AbstractC8601bFm, o.AbstractC8564bFB, com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction
    public TxToastCheckReq i_() {
        TxToastCheckReq txToastCheckReqI_ = super.i_();
        txToastCheckReqI_.setSimulateTransactionParamList(this.aKErDB);
        return txToastCheckReqI_;
    }

    /* JADX INFO: renamed from: o.bWL$StateListAnimator */
    public static final class StateListAnimator<T> implements InterfaceC58187ywZ {
        public final /* synthetic */ java.lang.Object EZpvd;
        public final /* synthetic */ java.lang.String OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(java.lang.Object obj, java.lang.String str) {
            this.EZpvd = obj;
            this.OLrzqt = str;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: o.ywW<com.okinc.business.defi.biz.core.transaction.sign.solana.bean.SolanaSignInfo> */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // o.InterfaceC58187ywZ
        public final void subscribe(InterfaceC58184ywW<SolanaSignInfo> interfaceC58184ywW) {
            java.lang.Object objM7377constructorimpl;
            Intrinsics.checkNotNullParameter(interfaceC58184ywW, "");
            java.lang.String str = this.OLrzqt;
            java.lang.Object obj = this.EZpvd;
            try {
                Result.Application application = Result.Companion;
                JsonObject asJsonObject = ((JsonObject) new Gson().fromJson(str, new TypeToken<JsonObject>() { // from class: o.bWL.StateListAnimator.2
                }.getType())).getAsJsonObject();
                if (asJsonObject.has("gasPrice") && asJsonObject.get("gasPrice").isJsonObject()) {
                    asJsonObject = ((JsonObject) new Gson().fromJson(str, new TypeToken<JsonObject>() { // from class: o.bWL.StateListAnimator.5
                    }.getType())).get("gasPrice").getAsJsonObject();
                }
                JsonObject jsonObject = (JsonObject) new Gson().fromJson(obj != null ? C33488mxR.EZpvd(obj) : null, new TypeToken<JsonObject>() { // from class: o.bWL.StateListAnimator.4
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
                obj2 = this.EZpvd;
            }
            interfaceC58184ywW.onNext(obj2);
            interfaceC58184ywW.onComplete();
        }
    }

    @Override // o.AbstractC8601bFm, com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction
    public void AEQbTJ(@NotNull java.util.List<TxToastCheckRes> list) {
        Intrinsics.checkNotNullParameter(list, "");
        super.AEQbTJ(list);
        for (TxToastCheckRes txToastCheckRes : list) {
            java.lang.Integer checkType = txToastCheckRes.getCheckType();
            if (checkType != null && checkType.intValue() == 8) {
                this.QUSxYX = OLrzqt(this, txToastCheckRes);
            } else if (checkType != null && checkType.intValue() == 9) {
                EZpvd(this, txToastCheckRes);
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v2, resolved type: SignData */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction
    public PreExecTransactionReq RdAHlO() {
        PreExecTransactionReq preExecTransactionReqRdAHlO = super.RdAHlO();
        preExecTransactionReqRdAHlO.setDappData(new Gson().toJson(this.aKErDB));
        java.lang.String solanaMethod = ((SolanaMultiContractSignData) QVsKAR()).getSolanaMethod();
        if (solanaMethod == null) {
            solanaMethod = "wallet_sol_contact";
        }
        preExecTransactionReqRdAHlO.setMethod(solanaMethod);
        return preExecTransactionReqRdAHlO;
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

    /* JADX DEBUG: Type inference failed for r0v3. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> */
    private final AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> fZBcTu() {
        if (!ODXsMY() && getNewProxyInstance().isEmpty()) {
            AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(C56390yDp.OLrzqt(java.lang.Boolean.TRUE, null));
            Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
            return abstractC58185ywXKWHzl;
        }
        AbstractC58260yxt<ResponseData<java.util.List<SimulateTransactionParam>>> abstractC58260yxtDjBIcL = djBIcL(false);
        final Function1 function1 = new Function1() { // from class: o.bXf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C9475bWL.EZpvd(this.EZpvd, (ResponseData) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXKWHzl2 = abstractC58260yxtDjBIcL.KWHzl(new InterfaceC58229yxO() { // from class: o.bXg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C9475bWL.dmfpNf(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl2, "");
        return abstractC58185ywXKWHzl2;
    }

    public static final InterfaceC60096zvd dmfpNf(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public static final InterfaceC60096zvd EZpvd(final C9475bWL c9475bWL, final ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == -5001) {
            c9475bWL.aKErDB = (java.util.List) responseData.getData();
            AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXKWHzl = super.KWHzl(true);
            final Function1 function1 = new Function1() { // from class: o.bYl
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C9475bWL.KWHzl(this.copydefault, responseData, (kotlin.Pair) obj);
                }
            };
            return abstractC58185ywXKWHzl.KWHzl(new InterfaceC58229yxO() { // from class: o.bYn
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58229yxO
                public final java.lang.Object apply(java.lang.Object obj) {
                    return C9475bWL.RdAHlO(function1, obj);
                }
            });
        }
        return AbstractC58185ywX.KWHzl(C56390yDp.OLrzqt(java.lang.Boolean.FALSE, responseData.getMsg()));
    }

    public static final InterfaceC60096zvd RdAHlO(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public static final InterfaceC60096zvd KWHzl(final C9475bWL c9475bWL, ResponseData responseData, final kotlin.Pair pair) {
        AbstractC58185ywX abstractC58185ywXKWHzl;
        Intrinsics.checkNotNullParameter(pair, "");
        if (c9475bWL.djSkpj()) {
            c9475bWL.QfsBiF = (java.util.List) responseData.getData();
            c9475bWL.QbewEr = true;
            c9475bWL.EZpvd();
            if (c9475bWL.AkhnZx() != null) {
                c9475bWL.EZpvd(2);
            }
            abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(pair);
        } else {
            AbstractC58260yxt<ResponseData<java.util.List<SimulateTransactionParam>>> abstractC58260yxtDjBIcL = c9475bWL.djBIcL(true);
            final Function1 function1 = new Function1() { // from class: o.bWV
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C9475bWL.KWHzl(this.EZpvd, pair, (ResponseData) obj);
                }
            };
            abstractC58185ywXKWHzl = abstractC58260yxtDjBIcL.KWHzl(new InterfaceC58229yxO() { // from class: o.bWY
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58229yxO
                public final java.lang.Object apply(java.lang.Object obj) {
                    return C9475bWL.RKDWNf(function1, obj);
                }
            });
        }
        final Function1 function12 = new Function1() { // from class: o.bWX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C9475bWL.AEQbTJ(this.EZpvd, (kotlin.Pair) obj);
            }
        };
        return abstractC58185ywXKWHzl.KWHzl(new InterfaceC58229yxO() { // from class: o.bWU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C9475bWL.QSBOWP(function12, obj);
            }
        });
    }

    public static final InterfaceC60096zvd RKDWNf(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public static final InterfaceC60096zvd KWHzl(C9475bWL c9475bWL, kotlin.Pair pair, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == -5001) {
            c9475bWL.QfsBiF = (java.util.List) responseData.getData();
            c9475bWL.QbewEr = true;
            c9475bWL.EZpvd();
            if (c9475bWL.AkhnZx() != null) {
                c9475bWL.EZpvd(2);
            }
        }
        return AbstractC58185ywX.KWHzl(pair);
    }

    public static final InterfaceC60096zvd QSBOWP(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public static final InterfaceC60096zvd AEQbTJ(C9475bWL c9475bWL, final kotlin.Pair pair) {
        java.util.List<java.lang.String> listAhwBna;
        Intrinsics.checkNotNullParameter(pair, "");
        java.util.List<SimulateTransactionParam> list = c9475bWL.QfsBiF;
        if (list == null) {
            listAhwBna = yDY.AhwBna();
        } else {
            listAhwBna = new java.util.ArrayList<>(C56403yEb.AYXKKw(list, 10));
            java.util.Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                listAhwBna.add(((SimulateTransactionParam) it.next()).getTransaction());
            }
        }
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXDjBIcL = c9475bWL.djBIcL(listAhwBna);
        final Function1 function1 = new Function1() { // from class: o.bYk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C9475bWL.AYXKKw(pair, (kotlin.Pair) obj);
            }
        };
        return abstractC58185ywXDjBIcL.KWHzl(new InterfaceC58229yxO() { // from class: o.bYj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C9475bWL.OBJEWx(function1, obj);
            }
        });
    }

    public static final InterfaceC60096zvd OBJEWx(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public static final InterfaceC60096zvd AYXKKw(kotlin.Pair pair, kotlin.Pair pair2) {
        Intrinsics.checkNotNullParameter(pair2, "");
        return AbstractC58185ywX.KWHzl(pair);
    }

    @Override // o.AbstractC8564bFB
    public AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> ffGIBT() {
        return dvKsVJ();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: SignData */
    /* JADX DEBUG: Multi-variable search result rejected for r4v4, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [T, java.util.TreeMap] */
    @Override // com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction
    public AbstractC58185ywX<ResponseData<BatchBroadcastModel>> OLrzqt(@NotNull final java.lang.String str, SubmitTxExpandBean submitTxExpandBean) {
        Intrinsics.checkNotNullParameter(str, "");
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = new TreeMap();
        LinkedHashMap<java.lang.Integer, SolanaContractSignData> linkedHashMap = new LinkedHashMap<>();
        final LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        final java.util.HashMap map = new java.util.HashMap();
        int i = 0;
        for (java.lang.Object obj : ((SolanaMultiContractSignData) QVsKAR()).getArray()) {
            if (i < 0) {
                yDY.AYXKKw();
            }
            SolanaContractSignData solanaContractSignData = (SolanaContractSignData) obj;
            java.lang.String url = solanaContractSignData.getUrl();
            if (url != null && url.length() != 0) {
                linkedHashMap.put(java.lang.Integer.valueOf(i), solanaContractSignData);
            } else if (solanaContractSignData.getEncodeStr() != null) {
                java.lang.String encodeStr = solanaContractSignData.getEncodeStr();
                if (encodeStr == null) {
                    encodeStr = "";
                }
                java.lang.String encodeTransactionStr = solanaContractSignData.getEncodeTransactionStr();
                if (encodeTransactionStr == null) {
                    encodeTransactionStr = "";
                }
                map.put(java.lang.Integer.valueOf(i), C56390yDp.OLrzqt(encodeStr, encodeTransactionStr));
            } else {
                java.lang.String data = solanaContractSignData.getData();
                if (data == null) {
                    data = "";
                }
                linkedHashMap2.put(java.lang.Integer.valueOf(i), data);
            }
            i++;
        }
        AbstractC58260yxt<Unit> abstractC58260yxtOLrzqt = OLrzqt((TreeMap<java.lang.Integer, kotlin.Pair<java.lang.String, java.lang.String>>) objectRef.element, linkedHashMap);
        final Function1 function1 = new Function1() { // from class: o.bXM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj2) {
                return C9475bWL.AEQbTJ(this.AEQbTJ, objectRef, linkedHashMap2, map, (Unit) obj2);
            }
        };
        AbstractC58260yxt<R> abstractC58260yxtOLrzqt2 = abstractC58260yxtOLrzqt.OLrzqt(new InterfaceC58229yxO() { // from class: o.bXR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj2) {
                return C9475bWL.OJuSTm(function1, obj2);
            }
        });
        final Function1 function12 = new Function1() { // from class: o.bXN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj2) {
                return C9475bWL.EZpvd(this.KWHzl, (Unit) obj2);
            }
        };
        AbstractC58260yxt abstractC58260yxtOLrzqt3 = abstractC58260yxtOLrzqt2.OLrzqt((InterfaceC58229yxO<? super R, ? extends InterfaceC58261yxu<? extends R>>) new InterfaceC58229yxO() { // from class: o.bXQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj2) {
                return C9475bWL.OxVOHk(function12, obj2);
            }
        });
        final Function1 function13 = new Function1() { // from class: o.bXO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj2) {
                return C9475bWL.EZpvd(this.KWHzl, objectRef, linkedHashMap2, map, (kotlin.Pair) obj2);
            }
        };
        AbstractC58260yxt abstractC58260yxtOLrzqt4 = abstractC58260yxtOLrzqt3.OLrzqt(new InterfaceC58229yxO() { // from class: o.bXP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj2) {
                return C9475bWL.USBtdM(function13, obj2);
            }
        });
        final Function1 function14 = new Function1() { // from class: o.bXS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj2) {
                return C9475bWL.AEQbTJ(objectRef, this, str, (kotlin.Pair) obj2);
            }
        };
        AbstractC58260yxt abstractC58260yxtOLrzqt5 = abstractC58260yxtOLrzqt4.OLrzqt(new InterfaceC58229yxO() { // from class: o.bXU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj2) {
                return C9475bWL.fdOvFl(function14, obj2);
            }
        });
        final Function1 function15 = new Function1() { // from class: o.bXW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj2) {
                return C9475bWL.EZpvd(this.copydefault, (Triple) obj2);
            }
        };
        AbstractC58185ywX<ResponseData<BatchBroadcastModel>> abstractC58185ywXKWHzl = abstractC58260yxtOLrzqt5.KWHzl(new InterfaceC58229yxO() { // from class: o.bXV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj2) {
                return C9475bWL.htlTjW(function15, obj2);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        return abstractC58185ywXKWHzl;
    }

    public static final InterfaceC58261yxu OJuSTm(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58261yxu) function1.invoke(obj);
    }

    public static final InterfaceC58261yxu AEQbTJ(C9475bWL c9475bWL, Ref.ObjectRef objectRef, LinkedHashMap linkedHashMap, java.util.HashMap map, Unit unit) {
        Intrinsics.checkNotNullParameter(unit, "");
        return c9475bWL.OLrzqt((java.util.Map<java.lang.Integer, kotlin.Pair<java.lang.String, java.lang.String>>) objectRef.element, linkedHashMap, map);
    }

    public static final InterfaceC58261yxu OxVOHk(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58261yxu) function1.invoke(obj);
    }

    public static final InterfaceC58261yxu EZpvd(C9475bWL c9475bWL, Unit unit) {
        Intrinsics.checkNotNullParameter(unit, "");
        return c9475bWL.copydefault(false, 2).valueOf();
    }

    public static final InterfaceC58261yxu USBtdM(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58261yxu) function1.invoke(obj);
    }

    public static final InterfaceC58261yxu EZpvd(final C9475bWL c9475bWL, final Ref.ObjectRef objectRef, final LinkedHashMap linkedHashMap, final java.util.HashMap map, kotlin.Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        if (!((java.lang.Boolean) pair.getFirst()).booleanValue()) {
            return AbstractC58260yxt.copydefault(C56390yDp.OLrzqt(-5000, null));
        }
        if (!c9475bWL.DLWbHP().AEQbTJ(C56524yIo.AEQbTJ(C9784bcC.class)) && c9475bWL.AhwBna(c9475bWL)) {
            AbstractC58260yxt abstractC58260yxtCopydefault = AbstractC58260yxt.copydefault(Unit.INSTANCE);
            final Function1 function1 = new Function1() { // from class: o.bYa
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C9475bWL.OLrzqt(this.OLrzqt, objectRef, linkedHashMap, (Unit) obj);
                }
            };
            AbstractC58260yxt abstractC58260yxtOLrzqt = abstractC58260yxtCopydefault.OLrzqt(new InterfaceC58229yxO() { // from class: o.bYd
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58229yxO
                public final java.lang.Object apply(java.lang.Object obj) {
                    return C9475bWL.dUDNAs(function1, obj);
                }
            });
            final Function1 function12 = new Function1() { // from class: o.bYe
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C9475bWL.AEQbTJ(this.copydefault, objectRef, map, (Unit) obj);
                }
            };
            AbstractC58260yxt abstractC58260yxtOLrzqt2 = abstractC58260yxtOLrzqt.OLrzqt(new InterfaceC58229yxO() { // from class: o.bYc
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58229yxO
                public final java.lang.Object apply(java.lang.Object obj) {
                    return C9475bWL.QwvEab(function12, obj);
                }
            });
            final Function1 function13 = new Function1() { // from class: o.bYg
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C9475bWL.KWHzl(objectRef, (Unit) obj);
                }
            };
            AbstractC58260yxt abstractC58260yxtOLrzqt3 = abstractC58260yxtOLrzqt2.OLrzqt(new InterfaceC58229yxO() { // from class: o.bYh
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58229yxO
                public final java.lang.Object apply(java.lang.Object obj) {
                    return C9475bWL.aUsmxb(function13, obj);
                }
            });
            Intrinsics.copydefault(abstractC58260yxtOLrzqt3);
            return abstractC58260yxtOLrzqt3;
        }
        AbstractC58260yxt abstractC58260yxtCopydefault2 = AbstractC58260yxt.copydefault(C56390yDp.OLrzqt(-5000, null));
        Intrinsics.copydefault(abstractC58260yxtCopydefault2);
        return abstractC58260yxtCopydefault2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public static final InterfaceC58261yxu OLrzqt(C9475bWL c9475bWL, Ref.ObjectRef objectRef, LinkedHashMap linkedHashMap, Unit unit) {
        Intrinsics.checkNotNullParameter(unit, "");
        return c9475bWL.EZpvd((TreeMap<java.lang.Integer, kotlin.Pair<java.lang.String, java.lang.String>>) objectRef.element, (LinkedHashMap<java.lang.Integer, java.lang.String>) linkedHashMap, true);
    }

    public static final InterfaceC58261yxu dUDNAs(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58261yxu) function1.invoke(obj);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public static final InterfaceC58261yxu AEQbTJ(C9475bWL c9475bWL, Ref.ObjectRef objectRef, java.util.HashMap map, Unit unit) {
        Intrinsics.checkNotNullParameter(unit, "");
        return c9475bWL.copydefault((TreeMap<java.lang.Integer, kotlin.Pair<java.lang.String, java.lang.String>>) objectRef.element, (java.util.HashMap<java.lang.Integer, kotlin.Pair<java.lang.String, java.lang.String>>) map);
    }

    public static final InterfaceC58261yxu QwvEab(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58261yxu) function1.invoke(obj);
    }

    public static final InterfaceC58261yxu KWHzl(Ref.ObjectRef objectRef, Unit unit) {
        Intrinsics.checkNotNullParameter(unit, "");
        return AbstractC58260yxt.copydefault(C56390yDp.OLrzqt(-5001, objectRef.element));
    }

    public static final InterfaceC58261yxu aUsmxb(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58261yxu) function1.invoke(obj);
    }

    public static final InterfaceC58261yxu fdOvFl(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58261yxu) function1.invoke(obj);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [T, java.lang.Object] */
    public static final InterfaceC58261yxu AEQbTJ(final Ref.ObjectRef objectRef, final C9475bWL c9475bWL, final java.lang.String str, kotlin.Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        if (((java.lang.Number) pair.getFirst()).intValue() != -5001) {
            return AbstractC58260yxt.copydefault(new Triple(pair.getFirst(), new JSONArray(), new JSONArray()));
        }
        ?? second = pair.getSecond();
        Intrinsics.copydefault((java.lang.Object) second);
        objectRef.element = second;
        final java.util.ArrayList arrayList = new java.util.ArrayList();
        final java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.Collection<kotlin.Pair> collectionValues = ((TreeMap) objectRef.element).values();
        Intrinsics.checkNotNullExpressionValue(collectionValues, "");
        for (kotlin.Pair pair2 : collectionValues) {
            arrayList.add(pair2.getFirst());
            arrayList2.add(pair2.getSecond());
        }
        if (arrayList.isEmpty()) {
            return AbstractC58260yxt.copydefault(new Triple(pair.getFirst(), new JSONArray(), new JSONArray()));
        }
        AbstractC58260yxt abstractC58260yxtOLrzqt = AbstractC58260yxt.OLrzqt(new InterfaceC58259yxs() { // from class: o.bXv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58259yxs
            public final void subscribe(InterfaceC58257yxq interfaceC58257yxq) throws JSONException {
                C9475bWL.AEQbTJ(this.AEQbTJ, str, arrayList, objectRef, arrayList2, interfaceC58257yxq);
            }
        });
        final Function1 function1 = new Function1() { // from class: o.bXI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C9475bWL.EZpvd(this.EZpvd, objectRef, arrayList2, (kotlin.Pair) obj);
            }
        };
        return abstractC58260yxtOLrzqt.OLrzqt(new InterfaceC58229yxO() { // from class: o.bXT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C9475bWL.fERRXa(function1, obj);
            }
        });
    }

    /* JADX DEBUG: Multi-variable search result rejected for r13v1, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: SignData */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void AEQbTJ(final C9475bWL c9475bWL, java.lang.String str, java.util.ArrayList arrayList, Ref.ObjectRef objectRef, java.util.ArrayList arrayList2, final InterfaceC58257yxq interfaceC58257yxq) throws JSONException {
        Intrinsics.checkNotNullParameter(interfaceC58257yxq, "");
        C9658bZj c9658bZjRcXXUw = c9475bWL.RcXXUw();
        java.lang.String json = new GsonBuilder().disableHtmlEscaping().create().toJson(arrayList);
        Intrinsics.checkNotNullExpressionValue(json, "");
        final JSONArray jSONArray = new JSONArray(c9658bZjRcXXUw.EZpvd(str, json));
        int i = 0;
        if (jSONArray.length() == 0) {
            C10856bwO.copydefault("OKWSolanaSignMultiContract", 0, "go sign error");
            interfaceC58257yxq.onSuccess(C56390yDp.OLrzqt(new JSONArray(), new JSONArray()));
            return;
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.util.Set setKeySet = ((TreeMap) objectRef.element).keySet();
        Intrinsics.checkNotNullExpressionValue(setKeySet, "");
        for (java.lang.Object obj : setKeySet) {
            if (i < 0) {
                yDY.AYXKKw();
            }
            java.lang.Integer num = (java.lang.Integer) obj;
            java.util.List<SolanaContractSignData> array = ((SolanaMultiContractSignData) c9475bWL.QVsKAR()).getArray();
            Intrinsics.copydefault(num);
            SolanaContractSignData solanaContractSignData = array.get(num.intValue());
            java.lang.Object obj2 = arrayList2.get(i);
            Intrinsics.checkNotNullExpressionValue(obj2, "");
            java.lang.String str2 = (java.lang.String) obj2;
            java.lang.String string = jSONArray.getString(i);
            Intrinsics.checkNotNullExpressionValue(string, "");
            java.lang.String from = solanaContractSignData.getFrom();
            java.lang.String str3 = from == null ? "" : from;
            java.lang.String bizType = solanaContractSignData.getBizType();
            java.lang.String str4 = bizType == null ? "" : bizType;
            java.util.List<java.lang.String> bizId = solanaContractSignData.getBizId();
            if (bizId == null) {
                bizId = yDY.AhwBna();
            }
            arrayList3.add(new GenerateRawTransactionBean(str2, string, str3, str4, bizId));
            i++;
        }
        c9475bWL.RcXXUw().copydefault(arrayList3, new Function1() { // from class: o.bXG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj3) {
                return C9475bWL.EZpvd(this.copydefault, interfaceC58257yxq, jSONArray, (java.lang.String) obj3);
            }
        });
    }

    public static final Unit EZpvd(C9475bWL c9475bWL, InterfaceC58257yxq interfaceC58257yxq, JSONArray jSONArray, java.lang.String str) throws java.lang.Throwable {
        java.lang.Object objM7377constructorimpl;
        Intrinsics.checkNotNullParameter(str, "");
        try {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(new JSONArray(str));
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (Result.m7384isSuccessimpl(objM7377constructorimpl)) {
            C56391yDq.AEQbTJ(objM7377constructorimpl);
            interfaceC58257yxq.onSuccess(C56390yDp.OLrzqt(objM7377constructorimpl, jSONArray));
        } else {
            C10856bwO.copydefault("SolMultiSignHandler", 0, "JS sign error");
            interfaceC58257yxq.onSuccess(C56390yDp.OLrzqt(new JSONArray(), new JSONArray()));
        }
        return Unit.INSTANCE;
    }

    public static final InterfaceC58261yxu fERRXa(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58261yxu) function1.invoke(obj);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v4, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public static final InterfaceC58261yxu EZpvd(final C9475bWL c9475bWL, final Ref.ObjectRef objectRef, java.util.ArrayList arrayList, final kotlin.Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        if (((JSONArray) pair.getFirst()).length() == 0) {
            return AbstractC58260yxt.copydefault(new Triple(-5005, new JSONArray(), new JSONArray()));
        }
        AbstractC58260yxt<Unit> abstractC58260yxtEZpvd = c9475bWL.EZpvd((TreeMap<java.lang.Integer, kotlin.Pair<java.lang.String, java.lang.String>>) objectRef.element, arrayList);
        final Function1 function1 = new Function1() { // from class: o.bYq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C9475bWL.EZpvd(objectRef, c9475bWL, pair, (Unit) obj);
            }
        };
        return abstractC58260yxtEZpvd.OLrzqt(new InterfaceC58229yxO() { // from class: o.bYs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C9475bWL.UlJrfe(function1, obj);
            }
        });
    }

    public static final InterfaceC58261yxu UlJrfe(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58261yxu) function1.invoke(obj);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r10v1, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: SignData */
    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r8v1, resolved type: SignData */
    /* JADX WARN: Multi-variable type inference failed */
    public static final InterfaceC58261yxu EZpvd(Ref.ObjectRef objectRef, C9475bWL c9475bWL, kotlin.Pair pair, Unit unit) {
        Intrinsics.checkNotNullParameter(unit, "");
        if (((TreeMap) objectRef.element).size() == ((SolanaMultiContractSignData) c9475bWL.QVsKAR()).getArray().size()) {
            return AbstractC58260yxt.copydefault(new Triple(-5001, pair.getFirst(), pair.getSecond()));
        }
        JSONArray jSONArray = (JSONArray) pair.getFirst();
        JSONArray jSONArray2 = (JSONArray) pair.getSecond();
        JSONArray jSONArray3 = new JSONArray();
        JSONArray jSONArray4 = new JSONArray();
        java.util.Iterator<java.lang.Integer> it = yDY.valueOf((java.util.Collection<?>) ((SolanaMultiContractSignData) c9475bWL.QVsKAR()).getArray()).iterator();
        int i = 0;
        while (it.hasNext()) {
            if (((TreeMap) objectRef.element).containsKey(java.lang.Integer.valueOf(((AbstractC56415yEn) it).nextInt()))) {
                jSONArray3.put(jSONArray.getString(i));
                jSONArray4.put(jSONArray2.getString(i));
                i++;
            } else {
                jSONArray3.put("");
                jSONArray4.put("");
            }
        }
        return AbstractC58260yxt.copydefault(new Triple(-5001, jSONArray3, jSONArray4));
    }

    public static final InterfaceC60096zvd htlTjW(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public static final InterfaceC60096zvd EZpvd(C9475bWL c9475bWL, Triple triple) {
        Intrinsics.checkNotNullParameter(triple, "");
        return c9475bWL.copydefault((Triple<java.lang.Integer, ? extends JSONArray, ? extends JSONArray>) triple);
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.bFm.generateBroadcastModel$default(o.bFm, java.lang.String, java.lang.String, com.okinc.business.defi.biz.core.transaction.bean.CommonExtJson, java.lang.Object, int, java.lang.Object):com.okinc.business.defi.biz.core.transaction.bean.BroadcastBean */
    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: SignData */
    /* JADX DEBUG: Multi-variable search result rejected for r5v6, resolved type: SignData */
    /* JADX WARN: Multi-variable type inference failed */
    public final AbstractC58185ywX<ResponseData<BatchBroadcastModel>> copydefault(@NotNull Triple<java.lang.Integer, ? extends JSONArray, ? extends JSONArray> triple) {
        java.util.List listEZpvd;
        Intrinsics.checkNotNullParameter(triple, "");
        if (triple.getFirst().intValue() == -5001) {
            JSONArray second = triple.getSecond();
            JSONArray third = triple.getThird();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            int i = 0;
            java.util.Iterator<java.lang.Integer> it = C56548yJl.AhwBna(0, second.length()).iterator();
            while (it.hasNext()) {
                int iNextInt = ((AbstractC56415yEn) it).nextInt();
                arrayList.add(new SignedTx(second.optString(iNextInt), third.optString(iNextInt), (java.lang.String) null, (java.lang.String) null, 12, (DefaultConstructorMarker) null));
            }
            if (djSkpj()) {
                java.lang.String strOptString = third.optString(1, null);
                java.lang.String string = second.toString();
                Intrinsics.checkNotNullExpressionValue(string, "");
                java.lang.String strOptString2 = third.optString(0);
                Intrinsics.checkNotNullExpressionValue(strOptString2, "");
                SolanaExtJson solanaExtJsonUeEOUB = UeEOUB();
                solanaExtJsonUeEOUB.setMev(SolanaExtJson.MEV);
                solanaExtJsonUeEOUB.setJitoHash(strOptString);
                Unit unit = Unit.INSTANCE;
                BroadcastBean broadcastBeanGenerateBroadcastModel$default = AbstractC8601bFm.generateBroadcastModel$default(this, string, strOptString2, null, solanaExtJsonUeEOUB, 4, null);
                broadcastBeanGenerateBroadcastModel$default.setSignedTxWithoutJito(second.optString(0, null));
                broadcastBeanGenerateBroadcastModel$default.setJitoHash(strOptString);
                broadcastBeanGenerateBroadcastModel$default.setJitoSignedTx(second.optString(1, null));
                listEZpvd = C56402yEa.EZpvd(broadcastBeanGenerateBroadcastModel$default);
            } else {
                java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(arrayList, 10));
                for (java.lang.Object obj : arrayList) {
                    if (i < 0) {
                        yDY.AYXKKw();
                    }
                    SignedTx signedTx = (SignedTx) obj;
                    java.lang.String tx = signedTx.getTx();
                    java.lang.String str = tx == null ? "" : tx;
                    java.lang.String txHash = signedTx.getTxHash();
                    BroadcastBean broadcastBeanGenerateBroadcastModel$default2 = AbstractC8601bFm.generateBroadcastModel$default(this, str, txHash == null ? "" : txHash, null, UeEOUB(), 4, null);
                    SolanaContractSignData solanaContractSignData = (SolanaContractSignData) CollectionsKt___CollectionsKt.AkhnZx(((SolanaMultiContractSignData) QVsKAR()).getArray(), i);
                    broadcastBeanGenerateBroadcastModel$default2.setTxType(solanaContractSignData != null ? solanaContractSignData.getTxType() : null);
                    arrayList2.add(broadcastBeanGenerateBroadcastModel$default2);
                    i++;
                }
                listEZpvd = arrayList2;
            }
            java.util.List<SolanaContractSignData> array = ((SolanaMultiContractSignData) QVsKAR()).getArray();
            java.util.ArrayList arrayList3 = new java.util.ArrayList(C56403yEb.AYXKKw(array, 10));
            java.util.Iterator<T> it2 = array.iterator();
            while (it2.hasNext()) {
                java.util.List<java.lang.String> bizId = ((SolanaContractSignData) it2.next()).getBizId();
                if (bizId == null) {
                    bizId = yDY.AhwBna();
                }
                arrayList3.add(bizId);
            }
            java.lang.String str2 = null;
            AbstractC58185ywX<ResponseData<BatchBroadcastModel>> abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(new ResponseData(triple.getFirst().intValue(), 0 == true ? 1 : 0, 0 == true ? 1 : 0, str2, new BatchBroadcastModel(listEZpvd, arrayList3, java.lang.Boolean.valueOf(!djSkpj()), (java.lang.String) null, (java.lang.Boolean) null, (java.lang.Integer) null, str2, (SignAuthType) null, 248, (DefaultConstructorMarker) null), null, 46, null));
            Intrinsics.copydefault(abstractC58185ywXKWHzl);
            return abstractC58185ywXKWHzl;
        }
        AbstractC58185ywX<ResponseData<BatchBroadcastModel>> abstractC58185ywXKWHzl2 = AbstractC58185ywX.KWHzl(new ResponseData(triple.getFirst().intValue(), null, null, null, null, null, 62, null));
        Intrinsics.copydefault(abstractC58185ywXKWHzl2);
        return abstractC58185ywXKWHzl2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: SignData */
    /* JADX DEBUG: Multi-variable search result rejected for r0v6, resolved type: SignData */
    /* JADX DEBUG: Multi-variable search result rejected for r3v17, resolved type: SignData */
    /* JADX DEBUG: Multi-variable search result rejected for r3v4, resolved type: SignData */
    /* JADX DEBUG: Multi-variable search result rejected for r3v8, resolved type: SignData */
    /* JADX DEBUG: Type inference failed for r3v3. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> copydefault(boolean z, int i) {
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXGasjUx;
        boolean z2;
        if (z) {
            if (((SolanaMultiContractSignData) QVsKAR()).getArray().isEmpty()) {
                abstractC58185ywXGasjUx = AbstractC58185ywX.KWHzl(C56390yDp.OLrzqt(java.lang.Boolean.FALSE, C10857bwP.AEQbTJ("OKWSolanaSignMultiContract", "array is empty")));
            } else {
                if (C33129mqd.OLrzqt((java.lang.CharSequence) ((SolanaMultiContractSignData) QVsKAR()).getTotalDataLength())) {
                    this.UeEOUB = ((SolanaMultiContractSignData) QVsKAR()).getTotalDataLength();
                    z2 = false;
                } else {
                    z2 = true;
                }
                if (C33129mqd.OLrzqt((java.lang.CharSequence) ((SolanaMultiContractSignData) QVsKAR()).getSigner())) {
                    java.lang.String signer = ((SolanaMultiContractSignData) QVsKAR()).getSigner();
                    Intrinsics.copydefault((java.lang.Object) signer);
                    this.QVAiDq = signer;
                    if (z2) {
                        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXFARcdN = fARcdN();
                        final Function1 function1 = new Function1() { // from class: o.bXh
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj) {
                                return C9475bWL.KWHzl(this.copydefault, (kotlin.Pair) obj);
                            }
                        };
                        abstractC58185ywXGasjUx = abstractC58185ywXFARcdN.KWHzl(new InterfaceC58229yxO() { // from class: o.bXe
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // o.InterfaceC58229yxO
                            public final java.lang.Object apply(java.lang.Object obj) {
                                return C9475bWL.DLWbHP(function1, obj);
                            }
                        });
                    } else {
                        abstractC58185ywXGasjUx = gasjUx();
                    }
                }
            }
        } else {
            abstractC58185ywXGasjUx = gasjUx();
        }
        final TaskDescription taskDescription = new TaskDescription(i);
        AbstractC58185ywX abstractC58185ywXAEQbTJ = abstractC58185ywXGasjUx.AEQbTJ(new InterfaceC58229yxO() { // from class: o.bXi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C9475bWL.hrNTAI(taskDescription, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        return abstractC58185ywXAEQbTJ;
    }

    public static final InterfaceC60096zvd DLWbHP(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public static final InterfaceC60096zvd KWHzl(C9475bWL c9475bWL, kotlin.Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        return c9475bWL.gasjUx();
    }

    /* JADX INFO: renamed from: o.bWL$TaskDescription */
    public static final class TaskDescription implements Function1<?, kotlin.Pair<? extends java.lang.Boolean, ? extends java.lang.String>> {
        public final /* synthetic */ int EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(int i) {
            this.EZpvd = i;
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public final kotlin.Pair<java.lang.Boolean, java.lang.String> invoke(kotlin.Pair<java.lang.Boolean, java.lang.String> pair) {
            Intrinsics.checkNotNullParameter(pair, "");
            if (pair.getFirst().booleanValue()) {
                C9475bWL.this.EZpvd(this.EZpvd);
            }
            return pair;
        }
    }

    public static final kotlin.Pair hrNTAI(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (kotlin.Pair) function1.invoke(obj);
    }

    /* JADX DEBUG: Type inference failed for r1v2. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> */
    private final AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> gasjUx() {
        C13934dbu c13934dbuIxgjPv = ixgjPv();
        java.lang.String strOxVOHk = OxVOHk();
        java.lang.String strDmq = Dmq();
        long jAhwBna = dHguZz().AhwBna();
        AbstractC58185ywX<ResponseData<SignInfo>> abstractC58185ywXCopydefault = c13934dbuIxgjPv.copydefault(strOxVOHk, strDmq, new SignInfoReq(java.lang.String.valueOf(jAhwBna), fERRXa().getAddress(), zLjUOn(), ai_(), (java.lang.String) null, C54862xYb.convertToBigIntegerString$default(zuBGHE(), true, (RoundingMode) null, 2, (java.lang.Object) null), this.UeEOUB, (java.lang.Integer) null, (java.lang.Long) null, (java.lang.Long) null, (java.lang.String) null, (java.lang.Integer) null, (java.lang.Boolean) null, 8064, (DefaultConstructorMarker) null));
        final Function1 function1 = new Function1() { // from class: o.bWQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C9475bWL.copydefault(this.copydefault, (ResponseData) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXAEQbTJ = abstractC58185ywXCopydefault.AEQbTJ(new InterfaceC58229yxO() { // from class: o.bWS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C9475bWL.QSLkRj(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        return abstractC58185ywXAEQbTJ;
    }

    public static final kotlin.Pair QSLkRj(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (kotlin.Pair) function1.invoke(obj);
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:34:0x0019 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:36:0x0019 */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: SignData */
    /* JADX WARN: Multi-variable type inference failed */
    public final AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> fARcdN() {
        AbstractC58185ywX abstractC58185ywXKWHzl;
        final Ref.IntRef intRef = new Ref.IntRef();
        final java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<T> it = ((SolanaMultiContractSignData) QVsKAR()).getArray().iterator();
        SolanaContractSignData solanaContractSignData = null;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            SolanaContractSignData solanaContractSignData2 = (SolanaContractSignData) it.next();
            java.lang.String url = solanaContractSignData2.getUrl();
            if (url != null && url.length() != 0) {
                intRef.element++;
                if (solanaContractSignData == null) {
                    solanaContractSignData = solanaContractSignData2;
                }
            } else if (solanaContractSignData2.getEncodeStr() != null) {
                java.lang.String encodeStr = solanaContractSignData2.getEncodeStr();
                Intrinsics.copydefault((java.lang.Object) encodeStr);
                arrayList.add(encodeStr);
            } else {
                java.lang.String data = solanaContractSignData2.getData();
                arrayList.add(data != null ? data : "");
            }
        }
        if (intRef.element == 0) {
            abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(C56390yDp.OLrzqt(java.lang.Boolean.TRUE, ""));
        } else {
            Intrinsics.copydefault(solanaContractSignData);
            java.lang.String method = solanaContractSignData.getMethod();
            java.lang.String url2 = solanaContractSignData.getUrl();
            Intrinsics.copydefault((java.lang.Object) url2);
            java.util.Map<java.lang.String, java.lang.Object> params = solanaContractSignData.getParams();
            Intrinsics.copydefault(params);
            AbstractC58185ywX<JSONObject> abstractC58185ywXCopydefault = copydefault(method, url2, (java.util.Map<java.lang.String, ? extends java.lang.Object>) params);
            final Function1 function1 = new Function1() { // from class: o.bXY
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C9475bWL.AEQbTJ(this.copydefault, intRef, arrayList, (JSONObject) obj);
                }
            };
            abstractC58185ywXKWHzl = abstractC58185ywXCopydefault.KWHzl(new InterfaceC58229yxO() { // from class: o.bXX
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58229yxO
                public final java.lang.Object apply(java.lang.Object obj) {
                    return C9475bWL.QHmsKR(function1, obj);
                }
            });
        }
        final Function1 function12 = new Function1() { // from class: o.bXZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C9475bWL.OLrzqt(this.copydefault, arrayList, (kotlin.Pair) obj);
            }
        };
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXKWHzl2 = abstractC58185ywXKWHzl.KWHzl(new InterfaceC58229yxO() { // from class: o.bYb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C9475bWL.QkdxfA(function12, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl2, "");
        return abstractC58185ywXKWHzl2;
    }

    public static final InterfaceC60096zvd QHmsKR(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public static final InterfaceC60096zvd AEQbTJ(final C9475bWL c9475bWL, final Ref.IntRef intRef, final java.util.List list, JSONObject jSONObject) {
        final java.lang.Object objM7377constructorimpl;
        Intrinsics.checkNotNullParameter(jSONObject, "");
        try {
            Result.Application application = Result.Companion;
            jSONObject.getJSONObject("data").getJSONObject("txSigned").getJSONArray("data");
            objM7377constructorimpl = Result.m7377constructorimpl(c9475bWL.RcXXUw().AEQbTJ(jSONObject));
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (Result.m7384isSuccessimpl(objM7377constructorimpl)) {
            return AbstractC58185ywX.KWHzl(new InterfaceC58187ywZ() { // from class: o.bYi
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58187ywZ
                public final void subscribe(InterfaceC58184ywW interfaceC58184ywW) throws java.lang.Throwable {
                    C9475bWL.KWHzl(this.OLrzqt, objM7377constructorimpl, intRef, list, interfaceC58184ywW);
                }
            }, BackpressureStrategy.BUFFER);
        }
        return AbstractC58185ywX.KWHzl(C56390yDp.OLrzqt(java.lang.Boolean.FALSE, Result.m7385toStringimpl(objM7377constructorimpl)));
    }

    public static final void KWHzl(C9475bWL c9475bWL, final java.lang.Object obj, final Ref.IntRef intRef, final java.util.List list, final InterfaceC58184ywW interfaceC58184ywW) throws java.lang.Throwable {
        Intrinsics.checkNotNullParameter(interfaceC58184ywW, "");
        C9658bZj c9658bZjRcXXUw = c9475bWL.RcXXUw();
        C56391yDq.AEQbTJ(obj);
        Intrinsics.copydefault(obj, "");
        c9658bZjRcXXUw.AEQbTJ((JSONArray) obj, new Function1() { // from class: o.bXb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj2) {
                return C9475bWL.copydefault(obj, intRef, list, interfaceC58184ywW, (SolanaTxResult) obj2);
            }
        });
    }

    public static final Unit copydefault(java.lang.Object obj, Ref.IntRef intRef, java.util.List list, InterfaceC58184ywW interfaceC58184ywW, SolanaTxResult solanaTxResult) {
        java.lang.Object objM7377constructorimpl;
        try {
            Result.Application application = Result.Companion;
            int i = intRef.element;
            for (int i2 = 0; i2 < i; i2++) {
                java.lang.String encodeTransactionStr = solanaTxResult != null ? solanaTxResult.getEncodeTransactionStr() : null;
                if (encodeTransactionStr == null) {
                    encodeTransactionStr = "";
                }
                list.add(encodeTransactionStr);
            }
            objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (Result.m7384isSuccessimpl(objM7377constructorimpl)) {
            interfaceC58184ywW.onNext(C56390yDp.OLrzqt(java.lang.Boolean.TRUE, ""));
        } else {
            interfaceC58184ywW.onNext(C56390yDp.OLrzqt(java.lang.Boolean.FALSE, Result.m7385toStringimpl(objM7377constructorimpl)));
        }
        interfaceC58184ywW.onComplete();
        return Unit.INSTANCE;
    }

    public static final InterfaceC60096zvd QkdxfA(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v1, resolved type: SignData */
    /* JADX WARN: Multi-variable type inference failed */
    public static final InterfaceC60096zvd OLrzqt(final C9475bWL c9475bWL, final java.util.List list, kotlin.Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        if (((java.lang.Boolean) pair.getFirst()).booleanValue()) {
            java.lang.String signer = ((SolanaMultiContractSignData) c9475bWL.QVsKAR()).getSigner();
            if (signer == null || signer.length() == 0) {
                AbstractC58185ywX abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(new InterfaceC58187ywZ() { // from class: o.bWW
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.InterfaceC58187ywZ
                    public final void subscribe(InterfaceC58184ywW interfaceC58184ywW) {
                        C9475bWL.copydefault(this.KWHzl, list, interfaceC58184ywW);
                    }
                }, BackpressureStrategy.BUFFER);
                Intrinsics.copydefault(abstractC58185ywXKWHzl);
                return abstractC58185ywXKWHzl;
            }
            AbstractC58185ywX abstractC58185ywXKWHzl2 = AbstractC58185ywX.KWHzl(C56390yDp.OLrzqt(java.lang.Boolean.TRUE, ""));
            Intrinsics.copydefault(abstractC58185ywXKWHzl2);
            return abstractC58185ywXKWHzl2;
        }
        AbstractC58185ywX abstractC58185ywXKWHzl3 = AbstractC58185ywX.KWHzl(pair);
        Intrinsics.copydefault(abstractC58185ywXKWHzl3);
        return abstractC58185ywXKWHzl3;
    }

    public static final void copydefault(final C9475bWL c9475bWL, java.util.List list, final InterfaceC58184ywW interfaceC58184ywW) {
        Intrinsics.checkNotNullParameter(interfaceC58184ywW, "");
        c9475bWL.RcXXUw().AEQbTJ((java.util.List<java.lang.String>) list, new Function1() { // from class: o.bXm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C9475bWL.EZpvd(this.EZpvd, interfaceC58184ywW, (java.lang.String) obj);
            }
        });
    }

    public static final Unit EZpvd(C9475bWL c9475bWL, InterfaceC58184ywW interfaceC58184ywW, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        c9475bWL.QVAiDq = str;
        interfaceC58184ywW.onNext(C56390yDp.OLrzqt(java.lang.Boolean.TRUE, ""));
        interfaceC58184ywW.onComplete();
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: SignData */
    /* JADX WARN: Multi-variable type inference failed */
    public final AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> dvKsVJ() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (SolanaContractSignData solanaContractSignData : ((SolanaMultiContractSignData) QVsKAR()).getArray()) {
            java.lang.String url = solanaContractSignData.getUrl();
            if (url == null || url.length() == 0) {
                if (solanaContractSignData.getEncodeStr() != null) {
                    java.lang.String encodeTransactionStr = solanaContractSignData.getEncodeTransactionStr();
                    if (encodeTransactionStr != null) {
                        arrayList.add(encodeTransactionStr);
                    }
                } else {
                    java.lang.String data = solanaContractSignData.getData();
                    if (data != null) {
                        arrayList.add(data);
                    }
                }
            }
        }
        return djBIcL(arrayList);
    }

    public final AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> djBIcL(final java.util.List<java.lang.String> list) {
        if (list.isEmpty()) {
            AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(C56390yDp.OLrzqt(java.lang.Boolean.TRUE, ""));
            Intrinsics.copydefault(abstractC58185ywXKWHzl);
            return abstractC58185ywXKWHzl;
        }
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXKWHzl2 = AbstractC58185ywX.KWHzl(new InterfaceC58187ywZ() { // from class: o.bYp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58187ywZ
            public final void subscribe(InterfaceC58184ywW interfaceC58184ywW) {
                C9475bWL.AEQbTJ(this.AEQbTJ, list, interfaceC58184ywW);
            }
        }, BackpressureStrategy.BUFFER);
        Intrinsics.copydefault(abstractC58185ywXKWHzl2);
        return abstractC58185ywXKWHzl2;
    }

    public static final void AEQbTJ(final C9475bWL c9475bWL, java.util.List list, final InterfaceC58184ywW interfaceC58184ywW) {
        Intrinsics.checkNotNullParameter(interfaceC58184ywW, "");
        c9475bWL.RcXXUw().KWHzl((java.util.List<java.lang.String>) list, new Function1() { // from class: o.bXc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C9475bWL.copydefault(this.copydefault, interfaceC58184ywW, (java.util.List) obj);
            }
        });
    }

    public static final Unit copydefault(C9475bWL c9475bWL, InterfaceC58184ywW interfaceC58184ywW, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        c9475bWL.valueOf = list;
        interfaceC58184ywW.onNext(C56390yDp.OLrzqt(java.lang.Boolean.TRUE, ""));
        interfaceC58184ywW.onComplete();
        return Unit.INSTANCE;
    }

    public final AbstractC58260yxt<Unit> OLrzqt(final TreeMap<java.lang.Integer, kotlin.Pair<java.lang.String, java.lang.String>> treeMap, final LinkedHashMap<java.lang.Integer, SolanaContractSignData> linkedHashMap) {
        if (!linkedHashMap.isEmpty()) {
            java.util.Collection<SolanaContractSignData> collectionValues = linkedHashMap.values();
            Intrinsics.checkNotNullExpressionValue(collectionValues, "");
            java.util.Collection<SolanaContractSignData> collection = collectionValues;
            java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(collection, 10));
            for (SolanaContractSignData solanaContractSignData : collection) {
                java.lang.String method = solanaContractSignData.getMethod();
                java.lang.String url = solanaContractSignData.getUrl();
                Intrinsics.copydefault((java.lang.Object) url);
                java.util.Map<java.lang.String, java.lang.Object> params = solanaContractSignData.getParams();
                Intrinsics.copydefault(params);
                arrayList.add(copydefault(method, url, (java.util.Map<java.lang.String, ? extends java.lang.Object>) params).OLrzqt(new JSONObject()));
            }
            final Function1 function1 = new Function1() { // from class: o.bXn
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C9475bWL.OLrzqt(linkedHashMap, this, (java.lang.Object[]) obj);
                }
            };
            InterfaceC58229yxO interfaceC58229yxO = new InterfaceC58229yxO() { // from class: o.bXo
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58229yxO
                public final java.lang.Object apply(java.lang.Object obj) {
                    return C9475bWL.fjfviF(function1, obj);
                }
            };
            AbstractC58260yxt[] abstractC58260yxtArr = (AbstractC58260yxt[]) arrayList.toArray(new AbstractC58260yxt[0]);
            AbstractC58260yxt abstractC58260yxtOLrzqt = AbstractC58260yxt.OLrzqt(interfaceC58229yxO, (InterfaceC58261yxu[]) java.util.Arrays.copyOf(abstractC58260yxtArr, abstractC58260yxtArr.length));
            final Function1 function12 = new Function1() { // from class: o.bXs
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C9475bWL.OLrzqt(this.AEQbTJ, treeMap, (LinkedHashMap) obj);
                }
            };
            AbstractC58260yxt<Unit> abstractC58260yxtOLrzqt2 = abstractC58260yxtOLrzqt.OLrzqt(new InterfaceC58229yxO() { // from class: o.bXq
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58229yxO
                public final java.lang.Object apply(java.lang.Object obj) {
                    return C9475bWL.igXuih(function12, obj);
                }
            });
            Intrinsics.checkNotNullExpressionValue(abstractC58260yxtOLrzqt2, "");
            return abstractC58260yxtOLrzqt2;
        }
        AbstractC58260yxt<Unit> abstractC58260yxtCopydefault = AbstractC58260yxt.copydefault(Unit.INSTANCE);
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtCopydefault, "");
        return abstractC58260yxtCopydefault;
    }

    public static final LinkedHashMap fjfviF(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (LinkedHashMap) function1.invoke(obj);
    }

    public static final LinkedHashMap OLrzqt(LinkedHashMap linkedHashMap, C9475bWL c9475bWL, java.lang.Object[] objArr) {
        Intrinsics.checkNotNullParameter(objArr, "");
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        java.util.Set setKeySet = linkedHashMap.keySet();
        Intrinsics.checkNotNullExpressionValue(setKeySet, "");
        int i = 0;
        for (java.lang.Object obj : setKeySet) {
            if (i < 0) {
                yDY.AYXKKw();
            }
            java.lang.Integer num = (java.lang.Integer) obj;
            java.lang.Object obj2 = objArr[i];
            Intrinsics.copydefault(obj2, "");
            JSONArray jSONArrayAEQbTJ = c9475bWL.RcXXUw().AEQbTJ((JSONObject) obj2);
            if (jSONArrayAEQbTJ != null) {
                linkedHashMap2.put(num, jSONArrayAEQbTJ);
            }
            i++;
        }
        return linkedHashMap2;
    }

    public static final InterfaceC58261yxu igXuih(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58261yxu) function1.invoke(obj);
    }

    public static final InterfaceC58261yxu OLrzqt(final C9475bWL c9475bWL, final TreeMap treeMap, final LinkedHashMap linkedHashMap) {
        Intrinsics.checkNotNullParameter(linkedHashMap, "");
        return AbstractC58260yxt.OLrzqt(new InterfaceC58259yxs() { // from class: o.bXJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58259yxs
            public final void subscribe(InterfaceC58257yxq interfaceC58257yxq) {
                C9475bWL.EZpvd(this.AEQbTJ, linkedHashMap, treeMap, interfaceC58257yxq);
            }
        });
    }

    public static final void EZpvd(final C9475bWL c9475bWL, final LinkedHashMap linkedHashMap, final TreeMap treeMap, final InterfaceC58257yxq interfaceC58257yxq) {
        Intrinsics.checkNotNullParameter(interfaceC58257yxq, "");
        C9658bZj c9658bZjRcXXUw = c9475bWL.RcXXUw();
        java.util.Collection collectionValues = linkedHashMap.values();
        Intrinsics.checkNotNullExpressionValue(collectionValues, "");
        c9658bZjRcXXUw.gEmmrt(CollectionsKt___CollectionsKt.AxsJAYsNCnLh(collectionValues), new Function1() { // from class: o.bXH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C9475bWL.copydefault(this.KWHzl, interfaceC58257yxq, linkedHashMap, treeMap, (java.util.List) obj);
            }
        });
    }

    public static final Unit copydefault(C9475bWL c9475bWL, InterfaceC58257yxq interfaceC58257yxq, LinkedHashMap linkedHashMap, TreeMap treeMap, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        try {
            Result.Application application = Result.Companion;
            java.util.Set setKeySet = linkedHashMap.keySet();
            Intrinsics.checkNotNullExpressionValue(setKeySet, "");
            int i = 0;
            for (java.lang.Object obj : setKeySet) {
                if (i < 0) {
                    yDY.AYXKKw();
                }
                SolanaTxResult solanaTxResult = (SolanaTxResult) list.get(i);
                treeMap.put((java.lang.Integer) obj, C56390yDp.OLrzqt(solanaTxResult.getEncodeStr(), solanaTxResult.getEncodeTransactionStr()));
                i++;
            }
            Result.m7377constructorimpl(Unit.INSTANCE);
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        Unit unit = Unit.INSTANCE;
        interfaceC58257yxq.onSuccess(unit);
        return unit;
    }

    public final AbstractC58260yxt<Unit> OLrzqt(java.util.Map<java.lang.Integer, kotlin.Pair<java.lang.String, java.lang.String>> map, java.util.Map<java.lang.Integer, java.lang.String> map2, java.util.Map<java.lang.Integer, kotlin.Pair<java.lang.String, java.lang.String>> map3) {
        final java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<T> it = map.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add(((kotlin.Pair) ((Map.Entry) it.next()).getValue()).getSecond());
        }
        java.util.Iterator<T> it2 = map2.entrySet().iterator();
        while (it2.hasNext()) {
            arrayList.add(((Map.Entry) it2.next()).getValue());
        }
        java.util.Iterator<T> it3 = map3.entrySet().iterator();
        while (it3.hasNext()) {
            arrayList.add(((kotlin.Pair) ((Map.Entry) it3.next()).getValue()).getSecond());
        }
        AbstractC58260yxt<Unit> abstractC58260yxtOLrzqt = AbstractC58260yxt.OLrzqt(AbstractC58260yxt.OLrzqt(new InterfaceC58259yxs() { // from class: o.bXp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58259yxs
            public final void subscribe(InterfaceC58257yxq interfaceC58257yxq) {
                C9475bWL.AEQbTJ(this.KWHzl, arrayList, interfaceC58257yxq);
            }
        }), AbstractC58260yxt.OLrzqt(new InterfaceC58259yxs() { // from class: o.bXr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58259yxs
            public final void subscribe(InterfaceC58257yxq interfaceC58257yxq) {
                C9475bWL.copydefault(this.EZpvd, arrayList, interfaceC58257yxq);
            }
        }), new C9566bXx(new Function2() { // from class: o.bXw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C9475bWL.OLrzqt((Unit) obj, (Unit) obj2);
            }
        }));
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtOLrzqt, "");
        return abstractC58260yxtOLrzqt;
    }

    public static final void AEQbTJ(final C9475bWL c9475bWL, java.util.List list, final InterfaceC58257yxq interfaceC58257yxq) {
        Intrinsics.checkNotNullParameter(interfaceC58257yxq, "");
        c9475bWL.RcXXUw().OLrzqt((java.util.List<java.lang.String>) list, new Function1() { // from class: o.bXj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C9475bWL.OLrzqt(this.KWHzl, interfaceC58257yxq, (java.lang.String) obj);
            }
        });
    }

    public static final Unit OLrzqt(C9475bWL c9475bWL, InterfaceC58257yxq interfaceC58257yxq, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        c9475bWL.UeEOUB = str;
        Unit unit = Unit.INSTANCE;
        interfaceC58257yxq.onSuccess(unit);
        return unit;
    }

    public static final void copydefault(final C9475bWL c9475bWL, java.util.List list, final InterfaceC58257yxq interfaceC58257yxq) {
        Intrinsics.checkNotNullParameter(interfaceC58257yxq, "");
        c9475bWL.RcXXUw().AEQbTJ((java.util.List<java.lang.String>) list, new Function1() { // from class: o.bXl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C9475bWL.KWHzl(this.AEQbTJ, interfaceC58257yxq, (java.lang.String) obj);
            }
        });
    }

    public static final Unit KWHzl(C9475bWL c9475bWL, InterfaceC58257yxq interfaceC58257yxq, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        c9475bWL.QVAiDq = str;
        Unit unit = Unit.INSTANCE;
        interfaceC58257yxq.onSuccess(unit);
        return unit;
    }

    public static final Unit copydefault(Function2 function2, java.lang.Object obj, java.lang.Object obj2) {
        Intrinsics.checkNotNullParameter(obj, "");
        Intrinsics.checkNotNullParameter(obj2, "");
        return (Unit) function2.invoke(obj, obj2);
    }

    public static final Unit OLrzqt(Unit unit, Unit unit2) {
        Intrinsics.checkNotNullParameter(unit, "");
        Intrinsics.checkNotNullParameter(unit2, "");
        return Unit.INSTANCE;
    }

    public static /* synthetic */ AbstractC58260yxt blockHash$default(C9475bWL c9475bWL, TreeMap treeMap, LinkedHashMap linkedHashMap, boolean z, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: blockHash");
        }
        if ((i & 4) != 0) {
            z = false;
        }
        return c9475bWL.EZpvd((TreeMap<java.lang.Integer, kotlin.Pair<java.lang.String, java.lang.String>>) treeMap, (LinkedHashMap<java.lang.Integer, java.lang.String>) linkedHashMap, z);
    }

    public final AbstractC58260yxt<Unit> EZpvd(final TreeMap<java.lang.Integer, kotlin.Pair<java.lang.String, java.lang.String>> treeMap, final LinkedHashMap<java.lang.Integer, java.lang.String> linkedHashMap, final boolean z) {
        if (!linkedHashMap.isEmpty()) {
            SolanaSignInfo solanaSignInfoAkhnZx = AkhnZx();
            java.lang.String recentBlockhash = solanaSignInfoAkhnZx != null ? solanaSignInfoAkhnZx.getRecentBlockhash() : null;
            final java.lang.String str = recentBlockhash == null ? "" : recentBlockhash;
            AbstractC58260yxt<Unit> abstractC58260yxtOLrzqt = AbstractC58260yxt.OLrzqt(new InterfaceC58259yxs() { // from class: o.bWZ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58259yxs
                public final void subscribe(InterfaceC58257yxq interfaceC58257yxq) {
                    C9475bWL.EZpvd(this.EZpvd, treeMap, str, linkedHashMap, z, interfaceC58257yxq);
                }
            });
            Intrinsics.checkNotNullExpressionValue(abstractC58260yxtOLrzqt, "");
            return abstractC58260yxtOLrzqt;
        }
        AbstractC58260yxt<Unit> abstractC58260yxtCopydefault = AbstractC58260yxt.copydefault(Unit.INSTANCE);
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtCopydefault, "");
        return abstractC58260yxtCopydefault;
    }

    public static final void EZpvd(final C9475bWL c9475bWL, final TreeMap treeMap, final java.lang.String str, final LinkedHashMap linkedHashMap, final boolean z, final InterfaceC58257yxq interfaceC58257yxq) {
        Intrinsics.checkNotNullParameter(interfaceC58257yxq, "");
        ((InterfaceC9846bdL) C43251rlk.copydefault(InterfaceC9846bdL.class)).copydefault("501", new Function1() { // from class: o.bXK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C9475bWL.AEQbTJ(this.KWHzl, interfaceC58257yxq, treeMap, str, linkedHashMap, z, (java.lang.String) obj);
            }
        }, new Function1() { // from class: o.bXL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C9475bWL.EZpvd(this.KWHzl, interfaceC58257yxq, treeMap, str, linkedHashMap, z, (java.lang.String) obj);
            }
        });
    }

    public static final Unit AEQbTJ(C9475bWL c9475bWL, InterfaceC58257yxq interfaceC58257yxq, TreeMap treeMap, java.lang.String str, LinkedHashMap linkedHashMap, boolean z, java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str2, "");
        if (!C33129mqd.OLrzqt((java.lang.CharSequence) str2)) {
            str2 = "/fullnode/sol/discover/rpc";
        }
        java.lang.String str3 = str2;
        C9658bZj c9658bZjRcXXUw = c9475bWL.RcXXUw();
        Intrinsics.copydefault(interfaceC58257yxq);
        c9658bZjRcXXUw.OLrzqt(interfaceC58257yxq, str3, treeMap, str, linkedHashMap, c9475bWL.aKErDB(), z, false);
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(C9475bWL c9475bWL, InterfaceC58257yxq interfaceC58257yxq, TreeMap treeMap, java.lang.String str, LinkedHashMap linkedHashMap, boolean z, java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str2, "");
        C9658bZj c9658bZjRcXXUw = c9475bWL.RcXXUw();
        Intrinsics.copydefault(interfaceC58257yxq);
        c9658bZjRcXXUw.OLrzqt(interfaceC58257yxq, "/fullnode/sol/discover/rpc", treeMap, str, linkedHashMap, c9475bWL.aKErDB(), z, false);
        return Unit.INSTANCE;
    }

    public final AbstractC58260yxt<Unit> copydefault(TreeMap<java.lang.Integer, kotlin.Pair<java.lang.String, java.lang.String>> treeMap, java.util.HashMap<java.lang.Integer, kotlin.Pair<java.lang.String, java.lang.String>> map) {
        treeMap.putAll(map);
        AbstractC58260yxt<Unit> abstractC58260yxtCopydefault = AbstractC58260yxt.copydefault(Unit.INSTANCE);
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtCopydefault, "");
        return abstractC58260yxtCopydefault;
    }

    public final AbstractC58260yxt<Unit> EZpvd(final TreeMap<java.lang.Integer, kotlin.Pair<java.lang.String, java.lang.String>> treeMap, final java.util.List<java.lang.String> list) {
        AbstractC58260yxt<Unit> abstractC58260yxtOLrzqt = AbstractC58260yxt.OLrzqt(new InterfaceC58259yxs() { // from class: o.bYo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58259yxs
            public final void subscribe(InterfaceC58257yxq interfaceC58257yxq) {
                C9475bWL.AEQbTJ(this.OLrzqt, list, treeMap, interfaceC58257yxq);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtOLrzqt, "");
        return abstractC58260yxtOLrzqt;
    }

    public static final void AEQbTJ(final C9475bWL c9475bWL, java.util.List list, final TreeMap treeMap, final InterfaceC58257yxq interfaceC58257yxq) {
        Intrinsics.checkNotNullParameter(interfaceC58257yxq, "");
        c9475bWL.RcXXUw().EZpvd((java.util.List<java.lang.String>) list, new Function1() { // from class: o.bXk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C9475bWL.OLrzqt(this.copydefault, treeMap, interfaceC58257yxq, (java.lang.String) obj);
            }
        });
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.bYW.priorityFee$default(o.bYW, int, int, java.lang.Object):java.lang.String */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: SignData */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit OLrzqt(C9475bWL c9475bWL, TreeMap treeMap, InterfaceC58257yxq interfaceC58257yxq, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        try {
            Result.Application application = Result.Companion;
            JSONArray jSONArray = new JSONArray(str);
            if (jSONArray.length() == treeMap.size()) {
                java.util.Set setKeySet = treeMap.keySet();
                Intrinsics.checkNotNullExpressionValue(setKeySet, "");
                int i = 0;
                for (java.lang.Object obj : setKeySet) {
                    if (i < 0) {
                        yDY.AYXKKw();
                    }
                    java.lang.Integer num = (java.lang.Integer) obj;
                    java.util.List<SolanaContractSignData> array = ((SolanaMultiContractSignData) c9475bWL.QVsKAR()).getArray();
                    Intrinsics.copydefault(num);
                    array.get(num.intValue()).setServiceCharge(C54862xYb.KWHzl(C54862xYb.OLrzqt(c9475bWL.fJNWhG().fetchVPNInfo(), jSONArray.getString(i)), C9592bYW.priorityFee$default(c9475bWL.fJNWhG(), 0, 1, null)).toString());
                    i++;
                }
            }
            Result.m7377constructorimpl(Unit.INSTANCE);
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        Unit unit = Unit.INSTANCE;
        interfaceC58257yxq.onSuccess(unit);
        return unit;
    }

    /* JADX DEBUG: Type inference failed for r3v4. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<org.json.JSONObject> */
    private final AbstractC58185ywX<JSONObject> copydefault(java.lang.String str, java.lang.String str2, java.util.Map<java.lang.String, ? extends java.lang.Object> map) {
        AbstractC58185ywX<kotlinx.serialization.json.JsonObject> abstractC58185ywXCopydefault;
        C13926dbm c13926dbm = new C13926dbm();
        if (Intrinsics.EZpvd((java.lang.Object) "post", (java.lang.Object) str)) {
            abstractC58185ywXCopydefault = c13926dbm.KWHzl(str2, map);
        } else {
            abstractC58185ywXCopydefault = c13926dbm.copydefault(str2, map);
        }
        final Function1 function1 = new Function1() { // from class: o.bXa
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C9475bWL.AEQbTJ((kotlinx.serialization.json.JsonObject) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXAEQbTJ = abstractC58185ywXCopydefault.AEQbTJ(new InterfaceC58229yxO() { // from class: o.bXd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C9475bWL.ODXsMY(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        return abstractC58185ywXAEQbTJ;
    }

    public static final JSONObject ODXsMY(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (JSONObject) function1.invoke(obj);
    }

    public static final JSONObject AEQbTJ(kotlinx.serialization.json.JsonObject jsonObject) {
        Intrinsics.checkNotNullParameter(jsonObject, "");
        return new JSONObject(jsonObject.toString());
    }

    public final boolean djSkpj() {
        return OJuSTm().getSolanaSignType() == SolanaSignType.FAST;
    }

    public static final kotlin.Pair copydefault(C9475bWL c9475bWL, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            SignInfo signInfo = (SignInfo) responseData.getData();
            c9475bWL.copydefault(signInfo != null ? signInfo.getSupportPush() : false);
            Json jsonAEQbTJ = C33489mxS.KWHzl.AEQbTJ();
            KSerializer<SolanaSignInfo> kSerializerSerializer = SolanaSignInfo.Companion.serializer();
            SignInfo signInfo2 = (SignInfo) responseData.getData();
            kotlinx.serialization.json.JsonObject info = signInfo2 != null ? signInfo2.getInfo() : null;
            Intrinsics.copydefault(info);
            c9475bWL.AEQbTJ((SolanaSignInfo) jsonAEQbTJ.decodeFromJsonElement(kSerializerSerializer, info));
            C8518bEI c8518bEIAc_ = c9475bWL.ac_();
            SolanaSignInfo solanaSignInfoAkhnZx = c9475bWL.AkhnZx();
            c8518bEIAc_.OLrzqt(solanaSignInfoAkhnZx != null ? solanaSignInfoAkhnZx.getReserveFeeRatio() : null);
            c9475bWL.EZpvd(2);
            return C56390yDp.OLrzqt(java.lang.Boolean.TRUE, "");
        }
        return C56390yDp.OLrzqt(java.lang.Boolean.FALSE, responseData.getMsg());
    }
}
