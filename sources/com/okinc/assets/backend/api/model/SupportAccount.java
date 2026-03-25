package com.okinc.assets.backend.api.model;

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

/* JADX INFO: loaded from: classes22.dex */
@Serializable
public final class SupportAccount implements Parcelable {
    public static final int $stable = 0;
    private final String available;
    private final String inUse;
    private final String name;
    private final int target;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<SupportAccount> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<SupportAccount> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SupportAccount createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new SupportAccount(parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SupportAccount[] newArray(int i) {
            return new SupportAccount[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public SupportAccount() {
        this((String) null, 0, (String) null, (String) null, 15, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ SupportAccount copy$default(SupportAccount supportAccount, String str, int i, String str2, String str3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = supportAccount.available;
        }
        if ((i2 & 2) != 0) {
            i = supportAccount.target;
        }
        if ((i2 & 4) != 0) {
            str2 = supportAccount.name;
        }
        if ((i2 & 8) != 0) {
            str3 = supportAccount.inUse;
        }
        return supportAccount.copy(str, i, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.available;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component2() {
        return this.target;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.inUse;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SupportAccount copy(@NotNull String str, int i, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new SupportAccount(str, i, str2, str3);
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
        if (!(obj instanceof SupportAccount)) {
            return false;
        }
        SupportAccount supportAccount = (SupportAccount) obj;
        return Intrinsics.EZpvd((Object) this.available, (Object) supportAccount.available) && this.target == supportAccount.target && Intrinsics.EZpvd((Object) this.name, (Object) supportAccount.name) && Intrinsics.EZpvd((Object) this.inUse, (Object) supportAccount.inUse);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAvailable() {
        return this.available;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInUse() {
        return this.inUse;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getName() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getTarget() {
        return this.target;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((this.available.hashCode() * 31) + Integer.hashCode(this.target)) * 31) + this.name.hashCode()) * 31) + this.inUse.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SupportAccount(available=" + this.available + ", target=" + this.target + ", name=" + this.name + ", inUse=" + this.inUse + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.available);
        parcel.writeInt(this.target);
        parcel.writeString(this.name);
        parcel.writeString(this.inUse);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.assets.backend.api.model.SupportAccount.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SupportAccount> serializer() {
            return SupportAccount$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ SupportAccount(int i, String str, int i2, String str2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.available = "";
        } else {
            this.available = str;
        }
        if ((i & 2) == 0) {
            this.target = Integer.MIN_VALUE;
        } else {
            this.target = i2;
        }
        if ((i & 4) == 0) {
            this.name = "";
        } else {
            this.name = str2;
        }
        if ((i & 8) == 0) {
            this.inUse = "";
        } else {
            this.inUse = str3;
        }
    }

    public static final /* synthetic */ void write$Self$OKAssets_assets_pro_api(SupportAccount supportAccount, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) supportAccount.available, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, supportAccount.available);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || supportAccount.target != Integer.MIN_VALUE) {
            compositeEncoder.encodeIntElement(serialDescriptor, 1, supportAccount.target);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) supportAccount.name, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, supportAccount.name);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) && Intrinsics.EZpvd((Object) supportAccount.inUse, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 3, supportAccount.inUse);
    }

    public SupportAccount(@NotNull String str, int i, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.available = str;
        this.target = i;
        this.name = str2;
        this.inUse = str3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0017: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0007: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (Integer.MIN_VALUE int) : (r3v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000d: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r4v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0012: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r5v0 java.lang.String))
 A[MD:(java.lang.String, int, java.lang.String, java.lang.String):void (m)] (LINE:264) call: com.okinc.assets.backend.api.model.SupportAccount.<init>(java.lang.String, int, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ SupportAccount(String str, int i, String str2, String str3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? Integer.MIN_VALUE : i, (i2 & 4) != 0 ? "" : str2, (i2 & 8) != 0 ? "" : str3);
    }
}
