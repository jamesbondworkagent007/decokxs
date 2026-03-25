package o;

import com.okinc.business.defi.biz.net.interceptor.WalletJwtInterceptor$intercept$1;
import com.okinc.business.defi.wallet.jwt.WalletJwtErrorCode;
import com.reown.foundation.util.jwt.JwtUtilsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementKt;
import kotlinx.serialization.json.JsonObject;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import okio.ByteString;
import org.jetbrains.annotations.NotNull;
import retrofit2.Invocation;

/* JADX INFO: renamed from: o.dbl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C13925dbl implements Interceptor {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int copydefault = 8;
    public final InterfaceC18439fiS AEQbTJ;
    public final C12827cuN EZpvd;
    public final C8342bAs KWHzl;
    public final C18438fiR OLrzqt;

    public C13925dbl(@NotNull C12827cuN c12827cuN, @NotNull InterfaceC18439fiS interfaceC18439fiS, @NotNull C8342bAs c8342bAs, @NotNull C18438fiR c18438fiR) {
        Intrinsics.checkNotNullParameter(c12827cuN, "");
        Intrinsics.checkNotNullParameter(interfaceC18439fiS, "");
        Intrinsics.checkNotNullParameter(c8342bAs, "");
        Intrinsics.checkNotNullParameter(c18438fiR, "");
        this.EZpvd = c12827cuN;
        this.AEQbTJ = interfaceC18439fiS;
        this.KWHzl = c8342bAs;
        this.OLrzqt = c18438fiR;
    }

    /* JADX INFO: renamed from: o.dbl$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.dbl.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    @Override // okhttp3.Interceptor
    public Response intercept(@NotNull Interceptor.Chain chain) throws java.io.IOException {
        java.lang.reflect.Method method;
        Intrinsics.checkNotNullParameter(chain, "");
        Request request = chain.request();
        Invocation invocation = (Invocation) request.tag(Invocation.class);
        if (invocation == null || (method = invocation.method()) == null) {
            return chain.proceed(request);
        }
        InterfaceC9841bdG[] interfaceC9841bdGArr = (InterfaceC9841bdG[]) method.getAnnotationsByType(InterfaceC9841bdG.class);
        if (interfaceC9841bdGArr == null || ((InterfaceC9841bdG) yDV.zsXlph(interfaceC9841bdGArr)) == null) {
            return chain.proceed(request);
        }
        AbstractC12782ctV abstractC12782ctV = (AbstractC12782ctV) CollectionsKt___CollectionsKt.firstOrNull(this.EZpvd.copydefault());
        if (abstractC12782ctV == null) {
            return chain.proceed(request);
        }
        if (abstractC12782ctV.AubY() || abstractC12782ctV.QVAiDq() || abstractC12782ctV.AwvSrB()) {
            return (Response) BuildersKt__BuildersKt.runBlocking$default(null, new WalletJwtInterceptor$intercept$1(this, abstractC12782ctV.DbNXlk(), request.newBuilder(), chain, null), 1, null);
        }
        return chain.proceed(request);
    }

    public final boolean EZpvd(java.lang.String str) {
        java.lang.String str2;
        java.lang.String strUtf8;
        if (str == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str) || (str2 = (java.lang.String) CollectionsKt___CollectionsKt.AkhnZx(StringsKt__StringsKt.split$default((java.lang.CharSequence) str, new java.lang.String[]{JwtUtilsKt.JWT_DELIMITER}, false, 0, 6, (java.lang.Object) null), 1)) == null) {
            return false;
        }
        ByteString byteStringDecodeBase64 = ByteString.Companion.decodeBase64(str2);
        JsonObject jsonObject = (byteStringDecodeBase64 == null || (strUtf8 = byteStringDecodeBase64.utf8()) == null) ? null : (JsonObject) C54907xZt.OLrzqt(JsonObject.Companion.serializer(), strUtf8);
        if (jsonObject == null || jsonObject.isEmpty()) {
            C18443fiW.trackWalletJwtError$default(WalletJwtErrorCode.DECODE_JWT_ERROR, "empty payloadJson", 0, 4, null);
            return false;
        }
        JsonElement jsonElement = (JsonElement) jsonObject.get((java.lang.Object) "expireTime");
        if (jsonElement == null) {
            C18443fiW.trackWalletJwtError$default(WalletJwtErrorCode.DECODE_JWT_ERROR, "invalid expireTime", 0, 4, null);
            return false;
        }
        java.lang.Long longOrNull = JsonElementKt.getLongOrNull(JsonElementKt.getJsonPrimitive(jsonElement));
        if (longOrNull != null) {
            return longOrNull.longValue() > 0 && longOrNull.longValue() - java.lang.System.currentTimeMillis() > 15000;
        }
        C18443fiW.trackWalletJwtError$default(WalletJwtErrorCode.DECODE_JWT_ERROR, "expireTime is null", 0, 4, null);
        return false;
    }
}
