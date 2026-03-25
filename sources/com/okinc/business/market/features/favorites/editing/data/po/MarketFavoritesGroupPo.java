package com.okinc.business.market.features.favorites.editing.data.po;

import android.os.Parcel;
import android.os.Parcelable;
import com.engagelab.privates.push.constants.MTPushConstants;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C59449zhJ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class MarketFavoritesGroupPo implements Parcelable {
    private static final String ALL_GROUP_NAME = "ALL";
    private static final String DEX_GROUP_NAME = "DEX";

    @SerializedName("favouriteList")
    private final List<FavoritesPo> favouriteList;

    @SerializedName("groupIndex")
    private final int groupIndex;

    @SerializedName("groupName")
    private final String groupName;

    @SerializedName("isHidden")
    private final boolean isHidden;

    @SerializedName("isPreset")
    private final boolean isPreset;

    @SerializedName("translatedGroupName")
    private final String translatedGroupName;
    private static final Activity Companion = new Activity(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<MarketFavoritesGroupPo> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<MarketFavoritesGroupPo> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MarketFavoritesGroupPo createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            int i = parcel.readInt();
            String string2 = parcel.readString();
            boolean z = parcel.readInt() != 0;
            boolean z2 = parcel.readInt() != 0;
            int i2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i2);
            for (int i3 = 0; i3 != i2; i3++) {
                arrayList.add(FavoritesPo.CREATOR.createFromParcel(parcel));
            }
            return new MarketFavoritesGroupPo(string, i, string2, z, z2, arrayList);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MarketFavoritesGroupPo[] newArray(int i) {
            return new MarketFavoritesGroupPo[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: com.okinc.business.market.features.favorites.editing.data.po.MarketFavoritesGroupPo */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MarketFavoritesGroupPo copy$default(MarketFavoritesGroupPo marketFavoritesGroupPo, String str, int i, String str2, boolean z, boolean z2, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = marketFavoritesGroupPo.groupName;
        }
        if ((i2 & 2) != 0) {
            i = marketFavoritesGroupPo.groupIndex;
        }
        int i3 = i;
        if ((i2 & 4) != 0) {
            str2 = marketFavoritesGroupPo.translatedGroupName;
        }
        String str3 = str2;
        if ((i2 & 8) != 0) {
            z = marketFavoritesGroupPo.isPreset;
        }
        boolean z3 = z;
        if ((i2 & 16) != 0) {
            z2 = marketFavoritesGroupPo.isHidden;
        }
        boolean z4 = z2;
        if ((i2 & 32) != 0) {
            list = marketFavoritesGroupPo.favouriteList;
        }
        return marketFavoritesGroupPo.copy(str, i3, str3, z3, z4, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.groupName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component2() {
        return this.groupIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.translatedGroupName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component4() {
        return this.isPreset;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component5() {
        return this.isHidden;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<FavoritesPo> component6() {
        return this.favouriteList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MarketFavoritesGroupPo copy(@NotNull String str, int i, String str2, boolean z, boolean z2, @NotNull List<FavoritesPo> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        return new MarketFavoritesGroupPo(str, i, str2, z, z2, list);
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
        if (!(obj instanceof MarketFavoritesGroupPo)) {
            return false;
        }
        MarketFavoritesGroupPo marketFavoritesGroupPo = (MarketFavoritesGroupPo) obj;
        return Intrinsics.EZpvd((Object) this.groupName, (Object) marketFavoritesGroupPo.groupName) && this.groupIndex == marketFavoritesGroupPo.groupIndex && Intrinsics.EZpvd((Object) this.translatedGroupName, (Object) marketFavoritesGroupPo.translatedGroupName) && this.isPreset == marketFavoritesGroupPo.isPreset && this.isHidden == marketFavoritesGroupPo.isHidden && Intrinsics.EZpvd(this.favouriteList, marketFavoritesGroupPo.favouriteList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<FavoritesPo> getFavouriteList() {
        return this.favouriteList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getGroupIndex() {
        return this.groupIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getGroupName() {
        return this.groupName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTranslatedGroupName() {
        return this.translatedGroupName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.groupName.hashCode();
        int iHashCode2 = Integer.hashCode(this.groupIndex);
        String str = this.translatedGroupName;
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + (str == null ? 0 : str.hashCode())) * 31) + Boolean.hashCode(this.isPreset)) * 31) + Boolean.hashCode(this.isHidden)) * 31) + this.favouriteList.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isHidden() {
        return this.isHidden;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isPreset() {
        return this.isPreset;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "MarketFavoritesGroupPo(groupName=" + this.groupName + ", groupIndex=" + this.groupIndex + ", translatedGroupName=" + this.translatedGroupName + ", isPreset=" + this.isPreset + ", isHidden=" + this.isHidden + ", favouriteList=" + this.favouriteList + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.groupName);
        parcel.writeInt(this.groupIndex);
        parcel.writeString(this.translatedGroupName);
        parcel.writeInt(this.isPreset ? 1 : 0);
        parcel.writeInt(this.isHidden ? 1 : 0);
        List<FavoritesPo> list = this.favouriteList;
        parcel.writeInt(list.size());
        Iterator<FavoritesPo> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
    }

    public MarketFavoritesGroupPo(@NotNull String str, int i, String str2, boolean z, boolean z2, @NotNull List<FavoritesPo> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.groupName = str;
        this.groupIndex = i;
        this.translatedGroupName = str2;
        this.isPreset = z;
        this.isHidden = z2;
        this.favouriteList = list;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0011: CONSTRUCTOR 
  (r8v0 java.lang.String)
  (wrap:int:0x0005: TERNARY null = ((wrap:int:0x0000: ARITH (r14v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r9v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r14v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r10v0 java.lang.String))
  (r11v0 boolean)
  (r12v0 boolean)
  (r13v0 java.util.List)
 A[MD:(java.lang.String, int, java.lang.String, boolean, boolean, java.util.List<com.okinc.business.market.features.favorites.editing.data.po.MarketFavoritesGroupPo$FavoritesPo>):void (m)] (LINE:10) call: com.okinc.business.market.features.favorites.editing.data.po.MarketFavoritesGroupPo.<init>(java.lang.String, int, java.lang.String, boolean, boolean, java.util.List):void type: THIS */
    public /* synthetic */ MarketFavoritesGroupPo(String str, int i, String str2, boolean z, boolean z2, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i2 & 2) != 0 ? 0 : i, (i2 & 4) != 0 ? null : str2, z, z2, list);
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.market.features.favorites.editing.data.po.MarketFavoritesGroupPo.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    public final boolean isAllGroup() {
        return C59449zhJ.gEmmrt(ALL_GROUP_NAME, this.groupName, true);
    }

    public final boolean isDexGroup() {
        return C59449zhJ.gEmmrt(DEX_GROUP_NAME, this.groupName, true);
    }

    public static final class FavoritesPo implements Parcelable {
        public static final int $stable = 0;
        public static final Parcelable.Creator<FavoritesPo> CREATOR = new Creator();

        @SerializedName(MTPushConstants.Operation.KEY_ALIAS)
        private final String alias;

        @SerializedName("chainId")
        private final String chainId;

        @SerializedName("displayId")
        private final String displayId;

        @SerializedName("expTime")
        private final String expTime;

        @SerializedName("instId")
        private final String instId;

        @SerializedName("instType")
        private final String instType;

        @SerializedName("tokenContractAddress")
        private final String tokenContractAddress;

        @SerializedName("tokenSymbol")
        private final String tokenSymbol;

        public static final class Creator implements Parcelable.Creator<FavoritesPo> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final FavoritesPo createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return new FavoritesPo(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final FavoritesPo[] newArray(int i) {
                return new FavoritesPo[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public FavoritesPo() {
            this(null, null, null, null, null, null, null, null, 255, null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component1() {
            return this.instId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component2() {
            return this.instType;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component3() {
            return this.alias;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component4() {
            return this.expTime;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component5() {
            return this.displayId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component6() {
            return this.chainId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component7() {
            return this.tokenContractAddress;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component8() {
            return this.tokenSymbol;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final FavoritesPo copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            Intrinsics.checkNotNullParameter(str5, "");
            Intrinsics.checkNotNullParameter(str6, "");
            Intrinsics.checkNotNullParameter(str7, "");
            Intrinsics.checkNotNullParameter(str8, "");
            return new FavoritesPo(str, str2, str3, str4, str5, str6, str7, str8);
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
            if (!(obj instanceof FavoritesPo)) {
                return false;
            }
            FavoritesPo favoritesPo = (FavoritesPo) obj;
            return Intrinsics.EZpvd((Object) this.instId, (Object) favoritesPo.instId) && Intrinsics.EZpvd((Object) this.instType, (Object) favoritesPo.instType) && Intrinsics.EZpvd((Object) this.alias, (Object) favoritesPo.alias) && Intrinsics.EZpvd((Object) this.expTime, (Object) favoritesPo.expTime) && Intrinsics.EZpvd((Object) this.displayId, (Object) favoritesPo.displayId) && Intrinsics.EZpvd((Object) this.chainId, (Object) favoritesPo.chainId) && Intrinsics.EZpvd((Object) this.tokenContractAddress, (Object) favoritesPo.tokenContractAddress) && Intrinsics.EZpvd((Object) this.tokenSymbol, (Object) favoritesPo.tokenSymbol);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getAlias() {
            return this.alias;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getChainId() {
            return this.chainId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getDisplayId() {
            return this.displayId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getExpTime() {
            return this.expTime;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getInstId() {
            return this.instId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getInstType() {
            return this.instType;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getTokenContractAddress() {
            return this.tokenContractAddress;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getTokenSymbol() {
            return this.tokenSymbol;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((((((((((((this.instId.hashCode() * 31) + this.instType.hashCode()) * 31) + this.alias.hashCode()) * 31) + this.expTime.hashCode()) * 31) + this.displayId.hashCode()) * 31) + this.chainId.hashCode()) * 31) + this.tokenContractAddress.hashCode()) * 31) + this.tokenSymbol.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "FavoritesPo(instId=" + this.instId + ", instType=" + this.instType + ", alias=" + this.alias + ", expTime=" + this.expTime + ", displayId=" + this.displayId + ", chainId=" + this.chainId + ", tokenContractAddress=" + this.tokenContractAddress + ", tokenSymbol=" + this.tokenSymbol + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeString(this.instId);
            parcel.writeString(this.instType);
            parcel.writeString(this.alias);
            parcel.writeString(this.expTime);
            parcel.writeString(this.displayId);
            parcel.writeString(this.chainId);
            parcel.writeString(this.tokenContractAddress);
            parcel.writeString(this.tokenSymbol);
        }

        public FavoritesPo(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            Intrinsics.checkNotNullParameter(str5, "");
            Intrinsics.checkNotNullParameter(str6, "");
            Intrinsics.checkNotNullParameter(str7, "");
            Intrinsics.checkNotNullParameter(str8, "");
            this.instId = str;
            this.instType = str2;
            this.alias = str3;
            this.expTime = str4;
            this.displayId = str5;
            this.chainId = str6;
            this.tokenContractAddress = str7;
            this.tokenSymbol = str8;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0049: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r18v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r10v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r18v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r11v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0012: ARITH (r18v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r12v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0019: ARITH (r18v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r13v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0020: ARITH (r18v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r14v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0027: ARITH (r18v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r15v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002e: ARITH (r18v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0036: ARITH (r18v0 int) & (128 int) A[WRAPPED]) == (0 int)) ? (r17v0 java.lang.String) : (""))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:53) call: com.okinc.business.market.features.favorites.editing.data.po.MarketFavoritesGroupPo.FavoritesPo.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
        public /* synthetic */ FavoritesPo(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7, (i & 128) == 0 ? str8 : "");
        }
    }
}
