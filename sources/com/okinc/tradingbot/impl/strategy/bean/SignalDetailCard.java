package com.okinc.tradingbot.impl.strategy.bean;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.unify_trade.biz.SignalDetails;
import com.okinc.unify_trade.bot.data.BotParamItemData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public final class SignalDetailCard implements Parcelable {
    public static final Parcelable.Creator<SignalDetailCard> CREATOR = new Creator();
    public final String AEQbTJ;
    public final List<String> AYXKKw;
    public final String EZpvd;
    public final List<BotParamItemData> KWHzl;
    public final List<String> OLrzqt;
    public final SignalDetails copydefault;
    public final String gEmmrt;

    /* JADX INFO: loaded from: classes19.dex */
    public static final class Creator implements Parcelable.Creator<SignalDetailCard> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SignalDetailCard createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            SignalDetails signalDetails = (SignalDetails) parcel.readParcelable(SignalDetailCard.class.getClassLoader());
            String string = parcel.readString();
            String string2 = parcel.readString();
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(parcel.readParcelable(SignalDetailCard.class.getClassLoader()));
            }
            return new SignalDetailCard(signalDetails, string, string2, arrayListCreateStringArrayList, arrayList, parcel.createStringArrayList(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SignalDetailCard[] newArray(int i) {
            return new SignalDetailCard[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: com.okinc.tradingbot.impl.strategy.bean.SignalDetailCard */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SignalDetailCard copy$default(SignalDetailCard signalDetailCard, SignalDetails signalDetails, String str, String str2, List list, List list2, List list3, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            signalDetails = signalDetailCard.copydefault;
        }
        if ((i & 2) != 0) {
            str = signalDetailCard.EZpvd;
        }
        String str4 = str;
        if ((i & 4) != 0) {
            str2 = signalDetailCard.AEQbTJ;
        }
        String str5 = str2;
        if ((i & 8) != 0) {
            list = signalDetailCard.AYXKKw;
        }
        List list4 = list;
        if ((i & 16) != 0) {
            list2 = signalDetailCard.KWHzl;
        }
        List list5 = list2;
        if ((i & 32) != 0) {
            list3 = signalDetailCard.OLrzqt;
        }
        List list6 = list3;
        if ((i & 64) != 0) {
            str3 = signalDetailCard.gEmmrt;
        }
        return signalDetailCard.OLrzqt(signalDetails, str4, str5, list4, list5, list6, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SignalDetails AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> AhwBna() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> EZpvd() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SignalDetailCard OLrzqt(@NotNull SignalDetails signalDetails, @NotNull String str, @NotNull String str2, @NotNull List<String> list, @NotNull List<BotParamItemData> list2, @NotNull List<String> list3, String str3) {
        Intrinsics.checkNotNullParameter(signalDetails, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(list3, "");
        return new SignalDetailCard(signalDetails, str, str2, list, list2, list3, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<BotParamItemData> OLrzqt() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String copydefault() {
        return this.EZpvd;
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
        if (!(obj instanceof SignalDetailCard)) {
            return false;
        }
        SignalDetailCard signalDetailCard = (SignalDetailCard) obj;
        return Intrinsics.EZpvd(this.copydefault, signalDetailCard.copydefault) && Intrinsics.EZpvd((Object) this.EZpvd, (Object) signalDetailCard.EZpvd) && Intrinsics.EZpvd((Object) this.AEQbTJ, (Object) signalDetailCard.AEQbTJ) && Intrinsics.EZpvd(this.AYXKKw, signalDetailCard.AYXKKw) && Intrinsics.EZpvd(this.KWHzl, signalDetailCard.KWHzl) && Intrinsics.EZpvd(this.OLrzqt, signalDetailCard.OLrzqt) && Intrinsics.EZpvd((Object) this.gEmmrt, (Object) signalDetailCard.gEmmrt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.copydefault.hashCode();
        int iHashCode2 = this.EZpvd.hashCode();
        int iHashCode3 = this.AEQbTJ.hashCode();
        int iHashCode4 = this.AYXKKw.hashCode();
        int iHashCode5 = this.KWHzl.hashCode();
        int iHashCode6 = this.OLrzqt.hashCode();
        String str = this.gEmmrt;
        return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + (str == null ? 0 : str.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SignalDetailCard(details=" + this.copydefault + ", signalTitle=" + this.EZpvd + ", signalDesc=" + this.AEQbTJ + ", tagList=" + this.AYXKKw + ", signalParam=" + this.KWHzl + ", iconList=" + this.OLrzqt + ", tickType=" + this.gEmmrt + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeParcelable(this.copydefault, i);
        parcel.writeString(this.EZpvd);
        parcel.writeString(this.AEQbTJ);
        parcel.writeStringList(this.AYXKKw);
        List<BotParamItemData> list = this.KWHzl;
        parcel.writeInt(list.size());
        Iterator<BotParamItemData> it = list.iterator();
        while (it.hasNext()) {
            parcel.writeParcelable(it.next(), i);
        }
        parcel.writeStringList(this.OLrzqt);
        parcel.writeString(this.gEmmrt);
    }

    public SignalDetailCard(@NotNull SignalDetails signalDetails, @NotNull String str, @NotNull String str2, @NotNull List<String> list, @NotNull List<BotParamItemData> list2, @NotNull List<String> list3, String str3) {
        Intrinsics.checkNotNullParameter(signalDetails, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(list3, "");
        this.copydefault = signalDetails;
        this.EZpvd = str;
        this.AEQbTJ = str2;
        this.AYXKKw = list;
        this.KWHzl = list2;
        this.OLrzqt = list3;
        this.gEmmrt = str3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x003c: CONSTRUCTOR 
  (r7v0 com.okinc.unify_trade.biz.SignalDetails)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r14v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r8v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0009: ARITH (r14v0 int) & (4 int) A[WRAPPED]) == (0 int)) ? (r9v0 java.lang.String) : (""))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x000f: ARITH (r14v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0013: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:23)) : (r10v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0019: ARITH (r14v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x001d: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:24)) : (r11v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0023: ARITH (r14v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0027: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:25)) : (r12v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002d: ARITH (r14v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r13v0 java.lang.String))
 A[MD:(com.okinc.unify_trade.biz.SignalDetails, java.lang.String, java.lang.String, java.util.List<java.lang.String>, java.util.List<com.okinc.unify_trade.bot.data.BotParamItemData>, java.util.List<java.lang.String>, java.lang.String):void (m)] (LINE:19) call: com.okinc.tradingbot.impl.strategy.bean.SignalDetailCard.<init>(com.okinc.unify_trade.biz.SignalDetails, java.lang.String, java.lang.String, java.util.List, java.util.List, java.util.List, java.lang.String):void type: THIS */
    public /* synthetic */ SignalDetailCard(SignalDetails signalDetails, String str, String str2, List list, List list2, List list3, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(signalDetails, (i & 2) != 0 ? "" : str, (i & 4) == 0 ? str2 : "", (i & 8) != 0 ? yDY.AhwBna() : list, (i & 16) != 0 ? yDY.AhwBna() : list2, (i & 32) != 0 ? yDY.AhwBna() : list3, (i & 64) != 0 ? null : str3);
    }
}
