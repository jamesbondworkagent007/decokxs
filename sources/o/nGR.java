package o;

import android.view.View;
import kotlin.jvm.internal.Intrinsics;
import o.C35399nuc;
import o.InterfaceC35897oHt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public abstract class nGR implements InterfaceC35897oHt<java.lang.Object> {
    public ActionBar EZpvd;
    public kotlin.Pair<java.lang.Float, java.lang.Float> copydefault;

    public interface ActionBar {
        void KWHzl(@NotNull nGE nge, @NotNull android.view.View view, @NotNull kotlin.Pair<java.lang.Float, java.lang.Float> pair);

        void copydefault(@NotNull nGE nge);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(kotlin.Pair<java.lang.Float, java.lang.Float> pair) {
        this.copydefault = pair;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final kotlin.Pair<java.lang.Float, java.lang.Float> OLrzqt() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(ActionBar actionBar) {
        this.EZpvd = actionBar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ActionBar copydefault() {
        return this.EZpvd;
    }

    @Override // o.InterfaceC35897oHt
    public void AEQbTJ(@NotNull C35895oHr c35895oHr, @NotNull java.lang.Object obj, @NotNull java.util.List<? extends java.lang.Object> list) {
        InterfaceC35897oHt.Application.AEQbTJ(this, c35895oHr, obj, list);
    }

    @Override // o.InterfaceC35897oHt
    public void AEQbTJ(@NotNull final C35895oHr c35895oHr, @NotNull final java.lang.Object obj, int i) {
        Intrinsics.checkNotNullParameter(c35895oHr, "");
        Intrinsics.checkNotNullParameter(obj, "");
        if (obj instanceof nGE) {
            android.view.View view = c35895oHr.itemView;
            view.setOnTouchListener(new View.OnTouchListener() { // from class: o.nGQ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(android.view.View view2, android.view.MotionEvent motionEvent) {
                    return nGR.OLrzqt(this.EZpvd, view2, motionEvent);
                }
            });
            view.setOnClickListener(new View.OnClickListener() { // from class: o.nGT
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view2) {
                    nGR.copydefault(this.AEQbTJ, obj, view2);
                }
            });
            view.setOnLongClickListener(new View.OnLongClickListener() { // from class: o.nGW
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(android.view.View view2) {
                    return nGR.KWHzl(this.EZpvd, obj, c35895oHr, view2);
                }
            });
        }
    }

    public static final boolean OLrzqt(nGR ngr, android.view.View view, android.view.MotionEvent motionEvent) {
        Intrinsics.checkNotNullParameter(motionEvent, "");
        ngr.copydefault = C56390yDp.OLrzqt(java.lang.Float.valueOf((int) motionEvent.getX()), java.lang.Float.valueOf((int) motionEvent.getY()));
        return false;
    }

    public static final void copydefault(nGR ngr, java.lang.Object obj, android.view.View view) {
        ActionBar actionBar = ngr.EZpvd;
        if (actionBar != null) {
            actionBar.copydefault((nGE) obj);
        }
    }

    public static final boolean KWHzl(nGR ngr, java.lang.Object obj, C35895oHr c35895oHr, android.view.View view) {
        ActionBar actionBar;
        kotlin.Pair<java.lang.Float, java.lang.Float> pair = ngr.copydefault;
        if (pair == null || (actionBar = ngr.EZpvd) == null) {
            return true;
        }
        android.view.View view2 = c35895oHr.itemView;
        Intrinsics.checkNotNullExpressionValue(view2, "");
        actionBar.KWHzl((nGE) obj, view2, pair);
        return true;
    }

    public final java.lang.String OLrzqt(@NotNull android.content.Context context, int i) {
        Intrinsics.checkNotNullParameter(context, "");
        if (i > 99) {
            java.lang.String string = context.getResources().getString(C35399nuc.LoaderManager.awiJhF);
            Intrinsics.copydefault((java.lang.Object) string);
            return string;
        }
        return java.lang.String.valueOf(i);
    }
}
