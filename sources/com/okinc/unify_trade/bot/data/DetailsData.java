package com.okinc.unify_trade.bot.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.biz.TacticsType;
import com.okinc.unify_trade.biz.StrategyPositionResponse;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class DetailsData implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<DetailsData> CREATOR = new Creator();
    private String adl;
    private final String algoId;
    private String completedCycles;
    private final String fondType;
    private String groupId;
    private final String instId;
    private final String instType;
    private boolean isActive;
    private final String level;
    private final String orderId;
    private final String orderType;
    private StrategyPositionResponse originPosition;
    private final String schedule;
    private final boolean showCancel;
    private final int sideBgColor;
    private final int sideColor;
    private final String state;
    private ArrayList<TacticsInsideItemData> subData;
    private final TacticsType tacticsType;
    private final String time;
    private final boolean titleRightDrawable;
    private final String tvTitle;
    private final String type;

    public static final class Creator implements Parcelable.Creator<DetailsData> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DetailsData createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            boolean z = parcel.readInt() != 0;
            TacticsType tacticsTypeCreateFromParcel = TacticsType.CREATOR.createFromParcel(parcel);
            String string7 = parcel.readString();
            String string8 = parcel.readString();
            String string9 = parcel.readString();
            String string10 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i);
                int i2 = 0;
                while (i2 != i) {
                    arrayList2.add(TacticsInsideItemData.CREATOR.createFromParcel(parcel));
                    i2++;
                    i = i;
                }
                arrayList = arrayList2;
            }
            return new DetailsData(string, string2, string3, string4, string5, string6, z, tacticsTypeCreateFromParcel, string7, string8, string9, string10, arrayList, parcel.readString(), parcel.readInt() != 0, parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readInt() != 0 ? StrategyPositionResponse.CREATOR.createFromParcel(parcel) : null, parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DetailsData[] newArray(int i) {
            return new DetailsData[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.orderType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.fondType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.level;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.time;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<TacticsInsideItemData> component13() {
        return this.subData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component14() {
        return this.schedule;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component15() {
        return this.showCancel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component16() {
        return this.sideColor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component17() {
        return this.sideBgColor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component18() {
        return this.adl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StrategyPositionResponse component19() {
        return this.originPosition;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.instId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component20() {
        return this.state;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component21() {
        return this.completedCycles;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component22() {
        return this.isActive;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component23() {
        return this.groupId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.instType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.algoId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.orderId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.tvTitle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component7() {
        return this.titleRightDrawable;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TacticsType component8() {
        return this.tacticsType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DetailsData copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, boolean z, @NotNull TacticsType tacticsType, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, ArrayList<TacticsInsideItemData> arrayList, @NotNull String str11, boolean z2, int i, int i2, @NotNull String str12, StrategyPositionResponse strategyPositionResponse, @NotNull String str13, @NotNull String str14, boolean z3, @NotNull String str15) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(tacticsType, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(str11, "");
        Intrinsics.checkNotNullParameter(str12, "");
        Intrinsics.checkNotNullParameter(str13, "");
        Intrinsics.checkNotNullParameter(str14, "");
        Intrinsics.checkNotNullParameter(str15, "");
        return new DetailsData(str, str2, str3, str4, str5, str6, z, tacticsType, str7, str8, str9, str10, arrayList, str11, z2, i, i2, str12, strategyPositionResponse, str13, str14, z3, str15);
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
        if (!(obj instanceof DetailsData)) {
            return false;
        }
        DetailsData detailsData = (DetailsData) obj;
        return Intrinsics.EZpvd((Object) this.orderType, (Object) detailsData.orderType) && Intrinsics.EZpvd((Object) this.instId, (Object) detailsData.instId) && Intrinsics.EZpvd((Object) this.instType, (Object) detailsData.instType) && Intrinsics.EZpvd((Object) this.algoId, (Object) detailsData.algoId) && Intrinsics.EZpvd((Object) this.orderId, (Object) detailsData.orderId) && Intrinsics.EZpvd((Object) this.tvTitle, (Object) detailsData.tvTitle) && this.titleRightDrawable == detailsData.titleRightDrawable && this.tacticsType == detailsData.tacticsType && Intrinsics.EZpvd((Object) this.type, (Object) detailsData.type) && Intrinsics.EZpvd((Object) this.fondType, (Object) detailsData.fondType) && Intrinsics.EZpvd((Object) this.level, (Object) detailsData.level) && Intrinsics.EZpvd((Object) this.time, (Object) detailsData.time) && Intrinsics.EZpvd(this.subData, detailsData.subData) && Intrinsics.EZpvd((Object) this.schedule, (Object) detailsData.schedule) && this.showCancel == detailsData.showCancel && this.sideColor == detailsData.sideColor && this.sideBgColor == detailsData.sideBgColor && Intrinsics.EZpvd((Object) this.adl, (Object) detailsData.adl) && Intrinsics.EZpvd(this.originPosition, detailsData.originPosition) && Intrinsics.EZpvd((Object) this.state, (Object) detailsData.state) && Intrinsics.EZpvd((Object) this.completedCycles, (Object) detailsData.completedCycles) && this.isActive == detailsData.isActive && Intrinsics.EZpvd((Object) this.groupId, (Object) detailsData.groupId);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAdl() {
        return this.adl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAlgoId() {
        return this.algoId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCompletedCycles() {
        return this.completedCycles;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFondType() {
        return this.fondType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getGroupId() {
        return this.groupId;
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
    public final String getLevel() {
        return this.level;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOrderId() {
        return this.orderId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOrderType() {
        return this.orderType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StrategyPositionResponse getOriginPosition() {
        return this.originPosition;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSchedule() {
        return this.schedule;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getShowCancel() {
        return this.showCancel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getSideBgColor() {
        return this.sideBgColor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getSideColor() {
        return this.sideColor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getState() {
        return this.state;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<TacticsInsideItemData> getSubData() {
        return this.subData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TacticsType getTacticsType() {
        return this.tacticsType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTime() {
        return this.time;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getTitleRightDrawable() {
        return this.titleRightDrawable;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTvTitle() {
        return this.tvTitle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getType() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.orderType.hashCode();
        int iHashCode2 = this.instId.hashCode();
        int iHashCode3 = this.instType.hashCode();
        int iHashCode4 = this.algoId.hashCode();
        int iHashCode5 = this.orderId.hashCode();
        int iHashCode6 = this.tvTitle.hashCode();
        int iHashCode7 = Boolean.hashCode(this.titleRightDrawable);
        int iHashCode8 = this.tacticsType.hashCode();
        int iHashCode9 = this.type.hashCode();
        int iHashCode10 = this.fondType.hashCode();
        int iHashCode11 = this.level.hashCode();
        int iHashCode12 = this.time.hashCode();
        ArrayList<TacticsInsideItemData> arrayList = this.subData;
        int iHashCode13 = arrayList == null ? 0 : arrayList.hashCode();
        int iHashCode14 = this.schedule.hashCode();
        int iHashCode15 = Boolean.hashCode(this.showCancel);
        int iHashCode16 = Integer.hashCode(this.sideColor);
        int iHashCode17 = Integer.hashCode(this.sideBgColor);
        int iHashCode18 = this.adl.hashCode();
        StrategyPositionResponse strategyPositionResponse = this.originPosition;
        return (((((((((((((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + (strategyPositionResponse == null ? 0 : strategyPositionResponse.hashCode())) * 31) + this.state.hashCode()) * 31) + this.completedCycles.hashCode()) * 31) + Boolean.hashCode(this.isActive)) * 31) + this.groupId.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isActive() {
        return this.isActive;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setActive(boolean z) {
        this.isActive = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAdl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.adl = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCompletedCycles(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.completedCycles = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setGroupId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.groupId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOriginPosition(StrategyPositionResponse strategyPositionResponse) {
        this.originPosition = strategyPositionResponse;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSubData(ArrayList<TacticsInsideItemData> arrayList) {
        this.subData = arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "DetailsData(orderType=" + this.orderType + ", instId=" + this.instId + ", instType=" + this.instType + ", algoId=" + this.algoId + ", orderId=" + this.orderId + ", tvTitle=" + this.tvTitle + ", titleRightDrawable=" + this.titleRightDrawable + ", tacticsType=" + this.tacticsType + ", type=" + this.type + ", fondType=" + this.fondType + ", level=" + this.level + ", time=" + this.time + ", subData=" + this.subData + ", schedule=" + this.schedule + ", showCancel=" + this.showCancel + ", sideColor=" + this.sideColor + ", sideBgColor=" + this.sideBgColor + ", adl=" + this.adl + ", originPosition=" + this.originPosition + ", state=" + this.state + ", completedCycles=" + this.completedCycles + ", isActive=" + this.isActive + ", groupId=" + this.groupId + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.orderType);
        parcel.writeString(this.instId);
        parcel.writeString(this.instType);
        parcel.writeString(this.algoId);
        parcel.writeString(this.orderId);
        parcel.writeString(this.tvTitle);
        parcel.writeInt(this.titleRightDrawable ? 1 : 0);
        this.tacticsType.writeToParcel(parcel, i);
        parcel.writeString(this.type);
        parcel.writeString(this.fondType);
        parcel.writeString(this.level);
        parcel.writeString(this.time);
        ArrayList<TacticsInsideItemData> arrayList = this.subData;
        if (arrayList == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(arrayList.size());
            Iterator<TacticsInsideItemData> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(parcel, i);
            }
        }
        parcel.writeString(this.schedule);
        parcel.writeInt(this.showCancel ? 1 : 0);
        parcel.writeInt(this.sideColor);
        parcel.writeInt(this.sideBgColor);
        parcel.writeString(this.adl);
        StrategyPositionResponse strategyPositionResponse = this.originPosition;
        if (strategyPositionResponse == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            strategyPositionResponse.writeToParcel(parcel, i);
        }
        parcel.writeString(this.state);
        parcel.writeString(this.completedCycles);
        parcel.writeInt(this.isActive ? 1 : 0);
        parcel.writeString(this.groupId);
    }

    public DetailsData(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, boolean z, @NotNull TacticsType tacticsType, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, ArrayList<TacticsInsideItemData> arrayList, @NotNull String str11, boolean z2, int i, int i2, @NotNull String str12, StrategyPositionResponse strategyPositionResponse, @NotNull String str13, @NotNull String str14, boolean z3, @NotNull String str15) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(tacticsType, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(str11, "");
        Intrinsics.checkNotNullParameter(str12, "");
        Intrinsics.checkNotNullParameter(str13, "");
        Intrinsics.checkNotNullParameter(str14, "");
        Intrinsics.checkNotNullParameter(str15, "");
        this.orderType = str;
        this.instId = str2;
        this.instType = str3;
        this.algoId = str4;
        this.orderId = str5;
        this.tvTitle = str6;
        this.titleRightDrawable = z;
        this.tacticsType = tacticsType;
        this.type = str7;
        this.fondType = str8;
        this.level = str9;
        this.time = str10;
        this.subData = arrayList;
        this.schedule = str11;
        this.showCancel = z2;
        this.sideColor = i;
        this.sideBgColor = i2;
        this.adl = str12;
        this.originPosition = strategyPositionResponse;
        this.state = str13;
        this.completedCycles = str14;
        this.isActive = z3;
        this.groupId = str15;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x00c8: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r51v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r28v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r51v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r29v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0014: ARITH (r51v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r30v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001c: ARITH (r51v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r31v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0024: ARITH (r51v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r32v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002c: ARITH (r51v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r33v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0034: ARITH (r51v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? false : (r34v0 boolean))
  (r35v0 com.okinc.biz.TacticsType)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003d: ARITH (r51v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r36v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0045: ARITH (r51v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? ("") : (r37v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004d: ARITH (r51v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? ("") : (r38v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0055: ARITH (r51v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? ("") : (r39v0 java.lang.String))
  (wrap:java.util.ArrayList:?: TERNARY null = ((wrap:int:0x005d: ARITH (r51v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (null java.util.ArrayList) : (r40v0 java.util.ArrayList))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0067: ARITH (r51v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? ("") : (r41v0 java.lang.String))
  (r42v0 boolean)
  (wrap:int:?: TERNARY null = ((wrap:int:0x0073: ARITH (32768 int) & (r51v0 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r43v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x007d: ARITH (65536 int) & (r51v0 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r44v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0087: ARITH (131072 int) & (r51v0 int) A[WRAPPED]) != (0 int)) ? ("") : (r45v0 java.lang.String))
  (wrap:com.okinc.unify_trade.biz.StrategyPositionResponse:?: TERNARY null = ((wrap:int:0x0091: ARITH (262144 int) & (r51v0 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.unify_trade.biz.StrategyPositionResponse) : (r46v0 com.okinc.unify_trade.biz.StrategyPositionResponse))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x009b: ARITH (524288 int) & (r51v0 int) A[WRAPPED]) != (0 int)) ? ("") : (r47v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00a5: ARITH (1048576 int) & (r51v0 int) A[WRAPPED]) != (0 int)) ? ("") : (r48v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x00af: ARITH (2097152 int) & (r51v0 int) A[WRAPPED]) != (0 int)) ? true : (r49v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00ba: ARITH (r51v0 int) & (4194304 int) A[WRAPPED]) != (0 int)) ? ("") : (r50v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, com.okinc.biz.TacticsType, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.ArrayList<com.okinc.unify_trade.bot.data.TacticsInsideItemData>, java.lang.String, boolean, int, int, java.lang.String, com.okinc.unify_trade.biz.StrategyPositionResponse, java.lang.String, java.lang.String, boolean, java.lang.String):void (m)] (LINE:691) call: com.okinc.unify_trade.bot.data.DetailsData.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, com.okinc.biz.TacticsType, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.ArrayList, java.lang.String, boolean, int, int, java.lang.String, com.okinc.unify_trade.biz.StrategyPositionResponse, java.lang.String, java.lang.String, boolean, java.lang.String):void type: THIS */
    public /* synthetic */ DetailsData(String str, String str2, String str3, String str4, String str5, String str6, boolean z, TacticsType tacticsType, String str7, String str8, String str9, String str10, ArrayList arrayList, String str11, boolean z2, int i, int i2, String str12, StrategyPositionResponse strategyPositionResponse, String str13, String str14, boolean z3, String str15, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? "" : str, (i3 & 2) != 0 ? "" : str2, (i3 & 4) != 0 ? "" : str3, (i3 & 8) != 0 ? "" : str4, (i3 & 16) != 0 ? "" : str5, (i3 & 32) != 0 ? "" : str6, (i3 & 64) != 0 ? false : z, tacticsType, (i3 & 256) != 0 ? "" : str7, (i3 & 512) != 0 ? "" : str8, (i3 & 1024) != 0 ? "" : str9, (i3 & 2048) != 0 ? "" : str10, (i3 & 4096) != 0 ? null : arrayList, (i3 & 8192) != 0 ? "" : str11, z2, (32768 & i3) != 0 ? 0 : i, (65536 & i3) != 0 ? 0 : i2, (131072 & i3) != 0 ? "" : str12, (262144 & i3) != 0 ? null : strategyPositionResponse, (524288 & i3) != 0 ? "" : str13, (1048576 & i3) != 0 ? "" : str14, (2097152 & i3) != 0 ? true : z3, (i3 & 4194304) != 0 ? "" : str15);
    }
}
