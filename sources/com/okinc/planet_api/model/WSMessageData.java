package com.okinc.planet_api.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import o.C56391yDq;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Serializable
public final class WSMessageData implements Parcelable {
    public static final int ATTENTION = 2;
    public static final int COMMENT = 3;
    public static final int LIKE = 1;
    public static final int SYSTEM = 4;
    private final int commentMsgCount;
    private final List<Integer> eventSourceType;
    private final int followMsgCount;
    private final LatestMessage latestMsg;
    private final int likeMsgCount;
    private final int systemMsgCount;
    private Integer totalUnreadCount;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<WSMessageData> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, new ArrayListSerializer(IntSerializer.INSTANCE), null, null, null, null, null};

    public static final class Creator implements Parcelable.Creator<WSMessageData> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WSMessageData createFromParcel(Parcel parcel) {
            int i;
            Intrinsics.checkNotNullParameter(parcel, "");
            int i2 = parcel.readInt();
            int i3 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i3);
            int i4 = 0;
            while (true) {
                i = parcel.readInt();
                if (i4 == i3) {
                    break;
                }
                arrayList.add(Integer.valueOf(i));
                i4++;
            }
            return new WSMessageData(i2, arrayList, i, parcel.readInt(), parcel.readInt(), parcel.readInt() == 0 ? null : LatestMessage.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WSMessageData[] newArray(int i) {
            return new WSMessageData[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public WSMessageData() {
        this(0, (List) null, 0, 0, 0, (LatestMessage) null, (Integer) null, 127, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: com.okinc.planet_api.model.WSMessageData */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ WSMessageData copy$default(WSMessageData wSMessageData, int i, List list, int i2, int i3, int i4, LatestMessage latestMessage, Integer num, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = wSMessageData.commentMsgCount;
        }
        if ((i5 & 2) != 0) {
            list = wSMessageData.eventSourceType;
        }
        List list2 = list;
        if ((i5 & 4) != 0) {
            i2 = wSMessageData.followMsgCount;
        }
        int i6 = i2;
        if ((i5 & 8) != 0) {
            i3 = wSMessageData.likeMsgCount;
        }
        int i7 = i3;
        if ((i5 & 16) != 0) {
            i4 = wSMessageData.systemMsgCount;
        }
        int i8 = i4;
        if ((i5 & 32) != 0) {
            latestMessage = wSMessageData.latestMsg;
        }
        LatestMessage latestMessage2 = latestMessage;
        if ((i5 & 64) != 0) {
            num = wSMessageData.totalUnreadCount;
        }
        return wSMessageData.copy(i, list2, i6, i7, i8, latestMessage2, num);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component1() {
        return this.commentMsgCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Integer> component2() {
        return this.eventSourceType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component3() {
        return this.followMsgCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component4() {
        return this.likeMsgCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component5() {
        return this.systemMsgCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LatestMessage component6() {
        return this.latestMsg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component7() {
        return this.totalUnreadCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final WSMessageData copy(int i, @NotNull List<Integer> list, int i2, int i3, int i4, LatestMessage latestMessage, Integer num) {
        Intrinsics.checkNotNullParameter(list, "");
        return new WSMessageData(i, list, i2, i3, i4, latestMessage, num);
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
        if (!(obj instanceof WSMessageData)) {
            return false;
        }
        WSMessageData wSMessageData = (WSMessageData) obj;
        return this.commentMsgCount == wSMessageData.commentMsgCount && Intrinsics.EZpvd(this.eventSourceType, wSMessageData.eventSourceType) && this.followMsgCount == wSMessageData.followMsgCount && this.likeMsgCount == wSMessageData.likeMsgCount && this.systemMsgCount == wSMessageData.systemMsgCount && Intrinsics.EZpvd(this.latestMsg, wSMessageData.latestMsg) && Intrinsics.EZpvd(this.totalUnreadCount, wSMessageData.totalUnreadCount);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getCommentMsgCount() {
        return this.commentMsgCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Integer> getEventSourceType() {
        return this.eventSourceType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getFollowMsgCount() {
        return this.followMsgCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LatestMessage getLatestMsg() {
        return this.latestMsg;
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
    public final Integer getTotalUnreadCount() {
        return this.totalUnreadCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = Integer.hashCode(this.commentMsgCount);
        int iHashCode2 = this.eventSourceType.hashCode();
        int iHashCode3 = Integer.hashCode(this.followMsgCount);
        int iHashCode4 = Integer.hashCode(this.likeMsgCount);
        int iHashCode5 = Integer.hashCode(this.systemMsgCount);
        LatestMessage latestMessage = this.latestMsg;
        int iHashCode6 = latestMessage == null ? 0 : latestMessage.hashCode();
        Integer num = this.totalUnreadCount;
        return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + (num != null ? num.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTotalUnreadCount(Integer num) {
        this.totalUnreadCount = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "WSMessageData(commentMsgCount=" + this.commentMsgCount + ", eventSourceType=" + this.eventSourceType + ", followMsgCount=" + this.followMsgCount + ", likeMsgCount=" + this.likeMsgCount + ", systemMsgCount=" + this.systemMsgCount + ", latestMsg=" + this.latestMsg + ", totalUnreadCount=" + this.totalUnreadCount + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeInt(this.commentMsgCount);
        List<Integer> list = this.eventSourceType;
        parcel.writeInt(list.size());
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            parcel.writeInt(it.next().intValue());
        }
        parcel.writeInt(this.followMsgCount);
        parcel.writeInt(this.likeMsgCount);
        parcel.writeInt(this.systemMsgCount);
        LatestMessage latestMessage = this.latestMsg;
        if (latestMessage == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            latestMessage.writeToParcel(parcel, i);
        }
        Integer num = this.totalUnreadCount;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
    }

    public /* synthetic */ WSMessageData(int i, int i2, List list, int i3, int i4, int i5, LatestMessage latestMessage, Integer num, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.commentMsgCount = 0;
        } else {
            this.commentMsgCount = i2;
        }
        if ((i & 2) == 0) {
            this.eventSourceType = yDY.AhwBna();
        } else {
            this.eventSourceType = list;
        }
        if ((i & 4) == 0) {
            this.followMsgCount = 0;
        } else {
            this.followMsgCount = i3;
        }
        if ((i & 8) == 0) {
            this.likeMsgCount = 0;
        } else {
            this.likeMsgCount = i4;
        }
        if ((i & 16) == 0) {
            this.systemMsgCount = 0;
        } else {
            this.systemMsgCount = i5;
        }
        if ((i & 32) == 0) {
            this.latestMsg = null;
        } else {
            this.latestMsg = latestMessage;
        }
        if ((i & 64) == 0) {
            this.totalUnreadCount = 0;
        } else {
            this.totalUnreadCount = num;
        }
    }

    public static final /* synthetic */ void write$Self$OKPlanet_ok_feature_planet_api(WSMessageData wSMessageData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        Integer num;
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || wSMessageData.commentMsgCount != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 0, wSMessageData.commentMsgCount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd(wSMessageData.eventSourceType, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], wSMessageData.eventSourceType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || wSMessageData.followMsgCount != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 2, wSMessageData.followMsgCount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || wSMessageData.likeMsgCount != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 3, wSMessageData.likeMsgCount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || wSMessageData.systemMsgCount != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 4, wSMessageData.systemMsgCount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || wSMessageData.latestMsg != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, LatestMessage$$serializer.INSTANCE, wSMessageData.latestMsg);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || (num = wSMessageData.totalUnreadCount) == null || num.intValue() != 0) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, IntSerializer.INSTANCE, wSMessageData.totalUnreadCount);
        }
    }

    public WSMessageData(int i, @NotNull List<Integer> list, int i2, int i3, int i4, LatestMessage latestMessage, Integer num) {
        Intrinsics.checkNotNullParameter(list, "");
        this.commentMsgCount = i;
        this.eventSourceType = list;
        this.followMsgCount = i2;
        this.likeMsgCount = i3;
        this.systemMsgCount = i4;
        this.latestMsg = latestMessage;
        this.totalUnreadCount = num;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x003c: CONSTRUCTOR 
  (wrap:int:?: TERNARY null = ((wrap:int:0x0000: ARITH (r14v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r7v0 int))
  (wrap:java.util.List:0x0010: TERNARY null = ((wrap:int:0x0008: ARITH (r14v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x000c: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:14)) : (r8v0 java.util.List))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0011: ARITH (r14v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r9v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0018: ARITH (r14v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r10v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x001f: ARITH (r14v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r11v0 int))
  (wrap:com.okinc.planet_api.model.LatestMessage:0x002b: TERNARY null = ((wrap:int:0x0026: ARITH (r14v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.planet_api.model.LatestMessage) : (r12v0 com.okinc.planet_api.model.LatestMessage))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x002c: ARITH (r14v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r13v0 java.lang.Integer))
 A[MD:(int, java.util.List<java.lang.Integer>, int, int, int, com.okinc.planet_api.model.LatestMessage, java.lang.Integer):void (m)] (LINE:12) call: com.okinc.planet_api.model.WSMessageData.<init>(int, java.util.List, int, int, int, com.okinc.planet_api.model.LatestMessage, java.lang.Integer):void type: THIS */
    public /* synthetic */ WSMessageData(int i, List list, int i2, int i3, int i4, LatestMessage latestMessage, Integer num, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this((i5 & 1) != 0 ? 0 : i, (i5 & 2) != 0 ? yDY.AhwBna() : list, (i5 & 4) != 0 ? 0 : i2, (i5 & 8) != 0 ? 0 : i3, (i5 & 16) != 0 ? 0 : i4, (i5 & 32) != 0 ? null : latestMessage, (i5 & 64) != 0 ? 0 : num);
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.planet_api.model.WSMessageData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<WSMessageData> serializer() {
            return WSMessageData$$serializer.INSTANCE;
        }

        public final WSMessageData KWHzl(@NotNull String str) {
            Object objM7377constructorimpl;
            Intrinsics.checkNotNullParameter(str, "");
            try {
                Result.Application application = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl((WSMessageData) new Gson().fromJson(str, WSMessageData.class));
            } catch (Throwable th) {
                Result.Application application2 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
            if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
                objM7377constructorimpl = null;
            }
            return (WSMessageData) objM7377constructorimpl;
        }
    }
}
