package com.okinc.wallet.mln.service;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.immomo.mls.annotation.LuaBridge;
import com.immomo.mls.annotation.LuaClass;
import com.immomo.mls.fun.ud.UDImageInfo;
import com.immomo.mls.fun.ud.UDNativeLoader;
import com.okinc.business.defi.api.bean.DappInteractionArgs;
import com.okinc.business.defi.api.bean.DappSignArgs;
import com.okinc.business.defi.api.bean.MpcSignType;
import com.okinc.business.defi.api.bean.NewCallbackBean;
import com.okinc.business.defi.api.bean.PlatformItem;
import com.okinc.business.defi.api.bean.SignType;
import com.okinc.business.defi.api.bean.SolanaSignType;
import com.okinc.business.defi.wallet.mine.search.data.model.WalletSearchRequest;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.wallet.api.WalletDappInteractionBizService;
import com.okinc.wallet.api.bean.WalletBtcAddressBean;
import com.reown.android.internal.common.signing.eip1271.EIP1271Verifier;
import java.io.StringReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import o.AbstractC58185ywX;
import o.C10350bmm;
import o.C13754dXa;
import o.C33490mxT;
import o.C43246rlf;
import o.C43248rlh;
import o.C48787ucK;
import o.C57104ycC;
import o.C58266yxz;
import o.C7322ahe;
import o.C7869arv;
import o.C7910asj;
import o.C8017aul;
import o.InterfaceC58217yxC;
import o.InterfaceC58227yxM;
import o.InterfaceC58229yxO;
import o.InterfaceC7835arN;
import o.InterfaceC9731bbC;
import o.pUU;
import o.xWE;
import o.xWF;
import o.xWG;
import o.yBP;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.luaj.vm2.Globals;
import org.luaj.vm2.LuaBoolean;
import org.luaj.vm2.LuaValue;

/* JADX INFO: loaded from: classes12.dex */
@LuaClass
public class UDWalletCoreNew {
    public static final int BIZ_NFT = 1;
    public static final int BIZ_P2P = 2;
    public static final String LUA_CLASS_NAME = "WalletCoreNew";
    public static xWF walletService;
    public Globals globals;
    public StringBuilder sb = new StringBuilder();
    public InterfaceC58217yxC subFeeInfoDisposable;

    public UDWalletCoreNew(@NonNull Globals globals, @NonNull LuaValue[] luaValueArr) {
        this.globals = null;
        this.globals = globals;
    }

    public static Context KWHzl(@NonNull Globals globals) {
        C7322ahe c7322ahe = (C7322ahe) globals.AuCTel();
        if (c7322ahe != null) {
            return c7322ahe.AEQbTJ;
        }
        return null;
    }

    @LuaBridge
    public LuaValue[] openFeeInfoPage(LuaValue[] luaValueArr) {
        AppCompatActivity appCompatActivity = (AppCompatActivity) KWHzl(this.globals);
        xWF xwf = walletService;
        if (xwf == null) {
            return null;
        }
        xwf.EZpvd(appCompatActivity.getSupportFragmentManager(), new Function0<Unit>() { // from class: com.okinc.wallet.mln.service.UDWalletCoreNew.2
            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
            public Unit invoke() {
                return null;
            }
        });
        return null;
    }

    @LuaBridge
    public LuaValue[] openSelectCoinFeePage(LuaValue[] luaValueArr) {
        AppCompatActivity appCompatActivity = (AppCompatActivity) KWHzl(this.globals);
        xWF xwf = walletService;
        if (xwf == null) {
            return null;
        }
        xwf.KWHzl(appCompatActivity.getSupportFragmentManager(), new Function0<Unit>() { // from class: com.okinc.wallet.mln.service.UDWalletCoreNew.3
            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
            public Unit invoke() {
                return null;
            }
        });
        return null;
    }

    @LuaBridge
    public LuaValue[] getBalance(LuaValue[] luaValueArr) {
        xWF xwf = walletService;
        return LuaValue.rString(xwf != null ? xwf.AEQbTJ(true) : "0");
    }

    @LuaBridge
    public LuaValue[] checkFee(LuaValue[] luaValueArr) {
        xWF xwf = walletService;
        return LuaValue.rBoolean(xwf != null ? xwf.KWHzl() : false);
    }

    @LuaBridge
    public LuaValue[] checkAmt(LuaValue[] luaValueArr) {
        xWF xwf = walletService;
        return LuaValue.rBoolean(xwf != null ? xwf.OLrzqt() : false);
    }

    @LuaBridge
    public LuaValue[] getChainMeta(LuaValue[] luaValueArr) {
        xWF xwf = walletService;
        InterfaceC9731bbC interfaceC9731bbCEZpvd = xwf != null ? xwf.EZpvd() : null;
        if (interfaceC9731bbCEZpvd != null) {
            return LuaValue.rString(interfaceC9731bbCEZpvd.fJNWhG());
        }
        return LuaValue.rString("");
    }

    @LuaBridge
    public UDNativeLoader subFeeInfo(LuaValue[] luaValueArr) {
        InterfaceC58217yxC interfaceC58217yxC = this.subFeeInfoDisposable;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
        UDNativeLoader uDNativeLoader = new UDNativeLoader(this.globals, luaValueArr);
        uDNativeLoader.copydefault(new UDNativeLoader.StateListAnimator() { // from class: com.okinc.wallet.mln.service.UDWalletCoreNew.4
            @Override // com.immomo.mls.fun.ud.UDNativeLoader.StateListAnimator
            public void copydefault(final UDNativeLoader.Application application, UDNativeLoader.Activity activity) {
                if (UDWalletCoreNew.walletService != null) {
                    UDWalletCoreNew.this.subFeeInfoDisposable = UDWalletCoreNew.walletService.copydefault().AEQbTJ(new InterfaceC58227yxM<WalletDappInteractionBizService.FeeInfo>() { // from class: com.okinc.wallet.mln.service.UDWalletCoreNew.4.1
                        /* JADX DEBUG: Method merged with bridge method: accept(Ljava/lang/Object;)V */
                        @Override // o.InterfaceC58227yxM
                        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
                        public void accept(WalletDappInteractionBizService.FeeInfo feeInfo) throws Exception {
                            application.copydefault(new Gson().toJson(feeInfo));
                        }
                    });
                }
            }

            @Override // com.immomo.mls.fun.ud.UDNativeLoader.StateListAnimator
            public void OLrzqt() {
                if (UDWalletCoreNew.this.subFeeInfoDisposable != null) {
                    UDWalletCoreNew.this.subFeeInfoDisposable.dispose();
                }
            }
        });
        return uDNativeLoader;
    }

