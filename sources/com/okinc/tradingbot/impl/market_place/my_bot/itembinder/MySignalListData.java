package com.okinc.tradingbot.impl.market_place.my_bot.itembinder;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class MySignalListData implements Parcelable {
    public static final Parcelable.Creator<MySignalListData> CREATOR = new Creator();
    public ArrayList<MySignalListItemData> EZpvd;
    public String OLrzqt;
    public String copydefault;

    public static final class Creator implements Parcelable.Creator<MySignalListData> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MySignalListData createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(MySignalListItemData.CREATOR.createFromParcel(parcel));
            }
            return new MySignalListData(string, string2, arrayList);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MySignalListData[] newArray(int i) {
            return new MySignalListData[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public MySignalListData() {
        this(null, null, null, 7, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.tradingbot.impl.market_place.my_bot.itembinder.MySignalListData */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MySignalListData copy$default(MySignalListData mySignalListData, String str, String str2, ArrayList arrayList, int i, Object obj) {
        if ((i & 1) != 0) {
            str = mySignalListData.OLrzqt;
        }
        if ((i & 2) != 0) {
            str2 = mySignalListData.copydefault;
        }
        if ((i & 4) != 0) {
            arrayList = mySignalListData.EZpvd;
        }
        return mySignalListData.copydefault(str, str2, arrayList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(String str) {
        this.copydefault = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(@NotNull ArrayList<MySignalListItemData> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        this.EZpvd = arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MySignalListData copydefault(String str, String str2, @NotNull ArrayList<MySignalListItemData> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        return new MySignalListData(str, str2, arrayList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<MySignalListItemData> copydefault() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(String str) {
        this.OLrzqt = str;
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
        if (!(obj instanceof MySignalListData)) {
            return false;
        }
        MySignalListData mySignalListData = (MySignalListData) obj;
        return Intrinsics.EZpvd((Object) this.OLrzqt, (Object) mySignalListData.OLrzqt) && Intrinsics.EZpvd((Object) this.copydefault, (Object) mySignalListData.copydefault) && Intrinsics.EZpvd(this.EZpvd, mySignalListData.EZpvd);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.OLrzqt;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.copydefault;
        return (((iHashCode * 31) + (str2 != null ? str2.hashCode() : 0)) * 31) + this.EZpvd.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "MySignalListData(totalCount=" + this.OLrzqt + ", page=" + this.copydefault + ", signals=" + this.EZpvd + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.OLrzqt);
        parcel.writeString(this.copydefault);
        ArrayList<MySignalListItemData> arrayList = this.EZpvd;
        parcel.writeInt(arrayList.size());
        Iterator<MySignalListItemData> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
    }

    public MySignalListData(String str, String str2, @NotNull ArrayList<MySignalListItemData> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        this.OLrzqt = str;
        this.copydefault = str2;
        this.EZpvd = arrayList;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0014: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
  (wrap:java.util.ArrayList:?: TERNARY null = ((wrap:int:0x000b: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.ArrayList:0x0011: CONSTRUCTOR  A[MD:():void (c), WRAPPED] (LINE:113) call: java.util.ArrayList.<init>():void type: CONSTRUCTOR) : (r4v0 java.util.ArrayList))
 A[MD:(java.lang.String, java.lang.String, java.util.ArrayList<com.okinc.tradingbot.impl.market_place.my_bot.itembinder.MySignalListItemData>):void (m)] (LINE:110) call: com.okinc.tradingbot.impl.market_place.my_bot.itembinder.MySignalListData.<init>(java.lang.String, java.lang.String, java.util.ArrayList):void type: THIS */
    public /* synthetic */ MySignalListData(String str, String str2, ArrayList arrayList, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? new ArrayList() : arrayList);
    }
}
