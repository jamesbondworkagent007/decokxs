package com.okinc.biz.util;

import com.alibaba.sdk.android.oss.common.OSSConstants;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.reflect.TypeToken;
import com.okinc.biz.util.UploadUtils;
import com.okinc.network.okg.core.ThreadPoolType;
import com.okinc.network.okg.dns.DohTypeEnum;
import com.okinc.network.okg.log.NetEventLogListener;
import com.okinc.network.proxy.SafeProxySelector;
import io.reactivex.BackpressureStrategy;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Dispatchers;
import o.AbstractC58185ywX;
import o.C33490mxT;
import o.C43292rmY;
import o.C43334rnN;
import o.C43337rnQ;
import o.C43357rnk;
import o.C43384roK;
import o.C56392yDr;
import o.C56444yFp;
import o.C58266yxz;
import o.C6881aXj;
import o.InterfaceC56387yDm;
import o.InterfaceC56445yFq;
import o.InterfaceC58184ywW;
import o.InterfaceC58187ywZ;
import o.pUU;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class UploadUtils {
    public static final UploadUtils OLrzqt = new UploadUtils();
    public static final InterfaceC56387yDm AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.aZh
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return UploadUtils.AEQbTJ();
        }
    });
    public static final int KWHzl = 8;

    private UploadUtils() {
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: loaded from: classes14.dex */
    public static final class UploadType {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ UploadType[] $VALUES;
        public static final UploadType NO_NEED_UPLOAD_TYPE = new UploadType("NO_NEED_UPLOAD_TYPE", 0);
        public static final UploadType LOG_TYPE = new UploadType("LOG_TYPE", 1);
        public static final UploadType APK_TYPE = new UploadType("APK_TYPE", 2);

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ UploadType[] $values() {
            return new UploadType[]{NO_NEED_UPLOAD_TYPE, LOG_TYPE, APK_TYPE};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<UploadType> getEntries() {
            return $ENTRIES;
        }

        private UploadType(String str, int i) {
        }

        static {
            UploadType[] uploadTypeArr$values = $values();
            $VALUES = uploadTypeArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(uploadTypeArr$values);
        }

        public static UploadType valueOf(String str) {
            return (UploadType) Enum.valueOf(UploadType.class, str);
        }

        public static UploadType[] values() {
            return (UploadType[]) $VALUES.clone();
        }
    }

    /* JADX INFO: loaded from: classes14.dex */
    public static final class StateListAnimator {
        public final UploadType EZpvd;
        public final boolean OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ StateListAnimator copy$default(StateListAnimator stateListAnimator, UploadType uploadType, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                uploadType = stateListAnimator.EZpvd;
            }
            if ((i & 2) != 0) {
                z = stateListAnimator.OLrzqt;
            }
            return stateListAnimator.EZpvd(uploadType, z);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean AEQbTJ() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final StateListAnimator EZpvd(@NotNull UploadType uploadType, boolean z) {
            Intrinsics.checkNotNullParameter(uploadType, "");
            return new StateListAnimator(uploadType, z);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final UploadType OLrzqt() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof StateListAnimator)) {
                return false;
            }
            StateListAnimator stateListAnimator = (StateListAnimator) obj;
            return this.EZpvd == stateListAnimator.EZpvd && this.OLrzqt == stateListAnimator.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (this.EZpvd.hashCode() * 31) + Boolean.hashCode(this.OLrzqt);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "CheckUploadResult(uploadType=" + this.EZpvd + ", allowMix=" + this.OLrzqt + ")";
        }

        public StateListAnimator(@NotNull UploadType uploadType, boolean z) {
            Intrinsics.checkNotNullParameter(uploadType, "");
            this.EZpvd = uploadType;
            this.OLrzqt = z;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 com.okinc.biz.util.UploadUtils$UploadType)
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? false : (r2v0 boolean))
 A[MD:(com.okinc.biz.util.UploadUtils$UploadType, boolean):void (m)] (LINE:56) call: com.okinc.biz.util.UploadUtils.StateListAnimator.<init>(com.okinc.biz.util.UploadUtils$UploadType, boolean):void type: THIS */
        public /* synthetic */ StateListAnimator(UploadType uploadType, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(uploadType, (i & 2) != 0 ? false : z);
        }
    }

    public final OkHttpClient OLrzqt() {
        return (OkHttpClient) AEQbTJ.getValue();
    }

    public static final OkHttpClient AEQbTJ() {
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        builder.readTimeout(30L, timeUnit);
        builder.connectTimeout(30L, timeUnit);
        C43292rmY c43292rmY = C43292rmY.OLrzqt;
        builder.retryOnConnectionFailure(!c43292rmY.AuCTel());
        DohTypeEnum dohTypeEnum = DohTypeEnum.HTTP;
        builder.dns(new C43337rnQ(dohTypeEnum));
        builder.eventListenerFactory(NetEventLogListener.Companion.OLrzqt(c43292rmY.DbNXlk(), NetEventLogListener.Companion.RequestType.NATIVE));
        builder.addInterceptor(new C43334rnN(dohTypeEnum));
        builder.addInterceptor(new C6881aXj());
        builder.dispatcher(C43357rnk.KWHzl.copydefault(ThreadPoolType.HTTP));
        builder.proxySelector(new SafeProxySelector(null, 1, 0 == true ? 1 : 0));
        return builder.build();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: com.okinc.biz.util.UploadUtils */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AbstractC58185ywX uploadFile$default(UploadUtils uploadUtils, String str, HashMap map, TypeToken typeToken, HashMap map2, HashMap map3, int i, Object obj) {
        if ((i & 8) != 0) {
            map2 = new HashMap();
        }
        HashMap map4 = map2;
        if ((i & 16) != 0) {
            map3 = new HashMap();
        }
        return uploadUtils.KWHzl(str, map, typeToken, map4, map3);
    }

    public final <T> AbstractC58185ywX<T> KWHzl(@NotNull final String str, @NotNull final HashMap<String, Object> map, @NotNull final TypeToken<T> typeToken, @NotNull final HashMap<String, String> map2, @NotNull final HashMap<String, String> map3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(typeToken, "");
        Intrinsics.checkNotNullParameter(map2, "");
        Intrinsics.checkNotNullParameter(map3, "");
        return AbstractC58185ywX.KWHzl(new InterfaceC58187ywZ() { // from class: o.aZi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58187ywZ
            public final void subscribe(InterfaceC58184ywW interfaceC58184ywW) {
                UploadUtils.copydefault(map, map2, str, map3, typeToken, interfaceC58184ywW);
            }
        }, BackpressureStrategy.BUFFER).copydefault(C43357rnk.KWHzl.EZpvd(ThreadPoolType.OTHER)).KWHzl(C58266yxz.OLrzqt());
    }

    /* JADX DEBUG: Class process forced to load method for inline: okhttp3.RequestBody.Companion.create$default(okhttp3.RequestBody$Companion, okhttp3.MediaType, byte[], int, int, int, java.lang.Object):okhttp3.RequestBody */
    public static final void copydefault(HashMap map, HashMap map2, String str, HashMap map3, TypeToken typeToken, InterfaceC58184ywW interfaceC58184ywW) {
        MultipartBody.Builder builderAddFormDataPart;
        Intrinsics.checkNotNullParameter(interfaceC58184ywW, "");
        try {
            pUU.valueOf("OKUploadLog", "uploadFile: " + Thread.currentThread());
            MultipartBody.Builder builder = new MultipartBody.Builder(null, 1, 0 == true ? 1 : 0);
            builder.setType(MultipartBody.FORM);
            ArrayList arrayList = new ArrayList(map.size());
            for (Map.Entry entry : map.entrySet()) {
                Object value = entry.getValue();
                if (value instanceof File) {
                    Object value2 = entry.getValue();
                    Intrinsics.copydefault(value2, "");
                    File file = (File) value2;
                    builderAddFormDataPart = builder.addFormDataPart((String) entry.getKey(), file.getName(), RequestBody.Companion.create(MediaType.Companion.parse(OSSConstants.DEFAULT_OBJECT_CONTENT_TYPE), file));
                } else if (value instanceof byte[]) {
                    Object value3 = entry.getValue();
                    Intrinsics.copydefault(value3, "");
                    byte[] bArr = (byte[]) value3;
                    String str2 = (String) map3.get(entry.getValue());
                    if (str2 == null) {
                        str2 = "";
                    }
                    builderAddFormDataPart = builder.addFormDataPart((String) entry.getKey(), str2, RequestBody.Companion.create$default(RequestBody.Companion, MediaType.Companion.parse(OSSConstants.DEFAULT_OBJECT_CONTENT_TYPE), bArr, 0, 0, 12, (Object) null));
                } else {
                    builderAddFormDataPart = builder.addFormDataPart((String) entry.getKey(), entry.getValue().toString());
                }
                arrayList.add(builderAddFormDataPart);
            }
            MultipartBody multipartBodyBuild = builder.build();
            Request.Builder builder2 = new Request.Builder();
            ArrayList arrayList2 = new ArrayList(map2.size());
            for (Map.Entry entry2 : map2.entrySet()) {
                arrayList2.add(builder2.addHeader((String) entry2.getKey(), (String) entry2.getValue()));
            }
            builder2.addHeader("User-Agent", C43384roK.KWHzl.copydefault());
            OLrzqt.OLrzqt().newCall(builder2.url(str).post(multipartBodyBuild).build()).enqueue(new Activity(interfaceC58184ywW, typeToken));
        } catch (Exception e) {
            interfaceC58184ywW.onError(e);
            pUU.AEQbTJ("tag", e);
        }
    }

    public static final class Activity implements Callback {
        public final /* synthetic */ TypeToken<T> EZpvd;
        public final /* synthetic */ InterfaceC58184ywW<T> copydefault;

        public Activity(InterfaceC58184ywW<T> interfaceC58184ywW, TypeToken<T> typeToken) {
            this.copydefault = interfaceC58184ywW;
            this.EZpvd = typeToken;
        }

        @Override // okhttp3.Callback
        public void onFailure(Call call, IOException iOException) {
            Intrinsics.checkNotNullParameter(call, "");
            Intrinsics.checkNotNullParameter(iOException, "");
            iOException.printStackTrace();
            this.copydefault.onError(iOException);
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // okhttp3.Callback
        public void onResponse(Call call, Response response) {
            String strString;
            Intrinsics.checkNotNullParameter(call, "");
            Intrinsics.checkNotNullParameter(response, "");
            try {
                ResponseBody responseBodyBody = response.body();
                if (responseBodyBody != null && (strString = responseBodyBody.string()) != null) {
                    TypeToken<T> typeToken = this.EZpvd;
                    InterfaceC58184ywW<T> interfaceC58184ywW = this.copydefault;
                    Object objKWHzl = C33490mxT.KWHzl(strString, typeToken);
                    if (objKWHzl != null) {
                        interfaceC58184ywW.onNext((T) objKWHzl);
                        interfaceC58184ywW.onComplete();
                    } else {
                        interfaceC58184ywW.onError(new NullPointerException("response body parse error."));
                        Unit unit = Unit.INSTANCE;
                    }
                } else {
                    this.copydefault.onError(new NullPointerException("response body is null."));
                }
            } catch (Exception e) {
                this.copydefault.onError(e);
                pUU.AEQbTJ("tag", e);
            }
        }
    }

    public static /* synthetic */ Object checkUploadLog$default(UploadUtils uploadUtils, Map map, CoroutineDispatcher coroutineDispatcher, String str, Continuation continuation, int i, Object obj) {
        if ((i & 2) != 0) {
            coroutineDispatcher = Dispatchers.getIO();
        }
        if ((i & 4) != 0) {
            str = null;
        }
        return uploadUtils.copydefault(map, coroutineDispatcher, str, continuation);
    }

    public final Object copydefault(@NotNull Map<String, String> map, @NotNull CoroutineDispatcher coroutineDispatcher, String str, @NotNull Continuation<? super StateListAnimator> continuation) {
        return BuildersKt.withContext(coroutineDispatcher, new UploadUtils$checkUploadLog$2(map, str, null), continuation);
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:29:0x005f */
    /* JADX DEBUG: Multi-variable search result rejected for r3v1, resolved type: java.lang.Object */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [kotlin.jvm.internal.DefaultConstructorMarker] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v3 */
    public final StateListAnimator AEQbTJ(Response response) {
        String strString;
        JsonObject jsonObjectOLrzqt;
        JsonElement jsonElement;
        JsonObject asJsonObject;
        JsonElement jsonElement2;
        JsonElement jsonElement3;
        JsonElement jsonElement4;
        int i = 2;
        Object asString = 0;
        asString = 0;
        boolean z = false;
        if (response.code() != 200) {
            return new StateListAnimator(UploadType.NO_NEED_UPLOAD_TYPE, z, i, asString);
        }
        ResponseBody responseBodyBody = response.body();
        if (responseBodyBody != null && (strString = responseBodyBody.string()) != null && (jsonObjectOLrzqt = C33490mxT.OLrzqt(strString)) != null && (jsonElement = jsonObjectOLrzqt.get("code")) != null && jsonElement.getAsInt() == 0 && (asJsonObject = jsonObjectOLrzqt.getAsJsonObject("data")) != null && (jsonElement2 = asJsonObject.get("logFlag")) != null && jsonElement2.getAsBoolean()) {
            JsonObject asJsonObject2 = jsonObjectOLrzqt.getAsJsonObject("data");
            if (asJsonObject2 != null && (jsonElement4 = asJsonObject2.get("allowMix")) != null && jsonElement4.getAsBoolean()) {
                z = true;
            }
            if (asJsonObject2 != null && (jsonElement3 = asJsonObject2.get("triggerMethod")) != null) {
                asString = jsonElement3.getAsString();
            }
            if (Intrinsics.EZpvd(asString, (Object) "apkUpload")) {
                return new StateListAnimator(UploadType.APK_TYPE, z);
            }
            return new StateListAnimator(UploadType.LOG_TYPE, z);
        }
        return new StateListAnimator(UploadType.NO_NEED_UPLOAD_TYPE, z, i, asString);
    }
}
