package com.reown.android.internal.common.explorer.data.network.model;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.reown.android.pulse.model.ConnectionMethod;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import java.io.IOException;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import o.yEE;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes24.dex */
public final class ListingDTOJsonAdapter extends JsonAdapter<ListingDTO> {
    public final JsonAdapter<AppDTO> appDTOAdapter;
    public final JsonAdapter<DesktopDTO> desktopDTOAdapter;
    public final JsonAdapter<ImageUrlDTO> imageUrlDTOAdapter;
    public final JsonAdapter<List<String>> listOfStringAdapter;
    public final JsonAdapter<List<SupportedStandardDTO>> listOfSupportedStandardDTOAdapter;
    public final JsonAdapter<MetadataDTO> metadataDTOAdapter;
    public final JsonAdapter<MobileDTO> mobileDTOAdapter;
    public final JsonAdapter<List<InjectedDTO>> nullableListOfInjectedDTOAdapter;
    public final JsonAdapter<String> nullableStringAdapter;
    public final JsonReader.Options options;
    public final JsonAdapter<String> stringAdapter;

    public ListingDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "");
        JsonReader.Options optionsOf = JsonReader.Options.of("id", "name", "description", "homepage", "chains", "versions", "sdks", "app_type", "image_id", "image_url", "app", "injected", ConnectionMethod.MOBILE, "desktop", "supported_standards", TtmlNode.TAG_METADATA, "updatedAt");
        Intrinsics.checkNotNullExpressionValue(optionsOf, "");
        this.options = optionsOf;
        JsonAdapter<String> jsonAdapterAdapter = moshi.adapter(String.class, yEE.copydefault(), "id");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter, "");
        this.stringAdapter = jsonAdapterAdapter;
        JsonAdapter<String> jsonAdapterAdapter2 = moshi.adapter(String.class, yEE.copydefault(), "description");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter2, "");
        this.nullableStringAdapter = jsonAdapterAdapter2;
        JsonAdapter<List<String>> jsonAdapterAdapter3 = moshi.adapter(Types.newParameterizedType(List.class, String.class), yEE.copydefault(), "chains");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter3, "");
        this.listOfStringAdapter = jsonAdapterAdapter3;
        JsonAdapter<ImageUrlDTO> jsonAdapterAdapter4 = moshi.adapter(ImageUrlDTO.class, yEE.copydefault(), "imageUrl");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter4, "");
        this.imageUrlDTOAdapter = jsonAdapterAdapter4;
        JsonAdapter<AppDTO> jsonAdapterAdapter5 = moshi.adapter(AppDTO.class, yEE.copydefault(), "app");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter5, "");
        this.appDTOAdapter = jsonAdapterAdapter5;
        JsonAdapter<List<InjectedDTO>> jsonAdapterAdapter6 = moshi.adapter(Types.newParameterizedType(List.class, InjectedDTO.class), yEE.copydefault(), "injected");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter6, "");
        this.nullableListOfInjectedDTOAdapter = jsonAdapterAdapter6;
        JsonAdapter<MobileDTO> jsonAdapterAdapter7 = moshi.adapter(MobileDTO.class, yEE.copydefault(), ConnectionMethod.MOBILE);
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter7, "");
        this.mobileDTOAdapter = jsonAdapterAdapter7;
        JsonAdapter<DesktopDTO> jsonAdapterAdapter8 = moshi.adapter(DesktopDTO.class, yEE.copydefault(), "desktop");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter8, "");
        this.desktopDTOAdapter = jsonAdapterAdapter8;
        JsonAdapter<List<SupportedStandardDTO>> jsonAdapterAdapter9 = moshi.adapter(Types.newParameterizedType(List.class, SupportedStandardDTO.class), yEE.copydefault(), "supportedStandards");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter9, "");
        this.listOfSupportedStandardDTOAdapter = jsonAdapterAdapter9;
        JsonAdapter<MetadataDTO> jsonAdapterAdapter10 = moshi.adapter(MetadataDTO.class, yEE.copydefault(), TtmlNode.TAG_METADATA);
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter10, "");
        this.metadataDTOAdapter = jsonAdapterAdapter10;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(32);
        sb.append("GeneratedJsonAdapter(");
        sb.append("ListingDTO");
        sb.append(')');
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    /* JADX DEBUG: Method merged with bridge method: fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object; */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.squareup.moshi.JsonAdapter
    public ListingDTO fromJson(@NotNull JsonReader jsonReader) throws IOException {
        Intrinsics.checkNotNullParameter(jsonReader, "");
        jsonReader.beginObject();
        String strFromJson = null;
        String str = null;
        String strFromJson2 = null;
        String strFromJson3 = null;
        List<String> list = null;
        List<String> listFromJson = null;
        List<String> list2 = null;
        String strFromJson4 = null;
        String str2 = null;
        ImageUrlDTO imageUrlDTO = null;
        AppDTO appDTOFromJson = null;
        List<InjectedDTO> listFromJson2 = null;
        MobileDTO mobileDTOFromJson = null;
        DesktopDTO desktopDTOFromJson = null;
        List<SupportedStandardDTO> listFromJson3 = null;
        MetadataDTO metadataDTOFromJson = null;
        String strFromJson5 = null;
        while (true) {
            String str3 = strFromJson2;
            AppDTO appDTO = appDTOFromJson;
            ImageUrlDTO imageUrlDTO2 = imageUrlDTO;
            String str4 = str2;
            String str5 = strFromJson4;
            List<String> list3 = list2;
            List<String> list4 = listFromJson;
            List<String> list5 = list;
            String str6 = strFromJson3;
            String str7 = str;
            String str8 = strFromJson;
            if (jsonReader.hasNext()) {
                switch (jsonReader.selectName(this.options)) {
                    case -1:
                        jsonReader.skipName();
                        jsonReader.skipValue();
                        strFromJson2 = str3;
                        appDTOFromJson = appDTO;
                        imageUrlDTO = imageUrlDTO2;
                        str2 = str4;
                        strFromJson4 = str5;
                        list2 = list3;
                        listFromJson = list4;
                        list = list5;
                        strFromJson3 = str6;
                        str = str7;
                        strFromJson = str8;
                        break;
                    case 0:
                        strFromJson = this.stringAdapter.fromJson(jsonReader);
                        if (strFromJson == null) {
                            JsonDataException jsonDataExceptionUnexpectedNull = Util.unexpectedNull("id", "id", jsonReader);
                            Intrinsics.checkNotNullExpressionValue(jsonDataExceptionUnexpectedNull, "");
                            throw jsonDataExceptionUnexpectedNull;
                        }
                        strFromJson2 = str3;
                        appDTOFromJson = appDTO;
                        imageUrlDTO = imageUrlDTO2;
                        str2 = str4;
                        strFromJson4 = str5;
                        list2 = list3;
                        listFromJson = list4;
                        list = list5;
                        strFromJson3 = str6;
                        str = str7;
                        break;
                        break;
                    case 1:
                        String strFromJson6 = this.stringAdapter.fromJson(jsonReader);
                        if (strFromJson6 == null) {
                            JsonDataException jsonDataExceptionUnexpectedNull2 = Util.unexpectedNull("name", "name", jsonReader);
                            Intrinsics.checkNotNullExpressionValue(jsonDataExceptionUnexpectedNull2, "");
                            throw jsonDataExceptionUnexpectedNull2;
                        }
                        str = strFromJson6;
                        strFromJson2 = str3;
                        appDTOFromJson = appDTO;
                        imageUrlDTO = imageUrlDTO2;
                        str2 = str4;
                        strFromJson4 = str5;
                        list2 = list3;
                        listFromJson = list4;
                        list = list5;
                        strFromJson3 = str6;
                        strFromJson = str8;
                        break;
                        break;
                    case 2:
                        strFromJson2 = this.nullableStringAdapter.fromJson(jsonReader);
                        appDTOFromJson = appDTO;
                        imageUrlDTO = imageUrlDTO2;
                        str2 = str4;
                        strFromJson4 = str5;
                        list2 = list3;
                        listFromJson = list4;
                        list = list5;
                        strFromJson3 = str6;
                        str = str7;
                        strFromJson = str8;
                        break;
                    case 3:
                        strFromJson3 = this.stringAdapter.fromJson(jsonReader);
                        if (strFromJson3 == null) {
                            JsonDataException jsonDataExceptionUnexpectedNull3 = Util.unexpectedNull("homepage", "homepage", jsonReader);
                            Intrinsics.checkNotNullExpressionValue(jsonDataExceptionUnexpectedNull3, "");
                            throw jsonDataExceptionUnexpectedNull3;
                        }
                        strFromJson2 = str3;
                        appDTOFromJson = appDTO;
                        imageUrlDTO = imageUrlDTO2;
                        str2 = str4;
                        strFromJson4 = str5;
                        list2 = list3;
                        listFromJson = list4;
                        list = list5;
                        str = str7;
                        strFromJson = str8;
                        break;
                        break;
                    case 4:
                        List<String> listFromJson4 = this.listOfStringAdapter.fromJson(jsonReader);
                        if (listFromJson4 == null) {
                            JsonDataException jsonDataExceptionUnexpectedNull4 = Util.unexpectedNull("chains", "chains", jsonReader);
                            Intrinsics.checkNotNullExpressionValue(jsonDataExceptionUnexpectedNull4, "");
                            throw jsonDataExceptionUnexpectedNull4;
                        }
                        list = listFromJson4;
                        strFromJson2 = str3;
                        appDTOFromJson = appDTO;
                        imageUrlDTO = imageUrlDTO2;
                        str2 = str4;
                        strFromJson4 = str5;
                        list2 = list3;
                        listFromJson = list4;
                        strFromJson3 = str6;
                        str = str7;
                        strFromJson = str8;
                        break;
                        break;
                    case 5:
                        listFromJson = this.listOfStringAdapter.fromJson(jsonReader);
                        if (listFromJson == null) {
                            JsonDataException jsonDataExceptionUnexpectedNull5 = Util.unexpectedNull("versions", "versions", jsonReader);
                            Intrinsics.checkNotNullExpressionValue(jsonDataExceptionUnexpectedNull5, "");
                            throw jsonDataExceptionUnexpectedNull5;
                        }
                        strFromJson2 = str3;
                        appDTOFromJson = appDTO;
                        imageUrlDTO = imageUrlDTO2;
                        str2 = str4;
                        strFromJson4 = str5;
                        list2 = list3;
                        list = list5;
                        strFromJson3 = str6;
                        str = str7;
                        strFromJson = str8;
                        break;
                        break;
                    case 6:
                        List<String> listFromJson5 = this.listOfStringAdapter.fromJson(jsonReader);
                        if (listFromJson5 == null) {
                            JsonDataException jsonDataExceptionUnexpectedNull6 = Util.unexpectedNull("sdks", "sdks", jsonReader);
                            Intrinsics.checkNotNullExpressionValue(jsonDataExceptionUnexpectedNull6, "");
                            throw jsonDataExceptionUnexpectedNull6;
                        }
                        list2 = listFromJson5;
                        strFromJson2 = str3;
                        appDTOFromJson = appDTO;
                        imageUrlDTO = imageUrlDTO2;
                        str2 = str4;
                        strFromJson4 = str5;
                        listFromJson = list4;
                        list = list5;
                        strFromJson3 = str6;
                        str = str7;
                        strFromJson = str8;
                        break;
                        break;
                    case 7:
                        strFromJson4 = this.stringAdapter.fromJson(jsonReader);
                        if (strFromJson4 == null) {
                            JsonDataException jsonDataExceptionUnexpectedNull7 = Util.unexpectedNull("appType", "app_type", jsonReader);
                            Intrinsics.checkNotNullExpressionValue(jsonDataExceptionUnexpectedNull7, "");
                            throw jsonDataExceptionUnexpectedNull7;
                        }
                        strFromJson2 = str3;
                        appDTOFromJson = appDTO;
                        imageUrlDTO = imageUrlDTO2;
                        str2 = str4;
                        list2 = list3;
                        listFromJson = list4;
                        list = list5;
                        strFromJson3 = str6;
                        str = str7;
                        strFromJson = str8;
                        break;
                        break;
                    case 8:
                        String strFromJson7 = this.stringAdapter.fromJson(jsonReader);
                        if (strFromJson7 == null) {
                            JsonDataException jsonDataExceptionUnexpectedNull8 = Util.unexpectedNull("imageId", "image_id", jsonReader);
                            Intrinsics.checkNotNullExpressionValue(jsonDataExceptionUnexpectedNull8, "");
                            throw jsonDataExceptionUnexpectedNull8;
                        }
                        str2 = strFromJson7;
                        strFromJson2 = str3;
                        appDTOFromJson = appDTO;
                        imageUrlDTO = imageUrlDTO2;
                        strFromJson4 = str5;
                        list2 = list3;
                        listFromJson = list4;
                        list = list5;
                        strFromJson3 = str6;
                        str = str7;
                        strFromJson = str8;
                        break;
                        break;
                    case 9:
                        ImageUrlDTO imageUrlDTOFromJson = this.imageUrlDTOAdapter.fromJson(jsonReader);
                        if (imageUrlDTOFromJson == null) {
                            JsonDataException jsonDataExceptionUnexpectedNull9 = Util.unexpectedNull("imageUrl", "image_url", jsonReader);
                            Intrinsics.checkNotNullExpressionValue(jsonDataExceptionUnexpectedNull9, "");
                            throw jsonDataExceptionUnexpectedNull9;
                        }
                        imageUrlDTO = imageUrlDTOFromJson;
                        strFromJson2 = str3;
                        appDTOFromJson = appDTO;
                        str2 = str4;
                        strFromJson4 = str5;
                        list2 = list3;
                        listFromJson = list4;
                        list = list5;
                        strFromJson3 = str6;
                        str = str7;
                        strFromJson = str8;
                        break;
                        break;
                    case 10:
                        appDTOFromJson = this.appDTOAdapter.fromJson(jsonReader);
                        if (appDTOFromJson == null) {
                            JsonDataException jsonDataExceptionUnexpectedNull10 = Util.unexpectedNull("app", "app", jsonReader);
                            Intrinsics.checkNotNullExpressionValue(jsonDataExceptionUnexpectedNull10, "");
                            throw jsonDataExceptionUnexpectedNull10;
                        }
                        strFromJson2 = str3;
                        imageUrlDTO = imageUrlDTO2;
                        str2 = str4;
                        strFromJson4 = str5;
                        list2 = list3;
                        listFromJson = list4;
                        list = list5;
                        strFromJson3 = str6;
                        str = str7;
                        strFromJson = str8;
                        break;
                        break;
                    case 11:
                        listFromJson2 = this.nullableListOfInjectedDTOAdapter.fromJson(jsonReader);
                        strFromJson2 = str3;
                        appDTOFromJson = appDTO;
                        imageUrlDTO = imageUrlDTO2;
                        str2 = str4;
                        strFromJson4 = str5;
                        list2 = list3;
                        listFromJson = list4;
                        list = list5;
                        strFromJson3 = str6;
                        str = str7;
                        strFromJson = str8;
                        break;
                    case 12:
                        mobileDTOFromJson = this.mobileDTOAdapter.fromJson(jsonReader);
                        if (mobileDTOFromJson == null) {
                            JsonDataException jsonDataExceptionUnexpectedNull11 = Util.unexpectedNull(ConnectionMethod.MOBILE, ConnectionMethod.MOBILE, jsonReader);
                            Intrinsics.checkNotNullExpressionValue(jsonDataExceptionUnexpectedNull11, "");
                            throw jsonDataExceptionUnexpectedNull11;
                        }
                        strFromJson2 = str3;
                        appDTOFromJson = appDTO;
                        imageUrlDTO = imageUrlDTO2;
                        str2 = str4;
                        strFromJson4 = str5;
                        list2 = list3;
                        listFromJson = list4;
                        list = list5;
                        strFromJson3 = str6;
                        str = str7;
                        strFromJson = str8;
                        break;
                    case 13:
                        desktopDTOFromJson = this.desktopDTOAdapter.fromJson(jsonReader);
                        if (desktopDTOFromJson == null) {
                            JsonDataException jsonDataExceptionUnexpectedNull12 = Util.unexpectedNull("desktop", "desktop", jsonReader);
                            Intrinsics.checkNotNullExpressionValue(jsonDataExceptionUnexpectedNull12, "");
                            throw jsonDataExceptionUnexpectedNull12;
                        }
                        strFromJson2 = str3;
                        appDTOFromJson = appDTO;
                        imageUrlDTO = imageUrlDTO2;
                        str2 = str4;
                        strFromJson4 = str5;
                        list2 = list3;
                        listFromJson = list4;
                        list = list5;
                        strFromJson3 = str6;
                        str = str7;
                        strFromJson = str8;
                        break;
                    case 14:
                        listFromJson3 = this.listOfSupportedStandardDTOAdapter.fromJson(jsonReader);
                        if (listFromJson3 == null) {
                            JsonDataException jsonDataExceptionUnexpectedNull13 = Util.unexpectedNull("supportedStandards", "supported_standards", jsonReader);
                            Intrinsics.checkNotNullExpressionValue(jsonDataExceptionUnexpectedNull13, "");
                            throw jsonDataExceptionUnexpectedNull13;
                        }
                        strFromJson2 = str3;
                        appDTOFromJson = appDTO;
                        imageUrlDTO = imageUrlDTO2;
                        str2 = str4;
                        strFromJson4 = str5;
                        list2 = list3;
                        listFromJson = list4;
                        list = list5;
                        strFromJson3 = str6;
                        str = str7;
                        strFromJson = str8;
                        break;
                    case 15:
                        metadataDTOFromJson = this.metadataDTOAdapter.fromJson(jsonReader);
                        if (metadataDTOFromJson == null) {
                            JsonDataException jsonDataExceptionUnexpectedNull14 = Util.unexpectedNull(TtmlNode.TAG_METADATA, TtmlNode.TAG_METADATA, jsonReader);
                            Intrinsics.checkNotNullExpressionValue(jsonDataExceptionUnexpectedNull14, "");
                            throw jsonDataExceptionUnexpectedNull14;
                        }
                        strFromJson2 = str3;
                        appDTOFromJson = appDTO;
                        imageUrlDTO = imageUrlDTO2;
                        str2 = str4;
                        strFromJson4 = str5;
                        list2 = list3;
                        listFromJson = list4;
                        list = list5;
                        strFromJson3 = str6;
                        str = str7;
                        strFromJson = str8;
                        break;
                    case 16:
                        strFromJson5 = this.stringAdapter.fromJson(jsonReader);
                        if (strFromJson5 == null) {
                            JsonDataException jsonDataExceptionUnexpectedNull15 = Util.unexpectedNull("updatedAt", "updatedAt", jsonReader);
                            Intrinsics.checkNotNullExpressionValue(jsonDataExceptionUnexpectedNull15, "");
                            throw jsonDataExceptionUnexpectedNull15;
                        }
                        strFromJson2 = str3;
                        appDTOFromJson = appDTO;
                        imageUrlDTO = imageUrlDTO2;
                        str2 = str4;
                        strFromJson4 = str5;
                        list2 = list3;
                        listFromJson = list4;
                        list = list5;
                        strFromJson3 = str6;
                        str = str7;
                        strFromJson = str8;
                        break;
                    default:
                        strFromJson2 = str3;
                        appDTOFromJson = appDTO;
                        imageUrlDTO = imageUrlDTO2;
                        str2 = str4;
                        strFromJson4 = str5;
                        list2 = list3;
                        listFromJson = list4;
                        list = list5;
                        strFromJson3 = str6;
                        str = str7;
                        strFromJson = str8;
                        break;
                }
            } else {
                jsonReader.endObject();
                if (str8 == null) {
                    JsonDataException jsonDataExceptionMissingProperty = Util.missingProperty("id", "id", jsonReader);
                    Intrinsics.checkNotNullExpressionValue(jsonDataExceptionMissingProperty, "");
                    throw jsonDataExceptionMissingProperty;
                }
                if (str7 == null) {
                    JsonDataException jsonDataExceptionMissingProperty2 = Util.missingProperty("name", "name", jsonReader);
                    Intrinsics.checkNotNullExpressionValue(jsonDataExceptionMissingProperty2, "");
                    throw jsonDataExceptionMissingProperty2;
                }
                if (str6 == null) {
                    JsonDataException jsonDataExceptionMissingProperty3 = Util.missingProperty("homepage", "homepage", jsonReader);
                    Intrinsics.checkNotNullExpressionValue(jsonDataExceptionMissingProperty3, "");
                    throw jsonDataExceptionMissingProperty3;
                }
                if (list5 == null) {
                    JsonDataException jsonDataExceptionMissingProperty4 = Util.missingProperty("chains", "chains", jsonReader);
                    Intrinsics.checkNotNullExpressionValue(jsonDataExceptionMissingProperty4, "");
                    throw jsonDataExceptionMissingProperty4;
                }
                if (list4 == null) {
                    JsonDataException jsonDataExceptionMissingProperty5 = Util.missingProperty("versions", "versions", jsonReader);
                    Intrinsics.checkNotNullExpressionValue(jsonDataExceptionMissingProperty5, "");
                    throw jsonDataExceptionMissingProperty5;
                }
                if (list3 == null) {
                    JsonDataException jsonDataExceptionMissingProperty6 = Util.missingProperty("sdks", "sdks", jsonReader);
                    Intrinsics.checkNotNullExpressionValue(jsonDataExceptionMissingProperty6, "");
                    throw jsonDataExceptionMissingProperty6;
                }
                if (str5 == null) {
                    JsonDataException jsonDataExceptionMissingProperty7 = Util.missingProperty("appType", "app_type", jsonReader);
                    Intrinsics.checkNotNullExpressionValue(jsonDataExceptionMissingProperty7, "");
                    throw jsonDataExceptionMissingProperty7;
                }
                if (str4 == null) {
                    JsonDataException jsonDataExceptionMissingProperty8 = Util.missingProperty("imageId", "image_id", jsonReader);
                    Intrinsics.checkNotNullExpressionValue(jsonDataExceptionMissingProperty8, "");
                    throw jsonDataExceptionMissingProperty8;
                }
                if (imageUrlDTO2 == null) {
                    JsonDataException jsonDataExceptionMissingProperty9 = Util.missingProperty("imageUrl", "image_url", jsonReader);
                    Intrinsics.checkNotNullExpressionValue(jsonDataExceptionMissingProperty9, "");
                    throw jsonDataExceptionMissingProperty9;
                }
                if (appDTO == null) {
                    JsonDataException jsonDataExceptionMissingProperty10 = Util.missingProperty("app", "app", jsonReader);
                    Intrinsics.checkNotNullExpressionValue(jsonDataExceptionMissingProperty10, "");
                    throw jsonDataExceptionMissingProperty10;
                }
                if (mobileDTOFromJson == null) {
                    JsonDataException jsonDataExceptionMissingProperty11 = Util.missingProperty(ConnectionMethod.MOBILE, ConnectionMethod.MOBILE, jsonReader);
                    Intrinsics.checkNotNullExpressionValue(jsonDataExceptionMissingProperty11, "");
                    throw jsonDataExceptionMissingProperty11;
                }
                if (desktopDTOFromJson == null) {
                    JsonDataException jsonDataExceptionMissingProperty12 = Util.missingProperty("desktop", "desktop", jsonReader);
                    Intrinsics.checkNotNullExpressionValue(jsonDataExceptionMissingProperty12, "");
                    throw jsonDataExceptionMissingProperty12;
                }
                if (listFromJson3 == null) {
                    JsonDataException jsonDataExceptionMissingProperty13 = Util.missingProperty("supportedStandards", "supported_standards", jsonReader);
                    Intrinsics.checkNotNullExpressionValue(jsonDataExceptionMissingProperty13, "");
                    throw jsonDataExceptionMissingProperty13;
                }
                if (metadataDTOFromJson == null) {
                    JsonDataException jsonDataExceptionMissingProperty14 = Util.missingProperty(TtmlNode.TAG_METADATA, TtmlNode.TAG_METADATA, jsonReader);
                    Intrinsics.checkNotNullExpressionValue(jsonDataExceptionMissingProperty14, "");
                    throw jsonDataExceptionMissingProperty14;
                }
                if (strFromJson5 != null) {
                    return new ListingDTO(str8, str7, str3, str6, list5, list4, list3, str5, str4, imageUrlDTO2, appDTO, listFromJson2, mobileDTOFromJson, desktopDTOFromJson, listFromJson3, metadataDTOFromJson, strFromJson5);
                }
                JsonDataException jsonDataExceptionMissingProperty15 = Util.missingProperty("updatedAt", "updatedAt", jsonReader);
                Intrinsics.checkNotNullExpressionValue(jsonDataExceptionMissingProperty15, "");
                throw jsonDataExceptionMissingProperty15;
            }
        }
    }

    /* JADX DEBUG: Method merged with bridge method: toJson(Lcom/squareup/moshi/JsonWriter;Ljava/lang/Object;)V */
    @Override // com.squareup.moshi.JsonAdapter
    public void toJson(@NotNull JsonWriter jsonWriter, ListingDTO listingDTO) throws IOException {
        Intrinsics.checkNotNullParameter(jsonWriter, "");
        if (listingDTO == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        jsonWriter.beginObject();
        jsonWriter.name("id");
        this.stringAdapter.toJson(jsonWriter, listingDTO.getId());
        jsonWriter.name("name");
        this.stringAdapter.toJson(jsonWriter, listingDTO.getName());
        jsonWriter.name("description");
        this.nullableStringAdapter.toJson(jsonWriter, listingDTO.getDescription());
        jsonWriter.name("homepage");
        this.stringAdapter.toJson(jsonWriter, listingDTO.getHomepage());
        jsonWriter.name("chains");
        this.listOfStringAdapter.toJson(jsonWriter, listingDTO.getChains());
        jsonWriter.name("versions");
        this.listOfStringAdapter.toJson(jsonWriter, listingDTO.getVersions());
        jsonWriter.name("sdks");
        this.listOfStringAdapter.toJson(jsonWriter, listingDTO.getSdks());
        jsonWriter.name("app_type");
        this.stringAdapter.toJson(jsonWriter, listingDTO.getAppType());
        jsonWriter.name("image_id");
        this.stringAdapter.toJson(jsonWriter, listingDTO.getImageId());
        jsonWriter.name("image_url");
        this.imageUrlDTOAdapter.toJson(jsonWriter, listingDTO.getImageUrl());
        jsonWriter.name("app");
        this.appDTOAdapter.toJson(jsonWriter, listingDTO.getApp());
        jsonWriter.name("injected");
        this.nullableListOfInjectedDTOAdapter.toJson(jsonWriter, listingDTO.getInjected());
        jsonWriter.name(ConnectionMethod.MOBILE);
        this.mobileDTOAdapter.toJson(jsonWriter, listingDTO.getMobile());
        jsonWriter.name("desktop");
        this.desktopDTOAdapter.toJson(jsonWriter, listingDTO.getDesktop());
        jsonWriter.name("supported_standards");
        this.listOfSupportedStandardDTOAdapter.toJson(jsonWriter, listingDTO.getSupportedStandards());
        jsonWriter.name(TtmlNode.TAG_METADATA);
        this.metadataDTOAdapter.toJson(jsonWriter, listingDTO.getMetadata());
        jsonWriter.name("updatedAt");
        this.stringAdapter.toJson(jsonWriter, listingDTO.getUpdatedAt());
        jsonWriter.endObject();
    }
}
