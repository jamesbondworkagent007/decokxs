package o;

import com.amplifyframework.core.model.ModelIdentifier;
import com.google.api.client.json.Json;
import com.reown.android.internal.common.signing.eip1271.EIP1271Verifier;
import java.net.URLDecoder;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mKn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C31966mKn {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int KWHzl = 8;
    public static volatile C31966mKn copydefault;
    public android.os.Handler EZpvd = new android.os.Handler(android.os.Looper.getMainLooper());
    public final java.util.Set<java.lang.String> OLrzqt = yEE.AhwBna(EIP1271Verifier.mediaTypeString, Json.MEDIA_TYPE);
    public final java.util.Set<java.lang.String> AEQbTJ = yEE.AhwBna("application/x-www-form-urlencoded; charset=utf-8", "application/x-www-form-urlencoded; charset=UTF-8", "application/x-www-form-urlencoded");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd() {
        copydefault = null;
    }

    /* JADX INFO: renamed from: o.mKn$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.mKn.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final C31966mKn copydefault() {
            if (C31966mKn.copydefault == null) {
                synchronized (C56524yIo.AEQbTJ(C31966mKn.class)) {
                    if (C31966mKn.copydefault == null) {
                        ActionBar actionBar = C31966mKn.Companion;
                        C31966mKn.copydefault = new C31966mKn();
                    }
                    Unit unit = Unit.INSTANCE;
                }
            }
            return C31966mKn.copydefault;
        }
    }

    public final void OLrzqt(@NotNull final Request request, @NotNull final Response response, @NotNull final ResponseBody responseBody, @NotNull final Function1<? super mMQ, Unit> function1) {
        synchronized (this) {
            Intrinsics.checkNotNullParameter(request, "");
            Intrinsics.checkNotNullParameter(response, "");
            Intrinsics.checkNotNullParameter(responseBody, "");
            Intrinsics.checkNotNullParameter(function1, "");
            this.EZpvd.post(new java.lang.Runnable() { // from class: o.mKo
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() throws java.io.IOException {
                    C31966mKn.EZpvd(this.KWHzl, request, response, responseBody, function1);
                }
            });
        }
    }

    public static final void EZpvd(C31966mKn c31966mKn, Request request, Response response, ResponseBody responseBody, Function1 function1) throws java.io.IOException {
        function1.invoke(new mMQ(c31966mKn.OLrzqt(response.request()), response.request().method(), java.lang.String.valueOf(response.code()), (response.receivedResponseAtMillis() - response.sentRequestAtMillis()) + com.ibm.icu.text.DateFormat.MINUTE_SECOND, response.request().url(), response.headers(), response.request().headers(), responseBody.source().readUtf8()));
    }

    public final void AEQbTJ(@NotNull final Request request, @NotNull final java.lang.Exception exc, @NotNull final Function1<? super mMQ, Unit> function1) {
        synchronized (this) {
            Intrinsics.checkNotNullParameter(request, "");
            Intrinsics.checkNotNullParameter(exc, "");
            Intrinsics.checkNotNullParameter(function1, "");
            this.EZpvd.post(new java.lang.Runnable() { // from class: o.mKl
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    C31966mKn.AEQbTJ(this.copydefault, request, exc, function1);
                }
            });
        }
    }

    public static final void AEQbTJ(C31966mKn c31966mKn, Request request, java.lang.Exception exc, Function1 function1) {
        function1.invoke(new mMQ(c31966mKn.OLrzqt(request), request.method(), C43412rom.OLrzqt.OLrzqt(exc), AbstractJsonLexerKt.NULL, request.url(), null, request.headers(), new Regex(ModelIdentifier.Helper.PRIMARY_KEY_ENCAPSULATE_CHAR).replace(exc.toString(), "_")));
    }

    public final java.lang.String OLrzqt(Request request) {
        try {
            if (C59449zhJ.gEmmrt(request.method(), "GET", true)) {
                return "";
            }
            RequestBody requestBodyBody = request.body();
            Intrinsics.copydefault(requestBodyBody);
            java.lang.String strValueOf = java.lang.String.valueOf(requestBodyBody.contentType());
            if (!this.OLrzqt.contains(strValueOf) && !this.AEQbTJ.contains(strValueOf)) {
                return "not parse, contentType=" + strValueOf;
            }
            Request requestBuild = request.newBuilder().build();
            if (requestBuild.body() == null) {
                return AbstractJsonLexerKt.NULL;
            }
            okio.Buffer buffer = new okio.Buffer();
            RequestBody requestBodyBody2 = requestBuild.body();
            Intrinsics.copydefault(requestBodyBody2);
            requestBodyBody2.writeTo(buffer);
            java.lang.String utf8 = buffer.readUtf8();
            return !this.OLrzqt.contains(strValueOf) ? URLDecoder.decode(utf8, "utf-8") : utf8;
        } catch (java.lang.Exception e) {
            return e.toString();
        }
    }
}
