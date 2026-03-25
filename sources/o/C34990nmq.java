package o;

import com.okinc.core.ktx.MatchPattern;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C32113mPz;
import o.C52761wXj;

/* JADX INFO: renamed from: o.nmq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C34990nmq {
    public static final java.lang.CharSequence OLrzqt(final android.content.Context context, java.lang.String str, java.lang.String str2) {
        if (C55296xhK.OLrzqt(context)) {
            return StringsKt__StringsKt.hDKMBd(C33061mpO.setupSpanStyles$default(C33061mpO.setupSpanStyles$default(str2 + " / " + str, new java.lang.String[]{str2 + " /"}, 0, MatchPattern.LAST_ONLY, false, new Function1() { // from class: o.nmo
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C34990nmq.EZpvd(context, (java.util.List) obj);
                }
            }, 10, null), new java.lang.String[]{str}, 0, MatchPattern.FIRST_ONLY, false, new Function1() { // from class: o.nmp
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C34990nmq.gEmmrt(context, (java.util.List) obj);
                }
            }, 10, null));
        }
        return StringsKt__StringsKt.hDKMBd(C33061mpO.setupSpanStyles$default(C33061mpO.setupSpanStyles$default(str + " / " + str2, new java.lang.String[]{str}, 0, null, false, new Function1() { // from class: o.nmr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C34990nmq.valueOf(context, (java.util.List) obj);
            }
        }, 14, null), new java.lang.String[]{"/ " + str2}, 0, null, false, new Function1() { // from class: o.nms
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C34990nmq.djBIcL(context, (java.util.List) obj);
            }
        }, 14, null));
    }

    public static final Unit EZpvd(android.content.Context context, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        list.add(new android.text.style.TextAppearanceSpan(context, C52761wXj.LoaderManager.QSBOWP));
        return Unit.INSTANCE;
    }

    public static final Unit gEmmrt(android.content.Context context, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        list.add(new android.text.style.TextAppearanceSpan(context, C32113mPz.Dialog.gHZMYf));
        return Unit.INSTANCE;
    }

    public static final Unit valueOf(android.content.Context context, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        list.add(new android.text.style.TextAppearanceSpan(context, C32113mPz.Dialog.gHZMYf));
        return Unit.INSTANCE;
    }

    public static final Unit djBIcL(android.content.Context context, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        list.add(new android.text.style.TextAppearanceSpan(context, C52761wXj.LoaderManager.QSBOWP));
        return Unit.INSTANCE;
    }
}
