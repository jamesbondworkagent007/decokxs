package com.okinc.ok_kyc_core.data.remote.networkmodel;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Serializable
public final class ValueAndName implements Parcelable {
    private AlertCard alertCard;
    private String end;
    private String start;
    private Boolean toPresent;
    private final String value;
    private final String valueName;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<ValueAndName> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<ValueAndName> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ValueAndName createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new ValueAndName(string, string2, string3, string4, boolValueOf, parcel.readInt() != 0 ? AlertCard.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ValueAndName[] newArray(int i) {
            return new ValueAndName[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ValueAndName() {
        this((String) null, (String) null, (String) null, (String) null, (Boolean) null, (AlertCard) null, 63, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ ValueAndName copy$default(ValueAndName valueAndName, String str, String str2, String str3, String str4, Boolean bool, AlertCard alertCard, int i, Object obj) {
        if ((i & 1) != 0) {
            str = valueAndName.value;
        }
        if ((i & 2) != 0) {
            str2 = valueAndName.valueName;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            str3 = valueAndName.start;
        }
        String str6 = str3;
        if ((i & 8) != 0) {
            str4 = valueAndName.end;
        }
        String str7 = str4;
        if ((i & 16) != 0) {
            bool = valueAndName.toPresent;
        }
        Boolean bool2 = bool;
        if ((i & 32) != 0) {
            alertCard = valueAndName.alertCard;
        }
        return valueAndName.copy(str, str5, str6, str7, bool2, alertCard);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.value;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.valueName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.start;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.end;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component5() {
        return this.toPresent;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AlertCard component6() {
        return this.alertCard;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ValueAndName copy(String str, String str2, String str3, String str4, Boolean bool, AlertCard alertCard) {
        return new ValueAndName(str, str2, str3, str4, bool, alertCard);
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
        if (!(obj instanceof ValueAndName)) {
            return false;
        }
        ValueAndName valueAndName = (ValueAndName) obj;
        return Intrinsics.EZpvd((Object) this.value, (Object) valueAndName.value) && Intrinsics.EZpvd((Object) this.valueName, (Object) valueAndName.valueName) && Intrinsics.EZpvd((Object) this.start, (Object) valueAndName.start) && Intrinsics.EZpvd((Object) this.end, (Object) valueAndName.end) && Intrinsics.EZpvd(this.toPresent, valueAndName.toPresent) && Intrinsics.EZpvd(this.alertCard, valueAndName.alertCard);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AlertCard getAlertCard() {
        return this.alertCard;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEnd() {
        return this.end;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getStart() {
        return this.start;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getToPresent() {
        return this.toPresent;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getValue() {
        return this.value;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getValueName() {
        return this.valueName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.value;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.valueName;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.start;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.end;
        int iHashCode4 = str4 == null ? 0 : str4.hashCode();
        Boolean bool = this.toPresent;
        int iHashCode5 = bool == null ? 0 : bool.hashCode();
        AlertCard alertCard = this.alertCard;
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (alertCard != null ? alertCard.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAlertCard(AlertCard alertCard) {
        this.alertCard = alertCard;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setEnd(String str) {
        this.end = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setStart(String str) {
        this.start = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setToPresent(Boolean bool) {
        this.toPresent = bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ValueAndName(value=" + this.value + ", valueName=" + this.valueName + ", start=" + this.start + ", end=" + this.end + ", toPresent=" + this.toPresent + ", alertCard=" + this.alertCard + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.value);
        parcel.writeString(this.valueName);
        parcel.writeString(this.start);
        parcel.writeString(this.end);
        Boolean bool = this.toPresent;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        AlertCard alertCard = this.alertCard;
        if (alertCard == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            alertCard.writeToParcel(parcel, i);
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.ok_kyc_core.data.remote.networkmodel.ValueAndName.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ValueAndName> serializer() {
            return ValueAndName$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ValueAndName(int i, String str, String str2, String str3, String str4, Boolean bool, AlertCard alertCard, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.value = "";
        } else {
            this.value = str;
        }
        if ((i & 2) == 0) {
            this.valueName = "";
        } else {
            this.valueName = str2;
        }
        if ((i & 4) == 0) {
            this.start = null;
        } else {
            this.start = str3;
        }
        if ((i & 8) == 0) {
            this.end = null;
        } else {
            this.end = str4;
        }
        if ((i & 16) == 0) {
            this.toPresent = Boolean.FALSE;
        } else {
            this.toPresent = bool;
        }
        if ((i & 32) == 0) {
            this.alertCard = null;
        } else {
            this.alertCard = alertCard;
        }
    }

    public static final /* synthetic */ void write$Self$OKCompliance_ok_compliance_impl(ValueAndName valueAndName, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) valueAndName.value, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, valueAndName.value);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) valueAndName.valueName, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, valueAndName.valueName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || valueAndName.start != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, valueAndName.start);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || valueAndName.end != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, valueAndName.end);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd(valueAndName.toPresent, Boolean.FALSE)) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, BooleanSerializer.INSTANCE, valueAndName.toPresent);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) && valueAndName.alertCard == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, AlertCard$$serializer.INSTANCE, valueAndName.alertCard);
    }

    public ValueAndName(String str, String str2, String str3, String str4, Boolean bool, AlertCard alertCard) {
        this.value = str;
        this.valueName = str2;
        this.start = str3;
        this.end = str4;
        this.toPresent = bool;
        this.alertCard = alertCard;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0032: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r11v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r5v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0009: ARITH (r11v0 int) & (2 int) A[WRAPPED]) == (0 int)) ? (r6v0 java.lang.String) : (""))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000f: ARITH (r11v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r7v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0017: ARITH (r11v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r8v0 java.lang.String))
  (wrap:java.lang.Boolean:0x0024: TERNARY null = ((wrap:int:0x001e: ARITH (r11v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (wrap:java.lang.Boolean:0x0022: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r9v0 java.lang.Boolean))
  (wrap:com.okinc.ok_kyc_core.data.remote.networkmodel.AlertCard:?: TERNARY null = ((wrap:int:0x0025: ARITH (r11v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.ok_kyc_core.data.remote.networkmodel.AlertCard) : (r10v0 com.okinc.ok_kyc_core.data.remote.networkmodel.AlertCard))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, com.okinc.ok_kyc_core.data.remote.networkmodel.AlertCard):void (m)] (LINE:2519) call: com.okinc.ok_kyc_core.data.remote.networkmodel.ValueAndName.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, com.okinc.ok_kyc_core.data.remote.networkmodel.AlertCard):void type: THIS */
    public /* synthetic */ ValueAndName(String str, String str2, String str3, String str4, Boolean bool, AlertCard alertCard, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) == 0 ? str2 : "", (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? Boolean.FALSE : bool, (i & 32) != 0 ? null : alertCard);
    }
}
