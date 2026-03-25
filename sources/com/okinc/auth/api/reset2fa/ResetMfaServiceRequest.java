package com.okinc.auth.api.reset2fa;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.network.okg.cor.SubdomainStrategy;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
public final class ResetMfaServiceRequest implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<ResetMfaServiceRequest> CREATOR = new Creator();
    private final RebindMfaEntryPoint entryPoint;
    private String sourceMfaType;
    private final SubdomainStrategy subdomainStrategy;

    public static final class Creator implements Parcelable.Creator<ResetMfaServiceRequest> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ResetMfaServiceRequest createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new ResetMfaServiceRequest((RebindMfaEntryPoint) parcel.readParcelable(ResetMfaServiceRequest.class.getClassLoader()), parcel.readString(), (SubdomainStrategy) parcel.readParcelable(ResetMfaServiceRequest.class.getClassLoader()));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ResetMfaServiceRequest[] newArray(int i) {
            return new ResetMfaServiceRequest[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ ResetMfaServiceRequest copy$default(ResetMfaServiceRequest resetMfaServiceRequest, RebindMfaEntryPoint rebindMfaEntryPoint, String str, SubdomainStrategy subdomainStrategy, int i, Object obj) {
        if ((i & 1) != 0) {
            rebindMfaEntryPoint = resetMfaServiceRequest.entryPoint;
        }
        if ((i & 2) != 0) {
            str = resetMfaServiceRequest.sourceMfaType;
        }
        if ((i & 4) != 0) {
            subdomainStrategy = resetMfaServiceRequest.subdomainStrategy;
        }
        return resetMfaServiceRequest.copy(rebindMfaEntryPoint, str, subdomainStrategy);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RebindMfaEntryPoint component1() {
        return this.entryPoint;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.sourceMfaType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SubdomainStrategy component3() {
        return this.subdomainStrategy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ResetMfaServiceRequest copy(@NotNull RebindMfaEntryPoint rebindMfaEntryPoint, String str, SubdomainStrategy subdomainStrategy) {
        Intrinsics.checkNotNullParameter(rebindMfaEntryPoint, "");
        return new ResetMfaServiceRequest(rebindMfaEntryPoint, str, subdomainStrategy);
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
        if (!(obj instanceof ResetMfaServiceRequest)) {
            return false;
        }
        ResetMfaServiceRequest resetMfaServiceRequest = (ResetMfaServiceRequest) obj;
        return Intrinsics.EZpvd(this.entryPoint, resetMfaServiceRequest.entryPoint) && Intrinsics.EZpvd((Object) this.sourceMfaType, (Object) resetMfaServiceRequest.sourceMfaType) && Intrinsics.EZpvd(this.subdomainStrategy, resetMfaServiceRequest.subdomainStrategy);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RebindMfaEntryPoint getEntryPoint() {
        return this.entryPoint;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSourceMfaType() {
        return this.sourceMfaType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SubdomainStrategy getSubdomainStrategy() {
        return this.subdomainStrategy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.entryPoint.hashCode();
        String str = this.sourceMfaType;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        SubdomainStrategy subdomainStrategy = this.subdomainStrategy;
        return (((iHashCode * 31) + iHashCode2) * 31) + (subdomainStrategy != null ? subdomainStrategy.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSourceMfaType(String str) {
        this.sourceMfaType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ResetMfaServiceRequest(entryPoint=" + this.entryPoint + ", sourceMfaType=" + this.sourceMfaType + ", subdomainStrategy=" + this.subdomainStrategy + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeParcelable(this.entryPoint, i);
        parcel.writeString(this.sourceMfaType);
        parcel.writeParcelable(this.subdomainStrategy, i);
    }

    public ResetMfaServiceRequest(@NotNull RebindMfaEntryPoint rebindMfaEntryPoint, String str, SubdomainStrategy subdomainStrategy) {
        Intrinsics.checkNotNullParameter(rebindMfaEntryPoint, "");
        this.entryPoint = rebindMfaEntryPoint;
        this.sourceMfaType = str;
        this.subdomainStrategy = subdomainStrategy;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (r2v0 com.okinc.auth.api.reset2fa.RebindMfaEntryPoint)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
  (wrap:com.okinc.network.okg.cor.SubdomainStrategy:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.network.okg.cor.SubdomainStrategy) : (r4v0 com.okinc.network.okg.cor.SubdomainStrategy))
 A[MD:(com.okinc.auth.api.reset2fa.RebindMfaEntryPoint, java.lang.String, com.okinc.network.okg.cor.SubdomainStrategy):void (m)] (LINE:27) call: com.okinc.auth.api.reset2fa.ResetMfaServiceRequest.<init>(com.okinc.auth.api.reset2fa.RebindMfaEntryPoint, java.lang.String, com.okinc.network.okg.cor.SubdomainStrategy):void type: THIS */
    public /* synthetic */ ResetMfaServiceRequest(RebindMfaEntryPoint rebindMfaEntryPoint, String str, SubdomainStrategy subdomainStrategy, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(rebindMfaEntryPoint, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : subdomainStrategy);
    }
}
