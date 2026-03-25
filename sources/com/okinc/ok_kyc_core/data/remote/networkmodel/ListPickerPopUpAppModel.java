package com.okinc.ok_kyc_core.data.remote.networkmodel;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponentAppModel;
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
public final class ListPickerPopUpAppModel extends PopUpComponentAppModel implements Parcelable {
    private static final KSerializer<Object>[] $childSerializers;
    private final List<ListPickerPopUpChoice> additionalChoices;
    private final List<ListPickerPopUpChoice> choices;
    private final CtaAppModel cta;
    private final String defaultChoice;
    private String id;
    private final List<UIComponentAppModel> items;
    private final List<UIComponentAppModel> itemsTop;
    private final Boolean required;
    private final String type;
    private String value;
    private final String version;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<ListPickerPopUpAppModel> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<ListPickerPopUpAppModel> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ListPickerPopUpAppModel createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList3 = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList3.add(parcel.readParcelable(ListPickerPopUpAppModel.class.getClassLoader()));
            }
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i3 = parcel.readInt();
                arrayList = new ArrayList(i3);
                for (int i4 = 0; i4 != i3; i4++) {
                    arrayList.add(ListPickerPopUpChoice.CREATOR.createFromParcel(parcel));
                }
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int i5 = parcel.readInt();
                arrayList2 = new ArrayList(i5);
                for (int i6 = 0; i6 != i5; i6++) {
                    arrayList2.add(ListPickerPopUpChoice.CREATOR.createFromParcel(parcel));
                }
            }
            int i7 = parcel.readInt();
            ArrayList arrayList4 = new ArrayList(i7);
            for (int i8 = 0; i8 != i7; i8++) {
                arrayList4.add(parcel.readParcelable(ListPickerPopUpAppModel.class.getClassLoader()));
            }
            return new ListPickerPopUpAppModel(string, arrayList3, arrayList, arrayList2, arrayList4, parcel.readString(), parcel.readInt() == 0 ? null : CtaAppModel.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ListPickerPopUpAppModel[] newArray(int i) {
            return new ListPickerPopUpAppModel[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.version;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.value;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<UIComponentAppModel> component2() {
        return this.itemsTop;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<ListPickerPopUpChoice> component3() {
        return this.choices;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<ListPickerPopUpChoice> component4() {
        return this.additionalChoices;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<UIComponentAppModel> component5() {
        return this.items;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.defaultChoice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CtaAppModel component7() {
        return this.cta;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component9() {
        return this.required;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ListPickerPopUpAppModel copy(@NotNull String str, @NotNull List<? extends UIComponentAppModel> list, List<ListPickerPopUpChoice> list2, List<ListPickerPopUpChoice> list3, @NotNull List<? extends UIComponentAppModel> list4, String str2, CtaAppModel ctaAppModel, String str3, Boolean bool, String str4, String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list4, "");
        return new ListPickerPopUpAppModel(str, list, list2, list3, list4, str2, ctaAppModel, str3, bool, str4, str5);
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
        if (!(obj instanceof ListPickerPopUpAppModel)) {
            return false;
        }
        ListPickerPopUpAppModel listPickerPopUpAppModel = (ListPickerPopUpAppModel) obj;
        return Intrinsics.EZpvd((Object) this.type, (Object) listPickerPopUpAppModel.type) && Intrinsics.EZpvd(this.itemsTop, listPickerPopUpAppModel.itemsTop) && Intrinsics.EZpvd(this.choices, listPickerPopUpAppModel.choices) && Intrinsics.EZpvd(this.additionalChoices, listPickerPopUpAppModel.additionalChoices) && Intrinsics.EZpvd(this.items, listPickerPopUpAppModel.items) && Intrinsics.EZpvd((Object) this.defaultChoice, (Object) listPickerPopUpAppModel.defaultChoice) && Intrinsics.EZpvd(this.cta, listPickerPopUpAppModel.cta) && Intrinsics.EZpvd((Object) this.id, (Object) listPickerPopUpAppModel.id) && Intrinsics.EZpvd(this.required, listPickerPopUpAppModel.required) && Intrinsics.EZpvd((Object) this.version, (Object) listPickerPopUpAppModel.version) && Intrinsics.EZpvd((Object) this.value, (Object) listPickerPopUpAppModel.value);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<ListPickerPopUpChoice> getAdditionalChoices() {
        return this.additionalChoices;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<ListPickerPopUpChoice> getChoices() {
        return this.choices;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CtaAppModel getCta() {
        return this.cta;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDefaultChoice() {
        return this.defaultChoice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.PopUpComponentAppModel
    public String getId() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<UIComponentAppModel> getItems() {
        return this.items;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<UIComponentAppModel> getItemsTop() {
        return this.itemsTop;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.PopUpComponentAppModel
    public Boolean getRequired() {
        return this.required;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getType() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.PopUpComponentAppModel
    public String getValue() {
        return this.value;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.PopUpComponentAppModel
    public String getVersion() {
        return this.version;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.type.hashCode();
        int iHashCode2 = this.itemsTop.hashCode();
        List<ListPickerPopUpChoice> list = this.choices;
        int iHashCode3 = list == null ? 0 : list.hashCode();
        List<ListPickerPopUpChoice> list2 = this.additionalChoices;
        int iHashCode4 = list2 == null ? 0 : list2.hashCode();
        int iHashCode5 = this.items.hashCode();
        String str = this.defaultChoice;
        int iHashCode6 = str == null ? 0 : str.hashCode();
        CtaAppModel ctaAppModel = this.cta;
        int iHashCode7 = ctaAppModel == null ? 0 : ctaAppModel.hashCode();
        String str2 = this.id;
        int iHashCode8 = str2 == null ? 0 : str2.hashCode();
        Boolean bool = this.required;
        int iHashCode9 = bool == null ? 0 : bool.hashCode();
        String str3 = this.version;
        int iHashCode10 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.value;
        return (((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + (str4 != null ? str4.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setId(String str) {
        this.id = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.PopUpComponentAppModel
    public void setValue(String str) {
        this.value = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ListPickerPopUpAppModel(type=" + this.type + ", itemsTop=" + this.itemsTop + ", choices=" + this.choices + ", additionalChoices=" + this.additionalChoices + ", items=" + this.items + ", defaultChoice=" + this.defaultChoice + ", cta=" + this.cta + ", id=" + this.id + ", required=" + this.required + ", version=" + this.version + ", value=" + this.value + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.type);
        List<UIComponentAppModel> list = this.itemsTop;
        parcel.writeInt(list.size());
        Iterator<UIComponentAppModel> it = list.iterator();
        while (it.hasNext()) {
            parcel.writeParcelable(it.next(), i);
        }
        List<ListPickerPopUpChoice> list2 = this.choices;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list2.size());
            Iterator<ListPickerPopUpChoice> it2 = list2.iterator();
            while (it2.hasNext()) {
                it2.next().writeToParcel(parcel, i);
            }
        }
        List<ListPickerPopUpChoice> list3 = this.additionalChoices;
        if (list3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list3.size());
            Iterator<ListPickerPopUpChoice> it3 = list3.iterator();
            while (it3.hasNext()) {
                it3.next().writeToParcel(parcel, i);
            }
        }
        List<UIComponentAppModel> list4 = this.items;
        parcel.writeInt(list4.size());
        Iterator<UIComponentAppModel> it4 = list4.iterator();
        while (it4.hasNext()) {
            parcel.writeParcelable(it4.next(), i);
        }
        parcel.writeString(this.defaultChoice);
        CtaAppModel ctaAppModel = this.cta;
        if (ctaAppModel == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            ctaAppModel.writeToParcel(parcel, i);
        }
        parcel.writeString(this.id);
        Boolean bool = this.required;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        parcel.writeString(this.version);
        parcel.writeString(this.value);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.ok_kyc_core.data.remote.networkmodel.ListPickerPopUpAppModel.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ListPickerPopUpAppModel> serializer() {
            return ListPickerPopUpAppModel$$serializer.INSTANCE;
        }
    }

    static {
        UIComponentAppModel.Companion companion = UIComponentAppModel.Companion;
        ListPickerPopUpChoice$$serializer listPickerPopUpChoice$$serializer = ListPickerPopUpChoice$$serializer.INSTANCE;
        $childSerializers = new KSerializer[]{null, new ArrayListSerializer(companion.serializer()), new ArrayListSerializer(listPickerPopUpChoice$$serializer), new ArrayListSerializer(listPickerPopUpChoice$$serializer), new ArrayListSerializer(companion.serializer()), null, null, null, null, null, null};
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ListPickerPopUpAppModel(int i, String str, List list, List list2, List list3, List list4, String str2, CtaAppModel ctaAppModel, String str3, Boolean bool, String str4, String str5, SerializationConstructorMarker serializationConstructorMarker) {
        super(i, serializationConstructorMarker);
        if (18 != (i & 18)) {
            PluginExceptionsKt.throwMissingFieldException(i, 18, ListPickerPopUpAppModel$$serializer.INSTANCE.getDescriptor());
        }
        if ((i & 1) == 0) {
            this.type = "";
        } else {
            this.type = str;
        }
        this.itemsTop = list;
        if ((i & 4) == 0) {
            this.choices = null;
        } else {
            this.choices = list2;
        }
        if ((i & 8) == 0) {
            this.additionalChoices = null;
        } else {
            this.additionalChoices = list3;
        }
        this.items = list4;
        if ((i & 32) == 0) {
            this.defaultChoice = null;
        } else {
            this.defaultChoice = str2;
        }
        if ((i & 64) == 0) {
            this.cta = null;
        } else {
            this.cta = ctaAppModel;
        }
        if ((i & 128) == 0) {
            this.id = "";
        } else {
            this.id = str3;
        }
        if ((i & 256) == 0) {
            this.required = Boolean.FALSE;
        } else {
            this.required = bool;
        }
        if ((i & 512) == 0) {
            this.version = "";
        } else {
            this.version = str4;
        }
        if ((i & 1024) == 0) {
            this.value = "";
        } else {
            this.value = str5;
        }
    }

    public static final /* synthetic */ void write$Self$OKCompliance_ok_compliance_impl(ListPickerPopUpAppModel listPickerPopUpAppModel, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        PopUpComponentAppModel.write$Self(listPickerPopUpAppModel, compositeEncoder, serialDescriptor);
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) listPickerPopUpAppModel.type, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, listPickerPopUpAppModel.type);
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], listPickerPopUpAppModel.itemsTop);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || listPickerPopUpAppModel.choices != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, kSerializerArr[2], listPickerPopUpAppModel.choices);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || listPickerPopUpAppModel.additionalChoices != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, kSerializerArr[3], listPickerPopUpAppModel.additionalChoices);
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 4, kSerializerArr[4], listPickerPopUpAppModel.items);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || listPickerPopUpAppModel.defaultChoice != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, listPickerPopUpAppModel.defaultChoice);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || listPickerPopUpAppModel.cta != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, CtaAppModel$$serializer.INSTANCE, listPickerPopUpAppModel.cta);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) listPickerPopUpAppModel.getId(), (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, listPickerPopUpAppModel.getId());
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd(listPickerPopUpAppModel.getRequired(), Boolean.FALSE)) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, BooleanSerializer.INSTANCE, listPickerPopUpAppModel.getRequired());
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || !Intrinsics.EZpvd((Object) listPickerPopUpAppModel.getVersion(), (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, StringSerializer.INSTANCE, listPickerPopUpAppModel.getVersion());
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) && Intrinsics.EZpvd((Object) listPickerPopUpAppModel.getValue(), (Object) "")) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, StringSerializer.INSTANCE, listPickerPopUpAppModel.getValue());
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0054: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r27v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r16v0 java.lang.String))
  (r17v0 java.util.List)
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x000c: ARITH (r27v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r18v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0015: ARITH (r27v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r19v0 java.util.List))
  (r20v0 java.util.List)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001d: ARITH (r27v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r21v0 java.lang.String))
  (wrap:com.okinc.ok_kyc_core.data.remote.networkmodel.CtaAppModel:?: TERNARY null = ((wrap:int:0x0025: ARITH (r27v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.ok_kyc_core.data.remote.networkmodel.CtaAppModel) : (r22v0 com.okinc.ok_kyc_core.data.remote.networkmodel.CtaAppModel))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002d: ARITH (r27v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r23v0 java.lang.String))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0035: ARITH (r27v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x003b: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r24v0 java.lang.Boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003f: ARITH (r27v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? ("") : (r25v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0047: ARITH (r27v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? ("") : (r26v0 java.lang.String))
 A[MD:(java.lang.String, java.util.List<? extends com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponentAppModel>, java.util.List<com.okinc.ok_kyc_core.data.remote.networkmodel.ListPickerPopUpChoice>, java.util.List<com.okinc.ok_kyc_core.data.remote.networkmodel.ListPickerPopUpChoice>, java.util.List<? extends com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponentAppModel>, java.lang.String, com.okinc.ok_kyc_core.data.remote.networkmodel.CtaAppModel, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String):void (m)] (LINE:4952) call: com.okinc.ok_kyc_core.data.remote.networkmodel.ListPickerPopUpAppModel.<init>(java.lang.String, java.util.List, java.util.List, java.util.List, java.util.List, java.lang.String, com.okinc.ok_kyc_core.data.remote.networkmodel.CtaAppModel, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ ListPickerPopUpAppModel(String str, List list, List list2, List list3, List list4, String str2, CtaAppModel ctaAppModel, String str3, Boolean bool, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, list, (i & 4) != 0 ? null : list2, (i & 8) != 0 ? null : list3, list4, (i & 32) != 0 ? null : str2, (i & 64) != 0 ? null : ctaAppModel, (i & 128) != 0 ? "" : str3, (i & 256) != 0 ? Boolean.FALSE : bool, (i & 512) != 0 ? "" : str4, (i & 1024) != 0 ? "" : str5);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.util.List<? extends com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponentAppModel> */
    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: java.util.List<? extends com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponentAppModel> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ListPickerPopUpAppModel(@NotNull String str, @NotNull List<? extends UIComponentAppModel> list, List<ListPickerPopUpChoice> list2, List<ListPickerPopUpChoice> list3, @NotNull List<? extends UIComponentAppModel> list4, String str2, CtaAppModel ctaAppModel, String str3, Boolean bool, String str4, String str5) {
        super(null);
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list4, "");
        this.type = str;
        this.itemsTop = list;
        this.choices = list2;
        this.additionalChoices = list3;
        this.items = list4;
        this.defaultChoice = str2;
        this.cta = ctaAppModel;
        this.id = str3;
        this.required = bool;
        this.version = str4;
        this.value = str5;
    }
}
