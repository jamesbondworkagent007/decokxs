package com.okinc.ok_kyc_core.data.remote.networkmodel;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.HashMapSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonArraySerializer;
import o.C43747rvC;
import o.C43783rvm;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@SerialName("result")
@Serializable
public final class Result extends PageComponent implements Parcelable {
    private static final KSerializer<Object>[] $childSerializers;
    private final HashMap<String, String> amplitudeParams;
    private final Boolean canClose;
    private final Boolean canGoBack;
    private final Cta cta;
    private final String faqUrl;
    private final String icon;
    private final String id;
    private final Boolean isFlowSuccess;
    private final Integer isHidePro;
    private final JsonArray items;
    private final Exit onExit;
    private final Boolean pageStack;
    private final Quit quit;
    private final Boolean required;
    private final Integer risk;
    private final ResultStatus status;
    private final String subtitle;
    private final String title;
    private final String value;
    private final String version;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<Result> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<Result> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Result createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Boolean boolValueOf2;
            Boolean boolValueOf3;
            Boolean boolValueOf4;
            Boolean boolValueOf5;
            HashMap map;
            Intrinsics.checkNotNullParameter(parcel, "");
            JsonArray jsonArray = (JsonArray) parcel.readValue(Result.class.getClassLoader());
            Cta cta = (Cta) parcel.readParcelable(Result.class.getClassLoader());
            String string = parcel.readString();
            ResultStatus resultStatusValueOf = parcel.readInt() == 0 ? null : ResultStatus.valueOf(parcel.readString());
            Quit quitCreateFromParcel = parcel.readInt() == 0 ? null : Quit.CREATOR.createFromParcel(parcel);
            Exit exitCreateFromParcel = parcel.readInt() == 0 ? null : Exit.CREATOR.createFromParcel(parcel);
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer numValueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String string2 = parcel.readString();
            int i = 0;
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                boolValueOf2 = null;
            } else {
                boolValueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                boolValueOf3 = null;
            } else {
                boolValueOf3 = Boolean.valueOf(parcel.readInt() != 0);
            }
            String string3 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf4 = null;
            } else {
                boolValueOf4 = Boolean.valueOf(parcel.readInt() != 0);
            }
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf5 = null;
            } else {
                boolValueOf5 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                map = null;
            } else {
                int i2 = parcel.readInt();
                HashMap map2 = new HashMap(i2);
                while (i != i2) {
                    map2.put(parcel.readString(), parcel.readString());
                    i++;
                    i2 = i2;
                }
                map = map2;
            }
            return new Result(jsonArray, cta, string, resultStatusValueOf, quitCreateFromParcel, exitCreateFromParcel, numValueOf, numValueOf2, string2, boolValueOf, boolValueOf2, boolValueOf3, string3, boolValueOf4, string4, string5, string6, string7, boolValueOf5, map);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Result[] newArray(int i) {
            return new Result[i];
        }
    }

    @Serializable(with = C43783rvm.class)
    public static /* synthetic */ void getStatus$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final JsonArray component1() {
        return this.items;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component10() {
        return this.canGoBack;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component11() {
        return this.canClose;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component12() {
        return this.isFlowSuccess;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component13() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component14() {
        return this.required;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component15() {
        return this.version;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component16() {
        return this.value;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component17() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component18() {
        return this.subtitle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component19() {
        return this.pageStack;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Cta component2() {
        return this.cta;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final HashMap<String, String> component20() {
        return this.amplitudeParams;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.icon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ResultStatus component4() {
        return this.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Quit component5() {
        return this.quit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Exit component6() {
        return this.onExit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component7() {
        return this.isHidePro;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component8() {
        return this.risk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.faqUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Result copy(@NotNull JsonArray jsonArray, Cta cta, String str, ResultStatus resultStatus, Quit quit, Exit exit, Integer num, Integer num2, String str2, Boolean bool, Boolean bool2, Boolean bool3, String str3, Boolean bool4, String str4, String str5, String str6, String str7, Boolean bool5, HashMap<String, String> map) {
        Intrinsics.checkNotNullParameter(jsonArray, "");
        return new Result(jsonArray, cta, str, resultStatus, quit, exit, num, num2, str2, bool, bool2, bool3, str3, bool4, str4, str5, str6, str7, bool5, map);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Result)) {
            return false;
        }
        Result result = (Result) obj;
        return Intrinsics.EZpvd(this.items, result.items) && Intrinsics.EZpvd(this.cta, result.cta) && Intrinsics.EZpvd((Object) this.icon, (Object) result.icon) && this.status == result.status && Intrinsics.EZpvd(this.quit, result.quit) && Intrinsics.EZpvd(this.onExit, result.onExit) && Intrinsics.EZpvd(this.isHidePro, result.isHidePro) && Intrinsics.EZpvd(this.risk, result.risk) && Intrinsics.EZpvd((Object) this.faqUrl, (Object) result.faqUrl) && Intrinsics.EZpvd(this.canGoBack, result.canGoBack) && Intrinsics.EZpvd(this.canClose, result.canClose) && Intrinsics.EZpvd(this.isFlowSuccess, result.isFlowSuccess) && Intrinsics.EZpvd((Object) this.id, (Object) result.id) && Intrinsics.EZpvd(this.required, result.required) && Intrinsics.EZpvd((Object) this.version, (Object) result.version) && Intrinsics.EZpvd((Object) this.value, (Object) result.value) && Intrinsics.EZpvd((Object) this.title, (Object) result.title) && Intrinsics.EZpvd((Object) this.subtitle, (Object) result.subtitle) && Intrinsics.EZpvd(this.pageStack, result.pageStack) && Intrinsics.EZpvd(this.amplitudeParams, result.amplitudeParams);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final HashMap<String, String> getAmplitudeParams() {
        return this.amplitudeParams;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getCanClose() {
        return this.canClose;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getCanGoBack() {
        return this.canGoBack;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Cta getCta() {
        return this.cta;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFaqUrl() {
        return this.faqUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getIcon() {
        return this.icon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.PageComponent
    public String getId() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final JsonArray getItems() {
        return this.items;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Exit getOnExit() {
        return this.onExit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.PageComponent
    public Boolean getPageStack() {
        return this.pageStack;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Quit getQuit() {
        return this.quit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.PageComponent
    public Boolean getRequired() {
        return this.required;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getRisk() {
        return this.risk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ResultStatus getStatus() {
        return this.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.PageComponent
    public String getSubtitle() {
        return this.subtitle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.PageComponent
    public String getTitle() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.PageComponent
    public String getValue() {
        return this.value;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.PageComponent
    public String getVersion() {
        return this.version;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.items.hashCode();
        Cta cta = this.cta;
        int iHashCode2 = cta == null ? 0 : cta.hashCode();
        String str = this.icon;
        int iHashCode3 = str == null ? 0 : str.hashCode();
        ResultStatus resultStatus = this.status;
        int iHashCode4 = resultStatus == null ? 0 : resultStatus.hashCode();
        Quit quit = this.quit;
        int iHashCode5 = quit == null ? 0 : quit.hashCode();
        Exit exit = this.onExit;
        int iHashCode6 = exit == null ? 0 : exit.hashCode();
        Integer num = this.isHidePro;
        int iHashCode7 = num == null ? 0 : num.hashCode();
        Integer num2 = this.risk;
        int iHashCode8 = num2 == null ? 0 : num2.hashCode();
        String str2 = this.faqUrl;
        int iHashCode9 = str2 == null ? 0 : str2.hashCode();
        Boolean bool = this.canGoBack;
        int iHashCode10 = bool == null ? 0 : bool.hashCode();
        Boolean bool2 = this.canClose;
        int iHashCode11 = bool2 == null ? 0 : bool2.hashCode();
        Boolean bool3 = this.isFlowSuccess;
        int iHashCode12 = bool3 == null ? 0 : bool3.hashCode();
        String str3 = this.id;
        int iHashCode13 = str3 == null ? 0 : str3.hashCode();
        Boolean bool4 = this.required;
        int iHashCode14 = bool4 == null ? 0 : bool4.hashCode();
        String str4 = this.version;
        int iHashCode15 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.value;
        int iHashCode16 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.title;
        int iHashCode17 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.subtitle;
        int iHashCode18 = str7 == null ? 0 : str7.hashCode();
        Boolean bool5 = this.pageStack;
        int iHashCode19 = bool5 == null ? 0 : bool5.hashCode();
        HashMap<String, String> map = this.amplitudeParams;
        return (((((((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + iHashCode19) * 31) + (map == null ? 0 : map.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean isFlowSuccess() {
        return this.isFlowSuccess;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer isHidePro() {
        return this.isHidePro;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "Result(items=" + this.items + ", cta=" + this.cta + ", icon=" + this.icon + ", status=" + this.status + ", quit=" + this.quit + ", onExit=" + this.onExit + ", isHidePro=" + this.isHidePro + ", risk=" + this.risk + ", faqUrl=" + this.faqUrl + ", canGoBack=" + this.canGoBack + ", canClose=" + this.canClose + ", isFlowSuccess=" + this.isFlowSuccess + ", id=" + this.id + ", required=" + this.required + ", version=" + this.version + ", value=" + this.value + ", title=" + this.title + ", subtitle=" + this.subtitle + ", pageStack=" + this.pageStack + ", amplitudeParams=" + this.amplitudeParams + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeValue(this.items);
        parcel.writeParcelable(this.cta, i);
        parcel.writeString(this.icon);
        ResultStatus resultStatus = this.status;
        if (resultStatus == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(resultStatus.name());
        }
        Quit quit = this.quit;
        if (quit == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            quit.writeToParcel(parcel, i);
        }
        Exit exit = this.onExit;
        if (exit == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            exit.writeToParcel(parcel, i);
        }
        Integer num = this.isHidePro;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        Integer num2 = this.risk;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        parcel.writeString(this.faqUrl);
        Boolean bool = this.canGoBack;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        Boolean bool2 = this.canClose;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool2.booleanValue() ? 1 : 0);
        }
        Boolean bool3 = this.isFlowSuccess;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool3.booleanValue() ? 1 : 0);
        }
        parcel.writeString(this.id);
        Boolean bool4 = this.required;
        if (bool4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool4.booleanValue() ? 1 : 0);
        }
        parcel.writeString(this.version);
        parcel.writeString(this.value);
        parcel.writeString(this.title);
        parcel.writeString(this.subtitle);
        Boolean bool5 = this.pageStack;
        if (bool5 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool5.booleanValue() ? 1 : 0);
        }
        HashMap<String, String> map = this.amplitudeParams;
        if (map == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            parcel.writeString(entry.getKey());
            parcel.writeString(entry.getValue());
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.ok_kyc_core.data.remote.networkmodel.Result.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<Result> serializer() {
            return Result$$serializer.INSTANCE;
        }
    }

    static {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        $childSerializers = new KSerializer[]{null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new HashMapSerializer(stringSerializer, BuiltinSerializersKt.getNullable(stringSerializer))};
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Result(int i, JsonArray jsonArray, Cta cta, String str, ResultStatus resultStatus, Quit quit, Exit exit, Integer num, Integer num2, String str2, Boolean bool, Boolean bool2, Boolean bool3, String str3, Boolean bool4, String str4, String str5, String str6, String str7, Boolean bool5, HashMap map, SerializationConstructorMarker serializationConstructorMarker) {
        super(i, serializationConstructorMarker);
        if (253889 != (i & 253889)) {
            PluginExceptionsKt.throwMissingFieldException(i, 253889, Result$$serializer.INSTANCE.getDescriptor());
        }
        this.items = jsonArray;
        if ((i & 2) == 0) {
            this.cta = null;
        } else {
            this.cta = cta;
        }
        if ((i & 4) == 0) {
            this.icon = null;
        } else {
            this.icon = str;
        }
        if ((i & 8) == 0) {
            this.status = null;
        } else {
            this.status = resultStatus;
        }
        if ((i & 16) == 0) {
            this.quit = null;
        } else {
            this.quit = quit;
        }
        if ((i & 32) == 0) {
            this.onExit = null;
        } else {
            this.onExit = exit;
        }
        this.isHidePro = num;
        this.risk = num2;
        this.faqUrl = str2;
        this.canGoBack = bool;
        this.canClose = bool2;
        this.isFlowSuccess = bool3;
        this.id = str3;
        this.required = (i & 8192) == 0 ? Boolean.FALSE : bool4;
        this.version = str4;
        this.value = str5;
        this.title = str6;
        this.subtitle = str7;
        this.pageStack = (262144 & i) == 0 ? Boolean.FALSE : bool5;
        if ((i & 524288) == 0) {
            this.amplitudeParams = null;
        } else {
            this.amplitudeParams = map;
        }
    }

    public static final /* synthetic */ void write$Self$OKCompliance_ok_compliance_impl(Result result, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        PageComponent.write$Self(result, compositeEncoder, serialDescriptor);
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeSerializableElement(serialDescriptor, 0, JsonArraySerializer.INSTANCE, result.items);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || result.cta != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, Cta$$serializer.INSTANCE, result.cta);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || result.icon != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, result.icon);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || result.status != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, C43783rvm.EZpvd, result.status);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || result.quit != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, Quit$$serializer.INSTANCE, result.quit);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || result.onExit != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, Exit$$serializer.INSTANCE, result.onExit);
        }
        IntSerializer intSerializer = IntSerializer.INSTANCE;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, intSerializer, result.isHidePro);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, intSerializer, result.risk);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, stringSerializer, result.faqUrl);
        BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, booleanSerializer, result.canGoBack);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, booleanSerializer, result.canClose);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 11, booleanSerializer, result.isFlowSuccess);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 12, stringSerializer, result.getId());
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || !Intrinsics.EZpvd(result.getRequired(), Boolean.FALSE)) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 13, booleanSerializer, result.getRequired());
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 14, stringSerializer, result.getVersion());
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 15, stringSerializer, result.getValue());
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 16, stringSerializer, result.getTitle());
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 17, stringSerializer, result.getSubtitle());
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 18) || !Intrinsics.EZpvd(result.getPageStack(), Boolean.FALSE)) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 18, booleanSerializer, result.getPageStack());
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 19) && result.amplitudeParams == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 19, kSerializerArr[19], result.amplitudeParams);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0066: CONSTRUCTOR 
  (r25v0 kotlinx.serialization.json.JsonArray)
  (wrap:com.okinc.ok_kyc_core.data.remote.networkmodel.Cta:?: TERNARY null = ((wrap:int:0x0002: ARITH (r45v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.ok_kyc_core.data.remote.networkmodel.Cta) : (r26v0 com.okinc.ok_kyc_core.data.remote.networkmodel.Cta))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r45v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r27v0 java.lang.String))
  (wrap:com.okinc.ok_kyc_core.data.remote.networkmodel.ResultStatus:?: TERNARY null = ((wrap:int:0x0013: ARITH (r45v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.ok_kyc_core.data.remote.networkmodel.ResultStatus) : (r28v0 com.okinc.ok_kyc_core.data.remote.networkmodel.ResultStatus))
  (wrap:com.okinc.ok_kyc_core.data.remote.networkmodel.Quit:?: TERNARY null = ((wrap:int:0x001b: ARITH (r45v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.ok_kyc_core.data.remote.networkmodel.Quit) : (r29v0 com.okinc.ok_kyc_core.data.remote.networkmodel.Quit))
  (wrap:com.okinc.ok_kyc_core.data.remote.networkmodel.Exit:?: TERNARY null = ((wrap:int:0x0023: ARITH (r45v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.ok_kyc_core.data.remote.networkmodel.Exit) : (r30v0 com.okinc.ok_kyc_core.data.remote.networkmodel.Exit))
  (r31v0 java.lang.Integer)
  (r32v0 java.lang.Integer)
  (r33v0 java.lang.String)
  (r34v0 java.lang.Boolean)
  (r35v0 java.lang.Boolean)
  (r36v0 java.lang.Boolean)
  (r37v0 java.lang.String)
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x002b: ARITH (r45v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0031: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r38v0 java.lang.Boolean))
  (r39v0 java.lang.String)
  (r40v0 java.lang.String)
  (r41v0 java.lang.String)
  (r42v0 java.lang.String)
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0038: ARITH (262144 int) & (r45v0 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x003d: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r43v0 java.lang.Boolean))
  (wrap:java.util.HashMap:?: TERNARY null = ((wrap:int:0x0044: ARITH (r45v0 int) & (524288 int) A[WRAPPED]) != (0 int)) ? (null java.util.HashMap) : (r44v0 java.util.HashMap))
 A[MD:(kotlinx.serialization.json.JsonArray, com.okinc.ok_kyc_core.data.remote.networkmodel.Cta, java.lang.String, com.okinc.ok_kyc_core.data.remote.networkmodel.ResultStatus, com.okinc.ok_kyc_core.data.remote.networkmodel.Quit, com.okinc.ok_kyc_core.data.remote.networkmodel.Exit, java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.util.HashMap<java.lang.String, java.lang.String>):void (m)] (LINE:712) call: com.okinc.ok_kyc_core.data.remote.networkmodel.Result.<init>(kotlinx.serialization.json.JsonArray, com.okinc.ok_kyc_core.data.remote.networkmodel.Cta, java.lang.String, com.okinc.ok_kyc_core.data.remote.networkmodel.ResultStatus, com.okinc.ok_kyc_core.data.remote.networkmodel.Quit, com.okinc.ok_kyc_core.data.remote.networkmodel.Exit, java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.util.HashMap):void type: THIS */
    public /* synthetic */ Result(JsonArray jsonArray, Cta cta, String str, ResultStatus resultStatus, Quit quit, Exit exit, Integer num, Integer num2, String str2, Boolean bool, Boolean bool2, Boolean bool3, String str3, Boolean bool4, String str4, String str5, String str6, String str7, Boolean bool5, HashMap map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(jsonArray, (i & 2) != 0 ? null : cta, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : resultStatus, (i & 16) != 0 ? null : quit, (i & 32) != 0 ? null : exit, num, num2, str2, bool, bool2, bool3, str3, (i & 8192) != 0 ? Boolean.FALSE : bool4, str4, str5, str6, str7, (262144 & i) != 0 ? Boolean.FALSE : bool5, (i & 524288) != 0 ? null : map);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Result(@NotNull JsonArray jsonArray, Cta cta, String str, ResultStatus resultStatus, Quit quit, Exit exit, Integer num, Integer num2, String str2, Boolean bool, Boolean bool2, Boolean bool3, String str3, Boolean bool4, String str4, String str5, String str6, String str7, Boolean bool5, HashMap<String, String> map) {
        super(null);
        Intrinsics.checkNotNullParameter(jsonArray, "");
        this.items = jsonArray;
        this.cta = cta;
        this.icon = str;
        this.status = resultStatus;
        this.quit = quit;
        this.onExit = exit;
        this.isHidePro = num;
        this.risk = num2;
        this.faqUrl = str2;
        this.canGoBack = bool;
        this.canClose = bool2;
        this.isFlowSuccess = bool3;
        this.id = str3;
        this.required = bool4;
        this.version = str4;
        this.value = str5;
        this.title = str6;
        this.subtitle = str7;
        this.pageStack = bool5;
        this.amplitudeParams = map;
    }

    /* JADX DEBUG: Method merged with bridge method: toAppModel()Lcom/okinc/ok_kyc_core/data/remote/networkmodel/PageComponentAppModel; */
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.PageComponent
    public ResultAppModel toAppModel() {
        List<UIComponentAppModel> listCopydefault = C43747rvC.copydefault(this.items);
        Cta cta = this.cta;
        return new ResultAppModel(listCopydefault, cta != null ? cta.toAppModel() : null, this.icon, this.status, this.quit, this.onExit, this.isHidePro, this.risk, this.faqUrl, this.canGoBack, this.canClose, this.isFlowSuccess, getId(), getRequired(), getVersion(), getValue(), getTitle(), getSubtitle(), getPageStack(), this.amplitudeParams);
    }
}
