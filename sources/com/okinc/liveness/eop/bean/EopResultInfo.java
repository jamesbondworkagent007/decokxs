package com.okinc.liveness.eop.bean;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Serializable
public final class EopResultInfo implements Parcelable {
    private int errorCode;
    private boolean isSuccess;
    private String localImgPath;
    private String ossImgPath;
    private String resultMsg;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<EopResultInfo> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<EopResultInfo> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EopResultInfo createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new EopResultInfo(parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EopResultInfo[] newArray(int i) {
            return new EopResultInfo[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public EopResultInfo() {
        this(false, (String) null, (String) null, 0, (String) null, 31, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ EopResultInfo copy$default(EopResultInfo eopResultInfo, boolean z, String str, String str2, int i, String str3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = eopResultInfo.isSuccess;
        }
        if ((i2 & 2) != 0) {
            str = eopResultInfo.localImgPath;
        }
        String str4 = str;
        if ((i2 & 4) != 0) {
            str2 = eopResultInfo.resultMsg;
        }
        String str5 = str2;
        if ((i2 & 8) != 0) {
            i = eopResultInfo.errorCode;
        }
        int i3 = i;
        if ((i2 & 16) != 0) {
            str3 = eopResultInfo.ossImgPath;
        }
        return eopResultInfo.copy(z, str4, str5, i3, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component1() {
        return this.isSuccess;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.localImgPath;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.resultMsg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component4() {
        return this.errorCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.ossImgPath;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final EopResultInfo copy(boolean z, String str, String str2, int i, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str3, "");
        return new EopResultInfo(z, str, str2, i, str3);
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
        if (!(obj instanceof EopResultInfo)) {
            return false;
        }
        EopResultInfo eopResultInfo = (EopResultInfo) obj;
        return this.isSuccess == eopResultInfo.isSuccess && Intrinsics.EZpvd((Object) this.localImgPath, (Object) eopResultInfo.localImgPath) && Intrinsics.EZpvd((Object) this.resultMsg, (Object) eopResultInfo.resultMsg) && this.errorCode == eopResultInfo.errorCode && Intrinsics.EZpvd((Object) this.ossImgPath, (Object) eopResultInfo.ossImgPath);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getErrorCode() {
        return this.errorCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLocalImgPath() {
        return this.localImgPath;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOssImgPath() {
        return this.ossImgPath;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getResultMsg() {
        return this.resultMsg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.isSuccess);
        String str = this.localImgPath;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.resultMsg;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + (str2 != null ? str2.hashCode() : 0)) * 31) + Integer.hashCode(this.errorCode)) * 31) + this.ossImgPath.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isSuccess() {
        return this.isSuccess;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setErrorCode(int i) {
        this.errorCode = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLocalImgPath(String str) {
        this.localImgPath = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOssImgPath(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.ossImgPath = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setResultMsg(String str) {
        this.resultMsg = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSuccess(boolean z) {
        this.isSuccess = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "EopResultInfo(isSuccess=" + this.isSuccess + ", localImgPath=" + this.localImgPath + ", resultMsg=" + this.resultMsg + ", errorCode=" + this.errorCode + ", ossImgPath=" + this.ossImgPath + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeInt(this.isSuccess ? 1 : 0);
        parcel.writeString(this.localImgPath);
        parcel.writeString(this.resultMsg);
        parcel.writeInt(this.errorCode);
        parcel.writeString(this.ossImgPath);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.liveness.eop.bean.EopResultInfo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<EopResultInfo> serializer() {
            return EopResultInfo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ EopResultInfo(int i, boolean z, String str, String str2, int i2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        this.isSuccess = (i & 1) == 0 ? false : z;
        if ((i & 2) == 0) {
            this.localImgPath = null;
        } else {
            this.localImgPath = str;
        }
        if ((i & 4) == 0) {
            this.resultMsg = "";
        } else {
            this.resultMsg = str2;
        }
        if ((i & 8) == 0) {
            this.errorCode = -1;
        } else {
            this.errorCode = i2;
        }
        if ((i & 16) == 0) {
            this.ossImgPath = "";
        } else {
            this.ossImgPath = str3;
        }
    }

    public static final /* synthetic */ void write$Self$OKCompliance_ok_compliance_dynamic_eop_liveness_impl(EopResultInfo eopResultInfo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || eopResultInfo.isSuccess) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 0, eopResultInfo.isSuccess);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || eopResultInfo.localImgPath != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, eopResultInfo.localImgPath);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) eopResultInfo.resultMsg, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, eopResultInfo.resultMsg);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || eopResultInfo.errorCode != -1) {
            compositeEncoder.encodeIntElement(serialDescriptor, 3, eopResultInfo.errorCode);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) && Intrinsics.EZpvd((Object) eopResultInfo.ossImgPath, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 4, eopResultInfo.ossImgPath);
    }

    public EopResultInfo(boolean z, String str, String str2, int i, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str3, "");
        this.isSuccess = z;
        this.localImgPath = str;
        this.resultMsg = str2;
        this.errorCode = i;
        this.ossImgPath = str3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0026: CONSTRUCTOR 
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r9v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? false : (r4v0 boolean))
  (wrap:java.lang.String:0x000a: TERNARY null = ((wrap:int:0x0005: ARITH (r9v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r5v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r9v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r6v0 java.lang.String))
  (wrap:int:0x0019: TERNARY null = ((wrap:int:0x0014: ARITH (r9v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (-1 int) : (r7v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001a: ARITH (r9v0 int) & (16 int) A[WRAPPED]) == (0 int)) ? (r8v0 java.lang.String) : (""))
 A[MD:(boolean, java.lang.String, java.lang.String, int, java.lang.String):void (m)] (LINE:11) call: com.okinc.liveness.eop.bean.EopResultInfo.<init>(boolean, java.lang.String, java.lang.String, int, java.lang.String):void type: THIS */
    public /* synthetic */ EopResultInfo(boolean z, String str, String str2, int i, String str3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? false : z, (i2 & 2) != 0 ? null : str, (i2 & 4) != 0 ? "" : str2, (i2 & 8) != 0 ? -1 : i, (i2 & 16) == 0 ? str3 : "");
    }
}
