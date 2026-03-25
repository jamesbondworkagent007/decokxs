package com.okinc.unify_trade.biz;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class BotSectorUnderlyingListBean implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<BotSectorUnderlyingListBean> CREATOR = new Creator();
    private final String sectorId;
    private final String sectorName;
    private final List<UnderlyingListBean> underlyingList;

    public static final class Creator implements Parcelable.Creator<BotSectorUnderlyingListBean> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BotSectorUnderlyingListBean createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList2.add(UnderlyingListBean.CREATOR.createFromParcel(parcel));
                }
                arrayList = arrayList2;
            }
            return new BotSectorUnderlyingListBean(string, string2, arrayList);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BotSectorUnderlyingListBean[] newArray(int i) {
            return new BotSectorUnderlyingListBean[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public BotSectorUnderlyingListBean() {
        this(null, null, null, 7, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.unify_trade.biz.BotSectorUnderlyingListBean */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BotSectorUnderlyingListBean copy$default(BotSectorUnderlyingListBean botSectorUnderlyingListBean, String str, String str2, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = botSectorUnderlyingListBean.sectorId;
        }
        if ((i & 2) != 0) {
            str2 = botSectorUnderlyingListBean.sectorName;
        }
        if ((i & 4) != 0) {
            list = botSectorUnderlyingListBean.underlyingList;
        }
        return botSectorUnderlyingListBean.copy(str, str2, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.sectorId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.sectorName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<UnderlyingListBean> component3() {
        return this.underlyingList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BotSectorUnderlyingListBean copy(String str, String str2, List<UnderlyingListBean> list) {
        return new BotSectorUnderlyingListBean(str, str2, list);
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
        if (!(obj instanceof BotSectorUnderlyingListBean)) {
            return false;
        }
        BotSectorUnderlyingListBean botSectorUnderlyingListBean = (BotSectorUnderlyingListBean) obj;
        return Intrinsics.EZpvd((Object) this.sectorId, (Object) botSectorUnderlyingListBean.sectorId) && Intrinsics.EZpvd((Object) this.sectorName, (Object) botSectorUnderlyingListBean.sectorName) && Intrinsics.EZpvd(this.underlyingList, botSectorUnderlyingListBean.underlyingList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSectorId() {
        return this.sectorId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSectorName() {
        return this.sectorName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<UnderlyingListBean> getUnderlyingList() {
        return this.underlyingList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.sectorId;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.sectorName;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        List<UnderlyingListBean> list = this.underlyingList;
        return (((iHashCode * 31) + iHashCode2) * 31) + (list != null ? list.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "BotSectorUnderlyingListBean(sectorId=" + this.sectorId + ", sectorName=" + this.sectorName + ", underlyingList=" + this.underlyingList + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.sectorId);
        parcel.writeString(this.sectorName);
        List<UnderlyingListBean> list = this.underlyingList;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(list.size());
        Iterator<UnderlyingListBean> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
    }

    public BotSectorUnderlyingListBean(String str, String str2, List<UnderlyingListBean> list) {
        this.sectorId = str;
        this.sectorName = str2;
        this.underlyingList = list;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x000b: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r4v0 java.util.List))
 A[MD:(java.lang.String, java.lang.String, java.util.List<com.okinc.unify_trade.biz.UnderlyingListBean>):void (m)] (LINE:1096) call: com.okinc.unify_trade.biz.BotSectorUnderlyingListBean.<init>(java.lang.String, java.lang.String, java.util.List):void type: THIS */
    public /* synthetic */ BotSectorUnderlyingListBean(String str, String str2, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : list);
    }
}
