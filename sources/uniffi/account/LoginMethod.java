package uniffi.account;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes25.dex */
public final class LoginMethod {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ LoginMethod[] $VALUES;
    public static final LoginMethod PASSKEY = new LoginMethod("PASSKEY", 0);
    public static final LoginMethod PASSWORD = new LoginMethod("PASSWORD", 1);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ LoginMethod[] $values() {
        return new LoginMethod[]{PASSKEY, PASSWORD};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<LoginMethod> getEntries() {
        return $ENTRIES;
    }

    private LoginMethod(String str, int i) {
    }

    static {
        LoginMethod[] loginMethodArr$values = $values();
        $VALUES = loginMethodArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(loginMethodArr$values);
    }

    public static LoginMethod valueOf(String str) {
        return (LoginMethod) Enum.valueOf(LoginMethod.class, str);
    }

    public static LoginMethod[] values() {
        return (LoginMethod[]) $VALUES.clone();
    }
}
