package com.okinc.auth.impl.mfa.model;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C56444yFp;
import o.InterfaceC56445yFq;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes14.dex */
public final class MfaNextStep {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ MfaNextStep[] $VALUES;
    public static final ActionBar Companion;
    private final String key;
    public static final MfaNextStep UNKNOWN = new MfaNextStep("UNKNOWN", 0, "UNKNOWN");
    public static final MfaNextStep MFA_VERIFICATION = new MfaNextStep("MFA_VERIFICATION", 1, "MFA_VERIFICATION");
    public static final MfaNextStep PASSWORD = new MfaNextStep("PASSWORD", 2, "PASSWORD");
    public static final MfaNextStep PASSKEY = new MfaNextStep("PASSKEY", 3, "PASSKEY");
    public static final MfaNextStep EMAIL = new MfaNextStep("EMAIL", 4, "EMAIL");
    public static final MfaNextStep PHONE = new MfaNextStep("PHONE", 5, "PHONE");
    public static final MfaNextStep AUTHENTICATOR = new MfaNextStep("AUTHENTICATOR", 6, "AUTHENTICATOR");
    public static final MfaNextStep FACE_VERIFY = new MfaNextStep("FACE_VERIFY", 7, "FACE_VERIFY");
    public static final MfaNextStep CREATE_TICKET = new MfaNextStep("CREATE_TICKET", 8, "CREATE_TICKET");
    public static final MfaNextStep TICKET_CREATED = new MfaNextStep("TICKET_CREATED", 9, "TICKET_CREATED");
    public static final MfaNextStep SUCCESS = new MfaNextStep("SUCCESS", 10, "SUCCESS");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ MfaNextStep[] $values() {
        return new MfaNextStep[]{UNKNOWN, MFA_VERIFICATION, PASSWORD, PASSKEY, EMAIL, PHONE, AUTHENTICATOR, FACE_VERIFY, CREATE_TICKET, TICKET_CREATED, SUCCESS};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<MfaNextStep> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getKey() {
        return this.key;
    }

    private MfaNextStep(String str, int i, String str2) {
        this.key = str2;
    }

    static {
        MfaNextStep[] mfaNextStepArr$values = $values();
        $VALUES = mfaNextStepArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(mfaNextStepArr$values);
        Companion = new ActionBar(null);
    }

    /* JADX INFO: loaded from: classes17.dex */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.auth.impl.mfa.model.MfaNextStep.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final MfaNextStep KWHzl(@NotNull String str) {
            MfaNextStep mfaNextStep;
            Intrinsics.checkNotNullParameter(str, "");
            MfaNextStep[] mfaNextStepArrValues = MfaNextStep.values();
            int length = mfaNextStepArrValues.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    mfaNextStep = null;
                    break;
                }
                mfaNextStep = mfaNextStepArrValues[i];
                if (Intrinsics.EZpvd((Object) mfaNextStep.getKey(), (Object) str)) {
                    break;
                }
                i++;
            }
            return mfaNextStep == null ? MfaNextStep.UNKNOWN : mfaNextStep;
        }
    }

    public static MfaNextStep valueOf(String str) {
        return (MfaNextStep) Enum.valueOf(MfaNextStep.class, str);
    }

    public static MfaNextStep[] values() {
        return (MfaNextStep[]) $VALUES.clone();
    }
}
