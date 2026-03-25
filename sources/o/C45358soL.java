package o;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.okinc.network.okg.response.OKServerException;
import com.okinc.okex.common.util.ServerErrorField;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.soL, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C45358soL {
    public static /* synthetic */ java.lang.String serverErrorMessageOrDefault$default(java.lang.Throwable th, ServerErrorField serverErrorField, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            serverErrorField = ServerErrorField.ErrorMsg;
        }
        return EZpvd(th, serverErrorField);
    }

    public static final java.lang.String EZpvd(@NotNull java.lang.Throwable th, @NotNull ServerErrorField serverErrorField) {
        java.lang.String message;
        JsonElement jsonElement;
        java.lang.String asString;
        Intrinsics.checkNotNullParameter(th, "");
        Intrinsics.checkNotNullParameter(serverErrorField, "");
        if (th instanceof OKServerException) {
            JsonObject response = ((OKServerException) th).getResponse();
            if (response != null && (jsonElement = response.get(serverErrorField.getFieldName())) != null && (asString = jsonElement.getAsString()) != null) {
                return asString;
            }
            java.lang.String message2 = th.getMessage();
            return message2 == null ? C43422row.OLrzqt() : message2;
        }
        java.lang.Throwable cause = th.getCause();
        return (cause == null || (message = cause.getMessage()) == null) ? C43422row.OLrzqt() : message;
    }
}
