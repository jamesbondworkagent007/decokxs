package com.okinc.business.dexlogic.main.market.bean;

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
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Serializable
public final class CoinDetailPoolList implements Parcelable {
    private final String dexName;
    private final String explorerUrl;
    private final String liquidity;
    private final String pairAddress;
    private final String poolLogoUrl;
    private final List<CoinDetailPoolToken> poolTokenInfoList;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<CoinDetailPoolList> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, new ArrayListSerializer(CoinDetailPoolToken$$serializer.INSTANCE)};

    public static final class Creator implements Parcelable.Creator<CoinDetailPoolList> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CoinDetailPoolList createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList2.add(CoinDetailPoolToken.CREATOR.createFromParcel(parcel));
                }
                arrayList = arrayList2;
            }
            return new CoinDetailPoolList(string, string2, string3, string4, string5, arrayList);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CoinDetailPoolList[] newArray(int i) {
            return new CoinDetailPoolList[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public CoinDetailPoolList() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (List) null, 63, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: com.okinc.business.dexlogic.main.market.bean.CoinDetailPoolList */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CoinDetailPoolList copy$default(CoinDetailPoolList coinDetailPoolList, String str, String str2, String str3, String str4, String str5, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = coinDetailPoolList.dexName;
        }
        if ((i & 2) != 0) {
            str2 = coinDetailPoolList.explorerUrl;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = coinDetailPoolList.liquidity;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = coinDetailPoolList.pairAddress;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            str5 = coinDetailPoolList.poolLogoUrl;
        }
        String str9 = str5;
        if ((i & 32) != 0) {
            list = coinDetailPoolList.poolTokenInfoList;
        }
        return coinDetailPoolList.copy(str, str6, str7, str8, str9, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.dexName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.explorerUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.liquidity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.pairAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.poolLogoUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<CoinDetailPoolToken> component6() {
        return this.poolTokenInfoList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CoinDetailPoolList copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, List<CoinDetailPoolToken> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        return new CoinDetailPoolList(str, str2, str3, str4, str5, list);
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
        if (!(obj instanceof CoinDetailPoolList)) {
            return false;
        }
        CoinDetailPoolList coinDetailPoolList = (CoinDetailPoolList) obj;
        return Intrinsics.EZpvd((Object) this.dexName, (Object) coinDetailPoolList.dexName) && Intrinsics.EZpvd((Object) this.explorerUrl, (Object) coinDetailPoolList.explorerUrl) && Intrinsics.EZpvd((Object) this.liquidity, (Object) coinDetailPoolList.liquidity) && Intrinsics.EZpvd((Object) this.pairAddress, (Object) coinDetailPoolList.pairAddress) && Intrinsics.EZpvd((Object) this.poolLogoUrl, (Object) coinDetailPoolList.poolLogoUrl) && Intrinsics.EZpvd(this.poolTokenInfoList, coinDetailPoolList.poolTokenInfoList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDexName() {
        return this.dexName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getExplorerUrl() {
        return this.explorerUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLiquidity() {
        return this.liquidity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPairAddress() {
        return this.pairAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPoolLogoUrl() {
        return this.poolLogoUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<CoinDetailPoolToken> getPoolTokenInfoList() {
        return this.poolTokenInfoList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.dexName.hashCode();
        int iHashCode2 = this.explorerUrl.hashCode();
        int iHashCode3 = this.liquidity.hashCode();
        int iHashCode4 = this.pairAddress.hashCode();
        int iHashCode5 = this.poolLogoUrl.hashCode();
        List<CoinDetailPoolToken> list = this.poolTokenInfoList;
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (list == null ? 0 : list.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "CoinDetailPoolList(dexName=" + this.dexName + ", explorerUrl=" + this.explorerUrl + ", liquidity=" + this.liquidity + ", pairAddress=" + this.pairAddress + ", poolLogoUrl=" + this.poolLogoUrl + ", poolTokenInfoList=" + this.poolTokenInfoList + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.dexName);
        parcel.writeString(this.explorerUrl);
        parcel.writeString(this.liquidity);
        parcel.writeString(this.pairAddress);
        parcel.writeString(this.poolLogoUrl);
        List<CoinDetailPoolToken> list = this.poolTokenInfoList;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(list.size());
        Iterator<CoinDetailPoolToken> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dexlogic.main.market.bean.CoinDetailPoolList.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<CoinDetailPoolList> serializer() {
            return CoinDetailPoolList$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ CoinDetailPoolList(int i, String str, String str2, String str3, String str4, String str5, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.dexName = "";
        } else {
            this.dexName = str;
        }
        if ((i & 2) == 0) {
            this.explorerUrl = "";
        } else {
            this.explorerUrl = str2;
        }
        if ((i & 4) == 0) {
            this.liquidity = "";
        } else {
            this.liquidity = str3;
        }
        if ((i & 8) == 0) {
            this.pairAddress = "";
        } else {
            this.pairAddress = str4;
        }
        if ((i & 16) == 0) {
            this.poolLogoUrl = "";
        } else {
            this.poolLogoUrl = str5;
        }
        if ((i & 32) == 0) {
            this.poolTokenInfoList = null;
        } else {
            this.poolTokenInfoList = list;
        }
    }

    public static final /* synthetic */ void write$Self$OKDex_dex_impl(CoinDetailPoolList coinDetailPoolList, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) coinDetailPoolList.dexName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, coinDetailPoolList.dexName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) coinDetailPoolList.explorerUrl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, coinDetailPoolList.explorerUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) coinDetailPoolList.liquidity, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, coinDetailPoolList.liquidity);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) coinDetailPoolList.pairAddress, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, coinDetailPoolList.pairAddress);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) coinDetailPoolList.poolLogoUrl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, coinDetailPoolList.poolLogoUrl);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) && coinDetailPoolList.poolTokenInfoList == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, kSerializerArr[5], coinDetailPoolList.poolTokenInfoList);
    }

    public CoinDetailPoolList(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, List<CoinDetailPoolToken> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        this.dexName = str;
        this.explorerUrl = str2;
        this.liquidity = str3;
        this.pairAddress = str4;
        this.poolLogoUrl = str5;
        this.poolTokenInfoList = list;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0030: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r11v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r5v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0009: ARITH (r11v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r6v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0010: ARITH (r11v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r7v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0017: ARITH (r11v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r8v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001e: ARITH (r11v0 int) & (16 int) A[WRAPPED]) == (0 int)) ? (r9v0 java.lang.String) : (""))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0024: ARITH (r11v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r10v0 java.util.List))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List<com.okinc.business.dexlogic.main.market.bean.CoinDetailPoolToken>):void (m)] (LINE:27) call: com.okinc.business.dexlogic.main.market.bean.CoinDetailPoolList.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List):void type: THIS */
    public /* synthetic */ CoinDetailPoolList(String str, String str2, String str3, String str4, String str5, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) == 0 ? str5 : "", (i & 32) != 0 ? null : list);
    }
}
