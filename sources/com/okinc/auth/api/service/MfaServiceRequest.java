package com.okinc.auth.api.service;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.network.okg.cor.SubdomainStrategy;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public final class MfaServiceRequest implements Parcelable {
    public static final int $stable = SubdomainStrategy.$stable;
    public static final Parcelable.Creator<MfaServiceRequest> CREATOR = new Creator();
    private final String mfaSessionId;
    private final SubdomainStrategy subdomainStrategy;

    /* JADX INFO: loaded from: classes22.dex */
    public static final class Creator implements Parcelable.Creator<MfaServiceRequest> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MfaServiceRequest createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new MfaServiceRequest(parcel.readString(), (SubdomainStrategy) parcel.readParcelable(MfaServiceRequest.class.getClassLoader()));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MfaServiceRequest[] newArray(int i) {
            return new MfaServiceRequest[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ MfaServiceRequest copy$default(MfaServiceRequest mfaServiceRequest, String str, SubdomainStrategy subdomainStrategy, int i, Object obj) {
        if ((i & 1) != 0) {
            str = mfaServiceRequest.mfaSessionId;
        }
        if ((i & 2) != 0) {
            subdomainStrategy = mfaServiceRequest.subdomainStrategy;
        }
        return mfaServiceRequest.copy(str, subdomainStrategy);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.mfaSessionId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SubdomainStrategy component2() {
        return this.subdomainStrategy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MfaServiceRequest copy(@NotNull String str, SubdomainStrategy subdomainStrategy) {
        Intrinsics.checkNotNullParameter(str, "");
        return new MfaServiceRequest(str, subdomainStrategy);
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
        if (!(obj instanceof MfaServiceRequest)) {
            return false;
        }
        MfaServiceRequest mfaServiceRequest = (MfaServiceRequest) obj;
        return Intrinsics.EZpvd((Object) this.mfaSessionId, (Object) mfaServiceRequest.mfaSessionId) && Intrinsics.EZpvd(this.subdomainStrategy, mfaServiceRequest.subdomainStrategy);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMfaSessionId() {
        return this.mfaSessionId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SubdomainStrategy getSubdomainStrategy() {
        return this.subdomainStrategy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.mfaSessionId.hashCode();
        SubdomainStrategy subdomainStrategy = this.subdomainStrategy;
        return (iHashCode * 31) + (subdomainStrategy == null ? 0 : subdomainStrategy.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "MfaServiceRequest(mfaSessionId=" + this.mfaSessionId + ", subdomainStrategy=" + this.subdomainStrategy + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.mfaSessionId);
        parcel.writeParcelable(this.subdomainStrategy, i);
    }

    public MfaServiceRequest(@NotNull String str, SubdomainStrategy subdomainStrategy) {
        Intrinsics.checkNotNullParameter(str, "");
        this.mfaSessionId = str;
        this.subdomainStrategy = subdomainStrategy;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 java.lang.String)
  (wrap:com.okinc.network.okg.cor.SubdomainStrategy:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.network.okg.cor.SubdomainStrategy) : (r2v0 com.okinc.network.okg.cor.SubdomainStrategy))
 A[MD:(java.lang.String, com.okinc.network.okg.cor.SubdomainStrategy):void (m)] (LINE:12) call: com.okinc.auth.api.service.MfaServiceRequest.<init>(java.lang.String, com.okinc.network.okg.cor.SubdomainStrategy):void type: THIS */
    public /* synthetic */ MfaServiceRequest(String str, SubdomainStrategy subdomainStrategy, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : subdomainStrategy);
    }
}
