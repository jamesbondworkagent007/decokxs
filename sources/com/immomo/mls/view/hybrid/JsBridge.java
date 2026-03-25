package com.immomo.mls.view.hybrid;

import android.content.Context;
import android.net.Uri;
import android.webkit.JavascriptInterface;
import com.google.gson.Gson;
import com.immomo.mls.view.hybrid.IJsBridge;
import com.immomo.mls.view.hybrid.JsBridge;
import com.immomo.mls.view.hybrid.handler.DefaultHandlers;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C56390yDp;
import o.C56392yDr;
import o.C56423yEv;
import o.C56548yJl;
import o.C7961ath;
import o.InterfaceC56387yDm;
import o.InterfaceC7973att;
import o.pUU;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class JsBridge implements IJsBridge {
    public static final int $stable = 8;
    private final InterfaceC56387yDm defaultHandlers$delegate;
    private final InterfaceC56387yDm extensionHandlers$delegate;
    private final C7961ath hybridWebView;
    private volatile IJsBridge.Activity prePayload;

    public JsBridge(@NotNull C7961ath c7961ath) {
        Intrinsics.checkNotNullParameter(c7961ath, "");
        this.hybridWebView = c7961ath;
        this.defaultHandlers$delegate = C56392yDr.copydefault(new Function0() { // from class: o.ato
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return JsBridge.defaultHandlers_delegate$lambda$1();
            }
        });
        this.extensionHandlers$delegate = C56392yDr.copydefault(new Function0() { // from class: o.atp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return JsBridge.extensionHandlers_delegate$lambda$2();
            }
        });
    }

    private final Map<String, Function1<String, InterfaceC7973att>> getDefaultHandlers() {
        return (Map) this.defaultHandlers$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map defaultHandlers_delegate$lambda$1() {
        DefaultHandlers[] defaultHandlersArrValues = DefaultHandlers.values();
        LinkedHashMap linkedHashMap = new LinkedHashMap(C56548yJl.copydefault(C56423yEv.copydefault(defaultHandlersArrValues.length), 16));
        for (DefaultHandlers defaultHandlers : defaultHandlersArrValues) {
            Pair pairOLrzqt = C56390yDp.OLrzqt(defaultHandlers.getHandlerName(), defaultHandlers.getClosure());
            linkedHashMap.put(pairOLrzqt.getFirst(), pairOLrzqt.getSecond());
        }
        return linkedHashMap;
    }

    private final Map<String, Function1<InterfaceC7973att, Unit>> getExtensionHandlers() {
        return (Map) this.extensionHandlers$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map extensionHandlers_delegate$lambda$2() {
        return new LinkedHashMap();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super o.att, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.immomo.mls.view.hybrid.IJsBridge
    public void registerExtensionCallback(@NotNull String str, @NotNull Function1<? super InterfaceC7973att, Unit> function1) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(function1, "");
        getExtensionHandlers().put(str, function1);
    }

    @Override // com.immomo.mls.view.hybrid.IJsBridge
    @JavascriptInterface
    public void invokeNativeApi(@NotNull final String str, @NotNull String str2) {
        final InterfaceC7973att interfaceC7973attInvoke;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        pUU.KWHzl("HybridWebView", "invokeNativeApi: [handlerName: " + str + ", modelJson: " + str2 + "]");
        Function1<String, InterfaceC7973att> function1 = getDefaultHandlers().get(str);
        if (function1 != null && (interfaceC7973attInvoke = function1.invoke(str2)) != null) {
            this.hybridWebView.post(new Runnable() { // from class: o.atl
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    JsBridge.invokeNativeApi$lambda$4$lambda$3(this.OLrzqt, str, interfaceC7973attInvoke);
                }
            });
            return;
        }
        pUU.copydefault("HybridWebView", "handler not found: " + str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeNativeApi$lambda$4$lambda$3(JsBridge jsBridge, String str, InterfaceC7973att interfaceC7973att) {
        Function1<InterfaceC7973att, Unit> function1 = jsBridge.getExtensionHandlers().get(str);
        if (function1 != null) {
            function1.invoke(interfaceC7973att);
            return;
        }
        C7961ath c7961ath = jsBridge.hybridWebView;
        Context context = c7961ath.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        interfaceC7973att.execute(c7961ath, context);
    }

    @Override // com.immomo.mls.view.hybrid.IJsBridge
    public void injectHtmlContent(IJsBridge.InjectHtmlContentPayload injectHtmlContentPayload) {
        pUU.KWHzl("HybridWebView", "injectHtmlContent: [payload: " + injectHtmlContentPayload + "]");
        if (Intrinsics.EZpvd(this.prePayload, injectHtmlContentPayload)) {
            pUU.KWHzl("HybridWebView", "injectHtmlContent: [payload is same as prePayload, skip]");
            return;
        }
        this.prePayload = injectHtmlContentPayload;
        IJsBridge.InjectHtmlContentPayload injectHtmlContentPayloadCopy$default = null;
        if (injectHtmlContentPayload != null) {
            String strEncode = Uri.encode(injectHtmlContentPayload.getHtmlString());
            Intrinsics.checkNotNullExpressionValue(strEncode, "");
            injectHtmlContentPayloadCopy$default = IJsBridge.InjectHtmlContentPayload.copy$default(injectHtmlContentPayload, strEncode, null, 2, null);
        }
        invokeJsApi("injectHtmlContent", injectHtmlContentPayloadCopy$default);
    }

    public void invokeJsApi(@NotNull final String str, IJsBridge.Activity activity) {
        Intrinsics.checkNotNullParameter(str, "");
        pUU.KWHzl("HybridWebView", "invokeJsApi: [handlerName: " + str + ", payload: " + activity + "]");
        final String json = new Gson().toJson(activity);
        this.hybridWebView.post(new Runnable() { // from class: o.ats
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                JsBridge.invokeJsApi$lambda$7(this.KWHzl, str, json);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeJsApi$lambda$7(JsBridge jsBridge, String str, String str2) {
        jsBridge.hybridWebView.evaluateJavascript("javascript:invokeJsApi('" + str + "', '" + str2 + "');", null);
    }
}
