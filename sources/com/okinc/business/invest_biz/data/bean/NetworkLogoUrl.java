package com.okinc.business.invest_biz.data.bean;

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

/* JADX INFO: loaded from: classes6.dex */
@Serializable
public final class NetworkLogoUrl implements Parcelable {
    public static final int $stable = 0;
    private final String darkNetworkLogo;
    private final String networkLogo;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<NetworkLogoUrl> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<NetworkLogoUrl> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final NetworkLogoUrl createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new NetworkLogoUrl(parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final NetworkLogoUrl[] newArray(int i) {
            return new NetworkLogoUrl[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public NetworkLogoUrl() {
        this((String) null, (String) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ NetworkLogoUrl copy$default(NetworkLogoUrl networkLogoUrl, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = networkLogoUrl.networkLogo;
        }
        if ((i & 2) != 0) {
            str2 = networkLogoUrl.darkNetworkLogo;
        }
        return networkLogoUrl.copy(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.networkLogo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.darkNetworkLogo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final NetworkLogoUrl copy(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new NetworkLogoUrl(str, str2);
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
        if (!(obj instanceof NetworkLogoUrl)) {
            return false;
        }
        NetworkLogoUrl networkLogoUrl = (NetworkLogoUrl) obj;
        return Intrinsics.EZpvd((Object) this.networkLogo, (Object) networkLogoUrl.networkLogo) && Intrinsics.EZpvd((Object) this.darkNetworkLogo, (Object) networkLogoUrl.darkNetworkLogo);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDarkNetworkLogo() {
        return this.darkNetworkLogo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLogo() {
        return this.networkLogo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNetworkLogo() {
        return this.networkLogo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.networkLogo.hashCode() * 31) + this.darkNetworkLogo.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "NetworkLogoUrl(networkLogo=" + this.networkLogo + ", darkNetworkLogo=" + this.darkNetworkLogo + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.networkLogo);
        parcel.writeString(this.darkNetworkLogo);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.invest_biz.data.bean.NetworkLogoUrl.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<NetworkLogoUrl> serializer() {
            return NetworkLogoUrl$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ NetworkLogoUrl(int i, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.networkLogo = "";
        } else {
            this.networkLogo = str;
        }
        if ((i & 2) == 0) {
            this.darkNetworkLogo = "";
        } else {
            this.darkNetworkLogo = str2;
        }
    }

    public static final /* synthetic */ void write$Self$OKDeFi_invest_biz(NetworkLogoUrl networkLogoUrl, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) networkLogoUrl.networkLogo, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, networkLogoUrl.networkLogo);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && Intrinsics.EZpvd((Object) networkLogoUrl.darkNetworkLogo, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 1, networkLogoUrl.darkNetworkLogo);
    }

    public NetworkLogoUrl(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.networkLogo = str;
        this.darkNetworkLogo = str2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000c: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0007: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String):void (m)] (LINE:131) call: com.okinc.business.invest_biz.data.bean.NetworkLogoUrl.<init>(java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ NetworkLogoUrl(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2);
    }
}
