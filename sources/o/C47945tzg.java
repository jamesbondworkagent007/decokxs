package o;

import kotlin.jvm.internal.Intrinsics;
import o.tWL;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tzg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C47945tzg {
    public static final C47945tzg OLrzqt = new C47945tzg();

    private C47945tzg() {
    }

    public final void EZpvd(@NotNull android.content.Context context, java.lang.Long l) {
        Intrinsics.checkNotNullParameter(context, "");
        if (l != null) {
            ((tWL) C43251rlk.copydefault(tWL.class)).KWHzl(context, java.lang.String.valueOf(l), "", "", "planet_notification", "");
            return;
        }
        C55326xho.OLrzqt("unknown uid:" + l + ",unable to open");
    }

    public final void KWHzl(@NotNull android.content.Context context, java.lang.Long l) {
        Intrinsics.checkNotNullParameter(context, "");
        if (l != null) {
            tWL.Application.openUGCDetail$default((tWL) C43251rlk.copydefault(tWL.class), context, java.lang.String.valueOf(l), null, null, "planet_notification", 12, null);
            return;
        }
        C55326xho.OLrzqt("unknown contentId:" + l + ",unable to open");
    }

    public final void AEQbTJ(@NotNull android.content.Context context, java.lang.Long l, java.lang.Long l2, java.lang.Long l3) {
        Intrinsics.checkNotNullParameter(context, "");
        if (l != null && l2 != null && l3 != null) {
            ((tWL) C43251rlk.copydefault(tWL.class)).KWHzl(context, java.lang.String.valueOf(l), java.lang.String.valueOf(l2), java.lang.String.valueOf(l3), "planet_notification");
            return;
        }
        C55326xho.OLrzqt("unknown contentId:" + l + ",commentId:" + l2 + " replyId:" + l3 + ", unable to open");
    }
}
