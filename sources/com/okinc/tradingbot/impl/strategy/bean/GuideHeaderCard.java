package com.okinc.tradingbot.impl.strategy.bean;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public final class GuideHeaderCard implements Parcelable {
    public static final Parcelable.Creator<GuideHeaderCard> CREATOR = new Creator();
    public final String AEQbTJ;
    public final String AYXKKw;
    public final GuideHeaderItem EZpvd;
    public final GuideHeaderItem KWHzl;
    public final String OLrzqt;
    public final boolean copydefault;
    public final GuideHeaderItem gEmmrt;
    public final List<Tag> valueOf;

    /* JADX INFO: loaded from: classes19.dex */
    public static final class Creator implements Parcelable.Creator<GuideHeaderCard> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final GuideHeaderCard createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(parcel.readParcelable(GuideHeaderCard.class.getClassLoader()));
            }
            return new GuideHeaderCard(string, arrayList, parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : GuideHeaderItem.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : GuideHeaderItem.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? GuideHeaderItem.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final GuideHeaderCard[] newArray(int i) {
            return new GuideHeaderCard[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public GuideHeaderCard() {
        this(null, null, null, null, null, null, null, false, 255, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GuideHeaderItem AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GuideHeaderItem AhwBna() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GuideHeaderItem EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String KWHzl() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GuideHeaderCard OLrzqt(@NotNull String str, @NotNull List<? extends Tag> list, @NotNull String str2, @NotNull String str3, GuideHeaderItem guideHeaderItem, GuideHeaderItem guideHeaderItem2, GuideHeaderItem guideHeaderItem3, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new GuideHeaderCard(str, list, str2, str3, guideHeaderItem, guideHeaderItem2, guideHeaderItem3, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String OLrzqt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Tag> copydefault() {
        return this.valueOf;
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
        if (!(obj instanceof GuideHeaderCard)) {
            return false;
        }
        GuideHeaderCard guideHeaderCard = (GuideHeaderCard) obj;
        return Intrinsics.EZpvd((Object) this.OLrzqt, (Object) guideHeaderCard.OLrzqt) && Intrinsics.EZpvd(this.valueOf, guideHeaderCard.valueOf) && Intrinsics.EZpvd((Object) this.AYXKKw, (Object) guideHeaderCard.AYXKKw) && Intrinsics.EZpvd((Object) this.AEQbTJ, (Object) guideHeaderCard.AEQbTJ) && Intrinsics.EZpvd(this.KWHzl, guideHeaderCard.KWHzl) && Intrinsics.EZpvd(this.gEmmrt, guideHeaderCard.gEmmrt) && Intrinsics.EZpvd(this.EZpvd, guideHeaderCard.EZpvd) && this.copydefault == guideHeaderCard.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean gEmmrt() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.OLrzqt.hashCode();
        int iHashCode2 = this.valueOf.hashCode();
        int iHashCode3 = this.AYXKKw.hashCode();
        int iHashCode4 = this.AEQbTJ.hashCode();
        GuideHeaderItem guideHeaderItem = this.KWHzl;
        int iHashCode5 = guideHeaderItem == null ? 0 : guideHeaderItem.hashCode();
        GuideHeaderItem guideHeaderItem2 = this.gEmmrt;
        int iHashCode6 = guideHeaderItem2 == null ? 0 : guideHeaderItem2.hashCode();
        GuideHeaderItem guideHeaderItem3 = this.EZpvd;
        return (((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + (guideHeaderItem3 != null ? guideHeaderItem3.hashCode() : 0)) * 31) + Boolean.hashCode(this.copydefault);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "GuideHeaderCard(guideTitle=" + this.OLrzqt + ", tagList=" + this.valueOf + ", tradeIconUrl=" + this.AYXKKw + ", quoteIconUrl=" + this.AEQbTJ + ", annualizedRate=" + this.KWHzl + ", userCount=" + this.gEmmrt + ", runningAssets=" + this.EZpvd + ", isShowStatistics=" + this.copydefault + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String valueOf() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.OLrzqt);
        List<Tag> list = this.valueOf;
        parcel.writeInt(list.size());
        Iterator<Tag> it = list.iterator();
        while (it.hasNext()) {
            parcel.writeParcelable(it.next(), i);
        }
        parcel.writeString(this.AYXKKw);
        parcel.writeString(this.AEQbTJ);
        GuideHeaderItem guideHeaderItem = this.KWHzl;
        if (guideHeaderItem == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            guideHeaderItem.writeToParcel(parcel, i);
        }
        GuideHeaderItem guideHeaderItem2 = this.gEmmrt;
        if (guideHeaderItem2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            guideHeaderItem2.writeToParcel(parcel, i);
        }
        GuideHeaderItem guideHeaderItem3 = this.EZpvd;
        if (guideHeaderItem3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            guideHeaderItem3.writeToParcel(parcel, i);
        }
        parcel.writeInt(this.copydefault ? 1 : 0);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.util.List<? extends com.okinc.tradingbot.impl.strategy.bean.Tag> */
    /* JADX WARN: Multi-variable type inference failed */
    public GuideHeaderCard(@NotNull String str, @NotNull List<? extends Tag> list, @NotNull String str2, @NotNull String str3, GuideHeaderItem guideHeaderItem, GuideHeaderItem guideHeaderItem2, GuideHeaderItem guideHeaderItem3, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.OLrzqt = str;
        this.valueOf = list;
        this.AYXKKw = str2;
        this.AEQbTJ = str3;
        this.KWHzl = guideHeaderItem;
        this.gEmmrt = guideHeaderItem2;
        this.EZpvd = guideHeaderItem3;
        this.copydefault = z;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x004c: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r18v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r10v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x000b: ARITH (r18v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x000f: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:17)) : (r11v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0015: ARITH (r18v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r12v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001c: ARITH (r18v0 int) & (8 int) A[WRAPPED]) == (0 int)) ? (r13v0 java.lang.String) : (""))
  (wrap:com.okinc.tradingbot.impl.strategy.bean.GuideHeaderItem:?: TERNARY null = ((wrap:int:0x0022: ARITH (r18v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.tradingbot.impl.strategy.bean.GuideHeaderItem) : (r14v0 com.okinc.tradingbot.impl.strategy.bean.GuideHeaderItem))
  (wrap:com.okinc.tradingbot.impl.strategy.bean.GuideHeaderItem:?: TERNARY null = ((wrap:int:0x002a: ARITH (r18v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.tradingbot.impl.strategy.bean.GuideHeaderItem) : (r15v0 com.okinc.tradingbot.impl.strategy.bean.GuideHeaderItem))
  (wrap:com.okinc.tradingbot.impl.strategy.bean.GuideHeaderItem:?: TERNARY null = ((wrap:int:0x0031: ARITH (r18v0 int) & (64 int) A[WRAPPED]) == (0 int)) ? (r16v0 com.okinc.tradingbot.impl.strategy.bean.GuideHeaderItem) : (null com.okinc.tradingbot.impl.strategy.bean.GuideHeaderItem))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0038: ARITH (r18v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? true : (r17v0 boolean))
 A[MD:(java.lang.String, java.util.List<? extends com.okinc.tradingbot.impl.strategy.bean.Tag>, java.lang.String, java.lang.String, com.okinc.tradingbot.impl.strategy.bean.GuideHeaderItem, com.okinc.tradingbot.impl.strategy.bean.GuideHeaderItem, com.okinc.tradingbot.impl.strategy.bean.GuideHeaderItem, boolean):void (m)] (LINE:15) call: com.okinc.tradingbot.impl.strategy.bean.GuideHeaderCard.<init>(java.lang.String, java.util.List, java.lang.String, java.lang.String, com.okinc.tradingbot.impl.strategy.bean.GuideHeaderItem, com.okinc.tradingbot.impl.strategy.bean.GuideHeaderItem, com.okinc.tradingbot.impl.strategy.bean.GuideHeaderItem, boolean):void type: THIS */
    public /* synthetic */ GuideHeaderCard(String str, List list, String str2, String str3, GuideHeaderItem guideHeaderItem, GuideHeaderItem guideHeaderItem2, GuideHeaderItem guideHeaderItem3, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? yDY.AhwBna() : list, (i & 4) != 0 ? "" : str2, (i & 8) == 0 ? str3 : "", (i & 16) != 0 ? null : guideHeaderItem, (i & 32) != 0 ? null : guideHeaderItem2, (i & 64) == 0 ? guideHeaderItem3 : null, (i & 128) != 0 ? true : z);
    }
}
