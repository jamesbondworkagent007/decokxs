package o;

import android.graphics.BitmapFactory;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.okinc.components.report.ReportManager;
import com.okinc.components.report.db.EventData;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okio.BufferedSource;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mfc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C32545mfc implements Interceptor {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final java.util.List<java.lang.String> OLrzqt = C56402yEa.EZpvd(RequestParameters.OSS_ACCESS_KEY_ID);

    /* JADX DEBUG: Another duplicated slice has different insns count: {[]}, finally: {[THROW, INVOKE, MOVE_EXCEPTION, THROW, MOVE_EXCEPTION] complete} */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    @Override // okhttp3.Interceptor
    public Response intercept(@NotNull Interceptor.Chain chain) throws java.io.IOException {
        ResponseBody responseBodyBody;
        Intrinsics.checkNotNullParameter(chain, "");
        Request request = chain.request();
        Response responseProceed = chain.proceed(request);
        if ((!C43386roM.EZpvd.copydefault(request.url().toString()) && !C55297xhL.copydefault().contains(request.url().host())) || (responseBodyBody = responseProceed.body()) == null) {
            return responseProceed;
        }
        try {
            BufferedSource bufferedSourceSource = responseBodyBody.source();
            bufferedSourceSource.request(30L);
            okio.Buffer bufferClone = bufferedSourceSource.getBuffer().clone();
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            java.io.InputStream inputStream = bufferClone.inputStream();
            try {
                BitmapFactory.decodeStream(inputStream, null, options);
                yFA.copydefault(inputStream, null);
                ReportManager reportManager = ReportManager.AEQbTJ;
                EventData eventData = new EventData();
                eventData.setPath(C6767aVb.Companion.OLrzqt().EZpvd());
                eventData.setAct("img_info");
                java.util.HashMap map = new java.util.HashMap();
                map.put("pic_url", copydefault(request.url().toString()));
                map.put("pic_size", java.lang.String.valueOf(options.outWidth * options.outHeight));
                eventData.setAttrs(map);
                reportManager.EZpvd(eventData);
                Unit unit = Unit.INSTANCE;
            } finally {
            }
        } catch (java.lang.OutOfMemoryError e) {
            java.lang.String message = e.getMessage();
            if (message != null) {
                pUU.copydefault(message);
                Unit unit2 = Unit.INSTANCE;
            }
        }
        return responseProceed;
    }

    public final java.lang.String copydefault(java.lang.String str) {
        HttpUrl httpUrl = HttpUrl.Companion.parse(str);
        if (httpUrl == null) {
            return str;
        }
        HttpUrl.Builder builderNewBuilder = httpUrl.newBuilder();
        java.util.Iterator<T> it = OLrzqt.iterator();
        while (it.hasNext()) {
            builderNewBuilder.removeAllQueryParameters((java.lang.String) it.next());
        }
        java.lang.String string = builderNewBuilder.build().toString();
        pUU.EZpvd("ImageInfoInterceptor", "removeInsecureParams: " + string);
        return string;
    }

    /* JADX INFO: renamed from: o.mfc$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.mfc.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }
}
