package com.okinc.business.defi.biz.net.bean;

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
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Serializable
public final class SearchCoinReq implements Parcelable {
    private static final KSerializer<Object>[] $childSerializers;
    private String accountId;
    private boolean aggregation;
    private List<Long> chainIds;
    private List<Long> excludeCoinIds;
    private int pageNo;
    private String symbolLike;
    private String userUniqueId;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<SearchCoinReq> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<SearchCoinReq> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SearchCoinReq createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(Long.valueOf(parcel.readLong()));
            }
            int i3 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i3);
            for (int i4 = 0; i4 != i3; i4++) {
                arrayList2.add(Long.valueOf(parcel.readLong()));
            }
            return new SearchCoinReq(string, string2, string3, arrayList, arrayList2, parcel.readInt() != 0, parcel.readInt());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SearchCoinReq[] newArray(int i) {
            return new SearchCoinReq[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: com.okinc.business.defi.biz.net.bean.SearchCoinReq */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SearchCoinReq copy$default(SearchCoinReq searchCoinReq, String str, String str2, String str3, List list, List list2, boolean z, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = searchCoinReq.userUniqueId;
        }
        if ((i2 & 2) != 0) {
            str2 = searchCoinReq.accountId;
        }
        String str4 = str2;
        if ((i2 & 4) != 0) {
            str3 = searchCoinReq.symbolLike;
        }
        String str5 = str3;
        if ((i2 & 8) != 0) {
            list = searchCoinReq.excludeCoinIds;
        }
        List list3 = list;
        if ((i2 & 16) != 0) {
            list2 = searchCoinReq.chainIds;
        }
        List list4 = list2;
        if ((i2 & 32) != 0) {
            z = searchCoinReq.aggregation;
        }
        boolean z2 = z;
        if ((i2 & 64) != 0) {
            i = searchCoinReq.pageNo;
        }
        return searchCoinReq.copy(str, str4, str5, list3, list4, z2, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.userUniqueId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.accountId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.symbolLike;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Long> component4() {
        return this.excludeCoinIds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Long> component5() {
        return this.chainIds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component6() {
        return this.aggregation;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component7() {
        return this.pageNo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SearchCoinReq copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull List<Long> list, @NotNull List<Long> list2, boolean z, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        return new SearchCoinReq(str, str2, str3, list, list2, z, i);
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
        if (!(obj instanceof SearchCoinReq)) {
            return false;
        }
        SearchCoinReq searchCoinReq = (SearchCoinReq) obj;
        return Intrinsics.EZpvd((Object) this.userUniqueId, (Object) searchCoinReq.userUniqueId) && Intrinsics.EZpvd((Object) this.accountId, (Object) searchCoinReq.accountId) && Intrinsics.EZpvd((Object) this.symbolLike, (Object) searchCoinReq.symbolLike) && Intrinsics.EZpvd(this.excludeCoinIds, searchCoinReq.excludeCoinIds) && Intrinsics.EZpvd(this.chainIds, searchCoinReq.chainIds) && this.aggregation == searchCoinReq.aggregation && this.pageNo == searchCoinReq.pageNo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAccountId() {
        return this.accountId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getAggregation() {
        return this.aggregation;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Long> getChainIds() {
        return this.chainIds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Long> getExcludeCoinIds() {
        return this.excludeCoinIds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getPageNo() {
        return this.pageNo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSymbolLike() {
        return this.symbolLike;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUserUniqueId() {
        return this.userUniqueId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((this.userUniqueId.hashCode() * 31) + this.accountId.hashCode()) * 31) + this.symbolLike.hashCode()) * 31) + this.excludeCoinIds.hashCode()) * 31) + this.chainIds.hashCode()) * 31) + Boolean.hashCode(this.aggregation)) * 31) + Integer.hashCode(this.pageNo);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAccountId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.accountId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAggregation(boolean z) {
        this.aggregation = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setChainIds(@NotNull List<Long> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.chainIds = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setExcludeCoinIds(@NotNull List<Long> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.excludeCoinIds = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPageNo(int i) {
        this.pageNo = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSymbolLike(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.symbolLike = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setUserUniqueId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.userUniqueId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SearchCoinReq(userUniqueId=" + this.userUniqueId + ", accountId=" + this.accountId + ", symbolLike=" + this.symbolLike + ", excludeCoinIds=" + this.excludeCoinIds + ", chainIds=" + this.chainIds + ", aggregation=" + this.aggregation + ", pageNo=" + this.pageNo + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.userUniqueId);
        parcel.writeString(this.accountId);
        parcel.writeString(this.symbolLike);
        List<Long> list = this.excludeCoinIds;
        parcel.writeInt(list.size());
        Iterator<Long> it = list.iterator();
        while (it.hasNext()) {
            parcel.writeLong(it.next().longValue());
        }
        List<Long> list2 = this.chainIds;
        parcel.writeInt(list2.size());
        Iterator<Long> it2 = list2.iterator();
        while (it2.hasNext()) {
            parcel.writeLong(it2.next().longValue());
        }
        parcel.writeInt(this.aggregation ? 1 : 0);
        parcel.writeInt(this.pageNo);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.net.bean.SearchCoinReq.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SearchCoinReq> serializer() {
            return SearchCoinReq$$serializer.INSTANCE;
        }
    }

    static {
        LongSerializer longSerializer = LongSerializer.INSTANCE;
        $childSerializers = new KSerializer[]{null, null, null, new ArrayListSerializer(longSerializer), new ArrayListSerializer(longSerializer), null, null};
    }

    public /* synthetic */ SearchCoinReq(int i, String str, String str2, String str3, List list, List list2, boolean z, int i2, SerializationConstructorMarker serializationConstructorMarker) {
        if (127 != (i & 127)) {
            PluginExceptionsKt.throwMissingFieldException(i, 127, SearchCoinReq$$serializer.INSTANCE.getDescriptor());
        }
        this.userUniqueId = str;
        this.accountId = str2;
        this.symbolLike = str3;
        this.excludeCoinIds = list;
        this.chainIds = list2;
        this.aggregation = z;
        this.pageNo = i2;
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(SearchCoinReq searchCoinReq, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeStringElement(serialDescriptor, 0, searchCoinReq.userUniqueId);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, searchCoinReq.accountId);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, searchCoinReq.symbolLike);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 3, kSerializerArr[3], searchCoinReq.excludeCoinIds);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 4, kSerializerArr[4], searchCoinReq.chainIds);
        compositeEncoder.encodeBooleanElement(serialDescriptor, 5, searchCoinReq.aggregation);
        compositeEncoder.encodeIntElement(serialDescriptor, 6, searchCoinReq.pageNo);
    }

    public SearchCoinReq(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull List<Long> list, @NotNull List<Long> list2, boolean z, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        this.userUniqueId = str;
        this.accountId = str2;
        this.symbolLike = str3;
        this.excludeCoinIds = list;
        this.chainIds = list2;
        this.aggregation = z;
        this.pageNo = i;
    }
}
