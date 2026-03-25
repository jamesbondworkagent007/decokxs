package com.okinc.unify_trade.bot.market_place.userpage;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.app.FrameMetricsAggregator;
import com.okinc.unify_trade.biz.BotLeadUserOrderHistoryModel;
import com.okinc.unify_trade.bot.data.TacticsListLabelData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes24.dex */
public final class BotLeadUserOrderHistoryShowData implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<BotLeadUserOrderHistoryShowData> CREATOR = new Creator();
    private List<BotLeadUserOrderHistoryContentShowData> content;
    private ArrayList<TacticsListLabelData> labelList;
    private String leverage;
    private BotLeadUserOrderHistoryModel originData;
    private Boolean positive;
    private Boolean showContractInfo;
    private String side;
    private Integer sideColor;
    private String title;

    public static final class Creator implements Parcelable.Creator<BotLeadUserOrderHistoryShowData> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BotLeadUserOrderHistoryShowData createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            Boolean boolValueOf = parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0);
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            Boolean boolValueOf2 = parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0);
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(BotLeadUserOrderHistoryContentShowData.CREATOR.createFromParcel(parcel));
                }
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int i3 = parcel.readInt();
                arrayList2 = new ArrayList(i3);
                for (int i4 = 0; i4 != i3; i4++) {
                    arrayList2.add(TacticsListLabelData.CREATOR.createFromParcel(parcel));
                }
            }
            return new BotLeadUserOrderHistoryShowData(string, boolValueOf, string2, string3, boolValueOf2, numValueOf, arrayList, arrayList2, parcel.readInt() != 0 ? BotLeadUserOrderHistoryModel.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BotLeadUserOrderHistoryShowData[] newArray(int i) {
            return new BotLeadUserOrderHistoryShowData[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public BotLeadUserOrderHistoryShowData() {
        this(null, null, null, null, null, null, null, null, null, FrameMetricsAggregator.EVERY_DURATION, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component2() {
        return this.showContractInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.side;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.leverage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component5() {
        return this.positive;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component6() {
        return this.sideColor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<BotLeadUserOrderHistoryContentShowData> component7() {
        return this.content;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<TacticsListLabelData> component8() {
        return this.labelList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BotLeadUserOrderHistoryModel component9() {
        return this.originData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BotLeadUserOrderHistoryShowData copy(String str, Boolean bool, String str2, String str3, Boolean bool2, Integer num, List<BotLeadUserOrderHistoryContentShowData> list, ArrayList<TacticsListLabelData> arrayList, BotLeadUserOrderHistoryModel botLeadUserOrderHistoryModel) {
        return new BotLeadUserOrderHistoryShowData(str, bool, str2, str3, bool2, num, list, arrayList, botLeadUserOrderHistoryModel);
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
        if (!(obj instanceof BotLeadUserOrderHistoryShowData)) {
            return false;
        }
        BotLeadUserOrderHistoryShowData botLeadUserOrderHistoryShowData = (BotLeadUserOrderHistoryShowData) obj;
        return Intrinsics.EZpvd((Object) this.title, (Object) botLeadUserOrderHistoryShowData.title) && Intrinsics.EZpvd(this.showContractInfo, botLeadUserOrderHistoryShowData.showContractInfo) && Intrinsics.EZpvd((Object) this.side, (Object) botLeadUserOrderHistoryShowData.side) && Intrinsics.EZpvd((Object) this.leverage, (Object) botLeadUserOrderHistoryShowData.leverage) && Intrinsics.EZpvd(this.positive, botLeadUserOrderHistoryShowData.positive) && Intrinsics.EZpvd(this.sideColor, botLeadUserOrderHistoryShowData.sideColor) && Intrinsics.EZpvd(this.content, botLeadUserOrderHistoryShowData.content) && Intrinsics.EZpvd(this.labelList, botLeadUserOrderHistoryShowData.labelList) && Intrinsics.EZpvd(this.originData, botLeadUserOrderHistoryShowData.originData);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<BotLeadUserOrderHistoryContentShowData> getContent() {
        return this.content;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<TacticsListLabelData> getLabelList() {
        return this.labelList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLeverage() {
        return this.leverage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BotLeadUserOrderHistoryModel getOriginData() {
        return this.originData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getPositive() {
        return this.positive;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getShowContractInfo() {
        return this.showContractInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSide() {
        return this.side;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getSideColor() {
        return this.sideColor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTitle() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.title;
        int iHashCode = str == null ? 0 : str.hashCode();
        Boolean bool = this.showContractInfo;
        int iHashCode2 = bool == null ? 0 : bool.hashCode();
        String str2 = this.side;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.leverage;
        int iHashCode4 = str3 == null ? 0 : str3.hashCode();
        Boolean bool2 = this.positive;
        int iHashCode5 = bool2 == null ? 0 : bool2.hashCode();
        Integer num = this.sideColor;
        int iHashCode6 = num == null ? 0 : num.hashCode();
        List<BotLeadUserOrderHistoryContentShowData> list = this.content;
        int iHashCode7 = list == null ? 0 : list.hashCode();
        ArrayList<TacticsListLabelData> arrayList = this.labelList;
        int iHashCode8 = arrayList == null ? 0 : arrayList.hashCode();
        BotLeadUserOrderHistoryModel botLeadUserOrderHistoryModel = this.originData;
        return (((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + (botLeadUserOrderHistoryModel != null ? botLeadUserOrderHistoryModel.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setContent(List<BotLeadUserOrderHistoryContentShowData> list) {
        this.content = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLabelList(ArrayList<TacticsListLabelData> arrayList) {
        this.labelList = arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLeverage(String str) {
        this.leverage = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOriginData(BotLeadUserOrderHistoryModel botLeadUserOrderHistoryModel) {
        this.originData = botLeadUserOrderHistoryModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPositive(Boolean bool) {
        this.positive = bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setShowContractInfo(Boolean bool) {
        this.showContractInfo = bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSide(String str) {
        this.side = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSideColor(Integer num) {
        this.sideColor = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTitle(String str) {
        this.title = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "BotLeadUserOrderHistoryShowData(title=" + this.title + ", showContractInfo=" + this.showContractInfo + ", side=" + this.side + ", leverage=" + this.leverage + ", positive=" + this.positive + ", sideColor=" + this.sideColor + ", content=" + this.content + ", labelList=" + this.labelList + ", originData=" + this.originData + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.title);
        Boolean bool = this.showContractInfo;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        parcel.writeString(this.side);
        parcel.writeString(this.leverage);
        Boolean bool2 = this.positive;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool2.booleanValue() ? 1 : 0);
        }
        Integer num = this.sideColor;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        List<BotLeadUserOrderHistoryContentShowData> list = this.content;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<BotLeadUserOrderHistoryContentShowData> it = list.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(parcel, i);
            }
        }
        ArrayList<TacticsListLabelData> arrayList = this.labelList;
        if (arrayList == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(arrayList.size());
            Iterator<TacticsListLabelData> it2 = arrayList.iterator();
            while (it2.hasNext()) {
                it2.next().writeToParcel(parcel, i);
            }
        }
        BotLeadUserOrderHistoryModel botLeadUserOrderHistoryModel = this.originData;
        if (botLeadUserOrderHistoryModel == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            botLeadUserOrderHistoryModel.writeToParcel(parcel, i);
        }
    }

    public BotLeadUserOrderHistoryShowData(String str, Boolean bool, String str2, String str3, Boolean bool2, Integer num, List<BotLeadUserOrderHistoryContentShowData> list, ArrayList<TacticsListLabelData> arrayList, BotLeadUserOrderHistoryModel botLeadUserOrderHistoryModel) {
        this.title = str;
        this.showContractInfo = bool;
        this.side = str2;
        this.leverage = str3;
        this.positive = bool2;
        this.sideColor = num;
        this.content = list;
        this.labelList = arrayList;
        this.originData = botLeadUserOrderHistoryModel;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0054: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r20v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r11v0 java.lang.String))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x000a: ARITH (r20v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r12v0 java.lang.Boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0011: ARITH (r20v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r13v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0018: ARITH (r20v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r14v0 java.lang.String))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x001f: ARITH (r20v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r15v0 java.lang.Boolean))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0026: ARITH (r20v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r16v0 java.lang.Integer))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x002e: ARITH (r20v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r17v0 java.util.List))
  (wrap:java.util.ArrayList:?: TERNARY null = ((wrap:int:0x0036: ARITH (r20v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.util.ArrayList) : (r18v0 java.util.ArrayList))
  (wrap:com.okinc.unify_trade.biz.BotLeadUserOrderHistoryModel:?: TERNARY null = ((wrap:int:0x003e: ARITH (r20v0 int) & (256 int) A[WRAPPED]) == (0 int)) ? (r19v0 com.okinc.unify_trade.biz.BotLeadUserOrderHistoryModel) : (null com.okinc.unify_trade.biz.BotLeadUserOrderHistoryModel))
 A[MD:(java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.Integer, java.util.List<com.okinc.unify_trade.bot.market_place.userpage.BotLeadUserOrderHistoryContentShowData>, java.util.ArrayList<com.okinc.unify_trade.bot.data.TacticsListLabelData>, com.okinc.unify_trade.biz.BotLeadUserOrderHistoryModel):void (m)] (LINE:11) call: com.okinc.unify_trade.bot.market_place.userpage.BotLeadUserOrderHistoryShowData.<init>(java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.Integer, java.util.List, java.util.ArrayList, com.okinc.unify_trade.biz.BotLeadUserOrderHistoryModel):void type: THIS */
    public /* synthetic */ BotLeadUserOrderHistoryShowData(String str, Boolean bool, String str2, String str3, Boolean bool2, Integer num, List list, ArrayList arrayList, BotLeadUserOrderHistoryModel botLeadUserOrderHistoryModel, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : bool, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : bool2, (i & 32) != 0 ? null : num, (i & 64) != 0 ? null : list, (i & 128) != 0 ? null : arrayList, (i & 256) == 0 ? botLeadUserOrderHistoryModel : null);
    }
}
