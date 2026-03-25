package com.okinc.business.defi.biz.constant;

import kotlin.jvm.internal.DefaultConstructorMarker;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class KYSApprovalType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ KYSApprovalType[] $VALUES;
    public static final Application Companion;
    public static final KYSApprovalType AUTHORIZATION = new KYSApprovalType("AUTHORIZATION", 0);
    public static final KYSApprovalType CANCEL_AUTHORIZATION = new KYSApprovalType("CANCEL_AUTHORIZATION", 1);
    public static final KYSApprovalType INCREASE_ALLOWANCE = new KYSApprovalType("INCREASE_ALLOWANCE", 2);
    public static final KYSApprovalType DECREASE_ALLOWANCE = new KYSApprovalType("DECREASE_ALLOWANCE", 3);
    public static final KYSApprovalType NFT_AUTHORIZATION = new KYSApprovalType("NFT_AUTHORIZATION", 4);
    public static final KYSApprovalType NFT_CANCEL_AUTHORIZATION = new KYSApprovalType("NFT_CANCEL_AUTHORIZATION", 5);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ KYSApprovalType[] $values() {
        return new KYSApprovalType[]{AUTHORIZATION, CANCEL_AUTHORIZATION, INCREASE_ALLOWANCE, DECREASE_ALLOWANCE, NFT_AUTHORIZATION, NFT_CANCEL_AUTHORIZATION};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<KYSApprovalType> getEntries() {
        return $ENTRIES;
    }

    private KYSApprovalType(String str, int i) {
    }

    static {
        KYSApprovalType[] kYSApprovalTypeArr$values = $values();
        $VALUES = kYSApprovalTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(kYSApprovalTypeArr$values);
        Companion = new Application(null);
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.constant.KYSApprovalType.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final KYSApprovalType OLrzqt(Integer num) {
            return (num != null && num.intValue() == 4) ? KYSApprovalType.AUTHORIZATION : (num != null && num.intValue() == 6) ? KYSApprovalType.CANCEL_AUTHORIZATION : (num != null && num.intValue() == 13) ? KYSApprovalType.INCREASE_ALLOWANCE : (num != null && num.intValue() == 14) ? KYSApprovalType.DECREASE_ALLOWANCE : (num != null && num.intValue() == 27) ? KYSApprovalType.NFT_AUTHORIZATION : (num != null && num.intValue() == 28) ? KYSApprovalType.NFT_CANCEL_AUTHORIZATION : KYSApprovalType.AUTHORIZATION;
        }
    }

    public static KYSApprovalType valueOf(String str) {
        return (KYSApprovalType) Enum.valueOf(KYSApprovalType.class, str);
    }

    public static KYSApprovalType[] values() {
        return (KYSApprovalType[]) $VALUES.clone();
    }
}
