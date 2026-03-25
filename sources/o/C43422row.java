package o;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.okinc.network.okg.config.NetworkStringEnum;
import com.okinc.network.okg.response.OKServerException;
import com.okinc.network.okg.response.ResponseData;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Request;
import org.jetbrains.annotations.NotNull;
import retrofit2.Invocation;

/* JADX INFO: renamed from: o.row, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C43422row {
    public static final JsonObject AEQbTJ(java.lang.Throwable th) {
        if (th instanceof OKServerException) {
            return ((OKServerException) th).getResponse();
        }
        return null;
    }

    public static final OKServerException OLrzqt(@NotNull java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        if (th instanceof OKServerException) {
            return (OKServerException) th;
        }
        pUU.KWHzl("OKServerException", "got network error msg from getException");
        return new OKServerException(0, OLrzqt(), null, th, 5, null);
    }

    public static final java.lang.String OLrzqt() {
        java.lang.String strInvoke;
        Function1<NetworkStringEnum, java.lang.String> function1ZsXlph = C43292rmY.OLrzqt.zsXlph();
        return (function1ZsXlph == null || (strInvoke = function1ZsXlph.invoke(NetworkStringEnum.NETWORK_ERROR)) == null) ? "" : strInvoke;
    }

    public static final java.lang.String AEQbTJ(@NotNull ResponseData<?> responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        return OLrzqt(responseData.getMsg());
    }

    public static final java.lang.String OLrzqt(@NotNull JsonObject jsonObject) {
        Intrinsics.checkNotNullParameter(jsonObject, "");
        JsonElement jsonElement = jsonObject.get("msg");
        return OLrzqt(jsonElement != null ? jsonElement.getAsString() : null);
    }

    public static final java.lang.String OLrzqt(java.lang.String str) {
        if (C33129mqd.OLrzqt((java.lang.CharSequence) str)) {
            Intrinsics.copydefault((java.lang.Object) str);
            return str;
        }
        pUU.KWHzl("OKServerException", "got network error msg from getExceptionMessage");
        return OLrzqt();
    }

    public static final <T extends java.lang.annotation.Annotation> T AEQbTJ(@NotNull Request request, @NotNull java.lang.Class<T> cls) {
        java.lang.reflect.Method method;
        Intrinsics.checkNotNullParameter(request, "");
        Intrinsics.checkNotNullParameter(cls, "");
        Invocation invocation = (Invocation) request.tag(Invocation.class);
        if (invocation == null || (method = invocation.method()) == null) {
            return null;
        }
        return (T) method.getAnnotation(cls);
    }
}
