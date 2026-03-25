package com.okinc.business.defi.wallet.passkey.cedefi.escape.ui.activity;

import com.okinc.business.defi.wallet.passkey.cedefi.escape.domain.model.EscapeErrorCodes;
import o.C56444yFp;
import o.InterfaceC56445yFq;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public interface RiskControlDialogCallback {
    void KWHzl(@NotNull BackType backType);

    void OLrzqt(EscapeErrorCodes.EscapeRiskType escapeRiskType);

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: loaded from: classes15.dex */
    public static final class BackType {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ BackType[] $VALUES;
        public static final BackType BACK_TO_HOME = new BackType("BACK_TO_HOME", 0);
        public static final BackType BACK_TO_ADDRESS = new BackType("BACK_TO_ADDRESS", 1);

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ BackType[] $values() {
            return new BackType[]{BACK_TO_HOME, BACK_TO_ADDRESS};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<BackType> getEntries() {
            return $ENTRIES;
        }

        private BackType(String str, int i) {
        }

        static {
            BackType[] backTypeArr$values = $values();
            $VALUES = backTypeArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(backTypeArr$values);
        }

        public static BackType valueOf(String str) {
            return (BackType) Enum.valueOf(BackType.class, str);
        }

        public static BackType[] values() {
            return (BackType[]) $VALUES.clone();
        }
    }
}
