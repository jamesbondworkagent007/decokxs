package com.reown.android.internal.common.model;

/* JADX INFO: loaded from: classes12.dex */
public final class TelemetryEnabled {
    public final boolean value;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0002: CONSTRUCTOR (r1v0 boolean) A[MD:(boolean):void (m)] call: com.reown.android.internal.common.model.TelemetryEnabled.<init>(boolean):void type: CONSTRUCTOR */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ TelemetryEnabled m7246boximpl(boolean z) {
        return new TelemetryEnabled(z);
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static boolean m7247constructorimpl(boolean z) {
        return z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m7248equalsimpl(boolean z, Object obj) {
        return (obj instanceof TelemetryEnabled) && z == ((TelemetryEnabled) obj).m7252unboximpl();
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m7249equalsimpl0(boolean z, boolean z2) {
        return z == z2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m7250hashCodeimpl(boolean z) {
        return Boolean.hashCode(z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m7251toStringimpl(boolean z) {
        return "TelemetryEnabled(value=" + z + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        return m7248equalsimpl(this.value, obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getValue() {
        return this.value;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return m7250hashCodeimpl(this.value);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return m7251toStringimpl(this.value);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ boolean m7252unboximpl() {
        return this.value;
    }

    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [com.reown.android.internal.common.model.TelemetryEnabled.box-impl(boolean):com.reown.android.internal.common.model.TelemetryEnabled] */
    public /* synthetic */ TelemetryEnabled(boolean z) {
        this.value = z;
    }
}
