package com.okinc.unify_trade.manager;

import android.content.Context;
import android.content.SharedPreferences;
import com.okinc.core.util.SPUtils;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.trade.manager.common.position.TradePositionManager;
import com.okinc.tradeapi.bean.BizApiException;
import com.okinc.unify_trade.biz.BaseInstrument;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.ConfigInstListData;
import com.okinc.unify_trade.biz.InstList;
import com.okinc.unify_trade.biz.InstListData;
import com.okinc.unify_trade.biz.InstMarginModeConfigs;
import com.okinc.unify_trade.biz.MarginModeConfigData;
import com.okinc.unify_trade.biz.SpotCopyInstSwitchConfig;
import com.okinc.unify_trade.biz.SpotInstrument;
import com.okinc.unify_trade.manager.MarginModeManager;
import com.okinc.unify_trade.trade.biz.BizInfoConfig;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.BiFunction;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import o.AbstractC54531xLw;
import o.C33129mqd;
import o.C33134mqi;
import o.C43246rlf;
import o.C54515xLg;
import o.C54589xNz;
import o.C55697xoo;
import o.C56170xxk;
import o.C56392yDr;
import o.C56427yEz;
import o.C56444yFp;
import o.InterfaceC54581xNr;
import o.InterfaceC55701xos;
import o.InterfaceC56387yDm;
import o.InterfaceC56445yFq;
import o.pUU;
import o.xKK;
import o.xLX;
import o.xOV;
import o.xOW;
import o.xVA;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class MarginModeManager {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int EZpvd = 8;
    public final ArrayList<String> gEmmrt = yDY.copydefault("SPOT", "SWAP", "FUTURES", "MARGIN", "OPTION");
    public final InterfaceC56387yDm copydefault = C56392yDr.copydefault(new Function0() { // from class: o.xHU
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return MarginModeManager.OLrzqt();
        }
    });
    public String AYXKKw = "cross";
    public HashMap<String, String> OLrzqt = new HashMap<>();
    public HashMap<String, String> AEQbTJ = new HashMap<>();
    public String djBIcL = "isolated";
    public HashMap<String, String> valueOf = new HashMap<>();
    public HashMap<String, String> AhwBna = new HashMap<>();
    public final ConcurrentHashMap<String, ArrayList<InstMarginModeConfigs>> KWHzl = new ConcurrentHashMap<>();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ConcurrentHashMap<String, ArrayList<InstMarginModeConfigs>> copydefault() {
        return this.KWHzl;
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.manager.MarginModeManager.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: loaded from: classes17.dex */
    public static final class MarginModeChangedSourceType {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ MarginModeChangedSourceType[] $VALUES;
        private final int value;
        public static final MarginModeChangedSourceType ACCOUNT_SWITCH_DEFAULT_MARGIN_TYPE = new MarginModeChangedSourceType("ACCOUNT_SWITCH_DEFAULT_MARGIN_TYPE", 0, 1);
        public static final MarginModeChangedSourceType USER_SELECT_MARGIN_TYPE = new MarginModeChangedSourceType("USER_SELECT_MARGIN_TYPE", 1, 3);
        public static final MarginModeChangedSourceType UNKNOWN_MARGIN_TYPE = new MarginModeChangedSourceType("UNKNOWN_MARGIN_TYPE", 2, 2);

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ MarginModeChangedSourceType[] $values() {
            return new MarginModeChangedSourceType[]{ACCOUNT_SWITCH_DEFAULT_MARGIN_TYPE, USER_SELECT_MARGIN_TYPE, UNKNOWN_MARGIN_TYPE};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<MarginModeChangedSourceType> getEntries() {
            return $ENTRIES;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int getValue() {
            return this.value;
        }

        private MarginModeChangedSourceType(String str, int i, int i2) {
            this.value = i2;
        }

        static {
            MarginModeChangedSourceType[] marginModeChangedSourceTypeArr$values = $values();
            $VALUES = marginModeChangedSourceTypeArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(marginModeChangedSourceTypeArr$values);
        }

        public static MarginModeChangedSourceType valueOf(String str) {
            return (MarginModeChangedSourceType) Enum.valueOf(MarginModeChangedSourceType.class, str);
        }

        public static MarginModeChangedSourceType[] values() {
            return (MarginModeChangedSourceType[]) $VALUES.clone();
        }
    }

    public final BizInfoConfig.DefaultBizConfig KWHzl() {
        return (BizInfoConfig.DefaultBizConfig) this.copydefault.getValue();
    }

    public static final BizInfoConfig.DefaultBizConfig OLrzqt() {
        return BizInfoConfig.DefaultBizConfig.copydefault;
    }

    public static /* synthetic */ boolean isCross$default(MarginModeManager marginModeManager, BizInstrument bizInstrument, int i, Object obj) {
        if ((i & 1) != 0) {
            bizInstrument = xLX.OLrzqt(marginModeManager.KWHzl()).EZpvd();
        }
        return marginModeManager.AEQbTJ(bizInstrument);
    }

    public final boolean AEQbTJ(BizInstrument bizInstrument) {
        return Intrinsics.EZpvd((Object) getCurrentMarginMode$default(this, false, bizInstrument, 1, null), (Object) "cross");
    }

    public static /* synthetic */ boolean isIsolated$default(MarginModeManager marginModeManager, BizInstrument bizInstrument, int i, Object obj) {
        if ((i & 1) != 0) {
            InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
            bizInstrument = interfaceC54581xNrOLrzqt != null ? interfaceC54581xNrOLrzqt.fIwbmz() : null;
        }
        return marginModeManager.OLrzqt(bizInstrument);
    }

    public final boolean OLrzqt(BizInstrument bizInstrument) {
        return Intrinsics.EZpvd((Object) getCurrentMarginMode$default(this, false, bizInstrument, 1, null), (Object) "isolated");
    }

    public static /* synthetic */ String getCurrentMarginMode$default(MarginModeManager marginModeManager, boolean z, BizInstrument bizInstrument, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            bizInstrument = xLX.OLrzqt(marginModeManager.KWHzl()).EZpvd();
        }
        return marginModeManager.AEQbTJ(z, bizInstrument);
    }

    public final String AEQbTJ(boolean z, BizInstrument bizInstrument) {
        String instType;
        String instFamily;
        return getMarginMode$default(this, (bizInstrument == null || (instFamily = bizInstrument.getInstFamily()) == null) ? "" : instFamily, (bizInstrument == null || (instType = bizInstrument.getInstType()) == null) ? "" : instType, null, z, bizInstrument, 4, null);
    }

    public final TradePositionManager.MarginModeType copydefault(BizInstrument bizInstrument) {
        return copydefault(getCurrentMarginMode$default(this, false, bizInstrument, 1, null));
    }

    public static /* synthetic */ TradePositionManager.MarginModeType getMarginModeEnumType$default(MarginModeManager marginModeManager, String str, String str2, String str3, String str4, int i, Object obj) {
        xOW newProxyInstance;
        if ((i & 8) != 0) {
            InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
            str4 = String.valueOf((interfaceC54581xNrOLrzqt == null || (newProxyInstance = interfaceC54581xNrOLrzqt.getNewProxyInstance()) == null) ? null : newProxyInstance.wlaJM());
        }
        return marginModeManager.AEQbTJ(str, str2, str3, str4);
    }

    public final TradePositionManager.MarginModeType AEQbTJ(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        AbstractC54531xLw abstractC54531xLwOLrzqt;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        return copydefault(getMarginMode$default(this, str, str2, str4, false, (interfaceC54581xNrOLrzqt == null || (abstractC54531xLwOLrzqt = interfaceC54581xNrOLrzqt.OLrzqt(str2)) == null) ? null : abstractC54531xLwOLrzqt.valueOf(str3), 8, null));
    }

    public static /* synthetic */ String getMarginMode$default(MarginModeManager marginModeManager, String str, String str2, String str3, boolean z, BizInstrument bizInstrument, int i, Object obj) {
        xOW newProxyInstance;
        if ((i & 4) != 0) {
            InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
            str3 = String.valueOf((interfaceC54581xNrOLrzqt == null || (newProxyInstance = interfaceC54581xNrOLrzqt.getNewProxyInstance()) == null) ? null : newProxyInstance.wlaJM());
        }
        String str4 = str3;
        if ((i & 8) != 0) {
            z = false;
        }
        boolean z2 = z;
        if ((i & 16) != 0) {
            bizInstrument = xLX.OLrzqt(marginModeManager.KWHzl()).EZpvd();
        }
        return marginModeManager.KWHzl(str, str2, str4, z2, bizInstrument);
    }

    public static final void AEQbTJ(boolean z, String str, String str2, String str3, String str4, String str5) {
        if (z) {
            pUU.KWHzl("MarginModeLocalStorageManager", "getMarginMode instFly: " + str + " instType: " + str2 + " accountMode: " + str3 + " source: " + str4 + " config: " + str5);
        }
    }

    public final String KWHzl(@NotNull String str, @NotNull String str2, @NotNull String str3, boolean z, BizInstrument bizInstrument) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        if (bizInstrument == null || str2.length() == 0) {
            C54515xLg.OLrzqt.AEQbTJ("get_mgn_mode", str2, "");
        }
        String strKWHzl = KWHzl(str, str2, bizInstrument, str3);
        if (strKWHzl != null) {
            AEQbTJ(z, str, str2, str3, "specificConfig", strKWHzl);
            return strKWHzl;
        }
        String strKWHzl2 = KWHzl(str, str2, str3);
        if ((strKWHzl2 == null || strKWHzl2.length() == 0) && str.length() > 0) {
            strKWHzl2 = SPUtils.getString(str, null, KWHzl(str2, str3));
        }
        String str4 = strKWHzl2;
        if (str4 != null) {
            AEQbTJ(z, str, str2, str3, "fromInstFly", str4);
            return str4;
        }
        String strEZpvd = EZpvd(str2, str3);
        if (strEZpvd == null || strEZpvd.length() == 0) {
            strEZpvd = copydefault(str2, str3);
        }
        String str5 = strEZpvd;
        if (str5 != null) {
            AEQbTJ(z, str, str2, str3, "fromInstType", str5);
            return str5;
        }
        String strKWHzl3 = KWHzl(str3);
        AEQbTJ(z, str, str2, str3, "fromDefault", strKWHzl3);
        return strKWHzl3;
    }

    public static /* synthetic */ ArrayList getAllLocalMarginMode$default(MarginModeManager marginModeManager, Context context, String str, int i, Object obj) {
        xOW newProxyInstance;
        if ((i & 2) != 0) {
            InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
            str = String.valueOf((interfaceC54581xNrOLrzqt == null || (newProxyInstance = interfaceC54581xNrOLrzqt.getNewProxyInstance()) == null) ? null : newProxyInstance.wlaJM());
        }
        return marginModeManager.KWHzl(context, str);
    }

    public final ArrayList<InstListData> KWHzl(@NotNull Context context, @NotNull String str) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        ArrayList<InstListData> arrayList = new ArrayList<>();
        for (String str2 : this.gEmmrt) {
            Map<String, ?> all = context.getSharedPreferences(KWHzl(str2, str), 0).getAll();
            Intrinsics.copydefault(all);
            Sequence<Map.Entry> sequenceDbNXlk = C56427yEz.DbNXlk(all);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : sequenceDbNXlk) {
                Object value = entry.getValue();
                Object arrayList2 = linkedHashMap.get(value);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                    linkedHashMap.put(value, arrayList2);
                }
                ((List) arrayList2).add((String) entry.getKey());
            }
            String strCopydefault = copydefault(str2, str);
            if (strCopydefault == null) {
                strCopydefault = KWHzl(str);
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                if (!Intrinsics.EZpvd(entry2.getKey(), (Object) strCopydefault)) {
                    linkedHashMap2.put(entry2.getKey(), entry2.getValue());
                }
            }
            for (Map.Entry entry3 : linkedHashMap2.entrySet()) {
                Object key = entry3.getKey();
                List list = (List) entry3.getValue();
                Intrinsics.copydefault(list, "");
                Intrinsics.copydefault(key, "");
                arrayList.add(new InstListData((ArrayList) list, (String) key, str2, strCopydefault));
            }
        }
        return arrayList;
    }

    public final String copydefault(String str, String str2) {
        if (str.length() == 0) {
            return null;
        }
        return SPUtils.getString(str, null, AEQbTJ(str2));
    }

    public static /* synthetic */ void setInstTypeDimensionMarginMode$default(MarginModeManager marginModeManager, String str, String str2, String str3, int i, Object obj) {
        xOW newProxyInstance;
        if ((i & 4) != 0) {
            InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
            str3 = String.valueOf((interfaceC54581xNrOLrzqt == null || (newProxyInstance = interfaceC54581xNrOLrzqt.getNewProxyInstance()) == null) ? null : newProxyInstance.wlaJM());
        }
        marginModeManager.EZpvd(str, str2, str3);
    }

    public final void EZpvd(String str, String str2, String str3) {
        pUU.KWHzl("MarginModeLocalStorageManager", "setInstTypeDimensionMarginMode instType:" + str + " marginMode:" + str2 + " accountMode:" + str3);
        if (OLrzqt(null, str, str2, str3)) {
            return;
        }
        AEQbTJ(str, str3);
        SPUtils.put(str, str2, AEQbTJ(str3));
    }

    public static /* synthetic */ void saveInstMarginModeConfigsListToMemoryCache$default(MarginModeManager marginModeManager, ArrayList arrayList, String str, int i, Object obj) {
        xOW newProxyInstance;
        if ((i & 2) != 0) {
            InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
            str = String.valueOf((interfaceC54581xNrOLrzqt == null || (newProxyInstance = interfaceC54581xNrOLrzqt.getNewProxyInstance()) == null) ? null : newProxyInstance.wlaJM());
        }
        marginModeManager.copydefault((ArrayList<InstMarginModeConfigs>) arrayList, str);
    }

    public final void copydefault(ArrayList<InstMarginModeConfigs> arrayList, @NotNull String str) {
        synchronized (this) {
            Intrinsics.checkNotNullParameter(str, "");
            try {
                this.KWHzl.put(AEQbTJ(str), arrayList);
            } catch (Throwable th) {
                pUU.copydefault("MarginModeLocalStorageManager", "saveInstMarginModeConfigsListToMemoryCache error: :" + th.getMessage());
            }
        }
    }

    public static /* synthetic */ void saveInstFlyDimensionMarginModeToMemoryCache$default(MarginModeManager marginModeManager, String str, String str2, String str3, String str4, int i, Object obj) {
        xOW newProxyInstance;
        if ((i & 8) != 0) {
            InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
            str4 = String.valueOf((interfaceC54581xNrOLrzqt == null || (newProxyInstance = interfaceC54581xNrOLrzqt.getNewProxyInstance()) == null) ? null : newProxyInstance.wlaJM());
        }
        marginModeManager.KWHzl(str, str2, str3, str4);
    }

    public final void KWHzl(@NotNull final String str, @NotNull final String str2, @NotNull final String str3, @NotNull String str4) {
        synchronized (this) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            String strAEQbTJ = AEQbTJ(str4);
            ConcurrentHashMap<String, ArrayList<InstMarginModeConfigs>> concurrentHashMap = this.KWHzl;
            final Function2 function2 = new Function2() { // from class: o.xHW
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return MarginModeManager.EZpvd(str3, str, str2, (java.lang.String) obj, (java.util.ArrayList) obj2);
                }
            };
            concurrentHashMap.compute(strAEQbTJ, new BiFunction() { // from class: o.xHX
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.util.function.BiFunction
                public final java.lang.Object apply(java.lang.Object obj, java.lang.Object obj2) {
                    return MarginModeManager.EZpvd(function2, obj, obj2);
                }
            });
        }
    }

    public static final ArrayList EZpvd(Function2 function2, Object obj, Object obj2) {
        return (ArrayList) function2.invoke(obj, obj2);
    }

    public static final ArrayList EZpvd(String str, String str2, String str3, String str4, ArrayList arrayList) {
        Object obj;
        Object next;
        Intrinsics.checkNotNullParameter(str4, "");
        if (arrayList == null) {
            return yDY.copydefault(new InstMarginModeConfigs((String) null, str3, yDY.copydefault(new InstList(str, str2)), 1, (DefaultConstructorMarker) null));
        }
        Iterator it = arrayList.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Intrinsics.EZpvd((Object) ((InstMarginModeConfigs) next).getInstType(), (Object) str3)) {
                break;
            }
        }
        InstMarginModeConfigs instMarginModeConfigs = (InstMarginModeConfigs) next;
        if (instMarginModeConfigs != null) {
            Iterator<T> it2 = instMarginModeConfigs.getInstList().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next2 = it2.next();
                if (Intrinsics.EZpvd((Object) ((InstList) next2).getInstFamily(), (Object) str2)) {
                    obj = next2;
                    break;
                }
            }
            InstList instList = (InstList) obj;
            if (instList != null) {
                instList.setMarginMode(str);
                return arrayList;
            }
            instMarginModeConfigs.getInstList().add(new InstList(str, str2));
            return arrayList;
        }
        arrayList.add(new InstMarginModeConfigs((String) null, str3, yDY.copydefault(new InstList(str, str2)), 1, (DefaultConstructorMarker) null));
        return arrayList;
    }

    public static /* synthetic */ void saveInstFlyListMarginModeToMemoryCache$default(MarginModeManager marginModeManager, List list, String str, String str2, String str3, int i, Object obj) {
        xOW newProxyInstance;
        if ((i & 8) != 0) {
            InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
            str3 = String.valueOf((interfaceC54581xNrOLrzqt == null || (newProxyInstance = interfaceC54581xNrOLrzqt.getNewProxyInstance()) == null) ? null : newProxyInstance.wlaJM());
        }
        marginModeManager.copydefault((List<String>) list, str, str2, str3);
    }

    public static /* synthetic */ String getInstTypeDimensionMarginModeFromMemCache$default(MarginModeManager marginModeManager, String str, String str2, int i, Object obj) {
        xOW newProxyInstance;
        if ((i & 2) != 0) {
            InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
            str2 = String.valueOf((interfaceC54581xNrOLrzqt == null || (newProxyInstance = interfaceC54581xNrOLrzqt.getNewProxyInstance()) == null) ? null : newProxyInstance.wlaJM());
        }
        return marginModeManager.EZpvd(str, str2);
    }

    public final String EZpvd(@NotNull String str, @NotNull String str2) {
        Object next;
        String afterSetAllMarginMode;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        ArrayList<InstMarginModeConfigs> arrayList = this.KWHzl.get(AEQbTJ(str2));
        if (arrayList == null) {
            return "";
        }
        Iterator<T> it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Intrinsics.EZpvd((Object) ((InstMarginModeConfigs) next).getInstType(), (Object) str)) {
                break;
            }
        }
        InstMarginModeConfigs instMarginModeConfigs = (InstMarginModeConfigs) next;
        return (instMarginModeConfigs == null || (afterSetAllMarginMode = instMarginModeConfigs.getAfterSetAllMarginMode()) == null) ? "" : afterSetAllMarginMode;
    }

    public static /* synthetic */ String fetchInstFlyDimensionMarginModeFromMemCache$default(MarginModeManager marginModeManager, String str, String str2, String str3, int i, Object obj) {
        xOW newProxyInstance;
        if ((i & 4) != 0) {
            InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
            str3 = String.valueOf((interfaceC54581xNrOLrzqt == null || (newProxyInstance = interfaceC54581xNrOLrzqt.getNewProxyInstance()) == null) ? null : newProxyInstance.wlaJM());
        }
        return marginModeManager.KWHzl(str, str2, str3);
    }

    public final String KWHzl(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Object obj;
        Object next;
        ArrayList<InstList> instList;
        String marginMode;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        ArrayList<InstMarginModeConfigs> arrayList = this.KWHzl.get(AEQbTJ(str3));
        if (arrayList == null) {
            return "";
        }
        Iterator<T> it = arrayList.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Intrinsics.EZpvd((Object) ((InstMarginModeConfigs) next).getInstType(), (Object) str2)) {
                break;
            }
        }
        InstMarginModeConfigs instMarginModeConfigs = (InstMarginModeConfigs) next;
        if (instMarginModeConfigs == null || (instList = instMarginModeConfigs.getInstList()) == null) {
            return "";
        }
        Iterator<T> it2 = instList.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next2 = it2.next();
            if (Intrinsics.EZpvd((Object) ((InstList) next2).getInstFamily(), (Object) str)) {
                obj = next2;
                break;
            }
        }
        InstList instList2 = (InstList) obj;
        return (instList2 == null || (marginMode = instList2.getMarginMode()) == null) ? "" : marginMode;
    }

    public static /* synthetic */ void saveInstFlyMarginModeToLocal$default(MarginModeManager marginModeManager, SpotCopyInstSwitchConfig spotCopyInstSwitchConfig, ArrayList arrayList, Context context, String str, BizInstrument bizInstrument, int i, Object obj) {
        xOW newProxyInstance;
        if ((i & 8) != 0) {
            InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
            str = String.valueOf((interfaceC54581xNrOLrzqt == null || (newProxyInstance = interfaceC54581xNrOLrzqt.getNewProxyInstance()) == null) ? null : newProxyInstance.wlaJM());
        }
        String str2 = str;
        if ((i & 16) != 0) {
            bizInstrument = xLX.OLrzqt(marginModeManager.KWHzl()).EZpvd();
        }
        marginModeManager.copydefault(spotCopyInstSwitchConfig, (ArrayList<InstMarginModeConfigs>) arrayList, context, str2, bizInstrument);
    }

    public final void copydefault(SpotCopyInstSwitchConfig spotCopyInstSwitchConfig, ArrayList<InstMarginModeConfigs> arrayList, @NotNull Context context, @NotNull String str, BizInstrument bizInstrument) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        try {
            if (KWHzl("", "", bizInstrument, str) == null && arrayList != null) {
                for (InstMarginModeConfigs instMarginModeConfigs : arrayList) {
                    if (KWHzl("", instMarginModeConfigs.getInstType(), bizInstrument, str) == null) {
                        AEQbTJ(instMarginModeConfigs.getInstType(), str);
                        if (instMarginModeConfigs.getAfterSetAllMarginMode() != null && instMarginModeConfigs.getAfterSetAllMarginMode().length() > 0) {
                            setInstTypeDimensionMarginMode$default(this, instMarginModeConfigs.getInstType(), instMarginModeConfigs.getAfterSetAllMarginMode(), null, 4, null);
                        }
                        for (InstList instList : instMarginModeConfigs.getInstList()) {
                            copydefault(yDY.copydefault(instList.getInstFamily()), instMarginModeConfigs.getInstType(), instList.getMarginMode(), context, str);
                        }
                    }
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
            pUU.copydefault("MarginModeLocalStorageManager", "saveInstFlyMarginModeToLocal error: :" + Unit.INSTANCE);
        }
    }

    public static /* synthetic */ void setInstFlyListMarginMode$default(MarginModeManager marginModeManager, List list, String str, String str2, Context context, String str3, int i, Object obj) {
        xOW newProxyInstance;
        if ((i & 16) != 0) {
            InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
            str3 = String.valueOf((interfaceC54581xNrOLrzqt == null || (newProxyInstance = interfaceC54581xNrOLrzqt.getNewProxyInstance()) == null) ? null : newProxyInstance.wlaJM());
        }
        marginModeManager.copydefault((List<String>) list, str, str2, context, str3);
    }

    public final void copydefault(@NotNull List<String> list, @NotNull String str, @NotNull String str2, @NotNull Context context, @NotNull String str3) {
        synchronized (this) {
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(str3, "");
            pUU.KWHzl("MarginModeLocalStorageManager", "setInstFlyListMarginMode instType:" + str + " marginMode:" + str2 + " accountMode:" + str3);
            copydefault(list, str, str2, str3);
            try {
                SharedPreferences.Editor editorEdit = context.getSharedPreferences(KWHzl(str, str3), 0).edit();
                for (String str4 : list) {
                    if (C33129mqd.OLrzqt((CharSequence) str4)) {
                        editorEdit.putString(str4, str2);
                    }
                }
                editorEdit.apply();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public final void EZpvd(@NotNull String str, BizInstrument bizInstrument) {
        String instType;
        String instFamily;
        Intrinsics.checkNotNullParameter(str, "");
        setInstFlyDimensionMarginMode$default(this, (bizInstrument == null || (instFamily = bizInstrument.getInstFamily()) == null) ? "" : instFamily, (bizInstrument == null || (instType = bizInstrument.getInstType()) == null) ? "" : instType, str, null, 8, null);
    }

    public static /* synthetic */ void setInstFlyDimensionMarginMode$default(MarginModeManager marginModeManager, String str, String str2, String str3, String str4, int i, Object obj) {
        xOW newProxyInstance;
        if ((i & 8) != 0) {
            InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
            str4 = String.valueOf((interfaceC54581xNrOLrzqt == null || (newProxyInstance = interfaceC54581xNrOLrzqt.getNewProxyInstance()) == null) ? null : newProxyInstance.wlaJM());
        }
        marginModeManager.copydefault(str, str2, str3, str4);
    }

    public final void copydefault(String str, String str2, String str3, String str4) {
        pUU.KWHzl("MarginModeLocalStorageManager", "setInstFlyDimensionMarginMode instFly:" + str + " instType:" + str2 + " marginMode:" + str3 + " accountMode:" + str4);
        if (OLrzqt(str, str2, str3, str4)) {
            return;
        }
        KWHzl(str, str2, str3, str4);
        SPUtils.put(str, str3, KWHzl(str2, str4));
    }

    public final boolean OLrzqt(String str, String str2, String str3, String str4) {
        if (!C55697xoo.OLrzqt.isConnected()) {
            if (str != null) {
                this.valueOf.put(str + str2, str3);
            } else {
                this.valueOf.clear();
                this.AhwBna.put(str2, str3);
            }
            return true;
        }
        if (!C33129mqd.OLrzqt(str4, "4")) {
            return false;
        }
        if (str != null) {
            this.OLrzqt.put(str + str2, str3);
        } else {
            this.OLrzqt.clear();
            this.AEQbTJ.put(str2, str3);
        }
        return true;
    }

    public final void AEQbTJ(String str, String str2) {
        synchronized (this) {
            pUU.KWHzl("MarginModeLocalStorageManager", "deleteInstFlyConfig instType:" + str + " accountMode:" + str2);
            SPUtils.clear(KWHzl(str, str2));
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:11:0x001f A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002a A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String KWHzl(@NotNull String str) {
        String str2;
        Intrinsics.checkNotNullParameter(str, "");
        switch (str.hashCode()) {
            case 49:
                str2 = "1";
                str.equals(str2);
            case 50:
                str2 = "2";
                str.equals(str2);
            case 51:
                return !str.equals("3") ? "isolated" : "cross";
            case 52:
                if (!str.equals("4")) {
                }
                break;
        }
    }

    public final String KWHzl(String str, String str2) {
        C54589xNz c54589xNz = C54589xNz.EZpvd;
        String str3 = "trade_impl_margin_mode_" + c54589xNz.EZpvd() + "_" + c54589xNz.DbNXlk() + "_" + str2 + "_" + str;
        pUU.AEQbTJ("getInstFlyDimensionSpFileName " + str3);
        return str3;
    }

    public final String AEQbTJ(String str) {
        String str2;
        synchronized (this) {
            C54589xNz c54589xNz = C54589xNz.EZpvd;
            str2 = "trade_impl_margin_mode_" + c54589xNz.EZpvd() + "_" + c54589xNz.DbNXlk() + "_" + str;
            pUU.AEQbTJ("getInstTypeDimensionSpFileName " + str2);
        }
        return str2;
    }

    public final void valueOf() {
        if (EZpvd()) {
            Iterator<T> it = this.gEmmrt.iterator();
            while (it.hasNext()) {
                OLrzqt((String) it.next());
            }
            SPUtils.remove("crossed_cache");
            SPUtils.remove("option_margin_mode_cache");
            SPUtils.remove("pm_mode_option_margin_mode_cache");
        }
    }

    public final boolean EZpvd() {
        SharedPreferences sharedPreferences = C43246rlf.OLrzqt.valueOf().getSharedPreferences("config", 0);
        boolean z = sharedPreferences.contains("crossed_cache") || sharedPreferences.contains("option_margin_mode_cache") || sharedPreferences.contains("pm_mode_option_margin_mode_cache");
        pUU.KWHzl("MarginModeLocalStorageManager", "isOperationMigrate " + z);
        return z;
    }

    public final void OLrzqt(String str) {
        xOW newProxyInstance;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt;
        xOW newProxyInstance2;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt2;
        xOW newProxyInstance3;
        xOV xovEZpvd;
        pUU.KWHzl("MarginModeLocalStorageManager", "migrate instType: " + str);
        if (Intrinsics.EZpvd((Object) str, (Object) "SPOT") && ((interfaceC54581xNrOLrzqt2 = C54589xNz.EZpvd.OLrzqt()) == null || (newProxyInstance3 = interfaceC54581xNrOLrzqt2.getNewProxyInstance()) == null || (xovEZpvd = newProxyInstance3.EZpvd()) == null || !xovEZpvd.copydefault())) {
            return;
        }
        if (!Intrinsics.EZpvd((Object) str, (Object) "OPTION") || (interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt()) == null || (newProxyInstance2 = interfaceC54581xNrOLrzqt.getNewProxyInstance()) == null || !newProxyInstance2.zuBGHE()) {
            if (Intrinsics.EZpvd((Object) str, (Object) "OPTION")) {
                InterfaceC54581xNr interfaceC54581xNrOLrzqt3 = C54589xNz.EZpvd.OLrzqt();
                if (interfaceC54581xNrOLrzqt3 == null || (newProxyInstance = interfaceC54581xNrOLrzqt3.getNewProxyInstance()) == null || !newProxyInstance.AhwBna()) {
                    if (SPUtils.getBoolean("option_margin_mode_cache", false)) {
                        setInstTypeDimensionMarginMode$default(this, str, "cross", null, 4, null);
                        return;
                    } else {
                        setInstTypeDimensionMarginMode$default(this, str, "isolated", null, 4, null);
                        return;
                    }
                }
                return;
            }
            if (SPUtils.getBoolean("crossed_cache", false)) {
                setInstTypeDimensionMarginMode$default(this, str, "cross", null, 4, null);
            } else {
                setInstTypeDimensionMarginMode$default(this, str, "isolated", null, 4, null);
            }
        }
    }

    public final String KWHzl(String str, String str2, BizInstrument bizInstrument, String str3) {
        InterfaceC54581xNr interfaceC54581xNrOLrzqt;
        xOW newProxyInstance;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt2;
        xOW newProxyInstance2;
        xOV xovEZpvd;
        if (bizInstrument != null && bizInstrument.isPreMarketPair() && Intrinsics.EZpvd((Object) "FUTURES", (Object) str2)) {
            return "isolated";
        }
        if (!C55697xoo.OLrzqt.isConnected()) {
            String str4 = this.valueOf.get(str + str2);
            if (str4 != null) {
                return str4;
            }
            String str5 = this.AhwBna.get(str2);
            return str5 != null ? str5 : this.djBIcL;
        }
        if (Intrinsics.EZpvd((Object) str3, (Object) "4")) {
            if (Intrinsics.EZpvd((Object) str2, (Object) "SPOT")) {
                return "cross";
            }
            String str6 = this.OLrzqt.get(str + str2);
            if (str6 != null) {
                return str6;
            }
            String str7 = this.AEQbTJ.get(str2);
            return str7 != null ? str7 : this.AYXKKw;
        }
        if (Intrinsics.EZpvd((Object) str3, (Object) "3") && Intrinsics.EZpvd((Object) str2, (Object) "SPOT")) {
            return "cross";
        }
        if (Intrinsics.EZpvd((Object) str2, (Object) "SPOT") && ((interfaceC54581xNrOLrzqt2 = C54589xNz.EZpvd.OLrzqt()) == null || (newProxyInstance2 = interfaceC54581xNrOLrzqt2.getNewProxyInstance()) == null || (xovEZpvd = newProxyInstance2.EZpvd()) == null || !xovEZpvd.copydefault())) {
            return "cash";
        }
        if (!Intrinsics.EZpvd((Object) str2, (Object) "OPTION") || (interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt()) == null || (newProxyInstance = interfaceC54581xNrOLrzqt.getNewProxyInstance()) == null || !newProxyInstance.zuBGHE()) {
            return null;
        }
        return "cash";
    }

    public final TradePositionManager.MarginModeType copydefault(String str) {
        int iHashCode = str.hashCode();
        if (iHashCode != 3046195) {
            if (iHashCode != 94935104) {
                if (iHashCode == 575780121 && str.equals("isolated")) {
                    return TradePositionManager.MarginModeType.ISOLATED;
                }
            } else if (str.equals("cross")) {
                return TradePositionManager.MarginModeType.CROSSED;
            }
        } else if (str.equals("cash")) {
            return TradePositionManager.MarginModeType.CASH;
        }
        return TradePositionManager.MarginModeType.CASH;
    }

    public final void OLrzqt(@NotNull BizInstrument bizInstrument, @NotNull String str) {
        C54589xNz c54589xNz;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt;
        xOW newProxyInstance;
        xOV xovEZpvd;
        BaseInstrument baseInfo;
        Intrinsics.checkNotNullParameter(bizInstrument, "");
        Intrinsics.checkNotNullParameter(str, "");
        BizInstrument bizInstrument2 = (BizInstrument) xVA.EZpvd(bizInstrument);
        if (!yDY.gEmmrt("SPOT", "MARGIN").contains(bizInstrument2.getInstType()) || (interfaceC54581xNrOLrzqt = (c54589xNz = C54589xNz.EZpvd).OLrzqt()) == null || (newProxyInstance = interfaceC54581xNrOLrzqt.getNewProxyInstance()) == null || (xovEZpvd = newProxyInstance.EZpvd()) == null || !xovEZpvd.KWHzl()) {
            return;
        }
        bizInstrument2.setInstType("SPOT");
        SpotInstrument spotInstrument = bizInstrument2 instanceof SpotInstrument ? (SpotInstrument) bizInstrument2 : null;
        if (spotInstrument != null && (baseInfo = spotInstrument.getBaseInfo()) != null) {
            baseInfo.setInstType("SPOT");
        }
        InterfaceC54581xNr interfaceC54581xNrOLrzqt2 = c54589xNz.OLrzqt();
        if (interfaceC54581xNrOLrzqt2 != null) {
            interfaceC54581xNrOLrzqt2.KWHzl(bizInstrument2);
        }
    }

    public static /* synthetic */ void syncAccountChangedMarginModeToServer$default(MarginModeManager marginModeManager, String str, InterfaceC55701xos interfaceC55701xos, String str2, int i, Object obj) {
        xOW newProxyInstance;
        if ((i & 1) != 0) {
            str = "";
        }
        if ((i & 4) != 0) {
            InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
            str2 = String.valueOf((interfaceC54581xNrOLrzqt == null || (newProxyInstance = interfaceC54581xNrOLrzqt.getNewProxyInstance()) == null) ? null : newProxyInstance.wlaJM());
        }
        marginModeManager.copydefault(str, interfaceC55701xos, str2);
    }

    public final void copydefault(@NotNull String str, InterfaceC55701xos<ResponseData<ArrayList<InstMarginModeConfigs>>> interfaceC55701xos, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        syncMarginModeSettingsToServer$default(this, str, null, null, null, false, interfaceC55701xos, str2, null, 128, null);
    }

    public static /* synthetic */ void setMultiInstMarginModes$default(MarginModeManager marginModeManager, String str, List list, List list2, InterfaceC55701xos interfaceC55701xos, String str2, int i, Object obj) {
        InterfaceC54581xNr interfaceC54581xNrOLrzqt;
        xOW newProxyInstance;
        if ((i & 16) != 0 && ((interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt()) == null || (newProxyInstance = interfaceC54581xNrOLrzqt.getNewProxyInstance()) == null || (str2 = newProxyInstance.wlaJM()) == null)) {
            str2 = "1";
        }
        marginModeManager.AEQbTJ(str, (List<String>) list, (List<String>) list2, (InterfaceC55701xos<ResponseData<ArrayList<InstMarginModeConfigs>>>) interfaceC55701xos, str2);
    }

    public final void AEQbTJ(String str, List<String> list, List<String> list2, InterfaceC55701xos<ResponseData<ArrayList<InstMarginModeConfigs>>> interfaceC55701xos, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str2, "");
        syncMarginModeSettingsToServer$default(this, String.valueOf(MarginModeChangedSourceType.USER_SELECT_MARGIN_TYPE.getValue()), str, list, list2, true, interfaceC55701xos, str2, null, 128, null);
    }

    public static /* synthetic */ void syncMarginModeSettingsToServer$default(MarginModeManager marginModeManager, String str, String str2, List list, List list2, boolean z, InterfaceC55701xos interfaceC55701xos, String str3, BizInstrument bizInstrument, int i, Object obj) {
        String strValueOf;
        xOW newProxyInstance;
        String str4 = (i & 1) != 0 ? "" : str;
        if ((i & 64) != 0) {
            InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
            strValueOf = String.valueOf((interfaceC54581xNrOLrzqt == null || (newProxyInstance = interfaceC54581xNrOLrzqt.getNewProxyInstance()) == null) ? null : newProxyInstance.wlaJM());
        } else {
            strValueOf = str3;
        }
        marginModeManager.EZpvd(str4, str2, list, list2, z, interfaceC55701xos, strValueOf, (i & 128) != 0 ? xLX.OLrzqt(marginModeManager.KWHzl()).EZpvd() : bizInstrument);
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.xKK.Activity.execute$default(o.xKK, long, int, java.lang.Object):void */
    public final void EZpvd(@NotNull String str, String str2, List<String> list, List<String> list2, boolean z, final InterfaceC55701xos<ResponseData<ArrayList<InstMarginModeConfigs>>> interfaceC55701xos, @NotNull String str3, final BizInstrument bizInstrument) {
        ArrayList arrayList;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str3, "");
        if (!C55697xoo.OLrzqt.isConnected()) {
            if (interfaceC55701xos != null) {
                interfaceC55701xos.EZpvd(true, null, null);
                return;
            }
            return;
        }
        C56170xxk c56170xxk = new C56170xxk();
        if (list2 == null) {
            arrayList = new ArrayList();
        } else {
            arrayList = new ArrayList();
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                ConfigInstListData configInstListData = str2 != null ? new ConfigInstListData(str2, list, (String) it.next(), z) : null;
                if (configInstListData != null) {
                    arrayList.add(configInstListData);
                }
            }
        }
        c56170xxk.AEQbTJ(new MarginModeConfigData(str, str3, arrayList));
        c56170xxk.KWHzl(new Function1() { // from class: o.xHQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return MarginModeManager.OLrzqt(interfaceC55701xos, bizInstrument, (ResponseData) obj);
            }
        });
        xKK.Activity.execute$default(c56170xxk, 0L, 1, null);
    }

    public final void copydefault(@NotNull List<String> list, @NotNull String str, @NotNull String str2, @NotNull String str3) {
        synchronized (this) {
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                KWHzl((String) it.next(), str, str2, str3);
            }
        }
    }

    public static final Unit OLrzqt(InterfaceC55701xos interfaceC55701xos, BizInstrument bizInstrument, ResponseData responseData) {
        MarginModeManager marginModeManagerIsConnected;
        MarginModeManager marginModeManagerIsConnected2;
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() != 0) {
            C33134mqi.AEQbTJ(responseData.getMsg());
            pUU.copydefault("MarginModeLocalStorageManager", "Sync margin mode to server,error:" + responseData.getError_code());
            if (interfaceC55701xos != null) {
                interfaceC55701xos.EZpvd(false, null, new BizApiException(responseData.getMsg(), null, null, null, null, 30, null));
            }
        } else {
            if (interfaceC55701xos != null) {
                interfaceC55701xos.EZpvd(true, responseData, null);
            }
            C54589xNz c54589xNz = C54589xNz.EZpvd;
            InterfaceC54581xNr interfaceC54581xNrOLrzqt = c54589xNz.OLrzqt();
            if (interfaceC54581xNrOLrzqt != null && (marginModeManagerIsConnected2 = interfaceC54581xNrOLrzqt.isConnected()) != null) {
                saveInstMarginModeConfigsListToMemoryCache$default(marginModeManagerIsConnected2, (ArrayList) responseData.getData(), null, 2, null);
            }
            InterfaceC54581xNr interfaceC54581xNrOLrzqt2 = c54589xNz.OLrzqt();
            if (interfaceC54581xNrOLrzqt2 != null && (marginModeManagerIsConnected = interfaceC54581xNrOLrzqt2.isConnected()) != null) {
                saveInstFlyMarginModeToLocal$default(marginModeManagerIsConnected, null, (ArrayList) responseData.getData(), C43246rlf.OLrzqt.valueOf(), null, bizInstrument, 8, null);
            }
        }
        return Unit.INSTANCE;
    }
}
