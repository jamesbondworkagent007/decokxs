package com.okinc.business.invest_biz.data.bean;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Serializable
public final class InvestPositionDetailExtraFieldData implements Parcelable {
    private final String fieldName;
    private final List<String> fieldValue;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<InvestPositionDetailExtraFieldData> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, new ArrayListSerializer(StringSerializer.INSTANCE)};

    public static final class Creator implements Parcelable.Creator<InvestPositionDetailExtraFieldData> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InvestPositionDetailExtraFieldData createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new InvestPositionDetailExtraFieldData(parcel.readString(), parcel.createStringArrayList());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InvestPositionDetailExtraFieldData[] newArray(int i) {
            return new InvestPositionDetailExtraFieldData[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public InvestPositionDetailExtraFieldData() {
        this((String) null, (List) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.invest_biz.data.bean.InvestPositionDetailExtraFieldData */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ InvestPositionDetailExtraFieldData copy$default(InvestPositionDetailExtraFieldData investPositionDetailExtraFieldData, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = investPositionDetailExtraFieldData.fieldName;
        }
        if ((i & 2) != 0) {
            list = investPositionDetailExtraFieldData.fieldValue;
        }
        return investPositionDetailExtraFieldData.copy(str, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.fieldName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component2() {
        return this.fieldValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestPositionDetailExtraFieldData copy(@NotNull String str, List<String> list) {
        Intrinsics.checkNotNullParameter(str, "");
        return new InvestPositionDetailExtraFieldData(str, list);
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
        if (!(obj instanceof InvestPositionDetailExtraFieldData)) {
            return false;
        }
        InvestPositionDetailExtraFieldData investPositionDetailExtraFieldData = (InvestPositionDetailExtraFieldData) obj;
        return Intrinsics.EZpvd((Object) this.fieldName, (Object) investPositionDetailExtraFieldData.fieldName) && Intrinsics.EZpvd(this.fieldValue, investPositionDetailExtraFieldData.fieldValue);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFieldName() {
        return this.fieldName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getFieldValue() {
        return this.fieldValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.fieldName.hashCode();
        List<String> list = this.fieldValue;
        return (iHashCode * 31) + (list == null ? 0 : list.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "InvestPositionDetailExtraFieldData(fieldName=" + this.fieldName + ", fieldValue=" + this.fieldValue + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.fieldName);
        parcel.writeStringList(this.fieldValue);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.invest_biz.data.bean.InvestPositionDetailExtraFieldData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<InvestPositionDetailExtraFieldData> serializer() {
            return InvestPositionDetailExtraFieldData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ InvestPositionDetailExtraFieldData(int i, String str, List list, SerializationConstructorMarker serializationConstructorMarker) {
        this.fieldName = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.fieldValue = null;
        } else {
            this.fieldValue = list;
        }
    }

    public static final /* synthetic */ void write$Self$OKDeFi_invest_biz(InvestPositionDetailExtraFieldData investPositionDetailExtraFieldData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) investPositionDetailExtraFieldData.fieldName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, investPositionDetailExtraFieldData.fieldName);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && investPositionDetailExtraFieldData.fieldValue == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, kSerializerArr[1], investPositionDetailExtraFieldData.fieldValue);
    }

    public InvestPositionDetailExtraFieldData(@NotNull String str, List<String> list) {
        Intrinsics.checkNotNullParameter(str, "");
        this.fieldName = str;
        this.fieldValue = list;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r1v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0006: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r2v0 java.util.List))
 A[MD:(java.lang.String, java.util.List<java.lang.String>):void (m)] (LINE:235) call: com.okinc.business.invest_biz.data.bean.InvestPositionDetailExtraFieldData.<init>(java.lang.String, java.util.List):void type: THIS */
    public /* synthetic */ InvestPositionDetailExtraFieldData(String str, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : list);
    }
}
