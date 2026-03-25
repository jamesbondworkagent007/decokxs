package com.okinc.business.dexlogic.main.swap.route;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.core.os.BundleCompat;
import androidx.lifecycle.MutableLiveData;
import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import com.okinc.business.dexlogic.bean.DexQuoteBridgeVO;
import com.okinc.business.dexlogic.bean.DexRouterList;
import com.okinc.business.dexlogic.bean.DexSwapSmartRoutingMenuVo;
import com.okinc.business.dexlogic.bean.PathSelectionRouterItem;
import com.okinc.business.dexlogic.bean.SubRouter;
import com.okinc.business.dexlogic.main.swap.route.SmartRoutingViewModel;
import com.okinc.business.dexui.main.swap.route.SmartRoutingData;
import com.okinc.business.domain.model.PathRouterUi;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC33073mpa;
import o.C22380heK;
import o.C32866mlf;
import o.C33129mqd;
import o.C56444yFp;
import o.InterfaceC56445yFq;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class SmartRoutingViewModel extends AbstractC33073mpa {
    public DexMultiTokenInfoBean AYXKKw;
    public String AhwBna;
    public DexMultiTokenInfoBean AkhnZx;
    public DexMultiTokenInfoBean DbNXlk;
    public ArrayList<DexQuoteBridgeVO> KWHzl;
    public DexQuoteBridgeVO OLrzqt;
    public PathSelectionRouterItem djBIcL;
    public String fetchVPNInfo;
    public DexMultiTokenInfoBean gEmmrt;
    public List<DexSwapSmartRoutingMenuVo> isConnected;
    public SmartRoutingData values;
    public ArrayList<DexRouterList> AEQbTJ = new ArrayList<>();
    public MutableLiveData<List<Object>> copydefault = new MutableLiveData<>();
    public MutableLiveData<Integer> EZpvd = new MutableLiveData<>();
    public boolean valueOf = true;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<Integer> AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<DexSwapSmartRoutingMenuVo> AYXKKw() {
        return this.isConnected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SmartRoutingData AhwBna() {
        return this.values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DexMultiTokenInfoBean DbNXlk() {
        return this.AkhnZx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DexMultiTokenInfoBean KWHzl() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<List<Object>> OLrzqt() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<DexRouterList> copydefault() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String djBIcL() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DexMultiTokenInfoBean fetchVPNInfo() {
        return this.DbNXlk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DexMultiTokenInfoBean valueOf() {
        return this.gEmmrt;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class RouteType {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ RouteType[] $VALUES;
        public static final RouteType SINGLE_ROUTE_TYPE = new RouteType("SINGLE_ROUTE_TYPE", 0);
        public static final RouteType SINGLE_MORE_ROUTE_TYPE = new RouteType("SINGLE_MORE_ROUTE_TYPE", 1);
        public static final RouteType SINGLE_BIG_ROUTE_TYPE = new RouteType("SINGLE_BIG_ROUTE_TYPE", 2);
        public static final RouteType ONE_ROUTE_TYPE = new RouteType("ONE_ROUTE_TYPE", 3);
        public static final RouteType DOUBLE_ROUTE_TYPE = new RouteType("DOUBLE_ROUTE_TYPE", 4);
        public static final RouteType THREE_ROUTE_TYPE = new RouteType("THREE_ROUTE_TYPE", 5);

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ RouteType[] $values() {
            return new RouteType[]{SINGLE_ROUTE_TYPE, SINGLE_MORE_ROUTE_TYPE, SINGLE_BIG_ROUTE_TYPE, ONE_ROUTE_TYPE, DOUBLE_ROUTE_TYPE, THREE_ROUTE_TYPE};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<RouteType> getEntries() {
            return $ENTRIES;
        }

        private RouteType(String str, int i) {
        }

        static {
            RouteType[] routeTypeArr$values = $values();
            $VALUES = routeTypeArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(routeTypeArr$values);
        }

        public static RouteType valueOf(String str) {
            return (RouteType) Enum.valueOf(RouteType.class, str);
        }

        public static RouteType[] values() {
            return (RouteType[]) $VALUES.clone();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [76=4] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void KWHzl(@NotNull String str) {
        ArrayList<DexRouterList> arrayListAhwBna;
        Intrinsics.checkNotNullParameter(str, "");
        this.AEQbTJ.clear();
        this.KWHzl = null;
        switch (str.hashCode()) {
            case 48:
                if (str.equals("0")) {
                    SmartRoutingData smartRoutingData = this.values;
                    EZpvd(smartRoutingData != null ? smartRoutingData.OLrzqt() : null, "0");
                    break;
                }
                break;
            case 49:
                if (str.equals("1")) {
                    SmartRoutingData smartRoutingData2 = this.values;
                    EZpvd(smartRoutingData2 != null ? smartRoutingData2.KWHzl() : null, "1");
                    break;
                }
                break;
            case 50:
                if (str.equals("2")) {
                    values();
                    this.AhwBna = "2";
                    MutableLiveData<List<Object>> mutableLiveData = this.copydefault;
                    ArrayList<DexQuoteBridgeVO> arrayList = this.KWHzl;
                    mutableLiveData.setValue(arrayList != null ? new ArrayList<>(arrayList) : null);
                    break;
                }
                break;
            case 51:
                if (str.equals("3")) {
                    SmartRoutingData smartRoutingData3 = this.values;
                    if (smartRoutingData3 != null && (arrayListAhwBna = smartRoutingData3.AhwBna()) != null) {
                        int size = arrayListAhwBna.size();
                        for (int i = 0; i < size; i++) {
                            arrayListAhwBna.get(i).setType(1);
                        }
                    }
                    SmartRoutingData smartRoutingData4 = this.values;
                    EZpvd(smartRoutingData4 != null ? smartRoutingData4.AhwBna() : null, "3");
                    break;
                }
                break;
        }
    }

    public final void EZpvd(ArrayList<DexRouterList> arrayList, String str) {
        if (Intrinsics.EZpvd((Object) str, (Object) "3")) {
            AEQbTJ(arrayList, 1);
        } else {
            addMultiHeadView$default(this, arrayList, 0, 2, null);
        }
        if (arrayList != null) {
            this.AEQbTJ.addAll(arrayList);
        }
        this.AhwBna = str;
        this.copydefault.setValue(new ArrayList(this.AEQbTJ));
    }

    public final void isConnected() {
        fIwbmz();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final String EZpvd() {
        List<DexSwapSmartRoutingMenuVo> list = this.isConnected;
        if (list != null) {
            String smartRoutingMenuType = list.get(0).getSmartRoutingMenuType();
            switch (smartRoutingMenuType.hashCode()) {
                case 49:
                    if (smartRoutingMenuType.equals("1")) {
                        return "1";
                    }
                    break;
                case 50:
                    if (smartRoutingMenuType.equals("2")) {
                        return "2";
                    }
                    break;
                case 51:
                    if (smartRoutingMenuType.equals("3")) {
                        return "3";
                    }
                    break;
            }
        }
        return "";
    }

    public final void fIwbmz() {
        int size;
        ArrayList<DexRouterList> arrayListAhwBna;
        int size2;
        ArrayList<SubRouter> subRouterList;
        ArrayList<DexRouterList> arrayListKWHzl;
        int size3;
        ArrayList<SubRouter> subRouterList2;
        if (this.valueOf) {
            SmartRoutingData smartRoutingData = this.values;
            int size4 = -1;
            if (smartRoutingData == null || (arrayListKWHzl = smartRoutingData.KWHzl()) == null) {
                size = 0;
            } else {
                if (arrayListKWHzl.size() == 1 && (subRouterList2 = arrayListKWHzl.get(0).getSubRouterList()) != null && subRouterList2.size() == 3) {
                    size3 = arrayListKWHzl.size();
                } else if (arrayListKWHzl.size() == 1) {
                    size = arrayListKWHzl.size();
                } else if (arrayListKWHzl.size() > 1) {
                    size3 = arrayListKWHzl.size();
                } else {
                    size = -1;
                }
                size = size3 + 1;
            }
            SmartRoutingData smartRoutingData2 = this.values;
            if (smartRoutingData2 == null || (arrayListAhwBna = smartRoutingData2.AhwBna()) == null) {
                size4 = 0;
            } else {
                if (arrayListAhwBna.size() == 1 && (subRouterList = arrayListAhwBna.get(0).getSubRouterList()) != null && subRouterList.size() == 3) {
                    size2 = arrayListAhwBna.size();
                } else if (arrayListAhwBna.size() == 1) {
                    size4 = arrayListAhwBna.size();
                } else if (arrayListAhwBna.size() > 1) {
                    size2 = arrayListAhwBna.size();
                }
                size4 = size2 + 1;
            }
            this.EZpvd.setValue(Integer.valueOf(Math.max(size, size4)));
            this.valueOf = false;
        }
    }

    public static /* synthetic */ void addMultiHeadView$default(SmartRoutingViewModel smartRoutingViewModel, ArrayList arrayList, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        smartRoutingViewModel.AEQbTJ(arrayList, i);
    }

    public final void AEQbTJ(ArrayList<DexRouterList> arrayList, int i) {
        if (C33129mqd.KWHzl((Collection) arrayList)) {
            if (arrayList == null || arrayList.size() != 1) {
                this.AEQbTJ.add(new DexRouterList("", "", null, true, i));
            }
        }
    }

    public final void values() {
        ArrayList<DexQuoteBridgeVO> arrayList;
        if (this.KWHzl == null) {
            this.KWHzl = new ArrayList<>();
        }
        ArrayList<DexQuoteBridgeVO> arrayList2 = this.KWHzl;
        if (arrayList2 != null) {
            arrayList2.clear();
        }
        DexQuoteBridgeVO dexQuoteBridgeVO = this.OLrzqt;
        if (dexQuoteBridgeVO == null || (arrayList = this.KWHzl) == null) {
            return;
        }
        arrayList.add(dexQuoteBridgeVO);
    }

    public final boolean AkhnZx() {
        return this.AEQbTJ.size() == 1;
    }

    public final RouteType OLrzqt(int i) {
        if (i == 2) {
            return RouteType.DOUBLE_ROUTE_TYPE;
        }
        if (i == 3) {
            return RouteType.THREE_ROUTE_TYPE;
        }
        return RouteType.ONE_ROUTE_TYPE;
    }

    public final RouteType gEmmrt() {
        ArrayList<SubRouter> subRouterList = ((DexRouterList) CollectionsKt___CollectionsKt.AuCTelauCTel(this.AEQbTJ)).getSubRouterList();
        int size = subRouterList != null ? subRouterList.size() : 1;
        if (size == 2) {
            return RouteType.SINGLE_MORE_ROUTE_TYPE;
        }
        if (size == 3) {
            return RouteType.SINGLE_BIG_ROUTE_TYPE;
        }
        return RouteType.SINGLE_ROUTE_TYPE;
    }

    public final void EZpvd(@NotNull final String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C32866mlf.onEvent$default("app_swap_smart_router_step1_click", (TrackChannel[]) null, new Function1() { // from class: o.hmh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return SmartRoutingViewModel.OLrzqt(this.KWHzl, str, (EventParamsList) obj);
            }
        }, 1, (Object) null);
    }

    public static final Unit OLrzqt(SmartRoutingViewModel smartRoutingViewModel, String str, EventParamsList eventParamsList) {
        String chainId;
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        DexMultiTokenInfoBean dexMultiTokenInfoBean = smartRoutingViewModel.AYXKKw;
        if (dexMultiTokenInfoBean == null || (chainId = dexMultiTokenInfoBean.getChainId()) == null) {
            chainId = "";
        }
        eventParamsList.put("user_address", C22380heK.OLrzqt.copydefault(str).fARcdN().KWHzl(chainId), false);
        String str2 = smartRoutingViewModel.fetchVPNInfo;
        eventParamsList.put("swap_type", str2 != null ? str2 : "", false);
        return Unit.INSTANCE;
    }

    public final void KWHzl(Bundle bundle) {
        PathSelectionRouterItem pathSelectionRouterItemOLrzqt;
        PathRouterUi pathRouterUi;
        SmartRoutingData smartRoutingData;
        if (bundle != null && (smartRoutingData = (SmartRoutingData) ((Parcelable) BundleCompat.getParcelable(bundle, "data", SmartRoutingData.class))) != null) {
            this.values = smartRoutingData;
        }
        SmartRoutingData smartRoutingData2 = this.values;
        if (smartRoutingData2 != null) {
            pathSelectionRouterItemOLrzqt = smartRoutingData2.OLrzqt((bundle == null || (pathRouterUi = (PathRouterUi) ((Parcelable) BundleCompat.getParcelable(bundle, "selected_router", PathRouterUi.class))) == null) ? null : pathRouterUi.OLrzqt());
        } else {
            pathSelectionRouterItemOLrzqt = null;
        }
        this.djBIcL = pathSelectionRouterItemOLrzqt;
        this.isConnected = pathSelectionRouterItemOLrzqt != null ? pathSelectionRouterItemOLrzqt.getSmartRoutingMenuVoList() : null;
        PathSelectionRouterItem pathSelectionRouterItem = this.djBIcL;
        this.OLrzqt = pathSelectionRouterItem != null ? pathSelectionRouterItem.getBridge() : null;
        SmartRoutingData smartRoutingData3 = this.values;
        this.fetchVPNInfo = smartRoutingData3 != null ? smartRoutingData3.valueOf() : null;
        SmartRoutingData smartRoutingData4 = this.values;
        this.AYXKKw = smartRoutingData4 != null ? smartRoutingData4.EZpvd() : null;
        SmartRoutingData smartRoutingData5 = this.values;
        this.AkhnZx = smartRoutingData5 != null ? smartRoutingData5.djBIcL() : null;
        SmartRoutingData smartRoutingData6 = this.values;
        this.gEmmrt = smartRoutingData6 != null ? smartRoutingData6.copydefault() : null;
        SmartRoutingData smartRoutingData7 = this.values;
        this.DbNXlk = smartRoutingData7 != null ? smartRoutingData7.gEmmrt() : null;
    }
}
