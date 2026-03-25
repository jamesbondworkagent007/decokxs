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
public final class UnreadMsg implements Parcelable {
    private final DraftModel draft;
    private final int eventSourceType;
    private final int eventSubType;
    private final long eventTime;
    private final String ext;
    private boolean isUnreadAdded;
    private String localFormatedTime;
    private final long msgId;
    private final String msgText;
    private final int readStatus;
    private final RelatedAuthorInfo relatedAuthorInfo;
    private final Long relatedCommentId;
    private final Long relatedContentId;
    private final Long replyRootId;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<UnreadMsg> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<UnreadMsg> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final UnreadMsg createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new UnreadMsg(parcel.readLong(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString(), parcel.readString(), parcel.readLong(), parcel.readInt() == 0 ? null : DraftModel.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? RelatedAuthorInfo.CREATOR.createFromParcel(parcel) : null, null, parcel.readInt() != 0, 4096, null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final UnreadMsg[] newArray(int i) {
            return new UnreadMsg[i];
        }
    }

    @Transient
    public static /* synthetic */ void getLocalFormatedTime$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component1() {
        return this.msgId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component10() {
        return this.eventTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DraftModel component11() {
        return this.draft;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RelatedAuthorInfo component12() {
        return this.relatedAuthorInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component13() {
        return this.localFormatedTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component14() {
        return this.isUnreadAdded;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component2() {
        return this.eventSourceType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component3() {
        return this.eventSubType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component4() {
        return this.readStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component5() {
        return this.relatedContentId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component6() {
        return this.relatedCommentId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component7() {
        return this.replyRootId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.ext;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.msgText;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final UnreadMsg copy(long j, int i, int i2, int i3, Long l, Long l2, Long l3, String str, String str2, long j2, DraftModel draftModel, RelatedAuthorInfo relatedAuthorInfo, String str3, boolean z) {
        return new UnreadMsg(j, i, i2, i3, l, l2, l3, str, str2, j2, draftModel, relatedAuthorInfo, str3, z);
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
        if (!(obj instanceof UnreadMsg)) {
            return false;
        }
        UnreadMsg unreadMsg = (UnreadMsg) obj;
        return this.msgId == unreadMsg.msgId && this.eventSourceType == unreadMsg.eventSourceType && this.eventSubType == unreadMsg.eventSubType && this.readStatus == unreadMsg.readStatus && Intrinsics.EZpvd(this.relatedContentId, unreadMsg.relatedContentId) && Intrinsics.EZpvd(this.relatedCommentId, unreadMsg.relatedCommentId) && Intrinsics.EZpvd(this.replyRootId, unreadMsg.replyRootId) && Intrinsics.EZpvd((Object) this.ext, (Object) unreadMsg.ext) && Intrinsics.EZpvd((Object) this.msgText, (Object) unreadMsg.msgText) && this.eventTime == unreadMsg.eventTime && Intrinsics.EZpvd(this.draft, unreadMsg.draft) && Intrinsics.EZpvd(this.relatedAuthorInfo, unreadMsg.relatedAuthorInfo) && Intrinsics.EZpvd((Object) this.localFormatedTime, (Object) unreadMsg.localFormatedTime) && this.isUnreadAdded == unreadMsg.isUnreadAdded;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DraftModel getDraft() {
        return this.draft;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getEventSourceType() {
        return this.eventSourceType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getEventSubType() {
        return this.eventSubType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getEventTime() {
        return this.eventTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getExt() {
        return this.ext;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLocalFormatedTime() {
        return this.localFormatedTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getMsgId() {
        return this.msgId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMsgText() {
        return this.msgText;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getReadStatus() {
        return this.readStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RelatedAuthorInfo getRelatedAuthorInfo() {
        return this.relatedAuthorInfo;
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
    public int hashCode() {
        int iHashCode = Long.hashCode(this.msgId);
        int iHashCode2 = Integer.hashCode(this.eventSourceType);
        int iHashCode3 = Integer.hashCode(this.eventSubType);
        int iHashCode4 = Integer.hashCode(this.readStatus);
        Long l = this.relatedContentId;
        int iHashCode5 = l == null ? 0 : l.hashCode();
        Long l2 = this.relatedCommentId;
        int iHashCode6 = l2 == null ? 0 : l2.hashCode();
        Long l3 = this.replyRootId;
        int iHashCode7 = l3 == null ? 0 : l3.hashCode();
        String str = this.ext;
        int iHashCode8 = str == null ? 0 : str.hashCode();
        String str2 = this.msgText;
        int iHashCode9 = str2 == null ? 0 : str2.hashCode();
        int iHashCode10 = Long.hashCode(this.eventTime);
        DraftModel draftModel = this.draft;
        int iHashCode11 = draftModel == null ? 0 : draftModel.hashCode();
        RelatedAuthorInfo relatedAuthorInfo = this.relatedAuthorInfo;
        int iHashCode12 = relatedAuthorInfo == null ? 0 : relatedAuthorInfo.hashCode();
        String str3 = this.localFormatedTime;
        return (((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + (str3 != null ? str3.hashCode() : 0)) * 31) + Boolean.hashCode(this.isUnreadAdded);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isUnreadAdded() {
        return this.isUnreadAdded;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLocalFormatedTime(String str) {
        this.localFormatedTime = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setUnreadAdded(boolean z) {
        this.isUnreadAdded = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "UnreadMsg(msgId=" + this.msgId + ", eventSourceType=" + this.eventSourceType + ", eventSubType=" + this.eventSubType + ", readStatus=" + this.readStatus + ", relatedContentId=" + this.relatedContentId + ", relatedCommentId=" + this.relatedCommentId + ", replyRootId=" + this.replyRootId + ", ext=" + this.ext + ", msgText=" + this.msgText + ", eventTime=" + this.eventTime + ", draft=" + this.draft + ", relatedAuthorInfo=" + this.relatedAuthorInfo + ", localFormatedTime=" + this.localFormatedTime + ", isUnreadAdded=" + this.isUnreadAdded + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeLong(this.msgId);
        parcel.writeInt(this.eventSourceType);
        parcel.writeInt(this.eventSubType);
        parcel.writeInt(this.readStatus);
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
        Long l3 = this.replyRootId;
        if (l3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l3.longValue());
        }
        parcel.writeString(this.ext);
        parcel.writeString(this.msgText);
        parcel.writeLong(this.eventTime);
        DraftModel draftModel = this.draft;
        if (draftModel == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            draftModel.writeToParcel(parcel, i);
        }
        RelatedAuthorInfo relatedAuthorInfo = this.relatedAuthorInfo;
        if (relatedAuthorInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            relatedAuthorInfo.writeToParcel(parcel, i);
        }
        parcel.writeInt(this.isUnreadAdded ? 1 : 0);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.planet.domain.remote.dto.UnreadMsg.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<UnreadMsg> serializer() {
            return UnreadMsg$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ UnreadMsg(int i, long j, int i2, int i3, int i4, Long l, Long l2, Long l3, String str, String str2, long j2, DraftModel draftModel, RelatedAuthorInfo relatedAuthorInfo, boolean z, SerializationConstructorMarker serializationConstructorMarker) {
        if (527 != (i & 527)) {
            PluginExceptionsKt.throwMissingFieldException(i, 527, UnreadMsg$$serializer.INSTANCE.getDescriptor());
        }
        this.msgId = j;
        this.eventSourceType = i2;
        this.eventSubType = i3;
        this.readStatus = i4;
        if ((i & 16) == 0) {
            this.relatedContentId = null;
        } else {
            this.relatedContentId = l;
        }
        if ((i & 32) == 0) {
            this.relatedCommentId = null;
        } else {
            this.relatedCommentId = l2;
        }
        if ((i & 64) == 0) {
            this.replyRootId = null;
        } else {
            this.replyRootId = l3;
        }
        if ((i & 128) == 0) {
            this.ext = null;
        } else {
            this.ext = str;
        }
        if ((i & 256) == 0) {
            this.msgText = null;
        } else {
            this.msgText = str2;
        }
        this.eventTime = j2;
        if ((i & 1024) == 0) {
            this.draft = null;
        } else {
            this.draft = draftModel;
        }
        if ((i & 2048) == 0) {
            this.relatedAuthorInfo = null;
        } else {
            this.relatedAuthorInfo = relatedAuthorInfo;
        }
        this.localFormatedTime = null;
        this.isUnreadAdded = (i & 4096) == 0 ? false : z;
    }

    public static final /* synthetic */ void write$Self$OKPlanet_ok_feature_planet_impl(UnreadMsg unreadMsg, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeLongElement(serialDescriptor, 0, unreadMsg.msgId);
        compositeEncoder.encodeIntElement(serialDescriptor, 1, unreadMsg.eventSourceType);
        compositeEncoder.encodeIntElement(serialDescriptor, 2, unreadMsg.eventSubType);
        compositeEncoder.encodeIntElement(serialDescriptor, 3, unreadMsg.readStatus);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || unreadMsg.relatedContentId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, LongSerializer.INSTANCE, unreadMsg.relatedContentId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || unreadMsg.relatedCommentId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, LongSerializer.INSTANCE, unreadMsg.relatedCommentId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || unreadMsg.replyRootId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, LongSerializer.INSTANCE, unreadMsg.replyRootId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || unreadMsg.ext != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, unreadMsg.ext);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || unreadMsg.msgText != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.INSTANCE, unreadMsg.msgText);
        }
        compositeEncoder.encodeLongElement(serialDescriptor, 9, unreadMsg.eventTime);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || unreadMsg.draft != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, DraftModel$$serializer.INSTANCE, unreadMsg.draft);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || unreadMsg.relatedAuthorInfo != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 11, RelatedAuthorInfo$$serializer.INSTANCE, unreadMsg.relatedAuthorInfo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || unreadMsg.isUnreadAdded) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 12, unreadMsg.isUnreadAdded);
        }
    }

    public UnreadMsg(long j, int i, int i2, int i3, Long l, Long l2, Long l3, String str, String str2, long j2, DraftModel draftModel, RelatedAuthorInfo relatedAuthorInfo, String str3, boolean z) {
        this.msgId = j;
        this.eventSourceType = i;
        this.eventSubType = i2;
        this.readStatus = i3;
        this.relatedContentId = l;
        this.relatedCommentId = l2;
        this.replyRootId = l3;
        this.ext = str;
        this.msgText = str2;
        this.eventTime = j2;
        this.draft = draftModel;
        this.relatedAuthorInfo = relatedAuthorInfo;
        this.localFormatedTime = str3;
        this.isUnreadAdded = z;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x005c: CONSTRUCTOR 
  (r21v0 long)
  (r23v0 int)
  (r24v0 int)
  (r25v0 int)
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0002: ARITH (r37v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r26v0 java.lang.Long))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x000b: ARITH (r37v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r27v0 java.lang.Long))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0013: ARITH (r37v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r28v0 java.lang.Long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001b: ARITH (r37v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r29v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0023: ARITH (r37v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r30v0 java.lang.String))
  (r31v0 long)
  (wrap:com.okinc.planet.domain.remote.dto.DraftModel:?: TERNARY null = ((wrap:int:0x002b: ARITH (r37v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.planet.domain.remote.dto.DraftModel) : (r33v0 com.okinc.planet.domain.remote.dto.DraftModel))
  (wrap:com.okinc.planet.domain.remote.dto.RelatedAuthorInfo:?: TERNARY null = ((wrap:int:0x0034: ARITH (r37v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.planet.domain.remote.dto.RelatedAuthorInfo) : (r34v0 com.okinc.planet.domain.remote.dto.RelatedAuthorInfo))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003d: ARITH (r37v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r35v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0046: ARITH (r37v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? false : (r36v0 boolean))
 A[MD:(long, int, int, int, java.lang.Long, java.lang.Long, java.lang.Long, java.lang.String, java.lang.String, long, com.okinc.planet.domain.remote.dto.DraftModel, com.okinc.planet.domain.remote.dto.RelatedAuthorInfo, java.lang.String, boolean):void (m)] (LINE:34) call: com.okinc.planet.domain.remote.dto.UnreadMsg.<init>(long, int, int, int, java.lang.Long, java.lang.Long, java.lang.Long, java.lang.String, java.lang.String, long, com.okinc.planet.domain.remote.dto.DraftModel, com.okinc.planet.domain.remote.dto.RelatedAuthorInfo, java.lang.String, boolean):void type: THIS */
    public /* synthetic */ UnreadMsg(long j, int i, int i2, int i3, Long l, Long l2, Long l3, String str, String str2, long j2, DraftModel draftModel, RelatedAuthorInfo relatedAuthorInfo, String str3, boolean z, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, i, i2, i3, (i4 & 16) != 0 ? null : l, (i4 & 32) != 0 ? null : l2, (i4 & 64) != 0 ? null : l3, (i4 & 128) != 0 ? null : str, (i4 & 256) != 0 ? null : str2, j2, (i4 & 1024) != 0 ? null : draftModel, (i4 & 2048) != 0 ? null : relatedAuthorInfo, (i4 & 4096) != 0 ? null : str3, (i4 & 8192) != 0 ? false : z);
    }
}
