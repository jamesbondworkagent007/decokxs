package com.okinc.liveness.lca.debugtool.data;

import android.os.Handler;
import android.os.Looper;
import com.google.common.primitives.UnsignedBytes;
import com.google.gson.Gson;
import com.okinc.liveness.lca.LcaSdkConfiguration;
import com.okinc.liveness.lca.debugtool.data.LcaDebugAiAlgoRepository;
import com.okinc.liveness.lca.utils.LcaMediaUtils;
import java.io.File;
import java.io.IOException;
import java.security.SecureRandom;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import o.pUU;
import o.yDV;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.MultipartBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes23.dex */
public final class LcaDebugAiAlgoRepository {
    public static final String BASE_URL = "";
    public static final String TAG = "LivenessDebugApiRemote";
    public static final String TOKEN = "";
    public static volatile LcaDebugAiAlgoRepository instance;
    public final OkHttpClient client;
    public final Gson gson;
    public final SecureRandom secureRandom;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.liveness.lca.debugtool.data.LcaDebugAiAlgoRepository.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ LcaDebugAiAlgoRepository(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.liveness.lca.debugtool.data.LcaDebugAiAlgoRepository.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final LcaDebugAiAlgoRepository getInstance() {
            LcaDebugAiAlgoRepository lcaDebugAiAlgoRepository = LcaDebugAiAlgoRepository.instance;
            if (lcaDebugAiAlgoRepository == null) {
                synchronized (this) {
                    lcaDebugAiAlgoRepository = LcaDebugAiAlgoRepository.instance;
                    if (lcaDebugAiAlgoRepository == null) {
                        lcaDebugAiAlgoRepository = new LcaDebugAiAlgoRepository(null);
                        Companion companion = LcaDebugAiAlgoRepository.Companion;
                        LcaDebugAiAlgoRepository.instance = lcaDebugAiAlgoRepository;
                    }
                }
            }
            return lcaDebugAiAlgoRepository;
        }
    }

    private LcaDebugAiAlgoRepository() {
        this.client = new OkHttpClient();
        this.gson = new Gson();
        this.secureRandom = SecureRandom.getInstance("SHA1PRNG");
    }

    public final void uploadVideo(@NotNull File file, long j, long j2, long j3, int i, int i2, long j4, @NotNull List<ColorEvent> list, int i3, @NotNull Function1<? super LivenessResponse, Unit> function1, @NotNull Function1<? super String, Unit> function12) throws JSONException {
        Intrinsics.checkNotNullParameter(file, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function12, "");
        String strGenerateEventDescription = generateEventDescription(j, j2, j3, i, i2, j4, list);
        pUU.KWHzl(TAG, strGenerateEventDescription);
        String str = i3 == LcaSdkConfiguration.Companion.getAPI_DATA_COLLECTION() ? "/data-collection" : "/model-prediction";
        MultipartBody.Part partCreateFormData = MultipartBody.Part.Companion.createFormData("file", file.getName(), RequestBody.Companion.create(file, LcaMediaUtils.INSTANCE.getMediaTypeFromFile(file)));
        String strGenerateRequestId = generateRequestId();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("description", strGenerateEventDescription);
        jSONObject.put("request_id", strGenerateRequestId);
        LcaDebugInfo lcaDebugInfo = new LcaDebugInfo(null, null, null, null, 15, null);
        lcaDebugInfo.setRequestRawJson(jSONObject.toString());
        MultipartBody multipartBodyBuild = new MultipartBody.Builder(null, 1, null).setType(MultipartBody.FORM).addPart(partCreateFormData).addFormDataPart("description", strGenerateEventDescription).addFormDataPart("request_id", strGenerateRequestId).build();
        pUU.KWHzl(TAG, "url=" + str);
        this.client.newCall(new Request.Builder().url(str).post(multipartBodyBuild).addHeader("Authorization", "Bearer ").build()).enqueue(new AnonymousClass1(function12, lcaDebugInfo, i3, this, function1));
    }

