package com.okinc.wallet.hardware.api.ledger.model;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringNumberConversionsKt;
import o.C56444yFp;
import o.InterfaceC56445yFq;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes12.dex */
public final class LedgerError {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ LedgerError[] $VALUES;
    public static final Activity Companion;
    private final String code;
    private final String message;
    public static final LedgerError OK = new LedgerError("OK", 0, "2328", "OK");
    public static final LedgerError USER_REJECTED_1 = new LedgerError("USER_REJECTED_1", 1, "1b49", "USER_REJECTED");
    public static final LedgerError USER_REJECTED_2 = new LedgerError("USER_REJECTED_2", 2, "157d", "USER_REJECTED");
    public static final LedgerError APP_NOT_AVAILABLE_IN_DEVICE_1 = new LedgerError("APP_NOT_AVAILABLE_IN_DEVICE_1", 3, "1b48", "APP_NOT_AVAILABLE_IN_DEVICE");
    public static final LedgerError APP_NOT_AVAILABLE_IN_DEVICE_2 = new LedgerError("APP_NOT_AVAILABLE_IN_DEVICE_2", 4, "1a97", "APP_NOT_AVAILABLE_IN_DEVICE");
    public static final LedgerError PIN_REMAINING_ATTEMPTS = new LedgerError("PIN_REMAINING_ATTEMPTS", 5, "63c0", "PIN_REMAINING_ATTEMPTS");
    public static final LedgerError INCORRECT_LENGTH = new LedgerError("INCORRECT_LENGTH", 6, "6700", "INCORRECT_LENGTH");
    public static final LedgerError MISSING_CRITICAL_PARAMETER = new LedgerError("MISSING_CRITICAL_PARAMETER", 7, "6800", "MISSING_CRITICAL_PARAMETER");
    public static final LedgerError COMMAND_INCOMPATIBLE_FILE_STRUCTURE = new LedgerError("COMMAND_INCOMPATIBLE_FILE_STRUCTURE", 8, "6981", "COMMAND_INCOMPATIBLE_FILE_STRUCTURE");
    public static final LedgerError SECURITY_STATUS_NOT_SATISFIED = new LedgerError("SECURITY_STATUS_NOT_SATISFIED", 9, "6982", "SECURITY_STATUS_NOT_SATISFIED");
    public static final LedgerError CONDITIONS_OF_USE_NOT_SATISFIED = new LedgerError("CONDITIONS_OF_USE_NOT_SATISFIED", 10, "6985", "CONDITIONS_OF_USE_NOT_SATISFIED");
    public static final LedgerError INCORRECT_DATA = new LedgerError("INCORRECT_DATA", 11, "6a80", "INCORRECT_DATA");
    public static final LedgerError NOT_ENOUGH_MEMORY_SPACE = new LedgerError("NOT_ENOUGH_MEMORY_SPACE", 12, "6a84", "NOT_ENOUGH_MEMORY_SPACE");
    public static final LedgerError REFERENCED_DATA_NOT_FOUND = new LedgerError("REFERENCED_DATA_NOT_FOUND", 13, "6a88", "REFERENCED_DATA_NOT_FOUND");
    public static final LedgerError FILE_ALREADY_EXISTS = new LedgerError("FILE_ALREADY_EXISTS", 14, "6a89", "FILE_ALREADY_EXISTS");
    public static final LedgerError INCORRECT_P1_P2 = new LedgerError("INCORRECT_P1_P2", 15, "6b00", "INCORRECT_P1_P2");
    public static final LedgerError INS_NOT_SUPPORTED = new LedgerError("INS_NOT_SUPPORTED", 16, "6d00", "INS_NOT_SUPPORTED");
    public static final LedgerError CLA_NOT_SUPPORTED = new LedgerError("CLA_NOT_SUPPORTED", 17, "6e00", "CLA_NOT_SUPPORTED");
    public static final LedgerError TECHNICAL_PROBLEM = new LedgerError("TECHNICAL_PROBLEM", 18, "6f00", "TECHNICAL_PROBLEM");
    public static final LedgerError MEMORY_PROBLEM = new LedgerError("MEMORY_PROBLEM", 19, "9240", "MEMORY_PROBLEM");
    public static final LedgerError NO_EF_SELECTED = new LedgerError("NO_EF_SELECTED", 20, "9400", "NO_EF_SELECTED");
    public static final LedgerError INVALID_OFFSET = new LedgerError("INVALID_OFFSET", 21, "9402", "INVALID_OFFSET");
    public static final LedgerError FILE_NOT_FOUND = new LedgerError("FILE_NOT_FOUND", 22, "9404", "FILE_NOT_FOUND");
    public static final LedgerError INCONSISTENT_FILE = new LedgerError("INCONSISTENT_FILE", 23, "9408", "INCONSISTENT_FILE");
    public static final LedgerError ALGORITHM_NOT_SUPPORTED = new LedgerError("ALGORITHM_NOT_SUPPORTED", 24, "9484", "ALGORITHM_NOT_SUPPORTED");
    public static final LedgerError INVALID_KCV = new LedgerError("INVALID_KCV", 25, "9485", "INVALID_KCV");
    public static final LedgerError CODE_NOT_INITIALIZED = new LedgerError("CODE_NOT_INITIALIZED", 26, "9802", "CODE_NOT_INITIALIZED");
    public static final LedgerError ACCESS_CONDITION_NOT_FULFILLED = new LedgerError("ACCESS_CONDITION_NOT_FULFILLED", 27, "9804", "ACCESS_CONDITION_NOT_FULFILLED");
    public static final LedgerError CONTRADICTION_SECRET_CODE_STATUS = new LedgerError("CONTRADICTION_SECRET_CODE_STATUS", 28, "9808", "CONTRADICTION_SECRET_CODE_STATUS");
    public static final LedgerError CONTRADICTION_INVALIDATION = new LedgerError("CONTRADICTION_INVALIDATION", 29, "9810", "CONTRADICTION_INVALIDATION");
    public static final LedgerError CODE_BLOCKED = new LedgerError("CODE_BLOCKED", 30, "9840", "CODE_BLOCKED");
    public static final LedgerError MAX_VALUE_REACHED = new LedgerError("MAX_VALUE_REACHED", 31, "9850", "MAX_VALUE_REACHED");
    public static final LedgerError GP_AUTH_FAILED = new LedgerError("GP_AUTH_FAILED", 32, "6300", "GP_AUTH_FAILED");
    public static final LedgerError LICENSING = new LedgerError("LICENSING", 33, "6f42", "LICENSING");
    public static final LedgerError HALTED = new LedgerError("HALTED", 34, "6faa", "HALTED");
    public static final LedgerError APP_NOT_OPEN_1 = new LedgerError("APP_NOT_OPEN_1", 35, "6d01", "APP_NOT_OPEN");
    public static final LedgerError APP_NOT_OPEN_2 = new LedgerError("APP_NOT_OPEN_2", 36, "6d02", "APP_NOT_OPEN");
    public static final LedgerError APP_NOT_OPEN_3 = new LedgerError("APP_NOT_OPEN_3", 37, "650f", "APP_NOT_OPEN");
    public static final LedgerError APP_NOT_OPEN_4 = new LedgerError("APP_NOT_OPEN_4", 38, "6511", "APP_NOT_OPEN");
    public static final LedgerError UNKNOWN_ERROR = new LedgerError("UNKNOWN_ERROR", 39, "10000", "UNKNOWN_ERROR");
    public static final LedgerError BLIND_NOT_OPEN = new LedgerError("BLIND_NOT_OPEN", 40, "20000", "BLIND_NOT_OPEN");
    public static final LedgerError MTU_NOT_RESPONSE = new LedgerError("MTU_NOT_RESPONSE", 41, "30000", "MTU_NOT_RESPONSE");
    public static final LedgerError DEVICE_DISCONNECT = new LedgerError("DEVICE_DISCONNECT", 42, "30001", "DEVICE_DISCONNECT");
    public static final LedgerError APDU_ORDER_BREAK = new LedgerError("APDU_ORDER_BREAK", 43, "30002", "APDU_ORDER_BREAK");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ LedgerError[] $values() {
        return new LedgerError[]{OK, USER_REJECTED_1, USER_REJECTED_2, APP_NOT_AVAILABLE_IN_DEVICE_1, APP_NOT_AVAILABLE_IN_DEVICE_2, PIN_REMAINING_ATTEMPTS, INCORRECT_LENGTH, MISSING_CRITICAL_PARAMETER, COMMAND_INCOMPATIBLE_FILE_STRUCTURE, SECURITY_STATUS_NOT_SATISFIED, CONDITIONS_OF_USE_NOT_SATISFIED, INCORRECT_DATA, NOT_ENOUGH_MEMORY_SPACE, REFERENCED_DATA_NOT_FOUND, FILE_ALREADY_EXISTS, INCORRECT_P1_P2, INS_NOT_SUPPORTED, CLA_NOT_SUPPORTED, TECHNICAL_PROBLEM, MEMORY_PROBLEM, NO_EF_SELECTED, INVALID_OFFSET, FILE_NOT_FOUND, INCONSISTENT_FILE, ALGORITHM_NOT_SUPPORTED, INVALID_KCV, CODE_NOT_INITIALIZED, ACCESS_CONDITION_NOT_FULFILLED, CONTRADICTION_SECRET_CODE_STATUS, CONTRADICTION_INVALIDATION, CODE_BLOCKED, MAX_VALUE_REACHED, GP_AUTH_FAILED, LICENSING, HALTED, APP_NOT_OPEN_1, APP_NOT_OPEN_2, APP_NOT_OPEN_3, APP_NOT_OPEN_4, UNKNOWN_ERROR, BLIND_NOT_OPEN, MTU_NOT_RESPONSE, DEVICE_DISCONNECT, APDU_ORDER_BREAK};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<LedgerError> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCode() {
        return this.code;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMessage() {
        return this.message;
    }

    private LedgerError(String str, int i, String str2, String str3) {
        this.code = str2;
        this.message = str3;
    }

    static {
        LedgerError[] ledgerErrorArr$values = $values();
        $VALUES = ledgerErrorArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(ledgerErrorArr$values);
        Companion = new Activity(null);
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.code + " " + this.message;
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.wallet.hardware.api.ledger.model.LedgerError.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final LedgerError OLrzqt(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            Integer intOrNull = StringsKt__StringNumberConversionsKt.toIntOrNull(str);
            if (intOrNull == null) {
                return LedgerError.UNKNOWN_ERROR;
            }
            String hexString = Integer.toHexString(intOrNull.intValue());
            Intrinsics.copydefault((Object) hexString);
            return EZpvd(hexString);
        }

        public final LedgerError EZpvd(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            if (str.length() == 0) {
                return LedgerError.UNKNOWN_ERROR;
            }
            LedgerError ledgerError = LedgerError.OK;
            if (Intrinsics.EZpvd((Object) str, (Object) ledgerError.getCode())) {
                return ledgerError;
            }
            LedgerError ledgerError2 = LedgerError.USER_REJECTED_1;
            if (Intrinsics.EZpvd((Object) str, (Object) ledgerError2.getCode())) {
                return ledgerError2;
            }
            LedgerError ledgerError3 = LedgerError.USER_REJECTED_2;
            if (Intrinsics.EZpvd((Object) str, (Object) ledgerError3.getCode())) {
                return ledgerError3;
            }
            LedgerError ledgerError4 = LedgerError.APP_NOT_AVAILABLE_IN_DEVICE_1;
            if (Intrinsics.EZpvd((Object) str, (Object) ledgerError4.getCode())) {
                return ledgerError4;
            }
            LedgerError ledgerError5 = LedgerError.APP_NOT_AVAILABLE_IN_DEVICE_2;
            if (Intrinsics.EZpvd((Object) str, (Object) ledgerError5.getCode())) {
                return ledgerError5;
            }
            LedgerError ledgerError6 = LedgerError.PIN_REMAINING_ATTEMPTS;
            if (Intrinsics.EZpvd((Object) str, (Object) ledgerError6.getCode())) {
                return ledgerError6;
            }
            LedgerError ledgerError7 = LedgerError.INCORRECT_LENGTH;
            if (Intrinsics.EZpvd((Object) str, (Object) ledgerError7.getCode())) {
                return ledgerError7;
            }
            LedgerError ledgerError8 = LedgerError.MISSING_CRITICAL_PARAMETER;
            if (Intrinsics.EZpvd((Object) str, (Object) ledgerError8.getCode())) {
                return ledgerError8;
            }
            LedgerError ledgerError9 = LedgerError.COMMAND_INCOMPATIBLE_FILE_STRUCTURE;
            if (Intrinsics.EZpvd((Object) str, (Object) ledgerError9.getCode())) {
                return ledgerError9;
            }
            LedgerError ledgerError10 = LedgerError.SECURITY_STATUS_NOT_SATISFIED;
            if (Intrinsics.EZpvd((Object) str, (Object) ledgerError10.getCode())) {
                return ledgerError10;
            }
            LedgerError ledgerError11 = LedgerError.CONDITIONS_OF_USE_NOT_SATISFIED;
            if (Intrinsics.EZpvd((Object) str, (Object) ledgerError11.getCode())) {
                return ledgerError11;
            }
            LedgerError ledgerError12 = LedgerError.INCORRECT_DATA;
            if (Intrinsics.EZpvd((Object) str, (Object) ledgerError12.getCode())) {
                return ledgerError12;
            }
            LedgerError ledgerError13 = LedgerError.NOT_ENOUGH_MEMORY_SPACE;
            if (Intrinsics.EZpvd((Object) str, (Object) ledgerError13.getCode())) {
                return ledgerError13;
            }
            LedgerError ledgerError14 = LedgerError.REFERENCED_DATA_NOT_FOUND;
            if (Intrinsics.EZpvd((Object) str, (Object) ledgerError14.getCode())) {
                return ledgerError14;
            }
            LedgerError ledgerError15 = LedgerError.FILE_ALREADY_EXISTS;
            if (Intrinsics.EZpvd((Object) str, (Object) ledgerError15.getCode())) {
                return ledgerError15;
            }
            LedgerError ledgerError16 = LedgerError.INCORRECT_P1_P2;
            if (Intrinsics.EZpvd((Object) str, (Object) ledgerError16.getCode())) {
                return ledgerError16;
            }
            LedgerError ledgerError17 = LedgerError.INS_NOT_SUPPORTED;
            if (Intrinsics.EZpvd((Object) str, (Object) ledgerError17.getCode())) {
                return ledgerError17;
            }
            LedgerError ledgerError18 = LedgerError.CLA_NOT_SUPPORTED;
            if (Intrinsics.EZpvd((Object) str, (Object) ledgerError18.getCode())) {
                return ledgerError18;
            }
            LedgerError ledgerError19 = LedgerError.TECHNICAL_PROBLEM;
            if (Intrinsics.EZpvd((Object) str, (Object) ledgerError19.getCode())) {
                return ledgerError19;
            }
            LedgerError ledgerError20 = LedgerError.MEMORY_PROBLEM;
            if (Intrinsics.EZpvd((Object) str, (Object) ledgerError20.getCode())) {
                return ledgerError20;
            }
            LedgerError ledgerError21 = LedgerError.NO_EF_SELECTED;
            if (Intrinsics.EZpvd((Object) str, (Object) ledgerError21.getCode())) {
                return ledgerError21;
            }
            LedgerError ledgerError22 = LedgerError.INVALID_OFFSET;
            if (Intrinsics.EZpvd((Object) str, (Object) ledgerError22.getCode())) {
                return ledgerError22;
            }
            LedgerError ledgerError23 = LedgerError.FILE_NOT_FOUND;
            if (Intrinsics.EZpvd((Object) str, (Object) ledgerError23.getCode())) {
                return ledgerError23;
            }
            LedgerError ledgerError24 = LedgerError.INCONSISTENT_FILE;
            if (Intrinsics.EZpvd((Object) str, (Object) ledgerError24.getCode())) {
                return ledgerError24;
            }
            LedgerError ledgerError25 = LedgerError.ALGORITHM_NOT_SUPPORTED;
            if (Intrinsics.EZpvd((Object) str, (Object) ledgerError25.getCode())) {
                return ledgerError25;
            }
            LedgerError ledgerError26 = LedgerError.INVALID_KCV;
            if (Intrinsics.EZpvd((Object) str, (Object) ledgerError26.getCode())) {
                return ledgerError26;
            }
            LedgerError ledgerError27 = LedgerError.CODE_NOT_INITIALIZED;
            if (Intrinsics.EZpvd((Object) str, (Object) ledgerError27.getCode())) {
                return ledgerError27;
            }
            LedgerError ledgerError28 = LedgerError.ACCESS_CONDITION_NOT_FULFILLED;
            if (Intrinsics.EZpvd((Object) str, (Object) ledgerError28.getCode())) {
                return ledgerError28;
            }
            LedgerError ledgerError29 = LedgerError.CONTRADICTION_SECRET_CODE_STATUS;
            if (Intrinsics.EZpvd((Object) str, (Object) ledgerError29.getCode())) {
                return ledgerError29;
            }
            LedgerError ledgerError30 = LedgerError.CONTRADICTION_INVALIDATION;
            if (Intrinsics.EZpvd((Object) str, (Object) ledgerError30.getCode())) {
                return ledgerError30;
            }
            LedgerError ledgerError31 = LedgerError.CODE_BLOCKED;
            if (Intrinsics.EZpvd((Object) str, (Object) ledgerError31.getCode())) {
                return ledgerError31;
            }
            LedgerError ledgerError32 = LedgerError.MAX_VALUE_REACHED;
            if (Intrinsics.EZpvd((Object) str, (Object) ledgerError32.getCode())) {
                return ledgerError32;
            }
            LedgerError ledgerError33 = LedgerError.GP_AUTH_FAILED;
            if (Intrinsics.EZpvd((Object) str, (Object) ledgerError33.getCode())) {
                return ledgerError33;
            }
            LedgerError ledgerError34 = LedgerError.LICENSING;
            if (Intrinsics.EZpvd((Object) str, (Object) ledgerError34.getCode())) {
                return ledgerError34;
            }
            LedgerError ledgerError35 = LedgerError.HALTED;
            if (Intrinsics.EZpvd((Object) str, (Object) ledgerError35.getCode())) {
                return ledgerError35;
            }
            LedgerError ledgerError36 = LedgerError.APP_NOT_OPEN_1;
            if (Intrinsics.EZpvd((Object) str, (Object) ledgerError36.getCode())) {
                return ledgerError36;
            }
            LedgerError ledgerError37 = LedgerError.APP_NOT_OPEN_2;
            if (Intrinsics.EZpvd((Object) str, (Object) ledgerError37.getCode())) {
                return ledgerError37;
            }
            LedgerError ledgerError38 = LedgerError.APP_NOT_OPEN_3;
            if (Intrinsics.EZpvd((Object) str, (Object) ledgerError38.getCode())) {
                return ledgerError38;
            }
            LedgerError ledgerError39 = LedgerError.APP_NOT_OPEN_4;
            if (Intrinsics.EZpvd((Object) str, (Object) ledgerError39.getCode())) {
                return ledgerError39;
            }
            LedgerError ledgerError40 = LedgerError.BLIND_NOT_OPEN;
            if (Intrinsics.EZpvd((Object) str, (Object) ledgerError40.getCode())) {
                return ledgerError40;
            }
            LedgerError ledgerError41 = LedgerError.MTU_NOT_RESPONSE;
            if (Intrinsics.EZpvd((Object) str, (Object) ledgerError41.getCode())) {
                return ledgerError41;
            }
            LedgerError ledgerError42 = LedgerError.DEVICE_DISCONNECT;
            if (Intrinsics.EZpvd((Object) str, (Object) ledgerError42.getCode())) {
                return ledgerError42;
            }
            LedgerError ledgerError43 = LedgerError.APDU_ORDER_BREAK;
            return Intrinsics.EZpvd((Object) str, (Object) ledgerError43.getCode()) ? ledgerError43 : LedgerError.UNKNOWN_ERROR;
        }
    }

    public static LedgerError valueOf(String str) {
        return (LedgerError) Enum.valueOf(LedgerError.class, str);
    }

    public static LedgerError[] values() {
        return (LedgerError[]) $VALUES.clone();
    }
}
