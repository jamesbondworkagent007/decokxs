package o;

import androidx.recyclerview.widget.RecyclerView;
import com.okinc.uilab.reminder.OKReminder;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.gpd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C20901gpd extends RecyclerView.ViewHolder {
    public static final int KWHzl = OKReminder.EZpvd;
    public final OKReminder EZpvd;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OKReminder EZpvd() {
        return this.EZpvd;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20901gpd(@NotNull android.view.View view) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "");
        android.view.View viewFindViewById = view.findViewById(C13754dXa.ActionBar.playFromMediaId);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "");
        this.EZpvd = (OKReminder) viewFindViewById;
    }
}
