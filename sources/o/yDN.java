package o;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public class yDN extends yDO {
    public static <T> java.util.List<T> OLrzqt(@NotNull T[][] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "");
        int length = 0;
        for (T[] tArr2 : tArr) {
            length += tArr2.length;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(length);
        for (T[] tArr3 : tArr) {
            C56406yEe.KWHzl(arrayList, tArr3);
        }
        return arrayList;
    }

    public static <T> java.lang.String ejfBZ(T[] tArr) {
        if (tArr == null) {
            return AbstractJsonLexerKt.NULL;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder((C56548yJl.valueOf(tArr.length, 429496729) * 5) + 2);
        AEQbTJ(tArr, sb, new java.util.ArrayList());
        return sb.toString();
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.yEU.AEQbTJ(byte[]):java.lang.String */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.lang.Object[] */
    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> void AEQbTJ(T[] tArr, java.lang.StringBuilder sb, java.util.List<java.lang.Object[]> list) {
        if (list.contains(tArr)) {
            sb.append("[...]");
            return;
        }
        list.add(tArr);
        sb.append(AbstractJsonLexerKt.BEGIN_LIST);
        int length = tArr.length;
        for (int i = 0; i < length; i++) {
            if (i != 0) {
                sb.append(", ");
            }
            java.lang.Object[] objArr = tArr[i];
            if (objArr == 0) {
                sb.append(AbstractJsonLexerKt.NULL);
            } else if (objArr instanceof java.lang.Object[]) {
                AEQbTJ(objArr, sb, list);
                Unit unit = Unit.INSTANCE;
            } else if (objArr instanceof byte[]) {
                java.lang.String string = java.util.Arrays.toString((byte[]) objArr);
                Intrinsics.checkNotNullExpressionValue(string, "");
                sb.append(string);
            } else if (objArr instanceof short[]) {
                java.lang.String string2 = java.util.Arrays.toString((short[]) objArr);
                Intrinsics.checkNotNullExpressionValue(string2, "");
                sb.append(string2);
            } else if (objArr instanceof int[]) {
                java.lang.String string3 = java.util.Arrays.toString((int[]) objArr);
                Intrinsics.checkNotNullExpressionValue(string3, "");
                sb.append(string3);
            } else if (objArr instanceof long[]) {
                java.lang.String string4 = java.util.Arrays.toString((long[]) objArr);
                Intrinsics.checkNotNullExpressionValue(string4, "");
                sb.append(string4);
            } else if (objArr instanceof float[]) {
                java.lang.String string5 = java.util.Arrays.toString((float[]) objArr);
                Intrinsics.checkNotNullExpressionValue(string5, "");
                sb.append(string5);
            } else if (objArr instanceof double[]) {
                java.lang.String string6 = java.util.Arrays.toString((double[]) objArr);
                Intrinsics.checkNotNullExpressionValue(string6, "");
                sb.append(string6);
            } else if (objArr instanceof char[]) {
                java.lang.String string7 = java.util.Arrays.toString((char[]) objArr);
                Intrinsics.checkNotNullExpressionValue(string7, "");
                sb.append(string7);
            } else if (objArr instanceof boolean[]) {
                java.lang.String string8 = java.util.Arrays.toString((boolean[]) objArr);
                Intrinsics.checkNotNullExpressionValue(string8, "");
                sb.append(string8);
            } else if (objArr instanceof C56398yDx) {
                sb.append(yER.KWHzl(((C56398yDx) objArr).EZpvd()));
            } else if (objArr instanceof yDA) {
                sb.append(yER.KWHzl(((yDA) objArr).EZpvd()));
            } else if (objArr instanceof C56397yDw) {
                sb.append(yER.AEQbTJ(((C56397yDw) objArr).AEQbTJ()));
            } else if (objArr instanceof C56394yDt) {
                sb.append(yER.KWHzl(((C56394yDt) objArr).EZpvd()));
            } else {
                sb.append(objArr.toString());
            }
        }
        sb.append(AbstractJsonLexerKt.END_LIST);
        list.remove(yDY.AuCTel(list));
    }
}
