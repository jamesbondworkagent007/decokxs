package com.reown.android.internal.common.explorer.data.network.model;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import java.io.IOException;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import o.yEE;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes24.dex */
public final class DappListingsDTOJsonAdapter extends JsonAdapter<DappListingsDTO> {
    public final JsonAdapter<Integer> intAdapter;
    public final JsonAdapter<Map<String, ListingDTO>> mapOfStringListingDTOAdapter;
    public final JsonReader.Options options;

    public DappListingsDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "");
        JsonReader.Options optionsOf = JsonReader.Options.of("listings", "count", "total");
        Intrinsics.checkNotNullExpressionValue(optionsOf, "");
        this.options = optionsOf;
        JsonAdapter<Map<String, ListingDTO>> jsonAdapterAdapter = moshi.adapter(Types.newParameterizedType(Map.class, String.class, ListingDTO.class), yEE.copydefault(), "listings");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter, "");
        this.mapOfStringListingDTOAdapter = jsonAdapterAdapter;
        JsonAdapter<Integer> jsonAdapterAdapter2 = moshi.adapter(Integer.TYPE, yEE.copydefault(), "count");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter2, "");
        this.intAdapter = jsonAdapterAdapter2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(37);
        sb.append("GeneratedJsonAdapter(");
        sb.append("DappListingsDTO");
        sb.append(')');
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    /* JADX DEBUG: Method merged with bridge method: fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object; */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.squareup.moshi.JsonAdapter
    public DappListingsDTO fromJson(@NotNull JsonReader jsonReader) throws IOException {
        Intrinsics.checkNotNullParameter(jsonReader, "");
        jsonReader.beginObject();
        Map<String, ListingDTO> mapFromJson = null;
        Integer numFromJson = null;
        Integer numFromJson2 = null;
        while (jsonReader.hasNext()) {
            int iSelectName = jsonReader.selectName(this.options);
            if (iSelectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (iSelectName == 0) {
                mapFromJson = this.mapOfStringListingDTOAdapter.fromJson(jsonReader);
                if (mapFromJson == null) {
                    JsonDataException jsonDataExceptionUnexpectedNull = Util.unexpectedNull("listings", "listings", jsonReader);
                    Intrinsics.checkNotNullExpressionValue(jsonDataExceptionUnexpectedNull, "");
                    throw jsonDataExceptionUnexpectedNull;
                }
            } else if (iSelectName == 1) {
                numFromJson = this.intAdapter.fromJson(jsonReader);
                if (numFromJson == null) {
                    JsonDataException jsonDataExceptionUnexpectedNull2 = Util.unexpectedNull("count", "count", jsonReader);
                    Intrinsics.checkNotNullExpressionValue(jsonDataExceptionUnexpectedNull2, "");
                    throw jsonDataExceptionUnexpectedNull2;
                }
            } else if (iSelectName == 2 && (numFromJson2 = this.intAdapter.fromJson(jsonReader)) == null) {
                JsonDataException jsonDataExceptionUnexpectedNull3 = Util.unexpectedNull("total", "total", jsonReader);
                Intrinsics.checkNotNullExpressionValue(jsonDataExceptionUnexpectedNull3, "");
                throw jsonDataExceptionUnexpectedNull3;
            }
        }
        jsonReader.endObject();
        if (mapFromJson == null) {
            JsonDataException jsonDataExceptionMissingProperty = Util.missingProperty("listings", "listings", jsonReader);
            Intrinsics.checkNotNullExpressionValue(jsonDataExceptionMissingProperty, "");
            throw jsonDataExceptionMissingProperty;
        }
        if (numFromJson != null) {
            int iIntValue = numFromJson.intValue();
            if (numFromJson2 != null) {
                return new DappListingsDTO(mapFromJson, iIntValue, numFromJson2.intValue());
            }
            JsonDataException jsonDataExceptionMissingProperty2 = Util.missingProperty("total", "total", jsonReader);
            Intrinsics.checkNotNullExpressionValue(jsonDataExceptionMissingProperty2, "");
            throw jsonDataExceptionMissingProperty2;
        }
        JsonDataException jsonDataExceptionMissingProperty3 = Util.missingProperty("count", "count", jsonReader);
        Intrinsics.checkNotNullExpressionValue(jsonDataExceptionMissingProperty3, "");
        throw jsonDataExceptionMissingProperty3;
    }

    /* JADX DEBUG: Method merged with bridge method: toJson(Lcom/squareup/moshi/JsonWriter;Ljava/lang/Object;)V */
    @Override // com.squareup.moshi.JsonAdapter
    public void toJson(@NotNull JsonWriter jsonWriter, DappListingsDTO dappListingsDTO) throws IOException {
        Intrinsics.checkNotNullParameter(jsonWriter, "");
        if (dappListingsDTO == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        jsonWriter.beginObject();
        jsonWriter.name("listings");
        this.mapOfStringListingDTOAdapter.toJson(jsonWriter, dappListingsDTO.getListings());
        jsonWriter.name("count");
        this.intAdapter.toJson(jsonWriter, Integer.valueOf(dappListingsDTO.getCount()));
        jsonWriter.name("total");
        this.intAdapter.toJson(jsonWriter, Integer.valueOf(dappListingsDTO.getTotal()));
        jsonWriter.endObject();
    }
}
