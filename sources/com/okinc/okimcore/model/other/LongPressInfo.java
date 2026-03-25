package com.okinc.okimcore.model.other;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Serializable
public final class LongPressInfo implements Parcelable {
    public static final int $stable = 0;
    private final Long groupId;
    private final Long memberId;
    private final String mentionedName;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<LongPressInfo> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<LongPressInfo> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LongPressInfo createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new LongPressInfo(parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() != 0 ? Long.valueOf(parcel.readLong()) : null, parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LongPressInfo[] newArray(int i) {
            return new LongPressInfo[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public LongPressInfo() {
        this((Long) null, (Long) null, (String) null, 7, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ LongPressInfo copy$default(LongPressInfo longPressInfo, Long l, Long l2, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            l = longPressInfo.groupId;
        }
        if ((i & 2) != 0) {
            l2 = longPressInfo.memberId;
        }
        if ((i & 4) != 0) {
            str = longPressInfo.mentionedName;
        }
        return longPressInfo.copy(l, l2, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component1() {
        return this.groupId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component2() {
        return this.memberId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.mentionedName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LongPressInfo copy(Long l, Long l2, String str) {
        return new LongPressInfo(l, l2, str);
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
        if (!(obj instanceof LongPressInfo)) {
            return false;
        }
        LongPressInfo longPressInfo = (LongPressInfo) obj;
        return Intrinsics.EZpvd(this.groupId, longPressInfo.groupId) && Intrinsics.EZpvd(this.memberId, longPressInfo.memberId) && Intrinsics.EZpvd((Object) this.mentionedName, (Object) longPressInfo.mentionedName);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getGroupId() {
        return this.groupId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getMemberId() {
        return this.memberId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMentionedName() {
        return this.mentionedName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        Long l = this.groupId;
        int iHashCode = l == null ? 0 : l.hashCode();
        Long l2 = this.memberId;
        int iHashCode2 = l2 == null ? 0 : l2.hashCode();
        String str = this.mentionedName;
        return (((iHashCode * 31) + iHashCode2) * 31) + (str != null ? str.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "LongPressInfo(groupId=" + this.groupId + ", memberId=" + this.memberId + ", mentionedName=" + this.mentionedName + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        Long l = this.groupId;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        Long l2 = this.memberId;
        if (l2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l2.longValue());
        }
        parcel.writeString(this.mentionedName);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.model.other.LongPressInfo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<LongPressInfo> serializer() {
            return LongPressInfo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ LongPressInfo(int i, Long l, Long l2, String str, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.groupId = null;
        } else {
            this.groupId = l;
        }
        if ((i & 2) == 0) {
            this.memberId = null;
        } else {
            this.memberId = l2;
        }
        if ((i & 4) == 0) {
            this.mentionedName = null;
        } else {
            this.mentionedName = str;
        }
    }

    public static final /* synthetic */ void write$Self$OKIMCore_okimcore(LongPressInfo longPressInfo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || longPressInfo.groupId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, LongSerializer.INSTANCE, longPressInfo.groupId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || longPressInfo.memberId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, LongSerializer.INSTANCE, longPressInfo.memberId);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && longPressInfo.mentionedName == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, longPressInfo.mentionedName);
    }

    public LongPressInfo(Long l, Long l2, String str) {
        this.groupId = l;
        this.memberId = l2;
        this.mentionedName = str;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r2v0 java.lang.Long))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r3v0 java.lang.Long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r4v0 java.lang.String))
 A[MD:(java.lang.Long, java.lang.Long, java.lang.String):void (m)] (LINE:11) call: com.okinc.okimcore.model.other.LongPressInfo.<init>(java.lang.Long, java.lang.Long, java.lang.String):void type: THIS */
    public /* synthetic */ LongPressInfo(Long l, Long l2, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : l, (i & 2) != 0 ? null : l2, (i & 4) != 0 ? null : str);
    }
}
