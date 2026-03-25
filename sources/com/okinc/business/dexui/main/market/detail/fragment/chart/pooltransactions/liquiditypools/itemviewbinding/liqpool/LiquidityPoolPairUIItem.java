package com.okinc.business.dexui.main.market.detail.fragment.chart.pooltransactions.liquiditypools.itemviewbinding.liqpool;

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
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import o.kMU;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Serializable
public final class LiquidityPoolPairUIItem implements Parcelable, kMU {
    private final String dexName;
    private final String explorerUrl;
    private final boolean isExpanded;
    private final String liquidity;
    private final String pairAddress;
    private final String poolLogoUrl;
    private final List<PoolTokenInfoUIItem> poolTokenInfoList;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<LiquidityPoolPairUIItem> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, new ArrayListSerializer(PoolTokenInfoUIItem$$serializer.INSTANCE), null};

    public static final class Creator implements Parcelable.Creator<LiquidityPoolPairUIItem> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LiquidityPoolPairUIItem createFromParcel(Parcel parcel) {
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
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(PoolTokenInfoUIItem.CREATOR.createFromParcel(parcel));
                }
            }
            return new LiquidityPoolPairUIItem(string, string2, string3, string4, string5, arrayList, parcel.readInt() != 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LiquidityPoolPairUIItem[] newArray(int i) {
            return new LiquidityPoolPairUIItem[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: com.okinc.business.dexui.main.market.detail.fragment.chart.pooltransactions.liquiditypools.itemviewbinding.liqpool.LiquidityPoolPairUIItem */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LiquidityPoolPairUIItem copy$default(LiquidityPoolPairUIItem liquidityPoolPairUIItem, String str, String str2, String str3, String str4, String str5, List list, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = liquidityPoolPairUIItem.dexName;
        }
        if ((i & 2) != 0) {
            str2 = liquidityPoolPairUIItem.explorerUrl;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = liquidityPoolPairUIItem.liquidity;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = liquidityPoolPairUIItem.pairAddress;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            str5 = liquidityPoolPairUIItem.poolLogoUrl;
        }
        String str9 = str5;
        if ((i & 32) != 0) {
            list = liquidityPoolPairUIItem.poolTokenInfoList;
        }
        List list2 = list;
        if ((i & 64) != 0) {
            z = liquidityPoolPairUIItem.isExpanded;
        }
        return liquidityPoolPairUIItem.copy(str, str6, str7, str8, str9, list2, z);
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
    public final List<PoolTokenInfoUIItem> component6() {
        return this.poolTokenInfoList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component7() {
        return this.isExpanded;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiquidityPoolPairUIItem copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, List<PoolTokenInfoUIItem> list, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        return new LiquidityPoolPairUIItem(str, str2, str3, str4, str5, list, z);
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
        if (!(obj instanceof LiquidityPoolPairUIItem)) {
            return false;
        }
        LiquidityPoolPairUIItem liquidityPoolPairUIItem = (LiquidityPoolPairUIItem) obj;
        return Intrinsics.EZpvd((Object) this.dexName, (Object) liquidityPoolPairUIItem.dexName) && Intrinsics.EZpvd((Object) this.explorerUrl, (Object) liquidityPoolPairUIItem.explorerUrl) && Intrinsics.EZpvd((Object) this.liquidity, (Object) liquidityPoolPairUIItem.liquidity) && Intrinsics.EZpvd((Object) this.pairAddress, (Object) liquidityPoolPairUIItem.pairAddress) && Intrinsics.EZpvd((Object) this.poolLogoUrl, (Object) liquidityPoolPairUIItem.poolLogoUrl) && Intrinsics.EZpvd(this.poolTokenInfoList, liquidityPoolPairUIItem.poolTokenInfoList) && this.isExpanded == liquidityPoolPairUIItem.isExpanded;
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
    public final List<PoolTokenInfoUIItem> getPoolTokenInfoList() {
        return this.poolTokenInfoList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.dexName.hashCode();
        int iHashCode2 = this.explorerUrl.hashCode();
        int iHashCode3 = this.liquidity.hashCode();
        int iHashCode4 = this.pairAddress.hashCode();
        int iHashCode5 = this.poolLogoUrl.hashCode();
        List<PoolTokenInfoUIItem> list = this.poolTokenInfoList;
        return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (list == null ? 0 : list.hashCode())) * 31) + Boolean.hashCode(this.isExpanded);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isExpanded() {
        return this.isExpanded;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "LiquidityPoolPairUIItem(dexName=" + this.dexName + ", explorerUrl=" + this.explorerUrl + ", liquidity=" + this.liquidity + ", pairAddress=" + this.pairAddress + ", poolLogoUrl=" + this.poolLogoUrl + ", poolTokenInfoList=" + this.poolTokenInfoList + ", isExpanded=" + this.isExpanded + ")";
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
        List<PoolTokenInfoUIItem> list = this.poolTokenInfoList;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<PoolTokenInfoUIItem> it = list.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(parcel, i);
            }
        }
        parcel.writeInt(this.isExpanded ? 1 : 0);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dexui.main.market.detail.fragment.chart.pooltransactions.liquiditypools.itemviewbinding.liqpool.LiquidityPoolPairUIItem.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<LiquidityPoolPairUIItem> serializer() {
            return LiquidityPoolPairUIItem$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ LiquidityPoolPairUIItem(int i, String str, String str2, String str3, String str4, String str5, List list, boolean z, SerializationConstructorMarker serializationConstructorMarker) {
        if (63 != (i & 63)) {
            PluginExceptionsKt.throwMissingFieldException(i, 63, LiquidityPoolPairUIItem$$serializer.INSTANCE.getDescriptor());
        }
        this.dexName = str;
        this.explorerUrl = str2;
        this.liquidity = str3;
        this.pairAddress = str4;
        this.poolLogoUrl = str5;
        this.poolTokenInfoList = list;
        if ((i & 64) == 0) {
            this.isExpanded = false;
        } else {
            this.isExpanded = z;
        }
    }

    public static final /* synthetic */ void write$Self$OKDex_dex_impl(LiquidityPoolPairUIItem liquidityPoolPairUIItem, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeStringElement(serialDescriptor, 0, liquidityPoolPairUIItem.dexName);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, liquidityPoolPairUIItem.explorerUrl);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, liquidityPoolPairUIItem.liquidity);
        compositeEncoder.encodeStringElement(serialDescriptor, 3, liquidityPoolPairUIItem.pairAddress);
        compositeEncoder.encodeStringElement(serialDescriptor, 4, liquidityPoolPairUIItem.poolLogoUrl);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, kSerializerArr[5], liquidityPoolPairUIItem.poolTokenInfoList);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || liquidityPoolPairUIItem.isExpanded) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 6, liquidityPoolPairUIItem.isExpanded);
        }
    }

    @Override // o.kMU
    public boolean compareContent(@NotNull kMU kmu) {
        return kMU.TaskDescription.AEQbTJ(this, kmu);
    }

    @Override // o.kMU
    public Object getChangePayload(@NotNull kMU kmu) {
        return kMU.TaskDescription.EZpvd(this, kmu);
    }

    public LiquidityPoolPairUIItem(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, List<PoolTokenInfoUIItem> list, boolean z) {
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
        this.isExpanded = z;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (r10v0 java.lang.String)
  (r11v0 java.lang.String)
  (r12v0 java.lang.String)
  (r13v0 java.lang.String)
  (r14v0 java.lang.String)
  (r15v0 java.util.List)
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r17v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? false : (r16v0 boolean))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List<com.okinc.business.dexui.main.market.detail.fragment.chart.pooltransactions.liquiditypools.itemviewbinding.liqpool.PoolTokenInfoUIItem>, boolean):void (m)] (LINE:13) call: com.okinc.business.dexui.main.market.detail.fragment.chart.pooltransactions.liquiditypools.itemviewbinding.liqpool.LiquidityPoolPairUIItem.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, boolean):void type: THIS */
    public /* synthetic */ LiquidityPoolPairUIItem(String str, String str2, String str3, String str4, String str5, List list, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, str5, list, (i & 64) != 0 ? false : z);
    }

    @Override // o.kMU
    public boolean compareId(@NotNull kMU kmu) {
        Intrinsics.checkNotNullParameter(kmu, "");
        LiquidityPoolPairUIItem liquidityPoolPairUIItem = kmu instanceof LiquidityPoolPairUIItem ? (LiquidityPoolPairUIItem) kmu : null;
        return Intrinsics.EZpvd((Object) this.dexName, (Object) (liquidityPoolPairUIItem != null ? liquidityPoolPairUIItem.dexName : null));
    }
}
