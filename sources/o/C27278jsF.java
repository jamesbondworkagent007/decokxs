package o;

import android.view.View;
import kotlin.jvm.internal.Intrinsics;
import o.C25493ixk;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jsF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C27278jsF extends android.widget.FrameLayout {
    public android.widget.ImageView AEQbTJ;
    public AbstractC27276jsD KWHzl;
    public android.widget.TextView OLrzqt;

    /* JADX INFO: renamed from: o.jsF$Application */
    public interface Application {
        void KWHzl(@NotNull C27278jsF c27278jsF);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AbstractC27276jsD KWHzl() {
        return this.KWHzl;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C27278jsF(@NotNull android.content.Context context) {
        this(context, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C27278jsF(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27278jsF(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        KWHzl(context);
    }

    public final void KWHzl(android.content.Context context) {
        android.view.View.inflate(context, C25493ixk.Activity.DPHNDa, this);
        this.OLrzqt = (android.widget.TextView) findViewById(C25493ixk.ActionBar.ICustomTabsCallbackStubProxy);
        this.AEQbTJ = (android.widget.ImageView) findViewById(C25493ixk.ActionBar.NRYds);
    }

    public final void setChip(@NotNull AbstractC27276jsD abstractC27276jsD) {
        Intrinsics.checkNotNullParameter(abstractC27276jsD, "");
        this.KWHzl = abstractC27276jsD;
        android.widget.TextView textView = this.OLrzqt;
        if (textView != null) {
            textView.setText(abstractC27276jsD.KWHzl());
        }
        setSelected(abstractC27276jsD.copydefault());
    }

    public final void setOnDeleteClicked(@NotNull final Application application) {
        Intrinsics.checkNotNullParameter(application, "");
        android.widget.ImageView imageView = this.AEQbTJ;
        if (imageView != null) {
            imageView.setOnClickListener(new View.OnClickListener() { // from class: o.jsE
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    application.KWHzl(this);
                }
            });
        }
    }
}
