package com.reown.android.internal.common.explorer.data.network.model;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;
import o.yEE;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes24.dex */
public final class AppDTOJsonAdapter extends JsonAdapter<AppDTO> {
    public final JsonAdapter<String> nullableStringAdapter;
    public final JsonReader.Options options;

    public AppDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "");
        JsonReader.Options optionsOf = JsonReader.Options.of("browser", "ios", "android", "mac", "windows", "linux", "chrome", "firefox", "safari", "edge", "opera");
        Intrinsics.checkNotNullExpressionValue(optionsOf, "");
        this.options = optionsOf;
        JsonAdapter<String> jsonAdapterAdapter = moshi.adapter(String.class, yEE.copydefault(), "browser");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter, "");
        this.nullableStringAdapter = jsonAdapterAdapter;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(28);
        sb.append("GeneratedJsonAdapter(");
        sb.append("AppDTO");
        sb.append(')');
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    /* JADX DEBUG: Method merged with bridge method: fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object; */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.squareup.moshi.JsonAdapter
    public AppDTO fromJson(@NotNull JsonReader jsonReader) throws IOException {
        Intrinsics.checkNotNullParameter(jsonReader, "");
        jsonReader.beginObject();
        String strFromJson = null;
        String strFromJson2 = null;
        String strFromJson3 = null;
        String strFromJson4 = null;
        String strFromJson5 = null;
        String strFromJson6 = null;
        String strFromJson7 = null;
        String strFromJson8 = null;
        String strFromJson9 = null;
        String strFromJson10 = null;
        String strFromJson11 = null;
        while (jsonReader.hasNext()) {
            switch (jsonReader.selectName(this.options)) {
                case -1:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    break;
                case 0:
                    strFromJson = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 1:
                    strFromJson2 = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 2:
                    strFromJson3 = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 3:
                    strFromJson4 = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 4:
                    strFromJson5 = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 5:
                    strFromJson6 = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 6:
                    strFromJson7 = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 7:
                    strFromJson8 = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 8:
                    strFromJson9 = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 9:
                    strFromJson10 = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 10:
                    strFromJson11 = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
            }
        }
        jsonReader.endObject();
        return new AppDTO(strFromJson, strFromJson2, strFromJson3, strFromJson4, strFromJson5, strFromJson6, strFromJson7, strFromJson8, strFromJson9, strFromJson10, strFromJson11);
    }

    /* JADX DEBUG: Method merged with bridge method: toJson(Lcom/squareup/moshi/JsonWriter;Ljava/lang/Object;)V */
    @Override // com.squareup.moshi.JsonAdapter
    public void toJson(@NotNull JsonWriter jsonWriter, AppDTO appDTO) throws IOException {
        Intrinsics.checkNotNullParameter(jsonWriter, "");
        if (appDTO == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        jsonWriter.beginObject();
        jsonWriter.name("browser");
        this.nullableStringAdapter.toJson(jsonWriter, appDTO.getBrowser());
        jsonWriter.name("ios");
        this.nullableStringAdapter.toJson(jsonWriter, appDTO.getIos());
        jsonWriter.name("android");
        this.nullableStringAdapter.toJson(jsonWriter, appDTO.getAndroid());
        jsonWriter.name("mac");
        this.nullableStringAdapter.toJson(jsonWriter, appDTO.getMac());
        jsonWriter.name("windows");
        this.nullableStringAdapter.toJson(jsonWriter, appDTO.getWindows());
        jsonWriter.name("linux");
        this.nullableStringAdapter.toJson(jsonWriter, appDTO.getLinux());
        jsonWriter.name("chrome");
        this.nullableStringAdapter.toJson(jsonWriter, appDTO.getChrome());
        jsonWriter.name("firefox");
        this.nullableStringAdapter.toJson(jsonWriter, appDTO.getFirefox());
        jsonWriter.name("safari");
        this.nullableStringAdapter.toJson(jsonWriter, appDTO.getSafari());
        jsonWriter.name("edge");
        this.nullableStringAdapter.toJson(jsonWriter, appDTO.getEdge());
        jsonWriter.name("opera");
        this.nullableStringAdapter.toJson(jsonWriter, appDTO.getOpera());
        jsonWriter.endObject();
    }
}
