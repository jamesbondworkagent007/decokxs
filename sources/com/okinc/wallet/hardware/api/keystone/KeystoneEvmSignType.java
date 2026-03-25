package com.okinc.wallet.hardware.api.keystone;

import kotlin.jvm.internal.DefaultConstructorMarker;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes12.dex */
public final class KeystoneEvmSignType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ KeystoneEvmSignType[] $VALUES;
    public static final TaskDescription Companion;
    private final int value;
    public static final KeystoneEvmSignType Legacy = new KeystoneEvmSignType("Legacy", 0, 0);
    public static final KeystoneEvmSignType EIP1559 = new KeystoneEvmSignType("EIP1559", 1, 1);
    public static final KeystoneEvmSignType PersonalMessage = new KeystoneEvmSignType("PersonalMessage", 2, 2);
    public static final KeystoneEvmSignType TypeMessage = new KeystoneEvmSignType("TypeMessage", 3, 3);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ KeystoneEvmSignType[] $values() {
        return new KeystoneEvmSignType[]{Legacy, EIP1559, PersonalMessage, TypeMessage};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<KeystoneEvmSignType> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getValue() {
        return this.value;
    }

    private KeystoneEvmSignType(String str, int i, int i2) {
        this.value = i2;
    }

    static {
        KeystoneEvmSignType[] keystoneEvmSignTypeArr$values = $values();
        $VALUES = keystoneEvmSignTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(keystoneEvmSignTypeArr$values);
        Companion = new TaskDescription(null);
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.wallet.hardware.api.keystone.KeystoneEvmSignType.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final KeystoneEvmSignType EZpvd(int i) throws Exception {
            if (i == 0) {
                return KeystoneEvmSignType.Legacy;
            }
            if (i == 1) {
                return KeystoneEvmSignType.EIP1559;
            }
            if (i == 2) {
                return KeystoneEvmSignType.PersonalMessage;
            }
            if (i == 3) {
                return KeystoneEvmSignType.TypeMessage;
            }
            throw new Exception("no KeystoneEvmSignType");
        }
    }

    public static KeystoneEvmSignType valueOf(String str) {
        return (KeystoneEvmSignType) Enum.valueOf(KeystoneEvmSignType.class, str);
    }

    public static KeystoneEvmSignType[] values() {
        return (KeystoneEvmSignType[]) $VALUES.clone();
    }
}
