package com.okinc.unify_trade.biz;

import android.os.Parcel;
import android.os.Parcelable;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C33129mqd;
import o.xMR;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes24.dex */
public final class Mr1Scenarios implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<Mr1Scenarios> CREATOR = new Creator();
    private final ArrayList<HashMap<String, String>> volSame;
    private final ArrayList<HashMap<String, String>> volShockDown;
    private final ArrayList<HashMap<String, String>> volShockUp;

    public static final class Creator implements Parcelable.Creator<Mr1Scenarios> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Mr1Scenarios createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            Intrinsics.checkNotNullParameter(parcel, "");
            ArrayList arrayList3 = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    int i3 = parcel.readInt();
                    HashMap map = new HashMap(i3);
                    for (int i4 = 0; i4 != i3; i4++) {
                        map.put(parcel.readString(), parcel.readString());
                    }
                    arrayList.add(map);
                }
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int i5 = parcel.readInt();
                arrayList2 = new ArrayList(i5);
                for (int i6 = 0; i6 != i5; i6++) {
                    int i7 = parcel.readInt();
                    HashMap map2 = new HashMap(i7);
                    for (int i8 = 0; i8 != i7; i8++) {
                        map2.put(parcel.readString(), parcel.readString());
                    }
                    arrayList2.add(map2);
                }
            }
            if (parcel.readInt() != 0) {
                int i9 = parcel.readInt();
                arrayList3 = new ArrayList(i9);
                for (int i10 = 0; i10 != i9; i10++) {
                    int i11 = parcel.readInt();
                    HashMap map3 = new HashMap(i11);
                    for (int i12 = 0; i12 != i11; i12++) {
                        map3.put(parcel.readString(), parcel.readString());
                    }
                    arrayList3.add(map3);
                }
            }
            return new Mr1Scenarios(arrayList, arrayList2, arrayList3);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Mr1Scenarios[] newArray(int i) {
            return new Mr1Scenarios[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public Mr1Scenarios() {
        this(null, null, null, 7, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.unify_trade.biz.Mr1Scenarios */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Mr1Scenarios copy$default(Mr1Scenarios mr1Scenarios, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, int i, Object obj) {
        if ((i & 1) != 0) {
            arrayList = mr1Scenarios.volShockDown;
        }
        if ((i & 2) != 0) {
            arrayList2 = mr1Scenarios.volSame;
        }
        if ((i & 4) != 0) {
            arrayList3 = mr1Scenarios.volShockUp;
        }
        return mr1Scenarios.copy(arrayList, arrayList2, arrayList3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<HashMap<String, String>> component1() {
        return this.volShockDown;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<HashMap<String, String>> component2() {
        return this.volSame;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<HashMap<String, String>> component3() {
        return this.volShockUp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Mr1Scenarios copy(ArrayList<HashMap<String, String>> arrayList, ArrayList<HashMap<String, String>> arrayList2, ArrayList<HashMap<String, String>> arrayList3) {
        return new Mr1Scenarios(arrayList, arrayList2, arrayList3);
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
        if (!(obj instanceof Mr1Scenarios)) {
            return false;
        }
        Mr1Scenarios mr1Scenarios = (Mr1Scenarios) obj;
        return Intrinsics.EZpvd(this.volShockDown, mr1Scenarios.volShockDown) && Intrinsics.EZpvd(this.volSame, mr1Scenarios.volSame) && Intrinsics.EZpvd(this.volShockUp, mr1Scenarios.volShockUp);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<HashMap<String, String>> getVolSame() {
        return this.volSame;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<HashMap<String, String>> getVolShockDown() {
        return this.volShockDown;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<HashMap<String, String>> getVolShockUp() {
        return this.volShockUp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        ArrayList<HashMap<String, String>> arrayList = this.volShockDown;
        int iHashCode = arrayList == null ? 0 : arrayList.hashCode();
        ArrayList<HashMap<String, String>> arrayList2 = this.volSame;
        int iHashCode2 = arrayList2 == null ? 0 : arrayList2.hashCode();
        ArrayList<HashMap<String, String>> arrayList3 = this.volShockUp;
        return (((iHashCode * 31) + iHashCode2) * 31) + (arrayList3 != null ? arrayList3.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "Mr1Scenarios(volShockDown=" + this.volShockDown + ", volSame=" + this.volSame + ", volShockUp=" + this.volShockUp + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        ArrayList<HashMap<String, String>> arrayList = this.volShockDown;
        if (arrayList == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(arrayList.size());
            for (HashMap<String, String> map : arrayList) {
                parcel.writeInt(map.size());
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    parcel.writeString(entry.getKey());
                    parcel.writeString(entry.getValue());
                }
            }
        }
        ArrayList<HashMap<String, String>> arrayList2 = this.volSame;
        if (arrayList2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(arrayList2.size());
            for (HashMap<String, String> map2 : arrayList2) {
                parcel.writeInt(map2.size());
                for (Map.Entry<String, String> entry2 : map2.entrySet()) {
                    parcel.writeString(entry2.getKey());
                    parcel.writeString(entry2.getValue());
                }
            }
        }
        ArrayList<HashMap<String, String>> arrayList3 = this.volShockUp;
        if (arrayList3 == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(arrayList3.size());
        for (HashMap<String, String> map3 : arrayList3) {
            parcel.writeInt(map3.size());
            for (Map.Entry<String, String> entry3 : map3.entrySet()) {
                parcel.writeString(entry3.getKey());
                parcel.writeString(entry3.getValue());
            }
        }
    }

    public Mr1Scenarios(ArrayList<HashMap<String, String>> arrayList, ArrayList<HashMap<String, String>> arrayList2, ArrayList<HashMap<String, String>> arrayList3) {
        this.volShockDown = arrayList;
        this.volSame = arrayList2;
        this.volShockUp = arrayList3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (wrap:java.util.ArrayList:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.util.ArrayList) : (r2v0 java.util.ArrayList))
  (wrap:java.util.ArrayList:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.util.ArrayList) : (r3v0 java.util.ArrayList))
  (wrap:java.util.ArrayList:?: TERNARY null = ((wrap:int:0x000b: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.util.ArrayList) : (r4v0 java.util.ArrayList))
 A[MD:(java.util.ArrayList<java.util.HashMap<java.lang.String, java.lang.String>>, java.util.ArrayList<java.util.HashMap<java.lang.String, java.lang.String>>, java.util.ArrayList<java.util.HashMap<java.lang.String, java.lang.String>>):void (m)] (LINE:1297) call: com.okinc.unify_trade.biz.Mr1Scenarios.<init>(java.util.ArrayList, java.util.ArrayList, java.util.ArrayList):void type: THIS */
    public /* synthetic */ Mr1Scenarios(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : arrayList, (i & 2) != 0 ? null : arrayList2, (i & 4) != 0 ? null : arrayList3);
    }

    public final String getKeyByIndex(int i) {
        HashMap map;
        Set setKeySet;
        xMR xmr = xMR.copydefault;
        ArrayList<HashMap<String, String>> arrayList = this.volShockDown;
        String str = (arrayList == null || (map = (HashMap) CollectionsKt___CollectionsKt.AkhnZx(arrayList, i)) == null || (setKeySet = map.keySet()) == null) ? null : (String) CollectionsKt___CollectionsKt.gEmmrt(setKeySet, 0);
        if (str == null) {
            str = "";
        }
        return xmr.AEQbTJ(str, 0, RoundingMode.DOWN);
    }

    public final String getDownValByIndex(int i) {
        HashMap map;
        Collection collectionValues;
        ArrayList<HashMap<String, String>> arrayList = this.volShockDown;
        String str = (arrayList == null || (map = (HashMap) CollectionsKt___CollectionsKt.AkhnZx(arrayList, i)) == null || (collectionValues = map.values()) == null) ? null : (String) CollectionsKt___CollectionsKt.gEmmrt(collectionValues, 0);
        if (str == null) {
            str = "";
        }
        return getFormattedValue(str);
    }

    public final String getSameValByIndex(int i) {
        HashMap map;
        Collection collectionValues;
        ArrayList<HashMap<String, String>> arrayList = this.volSame;
        String str = (arrayList == null || (map = (HashMap) CollectionsKt___CollectionsKt.AkhnZx(arrayList, i)) == null || (collectionValues = map.values()) == null) ? null : (String) CollectionsKt___CollectionsKt.gEmmrt(collectionValues, 0);
        if (str == null) {
            str = "";
        }
        return getFormattedValue(str);
    }

    public final String getUpValByIndex(int i) {
        HashMap map;
        Collection collectionValues;
        ArrayList<HashMap<String, String>> arrayList = this.volShockUp;
        String str = (arrayList == null || (map = (HashMap) CollectionsKt___CollectionsKt.AkhnZx(arrayList, i)) == null || (collectionValues = map.values()) == null) ? null : (String) CollectionsKt___CollectionsKt.gEmmrt(collectionValues, 0);
        if (str == null) {
            str = "";
        }
        return getFormattedValue(str);
    }

    private final String getFormattedValue(String str) {
        if (C33129mqd.gEmmrt(Double.valueOf(Math.abs(C33129mqd.AEQbTJ(str))), Double.valueOf(1.0d))) {
            return xMR.copydefault.EZpvd(str, 8, RoundingMode.DOWN);
        }
        return xMR.copydefault.EZpvd(str, 4, RoundingMode.DOWN);
    }
}
