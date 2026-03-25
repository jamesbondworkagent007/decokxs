package com.okinc.planet.domain.remote.dto;

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
public final class UnreadMsgCountResp implements Parcelable {
    public static final int $stable = 0;
    private final int commentMsgCount;
    private final int followMsgCount;
    private final int likeMsgCount;
    private final int systemMsgCount;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<UnreadMsgCountResp> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<UnreadMsgCountResp> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final UnreadMsgCountResp createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new UnreadMsgCountResp(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final UnreadMsgCountResp[] newArray(int i) {
            return new UnreadMsgCountResp[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public UnreadMsgCountResp() {
        this(0, 0, 0, 0, 15, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ UnreadMsgCountResp copy$default(UnreadMsgCountResp unreadMsgCountResp, int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = unreadMsgCountResp.likeMsgCount;
        }
        if ((i5 & 2) != 0) {
            i2 = unreadMsgCountResp.commentMsgCount;
        }
        if ((i5 & 4) != 0) {
            i3 = unreadMsgCountResp.followMsgCount;
        }
        if ((i5 & 8) != 0) {
            i4 = unreadMsgCountResp.systemMsgCount;
        }
        return unreadMsgCountResp.copy(i, i2, i3, i4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component1() {
        return this.likeMsgCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component2() {
        return this.commentMsgCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component3() {
        return this.followMsgCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component4() {
        return this.systemMsgCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final UnreadMsgCountResp copy(int i, int i2, int i3, int i4) {
        return new UnreadMsgCountResp(i, i2, i3, i4);
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
        if (!(obj instanceof UnreadMsgCountResp)) {
            return false;
        }
        UnreadMsgCountResp unreadMsgCountResp = (UnreadMsgCountResp) obj;
        return this.likeMsgCount == unreadMsgCountResp.likeMsgCount && this.commentMsgCount == unreadMsgCountResp.commentMsgCount && this.followMsgCount == unreadMsgCountResp.followMsgCount && this.systemMsgCount == unreadMsgCountResp.systemMsgCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getCommentMsgCount() {
        return this.commentMsgCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getFollowMsgCount() {
        return this.followMsgCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getLikeMsgCount() {
        return this.likeMsgCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getSystemMsgCount() {
        return this.systemMsgCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((Integer.hashCode(this.likeMsgCount) * 31) + Integer.hashCode(this.commentMsgCount)) * 31) + Integer.hashCode(this.followMsgCount)) * 31) + Integer.hashCode(this.systemMsgCount);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "UnreadMsgCountResp(likeMsgCount=" + this.likeMsgCount + ", commentMsgCount=" + this.commentMsgCount + ", followMsgCount=" + this.followMsgCount + ", systemMsgCount=" + this.systemMsgCount + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeInt(this.likeMsgCount);
        parcel.writeInt(this.commentMsgCount);
        parcel.writeInt(this.followMsgCount);
        parcel.writeInt(this.systemMsgCount);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.planet.domain.remote.dto.UnreadMsgCountResp.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<UnreadMsgCountResp> serializer() {
            return UnreadMsgCountResp$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ UnreadMsgCountResp(int i, int i2, int i3, int i4, int i5, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.likeMsgCount = 0;
        } else {
            this.likeMsgCount = i2;
        }
        if ((i & 2) == 0) {
            this.commentMsgCount = 0;
        } else {
            this.commentMsgCount = i3;
        }
        if ((i & 4) == 0) {
            this.followMsgCount = 0;
        } else {
            this.followMsgCount = i4;
        }
        if ((i & 8) == 0) {
            this.systemMsgCount = 0;
        } else {
            this.systemMsgCount = i5;
        }
    }

    public static final /* synthetic */ void write$Self$OKPlanet_ok_feature_planet_impl(UnreadMsgCountResp unreadMsgCountResp, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || unreadMsgCountResp.likeMsgCount != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 0, unreadMsgCountResp.likeMsgCount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || unreadMsgCountResp.commentMsgCount != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 1, unreadMsgCountResp.commentMsgCount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || unreadMsgCountResp.followMsgCount != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 2, unreadMsgCountResp.followMsgCount);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) && unreadMsgCountResp.systemMsgCount == 0) {
            return;
        }
        compositeEncoder.encodeIntElement(serialDescriptor, 3, unreadMsgCountResp.systemMsgCount);
    }

    public UnreadMsgCountResp(int i, int i2, int i3, int i4) {
        this.likeMsgCount = i;
        this.commentMsgCount = i2;
        this.followMsgCount = i3;
        this.systemMsgCount = i4;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0015: CONSTRUCTOR 
  (wrap:int:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r2v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0006: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x000b: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r4v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0010: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r5v0 int))
 A[MD:(int, int, int, int):void (m)] (LINE:16) call: com.okinc.planet.domain.remote.dto.UnreadMsgCountResp.<init>(int, int, int, int):void type: THIS */
    public /* synthetic */ UnreadMsgCountResp(int i, int i2, int i3, int i4, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this((i5 & 1) != 0 ? 0 : i, (i5 & 2) != 0 ? 0 : i2, (i5 & 4) != 0 ? 0 : i3, (i5 & 8) != 0 ? 0 : i4);
    }
}
