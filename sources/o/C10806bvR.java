package o;

import com.google.firebase.messaging.Constants;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import com.okinc.business.defi.api.bean.BTCDappSignData;
import com.okinc.business.defi.api.bean.DappSignArgs;
import com.okinc.business.defi.biz.model.ChainAddress;
import com.okinc.business.defi.biz.model.wallet.MpcWalletDecodeInfo;
import com.okinc.business.defi.biz.model.wallet.MpcWalletEncodeInfo;
import com.okinc.business.defi.biz.net.bean.DAppBTCSignPrompt;
import com.okinc.business.defi.biz.net.bean.DappBTCUTXOResp;
import com.okinc.business.defi.biz.net.bean.DappBtcUtxoFeeReq;
import com.okinc.business.defi.biz.net.bean.InputAndOutput;
import com.okinc.business.defi.biz.net.bean.InputBean;
import com.okinc.business.defi.biz.net.bean.OutputBean;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.wallet.core.decode.PsbtDecodeInputItem;
import com.okinc.wallet.core.decode.PsbtDecodeNewItem;
import com.okinc.wallet.core.decode.PsbtDecodeOutputItem;
import com.okinc.wallet.core.sign.utxo.MPCBRC20PsbtResult;
import com.okinc.wallet.core.sign.utxo.MPCBtcMessage;
import com.okinc.wallet.core.sign.utxo.MPCRawPsbtTx;
import com.okinc.wallet.core.sign.utxo.RSV;
import io.reactivex.BackpressureStrategy;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import o.C11010bzJ;
import o.C13754dXa;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.bvR, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C10806bvR extends AbstractC10828bvn {
    public BTCDappSignData AkhnZx;
    public java.lang.String djBIcL;
    public Triple<java.lang.Boolean, java.lang.Boolean, java.lang.String> isConnected;
    public final C12797ctk values = new C12797ctk();
    public C12804ctr AYXKKw = new C12804ctr();

    public final boolean ejfBZ() {
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String fARcdN() {
        return this.djBIcL;
    }

    @Override // o.AbstractC10828bvn
    public java.lang.String fIwbmz() {
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C12804ctr iwGUEr() {
        return this.AYXKKw;
    }

    public static final kotlin.Pair copydefault(Function2 function2, java.lang.Object obj, java.lang.Object obj2) {
        Intrinsics.checkNotNullParameter(obj, "");
        Intrinsics.checkNotNullParameter(obj2, "");
        return (kotlin.Pair) function2.invoke(obj, obj2);
    }

    @Override // o.AbstractC10828bvn
    public AbstractC58260yxt<kotlin.Pair<java.lang.Boolean, java.lang.String>> copydefault(@NotNull AbstractC12782ctV abstractC12782ctV, @NotNull final DappSignArgs dappSignArgs) {
        Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
        Intrinsics.checkNotNullParameter(dappSignArgs, "");
        AbstractC58260yxt<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58260yxtCopydefault = super.copydefault(abstractC12782ctV, dappSignArgs);
        AbstractC58260yxt<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58260yxtZLjUOn = zLjUOn();
        final Function2 function2 = new Function2() { // from class: o.bwl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C10806bvR.copydefault((kotlin.Pair) obj, (kotlin.Pair) obj2);
            }
        };
        AbstractC58260yxt abstractC58260yxtOLrzqt = AbstractC58260yxt.OLrzqt(abstractC58260yxtCopydefault, abstractC58260yxtZLjUOn, new InterfaceC58223yxI() { // from class: o.bwm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58223yxI
            public final java.lang.Object apply(java.lang.Object obj, java.lang.Object obj2) {
                return C10806bvR.copydefault(function2, obj, obj2);
            }
        });
        final Function1 function1 = new Function1() { // from class: o.bwk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C10806bvR.copydefault(this.copydefault, dappSignArgs, (kotlin.Pair) obj);
            }
        };
        AbstractC58260yxt abstractC58260yxtCopydefault2 = abstractC58260yxtOLrzqt.copydefault(new InterfaceC58229yxO() { // from class: o.bwj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C10806bvR.zsXlph(function1, obj);
            }
        });
        final Function1 function12 = new Function1() { // from class: o.bwr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C10806bvR.OLrzqt(this.AEQbTJ, (kotlin.Pair) obj);
            }
        };
        AbstractC58260yxt<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58260yxtOLrzqt2 = abstractC58260yxtCopydefault2.OLrzqt(new InterfaceC58229yxO() { // from class: o.bwq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C10806bvR.wlaJM(function12, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtOLrzqt2, "");
        return abstractC58260yxtOLrzqt2;
    }

    public static final kotlin.Pair copydefault(kotlin.Pair pair, kotlin.Pair pair2) {
        Intrinsics.checkNotNullParameter(pair, "");
        Intrinsics.checkNotNullParameter(pair2, "");
        return (((java.lang.Boolean) pair.getFirst()).booleanValue() && ((java.lang.Boolean) pair2.getFirst()).booleanValue()) ? C56390yDp.OLrzqt(java.lang.Boolean.TRUE, "") : !((java.lang.Boolean) pair.getFirst()).booleanValue() ? C56390yDp.OLrzqt(java.lang.Boolean.FALSE, pair.getSecond()) : !((java.lang.Boolean) pair2.getFirst()).booleanValue() ? C56390yDp.OLrzqt(java.lang.Boolean.FALSE, pair2.getSecond()) : C56390yDp.OLrzqt(java.lang.Boolean.FALSE, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
    }

    public static final kotlin.Pair zsXlph(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (kotlin.Pair) function1.invoke(obj);
    }

    public static final kotlin.Pair copydefault(C10806bvR c10806bvR, DappSignArgs dappSignArgs, kotlin.Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        try {
            BTCDappSignData bTCDappSignData = (BTCDappSignData) C33490mxT.EZpvd(dappSignArgs.getData(), BTCDappSignData.class);
            c10806bvR.AkhnZx = bTCDappSignData;
            if (bTCDappSignData == null) {
                return C56390yDp.OLrzqt(java.lang.Boolean.FALSE, C33070mpX.AYXKKw(C13754dXa.FragmentManager.htlTjW));
            }
            java.lang.String from = bTCDappSignData != null ? bTCDappSignData.getFrom() : null;
            if (from != null && from.length() != 0 && c10806bvR.isConnected() != null) {
                return pair;
            }
            return C56390yDp.OLrzqt(java.lang.Boolean.FALSE, C33070mpX.AYXKKw(C13754dXa.FragmentManager.igXuih));
        } catch (java.lang.Exception e) {
            C43296rmc.copydefault("BTCDappSignInteraction", "BTC sign init failed", e);
            return C56390yDp.OLrzqt(java.lang.Boolean.FALSE, C33070mpX.AYXKKw(C13754dXa.FragmentManager.htlTjW));
        }
    }

    public static final InterfaceC58261yxu wlaJM(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58261yxu) function1.invoke(obj);
    }

    public static final InterfaceC58261yxu OLrzqt(C10806bvR c10806bvR, kotlin.Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        if (((java.lang.Boolean) pair.getFirst()).booleanValue()) {
            AbstractC58260yxt<kotlin.Pair<java.lang.Boolean, java.lang.String>> fieldNames = c10806bvR.getFieldNames();
            AbstractC58260yxt<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58260yxtUzCIH = c10806bvR.uzCIH();
            final Function2 function2 = new Function2() { // from class: o.bwh
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return C10806bvR.OLrzqt((kotlin.Pair) obj, (kotlin.Pair) obj2);
                }
            };
            return AbstractC58260yxt.OLrzqt(fieldNames, abstractC58260yxtUzCIH, new InterfaceC58223yxI() { // from class: o.bwd
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58223yxI
                public final java.lang.Object apply(java.lang.Object obj, java.lang.Object obj2) {
                    return C10806bvR.EZpvd(function2, obj, obj2);
                }
            });
        }
        return AbstractC58260yxt.copydefault(pair);
    }

    public static final kotlin.Pair EZpvd(Function2 function2, java.lang.Object obj, java.lang.Object obj2) {
        Intrinsics.checkNotNullParameter(obj, "");
        Intrinsics.checkNotNullParameter(obj2, "");
        return (kotlin.Pair) function2.invoke(obj, obj2);
    }

    public static final kotlin.Pair OLrzqt(kotlin.Pair pair, kotlin.Pair pair2) {
        Intrinsics.checkNotNullParameter(pair, "");
        Intrinsics.checkNotNullParameter(pair2, "");
        return !((java.lang.Boolean) pair.getFirst()).booleanValue() ? C56390yDp.OLrzqt(java.lang.Boolean.FALSE, pair.getSecond()) : !((java.lang.Boolean) pair2.getFirst()).booleanValue() ? C56390yDp.OLrzqt(java.lang.Boolean.FALSE, pair2.getSecond()) : C56390yDp.OLrzqt(java.lang.Boolean.TRUE, "");
    }

    public final AbstractC58260yxt<kotlin.Pair<java.lang.Boolean, java.lang.String>> zLjUOn() {
        if (!ejfBZ()) {
            AbstractC58260yxt<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58260yxtCopydefault = AbstractC58260yxt.copydefault(C56390yDp.OLrzqt(java.lang.Boolean.TRUE, ""));
            Intrinsics.checkNotNullExpressionValue(abstractC58260yxtCopydefault, "");
            return abstractC58260yxtCopydefault;
        }
        AbstractC58260yxt<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58260yxtValueOf = C12804ctr.init$default(this.AYXKKw, values(), null, 2, null).valueOf();
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtValueOf, "");
        return abstractC58260yxtValueOf;
    }

    public final AbstractC58260yxt<kotlin.Pair<java.lang.Boolean, java.lang.String>> uzCIH() {
        if (AubY()) {
            java.lang.Boolean bool = java.lang.Boolean.FALSE;
            this.isConnected = new Triple<>(bool, bool, "");
            AbstractC58260yxt<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58260yxtCopydefault = AbstractC58260yxt.copydefault(C56390yDp.OLrzqt(java.lang.Boolean.TRUE, ""));
            Intrinsics.copydefault(abstractC58260yxtCopydefault);
            return abstractC58260yxtCopydefault;
        }
        AbstractC58185ywX<ResponseData<DappBTCUTXOResp>> abstractC58185ywXEZpvd = new C13934dbu().EZpvd(getNewProxyInstance());
        final Function1 function1 = new Function1() { // from class: o.bwg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C10806bvR.EZpvd(this.AEQbTJ, (ResponseData) obj);
            }
        };
        AbstractC58260yxt<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58260yxtValueOf = abstractC58185ywXEZpvd.AEQbTJ(new InterfaceC58229yxO() { // from class: o.bwe
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C10806bvR.AuCTelauCTel(function1, obj);
            }
        }).valueOf();
        Intrinsics.copydefault(abstractC58260yxtValueOf);
        return abstractC58260yxtValueOf;
    }

    public static final kotlin.Pair AuCTelauCTel(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (kotlin.Pair) function1.invoke(obj);
    }

    public final DappBtcUtxoFeeReq getNewProxyInstance() {
        java.lang.String signStr;
        java.util.List<java.lang.String> listEZpvd;
        if (wlaJM()) {
            BTCDappSignData bTCDappSignData = this.AkhnZx;
            signStr = bTCDappSignData != null ? bTCDappSignData.getPsbtHex() : null;
            listEZpvd = C56402yEa.EZpvd(signStr != null ? signStr : "");
        } else if (zsXlph()) {
            BTCDappSignData bTCDappSignData2 = this.AkhnZx;
            if (bTCDappSignData2 == null || (listEZpvd = bTCDappSignData2.getPsbtHexs()) == null) {
                listEZpvd = yDY.AhwBna();
            }
        } else {
            BTCDappSignData bTCDappSignData3 = this.AkhnZx;
            signStr = bTCDappSignData3 != null ? bTCDappSignData3.getSignStr() : null;
            listEZpvd = C56402yEa.EZpvd(signStr != null ? signStr : "");
        }
        java.util.List<PsbtDecodeNewItem> listCopydefault = C54904xZq.copydefault.copydefault(listEZpvd);
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listCopydefault, 10));
        for (PsbtDecodeNewItem psbtDecodeNewItem : listCopydefault) {
            java.util.List<PsbtDecodeInputItem> input = psbtDecodeNewItem.getInput();
            java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(input, 10));
            for (PsbtDecodeInputItem psbtDecodeInputItem : input) {
                arrayList2.add(new InputBean(psbtDecodeInputItem.getTxId(), psbtDecodeInputItem.getVOut()));
            }
            java.util.List<PsbtDecodeOutputItem> output = psbtDecodeNewItem.getOutput();
            java.util.ArrayList arrayList3 = new java.util.ArrayList(C56403yEb.AYXKKw(output, 10));
            for (PsbtDecodeOutputItem psbtDecodeOutputItem : output) {
                arrayList3.add(new OutputBean(psbtDecodeOutputItem.getAmount(), psbtDecodeOutputItem.getVOut()));
            }
            arrayList.add(new InputAndOutput(arrayList2, arrayList3));
        }
        return new DappBtcUtxoFeeReq((java.lang.String) null, (java.util.List) null, 0L, arrayList, 3, (DefaultConstructorMarker) null);
    }

    public final Triple<java.lang.Boolean, java.lang.Boolean, java.lang.String> hDKMBd() {
        Triple<java.lang.Boolean, java.lang.Boolean, java.lang.String> triple = this.isConnected;
        if (triple != null) {
            return triple;
        }
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        return new Triple<>(bool, bool, "");
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v6, resolved type: java.lang.String */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0035, code lost:
    
        if (r1 == null) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0037, code lost:
    
        return "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x003b, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x000f, code lost:
    
        if (r1 == null) goto L19;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractC10828bvn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.String fetchVPNInfo() {
        java.lang.Object signStr;
        if (wlaJM()) {
            BTCDappSignData bTCDappSignData = this.AkhnZx;
            signStr = bTCDappSignData != null ? bTCDappSignData.getPsbtHex() : null;
        } else {
            if (zsXlph()) {
                Gson gson = new Gson();
                BTCDappSignData bTCDappSignData2 = this.AkhnZx;
                java.lang.String json = gson.toJson(bTCDappSignData2 != null ? bTCDappSignData2.getPsbtHexs() : null);
                Intrinsics.copydefault((java.lang.Object) json);
                return json;
            }
            BTCDappSignData bTCDappSignData3 = this.AkhnZx;
            signStr = bTCDappSignData3 != null ? bTCDappSignData3.getSignStr() : null;
        }
    }

    @Override // o.AbstractC10828bvn
    public ChainAddress isConnected() {
        BTCDappSignData bTCDappSignData;
        java.lang.String from;
        C10854bwM c10854bwMGEmmrt = gEmmrt();
        if (c10854bwMGEmmrt == null || (bTCDappSignData = this.AkhnZx) == null || (from = bTCDappSignData.getFrom()) == null) {
            return null;
        }
        return this.values.OLrzqt(fJNWhG(), c10854bwMGEmmrt, from);
    }

    public final AbstractC58260yxt<kotlin.Pair<java.lang.Boolean, java.lang.String>> getFieldNames() {
        java.lang.Integer source = DbNXlk().getSource();
        if (source != null && source.intValue() == 2 && (wlaJM() || zsXlph())) {
            AbstractC58185ywX<ResponseData<DAppBTCSignPrompt>> abstractC58185ywXValueOf = new C13934dbu().valueOf();
            final Function1 function1 = new Function1() { // from class: o.bwc
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C10806bvR.KWHzl(this.OLrzqt, (ResponseData) obj);
                }
            };
            AbstractC58260yxt<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58260yxtValueOf = abstractC58185ywXValueOf.AEQbTJ(new InterfaceC58229yxO() { // from class: o.bwa
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58229yxO
                public final java.lang.Object apply(java.lang.Object obj) {
                    return C10806bvR.zLjUOn(function1, obj);
                }
            }).valueOf();
            Intrinsics.checkNotNullExpressionValue(abstractC58260yxtValueOf, "");
            return abstractC58260yxtValueOf;
        }
        AbstractC58260yxt<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58260yxtCopydefault = AbstractC58260yxt.copydefault(C56390yDp.OLrzqt(java.lang.Boolean.TRUE, ""));
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtCopydefault, "");
        return abstractC58260yxtCopydefault;
    }

    public static final kotlin.Pair zLjUOn(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (kotlin.Pair) function1.invoke(obj);
    }

    public static final kotlin.Pair KWHzl(C10806bvR c10806bvR, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        DAppBTCSignPrompt dAppBTCSignPrompt = (DAppBTCSignPrompt) responseData.getData();
        c10806bvR.djBIcL = dAppBTCSignPrompt != null ? dAppBTCSignPrompt.getAssetReminder() : null;
        return C56390yDp.OLrzqt(java.lang.Boolean.TRUE, "");
    }

    @Override // o.AbstractC10828bvn
    public AbstractC58185ywX<ResponseData<java.lang.String>> EZpvd(@NotNull java.lang.String str) {
        AbstractC58185ywX<ResponseData<java.lang.String>> abstractC58185ywXKWHzl;
        java.lang.String strOLrzqt = "";
        Intrinsics.checkNotNullParameter(str, "");
        if (!AuCTelauCTel()) {
            AbstractC58185ywX<ResponseData<java.lang.String>> abstractC58185ywXKWHzl2 = AbstractC58185ywX.KWHzl(new ResponseData(-5006, null, null, null, null, null, 62, null));
            Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl2, "");
            return abstractC58185ywXKWHzl2;
        }
        try {
            java.lang.String strFetchVPNInfo = fetchVPNInfo();
            if (wlaJM()) {
                strFetchVPNInfo = DbNXlk().getData();
                if (C33490mxT.OLrzqt(strFetchVPNInfo) != null) {
                    C54904xZq c54904xZq = C54904xZq.copydefault;
                    JsonObject jsonObjectOLrzqt = C33490mxT.OLrzqt(strFetchVPNInfo);
                    Intrinsics.copydefault(jsonObjectOLrzqt);
                    strOLrzqt = c54904xZq.OLrzqt(str, jsonObjectOLrzqt);
                }
            } else if (zsXlph()) {
                strFetchVPNInfo = DbNXlk().getData();
                if (C33490mxT.OLrzqt(strFetchVPNInfo) != null) {
                    C54904xZq c54904xZq2 = C54904xZq.copydefault;
                    JsonObject jsonObjectOLrzqt2 = C33490mxT.OLrzqt(strFetchVPNInfo);
                    Intrinsics.copydefault(jsonObjectOLrzqt2);
                    strOLrzqt = c54904xZq2.EZpvd(str, jsonObjectOLrzqt2);
                }
            } else {
                C54904xZq c54904xZq3 = C54904xZq.copydefault;
                java.lang.String strAhwBna = AhwBna();
                BTCDappSignData bTCDappSignData = this.AkhnZx;
                java.lang.String type = bTCDappSignData != null ? bTCDappSignData.getType() : null;
                if (type != null) {
                    strOLrzqt = type;
                }
                strOLrzqt = c54904xZq3.OLrzqt(str, strAhwBna, strFetchVPNInfo, strOLrzqt);
            }
            java.lang.String str2 = strOLrzqt;
            if (strFetchVPNInfo.length() > 0 && str2.length() > 0) {
                abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(new ResponseData(-5001, null, null, null, str2, null, 46, null));
            } else {
                abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(new ResponseData(-5000, null, null, null, null, null, 62, null));
            }
            Intrinsics.copydefault(abstractC58185ywXKWHzl);
            return abstractC58185ywXKWHzl;
        } catch (java.lang.Exception e) {
            C43296rmc.copydefault("BTCDappSignInteraction", "BTC sign failed", e);
            AbstractC58185ywX<ResponseData<java.lang.String>> abstractC58185ywXKWHzl3 = AbstractC58185ywX.KWHzl(new ResponseData(-5000, null, null, null, null, null, 62, null));
            Intrinsics.copydefault(abstractC58185ywXKWHzl3);
            return abstractC58185ywXKWHzl3;
        }
    }

    @Override // o.AbstractC10828bvn
    public AbstractC58260yxt<java.lang.String> KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        ChainAddress chainAddressIsConnected = isConnected();
        if (chainAddressIsConnected != null) {
            return fJNWhG().OLrzqt(str, chainAddressIsConnected.getCoinId(), chainAddressIsConnected.getAddressType());
        }
        AbstractC58260yxt<java.lang.String> abstractC58260yxtCopydefault = AbstractC58260yxt.copydefault("");
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtCopydefault, "");
        return abstractC58260yxtCopydefault;
    }

    public final boolean wlaJM() {
        return Intrinsics.EZpvd((java.lang.Object) DbNXlk().getMethod(), (java.lang.Object) "btc_psbt");
    }

    public final boolean zsXlph() {
        return Intrinsics.EZpvd((java.lang.Object) DbNXlk().getMethod(), (java.lang.Object) "btc_psbts");
    }

    public final boolean AubY() {
        return Intrinsics.EZpvd((java.lang.Object) DbNXlk().getMethod(), (java.lang.Object) "btc_message");
    }

    public final boolean AuCTelauCTel() {
        return wlaJM() || zsXlph() || AubY();
    }

    @Override // o.AbstractC10828bvn
    public AbstractC58185ywX<ResponseData<java.lang.String>> copydefault(java.lang.String str) {
        AbstractC58185ywX<ResponseData<java.lang.String>> abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(new ResponseData(73819761, null, null, null, null, null, 62, null));
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        return abstractC58185ywXKWHzl;
    }

    @Override // o.AbstractC10828bvn
    public AbstractC58185ywX<ResponseData<java.lang.String>> OLrzqt(@NotNull final java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (!AuCTelauCTel()) {
            AbstractC58185ywX<ResponseData<java.lang.String>> abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(new ResponseData(-5006, null, null, null, null, null, 62, null));
            Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
            return abstractC58185ywXKWHzl;
        }
        final C10854bwM c10854bwMGEmmrt = gEmmrt();
        if (c10854bwMGEmmrt == null) {
            AbstractC58185ywX<ResponseData<java.lang.String>> abstractC58185ywXKWHzl2 = AbstractC58185ywX.KWHzl(new ResponseData(-5000, null, null, null, null, null, 62, null));
            Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl2, "");
            return abstractC58185ywXKWHzl2;
        }
        AbstractC58185ywX<java.lang.String> abstractC58185ywXEZpvd = C11010bzJ.ActionBar.getInstance$default(C11010bzJ.Companion, null, 1, null).AhwBna(str).EZpvd();
        final Function1 function1 = new Function1() { // from class: o.bvX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C10806bvR.KWHzl(str, this, c10854bwMGEmmrt, (java.lang.String) obj);
            }
        };
        AbstractC58185ywX<R> abstractC58185ywXKWHzl3 = abstractC58185ywXEZpvd.KWHzl(new InterfaceC58229yxO() { // from class: o.bvT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C10806bvR.zuBGHE(function1, obj);
            }
        });
        final Function1 function12 = new Function1() { // from class: o.bvV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C10806bvR.OLrzqt((java.lang.Throwable) obj);
            }
        };
        AbstractC58185ywX<ResponseData<java.lang.String>> abstractC58185ywXDjBIcL = abstractC58185ywXKWHzl3.djBIcL(new InterfaceC58229yxO() { // from class: o.bvW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C10806bvR.AxsJAY(function12, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXDjBIcL, "");
        return abstractC58185ywXDjBIcL;
    }

    public static final InterfaceC60096zvd zuBGHE(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public static final InterfaceC60096zvd KWHzl(java.lang.String str, C10806bvR c10806bvR, C10854bwM c10854bwM, java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str2, "");
        MpcWalletEncodeInfo mpcWalletEncodeInfoQSBOWP = c10806bvR.fJNWhG().QSBOWP();
        Intrinsics.copydefault(mpcWalletEncodeInfoQSBOWP);
        MpcWalletDecodeInfo mpcWalletDecodeInfoOLrzqt = C10964byQ.OLrzqt(str, str2, mpcWalletEncodeInfoQSBOWP);
        if (c10806bvR.wlaJM()) {
            BTCDappSignData bTCDappSignData = c10806bvR.AkhnZx;
            return c10806bvR.copydefault(bTCDappSignData != null ? bTCDappSignData.getPsbtHex() : null, c10854bwM, mpcWalletDecodeInfoOLrzqt);
        }
        if (c10806bvR.zsXlph()) {
            BTCDappSignData bTCDappSignData2 = c10806bvR.AkhnZx;
            return c10806bvR.OLrzqt(bTCDappSignData2 != null ? bTCDappSignData2.getPsbtHexs() : null, c10854bwM, mpcWalletDecodeInfoOLrzqt);
        }
        BTCDappSignData bTCDappSignData3 = c10806bvR.AkhnZx;
        return c10806bvR.EZpvd(bTCDappSignData3 != null ? bTCDappSignData3.getSignStr() : null, c10854bwM, mpcWalletDecodeInfoOLrzqt);
    }

    public static final ResponseData AxsJAY(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (ResponseData) function1.invoke(obj);
    }

    public static final ResponseData OLrzqt(java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        C43296rmc.copydefault("BTCDappSignInteraction", "BTC sign failed", th);
        return new ResponseData(-5000, null, null, null, null, null, 62, null);
    }

    public final AbstractC58185ywX<ResponseData<java.lang.String>> copydefault(java.lang.String str, C10854bwM c10854bwM, MpcWalletDecodeInfo mpcWalletDecodeInfo) {
        java.util.List<java.lang.String> signHashList;
        if (str == null || str.length() == 0) {
            AbstractC58185ywX<ResponseData<java.lang.String>> abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(new ResponseData(-5000, null, null, null, null, null, 62, null));
            Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
            return abstractC58185ywXKWHzl;
        }
        ChainAddress chainAddressIsConnected = isConnected();
        java.lang.String publicKey = chainAddressIsConnected != null ? chainAddressIsConnected.getPublicKey() : null;
        final MPCRawPsbtTx mPCRawPsbtTx = new MPCRawPsbtTx(str, publicKey == null ? "" : publicKey, (java.util.List) null, 4, (DefaultConstructorMarker) null);
        MPCBRC20PsbtResult mPCBRC20PsbtResultCopydefault = C54904xZq.copydefault.copydefault(mPCRawPsbtTx);
        if (mPCBRC20PsbtResultCopydefault == null || (signHashList = mPCBRC20PsbtResultCopydefault.getSignHashList()) == null || signHashList.isEmpty()) {
            AbstractC58185ywX<ResponseData<java.lang.String>> abstractC58185ywXKWHzl2 = AbstractC58185ywX.KWHzl(new ResponseData(-5005, null, null, null, null, null, 62, null));
            Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl2, "");
            return abstractC58185ywXKWHzl2;
        }
        KSerializer kSerializerListSerializer = BuiltinSerializersKt.ListSerializer(BuiltinSerializersKt.serializer(C56529yIt.KWHzl));
        java.util.List<java.lang.String> signHashList2 = mPCBRC20PsbtResultCopydefault.getSignHashList();
        if (signHashList2 == null) {
            signHashList2 = yDY.AhwBna();
        }
        AbstractC58185ywX abstractC58185ywXUnwrapResponseData$default = C43423rox.unwrapResponseData$default(C10965byR.OLrzqt.copydefault(C54907xZt.encodeToString$default(kSerializerListSerializer, signHashList2, false, 2, null), c10854bwM, mpcWalletDecodeInfo, fJNWhG().finit()), (Function1) null, 1, (java.lang.Object) null);
        final Function1 function1 = new Function1() { // from class: o.bvO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C10806bvR.copydefault(mPCRawPsbtTx, this, (java.lang.String) obj);
            }
        };
        AbstractC58185ywX<ResponseData<java.lang.String>> abstractC58185ywXOLrzqt = abstractC58185ywXUnwrapResponseData$default.AEQbTJ(new InterfaceC58229yxO() { // from class: o.bvQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C10806bvR.gHZMYf(function1, obj);
            }
        }).OLrzqt((InterfaceC60096zvd) AbstractC58185ywX.KWHzl(new ResponseData(-5005, null, null, null, null, null, 62, null)));
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXOLrzqt, "");
        return abstractC58185ywXOLrzqt;
    }

    public static final ResponseData gHZMYf(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (ResponseData) function1.invoke(obj);
    }

    public static final ResponseData copydefault(MPCRawPsbtTx mPCRawPsbtTx, C10806bvR c10806bvR, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        java.lang.Iterable iterable = (java.lang.Iterable) C54907xZt.OLrzqt(BuiltinSerializersKt.ListSerializer(RSV.Companion.serializer()), str);
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(iterable, 10));
        java.util.Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(c10806bvR.values.KWHzl((RSV) it.next()));
        }
        if (arrayList.isEmpty()) {
            return new ResponseData(-5005, null, null, null, null, null, 62, null);
        }
        MPCBRC20PsbtResult mPCBRC20PsbtResultKWHzl = C54904xZq.copydefault.KWHzl(MPCRawPsbtTx.copy$default(mPCRawPsbtTx, null, null, arrayList, 3, null));
        java.lang.String psbtTx = mPCBRC20PsbtResultKWHzl != null ? mPCBRC20PsbtResultKWHzl.getPsbtTx() : null;
        if (psbtTx == null || psbtTx.length() == 0) {
            return new ResponseData(-5005, null, null, null, null, null, 62, null);
        }
        return new ResponseData(-5001, null, null, null, mPCBRC20PsbtResultKWHzl != null ? mPCBRC20PsbtResultKWHzl.getPsbtTx() : null, null, 46, null);
    }

    public final AbstractC58185ywX<ResponseData<java.lang.String>> OLrzqt(final java.util.List<java.lang.String> list, C10854bwM c10854bwM, MpcWalletDecodeInfo mpcWalletDecodeInfo) {
        if (list == null || list.isEmpty()) {
            AbstractC58185ywX<ResponseData<java.lang.String>> abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(new ResponseData(-5000, null, null, null, null, null, 62, null));
            Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
            return abstractC58185ywXKWHzl;
        }
        final java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(copydefault((java.lang.String) it.next(), c10854bwM, mpcWalletDecodeInfo));
        }
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        AbstractC58185ywX<ResponseData<java.lang.String>> abstractC58185ywXCopydefault = AbstractC58185ywX.KWHzl(new InterfaceC58187ywZ() { // from class: o.bvU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58187ywZ
            public final void subscribe(InterfaceC58184ywW interfaceC58184ywW) {
                C10806bvR.KWHzl(objectRef, arrayList, list, interfaceC58184ywW);
            }
        }, BackpressureStrategy.BUFFER).copydefault(new InterfaceC58222yxH() { // from class: o.bwb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58222yxH
            public final void run() {
                C10806bvR.copydefault(objectRef);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXCopydefault, "");
        return abstractC58185ywXCopydefault;
    }

    /* JADX WARN: Type inference failed for: r9v1, types: [T, o.yxC] */
    public static final void KWHzl(Ref.ObjectRef objectRef, java.util.List list, final java.util.List list2, final InterfaceC58184ywW interfaceC58184ywW) {
        Intrinsics.checkNotNullParameter(interfaceC58184ywW, "");
        final java.util.ArrayList arrayList = new java.util.ArrayList();
        AbstractC58185ywX abstractC58185ywXAEQbTJ = AbstractC58185ywX.AEQbTJ((java.lang.Iterable) list);
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        objectRef.element = yBI.subscribeBy$default(abstractC58185ywXAEQbTJ, new Function1() { // from class: o.bvZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C10806bvR.AEQbTJ(interfaceC58184ywW, (java.lang.Throwable) obj);
            }
        }, (Function0) null, new Function1() { // from class: o.bvY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C10806bvR.AEQbTJ(interfaceC58184ywW, arrayList, list2, (ResponseData) obj);
            }
        }, 2, (java.lang.Object) null);
    }

    public static final Unit AEQbTJ(InterfaceC58184ywW interfaceC58184ywW, java.util.ArrayList arrayList, java.util.List list, ResponseData responseData) {
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

    public static final Unit AEQbTJ(InterfaceC58184ywW interfaceC58184ywW, java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        interfaceC58184ywW.onError(th);
        interfaceC58184ywW.onComplete();
        return Unit.INSTANCE;
    }

    public static final void copydefault(Ref.ObjectRef objectRef) {
        InterfaceC58217yxC interfaceC58217yxC = (InterfaceC58217yxC) objectRef.element;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
    }

    public final AbstractC58185ywX<ResponseData<java.lang.String>> EZpvd(java.lang.String str, C10854bwM c10854bwM, MpcWalletDecodeInfo mpcWalletDecodeInfo) {
        java.util.List<java.lang.String> signHashList;
        if (str == null || str.length() == 0) {
            AbstractC58185ywX<ResponseData<java.lang.String>> abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(new ResponseData(-5000, null, null, null, null, null, 62, null));
            Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
            return abstractC58185ywXKWHzl;
        }
        ChainAddress chainAddressIsConnected = isConnected();
        BTCDappSignData bTCDappSignData = this.AkhnZx;
        java.lang.String type = bTCDappSignData != null ? bTCDappSignData.getType() : null;
        java.lang.String str2 = type == null ? "" : type;
        java.lang.String address = chainAddressIsConnected != null ? chainAddressIsConnected.getAddress() : null;
        java.lang.String str3 = address == null ? "" : address;
        java.lang.String publicKey = chainAddressIsConnected != null ? chainAddressIsConnected.getPublicKey() : null;
        final MPCBtcMessage mPCBtcMessage = new MPCBtcMessage(str, str2, str3, publicKey == null ? "" : publicKey, (java.util.List) null, 16, (DefaultConstructorMarker) null);
        MPCBRC20PsbtResult mPCBRC20PsbtResultKWHzl = C54904xZq.copydefault.KWHzl(mPCBtcMessage);
        if (mPCBRC20PsbtResultKWHzl == null || (signHashList = mPCBRC20PsbtResultKWHzl.getSignHashList()) == null || signHashList.isEmpty()) {
            AbstractC58185ywX<ResponseData<java.lang.String>> abstractC58185ywXKWHzl2 = AbstractC58185ywX.KWHzl(new ResponseData(-5005, null, null, null, null, null, 62, null));
            Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl2, "");
            return abstractC58185ywXKWHzl2;
        }
        KSerializer kSerializerListSerializer = BuiltinSerializersKt.ListSerializer(BuiltinSerializersKt.serializer(C56529yIt.KWHzl));
        java.util.List<java.lang.String> signHashList2 = mPCBRC20PsbtResultKWHzl.getSignHashList();
        if (signHashList2 == null) {
            signHashList2 = yDY.AhwBna();
        }
        AbstractC58185ywX abstractC58185ywXUnwrapResponseData$default = C43423rox.unwrapResponseData$default(C10965byR.OLrzqt.copydefault(C54907xZt.encodeToString$default(kSerializerListSerializer, signHashList2, false, 2, null), c10854bwM, mpcWalletDecodeInfo, fJNWhG().finit()), (Function1) null, 1, (java.lang.Object) null);
        final Function1 function1 = new Function1() { // from class: o.bwf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C10806bvR.copydefault(mPCBtcMessage, this, (java.lang.String) obj);
            }
        };
        AbstractC58185ywX<ResponseData<java.lang.String>> abstractC58185ywXOLrzqt = abstractC58185ywXUnwrapResponseData$default.AEQbTJ(new InterfaceC58229yxO() { // from class: o.bwi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C10806bvR.sSMYrx(function1, obj);
            }
        }).OLrzqt((InterfaceC60096zvd) AbstractC58185ywX.KWHzl(new ResponseData(-5005, null, null, null, null, null, 62, null)));
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXOLrzqt, "");
        return abstractC58185ywXOLrzqt;
    }

    public static final ResponseData sSMYrx(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (ResponseData) function1.invoke(obj);
    }

    public static final ResponseData copydefault(MPCBtcMessage mPCBtcMessage, C10806bvR c10806bvR, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        java.lang.Iterable iterable = (java.lang.Iterable) C54907xZt.OLrzqt(BuiltinSerializersKt.ListSerializer(RSV.Companion.serializer()), str);
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(iterable, 10));
        java.util.Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(c10806bvR.values.KWHzl((RSV) it.next()));
        }
        if (arrayList.isEmpty()) {
            return new ResponseData(-5005, null, null, null, null, null, 62, null);
        }
        MPCBRC20PsbtResult mPCBRC20PsbtResultCopydefault = C54904xZq.copydefault.copydefault(MPCBtcMessage.copy$default(mPCBtcMessage, null, null, null, null, arrayList, 15, null));
        java.lang.String psbtTx = mPCBRC20PsbtResultCopydefault != null ? mPCBRC20PsbtResultCopydefault.getPsbtTx() : null;
        if (psbtTx == null || psbtTx.length() == 0) {
            return new ResponseData(-5005, null, null, null, null, null, 62, null);
        }
        return new ResponseData(-5001, null, null, null, mPCBRC20PsbtResultCopydefault != null ? mPCBRC20PsbtResultCopydefault.getPsbtTx() : null, null, 46, null);
    }

    public static final kotlin.Pair EZpvd(C10806bvR c10806bvR, ResponseData responseData) {
        Triple<java.lang.Boolean, java.lang.Boolean, java.lang.String> triple;
        java.lang.Boolean boolIsShowFee;
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            java.lang.Boolean bool = java.lang.Boolean.FALSE;
            DappBTCUTXOResp dappBTCUTXOResp = (DappBTCUTXOResp) responseData.getData();
            boolean zBooleanValue = (dappBTCUTXOResp == null || (boolIsShowFee = dappBTCUTXOResp.isShowFee()) == null) ? false : boolIsShowFee.booleanValue();
            DappBTCUTXOResp dappBTCUTXOResp2 = (DappBTCUTXOResp) responseData.getData();
            triple = new Triple<>(bool, java.lang.Boolean.valueOf(zBooleanValue), C33129mqd.gEmmrt(dappBTCUTXOResp2 != null ? dappBTCUTXOResp2.getGasFee() : null));
        } else {
            java.lang.Boolean bool2 = java.lang.Boolean.TRUE;
            DappBTCUTXOResp dappBTCUTXOResp3 = (DappBTCUTXOResp) responseData.getData();
            triple = new Triple<>(bool2, bool2, C33129mqd.gEmmrt(dappBTCUTXOResp3 != null ? dappBTCUTXOResp3.getGasFee() : null));
        }
        c10806bvR.isConnected = triple;
        return C56390yDp.OLrzqt(java.lang.Boolean.TRUE, "");
    }
}
