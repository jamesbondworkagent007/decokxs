package com.okinc.unify_trade.bot.config;

import androidx.annotation.StringRes;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.okinc.unify_trade.biz.DcaTriggerParam;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C33070mpX;
import o.C55688xof;
import o.C56444yFp;
import o.InterfaceC56445yFq;
import o.xMR;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes12.dex */
public final class ContractDcaStopConditionType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ ContractDcaStopConditionType[] $VALUES;
    public static final Activity Companion;
    public static final ContractDcaStopConditionType DEFAULT;
    public static final ContractDcaStopConditionType END_ROUND_STOP;
    public static final ContractDcaStopConditionType PRICE;
    private final int desc;
    private final String mode;
    private final int showMode;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ ContractDcaStopConditionType[] $values() {
        return new ContractDcaStopConditionType[]{DEFAULT, END_ROUND_STOP, PRICE};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<ContractDcaStopConditionType> getEntries() {
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getShowMode() {
        return this.showMode;
    }

    private ContractDcaStopConditionType(String str, @StringRes int i, @StringRes String str2, int i2, int i3) {
        this.mode = str2;
        this.showMode = i2;
        this.desc = i3;
    }

    static {
        int i = C55688xof.Application.DxnCrt;
        DEFAULT = new ContractDcaStopConditionType("DEFAULT", 0, "", i, i);
        END_ROUND_STOP = new ContractDcaStopConditionType("END_ROUND_STOP", 1, "end_round_stop", C55688xof.Application.stopBehavioSecDataCollection, C55688xof.Application.DcMfJKDDUqPf);
        PRICE = new ContractDcaStopConditionType("PRICE", 2, FirebaseAnalytics.Param.PRICE, C55688xof.Application.sendBehavioSecData, C55688xof.Application.DcMfJKDIADVb);
        ContractDcaStopConditionType[] contractDcaStopConditionTypeArr$values = $values();
        $VALUES = contractDcaStopConditionTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(contractDcaStopConditionTypeArr$values);
        Companion = new Activity(null);
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.bot.config.ContractDcaStopConditionType.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final String copydefault(List<DcaTriggerParam> list, String str) {
            DcaTriggerParam dcaTriggerParam;
            Object next;
            if (list != null) {
                Iterator<T> it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    DcaTriggerParam dcaTriggerParam2 = (DcaTriggerParam) next;
                    if (Intrinsics.EZpvd((Object) (dcaTriggerParam2 != null ? dcaTriggerParam2.getTriggerAction() : null), (Object) "stop")) {
                        break;
                    }
                }
                dcaTriggerParam = (DcaTriggerParam) next;
            } else {
                dcaTriggerParam = null;
            }
            String triggerStrategy = dcaTriggerParam != null ? dcaTriggerParam.getTriggerStrategy() : null;
            ContractDcaStopConditionType contractDcaStopConditionType = ContractDcaStopConditionType.PRICE;
            if (!Intrinsics.EZpvd((Object) triggerStrategy, (Object) contractDcaStopConditionType.getMode())) {
                return Intrinsics.EZpvd((Object) triggerStrategy, (Object) ContractDcaStopConditionType.END_ROUND_STOP.getMode()) ? C33070mpX.AYXKKw(C55688xof.Application.stopBehavioSecDataCollection) : "--";
            }
            String strAYXKKw = C33070mpX.AYXKKw(contractDcaStopConditionType.getShowMode());
            xMR xmr = xMR.copydefault;
            String triggerPx = dcaTriggerParam.getTriggerPx();
            if (triggerPx == null) {
                triggerPx = "";
            }
            return strAYXKKw + " | " + xmr.copydefault(triggerPx) + " " + str;
        }

        public final String KWHzl(List<DcaTriggerParam> list, String str) {
            DcaTriggerParam dcaTriggerParam;
            String strAYXKKw;
            Object next;
            if (list != null) {
                Iterator<T> it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    DcaTriggerParam dcaTriggerParam2 = (DcaTriggerParam) next;
                    if (Intrinsics.EZpvd((Object) (dcaTriggerParam2 != null ? dcaTriggerParam2.getTriggerAction() : null), (Object) "stop")) {
                        break;
                    }
                }
                dcaTriggerParam = (DcaTriggerParam) next;
            } else {
                dcaTriggerParam = null;
            }
            String triggerStrategy = dcaTriggerParam != null ? dcaTriggerParam.getTriggerStrategy() : null;
            ContractDcaStopConditionType contractDcaStopConditionType = ContractDcaStopConditionType.PRICE;
            if (!Intrinsics.EZpvd((Object) triggerStrategy, (Object) contractDcaStopConditionType.getMode())) {
                return Intrinsics.EZpvd((Object) triggerStrategy, (Object) ContractDcaStopConditionType.END_ROUND_STOP.getMode()) ? C33070mpX.AYXKKw(C55688xof.Application.stopBehavioSecDataCollection) : "--";
            }
            String triggerCond = dcaTriggerParam.getTriggerCond();
            if (Intrinsics.EZpvd((Object) triggerCond, (Object) "cross_up")) {
                strAYXKKw = C33070mpX.AYXKKw(C55688xof.Application.cancel);
            } else if (Intrinsics.EZpvd((Object) triggerCond, (Object) "cross_down")) {
                strAYXKKw = C33070mpX.AYXKKw(C55688xof.Application.getSessionID);
            } else {
                strAYXKKw = C33070mpX.AYXKKw(contractDcaStopConditionType.getShowMode());
            }
            xMR xmr = xMR.copydefault;
            String triggerPx = dcaTriggerParam.getTriggerPx();
            if (triggerPx == null) {
                triggerPx = "";
            }
            return strAYXKKw + " | " + xmr.copydefault(triggerPx) + " " + str;
        }
    }

    public static ContractDcaStopConditionType valueOf(String str) {
        return (ContractDcaStopConditionType) Enum.valueOf(ContractDcaStopConditionType.class, str);
    }

    public static ContractDcaStopConditionType[] values() {
        return (ContractDcaStopConditionType[]) $VALUES.clone();
    }
}
