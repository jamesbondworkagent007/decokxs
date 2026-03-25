package com.okinc.unify_trade.bot.config;

import androidx.annotation.StringRes;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
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
public final class GridStartTriggerType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ GridStartTriggerType[] $VALUES;
    public static final Application Companion;
    public static final GridStartTriggerType INSTANT = new GridStartTriggerType("INSTANT", 0, "instant", C55688xof.Application.DLWbHP);
    public static final GridStartTriggerType PRICE = new GridStartTriggerType("PRICE", 1, FirebaseAnalytics.Param.PRICE, C55688xof.Application.getClipDataUrisactivity_release);
    public static final GridStartTriggerType RSI_14 = new GridStartTriggerType("RSI_14", 2, "rsi", C55688xof.Application.MediaBrowserCompatSearchCallback);
    public static final GridStartTriggerType TRADINGVIEW = new GridStartTriggerType("TRADINGVIEW", 3, "webhook", C55688xof.Application.onScrollStateChanged);
    private final int desc;
    private final String mode;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ GridStartTriggerType[] $values() {
        return new GridStartTriggerType[]{INSTANT, PRICE, RSI_14, TRADINGVIEW};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<GridStartTriggerType> getEntries() {
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

    private GridStartTriggerType(String str, @StringRes int i, String str2, int i2) {
        this.mode = str2;
        this.desc = i2;
    }

    static {
        GridStartTriggerType[] gridStartTriggerTypeArr$values = $values();
        $VALUES = gridStartTriggerTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(gridStartTriggerTypeArr$values);
        Companion = new Application(null);
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.bot.config.GridStartTriggerType.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final String copydefault(String str) {
            GridStartTriggerType gridStartTriggerType;
            String strAYXKKw;
            GridStartTriggerType[] gridStartTriggerTypeArrValues = GridStartTriggerType.values();
            int length = gridStartTriggerTypeArrValues.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    gridStartTriggerType = null;
                    break;
                }
                gridStartTriggerType = gridStartTriggerTypeArrValues[i];
                if (Intrinsics.EZpvd((Object) gridStartTriggerType.getMode(), (Object) str)) {
                    break;
                }
                i++;
            }
            return (gridStartTriggerType == null || (strAYXKKw = C33070mpX.AYXKKw(gridStartTriggerType.getDesc())) == null) ? "" : strAYXKKw;
        }

        public final boolean KWHzl(ArrayList<AdvancedTriggerSign> arrayList) {
            if (arrayList == null) {
                return false;
            }
            Iterator<T> it = arrayList.iterator();
            while (it.hasNext()) {
                if (Intrinsics.EZpvd((Object) ((AdvancedTriggerSign) it.next()).getIndicator(), (Object) GridStartTriggerType.TRADINGVIEW.getMode())) {
                    return true;
                }
            }
            return false;
        }

        public final boolean copydefault(ArrayList<SignParamItem> arrayList, List<DcaTriggerParam> list) {
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
                    if (Intrinsics.EZpvd((Object) signParamItem2.getTriggerAction(), (Object) TtmlNode.START) && Intrinsics.EZpvd((Object) signParamItem2.getIndicator(), (Object) GridStartTriggerType.TRADINGVIEW.getMode())) {
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
                        if (Intrinsics.EZpvd((Object) dcaTriggerParam.getTriggerAction(), (Object) TtmlNode.START) && Intrinsics.EZpvd((Object) dcaTriggerParam.getTriggerStrategy(), (Object) GridStartTriggerType.TRADINGVIEW.getMode())) {
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
                    if (Intrinsics.EZpvd((Object) signParamItem2.getTriggerAction(), (Object) TtmlNode.START) && Intrinsics.EZpvd((Object) signParamItem2.getIndicator(), (Object) GridStartTriggerType.PRICE.getMode())) {
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
                        if (Intrinsics.EZpvd((Object) dcaTriggerParam.getTriggerAction(), (Object) TtmlNode.START) && Intrinsics.EZpvd((Object) dcaTriggerParam.getTriggerStrategy(), (Object) GridStartTriggerType.PRICE.getMode())) {
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
                    if (Intrinsics.EZpvd((Object) signParamItem2.getTriggerAction(), (Object) TtmlNode.START) && Intrinsics.EZpvd((Object) signParamItem2.getIndicator(), (Object) GridStartTriggerType.RSI_14.getMode())) {
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
                        if (Intrinsics.EZpvd((Object) dcaTriggerParam.getTriggerAction(), (Object) TtmlNode.START) && Intrinsics.EZpvd((Object) dcaTriggerParam.getTriggerStrategy(), (Object) GridStartTriggerType.RSI_14.getMode())) {
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

    public static GridStartTriggerType valueOf(String str) {
        return (GridStartTriggerType) Enum.valueOf(GridStartTriggerType.class, str);
    }

    public static GridStartTriggerType[] values() {
        return (GridStartTriggerType[]) $VALUES.clone();
    }
}
