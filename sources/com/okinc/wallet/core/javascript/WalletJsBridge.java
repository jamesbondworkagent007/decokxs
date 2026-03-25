package com.okinc.wallet.core.javascript;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.ConsoleMessage;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import androidx.work.WorkRequest;
import com.amplifyframework.core.model.ModelIdentifier;
import com.okinc.wallet.core.javascript.WalletJsBridge;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import o.C33129mqd;
import o.C43246rlf;
import o.C48787ucK;
import o.C48872udq;
import o.C54819xWm;
import o.C54877xYq;
import o.C56392yDr;
import o.C56444yFp;
import o.C59449zhJ;
import o.InterfaceC56387yDm;
import o.InterfaceC56445yFq;
import o.pUU;
import o.xXU;
import o.yFK;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class WalletJsBridge {
    public static String AYXKKw;
    public static String AhwBna;
    public static String EZpvd;
    public static String KWHzl;
    public static String djBIcL;
    public static final WalletJsBridge AEQbTJ = new WalletJsBridge();
    public static final ArrayList<WebView> valueOf = new ArrayList<>();
    public static final InterfaceC56387yDm OLrzqt = C56392yDr.copydefault(new Function0() { // from class: o.xYz
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return java.lang.Long.valueOf(WalletJsBridge.EZpvd());
        }
    });
    public static final int copydefault = 8;

    public final /* synthetic */ class ActionBar {
        public static final /* synthetic */ int[] AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[JSTYPE_ENUM.values().length];
            try {
                iArr[JSTYPE_ENUM.EVM_TYPE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[JSTYPE_ENUM.SOLANA_TYPE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[JSTYPE_ENUM.EVM_PROVIDER_TYPE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[JSTYPE_ENUM.TON_TYPE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[JSTYPE_ENUM.SOLANA_PROVIDER_TYPE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            AEQbTJ = iArr;
        }
    }

    public static final void OLrzqt(String str) {
    }

    private WalletJsBridge() {
    }

    public final void copydefault(@NotNull android.app.Application application, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull ValueCallback<String> valueCallback) {
        Intrinsics.checkNotNullParameter(application, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(valueCallback, "");
        if (OLrzqt() == null) {
            valueCallback.onReceiveValue("");
            return;
        }
        String str4 = "\n                okEncodeAbi(" + str3 + ", '" + str + "', " + str2 + ");\n                ";
        String strOLrzqt = OLrzqt();
        Intrinsics.copydefault((Object) strOLrzqt);
        KWHzl(application, strOLrzqt, str4, valueCallback);
    }

    public final void KWHzl(@NotNull final android.app.Application application, @NotNull final String str, @NotNull final String str2, final ValueCallback<String> valueCallback) {
        Intrinsics.checkNotNullParameter(application, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        if (Intrinsics.EZpvd(Looper.getMainLooper(), Looper.myLooper())) {
            AYXKKw(application, str, str2, valueCallback);
        } else {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: o.xYy
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    WalletJsBridge.OLrzqt(application, str, str2, valueCallback);
                }
            });
        }
    }

    public static final void OLrzqt(android.app.Application application, String str, String str2, ValueCallback valueCallback) {
        AEQbTJ.AYXKKw(application, str, str2, valueCallback);
    }

    public final void AhwBna(@NotNull final android.app.Application application, @NotNull final String str, @NotNull final String str2, final ValueCallback<String> valueCallback) {
        Intrinsics.checkNotNullParameter(application, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        if (Intrinsics.EZpvd(Looper.getMainLooper(), Looper.myLooper())) {
            djBIcL(application, str, str2, valueCallback);
        } else {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: o.xYC
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    WalletJsBridge.copydefault(application, str, str2, valueCallback);
                }
            });
        }
    }

    public static final void copydefault(android.app.Application application, String str, String str2, ValueCallback valueCallback) {
        AEQbTJ.djBIcL(application, str, str2, valueCallback);
    }

    public final void djBIcL(android.app.Application application, String str, final String str2, final ValueCallback<String> valueCallback) {
        try {
            final WebView webView = new WebView(application);
            valueOf.add(webView);
            new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: o.xYE
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    WalletJsBridge.KWHzl(webView, valueCallback);
                }
            }, 30000L);
            webView.getSettings().setJavaScriptEnabled(true);
            webView.setWebChromeClient(new Application(str2));
            webView.addJavascriptInterface(new C54877xYq(new WeakReference(C54819xWm.KWHzl().AEQbTJ()), webView, new ValueCallback() { // from class: o.xYB
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.webkit.ValueCallback
                public final void onReceiveValue(java.lang.Object obj) {
                    WalletJsBridge.KWHzl(webView, valueCallback, (java.lang.String) obj);
                }
            }), "solanaBridge");
            webView.evaluateJavascript(str, new ValueCallback() { // from class: o.xYA
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.webkit.ValueCallback
                public final void onReceiveValue(java.lang.Object obj) {
                    WalletJsBridge.copydefault(str2, webView, (java.lang.String) obj);
                }
            });
        } catch (Throwable th) {
            pUU.AEQbTJ("WalletJsBridge", "Failed to create WebView in runSolanaScriptAsyncInner", th);
            if (valueCallback != null) {
                valueCallback.onReceiveValue("");
            }
        }
    }

    public static final void KWHzl(WebView webView, ValueCallback valueCallback) {
        ArrayList<WebView> arrayList = valueOf;
        if (arrayList.contains(webView)) {
            webView.removeJavascriptInterface("solanaBridge");
            if (valueCallback != null) {
                valueCallback.onReceiveValue("{\"code\":-1}");
            }
            arrayList.remove(webView);
        }
    }

    public static final class Application extends WebChromeClient {
        public final /* synthetic */ String copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.webkit.WebChromeClient
        public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
            Intrinsics.checkNotNullParameter(consoleMessage, "");
            return false;
        }

        public Application(String str) {
            this.copydefault = str;
        }
    }

    public static final void KWHzl(WebView webView, ValueCallback valueCallback, String str) {
        ArrayList<WebView> arrayList = valueOf;
        if (arrayList.contains(webView)) {
            webView.removeJavascriptInterface("solanaBridge");
            if (valueCallback != null) {
                valueCallback.onReceiveValue(str);
            }
            arrayList.remove(webView);
        }
    }

    public static final void copydefault(String str, WebView webView, String str2) {
        webView.evaluateJavascript(str, new ValueCallback() { // from class: o.xYH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.webkit.ValueCallback
            public final void onReceiveValue(java.lang.Object obj) {
                WalletJsBridge.OLrzqt((java.lang.String) obj);
            }
        });
    }

    public final void AYXKKw(android.app.Application application, String str, final String str2, final ValueCallback<String> valueCallback) {
        try {
            final WebView webView = new WebView(application);
            valueOf.add(webView);
            new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: o.xYD
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    WalletJsBridge.OLrzqt(webView);
                }
            }, WorkRequest.MIN_BACKOFF_MILLIS);
            webView.getSettings().setJavaScriptEnabled(true);
            webView.setWebChromeClient(new StateListAnimator(str2));
            webView.evaluateJavascript(str, new ValueCallback() { // from class: o.xYG
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.webkit.ValueCallback
                public final void onReceiveValue(java.lang.Object obj) {
                    WalletJsBridge.OLrzqt(str2, webView, valueCallback, (java.lang.String) obj);
                }
            });
        } catch (Throwable th) {
            pUU.AEQbTJ("WalletJsBridge", "Failed to create WebView in runScriptInner", th);
            if (valueCallback != null) {
                valueCallback.onReceiveValue("");
            }
        }
    }

    public static final void OLrzqt(WebView webView) {
        valueOf.remove(webView);
    }

    public static final class StateListAnimator extends WebChromeClient {
        public final /* synthetic */ String AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.webkit.WebChromeClient
        public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
            Intrinsics.checkNotNullParameter(consoleMessage, "");
            return false;
        }

        public StateListAnimator(String str) {
            this.AEQbTJ = str;
        }
    }

    public static final void OLrzqt(String str, final WebView webView, final ValueCallback valueCallback, String str2) {
        webView.evaluateJavascript(str, new ValueCallback() { // from class: o.xYF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.webkit.ValueCallback
            public final void onReceiveValue(java.lang.Object obj) {
                WalletJsBridge.copydefault(valueCallback, webView, (java.lang.String) obj);
            }
        });
    }

    public static final void copydefault(ValueCallback valueCallback, WebView webView, String str) {
        if (!TextUtils.isEmpty(str)) {
            Intrinsics.copydefault((Object) str);
            if (C59449zhJ.startsWith$default(str, ModelIdentifier.Helper.PRIMARY_KEY_ENCAPSULATE_CHAR, false, 2, null)) {
                Intrinsics.copydefault((Object) str);
                str = str.substring(1);
                Intrinsics.checkNotNullExpressionValue(str, "");
            }
            Intrinsics.copydefault((Object) str);
            if (C59449zhJ.endsWith$default(str, ModelIdentifier.Helper.PRIMARY_KEY_ENCAPSULATE_CHAR, false, 2, null)) {
                Intrinsics.copydefault((Object) str);
                str = str.substring(0, str.length() - 1);
                Intrinsics.checkNotNullExpressionValue(str, "");
            }
        }
        if (valueCallback != null) {
            valueCallback.onReceiveValue(str);
        }
        valueOf.remove(webView);
    }

    public final String EZpvd(InputStream inputStream) throws Throwable {
        BufferedReader bufferedReader;
        BufferedReader bufferedReader2 = null;
        try {
            Reader inputStreamReader = new InputStreamReader(inputStream, Charsets.UTF_8);
            bufferedReader = inputStreamReader instanceof BufferedReader ? (BufferedReader) inputStreamReader : new BufferedReader(inputStreamReader, 8192);
            try {
                String strAEQbTJ = yFK.AEQbTJ(bufferedReader);
                try {
                    bufferedReader.close();
                } catch (Exception unused) {
                }
                return strAEQbTJ;
            } catch (Exception unused2) {
                if (bufferedReader != null) {
                    try {
                        bufferedReader.close();
                    } catch (Exception unused3) {
                    }
                }
                return null;
            } catch (Throwable th) {
                th = th;
                bufferedReader2 = bufferedReader;
                if (bufferedReader2 != null) {
                    try {
                        bufferedReader2.close();
                    } catch (Exception unused4) {
                    }
                }
                throw th;
            }
        } catch (Exception unused5) {
            bufferedReader = null;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static final long EZpvd() {
        C43246rlf c43246rlf = C43246rlf.OLrzqt;
        return c43246rlf.valueOf().getPackageManager().getPackageInfo(c43246rlf.valueOf().getPackageName(), 0).lastUpdateTime;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class JSTYPE_ENUM {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ JSTYPE_ENUM[] $VALUES;
        public static final JSTYPE_ENUM SOLANA_TYPE = new JSTYPE_ENUM("SOLANA_TYPE", 0);
        public static final JSTYPE_ENUM SOLANA_PROVIDER_TYPE = new JSTYPE_ENUM("SOLANA_PROVIDER_TYPE", 1);
        public static final JSTYPE_ENUM EVM_TYPE = new JSTYPE_ENUM("EVM_TYPE", 2);
        public static final JSTYPE_ENUM EVM_PROVIDER_TYPE = new JSTYPE_ENUM("EVM_PROVIDER_TYPE", 3);
        public static final JSTYPE_ENUM TON_TYPE = new JSTYPE_ENUM("TON_TYPE", 4);

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ JSTYPE_ENUM[] $values() {
            return new JSTYPE_ENUM[]{SOLANA_TYPE, SOLANA_PROVIDER_TYPE, EVM_TYPE, EVM_PROVIDER_TYPE, TON_TYPE};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<JSTYPE_ENUM> getEntries() {
            return $ENTRIES;
        }

        private JSTYPE_ENUM(String str, int i) {
        }

        static {
            JSTYPE_ENUM[] jstype_enumArr$values = $values();
            $VALUES = jstype_enumArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(jstype_enumArr$values);
        }

        public static JSTYPE_ENUM valueOf(String str) {
            return (JSTYPE_ENUM) Enum.valueOf(JSTYPE_ENUM.class, str);
        }

        public static JSTYPE_ENUM[] values() {
            return (JSTYPE_ENUM[]) $VALUES.clone();
        }
    }

    public final String KWHzl() {
        if (C33129mqd.OLrzqt((CharSequence) AhwBna)) {
            return AhwBna;
        }
        String strCopydefault = copydefault(JSTYPE_ENUM.SOLANA_TYPE, Boolean.FALSE);
        AhwBna = strCopydefault;
        return strCopydefault;
    }

    public static /* synthetic */ String getSolanaProviderJsData$default(WalletJsBridge walletJsBridge, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = Boolean.FALSE;
        }
        return walletJsBridge.KWHzl(bool);
    }

    public final String KWHzl(Boolean bool) {
        if (C33129mqd.OLrzqt((CharSequence) djBIcL)) {
            return djBIcL;
        }
        String strCopydefault = copydefault(JSTYPE_ENUM.SOLANA_PROVIDER_TYPE, bool);
        djBIcL = strCopydefault;
        return strCopydefault;
    }

    public final String OLrzqt() {
        return AEQbTJ(Boolean.FALSE);
    }

    public static /* synthetic */ String getEvmJsData$default(WalletJsBridge walletJsBridge, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = Boolean.FALSE;
        }
        return walletJsBridge.AEQbTJ(bool);
    }

    public final String AEQbTJ(Boolean bool) {
        if (C33129mqd.OLrzqt((CharSequence) KWHzl)) {
            return KWHzl;
        }
        String strCopydefault = copydefault(JSTYPE_ENUM.EVM_TYPE, bool);
        KWHzl = strCopydefault;
        return strCopydefault;
    }

    public static /* synthetic */ String getEvmProviderJsData$default(WalletJsBridge walletJsBridge, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = Boolean.FALSE;
        }
        return walletJsBridge.copydefault(bool);
    }

    public final String copydefault(Boolean bool) {
        if (C33129mqd.OLrzqt((CharSequence) EZpvd)) {
            return EZpvd;
        }
        String strCopydefault = copydefault(JSTYPE_ENUM.EVM_PROVIDER_TYPE, bool);
        EZpvd = strCopydefault;
        return strCopydefault;
    }

    public static /* synthetic */ String getTonJsData$default(WalletJsBridge walletJsBridge, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = Boolean.FALSE;
        }
        return walletJsBridge.OLrzqt(bool);
    }

    public final String OLrzqt(Boolean bool) {
        if (C33129mqd.OLrzqt((CharSequence) AYXKKw)) {
            return AYXKKw;
        }
        String strCopydefault = copydefault(JSTYPE_ENUM.TON_TYPE, bool);
        AYXKKw = strCopydefault;
        return strCopydefault;
    }

    public final InputStream AEQbTJ(String str) {
        try {
            String strAEQbTJ = C48872udq.AEQbTJ.AEQbTJ(str);
            if (!C33129mqd.OLrzqt((CharSequence) strAEQbTJ)) {
                return null;
            }
            File file = new File(strAEQbTJ);
            if (!file.exists() || !file.isDirectory() || file.listFiles() == null) {
                return null;
            }
            File[] fileArrListFiles = file.listFiles();
            Intrinsics.checkNotNullExpressionValue(fileArrListFiles, "");
            if (!(!(fileArrListFiles.length == 0))) {
                return null;
            }
            File file2 = file.listFiles()[0];
            String name = file2.getName();
            Intrinsics.checkNotNullExpressionValue(name, "");
            if (C59449zhJ.endsWith$default(name, ".js", false, 2, null)) {
                return new FileInputStream(file2);
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    public static /* synthetic */ String getJsLocalData$default(WalletJsBridge walletJsBridge, JSTYPE_ENUM jstype_enum, Boolean bool, int i, Object obj) {
        if ((i & 2) != 0) {
            bool = Boolean.FALSE;
        }
        return walletJsBridge.copydefault(jstype_enum, bool);
    }

    public final String copydefault(JSTYPE_ENUM jstype_enum, Boolean bool) {
        String str;
        InputStream inputStreamOpenRawResource;
        int[] iArr = ActionBar.AEQbTJ;
        int i = iArr[jstype_enum.ordinal()];
        if (i == 1 || i == 2) {
            str = "";
        } else if (i == 3) {
            str = "file_discover_evm_js2";
        } else if (i == 4) {
            str = "file_discover_ton_js3";
        } else {
            if (i != 5) {
                throw new NoWhenBranchMatchedException();
            }
            str = "file_discover_solana_js3";
        }
        InputStream inputStreamAEQbTJ = (C33129mqd.OLrzqt((CharSequence) str) && (Intrinsics.EZpvd(bool, Boolean.TRUE) || C48787ucK.AEQbTJ.copydefault("walletJsConfig.useDynamic", false))) ? AEQbTJ(str) : null;
        if (inputStreamAEQbTJ == null) {
            int i2 = iArr[jstype_enum.ordinal()];
            if (i2 == 1) {
                inputStreamOpenRawResource = C43246rlf.OLrzqt.valueOf().getResources().openRawResource(xXU.TaskDescription.EZpvd);
            } else if (i2 == 2) {
                inputStreamOpenRawResource = C43246rlf.OLrzqt.valueOf().getResources().openRawResource(xXU.TaskDescription.KWHzl);
            } else if (i2 == 3) {
                inputStreamOpenRawResource = C43246rlf.OLrzqt.valueOf().getResources().openRawResource(xXU.TaskDescription.copydefault);
            } else if (i2 == 4) {
                inputStreamOpenRawResource = C43246rlf.OLrzqt.valueOf().getResources().openRawResource(xXU.TaskDescription.OLrzqt);
            } else {
                if (i2 != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                inputStreamOpenRawResource = C43246rlf.OLrzqt.valueOf().getResources().openRawResource(xXU.TaskDescription.AEQbTJ);
            }
            inputStreamAEQbTJ = inputStreamOpenRawResource;
        }
        return EZpvd(inputStreamAEQbTJ);
    }
}
