package com.okinc.crcore.coreapi.net.responsebean.content;

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
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Serializable
public final class CommunityPostFeedResponse implements Parcelable {
    private final List<CommunityPostResponseBean> contentDataList;
    private final String nextCursor;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<CommunityPostFeedResponse> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {new ArrayListSerializer(CommunityPostResponseBean$$serializer.INSTANCE), null};

    public static final class Creator implements Parcelable.Creator<CommunityPostFeedResponse> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CommunityPostFeedResponse createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(CommunityPostResponseBean.CREATOR.createFromParcel(parcel));
            }
            return new CommunityPostFeedResponse(arrayList, parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CommunityPostFeedResponse[] newArray(int i) {
            return new CommunityPostFeedResponse[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public CommunityPostFeedResponse() {
        this((List) null, (String) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.crcore.coreapi.net.responsebean.content.CommunityPostFeedResponse */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CommunityPostFeedResponse copy$default(CommunityPostFeedResponse communityPostFeedResponse, List list, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            list = communityPostFeedResponse.contentDataList;
        }
        if ((i & 2) != 0) {
            str = communityPostFeedResponse.nextCursor;
        }
        return communityPostFeedResponse.copy(list, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<CommunityPostResponseBean> component1() {
        return this.contentDataList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.nextCursor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CommunityPostFeedResponse copy(@NotNull List<CommunityPostResponseBean> list, String str) {
        Intrinsics.checkNotNullParameter(list, "");
        return new CommunityPostFeedResponse(list, str);
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
        if (!(obj instanceof CommunityPostFeedResponse)) {
            return false;
        }
        CommunityPostFeedResponse communityPostFeedResponse = (CommunityPostFeedResponse) obj;
        return Intrinsics.EZpvd(this.contentDataList, communityPostFeedResponse.contentDataList) && Intrinsics.EZpvd((Object) this.nextCursor, (Object) communityPostFeedResponse.nextCursor);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<CommunityPostResponseBean> getContentDataList() {
        return this.contentDataList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNextCursor() {
        return this.nextCursor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.contentDataList.hashCode();
        String str = this.nextCursor;
        return (iHashCode * 31) + (str == null ? 0 : str.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "CommunityPostFeedResponse(contentDataList=" + this.contentDataList + ", nextCursor=" + this.nextCursor + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        List<CommunityPostResponseBean> list = this.contentDataList;
        parcel.writeInt(list.size());
        Iterator<CommunityPostResponseBean> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
        parcel.writeString(this.nextCursor);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.crcore.coreapi.net.responsebean.content.CommunityPostFeedResponse.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<CommunityPostFeedResponse> serializer() {
            return CommunityPostFeedResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ CommunityPostFeedResponse(int i, List list, String str, SerializationConstructorMarker serializationConstructorMarker) {
        this.contentDataList = (i & 1) == 0 ? yDY.AhwBna() : list;
        if ((i & 2) == 0) {
            this.nextCursor = null;
        } else {
            this.nextCursor = str;
        }
    }

    public static final /* synthetic */ void write$Self$OKCRCore_cr_core(CommunityPostFeedResponse communityPostFeedResponse, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd(communityPostFeedResponse.contentDataList, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 0, kSerializerArr[0], communityPostFeedResponse.contentDataList);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && communityPostFeedResponse.nextCursor == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, communityPostFeedResponse.nextCursor);
    }

    public CommunityPostFeedResponse(@NotNull List<CommunityPostResponseBean> list, String str) {
        Intrinsics.checkNotNullParameter(list, "");
        this.contentDataList = list;
        this.nextCursor = str;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000d: CONSTRUCTOR 
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0004: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:14)) : (r1v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0008: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
 A[MD:(java.util.List<com.okinc.crcore.coreapi.net.responsebean.content.CommunityPostResponseBean>, java.lang.String):void (m)] (LINE:13) call: com.okinc.crcore.coreapi.net.responsebean.content.CommunityPostFeedResponse.<init>(java.util.List, java.lang.String):void type: THIS */
    public /* synthetic */ CommunityPostFeedResponse(List list, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? yDY.AhwBna() : list, (i & 2) != 0 ? null : str);
    }

    public final boolean getHasNext() {
        String str = this.nextCursor;
        return (str == null || Intrinsics.EZpvd((Object) str, (Object) "0")) ? false : true;
    }
}
