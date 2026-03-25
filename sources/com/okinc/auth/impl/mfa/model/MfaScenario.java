package com.okinc.auth.impl.mfa.model;

import com.okinc.account.api.model.uploadpersonalinfo.AccountMfaScenario;
import com.okinc.auth.impl.mfa.model.MfaScenario;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
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
/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class MfaScenario {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ MfaScenario[] $VALUES;
    private static final InterfaceC56387yDm<KSerializer<Object>> $cachedSerializer$delegate;
    public static final Companion Companion;
    public static final MfaScenario IsNonAuth = new MfaScenario("IsNonAuth", 0);
    public static final MfaScenario IsPartialAuth = new MfaScenario("IsPartialAuth", 1);
    public static final MfaScenario IsPostLogin = new MfaScenario("IsPostLogin", 2);

    /* JADX INFO: loaded from: classes14.dex */
    public final /* synthetic */ class ActionBar {
        public static final /* synthetic */ int[] AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[MfaScenario.values().length];
            try {
                iArr[MfaScenario.IsNonAuth.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MfaScenario.IsPartialAuth.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[MfaScenario.IsPostLogin.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            AEQbTJ = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ MfaScenario[] $values() {
        return new MfaScenario[]{IsNonAuth, IsPartialAuth, IsPostLogin};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<MfaScenario> getEntries() {
        return $ENTRIES;
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.auth.impl.mfa.model.MfaScenario.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ KSerializer copydefault() {
            return (KSerializer) MfaScenario.$cachedSerializer$delegate.getValue();
        }

        public final KSerializer<MfaScenario> serializer() {
            return copydefault();
        }
    }

    private MfaScenario(String str, int i) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return EnumsKt.createSimpleEnumSerializer("com.okinc.auth.impl.mfa.model.MfaScenario", values());
    }

    static {
        MfaScenario[] mfaScenarioArr$values = $values();
        $VALUES = mfaScenarioArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(mfaScenarioArr$values);
        Companion = new Companion(null);
        $cachedSerializer$delegate = C56392yDr.EZpvd(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: o.aCq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return MfaScenario._init_$_anonymous_();
            }
        });
    }

    public final AccountMfaScenario toAccountMfaScenario() {
        int i = ActionBar.AEQbTJ[ordinal()];
        if (i == 1) {
            return AccountMfaScenario.IsNonAuth;
        }
        if (i == 2) {
            return AccountMfaScenario.IsPartialAuth;
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        return AccountMfaScenario.IsPostLogin;
    }

    public static MfaScenario valueOf(String str) {
        return (MfaScenario) Enum.valueOf(MfaScenario.class, str);
    }

    public static MfaScenario[] values() {
        return (MfaScenario[]) $VALUES.clone();
    }
}
