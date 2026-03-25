package com.okinc.ok_kyc_core_api.eop;

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
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
@Serializable
public final class EopUiModel implements Parcelable {
    private int code;
    private ArrayList<EopResultImageInfo> eopResultList;
    private boolean isSuccess;
    private String message;
    private String mrz;
    private String sessionId;
    private String vendorType;
    private int verifyType;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<EopUiModel> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, new ArrayListSerializer(EopResultImageInfo$$serializer.INSTANCE), null, null, null, null, null, null};

    /* JADX INFO: loaded from: classes23.dex */
    public static final class Creator implements Parcelable.Creator<EopUiModel> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EopUiModel createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            boolean z = parcel.readInt() != 0;
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(EopResultImageInfo.CREATOR.createFromParcel(parcel));
            }
            return new EopUiModel(z, arrayList, parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EopUiModel[] newArray(int i) {
            return new EopUiModel[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public EopUiModel() {
        this(false, (ArrayList) null, (String) null, 0, (String) null, (String) null, 0, (String) null, 255, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component1() {
        return this.isSuccess;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<EopResultImageInfo> component2() {
        return this.eopResultList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.message;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component4() {
        return this.code;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.vendorType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.sessionId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component7() {
        return this.verifyType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.mrz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final EopUiModel copy(boolean z, @NotNull ArrayList<EopResultImageInfo> arrayList, @NotNull String str, int i, @NotNull String str2, @NotNull String str3, int i2, String str4) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new EopUiModel(z, arrayList, str, i, str2, str3, i2, str4);
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
        if (!(obj instanceof EopUiModel)) {
            return false;
        }
        EopUiModel eopUiModel = (EopUiModel) obj;
        return this.isSuccess == eopUiModel.isSuccess && Intrinsics.EZpvd(this.eopResultList, eopUiModel.eopResultList) && Intrinsics.EZpvd((Object) this.message, (Object) eopUiModel.message) && this.code == eopUiModel.code && Intrinsics.EZpvd((Object) this.vendorType, (Object) eopUiModel.vendorType) && Intrinsics.EZpvd((Object) this.sessionId, (Object) eopUiModel.sessionId) && this.verifyType == eopUiModel.verifyType && Intrinsics.EZpvd((Object) this.mrz, (Object) eopUiModel.mrz);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getCode() {
        return this.code;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<EopResultImageInfo> getEopResultList() {
        return this.eopResultList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMessage() {
        return this.message;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMrz() {
        return this.mrz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSessionId() {
        return this.sessionId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getVendorType() {
        return this.vendorType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getVerifyType() {
        return this.verifyType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.isSuccess);
        int iHashCode2 = this.eopResultList.hashCode();
        int iHashCode3 = this.message.hashCode();
        int iHashCode4 = Integer.hashCode(this.code);
        int iHashCode5 = this.vendorType.hashCode();
        int iHashCode6 = this.sessionId.hashCode();
        int iHashCode7 = Integer.hashCode(this.verifyType);
        String str = this.mrz;
        return (((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + (str == null ? 0 : str.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isSuccess() {
        return this.isSuccess;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCode(int i) {
        this.code = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setEopResultList(@NotNull ArrayList<EopResultImageInfo> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        this.eopResultList = arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMessage(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.message = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMrz(String str) {
        this.mrz = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSessionId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.sessionId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSuccess(boolean z) {
        this.isSuccess = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setVendorType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.vendorType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setVerifyType(int i) {
        this.verifyType = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "EopUiModel(isSuccess=" + this.isSuccess + ", eopResultList=" + this.eopResultList + ", message=" + this.message + ", code=" + this.code + ", vendorType=" + this.vendorType + ", sessionId=" + this.sessionId + ", verifyType=" + this.verifyType + ", mrz=" + this.mrz + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeInt(this.isSuccess ? 1 : 0);
        ArrayList<EopResultImageInfo> arrayList = this.eopResultList;
        parcel.writeInt(arrayList.size());
        Iterator<EopResultImageInfo> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
        parcel.writeString(this.message);
        parcel.writeInt(this.code);
        parcel.writeString(this.vendorType);
        parcel.writeString(this.sessionId);
        parcel.writeInt(this.verifyType);
        parcel.writeString(this.mrz);
    }

    /* JADX INFO: loaded from: classes23.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.ok_kyc_core_api.eop.EopUiModel.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<EopUiModel> serializer() {
            return EopUiModel$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ EopUiModel(int i, boolean z, ArrayList arrayList, String str, int i2, String str2, String str3, int i3, String str4, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.isSuccess = false;
        } else {
            this.isSuccess = z;
        }
        if ((i & 2) == 0) {
            this.eopResultList = new ArrayList<>();
        } else {
            this.eopResultList = arrayList;
        }
        if ((i & 4) == 0) {
            this.message = "";
        } else {
            this.message = str;
        }
        if ((i & 8) == 0) {
            this.code = 0;
        } else {
            this.code = i2;
        }
        if ((i & 16) == 0) {
            this.vendorType = "";
        } else {
            this.vendorType = str2;
        }
        if ((i & 32) == 0) {
            this.sessionId = "";
        } else {
            this.sessionId = str3;
        }
        if ((i & 64) == 0) {
            this.verifyType = 1;
        } else {
            this.verifyType = i3;
        }
        if ((i & 128) == 0) {
            this.mrz = "";
        } else {
            this.mrz = str4;
        }
    }

    public static final /* synthetic */ void write$Self$OKCompliance_ok_compliance_api(EopUiModel eopUiModel, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || eopUiModel.isSuccess) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 0, eopUiModel.isSuccess);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd(eopUiModel.eopResultList, new ArrayList())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], eopUiModel.eopResultList);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) eopUiModel.message, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, eopUiModel.message);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || eopUiModel.code != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 3, eopUiModel.code);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) eopUiModel.vendorType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, eopUiModel.vendorType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) eopUiModel.sessionId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, eopUiModel.sessionId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || eopUiModel.verifyType != 1) {
            compositeEncoder.encodeIntElement(serialDescriptor, 6, eopUiModel.verifyType);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) && Intrinsics.EZpvd((Object) eopUiModel.mrz, (Object) "")) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, eopUiModel.mrz);
    }

    public EopUiModel(boolean z, @NotNull ArrayList<EopResultImageInfo> arrayList, @NotNull String str, int i, @NotNull String str2, @NotNull String str3, int i2, String str4) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.isSuccess = z;
        this.eopResultList = arrayList;
        this.message = str;
        this.code = i;
        this.vendorType = str2;
        this.sessionId = str3;
        this.verifyType = i2;
        this.mrz = str4;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x004d: CONSTRUCTOR 
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0002: ARITH (r18v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? false : (r10v0 boolean))
  (wrap:java.util.ArrayList:?: TERNARY null = ((wrap:int:0x000a: ARITH (r18v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0010: CONSTRUCTOR  A[MD:():void (c), WRAPPED] (LINE:13) call: java.util.ArrayList.<init>():void type: CONSTRUCTOR) : (r11v0 java.util.ArrayList))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0015: ARITH (r18v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r12v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x001e: ARITH (r18v0 int) & (8 int) A[WRAPPED]) == (0 int)) ? (r13v0 int) : (0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0024: ARITH (r18v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r14v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002b: ARITH (r18v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r15v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0032: ARITH (r18v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (1 int) : (r16v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003a: ARITH (r18v0 int) & (128 int) A[WRAPPED]) == (0 int)) ? (r17v0 java.lang.String) : (""))
 A[MD:(boolean, java.util.ArrayList<com.okinc.ok_kyc_core_api.eop.EopResultImageInfo>, java.lang.String, int, java.lang.String, java.lang.String, int, java.lang.String):void (m)] (LINE:11) call: com.okinc.ok_kyc_core_api.eop.EopUiModel.<init>(boolean, java.util.ArrayList, java.lang.String, int, java.lang.String, java.lang.String, int, java.lang.String):void type: THIS */
    public /* synthetic */ EopUiModel(boolean z, ArrayList arrayList, String str, int i, String str2, String str3, int i2, String str4, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? false : z, (i3 & 2) != 0 ? new ArrayList() : arrayList, (i3 & 4) != 0 ? "" : str, (i3 & 8) == 0 ? i : 0, (i3 & 16) != 0 ? "" : str2, (i3 & 32) != 0 ? "" : str3, (i3 & 64) != 0 ? 1 : i2, (i3 & 128) == 0 ? str4 : "");
    }
}
