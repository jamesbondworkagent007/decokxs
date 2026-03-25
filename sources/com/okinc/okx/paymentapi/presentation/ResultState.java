package com.okinc.okx.paymentapi.presentation;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX INFO: loaded from: classes24.dex */
public abstract class ResultState {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Result {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ Result[] $VALUES;
        public static final Result SUCCESS = new Result("SUCCESS", 0);
        public static final Result FAILURE = new Result("FAILURE", 1);

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ Result[] $values() {
            return new Result[]{SUCCESS, FAILURE};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<Result> getEntries() {
            return $ENTRIES;
        }

        private Result(String str, int i) {
        }

        static {
            Result[] resultArr$values = $values();
            $VALUES = resultArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(resultArr$values);
        }

        public static Result valueOf(String str) {
            return (Result) Enum.valueOf(Result.class, str);
        }

        public static Result[] values() {
            return (Result[]) $VALUES.clone();
        }
    }

    private ResultState() {
    }
}
