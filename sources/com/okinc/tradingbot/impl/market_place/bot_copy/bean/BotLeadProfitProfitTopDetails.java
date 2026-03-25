package com.okinc.tradingbot.impl.market_place.bot_copy.bean;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.unify_trade.biz.BotLeadProfitProfitOrderDetails;
import com.okinc.unify_trade.bot.market_place.userpage.BotLeadStrateShowData;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class BotLeadProfitProfitTopDetails implements Parcelable {
    public static final Parcelable.Creator<BotLeadProfitProfitTopDetails> CREATOR = new Creator();
    public BotLeadStrateShowData KWHzl;
    public BotLeadProfitProfitOrderDetails copydefault;

    public static final class Creator implements Parcelable.Creator<BotLeadProfitProfitTopDetails> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BotLeadProfitProfitTopDetails createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new BotLeadProfitProfitTopDetails((BotLeadProfitProfitOrderDetails) parcel.readParcelable(BotLeadProfitProfitTopDetails.class.getClassLoader()), (BotLeadStrateShowData) parcel.readParcelable(BotLeadProfitProfitTopDetails.class.getClassLoader()));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BotLeadProfitProfitTopDetails[] newArray(int i) {
            return new BotLeadProfitProfitTopDetails[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public BotLeadProfitProfitTopDetails() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ BotLeadProfitProfitTopDetails copy$default(BotLeadProfitProfitTopDetails botLeadProfitProfitTopDetails, BotLeadProfitProfitOrderDetails botLeadProfitProfitOrderDetails, BotLeadStrateShowData botLeadStrateShowData, int i, Object obj) {
        if ((i & 1) != 0) {
            botLeadProfitProfitOrderDetails = botLeadProfitProfitTopDetails.copydefault;
        }
        if ((i & 2) != 0) {
            botLeadStrateShowData = botLeadProfitProfitTopDetails.KWHzl;
        }
        return botLeadProfitProfitTopDetails.AEQbTJ(botLeadProfitProfitOrderDetails, botLeadStrateShowData);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BotLeadProfitProfitTopDetails AEQbTJ(BotLeadProfitProfitOrderDetails botLeadProfitProfitOrderDetails, BotLeadStrateShowData botLeadStrateShowData) {
        return new BotLeadProfitProfitTopDetails(botLeadProfitProfitOrderDetails, botLeadStrateShowData);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BotLeadProfitProfitOrderDetails KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BotLeadStrateShowData OLrzqt() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(BotLeadProfitProfitOrderDetails botLeadProfitProfitOrderDetails) {
        this.copydefault = botLeadProfitProfitOrderDetails;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(BotLeadStrateShowData botLeadStrateShowData) {
        this.KWHzl = botLeadStrateShowData;
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
        if (!(obj instanceof BotLeadProfitProfitTopDetails)) {
            return false;
        }
        BotLeadProfitProfitTopDetails botLeadProfitProfitTopDetails = (BotLeadProfitProfitTopDetails) obj;
        return Intrinsics.EZpvd(this.copydefault, botLeadProfitProfitTopDetails.copydefault) && Intrinsics.EZpvd(this.KWHzl, botLeadProfitProfitTopDetails.KWHzl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        BotLeadProfitProfitOrderDetails botLeadProfitProfitOrderDetails = this.copydefault;
        int iHashCode = botLeadProfitProfitOrderDetails == null ? 0 : botLeadProfitProfitOrderDetails.hashCode();
        BotLeadStrateShowData botLeadStrateShowData = this.KWHzl;
        return (iHashCode * 31) + (botLeadStrateShowData != null ? botLeadStrateShowData.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "BotLeadProfitProfitTopDetails(orderData=" + this.copydefault + ", haderData=" + this.KWHzl + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeParcelable(this.copydefault, i);
        parcel.writeParcelable(this.KWHzl, i);
    }

    public BotLeadProfitProfitTopDetails(BotLeadProfitProfitOrderDetails botLeadProfitProfitOrderDetails, BotLeadStrateShowData botLeadStrateShowData) {
        this.copydefault = botLeadProfitProfitOrderDetails;
        this.KWHzl = botLeadStrateShowData;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:com.okinc.unify_trade.biz.BotLeadProfitProfitOrderDetails:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.unify_trade.biz.BotLeadProfitProfitOrderDetails) : (r2v0 com.okinc.unify_trade.biz.BotLeadProfitProfitOrderDetails))
  (wrap:com.okinc.unify_trade.bot.market_place.userpage.BotLeadStrateShowData:?: TERNARY null = ((wrap:int:0x0006: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.unify_trade.bot.market_place.userpage.BotLeadStrateShowData) : (r3v0 com.okinc.unify_trade.bot.market_place.userpage.BotLeadStrateShowData))
 A[MD:(com.okinc.unify_trade.biz.BotLeadProfitProfitOrderDetails, com.okinc.unify_trade.bot.market_place.userpage.BotLeadStrateShowData):void (m)] (LINE:41) call: com.okinc.tradingbot.impl.market_place.bot_copy.bean.BotLeadProfitProfitTopDetails.<init>(com.okinc.unify_trade.biz.BotLeadProfitProfitOrderDetails, com.okinc.unify_trade.bot.market_place.userpage.BotLeadStrateShowData):void type: THIS */
    public /* synthetic */ BotLeadProfitProfitTopDetails(BotLeadProfitProfitOrderDetails botLeadProfitProfitOrderDetails, BotLeadStrateShowData botLeadStrateShowData, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : botLeadProfitProfitOrderDetails, (i & 2) != 0 ? null : botLeadStrateShowData);
    }
}
