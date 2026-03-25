package com.okinc.ok_kyc_core.data.remote.networkmodel;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
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
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Serializable
public final class CardChoicesValue implements Parcelable {
    private final List<UIComponentAppModel> contentList;
    private final CTAButtonAppModel cta;
    private final CardChoicesIcon icon;
    private final List<String> searchKey;
    private Boolean selected;
    private final HelperLabelTag tag;
    private final String text;
    private final String tip;
    private final String value;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<CardChoicesValue> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {new ArrayListSerializer(StringSerializer.INSTANCE), null, null, null, null, null, new ArrayListSerializer(UIComponentAppModel.Companion.serializer()), null, null};

    public static final class Creator implements Parcelable.Creator<CardChoicesValue> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CardChoicesValue createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "");
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            CardChoicesIcon cardChoicesIconCreateFromParcel = parcel.readInt() == 0 ? null : CardChoicesIcon.CREATOR.createFromParcel(parcel);
            Boolean boolValueOf = parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0);
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList2.add(parcel.readParcelable(CardChoicesValue.class.getClassLoader()));
                }
                arrayList = arrayList2;
            }
            return new CardChoicesValue(arrayListCreateStringArrayList, cardChoicesIconCreateFromParcel, boolValueOf, string, string2, string3, arrayList, parcel.readInt() == 0 ? null : HelperLabelTag.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? CTAButtonAppModel.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CardChoicesValue[] newArray(int i) {
            return new CardChoicesValue[i];
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
    public final List<UIComponentAppModel> component7() {
        return this.contentList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final HelperLabelTag component8() {
        return this.tag;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CTAButtonAppModel component9() {
        return this.cta;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CardChoicesValue copy(List<String> list, CardChoicesIcon cardChoicesIcon, Boolean bool, @NotNull String str, String str2, String str3, List<? extends UIComponentAppModel> list2, HelperLabelTag helperLabelTag, CTAButtonAppModel cTAButtonAppModel) {
        Intrinsics.checkNotNullParameter(str, "");
        return new CardChoicesValue(list, cardChoicesIcon, bool, str, str2, str3, list2, helperLabelTag, cTAButtonAppModel);
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
        if (!(obj instanceof CardChoicesValue)) {
            return false;
        }
        CardChoicesValue cardChoicesValue = (CardChoicesValue) obj;
        return Intrinsics.EZpvd(this.searchKey, cardChoicesValue.searchKey) && Intrinsics.EZpvd(this.icon, cardChoicesValue.icon) && Intrinsics.EZpvd(this.selected, cardChoicesValue.selected) && Intrinsics.EZpvd((Object) this.value, (Object) cardChoicesValue.value) && Intrinsics.EZpvd((Object) this.text, (Object) cardChoicesValue.text) && Intrinsics.EZpvd((Object) this.tip, (Object) cardChoicesValue.tip) && Intrinsics.EZpvd(this.contentList, cardChoicesValue.contentList) && Intrinsics.EZpvd(this.tag, cardChoicesValue.tag) && Intrinsics.EZpvd(this.cta, cardChoicesValue.cta);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<UIComponentAppModel> getContentList() {
        return this.contentList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CTAButtonAppModel getCta() {
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
        List<UIComponentAppModel> list2 = this.contentList;
        int iHashCode7 = list2 == null ? 0 : list2.hashCode();
        HelperLabelTag helperLabelTag = this.tag;
        int iHashCode8 = helperLabelTag == null ? 0 : helperLabelTag.hashCode();
        CTAButtonAppModel cTAButtonAppModel = this.cta;
        return (((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + (cTAButtonAppModel != null ? cTAButtonAppModel.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSelected(Boolean bool) {
        this.selected = bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "CardChoicesValue(searchKey=" + this.searchKey + ", icon=" + this.icon + ", selected=" + this.selected + ", value=" + this.value + ", text=" + this.text + ", tip=" + this.tip + ", contentList=" + this.contentList + ", tag=" + this.tag + ", cta=" + this.cta + ")";
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
        List<UIComponentAppModel> list = this.contentList;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<UIComponentAppModel> it = list.iterator();
            while (it.hasNext()) {
                parcel.writeParcelable(it.next(), i);
            }
        }
        HelperLabelTag helperLabelTag = this.tag;
        if (helperLabelTag == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            helperLabelTag.writeToParcel(parcel, i);
        }
        CTAButtonAppModel cTAButtonAppModel = this.cta;
        if (cTAButtonAppModel == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            cTAButtonAppModel.writeToParcel(parcel, i);
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.ok_kyc_core.data.remote.networkmodel.CardChoicesValue.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<CardChoicesValue> serializer() {
            return CardChoicesValue$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ CardChoicesValue(int i, List list, CardChoicesIcon cardChoicesIcon, Boolean bool, String str, String str2, String str3, List list2, HelperLabelTag helperLabelTag, CTAButtonAppModel cTAButtonAppModel, SerializationConstructorMarker serializationConstructorMarker) {
        if (8 != (i & 8)) {
            PluginExceptionsKt.throwMissingFieldException(i, 8, CardChoicesValue$$serializer.INSTANCE.getDescriptor());
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
            this.contentList = list2;
        }
        if ((i & 128) == 0) {
            this.tag = null;
        } else {
            this.tag = helperLabelTag;
        }
        if ((i & 256) == 0) {
            this.cta = null;
        } else {
            this.cta = cTAButtonAppModel;
        }
    }

    public static final /* synthetic */ void write$Self$OKCompliance_ok_compliance_impl(CardChoicesValue cardChoicesValue, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || cardChoicesValue.searchKey != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, kSerializerArr[0], cardChoicesValue.searchKey);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || cardChoicesValue.icon != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, CardChoicesIcon$$serializer.INSTANCE, cardChoicesValue.icon);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd(cardChoicesValue.selected, Boolean.FALSE)) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, BooleanSerializer.INSTANCE, cardChoicesValue.selected);
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 3, cardChoicesValue.value);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) cardChoicesValue.text, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, cardChoicesValue.text);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) cardChoicesValue.tip, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, cardChoicesValue.tip);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || cardChoicesValue.contentList != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, kSerializerArr[6], cardChoicesValue.contentList);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || cardChoicesValue.tag != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, HelperLabelTag$$serializer.INSTANCE, cardChoicesValue.tag);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) && cardChoicesValue.cta == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, CTAButtonAppModel$$serializer.INSTANCE, cardChoicesValue.cta);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r8v0, resolved type: java.util.List<? extends com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponentAppModel> */
    /* JADX WARN: Multi-variable type inference failed */
    public CardChoicesValue(List<String> list, CardChoicesIcon cardChoicesIcon, Boolean bool, @NotNull String str, String str2, String str3, List<? extends UIComponentAppModel> list2, HelperLabelTag helperLabelTag, CTAButtonAppModel cTAButtonAppModel) {
        Intrinsics.checkNotNullParameter(str, "");
        this.searchKey = list;
        this.icon = cardChoicesIcon;
        this.selected = bool;
        this.value = str;
        this.text = str2;
        this.tip = str3;
        this.contentList = list2;
        this.tag = helperLabelTag;
        this.cta = cTAButtonAppModel;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0048: CONSTRUCTOR 
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0002: ARITH (r23v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r14v0 java.util.List))
  (wrap:com.okinc.ok_kyc_core.data.remote.networkmodel.CardChoicesIcon:?: TERNARY null = ((wrap:int:0x000a: ARITH (r23v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.ok_kyc_core.data.remote.networkmodel.CardChoicesIcon) : (r15v0 com.okinc.ok_kyc_core.data.remote.networkmodel.CardChoicesIcon))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0011: ARITH (r23v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0017: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r16v0 java.lang.Boolean))
  (r17v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001b: ARITH (r23v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r18v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0025: ARITH (r23v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r19v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x002d: ARITH (r23v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r20v0 java.util.List))
  (wrap:com.okinc.ok_kyc_core.data.remote.networkmodel.HelperLabelTag:?: TERNARY null = ((wrap:int:0x0035: ARITH (r23v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.ok_kyc_core.data.remote.networkmodel.HelperLabelTag) : (r21v0 com.okinc.ok_kyc_core.data.remote.networkmodel.HelperLabelTag))
  (wrap:com.okinc.ok_kyc_core.data.remote.networkmodel.CTAButtonAppModel:?: TERNARY null = ((wrap:int:0x003d: ARITH (r23v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.ok_kyc_core.data.remote.networkmodel.CTAButtonAppModel) : (r22v0 com.okinc.ok_kyc_core.data.remote.networkmodel.CTAButtonAppModel))
 A[MD:(java.util.List<java.lang.String>, com.okinc.ok_kyc_core.data.remote.networkmodel.CardChoicesIcon, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String, java.util.List<? extends com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponentAppModel>, com.okinc.ok_kyc_core.data.remote.networkmodel.HelperLabelTag, com.okinc.ok_kyc_core.data.remote.networkmodel.CTAButtonAppModel):void (m)] (LINE:3166) call: com.okinc.ok_kyc_core.data.remote.networkmodel.CardChoicesValue.<init>(java.util.List, com.okinc.ok_kyc_core.data.remote.networkmodel.CardChoicesIcon, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String, java.util.List, com.okinc.ok_kyc_core.data.remote.networkmodel.HelperLabelTag, com.okinc.ok_kyc_core.data.remote.networkmodel.CTAButtonAppModel):void type: THIS */
    public /* synthetic */ CardChoicesValue(List list, CardChoicesIcon cardChoicesIcon, Boolean bool, String str, String str2, String str3, List list2, HelperLabelTag helperLabelTag, CTAButtonAppModel cTAButtonAppModel, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : cardChoicesIcon, (i & 4) != 0 ? Boolean.FALSE : bool, str, (i & 16) != 0 ? "" : str2, (i & 32) != 0 ? "" : str3, (i & 64) != 0 ? null : list2, (i & 128) != 0 ? null : helperLabelTag, (i & 256) != 0 ? null : cTAButtonAppModel);
    }
}
