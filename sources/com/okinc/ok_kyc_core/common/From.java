package com.okinc.ok_kyc_core.common;

import com.okinc.ok_kyc_core.common.From;
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
public final class From {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ From[] $VALUES;
    private static final InterfaceC56387yDm<KSerializer<Object>> $cachedSerializer$delegate;
    public static final Companion Companion;
    public static final From KYC1 = new From("KYC1", 0);
    public static final From KYC2 = new From("KYC2", 1);
    public static final From KYC3 = new From("KYC3", 2);
    public static final From HOME = new From("HOME", 3);
    public static final From NOTABENE = new From("NOTABENE", 4);
    public static final From WITHDRAWAL = new From("WITHDRAWAL", 5);
    public static final From EDD = new From("EDD", 6);
    public static final From KYC1REFRESH = new From("KYC1REFRESH", 7);
    public static final From KYC2REFRESH = new From("KYC2REFRESH", 8);
    public static final From ADDITIONALINFO = new From("ADDITIONALINFO", 9);
    public static final From QUESTIONNAIRE = new From("QUESTIONNAIRE", 10);
    public static final From QUESTION_NOTNOW = new From("QUESTION_NOTNOW", 11);
    public static final From DERIVATIVE_AGREEMENT = new From("DERIVATIVE_AGREEMENT", 12);
    public static final From NONE = new From("NONE", 13);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ From[] $values() {
        return new From[]{KYC1, KYC2, KYC3, HOME, NOTABENE, WITHDRAWAL, EDD, KYC1REFRESH, KYC2REFRESH, ADDITIONALINFO, QUESTIONNAIRE, QUESTION_NOTNOW, DERIVATIVE_AGREEMENT, NONE};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<From> getEntries() {
        return $ENTRIES;
    }

    /* JADX INFO: loaded from: classes19.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.ok_kyc_core.common.From.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ KSerializer copydefault() {
            return (KSerializer) From.$cachedSerializer$delegate.getValue();
        }

        public final KSerializer<From> serializer() {
            return copydefault();
        }
    }

    private From(String str, int i) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return EnumsKt.createSimpleEnumSerializer("com.okinc.ok_kyc_core.common.From", values());
    }

    static {
        From[] fromArr$values = $values();
        $VALUES = fromArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(fromArr$values);
        Companion = new Companion(null);
        $cachedSerializer$delegate = C56392yDr.EZpvd(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: o.rur
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return From._init_$_anonymous_();
            }
        });
    }

    public static From valueOf(String str) {
        return (From) Enum.valueOf(From.class, str);
    }

    public static From[] values() {
        return (From[]) $VALUES.clone();
    }
}
