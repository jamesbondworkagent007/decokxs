package o;

import aws.smithy.kotlin.runtime.time.IncompleteException;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.text.StringsKt__StringsKt;
import o.AbstractC5169Hj;
import o.C5174Ho;
import o.C5178Hs;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.Ho, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5174Ho {
    public static final boolean EZpvd(char c) {
        return '0' <= c && c < ':';
    }

    public static /* synthetic */ void precond$default(java.lang.String str, int i, int i2, int i3, java.lang.Object obj) {
        if ((i3 & 4) != 0) {
            i2 = 0;
        }
        copydefault(str, i, i2);
    }

    public static final void copydefault(@NotNull java.lang.String str, int i, int i2) {
        AbstractC5169Hj activity;
        Intrinsics.checkNotNullParameter(str, "");
        if (i2 == 0) {
            if (i < str.length()) {
                return;
            }
        } else if (i + i2 <= str.length()) {
            return;
        }
        if (i2 == 0) {
            activity = AbstractC5169Hj.TaskDescription.AEQbTJ;
        } else {
            activity = new AbstractC5169Hj.Activity(i2);
        }
        throw new IncompleteException(str, activity);
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: kotlin.jvm.functions.Function2<java.lang.String, java.lang.Integer, o.Hs<? extends java.lang.Character>>, kotlin.jvm.functions.Function2<java.lang.String, java.lang.Integer, o.Hs<java.lang.Character>> */
    public static final Function2<java.lang.String, java.lang.Integer, C5178Hs<java.lang.Character>> copydefault(final char c) {
        return new Function2<java.lang.String, java.lang.Integer, C5178Hs<? extends java.lang.Character>>() { // from class: aws.smithy.kotlin.runtime.time.ParserCombinatorsKt$char$1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // kotlin.jvm.functions.Function2
            public /* synthetic */ C5178Hs<? extends Character> invoke(String str, Integer num) {
                return invoke(str, num.intValue());
            }

            public final C5178Hs<Character> invoke(@NotNull String str, int i) {
                Intrinsics.checkNotNullParameter(str, "");
                C5174Ho.copydefault(str, i, 1);
                char cCharAt = str.charAt(i);
                if (cCharAt != c) {
                    throw new ParseException(str, "expected `" + c + "` found `" + cCharAt + '`', i);
                }
                return new C5178Hs<>(i + 1, Character.valueOf(cCharAt));
            }
        };
    }

    /* JADX DEBUG: Type inference failed for r0v1. Raw type applied. Possible types: kotlin.jvm.functions.Function2<java.lang.String, java.lang.Integer, o.Hs<? extends java.lang.Character>>, kotlin.jvm.functions.Function2<java.lang.String, java.lang.Integer, o.Hs<java.lang.Character>> */
    public static final Function2<java.lang.String, java.lang.Integer, C5178Hs<java.lang.Character>> KWHzl(@NotNull final java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return new Function2<java.lang.String, java.lang.Integer, C5178Hs<? extends java.lang.Character>>() { // from class: aws.smithy.kotlin.runtime.time.ParserCombinatorsKt$oneOf$1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // kotlin.jvm.functions.Function2
            public /* synthetic */ C5178Hs<? extends Character> invoke(String str2, Integer num) {
                return invoke(str2, num.intValue());
            }

            public final C5178Hs<Character> invoke(@NotNull String str2, int i) {
                C5178Hs<Character> c5178Hs;
                Intrinsics.checkNotNullParameter(str2, "");
                C5174Ho.copydefault(str2, i, 1);
                char cCharAt = str2.charAt(i);
                String str3 = str;
                int length = str3.length();
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        c5178Hs = null;
                        break;
                    }
                    char cCharAt2 = str3.charAt(i2);
                    if (cCharAt2 == cCharAt) {
                        c5178Hs = new C5178Hs<>(i + 1, Character.valueOf(cCharAt2));
                        break;
                    }
                    i2++;
                }
                if (c5178Hs != null) {
                    return c5178Hs;
                }
                throw new ParseException(str2, "expected one of `" + str + "` found " + cCharAt, i);
            }
        };
    }

    /* JADX DEBUG: Type inference failed for r0v1. Raw type applied. Possible types: kotlin.jvm.functions.Function2<java.lang.String, java.lang.Integer, o.Hs<? extends java.lang.String>>, kotlin.jvm.functions.Function2<java.lang.String, java.lang.Integer, o.Hs<java.lang.String>> */
    public static final Function2<java.lang.String, java.lang.Integer, C5178Hs<java.lang.String>> copydefault(@NotNull final java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return new Function2<java.lang.String, java.lang.Integer, C5178Hs<? extends java.lang.String>>() { // from class: aws.smithy.kotlin.runtime.time.ParserCombinatorsKt$tag$1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // kotlin.jvm.functions.Function2
            public /* synthetic */ C5178Hs<? extends String> invoke(String str2, Integer num) {
                return invoke(str2, num.intValue());
            }

            public final C5178Hs<String> invoke(@NotNull String str2, int i) {
                Intrinsics.checkNotNullParameter(str2, "");
                C5174Ho.copydefault(str2, i, str.length());
                String str3 = str;
                int length = str3.length();
                for (int i2 = 0; i2 < length; i2++) {
                    if (str2.charAt(i + i2) != str3.charAt(i2)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("expected `");
                        sb.append(str);
                        sb.append("` found `");
                        String strSubstring = str2.substring(i, str.length() + i);
                        Intrinsics.checkNotNullExpressionValue(strSubstring, "");
                        sb.append(strSubstring);
                        sb.append('`');
                        throw new ParseException(str2, sb.toString(), i);
                    }
                }
                return new C5178Hs<>(i + str.length(), str);
            }
        };
    }

    /* JADX DEBUG: Type inference failed for r0v1. Raw type applied. Possible types: kotlin.jvm.functions.Function2<java.lang.String, java.lang.Integer, o.Hs<? extends kotlin.ranges.IntRange>>, kotlin.jvm.functions.Function2<java.lang.String, java.lang.Integer, o.Hs<kotlin.ranges.IntRange>> */
    public static final Function2<java.lang.String, java.lang.Integer, C5178Hs<kotlin.ranges.IntRange>> copydefault(final int i, final int i2, @NotNull final Function1<? super java.lang.Character, java.lang.Boolean> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        return new Function2<java.lang.String, java.lang.Integer, C5178Hs<? extends kotlin.ranges.IntRange>>() { // from class: aws.smithy.kotlin.runtime.time.ParserCombinatorsKt$takeWhileMN$1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.Character, java.lang.Boolean> */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // kotlin.jvm.functions.Function2
            public /* synthetic */ C5178Hs<? extends IntRange> invoke(String str, Integer num) {
                return invoke(str, num.intValue());
            }

            public final C5178Hs<IntRange> invoke(@NotNull String str, int i3) {
                Intrinsics.checkNotNullParameter(str, "");
                int i4 = i2;
                int i5 = i;
                if (i4 < i5) {
                    throw new IllegalArgumentException(("min m=" + i5 + " cannot be greater than max=" + i4).toString());
                }
                C5174Ho.precond$default(str, i3, 0, 4, null);
                int i6 = i3;
                while (i6 < str.length() && i6 - i3 < i2 && function1.invoke(Character.valueOf(str.charAt(i6))).booleanValue()) {
                    i6++;
                }
                int i7 = i6 - i3;
                if (i7 < i) {
                    if (i6 >= str.length()) {
                        throw new IncompleteException(str, new AbstractC5169Hj.Activity(i - i7));
                    }
                    throw new TakeWhileMNException(str, i6, i, i7);
                }
                return new C5178Hs<>(i6, new IntRange(i3, i6 - 1));
            }
        };
    }

    public static final java.lang.String AEQbTJ(int i, int i2, int i3, java.lang.String str) {
        return "expected " + (i == i2 ? "exactly" : "at least") + ' ' + i3 + " digits; " + str;
    }

    public static final <T extends java.lang.Number> Function2<java.lang.String, java.lang.Integer, C5178Hs<T>> KWHzl(final int i, final int i2, @NotNull final Function2<? super java.lang.String, ? super kotlin.ranges.IntRange, ? extends T> function2) {
        Intrinsics.checkNotNullParameter(function2, "");
        return (Function2<java.lang.String, java.lang.Integer, C5178Hs<T>>) new Function2<java.lang.String, java.lang.Integer, C5178Hs<? extends T>>() { // from class: aws.smithy.kotlin.runtime.time.ParserCombinatorsKt$takeMNDigitsT$1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function2<? super java.lang.String, ? super kotlin.ranges.IntRange, ? extends T> */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function2
            public /* synthetic */ Object invoke(String str, Integer num) {
                return invoke(str, num.intValue());
            }

            public final C5178Hs<T> invoke(@NotNull String str, int i3) {
                Intrinsics.checkNotNullParameter(str, "");
                C5174Ho.precond$default(str, i3, 0, 4, null);
                try {
                    C5178Hs<IntRange> c5178HsInvoke = C5174Ho.copydefault(i, i2, AnonymousClass1.INSTANCE).invoke(str, Integer.valueOf(i3));
                    int iEZpvd = c5178HsInvoke.EZpvd();
                    IntRange intRangeKWHzl = c5178HsInvoke.KWHzl();
                    if (intRangeKWHzl.isEmpty()) {
                        throw new ParseException(str, "expected integer", i3);
                    }
                    return new C5178Hs<>(iEZpvd, (Number) function2.invoke(str, intRangeKWHzl));
                } catch (IncompleteException e) {
                    int i4 = i;
                    throw new ParseException(str, C5174Ho.AEQbTJ(i4, i2, i4, String.valueOf(e.getNeeded())), i3);
                } catch (TakeWhileMNException e2) {
                    throw new ParseException(str, C5174Ho.AEQbTJ(i, i2, e2.getExpected(), "found " + e2.getMatched()), i3);
                }
            }

            /* JADX INFO: renamed from: aws.smithy.kotlin.runtime.time.ParserCombinatorsKt$takeMNDigitsT$1$1, reason: invalid class name */
            public final /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements Function1<Character, Boolean> {
                public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public AnonymousClass1() {
                    super(1, C5174Ho.class, "isDigit", "isDigit(C)Z", 1);
                }

                public final Boolean invoke(char c) {
                    return Boolean.valueOf(C5174Ho.EZpvd(c));
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* synthetic */ Boolean invoke(Character ch) {
                    return invoke(ch.charValue());
                }
            }
        };
    }

    public static final Function2<java.lang.String, java.lang.Integer, C5178Hs<java.lang.Integer>> AEQbTJ(int i, int i2) {
        return KWHzl(i, i2, new Function2<java.lang.String, kotlin.ranges.IntRange, java.lang.Integer>() { // from class: aws.smithy.kotlin.runtime.time.ParserCombinatorsKt$takeMNDigitsInt$1
            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function2
            public final Integer invoke(@NotNull String str, @NotNull IntRange intRange) {
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(intRange, "");
                return Integer.valueOf(Integer.parseInt(StringsKt__StringsKt.KWHzl(str, intRange)));
            }
        });
    }

    public static final Function2<java.lang.String, java.lang.Integer, C5178Hs<java.lang.Long>> OLrzqt(int i, int i2) {
        return KWHzl(i, i2, new Function2<java.lang.String, kotlin.ranges.IntRange, java.lang.Long>() { // from class: aws.smithy.kotlin.runtime.time.ParserCombinatorsKt$takeMNDigitsLong$1
            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function2
            public final Long invoke(@NotNull String str, @NotNull IntRange intRange) {
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(intRange, "");
                return Long.valueOf(Long.parseLong(StringsKt__StringsKt.KWHzl(str, intRange)));
            }
        });
    }

    public static final Function2<java.lang.String, java.lang.Integer, C5178Hs<java.lang.Integer>> EZpvd(int i) {
        return AEQbTJ(i, i);
    }

    /* JADX DEBUG: Type inference failed for r0v1. Raw type applied. Possible types: kotlin.jvm.functions.Function2<java.lang.String, java.lang.Integer, o.Hs<? extends java.lang.Integer>>, kotlin.jvm.functions.Function2<java.lang.String, java.lang.Integer, o.Hs<java.lang.Integer>> */
    public static final Function2<java.lang.String, java.lang.Integer, C5178Hs<java.lang.Integer>> OLrzqt(final int i, final int i2, @NotNull final kotlin.ranges.IntRange intRange) {
        Intrinsics.checkNotNullParameter(intRange, "");
        return new Function2<java.lang.String, java.lang.Integer, C5178Hs<? extends java.lang.Integer>>() { // from class: aws.smithy.kotlin.runtime.time.ParserCombinatorsKt$mnDigitsInRange$1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // kotlin.jvm.functions.Function2
            public /* synthetic */ C5178Hs<? extends Integer> invoke(String str, Integer num) {
                return invoke(str, num.intValue());
            }

            public final C5178Hs<Integer> invoke(@NotNull String str, int i3) {
                Intrinsics.checkNotNullParameter(str, "");
                C5174Ho.precond$default(str, i3, 0, 4, null);
                C5178Hs<Integer> c5178HsInvoke = C5174Ho.AEQbTJ(i, i2).invoke(str, Integer.valueOf(i3));
                int iEZpvd = c5178HsInvoke.EZpvd();
                int iIntValue = c5178HsInvoke.KWHzl().intValue();
                if (!intRange.AEQbTJ(iIntValue)) {
                    throw new ParseException(str, iIntValue + " not in range " + intRange, i3);
                }
                return new C5178Hs<>(iEZpvd, Integer.valueOf(iIntValue));
            }
        };
    }

    public static final Function2<java.lang.String, java.lang.Integer, C5178Hs<java.lang.Integer>> AEQbTJ(int i, @NotNull kotlin.ranges.IntRange intRange) {
        Intrinsics.checkNotNullParameter(intRange, "");
        return OLrzqt(i, i, intRange);
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: kotlin.jvm.functions.Function2<java.lang.String, java.lang.Integer, o.Hs<? extends java.lang.Integer>>, kotlin.jvm.functions.Function2<java.lang.String, java.lang.Integer, o.Hs<java.lang.Integer>> */
    public static final Function2<java.lang.String, java.lang.Integer, C5178Hs<java.lang.Integer>> OLrzqt(final int i, final int i2, final int i3) {
        return new Function2<java.lang.String, java.lang.Integer, C5178Hs<? extends java.lang.Integer>>() { // from class: aws.smithy.kotlin.runtime.time.ParserCombinatorsKt$fraction$1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // kotlin.jvm.functions.Function2
            public /* synthetic */ C5178Hs<? extends Integer> invoke(String str, Integer num) {
                return invoke(str, num.intValue());
            }

            public final C5178Hs<Integer> invoke(@NotNull String str, int i4) {
                Intrinsics.checkNotNullParameter(str, "");
                int i5 = i3;
                int i6 = i2;
                if (i5 > i6) {
                    throw new IllegalArgumentException(("denomDigits (" + i5 + ") must be less than max=" + i6 + " digits to parse").toString());
                }
                C5174Ho.precond$default(str, i4, 0, 4, null);
                C5178Hs<IntRange> c5178HsInvoke = C5174Ho.copydefault(i, i2, AnonymousClass2.INSTANCE).invoke(str, Integer.valueOf(i4));
                int iEZpvd = c5178HsInvoke.EZpvd();
                IntRange intRangeKWHzl = c5178HsInvoke.KWHzl();
                if (intRangeKWHzl.isEmpty()) {
                    throw new ParseException(str, "expected integer", i4);
                }
                int i7 = Integer.parseInt(StringsKt__StringsKt.KWHzl(str, intRangeKWHzl));
                for (int iCopydefault = intRangeKWHzl.copydefault() - intRangeKWHzl.KWHzl(); iCopydefault < i3 - 1; iCopydefault++) {
                    i7 *= 10;
                }
                return new C5178Hs<>(iEZpvd, Integer.valueOf(i7));
            }

            /* JADX INFO: renamed from: aws.smithy.kotlin.runtime.time.ParserCombinatorsKt$fraction$1$2, reason: invalid class name */
            public final /* synthetic */ class AnonymousClass2 extends FunctionReferenceImpl implements Function1<Character, Boolean> {
                public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public AnonymousClass2() {
                    super(1, C5174Ho.class, "isDigit", "isDigit(C)Z", 1);
                }

                public final Boolean invoke(char c) {
                    return Boolean.valueOf(C5174Ho.EZpvd(c));
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* synthetic */ Boolean invoke(Character ch) {
                    return invoke(ch.charValue());
                }
            }
        };
    }

    public static final <T> Function2<java.lang.String, java.lang.Integer, C5178Hs<T>> copydefault(@NotNull final Function2<? super java.lang.String, ? super java.lang.Integer, ? extends C5178Hs<? extends T>> function2) {
        Intrinsics.checkNotNullParameter(function2, "");
        return new Function2<java.lang.String, java.lang.Integer, C5178Hs<? extends T>>() { // from class: aws.smithy.kotlin.runtime.time.ParserCombinatorsKt$optional$1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.jvm.functions.Function2<? super java.lang.String, ? super java.lang.Integer, ? extends o.Hs<? extends T>> */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function2
            public /* synthetic */ Object invoke(String str, Integer num) {
                return invoke(str, num.intValue());
            }

            public final C5178Hs<T> invoke(@NotNull String str, int i) {
                Intrinsics.checkNotNullParameter(str, "");
                try {
                    return function2.invoke(str, Integer.valueOf(i));
                } catch (ParseException unused) {
                    return new C5178Hs<>(i, null);
                }
            }
        };
    }

    public static final <T> Function2<java.lang.String, java.lang.Integer, C5178Hs<T>> OLrzqt(@NotNull Function2<? super java.lang.String, ? super java.lang.Integer, ? extends C5178Hs<? extends T>> function2, final T t) {
        Intrinsics.checkNotNullParameter(function2, "");
        return KWHzl(copydefault(function2), new Function1<T, T>() { // from class: aws.smithy.kotlin.runtime.time.ParserCombinatorsKt$optionalOr$1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final T invoke(T t2) {
                return t2 == null ? t : t2;
            }
        });
    }

    public static final <T> Function2<java.lang.String, java.lang.Integer, C5178Hs<T>> AEQbTJ(@NotNull final Function2<? super java.lang.String, ? super java.lang.Integer, ? extends C5178Hs<? extends T>>... function2Arr) {
        Intrinsics.checkNotNullParameter(function2Arr, "");
        return new Function2<java.lang.String, java.lang.Integer, C5178Hs<? extends T>>() { // from class: aws.smithy.kotlin.runtime.time.ParserCombinatorsKt$alt$1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.jvm.functions.Function2<? super java.lang.String, ? super java.lang.Integer, ? extends o.Hs<? extends T>>[] */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function2
            public /* synthetic */ Object invoke(String str, Integer num) {
                return invoke(str, num.intValue());
            }

            public final C5178Hs<T> invoke(@NotNull String str, int i) {
                C5178Hs<T> c5178HsInvoke;
                Intrinsics.checkNotNullParameter(str, "");
                Function2<String, Integer, C5178Hs<T>>[] function2Arr2 = function2Arr;
                int length = function2Arr2.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        c5178HsInvoke = null;
                        break;
                    }
                    try {
                        c5178HsInvoke = function2Arr2[i2].invoke(str, Integer.valueOf(i));
                        break;
                    } catch (ParseException unused) {
                        i2++;
                    }
                }
                if (c5178HsInvoke != null) {
                    return c5178HsInvoke;
                }
                throw new ParseException(str, "no alternatives matched", i);
            }
        };
    }

    public static final <T, S> Function2<java.lang.String, java.lang.Integer, C5178Hs<S>> KWHzl(@NotNull final Function2<? super java.lang.String, ? super java.lang.Integer, ? extends C5178Hs<? extends T>> function2, @NotNull final Function2<? super java.lang.String, ? super java.lang.Integer, ? extends C5178Hs<? extends S>> function22) {
        Intrinsics.checkNotNullParameter(function2, "");
        Intrinsics.checkNotNullParameter(function22, "");
        return new Function2<java.lang.String, java.lang.Integer, C5178Hs<? extends S>>() { // from class: aws.smithy.kotlin.runtime.time.ParserCombinatorsKt$preceded$1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.jvm.functions.Function2<? super java.lang.String, ? super java.lang.Integer, ? extends o.Hs<? extends T>> */
            /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function2<? super java.lang.String, ? super java.lang.Integer, ? extends o.Hs<? extends S>> */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function2
            public /* synthetic */ Object invoke(String str, Integer num) {
                return invoke(str, num.intValue());
            }

            public final C5178Hs<S> invoke(@NotNull String str, int i) {
                Intrinsics.checkNotNullParameter(str, "");
                return function22.invoke(str, Integer.valueOf(((C5178Hs) function2.invoke(str, Integer.valueOf(i))).AEQbTJ()));
            }
        };
    }

    public static final <T, S> Function2<java.lang.String, java.lang.Integer, C5178Hs<S>> KWHzl(@NotNull final Function2<? super java.lang.String, ? super java.lang.Integer, ? extends C5178Hs<? extends T>> function2, @NotNull final Function1<? super T, ? extends S> function1) {
        Intrinsics.checkNotNullParameter(function2, "");
        Intrinsics.checkNotNullParameter(function1, "");
        return new Function2<java.lang.String, java.lang.Integer, C5178Hs<? extends S>>() { // from class: aws.smithy.kotlin.runtime.time.ParserCombinatorsKt$map$1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.jvm.functions.Function2<? super java.lang.String, ? super java.lang.Integer, ? extends o.Hs<? extends T>> */
            /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super T, ? extends S> */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function2
            public /* synthetic */ Object invoke(String str, Integer num) {
                return invoke(str, num.intValue());
            }

            /* JADX WARN: Type inference incomplete: some casts might be missing */
            public final C5178Hs<S> invoke(@NotNull String str, int i) {
                Intrinsics.checkNotNullParameter(str, "");
                C5178Hs c5178Hs = (C5178Hs) function2.invoke(str, Integer.valueOf(i));
                return new C5178Hs<>(c5178Hs.EZpvd(), function1.invoke((T) c5178Hs.KWHzl()));
            }
        };
    }

    public static final <T, S> Function2<java.lang.String, java.lang.Integer, C5178Hs<kotlin.Pair<T, S>>> EZpvd(@NotNull final Function2<? super java.lang.String, ? super java.lang.Integer, ? extends C5178Hs<? extends T>> function2, @NotNull final Function2<? super java.lang.String, ? super java.lang.Integer, ? extends C5178Hs<? extends S>> function22) {
        Intrinsics.checkNotNullParameter(function2, "");
        Intrinsics.checkNotNullParameter(function22, "");
        return new Function2<java.lang.String, java.lang.Integer, C5178Hs<? extends kotlin.Pair<? extends T, ? extends S>>>() { // from class: aws.smithy.kotlin.runtime.time.ParserCombinatorsKt$then$1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.jvm.functions.Function2<? super java.lang.String, ? super java.lang.Integer, ? extends o.Hs<? extends T>> */
            /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function2<? super java.lang.String, ? super java.lang.Integer, ? extends o.Hs<? extends S>> */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function2
            public /* synthetic */ Object invoke(String str, Integer num) {
                return invoke(str, num.intValue());
            }

            public final C5178Hs<Pair<T, S>> invoke(@NotNull String str, int i) {
                Intrinsics.checkNotNullParameter(str, "");
                C5178Hs<T> c5178HsInvoke = function2.invoke(str, Integer.valueOf(i));
                int iEZpvd = c5178HsInvoke.EZpvd();
                T tKWHzl = c5178HsInvoke.KWHzl();
                C5178Hs<S> c5178HsInvoke2 = function22.invoke(str, Integer.valueOf(iEZpvd));
                return new C5178Hs<>(c5178HsInvoke2.EZpvd(), new Pair(tKWHzl, c5178HsInvoke2.KWHzl()));
            }
        };
    }
}
