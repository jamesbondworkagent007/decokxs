package o;

import com.okinc.okimcore.model.im.inhouseim.ws.ReactionDisplay;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class sSX {
    public static final sSX KWHzl = new sSX();

    private sSX() {
    }

    public final java.util.List<ReactionDisplay> copydefault(@NotNull java.util.List<ReactionDisplay> list) {
        Intrinsics.checkNotNullParameter(list, "");
        return CollectionsKt___CollectionsKt.EZpvd(list, new Activity(new ActionBar()));
    }

    public static final class ActionBar<T> implements java.util.Comparator {
        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return yET.KWHzl(java.lang.Integer.valueOf(((ReactionDisplay) t2).getCount()), java.lang.Integer.valueOf(((ReactionDisplay) t).getCount()));
        }
    }

    public static final class Activity<T> implements java.util.Comparator {
        public final /* synthetic */ java.util.Comparator copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(java.util.Comparator comparator) {
            this.copydefault = comparator;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            int iCompare = this.copydefault.compare(t, t2);
            return iCompare != 0 ? iCompare : yET.KWHzl(((ReactionDisplay) t).getEmoji(), ((ReactionDisplay) t2).getEmoji());
        }
    }
}
