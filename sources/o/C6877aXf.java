package o;

import com.okinc.biz.net.common.UnitTestRealRequestException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.Response;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.aXf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6877aXf implements Interceptor {
    public static final ActionBar Companion = new ActionBar(null);

    @Override // okhttp3.Interceptor
    public Response intercept(@NotNull Interceptor.Chain chain) throws UnitTestRealRequestException {
        Intrinsics.checkNotNullParameter(chain, "");
        HttpUrl httpUrlUrl = chain.request().url();
        if (EZpvd(httpUrlUrl.host())) {
            return chain.proceed(chain.request());
        }
        java.lang.String str = "Not Allowed a real request in unit test：" + httpUrlUrl + ". Use MockWebServer instead or mock network layer";
        pUU.copydefault("BanRealRequestIntercept", str);
        throw new UnitTestRealRequestException(str);
    }

    public final boolean EZpvd(java.lang.String str) {
        java.util.List listGEmmrt = yDY.gEmmrt("localhost", "127.0.0.1");
        if ((listGEmmrt instanceof java.util.Collection) && listGEmmrt.isEmpty()) {
            return false;
        }
        java.util.Iterator it = listGEmmrt.iterator();
        while (it.hasNext()) {
            if (StringsKt__StringsKt.contains$default((java.lang.CharSequence) str, (java.lang.CharSequence) it.next(), false, 2, (java.lang.Object) null)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: o.aXf$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.aXf.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }
}
