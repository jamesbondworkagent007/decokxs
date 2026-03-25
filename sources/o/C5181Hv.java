package o;

import aws.smithy.kotlin.runtime.time.ParsersKt$parseRfc5322$1;
import aws.smithy.kotlin.runtime.time.ParsersKt$parseRfc5322$3;
import aws.smithy.kotlin.runtime.time.ParsersKt$parseRfc5322$4;
import aws.smithy.kotlin.runtime.time.ParsersKt$parseRfc5322$5;
import com.okinc.crcore.coreapi.service.IMarketApiService;
import com.reown.foundation.util.jwt.JwtUtilsKt;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.RegexOption;
import kotlin.text.StringsKt__StringNumberConversionsKt;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.C5174Ho;
import o.C5175Hp;
import o.C5177Hr;
import o.C5178Hs;
import o.C5181Hv;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.Hv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5181Hv {
    public static final Regex copydefault = new Regex("(-)?(\\d+(.(\\d+))?)E(-?\\d+)", RegexOption.IGNORE_CASE);

    public static final Function2<java.lang.String, java.lang.Integer, C5178Hs<java.lang.Integer>> values() {
        return C5174Ho.EZpvd(4);
    }

    public static final Function2<java.lang.String, java.lang.Integer, C5178Hs<java.lang.Integer>> DbNXlk() {
        return C5174Ho.AEQbTJ(2, new kotlin.ranges.IntRange(1, 12));
    }

    public static final Function2<java.lang.String, java.lang.Integer, C5178Hs<java.lang.Integer>> copydefault(int i) {
        return C5174Ho.OLrzqt(i, 2, new kotlin.ranges.IntRange(1, 31));
    }

    public static /* synthetic */ Function2 dateDay$default(int i, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = 2;
        }
        return copydefault(i);
    }

    public static final Function2<java.lang.String, java.lang.Integer, C5178Hs<C5175Hp>> AuCTel() {
        return new Function2<java.lang.String, java.lang.Integer, C5178Hs<? extends C5175Hp>>() { // from class: aws.smithy.kotlin.runtime.time.ParsersKt$dateYmd$1
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // kotlin.jvm.functions.Function2
            public /* synthetic */ C5178Hs<? extends C5175Hp> invoke(String str, Integer num) {
                return invoke(str, num.intValue());
            }

            public final C5178Hs<C5175Hp> invoke(@NotNull String str, int i) {
                Intrinsics.checkNotNullParameter(str, "");
                C5178Hs c5178Hs = (C5178Hs) C5181Hv.values().invoke(str, Integer.valueOf(i));
                int iEZpvd = c5178Hs.EZpvd();
                int iIntValue = ((Number) c5178Hs.KWHzl()).intValue();
                C5178Hs c5178Hs2 = (C5178Hs) C5181Hv.DbNXlk().invoke(str, Integer.valueOf(((C5178Hs) C5174Ho.copydefault(C5174Ho.copydefault('-')).invoke(str, Integer.valueOf(iEZpvd))).EZpvd()));
                int iEZpvd2 = c5178Hs2.EZpvd();
                int iIntValue2 = ((Number) c5178Hs2.KWHzl()).intValue();
                C5178Hs c5178Hs3 = (C5178Hs) C5181Hv.dateDay$default(0, 1, null).invoke(str, Integer.valueOf(((C5178Hs) C5174Ho.copydefault(C5174Ho.copydefault('-')).invoke(str, Integer.valueOf(iEZpvd2))).EZpvd()));
                return new C5178Hs<>(c5178Hs3.EZpvd(), new C5175Hp(iIntValue, iIntValue2, ((Number) c5178Hs3.KWHzl()).intValue()));
            }
        };
    }

    public static final Function2<java.lang.String, java.lang.Integer, C5178Hs<C5175Hp>> AkhnZx() {
        return AuCTel();
    }

    public static final Function2<java.lang.String, java.lang.Integer, C5178Hs<java.lang.Integer>> hDKMBd() {
        return C5174Ho.AEQbTJ(2, new kotlin.ranges.IntRange(0, 24));
    }

    public static final Function2<java.lang.String, java.lang.Integer, C5178Hs<java.lang.Integer>> iwGUEr() {
        return C5174Ho.AEQbTJ(2, new kotlin.ranges.IntRange(0, 59));
    }

    public static final Function2<java.lang.String, java.lang.Integer, C5178Hs<java.lang.Integer>> getFieldNames() {
        return C5174Ho.AEQbTJ(2, new kotlin.ranges.IntRange(0, 60));
    }

    public static final Function2<java.lang.String, java.lang.Integer, C5178Hs<java.lang.Integer>> getNewProxyInstance() {
        return C5174Ho.OLrzqt(1, 9, 9);
    }

    public static final Function2<java.lang.String, java.lang.Integer, C5178Hs<java.lang.Integer>> fARcdN() {
        return new Function2<java.lang.String, java.lang.Integer, C5178Hs<? extends java.lang.Integer>>() { // from class: aws.smithy.kotlin.runtime.time.ParsersKt$signValue$1
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // kotlin.jvm.functions.Function2
            public /* synthetic */ C5178Hs<? extends Integer> invoke(String str, Integer num) {
                return invoke(str, num.intValue());
            }

            public final C5178Hs<Integer> invoke(@NotNull String str, int i) {
                Intrinsics.checkNotNullParameter(str, "");
                C5178Hs c5178Hs = (C5178Hs) C5174Ho.KWHzl(C5174Ho.AEQbTJ(C5174Ho.copydefault('+'), C5174Ho.copydefault('-')), new Function1<Character, Integer>() { // from class: aws.smithy.kotlin.runtime.time.ParsersKt$signValue$1.1
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                    @Override // kotlin.jvm.functions.Function1
                    public /* synthetic */ Integer invoke(Character ch) {
                        return invoke(ch.charValue());
                    }

                    public final Integer invoke(char c) {
                        return Integer.valueOf(c == '-' ? -1 : 1);
                    }
                }).invoke(str, Integer.valueOf(i));
                return new C5178Hs<>(c5178Hs.EZpvd(), Integer.valueOf(((Number) c5178Hs.KWHzl()).intValue()));
            }
        };
    }

    public static final Function2<java.lang.String, java.lang.Integer, C5178Hs<java.lang.Integer>> uzCIH() {
        return new Function2<java.lang.String, java.lang.Integer, C5178Hs<? extends java.lang.Integer>>() { // from class: aws.smithy.kotlin.runtime.time.ParsersKt$tzOffsetHoursMins$1
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // kotlin.jvm.functions.Function2
            public /* synthetic */ C5178Hs<? extends Integer> invoke(String str, Integer num) {
                return invoke(str, num.intValue());
            }

            public final C5178Hs<Integer> invoke(@NotNull String str, int i) {
                C5178Hs c5178Hs;
                Intrinsics.checkNotNullParameter(str, "");
                C5178Hs c5178Hs2 = (C5178Hs) C5181Hv.fARcdN().invoke(str, Integer.valueOf(i));
                int iEZpvd = c5178Hs2.EZpvd();
                int iIntValue = ((Number) c5178Hs2.KWHzl()).intValue();
                C5178Hs c5178Hs3 = (C5178Hs) C5181Hv.hDKMBd().invoke(str, Integer.valueOf(iEZpvd));
                int iEZpvd2 = c5178Hs3.EZpvd();
                int iIntValue2 = ((Number) c5178Hs3.KWHzl()).intValue();
                int iEZpvd3 = ((C5178Hs) C5174Ho.copydefault(C5174Ho.copydefault(AbstractJsonLexerKt.COLON)).invoke(str, Integer.valueOf(iEZpvd2))).EZpvd();
                if (iEZpvd3 < str.length()) {
                    c5178Hs = (C5178Hs) C5181Hv.iwGUEr().invoke(str, Integer.valueOf(iEZpvd3));
                } else {
                    c5178Hs = new C5178Hs(iEZpvd3, 0);
                }
                return new C5178Hs<>(c5178Hs.EZpvd(), Integer.valueOf(iIntValue * ((iIntValue2 * IMarketApiService.SIXTY_MINUTES) + (((Number) c5178Hs.KWHzl()).intValue() * 60))));
            }
        };
    }

    public static final Function2<java.lang.String, java.lang.Integer, C5178Hs<java.lang.Integer>> AubY() {
        return C5174Ho.KWHzl(C5174Ho.KWHzl("Zz"), new Function1<java.lang.Character, java.lang.Integer>() { // from class: aws.smithy.kotlin.runtime.time.ParsersKt$tzUtc$1
            public final Integer invoke(char c) {
                return 0;
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // kotlin.jvm.functions.Function1
            public /* synthetic */ Integer invoke(Character ch) {
                return invoke(ch.charValue());
            }
        });
    }

    public static final Function2<java.lang.String, java.lang.Integer, C5178Hs<java.lang.Integer>> wlaJM() {
        return new Function2<java.lang.String, java.lang.Integer, C5178Hs<? extends java.lang.Integer>>() { // from class: aws.smithy.kotlin.runtime.time.ParsersKt$tzOffsetSecIso8601$1
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // kotlin.jvm.functions.Function2
            public /* synthetic */ C5178Hs<? extends Integer> invoke(String str, Integer num) {
                return invoke(str, num.intValue());
            }

            public final C5178Hs<Integer> invoke(@NotNull String str, int i) {
                Intrinsics.checkNotNullParameter(str, "");
                try {
                    return (C5178Hs) C5174Ho.AEQbTJ(C5181Hv.AubY(), C5181Hv.uzCIH()).invoke(str, Integer.valueOf(i));
                } catch (ParseException unused) {
                    throw new ParseException(str, "invalid timezone offset; expected `Z|z` or `(+-)HH:MM`", i);
                }
            }
        };
    }

    public static final Function2<java.lang.String, java.lang.Integer, C5178Hs<C5177Hr>> ejfBZ() {
        return new Function2<java.lang.String, java.lang.Integer, C5178Hs<? extends C5177Hr>>() { // from class: aws.smithy.kotlin.runtime.time.ParsersKt$iso8601Time$1
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // kotlin.jvm.functions.Function2
            public /* synthetic */ C5178Hs<? extends C5177Hr> invoke(String str, Integer num) {
                return invoke(str, num.intValue());
            }

            public final C5178Hs<C5177Hr> invoke(@NotNull String str, int i) {
                Intrinsics.checkNotNullParameter(str, "");
                C5178Hs c5178Hs = (C5178Hs) C5181Hv.hDKMBd().invoke(str, Integer.valueOf(i));
                int iEZpvd = c5178Hs.EZpvd();
                int iIntValue = ((Number) c5178Hs.KWHzl()).intValue();
                C5178Hs c5178Hs2 = (C5178Hs) C5181Hv.iwGUEr().invoke(str, Integer.valueOf(((C5178Hs) C5174Ho.copydefault(C5174Ho.copydefault(AbstractJsonLexerKt.COLON)).invoke(str, Integer.valueOf(iEZpvd))).EZpvd()));
                int iEZpvd2 = c5178Hs2.EZpvd();
                int iIntValue2 = ((Number) c5178Hs2.KWHzl()).intValue();
                C5178Hs c5178Hs3 = (C5178Hs) C5181Hv.getFieldNames().invoke(str, Integer.valueOf(((C5178Hs) C5174Ho.copydefault(C5174Ho.copydefault(AbstractJsonLexerKt.COLON)).invoke(str, Integer.valueOf(iEZpvd2))).EZpvd()));
                int iEZpvd3 = c5178Hs3.EZpvd();
                int iIntValue3 = ((Number) c5178Hs3.KWHzl()).intValue();
                C5178Hs c5178Hs4 = (C5178Hs) C5174Ho.OLrzqt((Function2<? super String, ? super Integer, ? extends C5178Hs<? extends int>>) C5174Ho.KWHzl(C5174Ho.KWHzl(".,"), C5181Hv.getNewProxyInstance()), 0).invoke(str, Integer.valueOf(iEZpvd3));
                int iEZpvd4 = c5178Hs4.EZpvd();
                int iIntValue4 = ((Number) c5178Hs4.KWHzl()).intValue();
                C5178Hs c5178Hs5 = (C5178Hs) C5181Hv.wlaJM().invoke(str, Integer.valueOf(iEZpvd4));
                return new C5178Hs<>(c5178Hs5.EZpvd(), new C5177Hr(iIntValue, iIntValue2, iIntValue3, iIntValue4, ((Number) c5178Hs5.KWHzl()).intValue()));
            }
        };
    }

    public static final C5176Hq OLrzqt(@NotNull java.lang.String str) {
        C5177Hr c5177Hr;
        Intrinsics.checkNotNullParameter(str, "");
        C5178Hs<C5175Hp> c5178HsInvoke = AkhnZx().invoke(str, 0);
        int iEZpvd = c5178HsInvoke.EZpvd();
        C5175Hp c5175HpKWHzl = c5178HsInvoke.KWHzl();
        if (iEZpvd == str.length()) {
            c5177Hr = new C5177Hr(0, 0, 0, 0, 0);
        } else {
            c5177Hr = (C5177Hr) ((C5178Hs) C5174Ho.KWHzl(C5174Ho.KWHzl("Tt"), ejfBZ()).invoke(str, java.lang.Integer.valueOf(iEZpvd))).KWHzl();
        }
        return new C5176Hq(c5175HpKWHzl.OLrzqt(), c5175HpKWHzl.EZpvd(), c5175HpKWHzl.AEQbTJ(), c5177Hr.AEQbTJ(), c5177Hr.OLrzqt(), c5177Hr.EZpvd(), c5177Hr.copydefault(), c5177Hr.KWHzl());
    }

    public static final java.lang.String AEQbTJ(java.lang.String str) {
        MatchResult matchResultMatchEntire = copydefault.matchEntire(str);
        if (matchResultMatchEntire == null) {
            return str;
        }
        MatchResult.ActionBar actionBarAEQbTJ = matchResultMatchEntire.AEQbTJ();
        java.lang.String str2 = actionBarAEQbTJ.KWHzl().OLrzqt().get(1);
        java.lang.String str3 = actionBarAEQbTJ.KWHzl().OLrzqt().get(2);
        java.lang.String str4 = actionBarAEQbTJ.KWHzl().OLrzqt().get(5);
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(str2);
        kotlin.Pair<java.lang.String, java.lang.Integer> pairCopydefault = copydefault(str3, '.');
        java.lang.String strComponent1 = pairCopydefault.component1();
        int iIntValue = pairCopydefault.component2().intValue();
        java.lang.Integer intOrNull = StringsKt__StringNumberConversionsKt.toIntOrNull(str4);
        if (intOrNull == null) {
            throw new aws.smithy.kotlin.runtime.time.ParseException(str, "Failed to read exponent", 0);
        }
        kotlin.Pair pairSplitAt$default = splitAt$default(strComponent1, iIntValue + intOrNull.intValue(), (char) 0, 2, null);
        java.lang.String str5 = (java.lang.String) pairSplitAt$default.component1();
        java.lang.String str6 = (java.lang.String) pairSplitAt$default.component2();
        sb.append(str5);
        sb.append('.');
        sb.append(str6);
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string == null ? str : string;
    }

    public static /* synthetic */ kotlin.Pair splitAt$default(java.lang.String str, int i, char c, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            c = '0';
        }
        return EZpvd(str, i, c);
    }

    public static final kotlin.Pair<java.lang.String, java.lang.String> EZpvd(java.lang.String str, int i, char c) {
        if (i <= 0) {
            return C56390yDp.OLrzqt(java.lang.String.valueOf(c), StringsKt__StringsKt.copydefault(str, str.length() - i, c));
        }
        if (i >= str.length()) {
            return C56390yDp.OLrzqt(StringsKt__StringsKt.AEQbTJ(str, i, c), java.lang.String.valueOf(c));
        }
        java.lang.String strSubstring = str.substring(0, i);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "");
        java.lang.String strSubstring2 = str.substring(i);
        Intrinsics.checkNotNullExpressionValue(strSubstring2, "");
        return C56390yDp.OLrzqt(strSubstring, strSubstring2);
    }

    public static final kotlin.Pair<java.lang.String, java.lang.Integer> copydefault(java.lang.String str, char c) {
        if (StringsKt__StringsKt.contains$default((java.lang.CharSequence) str, c, false, 2, (java.lang.Object) null)) {
            int iIndexOf$default = StringsKt__StringsKt.indexOf$default((java.lang.CharSequence) str, c, 0, false, 6, (java.lang.Object) null);
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            java.lang.String strSubstring = str.substring(0, iIndexOf$default);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "");
            sb.append(strSubstring);
            java.lang.String strSubstring2 = str.substring(iIndexOf$default + 1);
            Intrinsics.checkNotNullExpressionValue(strSubstring2, "");
            sb.append(strSubstring2);
            return C56390yDp.OLrzqt(sb.toString(), java.lang.Integer.valueOf(iIndexOf$default));
        }
        return C56390yDp.OLrzqt(str, java.lang.Integer.valueOf(str.length()));
    }

    public static final C5173Hn KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        java.lang.String strAEQbTJ = AEQbTJ(str);
        C5178Hs<java.lang.Long> c5178HsInvoke = C5174Ho.OLrzqt(1, 19).invoke(strAEQbTJ, 0);
        int iEZpvd = c5178HsInvoke.EZpvd();
        long jLongValue = c5178HsInvoke.KWHzl().longValue();
        if (iEZpvd == strAEQbTJ.length()) {
            return C5173Hn.AEQbTJ.copydefault(jLongValue, 0);
        }
        return C5173Hn.AEQbTJ.copydefault(jLongValue, ((java.lang.Number) ((C5178Hs) C5174Ho.KWHzl(C5174Ho.copydefault('.'), C5174Ho.OLrzqt(1, 9, 9)).invoke(strAEQbTJ, java.lang.Integer.valueOf(iEZpvd))).KWHzl()).intValue());
    }

    public static final Function2<java.lang.String, java.lang.Integer, C5178Hs<java.lang.String>> fJNWhG() {
        return C5174Ho.AEQbTJ(C5174Ho.copydefault("Mon"), C5174Ho.copydefault("Tue"), C5174Ho.copydefault("Wed"), C5174Ho.copydefault("Thu"), C5174Ho.copydefault("Fri"), C5174Ho.copydefault("Sat"), C5174Ho.copydefault("Sun"));
    }

    public static final C5178Hs<java.lang.Character> KWHzl(java.lang.String str, int i) {
        return C5174Ho.copydefault(' ').invoke(str, java.lang.Integer.valueOf(i));
    }

    public static final Function2<java.lang.String, java.lang.Integer, C5178Hs<java.lang.Integer>> isConnected() {
        return new Function2<java.lang.String, java.lang.Integer, C5178Hs<? extends java.lang.Integer>>() { // from class: aws.smithy.kotlin.runtime.time.ParsersKt$dateMonthName$1
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // kotlin.jvm.functions.Function2
            public /* synthetic */ C5178Hs<? extends Integer> invoke(String str, Integer num) {
                return invoke(str, num.intValue());
            }

            /* JADX WARN: Code restructure failed: missing block: B:18:0x004e, code lost:
            
                if (r3.equals("Mar") != false) goto L41;
             */
            /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final C5178Hs<Integer> invoke(@NotNull String str, int i) {
                Intrinsics.checkNotNullParameter(str, "");
                int i2 = 3;
                C5174Ho.copydefault(str, i, 3);
                int i3 = i + 3;
                String strSubstring = str.substring(i, i3);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "");
                switch (strSubstring.hashCode()) {
                    case 66051:
                        if (strSubstring.equals("Apr")) {
                            i2 = 4;
                            return new C5178Hs<>(i3, Integer.valueOf(i2));
                        }
                        break;
                    case 66195:
                        if (strSubstring.equals("Aug")) {
                            i2 = 8;
                            return new C5178Hs<>(i3, Integer.valueOf(i2));
                        }
                        break;
                    case 68578:
                        if (strSubstring.equals("Dec")) {
                            i2 = 12;
                            return new C5178Hs<>(i3, Integer.valueOf(i2));
                        }
                        break;
                    case 70499:
                        if (strSubstring.equals("Feb")) {
                            i2 = 2;
                            return new C5178Hs<>(i3, Integer.valueOf(i2));
                        }
                        break;
                    case 74231:
                        if (strSubstring.equals("Jan")) {
                            i2 = 1;
                            return new C5178Hs<>(i3, Integer.valueOf(i2));
                        }
                        break;
                    case 74849:
                        if (strSubstring.equals("Jul")) {
                            i2 = 7;
                            return new C5178Hs<>(i3, Integer.valueOf(i2));
                        }
                        break;
                    case 74851:
                        if (strSubstring.equals("Jun")) {
                            i2 = 6;
                            return new C5178Hs<>(i3, Integer.valueOf(i2));
                        }
                        break;
                    case 77118:
                        break;
                    case 77125:
                        if (strSubstring.equals("May")) {
                            i2 = 5;
                            return new C5178Hs<>(i3, Integer.valueOf(i2));
                        }
                        break;
                    case 78517:
                        if (strSubstring.equals("Nov")) {
                            i2 = 11;
                            return new C5178Hs<>(i3, Integer.valueOf(i2));
                        }
                        break;
                    case 79104:
                        if (strSubstring.equals("Oct")) {
                            i2 = 10;
                            return new C5178Hs<>(i3, Integer.valueOf(i2));
                        }
                        break;
                    case 83006:
                        if (strSubstring.equals("Sep")) {
                            i2 = 9;
                            return new C5178Hs<>(i3, Integer.valueOf(i2));
                        }
                        break;
                }
                throw new ParseException(str, "invalid month `" + strSubstring + '`', i);
            }
        };
    }

    public static final Function2<java.lang.String, java.lang.Integer, C5178Hs<java.lang.Integer>> AuCTelauCTel() {
        return new Function2<java.lang.String, java.lang.Integer, C5178Hs<? extends java.lang.Integer>>() { // from class: aws.smithy.kotlin.runtime.time.ParsersKt$tzOffsetSecRfc5322$1
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // kotlin.jvm.functions.Function2
            public /* synthetic */ C5178Hs<? extends Integer> invoke(String str, Integer num) {
                return invoke(str, num.intValue());
            }

            public final C5178Hs<Integer> invoke(@NotNull String str, int i) {
                Intrinsics.checkNotNullParameter(str, "");
                try {
                    return (C5178Hs) C5174Ho.AEQbTJ(C5174Ho.KWHzl(C5174Ho.AEQbTJ(C5174Ho.copydefault("GMT"), C5174Ho.copydefault("UTC"), C5174Ho.copydefault("UT"), C5174Ho.copydefault("Z")), new Function1<String, Integer>() { // from class: aws.smithy.kotlin.runtime.time.ParsersKt$tzOffsetSecRfc5322$1$utcOffsets$1
                        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
                        @Override // kotlin.jvm.functions.Function1
                        public final Integer invoke(@NotNull String str2) {
                            Intrinsics.checkNotNullParameter(str2, "");
                            return 0;
                        }
                    }), C5181Hv.uzCIH()).invoke(str, Integer.valueOf(i));
                } catch (ParseException unused) {
                    throw new ParseException(str, "invalid timezone offset; expected `GMT` or `(+-)HHMM`", i);
                }
            }
        };
    }

    public static final Function2<java.lang.String, java.lang.Integer, C5178Hs<C5177Hr>> fIwbmz() {
        return new Function2<java.lang.String, java.lang.Integer, C5178Hs<? extends C5177Hr>>() { // from class: aws.smithy.kotlin.runtime.time.ParsersKt$rfc5322Time$1
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // kotlin.jvm.functions.Function2
            public /* synthetic */ C5178Hs<? extends C5177Hr> invoke(String str, Integer num) {
                return invoke(str, num.intValue());
            }

            public final C5178Hs<C5177Hr> invoke(@NotNull String str, int i) {
                C5178Hs c5178Hs;
                Intrinsics.checkNotNullParameter(str, "");
                C5178Hs c5178Hs2 = (C5178Hs) C5181Hv.hDKMBd().invoke(str, Integer.valueOf(i));
                int iEZpvd = c5178Hs2.EZpvd();
                int iIntValue = ((Number) c5178Hs2.KWHzl()).intValue();
                C5178Hs c5178Hs3 = (C5178Hs) C5174Ho.KWHzl(C5174Ho.copydefault(AbstractJsonLexerKt.COLON), C5181Hv.iwGUEr()).invoke(str, Integer.valueOf(iEZpvd));
                int iEZpvd2 = c5178Hs3.EZpvd();
                int iIntValue2 = ((Number) c5178Hs3.KWHzl()).intValue();
                if (iEZpvd2 < str.length() && str.charAt(iEZpvd2) == ':') {
                    c5178Hs = (C5178Hs) C5174Ho.KWHzl(C5174Ho.copydefault(AbstractJsonLexerKt.COLON), C5181Hv.getFieldNames()).invoke(str, Integer.valueOf(iEZpvd2));
                } else {
                    c5178Hs = new C5178Hs(iEZpvd2, 0);
                }
                int iEZpvd3 = c5178Hs.EZpvd();
                int iIntValue3 = ((Number) c5178Hs.KWHzl()).intValue();
                C5178Hs c5178Hs4 = (C5178Hs) C5174Ho.OLrzqt((Function2<? super String, ? super Integer, ? extends C5178Hs<? extends int>>) C5174Ho.KWHzl(C5174Ho.KWHzl(JwtUtilsKt.JWT_DELIMITER), C5181Hv.getNewProxyInstance()), 0).invoke(str, Integer.valueOf(iEZpvd3));
                int iEZpvd4 = c5178Hs4.EZpvd();
                int iIntValue4 = ((Number) c5178Hs4.KWHzl()).intValue();
                C5178Hs c5178Hs5 = (C5178Hs) C5174Ho.KWHzl(AnonymousClass1.INSTANCE, C5181Hv.AuCTelauCTel()).invoke(str, Integer.valueOf(iEZpvd4));
                return new C5178Hs<>(c5178Hs5.EZpvd(), new C5177Hr(iIntValue, iIntValue2, iIntValue3, iIntValue4, ((Number) c5178Hs5.KWHzl()).intValue()));
            }

            /* JADX INFO: renamed from: aws.smithy.kotlin.runtime.time.ParsersKt$rfc5322Time$1$1, reason: invalid class name */
            public final /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements Function2<String, Integer, C5178Hs<? extends Character>> {
                public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public AnonymousClass1() {
                    super(2, C5181Hv.class, "sp", "sp(Ljava/lang/String;I)Laws/smithy/kotlin/runtime/time/ParseResult;", 1);
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function2
                public /* synthetic */ C5178Hs<? extends Character> invoke(String str, Integer num) {
                    return invoke(str, num.intValue());
                }

                public final C5178Hs<Character> invoke(@NotNull String str, int i) {
                    Intrinsics.checkNotNullParameter(str, "");
                    return C5181Hv.KWHzl(str, i);
                }
            }
        };
    }

    public static final C5176Hq EZpvd(@NotNull java.lang.String str) {
        C5178Hs c5178Hs;
        Intrinsics.checkNotNullParameter(str, "");
        if ((!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str)) && !C5174Ho.EZpvd(str.charAt(0))) {
            c5178Hs = (C5178Hs) C5174Ho.KWHzl(C5174Ho.EZpvd(C5174Ho.EZpvd(fJNWhG(), C5174Ho.copydefault(AbstractJsonLexerKt.COMMA)), ParsersKt$parseRfc5322$1.INSTANCE), new Function1() { // from class: aws.smithy.kotlin.runtime.time.ParsersKt$parseRfc5322$2
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
                @Override // kotlin.jvm.functions.Function1
                public final Void invoke(@NotNull Pair<Pair<String, Character>, Character> pair) {
                    Intrinsics.checkNotNullParameter(pair, "");
                    return null;
                }
            }).invoke(str, 0);
        } else {
            c5178Hs = new C5178Hs(0, null);
        }
        C5178Hs<java.lang.Integer> c5178HsInvoke = copydefault(1).invoke(str, java.lang.Integer.valueOf(c5178Hs.EZpvd()));
        int iEZpvd = c5178HsInvoke.EZpvd();
        int iIntValue = c5178HsInvoke.KWHzl().intValue();
        C5178Hs c5178Hs2 = (C5178Hs) C5174Ho.KWHzl(ParsersKt$parseRfc5322$3.INSTANCE, isConnected()).invoke(str, java.lang.Integer.valueOf(iEZpvd));
        int iEZpvd2 = c5178Hs2.EZpvd();
        int iIntValue2 = ((java.lang.Number) c5178Hs2.KWHzl()).intValue();
        C5178Hs c5178Hs3 = (C5178Hs) C5174Ho.KWHzl(ParsersKt$parseRfc5322$4.INSTANCE, values()).invoke(str, java.lang.Integer.valueOf(iEZpvd2));
        int iEZpvd3 = c5178Hs3.EZpvd();
        int iIntValue3 = ((java.lang.Number) c5178Hs3.KWHzl()).intValue();
        C5177Hr c5177Hr = (C5177Hr) ((C5178Hs) C5174Ho.KWHzl(ParsersKt$parseRfc5322$5.INSTANCE, fIwbmz()).invoke(str, java.lang.Integer.valueOf(iEZpvd3))).KWHzl();
        return new C5176Hq(iIntValue3, iIntValue2, iIntValue, c5177Hr.AEQbTJ(), c5177Hr.OLrzqt(), c5177Hr.EZpvd(), c5177Hr.copydefault(), c5177Hr.KWHzl());
    }
}
