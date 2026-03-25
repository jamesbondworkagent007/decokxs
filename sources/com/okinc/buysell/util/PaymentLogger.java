package com.okinc.buysell.util;

import kotlin.jvm.internal.Intrinsics;
import o.C56444yFp;
import o.InterfaceC56445yFq;
import o.pUU;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
public final class PaymentLogger {
    public static final PaymentLogger EZpvd = new PaymentLogger();

    private PaymentLogger() {
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Type {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;
        private final String reportName;
        public static final Type DEPOSIT = new Type("DEPOSIT", 0, "deposit");
        public static final Type WITHDRAW = new Type("WITHDRAW", 1, "withdraw");
        public static final Type UV = new Type("UV", 2, "uv");
        public static final Type BUY = new Type("BUY", 3, "buy");
        public static final Type SELL = new Type("SELL", 4, "sell");
        public static final Type BSC_BUY = new Type("BSC_BUY", 5, "bsc_buy");
        public static final Type BSC_SELL = new Type("BSC_SELL", 6, "bsc_sell");
        public static final Type BSC_CONVERT = new Type("BSC_CONVERT", 7, "bsc_convert");
        public static final Type OTHER = new Type("OTHER", 8, "other");
        public static final Type DYNAMIC = new Type("DYNAMIC", 9, "dynamic");

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ Type[] $values() {
            return new Type[]{DEPOSIT, WITHDRAW, UV, BUY, SELL, BSC_BUY, BSC_SELL, BSC_CONVERT, OTHER, DYNAMIC};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<Type> getEntries() {
            return $ENTRIES;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getReportName() {
            return this.reportName;
        }

        private Type(String str, int i, String str2) {
            this.reportName = str2;
        }

        static {
            Type[] typeArr$values = $values();
            $VALUES = typeArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(typeArr$values);
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) $VALUES.clone();
        }
    }

    public final void EZpvd(@NotNull Type type, @NotNull String str) {
        Intrinsics.checkNotNullParameter(type, "");
        Intrinsics.checkNotNullParameter(str, "");
        pUU.KWHzl("OKPYMNT", type.getReportName() + ": " + str);
    }

    public final void AEQbTJ(@NotNull Type type, @NotNull String str) {
        Intrinsics.checkNotNullParameter(type, "");
        Intrinsics.checkNotNullParameter(str, "");
        pUU.copydefault("OKPYMNT", type.getReportName() + ": " + str);
    }
}
