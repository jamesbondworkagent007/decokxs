package com.reown.android.internal.common.jwt.did;

import com.reown.android.internal.common.jwt.did.EncodeIdentityKeyDidJwtPayloadUseCase;
import com.reown.foundation.util.jwt.JwtUtilsKt;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import kotlin.jvm.internal.Intrinsics;
import o.yEE;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes24.dex */
public final class EncodeIdentityKeyDidJwtPayloadUseCase_IdentityKeyJsonAdapter extends JsonAdapter<EncodeIdentityKeyDidJwtPayloadUseCase.IdentityKey> {
    public volatile Constructor<EncodeIdentityKeyDidJwtPayloadUseCase.IdentityKey> constructorRef;
    public final JsonAdapter<Long> longAdapter;
    public final JsonReader.Options options;
    public final JsonAdapter<String> stringAdapter;

    public EncodeIdentityKeyDidJwtPayloadUseCase_IdentityKeyJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "");
        JsonReader.Options optionsOf = JsonReader.Options.of("iss", "aud", "iat", "exp", JwtUtilsKt.DID_METHOD_PKH, "act");
        Intrinsics.checkNotNullExpressionValue(optionsOf, "");
        this.options = optionsOf;
        JsonAdapter<String> jsonAdapterAdapter = moshi.adapter(String.class, yEE.copydefault(), "issuer");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter, "");
        this.stringAdapter = jsonAdapterAdapter;
        JsonAdapter<Long> jsonAdapterAdapter2 = moshi.adapter(Long.TYPE, yEE.copydefault(), "issuedAt");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter2, "");
        this.longAdapter = jsonAdapterAdapter2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(71);
        sb.append("GeneratedJsonAdapter(");
        sb.append("EncodeIdentityKeyDidJwtPayloadUseCase.IdentityKey");
        sb.append(')');
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    /* JADX DEBUG: Method merged with bridge method: fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object; */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.squareup.moshi.JsonAdapter
    public EncodeIdentityKeyDidJwtPayloadUseCase.IdentityKey fromJson(@NotNull JsonReader jsonReader) throws IllegalAccessException, NoSuchMethodException, InstantiationException, IOException, InvocationTargetException {
        String str;
        Intrinsics.checkNotNullParameter(jsonReader, "");
        jsonReader.beginObject();
        String strFromJson = null;
        int i = -1;
        String strFromJson2 = null;
        Long lFromJson = null;
        Long l = null;
        String str2 = null;
        String strFromJson3 = null;
        while (true) {
            String str3 = strFromJson3;
            String str4 = str2;
            Long l2 = l;
            Long l3 = lFromJson;
            if (jsonReader.hasNext()) {
                switch (jsonReader.selectName(this.options)) {
                    case -1:
                        jsonReader.skipName();
                        jsonReader.skipValue();
                        str2 = str4;
                        l = l2;
                        strFromJson3 = str3;
                        lFromJson = l3;
                        break;
                    case 0:
                        strFromJson = this.stringAdapter.fromJson(jsonReader);
                        if (strFromJson == null) {
                            JsonDataException jsonDataExceptionUnexpectedNull = Util.unexpectedNull("issuer", "iss", jsonReader);
                            Intrinsics.checkNotNullExpressionValue(jsonDataExceptionUnexpectedNull, "");
                            throw jsonDataExceptionUnexpectedNull;
                        }
                        str2 = str4;
                        l = l2;
                        strFromJson3 = str3;
                        lFromJson = l3;
                        break;
                    case 1:
                        strFromJson2 = this.stringAdapter.fromJson(jsonReader);
                        if (strFromJson2 == null) {
                            JsonDataException jsonDataExceptionUnexpectedNull2 = Util.unexpectedNull("audience", "aud", jsonReader);
                            Intrinsics.checkNotNullExpressionValue(jsonDataExceptionUnexpectedNull2, "");
                            throw jsonDataExceptionUnexpectedNull2;
                        }
                        str2 = str4;
                        l = l2;
                        strFromJson3 = str3;
                        lFromJson = l3;
                        break;
                    case 2:
                        lFromJson = this.longAdapter.fromJson(jsonReader);
                        if (lFromJson == null) {
                            JsonDataException jsonDataExceptionUnexpectedNull3 = Util.unexpectedNull("issuedAt", "iat", jsonReader);
                            Intrinsics.checkNotNullExpressionValue(jsonDataExceptionUnexpectedNull3, "");
                            throw jsonDataExceptionUnexpectedNull3;
                        }
                        strFromJson3 = str3;
                        str2 = str4;
                        l = l2;
                        break;
                        break;
                    case 3:
                        Long lFromJson2 = this.longAdapter.fromJson(jsonReader);
                        if (lFromJson2 == null) {
                            JsonDataException jsonDataExceptionUnexpectedNull4 = Util.unexpectedNull("expiration", "exp", jsonReader);
                            Intrinsics.checkNotNullExpressionValue(jsonDataExceptionUnexpectedNull4, "");
                            throw jsonDataExceptionUnexpectedNull4;
                        }
                        l = lFromJson2;
                        str2 = str4;
                        strFromJson3 = str3;
                        lFromJson = l3;
                        break;
                        break;
                    case 4:
                        String strFromJson4 = this.stringAdapter.fromJson(jsonReader);
                        if (strFromJson4 == null) {
                            JsonDataException jsonDataExceptionUnexpectedNull5 = Util.unexpectedNull(JwtUtilsKt.DID_METHOD_PKH, JwtUtilsKt.DID_METHOD_PKH, jsonReader);
                            Intrinsics.checkNotNullExpressionValue(jsonDataExceptionUnexpectedNull5, "");
                            throw jsonDataExceptionUnexpectedNull5;
                        }
                        str2 = strFromJson4;
                        l = l2;
                        strFromJson3 = str3;
                        lFromJson = l3;
                        break;
                        break;
                    case 5:
                        strFromJson3 = this.stringAdapter.fromJson(jsonReader);
                        if (strFromJson3 == null) {
                            JsonDataException jsonDataExceptionUnexpectedNull6 = Util.unexpectedNull("act", "act", jsonReader);
                            Intrinsics.checkNotNullExpressionValue(jsonDataExceptionUnexpectedNull6, "");
                            throw jsonDataExceptionUnexpectedNull6;
                        }
                        str2 = str4;
                        l = l2;
                        lFromJson = l3;
                        i = -33;
                        break;
                        break;
                    default:
                        str2 = str4;
                        l = l2;
                        strFromJson3 = str3;
                        lFromJson = l3;
                        break;
                }
            } else {
                jsonReader.endObject();
                if (i == -33) {
                    if (strFromJson == null) {
                        JsonDataException jsonDataExceptionMissingProperty = Util.missingProperty("issuer", "iss", jsonReader);
                        Intrinsics.checkNotNullExpressionValue(jsonDataExceptionMissingProperty, "");
                        throw jsonDataExceptionMissingProperty;
                    }
                    if (strFromJson2 == null) {
                        JsonDataException jsonDataExceptionMissingProperty2 = Util.missingProperty("audience", "aud", jsonReader);
                        Intrinsics.checkNotNullExpressionValue(jsonDataExceptionMissingProperty2, "");
                        throw jsonDataExceptionMissingProperty2;
                    }
                    if (l3 != null) {
                        long jLongValue = l3.longValue();
                        if (l2 != null) {
                            long jLongValue2 = l2.longValue();
                            if (str4 == null) {
                                JsonDataException jsonDataExceptionMissingProperty3 = Util.missingProperty(JwtUtilsKt.DID_METHOD_PKH, JwtUtilsKt.DID_METHOD_PKH, jsonReader);
                                Intrinsics.checkNotNullExpressionValue(jsonDataExceptionMissingProperty3, "");
                                throw jsonDataExceptionMissingProperty3;
                            }
                            Intrinsics.copydefault(str3, "");
                            return new EncodeIdentityKeyDidJwtPayloadUseCase.IdentityKey(strFromJson, strFromJson2, jLongValue, jLongValue2, str4, str3);
                        }
                        JsonDataException jsonDataExceptionMissingProperty4 = Util.missingProperty("expiration", "exp", jsonReader);
                        Intrinsics.checkNotNullExpressionValue(jsonDataExceptionMissingProperty4, "");
                        throw jsonDataExceptionMissingProperty4;
                    }
                    JsonDataException jsonDataExceptionMissingProperty5 = Util.missingProperty("issuedAt", "iat", jsonReader);
                    Intrinsics.checkNotNullExpressionValue(jsonDataExceptionMissingProperty5, "");
                    throw jsonDataExceptionMissingProperty5;
                }
                Constructor<EncodeIdentityKeyDidJwtPayloadUseCase.IdentityKey> declaredConstructor = this.constructorRef;
                if (declaredConstructor == null) {
                    Class cls = Long.TYPE;
                    str = "issuer";
                    declaredConstructor = EncodeIdentityKeyDidJwtPayloadUseCase.IdentityKey.class.getDeclaredConstructor(String.class, String.class, cls, cls, String.class, String.class, Integer.TYPE, Util.DEFAULT_CONSTRUCTOR_MARKER);
                    this.constructorRef = declaredConstructor;
                    Intrinsics.checkNotNullExpressionValue(declaredConstructor, "");
                } else {
                    str = "issuer";
                }
                Constructor<EncodeIdentityKeyDidJwtPayloadUseCase.IdentityKey> constructor = declaredConstructor;
                if (strFromJson == null) {
                    JsonDataException jsonDataExceptionMissingProperty6 = Util.missingProperty(str, "iss", jsonReader);
                    Intrinsics.checkNotNullExpressionValue(jsonDataExceptionMissingProperty6, "");
                    throw jsonDataExceptionMissingProperty6;
                }
                if (strFromJson2 == null) {
                    JsonDataException jsonDataExceptionMissingProperty7 = Util.missingProperty("audience", "aud", jsonReader);
                    Intrinsics.checkNotNullExpressionValue(jsonDataExceptionMissingProperty7, "");
                    throw jsonDataExceptionMissingProperty7;
                }
                if (l3 == null) {
                    JsonDataException jsonDataExceptionMissingProperty8 = Util.missingProperty("issuedAt", "iat", jsonReader);
                    Intrinsics.checkNotNullExpressionValue(jsonDataExceptionMissingProperty8, "");
                    throw jsonDataExceptionMissingProperty8;
                }
                if (l2 == null) {
                    JsonDataException jsonDataExceptionMissingProperty9 = Util.missingProperty("expiration", "exp", jsonReader);
                    Intrinsics.checkNotNullExpressionValue(jsonDataExceptionMissingProperty9, "");
                    throw jsonDataExceptionMissingProperty9;
                }
                if (str4 == null) {
                    JsonDataException jsonDataExceptionMissingProperty10 = Util.missingProperty(JwtUtilsKt.DID_METHOD_PKH, JwtUtilsKt.DID_METHOD_PKH, jsonReader);
                    Intrinsics.checkNotNullExpressionValue(jsonDataExceptionMissingProperty10, "");
                    throw jsonDataExceptionMissingProperty10;
                }
                EncodeIdentityKeyDidJwtPayloadUseCase.IdentityKey identityKeyNewInstance = constructor.newInstance(strFromJson, strFromJson2, l3, l2, str4, str3, Integer.valueOf(i), null);
                Intrinsics.checkNotNullExpressionValue(identityKeyNewInstance, "");
                return identityKeyNewInstance;
            }
        }
    }

    /* JADX DEBUG: Method merged with bridge method: toJson(Lcom/squareup/moshi/JsonWriter;Ljava/lang/Object;)V */
    @Override // com.squareup.moshi.JsonAdapter
    public void toJson(@NotNull JsonWriter jsonWriter, EncodeIdentityKeyDidJwtPayloadUseCase.IdentityKey identityKey) throws IOException {
        Intrinsics.checkNotNullParameter(jsonWriter, "");
        if (identityKey == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        jsonWriter.beginObject();
        jsonWriter.name("iss");
        this.stringAdapter.toJson(jsonWriter, identityKey.getIssuer());
        jsonWriter.name("aud");
        this.stringAdapter.toJson(jsonWriter, identityKey.getAudience());
        jsonWriter.name("iat");
        this.longAdapter.toJson(jsonWriter, Long.valueOf(identityKey.getIssuedAt()));
        jsonWriter.name("exp");
        this.longAdapter.toJson(jsonWriter, Long.valueOf(identityKey.getExpiration()));
        jsonWriter.name(JwtUtilsKt.DID_METHOD_PKH);
        this.stringAdapter.toJson(jsonWriter, identityKey.getPkh());
        jsonWriter.name("act");
        this.stringAdapter.toJson(jsonWriter, identityKey.getAct());
        jsonWriter.endObject();
    }
}
