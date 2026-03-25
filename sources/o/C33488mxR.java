package o;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.internal.bind.TypeAdapters;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mxR, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C33488mxR {
    public static final TypeAdapter<java.lang.String> AEQbTJ;
    public static final Gson KWHzl;
    public static final TypeAdapter<java.lang.Boolean> OLrzqt;
    public static final TypeAdapterFactory copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final Gson KWHzl() {
        return KWHzl;
    }

    static {
        TypeAdapter<java.lang.Boolean> typeAdapter = new TypeAdapter<java.lang.Boolean>() { // from class: com.okinc.core.util.JSONUtilKt$BOOLEAN$1

            public final /* synthetic */ class Activity {
                public static final /* synthetic */ int[] KWHzl;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                static {
                    int[] iArr = new int[JsonToken.values().length];
                    try {
                        iArr[JsonToken.NULL.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[JsonToken.STRING.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[JsonToken.NUMBER.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    KWHzl = iArr;
                }
            }

            /* JADX DEBUG: Method merged with bridge method: read(Lcom/google/gson/stream/JsonReader;)Ljava/lang/Object; */
            @Override // com.google.gson.TypeAdapter
            /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
            public Boolean read2(JsonReader jsonReader) throws IOException {
                Intrinsics.checkNotNullParameter(jsonReader, "");
                JsonToken jsonTokenPeek = jsonReader.peek();
                int i = jsonTokenPeek == null ? -1 : Activity.KWHzl[jsonTokenPeek.ordinal()];
                if (i == 1) {
                    jsonReader.nextNull();
                    return null;
                }
                if (i == 2) {
                    return Boolean.valueOf(Boolean.parseBoolean(jsonReader.nextString()));
                }
                if (i != 3) {
                    return Boolean.valueOf(jsonReader.nextBoolean());
                }
                return Boolean.valueOf(jsonReader.nextInt() == 1);
            }

            /* JADX DEBUG: Method merged with bridge method: write(Lcom/google/gson/stream/JsonWriter;Ljava/lang/Object;)V */
            @Override // com.google.gson.TypeAdapter
            /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
            public void write(JsonWriter jsonWriter, Boolean bool) throws IOException {
                Intrinsics.checkNotNullParameter(jsonWriter, "");
                jsonWriter.value(bool);
            }
        };
        OLrzqt = typeAdapter;
        TypeAdapter<java.lang.String> typeAdapter2 = new TypeAdapter<java.lang.String>() { // from class: com.okinc.core.util.JSONUtilKt$CUSTOM_STRING$1

            public final /* synthetic */ class Activity {
                public static final /* synthetic */ int[] OLrzqt;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                static {
                    int[] iArr = new int[JsonToken.values().length];
                    try {
                        iArr[JsonToken.NULL.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[JsonToken.BOOLEAN.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[JsonToken.BEGIN_ARRAY.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[JsonToken.BEGIN_OBJECT.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    OLrzqt = iArr;
                }
            }

            /* JADX DEBUG: Method merged with bridge method: read(Lcom/google/gson/stream/JsonReader;)Ljava/lang/Object; */
            @Override // com.google.gson.TypeAdapter
            /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
            public String read2(JsonReader jsonReader) throws IOException {
                Intrinsics.checkNotNullParameter(jsonReader, "");
                JsonToken jsonTokenPeek = jsonReader.peek();
                int i = jsonTokenPeek == null ? -1 : Activity.OLrzqt[jsonTokenPeek.ordinal()];
                if (i == 1) {
                    jsonReader.nextNull();
                    return null;
                }
                if (i == 2) {
                    return String.valueOf(jsonReader.nextBoolean());
                }
                if (i == 3 || i == 4) {
                    return TypeAdapters.JSON_ELEMENT.read2(jsonReader).toString();
                }
                return jsonReader.nextString();
            }

            /* JADX DEBUG: Method merged with bridge method: write(Lcom/google/gson/stream/JsonWriter;Ljava/lang/Object;)V */
            @Override // com.google.gson.TypeAdapter
            /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
            public void write(JsonWriter jsonWriter, String str) throws IOException {
                Intrinsics.checkNotNullParameter(jsonWriter, "");
                jsonWriter.value(str);
            }
        };
        AEQbTJ = typeAdapter2;
        TypeAdapterFactory typeAdapterFactoryNewFactory = TypeAdapters.newFactory(java.lang.String.class, typeAdapter2);
        copydefault = typeAdapterFactoryNewFactory;
        GsonBuilder gsonBuilder = new GsonBuilder();
        java.lang.Class cls = java.lang.Boolean.TYPE;
        KWHzl = gsonBuilder.registerTypeAdapterFactory(TypeAdapters.newFactory(cls, cls, typeAdapter)).registerTypeAdapterFactory(typeAdapterFactoryNewFactory).create();
    }

    public static final java.lang.String EZpvd(@NotNull java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        java.lang.String json = KWHzl.toJson(obj);
        Intrinsics.checkNotNullExpressionValue(json, "");
        return json;
    }

    public static final <T> T AEQbTJ(@NotNull JsonElement jsonElement, @NotNull java.lang.Class<T> cls) {
        Intrinsics.checkNotNullParameter(jsonElement, "");
        Intrinsics.checkNotNullParameter(cls, "");
        return (T) KWHzl.fromJson(jsonElement, (java.lang.Class) cls);
    }
}
