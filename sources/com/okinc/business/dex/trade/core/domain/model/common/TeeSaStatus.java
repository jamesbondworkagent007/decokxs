package com.okinc.business.dex.trade.core.domain.model.common;

import kotlin.jvm.internal.DefaultConstructorMarker;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class TeeSaStatus {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ TeeSaStatus[] $VALUES;
    public static final ActionBar Companion;
    public static final TeeSaStatus NON_TEE_ACTIVE_AND_EXPIRED = new TeeSaStatus("NON_TEE_ACTIVE_AND_EXPIRED", 0, "0");
    public static final TeeSaStatus TEE_ACTIVE = new TeeSaStatus("TEE_ACTIVE", 1, "1");
    public static final TeeSaStatus TEE_EXPIRED = new TeeSaStatus("TEE_EXPIRED", 2, "2");
    private final String value;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ TeeSaStatus[] $values() {
        return new TeeSaStatus[]{NON_TEE_ACTIVE_AND_EXPIRED, TEE_ACTIVE, TEE_EXPIRED};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<TeeSaStatus> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getValue() {
        return this.value;
    }

    private TeeSaStatus(String str, int i, String str2) {
        this.value = str2;
    }

    static {
        TeeSaStatus[] teeSaStatusArr$values = $values();
        $VALUES = teeSaStatusArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(teeSaStatusArr$values);
        Companion = new ActionBar(null);
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dex.trade.core.domain.model.common.TeeSaStatus.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    public static TeeSaStatus valueOf(String str) {
        return (TeeSaStatus) Enum.valueOf(TeeSaStatus.class, str);
    }

    public static TeeSaStatus[] values() {
        return (TeeSaStatus[]) $VALUES.clone();
    }
}
