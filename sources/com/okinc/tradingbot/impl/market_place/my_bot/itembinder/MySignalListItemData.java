package com.okinc.tradingbot.impl.market_place.my_bot.itembinder;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.unify_trade.biz.CustomerSignalsItem;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class MySignalListItemData implements Parcelable {
    public static final Parcelable.Creator<MySignalListItemData> CREATOR = new Creator();
    public final boolean AEQbTJ;
    public final String EZpvd;
    public final CustomerSignalsItem KWHzl;
    public final ArrayList<SignalBtnItemData> OLrzqt;
    public final ArrayList<Object> copydefault;

    public static final class Creator implements Parcelable.Creator<MySignalListItemData> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MySignalListItemData createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "");
            boolean z = parcel.readInt() != 0;
            ArrayList arrayList2 = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(parcel.readValue(MySignalListItemData.class.getClassLoader()));
                }
            }
            if (parcel.readInt() != 0) {
                int i3 = parcel.readInt();
                arrayList2 = new ArrayList(i3);
                for (int i4 = 0; i4 != i3; i4++) {
                    arrayList2.add(SignalBtnItemData.CREATOR.createFromParcel(parcel));
                }
            }
            return new MySignalListItemData(z, arrayList, arrayList2, parcel.readString(), (CustomerSignalsItem) parcel.readParcelable(MySignalListItemData.class.getClassLoader()));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MySignalListItemData[] newArray(int i) {
            return new MySignalListItemData[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public MySignalListItemData() {
        this(false, null, null, null, null, 31, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: com.okinc.tradingbot.impl.market_place.my_bot.itembinder.MySignalListItemData */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MySignalListItemData copy$default(MySignalListItemData mySignalListItemData, boolean z, ArrayList arrayList, ArrayList arrayList2, String str, CustomerSignalsItem customerSignalsItem, int i, Object obj) {
        if ((i & 1) != 0) {
            z = mySignalListItemData.AEQbTJ;
        }
        if ((i & 2) != 0) {
            arrayList = mySignalListItemData.copydefault;
        }
        ArrayList arrayList3 = arrayList;
        if ((i & 4) != 0) {
            arrayList2 = mySignalListItemData.OLrzqt;
        }
        ArrayList arrayList4 = arrayList2;
        if ((i & 8) != 0) {
            str = mySignalListItemData.EZpvd;
        }
        String str2 = str;
        if ((i & 16) != 0) {
            customerSignalsItem = mySignalListItemData.KWHzl;
        }
        return mySignalListItemData.EZpvd(z, arrayList3, arrayList4, str2, customerSignalsItem);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MySignalListItemData EZpvd(boolean z, ArrayList<Object> arrayList, ArrayList<SignalBtnItemData> arrayList2, @NotNull String str, @NotNull CustomerSignalsItem customerSignalsItem) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(customerSignalsItem, "");
        return new MySignalListItemData(z, arrayList, arrayList2, str, customerSignalsItem);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CustomerSignalsItem EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<Object> KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String OLrzqt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<SignalBtnItemData> copydefault() {
        return this.OLrzqt;
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
        if (!(obj instanceof MySignalListItemData)) {
            return false;
        }
        MySignalListItemData mySignalListItemData = (MySignalListItemData) obj;
        return this.AEQbTJ == mySignalListItemData.AEQbTJ && Intrinsics.EZpvd(this.copydefault, mySignalListItemData.copydefault) && Intrinsics.EZpvd(this.OLrzqt, mySignalListItemData.OLrzqt) && Intrinsics.EZpvd((Object) this.EZpvd, (Object) mySignalListItemData.EZpvd) && Intrinsics.EZpvd(this.KWHzl, mySignalListItemData.KWHzl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.AEQbTJ);
        ArrayList<Object> arrayList = this.copydefault;
        int iHashCode2 = arrayList == null ? 0 : arrayList.hashCode();
        ArrayList<SignalBtnItemData> arrayList2 = this.OLrzqt;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + (arrayList2 != null ? arrayList2.hashCode() : 0)) * 31) + this.EZpvd.hashCode()) * 31) + this.KWHzl.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "MySignalListItemData(isThird=" + this.AEQbTJ + ", contentData=" + this.copydefault + ", buttonData=" + this.OLrzqt + ", signalDesc=" + this.EZpvd + ", originItemData=" + this.KWHzl + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeInt(this.AEQbTJ ? 1 : 0);
        ArrayList<Object> arrayList = this.copydefault;
        if (arrayList == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(arrayList.size());
            Iterator<Object> it = arrayList.iterator();
            while (it.hasNext()) {
                parcel.writeValue(it.next());
            }
        }
        ArrayList<SignalBtnItemData> arrayList2 = this.OLrzqt;
        if (arrayList2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(arrayList2.size());
            Iterator<SignalBtnItemData> it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                it2.next().writeToParcel(parcel, i);
            }
        }
        parcel.writeString(this.EZpvd);
        parcel.writeParcelable(this.KWHzl, i);
    }

    public MySignalListItemData(boolean z, ArrayList<Object> arrayList, ArrayList<SignalBtnItemData> arrayList2, @NotNull String str, @NotNull CustomerSignalsItem customerSignalsItem) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(customerSignalsItem, "");
        this.AEQbTJ = z;
        this.copydefault = arrayList;
        this.OLrzqt = arrayList2;
        this.EZpvd = str;
        this.KWHzl = customerSignalsItem;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x004c: CONSTRUCTOR 
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r26v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? false : (r21v0 boolean))
  (wrap:java.util.ArrayList:?: TERNARY null = ((wrap:int:0x0008: ARITH (r26v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.util.ArrayList) : (r22v0 java.util.ArrayList))
  (wrap:java.util.ArrayList:?: TERNARY null = ((wrap:int:0x0011: ARITH (r26v0 int) & (4 int) A[WRAPPED]) == (0 int)) ? (r23v0 java.util.ArrayList) : (null java.util.ArrayList))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0018: ARITH (r26v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r24v0 java.lang.String))
  (wrap:com.okinc.unify_trade.biz.CustomerSignalsItem:?: TERNARY null = ((wrap:int:0x0021: ARITH (r26v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x003a: CONSTRUCTOR 
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  false
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (4095 int)
  (wrap:kotlin.jvm.internal.DefaultConstructorMarker:?: CAST (kotlin.jvm.internal.DefaultConstructorMarker) (null kotlin.jvm.internal.DefaultConstructorMarker))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:122) call: com.okinc.unify_trade.biz.CustomerSignalsItem.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r25v0 com.okinc.unify_trade.biz.CustomerSignalsItem))
 A[MD:(boolean, java.util.ArrayList<java.lang.Object>, java.util.ArrayList<com.okinc.tradingbot.impl.market_place.my_bot.itembinder.SignalBtnItemData>, java.lang.String, com.okinc.unify_trade.biz.CustomerSignalsItem):void (m)] (LINE:117) call: com.okinc.tradingbot.impl.market_place.my_bot.itembinder.MySignalListItemData.<init>(boolean, java.util.ArrayList, java.util.ArrayList, java.lang.String, com.okinc.unify_trade.biz.CustomerSignalsItem):void type: THIS */
    public /* synthetic */ MySignalListItemData(boolean z, ArrayList arrayList, ArrayList arrayList2, String str, CustomerSignalsItem customerSignalsItem, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? null : arrayList, (i & 4) == 0 ? arrayList2 : null, (i & 8) != 0 ? "" : str, (i & 16) != 0 ? new CustomerSignalsItem((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false, (String) null, (String) null, (String) null, 4095, (DefaultConstructorMarker) null) : customerSignalsItem);
    }
}
