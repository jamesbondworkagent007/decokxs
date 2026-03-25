package com.okinc.business.defi.wallet.passkey.cedefi.escape.domain.model;

import java.util.Iterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX INFO: loaded from: classes18.dex */
public final class EscapeErrorCodes {
    public static final EscapeErrorCodes EZpvd = new EscapeErrorCodes();

    private EscapeErrorCodes() {
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: loaded from: classes15.dex */
    public static final class EscapeRiskType {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ EscapeRiskType[] $VALUES;
        public static final TaskDescription Companion;
        private final int value;
        public static final EscapeRiskType DEVICE_RISK = new EscapeRiskType("DEVICE_RISK", 0, 1);
        public static final EscapeRiskType ADDRESS_RISK = new EscapeRiskType("ADDRESS_RISK", 1, 2);
        public static final EscapeRiskType ADDRESS_KYS_RISK = new EscapeRiskType("ADDRESS_KYS_RISK", 2, 3);

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ EscapeRiskType[] $values() {
            return new EscapeRiskType[]{DEVICE_RISK, ADDRESS_RISK, ADDRESS_KYS_RISK};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<EscapeRiskType> getEntries() {
            return $ENTRIES;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int getValue() {
            return this.value;
        }

        private EscapeRiskType(String str, int i, int i2) {
            this.value = i2;
        }

        static {
            EscapeRiskType[] escapeRiskTypeArr$values = $values();
            $VALUES = escapeRiskTypeArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(escapeRiskTypeArr$values);
            Companion = new TaskDescription(null);
        }

        /* JADX INFO: loaded from: classes18.dex */
        public static final class TaskDescription {
            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.wallet.passkey.cedefi.escape.domain.model.EscapeErrorCodes.EscapeRiskType.TaskDescription.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private TaskDescription() {
            }

            public final EscapeRiskType OLrzqt(int i) {
                EscapeRiskType next;
                Iterator<EscapeRiskType> it = EscapeRiskType.getEntries().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    if (next.getValue() == i) {
                        break;
                    }
                }
                return next;
            }
        }

        public static EscapeRiskType valueOf(String str) {
            return (EscapeRiskType) Enum.valueOf(EscapeRiskType.class, str);
        }

        public static EscapeRiskType[] values() {
            return (EscapeRiskType[]) $VALUES.clone();
        }
    }
}
