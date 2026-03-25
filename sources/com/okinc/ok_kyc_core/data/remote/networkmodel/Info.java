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
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonArraySerializer;
import o.C43747rvC;
import o.C43780rvj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@SerialName("info")
@Serializable
public final class Info extends PageComponent {
    private static final KSerializer<Object>[] $childSerializers;
    private final HashMap<String, String> amplitudeParams;
    private final Boolean canClose;
    private final Boolean canGoBack;
    private final Cta cta;
    private final String id;
    private final JsonArray items;
    private final Boolean pageStack;
    private final String pageTitle;
    private final Quit quit;
    private final Boolean required;
    private final RichSubtitleData richSubtitle;
    private final RichTitle richTitle;
    private final Stepper stepper;
    private final String subtitle;
    private final String title;
    private final ToastModel toast;
    private final String value;
    private final String version;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<Info> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<Info> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Info createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Boolean boolValueOf2;
            Boolean boolValueOf3;
            Boolean boolValueOf4;
            HashMap map;
            Intrinsics.checkNotNullParameter(parcel, "");
            JsonArray jsonArray = (JsonArray) parcel.readValue(Info.class.getClassLoader());
            Cta cta = (Cta) parcel.readParcelable(Info.class.getClassLoader());
            Stepper stepperCreateFromParcel = parcel.readInt() == 0 ? null : Stepper.CREATOR.createFromParcel(parcel);
            int i = 0;
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            String string = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf2 = null;
            } else {
                boolValueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            Quit quitCreateFromParcel = parcel.readInt() == 0 ? null : Quit.CREATOR.createFromParcel(parcel);
            RichTitle richTitleCreateFromParcel = parcel.readInt() == 0 ? null : RichTitle.CREATOR.createFromParcel(parcel);
            RichSubtitleData richSubtitleDataCreateFromParcel = parcel.readInt() == 0 ? null : RichSubtitleData.CREATOR.createFromParcel(parcel);
            String string2 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf3 = null;
            } else {
                boolValueOf3 = Boolean.valueOf(parcel.readInt() != 0);
            }
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf4 = null;
            } else {
                boolValueOf4 = Boolean.valueOf(parcel.readInt() != 0);
            }
            ToastModel toastModelCreateFromParcel = parcel.readInt() == 0 ? null : ToastModel.CREATOR.createFromParcel(parcel);
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
            return new Info(jsonArray, cta, stepperCreateFromParcel, boolValueOf, string, boolValueOf2, quitCreateFromParcel, richTitleCreateFromParcel, richSubtitleDataCreateFromParcel, string2, boolValueOf3, string3, string4, string5, string6, boolValueOf4, toastModelCreateFromParcel, map);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Info[] newArray(int i) {
            return new Info[i];
        }
    }

    @SerialName("step")
    public static /* synthetic */ void getStepper$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final JsonArray component1() {
        return this.items;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component11() {
        return this.required;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.version;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component13() {
        return this.value;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component14() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component15() {
        return this.subtitle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component16() {
        return this.pageStack;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ToastModel component17() {
        return this.toast;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final HashMap<String, String> component18() {
        return this.amplitudeParams;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Cta component2() {
        return this.cta;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Stepper component3() {
        return this.stepper;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component4() {
        return this.canGoBack;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.pageTitle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component6() {
        return this.canClose;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Quit component7() {
        return this.quit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RichTitle component8() {
        return this.richTitle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RichSubtitleData component9() {
        return this.richSubtitle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Info copy(@NotNull JsonArray jsonArray, Cta cta, Stepper stepper, Boolean bool, String str, Boolean bool2, Quit quit, RichTitle richTitle, RichSubtitleData richSubtitleData, String str2, Boolean bool3, String str3, String str4, String str5, String str6, Boolean bool4, ToastModel toastModel, HashMap<String, String> map) {
        Intrinsics.checkNotNullParameter(jsonArray, "");
        return new Info(jsonArray, cta, stepper, bool, str, bool2, quit, richTitle, richSubtitleData, str2, bool3, str3, str4, str5, str6, bool4, toastModel, map);
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
        if (!(obj instanceof Info)) {
            return false;
        }
        Info info = (Info) obj;
        return Intrinsics.EZpvd(this.items, info.items) && Intrinsics.EZpvd(this.cta, info.cta) && Intrinsics.EZpvd(this.stepper, info.stepper) && Intrinsics.EZpvd(this.canGoBack, info.canGoBack) && Intrinsics.EZpvd((Object) this.pageTitle, (Object) info.pageTitle) && Intrinsics.EZpvd(this.canClose, info.canClose) && Intrinsics.EZpvd(this.quit, info.quit) && Intrinsics.EZpvd(this.richTitle, info.richTitle) && Intrinsics.EZpvd(this.richSubtitle, info.richSubtitle) && Intrinsics.EZpvd((Object) this.id, (Object) info.id) && Intrinsics.EZpvd(this.required, info.required) && Intrinsics.EZpvd((Object) this.version, (Object) info.version) && Intrinsics.EZpvd((Object) this.value, (Object) info.value) && Intrinsics.EZpvd((Object) this.title, (Object) info.title) && Intrinsics.EZpvd((Object) this.subtitle, (Object) info.subtitle) && Intrinsics.EZpvd(this.pageStack, info.pageStack) && Intrinsics.EZpvd(this.toast, info.toast) && Intrinsics.EZpvd(this.amplitudeParams, info.amplitudeParams);
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
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.PageComponent
    public String getId() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final JsonArray getItems() {
        return this.items;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.PageComponent
    public Boolean getPageStack() {
        return this.pageStack;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPageTitle() {
        return this.pageTitle;
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
    public final RichSubtitleData getRichSubtitle() {
        return this.richSubtitle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RichTitle getRichTitle() {
        return this.richTitle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Stepper getStepper() {
        return this.stepper;
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
    public final ToastModel getToast() {
        return this.toast;
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
        Stepper stepper = this.stepper;
        int iHashCode3 = stepper == null ? 0 : stepper.hashCode();
        Boolean bool = this.canGoBack;
        int iHashCode4 = bool == null ? 0 : bool.hashCode();
        String str = this.pageTitle;
        int iHashCode5 = str == null ? 0 : str.hashCode();
        Boolean bool2 = this.canClose;
        int iHashCode6 = bool2 == null ? 0 : bool2.hashCode();
        Quit quit = this.quit;
        int iHashCode7 = quit == null ? 0 : quit.hashCode();
        RichTitle richTitle = this.richTitle;
        int iHashCode8 = richTitle == null ? 0 : richTitle.hashCode();
        RichSubtitleData richSubtitleData = this.richSubtitle;
        int iHashCode9 = richSubtitleData == null ? 0 : richSubtitleData.hashCode();
        String str2 = this.id;
        int iHashCode10 = str2 == null ? 0 : str2.hashCode();
        Boolean bool3 = this.required;
        int iHashCode11 = bool3 == null ? 0 : bool3.hashCode();
        String str3 = this.version;
        int iHashCode12 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.value;
        int iHashCode13 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.title;
        int iHashCode14 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.subtitle;
        int iHashCode15 = str6 == null ? 0 : str6.hashCode();
        Boolean bool4 = this.pageStack;
        int iHashCode16 = bool4 == null ? 0 : bool4.hashCode();
        ToastModel toastModel = this.toast;
        int iHashCode17 = toastModel == null ? 0 : toastModel.hashCode();
        HashMap<String, String> map = this.amplitudeParams;
        return (((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + (map == null ? 0 : map.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "Info(items=" + this.items + ", cta=" + this.cta + ", stepper=" + this.stepper + ", canGoBack=" + this.canGoBack + ", pageTitle=" + this.pageTitle + ", canClose=" + this.canClose + ", quit=" + this.quit + ", richTitle=" + this.richTitle + ", richSubtitle=" + this.richSubtitle + ", id=" + this.id + ", required=" + this.required + ", version=" + this.version + ", value=" + this.value + ", title=" + this.title + ", subtitle=" + this.subtitle + ", pageStack=" + this.pageStack + ", toast=" + this.toast + ", amplitudeParams=" + this.amplitudeParams + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeValue(this.items);
        parcel.writeParcelable(this.cta, i);
        Stepper stepper = this.stepper;
        if (stepper == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            stepper.writeToParcel(parcel, i);
        }
        Boolean bool = this.canGoBack;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        parcel.writeString(this.pageTitle);
        Boolean bool2 = this.canClose;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool2.booleanValue() ? 1 : 0);
        }
        Quit quit = this.quit;
        if (quit == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            quit.writeToParcel(parcel, i);
        }
        RichTitle richTitle = this.richTitle;
        if (richTitle == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            richTitle.writeToParcel(parcel, i);
        }
        RichSubtitleData richSubtitleData = this.richSubtitle;
        if (richSubtitleData == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            richSubtitleData.writeToParcel(parcel, i);
        }
        parcel.writeString(this.id);
        Boolean bool3 = this.required;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool3.booleanValue() ? 1 : 0);
        }
        parcel.writeString(this.version);
        parcel.writeString(this.value);
        parcel.writeString(this.title);
        parcel.writeString(this.subtitle);
        Boolean bool4 = this.pageStack;
        if (bool4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool4.booleanValue() ? 1 : 0);
        }
        ToastModel toastModel = this.toast;
        if (toastModel == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            toastModel.writeToParcel(parcel, i);
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

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.ok_kyc_core.data.remote.networkmodel.Info.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<Info> serializer() {
            return Info$$serializer.INSTANCE;
        }
    }

    static {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        $childSerializers = new KSerializer[]{null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new HashMapSerializer(stringSerializer, BuiltinSerializersKt.getNullable(stringSerializer))};
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Info(int i, JsonArray jsonArray, Cta cta, Stepper stepper, Boolean bool, String str, Boolean bool2, Quit quit, RichTitle richTitle, RichSubtitleData richSubtitleData, String str2, Boolean bool3, String str3, String str4, String str5, String str6, Boolean bool4, ToastModel toastModel, HashMap map, SerializationConstructorMarker serializationConstructorMarker) {
        super(i, serializationConstructorMarker);
        if (30761 != (i & 30761)) {
            PluginExceptionsKt.throwMissingFieldException(i, 30761, Info$$serializer.INSTANCE.getDescriptor());
        }
        this.items = jsonArray;
        if ((i & 2) == 0) {
            this.cta = null;
        } else {
            this.cta = cta;
        }
        if ((i & 4) == 0) {
            this.stepper = null;
        } else {
            this.stepper = stepper;
        }
        this.canGoBack = bool;
        if ((i & 16) == 0) {
            this.pageTitle = null;
        } else {
            this.pageTitle = str;
        }
        this.canClose = bool2;
        if ((i & 64) == 0) {
            this.quit = null;
        } else {
            this.quit = quit;
        }
        if ((i & 128) == 0) {
            this.richTitle = null;
        } else {
            this.richTitle = richTitle;
        }
        if ((i & 256) == 0) {
            this.richSubtitle = null;
        } else {
            this.richSubtitle = richSubtitleData;
        }
        if ((i & 512) == 0) {
            this.id = null;
        } else {
            this.id = str2;
        }
        this.required = (i & 1024) == 0 ? Boolean.FALSE : bool3;
        this.version = str3;
        this.value = str4;
        this.title = str5;
        this.subtitle = str6;
        this.pageStack = (32768 & i) == 0 ? Boolean.FALSE : bool4;
        if ((65536 & i) == 0) {
            this.toast = null;
        } else {
            this.toast = toastModel;
        }
        if ((i & 131072) == 0) {
            this.amplitudeParams = null;
        } else {
            this.amplitudeParams = map;
        }
    }

    public static final /* synthetic */ void write$Self$OKCompliance_ok_compliance_impl(Info info, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        PageComponent.write$Self(info, compositeEncoder, serialDescriptor);
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeSerializableElement(serialDescriptor, 0, JsonArraySerializer.INSTANCE, info.items);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || info.cta != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, Cta$$serializer.INSTANCE, info.cta);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || info.stepper != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, Stepper$$serializer.INSTANCE, info.stepper);
        }
        BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, booleanSerializer, info.canGoBack);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || info.pageTitle != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, info.pageTitle);
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, booleanSerializer, info.canClose);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || info.quit != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, Quit$$serializer.INSTANCE, info.quit);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || info.richTitle != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, RichTitle$$serializer.INSTANCE, info.richTitle);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || info.richSubtitle != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, RichSubtitleData$$serializer.INSTANCE, info.richSubtitle);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || info.getId() != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, StringSerializer.INSTANCE, info.getId());
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || !Intrinsics.EZpvd(info.getRequired(), Boolean.FALSE)) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, booleanSerializer, info.getRequired());
        }
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 11, stringSerializer, info.getVersion());
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 12, stringSerializer, info.getValue());
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 13, stringSerializer, info.getTitle());
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 14, stringSerializer, info.getSubtitle());
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) || !Intrinsics.EZpvd(info.getPageStack(), Boolean.FALSE)) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 15, booleanSerializer, info.getPageStack());
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) || info.toast != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 16, ToastModel$$serializer.INSTANCE, info.toast);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 17) && info.amplitudeParams == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 17, kSerializerArr[17], info.amplitudeParams);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0076: CONSTRUCTOR 
  (r23v0 kotlinx.serialization.json.JsonArray)
  (wrap:com.okinc.ok_kyc_core.data.remote.networkmodel.Cta:?: TERNARY null = ((wrap:int:0x0002: ARITH (r41v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.ok_kyc_core.data.remote.networkmodel.Cta) : (r24v0 com.okinc.ok_kyc_core.data.remote.networkmodel.Cta))
  (wrap:com.okinc.ok_kyc_core.data.remote.networkmodel.Stepper:?: TERNARY null = ((wrap:int:0x000b: ARITH (r41v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.ok_kyc_core.data.remote.networkmodel.Stepper) : (r25v0 com.okinc.ok_kyc_core.data.remote.networkmodel.Stepper))
  (r26v0 java.lang.Boolean)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0013: ARITH (r41v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r27v0 java.lang.String))
  (r28v0 java.lang.Boolean)
  (wrap:com.okinc.ok_kyc_core.data.remote.networkmodel.Quit:?: TERNARY null = ((wrap:int:0x001b: ARITH (r41v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.ok_kyc_core.data.remote.networkmodel.Quit) : (r29v0 com.okinc.ok_kyc_core.data.remote.networkmodel.Quit))
  (wrap:com.okinc.ok_kyc_core.data.remote.networkmodel.RichTitle:?: TERNARY null = ((wrap:int:0x0023: ARITH (r41v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.ok_kyc_core.data.remote.networkmodel.RichTitle) : (r30v0 com.okinc.ok_kyc_core.data.remote.networkmodel.RichTitle))
  (wrap:com.okinc.ok_kyc_core.data.remote.networkmodel.RichSubtitleData:?: TERNARY null = ((wrap:int:0x002b: ARITH (r41v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.ok_kyc_core.data.remote.networkmodel.RichSubtitleData) : (r31v0 com.okinc.ok_kyc_core.data.remote.networkmodel.RichSubtitleData))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0033: ARITH (r41v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r32v0 java.lang.String))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x003b: ARITH (r41v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0041: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r33v0 java.lang.Boolean))
  (r34v0 java.lang.String)
  (r35v0 java.lang.String)
  (r36v0 java.lang.String)
  (r37v0 java.lang.String)
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0048: ARITH (32768 int) & (r41v0 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x004d: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r38v0 java.lang.Boolean))
  (wrap:com.okinc.ok_kyc_core.data.remote.networkmodel.ToastModel:?: TERNARY null = ((wrap:int:0x0054: ARITH (65536 int) & (r41v0 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.ok_kyc_core.data.remote.networkmodel.ToastModel) : (r39v0 com.okinc.ok_kyc_core.data.remote.networkmodel.ToastModel))
  (wrap:java.util.HashMap:?: TERNARY null = ((wrap:int:0x005e: ARITH (r41v0 int) & (131072 int) A[WRAPPED]) != (0 int)) ? (null java.util.HashMap) : (r40v0 java.util.HashMap))
 A[MD:(kotlinx.serialization.json.JsonArray, com.okinc.ok_kyc_core.data.remote.networkmodel.Cta, com.okinc.ok_kyc_core.data.remote.networkmodel.Stepper, java.lang.Boolean, java.lang.String, java.lang.Boolean, com.okinc.ok_kyc_core.data.remote.networkmodel.Quit, com.okinc.ok_kyc_core.data.remote.networkmodel.RichTitle, com.okinc.ok_kyc_core.data.remote.networkmodel.RichSubtitleData, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, com.okinc.ok_kyc_core.data.remote.networkmodel.ToastModel, java.util.HashMap<java.lang.String, java.lang.String>):void (m)] (LINE:881) call: com.okinc.ok_kyc_core.data.remote.networkmodel.Info.<init>(kotlinx.serialization.json.JsonArray, com.okinc.ok_kyc_core.data.remote.networkmodel.Cta, com.okinc.ok_kyc_core.data.remote.networkmodel.Stepper, java.lang.Boolean, java.lang.String, java.lang.Boolean, com.okinc.ok_kyc_core.data.remote.networkmodel.Quit, com.okinc.ok_kyc_core.data.remote.networkmodel.RichTitle, com.okinc.ok_kyc_core.data.remote.networkmodel.RichSubtitleData, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, com.okinc.ok_kyc_core.data.remote.networkmodel.ToastModel, java.util.HashMap):void type: THIS */
    public /* synthetic */ Info(JsonArray jsonArray, Cta cta, Stepper stepper, Boolean bool, String str, Boolean bool2, Quit quit, RichTitle richTitle, RichSubtitleData richSubtitleData, String str2, Boolean bool3, String str3, String str4, String str5, String str6, Boolean bool4, ToastModel toastModel, HashMap map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(jsonArray, (i & 2) != 0 ? null : cta, (i & 4) != 0 ? null : stepper, bool, (i & 16) != 0 ? null : str, bool2, (i & 64) != 0 ? null : quit, (i & 128) != 0 ? null : richTitle, (i & 256) != 0 ? null : richSubtitleData, (i & 512) != 0 ? null : str2, (i & 1024) != 0 ? Boolean.FALSE : bool3, str3, str4, str5, str6, (32768 & i) != 0 ? Boolean.FALSE : bool4, (65536 & i) != 0 ? null : toastModel, (i & 131072) != 0 ? null : map);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Info(@NotNull JsonArray jsonArray, Cta cta, Stepper stepper, Boolean bool, String str, Boolean bool2, Quit quit, RichTitle richTitle, RichSubtitleData richSubtitleData, String str2, Boolean bool3, String str3, String str4, String str5, String str6, Boolean bool4, ToastModel toastModel, HashMap<String, String> map) {
        super(null);
        Intrinsics.checkNotNullParameter(jsonArray, "");
        this.items = jsonArray;
        this.cta = cta;
        this.stepper = stepper;
        this.canGoBack = bool;
        this.pageTitle = str;
        this.canClose = bool2;
        this.quit = quit;
        this.richTitle = richTitle;
        this.richSubtitle = richSubtitleData;
        this.id = str2;
        this.required = bool3;
        this.version = str3;
        this.value = str4;
        this.title = str5;
        this.subtitle = str6;
        this.pageStack = bool4;
        this.toast = toastModel;
        this.amplitudeParams = map;
    }

    /* JADX DEBUG: Method merged with bridge method: toAppModel()Lcom/okinc/ok_kyc_core/data/remote/networkmodel/PageComponentAppModel; */
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.PageComponent
    public FormAppModel toAppModel() {
        List<UIComponentAppModel> listCopydefault = C43747rvC.copydefault(this.items);
        Cta cta = this.cta;
        CtaAppModel appModel = cta != null ? cta.toAppModel() : null;
        Stepper stepper = this.stepper;
        String str = this.pageTitle;
        Quit quit = this.quit;
        Boolean bool = this.canGoBack;
        Boolean bool2 = this.canClose;
        RichTitle richTitle = this.richTitle;
        RichSubtitleData richSubtitleData = this.richSubtitle;
        return new FormAppModel(listCopydefault, appModel, stepper, (TitleStepper) null, str, quit, (Exit) null, (String) null, bool, bool2, (CTAButtonAppModel) null, (String) null, richTitle, richSubtitleData != null ? C43780rvj.EZpvd(richSubtitleData) : null, (List) null, getId(), getRequired(), getVersion(), getValue(), getTitle(), getSubtitle(), (Boolean) null, (DynamicTitle) null, (CTAButtonAppModel) null, this.amplitudeParams, (CTAButtonAppModel) null, (AlertCardAppModel) null, (Boolean) null, (PageStackType) null, 517996544, (DefaultConstructorMarker) null);
    }
}
