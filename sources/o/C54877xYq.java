package o;

import com.google.gson.JsonElement;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.serialization.json.JsonObject;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: o.xYq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C54877xYq {
    public static final Activity Companion = new Activity(null);
    public static final int EZpvd = 8;
    public final InterfaceC56387yDm AEQbTJ;
    public WeakReference<android.app.Activity> KWHzl;
    public android.webkit.ValueCallback<java.lang.String> OLrzqt;
    public android.webkit.WebView copydefault;

    public C54877xYq(@NotNull WeakReference<android.app.Activity> weakReference, @NotNull android.webkit.WebView webView, android.webkit.ValueCallback<java.lang.String> valueCallback) {
        Intrinsics.checkNotNullParameter(weakReference, "");
        Intrinsics.checkNotNullParameter(webView, "");
        this.KWHzl = weakReference;
        this.copydefault = webView;
        this.OLrzqt = valueCallback;
        this.AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.xYu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C54877xYq.AEQbTJ();
            }
        });
    }

    /* JADX INFO: renamed from: o.xYq$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.xYq.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    public final xYL OLrzqt() {
        return (xYL) this.AEQbTJ.getValue();
    }

    public static final xYL AEQbTJ() {
        return new xYL();
    }

    @android.webkit.JavascriptInterface
    public final void postMessage(@NotNull final java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        android.app.Activity activity = this.KWHzl.get();
        if (activity != null) {
            activity.runOnUiThread(new java.lang.Runnable() { // from class: o.xYx
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    C54877xYq.EZpvd(this.AEQbTJ, str);
                }
            });
        }
    }

    public static final void EZpvd(C54877xYq c54877xYq, java.lang.String str) {
        try {
            if (c54877xYq.KWHzl.get() != null) {
                c54877xYq.OLrzqt(str);
            }
        } catch (java.lang.Exception e) {
            pUU.AEQbTJ("SolanaJsInterface", "postMessage", e);
        }
    }

    public final void OLrzqt(java.lang.String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        java.lang.Object obj = jSONObject.get("id");
        java.lang.Object obj2 = jSONObject.get("name");
        if (Intrinsics.EZpvd(obj2, (java.lang.Object) "sendRpcRequest")) {
            Intrinsics.copydefault(obj);
            java.lang.String strOptString = jSONObject.optString("url", "");
            Intrinsics.checkNotNullExpressionValue(strOptString, "");
            JSONObject jSONObject2 = jSONObject.getJSONObject("object");
            Intrinsics.checkNotNullExpressionValue(jSONObject2, "");
            OLrzqt(obj, strOptString, jSONObject2);
            return;
        }
        if (Intrinsics.EZpvd(obj2, (java.lang.Object) "encodeTransaction")) {
            java.lang.String string = jSONObject.get("object").toString();
            android.webkit.ValueCallback<java.lang.String> valueCallback = this.OLrzqt;
            if (valueCallback != null) {
                valueCallback.onReceiveValue(string);
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r11v0, resolved type: java.lang.String */
    /* JADX DEBUG: Multi-variable search result rejected for r1v2, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public final void OLrzqt(final java.lang.Object obj, java.lang.String str, JSONObject jSONObject) {
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = "/fullnode/sol/discover/rpc";
        if (str.length() > 0) {
            objectRef.element = str;
        }
        xYL xylOLrzqt = OLrzqt();
        java.lang.String str2 = (java.lang.String) objectRef.element;
        java.lang.String string = jSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        C33024moe.subscribeOnIO$default(xylOLrzqt.copydefault(str2, string), new Function1() { // from class: o.xYv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj2) {
                return C54877xYq.KWHzl(this.EZpvd, obj, objectRef, (java.lang.Throwable) obj2);
            }
        }, (Function0) null, new Function1() { // from class: o.xYw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj2) {
                return C54877xYq.KWHzl(this.OLrzqt, obj, (JsonObject) obj2);
            }
        }, 2, (java.lang.Object) null);
    }

    public static final Unit KWHzl(C54877xYq c54877xYq, java.lang.Object obj, JsonObject jsonObject) {
        Intrinsics.checkNotNullParameter(jsonObject, "");
        c54877xYq.EZpvd(obj, jsonObject.toString(), false);
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(C54877xYq c54877xYq, java.lang.Object obj, Ref.ObjectRef objectRef, java.lang.Throwable th) {
        JsonElement jsonElement;
        java.lang.String string;
        java.lang.String str = "";
        Intrinsics.checkNotNullParameter(th, "");
        com.google.gson.JsonObject jsonObjectAEQbTJ = C43422row.AEQbTJ(th);
        if (jsonObjectAEQbTJ != null && (string = jsonObjectAEQbTJ.toString()) != null) {
            str = string;
        }
        c54877xYq.EZpvd(obj, str, true);
        java.lang.Object obj2 = objectRef.element;
        com.google.gson.JsonObject jsonObjectAEQbTJ2 = C43422row.AEQbTJ(th);
        java.lang.String asString = (jsonObjectAEQbTJ2 == null || (jsonElement = jsonObjectAEQbTJ2.get("code")) == null) ? null : jsonElement.getAsString();
        pUU.copydefault("SolanaJsInterface", "rpc request failed:" + obj2 + " code:" + asString + th.getMessage());
        return Unit.INSTANCE;
    }

    public final void EZpvd(java.lang.Object obj, java.lang.String str, boolean z) {
        java.lang.String strFJNWhG;
        if (z) {
            strFJNWhG = C59442zhC.fJNWhG("\n                        if (window.sendRpcResponse) {\n                            window.sendRpcResponse(" + obj + ", \"\", " + str + ")\n                        }\n                    ");
        } else {
            strFJNWhG = C59442zhC.fJNWhG("\n                        if (window.sendRpcResponse) {\n                            window.sendRpcResponse(" + obj + ", " + str + ")\n                        }\n                    ");
        }
        this.copydefault.evaluateJavascript(strFJNWhG, null);
    }
}
