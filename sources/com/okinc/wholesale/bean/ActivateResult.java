package com.okinc.wholesale.bean;

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

/* JADX INFO: loaded from: classes24.dex */
@Serializable
public final class ActivateResult implements Parcelable {
    public static final int $stable = 0;
    private final String avatarUrl;
    private final String nickName;
    private final String numberOfDays;
    private final String shareUrl;
    private final String uuid;
    private final String vipLevel;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<ActivateResult> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<ActivateResult> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ActivateResult createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new ActivateResult(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ActivateResult[] newArray(int i) {
            return new ActivateResult[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ActivateResult() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 63, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ ActivateResult copy$default(ActivateResult activateResult, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = activateResult.numberOfDays;
        }
        if ((i & 2) != 0) {
            str2 = activateResult.avatarUrl;
        }
        String str7 = str2;
        if ((i & 4) != 0) {
            str3 = activateResult.nickName;
        }
        String str8 = str3;
        if ((i & 8) != 0) {
            str4 = activateResult.shareUrl;
        }
        String str9 = str4;
        if ((i & 16) != 0) {
            str5 = activateResult.uuid;
        }
        String str10 = str5;
        if ((i & 32) != 0) {
            str6 = activateResult.vipLevel;
        }
        return activateResult.copy(str, str7, str8, str9, str10, str6);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.numberOfDays;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.avatarUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.nickName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.shareUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.uuid;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.vipLevel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ActivateResult copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        return new ActivateResult(str, str2, str3, str4, str5, str6);
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
        if (!(obj instanceof ActivateResult)) {
            return false;
        }
        ActivateResult activateResult = (ActivateResult) obj;
        return Intrinsics.EZpvd((Object) this.numberOfDays, (Object) activateResult.numberOfDays) && Intrinsics.EZpvd((Object) this.avatarUrl, (Object) activateResult.avatarUrl) && Intrinsics.EZpvd((Object) this.nickName, (Object) activateResult.nickName) && Intrinsics.EZpvd((Object) this.shareUrl, (Object) activateResult.shareUrl) && Intrinsics.EZpvd((Object) this.uuid, (Object) activateResult.uuid) && Intrinsics.EZpvd((Object) this.vipLevel, (Object) activateResult.vipLevel);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAvatarUrl() {
        return this.avatarUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNickName() {
        return this.nickName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNumberOfDays() {
        return this.numberOfDays;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getShareUrl() {
        return this.shareUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUuid() {
        return this.uuid;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getVipLevel() {
        return this.vipLevel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((this.numberOfDays.hashCode() * 31) + this.avatarUrl.hashCode()) * 31) + this.nickName.hashCode()) * 31) + this.shareUrl.hashCode()) * 31) + this.uuid.hashCode()) * 31) + this.vipLevel.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ActivateResult(numberOfDays=" + this.numberOfDays + ", avatarUrl=" + this.avatarUrl + ", nickName=" + this.nickName + ", shareUrl=" + this.shareUrl + ", uuid=" + this.uuid + ", vipLevel=" + this.vipLevel + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.numberOfDays);
        parcel.writeString(this.avatarUrl);
        parcel.writeString(this.nickName);
        parcel.writeString(this.shareUrl);
        parcel.writeString(this.uuid);
        parcel.writeString(this.vipLevel);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.wholesale.bean.ActivateResult.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ActivateResult> serializer() {
            return ActivateResult$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ActivateResult(int i, String str, String str2, String str3, String str4, String str5, String str6, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.numberOfDays = "";
        } else {
            this.numberOfDays = str;
        }
        if ((i & 2) == 0) {
            this.avatarUrl = "";
        } else {
            this.avatarUrl = str2;
        }
        if ((i & 4) == 0) {
            this.nickName = "";
        } else {
            this.nickName = str3;
        }
        if ((i & 8) == 0) {
            this.shareUrl = "";
        } else {
            this.shareUrl = str4;
        }
        if ((i & 16) == 0) {
            this.uuid = "";
        } else {
            this.uuid = str5;
        }
        if ((i & 32) == 0) {
            this.vipLevel = "";
        } else {
            this.vipLevel = str6;
        }
    }

    public static final /* synthetic */ void write$Self$OKGrowthTools_biz_rewards(ActivateResult activateResult, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) activateResult.numberOfDays, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, activateResult.numberOfDays);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) activateResult.avatarUrl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, activateResult.avatarUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) activateResult.nickName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, activateResult.nickName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) activateResult.shareUrl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, activateResult.shareUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) activateResult.uuid, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, activateResult.uuid);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) && Intrinsics.EZpvd((Object) activateResult.vipLevel, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 5, activateResult.vipLevel);
    }

    public ActivateResult(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        this.numberOfDays = str;
        this.avatarUrl = str2;
        this.nickName = str3;
        this.shareUrl = str4;
        this.uuid = str5;
        this.vipLevel = str6;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0032: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r12v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r6v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0009: ARITH (r12v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r7v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0010: ARITH (r12v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r8v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0017: ARITH (r12v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r9v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001e: ARITH (r12v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r10v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0025: ARITH (r12v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r11v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:81) call: com.okinc.wholesale.bean.ActivateResult.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ ActivateResult(String str, String str2, String str3, String str4, String str5, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6);
    }
}
