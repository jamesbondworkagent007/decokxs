package com.okinc.ok_kyc_core.data.remote.networkmodel;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
@Serializable
public final class FilesUploadAuthenticationResp implements Parcelable {
    private String accessKeyId;
    private String accessKeySecret;
    private String bucketName;
    private String endpoint;
    private List<FileUploadImageInfo> imageInitInfo;
    private String region;
    private String securityToken;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<FilesUploadAuthenticationResp> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {new ArrayListSerializer(FileUploadImageInfo$$serializer.INSTANCE), null, null, null, null, null, null};

    /* JADX INFO: loaded from: classes23.dex */
    public static final class Creator implements Parcelable.Creator<FilesUploadAuthenticationResp> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FilesUploadAuthenticationResp createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(FileUploadImageInfo.CREATOR.createFromParcel(parcel));
            }
            return new FilesUploadAuthenticationResp(arrayList, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FilesUploadAuthenticationResp[] newArray(int i) {
            return new FilesUploadAuthenticationResp[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: com.okinc.ok_kyc_core.data.remote.networkmodel.FilesUploadAuthenticationResp */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FilesUploadAuthenticationResp copy$default(FilesUploadAuthenticationResp filesUploadAuthenticationResp, List list, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            list = filesUploadAuthenticationResp.imageInitInfo;
        }
        if ((i & 2) != 0) {
            str = filesUploadAuthenticationResp.accessKeyId;
        }
        String str7 = str;
        if ((i & 4) != 0) {
            str2 = filesUploadAuthenticationResp.accessKeySecret;
        }
        String str8 = str2;
        if ((i & 8) != 0) {
            str3 = filesUploadAuthenticationResp.bucketName;
        }
        String str9 = str3;
        if ((i & 16) != 0) {
            str4 = filesUploadAuthenticationResp.endpoint;
        }
        String str10 = str4;
        if ((i & 32) != 0) {
            str5 = filesUploadAuthenticationResp.region;
        }
        String str11 = str5;
        if ((i & 64) != 0) {
            str6 = filesUploadAuthenticationResp.securityToken;
        }
        return filesUploadAuthenticationResp.copy(list, str7, str8, str9, str10, str11, str6);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<FileUploadImageInfo> component1() {
        return this.imageInitInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.accessKeyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.accessKeySecret;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.bucketName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.endpoint;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.region;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.securityToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final FilesUploadAuthenticationResp copy(@NotNull List<FileUploadImageInfo> list, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, String str5, @NotNull String str6) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str6, "");
        return new FilesUploadAuthenticationResp(list, str, str2, str3, str4, str5, str6);
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
        if (!(obj instanceof FilesUploadAuthenticationResp)) {
            return false;
        }
        FilesUploadAuthenticationResp filesUploadAuthenticationResp = (FilesUploadAuthenticationResp) obj;
        return Intrinsics.EZpvd(this.imageInitInfo, filesUploadAuthenticationResp.imageInitInfo) && Intrinsics.EZpvd((Object) this.accessKeyId, (Object) filesUploadAuthenticationResp.accessKeyId) && Intrinsics.EZpvd((Object) this.accessKeySecret, (Object) filesUploadAuthenticationResp.accessKeySecret) && Intrinsics.EZpvd((Object) this.bucketName, (Object) filesUploadAuthenticationResp.bucketName) && Intrinsics.EZpvd((Object) this.endpoint, (Object) filesUploadAuthenticationResp.endpoint) && Intrinsics.EZpvd((Object) this.region, (Object) filesUploadAuthenticationResp.region) && Intrinsics.EZpvd((Object) this.securityToken, (Object) filesUploadAuthenticationResp.securityToken);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAccessKeyId() {
        return this.accessKeyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAccessKeySecret() {
        return this.accessKeySecret;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBucketName() {
        return this.bucketName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEndpoint() {
        return this.endpoint;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<FileUploadImageInfo> getImageInitInfo() {
        return this.imageInitInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRegion() {
        return this.region;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSecurityToken() {
        return this.securityToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.imageInitInfo.hashCode();
        int iHashCode2 = this.accessKeyId.hashCode();
        int iHashCode3 = this.accessKeySecret.hashCode();
        int iHashCode4 = this.bucketName.hashCode();
        int iHashCode5 = this.endpoint.hashCode();
        String str = this.region;
        return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (str == null ? 0 : str.hashCode())) * 31) + this.securityToken.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAccessKeyId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.accessKeyId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAccessKeySecret(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.accessKeySecret = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBucketName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.bucketName = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setEndpoint(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.endpoint = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setImageInitInfo(@NotNull List<FileUploadImageInfo> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.imageInitInfo = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRegion(String str) {
        this.region = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSecurityToken(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.securityToken = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "FilesUploadAuthenticationResp(imageInitInfo=" + this.imageInitInfo + ", accessKeyId=" + this.accessKeyId + ", accessKeySecret=" + this.accessKeySecret + ", bucketName=" + this.bucketName + ", endpoint=" + this.endpoint + ", region=" + this.region + ", securityToken=" + this.securityToken + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        List<FileUploadImageInfo> list = this.imageInitInfo;
        parcel.writeInt(list.size());
        Iterator<FileUploadImageInfo> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
        parcel.writeString(this.accessKeyId);
        parcel.writeString(this.accessKeySecret);
        parcel.writeString(this.bucketName);
        parcel.writeString(this.endpoint);
        parcel.writeString(this.region);
        parcel.writeString(this.securityToken);
    }

    /* JADX INFO: loaded from: classes23.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.ok_kyc_core.data.remote.networkmodel.FilesUploadAuthenticationResp.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<FilesUploadAuthenticationResp> serializer() {
            return FilesUploadAuthenticationResp$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ FilesUploadAuthenticationResp(int i, List list, String str, String str2, String str3, String str4, String str5, String str6, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i, 1, FilesUploadAuthenticationResp$$serializer.INSTANCE.getDescriptor());
        }
        this.imageInitInfo = list;
        if ((i & 2) == 0) {
            this.accessKeyId = "";
        } else {
            this.accessKeyId = str;
        }
        if ((i & 4) == 0) {
            this.accessKeySecret = "";
        } else {
            this.accessKeySecret = str2;
        }
        if ((i & 8) == 0) {
            this.bucketName = "";
        } else {
            this.bucketName = str3;
        }
        if ((i & 16) == 0) {
            this.endpoint = "";
        } else {
            this.endpoint = str4;
        }
        if ((i & 32) == 0) {
            this.region = null;
        } else {
            this.region = str5;
        }
        if ((i & 64) == 0) {
            this.securityToken = "";
        } else {
            this.securityToken = str6;
        }
    }

    public static final /* synthetic */ void write$Self$OKCompliance_ok_compliance_impl(FilesUploadAuthenticationResp filesUploadAuthenticationResp, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeSerializableElement(serialDescriptor, 0, $childSerializers[0], filesUploadAuthenticationResp.imageInitInfo);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) filesUploadAuthenticationResp.accessKeyId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, filesUploadAuthenticationResp.accessKeyId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) filesUploadAuthenticationResp.accessKeySecret, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, filesUploadAuthenticationResp.accessKeySecret);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) filesUploadAuthenticationResp.bucketName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, filesUploadAuthenticationResp.bucketName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) filesUploadAuthenticationResp.endpoint, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, filesUploadAuthenticationResp.endpoint);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || filesUploadAuthenticationResp.region != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, filesUploadAuthenticationResp.region);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) && Intrinsics.EZpvd((Object) filesUploadAuthenticationResp.securityToken, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 6, filesUploadAuthenticationResp.securityToken);
    }

    public FilesUploadAuthenticationResp(@NotNull List<FileUploadImageInfo> list, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, String str5, @NotNull String str6) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str6, "");
        this.imageInitInfo = list;
        this.accessKeyId = str;
        this.accessKeySecret = str2;
        this.bucketName = str3;
        this.endpoint = str4;
        this.region = str5;
        this.securityToken = str6;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0034: CONSTRUCTOR 
  (r8v0 java.util.List)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r15v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r9v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0009: ARITH (r15v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r10v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0010: ARITH (r15v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r11v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0017: ARITH (r15v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r12v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001e: ARITH (r15v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r13v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0025: ARITH (r15v0 int) & (64 int) A[WRAPPED]) == (0 int)) ? (r14v0 java.lang.String) : (""))
 A[MD:(java.util.List<com.okinc.ok_kyc_core.data.remote.networkmodel.FileUploadImageInfo>, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:49) call: com.okinc.ok_kyc_core.data.remote.networkmodel.FilesUploadAuthenticationResp.<init>(java.util.List, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ FilesUploadAuthenticationResp(List list, String str, String str2, String str3, String str4, String str5, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? "" : str4, (i & 32) != 0 ? null : str5, (i & 64) == 0 ? str6 : "");
    }
}
