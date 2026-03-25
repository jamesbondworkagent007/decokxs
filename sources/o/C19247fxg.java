package o;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fxg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C19247fxg extends android.widget.LinearLayout {
    public wZP EZpvd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19247fxg(@NotNull android.content.Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "");
        AEQbTJ(context);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19247fxg(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        AEQbTJ(context);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19247fxg(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        AEQbTJ(context);
    }

    public final void AEQbTJ(android.content.Context context) {
        this.EZpvd = wZP.OLrzqt(android.view.LayoutInflater.from(context), this, true);
    }

    public final void copydefault() {
        wZP wzp = this.EZpvd;
        if (wzp != null) {
            wzp.EZpvd.setSubTitle((java.lang.CharSequence) C33070mpX.AYXKKw(C13754dXa.FragmentManager.MediaSessionCompatMediaSessionImplBase));
            wzp.EZpvd.setEmptyTypeImage(7);
        }
    }

    public final void EZpvd(@NotNull final Function0<Unit> function0) {
        C55173xeu c55173xeu;
        Intrinsics.checkNotNullParameter(function0, "");
        wZP wzp = this.EZpvd;
        if (wzp == null || (c55173xeu = wzp.EZpvd) == null) {
            return;
        }
        c55173xeu.setSubTitle((java.lang.CharSequence) C33070mpX.AYXKKw(C13754dXa.FragmentManager.hasStableIds));
        c55173xeu.setEmptyTypeImage(8);
        c55173xeu.setRetry(C33070mpX.AYXKKw(C13754dXa.FragmentManager.getItemId));
        c55173xeu.setRetryClickListener(new View.OnClickListener() { // from class: o.fxm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C19247fxg.AEQbTJ(function0, view);
            }
        });
    }

    public static final void AEQbTJ(Function0 function0, android.view.View view) {
        function0.invoke();
    }
}
