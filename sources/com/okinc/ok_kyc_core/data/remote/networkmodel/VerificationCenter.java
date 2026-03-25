package com.okinc.ok_kyc_core.data.remote.networkmodel;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
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
import kotlinx.serialization.internal.ArrayListSerializer;
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

/* JADX INFO: loaded from: classes10.dex */
@SerialName("verificationCenter")
@Serializable
public final class VerificationCenter extends PageComponent {
    private static final KSerializer<Object>[] $childSerializers;
    private final HashMap<String, String> amplitudeParams;
    private final Boolean canClose;
    private final Boolean canGoBack;
    private final Cta cta;
    private final String faqUrl;
    private final String id;
    private final JsonArray items;
    private final List<ReminderData> notifications;
    private final Boolean pageStack;
    private final String pageTitle;
    private final Boolean required;
    private final CTAButton skipCta;
    private final String subtitle;
    private final String title;
    private final String value;
    private final String version;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<VerificationCenter> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<VerificationCenter> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final VerificationCenter createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            HashMap map;
            Intrinsics.checkNotNullParameter(parcel, "");
            JsonArray jsonArray = (JsonArray) parcel.readValue(VerificationCenter.class.getClassLoader());
            Cta cta = (Cta) parcel.readParcelable(VerificationCenter.class.getClassLoader());
            String string = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(ReminderData.CREATOR.createFromParcel(parcel));
                }
            }
            String string2 = parcel.readString();
            Boolean boolValueOf = parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0);
            Boolean boolValueOf2 = parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0);
            CTAButton cTAButtonCreateFromParcel = parcel.readInt() == 0 ? null : CTAButton.CREATOR.createFromParcel(parcel);
            String string3 = parcel.readString();
            Boolean boolValueOf3 = parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0);
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            if (parcel.readInt() == 0) {
                map = null;
            } else {
                int i3 = parcel.readInt();
                HashMap map2 = new HashMap(i3);
                int i4 = 0;
                while (i4 != i3) {
                    map2.put(parcel.readString(), parcel.readString());
                    i4++;
                    i3 = i3;
                }
                map = map2;
            }
            return new VerificationCenter(jsonArray, cta, string, arrayList, string2, boolValueOf, boolValueOf2, cTAButtonCreateFromParcel, string3, boolValueOf3, string4, string5, string6, string7, map, parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final VerificationCenter[] newArray(int i) {
            return new VerificationCenter[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final JsonArray component1() {
        return this.items;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component10() {
        return this.required;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.version;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.value;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component13() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component14() {
        return this.subtitle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final HashMap<String, String> component15() {
        return this.amplitudeParams;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component16() {
        return this.pageStack;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Cta component2() {
        return this.cta;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.pageTitle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<ReminderData> component4() {
        return this.notifications;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.faqUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component6() {
        return this.canGoBack;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component7() {
        return this.canClose;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CTAButton component8() {
        return this.skipCta;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final VerificationCenter copy(@NotNull JsonArray jsonArray, Cta cta, String str, List<ReminderData> list, String str2, Boolean bool, Boolean bool2, CTAButton cTAButton, String str3, Boolean bool3, String str4, String str5, String str6, String str7, HashMap<String, String> map, Boolean bool4) {
        Intrinsics.checkNotNullParameter(jsonArray, "");
        return new VerificationCenter(jsonArray, cta, str, list, str2, bool, bool2, cTAButton, str3, bool3, str4, str5, str6, str7, map, bool4);
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
        if (!(obj instanceof VerificationCenter)) {
            return false;
        }
        VerificationCenter verificationCenter = (VerificationCenter) obj;
        return Intrinsics.EZpvd(this.items, verificationCenter.items) && Intrinsics.EZpvd(this.cta, verificationCenter.cta) && Intrinsics.EZpvd((Object) this.pageTitle, (Object) verificationCenter.pageTitle) && Intrinsics.EZpvd(this.notifications, verificationCenter.notifications) && Intrinsics.EZpvd((Object) this.faqUrl, (Object) verificationCenter.faqUrl) && Intrinsics.EZpvd(this.canGoBack, verificationCenter.canGoBack) && Intrinsics.EZpvd(this.canClose, verificationCenter.canClose) && Intrinsics.EZpvd(this.skipCta, verificationCenter.skipCta) && Intrinsics.EZpvd((Object) this.id, (Object) verificationCenter.id) && Intrinsics.EZpvd(this.required, verificationCenter.required) && Intrinsics.EZpvd((Object) this.version, (Object) verificationCenter.version) && Intrinsics.EZpvd((Object) this.value, (Object) verificationCenter.value) && Intrinsics.EZpvd((Object) this.title, (Object) verificationCenter.title) && Intrinsics.EZpvd((Object) this.subtitle, (Object) verificationCenter.subtitle) && Intrinsics.EZpvd(this.amplitudeParams, verificationCenter.amplitudeParams) && Intrinsics.EZpvd(this.pageStack, verificationCenter.pageStack);
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
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.PageComponent
    public String getId() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final JsonArray getItems() {
        return this.items;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<ReminderData> getNotifications() {
        return this.notifications;
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
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.PageComponent
    public Boolean getRequired() {
        return this.required;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CTAButton getSkipCta() {
        return this.skipCta;
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
        String str = this.pageTitle;
        int iHashCode3 = str == null ? 0 : str.hashCode();
        List<ReminderData> list = this.notifications;
        int iHashCode4 = list == null ? 0 : list.hashCode();
        String str2 = this.faqUrl;
        int iHashCode5 = str2 == null ? 0 : str2.hashCode();
        Boolean bool = this.canGoBack;
        int iHashCode6 = bool == null ? 0 : bool.hashCode();
        Boolean bool2 = this.canClose;
        int iHashCode7 = bool2 == null ? 0 : bool2.hashCode();
        CTAButton cTAButton = this.skipCta;
        int iHashCode8 = cTAButton == null ? 0 : cTAButton.hashCode();
        String str3 = this.id;
        int iHashCode9 = str3 == null ? 0 : str3.hashCode();
        Boolean bool3 = this.required;
        int iHashCode10 = bool3 == null ? 0 : bool3.hashCode();
        String str4 = this.version;
        int iHashCode11 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.value;
        int iHashCode12 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.title;
        int iHashCode13 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.subtitle;
        int iHashCode14 = str7 == null ? 0 : str7.hashCode();
        HashMap<String, String> map = this.amplitudeParams;
        int iHashCode15 = map == null ? 0 : map.hashCode();
        Boolean bool4 = this.pageStack;
        return (((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + (bool4 == null ? 0 : bool4.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "VerificationCenter(items=" + this.items + ", cta=" + this.cta + ", pageTitle=" + this.pageTitle + ", notifications=" + this.notifications + ", faqUrl=" + this.faqUrl + ", canGoBack=" + this.canGoBack + ", canClose=" + this.canClose + ", skipCta=" + this.skipCta + ", id=" + this.id + ", required=" + this.required + ", version=" + this.version + ", value=" + this.value + ", title=" + this.title + ", subtitle=" + this.subtitle + ", amplitudeParams=" + this.amplitudeParams + ", pageStack=" + this.pageStack + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeValue(this.items);
        parcel.writeParcelable(this.cta, i);
        parcel.writeString(this.pageTitle);
        List<ReminderData> list = this.notifications;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<ReminderData> it = list.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(parcel, i);
            }
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
        CTAButton cTAButton = this.skipCta;
        if (cTAButton == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            cTAButton.writeToParcel(parcel, i);
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
        HashMap<String, String> map = this.amplitudeParams;
        if (map == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(map.size());
            for (Map.Entry<String, String> entry : map.entrySet()) {
                parcel.writeString(entry.getKey());
                parcel.writeString(entry.getValue());
            }
        }
        Boolean bool4 = this.pageStack;
        if (bool4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool4.booleanValue() ? 1 : 0);
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.ok_kyc_core.data.remote.networkmodel.VerificationCenter.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<VerificationCenter> serializer() {
            return VerificationCenter$$serializer.INSTANCE;
        }
    }

    static {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        $childSerializers = new KSerializer[]{null, null, null, new ArrayListSerializer(ReminderData$$serializer.INSTANCE), null, null, null, null, null, null, null, null, null, null, new HashMapSerializer(stringSerializer, BuiltinSerializersKt.getNullable(stringSerializer)), null};
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ VerificationCenter(int i, JsonArray jsonArray, Cta cta, String str, List list, String str2, Boolean bool, Boolean bool2, CTAButton cTAButton, String str3, Boolean bool3, String str4, String str5, String str6, String str7, HashMap map, Boolean bool4, SerializationConstructorMarker serializationConstructorMarker) {
        super(i, serializationConstructorMarker);
        if (48241 != (i & 48241)) {
            PluginExceptionsKt.throwMissingFieldException(i, 48241, VerificationCenter$$serializer.INSTANCE.getDescriptor());
        }
        this.items = jsonArray;
        if ((i & 2) == 0) {
            this.cta = null;
        } else {
            this.cta = cta;
        }
        if ((i & 4) == 0) {
            this.pageTitle = null;
        } else {
            this.pageTitle = str;
        }
        if ((i & 8) == 0) {
            this.notifications = null;
        } else {
            this.notifications = list;
        }
        this.faqUrl = str2;
        this.canGoBack = bool;
        this.canClose = bool2;
        if ((i & 128) == 0) {
            this.skipCta = null;
        } else {
            this.skipCta = cTAButton;
        }
        if ((i & 256) == 0) {
            this.id = null;
        } else {
            this.id = str3;
        }
        this.required = (i & 512) == 0 ? Boolean.FALSE : bool3;
        this.version = str4;
        this.value = str5;
        this.title = str6;
        this.subtitle = str7;
        if ((i & 16384) == 0) {
            this.amplitudeParams = null;
        } else {
            this.amplitudeParams = map;
        }
        this.pageStack = bool4;
    }

    public static final /* synthetic */ void write$Self$OKCompliance_ok_compliance_impl(VerificationCenter verificationCenter, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        PageComponent.write$Self(verificationCenter, compositeEncoder, serialDescriptor);
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeSerializableElement(serialDescriptor, 0, JsonArraySerializer.INSTANCE, verificationCenter.items);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || verificationCenter.cta != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, Cta$$serializer.INSTANCE, verificationCenter.cta);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || verificationCenter.pageTitle != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, verificationCenter.pageTitle);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || verificationCenter.notifications != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, kSerializerArr[3], verificationCenter.notifications);
        }
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, stringSerializer, verificationCenter.faqUrl);
        BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, booleanSerializer, verificationCenter.canGoBack);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, booleanSerializer, verificationCenter.canClose);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || verificationCenter.skipCta != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, CTAButton$$serializer.INSTANCE, verificationCenter.skipCta);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || verificationCenter.getId() != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, stringSerializer, verificationCenter.getId());
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || !Intrinsics.EZpvd(verificationCenter.getRequired(), Boolean.FALSE)) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, booleanSerializer, verificationCenter.getRequired());
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, stringSerializer, verificationCenter.getVersion());
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 11, stringSerializer, verificationCenter.getValue());
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 12, stringSerializer, verificationCenter.getTitle());
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 13, stringSerializer, verificationCenter.getSubtitle());
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || verificationCenter.amplitudeParams != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 14, kSerializerArr[14], verificationCenter.amplitudeParams);
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 15, booleanSerializer, verificationCenter.getPageStack());
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0052: CONSTRUCTOR 
  (r21v0 kotlinx.serialization.json.JsonArray)
  (wrap:com.okinc.ok_kyc_core.data.remote.networkmodel.Cta:?: TERNARY null = ((wrap:int:0x0002: ARITH (r37v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.ok_kyc_core.data.remote.networkmodel.Cta) : (r22v0 com.okinc.ok_kyc_core.data.remote.networkmodel.Cta))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r37v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r23v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0013: ARITH (r37v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r24v0 java.util.List))
  (r25v0 java.lang.String)
  (r26v0 java.lang.Boolean)
  (r27v0 java.lang.Boolean)
  (wrap:com.okinc.ok_kyc_core.data.remote.networkmodel.CTAButton:?: TERNARY null = ((wrap:int:0x001b: ARITH (r37v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.ok_kyc_core.data.remote.networkmodel.CTAButton) : (r28v0 com.okinc.ok_kyc_core.data.remote.networkmodel.CTAButton))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0023: ARITH (r37v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r29v0 java.lang.String))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x002b: ARITH (r37v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0031: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r30v0 java.lang.Boolean))
  (r31v0 java.lang.String)
  (r32v0 java.lang.String)
  (r33v0 java.lang.String)
  (r34v0 java.lang.String)
  (wrap:java.util.HashMap:?: TERNARY null = ((wrap:int:0x0035: ARITH (r37v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? (null java.util.HashMap) : (r35v0 java.util.HashMap))
  (r36v0 java.lang.Boolean)
 A[MD:(kotlinx.serialization.json.JsonArray, com.okinc.ok_kyc_core.data.remote.networkmodel.Cta, java.lang.String, java.util.List<com.okinc.ok_kyc_core.data.remote.networkmodel.ReminderData>, java.lang.String, java.lang.Boolean, java.lang.Boolean, com.okinc.ok_kyc_core.data.remote.networkmodel.CTAButton, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.HashMap<java.lang.String, java.lang.String>, java.lang.Boolean):void (m)] (LINE:486) call: com.okinc.ok_kyc_core.data.remote.networkmodel.VerificationCenter.<init>(kotlinx.serialization.json.JsonArray, com.okinc.ok_kyc_core.data.remote.networkmodel.Cta, java.lang.String, java.util.List, java.lang.String, java.lang.Boolean, java.lang.Boolean, com.okinc.ok_kyc_core.data.remote.networkmodel.CTAButton, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.HashMap, java.lang.Boolean):void type: THIS */
    public /* synthetic */ VerificationCenter(JsonArray jsonArray, Cta cta, String str, List list, String str2, Boolean bool, Boolean bool2, CTAButton cTAButton, String str3, Boolean bool3, String str4, String str5, String str6, String str7, HashMap map, Boolean bool4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(jsonArray, (i & 2) != 0 ? null : cta, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : list, str2, bool, bool2, (i & 128) != 0 ? null : cTAButton, (i & 256) != 0 ? null : str3, (i & 512) != 0 ? Boolean.FALSE : bool3, str4, str5, str6, str7, (i & 16384) != 0 ? null : map, bool4);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VerificationCenter(@NotNull JsonArray jsonArray, Cta cta, String str, List<ReminderData> list, String str2, Boolean bool, Boolean bool2, CTAButton cTAButton, String str3, Boolean bool3, String str4, String str5, String str6, String str7, HashMap<String, String> map, Boolean bool4) {
        super(null);
        Intrinsics.checkNotNullParameter(jsonArray, "");
        this.items = jsonArray;
        this.cta = cta;
        this.pageTitle = str;
        this.notifications = list;
        this.faqUrl = str2;
        this.canGoBack = bool;
        this.canClose = bool2;
        this.skipCta = cTAButton;
        this.id = str3;
        this.required = bool3;
        this.version = str4;
        this.value = str5;
        this.title = str6;
        this.subtitle = str7;
        this.amplitudeParams = map;
        this.pageStack = bool4;
    }

    /* JADX DEBUG: Method merged with bridge method: toAppModel()Lcom/okinc/ok_kyc_core/data/remote/networkmodel/PageComponentAppModel; */
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.PageComponent
    public FormAppModel toAppModel() {
        ArrayList arrayList = new ArrayList();
        List<ReminderData> list = this.notifications;
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(C43780rvj.copydefault((ReminderData) it.next()));
            }
        }
        List<UIComponentAppModel> listCopydefault = C43747rvC.copydefault(this.items);
        Cta cta = this.cta;
        CtaAppModel appModel = cta != null ? cta.toAppModel() : null;
        String str = this.pageTitle;
        Boolean bool = this.canGoBack;
        boolean zBooleanValue = bool != null ? bool.booleanValue() : true;
        Boolean bool2 = this.canClose;
        boolean zBooleanValue2 = bool2 != null ? bool2.booleanValue() : false;
        CTAButton cTAButton = this.skipCta;
        return new FormAppModel(listCopydefault, appModel, (Stepper) null, (TitleStepper) null, str, (Quit) null, (Exit) null, (String) null, Boolean.valueOf(zBooleanValue), Boolean.valueOf(zBooleanValue2), cTAButton != null ? cTAButton.toAppModel() : null, this.faqUrl, (RichTitle) null, (RichSubtitle) null, arrayList, getId(), getRequired(), getVersion(), getValue(), getTitle(), getSubtitle(), getPageStack(), (DynamicTitle) null, (CTAButtonAppModel) null, this.amplitudeParams, (CTAButtonAppModel) null, (AlertCardAppModel) null, (Boolean) null, (PageStackType) null, 515899392, (DefaultConstructorMarker) null);
    }
}
