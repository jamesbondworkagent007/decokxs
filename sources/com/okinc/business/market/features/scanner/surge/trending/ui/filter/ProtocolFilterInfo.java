package com.okinc.business.market.features.scanner.surge.trending.ui.filter;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class ProtocolFilterInfo implements Parcelable {
    public static final Parcelable.Creator<ProtocolFilterInfo> CREATOR = new Creator();
    public final List<String> AEQbTJ;
    public final String OLrzqt;
    public final List<String> copydefault;

    public static final class Creator implements Parcelable.Creator<ProtocolFilterInfo> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ProtocolFilterInfo createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new ProtocolFilterInfo(parcel.readString(), parcel.createStringArrayList(), parcel.createStringArrayList());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ProtocolFilterInfo[] newArray(int i) {
            return new ProtocolFilterInfo[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ProtocolFilterInfo() {
        this(null, null, null, 7, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.market.features.scanner.surge.trending.ui.filter.ProtocolFilterInfo */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ProtocolFilterInfo copy$default(ProtocolFilterInfo protocolFilterInfo, String str, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = protocolFilterInfo.OLrzqt;
        }
        if ((i & 2) != 0) {
            list = protocolFilterInfo.copydefault;
        }
        if ((i & 4) != 0) {
            list2 = protocolFilterInfo.AEQbTJ;
        }
        return protocolFilterInfo.copydefault(str, list, list2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ProtocolFilterInfo copydefault(@NotNull String str, @NotNull List<String> list, @NotNull List<String> list2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        return new ProtocolFilterInfo(str, list, list2);
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
        if (!(obj instanceof ProtocolFilterInfo)) {
            return false;
        }
        ProtocolFilterInfo protocolFilterInfo = (ProtocolFilterInfo) obj;
        return Intrinsics.EZpvd((Object) this.OLrzqt, (Object) protocolFilterInfo.OLrzqt) && Intrinsics.EZpvd(this.copydefault, protocolFilterInfo.copydefault) && Intrinsics.EZpvd(this.AEQbTJ, protocolFilterInfo.AEQbTJ);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.OLrzqt.hashCode() * 31) + this.copydefault.hashCode()) * 31) + this.AEQbTJ.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ProtocolFilterInfo(chainId=" + this.OLrzqt + ", protocolIdList=" + this.copydefault + ", defaultProtocolIdList=" + this.AEQbTJ + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.OLrzqt);
        parcel.writeStringList(this.copydefault);
        parcel.writeStringList(this.AEQbTJ);
    }

    public ProtocolFilterInfo(@NotNull String str, @NotNull List<String> list, @NotNull List<String> list2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        this.OLrzqt = str;
        this.copydefault = list;
        this.AEQbTJ = list2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0016: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r1v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0006: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x000a: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:39)) : (r2v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x000e: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0012: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:40)) : (r3v0 java.util.List))
 A[MD:(java.lang.String, java.util.List<java.lang.String>, java.util.List<java.lang.String>):void (m)] (LINE:37) call: com.okinc.business.market.features.scanner.surge.trending.ui.filter.ProtocolFilterInfo.<init>(java.lang.String, java.util.List, java.util.List):void type: THIS */
    public /* synthetic */ ProtocolFilterInfo(String str, List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? yDY.AhwBna() : list, (i & 4) != 0 ? yDY.AhwBna() : list2);
    }
}
