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
public final class MineLikesBean implements Parcelable {
    private final String content;
    private final String ext;
    private final long likeTime;
    private String localFormatedTime;
    private final Long relatedCommentId;
    private final Long relatedContentId;
    private final Long replyRootId;
    private final String text;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<MineLikesBean> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<MineLikesBean> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MineLikesBean createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new MineLikesBean(parcel.readString(), parcel.readString(), parcel.readLong(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString(), null, 128, null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MineLikesBean[] newArray(int i) {
            return new MineLikesBean[i];
        }
    }

    @Transient
    public static /* synthetic */ void getLocalFormatedTime$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.content;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.ext;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component3() {
        return this.likeTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component4() {
        return this.relatedCommentId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component5() {
        return this.relatedContentId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component6() {
        return this.replyRootId;
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
    public final MineLikesBean copy(String str, String str2, long j, Long l, Long l2, Long l3, String str3, String str4) {
        return new MineLikesBean(str, str2, j, l, l2, l3, str3, str4);
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
        if (!(obj instanceof MineLikesBean)) {
            return false;
        }
        MineLikesBean mineLikesBean = (MineLikesBean) obj;
        return Intrinsics.EZpvd((Object) this.content, (Object) mineLikesBean.content) && Intrinsics.EZpvd((Object) this.ext, (Object) mineLikesBean.ext) && this.likeTime == mineLikesBean.likeTime && Intrinsics.EZpvd(this.relatedCommentId, mineLikesBean.relatedCommentId) && Intrinsics.EZpvd(this.relatedContentId, mineLikesBean.relatedContentId) && Intrinsics.EZpvd(this.replyRootId, mineLikesBean.replyRootId) && Intrinsics.EZpvd((Object) this.text, (Object) mineLikesBean.text) && Intrinsics.EZpvd((Object) this.localFormatedTime, (Object) mineLikesBean.localFormatedTime);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getContent() {
        return this.content;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getExt() {
        return this.ext;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getLikeTime() {
        return this.likeTime;
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
    public final Long getReplyRootId() {
        return this.replyRootId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getText() {
        return this.text;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.content;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.ext;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        int iHashCode3 = Long.hashCode(this.likeTime);
        Long l = this.relatedCommentId;
        int iHashCode4 = l == null ? 0 : l.hashCode();
        Long l2 = this.relatedContentId;
        int iHashCode5 = l2 == null ? 0 : l2.hashCode();
        Long l3 = this.replyRootId;
        int iHashCode6 = l3 == null ? 0 : l3.hashCode();
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
        return "MineLikesBean(content=" + this.content + ", ext=" + this.ext + ", likeTime=" + this.likeTime + ", relatedCommentId=" + this.relatedCommentId + ", relatedContentId=" + this.relatedContentId + ", replyRootId=" + this.replyRootId + ", text=" + this.text + ", localFormatedTime=" + this.localFormatedTime + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.content);
        parcel.writeString(this.ext);
        parcel.writeLong(this.likeTime);
        Long l = this.relatedCommentId;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        Long l2 = this.relatedContentId;
        if (l2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l2.longValue());
        }
        Long l3 = this.replyRootId;
        if (l3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l3.longValue());
        }
        parcel.writeString(this.text);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.planet.domain.remote.dto.MineLikesBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<MineLikesBean> serializer() {
            return MineLikesBean$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ MineLikesBean(int i, String str, String str2, long j, Long l, Long l2, Long l3, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        if (4 != (i & 4)) {
            PluginExceptionsKt.throwMissingFieldException(i, 4, MineLikesBean$$serializer.INSTANCE.getDescriptor());
        }
        if ((i & 1) == 0) {
            this.content = null;
        } else {
            this.content = str;
        }
        if ((i & 2) == 0) {
            this.ext = null;
        } else {
            this.ext = str2;
        }
        this.likeTime = j;
        if ((i & 8) == 0) {
            this.relatedCommentId = null;
        } else {
            this.relatedCommentId = l;
        }
        if ((i & 16) == 0) {
            this.relatedContentId = null;
        } else {
            this.relatedContentId = l2;
        }
        if ((i & 32) == 0) {
            this.replyRootId = null;
        } else {
            this.replyRootId = l3;
        }
        if ((i & 64) == 0) {
            this.text = null;
        } else {
            this.text = str3;
        }
        this.localFormatedTime = null;
    }

    public static final /* synthetic */ void write$Self$OKPlanet_ok_feature_planet_impl(MineLikesBean mineLikesBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || mineLikesBean.content != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, mineLikesBean.content);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || mineLikesBean.ext != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, mineLikesBean.ext);
        }
        compositeEncoder.encodeLongElement(serialDescriptor, 2, mineLikesBean.likeTime);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || mineLikesBean.relatedCommentId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, LongSerializer.INSTANCE, mineLikesBean.relatedCommentId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || mineLikesBean.relatedContentId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, LongSerializer.INSTANCE, mineLikesBean.relatedContentId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || mineLikesBean.replyRootId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, LongSerializer.INSTANCE, mineLikesBean.replyRootId);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) && mineLikesBean.text == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, mineLikesBean.text);
    }

    public MineLikesBean(String str, String str2, long j, Long l, Long l2, Long l3, String str3, String str4) {
        this.content = str;
        this.ext = str2;
        this.likeTime = j;
        this.relatedCommentId = l;
        this.relatedContentId = l2;
        this.replyRootId = l3;
        this.text = str3;
        this.localFormatedTime = str4;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x003c: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r23v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r14v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000a: ARITH (r23v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r15v0 java.lang.String))
  (r16v0 long)
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0011: ARITH (r23v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r18v0 java.lang.Long))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0019: ARITH (r23v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r19v0 java.lang.Long))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0021: ARITH (r23v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r20v0 java.lang.Long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0029: ARITH (r23v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r21v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0031: ARITH (r23v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r22v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, long, java.lang.Long, java.lang.Long, java.lang.Long, java.lang.String, java.lang.String):void (m)] (LINE:29) call: com.okinc.planet.domain.remote.dto.MineLikesBean.<init>(java.lang.String, java.lang.String, long, java.lang.Long, java.lang.Long, java.lang.Long, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ MineLikesBean(String str, String str2, long j, Long l, Long l2, Long l3, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, j, (i & 8) != 0 ? null : l, (i & 16) != 0 ? null : l2, (i & 32) != 0 ? null : l3, (i & 64) != 0 ? null : str3, (i & 128) != 0 ? null : str4);
    }
}
