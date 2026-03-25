package com.okinc.planet.domain.remote.dto;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.Transient;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Serializable
public final class MineCommentBean implements Parcelable {
    private String localFormatedTime;
    private final Long relatedCommentId;
    private final Long relatedContentId;
    private final String repliedText;
    private final Long replyRootId;
    private final String replyText;
    private final long replyTime;
    private final String text;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<MineCommentBean> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<MineCommentBean> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MineCommentBean createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new MineCommentBean(parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString(), parcel.readInt() != 0 ? Long.valueOf(parcel.readLong()) : null, parcel.readString(), parcel.readLong(), parcel.readString(), null, 128, null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MineCommentBean[] newArray(int i) {
            return new MineCommentBean[i];
        }
    }

    @Transient
    public static /* synthetic */ void getLocalFormatedTime$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component1() {
        return this.relatedContentId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component2() {
        return this.relatedCommentId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.repliedText;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component4() {
        return this.replyRootId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.replyText;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component6() {
        return this.replyTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.text;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.localFormatedTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MineCommentBean copy(Long l, Long l2, String str, Long l3, String str2, long j, String str3, String str4) {
        return new MineCommentBean(l, l2, str, l3, str2, j, str3, str4);
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
        if (!(obj instanceof MineCommentBean)) {
            return false;
        }
        MineCommentBean mineCommentBean = (MineCommentBean) obj;
        return Intrinsics.EZpvd(this.relatedContentId, mineCommentBean.relatedContentId) && Intrinsics.EZpvd(this.relatedCommentId, mineCommentBean.relatedCommentId) && Intrinsics.EZpvd((Object) this.repliedText, (Object) mineCommentBean.repliedText) && Intrinsics.EZpvd(this.replyRootId, mineCommentBean.replyRootId) && Intrinsics.EZpvd((Object) this.replyText, (Object) mineCommentBean.replyText) && this.replyTime == mineCommentBean.replyTime && Intrinsics.EZpvd((Object) this.text, (Object) mineCommentBean.text) && Intrinsics.EZpvd((Object) this.localFormatedTime, (Object) mineCommentBean.localFormatedTime);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLocalFormatedTime() {
        return this.localFormatedTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getRelatedCommentId() {
        return this.relatedCommentId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getRelatedContentId() {
        return this.relatedContentId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRepliedText() {
        return this.repliedText;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getReplyRootId() {
        return this.replyRootId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getReplyText() {
        return this.replyText;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getReplyTime() {
        return this.replyTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getText() {
        return this.text;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        Long l = this.relatedContentId;
        int iHashCode = l == null ? 0 : l.hashCode();
        Long l2 = this.relatedCommentId;
        int iHashCode2 = l2 == null ? 0 : l2.hashCode();
        String str = this.repliedText;
        int iHashCode3 = str == null ? 0 : str.hashCode();
        Long l3 = this.replyRootId;
        int iHashCode4 = l3 == null ? 0 : l3.hashCode();
        String str2 = this.replyText;
        int iHashCode5 = str2 == null ? 0 : str2.hashCode();
        int iHashCode6 = Long.hashCode(this.replyTime);
        String str3 = this.text;
        int iHashCode7 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.localFormatedTime;
        return (((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + (str4 != null ? str4.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLocalFormatedTime(String str) {
        this.localFormatedTime = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "MineCommentBean(relatedContentId=" + this.relatedContentId + ", relatedCommentId=" + this.relatedCommentId + ", repliedText=" + this.repliedText + ", replyRootId=" + this.replyRootId + ", replyText=" + this.replyText + ", replyTime=" + this.replyTime + ", text=" + this.text + ", localFormatedTime=" + this.localFormatedTime + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        Long l = this.relatedContentId;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        Long l2 = this.relatedCommentId;
        if (l2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l2.longValue());
        }
        parcel.writeString(this.repliedText);
        Long l3 = this.replyRootId;
        if (l3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l3.longValue());
        }
        parcel.writeString(this.replyText);
        parcel.writeLong(this.replyTime);
        parcel.writeString(this.text);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.planet.domain.remote.dto.MineCommentBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<MineCommentBean> serializer() {
            return MineCommentBean$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ MineCommentBean(int i, Long l, Long l2, String str, Long l3, String str2, long j, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        if (32 != (i & 32)) {
            PluginExceptionsKt.throwMissingFieldException(i, 32, MineCommentBean$$serializer.INSTANCE.getDescriptor());
        }
        if ((i & 1) == 0) {
            this.relatedContentId = null;
        } else {
            this.relatedContentId = l;
        }
        if ((i & 2) == 0) {
            this.relatedCommentId = null;
        } else {
            this.relatedCommentId = l2;
        }
        if ((i & 4) == 0) {
            this.repliedText = null;
        } else {
            this.repliedText = str;
        }
        if ((i & 8) == 0) {
            this.replyRootId = null;
        } else {
            this.replyRootId = l3;
        }
        if ((i & 16) == 0) {
            this.replyText = null;
        } else {
            this.replyText = str2;
        }
        this.replyTime = j;
        if ((i & 64) == 0) {
            this.text = null;
        } else {
            this.text = str3;
        }
        this.localFormatedTime = null;
    }

    public static final /* synthetic */ void write$Self$OKPlanet_ok_feature_planet_impl(MineCommentBean mineCommentBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || mineCommentBean.relatedContentId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, LongSerializer.INSTANCE, mineCommentBean.relatedContentId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || mineCommentBean.relatedCommentId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, LongSerializer.INSTANCE, mineCommentBean.relatedCommentId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || mineCommentBean.repliedText != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, mineCommentBean.repliedText);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || mineCommentBean.replyRootId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, LongSerializer.INSTANCE, mineCommentBean.replyRootId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || mineCommentBean.replyText != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, mineCommentBean.replyText);
        }
        compositeEncoder.encodeLongElement(serialDescriptor, 5, mineCommentBean.replyTime);
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) && mineCommentBean.text == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, mineCommentBean.text);
    }

    public MineCommentBean(Long l, Long l2, String str, Long l3, String str2, long j, String str3, String str4) {
        this.relatedContentId = l;
        this.relatedCommentId = l2;
        this.repliedText = str;
        this.replyRootId = l3;
        this.replyText = str2;
        this.replyTime = j;
        this.text = str3;
        this.localFormatedTime = str4;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x003c: CONSTRUCTOR 
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0002: ARITH (r23v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r14v0 java.lang.Long))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x000a: ARITH (r23v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r15v0 java.lang.Long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0011: ARITH (r23v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r16v0 java.lang.String))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0019: ARITH (r23v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r17v0 java.lang.Long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0021: ARITH (r23v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r18v0 java.lang.String))
  (r19v0 long)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0029: ARITH (r23v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r21v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0031: ARITH (r23v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r22v0 java.lang.String))
 A[MD:(java.lang.Long, java.lang.Long, java.lang.String, java.lang.Long, java.lang.String, long, java.lang.String, java.lang.String):void (m)] (LINE:45) call: com.okinc.planet.domain.remote.dto.MineCommentBean.<init>(java.lang.Long, java.lang.Long, java.lang.String, java.lang.Long, java.lang.String, long, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ MineCommentBean(Long l, Long l2, String str, Long l3, String str2, long j, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : l, (i & 2) != 0 ? null : l2, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : l3, (i & 16) != 0 ? null : str2, j, (i & 64) != 0 ? null : str3, (i & 128) != 0 ? null : str4);
    }
}