    @LuaBridge
    public UDNativeLoader submit(final LuaValue[] luaValueArr) {
        UDNativeLoader uDNativeLoader = new UDNativeLoader(this.globals, luaValueArr);
        uDNativeLoader.copydefault(new UDNativeLoader.StateListAnimator() { // from class: com.okinc.wallet.mln.service.UDWalletCoreNew.7
            @Override // com.immomo.mls.fun.ud.UDNativeLoader.StateListAnimator
            public void OLrzqt() {
            }

            @Override // com.immomo.mls.fun.ud.UDNativeLoader.StateListAnimator
            public void copydefault(final UDNativeLoader.Application application, final UDNativeLoader.Activity activity) {
                AppCompatActivity appCompatActivity = (AppCompatActivity) UDWalletCoreNew.KWHzl(UDWalletCoreNew.this.globals);
                LuaValue[] luaValueArr2 = luaValueArr;
                boolean z = luaValueArr2.length > 0 ? luaValueArr2[0].toBoolean() : false;
                if (UDWalletCoreNew.walletService != null) {
                    UDWalletCoreNew.walletService.copydefault(appCompatActivity, appCompatActivity.getSupportFragmentManager(), z).AEQbTJ(new InterfaceC58227yxM<WalletDappInteractionBizService.SubmitResult>() { // from class: com.okinc.wallet.mln.service.UDWalletCoreNew.7.2
                        /* JADX DEBUG: Method merged with bridge method: accept(Ljava/lang/Object;)V */
                        @Override // o.InterfaceC58227yxM
                        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
                        public void accept(WalletDappInteractionBizService.SubmitResult submitResult) throws Exception {
                            if (submitResult.getCode() != null && submitResult.getCode().intValue() == 0) {
                                if (submitResult.isBtcMint()) {
                                    application.copydefault(UDWalletCoreNew.this.EZpvd(submitResult));
                                } else if (submitResult.isEvmBatch()) {
                                    JSONObject jSONObject = new JSONObject();
                                    jSONObject.put("txId", submitResult.getTxId() == null ? "" : UDWalletCoreNew.this.copydefault(submitResult.getTxId()));
                                    jSONObject.put("txHash", submitResult.getTxHash() == null ? "" : UDWalletCoreNew.this.copydefault(submitResult.getTxHash()));
                                    jSONObject.put("signTx", submitResult.getSignTx() != null ? UDWalletCoreNew.this.copydefault(submitResult.getSignTx()) : "");
                                    application.copydefault(jSONObject.toString());
                                } else if (submitResult.getTxHash() != null && submitResult.getTxHash().startsWith("[") && submitResult.getTxId() != null) {
                                    try {
                                        JSONObject jSONObject2 = new JSONObject(submitResult.getTxId());
                                        JSONObject jSONObject3 = new JSONObject();
                                        jSONObject3.put("txHash", UDWalletCoreNew.this.copydefault(submitResult.getTxHash()));
                                        jSONObject3.put("orderIds", UDWalletCoreNew.this.sb.toString());
                                        jSONObject3.put("batchId", jSONObject2.get("batchId"));
                                        application.copydefault(jSONObject3.toString());
                                    } catch (Exception unused) {
                                        application.copydefault(UDWalletCoreNew.this.copydefault(submitResult.getTxHash()));
                                    }
                                } else {
                                    application.copydefault(UDWalletCoreNew.this.copydefault(submitResult.getTxHash()));
                                }
                                C10350bmm.AEQbTJ.copydefault(true);
                                return;
                            }
                            if (submitResult.getCode().intValue() == 2) {
                                activity.KWHzl(submitResult.getCode().intValue(), C43246rlf.OLrzqt.valueOf().getString(C13754dXa.FragmentManager.DDDCac));
                            } else if (submitResult.getCode().intValue() == 8) {
                                activity.KWHzl(submitResult.getCode().intValue(), null);
                            } else {
                                activity.KWHzl(submitResult.getCode().intValue(), submitResult.getErrMsg());
                            }
                            C10350bmm.AEQbTJ.copydefault(true);
                        }
                    }, new InterfaceC58227yxM<Throwable>() { // from class: com.okinc.wallet.mln.service.UDWalletCoreNew.7.3
                        /* JADX DEBUG: Method merged with bridge method: accept(Ljava/lang/Object;)V */
                        @Override // o.InterfaceC58227yxM
                        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
                        public void accept(Throwable th) throws Exception {
                            pUU.AEQbTJ("UDWalletCoreNew", th);
                        }
                    });
                }
            }
        });
        return uDNativeLoader;
    }

    public final String copydefault(String str) {
        JsonElement reader = JsonParser.parseReader(new StringReader(str));
        return (!reader.isJsonArray() || reader.getAsJsonArray().size() < 1) ? str : reader.getAsJsonArray().get(0).getAsString();
    }

    public final Integer EZpvd(Object obj) {
        JSONArray jSONArray;
        int iCopydefault;
        String string = "";
        try {
            JSONObject jSONObject = new JSONObject(C33490mxT.OLrzqt(obj));
            string = jSONObject.getString("data");
            jSONArray = jSONObject.getJSONArray("dataList");
        } catch (Exception unused) {
            jSONArray = null;
        }
        if (jSONArray != null) {
            HashSet hashSet = new HashSet();
            for (int i = 0; i < jSONArray.length(); i++) {
                try {
                    iCopydefault = copydefault(jSONArray.get(i));
                } catch (JSONException e) {
                    e.printStackTrace();
                    iCopydefault = 0;
                }
                hashSet.add(Integer.valueOf(iCopydefault));
            }
            new HashMap().put("data", obj);
            if (hashSet.size() == 1) {
                return (Integer) hashSet.iterator().next();
            }
            return 3;
        }
        return Integer.valueOf(copydefault((Object) string));
    }

    public final int copydefault(Object obj) {
        String strSubstring;
        try {
            strSubstring = new JSONObject(C33490mxT.OLrzqt(obj)).getString("data");
        } catch (Exception unused) {
            strSubstring = "";
        }
        if (strSubstring.equals("") || strSubstring.equals(EIP1271Verifier.hexPrefix)) {
            return 1;
        }
        if (strSubstring.startsWith(EIP1271Verifier.hexPrefix)) {
            strSubstring = strSubstring.substring(2);
        }
        return strSubstring.startsWith("095ea7b3") ? 2 : 3;
    }

