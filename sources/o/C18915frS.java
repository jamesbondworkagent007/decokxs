package o;

import com.okinc.business.defi.wallet.mine.search.domain.type.SearchSortType;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.frS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C18915frS {

    /* JADX INFO: renamed from: o.frS$StateListAnimator */
    public final /* synthetic */ class StateListAnimator {
        public static final /* synthetic */ int[] copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[SearchSortType.values().length];
            try {
                iArr[SearchSortType.DEFAULT.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[SearchSortType.TURNOVER.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            copydefault = iArr;
        }
    }

    @yCM
    public C18915frS() {
    }

    public final java.util.List<C18982fsg> copydefault(@NotNull SearchSortType searchSortType, @NotNull java.util.List<C18982fsg> list) {
        Intrinsics.checkNotNullParameter(searchSortType, "");
        Intrinsics.checkNotNullParameter(list, "");
        int i = StateListAnimator.copydefault[searchSortType.ordinal()];
        if (i == 1) {
            return list;
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return CollectionsKt___CollectionsKt.EZpvd(list, new ActionBar());
    }

    /* JADX INFO: renamed from: o.frS$ActionBar */
    public static final class ActionBar<T> implements java.util.Comparator {
        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return yET.KWHzl(C33129mqd.EZpvd(((C18982fsg) t2).copydefault().values()), C33129mqd.EZpvd(((C18982fsg) t).copydefault().values()));
        }
    }
}
