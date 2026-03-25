package com.okinc.business.dexlogic.bean;

import java.util.Iterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class AddressType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ AddressType[] $VALUES;
    public static final Application Companion;
    private final int type;
    public static final AddressType Invalid = new AddressType("Invalid", 0, -1);
    public static final AddressType IsExchangeAddress = new AddressType("IsExchangeAddress", 1, 0);
    public static final AddressType IsContractAddress = new AddressType("IsContractAddress", 2, 1);
    public static final AddressType Normal = new AddressType("Normal", 3, 2);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ AddressType[] $values() {
        return new AddressType[]{Invalid, IsExchangeAddress, IsContractAddress, Normal};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<AddressType> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getType() {
        return this.type;
    }

    private AddressType(String str, int i, int i2) {
        this.type = i2;
    }

    static {
        AddressType[] addressTypeArr$values = $values();
        $VALUES = addressTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(addressTypeArr$values);
        Companion = new Application(null);
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dexlogic.bean.AddressType.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final AddressType KWHzl(Integer num) {
            AddressType next;
            Iterator<AddressType> it = AddressType.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                int type = next.getType();
                if (num != null && type == num.intValue()) {
                    break;
                }
            }
            AddressType addressType = next;
            return addressType == null ? AddressType.Invalid : addressType;
        }
    }

    public static AddressType valueOf(String str) {
        return (AddressType) Enum.valueOf(AddressType.class, str);
    }

    public static AddressType[] values() {
        return (AddressType[]) $VALUES.clone();
    }
}
