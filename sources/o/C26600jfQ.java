package o;

import androidx.recyclerview.widget.AsyncListDiffer;
import com.okinc.business.invest_biz.ui.screens.token_selection.model.TokenSelectionAction;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jfQ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C26600jfQ extends C43316rmw {
    public final AsyncListDiffer<C26608jfY> EZpvd;

    public C26600jfQ(@NotNull TokenSelectionAction tokenSelectionAction, @NotNull Function1<? super C26608jfY, Unit> function1) {
        Intrinsics.checkNotNullParameter(tokenSelectionAction, "");
        Intrinsics.checkNotNullParameter(function1, "");
        register(C26608jfY.class, new C26607jfX(tokenSelectionAction, function1));
        this.EZpvd = new AsyncListDiffer<>(this, C26599jfP.KWHzl);
    }

    public final void EZpvd(@NotNull java.util.List<C26608jfY> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.EZpvd.submitList(list, new java.lang.Runnable() { // from class: o.jfN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C26600jfQ.EZpvd(this.copydefault);
            }
        });
    }

    public static final void EZpvd(C26600jfQ c26600jfQ) {
        super.setItems(c26600jfQ.EZpvd.getCurrentList());
    }
}
