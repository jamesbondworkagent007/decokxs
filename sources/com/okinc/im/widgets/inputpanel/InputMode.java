package com.okinc.im.widgets.inputpanel;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class InputMode {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ InputMode[] $VALUES;
    public static final InputMode TextInput = new InputMode("TextInput", 0);
    public static final InputMode VoiceInput = new InputMode("VoiceInput", 1);
    public static final InputMode StickerMode = new InputMode("StickerMode", 2);
    public static final InputMode PluginMode = new InputMode("PluginMode", 3);
    public static final InputMode DefaultMode = new InputMode("DefaultMode", 4);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ InputMode[] $values() {
        return new InputMode[]{TextInput, VoiceInput, StickerMode, PluginMode, DefaultMode};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<InputMode> getEntries() {
        return $ENTRIES;
    }

    private InputMode(String str, int i) {
    }

    static {
        InputMode[] inputModeArr$values = $values();
        $VALUES = inputModeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(inputModeArr$values);
    }

    public static InputMode valueOf(String str) {
        return (InputMode) Enum.valueOf(InputMode.class, str);
    }

    public static InputMode[] values() {
        return (InputMode[]) $VALUES.clone();
    }
}
