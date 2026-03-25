package o;

import com.okinc.okimcore.model.im.OKMessage;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.oay, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
@yCR
public final class C36441oay {
    public final CopyOnWriteArrayList<Activity> copydefault = new CopyOnWriteArrayList<>();

    /* JADX INFO: renamed from: o.oay$Activity */
    /* JADX INFO: loaded from: classes16.dex */
    public interface Activity {
        void AEQbTJ(@NotNull OKMessage oKMessage);
    }

    @yCM
    public C36441oay() {
    }

    public final void copydefault(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
        if (this.copydefault.contains(activity)) {
            return;
        }
        this.copydefault.add(activity);
    }

    public final void EZpvd(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
        this.copydefault.remove(activity);
    }

    public final void KWHzl(@NotNull OKMessage oKMessage) {
        Intrinsics.checkNotNullParameter(oKMessage, "");
        java.util.Iterator<T> it = this.copydefault.iterator();
        while (it.hasNext()) {
            ((Activity) it.next()).AEQbTJ(oKMessage);
        }
    }
}
