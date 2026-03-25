package o;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.im.imui.privacy.SecurityType;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nxc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C35557nxc extends RecyclerView.ViewHolder {
    public final AbstractC33939nLl OLrzqt;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C35557nxc(@NotNull AbstractC33939nLl abstractC33939nLl) {
        super(abstractC33939nLl.getRoot());
        Intrinsics.checkNotNullParameter(abstractC33939nLl, "");
        this.OLrzqt = abstractC33939nLl;
    }

    public final void EZpvd(@NotNull final C37201opP c37201opP, @NotNull final Function2<? super SecurityType, ? super java.lang.Boolean, Unit> function2) {
        Intrinsics.checkNotNullParameter(c37201opP, "");
        Intrinsics.checkNotNullParameter(function2, "");
        this.OLrzqt.copydefault(c37201opP);
        android.widget.TextView textView = this.OLrzqt.EZpvd;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        textView.setVisibility(C33129mqd.OLrzqt((java.lang.CharSequence) c37201opP.AEQbTJ()) ? 0 : 8);
        this.OLrzqt.AEQbTJ.setOnClickListener(new View.OnClickListener() { // from class: o.nxa
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C35557nxc.copydefault(function2, c37201opP, view);
            }
        });
    }

    public static final void copydefault(Function2 function2, C37201opP c37201opP, android.view.View view) {
        function2.invoke(c37201opP.KWHzl(), java.lang.Boolean.valueOf(c37201opP.EZpvd()));
    }
}
