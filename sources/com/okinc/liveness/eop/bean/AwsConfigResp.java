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
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Serializable
public final class AwsConfigResp implements Parcelable {
    private String awsCognitoRegion;
    private String awsProjectRegion;
    private String awsUserPoolsWebClientId;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<AwsConfigResp> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<AwsConfigResp> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AwsConfigResp createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new AwsConfigResp(parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AwsConfigResp[] newArray(int i) {
            return new AwsConfigResp[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public AwsConfigResp() {
        this((String) null, (String) null, (String) null, 7, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ AwsConfigResp copy$default(AwsConfigResp awsConfigResp, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = awsConfigResp.awsProjectRegion;
        }
        if ((i & 2) != 0) {
            str2 = awsConfigResp.awsCognitoRegion;
        }
        if ((i & 4) != 0) {
            str3 = awsConfigResp.awsUserPoolsWebClientId;
        }
        return awsConfigResp.copy(str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.awsProjectRegion;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.awsCognitoRegion;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.awsUserPoolsWebClientId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AwsConfigResp copy(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new AwsConfigResp(str, str2, str3);
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
        if (!(obj instanceof AwsConfigResp)) {
            return false;
        }
        AwsConfigResp awsConfigResp = (AwsConfigResp) obj;
        return Intrinsics.EZpvd((Object) this.awsProjectRegion, (Object) awsConfigResp.awsProjectRegion) && Intrinsics.EZpvd((Object) this.awsCognitoRegion, (Object) awsConfigResp.awsCognitoRegion) && Intrinsics.EZpvd((Object) this.awsUserPoolsWebClientId, (Object) awsConfigResp.awsUserPoolsWebClientId);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAwsCognitoRegion() {
        return this.awsCognitoRegion;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAwsProjectRegion() {
        return this.awsProjectRegion;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAwsUserPoolsWebClientId() {
        return this.awsUserPoolsWebClientId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.awsProjectRegion.hashCode() * 31) + this.awsCognitoRegion.hashCode()) * 31) + this.awsUserPoolsWebClientId.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAwsCognitoRegion(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.awsCognitoRegion = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAwsProjectRegion(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.awsProjectRegion = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAwsUserPoolsWebClientId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.awsUserPoolsWebClientId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "AwsConfigResp(awsProjectRegion=" + this.awsProjectRegion + ", awsCognitoRegion=" + this.awsCognitoRegion + ", awsUserPoolsWebClientId=" + this.awsUserPoolsWebClientId + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.awsProjectRegion);
        parcel.writeString(this.awsCognitoRegion);
        parcel.writeString(this.awsUserPoolsWebClientId);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.liveness.eop.bean.AwsConfigResp.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<AwsConfigResp> serializer() {
            return AwsConfigResp$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ AwsConfigResp(int i, String str, String str2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.awsProjectRegion = "";
        } else {
            this.awsProjectRegion = str;
        }
        if ((i & 2) == 0) {
            this.awsCognitoRegion = "";
        } else {
            this.awsCognitoRegion = str2;
        }
        if ((i & 4) == 0) {
            this.awsUserPoolsWebClientId = "";
        } else {
            this.awsUserPoolsWebClientId = str3;
        }
    }

    public static final /* synthetic */ void write$Self$OKCompliance_ok_compliance_dynamic_eop_liveness_impl(AwsConfigResp awsConfigResp, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) awsConfigResp.awsProjectRegion, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, awsConfigResp.awsProjectRegion);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) awsConfigResp.awsCognitoRegion, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, awsConfigResp.awsCognitoRegion);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && Intrinsics.EZpvd((Object) awsConfigResp.awsUserPoolsWebClientId, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 2, awsConfigResp.awsUserPoolsWebClientId);
    }

    public AwsConfigResp(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.awsProjectRegion = str;
        this.awsCognitoRegion = str2;
        this.awsUserPoolsWebClientId = str3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0011: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0007: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r4v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:34) call: com.okinc.liveness.eop.bean.AwsConfigResp.<init>(java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ AwsConfigResp(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3);
    }
}
