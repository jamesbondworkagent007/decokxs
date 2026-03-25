package com.okinc.business.web3pay.lib.core.model;

import kotlin.jvm.internal.DefaultConstructorMarker;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes23.dex */
public final class ProjectId {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ ProjectId[] $VALUES;
    public static final StateListAnimator Companion;
    private final int value;
    public static final ProjectId NATIVE_PAY = new ProjectId("NATIVE_PAY", 0, 1);
    public static final ProjectId IM_PAY = new ProjectId("IM_PAY", 1, 100);
    public static final ProjectId GIFT_PAY = new ProjectId("GIFT_PAY", 2, 200);
    public static final ProjectId REWARDS = new ProjectId("REWARDS", 3, 300);
    public static final ProjectId CARD = new ProjectId("CARD", 4, 400);
    public static final ProjectId C2B = new ProjectId("C2B", 5, 500);
    public static final ProjectId CEDEFI = new ProjectId("CEDEFI", 6, 600);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ ProjectId[] $values() {
        return new ProjectId[]{NATIVE_PAY, IM_PAY, GIFT_PAY, REWARDS, CARD, C2B, CEDEFI};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<ProjectId> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getValue() {
        return this.value;
    }

    private ProjectId(String str, int i, int i2) {
        this.value = i2;
    }

    static {
        ProjectId[] projectIdArr$values = $values();
        $VALUES = projectIdArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(projectIdArr$values);
        Companion = new StateListAnimator(null);
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.web3pay.lib.core.model.ProjectId.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    public static ProjectId valueOf(String str) {
        return (ProjectId) Enum.valueOf(ProjectId.class, str);
    }

    public static ProjectId[] values() {
        return (ProjectId[]) $VALUES.clone();
    }
}
