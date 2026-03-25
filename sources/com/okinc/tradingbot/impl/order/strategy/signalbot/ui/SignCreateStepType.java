package com.okinc.tradingbot.impl.order.strategy.signalbot.ui;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.C50708vYk;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class SignCreateStepType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ SignCreateStepType[] $VALUES;
    public static final Activity Companion;
    public static final SignCreateStepType STEP_1 = new SignCreateStepType("STEP_1", 0);
    public static final SignCreateStepType STEP_2 = new SignCreateStepType("STEP_2", 1);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ SignCreateStepType[] $values() {
        return new SignCreateStepType[]{STEP_1, STEP_2};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<SignCreateStepType> getEntries() {
        return $ENTRIES;
    }

    private SignCreateStepType(String str, int i) {
    }

    static {
        SignCreateStepType[] signCreateStepTypeArr$values = $values();
        $VALUES = signCreateStepTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(signCreateStepTypeArr$values);
        Companion = new Activity(null);
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.tradingbot.impl.order.strategy.signalbot.ui.SignCreateStepType.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final List<C50708vYk> copydefault() {
            SignCreateStepType[] signCreateStepTypeArrValues = SignCreateStepType.values();
            ArrayList arrayList = new ArrayList(signCreateStepTypeArrValues.length);
            for (SignCreateStepType signCreateStepType : signCreateStepTypeArrValues) {
                arrayList.add(new C50708vYk(signCreateStepType));
            }
            return arrayList;
        }
    }

    public static SignCreateStepType valueOf(String str) {
        return (SignCreateStepType) Enum.valueOf(SignCreateStepType.class, str);
    }

    public static SignCreateStepType[] values() {
        return (SignCreateStepType[]) $VALUES.clone();
    }
}
