package com.okinc.business.dexui.main.swap.widget.slippage;

import com.reown.android.pulse.model.EventType;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes18.dex */
public final class InputStatus {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ InputStatus[] $VALUES;
    public static final StateListAnimator Companion;
    private final int status;
    public static final InputStatus NORMAL = new InputStatus("NORMAL", 0, 0);
    public static final InputStatus WARNING = new InputStatus("WARNING", 1, 1);
    public static final InputStatus ERROR = new InputStatus(EventType.ERROR, 2, 2);
    public static final InputStatus NO_DATA = new InputStatus("NO_DATA", 3, 3);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ InputStatus[] $values() {
        return new InputStatus[]{NORMAL, WARNING, ERROR, NO_DATA};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<InputStatus> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getStatus() {
        return this.status;
    }

    private InputStatus(String str, int i, int i2) {
        this.status = i2;
    }

    static {
        InputStatus[] inputStatusArr$values = $values();
        $VALUES = inputStatusArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(inputStatusArr$values);
        Companion = new StateListAnimator(null);
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dexui.main.swap.widget.slippage.InputStatus.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    public static InputStatus valueOf(String str) {
        return (InputStatus) Enum.valueOf(InputStatus.class, str);
    }

    public static InputStatus[] values() {
        return (InputStatus[]) $VALUES.clone();
    }
}
