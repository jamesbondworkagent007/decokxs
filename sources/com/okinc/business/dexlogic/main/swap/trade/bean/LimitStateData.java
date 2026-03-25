package com.okinc.business.dexlogic.main.swap.trade.bean;

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

/* JADX INFO: loaded from: classes15.dex */
@Serializable
public final class LimitStateData implements Parcelable {
    private String content;
    private String exploreUrl;
    private String status;
    private String userWalletAddress;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<LimitStateData> CREATOR = new Creator();

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Creator implements Parcelable.Creator<LimitStateData> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LimitStateData createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new LimitStateData(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LimitStateData[] newArray(int i) {
            return new LimitStateData[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public LimitStateData() {
        this((String) null, (String) null, (String) null, (String) null, 15, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ LimitStateData copy$default(LimitStateData limitStateData, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = limitStateData.status;
        }
        if ((i & 2) != 0) {
            str2 = limitStateData.content;
        }
        if ((i & 4) != 0) {
            str3 = limitStateData.exploreUrl;
        }
        if ((i & 8) != 0) {
            str4 = limitStateData.userWalletAddress;
        }
        return limitStateData.copy(str, str2, str3, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.content;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.exploreUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.userWalletAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LimitStateData copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        return new LimitStateData(str, str2, str3, str4);
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
        if (!(obj instanceof LimitStateData)) {
            return false;
        }
        LimitStateData limitStateData = (LimitStateData) obj;
        return Intrinsics.EZpvd((Object) this.status, (Object) limitStateData.status) && Intrinsics.EZpvd((Object) this.content, (Object) limitStateData.content) && Intrinsics.EZpvd((Object) this.exploreUrl, (Object) limitStateData.exploreUrl) && Intrinsics.EZpvd((Object) this.userWalletAddress, (Object) limitStateData.userWalletAddress);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getContent() {
        return this.content;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getExploreUrl() {
        return this.exploreUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getStatus() {
        return this.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUserWalletAddress() {
        return this.userWalletAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((this.status.hashCode() * 31) + this.content.hashCode()) * 31) + this.exploreUrl.hashCode()) * 31) + this.userWalletAddress.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setContent(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.content = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setExploreUrl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.exploreUrl = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setStatus(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.status = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setUserWalletAddress(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.userWalletAddress = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "LimitStateData(status=" + this.status + ", content=" + this.content + ", exploreUrl=" + this.exploreUrl + ", userWalletAddress=" + this.userWalletAddress + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.status);
        parcel.writeString(this.content);
        parcel.writeString(this.exploreUrl);
        parcel.writeString(this.userWalletAddress);
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dexlogic.main.swap.trade.bean.LimitStateData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<LimitStateData> serializer() {
            return LimitStateData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ LimitStateData(int i, String str, String str2, String str3, String str4, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.status = "";
        } else {
            this.status = str;
        }
        if ((i & 2) == 0) {
            this.content = "";
        } else {
            this.content = str2;
        }
        if ((i & 4) == 0) {
            this.exploreUrl = "";
        } else {
            this.exploreUrl = str3;
        }
        if ((i & 8) == 0) {
            this.userWalletAddress = "";
        } else {
            this.userWalletAddress = str4;
        }
    }

    public static final /* synthetic */ void write$Self$OKDex_dex_impl(LimitStateData limitStateData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) limitStateData.status, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, limitStateData.status);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) limitStateData.content, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, limitStateData.content);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) limitStateData.exploreUrl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, limitStateData.exploreUrl);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) && Intrinsics.EZpvd((Object) limitStateData.userWalletAddress, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 3, limitStateData.userWalletAddress);
    }

    public LimitStateData(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.status = str;
        this.content = str2;
        this.exploreUrl = str3;
        this.userWalletAddress = str4;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0016: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0007: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r4v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0011: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r5v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:100) call: com.okinc.business.dexlogic.main.swap.trade.bean.LimitStateData.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ LimitStateData(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4);
    }
}
