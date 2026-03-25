package com.okinc.homepage.bean;

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

/* JADX INFO: loaded from: classes23.dex */
@Serializable
public final class HomeCryptoGiftPendingActivatedInfo implements Parcelable {
    private String deeplink;
    private String expireDate;
    private String sender;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<HomeCryptoGiftPendingActivatedInfo> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<HomeCryptoGiftPendingActivatedInfo> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final HomeCryptoGiftPendingActivatedInfo createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new HomeCryptoGiftPendingActivatedInfo(parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final HomeCryptoGiftPendingActivatedInfo[] newArray(int i) {
            return new HomeCryptoGiftPendingActivatedInfo[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public HomeCryptoGiftPendingActivatedInfo() {
        this((String) null, (String) null, (String) null, 7, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ HomeCryptoGiftPendingActivatedInfo copy$default(HomeCryptoGiftPendingActivatedInfo homeCryptoGiftPendingActivatedInfo, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = homeCryptoGiftPendingActivatedInfo.sender;
        }
        if ((i & 2) != 0) {
            str2 = homeCryptoGiftPendingActivatedInfo.expireDate;
        }
        if ((i & 4) != 0) {
            str3 = homeCryptoGiftPendingActivatedInfo.deeplink;
        }
        return homeCryptoGiftPendingActivatedInfo.copy(str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.sender;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.expireDate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.deeplink;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final HomeCryptoGiftPendingActivatedInfo copy(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new HomeCryptoGiftPendingActivatedInfo(str, str2, str3);
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
        if (!(obj instanceof HomeCryptoGiftPendingActivatedInfo)) {
            return false;
        }
        HomeCryptoGiftPendingActivatedInfo homeCryptoGiftPendingActivatedInfo = (HomeCryptoGiftPendingActivatedInfo) obj;
        return Intrinsics.EZpvd((Object) this.sender, (Object) homeCryptoGiftPendingActivatedInfo.sender) && Intrinsics.EZpvd((Object) this.expireDate, (Object) homeCryptoGiftPendingActivatedInfo.expireDate) && Intrinsics.EZpvd((Object) this.deeplink, (Object) homeCryptoGiftPendingActivatedInfo.deeplink);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDeeplink() {
        return this.deeplink;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getExpireDate() {
        return this.expireDate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSender() {
        return this.sender;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.sender.hashCode() * 31) + this.expireDate.hashCode()) * 31) + this.deeplink.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDeeplink(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.deeplink = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setExpireDate(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.expireDate = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSender(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.sender = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "HomeCryptoGiftPendingActivatedInfo(sender=" + this.sender + ", expireDate=" + this.expireDate + ", deeplink=" + this.deeplink + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.sender);
        parcel.writeString(this.expireDate);
        parcel.writeString(this.deeplink);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.homepage.bean.HomeCryptoGiftPendingActivatedInfo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<HomeCryptoGiftPendingActivatedInfo> serializer() {
            return HomeCryptoGiftPendingActivatedInfo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ HomeCryptoGiftPendingActivatedInfo(int i, String str, String str2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.sender = "";
        } else {
            this.sender = str;
        }
        if ((i & 2) == 0) {
            this.expireDate = "";
        } else {
            this.expireDate = str2;
        }
        if ((i & 4) == 0) {
            this.deeplink = "";
        } else {
            this.deeplink = str3;
        }
    }

    public static final /* synthetic */ void write$Self$OKHome_home_page_api(HomeCryptoGiftPendingActivatedInfo homeCryptoGiftPendingActivatedInfo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) homeCryptoGiftPendingActivatedInfo.sender, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, homeCryptoGiftPendingActivatedInfo.sender);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) homeCryptoGiftPendingActivatedInfo.expireDate, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, homeCryptoGiftPendingActivatedInfo.expireDate);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && Intrinsics.EZpvd((Object) homeCryptoGiftPendingActivatedInfo.deeplink, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 2, homeCryptoGiftPendingActivatedInfo.deeplink);
    }

    public HomeCryptoGiftPendingActivatedInfo(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.sender = str;
        this.expireDate = str2;
        this.deeplink = str3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0011: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0007: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r4v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:11) call: com.okinc.homepage.bean.HomeCryptoGiftPendingActivatedInfo.<init>(java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ HomeCryptoGiftPendingActivatedInfo(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3);
    }
}
