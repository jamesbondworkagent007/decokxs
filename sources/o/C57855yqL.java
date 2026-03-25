package o;

import android.support.v4.media.session.PlaybackStateCompat;
import com.engagelab.privates.push.constants.MTPushConstants;
import com.okinc.business.defi.biz.core.error.WalletImportError;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.InterfaceC57851yqH;
import okhttp3.Headers;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okio.BufferedSource;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yqL, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C57855yqL implements Interceptor {
    public static final Activity Companion = new Activity(null);
    public final java.nio.charset.Charset EZpvd = java.nio.charset.Charset.forName(com.google.android.exoplayer2.C.UTF8_NAME);

    /* JADX WARN: Removed duplicated region for block: B:26:0x00af A[LOOP:0: B:24:0x00a9->B:26:0x00af, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0188 A[LOOP:1: B:52:0x0182->B:54:0x0188, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01cc  */
    @Override // okhttp3.Interceptor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Response intercept(@NotNull Interceptor.Chain chain) throws java.lang.Exception {
        java.lang.String string;
        java.lang.String str;
        BufferedSource bufferedSourceSource;
        okio.Buffer buffer;
        ResponseBody responseBodyBody;
        java.lang.String strString;
        java.lang.String str2 = "";
        Intrinsics.checkNotNullParameter(chain, "");
        Request request = chain.request();
        RequestBody requestBodyBody = request.body();
        try {
            if (requestBodyBody == null) {
                str2 = "No payload";
            } else if (KWHzl(request.headers())) {
                str2 = "Encoded payload";
            } else if (requestBodyBody.contentLength() > PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM) {
                str2 = "Payload too large";
            } else {
                okio.Buffer buffer2 = new okio.Buffer();
                requestBodyBody.writeTo(buffer2);
                java.nio.charset.Charset charset = this.EZpvd;
                MediaType mediaTypeContentType = requestBodyBody.contentType();
                if (mediaTypeContentType != null) {
                    charset = mediaTypeContentType.charset(this.EZpvd);
                }
                if (OLrzqt(buffer2)) {
                    if (charset != null && (string = buffer2.readString(charset)) != null) {
                        str = string;
                    }
                    C57848yqE c57848yqE = C57848yqE.copydefault;
                    java.lang.String str3 = AbstractJsonLexerKt.BEGIN_LIST + request.method() + "] " + request.url();
                    Headers headers = request.headers();
                    java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(headers, 10));
                    for (kotlin.Pair<? extends java.lang.String, ? extends java.lang.String> pair : headers) {
                        arrayList.add(AbstractJsonLexerKt.BEGIN_LIST + pair.getFirst() + "] " + pair.getSecond());
                    }
                    InterfaceC57851yqH.TaskDescription.logNetwork$default(c57848yqE, true, str3, str, arrayList, null, 0L, null, WalletImportError.ERROR_CODE_AA_EXIST, null);
                    long jNanoTime = java.lang.System.nanoTime();
                    Response responseProceed = chain.proceed(request);
                    long millis = java.util.concurrent.TimeUnit.NANOSECONDS.toMillis(java.lang.System.nanoTime() - jNanoTime);
                    ResponseBody responseBodyBody2 = responseProceed.body();
                    MediaType mediaTypeContentType2 = responseBodyBody2 == null ? responseBodyBody2.contentType() : null;
                    strString = ((mediaTypeContentType2 == null && !Intrinsics.EZpvd((java.lang.Object) mediaTypeContentType2.subtype(), (java.lang.Object) MTPushConstants.Analysis.KEY_JSON)) || responseBodyBody2 == null || (bufferedSourceSource = responseBodyBody2.source()) == null || (buffer = bufferedSourceSource.getBuffer()) == null || !AEQbTJ(buffer) || (responseBodyBody = responseProceed.body()) == null) ? null : responseBodyBody.string();
                    C57848yqE c57848yqE2 = C57848yqE.copydefault;
                    java.lang.String str4 = AbstractJsonLexerKt.BEGIN_LIST + request.method() + "] " + responseProceed.code() + ' ' + request.url();
                    java.lang.String strMessage = strString != null ? responseProceed.message() : strString;
                    Headers headers2 = responseProceed.headers();
                    java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(headers2, 10));
                    for (kotlin.Pair<? extends java.lang.String, ? extends java.lang.String> pair2 : headers2) {
                        arrayList2.add(AbstractJsonLexerKt.BEGIN_LIST + pair2.getFirst() + "] " + pair2.getSecond());
                    }
                    InterfaceC57851yqH.TaskDescription.logNetwork$default(c57848yqE2, false, str4, strMessage, arrayList2, java.lang.Long.valueOf(millis), 0L, null, 96, null);
                    Response.Builder builderNewBuilder = responseProceed.newBuilder();
                    if (strString != null) {
                        ResponseBody responseBodyCreate = ResponseBody.Companion.create(strString, responseBodyBody2 != null ? responseBodyBody2.contentType() : null);
                        if (responseBodyCreate != null) {
                            responseBodyBody2 = responseBodyCreate;
                        }
                    }
                    return builderNewBuilder.body(responseBodyBody2).build();
                }
                str2 = "Binary payload, " + requestBodyBody.contentLength() + "-byte body";
            }
            Response responseProceed2 = chain.proceed(request);
            long millis2 = java.util.concurrent.TimeUnit.NANOSECONDS.toMillis(java.lang.System.nanoTime() - jNanoTime);
            ResponseBody responseBodyBody22 = responseProceed2.body();
            if (responseBodyBody22 == null) {
            }
            if (mediaTypeContentType2 == null) {
            }
            C57848yqE c57848yqE22 = C57848yqE.copydefault;
            java.lang.String str42 = AbstractJsonLexerKt.BEGIN_LIST + request.method() + "] " + responseProceed2.code() + ' ' + request.url();
            if (strString != null) {
            }
            Headers headers22 = responseProceed2.headers();
            java.util.ArrayList arrayList22 = new java.util.ArrayList(C56403yEb.AYXKKw(headers22, 10));
            while (r3.hasNext()) {
            }
            InterfaceC57851yqH.TaskDescription.logNetwork$default(c57848yqE22, false, str42, strMessage, arrayList22, java.lang.Long.valueOf(millis2), 0L, null, 96, null);
            Response.Builder builderNewBuilder2 = responseProceed2.newBuilder();
            if (strString != null) {
            }
            return builderNewBuilder2.body(responseBodyBody22).build();
        } catch (java.lang.Exception e) {
            C57848yqE c57848yqE3 = C57848yqE.copydefault;
            java.lang.String str5 = AbstractJsonLexerKt.BEGIN_LIST + request.method() + "] FAIL " + request.url();
            java.lang.String message = e.getMessage();
            if (message == null) {
                message = "HTTP Failed";
            }
            InterfaceC57851yqH.TaskDescription.logNetwork$default(c57848yqE3, false, str5, message, null, null, 0L, null, 120, null);
            throw e;
        }
        str = str2;
        C57848yqE c57848yqE4 = C57848yqE.copydefault;
        java.lang.String str32 = AbstractJsonLexerKt.BEGIN_LIST + request.method() + "] " + request.url();
        Headers headers3 = request.headers();
        java.util.ArrayList arrayList3 = new java.util.ArrayList(C56403yEb.AYXKKw(headers3, 10));
        while (r2.hasNext()) {
        }
        InterfaceC57851yqH.TaskDescription.logNetwork$default(c57848yqE4, true, str32, str, arrayList3, null, 0L, null, WalletImportError.ERROR_CODE_AA_EXIST, null);
        long jNanoTime2 = java.lang.System.nanoTime();
    }

    public final boolean OLrzqt(okio.Buffer buffer) {
        try {
            okio.Buffer buffer2 = new okio.Buffer();
            buffer.copyTo(buffer2, 0L, buffer.size() < 64 ? buffer.size() : 64L);
            for (int i = 0; i < 16; i++) {
                if (buffer2.exhausted()) {
                    return true;
                }
                int utf8CodePoint = buffer2.readUtf8CodePoint();
                if (java.lang.Character.isISOControl(utf8CodePoint) && !java.lang.Character.isWhitespace(utf8CodePoint)) {
                    return false;
                }
            }
            return true;
        } catch (java.io.EOFException unused) {
            return false;
        }
    }

    public final boolean KWHzl(Headers headers) {
        java.lang.String str = headers.get("Content-Encoding");
        return (str == null || C59449zhJ.gEmmrt(str, "identity", true) || C59449zhJ.gEmmrt(str, "gzip", true)) ? false : true;
    }

    public final boolean AEQbTJ(okio.Buffer buffer) {
        try {
            okio.Buffer buffer2 = new okio.Buffer();
            buffer.copyTo(buffer2, 0L, C56548yJl.AEQbTJ(buffer.size(), 64L));
            for (int i = 0; i < 16; i++) {
                if (buffer2.exhausted()) {
                    return true;
                }
                int utf8CodePoint = buffer2.readUtf8CodePoint();
                if (java.lang.Character.isISOControl(utf8CodePoint) && !java.lang.Character.isWhitespace(utf8CodePoint)) {
                    return false;
                }
            }
            return true;
        } catch (java.io.EOFException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: o.yqL$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.yqL.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }
}
