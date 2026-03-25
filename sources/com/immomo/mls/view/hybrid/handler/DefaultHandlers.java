package com.immomo.mls.view.hybrid.handler;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.immomo.mls.view.hybrid.handler.DefaultHandlers;
import com.immomo.mls.view.hybrid.handler.impl.DomHeightChangeHandler;
import com.immomo.mls.view.hybrid.handler.impl.HyperLinkHandler;
import com.immomo.mls.view.hybrid.handler.impl.ImageGalleryHandler;
import com.immomo.mls.view.hybrid.handler.impl.ToastHandler;
import kotlin.Result;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C56391yDq;
import o.C56444yFp;
import o.C7929atB;
import o.C7979atz;
import o.InterfaceC56445yFq;
import o.InterfaceC7973att;
import o.pUU;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class DefaultHandlers {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ DefaultHandlers[] $VALUES;
    private final Function1<String, InterfaceC7973att> closure;
    private final String handlerName;
    public static final DefaultHandlers SHOW_TOAST = new DefaultHandlers("SHOW_TOAST", 0, "showToast", new Function1() { // from class: o.atq
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function1
        public final java.lang.Object invoke(java.lang.Object obj) {
            return DefaultHandlers._init_$lambda$0((java.lang.String) obj);
        }
    });
    public static final DefaultHandlers WEB_VIEW_DOM_READY = new DefaultHandlers("WEB_VIEW_DOM_READY", 1, "onWebViewDomReady", new Function1() { // from class: o.atr
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function1
        public final java.lang.Object invoke(java.lang.Object obj) {
            return DefaultHandlers._init_$lambda$1((java.lang.String) obj);
        }
    });
    public static final DefaultHandlers WEB_VIEW_DOM_HEIGHT_CHANGED = new DefaultHandlers("WEB_VIEW_DOM_HEIGHT_CHANGED", 2, "onWebViewDomHeightChanged", new Function1() { // from class: o.atw
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function1
        public final java.lang.Object invoke(java.lang.Object obj) {
            return DefaultHandlers._init_$lambda$2((java.lang.String) obj);
        }
    });
    public static final DefaultHandlers PREVIEW_IMAGE_GALLERY = new DefaultHandlers("PREVIEW_IMAGE_GALLERY", 3, "showImageGallery", new Function1() { // from class: o.atu
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function1
        public final java.lang.Object invoke(java.lang.Object obj) {
            return DefaultHandlers._init_$lambda$3((java.lang.String) obj);
        }
    });
    public static final DefaultHandlers OPEN_HYPER_LINK = new DefaultHandlers("OPEN_HYPER_LINK", 4, "openHyperLink", new Function1() { // from class: o.atv
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function1
        public final java.lang.Object invoke(java.lang.Object obj) {
            return DefaultHandlers._init_$lambda$4((java.lang.String) obj);
        }
    });
    public static final DefaultHandlers CONTENT_UPDATED = new DefaultHandlers("CONTENT_UPDATED", 5, "onContentUpdated", new Function1() { // from class: o.atx
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function1
        public final java.lang.Object invoke(java.lang.Object obj) {
            return DefaultHandlers._init_$lambda$5((java.lang.String) obj);
        }
    });

    public static final class ActionBar extends TypeToken<DomHeightChangeHandler> {
    }

    public static final class Application extends TypeToken<ToastHandler> {
    }

    public static final class StateListAnimator extends TypeToken<ImageGalleryHandler> {
    }

    public static final class TaskDescription extends TypeToken<HyperLinkHandler> {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ DefaultHandlers[] $values() {
        return new DefaultHandlers[]{SHOW_TOAST, WEB_VIEW_DOM_READY, WEB_VIEW_DOM_HEIGHT_CHANGED, PREVIEW_IMAGE_GALLERY, OPEN_HYPER_LINK, CONTENT_UPDATED};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<DefaultHandlers> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Function1<String, InterfaceC7973att> getClosure() {
        return this.closure;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getHandlerName() {
        return this.handlerName;
    }

    private DefaultHandlers(String str, int i, String str2, Function1 function1) {
        this.handlerName = str2;
        this.closure = function1;
    }

    static {
        DefaultHandlers[] defaultHandlersArr$values = $values();
        $VALUES = defaultHandlersArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(defaultHandlersArr$values);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC7973att _init_$lambda$1(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return new C7979atz();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC7973att _init_$lambda$5(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return new C7929atB();
    }

    public static DefaultHandlers valueOf(String str) {
        return (DefaultHandlers) Enum.valueOf(DefaultHandlers.class, str);
    }

    public static DefaultHandlers[] values() {
        return (DefaultHandlers[]) $VALUES.clone();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC7973att _init_$lambda$0(String str) {
        Object objM7377constructorimpl;
        Intrinsics.checkNotNullParameter(str, "");
        try {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl((InterfaceC7973att) new Gson().fromJson(str, new Application().getType()));
        } catch (Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
            pUU.AEQbTJ("HybridWebView", "parse json to payload failed: ", thM7380exceptionOrNullimpl);
        }
        if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
            objM7377constructorimpl = null;
        }
        return (InterfaceC7973att) objM7377constructorimpl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC7973att _init_$lambda$2(String str) {
        Object objM7377constructorimpl;
        Intrinsics.checkNotNullParameter(str, "");
        try {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl((InterfaceC7973att) new Gson().fromJson(str, new ActionBar().getType()));
        } catch (Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
            pUU.AEQbTJ("HybridWebView", "parse json to payload failed: ", thM7380exceptionOrNullimpl);
        }
        if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
            objM7377constructorimpl = null;
        }
        return (InterfaceC7973att) objM7377constructorimpl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC7973att _init_$lambda$3(String str) {
        Object objM7377constructorimpl;
        Intrinsics.checkNotNullParameter(str, "");
        try {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl((InterfaceC7973att) new Gson().fromJson(str, new StateListAnimator().getType()));
        } catch (Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
            pUU.AEQbTJ("HybridWebView", "parse json to payload failed: ", thM7380exceptionOrNullimpl);
        }
        if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
            objM7377constructorimpl = null;
        }
        return (InterfaceC7973att) objM7377constructorimpl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC7973att _init_$lambda$4(String str) {
        Object objM7377constructorimpl;
        Intrinsics.checkNotNullParameter(str, "");
        try {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl((InterfaceC7973att) new Gson().fromJson(str, new TaskDescription().getType()));
        } catch (Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
            pUU.AEQbTJ("HybridWebView", "parse json to payload failed: ", thM7380exceptionOrNullimpl);
        }
        if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
            objM7377constructorimpl = null;
        }
        return (InterfaceC7973att) objM7377constructorimpl;
    }
}
