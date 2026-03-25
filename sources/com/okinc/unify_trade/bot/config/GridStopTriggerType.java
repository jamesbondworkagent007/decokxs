package com.okinc.unify_trade.bot.config;

import androidx.annotation.StringRes;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.okinc.unify_trade.biz.AdvancedTriggerSign;
import com.okinc.unify_trade.biz.DcaTriggerParam;
import com.okinc.unify_trade.biz.SignParamItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C33070mpX;
import o.C55688xof;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes12.dex */
public final class GridStopTriggerType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ GridStopTriggerType[] $VALUES;
    public static final StateListAnimator Companion;
    public static final GridStopTriggerType MANUAL_STOP = new GridStopTriggerType("MANUAL_STOP", 0, "instant", C55688xof.Application.ActivityResultContractsGetMultipleContents);
    public static final GridStopTriggerType PRICE = new GridStopTriggerType("PRICE", 1, FirebaseAnalytics.Param.PRICE, C55688xof.Application.getClipDataUrisactivity_release);
    public static final GridStopTriggerType RSI_14 = new GridStopTriggerType("RSI_14", 2, "rsi", C55688xof.Application.MediaBrowserCompatSearchCallback);
    public static final GridStopTriggerType TRADINGVIEW = new GridStopTriggerType("TRADINGVIEW", 3, "webhook", C55688xof.Application.onScrollStateChanged);
    private final int desc;
    private final String mode;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ GridStopTriggerType[] $values() {
        return new GridStopTriggerType[]{MANUAL_STOP, PRICE, RSI_14, TRADINGVIEW};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<GridStopTriggerType> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getDesc() {
        return this.desc;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMode() {
        return this.mode;
    }

    private GridStopTriggerType(String str, @StringRes int i, String str2, int i2) {
        this.mode = str2;
        this.desc = i2;
    }

    static {
        GridStopTriggerType[] gridStopTriggerTypeArr$values = $values();
        $VALUES = gridStopTriggerTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(gridStopTriggerTypeArr$values);
        Companion = new StateListAnimator(null);
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.bot.config.GridStopTriggerType.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final String EZpvd(String str) {
            GridStopTriggerType gridStopTriggerType;
            String strAYXKKw;
            GridStopTriggerType[] gridStopTriggerTypeArrValues = GridStopTriggerType.values();
            int length = gridStopTriggerTypeArrValues.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    gridStopTriggerType = null;
                    break;
                }
                gridStopTriggerType = gridStopTriggerTypeArrValues[i];
                if (Intrinsics.EZpvd((Object) gridStopTriggerType.getMode(), (Object) str)) {
                    break;
                }
                i++;
            }
            return (gridStopTriggerType == null || (strAYXKKw = C33070mpX.AYXKKw(gridStopTriggerType.getDesc())) == null) ? "" : strAYXKKw;
        }

        public final boolean copydefault(ArrayList<AdvancedTriggerSign> arrayList) {
            Object obj = null;
            if (arrayList != null) {
                Iterator<T> it = arrayList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    AdvancedTriggerSign advancedTriggerSign = (AdvancedTriggerSign) next;
                    if (Intrinsics.EZpvd((Object) advancedTriggerSign.getTriggerAction(), (Object) "stop") && Intrinsics.EZpvd((Object) advancedTriggerSign.getIndicator(), (Object) GridStopTriggerType.TRADINGVIEW.getMode())) {
                        obj = next;
                        break;
                    }
                }
                obj = (AdvancedTriggerSign) obj;
            }
            return obj != null;
        }

        public final boolean KWHzl(ArrayList<SignParamItem> arrayList, List<DcaTriggerParam> list) {
            SignParamItem signParamItem;
            Object next;
            Object obj = null;
            if (arrayList != null) {
                Iterator<T> it = arrayList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    SignParamItem signParamItem2 = (SignParamItem) next;
                    if (Intrinsics.EZpvd((Object) signParamItem2.getTriggerAction(), (Object) "stop") && Intrinsics.EZpvd((Object) signParamItem2.getIndicator(), (Object) GridStopTriggerType.TRADINGVIEW.getMode())) {
                        break;
                    }
                }
                signParamItem = (SignParamItem) next;
            } else {
                signParamItem = null;
            }
            if (signParamItem == null) {
                if (list != null) {
                    Iterator<T> it2 = list.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        Object next2 = it2.next();
                        DcaTriggerParam dcaTriggerParam = (DcaTriggerParam) next2;
                        if (Intrinsics.EZpvd((Object) dcaTriggerParam.getTriggerAction(), (Object) "stop") && Intrinsics.EZpvd((Object) dcaTriggerParam.getTriggerStrategy(), (Object) GridStopTriggerType.TRADINGVIEW.getMode())) {
                            obj = next2;
                            break;
                        }
                    }
                    obj = (DcaTriggerParam) obj;
                }
                if (obj == null) {
                    return false;
                }
            }
            return true;
        }

        public final boolean AEQbTJ(ArrayList<SignParamItem> arrayList, List<DcaTriggerParam> list) {
            SignParamItem signParamItem;
            Object next;
            Object obj = null;
            if (arrayList != null) {
                Iterator<T> it = arrayList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    SignParamItem signParamItem2 = (SignParamItem) next;
                    if (Intrinsics.EZpvd((Object) signParamItem2.getTriggerAction(), (Object) "stop") && Intrinsics.EZpvd((Object) signParamItem2.getIndicator(), (Object) GridStopTriggerType.PRICE.getMode())) {
                        break;
                    }
                }
                signParamItem = (SignParamItem) next;
            } else {
                signParamItem = null;
            }
            if (signParamItem == null) {
                if (list != null) {
                    Iterator<T> it2 = list.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        Object next2 = it2.next();
                        DcaTriggerParam dcaTriggerParam = (DcaTriggerParam) next2;
                        if (Intrinsics.EZpvd((Object) dcaTriggerParam.getTriggerAction(), (Object) "stop") && Intrinsics.EZpvd((Object) dcaTriggerParam.getTriggerStrategy(), (Object) GridStopTriggerType.PRICE.getMode())) {
                            obj = next2;
                            break;
                        }
                    }
                    obj = (DcaTriggerParam) obj;
                }
                if (obj == null) {
                    return false;
                }
            }
            return true;
        }
    }

    public static GridStopTriggerType valueOf(String str) {
        return (GridStopTriggerType) Enum.valueOf(GridStopTriggerType.class, str);
    }

    public static GridStopTriggerType[] values() {
        return (GridStopTriggerType[]) $VALUES.clone();
    }
}
