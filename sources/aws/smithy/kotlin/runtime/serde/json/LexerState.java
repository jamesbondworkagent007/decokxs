package aws.smithy.kotlin.runtime.serde.json;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class LexerState {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ LexerState[] $VALUES;
    public static final LexerState Initial = new LexerState("Initial", 0);
    public static final LexerState ArrayFirstValueOrEnd = new LexerState("ArrayFirstValueOrEnd", 1);
    public static final LexerState ArrayNextValueOrEnd = new LexerState("ArrayNextValueOrEnd", 2);
    public static final LexerState ObjectFirstKeyOrEnd = new LexerState("ObjectFirstKeyOrEnd", 3);
    public static final LexerState ObjectNextKeyOrEnd = new LexerState("ObjectNextKeyOrEnd", 4);
    public static final LexerState ObjectFieldValue = new LexerState("ObjectFieldValue", 5);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ LexerState[] $values() {
        return new LexerState[]{Initial, ArrayFirstValueOrEnd, ArrayNextValueOrEnd, ObjectFirstKeyOrEnd, ObjectNextKeyOrEnd, ObjectFieldValue};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<LexerState> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static LexerState valueOf(String str) {
        return (LexerState) Enum.valueOf(LexerState.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static LexerState[] values() {
        return (LexerState[]) $VALUES.clone();
    }

    private LexerState(String str, int i) {
    }

    static {
        LexerState[] lexerStateArr$values = $values();
        $VALUES = lexerStateArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(lexerStateArr$values);
    }
}
