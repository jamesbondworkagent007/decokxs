package uniffi.buy_sell;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes17.dex */
public final class InputValidationResult {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ InputValidationResult[] $VALUES;
    public static final InputValidationResult ZERO = new InputValidationResult("ZERO", 0);
    public static final InputValidationResult PRE_LOGIN_PRE_KYC = new InputValidationResult("PRE_LOGIN_PRE_KYC", 1);
    public static final InputValidationResult LARGE_QUOTE_CONTINUE_TO_CHAT = new InputValidationResult("LARGE_QUOTE_CONTINUE_TO_CHAT", 2);
    public static final InputValidationResult LARGE_QUOTE_OVER_CHANNEL_LIMIT = new InputValidationResult("LARGE_QUOTE_OVER_CHANNEL_LIMIT", 3);
    public static final InputValidationResult DEX24_HOUR_TRADING_LIMIT_REACHED_BALANCE = new InputValidationResult("DEX24_HOUR_TRADING_LIMIT_REACHED_BALANCE", 4);
    public static final InputValidationResult DEX24_HOUR_TRADING_LIMIT_REACHED_NATIVE = new InputValidationResult("DEX24_HOUR_TRADING_LIMIT_REACHED_NATIVE", 5);
    public static final InputValidationResult DEX_QUOTE_AMOUNT_UNAVAILABLE = new InputValidationResult("DEX_QUOTE_AMOUNT_UNAVAILABLE", 6);
    public static final InputValidationResult INPUT_BALANCE_MIN_MAX = new InputValidationResult("INPUT_BALANCE_MIN_MAX", 7);
    public static final InputValidationResult BALANCE_INPUT_MIN_MAX = new InputValidationResult("BALANCE_INPUT_MIN_MAX", 8);
    public static final InputValidationResult BALANCE_MIN_INPUT_MAX = new InputValidationResult("BALANCE_MIN_INPUT_MAX", 9);
    public static final InputValidationResult BALANCE_MIN_MAX_INPUT = new InputValidationResult("BALANCE_MIN_MAX_INPUT", 10);
    public static final InputValidationResult INPUT_MIN_BALANCE_MAX = new InputValidationResult("INPUT_MIN_BALANCE_MAX", 11);
    public static final InputValidationResult MIN_INPUT_BALANCE_MAX = new InputValidationResult("MIN_INPUT_BALANCE_MAX", 12);
    public static final InputValidationResult MIN_BALANCE_INPUT_MAX = new InputValidationResult("MIN_BALANCE_INPUT_MAX", 13);
    public static final InputValidationResult MIN_BALANCE_MAX_INPUT = new InputValidationResult("MIN_BALANCE_MAX_INPUT", 14);
    public static final InputValidationResult INPUT_MIN_MAX_BALANCE = new InputValidationResult("INPUT_MIN_MAX_BALANCE", 15);
    public static final InputValidationResult MIN_INPUT_MAX_BALANCE = new InputValidationResult("MIN_INPUT_MAX_BALANCE", 16);
    public static final InputValidationResult MIN_MAX_INPUT_BALANCE = new InputValidationResult("MIN_MAX_INPUT_BALANCE", 17);
    public static final InputValidationResult MIN_MAX_DEX_MAX_INPUT_BALANCE = new InputValidationResult("MIN_MAX_DEX_MAX_INPUT_BALANCE", 18);
    public static final InputValidationResult MIN_MAX_BALANCE_INPUT = new InputValidationResult("MIN_MAX_BALANCE_INPUT", 19);
    public static final InputValidationResult MIN_MAX_DEX_MAX_BALANCE_INPUT = new InputValidationResult("MIN_MAX_DEX_MAX_BALANCE_INPUT", 20);
    public static final InputValidationResult MAX_CHANNEL_LIMIT_LESS_THAN_BOTH_MIN = new InputValidationResult("MAX_CHANNEL_LIMIT_LESS_THAN_BOTH_MIN", 21);
    public static final InputValidationResult MAX_CHANNEL_LIMIT = new InputValidationResult("MAX_CHANNEL_LIMIT", 22);
    public static final InputValidationResult MIN_CHANNEL_LIMIT = new InputValidationResult("MIN_CHANNEL_LIMIT", 23);
    public static final InputValidationResult MAX_TRADE_LIMIT = new InputValidationResult("MAX_TRADE_LIMIT", 24);
    public static final InputValidationResult MIN_TRADE_LIMIT = new InputValidationResult("MIN_TRADE_LIMIT", 25);
    public static final InputValidationResult NATIVE_CHANNEL_VALID = new InputValidationResult("NATIVE_CHANNEL_VALID", 26);
    public static final InputValidationResult INPUT_MIN_MAX = new InputValidationResult("INPUT_MIN_MAX", 27);
    public static final InputValidationResult MIN_MAX_INPUT = new InputValidationResult("MIN_MAX_INPUT", 28);
    public static final InputValidationResult THIRD_PARTY_VALID = new InputValidationResult("THIRD_PARTY_VALID", 29);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ InputValidationResult[] $values() {
        return new InputValidationResult[]{ZERO, PRE_LOGIN_PRE_KYC, LARGE_QUOTE_CONTINUE_TO_CHAT, LARGE_QUOTE_OVER_CHANNEL_LIMIT, DEX24_HOUR_TRADING_LIMIT_REACHED_BALANCE, DEX24_HOUR_TRADING_LIMIT_REACHED_NATIVE, DEX_QUOTE_AMOUNT_UNAVAILABLE, INPUT_BALANCE_MIN_MAX, BALANCE_INPUT_MIN_MAX, BALANCE_MIN_INPUT_MAX, BALANCE_MIN_MAX_INPUT, INPUT_MIN_BALANCE_MAX, MIN_INPUT_BALANCE_MAX, MIN_BALANCE_INPUT_MAX, MIN_BALANCE_MAX_INPUT, INPUT_MIN_MAX_BALANCE, MIN_INPUT_MAX_BALANCE, MIN_MAX_INPUT_BALANCE, MIN_MAX_DEX_MAX_INPUT_BALANCE, MIN_MAX_BALANCE_INPUT, MIN_MAX_DEX_MAX_BALANCE_INPUT, MAX_CHANNEL_LIMIT_LESS_THAN_BOTH_MIN, MAX_CHANNEL_LIMIT, MIN_CHANNEL_LIMIT, MAX_TRADE_LIMIT, MIN_TRADE_LIMIT, NATIVE_CHANNEL_VALID, INPUT_MIN_MAX, MIN_MAX_INPUT, THIRD_PARTY_VALID};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<InputValidationResult> getEntries() {
        return $ENTRIES;
    }

    private InputValidationResult(String str, int i) {
    }

    static {
        InputValidationResult[] inputValidationResultArr$values = $values();
        $VALUES = inputValidationResultArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(inputValidationResultArr$values);
    }

    public static InputValidationResult valueOf(String str) {
        return (InputValidationResult) Enum.valueOf(InputValidationResult.class, str);
    }

    public static InputValidationResult[] values() {
        return (InputValidationResult[]) $VALUES.clone();
    }
}
