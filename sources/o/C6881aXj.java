package o;

import com.engagelab.privates.push.constants.MTPushConstants;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.aXj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6881aXj implements Interceptor {
    @Override // okhttp3.Interceptor
    public Response intercept(@NotNull Interceptor.Chain chain) {
        Intrinsics.checkNotNullParameter(chain, "");
        if (C43466rpn.OLrzqt.AEQbTJ(chain)) {
            return chain.proceed(chain.request());
        }
        Request.Builder builderHeader = chain.request().newBuilder().header("User-Agent", C43384roK.KWHzl.copydefault());
        java.lang.String strCopydefault = xVW.copydefault();
        Intrinsics.checkNotNullExpressionValue(strCopydefault, "");
        Request.Builder builderHeader2 = builderHeader.header("devId", strCopydefault).header(MTPushConstants.PlatformNode.KEY_PLATFORM, "android").header("real-app-version", C32979mnm.EZpvd.EZpvd()).header("x-utc", C6848aXC.EZpvd.EZpvd());
        copydefault(chain, builderHeader2);
        C43292rmY c43292rmY = C43292rmY.OLrzqt;
        java.lang.String strFARcdN = c43292rmY.fARcdN();
        if (strFARcdN != null && !StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strFARcdN)) {
            builderHeader2.header("lua-version", strFARcdN);
        }
        java.util.Map<java.lang.String, java.lang.String> mapValues = c43292rmY.values();
        if (mapValues != null) {
            for (Map.Entry<java.lang.String, java.lang.String> entry : mapValues.entrySet()) {
                builderHeader2.header(entry.getKey(), entry.getValue());
            }
        }
        java.lang.String strAhwBna = C43292rmY.OLrzqt.AhwBna();
        if (strAhwBna != null) {
            builderHeader2.header("app_web_mode", strAhwBna);
        }
        return chain.proceed(builderHeader2.build());
    }

    public final void copydefault(@NotNull Interceptor.Chain chain, @NotNull Request.Builder builder) {
        Intrinsics.checkNotNullParameter(chain, "");
        Intrinsics.checkNotNullParameter(builder, "");
        C43292rmY c43292rmY = C43292rmY.OLrzqt;
        Function2<Interceptor.Chain, Request.Builder, Unit> function2FetchVPNInfo = c43292rmY.fetchVPNInfo();
        if (function2FetchVPNInfo != null) {
            function2FetchVPNInfo.invoke(chain, builder);
            return;
        }
        for (Map.Entry<java.lang.String, java.lang.String> entry : c43292rmY.zLjUOn().entrySet()) {
            java.lang.String strHeader = chain.request().header(entry.getKey());
            if (strHeader == null || strHeader.length() == 0) {
                if (C33129mqd.OLrzqt((java.lang.CharSequence) entry.getValue())) {
                    builder.header(entry.getKey(), entry.getValue());
                }
            }
        }
    }
}
