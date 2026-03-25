package com.okinc.business.defi.wallet.mine.search.data.model;

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
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Serializable
public final class SearchRecommendResponse implements Parcelable {
    private final String chainIndex;
    private final String contractAddress;
    private final Integer limit;
    private final List<Integer> strategyTypeList;
    private final List<SearchRecommendTokenModel> tokenList;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<SearchRecommendResponse> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, null, new ArrayListSerializer(IntSerializer.INSTANCE), null, new ArrayListSerializer(SearchRecommendTokenModel$$serializer.INSTANCE)};

    public static final class Creator implements Parcelable.Creator<SearchRecommendResponse> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SearchRecommendResponse createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(Integer.valueOf(parcel.readInt()));
                }
            }
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int i3 = parcel.readInt();
                arrayList2 = new ArrayList(i3);
                for (int i4 = 0; i4 != i3; i4++) {
                    arrayList2.add(SearchRecommendTokenModel.CREATOR.createFromParcel(parcel));
                }
            }
            return new SearchRecommendResponse(string, string2, arrayList, numValueOf, arrayList2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SearchRecommendResponse[] newArray(int i) {
            return new SearchRecommendResponse[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: com.okinc.business.defi.wallet.mine.search.data.model.SearchRecommendResponse */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SearchRecommendResponse copy$default(SearchRecommendResponse searchRecommendResponse, String str, String str2, List list, Integer num, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = searchRecommendResponse.chainIndex;
        }
        if ((i & 2) != 0) {
            str2 = searchRecommendResponse.contractAddress;
        }
        String str3 = str2;
        if ((i & 4) != 0) {
            list = searchRecommendResponse.strategyTypeList;
        }
        List list3 = list;
        if ((i & 8) != 0) {
            num = searchRecommendResponse.limit;
        }
        Integer num2 = num;
        if ((i & 16) != 0) {
            list2 = searchRecommendResponse.tokenList;
        }
        return searchRecommendResponse.copy(str, str3, list3, num2, list2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.chainIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.contractAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Integer> component3() {
        return this.strategyTypeList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component4() {
        return this.limit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<SearchRecommendTokenModel> component5() {
        return this.tokenList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SearchRecommendResponse copy(String str, String str2, List<Integer> list, Integer num, List<SearchRecommendTokenModel> list2) {
        return new SearchRecommendResponse(str, str2, list, num, list2);
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
        if (!(obj instanceof SearchRecommendResponse)) {
            return false;
        }
        SearchRecommendResponse searchRecommendResponse = (SearchRecommendResponse) obj;
        return Intrinsics.EZpvd((Object) this.chainIndex, (Object) searchRecommendResponse.chainIndex) && Intrinsics.EZpvd((Object) this.contractAddress, (Object) searchRecommendResponse.contractAddress) && Intrinsics.EZpvd(this.strategyTypeList, searchRecommendResponse.strategyTypeList) && Intrinsics.EZpvd(this.limit, searchRecommendResponse.limit) && Intrinsics.EZpvd(this.tokenList, searchRecommendResponse.tokenList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChainIndex() {
        return this.chainIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getContractAddress() {
        return this.contractAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getLimit() {
        return this.limit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Integer> getStrategyTypeList() {
        return this.strategyTypeList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<SearchRecommendTokenModel> getTokenList() {
        return this.tokenList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.chainIndex;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.contractAddress;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        List<Integer> list = this.strategyTypeList;
        int iHashCode3 = list == null ? 0 : list.hashCode();
        Integer num = this.limit;
        int iHashCode4 = num == null ? 0 : num.hashCode();
        List<SearchRecommendTokenModel> list2 = this.tokenList;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (list2 != null ? list2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SearchRecommendResponse(chainIndex=" + this.chainIndex + ", contractAddress=" + this.contractAddress + ", strategyTypeList=" + this.strategyTypeList + ", limit=" + this.limit + ", tokenList=" + this.tokenList + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.chainIndex);
        parcel.writeString(this.contractAddress);
        List<Integer> list = this.strategyTypeList;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                parcel.writeInt(it.next().intValue());
            }
        }
        Integer num = this.limit;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        List<SearchRecommendTokenModel> list2 = this.tokenList;
        if (list2 == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(list2.size());
        Iterator<SearchRecommendTokenModel> it2 = list2.iterator();
        while (it2.hasNext()) {
            it2.next().writeToParcel(parcel, i);
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.wallet.mine.search.data.model.SearchRecommendResponse.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SearchRecommendResponse> serializer() {
            return SearchRecommendResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ SearchRecommendResponse(int i, String str, String str2, List list, Integer num, List list2, SerializationConstructorMarker serializationConstructorMarker) {
        if (20 != (i & 20)) {
            PluginExceptionsKt.throwMissingFieldException(i, 20, SearchRecommendResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.chainIndex = (i & 1) == 0 ? "-9223372036854775808" : str;
        if ((i & 2) == 0) {
            this.contractAddress = "";
        } else {
            this.contractAddress = str2;
        }
        this.strategyTypeList = list;
        if ((i & 8) == 0) {
            this.limit = 5;
        } else {
            this.limit = num;
        }
        this.tokenList = list2;
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(SearchRecommendResponse searchRecommendResponse, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        Integer num;
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) searchRecommendResponse.chainIndex, (Object) "-9223372036854775808")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, searchRecommendResponse.chainIndex);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) searchRecommendResponse.contractAddress, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, searchRecommendResponse.contractAddress);
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, kSerializerArr[2], searchRecommendResponse.strategyTypeList);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || (num = searchRecommendResponse.limit) == null || num.intValue() != 5) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, IntSerializer.INSTANCE, searchRecommendResponse.limit);
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, kSerializerArr[4], searchRecommendResponse.tokenList);
    }

    public SearchRecommendResponse(String str, String str2, List<Integer> list, Integer num, List<SearchRecommendTokenModel> list2) {
        this.chainIndex = str;
        this.contractAddress = str2;
        this.strategyTypeList = list;
        this.limit = num;
        this.tokenList = list2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x001b: CONSTRUCTOR 
  (wrap:java.lang.String:0x0006: TERNARY null = ((wrap:int:0x0000: ARITH (r12v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("-9223372036854775808") : (r7v0 java.lang.String))
  (wrap:java.lang.String:0x000d: TERNARY null = ((wrap:int:0x0007: ARITH (r12v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r8v0 java.lang.String))
  (r9v0 java.util.List)
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x000e: ARITH (r12v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (5 int) : (r10v0 java.lang.Integer))
  (r11v0 java.util.List)
 A[MD:(java.lang.String, java.lang.String, java.util.List<java.lang.Integer>, java.lang.Integer, java.util.List<com.okinc.business.defi.wallet.mine.search.data.model.SearchRecommendTokenModel>):void (m)] (LINE:115) call: com.okinc.business.defi.wallet.mine.search.data.model.SearchRecommendResponse.<init>(java.lang.String, java.lang.String, java.util.List, java.lang.Integer, java.util.List):void type: THIS */
    public /* synthetic */ SearchRecommendResponse(String str, String str2, List list, Integer num, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "-9223372036854775808" : str, (i & 2) != 0 ? "" : str2, list, (i & 8) != 0 ? 5 : num, list2);
    }
}
