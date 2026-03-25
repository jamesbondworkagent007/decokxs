package o;

import com.just.agentweb.JsAccessEntrace;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ygD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C57317ygD {
    public static /* synthetic */ void safeCallJs$default(JsAccessEntrace jsAccessEntrace, java.lang.String str, java.lang.String[] strArr, android.webkit.ValueCallback valueCallback, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            strArr = new java.lang.String[0];
        }
        if ((i & 4) != 0) {
            valueCallback = null;
        }
        KWHzl(jsAccessEntrace, str, strArr, valueCallback);
    }

    public static final void KWHzl(@NotNull final JsAccessEntrace jsAccessEntrace, @NotNull final java.lang.String str, @NotNull final java.lang.String[] strArr, final android.webkit.ValueCallback<java.lang.String> valueCallback) {
        Intrinsics.checkNotNullParameter(jsAccessEntrace, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(strArr, "");
        jsAccessEntrace.callJs("typeof " + str + " === 'function'", new android.webkit.ValueCallback() { // from class: o.ygz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.webkit.ValueCallback
            public final void onReceiveValue(java.lang.Object obj) {
                C57317ygD.copydefault(jsAccessEntrace, str, valueCallback, strArr, (java.lang.String) obj);
            }
        });
    }

    public static final void copydefault(JsAccessEntrace jsAccessEntrace, java.lang.String str, android.webkit.ValueCallback valueCallback, java.lang.String[] strArr, java.lang.String str2) {
        if (Intrinsics.EZpvd((java.lang.Object) str2, (java.lang.Object) "true")) {
            jsAccessEntrace.quickCallJs(str, valueCallback, (java.lang.String[]) java.util.Arrays.copyOf(strArr, strArr.length));
        }
    }
}
