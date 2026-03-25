package o;

import com.okinc.wallet.hardware.api.ledger.model.LedgerError;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt__CharJVMKt;
import o.AbstractC57063ybO;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: o.ybO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public abstract class AbstractC57063ybO {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int OLrzqt = 8;
    public final InterfaceC57036yao AEQbTJ;
    public final android.os.Handler AhwBna;
    public android.webkit.WebView EZpvd;
    public final android.content.Context KWHzl;
    public final java.lang.String copydefault;
    public C57096ybv djBIcL;
    public boolean gEmmrt;
    public final java.lang.Object valueOf;

    /* JADX INFO: renamed from: o.ybO$TaskDescription */
    public static final class TaskDescription extends android.webkit.WebChromeClient {
        @Override // android.webkit.WebChromeClient
        public void onConsoleMessage(java.lang.String str, int i, java.lang.String str2) {
        }
    }

    public static final void OLrzqt(java.lang.String str) {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final android.os.Handler EZpvd() {
        return this.AhwBna;
    }

    public abstract java.lang.String KWHzl();

    @android.webkit.JavascriptInterface
    public final AbstractC57063ybO create() {
        return this;
    }

    public AbstractC57063ybO(@NotNull android.content.Context context, @NotNull InterfaceC57036yao interfaceC57036yao, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(interfaceC57036yao, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.KWHzl = context;
        this.AEQbTJ = interfaceC57036yao;
        this.copydefault = str;
        this.valueOf = new java.lang.Object();
        this.AhwBna = new android.os.Handler(android.os.Looper.getMainLooper());
    }

    /* JADX INFO: renamed from: o.ybO$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.ybO.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    public final android.webkit.WebView AEQbTJ() {
        android.webkit.WebView webView = this.EZpvd;
        if (webView != null) {
            return webView;
        }
        try {
            android.webkit.WebView webView2 = new android.webkit.WebView(this.KWHzl);
            this.EZpvd = webView2;
            KWHzl(webView2, this.copydefault);
            return webView2;
        } catch (java.lang.Throwable th) {
            pUU.AEQbTJ("Transport", "Failed to create WebView", th);
            return null;
        }
    }

    public final void KWHzl(final android.webkit.WebView webView, final java.lang.String str) {
        android.webkit.WebSettings settings = webView.getSettings();
        Intrinsics.checkNotNullExpressionValue(settings, "");
        settings.setJavaScriptEnabled(true);
        webView.setWebChromeClient(new TaskDescription());
        webView.addJavascriptInterface(this, "SwiftTransport");
        AbstractC58260yxt.OLrzqt(new InterfaceC58259yxs() { // from class: o.yca
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58259yxs
            public final void subscribe(InterfaceC58257yxq interfaceC58257yxq) {
                AbstractC57063ybO.EZpvd(webView, str, interfaceC58257yxq);
            }
        }).KWHzl(yBP.AEQbTJ()).OLrzqt(C58266yxz.OLrzqt()).copydefault((InterfaceC58258yxr) new Application(webView, this));
    }

    public static final void EZpvd(android.webkit.WebView webView, java.lang.String str, InterfaceC58257yxq interfaceC58257yxq) {
        Intrinsics.checkNotNullParameter(interfaceC58257yxq, "");
        C57140ycm c57140ycm = C57140ycm.KWHzl;
        android.content.Context context = webView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        interfaceC58257yxq.onSuccess(C57137ycj.copydefault.KWHzl(new java.io.FileInputStream(c57140ycm.AEQbTJ(context, str))));
    }

    /* JADX INFO: renamed from: o.ybO$Application */
    public static final class Application implements InterfaceC58258yxr<java.lang.String> {
        public final /* synthetic */ AbstractC57063ybO EZpvd;
        public final /* synthetic */ android.webkit.WebView KWHzl;

        public static final void AEQbTJ(java.lang.String str) {
        }

        public static final void EZpvd(java.lang.String str) {
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC58258yxr
        public void onError(java.lang.Throwable th) {
            Intrinsics.checkNotNullParameter(th, "");
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC58258yxr
        public void onSubscribe(InterfaceC58217yxC interfaceC58217yxC) {
            Intrinsics.checkNotNullParameter(interfaceC58217yxC, "");
        }

        public Application(android.webkit.WebView webView, AbstractC57063ybO abstractC57063ybO) {
            this.KWHzl = webView;
            this.EZpvd = abstractC57063ybO;
        }

        /* JADX DEBUG: Method merged with bridge method: onSuccess(Ljava/lang/Object;)V */
        @Override // o.InterfaceC58258yxr
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public void onSuccess(java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            final android.webkit.WebView webView = this.KWHzl;
            final AbstractC57063ybO abstractC57063ybO = this.EZpvd;
            webView.evaluateJavascript(str, new android.webkit.ValueCallback() { // from class: o.ybZ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.webkit.ValueCallback
                public final void onReceiveValue(java.lang.Object obj) {
                    AbstractC57063ybO.Application.OLrzqt(abstractC57063ybO, webView, (java.lang.String) obj);
                }
            });
        }

        public static final void OLrzqt(final AbstractC57063ybO abstractC57063ybO, final android.webkit.WebView webView, java.lang.String str) {
            abstractC57063ybO.EZpvd().post(new java.lang.Runnable() { // from class: o.ybY
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    AbstractC57063ybO.Application.copydefault(abstractC57063ybO, webView);
                }
            });
        }

        public static final void copydefault(final AbstractC57063ybO abstractC57063ybO, final android.webkit.WebView webView) {
            abstractC57063ybO.gEmmrt = true;
            java.lang.String strKWHzl = abstractC57063ybO.KWHzl();
            if (strKWHzl == null) {
                C57096ybv c57096ybv = abstractC57063ybO.djBIcL;
                if (c57096ybv != null) {
                    webView.evaluateJavascript(c57096ybv.copydefault(), new android.webkit.ValueCallback() { // from class: o.ycc
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // android.webkit.ValueCallback
                        public final void onReceiveValue(java.lang.Object obj) {
                            AbstractC57063ybO.Application.EZpvd((java.lang.String) obj);
                        }
                    });
                    return;
                }
                return;
            }
            webView.evaluateJavascript(strKWHzl, new android.webkit.ValueCallback() { // from class: o.ycd
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.webkit.ValueCallback
                public final void onReceiveValue(java.lang.Object obj) {
                    AbstractC57063ybO.Application.copydefault(abstractC57063ybO, webView, (java.lang.String) obj);
                }
            });
        }

        public static final void copydefault(AbstractC57063ybO abstractC57063ybO, android.webkit.WebView webView, java.lang.String str) {
            C57096ybv c57096ybv = abstractC57063ybO.djBIcL;
            if (c57096ybv != null) {
                webView.evaluateJavascript(c57096ybv.copydefault(), new android.webkit.ValueCallback() { // from class: o.ycb
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // android.webkit.ValueCallback
                    public final void onReceiveValue(java.lang.Object obj) {
                        AbstractC57063ybO.Application.AEQbTJ((java.lang.String) obj);
                    }
                });
            }
        }
    }

    public final C57096ybv EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C57096ybv c57096ybv = this.djBIcL;
        if (c57096ybv != null && Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) c57096ybv.OLrzqt())) {
            return c57096ybv;
        }
        return null;
    }

    public final C57096ybv KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C57096ybv c57096ybv = this.djBIcL;
        if (c57096ybv == null) {
            return null;
        }
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) c57096ybv.OLrzqt())) {
            this.djBIcL = null;
            return c57096ybv;
        }
        c57096ybv.AEQbTJ().invoke(LedgerError.APDU_ORDER_BREAK);
        this.djBIcL = null;
        return null;
    }

    public final void KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.Object obj, @NotNull Function1<? super LedgerError, Unit> function1) {
        Function1<LedgerError, Unit> function1AEQbTJ;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(obj, "");
        Intrinsics.checkNotNullParameter(function1, "");
        C57096ybv c57096ybv = this.djBIcL;
        if (c57096ybv != null) {
            if (c57096ybv != null && (function1AEQbTJ = c57096ybv.AEQbTJ()) != null) {
                function1AEQbTJ.invoke(LedgerError.APDU_ORDER_BREAK);
            }
            this.djBIcL = null;
            return;
        }
        this.djBIcL = new C57096ybv(str, str2, obj, function1);
        android.webkit.WebView webViewAEQbTJ = AEQbTJ();
        if (webViewAEQbTJ == null) {
            pUU.copydefault("Transport", "WebView is null when evaluating javascript");
        } else if (this.gEmmrt) {
            webViewAEQbTJ.evaluateJavascript(str2, new android.webkit.ValueCallback() { // from class: o.ybT
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.webkit.ValueCallback
                public final void onReceiveValue(java.lang.Object obj2) {
                    AbstractC57063ybO.OLrzqt((java.lang.String) obj2);
                }
            });
        }
    }

    public static final void copydefault(final AbstractC57063ybO abstractC57063ybO, byte[] bArr, final JSONObject jSONObject) {
        abstractC57063ybO.AEQbTJ.KWHzl(bArr, new Function1() { // from class: o.ybX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AbstractC57063ybO.AEQbTJ(this.copydefault, jSONObject, (byte[]) obj);
            }
        }, new Function1() { // from class: o.ybV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AbstractC57063ybO.EZpvd(this.KWHzl, jSONObject, (LedgerError) obj);
            }
        });
    }

    public static final Unit AEQbTJ(AbstractC57063ybO abstractC57063ybO, JSONObject jSONObject, byte[] bArr) {
        Unit unit;
        Intrinsics.checkNotNullParameter(bArr, "");
        synchronized (abstractC57063ybO.valueOf) {
            jSONObject.put("code", java.lang.Integer.parseInt(LedgerError.OK.getCode(), CharsKt__CharJVMKt.checkRadix(16)));
            JSONArray jSONArray = new JSONArray();
            for (byte b : bArr) {
                jSONArray.put(java.lang.Byte.valueOf(b));
            }
            jSONObject.put("data", jSONArray);
            abstractC57063ybO.valueOf.notify();
            unit = Unit.INSTANCE;
        }
        return unit;
    }

    public static final Unit EZpvd(AbstractC57063ybO abstractC57063ybO, JSONObject jSONObject, LedgerError ledgerError) {
        Unit unit;
        Intrinsics.checkNotNullParameter(ledgerError, "");
        synchronized (abstractC57063ybO.valueOf) {
            jSONObject.put("code", java.lang.Integer.parseInt(ledgerError.getCode(), CharsKt__CharJVMKt.checkRadix(16)));
            abstractC57063ybO.valueOf.notify();
            unit = Unit.INSTANCE;
        }
        return unit;
    }

    @android.webkit.JavascriptInterface
    public final java.lang.String exchange(@NotNull final byte[] bArr) {
        java.lang.String string;
        Intrinsics.checkNotNullParameter(bArr, "");
        final JSONObject jSONObject = new JSONObject();
        this.AhwBna.post(new java.lang.Runnable() { // from class: o.ybU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC57063ybO.copydefault(this.KWHzl, bArr, jSONObject);
            }
        });
        synchronized (this.valueOf) {
            this.valueOf.wait();
            string = jSONObject.toString();
            Intrinsics.checkNotNullExpressionValue(string, "");
        }
        return string;
    }

    public final java.lang.String AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return str + ".catch((err)=>{\n           if('statusCode' in err){\n               transportInstance.transport.error(err.statusCode);\n \t}else{\n               transportInstance.transport.unknownError(err.toString());\n           }\n       });";
    }

    @android.webkit.JavascriptInterface
    public final void error(@NotNull final java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.AhwBna.post(new java.lang.Runnable() { // from class: o.ybW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC57063ybO.AEQbTJ(this.KWHzl, str);
            }
        });
    }

    public static final void AEQbTJ(AbstractC57063ybO abstractC57063ybO, java.lang.String str) {
        Function1<LedgerError, Unit> function1AEQbTJ;
        C57096ybv c57096ybv = abstractC57063ybO.djBIcL;
        if (c57096ybv != null && (function1AEQbTJ = c57096ybv.AEQbTJ()) != null) {
            function1AEQbTJ.invoke(LedgerError.Companion.OLrzqt(str));
        }
        abstractC57063ybO.djBIcL = null;
    }

    @android.webkit.JavascriptInterface
    public void unknownError(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.AhwBna.post(new java.lang.Runnable() { // from class: o.ybQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC57063ybO.AEQbTJ(this.copydefault);
            }
        });
    }

    public static final void AEQbTJ(AbstractC57063ybO abstractC57063ybO) {
        Function1<LedgerError, Unit> function1AEQbTJ;
        C57096ybv c57096ybv = abstractC57063ybO.djBIcL;
        if (c57096ybv != null && (function1AEQbTJ = c57096ybv.AEQbTJ()) != null) {
            function1AEQbTJ.invoke(LedgerError.UNKNOWN_ERROR);
        }
        abstractC57063ybO.djBIcL = null;
    }
}
