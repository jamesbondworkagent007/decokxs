package com.okinc.ok_kyc_core.data.remote.networkmodel;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
@Serializable
public final class HomeNotifyResultReq implements Parcelable {
    private int bannerType;
    private String playbook;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<HomeNotifyResultReq> CREATOR = new Creator();

    /* JADX INFO: loaded from: classes23.dex */
    public static final class Creator implements Parcelable.Creator<HomeNotifyResultReq> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final HomeNotifyResultReq createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new HomeNotifyResultReq(parcel.readString(), parcel.readInt());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final HomeNotifyResultReq[] newArray(int i) {
            return new HomeNotifyResultReq[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ HomeNotifyResultReq copy$default(HomeNotifyResultReq homeNotifyResultReq, String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = homeNotifyResultReq.playbook;
        }
        if ((i2 & 2) != 0) {
            i = homeNotifyResultReq.bannerType;
        }
        return homeNotifyResultReq.copy(str, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.playbook;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component2() {
        return this.bannerType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final HomeNotifyResultReq copy(@NotNull String str, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        return new HomeNotifyResultReq(str, i);
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
        if (!(obj instanceof HomeNotifyResultReq)) {
            return false;
        }
        HomeNotifyResultReq homeNotifyResultReq = (HomeNotifyResultReq) obj;
        return Intrinsics.EZpvd((Object) this.playbook, (Object) homeNotifyResultReq.playbook) && this.bannerType == homeNotifyResultReq.bannerType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getBannerType() {
        return this.bannerType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPlaybook() {
        return this.playbook;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.playbook.hashCode() * 31) + Integer.hashCode(this.bannerType);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBannerType(int i) {
        this.bannerType = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPlaybook(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.playbook = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "HomeNotifyResultReq(playbook=" + this.playbook + ", bannerType=" + this.bannerType + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.playbook);
        parcel.writeInt(this.bannerType);
    }

    /* JADX INFO: loaded from: classes23.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.ok_kyc_core.data.remote.networkmodel.HomeNotifyResultReq.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<HomeNotifyResultReq> serializer() {
            return HomeNotifyResultReq$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ HomeNotifyResultReq(int i, String str, int i2, SerializationConstructorMarker serializationConstructorMarker) {
        if (2 != (i & 2)) {
            PluginExceptionsKt.throwMissingFieldException(i, 2, HomeNotifyResultReq$$serializer.INSTANCE.getDescriptor());
        }
        if ((i & 1) == 0) {
            this.playbook = "";
        } else {
            this.playbook = str;
        }
        this.bannerType = i2;
    }

    public static final /* synthetic */ void write$Self$OKCompliance_ok_compliance_impl(HomeNotifyResultReq homeNotifyResultReq, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) homeNotifyResultReq.playbook, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, homeNotifyResultReq.playbook);
        }
        compositeEncoder.encodeIntElement(serialDescriptor, 1, homeNotifyResultReq.bannerType);
    }

    public HomeNotifyResultReq(@NotNull String str, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        this.playbook = str;
        this.bannerType = i;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r1v0 java.lang.String))
  (r2v0 int)
 A[MD:(java.lang.String, int):void (m)] (LINE:76) call: com.okinc.ok_kyc_core.data.remote.networkmodel.HomeNotifyResultReq.<init>(java.lang.String, int):void type: THIS */
    public /* synthetic */ HomeNotifyResultReq(String str, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, i);
    }
}
