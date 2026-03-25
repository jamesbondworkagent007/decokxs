package o;

import android.net.Uri;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.okinc.components.report.EventAction;
import com.okinc.components.report.ReportManager;
import com.okinc.components.report.db.EventData;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yhd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C57396yhd {
    public final InterfaceC56387yDm AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.yhh
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C57396yhd.OLrzqt();
        }
    });

    public static /* synthetic */ void reportUrlLoading$default(C57396yhd c57396yhd, android.net.Uri uri, android.webkit.WebResourceResponse webResourceResponse, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            webResourceResponse = null;
        }
        c57396yhd.EZpvd(uri, webResourceResponse);
    }

    public final void EZpvd(@NotNull android.net.Uri uri, android.webkit.WebResourceResponse webResourceResponse) {
        java.lang.String string;
        Intrinsics.checkNotNullParameter(uri, "");
        java.lang.String scheme = uri.getScheme();
        if (scheme == null) {
            scheme = "";
        }
        java.lang.String authority = uri.getAuthority();
        if (authority == null) {
            authority = "";
        }
        java.lang.String str = scheme + "://" + authority;
        java.lang.String path = uri.getPath();
        if (path == null) {
            path = "";
        }
        java.lang.String str2 = str + path;
        try {
            Uri.Builder builderBuildUpon = uri.buildUpon();
            builderBuildUpon.clearQuery();
            java.util.Set<java.lang.String> queryParameterNames = uri.getQueryParameterNames();
            Intrinsics.checkNotNullExpressionValue(queryParameterNames, "");
            for (java.lang.String str3 : queryParameterNames) {
                if (!Intrinsics.EZpvd((java.lang.Object) str3, (java.lang.Object) RequestParameters.OSS_ACCESS_KEY_ID) && !Intrinsics.EZpvd((java.lang.Object) str3, (java.lang.Object) RequestParameters.SIGNATURE)) {
                    builderBuildUpon.appendQueryParameter(str3, uri.getQueryParameter(str3));
                }
            }
            string = builderBuildUpon.build().toString();
        } catch (java.lang.Exception unused) {
            string = uri.toString();
        }
        Intrinsics.copydefault((java.lang.Object) string);
        pUU.EZpvd("UrlLoadingReporter", "reportUrlLoading: " + string);
        EventData eventData = new EventData();
        eventData.setAct(EventAction.WEBVIEW.getType());
        if (webResourceResponse != null) {
            eventData.setCode(java.lang.String.valueOf(webResourceResponse.getStatusCode()));
            eventData.setMsg(webResourceResponse.getReasonPhrase());
        }
        ReportManager reportManager = ReportManager.AEQbTJ;
        eventData.setAttribute(C56424yEw.djBIcL(C56390yDp.OLrzqt("path", str2), C56390yDp.OLrzqt("base_url", str), C56390yDp.OLrzqt("full_url", string)));
        reportManager.EZpvd(eventData);
    }

    public final java.util.List<java.lang.String> EZpvd() {
        return (java.util.List) this.AEQbTJ.getValue();
    }

    public static final java.util.List OLrzqt() {
        return yDY.gEmmrt("/zh-hans", "/zh-hant", "/nl", "/fr", "/id", "/ru", "/vi", "/de", "/it", "/pl", "/pt-pt", "/pt-br", "/es-es", "/es-la", "/cs", "/ro", "/ua", "/ar");
    }

    public final void EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (C59449zhJ.gEmmrt("en", java.util.Locale.getDefault().getLanguage(), true)) {
            return;
        }
        java.lang.String path = android.net.Uri.parse(str).getPath();
        if (path == null) {
            path = str;
        }
        java.util.List<java.lang.String> listEZpvd = EZpvd();
        if (!(listEZpvd instanceof java.util.Collection) || !listEZpvd.isEmpty()) {
            java.util.Iterator<T> it = listEZpvd.iterator();
            while (it.hasNext()) {
                if (C59449zhJ.AYXKKw(path, (java.lang.String) it.next(), true)) {
                    return;
                }
            }
        }
        EventData eventData = new EventData();
        eventData.setAct("web_langpath");
        ReportManager reportManager = ReportManager.AEQbTJ;
        eventData.setAttribute(C56423yEv.EZpvd(C56390yDp.OLrzqt("path", str)));
        reportManager.EZpvd(eventData);
    }
}
