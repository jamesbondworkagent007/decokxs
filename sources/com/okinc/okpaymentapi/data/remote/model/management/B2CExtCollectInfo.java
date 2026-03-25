package com.okinc.okpaymentapi.data.remote.model.management;

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

/* JADX INFO: loaded from: classes10.dex */
@Serializable
public final class B2CExtCollectInfo implements Parcelable {
    public static final int $stable = 0;
    private final String configName;
    private final String depositName;
    private final String side;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<B2CExtCollectInfo> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<B2CExtCollectInfo> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final B2CExtCollectInfo createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new B2CExtCollectInfo(parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final B2CExtCollectInfo[] newArray(int i) {
            return new B2CExtCollectInfo[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public B2CExtCollectInfo() {
        this((String) null, (String) null, (String) null, 7, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ B2CExtCollectInfo copy$default(B2CExtCollectInfo b2CExtCollectInfo, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = b2CExtCollectInfo.configName;
        }
        if ((i & 2) != 0) {
            str2 = b2CExtCollectInfo.depositName;
        }
        if ((i & 4) != 0) {
            str3 = b2CExtCollectInfo.side;
        }
        return b2CExtCollectInfo.copy(str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.configName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.depositName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.side;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final B2CExtCollectInfo copy(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new B2CExtCollectInfo(str, str2, str3);
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
        if (!(obj instanceof B2CExtCollectInfo)) {
            return false;
        }
        B2CExtCollectInfo b2CExtCollectInfo = (B2CExtCollectInfo) obj;
        return Intrinsics.EZpvd((Object) this.configName, (Object) b2CExtCollectInfo.configName) && Intrinsics.EZpvd((Object) this.depositName, (Object) b2CExtCollectInfo.depositName) && Intrinsics.EZpvd((Object) this.side, (Object) b2CExtCollectInfo.side);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getConfigName() {
        return this.configName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDepositName() {
        return this.depositName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSide() {
        return this.side;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.configName.hashCode() * 31) + this.depositName.hashCode()) * 31) + this.side.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "B2CExtCollectInfo(configName=" + this.configName + ", depositName=" + this.depositName + ", side=" + this.side + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.configName);
        parcel.writeString(this.depositName);
        parcel.writeString(this.side);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okpaymentapi.data.remote.model.management.B2CExtCollectInfo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<B2CExtCollectInfo> serializer() {
            return B2CExtCollectInfo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ B2CExtCollectInfo(int i, String str, String str2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.configName = "";
        } else {
            this.configName = str;
        }
        if ((i & 2) == 0) {
            this.depositName = "";
        } else {
            this.depositName = str2;
        }
        if ((i & 4) == 0) {
            this.side = "buy";
        } else {
            this.side = str3;
        }
    }

    public static final /* synthetic */ void write$Self$OKPayments_ok_payment_api(B2CExtCollectInfo b2CExtCollectInfo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) b2CExtCollectInfo.configName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, b2CExtCollectInfo.configName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) b2CExtCollectInfo.depositName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, b2CExtCollectInfo.depositName);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && Intrinsics.EZpvd((Object) b2CExtCollectInfo.side, (Object) "buy")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 2, b2CExtCollectInfo.side);
    }

    public B2CExtCollectInfo(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.configName = str;
        this.depositName = str2;
        this.side = str3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0012: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0007: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("buy") : (r4v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:439) call: com.okinc.okpaymentapi.data.remote.model.management.B2CExtCollectInfo.<init>(java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ B2CExtCollectInfo(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "buy" : str3);
    }
}
