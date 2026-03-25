package com.okinc.wallet.mln.service;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Looper;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.webkit.ValueCallback;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;
import com.amplifyframework.core.model.ModelIdentifier;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.GlideException;
import com.engagelab.privates.push.constants.MTPushConstants;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.huawei.hms.push.AttributionReporter;
import com.immomo.mls.annotation.LuaBridge;
import com.immomo.mls.annotation.LuaClass;
import com.immomo.mls.fun.ud.UDImageInfo;
import com.immomo.mls.fun.ud.UDNativeLoader;
import com.immomo.mls.fun.ud.view.UDImageView;
import com.immomo.mls.fun.ui.custom.data.JDImageInfo;
import com.okinc.business.defi.api.bean.DappInteractionArgs;
import com.okinc.business.defi.api.bean.DappSignArgs;
import com.okinc.business.defi.api.bean.DuplicateOrder;
import com.okinc.business.defi.api.bean.DuplicateOrderReq;
import com.okinc.business.defi.api.bean.GasLimitBean;
import com.okinc.business.defi.api.bean.GasPriceBean;
import com.okinc.business.defi.api.bean.MpcSignType;
import com.okinc.business.defi.api.bean.NewCallbackBean;
import com.okinc.business.defi.api.bean.NostrSignType;
import com.okinc.business.defi.api.bean.PlatformItem;
import com.okinc.business.defi.api.bean.SignType;
import com.okinc.business.defi.api.bean.SolanaSignType;
import com.okinc.business.defi.api.bean.passkeywallet.cedefi.SignAndSendTransactionInput;
import com.okinc.business.defi.api.bean.passkeywallet.cedefi.SignAndSendTransactionResult;
import com.okinc.business.defi.api.bean.passkeywallet.cedefi.SignAndSendTransactionSource;
import com.okinc.business.defi.biz.net.bean.TxToastCheckReq;
import com.okinc.business.defi.biz.net.bean.TxToastCheckRes;
import com.okinc.network.okg.response.OKServerException;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.rxutils.RxBus;
import com.okinc.wallet.api.MpcWalletService;
import com.okinc.wallet.api.WalletDappInteractionBizService;
import com.okinc.wallet.mln.service.UDWalletCore;
import com.reown.android.internal.common.signing.eip1271.EIP1271Verifier;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.AbstractC12782ctV;
import o.AbstractC58185ywX;
import o.C10954byG;
import o.C11205cFp;
import o.C12827cuN;
import o.C13754dXa;
import o.C13934dbu;
import o.C32979mnm;
import o.C33490mxT;
import o.C43246rlf;
import o.C43248rlh;
import o.C43251rlk;
import o.C48787ucK;
import o.C5335Nt;
import o.C55298xhM;
import o.C57104ycC;
import o.C57248yeo;
import o.C57259yez;
import o.C58266yxz;
import o.C7322ahe;
import o.C7323ahf;
import o.C7840arS;
import o.C7869arv;
import o.C7910asj;
import o.C8017aul;
import o.C9915beb;
import o.InterfaceC5462Sq;
import o.InterfaceC54829xWw;
import o.InterfaceC54832xWz;
import o.InterfaceC58217yxC;
import o.InterfaceC58227yxM;
import o.InterfaceC9731bbC;
import o.InterfaceC9735bbG;
import o.InterfaceC9738bbJ;
import o.InterfaceC9780bbz;
import o.InterfaceC9850bdP;
import o.InterfaceC9852bdR;
import o.InterfaceC9854bdT;
import o.InterfaceC9916bec;
import o.RY;
import o.dTK;
import o.dTL;
import o.wXL;
import o.xWI;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.luaj.vm2.Globals;
import org.luaj.vm2.LuaFunction;
import org.luaj.vm2.LuaString;
import org.luaj.vm2.LuaValue;

/* JADX INFO: loaded from: classes12.dex */
@LuaClass
public class UDWalletCore {
    public static final String LUA_CLASS_NAME = "WalletCore";
    public Globals globals;

    @LuaBridge
    public int property;
    public final String WALLET_ID = "wallet_id";
    public final String WEB_JS_ID = "web_js_id";
    public final String DAPP = "dapp";
    public final String Msg = "msg";
    public final String DATA = "data";
    public final String IS_PERSON_SIGN = "ispersonsign";
    public final String NETWOEK = "network";
    public final String IS_SUPPORT_SOLANA = "is_support_solana";
    public final String JSON_DATA = MTPushConstants.Analysis.KEY_JSON;
    public final String FROM = "from";
    public final String COIN_ID = "coinId";
    public boolean useNewCallBack = false;

    public UDWalletCore(@NonNull Globals globals, @NonNull LuaValue[] luaValueArr) {
        this.globals = globals;
    }

    public static Context OLrzqt(@NonNull Globals globals) {
        C7322ahe c7322ahe = (C7322ahe) globals.AuCTel();
        if (c7322ahe != null) {
            return c7322ahe.AEQbTJ;
        }
        return null;
    }

    @LuaBridge
    public LuaValue[] getWalletManager() {
        return LuaValue.varargsOf(new UDWalletManager(this.globals, ((InterfaceC9852bdR) C43248rlh.KWHzl.AEQbTJ(InterfaceC9852bdR.class)).gEmmrt()));
    }

    @LuaBridge
    public LuaValue[] getCoinMetaManager() {
        return LuaValue.varargsOf(new UDMetaManager(this.globals, ((InterfaceC9852bdR) C43248rlh.KWHzl.AEQbTJ(InterfaceC9852bdR.class)).copydefault()));
    }

    /* JADX INFO: renamed from: com.okinc.wallet.mln.service.UDWalletCore$4, reason: invalid class name */
    public class AnonymousClass4 implements UDNativeLoader.StateListAnimator {
        public InterfaceC58217yxC KWHzl;

        public AnonymousClass4() {
        }

