package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.uyH, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C49950uyH {
    public static /* synthetic */ void startTradeActivity$default(android.content.Context context, android.content.Intent intent, java.lang.Integer num, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            num = null;
        }
        AEQbTJ(context, intent, num);
    }

    public static final void AEQbTJ(@NotNull android.content.Context context, @NotNull android.content.Intent intent, java.lang.Integer num) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(intent, "");
        if (num != null) {
            if (context instanceof android.app.Activity) {
                ((android.app.Activity) context).startActivityForResult(intent, num.intValue());
            }
        } else {
            if (!(context instanceof android.app.Activity)) {
                intent.setFlags(268435456);
            }
            context.startActivity(intent);
        }
    }
}
