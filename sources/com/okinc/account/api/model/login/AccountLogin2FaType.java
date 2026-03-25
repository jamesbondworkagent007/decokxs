package com.okinc.account.api.model.login;

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
/* JADX INFO: loaded from: classes22.dex */
@Serializable
public final class AccountLogin2FaType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ AccountLogin2FaType[] $VALUES;
    private static final InterfaceC56387yDm<KSerializer<Object>> $cachedSerializer$delegate;
    public static final Companion Companion;
    public static final AccountLogin2FaType MainAccount2Fa = new AccountLogin2FaType("MainAccount2Fa", 0);
    public static final AccountLogin2FaType SubAccountUseMainAccount2Fa = new AccountLogin2FaType("SubAccountUseMainAccount2Fa", 1);
    public static final AccountLogin2FaType SubAccountUseSubAccount2Fa = new AccountLogin2FaType("SubAccountUseSubAccount2Fa", 2);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ AccountLogin2FaType[] $values() {
        return new AccountLogin2FaType[]{MainAccount2Fa, SubAccountUseMainAccount2Fa, SubAccountUseSubAccount2Fa};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<AccountLogin2FaType> getEntries() {
        return $ENTRIES;
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.account.api.model.login.AccountLogin2FaType.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final /* synthetic */ KSerializer get$cachedSerializer() {
            return (KSerializer) AccountLogin2FaType.$cachedSerializer$delegate.getValue();
        }

        public final KSerializer<AccountLogin2FaType> serializer() {
            return get$cachedSerializer();
        }
    }

    private AccountLogin2FaType(String str, int i) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return EnumsKt.createSimpleEnumSerializer("com.okinc.account.api.model.login.AccountLogin2FaType", values());
    }

    static {
        AccountLogin2FaType[] accountLogin2FaTypeArr$values = $values();
        $VALUES = accountLogin2FaTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(accountLogin2FaTypeArr$values);
        Companion = new Companion(null);
        $cachedSerializer$delegate = C56392yDr.EZpvd(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: com.okinc.account.api.model.login.AccountLogin2FaType$$ExternalSyntheticLambda0
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AccountLogin2FaType._init_$_anonymous_();
            }
        });
    }

    public static AccountLogin2FaType valueOf(String str) {
        return (AccountLogin2FaType) Enum.valueOf(AccountLogin2FaType.class, str);
    }

    public static AccountLogin2FaType[] values() {
        return (AccountLogin2FaType[]) $VALUES.clone();
    }
}
