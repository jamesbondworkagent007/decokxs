package o;

import androidx.core.view.ViewGroupKt;
import com.amplitude.android.internal.ViewHierarchyScanner$findTarget$1;
import com.amplitude.android.internal.ViewTarget;
import com.amplitude.common.Logger;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.Ji, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C5220Ji {
    public static final C5220Ji OLrzqt = new C5220Ji();

    private C5220Ji() {
    }

    public static final ViewTarget AEQbTJ(@NotNull android.view.View view, @NotNull kotlin.Pair<java.lang.Float, java.lang.Float> pair, @NotNull java.util.List<? extends InterfaceC5234Jw> list, @NotNull ViewTarget.Type type, @NotNull Logger logger) {
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(pair, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(type, "");
        Intrinsics.checkNotNullParameter(logger, "");
        return (ViewTarget) BuildersKt__BuildersKt.runBlocking$default(null, new ViewHierarchyScanner$findTarget$1(view, logger, pair, type, list, null), 1, null);
    }

    public final ViewTarget KWHzl(android.view.View view, kotlin.Pair<java.lang.Float, java.lang.Float> pair, ViewTarget.Type type, java.util.List<? extends InterfaceC5234Jw> list, Logger logger) {
        android.view.View view2;
        boolean z;
        yDQ ydq = new yDQ();
        ydq.add(view);
        ViewTarget viewTarget = null;
        while (!ydq.isEmpty()) {
            try {
                view2 = (android.view.View) ydq.removeFirst();
                if (view2 instanceof android.view.ViewGroup) {
                    C56406yEe.AEQbTJ(ydq, ViewGroupKt.getChildren((android.view.ViewGroup) view2));
                }
            } catch (NoSuchElementException unused) {
                logger.EZpvd("Unable to get view from queue");
            }
            if (!(list instanceof java.util.Collection) || !list.isEmpty()) {
                java.util.Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    ViewTarget viewTargetCopydefault = ((InterfaceC5234Jw) it.next()).copydefault(view2, pair, type);
                    if (viewTargetCopydefault == null) {
                        z = false;
                    } else {
                        if (type != ViewTarget.Type.Clickable) {
                            return viewTargetCopydefault;
                        }
                        viewTarget = viewTargetCopydefault;
                        z = true;
                    }
                    if (z) {
                        break;
                    }
                }
            }
        }
        return viewTarget;
    }
}
