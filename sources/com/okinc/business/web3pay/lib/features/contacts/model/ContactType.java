package com.okinc.business.web3pay.lib.features.contacts.model;

import kotlin.jvm.internal.DefaultConstructorMarker;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes23.dex */
public final class ContactType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ ContactType[] $VALUES;
    public static final Application Companion;
    public static final ContactType EMAIL = new ContactType("EMAIL", 0, 1);
    public static final ContactType PHONE_NUMBER = new ContactType("PHONE_NUMBER", 1, 2);
    public static final ContactType UID = new ContactType("UID", 2, 3);
    private final int value;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ ContactType[] $values() {
        return new ContactType[]{EMAIL, PHONE_NUMBER, UID};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<ContactType> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getValue() {
        return this.value;
    }

    private ContactType(String str, int i, int i2) {
        this.value = i2;
    }

    static {
        ContactType[] contactTypeArr$values = $values();
        $VALUES = contactTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(contactTypeArr$values);
        Companion = new Application(null);
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.web3pay.lib.features.contacts.model.ContactType.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    public static ContactType valueOf(String str) {
        return (ContactType) Enum.valueOf(ContactType.class, str);
    }

    public static ContactType[] values() {
        return (ContactType[]) $VALUES.clone();
    }
}
