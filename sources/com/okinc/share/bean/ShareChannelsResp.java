package com.okinc.share.bean;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Serializable
public final class ShareChannelsResp implements Parcelable {
    private final List<Integer> channels;
    private final int functionMaxLimit;
    private final int internalMaxLimit;
    private final int socialMaxLimit;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<ShareChannelsResp> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {new ArrayListSerializer(IntSerializer.INSTANCE), null, null, null};

    public static final class Creator implements Parcelable.Creator<ShareChannelsResp> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ShareChannelsResp createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(Integer.valueOf(parcel.readInt()));
            }
            return new ShareChannelsResp(arrayList, parcel.readInt(), parcel.readInt(), parcel.readInt());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ShareChannelsResp[] newArray(int i) {
            return new ShareChannelsResp[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ShareChannelsResp() {
        this((List) null, 0, 0, 0, 15, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.share.bean.ShareChannelsResp */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ShareChannelsResp copy$default(ShareChannelsResp shareChannelsResp, List list, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            list = shareChannelsResp.channels;
        }
        if ((i4 & 2) != 0) {
            i = shareChannelsResp.socialMaxLimit;
        }
        if ((i4 & 4) != 0) {
            i2 = shareChannelsResp.internalMaxLimit;
        }
        if ((i4 & 8) != 0) {
            i3 = shareChannelsResp.functionMaxLimit;
        }
        return shareChannelsResp.copy(list, i, i2, i3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Integer> component1() {
        return this.channels;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component2() {
        return this.socialMaxLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component3() {
        return this.internalMaxLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component4() {
        return this.functionMaxLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ShareChannelsResp copy(@NotNull List<Integer> list, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(list, "");
        return new ShareChannelsResp(list, i, i2, i3);
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
        if (!(obj instanceof ShareChannelsResp)) {
            return false;
        }
        ShareChannelsResp shareChannelsResp = (ShareChannelsResp) obj;
        return Intrinsics.EZpvd(this.channels, shareChannelsResp.channels) && this.socialMaxLimit == shareChannelsResp.socialMaxLimit && this.internalMaxLimit == shareChannelsResp.internalMaxLimit && this.functionMaxLimit == shareChannelsResp.functionMaxLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Integer> getChannels() {
        return this.channels;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getFunctionMaxLimit() {
        return this.functionMaxLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getInternalMaxLimit() {
        return this.internalMaxLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getSocialMaxLimit() {
        return this.socialMaxLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((this.channels.hashCode() * 31) + Integer.hashCode(this.socialMaxLimit)) * 31) + Integer.hashCode(this.internalMaxLimit)) * 31) + Integer.hashCode(this.functionMaxLimit);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ShareChannelsResp(channels=" + this.channels + ", socialMaxLimit=" + this.socialMaxLimit + ", internalMaxLimit=" + this.internalMaxLimit + ", functionMaxLimit=" + this.functionMaxLimit + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        List<Integer> list = this.channels;
        parcel.writeInt(list.size());
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            parcel.writeInt(it.next().intValue());
        }
        parcel.writeInt(this.socialMaxLimit);
        parcel.writeInt(this.internalMaxLimit);
        parcel.writeInt(this.functionMaxLimit);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.share.bean.ShareChannelsResp.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ShareChannelsResp> serializer() {
            return ShareChannelsResp$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ShareChannelsResp(int i, List list, int i2, int i3, int i4, SerializationConstructorMarker serializationConstructorMarker) {
        this.channels = (i & 1) == 0 ? yDY.AhwBna() : list;
        if ((i & 2) == 0) {
            this.socialMaxLimit = -1;
        } else {
            this.socialMaxLimit = i2;
        }
        if ((i & 4) == 0) {
            this.internalMaxLimit = -1;
        } else {
            this.internalMaxLimit = i3;
        }
        if ((i & 8) == 0) {
            this.functionMaxLimit = -1;
        } else {
            this.functionMaxLimit = i4;
        }
    }

    public static final /* synthetic */ void write$Self$OKShare_sdk_share_impl(ShareChannelsResp shareChannelsResp, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd(shareChannelsResp.channels, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 0, kSerializerArr[0], shareChannelsResp.channels);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || shareChannelsResp.socialMaxLimit != -1) {
            compositeEncoder.encodeIntElement(serialDescriptor, 1, shareChannelsResp.socialMaxLimit);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || shareChannelsResp.internalMaxLimit != -1) {
            compositeEncoder.encodeIntElement(serialDescriptor, 2, shareChannelsResp.internalMaxLimit);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) && shareChannelsResp.functionMaxLimit == -1) {
            return;
        }
        compositeEncoder.encodeIntElement(serialDescriptor, 3, shareChannelsResp.functionMaxLimit);
    }

    public ShareChannelsResp(@NotNull List<Integer> list, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(list, "");
        this.channels = list;
        this.socialMaxLimit = i;
        this.internalMaxLimit = i2;
        this.functionMaxLimit = i3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0018: CONSTRUCTOR 
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0004: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:18)) : (r2v0 java.util.List))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0008: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (-1 int) : (r3v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x000e: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (-1 int) : (r4v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0013: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (-1 int) : (r5v0 int))
 A[MD:(java.util.List<java.lang.Integer>, int, int, int):void (m)] (LINE:14) call: com.okinc.share.bean.ShareChannelsResp.<init>(java.util.List, int, int, int):void type: THIS */
    public /* synthetic */ ShareChannelsResp(List list, int i, int i2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? yDY.AhwBna() : list, (i4 & 2) != 0 ? -1 : i, (i4 & 4) != 0 ? -1 : i2, (i4 & 8) != 0 ? -1 : i3);
    }
}
