package com.amplifyframework.auth.cognito;

import kotlin.jvm.internal.DefaultConstructorMarker;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes14.dex */
public final class MFAPreference {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ MFAPreference[] $VALUES;
    private final boolean mfaEnabled;
    private final Boolean mfaPreferred;
    public static final MFAPreference DISABLED = new MFAPreference("DISABLED", 0, false, null, 2, null);
    public static final MFAPreference ENABLED = new MFAPreference("ENABLED", 1, true, null, 2, null);
    public static final MFAPreference PREFERRED = new MFAPreference("PREFERRED", 2, true, Boolean.TRUE);
    public static final MFAPreference NOT_PREFERRED = new MFAPreference("NOT_PREFERRED", 3, true, Boolean.FALSE);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ MFAPreference[] $values() {
        return new MFAPreference[]{DISABLED, ENABLED, PREFERRED, NOT_PREFERRED};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<MFAPreference> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static MFAPreference valueOf(String str) {
        return (MFAPreference) Enum.valueOf(MFAPreference.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static MFAPreference[] values() {
        return (MFAPreference[]) $VALUES.clone();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getMfaEnabled$aws_auth_cognito_release() {
        return this.mfaEnabled;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getMfaPreferred$aws_auth_cognito_release() {
        return this.mfaPreferred;
    }

    private MFAPreference(String str, int i, boolean z, Boolean bool) {
        this.mfaEnabled = z;
        this.mfaPreferred = bool;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 java.lang.String)
  (r2v0 int)
  (r3v0 boolean)
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r4v0 java.lang.Boolean))
 A[MD:(java.lang.String, int, boolean, java.lang.Boolean):void (m)] (LINE:33) call: com.amplifyframework.auth.cognito.MFAPreference.<init>(java.lang.String, int, boolean, java.lang.Boolean):void type: THIS */
    public /* synthetic */ MFAPreference(String str, int i, boolean z, Boolean bool, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, z, (i2 & 2) != 0 ? null : bool);
    }

    static {
        MFAPreference[] mFAPreferenceArr$values = $values();
        $VALUES = mFAPreferenceArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(mFAPreferenceArr$values);
    }
}
