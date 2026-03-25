package o;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ibr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C24335ibr extends android.widget.LinearLayout {
    public C55173xeu OLrzqt;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C24335ibr(@NotNull android.content.Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "");
        KWHzl(context);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C24335ibr(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        KWHzl(context);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C24335ibr(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        KWHzl(context);
    }

    public final void KWHzl(android.content.Context context) {
        setOrientation(1);
        setBackgroundColor(C25382ivf.copydefault(C52761wXj.Activity.DGgkXd, context));
        setGravity(1);
        android.view.LayoutInflater.from(context).inflate(C23274hvD.Activity.RZMhtF, this);
        C55173xeu c55173xeu = (C55173xeu) findViewById(C23274hvD.Application.f1058api);
        this.OLrzqt = c55173xeu;
        if (c55173xeu != null) {
            c55173xeu.setEmptyTypeImage(8);
        }
    }

    public final void setTitle(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C55173xeu c55173xeu = this.OLrzqt;
        if (c55173xeu != null) {
            c55173xeu.setTitle(str);
        }
    }

    public final void setSubTitle(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C55173xeu c55173xeu = this.OLrzqt;
        if (c55173xeu != null) {
            c55173xeu.setSubTitle((java.lang.CharSequence) str);
        }
    }

    public final void setButtonText(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C55173xeu c55173xeu = this.OLrzqt;
        if (c55173xeu != null) {
            c55173xeu.setRetry(str);
        }
    }

    public final void setRetryClick(@NotNull final Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        C55173xeu c55173xeu = this.OLrzqt;
        if (c55173xeu != null) {
            c55173xeu.setRetryClickListener(new View.OnClickListener() { // from class: o.ibq
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    function0.invoke();
                }
            });
        }
    }

    public final void setEmptyType(int i) {
        C55173xeu c55173xeu = this.OLrzqt;
        if (c55173xeu != null) {
            c55173xeu.setEmptyTypeImage(i);
        }
    }

    public final void setRetryClickVisible(boolean z) {
        C52794wYp c52794wYpAEQbTJ;
        C55173xeu c55173xeu = this.OLrzqt;
        if (c55173xeu == null || (c52794wYpAEQbTJ = c55173xeu.AEQbTJ()) == null) {
            return;
        }
        c52794wYpAEQbTJ.setVisibility(z ? 0 : 8);
    }
}
