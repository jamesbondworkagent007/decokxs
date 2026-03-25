package o;

import java.util.zip.GZIPInputStream;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ctz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C12812ctz {
    public static final C12812ctz EZpvd = new C12812ctz();

    private C12812ctz() {
    }

    public final java.io.InputStream copydefault(@NotNull java.io.InputStream inputStream) {
        Intrinsics.checkNotNullParameter(inputStream, "");
        return new GZIPInputStream(new android.util.Base64InputStream(inputStream, 0));
    }

    public final long EZpvd(@NotNull java.lang.String str) {
        java.util.List listAhwBna;
        Intrinsics.checkNotNullParameter(str, "");
        if (str.length() != 0) {
            try {
                java.util.List<java.lang.String> listSplit = new Regex("\\.").split(str, 0);
                if (!listSplit.isEmpty()) {
                    java.util.ListIterator<java.lang.String> listIterator = listSplit.listIterator(listSplit.size());
                    while (listIterator.hasPrevious()) {
                        if (listIterator.previous().length() != 0) {
                            listAhwBna = CollectionsKt___CollectionsKt.AhwBna((java.lang.Iterable) listSplit, listIterator.nextIndex() + 1);
                            break;
                        }
                    }
                    listAhwBna = yDY.AhwBna();
                } else {
                    listAhwBna = yDY.AhwBna();
                }
                java.util.stream.Stream stream = java.util.Arrays.stream((java.lang.String[]) listAhwBna.toArray(new java.lang.String[0]));
                final Function1 function1 = new Function1() { // from class: o.ctA
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C12812ctz.OLrzqt((java.lang.String) obj);
                    }
                };
                java.lang.Object objReduce = stream.map(new java.util.function.Function() { // from class: o.cty
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // java.util.function.Function
                    public final java.lang.Object apply(java.lang.Object obj) {
                        return C12812ctz.OLrzqt(function1, obj);
                    }
                }).reduce("", new java.util.function.BinaryOperator() { // from class: o.ctx
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // java.util.function.BiFunction
                    public final java.lang.Object apply(java.lang.Object obj, java.lang.Object obj2) {
                        return C12812ctz.copydefault((java.lang.String) obj, (java.lang.String) obj2);
                    }
                });
                Intrinsics.checkNotNullExpressionValue(objReduce, "");
                return C33129mqd.valueOf((java.lang.String) objReduce);
            } catch (java.lang.Exception e) {
                e.getMessage();
            }
        }
        return 0L;
    }

    public static final java.lang.String OLrzqt(Function1 function1, java.lang.Object obj) {
        return (java.lang.String) function1.invoke(obj);
    }

    public static final java.lang.String OLrzqt(java.lang.String str) {
        C56529yIt c56529yIt = C56529yIt.KWHzl;
        java.lang.String str2 = java.lang.String.format("%04d", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(C33129mqd.AhwBna(str))}, 1));
        Intrinsics.checkNotNullExpressionValue(str2, "");
        return str2;
    }

    public static final java.lang.String copydefault(java.lang.String str, java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return str + str2;
    }
}
