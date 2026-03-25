package o;

import androidx.core.content.ContextCompat;
import com.google.android.material.badge.BadgeDrawable;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xdN, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C55087xdN implements InterfaceC55084xdK {
    @Override // o.InterfaceC55084xdK
    public android.graphics.drawable.Drawable OLrzqt(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        android.graphics.drawable.Drawable drawable = ContextCompat.getDrawable(context, C52761wXj.TaskDescription.dNCPSb);
        if (drawable != null) {
            return drawable;
        }
        BadgeDrawable badgeDrawableCreate = BadgeDrawable.create(context);
        Intrinsics.checkNotNullExpressionValue(badgeDrawableCreate, "");
        return badgeDrawableCreate;
    }
}
