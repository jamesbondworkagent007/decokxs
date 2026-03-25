package com.okinc.business.dexui.main.swap.route;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.business.dexlogic.bean.DeFiPlatformForSwap;
import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import com.okinc.business.dexlogic.bean.DexQuoteBridgeVO;
import com.okinc.business.dexlogic.bean.DexRouterList;
import com.okinc.business.dexlogic.bean.DexSwapSmartRoutingMenuVo;
import com.okinc.business.dexlogic.bean.PathSelectionRouterItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class SmartRoutingData implements Parcelable {
    public static final Parcelable.Creator<SmartRoutingData> CREATOR = new Creator();
    public final DexMultiTokenInfoBean AEQbTJ;
    public final DexMultiTokenInfoBean EZpvd;
    public final List<PathSelectionRouterItem> KWHzl;
    public final List<DeFiPlatformForSwap> OLrzqt;
    public final String copydefault;

    public static final class Creator implements Parcelable.Creator<SmartRoutingData> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SmartRoutingData createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "");
            int i = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList2.add(DeFiPlatformForSwap.CREATOR.createFromParcel(parcel));
            }
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i3 = parcel.readInt();
                arrayList = new ArrayList(i3);
                for (int i4 = 0; i4 != i3; i4++) {
                    arrayList.add(PathSelectionRouterItem.CREATOR.createFromParcel(parcel));
                }
            }
            return new SmartRoutingData(arrayList2, arrayList, parcel.readString(), parcel.readInt() == 0 ? null : DexMultiTokenInfoBean.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? DexMultiTokenInfoBean.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SmartRoutingData[] newArray(int i) {
            return new SmartRoutingData[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: com.okinc.business.dexui.main.swap.route.SmartRoutingData */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SmartRoutingData copy$default(SmartRoutingData smartRoutingData, List list, List list2, String str, DexMultiTokenInfoBean dexMultiTokenInfoBean, DexMultiTokenInfoBean dexMultiTokenInfoBean2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = smartRoutingData.OLrzqt;
        }
        if ((i & 2) != 0) {
            list2 = smartRoutingData.KWHzl;
        }
        List list3 = list2;
        if ((i & 4) != 0) {
            str = smartRoutingData.copydefault;
        }
        String str2 = str;
        if ((i & 8) != 0) {
            dexMultiTokenInfoBean = smartRoutingData.AEQbTJ;
        }
        DexMultiTokenInfoBean dexMultiTokenInfoBean3 = dexMultiTokenInfoBean;
        if ((i & 16) != 0) {
            dexMultiTokenInfoBean2 = smartRoutingData.EZpvd;
        }
        return smartRoutingData.AEQbTJ(list, list3, str2, dexMultiTokenInfoBean3, dexMultiTokenInfoBean2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SmartRoutingData AEQbTJ(@NotNull List<DeFiPlatformForSwap> list, List<PathSelectionRouterItem> list2, @NotNull String str, DexMultiTokenInfoBean dexMultiTokenInfoBean, DexMultiTokenInfoBean dexMultiTokenInfoBean2) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        return new SmartRoutingData(list, list2, str, dexMultiTokenInfoBean, dexMultiTokenInfoBean2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DexMultiTokenInfoBean EZpvd() {
        return this.AEQbTJ;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DexMultiTokenInfoBean djBIcL() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SmartRoutingData)) {
            return false;
        }
        SmartRoutingData smartRoutingData = (SmartRoutingData) obj;
        return Intrinsics.EZpvd(this.OLrzqt, smartRoutingData.OLrzqt) && Intrinsics.EZpvd(this.KWHzl, smartRoutingData.KWHzl) && Intrinsics.EZpvd((Object) this.copydefault, (Object) smartRoutingData.copydefault) && Intrinsics.EZpvd(this.AEQbTJ, smartRoutingData.AEQbTJ) && Intrinsics.EZpvd(this.EZpvd, smartRoutingData.EZpvd);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.OLrzqt.hashCode();
        List<PathSelectionRouterItem> list = this.KWHzl;
        int iHashCode2 = list == null ? 0 : list.hashCode();
        int iHashCode3 = this.copydefault.hashCode();
        DexMultiTokenInfoBean dexMultiTokenInfoBean = this.AEQbTJ;
        int iHashCode4 = dexMultiTokenInfoBean == null ? 0 : dexMultiTokenInfoBean.hashCode();
        DexMultiTokenInfoBean dexMultiTokenInfoBean2 = this.EZpvd;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (dexMultiTokenInfoBean2 != null ? dexMultiTokenInfoBean2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SmartRoutingData(defiPlatformInfoList=" + this.OLrzqt + ", pathSelectionRouterList=" + this.KWHzl + ", swapType=" + this.copydefault + ", fromToken=" + this.AEQbTJ + ", toToken=" + this.EZpvd + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String valueOf() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        List<DeFiPlatformForSwap> list = this.OLrzqt;
        parcel.writeInt(list.size());
        Iterator<DeFiPlatformForSwap> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
        List<PathSelectionRouterItem> list2 = this.KWHzl;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list2.size());
            Iterator<PathSelectionRouterItem> it2 = list2.iterator();
            while (it2.hasNext()) {
                it2.next().writeToParcel(parcel, i);
            }
        }
        parcel.writeString(this.copydefault);
        DexMultiTokenInfoBean dexMultiTokenInfoBean = this.AEQbTJ;
        if (dexMultiTokenInfoBean == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            dexMultiTokenInfoBean.writeToParcel(parcel, i);
        }
        DexMultiTokenInfoBean dexMultiTokenInfoBean2 = this.EZpvd;
        if (dexMultiTokenInfoBean2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            dexMultiTokenInfoBean2.writeToParcel(parcel, i);
        }
    }

    public SmartRoutingData(@NotNull List<DeFiPlatformForSwap> list, List<PathSelectionRouterItem> list2, @NotNull String str, DexMultiTokenInfoBean dexMultiTokenInfoBean, DexMultiTokenInfoBean dexMultiTokenInfoBean2) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.OLrzqt = list;
        this.KWHzl = list2;
        this.copydefault = str;
        this.AEQbTJ = dexMultiTokenInfoBean;
        this.EZpvd = dexMultiTokenInfoBean2;
    }

    public static /* synthetic */ PathSelectionRouterItem getSelectRouterItem$default(SmartRoutingData smartRoutingData, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        return smartRoutingData.OLrzqt(str);
    }

    public final PathSelectionRouterItem OLrzqt(String str) {
        Object next;
        Object obj = null;
        if (str != null) {
            List<PathSelectionRouterItem> list = this.KWHzl;
            if (list == null) {
                return null;
            }
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next2 = it.next();
                DexQuoteBridgeVO bridge = ((PathSelectionRouterItem) next2).getBridge();
                if (Intrinsics.EZpvd((Object) (bridge != null ? bridge.getBridgeId() : null), (Object) str)) {
                    obj = next2;
                    break;
                }
            }
            return (PathSelectionRouterItem) obj;
        }
        List<PathSelectionRouterItem> list2 = this.KWHzl;
        if (list2 != null) {
            Iterator<T> it2 = list2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
                if (((PathSelectionRouterItem) next).getLocalSelected()) {
                    break;
                }
            }
            PathSelectionRouterItem pathSelectionRouterItem = (PathSelectionRouterItem) next;
            if (pathSelectionRouterItem != null) {
                return pathSelectionRouterItem;
            }
        }
        List<PathSelectionRouterItem> list3 = this.KWHzl;
        if (list3 != null) {
            return (PathSelectionRouterItem) CollectionsKt___CollectionsKt.firstOrNull(list3);
        }
        return null;
    }

    public final ArrayList<DexRouterList> OLrzqt() {
        Object next;
        List<DexRouterList> dexRouterList;
        Iterator<T> it = this.OLrzqt.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Intrinsics.EZpvd((Object) ((DeFiPlatformForSwap) next).getDefiPlatformId(), (Object) "11")) {
                break;
            }
        }
        DeFiPlatformForSwap deFiPlatformForSwap = (DeFiPlatformForSwap) next;
        if (deFiPlatformForSwap == null || (dexRouterList = deFiPlatformForSwap.getDexRouterList()) == null) {
            return null;
        }
        return new ArrayList<>(dexRouterList);
    }

    public final DexMultiTokenInfoBean copydefault() {
        PathSelectionRouterItem selectRouterItem$default = getSelectRouterItem$default(this, null, 1, null);
        if (selectRouterItem$default != null) {
            return selectRouterItem$default.getFromSwapToTokenInfo();
        }
        return null;
    }

    public final DexMultiTokenInfoBean gEmmrt() {
        PathSelectionRouterItem selectRouterItem$default = getSelectRouterItem$default(this, null, 1, null);
        if (selectRouterItem$default != null) {
            return selectRouterItem$default.getToSwapFromTokenInfo();
        }
        return null;
    }

    public final ArrayList<DexRouterList> KWHzl() {
        PathSelectionRouterItem selectRouterItem$default = getSelectRouterItem$default(this, null, 1, null);
        if (selectRouterItem$default != null) {
            return selectRouterItem$default.getFromDexRouterList();
        }
        return null;
    }

    public final ArrayList<DexRouterList> AhwBna() {
        PathSelectionRouterItem selectRouterItem$default = getSelectRouterItem$default(this, null, 1, null);
        if (selectRouterItem$default != null) {
            return selectRouterItem$default.getToDexRouterToList();
        }
        return null;
    }

    public final String AEQbTJ() {
        ArrayList<DexSwapSmartRoutingMenuVo> smartRoutingMenuVoList;
        ArrayList<DexSwapSmartRoutingMenuVo> smartRoutingMenuVoList2;
        ArrayList<DexSwapSmartRoutingMenuVo> smartRoutingMenuVoList3;
        DexSwapSmartRoutingMenuVo dexSwapSmartRoutingMenuVo;
        String str = this.copydefault;
        if (Intrinsics.EZpvd((Object) str, (Object) "0")) {
            return "0";
        }
        if (Intrinsics.EZpvd((Object) str, (Object) "1")) {
            PathSelectionRouterItem selectRouterItem$default = getSelectRouterItem$default(this, null, 1, null);
            if (selectRouterItem$default != null && (smartRoutingMenuVoList2 = selectRouterItem$default.getSmartRoutingMenuVoList()) != null && smartRoutingMenuVoList2.size() == 1) {
                PathSelectionRouterItem selectRouterItem$default2 = getSelectRouterItem$default(this, null, 1, null);
                if (Intrinsics.EZpvd((Object) ((selectRouterItem$default2 == null || (smartRoutingMenuVoList3 = selectRouterItem$default2.getSmartRoutingMenuVoList()) == null || (dexSwapSmartRoutingMenuVo = smartRoutingMenuVoList3.get(0)) == null) ? null : dexSwapSmartRoutingMenuVo.getSmartRoutingMenuType()), (Object) "2")) {
                    return "2";
                }
            }
            PathSelectionRouterItem selectRouterItem$default3 = getSelectRouterItem$default(this, null, 1, null);
            if (selectRouterItem$default3 != null && (smartRoutingMenuVoList = selectRouterItem$default3.getSmartRoutingMenuVoList()) != null && smartRoutingMenuVoList.size() > 1) {
                return "1";
            }
        }
        return "";
    }
}
