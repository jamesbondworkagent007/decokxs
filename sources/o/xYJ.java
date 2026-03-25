package o;

import com.amplifyframework.core.model.ModelIdentifier;
import java.util.LinkedList;
import java.util.Queue;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class xYJ {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int OLrzqt = 8;
    public final java.lang.String AEQbTJ;
    public final StateListAnimator AYXKKw;
    public boolean EZpvd;
    public android.webkit.WebView KWHzl;
    public Queue<kotlin.Pair<java.lang.String, android.webkit.ValueCallback<java.lang.String>>> copydefault;

    public static final class ActionBar extends android.webkit.WebChromeClient {
    }

    public interface StateListAnimator {
        android.webkit.WebView KWHzl();
    }

    public xYJ(@NotNull StateListAnimator stateListAnimator, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(stateListAnimator, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.AYXKKw = stateListAnimator;
        this.AEQbTJ = str;
        this.copydefault = new LinkedList();
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.xYJ.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public xYJ(@NotNull final android.app.Application application, @NotNull java.lang.String str) {
        this(new StateListAnimator() { // from class: o.xYM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.xYJ.StateListAnimator
            public final android.webkit.WebView KWHzl() {
                return xYJ.OLrzqt(application);
            }
        }, str);
        Intrinsics.checkNotNullParameter(application, "");
        Intrinsics.checkNotNullParameter(str, "");
    }

    public static final android.webkit.WebView OLrzqt(android.app.Application application) {
        return new android.webkit.WebView(application);
    }

    public final void copydefault() {
        try {
            android.webkit.WebView webViewKWHzl = this.AYXKKw.KWHzl();
            this.KWHzl = webViewKWHzl;
            webViewKWHzl.getSettings().setJavaScriptEnabled(true);
            webViewKWHzl.setWebChromeClient(new ActionBar());
            webViewKWHzl.evaluateJavascript(this.AEQbTJ, new android.webkit.ValueCallback() { // from class: o.xYI
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.webkit.ValueCallback
                public final void onReceiveValue(java.lang.Object obj) {
                    xYJ.OLrzqt(this.OLrzqt, (java.lang.String) obj);
                }
            });
        } catch (java.lang.Throwable th) {
            pUU.AEQbTJ("WalletJsInstance", "Failed to create WebView", th);
        }
    }

    public static final void OLrzqt(xYJ xyj, java.lang.String str) {
        xyj.KWHzl();
    }

    public final void KWHzl() {
        kotlin.Pair<java.lang.String, android.webkit.ValueCallback<java.lang.String>> pairPoll = this.copydefault.poll();
        if (pairPoll == null) {
            return;
        }
        OLrzqt(pairPoll.getFirst(), pairPoll.getSecond());
    }

    public final void OLrzqt(@NotNull java.lang.String str, final android.webkit.ValueCallback<java.lang.String> valueCallback) {
        Intrinsics.checkNotNullParameter(str, "");
        android.webkit.WebView webView = this.KWHzl;
        if (webView == null) {
            this.copydefault.offer(C56390yDp.OLrzqt(str, valueCallback));
            copydefault();
        } else if (this.EZpvd) {
            this.copydefault.offer(C56390yDp.OLrzqt(str, valueCallback));
        } else {
            this.EZpvd = true;
            webView.evaluateJavascript(str, new android.webkit.ValueCallback() { // from class: o.xYO
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.webkit.ValueCallback
                public final void onReceiveValue(java.lang.Object obj) {
                    xYJ.OLrzqt(valueCallback, this, (java.lang.String) obj);
                }
            });
        }
    }

    public static final void OLrzqt(android.webkit.ValueCallback valueCallback, xYJ xyj, java.lang.String str) {
        if (!android.text.TextUtils.isEmpty(str)) {
            Intrinsics.copydefault((java.lang.Object) str);
            if (C59449zhJ.startsWith$default(str, ModelIdentifier.Helper.PRIMARY_KEY_ENCAPSULATE_CHAR, false, 2, null)) {
                Intrinsics.copydefault((java.lang.Object) str);
                str = str.substring(1);
                Intrinsics.checkNotNullExpressionValue(str, "");
            }
            Intrinsics.copydefault((java.lang.Object) str);
            if (C59449zhJ.endsWith$default(str, ModelIdentifier.Helper.PRIMARY_KEY_ENCAPSULATE_CHAR, false, 2, null)) {
                Intrinsics.copydefault((java.lang.Object) str);
                str = str.substring(0, str.length() - 1);
                Intrinsics.checkNotNullExpressionValue(str, "");
            }
        }
        if (valueCallback != null) {
            valueCallback.onReceiveValue(str);
        }
        xyj.EZpvd = false;
        xyj.KWHzl();
    }
}
