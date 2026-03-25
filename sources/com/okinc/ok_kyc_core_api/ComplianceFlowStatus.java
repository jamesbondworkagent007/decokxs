package com.okinc.ok_kyc_core_api;

import com.okinc.ok_kyc_core_api.ComplianceFlowStatus;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.EnumsKt;
import o.C56392yDr;
import o.C56444yFp;
import o.InterfaceC56387yDm;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes16.dex */
@Serializable
public final class ComplianceFlowStatus {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ ComplianceFlowStatus[] $VALUES;
    private static final InterfaceC56387yDm<KSerializer<Object>> $cachedSerializer$delegate;
    public static final ComplianceFlowStatus Back = new ComplianceFlowStatus("Back", 0);
    public static final ComplianceFlowStatus Close = new ComplianceFlowStatus("Close", 1);
    public static final Companion Companion;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ ComplianceFlowStatus[] $values() {
        return new ComplianceFlowStatus[]{Back, Close};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<ComplianceFlowStatus> getEntries() {
        return $ENTRIES;
    }

    /* JADX INFO: loaded from: classes19.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.ok_kyc_core_api.ComplianceFlowStatus.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ KSerializer AEQbTJ() {
            return (KSerializer) ComplianceFlowStatus.$cachedSerializer$delegate.getValue();
        }

        public final KSerializer<ComplianceFlowStatus> serializer() {
            return AEQbTJ();
        }
    }

    private ComplianceFlowStatus(String str, int i) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return EnumsKt.createSimpleEnumSerializer("com.okinc.ok_kyc_core_api.ComplianceFlowStatus", values());
    }

    static {
        ComplianceFlowStatus[] complianceFlowStatusArr$values = $values();
        $VALUES = complianceFlowStatusArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(complianceFlowStatusArr$values);
        Companion = new Companion(null);
        $cachedSerializer$delegate = C56392yDr.EZpvd(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: o.rTO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return ComplianceFlowStatus._init_$_anonymous_();
            }
        });
    }

    public static ComplianceFlowStatus valueOf(String str) {
        return (ComplianceFlowStatus) Enum.valueOf(ComplianceFlowStatus.class, str);
    }

    public static ComplianceFlowStatus[] values() {
        return (ComplianceFlowStatus[]) $VALUES.clone();
    }
}
