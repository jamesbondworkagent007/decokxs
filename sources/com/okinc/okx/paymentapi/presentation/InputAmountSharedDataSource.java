package com.okinc.okx.paymentapi.presentation;

import com.okinc.okx.paymentapi.service.CurrencyPreviewPageParameters;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import o.C56444yFp;
import o.InterfaceC56445yFq;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class InputAmountSharedDataSource {
    public static final InputAmountSharedDataSource copydefault = new InputAmountSharedDataSource();
    public static CurrencyPreviewPageParameters OLrzqt = new CurrencyPreviewPageParameters("", null, null, "", null, null, false, 0, 0, null, null, null, null, null, null, false, null, null, null, null, null, false, 4194294, null);
    public static CurrencyPreviewPageParameters AEQbTJ = new CurrencyPreviewPageParameters("", null, null, "", null, null, false, 0, 0, null, null, null, null, null, null, false, null, null, null, null, null, false, 4194294, null);
    public static CurrencyPreviewPageParameters EZpvd = new CurrencyPreviewPageParameters("", null, null, "", null, null, false, 0, 0, null, null, null, null, null, null, false, null, null, null, null, null, false, 4194294, null);
    public static final int KWHzl = 8;

    public final /* synthetic */ class Activity {
        public static final /* synthetic */ int[] KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[Type.values().length];
            try {
                iArr[Type.BUY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Type.SELL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Type.CONVERT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            KWHzl = iArr;
        }
    }

    private InputAmountSharedDataSource() {
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Type {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;
        public static final Type BUY = new Type("BUY", 0);
        public static final Type SELL = new Type("SELL", 1);
        public static final Type CONVERT = new Type("CONVERT", 2);

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ Type[] $values() {
            return new Type[]{BUY, SELL, CONVERT};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<Type> getEntries() {
            return $ENTRIES;
        }

        private Type(String str, int i) {
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

    public final void EZpvd(@NotNull CurrencyPreviewPageParameters currencyPreviewPageParameters) {
        Intrinsics.checkNotNullParameter(currencyPreviewPageParameters, "");
        copydefault(Type.BUY, currencyPreviewPageParameters);
    }

    public final void AEQbTJ(@NotNull CurrencyPreviewPageParameters currencyPreviewPageParameters) {
        Intrinsics.checkNotNullParameter(currencyPreviewPageParameters, "");
        copydefault(Type.SELL, currencyPreviewPageParameters);
    }

    public final void copydefault(@NotNull CurrencyPreviewPageParameters currencyPreviewPageParameters) {
        Intrinsics.checkNotNullParameter(currencyPreviewPageParameters, "");
        copydefault(Type.CONVERT, currencyPreviewPageParameters);
    }

    public final void copydefault(Type type, CurrencyPreviewPageParameters currencyPreviewPageParameters) {
        int i = Activity.KWHzl[type.ordinal()];
        if (i == 1) {
            OLrzqt = currencyPreviewPageParameters;
        } else if (i == 2) {
            AEQbTJ = currencyPreviewPageParameters;
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            EZpvd = currencyPreviewPageParameters;
        }
    }
}
