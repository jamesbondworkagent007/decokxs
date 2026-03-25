package com.okinc.ok_kyc_core.data.remote.networkmodel;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
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
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonArraySerializer;
import o.C43747rvC;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@SerialName("processing")
@Serializable
public final class Processing extends PageComponent {
    private static final KSerializer<Object>[] $childSerializers;
    private final HashMap<String, String> amplitudeParams;
    private final Boolean canClose;
    private final Cta cta;
    private final String id;
    private final JsonArray items;
    private final Exit onExit;
    private final Onboarding onboarding;
    private final Boolean pageStack;
    private final String pageTitle;
    private final Polling polling;
    private final Long processTimeOut;
    private final Quit quit;
    private final Boolean required;
    private final String subtitle;
    private final String title;
    private final String value;
    private final String version;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<Processing> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<Processing> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Processing createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Boolean boolValueOf2;
            Boolean boolValueOf3;
            HashMap map;
            Intrinsics.checkNotNullParameter(parcel, "");
            JsonArray jsonArray = (JsonArray) parcel.readValue(Processing.class.getClassLoader());
            Cta cta = (Cta) parcel.readParcelable(Processing.class.getClassLoader());
            Quit quitCreateFromParcel = parcel.readInt() == 0 ? null : Quit.CREATOR.createFromParcel(parcel);
            Exit exitCreateFromParcel = parcel.readInt() == 0 ? null : Exit.CREATOR.createFromParcel(parcel);
            Polling pollingCreateFromParcel = parcel.readInt() == 0 ? null : Polling.CREATOR.createFromParcel(parcel);
            Onboarding onboardingCreateFromParcel = parcel.readInt() == 0 ? null : Onboarding.CREATOR.createFromParcel(parcel);
            String string = parcel.readString();
            Long lValueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            int i = 0;
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            String string2 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf2 = null;
            } else {
                boolValueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf3 = null;
            } else {
                boolValueOf3 = Boolean.valueOf(parcel.readInt() != 0);
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
            return new Processing(jsonArray, cta, quitCreateFromParcel, exitCreateFromParcel, pollingCreateFromParcel, onboardingCreateFromParcel, string, lValueOf, boolValueOf, string2, boolValueOf2, string3, string4, string5, string6, boolValueOf3, map);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Processing[] newArray(int i) {
            return new Processing[i];
        }
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
    public final HashMap<String, String> component17() {
        return this.amplitudeParams;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Cta component2() {
        return this.cta;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Quit component3() {
        return this.quit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Exit component4() {
        return this.onExit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Polling component5() {
        return this.polling;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Onboarding component6() {
        return this.onboarding;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.pageTitle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component8() {
        return this.processTimeOut;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component9() {
        return this.canClose;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Processing copy(JsonArray jsonArray, Cta cta, Quit quit, Exit exit, Polling polling, Onboarding onboarding, String str, Long l, Boolean bool, String str2, Boolean bool2, String str3, String str4, String str5, String str6, Boolean bool3, HashMap<String, String> map) {
        return new Processing(jsonArray, cta, quit, exit, polling, onboarding, str, l, bool, str2, bool2, str3, str4, str5, str6, bool3, map);
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
        if (!(obj instanceof Processing)) {
            return false;
        }
        Processing processing = (Processing) obj;
        return Intrinsics.EZpvd(this.items, processing.items) && Intrinsics.EZpvd(this.cta, processing.cta) && Intrinsics.EZpvd(this.quit, processing.quit) && Intrinsics.EZpvd(this.onExit, processing.onExit) && Intrinsics.EZpvd(this.polling, processing.polling) && Intrinsics.EZpvd(this.onboarding, processing.onboarding) && Intrinsics.EZpvd((Object) this.pageTitle, (Object) processing.pageTitle) && Intrinsics.EZpvd(this.processTimeOut, processing.processTimeOut) && Intrinsics.EZpvd(this.canClose, processing.canClose) && Intrinsics.EZpvd((Object) this.id, (Object) processing.id) && Intrinsics.EZpvd(this.required, processing.required) && Intrinsics.EZpvd((Object) this.version, (Object) processing.version) && Intrinsics.EZpvd((Object) this.value, (Object) processing.value) && Intrinsics.EZpvd((Object) this.title, (Object) processing.title) && Intrinsics.EZpvd((Object) this.subtitle, (Object) processing.subtitle) && Intrinsics.EZpvd(this.pageStack, processing.pageStack) && Intrinsics.EZpvd(this.amplitudeParams, processing.amplitudeParams);
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
    public final Exit getOnExit() {
        return this.onExit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Onboarding getOnboarding() {
        return this.onboarding;
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
    public final Polling getPolling() {
        return this.polling;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getProcessTimeOut() {
        return this.processTimeOut;
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
        JsonArray jsonArray = this.items;
        int iHashCode = jsonArray == null ? 0 : jsonArray.hashCode();
        Cta cta = this.cta;
        int iHashCode2 = cta == null ? 0 : cta.hashCode();
        Quit quit = this.quit;
        int iHashCode3 = quit == null ? 0 : quit.hashCode();
        Exit exit = this.onExit;
        int iHashCode4 = exit == null ? 0 : exit.hashCode();
        Polling polling = this.polling;
        int iHashCode5 = polling == null ? 0 : polling.hashCode();
        Onboarding onboarding = this.onboarding;
        int iHashCode6 = onboarding == null ? 0 : onboarding.hashCode();
        String str = this.pageTitle;
        int iHashCode7 = str == null ? 0 : str.hashCode();
        Long l = this.processTimeOut;
        int iHashCode8 = l == null ? 0 : l.hashCode();
        Boolean bool = this.canClose;
        int iHashCode9 = bool == null ? 0 : bool.hashCode();
        String str2 = this.id;
        int iHashCode10 = str2 == null ? 0 : str2.hashCode();
        Boolean bool2 = this.required;
        int iHashCode11 = bool2 == null ? 0 : bool2.hashCode();
        String str3 = this.version;
        int iHashCode12 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.value;
        int iHashCode13 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.title;
        int iHashCode14 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.subtitle;
        int iHashCode15 = str6 == null ? 0 : str6.hashCode();
        Boolean bool3 = this.pageStack;
        int iHashCode16 = bool3 == null ? 0 : bool3.hashCode();
        HashMap<String, String> map = this.amplitudeParams;
        return (((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + (map == null ? 0 : map.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "Processing(items=" + this.items + ", cta=" + this.cta + ", quit=" + this.quit + ", onExit=" + this.onExit + ", polling=" + this.polling + ", onboarding=" + this.onboarding + ", pageTitle=" + this.pageTitle + ", processTimeOut=" + this.processTimeOut + ", canClose=" + this.canClose + ", id=" + this.id + ", required=" + this.required + ", version=" + this.version + ", value=" + this.value + ", title=" + this.title + ", subtitle=" + this.subtitle + ", pageStack=" + this.pageStack + ", amplitudeParams=" + this.amplitudeParams + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeValue(this.items);
        parcel.writeParcelable(this.cta, i);
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
        Polling polling = this.polling;
        if (polling == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            polling.writeToParcel(parcel, i);
        }
        Onboarding onboarding = this.onboarding;
        if (onboarding == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            onboarding.writeToParcel(parcel, i);
        }
        parcel.writeString(this.pageTitle);
        Long l = this.processTimeOut;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        Boolean bool = this.canClose;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        parcel.writeString(this.id);
        Boolean bool2 = this.required;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool2.booleanValue() ? 1 : 0);
        }
        parcel.writeString(this.version);
        parcel.writeString(this.value);
        parcel.writeString(this.title);
        parcel.writeString(this.subtitle);
        Boolean bool3 = this.pageStack;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool3.booleanValue() ? 1 : 0);
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

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.ok_kyc_core.data.remote.networkmodel.Processing.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<Processing> serializer() {
            return Processing$$serializer.INSTANCE;
        }
    }

    static {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        $childSerializers = new KSerializer[]{null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new HashMapSerializer(stringSerializer, BuiltinSerializersKt.getNullable(stringSerializer))};
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Processing(int i, JsonArray jsonArray, Cta cta, Quit quit, Exit exit, Polling polling, Onboarding onboarding, String str, Long l, Boolean bool, String str2, Boolean bool2, String str3, String str4, String str5, String str6, Boolean bool3, HashMap map, SerializationConstructorMarker serializationConstructorMarker) {
        super(i, serializationConstructorMarker);
        if (30721 != (i & 30721)) {
            PluginExceptionsKt.throwMissingFieldException(i, 30721, Processing$$serializer.INSTANCE.getDescriptor());
        }
        this.items = jsonArray;
        if ((i & 2) == 0) {
            this.cta = null;
        } else {
            this.cta = cta;
        }
        if ((i & 4) == 0) {
            this.quit = null;
        } else {
            this.quit = quit;
        }
        if ((i & 8) == 0) {
            this.onExit = null;
        } else {
            this.onExit = exit;
        }
        if ((i & 16) == 0) {
            this.polling = null;
        } else {
            this.polling = polling;
        }
        if ((i & 32) == 0) {
            this.onboarding = null;
        } else {
            this.onboarding = onboarding;
        }
        if ((i & 64) == 0) {
            this.pageTitle = null;
        } else {
            this.pageTitle = str;
        }
        this.processTimeOut = (i & 128) == 0 ? 120000L : l;
        if ((i & 256) == 0) {
            this.canClose = null;
        } else {
            this.canClose = bool;
        }
        if ((i & 512) == 0) {
            this.id = null;
        } else {
            this.id = str2;
        }
        this.required = (i & 1024) == 0 ? Boolean.FALSE : bool2;
        this.version = str3;
        this.value = str4;
        this.title = str5;
        this.subtitle = str6;
        this.pageStack = (32768 & i) == 0 ? Boolean.FALSE : bool3;
        if ((i & 65536) == 0) {
            this.amplitudeParams = null;
        } else {
            this.amplitudeParams = map;
        }
    }

    public static final /* synthetic */ void write$Self$OKCompliance_ok_compliance_impl(Processing processing, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        Long l;
        PageComponent.write$Self(processing, compositeEncoder, serialDescriptor);
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, JsonArraySerializer.INSTANCE, processing.items);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || processing.cta != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, Cta$$serializer.INSTANCE, processing.cta);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || processing.quit != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, Quit$$serializer.INSTANCE, processing.quit);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || processing.onExit != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, Exit$$serializer.INSTANCE, processing.onExit);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || processing.polling != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, Polling$$serializer.INSTANCE, processing.polling);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || processing.onboarding != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, Onboarding$$serializer.INSTANCE, processing.onboarding);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || processing.pageTitle != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, processing.pageTitle);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || (l = processing.processTimeOut) == null || l.longValue() != 120000) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, LongSerializer.INSTANCE, processing.processTimeOut);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || processing.canClose != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, BooleanSerializer.INSTANCE, processing.canClose);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || processing.getId() != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, StringSerializer.INSTANCE, processing.getId());
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || !Intrinsics.EZpvd(processing.getRequired(), Boolean.FALSE)) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, BooleanSerializer.INSTANCE, processing.getRequired());
        }
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 11, stringSerializer, processing.getVersion());
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 12, stringSerializer, processing.getValue());
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 13, stringSerializer, processing.getTitle());
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 14, stringSerializer, processing.getSubtitle());
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) || !Intrinsics.EZpvd(processing.getPageStack(), Boolean.FALSE)) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 15, BooleanSerializer.INSTANCE, processing.getPageStack());
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) && processing.amplitudeParams == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 16, kSerializerArr[16], processing.amplitudeParams);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x007f: CONSTRUCTOR 
  (r22v0 kotlinx.serialization.json.JsonArray)
  (wrap:com.okinc.ok_kyc_core.data.remote.networkmodel.Cta:?: TERNARY null = ((wrap:int:0x0002: ARITH (r39v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.ok_kyc_core.data.remote.networkmodel.Cta) : (r23v0 com.okinc.ok_kyc_core.data.remote.networkmodel.Cta))
  (wrap:com.okinc.ok_kyc_core.data.remote.networkmodel.Quit:?: TERNARY null = ((wrap:int:0x000b: ARITH (r39v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.ok_kyc_core.data.remote.networkmodel.Quit) : (r24v0 com.okinc.ok_kyc_core.data.remote.networkmodel.Quit))
  (wrap:com.okinc.ok_kyc_core.data.remote.networkmodel.Exit:?: TERNARY null = ((wrap:int:0x0013: ARITH (r39v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.ok_kyc_core.data.remote.networkmodel.Exit) : (r25v0 com.okinc.ok_kyc_core.data.remote.networkmodel.Exit))
  (wrap:com.okinc.ok_kyc_core.data.remote.networkmodel.Polling:?: TERNARY null = ((wrap:int:0x001b: ARITH (r39v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.ok_kyc_core.data.remote.networkmodel.Polling) : (r26v0 com.okinc.ok_kyc_core.data.remote.networkmodel.Polling))
  (wrap:com.okinc.ok_kyc_core.data.remote.networkmodel.Onboarding:?: TERNARY null = ((wrap:int:0x0023: ARITH (r39v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.ok_kyc_core.data.remote.networkmodel.Onboarding) : (r27v0 com.okinc.ok_kyc_core.data.remote.networkmodel.Onboarding))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002b: ARITH (r39v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r28v0 java.lang.String))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0033: ARITH (r39v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (120000 long) : (r29v0 java.lang.Long))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0042: ARITH (r39v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r30v0 java.lang.Boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004a: ARITH (r39v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r31v0 java.lang.String))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0052: ARITH (r39v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0058: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r32v0 java.lang.Boolean))
  (r33v0 java.lang.String)
  (r34v0 java.lang.String)
  (r35v0 java.lang.String)
  (r36v0 java.lang.String)
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x005f: ARITH (32768 int) & (r39v0 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0064: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r37v0 java.lang.Boolean))
  (wrap:java.util.HashMap:?: TERNARY null = ((wrap:int:0x006b: ARITH (r39v0 int) & (65536 int) A[WRAPPED]) != (0 int)) ? (null java.util.HashMap) : (r38v0 java.util.HashMap))
 A[MD:(kotlinx.serialization.json.JsonArray, com.okinc.ok_kyc_core.data.remote.networkmodel.Cta, com.okinc.ok_kyc_core.data.remote.networkmodel.Quit, com.okinc.ok_kyc_core.data.remote.networkmodel.Exit, com.okinc.ok_kyc_core.data.remote.networkmodel.Polling, com.okinc.ok_kyc_core.data.remote.networkmodel.Onboarding, java.lang.String, java.lang.Long, java.lang.Boolean, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.util.HashMap<java.lang.String, java.lang.String>):void (m)] (LINE:623) call: com.okinc.ok_kyc_core.data.remote.networkmodel.Processing.<init>(kotlinx.serialization.json.JsonArray, com.okinc.ok_kyc_core.data.remote.networkmodel.Cta, com.okinc.ok_kyc_core.data.remote.networkmodel.Quit, com.okinc.ok_kyc_core.data.remote.networkmodel.Exit, com.okinc.ok_kyc_core.data.remote.networkmodel.Polling, com.okinc.ok_kyc_core.data.remote.networkmodel.Onboarding, java.lang.String, java.lang.Long, java.lang.Boolean, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.util.HashMap):void type: THIS */
    public /* synthetic */ Processing(JsonArray jsonArray, Cta cta, Quit quit, Exit exit, Polling polling, Onboarding onboarding, String str, Long l, Boolean bool, String str2, Boolean bool2, String str3, String str4, String str5, String str6, Boolean bool3, HashMap map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(jsonArray, (i & 2) != 0 ? null : cta, (i & 4) != 0 ? null : quit, (i & 8) != 0 ? null : exit, (i & 16) != 0 ? null : polling, (i & 32) != 0 ? null : onboarding, (i & 64) != 0 ? null : str, (i & 128) != 0 ? 120000L : l, (i & 256) != 0 ? null : bool, (i & 512) != 0 ? null : str2, (i & 1024) != 0 ? Boolean.FALSE : bool2, str3, str4, str5, str6, (32768 & i) != 0 ? Boolean.FALSE : bool3, (i & 65536) != 0 ? null : map);
    }

    public Processing(JsonArray jsonArray, Cta cta, Quit quit, Exit exit, Polling polling, Onboarding onboarding, String str, Long l, Boolean bool, String str2, Boolean bool2, String str3, String str4, String str5, String str6, Boolean bool3, HashMap<String, String> map) {
        super(null);
        this.items = jsonArray;
        this.cta = cta;
        this.quit = quit;
        this.onExit = exit;
        this.polling = polling;
        this.onboarding = onboarding;
        this.pageTitle = str;
        this.processTimeOut = l;
        this.canClose = bool;
        this.id = str2;
        this.required = bool2;
        this.version = str3;
        this.value = str4;
        this.title = str5;
        this.subtitle = str6;
        this.pageStack = bool3;
        this.amplitudeParams = map;
    }

    /* JADX DEBUG: Method merged with bridge method: toAppModel()Lcom/okinc/ok_kyc_core/data/remote/networkmodel/PageComponentAppModel; */
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.PageComponent
    public ProcessingAppModel toAppModel() {
        List arrayList;
        JsonArray jsonArray = this.items;
        if (jsonArray == null || (arrayList = C43747rvC.copydefault(jsonArray)) == null) {
            arrayList = new ArrayList();
        }
        List list = arrayList;
        Cta cta = this.cta;
        return new ProcessingAppModel(list, cta != null ? cta.toAppModel() : null, this.quit, this.onExit, this.polling, this.onboarding, this.pageTitle, this.processTimeOut, this.canClose, getId(), getRequired(), getVersion(), getValue(), getTitle(), getSubtitle(), getPageStack(), this.amplitudeParams, (Boolean) null, 131072, (DefaultConstructorMarker) null);
    }
}
