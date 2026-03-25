package o;

import android.graphics.drawable.ColorDrawable;
import com.okinc.core.widget.tipswindow.AnchorPopupWindow;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public final class tUM extends AnchorPopupWindow {
    public final InterfaceC56387yDm AEQbTJ;
    public final java.lang.String EZpvd;
    public final android.content.Context valueOf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tUM(@NotNull android.content.Context context, @NotNull java.lang.String str) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.valueOf = context;
        this.EZpvd = str;
        this.AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.tUK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return tUM.OLrzqt(this.AEQbTJ);
            }
        });
    }

    public final C46249tNi EZpvd() {
        return (C46249tNi) this.AEQbTJ.getValue();
    }

    public static final C46249tNi OLrzqt(tUM tum) {
        return C46249tNi.KWHzl(android.view.LayoutInflater.from(tum.valueOf));
    }

    public final void KWHzl(@NotNull android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        EZpvd().OLrzqt.setText(this.EZpvd);
        setContentView(EZpvd().getRoot());
        setWidth(-2);
        setHeight(-2);
        setFocusable(true);
        setBackgroundDrawable(new ColorDrawable(0));
        KWHzl(view, AnchorPopupWindow.Style.Gray, AnchorPopupWindow.VerticalPosition.BELOW, AnchorPopupWindow.HorizontalPosition.CENTER);
    }
}
