package o;

import com.amplifyframework.core.model.ModelIdentifier;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.sSk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C44508sSk {
    public static final C44508sSk OLrzqt = new C44508sSk();

    public final boolean KWHzl(char c) {
        return ('A' <= c && c < '[') || ('a' <= c && c < '{');
    }

    private C44508sSk() {
    }

    public final java.util.List<sQU> copydefault(@NotNull java.util.List<sQU> list) {
        Intrinsics.checkNotNullParameter(list, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (sQU squ : list) {
            java.lang.Character chWlaJM = C59454zhO.wlaJM(C44157sFk.OLrzqt(squ));
            if (OLrzqt.KWHzl(chWlaJM != null ? chWlaJM.charValue() : C59454zhO.zLjUOn((java.lang.CharSequence) ModelIdentifier.Helper.PRIMARY_KEY_DELIMITER))) {
                arrayList.add(squ);
            } else {
                arrayList2.add(squ);
            }
        }
        return CollectionsKt___CollectionsKt.djBIcL((java.util.Collection) CollectionsKt___CollectionsKt.EZpvd(arrayList, new Activity()), (java.lang.Iterable) CollectionsKt___CollectionsKt.EZpvd(arrayList2, new TaskDescription()));
    }

    /* JADX INFO: renamed from: o.sSk$Activity */
    public static final class Activity<T> implements java.util.Comparator {
        /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            java.lang.String strOLrzqt = C44157sFk.OLrzqt((sQU) t);
            boolean zFARcdN = StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strOLrzqt);
            java.lang.String str = ModelIdentifier.Helper.PRIMARY_KEY_DELIMITER;
            if (zFARcdN) {
                strOLrzqt = ModelIdentifier.Helper.PRIMARY_KEY_DELIMITER;
            }
            java.util.Locale locale = java.util.Locale.ROOT;
            java.lang.String lowerCase = strOLrzqt.toLowerCase(locale);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "");
            java.lang.String strOLrzqt2 = C44157sFk.OLrzqt((sQU) t2);
            if (!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strOLrzqt2)) {
                str = strOLrzqt2;
            }
            java.lang.String lowerCase2 = str.toLowerCase(locale);
            Intrinsics.checkNotNullExpressionValue(lowerCase2, "");
            return yET.KWHzl(lowerCase, lowerCase2);
        }
    }

    /* JADX INFO: renamed from: o.sSk$TaskDescription */
    public static final class TaskDescription<T> implements java.util.Comparator {
        /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            java.lang.String strOLrzqt = C44157sFk.OLrzqt((sQU) t);
            boolean zFARcdN = StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strOLrzqt);
            java.lang.String str = ModelIdentifier.Helper.PRIMARY_KEY_DELIMITER;
            if (zFARcdN) {
                strOLrzqt = ModelIdentifier.Helper.PRIMARY_KEY_DELIMITER;
            }
            java.util.Locale locale = java.util.Locale.ROOT;
            java.lang.String lowerCase = strOLrzqt.toLowerCase(locale);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "");
            java.lang.String strOLrzqt2 = C44157sFk.OLrzqt((sQU) t2);
            if (!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strOLrzqt2)) {
                str = strOLrzqt2;
            }
            java.lang.String lowerCase2 = str.toLowerCase(locale);
            Intrinsics.checkNotNullExpressionValue(lowerCase2, "");
            return yET.KWHzl(lowerCase, lowerCase2);
        }
    }
}