    /* JADX INFO: renamed from: com.okinc.liveness.lca.debugtool.data.LcaDebugAiAlgoRepository$uploadVideo$1, reason: invalid class name */
    public static final class AnonymousClass1 implements Callback {
        public final /* synthetic */ int $apiMode;
        public final /* synthetic */ LcaDebugInfo $lcaDebugInfo;
        public final /* synthetic */ Function1<String, Unit> $onError;
        public final /* synthetic */ Function1<LivenessResponse, Unit> $onSuccess;
        public final /* synthetic */ LcaDebugAiAlgoRepository this$0;

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> */
        /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: kotlin.jvm.functions.Function1<? super com.okinc.liveness.lca.debugtool.data.LivenessResponse, kotlin.Unit> */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(Function1<? super String, Unit> function1, LcaDebugInfo lcaDebugInfo, int i, LcaDebugAiAlgoRepository lcaDebugAiAlgoRepository, Function1<? super LivenessResponse, Unit> function12) {
            this.$onError = function1;
            this.$lcaDebugInfo = lcaDebugInfo;
            this.$apiMode = i;
            this.this$0 = lcaDebugAiAlgoRepository;
            this.$onSuccess = function12;
        }

        @Override // okhttp3.Callback
        public void onFailure(Call call, final IOException iOException) {
            Intrinsics.checkNotNullParameter(call, "");
            Intrinsics.checkNotNullParameter(iOException, "");
            Handler handler = new Handler(Looper.getMainLooper());
            final Function1<String, Unit> function1 = this.$onError;
            handler.post(new Runnable() { // from class: com.okinc.liveness.lca.debugtool.data.LcaDebugAiAlgoRepository$uploadVideo$1$$ExternalSyntheticLambda0
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    LcaDebugAiAlgoRepository.AnonymousClass1.onFailure$lambda$0(function1, iOException);
                }
            });
        }

        public static final void onFailure$lambda$0(Function1 function1, IOException iOException) {
            String message = iOException.getMessage();
            if (message == null) {
                message = "Upload failed";
            }
            function1.invoke(message);
        }

        @Override // okhttp3.Callback
        public void onResponse(Call call, Response response) {
            Intrinsics.checkNotNullParameter(call, "");
            Intrinsics.checkNotNullParameter(response, "");
            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getIO()), null, null, new LcaDebugAiAlgoRepository$uploadVideo$1$onResponse$1(response, this.$lcaDebugInfo, this.$apiMode, this.this$0, this.$onSuccess, this.$onError, null), 3, null);
        }
    }

    public final String generateEventDescription(long j, long j2, long j3, int i, int i2, long j4, List<ColorEvent> list) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new VideoEvent(Long.valueOf(j), null, null, null, null, null, 62, null));
        arrayList.add(new VideoEvent(null, null, Long.valueOf(j3), Long.valueOf(j4), Integer.valueOf(i), Integer.valueOf(i2), 3, null));
        arrayList.addAll(list);
        arrayList.add(new VideoEvent(null, Long.valueOf(j2), null, null, null, null, 61, null));
        String json = this.gson.toJson(arrayList);
        Intrinsics.checkNotNullExpressionValue(json, "");
        return json;
    }

    public final String generateRequestId() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd_HHmmss", Locale.ROOT);
        simpleDateFormat.setTimeZone(TimeZone.getDefault());
        String str = simpleDateFormat.format(Long.valueOf(System.currentTimeMillis()));
        byte[] bArr = new byte[8];
        this.secureRandom.nextBytes(bArr);
        return str + "_android_" + CollectionsKt___CollectionsKt.joinToString$default(yDV.KWHzl(bArr, 2), "", null, null, 0, null, new Function1() { // from class: com.okinc.liveness.lca.debugtool.data.LcaDebugAiAlgoRepository$$ExternalSyntheticLambda0
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return LcaDebugAiAlgoRepository.generateRequestId$lambda$3(((Byte) obj).byteValue());
            }
        }, 30, null);
    }

    public static final CharSequence generateRequestId$lambda$3(byte b) {
        String str = String.format("%02x", Arrays.copyOf(new Object[]{Integer.valueOf(b & UnsignedBytes.MAX_VALUE)}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "");
        return str;
    }
}