        @Override // com.immomo.mls.fun.ud.UDNativeLoader.StateListAnimator
        public void copydefault(final UDNativeLoader.Application application, final UDNativeLoader.Activity activity) {
            this.KWHzl = ((InterfaceC9852bdR) C43248rlh.KWHzl.AEQbTJ(InterfaceC9852bdR.class)).AhwBna().AEQbTJ(false).KWHzl(C58266yxz.OLrzqt()).AEQbTJ(new InterfaceC58227yxM() { // from class: o.ydS
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    application.copydefault(null);
                }
            }, new InterfaceC58227yxM() { // from class: o.ydT
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) throws java.lang.Exception {
                    UDWalletCore.AnonymousClass4.OLrzqt(activity, (java.lang.Throwable) obj);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void OLrzqt(UDNativeLoader.Activity activity, Throwable th) throws Exception {
            activity.KWHzl(-1, th.getMessage());
        }

        @Override // com.immomo.mls.fun.ud.UDNativeLoader.StateListAnimator
        public void OLrzqt() {
            InterfaceC58217yxC interfaceC58217yxC = this.KWHzl;
            if (interfaceC58217yxC != null) {
                interfaceC58217yxC.dispose();
            }
        }
    }

    @LuaBridge
    public UDNativeLoader ensureInitialized(LuaValue[] luaValueArr) {
        UDNativeLoader uDNativeLoader = new UDNativeLoader(this.globals, luaValueArr);
        uDNativeLoader.copydefault(new AnonymousClass4());
        return uDNativeLoader;
    }

    @LuaBridge
    public UDNativeLoader makeRpc(final LuaValue[] luaValueArr) {
        UDNativeLoader uDNativeLoader = new UDNativeLoader(this.globals, luaValueArr);
        uDNativeLoader.copydefault(new UDNativeLoader.StateListAnimator() { // from class: com.okinc.wallet.mln.service.UDWalletCore.13
            public InterfaceC58217yxC OLrzqt;

            @Override // com.immomo.mls.fun.ud.UDNativeLoader.StateListAnimator
            public void copydefault(UDNativeLoader.Application application, UDNativeLoader.Activity activity) {
                LuaValue[] luaValueArr2 = luaValueArr;
                if (luaValueArr2 == null || luaValueArr2.length < 2) {
                    activity.KWHzl(-1, "wrong params");
                    return;
                }
                this.OLrzqt = new C57248yeo().AEQbTJ(luaValueArr[0].toJavaString(), C33490mxT.OLrzqt(C7910asj.EZpvd(luaValueArr[1])), application, activity);
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
    public UDNativeLoader encodeABILoader(final LuaValue[] luaValueArr) {
        UDNativeLoader uDNativeLoader = new UDNativeLoader(this.globals, luaValueArr);
        uDNativeLoader.copydefault(new UDNativeLoader.StateListAnimator() { // from class: com.okinc.wallet.mln.service.UDWalletCore.18
            @Override // com.immomo.mls.fun.ud.UDNativeLoader.StateListAnimator
            public void OLrzqt() {
            }

            @Override // com.immomo.mls.fun.ud.UDNativeLoader.StateListAnimator
            public void copydefault(final UDNativeLoader.Application application, UDNativeLoader.Activity activity) {
                LuaValue[] luaValueArr2 = luaValueArr;
                if (luaValueArr2 == null || luaValueArr2.length < 3) {
                    activity.KWHzl(-1, "wrong params");
                } else {
                    UDWalletCore.this.copydefault(luaValueArr2, new ValueCallback<String>() { // from class: com.okinc.wallet.mln.service.UDWalletCore.18.3
                        /* JADX DEBUG: Method merged with bridge method: onReceiveValue(Ljava/lang/Object;)V */
                        @Override // android.webkit.ValueCallback
                        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
                        public void onReceiveValue(String str) {
                            application.copydefault(str);
                        }
                    });
                }
            }
        });
        return uDNativeLoader;
    }

    @LuaBridge
    public UDNativeLoader walletTxToastCheck(final LuaValue[] luaValueArr) {
        UDNativeLoader uDNativeLoader = new UDNativeLoader(this.globals, luaValueArr);
        uDNativeLoader.copydefault(new UDNativeLoader.StateListAnimator() { // from class: com.okinc.wallet.mln.service.UDWalletCore.17
            public InterfaceC58217yxC OLrzqt = null;

            @Override // com.immomo.mls.fun.ud.UDNativeLoader.StateListAnimator
            public void copydefault(final UDNativeLoader.Application application, final UDNativeLoader.Activity activity) {
                LuaValue[] luaValueArr2 = luaValueArr;
                if (luaValueArr2 == null || luaValueArr2.length < 1) {
                    activity.KWHzl(-1, "wrong params");
                    return;
                }
                try {
                    C13934dbu c13934dbu = new C13934dbu();
                    final Gson gson = new Gson();
                    this.OLrzqt = c13934dbu.copydefault((TxToastCheckReq) gson.fromJson(luaValueArr[0].isTable() ? gson.toJson(C7910asj.EZpvd(luaValueArr[0])) : "", TxToastCheckReq.class)).AEQbTJ(new InterfaceC58227yxM<ResponseData<List<TxToastCheckRes>>>() { // from class: com.okinc.wallet.mln.service.UDWalletCore.17.5
                        /* JADX DEBUG: Method merged with bridge method: accept(Ljava/lang/Object;)V */
                        @Override // o.InterfaceC58227yxM
                        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
                        public void accept(ResponseData<List<TxToastCheckRes>> responseData) throws Exception {
                            if (responseData.isSucceed()) {
                                application.copydefault(C7869arv.EZpvd(UDWalletCore.this.globals, (JsonArray) gson.toJsonTree(responseData.getData())));
                            } else {
                                activity.KWHzl(responseData.getCode(), responseData.getMsg());
                            }
                        }
                    });
                } catch (Exception unused) {
                    activity.KWHzl(-1, "");
                }
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

    public final void copydefault(LuaValue[] luaValueArr, ValueCallback<String> valueCallback) {
        ((InterfaceC9852bdR) C43248rlh.KWHzl.AEQbTJ(InterfaceC9852bdR.class)).AEQbTJ(luaValueArr[0].toJavaString(), luaValueArr[1].toJavaString() == null ? "" : luaValueArr[1].toJavaString(), luaValueArr[2].toJavaString(), valueCallback);
    }

    @LuaBridge
    public LuaValue[] encodeABI(LuaValue[] luaValueArr) {
        if (luaValueArr == null || luaValueArr.length < 3) {
            return null;
        }
        return LuaValue.rString(((InterfaceC9852bdR) C43248rlh.KWHzl.AEQbTJ(InterfaceC9852bdR.class)).OLrzqt(luaValueArr[0].toJavaString(), luaValueArr[1].toJavaString() == null ? "" : luaValueArr[1].toJavaString(), luaValueArr[2].toJavaString()));
    }

    @LuaBridge
    public UDNativeLoader sendTransaction(final LuaValue[] luaValueArr) {
        UDNativeLoader uDNativeLoader = new UDNativeLoader(this.globals, luaValueArr);
        uDNativeLoader.copydefault(new UDNativeLoader.StateListAnimator() { // from class: com.okinc.wallet.mln.service.UDWalletCore.20
            @Override // com.immomo.mls.fun.ud.UDNativeLoader.StateListAnimator
            public void OLrzqt() {
            }

            @Override // com.immomo.mls.fun.ud.UDNativeLoader.StateListAnimator
            public void copydefault(final UDNativeLoader.Application application, final UDNativeLoader.Activity activity) {
                String strSubstring;
                String str;
                String str2;
                String strCopydefault;
                String strCopydefault2;
                LuaValue luaValue;
                LuaValue luaValue2;
                LuaValue luaValue3;
                LuaValue[] luaValueArr2 = luaValueArr;
                if (luaValueArr2 == null || luaValueArr2.length < 5) {
                    activity.KWHzl(-1, "wrong params");
                    return;
                }
                String strOLrzqt = C33490mxT.OLrzqt(C7910asj.EZpvd(luaValueArr2[0]));
                try {
                    strSubstring = new JSONObject(strOLrzqt).optString("data");
                } catch (Exception unused) {
                    strSubstring = "";
                }
                final JSONObject jSONObject = null;
                String strOptString = null;
                try {
                    JSONObject jSONObject2 = new JSONObject(C33490mxT.OLrzqt(C7910asj.EZpvd(luaValueArr[5])));
                    try {
                        strOptString = jSONObject2.optString("txToastCheckPayload");
                    } catch (Exception unused2) {
                    }
                    str = strOptString;
                    jSONObject = jSONObject2;
                } catch (Exception unused3) {
                    str = null;
                }
                LuaValue[] luaValueArr3 = luaValueArr;
                if (luaValueArr3.length > 6 && (luaValue3 = luaValueArr3[6]) != null) {
                    UDWalletCore.this.useNewCallBack = luaValue3.toBoolean();
                }
                int iValueOf = 2;
                LuaValue[] luaValueArr4 = luaValueArr;
                if (luaValueArr4.length > 7 && (luaValue2 = luaValueArr4[7]) != null) {
                    iValueOf = Integer.valueOf(Integer.parseInt(luaValue2.toJavaString()));
                }
                Integer num = iValueOf;
                int iValueOf2 = 4;
                LuaValue[] luaValueArr5 = luaValueArr;
                if (luaValueArr5.length > 8 && (luaValue = luaValueArr5[8]) != null) {
                    iValueOf2 = Integer.valueOf(Integer.parseInt(luaValue.toJavaString()));
                }
                Integer num2 = iValueOf2;
                long j = luaValueArr[2].toLong();
                String strKWHzl = UDWalletCore.KWHzl(j);
                PlatformItem platformItem = new PlatformItem();
                platformItem.setPlatform(luaValueArr[3].toJavaString());
                UDImageInfo uDImageInfo = (UDImageInfo) luaValueArr[4];
                if (uDImageInfo != null && (strCopydefault2 = UDWalletCore.copydefault(C43246rlf.OLrzqt.valueOf(), uDImageInfo)) != null) {
                    platformItem.setLogo(strCopydefault2);
                }
                platformItem.setNetwork(strKWHzl);
                C48787ucK c48787ucK = C48787ucK.AEQbTJ;
                String strCopydefault3 = c48787ucK.copydefault("gasLimitConfig.nft", "");
                String strCopydefault4 = c48787ucK.copydefault("gasPriceConfig.nft", "");
                if (j != 1) {
                    String strCopydefault5 = c48787ucK.copydefault("gasLimitConfig.nftOther", "");
                    strCopydefault = c48787ucK.copydefault("gasPriceConfig.nftOther", "");
                    str2 = strCopydefault5;
                } else {
                    str2 = strCopydefault3;
                    strCopydefault = strCopydefault4;
                }
                if (strSubstring.equals("") || strSubstring.equals(EIP1271Verifier.hexPrefix)) {
                    ((InterfaceC9854bdT) C43248rlh.KWHzl.OLrzqt(InterfaceC9854bdT.class)).EZpvd(UDWalletCore.OLrzqt(UDWalletCore.this.globals), new DappInteractionArgs(luaValueArr[1].toJavaString(), "", String.valueOf(j), platformItem, strOLrzqt, null, "dapp", num2, null, null, null, null, false, false, null, false, strCopydefault, str2, null, null, null, null, null, null, null, null, num, str, null, SolanaSignType.NORMAL, null, null), new Function1<Bundle, Unit>() { // from class: com.okinc.wallet.mln.service.UDWalletCore.20.2
                        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
                        @Override // kotlin.jvm.functions.Function1
                        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
                        public Unit invoke(Bundle bundle) {
                            UDWalletCore.this.OLrzqt(bundle, application, activity, (String) null);
                            return null;
                        }
                    }, null, null);
                    return;
                }
                if (strSubstring.startsWith(EIP1271Verifier.hexPrefix)) {
                    strSubstring = strSubstring.substring(2);
                }
                final C57104ycC c57104ycC = new C57104ycC();
                if (strSubstring.startsWith("095ea7b3")) {
                    C43248rlh c43248rlh = C43248rlh.KWHzl;
                    ((InterfaceC9852bdR) c43248rlh.AEQbTJ(InterfaceC9852bdR.class)).gEmmrt().copydefault(luaValueArr[1].toJavaString()).bO_();
                    ((InterfaceC9854bdT) c43248rlh.OLrzqt(InterfaceC9854bdT.class)).AEQbTJ(UDWalletCore.OLrzqt(UDWalletCore.this.globals), new DappInteractionArgs(luaValueArr[1].toJavaString(), "", String.valueOf(j), platformItem, strOLrzqt, null, "dapp", num2, null, null, null, null, false, false, null, UDWalletCore.this.useNewCallBack, strCopydefault, str2, null, null, null, null, null, null, null, null, num, str, null, SolanaSignType.NORMAL, null, null), new Function1<Bundle, Unit>() { // from class: com.okinc.wallet.mln.service.UDWalletCore.20.3
                        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
                        @Override // kotlin.jvm.functions.Function1
                        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
                        public Unit invoke(Bundle bundle) {
                            UDWalletCore.this.OLrzqt(bundle, application, activity, (String) null);
                            return null;
                        }
                    }, new Function1<NewCallbackBean, AbstractC58185ywX<ResponseData<String>>>() { // from class: com.okinc.wallet.mln.service.UDWalletCore.20.4
                        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
                        @Override // kotlin.jvm.functions.Function1
                        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
                        public AbstractC58185ywX<ResponseData<String>> invoke(NewCallbackBean newCallbackBean) {
                            return c57104ycC.EZpvd(newCallbackBean.getHeaderMap(), UDWalletCore.AEQbTJ(newCallbackBean, jSONObject, (StringBuilder) null), newCallbackBean.isBatch());
                        }
                    });
                } else {
                    C43248rlh c43248rlh2 = C43248rlh.KWHzl;
                    ((InterfaceC9852bdR) c43248rlh2.AEQbTJ(InterfaceC9852bdR.class)).gEmmrt().copydefault(luaValueArr[1].toJavaString()).bO_();
                    final StringBuilder sb = new StringBuilder();
                    ((InterfaceC9854bdT) c43248rlh2.OLrzqt(InterfaceC9854bdT.class)).KWHzl(UDWalletCore.OLrzqt(UDWalletCore.this.globals), new DappInteractionArgs(luaValueArr[1].toJavaString(), "", String.valueOf(j), platformItem, strOLrzqt, null, "dapp", num2, null, null, null, null, false, false, null, UDWalletCore.this.useNewCallBack, strCopydefault, str2, null, null, null, null, null, null, null, null, num, str, null, SolanaSignType.NORMAL, null, null), new Function1<Bundle, Unit>() { // from class: com.okinc.wallet.mln.service.UDWalletCore.20.1
                        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
                        @Override // kotlin.jvm.functions.Function1
                        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
                        public Unit invoke(Bundle bundle) {
                            UDWalletCore.this.OLrzqt(bundle, application, activity, sb.toString());
                            return null;
                        }
                    }, new Function1<NewCallbackBean, AbstractC58185ywX<ResponseData<String>>>() { // from class: com.okinc.wallet.mln.service.UDWalletCore.20.5
                        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
                        @Override // kotlin.jvm.functions.Function1
                        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
                        public AbstractC58185ywX<ResponseData<String>> invoke(NewCallbackBean newCallbackBean) {
                            return c57104ycC.EZpvd(newCallbackBean.getHeaderMap(), UDWalletCore.AEQbTJ(newCallbackBean, jSONObject, sb), newCallbackBean.isBatch());
                        }
                    }, null);
                }
            }
        });
        return uDNativeLoader;
    }

    public static JsonObject copydefault(NewCallbackBean newCallbackBean, String str) {
        JsonObject jsonObject = new JsonObject();
        try {
            JsonArray jsonArray = (JsonArray) newCallbackBean.getBody().get("walletTxData");
            JsonObject jsonObject2 = (JsonObject) new Gson().fromJson(str, JsonObject.class);
            String asString = jsonObject2.get("isRc20").getAsString();
            String asString2 = jsonObject2.get("walletPublicKey").getAsString();
            JsonArray asJsonArray = jsonObject2.get("batchBean").getAsJsonArray();
            String asString3 = jsonObject2.get("to").getAsString();
            jsonObject.addProperty("wallet", asString3);
            jsonObject.addProperty("payload", str);
            if (jsonArray.size() > 0) {
                JsonObject asJsonObject = jsonArray.get(0).getAsJsonObject();
                String asString4 = asJsonObject.get("signedTx").getAsString();
                asJsonObject.get("walletTxData");
                jsonObject.add("walletTxData", asJsonObject);
                jsonObject.addProperty("extJson", asJsonObject.get("extJson").getAsString());
                jsonObject.addProperty("psbt", asString4);
            }
            JsonObject jsonObject3 = new JsonObject();
            jsonObject3.addProperty("walletAddress", asString3);
            jsonObject3.addProperty("walletPublicKey", asString2);
            jsonObject3.addProperty("type", asString);
            JsonArray jsonArray2 = new JsonArray();
            for (int i = 0; i < asJsonArray.size(); i++) {
                JsonObject asJsonObject2 = asJsonArray.get(i).getAsJsonObject();
                JsonObject jsonObject4 = new JsonObject();
                jsonObject4.addProperty("orderId", asJsonObject2.get("orderId").getAsString());
                jsonArray2.add(jsonObject4);
            }
            jsonObject3.add("items", jsonArray2);
            jsonObject.add("request", jsonObject3);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return jsonObject;
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:72:0x0269 */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01ff A[Catch: Exception -> 0x0269, TRY_ENTER, TryCatch #3 {Exception -> 0x0269, blocks: (B:49:0x01c5, B:52:0x01ff, B:67:0x0236, B:69:0x0252, B:70:0x0261, B:55:0x020b, B:65:0x0225, B:66:0x022e), top: B:88:0x01c5 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0252 A[Catch: Exception -> 0x0269, TryCatch #3 {Exception -> 0x0269, blocks: (B:49:0x01c5, B:52:0x01ff, B:67:0x0236, B:69:0x0252, B:70:0x0261, B:55:0x020b, B:65:0x0225, B:66:0x022e), top: B:88:0x01c5 }] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0066 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01bc A[EDGE_INSN: B:90:0x01bc->B:47:0x01bc BREAK  A[LOOP:0: B:11:0x0052->B:45:0x019f], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static JsonObject copydefault(NewCallbackBean newCallbackBean, JSONObject jSONObject, String str, long j) {
        JsonObject jsonObject;
        JSONArray jSONArray;
        JsonArray jsonArray;
        int i;
        String str2;
        int asInt;
        JsonObject jsonObject2;
        JsonArray jsonArray2;
        JsonObject jsonObject3;
        int asInt2;
        String str3;
        String asString;
        JSONObject jSONObject2 = jSONObject;
        String str4 = "btcSpeedUpInfo";
        String str5 = "walletTxData";
        String str6 = "payload";
        String str7 = "scene";
        JsonObject jsonObject4 = new JsonObject();
        if (!newCallbackBean.isBtcMint()) {
            return jsonObject4;
        }
        try {
            JsonArray jsonArray3 = (JsonArray) newCallbackBean.getBody().get("walletTxData");
            JsonObject jsonObject5 = (JsonObject) new Gson().fromJson(str, JsonObject.class);
            String strOptString = jSONObject2.optString("payload");
            if (!TextUtils.isEmpty(strOptString)) {
                try {
                    jSONArray = new JSONArray(strOptString);
                } catch (JSONException unused) {
                    jSONArray = null;
                }
                jsonArray = new JsonArray();
                i = 0;
                str2 = "";
                asInt = 0;
                while (true) {
                    jsonObject2 = jsonObject4;
                    jsonArray2 = jsonArray;
                    jsonObject3 = jsonObject5;
                    if (i < jsonArray3.size()) {
                        break;
                    }
                    try {
                        JsonObject jsonObject6 = new JsonObject();
                        JsonElement jsonElement = jsonArray3.get(i);
                        copydefault(jsonElement, jSONObject2);
                        JsonArray jsonArray4 = jsonArray3;
                        JsonObject jsonObject7 = (JsonObject) jsonElement;
                        if (jsonObject7.has(str4)) {
                            jsonObject7.remove(str4);
                        }
                        JsonElement jsonElement2 = jsonObject7.get("extJson");
                        if (jsonElement2 != null) {
                            jsonObject6.add("extJson", jsonElement2);
                        }
                        if (jSONArray != null && jSONArray.length() > i) {
                            JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i);
                            if (jSONObjectOptJSONObject != null) {
                                str3 = str4;
                                jsonObject6.addProperty(str6, jSONObjectOptJSONObject.toString());
                                jsonObject6.addProperty("orderId", jSONObjectOptJSONObject.optString("orderId"));
                            } else {
                                str3 = str4;
                            }
                        } else {
                            str3 = str4;
                            jsonObject6.addProperty(str6, strOptString);
                        }
                        asInt += ((JsonObject) jsonElement).get("serviceCharge").getAsInt();
                        jsonObject6.add(str5, jsonElement);
                        jsonObject6.addProperty(AttributionReporter.APP_VERSION, C32979mnm.EZpvd.EZpvd());
                        jsonObject6.addProperty("source", (Number) 1);
                        String str8 = str5;
                        jsonObject6.addProperty("walletAddress", ((JsonObject) jsonElement).get("fromAdr").getAsString());
                        jsonObject6.addProperty(str7, jSONObject2.getString(str7));
                        jsonObject6.addProperty("chain", Long.valueOf(j));
                        String asString2 = (i == 0 && ((JsonObject) jsonElement).has("feeRate")) ? ((JsonObject) jsonElement).get("feeRate").getAsString() : str2;
                        int asInt3 = jsonObject3.get("txType").getAsInt();
                        JsonObject jsonObject8 = new JsonObject();
                        str2 = asString2;
                        String str9 = str6;
                        String str10 = str7;
                        if (asInt3 == 73) {
                            jsonObject8.addProperty("inscribeContent", jsonObject3.get("mintItemList").getAsJsonArray().get(i).getAsJsonObject().get("body").getAsString());
                            jsonObject6.add("inscribeDetail", jsonObject8);
                        } else if (((JsonObject) jsonElement).has("dependTx")) {
                            if (asInt3 == 62) {
                                asString = jsonObject3.get("mintItemList").getAsJsonArray().get(i - 1).getAsJsonObject().get("base64Content").getAsString();
                            } else {
                                asString = jsonObject3.get("mintItemList").getAsJsonArray().get(i - 1).getAsJsonObject().get("body").getAsString();
                            }
                            jsonObject8.addProperty("inscribeContent", asString);
                            jsonObject6.add("inscribeDetail", jsonObject8);
                        }
                        jsonArray2.add(jsonObject6);
                        i++;
                        jsonArray = jsonArray2;
                        jsonObject5 = jsonObject3;
                        jsonObject4 = jsonObject2;
                        str6 = str9;
                        str7 = str10;
                        jsonArray3 = jsonArray4;
                        str4 = str3;
                        str5 = str8;
                        jSONObject2 = jSONObject;
                    } catch (Exception e) {
                        e = e;
                        jsonObject = jsonObject2;
                    }
                }
                jsonObject = jsonObject2;
                try {
                    jsonObject.add("txList", jsonArray2);
                    jsonObject.addProperty("txTotalFee", ((InterfaceC9850bdP) C43248rlh.KWHzl.AEQbTJ(InterfaceC9850bdP.class)).copydefault(String.valueOf(asInt), String.valueOf(C10954byG.EZpvd.valueOf().copydefault().fetchVPNInfo())));
                    asInt2 = jsonObject3.get("txType").getAsInt();
                    if (asInt2 != 62) {
                        jsonObject.addProperty("inscribeType", (Number) 1);
                    } else if (asInt2 == 61) {
                        jsonObject.addProperty("inscribeType", (Number) 2);
                    } else if (asInt2 == 51 || asInt2 == 60 || asInt2 == 50) {
                        jsonObject.addProperty("inscribeType", (Number) 3);
                    } else if (asInt2 == 73) {
                        jsonObject.addProperty("inscribeType", (Number) 4);
                    }
                    jsonObject.addProperty("receiveAddress", jsonObject3.get("to").getAsString());
                    jsonObject.addProperty("feeRate", str2);
                    if (jsonObject3.has("tokenStandard")) {
                        jsonObject.addProperty("tokenStandard", Integer.valueOf(jsonObject3.get("tokenStandard").getAsInt()));
                    }
                    jsonObject.addProperty("chain", Long.valueOf(j));
                    return jsonObject;
                } catch (Exception e2) {
                    e = e2;
                }
            } else {
                jSONArray = null;
                jsonArray = new JsonArray();
                i = 0;
                str2 = "";
                asInt = 0;
                while (true) {
                    jsonObject2 = jsonObject4;
                    jsonArray2 = jsonArray;
                    jsonObject3 = jsonObject5;
                    if (i < jsonArray3.size()) {
                    }
                    jsonArray2.add(jsonObject6);
                    i++;
                    jsonArray = jsonArray2;
                    jsonObject5 = jsonObject3;
                    jsonObject4 = jsonObject2;
                    str6 = str9;
                    str7 = str10;
                    jsonArray3 = jsonArray4;
                    str4 = str3;
                    str5 = str8;
                    jSONObject2 = jSONObject;
                }
                jsonObject = jsonObject2;
                jsonObject.add("txList", jsonArray2);
                jsonObject.addProperty("txTotalFee", ((InterfaceC9850bdP) C43248rlh.KWHzl.AEQbTJ(InterfaceC9850bdP.class)).copydefault(String.valueOf(asInt), String.valueOf(C10954byG.EZpvd.valueOf().copydefault().fetchVPNInfo())));
                asInt2 = jsonObject3.get("txType").getAsInt();
                if (asInt2 != 62) {
                }
                jsonObject.addProperty("receiveAddress", jsonObject3.get("to").getAsString());
                jsonObject.addProperty("feeRate", str2);
                if (jsonObject3.has("tokenStandard")) {
                }
                jsonObject.addProperty("chain", Long.valueOf(j));
                return jsonObject;
            }
        } catch (Exception e3) {
            e = e3;
            jsonObject = jsonObject4;
        }
        e.printStackTrace();
        return jsonObject;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static JsonArray OLrzqt(NewCallbackBean newCallbackBean, JSONObject jSONObject, StringBuilder sb, long j) {
        JSONArray jSONArray;
        int i;
        JsonArray jsonArray = new JsonArray();
        if (newCallbackBean.isBatch()) {
            JsonArray jsonArray2 = (JsonArray) newCallbackBean.getBody().get("walletTxData");
            JsonArray jsonArray3 = (JsonArray) newCallbackBean.getBody().get("transactionHash");
            String strOptString = jSONObject.optString("payload");
            if (!TextUtils.isEmpty(strOptString)) {
                try {
                    jSONArray = new JSONArray(strOptString);
                } catch (JSONException unused) {
                    jSONArray = null;
                }
                for (i = 0; i < jsonArray2.size(); i++) {
                    JsonObject jsonObject = new JsonObject();
                    JsonElement jsonElement = jsonArray2.get(i);
                    copydefault(jsonElement, jSONObject);
                    JsonElement jsonElement2 = ((JsonObject) jsonElement).get("extJson");
                    if (jsonElement2 != null) {
                        jsonObject.add("extJson", jsonElement2);
                    }
                    if (jSONArray != null && jSONArray.length() > i) {
                        JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i);
                        if (jSONObjectOptJSONObject != null) {
                            jsonObject.addProperty("payload", jSONObjectOptJSONObject.toString());
                            jsonObject.addProperty("orderId", jSONObjectOptJSONObject.optString("orderId"));
                        }
                    } else {
                        jsonObject.addProperty("payload", strOptString);
                    }
                    jsonObject.add("walletTxData", jsonElement);
                    jsonObject.addProperty(AttributionReporter.APP_VERSION, C32979mnm.EZpvd.EZpvd());
                    jsonObject.addProperty("source", (Number) 1);
                    jsonObject.addProperty("chain", Long.valueOf(j));
                    jsonObject.add("transactionHash", jsonArray3.get(i));
                    Iterator<String> itKeys = jSONObject.keys();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        Object objOpt = jSONObject.opt(next);
                        if (!newCallbackBean.isBatch() || !"payload".equals(next)) {
                            if (objOpt instanceof Boolean) {
                                jsonObject.addProperty(next, (Boolean) objOpt);
                            } else if ((objOpt instanceof Integer) || (objOpt instanceof Long) || (objOpt instanceof Float) || (objOpt instanceof Double) || (objOpt instanceof Byte) || (objOpt instanceof Short)) {
                                jsonObject.addProperty(next, (Number) objOpt);
                            } else if (objOpt != null) {
                                jsonObject.addProperty(next, objOpt.toString());
                            }
                        }
                    }
                    jsonArray.add(jsonObject);
                }
            } else {
                jSONArray = null;
                while (i < jsonArray2.size()) {
                }
            }
        }
        return jsonArray;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static JsonObject AEQbTJ(NewCallbackBean newCallbackBean, JSONObject jSONObject, StringBuilder sb) {
        JSONObject jSONObjectOptJSONObject;
        JSONArray jSONArray;
        int i;
        JSONObject jSONObjectOptJSONObject2;
        JsonObject body = newCallbackBean.getBody();
        if (newCallbackBean.isBatch()) {
            body.remove("bizId");
            body.remove("transactionHash");
            JsonArray asJsonArray = body.remove("walletTxData").getAsJsonArray();
            JsonArray jsonArray = new JsonArray();
            String strOptString = jSONObject.optString("payload");
            String strOptString2 = jSONObject.optString("orderIds");
            if (!TextUtils.isEmpty(strOptString2) && sb != null) {
                sb.append(strOptString2);
            }
            if (!TextUtils.isEmpty(strOptString)) {
                try {
                    jSONArray = new JSONArray(strOptString);
                } catch (JSONException unused) {
                    jSONArray = null;
                }
                for (i = 0; i < asJsonArray.size(); i++) {
                    JsonObject jsonObject = new JsonObject();
                    copydefault(asJsonArray.get(i), jSONObject);
                    jsonObject.add("walletTxData", new Gson().toJsonTree(asJsonArray.get(i)));
                    if (jSONArray != null && jSONArray.length() > i && (jSONObjectOptJSONObject2 = jSONArray.optJSONObject(i)) != null) {
                        jsonObject.addProperty("payload", jSONObjectOptJSONObject2.toString());
                        jsonObject.addProperty("orderId", jSONObjectOptJSONObject2.optString("orderId"));
                    }
                    jsonArray.add(jsonObject);
                }
                body.add("walletTxDataList", jsonArray);
            } else {
                jSONArray = null;
                while (i < asJsonArray.size()) {
                }
                body.add("walletTxDataList", jsonArray);
            }
        } else if (jSONObject != null && (jSONObjectOptJSONObject = jSONObject.optJSONObject("payload")) != null && !TextUtils.isEmpty(jSONObjectOptJSONObject.optString("txParamsMD5", ""))) {
            JsonElement jsonElement = newCallbackBean.getBody().get("walletTxData");
            if (jsonElement instanceof JsonObject) {
                copydefault(jsonElement, jSONObjectOptJSONObject);
                JsonElement jsonElement2 = ((JsonObject) jsonElement).get("extJson");
                if (jsonElement2 != null) {
                    body.add("extJson", jsonElement2);
                }
            }
        }
        body.addProperty(AttributionReporter.APP_VERSION, C32979mnm.EZpvd.EZpvd());
        body.addProperty("source", (Number) 1);
        if (jSONObject != null) {
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                Object objOpt = jSONObject.opt(next);
                if (!newCallbackBean.isBatch() || !"payload".equals(next)) {
                    if (objOpt instanceof Boolean) {
                        body.addProperty(next, (Boolean) objOpt);
                    } else if ((objOpt instanceof Integer) || (objOpt instanceof Long) || (objOpt instanceof Float) || (objOpt instanceof Double) || (objOpt instanceof Byte) || (objOpt instanceof Short)) {
                        body.addProperty(next, (Number) objOpt);
                    } else if (objOpt != null) {
                        body.addProperty(next, objOpt.toString());
                    }
                }
            }
        }
        return body;
    }

    public static JsonObject OLrzqt(NewCallbackBean newCallbackBean, JSONObject jSONObject, StringBuilder sb) {
        JSONObject jSONObjectOptJSONObject;
        JsonObject body = newCallbackBean.getBody();
        if (jSONObject != null && (jSONObjectOptJSONObject = jSONObject.optJSONObject("payload")) != null && !TextUtils.isEmpty(jSONObjectOptJSONObject.optString("txParamsMD5", ""))) {
            JsonElement jsonElement = newCallbackBean.getBody().get("walletTxData");
            if (jsonElement instanceof JsonObject) {
                copydefault(jsonElement, jSONObjectOptJSONObject);
                JsonObject jsonObject = (JsonObject) jsonElement;
                JsonElement jsonElement2 = jsonObject.get("extJson");
                try {
                    jsonObject.remove("txSource");
                    jsonObject.addProperty("txSource", (Number) 10);
                } catch (Exception unused) {
                }
                if (jsonElement2 != null) {
                    body.add("extJson", jsonElement2);
                }
            }
        }
        body.addProperty(AttributionReporter.APP_VERSION, C32979mnm.EZpvd.EZpvd());
        body.addProperty("source", (Number) 1);
        if (jSONObject != null) {
            body.addProperty("scene", jSONObject.optString("scene"));
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                Object objOpt = jSONObject.opt(next);
                if (!newCallbackBean.isBatch() || !"payload".equals(next)) {
                    if (objOpt instanceof Boolean) {
                        body.addProperty(next, (Boolean) objOpt);
                    } else if ((objOpt instanceof Integer) || (objOpt instanceof Long) || (objOpt instanceof Float) || (objOpt instanceof Double) || (objOpt instanceof Byte) || (objOpt instanceof Short)) {
                        body.addProperty(next, (Number) objOpt);
                    } else if (objOpt != null) {
                        body.addProperty(next, objOpt.toString());
                    }
                }
            }
        }
        return body;
    }

    public static void copydefault(JsonElement jsonElement, JSONObject jSONObject) {
        if (jSONObject != null) {
            String strOptString = jSONObject.optString("txParamsMD5", "");
            if (TextUtils.isEmpty(strOptString)) {
                try {
                    strOptString = jSONObject.getJSONObject("payload").optString("txParamsMD5");
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            if (TextUtils.isEmpty(strOptString) || !(jsonElement instanceof JsonObject)) {
                return;
            }
            JsonObject jsonObject = (JsonObject) jsonElement;
            jsonObject.addProperty("bizHash", strOptString);
            jsonObject.addProperty("bizSource", "NFT");
        }
    }

    public final void OLrzqt(Bundle bundle, UDNativeLoader.Application application, UDNativeLoader.Activity activity, String str) {
        if (bundle == null || bundle.getInt("result") == 0) {
            activity.KWHzl(-1, C43246rlf.OLrzqt.valueOf().getString(C13754dXa.FragmentManager.DDDCac));
            return;
        }
        String string = bundle.getString("data");
        boolean z = bundle.getBoolean("tx_isbatch");
        if (string == null || string.isEmpty()) {
            activity.KWHzl(-1, C43246rlf.OLrzqt.valueOf().getString(C13754dXa.FragmentManager.DDDCac));
            return;
        }
        C43246rlf c43246rlf = C43246rlf.OLrzqt;
        if (c43246rlf.valueOf().getString(C13754dXa.FragmentManager.DDDCac).equals(string)) {
            activity.KWHzl(-1, c43246rlf.valueOf().getString(C13754dXa.FragmentManager.DDDCac));
            return;
        }
        if (z) {
            try {
                JSONObject jSONObject = new JSONObject(bundle.getString("tx_id"));
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("txHash", string);
                jSONObject2.put("orderIds", str);
                jSONObject2.put("batchId", jSONObject.get("batchId"));
                application.copydefault(jSONObject2.toString());
                return;
            } catch (JSONException unused) {
                application.copydefault(string);
                return;
            }
        }
        application.copydefault(string);
    }

    @LuaBridge
    public boolean isValidAddress(LuaValue[] luaValueArr) {
        if (luaValueArr == null || luaValueArr.length < 2) {
            return true;
        }
        return ((InterfaceC9852bdR) C43248rlh.KWHzl.AEQbTJ(InterfaceC9852bdR.class)).AhwBna().AEQbTJ(luaValueArr[0].toJavaString(), luaValueArr[1].toLong());
    }

    @LuaBridge
    public UDNativeLoader queryGasLimit(final LuaValue[] luaValueArr) {
        UDNativeLoader uDNativeLoader = new UDNativeLoader(this.globals, luaValueArr);
        uDNativeLoader.copydefault(new UDNativeLoader.StateListAnimator() { // from class: com.okinc.wallet.mln.service.UDWalletCore.19
            @Override // com.immomo.mls.fun.ud.UDNativeLoader.StateListAnimator
            public void OLrzqt() {
            }

            @Override // com.immomo.mls.fun.ud.UDNativeLoader.StateListAnimator
            public void copydefault(final UDNativeLoader.Application application, final UDNativeLoader.Activity activity) {
                LuaValue[] luaValueArr2 = luaValueArr;
                if (luaValueArr2 == null || luaValueArr2.length < 5) {
                    activity.KWHzl(-1, "wrong params");
                    return;
                }
                InterfaceC9852bdR interfaceC9852bdR = (InterfaceC9852bdR) C43248rlh.KWHzl.AEQbTJ(InterfaceC9852bdR.class);
                String javaString = luaValueArr[0].toJavaString();
                String javaString2 = luaValueArr[1].toJavaString();
                String javaString3 = luaValueArr[2].toJavaString();
                long j = luaValueArr[4].toLong();
                interfaceC9852bdR.KWHzl(javaString, javaString2, javaString3, Long.valueOf(j), luaValueArr[3].toJavaString()).AEQbTJ(new InterfaceC58227yxM<ResponseData<GasLimitBean>>() { // from class: com.okinc.wallet.mln.service.UDWalletCore.19.5
                    /* JADX DEBUG: Method merged with bridge method: accept(Ljava/lang/Object;)V */
                    @Override // o.InterfaceC58227yxM
                    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
                    public void accept(ResponseData<GasLimitBean> responseData) throws Exception {
                        if (responseData.isSucceed()) {
                            UDNativeLoader.Application application2 = application;
                            if (application2 != null) {
                                application2.copydefault(C33490mxT.OLrzqt(responseData.getData()));
                                return;
                            }
                            return;
                        }
                        UDNativeLoader.Activity activity2 = activity;
                        if (activity2 != null) {
                            activity2.KWHzl(responseData.getCode(), responseData.getMsg());
                        }
                    }
                }, new InterfaceC58227yxM<Throwable>() { // from class: com.okinc.wallet.mln.service.UDWalletCore.19.2
                    /* JADX DEBUG: Method merged with bridge method: accept(Ljava/lang/Object;)V */
                    @Override // o.InterfaceC58227yxM
                    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
                    public void accept(Throwable th) throws Exception {
                        UDNativeLoader.Activity activity2 = activity;
                        if (activity2 == null || !(th instanceof OKServerException)) {
                            return;
                        }
                        OKServerException oKServerException = (OKServerException) th;
                        activity2.KWHzl(oKServerException.getCode(), oKServerException.getMessage());
                    }
                });
            }
        });
        return uDNativeLoader;
    }

    @LuaBridge
    public UDNativeLoader getGasPrice(final LuaValue[] luaValueArr) {
        UDNativeLoader uDNativeLoader = new UDNativeLoader(this.globals, luaValueArr);
        uDNativeLoader.copydefault(new UDNativeLoader.StateListAnimator() { // from class: com.okinc.wallet.mln.service.UDWalletCore.16
            @Override // com.immomo.mls.fun.ud.UDNativeLoader.StateListAnimator
            public void OLrzqt() {
            }

            @Override // com.immomo.mls.fun.ud.UDNativeLoader.StateListAnimator
            public void copydefault(final UDNativeLoader.Application application, final UDNativeLoader.Activity activity) {
                LuaValue[] luaValueArr2 = luaValueArr;
                if (luaValueArr2 == null || luaValueArr2.length < 1) {
                    activity.KWHzl(-1, "wrong params");
                } else {
                    ((InterfaceC9852bdR) C43248rlh.KWHzl.AEQbTJ(InterfaceC9852bdR.class)).OLrzqt(luaValueArr[0].toJavaString()).AEQbTJ(new InterfaceC58227yxM<ResponseData<GasPriceBean>>() { // from class: com.okinc.wallet.mln.service.UDWalletCore.16.2
                        /* JADX DEBUG: Method merged with bridge method: accept(Ljava/lang/Object;)V */
                        @Override // o.InterfaceC58227yxM
                        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
                        public void accept(ResponseData<GasPriceBean> responseData) throws Exception {
                            if (responseData.isSucceed()) {
                                if (application != null) {
                                    application.copydefault(C7869arv.KWHzl(UDWalletCore.this.globals, new JSONObject(C33490mxT.OLrzqt(responseData.getData()))));
                                    return;
                                }
                                return;
                            }
                            UDNativeLoader.Activity activity2 = activity;
                            if (activity2 != null) {
                                activity2.KWHzl(responseData.getCode(), responseData.getMsg());
                            }
                        }
                    }, new InterfaceC58227yxM<Throwable>() { // from class: com.okinc.wallet.mln.service.UDWalletCore.16.1
                        /* JADX DEBUG: Method merged with bridge method: accept(Ljava/lang/Object;)V */
                        @Override // o.InterfaceC58227yxM
                        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
                        public void accept(Throwable th) throws Exception {
                            UDNativeLoader.Activity activity2 = activity;
                            if (activity2 == null || !(th instanceof OKServerException)) {
                                return;
                            }
                            OKServerException oKServerException = (OKServerException) th;
                            activity2.KWHzl(oKServerException.getCode(), oKServerException.getMessage());
                        }
                    });
                }
            }
        });
        return uDNativeLoader;
    }

    @LuaBridge
    public UDNativeLoader getGasPriceWithChainId(final LuaValue[] luaValueArr) {
        UDNativeLoader uDNativeLoader = new UDNativeLoader(this.globals, luaValueArr);
        uDNativeLoader.copydefault(new UDNativeLoader.StateListAnimator() { // from class: com.okinc.wallet.mln.service.UDWalletCore.24
            @Override // com.immomo.mls.fun.ud.UDNativeLoader.StateListAnimator
            public void OLrzqt() {
            }

            @Override // com.immomo.mls.fun.ud.UDNativeLoader.StateListAnimator
            public void copydefault(final UDNativeLoader.Application application, final UDNativeLoader.Activity activity) {
                LuaValue[] luaValueArr2 = luaValueArr;
                if (luaValueArr2 == null || luaValueArr2.length < 1) {
                    activity.KWHzl(-1, "wrong params");
                } else {
                    ((InterfaceC9852bdR) C43248rlh.KWHzl.AEQbTJ(InterfaceC9852bdR.class)).KWHzl(luaValueArr[0].toLong()).AEQbTJ(new InterfaceC58227yxM<ResponseData<GasPriceBean>>() { // from class: com.okinc.wallet.mln.service.UDWalletCore.24.3
                        /* JADX DEBUG: Method merged with bridge method: accept(Ljava/lang/Object;)V */
                        @Override // o.InterfaceC58227yxM
                        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
                        public void accept(ResponseData<GasPriceBean> responseData) throws Exception {
                            if (responseData.isSucceed()) {
                                if (application != null) {
                                    application.copydefault(C7869arv.KWHzl(UDWalletCore.this.globals, new JSONObject(C33490mxT.OLrzqt(responseData.getData()))));
                                    return;
                                }
                                return;
                            }
                            UDNativeLoader.Activity activity2 = activity;
                            if (activity2 != null) {
                                activity2.KWHzl(responseData.getCode(), responseData.getMsg());
                            }
                        }
                    }, new InterfaceC58227yxM<Throwable>() { // from class: com.okinc.wallet.mln.service.UDWalletCore.24.4
                        /* JADX DEBUG: Method merged with bridge method: accept(Ljava/lang/Object;)V */
                        @Override // o.InterfaceC58227yxM
                        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
                        public void accept(Throwable th) throws Exception {
                            UDNativeLoader.Activity activity2 = activity;
                            if (activity2 == null || !(th instanceof OKServerException)) {
                                return;
                            }
                            OKServerException oKServerException = (OKServerException) th;
                            activity2.KWHzl(oKServerException.getCode(), oKServerException.getMessage());
                        }
                    });
                }
            }
        });
        return uDNativeLoader;
    }

    @LuaBridge
    public UDNativeLoader signMessage(LuaValue[] luaValueArr) {
        UDImageInfo uDImageInfo = null;
        int i = 0;
        String javaString = (luaValueArr.length <= 0 || !luaValueArr[0].isString()) ? null : luaValueArr[0].toJavaString();
        String javaString2 = (luaValueArr.length <= 1 || !luaValueArr[1].isString()) ? null : luaValueArr[1].toJavaString();
        long j = luaValueArr[2].toLong();
        String javaString3 = (luaValueArr.length <= 3 || !luaValueArr[3].isString()) ? null : luaValueArr[3].toJavaString();
        if (luaValueArr.length > 4 && !luaValueArr[4].isNil()) {
            uDImageInfo = (UDImageInfo) C8017aul.AEQbTJ(luaValueArr[4], UDImageInfo.class);
        }
        UDImageInfo uDImageInfo2 = uDImageInfo;
        boolean z = luaValueArr.length > 5 ? luaValueArr[5].toBoolean() : false;
        if (luaValueArr.length > 6 && !luaValueArr[6].isNil()) {
            i = luaValueArr[6].toInt();
        }
        return OLrzqt(javaString, javaString2, j, javaString3, uDImageInfo2, z, i);
    }

    @LuaBridge
    public UDNativeLoader btcSignPsbt(LuaValue[] luaValueArr) {
        UDImageInfo uDImageInfo = null;
        String javaString = (luaValueArr.length <= 0 || !luaValueArr[0].isString()) ? null : luaValueArr[0].toJavaString();
        String javaString2 = (luaValueArr.length <= 1 || !luaValueArr[1].isString()) ? null : luaValueArr[1].toJavaString();
        long j = luaValueArr[2].toLong();
        String javaString3 = (luaValueArr.length <= 3 || !luaValueArr[3].isString()) ? null : luaValueArr[3].toJavaString();
        if (luaValueArr.length > 4 && !luaValueArr[4].isNil()) {
            uDImageInfo = (UDImageInfo) C8017aul.AEQbTJ(luaValueArr[4], UDImageInfo.class);
        }
        return OLrzqt(javaString, javaString2, j, javaString3, uDImageInfo, luaValueArr.length > 5 ? luaValueArr[5].toBoolean() : false, (luaValueArr.length <= 6 || luaValueArr[6].isNil()) ? 1 : luaValueArr[6].toInt());
    }

    public final UDNativeLoader OLrzqt(final String str, final String str2, final long j, final String str3, final UDImageInfo uDImageInfo, final boolean z, int i) {
        final String str4;
        if (j == 0 || j == 70000061 || j == 70000038 || j == 70000047) {
            str4 = i != 1 ? i != 2 ? "btc_message" : "btc_psbts" : "btc_psbt";
        } else {
            str4 = null;
        }
        UDNativeLoader uDNativeLoader = new UDNativeLoader(this.globals, (Object) null);
        uDNativeLoader.copydefault(new UDNativeLoader.StateListAnimator() { // from class: com.okinc.wallet.mln.service.UDWalletCore.25
            @Override // com.immomo.mls.fun.ud.UDNativeLoader.StateListAnimator
            public void OLrzqt() {
            }

            @Override // com.immomo.mls.fun.ud.UDNativeLoader.StateListAnimator
            public void copydefault(final UDNativeLoader.Application application, final UDNativeLoader.Activity activity) {
                String strCopydefault;
                String strKWHzl = UDWalletCore.KWHzl(j);
                PlatformItem platformItem = new PlatformItem();
                String str5 = str3;
                if (str5 == null) {
                    str5 = "";
                }
                platformItem.setPlatform(str5);
                if (uDImageInfo != null && (strCopydefault = UDWalletCore.copydefault(C43246rlf.OLrzqt.valueOf(), uDImageInfo)) != null) {
                    platformItem.setLogo(strCopydefault);
                }
                platformItem.setNetwork(strKWHzl);
                ((InterfaceC9854bdT) C43248rlh.KWHzl.OLrzqt(InterfaceC9854bdT.class)).EZpvd(UDWalletCore.OLrzqt(UDWalletCore.this.globals), new DappSignArgs(str2, String.valueOf(j), platformItem, str, MpcSignType.NORMAL, !z, 4, "dapp", null, null, false, false, str4, null, null, null, null, null, false, NostrSignType.MESSAGE, "V4", Boolean.FALSE), new Function1<Bundle, Unit>() { // from class: com.okinc.wallet.mln.service.UDWalletCore.25.1
                    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
                    public Unit invoke(Bundle bundle) {
                        UDWalletCore.this.OLrzqt(bundle, application, activity, (String) null);
                        return null;
                    }
                }, null);
            }
        });
        return uDNativeLoader;
    }

    @LuaBridge
    public UDNativeLoader signEIP712Message(LuaValue[] luaValueArr) {
        UDImageInfo uDImageInfo = null;
        String javaString = (luaValueArr.length <= 0 || !luaValueArr[0].isString()) ? null : luaValueArr[0].toJavaString();
        String javaString2 = (luaValueArr.length <= 1 || !luaValueArr[1].isString()) ? null : luaValueArr[1].toJavaString();
        long j = luaValueArr[2].toLong();
        String javaString3 = (luaValueArr.length <= 3 || !luaValueArr[3].isString()) ? null : luaValueArr[3].toJavaString();
        if (luaValueArr.length > 4 && !luaValueArr[4].isNil()) {
            uDImageInfo = (UDImageInfo) C8017aul.AEQbTJ(luaValueArr[4], UDImageInfo.class);
        }
        return AEQbTJ(javaString, javaString2, j, javaString3, uDImageInfo);
    }

    public final UDNativeLoader AEQbTJ(final String str, final String str2, final long j, final String str3, final UDImageInfo uDImageInfo) {
        UDNativeLoader uDNativeLoader = new UDNativeLoader(this.globals, (Object) null);
        uDNativeLoader.copydefault(new UDNativeLoader.StateListAnimator() { // from class: com.okinc.wallet.mln.service.UDWalletCore.5
            @Override // com.immomo.mls.fun.ud.UDNativeLoader.StateListAnimator
            public void OLrzqt() {
            }

            @Override // com.immomo.mls.fun.ud.UDNativeLoader.StateListAnimator
            public void copydefault(final UDNativeLoader.Application application, final UDNativeLoader.Activity activity) {
                String strCopydefault;
                String strKWHzl = UDWalletCore.KWHzl(j);
                PlatformItem platformItem = new PlatformItem();
                String str4 = str3;
                if (str4 == null) {
                    str4 = "";
                }
                platformItem.setPlatform(str4);
                if (uDImageInfo != null && (strCopydefault = UDWalletCore.copydefault(C43246rlf.OLrzqt.valueOf(), uDImageInfo)) != null) {
                    platformItem.setLogo(strCopydefault);
                }
                platformItem.setNetwork(strKWHzl);
                ((InterfaceC9854bdT) C43248rlh.KWHzl.OLrzqt(InterfaceC9854bdT.class)).EZpvd(UDWalletCore.OLrzqt(UDWalletCore.this.globals), new DappSignArgs(str2, String.valueOf(j), platformItem, str, MpcSignType.NORMAL, false, 4, "dapp", null, null, false, false, DappSignArgs.SIGN_TYPEDMESSAGE, SignType.TYPED_MESSAGE, null, str, null, null, false, NostrSignType.MESSAGE, "V4", Boolean.FALSE), new Function1<Bundle, Unit>() { // from class: com.okinc.wallet.mln.service.UDWalletCore.5.3
                    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
                    public Unit invoke(Bundle bundle) {
                        UDWalletCore.this.OLrzqt(bundle, application, activity, (String) null);
                        return null;
                    }
                }, null);
            }
        });
        return uDNativeLoader;
    }

    @LuaBridge
    public String solFindProgramAddress(String str, String str2, String str3) {
        return ((InterfaceC9852bdR) C43248rlh.KWHzl.AEQbTJ(InterfaceC9852bdR.class)).AEQbTJ(str, str2, str3);
    }

    /* JADX INFO: renamed from: com.okinc.wallet.mln.service.UDWalletCore$1, reason: invalid class name */
    public class AnonymousClass1 implements UDNativeLoader.StateListAnimator {
        public final /* synthetic */ LuaValue[] EZpvd;

        @Override // com.immomo.mls.fun.ud.UDNativeLoader.StateListAnimator
        public void OLrzqt() {
        }

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public AnonymousClass1(LuaValue[] luaValueArr) {
            this.EZpvd = luaValueArr;
        }

        @Override // com.immomo.mls.fun.ud.UDNativeLoader.StateListAnimator
        public void copydefault(final UDNativeLoader.Application application, UDNativeLoader.Activity activity) {
            LuaValue[] luaValueArr = this.EZpvd;
            if (luaValueArr == null || luaValueArr.length < 2) {
                activity.KWHzl(-1, "wrong params");
            } else {
                LuaValue luaValue = luaValueArr[1];
                C57259yez.copydefault.KWHzl(this.EZpvd[0].toJavaString(), luaValue != null ? luaValue.toJavaString() : "", new ValueCallback() { // from class: o.ydX
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // android.webkit.ValueCallback
                    public final void onReceiveValue(java.lang.Object obj) {
                        application.copydefault((java.lang.String) obj);
                    }
                });
            }
        }
    }

    @LuaBridge
    public UDNativeLoader runSolanaJS(LuaValue[] luaValueArr) {
        UDNativeLoader uDNativeLoader = new UDNativeLoader(this.globals, luaValueArr);
        uDNativeLoader.copydefault(new AnonymousClass1(luaValueArr));
        return uDNativeLoader;
    }

    /* JADX INFO: renamed from: com.okinc.wallet.mln.service.UDWalletCore$2, reason: invalid class name */
    public class AnonymousClass2 implements UDNativeLoader.StateListAnimator {
        public final /* synthetic */ LuaValue[] copydefault;

        @Override // com.immomo.mls.fun.ud.UDNativeLoader.StateListAnimator
        public void OLrzqt() {
        }

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public AnonymousClass2(LuaValue[] luaValueArr) {
            this.copydefault = luaValueArr;
        }

        @Override // com.immomo.mls.fun.ud.UDNativeLoader.StateListAnimator
        public void copydefault(final UDNativeLoader.Application application, UDNativeLoader.Activity activity) {
            LuaValue[] luaValueArr = this.copydefault;
            if (luaValueArr == null || luaValueArr.length < 2) {
                activity.KWHzl(-1, "wrong params");
            } else {
                LuaValue luaValue = luaValueArr[1];
                C57259yez.copydefault.OLrzqt(this.copydefault[0].toJavaString(), luaValue != null ? luaValue.toJavaString() : "", new ValueCallback() { // from class: o.ydU
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // android.webkit.ValueCallback
                    public final void onReceiveValue(java.lang.Object obj) {
                        application.copydefault((java.lang.String) obj);
                    }
                });
            }
        }
    }

    @LuaBridge
    public UDNativeLoader runSolanaJSAsync(LuaValue[] luaValueArr) {
        UDNativeLoader uDNativeLoader = new UDNativeLoader(this.globals, luaValueArr);
        uDNativeLoader.copydefault(new AnonymousClass2(luaValueArr));
        return uDNativeLoader;
    }

    /* JADX INFO: renamed from: com.okinc.wallet.mln.service.UDWalletCore$3, reason: invalid class name */
    public class AnonymousClass3 implements UDNativeLoader.StateListAnimator {
        public final /* synthetic */ LuaValue[] copydefault;

        @Override // com.immomo.mls.fun.ud.UDNativeLoader.StateListAnimator
        public void OLrzqt() {
        }

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public AnonymousClass3(LuaValue[] luaValueArr) {
            this.copydefault = luaValueArr;
        }

        @Override // com.immomo.mls.fun.ud.UDNativeLoader.StateListAnimator
        public void copydefault(final UDNativeLoader.Application application, UDNativeLoader.Activity activity) {
            LuaValue[] luaValueArr = this.copydefault;
            if (luaValueArr == null || luaValueArr.length < 2) {
                activity.KWHzl(-1, "wrong params");
            } else {
                LuaValue luaValue = luaValueArr[1];
                C57259yez.copydefault.copydefault(this.copydefault[0].toJavaString(), luaValue != null ? luaValue.toJavaString() : "", new ValueCallback() { // from class: o.ydY
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // android.webkit.ValueCallback
                    public final void onReceiveValue(java.lang.Object obj) {
                        application.copydefault((java.lang.String) obj);
                    }
                });
            }
        }
    }

    @LuaBridge
    public UDNativeLoader runTrustMinJS(LuaValue[] luaValueArr) {
        UDNativeLoader uDNativeLoader = new UDNativeLoader(this.globals, luaValueArr);
        uDNativeLoader.copydefault(new AnonymousClass3(luaValueArr));
        return uDNativeLoader;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0013  */
    @LuaBridge
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public LuaValue[] changeCurrentWalletToMain(LuaValue[] luaValueArr) {
        if (luaValueArr != null && luaValueArr.length > 0) {
            if (luaValueArr.length > 1) {
                LuaValue luaValue = luaValueArr[1];
                final LuaFunction luaFunction = luaValue instanceof LuaFunction ? (LuaFunction) luaValue : null;
                ((InterfaceC9852bdR) C43248rlh.KWHzl.AEQbTJ(InterfaceC9852bdR.class)).gEmmrt().copydefault(luaValueArr[0].toJavaString()).AEQbTJ(new InterfaceC58227yxM() { // from class: o.ydP
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.InterfaceC58227yxM
                    public final void accept(java.lang.Object obj) throws java.lang.Exception {
                        UDWalletCore.EZpvd(luaFunction, (java.lang.Integer) obj);
                    }
                }, new InterfaceC58227yxM() { // from class: o.ydR
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.InterfaceC58227yxM
                    public final void accept(java.lang.Object obj) throws java.lang.Exception {
                        UDWalletCore.KWHzl(luaFunction, (java.lang.Throwable) obj);
                    }
                });
            }
        }
        return null;
    }

    public static /* synthetic */ void EZpvd(LuaFunction luaFunction, Integer num) throws Exception {
        if (luaFunction != null) {
            luaFunction.invoke(LuaValue.rTrue());
        }
    }

    public static /* synthetic */ void KWHzl(LuaFunction luaFunction, Throwable th) throws Exception {
        if (luaFunction != null) {
            luaFunction.invoke(LuaValue.rFalse());
        }
    }

    public static String KWHzl(long j) {
        InterfaceC9731bbC interfaceC9731bbCEZpvd = ((InterfaceC9852bdR) C43248rlh.KWHzl.AEQbTJ(InterfaceC9852bdR.class)).copydefault().EZpvd(j, false);
        if (interfaceC9731bbCEZpvd != null) {
            return interfaceC9731bbCEZpvd.djBIcL();
        }
        return j == 1 ? "Ethereum" : j == 56 ? "BSC" : "OKExChain";
    }

    public static String copydefault(Context context, UDImageInfo uDImageInfo) {
        JDImageInfo jDImageInfoEZpvd = uDImageInfo.EZpvd();
        if (TextUtils.isEmpty(jDImageInfoEZpvd.getLocalUrl())) {
            return null;
        }
        return C7323ahf.AYXKKw().OLrzqt(context, jDImageInfoEZpvd);
    }

    /* JADX INFO: renamed from: com.okinc.wallet.mln.service.UDWalletCore$6, reason: invalid class name */
    public class AnonymousClass6 implements UDNativeLoader.StateListAnimator {
        public final /* synthetic */ String EZpvd;
        public final /* synthetic */ String KWHzl;

        @Override // com.immomo.mls.fun.ud.UDNativeLoader.StateListAnimator
        public void OLrzqt() {
        }

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public AnonymousClass6(String str, String str2) {
            this.EZpvd = str;
            this.KWHzl = str2;
        }

        @Override // com.immomo.mls.fun.ud.UDNativeLoader.StateListAnimator
        public void copydefault(final UDNativeLoader.Application application, final UDNativeLoader.Activity activity) {
            ((InterfaceC9854bdT) C43248rlh.KWHzl.AEQbTJ(InterfaceC9854bdT.class)).EZpvd(new DuplicateOrderReq(this.EZpvd, this.KWHzl)).AEQbTJ(new InterfaceC58227yxM() { // from class: o.ydV
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) throws java.lang.Exception {
                    this.KWHzl.AEQbTJ(application, (DuplicateOrder) obj);
                }
            }, new InterfaceC58227yxM() { // from class: o.ydW
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) throws java.lang.Exception {
                    UDWalletCore.AnonymousClass6.KWHzl(activity, (java.lang.Throwable) obj);
                }
            });
        }

        public final /* synthetic */ void AEQbTJ(UDNativeLoader.Application application, DuplicateOrder duplicateOrder) throws Exception {
            JSONObject jSONObject = new JSONObject(new Gson().toJson(duplicateOrder));
            if (UDWalletCore.this.globals == null || UDWalletCore.this.globals.isDestroyed()) {
                return;
            }
            application.copydefault(C7869arv.KWHzl(UDWalletCore.this.globals, jSONObject));
        }

        public static /* synthetic */ void KWHzl(UDNativeLoader.Activity activity, Throwable th) throws Exception {
            activity.KWHzl(-1, th.getMessage());
        }
    }

    @LuaBridge
    public UDNativeLoader checkDuplicateOrder(String str, String str2) {
        UDNativeLoader uDNativeLoader = new UDNativeLoader(this.globals, (Object) null);
        uDNativeLoader.copydefault(new AnonymousClass6(str, str2));
        return uDNativeLoader;
    }

    @LuaBridge
    public String ethEcRecover(String str, String str2, Boolean bool) {
        return ((InterfaceC9852bdR) C43248rlh.KWHzl.AEQbTJ(InterfaceC9852bdR.class)).AEQbTJ(str, str2, bool.booleanValue());
    }

    /* JADX INFO: renamed from: com.okinc.wallet.mln.service.UDWalletCore$9, reason: invalid class name */
    public class AnonymousClass9 implements UDNativeLoader.StateListAnimator {
        public InterfaceC58217yxC EZpvd = null;
        public final /* synthetic */ String OLrzqt;
        public final /* synthetic */ int copydefault;

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public AnonymousClass9(String str, int i) {
            this.OLrzqt = str;
            this.copydefault = i;
        }

        @Override // com.immomo.mls.fun.ud.UDNativeLoader.StateListAnimator
        public void copydefault(final UDNativeLoader.Application application, UDNativeLoader.Activity activity) {
            this.EZpvd = ((InterfaceC54832xWz) C43248rlh.KWHzl.AEQbTJ(InterfaceC54832xWz.class)).AEQbTJ(this.OLrzqt, this.copydefault).AEQbTJ(new InterfaceC58227yxM() { // from class: o.ydZ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) throws java.lang.Exception {
                    UDWalletCore.AnonymousClass9.KWHzl(application, (java.util.ArrayList) obj);
                }
            }, new InterfaceC58227yxM() { // from class: o.yeb
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) throws java.lang.Exception {
                    UDWalletCore.AnonymousClass9.OLrzqt(application, (java.lang.Throwable) obj);
                }
            });
        }

        public static /* synthetic */ void KWHzl(UDNativeLoader.Application application, ArrayList arrayList) throws Exception {
            application.copydefault(LuaString.copydefault(C33490mxT.OLrzqt(arrayList)));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void OLrzqt(UDNativeLoader.Application application, Throwable th) throws Exception {
            application.copydefault(LuaString.copydefault(""));
        }

        @Override // com.immomo.mls.fun.ud.UDNativeLoader.StateListAnimator
        public void OLrzqt() {
            InterfaceC58217yxC interfaceC58217yxC = this.EZpvd;
            if (interfaceC58217yxC != null) {
                interfaceC58217yxC.dispose();
            }
        }
    }

    @LuaBridge
    public UDNativeLoader getAddressBookInfos(String str, int i) {
        UDNativeLoader uDNativeLoader = new UDNativeLoader(this.globals, (Object) null);
        uDNativeLoader.copydefault(new AnonymousClass9(str, i));
        return uDNativeLoader;
    }

    /* JADX INFO: renamed from: com.okinc.wallet.mln.service.UDWalletCore$10, reason: invalid class name */
    public class AnonymousClass10 implements UDNativeLoader.StateListAnimator {
        public final /* synthetic */ int AEQbTJ;
        public final /* synthetic */ String EZpvd;
        public InterfaceC58217yxC KWHzl = null;
        public final /* synthetic */ String OLrzqt;

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public AnonymousClass10(String str, int i, String str2) {
            this.EZpvd = str;
            this.AEQbTJ = i;
            this.OLrzqt = str2;
        }

        @Override // com.immomo.mls.fun.ud.UDNativeLoader.StateListAnimator
        public void copydefault(final UDNativeLoader.Application application, UDNativeLoader.Activity activity) {
            this.KWHzl = ((InterfaceC54832xWz) C43248rlh.KWHzl.AEQbTJ(InterfaceC54832xWz.class)).EZpvd(this.EZpvd, this.AEQbTJ, this.OLrzqt).AEQbTJ(new InterfaceC58227yxM() { // from class: o.yec
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) throws java.lang.Exception {
                    UDWalletCore.AnonymousClass10.AEQbTJ(application, (java.util.ArrayList) obj);
                }
            }, new InterfaceC58227yxM() { // from class: o.yea
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) throws java.lang.Exception {
                    UDWalletCore.AnonymousClass10.KWHzl(application, (java.lang.Throwable) obj);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void AEQbTJ(UDNativeLoader.Application application, ArrayList arrayList) throws Exception {
            application.copydefault(LuaString.copydefault(C33490mxT.OLrzqt(arrayList)));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void KWHzl(UDNativeLoader.Application application, Throwable th) throws Exception {
            application.copydefault(LuaString.copydefault(""));
        }

        @Override // com.immomo.mls.fun.ud.UDNativeLoader.StateListAnimator
        public void OLrzqt() {
            InterfaceC58217yxC interfaceC58217yxC = this.KWHzl;
            if (interfaceC58217yxC != null) {
                interfaceC58217yxC.dispose();
            }
        }
    }

    @LuaBridge
    public UDNativeLoader getWalletAddressInfos(String str, int i, String str2) {
        UDNativeLoader uDNativeLoader = new UDNativeLoader(this.globals, (Object) null);
        uDNativeLoader.copydefault(new AnonymousClass10(str, i, str2));
        return uDNativeLoader;
    }

    @LuaBridge
    public LuaValue getAllWalletsList(LuaValue[] luaValueArr) {
        List<InterfaceC9735bbG> listAEQbTJ = C12827cuN.AYXKKw().AEQbTJ();
        JSONArray jSONArray = new JSONArray();
        if (listAEQbTJ.isEmpty()) {
            return C7869arv.KWHzl(this.globals, jSONArray);
        }
        try {
            for (InterfaceC9735bbG interfaceC9735bbG : listAEQbTJ) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("rootName", interfaceC9735bbG.AEQbTJ(false));
                jSONObject.put("rootNameColor", interfaceC9735bbG.OLrzqt().replace(ModelIdentifier.Helper.PRIMARY_KEY_DELIMITER, ""));
                jSONObject.put("rootIsBackUp", interfaceC9735bbG.AEQbTJ());
                JSONArray jSONArray2 = new JSONArray();
                for (InterfaceC9738bbJ interfaceC9738bbJ : interfaceC9735bbG.KWHzl()) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("walletInfo", new UDWallet(this.globals, interfaceC9738bbJ));
                    jSONArray2.put(jSONObject2);
                }
                jSONObject.put("dataList", jSONArray2);
                jSONArray.put(jSONObject);
            }
            return C7869arv.KWHzl(this.globals, jSONArray);
        } catch (Exception unused) {
            return C7869arv.KWHzl(this.globals, new JSONArray((Collection) new ArrayList()));
        }
    }

    @LuaBridge
    public LuaValue[] convertCoinAmt(LuaValue[] luaValueArr) {
        if (luaValueArr == null || luaValueArr.length == 0) {
            return null;
        }
        LuaValue luaValue = luaValueArr[0];
        String javaString = luaValue != null ? luaValue.toJavaString() : "";
        LuaValue luaValue2 = luaValueArr[1];
        long j = luaValue2 != null ? luaValue2.toLong() : 0L;
        C43248rlh c43248rlh = C43248rlh.KWHzl;
        InterfaceC9731bbC interfaceC9731bbCAEQbTJ = ((InterfaceC9852bdR) c43248rlh.AEQbTJ(InterfaceC9852bdR.class)).copydefault().AEQbTJ(j, false);
        if (interfaceC9731bbCAEQbTJ == null) {
            return LuaValue.rNil();
        }
        return LuaValue.rString(((xWI) c43248rlh.AEQbTJ(xWI.class)).copydefault(javaString, interfaceC9731bbCAEQbTJ));
    }

    @LuaBridge
    public LuaValue[] openBrc20InscriptionTransferPage(LuaValue[] luaValueArr) {
        String javaString;
        AppCompatActivity appCompatActivity = (AppCompatActivity) OLrzqt(this.globals);
        if (luaValueArr != null && luaValueArr.length > 2 && appCompatActivity != null) {
            LuaValue luaValue = luaValueArr[0];
            String javaString2 = luaValue != null ? luaValue.toJavaString() : "";
            LuaValue luaValue2 = luaValueArr[1];
            String javaString3 = luaValue2 != null ? luaValue2.toJavaString() : "";
            LuaValue luaValue3 = luaValueArr[2];
            String javaString4 = luaValue3 != null ? luaValue3.toJavaString() : "";
            if (luaValueArr.length > 5) {
                LuaValue luaValue4 = luaValueArr[5];
                javaString = luaValue4 != null ? luaValue4.toJavaString() : javaString4;
            } else {
                javaString = javaString4;
            }
            ((WalletDappInteractionBizService) C43248rlh.KWHzl.AEQbTJ(WalletDappInteractionBizService.class)).EZpvd(appCompatActivity, javaString3, javaString2, javaString4, javaString, luaValueArr.length > 6 ? Integer.valueOf(luaValueArr[6].toInt()) : null, luaValueArr.length > 7 ? Long.valueOf(luaValueArr[7].toLong()) : null, luaValueArr.length > 8 ? luaValueArr[8].toJavaString() : null);
        }
        return null;
    }

    /* JADX INFO: renamed from: com.okinc.wallet.mln.service.UDWalletCore$8, reason: invalid class name */
    public class AnonymousClass8 implements UDNativeLoader.StateListAnimator {
        public final AppCompatActivity copydefault;

        @Override // com.immomo.mls.fun.ud.UDNativeLoader.StateListAnimator
        public void OLrzqt() {
        }

        public AnonymousClass8() {
            this.copydefault = (AppCompatActivity) UDWalletCoreNew.KWHzl(UDWalletCore.this.globals);
        }

        @Override // com.immomo.mls.fun.ud.UDNativeLoader.StateListAnimator
        public void copydefault(final UDNativeLoader.Application application, final UDNativeLoader.Activity activity) {
            C12827cuN.AYXKKw().EZpvd(true, false, true).AEQbTJ(new InterfaceC58227yxM() { // from class: o.yed
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) throws java.lang.Exception {
                    this.AEQbTJ.copydefault(application, (java.util.List) obj);
                }
            }, new InterfaceC58227yxM() { // from class: o.yef
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    activity.KWHzl(-1, "");
                }
            });
        }

        public final /* synthetic */ void copydefault(final UDNativeLoader.Application application, List list) throws Exception {
            ((MpcWalletService) C43248rlh.KWHzl.AEQbTJ(MpcWalletService.class)).KWHzl((List<? extends InterfaceC9738bbJ>) list, this.copydefault, new Function1() { // from class: o.yeg
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return UDWalletCore.AnonymousClass8.KWHzl(application, (java.util.Map) obj);
                }
            });
        }

        public static /* synthetic */ Unit KWHzl(UDNativeLoader.Application application, Map map) {
            application.copydefault(null);
            return null;
        }
    }

    @LuaBridge
    public UDNativeLoader getAllMpcWalletStatus() {
        UDNativeLoader uDNativeLoader = new UDNativeLoader(this.globals, (Object) null);
        uDNativeLoader.copydefault(new AnonymousClass8());
        return uDNativeLoader;
    }

    @LuaBridge
    public LuaValue showWalletUpgradeVC(int i, String str, final LuaFunction luaFunction) {
        ((InterfaceC54829xWw) C43248rlh.KWHzl.AEQbTJ(InterfaceC54829xWw.class)).copydefault(i, ((AppCompatActivity) UDWalletCoreNew.KWHzl(this.globals)).getSupportFragmentManager(), new Function1<Boolean, Unit>() { // from class: com.okinc.wallet.mln.service.UDWalletCore.7
            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
            public Unit invoke(Boolean bool) {
                if (bool.booleanValue()) {
                    luaFunction.invoke(null);
                }
                return Unit.INSTANCE;
            }
        });
        return null;
    }

    @LuaBridge
    public LuaValue userUniqueId() {
        String strDjBIcL;
        try {
            strDjBIcL = ((InterfaceC9852bdR) C43248rlh.KWHzl.AEQbTJ(InterfaceC9852bdR.class)).djBIcL();
        } catch (Exception unused) {
            strDjBIcL = "";
        }
        return LuaString.copydefault(strDjBIcL);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r7v3, resolved type: I */
    /* JADX WARN: Multi-variable type inference failed */
    @LuaBridge
    public LuaValue loadWalletAvatar(LuaValue[] luaValueArr) {
        LuaValue luaValue;
        LuaValue luaValue2;
        if (luaValueArr.length < 2) {
            return null;
        }
        int i = 0;
        InterfaceC9738bbJ interfaceC9738bbJOLrzqt = ((InterfaceC9852bdR) C43251rlk.copydefault(InterfaceC9852bdR.class)).gEmmrt().OLrzqt(luaValueArr[0].toJavaString());
        if (luaValueArr.length > 2 && (luaValue2 = luaValueArr[2]) != null) {
            i = luaValue2.toInt();
        }
        final UDImageInfo uDImageInfo = (luaValueArr.length <= 3 || (luaValue = luaValueArr[3]) == null) ? null : (UDImageInfo) luaValue;
        final ImageView imageView = (ImageView) ((UDImageView) luaValueArr[1]).f_();
        C5335Nt<Drawable> c5335NtKWHzl = Glide.AEQbTJ(imageView.getContext()).KWHzl(interfaceC9738bbJOLrzqt != null ? new wXL(interfaceC9738bbJOLrzqt.AEQbTJ(), 8) : null);
        if (i != 0) {
            ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
            int iOLrzqt = C55298xhM.OLrzqt(i, OLrzqt(this.globals));
            if (layoutParams.height != iOLrzqt) {
                layoutParams.height = iOLrzqt;
                layoutParams.width = iOLrzqt;
            }
        }
        if (uDImageInfo != null) {
            c5335NtKWHzl.copydefault(new RY<Drawable>() { // from class: com.okinc.wallet.mln.service.UDWalletCore.11
                /* JADX DEBUG: Method merged with bridge method: copydefault(Ljava/lang/Object;Ljava/lang/Object;Lo/Sq;Lcom/bumptech/glide/load/DataSource;Z)Z */
                @Override // o.RY
                /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
                public boolean copydefault(Drawable drawable, Object obj, InterfaceC5462Sq<Drawable> interfaceC5462Sq, DataSource dataSource, boolean z) {
                    return false;
                }

                @Override // o.RY
                public boolean OLrzqt(@Nullable GlideException glideException, Object obj, InterfaceC5462Sq<Drawable> interfaceC5462Sq, boolean z) {
                    UDImageInfo uDImageInfo2 = uDImageInfo;
                    if (uDImageInfo2 == null) {
                        return true;
                    }
                    UDWalletCore.this.AEQbTJ(uDImageInfo2.EZpvd(), imageView);
                    uDImageInfo.destroy();
                    return true;
                }
            });
        }
        c5335NtKWHzl.EZpvd(imageView);
        return null;
    }

    public void AEQbTJ(final JDImageInfo jDImageInfo, final ImageView imageView) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            KWHzl(jDImageInfo, imageView);
        } else {
            C7840arS.copydefault(new Runnable() { // from class: com.okinc.wallet.mln.service.UDWalletCore.12
                @Override // java.lang.Runnable
                public void run() {
                    UDWalletCore.this.KWHzl(jDImageInfo, imageView);
                }
            });
        }
    }

    public final void KWHzl(JDImageInfo jDImageInfo, ImageView imageView) {
        Context context = imageView.getContext();
        if (context == null) {
            return;
        }
        boolean zIsNetUrl = jDImageInfo.isNetUrl();
        if (!zIsNetUrl && !TextUtils.isEmpty(jDImageInfo.getLocalUrl())) {
            OLrzqt(C7323ahf.AYXKKw().KWHzl(context, jDImageInfo), imageView);
        } else {
            if (zIsNetUrl || !TextUtils.isEmpty(jDImageInfo.getLocalUrl())) {
                return;
            }
            OLrzqt(null, imageView);
        }
    }

    public final void OLrzqt(Drawable drawable, ImageView imageView) {
        imageView.setImageDrawable(drawable);
    }

    @LuaBridge
    public LuaValue changeWSLoginAddress(String str) {
        AbstractC12782ctV abstractC12782ctVOLrzqt = C12827cuN.AYXKKw().OLrzqt(str);
        if (abstractC12782ctVOLrzqt != null) {
            ArrayList arrayList = new ArrayList();
            Iterator<InterfaceC9780bbz> it = abstractC12782ctVOLrzqt.isConnected().iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().getAddress());
            }
            C11205cFp c11205cFp = C11205cFp.EZpvd;
            if (c11205cFp.AEQbTJ(arrayList).getFirst().booleanValue()) {
                RxBus.AEQbTJ(new C9915beb());
            }
            c11205cFp.OLrzqt(arrayList);
        }
        return LuaValue.Nil();
    }

    @LuaBridge
    public UDNativeLoader signAndSendCedefiBoostTransaction(LuaValue[] luaValueArr) {
        if (luaValueArr == null || luaValueArr.length < 1) {
            UDNativeLoader uDNativeLoader = new UDNativeLoader(this.globals, (Object) null);
            uDNativeLoader.copydefault(new UDNativeLoader.StateListAnimator() { // from class: com.okinc.wallet.mln.service.UDWalletCore.15
                @Override // com.immomo.mls.fun.ud.UDNativeLoader.StateListAnimator
                public void OLrzqt() {
                }

                @Override // com.immomo.mls.fun.ud.UDNativeLoader.StateListAnimator
                public void copydefault(UDNativeLoader.Application application, UDNativeLoader.Activity activity) {
                    activity.KWHzl(-1, "wrong params");
                }
            });
            return uDNativeLoader;
        }
        final String javaString = luaValueArr[0].toJavaString();
        UDNativeLoader uDNativeLoader2 = new UDNativeLoader(this.globals, luaValueArr);
        uDNativeLoader2.copydefault(new UDNativeLoader.StateListAnimator() { // from class: com.okinc.wallet.mln.service.UDWalletCore.14
            @Override // com.immomo.mls.fun.ud.UDNativeLoader.StateListAnimator
            public void OLrzqt() {
            }

            @Override // com.immomo.mls.fun.ud.UDNativeLoader.StateListAnimator
            public void copydefault(final UDNativeLoader.Application application, final UDNativeLoader.Activity activity) {
                Context contextOLrzqt = UDWalletCore.OLrzqt(UDWalletCore.this.globals);
                if (!(contextOLrzqt instanceof FragmentActivity)) {
                    activity.KWHzl(-1, "Context is not FragmentActivity");
                } else {
                    FragmentActivity fragmentActivity = (FragmentActivity) contextOLrzqt;
                    ((InterfaceC9916bec) C43248rlh.KWHzl.AEQbTJ(InterfaceC9916bec.class)).AEQbTJ(fragmentActivity, fragmentActivity.getSupportFragmentManager(), new SignAndSendTransactionInput(SignAndSendTransactionSource.BOOST, javaString), new Function1<SignAndSendTransactionResult, Unit>() { // from class: com.okinc.wallet.mln.service.UDWalletCore.14.3
                        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
                        @Override // kotlin.jvm.functions.Function1
                        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
                        public Unit invoke(SignAndSendTransactionResult signAndSendTransactionResult) {
                            if (signAndSendTransactionResult instanceof SignAndSendTransactionResult.Success) {
                                SignAndSendTransactionResult.Success success = (SignAndSendTransactionResult.Success) signAndSendTransactionResult;
                                if (UDWalletCore.this.globals == null || UDWalletCore.this.globals.isDestroyed()) {
                                    return null;
                                }
                                application.copydefault(success.copydefault());
                                return null;
                            }
                            if (signAndSendTransactionResult instanceof SignAndSendTransactionResult.Failed) {
                                SignAndSendTransactionResult.Failed failed = (SignAndSendTransactionResult.Failed) signAndSendTransactionResult;
                                if (failed instanceof SignAndSendTransactionResult.Failed.UnknownError) {
                                    activity.KWHzl(-1, ((SignAndSendTransactionResult.Failed.UnknownError) failed).AEQbTJ());
                                    return null;
                                }
                                if (failed instanceof SignAndSendTransactionResult.Failed.PasskeyError) {
                                    String strKWHzl = ((SignAndSendTransactionResult.Failed.PasskeyError) failed).KWHzl();
                                    if (strKWHzl == null) {
                                        activity.KWHzl(-2, C43246rlf.OLrzqt.valueOf().getString(C13754dXa.FragmentManager.DDDCac));
                                        return null;
                                    }
                                    activity.KWHzl(-1, strKWHzl);
                                    return null;
                                }
                                if (!(failed instanceof SignAndSendTransactionResult.Failed.NetworkFailure)) {
                                    return null;
                                }
                                SignAndSendTransactionResult.Failed.NetworkFailure networkFailure = (SignAndSendTransactionResult.Failed.NetworkFailure) failed;
                                activity.KWHzl(networkFailure.OLrzqt(), networkFailure.EZpvd());
                                return null;
                            }
                            if (!(signAndSendTransactionResult instanceof SignAndSendTransactionResult.Cancelled)) {
                                return null;
                            }
                            activity.KWHzl(-2, C43246rlf.OLrzqt.valueOf().getString(C13754dXa.FragmentManager.DDDCac));
                            return null;
                        }
                    });
                }
            }
        });
        return uDNativeLoader2;
    }

    @LuaBridge
    public LuaValue web3Mode() {
        if (((dTL) C43248rlh.KWHzl.AEQbTJ(dTL.class)).AEQbTJ().getValue() instanceof dTK.TaskDescription) {
            return LuaString.copydefault("1");
        }
        return LuaString.copydefault("0");
    }
}
