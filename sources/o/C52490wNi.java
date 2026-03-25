package o;

import androidx.recyclerview.widget.RecyclerView;
import com.okinc.uilab.reminder.OKReminder;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wNi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C52490wNi extends RecyclerView.ViewHolder {
    public final android.widget.TextView EZpvd;
    public final OKReminder copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OKReminder AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final android.widget.TextView copydefault() {
        return this.EZpvd;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C52490wNi(@NotNull android.view.View view) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "");
        android.view.View viewFindViewById = view.findViewById(C48033uCm.Application.getOnBackPressedDispatcher);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "");
        this.EZpvd = (android.widget.TextView) viewFindViewById;
        android.view.View viewFindViewById2 = view.findViewById(C48033uCm.Application.getViewModelStore);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "");
        this.copydefault = (OKReminder) viewFindViewById2;
    }
}
