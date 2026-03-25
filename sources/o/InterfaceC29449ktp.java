package o;

import com.google.gson.JsonObject;
import com.okinc.network.okg.response.OKServerException;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ktp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public interface InterfaceC29449ktp {
    java.lang.Object KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, java.lang.String str3, java.lang.String str4, @NotNull java.lang.String str5, @NotNull java.lang.String str6, @NotNull Continuation<? super AbstractC43419rot<? extends java.util.List<? extends java.util.List<java.lang.String>>, OKServerException>> continuation);

    java.lang.Object copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull Continuation<? super AbstractC43419rot<JsonObject, OKServerException>> continuation);
}
