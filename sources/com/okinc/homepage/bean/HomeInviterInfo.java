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
public final class HomeInviterInfo implements Parcelable {
    private boolean isAffiliate;
    private int unclaimedMysteryBoxCount;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<HomeInviterInfo> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<HomeInviterInfo> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final HomeInviterInfo createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new HomeInviterInfo(parcel.readInt(), parcel.readInt() != 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final HomeInviterInfo[] newArray(int i) {
            return new HomeInviterInfo[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public HomeInviterInfo() {
        this(0, (boolean) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ HomeInviterInfo copy$default(HomeInviterInfo homeInviterInfo, int i, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = homeInviterInfo.unclaimedMysteryBoxCount;
        }
        if ((i2 & 2) != 0) {
            z = homeInviterInfo.isAffiliate;
        }
        return homeInviterInfo.copy(i, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component1() {
        return this.unclaimedMysteryBoxCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component2() {
        return this.isAffiliate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final HomeInviterInfo copy(int i, boolean z) {
        return new HomeInviterInfo(i, z);
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
        if (!(obj instanceof HomeInviterInfo)) {
            return false;
        }
        HomeInviterInfo homeInviterInfo = (HomeInviterInfo) obj;
        return this.unclaimedMysteryBoxCount == homeInviterInfo.unclaimedMysteryBoxCount && this.isAffiliate == homeInviterInfo.isAffiliate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getUnclaimedMysteryBoxCount() {
        return this.unclaimedMysteryBoxCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (Integer.hashCode(this.unclaimedMysteryBoxCount) * 31) + Boolean.hashCode(this.isAffiliate);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isAffiliate() {
        return this.isAffiliate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAffiliate(boolean z) {
        this.isAffiliate = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setUnclaimedMysteryBoxCount(int i) {
        this.unclaimedMysteryBoxCount = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "HomeInviterInfo(unclaimedMysteryBoxCount=" + this.unclaimedMysteryBoxCount + ", isAffiliate=" + this.isAffiliate + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeInt(this.unclaimedMysteryBoxCount);
        parcel.writeInt(this.isAffiliate ? 1 : 0);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.homepage.bean.HomeInviterInfo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<HomeInviterInfo> serializer() {
            return HomeInviterInfo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ HomeInviterInfo(int i, int i2, boolean z, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.unclaimedMysteryBoxCount = 0;
        } else {
            this.unclaimedMysteryBoxCount = i2;
        }
        if ((i & 2) == 0) {
            this.isAffiliate = false;
        } else {
            this.isAffiliate = z;
        }
    }

    public static final /* synthetic */ void write$Self$OKHome_home_page_api(HomeInviterInfo homeInviterInfo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || homeInviterInfo.unclaimedMysteryBoxCount != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 0, homeInviterInfo.unclaimedMysteryBoxCount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || homeInviterInfo.isAffiliate) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 1, homeInviterInfo.isAffiliate);
        }
    }

    public HomeInviterInfo(int i, boolean z) {
        this.unclaimedMysteryBoxCount = i;
        this.isAffiliate = z;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:int:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r2v0 int))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0006: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? false : (r3v0 boolean))
 A[MD:(int, boolean):void (m)] (LINE:11) call: com.okinc.homepage.bean.HomeInviterInfo.<init>(int, boolean):void type: THIS */
    public /* synthetic */ HomeInviterInfo(int i, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? false : z);
    }
}
