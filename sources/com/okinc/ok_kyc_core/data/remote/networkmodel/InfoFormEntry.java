package com.okinc.ok_kyc_core.data.remote.networkmodel;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
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
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@SerialName("info-form-entry")
@Serializable
public final class InfoFormEntry extends UIComponent {
    private final AlertCard alertCard;
    private Float bottomMargin;
    private final String buttonText;
    private final CallApiModel details;
    private ArrayList<FieldDisplay> fieldValue;
    private final String id;
    private Boolean isHidden;
    private final Float leftMargin;
    private final Boolean required;
    private final Rule rule;
    private final Form template;
    private final String title;
    private String value;
    private final String version;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<InfoFormEntry> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, new ArrayListSerializer(FieldDisplay$$serializer.INSTANCE), null, null, null, null, null, null, null, null, null};

    public static final class Creator implements Parcelable.Creator<InfoFormEntry> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InfoFormEntry createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            CallApiModel callApiModelCreateFromParcel = parcel.readInt() == 0 ? null : CallApiModel.CREATOR.createFromParcel(parcel);
            Form formCreateFromParcel = Form.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(FieldDisplay.CREATOR.createFromParcel(parcel));
                }
            }
            return new InfoFormEntry(string, string2, callApiModelCreateFromParcel, formCreateFromParcel, arrayList, parcel.readInt() == 0 ? null : Rule.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AlertCard.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0), parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()), parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InfoFormEntry[] newArray(int i) {
            return new InfoFormEntry[i];
        }
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
    public final Form component4() {
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
    public final AlertCard component7() {
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
    public final InfoFormEntry copy(String str, String str2, CallApiModel callApiModel, @NotNull Form form, ArrayList<FieldDisplay> arrayList, Rule rule, AlertCard alertCard, @NotNull String str3, Boolean bool, String str4, String str5, Boolean bool2, Float f, Float f2) {
        Intrinsics.checkNotNullParameter(form, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new InfoFormEntry(str, str2, callApiModel, form, arrayList, rule, alertCard, str3, bool, str4, str5, bool2, f, f2);
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
        if (!(obj instanceof InfoFormEntry)) {
            return false;
        }
        InfoFormEntry infoFormEntry = (InfoFormEntry) obj;
        return Intrinsics.EZpvd((Object) this.buttonText, (Object) infoFormEntry.buttonText) && Intrinsics.EZpvd((Object) this.title, (Object) infoFormEntry.title) && Intrinsics.EZpvd(this.details, infoFormEntry.details) && Intrinsics.EZpvd(this.template, infoFormEntry.template) && Intrinsics.EZpvd(this.fieldValue, infoFormEntry.fieldValue) && Intrinsics.EZpvd(this.rule, infoFormEntry.rule) && Intrinsics.EZpvd(this.alertCard, infoFormEntry.alertCard) && Intrinsics.EZpvd((Object) this.id, (Object) infoFormEntry.id) && Intrinsics.EZpvd(this.required, infoFormEntry.required) && Intrinsics.EZpvd((Object) this.version, (Object) infoFormEntry.version) && Intrinsics.EZpvd((Object) this.value, (Object) infoFormEntry.value) && Intrinsics.EZpvd(this.isHidden, infoFormEntry.isHidden) && Intrinsics.EZpvd(this.bottomMargin, infoFormEntry.bottomMargin) && Intrinsics.EZpvd(this.leftMargin, infoFormEntry.leftMargin);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AlertCard getAlertCard() {
        return this.alertCard;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponent
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
    public final Rule getRule() {
        return this.rule;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Form getTemplate() {
        return this.template;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTitle() {
        return this.title;
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
        String str = this.buttonText;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.title;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        CallApiModel callApiModel = this.details;
        int iHashCode3 = callApiModel == null ? 0 : callApiModel.hashCode();
        int iHashCode4 = this.template.hashCode();
        ArrayList<FieldDisplay> arrayList = this.fieldValue;
        int iHashCode5 = arrayList == null ? 0 : arrayList.hashCode();
        Rule rule = this.rule;
        int iHashCode6 = rule == null ? 0 : rule.hashCode();
        AlertCard alertCard = this.alertCard;
        int iHashCode7 = alertCard == null ? 0 : alertCard.hashCode();
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
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponent
    public Boolean isHidden() {
        return this.isHidden;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setBottomMargin(Float f) {
        this.bottomMargin = f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFieldValue(ArrayList<FieldDisplay> arrayList) {
        this.fieldValue = arrayList;
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
        return "InfoFormEntry(buttonText=" + this.buttonText + ", title=" + this.title + ", details=" + this.details + ", template=" + this.template + ", fieldValue=" + this.fieldValue + ", rule=" + this.rule + ", alertCard=" + this.alertCard + ", id=" + this.id + ", required=" + this.required + ", version=" + this.version + ", value=" + this.value + ", isHidden=" + this.isHidden + ", bottomMargin=" + this.bottomMargin + ", leftMargin=" + this.leftMargin + ")";
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
        if (arrayList == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(arrayList.size());
            Iterator<FieldDisplay> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(parcel, i);
            }
        }
        Rule rule = this.rule;
        if (rule == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            rule.writeToParcel(parcel, i);
        }
        AlertCard alertCard = this.alertCard;
        if (alertCard == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            alertCard.writeToParcel(parcel, i);
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

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.ok_kyc_core.data.remote.networkmodel.InfoFormEntry.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<InfoFormEntry> serializer() {
            return InfoFormEntry$$serializer.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ InfoFormEntry(int i, String str, String str2, CallApiModel callApiModel, Form form, ArrayList arrayList, Rule rule, AlertCard alertCard, String str3, Boolean bool, String str4, String str5, Boolean bool2, Float f, Float f2, SerializationConstructorMarker serializationConstructorMarker) {
        super(i, serializationConstructorMarker);
        if (13960 != (i & 13960)) {
            PluginExceptionsKt.throwMissingFieldException(i, 13960, InfoFormEntry$$serializer.INSTANCE.getDescriptor());
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
        this.template = form;
        if ((i & 16) == 0) {
            this.fieldValue = null;
        } else {
            this.fieldValue = arrayList;
        }
        if ((i & 32) == 0) {
            this.rule = null;
        } else {
            this.rule = rule;
        }
        if ((i & 64) == 0) {
            this.alertCard = null;
        } else {
            this.alertCard = alertCard;
        }
        this.id = str3;
        this.required = (i & 256) == 0 ? Boolean.FALSE : bool;
        this.version = str4;
        this.value = str5;
        this.isHidden = (i & 2048) == 0 ? Boolean.FALSE : bool2;
        this.bottomMargin = f;
        this.leftMargin = f2;
    }

    public static final /* synthetic */ void write$Self$OKCompliance_ok_compliance_impl(InfoFormEntry infoFormEntry, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        UIComponent.write$Self(infoFormEntry, compositeEncoder, serialDescriptor);
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) infoFormEntry.buttonText, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, infoFormEntry.buttonText);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) infoFormEntry.title, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, infoFormEntry.title);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || infoFormEntry.details != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, CallApiModel$$serializer.INSTANCE, infoFormEntry.details);
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 3, Form$$serializer.INSTANCE, infoFormEntry.template);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || infoFormEntry.fieldValue != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, kSerializerArr[4], infoFormEntry.fieldValue);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || infoFormEntry.rule != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, Rule$$serializer.INSTANCE, infoFormEntry.rule);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || infoFormEntry.alertCard != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, AlertCard$$serializer.INSTANCE, infoFormEntry.alertCard);
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 7, infoFormEntry.getId());
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd(infoFormEntry.getRequired(), Boolean.FALSE)) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, BooleanSerializer.INSTANCE, infoFormEntry.getRequired());
        }
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, stringSerializer, infoFormEntry.getVersion());
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, stringSerializer, infoFormEntry.getValue());
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || !Intrinsics.EZpvd(infoFormEntry.isHidden(), Boolean.FALSE)) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 11, BooleanSerializer.INSTANCE, infoFormEntry.isHidden());
        }
        FloatSerializer floatSerializer = FloatSerializer.INSTANCE;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 12, floatSerializer, infoFormEntry.getBottomMargin());
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 13, floatSerializer, infoFormEntry.getLeftMargin());
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0057: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r33v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r19v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r33v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r20v0 java.lang.String))
  (wrap:com.okinc.ok_kyc_core.data.remote.networkmodel.CallApiModel:?: TERNARY null = ((wrap:int:0x0014: ARITH (r33v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.ok_kyc_core.data.remote.networkmodel.CallApiModel) : (r21v0 com.okinc.ok_kyc_core.data.remote.networkmodel.CallApiModel))
  (r22v0 com.okinc.ok_kyc_core.data.remote.networkmodel.Form)
  (wrap:java.util.ArrayList:?: TERNARY null = ((wrap:int:0x001d: ARITH (r33v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.util.ArrayList) : (r23v0 java.util.ArrayList))
  (wrap:com.okinc.ok_kyc_core.data.remote.networkmodel.Rule:?: TERNARY null = ((wrap:int:0x0025: ARITH (r33v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.ok_kyc_core.data.remote.networkmodel.Rule) : (r24v0 com.okinc.ok_kyc_core.data.remote.networkmodel.Rule))
  (wrap:com.okinc.ok_kyc_core.data.remote.networkmodel.AlertCard:?: TERNARY null = ((wrap:int:0x002d: ARITH (r33v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.ok_kyc_core.data.remote.networkmodel.AlertCard) : (r25v0 com.okinc.ok_kyc_core.data.remote.networkmodel.AlertCard))
  (r26v0 java.lang.String)
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0035: ARITH (r33v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x003b: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r27v0 java.lang.Boolean))
  (r28v0 java.lang.String)
  (r29v0 java.lang.String)
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x003f: ARITH (r33v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0045: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r30v0 java.lang.Boolean))
  (r31v0 java.lang.Float)
  (r32v0 java.lang.Float)
 A[MD:(java.lang.String, java.lang.String, com.okinc.ok_kyc_core.data.remote.networkmodel.CallApiModel, com.okinc.ok_kyc_core.data.remote.networkmodel.Form, java.util.ArrayList<com.okinc.ok_kyc_core.data.remote.networkmodel.FieldDisplay>, com.okinc.ok_kyc_core.data.remote.networkmodel.Rule, com.okinc.ok_kyc_core.data.remote.networkmodel.AlertCard, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.Float, java.lang.Float):void (m)] (LINE:2535) call: com.okinc.ok_kyc_core.data.remote.networkmodel.InfoFormEntry.<init>(java.lang.String, java.lang.String, com.okinc.ok_kyc_core.data.remote.networkmodel.CallApiModel, com.okinc.ok_kyc_core.data.remote.networkmodel.Form, java.util.ArrayList, com.okinc.ok_kyc_core.data.remote.networkmodel.Rule, com.okinc.ok_kyc_core.data.remote.networkmodel.AlertCard, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.Float, java.lang.Float):void type: THIS */
    public /* synthetic */ InfoFormEntry(String str, String str2, CallApiModel callApiModel, Form form, ArrayList arrayList, Rule rule, AlertCard alertCard, String str3, Boolean bool, String str4, String str5, Boolean bool2, Float f, Float f2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? null : callApiModel, form, (i & 16) != 0 ? null : arrayList, (i & 32) != 0 ? null : rule, (i & 64) != 0 ? null : alertCard, str3, (i & 256) != 0 ? Boolean.FALSE : bool, str4, str5, (i & 2048) != 0 ? Boolean.FALSE : bool2, f, f2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InfoFormEntry(String str, String str2, CallApiModel callApiModel, @NotNull Form form, ArrayList<FieldDisplay> arrayList, Rule rule, AlertCard alertCard, @NotNull String str3, Boolean bool, String str4, String str5, Boolean bool2, Float f, Float f2) {
        super(null);
        Intrinsics.checkNotNullParameter(form, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.buttonText = str;
        this.title = str2;
        this.details = callApiModel;
        this.template = form;
        this.fieldValue = arrayList;
        this.rule = rule;
        this.alertCard = alertCard;
        this.id = str3;
        this.required = bool;
        this.version = str4;
        this.value = str5;
        this.isHidden = bool2;
        this.bottomMargin = f;
        this.leftMargin = f2;
    }

    /* JADX DEBUG: Method merged with bridge method: toAppModel()Lo/ruV; */
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponent
    public InfoFormEntryAppModel toAppModel() {
        String str = this.buttonText;
        String str2 = this.title;
        CallApiModel callApiModel = this.details;
        FormAppModel appModel = this.template.toAppModel();
        ArrayList<FieldDisplay> arrayList = this.fieldValue;
        if (arrayList == null) {
            arrayList = new ArrayList<>();
        }
        ArrayList<FieldDisplay> arrayList2 = arrayList;
        Rule rule = this.rule;
        AlertCard alertCard = this.alertCard;
        return new InfoFormEntryAppModel(str, str2, callApiModel, appModel, arrayList2, rule, alertCard != null ? alertCard.toAppModel() : null, getId(), getRequired(), getVersion(), getValue(), isHidden(), getBottomMargin(), getLeftMargin());
    }
}
