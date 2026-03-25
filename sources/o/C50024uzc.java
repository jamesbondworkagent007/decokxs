package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.uzc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C50024uzc extends android.text.style.ClickableSpan {
    public final android.content.Context EZpvd;
    public final java.lang.Integer KWHzl;
    public final Function0<Unit> OLrzqt;
    public final boolean copydefault;

    public C50024uzc(java.lang.Integer num, @NotNull android.content.Context context, boolean z, @NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(function0, "");
        this.KWHzl = num;
        this.EZpvd = context;
        this.copydefault = z;
        this.OLrzqt = function0;
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public void updateDrawState(@NotNull android.text.TextPaint textPaint) {
        Intrinsics.checkNotNullParameter(textPaint, "");
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(this.copydefault);
        java.lang.Integer num = this.KWHzl;
        if (num != null) {
            num.intValue();
            textPaint.setColor(this.EZpvd.getColor(this.KWHzl.intValue()));
        }
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(@NotNull android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        this.OLrzqt.invoke();
    }
}
