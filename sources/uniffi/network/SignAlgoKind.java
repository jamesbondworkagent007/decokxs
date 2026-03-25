package uniffi.network;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes25.dex */
public final class SignAlgoKind {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ SignAlgoKind[] $VALUES;
    public static final SignAlgoKind SYMMETRIC = new SignAlgoKind("SYMMETRIC", 0);
    public static final SignAlgoKind ASYMMETRIC_K1 = new SignAlgoKind("ASYMMETRIC_K1", 1);
    public static final SignAlgoKind ASYMMETRIC_R1 = new SignAlgoKind("ASYMMETRIC_R1", 2);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ SignAlgoKind[] $values() {
        return new SignAlgoKind[]{SYMMETRIC, ASYMMETRIC_K1, ASYMMETRIC_R1};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<SignAlgoKind> getEntries() {
        return $ENTRIES;
    }

    private SignAlgoKind(String str, int i) {
    }

    static {
        SignAlgoKind[] signAlgoKindArr$values = $values();
        $VALUES = signAlgoKindArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(signAlgoKindArr$values);
    }

    public static SignAlgoKind valueOf(String str) {
        return (SignAlgoKind) Enum.valueOf(SignAlgoKind.class, str);
    }

    public static SignAlgoKind[] values() {
        return (SignAlgoKind[]) $VALUES.clone();
    }
}
