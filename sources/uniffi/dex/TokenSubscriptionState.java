package uniffi.dex;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes25.dex */
public final class TokenSubscriptionState {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ TokenSubscriptionState[] $VALUES;
    public static final TokenSubscriptionState NONE = new TokenSubscriptionState("NONE", 0);
    public static final TokenSubscriptionState SUBSCRIBED = new TokenSubscriptionState("SUBSCRIBED", 1);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ TokenSubscriptionState[] $values() {
        return new TokenSubscriptionState[]{NONE, SUBSCRIBED};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<TokenSubscriptionState> getEntries() {
        return $ENTRIES;
    }

    private TokenSubscriptionState(String str, int i) {
    }

    static {
        TokenSubscriptionState[] tokenSubscriptionStateArr$values = $values();
        $VALUES = tokenSubscriptionStateArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(tokenSubscriptionStateArr$values);
    }

    public static TokenSubscriptionState valueOf(String str) {
        return (TokenSubscriptionState) Enum.valueOf(TokenSubscriptionState.class, str);
    }

    public static TokenSubscriptionState[] values() {
        return (TokenSubscriptionState[]) $VALUES.clone();
    }
}
