package com.okinc.tradingbot.impl.utils;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.tradingbot.impl.utils.PriceRangeUtil;
import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C33069mpW;
import o.C33129mqd;
import o.C55688xof;
import o.C56390yDp;
import o.C56424yEw;
import o.C56444yFp;
import o.InterfaceC56445yFq;
import o.xMR;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class PriceRangeUtil {
    public static final PriceRangeUtil AEQbTJ = new PriceRangeUtil();

    private PriceRangeUtil() {
    }

    public final String copydefault(@NotNull String str, @NotNull String str2, final int i) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return copydefault(str, str2, new Function1() { // from class: o.wUy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return PriceRangeUtil.KWHzl(i, (java.lang.String) obj);
            }
        });
    }

    public static final String KWHzl(int i, String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return xMR.copydefault.copydefault(str, i);
    }

    public final String OLrzqt(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return copydefault(str, str2, new Function1() { // from class: o.wUA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return PriceRangeUtil.EZpvd((java.lang.String) obj);
            }
        });
    }

    public static final String EZpvd(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return xMR.formatPercent$default(xMR.copydefault, str, 0, RoundingMode.DOWN, 2, null);
    }

    public final String copydefault(String str, String str2, Function1<? super String, String> function1) {
        boolean z = !StringsKt__StringsKt.fARcdN((CharSequence) str);
        boolean z2 = !StringsKt__StringsKt.fARcdN((CharSequence) str2);
        String strInvoke = function1.invoke(str);
        String strInvoke2 = function1.invoke(str2);
        if (z && z2) {
            return C33069mpW.copydefault(C55688xof.Application.addOnNewIntentListener, C56424yEw.gEmmrt(C56390yDp.OLrzqt("minLevel", strInvoke), C56390yDp.OLrzqt("maxLevel", strInvoke2)));
        }
        if (z) {
            return "≥ " + strInvoke;
        }
        if (!z2) {
            return "";
        }
        return "≤ " + strInvoke2;
    }

    public final Pair<ValidatedPriceRange, String> OLrzqt(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        BigDecimal bigDecimalEZpvd = C33129mqd.EZpvd(str);
        BigDecimal bigDecimalEZpvd2 = C33129mqd.EZpvd(str2);
        BigDecimal bigDecimalEZpvd3 = C33129mqd.EZpvd(str3);
        if (C33129mqd.valueOf(bigDecimalEZpvd3, bigDecimalEZpvd2) || str.length() == 0) {
            return C56390yDp.OLrzqt(ValidatedPriceRange.Invalid, "");
        }
        if (C33129mqd.gEmmrt(bigDecimalEZpvd3, bigDecimalEZpvd)) {
            BigDecimal bigDecimalDivide = bigDecimalEZpvd3.divide(bigDecimalEZpvd, new MathContext(4, RoundingMode.DOWN));
            if (bigDecimalDivide.compareTo(C33129mqd.EZpvd("0.1")) <= 0) {
                return C56390yDp.OLrzqt(ValidatedPriceRange.ExtremeUpperOutOfRange, C33129mqd.gEmmrt(bigDecimalDivide));
            }
            return C56390yDp.OLrzqt(ValidatedPriceRange.UpperOutOfRange, "");
        }
        if (C33129mqd.AEQbTJ(bigDecimalEZpvd2, bigDecimalEZpvd)) {
            BigDecimal bigDecimalDivide2 = bigDecimalEZpvd2.divide(bigDecimalEZpvd, new MathContext(4, RoundingMode.DOWN));
            if (bigDecimalDivide2.compareTo(C33129mqd.EZpvd("10")) >= 0) {
                return C56390yDp.OLrzqt(ValidatedPriceRange.ExtremeLowerOutOfRange, C33129mqd.gEmmrt(bigDecimalDivide2));
            }
            return C56390yDp.OLrzqt(ValidatedPriceRange.LowerOutOfRange, "");
        }
        return C56390yDp.OLrzqt(ValidatedPriceRange.WithinRange, "");
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class ValidatedPriceRange implements Parcelable {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ ValidatedPriceRange[] $VALUES;
        public static final Parcelable.Creator<ValidatedPriceRange> CREATOR;
        public static final ValidatedPriceRange WithinRange = new ValidatedPriceRange("WithinRange", 0);
        public static final ValidatedPriceRange UpperOutOfRange = new ValidatedPriceRange("UpperOutOfRange", 1);
        public static final ValidatedPriceRange LowerOutOfRange = new ValidatedPriceRange("LowerOutOfRange", 2);
        public static final ValidatedPriceRange ExtremeLowerOutOfRange = new ValidatedPriceRange("ExtremeLowerOutOfRange", 3);
        public static final ValidatedPriceRange ExtremeUpperOutOfRange = new ValidatedPriceRange("ExtremeUpperOutOfRange", 4);
        public static final ValidatedPriceRange Invalid = new ValidatedPriceRange("Invalid", 5);

        public static final class Creator implements Parcelable.Creator<ValidatedPriceRange> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ValidatedPriceRange createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return ValidatedPriceRange.valueOf(parcel.readString());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ValidatedPriceRange[] newArray(int i) {
                return new ValidatedPriceRange[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ ValidatedPriceRange[] $values() {
            return new ValidatedPriceRange[]{WithinRange, UpperOutOfRange, LowerOutOfRange, ExtremeLowerOutOfRange, ExtremeUpperOutOfRange, Invalid};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<ValidatedPriceRange> getEntries() {
            return $ENTRIES;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeString(name());
        }

        private ValidatedPriceRange(String str, int i) {
        }

        static {
            ValidatedPriceRange[] validatedPriceRangeArr$values = $values();
            $VALUES = validatedPriceRangeArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(validatedPriceRangeArr$values);
            CREATOR = new Creator();
        }

        public static ValidatedPriceRange valueOf(String str) {
            return (ValidatedPriceRange) Enum.valueOf(ValidatedPriceRange.class, str);
        }

        public static ValidatedPriceRange[] values() {
            return (ValidatedPriceRange[]) $VALUES.clone();
        }
    }
}