    public final String EZpvd(WalletDappInteractionBizService.SubmitResult submitResult) {
        if (submitResult == null || TextUtils.isEmpty(submitResult.getTxId()) || TextUtils.isEmpty(submitResult.getTxHash())) {
            return "";
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("commitResult", submitResult.getTxId());
            JSONArray jSONArray = new JSONArray();
            JSONArray jSONArray2 = new JSONArray(submitResult.getTxHash());
            for (int i = 0; i < jSONArray2.length(); i++) {
                if (i == 0) {
                    jSONObject.put("txhash", jSONArray2.getString(i));
                } else {
                    jSONArray.put(jSONArray2.getString(i));
                }
            }
            jSONObject.put("saveTxResultIndex", jSONArray);
            return jSONObject.toString();
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:71:0x0120 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:78:0x00f0 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0114 A[Catch: Exception -> 0x014a, TRY_ENTER, TryCatch #2 {Exception -> 0x014a, blocks: (B:41:0x00e5, B:53:0x0114, B:55:0x011b, B:57:0x0124, B:59:0x012b, B:60:0x0131, B:62:0x0137, B:63:0x013c, B:65:0x0143), top: B:80:0x00e5 }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00f0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r35v0 */
    /* JADX WARN: Type inference failed for: r35v1, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r35v2 */
    /* JADX WARN: Type inference failed for: r4v10, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r4v11, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r4v12, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r4v13, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v4, types: [int] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v9 */
    @LuaBridge
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public UDNativeLoader initInteractionService(LuaValue[] luaValueArr) {
        String strSubstring;
        JSONObject jSONObject;
        int i;
        String strOptString;
        final long j;
        PlatformItem platformItem;
        UDImageInfo uDImageInfo;
        String str;
        String strCopydefault;
        char c;
        ?? r35;
        JSONObject jSONObject2;
        String strCopydefault2;
        LuaValue luaValue;
        walletService = null;
        boolean z = false;
        final Object objEZpvd = C7910asj.EZpvd(luaValueArr[0]);
        int iIntValue = EZpvd(objEZpvd).intValue();
        String strOLrzqt = C33490mxT.OLrzqt(objEZpvd);
        try {
            JSONObject jSONObject3 = new JSONObject(strOLrzqt);
            strSubstring = jSONObject3.getString("data");
            try {
                jSONObject3.getString("to");
            } catch (Exception unused) {
            }
        } catch (Exception unused2) {
            strSubstring = "";
        }
        if (strSubstring.equals("") || strSubstring.equals(EIP1271Verifier.hexPrefix)) {
            iIntValue = 1;
        } else {
            if (strSubstring.startsWith(EIP1271Verifier.hexPrefix)) {
                strSubstring = strSubstring.substring(2);
            }
            if (strSubstring.startsWith("095ea7b3")) {
                iIntValue = 2;
            }
        }
        try {
            jSONObject = new JSONObject(C33490mxT.OLrzqt(C7910asj.EZpvd(luaValueArr[5])));
        } catch (Exception unused3) {
            jSONObject = null;
        }
        try {
            i = jSONObject.getInt("biz");
        } catch (Exception unused4) {
            i = 1;
            strOptString = null;
            if (luaValueArr.length > 6) {
                z = luaValue.toBoolean();
            }
            boolean z2 = z;
            j = luaValueArr[2].toLong();
            String strKWHzl = UDWalletCore.KWHzl(j);
            platformItem = new PlatformItem();
            int iValueOf = 3;
            platformItem.setPlatform(luaValueArr[3].toJavaString());
            uDImageInfo = (UDImageInfo) luaValueArr[4];
            if (uDImageInfo != null) {
                platformItem.setLogo(strCopydefault2);
            }
            platformItem.setNetwork(strKWHzl);
            C48787ucK c48787ucK = C48787ucK.AEQbTJ;
            String strCopydefault3 = c48787ucK.copydefault("gasLimitConfig.nft", "");
            String strCopydefault4 = c48787ucK.copydefault("gasPriceConfig.nft", "");
            if (j == 1) {
            }
            jSONObject2 = new JSONObject(strOLrzqt);
            if (jSONObject2.getInt("scenario") != 4) {
            }
            r35 = iValueOf;
            c = 1;
            final DappInteractionArgs dappInteractionArgs = new DappInteractionArgs(luaValueArr[c].toJavaString(), "", String.valueOf(j), platformItem, strOLrzqt, null, "dapp", 4, null, null, null, null, false, false, null, z2, strCopydefault, str, null, r35, null, null, null, null, null, null, 2, strOptString, null, SolanaSignType.NORMAL, null, null);
            UDNativeLoader uDNativeLoader = new UDNativeLoader(this.globals, luaValueArr);
            final int i2 = iIntValue;
            final int i3 = i;
            final JSONObject jSONObject4 = jSONObject;
            final String str2 = strOLrzqt;
            uDNativeLoader.copydefault(new UDNativeLoader.StateListAnimator() { // from class: com.okinc.wallet.mln.service.UDWalletCoreNew.6
                public InterfaceC58217yxC KWHzl;

                @Override // com.immomo.mls.fun.ud.UDNativeLoader.StateListAnimator
                public void copydefault(final UDNativeLoader.Application application, final UDNativeLoader.Activity activity) {
                    StringBuilder sb = UDWalletCoreNew.this.sb;
                    sb.delete(0, sb.length());
                    this.KWHzl = ((WalletDappInteractionBizService) C43248rlh.KWHzl.AEQbTJ(WalletDappInteractionBizService.class)).EZpvd(UDWalletCoreNew.KWHzl(UDWalletCoreNew.this.globals), i2, dappInteractionArgs, new Function1<NewCallbackBean, AbstractC58185ywX<ResponseData<String>>>() { // from class: com.okinc.wallet.mln.service.UDWalletCoreNew.6.4
                        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
                        @Override // kotlin.jvm.functions.Function1
                        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
                        public AbstractC58185ywX<ResponseData<String>> invoke(NewCallbackBean newCallbackBean) {
                            Integer protocolId = newCallbackBean.getProtocolId();
                            String txType = newCallbackBean.getTxType();
                            C57104ycC c57104ycC = new C57104ycC();
                            if (i3 == 2) {
                                Map<String, String> headerMap = newCallbackBean.getHeaderMap();
                                AnonymousClass6 anonymousClass6 = AnonymousClass6.this;
                                return c57104ycC.KWHzl(headerMap, UDWalletCore.OLrzqt(newCallbackBean, jSONObject4, UDWalletCoreNew.this.sb));
                            }
                            boolean z3 = (txType == null || protocolId == null || (!txType.equals(Integer.toString(52)) && !txType.equals(Integer.toString(22))) || (protocolId.intValue() != 2 && protocolId.intValue() != 8 && protocolId.intValue() != 13)) ? false : true;
                            boolean z4 = txType != null && protocolId != null && txType.equals(Integer.toString(74)) && protocolId.intValue() == 13;
                            if (Boolean.valueOf(z3).booleanValue() || Boolean.valueOf(z4).booleanValue()) {
                                return c57104ycC.copydefault(newCallbackBean.getHeaderMap(), UDWalletCore.copydefault(newCallbackBean, str2));
                            }
                            long j2 = j;
                            if ((j2 == 0 || j2 == 70000061) && newCallbackBean.isBatch()) {
                                if (newCallbackBean.isBtcMint()) {
                                    Map<String, String> headerMap2 = newCallbackBean.getHeaderMap();
                                    AnonymousClass6 anonymousClass62 = AnonymousClass6.this;
                                    return c57104ycC.AEQbTJ(headerMap2, UDWalletCore.copydefault(newCallbackBean, jSONObject4, C33490mxT.OLrzqt(objEZpvd), j));
                                }
                                if (newCallbackBean.isBatch()) {
                                    Map<String, String> headerMap3 = newCallbackBean.getHeaderMap();
                                    AnonymousClass6 anonymousClass63 = AnonymousClass6.this;
                                    return c57104ycC.OLrzqt(headerMap3, UDWalletCore.OLrzqt(newCallbackBean, jSONObject4, UDWalletCoreNew.this.sb, j));
                                }
                            }
                            Map<String, String> headerMap4 = newCallbackBean.getHeaderMap();
                            AnonymousClass6 anonymousClass64 = AnonymousClass6.this;
                            return c57104ycC.EZpvd(headerMap4, UDWalletCore.AEQbTJ(newCallbackBean, jSONObject4, UDWalletCoreNew.this.sb), newCallbackBean.isBatch());
                        }
                    }).AEQbTJ(new InterfaceC58227yxM<ResponseData<xWF>>() { // from class: com.okinc.wallet.mln.service.UDWalletCoreNew.6.2
                        /* JADX DEBUG: Method merged with bridge method: accept(Ljava/lang/Object;)V */
                        @Override // o.InterfaceC58227yxM
                        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
                        public void accept(ResponseData<xWF> responseData) throws Exception {
                            UDWalletCoreNew.walletService = responseData.getData();
                            if (responseData.getCode() == 0) {
                                application.copydefault(null);
                            } else {
                                activity.KWHzl(responseData.getCode(), responseData.getMsg());
                            }
                        }
                    });
                }

                @Override // com.immomo.mls.fun.ud.UDNativeLoader.StateListAnimator
                public void OLrzqt() {
                    InterfaceC58217yxC interfaceC58217yxC = this.KWHzl;
                    if (interfaceC58217yxC != null) {
                        interfaceC58217yxC.dispose();
                    }
                }
            });
            return uDNativeLoader;
        }
        try {
            strOptString = jSONObject.optString("txToastCheckPayload");
        } catch (Exception unused5) {
            strOptString = null;
        }
        if (luaValueArr.length > 6 && (luaValue = luaValueArr[6]) != null) {
            z = luaValue.toBoolean();
        }
        boolean z22 = z;
        j = luaValueArr[2].toLong();
        String strKWHzl2 = UDWalletCore.KWHzl(j);
        platformItem = new PlatformItem();
        int iValueOf2 = 3;
        platformItem.setPlatform(luaValueArr[3].toJavaString());
        uDImageInfo = (UDImageInfo) luaValueArr[4];
        if (uDImageInfo != null && (strCopydefault2 = UDWalletCore.copydefault(C43246rlf.OLrzqt.valueOf(), uDImageInfo)) != null) {
            platformItem.setLogo(strCopydefault2);
        }
        platformItem.setNetwork(strKWHzl2);
        C48787ucK c48787ucK2 = C48787ucK.AEQbTJ;
        String strCopydefault32 = c48787ucK2.copydefault("gasLimitConfig.nft", "");
        String strCopydefault42 = c48787ucK2.copydefault("gasPriceConfig.nft", "");
        if (j == 1) {
            String strCopydefault5 = c48787ucK2.copydefault("gasLimitConfig.nftOther", "");
            strCopydefault = c48787ucK2.copydefault("gasPriceConfig.nftOther", "");
            str = strCopydefault5;
        } else {
            str = strCopydefault32;
            strCopydefault = strCopydefault42;
        }
        try {
            jSONObject2 = new JSONObject(strOLrzqt);
        } catch (Exception unused6) {
        }
        if (jSONObject2.getInt("scenario") != 4) {
            try {
                if (jSONObject2.has("protocolId") && jSONObject2.getInt("protocolId") == 13) {
                    iValueOf2 = 9;
                } else {
                    iValueOf2 = 3;
                    try {
                        strOLrzqt = EZpvd(strOLrzqt);
                        iValueOf2 = 3;
                    } catch (Exception unused7) {
                    }
                }
            } catch (Exception unused8) {
                iValueOf2 = Integer.valueOf((int) iValueOf2);
            }
        } else if (jSONObject2.getInt("scenario") == 1) {
            iValueOf2 = 5;
        } else if (jSONObject2.getInt("scenario") == 2) {
            iValueOf2 = 6;
        } else if (jSONObject2.getInt("scenario") == 3) {
            iValueOf2 = 4;
        } else {
            if (jSONObject2.getInt("scenario") == 6) {
                iValueOf2 = 8;
            }
            c = 1;
            r35 = 0;
            final DappInteractionArgs dappInteractionArgs2 = new DappInteractionArgs(luaValueArr[c].toJavaString(), "", String.valueOf(j), platformItem, strOLrzqt, null, "dapp", 4, null, null, null, null, false, false, null, z22, strCopydefault, str, null, r35, null, null, null, null, null, null, 2, strOptString, null, SolanaSignType.NORMAL, null, null);
            UDNativeLoader uDNativeLoader2 = new UDNativeLoader(this.globals, luaValueArr);
            final int i22 = iIntValue;
            final int i32 = i;
            final JSONObject jSONObject42 = jSONObject;
            final String str22 = strOLrzqt;
            uDNativeLoader2.copydefault(new UDNativeLoader.StateListAnimator() { // from class: com.okinc.wallet.mln.service.UDWalletCoreNew.6
                public InterfaceC58217yxC KWHzl;

                @Override // com.immomo.mls.fun.ud.UDNativeLoader.StateListAnimator
                public void copydefault(final UDNativeLoader.Application application, final UDNativeLoader.Activity activity) {
                    StringBuilder sb = UDWalletCoreNew.this.sb;
                    sb.delete(0, sb.length());
                    this.KWHzl = ((WalletDappInteractionBizService) C43248rlh.KWHzl.AEQbTJ(WalletDappInteractionBizService.class)).EZpvd(UDWalletCoreNew.KWHzl(UDWalletCoreNew.this.globals), i22, dappInteractionArgs2, new Function1<NewCallbackBean, AbstractC58185ywX<ResponseData<String>>>() { // from class: com.okinc.wallet.mln.service.UDWalletCoreNew.6.4
                        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
                        @Override // kotlin.jvm.functions.Function1
                        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
                        public AbstractC58185ywX<ResponseData<String>> invoke(NewCallbackBean newCallbackBean) {
                            Integer protocolId = newCallbackBean.getProtocolId();
                            String txType = newCallbackBean.getTxType();
                            C57104ycC c57104ycC = new C57104ycC();
                            if (i32 == 2) {
                                Map<String, String> headerMap = newCallbackBean.getHeaderMap();
                                AnonymousClass6 anonymousClass6 = AnonymousClass6.this;
                                return c57104ycC.KWHzl(headerMap, UDWalletCore.OLrzqt(newCallbackBean, jSONObject42, UDWalletCoreNew.this.sb));
                            }
                            boolean z3 = (txType == null || protocolId == null || (!txType.equals(Integer.toString(52)) && !txType.equals(Integer.toString(22))) || (protocolId.intValue() != 2 && protocolId.intValue() != 8 && protocolId.intValue() != 13)) ? false : true;
                            boolean z4 = txType != null && protocolId != null && txType.equals(Integer.toString(74)) && protocolId.intValue() == 13;
                            if (Boolean.valueOf(z3).booleanValue() || Boolean.valueOf(z4).booleanValue()) {
                                return c57104ycC.copydefault(newCallbackBean.getHeaderMap(), UDWalletCore.copydefault(newCallbackBean, str22));
                            }
                            long j2 = j;
                            if ((j2 == 0 || j2 == 70000061) && newCallbackBean.isBatch()) {
                                if (newCallbackBean.isBtcMint()) {
                                    Map<String, String> headerMap2 = newCallbackBean.getHeaderMap();
                                    AnonymousClass6 anonymousClass62 = AnonymousClass6.this;
                                    return c57104ycC.AEQbTJ(headerMap2, UDWalletCore.copydefault(newCallbackBean, jSONObject42, C33490mxT.OLrzqt(objEZpvd), j));
                                }
                                if (newCallbackBean.isBatch()) {
                                    Map<String, String> headerMap3 = newCallbackBean.getHeaderMap();
                                    AnonymousClass6 anonymousClass63 = AnonymousClass6.this;
                                    return c57104ycC.OLrzqt(headerMap3, UDWalletCore.OLrzqt(newCallbackBean, jSONObject42, UDWalletCoreNew.this.sb, j));
                                }
                            }
                            Map<String, String> headerMap4 = newCallbackBean.getHeaderMap();
                            AnonymousClass6 anonymousClass64 = AnonymousClass6.this;
                            return c57104ycC.EZpvd(headerMap4, UDWalletCore.AEQbTJ(newCallbackBean, jSONObject42, UDWalletCoreNew.this.sb), newCallbackBean.isBatch());
                        }
                    }).AEQbTJ(new InterfaceC58227yxM<ResponseData<xWF>>() { // from class: com.okinc.wallet.mln.service.UDWalletCoreNew.6.2
                        /* JADX DEBUG: Method merged with bridge method: accept(Ljava/lang/Object;)V */
                        @Override // o.InterfaceC58227yxM
                        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
                        public void accept(ResponseData<xWF> responseData) throws Exception {
                            UDWalletCoreNew.walletService = responseData.getData();
                            if (responseData.getCode() == 0) {
                                application.copydefault(null);
                            } else {
                                activity.KWHzl(responseData.getCode(), responseData.getMsg());
                            }
                        }
                    });
                }

                @Override // com.immomo.mls.fun.ud.UDNativeLoader.StateListAnimator
                public void OLrzqt() {
                    InterfaceC58217yxC interfaceC58217yxC = this.KWHzl;
                    if (interfaceC58217yxC != null) {
                        interfaceC58217yxC.dispose();
                    }
                }
            });
            return uDNativeLoader2;
        }
        r35 = iValueOf2;
        c = 1;
        final DappInteractionArgs dappInteractionArgs22 = new DappInteractionArgs(luaValueArr[c].toJavaString(), "", String.valueOf(j), platformItem, strOLrzqt, null, "dapp", 4, null, null, null, null, false, false, null, z22, strCopydefault, str, null, r35, null, null, null, null, null, null, 2, strOptString, null, SolanaSignType.NORMAL, null, null);
        UDNativeLoader uDNativeLoader22 = new UDNativeLoader(this.globals, luaValueArr);
        final int i222 = iIntValue;
        final int i322 = i;
        final JSONObject jSONObject422 = jSONObject;
        final String str222 = strOLrzqt;
        uDNativeLoader22.copydefault(new UDNativeLoader.StateListAnimator() { // from class: com.okinc.wallet.mln.service.UDWalletCoreNew.6
            public InterfaceC58217yxC KWHzl;

            @Override // com.immomo.mls.fun.ud.UDNativeLoader.StateListAnimator
            public void copydefault(final UDNativeLoader.Application application, final UDNativeLoader.Activity activity) {
                StringBuilder sb = UDWalletCoreNew.this.sb;
                sb.delete(0, sb.length());
                this.KWHzl = ((WalletDappInteractionBizService) C43248rlh.KWHzl.AEQbTJ(WalletDappInteractionBizService.class)).EZpvd(UDWalletCoreNew.KWHzl(UDWalletCoreNew.this.globals), i222, dappInteractionArgs22, new Function1<NewCallbackBean, AbstractC58185ywX<ResponseData<String>>>() { // from class: com.okinc.wallet.mln.service.UDWalletCoreNew.6.4
                    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
                    public AbstractC58185ywX<ResponseData<String>> invoke(NewCallbackBean newCallbackBean) {
                        Integer protocolId = newCallbackBean.getProtocolId();
                        String txType = newCallbackBean.getTxType();
                        C57104ycC c57104ycC = new C57104ycC();
                        if (i322 == 2) {
                            Map<String, String> headerMap = newCallbackBean.getHeaderMap();
                            AnonymousClass6 anonymousClass6 = AnonymousClass6.this;
                            return c57104ycC.KWHzl(headerMap, UDWalletCore.OLrzqt(newCallbackBean, jSONObject422, UDWalletCoreNew.this.sb));
                        }
                        boolean z3 = (txType == null || protocolId == null || (!txType.equals(Integer.toString(52)) && !txType.equals(Integer.toString(22))) || (protocolId.intValue() != 2 && protocolId.intValue() != 8 && protocolId.intValue() != 13)) ? false : true;
                        boolean z4 = txType != null && protocolId != null && txType.equals(Integer.toString(74)) && protocolId.intValue() == 13;
                        if (Boolean.valueOf(z3).booleanValue() || Boolean.valueOf(z4).booleanValue()) {
                            return c57104ycC.copydefault(newCallbackBean.getHeaderMap(), UDWalletCore.copydefault(newCallbackBean, str222));
                        }
                        long j2 = j;
                        if ((j2 == 0 || j2 == 70000061) && newCallbackBean.isBatch()) {
                            if (newCallbackBean.isBtcMint()) {
                                Map<String, String> headerMap2 = newCallbackBean.getHeaderMap();
                                AnonymousClass6 anonymousClass62 = AnonymousClass6.this;
                                return c57104ycC.AEQbTJ(headerMap2, UDWalletCore.copydefault(newCallbackBean, jSONObject422, C33490mxT.OLrzqt(objEZpvd), j));
                            }
                            if (newCallbackBean.isBatch()) {
                                Map<String, String> headerMap3 = newCallbackBean.getHeaderMap();
                                AnonymousClass6 anonymousClass63 = AnonymousClass6.this;
                                return c57104ycC.OLrzqt(headerMap3, UDWalletCore.OLrzqt(newCallbackBean, jSONObject422, UDWalletCoreNew.this.sb, j));
                            }
                        }
                        Map<String, String> headerMap4 = newCallbackBean.getHeaderMap();
                        AnonymousClass6 anonymousClass64 = AnonymousClass6.this;
                        return c57104ycC.EZpvd(headerMap4, UDWalletCore.AEQbTJ(newCallbackBean, jSONObject422, UDWalletCoreNew.this.sb), newCallbackBean.isBatch());
                    }
                }).AEQbTJ(new InterfaceC58227yxM<ResponseData<xWF>>() { // from class: com.okinc.wallet.mln.service.UDWalletCoreNew.6.2
                    /* JADX DEBUG: Method merged with bridge method: accept(Ljava/lang/Object;)V */
                    @Override // o.InterfaceC58227yxM
                    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
                    public void accept(ResponseData<xWF> responseData) throws Exception {
                        UDWalletCoreNew.walletService = responseData.getData();
                        if (responseData.getCode() == 0) {
                            application.copydefault(null);
                        } else {
                            activity.KWHzl(responseData.getCode(), responseData.getMsg());
                        }
                    }
                });
            }

            @Override // com.immomo.mls.fun.ud.UDNativeLoader.StateListAnimator
            public void OLrzqt() {
                InterfaceC58217yxC interfaceC58217yxC = this.KWHzl;
                if (interfaceC58217yxC != null) {
                    interfaceC58217yxC.dispose();
                }
            }
        });
        return uDNativeLoader22;
    }

    public String EZpvd(String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject(str);
            jSONObject.put("inscribeType", jSONObject2.getInt("inscribeType"));
            if (jSONObject2.has("from")) {
                jSONObject.put("from", jSONObject2.getString("from"));
            }
            if (jSONObject2.has("to")) {
                jSONObject.put("to", jSONObject2.getString("to"));
            }
            if (jSONObject2.has("coinAmount")) {
                jSONObject.put("coinAmount", jSONObject2.getString("coinAmount"));
            }
            if (jSONObject2.has("coinId")) {
                jSONObject.put("coinId", jSONObject2.getString("coinId"));
            }
            if (jSONObject2.has(RemoteMessageConst.Notification.TICKER)) {
                jSONObject.put(RemoteMessageConst.Notification.TICKER, jSONObject2.getString(RemoteMessageConst.Notification.TICKER));
            }
            JSONArray jSONArray = new JSONArray();
            for (int i = 0; i < jSONObject2.getJSONArray("mintItemList").length(); i++) {
                JSONObject jSONObject3 = new JSONObject();
                JSONObject jSONObject4 = jSONObject2.getJSONArray("mintItemList").getJSONObject(i);
                jSONObject3.put("contentType", jSONObject4.getString("contentType"));
                jSONObject3.put("content", jSONObject4.getString("body"));
                jSONObject3.put("destinationAddress", jSONObject4.getString(FirebaseAnalytics.Param.DESTINATION));
                if (jSONObject4.has("isHex")) {
                    jSONObject3.put("isHex", jSONObject4.getBoolean("isHex"));
                }
                jSONArray.put(jSONObject3);
            }
            jSONObject.put("inscribeList", jSONArray);
            jSONObject.put("protocolId", jSONObject2.getString("protocolId"));
            jSONObject.put("inscribeOutputSat", jSONObject2.getString("outputSat"));
            return jSONObject.toString();
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    @LuaBridge
    public UDNativeLoader initWalletDappSignBizService(LuaValue[] luaValueArr) {
        SignType signType;
        String strCopydefault;
        String javaString = (luaValueArr.length <= 0 || !luaValueArr[0].isString()) ? null : luaValueArr[0].toJavaString();
        if (javaString != null) {
            javaString = javaString.replaceAll("\\\\", "");
        }
        String str = javaString;
        String javaString2 = (luaValueArr.length <= 1 || !luaValueArr[1].isString()) ? null : luaValueArr[1].toJavaString();
        long j = luaValueArr[2].toLong();
        String javaString3 = (luaValueArr.length <= 3 || !luaValueArr[3].isString()) ? null : luaValueArr[3].toJavaString();
        UDImageInfo uDImageInfo = (luaValueArr.length <= 4 || luaValueArr[4].isNil()) ? null : (UDImageInfo) C8017aul.AEQbTJ(luaValueArr[4], UDImageInfo.class);
        boolean z = luaValueArr.length > 5 ? luaValueArr[5].toBoolean() : false;
        String strKWHzl = UDWalletCore.KWHzl(j);
        PlatformItem platformItem = new PlatformItem();
        platformItem.setPlatform(javaString3 != null ? javaString3 : "");
        if (uDImageInfo != null && (strCopydefault = UDWalletCore.copydefault(C43246rlf.OLrzqt.valueOf(), uDImageInfo)) != null) {
            platformItem.setLogo(strCopydefault);
        }
        platformItem.setNetwork(strKWHzl);
        if (str != null) {
            try {
                JsonObject jsonObjectOLrzqt = C33490mxT.OLrzqt(str);
                signType = (jsonObjectOLrzqt == null || jsonObjectOLrzqt.get("domainSeparator") != null) ? null : SignType.TYPED_MESSAGE;
            } catch (Exception unused) {
                signType = null;
            }
        } else {
            signType = null;
        }
        final DappSignArgs dappSignArgs = new DappSignArgs(javaString2, String.valueOf(j), platformItem, str, !z, 4, "nft", null, false, false, null, signType, null, null, null, false, MpcSignType.NORMAL);
        UDNativeLoader uDNativeLoader = new UDNativeLoader(this.globals, (Object) null);
        uDNativeLoader.copydefault(new UDNativeLoader.StateListAnimator() { // from class: com.okinc.wallet.mln.service.UDWalletCoreNew.9
            @Override // com.immomo.mls.fun.ud.UDNativeLoader.StateListAnimator
            public void OLrzqt() {
            }

            @Override // com.immomo.mls.fun.ud.UDNativeLoader.StateListAnimator
            public void copydefault(final UDNativeLoader.Application application, UDNativeLoader.Activity activity) {
                ((xWG) C43248rlh.KWHzl.AEQbTJ(xWG.class)).KWHzl(dappSignArgs).copydefault(new InterfaceC58227yxM<Boolean>() { // from class: com.okinc.wallet.mln.service.UDWalletCoreNew.9.4
                    /* JADX DEBUG: Method merged with bridge method: accept(Ljava/lang/Object;)V */
                    @Override // o.InterfaceC58227yxM
                    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
                    public void accept(Boolean bool) throws Exception {
                        application.copydefault(bool.booleanValue() ? LuaValue.True() : LuaValue.False());
                    }
                });
            }
        });
        return uDNativeLoader;
    }

    @LuaBridge
    public UDNativeLoader riskAddressCheck(final LuaValue[] luaValueArr) {
        UDNativeLoader uDNativeLoader = new UDNativeLoader(this.globals, luaValueArr);
        uDNativeLoader.copydefault(new UDNativeLoader.StateListAnimator() { // from class: com.okinc.wallet.mln.service.UDWalletCoreNew.8
            @Override // com.immomo.mls.fun.ud.UDNativeLoader.StateListAnimator
            public void OLrzqt() {
            }

            @Override // com.immomo.mls.fun.ud.UDNativeLoader.StateListAnimator
            public void copydefault(final UDNativeLoader.Application application, UDNativeLoader.Activity activity) {
                AppCompatActivity appCompatActivity = (AppCompatActivity) UDWalletCoreNew.KWHzl(UDWalletCoreNew.this.globals);
                if (UDWalletCoreNew.walletService != null) {
                    UDWalletCoreNew.walletService.OLrzqt(appCompatActivity, appCompatActivity.getSupportFragmentManager(), luaValueArr[0].toJavaString()).AEQbTJ(new InterfaceC58227yxM<Boolean>() { // from class: com.okinc.wallet.mln.service.UDWalletCoreNew.8.4
                        /* JADX DEBUG: Method merged with bridge method: accept(Ljava/lang/Object;)V */
                        @Override // o.InterfaceC58227yxM
                        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
                        public void accept(Boolean bool) throws Exception {
                            if (bool.booleanValue()) {
                                application.copydefault(LuaValue.True());
                            } else {
                                application.copydefault(LuaValue.False());
                            }
                        }
                    });
                }
            }
        });
        return uDNativeLoader;
    }

    @LuaBridge
    public UDNativeLoader submitSign(final LuaValue[] luaValueArr) {
        UDNativeLoader uDNativeLoader = new UDNativeLoader(this.globals, luaValueArr);
        uDNativeLoader.copydefault(new UDNativeLoader.StateListAnimator() { // from class: com.okinc.wallet.mln.service.UDWalletCoreNew.10
            @Override // com.immomo.mls.fun.ud.UDNativeLoader.StateListAnimator
            public void OLrzqt() {
            }

            @Override // com.immomo.mls.fun.ud.UDNativeLoader.StateListAnimator
            public void copydefault(final UDNativeLoader.Application application, final UDNativeLoader.Activity activity) {
                AppCompatActivity appCompatActivity = (AppCompatActivity) UDWalletCoreNew.KWHzl(UDWalletCoreNew.this.globals);
                LuaValue[] luaValueArr2 = luaValueArr;
                ((xWG) C43248rlh.KWHzl.AEQbTJ(xWG.class)).KWHzl(appCompatActivity, appCompatActivity.getSupportFragmentManager(), luaValueArr2.length > 0 ? luaValueArr2[0].toBoolean() : false).AEQbTJ(new InterfaceC58227yxM<WalletDappInteractionBizService.SubmitResult>() { // from class: com.okinc.wallet.mln.service.UDWalletCoreNew.10.1
                    /* JADX DEBUG: Method merged with bridge method: accept(Ljava/lang/Object;)V */
                    @Override // o.InterfaceC58227yxM
                    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
                    public void accept(WalletDappInteractionBizService.SubmitResult submitResult) throws Exception {
                        if (submitResult.getCode().intValue() == 0) {
                            application.copydefault(submitResult.getSignTx());
                            return;
                        }
                        if (submitResult.getCode().intValue() == 2) {
                            activity.KWHzl(submitResult.getCode().intValue(), C43246rlf.OLrzqt.valueOf().getString(C13754dXa.FragmentManager.DDDCac));
                        } else if (submitResult.getCode().intValue() == 8) {
                            activity.KWHzl(submitResult.getCode().intValue(), null);
                        } else {
                            activity.KWHzl(submitResult.getCode().intValue(), submitResult.getErrMsg());
                        }
                    }
                });
            }
        });
        return uDNativeLoader;
    }

    @LuaBridge
    public UDNativeLoader getAllBTCAddressInfosWithWalletId(LuaValue[] luaValueArr) {
        LuaValue luaValue;
        if (luaValueArr == null || luaValueArr.length < 1 || (luaValue = luaValueArr[0]) == null) {
            return null;
        }
        final String javaString = luaValue.toJavaString();
        if (TextUtils.isEmpty(javaString)) {
            return null;
        }
        final long j = luaValueArr.length > 1 ? luaValueArr[1].toLong() : 0L;
        UDNativeLoader uDNativeLoader = new UDNativeLoader(this.globals, luaValueArr);
        uDNativeLoader.copydefault(new UDNativeLoader.StateListAnimator() { // from class: com.okinc.wallet.mln.service.UDWalletCoreNew.12
            public InterfaceC58217yxC KWHzl;

            @Override // com.immomo.mls.fun.ud.UDNativeLoader.StateListAnimator
            public void copydefault(final UDNativeLoader.Application application, final UDNativeLoader.Activity activity) {
                this.KWHzl = ((WalletDappInteractionBizService) C43248rlh.KWHzl.AEQbTJ(WalletDappInteractionBizService.class)).copydefault(javaString, j, null, null).KWHzl(yBP.AEQbTJ()).AEQbTJ(new InterfaceC58229yxO<List<WalletBtcAddressBean>, JSONArray>() { // from class: com.okinc.wallet.mln.service.UDWalletCoreNew.12.5
                    /* JADX DEBUG: Method merged with bridge method: apply(Ljava/lang/Object;)Ljava/lang/Object; */
                    @Override // o.InterfaceC58229yxO
                    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
                    public JSONArray apply(List<WalletBtcAddressBean> list) throws Exception {
                        JSONArray jSONArray = new JSONArray();
                        if (list.isEmpty()) {
                            return jSONArray;
                        }
                        Iterator<WalletBtcAddressBean> it = list.iterator();
                        while (it.hasNext()) {
                            jSONArray.put(UDWalletCoreNew.this.OLrzqt(it.next()));
                        }
                        return jSONArray;
                    }
                }).KWHzl(C58266yxz.OLrzqt()).AEQbTJ(new InterfaceC58227yxM<JSONArray>() { // from class: com.okinc.wallet.mln.service.UDWalletCoreNew.12.3
                    /* JADX DEBUG: Method merged with bridge method: accept(Ljava/lang/Object;)V */
                    @Override // o.InterfaceC58227yxM
                    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
                    public void accept(JSONArray jSONArray) throws Exception {
                        application.copydefault(C7869arv.KWHzl(UDWalletCoreNew.this.globals, jSONArray));
                    }
                }, new InterfaceC58227yxM<Throwable>() { // from class: com.okinc.wallet.mln.service.UDWalletCoreNew.12.4
                    /* JADX DEBUG: Method merged with bridge method: accept(Ljava/lang/Object;)V */
                    @Override // o.InterfaceC58227yxM
                    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
                    public void accept(Throwable th) throws Exception {
                        activity.KWHzl(-1, th != null ? th.getMessage() : "access btc info failed");
                    }
                });
            }

            @Override // com.immomo.mls.fun.ud.UDNativeLoader.StateListAnimator
            public void OLrzqt() {
                InterfaceC58217yxC interfaceC58217yxC = this.KWHzl;
                if (interfaceC58217yxC != null) {
                    interfaceC58217yxC.dispose();
                }
            }
        });
        return uDNativeLoader;
    }

    @LuaBridge
    public UDNativeLoader getAllBTCAddressInfosWithWalletIdAndProtocolId(LuaValue[] luaValueArr) {
        LuaValue luaValue;
        Integer numValueOf = null;
        if (luaValueArr == null || luaValueArr.length < 3 || (luaValue = luaValueArr[0]) == null) {
            return null;
        }
        final String javaString = luaValue.toJavaString();
        if (TextUtils.isEmpty(javaString)) {
            return null;
        }
        final int iIntValue = ((luaValueArr.length <= 1 || !luaValueArr[1].isNumber()) ? null : Integer.valueOf(luaValueArr[1].toInt())).intValue();
        if (luaValueArr.length > 2 && luaValueArr[2].isNumber()) {
            numValueOf = Integer.valueOf(luaValueArr[2].toInt());
        }
        final int iIntValue2 = numValueOf.intValue();
        final long j = luaValueArr.length > 3 ? luaValueArr[3].toLong() : 0L;
        UDNativeLoader uDNativeLoader = new UDNativeLoader(this.globals, luaValueArr);
        uDNativeLoader.copydefault(new UDNativeLoader.StateListAnimator() { // from class: com.okinc.wallet.mln.service.UDWalletCoreNew.5
            public InterfaceC58217yxC OLrzqt;

            @Override // com.immomo.mls.fun.ud.UDNativeLoader.StateListAnimator
            public void copydefault(final UDNativeLoader.Application application, final UDNativeLoader.Activity activity) {
                this.OLrzqt = ((WalletDappInteractionBizService) C43248rlh.KWHzl.AEQbTJ(WalletDappInteractionBizService.class)).copydefault(javaString, j, Integer.valueOf(iIntValue2), Integer.valueOf(iIntValue)).KWHzl(yBP.AEQbTJ()).AEQbTJ(new InterfaceC58229yxO<List<WalletBtcAddressBean>, JSONArray>() { // from class: com.okinc.wallet.mln.service.UDWalletCoreNew.5.4
                    /* JADX DEBUG: Method merged with bridge method: apply(Ljava/lang/Object;)Ljava/lang/Object; */
                    @Override // o.InterfaceC58229yxO
                    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
                    public JSONArray apply(List<WalletBtcAddressBean> list) throws Exception {
                        JSONArray jSONArray = new JSONArray();
                        if (list.isEmpty()) {
                            return jSONArray;
                        }
                        Iterator<WalletBtcAddressBean> it = list.iterator();
                        while (it.hasNext()) {
                            jSONArray.put(UDWalletCoreNew.this.OLrzqt(it.next()));
                        }
                        return jSONArray;
                    }
                }).KWHzl(C58266yxz.OLrzqt()).AEQbTJ(new InterfaceC58227yxM<JSONArray>() { // from class: com.okinc.wallet.mln.service.UDWalletCoreNew.5.3
                    /* JADX DEBUG: Method merged with bridge method: accept(Ljava/lang/Object;)V */
                    @Override // o.InterfaceC58227yxM
                    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
                    public void accept(JSONArray jSONArray) throws Exception {
                        application.copydefault(C7869arv.KWHzl(UDWalletCoreNew.this.globals, jSONArray));
                    }
                }, new InterfaceC58227yxM<Throwable>() { // from class: com.okinc.wallet.mln.service.UDWalletCoreNew.5.1
                    /* JADX DEBUG: Method merged with bridge method: accept(Ljava/lang/Object;)V */
                    @Override // o.InterfaceC58227yxM
                    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
                    public void accept(Throwable th) throws Exception {
                        activity.KWHzl(-1, "");
                    }
                });
            }

            @Override // com.immomo.mls.fun.ud.UDNativeLoader.StateListAnimator
            public void OLrzqt() {
                InterfaceC58217yxC interfaceC58217yxC = this.OLrzqt;
                if (interfaceC58217yxC != null) {
                    interfaceC58217yxC.dispose();
                }
            }
        });
        return uDNativeLoader;
    }

    @LuaBridge
    public LuaValue[] getCurrentBTCAddressInfo() {
        xWF xwf = walletService;
        if (xwf == null) {
            return LuaValue.rNil();
        }
        WalletBtcAddressBean walletBtcAddressBeanAEQbTJ = xwf.AEQbTJ();
        if (walletBtcAddressBeanAEQbTJ == null) {
            return LuaValue.rNil();
        }
        try {
            return LuaValue.varargsOf(C7869arv.KWHzl(this.globals, OLrzqt(walletBtcAddressBeanAEQbTJ)));
        } catch (Exception unused) {
            return LuaValue.rNil();
        }
    }

    @LuaBridge
    public LuaValue[] updateBTCNFTChargeAddress(LuaValue[] luaValueArr) {
        if (walletService == null) {
            return LuaValue.rString("walletService == null");
        }
        if (luaValueArr == null || luaValueArr.length < 1) {
            return LuaValue.rString("args == null || args.length < 1");
        }
        try {
            JSONObject jSONObjectEZpvd = C7869arv.EZpvd(luaValueArr[0].toLuaTable());
            walletService.copydefault(new WalletBtcAddressBean(jSONObjectEZpvd.getString(WalletSearchRequest.SEARCH_SOURCE_ADDRESS), jSONObjectEZpvd.getInt("addressType"), jSONObjectEZpvd.getString("balance"), jSONObjectEZpvd.getString("displayBalance"), jSONObjectEZpvd.getString("coinSymbol")));
            return LuaValue.rString("updateBTCNFTChargeAddress finish");
        } catch (Exception e) {
            return LuaValue.rString(e.getMessage());
        }
    }

    public final JSONObject OLrzqt(WalletBtcAddressBean walletBtcAddressBean) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(WalletSearchRequest.SEARCH_SOURCE_ADDRESS, walletBtcAddressBean.getAddress());
        jSONObject.put("addressType", walletBtcAddressBean.getAddressType());
        jSONObject.put("balance", walletBtcAddressBean.getBalance());
        jSONObject.put("coinSymbol", walletBtcAddressBean.getCoinSymbol());
        jSONObject.put("displayBalance", walletBtcAddressBean.getDisplayBalance());
        return jSONObject;
    }

    @LuaBridge
    public void addCustomCoin(String str, int i, String str2, String str3, String str4, int i2, final InterfaceC7835arN interfaceC7835arN) {
        String string;
        Context contextKWHzl = KWHzl(this.globals);
        if (contextKWHzl == null) {
            return;
        }
        DappInteractionArgs dappInteractionArgs = new DappInteractionArgs(str, "", String.valueOf(i), null, "", null, null, null, null, null, null, null, false, false, null, false, null, null, null, null, null, null, null, null, null, null, 2, null, null, SolanaSignType.NORMAL, null, null);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.putOpt("contract", str2);
            jSONObject.putOpt("symbol", str3);
            jSONObject.putOpt("iconUrl", str4);
            jSONObject.putOpt("decimals", Integer.valueOf(i2));
            string = jSONObject.toString();
        } catch (JSONException unused) {
            string = "";
        }
        ((xWE) C43248rlh.KWHzl.AEQbTJ(xWE.class)).copydefault(contextKWHzl, dappInteractionArgs, string, new Function1<Bundle, Unit>() { // from class: com.okinc.wallet.mln.service.UDWalletCoreNew.1
            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
            public Unit invoke(Bundle bundle) {
                boolean z = bundle.getBoolean("addCustomNetwork", false);
                InterfaceC7835arN interfaceC7835arN2 = interfaceC7835arN;
                if (interfaceC7835arN2 == null) {
                    return null;
                }
                interfaceC7835arN2.EZpvd(LuaBoolean.AEQbTJ(z));
                return null;
            }
        });
    }

    @LuaBridge
    public LuaValue[] isNewEntryPoint(LuaValue[] luaValueArr) {
        if (luaValueArr == null || luaValueArr.length < 2) {
            return LuaValue.rFalse();
        }
        String javaString = luaValueArr[0].toJavaString();
        String javaString2 = luaValueArr[1].toJavaString();
        if (javaString.isEmpty() || javaString2.isEmpty()) {
            return LuaValue.rFalse();
        }
        return LuaValue.rBoolean(((WalletDappInteractionBizService) C43248rlh.KWHzl.AEQbTJ(WalletDappInteractionBizService.class)).copydefault(javaString, javaString2));
    }
}
