package com.okinc.unify_trade.bot.config;

import androidx.annotation.StringRes;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C33070mpX;
import o.C55688xof;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes12.dex */
public final class ContractDcaStopLossType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ ContractDcaStopLossType[] $VALUES;
    public static final TaskDescription Companion;
    public static final ContractDcaStopLossType LIMIT = new ContractDcaStopLossType("LIMIT", 0, "limit", C55688xof.Application.jNexW);
    public static final ContractDcaStopLossType MARKET = new ContractDcaStopLossType("MARKET", 1, "market", C55688xof.Application.ExKek);
    private final String mode;
    private final int showMode;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ ContractDcaStopLossType[] $values() {
        return new ContractDcaStopLossType[]{LIMIT, MARKET};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<ContractDcaStopLossType> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMode() {
        return this.mode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getShowMode() {
        return this.showMode;
    }

    private ContractDcaStopLossType(String str, @StringRes int i, String str2, int i2) {
        this.mode = str2;
        this.showMode = i2;
    }

    static {
        ContractDcaStopLossType[] contractDcaStopLossTypeArr$values = $values();
        $VALUES = contractDcaStopLossTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(contractDcaStopLossTypeArr$values);
        Companion = new TaskDescription(null);
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.bot.config.ContractDcaStopLossType.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final ContractDcaStopLossType OLrzqt(String str) {
            for (ContractDcaStopLossType contractDcaStopLossType : ContractDcaStopLossType.values()) {
                if (Intrinsics.EZpvd((Object) contractDcaStopLossType.getMode(), (Object) str)) {
                    return contractDcaStopLossType;
                }
            }
            return null;
        }

        public final String AEQbTJ(String str) {
            String strAYXKKw;
            ContractDcaStopLossType contractDcaStopLossTypeOLrzqt = OLrzqt(str);
            if (contractDcaStopLossTypeOLrzqt != null && (strAYXKKw = C33070mpX.AYXKKw(contractDcaStopLossTypeOLrzqt.getShowMode())) != null) {
                String str2 = strAYXKKw + " | ";
                if (str2 != null) {
                    return str2;
                }
            }
            return "";
        }
    }

    public static ContractDcaStopLossType valueOf(String str) {
        return (ContractDcaStopLossType) Enum.valueOf(ContractDcaStopLossType.class, str);
    }

    public static ContractDcaStopLossType[] values() {
        return (ContractDcaStopLossType[]) $VALUES.clone();
    }
}
