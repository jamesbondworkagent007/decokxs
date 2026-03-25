package o;

import com.okinc.base.utils.commmon.ThreadUtils;
import com.okinc.okuser.data.Token;
import com.okinc.okuser.data.TokenType;
import com.okinc.okuser.data.User;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import okhttp3.Cookie;
import okhttp3.CookieJar;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ygg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C57346ygg implements CookieJar {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int KWHzl = 8;
    public final Function0<java.lang.String> EZpvd;
    public final android.webkit.CookieManager OLrzqt;

    public C57346ygg(@NotNull Function0<java.lang.String> function0, @NotNull android.webkit.CookieManager cookieManager) {
        Intrinsics.checkNotNullParameter(function0, "");
        Intrinsics.checkNotNullParameter(cookieManager, "");
        this.EZpvd = function0;
        this.OLrzqt = cookieManager;
    }

    @Override // okhttp3.CookieJar
    public void saveFromResponse(@NotNull HttpUrl httpUrl, @NotNull java.util.List<Cookie> list) {
        Intrinsics.checkNotNullParameter(httpUrl, "");
        Intrinsics.checkNotNullParameter(list, "");
        android.webkit.CookieManager cookieManager = this.OLrzqt;
        java.lang.String string = AEQbTJ(httpUrl).toString();
        pUU.EZpvd("OKWebViewCookieJar", "save cookie from " + httpUrl + " to domain " + string);
        for (Cookie cookie : list) {
            pUU.EZpvd("OKWebViewCookieJar", "\t" + cookie);
            cookieManager.setCookie(string, buildOK$default(this, cookie, null, 1, null).toString());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x006d  */
    @Override // okhttp3.CookieJar
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.util.List<Cookie> loadForRequest(@NotNull HttpUrl httpUrl) {
        java.lang.String tk;
        java.util.List listAhwBna;
        Intrinsics.checkNotNullParameter(httpUrl, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.String cookie = this.OLrzqt.getCookie(AEQbTJ(httpUrl).toString());
        if (cookie != null && !android.text.TextUtils.isEmpty(cookie)) {
            java.util.List<java.lang.String> listSplit = new Regex(";").split(cookie, 0);
            if (!listSplit.isEmpty()) {
                java.util.ListIterator<java.lang.String> listIterator = listSplit.listIterator(listSplit.size());
                while (listIterator.hasPrevious()) {
                    if (listIterator.previous().length() != 0) {
                        listAhwBna = CollectionsKt___CollectionsKt.AhwBna((java.lang.Iterable) listSplit, listIterator.nextIndex() + 1);
                        break;
                    }
                }
                listAhwBna = yDY.AhwBna();
                for (java.lang.String str : (java.lang.String[]) listAhwBna.toArray(new java.lang.String[0])) {
                    Cookie cookie2 = Cookie.Companion.parse(httpUrl, str);
                    if (cookie2 != null && !Intrinsics.EZpvd((java.lang.Object) cookie2.name(), (java.lang.Object) "devId") && !Intrinsics.EZpvd((java.lang.Object) cookie2.name(), (java.lang.Object) "_tk") && !Intrinsics.EZpvd((java.lang.Object) cookie2.name(), (java.lang.Object) "simulatedTrading")) {
                        arrayList.add(buildOK$default(this, cookie2, null, 1, null));
                    }
                }
            } else {
                listAhwBna = yDY.AhwBna();
                while (i < r6) {
                }
            }
        }
        java.lang.String strCopydefault = xVW.copydefault();
        Intrinsics.checkNotNullExpressionValue(strCopydefault, "");
        arrayList.add(copydefault("devId", strCopydefault));
        C43292rmY c43292rmY = C43292rmY.OLrzqt;
        User userOLrzqt = c43292rmY.AwvSrB().OLrzqt();
        if (userOLrzqt != null && (tk = userOLrzqt.getTk()) != null) {
            arrayList.add(copydefault("_tk", tk));
        }
        Token tokenAhwBna = c43292rmY.AwvSrB().AhwBna();
        if (tokenAhwBna != null && tokenAhwBna.getType() == TokenType.DEMO_TRADING) {
            arrayList.add(copydefault("simulatedTrading", "1"));
        }
        pUU.EZpvd("OKWebViewCookieJar", "set cookie for " + httpUrl);
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            pUU.EZpvd("OKWebViewCookieJar", "\t" + ((Cookie) it.next()));
        }
        return arrayList;
    }

    public final HttpUrl AEQbTJ(HttpUrl httpUrl) {
        return httpUrl.newBuilder().host(this.EZpvd.invoke()).build();
    }

    public static /* synthetic */ Cookie buildOK$default(C57346ygg c57346ygg, Cookie cookie, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        return c57346ygg.EZpvd(cookie, str);
    }

    public final Cookie EZpvd(Cookie cookie, java.lang.String str) {
        Cookie.Builder builderName = new Cookie.Builder().name(cookie.name());
        if (str == null) {
            str = cookie.value();
        }
        Cookie.Builder builderPath = builderName.value(str).expiresAt(cookie.expiresAt()).path(cookie.path());
        if (cookie.secure()) {
            builderPath.secure();
        }
        if (cookie.httpOnly()) {
            builderPath.httpOnly();
        }
        if (cookie.hostOnly()) {
            builderPath.hostOnlyDomain(this.EZpvd.invoke());
        } else {
            builderPath.domain(this.EZpvd.invoke());
        }
        return builderPath.build();
    }

    public final void KWHzl() {
        ThreadUtils.copydefault(new java.lang.Runnable() { // from class: o.ygm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C57346ygg.copydefault(this.EZpvd);
            }
        });
    }

    public static final void copydefault(C57346ygg c57346ygg) {
        java.lang.String strInvoke = c57346ygg.EZpvd.invoke();
        pUU.KWHzl("OKWebViewCookieJar", "initDefaultCookie for " + strInvoke);
        c57346ygg.OLrzqt.setCookie(strInvoke, "devId=" + xVW.copydefault());
        C43292rmY c43292rmY = C43292rmY.OLrzqt;
        User userOLrzqt = c43292rmY.AwvSrB().OLrzqt();
        java.lang.String tk = userOLrzqt != null ? userOLrzqt.getTk() : null;
        if (tk != null) {
            c57346ygg.OLrzqt.setCookie(strInvoke, "_tk=" + tk);
        } else {
            c57346ygg.AEQbTJ("_tk", strInvoke);
        }
        Token tokenAhwBna = c43292rmY.AwvSrB().AhwBna();
        if (tokenAhwBna != null) {
            if (tokenAhwBna.getType() == TokenType.DEMO_TRADING) {
                c57346ygg.OLrzqt.setCookie(strInvoke, "simulatedTrading=1");
            } else {
                c57346ygg.AEQbTJ("simulatedTrading", strInvoke);
            }
        }
    }

    public final void AEQbTJ(java.lang.String str, java.lang.String str2) {
        this.OLrzqt.setCookie(str2, str + "=; Expires=Thu, 01 Jan 1970 00:00:01 GMT");
    }

    public final Cookie copydefault(java.lang.String str, java.lang.String str2) {
        return new Cookie.Builder().name(str).value(str2).domain(this.EZpvd.invoke()).build();
    }

    /* JADX INFO: renamed from: o.ygg$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.ygg.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }
}
