package o;

import androidx.core.os.BundleKt;
import com.google.gson.Gson;
import com.okinc.liveness.lca.EopTrackEvent;
import com.okinc.mln_ui.ui.okkit.UDGoPageBridge;
import com.okinc.nft.nftmarket.NFTBridge;
import com.okinc.nft.push.PayLoad;
import com.okinc.nft.push.TokenAsset;
import com.okinc.nft.push.chainstatus.TxInfoBean;
import com.okinc.p2p.api.OtcExtraKeys;
import com.okinc.web.WebActivity;
import com.reown.foundation.util.jwt.JwtUtilsKt;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentSkipListSet;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import o.C43471rps;
import o.InterfaceC54829xWw;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: o.rqL, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C43491rqL {
    public static final C43491rqL OLrzqt = new C43491rqL();
    public static android.os.Handler AEQbTJ = new android.os.Handler(android.os.Looper.getMainLooper());
    public static ConcurrentSkipListSet<java.lang.String> KWHzl = new ConcurrentSkipListSet<>();
    public static C43524rqs copydefault = new C43524rqs();
    public static final int EZpvd = 8;

    private C43491rqL() {
    }

    public final void EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        pUU.EZpvd("NFTChainStatusMessageHandler", str);
        JSONObject jSONObject = new JSONObject(str);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("speedTxHash");
        if (jSONArrayOptJSONArray != null) {
            int length = jSONArrayOptJSONArray.length();
            for (int i = 0; i < length; i++) {
                arrayList.add(jSONArrayOptJSONArray.getString(i));
            }
        }
        try {
            java.lang.String strOptString = jSONObject.optString("txHash");
            Intrinsics.checkNotNullExpressionValue(strOptString, "");
            java.lang.String strOptString2 = jSONObject.optString("userWalletAddress");
            Intrinsics.checkNotNullExpressionValue(strOptString2, "");
            int iOptInt = jSONObject.optInt("scene");
            long jOptLong = jSONObject.optLong("chain");
            int iOptInt2 = jSONObject.optInt("status");
            java.lang.String strOptString3 = jSONObject.optString("urlPre");
            Intrinsics.checkNotNullExpressionValue(strOptString3, "");
            java.lang.String strOptString4 = jSONObject.optString("payload");
            Intrinsics.checkNotNullExpressionValue(strOptString4, "");
            java.lang.String strOptString5 = jSONObject.optString("uopHash");
            Intrinsics.checkNotNullExpressionValue(strOptString5, "");
            TokenAsset tokenAsset = new TokenAsset(strOptString, strOptString2, iOptInt, jOptLong, iOptInt2, strOptString3, strOptString4, arrayList, "", "", strOptString5);
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("batchTxState");
            if (jSONObjectOptJSONObject != null) {
                tokenAsset.setBatchTxState(jSONObjectOptJSONObject.toString());
            } else {
                java.lang.String strOptString6 = jSONObject.optString("batchTxState");
                if (!android.text.TextUtils.isEmpty(strOptString6)) {
                    tokenAsset.setBatchTxState(strOptString6);
                }
            }
            JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("batchTransferInfo");
            if (jSONObjectOptJSONObject2 != null) {
                tokenAsset.setBatchTransferInfo(jSONObjectOptJSONObject2.toString());
            } else {
                java.lang.String strOptString7 = jSONObject.optString("batchTransferInfo");
                if (!android.text.TextUtils.isEmpty(strOptString7)) {
                    tokenAsset.setBatchTransferInfo(strOptString7);
                }
            }
            if (!android.text.TextUtils.isEmpty(tokenAsset.getPayload())) {
                AYXKKw(tokenAsset, (PayLoad) new Gson().fromJson(tokenAsset.getPayload(), PayLoad.class));
            } else {
                AYXKKw(tokenAsset, (PayLoad) null);
            }
        } catch (java.lang.Exception e) {
            C43296rmc.KWHzl("logtag", "parsetokenfailed", e);
        }
    }

    public final void AYXKKw(@NotNull final TokenAsset tokenAsset, final PayLoad payLoad) {
        Intrinsics.checkNotNullParameter(tokenAsset, "");
        if (tokenAsset.getStatus() == 3) {
            AEQbTJ.postDelayed(new java.lang.Runnable() { // from class: o.rrK
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    C43491rqL.OLrzqt(tokenAsset, payLoad);
                }
            }, 3000L);
        } else {
            gEmmrt(tokenAsset, payLoad);
        }
    }

    public static final void OLrzqt(TokenAsset tokenAsset, PayLoad payLoad) {
        OLrzqt.gEmmrt(tokenAsset, payLoad);
    }

    public final void gEmmrt(@NotNull final TokenAsset tokenAsset, final PayLoad payLoad) {
        Unit unit;
        Unit unit2;
        Intrinsics.checkNotNullParameter(tokenAsset, "");
        java.lang.String str = tokenAsset.getTxHash() + ":" + tokenAsset.getScene() + ":" + tokenAsset.getStatus();
        if (KWHzl.contains(str)) {
            return;
        }
        KWHzl.add(str);
        C43296rmc.AEQbTJ("logtag", "hanndle asset" + tokenAsset.getScene() + "," + tokenAsset.getStatus() + "," + tokenAsset.getBatchTxState());
        try {
            Result.Application application = Result.Companion;
            InterfaceC7298ahG interfaceC7298ahGKWHzl = C7323ahf.KWHzl();
            if (interfaceC7298ahGKWHzl != null) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("status", java.lang.Integer.valueOf(tokenAsset.getStatus()));
                linkedHashMap.put("scene", java.lang.Integer.valueOf(tokenAsset.getScene()));
                linkedHashMap.put("txHash", tokenAsset.getTxHash());
                linkedHashMap.put("chain", java.lang.Long.valueOf(tokenAsset.getChain()));
                unit2 = Unit.INSTANCE;
                interfaceC7298ahGKWHzl.AEQbTJ("eventPushNotifyNftPersonalPage", null, linkedHashMap);
            } else {
                unit2 = null;
            }
            Result.m7377constructorimpl(unit2);
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        AEQbTJ.postDelayed(new java.lang.Runnable() { // from class: o.rqO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C43491rqL.gwTjWJ(tokenAsset);
            }
        }, 500L);
        if (((!Intrinsics.EZpvd((java.lang.Object) NFTBridge.txHash, (java.lang.Object) tokenAsset.getTxHash()) && !Intrinsics.EZpvd((java.lang.Object) NFTBridge.txHash, (java.lang.Object) hBpjJd(tokenAsset)) && !Intrinsics.EZpvd((java.lang.Object) NFTBridge.txHash, (java.lang.Object) tokenAsset.getUopHash())) || !NFTBridge.isShowPending) && tokenAsset.getStatus() != 1 && C54819xWm.KWHzl().AEQbTJ() != null) {
            AEQbTJ.post(new java.lang.Runnable() { // from class: o.rqY
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    C43491rqL.KWHzl(tokenAsset, payLoad);
                }
            });
        }
        if ((tokenAsset.getStatus() == 2 || tokenAsset.getStatus() == 3 || tokenAsset.getStatus() == 5) && !android.text.TextUtils.isEmpty(tokenAsset.getTxHash())) {
            java.util.HashMap map = new java.util.HashMap();
            map.put(JwtUtilsKt.DID_METHOD_KEY, "granted");
            map.put("status", java.lang.Integer.valueOf(tokenAsset.getStatus()));
            map.put("scene", java.lang.Integer.valueOf(tokenAsset.getScene()));
            if (!tokenAsset.getSpeedTxHash().isEmpty()) {
                map.put("speedTxHash", tokenAsset.getSpeedTxHash());
            }
            java.lang.String txHash = tokenAsset.getTxHash();
            if (C33129mqd.OLrzqt((java.lang.CharSequence) tokenAsset.getUopHash())) {
                txHash = tokenAsset.getUopHash();
                map.put("uopHash", tokenAsset.getUopHash());
                map.put("txHash", tokenAsset.getTxHash());
            }
            if (!android.text.TextUtils.isEmpty(tokenAsset.getBatchTxState())) {
                txHash = new JSONObject(tokenAsset.getBatchTxState()).optString("batchId");
            }
            if (!android.text.TextUtils.isEmpty(tokenAsset.getPayload())) {
                try {
                    Result.Application application3 = Result.Companion;
                    java.lang.String strOptString = new JSONObject(tokenAsset.getPayload()).optString("orderId");
                    if (strOptString != null) {
                        map.put("orderId", strOptString);
                        unit = Unit.INSTANCE;
                    } else {
                        unit = null;
                    }
                    Result.m7377constructorimpl(unit);
                } catch (java.lang.Throwable th2) {
                    Result.Application application4 = Result.Companion;
                    Result.m7377constructorimpl(C56391yDq.EZpvd(th2));
                }
            }
            InterfaceC7298ahG interfaceC7298ahGKWHzl2 = C7323ahf.KWHzl();
            if (interfaceC7298ahGKWHzl2 != null) {
                interfaceC7298ahGKWHzl2.AEQbTJ(txHash, null, map);
            }
            if ((tokenAsset.getStatus() == 2 || tokenAsset.getStatus() == 5) && interfaceC7298ahGKWHzl2 != null) {
                interfaceC7298ahGKWHzl2.AEQbTJ("UpdateDetailEvent", null, null);
            }
        }
    }

    public static final void gwTjWJ(TokenAsset tokenAsset) {
        OLrzqt.RdAHlO(tokenAsset);
    }

    public static final void KWHzl(TokenAsset tokenAsset, PayLoad payLoad) {
        C55097xdX c55097xdXAEQbTJ = OLrzqt.AEQbTJ(tokenAsset, payLoad);
        if (c55097xdXAEQbTJ != null) {
            C57656ymY.showNotificationViewWithToast$default(C57656ymY.OLrzqt, c55097xdXAEQbTJ, 0L, 0, 0, 0, 30, null);
        }
    }

    public final java.lang.String hBpjJd(TokenAsset tokenAsset) {
        if (android.text.TextUtils.isEmpty(tokenAsset.getBatchTxState())) {
            return null;
        }
        return new JSONObject(tokenAsset.getBatchTxState()).optString("batchId");
    }

    /* JADX DEBUG: Multi-variable search result rejected for r10v10, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r10v7, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v100, types: [T, o.xdX] */
    /* JADX WARN: Type inference failed for: r10v105, types: [T, o.xdX] */
    /* JADX WARN: Type inference failed for: r10v109, types: [T, o.xdX] */
    /* JADX WARN: Type inference failed for: r10v110, types: [T, o.xdX] */
    /* JADX WARN: Type inference failed for: r10v111, types: [T, o.xdX] */
    /* JADX WARN: Type inference failed for: r10v115, types: [T, o.xdX] */
    /* JADX WARN: Type inference failed for: r10v116, types: [T, o.xdX] */
    /* JADX WARN: Type inference failed for: r10v117, types: [T, o.xdX] */
    /* JADX WARN: Type inference failed for: r10v121, types: [T, o.xdX] */
    /* JADX WARN: Type inference failed for: r10v122, types: [T, o.xdX] */
    /* JADX WARN: Type inference failed for: r10v123, types: [T, o.xdX] */
    /* JADX WARN: Type inference failed for: r10v127, types: [T, o.xdX] */
    /* JADX WARN: Type inference failed for: r10v128, types: [T, o.xdX] */
    /* JADX WARN: Type inference failed for: r10v129, types: [T, o.xdX] */
    /* JADX WARN: Type inference failed for: r10v133, types: [T, o.xdX] */
    /* JADX WARN: Type inference failed for: r10v134, types: [T, o.xdX] */
    /* JADX WARN: Type inference failed for: r10v135, types: [T, o.xdX] */
    /* JADX WARN: Type inference failed for: r10v15, types: [T, o.xdX] */
    /* JADX WARN: Type inference failed for: r10v16, types: [T, o.xdX] */
    /* JADX WARN: Type inference failed for: r10v17, types: [T, o.xdX] */
    /* JADX WARN: Type inference failed for: r10v21, types: [T, o.xdX] */
    /* JADX WARN: Type inference failed for: r10v22, types: [T, o.xdX] */
    /* JADX WARN: Type inference failed for: r10v23, types: [T, o.xdX] */
    /* JADX WARN: Type inference failed for: r10v27, types: [T, o.xdX] */
    /* JADX WARN: Type inference failed for: r10v28, types: [T, o.xdX] */
    /* JADX WARN: Type inference failed for: r10v29, types: [T, o.xdX] */
    /* JADX WARN: Type inference failed for: r10v33, types: [T, o.xdX] */
    /* JADX WARN: Type inference failed for: r10v34, types: [T, o.xdX] */
    /* JADX WARN: Type inference failed for: r10v35, types: [T, o.xdX] */
    /* JADX WARN: Type inference failed for: r10v39, types: [T, o.xdX] */
    /* JADX WARN: Type inference failed for: r10v4, types: [T, o.xdX] */
    /* JADX WARN: Type inference failed for: r10v40, types: [T, o.xdX] */
    /* JADX WARN: Type inference failed for: r10v41, types: [T, o.xdX] */
    /* JADX WARN: Type inference failed for: r10v45, types: [T, o.xdX] */
    /* JADX WARN: Type inference failed for: r10v46, types: [T, o.xdX] */
    /* JADX WARN: Type inference failed for: r10v47, types: [T, o.xdX] */
    /* JADX WARN: Type inference failed for: r10v5, types: [T, o.xdX] */
    /* JADX WARN: Type inference failed for: r10v51, types: [T, o.xdX] */
    /* JADX WARN: Type inference failed for: r10v52, types: [T, o.xdX] */
    /* JADX WARN: Type inference failed for: r10v53, types: [T, o.xdX] */
    /* JADX WARN: Type inference failed for: r10v57, types: [T, o.xdX] */
    /* JADX WARN: Type inference failed for: r10v58, types: [T, o.xdX] */
    /* JADX WARN: Type inference failed for: r10v59, types: [T, o.xdX] */
    /* JADX WARN: Type inference failed for: r10v6, types: [T, java.lang.Object, o.xdX] */
    /* JADX WARN: Type inference failed for: r10v63, types: [T, o.xdX] */
    /* JADX WARN: Type inference failed for: r10v64, types: [T, o.xdX] */
    /* JADX WARN: Type inference failed for: r10v65, types: [T, o.xdX] */
    /* JADX WARN: Type inference failed for: r10v69, types: [T, o.xdX] */
    /* JADX WARN: Type inference failed for: r10v70, types: [T, o.xdX] */
    /* JADX WARN: Type inference failed for: r10v71, types: [T, o.xdX] */
    /* JADX WARN: Type inference failed for: r10v75, types: [T, o.xdX] */
    /* JADX WARN: Type inference failed for: r10v76, types: [T, o.xdX] */
    /* JADX WARN: Type inference failed for: r10v77, types: [T, o.xdX] */
    /* JADX WARN: Type inference failed for: r10v78, types: [T, o.xdX] */
    /* JADX WARN: Type inference failed for: r10v82, types: [T, o.xdX] */
    /* JADX WARN: Type inference failed for: r10v83, types: [T, o.xdX] */
    /* JADX WARN: Type inference failed for: r10v84, types: [T, o.xdX] */
    /* JADX WARN: Type inference failed for: r10v88, types: [T, o.xdX] */
    /* JADX WARN: Type inference failed for: r10v89, types: [T, o.xdX] */
    /* JADX WARN: Type inference failed for: r10v9, types: [T, o.xdX] */
    /* JADX WARN: Type inference failed for: r10v90, types: [T, o.xdX] */
    /* JADX WARN: Type inference failed for: r10v94, types: [T, o.xdX] */
    /* JADX WARN: Type inference failed for: r10v95, types: [T, o.xdX] */
    /* JADX WARN: Type inference failed for: r10v96, types: [T, o.xdX] */
    /* JADX WARN: Type inference failed for: r11v155, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v161, types: [T, java.lang.String] */
    public final C55097xdX AEQbTJ(final TokenAsset tokenAsset, PayLoad payLoad) {
        JSONObject jSONObject;
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        int scene = tokenAsset.getScene();
        if (scene == 24) {
            jSONObject = android.text.TextUtils.isEmpty(tokenAsset.getBatchTransferInfo()) ? null : new JSONObject(tokenAsset.getBatchTransferInfo());
            int status = tokenAsset.getStatus();
            if (status == 1) {
                java.lang.String string = C43246rlf.OLrzqt.valueOf().getString(C43471rps.ActionBar.AuCTel);
                Intrinsics.checkNotNullExpressionValue(string, "");
                objectRef.element = AEQbTJ(string);
            } else if (status != 2) {
                if (status == 3) {
                    C43246rlf c43246rlf = C43246rlf.OLrzqt;
                    java.lang.String string2 = c43246rlf.valueOf().getString(C43471rps.ActionBar.QKudOq);
                    Intrinsics.checkNotNullExpressionValue(string2, "");
                    java.lang.String string3 = c43246rlf.valueOf().getString(C43471rps.ActionBar.getFieldNames);
                    Intrinsics.checkNotNullExpressionValue(string3, "");
                    objectRef.element = KWHzl(string2, string3, new Function0() { // from class: o.rrq
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return C43491rqL.ffGIBT(tokenAsset);
                        }
                    });
                }
            } else if (jSONObject != null) {
                if (jSONObject.optInt("successCount") < jSONObject.optInt("totalCount")) {
                    C43246rlf c43246rlf2 = C43246rlf.OLrzqt;
                    java.lang.String string4 = c43246rlf2.valueOf().getString(C43471rps.ActionBar.accept);
                    Intrinsics.checkNotNullExpressionValue(string4, "");
                    java.lang.String string5 = c43246rlf2.valueOf().getString(C43471rps.ActionBar.getFieldNames);
                    Intrinsics.checkNotNullExpressionValue(string5, "");
                    ?? AEQbTJ2 = AEQbTJ(string4, string5, new Function0() { // from class: o.rrt
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return C43491rqL.ODWQjV(tokenAsset);
                        }
                    });
                    objectRef.element = AEQbTJ2;
                    Intrinsics.copydefault((java.lang.Object) AEQbTJ2);
                    AEQbTJ2.setMessage(pTD.KWHzl(c43246rlf2.valueOf(), C43471rps.ActionBar.RlQdEF, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56424yEw.gEmmrt(C56390yDp.OLrzqt("successNum", java.lang.Integer.valueOf(jSONObject.optInt("successCount"))), C56390yDp.OLrzqt("failureNum", java.lang.Integer.valueOf(jSONObject.optInt("failedCount"))))));
                    T t = objectRef.element;
                    Intrinsics.copydefault(t);
                    ((C55097xdX) t).setState(5);
                } else {
                    C43246rlf c43246rlf3 = C43246rlf.OLrzqt;
                    java.lang.String string6 = c43246rlf3.valueOf().getString(C43471rps.ActionBar.giSNqX);
                    Intrinsics.checkNotNullExpressionValue(string6, "");
                    java.lang.String string7 = c43246rlf3.valueOf().getString(C43471rps.ActionBar.getFieldNames);
                    Intrinsics.checkNotNullExpressionValue(string7, "");
                    objectRef.element = AEQbTJ(string6, string7, new Function0() { // from class: o.rru
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return C43491rqL.OqFWZa(tokenAsset);
                        }
                    });
                }
            }
        } else if (scene == 27) {
            int status2 = tokenAsset.getStatus();
            if (status2 == 1) {
                java.lang.String string8 = C43246rlf.OLrzqt.valueOf().getString(C43471rps.ActionBar.AuCTel);
                Intrinsics.checkNotNullExpressionValue(string8, "");
                objectRef.element = AEQbTJ(string8);
            } else if (status2 == 2) {
                C43246rlf c43246rlf4 = C43246rlf.OLrzqt;
                java.lang.String string9 = c43246rlf4.valueOf().getString(C43471rps.ActionBar.AEQbTJ);
                Intrinsics.checkNotNullExpressionValue(string9, "");
                java.lang.String string10 = c43246rlf4.valueOf().getString(C43471rps.ActionBar.getFieldNames);
                Intrinsics.checkNotNullExpressionValue(string10, "");
                objectRef.element = AEQbTJ(string9, string10, new Function0() { // from class: o.rrA
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return C43491rqL.RcXXUw(tokenAsset);
                    }
                });
            } else if (status2 == 3) {
                C43246rlf c43246rlf5 = C43246rlf.OLrzqt;
                java.lang.String string11 = c43246rlf5.valueOf().getString(C43471rps.ActionBar.isConnected);
                Intrinsics.checkNotNullExpressionValue(string11, "");
                java.lang.String string12 = c43246rlf5.valueOf().getString(C43471rps.ActionBar.getFieldNames);
                Intrinsics.checkNotNullExpressionValue(string12, "");
                objectRef.element = KWHzl(string11, string12, new Function0() { // from class: o.rrE
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return C43491rqL.aKErDB(tokenAsset);
                    }
                });
            }
        } else if (scene == 28) {
            int status3 = tokenAsset.getStatus();
            if (status3 == 1) {
                java.lang.String string13 = C43246rlf.OLrzqt.valueOf().getString(C43471rps.ActionBar.copydefault);
                Intrinsics.checkNotNullExpressionValue(string13, "");
                objectRef.element = AEQbTJ(string13);
            } else if (status3 == 2) {
                C43246rlf c43246rlf6 = C43246rlf.OLrzqt;
                java.lang.String string14 = c43246rlf6.valueOf().getString(C43471rps.ActionBar.EZpvd);
                Intrinsics.checkNotNullExpressionValue(string14, "");
                java.lang.String string15 = c43246rlf6.valueOf().getString(C43471rps.ActionBar.getFieldNames);
                Intrinsics.checkNotNullExpressionValue(string15, "");
                objectRef.element = AEQbTJ(string14, string15, new Function0() { // from class: o.rrw
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return C43491rqL.getPostValueLengthLimit(tokenAsset);
                    }
                });
            } else if (status3 == 3) {
                C43246rlf c43246rlf7 = C43246rlf.OLrzqt;
                java.lang.String string16 = c43246rlf7.valueOf().getString(C43471rps.ActionBar.KWHzl);
                Intrinsics.checkNotNullExpressionValue(string16, "");
                java.lang.String string17 = c43246rlf7.valueOf().getString(C43471rps.ActionBar.getFieldNames);
                Intrinsics.checkNotNullExpressionValue(string17, "");
                objectRef.element = KWHzl(string16, string17, new Function0() { // from class: o.rrz
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return C43491rqL.zuWLRA(tokenAsset);
                    }
                });
            }
        } else if (scene == 33) {
            int status4 = tokenAsset.getStatus();
            if (status4 == 1) {
                java.lang.String string18 = C43246rlf.OLrzqt.valueOf().getString(C43471rps.ActionBar.AuCTel);
                Intrinsics.checkNotNullExpressionValue(string18, "");
                objectRef.element = AEQbTJ(string18);
            } else if (status4 == 2) {
                C43246rlf c43246rlf8 = C43246rlf.OLrzqt;
                java.lang.String string19 = c43246rlf8.valueOf().getString(C43471rps.ActionBar.fJNWhG);
                Intrinsics.checkNotNullExpressionValue(string19, "");
                java.lang.String string20 = c43246rlf8.valueOf().getString(C43471rps.ActionBar.getFieldNames);
                Intrinsics.checkNotNullExpressionValue(string20, "");
                objectRef.element = AEQbTJ(string19, string20, new Function0() { // from class: o.rry
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return C43491rqL.OuxcSI(tokenAsset);
                    }
                });
            } else if (status4 == 3) {
                C43246rlf c43246rlf9 = C43246rlf.OLrzqt;
                java.lang.String string21 = c43246rlf9.valueOf().getString(C43471rps.ActionBar.isConnected);
                Intrinsics.checkNotNullExpressionValue(string21, "");
                java.lang.String string22 = c43246rlf9.valueOf().getString(C43471rps.ActionBar.getFieldNames);
                Intrinsics.checkNotNullExpressionValue(string22, "");
                objectRef.element = KWHzl(string21, string22, new Function0() { // from class: o.rrx
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return C43491rqL.DCUTEI(tokenAsset);
                    }
                });
            }
        } else if (scene != 34) {
            switch (scene) {
                case 1:
                    int status5 = tokenAsset.getStatus();
                    if (status5 == 1) {
                        java.lang.String string23 = C43246rlf.OLrzqt.valueOf().getString(C43471rps.ActionBar.iwGUEr);
                        Intrinsics.checkNotNullExpressionValue(string23, "");
                        objectRef.element = AEQbTJ(string23);
                    } else if (status5 == 2) {
                        C43246rlf c43246rlf10 = C43246rlf.OLrzqt;
                        java.lang.String string24 = c43246rlf10.valueOf().getString(C43471rps.ActionBar.getNewProxyInstance);
                        Intrinsics.checkNotNullExpressionValue(string24, "");
                        java.lang.String string25 = c43246rlf10.valueOf().getString(C43471rps.ActionBar.AubY);
                        Intrinsics.checkNotNullExpressionValue(string25, "");
                        objectRef.element = AEQbTJ(string24, string25, new Function0() { // from class: o.rrs
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return C43491rqL.QSBOWP(tokenAsset);
                            }
                        });
                    } else if (status5 == 3) {
                        C43246rlf c43246rlf11 = C43246rlf.OLrzqt;
                        java.lang.String string26 = c43246rlf11.valueOf().getString(C43471rps.ActionBar.uzCIH);
                        Intrinsics.checkNotNullExpressionValue(string26, "");
                        java.lang.String string27 = c43246rlf11.valueOf().getString(C43471rps.ActionBar.fZBcTu);
                        Intrinsics.checkNotNullExpressionValue(string27, "");
                        objectRef.element = KWHzl(string26, string27, new Function0() { // from class: o.rqR
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return C43491rqL.QUSxYX(tokenAsset);
                            }
                        });
                    }
                    break;
                case 2:
                    int status6 = tokenAsset.getStatus();
                    if (status6 == 1) {
                        java.lang.String string28 = C43246rlf.OLrzqt.valueOf().getString(C43471rps.ActionBar.zsXlph);
                        Intrinsics.checkNotNullExpressionValue(string28, "");
                        objectRef.element = AEQbTJ(string28);
                    } else if (status6 == 2) {
                        C43246rlf c43246rlf12 = C43246rlf.OLrzqt;
                        java.lang.String string29 = c43246rlf12.valueOf().getString(C43471rps.ActionBar.AuCTelauCTel);
                        Intrinsics.checkNotNullExpressionValue(string29, "");
                        java.lang.String string30 = c43246rlf12.valueOf().getString(C43471rps.ActionBar.AubY);
                        Intrinsics.checkNotNullExpressionValue(string30, "");
                        objectRef.element = AEQbTJ(string29, string30, new Function0() { // from class: o.rre
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return C43491rqL.QVAiDq(tokenAsset);
                            }
                        });
                    } else if (status6 == 3) {
                        C43246rlf c43246rlf13 = C43246rlf.OLrzqt;
                        java.lang.String string31 = c43246rlf13.valueOf().getString(C43471rps.ActionBar.wlaJM);
                        Intrinsics.checkNotNullExpressionValue(string31, "");
                        java.lang.String string32 = c43246rlf13.valueOf().getString(C43471rps.ActionBar.fZBcTu);
                        Intrinsics.checkNotNullExpressionValue(string32, "");
                        objectRef.element = KWHzl(string31, string32, new Function0() { // from class: o.rrr
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return C43491rqL.UeEOUB(tokenAsset);
                            }
                        });
                    }
                    break;
                case 3:
                    int status7 = tokenAsset.getStatus();
                    if (status7 == 1) {
                        java.lang.String string33 = C43246rlf.OLrzqt.valueOf().getString(C43471rps.ActionBar.AYXKKw);
                        Intrinsics.checkNotNullExpressionValue(string33, "");
                        objectRef.element = AEQbTJ(string33);
                    } else if (status7 == 2) {
                        C43246rlf c43246rlf14 = C43246rlf.OLrzqt;
                        java.lang.String string34 = c43246rlf14.valueOf().getString(C43471rps.ActionBar.fetchVPNInfo);
                        Intrinsics.checkNotNullExpressionValue(string34, "");
                        java.lang.String string35 = c43246rlf14.valueOf().getString(C43471rps.ActionBar.fZBcTu);
                        Intrinsics.checkNotNullExpressionValue(string35, "");
                        objectRef.element = AEQbTJ(string34, string35, new Function0() { // from class: o.rrJ
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return C43491rqL.djSkpj(tokenAsset);
                            }
                        });
                    } else if (status7 == 3) {
                        C43246rlf c43246rlf15 = C43246rlf.OLrzqt;
                        java.lang.String string36 = c43246rlf15.valueOf().getString(C43471rps.ActionBar.gEmmrt);
                        Intrinsics.checkNotNullExpressionValue(string36, "");
                        java.lang.String string37 = c43246rlf15.valueOf().getString(C43471rps.ActionBar.fZBcTu);
                        Intrinsics.checkNotNullExpressionValue(string37, "");
                        objectRef.element = KWHzl(string36, string37, new Function0() { // from class: o.rrG
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return C43491rqL.dNCPSb(tokenAsset);
                            }
                        });
                    }
                    break;
                case 4:
                    int status8 = tokenAsset.getStatus();
                    if (status8 == 1) {
                        java.lang.String string38 = C43246rlf.OLrzqt.valueOf().getString(C43471rps.ActionBar.QVAiDq);
                        Intrinsics.checkNotNullExpressionValue(string38, "");
                        objectRef.element = AEQbTJ(string38);
                    } else if (status8 == 2) {
                        C43246rlf c43246rlf16 = C43246rlf.OLrzqt;
                        java.lang.String string39 = c43246rlf16.valueOf().getString(C43471rps.ActionBar.QbewEr);
                        Intrinsics.checkNotNullExpressionValue(string39, "");
                        java.lang.String string40 = c43246rlf16.valueOf().getString(C43471rps.ActionBar.AubY);
                        Intrinsics.checkNotNullExpressionValue(string40, "");
                        objectRef.element = AEQbTJ(string39, string40, new Function0() { // from class: o.rrH
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return C43491rqL.dvKsVJ(tokenAsset);
                            }
                        });
                    } else if (status8 == 3) {
                        C43246rlf c43246rlf17 = C43246rlf.OLrzqt;
                        java.lang.String string41 = c43246rlf17.valueOf().getString(C43471rps.ActionBar.QfsBiF);
                        Intrinsics.checkNotNullExpressionValue(string41, "");
                        java.lang.String string42 = c43246rlf17.valueOf().getString(C43471rps.ActionBar.fZBcTu);
                        Intrinsics.checkNotNullExpressionValue(string42, "");
                        objectRef.element = KWHzl(string41, string42, new Function0() { // from class: o.rrI
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return C43491rqL.fFgQHt(tokenAsset);
                            }
                        });
                    }
                    break;
                case 5:
                    int status9 = tokenAsset.getStatus();
                    if (status9 == 1) {
                        java.lang.String string43 = C43246rlf.OLrzqt.valueOf().getString(C43471rps.ActionBar.QUSxYX);
                        Intrinsics.checkNotNullExpressionValue(string43, "");
                        objectRef.element = AEQbTJ(string43);
                    } else if (status9 == 2) {
                        C43246rlf c43246rlf18 = C43246rlf.OLrzqt;
                        java.lang.String string44 = c43246rlf18.valueOf().getString(C43471rps.ActionBar.djSkpj);
                        Intrinsics.checkNotNullExpressionValue(string44, "");
                        java.lang.String string45 = c43246rlf18.valueOf().getString(C43471rps.ActionBar.fZBcTu);
                        Intrinsics.checkNotNullExpressionValue(string45, "");
                        objectRef.element = AEQbTJ(string44, string45, new Function0() { // from class: o.rrF
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return C43491rqL.dxcTrN(tokenAsset);
                            }
                        });
                    } else if (status9 == 3) {
                        C43246rlf c43246rlf19 = C43246rlf.OLrzqt;
                        java.lang.String string46 = c43246rlf19.valueOf().getString(C43471rps.ActionBar.RcXXUw);
                        Intrinsics.checkNotNullExpressionValue(string46, "");
                        java.lang.String string47 = c43246rlf19.valueOf().getString(C43471rps.ActionBar.fZBcTu);
                        Intrinsics.checkNotNullExpressionValue(string47, "");
                        objectRef.element = KWHzl(string46, string47, new Function0() { // from class: o.rrO
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return C43491rqL.fZBcTu(tokenAsset);
                            }
                        });
                    }
                    break;
                case 6:
                    int status10 = tokenAsset.getStatus();
                    if (status10 == 1) {
                        java.lang.String string48 = C43246rlf.OLrzqt.valueOf().getString(C43471rps.ActionBar.DTwDnp);
                        Intrinsics.checkNotNullExpressionValue(string48, "");
                        objectRef.element = AEQbTJ(string48);
                    } else if (status10 == 2) {
                        C43246rlf c43246rlf20 = C43246rlf.OLrzqt;
                        java.lang.String string49 = c43246rlf20.valueOf().getString(C43471rps.ActionBar.QOLQEE);
                        Intrinsics.checkNotNullExpressionValue(string49, "");
                        java.lang.String string50 = c43246rlf20.valueOf().getString(C43471rps.ActionBar.AubY);
                        Intrinsics.checkNotNullExpressionValue(string50, "");
                        objectRef.element = AEQbTJ(string49, string50, new Function0() { // from class: o.rrM
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return C43491rqL.finit(tokenAsset);
                            }
                        });
                    } else if (status10 == 3) {
                        C43246rlf c43246rlf21 = C43246rlf.OLrzqt;
                        java.lang.String string51 = c43246rlf21.valueOf().getString(C43471rps.ActionBar.QKVWgx);
                        Intrinsics.checkNotNullExpressionValue(string51, "");
                        java.lang.String string52 = c43246rlf21.valueOf().getString(C43471rps.ActionBar.fZBcTu);
                        Intrinsics.checkNotNullExpressionValue(string52, "");
                        objectRef.element = KWHzl(string51, string52, new Function0() { // from class: o.rrT
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return C43491rqL.giSNqX(tokenAsset);
                            }
                        });
                    }
                    break;
                case 7:
                    C43296rmc.KWHzl("logtag", "SCENE_ENUM_BATCH_PURCHASE:" + tokenAsset.getStatus() + "-" + tokenAsset.getBatchTxState());
                    jSONObject = android.text.TextUtils.isEmpty(tokenAsset.getBatchTxState()) ? null : new JSONObject(tokenAsset.getBatchTxState());
                    if (jSONObject != null) {
                        if (tokenAsset.getStatus() == 2 || tokenAsset.getStatus() == 3) {
                            C43246rlf c43246rlf22 = C43246rlf.OLrzqt;
                            java.lang.String string53 = c43246rlf22.valueOf().getString(C43471rps.ActionBar.AwvSrB);
                            Intrinsics.checkNotNullExpressionValue(string53, "");
                            java.lang.String string54 = c43246rlf22.valueOf().getString(C43471rps.ActionBar.AubY);
                            Intrinsics.checkNotNullExpressionValue(string54, "");
                            ?? AEQbTJ3 = AEQbTJ(string53, string54, new Function0() { // from class: o.rrQ
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                @Override // kotlin.jvm.functions.Function0
                                public final java.lang.Object invoke() {
                                    return C43491rqL.gGvvIC(tokenAsset);
                                }
                            });
                            objectRef.element = AEQbTJ3;
                            AEQbTJ3.setMessage(pTD.KWHzl(c43246rlf22.valueOf(), C43471rps.ActionBar.RJOkX, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56424yEw.gEmmrt(C56390yDp.OLrzqt(OtcExtraKeys.AMOUNT, jSONObject.get("success")), C56390yDp.OLrzqt("failedAmount", jSONObject.get(EopTrackEvent.KEY_RESULT_FAILED)))));
                        }
                    } else {
                        int status11 = tokenAsset.getStatus();
                        if (status11 == 1) {
                            java.lang.String string55 = C43246rlf.OLrzqt.valueOf().getString(C43471rps.ActionBar.AxsJAY);
                            Intrinsics.checkNotNullExpressionValue(string55, "");
                            objectRef.element = AEQbTJ(string55);
                        } else if (status11 == 2) {
                            C43246rlf c43246rlf23 = C43246rlf.OLrzqt;
                            java.lang.String string56 = c43246rlf23.valueOf().getString(C43471rps.ActionBar.AwvSrB);
                            Intrinsics.checkNotNullExpressionValue(string56, "");
                            java.lang.String string57 = c43246rlf23.valueOf().getString(C43471rps.ActionBar.AubY);
                            Intrinsics.checkNotNullExpressionValue(string57, "");
                            objectRef.element = AEQbTJ(string56, string57, new Function0() { // from class: o.rqM
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                @Override // kotlin.jvm.functions.Function0
                                public final java.lang.Object invoke() {
                                    return C43491rqL.fvQaOB(tokenAsset);
                                }
                            });
                        } else if (status11 == 3) {
                            C43246rlf c43246rlf24 = C43246rlf.OLrzqt;
                            java.lang.String string58 = c43246rlf24.valueOf().getString(C43471rps.ActionBar.AwvSrB);
                            Intrinsics.checkNotNullExpressionValue(string58, "");
                            java.lang.String string59 = c43246rlf24.valueOf().getString(C43471rps.ActionBar.AubY);
                            Intrinsics.checkNotNullExpressionValue(string59, "");
                            objectRef.element = KWHzl(string58, string59, new Function0() { // from class: o.rqP
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                @Override // kotlin.jvm.functions.Function0
                                public final java.lang.Object invoke() {
                                    return C43491rqL.gasjUx(tokenAsset);
                                }
                            });
                        }
                    }
                    break;
                case 8:
                    int status12 = tokenAsset.getStatus();
                    if (status12 == 1) {
                        java.lang.String string60 = C43246rlf.OLrzqt.valueOf().getString(C43471rps.ActionBar.AhwBna);
                        Intrinsics.checkNotNullExpressionValue(string60, "");
                        objectRef.element = AEQbTJ(string60);
                    } else if (status12 == 2) {
                        C43246rlf c43246rlf25 = C43246rlf.OLrzqt;
                        java.lang.String string61 = c43246rlf25.valueOf().getString(C43471rps.ActionBar.djBIcL);
                        Intrinsics.checkNotNullExpressionValue(string61, "");
                        java.lang.String string62 = c43246rlf25.valueOf().getString(C43471rps.ActionBar.fZBcTu);
                        Intrinsics.checkNotNullExpressionValue(string62, "");
                        objectRef.element = AEQbTJ(string61, string62, new Function0() { // from class: o.rqQ
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return C43491rqL.flVtFt(tokenAsset);
                            }
                        });
                    } else if (status12 == 3) {
                        C43246rlf c43246rlf26 = C43246rlf.OLrzqt;
                        java.lang.String string63 = c43246rlf26.valueOf().getString(C43471rps.ActionBar.valueOf);
                        Intrinsics.checkNotNullExpressionValue(string63, "");
                        java.lang.String string64 = c43246rlf26.valueOf().getString(C43471rps.ActionBar.fZBcTu);
                        Intrinsics.checkNotNullExpressionValue(string64, "");
                        objectRef.element = KWHzl(string63, string64, new Function0() { // from class: o.rqV
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return C43491rqL.gkJEwt(tokenAsset);
                            }
                        });
                    }
                    break;
                case 9:
                    int status13 = tokenAsset.getStatus();
                    if (status13 == 1) {
                        objectRef.element = AEQbTJ(pTD.KWHzl(C43246rlf.OLrzqt.valueOf(), C43471rps.ActionBar.fIwbmz, OLrzqt(tokenAsset.getPayload())));
                    } else if (status13 == 2) {
                        C43246rlf c43246rlf27 = C43246rlf.OLrzqt;
                        java.lang.String strKWHzl = pTD.KWHzl(c43246rlf27.valueOf(), C43471rps.ActionBar.hUfVAv, OLrzqt(tokenAsset.getPayload()));
                        java.lang.String string65 = c43246rlf27.valueOf().getString(C43471rps.ActionBar.fZBcTu);
                        Intrinsics.checkNotNullExpressionValue(string65, "");
                        objectRef.element = AEQbTJ(strKWHzl, string65, new Function0() { // from class: o.rqT
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return C43491rqL.iZzfmt(tokenAsset);
                            }
                        });
                    } else if (status13 == 3) {
                        C43246rlf c43246rlf28 = C43246rlf.OLrzqt;
                        java.lang.String strKWHzl2 = pTD.KWHzl(c43246rlf28.valueOf(), C43471rps.ActionBar.flVtFt, OLrzqt(tokenAsset.getPayload()));
                        java.lang.String string66 = c43246rlf28.valueOf().getString(C43471rps.ActionBar.fZBcTu);
                        Intrinsics.checkNotNullExpressionValue(string66, "");
                        objectRef.element = KWHzl(strKWHzl2, string66, new Function0() { // from class: o.rqS
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return C43491rqL.AxsJAYaxsJAY(tokenAsset);
                            }
                        });
                    }
                    break;
                case 10:
                    int status14 = tokenAsset.getStatus();
                    if (status14 == 1) {
                        java.lang.String string67 = C43246rlf.OLrzqt.valueOf().getString(C43471rps.ActionBar.ejfBZ);
                        Intrinsics.checkNotNullExpressionValue(string67, "");
                        objectRef.element = AEQbTJ(string67);
                    } else if (status14 == 2) {
                        C43246rlf c43246rlf29 = C43246rlf.OLrzqt;
                        java.lang.String string68 = c43246rlf29.valueOf().getString(C43471rps.ActionBar.fARcdN);
                        Intrinsics.checkNotNullExpressionValue(string68, "");
                        java.lang.String string69 = c43246rlf29.valueOf().getString(C43471rps.ActionBar.fZBcTu);
                        Intrinsics.checkNotNullExpressionValue(string69, "");
                        objectRef.element = AEQbTJ(string68, string69, new Function0() { // from class: o.rqU
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return C43491rqL.iRxXKY(tokenAsset);
                            }
                        });
                    } else if (status14 == 3) {
                        C43246rlf c43246rlf30 = C43246rlf.OLrzqt;
                        java.lang.String string70 = c43246rlf30.valueOf().getString(C43471rps.ActionBar.hDKMBd);
                        Intrinsics.checkNotNullExpressionValue(string70, "");
                        java.lang.String string71 = c43246rlf30.valueOf().getString(C43471rps.ActionBar.fZBcTu);
                        Intrinsics.checkNotNullExpressionValue(string71, "");
                        objectRef.element = KWHzl(string70, string71, new Function0() { // from class: o.rqW
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return C43491rqL.hUfVAv(tokenAsset);
                            }
                        });
                    }
                    break;
                case 11:
                    int status15 = tokenAsset.getStatus();
                    if (status15 == 1) {
                        java.lang.String string72 = C43246rlf.OLrzqt.valueOf().getString(C43471rps.ActionBar.zuBGHE);
                        Intrinsics.checkNotNullExpressionValue(string72, "");
                        objectRef.element = AEQbTJ(string72);
                    } else if (status15 == 2) {
                        AbstractC58185ywX<java.util.List<TxInfoBean>> abstractC58185ywXCopydefault = copydefault.copydefault(tokenAsset.getChain(), tokenAsset.getTxHash());
                        final Function1 function1 = new Function1() { // from class: o.rqZ
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj) {
                                return C43491rqL.EZpvd(objectRef, tokenAsset, (java.util.List) obj);
                            }
                        };
                        abstractC58185ywXCopydefault.AEQbTJ(new InterfaceC58227yxM() { // from class: o.rra
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // o.InterfaceC58227yxM
                            public final void accept(java.lang.Object obj) {
                                C43491rqL.EZpvd(function1, obj);
                            }
                        });
                    } else if (status15 == 3) {
                        AbstractC58185ywX<java.util.List<TxInfoBean>> abstractC58185ywXCopydefault2 = copydefault.copydefault(tokenAsset.getChain(), tokenAsset.getTxHash());
                        final Function1 function12 = new Function1() { // from class: o.rqX
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj) {
                                return C43491rqL.OLrzqt(objectRef, tokenAsset, (java.util.List) obj);
                            }
                        };
                        abstractC58185ywXCopydefault2.AEQbTJ(new InterfaceC58227yxM() { // from class: o.rrd
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // o.InterfaceC58227yxM
                            public final void accept(java.lang.Object obj) {
                                C43491rqL.djBIcL(function12, obj);
                            }
                        });
                    }
                    break;
                case 12:
                    int status16 = tokenAsset.getStatus();
                    if (status16 == 1) {
                        if (payLoad != null) {
                            objectRef.element = AEQbTJ(pTD.KWHzl(C43246rlf.OLrzqt.valueOf(), C43471rps.ActionBar.values, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("currency", payLoad.getCurrency()))));
                        }
                    } else if (status16 == 2) {
                        if (payLoad != null) {
                            java.lang.String currency = payLoad.getCurrency();
                            final Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
                            objectRef2.element = pTD.KWHzl(C43246rlf.OLrzqt.valueOf(), C43471rps.ActionBar.DbNXlk, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("currency", currency)));
                            AbstractC58185ywX<java.util.List<TxInfoBean>> abstractC58185ywXCopydefault3 = copydefault.copydefault(tokenAsset.getChain(), tokenAsset.getTxHash());
                            final Function1 function13 = new Function1() { // from class: o.rrf
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                @Override // kotlin.jvm.functions.Function1
                                public final java.lang.Object invoke(java.lang.Object obj) {
                                    return C43491rqL.AEQbTJ(objectRef, objectRef2, tokenAsset, (java.util.List) obj);
                                }
                            };
                            abstractC58185ywXCopydefault3.AEQbTJ(new InterfaceC58227yxM() { // from class: o.rrc
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                @Override // o.InterfaceC58227yxM
                                public final void accept(java.lang.Object obj) {
                                    C43491rqL.gEmmrt(function13, obj);
                                }
                            });
                        }
                    } else if (status16 == 3 && payLoad != null) {
                        java.lang.String currency2 = payLoad.getCurrency();
                        final Ref.ObjectRef objectRef3 = new Ref.ObjectRef();
                        objectRef3.element = pTD.KWHzl(C43246rlf.OLrzqt.valueOf(), C43471rps.ActionBar.AkhnZx, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("currency", currency2)));
                        AbstractC58185ywX<java.util.List<TxInfoBean>> abstractC58185ywXCopydefault4 = copydefault.copydefault(tokenAsset.getChain(), tokenAsset.getTxHash());
                        final Function1 function14 = new Function1() { // from class: o.rrb
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj) {
                                return C43491rqL.OLrzqt(objectRef, objectRef3, tokenAsset, (java.util.List) obj);
                            }
                        };
                        abstractC58185ywXCopydefault4.AEQbTJ(new InterfaceC58227yxM() { // from class: o.rri
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // o.InterfaceC58227yxM
                            public final void accept(java.lang.Object obj) {
                                C43491rqL.valueOf(function14, obj);
                            }
                        });
                    }
                    break;
                case 13:
                    int status17 = tokenAsset.getStatus();
                    if (status17 == 1) {
                        java.lang.String string73 = C43246rlf.OLrzqt.valueOf().getString(C43471rps.ActionBar.zLjUOn);
                        Intrinsics.checkNotNullExpressionValue(string73, "");
                        objectRef.element = AEQbTJ(string73);
                    } else if (status17 == 2) {
                        C43246rlf c43246rlf31 = C43246rlf.OLrzqt;
                        java.lang.String strKWHzl3 = pTD.KWHzl(c43246rlf31.valueOf(), C43471rps.ActionBar.DAIeex, OLrzqt(tokenAsset.getPayload()));
                        java.lang.String string74 = c43246rlf31.valueOf().getString(C43471rps.ActionBar.fFgQHt);
                        Intrinsics.checkNotNullExpressionValue(string74, "");
                        objectRef.element = AEQbTJ(strKWHzl3, string74, new Function0() { // from class: o.rrh
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return C43491rqL.RlQdEF(tokenAsset);
                            }
                        });
                    } else if (status17 == 3) {
                        C43246rlf c43246rlf32 = C43246rlf.OLrzqt;
                        java.lang.String strKWHzl4 = pTD.KWHzl(c43246rlf32.valueOf(), C43471rps.ActionBar.gkJEwt, OLrzqt(tokenAsset.getPayload()));
                        java.lang.String string75 = c43246rlf32.valueOf().getString(C43471rps.ActionBar.fZBcTu);
                        Intrinsics.checkNotNullExpressionValue(string75, "");
                        objectRef.element = KWHzl(strKWHzl4, string75, new Function0() { // from class: o.rrk
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return C43491rqL.AxsJAYsNCnLh(tokenAsset);
                            }
                        });
                    }
                    break;
                case 14:
                    int status18 = tokenAsset.getStatus();
                    if (status18 == 1) {
                        java.lang.String string76 = C43246rlf.OLrzqt.valueOf().getString(C43471rps.ActionBar.gHZMYf);
                        Intrinsics.checkNotNullExpressionValue(string76, "");
                        objectRef.element = AEQbTJ(string76);
                    } else if (status18 == 2) {
                        C43246rlf c43246rlf33 = C43246rlf.OLrzqt;
                        java.lang.String string77 = c43246rlf33.valueOf().getString(C43471rps.ActionBar.OcIXYQ);
                        Intrinsics.checkNotNullExpressionValue(string77, "");
                        java.lang.String string78 = c43246rlf33.valueOf().getString(C43471rps.ActionBar.dNCPSb);
                        Intrinsics.checkNotNullExpressionValue(string78, "");
                        objectRef.element = AEQbTJ(string77, string78, new Function0() { // from class: o.rrg
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return C43491rqL.QKudOq(tokenAsset);
                            }
                        });
                    } else if (status18 == 3) {
                        C43246rlf c43246rlf34 = C43246rlf.OLrzqt;
                        java.lang.String string79 = c43246rlf34.valueOf().getString(C43471rps.ActionBar.sSMYrx);
                        Intrinsics.checkNotNullExpressionValue(string79, "");
                        java.lang.String string80 = c43246rlf34.valueOf().getString(C43471rps.ActionBar.fZBcTu);
                        Intrinsics.checkNotNullExpressionValue(string80, "");
                        objectRef.element = KWHzl(string79, string80, new Function0() { // from class: o.rrn
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return C43491rqL.DAIeex(tokenAsset);
                            }
                        });
                    }
                    break;
                case 15:
                    int status19 = tokenAsset.getStatus();
                    if (status19 == 1) {
                        java.lang.String string81 = C43246rlf.OLrzqt.valueOf().getString(C43471rps.ActionBar.aKErDB);
                        Intrinsics.checkNotNullExpressionValue(string81, "");
                        objectRef.element = AEQbTJ(string81);
                    } else if (status19 == 2) {
                        C43246rlf c43246rlf35 = C43246rlf.OLrzqt;
                        java.lang.String string82 = c43246rlf35.valueOf().getString(C43471rps.ActionBar.dxcTrN);
                        Intrinsics.checkNotNullExpressionValue(string82, "");
                        java.lang.String string83 = c43246rlf35.valueOf().getString(C43471rps.ActionBar.getFieldNames);
                        Intrinsics.checkNotNullExpressionValue(string83, "");
                        objectRef.element = AEQbTJ(string82, string83, new Function0() { // from class: o.rro
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return C43491rqL.accept(tokenAsset);
                            }
                        });
                    } else if (status19 == 3) {
                        C43246rlf c43246rlf36 = C43246rlf.OLrzqt;
                        java.lang.String string84 = c43246rlf36.valueOf().getString(C43471rps.ActionBar.UeEOUB);
                        Intrinsics.checkNotNullExpressionValue(string84, "");
                        java.lang.String string85 = c43246rlf36.valueOf().getString(C43471rps.ActionBar.getFieldNames);
                        Intrinsics.checkNotNullExpressionValue(string85, "");
                        objectRef.element = KWHzl(string84, string85, new Function0() { // from class: o.rrm
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return C43491rqL.DXXBbs(tokenAsset);
                            }
                        });
                    }
                    break;
                case 16:
                    int status20 = tokenAsset.getStatus();
                    if (status20 == 1) {
                        java.lang.String string86 = C43246rlf.OLrzqt.valueOf().getString(C43471rps.ActionBar.ORxRYg);
                        Intrinsics.checkNotNullExpressionValue(string86, "");
                        objectRef.element = AEQbTJ(string86);
                    } else if (status20 == 2) {
                        C43246rlf c43246rlf37 = C43246rlf.OLrzqt;
                        java.lang.String strKWHzl5 = pTD.KWHzl(c43246rlf37.valueOf(), C43471rps.ActionBar.AxsJAYsNCnLh, OLrzqt(tokenAsset.getPayload()));
                        java.lang.String string87 = c43246rlf37.valueOf().getString(C43471rps.ActionBar.fFgQHt);
                        Intrinsics.checkNotNullExpressionValue(string87, "");
                        objectRef.element = AEQbTJ(strKWHzl5, string87, new Function0() { // from class: o.rrl
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return C43491rqL.DCJXGO(tokenAsset);
                            }
                        });
                    } else if (status20 == 3) {
                        C43246rlf c43246rlf38 = C43246rlf.OLrzqt;
                        java.lang.String strKWHzl6 = pTD.KWHzl(c43246rlf38.valueOf(), C43471rps.ActionBar.AxsJAYaxsJAY, OLrzqt(tokenAsset.getPayload()));
                        java.lang.String string88 = c43246rlf38.valueOf().getString(C43471rps.ActionBar.fZBcTu);
                        Intrinsics.checkNotNullExpressionValue(string88, "");
                        objectRef.element = KWHzl(strKWHzl6, string88, new Function0() { // from class: o.rrp
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return C43491rqL.DarRvM(tokenAsset);
                            }
                        });
                    }
                    break;
                default:
                    int status21 = tokenAsset.getStatus();
                    if (status21 == 1) {
                        java.lang.String string89 = C43246rlf.OLrzqt.valueOf().getString(C43471rps.ActionBar.AuCTel);
                        Intrinsics.checkNotNullExpressionValue(string89, "");
                        objectRef.element = AEQbTJ(string89);
                    } else if (status21 == 2) {
                        C43246rlf c43246rlf39 = C43246rlf.OLrzqt;
                        java.lang.String string90 = c43246rlf39.valueOf().getString(C43471rps.ActionBar.fJNWhG);
                        Intrinsics.checkNotNullExpressionValue(string90, "");
                        java.lang.String string91 = c43246rlf39.valueOf().getString(C43471rps.ActionBar.getFieldNames);
                        Intrinsics.checkNotNullExpressionValue(string91, "");
                        objectRef.element = AEQbTJ(string90, string91, new Function0() { // from class: o.rrD
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return C43491rqL.QkdxfA(tokenAsset);
                            }
                        });
                    } else if (status21 == 3) {
                        C43246rlf c43246rlf40 = C43246rlf.OLrzqt;
                        java.lang.String string92 = c43246rlf40.valueOf().getString(C43471rps.ActionBar.isConnected);
                        Intrinsics.checkNotNullExpressionValue(string92, "");
                        java.lang.String string93 = c43246rlf40.valueOf().getString(C43471rps.ActionBar.getFieldNames);
                        Intrinsics.checkNotNullExpressionValue(string93, "");
                        objectRef.element = KWHzl(string92, string93, new Function0() { // from class: o.rrB
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return C43491rqL.OBJEWx(tokenAsset);
                            }
                        });
                    }
                    break;
            }
        } else {
            int status22 = tokenAsset.getStatus();
            if (status22 == 1) {
                java.lang.String string94 = C43246rlf.OLrzqt.valueOf().getString(C43471rps.ActionBar.AuCTel);
                Intrinsics.checkNotNullExpressionValue(string94, "");
                objectRef.element = AEQbTJ(string94);
            } else if (status22 == 2) {
                C43246rlf c43246rlf41 = C43246rlf.OLrzqt;
                java.lang.String string95 = c43246rlf41.valueOf().getString(C43471rps.ActionBar.fJNWhG);
                Intrinsics.checkNotNullExpressionValue(string95, "");
                java.lang.String string96 = c43246rlf41.valueOf().getString(C43471rps.ActionBar.getFieldNames);
                Intrinsics.checkNotNullExpressionValue(string96, "");
                objectRef.element = AEQbTJ(string95, string96, new Function0() { // from class: o.rrv
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return C43491rqL.RKDWNf(tokenAsset);
                    }
                });
            } else if (status22 == 3) {
                C43246rlf c43246rlf42 = C43246rlf.OLrzqt;
                java.lang.String string97 = c43246rlf42.valueOf().getString(C43471rps.ActionBar.isConnected);
                Intrinsics.checkNotNullExpressionValue(string97, "");
                java.lang.String string98 = c43246rlf42.valueOf().getString(C43471rps.ActionBar.getFieldNames);
                Intrinsics.checkNotNullExpressionValue(string98, "");
                objectRef.element = KWHzl(string97, string98, new Function0() { // from class: o.rrC
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return C43491rqL.QHmsKR(tokenAsset);
                    }
                });
            }
        }
        return (C55097xdX) objectRef.element;
    }

    public static final Unit QSBOWP(TokenAsset tokenAsset) {
        OLrzqt.copydefault(2, tokenAsset.getUserWalletAddress(), tokenAsset.getChain());
        return Unit.INSTANCE;
    }

    public static final Unit QUSxYX(TokenAsset tokenAsset) {
        OLrzqt.copydefault(4, tokenAsset.getUserWalletAddress(), tokenAsset.getChain());
        return Unit.INSTANCE;
    }

    public static final Unit QVAiDq(TokenAsset tokenAsset) {
        OLrzqt.copydefault(1, tokenAsset.getUserWalletAddress(), tokenAsset.getChain());
        return Unit.INSTANCE;
    }

    public static final Unit UeEOUB(TokenAsset tokenAsset) {
        OLrzqt.copydefault(4, tokenAsset.getUserWalletAddress(), tokenAsset.getChain());
        return Unit.INSTANCE;
    }

    public static final Unit RcXXUw(TokenAsset tokenAsset) {
        android.app.Activity activityAEQbTJ = C54819xWm.KWHzl().AEQbTJ();
        if (activityAEQbTJ != null) {
            OLrzqt.AEQbTJ(activityAEQbTJ, tokenAsset.getTxHash(), tokenAsset.getUrlPre(), tokenAsset.getUopHash());
        }
        return Unit.INSTANCE;
    }

    public static final Unit aKErDB(TokenAsset tokenAsset) {
        android.app.Activity activityAEQbTJ = C54819xWm.KWHzl().AEQbTJ();
        if (activityAEQbTJ != null) {
            OLrzqt.AEQbTJ(activityAEQbTJ, tokenAsset.getTxHash(), tokenAsset.getUrlPre(), tokenAsset.getUopHash());
        }
        return Unit.INSTANCE;
    }

    public static final Unit djSkpj(TokenAsset tokenAsset) {
        OLrzqt.copydefault(4, tokenAsset.getUserWalletAddress(), tokenAsset.getChain());
        return Unit.INSTANCE;
    }

    public static final Unit dNCPSb(TokenAsset tokenAsset) {
        OLrzqt.copydefault(4, tokenAsset.getUserWalletAddress(), tokenAsset.getChain());
        return Unit.INSTANCE;
    }

    public static final Unit dvKsVJ(TokenAsset tokenAsset) {
        OLrzqt.copydefault(1, tokenAsset.getUserWalletAddress(), tokenAsset.getChain());
        return Unit.INSTANCE;
    }

    public static final Unit fFgQHt(TokenAsset tokenAsset) {
        OLrzqt.copydefault(4, tokenAsset.getUserWalletAddress(), tokenAsset.getChain());
        return Unit.INSTANCE;
    }

    public static final Unit dxcTrN(TokenAsset tokenAsset) {
        OLrzqt.copydefault(4, tokenAsset.getUserWalletAddress(), tokenAsset.getChain());
        return Unit.INSTANCE;
    }

    public static final Unit fZBcTu(TokenAsset tokenAsset) {
        OLrzqt.copydefault(4, tokenAsset.getUserWalletAddress(), tokenAsset.getChain());
        return Unit.INSTANCE;
    }

    public static final Unit finit(TokenAsset tokenAsset) {
        if (tokenAsset.getChain() == 0) {
            OLrzqt.KWHzl(tokenAsset.getUserWalletAddress(), tokenAsset.getChain());
        } else {
            OLrzqt.copydefault(1, tokenAsset.getUserWalletAddress(), tokenAsset.getChain());
        }
        return Unit.INSTANCE;
    }

    public static final Unit giSNqX(TokenAsset tokenAsset) {
        if (tokenAsset.getChain() == 0) {
            OLrzqt.KWHzl(tokenAsset.getUserWalletAddress(), tokenAsset.getChain());
        } else {
            OLrzqt.copydefault(4, tokenAsset.getUserWalletAddress(), tokenAsset.getChain());
        }
        return Unit.INSTANCE;
    }

    public static final Unit gGvvIC(TokenAsset tokenAsset) {
        OLrzqt.copydefault(1, tokenAsset.getUserWalletAddress(), tokenAsset.getChain());
        return Unit.INSTANCE;
    }

    public static final Unit fvQaOB(TokenAsset tokenAsset) {
        OLrzqt.copydefault(1, tokenAsset.getUserWalletAddress(), tokenAsset.getChain());
        return Unit.INSTANCE;
    }

    public static final Unit gasjUx(TokenAsset tokenAsset) {
        OLrzqt.copydefault(1, tokenAsset.getUserWalletAddress(), tokenAsset.getChain());
        return Unit.INSTANCE;
    }

    public static final Unit flVtFt(TokenAsset tokenAsset) {
        OLrzqt.copydefault(4, tokenAsset.getUserWalletAddress(), tokenAsset.getChain());
        return Unit.INSTANCE;
    }

    public static final Unit gkJEwt(TokenAsset tokenAsset) {
        OLrzqt.copydefault(7, tokenAsset.getUserWalletAddress(), tokenAsset.getChain());
        return Unit.INSTANCE;
    }

    public static final Unit iZzfmt(TokenAsset tokenAsset) {
        if (tokenAsset.getChain() == 0) {
            OLrzqt.KWHzl(tokenAsset.getUserWalletAddress(), tokenAsset.getChain());
        } else {
            OLrzqt.copydefault(4, tokenAsset.getUserWalletAddress(), tokenAsset.getChain());
        }
        return Unit.INSTANCE;
    }

    public static final Unit AxsJAYaxsJAY(TokenAsset tokenAsset) {
        if (tokenAsset.getChain() == 0) {
            OLrzqt.KWHzl(tokenAsset.getUserWalletAddress(), tokenAsset.getChain());
        } else {
            OLrzqt.copydefault(5, tokenAsset.getUserWalletAddress(), tokenAsset.getChain());
        }
        return Unit.INSTANCE;
    }

    public static final Unit iRxXKY(TokenAsset tokenAsset) {
        OLrzqt.copydefault(4, tokenAsset.getUserWalletAddress(), tokenAsset.getChain());
        return Unit.INSTANCE;
    }

    public static final Unit hUfVAv(TokenAsset tokenAsset) {
        OLrzqt.copydefault(6, tokenAsset.getUserWalletAddress(), tokenAsset.getChain());
        return Unit.INSTANCE;
    }

    public static final void EZpvd(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [T, java.lang.Object, o.xdX] */
    public static final Unit EZpvd(Ref.ObjectRef objectRef, final TokenAsset tokenAsset, final java.util.List list) {
        C43491rqL c43491rqL = OLrzqt;
        C43246rlf c43246rlf = C43246rlf.OLrzqt;
        java.lang.String strKWHzl = pTD.KWHzl(c43246rlf.valueOf(), C43471rps.ActionBar.iRxXKY, c43491rqL.OLrzqt(tokenAsset.getPayload()));
        java.lang.String string = c43246rlf.valueOf().getString(C43471rps.ActionBar.fZBcTu);
        Intrinsics.checkNotNullExpressionValue(string, "");
        ?? AEQbTJ2 = c43491rqL.AEQbTJ(strKWHzl, string, new Function0() { // from class: o.rrj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C43491rqL.AEQbTJ(list, tokenAsset);
            }
        });
        objectRef.element = AEQbTJ2;
        C57656ymY c57656ymY = C57656ymY.OLrzqt;
        Intrinsics.copydefault((java.lang.Object) AEQbTJ2);
        C57656ymY.showNotificationViewWithToast$default(c57656ymY, AEQbTJ2, 0L, 0, 0, 0, 30, null);
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(java.util.List list, TokenAsset tokenAsset) {
        C43491rqL c43491rqL = OLrzqt;
        Intrinsics.copydefault(list);
        c43491rqL.AYXKKw((java.util.List<TxInfoBean>) list, tokenAsset);
        return Unit.INSTANCE;
    }

    public static final void djBIcL(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [T, java.lang.Object, o.xdX] */
    public static final Unit OLrzqt(Ref.ObjectRef objectRef, final TokenAsset tokenAsset, final java.util.List list) {
        C43491rqL c43491rqL = OLrzqt;
        C43246rlf c43246rlf = C43246rlf.OLrzqt;
        java.lang.String strKWHzl = pTD.KWHzl(c43246rlf.valueOf(), C43471rps.ActionBar.iZzfmt, c43491rqL.OLrzqt(tokenAsset.getPayload()));
        java.lang.String string = c43246rlf.valueOf().getString(C43471rps.ActionBar.fZBcTu);
        Intrinsics.checkNotNullExpressionValue(string, "");
        ?? KWHzl2 = c43491rqL.KWHzl(strKWHzl, string, new Function0() { // from class: o.rqN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C43491rqL.djBIcL(list, tokenAsset);
            }
        });
        objectRef.element = KWHzl2;
        C57656ymY c57656ymY = C57656ymY.OLrzqt;
        Intrinsics.copydefault((java.lang.Object) KWHzl2);
        C57656ymY.showNotificationViewWithToast$default(c57656ymY, KWHzl2, 0L, 0, 0, 0, 30, null);
        return Unit.INSTANCE;
    }

    public static final Unit djBIcL(java.util.List list, TokenAsset tokenAsset) {
        C43491rqL c43491rqL = OLrzqt;
        Intrinsics.copydefault(list);
        c43491rqL.AYXKKw((java.util.List<TxInfoBean>) list, tokenAsset);
        return Unit.INSTANCE;
    }

    public static final void gEmmrt(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r13v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [T, java.lang.Object, o.xdX] */
    public static final Unit AEQbTJ(Ref.ObjectRef objectRef, Ref.ObjectRef objectRef2, final TokenAsset tokenAsset, final java.util.List list) {
        C43491rqL c43491rqL = OLrzqt;
        java.lang.String str = (java.lang.String) objectRef2.element;
        java.lang.String string = C43246rlf.OLrzqt.valueOf().getString(C43471rps.ActionBar.fZBcTu);
        Intrinsics.checkNotNullExpressionValue(string, "");
        ?? AEQbTJ2 = c43491rqL.AEQbTJ(str, string, new Function0() { // from class: o.rrL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C43491rqL.valueOf(list, tokenAsset);
            }
        });
        objectRef.element = AEQbTJ2;
        C57656ymY c57656ymY = C57656ymY.OLrzqt;
        Intrinsics.copydefault((java.lang.Object) AEQbTJ2);
        C57656ymY.showNotificationViewWithToast$default(c57656ymY, AEQbTJ2, 0L, 0, 0, 0, 30, null);
        return Unit.INSTANCE;
    }

    public static final Unit valueOf(java.util.List list, TokenAsset tokenAsset) {
        C43491rqL c43491rqL = OLrzqt;
        Intrinsics.copydefault(list);
        c43491rqL.AYXKKw((java.util.List<TxInfoBean>) list, tokenAsset);
        return Unit.INSTANCE;
    }

    public static final void valueOf(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r13v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [T, java.lang.Object, o.xdX] */
    public static final Unit OLrzqt(Ref.ObjectRef objectRef, Ref.ObjectRef objectRef2, final TokenAsset tokenAsset, final java.util.List list) {
        C43491rqL c43491rqL = OLrzqt;
        java.lang.String str = (java.lang.String) objectRef2.element;
        java.lang.String string = C43246rlf.OLrzqt.valueOf().getString(C43471rps.ActionBar.fZBcTu);
        Intrinsics.checkNotNullExpressionValue(string, "");
        ?? KWHzl2 = c43491rqL.KWHzl(str, string, new Function0() { // from class: o.rrN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C43491rqL.AhwBna(list, tokenAsset);
            }
        });
        objectRef.element = KWHzl2;
        C57656ymY c57656ymY = C57656ymY.OLrzqt;
        Intrinsics.copydefault((java.lang.Object) KWHzl2);
        C57656ymY.showNotificationViewWithToast$default(c57656ymY, KWHzl2, 0L, 0, 0, 0, 30, null);
        return Unit.INSTANCE;
    }

    public static final Unit AhwBna(java.util.List list, TokenAsset tokenAsset) {
        C43491rqL c43491rqL = OLrzqt;
        Intrinsics.copydefault(list);
        c43491rqL.AYXKKw((java.util.List<TxInfoBean>) list, tokenAsset);
        return Unit.INSTANCE;
    }

    public static final Unit RlQdEF(TokenAsset tokenAsset) {
        OLrzqt.copydefault(5, tokenAsset.getUserWalletAddress(), tokenAsset.getChain());
        return Unit.INSTANCE;
    }

    public static final Unit AxsJAYsNCnLh(TokenAsset tokenAsset) {
        OLrzqt.copydefault(4, tokenAsset.getUserWalletAddress(), tokenAsset.getChain());
        return Unit.INSTANCE;
    }

    public static final Unit QKudOq(TokenAsset tokenAsset) {
        OLrzqt.copydefault(6, tokenAsset.getUserWalletAddress(), tokenAsset.getChain());
        return Unit.INSTANCE;
    }

    public static final Unit DAIeex(TokenAsset tokenAsset) {
        OLrzqt.copydefault(4, tokenAsset.getUserWalletAddress(), tokenAsset.getChain());
        return Unit.INSTANCE;
    }

    public static final Unit accept(TokenAsset tokenAsset) {
        android.app.Activity activityAEQbTJ = C54819xWm.KWHzl().AEQbTJ();
        if (activityAEQbTJ != null) {
            OLrzqt.AEQbTJ(activityAEQbTJ, tokenAsset.getTxHash(), tokenAsset.getUrlPre(), tokenAsset.getUopHash());
        }
        return Unit.INSTANCE;
    }

    public static final Unit DXXBbs(TokenAsset tokenAsset) {
        android.app.Activity activityAEQbTJ = C54819xWm.KWHzl().AEQbTJ();
        if (activityAEQbTJ != null) {
            OLrzqt.AEQbTJ(activityAEQbTJ, tokenAsset.getTxHash(), tokenAsset.getUrlPre(), tokenAsset.getUopHash());
        }
        return Unit.INSTANCE;
    }

    public static final Unit DCJXGO(TokenAsset tokenAsset) {
        OLrzqt.copydefault(5, tokenAsset.getUserWalletAddress(), tokenAsset.getChain());
        return Unit.INSTANCE;
    }

    public static final Unit DarRvM(TokenAsset tokenAsset) {
        OLrzqt.copydefault(4, tokenAsset.getUserWalletAddress(), tokenAsset.getChain());
        return Unit.INSTANCE;
    }

    public static final Unit ODWQjV(TokenAsset tokenAsset) {
        android.app.Activity activityAEQbTJ = C54819xWm.KWHzl().AEQbTJ();
        if (activityAEQbTJ != null) {
            OLrzqt.AEQbTJ(activityAEQbTJ, tokenAsset.getTxHash(), tokenAsset.getUrlPre(), tokenAsset.getUopHash());
        }
        return Unit.INSTANCE;
    }

    public static final Unit OqFWZa(TokenAsset tokenAsset) {
        android.app.Activity activityAEQbTJ = C54819xWm.KWHzl().AEQbTJ();
        if (activityAEQbTJ != null) {
            OLrzqt.AEQbTJ(activityAEQbTJ, tokenAsset.getTxHash(), tokenAsset.getUrlPre(), tokenAsset.getUopHash());
        }
        return Unit.INSTANCE;
    }

    public static final Unit ffGIBT(TokenAsset tokenAsset) {
        android.app.Activity activityAEQbTJ = C54819xWm.KWHzl().AEQbTJ();
        if (activityAEQbTJ != null) {
            OLrzqt.AEQbTJ(activityAEQbTJ, tokenAsset.getTxHash(), tokenAsset.getUrlPre(), tokenAsset.getUopHash());
        }
        return Unit.INSTANCE;
    }

    public static final Unit getPostValueLengthLimit(TokenAsset tokenAsset) {
        android.app.Activity activityAEQbTJ = C54819xWm.KWHzl().AEQbTJ();
        if (activityAEQbTJ != null) {
            OLrzqt.AEQbTJ(activityAEQbTJ, tokenAsset.getTxHash(), tokenAsset.getUrlPre(), tokenAsset.getUopHash());
        }
        return Unit.INSTANCE;
    }

    public static final Unit zuWLRA(TokenAsset tokenAsset) {
        android.app.Activity activityAEQbTJ = C54819xWm.KWHzl().AEQbTJ();
        if (activityAEQbTJ != null) {
            OLrzqt.AEQbTJ(activityAEQbTJ, tokenAsset.getTxHash(), tokenAsset.getUrlPre(), tokenAsset.getUopHash());
        }
        return Unit.INSTANCE;
    }

    public static final Unit OuxcSI(TokenAsset tokenAsset) {
        android.app.Activity activityAEQbTJ = C54819xWm.KWHzl().AEQbTJ();
        if (activityAEQbTJ != null) {
            OLrzqt.AEQbTJ(activityAEQbTJ, tokenAsset.getTxHash(), tokenAsset.getUrlPre(), tokenAsset.getUopHash());
        }
        return Unit.INSTANCE;
    }

    public static final Unit DCUTEI(TokenAsset tokenAsset) {
        android.app.Activity activityAEQbTJ = C54819xWm.KWHzl().AEQbTJ();
        if (activityAEQbTJ != null) {
            OLrzqt.AEQbTJ(activityAEQbTJ, tokenAsset.getTxHash(), tokenAsset.getUrlPre(), tokenAsset.getUopHash());
        }
        return Unit.INSTANCE;
    }

    public static final Unit RKDWNf(TokenAsset tokenAsset) {
        android.app.Activity activityAEQbTJ = C54819xWm.KWHzl().AEQbTJ();
        if (activityAEQbTJ != null) {
            OLrzqt.AEQbTJ(activityAEQbTJ, tokenAsset.getTxHash(), tokenAsset.getUrlPre(), tokenAsset.getUopHash());
        }
        return Unit.INSTANCE;
    }

    public static final Unit QHmsKR(TokenAsset tokenAsset) {
        android.app.Activity activityAEQbTJ = C54819xWm.KWHzl().AEQbTJ();
        if (activityAEQbTJ != null) {
            OLrzqt.AEQbTJ(activityAEQbTJ, tokenAsset.getTxHash(), tokenAsset.getUrlPre(), tokenAsset.getUopHash());
        }
        return Unit.INSTANCE;
    }

    public static final Unit QkdxfA(TokenAsset tokenAsset) {
        android.app.Activity activityAEQbTJ = C54819xWm.KWHzl().AEQbTJ();
        if (activityAEQbTJ != null) {
            OLrzqt.AEQbTJ(activityAEQbTJ, tokenAsset.getTxHash(), tokenAsset.getUrlPre(), tokenAsset.getUopHash());
        }
        return Unit.INSTANCE;
    }

    public static final Unit OBJEWx(TokenAsset tokenAsset) {
        android.app.Activity activityAEQbTJ = C54819xWm.KWHzl().AEQbTJ();
        if (activityAEQbTJ != null) {
            OLrzqt.AEQbTJ(activityAEQbTJ, tokenAsset.getTxHash(), tokenAsset.getUrlPre(), tokenAsset.getUopHash());
        }
        return Unit.INSTANCE;
    }

    public final void AYXKKw(@NotNull java.util.List<TxInfoBean> list, @NotNull TokenAsset tokenAsset) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(tokenAsset, "");
        android.os.Bundle bundle = new android.os.Bundle();
        for (InterfaceC9738bbJ interfaceC9738bbJ : ((InterfaceC9852bdR) C43248rlh.KWHzl.AEQbTJ(InterfaceC9852bdR.class)).gEmmrt().OLrzqt()) {
            if (Intrinsics.EZpvd((java.lang.Object) interfaceC9738bbJ.EZpvd(tokenAsset.getChain()), (java.lang.Object) tokenAsset.getUserWalletAddress())) {
                bundle.putString("wallet_id", interfaceC9738bbJ.DbNXlk());
            }
        }
        if (!list.isEmpty()) {
            bundle.putString("tx_id", list.get(list.size() - 1).getTxId());
            bundle.putLong("coin", list.get(list.size() - 1).getCoinId());
        }
        bundle.putString("tx_hash", tokenAsset.getTxHash());
        bundle.putString("tx_address", tokenAsset.getUserWalletAddress());
        bundle.putString("tx_uop_hash", tokenAsset.getUopHash());
        android.app.Activity activityAEQbTJ = C54819xWm.KWHzl().AEQbTJ();
        if (activityAEQbTJ != null) {
            ((InterfaceC54829xWw) C43248rlh.KWHzl.AEQbTJ(InterfaceC54829xWw.class)).AEQbTJ(activityAEQbTJ, bundle, true, false, true);
        }
    }

    public final void RdAHlO(TokenAsset tokenAsset) {
        java.util.HashMap map = new java.util.HashMap();
        map.put("status", java.lang.Integer.valueOf(tokenAsset.getStatus()));
        map.put("scene", java.lang.Integer.valueOf(tokenAsset.getScene()));
        map.put("txHash", tokenAsset.getTxHash());
        map.put("chain", java.lang.Long.valueOf(tokenAsset.getChain()));
        if (!tokenAsset.getSpeedTxHash().isEmpty()) {
            map.put("speedTxHash", tokenAsset.getSpeedTxHash());
        }
        JSONObject jSONObject = !android.text.TextUtils.isEmpty(tokenAsset.getBatchTxState()) ? new JSONObject(tokenAsset.getBatchTxState()) : null;
        if (jSONObject != null) {
            map.put("batchId", jSONObject.get("batchId"));
            map.put("batchTxState", jSONObject.toString());
        }
        InterfaceC7298ahG interfaceC7298ahGKWHzl = C7323ahf.KWHzl();
        if (interfaceC7298ahGKWHzl != null) {
            interfaceC7298ahGKWHzl.AEQbTJ("PENDING_UPDATE", null, map);
        }
    }

    public final void KWHzl(@NotNull java.lang.String str, long j) {
        Intrinsics.checkNotNullParameter(str, "");
        for (InterfaceC9738bbJ interfaceC9738bbJ : ((InterfaceC9852bdR) C43248rlh.KWHzl.AEQbTJ(InterfaceC9852bdR.class)).gEmmrt().OLrzqt()) {
            if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) interfaceC9738bbJ.EZpvd(j))) {
                UDGoPageBridge.AEQbTJ();
                android.app.Activity activityAEQbTJ = C54819xWm.KWHzl().AEQbTJ();
                if (activityAEQbTJ != null) {
                    InterfaceC54829xWw interfaceC54829xWw = (InterfaceC54829xWw) C43248rlh.KWHzl.AEQbTJ(InterfaceC54829xWw.class);
                    android.os.Bundle bundle = new android.os.Bundle();
                    bundle.putString("wallet_id", interfaceC9738bbJ.DbNXlk());
                    Unit unit = Unit.INSTANCE;
                    InterfaceC54829xWw.ActionBar.enterWalletHistory$default(interfaceC54829xWw, activityAEQbTJ, bundle, false, false, false, 20, null);
                }
            }
        }
    }

    public final void copydefault(int i, @NotNull java.lang.String str, long j) {
        Intrinsics.checkNotNullParameter(str, "");
        for (InterfaceC9738bbJ interfaceC9738bbJ : ((InterfaceC9852bdR) C43248rlh.KWHzl.AEQbTJ(InterfaceC9852bdR.class)).gEmmrt().OLrzqt()) {
            if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) interfaceC9738bbJ.EZpvd(j))) {
                if (4 <= i && i < 8) {
                    android.app.Activity activityAEQbTJ = C54819xWm.KWHzl().AEQbTJ();
                    if (activityAEQbTJ != null) {
                        OLrzqt.copydefault(activityAEQbTJ, i - 3, interfaceC9738bbJ.DbNXlk());
                        return;
                    }
                    return;
                }
                android.app.Activity activityAEQbTJ2 = C54819xWm.KWHzl().AEQbTJ();
                if (activityAEQbTJ2 != null) {
                    C43514rqi.EZpvd.copydefault(activityAEQbTJ2);
                }
            }
        }
    }

    public final C55097xdX AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(function0, "");
        C55097xdX c55097xdX = new C55097xdX(C32979mnm.EZpvd.OLrzqt(), null, 0, 4, null);
        c55097xdX.setTitle(str);
        c55097xdX.setType(1);
        c55097xdX.setState(2);
        c55097xdX.OLrzqt(str2, function0);
        return c55097xdX;
    }

    public final C55097xdX KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(function0, "");
        C55097xdX c55097xdX = new C55097xdX(C32979mnm.EZpvd.OLrzqt(), null, 0, 4, null);
        c55097xdX.setTitle(str);
        c55097xdX.setType(1);
        c55097xdX.setState(3);
        c55097xdX.OLrzqt(str2, function0);
        return c55097xdX;
    }

    public final C55097xdX AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C55097xdX c55097xdX = new C55097xdX(C32979mnm.EZpvd.OLrzqt(), null, 0, 4, null);
        c55097xdX.setTitle(str);
        c55097xdX.setType(1);
        c55097xdX.setState(1);
        return c55097xdX;
    }

    public final void AEQbTJ(@NotNull android.content.Context context, @NotNull java.lang.String str, @NotNull java.lang.String str2, java.lang.String str3) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        java.lang.String str4 = str2 + "/tx/" + str;
        if (C33129mqd.OLrzqt((java.lang.CharSequence) str3)) {
            str4 = str2 + "/tx/uop/" + str3;
        }
        WebActivity.TaskDescription.openPage$default(WebActivity.Companion, context, BundleKt.bundleOf(C56390yDp.OLrzqt("url", str4)), null, 4, null);
    }

    public final void copydefault(android.content.Context context, int i, java.lang.String str) {
        java.util.HashMap map = new java.util.HashMap();
        map.put("defaultTab", java.lang.Integer.valueOf(i));
        map.put("walletId", str);
        map.put("to", "NFTMyOffersVC");
        java.util.ArrayList arrayList = new java.util.ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            arrayList.add(C56390yDp.OLrzqt(entry.getKey(), entry.getValue()));
        }
        KWHzl(context, C33048mpB.EZpvd((kotlin.Pair[]) arrayList.toArray(new kotlin.Pair[0])));
    }

    public final void KWHzl(android.content.Context context, android.os.Bundle bundle) {
        java.util.HashMap map = new java.util.HashMap();
        java.util.Set<java.lang.String> setKeySet = bundle.keySet();
        Intrinsics.checkNotNullExpressionValue(setKeySet, "");
        for (java.lang.String str : setKeySet) {
            java.lang.Object obj = bundle.get(str);
            if (obj != null) {
                map.put(str, obj);
            }
        }
        map.put("appearance", "alternativeweb3");
        C43056riA.AEQbTJ.copydefault(context, "okluanft", "/mlnRouter", map);
    }

    public final java.util.HashMap<java.lang.String, java.lang.Object> OLrzqt(java.lang.String str) {
        java.util.HashMap<java.lang.String, java.lang.Object> map = new java.util.HashMap<>();
        if (str != null && str.length() != 0) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                java.util.Iterator<java.lang.String> itKeys = jSONObject.keys();
                Intrinsics.checkNotNullExpressionValue(itKeys, "");
                while (itKeys.hasNext()) {
                    java.lang.String next = itKeys.next();
                    java.lang.Object obj = jSONObject.get(next);
                    Intrinsics.copydefault(obj, "");
                    map.put(next, obj);
                }
                return map;
            } catch (java.lang.Exception e) {
                e.printStackTrace();
            }
        }
        return map;
    }
}
