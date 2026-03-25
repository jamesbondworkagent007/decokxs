package com.okinc.crcore.shared.net.responsebean;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.crcore.coreapi.net.responsebean.SectorItemResponseBean;
import com.okinc.crcore.coreapi.net.responsebean.SectorListResponseBean;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C56403yEb;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class SectorListBean implements Parcelable {
    private final String sectorKey;
    private final List<SectorItemBean> underlyingList;
    public static final ActionBar Companion = new ActionBar(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<SectorListBean> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<SectorListBean> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SectorListBean createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(SectorItemBean.CREATOR.createFromParcel(parcel));
            }
            return new SectorListBean(string, arrayList);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SectorListBean[] newArray(int i) {
            return new SectorListBean[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public SectorListBean() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.crcore.shared.net.responsebean.SectorListBean */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SectorListBean copy$default(SectorListBean sectorListBean, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = sectorListBean.sectorKey;
        }
        if ((i & 2) != 0) {
            list = sectorListBean.underlyingList;
        }
        return sectorListBean.copy(str, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.sectorKey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<SectorItemBean> component2() {
        return this.underlyingList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SectorListBean copy(@NotNull String str, @NotNull List<SectorItemBean> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        return new SectorListBean(str, list);
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
        if (!(obj instanceof SectorListBean)) {
            return false;
        }
        SectorListBean sectorListBean = (SectorListBean) obj;
        return Intrinsics.EZpvd((Object) this.sectorKey, (Object) sectorListBean.sectorKey) && Intrinsics.EZpvd(this.underlyingList, sectorListBean.underlyingList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSectorKey() {
        return this.sectorKey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<SectorItemBean> getUnderlyingList() {
        return this.underlyingList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.sectorKey.hashCode() * 31) + this.underlyingList.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SectorListBean(sectorKey=" + this.sectorKey + ", underlyingList=" + this.underlyingList + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.sectorKey);
        List<SectorItemBean> list = this.underlyingList;
        parcel.writeInt(list.size());
        Iterator<SectorItemBean> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
    }

    public SectorListBean(@NotNull String str, @NotNull List<SectorItemBean> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.sectorKey = str;
        this.underlyingList = list;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000e: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r1v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0006: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x000a: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:15)) : (r2v0 java.util.List))
 A[MD:(java.lang.String, java.util.List<com.okinc.crcore.shared.net.responsebean.SectorItemBean>):void (m)] (LINE:13) call: com.okinc.crcore.shared.net.responsebean.SectorListBean.<init>(java.lang.String, java.util.List):void type: THIS */
    public /* synthetic */ SectorListBean(String str, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? yDY.AhwBna() : list);
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.crcore.shared.net.responsebean.SectorListBean.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final List<SectorListBean> OLrzqt(@NotNull List<SectorListResponseBean> list) {
            Intrinsics.checkNotNullParameter(list, "");
            ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(list, 10));
            for (SectorListResponseBean sectorListResponseBean : list) {
                String sectorKey = sectorListResponseBean.getSectorKey();
                ArrayList<SectorItemResponseBean> underlyingList = sectorListResponseBean.getUnderlyingList();
                ArrayList arrayList2 = new ArrayList(C56403yEb.AYXKKw(underlyingList, 10));
                Iterator<T> it = underlyingList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(SectorItemBean.Companion.copydefault((SectorItemResponseBean) it.next()));
                }
                arrayList.add(new SectorListBean(sectorKey, arrayList2));
            }
            return arrayList;
        }
    }
}
