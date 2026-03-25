package com.okinc.okimcore.model.other;

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

/* JADX INFO: loaded from: classes24.dex */
@Serializable
public final class AffiliateUserTypeMoreInfo implements Parcelable {
    public static final int $stable = 0;
    private final boolean isCgc;
    private final AffiliateUserType userType;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<AffiliateUserTypeMoreInfo> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {AffiliateUserType.CREATOR.serializer(), null};

    public static final class Creator implements Parcelable.Creator<AffiliateUserTypeMoreInfo> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AffiliateUserTypeMoreInfo createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new AffiliateUserTypeMoreInfo((AffiliateUserType) parcel.readParcelable(AffiliateUserTypeMoreInfo.class.getClassLoader()), parcel.readInt() != 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AffiliateUserTypeMoreInfo[] newArray(int i) {
            return new AffiliateUserTypeMoreInfo[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public AffiliateUserTypeMoreInfo() {
        this((AffiliateUserType) null, false, 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ AffiliateUserTypeMoreInfo copy$default(AffiliateUserTypeMoreInfo affiliateUserTypeMoreInfo, AffiliateUserType affiliateUserType, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            affiliateUserType = affiliateUserTypeMoreInfo.userType;
        }
        if ((i & 2) != 0) {
            z = affiliateUserTypeMoreInfo.isCgc;
        }
        return affiliateUserTypeMoreInfo.copy(affiliateUserType, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AffiliateUserType component1() {
        return this.userType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component2() {
        return this.isCgc;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AffiliateUserTypeMoreInfo copy(@NotNull AffiliateUserType affiliateUserType, boolean z) {
        Intrinsics.checkNotNullParameter(affiliateUserType, "");
        return new AffiliateUserTypeMoreInfo(affiliateUserType, z);
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
        if (!(obj instanceof AffiliateUserTypeMoreInfo)) {
            return false;
        }
        AffiliateUserTypeMoreInfo affiliateUserTypeMoreInfo = (AffiliateUserTypeMoreInfo) obj;
        return this.userType == affiliateUserTypeMoreInfo.userType && this.isCgc == affiliateUserTypeMoreInfo.isCgc;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AffiliateUserType getUserType() {
        return this.userType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.userType.hashCode() * 31) + Boolean.hashCode(this.isCgc);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isCgc() {
        return this.isCgc;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "AffiliateUserTypeMoreInfo(userType=" + this.userType + ", isCgc=" + this.isCgc + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeParcelable(this.userType, i);
        parcel.writeInt(this.isCgc ? 1 : 0);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.model.other.AffiliateUserTypeMoreInfo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<AffiliateUserTypeMoreInfo> serializer() {
            return AffiliateUserTypeMoreInfo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ AffiliateUserTypeMoreInfo(int i, AffiliateUserType affiliateUserType, boolean z, SerializationConstructorMarker serializationConstructorMarker) {
        this.userType = (i & 1) == 0 ? AffiliateUserType.COMMON_USER : affiliateUserType;
        if ((i & 2) == 0) {
            this.isCgc = true;
        } else {
            this.isCgc = z;
        }
    }

    public static final /* synthetic */ void write$Self$OKIMCore_okimcore(AffiliateUserTypeMoreInfo affiliateUserTypeMoreInfo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || affiliateUserTypeMoreInfo.userType != AffiliateUserType.COMMON_USER) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 0, kSerializerArr[0], affiliateUserTypeMoreInfo.userType);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && affiliateUserTypeMoreInfo.isCgc) {
            return;
        }
        compositeEncoder.encodeBooleanElement(serialDescriptor, 1, affiliateUserTypeMoreInfo.isCgc);
    }

    public AffiliateUserTypeMoreInfo(@NotNull AffiliateUserType affiliateUserType, boolean z) {
        Intrinsics.checkNotNullParameter(affiliateUserType, "");
        this.userType = affiliateUserType;
        this.isCgc = z;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:com.okinc.okimcore.model.other.AffiliateUserType:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:com.okinc.okimcore.model.other.AffiliateUserType:0x0004: SGET  A[WRAPPED] (LINE:66) com.okinc.okimcore.model.other.AffiliateUserType.COMMON_USER com.okinc.okimcore.model.other.AffiliateUserType) : (r1v0 com.okinc.okimcore.model.other.AffiliateUserType))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0006: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? true : (r2v0 boolean))
 A[MD:(com.okinc.okimcore.model.other.AffiliateUserType, boolean):void (m)] (LINE:65) call: com.okinc.okimcore.model.other.AffiliateUserTypeMoreInfo.<init>(com.okinc.okimcore.model.other.AffiliateUserType, boolean):void type: THIS */
    public /* synthetic */ AffiliateUserTypeMoreInfo(AffiliateUserType affiliateUserType, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? AffiliateUserType.COMMON_USER : affiliateUserType, (i & 2) != 0 ? true : z);
    }
}
