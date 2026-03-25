package o;

import android.content.DialogInterface;
import android.view.View;
import androidx.activity.ComponentActivity;
import androidx.fragment.app.FragmentActivity;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.just.agentweb.DefaultWebClient;
import com.okinc.business.defi.api.bean.PlatformItem;
import com.okinc.business.defi.api.bean.VerifyDAppDomainUrlResponse;
import com.okinc.business.defi.dapp.net.DappCheckUrlLevel;
import com.okinc.business.defi.dapp.net.DappListBean;
import com.okinc.business.defi.dapp.net.DappcheckSearchHistoryUrlIsBlackResult;
import com.okinc.business.defi.dapp.net.OKCheckLeveldappInfo;
import com.okinc.business.defi.dapp.net.WebDeskModeConfig;
import com.okinc.business.defi.dapp.net.WebDeskModeConfigList;
import com.okinc.business.defi.dapp.net.WhiteList;
import com.okinc.business.defi.dapp.net.search.DappDetailBean;
import com.okinc.business.defi.dapp.webview.DappTabData;
import com.okinc.business.defi.dapp.webview.LruMap;
import com.okinc.components.report.ReportManager;
import com.okinc.components.report.db.EventData;
import com.okinc.components.track.ABTestManager;
import com.okinc.components.track.amplitude.AmplitudeName;
import com.okinc.core.util.SPUtils;
import com.okinc.dapp.bean.DappChains;
import com.okinc.dapp.bean.DappSearchResultBean;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.rxutils.RxBus;
import java.net.MalformedURLException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.serialization.json.JsonObject;
import o.C14891dtx;
import o.InterfaceC43294rma;
import o.InterfaceC9737bbI;
import o.InterfaceC9739bbK;
import o.dLX;
import o.dTK;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.duc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C14923duc {
    public static Function0<Unit> AYXKKw = null;
    public static boolean AhwBna = false;
    public static boolean copydefault = false;
    public static final C14923duc EZpvd = new C14923duc();
    public static java.util.HashMap<java.lang.String, java.lang.Boolean> gEmmrt = new java.util.HashMap<>();
    public static final java.util.HashMap<java.lang.String, java.lang.String> OLrzqt = new java.util.HashMap<>();
    public static C15059dxF AEQbTJ = new C15059dxF();
    public static final InterfaceC56387yDm AkhnZx = C56392yDr.copydefault(new Function0() { // from class: o.dww
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C14923duc.gEmmrt();
        }
    });
    public static final InterfaceC56387yDm fetchVPNInfo = C56392yDr.copydefault(new Function0() { // from class: o.dwt
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C14923duc.AkhnZx();
        }
    });
    public static final InterfaceC56387yDm isConnected = C56392yDr.copydefault(new Function0() { // from class: o.dwv
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C14923duc.AhwBna();
        }
    });
    public static final InterfaceC56387yDm valueOf = C56392yDr.copydefault(new Function0() { // from class: o.dwB
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C14923duc.djBIcL();
        }
    });
    public static final InterfaceC56387yDm djBIcL = C56392yDr.copydefault(new Function0() { // from class: o.dwz
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C14923duc.AYXKKw();
        }
    });
    public static java.lang.String values = "";
    public static final java.util.HashSet<java.lang.String> DbNXlk = yEE.djBIcL("www.oklink.com", "www.okx.com", "www.okcoin.com", "web3.okx.com", "okx.com");
    public static final int KWHzl = 8;

    /* JADX INFO: renamed from: o.duc$ActionBar */
    public static final class ActionBar implements InterfaceC54859xXz {
        @Override // o.InterfaceC54859xXz
        public void EZpvd() {
        }
    }

    /* JADX INFO: renamed from: o.duc$Application */
    public static final class Application extends TypeToken<java.util.HashMap<java.lang.String, java.lang.Boolean>> {
    }

    /* JADX INFO: renamed from: o.duc$TaskDescription */
    public static final class TaskDescription extends TypeToken<java.util.HashMap<java.lang.String, java.lang.Long>> {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final void AEQbTJ(android.content.DialogInterface dialogInterface) {
        AhwBna = false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AubY() {
        return "dapp_show_enter_dialog";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(Function0<Unit> function0) {
        AYXKKw = function0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String getFieldNames() {
        return values;
    }

    private C14923duc() {
    }

    public final java.util.List<java.lang.String> iwGUEr() {
        return (java.util.List) AkhnZx.getValue();
    }

    public static final java.util.List gEmmrt() {
        java.lang.String string = SPUtils.getString("key_white_url", "", "file_white_url");
        Intrinsics.copydefault((java.lang.Object) string);
        java.util.List listSplit$default = StringsKt__StringsKt.split$default((java.lang.CharSequence) string, new java.lang.String[]{","}, false, 0, 6, (java.lang.Object) null);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : listSplit$default) {
            if (((java.lang.String) obj).length() > 0) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static final LruMap AkhnZx() {
        return new LruMap(100);
    }

    public final LruMap<java.lang.Integer, JsonObject> hDKMBd() {
        return (LruMap) fetchVPNInfo.getValue();
    }

    public final WebDeskModeConfigList getNewProxyInstance() {
        return (WebDeskModeConfigList) isConnected.getValue();
    }

    public static final WebDeskModeConfigList AhwBna() {
        java.lang.Object objM7377constructorimpl;
        java.lang.String string = SPUtils.getString("key_webdesk_config_list", "", "file_white_url");
        if (!C33129mqd.OLrzqt((java.lang.CharSequence) string)) {
            return null;
        }
        try {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl((WebDeskModeConfigList) new Gson().fromJson(string, WebDeskModeConfigList.class));
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        return (WebDeskModeConfigList) (Result.m7383isFailureimpl(objM7377constructorimpl) ? null : objM7377constructorimpl);
    }

    public final java.util.HashMap<java.lang.String, java.lang.String> fARcdN() {
        return (java.util.HashMap) valueOf.getValue();
    }

    public static final java.util.HashMap djBIcL() {
        java.lang.Object objM7377constructorimpl;
        java.lang.String string = SPUtils.getString("key_genesisHashToChainMap", "", "file_white_url");
        if (!C33129mqd.OLrzqt((java.lang.CharSequence) string)) {
            return null;
        }
        try {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl((java.util.HashMap) new Gson().fromJson(string, (java.lang.Class) new java.util.HashMap().getClass()));
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        return (java.util.HashMap) (Result.m7383isFailureimpl(objM7377constructorimpl) ? null : objM7377constructorimpl);
    }

    public final java.util.HashMap<java.lang.String, java.lang.Long> ejfBZ() {
        return (java.util.HashMap) djBIcL.getValue();
    }

    public static final java.util.HashMap AYXKKw() {
        java.lang.String string = SPUtils.getString("key_host_chain", "", "key_host_chain");
        Intrinsics.copydefault((java.lang.Object) string);
        if (StringsKt__StringsKt.fARcdN((java.lang.CharSequence) string)) {
            return new java.util.HashMap();
        }
        try {
            java.lang.Object objFromJson = new Gson().fromJson(string, new TaskDescription().getType());
            Intrinsics.copydefault(objFromJson);
            return (java.util.HashMap) objFromJson;
        } catch (java.lang.Exception unused) {
            return new java.util.HashMap();
        }
    }

    public static /* synthetic */ long getDefaultChain$default(C14923duc c14923duc, java.lang.String str, java.util.List list, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            str2 = "";
        }
        return c14923duc.EZpvd(str, (java.util.List<DappChains>) list, str2);
    }

    public final long EZpvd(@NotNull java.lang.String str, java.util.List<DappChains> list, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        java.lang.Long l = ejfBZ().get(KWHzl(str));
        if (l != null) {
            return l.longValue();
        }
        return AEQbTJ(list, str2);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: o.duc */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void saveWhiteUrlFromRemote$default(C14923duc c14923duc, java.lang.String str, java.lang.String str2, java.util.HashMap map, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            map = null;
        }
        c14923duc.EZpvd(str, str2, (java.util.HashMap<java.lang.String, java.lang.String>) map);
    }

    public final void EZpvd(@NotNull java.lang.String str, java.lang.String str2, java.util.HashMap<java.lang.String, java.lang.String> map) {
        Intrinsics.checkNotNullParameter(str, "");
        try {
            SPUtils.put("key_white_url", str, "file_white_url");
            if (str2 != null) {
                SPUtils.put("key_webdesk_config_list", str2, "file_white_url");
            }
            if (map != null) {
                SPUtils.put("key_genesisHashToChainMap", map, "file_white_url");
            }
        } catch (java.lang.Exception unused) {
        }
    }

    public final void EZpvd(int i, int i2) {
        try {
            SPUtils.put("translate_limit_chars", java.lang.Integer.valueOf(i), "file_white_url");
            SPUtils.put("translate_limit_items", java.lang.Integer.valueOf(i2), "file_white_url");
        } catch (java.lang.Exception unused) {
        }
    }

    public final int uzCIH() {
        java.lang.Integer num = SPUtils.getInt("translate_limit_chars", -1, "file_white_url");
        Intrinsics.checkNotNullExpressionValue(num, "");
        return num.intValue();
    }

    public final int zLjUOn() {
        java.lang.Integer num = SPUtils.getInt("translate_limit_items", -1, "file_white_url");
        Intrinsics.checkNotNullExpressionValue(num, "");
        return num.intValue();
    }

    public final boolean wlaJM() {
        return C48787ucK.AEQbTJ.AEQbTJ("dappConfig.showTranslateEntrance", 1) == 1;
    }

    public final boolean fJNWhG() {
        return SPUtils.getBoolean("has_show_translate_tips", false);
    }

    public final void sSMYrx() {
        SPUtils.put("has_show_translate_tips", java.lang.Boolean.TRUE);
    }

    public final boolean fIwbmz() {
        return SPUtils.getBoolean("key_has_click_reminder", false);
    }

    public final WebDeskModeConfig AYXKKw(@NotNull java.lang.String str) {
        java.util.List<WebDeskModeConfig> configList;
        java.lang.Integer platform;
        java.lang.Integer type;
        Intrinsics.checkNotNullParameter(str, "");
        WebDeskModeConfigList newProxyInstance = getNewProxyInstance();
        java.lang.Object obj = null;
        if (newProxyInstance == null || (configList = newProxyInstance.getConfigList()) == null) {
            return null;
        }
        for (java.lang.Object obj2 : configList) {
            WebDeskModeConfig webDeskModeConfig = (WebDeskModeConfig) obj2;
            java.lang.Integer platform2 = webDeskModeConfig.getPlatform();
            if ((platform2 != null && platform2.intValue() == 1) || ((platform = webDeskModeConfig.getPlatform()) != null && platform.intValue() == 3)) {
                java.lang.Integer type2 = webDeskModeConfig.getType();
                if ((type2 != null && type2.intValue() == 1 && Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) EZpvd.OLrzqt(webDeskModeConfig.getUrl()))) || ((type = webDeskModeConfig.getType()) != null && type.intValue() == 2 && Intrinsics.EZpvd((java.lang.Object) webDeskModeConfig.getUrl(), (java.lang.Object) EZpvd.KWHzl(str)))) {
                    obj = obj2;
                    break;
                }
            }
        }
        return (WebDeskModeConfig) obj;
    }

    public final java.lang.String OLrzqt(java.lang.String str) {
        if (str == null || str.length() == 0) {
            return str;
        }
        java.util.Locale locale = java.util.Locale.ROOT;
        java.lang.String lowerCase = str.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "");
        if (C59449zhJ.AYXKKw(lowerCase, DefaultWebClient.HTTP_SCHEME, true)) {
            str = C59449zhJ.copydefault(str, DefaultWebClient.HTTP_SCHEME, DefaultWebClient.HTTPS_SCHEME, true);
        }
        java.lang.String lowerCase2 = str.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase2, "");
        if (C59449zhJ.AYXKKw(lowerCase2, "http", true)) {
            return str;
        }
        return DefaultWebClient.HTTPS_SCHEME + str;
    }

    public final java.lang.String AhwBna(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        WebDeskModeConfig webDeskModeConfigAYXKKw = AYXKKw(str);
        if (webDeskModeConfigAYXKKw != null) {
            return webDeskModeConfigAYXKKw.getUa();
        }
        if (getNewProxyInstance() == null) {
            return "Mozilla/5.0 (Windows NT 6.1) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/120.0.2228.0 Safari/537.36";
        }
        WebDeskModeConfigList newProxyInstance = getNewProxyInstance();
        Intrinsics.copydefault(newProxyInstance);
        return newProxyInstance.getDefaultWebUA();
    }

    public final void EZpvd(@NotNull java.lang.String str, long j) {
        Intrinsics.checkNotNullParameter(str, "");
        ejfBZ().put(KWHzl(str), java.lang.Long.valueOf(j));
    }

    public final void AxsJAY() {
        SPUtils.put("key_host_chain", ejfBZ(), "key_host_chain");
    }

    public final boolean values() {
        java.lang.String string = SPUtils.getString(AubY(), "");
        Intrinsics.checkNotNullExpressionValue(string, "");
        return StringsKt__StringsKt.fARcdN((java.lang.CharSequence) string) && !SPUtils.getBoolean("has_show_tip", false);
    }

    public final boolean copydefault(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        java.lang.String string = SPUtils.getString(AubY(), "");
        Intrinsics.checkNotNullExpressionValue(string, "");
        if (StringsKt__StringsKt.fARcdN((java.lang.CharSequence) string)) {
            return false;
        }
        java.util.HashMap<java.lang.String, java.lang.Boolean> map = (java.util.HashMap) new Gson().fromJson(SPUtils.getString(AubY(), ""), new Application().getType());
        gEmmrt = map;
        return map.containsKey(KWHzl(str));
    }

    public final java.lang.String KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        try {
            Result.Application application = Result.Companion;
            java.lang.String host = new java.net.URL(StringsKt__StringsKt.hDKMBd((java.lang.CharSequence) str).toString()).getHost();
            Intrinsics.checkNotNullExpressionValue(host, "");
            return host;
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            java.lang.Object objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            java.lang.Object obj = str;
            if (!Result.m7383isFailureimpl(objM7377constructorimpl)) {
                obj = objM7377constructorimpl;
            }
            return (java.lang.String) obj;
        }
    }

    public final void djBIcL(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        gEmmrt.put(KWHzl(str), java.lang.Boolean.TRUE);
        SPUtils.put(AubY(), gEmmrt);
    }

    public final boolean AuCTelauCTel() {
        return SPUtils.getBoolean("external_website_warning_disabled", false);
    }

    public final void AwvSrB() {
        SPUtils.put("external_website_warning_disabled", java.lang.Boolean.TRUE);
    }

    public final boolean zsXlph() {
        if (((InterfaceC9852bdR) C43251rlk.copydefault(InterfaceC9852bdR.class)).gEmmrt().OLrzqt().isEmpty()) {
            return false;
        }
        java.util.Iterator<T> it = ((InterfaceC9852bdR) C43251rlk.copydefault(InterfaceC9852bdR.class)).gEmmrt().OLrzqt().iterator();
        int i = 0;
        while (it.hasNext()) {
            if (((InterfaceC9738bbJ) it.next()).djSkpj()) {
                i++;
            }
        }
        return i > 0;
    }

    public final java.lang.String OcIXYQ() {
        java.lang.String strDjBIcL;
        InterfaceC9731bbC interfaceC9731bbCAEQbTJ = ((InterfaceC9852bdR) C43251rlk.copydefault(InterfaceC9852bdR.class)).copydefault().AEQbTJ();
        return (interfaceC9731bbCAEQbTJ == null || (strDjBIcL = interfaceC9731bbCAEQbTJ.djBIcL()) == null) ? "" : strDjBIcL;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.duc */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void showDappWaringDialog$default(C14923duc c14923duc, ComponentActivity componentActivity, PlatformItem platformItem, boolean z, Function0 function0, int i, java.lang.Object obj) {
        if ((i & 8) != 0) {
            function0 = null;
        }
        c14923duc.OLrzqt(componentActivity, platformItem, z, (Function0<Unit>) function0);
    }

    public final void OLrzqt(@NotNull final ComponentActivity componentActivity, @NotNull final PlatformItem platformItem, final boolean z, final Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(componentActivity, "");
        Intrinsics.checkNotNullParameter(platformItem, "");
        if (!AhwBna && (componentActivity instanceof FragmentActivity)) {
            if (componentActivity instanceof AbstractActivityC33041mov) {
                ((AbstractActivityC33041mov) componentActivity).showLoading();
            }
            AhwBna = true;
            AbstractC58185ywX abstractC58185ywXEZpvd = C58156yvv.EZpvd(AEQbTJ.OLrzqt(java.lang.Long.valueOf(platformItem.getId()), (java.lang.Integer) 0), componentActivity);
            final Function1 function1 = new Function1() { // from class: o.duZ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C14923duc.EZpvd(componentActivity, platformItem, z, function0, (ResponseData) obj);
                }
            };
            InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.dvf
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    C14923duc.DGOPHZDGOPHZ(function1, obj);
                }
            };
            final Function1 function12 = new Function1() { // from class: o.dvc
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C14923duc.KWHzl(componentActivity, function0, (java.lang.Throwable) obj);
                }
            };
            abstractC58185ywXEZpvd.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.dvb
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    C14923duc.DBxZfM(function12, obj);
                }
            });
        }
    }

    public static final void DGOPHZDGOPHZ(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit EZpvd(final ComponentActivity componentActivity, final PlatformItem platformItem, boolean z, final Function0 function0, ResponseData responseData) {
        if (componentActivity instanceof AbstractActivityC33041mov) {
            ((AbstractActivityC33041mov) componentActivity).dismissLoading();
        }
        if (!EZpvd.copydefault(componentActivity)) {
            return Unit.INSTANCE;
        }
        C14808dsT c14808dsTCopydefault = C14808dsT.Companion.copydefault(platformItem.getId(), (DappDetailBean) responseData.getData(), java.lang.Boolean.valueOf(z), new Function2() { // from class: o.dvv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C14923duc.AEQbTJ(platformItem, componentActivity, function0, ((java.lang.Boolean) obj).booleanValue(), (java.lang.String) obj2);
            }
        });
        androidx.fragment.app.FragmentManager supportFragmentManager = ((FragmentActivity) componentActivity).getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
        c14808dsTCopydefault.show(supportFragmentManager);
        c14808dsTCopydefault.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: o.dvy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(android.content.DialogInterface dialogInterface) {
                C14923duc.AEQbTJ(dialogInterface);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(PlatformItem platformItem, ComponentActivity componentActivity, Function0 function0, boolean z, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (z) {
            EZpvd.djBIcL(platformItem.getUrl());
        }
        if (C33129mqd.OLrzqt((java.lang.CharSequence) str)) {
            InterfaceC43294rma.Application.processDeeplink$default((InterfaceC43294rma) C43251rlk.copydefault(InterfaceC43294rma.class), componentActivity, str, null, new Function1() { // from class: o.dwY
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C14923duc.AEQbTJ((AbstractC43238rlX) obj);
                }
            }, 4, null);
        } else if (function0 != null) {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(AbstractC43238rlX abstractC43238rlX) {
        Intrinsics.checkNotNullParameter(abstractC43238rlX, "");
        return Unit.INSTANCE;
    }

    public static final void DBxZfM(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit KWHzl(ComponentActivity componentActivity, Function0 function0, java.lang.Throwable th) {
        if (componentActivity instanceof AbstractActivityC33041mov) {
            ((AbstractActivityC33041mov) componentActivity).dismissLoading();
        }
        AhwBna = false;
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }

    public final ViewOnClickListenerC54939xaY EZpvd(@NotNull android.app.Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
        return new ViewOnClickListenerC54939xaY(activity);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.duc */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: showNewsWaringDialog-0E7RQCE$default, reason: not valid java name */
    public static /* synthetic */ java.lang.Object m8573showNewsWaringDialog0E7RQCE$default(C14923duc c14923duc, ComponentActivity componentActivity, java.lang.String str, Function0 function0, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            function0 = null;
        }
        return c14923duc.OLrzqt(componentActivity, str, (Function0<Unit>) function0);
    }

    public final java.lang.Object OLrzqt(@NotNull ComponentActivity componentActivity, @NotNull java.lang.String str, final Function0<Unit> function0) {
        java.lang.Object objM7377constructorimpl;
        Intrinsics.checkNotNullParameter(componentActivity, "");
        Intrinsics.checkNotNullParameter(str, "");
        try {
            Result.Application application = Result.Companion;
            if (AuCTelauCTel()) {
                if (function0 != null) {
                    function0.invoke();
                }
            } else if (!copydefault(str)) {
                FragmentActivity fragmentActivity = componentActivity instanceof FragmentActivity ? (FragmentActivity) componentActivity : null;
                if (fragmentActivity == null) {
                    pUU.valueOf("DappUtils", "showNewsWaringDialog: activity is not FragmentActivity, skipping dialog");
                    if (function0 != null) {
                        function0.invoke();
                    }
                } else {
                    C14848dtG.Companion.OLrzqt(new Function1() { // from class: o.dwl
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return C14923duc.OLrzqt(this.EZpvd, function0, ((java.lang.Boolean) obj).booleanValue());
                        }
                    }, new Function0() { // from class: o.dwr
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return C14923duc.DbNXlk();
                        }
                    }).show(fragmentActivity.getSupportFragmentManager(), "ExternalWebsiteWarningFragment");
                }
            } else if (function0 != null) {
                function0.invoke();
            }
            objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        java.lang.Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
            pUU.AEQbTJ("DappUtils", "showNewsWaringDialog: failed to show dialog", thM7380exceptionOrNullimpl);
            if (function0 != null) {
                function0.invoke();
            }
        }
        return objM7377constructorimpl;
    }

    public static final Unit OLrzqt(C14923duc c14923duc, Function0 function0, boolean z) {
        if (z) {
            c14923duc.AwvSrB();
        }
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }

    public static final Unit DbNXlk() {
        return Unit.INSTANCE;
    }

    public final java.lang.String EZpvd(java.lang.String str) {
        java.lang.String strValues;
        InterfaceC9731bbC interfaceC9731bbCAEQbTJ = ((InterfaceC9852bdR) C43251rlk.copydefault(InterfaceC9852bdR.class)).copydefault().AEQbTJ();
        if (interfaceC9731bbCAEQbTJ == null || (strValues = interfaceC9731bbCAEQbTJ.values()) == null) {
            strValues = "";
        }
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) strValues)) {
            return OcIXYQ();
        }
        InterfaceC9731bbC interfaceC9731bbCEZpvd = ((InterfaceC9852bdR) C43251rlk.copydefault(InterfaceC9852bdR.class)).copydefault().EZpvd();
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) (interfaceC9731bbCEZpvd != null ? interfaceC9731bbCEZpvd.djBIcL() : null))) {
            InterfaceC9731bbC interfaceC9731bbCEZpvd2 = ((InterfaceC9852bdR) C43251rlk.copydefault(InterfaceC9852bdR.class)).copydefault().EZpvd();
            java.lang.String strDjBIcL = interfaceC9731bbCEZpvd2 != null ? interfaceC9731bbCEZpvd2.djBIcL() : null;
            if (strDjBIcL != null) {
                return strDjBIcL;
            }
        } else {
            InterfaceC9731bbC interfaceC9731bbCKWHzl = ((InterfaceC9852bdR) C43251rlk.copydefault(InterfaceC9852bdR.class)).copydefault().KWHzl();
            if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) (interfaceC9731bbCKWHzl != null ? interfaceC9731bbCKWHzl.values() : null))) {
                InterfaceC9731bbC interfaceC9731bbCKWHzl2 = ((InterfaceC9852bdR) C43251rlk.copydefault(InterfaceC9852bdR.class)).copydefault().KWHzl();
                java.lang.String strDjBIcL2 = interfaceC9731bbCKWHzl2 != null ? interfaceC9731bbCKWHzl2.djBIcL() : null;
                if (strDjBIcL2 != null) {
                    return strDjBIcL2;
                }
            } else {
                InterfaceC9731bbC interfaceC9731bbCGEmmrt = ((InterfaceC9852bdR) C43251rlk.copydefault(InterfaceC9852bdR.class)).copydefault().gEmmrt();
                if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) (interfaceC9731bbCGEmmrt != null ? interfaceC9731bbCGEmmrt.djBIcL() : null))) {
                    InterfaceC9731bbC interfaceC9731bbCGEmmrt2 = ((InterfaceC9852bdR) C43251rlk.copydefault(InterfaceC9852bdR.class)).copydefault().gEmmrt();
                    java.lang.String strDjBIcL3 = interfaceC9731bbCGEmmrt2 != null ? interfaceC9731bbCGEmmrt2.djBIcL() : null;
                    if (strDjBIcL3 != null) {
                        return strDjBIcL3;
                    }
                } else if (str != null) {
                    return str;
                }
            }
        }
        return "";
    }

    /* JADX DEBUG: Multi-variable search result rejected for r39v0, resolved type: kotlin.jvm.functions.Function1<? super androidx.fragment.app.Fragment, kotlin.Unit> */
    /* JADX DEBUG: Multi-variable search result rejected for r40v0, resolved type: java.lang.Boolean */
    /* JADX DEBUG: Multi-variable search result rejected for r41v0, resolved type: java.lang.String */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v18, types: [T, java.lang.Boolean] */
    public final void AEQbTJ(@NotNull final ComponentActivity componentActivity, @NotNull final PlatformItem platformItem, final java.lang.String str, final java.lang.Long l, final Function0<Unit> function0, final boolean z, final java.util.List<DappChains> list, final boolean z2, final boolean z3, final Function1<? super PlatformItem, Unit> function1, @NotNull final java.lang.String str2, final java.lang.String str3, Function1<? super androidx.fragment.app.Fragment, Unit> function12, java.lang.Boolean bool, java.lang.String str4, final int[] iArr) {
        StateFlow<dTK> stateFlowAEQbTJ;
        Intrinsics.checkNotNullParameter(componentActivity, "");
        Intrinsics.checkNotNullParameter(platformItem, "");
        Intrinsics.checkNotNullParameter(str2, "");
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = function12;
        final Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
        objectRef2.element = bool;
        final Ref.ObjectRef objectRef3 = new Ref.ObjectRef();
        objectRef3.element = str4;
        dTL dtl = (dTL) C43251rlk.OLrzqt(dTL.class);
        if (((dtl == null || (stateFlowAEQbTJ = dtl.AEQbTJ()) == null) ? null : stateFlowAEQbTJ.getValue()) instanceof dTK.TaskDescription) {
            objectRef.element = null;
            objectRef2.element = java.lang.Boolean.FALSE;
            objectRef3.element = null;
        }
        java.lang.String string = StringsKt__StringsKt.hDKMBd((java.lang.CharSequence) platformItem.getUrl()).toString();
        java.util.Locale locale = java.util.Locale.ROOT;
        java.lang.String lowerCase = string.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "");
        if (C59449zhJ.AYXKKw(lowerCase, DefaultWebClient.HTTP_SCHEME, true)) {
            string = C59449zhJ.copydefault(string, DefaultWebClient.HTTP_SCHEME, DefaultWebClient.HTTPS_SCHEME, true);
        }
        java.lang.String lowerCase2 = string.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase2, "");
        if (!C59449zhJ.AYXKKw(lowerCase2, "http", true)) {
            string = DefaultWebClient.HTTPS_SCHEME + string;
        }
        platformItem.setUrl(string);
        if (!C33129mqd.OLrzqt((java.lang.CharSequence) KWHzl(string))) {
            C55326xho.toastWithFailedIcon$default(C33070mpX.AYXKKw(dLX.Dialog.ORxRYg), 0, 1, (java.lang.Object) null);
        } else {
            checkUrl$default(this, componentActivity, platformItem.getUrl(), platformItem.getPlatform(), "1", null, null, null, null, null, str3, new yHO() { // from class: o.duz
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.yHO
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                    return C14923duc.OLrzqt(platformItem, function1, componentActivity, str, l, function0, z, list, z2, z3, str2, str3, objectRef, objectRef2, objectRef3, iArr, ((java.lang.Boolean) obj).booleanValue(), ((java.lang.Boolean) obj2).booleanValue(), (OKCheckLeveldappInfo) obj3);
                }
            }, 496, null);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v6, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v8, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit OLrzqt(final PlatformItem platformItem, final Function1 function1, ComponentActivity componentActivity, java.lang.String str, java.lang.Long l, Function0 function0, boolean z, java.util.List list, boolean z2, boolean z3, java.lang.String str2, java.lang.String str3, Ref.ObjectRef objectRef, Ref.ObjectRef objectRef2, Ref.ObjectRef objectRef3, int[] iArr, boolean z4, boolean z5, OKCheckLeveldappInfo oKCheckLeveldappInfo) {
        Function0<Unit> function02;
        Ref.ObjectRef objectRef4;
        C14923duc c14923duc = EZpvd;
        c14923duc.AEQbTJ(platformItem, oKCheckLeveldappInfo);
        AbstractC58185ywX<ResponseData<java.lang.Object>> abstractC58185ywXEZpvd = new C15059dxF().EZpvd(java.lang.Long.valueOf(platformItem.getId()), platformItem.getCategory());
        final Function1 function12 = new Function1() { // from class: o.dvO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C14923duc.EZpvd((ResponseData) obj);
            }
        };
        InterfaceC58227yxM<? super ResponseData<java.lang.Object>> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.dvL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C14923duc.zblBkD(function12, obj);
            }
        };
        final Function1 function13 = new Function1() { // from class: o.dvP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C14923duc.QfsBiF((java.lang.Throwable) obj);
            }
        };
        abstractC58185ywXEZpvd.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.dvR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C14923duc.spnCvw(function13, obj);
            }
        });
        java.util.List<java.lang.String> listIwGUEr = c14923duc.iwGUEr();
        if (listIwGUEr == null || listIwGUEr.isEmpty()) {
            AbstractC58185ywX<ResponseData<WhiteList>> abstractC58185ywXOLrzqt = new C15059dxF().OLrzqt();
            final Function1 function14 = new Function1() { // from class: o.dvT
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C14923duc.AEQbTJ((ResponseData) obj);
                }
            };
            InterfaceC58227yxM<? super ResponseData<WhiteList>> interfaceC58227yxM2 = new InterfaceC58227yxM() { // from class: o.dvQ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    C14923duc.Dmq(function14, obj);
                }
            };
            final Function1 function15 = new Function1() { // from class: o.dvS
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C14923duc.RcXXUw((java.lang.Throwable) obj);
                }
            };
            abstractC58185ywXOLrzqt.AEQbTJ(interfaceC58227yxM2, new InterfaceC58227yxM() { // from class: o.dvY
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    C14923duc.ixgjPv(function15, obj);
                }
            });
        }
        if (function1 != null) {
            objectRef4 = objectRef;
            function02 = new Function0() { // from class: o.dvU
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C14923duc.EZpvd(function1, platformItem);
                }
            };
        } else {
            function02 = null;
            objectRef4 = objectRef;
        }
        c14923duc.OLrzqt(componentActivity, platformItem, str, l, function0, z4, z, list, z2, z3, function02, str2, str3, (Function1) objectRef4.element, (java.lang.Boolean) objectRef2.element, (java.lang.String) objectRef3.element, iArr, z5);
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(ResponseData responseData) {
        return Unit.INSTANCE;
    }

    public static final Unit QfsBiF(java.lang.Throwable th) {
        return Unit.INSTANCE;
    }

    public static final void spnCvw(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final void zblBkD(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final void Dmq(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AEQbTJ(ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        java.lang.Object data = responseData.getData();
        Intrinsics.copydefault(data);
        java.lang.String whiteMainlandHost = ((WhiteList) data).getWhiteMainlandHost();
        java.lang.Object data2 = responseData.getData();
        Intrinsics.copydefault(data2);
        java.lang.String webDeskConfigList = ((WhiteList) data2).getWebDeskConfigList();
        C14923duc c14923duc = EZpvd;
        java.lang.Object data3 = responseData.getData();
        Intrinsics.copydefault(data3);
        c14923duc.EZpvd(whiteMainlandHost, webDeskConfigList, ((WhiteList) data3).getGenesisHashToChainMap());
        java.lang.Object data4 = responseData.getData();
        Intrinsics.copydefault(data4);
        int requestTranslateCharCount = ((WhiteList) data4).getRequestTranslateCharCount();
        java.lang.Object data5 = responseData.getData();
        Intrinsics.copydefault(data5);
        c14923duc.EZpvd(requestTranslateCharCount, ((WhiteList) data5).getRequestTranslateRecordCount());
        return Unit.INSTANCE;
    }

    public static final Unit RcXXUw(java.lang.Throwable th) {
        return Unit.INSTANCE;
    }

    public static final void ixgjPv(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit EZpvd(Function1 function1, PlatformItem platformItem) {
        function1.invoke(platformItem);
        return Unit.INSTANCE;
    }

    public final boolean copydefault(@NotNull ComponentActivity componentActivity) {
        Intrinsics.checkNotNullParameter(componentActivity, "");
        if (componentActivity.isDestroyed() || componentActivity.isFinishing()) {
            return false;
        }
        return ((componentActivity instanceof FragmentActivity) && ((FragmentActivity) componentActivity).getSupportFragmentManager().isStateSaved()) ? false : true;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r15v0, resolved type: o.duc */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void checkUrl$default(C14923duc c14923duc, ComponentActivity componentActivity, java.lang.String str, java.lang.String str2, java.lang.String str3, Function0 function0, java.lang.Boolean bool, java.util.List list, java.lang.String str4, java.lang.String str5, java.lang.String str6, yHO yho, int i, java.lang.Object obj) {
        c14923duc.copydefault(componentActivity, str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? "2" : str3, (i & 16) != 0 ? null : function0, (i & 32) != 0 ? java.lang.Boolean.TRUE : bool, (i & 64) != 0 ? null : list, (i & 128) != 0 ? null : str4, (i & 256) != 0 ? null : str5, (i & 512) != 0 ? "" : str6, yho);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(31:15|(1:(2:18|26)(1:19))(2:20|(1:26)(1:25))|27|28|(4:153|30|(1:37)|38)(0)|41|(1:43)|44|151|45|(1:51)|52|56|(1:58)|59|60|158|61|(19:63|64|156|65|(0)(1:69)|72|79|(1:81)|82|149|83|(1:88)(1:87)|89|(1:91)(1:92)|93|97|(1:99)|100|(4:102|(2:107|160)|108|(2:110|(2:112|113)(1:162))(1:161))(10:114|(5:116|(1:122)|123|(1:125)(1:126)|127)|128|(1:132)|133|(1:135)(1:136)|(1:138)(1:139)|(1:141)(1:142)|143|163))(1:70)|71|72|79|(0)|82|149|83|(5:85|88|89|(0)(0)|93)(0)|97|(0)|100|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0163, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0164, code lost:
    
        r2 = kotlin.Result.Companion;
        r0 = kotlin.Result.m7377constructorimpl(o.C56391yDq.EZpvd(r0));
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x017d A[Catch: all -> 0x026c, TryCatch #3 {all -> 0x026c, blocks: (B:3:0x000e, B:8:0x001c, B:12:0x0026, B:15:0x002e, B:27:0x004c, B:41:0x009a, B:44:0x00a1, B:56:0x00d2, B:59:0x00d9, B:79:0x011b, B:82:0x0124, B:97:0x016e, B:100:0x0175, B:102:0x017d, B:104:0x0185, B:107:0x018e, B:108:0x019a, B:110:0x019e, B:112:0x01a6, B:114:0x01d5, B:116:0x01df, B:118:0x01e7, B:120:0x01ed, B:123:0x01f4, B:127:0x01fd, B:128:0x0200, B:130:0x0204, B:132:0x020e, B:133:0x0214, B:135:0x0218, B:143:0x022c, B:96:0x0164, B:78:0x0111, B:55:0x00c8, B:40:0x0090, B:20:0x003a, B:22:0x0042, B:144:0x0266, B:83:0x012a, B:85:0x012e, B:87:0x0141, B:89:0x0149, B:91:0x014f, B:93:0x015e, B:45:0x00a4, B:47:0x00a8, B:49:0x00b9, B:52:0x00c2, B:30:0x006e, B:32:0x007f, B:38:0x008b), top: B:155:0x000e, inners: #0, #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01d5 A[Catch: all -> 0x026c, TryCatch #3 {all -> 0x026c, blocks: (B:3:0x000e, B:8:0x001c, B:12:0x0026, B:15:0x002e, B:27:0x004c, B:41:0x009a, B:44:0x00a1, B:56:0x00d2, B:59:0x00d9, B:79:0x011b, B:82:0x0124, B:97:0x016e, B:100:0x0175, B:102:0x017d, B:104:0x0185, B:107:0x018e, B:108:0x019a, B:110:0x019e, B:112:0x01a6, B:114:0x01d5, B:116:0x01df, B:118:0x01e7, B:120:0x01ed, B:123:0x01f4, B:127:0x01fd, B:128:0x0200, B:130:0x0204, B:132:0x020e, B:133:0x0214, B:135:0x0218, B:143:0x022c, B:96:0x0164, B:78:0x0111, B:55:0x00c8, B:40:0x0090, B:20:0x003a, B:22:0x0042, B:144:0x0266, B:83:0x012a, B:85:0x012e, B:87:0x0141, B:89:0x0149, B:91:0x014f, B:93:0x015e, B:45:0x00a4, B:47:0x00a8, B:49:0x00b9, B:52:0x00c2, B:30:0x006e, B:32:0x007f, B:38:0x008b), top: B:155:0x000e, inners: #0, #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x014f A[Catch: all -> 0x0163, TryCatch #0 {all -> 0x0163, blocks: (B:83:0x012a, B:85:0x012e, B:87:0x0141, B:89:0x0149, B:91:0x014f, B:93:0x015e), top: B:149:0x012a, outer: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0174  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void copydefault(@NotNull final ComponentActivity componentActivity, final java.lang.String str, java.lang.String str2, java.lang.String str3, final Function0<Unit> function0, java.lang.Boolean bool, java.util.List<java.lang.String> list, java.lang.String str4, java.lang.String str5, final java.lang.String str6, @NotNull final yHO<? super java.lang.Boolean, ? super java.lang.Boolean, ? super OKCheckLeveldappInfo, Unit> yho) {
        java.lang.String mTitle;
        java.lang.String str7;
        java.lang.String str8;
        java.lang.Object objM7377constructorimpl;
        java.lang.Object objM7377constructorimpl2;
        int i;
        java.lang.Object objM7377constructorimpl3;
        java.lang.Object objM7377constructorimpl4;
        java.lang.String originalUrl;
        C13241dEa mWebView;
        java.util.List listSplit$default;
        boolean z;
        java.lang.String str9;
        java.lang.String str10;
        java.util.List listSplit$default2;
        Intrinsics.checkNotNullParameter(componentActivity, "");
        Intrinsics.checkNotNullParameter(yho, "");
        try {
            Result.Application application = Result.Companion;
            C14923duc c14923duc = EZpvd;
            if (c14923duc.copydefault(componentActivity)) {
                if (str != null && !StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str) && str != null && str.length() != 0) {
                    if (C33129mqd.OLrzqt((java.lang.CharSequence) str2)) {
                        str7 = str2 == null ? "" : str2;
                    } else {
                        DappTabData dappTabDataOLrzqt = C15112dyF.AEQbTJ.OLrzqt();
                        if (dappTabDataOLrzqt != null && (mTitle = dappTabDataOLrzqt.getMTitle()) != null) {
                            str7 = mTitle;
                        }
                    }
                    java.lang.String str11 = OLrzqt.get(c14923duc.KWHzl(str) + str7);
                    if (str11 != null) {
                        try {
                            java.util.List listSplit$default3 = StringsKt__StringsKt.split$default((java.lang.CharSequence) str11, new java.lang.String[]{","}, false, 0, 6, (java.lang.Object) null);
                            if (listSplit$default3 == null || (str8 = (java.lang.String) listSplit$default3.get(0)) == null) {
                                str8 = "";
                            }
                            objM7377constructorimpl = Result.m7377constructorimpl(str8);
                        } catch (java.lang.Throwable th) {
                            Result.Application application2 = Result.Companion;
                            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                        }
                    }
                    if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
                        objM7377constructorimpl = "";
                    }
                    final java.lang.String str12 = (java.lang.String) objM7377constructorimpl;
                    try {
                        Result.Application application3 = Result.Companion;
                        if (str11 == null || (listSplit$default2 = StringsKt__StringsKt.split$default((java.lang.CharSequence) str11, new java.lang.String[]{","}, false, 0, 6, (java.lang.Object) null)) == null || (str10 = (java.lang.String) listSplit$default2.get(1)) == null) {
                            str10 = "";
                        }
                        objM7377constructorimpl2 = Result.m7377constructorimpl(str10);
                    } catch (java.lang.Throwable th2) {
                        Result.Application application4 = Result.Companion;
                        objM7377constructorimpl2 = Result.m7377constructorimpl(C56391yDq.EZpvd(th2));
                    }
                    if (Result.m7383isFailureimpl(objM7377constructorimpl2)) {
                        objM7377constructorimpl2 = "";
                    }
                    java.lang.String str13 = (java.lang.String) objM7377constructorimpl2;
                    try {
                        Result.Application application5 = Result.Companion;
                    } catch (java.lang.Throwable th3) {
                        th = th3;
                        i = 2;
                    }
                    if (str11 != null) {
                        i = 2;
                        try {
                            java.util.List listSplit$default4 = StringsKt__StringsKt.split$default((java.lang.CharSequence) str11, new java.lang.String[]{","}, false, 0, 6, (java.lang.Object) null);
                            if (listSplit$default4 != null && (str9 = (java.lang.String) listSplit$default4.get(2)) != null) {
                                z = java.lang.Boolean.parseBoolean(str9);
                            }
                            objM7377constructorimpl3 = Result.m7377constructorimpl(java.lang.Boolean.valueOf(z));
                        } catch (java.lang.Throwable th4) {
                            th = th4;
                            Result.Application application6 = Result.Companion;
                            objM7377constructorimpl3 = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                        }
                        java.lang.Boolean bool2 = java.lang.Boolean.TRUE;
                        if (Result.m7383isFailureimpl(objM7377constructorimpl3)) {
                            objM7377constructorimpl3 = bool2;
                        }
                        boolean zBooleanValue = ((java.lang.Boolean) objM7377constructorimpl3).booleanValue();
                        Result.Application application7 = Result.Companion;
                        java.lang.String str14 = (str11 != null || (listSplit$default = StringsKt__StringsKt.split$default((java.lang.CharSequence) str11, new java.lang.String[]{"|||"}, false, 0, 6, (java.lang.Object) null)) == null) ? null : (java.lang.String) CollectionsKt___CollectionsKt.AkhnZx(listSplit$default, 1);
                        objM7377constructorimpl4 = Result.m7377constructorimpl(!C33129mqd.OLrzqt((java.lang.CharSequence) str14) ? (OKCheckLeveldappInfo) new Gson().fromJson(str14, OKCheckLeveldappInfo.class) : null);
                        if (Result.m7383isFailureimpl(objM7377constructorimpl4)) {
                            objM7377constructorimpl4 = null;
                        }
                        final OKCheckLeveldappInfo oKCheckLeveldappInfo = (OKCheckLeveldappInfo) objM7377constructorimpl4;
                        if (!C33129mqd.OLrzqt((java.lang.CharSequence) str12)) {
                            if (!Intrinsics.EZpvd((java.lang.Object) str12, (java.lang.Object) VerifyDAppDomainUrlResponse.LEVEL_EXTREMELY_HIGH) && !Intrinsics.EZpvd((java.lang.Object) str12, (java.lang.Object) VerifyDAppDomainUrlResponse.LEVEL_HIGH)) {
                                yho.invoke(java.lang.Boolean.FALSE, java.lang.Boolean.valueOf(!zBooleanValue), oKCheckLeveldappInfo);
                                return;
                            }
                            if (componentActivity instanceof AbstractActivityC33041mov) {
                                if (EZpvd.copydefault(componentActivity)) {
                                    C14891dtx c14891dtxOLrzqt = C14891dtx.Companion.OLrzqt(str12, str, str13, !r2.copydefault(str), str6, new Function0() { // from class: o.dwh
                                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                        @Override // kotlin.jvm.functions.Function0
                                        public final java.lang.Object invoke() {
                                            return C14923duc.OLrzqt(str12, yho, oKCheckLeveldappInfo, function0);
                                        }
                                    });
                                    androidx.fragment.app.FragmentManager supportFragmentManager = ((AbstractActivityC33041mov) componentActivity).getSupportFragmentManager();
                                    Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
                                    c14891dtxOLrzqt.show(supportFragmentManager);
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        if (!C59449zhJ.startsWith$default(str, DefaultWebClient.HTTPS_SCHEME, false, i, null)) {
                            DappTabData dappTabDataOLrzqt2 = C15112dyF.AEQbTJ.OLrzqt();
                            if (dappTabDataOLrzqt2 == null || (mWebView = dappTabDataOLrzqt2.getMWebView()) == null || (originalUrl = mWebView.getOriginalUrl()) == null) {
                                originalUrl = str;
                            }
                            EZpvd.EZpvd(str, originalUrl, str3 == null ? "2" : str3);
                        }
                        if ((componentActivity instanceof AbstractActivityC33041mov) && !Intrinsics.EZpvd(bool, java.lang.Boolean.FALSE)) {
                            ((AbstractActivityC33041mov) componentActivity).showLoadingAtOnce();
                        }
                        AbstractC58185ywX abstractC58185ywXUnwrapResponseData$default = C43423rox.unwrapResponseData$default(C58156yvv.EZpvd(AEQbTJ.KWHzl(str, str7, list == null ? yDY.AhwBna() : list, str4 == null ? "" : str4, str5 == null ? "" : str5), componentActivity), (Function1) null, 1, (java.lang.Object) null);
                        final java.lang.String str15 = str7;
                        final Function1 function1 = new Function1() { // from class: o.dwg
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj) {
                                return C14923duc.AEQbTJ(componentActivity, str, str6, yho, str15, function0, (DappCheckUrlLevel) obj);
                            }
                        };
                        InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.dwn
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // o.InterfaceC58227yxM
                            public final void accept(java.lang.Object obj) {
                                C14923duc.QwvEab(function1, obj);
                            }
                        };
                        final Function1 function12 = new Function1() { // from class: o.dwj
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj) {
                                return C14923duc.KWHzl(yho, componentActivity, (java.lang.Throwable) obj);
                            }
                        };
                        Result.m7377constructorimpl(abstractC58185ywXUnwrapResponseData$default.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.dwk
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // o.InterfaceC58227yxM
                            public final void accept(java.lang.Object obj) {
                                C14923duc.UlJrfe(function12, obj);
                            }
                        }));
                        return;
                    }
                    i = 2;
                    z = true;
                    objM7377constructorimpl3 = Result.m7377constructorimpl(java.lang.Boolean.valueOf(z));
                    java.lang.Boolean bool22 = java.lang.Boolean.TRUE;
                    if (Result.m7383isFailureimpl(objM7377constructorimpl3)) {
                    }
                    boolean zBooleanValue2 = ((java.lang.Boolean) objM7377constructorimpl3).booleanValue();
                    Result.Application application72 = Result.Companion;
                    if (str11 != null) {
                        objM7377constructorimpl4 = Result.m7377constructorimpl(!C33129mqd.OLrzqt((java.lang.CharSequence) str14) ? (OKCheckLeveldappInfo) new Gson().fromJson(str14, OKCheckLeveldappInfo.class) : null);
                    }
                    if (Result.m7383isFailureimpl(objM7377constructorimpl4)) {
                    }
                    final OKCheckLeveldappInfo oKCheckLeveldappInfo2 = (OKCheckLeveldappInfo) objM7377constructorimpl4;
                    if (!C33129mqd.OLrzqt((java.lang.CharSequence) str12)) {
                    }
                }
                java.lang.Boolean bool3 = java.lang.Boolean.FALSE;
                yho.invoke(bool3, bool3, null);
            }
        } catch (java.lang.Throwable th5) {
            Result.Application application8 = Result.Companion;
            Result.m7377constructorimpl(C56391yDq.EZpvd(th5));
        }
    }

    public static final Unit OLrzqt(java.lang.String str, yHO yho, OKCheckLeveldappInfo oKCheckLeveldappInfo, Function0 function0) {
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) VerifyDAppDomainUrlResponse.LEVEL_HIGH)) {
            yho.invoke(java.lang.Boolean.TRUE, java.lang.Boolean.FALSE, oKCheckLeveldappInfo);
        } else if (function0 != null) {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }

    public static final void QwvEab(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AEQbTJ(ComponentActivity componentActivity, java.lang.String str, java.lang.String str2, final yHO yho, java.lang.String str3, final Function0 function0, final DappCheckUrlLevel dappCheckUrlLevel) {
        java.lang.String json;
        java.lang.String str4 = "";
        if (Intrinsics.EZpvd((java.lang.Object) dappCheckUrlLevel.getNewLevel(), (java.lang.Object) VerifyDAppDomainUrlResponse.LEVEL_EXTREMELY_HIGH) || Intrinsics.EZpvd((java.lang.Object) dappCheckUrlLevel.getNewLevel(), (java.lang.Object) VerifyDAppDomainUrlResponse.LEVEL_HIGH)) {
            if (componentActivity instanceof AbstractActivityC33041mov) {
                if (!EZpvd.copydefault(componentActivity)) {
                    return Unit.INSTANCE;
                }
                C14891dtx.Activity activity = C14891dtx.Companion;
                java.lang.String newLevel = dappCheckUrlLevel.getNewLevel();
                java.lang.String rule = dappCheckUrlLevel.getRule();
                C14891dtx c14891dtxOLrzqt = activity.OLrzqt(newLevel, str, rule == null ? "" : rule, !r0.copydefault(str), str2, new Function0() { // from class: o.duX
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return C14923duc.AEQbTJ(dappCheckUrlLevel, yho, function0);
                    }
                });
                androidx.fragment.app.FragmentManager supportFragmentManager = ((AbstractActivityC33041mov) componentActivity).getSupportFragmentManager();
                Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
                c14891dtxOLrzqt.show(supportFragmentManager);
            }
        } else {
            yho.invoke(java.lang.Boolean.FALSE, java.lang.Boolean.valueOf(!dappCheckUrlLevel.getSearchHistoryUrlIsBlack()), dappCheckUrlLevel.getDappInfo());
        }
        OKCheckLeveldappInfo dappInfo = dappCheckUrlLevel.getDappInfo();
        if (dappInfo != null && (json = new Gson().toJson(dappInfo)) != null) {
            str4 = json;
        }
        OLrzqt.put(EZpvd.KWHzl(str) + str3, dappCheckUrlLevel.getNewLevel() + "," + dappCheckUrlLevel.getRule() + "," + dappCheckUrlLevel.getSearchHistoryUrlIsBlack() + "|||" + str4);
        if (componentActivity instanceof AbstractActivityC33041mov) {
            ((AbstractActivityC33041mov) componentActivity).dismissLoading();
        }
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(DappCheckUrlLevel dappCheckUrlLevel, yHO yho, Function0 function0) {
        if (Intrinsics.EZpvd((java.lang.Object) dappCheckUrlLevel.getNewLevel(), (java.lang.Object) VerifyDAppDomainUrlResponse.LEVEL_HIGH)) {
            yho.invoke(java.lang.Boolean.TRUE, java.lang.Boolean.valueOf(!dappCheckUrlLevel.getSearchHistoryUrlIsBlack()), dappCheckUrlLevel.getDappInfo());
        } else if (function0 != null) {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }

    public static final void UlJrfe(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit KWHzl(yHO yho, ComponentActivity componentActivity, java.lang.Throwable th) {
        yho.invoke(java.lang.Boolean.FALSE, java.lang.Boolean.TRUE, null);
        if (componentActivity instanceof AbstractActivityC33041mov) {
            ((AbstractActivityC33041mov) componentActivity).dismissLoading();
        }
        return Unit.INSTANCE;
    }

    public final void EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        try {
            EventData eventData = new EventData();
            eventData.setAct("web3_discover_log");
            eventData.setCode("0");
            eventData.setMsg("success");
            ReportManager reportManager = ReportManager.AEQbTJ;
            eventData.setAttribute(C56424yEw.djBIcL(C56390yDp.OLrzqt("full_url", str2), C56390yDp.OLrzqt("attr_1", str), C56390yDp.OLrzqt("attr_2", "checkurl"), C56390yDp.OLrzqt("attr_3", str3)));
            reportManager.EZpvd(eventData);
        } catch (java.lang.Exception unused) {
        }
    }

    public final void OLrzqt(@NotNull final ComponentActivity componentActivity, @NotNull final PlatformItem platformItem, final java.lang.String str, final java.lang.Long l, final Function0<Unit> function0, boolean z, final boolean z2, final java.util.List<DappChains> list, boolean z3, boolean z4, final Function0<Unit> function02, @NotNull final java.lang.String str2, final java.lang.String str3, final Function1<? super androidx.fragment.app.Fragment, Unit> function1, final java.lang.Boolean bool, final java.lang.String str4, final int[] iArr, final boolean z5) {
        Intrinsics.checkNotNullParameter(componentActivity, "");
        Intrinsics.checkNotNullParameter(platformItem, "");
        Intrinsics.checkNotNullParameter(str2, "");
        if (componentActivity.isDestroyed() || componentActivity.isFinishing()) {
            return;
        }
        if (copydefault(platformItem.getUrl()) || z || (!z3 && z4)) {
            C14808dsT.Companion.KWHzl("");
            AEQbTJ(componentActivity, platformItem, str, l, function0, z2, list, values(), function02, str2, str3, function1, bool, str4, iArr, z5);
            return;
        }
        final boolean zValues = values();
        if (platformItem.getId() != 0 && !z4) {
            OLrzqt(componentActivity, platformItem, true, new Function0() { // from class: o.dwH
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C14923duc.OLrzqt(componentActivity, platformItem, str, l, function0, z2, list, zValues, function02, str2, str3, function1, bool, str4, iArr, z5);
                }
            });
        } else if (valueOf(platformItem.getUrl()) || !z3) {
            AEQbTJ(componentActivity, platformItem, str, l, function0, z2, list, zValues, function02, str2, str3, function1, bool, str4, iArr, z5);
        } else {
            Result.m7376boximpl(OLrzqt(componentActivity, platformItem.getUrl(), new Function0() { // from class: o.dwD
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C14923duc.KWHzl(componentActivity, platformItem, str, l, function0, z2, list, zValues, function02, str2, str3, function1, bool, str4, iArr, z5);
                }
            }));
        }
    }

    public static final Unit OLrzqt(ComponentActivity componentActivity, PlatformItem platformItem, java.lang.String str, java.lang.Long l, Function0 function0, boolean z, java.util.List list, boolean z2, Function0 function02, java.lang.String str2, java.lang.String str3, Function1 function1, java.lang.Boolean bool, java.lang.String str4, int[] iArr, boolean z3) {
        EZpvd.AEQbTJ(componentActivity, platformItem, str, l, (Function0<Unit>) function0, z, (java.util.List<DappChains>) list, z2, (Function0<Unit>) function02, str2, str3, (Function1<? super androidx.fragment.app.Fragment, Unit>) function1, bool, str4, iArr, z3);
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(ComponentActivity componentActivity, PlatformItem platformItem, java.lang.String str, java.lang.Long l, Function0 function0, boolean z, java.util.List list, boolean z2, Function0 function02, java.lang.String str2, java.lang.String str3, Function1 function1, java.lang.Boolean bool, java.lang.String str4, int[] iArr, boolean z3) {
        EZpvd.AEQbTJ(componentActivity, platformItem, str, l, (Function0<Unit>) function0, z, (java.util.List<DappChains>) list, z2, (Function0<Unit>) function02, str2, str3, (Function1<? super androidx.fragment.app.Fragment, Unit>) function1, bool, str4, iArr, z3);
        return Unit.INSTANCE;
    }

    public final boolean valueOf(@NotNull java.lang.String str) {
        java.net.URL url;
        Intrinsics.checkNotNullParameter(str, "");
        try {
            url = new java.net.URL(str);
        } catch (java.lang.Exception unused) {
            if (DbNXlk.contains(str) || iwGUEr().contains(str)) {
                return true;
            }
        }
        if (!DbNXlk.contains(url.getHost())) {
            if (!iwGUEr().contains(url.getHost())) {
                return false;
            }
        }
        return true;
    }

    public final void AEQbTJ(@NotNull final DappSearchResultBean dappSearchResultBean) {
        Intrinsics.checkNotNullParameter(dappSearchResultBean, "");
        if (StringsKt__StringsKt.fARcdN((java.lang.CharSequence) dappSearchResultBean.getDeepLink())) {
            return;
        }
        AbstractC58260yxt<DappSearchResultBean> abstractC58260yxtOLrzqt = ((xWH) C43251rlk.copydefault(xWH.class)).OLrzqt(dappSearchResultBean.getDeepLink());
        final Function1 function1 = new Function1() { // from class: o.duP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C14923duc.EZpvd(dappSearchResultBean, (DappSearchResultBean) obj);
            }
        };
        InterfaceC58227yxM<? super DappSearchResultBean> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.duO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C14923duc.DsrFlB(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.duS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C14923duc.dvKsVJ((java.lang.Throwable) obj);
            }
        };
        abstractC58260yxtOLrzqt.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.duU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C14923duc.DNMMPQ(function12, obj);
            }
        });
    }

    public static final void DsrFlB(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit EZpvd(final DappSearchResultBean dappSearchResultBean, DappSearchResultBean dappSearchResultBean2) {
        if (dappSearchResultBean2 == null) {
            pUU.copydefault("DappUtils", "getSearchHistoryByDeepLink null");
            return Unit.INSTANCE;
        }
        AbstractC58260yxt<java.lang.Integer> abstractC58260yxtCopydefault = ((xWH) C43251rlk.copydefault(xWH.class)).copydefault(dappSearchResultBean);
        final Function1 function1 = new Function1() { // from class: o.dum
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C14923duc.ejfBZ(dappSearchResultBean, (java.lang.Integer) obj);
            }
        };
        InterfaceC58227yxM<? super java.lang.Integer> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.dui
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C14923duc.DaRZkR(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.duj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C14923duc.dxcTrN((java.lang.Throwable) obj);
            }
        };
        abstractC58260yxtCopydefault.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.duk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C14923duc.DGgnkA(function12, obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final void DaRZkR(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit ejfBZ(DappSearchResultBean dappSearchResultBean, java.lang.Integer num) {
        pUU.copydefault("DappUtils", "deleteSearchHistory success");
        AbstractC58260yxt<java.lang.Long> abstractC58260yxtKWHzl = ((xWH) C43251rlk.copydefault(xWH.class)).KWHzl(dappSearchResultBean);
        final Function1 function1 = new Function1() { // from class: o.dwE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C14923duc.fJNWhG((java.lang.Long) obj);
            }
        };
        InterfaceC58227yxM<? super java.lang.Long> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.dwN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C14923duc.hCLrkq(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.due
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C14923duc.djSkpj((java.lang.Throwable) obj);
            }
        };
        abstractC58260yxtKWHzl.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.dup
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C14923duc.heceqZ(function12, obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit djSkpj(java.lang.Throwable th) {
        return Unit.INSTANCE;
    }

    public static final Unit fJNWhG(java.lang.Long l) {
        return Unit.INSTANCE;
    }

    public static final void hCLrkq(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final void heceqZ(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final void DGgnkA(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit dxcTrN(java.lang.Throwable th) {
        pUU.copydefault("DappUtils", "deleteSearchHistory error");
        return Unit.INSTANCE;
    }

    public static final void DNMMPQ(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit dvKsVJ(java.lang.Throwable th) {
        pUU.copydefault("DappUtils", "getSearchHistoryByDeepLink error");
        return Unit.INSTANCE;
    }

    public final void KWHzl(@NotNull final DappSearchResultBean dappSearchResultBean) {
        Intrinsics.checkNotNullParameter(dappSearchResultBean, "");
        if (StringsKt__StringsKt.fARcdN((java.lang.CharSequence) dappSearchResultBean.getDeepLink())) {
            return;
        }
        if (!Intrinsics.EZpvd((java.lang.Object) dappSearchResultBean.getId(), (java.lang.Object) "0")) {
            AbstractC58260yxt<java.lang.Integer> abstractC58260yxtKWHzl = ((xWH) C43251rlk.copydefault(xWH.class)).KWHzl(dappSearchResultBean.getId());
            final Function1 function1 = new Function1() { // from class: o.dvx
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C14923duc.values(dappSearchResultBean, (java.lang.Integer) obj);
                }
            };
            InterfaceC58227yxM<? super java.lang.Integer> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.dvC
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    C14923duc.ODXsMY(function1, obj);
                }
            };
            final Function1 function12 = new Function1() { // from class: o.dvA
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C14923duc.valueOf(dappSearchResultBean, (java.lang.Throwable) obj);
                }
            };
            abstractC58260yxtKWHzl.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.dvD
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    C14923duc.USBtdM(function12, obj);
                }
            });
        }
        AbstractC58260yxt<java.lang.Integer> abstractC58260yxtDjBIcL = ((xWH) C43251rlk.copydefault(xWH.class)).djBIcL();
        final Function1 function13 = new Function1() { // from class: o.dvE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C14923duc.fetchVPNInfo(dappSearchResultBean, (java.lang.Integer) obj);
            }
        };
        InterfaceC58227yxM<? super java.lang.Integer> interfaceC58227yxM2 = new InterfaceC58227yxM() { // from class: o.dvH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C14923duc.QkdxfA(function13, obj);
            }
        };
        final Function1 function14 = new Function1() { // from class: o.dvG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C14923duc.AxsJAY((java.lang.Throwable) obj);
            }
        };
        abstractC58260yxtDjBIcL.AEQbTJ(interfaceC58227yxM2, new InterfaceC58227yxM() { // from class: o.dvJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C14923duc.RKDWNf(function14, obj);
            }
        });
    }

    public static final void ODXsMY(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit values(final DappSearchResultBean dappSearchResultBean, java.lang.Integer num) {
        pUU.copydefault("DappUtils", "deleteRecentBrowseById  " + dappSearchResultBean.getId() + "   " + num);
        AbstractC58260yxt<java.lang.Integer> abstractC58260yxtValueOf = ((xWH) C43251rlk.copydefault(xWH.class)).valueOf();
        final Function1 function1 = new Function1() { // from class: o.dwF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C14923duc.fIwbmz(dappSearchResultBean, (java.lang.Integer) obj);
            }
        };
        InterfaceC58227yxM<? super java.lang.Integer> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.dwL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C14923duc.hBpjJd(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.dwM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C14923duc.DTwDnp((java.lang.Throwable) obj);
            }
        };
        abstractC58260yxtValueOf.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.dwJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C14923duc.hrNTAI(function12, obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final void hBpjJd(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit fIwbmz(final DappSearchResultBean dappSearchResultBean, java.lang.Integer num) {
        if (num != null && num.intValue() == 50) {
            AbstractC58260yxt<java.lang.Integer> abstractC58260yxtKWHzl = ((xWH) C43251rlk.copydefault(xWH.class)).KWHzl();
            final Function1 function1 = new Function1() { // from class: o.duJ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C14923duc.fARcdN(dappSearchResultBean, (java.lang.Integer) obj);
                }
            };
            InterfaceC58227yxM<? super java.lang.Integer> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.duW
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    C14923duc.dHguZz(function1, obj);
                }
            };
            final Function1 function12 = new Function1() { // from class: o.dvi
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C14923duc.gHZMYf((java.lang.Throwable) obj);
                }
            };
            abstractC58260yxtKWHzl.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.dvl
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    C14923duc.dmfpNf(function12, obj);
                }
            });
        } else {
            AbstractC58260yxt<java.lang.Long> abstractC58260yxtOLrzqt = ((xWH) C43251rlk.copydefault(xWH.class)).OLrzqt(dappSearchResultBean);
            final Function1 function13 = new Function1() { // from class: o.dvn
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C14923duc.fARcdN((java.lang.Long) obj);
                }
            };
            InterfaceC58227yxM<? super java.lang.Long> interfaceC58227yxM2 = new InterfaceC58227yxM() { // from class: o.dvo
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    C14923duc.gwTjWJ(function13, obj);
                }
            };
            final Function1 function14 = new Function1() { // from class: o.dvu
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C14923duc.sSMYrx((java.lang.Throwable) obj);
                }
            };
            abstractC58260yxtOLrzqt.AEQbTJ(interfaceC58227yxM2, new InterfaceC58227yxM() { // from class: o.dvq
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    C14923duc.RdAHlO(function14, obj);
                }
            });
        }
        return Unit.INSTANCE;
    }

    public static final void dHguZz(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AkhnZx(java.lang.Long l) {
        return Unit.INSTANCE;
    }

    public static final void OBJEWx(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final void QHmsKR(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit fARcdN(DappSearchResultBean dappSearchResultBean, java.lang.Integer num) {
        AbstractC58260yxt<java.lang.Long> abstractC58260yxtOLrzqt = ((xWH) C43251rlk.copydefault(xWH.class)).OLrzqt(dappSearchResultBean);
        final Function1 function1 = new Function1() { // from class: o.duq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C14923duc.AkhnZx((java.lang.Long) obj);
            }
        };
        InterfaceC58227yxM<? super java.lang.Long> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.dun
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C14923duc.QHmsKR(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.dur
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C14923duc.zuBGHE((java.lang.Throwable) obj);
            }
        };
        abstractC58260yxtOLrzqt.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.duo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C14923duc.OBJEWx(function12, obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit zuBGHE(java.lang.Throwable th) {
        return Unit.INSTANCE;
    }

    public static final void dmfpNf(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit gHZMYf(java.lang.Throwable th) {
        return Unit.INSTANCE;
    }

    public static final void RdAHlO(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit fARcdN(java.lang.Long l) {
        return Unit.INSTANCE;
    }

    public static final void gwTjWJ(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit sSMYrx(java.lang.Throwable th) {
        return Unit.INSTANCE;
    }

    public static final Unit DTwDnp(java.lang.Throwable th) {
        return Unit.INSTANCE;
    }

    public static final void hrNTAI(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final void USBtdM(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final void OJuSTm(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit valueOf(final DappSearchResultBean dappSearchResultBean, java.lang.Throwable th) {
        AbstractC58260yxt<java.lang.Integer> abstractC58260yxtValueOf = ((xWH) C43251rlk.copydefault(xWH.class)).valueOf();
        final Function1 function1 = new Function1() { // from class: o.dvs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C14923duc.fJNWhG(dappSearchResultBean, (java.lang.Integer) obj);
            }
        };
        InterfaceC58227yxM<? super java.lang.Integer> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.dvr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C14923duc.OJuSTm(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.dvz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C14923duc.ORxRYg((java.lang.Throwable) obj);
            }
        };
        abstractC58260yxtValueOf.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.dvw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C14923duc.OxVOHk(function12, obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit fJNWhG(final DappSearchResultBean dappSearchResultBean, java.lang.Integer num) {
        if (num != null && num.intValue() == 50) {
            AbstractC58260yxt<java.lang.Integer> abstractC58260yxtKWHzl = ((xWH) C43251rlk.copydefault(xWH.class)).KWHzl();
            final Function1 function1 = new Function1() { // from class: o.dwT
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C14923duc.AuCTel(dappSearchResultBean, (java.lang.Integer) obj);
                }
            };
            InterfaceC58227yxM<? super java.lang.Integer> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.dwW
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    C14923duc.OHqIaq(function1, obj);
                }
            };
            final Function1 function12 = new Function1() { // from class: o.dwV
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C14923duc.QOLQEE((java.lang.Throwable) obj);
                }
            };
            abstractC58260yxtKWHzl.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.dwS
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    C14923duc.QVsKAR(function12, obj);
                }
            });
        } else {
            AbstractC58260yxt<java.lang.Long> abstractC58260yxtOLrzqt = ((xWH) C43251rlk.copydefault(xWH.class)).OLrzqt(dappSearchResultBean);
            final Function1 function13 = new Function1() { // from class: o.dwU
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C14923duc.ejfBZ((java.lang.Long) obj);
                }
            };
            InterfaceC58227yxM<? super java.lang.Long> interfaceC58227yxM2 = new InterfaceC58227yxM() { // from class: o.dwX
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    C14923duc.QCjLjM(function13, obj);
                }
            };
            final Function1 function14 = new Function1() { // from class: o.dxb
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C14923duc.OcIXYQ((java.lang.Throwable) obj);
                }
            };
            abstractC58260yxtOLrzqt.AEQbTJ(interfaceC58227yxM2, new InterfaceC58227yxM() { // from class: o.dxa
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    C14923duc.QSLkRj(function14, obj);
                }
            });
        }
        return Unit.INSTANCE;
    }

    public static final void OHqIaq(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AuCTel(DappSearchResultBean dappSearchResultBean, java.lang.Integer num) {
        AbstractC58260yxt<java.lang.Long> abstractC58260yxtOLrzqt = ((xWH) C43251rlk.copydefault(xWH.class)).OLrzqt(dappSearchResultBean);
        final Function1 function1 = new Function1() { // from class: o.dwI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C14923duc.AuCTel((java.lang.Long) obj);
            }
        };
        InterfaceC58227yxM<? super java.lang.Long> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.dwK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C14923duc.OFhtUX(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.dwR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C14923duc.QKVWgx((java.lang.Throwable) obj);
            }
        };
        abstractC58260yxtOLrzqt.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.dwP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C14923duc.DLWbHP(function12, obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit AuCTel(java.lang.Long l) {
        return Unit.INSTANCE;
    }

    public static final void DLWbHP(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final void OFhtUX(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit QKVWgx(java.lang.Throwable th) {
        return Unit.INSTANCE;
    }

    public static final Unit QOLQEE(java.lang.Throwable th) {
        return Unit.INSTANCE;
    }

    public static final void QVsKAR(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit OcIXYQ(java.lang.Throwable th) {
        return Unit.INSTANCE;
    }

    public static final void QCjLjM(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final void QSLkRj(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit ejfBZ(java.lang.Long l) {
        return Unit.INSTANCE;
    }

    public static final Unit ORxRYg(java.lang.Throwable th) {
        return Unit.INSTANCE;
    }

    public static final void OxVOHk(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final void QkdxfA(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit fetchVPNInfo(final DappSearchResultBean dappSearchResultBean, java.lang.Integer num) {
        if (num != null && num.intValue() == 50) {
            AbstractC58260yxt<java.lang.Integer> abstractC58260yxtOLrzqt = ((xWH) C43251rlk.copydefault(xWH.class)).OLrzqt();
            final Function1 function1 = new Function1() { // from class: o.dve
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C14923duc.DbNXlk(dappSearchResultBean, (java.lang.Integer) obj);
                }
            };
            InterfaceC58227yxM<? super java.lang.Integer> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.dvd
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    C14923duc.ODWQjV(function1, obj);
                }
            };
            final Function1 function12 = new Function1() { // from class: o.dvk
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C14923duc.zLjUOn((java.lang.Throwable) obj);
                }
            };
            abstractC58260yxtOLrzqt.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.dvj
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    C14923duc.OqFWZa(function12, obj);
                }
            });
        } else {
            AbstractC58260yxt<java.lang.Integer> abstractC58260yxtCopydefault = ((xWH) C43251rlk.copydefault(xWH.class)).copydefault(dappSearchResultBean);
            final Function1 function13 = new Function1() { // from class: o.dvg
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C14923duc.AkhnZx(dappSearchResultBean, (java.lang.Integer) obj);
                }
            };
            InterfaceC58227yxM<? super java.lang.Integer> interfaceC58227yxM2 = new InterfaceC58227yxM() { // from class: o.dvh
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    C14923duc.zuWLRA(function13, obj);
                }
            };
            final Function1 function14 = new Function1() { // from class: o.dvm
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C14923duc.KWHzl(dappSearchResultBean, (java.lang.Throwable) obj);
                }
            };
            abstractC58260yxtCopydefault.AEQbTJ(interfaceC58227yxM2, new InterfaceC58227yxM() { // from class: o.dvp
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    C14923duc.QSBOWP(function14, obj);
                }
            });
        }
        return Unit.INSTANCE;
    }

    public static final void ODWQjV(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final void DAIeex(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit DbNXlk(final DappSearchResultBean dappSearchResultBean, java.lang.Integer num) {
        AbstractC58260yxt<java.lang.Integer> abstractC58260yxtCopydefault = ((xWH) C43251rlk.copydefault(xWH.class)).copydefault(dappSearchResultBean);
        final Function1 function1 = new Function1() { // from class: o.dwc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C14923duc.isConnected(dappSearchResultBean, (java.lang.Integer) obj);
            }
        };
        InterfaceC58227yxM<? super java.lang.Integer> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.dwd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C14923duc.DAIeex(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.dvZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C14923duc.AEQbTJ(dappSearchResultBean, (java.lang.Throwable) obj);
            }
        };
        abstractC58260yxtCopydefault.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.dwb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C14923duc.DCJXGO(function12, obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final void QKudOq(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final void RlQdEF(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit isConnected(DappSearchResultBean dappSearchResultBean, java.lang.Integer num) {
        AbstractC58260yxt<java.lang.Long> abstractC58260yxtKWHzl = ((xWH) C43251rlk.copydefault(xWH.class)).KWHzl(dappSearchResultBean);
        final Function1 function1 = new Function1() { // from class: o.duF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C14923duc.isConnected((java.lang.Long) obj);
            }
        };
        InterfaceC58227yxM<? super java.lang.Long> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.duH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C14923duc.QKudOq(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.duK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C14923duc.wlaJM((java.lang.Throwable) obj);
            }
        };
        abstractC58260yxtKWHzl.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.duL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C14923duc.RlQdEF(function12, obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit isConnected(java.lang.Long l) {
        return Unit.INSTANCE;
    }

    public static final Unit wlaJM(java.lang.Throwable th) {
        return Unit.INSTANCE;
    }

    public static final void DCJXGO(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AEQbTJ(DappSearchResultBean dappSearchResultBean, java.lang.Throwable th) {
        AbstractC58260yxt<java.lang.Long> abstractC58260yxtKWHzl = ((xWH) C43251rlk.copydefault(xWH.class)).KWHzl(dappSearchResultBean);
        final Function1 function1 = new Function1() { // from class: o.dvI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C14923duc.values((java.lang.Long) obj);
            }
        };
        InterfaceC58227yxM<? super java.lang.Long> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.dvF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C14923duc.DarRvM(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.dvN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C14923duc.AuCTelauCTel((java.lang.Throwable) obj);
            }
        };
        abstractC58260yxtKWHzl.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.dvK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C14923duc.DXXBbs(function12, obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit AuCTelauCTel(java.lang.Throwable th) {
        return Unit.INSTANCE;
    }

    public static final void DXXBbs(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final void DarRvM(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit values(java.lang.Long l) {
        return Unit.INSTANCE;
    }

    public static final void OqFWZa(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit zLjUOn(java.lang.Throwable th) {
        return Unit.INSTANCE;
    }

    public static final void zuWLRA(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AkhnZx(DappSearchResultBean dappSearchResultBean, java.lang.Integer num) {
        AbstractC58260yxt<java.lang.Long> abstractC58260yxtKWHzl = ((xWH) C43251rlk.copydefault(xWH.class)).KWHzl(dappSearchResultBean);
        final Function1 function1 = new Function1() { // from class: o.dwa
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C14923duc.DbNXlk((java.lang.Long) obj);
            }
        };
        InterfaceC58227yxM<? super java.lang.Long> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.dwe
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C14923duc.DCUTEI(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.dwf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C14923duc.AubY((java.lang.Throwable) obj);
            }
        };
        abstractC58260yxtKWHzl.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.dwi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C14923duc.OuxcSI(function12, obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit AubY(java.lang.Throwable th) {
        return Unit.INSTANCE;
    }

    public static final void DCUTEI(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit DbNXlk(java.lang.Long l) {
        return Unit.INSTANCE;
    }

    public static final void OuxcSI(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final void QSBOWP(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AwvSrB(java.lang.Throwable th) {
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(DappSearchResultBean dappSearchResultBean, java.lang.Throwable th) {
        AbstractC58260yxt<java.lang.Long> abstractC58260yxtKWHzl = ((xWH) C43251rlk.copydefault(xWH.class)).KWHzl(dappSearchResultBean);
        final Function1 function1 = new Function1() { // from class: o.duI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C14923duc.fetchVPNInfo((java.lang.Long) obj);
            }
        };
        InterfaceC58227yxM<? super java.lang.Long> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.duN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C14923duc.ffGIBT(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.duM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C14923duc.AwvSrB((java.lang.Throwable) obj);
            }
        };
        abstractC58260yxtKWHzl.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.duQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C14923duc.getPostValueLengthLimit(function12, obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit fetchVPNInfo(java.lang.Long l) {
        return Unit.INSTANCE;
    }

    public static final void ffGIBT(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final void getPostValueLengthLimit(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AxsJAY(java.lang.Throwable th) {
        return Unit.INSTANCE;
    }

    public static final void RKDWNf(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public final void AEQbTJ(@NotNull final ComponentActivity componentActivity, @NotNull final PlatformItem platformItem, final java.lang.String str, final java.lang.Long l, final Function0<Unit> function0, final boolean z, final java.util.List<DappChains> list, final boolean z2, Function0<Unit> function02, @NotNull final java.lang.String str2, final java.lang.String str3, final Function1<? super androidx.fragment.app.Fragment, Unit> function1, final java.lang.Boolean bool, final java.lang.String str4, final int[] iArr, boolean z3) {
        Intrinsics.checkNotNullParameter(componentActivity, "");
        Intrinsics.checkNotNullParameter(platformItem, "");
        Intrinsics.checkNotNullParameter(str2, "");
        if (componentActivity.isDestroyed() || componentActivity.isFinishing()) {
            return;
        }
        if (platformItem.getId() == 0) {
            platformItem.setLogo(AEQbTJ(platformItem.getUrl()));
            platformItem.setPlatform(KWHzl(platformItem.getUrl()));
        }
        if (z3) {
            KWHzl(OLrzqt(platformItem));
        }
        if (function02 != null) {
            function02.invoke();
            return;
        }
        Function0<Unit> function03 = AYXKKw;
        if (function03 != null) {
            function03.invoke();
        }
        AbstractC58185ywX abstractC58185ywXEnsureInitialized$default = InterfaceC9739bbK.StateListAnimator.ensureInitialized$default(((InterfaceC9852bdR) C43248rlh.KWHzl.AEQbTJ(InterfaceC9852bdR.class)).AhwBna(), false, 1, null);
        final Function1 function12 = new Function1() { // from class: o.dwA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C14923duc.KWHzl(str4, function1, platformItem, list, str, l, function0, z, z2, str2, str3, bool, componentActivity, iArr, (java.lang.Boolean) obj);
            }
        };
        InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.dwy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C14923duc.fERRXa(function12, obj);
            }
        };
        final Function1 function13 = new Function1() { // from class: o.dwC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C14923duc.QbewEr((java.lang.Throwable) obj);
            }
        };
        abstractC58185ywXEnsureInitialized$default.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.dwG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C14923duc.DCUTEIdCUTEI(function13, obj);
            }
        });
    }

    public static final void fERRXa(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit KWHzl(java.lang.String str, Function1 function1, PlatformItem platformItem, java.util.List list, java.lang.String str2, java.lang.Long l, Function0 function0, boolean z, boolean z2, java.lang.String str3, java.lang.String str4, java.lang.Boolean bool, ComponentActivity componentActivity, int[] iArr, java.lang.Boolean bool2) {
        if (Intrinsics.EZpvd(bool2, java.lang.Boolean.TRUE)) {
            C7323ahf.KWHzl().AEQbTJ("closeSecurityPage", null, null);
            RxBus.KWHzl("closeDappDetailPage");
            C7323ahf.KWHzl().AEQbTJ("EVENT_CLOSE_PRE_WEBPAGE", null, null);
            RxBus.AEQbTJ(new dIO(str == null ? "" : str));
            if (function1 != null) {
                function1.invoke(dBW.Companion.EZpvd(platformItem, list, str2, l, function0, z, z2, str3, str4, bool, str));
            } else {
                dBQ.Companion.KWHzl(componentActivity, platformItem, list, str2, l, function0, z, z2, str3, str4, iArr);
            }
        }
        return Unit.INSTANCE;
    }

    public static final void DCUTEIdCUTEI(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit QbewEr(java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        return Unit.INSTANCE;
    }

    public final java.util.List<DappChains> isConnected() {
        return C15157dyy.EZpvd.copydefault();
    }

    public final long AEQbTJ(java.util.List<DappChains> list, @NotNull java.lang.String str) {
        java.lang.Object next;
        java.lang.Object next2;
        java.lang.Object next3;
        Intrinsics.checkNotNullParameter(str, "");
        java.lang.Object objOLrzqt = C33129mqd.OLrzqt((java.lang.CharSequence) str) ? ((InterfaceC9852bdR) C43251rlk.copydefault(InterfaceC9852bdR.class)).gEmmrt().OLrzqt(str) : null;
        if (objOLrzqt == null) {
            objOLrzqt = CollectionsKt___CollectionsKt.firstOrNull(((InterfaceC9852bdR) C43251rlk.copydefault(InterfaceC9852bdR.class)).gEmmrt().copydefault());
        }
        if (list == null) {
            return 1L;
        }
        java.util.Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            DappChains dappChains = (DappChains) next;
            InterfaceC9738bbJ interfaceC9738bbJ = (InterfaceC9738bbJ) objOLrzqt;
            if (interfaceC9738bbJ != null && EZpvd.EZpvd(interfaceC9738bbJ, java.lang.Long.valueOf(dappChains.getChainId()))) {
                break;
            }
        }
        DappChains dappChains2 = (DappChains) next;
        java.lang.Long lValueOf = dappChains2 != null ? java.lang.Long.valueOf(dappChains2.getChainId()) : null;
        if (lValueOf != null) {
            return lValueOf.longValue();
        }
        java.util.Iterator<T> it2 = list.iterator();
        while (true) {
            if (!it2.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it2.next();
            DappChains dappChains3 = (DappChains) next2;
            java.util.Iterator<T> it3 = ((InterfaceC9852bdR) C43251rlk.copydefault(InterfaceC9852bdR.class)).gEmmrt().OLrzqt().iterator();
            while (true) {
                if (!it3.hasNext()) {
                    next3 = null;
                    break;
                }
                next3 = it3.next();
                if (EZpvd.EZpvd((InterfaceC9738bbJ) next3, java.lang.Long.valueOf(dappChains3.getChainId()))) {
                    break;
                }
            }
            if (next3 != null) {
                break;
            }
        }
        DappChains dappChains4 = (DappChains) next2;
        java.lang.Long lValueOf2 = dappChains4 != null ? java.lang.Long.valueOf(dappChains4.getChainId()) : null;
        if (lValueOf2 != null) {
            return lValueOf2.longValue();
        }
        if (C33129mqd.KWHzl((java.util.Collection) list)) {
            return list.get(0).getChainId();
        }
        return 1L;
    }

    public final PlatformItem OLrzqt(@NotNull DappListBean dappListBean) {
        Intrinsics.checkNotNullParameter(dappListBean, "");
        return new PlatformItem(dappListBean.getId(), dappListBean.getName(), dappListBean.getLogo(), (java.lang.String) null, (java.lang.String) null, dappListBean.getShortDescribe(), (java.util.List) null, (java.util.List) null, dappListBean.getUrl(), (java.lang.String) null, 0L, 0, dappListBean.getCategory(), (java.lang.String) null, 11992, (DefaultConstructorMarker) null);
    }

    public final DappSearchResultBean OLrzqt(@NotNull PlatformItem platformItem) {
        java.lang.Object objM7377constructorimpl;
        Intrinsics.checkNotNullParameter(platformItem, "");
        long id = platformItem.getId();
        java.lang.String platform = platformItem.getPlatform();
        java.lang.String intro = platformItem.getIntro();
        java.lang.String logo = platformItem.getLogo();
        java.lang.String url = platformItem.getUrl();
        try {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(java.lang.Integer.valueOf(java.lang.Integer.parseInt(platformItem.getCategory())));
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
            objM7377constructorimpl = 0;
        }
        return new DappSearchResultBean((java.lang.String) null, ((java.lang.Number) objM7377constructorimpl).intValue(), url, java.lang.String.valueOf(id), logo, (java.lang.String) null, (java.lang.String) null, platform, intro, false, (java.util.List) null, 0L, 3681, (DefaultConstructorMarker) null);
    }

    public final PlatformItem copydefault(@NotNull DappSearchResultBean dappSearchResultBean) {
        Intrinsics.checkNotNullParameter(dappSearchResultBean, "");
        return new PlatformItem(java.lang.Long.parseLong(dappSearchResultBean.getId()), dappSearchResultBean.getName(), dappSearchResultBean.getLogo(), (java.lang.String) null, (java.lang.String) null, dappSearchResultBean.getShortDescribe(), (java.util.List) null, (java.util.List) null, dappSearchResultBean.getDeepLink(), (java.lang.String) null, 0L, 0, java.lang.String.valueOf(dappSearchResultBean.getCategory()), (java.lang.String) null, 11992, (DefaultConstructorMarker) null);
    }

    public final java.lang.String AEQbTJ(java.lang.String str) {
        PlatformItem mItem;
        java.lang.String logo;
        java.lang.String url;
        PlatformItem mItem2;
        java.lang.String logo2;
        PlatformItem mItem3;
        if (str == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str)) {
            return "";
        }
        C15112dyF c15112dyF = C15112dyF.AEQbTJ;
        DappTabData dappTabDataOLrzqt = c15112dyF.OLrzqt();
        if (dappTabDataOLrzqt != null && (mItem = dappTabDataOLrzqt.getMItem()) != null && (logo = mItem.getLogo()) != null && logo.length() > 0) {
            DappTabData dappTabDataOLrzqt2 = c15112dyF.OLrzqt();
            if (dappTabDataOLrzqt2 == null || (mItem3 = dappTabDataOLrzqt2.getMItem()) == null || (url = mItem3.getUrl()) == null) {
                url = "";
            }
            if (Intrinsics.EZpvd((java.lang.Object) KWHzl(url), (java.lang.Object) KWHzl(str == null ? "" : str))) {
                DappTabData dappTabDataOLrzqt3 = c15112dyF.OLrzqt();
                return (dappTabDataOLrzqt3 == null || (mItem2 = dappTabDataOLrzqt3.getMItem()) == null || (logo2 = mItem2.getLogo()) == null) ? "" : logo2;
            }
        }
        try {
            java.net.URL url2 = new java.net.URL(str);
            java.lang.String str2 = url2.getProtocol() + "://" + url2.getHost() + "/favicon.ico";
            Intrinsics.copydefault((java.lang.Object) str2);
            return str2;
        } catch (MalformedURLException unused) {
            return "";
        }
    }

    public final boolean AEQbTJ(@NotNull InterfaceC9738bbJ interfaceC9738bbJ, java.lang.Long l) {
        Intrinsics.checkNotNullParameter(interfaceC9738bbJ, "");
        return l != null && interfaceC9738bbJ.EZpvd(l) && interfaceC9738bbJ.AhwBna(l.longValue()) && interfaceC9738bbJ.djSkpj();
    }

    public final boolean EZpvd(@NotNull InterfaceC9738bbJ interfaceC9738bbJ, java.lang.Long l) {
        Intrinsics.checkNotNullParameter(interfaceC9738bbJ, "");
        return l != null && interfaceC9738bbJ.AhwBna(l.longValue()) && interfaceC9738bbJ.djSkpj();
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final kotlin.Pair<java.lang.String, java.lang.String> uzCIH(java.lang.Long l) {
        java.lang.String strDjBIcL;
        java.lang.String strAYXKKw = C33070mpX.AYXKKw(dLX.Dialog.hBpjJd);
        if (l != null) {
            InterfaceC9731bbC interfaceC9731bbCEZpvd = ((InterfaceC9852bdR) C43251rlk.copydefault(InterfaceC9852bdR.class)).copydefault().EZpvd(l.longValue(), true);
            strDjBIcL = interfaceC9731bbCEZpvd != null ? interfaceC9731bbCEZpvd.djBIcL() : null;
            if (strDjBIcL == null) {
                strDjBIcL = "";
            }
        }
        return new kotlin.Pair<>(strAYXKKw, C33069mpW.KWHzl(C32979mnm.EZpvd.OLrzqt(), dLX.Dialog.DCJXGO, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("Currentchain", strDjBIcL))));
    }

    public final kotlin.Pair<java.lang.String, java.lang.String> AuCTel() {
        return new kotlin.Pair<>(C33070mpX.AYXKKw(dLX.Dialog.hBpjJd), C33070mpX.AYXKKw(dLX.Dialog.OBJEWx));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: o.duc */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void showConnectWalletDialog$default(C14923duc c14923duc, kotlin.Pair pair, androidx.fragment.app.FragmentManager fragmentManager, Function0 function0, Function0 function02, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            function0 = null;
        }
        if ((i & 8) != 0) {
            function02 = null;
        }
        c14923duc.copydefault(pair, fragmentManager, function0, function02);
    }

    public final void copydefault(@NotNull kotlin.Pair<java.lang.String, java.lang.String> pair, @NotNull androidx.fragment.app.FragmentManager fragmentManager, final Function0<Unit> function0, final Function0<Unit> function02) {
        Intrinsics.checkNotNullParameter(pair, "");
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        if (copydefault) {
            return;
        }
        ((xWO) C43251rlk.copydefault(xWO.class)).AEQbTJ(fragmentManager, pair.getFirst(), pair.getSecond(), new ActionBar(), new InterfaceC54856xXw() { // from class: o.dws
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC54856xXw
            public final void OLrzqt(android.os.Bundle bundle) {
                C14923duc.copydefault(function0, function02, bundle);
            }
        });
        copydefault = true;
    }

    public static final void copydefault(Function0 function0, Function0 function02, android.os.Bundle bundle) {
        copydefault = false;
        if (bundle != null) {
            if (bundle.getBoolean("result")) {
                if (function0 != null) {
                    function0.invoke();
                }
            } else if (function02 != null) {
                function02.invoke();
            }
        }
    }

    public final java.util.List<java.lang.Long> fetchVPNInfo() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<T> it = ((InterfaceC9852bdR) C43251rlk.copydefault(InterfaceC9852bdR.class)).copydefault().copydefault(true).iterator();
        while (it.hasNext()) {
            arrayList.add(java.lang.Long.valueOf(((InterfaceC9731bbC) it.next()).fetchVPNInfo()));
        }
        return arrayList;
    }

    public static /* synthetic */ java.lang.String getCropUrl$default(C14923duc c14923duc, java.lang.String str, int i, int i2, int i3, java.lang.Object obj) {
        if ((i3 & 2) != 0) {
            i = -1;
        }
        if ((i3 & 4) != 0) {
            i2 = -1;
        }
        return c14923duc.copydefault(str, i, i2);
    }

    public final java.lang.String copydefault(java.lang.String str, int i, int i2) {
        java.lang.String strKWHzl;
        return (str == null || C59449zhJ.endsWith$default(str, "/favicon.ico", false, 2, null) || (strKWHzl = C55297xhL.KWHzl(str, i2, i)) == null) ? str : strKWHzl;
    }

    public final int AEQbTJ(@NotNull android.widget.ImageView imageView, int i) {
        Intrinsics.checkNotNullParameter(imageView, "");
        if (imageView.getWidth() > 0) {
            return imageView.getWidth();
        }
        android.content.Context context = imageView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        return (int) C55298xhM.AEQbTJ(i, context);
    }

    public final void EZpvd(@NotNull android.app.Activity activity, long j, long j2, @NotNull final Function0<Unit> function0, @NotNull final Function0<Unit> function02) {
        DappTabData dappTabDataOLrzqt;
        java.lang.Long l;
        java.util.ArrayList<java.lang.Long> chainIdList;
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(function0, "");
        Intrinsics.checkNotNullParameter(function02, "");
        C15112dyF c15112dyF = C15112dyF.AEQbTJ;
        if (c15112dyF.OLrzqt() != null) {
            DappTabData dappTabDataOLrzqt2 = c15112dyF.OLrzqt();
            if ((dappTabDataOLrzqt2 != null ? dappTabDataOLrzqt2.getChainIdList() : null) != null && ((dappTabDataOLrzqt = c15112dyF.OLrzqt()) == null || (chainIdList = dappTabDataOLrzqt.getChainIdList()) == null || !chainIdList.isEmpty())) {
                DappTabData dappTabDataOLrzqt3 = c15112dyF.OLrzqt();
                Intrinsics.copydefault(dappTabDataOLrzqt3);
                java.util.ArrayList<java.lang.Long> chainIdList2 = dappTabDataOLrzqt3.getChainIdList();
                Intrinsics.copydefault(chainIdList2);
                java.util.Iterator<T> it = chainIdList2.iterator();
                boolean z = false;
                while (it.hasNext()) {
                    long jLongValue = ((java.lang.Number) it.next()).longValue();
                    if (j2 == 501) {
                        InterfaceC9731bbC chainMetaWithRealChainId$default = InterfaceC9737bbI.Application.getChainMetaWithRealChainId$default(((InterfaceC9852bdR) C43251rlk.copydefault(InterfaceC9852bdR.class)).copydefault(), jLongValue, false, 2, null);
                        if (chainMetaWithRealChainId$default != null && chainMetaWithRealChainId$default.fARcdN() && jLongValue != 501) {
                            z = true;
                        }
                    } else {
                        InterfaceC9731bbC chainMetaWithRealChainId$default2 = InterfaceC9737bbI.Application.getChainMetaWithRealChainId$default(((InterfaceC9852bdR) C43251rlk.copydefault(InterfaceC9852bdR.class)).copydefault(), jLongValue, false, 2, null);
                        if (chainMetaWithRealChainId$default2 != null && chainMetaWithRealChainId$default2.fIwbmz() && jLongValue != 637) {
                            z = true;
                        }
                    }
                }
                if (!z) {
                    function0.invoke();
                    return;
                }
                DappTabData dappTabDataOLrzqt4 = C15112dyF.AEQbTJ.OLrzqt();
                Intrinsics.copydefault(dappTabDataOLrzqt4);
                java.util.ArrayList<java.lang.Long> chainIdList3 = dappTabDataOLrzqt4.getChainIdList();
                Intrinsics.copydefault(chainIdList3);
                if (chainIdList3.size() == 1 && (l = chainIdList3.get(0)) != null && l.longValue() == j) {
                    function0.invoke();
                    return;
                }
                if (activity.isFinishing() || activity.isDestroyed()) {
                    return;
                }
                final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaYEZpvd = EZpvd(activity);
                InterfaceC9731bbC interfaceC9731bbCEZpvd = ((InterfaceC9852bdR) C43251rlk.copydefault(InterfaceC9852bdR.class)).copydefault().EZpvd(j, true);
                java.lang.String strDjBIcL = interfaceC9731bbCEZpvd != null ? interfaceC9731bbCEZpvd.djBIcL() : null;
                viewOnClickListenerC54939xaYEZpvd.EZpvd(C33069mpW.KWHzl(activity, dLX.Dialog.dmfpNf, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("chainName", strDjBIcL != null ? strDjBIcL : ""))));
                viewOnClickListenerC54939xaYEZpvd.EZpvd(dLX.Dialog.KWHzl, new View.OnClickListener() { // from class: o.dvV
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // android.view.View.OnClickListener
                    public final void onClick(android.view.View view) {
                        C14923duc.KWHzl(viewOnClickListenerC54939xaYEZpvd, function0, view);
                    }
                });
                viewOnClickListenerC54939xaYEZpvd.OLrzqt(dLX.Dialog.AEQbTJ, new View.OnClickListener() { // from class: o.dvW
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // android.view.View.OnClickListener
                    public final void onClick(android.view.View view) {
                        C14923duc.EZpvd(viewOnClickListenerC54939xaYEZpvd, function02, view);
                    }
                });
                viewOnClickListenerC54939xaYEZpvd.show();
                return;
            }
        }
        function0.invoke();
    }

    public static final void KWHzl(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, Function0 function0, android.view.View view) {
        viewOnClickListenerC54939xaY.dismiss();
        function0.invoke();
    }

    public static final void EZpvd(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, Function0 function0, android.view.View view) {
        viewOnClickListenerC54939xaY.dismiss();
        function0.invoke();
    }

    /* JADX DEBUG: Type inference failed for r0v11. Raw type applied. Possible types: o.yxt<R>, java.lang.Object, o.yxt<java.util.List<com.okinc.dapp.bean.DappSearchResultBean>> */
    /* JADX DEBUG: Type inference failed for r0v6. Raw type applied. Possible types: o.yxt<R>, java.lang.Object, o.yxt<java.util.List<com.okinc.dapp.bean.DappSearchResultBean>> */
    public final AbstractC58260yxt<java.util.List<DappSearchResultBean>> gHZMYf() {
        if (SPUtils.getBoolean("key_search_history_blacklist_cleanup_executed", false)) {
            AbstractC58260yxt<java.util.List<DappSearchResultBean>> abstractC58260yxtCopydefault = ((xWH) C43248rlh.KWHzl.AEQbTJ(xWH.class)).copydefault();
            final Function1 function1 = new Function1() { // from class: o.duh
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C14923duc.copydefault((java.util.List) obj);
                }
            };
            AbstractC58260yxt abstractC58260yxtOLrzqt = abstractC58260yxtCopydefault.OLrzqt(new InterfaceC58229yxO() { // from class: o.duf
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58229yxO
                public final java.lang.Object apply(java.lang.Object obj) {
                    return C14923duc.DcqEDu(function1, obj);
                }
            });
            Intrinsics.checkNotNullExpressionValue(abstractC58260yxtOLrzqt, "");
            return abstractC58260yxtOLrzqt;
        }
        AbstractC58260yxt<java.util.List<DappSearchResultBean>> abstractC58260yxtCopydefault2 = ((xWH) C43248rlh.KWHzl.AEQbTJ(xWH.class)).copydefault();
        final Function1 function12 = new Function1() { // from class: o.dud
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C14923duc.djBIcL((java.util.List) obj);
            }
        };
        AbstractC58260yxt abstractC58260yxtOLrzqt2 = abstractC58260yxtCopydefault2.OLrzqt(new InterfaceC58229yxO() { // from class: o.dul
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C14923duc.DGUQLI(function12, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtOLrzqt2, "");
        return abstractC58260yxtOLrzqt2;
    }

    public static final InterfaceC58261yxu DcqEDu(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58261yxu) function1.invoke(obj);
    }

    public static final InterfaceC58261yxu copydefault(java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        return EZpvd.AhwBna((java.util.List<DappSearchResultBean>) list);
    }

    public static final InterfaceC58261yxu DGUQLI(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58261yxu) function1.invoke(obj);
    }

    public static final InterfaceC58261yxu djBIcL(final java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        if (list.isEmpty()) {
            SPUtils.put("key_search_history_blacklist_cleanup_executed", java.lang.Boolean.TRUE);
            AbstractC58260yxt abstractC58260yxtCopydefault = AbstractC58260yxt.copydefault(list);
            Intrinsics.copydefault(abstractC58260yxtCopydefault);
            return abstractC58260yxtCopydefault;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            java.lang.String deepLink = ((DappSearchResultBean) it.next()).getDeepLink();
            java.lang.String str = deepLink.length() > 0 ? deepLink : null;
            if (str != null) {
                arrayList.add(str);
            }
        }
        if (arrayList.isEmpty()) {
            SPUtils.put("key_search_history_blacklist_cleanup_executed", java.lang.Boolean.TRUE);
            return EZpvd.AhwBna((java.util.List<DappSearchResultBean>) list);
        }
        AbstractC58260yxt abstractC58260yxtGEmmrt = C43423rox.unwrapResponseData$default(AEQbTJ.KWHzl(arrayList), (Function1) null, 1, (java.lang.Object) null).gEmmrt();
        final Function1 function1 = new Function1() { // from class: o.duB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C14923duc.KWHzl(list, (DappcheckSearchHistoryUrlIsBlackResult) obj);
            }
        };
        AbstractC58260yxt abstractC58260yxtOLrzqt = abstractC58260yxtGEmmrt.OLrzqt(new InterfaceC58229yxO() { // from class: o.duC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C14923duc.DWgRXt(function1, obj);
            }
        });
        final Function1 function12 = new Function1() { // from class: o.duG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C14923duc.EZpvd(list, (java.lang.Throwable) obj);
            }
        };
        AbstractC58260yxt abstractC58260yxtEZpvd = abstractC58260yxtOLrzqt.EZpvd(new InterfaceC58229yxO() { // from class: o.duE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C14923duc.UrRBLY(function12, obj);
            }
        });
        Intrinsics.copydefault(abstractC58260yxtEZpvd);
        return abstractC58260yxtEZpvd;
    }

    public static final InterfaceC58261yxu DWgRXt(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58261yxu) function1.invoke(obj);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r6v3, resolved type: o.duc */
    /* JADX WARN: Multi-variable type inference failed */
    public static final InterfaceC58261yxu KWHzl(java.util.List list, DappcheckSearchHistoryUrlIsBlackResult dappcheckSearchHistoryUrlIsBlackResult) {
        Intrinsics.checkNotNullParameter(dappcheckSearchHistoryUrlIsBlackResult, "");
        java.util.List<java.lang.String> blackUrlList = dappcheckSearchHistoryUrlIsBlackResult.getBlackUrlList();
        Intrinsics.copydefault(list);
        if (!blackUrlList.isEmpty()) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : list) {
                if (blackUrlList.contains(((DappSearchResultBean) obj).getDeepLink())) {
                    arrayList.add(obj);
                }
            }
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                AbstractC58260yxt<java.lang.Integer> abstractC58260yxtCopydefault = ((xWH) C43251rlk.copydefault(xWH.class)).copydefault((DappSearchResultBean) it.next());
                final Function1 function1 = new Function1() { // from class: o.dua
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return C14923duc.AhwBna((java.lang.Integer) obj2);
                    }
                };
                InterfaceC58227yxM<? super java.lang.Integer> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.dug
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.InterfaceC58227yxM
                    public final void accept(java.lang.Object obj2) {
                        C14923duc.KDccX(function1, obj2);
                    }
                };
                final Function1 function12 = new Function1() { // from class: o.dvt
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return C14923duc.UeEOUB((java.lang.Throwable) obj2);
                    }
                };
                abstractC58260yxtCopydefault.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.dvB
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.InterfaceC58227yxM
                    public final void accept(java.lang.Object obj2) {
                        C14923duc.fHqPtx(function12, obj2);
                    }
                });
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            for (java.lang.Object obj2 : list) {
                if (!blackUrlList.contains(((DappSearchResultBean) obj2).getDeepLink())) {
                    arrayList2.add(obj2);
                }
            }
            list = arrayList2;
        }
        SPUtils.put("key_search_history_blacklist_cleanup_executed", java.lang.Boolean.TRUE);
        return EZpvd.AhwBna((java.util.List<DappSearchResultBean>) list);
    }

    public static final Unit AhwBna(java.lang.Integer num) {
        return Unit.INSTANCE;
    }

    public static final void KDccX(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit UeEOUB(java.lang.Throwable th) {
        return Unit.INSTANCE;
    }

    public static final void fHqPtx(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final InterfaceC58261yxu UrRBLY(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58261yxu) function1.invoke(obj);
    }

    public static final InterfaceC58261yxu EZpvd(java.util.List list, java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        SPUtils.put("key_search_history_blacklist_cleanup_executed", java.lang.Boolean.TRUE);
        C14923duc c14923duc = EZpvd;
        Intrinsics.copydefault(list);
        return c14923duc.AhwBna((java.util.List<DappSearchResultBean>) list);
    }

    /* JADX DEBUG: Type inference failed for r0v6. Raw type applied. Possible types: o.yxt<R>, java.lang.Object, o.yxt<java.util.List<com.okinc.dapp.bean.DappSearchResultBean>> */
    public final AbstractC58260yxt<java.util.List<DappSearchResultBean>> zuBGHE() {
        if (SPUtils.getBoolean("key_recent_browse_initialized", false)) {
            return ((xWH) C43248rlh.KWHzl.AEQbTJ(xWH.class)).AEQbTJ();
        }
        AbstractC58260yxt<java.util.List<DappSearchResultBean>> abstractC58260yxtCopydefault = ((xWH) C43248rlh.KWHzl.AEQbTJ(xWH.class)).copydefault();
        final Function1 function1 = new Function1() { // from class: o.dwO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C14923duc.OLrzqt((java.util.List) obj);
            }
        };
        AbstractC58260yxt abstractC58260yxtOLrzqt = abstractC58260yxtCopydefault.OLrzqt(new InterfaceC58229yxO() { // from class: o.dwQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C14923duc.DCUTEIddSDPG(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtOLrzqt, "");
        return abstractC58260yxtOLrzqt;
    }

    public static final InterfaceC58261yxu DCUTEIddSDPG(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58261yxu) function1.invoke(obj);
    }

    public static final InterfaceC58261yxu OLrzqt(final java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        if (list.isEmpty()) {
            SPUtils.put("key_recent_browse_initialized", java.lang.Boolean.TRUE);
            return ((xWH) C43248rlh.KWHzl.AEQbTJ(xWH.class)).AEQbTJ();
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            java.lang.String deepLink = ((DappSearchResultBean) it.next()).getDeepLink();
            java.lang.String str = deepLink.length() > 0 ? deepLink : null;
            if (str != null) {
                arrayList.add(str);
            }
        }
        if (arrayList.isEmpty()) {
            SPUtils.put("key_recent_browse_initialized", java.lang.Boolean.TRUE);
            return ((xWH) C43248rlh.KWHzl.AEQbTJ(xWH.class)).AEQbTJ();
        }
        AbstractC58260yxt abstractC58260yxtGEmmrt = C43423rox.unwrapResponseData$default(AEQbTJ.copydefault(arrayList), (Function1) null, 1, (java.lang.Object) null).gEmmrt();
        final Function1 function1 = new Function1() { // from class: o.dvM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C14923duc.copydefault(list, (java.util.Map) obj);
            }
        };
        AbstractC58260yxt abstractC58260yxtOLrzqt = abstractC58260yxtGEmmrt.OLrzqt(new InterfaceC58229yxO() { // from class: o.dvX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C14923duc.WS(function1, obj);
            }
        });
        final Function1 function12 = new Function1() { // from class: o.dwm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C14923duc.aKErDB((java.lang.Throwable) obj);
            }
        };
        AbstractC58260yxt abstractC58260yxtEZpvd = abstractC58260yxtOLrzqt.EZpvd(new InterfaceC58229yxO() { // from class: o.dwu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C14923duc.call(function12, obj);
            }
        });
        Intrinsics.copydefault(abstractC58260yxtEZpvd);
        return abstractC58260yxtEZpvd;
    }

    public static final InterfaceC58261yxu WS(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58261yxu) function1.invoke(obj);
    }

    public static final InterfaceC58261yxu copydefault(java.util.List list, java.util.Map map) {
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.copydefault(list);
        java.util.ArrayList<DappSearchResultBean> arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : list) {
            if (map.keySet().contains(((DappSearchResultBean) obj).getDeepLink())) {
                arrayList.add(obj);
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (DappSearchResultBean dappSearchResultBean : arrayList) {
            OKCheckLeveldappInfo oKCheckLeveldappInfo = (OKCheckLeveldappInfo) map.get(dappSearchResultBean.getDeepLink());
            if (oKCheckLeveldappInfo == null || oKCheckLeveldappInfo.getId() == 0) {
                dappSearchResultBean = null;
            } else {
                EZpvd.AEQbTJ(dappSearchResultBean, oKCheckLeveldappInfo);
            }
            if (dappSearchResultBean != null) {
                arrayList2.add(dappSearchResultBean);
            }
        }
        java.util.HashSet hashSet = new java.util.HashSet();
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        for (java.lang.Object obj2 : arrayList2) {
            if (hashSet.add(((DappSearchResultBean) obj2).getId())) {
                arrayList3.add(obj2);
            }
        }
        java.util.List listAhwBna = CollectionsKt___CollectionsKt.AhwBna((java.lang.Iterable) arrayList3, 50);
        java.util.Iterator it = listAhwBna.iterator();
        while (it.hasNext()) {
            AbstractC58260yxt<java.lang.Long> abstractC58260yxtOLrzqt = ((xWH) C43251rlk.copydefault(xWH.class)).OLrzqt((DappSearchResultBean) it.next());
            final Function1 function1 = new Function1() { // from class: o.dwp
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj3) {
                    return C14923duc.fIwbmz((java.lang.Long) obj3);
                }
            };
            InterfaceC58227yxM<? super java.lang.Long> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.dwq
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj3) {
                    C14923duc.run(function1, obj3);
                }
            };
            final Function1 function12 = new Function1() { // from class: o.dwo
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj3) {
                    return C14923duc.dNCPSb((java.lang.Throwable) obj3);
                }
            };
            abstractC58260yxtOLrzqt.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.dwx
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj3) {
                    C14923duc.DGOPHZ(function12, obj3);
                }
            });
        }
        SPUtils.put("key_recent_browse_initialized", java.lang.Boolean.TRUE);
        return AbstractC58260yxt.copydefault(listAhwBna);
    }

    public static final void DGOPHZ(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit dNCPSb(java.lang.Throwable th) {
        return Unit.INSTANCE;
    }

    public static final Unit fIwbmz(java.lang.Long l) {
        return Unit.INSTANCE;
    }

    public static final void run(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final InterfaceC58261yxu call(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58261yxu) function1.invoke(obj);
    }

    public static final InterfaceC58261yxu aKErDB(java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        SPUtils.put("key_recent_browse_initialized", java.lang.Boolean.TRUE);
        return ((xWH) C43248rlh.KWHzl.AEQbTJ(xWH.class)).AEQbTJ();
    }

    public final AbstractC58260yxt<java.util.List<DappSearchResultBean>> AhwBna(final java.util.List<DappSearchResultBean> list) {
        if (list.isEmpty()) {
            AbstractC58260yxt<java.util.List<DappSearchResultBean>> abstractC58260yxtCopydefault = AbstractC58260yxt.copydefault(list);
            Intrinsics.checkNotNullExpressionValue(abstractC58260yxtCopydefault, "");
            return abstractC58260yxtCopydefault;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : list) {
            if (((DappSearchResultBean) obj).getDeepLink().length() > 0) {
                arrayList.add(obj);
            }
        }
        final java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(arrayList, 10));
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((DappSearchResultBean) it.next()).getDeepLink());
        }
        if (!arrayList2.isEmpty()) {
            AbstractC58260yxt<java.util.List<DappSearchResultBean>> abstractC58260yxtOLrzqt = AbstractC58260yxt.OLrzqt(new InterfaceC58259yxs() { // from class: o.dva
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58259yxs
                public final void subscribe(InterfaceC58257yxq interfaceC58257yxq) {
                    C14923duc.AEQbTJ(arrayList2, list, interfaceC58257yxq);
                }
            });
            Intrinsics.checkNotNullExpressionValue(abstractC58260yxtOLrzqt, "");
            return abstractC58260yxtOLrzqt;
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        for (java.lang.Object obj2 : list) {
            java.lang.String deepLink = ((DappSearchResultBean) obj2).getDeepLink();
            if (deepLink == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) deepLink)) {
                arrayList3.add(obj2);
            }
        }
        java.util.Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            AbstractC58260yxt<java.lang.Integer> abstractC58260yxtCopydefault2 = ((xWH) C43251rlk.copydefault(xWH.class)).copydefault((DappSearchResultBean) it2.next());
            final Function1 function1 = new Function1() { // from class: o.duR
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj3) {
                    return C14923duc.OLrzqt((java.lang.Integer) obj3);
                }
            };
            InterfaceC58227yxM<? super java.lang.Integer> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.duV
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj3) {
                    C14923duc.dUDNAs(function1, obj3);
                }
            };
            final Function1 function12 = new Function1() { // from class: o.duT
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj3) {
                    return C14923duc.RJOkX((java.lang.Throwable) obj3);
                }
            };
            abstractC58260yxtCopydefault2.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.duY
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj3) {
                    C14923duc.aUsmxb(function12, obj3);
                }
            });
        }
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        for (java.lang.Object obj3 : list) {
            if (!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) ((DappSearchResultBean) obj3).getDeepLink())) {
                arrayList4.add(obj3);
            }
        }
        AbstractC58260yxt<java.util.List<DappSearchResultBean>> abstractC58260yxtCopydefault3 = AbstractC58260yxt.copydefault(arrayList4);
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtCopydefault3, "");
        return abstractC58260yxtCopydefault3;
    }

    public static final Unit OLrzqt(java.lang.Integer num) {
        return Unit.INSTANCE;
    }

    public static final Unit RJOkX(java.lang.Throwable th) {
        return Unit.INSTANCE;
    }

    public static final void aUsmxb(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final void dUDNAs(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final void AEQbTJ(java.util.List list, final java.util.List list2, final InterfaceC58257yxq interfaceC58257yxq) {
        Intrinsics.checkNotNullParameter(interfaceC58257yxq, "");
        C15142dyj.EZpvd.KWHzl((java.util.List<java.lang.String>) list, new Function1() { // from class: o.duD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C14923duc.EZpvd(list2, interfaceC58257yxq, (java.util.List) obj);
            }
        });
    }

    public static final Unit QVAiDq(java.lang.Throwable th) {
        return Unit.INSTANCE;
    }

    public static final Unit djBIcL(java.lang.Integer num) {
        return Unit.INSTANCE;
    }

    public static final void htlTjW(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final void igXuih(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit QUSxYX(java.lang.Throwable th) {
        return Unit.INSTANCE;
    }

    public static final void fdOvFl(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final void fjfviF(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit gEmmrt(java.lang.Integer num) {
        return Unit.INSTANCE;
    }

    public final void AEQbTJ(@NotNull PlatformItem platformItem, OKCheckLeveldappInfo oKCheckLeveldappInfo) {
        Intrinsics.checkNotNullParameter(platformItem, "");
        if (oKCheckLeveldappInfo == null || oKCheckLeveldappInfo.getId() == 0) {
            return;
        }
        platformItem.setId(oKCheckLeveldappInfo.getId());
        platformItem.setLogo(oKCheckLeveldappInfo.getLogo());
        platformItem.setPlatform(oKCheckLeveldappInfo.getName());
        platformItem.setIntro(oKCheckLeveldappInfo.getShortDescribe());
        platformItem.setCategory(C33129mqd.gEmmrt(java.lang.Integer.valueOf(oKCheckLeveldappInfo.getCategory())));
    }

    public final void AEQbTJ(@NotNull DappSearchResultBean dappSearchResultBean, OKCheckLeveldappInfo oKCheckLeveldappInfo) {
        Intrinsics.checkNotNullParameter(dappSearchResultBean, "");
        if (oKCheckLeveldappInfo == null || oKCheckLeveldappInfo.getId() == 0) {
            return;
        }
        dappSearchResultBean.setId(C33129mqd.gEmmrt(java.lang.Long.valueOf(oKCheckLeveldappInfo.getId())));
        dappSearchResultBean.setLogo(oKCheckLeveldappInfo.getLogo());
        dappSearchResultBean.setName(oKCheckLeveldappInfo.getName());
        dappSearchResultBean.setShortDescribe(oKCheckLeveldappInfo.getShortDescribe());
        dappSearchResultBean.setCategory(oKCheckLeveldappInfo.getCategory());
    }

    public final void OLrzqt(@NotNull android.content.Context context, long j) {
        java.lang.String strDjBIcL;
        java.lang.String str = "";
        Intrinsics.checkNotNullParameter(context, "");
        if (java.lang.Boolean.parseBoolean(ABTestManager.AEQbTJ.AEQbTJ("mobile_web3_dapp_network_toast_enabled", AmplitudeName.WEB3))) {
            InterfaceC9731bbC interfaceC9731bbCEZpvd = ((InterfaceC9852bdR) C43251rlk.copydefault(InterfaceC9852bdR.class)).copydefault().EZpvd(j, true);
            if (interfaceC9731bbCEZpvd != null && (strDjBIcL = interfaceC9731bbCEZpvd.djBIcL()) != null) {
                str = strDjBIcL;
            }
            C55326xho.toastWithSuccessfulIcon$default(C33069mpW.KWHzl(context, dLX.Dialog.QkdxfA, C56424yEw.AYXKKw(C56390yDp.OLrzqt("chain_name", str))), 0, 1, (java.lang.Object) null);
        }
    }

    public static final Unit EZpvd(java.util.List list, InterfaceC58257yxq interfaceC58257yxq, java.util.List list2) {
        java.util.ArrayList arrayList;
        Intrinsics.checkNotNullParameter(list2, "");
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (java.lang.Object obj : list) {
            if (StringsKt__StringsKt.fARcdN((java.lang.CharSequence) ((DappSearchResultBean) obj).getDeepLink())) {
                arrayList2.add(obj);
            }
        }
        java.util.Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            AbstractC58260yxt<java.lang.Integer> abstractC58260yxtCopydefault = ((xWH) C43251rlk.copydefault(xWH.class)).copydefault((DappSearchResultBean) it.next());
            final Function1 function1 = new Function1() { // from class: o.dus
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return C14923duc.djBIcL((java.lang.Integer) obj2);
                }
            };
            InterfaceC58227yxM<? super java.lang.Integer> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.duv
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj2) {
                    C14923duc.htlTjW(function1, obj2);
                }
            };
            final Function1 function12 = new Function1() { // from class: o.duu
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return C14923duc.QVAiDq((java.lang.Throwable) obj2);
                }
            };
            abstractC58260yxtCopydefault.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.duw
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj2) {
                    C14923duc.igXuih(function12, obj2);
                }
            });
        }
        if (!list2.isEmpty()) {
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            for (java.lang.Object obj2 : list) {
                if (list2.contains(((DappSearchResultBean) obj2).getDeepLink())) {
                    arrayList3.add(obj2);
                }
            }
            java.util.Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                AbstractC58260yxt<java.lang.Integer> abstractC58260yxtCopydefault2 = ((xWH) C43251rlk.copydefault(xWH.class)).copydefault((DappSearchResultBean) it2.next());
                final Function1 function13 = new Function1() { // from class: o.dut
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj3) {
                        return C14923duc.gEmmrt((java.lang.Integer) obj3);
                    }
                };
                InterfaceC58227yxM<? super java.lang.Integer> interfaceC58227yxM2 = new InterfaceC58227yxM() { // from class: o.duy
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.InterfaceC58227yxM
                    public final void accept(java.lang.Object obj3) {
                        C14923duc.fjfviF(function13, obj3);
                    }
                };
                final Function1 function14 = new Function1() { // from class: o.duA
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj3) {
                        return C14923duc.QUSxYX((java.lang.Throwable) obj3);
                    }
                };
                abstractC58260yxtCopydefault2.AEQbTJ(interfaceC58227yxM2, new InterfaceC58227yxM() { // from class: o.dux
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.InterfaceC58227yxM
                    public final void accept(java.lang.Object obj3) {
                        C14923duc.fdOvFl(function14, obj3);
                    }
                });
            }
        }
        if (!list2.isEmpty()) {
            arrayList = new java.util.ArrayList();
            for (java.lang.Object obj3 : list) {
                DappSearchResultBean dappSearchResultBean = (DappSearchResultBean) obj3;
                if ((!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) dappSearchResultBean.getDeepLink())) && !list2.contains(dappSearchResultBean.getDeepLink())) {
                    arrayList.add(obj3);
                }
            }
        } else {
            arrayList = new java.util.ArrayList();
            for (java.lang.Object obj4 : list) {
                if (!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) ((DappSearchResultBean) obj4).getDeepLink())) {
                    arrayList.add(obj4);
                }
            }
        }
        if (!interfaceC58257yxq.isDisposed()) {
            interfaceC58257yxq.onSuccess(arrayList);
        }
        return Unit.INSTANCE;
    }
}
