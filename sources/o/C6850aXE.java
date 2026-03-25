package o;

import java.util.UUID;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.aXE, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6850aXE implements Interceptor {
    public static final TaskDescription Companion = new TaskDescription(null);

    /* JADX INFO: renamed from: o.aXE$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.aXE.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    @Override // okhttp3.Interceptor
    public Response intercept(@NotNull Interceptor.Chain chain) {
        Intrinsics.checkNotNullParameter(chain, "");
        Request request = chain.request();
        java.lang.String strEncodedPath = request.url().encodedPath();
        java.lang.String strEZpvd = EZpvd(strEncodedPath);
        Function2<java.lang.String, java.lang.String, Unit> function2UzCIH = C43292rmY.OLrzqt.uzCIH();
        if (function2UzCIH != null) {
            function2UzCIH.invoke(strEncodedPath, strEZpvd);
        }
        Request.Builder builderNewBuilder = request.newBuilder();
        builderNewBuilder.header("x-id", strEZpvd);
        return chain.proceed(builderNewBuilder.build());
    }

    public final java.lang.String EZpvd(java.lang.String str) {
        java.lang.String strAEQbTJ = C33485mxO.AEQbTJ(xVW.copydefault() + "_" + str + "_" + UUID.randomUUID());
        Intrinsics.checkNotNullExpressionValue(strAEQbTJ, "");
        return strAEQbTJ;
    }
}
