package com.okinc.auth.impl.debugtool.passkey;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import o.C56444yFp;
import o.InterfaceC5640aAL;
import o.InterfaceC56445yFq;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class PasskeyDebugTool implements InterfaceC5640aAL {
    public static final PasskeyDebugTool EZpvd = new PasskeyDebugTool();
    public static final String copydefault = "Passkey";
    public static final String AYXKKw = "https://okg-block.larksuite.com/wiki/MqS4wZ9LRirF72kGemou6xJtsjg";
    public static PasskeyVersionStatus AEQbTJ = PasskeyVersionStatus.AUTO;
    public static PasskeyDebugSdk KWHzl = PasskeyDebugSdk.AUTO;
    public static final int OLrzqt = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PasskeyDebugSdk AEQbTJ() {
        return KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(@NotNull PasskeyDebugSdk passkeyDebugSdk) {
        Intrinsics.checkNotNullParameter(passkeyDebugSdk, "");
        KWHzl = passkeyDebugSdk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(@NotNull PasskeyVersionStatus passkeyVersionStatus) {
        Intrinsics.checkNotNullParameter(passkeyVersionStatus, "");
        AEQbTJ = passkeyVersionStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PasskeyVersionStatus KWHzl() {
        return AEQbTJ;
    }

    private PasskeyDebugTool() {
    }

    @Override // o.InterfaceC43216rlB
    public void init(@NotNull Context context) {
        InterfaceC5640aAL.Application.OLrzqt(this, context);
    }

    @Override // o.InterfaceC43216rlB
    public boolean isInitialized() {
        return InterfaceC5640aAL.Application.AEQbTJ(this);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class PasskeyVersionStatus {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ PasskeyVersionStatus[] $VALUES;
        public static final PasskeyVersionStatus AUTO = new PasskeyVersionStatus("AUTO", 0);
        public static final PasskeyVersionStatus DEBUG_ONLY_FIDO1_V1_V2 = new PasskeyVersionStatus("DEBUG_ONLY_FIDO1_V1_V2", 1);
        public static final PasskeyVersionStatus DEBUG_ONLY_FIDO2 = new PasskeyVersionStatus("DEBUG_ONLY_FIDO2", 2);
        public static final PasskeyVersionStatus DEBUG_ONLY_INCOMPATIBLE = new PasskeyVersionStatus("DEBUG_ONLY_INCOMPATIBLE", 3);

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ PasskeyVersionStatus[] $values() {
            return new PasskeyVersionStatus[]{AUTO, DEBUG_ONLY_FIDO1_V1_V2, DEBUG_ONLY_FIDO2, DEBUG_ONLY_INCOMPATIBLE};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<PasskeyVersionStatus> getEntries() {
            return $ENTRIES;
        }

        private PasskeyVersionStatus(String str, int i) {
        }

        static {
            PasskeyVersionStatus[] passkeyVersionStatusArr$values = $values();
            $VALUES = passkeyVersionStatusArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(passkeyVersionStatusArr$values);
        }

        public static PasskeyVersionStatus valueOf(String str) {
            return (PasskeyVersionStatus) Enum.valueOf(PasskeyVersionStatus.class, str);
        }

        public static PasskeyVersionStatus[] values() {
            return (PasskeyVersionStatus[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class PasskeyDebugSdk {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ PasskeyDebugSdk[] $VALUES;
        public static final PasskeyDebugSdk AUTO = new PasskeyDebugSdk("AUTO", 0);
        public static final PasskeyDebugSdk DEBUG_ONLY_FORCE_FIDO2 = new PasskeyDebugSdk("DEBUG_ONLY_FORCE_FIDO2", 1);
        public static final PasskeyDebugSdk DEBUG_ONLY_FORCE_CRED_MAN = new PasskeyDebugSdk("DEBUG_ONLY_FORCE_CRED_MAN", 2);

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ PasskeyDebugSdk[] $values() {
            return new PasskeyDebugSdk[]{AUTO, DEBUG_ONLY_FORCE_FIDO2, DEBUG_ONLY_FORCE_CRED_MAN};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<PasskeyDebugSdk> getEntries() {
            return $ENTRIES;
        }

        private PasskeyDebugSdk(String str, int i) {
        }

        static {
            PasskeyDebugSdk[] passkeyDebugSdkArr$values = $values();
            $VALUES = passkeyDebugSdkArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(passkeyDebugSdkArr$values);
        }

        public static PasskeyDebugSdk valueOf(String str) {
            return (PasskeyDebugSdk) Enum.valueOf(PasskeyDebugSdk.class, str);
        }

        public static PasskeyDebugSdk[] values() {
            return (PasskeyDebugSdk[]) $VALUES.clone();
        }
    }
}
