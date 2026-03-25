package com.okinc.affiliate.bean;

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

/* JADX INFO: loaded from: classes14.dex */
@Serializable
public final class AffiliateIMPermission implements Parcelable {
    public static final int $stable = 0;
    private final boolean allowCreateAffiliateGroup;
    private final boolean allowSendBroadcastMessage;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<AffiliateIMPermission> CREATOR = new Creator();

    /* JADX INFO: loaded from: classes17.dex */
    public static final class Creator implements Parcelable.Creator<AffiliateIMPermission> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AffiliateIMPermission createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new AffiliateIMPermission(parcel.readInt() != 0, parcel.readInt() != 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AffiliateIMPermission[] newArray(int i) {
            return new AffiliateIMPermission[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: Illegal instructions before constructor call */
    public AffiliateIMPermission() {
        boolean z = false;
        this(z, z, 3, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ AffiliateIMPermission copy$default(AffiliateIMPermission affiliateIMPermission, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = affiliateIMPermission.allowCreateAffiliateGroup;
        }
        if ((i & 2) != 0) {
            z2 = affiliateIMPermission.allowSendBroadcastMessage;
        }
        return affiliateIMPermission.copy(z, z2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component1() {
        return this.allowCreateAffiliateGroup;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component2() {
        return this.allowSendBroadcastMessage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AffiliateIMPermission copy(boolean z, boolean z2) {
        return new AffiliateIMPermission(z, z2);
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
        if (!(obj instanceof AffiliateIMPermission)) {
            return false;
        }
        AffiliateIMPermission affiliateIMPermission = (AffiliateIMPermission) obj;
        return this.allowCreateAffiliateGroup == affiliateIMPermission.allowCreateAffiliateGroup && this.allowSendBroadcastMessage == affiliateIMPermission.allowSendBroadcastMessage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getAllowCreateAffiliateGroup() {
        return this.allowCreateAffiliateGroup;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getAllowSendBroadcastMessage() {
        return this.allowSendBroadcastMessage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (Boolean.hashCode(this.allowCreateAffiliateGroup) * 31) + Boolean.hashCode(this.allowSendBroadcastMessage);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "AffiliateIMPermission(allowCreateAffiliateGroup=" + this.allowCreateAffiliateGroup + ", allowSendBroadcastMessage=" + this.allowSendBroadcastMessage + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeInt(this.allowCreateAffiliateGroup ? 1 : 0);
        parcel.writeInt(this.allowSendBroadcastMessage ? 1 : 0);
    }

    /* JADX INFO: loaded from: classes17.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.affiliate.bean.AffiliateIMPermission.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<AffiliateIMPermission> serializer() {
            return AffiliateIMPermission$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ AffiliateIMPermission(int i, boolean z, boolean z2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.allowCreateAffiliateGroup = false;
        } else {
            this.allowCreateAffiliateGroup = z;
        }
        if ((i & 2) == 0) {
            this.allowSendBroadcastMessage = false;
        } else {
            this.allowSendBroadcastMessage = z2;
        }
    }

    public static final /* synthetic */ void write$Self$OKAffiliate_affiliate_api(AffiliateIMPermission affiliateIMPermission, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || affiliateIMPermission.allowCreateAffiliateGroup) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 0, affiliateIMPermission.allowCreateAffiliateGroup);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || affiliateIMPermission.allowSendBroadcastMessage) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 1, affiliateIMPermission.allowSendBroadcastMessage);
        }
    }

    public AffiliateIMPermission(boolean z, boolean z2) {
        this.allowCreateAffiliateGroup = z;
        this.allowSendBroadcastMessage = z2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? false : (r2v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0006: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? false : (r3v0 boolean))
 A[MD:(boolean, boolean):void (m)] (LINE:11) call: com.okinc.affiliate.bean.AffiliateIMPermission.<init>(boolean, boolean):void type: THIS */
    public /* synthetic */ AffiliateIMPermission(boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2);
    }
}
