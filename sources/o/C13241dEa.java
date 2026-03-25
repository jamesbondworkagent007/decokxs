package o;

import android.view.View;
import android.webkit.GeolocationPermissions;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.ViewGroupKt;
import androidx.fragment.app.FragmentActivity;
import com.amplifyframework.core.model.ModelIdentifier;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.GlideException;
import com.bytedance.applog.util.WebViewJsUtil;
import com.google.gson.Gson;
import com.just.agentweb.DefaultWebClient;
import com.okinc.business.defi.api.bean.PlatformItem;
import com.okinc.business.defi.dapp.net.OKCheckLeveldappInfo;
import com.okinc.business.defi.dapp.webview.DappTabData;
import com.okinc.business.defi.dapp.webview.DappWebView$1;
import com.okinc.business.defi.dapp.webview.DappWebView$2;
import com.okinc.business.defi.dapp.webview.DappWebView$3;
import com.okinc.business.defi.dapp.webview.DappWebView$4;
import com.okinc.business.defi.dapp.webview.DappWebView$5;
import com.okinc.business.defi.dapp.webview.DappWebView$loadAptos$1$1;
import com.okinc.business.defi.dapp.webview.DappWebView$loadBtc$1$1;
import com.okinc.business.defi.dapp.webview.DappWebView$loadCosmos$1$1;
import com.okinc.business.defi.dapp.webview.DappWebView$loadEvm$1$1;
import com.okinc.business.defi.dapp.webview.DappWebView$loadJsInner$10;
import com.okinc.business.defi.dapp.webview.DappWebView$loadJsInner$2;
import com.okinc.business.defi.dapp.webview.DappWebView$loadJsInner$3;
import com.okinc.business.defi.dapp.webview.DappWebView$loadJsInner$4;
import com.okinc.business.defi.dapp.webview.DappWebView$loadJsInner$5;
import com.okinc.business.defi.dapp.webview.DappWebView$loadJsInner$6;
import com.okinc.business.defi.dapp.webview.DappWebView$loadJsInner$7;
import com.okinc.business.defi.dapp.webview.DappWebView$loadJsInner$8;
import com.okinc.business.defi.dapp.webview.DappWebView$loadJsInner$9;
import com.okinc.business.defi.dapp.webview.DappWebView$loadSolana$1$1;
import com.okinc.business.defi.dapp.webview.DappWebView$loadStarknet$1$1;
import com.okinc.business.defi.dapp.webview.DappWebView$loadSui$1$1;
import com.okinc.business.defi.dapp.webview.DappWebView$loadTon$1$1;
import com.okinc.business.defi.dapp.webview.DappWebView$loadTron$1$1;
import com.okinc.business.defi.wallet.mine.search.data.model.WalletSearchRequest;
import com.okinc.components.report.ReportManager;
import com.okinc.components.report.db.EventData;
import com.okinc.core.util.SPUtils;
import com.okinc.dapp.bean.DappSearchResultBean;
import com.okinc.network.okg.cor.SubdomainStrategy;
import com.okinc.wallet.api.bean.AddressType;
import com.reown.android.pulse.model.ConnectionMethod;
import java.lang.ref.WeakReference;
import java.net.URLDecoder;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.Charsets;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.C13241dEa;
import o.C33625mzw;
import o.InterfaceC9738bbJ;
import o.InterfaceC9854bdT;
import o.dLX;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: renamed from: o.dEa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C13241dEa extends android.webkit.WebView {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int copydefault = 8;
    public C13181dBv AEQbTJ;
    public dGQ AYXKKw;
    public InterfaceC9738bbJ AhwBna;
    public final C57350ygk AkhnZx;
    public dEU AuCTel;
    public java.lang.String AuCTelauCTel;
    public java.lang.String AubY;
    public Function1<? super java.lang.Integer, Unit> AwvSrB;
    public Function1<? super android.graphics.Bitmap, Unit> AxsJAY;
    public java.util.HashMap<java.lang.Long, java.lang.String> DTwDnp;
    public boolean DbNXlk;
    public java.lang.String EZpvd;
    public final java.util.HashSet<java.lang.String> KWHzl;
    public dGQ OLrzqt;
    public java.lang.Long ORxRYg;
    public Function1<? super java.lang.String, Unit> OcIXYQ;
    public final java.util.HashSet<java.lang.String> QKVWgx;
    public int QOLQEE;
    public C13273dFf QUSxYX;
    public Function1<? super java.lang.Boolean, Unit> QVAiDq;
    public dGQ QbewEr;
    public final java.util.HashSet<java.lang.String> QfsBiF;
    public boolean RJOkX;
    public C13284dFq RcXXUw;
    public java.lang.String UeEOUB;
    public java.lang.String aKErDB;
    public dFE dNCPSb;
    public WeakReference<FragmentActivity> djBIcL;
    public dFP djSkpj;
    public WeakReference<dES> dvKsVJ;
    public java.lang.String dxcTrN;
    public boolean ejfBZ;
    public java.lang.String fARcdN;
    public dIQ fFgQHt;
    public dBP fIwbmz;
    public java.lang.String fJNWhG;
    public java.lang.String fetchVPNInfo;
    public dGQ finit;
    public int gEmmrt;
    public Function2<? super android.webkit.ValueCallback<android.net.Uri[]>, ? super android.content.Intent, Unit> gHZMYf;
    public dBN getFieldNames;
    public java.lang.String getNewProxyInstance;
    public long hDKMBd;
    public long isConnected;
    public android.graphics.Bitmap iwGUEr;
    public Function0<Unit> sSMYrx;
    public java.lang.String uzCIH;
    public java.lang.String valueOf;
    public java.lang.String values;
    public Function2<? super java.lang.String, ? super java.lang.Long, Unit> wlaJM;
    public java.lang.String zLjUOn;
    public dEZ zsXlph;
    public Function1<? super java.lang.String, Unit> zuBGHE;

    public static final void AEQbTJ(java.lang.String str) {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.HashSet<java.lang.String> AYXKKw() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final dGQ AhwBna() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int AkhnZx() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AuCTel() {
        return this.DbNXlk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: kotlin.jvm.functions.Function2<? super java.lang.String, ? super java.lang.Long, kotlin.Unit>, kotlin.jvm.functions.Function2<java.lang.String, java.lang.Long, kotlin.Unit> */
    public final Function2<java.lang.String, java.lang.Long, Unit> AuCTelauCTel() {
        return this.wlaJM;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final dEZ AubY() {
        return this.zsXlph;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Function0<Unit> AwvSrB() {
        return this.sSMYrx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit>, kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> */
    public final Function1<java.lang.String, Unit> AxsJAY() {
        return this.zuBGHE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit>, kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> */
    public final Function1<java.lang.String, Unit> DTwDnp() {
        return this.OcIXYQ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C57350ygk DbNXlk() {
        return this.AkhnZx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean ORxRYg() {
        return this.RJOkX;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.HashSet<java.lang.String> OcIXYQ() {
        return this.QKVWgx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Long QKVWgx() {
        return this.ORxRYg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.HashMap<java.lang.Long, java.lang.String> QOLQEE() {
        return this.DTwDnp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C13273dFf QUSxYX() {
        return this.QUSxYX;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final dGQ QVAiDq() {
        return this.QbewEr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final dFE QbewEr() {
        return this.dNCPSb;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C13284dFq QfsBiF() {
        return this.RcXXUw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit>, kotlin.jvm.functions.Function1<java.lang.Boolean, kotlin.Unit> */
    public final Function1<java.lang.Boolean, Unit> RJOkX() {
        return this.QVAiDq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final dGQ RcXXUw() {
        return this.finit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final dIQ UeEOUB() {
        return this.fFgQHt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final WeakReference<dES> aKErDB() {
        return this.dvKsVJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String dNCPSb() {
        return this.dxcTrN;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C13181dBv djBIcL() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final dFP djSkpj() {
        return this.djSkpj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long ejfBZ() {
        return this.isConnected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String fARcdN() {
        return this.fJNWhG;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final dEU fIwbmz() {
        return this.AuCTel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final dBP fJNWhG() {
        return this.fIwbmz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean fZBcTu() {
        return this.ejfBZ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final WeakReference<FragmentActivity> fetchVPNInfo() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final dGQ gEmmrt() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit>, kotlin.jvm.functions.Function1<java.lang.Integer, kotlin.Unit> */
    public final Function1<java.lang.Integer, Unit> gHZMYf() {
        return this.AwvSrB;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String getFieldNames() {
        return this.getNewProxyInstance;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String getNewProxyInstance() {
        return this.uzCIH;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final android.graphics.Bitmap hDKMBd() {
        return this.iwGUEr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String isConnected() {
        return this.values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String iwGUEr() {
        return this.fARcdN;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: kotlin.jvm.functions.Function1<? super android.graphics.Bitmap, kotlin.Unit>, kotlin.jvm.functions.Function1<android.graphics.Bitmap, kotlin.Unit> */
    public final Function1<android.graphics.Bitmap, Unit> sSMYrx() {
        return this.AxsJAY;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAddress(java.lang.String str) {
        this.EZpvd = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAptosWebInterface(dGQ dgq) {
        this.OLrzqt = dgq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBtcWebInterface(C13181dBv c13181dBv) {
        this.AEQbTJ = c13181dBv;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCosmosWebInterface(dGQ dgq) {
        this.AYXKKw = dgq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCurrentActivity(WeakReference<FragmentActivity> weakReference) {
        this.djBIcL = weakReference;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCurrentWallet(InterfaceC9738bbJ interfaceC9738bbJ) {
        this.AhwBna = interfaceC9738bbJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDappType(int i) {
        this.gEmmrt = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDefaultUA(java.lang.String str) {
        this.fetchVPNInfo = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDestroyed(boolean z) {
        this.ejfBZ = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setEvmAddress(java.lang.String str) {
        this.values = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setEvmChainId(long j) {
        this.isConnected = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setGyroPermissionGranted(boolean z) {
        this.DbNXlk = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setJsInjectorClient(@NotNull dEU deu) {
        Intrinsics.checkNotNullParameter(deu, "");
        this.AuCTel = deu;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setJsInterface(dBP dbp) {
        this.fIwbmz = dbp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setJsTriggerUrl(java.lang.String str) {
        this.fJNWhG = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLastContentUrl(java.lang.String str) {
        this.fARcdN = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLastRedirectUrl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.uzCIH = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMAction(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.getNewProxyInstance = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMBridgeWebViewManager(@NotNull dBN dbn) {
        Intrinsics.checkNotNullParameter(dbn, "");
        this.getFieldNames = dbn;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMChainId(long j) {
        this.hDKMBd = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMIcon(android.graphics.Bitmap bitmap) {
        this.iwGUEr = bitmap;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMRpcUrl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.AubY = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMSiteName(java.lang.String str) {
        this.zLjUOn = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMTitle(java.lang.String str) {
        this.AuCTelauCTel = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setNostrWebInterface(dEZ dez) {
        this.zsXlph = dez;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOnConnectedWalletByJumpUrl(Function2<? super java.lang.String, ? super java.lang.Long, Unit> function2) {
        this.wlaJM = function2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOnProgressChangedListener(Function1<? super java.lang.Integer, Unit> function1) {
        this.AwvSrB = function1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOnReceiveIcon(Function1<? super android.graphics.Bitmap, Unit> function1) {
        this.AxsJAY = function1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOnReceiveTitle(Function1<? super java.lang.String, Unit> function1) {
        this.zuBGHE = function1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOnRequestAccountListener(Function0<Unit> function0) {
        this.sSMYrx = function0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOnShowFileChooserListener(Function2<? super android.webkit.ValueCallback<android.net.Uri[]>, ? super android.content.Intent, Unit> function2) {
        this.gHZMYf = function2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRpcMap(@NotNull java.util.HashMap<java.lang.Long, java.lang.String> map) {
        Intrinsics.checkNotNullParameter(map, "");
        this.DTwDnp = map;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSelectedChain(java.lang.Long l) {
        this.ORxRYg = l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setShouldOverrideUrl(Function1<? super java.lang.String, Unit> function1) {
        this.OcIXYQ = function1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setShouledcollectWalletDailogBlackShowMaxCount(int i) {
        this.QOLQEE = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setShowError(boolean z) {
        this.RJOkX = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setShowOrHideError(Function1<? super java.lang.Boolean, Unit> function1) {
        this.QVAiDq = function1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSolanawebappInterface(C13273dFf c13273dFf) {
        this.QUSxYX = c13273dFf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setStarknetWebInterface(dGQ dgq) {
        this.QbewEr = dgq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSubdomainStrategy(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.aKErDB = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSuiWebInterface(C13284dFq c13284dFq) {
        this.RcXXUw = c13284dFq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTonWebInterface(dFE dfe) {
        this.dNCPSb = dfe;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTronWebInterface(dFP dfp) {
        this.djSkpj = dfp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setWeb3JsIdSign(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.dxcTrN = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setWebViewContainer(@NotNull WeakReference<dES> weakReference) {
        Intrinsics.checkNotNullParameter(weakReference, "");
        this.dvKsVJ = weakReference;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setWebViewLoadListener(dIQ diq) {
        this.fFgQHt = diq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setWebappInterface(dGQ dgq) {
        this.finit = dgq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final dBN uzCIH() {
        return this.getFieldNames;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InterfaceC9738bbJ values() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String wlaJM() {
        return this.zLjUOn;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String zLjUOn() {
        return this.AuCTelauCTel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String zsXlph() {
        return this.AubY;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: kotlin.jvm.functions.Function2<? super android.webkit.ValueCallback<android.net.Uri[]>, ? super android.content.Intent, kotlin.Unit>, kotlin.jvm.functions.Function2<android.webkit.ValueCallback<android.net.Uri[]>, android.content.Intent, kotlin.Unit> */
    public final Function2<android.webkit.ValueCallback<android.net.Uri[]>, android.content.Intent, Unit> zuBGHE() {
        return this.gHZMYf;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13241dEa(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, boolean z, long j, @NotNull java.lang.String str, @NotNull java.lang.String str2, WeakReference<FragmentActivity> weakReference, @NotNull WeakReference<dES> weakReference2) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(weakReference2, "");
        this.DbNXlk = z;
        this.hDKMBd = j;
        this.AubY = str;
        this.aKErDB = str2;
        this.djBIcL = weakReference;
        this.dvKsVJ = weakReference2;
        C57350ygk c57350ygk = new C57350ygk();
        this.AkhnZx = c57350ygk;
        this.DTwDnp = new java.util.HashMap<>();
        this.isConnected = 1L;
        this.dxcTrN = "";
        this.getNewProxyInstance = "";
        this.QfsBiF = yEE.djBIcL("www.larvalabs.com", "cryptopunks.app");
        this.KWHzl = yEE.djBIcL("okex://main/wc?requestId=", "okx://main/wc?requestId=");
        this.UeEOUB = "dappwebview";
        this.QKVWgx = new java.util.HashSet<>();
        this.uzCIH = "";
        this.ejfBZ = false;
        if (Intrinsics.EZpvd((java.lang.Object) this.aKErDB, (java.lang.Object) SubdomainStrategy.Auto.KWHzl.toString())) {
            this.aKErDB = "";
        }
        c57350ygk.djBIcL(this.aKErDB);
        EZpvd(this.hDKMBd);
        this.AuCTel = new dEU(context, this);
        AxsJAYsNCnLh();
        dBN dbn = new dBN(this);
        this.getFieldNames = dbn;
        this.fIwbmz = new dBP(dbn, "");
        addJavascriptInterface(new C57345ygf(c57350ygk), "interception");
        flVtFt();
        setBackgroundResource(dLX.StateListAnimator.EZpvd);
        setBackgroundColor(context.getColor(dLX.StateListAnimator.EZpvd));
        WeakReference<FragmentActivity> weakReference3 = this.djBIcL;
        this.finit = new dGQ(new WeakReference(weakReference3 != null ? weakReference3.get() : null), new C13398dJw(new WeakReference(this)), new C13381dJf(new WeakReference(this)), new DappWebView$1(this), 0, this.dvKsVJ);
        WeakReference<FragmentActivity> weakReference4 = this.djBIcL;
        this.OLrzqt = new dGQ(new WeakReference(weakReference4 != null ? weakReference4.get() : null), new C13378dJc(new WeakReference(this)), new C13381dJf(new WeakReference(this)), new DappWebView$2(this), 3, this.dvKsVJ);
        WeakReference<FragmentActivity> weakReference5 = this.djBIcL;
        this.QUSxYX = new C13273dFf(new WeakReference(weakReference5 != null ? weakReference5.get() : null), new dJF(new WeakReference(this)), new dJD(new WeakReference(this)), this.dvKsVJ);
        WeakReference<FragmentActivity> weakReference6 = this.djBIcL;
        this.djSkpj = new dFP(new WeakReference(weakReference6 != null ? weakReference6.get() : null), new dJH(new WeakReference(this)), new dJK(new WeakReference(this)), new DappWebView$3(this), this.dvKsVJ);
        WeakReference<FragmentActivity> weakReference7 = this.djBIcL;
        this.RcXXUw = new C13284dFq(new WeakReference(weakReference7 != null ? weakReference7.get() : null), new dJC(new WeakReference(this)), this.dvKsVJ);
        WeakReference<FragmentActivity> weakReference8 = this.djBIcL;
        this.AYXKKw = new dGQ(new WeakReference(weakReference8 != null ? weakReference8.get() : null), new C13379dJd(new WeakReference(this)), new C13381dJf(new WeakReference(this)), new DappWebView$4(this), 5, this.dvKsVJ);
        WeakReference<FragmentActivity> weakReference9 = this.djBIcL;
        this.QbewEr = new dGQ(new WeakReference(weakReference9 != null ? weakReference9.get() : null), new dJE(new WeakReference(this)), new C13381dJf(new WeakReference(this)), new DappWebView$5(this), 6, this.dvKsVJ);
        WeakReference<FragmentActivity> weakReference10 = this.djBIcL;
        this.AEQbTJ = new C13181dBv(new WeakReference(weakReference10 != null ? weakReference10.get() : null), new C13382dJg(new WeakReference(this)), this.dvKsVJ);
        WeakReference<FragmentActivity> weakReference11 = this.djBIcL;
        this.zsXlph = new dEZ(new WeakReference(weakReference11 != null ? weakReference11.get() : null), new C13399dJx(new WeakReference(this)), this.dvKsVJ);
        WeakReference<FragmentActivity> weakReference12 = this.djBIcL;
        this.dNCPSb = new dFE(new WeakReference(weakReference12 != null ? weakReference12.get() : null), new dJG(new WeakReference(this)), this.dvKsVJ);
        C13273dFf c13273dFf = this.QUSxYX;
        Intrinsics.copydefault(c13273dFf);
        addJavascriptInterface(c13273dFf, "_solana_");
        dGQ dgq = this.finit;
        Intrinsics.copydefault(dgq);
        addJavascriptInterface(dgq, "okxInternalJSBridge");
        dFP dfp = this.djSkpj;
        Intrinsics.copydefault(dfp);
        addJavascriptInterface(dfp, "tron");
        dGQ dgq2 = this.OLrzqt;
        Intrinsics.copydefault(dgq2);
        addJavascriptInterface(dgq2, "_aptos_");
        C13284dFq c13284dFq = this.RcXXUw;
        Intrinsics.copydefault(c13284dFq);
        addJavascriptInterface(c13284dFq, "_okx_sui_");
        dGQ dgq3 = this.AYXKKw;
        Intrinsics.copydefault(dgq3);
        addJavascriptInterface(dgq3, "okxOsmosJSBridge");
        dGQ dgq4 = this.QbewEr;
        Intrinsics.copydefault(dgq4);
        addJavascriptInterface(dgq4, "okxStarkJSBridge");
        C13181dBv c13181dBv = this.AEQbTJ;
        Intrinsics.copydefault(c13181dBv);
        addJavascriptInterface(c13181dBv, "okxBtcJSBridge");
        dEZ dez = this.zsXlph;
        Intrinsics.copydefault(dez);
        addJavascriptInterface(dez, "okxNostrJSBridge");
        dFE dfe = this.dNCPSb;
        Intrinsics.copydefault(dfe);
        addJavascriptInterface(dfe, "okxTonJSBridge");
    }

    /* JADX INFO: renamed from: o.dEa$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.dEa.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    public final void setActivity(@NotNull AbstractActivityC33041mov abstractActivityC33041mov, @NotNull dES des) {
        Intrinsics.checkNotNullParameter(abstractActivityC33041mov, "");
        Intrinsics.checkNotNullParameter(des, "");
        this.djBIcL = new WeakReference<>(abstractActivityC33041mov);
        dGQ dgq = this.finit;
        if (dgq != null) {
            dgq.EZpvd(new WeakReference<>(abstractActivityC33041mov));
        }
        C13273dFf c13273dFf = this.QUSxYX;
        if (c13273dFf != null) {
            c13273dFf.copydefault(new WeakReference<>(abstractActivityC33041mov));
        }
        dFP dfp = this.djSkpj;
        if (dfp != null) {
            dfp.AEQbTJ(new WeakReference<>(abstractActivityC33041mov));
        }
        dGQ dgq2 = this.OLrzqt;
        if (dgq2 != null) {
            dgq2.EZpvd(new WeakReference<>(abstractActivityC33041mov));
        }
        C13284dFq c13284dFq = this.RcXXUw;
        if (c13284dFq != null) {
            c13284dFq.copydefault(new WeakReference<>(abstractActivityC33041mov));
        }
        dGQ dgq3 = this.AYXKKw;
        if (dgq3 != null) {
            dgq3.EZpvd(new WeakReference<>(abstractActivityC33041mov));
        }
        dGQ dgq4 = this.QbewEr;
        if (dgq4 != null) {
            dgq4.EZpvd(new WeakReference<>(abstractActivityC33041mov));
        }
        C13181dBv c13181dBv = this.AEQbTJ;
        if (c13181dBv != null) {
            c13181dBv.copydefault(new WeakReference<>(abstractActivityC33041mov));
        }
        dEZ dez = this.zsXlph;
        if (dez != null) {
            dez.copydefault(new WeakReference<>(abstractActivityC33041mov));
        }
        dFE dfe = this.dNCPSb;
        if (dfe != null) {
            dfe.copydefault(new WeakReference<>(abstractActivityC33041mov));
        }
        this.dvKsVJ = new WeakReference<>(des);
        dGQ dgq5 = this.finit;
        if (dgq5 != null) {
            dgq5.OLrzqt(new WeakReference<>(des));
        }
        C13273dFf c13273dFf2 = this.QUSxYX;
        if (c13273dFf2 != null) {
            c13273dFf2.EZpvd(new WeakReference<>(des));
        }
        dFP dfp2 = this.djSkpj;
        if (dfp2 != null) {
            dfp2.EZpvd(new WeakReference<>(des));
        }
        dGQ dgq6 = this.OLrzqt;
        if (dgq6 != null) {
            dgq6.OLrzqt(new WeakReference<>(des));
        }
        C13284dFq c13284dFq2 = this.RcXXUw;
        if (c13284dFq2 != null) {
            c13284dFq2.EZpvd(new WeakReference<>(des));
        }
        dGQ dgq7 = this.AYXKKw;
        if (dgq7 != null) {
            dgq7.OLrzqt(new WeakReference<>(des));
        }
        dGQ dgq8 = this.QbewEr;
        if (dgq8 != null) {
            dgq8.OLrzqt(new WeakReference<>(des));
        }
        C13181dBv c13181dBv2 = this.AEQbTJ;
        if (c13181dBv2 != null) {
            c13181dBv2.EZpvd(new WeakReference<>(des));
        }
        dEZ dez2 = this.zsXlph;
        if (dez2 != null) {
            dez2.EZpvd(new WeakReference<>(des));
        }
        dFE dfe2 = this.dNCPSb;
        if (dfe2 != null) {
            dfe2.EZpvd(new WeakReference<>(des));
        }
    }

    @Override // android.webkit.WebView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.ejfBZ = false;
        java.lang.Object obj = this.QUSxYX;
        Intrinsics.copydefault(obj);
        addJavascriptInterface(obj, "_solana_");
        java.lang.Object obj2 = this.finit;
        Intrinsics.copydefault(obj2);
        addJavascriptInterface(obj2, "okxInternalJSBridge");
        java.lang.Object obj3 = this.djSkpj;
        Intrinsics.copydefault(obj3);
        addJavascriptInterface(obj3, "tron");
        java.lang.Object obj4 = this.OLrzqt;
        Intrinsics.copydefault(obj4);
        addJavascriptInterface(obj4, "_aptos_");
        java.lang.Object obj5 = this.RcXXUw;
        Intrinsics.copydefault(obj5);
        addJavascriptInterface(obj5, "_okx_sui_");
        java.lang.Object obj6 = this.AYXKKw;
        Intrinsics.copydefault(obj6);
        addJavascriptInterface(obj6, "okxOsmosJSBridge");
        java.lang.Object obj7 = this.QbewEr;
        Intrinsics.copydefault(obj7);
        addJavascriptInterface(obj7, "okxStarkJSBridge");
        java.lang.Object obj8 = this.AEQbTJ;
        Intrinsics.copydefault(obj8);
        addJavascriptInterface(obj8, "okxBtcJSBridge");
        java.lang.Object obj9 = this.zsXlph;
        Intrinsics.copydefault(obj9);
        addJavascriptInterface(obj9, "okxNostrJSBridge");
        java.lang.Object obj10 = this.dNCPSb;
        Intrinsics.copydefault(obj10);
        addJavascriptInterface(obj10, "okxTonJSBridge");
        dBN dbn = new dBN(this);
        this.getFieldNames = dbn;
        dBP dbp = new dBP(dbn, "");
        this.fIwbmz = dbp;
        Intrinsics.copydefault(dbp);
        addJavascriptInterface(dbp, "native");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void DAIeex() {
        evaluateJavascript("window.okxwallet.getOpenNewTabConfigInfo()", new android.webkit.ValueCallback() { // from class: o.dEd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.webkit.ValueCallback
            public final void onReceiveValue(java.lang.Object obj) {
                C13241dEa.AkhnZx(this.AEQbTJ, (java.lang.String) obj);
            }
        });
    }

    public static final void AkhnZx(C13241dEa c13241dEa, java.lang.String str) {
        java.lang.Object objM7377constructorimpl;
        try {
            Result.Application application = Result.Companion;
            Intrinsics.copydefault((java.lang.Object) str);
            c13241dEa.getSettings().setSupportMultipleWindows(new JSONObject(StringsKt__StringsKt.AEQbTJ(str, '\"')).optInt("openTab", 1) == 1);
            objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (Result.m7380exceptionOrNullimpl(objM7377constructorimpl) != null) {
            c13241dEa.getSettings().setSupportMultipleWindows(true);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.dEa */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void selectWallet$default(C13241dEa c13241dEa, java.lang.Long l, Function2 function2, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            function2 = null;
        }
        c13241dEa.OLrzqt(l, (Function2<? super InterfaceC9738bbJ, ? super java.lang.Long, Unit>) function2);
    }

    public final void OLrzqt(java.lang.Long l, Function2<? super InterfaceC9738bbJ, ? super java.lang.Long, Unit> function2) {
        dES des = this.dvKsVJ.get();
        if (des != null) {
            des.AEQbTJ(l, function2);
        }
    }

    public final boolean accept() {
        try {
            if (!this.QfsBiF.contains(new java.net.URL(getUrl()).getHost())) {
                return true;
            }
            int i = this.QOLQEE;
            if (i != 0) {
                return false;
            }
            this.QOLQEE = i + 1;
            return true;
        } catch (java.lang.Exception unused) {
            return true;
        }
    }

    public final void QKudOq() {
        C14923duc c14923duc = C14923duc.EZpvd;
        evaluateJavascript("window.okexchain.translateHtml(" + c14923duc.uzCIH() + ", " + c14923duc.zLjUOn() + ")", null);
        dES des = this.dvKsVJ.get();
        if (des != null) {
            des.showLoadingAtOnce();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.dEa */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void getCurrentLanguage$default(C13241dEa c13241dEa, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = null;
        }
        c13241dEa.OLrzqt((Function1<? super java.lang.String, Unit>) function1);
    }

    public final void OLrzqt(final Function1<? super java.lang.String, Unit> function1) {
        evaluateJavascript("window.okexchain.getCurrentLanguage()", new android.webkit.ValueCallback() { // from class: o.dEc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.webkit.ValueCallback
            public final void onReceiveValue(java.lang.Object obj) {
                C13241dEa.AEQbTJ(this.KWHzl, function1, (java.lang.String) obj);
            }
        });
    }

    public static final void AEQbTJ(C13241dEa c13241dEa, final Function1 function1, final java.lang.String str) {
        c13241dEa.post(new java.lang.Runnable() { // from class: o.dEe
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C13241dEa.KWHzl(function1, str);
            }
        });
    }

    public static final void KWHzl(Function1 function1, java.lang.String str) {
        if (function1 != null) {
            Intrinsics.copydefault((java.lang.Object) str);
            function1.invoke(str);
        }
    }

    public final java.lang.Long valueOf() {
        C13181dBv c13181dBv = this.AEQbTJ;
        if (c13181dBv != null) {
            return java.lang.Long.valueOf(c13181dBv.AYXKKw());
        }
        return null;
    }

    public final void RlQdEF() {
        evaluateJavascript("window.okexchain.reverseTranslate()", null);
    }

    public final void setChainIdAndRpc(long j, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.AubY = str;
        this.hDKMBd = j;
        this.DTwDnp.put(java.lang.Long.valueOf(j), this.AubY);
        EZpvd(j);
    }

    public final void EZpvd(long j) {
        java.lang.Object next;
        if (j == 637 || j == 784 || j == 501 || j == 195 || j == 9004) {
            return;
        }
        java.util.Iterator<T> it = ((InterfaceC9852bdR) C43251rlk.copydefault(InterfaceC9852bdR.class)).copydefault().KWHzl(true).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (((InterfaceC9731bbC) next).fetchVPNInfo() == j) {
                    break;
                }
            }
        }
        if (next != null) {
            this.isConnected = j;
        }
    }

    public final void AxsJAYsNCnLh() {
        setWebViewClient(new Application());
        setWebChromeClient(new Activity());
        getSettings().setJavaScriptEnabled(true);
        getSettings().setAllowFileAccess(true);
        getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
        getSettings().setLoadsImagesAutomatically(true);
        getSettings().setDefaultTextEncodingName("utf-8");
        getSettings().setCacheMode(-1);
        getSettings().setDomStorageEnabled(true);
        getSettings().setLayoutAlgorithm(WebSettings.LayoutAlgorithm.NORMAL);
        getSettings().setLoadWithOverviewMode(true);
        getSettings().setUseWideViewPort(true);
        getSettings().setSupportZoom(true);
        getSettings().setBuiltInZoomControls(true);
        getSettings().setDisplayZoomControls(false);
        getSettings().setMinimumFontSize(1);
        getSettings().setAllowFileAccess(true);
        getSettings().setGeolocationEnabled(true);
        getSettings().setMixedContentMode(0);
        java.lang.String userAgentString = getSettings().getUserAgentString();
        this.fetchVPNInfo = userAgentString;
        getSettings().setUserAgentString(C43384roK.KWHzl.valueOf() + " " + userAgentString);
        setLayerType(2, null);
    }

    public final void copydefault() {
        this.ejfBZ = true;
        this.sSMYrx = null;
        this.AwvSrB = null;
        this.QVAiDq = null;
        this.OcIXYQ = null;
        this.AxsJAY = null;
        this.zuBGHE = null;
        this.fFgQHt = null;
        this.wlaJM = null;
        this.gHZMYf = null;
        removeJavascriptInterface("_solana_");
        removeJavascriptInterface("okxInternalJSBridge");
        removeJavascriptInterface("okxOsmosJSBridge");
        removeJavascriptInterface("tron");
        removeJavascriptInterface("_aptos_");
        removeJavascriptInterface("_okx_sui_");
        removeJavascriptInterface("native");
        removeJavascriptInterface("okxStarkJSBridge");
        removeJavascriptInterface("okxBtcJSBridge");
        removeJavascriptInterface("okxNostrJSBridge");
        removeJavascriptInterface("okxTonJSBridge");
        this.getFieldNames.KWHzl();
        setOnTouchListener(null);
    }

    public final void KWHzl() {
        copydefault();
        destroy();
        this.getFieldNames.KWHzl();
    }

    @Override // android.webkit.WebView
    public void evaluateJavascript(@NotNull java.lang.String str, android.webkit.ValueCallback<java.lang.String> valueCallback) {
        Intrinsics.checkNotNullParameter(str, "");
        if (this.ejfBZ) {
            return;
        }
        super.evaluateJavascript(str, valueCallback);
    }

    public final void OLrzqt() {
        evaluateJavascript("window.okxwallet.disconnect()", null);
    }

    public final void EZpvd() {
        evaluateJavascript("window.solana.disconnect()", null);
    }

    public final void gEmmrt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.values = str;
        this.EZpvd = str;
        InterfaceC9731bbC interfaceC9731bbCEZpvd = ((InterfaceC9852bdR) C43251rlk.copydefault(InterfaceC9852bdR.class)).copydefault().EZpvd(this.isConnected, true);
        java.lang.Long lValueOf = interfaceC9731bbCEZpvd != null ? java.lang.Long.valueOf(interfaceC9731bbCEZpvd.isConnected()) : null;
        long j = this.isConnected;
        if (j == 1666600000 || j == 2020) {
            lValueOf = java.lang.Long.valueOf(j);
        }
        pUU.copydefault(this.UeEOUB, "convert generalChainId:" + this.isConnected + " to chainId:" + lValueOf);
        if (lValueOf == null || lValueOf.longValue() <= 0) {
            return;
        }
        if (!(!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str))) {
            str = "";
        }
        evaluateJavascript("window.okxwallet.setConfig({chainId:" + lValueOf + ",address: \"" + str + "\",rpcUrl: \"" + this.AubY + "\"})", null);
        evaluateJavascript("window.okxwallet.notifyChainChanged()", null);
    }

    public final void KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.EZpvd = str;
        this.values = str;
        InterfaceC9731bbC interfaceC9731bbCEZpvd = ((InterfaceC9852bdR) C43251rlk.copydefault(InterfaceC9852bdR.class)).copydefault().EZpvd(this.isConnected, true);
        java.lang.Long lValueOf = interfaceC9731bbCEZpvd != null ? java.lang.Long.valueOf(interfaceC9731bbCEZpvd.isConnected()) : null;
        pUU.KWHzl(this.UeEOUB, "convert generalChainId:" + this.isConnected + " to chainId:" + lValueOf);
        if (!(!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str))) {
            str = "";
        }
        evaluateJavascript("window.okxwallet.setConfig({chainId:" + lValueOf + ",address: \"" + str + "\",rpcUrl: \"" + this.AubY + "\"})", null);
        evaluateJavascript("window.okxwallet.notifyAccountsChanged()", null);
    }

    public final void valueOf(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        evaluateJavascript(C59442zhC.fJNWhG("\n            window.starknet.notifyAccountChanged(JSON.stringify(" + new Gson().toJson(C56424yEw.gEmmrt(C56390yDp.OLrzqt(WalletSearchRequest.SEARCH_SOURCE_ADDRESS, str), C56390yDp.OLrzqt("network", C56424yEw.gEmmrt(C56390yDp.OLrzqt("chainId", "0x534e5f4d41494e"), C56390yDp.OLrzqt("rpcUrl", "https://www.okx.com/priapi/v1/wallet/rpc/send?chainId=9004"))))) + "));\n        "), null);
    }

    public final void copydefault(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        evaluateJavascript("window.aptos.setConfig({address: \"" + str + "\",publicKey:\"\",chainId: '1', network: 'Mainnet', isDebug: true})", null);
        evaluateJavascript("window.aptos.notifyAccountChanged()", null);
    }

    public final void AEQbTJ(java.lang.String str, @NotNull java.lang.String str2, java.lang.String str3) {
        Intrinsics.checkNotNullParameter(str2, "");
        if (str != null) {
            evaluateJavascript(str + ".setConfig({chain: \"" + dBW.Companion.AEQbTJ() + "\",address: \"" + str2 + "\",publicKey:\"" + str3 + "\",isDebug: true})", null);
        }
    }

    public final void AYXKKw(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.EZpvd = str;
        evaluateJavascript("window.dispatchEvent(new Event(\"keplr_keystorechange\"));", null);
    }

    public final void AhwBna(@NotNull java.lang.String str) {
        java.lang.Throwable th;
        java.lang.String strSubstring;
        Intrinsics.checkNotNullParameter(str, "");
        java.lang.Long lValueOf = valueOf();
        if (lValueOf != null) {
            long jLongValue = lValueOf.longValue();
            this.EZpvd = str;
            InterfaceC9738bbJ interfaceC9738bbJ = this.AhwBna;
            InterfaceC9780bbz interfaceC9780bbzAddressFromRealChainId$default = interfaceC9738bbJ != null ? InterfaceC9738bbJ.StateListAnimator.addressFromRealChainId$default(interfaceC9738bbJ, jLongValue, null, 2, null) : null;
            java.lang.Integer numValueOf = interfaceC9780bbzAddressFromRealChainId$default != null ? java.lang.Integer.valueOf(interfaceC9780bbzAddressFromRealChainId$default.getAddressType()) : null;
            InterfaceC9738bbJ interfaceC9738bbJ2 = this.AhwBna;
            java.lang.String strEZpvd = interfaceC9738bbJ2 != null ? interfaceC9738bbJ2.EZpvd(str) : null;
            try {
                Result.Application application = Result.Companion;
                int value = AddressType.P2TRType.getValue();
                if (numValueOf == null || numValueOf.intValue() != value) {
                    strSubstring = strEZpvd;
                } else if (strEZpvd != null) {
                    strSubstring = strEZpvd.substring(2);
                    Intrinsics.checkNotNullExpressionValue(strSubstring, "");
                } else {
                    strSubstring = null;
                }
            } catch (java.lang.Throwable th2) {
                th = th2;
                strSubstring = strEZpvd;
            }
            try {
                Result.m7377constructorimpl(Unit.INSTANCE);
            } catch (java.lang.Throwable th3) {
                th = th3;
                Result.Application application2 = Result.Companion;
                Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
            java.util.Map mapDjBIcL = C56424yEw.djBIcL(C56390yDp.OLrzqt(WalletSearchRequest.SEARCH_SOURCE_ADDRESS, str));
            if (C33129mqd.OLrzqt((java.lang.CharSequence) strEZpvd)) {
                if (strSubstring == null) {
                    strSubstring = "";
                }
                mapDjBIcL.put("publicKey", strSubstring);
                mapDjBIcL.put("compressedPublicKey", strEZpvd != null ? strEZpvd : "");
                mapDjBIcL.put("addressType", C33129mqd.gEmmrt(numValueOf));
                java.lang.String str2 = jLongValue == 70000061 ? "window.fractalBitcoin" : "window.bitcoin";
                evaluateJavascript(str2 + ".notifyAccountChanged(" + new Gson().toJson(mapDjBIcL) + ")", null);
            }
        }
    }

    public final void gkJEwt() {
        evaluateJavascript("window.okxTonWallet.accountsChanged()", null);
    }

    public final void flVtFt() {
        post(new java.lang.Runnable() { // from class: o.dEg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C13241dEa.fJNWhG(this.AEQbTJ);
            }
        });
    }

    public static final void fJNWhG(C13241dEa c13241dEa) {
        c13241dEa.gasjUx();
    }

    public final void gasjUx() {
        long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
        if (SPUtils.getBoolean("dapp_vconsole", false)) {
            long jCurrentTimeMillis2 = java.lang.System.currentTimeMillis();
            dDN ddn = dDN.copydefault;
            android.content.Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            EZpvd(jCurrentTimeMillis2, ddn.copydefault(context), new android.webkit.ValueCallback() { // from class: o.dEr
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.webkit.ValueCallback
                public final void onReceiveValue(java.lang.Object obj) {
                    C13241dEa.AEQbTJ((java.lang.String) obj);
                }
            });
        }
        OLrzqt(OLrzqt(OLrzqt(OLrzqt(OLrzqt(OLrzqt(OLrzqt(OLrzqt(OLrzqt(jCurrentTimeMillis, new DappWebView$loadJsInner$2(this)), new DappWebView$loadJsInner$3(this)), new DappWebView$loadJsInner$4(this)), new DappWebView$loadJsInner$5(this)), new DappWebView$loadJsInner$6(this)), new DappWebView$loadJsInner$7(this)), new DappWebView$loadJsInner$8(this)), new DappWebView$loadJsInner$9(this)), new DappWebView$loadJsInner$10(this));
    }

    public final long OLrzqt(long j, final Function0<Unit> function0) {
        if (java.lang.System.currentTimeMillis() - j > 2000) {
            pUU.copydefault(this.UeEOUB, "executeWithDelayStrategy post delay");
            post(new java.lang.Runnable() { // from class: o.dEf
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    C13241dEa.KWHzl(function0);
                }
            });
            return java.lang.System.currentTimeMillis();
        }
        function0.invoke();
        return j;
    }

    public static final void KWHzl(Function0 function0) {
        function0.invoke();
    }

    public final long EZpvd(long j, final java.lang.String str, final android.webkit.ValueCallback<java.lang.String> valueCallback) {
        pUU.KWHzl(this.UeEOUB, "evaluateJSWithDelayStrategy now:" + (java.lang.System.currentTimeMillis() - j) + "," + j);
        if (java.lang.System.currentTimeMillis() - j > 1000) {
            pUU.copydefault(this.UeEOUB, "evaluateJSWithDelayStrategy post delay");
            post(new java.lang.Runnable() { // from class: o.dEl
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    C13241dEa.KWHzl(this.OLrzqt, str, valueCallback);
                }
            });
            return java.lang.System.currentTimeMillis();
        }
        evaluateJavascript(str, valueCallback);
        return j;
    }

    public static final void KWHzl(C13241dEa c13241dEa, java.lang.String str, android.webkit.ValueCallback valueCallback) {
        c13241dEa.evaluateJavascript(str, valueCallback);
    }

    public final void dxcTrN() {
        evaluateJavascript("window.okxwallet", new android.webkit.ValueCallback() { // from class: o.dEi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.webkit.ValueCallback
            public final void onReceiveValue(java.lang.Object obj) {
                C13241dEa.fJNWhG(this.EZpvd, (java.lang.String) obj);
            }
        });
    }

    public static final void fJNWhG(C13241dEa c13241dEa, java.lang.String str) {
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) AbstractJsonLexerKt.NULL)) {
            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getIO()), null, null, new DappWebView$loadEvm$1$1(c13241dEa, null), 3, null);
        } else {
            c13241dEa.DAIeex();
            c13241dEa.evaluateJavascript(dDN.copydefault.KWHzl(c13241dEa.isConnected, c13241dEa.AubY, c13241dEa.values), null);
        }
    }

    public final void giSNqX() {
        evaluateJavascript("window.solana", new android.webkit.ValueCallback() { // from class: o.dEk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.webkit.ValueCallback
            public final void onReceiveValue(java.lang.Object obj) {
                C13241dEa.fIwbmz(this.EZpvd, (java.lang.String) obj);
            }
        });
    }

    public static final void fIwbmz(C13241dEa c13241dEa, java.lang.String str) {
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) AbstractJsonLexerKt.NULL)) {
            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getIO()), null, null, new DappWebView$loadSolana$1$1(c13241dEa, null), 3, null);
        }
    }

    public final void hUfVAv() {
        evaluateJavascript("window.tronWeb", new android.webkit.ValueCallback() { // from class: o.dDY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.webkit.ValueCallback
            public final void onReceiveValue(java.lang.Object obj) {
                C13241dEa.uzCIH(this.OLrzqt, (java.lang.String) obj);
            }
        });
    }

    public static final void uzCIH(C13241dEa c13241dEa, java.lang.String str) {
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) AbstractJsonLexerKt.NULL)) {
            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getIO()), null, null, new DappWebView$loadTron$1$1(c13241dEa, null), 3, null);
        }
    }

    public final void dvKsVJ() {
        evaluateJavascript("window.aptos", new android.webkit.ValueCallback() { // from class: o.dDZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.webkit.ValueCallback
            public final void onReceiveValue(java.lang.Object obj) {
                C13241dEa.values(this.copydefault, (java.lang.String) obj);
            }
        });
    }

    public static final void values(C13241dEa c13241dEa, java.lang.String str) {
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) AbstractJsonLexerKt.NULL)) {
            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getIO()), null, null, new DappWebView$loadAptos$1$1(c13241dEa, null), 3, null);
        }
    }

    public final void fFgQHt() {
        evaluateJavascript("window.bitcoin", new android.webkit.ValueCallback() { // from class: o.dEo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.webkit.ValueCallback
            public final void onReceiveValue(java.lang.Object obj) {
                C13241dEa.DbNXlk(this.AEQbTJ, (java.lang.String) obj);
            }
        });
    }

    public static final void DbNXlk(C13241dEa c13241dEa, java.lang.String str) {
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) AbstractJsonLexerKt.NULL)) {
            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getIO()), null, null, new DappWebView$loadBtc$1$1(c13241dEa, null), 3, null);
        }
    }

    public final void fvQaOB() {
        evaluateJavascript("window.sui", new android.webkit.ValueCallback() { // from class: o.dEb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.webkit.ValueCallback
            public final void onReceiveValue(java.lang.Object obj) {
                C13241dEa.AuCTel(this.copydefault, (java.lang.String) obj);
            }
        });
    }

    public static final void AuCTel(C13241dEa c13241dEa, java.lang.String str) {
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) AbstractJsonLexerKt.NULL)) {
            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getIO()), null, null, new DappWebView$loadSui$1$1(c13241dEa, null), 3, null);
        }
    }

    public final void finit() {
        evaluateJavascript("window.keplr", new android.webkit.ValueCallback() { // from class: o.dEh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.webkit.ValueCallback
            public final void onReceiveValue(java.lang.Object obj) {
                C13241dEa.fetchVPNInfo(this.EZpvd, (java.lang.String) obj);
            }
        });
    }

    public static final void fetchVPNInfo(C13241dEa c13241dEa, java.lang.String str) {
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) AbstractJsonLexerKt.NULL)) {
            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getIO()), null, null, new DappWebView$loadCosmos$1$1(c13241dEa, null), 3, null);
        }
    }

    public final void gGvvIC() {
        evaluateJavascript("window.starknet", new android.webkit.ValueCallback() { // from class: o.dEm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.webkit.ValueCallback
            public final void onReceiveValue(java.lang.Object obj) {
                C13241dEa.fARcdN(this.KWHzl, (java.lang.String) obj);
            }
        });
    }

    public static final void fARcdN(C13241dEa c13241dEa, java.lang.String str) {
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getIO()), null, null, new DappWebView$loadStarknet$1$1(c13241dEa, null), 3, null);
    }

    public final void AxsJAYaxsJAY() {
        evaluateJavascript("\n           (function() {\n                let tonconnect; \n                if (window.okxTonWallet && window.okxTonWallet.tonconnect !== undefined) { \n                    tonconnect = window.okxTonWallet.tonconnect; \n                } else { \n                    tonconnect = null; \n                } \n                return tonconnect; \n            })();\n            ", new android.webkit.ValueCallback() { // from class: o.dEn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.webkit.ValueCallback
            public final void onReceiveValue(java.lang.Object obj) {
                C13241dEa.ejfBZ(this.copydefault, (java.lang.String) obj);
            }
        });
    }

    public static final void ejfBZ(C13241dEa c13241dEa, java.lang.String str) {
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) ConnectionMethod.UNDEFINED) || Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) AbstractJsonLexerKt.NULL)) {
            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getIO()), null, null, new DappWebView$loadTon$1$1(c13241dEa, null), 3, null);
        }
    }

    public final void OLrzqt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        java.lang.String str2 = this.fARcdN;
        loadUrl(str);
        this.fARcdN = str2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: o.dEa */
    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: java.lang.String */
    /* JADX DEBUG: Multi-variable search result rejected for r5v3, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v5, types: [T, java.lang.String] */
    @Override // android.webkit.WebView
    public void loadUrl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        pUU.KWHzl(this.UeEOUB, "loadUrl url:" + str);
        this.uzCIH = "";
        this.valueOf = str;
        this.fARcdN = str;
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = str;
        if (str != 0 && C59449zhJ.AYXKKw(str, "http", true)) {
            ?? KWHzl = C59449zhJ.KWHzl((java.lang.String) objectRef.element, DefaultWebClient.HTTP_SCHEME, DefaultWebClient.HTTPS_SCHEME, true);
            objectRef.element = KWHzl;
            djBIcL((java.lang.String) KWHzl);
        }
        post(new java.lang.Runnable() { // from class: o.dEj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C13241dEa.KWHzl(this.EZpvd, objectRef);
            }
        });
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void KWHzl(C13241dEa c13241dEa, Ref.ObjectRef objectRef) {
        super.loadUrl((java.lang.String) objectRef.element);
    }

    /* JADX INFO: renamed from: o.dEa$Application */
    public final class Application extends android.webkit.WebViewClient {
        public android.net.Uri AEQbTJ;
        public java.lang.String EZpvd;
        public dGL KWHzl;
        public java.lang.String OLrzqt;

        public static final void OLrzqt(java.lang.String str) {
        }

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public Application() {
            this.KWHzl = new dGL(C13241dEa.this.fIwbmz());
        }

        @Override // android.webkit.WebViewClient
        public android.webkit.WebResourceResponse shouldInterceptRequest(@NotNull android.webkit.WebView webView, @NotNull android.webkit.WebResourceRequest webResourceRequest) {
            Intrinsics.checkNotNullParameter(webView, "");
            Intrinsics.checkNotNullParameter(webResourceRequest, "");
            android.webkit.WebResourceResponse webResourceResponseKWHzl = !C15142dyj.EZpvd.AEQbTJ(java.lang.String.valueOf(C13241dEa.this.valueOf)) ? C13241dEa.this.DbNXlk().KWHzl(webView, webResourceRequest) : null;
            if (webResourceResponseKWHzl != null) {
                try {
                    java.io.InputStream data = webResourceResponseKWHzl.getData();
                    Intrinsics.checkNotNullExpressionValue(data, "");
                    byte[] bArrKWHzl = yFB.KWHzl(data);
                    if (data.read(bArrKWHzl) == 0) {
                        return webResourceResponseKWHzl;
                    }
                    dEU deuFIwbmz = C13241dEa.this.fIwbmz();
                    java.nio.charset.Charset charset = Charsets.UTF_8;
                    java.lang.String strAEQbTJ = deuFIwbmz.AEQbTJ(new java.lang.String(bArrKWHzl, charset));
                    Intrinsics.checkNotNullExpressionValue(strAEQbTJ, "");
                    byte[] bytes = strAEQbTJ.getBytes(charset);
                    Intrinsics.checkNotNullExpressionValue(bytes, "");
                    webResourceResponseKWHzl.setData(new java.io.ByteArrayInputStream(bytes));
                    return webResourceResponseKWHzl;
                } catch (java.io.IOException unused) {
                    return webResourceResponseKWHzl;
                } catch (java.lang.OutOfMemoryError e) {
                    C6777aVl.Companion.EZpvd(new java.lang.Exception(e.getMessage() + ":" + webResourceRequest.getUrl()));
                    return null;
                }
            }
            return this.KWHzl.shouldInterceptRequest(webView, webResourceRequest);
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(android.webkit.WebView webView, android.webkit.WebResourceRequest webResourceRequest, android.webkit.WebResourceError webResourceError) {
            java.lang.CharSequence description;
            super.onReceivedError(webView, webResourceRequest, webResourceError);
            if (webResourceRequest != null && webResourceRequest.isForMainFrame()) {
                Function1<java.lang.Boolean, Unit> function1RJOkX = C13241dEa.this.RJOkX();
                if (function1RJOkX != null) {
                    function1RJOkX.invoke(java.lang.Boolean.TRUE);
                }
                C13241dEa.this.setShowError(true);
                EZpvd(webResourceRequest != null ? webResourceRequest.getUrl() : null, webResourceError != null ? java.lang.Integer.valueOf(webResourceError.getErrorCode()).toString() : null, (webResourceError == null || (description = webResourceError.getDescription()) == null) ? null : description.toString());
            }
            java.lang.String str = C13241dEa.this.UeEOUB;
            java.lang.Integer numValueOf = webResourceError != null ? java.lang.Integer.valueOf(webResourceError.getErrorCode()) : null;
            java.lang.CharSequence description2 = webResourceError != null ? webResourceError.getDescription() : null;
            pUU.copydefault(str, "onReceivedError code:" + numValueOf + " desc:" + ((java.lang.Object) description2) + " url:" + (webResourceRequest != null ? webResourceRequest.getUrl() : null) + " isForMainFrame:" + (webResourceRequest != null ? java.lang.Boolean.valueOf(webResourceRequest.isForMainFrame()) : null));
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedHttpError(android.webkit.WebView webView, android.webkit.WebResourceRequest webResourceRequest, android.webkit.WebResourceResponse webResourceResponse) {
            super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
            if (webResourceRequest != null && webResourceRequest.isForMainFrame()) {
                EZpvd(webResourceRequest != null ? webResourceRequest.getUrl() : null, webResourceResponse != null ? java.lang.Integer.valueOf(webResourceResponse.getStatusCode()).toString() : null, webResourceResponse != null ? webResourceResponse.getReasonPhrase() : null);
            }
            pUU.copydefault(C13241dEa.this.UeEOUB, "onReceivedHttpError code:" + (webResourceResponse != null ? java.lang.Integer.valueOf(webResourceResponse.getStatusCode()) : null) + " reasonPhrase:" + (webResourceResponse != null ? webResourceResponse.getReasonPhrase() : null));
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedSslError(android.webkit.WebView webView, android.webkit.SslErrorHandler sslErrorHandler, android.net.http.SslError sslError) {
            android.net.Uri uri;
            java.lang.String url;
            pUU.copydefault(C13241dEa.this.UeEOUB, "onReceivedSslError:" + sslError);
            if (sslErrorHandler != null) {
                sslErrorHandler.cancel();
            }
            if (webView == null || (url = webView.getUrl()) == null) {
                uri = null;
            } else {
                uri = android.net.Uri.parse(url);
                Intrinsics.checkNotNullExpressionValue(uri, "");
            }
            EZpvd(uri, sslError != null ? java.lang.Integer.valueOf(sslError.getPrimaryError()).toString() : null, "ssl error");
        }

        public final void EZpvd(android.net.Uri uri, java.lang.String str, java.lang.String str2) {
            if (uri == null) {
                return;
            }
            try {
                java.lang.String string = uri.toString();
                android.net.Uri uri2 = this.AEQbTJ;
                if (Intrinsics.EZpvd((java.lang.Object) string, (java.lang.Object) (uri2 != null ? uri2.toString() : null)) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) str) && Intrinsics.EZpvd((java.lang.Object) str2, (java.lang.Object) this.EZpvd)) {
                    return;
                }
                this.AEQbTJ = uri;
                this.OLrzqt = str;
                this.EZpvd = str2;
                java.lang.String scheme = uri.getScheme();
                if (scheme == null) {
                    scheme = "";
                }
                java.lang.String authority = uri.getAuthority();
                if (authority == null) {
                    authority = "";
                }
                java.lang.String str3 = scheme + "://" + authority;
                java.lang.String path = uri.getPath();
                if (path == null) {
                    path = "";
                }
                java.lang.String string2 = uri.toString();
                Intrinsics.checkNotNullExpressionValue(string2, "");
                EventData eventData = new EventData();
                eventData.setAct("dapp_webview");
                eventData.setCode(str);
                eventData.setMsg(str2);
                ReportManager reportManager = ReportManager.AEQbTJ;
                eventData.setAttribute(C56424yEw.djBIcL(C56390yDp.OLrzqt("path", str3 + path), C56390yDp.OLrzqt("base_url", str3), C56390yDp.OLrzqt("full_url", string2)));
                reportManager.EZpvd(eventData);
            } catch (java.lang.Exception unused) {
            }
        }

        public final java.lang.String copydefault(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return "(function() {\n  const rawAddEventListener = " + str + ".addEventListener;\n  function injectAddEventListenerHook() {\n    " + str + ".addEventListener = function (a,b,c) {\n      if (a && (a.includes('orientation') || a.includes('motion'))) {\n        return;\n      }\n      else {\n        return rawAddEventListener.call(this, a,b,c);\n      }\n    };\n  }\n  injectAddEventListenerHook();\n})();";
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(android.webkit.WebView webView, final java.lang.String str) {
            android.net.Uri uri;
            final FragmentActivity fragmentActivity;
            final FragmentActivity fragmentActivity2;
            Function1<java.lang.Boolean, Unit> function1RJOkX;
            pUU.KWHzl(C13241dEa.this.UeEOUB, "onPageFinished url:" + str);
            dIQ diqUeEOUB = C13241dEa.this.UeEOUB();
            if (diqUeEOUB != null) {
                diqUeEOUB.EZpvd(webView, str);
            }
            super.onPageFinished(webView, str);
            if (!C13241dEa.this.ORxRYg() && (function1RJOkX = C13241dEa.this.RJOkX()) != null) {
                function1RJOkX.invoke(java.lang.Boolean.FALSE);
            }
            if (str != null) {
                uri = android.net.Uri.parse(str);
                Intrinsics.checkNotNullExpressionValue(uri, "");
            } else {
                uri = null;
            }
            EZpvd(uri, "0", "success");
            final C13241dEa c13241dEa = C13241dEa.this;
            final java.lang.String str2 = "(function() {\n    const getFavicon = () => {\n        // Try all possible favicon related selectors\n        const iconLink = document.querySelector('link[rel=\"icon\"]') || \n                      document.querySelector('link[rel=\"shortcut icon\"]') || \n                      document.querySelector('link[rel=\"apple-touch-icon\"]') ||\n                      document.querySelector('link[rel=\"apple-touch-icon-precomposed\"]') ||\n                      document.querySelector('link[rel=\"mask-icon\"]')\n                  ;\n        \n        \n        if (iconLink) {\n            // For meta tag, we need to get content attribute\n            if(iconLink.tagName.toLowerCase() === 'meta') {\n                return iconLink.getAttribute('content');\n            }\n            return iconLink.href;\n        }\n        return '';\n    };\n    window.getFavicon = getFavicon;\n    return getFavicon();\n})();";
            c13241dEa.postDelayed(new java.lang.Runnable() { // from class: o.dEB
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    C13241dEa.Application.EZpvd(c13241dEa, str2, this, str);
                }
            }, 500L);
            final C13241dEa c13241dEa2 = C13241dEa.this;
            c13241dEa2.evaluateJavascript("\n           (function() {\n                let ogSiteName; \n                if (window.okxwallet && typeof window.okxwallet.getOGSiteName === 'function') { \n                    ogSiteName = window.okxwallet.getOGSiteName();\n                } else { \n           \n                    ogSiteName = null; \n                } \n                return ogSiteName; \n            })();\n            ", new android.webkit.ValueCallback() { // from class: o.dEx
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.webkit.ValueCallback
                public final void onReceiveValue(java.lang.Object obj) {
                    C13241dEa.Application.copydefault(c13241dEa2, (java.lang.String) obj);
                }
            });
            if (!C13241dEa.this.OcIXYQ().isEmpty()) {
                WeakReference<FragmentActivity> weakReferenceFetchVPNInfo = C13241dEa.this.fetchVPNInfo();
                if (weakReferenceFetchVPNInfo != null && (fragmentActivity2 = weakReferenceFetchVPNInfo.get()) != null) {
                    C13241dEa c13241dEa3 = C13241dEa.this;
                    C14923duc c14923duc = C14923duc.EZpvd;
                    java.lang.String strZLjUOn = c13241dEa3.zLjUOn();
                    Function0<Unit> function0 = new Function0() { // from class: o.dEy
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return C13241dEa.Application.EZpvd(fragmentActivity2);
                        }
                    };
                    java.lang.Boolean bool = java.lang.Boolean.FALSE;
                    java.util.List<java.lang.String> listAxsJAYsNCnLh = CollectionsKt___CollectionsKt.AxsJAYsNCnLh(c13241dEa3.OcIXYQ());
                    dES des = c13241dEa3.aKErDB().get();
                    c14923duc.copydefault(fragmentActivity2, str, strZLjUOn, "2", function0, bool, listAxsJAYsNCnLh, "", "", des != null ? des.zLjUOn() : null, new yHO() { // from class: o.dEA
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // o.yHO
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                            return C13241dEa.Application.EZpvd(((java.lang.Boolean) obj).booleanValue(), ((java.lang.Boolean) obj2).booleanValue(), (OKCheckLeveldappInfo) obj3);
                        }
                    });
                }
                C13241dEa.this.OcIXYQ().clear();
            } else {
                WeakReference<FragmentActivity> weakReferenceFetchVPNInfo2 = C13241dEa.this.fetchVPNInfo();
                if (weakReferenceFetchVPNInfo2 != null && (fragmentActivity = weakReferenceFetchVPNInfo2.get()) != null) {
                    C13241dEa c13241dEa4 = C13241dEa.this;
                    C14923duc c14923duc2 = C14923duc.EZpvd;
                    java.lang.String strZLjUOn2 = c13241dEa4.zLjUOn();
                    Function0<Unit> function02 = new Function0() { // from class: o.dEE
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return C13241dEa.Application.OLrzqt(fragmentActivity);
                        }
                    };
                    java.lang.Boolean bool2 = java.lang.Boolean.FALSE;
                    java.lang.String newProxyInstance = c13241dEa4.getNewProxyInstance();
                    dES des2 = c13241dEa4.aKErDB().get();
                    c14923duc2.copydefault(fragmentActivity, str, strZLjUOn2, "2", function02, bool2, null, newProxyInstance, str, des2 != null ? des2.zLjUOn() : null, new yHO() { // from class: o.dEu
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // o.yHO
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                            return C13241dEa.Application.AEQbTJ(((java.lang.Boolean) obj).booleanValue(), ((java.lang.Boolean) obj2).booleanValue(), (OKCheckLeveldappInfo) obj3);
                        }
                    });
                }
            }
            if (C13241dEa.this.AuCTel()) {
                return;
            }
            C13241dEa.this.evaluateJavascript(copydefault("window"), new android.webkit.ValueCallback() { // from class: o.dEs
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.webkit.ValueCallback
                public final void onReceiveValue(java.lang.Object obj) {
                    C13241dEa.Application.OLrzqt((java.lang.String) obj);
                }
            });
        }

        public static final void EZpvd(C13241dEa c13241dEa, java.lang.String str, final Application application, final java.lang.String str2) {
            c13241dEa.evaluateJavascript(str, new android.webkit.ValueCallback() { // from class: o.dEq
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.webkit.ValueCallback
                public final void onReceiveValue(java.lang.Object obj) {
                    C13241dEa.Application.EZpvd(this.EZpvd, str2, (java.lang.String) obj);
                }
            });
        }

        public static final void EZpvd(Application application, java.lang.String str, java.lang.String str2) {
            application.KWHzl(str2, str);
        }

        public static final void copydefault(C13241dEa c13241dEa, java.lang.String str) {
            Function1<java.lang.String, Unit> function1AxsJAY;
            pUU.KWHzl(c13241dEa.UeEOUB, "onPageFinished siteName :" + str);
            if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) AbstractJsonLexerKt.NULL)) {
                return;
            }
            Intrinsics.copydefault((java.lang.Object) str);
            if (C59449zhJ.startsWith$default(str, ModelIdentifier.Helper.PRIMARY_KEY_ENCAPSULATE_CHAR, false, 2, null) && C59449zhJ.endsWith$default(str, ModelIdentifier.Helper.PRIMARY_KEY_ENCAPSULATE_CHAR, false, 2, null)) {
                str = str.substring(1, str.length() - 1);
                Intrinsics.checkNotNullExpressionValue(str, "");
            }
            c13241dEa.setMSiteName(str);
            if (!c13241dEa.isAttachedToWindow() || (function1AxsJAY = c13241dEa.AxsJAY()) == null) {
                return;
            }
            function1AxsJAY.invoke(c13241dEa.wlaJM());
        }

        public static final Unit EZpvd(FragmentActivity fragmentActivity) {
            C15112dyF c15112dyF = C15112dyF.AEQbTJ;
            DappTabData dappTabDataOLrzqt = c15112dyF.OLrzqt();
            if (dappTabDataOLrzqt != null) {
                dappTabDataOLrzqt.setMWebView(null);
            }
            DappTabData dappTabDataOLrzqt2 = c15112dyF.OLrzqt();
            if (dappTabDataOLrzqt2 != null) {
                dappTabDataOLrzqt2.setLoaded(false);
            }
            DappTabData dappTabDataOLrzqt3 = c15112dyF.OLrzqt();
            if (dappTabDataOLrzqt3 != null) {
                DappTabData dappTabDataOLrzqt4 = c15112dyF.OLrzqt();
                dappTabDataOLrzqt3.setMUrl(dappTabDataOLrzqt4 != null ? dappTabDataOLrzqt4.getOriginUrl() : null);
            }
            fragmentActivity.finish();
            return Unit.INSTANCE;
        }

        public static final Unit EZpvd(boolean z, boolean z2, OKCheckLeveldappInfo oKCheckLeveldappInfo) {
            return Unit.INSTANCE;
        }

        public static final Unit OLrzqt(FragmentActivity fragmentActivity) {
            C15112dyF c15112dyF = C15112dyF.AEQbTJ;
            DappTabData dappTabDataOLrzqt = c15112dyF.OLrzqt();
            if (dappTabDataOLrzqt != null) {
                dappTabDataOLrzqt.setMWebView(null);
            }
            DappTabData dappTabDataOLrzqt2 = c15112dyF.OLrzqt();
            if (dappTabDataOLrzqt2 != null) {
                dappTabDataOLrzqt2.setLoaded(false);
            }
            DappTabData dappTabDataOLrzqt3 = c15112dyF.OLrzqt();
            if (dappTabDataOLrzqt3 != null) {
                DappTabData dappTabDataOLrzqt4 = c15112dyF.OLrzqt();
                dappTabDataOLrzqt3.setMUrl(dappTabDataOLrzqt4 != null ? dappTabDataOLrzqt4.getOriginUrl() : null);
            }
            fragmentActivity.finish();
            return Unit.INSTANCE;
        }

        public static final Unit AEQbTJ(boolean z, boolean z2, OKCheckLeveldappInfo oKCheckLeveldappInfo) {
            return Unit.INSTANCE;
        }

        public final void KWHzl(java.lang.String str, java.lang.String str2) {
            PlatformItem mItem;
            DappSearchResultBean dappSearchResultBeanOLrzqt;
            PlatformItem mItem2;
            java.lang.String mUrl;
            PlatformItem mItem3;
            pUU.KWHzl(C13241dEa.this.UeEOUB, "Favicon URL result: " + str);
            if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) AbstractJsonLexerKt.NULL) || str == null || str.length() == 0) {
                pUU.KWHzl(C13241dEa.this.UeEOUB, "No favicon URL found");
                return;
            }
            java.lang.String strAEQbTJ = StringsKt__StringsKt.AEQbTJ(str, '\"');
            pUU.KWHzl(C13241dEa.this.UeEOUB, "Clean favicon URL: " + strAEQbTJ);
            if (strAEQbTJ == null || strAEQbTJ.length() == 0) {
                return;
            }
            C15112dyF c15112dyF = C15112dyF.AEQbTJ;
            DappTabData dappTabDataOLrzqt = c15112dyF.OLrzqt();
            if (Intrinsics.EZpvd((java.lang.Object) strAEQbTJ, (java.lang.Object) ((dappTabDataOLrzqt == null || (mItem3 = dappTabDataOLrzqt.getMItem()) == null) ? null : mItem3.getLogo()))) {
                return;
            }
            C14923duc c14923duc = C14923duc.EZpvd;
            java.lang.String str3 = "";
            if (str2 == null) {
                str2 = "";
            }
            java.lang.String strKWHzl = c14923duc.KWHzl(str2);
            DappTabData dappTabDataOLrzqt2 = c15112dyF.OLrzqt();
            if (dappTabDataOLrzqt2 != null && (mUrl = dappTabDataOLrzqt2.getMUrl()) != null) {
                str3 = mUrl;
            }
            if (Intrinsics.EZpvd((java.lang.Object) strKWHzl, (java.lang.Object) c14923duc.KWHzl(str3))) {
                DappTabData dappTabDataOLrzqt3 = c15112dyF.OLrzqt();
                if (dappTabDataOLrzqt3 != null && (mItem2 = dappTabDataOLrzqt3.getMItem()) != null) {
                    mItem2.setLogo(strAEQbTJ);
                }
                DappTabData dappTabDataOLrzqt4 = c15112dyF.OLrzqt();
                if (dappTabDataOLrzqt4 != null) {
                    dappTabDataOLrzqt4.setMIconByte(null);
                }
                DappTabData dappTabDataOLrzqt5 = c15112dyF.OLrzqt();
                if (dappTabDataOLrzqt5 != null) {
                    dappTabDataOLrzqt5.setMIcon(null);
                }
                DappTabData dappTabDataOLrzqt6 = c15112dyF.OLrzqt();
                if (dappTabDataOLrzqt6 == null || (mItem = dappTabDataOLrzqt6.getMItem()) == null || (dappSearchResultBeanOLrzqt = c14923duc.OLrzqt(mItem)) == null) {
                    return;
                }
                c14923duc.AEQbTJ(dappSearchResultBeanOLrzqt);
            }
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(android.webkit.WebView webView, java.lang.String str, android.graphics.Bitmap bitmap) {
            PlatformItem mItem;
            java.lang.String strZLjUOn;
            PlatformItem mItem2;
            final FragmentActivity fragmentActivity;
            pUU.KWHzl(C13241dEa.this.UeEOUB, "onPageStarted url:" + str);
            if (str == null || !C59449zhJ.startsWith$default(str, WebViewJsUtil.EMPTY_PAGE, false, 2, null)) {
                WeakReference<FragmentActivity> weakReferenceFetchVPNInfo = C13241dEa.this.fetchVPNInfo();
                if (weakReferenceFetchVPNInfo != null && (fragmentActivity = weakReferenceFetchVPNInfo.get()) != null) {
                    C15142dyj.EZpvd.OLrzqt(str == null ? "" : str, new Function1() { // from class: o.dEz
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return C13241dEa.Application.AEQbTJ(fragmentActivity, (java.lang.String) obj);
                        }
                    });
                }
                WeakReference<FragmentActivity> weakReferenceFetchVPNInfo2 = C13241dEa.this.fetchVPNInfo();
                if (weakReferenceFetchVPNInfo2 != null && weakReferenceFetchVPNInfo2.get() != null) {
                    C13241dEa c13241dEa = C13241dEa.this;
                    C14742drG c14742drG = C14742drG.KWHzl;
                    java.lang.String strGEmmrt = C33129mqd.gEmmrt(str);
                    DappTabData dappTabDataOLrzqt = C15112dyF.AEQbTJ.OLrzqt();
                    if ((dappTabDataOLrzqt == null || (mItem2 = dappTabDataOLrzqt.getMItem()) == null || (strZLjUOn = mItem2.getPlatform()) == null) && (strZLjUOn = c13241dEa.zLjUOn()) == null) {
                        strZLjUOn = "";
                    }
                    dES des = c13241dEa.aKErDB().get();
                    c14742drG.KWHzl(strGEmmrt, strZLjUOn, des != null ? des.zLjUOn() : null);
                }
                dBP dbpFJNWhG = C13241dEa.this.fJNWhG();
                if (dbpFJNWhG != null) {
                    dbpFJNWhG.OLrzqt(str);
                }
                C13241dEa.this.valueOf = str;
                if (C57354ygo.OLrzqt(str)) {
                    C13241dEa c13241dEa2 = C13241dEa.this;
                    dBP dbpFJNWhG2 = c13241dEa2.fJNWhG();
                    Intrinsics.copydefault(dbpFJNWhG2);
                    c13241dEa2.addJavascriptInterface(dbpFJNWhG2, "native");
                } else {
                    C13241dEa.this.removeJavascriptInterface("native");
                }
                super.onPageStarted(webView, str, bitmap);
                C13241dEa.this.setShowError(false);
                C13241dEa.this.flVtFt();
                dIQ diqUeEOUB = C13241dEa.this.UeEOUB();
                if (diqUeEOUB != null) {
                    diqUeEOUB.KWHzl(webView, str, bitmap);
                }
                C15196dzk.KWHzl.AEQbTJ(str);
                DappTabData dappTabDataOLrzqt2 = C15112dyF.AEQbTJ.OLrzqt();
                if (dappTabDataOLrzqt2 == null || (mItem = dappTabDataOLrzqt2.getMItem()) == null || mItem.getId() != 0) {
                    return;
                }
                java.lang.String str2 = "https://www.google.com/s2/favicons?domain=" + C14923duc.EZpvd.KWHzl(str != null ? str : "") + "&sz=64";
                Glide.AEQbTJ(C13241dEa.this.getContext()).EZpvd(str2).copydefault(1, 1).OLrzqt((RY) new Activity(str, str2)).KWHzl(1, 1);
            }
        }

        public static final Unit AEQbTJ(FragmentActivity fragmentActivity, java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            if (C33129mqd.OLrzqt((java.lang.CharSequence) str)) {
                C15142dyj.EZpvd.OLrzqt(fragmentActivity, str);
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: o.dEa$Application$Activity */
        public static final class Activity implements RY<android.graphics.drawable.Drawable> {
            public final /* synthetic */ java.lang.String AEQbTJ;
            public final /* synthetic */ java.lang.String copydefault;

            @Override // o.RY
            public boolean OLrzqt(GlideException glideException, java.lang.Object obj, InterfaceC5462Sq<android.graphics.drawable.Drawable> interfaceC5462Sq, boolean z) {
                return false;
            }

            public Activity(java.lang.String str, java.lang.String str2) {
                this.AEQbTJ = str;
                this.copydefault = str2;
            }

            /* JADX DEBUG: Method merged with bridge method: copydefault(Ljava/lang/Object;Ljava/lang/Object;Lo/Sq;Lcom/bumptech/glide/load/DataSource;Z)Z */
            @Override // o.RY
            /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
            public boolean copydefault(android.graphics.drawable.Drawable drawable, java.lang.Object obj, InterfaceC5462Sq<android.graphics.drawable.Drawable> interfaceC5462Sq, com.bumptech.glide.load.DataSource dataSource, boolean z) {
                PlatformItem mItem;
                DappSearchResultBean dappSearchResultBeanOLrzqt;
                PlatformItem mItem2;
                java.lang.String mUrl;
                C14923duc c14923duc = C14923duc.EZpvd;
                java.lang.String str = this.AEQbTJ;
                java.lang.String str2 = "";
                if (str == null) {
                    str = "";
                }
                java.lang.String strKWHzl = c14923duc.KWHzl(str);
                C15112dyF c15112dyF = C15112dyF.AEQbTJ;
                DappTabData dappTabDataOLrzqt = c15112dyF.OLrzqt();
                if (dappTabDataOLrzqt != null && (mUrl = dappTabDataOLrzqt.getMUrl()) != null) {
                    str2 = mUrl;
                }
                if (!Intrinsics.EZpvd((java.lang.Object) strKWHzl, (java.lang.Object) c14923duc.KWHzl(str2))) {
                    return false;
                }
                DappTabData dappTabDataOLrzqt2 = c15112dyF.OLrzqt();
                if (dappTabDataOLrzqt2 != null && (mItem2 = dappTabDataOLrzqt2.getMItem()) != null) {
                    mItem2.setLogo(this.copydefault);
                }
                DappTabData dappTabDataOLrzqt3 = c15112dyF.OLrzqt();
                if (dappTabDataOLrzqt3 != null) {
                    dappTabDataOLrzqt3.setMIconByte(null);
                }
                DappTabData dappTabDataOLrzqt4 = c15112dyF.OLrzqt();
                if (dappTabDataOLrzqt4 != null) {
                    dappTabDataOLrzqt4.setMIcon(null);
                }
                DappTabData dappTabDataOLrzqt5 = c15112dyF.OLrzqt();
                if (dappTabDataOLrzqt5 == null || (mItem = dappTabDataOLrzqt5.getMItem()) == null || (dappSearchResultBeanOLrzqt = c14923duc.OLrzqt(mItem)) == null) {
                    return false;
                }
                c14923duc.AEQbTJ(dappSearchResultBeanOLrzqt);
                return false;
            }
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(android.webkit.WebView webView, android.webkit.WebResourceRequest webResourceRequest) {
            android.net.Uri url;
            java.lang.String string;
            java.lang.String strKWHzl;
            final java.lang.String strDecode;
            FragmentActivity fragmentActivity;
            FragmentActivity fragmentActivity2;
            FragmentActivity fragmentActivity3;
            FragmentActivity fragmentActivity4;
            java.lang.String string2;
            android.net.Uri url2;
            FragmentActivity fragmentActivity5;
            android.net.Uri url3;
            pUU.copydefault(C13241dEa.this.UeEOUB, "shouldOverrideUrlLoading url:" + (webResourceRequest != null ? webResourceRequest.getUrl() : null) + (webResourceRequest != null ? java.lang.Boolean.valueOf(webResourceRequest.isRedirect()) : null));
            if (Intrinsics.EZpvd((java.lang.Object) ((webResourceRequest == null || (url3 = webResourceRequest.getUrl()) == null) ? null : url3.getScheme()), (java.lang.Object) "about")) {
                return true;
            }
            InterfaceC43294rma interfaceC43294rma = (InterfaceC43294rma) C43251rlk.copydefault(InterfaceC43294rma.class);
            if (webResourceRequest == null || (url = webResourceRequest.getUrl()) == null || (string = url.toString()) == null) {
                return false;
            }
            WeakReference<FragmentActivity> weakReferenceFetchVPNInfo = C13241dEa.this.fetchVPNInfo();
            if (weakReferenceFetchVPNInfo != null && (fragmentActivity5 = weakReferenceFetchVPNInfo.get()) != null && interfaceC43294rma.AkhnZx(string)) {
                interfaceC43294rma.KWHzl(fragmentActivity5, string, C56424yEw.KWHzl(), new Function1() { // from class: o.dEv
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C13241dEa.Application.EZpvd((AbstractC43238rlX) obj);
                    }
                });
                return true;
            }
            C13241dEa.this.setLastRedirectUrl(string);
            if (webResourceRequest.isRedirect() && (url2 = webResourceRequest.getUrl()) != null) {
                C13241dEa.this.OcIXYQ().add(C33129mqd.gEmmrt(url2));
            }
            android.net.Uri url4 = webResourceRequest.getUrl();
            if (url4 != null && (string2 = url4.toString()) != null) {
                C13241dEa c13241dEa = C13241dEa.this;
                java.util.Iterator<T> it = c13241dEa.AYXKKw().iterator();
                while (it.hasNext()) {
                    if (C59449zhJ.startsWith$default(string2, (java.lang.String) it.next(), false, 2, null)) {
                        return true;
                    }
                }
                if (!Intrinsics.EZpvd((java.lang.Object) c13241dEa.valueOf, (java.lang.Object) string2)) {
                    if (webResourceRequest.isForMainFrame() && webResourceRequest.isRedirect()) {
                        string2 = c13241dEa.valueOf;
                    }
                    c13241dEa.setLastContentUrl(string2);
                }
            }
            C13241dEa.this.valueOf = java.lang.String.valueOf(webResourceRequest.getUrl());
            C15196dzk.KWHzl.AEQbTJ(java.lang.String.valueOf(webResourceRequest.getUrl()));
            WeakReference<FragmentActivity> weakReferenceFetchVPNInfo2 = C13241dEa.this.fetchVPNInfo();
            if (weakReferenceFetchVPNInfo2 != null && (fragmentActivity4 = weakReferenceFetchVPNInfo2.get()) != null) {
                C15142dyj c15142dyj = C15142dyj.EZpvd;
                java.lang.String strDjBIcL = c15142dyj.djBIcL(java.lang.String.valueOf(webResourceRequest.getUrl()));
                if (C33129mqd.OLrzqt((java.lang.CharSequence) strDjBIcL)) {
                    c15142dyj.OLrzqt(fragmentActivity4, strDjBIcL);
                }
            }
            android.net.Uri url5 = webResourceRequest.getUrl();
            if (url5 == null || (strKWHzl = url5.toString()) == null) {
                strKWHzl = "";
            }
            if (C59449zhJ.AYXKKw(strKWHzl, "http", true)) {
                strKWHzl = C59449zhJ.KWHzl(strKWHzl, DefaultWebClient.HTTP_SCHEME, DefaultWebClient.HTTPS_SCHEME, true);
                dBP dbpFJNWhG = C13241dEa.this.fJNWhG();
                if (dbpFJNWhG != null) {
                    dbpFJNWhG.OLrzqt(strKWHzl);
                }
                if (C57354ygo.OLrzqt(strKWHzl)) {
                    C13241dEa c13241dEa2 = C13241dEa.this;
                    dBP dbpFJNWhG2 = c13241dEa2.fJNWhG();
                    Intrinsics.copydefault(dbpFJNWhG2);
                    c13241dEa2.addJavascriptInterface(dbpFJNWhG2, "native");
                } else {
                    C13241dEa.this.removeJavascriptInterface("native");
                }
                if (C13241dEa.this.djBIcL(strKWHzl)) {
                    if (webView != null) {
                        webView.loadUrl(java.lang.String.valueOf(webResourceRequest.getUrl()));
                    }
                    return true;
                }
            }
            if (!webResourceRequest.isForMainFrame() || !webResourceRequest.isRedirect()) {
                C13241dEa.this.flVtFt();
                try {
                    strDecode = URLDecoder.decode(C33129mqd.gEmmrt(android.net.Uri.parse(strKWHzl).getQueryParameter("uri")), com.google.android.exoplayer2.C.UTF8_NAME);
                } catch (java.lang.Exception unused) {
                    strDecode = null;
                }
                if (C59449zhJ.startsWith$default(strKWHzl, "wc:", false, 2, null) || (strDecode != null && C59449zhJ.startsWith$default(strDecode, "wc:", false, 2, null))) {
                    if (C59449zhJ.startsWith$default(strKWHzl, "wc:", false, 2, null)) {
                        strDecode = strKWHzl;
                    }
                    WeakReference<FragmentActivity> weakReferenceFetchVPNInfo3 = C13241dEa.this.fetchVPNInfo();
                    if (weakReferenceFetchVPNInfo3 != null && (fragmentActivity = weakReferenceFetchVPNInfo3.get()) != null) {
                        final C13241dEa c13241dEa3 = C13241dEa.this;
                        C14923duc.checkUrl$default(C14923duc.EZpvd, fragmentActivity, strKWHzl, "", null, null, null, null, null, null, null, new yHO() { // from class: o.dEw
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // o.yHO
                            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                                return C13241dEa.Application.copydefault(c13241dEa3, strDecode, ((java.lang.Boolean) obj).booleanValue(), ((java.lang.Boolean) obj2).booleanValue(), (OKCheckLeveldappInfo) obj3);
                            }
                        }, 1016, null);
                    }
                    return true;
                }
                if (C59449zhJ.startsWith$default(strKWHzl, androidx.core.net.MailTo.MAILTO_SCHEME, false, 2, null)) {
                    try {
                        C13241dEa c13241dEa4 = C13241dEa.this;
                        java.lang.String strSubstring = strKWHzl.substring(7);
                        Intrinsics.checkNotNullExpressionValue(strSubstring, "");
                        android.content.Intent intent = new android.content.Intent("android.intent.action.SENDTO", android.net.Uri.parse(strKWHzl));
                        intent.setFlags(268435456);
                        intent.putExtra("android.intent.extra.EMAIL", new java.lang.String[]{strSubstring});
                        intent.putExtra("android.intent.extra.SUBJECT", "");
                        intent.putExtra("android.intent.extra.TEXT", "");
                        c13241dEa4.getContext().startActivity(intent);
                        return true;
                    } catch (java.lang.Exception unused2) {
                        android.content.Context context = C13241dEa.this.getContext();
                        C55326xho.toast$default(context != null ? context.getString(dLX.Dialog.USBtdM) : null, (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
                        return true;
                    }
                }
                if (!C59449zhJ.startsWith$default(strKWHzl, "blob:", false, 2, null) && !C59449zhJ.AYXKKw(strKWHzl, "http", true) && !C59449zhJ.AYXKKw(strKWHzl, "data:text/html", true)) {
                    if (!C59449zhJ.AYXKKw(strKWHzl, "http", true)) {
                        android.content.Intent intent2 = new android.content.Intent("android.intent.action.VIEW");
                        intent2.setData(android.net.Uri.parse(strKWHzl));
                        try {
                            WeakReference<FragmentActivity> weakReferenceFetchVPNInfo4 = C13241dEa.this.fetchVPNInfo();
                            if (weakReferenceFetchVPNInfo4 != null && (fragmentActivity3 = weakReferenceFetchVPNInfo4.get()) != null) {
                                fragmentActivity3.startActivity(intent2);
                                Unit unit = Unit.INSTANCE;
                            }
                        } catch (java.lang.Exception e) {
                            if (e instanceof android.content.ActivityNotFoundException) {
                                C55326xho.toastWithFailedIcon$default(dLX.Dialog.OJuSTm, 0, 1, (java.lang.Object) null);
                            }
                            Unit unit2 = Unit.INSTANCE;
                        }
                    }
                    return true;
                }
                if (C59449zhJ.startsWith$default(strKWHzl, "https://discordapp.page.link/?link=", false, 2, null)) {
                    try {
                        java.lang.String strSubstring2 = strKWHzl.substring(StringsKt__StringsKt.indexOf$default((java.lang.CharSequence) strKWHzl, "https://discordapp.page.link/?link=", 0, false, 6, (java.lang.Object) null) + 35);
                        Intrinsics.checkNotNullExpressionValue(strSubstring2, "");
                        java.lang.String strDecode2 = URLDecoder.decode(strSubstring2, com.google.android.exoplayer2.C.UTF8_NAME);
                        Intrinsics.copydefault((java.lang.Object) strDecode2);
                        java.lang.String str = (java.lang.String) StringsKt__StringsKt.split$default((java.lang.CharSequence) strDecode2, new java.lang.String[]{"?"}, false, 0, 6, (java.lang.Object) null).get(0);
                        WeakReference<FragmentActivity> weakReferenceFetchVPNInfo5 = C13241dEa.this.fetchVPNInfo();
                        if (weakReferenceFetchVPNInfo5 != null && (fragmentActivity2 = weakReferenceFetchVPNInfo5.get()) != null) {
                            fragmentActivity2.startActivity(new android.content.Intent("android.intent.action.VIEW", android.net.Uri.parse(str)));
                        }
                        return true;
                    } catch (java.lang.Exception unused3) {
                    }
                }
                Function1<java.lang.String, Unit> function1DTwDnp = C13241dEa.this.DTwDnp();
                if (function1DTwDnp != null) {
                    function1DTwDnp.invoke(strKWHzl);
                }
                return super.shouldOverrideUrlLoading(webView, webResourceRequest);
            }
            C13241dEa.this.OLrzqt(strKWHzl);
            return true;
        }

        public static final Unit EZpvd(AbstractC43238rlX abstractC43238rlX) {
            Intrinsics.checkNotNullParameter(abstractC43238rlX, "");
            return Unit.INSTANCE;
        }

        public static final Unit copydefault(final C13241dEa c13241dEa, java.lang.String str, boolean z, boolean z2, OKCheckLeveldappInfo oKCheckLeveldappInfo) {
            InterfaceC9854bdT interfaceC9854bdT = (InterfaceC9854bdT) C43251rlk.copydefault(InterfaceC9854bdT.class);
            android.content.Context context = c13241dEa.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            Intrinsics.copydefault((java.lang.Object) str);
            InterfaceC9854bdT.Application.jumpUrl$default(interfaceC9854bdT, context, str, true, false, null, new Function2() { // from class: o.dEt
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return C13241dEa.Application.AEQbTJ(c13241dEa, (java.lang.String) obj, (java.lang.String) obj2);
                }
            }, 24, null);
            return Unit.INSTANCE;
        }

        public static final Unit AEQbTJ(C13241dEa c13241dEa, java.lang.String str, java.lang.String str2) {
            if (str2 != null) {
                InterfaceC9731bbC interfaceC9731bbCEZpvd = ((InterfaceC9852bdR) C43251rlk.copydefault(InterfaceC9852bdR.class)).copydefault().EZpvd(str2, true);
                java.lang.Long lValueOf = interfaceC9731bbCEZpvd != null ? java.lang.Long.valueOf(interfaceC9731bbCEZpvd.fetchVPNInfo()) : null;
                Function2<java.lang.String, java.lang.Long, Unit> function2AuCTelauCTel = c13241dEa.AuCTelauCTel();
                if (function2AuCTelauCTel != null) {
                    function2AuCTelauCTel.invoke(str, lValueOf);
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Type inference failed for: r1v13, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v4, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v7, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v6, types: [T, java.lang.String] */
    public final boolean djBIcL(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        if (C15142dyj.EZpvd.gEmmrt(str)) {
            objectRef.element = this.fetchVPNInfo;
        } else if (C57354ygo.OLrzqt(str)) {
            objectRef.element = C43384roK.KWHzl.valueOf() + " " + this.fetchVPNInfo;
        } else {
            objectRef.element = this.fetchVPNInfo + " " + C43384roK.KWHzl.valueOf();
        }
        DappTabData dappTabDataOLrzqt = C15112dyF.AEQbTJ.OLrzqt();
        if (dappTabDataOLrzqt != null && dappTabDataOLrzqt.getWebViewUiMode() == 1) {
            objectRef.element = C14923duc.EZpvd.AhwBna(str);
        }
        if (Intrinsics.EZpvd(getSettings().getUserAgentString(), objectRef.element)) {
            return false;
        }
        post(new java.lang.Runnable() { // from class: o.dEp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C13241dEa.setUa$lambda$22(this.copydefault, objectRef);
            }
        });
        return true;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void setUa$lambda$22(C13241dEa c13241dEa, Ref.ObjectRef objectRef) {
        c13241dEa.getSettings().setUserAgentString((java.lang.String) objectRef.element);
    }

    /* JADX INFO: renamed from: o.dEa$Activity */
    public final class Activity extends com.just.agentweb.WebChromeClient {
        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public Activity() {
        }

        @Override // com.just.agentweb.WebChromeClientDelegate, android.webkit.WebChromeClient
        public boolean onConsoleMessage(android.webkit.ConsoleMessage consoleMessage) {
            if (C33129mqd.OLrzqt((java.lang.CharSequence) (consoleMessage != null ? consoleMessage.sourceId() : null))) {
                pUU.valueOf(C13241dEa.this.UeEOUB, "onConsoleMessage sourceId:" + (consoleMessage != null ? consoleMessage.sourceId() : null) + " message:" + (consoleMessage != null ? consoleMessage.message() : null));
            } else {
                pUU.valueOf(C13241dEa.this.UeEOUB, "onConsoleMessage message:" + (consoleMessage != null ? consoleMessage.message() : null));
            }
            return super.onConsoleMessage(consoleMessage);
        }

        @Override // com.just.agentweb.WebChromeClientDelegate, android.webkit.WebChromeClient
        public void onProgressChanged(android.webkit.WebView webView, int i) {
            super.onProgressChanged(webView, i);
            Function1<java.lang.Integer, Unit> function1GHZMYf = C13241dEa.this.gHZMYf();
            if (function1GHZMYf != null) {
                function1GHZMYf.invoke(java.lang.Integer.valueOf(i));
            }
        }

        @Override // com.just.agentweb.WebChromeClientDelegate, android.webkit.WebChromeClient
        public void onReceivedTitle(android.webkit.WebView webView, java.lang.String str) {
            Function1<java.lang.String, Unit> function1AxsJAY;
            super.onReceivedTitle(webView, str);
            pUU.valueOf(C13241dEa.this.UeEOUB, "onReceivedTitle:" + str);
            C13241dEa.this.setMTitle(str);
            if (!C13241dEa.this.isAttachedToWindow() || (function1AxsJAY = C13241dEa.this.AxsJAY()) == null) {
                return;
            }
            function1AxsJAY.invoke(C13241dEa.this.zLjUOn());
        }

        @Override // com.just.agentweb.WebChromeClientDelegate, android.webkit.WebChromeClient
        public void onReceivedIcon(android.webkit.WebView webView, android.graphics.Bitmap bitmap) {
            super.onReceivedIcon(webView, bitmap);
            C13241dEa.this.setMIcon(bitmap);
            Function1<android.graphics.Bitmap, Unit> function1SSMYrx = C13241dEa.this.sSMYrx();
            if (function1SSMYrx != null) {
                function1SSMYrx.invoke(C13241dEa.this.hDKMBd());
            }
        }

        @Override // com.just.agentweb.WebChromeClientDelegate, android.webkit.WebChromeClient
        public boolean onCreateWindow(android.webkit.WebView webView, boolean z, boolean z2, android.os.Message message) {
            java.lang.Object obj = message != null ? message.obj : null;
            Intrinsics.copydefault(obj, "");
            WebView.WebViewTransport webViewTransport = (WebView.WebViewTransport) obj;
            dES des = C13241dEa.this.aKErDB().get();
            C13241dEa c13241dEaEZpvd = des != null ? des.EZpvd(false) : null;
            if (c13241dEaEZpvd == null) {
                return false;
            }
            c13241dEaEZpvd.setScaleX(0.5f);
            c13241dEaEZpvd.setScaleY(0.5f);
            android.animation.ObjectAnimator objectAnimatorOfFloat = android.animation.ObjectAnimator.ofFloat(c13241dEaEZpvd, "scaleX", 1.0f);
            android.animation.ObjectAnimator objectAnimatorOfFloat2 = android.animation.ObjectAnimator.ofFloat(c13241dEaEZpvd, "scaleY", 1.0f);
            android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
            animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
            animatorSet.setDuration(300L);
            animatorSet.setInterpolator(new android.view.animation.AccelerateDecelerateInterpolator());
            animatorSet.addListener(new TaskDescription(c13241dEaEZpvd));
            animatorSet.start();
            webViewTransport.setWebView(c13241dEaEZpvd);
            message.sendToTarget();
            return true;
        }

        /* JADX INFO: renamed from: o.dEa$Activity$TaskDescription */
        public static final class TaskDescription extends android.animation.AnimatorListenerAdapter {
            public final /* synthetic */ C13241dEa copydefault;

            public TaskDescription(C13241dEa c13241dEa) {
                this.copydefault = c13241dEa;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(android.animation.Animator animator) {
                Intrinsics.checkNotNullParameter(animator, "");
                android.view.View rootView = this.copydefault.getRootView();
                ConstraintLayout constraintLayout = rootView != null ? (ConstraintLayout) rootView.findViewById(dLX.Application.DAIeex) : null;
                if (constraintLayout != null) {
                    C13241dEa c13241dEa = this.copydefault;
                    if (Intrinsics.EZpvd(c13241dEa.getParent(), constraintLayout)) {
                        for (android.view.View view : C59467zhb.zuBGHE(ViewGroupKt.getChildren(constraintLayout))) {
                            if (!Intrinsics.EZpvd(view, c13241dEa)) {
                                constraintLayout.removeView(view);
                            }
                        }
                    }
                }
            }
        }

        @Override // com.just.agentweb.WebChromeClientDelegate, android.webkit.WebChromeClient
        public void onCloseWindow(android.webkit.WebView webView) {
            dES des = C13241dEa.this.aKErDB().get();
            if (des != null) {
                des.AkhnZx();
            }
            super.onCloseWindow(webView);
        }

        @Override // com.just.agentweb.WebChromeClientDelegate, android.webkit.WebChromeClient
        public boolean onJsConfirm(android.webkit.WebView webView, java.lang.String str, java.lang.String str2, android.webkit.JsResult jsResult) {
            if (jsResult != null) {
                jsResult.confirm();
            }
            return super.onJsConfirm(webView, str, str2, jsResult);
        }

        @Override // com.just.agentweb.WebChromeClientDelegate, android.webkit.WebChromeClient
        public boolean onJsAlert(android.webkit.WebView webView, java.lang.String str, java.lang.String str2, final android.webkit.JsResult jsResult) {
            FragmentActivity fragmentActivity;
            WeakReference<FragmentActivity> weakReferenceFetchVPNInfo = C13241dEa.this.fetchVPNInfo();
            if (weakReferenceFetchVPNInfo != null && (fragmentActivity = weakReferenceFetchVPNInfo.get()) != null) {
                try {
                    if (!fragmentActivity.isFinishing() && !fragmentActivity.isDestroyed()) {
                        final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(fragmentActivity);
                        viewOnClickListenerC54939xaY.EZpvd(str2);
                        viewOnClickListenerC54939xaY.EZpvd(dLX.Dialog.DCUTEIdCUTEI, new View.OnClickListener() { // from class: o.dEF
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // android.view.View.OnClickListener
                            public final void onClick(android.view.View view) {
                                C13241dEa.Activity.OLrzqt(jsResult, viewOnClickListenerC54939xaY, view);
                            }
                        });
                        viewOnClickListenerC54939xaY.show();
                    }
                } catch (java.lang.Exception unused) {
                }
            }
            return super.onJsAlert(webView, str, str2, jsResult);
        }

        public static final void OLrzqt(android.webkit.JsResult jsResult, ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
            if (jsResult != null) {
                jsResult.confirm();
            }
            viewOnClickListenerC54939xaY.dismiss();
        }

        @Override // com.just.agentweb.WebChromeClientDelegate, android.webkit.WebChromeClient
        public boolean onJsPrompt(android.webkit.WebView webView, java.lang.String str, java.lang.String str2, java.lang.String str3, android.webkit.JsPromptResult jsPromptResult) {
            if (!C57354ygo.OLrzqt(str)) {
                return false;
            }
            C35962oKd.copydefault(C13241dEa.this.uzCIH(), str2);
            if (jsPromptResult == null) {
                return true;
            }
            jsPromptResult.confirm("JsBridge");
            return true;
        }

        @Override // com.just.agentweb.WebChromeClientDelegate, android.webkit.WebChromeClient
        public boolean onShowFileChooser(android.webkit.WebView webView, android.webkit.ValueCallback<android.net.Uri[]> valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
            android.content.Intent intentCreateIntent = fileChooserParams != null ? fileChooserParams.createIntent() : null;
            Function2<android.webkit.ValueCallback<android.net.Uri[]>, android.content.Intent, Unit> function2ZuBGHE = C13241dEa.this.zuBGHE();
            if (function2ZuBGHE == null) {
                return true;
            }
            function2ZuBGHE.invoke(valueCallback, intentCreateIntent);
            return true;
        }

        @Override // com.just.agentweb.WebChromeClientDelegate, android.webkit.WebChromeClient
        public void onGeolocationPermissionsShowPrompt(final java.lang.String str, final GeolocationPermissions.Callback callback) {
            final FragmentActivity fragmentActivity;
            pUU.valueOf(C13241dEa.this.UeEOUB, "onGeolocationPermissionsShowPrompt:");
            WeakReference<FragmentActivity> weakReferenceFetchVPNInfo = C13241dEa.this.fetchVPNInfo();
            if (weakReferenceFetchVPNInfo == null || (fragmentActivity = weakReferenceFetchVPNInfo.get()) == null) {
                return;
            }
            C13241dEa c13241dEa = C13241dEa.this;
            final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(fragmentActivity);
            java.lang.String strAYXKKw = C33070mpX.AYXKKw(dLX.Dialog.wlaJM);
            C14923duc c14923duc = C14923duc.EZpvd;
            java.lang.String url = c13241dEa.getUrl();
            if (url == null) {
                url = "";
            }
            viewOnClickListenerC54939xaY.EZpvd(C33069mpW.OLrzqt(strAYXKKw, C56423yEv.EZpvd(C56390yDp.OLrzqt("url", c14923duc.KWHzl(url)))));
            viewOnClickListenerC54939xaY.EZpvd(dLX.Dialog.AubY, new View.OnClickListener() { // from class: o.dEG
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C13241dEa.Activity.AEQbTJ(fragmentActivity, viewOnClickListenerC54939xaY, callback, str, view);
                }
            });
            viewOnClickListenerC54939xaY.OLrzqt(dLX.Dialog.AuCTelauCTel, new View.OnClickListener() { // from class: o.dEC
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C13241dEa.Activity.KWHzl(callback, str, viewOnClickListenerC54939xaY, view);
                }
            });
            viewOnClickListenerC54939xaY.show();
        }

        public static final void AEQbTJ(FragmentActivity fragmentActivity, ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, GeolocationPermissions.Callback callback, java.lang.String str, android.view.View view) {
            C33625mzw.OLrzqt().copydefault(fragmentActivity, 6, new C0828Activity(callback, str, fragmentActivity));
            viewOnClickListenerC54939xaY.dismiss();
        }

        /* JADX INFO: renamed from: o.dEa$Activity$Activity, reason: collision with other inner class name */
        public static final class C0828Activity implements C33625mzw.Activity {
            public final /* synthetic */ GeolocationPermissions.Callback EZpvd;
            public final /* synthetic */ java.lang.String KWHzl;
            public final /* synthetic */ FragmentActivity copydefault;

            public C0828Activity(GeolocationPermissions.Callback callback, java.lang.String str, FragmentActivity fragmentActivity) {
                this.EZpvd = callback;
                this.KWHzl = str;
                this.copydefault = fragmentActivity;
            }

            @Override // o.C33625mzw.Activity
            public void EZpvd(java.util.List<java.lang.String> list) {
                GeolocationPermissions.Callback callback = this.EZpvd;
                if (callback != null) {
                    callback.invoke(this.KWHzl, false, false);
                }
            }

            @Override // o.C33625mzw.Activity
            public void EZpvd() {
                GeolocationPermissions.Callback callback;
                if (this.copydefault.isFinishing() || this.copydefault.isDestroyed() || (callback = this.EZpvd) == null) {
                    return;
                }
                callback.invoke(this.KWHzl, true, false);
            }
        }

        public static final void KWHzl(GeolocationPermissions.Callback callback, java.lang.String str, ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
            if (callback != null) {
                callback.invoke(str, false, false);
            }
            viewOnClickListenerC54939xaY.dismiss();
        }

        /* JADX WARN: Type inference failed for: r3v14, types: [T, java.lang.String] */
        /* JADX WARN: Type inference failed for: r3v6, types: [T, java.lang.String] */
        @Override // com.just.agentweb.WebChromeClientDelegate, android.webkit.WebChromeClient
        public void onPermissionRequest(android.webkit.PermissionRequest permissionRequest) {
            java.lang.String[] strArr;
            java.lang.String strOLrzqt;
            int i;
            FragmentActivity fragmentActivity;
            java.lang.String[] resources;
            java.lang.String[] resources2;
            java.lang.String str = C13241dEa.this.UeEOUB;
            java.lang.Boolean boolValueOf = null;
            pUU.valueOf(str, "onPermissionRequest: " + C33129mqd.gEmmrt(permissionRequest != null ? permissionRequest.getResources() : null));
            java.lang.Boolean boolValueOf2 = (permissionRequest == null || (resources2 = permissionRequest.getResources()) == null) ? null : java.lang.Boolean.valueOf(yDV.valueOf(resources2, "android.webkit.resource.AUDIO_CAPTURE"));
            if (permissionRequest != null && (resources = permissionRequest.getResources()) != null) {
                boolValueOf = java.lang.Boolean.valueOf(yDV.valueOf(resources, "android.webkit.resource.VIDEO_CAPTURE"));
            }
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            objectRef.element = "";
            java.lang.Boolean bool = java.lang.Boolean.TRUE;
            if (Intrinsics.EZpvd(boolValueOf, bool)) {
                strArr = new java.lang.String[]{"android.permission.CAMERA"};
                java.lang.String strAYXKKw = C33070mpX.AYXKKw(dLX.Dialog.DTwDnp);
                C14923duc c14923duc = C14923duc.EZpvd;
                java.lang.String url = C13241dEa.this.getUrl();
                if (url == null) {
                    url = "";
                }
                strOLrzqt = C33069mpW.OLrzqt(strAYXKKw, C56423yEv.EZpvd(C56390yDp.OLrzqt("name", c14923duc.KWHzl(url))));
                java.lang.String strAYXKKw2 = C33070mpX.AYXKKw(dLX.Dialog.zsXlph);
                java.lang.String url2 = C13241dEa.this.getUrl();
                objectRef.element = C33069mpW.OLrzqt(strAYXKKw2, C56423yEv.EZpvd(C56390yDp.OLrzqt("url", c14923duc.KWHzl(url2 != null ? url2 : ""))));
                i = 123;
            } else if (Intrinsics.EZpvd(boolValueOf2, bool)) {
                strArr = new java.lang.String[]{"android.permission.RECORD_AUDIO"};
                java.lang.String strAYXKKw3 = C33070mpX.AYXKKw(dLX.Dialog.QKVWgx);
                C14923duc c14923duc2 = C14923duc.EZpvd;
                java.lang.String url3 = C13241dEa.this.getUrl();
                if (url3 == null) {
                    url3 = "";
                }
                strOLrzqt = C33069mpW.OLrzqt(strAYXKKw3, C56423yEv.EZpvd(C56390yDp.OLrzqt("name", c14923duc2.KWHzl(url3))));
                java.lang.String strAYXKKw4 = C33070mpX.AYXKKw(dLX.Dialog.sSMYrx);
                java.lang.String url4 = C13241dEa.this.getUrl();
                objectRef.element = C33069mpW.OLrzqt(strAYXKKw4, C56423yEv.EZpvd(C56390yDp.OLrzqt("url", c14923duc2.KWHzl(url4 != null ? url4 : ""))));
                i = 124;
            } else {
                super.onPermissionRequest(permissionRequest);
                return;
            }
            java.lang.String[] strArr2 = strArr;
            java.lang.String str2 = strOLrzqt;
            int i2 = i;
            WeakReference<FragmentActivity> weakReferenceFetchVPNInfo = C13241dEa.this.fetchVPNInfo();
            if (weakReferenceFetchVPNInfo == null || (fragmentActivity = weakReferenceFetchVPNInfo.get()) == null) {
                return;
            }
            C33625mzw.OLrzqt().EZpvd(fragmentActivity, strArr2, str2, i2, new Application(fragmentActivity, objectRef, permissionRequest));
        }

        /* JADX INFO: renamed from: o.dEa$Activity$Application */
        public static final class Application implements C33625mzw.Activity {
            public final /* synthetic */ android.webkit.PermissionRequest KWHzl;
            public final /* synthetic */ Ref.ObjectRef<java.lang.String> OLrzqt;
            public final /* synthetic */ FragmentActivity copydefault;

            public Application(FragmentActivity fragmentActivity, Ref.ObjectRef<java.lang.String> objectRef, android.webkit.PermissionRequest permissionRequest) {
                this.copydefault = fragmentActivity;
                this.OLrzqt = objectRef;
                this.KWHzl = permissionRequest;
            }

            @Override // o.C33625mzw.Activity
            public void EZpvd() {
                if (this.copydefault.isFinishing() || this.copydefault.isDestroyed()) {
                    return;
                }
                final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(this.copydefault);
                viewOnClickListenerC54939xaY.EZpvd(this.OLrzqt.element);
                int i = dLX.Dialog.AubY;
                final android.webkit.PermissionRequest permissionRequest = this.KWHzl;
                viewOnClickListenerC54939xaY.EZpvd(i, new View.OnClickListener() { // from class: o.dED
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // android.view.View.OnClickListener
                    public final void onClick(android.view.View view) {
                        C13241dEa.Activity.Application.OLrzqt(permissionRequest, viewOnClickListenerC54939xaY, view);
                    }
                });
                int i2 = dLX.Dialog.AuCTelauCTel;
                final android.webkit.PermissionRequest permissionRequest2 = this.KWHzl;
                viewOnClickListenerC54939xaY.OLrzqt(i2, new View.OnClickListener() { // from class: o.dEK
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // android.view.View.OnClickListener
                    public final void onClick(android.view.View view) {
                        C13241dEa.Activity.Application.EZpvd(permissionRequest2, viewOnClickListenerC54939xaY, view);
                    }
                });
                viewOnClickListenerC54939xaY.show();
            }

            public static final void OLrzqt(android.webkit.PermissionRequest permissionRequest, ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
                permissionRequest.grant(permissionRequest.getResources());
                viewOnClickListenerC54939xaY.dismiss();
            }

            public static final void EZpvd(android.webkit.PermissionRequest permissionRequest, ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
                permissionRequest.deny();
                viewOnClickListenerC54939xaY.dismiss();
            }

            @Override // o.C33625mzw.Activity
            public void EZpvd(java.util.List<java.lang.String> list) {
                this.KWHzl.deny();
            }
        }
    }

    public final void iRxXKY() {
        evaluateJavascript("window.okxwallet.pauseBackgroundTasks()", null);
    }

    public final void iZzfmt() {
        evaluateJavascript("window.okxwallet.resumeBackgroundTasks()", null);
    }

    @Override // android.webkit.WebView, android.view.View
    public void onVisibilityChanged(@NotNull android.view.View view, int i) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onVisibilityChanged(view, i);
        if (i != 0) {
            iRxXKY();
        } else {
            iZzfmt();
        }
    }
}
