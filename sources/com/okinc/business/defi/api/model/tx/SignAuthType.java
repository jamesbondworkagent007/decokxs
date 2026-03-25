package com.okinc.business.defi.api.model.tx;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class SignAuthType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ SignAuthType[] $VALUES;
    public static final StateListAnimator Companion;
    public static final SignAuthType USER_VERIFIED = new SignAuthType("USER_VERIFIED", 0);
    public static final SignAuthType SILENT = new SignAuthType("SILENT", 1);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ SignAuthType[] $values() {
        return new SignAuthType[]{USER_VERIFIED, SILENT};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<SignAuthType> getEntries() {
        return $ENTRIES;
    }

    private SignAuthType(String str, int i) {
    }

    static {
        SignAuthType[] signAuthTypeArr$values = $values();
        $VALUES = signAuthTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(signAuthTypeArr$values);
        Companion = new StateListAnimator(null);
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.api.model.tx.SignAuthType.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final SignAuthType KWHzl(Boolean bool) {
            return Intrinsics.EZpvd(bool, Boolean.TRUE) ? SignAuthType.SILENT : SignAuthType.USER_VERIFIED;
        }
    }

    public static SignAuthType valueOf(String str) {
        return (SignAuthType) Enum.valueOf(SignAuthType.class, str);
    }

    public static SignAuthType[] values() {
        return (SignAuthType[]) $VALUES.clone();
    }
}
