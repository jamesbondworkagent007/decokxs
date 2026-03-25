package com.okinc.business.defi.biz.net.bean;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import o.C10854bwM;
import o.C10954byG;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Serializable
public final class SearchCoinMetaBean implements Parcelable {
    private static final KSerializer<Object>[] $childSerializers;
    private String address;
    private long baseCoinId;
    private ArrayList<Long> chainIds;
    private String chainName;
    private long coinId;
    private ArrayList<Long> coinIds;
    private String imageUrl;
    private int isAggregation;
    private String name;
    private String symbol;
    private String tokenType;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<SearchCoinMetaBean> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<SearchCoinMetaBean> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SearchCoinMetaBean createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            Intrinsics.checkNotNullParameter(parcel, "");
            long j = parcel.readLong();
            long j2 = parcel.readLong();
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            int i = parcel.readInt();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i2 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(i2);
                for (int i3 = 0; i3 != i2; i3++) {
                    arrayList3.add(Long.valueOf(parcel.readLong()));
                }
                arrayList = arrayList3;
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int i4 = parcel.readInt();
                arrayList2 = new ArrayList(i4);
                int i5 = 0;
                while (i5 != i4) {
                    arrayList2.add(Long.valueOf(parcel.readLong()));
                    i5++;
                    i4 = i4;
                }
            }
            return new SearchCoinMetaBean(j, j2, string, string2, string3, string4, string5, string6, i, arrayList, arrayList2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SearchCoinMetaBean[] newArray(int i) {
            return new SearchCoinMetaBean[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public SearchCoinMetaBean() {
        this(0L, 0L, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 0, (ArrayList) null, (ArrayList) null, 2047, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component1() {
        return this.coinId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<Long> component10() {
        return this.coinIds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<Long> component11() {
        return this.chainIds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component2() {
        return this.baseCoinId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.symbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.chainName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.tokenType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.address;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.imageUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component9() {
        return this.isAggregation;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SearchCoinMetaBean copy(long j, long j2, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, int i, ArrayList<Long> arrayList, ArrayList<Long> arrayList2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        return new SearchCoinMetaBean(j, j2, str, str2, str3, str4, str5, str6, i, arrayList, arrayList2);
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
        if (!(obj instanceof SearchCoinMetaBean)) {
            return false;
        }
        SearchCoinMetaBean searchCoinMetaBean = (SearchCoinMetaBean) obj;
        return this.coinId == searchCoinMetaBean.coinId && this.baseCoinId == searchCoinMetaBean.baseCoinId && Intrinsics.EZpvd((Object) this.symbol, (Object) searchCoinMetaBean.symbol) && Intrinsics.EZpvd((Object) this.name, (Object) searchCoinMetaBean.name) && Intrinsics.EZpvd((Object) this.chainName, (Object) searchCoinMetaBean.chainName) && Intrinsics.EZpvd((Object) this.tokenType, (Object) searchCoinMetaBean.tokenType) && Intrinsics.EZpvd((Object) this.address, (Object) searchCoinMetaBean.address) && Intrinsics.EZpvd((Object) this.imageUrl, (Object) searchCoinMetaBean.imageUrl) && this.isAggregation == searchCoinMetaBean.isAggregation && Intrinsics.EZpvd(this.coinIds, searchCoinMetaBean.coinIds) && Intrinsics.EZpvd(this.chainIds, searchCoinMetaBean.chainIds);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAddress() {
        return this.address;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getBaseCoinId() {
        return this.baseCoinId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<Long> getChainIds() {
        return this.chainIds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChainName() {
        return this.chainName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getCoinId() {
        return this.coinId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<Long> getCoinIds() {
        return this.coinIds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getImageUrl() {
        return this.imageUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getName() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSymbol() {
        return this.symbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenType() {
        return this.tokenType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = Long.hashCode(this.coinId);
        int iHashCode2 = Long.hashCode(this.baseCoinId);
        int iHashCode3 = this.symbol.hashCode();
        int iHashCode4 = this.name.hashCode();
        int iHashCode5 = this.chainName.hashCode();
        int iHashCode6 = this.tokenType.hashCode();
        int iHashCode7 = this.address.hashCode();
        int iHashCode8 = this.imageUrl.hashCode();
        int iHashCode9 = Integer.hashCode(this.isAggregation);
        ArrayList<Long> arrayList = this.coinIds;
        int iHashCode10 = arrayList == null ? 0 : arrayList.hashCode();
        ArrayList<Long> arrayList2 = this.chainIds;
        return (((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + (arrayList2 != null ? arrayList2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int isAggregation() {
        return this.isAggregation;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAddress(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.address = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAggregation(int i) {
        this.isAggregation = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBaseCoinId(long j) {
        this.baseCoinId = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setChainIds(ArrayList<Long> arrayList) {
        this.chainIds = arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setChainName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.chainName = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCoinId(long j) {
        this.coinId = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCoinIds(ArrayList<Long> arrayList) {
        this.coinIds = arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setImageUrl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.imageUrl = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.name = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSymbol(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.symbol = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTokenType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.tokenType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SearchCoinMetaBean(coinId=" + this.coinId + ", baseCoinId=" + this.baseCoinId + ", symbol=" + this.symbol + ", name=" + this.name + ", chainName=" + this.chainName + ", tokenType=" + this.tokenType + ", address=" + this.address + ", imageUrl=" + this.imageUrl + ", isAggregation=" + this.isAggregation + ", coinIds=" + this.coinIds + ", chainIds=" + this.chainIds + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeLong(this.coinId);
        parcel.writeLong(this.baseCoinId);
        parcel.writeString(this.symbol);
        parcel.writeString(this.name);
        parcel.writeString(this.chainName);
        parcel.writeString(this.tokenType);
        parcel.writeString(this.address);
        parcel.writeString(this.imageUrl);
        parcel.writeInt(this.isAggregation);
        ArrayList<Long> arrayList = this.coinIds;
        if (arrayList == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(arrayList.size());
            Iterator<Long> it = arrayList.iterator();
            while (it.hasNext()) {
                parcel.writeLong(it.next().longValue());
            }
        }
        ArrayList<Long> arrayList2 = this.chainIds;
        if (arrayList2 == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(arrayList2.size());
        Iterator<Long> it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            parcel.writeLong(it2.next().longValue());
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.net.bean.SearchCoinMetaBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SearchCoinMetaBean> serializer() {
            return SearchCoinMetaBean$$serializer.INSTANCE;
        }
    }

    static {
        LongSerializer longSerializer = LongSerializer.INSTANCE;
        $childSerializers = new KSerializer[]{null, null, null, null, null, null, null, null, null, new ArrayListSerializer(longSerializer), new ArrayListSerializer(longSerializer)};
    }

    public /* synthetic */ SearchCoinMetaBean(int i, long j, long j2, String str, String str2, String str3, String str4, String str5, String str6, int i2, ArrayList arrayList, ArrayList arrayList2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.coinId = 0L;
        } else {
            this.coinId = j;
        }
        if ((i & 2) == 0) {
            this.baseCoinId = 0L;
        } else {
            this.baseCoinId = j2;
        }
        if ((i & 4) == 0) {
            this.symbol = "";
        } else {
            this.symbol = str;
        }
        if ((i & 8) == 0) {
            this.name = "";
        } else {
            this.name = str2;
        }
        if ((i & 16) == 0) {
            this.chainName = "";
        } else {
            this.chainName = str3;
        }
        if ((i & 32) == 0) {
            this.tokenType = "";
        } else {
            this.tokenType = str4;
        }
        if ((i & 64) == 0) {
            this.address = "";
        } else {
            this.address = str5;
        }
        if ((i & 128) == 0) {
            this.imageUrl = "";
        } else {
            this.imageUrl = str6;
        }
        this.isAggregation = (i & 256) == 0 ? 0 : i2;
        if ((i & 512) == 0) {
            this.coinIds = null;
        } else {
            this.coinIds = arrayList;
        }
        if ((i & 1024) == 0) {
            this.chainIds = null;
        } else {
            this.chainIds = arrayList2;
        }
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(SearchCoinMetaBean searchCoinMetaBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || searchCoinMetaBean.coinId != 0) {
            compositeEncoder.encodeLongElement(serialDescriptor, 0, searchCoinMetaBean.coinId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || searchCoinMetaBean.baseCoinId != 0) {
            compositeEncoder.encodeLongElement(serialDescriptor, 1, searchCoinMetaBean.baseCoinId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) searchCoinMetaBean.symbol, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, searchCoinMetaBean.symbol);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) searchCoinMetaBean.name, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, searchCoinMetaBean.name);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) searchCoinMetaBean.chainName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, searchCoinMetaBean.chainName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) searchCoinMetaBean.tokenType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, searchCoinMetaBean.tokenType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) searchCoinMetaBean.address, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, searchCoinMetaBean.address);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) searchCoinMetaBean.imageUrl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 7, searchCoinMetaBean.imageUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || searchCoinMetaBean.isAggregation != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 8, searchCoinMetaBean.isAggregation);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || searchCoinMetaBean.coinIds != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, kSerializerArr[9], searchCoinMetaBean.coinIds);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) && searchCoinMetaBean.chainIds == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, kSerializerArr[10], searchCoinMetaBean.chainIds);
    }

    public SearchCoinMetaBean(long j, long j2, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, int i, ArrayList<Long> arrayList, ArrayList<Long> arrayList2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        this.coinId = j;
        this.baseCoinId = j2;
        this.symbol = str;
        this.name = str2;
        this.chainName = str3;
        this.tokenType = str4;
        this.address = str5;
        this.imageUrl = str6;
        this.isAggregation = i;
        this.coinIds = arrayList;
        this.chainIds = arrayList2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0072: CONSTRUCTOR 
  (wrap:long:?: TERNARY null = ((wrap:int:0x0002: ARITH (r28v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r15v0 long))
  (wrap:long:?: TERNARY null = ((wrap:int:0x000b: ARITH (r28v0 int) & (2 int) A[WRAPPED]) == (0 int)) ? (r17v0 long) : (0 long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0012: ARITH (r28v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r19v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001c: ARITH (r28v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r20v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0024: ARITH (r28v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r21v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002c: ARITH (r28v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r22v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0034: ARITH (r28v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r23v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003c: ARITH (r28v0 int) & (128 int) A[WRAPPED]) == (0 int)) ? (r24v0 java.lang.String) : (""))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0043: ARITH (r28v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r25v0 int))
  (wrap:java.util.ArrayList:?: TERNARY null = ((wrap:int:0x004b: ARITH (r28v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null java.util.ArrayList) : (r26v0 java.util.ArrayList))
  (wrap:java.util.ArrayList:?: TERNARY null = ((wrap:int:0x0054: ARITH (r28v0 int) & (1024 int) A[WRAPPED]) == (0 int)) ? (r27v0 java.util.ArrayList) : (null java.util.ArrayList))
 A[MD:(long, long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, java.util.ArrayList<java.lang.Long>, java.util.ArrayList<java.lang.Long>):void (m)] (LINE:194) call: com.okinc.business.defi.biz.net.bean.SearchCoinMetaBean.<init>(long, long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, java.util.ArrayList, java.util.ArrayList):void type: THIS */
    public /* synthetic */ SearchCoinMetaBean(long j, long j2, String str, String str2, String str3, String str4, String str5, String str6, int i, ArrayList arrayList, ArrayList arrayList2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0L : j, (i2 & 2) == 0 ? j2 : 0L, (i2 & 4) != 0 ? "" : str, (i2 & 8) != 0 ? "" : str2, (i2 & 16) != 0 ? "" : str3, (i2 & 32) != 0 ? "" : str4, (i2 & 64) != 0 ? "" : str5, (i2 & 128) == 0 ? str6 : "", (i2 & 256) != 0 ? 0 : i, (i2 & 512) != 0 ? null : arrayList, (i2 & 1024) == 0 ? arrayList2 : null);
    }

    /* JADX INFO: renamed from: getCoinId, reason: collision with other method in class */
    public final Long m6405getCoinId() {
        if (!m6406isAggregation()) {
            return Long.valueOf(this.coinId);
        }
        ArrayList<Long> arrayList = this.coinIds;
        if (arrayList != null) {
            return (Long) CollectionsKt___CollectionsKt.firstOrNull(arrayList);
        }
        return null;
    }

    public final Long getChainId() {
        C10854bwM c10854bwMCopydefault;
        if (m6406isAggregation()) {
            ArrayList<Long> arrayList = this.chainIds;
            Long l = arrayList != null ? (Long) CollectionsKt___CollectionsKt.firstOrNull(arrayList) : null;
            if (l == null || (c10854bwMCopydefault = C10954byG.EZpvd.valueOf().copydefault(l.longValue())) == null) {
                return null;
            }
            return Long.valueOf(c10854bwMCopydefault.AhwBna());
        }
        return Long.valueOf(this.baseCoinId);
    }

    /* JADX INFO: renamed from: isAggregation, reason: collision with other method in class */
    public final boolean m6406isAggregation() {
        ArrayList<Long> arrayList;
        return this.isAggregation == 1 && (arrayList = this.coinIds) != null && arrayList.size() > 1;
    }

    public final int aggregationType() {
        return m6406isAggregation() ? 1 : 0;
    }
}
