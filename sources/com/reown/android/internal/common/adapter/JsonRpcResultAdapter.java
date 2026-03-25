package com.reown.android.internal.common.adapter;

import com.reown.android.internal.common.JsonRpcResponse;
import com.reown.android.internal.common.model.params.ChatNotifyResponseAuthParams;
import com.reown.android.internal.common.model.params.CoreNotifyParams;
import com.reown.android.internal.common.model.params.CoreSignParams;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import kotlin.Result;
import kotlin.jvm.internal.Intrinsics;
import o.C56391yDq;
import o.C59449zhJ;
import o.yEE;
import o.yFA;
import okio.BufferedSink;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class JsonRpcResultAdapter extends JsonAdapter<JsonRpcResponse.JsonRpcResult> {
    public final JsonAdapter<Object> anyAdapter;
    public final JsonAdapter<CoreSignParams.ApprovalParams> approvalParamsAdapter;
    public final JsonAdapter<CoreSignParams.SessionAuthenticateApproveParams> approveSessionAuthenticateParamsAdapter;
    public final JsonAdapter<ChatNotifyResponseAuthParams.Auth> chatNotifyAuthParamsAdapter;
    public final JsonAdapter<ChatNotifyResponseAuthParams.ResponseAuth> chatNotifyResponseAuthParamsAdapter;
    public volatile Constructor<JsonRpcResponse.JsonRpcResult> constructorRef;
    public final JsonAdapter<Long> longAdapter;
    public final Moshi moshi;
    public final JsonAdapter<CoreNotifyParams.UpdateParams> notifySubscribeUpdateParamsAdapter;
    public final JsonReader.Options options;
    public final JsonAdapter<String> stringAdapter;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Moshi getMoshi() {
        return this.moshi;
    }

    public JsonRpcResultAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "");
        this.moshi = moshi;
        JsonReader.Options optionsOf = JsonReader.Options.of("id", "jsonrpc", "result");
        Intrinsics.checkNotNullExpressionValue(optionsOf, "");
        this.options = optionsOf;
        JsonAdapter<Long> jsonAdapterAdapter = moshi.adapter(Long.TYPE, yEE.copydefault(), "id");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter, "");
        this.longAdapter = jsonAdapterAdapter;
        JsonAdapter<String> jsonAdapterAdapter2 = moshi.adapter(String.class, yEE.copydefault(), "jsonrpc");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter2, "");
        this.stringAdapter = jsonAdapterAdapter2;
        JsonAdapter<Object> jsonAdapterAdapter3 = moshi.adapter(Object.class, yEE.copydefault(), "result");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter3, "");
        this.anyAdapter = jsonAdapterAdapter3;
        JsonAdapter<CoreSignParams.ApprovalParams> jsonAdapterAdapter4 = moshi.adapter(CoreSignParams.ApprovalParams.class, yEE.copydefault(), "result");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter4, "");
        this.approvalParamsAdapter = jsonAdapterAdapter4;
        JsonAdapter<CoreSignParams.SessionAuthenticateApproveParams> jsonAdapterAdapter5 = moshi.adapter(CoreSignParams.SessionAuthenticateApproveParams.class, yEE.copydefault(), "result");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter5, "");
        this.approveSessionAuthenticateParamsAdapter = jsonAdapterAdapter5;
        JsonAdapter<CoreNotifyParams.UpdateParams> jsonAdapterAdapter6 = moshi.adapter(CoreNotifyParams.UpdateParams.class, yEE.copydefault(), "result");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter6, "");
        this.notifySubscribeUpdateParamsAdapter = jsonAdapterAdapter6;
        JsonAdapter<ChatNotifyResponseAuthParams.ResponseAuth> jsonAdapterAdapter7 = moshi.adapter(ChatNotifyResponseAuthParams.ResponseAuth.class, yEE.copydefault(), "result");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter7, "");
        this.chatNotifyResponseAuthParamsAdapter = jsonAdapterAdapter7;
        JsonAdapter<ChatNotifyResponseAuthParams.Auth> jsonAdapterAdapter8 = moshi.adapter(ChatNotifyResponseAuthParams.Auth.class, yEE.copydefault(), "result");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter8, "");
        this.chatNotifyAuthParamsAdapter = jsonAdapterAdapter8;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(59);
        sb.append("GeneratedJsonAdapter(");
        sb.append("RelayDO.JsonRpcResponse.JsonRpcResult");
        sb.append(')');
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    /* JADX DEBUG: Method merged with bridge method: fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object; */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.squareup.moshi.JsonAdapter
    public JsonRpcResponse.JsonRpcResult fromJson(@NotNull JsonReader jsonReader) throws IllegalAccessException, NoSuchMethodException, InstantiationException, IOException, InvocationTargetException {
        Object objM7377constructorimpl;
        Object objM7377constructorimpl2;
        Object objM7377constructorimpl3;
        Object objM7377constructorimpl4;
        Object objM7377constructorimpl5;
        Intrinsics.checkNotNullParameter(jsonReader, "");
        jsonReader.beginObject();
        Long lFromJson = null;
        String strFromJson = null;
        Object objFromJson = null;
        int i = -1;
        while (jsonReader.hasNext()) {
            int iSelectName = jsonReader.selectName(this.options);
            if (iSelectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (iSelectName == 0) {
                lFromJson = this.longAdapter.fromJson(jsonReader);
                if (lFromJson == null) {
                    JsonDataException jsonDataExceptionUnexpectedNull = Util.unexpectedNull("id", "id", jsonReader);
                    Intrinsics.checkNotNullExpressionValue(jsonDataExceptionUnexpectedNull, "");
                    throw jsonDataExceptionUnexpectedNull;
                }
            } else if (iSelectName == 1) {
                strFromJson = this.stringAdapter.fromJson(jsonReader);
                if (strFromJson == null) {
                    JsonDataException jsonDataExceptionUnexpectedNull2 = Util.unexpectedNull("jsonrpc", "jsonrpc", jsonReader);
                    Intrinsics.checkNotNullExpressionValue(jsonDataExceptionUnexpectedNull2, "");
                    throw jsonDataExceptionUnexpectedNull2;
                }
                i = -3;
            } else if (iSelectName == 2) {
                try {
                    Result.Application application = Result.Companion;
                    objM7377constructorimpl = Result.m7377constructorimpl(this.approvalParamsAdapter.fromJson(jsonReader.peekJson()));
                } catch (Throwable th) {
                    Result.Application application2 = Result.Companion;
                    objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                }
                if (Result.m7384isSuccessimpl(objM7377constructorimpl)) {
                    objFromJson = this.approvalParamsAdapter.fromJson(jsonReader);
                } else {
                    try {
                        Result.Application application3 = Result.Companion;
                        objM7377constructorimpl2 = Result.m7377constructorimpl(this.approveSessionAuthenticateParamsAdapter.fromJson(jsonReader.peekJson()));
                    } catch (Throwable th2) {
                        Result.Application application4 = Result.Companion;
                        objM7377constructorimpl2 = Result.m7377constructorimpl(C56391yDq.EZpvd(th2));
                    }
                    if (Result.m7384isSuccessimpl(objM7377constructorimpl2)) {
                        objFromJson = this.approveSessionAuthenticateParamsAdapter.fromJson(jsonReader);
                    } else {
                        try {
                            Result.Application application5 = Result.Companion;
                            objM7377constructorimpl3 = Result.m7377constructorimpl(this.notifySubscribeUpdateParamsAdapter.fromJson(jsonReader.peekJson()));
                        } catch (Throwable th3) {
                            Result.Application application6 = Result.Companion;
                            objM7377constructorimpl3 = Result.m7377constructorimpl(C56391yDq.EZpvd(th3));
                        }
                        if (Result.m7384isSuccessimpl(objM7377constructorimpl3)) {
                            objFromJson = this.notifySubscribeUpdateParamsAdapter.fromJson(jsonReader);
                        } else {
                            try {
                                Result.Application application7 = Result.Companion;
                                objM7377constructorimpl4 = Result.m7377constructorimpl(this.chatNotifyResponseAuthParamsAdapter.fromJson(jsonReader.peekJson()));
                            } catch (Throwable th4) {
                                Result.Application application8 = Result.Companion;
                                objM7377constructorimpl4 = Result.m7377constructorimpl(C56391yDq.EZpvd(th4));
                            }
                            if (Result.m7384isSuccessimpl(objM7377constructorimpl4)) {
                                objFromJson = this.chatNotifyResponseAuthParamsAdapter.fromJson(jsonReader);
                            } else {
                                try {
                                    Result.Application application9 = Result.Companion;
                                    objM7377constructorimpl5 = Result.m7377constructorimpl(this.chatNotifyAuthParamsAdapter.fromJson(jsonReader.peekJson()));
                                } catch (Throwable th5) {
                                    Result.Application application10 = Result.Companion;
                                    objM7377constructorimpl5 = Result.m7377constructorimpl(C56391yDq.EZpvd(th5));
                                }
                                if (Result.m7384isSuccessimpl(objM7377constructorimpl5)) {
                                    objFromJson = this.chatNotifyAuthParamsAdapter.fromJson(jsonReader);
                                } else {
                                    objFromJson = this.anyAdapter.fromJson(jsonReader);
                                }
                            }
                        }
                    }
                }
            }
        }
        jsonReader.endObject();
        if (i == -3) {
            if (lFromJson != null) {
                long jLongValue = lFromJson.longValue();
                Intrinsics.copydefault(strFromJson, "");
                if (objFromJson != null) {
                    return new JsonRpcResponse.JsonRpcResult(jLongValue, strFromJson, objFromJson);
                }
                JsonDataException jsonDataExceptionMissingProperty = Util.missingProperty("result", "result", jsonReader);
                Intrinsics.checkNotNullExpressionValue(jsonDataExceptionMissingProperty, "");
                throw jsonDataExceptionMissingProperty;
            }
            JsonDataException jsonDataExceptionMissingProperty2 = Util.missingProperty("id", "id", jsonReader);
            Intrinsics.checkNotNullExpressionValue(jsonDataExceptionMissingProperty2, "");
            throw jsonDataExceptionMissingProperty2;
        }
        Constructor<JsonRpcResponse.JsonRpcResult> declaredConstructor = this.constructorRef;
        if (declaredConstructor == null) {
            declaredConstructor = JsonRpcResponse.JsonRpcResult.class.getDeclaredConstructor(Long.TYPE, String.class, Object.class, Integer.TYPE, Util.DEFAULT_CONSTRUCTOR_MARKER);
            this.constructorRef = declaredConstructor;
            Intrinsics.checkNotNullExpressionValue(declaredConstructor, "");
        }
        if (lFromJson == null) {
            JsonDataException jsonDataExceptionMissingProperty3 = Util.missingProperty("id", "id", jsonReader);
            Intrinsics.checkNotNullExpressionValue(jsonDataExceptionMissingProperty3, "");
            throw jsonDataExceptionMissingProperty3;
        }
        if (objFromJson != null) {
            JsonRpcResponse.JsonRpcResult jsonRpcResultNewInstance = declaredConstructor.newInstance(lFromJson, strFromJson, objFromJson, Integer.valueOf(i), null);
            Intrinsics.checkNotNullExpressionValue(jsonRpcResultNewInstance, "");
            return jsonRpcResultNewInstance;
        }
        JsonDataException jsonDataExceptionMissingProperty4 = Util.missingProperty("result", "result", jsonReader);
        Intrinsics.checkNotNullExpressionValue(jsonDataExceptionMissingProperty4, "");
        throw jsonDataExceptionMissingProperty4;
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[]}, finally: {[THROW, INVOKE, MOVE_EXCEPTION, THROW, MOVE_EXCEPTION] complete} */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    /* JADX DEBUG: Method merged with bridge method: toJson(Lcom/squareup/moshi/JsonWriter;Ljava/lang/Object;)V */
    @Override // com.squareup.moshi.JsonAdapter
    public void toJson(@NotNull JsonWriter jsonWriter, JsonRpcResponse.JsonRpcResult jsonRpcResult) throws IOException {
        Intrinsics.checkNotNullParameter(jsonWriter, "");
        if (jsonRpcResult == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        jsonWriter.beginObject();
        jsonWriter.name("id");
        this.longAdapter.toJson(jsonWriter, Long.valueOf(jsonRpcResult.getId()));
        jsonWriter.name("jsonrpc");
        this.stringAdapter.toJson(jsonWriter, jsonRpcResult.getJsonrpc());
        jsonWriter.name("result");
        Object result = jsonRpcResult.getResult();
        if ((result instanceof CoreSignParams.ApprovalParams ? (CoreSignParams.ApprovalParams) result : null) != null) {
            String json = this.approvalParamsAdapter.toJson((CoreSignParams.ApprovalParams) jsonRpcResult.getResult());
            BufferedSink bufferedSinkValueSink = jsonWriter.valueSink();
            try {
                Intrinsics.copydefault((Object) json);
                bufferedSinkValueSink.writeUtf8(json);
                yFA.copydefault(bufferedSinkValueSink, null);
            } finally {
            }
        } else {
            Object result2 = jsonRpcResult.getResult();
            if ((result2 instanceof CoreSignParams.SessionAuthenticateApproveParams ? (CoreSignParams.SessionAuthenticateApproveParams) result2 : null) != null) {
                String json2 = this.approveSessionAuthenticateParamsAdapter.toJson((CoreSignParams.SessionAuthenticateApproveParams) jsonRpcResult.getResult());
                BufferedSink bufferedSinkValueSink2 = jsonWriter.valueSink();
                try {
                    Intrinsics.copydefault((Object) json2);
                    bufferedSinkValueSink2.writeUtf8(json2);
                    yFA.copydefault(bufferedSinkValueSink2, null);
                } finally {
                    try {
                        throw th;
                    } finally {
                    }
                }
            } else {
                Object result3 = jsonRpcResult.getResult();
                if ((result3 instanceof ChatNotifyResponseAuthParams.ResponseAuth ? (ChatNotifyResponseAuthParams.ResponseAuth) result3 : null) != null) {
                    String json3 = this.chatNotifyResponseAuthParamsAdapter.toJson((ChatNotifyResponseAuthParams.ResponseAuth) jsonRpcResult.getResult());
                    BufferedSink bufferedSinkValueSink3 = jsonWriter.valueSink();
                    try {
                        Intrinsics.copydefault((Object) json3);
                        bufferedSinkValueSink3.writeUtf8(json3);
                        yFA.copydefault(bufferedSinkValueSink3, null);
                    } finally {
                        try {
                            throw th;
                        } finally {
                        }
                    }
                } else {
                    Object result4 = jsonRpcResult.getResult();
                    if ((result4 instanceof ChatNotifyResponseAuthParams.Auth ? (ChatNotifyResponseAuthParams.Auth) result4 : null) != null) {
                        String json4 = this.chatNotifyAuthParamsAdapter.toJson((ChatNotifyResponseAuthParams.Auth) jsonRpcResult.getResult());
                        BufferedSink bufferedSinkValueSink4 = jsonWriter.valueSink();
                        try {
                            Intrinsics.copydefault((Object) json4);
                            bufferedSinkValueSink4.writeUtf8(json4);
                            yFA.copydefault(bufferedSinkValueSink4, null);
                        } finally {
                            try {
                                throw th;
                            } finally {
                            }
                        }
                    } else {
                        Object result5 = jsonRpcResult.getResult();
                        if ((result5 instanceof CoreNotifyParams.UpdateParams ? (CoreNotifyParams.UpdateParams) result5 : null) != null) {
                            String json5 = this.notifySubscribeUpdateParamsAdapter.toJson((CoreNotifyParams.UpdateParams) jsonRpcResult.getResult());
                            BufferedSink bufferedSinkValueSink5 = jsonWriter.valueSink();
                            try {
                                Intrinsics.copydefault((Object) json5);
                                bufferedSinkValueSink5.writeUtf8(json5);
                                yFA.copydefault(bufferedSinkValueSink5, null);
                            } finally {
                                try {
                                    throw th;
                                } finally {
                                }
                            }
                        } else if ((jsonRpcResult.getResult() instanceof String) && C59449zhJ.startsWith$default((String) jsonRpcResult.getResult(), "{", false, 2, null)) {
                            BufferedSink bufferedSinkValueSink6 = jsonWriter.valueSink();
                            try {
                                String string = new JSONObject((String) jsonRpcResult.getResult()).toString();
                                Intrinsics.checkNotNullExpressionValue(string, "");
                                bufferedSinkValueSink6.writeUtf8(string);
                                yFA.copydefault(bufferedSinkValueSink6, null);
                            } finally {
                                try {
                                    throw th;
                                } finally {
                                }
                            }
                        } else if ((jsonRpcResult.getResult() instanceof String) && C59449zhJ.startsWith$default((String) jsonRpcResult.getResult(), "[", false, 2, null)) {
                            BufferedSink bufferedSinkValueSink7 = jsonWriter.valueSink();
                            try {
                                String string2 = new JSONArray((String) jsonRpcResult.getResult()).toString();
                                Intrinsics.checkNotNullExpressionValue(string2, "");
                                bufferedSinkValueSink7.writeUtf8(string2);
                                yFA.copydefault(bufferedSinkValueSink7, null);
                            } finally {
                                try {
                                    throw th;
                                } finally {
                                }
                            }
                        } else {
                            this.anyAdapter.toJson(jsonWriter, jsonRpcResult.getResult());
                        }
                    }
                }
            }
        }
        jsonWriter.endObject();
    }
}
