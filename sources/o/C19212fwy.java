package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fwy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C19212fwy extends RecyclerView.ViewHolder {
    public final C16917esv AEQbTJ;
    public final Function1<C18983fsh, Unit> EZpvd;

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super o.fsh, kotlin.Unit> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C19212fwy(@NotNull C16917esv c16917esv, @NotNull Function1<? super C18983fsh, Unit> function1) {
        super(c16917esv.getRoot());
        Intrinsics.checkNotNullParameter(c16917esv, "");
        Intrinsics.checkNotNullParameter(function1, "");
        this.AEQbTJ = c16917esv;
        this.EZpvd = function1;
    }

    private final android.content.Context KWHzl() {
        android.content.Context context = this.AEQbTJ.getRoot().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        return context;
    }

    public final void EZpvd(@NotNull C18983fsh c18983fsh) {
        Intrinsics.checkNotNullParameter(c18983fsh, "");
        try {
            C16917esv c16917esv = this.AEQbTJ;
            android.widget.TextView textView = c16917esv.OLrzqt;
            android.content.Context contextKWHzl = KWHzl();
            int i = C13754dXa.FragmentManager.WorkerThread;
            android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder();
            android.text.style.ForegroundColorSpan foregroundColorSpan = new android.text.style.ForegroundColorSpan(C33070mpX.copydefault(C52761wXj.Activity.fdOvFl));
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append((java.lang.CharSequence) c18983fsh.EZpvd());
            spannableStringBuilder.setSpan(foregroundColorSpan, length, spannableStringBuilder.length(), 17);
            Unit unit = Unit.INSTANCE;
            android.text.SpannableString spannableStringValueOf = android.text.SpannableString.valueOf(new android.text.SpannedString(spannableStringBuilder));
            Intrinsics.checkNotNullExpressionValue(spannableStringValueOf, "");
            textView.setText(C33069mpW.copydefault(contextKWHzl, i, (java.util.Map<java.lang.String, ? extends android.text.Spannable>) C56423yEv.EZpvd(C56390yDp.OLrzqt("site", spannableStringValueOf))));
            ConstraintLayout root = c16917esv.getRoot();
            root.setOnClickListener(new StateListAnimator(root, 1000L, this, c18983fsh));
        } catch (java.lang.Exception e) {
            C10856bwO.copydefault("DAppSearchUrlResultViewHolder", 0, "bind", e);
        }
    }

    /* JADX INFO: renamed from: o.fwy$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ C19212fwy KWHzl;
        public final /* synthetic */ C18983fsh OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, C19212fwy c19212fwy, C18983fsh c18983fsh) {
            this.AEQbTJ = view;
            this.EZpvd = j;
            this.KWHzl = c19212fwy;
            this.OLrzqt = c18983fsh;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.EZpvd || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                this.KWHzl.EZpvd.invoke(this.OLrzqt);
            }
        }
    }
}
