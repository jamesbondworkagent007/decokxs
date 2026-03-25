package o;

import android.graphics.Bitmap;
import androidx.fragment.app.FragmentActivity;
import com.amplifyframework.core.model.ModelIdentifier;
import com.okinc.business.defi.dapp.webview.DappTabData;
import com.okinc.business.defi.dapp.webview.LruMap;
import com.okinc.business.defi.wallet.mine.search.data.model.WalletSearchRequest;
import com.okinc.components.track.bean.EventParam;
import com.okinc.rxutils.RxBus;
import com.okinc.wallet.core.javascript.WalletJsBridge;
import com.reown.foundation.util.jwt.JwtUtilsKt;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.random.Random;
import kotlin.text.Charsets;
import kotlin.text.StringsKt__StringsKt;
import o.AbstractC48864udi;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class dDN {
    public static java.lang.String AEQbTJ;
    public static final InterfaceC56387yDm AhwBna;
    public static java.lang.String AkhnZx;
    public static int AuCTel;
    public static kotlin.Pair<java.lang.String, java.lang.String> DbNXlk;
    public static java.lang.String EZpvd;
    public static final int KWHzl;
    public static final java.lang.String OLrzqt;
    public static java.lang.String djBIcL;
    public static kotlin.Pair<java.lang.String, java.lang.String> ejfBZ;
    public static java.lang.String fARcdN;
    public static java.lang.String fIwbmz;
    public static java.lang.String fetchVPNInfo;
    public static java.lang.String gEmmrt;
    public static java.lang.String isConnected;
    public static int uzCIH;
    public static int valueOf;
    public static java.lang.String values;
    public static final dDN copydefault = new dDN();
    public static final java.lang.String AYXKKw = dBW.Companion.EZpvd("tron", "https://api.trongrid.io");
    public static final LruMap<DappTabData, java.lang.Integer> fJNWhG = new LruMap<>(5);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LruMap<DappTabData, java.lang.Integer> AhwBna() {
        return fJNWhG;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final kotlin.Pair<java.lang.String, java.lang.String> EZpvd() {
        return DbNXlk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final kotlin.Pair<java.lang.String, java.lang.String> copydefault() {
        return ejfBZ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String djBIcL() {
        return OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String valueOf() {
        return "\n        (function() {\n        console.log(\"init solana =========\");\n        window.solana = new _solana.wallet({isDebug: true, autoApprove: true, isSVM:false });\n        window.svm = new _solana.wallet({isDebug: true, autoApprove: true, isSVM:true });\n        if (window.okxwallet) {\n            window.okxwallet.solana = window.solana;\n            window.okxwallet.svm = window.svm;\n        }\n        _solana.postMessage = (jsonString) => {\n            console.log(\"----\");\n            console.log(jsonString);\n            window._solana_.postMessage(JSON.stringify(jsonString));\n            }\n        })();\n        ";
    }

    private dDN() {
    }

    static {
        C32979mnm c32979mnm = C32979mnm.EZpvd;
        OLrzqt = c32979mnm.OLrzqt().getFilesDir() + "/discover/webview_images/";
        C33566myq c33566myq = C33566myq.EZpvd;
        valueOf = c33566myq.OLrzqt(c32979mnm.OLrzqt());
        uzCIH = c33566myq.EZpvd(c32979mnm.OLrzqt());
        DbNXlk = new kotlin.Pair<>("OKX Wallet", "sui");
        ejfBZ = new kotlin.Pair<>("Suiet", "suiet");
        AhwBna = C56392yDr.copydefault(new Function0() { // from class: o.dDR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return java.lang.Long.valueOf(dDN.KWHzl());
            }
        });
        KWHzl = 8;
    }

    public static final long KWHzl() {
        C43246rlf c43246rlf = C43246rlf.OLrzqt;
        return c43246rlf.valueOf().getPackageManager().getPackageInfo(c43246rlf.valueOf().getPackageName(), 0).lastUpdateTime;
    }

    public final java.lang.String KWHzl(@NotNull java.io.InputStream inputStream) throws java.lang.Throwable {
        java.io.BufferedReader bufferedReader;
        Intrinsics.checkNotNullParameter(inputStream, "");
        java.io.BufferedReader bufferedReader2 = null;
        try {
            java.io.Reader inputStreamReader = new java.io.InputStreamReader(inputStream, Charsets.UTF_8);
            bufferedReader = inputStreamReader instanceof java.io.BufferedReader ? (java.io.BufferedReader) inputStreamReader : new java.io.BufferedReader(inputStreamReader, 8192);
        } catch (java.lang.Exception unused) {
            bufferedReader = null;
        } catch (java.lang.Throwable th) {
            th = th;
        }
        try {
            java.lang.String strAEQbTJ = yFK.AEQbTJ(bufferedReader);
            try {
                bufferedReader.close();
            } catch (java.lang.Exception unused2) {
            }
            return strAEQbTJ;
        } catch (java.lang.Exception unused3) {
            if (bufferedReader != null) {
                try {
                    bufferedReader.close();
                } catch (java.lang.Exception unused4) {
                }
            }
            return null;
        } catch (java.lang.Throwable th2) {
            th = th2;
            bufferedReader2 = bufferedReader;
            if (bufferedReader2 != null) {
                try {
                    bufferedReader2.close();
                } catch (java.lang.Exception unused5) {
                }
            }
            throw th;
        }
    }

    public final java.lang.String AEQbTJ(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        if (AkhnZx == null) {
            AkhnZx = WalletJsBridge.AEQbTJ.copydefault(java.lang.Boolean.TRUE);
        }
        java.lang.String str = AkhnZx;
        return str == null ? "" : str;
    }

    public static final void EZpvd(Function2 function2, java.lang.Object obj, java.lang.Object obj2) {
        function2.invoke(obj, obj2);
    }

    public final void OLrzqt() {
        LruMap<DappTabData, java.lang.Integer> lruMap = fJNWhG;
        final Function2 function2 = new Function2() { // from class: o.dDS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return dDN.EZpvd((DappTabData) obj, (java.lang.Integer) obj2);
            }
        };
        lruMap.forEach(new java.util.function.BiConsumer() { // from class: o.dDO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.util.function.BiConsumer
            public final void accept(java.lang.Object obj, java.lang.Object obj2) {
                dDN.EZpvd(function2, obj, obj2);
            }
        });
        lruMap.clear();
    }

    public static final Unit EZpvd(DappTabData dappTabData, java.lang.Integer num) {
        Intrinsics.checkNotNullParameter(dappTabData, "");
        Intrinsics.checkNotNullParameter(num, "");
        C13241dEa mWebView = dappTabData.getMWebView();
        if (mWebView != null) {
            mWebView.KWHzl();
        }
        dappTabData.setMWebView(null);
        dappTabData.setLoaded(false);
        dappTabData.setHasError(false);
        return Unit.INSTANCE;
    }

    public final java.lang.String AEQbTJ(java.lang.String str, java.lang.String str2) throws java.lang.Throwable {
        java.lang.String strKWHzl = null;
        try {
            java.lang.String strAEQbTJ = C48872udq.AEQbTJ.AEQbTJ(str);
            if (C33129mqd.OLrzqt((java.lang.CharSequence) strAEQbTJ)) {
                java.io.File file = new java.io.File(strAEQbTJ);
                if (file.exists() && file.isDirectory() && file.listFiles() != null) {
                    java.io.File[] fileArrListFiles = file.listFiles();
                    Intrinsics.checkNotNullExpressionValue(fileArrListFiles, "");
                    if (!(fileArrListFiles.length == 0)) {
                        java.io.File file2 = file.listFiles()[0];
                        java.lang.String name = file2.getName();
                        Intrinsics.checkNotNullExpressionValue(name, "");
                        if (C59449zhJ.endsWith$default(name, ".js", false, 2, null)) {
                            strKWHzl = KWHzl(new java.io.FileInputStream(file2));
                        }
                    }
                }
            }
        } catch (java.lang.Exception e) {
            e.getMessage();
        }
        if (strKWHzl == null) {
            pUU.valueOf("dappwebview", "start request download " + str);
            C32866mlf.OLrzqt("DiscoverBrowser_JS_Missing", C56402yEa.EZpvd(new EventParam("jsname", str, false)));
            C48872udq.AEQbTJ.OLrzqt(str, new Application(str));
        }
        return strKWHzl;
    }

    public static final class Application implements AbstractC48864udi.ActionBar {
        public final /* synthetic */ java.lang.String AEQbTJ;

        public Application(java.lang.String str) {
            this.AEQbTJ = str;
        }

        @Override // o.AbstractC48864udi.ActionBar
        public void AEQbTJ(long j, long j2) {
            AbstractC48864udi.ActionBar.C0977ActionBar.OLrzqt(this, j, j2);
        }

        @Override // o.AbstractC48864udi.ActionBar
        public void EZpvd(java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            pUU.valueOf("dappwebview", "request download " + this.AEQbTJ + " success");
            C32866mlf.OLrzqt("DiscoverBrowser_JS_Success", C56402yEa.EZpvd(new EventParam("jsname", this.AEQbTJ, false)));
        }

        @Override // o.AbstractC48864udi.ActionBar
        public void OLrzqt(java.lang.Throwable th) {
            Intrinsics.checkNotNullParameter(th, "");
            AbstractC48864udi.ActionBar.C0977ActionBar.copydefault(this, th);
            pUU.copydefault("dappwebview", "request download " + this.AEQbTJ + " failed-" + th.getMessage());
            EventParam[] eventParamArr = new EventParam[2];
            eventParamArr[0] = new EventParam("jsname", this.AEQbTJ, false);
            java.lang.String message = th.getMessage();
            eventParamArr[1] = new EventParam("res", message != null ? message : "", false);
            C32866mlf.OLrzqt("DiscoverBrowser_JS_FailedRes", yDY.gEmmrt(eventParamArr));
        }
    }

    public final java.lang.String valueOf(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        if (fetchVPNInfo == null) {
            fetchVPNInfo = WalletJsBridge.AEQbTJ.KWHzl(java.lang.Boolean.TRUE);
        }
        java.lang.String str = fetchVPNInfo;
        return str == null ? "" : str;
    }

    public final java.lang.String AhwBna(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        if (fIwbmz == null) {
            fIwbmz = AEQbTJ("file_discover_tron_js2", "tron_min.js");
        }
        java.lang.String str = fIwbmz;
        return str == null ? "" : str;
    }

    public final java.lang.String KWHzl(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        if (EZpvd == null) {
            EZpvd = AEQbTJ("file_discover_aptos_js2", "aptos_min.js");
        }
        java.lang.String str = EZpvd;
        return str == null ? "" : str;
    }

    public final java.lang.String EZpvd(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        if (AEQbTJ == null) {
            AEQbTJ = AEQbTJ("file_discover_btc_js3", "btc_min.js");
        }
        java.lang.String str = AEQbTJ;
        return str == null ? "" : str;
    }

    public final java.lang.String djBIcL(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        if (values == null) {
            values = AEQbTJ("file_discover_sui_js2", "sui_min.js");
        }
        java.lang.String str = values;
        return str == null ? "" : str;
    }

    public final java.lang.String OLrzqt(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        if (gEmmrt == null) {
            gEmmrt = AEQbTJ("file_discover_cosmos_js2", "cosmos_min.js");
        }
        java.lang.String str = gEmmrt;
        return str == null ? "" : str;
    }

    public final java.lang.String AYXKKw(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        if (isConnected == null) {
            isConnected = AEQbTJ("file_discover_starknet_js2", "starknet_min.js");
        }
        java.lang.String str = isConnected;
        return str == null ? "" : str;
    }

    public final java.lang.String AYXKKw() {
        if (fARcdN == null) {
            fARcdN = WalletJsBridge.AEQbTJ.OLrzqt(java.lang.Boolean.TRUE);
        }
        java.lang.String str = fARcdN;
        return str == null ? "" : str;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.String copydefault(@NotNull android.content.Context context) {
        java.io.InputStream inputStreamOpen;
        byte[] bArr;
        java.io.ByteArrayOutputStream byteArrayOutputStream;
        Intrinsics.checkNotNullParameter(context, "");
        java.lang.String str = djBIcL;
        if (str != null) {
            Intrinsics.copydefault((java.lang.Object) str);
            return str;
        }
        try {
            inputStreamOpen = context.getAssets().open("vconsole.min.js");
            Intrinsics.checkNotNullExpressionValue(inputStreamOpen, "");
            bArr = new byte[1024];
            byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        } catch (java.io.IOException e) {
            android.util.Log.getStackTraceString(e);
        }
        while (true) {
            int i = inputStreamOpen.read(bArr);
            if (i <= 0) {
                break;
            }
            byteArrayOutputStream.write(bArr, 0, i);
            java.lang.String str2 = djBIcL;
            return str2 != null ? "" : str2;
        }
        djBIcL = byteArrayOutputStream.toString();
        inputStreamOpen.close();
        byteArrayOutputStream.close();
        java.lang.String str22 = djBIcL;
        if (str22 != null) {
        }
    }

    public final java.lang.String KWHzl(long j, @NotNull java.lang.String str, java.lang.String str2) {
        java.lang.Object next;
        Intrinsics.checkNotNullParameter(str, "");
        java.util.Iterator<T> it = ((InterfaceC9852bdR) C43248rlh.KWHzl.AEQbTJ(InterfaceC9852bdR.class)).copydefault().KWHzl(true).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((InterfaceC9731bbC) next).fetchVPNInfo() == j) {
                break;
            }
        }
        if (next == null) {
            j = 1;
        }
        java.lang.String strValueOf = C34703nhO.valueOf(C32979mnm.EZpvd.OLrzqt());
        DappTabData dappTabDataOLrzqt = C15112dyF.AEQbTJ.OLrzqt();
        return "\n        (function() {\n            var config = {\n                chainId: " + j + ",\n                rpcUrl: \"" + str + "\",\n                isDebug: true,\n                address: \"" + str2 + "\",\n                appVersion:\"" + strValueOf + "\",\n                pcMode:" + (dappTabDataOLrzqt != null && 1 == dappTabDataOLrzqt.getWebViewUiMode()) + "\n            };\n            \n            if (window.okxwallet) {\n                window.okxwallet.setConfig(config);\n            }\n        })();\n        ";
    }

    public final java.lang.String copydefault(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return "\n           (function() {\n        var config = {\n            chainId: '1',\n            network: 'Mainnet',\n            address: \"" + str + "\",\n            isDebug: true,\n            appVersion:\"" + C34703nhO.valueOf(C32979mnm.EZpvd.OLrzqt()) + "\"\n        };\n        window.aptos = new okwallet.aptosProvider(config);\n        if (window.okxwallet) {\n            window.okxwallet.aptos = window.aptos;\n        }\n        window.martian = window.aptos;\n        window.pontem = window.aptos;\n        okwallet.postMessage = (jsonString) => {\n            window._aptos_.postMessage(JSON.stringify(jsonString));\n        }\n    })();\n            ";
    }

    public final java.lang.String KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return "\n           (function() {\n        var config = {\n            isDebug: true,\n            appVersion:\"" + C34703nhO.valueOf(C32979mnm.EZpvd.OLrzqt()) + "\"\n        };\n        okxCosInternalProvider.postMessage = (json) => {\n            window.okxOsmosJSBridge.postMessage(JSON.stringify(json));\n        }\n        window.keplr = new okxCosInternalProvider.cosmosProvider(config);\n        window.compass = window.keplr;\n        window.leap = window.keplr;\n        if (window.okxwallet) {\n            window.okxwallet.keplr = window.keplr;\n            window.okxwallet.compass = window.compass;\n        }\n    })();\n            ";
    }

    public final java.lang.String EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return "\n           (function() {\n        OKXStarkProvider.postMessage = (json) => {\n            window.okxStarkJSBridge.postMessage(JSON.stringify(json));\n        }\n        if (window.okxwallet) {\n            window.okxwallet.starknet = window.starknet;\n        }\n        if (window.starknet) {\n            window.starknet.appVersion = \"" + C34703nhO.valueOf(C32979mnm.EZpvd.OLrzqt()) + "\"\n        }\n    })();\n            ";
    }

    public final java.lang.String EZpvd(java.lang.String str, java.lang.String str2, @NotNull kotlin.Pair<java.lang.String, java.lang.String> pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        return "\n        (function() {\n            console.log(\"init sui =========\");\n            var config = {\n                chain: \"" + dBW.Companion.AEQbTJ() + "\",\n                address: \"" + str + "\",\n                publicKey: \"" + str2 + "\",\n                isDebug: true,\n                appVersion:\"" + C34703nhO.valueOf(C32979mnm.EZpvd.OLrzqt()) + "\"\n            };\n            const wallet = new OKXSuiProvider.Provider('" + ((java.lang.Object) pair.getFirst()) + "');\n            wallet.setConfig(config);\n            OKXSuiProvider.registerWallet(wallet);\n            if (window.okxwallet) {\n                window.okxwallet." + ((java.lang.Object) pair.getSecond()) + " = wallet;\n            }\n            \n            window.okx" + ((java.lang.Object) pair.getSecond()) + " = wallet;\n            OKXSuiProvider.postMessage = (jsonString) => {\n                console.log(\"postMessage sui ========= jsonString\");\n                window._okx_sui_.postMessage(JSON.stringify(jsonString));\n            };\n        })();\n        ";
    }

    public final java.lang.String gEmmrt() {
        return "\n        (function() {\n            console.log(\"init tron=========\");\n            if (window.okxwallet) {\n                window.okxwallet.tronWeb = window.tronWeb;\n                window.okxwallet.tronLink = window.tronLink;\n            }\n           \n            window.tronLink.postMessage = function (json) {\n                window.tron.postMessage(JSON.stringify(json));\n            }\n            window.tronLink.tronWeb = window.tronWeb;\n            window.tronWeb.triggerRequest();\n            if (window.tronWeb) {\n                window.tronWeb.appVersion = \"" + C34703nhO.valueOf(C32979mnm.EZpvd.OLrzqt()) + "\";\n            }\n            console.log(\"init tron========= end\");\n        })()\n        ";
    }

    public final java.lang.String EZpvd(@NotNull InterfaceC9738bbJ interfaceC9738bbJ, long j) {
        Intrinsics.checkNotNullParameter(interfaceC9738bbJ, "");
        dDW ddw = dDW.copydefault;
        java.lang.String strEZpvd = interfaceC9738bbJ.EZpvd(j);
        java.util.Map<java.lang.String, java.lang.String> mapAEQbTJ = ddw.AEQbTJ(interfaceC9738bbJ, strEZpvd != null ? strEZpvd : "", j);
        return "\n        (function() {\n            var config = {\n                address: \"" + ((java.lang.Object) mapAEQbTJ.get(WalletSearchRequest.SEARCH_SOURCE_ADDRESS)) + "\",\n                publicKey: \"" + ((java.lang.Object) mapAEQbTJ.get("publicKey")) + "\",\n                compressedPublicKey: \"" + ((java.lang.Object) mapAEQbTJ.get("compressedPublicKey")) + "\",\n                addressType: \"" + ((java.lang.Object) mapAEQbTJ.get("addressType")) + "\",\n                walletType: \"" + ((java.lang.Object) mapAEQbTJ.get("walletType")) + "\"\n            };\n            if (window.bitcoin) {\n                window.bitcoin.setConfig(config);\n            }\n            if (window.fractalBitcoin) {\n                window.fractalBitcoin.setConfig(config);\n            }\n        })();\n        ";
    }

    /* JADX DEBUG: Multi-variable search result rejected for r12v7, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r2v9, resolved type: T */
    /* JADX DEBUG: TODO: convert one arg to string using `String.valueOf()`, args: r12v9, r0v6 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [T, o.yxC] */
    /* JADX WARN: Type inference failed for: r12v10, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r12v3, types: [T, java.lang.String] */
    public final java.lang.String KWHzl(android.webkit.WebView webView, java.lang.String str) {
        java.lang.String str2 = OLrzqt;
        if (str == null) {
            str = "";
        }
        java.io.File file = new java.io.File(str2, str);
        if (file.exists()) {
            file.delete();
        }
        if (webView != null) {
            int measuredWidth = webView.getMeasuredWidth();
            float f = measuredWidth;
            float f2 = uzCIH;
            int i = (int) (((f / f2) * valueOf) + 0.5f);
            if (measuredWidth > 0 && i > 0) {
                float f3 = f2 / f;
                int scrollY = (int) ((webView.getScrollY() * f3) + 0.5f);
                int scrollX = (int) ((webView.getScrollX() * f3) + 0.5f);
                final android.graphics.Bitmap bitmapCreateBitmap = android.graphics.Bitmap.createBitmap(uzCIH, valueOf, Bitmap.Config.RGB_565);
                Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "");
                android.graphics.Canvas canvas = new android.graphics.Canvas(bitmapCreateBitmap);
                canvas.translate(-scrollX, -scrollY);
                canvas.clipRect(scrollX, scrollY, uzCIH + scrollX, valueOf + scrollY);
                canvas.scale(f3, f3, 0.0f, 0.0f);
                webView.draw(canvas);
                final Ref.ObjectRef objectRef = new Ref.ObjectRef();
                C14923duc c14923duc = C14923duc.EZpvd;
                java.lang.String url = webView.getUrl();
                java.lang.String strReplace$default = C59449zhJ.replace$default(c14923duc.KWHzl(url != null ? url : ""), JwtUtilsKt.JWT_DELIMITER, "", false, 4, (java.lang.Object) null);
                Random.Default r1 = kotlin.random.Random.Default;
                objectRef.element = strReplace$default + r1.nextInt();
                if (new java.io.File(str2, (java.lang.String) objectRef.element).exists()) {
                    java.lang.Object obj = objectRef.element;
                    int iNextInt = r1.nextInt();
                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                    sb.append(obj);
                    sb.append(iNextInt);
                    objectRef.element = sb.toString();
                }
                final Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
                AbstractC58185ywX abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(1).KWHzl(yBP.AEQbTJ());
                final Function1 function1 = new Function1() { // from class: o.dDQ
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return dDN.OLrzqt(objectRef, bitmapCreateBitmap, objectRef2, (java.lang.Integer) obj2);
                    }
                };
                objectRef2.element = abstractC58185ywXKWHzl.AEQbTJ(new InterfaceC58227yxM() { // from class: o.dDP
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.InterfaceC58227yxM
                    public final void accept(java.lang.Object obj2) {
                        dDN.copydefault(function1, obj2);
                    }
                });
                return (java.lang.String) objectRef.element;
            }
        }
        return "";
    }

    public static final void copydefault(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit OLrzqt(Ref.ObjectRef objectRef, android.graphics.Bitmap bitmap, Ref.ObjectRef objectRef2, java.lang.Integer num) {
        copydefault.AEQbTJ((java.lang.String) objectRef.element, bitmap);
        InterfaceC58217yxC interfaceC58217yxC = (InterfaceC58217yxC) objectRef2.element;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
        return Unit.INSTANCE;
    }

    public final void AEQbTJ(final C13241dEa c13241dEa, @NotNull final Function1<? super java.lang.String, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        if (c13241dEa != null) {
            try {
                c13241dEa.evaluateJavascript("window.location.href", new android.webkit.ValueCallback() { // from class: o.dDL
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // android.webkit.ValueCallback
                    public final void onReceiveValue(java.lang.Object obj) {
                        dDN.copydefault(c13241dEa, function1, (java.lang.String) obj);
                    }
                });
                return;
            } catch (java.lang.Exception unused) {
                function1.invoke(c13241dEa.getUrl());
                return;
            }
        }
        function1.invoke("");
    }

    public static final void copydefault(C13241dEa c13241dEa, Function1 function1, java.lang.String str) {
        java.lang.String strValueOf = str != null ? StringsKt__StringsKt.valueOf(str, (java.lang.CharSequence) ModelIdentifier.Helper.PRIMARY_KEY_ENCAPSULATE_CHAR) : null;
        c13241dEa.setJsTriggerUrl(strValueOf);
        if (str == null || str.length() == 0) {
            strValueOf = c13241dEa.getUrl();
        }
        function1.invoke(strValueOf);
    }

    public final java.lang.String AEQbTJ(java.lang.String str, android.graphics.Bitmap bitmap) {
        java.io.File file = new java.io.File(OLrzqt);
        if (!file.exists()) {
            file.mkdirs();
        }
        java.io.File file2 = new java.io.File(file, str);
        try {
            java.io.FileOutputStream fileOutputStream = new java.io.FileOutputStream(file2);
            bitmap.compress(Bitmap.CompressFormat.JPEG, 80, fileOutputStream);
            fileOutputStream.flush();
            fileOutputStream.close();
            RxBus.AEQbTJ(new ActionBar(str));
            java.lang.String name = file2.getName();
            Intrinsics.copydefault((java.lang.Object) name);
            return name;
        } catch (java.lang.Exception unused) {
            return "";
        }
    }

    public static final class ActionBar implements RxBus.Application {
        public final java.lang.String EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String KWHzl() {
            return this.EZpvd;
        }

        @Override // com.okinc.rxutils.RxBus.Application
        public boolean check(java.lang.String str) {
            return true;
        }

        public ActionBar(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.EZpvd = str;
        }
    }

    public final void KWHzl(DappTabData dappTabData) {
        if (dappTabData != null) {
            LruMap<DappTabData, java.lang.Integer> lruMap = fJNWhG;
            int i = AuCTel;
            AuCTel = i + 1;
            lruMap.put(dappTabData, java.lang.Integer.valueOf(i));
        }
    }

    public final C13241dEa copydefault(DappTabData dappTabData, @NotNull java.lang.String str, @NotNull WeakReference<FragmentActivity> weakReference, @NotNull dES des) {
        java.lang.String mUrl;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(weakReference, "");
        Intrinsics.checkNotNullParameter(des, "");
        boolean zAEQbTJ = C35202nqq.OLrzqt.AEQbTJ("security_discover_webview_gyroscope_permission");
        LruMap<DappTabData, java.lang.Integer> lruMap = fJNWhG;
        if (lruMap.size() >= 5 && lruMap.getFirstKey() != null) {
            DappTabData firstKey = lruMap.getFirstKey();
            Intrinsics.copydefault(firstKey, "");
            DappTabData dappTabData2 = firstKey;
            if (dappTabData2.getMWebView() != null) {
                dappTabData2.setLoaded(false);
                C13241dEa mWebView = dappTabData2.getMWebView();
                if (mWebView != null) {
                    mWebView.KWHzl();
                }
                dappTabData2.setErrorView(null);
                dappTabData2.setMWebView(null);
                dappTabData2.setCurrentWallet(null);
                dappTabData2.setCurrentAddress("");
            }
        }
        long defaultChain$default = C14923duc.getDefaultChain$default(C14923duc.EZpvd, (dappTabData == null || (mUrl = dappTabData.getMUrl()) == null) ? "" : mUrl, dappTabData != null ? dappTabData.getMChainList() : null, null, 4, null);
        if (dappTabData != null) {
            DappTabData.setCurrentChain$default(dappTabData, defaultChain$default, null, 2, null);
        }
        return new C13241dEa(C32979mnm.EZpvd.OLrzqt(), null, zAEQbTJ, defaultChain$default, dBW.Companion.EZpvd(DappTabData.Companion.copydefault(defaultChain$default) + "_rpc_dapp2", C15152dyt.EZpvd.KWHzl(defaultChain$default)), str, weakReference, new WeakReference(des));
    }
}
