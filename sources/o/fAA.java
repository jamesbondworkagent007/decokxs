package o;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import o.fAA;
import o.fDP;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final class fAA implements fDP {
    public final Function2<C19323fzC, java.lang.Integer, Unit> OLrzqt;

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function2<? super o.fzC, ? super java.lang.Integer, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public fAA(@NotNull Function2<? super C19323fzC, ? super java.lang.Integer, Unit> function2) {
        Intrinsics.checkNotNullParameter(function2, "");
        this.OLrzqt = function2;
    }

    @Override // o.fDP
    public void AEQbTJ(@NotNull RecyclerView.ViewHolder viewHolder) {
        fDP.Activity.copydefault(this, viewHolder);
    }

    @Override // o.fDP
    public RecyclerView.ViewHolder AEQbTJ(@NotNull android.view.ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        android.view.View viewInflate = android.view.LayoutInflater.from(viewGroup.getContext()).inflate(C13754dXa.TaskDescription.siEkQe, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "");
        return new ActionBar(viewInflate);
    }

    @Override // o.fDP
    public void OLrzqt(@NotNull RecyclerView.ViewHolder viewHolder, @NotNull final java.lang.Object obj, final int i) {
        Intrinsics.checkNotNullParameter(viewHolder, "");
        Intrinsics.checkNotNullParameter(obj, "");
        ((ActionBar) viewHolder).AEQbTJ((C19323fzC) obj);
        viewHolder.itemView.setOnClickListener(new View.OnClickListener() { // from class: o.fAy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                fAA.KWHzl(this.AEQbTJ, obj, i, view);
            }
        });
    }

    public static final void KWHzl(fAA faa, java.lang.Object obj, int i, android.view.View view) {
        faa.OLrzqt.invoke(obj, java.lang.Integer.valueOf(i));
    }

    public static final class ActionBar extends RecyclerView.ViewHolder {
        public final InterfaceC56387yDm AEQbTJ;
        public final android.widget.TextView KWHzl;
        public final wYC copydefault;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ActionBar(@NotNull android.view.View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "");
            this.KWHzl = (android.widget.TextView) view.findViewById(C13754dXa.ActionBar.setEnabledChangedCallbackactivity_release);
            this.copydefault = (wYC) view.findViewById(C13754dXa.ActionBar.DPVBvL);
            this.AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.fAC
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return fAA.ActionBar.OLrzqt();
                }
            });
        }

        public static final C17412fEj OLrzqt() {
            return new C17412fEj();
        }

        public final void AEQbTJ(@NotNull C19323fzC c19323fzC) {
            Intrinsics.checkNotNullParameter(c19323fzC, "");
            this.KWHzl.setText(c19323fzC.KWHzl().AEQbTJ());
            if (c19323fzC.copydefault()) {
                this.copydefault.setRotation(c19323fzC.EZpvd() ? 0.0f : 180.0f);
                this.copydefault.setVisibility(0);
            } else {
                this.copydefault.setVisibility(8);
            }
        }
    }
}
