package com.okinc.business.dexlogic.main.market.bean;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Serializable
public final class DAppInfo implements Parcelable {
    public static final int $stable = 0;
    private final String dappLogo;
    private final String dappName;
    private final String dappSwapUrl;
    private final String projectId;
    private final String versionId;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<DAppInfo> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<DAppInfo> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DAppInfo createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new DAppInfo(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DAppInfo[] newArray(int i) {
            return new DAppInfo[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public DAppInfo() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, 31, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ DAppInfo copy$default(DAppInfo dAppInfo, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = dAppInfo.dappName;
        }
        if ((i & 2) != 0) {
            str2 = dAppInfo.dappLogo;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = dAppInfo.dappSwapUrl;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = dAppInfo.projectId;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            str5 = dAppInfo.versionId;
        }
        return dAppInfo.copy(str, str6, str7, str8, str5);
    }

    @SerialName("dappLogo")
    public static /* synthetic */ void getDappLogo$annotations() {
    }

    @SerialName("dappName")
    public static /* synthetic */ void getDappName$annotations() {
    }

    @SerialName("dappSwapUrl")
    public static /* synthetic */ void getDappSwapUrl$annotations() {
    }

    @SerialName("projectId")
    public static /* synthetic */ void getProjectId$annotations() {
    }

    @SerialName("versionId")
    public static /* synthetic */ void getVersionId$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.dappName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.dappLogo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.dappSwapUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.projectId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.versionId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DAppInfo copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        return new DAppInfo(str, str2, str3, str4, str5);
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
        if (!(obj instanceof DAppInfo)) {
            return false;
        }
        DAppInfo dAppInfo = (DAppInfo) obj;
        return Intrinsics.EZpvd((Object) this.dappName, (Object) dAppInfo.dappName) && Intrinsics.EZpvd((Object) this.dappLogo, (Object) dAppInfo.dappLogo) && Intrinsics.EZpvd((Object) this.dappSwapUrl, (Object) dAppInfo.dappSwapUrl) && Intrinsics.EZpvd((Object) this.projectId, (Object) dAppInfo.projectId) && Intrinsics.EZpvd((Object) this.versionId, (Object) dAppInfo.versionId);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDappLogo() {
        return this.dappLogo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDappName() {
        return this.dappName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDappSwapUrl() {
        return this.dappSwapUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getProjectId() {
        return this.projectId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getVersionId() {
        return this.versionId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((this.dappName.hashCode() * 31) + this.dappLogo.hashCode()) * 31) + this.dappSwapUrl.hashCode()) * 31) + this.projectId.hashCode()) * 31) + this.versionId.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "DAppInfo(dappName=" + this.dappName + ", dappLogo=" + this.dappLogo + ", dappSwapUrl=" + this.dappSwapUrl + ", projectId=" + this.projectId + ", versionId=" + this.versionId + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.dappName);
        parcel.writeString(this.dappLogo);
        parcel.writeString(this.dappSwapUrl);
        parcel.writeString(this.projectId);
        parcel.writeString(this.versionId);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dexlogic.main.market.bean.DAppInfo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<DAppInfo> serializer() {
            return DAppInfo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ DAppInfo(int i, String str, String str2, String str3, String str4, String str5, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.dappName = "";
        } else {
            this.dappName = str;
        }
        if ((i & 2) == 0) {
            this.dappLogo = "";
        } else {
            this.dappLogo = str2;
        }
        if ((i & 4) == 0) {
            this.dappSwapUrl = "";
        } else {
            this.dappSwapUrl = str3;
        }
        if ((i & 8) == 0) {
            this.projectId = "";
        } else {
            this.projectId = str4;
        }
        if ((i & 16) == 0) {
            this.versionId = "";
        } else {
            this.versionId = str5;
        }
    }

    public static final /* synthetic */ void write$Self$OKDex_dex_impl(DAppInfo dAppInfo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) dAppInfo.dappName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, dAppInfo.dappName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) dAppInfo.dappLogo, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, dAppInfo.dappLogo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) dAppInfo.dappSwapUrl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, dAppInfo.dappSwapUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) dAppInfo.projectId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, dAppInfo.projectId);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) && Intrinsics.EZpvd((Object) dAppInfo.versionId, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 4, dAppInfo.versionId);
    }

    public DAppInfo(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        this.dappName = str;
        this.dappLogo = str2;
        this.dappSwapUrl = str3;
        this.projectId = str4;
        this.versionId = str5;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x002a: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r10v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r5v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0009: ARITH (r10v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r6v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0010: ARITH (r10v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r7v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0017: ARITH (r10v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r8v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001e: ARITH (r10v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r9v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:178) call: com.okinc.business.dexlogic.main.market.bean.DAppInfo.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ DAppInfo(String str, String str2, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5);
    }
}
