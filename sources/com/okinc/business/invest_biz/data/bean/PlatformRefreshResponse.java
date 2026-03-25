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
public final class PlatformRefreshResponse implements Parcelable {
    public static final int $stable = 0;
    private final boolean rateLimited;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<PlatformRefreshResponse> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<PlatformRefreshResponse> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PlatformRefreshResponse createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new PlatformRefreshResponse(parcel.readInt() != 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PlatformRefreshResponse[] newArray(int i) {
            return new PlatformRefreshResponse[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public PlatformRefreshResponse() {
        this(false, 1, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ PlatformRefreshResponse copy$default(PlatformRefreshResponse platformRefreshResponse, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = platformRefreshResponse.rateLimited;
        }
        return platformRefreshResponse.copy(z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component1() {
        return this.rateLimited;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PlatformRefreshResponse copy(boolean z) {
        return new PlatformRefreshResponse(z);
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
        return (obj instanceof PlatformRefreshResponse) && this.rateLimited == ((PlatformRefreshResponse) obj).rateLimited;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getRateLimited() {
        return this.rateLimited;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return Boolean.hashCode(this.rateLimited);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "PlatformRefreshResponse(rateLimited=" + this.rateLimited + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeInt(this.rateLimited ? 1 : 0);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.invest_biz.data.bean.PlatformRefreshResponse.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<PlatformRefreshResponse> serializer() {
            return PlatformRefreshResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ PlatformRefreshResponse(int i, boolean z, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.rateLimited = false;
        } else {
            this.rateLimited = z;
        }
    }

    public static final /* synthetic */ void write$Self$OKDeFi_invest_biz(PlatformRefreshResponse platformRefreshResponse, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || platformRefreshResponse.rateLimited) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 0, platformRefreshResponse.rateLimited);
        }
    }

    public PlatformRefreshResponse(boolean z) {
        this.rateLimited = z;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? false : (r1v0 boolean))
 A[MD:(boolean):void (m)] (LINE:364) call: com.okinc.business.invest_biz.data.bean.PlatformRefreshResponse.<init>(boolean):void type: THIS */
    public /* synthetic */ PlatformRefreshResponse(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z);
    }
}
