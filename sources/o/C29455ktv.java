package o;

import com.google.gson.JsonObject;
import com.okinc.business.market.features.share.repository.ShareInfoRepoImpl$getDexTokenHlcCandles$2;
import com.okinc.business.market.features.share.repository.ShareInfoRepoImpl$getTokenShareInfo$2;
import com.okinc.network.okg.response.OKServerException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ktv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C29455ktv implements InterfaceC29449ktp {
    public final InterfaceC23229huL EZpvd;

    @yCM
    public C29455ktv(@NotNull InterfaceC23229huL interfaceC23229huL) {
        Intrinsics.checkNotNullParameter(interfaceC23229huL, "");
        this.EZpvd = interfaceC23229huL;
    }

    @Override // o.InterfaceC29449ktp
    public java.lang.Object copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull Continuation<? super AbstractC43419rot<JsonObject, OKServerException>> continuation) {
        return kAB.EZpvd(new ShareInfoRepoImpl$getTokenShareInfo$2(this, str, str2, null), continuation);
    }

    @Override // o.InterfaceC29449ktp
    public java.lang.Object KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, java.lang.String str3, java.lang.String str4, @NotNull java.lang.String str5, @NotNull java.lang.String str6, @NotNull Continuation<? super AbstractC43419rot<? extends java.util.List<? extends java.util.List<java.lang.String>>, OKServerException>> continuation) {
        return kAB.EZpvd(new ShareInfoRepoImpl$getDexTokenHlcCandles$2(this, str, str2, str3, str4, str5, str6, null), continuation);
    }
}
