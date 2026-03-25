package com.okinc.share.bean;

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

/* JADX INFO: loaded from: classes11.dex */
@Serializable
public final class ShareBizCondition implements Parcelable {
    private boolean isReferralRestriction;
    private boolean isUserInDemoTrading;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<ShareBizCondition> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<ShareBizCondition> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ShareBizCondition createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new ShareBizCondition(parcel.readInt() != 0, parcel.readInt() != 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ShareBizCondition[] newArray(int i) {
            return new ShareBizCondition[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ ShareBizCondition copy$default(ShareBizCondition shareBizCondition, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = shareBizCondition.isUserInDemoTrading;
        }
        if ((i & 2) != 0) {
            z2 = shareBizCondition.isReferralRestriction;
        }
        return shareBizCondition.copy(z, z2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component1() {
        return this.isUserInDemoTrading;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component2() {
        return this.isReferralRestriction;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ShareBizCondition copy(boolean z, boolean z2) {
        return new ShareBizCondition(z, z2);
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
        if (!(obj instanceof ShareBizCondition)) {
            return false;
        }
        ShareBizCondition shareBizCondition = (ShareBizCondition) obj;
        return this.isUserInDemoTrading == shareBizCondition.isUserInDemoTrading && this.isReferralRestriction == shareBizCondition.isReferralRestriction;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (Boolean.hashCode(this.isUserInDemoTrading) * 31) + Boolean.hashCode(this.isReferralRestriction);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isReferralRestriction() {
        return this.isReferralRestriction;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isUserInDemoTrading() {
        return this.isUserInDemoTrading;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setReferralRestriction(boolean z) {
        this.isReferralRestriction = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setUserInDemoTrading(boolean z) {
        this.isUserInDemoTrading = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ShareBizCondition(isUserInDemoTrading=" + this.isUserInDemoTrading + ", isReferralRestriction=" + this.isReferralRestriction + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeInt(this.isUserInDemoTrading ? 1 : 0);
        parcel.writeInt(this.isReferralRestriction ? 1 : 0);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.share.bean.ShareBizCondition.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ShareBizCondition> serializer() {
            return ShareBizCondition$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ShareBizCondition(int i, boolean z, boolean z2, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3, ShareBizCondition$$serializer.INSTANCE.getDescriptor());
        }
        this.isUserInDemoTrading = z;
        this.isReferralRestriction = z2;
    }

    public static final /* synthetic */ void write$Self$OKShare_share_api(ShareBizCondition shareBizCondition, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeBooleanElement(serialDescriptor, 0, shareBizCondition.isUserInDemoTrading);
        compositeEncoder.encodeBooleanElement(serialDescriptor, 1, shareBizCondition.isReferralRestriction);
    }

    public ShareBizCondition(boolean z, boolean z2) {
        this.isUserInDemoTrading = z;
        this.isReferralRestriction = z2;
    }
}
