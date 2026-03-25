package com.okinc.buysell.external;

import com.okinc.buysell.external.KycOnboardingActionType;
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
/* JADX INFO: loaded from: classes15.dex */
@Serializable
public final class KycOnboardingActionType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ KycOnboardingActionType[] $VALUES;
    private static final InterfaceC56387yDm<KSerializer<Object>> $cachedSerializer$delegate;
    public static final Companion Companion;
    private final int code;
    public static final KycOnboardingActionType DISMISS_CLICK = new KycOnboardingActionType("DISMISS_CLICK", 0, 0);
    public static final KycOnboardingActionType LEAVE_BUTTON_CLICK = new KycOnboardingActionType("LEAVE_BUTTON_CLICK", 1, 1);
    public static final KycOnboardingActionType CLOSED_BY_DROPDOWN = new KycOnboardingActionType("CLOSED_BY_DROPDOWN", 2, 2);
    public static final KycOnboardingActionType EXIT = new KycOnboardingActionType("EXIT", 3, 3);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ KycOnboardingActionType[] $values() {
        return new KycOnboardingActionType[]{DISMISS_CLICK, LEAVE_BUTTON_CLICK, CLOSED_BY_DROPDOWN, EXIT};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<KycOnboardingActionType> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getCode() {
        return this.code;
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.buysell.external.KycOnboardingActionType.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ KSerializer AEQbTJ() {
            return (KSerializer) KycOnboardingActionType.$cachedSerializer$delegate.getValue();
        }

        public final KSerializer<KycOnboardingActionType> serializer() {
            return AEQbTJ();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return EnumsKt.createSimpleEnumSerializer("com.okinc.buysell.external.KycOnboardingActionType", values());
    }

    private KycOnboardingActionType(String str, int i, int i2) {
        this.code = i2;
    }

    static {
        KycOnboardingActionType[] kycOnboardingActionTypeArr$values = $values();
        $VALUES = kycOnboardingActionTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(kycOnboardingActionTypeArr$values);
        Companion = new Companion(null);
        $cachedSerializer$delegate = C56392yDr.EZpvd(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: o.lzl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return KycOnboardingActionType._init_$_anonymous_();
            }
        });
    }

    public static KycOnboardingActionType valueOf(String str) {
        return (KycOnboardingActionType) Enum.valueOf(KycOnboardingActionType.class, str);
    }

    public static KycOnboardingActionType[] values() {
        return (KycOnboardingActionType[]) $VALUES.clone();
    }
}
