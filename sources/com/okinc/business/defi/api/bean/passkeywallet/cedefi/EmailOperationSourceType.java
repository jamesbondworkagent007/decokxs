package com.okinc.business.defi.api.bean.passkeywallet.cedefi;

import kotlin.jvm.internal.DefaultConstructorMarker;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes18.dex */
public final class EmailOperationSourceType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ EmailOperationSourceType[] $VALUES;
    public static final ActionBar Companion;
    public static final EmailOperationSourceType FROM_CREATE_WALLET = new EmailOperationSourceType("FROM_CREATE_WALLET", 0);
    public static final EmailOperationSourceType FROM_SIGN_TRANSACTION = new EmailOperationSourceType("FROM_SIGN_TRANSACTION", 1);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ EmailOperationSourceType[] $values() {
        return new EmailOperationSourceType[]{FROM_CREATE_WALLET, FROM_SIGN_TRANSACTION};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<EmailOperationSourceType> getEntries() {
        return $ENTRIES;
    }

    private EmailOperationSourceType(String str, int i) {
    }

    static {
        EmailOperationSourceType[] emailOperationSourceTypeArr$values = $values();
        $VALUES = emailOperationSourceTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(emailOperationSourceTypeArr$values);
        Companion = new ActionBar(null);
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.api.bean.passkeywallet.cedefi.EmailOperationSourceType.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    public static EmailOperationSourceType valueOf(String str) {
        return (EmailOperationSourceType) Enum.valueOf(EmailOperationSourceType.class, str);
    }

    public static EmailOperationSourceType[] values() {
        return (EmailOperationSourceType[]) $VALUES.clone();
    }
}
