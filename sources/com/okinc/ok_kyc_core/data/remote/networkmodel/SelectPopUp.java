package com.okinc.ok_kyc_core.data.remote.networkmodel;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.FloatSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import o.C43780rvj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@SerialName("select-popup")
@Serializable
public final class SelectPopUp extends UIComponent implements Parcelable {
    private Float bottomMargin;
    private final List<SelectPopUpChoiceData> choices;
    private final String id;
    private Boolean isHidden;
    private final Float leftMargin;
    private final Boolean required;
    private final String subtitle;
    private final String title;
    private final String type;
    private String value;
    private final String version;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<SelectPopUp> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, new ArrayListSerializer(SelectPopUpChoiceData$$serializer.INSTANCE), null, null, null, null, null, null, null};

    public static final class Creator implements Parcelable.Creator<SelectPopUp> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SelectPopUp createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(SelectPopUpChoiceData.CREATOR.createFromParcel(parcel));
                }
            }
            return new SelectPopUp(string, string2, string3, arrayList, parcel.readString(), parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()), parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()), parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SelectPopUp[] newArray(int i) {
            return new SelectPopUp[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Float component10() {
        return this.leftMargin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component11() {
        return this.isHidden;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.subtitle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<SelectPopUpChoiceData> component4() {
        return this.choices;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component6() {
        return this.required;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.version;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.value;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Float component9() {
        return this.bottomMargin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SelectPopUp copy(@NotNull String str, String str2, String str3, List<SelectPopUpChoiceData> list, @NotNull String str4, Boolean bool, String str5, String str6, Float f, Float f2, Boolean bool2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str4, "");
        return new SelectPopUp(str, str2, str3, list, str4, bool, str5, str6, f, f2, bool2);
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
        if (!(obj instanceof SelectPopUp)) {
            return false;
        }
        SelectPopUp selectPopUp = (SelectPopUp) obj;
        return Intrinsics.EZpvd((Object) this.type, (Object) selectPopUp.type) && Intrinsics.EZpvd((Object) this.title, (Object) selectPopUp.title) && Intrinsics.EZpvd((Object) this.subtitle, (Object) selectPopUp.subtitle) && Intrinsics.EZpvd(this.choices, selectPopUp.choices) && Intrinsics.EZpvd((Object) this.id, (Object) selectPopUp.id) && Intrinsics.EZpvd(this.required, selectPopUp.required) && Intrinsics.EZpvd((Object) this.version, (Object) selectPopUp.version) && Intrinsics.EZpvd((Object) this.value, (Object) selectPopUp.value) && Intrinsics.EZpvd(this.bottomMargin, selectPopUp.bottomMargin) && Intrinsics.EZpvd(this.leftMargin, selectPopUp.leftMargin) && Intrinsics.EZpvd(this.isHidden, selectPopUp.isHidden);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponent
    public Float getBottomMargin() {
        return this.bottomMargin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<SelectPopUpChoiceData> getChoices() {
        return this.choices;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponent
    public String getId() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponent
    public Float getLeftMargin() {
        return this.leftMargin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponent
    public Boolean getRequired() {
        return this.required;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSubtitle() {
        return this.subtitle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTitle() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getType() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponent
    public String getValue() {
        return this.value;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponent
    public String getVersion() {
        return this.version;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.type.hashCode();
        String str = this.title;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.subtitle;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        List<SelectPopUpChoiceData> list = this.choices;
        int iHashCode4 = list == null ? 0 : list.hashCode();
        int iHashCode5 = this.id.hashCode();
        Boolean bool = this.required;
        int iHashCode6 = bool == null ? 0 : bool.hashCode();
        String str3 = this.version;
        int iHashCode7 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.value;
        int iHashCode8 = str4 == null ? 0 : str4.hashCode();
        Float f = this.bottomMargin;
        int iHashCode9 = f == null ? 0 : f.hashCode();
        Float f2 = this.leftMargin;
        int iHashCode10 = f2 == null ? 0 : f2.hashCode();
        Boolean bool2 = this.isHidden;
        return (((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + (bool2 != null ? bool2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponent
    public Boolean isHidden() {
        return this.isHidden;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setBottomMargin(Float f) {
        this.bottomMargin = f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponent
    public void setHidden(Boolean bool) {
        this.isHidden = bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setValue(String str) {
        this.value = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SelectPopUp(type=" + this.type + ", title=" + this.title + ", subtitle=" + this.subtitle + ", choices=" + this.choices + ", id=" + this.id + ", required=" + this.required + ", version=" + this.version + ", value=" + this.value + ", bottomMargin=" + this.bottomMargin + ", leftMargin=" + this.leftMargin + ", isHidden=" + this.isHidden + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.type);
        parcel.writeString(this.title);
        parcel.writeString(this.subtitle);
        List<SelectPopUpChoiceData> list = this.choices;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<SelectPopUpChoiceData> it = list.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(parcel, i);
            }
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
        Float f = this.bottomMargin;
        if (f == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeFloat(f.floatValue());
        }
        Float f2 = this.leftMargin;
        if (f2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeFloat(f2.floatValue());
        }
        Boolean bool2 = this.isHidden;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool2.booleanValue() ? 1 : 0);
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.ok_kyc_core.data.remote.networkmodel.SelectPopUp.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SelectPopUp> serializer() {
            return SelectPopUp$$serializer.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SelectPopUp(int i, String str, String str2, String str3, List list, String str4, Boolean bool, String str5, String str6, Float f, Float f2, Boolean bool2, SerializationConstructorMarker serializationConstructorMarker) {
        super(i, serializationConstructorMarker);
        if (769 != (i & 769)) {
            PluginExceptionsKt.throwMissingFieldException(i, 769, SelectPopUp$$serializer.INSTANCE.getDescriptor());
        }
        this.type = str;
        if ((i & 2) == 0) {
            this.title = "";
        } else {
            this.title = str2;
        }
        if ((i & 4) == 0) {
            this.subtitle = "";
        } else {
            this.subtitle = str3;
        }
        if ((i & 8) == 0) {
            this.choices = null;
        } else {
            this.choices = list;
        }
        if ((i & 16) == 0) {
            this.id = "";
        } else {
            this.id = str4;
        }
        if ((i & 32) == 0) {
            this.required = Boolean.FALSE;
        } else {
            this.required = bool;
        }
        if ((i & 64) == 0) {
            this.version = "";
        } else {
            this.version = str5;
        }
        if ((i & 128) == 0) {
            this.value = "";
        } else {
            this.value = str6;
        }
        this.bottomMargin = f;
        this.leftMargin = f2;
        if ((i & 1024) == 0) {
            this.isHidden = Boolean.FALSE;
        } else {
            this.isHidden = bool2;
        }
    }

    public static final /* synthetic */ void write$Self$OKCompliance_ok_compliance_impl(SelectPopUp selectPopUp, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        UIComponent.write$Self(selectPopUp, compositeEncoder, serialDescriptor);
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeStringElement(serialDescriptor, 0, selectPopUp.type);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) selectPopUp.title, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, selectPopUp.title);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) selectPopUp.subtitle, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, selectPopUp.subtitle);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || selectPopUp.choices != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, kSerializerArr[3], selectPopUp.choices);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) selectPopUp.getId(), (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, selectPopUp.getId());
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd(selectPopUp.getRequired(), Boolean.FALSE)) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, BooleanSerializer.INSTANCE, selectPopUp.getRequired());
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) selectPopUp.getVersion(), (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, selectPopUp.getVersion());
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) selectPopUp.getValue(), (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, selectPopUp.getValue());
        }
        FloatSerializer floatSerializer = FloatSerializer.INSTANCE;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, floatSerializer, selectPopUp.getBottomMargin());
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, floatSerializer, selectPopUp.getLeftMargin());
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) && Intrinsics.EZpvd(selectPopUp.isHidden(), Boolean.FALSE)) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, BooleanSerializer.INSTANCE, selectPopUp.isHidden());
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0050: CONSTRUCTOR 
  (r16v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r27v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r17v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r27v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r18v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0014: ARITH (r27v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r19v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001d: ARITH (r27v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r20v0 java.lang.String))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0025: ARITH (r27v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x002b: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r21v0 java.lang.Boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002f: ARITH (r27v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r22v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0037: ARITH (r27v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r23v0 java.lang.String))
  (r24v0 java.lang.Float)
  (r25v0 java.lang.Float)
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x003f: ARITH (r27v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0045: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r26v0 java.lang.Boolean))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.util.List<com.okinc.ok_kyc_core.data.remote.networkmodel.SelectPopUpChoiceData>, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.Float, java.lang.Float, java.lang.Boolean):void (m)] (LINE:4839) call: com.okinc.ok_kyc_core.data.remote.networkmodel.SelectPopUp.<init>(java.lang.String, java.lang.String, java.lang.String, java.util.List, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.Float, java.lang.Float, java.lang.Boolean):void type: THIS */
    public /* synthetic */ SelectPopUp(String str, String str2, String str3, List list, String str4, Boolean bool, String str5, String str6, Float f, Float f2, Boolean bool2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? null : list, (i & 16) != 0 ? "" : str4, (i & 32) != 0 ? Boolean.FALSE : bool, (i & 64) != 0 ? "" : str5, (i & 128) != 0 ? "" : str6, f, f2, (i & 1024) != 0 ? Boolean.FALSE : bool2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectPopUp(@NotNull String str, String str2, String str3, List<SelectPopUpChoiceData> list, @NotNull String str4, Boolean bool, String str5, String str6, Float f, Float f2, Boolean bool2) {
        super(null);
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.type = str;
        this.title = str2;
        this.subtitle = str3;
        this.choices = list;
        this.id = str4;
        this.required = bool;
        this.version = str5;
        this.value = str6;
        this.bottomMargin = f;
        this.leftMargin = f2;
        this.isHidden = bool2;
    }

    /* JADX DEBUG: Method merged with bridge method: toAppModel()Lo/ruV; */
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponent
    public SelectPopUpAppModel toAppModel() {
        ArrayList arrayList = new ArrayList();
        List<SelectPopUpChoiceData> list = this.choices;
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(C43780rvj.AEQbTJ((SelectPopUpChoiceData) it.next()));
            }
        }
        return new SelectPopUpAppModel(this.type, this.title, this.subtitle, arrayList, getId(), getRequired(), getVersion(), getValue());
    }
}
