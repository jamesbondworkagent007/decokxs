package o;

import com.okinc.network.okg.response.OKServerException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC43419rot;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class mAY {
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: o.rot<? extends T, ? extends E> */
    /* JADX WARN: Multi-variable type inference failed */
    public static final <T, E, R> AbstractC43419rot<R, E> OLrzqt(@NotNull AbstractC43419rot<? extends T, ? extends E> abstractC43419rot, @NotNull Function1<? super T, ? extends R> function1) {
        Intrinsics.checkNotNullParameter(abstractC43419rot, "");
        Intrinsics.checkNotNullParameter(function1, "");
        if (abstractC43419rot instanceof AbstractC43419rot.StateListAnimator) {
            return new AbstractC43419rot.StateListAnimator(function1.invoke((java.lang.Object) ((AbstractC43419rot.StateListAnimator) abstractC43419rot).KWHzl()));
        }
        if (abstractC43419rot instanceof AbstractC43419rot.ActionBar) {
            return abstractC43419rot;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v2, resolved type: java.lang.String */
    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> AbstractC43419rot<T, OKServerException> EZpvd(@NotNull AbstractC43419rot<? extends java.util.List<? extends T>, OKServerException> abstractC43419rot) {
        Intrinsics.checkNotNullParameter(abstractC43419rot, "");
        if (abstractC43419rot.OLrzqt()) {
            AbstractC43419rot.ActionBar actionBar = abstractC43419rot instanceof AbstractC43419rot.ActionBar ? (AbstractC43419rot.ActionBar) abstractC43419rot : null;
            OKServerException oKServerException = actionBar != null ? (OKServerException) actionBar.KWHzl() : null;
            return new AbstractC43419rot.ActionBar(new OKServerException(0, oKServerException != null ? oKServerException.getMessage() : null, null, null, 13, null));
        }
        if (abstractC43419rot.EZpvd()) {
            java.util.List<? extends T> listCopydefault = abstractC43419rot.copydefault();
            java.lang.Object objFirstOrNull = listCopydefault != null ? CollectionsKt___CollectionsKt.firstOrNull(listCopydefault) : null;
            if (objFirstOrNull == null) {
                return new AbstractC43419rot.ActionBar(new OKServerException(0, "Empty result", null, null, 13, null));
            }
            return new AbstractC43419rot.StateListAnimator(objFirstOrNull);
        }
        return new AbstractC43419rot.ActionBar(new OKServerException(0, null, null, null, 15, null));
    }
}
