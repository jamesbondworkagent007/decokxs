package com.okinc.unify_trade.bot.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.unify_trade.biz.HistoryEventExtData;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class HistoryEventCard implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<HistoryEventCard> CREATOR = new Creator();
    private String clientIds;
    private String details;
    private HistoryEventExtData historyEventExtData;
    private boolean showBottomLine;
    private String signalDetails;
    private final String status;
    private final String time;
    private final String title;

    public static final class Creator implements Parcelable.Creator<HistoryEventCard> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final HistoryEventCard createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new HistoryEventCard(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : HistoryEventExtData.CREATOR.createFromParcel(parcel), parcel.readInt() != 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final HistoryEventCard[] newArray(int i) {
            return new HistoryEventCard[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.time;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.details;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.signalDetails;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.clientIds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final HistoryEventExtData component7() {
        return this.historyEventExtData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component8() {
        return this.showBottomLine;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final HistoryEventCard copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, String str5, String str6, HistoryEventExtData historyEventExtData, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        return new HistoryEventCard(str, str2, str3, str4, str5, str6, historyEventExtData, z);
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
        if (!(obj instanceof HistoryEventCard)) {
            return false;
        }
        HistoryEventCard historyEventCard = (HistoryEventCard) obj;
        return Intrinsics.EZpvd((Object) this.title, (Object) historyEventCard.title) && Intrinsics.EZpvd((Object) this.status, (Object) historyEventCard.status) && Intrinsics.EZpvd((Object) this.time, (Object) historyEventCard.time) && Intrinsics.EZpvd((Object) this.details, (Object) historyEventCard.details) && Intrinsics.EZpvd((Object) this.signalDetails, (Object) historyEventCard.signalDetails) && Intrinsics.EZpvd((Object) this.clientIds, (Object) historyEventCard.clientIds) && Intrinsics.EZpvd(this.historyEventExtData, historyEventCard.historyEventExtData) && this.showBottomLine == historyEventCard.showBottomLine;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getClientIds() {
        return this.clientIds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDetails() {
        return this.details;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final HistoryEventExtData getHistoryEventExtData() {
        return this.historyEventExtData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getShowBottomLine() {
        return this.showBottomLine;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSignalDetails() {
        return this.signalDetails;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getStatus() {
        return this.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTime() {
        return this.time;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTitle() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.title.hashCode();
        int iHashCode2 = this.status.hashCode();
        int iHashCode3 = this.time.hashCode();
        int iHashCode4 = this.details.hashCode();
        String str = this.signalDetails;
        int iHashCode5 = str == null ? 0 : str.hashCode();
        String str2 = this.clientIds;
        int iHashCode6 = str2 == null ? 0 : str2.hashCode();
        HistoryEventExtData historyEventExtData = this.historyEventExtData;
        return (((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + (historyEventExtData != null ? historyEventExtData.hashCode() : 0)) * 31) + Boolean.hashCode(this.showBottomLine);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setClientIds(String str) {
        this.clientIds = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDetails(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.details = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setHistoryEventExtData(HistoryEventExtData historyEventExtData) {
        this.historyEventExtData = historyEventExtData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setShowBottomLine(boolean z) {
        this.showBottomLine = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSignalDetails(String str) {
        this.signalDetails = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "HistoryEventCard(title=" + this.title + ", status=" + this.status + ", time=" + this.time + ", details=" + this.details + ", signalDetails=" + this.signalDetails + ", clientIds=" + this.clientIds + ", historyEventExtData=" + this.historyEventExtData + ", showBottomLine=" + this.showBottomLine + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.title);
        parcel.writeString(this.status);
        parcel.writeString(this.time);
        parcel.writeString(this.details);
        parcel.writeString(this.signalDetails);
        parcel.writeString(this.clientIds);
        HistoryEventExtData historyEventExtData = this.historyEventExtData;
        if (historyEventExtData == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            historyEventExtData.writeToParcel(parcel, i);
        }
        parcel.writeInt(this.showBottomLine ? 1 : 0);
    }

    public HistoryEventCard(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, String str5, String str6, HistoryEventExtData historyEventExtData, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.title = str;
        this.status = str2;
        this.time = str3;
        this.details = str4;
        this.signalDetails = str5;
        this.clientIds = str6;
        this.historyEventExtData = historyEventExtData;
        this.showBottomLine = z;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x001d: CONSTRUCTOR 
  (r12v0 java.lang.String)
  (r13v0 java.lang.String)
  (r14v0 java.lang.String)
  (r15v0 java.lang.String)
  (r16v0 java.lang.String)
  (r17v0 java.lang.String)
  (wrap:com.okinc.unify_trade.biz.HistoryEventExtData:?: TERNARY null = ((wrap:int:0x0002: ARITH (r20v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.unify_trade.biz.HistoryEventExtData) : (r18v0 com.okinc.unify_trade.biz.HistoryEventExtData))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x000b: ARITH (r20v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? true : (r19v0 boolean))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.unify_trade.biz.HistoryEventExtData, boolean):void (m)] (LINE:1244) call: com.okinc.unify_trade.bot.data.HistoryEventCard.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.unify_trade.biz.HistoryEventExtData, boolean):void type: THIS */
    public /* synthetic */ HistoryEventCard(String str, String str2, String str3, String str4, String str5, String str6, HistoryEventExtData historyEventExtData, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, str5, str6, (i & 64) != 0 ? null : historyEventExtData, (i & 128) != 0 ? true : z);
    }
}
