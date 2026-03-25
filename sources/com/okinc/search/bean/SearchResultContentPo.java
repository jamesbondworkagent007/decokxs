package com.okinc.search.bean;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import com.huawei.hms.push.constant.RemoteMessageConst;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C56444yFp;
import o.InterfaceC56445yFq;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchResultContentPo implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<SearchResultContentPo> CREATOR = new Creator();

    @SerializedName("contentDataList")
    private final List<SearchResultContentItemPo> contentDataList;

    @SerializedName("kolDataList")
    private final List<SearchResultContentKolPo> kolDataList;

    @SerializedName("queryInfo")
    private final SearchResultContentQueryInfoPo queryInfo;

    public static final class Creator implements Parcelable.Creator<SearchResultContentPo> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SearchResultContentPo createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "");
            ArrayList arrayList2 = null;
            SearchResultContentQueryInfoPo searchResultContentQueryInfoPoCreateFromParcel = parcel.readInt() == 0 ? null : SearchResultContentQueryInfoPo.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(SearchResultContentKolPo.CREATOR.createFromParcel(parcel));
                }
            }
            if (parcel.readInt() != 0) {
                int i3 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(i3);
                for (int i4 = 0; i4 != i3; i4++) {
                    arrayList3.add(SearchResultContentItemPo.CREATOR.createFromParcel(parcel));
                }
                arrayList2 = arrayList3;
            }
            return new SearchResultContentPo(searchResultContentQueryInfoPoCreateFromParcel, arrayList, arrayList2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SearchResultContentPo[] newArray(int i) {
            return new SearchResultContentPo[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public SearchResultContentPo() {
        this(null, null, null, 7, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.search.bean.SearchResultContentPo */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SearchResultContentPo copy$default(SearchResultContentPo searchResultContentPo, SearchResultContentQueryInfoPo searchResultContentQueryInfoPo, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            searchResultContentQueryInfoPo = searchResultContentPo.queryInfo;
        }
        if ((i & 2) != 0) {
            list = searchResultContentPo.kolDataList;
        }
        if ((i & 4) != 0) {
            list2 = searchResultContentPo.contentDataList;
        }
        return searchResultContentPo.copy(searchResultContentQueryInfoPo, list, list2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SearchResultContentQueryInfoPo component1() {
        return this.queryInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<SearchResultContentKolPo> component2() {
        return this.kolDataList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<SearchResultContentItemPo> component3() {
        return this.contentDataList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SearchResultContentPo copy(SearchResultContentQueryInfoPo searchResultContentQueryInfoPo, List<SearchResultContentKolPo> list, List<SearchResultContentItemPo> list2) {
        return new SearchResultContentPo(searchResultContentQueryInfoPo, list, list2);
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
        if (!(obj instanceof SearchResultContentPo)) {
            return false;
        }
        SearchResultContentPo searchResultContentPo = (SearchResultContentPo) obj;
        return Intrinsics.EZpvd(this.queryInfo, searchResultContentPo.queryInfo) && Intrinsics.EZpvd(this.kolDataList, searchResultContentPo.kolDataList) && Intrinsics.EZpvd(this.contentDataList, searchResultContentPo.contentDataList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<SearchResultContentItemPo> getContentDataList() {
        return this.contentDataList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<SearchResultContentKolPo> getKolDataList() {
        return this.kolDataList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SearchResultContentQueryInfoPo getQueryInfo() {
        return this.queryInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        SearchResultContentQueryInfoPo searchResultContentQueryInfoPo = this.queryInfo;
        int iHashCode = searchResultContentQueryInfoPo == null ? 0 : searchResultContentQueryInfoPo.hashCode();
        List<SearchResultContentKolPo> list = this.kolDataList;
        int iHashCode2 = list == null ? 0 : list.hashCode();
        List<SearchResultContentItemPo> list2 = this.contentDataList;
        return (((iHashCode * 31) + iHashCode2) * 31) + (list2 != null ? list2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SearchResultContentPo(queryInfo=" + this.queryInfo + ", kolDataList=" + this.kolDataList + ", contentDataList=" + this.contentDataList + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        SearchResultContentQueryInfoPo searchResultContentQueryInfoPo = this.queryInfo;
        if (searchResultContentQueryInfoPo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            searchResultContentQueryInfoPo.writeToParcel(parcel, i);
        }
        List<SearchResultContentKolPo> list = this.kolDataList;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<SearchResultContentKolPo> it = list.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(parcel, i);
            }
        }
        List<SearchResultContentItemPo> list2 = this.contentDataList;
        if (list2 == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(list2.size());
        Iterator<SearchResultContentItemPo> it2 = list2.iterator();
        while (it2.hasNext()) {
            it2.next().writeToParcel(parcel, i);
        }
    }

    public SearchResultContentPo(SearchResultContentQueryInfoPo searchResultContentQueryInfoPo, List<SearchResultContentKolPo> list, List<SearchResultContentItemPo> list2) {
        this.queryInfo = searchResultContentQueryInfoPo;
        this.kolDataList = list;
        this.contentDataList = list2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (wrap:com.okinc.search.bean.SearchResultContentPo$SearchResultContentQueryInfoPo:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.search.bean.SearchResultContentPo$SearchResultContentQueryInfoPo) : (r2v0 com.okinc.search.bean.SearchResultContentPo$SearchResultContentQueryInfoPo))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r3v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x000b: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r4v0 java.util.List))
 A[MD:(com.okinc.search.bean.SearchResultContentPo$SearchResultContentQueryInfoPo, java.util.List<com.okinc.search.bean.SearchResultContentPo$SearchResultContentKolPo>, java.util.List<com.okinc.search.bean.SearchResultContentPo$SearchResultContentItemPo>):void (m)] (LINE:14) call: com.okinc.search.bean.SearchResultContentPo.<init>(com.okinc.search.bean.SearchResultContentPo$SearchResultContentQueryInfoPo, java.util.List, java.util.List):void type: THIS */
    public /* synthetic */ SearchResultContentPo(SearchResultContentQueryInfoPo searchResultContentQueryInfoPo, List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : searchResultContentQueryInfoPo, (i & 2) != 0 ? null : list, (i & 4) != 0 ? null : list2);
    }

    public static final class SearchResultContentQueryInfoPo implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<SearchResultContentQueryInfoPo> CREATOR = new Creator();

        @SerializedName("coinName")
        private final List<String> coinName;

        @SerializedName("queryName")
        private final String queryName;

        @SerializedName("type")
        private final int type;

        public static final class Creator implements Parcelable.Creator<SearchResultContentQueryInfoPo> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SearchResultContentQueryInfoPo createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return new SearchResultContentQueryInfoPo(parcel.readInt(), parcel.readString(), parcel.createStringArrayList());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SearchResultContentQueryInfoPo[] newArray(int i) {
                return new SearchResultContentQueryInfoPo[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.search.bean.SearchResultContentPo$SearchResultContentQueryInfoPo */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ SearchResultContentQueryInfoPo copy$default(SearchResultContentQueryInfoPo searchResultContentQueryInfoPo, int i, String str, List list, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = searchResultContentQueryInfoPo.type;
            }
            if ((i2 & 2) != 0) {
                str = searchResultContentQueryInfoPo.queryName;
            }
            if ((i2 & 4) != 0) {
                list = searchResultContentQueryInfoPo.coinName;
            }
            return searchResultContentQueryInfoPo.copy(i, str, list);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int component1() {
            return this.type;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component2() {
            return this.queryName;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final List<String> component3() {
            return this.coinName;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final SearchResultContentQueryInfoPo copy(int i, String str, List<String> list) {
            return new SearchResultContentQueryInfoPo(i, str, list);
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
            if (!(obj instanceof SearchResultContentQueryInfoPo)) {
                return false;
            }
            SearchResultContentQueryInfoPo searchResultContentQueryInfoPo = (SearchResultContentQueryInfoPo) obj;
            return this.type == searchResultContentQueryInfoPo.type && Intrinsics.EZpvd((Object) this.queryName, (Object) searchResultContentQueryInfoPo.queryName) && Intrinsics.EZpvd(this.coinName, searchResultContentQueryInfoPo.coinName);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final List<String> getCoinName() {
            return this.coinName;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getQueryName() {
            return this.queryName;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int getType() {
            return this.type;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = Integer.hashCode(this.type);
            String str = this.queryName;
            int iHashCode2 = str == null ? 0 : str.hashCode();
            List<String> list = this.coinName;
            return (((iHashCode * 31) + iHashCode2) * 31) + (list != null ? list.hashCode() : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "SearchResultContentQueryInfoPo(type=" + this.type + ", queryName=" + this.queryName + ", coinName=" + this.coinName + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeInt(this.type);
            parcel.writeString(this.queryName);
            parcel.writeStringList(this.coinName);
        }

        public SearchResultContentQueryInfoPo(int i, String str, List<String> list) {
            this.type = i;
            this.queryName = str;
            this.coinName = list;
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* JADX INFO: loaded from: classes16.dex */
        public static final class QueryInfoType {
            private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
            private static final /* synthetic */ QueryInfoType[] $VALUES;
            private final int type;
            public static final QueryInfoType INSIGHT = new QueryInfoType("INSIGHT", 0, 1);
            public static final QueryInfoType TWITTER = new QueryInfoType("TWITTER", 1, 2);
            public static final QueryInfoType Kol = new QueryInfoType("Kol", 2, 3);

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            private static final /* synthetic */ QueryInfoType[] $values() {
                return new QueryInfoType[]{INSIGHT, TWITTER, Kol};
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static InterfaceC56445yFq<QueryInfoType> getEntries() {
                return $ENTRIES;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final int getType() {
                return this.type;
            }

            private QueryInfoType(String str, int i, int i2) {
                this.type = i2;
            }

            static {
                QueryInfoType[] queryInfoTypeArr$values = $values();
                $VALUES = queryInfoTypeArr$values;
                $ENTRIES = C56444yFp.AEQbTJ(queryInfoTypeArr$values);
            }

            public static QueryInfoType valueOf(String str) {
                return (QueryInfoType) Enum.valueOf(QueryInfoType.class, str);
            }

            public static QueryInfoType[] values() {
                return (QueryInfoType[]) $VALUES.clone();
            }
        }
    }

    public static final class SearchResultContentKolPo implements Parcelable {
        public static final int $stable = 0;
        public static final Parcelable.Creator<SearchResultContentKolPo> CREATOR = new Creator();

        @SerializedName("bio")
        private final String bio;

        @SerializedName("dataStr")
        private final String dataStr;

        @SerializedName("followerCount")
        private final Integer followerCount;

        @SerializedName("kolId")
        private final String kolId;

        @SerializedName("liveStatus")
        private final String liveStatus;

        @SerializedName("nickName")
        private final String nickName;

        @SerializedName("officialStatus")
        private final String officialStatus;

        @SerializedName("portrait")
        private final String portrait;

        @SerializedName("shareCode")
        private final String shareCode;

        @SerializedName("translatedBio")
        private final String translatedBio;

        public static final class Creator implements Parcelable.Creator<SearchResultContentKolPo> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SearchResultContentKolPo createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return new SearchResultContentKolPo(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SearchResultContentKolPo[] newArray(int i) {
                return new SearchResultContentKolPo[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component1() {
            return this.nickName;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component10() {
            return this.shareCode;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component2() {
            return this.kolId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Integer component3() {
            return this.followerCount;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component4() {
            return this.portrait;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component5() {
            return this.bio;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component6() {
            return this.translatedBio;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component7() {
            return this.dataStr;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component8() {
            return this.officialStatus;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component9() {
            return this.liveStatus;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final SearchResultContentKolPo copy(String str, @NotNull String str2, Integer num, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
            Intrinsics.checkNotNullParameter(str2, "");
            return new SearchResultContentKolPo(str, str2, num, str3, str4, str5, str6, str7, str8, str9);
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
            if (!(obj instanceof SearchResultContentKolPo)) {
                return false;
            }
            SearchResultContentKolPo searchResultContentKolPo = (SearchResultContentKolPo) obj;
            return Intrinsics.EZpvd((Object) this.nickName, (Object) searchResultContentKolPo.nickName) && Intrinsics.EZpvd((Object) this.kolId, (Object) searchResultContentKolPo.kolId) && Intrinsics.EZpvd(this.followerCount, searchResultContentKolPo.followerCount) && Intrinsics.EZpvd((Object) this.portrait, (Object) searchResultContentKolPo.portrait) && Intrinsics.EZpvd((Object) this.bio, (Object) searchResultContentKolPo.bio) && Intrinsics.EZpvd((Object) this.translatedBio, (Object) searchResultContentKolPo.translatedBio) && Intrinsics.EZpvd((Object) this.dataStr, (Object) searchResultContentKolPo.dataStr) && Intrinsics.EZpvd((Object) this.officialStatus, (Object) searchResultContentKolPo.officialStatus) && Intrinsics.EZpvd((Object) this.liveStatus, (Object) searchResultContentKolPo.liveStatus) && Intrinsics.EZpvd((Object) this.shareCode, (Object) searchResultContentKolPo.shareCode);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getBio() {
            return this.bio;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getDataStr() {
            return this.dataStr;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Integer getFollowerCount() {
            return this.followerCount;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getKolId() {
            return this.kolId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getLiveStatus() {
            return this.liveStatus;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getNickName() {
            return this.nickName;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getOfficialStatus() {
            return this.officialStatus;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getPortrait() {
            return this.portrait;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getShareCode() {
            return this.shareCode;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getTranslatedBio() {
            return this.translatedBio;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            String str = this.nickName;
            int iHashCode = str == null ? 0 : str.hashCode();
            int iHashCode2 = this.kolId.hashCode();
            Integer num = this.followerCount;
            int iHashCode3 = num == null ? 0 : num.hashCode();
            String str2 = this.portrait;
            int iHashCode4 = str2 == null ? 0 : str2.hashCode();
            String str3 = this.bio;
            int iHashCode5 = str3 == null ? 0 : str3.hashCode();
            String str4 = this.translatedBio;
            int iHashCode6 = str4 == null ? 0 : str4.hashCode();
            String str5 = this.dataStr;
            int iHashCode7 = str5 == null ? 0 : str5.hashCode();
            String str6 = this.officialStatus;
            int iHashCode8 = str6 == null ? 0 : str6.hashCode();
            String str7 = this.liveStatus;
            int iHashCode9 = str7 == null ? 0 : str7.hashCode();
            String str8 = this.shareCode;
            return (((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + (str8 != null ? str8.hashCode() : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "SearchResultContentKolPo(nickName=" + this.nickName + ", kolId=" + this.kolId + ", followerCount=" + this.followerCount + ", portrait=" + this.portrait + ", bio=" + this.bio + ", translatedBio=" + this.translatedBio + ", dataStr=" + this.dataStr + ", officialStatus=" + this.officialStatus + ", liveStatus=" + this.liveStatus + ", shareCode=" + this.shareCode + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            int iIntValue;
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeString(this.nickName);
            parcel.writeString(this.kolId);
            Integer num = this.followerCount;
            if (num == null) {
                iIntValue = 0;
            } else {
                parcel.writeInt(1);
                iIntValue = num.intValue();
            }
            parcel.writeInt(iIntValue);
            parcel.writeString(this.portrait);
            parcel.writeString(this.bio);
            parcel.writeString(this.translatedBio);
            parcel.writeString(this.dataStr);
            parcel.writeString(this.officialStatus);
            parcel.writeString(this.liveStatus);
            parcel.writeString(this.shareCode);
        }

        public SearchResultContentKolPo(String str, @NotNull String str2, Integer num, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
            Intrinsics.checkNotNullParameter(str2, "");
            this.nickName = str;
            this.kolId = str2;
            this.followerCount = num;
            this.portrait = str3;
            this.bio = str4;
            this.translatedBio = str5;
            this.dataStr = str6;
            this.officialStatus = str7;
            this.liveStatus = str8;
            this.shareCode = str9;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0044: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r24v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r14v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0009: ARITH (r24v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r15v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0010: ARITH (r24v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r16v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001d: ARITH (r24v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r17v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0025: ARITH (r24v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r18v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002d: ARITH (r24v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r19v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0035: ARITH (r24v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r20v0 java.lang.String))
  (r21v0 java.lang.String)
  (r22v0 java.lang.String)
  (r23v0 java.lang.String)
 A[MD:(java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:77) call: com.okinc.search.bean.SearchResultContentPo.SearchResultContentKolPo.<init>(java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
        public /* synthetic */ SearchResultContentKolPo(String str, String str2, Integer num, String str3, String str4, String str5, String str6, String str7, String str8, String str9, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? 0 : num, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? "" : str4, (i & 32) != 0 ? "" : str5, (i & 64) != 0 ? "" : str6, str7, str8, str9);
        }
    }

    public static final class SearchResultContentItemPo implements Parcelable {
        public static final String SOURCE_PLATFORM_OKX = "ok";
        public static final String SOURCE_PLATFORM_TWITTER = "twitter";

        @SerializedName("author")
        private final ContentAuthorPo author;

        @SerializedName("content")
        private final String content;

        @SerializedName("contentId")
        private final String contentId;

        @SerializedName("dataStr")
        private final String dataStr;

        @SerializedName("enTitle")
        private final String enTitle;

        @SerializedName("formatType")
        private final int formatType;

        @SerializedName("imageList")
        private final List<ContentImagePo> imageList;

        @SerializedName("isLiked")
        private final boolean isLiked;

        @SerializedName("likeCount")
        private final int likeCount;

        @SerializedName("publishTime")
        private final long publishTime;

        @SerializedName("referencedContent")
        private final ReferenceContentPo referencedContent;

        @SerializedName("retweetAuthorInfo")
        private final List<ContentAuthorPo> retweetAuthorInfo;

        @SerializedName("retweetTotal")
        private final int retweetTotal;

        @SerializedName("shareUrl")
        private final String shareUrl;

        @SerializedName("sourcePlatform")
        private final String sourcePlatform;

        @SerializedName("title")
        private final String title;

        @SerializedName("tokens")
        private final List<ContentTokenPo> tokens;

        @SerializedName("translatedContent")
        private final String translatedContent;

        @SerializedName("viewCount")
        private final int viewCount;
        public static final Application Companion = new Application(null);
        public static final int $stable = 8;
        public static final Parcelable.Creator<SearchResultContentItemPo> CREATOR = new Creator();

        public static final class Creator implements Parcelable.Creator<SearchResultContentItemPo> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SearchResultContentItemPo createFromParcel(Parcel parcel) {
                ArrayList arrayList;
                ArrayList arrayList2;
                String str;
                ArrayList arrayList3;
                int i;
                Intrinsics.checkNotNullParameter(parcel, "");
                ContentAuthorPo contentAuthorPoCreateFromParcel = parcel.readInt() == 0 ? null : ContentAuthorPo.CREATOR.createFromParcel(parcel);
                String string = parcel.readString();
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                int i2 = parcel.readInt();
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int i3 = parcel.readInt();
                    arrayList = new ArrayList(i3);
                    for (int i4 = 0; i4 != i3; i4++) {
                        arrayList.add(ContentImagePo.CREATOR.createFromParcel(parcel));
                    }
                }
                boolean z = parcel.readInt() != 0;
                int i5 = parcel.readInt();
                long j = parcel.readLong();
                ReferenceContentPo referenceContentPoCreateFromParcel = parcel.readInt() == 0 ? null : ReferenceContentPo.CREATOR.createFromParcel(parcel);
                if (parcel.readInt() == 0) {
                    arrayList2 = null;
                } else {
                    int i6 = parcel.readInt();
                    arrayList2 = new ArrayList(i6);
                    for (int i7 = 0; i7 != i6; i7++) {
                        arrayList2.add(ContentAuthorPo.CREATOR.createFromParcel(parcel));
                    }
                }
                int i8 = parcel.readInt();
                String string4 = parcel.readString();
                String string5 = parcel.readString();
                String string6 = parcel.readString();
                if (parcel.readInt() == 0) {
                    i = i8;
                    str = string4;
                    arrayList3 = null;
                } else {
                    int i9 = parcel.readInt();
                    str = string4;
                    arrayList3 = new ArrayList(i9);
                    i = i8;
                    int i10 = 0;
                    while (i10 != i9) {
                        arrayList3.add(ContentTokenPo.CREATOR.createFromParcel(parcel));
                        i10++;
                        i9 = i9;
                    }
                }
                return new SearchResultContentItemPo(contentAuthorPoCreateFromParcel, string, string2, string3, i2, arrayList, z, i5, j, referenceContentPoCreateFromParcel, arrayList2, i, str, string5, string6, arrayList3, parcel.readString(), parcel.readString(), parcel.readInt());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SearchResultContentItemPo[] newArray(int i) {
                return new SearchResultContentItemPo[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ContentAuthorPo component1() {
            return this.author;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ReferenceContentPo component10() {
            return this.referencedContent;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final List<ContentAuthorPo> component11() {
            return this.retweetAuthorInfo;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int component12() {
            return this.retweetTotal;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component13() {
            return this.shareUrl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component14() {
            return this.sourcePlatform;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component15() {
            return this.title;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final List<ContentTokenPo> component16() {
            return this.tokens;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component17() {
            return this.translatedContent;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component18() {
            return this.dataStr;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int component19() {
            return this.viewCount;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component2() {
            return this.content;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component3() {
            return this.contentId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component4() {
            return this.enTitle;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int component5() {
            return this.formatType;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final List<ContentImagePo> component6() {
            return this.imageList;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean component7() {
            return this.isLiked;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int component8() {
            return this.likeCount;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final long component9() {
            return this.publishTime;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final SearchResultContentItemPo copy(ContentAuthorPo contentAuthorPo, @NotNull String str, @NotNull String str2, String str3, int i, List<ContentImagePo> list, boolean z, int i2, long j, ReferenceContentPo referenceContentPo, List<ContentAuthorPo> list2, int i3, String str4, String str5, String str6, List<ContentTokenPo> list3, String str7, String str8, int i4) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            return new SearchResultContentItemPo(contentAuthorPo, str, str2, str3, i, list, z, i2, j, referenceContentPo, list2, i3, str4, str5, str6, list3, str7, str8, i4);
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
            if (!(obj instanceof SearchResultContentItemPo)) {
                return false;
            }
            SearchResultContentItemPo searchResultContentItemPo = (SearchResultContentItemPo) obj;
            return Intrinsics.EZpvd(this.author, searchResultContentItemPo.author) && Intrinsics.EZpvd((Object) this.content, (Object) searchResultContentItemPo.content) && Intrinsics.EZpvd((Object) this.contentId, (Object) searchResultContentItemPo.contentId) && Intrinsics.EZpvd((Object) this.enTitle, (Object) searchResultContentItemPo.enTitle) && this.formatType == searchResultContentItemPo.formatType && Intrinsics.EZpvd(this.imageList, searchResultContentItemPo.imageList) && this.isLiked == searchResultContentItemPo.isLiked && this.likeCount == searchResultContentItemPo.likeCount && this.publishTime == searchResultContentItemPo.publishTime && Intrinsics.EZpvd(this.referencedContent, searchResultContentItemPo.referencedContent) && Intrinsics.EZpvd(this.retweetAuthorInfo, searchResultContentItemPo.retweetAuthorInfo) && this.retweetTotal == searchResultContentItemPo.retweetTotal && Intrinsics.EZpvd((Object) this.shareUrl, (Object) searchResultContentItemPo.shareUrl) && Intrinsics.EZpvd((Object) this.sourcePlatform, (Object) searchResultContentItemPo.sourcePlatform) && Intrinsics.EZpvd((Object) this.title, (Object) searchResultContentItemPo.title) && Intrinsics.EZpvd(this.tokens, searchResultContentItemPo.tokens) && Intrinsics.EZpvd((Object) this.translatedContent, (Object) searchResultContentItemPo.translatedContent) && Intrinsics.EZpvd((Object) this.dataStr, (Object) searchResultContentItemPo.dataStr) && this.viewCount == searchResultContentItemPo.viewCount;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ContentAuthorPo getAuthor() {
            return this.author;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getContent() {
            return this.content;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getContentId() {
            return this.contentId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getDataStr() {
            return this.dataStr;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getEnTitle() {
            return this.enTitle;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int getFormatType() {
            return this.formatType;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final List<ContentImagePo> getImageList() {
            return this.imageList;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int getLikeCount() {
            return this.likeCount;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final long getPublishTime() {
            return this.publishTime;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ReferenceContentPo getReferencedContent() {
            return this.referencedContent;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final List<ContentAuthorPo> getRetweetAuthorInfo() {
            return this.retweetAuthorInfo;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int getRetweetTotal() {
            return this.retweetTotal;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getShareUrl() {
            return this.shareUrl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getSourcePlatform() {
            return this.sourcePlatform;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getTitle() {
            return this.title;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final List<ContentTokenPo> getTokens() {
            return this.tokens;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getTranslatedContent() {
            return this.translatedContent;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int getViewCount() {
            return this.viewCount;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            ContentAuthorPo contentAuthorPo = this.author;
            int iHashCode = contentAuthorPo == null ? 0 : contentAuthorPo.hashCode();
            int iHashCode2 = this.content.hashCode();
            int iHashCode3 = this.contentId.hashCode();
            String str = this.enTitle;
            int iHashCode4 = str == null ? 0 : str.hashCode();
            int iHashCode5 = Integer.hashCode(this.formatType);
            List<ContentImagePo> list = this.imageList;
            int iHashCode6 = list == null ? 0 : list.hashCode();
            int iHashCode7 = Boolean.hashCode(this.isLiked);
            int iHashCode8 = Integer.hashCode(this.likeCount);
            int iHashCode9 = Long.hashCode(this.publishTime);
            ReferenceContentPo referenceContentPo = this.referencedContent;
            int iHashCode10 = referenceContentPo == null ? 0 : referenceContentPo.hashCode();
            List<ContentAuthorPo> list2 = this.retweetAuthorInfo;
            int iHashCode11 = list2 == null ? 0 : list2.hashCode();
            int iHashCode12 = Integer.hashCode(this.retweetTotal);
            String str2 = this.shareUrl;
            int iHashCode13 = str2 == null ? 0 : str2.hashCode();
            String str3 = this.sourcePlatform;
            int iHashCode14 = str3 == null ? 0 : str3.hashCode();
            String str4 = this.title;
            int iHashCode15 = str4 == null ? 0 : str4.hashCode();
            List<ContentTokenPo> list3 = this.tokens;
            int iHashCode16 = list3 == null ? 0 : list3.hashCode();
            String str5 = this.translatedContent;
            int iHashCode17 = str5 == null ? 0 : str5.hashCode();
            String str6 = this.dataStr;
            return (((((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + (str6 == null ? 0 : str6.hashCode())) * 31) + Integer.hashCode(this.viewCount);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean isLiked() {
            return this.isLiked;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "SearchResultContentItemPo(author=" + this.author + ", content=" + this.content + ", contentId=" + this.contentId + ", enTitle=" + this.enTitle + ", formatType=" + this.formatType + ", imageList=" + this.imageList + ", isLiked=" + this.isLiked + ", likeCount=" + this.likeCount + ", publishTime=" + this.publishTime + ", referencedContent=" + this.referencedContent + ", retweetAuthorInfo=" + this.retweetAuthorInfo + ", retweetTotal=" + this.retweetTotal + ", shareUrl=" + this.shareUrl + ", sourcePlatform=" + this.sourcePlatform + ", title=" + this.title + ", tokens=" + this.tokens + ", translatedContent=" + this.translatedContent + ", dataStr=" + this.dataStr + ", viewCount=" + this.viewCount + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            ContentAuthorPo contentAuthorPo = this.author;
            if (contentAuthorPo == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                contentAuthorPo.writeToParcel(parcel, i);
            }
            parcel.writeString(this.content);
            parcel.writeString(this.contentId);
            parcel.writeString(this.enTitle);
            parcel.writeInt(this.formatType);
            List<ContentImagePo> list = this.imageList;
            if (list == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeInt(list.size());
                Iterator<ContentImagePo> it = list.iterator();
                while (it.hasNext()) {
                    it.next().writeToParcel(parcel, i);
                }
            }
            parcel.writeInt(this.isLiked ? 1 : 0);
            parcel.writeInt(this.likeCount);
            parcel.writeLong(this.publishTime);
            ReferenceContentPo referenceContentPo = this.referencedContent;
            if (referenceContentPo == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                referenceContentPo.writeToParcel(parcel, i);
            }
            List<ContentAuthorPo> list2 = this.retweetAuthorInfo;
            if (list2 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeInt(list2.size());
                Iterator<ContentAuthorPo> it2 = list2.iterator();
                while (it2.hasNext()) {
                    it2.next().writeToParcel(parcel, i);
                }
            }
            parcel.writeInt(this.retweetTotal);
            parcel.writeString(this.shareUrl);
            parcel.writeString(this.sourcePlatform);
            parcel.writeString(this.title);
            List<ContentTokenPo> list3 = this.tokens;
            if (list3 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeInt(list3.size());
                Iterator<ContentTokenPo> it3 = list3.iterator();
                while (it3.hasNext()) {
                    it3.next().writeToParcel(parcel, i);
                }
            }
            parcel.writeString(this.translatedContent);
            parcel.writeString(this.dataStr);
            parcel.writeInt(this.viewCount);
        }

        public SearchResultContentItemPo(ContentAuthorPo contentAuthorPo, @NotNull String str, @NotNull String str2, String str3, int i, List<ContentImagePo> list, boolean z, int i2, long j, ReferenceContentPo referenceContentPo, List<ContentAuthorPo> list2, int i3, String str4, String str5, String str6, List<ContentTokenPo> list3, String str7, String str8, int i4) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            this.author = contentAuthorPo;
            this.content = str;
            this.contentId = str2;
            this.enTitle = str3;
            this.formatType = i;
            this.imageList = list;
            this.isLiked = z;
            this.likeCount = i2;
            this.publishTime = j;
            this.referencedContent = referenceContentPo;
            this.retweetAuthorInfo = list2;
            this.retweetTotal = i3;
            this.shareUrl = str4;
            this.sourcePlatform = str5;
            this.title = str6;
            this.tokens = list3;
            this.translatedContent = str7;
            this.dataStr = str8;
            this.viewCount = i4;
        }

        public static final class Application {
            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.search.bean.SearchResultContentPo.SearchResultContentItemPo.Application.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Application() {
            }
        }

        public static final class ReferenceContentPo implements Parcelable {
            public static final int $stable = 8;
            public static final Parcelable.Creator<ReferenceContentPo> CREATOR = new Creator();

            @SerializedName("author")
            private final ContentAuthorPo author;

            @SerializedName("content")
            private final String content;

            @SerializedName("contentId")
            private final String contentId;

            @SerializedName("imageList")
            private final List<ContentImagePo> imageList;

            @SerializedName("publishTime")
            private final long publishTime;

            @SerializedName("translatedContent")
            private final String translatedContent;

            public static final class Creator implements Parcelable.Creator<ReferenceContentPo> {
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final ReferenceContentPo createFromParcel(Parcel parcel) {
                    ArrayList arrayList;
                    Intrinsics.checkNotNullParameter(parcel, "");
                    String string = parcel.readString();
                    String string2 = parcel.readString();
                    String string3 = parcel.readString();
                    if (parcel.readInt() == 0) {
                        arrayList = null;
                    } else {
                        int i = parcel.readInt();
                        arrayList = new ArrayList(i);
                        for (int i2 = 0; i2 != i; i2++) {
                            arrayList.add(ContentImagePo.CREATOR.createFromParcel(parcel));
                        }
                    }
                    return new ReferenceContentPo(string, string2, string3, arrayList, parcel.readInt() != 0 ? ContentAuthorPo.CREATOR.createFromParcel(parcel) : null, parcel.readLong());
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final ReferenceContentPo[] newArray(int i) {
                    return new ReferenceContentPo[i];
                }
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: com.okinc.search.bean.SearchResultContentPo$SearchResultContentItemPo$ReferenceContentPo */
            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ ReferenceContentPo copy$default(ReferenceContentPo referenceContentPo, String str, String str2, String str3, List list, ContentAuthorPo contentAuthorPo, long j, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = referenceContentPo.contentId;
                }
                if ((i & 2) != 0) {
                    str2 = referenceContentPo.content;
                }
                String str4 = str2;
                if ((i & 4) != 0) {
                    str3 = referenceContentPo.translatedContent;
                }
                String str5 = str3;
                if ((i & 8) != 0) {
                    list = referenceContentPo.imageList;
                }
                List list2 = list;
                if ((i & 16) != 0) {
                    contentAuthorPo = referenceContentPo.author;
                }
                ContentAuthorPo contentAuthorPo2 = contentAuthorPo;
                if ((i & 32) != 0) {
                    j = referenceContentPo.publishTime;
                }
                return referenceContentPo.KWHzl(str, str4, str5, list2, contentAuthorPo2, j);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final ReferenceContentPo KWHzl(String str, String str2, String str3, List<ContentImagePo> list, ContentAuthorPo contentAuthorPo, long j) {
                return new ReferenceContentPo(str, str2, str3, list, contentAuthorPo, j);
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
                if (!(obj instanceof ReferenceContentPo)) {
                    return false;
                }
                ReferenceContentPo referenceContentPo = (ReferenceContentPo) obj;
                return Intrinsics.EZpvd((Object) this.contentId, (Object) referenceContentPo.contentId) && Intrinsics.EZpvd((Object) this.content, (Object) referenceContentPo.content) && Intrinsics.EZpvd((Object) this.translatedContent, (Object) referenceContentPo.translatedContent) && Intrinsics.EZpvd(this.imageList, referenceContentPo.imageList) && Intrinsics.EZpvd(this.author, referenceContentPo.author) && this.publishTime == referenceContentPo.publishTime;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                String str = this.contentId;
                int iHashCode = str == null ? 0 : str.hashCode();
                String str2 = this.content;
                int iHashCode2 = str2 == null ? 0 : str2.hashCode();
                String str3 = this.translatedContent;
                int iHashCode3 = str3 == null ? 0 : str3.hashCode();
                List<ContentImagePo> list = this.imageList;
                int iHashCode4 = list == null ? 0 : list.hashCode();
                ContentAuthorPo contentAuthorPo = this.author;
                return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (contentAuthorPo != null ? contentAuthorPo.hashCode() : 0)) * 31) + Long.hashCode(this.publishTime);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "ReferenceContentPo(contentId=" + this.contentId + ", content=" + this.content + ", translatedContent=" + this.translatedContent + ", imageList=" + this.imageList + ", author=" + this.author + ", publishTime=" + this.publishTime + ")";
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel parcel, int i) {
                Intrinsics.checkNotNullParameter(parcel, "");
                parcel.writeString(this.contentId);
                parcel.writeString(this.content);
                parcel.writeString(this.translatedContent);
                List<ContentImagePo> list = this.imageList;
                if (list == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    parcel.writeInt(list.size());
                    Iterator<ContentImagePo> it = list.iterator();
                    while (it.hasNext()) {
                        it.next().writeToParcel(parcel, i);
                    }
                }
                ContentAuthorPo contentAuthorPo = this.author;
                if (contentAuthorPo == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    contentAuthorPo.writeToParcel(parcel, i);
                }
                parcel.writeLong(this.publishTime);
            }

            public ReferenceContentPo(String str, String str2, String str3, List<ContentImagePo> list, ContentAuthorPo contentAuthorPo, long j) {
                this.contentId = str;
                this.content = str2;
                this.translatedContent = str3;
                this.imageList = list;
                this.author = contentAuthorPo;
                this.publishTime = j;
            }
        }

        public static final class ContentAuthorPo implements Parcelable {
            public static final int $stable = 0;
            public static final Parcelable.Creator<ContentAuthorPo> CREATOR = new Creator();

            @SerializedName("authorId")
            private final String authorId;

            @SerializedName("liveStatus")
            private final String liveStatus;

            @SerializedName("nickName")
            private final String nickName;

            @SerializedName("officialStatus")
            private final String officialStatus;

            @SerializedName("portrait")
            private final String portrait;

            @SerializedName("shareCode")
            private final String shareCode;

            @SerializedName("type")
            private final int type;

            public static final class Creator implements Parcelable.Creator<ContentAuthorPo> {
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final ContentAuthorPo createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "");
                    return new ContentAuthorPo(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString());
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final ContentAuthorPo[] newArray(int i) {
                    return new ContentAuthorPo[i];
                }
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ ContentAuthorPo copy$default(ContentAuthorPo contentAuthorPo, String str, String str2, String str3, int i, String str4, String str5, String str6, int i2, Object obj) {
                if ((i2 & 1) != 0) {
                    str = contentAuthorPo.authorId;
                }
                if ((i2 & 2) != 0) {
                    str2 = contentAuthorPo.nickName;
                }
                String str7 = str2;
                if ((i2 & 4) != 0) {
                    str3 = contentAuthorPo.portrait;
                }
                String str8 = str3;
                if ((i2 & 8) != 0) {
                    i = contentAuthorPo.type;
                }
                int i3 = i;
                if ((i2 & 16) != 0) {
                    str4 = contentAuthorPo.officialStatus;
                }
                String str9 = str4;
                if ((i2 & 32) != 0) {
                    str5 = contentAuthorPo.liveStatus;
                }
                String str10 = str5;
                if ((i2 & 64) != 0) {
                    str6 = contentAuthorPo.shareCode;
                }
                return contentAuthorPo.copydefault(str, str7, str8, i3, str9, str10, str6);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String AEQbTJ() {
                return this.shareCode;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String EZpvd() {
                return this.portrait;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String KWHzl() {
                return this.officialStatus;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String OLrzqt() {
                return this.liveStatus;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final ContentAuthorPo copydefault(String str, String str2, String str3, int i, String str4, String str5, String str6) {
                return new ContentAuthorPo(str, str2, str3, i, str4, str5, str6);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String copydefault() {
                return this.nickName;
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
                if (!(obj instanceof ContentAuthorPo)) {
                    return false;
                }
                ContentAuthorPo contentAuthorPo = (ContentAuthorPo) obj;
                return Intrinsics.EZpvd((Object) this.authorId, (Object) contentAuthorPo.authorId) && Intrinsics.EZpvd((Object) this.nickName, (Object) contentAuthorPo.nickName) && Intrinsics.EZpvd((Object) this.portrait, (Object) contentAuthorPo.portrait) && this.type == contentAuthorPo.type && Intrinsics.EZpvd((Object) this.officialStatus, (Object) contentAuthorPo.officialStatus) && Intrinsics.EZpvd((Object) this.liveStatus, (Object) contentAuthorPo.liveStatus) && Intrinsics.EZpvd((Object) this.shareCode, (Object) contentAuthorPo.shareCode);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                String str = this.authorId;
                int iHashCode = str == null ? 0 : str.hashCode();
                String str2 = this.nickName;
                int iHashCode2 = str2 == null ? 0 : str2.hashCode();
                String str3 = this.portrait;
                int iHashCode3 = str3 == null ? 0 : str3.hashCode();
                int iHashCode4 = Integer.hashCode(this.type);
                String str4 = this.officialStatus;
                int iHashCode5 = str4 == null ? 0 : str4.hashCode();
                String str5 = this.liveStatus;
                int iHashCode6 = str5 == null ? 0 : str5.hashCode();
                String str6 = this.shareCode;
                return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + (str6 != null ? str6.hashCode() : 0);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "ContentAuthorPo(authorId=" + this.authorId + ", nickName=" + this.nickName + ", portrait=" + this.portrait + ", type=" + this.type + ", officialStatus=" + this.officialStatus + ", liveStatus=" + this.liveStatus + ", shareCode=" + this.shareCode + ")";
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel parcel, int i) {
                Intrinsics.checkNotNullParameter(parcel, "");
                parcel.writeString(this.authorId);
                parcel.writeString(this.nickName);
                parcel.writeString(this.portrait);
                parcel.writeInt(this.type);
                parcel.writeString(this.officialStatus);
                parcel.writeString(this.liveStatus);
                parcel.writeString(this.shareCode);
            }

            public ContentAuthorPo(String str, String str2, String str3, int i, String str4, String str5, String str6) {
                this.authorId = str;
                this.nickName = str2;
                this.portrait = str3;
                this.type = i;
                this.officialStatus = str4;
                this.liveStatus = str5;
                this.shareCode = str6;
            }
        }

        public static final class ContentTokenPo implements Parcelable {
            public static final int $stable = 0;
            public static final Parcelable.Creator<ContentTokenPo> CREATOR = new Creator();

            @SerializedName("coinName")
            private final String coinName;

            @SerializedName(RemoteMessageConst.Notification.ICON)
            private final String icon;

            @SerializedName("instId")
            private final String instId;

            @SerializedName("instType")
            private final String instType;

            @SerializedName("introduceSeo")
            private final String introduceSeo;

            @SerializedName("last")
            private final String last;

            @SerializedName("open24h")
            private final String open24h;

            @SerializedName("sodUtc0")
            private final String sodUtc0;

            @SerializedName("sodUtc8")
            private final String sodUtc8;

            public static final class Creator implements Parcelable.Creator<ContentTokenPo> {
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final ContentTokenPo createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "");
                    return new ContentTokenPo(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final ContentTokenPo[] newArray(int i) {
                    return new ContentTokenPo[i];
                }
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final ContentTokenPo copydefault(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
                return new ContentTokenPo(str, str2, str3, str4, str5, str6, str7, str8, str9);
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
                if (!(obj instanceof ContentTokenPo)) {
                    return false;
                }
                ContentTokenPo contentTokenPo = (ContentTokenPo) obj;
                return Intrinsics.EZpvd((Object) this.coinName, (Object) contentTokenPo.coinName) && Intrinsics.EZpvd((Object) this.icon, (Object) contentTokenPo.icon) && Intrinsics.EZpvd((Object) this.instId, (Object) contentTokenPo.instId) && Intrinsics.EZpvd((Object) this.instType, (Object) contentTokenPo.instType) && Intrinsics.EZpvd((Object) this.introduceSeo, (Object) contentTokenPo.introduceSeo) && Intrinsics.EZpvd((Object) this.last, (Object) contentTokenPo.last) && Intrinsics.EZpvd((Object) this.open24h, (Object) contentTokenPo.open24h) && Intrinsics.EZpvd((Object) this.sodUtc0, (Object) contentTokenPo.sodUtc0) && Intrinsics.EZpvd((Object) this.sodUtc8, (Object) contentTokenPo.sodUtc8);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                String str = this.coinName;
                int iHashCode = str == null ? 0 : str.hashCode();
                String str2 = this.icon;
                int iHashCode2 = str2 == null ? 0 : str2.hashCode();
                String str3 = this.instId;
                int iHashCode3 = str3 == null ? 0 : str3.hashCode();
                String str4 = this.instType;
                int iHashCode4 = str4 == null ? 0 : str4.hashCode();
                String str5 = this.introduceSeo;
                int iHashCode5 = str5 == null ? 0 : str5.hashCode();
                String str6 = this.last;
                int iHashCode6 = str6 == null ? 0 : str6.hashCode();
                String str7 = this.open24h;
                int iHashCode7 = str7 == null ? 0 : str7.hashCode();
                String str8 = this.sodUtc0;
                int iHashCode8 = str8 == null ? 0 : str8.hashCode();
                String str9 = this.sodUtc8;
                return (((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + (str9 != null ? str9.hashCode() : 0);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "ContentTokenPo(coinName=" + this.coinName + ", icon=" + this.icon + ", instId=" + this.instId + ", instType=" + this.instType + ", introduceSeo=" + this.introduceSeo + ", last=" + this.last + ", open24h=" + this.open24h + ", sodUtc0=" + this.sodUtc0 + ", sodUtc8=" + this.sodUtc8 + ")";
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel parcel, int i) {
                Intrinsics.checkNotNullParameter(parcel, "");
                parcel.writeString(this.coinName);
                parcel.writeString(this.icon);
                parcel.writeString(this.instId);
                parcel.writeString(this.instType);
                parcel.writeString(this.introduceSeo);
                parcel.writeString(this.last);
                parcel.writeString(this.open24h);
                parcel.writeString(this.sodUtc0);
                parcel.writeString(this.sodUtc8);
            }

            public ContentTokenPo(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
                this.coinName = str;
                this.icon = str2;
                this.instId = str3;
                this.instType = str4;
                this.introduceSeo = str5;
                this.last = str6;
                this.open24h = str7;
                this.sodUtc0 = str8;
                this.sodUtc8 = str9;
            }
        }

        public static final class ContentImagePo implements Parcelable {
            public static final int $stable = 0;
            public static final Parcelable.Creator<ContentImagePo> CREATOR = new Creator();

            @SerializedName("height")
            private final int height;

            @SerializedName("url")
            private final String url;

            @SerializedName("width")
            private final int width;

            public static final class Creator implements Parcelable.Creator<ContentImagePo> {
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final ContentImagePo createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "");
                    return new ContentImagePo(parcel.readString(), parcel.readInt(), parcel.readInt());
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final ContentImagePo[] newArray(int i) {
                    return new ContentImagePo[i];
                }
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ ContentImagePo copy$default(ContentImagePo contentImagePo, String str, int i, int i2, int i3, Object obj) {
                if ((i3 & 1) != 0) {
                    str = contentImagePo.url;
                }
                if ((i3 & 2) != 0) {
                    i = contentImagePo.width;
                }
                if ((i3 & 4) != 0) {
                    i2 = contentImagePo.height;
                }
                return contentImagePo.copydefault(str, i, i2);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final ContentImagePo copydefault(@NotNull String str, int i, int i2) {
                Intrinsics.checkNotNullParameter(str, "");
                return new ContentImagePo(str, i, i2);
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
                if (!(obj instanceof ContentImagePo)) {
                    return false;
                }
                ContentImagePo contentImagePo = (ContentImagePo) obj;
                return Intrinsics.EZpvd((Object) this.url, (Object) contentImagePo.url) && this.width == contentImagePo.width && this.height == contentImagePo.height;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return (((this.url.hashCode() * 31) + Integer.hashCode(this.width)) * 31) + Integer.hashCode(this.height);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "ContentImagePo(url=" + this.url + ", width=" + this.width + ", height=" + this.height + ")";
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel parcel, int i) {
                Intrinsics.checkNotNullParameter(parcel, "");
                parcel.writeString(this.url);
                parcel.writeInt(this.width);
                parcel.writeInt(this.height);
            }

            public ContentImagePo(@NotNull String str, int i, int i2) {
                Intrinsics.checkNotNullParameter(str, "");
                this.url = str;
                this.width = i;
                this.height = i2;
            }
        }
    }
}
