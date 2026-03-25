package com.okinc.business.web3pay.lib.core.model;

import kotlin.jvm.internal.DefaultConstructorMarker;
import o.C31269lqo;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes23.dex */
public final class NetworkFeeInfo {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ NetworkFeeInfo[] $VALUES;
    public static final TaskDescription Companion;
    public static final NetworkFeeInfo NETWORK_ACTIVATION_FEE = new NetworkFeeInfo("NETWORK_ACTIVATION_FEE", 0);
    public static final NetworkFeeInfo ADDITIONAL_FEE_REQUIRED = new NetworkFeeInfo("ADDITIONAL_FEE_REQUIRED", 1);
    public static final NetworkFeeInfo DEFAULT = new NetworkFeeInfo("DEFAULT", 2);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ NetworkFeeInfo[] $values() {
        return new NetworkFeeInfo[]{NETWORK_ACTIVATION_FEE, ADDITIONAL_FEE_REQUIRED, DEFAULT};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<NetworkFeeInfo> getEntries() {
        return $ENTRIES;
    }

    private NetworkFeeInfo(String str, int i) {
    }

    static {
        NetworkFeeInfo[] networkFeeInfoArr$values = $values();
        $VALUES = networkFeeInfoArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(networkFeeInfoArr$values);
        Companion = new TaskDescription(null);
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.web3pay.lib.core.model.NetworkFeeInfo.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final NetworkFeeInfo EZpvd(int i) {
            if (C31269lqo.OLrzqt.copydefault(i)) {
                return NetworkFeeInfo.NETWORK_ACTIVATION_FEE;
            }
            if (i != 0) {
                return NetworkFeeInfo.ADDITIONAL_FEE_REQUIRED;
            }
            return NetworkFeeInfo.DEFAULT;
        }
    }

    public static NetworkFeeInfo valueOf(String str) {
        return (NetworkFeeInfo) Enum.valueOf(NetworkFeeInfo.class, str);
    }

    public static NetworkFeeInfo[] values() {
        return (NetworkFeeInfo[]) $VALUES.clone();
    }
}
