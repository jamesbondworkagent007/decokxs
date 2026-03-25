package o;

import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.auV, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C8002auV {
    public static /* synthetic */ void hexColumsPrint$default(C56393yDs[] c56393yDsArr, int i, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = 16;
        }
        EZpvd(c56393yDsArr, i);
    }

    /* JADX INFO: renamed from: hexColumsPrint-rto03Yo$default, reason: not valid java name */
    public static /* synthetic */ void m8561hexColumsPrintrto03Yo$default(byte[] bArr, int i, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = 16;
        }
        EZpvd(bArr, i);
    }

    public static final void EZpvd(@NotNull byte[] bArr, int i) {
        Intrinsics.checkNotNullParameter(bArr, "");
        java.util.ArrayList arrayList = new java.util.ArrayList(C56398yDx.OLrzqt(bArr));
        for (byte b : bArr) {
            arrayList.add(StringsKt__StringsKt.copydefault(C59460zhU.KWHzl(b, 16), 2, '0'));
        }
        java.util.Iterator it = CollectionsKt___CollectionsKt.valueOf((java.lang.Iterable) arrayList, i).iterator();
        while (it.hasNext()) {
            java.lang.System.out.println((java.lang.Object) CollectionsKt___CollectionsKt.joinToString$default((java.util.List) it.next(), " ", null, null, 0, null, new Function1<java.lang.String, java.lang.CharSequence>() { // from class: com.ionspin.kotlin.bignum.integer.util.VariousUtilKt$hexColumsPrint$2$1
                /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
                @Override // kotlin.jvm.functions.Function1
                public final CharSequence invoke(@NotNull String str) {
                    Intrinsics.checkNotNullParameter(str, "");
                    String upperCase = str.toUpperCase();
                    Intrinsics.checkNotNullExpressionValue(upperCase, "");
                    return upperCase;
                }
            }, 30, null));
        }
    }

    public static final void EZpvd(@NotNull C56393yDs[] c56393yDsArr, int i) {
        Intrinsics.checkNotNullParameter(c56393yDsArr, "");
        java.util.ArrayList arrayList = new java.util.ArrayList(c56393yDsArr.length);
        for (C56393yDs c56393yDs : c56393yDsArr) {
            arrayList.add(StringsKt__StringsKt.copydefault(C59460zhU.KWHzl(c56393yDs.OLrzqt(), 16), 2, '0'));
        }
        java.util.Iterator it = CollectionsKt___CollectionsKt.valueOf((java.lang.Iterable) arrayList, i).iterator();
        while (it.hasNext()) {
            java.lang.System.out.println((java.lang.Object) CollectionsKt___CollectionsKt.joinToString$default((java.util.List) it.next(), " ", null, null, 0, null, new Function1<java.lang.String, java.lang.CharSequence>() { // from class: com.ionspin.kotlin.bignum.integer.util.VariousUtilKt$hexColumsPrint$1$1
                /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
                @Override // kotlin.jvm.functions.Function1
                public final CharSequence invoke(@NotNull String str) {
                    Intrinsics.checkNotNullParameter(str, "");
                    String upperCase = str.toUpperCase();
                    Intrinsics.checkNotNullExpressionValue(upperCase, "");
                    return upperCase;
                }
            }, 30, null));
        }
    }
}
