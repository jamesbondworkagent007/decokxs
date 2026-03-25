package o;

import android.widget.CompoundButton;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.iur, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C25341iur extends android.widget.LinearLayout {
    public boolean OLrzqt;
    public hFX copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setChecked(boolean z) {
        this.OLrzqt = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C25341iur(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C25341iur(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C25341iur(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C25341iur(@NotNull android.content.Context context) {
        this(context, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    public final void AEQbTJ(@NotNull java.lang.String str, java.lang.Boolean bool) {
        Intrinsics.checkNotNullParameter(str, "");
        if (getContext() == null) {
            return;
        }
        hFX hfxCopydefault = hFX.copydefault(android.view.LayoutInflater.from(getContext()), this, true);
        this.copydefault = hfxCopydefault;
        if (hfxCopydefault != null) {
            hfxCopydefault.EZpvd.setVisibility(Intrinsics.EZpvd(bool, java.lang.Boolean.TRUE) ? 0 : 8);
            hfxCopydefault.EZpvd.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: o.iuq
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(android.widget.CompoundButton compoundButton, boolean z) {
                    C25341iur.AEQbTJ(this.OLrzqt, compoundButton, z);
                }
            });
            hfxCopydefault.KWHzl.setText(str);
        }
    }

    public static final void AEQbTJ(C25341iur c25341iur, android.widget.CompoundButton compoundButton, boolean z) {
        c25341iur.OLrzqt = z;
    }
}
