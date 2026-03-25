package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ytS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C58021ytS {
    public static /* synthetic */ java.lang.Object safeApply$default(java.lang.Object obj, java.lang.String str, boolean z, java.lang.String str2, Function1 function1, int i, java.lang.Object obj2) {
        if ((i & 1) != 0) {
            str = "Matrix.Safe";
        }
        if ((i & 2) != 0) {
            z = true;
        }
        if ((i & 4) != 0) {
            str2 = "";
        }
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(function1, "");
        try {
            function1.invoke(obj);
        } catch (java.lang.Throwable th) {
            if (z) {
                C58013ytK.OLrzqt(str, th, str2, new java.lang.Object[0]);
            }
        }
        return obj;
    }

    public static /* synthetic */ void safeLet$default(java.lang.Object obj, Function1 function1, Function1 function12, Function1 function13, int i, java.lang.Object obj2) {
        if ((i & 2) != 0) {
            function12 = new Function1<java.lang.Object, Unit>() { // from class: com.tencent.matrix.util.SafeKt$safeLet$1
                /* JADX DEBUG: Possible override for method kotlin.jvm.functions.Function1.invoke(Ljava/lang/Object;)Ljava/lang/Object; */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Object obj3) {
                }

                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Object obj3) {
                    invoke2(obj3);
                    return Unit.INSTANCE;
                }
            };
        }
        if ((i & 4) != 0) {
            function13 = new Function1<java.lang.Throwable, Unit>() { // from class: com.tencent.matrix.util.SafeKt$safeLet$2
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull Throwable th) {
                    Intrinsics.checkNotNullParameter(th, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                    invoke2(th);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function12, "");
        Intrinsics.checkNotNullParameter(function13, "");
        try {
            function12.invoke(function1.invoke(obj));
        } catch (java.lang.Throwable th) {
            function13.invoke(th);
        }
    }

    public static /* synthetic */ java.lang.Object safeLet$default(java.lang.Object obj, java.lang.String str, boolean z, java.lang.String str2, java.lang.Object obj2, Function1 function1, int i, java.lang.Object obj3) {
        if ((i & 1) != 0) {
            str = "Matrix.Safe";
        }
        if ((i & 2) != 0) {
            z = true;
        }
        if ((i & 4) != 0) {
            str2 = "";
        }
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(function1, "");
        try {
            return function1.invoke(obj);
        } catch (java.lang.Throwable th) {
            if (!z) {
                return obj2;
            }
            C58013ytK.OLrzqt(str, th, str2, new java.lang.Object[0]);
            return obj2;
        }
    }

    public static /* synthetic */ java.lang.Object safeLetOrNull$default(java.lang.Object obj, java.lang.String str, boolean z, java.lang.String str2, Function1 function1, int i, java.lang.Object obj2) {
        if ((i & 1) != 0) {
            str = "Matrix.Safe";
        }
        if ((i & 2) != 0) {
            z = true;
        }
        if ((i & 4) != 0) {
            str2 = "";
        }
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(function1, "");
        try {
            return function1.invoke(obj);
        } catch (java.lang.Throwable th) {
            if (z) {
                C58013ytK.OLrzqt(str, th, str2, new java.lang.Object[0]);
            }
            return null;
        }
    }
}
