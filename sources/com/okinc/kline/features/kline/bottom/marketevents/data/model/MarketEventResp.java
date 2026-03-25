package com.okinc.kline.features.kline.bottom.marketevents.data.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import com.okinc.business.defi.wallet.mine.search.data.model.WalletSearchRequest;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class MarketEventResp {
    public static final int $stable = 8;

    @SerializedName("bigEventDataList")
    private final List<BigEventPo> bigEventDataList;

    @SerializedName("nextCursor")
    private final String nextCursor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public MarketEventResp() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.kline.features.kline.bottom.marketevents.data.model.MarketEventResp */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MarketEventResp copy$default(MarketEventResp marketEventResp, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = marketEventResp.nextCursor;
        }
        if ((i & 2) != 0) {
            list = marketEventResp.bigEventDataList;
        }
        return marketEventResp.copy(str, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.nextCursor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<BigEventPo> component2() {
        return this.bigEventDataList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MarketEventResp copy(String str, List<BigEventPo> list) {
        return new MarketEventResp(str, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketEventResp)) {
            return false;
        }
        MarketEventResp marketEventResp = (MarketEventResp) obj;
        return Intrinsics.EZpvd((Object) this.nextCursor, (Object) marketEventResp.nextCursor) && Intrinsics.EZpvd(this.bigEventDataList, marketEventResp.bigEventDataList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<BigEventPo> getBigEventDataList() {
        return this.bigEventDataList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNextCursor() {
        return this.nextCursor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.nextCursor;
        int iHashCode = str == null ? 0 : str.hashCode();
        List<BigEventPo> list = this.bigEventDataList;
        return (iHashCode * 31) + (list != null ? list.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "MarketEventResp(nextCursor=" + this.nextCursor + ", bigEventDataList=" + this.bigEventDataList + ")";
    }

    public MarketEventResp(String str, List<BigEventPo> list) {
        this.nextCursor = str;
        this.bigEventDataList = list;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0006: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r3v0 java.util.List))
 A[MD:(java.lang.String, java.util.List<com.okinc.kline.features.kline.bottom.marketevents.data.model.MarketEventResp$BigEventPo>):void (m)] (LINE:47) call: com.okinc.kline.features.kline.bottom.marketevents.data.model.MarketEventResp.<init>(java.lang.String, java.util.List):void type: THIS */
    public /* synthetic */ MarketEventResp(String str, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : list);
    }

    public static final class BigEventPo implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<BigEventPo> CREATOR = new Creator();

        @SerializedName(WalletSearchRequest.SEARCH_SOURCE_ADDRESS)
        private final String address;

        @SerializedName("authorList")
        private final List<String> authorList;

        @SerializedName("eventDetail")
        private final String eventDetail;

        @SerializedName("explanation")
        private final String explanation;

        @SerializedName("instId")
        private final String instId;

        @SerializedName("newContent")
        private final String newContent;

        @SerializedName("newTitle")
        private final String newTitle;

        @SerializedName("sourceCount")
        private final String sourceCount;

        @SerializedName("statement")
        private final String statement;

        @SerializedName("summaryContentId")
        private final String summaryContentId;

        @SerializedName("tag")
        private final String tag;

        @SerializedName("timeStamp")
        private final long timeStamp;

        @SerializedName("type")
        private final String type;

        @SerializedName("typeTitle")
        private final String typeTitle;

        public static final class Creator implements Parcelable.Creator<BigEventPo> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final BigEventPo createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return new BigEventPo(parcel.readString(), parcel.readString(), parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.createStringArrayList());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final BigEventPo[] newArray(int i) {
                return new BigEventPo[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public BigEventPo() {
            this(null, null, 0L, null, null, null, null, null, null, null, null, null, null, null, 16383, null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component1() {
            return this.instId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component10() {
            return this.summaryContentId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component11() {
            return this.newTitle;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component12() {
            return this.newContent;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component13() {
            return this.address;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final List<String> component14() {
            return this.authorList;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component2() {
            return this.type;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final long component3() {
            return this.timeStamp;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component4() {
            return this.tag;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component5() {
            return this.eventDetail;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component6() {
            return this.typeTitle;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component7() {
            return this.sourceCount;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component8() {
            return this.explanation;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component9() {
            return this.statement;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final BigEventPo copy(@NotNull String str, @NotNull String str2, long j, String str3, @NotNull String str4, @NotNull String str5, String str6, String str7, String str8, String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, List<String> list) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str4, "");
            Intrinsics.checkNotNullParameter(str5, "");
            Intrinsics.checkNotNullParameter(str10, "");
            Intrinsics.checkNotNullParameter(str11, "");
            Intrinsics.checkNotNullParameter(str12, "");
            return new BigEventPo(str, str2, j, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, list);
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
            if (!(obj instanceof BigEventPo)) {
                return false;
            }
            BigEventPo bigEventPo = (BigEventPo) obj;
            return Intrinsics.EZpvd((Object) this.instId, (Object) bigEventPo.instId) && Intrinsics.EZpvd((Object) this.type, (Object) bigEventPo.type) && this.timeStamp == bigEventPo.timeStamp && Intrinsics.EZpvd((Object) this.tag, (Object) bigEventPo.tag) && Intrinsics.EZpvd((Object) this.eventDetail, (Object) bigEventPo.eventDetail) && Intrinsics.EZpvd((Object) this.typeTitle, (Object) bigEventPo.typeTitle) && Intrinsics.EZpvd((Object) this.sourceCount, (Object) bigEventPo.sourceCount) && Intrinsics.EZpvd((Object) this.explanation, (Object) bigEventPo.explanation) && Intrinsics.EZpvd((Object) this.statement, (Object) bigEventPo.statement) && Intrinsics.EZpvd((Object) this.summaryContentId, (Object) bigEventPo.summaryContentId) && Intrinsics.EZpvd((Object) this.newTitle, (Object) bigEventPo.newTitle) && Intrinsics.EZpvd((Object) this.newContent, (Object) bigEventPo.newContent) && Intrinsics.EZpvd((Object) this.address, (Object) bigEventPo.address) && Intrinsics.EZpvd(this.authorList, bigEventPo.authorList);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getAddress() {
            return this.address;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final List<String> getAuthorList() {
            return this.authorList;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getEventDetail() {
            return this.eventDetail;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getExplanation() {
            return this.explanation;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getInstId() {
            return this.instId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getNewContent() {
            return this.newContent;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getNewTitle() {
            return this.newTitle;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getSourceCount() {
            return this.sourceCount;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getStatement() {
            return this.statement;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getSummaryContentId() {
            return this.summaryContentId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getTag() {
            return this.tag;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final long getTimeStamp() {
            return this.timeStamp;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getType() {
            return this.type;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getTypeTitle() {
            return this.typeTitle;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = this.instId.hashCode();
            int iHashCode2 = this.type.hashCode();
            int iHashCode3 = Long.hashCode(this.timeStamp);
            String str = this.tag;
            int iHashCode4 = str == null ? 0 : str.hashCode();
            int iHashCode5 = this.eventDetail.hashCode();
            int iHashCode6 = this.typeTitle.hashCode();
            String str2 = this.sourceCount;
            int iHashCode7 = str2 == null ? 0 : str2.hashCode();
            String str3 = this.explanation;
            int iHashCode8 = str3 == null ? 0 : str3.hashCode();
            String str4 = this.statement;
            int iHashCode9 = str4 == null ? 0 : str4.hashCode();
            String str5 = this.summaryContentId;
            int iHashCode10 = str5 == null ? 0 : str5.hashCode();
            int iHashCode11 = this.newTitle.hashCode();
            int iHashCode12 = this.newContent.hashCode();
            int iHashCode13 = this.address.hashCode();
            List<String> list = this.authorList;
            return (((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + (list != null ? list.hashCode() : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "BigEventPo(instId=" + this.instId + ", type=" + this.type + ", timeStamp=" + this.timeStamp + ", tag=" + this.tag + ", eventDetail=" + this.eventDetail + ", typeTitle=" + this.typeTitle + ", sourceCount=" + this.sourceCount + ", explanation=" + this.explanation + ", statement=" + this.statement + ", summaryContentId=" + this.summaryContentId + ", newTitle=" + this.newTitle + ", newContent=" + this.newContent + ", address=" + this.address + ", authorList=" + this.authorList + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeString(this.instId);
            parcel.writeString(this.type);
            parcel.writeLong(this.timeStamp);
            parcel.writeString(this.tag);
            parcel.writeString(this.eventDetail);
            parcel.writeString(this.typeTitle);
            parcel.writeString(this.sourceCount);
            parcel.writeString(this.explanation);
            parcel.writeString(this.statement);
            parcel.writeString(this.summaryContentId);
            parcel.writeString(this.newTitle);
            parcel.writeString(this.newContent);
            parcel.writeString(this.address);
            parcel.writeStringList(this.authorList);
        }

        public BigEventPo(@NotNull String str, @NotNull String str2, long j, String str3, @NotNull String str4, @NotNull String str5, String str6, String str7, String str8, String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, List<String> list) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str4, "");
            Intrinsics.checkNotNullParameter(str5, "");
            Intrinsics.checkNotNullParameter(str10, "");
            Intrinsics.checkNotNullParameter(str11, "");
            Intrinsics.checkNotNullParameter(str12, "");
            this.instId = str;
            this.type = str2;
            this.timeStamp = j;
            this.tag = str3;
            this.eventDetail = str4;
            this.typeTitle = str5;
            this.sourceCount = str6;
            this.explanation = str7;
            this.statement = str8;
            this.summaryContentId = str9;
            this.newTitle = str10;
            this.newContent = str11;
            this.address = str12;
            this.authorList = list;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0092: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r32v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r17v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r32v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r18v0 java.lang.String))
  (wrap:long:?: TERNARY null = ((wrap:int:0x0014: ARITH (r32v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r19v0 long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001d: ARITH (r32v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r21v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0025: ARITH (r32v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r22v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002d: ARITH (r32v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r23v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0035: ARITH (r32v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r24v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003d: ARITH (r32v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r25v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0045: ARITH (r32v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r26v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004d: ARITH (r32v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r27v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0055: ARITH (r32v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? ("") : (r28v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005d: ARITH (r32v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? ("") : (r29v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0065: ARITH (r32v0 int) & (4096 int) A[WRAPPED]) == (0 int)) ? (r30v0 java.lang.String) : (""))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x006c: ARITH (r32v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r31v0 java.util.List))
 A[MD:(java.lang.String, java.lang.String, long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List<java.lang.String>):void (m)] (LINE:63) call: com.okinc.kline.features.kline.bottom.marketevents.data.model.MarketEventResp.BigEventPo.<init>(java.lang.String, java.lang.String, long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List):void type: THIS */
        public /* synthetic */ BigEventPo(String str, String str2, long j, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? 0L : j, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? "" : str4, (i & 32) != 0 ? "" : str5, (i & 64) != 0 ? null : str6, (i & 128) != 0 ? null : str7, (i & 256) != 0 ? null : str8, (i & 512) != 0 ? null : str9, (i & 1024) != 0 ? "" : str10, (i & 2048) != 0 ? "" : str11, (i & 4096) == 0 ? str12 : "", (i & 8192) != 0 ? null : list);
        }
    }
}
