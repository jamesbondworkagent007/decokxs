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
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@SerialName("input-format-text-with-dependency")
@Serializable
public final class InputFormatText extends UIComponent implements Parcelable {
    private Boolean allowLetters;
    private Float bottomMargin;
    private final Dependency dependency;
    private final Boolean enabled;
    private InputFormat format;
    private final String id;
    private Boolean isHidden;
    private final String label;
    private final Float leftMargin;
    private Integer minValidLength;
    private final String placeholder;
    private final Boolean required;
    private final List<Rule> rules;
    private String value;
    private final String version;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<InputFormatText> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, null, new ArrayListSerializer(Rule$$serializer.INSTANCE), null, null, null, null, null, null, null, null, null, null, null, null};

    public static final class Creator implements Parcelable.Creator<InputFormatText> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InputFormatText createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(Rule.CREATOR.createFromParcel(parcel));
                }
            }
            return new InputFormatText(string, string2, arrayList, parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0), parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0), parcel.readInt() == 0 ? null : InputFormat.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Dependency.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0), parcel.readString(), parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()), parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InputFormatText[] newArray(int i) {
            return new InputFormatText[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.label;
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
    public final Float component14() {
        return this.bottomMargin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Float component15() {
        return this.leftMargin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.placeholder;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Rule> component3() {
        return this.rules;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component4() {
        return this.enabled;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component5() {
        return this.isHidden;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InputFormat component6() {
        return this.format;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Dependency component7() {
        return this.dependency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component8() {
        return this.minValidLength;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component9() {
        return this.allowLetters;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InputFormatText copy(String str, @NotNull String str2, List<Rule> list, Boolean bool, Boolean bool2, InputFormat inputFormat, Dependency dependency, Integer num, Boolean bool3, @NotNull String str3, Boolean bool4, String str4, String str5, Float f, Float f2) {
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new InputFormatText(str, str2, list, bool, bool2, inputFormat, dependency, num, bool3, str3, bool4, str4, str5, f, f2);
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
        if (!(obj instanceof InputFormatText)) {
            return false;
        }
        InputFormatText inputFormatText = (InputFormatText) obj;
        return Intrinsics.EZpvd((Object) this.label, (Object) inputFormatText.label) && Intrinsics.EZpvd((Object) this.placeholder, (Object) inputFormatText.placeholder) && Intrinsics.EZpvd(this.rules, inputFormatText.rules) && Intrinsics.EZpvd(this.enabled, inputFormatText.enabled) && Intrinsics.EZpvd(this.isHidden, inputFormatText.isHidden) && Intrinsics.EZpvd(this.format, inputFormatText.format) && Intrinsics.EZpvd(this.dependency, inputFormatText.dependency) && Intrinsics.EZpvd(this.minValidLength, inputFormatText.minValidLength) && Intrinsics.EZpvd(this.allowLetters, inputFormatText.allowLetters) && Intrinsics.EZpvd((Object) this.id, (Object) inputFormatText.id) && Intrinsics.EZpvd(this.required, inputFormatText.required) && Intrinsics.EZpvd((Object) this.version, (Object) inputFormatText.version) && Intrinsics.EZpvd((Object) this.value, (Object) inputFormatText.value) && Intrinsics.EZpvd(this.bottomMargin, inputFormatText.bottomMargin) && Intrinsics.EZpvd(this.leftMargin, inputFormatText.leftMargin);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getAllowLetters() {
        return this.allowLetters;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponent
    public Float getBottomMargin() {
        return this.bottomMargin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Dependency getDependency() {
        return this.dependency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getEnabled() {
        return this.enabled;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InputFormat getFormat() {
        return this.format;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponent
    public String getId() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLabel() {
        return this.label;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponent
    public Float getLeftMargin() {
        return this.leftMargin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getMinValidLength() {
        return this.minValidLength;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPlaceholder() {
        return this.placeholder;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponent
    public Boolean getRequired() {
        return this.required;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Rule> getRules() {
        return this.rules;
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
        String str = this.label;
        int iHashCode = str == null ? 0 : str.hashCode();
        int iHashCode2 = this.placeholder.hashCode();
        List<Rule> list = this.rules;
        int iHashCode3 = list == null ? 0 : list.hashCode();
        Boolean bool = this.enabled;
        int iHashCode4 = bool == null ? 0 : bool.hashCode();
        Boolean bool2 = this.isHidden;
        int iHashCode5 = bool2 == null ? 0 : bool2.hashCode();
        InputFormat inputFormat = this.format;
        int iHashCode6 = inputFormat == null ? 0 : inputFormat.hashCode();
        Dependency dependency = this.dependency;
        int iHashCode7 = dependency == null ? 0 : dependency.hashCode();
        Integer num = this.minValidLength;
        int iHashCode8 = num == null ? 0 : num.hashCode();
        Boolean bool3 = this.allowLetters;
        int iHashCode9 = bool3 == null ? 0 : bool3.hashCode();
        int iHashCode10 = this.id.hashCode();
        Boolean bool4 = this.required;
        int iHashCode11 = bool4 == null ? 0 : bool4.hashCode();
        String str2 = this.version;
        int iHashCode12 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.value;
        int iHashCode13 = str3 == null ? 0 : str3.hashCode();
        Float f = this.bottomMargin;
        int iHashCode14 = f == null ? 0 : f.hashCode();
        Float f2 = this.leftMargin;
        return (((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + (f2 == null ? 0 : f2.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponent
    public Boolean isHidden() {
        return this.isHidden;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAllowLetters(Boolean bool) {
        this.allowLetters = bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setBottomMargin(Float f) {
        this.bottomMargin = f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFormat(InputFormat inputFormat) {
        this.format = inputFormat;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponent
    public void setHidden(Boolean bool) {
        this.isHidden = bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMinValidLength(Integer num) {
        this.minValidLength = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setValue(String str) {
        this.value = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "InputFormatText(label=" + this.label + ", placeholder=" + this.placeholder + ", rules=" + this.rules + ", enabled=" + this.enabled + ", isHidden=" + this.isHidden + ", format=" + this.format + ", dependency=" + this.dependency + ", minValidLength=" + this.minValidLength + ", allowLetters=" + this.allowLetters + ", id=" + this.id + ", required=" + this.required + ", version=" + this.version + ", value=" + this.value + ", bottomMargin=" + this.bottomMargin + ", leftMargin=" + this.leftMargin + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.label);
        parcel.writeString(this.placeholder);
        List<Rule> list = this.rules;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<Rule> it = list.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(parcel, i);
            }
        }
        Boolean bool = this.enabled;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        Boolean bool2 = this.isHidden;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool2.booleanValue() ? 1 : 0);
        }
        InputFormat inputFormat = this.format;
        if (inputFormat == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            inputFormat.writeToParcel(parcel, i);
        }
        Dependency dependency = this.dependency;
        if (dependency == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            dependency.writeToParcel(parcel, i);
        }
        Integer num = this.minValidLength;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        Boolean bool3 = this.allowLetters;
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

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.ok_kyc_core.data.remote.networkmodel.InputFormatText.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<InputFormatText> serializer() {
            return InputFormatText$$serializer.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ InputFormatText(int i, String str, String str2, List list, Boolean bool, Boolean bool2, InputFormat inputFormat, Dependency dependency, Integer num, Boolean bool3, String str3, Boolean bool4, String str4, String str5, Float f, Float f2, SerializationConstructorMarker serializationConstructorMarker) {
        super(i, serializationConstructorMarker);
        if (31238 != (i & 31238)) {
            PluginExceptionsKt.throwMissingFieldException(i, 31238, InputFormatText$$serializer.INSTANCE.getDescriptor());
        }
        this.label = (i & 1) == 0 ? "" : str;
        this.placeholder = str2;
        this.rules = list;
        this.enabled = (i & 8) == 0 ? Boolean.TRUE : bool;
        this.isHidden = (i & 16) == 0 ? Boolean.FALSE : bool2;
        if ((i & 32) == 0) {
            this.format = null;
        } else {
            this.format = inputFormat;
        }
        if ((i & 64) == 0) {
            this.dependency = null;
        } else {
            this.dependency = dependency;
        }
        if ((i & 128) == 0) {
            this.minValidLength = null;
        } else {
            this.minValidLength = num;
        }
        this.allowLetters = (i & 256) == 0 ? Boolean.FALSE : bool3;
        this.id = str3;
        this.required = (i & 1024) == 0 ? Boolean.FALSE : bool4;
        this.version = str4;
        this.value = str5;
        this.bottomMargin = f;
        this.leftMargin = f2;
    }

    public static final /* synthetic */ void write$Self$OKCompliance_ok_compliance_impl(InputFormatText inputFormatText, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        UIComponent.write$Self(inputFormatText, compositeEncoder, serialDescriptor);
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) inputFormatText.label, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, inputFormatText.label);
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 1, inputFormatText.placeholder);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, kSerializerArr[2], inputFormatText.rules);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd(inputFormatText.enabled, Boolean.TRUE)) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, BooleanSerializer.INSTANCE, inputFormatText.enabled);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd(inputFormatText.isHidden(), Boolean.FALSE)) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, BooleanSerializer.INSTANCE, inputFormatText.isHidden());
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || inputFormatText.format != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, InputFormat$$serializer.INSTANCE, inputFormatText.format);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || inputFormatText.dependency != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, Dependency$$serializer.INSTANCE, inputFormatText.dependency);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || inputFormatText.minValidLength != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, IntSerializer.INSTANCE, inputFormatText.minValidLength);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd(inputFormatText.allowLetters, Boolean.FALSE)) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, BooleanSerializer.INSTANCE, inputFormatText.allowLetters);
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 9, inputFormatText.getId());
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || !Intrinsics.EZpvd(inputFormatText.getRequired(), Boolean.FALSE)) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, BooleanSerializer.INSTANCE, inputFormatText.getRequired());
        }
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 11, stringSerializer, inputFormatText.getVersion());
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 12, stringSerializer, inputFormatText.getValue());
        FloatSerializer floatSerializer = FloatSerializer.INSTANCE;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 13, floatSerializer, inputFormatText.getBottomMargin());
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 14, floatSerializer, inputFormatText.getLeftMargin());
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x005d: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r34v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r19v0 java.lang.String))
  (r20v0 java.lang.String)
  (r21v0 java.util.List)
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x000c: ARITH (r34v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0012: SGET  A[WRAPPED] java.lang.Boolean.TRUE java.lang.Boolean) : (r22v0 java.lang.Boolean))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0016: ARITH (r34v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x001c: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r23v0 java.lang.Boolean))
  (wrap:com.okinc.ok_kyc_core.data.remote.networkmodel.InputFormat:?: TERNARY null = ((wrap:int:0x0020: ARITH (r34v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.ok_kyc_core.data.remote.networkmodel.InputFormat) : (r24v0 com.okinc.ok_kyc_core.data.remote.networkmodel.InputFormat))
  (wrap:com.okinc.ok_kyc_core.data.remote.networkmodel.Dependency:?: TERNARY null = ((wrap:int:0x0029: ARITH (r34v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.ok_kyc_core.data.remote.networkmodel.Dependency) : (r25v0 com.okinc.ok_kyc_core.data.remote.networkmodel.Dependency))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0031: ARITH (r34v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r26v0 java.lang.Integer))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0039: ARITH (r34v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x003f: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r27v0 java.lang.Boolean))
  (r28v0 java.lang.String)
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0043: ARITH (r34v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0049: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r29v0 java.lang.Boolean))
  (r30v0 java.lang.String)
  (r31v0 java.lang.String)
  (r32v0 java.lang.Float)
  (r33v0 java.lang.Float)
 A[MD:(java.lang.String, java.lang.String, java.util.List<com.okinc.ok_kyc_core.data.remote.networkmodel.Rule>, java.lang.Boolean, java.lang.Boolean, com.okinc.ok_kyc_core.data.remote.networkmodel.InputFormat, com.okinc.ok_kyc_core.data.remote.networkmodel.Dependency, java.lang.Integer, java.lang.Boolean, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.Float, java.lang.Float):void (m)] (LINE:3602) call: com.okinc.ok_kyc_core.data.remote.networkmodel.InputFormatText.<init>(java.lang.String, java.lang.String, java.util.List, java.lang.Boolean, java.lang.Boolean, com.okinc.ok_kyc_core.data.remote.networkmodel.InputFormat, com.okinc.ok_kyc_core.data.remote.networkmodel.Dependency, java.lang.Integer, java.lang.Boolean, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.Float, java.lang.Float):void type: THIS */
    public /* synthetic */ InputFormatText(String str, String str2, List list, Boolean bool, Boolean bool2, InputFormat inputFormat, Dependency dependency, Integer num, Boolean bool3, String str3, Boolean bool4, String str4, String str5, Float f, Float f2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, str2, list, (i & 8) != 0 ? Boolean.TRUE : bool, (i & 16) != 0 ? Boolean.FALSE : bool2, (i & 32) != 0 ? null : inputFormat, (i & 64) != 0 ? null : dependency, (i & 128) != 0 ? null : num, (i & 256) != 0 ? Boolean.FALSE : bool3, str3, (i & 1024) != 0 ? Boolean.FALSE : bool4, str4, str5, f, f2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InputFormatText(String str, @NotNull String str2, List<Rule> list, Boolean bool, Boolean bool2, InputFormat inputFormat, Dependency dependency, Integer num, Boolean bool3, @NotNull String str3, Boolean bool4, String str4, String str5, Float f, Float f2) {
        super(null);
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.label = str;
        this.placeholder = str2;
        this.rules = list;
        this.enabled = bool;
        this.isHidden = bool2;
        this.format = inputFormat;
        this.dependency = dependency;
        this.minValidLength = num;
        this.allowLetters = bool3;
        this.id = str3;
        this.required = bool4;
        this.version = str4;
        this.value = str5;
        this.bottomMargin = f;
        this.leftMargin = f2;
    }

    /* JADX DEBUG: Method merged with bridge method: toAppModel()Lo/ruV; */
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponent
    public InputFormatTextAppModel toAppModel() {
        return new InputFormatTextAppModel(this.label, this.placeholder, this.rules, this.enabled, isHidden(), this.format, this.dependency, this.minValidLength, this.allowLetters, getId(), getRequired(), getVersion(), getValue(), getBottomMargin(), getLeftMargin());
    }
}
