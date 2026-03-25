package com.okinc.ok_kyc_core.data.remote.networkmodel;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
@Serializable
public final class SSLErrorModel implements Parcelable {
    private final ArrayList<String> sdkErrorMsg;
    private final int sdkErrorNumber;
    private final Integer sdkErrorSwitch;
    private final String sdkErrorTarget;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<SSLErrorModel> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, null, new ArrayListSerializer(StringSerializer.INSTANCE), null};

    /* JADX INFO: loaded from: classes23.dex */
    public static final class Creator implements Parcelable.Creator<SSLErrorModel> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SSLErrorModel createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new SSLErrorModel(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt(), parcel.createStringArrayList(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SSLErrorModel[] newArray(int i) {
            return new SSLErrorModel[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public SSLErrorModel() {
        this((Integer) null, 0, (ArrayList) null, (String) null, 15, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.ok_kyc_core.data.remote.networkmodel.SSLErrorModel */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SSLErrorModel copy$default(SSLErrorModel sSLErrorModel, Integer num, int i, ArrayList arrayList, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            num = sSLErrorModel.sdkErrorSwitch;
        }
        if ((i2 & 2) != 0) {
            i = sSLErrorModel.sdkErrorNumber;
        }
        if ((i2 & 4) != 0) {
            arrayList = sSLErrorModel.sdkErrorMsg;
        }
        if ((i2 & 8) != 0) {
            str = sSLErrorModel.sdkErrorTarget;
        }
        return sSLErrorModel.copy(num, i, arrayList, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component1() {
        return this.sdkErrorSwitch;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component2() {
        return this.sdkErrorNumber;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<String> component3() {
        return this.sdkErrorMsg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.sdkErrorTarget;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SSLErrorModel copy(Integer num, int i, ArrayList<String> arrayList, String str) {
        return new SSLErrorModel(num, i, arrayList, str);
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
        if (!(obj instanceof SSLErrorModel)) {
            return false;
        }
        SSLErrorModel sSLErrorModel = (SSLErrorModel) obj;
        return Intrinsics.EZpvd(this.sdkErrorSwitch, sSLErrorModel.sdkErrorSwitch) && this.sdkErrorNumber == sSLErrorModel.sdkErrorNumber && Intrinsics.EZpvd(this.sdkErrorMsg, sSLErrorModel.sdkErrorMsg) && Intrinsics.EZpvd((Object) this.sdkErrorTarget, (Object) sSLErrorModel.sdkErrorTarget);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<String> getSdkErrorMsg() {
        return this.sdkErrorMsg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getSdkErrorNumber() {
        return this.sdkErrorNumber;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getSdkErrorSwitch() {
        return this.sdkErrorSwitch;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSdkErrorTarget() {
        return this.sdkErrorTarget;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        Integer num = this.sdkErrorSwitch;
        int iHashCode = num == null ? 0 : num.hashCode();
        int iHashCode2 = Integer.hashCode(this.sdkErrorNumber);
        ArrayList<String> arrayList = this.sdkErrorMsg;
        int iHashCode3 = arrayList == null ? 0 : arrayList.hashCode();
        String str = this.sdkErrorTarget;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (str != null ? str.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SSLErrorModel(sdkErrorSwitch=" + this.sdkErrorSwitch + ", sdkErrorNumber=" + this.sdkErrorNumber + ", sdkErrorMsg=" + this.sdkErrorMsg + ", sdkErrorTarget=" + this.sdkErrorTarget + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int iIntValue;
        Intrinsics.checkNotNullParameter(parcel, "");
        Integer num = this.sdkErrorSwitch;
        if (num == null) {
            iIntValue = 0;
        } else {
            parcel.writeInt(1);
            iIntValue = num.intValue();
        }
        parcel.writeInt(iIntValue);
        parcel.writeInt(this.sdkErrorNumber);
        parcel.writeStringList(this.sdkErrorMsg);
        parcel.writeString(this.sdkErrorTarget);
    }

    /* JADX INFO: loaded from: classes23.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.ok_kyc_core.data.remote.networkmodel.SSLErrorModel.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SSLErrorModel> serializer() {
            return SSLErrorModel$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ SSLErrorModel(int i, Integer num, int i2, ArrayList arrayList, String str, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.sdkErrorSwitch = null;
        } else {
            this.sdkErrorSwitch = num;
        }
        if ((i & 2) == 0) {
            this.sdkErrorNumber = 3;
        } else {
            this.sdkErrorNumber = i2;
        }
        if ((i & 4) == 0) {
            this.sdkErrorMsg = new ArrayList<>();
        } else {
            this.sdkErrorMsg = arrayList;
        }
        if ((i & 8) == 0) {
            this.sdkErrorTarget = null;
        } else {
            this.sdkErrorTarget = str;
        }
    }

    public static final /* synthetic */ void write$Self$OKCompliance_ok_compliance_impl(SSLErrorModel sSLErrorModel, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || sSLErrorModel.sdkErrorSwitch != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, IntSerializer.INSTANCE, sSLErrorModel.sdkErrorSwitch);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || sSLErrorModel.sdkErrorNumber != 3) {
            compositeEncoder.encodeIntElement(serialDescriptor, 1, sSLErrorModel.sdkErrorNumber);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd(sSLErrorModel.sdkErrorMsg, new ArrayList())) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, kSerializerArr[2], sSLErrorModel.sdkErrorMsg);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) && sSLErrorModel.sdkErrorTarget == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, sSLErrorModel.sdkErrorTarget);
    }

    public SSLErrorModel(Integer num, int i, ArrayList<String> arrayList, String str) {
        this.sdkErrorSwitch = num;
        this.sdkErrorNumber = i;
        this.sdkErrorMsg = arrayList;
        this.sdkErrorTarget = str;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0019: CONSTRUCTOR 
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r2v0 java.lang.Integer))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0006: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (3 int) : (r3v0 int))
  (wrap:java.util.ArrayList:?: TERNARY null = ((wrap:int:0x000b: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.ArrayList:0x0011: CONSTRUCTOR  A[MD:():void (c), WRAPPED] (LINE:18) call: java.util.ArrayList.<init>():void type: CONSTRUCTOR) : (r4v0 java.util.ArrayList))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0014: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r5v0 java.lang.String))
 A[MD:(java.lang.Integer, int, java.util.ArrayList<java.lang.String>, java.lang.String):void (m)] (LINE:12) call: com.okinc.ok_kyc_core.data.remote.networkmodel.SSLErrorModel.<init>(java.lang.Integer, int, java.util.ArrayList, java.lang.String):void type: THIS */
    public /* synthetic */ SSLErrorModel(Integer num, int i, ArrayList arrayList, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : num, (i2 & 2) != 0 ? 3 : i, (i2 & 4) != 0 ? new ArrayList() : arrayList, (i2 & 8) != 0 ? null : str);
    }
}
