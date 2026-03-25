package com.okinc.ok_kyc_core.data.remote.networkmodel;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.FloatSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Serializable
public final class InfoFormEntryAppModel extends UIComponentAppModel {
    private final AlertCardAppModel alertCard;
    private Float bottomMargin;
    private final String buttonText;
    private final CallApiModel details;
    private ArrayList<FieldDisplay> fieldValue;
    private String id;
    private Boolean isHidden;
    private final Float leftMargin;
    private final Boolean required;
    private final Rule rule;
    private final FormAppModel template;
    private final String title;
    private String value;
    private final String version;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<InfoFormEntryAppModel> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, new ArrayListSerializer(FieldDisplay$$serializer.INSTANCE), null, null, null, null, null, null, null, null, null};

    public static final class Creator implements Parcelable.Creator<InfoFormEntryAppModel> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InfoFormEntryAppModel createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            CallApiModel callApiModelCreateFromParcel = parcel.readInt() == 0 ? null : CallApiModel.CREATOR.createFromParcel(parcel);
            FormAppModel formAppModelCreateFromParcel = FormAppModel.CREATOR.createFromParcel(parcel);
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(FieldDisplay.CREATOR.createFromParcel(parcel));
            }
            return new InfoFormEntryAppModel(string, string2, callApiModelCreateFromParcel, formAppModelCreateFromParcel, arrayList, parcel.readInt() == 0 ? null : Rule.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AlertCardAppModel.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0), parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()), parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InfoFormEntryAppModel[] newArray(int i) {
            return new InfoFormEntryAppModel[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r15v0, resolved type: com.okinc.ok_kyc_core.data.remote.networkmodel.InfoFormEntryAppModel */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ InfoFormEntryAppModel copy$default(InfoFormEntryAppModel infoFormEntryAppModel, String str, String str2, CallApiModel callApiModel, FormAppModel formAppModel, ArrayList arrayList, Rule rule, AlertCardAppModel alertCardAppModel, String str3, Boolean bool, String str4, String str5, Boolean bool2, Float f, Float f2, int i, Object obj) {
        return infoFormEntryAppModel.copy((i & 1) != 0 ? infoFormEntryAppModel.buttonText : str, (i & 2) != 0 ? infoFormEntryAppModel.title : str2, (i & 4) != 0 ? infoFormEntryAppModel.details : callApiModel, (i & 8) != 0 ? infoFormEntryAppModel.template : formAppModel, (i & 16) != 0 ? infoFormEntryAppModel.fieldValue : arrayList, (i & 32) != 0 ? infoFormEntryAppModel.rule : rule, (i & 64) != 0 ? infoFormEntryAppModel.alertCard : alertCardAppModel, (i & 128) != 0 ? infoFormEntryAppModel.id : str3, (i & 256) != 0 ? infoFormEntryAppModel.required : bool, (i & 512) != 0 ? infoFormEntryAppModel.version : str4, (i & 1024) != 0 ? infoFormEntryAppModel.value : str5, (i & 2048) != 0 ? infoFormEntryAppModel.isHidden : bool2, (i & 4096) != 0 ? infoFormEntryAppModel.bottomMargin : f, (i & 8192) != 0 ? infoFormEntryAppModel.leftMargin : f2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.buttonText;
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
    public final Boolean component12() {
        return this.isHidden;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Float component13() {
        return this.bottomMargin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Float component14() {
        return this.leftMargin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CallApiModel component3() {
        return this.details;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final FormAppModel component4() {
        return this.template;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<FieldDisplay> component5() {
        return this.fieldValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Rule component6() {
        return this.rule;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AlertCardAppModel component7() {
        return this.alertCard;
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
    public final InfoFormEntryAppModel copy(String str, String str2, CallApiModel callApiModel, @NotNull FormAppModel formAppModel, @NotNull ArrayList<FieldDisplay> arrayList, Rule rule, AlertCardAppModel alertCardAppModel, @NotNull String str3, Boolean bool, String str4, String str5, Boolean bool2, Float f, Float f2) {
        Intrinsics.checkNotNullParameter(formAppModel, "");
        Intrinsics.checkNotNullParameter(arrayList, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new InfoFormEntryAppModel(str, str2, callApiModel, formAppModel, arrayList, rule, alertCardAppModel, str3, bool, str4, str5, bool2, f, f2);
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
        if (!(obj instanceof InfoFormEntryAppModel)) {
            return false;
        }
        InfoFormEntryAppModel infoFormEntryAppModel = (InfoFormEntryAppModel) obj;
        return Intrinsics.EZpvd((Object) this.buttonText, (Object) infoFormEntryAppModel.buttonText) && Intrinsics.EZpvd((Object) this.title, (Object) infoFormEntryAppModel.title) && Intrinsics.EZpvd(this.details, infoFormEntryAppModel.details) && Intrinsics.EZpvd(this.template, infoFormEntryAppModel.template) && Intrinsics.EZpvd(this.fieldValue, infoFormEntryAppModel.fieldValue) && Intrinsics.EZpvd(this.rule, infoFormEntryAppModel.rule) && Intrinsics.EZpvd(this.alertCard, infoFormEntryAppModel.alertCard) && Intrinsics.EZpvd((Object) this.id, (Object) infoFormEntryAppModel.id) && Intrinsics.EZpvd(this.required, infoFormEntryAppModel.required) && Intrinsics.EZpvd((Object) this.version, (Object) infoFormEntryAppModel.version) && Intrinsics.EZpvd((Object) this.value, (Object) infoFormEntryAppModel.value) && Intrinsics.EZpvd(this.isHidden, infoFormEntryAppModel.isHidden) && Intrinsics.EZpvd(this.bottomMargin, infoFormEntryAppModel.bottomMargin) && Intrinsics.EZpvd(this.leftMargin, infoFormEntryAppModel.leftMargin);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AlertCardAppModel getAlertCard() {
        return this.alertCard;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponentAppModel
    public Float getBottomMargin() {
        return this.bottomMargin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getButtonText() {
        return this.buttonText;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CallApiModel getDetails() {
        return this.details;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<FieldDisplay> getFieldValue() {
        return this.fieldValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponentAppModel
    public String getId() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponentAppModel
    public Float getLeftMargin() {
        return this.leftMargin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponentAppModel
    public Boolean getRequired() {
        return this.required;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Rule getRule() {
        return this.rule;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final FormAppModel getTemplate() {
        return this.template;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTitle() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponentAppModel
    public String getValue() {
        return this.value;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponentAppModel
    public String getVersion() {
        return this.version;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.buttonText;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.title;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        CallApiModel callApiModel = this.details;
        int iHashCode3 = callApiModel == null ? 0 : callApiModel.hashCode();
        int iHashCode4 = this.template.hashCode();
        int iHashCode5 = this.fieldValue.hashCode();
        Rule rule = this.rule;
        int iHashCode6 = rule == null ? 0 : rule.hashCode();
        AlertCardAppModel alertCardAppModel = this.alertCard;
        int iHashCode7 = alertCardAppModel == null ? 0 : alertCardAppModel.hashCode();
        int iHashCode8 = this.id.hashCode();
        Boolean bool = this.required;
        int iHashCode9 = bool == null ? 0 : bool.hashCode();
        String str3 = this.version;
        int iHashCode10 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.value;
        int iHashCode11 = str4 == null ? 0 : str4.hashCode();
        Boolean bool2 = this.isHidden;
        int iHashCode12 = bool2 == null ? 0 : bool2.hashCode();
        Float f = this.bottomMargin;
        int iHashCode13 = f == null ? 0 : f.hashCode();
        Float f2 = this.leftMargin;
        return (((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + (f2 != null ? f2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponentAppModel
    public Boolean isHidden() {
        return this.isHidden;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponentAppModel
    public void setBottomMargin(Float f) {
        this.bottomMargin = f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFieldValue(@NotNull ArrayList<FieldDisplay> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        this.fieldValue = arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponentAppModel
    public void setHidden(Boolean bool) {
        this.isHidden = bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponentAppModel
    public void setId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.id = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponentAppModel
    public void setValue(String str) {
        this.value = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "InfoFormEntryAppModel(buttonText=" + this.buttonText + ", title=" + this.title + ", details=" + this.details + ", template=" + this.template + ", fieldValue=" + this.fieldValue + ", rule=" + this.rule + ", alertCard=" + this.alertCard + ", id=" + this.id + ", required=" + this.required + ", version=" + this.version + ", value=" + this.value + ", isHidden=" + this.isHidden + ", bottomMargin=" + this.bottomMargin + ", leftMargin=" + this.leftMargin + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.buttonText);
        parcel.writeString(this.title);
        CallApiModel callApiModel = this.details;
        if (callApiModel == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            callApiModel.writeToParcel(parcel, i);
        }
        this.template.writeToParcel(parcel, i);
        ArrayList<FieldDisplay> arrayList = this.fieldValue;
        parcel.writeInt(arrayList.size());
        Iterator<FieldDisplay> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
        Rule rule = this.rule;
        if (rule == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            rule.writeToParcel(parcel, i);
        }
        AlertCardAppModel alertCardAppModel = this.alertCard;
        if (alertCardAppModel == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            alertCardAppModel.writeToParcel(parcel, i);
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
        Boolean bool2 = this.isHidden;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool2.booleanValue() ? 1 : 0);
        }
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
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.ok_kyc_core.data.remote.networkmodel.InfoFormEntryAppModel.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<InfoFormEntryAppModel> serializer() {
            return InfoFormEntryAppModel$$serializer.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ InfoFormEntryAppModel(int i, String str, String str2, CallApiModel callApiModel, FormAppModel formAppModel, ArrayList arrayList, Rule rule, AlertCardAppModel alertCardAppModel, String str3, Boolean bool, String str4, String str5, Boolean bool2, Float f, Float f2, SerializationConstructorMarker serializationConstructorMarker) {
        super(i, serializationConstructorMarker);
        if (13976 != (i & 13976)) {
            PluginExceptionsKt.throwMissingFieldException(i, 13976, InfoFormEntryAppModel$$serializer.INSTANCE.getDescriptor());
        }
        if ((i & 1) == 0) {
            this.buttonText = "";
        } else {
            this.buttonText = str;
        }
        if ((i & 2) == 0) {
            this.title = "";
        } else {
            this.title = str2;
        }
        if ((i & 4) == 0) {
            this.details = null;
        } else {
            this.details = callApiModel;
        }
        this.template = formAppModel;
        this.fieldValue = arrayList;
        if ((i & 32) == 0) {
            this.rule = null;
        } else {
            this.rule = rule;
        }
        if ((i & 64) == 0) {
            this.alertCard = null;
        } else {
            this.alertCard = alertCardAppModel;
        }
        this.id = str3;
        this.required = (i & 256) == 0 ? Boolean.FALSE : bool;
        this.version = str4;
        this.value = str5;
        this.isHidden = (i & 2048) == 0 ? Boolean.FALSE : bool2;
        this.bottomMargin = f;
        this.leftMargin = f2;
    }

    public static final /* synthetic */ void write$Self$OKCompliance_ok_compliance_impl(InfoFormEntryAppModel infoFormEntryAppModel, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        UIComponentAppModel.write$Self(infoFormEntryAppModel, compositeEncoder, serialDescriptor);
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) infoFormEntryAppModel.buttonText, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, infoFormEntryAppModel.buttonText);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) infoFormEntryAppModel.title, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, infoFormEntryAppModel.title);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || infoFormEntryAppModel.details != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, CallApiModel$$serializer.INSTANCE, infoFormEntryAppModel.details);
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 3, FormAppModel$$serializer.INSTANCE, infoFormEntryAppModel.template);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 4, kSerializerArr[4], infoFormEntryAppModel.fieldValue);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || infoFormEntryAppModel.rule != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, Rule$$serializer.INSTANCE, infoFormEntryAppModel.rule);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || infoFormEntryAppModel.alertCard != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, AlertCardAppModel$$serializer.INSTANCE, infoFormEntryAppModel.alertCard);
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 7, infoFormEntryAppModel.getId());
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd(infoFormEntryAppModel.getRequired(), Boolean.FALSE)) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, BooleanSerializer.INSTANCE, infoFormEntryAppModel.getRequired());
        }
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, stringSerializer, infoFormEntryAppModel.getVersion());
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, stringSerializer, infoFormEntryAppModel.getValue());
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || !Intrinsics.EZpvd(infoFormEntryAppModel.isHidden(), Boolean.FALSE)) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 11, BooleanSerializer.INSTANCE, infoFormEntryAppModel.isHidden());
        }
        FloatSerializer floatSerializer = FloatSerializer.INSTANCE;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 12, floatSerializer, infoFormEntryAppModel.getBottomMargin());
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 13, floatSerializer, infoFormEntryAppModel.getLeftMargin());
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0051: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r33v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r19v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r33v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r20v0 java.lang.String))
  (wrap:com.okinc.ok_kyc_core.data.remote.networkmodel.CallApiModel:?: TERNARY null = ((wrap:int:0x0014: ARITH (r33v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.ok_kyc_core.data.remote.networkmodel.CallApiModel) : (r21v0 com.okinc.ok_kyc_core.data.remote.networkmodel.CallApiModel))
  (r22v0 com.okinc.ok_kyc_core.data.remote.networkmodel.FormAppModel)
  (r23v0 java.util.ArrayList)
  (wrap:com.okinc.ok_kyc_core.data.remote.networkmodel.Rule:?: TERNARY null = ((wrap:int:0x001d: ARITH (r33v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.ok_kyc_core.data.remote.networkmodel.Rule) : (r24v0 com.okinc.ok_kyc_core.data.remote.networkmodel.Rule))
  (wrap:com.okinc.ok_kyc_core.data.remote.networkmodel.AlertCardAppModel:?: TERNARY null = ((wrap:int:0x0025: ARITH (r33v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.ok_kyc_core.data.remote.networkmodel.AlertCardAppModel) : (r25v0 com.okinc.ok_kyc_core.data.remote.networkmodel.AlertCardAppModel))
  (r26v0 java.lang.String)
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x002d: ARITH (r33v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0033: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r27v0 java.lang.Boolean))
  (r28v0 java.lang.String)
  (r29v0 java.lang.String)
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0037: ARITH (r33v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x003d: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r30v0 java.lang.Boolean))
  (r31v0 java.lang.Float)
  (r32v0 java.lang.Float)
 A[MD:(java.lang.String, java.lang.String, com.okinc.ok_kyc_core.data.remote.networkmodel.CallApiModel, com.okinc.ok_kyc_core.data.remote.networkmodel.FormAppModel, java.util.ArrayList<com.okinc.ok_kyc_core.data.remote.networkmodel.FieldDisplay>, com.okinc.ok_kyc_core.data.remote.networkmodel.Rule, com.okinc.ok_kyc_core.data.remote.networkmodel.AlertCardAppModel, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.Float, java.lang.Float):void (m)] (LINE:2582) call: com.okinc.ok_kyc_core.data.remote.networkmodel.InfoFormEntryAppModel.<init>(java.lang.String, java.lang.String, com.okinc.ok_kyc_core.data.remote.networkmodel.CallApiModel, com.okinc.ok_kyc_core.data.remote.networkmodel.FormAppModel, java.util.ArrayList, com.okinc.ok_kyc_core.data.remote.networkmodel.Rule, com.okinc.ok_kyc_core.data.remote.networkmodel.AlertCardAppModel, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.Float, java.lang.Float):void type: THIS */
    public /* synthetic */ InfoFormEntryAppModel(String str, String str2, CallApiModel callApiModel, FormAppModel formAppModel, ArrayList arrayList, Rule rule, AlertCardAppModel alertCardAppModel, String str3, Boolean bool, String str4, String str5, Boolean bool2, Float f, Float f2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? null : callApiModel, formAppModel, arrayList, (i & 32) != 0 ? null : rule, (i & 64) != 0 ? null : alertCardAppModel, str3, (i & 256) != 0 ? Boolean.FALSE : bool, str4, str5, (i & 2048) != 0 ? Boolean.FALSE : bool2, f, f2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InfoFormEntryAppModel(String str, String str2, CallApiModel callApiModel, @NotNull FormAppModel formAppModel, @NotNull ArrayList<FieldDisplay> arrayList, Rule rule, AlertCardAppModel alertCardAppModel, @NotNull String str3, Boolean bool, String str4, String str5, Boolean bool2, Float f, Float f2) {
        super(null);
        Intrinsics.checkNotNullParameter(formAppModel, "");
        Intrinsics.checkNotNullParameter(arrayList, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.buttonText = str;
        this.title = str2;
        this.details = callApiModel;
        this.template = formAppModel;
        this.fieldValue = arrayList;
        this.rule = rule;
        this.alertCard = alertCardAppModel;
        this.id = str3;
        this.required = bool;
        this.version = str4;
        this.value = str5;
        this.isHidden = bool2;
        this.bottomMargin = f;
        this.leftMargin = f2;
    }

    /* JADX DEBUG: Method merged with bridge method: clone()Lcom/okinc/ok_kyc_core/data/remote/networkmodel/UIComponentAppModel; */
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponentAppModel
    public InfoFormEntryAppModel clone() {
        return copy$default(this, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 16383, null);
    }
}
