package com.okinc.business.defi.wallet.transfer.batch.multiTransferBean;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C56402yEa;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final class AddressGroupBean implements Parcelable {
    public static final int ADDRESS_GROUP_ADDRESS_BOOK = 2;
    public static final int ADDRESS_GROUP_EXCHANGE = 1;
    public static final int ADDRESS_GROUP_MANUAL = 5;
    public static final int ADDRESS_GROUP_OTHER_WALLETS_IN_DEVICE = 4;
    public static final int ADDRESS_GROUP_RECENT = 3;
    private final int addressGroup;
    private ArrayList<AddressChildBean> dataList;
    private boolean isExpanded;
    private boolean isSelected;
    private boolean isShowDivider;
    private final String rootWalletId;
    private final String title;
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<AddressGroupBean> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<AddressGroupBean> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AddressGroupBean createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            int i = parcel.readInt();
            String string = parcel.readString();
            int i2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i2);
            for (int i3 = 0; i3 != i2; i3++) {
                arrayList.add(AddressChildBean.CREATOR.createFromParcel(parcel));
            }
            return new AddressGroupBean(i, string, arrayList, parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AddressGroupBean[] newArray(int i) {
            return new AddressGroupBean[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: com.okinc.business.defi.wallet.transfer.batch.multiTransferBean.AddressGroupBean */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AddressGroupBean copy$default(AddressGroupBean addressGroupBean, int i, String str, ArrayList arrayList, String str2, boolean z, boolean z2, boolean z3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = addressGroupBean.addressGroup;
        }
        if ((i2 & 2) != 0) {
            str = addressGroupBean.title;
        }
        String str3 = str;
        if ((i2 & 4) != 0) {
            arrayList = addressGroupBean.dataList;
        }
        ArrayList arrayList2 = arrayList;
        if ((i2 & 8) != 0) {
            str2 = addressGroupBean.rootWalletId;
        }
        String str4 = str2;
        if ((i2 & 16) != 0) {
            z = addressGroupBean.isSelected;
        }
        boolean z4 = z;
        if ((i2 & 32) != 0) {
            z2 = addressGroupBean.isExpanded;
        }
        boolean z5 = z2;
        if ((i2 & 64) != 0) {
            z3 = addressGroupBean.isShowDivider;
        }
        return addressGroupBean.copy(i, str3, arrayList2, str4, z4, z5, z3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component1() {
        return this.addressGroup;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<AddressChildBean> component3() {
        return this.dataList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.rootWalletId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component5() {
        return this.isSelected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component6() {
        return this.isExpanded;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component7() {
        return this.isShowDivider;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AddressGroupBean copy(int i, @NotNull String str, @NotNull ArrayList<AddressChildBean> arrayList, @NotNull String str2, boolean z, boolean z2, boolean z3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(arrayList, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new AddressGroupBean(i, str, arrayList, str2, z, z2, z3);
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
        if (!(obj instanceof AddressGroupBean)) {
            return false;
        }
        AddressGroupBean addressGroupBean = (AddressGroupBean) obj;
        return this.addressGroup == addressGroupBean.addressGroup && Intrinsics.EZpvd((Object) this.title, (Object) addressGroupBean.title) && Intrinsics.EZpvd(this.dataList, addressGroupBean.dataList) && Intrinsics.EZpvd((Object) this.rootWalletId, (Object) addressGroupBean.rootWalletId) && this.isSelected == addressGroupBean.isSelected && this.isExpanded == addressGroupBean.isExpanded && this.isShowDivider == addressGroupBean.isShowDivider;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getAddressGroup() {
        return this.addressGroup;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<AddressChildBean> getDataList() {
        return this.dataList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRootWalletId() {
        return this.rootWalletId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTitle() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((Integer.hashCode(this.addressGroup) * 31) + this.title.hashCode()) * 31) + this.dataList.hashCode()) * 31) + this.rootWalletId.hashCode()) * 31) + Boolean.hashCode(this.isSelected)) * 31) + Boolean.hashCode(this.isExpanded)) * 31) + Boolean.hashCode(this.isShowDivider);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isExpanded() {
        return this.isExpanded;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isSelected() {
        return this.isSelected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isShowDivider() {
        return this.isShowDivider;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDataList(@NotNull ArrayList<AddressChildBean> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        this.dataList = arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setExpanded(boolean z) {
        this.isExpanded = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSelected(boolean z) {
        this.isSelected = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setShowDivider(boolean z) {
        this.isShowDivider = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "AddressGroupBean(addressGroup=" + this.addressGroup + ", title=" + this.title + ", dataList=" + this.dataList + ", rootWalletId=" + this.rootWalletId + ", isSelected=" + this.isSelected + ", isExpanded=" + this.isExpanded + ", isShowDivider=" + this.isShowDivider + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeInt(this.addressGroup);
        parcel.writeString(this.title);
        ArrayList<AddressChildBean> arrayList = this.dataList;
        parcel.writeInt(arrayList.size());
        Iterator<AddressChildBean> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
        parcel.writeString(this.rootWalletId);
        parcel.writeInt(this.isSelected ? 1 : 0);
        parcel.writeInt(this.isExpanded ? 1 : 0);
        parcel.writeInt(this.isShowDivider ? 1 : 0);
    }

    public AddressGroupBean(int i, @NotNull String str, @NotNull ArrayList<AddressChildBean> arrayList, @NotNull String str2, boolean z, boolean z2, boolean z3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(arrayList, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.addressGroup = i;
        this.title = str;
        this.dataList = arrayList;
        this.rootWalletId = str2;
        this.isSelected = z;
        this.isExpanded = z2;
        this.isShowDivider = z3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x001e: CONSTRUCTOR 
  (r11v0 int)
  (r12v0 java.lang.String)
  (r13v0 java.util.ArrayList)
  (r14v0 java.lang.String)
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r18v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? false : (r15v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0008: ARITH (r18v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? true : (r16v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0011: ARITH (r18v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? false : (r17v0 boolean))
 A[MD:(int, java.lang.String, java.util.ArrayList<com.okinc.business.defi.wallet.transfer.batch.multiTransferBean.AddressChildBean>, java.lang.String, boolean, boolean, boolean):void (m)] (LINE:16) call: com.okinc.business.defi.wallet.transfer.batch.multiTransferBean.AddressGroupBean.<init>(int, java.lang.String, java.util.ArrayList, java.lang.String, boolean, boolean, boolean):void type: THIS */
    public /* synthetic */ AddressGroupBean(int i, String str, ArrayList arrayList, String str2, boolean z, boolean z2, boolean z3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, str, arrayList, str2, (i2 & 16) != 0 ? false : z, (i2 & 32) != 0 ? true : z2, (i2 & 64) != 0 ? false : z3);
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.wallet.transfer.batch.multiTransferBean.AddressGroupBean.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final String EZpvd(int i) {
            if (i != 1) {
                if (i == 2) {
                    return AddressSourceGroup.ADDRESS_BOOKS.getGroup();
                }
                if (i == 3) {
                    return AddressSourceGroup.RECENT.getGroup();
                }
                if (i != 4 && i != 5) {
                    return AddressSourceGroup.DEFAULT.getGroup();
                }
            }
            return AddressSourceGroup.MY_WALLET.getGroup();
        }

        public final List<Integer> copydefault(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            if (Intrinsics.EZpvd((Object) str, (Object) AddressSourceGroup.RECENT.getGroup())) {
                return C56402yEa.EZpvd(3);
            }
            if (Intrinsics.EZpvd((Object) str, (Object) AddressSourceGroup.ADDRESS_BOOKS.getGroup())) {
                return C56402yEa.EZpvd(2);
            }
            if (Intrinsics.EZpvd((Object) str, (Object) AddressSourceGroup.MY_WALLET.getGroup())) {
                return yDY.gEmmrt(4, 5, 1);
            }
            return yDY.gEmmrt(4, 5, 1);
        }
    }
}
