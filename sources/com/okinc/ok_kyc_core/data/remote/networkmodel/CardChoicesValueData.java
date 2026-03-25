package com.okinc.ok_kyc_core.data.remote.networkmodel;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonArraySerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Serializable
public final class CardChoicesValueData implements Parcelable {
    private final JsonArray contentList;
    private final CTAButton cta;
    private final CardChoicesIcon icon;
    private final List<String> searchKey;
    private Boolean selected;
    private final HelperLabelTag tag;
    private final String text;
    private final String tip;
    private final String value;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<CardChoicesValueData> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {new ArrayListSerializer(StringSerializer.INSTANCE), null, null, null, null, null, null, null, null};

    public static final class Creator implements Parcelable.Creator<CardChoicesValueData> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CardChoicesValueData createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Intrinsics.checkNotNullParameter(parcel, "");
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            CardChoicesIcon cardChoicesIconCreateFromParcel = parcel.readInt() == 0 ? null : CardChoicesIcon.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new CardChoicesValueData(arrayListCreateStringArrayList, cardChoicesIconCreateFromParcel, boolValueOf, parcel.readString(), parcel.readString(), parcel.readString(), (JsonArray) parcel.readValue(CardChoicesValueData.class.getClassLoader()), parcel.readInt() == 0 ? null : HelperLabelTag.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? CTAButton.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CardChoicesValueData[] newArray(int i) {
            return new CardChoicesValueData[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component1() {
        return this.searchKey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CardChoicesIcon component2() {
        return this.icon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component3() {
        return this.selected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.value;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.text;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.tip;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final JsonArray component7() {
        return this.contentList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final HelperLabelTag component8() {
        return this.tag;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CTAButton component9() {
        return this.cta;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CardChoicesValueData copy(List<String> list, CardChoicesIcon cardChoicesIcon, Boolean bool, @NotNull String str, String str2, String str3, JsonArray jsonArray, HelperLabelTag helperLabelTag, CTAButton cTAButton) {
        Intrinsics.checkNotNullParameter(str, "");
        return new CardChoicesValueData(list, cardChoicesIcon, bool, str, str2, str3, jsonArray, helperLabelTag, cTAButton);
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
        if (!(obj instanceof CardChoicesValueData)) {
            return false;
        }
        CardChoicesValueData cardChoicesValueData = (CardChoicesValueData) obj;
        return Intrinsics.EZpvd(this.searchKey, cardChoicesValueData.searchKey) && Intrinsics.EZpvd(this.icon, cardChoicesValueData.icon) && Intrinsics.EZpvd(this.selected, cardChoicesValueData.selected) && Intrinsics.EZpvd((Object) this.value, (Object) cardChoicesValueData.value) && Intrinsics.EZpvd((Object) this.text, (Object) cardChoicesValueData.text) && Intrinsics.EZpvd((Object) this.tip, (Object) cardChoicesValueData.tip) && Intrinsics.EZpvd(this.contentList, cardChoicesValueData.contentList) && Intrinsics.EZpvd(this.tag, cardChoicesValueData.tag) && Intrinsics.EZpvd(this.cta, cardChoicesValueData.cta);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final JsonArray getContentList() {
        return this.contentList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CTAButton getCta() {
        return this.cta;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CardChoicesIcon getIcon() {
        return this.icon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getSearchKey() {
        return this.searchKey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getSelected() {
        return this.selected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final HelperLabelTag getTag() {
        return this.tag;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getText() {
        return this.text;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTip() {
        return this.tip;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getValue() {
        return this.value;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        List<String> list = this.searchKey;
        int iHashCode = list == null ? 0 : list.hashCode();
        CardChoicesIcon cardChoicesIcon = this.icon;
        int iHashCode2 = cardChoicesIcon == null ? 0 : cardChoicesIcon.hashCode();
        Boolean bool = this.selected;
        int iHashCode3 = bool == null ? 0 : bool.hashCode();
        int iHashCode4 = this.value.hashCode();
        String str = this.text;
        int iHashCode5 = str == null ? 0 : str.hashCode();
        String str2 = this.tip;
        int iHashCode6 = str2 == null ? 0 : str2.hashCode();
        JsonArray jsonArray = this.contentList;
        int iHashCode7 = jsonArray == null ? 0 : jsonArray.hashCode();
        HelperLabelTag helperLabelTag = this.tag;
        int iHashCode8 = helperLabelTag == null ? 0 : helperLabelTag.hashCode();
        CTAButton cTAButton = this.cta;
        return (((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + (cTAButton != null ? cTAButton.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSelected(Boolean bool) {
        this.selected = bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "CardChoicesValueData(searchKey=" + this.searchKey + ", icon=" + this.icon + ", selected=" + this.selected + ", value=" + this.value + ", text=" + this.text + ", tip=" + this.tip + ", contentList=" + this.contentList + ", tag=" + this.tag + ", cta=" + this.cta + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeStringList(this.searchKey);
        CardChoicesIcon cardChoicesIcon = this.icon;
        if (cardChoicesIcon == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            cardChoicesIcon.writeToParcel(parcel, i);
        }
        Boolean bool = this.selected;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        parcel.writeString(this.value);
        parcel.writeString(this.text);
        parcel.writeString(this.tip);
        parcel.writeValue(this.contentList);
        HelperLabelTag helperLabelTag = this.tag;
        if (helperLabelTag == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            helperLabelTag.writeToParcel(parcel, i);
        }
        CTAButton cTAButton = this.cta;
        if (cTAButton == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            cTAButton.writeToParcel(parcel, i);
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.ok_kyc_core.data.remote.networkmodel.CardChoicesValueData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<CardChoicesValueData> serializer() {
            return CardChoicesValueData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ CardChoicesValueData(int i, List list, CardChoicesIcon cardChoicesIcon, Boolean bool, String str, String str2, String str3, JsonArray jsonArray, HelperLabelTag helperLabelTag, CTAButton cTAButton, SerializationConstructorMarker serializationConstructorMarker) {
        if (8 != (i & 8)) {
            PluginExceptionsKt.throwMissingFieldException(i, 8, CardChoicesValueData$$serializer.INSTANCE.getDescriptor());
        }
        if ((i & 1) == 0) {
            this.searchKey = null;
        } else {
            this.searchKey = list;
        }
        if ((i & 2) == 0) {
            this.icon = null;
        } else {
            this.icon = cardChoicesIcon;
        }
        if ((i & 4) == 0) {
            this.selected = Boolean.FALSE;
        } else {
            this.selected = bool;
        }
        this.value = str;
        if ((i & 16) == 0) {
            this.text = "";
        } else {
            this.text = str2;
        }
        if ((i & 32) == 0) {
            this.tip = "";
        } else {
            this.tip = str3;
        }
        if ((i & 64) == 0) {
            this.contentList = null;
        } else {
            this.contentList = jsonArray;
        }
        if ((i & 128) == 0) {
            this.tag = null;
        } else {
            this.tag = helperLabelTag;
        }
        if ((i & 256) == 0) {
            this.cta = null;
        } else {
            this.cta = cTAButton;
        }
    }

    public static final /* synthetic */ void write$Self$OKCompliance_ok_compliance_impl(CardChoicesValueData cardChoicesValueData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || cardChoicesValueData.searchKey != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, kSerializerArr[0], cardChoicesValueData.searchKey);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || cardChoicesValueData.icon != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, CardChoicesIcon$$serializer.INSTANCE, cardChoicesValueData.icon);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd(cardChoicesValueData.selected, Boolean.FALSE)) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, BooleanSerializer.INSTANCE, cardChoicesValueData.selected);
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 3, cardChoicesValueData.value);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) cardChoicesValueData.text, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, cardChoicesValueData.text);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) cardChoicesValueData.tip, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, cardChoicesValueData.tip);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || cardChoicesValueData.contentList != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, JsonArraySerializer.INSTANCE, cardChoicesValueData.contentList);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || cardChoicesValueData.tag != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, HelperLabelTag$$serializer.INSTANCE, cardChoicesValueData.tag);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) && cardChoicesValueData.cta == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, CTAButton$$serializer.INSTANCE, cardChoicesValueData.cta);
    }

    public CardChoicesValueData(List<String> list, CardChoicesIcon cardChoicesIcon, Boolean bool, @NotNull String str, String str2, String str3, JsonArray jsonArray, HelperLabelTag helperLabelTag, CTAButton cTAButton) {
        Intrinsics.checkNotNullParameter(str, "");
        this.searchKey = list;
        this.icon = cardChoicesIcon;
        this.selected = bool;
        this.value = str;
        this.text = str2;
        this.tip = str3;
        this.contentList = jsonArray;
        this.tag = helperLabelTag;
        this.cta = cTAButton;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0048: CONSTRUCTOR 
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0002: ARITH (r23v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r14v0 java.util.List))
  (wrap:com.okinc.ok_kyc_core.data.remote.networkmodel.CardChoicesIcon:?: TERNARY null = ((wrap:int:0x000a: ARITH (r23v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.ok_kyc_core.data.remote.networkmodel.CardChoicesIcon) : (r15v0 com.okinc.ok_kyc_core.data.remote.networkmodel.CardChoicesIcon))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0011: ARITH (r23v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0017: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r16v0 java.lang.Boolean))
  (r17v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001b: ARITH (r23v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r18v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0025: ARITH (r23v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r19v0 java.lang.String))
  (wrap:kotlinx.serialization.json.JsonArray:?: TERNARY null = ((wrap:int:0x002d: ARITH (r23v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null kotlinx.serialization.json.JsonArray) : (r20v0 kotlinx.serialization.json.JsonArray))
  (wrap:com.okinc.ok_kyc_core.data.remote.networkmodel.HelperLabelTag:?: TERNARY null = ((wrap:int:0x0035: ARITH (r23v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.ok_kyc_core.data.remote.networkmodel.HelperLabelTag) : (r21v0 com.okinc.ok_kyc_core.data.remote.networkmodel.HelperLabelTag))
  (wrap:com.okinc.ok_kyc_core.data.remote.networkmodel.CTAButton:?: TERNARY null = ((wrap:int:0x003d: ARITH (r23v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.ok_kyc_core.data.remote.networkmodel.CTAButton) : (r22v0 com.okinc.ok_kyc_core.data.remote.networkmodel.CTAButton))
 A[MD:(java.util.List<java.lang.String>, com.okinc.ok_kyc_core.data.remote.networkmodel.CardChoicesIcon, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String, kotlinx.serialization.json.JsonArray, com.okinc.ok_kyc_core.data.remote.networkmodel.HelperLabelTag, com.okinc.ok_kyc_core.data.remote.networkmodel.CTAButton):void (m)] (LINE:3151) call: com.okinc.ok_kyc_core.data.remote.networkmodel.CardChoicesValueData.<init>(java.util.List, com.okinc.ok_kyc_core.data.remote.networkmodel.CardChoicesIcon, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String, kotlinx.serialization.json.JsonArray, com.okinc.ok_kyc_core.data.remote.networkmodel.HelperLabelTag, com.okinc.ok_kyc_core.data.remote.networkmodel.CTAButton):void type: THIS */
    public /* synthetic */ CardChoicesValueData(List list, CardChoicesIcon cardChoicesIcon, Boolean bool, String str, String str2, String str3, JsonArray jsonArray, HelperLabelTag helperLabelTag, CTAButton cTAButton, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : cardChoicesIcon, (i & 4) != 0 ? Boolean.FALSE : bool, str, (i & 16) != 0 ? "" : str2, (i & 32) != 0 ? "" : str3, (i & 64) != 0 ? null : jsonArray, (i & 128) != 0 ? null : helperLabelTag, (i & 256) != 0 ? null : cTAButton);
    }
}
