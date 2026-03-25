package com.okinc.tradingbot.impl.strategy.bean;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.DrawableRes;
import com.okinc.tradingbot.impl.market_place.bot_copy.itembinder.BotSwitchItemData;
import com.okinc.unify_trade.bot.constant.TacticsUiConst;
import com.okinc.unify_trade.bot.data.BotParamItemData;
import com.okinc.unify_trade.bot.data.BotRemindData;
import com.okinc.unify_trade.bot.data.ItemData;
import com.okinc.unify_trade.bot.data.ItemDataToggle;
import com.okinc.unify_trade.bot.data.TacticsInsideLineItemData;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class SignalSubsData implements Parcelable {
    public static final Parcelable.Creator<SignalSubsData> CREATOR = new Creator();
    public final BotParamItemData AEQbTJ;
    public final String AYXKKw;
    public final String AhwBna;
    public final BotRemindData EZpvd;
    public final ItemData KWHzl;
    public final int OLrzqt;
    public final BotSwitchItemData copydefault;
    public final BotParamItemData djBIcL;
    public final String gEmmrt;
    public final BotParamItemData valueOf;

    public static final class Creator implements Parcelable.Creator<SignalSubsData> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SignalSubsData createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new SignalSubsData(parcel.readString(), parcel.readString(), parcel.readString(), (BotParamItemData) parcel.readParcelable(SignalSubsData.class.getClassLoader()), (BotParamItemData) parcel.readParcelable(SignalSubsData.class.getClassLoader()), (ItemData) parcel.readParcelable(SignalSubsData.class.getClassLoader()), (BotParamItemData) parcel.readParcelable(SignalSubsData.class.getClassLoader()), parcel.readInt() == 0 ? null : BotSwitchItemData.CREATOR.createFromParcel(parcel), (BotRemindData) parcel.readParcelable(SignalSubsData.class.getClassLoader()), parcel.readInt());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SignalSubsData[] newArray(int i) {
            return new SignalSubsData[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public SignalSubsData() {
        this(null, null, null, null, null, null, null, null, null, 0, 1023, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AEQbTJ() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SignalSubsData EZpvd(@NotNull String str, @NotNull String str2, @NotNull String str3, BotParamItemData botParamItemData, BotParamItemData botParamItemData2, ItemData itemData, BotParamItemData botParamItemData3, BotSwitchItemData botSwitchItemData, BotRemindData botRemindData, @DrawableRes int i) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new SignalSubsData(str, str2, str3, botParamItemData, botParamItemData2, itemData, botParamItemData3, botSwitchItemData, botRemindData, i);
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
        if (!(obj instanceof SignalSubsData)) {
            return false;
        }
        SignalSubsData signalSubsData = (SignalSubsData) obj;
        return Intrinsics.EZpvd((Object) this.AhwBna, (Object) signalSubsData.AhwBna) && Intrinsics.EZpvd((Object) this.gEmmrt, (Object) signalSubsData.gEmmrt) && Intrinsics.EZpvd((Object) this.AYXKKw, (Object) signalSubsData.AYXKKw) && Intrinsics.EZpvd(this.valueOf, signalSubsData.valueOf) && Intrinsics.EZpvd(this.AEQbTJ, signalSubsData.AEQbTJ) && Intrinsics.EZpvd(this.KWHzl, signalSubsData.KWHzl) && Intrinsics.EZpvd(this.djBIcL, signalSubsData.djBIcL) && Intrinsics.EZpvd(this.copydefault, signalSubsData.copydefault) && Intrinsics.EZpvd(this.EZpvd, signalSubsData.EZpvd) && this.OLrzqt == signalSubsData.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.AhwBna.hashCode();
        int iHashCode2 = this.gEmmrt.hashCode();
        int iHashCode3 = this.AYXKKw.hashCode();
        BotParamItemData botParamItemData = this.valueOf;
        int iHashCode4 = botParamItemData == null ? 0 : botParamItemData.hashCode();
        BotParamItemData botParamItemData2 = this.AEQbTJ;
        int iHashCode5 = botParamItemData2 == null ? 0 : botParamItemData2.hashCode();
        ItemData itemData = this.KWHzl;
        int iHashCode6 = itemData == null ? 0 : itemData.hashCode();
        BotParamItemData botParamItemData3 = this.djBIcL;
        int iHashCode7 = botParamItemData3 == null ? 0 : botParamItemData3.hashCode();
        BotSwitchItemData botSwitchItemData = this.copydefault;
        int iHashCode8 = botSwitchItemData == null ? 0 : botSwitchItemData.hashCode();
        BotRemindData botRemindData = this.EZpvd;
        return (((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + (botRemindData != null ? botRemindData.hashCode() : 0)) * 31) + Integer.hashCode(this.OLrzqt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SignalSubsData(subsType=" + this.AhwBna + ", subsTitle=" + this.gEmmrt + ", subsTag=" + this.AYXKKw + ", subsPrice=" + this.valueOf + ", shareRatio=" + this.AEQbTJ + ", signalSource=" + this.KWHzl + ", subsValidDate=" + this.djBIcL + ", autoFee=" + this.copydefault + ", confirmTips=" + this.EZpvd + ", subsIconRes=" + this.OLrzqt + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.AhwBna);
        parcel.writeString(this.gEmmrt);
        parcel.writeString(this.AYXKKw);
        parcel.writeParcelable(this.valueOf, i);
        parcel.writeParcelable(this.AEQbTJ, i);
        parcel.writeParcelable(this.KWHzl, i);
        parcel.writeParcelable(this.djBIcL, i);
        BotSwitchItemData botSwitchItemData = this.copydefault;
        if (botSwitchItemData == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            botSwitchItemData.writeToParcel(parcel, i);
        }
        parcel.writeParcelable(this.EZpvd, i);
        parcel.writeInt(this.OLrzqt);
    }

    public SignalSubsData(@NotNull String str, @NotNull String str2, @NotNull String str3, BotParamItemData botParamItemData, BotParamItemData botParamItemData2, ItemData itemData, BotParamItemData botParamItemData3, BotSwitchItemData botSwitchItemData, BotRemindData botRemindData, @DrawableRes int i) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.AhwBna = str;
        this.gEmmrt = str2;
        this.AYXKKw = str3;
        this.valueOf = botParamItemData;
        this.AEQbTJ = botParamItemData2;
        this.KWHzl = itemData;
        this.djBIcL = botParamItemData3;
        this.copydefault = botSwitchItemData;
        this.EZpvd = botRemindData;
        this.OLrzqt = i;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0061: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r22v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r12v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r22v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r13v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0012: ARITH (r22v0 int) & (4 int) A[WRAPPED]) == (0 int)) ? (r14v0 java.lang.String) : (""))
  (wrap:com.okinc.unify_trade.bot.data.BotParamItemData:?: TERNARY null = ((wrap:int:0x0018: ARITH (r22v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.unify_trade.bot.data.BotParamItemData) : (r15v0 com.okinc.unify_trade.bot.data.BotParamItemData))
  (wrap:com.okinc.unify_trade.bot.data.BotParamItemData:?: TERNARY null = ((wrap:int:0x0020: ARITH (r22v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.unify_trade.bot.data.BotParamItemData) : (r16v0 com.okinc.unify_trade.bot.data.BotParamItemData))
  (wrap:com.okinc.unify_trade.bot.data.ItemData:?: TERNARY null = ((wrap:int:0x0028: ARITH (r22v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.unify_trade.bot.data.ItemData) : (r17v0 com.okinc.unify_trade.bot.data.ItemData))
  (wrap:com.okinc.unify_trade.bot.data.BotParamItemData:?: TERNARY null = ((wrap:int:0x0030: ARITH (r22v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.unify_trade.bot.data.BotParamItemData) : (r18v0 com.okinc.unify_trade.bot.data.BotParamItemData))
  (wrap:com.okinc.tradingbot.impl.market_place.bot_copy.itembinder.BotSwitchItemData:?: TERNARY null = ((wrap:int:0x0038: ARITH (r22v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.tradingbot.impl.market_place.bot_copy.itembinder.BotSwitchItemData) : (r19v0 com.okinc.tradingbot.impl.market_place.bot_copy.itembinder.BotSwitchItemData))
  (wrap:com.okinc.unify_trade.bot.data.BotRemindData:?: TERNARY null = ((wrap:int:0x0040: ARITH (r22v0 int) & (256 int) A[WRAPPED]) == (0 int)) ? (r20v0 com.okinc.unify_trade.bot.data.BotRemindData) : (null com.okinc.unify_trade.bot.data.BotRemindData))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0047: ARITH (r22v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (-1 int) : (r21v0 int))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, com.okinc.unify_trade.bot.data.BotParamItemData, com.okinc.unify_trade.bot.data.BotParamItemData, com.okinc.unify_trade.bot.data.ItemData, com.okinc.unify_trade.bot.data.BotParamItemData, com.okinc.tradingbot.impl.market_place.bot_copy.itembinder.BotSwitchItemData, com.okinc.unify_trade.bot.data.BotRemindData, int):void (m)] (LINE:63) call: com.okinc.tradingbot.impl.strategy.bean.SignalSubsData.<init>(java.lang.String, java.lang.String, java.lang.String, com.okinc.unify_trade.bot.data.BotParamItemData, com.okinc.unify_trade.bot.data.BotParamItemData, com.okinc.unify_trade.bot.data.ItemData, com.okinc.unify_trade.bot.data.BotParamItemData, com.okinc.tradingbot.impl.market_place.bot_copy.itembinder.BotSwitchItemData, com.okinc.unify_trade.bot.data.BotRemindData, int):void type: THIS */
    public /* synthetic */ SignalSubsData(String str, String str2, String str3, BotParamItemData botParamItemData, BotParamItemData botParamItemData2, ItemData itemData, BotParamItemData botParamItemData3, BotSwitchItemData botSwitchItemData, BotRemindData botRemindData, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) == 0 ? str3 : "", (i2 & 8) != 0 ? null : botParamItemData, (i2 & 16) != 0 ? null : botParamItemData2, (i2 & 32) != 0 ? null : itemData, (i2 & 64) != 0 ? null : botParamItemData3, (i2 & 128) != 0 ? null : botSwitchItemData, (i2 & 256) == 0 ? botRemindData : null, (i2 & 512) != 0 ? -1 : i);
    }

    public final List<Object> OLrzqt() {
        String str = this.AhwBna;
        if (Intrinsics.EZpvd((Object) str, (Object) "subscription")) {
            Parcelable[] parcelableArr = new Parcelable[6];
            BotParamItemData botParamItemData = this.valueOf;
            if (botParamItemData == null) {
                botParamItemData = new BotParamItemData(null, null, null, null, false, false, null, null, null, false, 0, 0, 0, 0, 16383, null);
            }
            parcelableArr[0] = botParamItemData;
            ItemData itemData = this.KWHzl;
            if (itemData == null) {
                itemData = new ItemData((String) null, (String) null, false, 0, (String) null, (String) null, false, false, (String) null, false, false, (String) null, (String) null, false, (String) null, (String) null, 0, false, (String) null, (String) null, (ItemDataToggle) null, (TacticsUiConst.BotListSubItemType) null, (String) null, (String) null, 16777215, (DefaultConstructorMarker) null);
            }
            parcelableArr[1] = itemData;
            BotParamItemData botParamItemData2 = this.djBIcL;
            if (botParamItemData2 == null) {
                botParamItemData2 = new BotParamItemData(null, null, null, null, false, false, null, null, null, false, 0, 0, 0, 0, 16383, null);
            }
            parcelableArr[2] = botParamItemData2;
            BotSwitchItemData botSwitchItemData = this.copydefault;
            if (botSwitchItemData == null) {
                botSwitchItemData = new BotSwitchItemData(null, null, false, 7, null);
            }
            parcelableArr[3] = botSwitchItemData;
            parcelableArr[4] = new TacticsInsideLineItemData(0, 0, 0, 7, null);
            BotRemindData botRemindData = this.EZpvd;
            if (botRemindData == null) {
                botRemindData = new BotRemindData(null, 0, 0, null, 15, null);
            }
            parcelableArr[5] = botRemindData;
            return yDY.gEmmrt(parcelableArr);
        }
        if (Intrinsics.EZpvd((Object) str, (Object) "profit_sharing")) {
            Parcelable[] parcelableArr2 = new Parcelable[4];
            BotParamItemData botParamItemData3 = this.AEQbTJ;
            if (botParamItemData3 == null) {
                botParamItemData3 = new BotParamItemData(null, null, null, null, false, false, null, null, null, false, 0, 0, 0, 0, 16383, null);
            }
            parcelableArr2[0] = botParamItemData3;
            ItemData itemData2 = this.KWHzl;
            if (itemData2 == null) {
                itemData2 = new ItemData((String) null, (String) null, false, 0, (String) null, (String) null, false, false, (String) null, false, false, (String) null, (String) null, false, (String) null, (String) null, 0, false, (String) null, (String) null, (ItemDataToggle) null, (TacticsUiConst.BotListSubItemType) null, (String) null, (String) null, 16777215, (DefaultConstructorMarker) null);
            }
            parcelableArr2[1] = itemData2;
            parcelableArr2[2] = new TacticsInsideLineItemData(0, 0, 0, 7, null);
            BotRemindData botRemindData2 = this.EZpvd;
            if (botRemindData2 == null) {
                botRemindData2 = new BotRemindData(null, 0, 0, null, 15, null);
            }
            parcelableArr2[3] = botRemindData2;
            return yDY.gEmmrt(parcelableArr2);
        }
        return yDY.AhwBna();
    }
}
