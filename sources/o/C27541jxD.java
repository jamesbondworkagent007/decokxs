package o;

import kotlin.jvm.internal.Intrinsics;
import o.C25493ixk;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jxD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C27541jxD {
    public static final C27541jxD KWHzl = new C27541jxD();

    private C27541jxD() {
    }

    public final java.lang.String KWHzl(@NotNull android.content.Context context, java.lang.Integer num) {
        Intrinsics.checkNotNullParameter(context, "");
        int i = ((num != null && num.intValue() == 0) || num == null || num.intValue() != 1) ? C25493ixk.FragmentManager.hlXVux : C25493ixk.FragmentManager.processStrongAuthMessage;
        java.lang.String string = context.getString(i);
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }
}
