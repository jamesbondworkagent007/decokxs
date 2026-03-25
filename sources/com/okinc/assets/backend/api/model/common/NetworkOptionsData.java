package com.okinc.assets.backend.api.model.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.assets.backend.api.model.ChainData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
public final class NetworkOptionsData implements Parcelable {
    public static final Parcelable.Creator<NetworkOptionsData> CREATOR = new Creator();
    public String AEQbTJ;
    public List<ChainData> KWHzl;
    public String OLrzqt;
    public boolean copydefault;

    public static final class Creator implements Parcelable.Creator<NetworkOptionsData> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final NetworkOptionsData createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(ChainData.CREATOR.createFromParcel(parcel));
            }
            return new NetworkOptionsData(arrayList, parcel.readString(), parcel.readInt() != 0, parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final NetworkOptionsData[] newArray(int i) {
            return new NetworkOptionsData[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public NetworkOptionsData() {
        this(null, null, false, null, 15, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.assets.backend.api.model.common.NetworkOptionsData */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NetworkOptionsData copy$default(NetworkOptionsData networkOptionsData, List list, String str, boolean z, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = networkOptionsData.KWHzl;
        }
        if ((i & 2) != 0) {
            str = networkOptionsData.AEQbTJ;
        }
        if ((i & 4) != 0) {
            z = networkOptionsData.copydefault;
        }
        if ((i & 8) != 0) {
            str2 = networkOptionsData.OLrzqt;
        }
        return networkOptionsData.AEQbTJ(list, str, z, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final NetworkOptionsData AEQbTJ(@NotNull List<ChainData> list, String str, boolean z, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new NetworkOptionsData(list, str, z, str2);
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
        if (!(obj instanceof NetworkOptionsData)) {
            return false;
        }
        NetworkOptionsData networkOptionsData = (NetworkOptionsData) obj;
        return Intrinsics.EZpvd(this.KWHzl, networkOptionsData.KWHzl) && Intrinsics.EZpvd((Object) this.AEQbTJ, (Object) networkOptionsData.AEQbTJ) && this.copydefault == networkOptionsData.copydefault && Intrinsics.EZpvd((Object) this.OLrzqt, (Object) networkOptionsData.OLrzqt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.KWHzl.hashCode();
        String str = this.AEQbTJ;
        return (((((iHashCode * 31) + (str == null ? 0 : str.hashCode())) * 31) + Boolean.hashCode(this.copydefault)) * 31) + this.OLrzqt.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "NetworkOptionsData(listOfChain=" + this.KWHzl + ", currentInputAddress=" + this.AEQbTJ + ", isBtcLightningNetworkSelected=" + this.copydefault + ", currencyId=" + this.OLrzqt + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        List<ChainData> list = this.KWHzl;
        parcel.writeInt(list.size());
        Iterator<ChainData> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
        parcel.writeString(this.AEQbTJ);
        parcel.writeInt(this.copydefault ? 1 : 0);
        parcel.writeString(this.OLrzqt);
    }

    public NetworkOptionsData(@NotNull List<ChainData> list, String str, boolean z, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.KWHzl = list;
        this.AEQbTJ = str;
        this.copydefault = z;
        this.OLrzqt = str2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0019: CONSTRUCTOR 
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0006: CONSTRUCTOR  A[MD:():void (c), WRAPPED] (LINE:9) call: java.util.ArrayList.<init>():void type: CONSTRUCTOR) : (r1v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0009: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x000e: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? false : (r3v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0013: ARITH (r5v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r4v0 java.lang.String))
 A[MD:(java.util.List<com.okinc.assets.backend.api.model.ChainData>, java.lang.String, boolean, java.lang.String):void (m)] (LINE:8) call: com.okinc.assets.backend.api.model.common.NetworkOptionsData.<init>(java.util.List, java.lang.String, boolean, java.lang.String):void type: THIS */
    public /* synthetic */ NetworkOptionsData(List list, String str, boolean z, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new ArrayList() : list, (i & 2) != 0 ? null : str, (i & 4) != 0 ? false : z, (i & 8) != 0 ? "" : str2);
    }
}
