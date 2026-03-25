package com.okinc.im.bean;

import kotlin.jvm.internal.DefaultConstructorMarker;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes18.dex */
public final class InputPanelStyle {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ InputPanelStyle[] $VALUES;
    public static final Activity Companion;
    private int v;
    public static final InputPanelStyle STYLE_SWITCH_CONTAINER_EXTENSION = new InputPanelStyle("STYLE_SWITCH_CONTAINER_EXTENSION", 0, 291);
    public static final InputPanelStyle STYLE_SWITCH_CONTAINER = new InputPanelStyle("STYLE_SWITCH_CONTAINER", 1, 288);
    public static final InputPanelStyle STYLE_CONTAINER_EXTENSION = new InputPanelStyle("STYLE_CONTAINER_EXTENSION", 2, 35);
    public static final InputPanelStyle STYLE_CONTAINER = new InputPanelStyle("STYLE_CONTAINER", 3, 32);
    public static final InputPanelStyle STYLE_INPUTS_DISABLE = new InputPanelStyle("STYLE_INPUTS_DISABLE", 4, 16);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ InputPanelStyle[] $values() {
        return new InputPanelStyle[]{STYLE_SWITCH_CONTAINER_EXTENSION, STYLE_SWITCH_CONTAINER, STYLE_CONTAINER_EXTENSION, STYLE_CONTAINER, STYLE_INPUTS_DISABLE};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<InputPanelStyle> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getV() {
        return this.v;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setV(int i) {
        this.v = i;
    }

    private InputPanelStyle(String str, int i, int i2) {
        this.v = i2;
    }

    static {
        InputPanelStyle[] inputPanelStyleArr$values = $values();
        $VALUES = inputPanelStyleArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(inputPanelStyleArr$values);
        Companion = new Activity(null);
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.im.bean.InputPanelStyle.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    public static InputPanelStyle valueOf(String str) {
        return (InputPanelStyle) Enum.valueOf(InputPanelStyle.class, str);
    }

    public static InputPanelStyle[] values() {
        return (InputPanelStyle[]) $VALUES.clone();
    }
}
