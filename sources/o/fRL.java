package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.business.defi.biz.constant.WalletType;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import o.fDP;
import o.fRL;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class fRL implements fDP {
    public final Function1<C17740fQn, Unit> AEQbTJ;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Function1<C17740fQn, Unit> OLrzqt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super o.fQn, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public fRL(@NotNull Function1<? super C17740fQn, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.AEQbTJ = function1;
    }

    @Override // o.fDP
    public void AEQbTJ(@NotNull RecyclerView.ViewHolder viewHolder) {
        fDP.Activity.copydefault(this, viewHolder);
    }

    @Override // o.fDP
    public RecyclerView.ViewHolder AEQbTJ(@NotNull android.view.ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        C16914ess c16914essKWHzl = C16914ess.KWHzl(android.view.LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c16914essKWHzl, "");
        return new StateListAnimator(this, c16914essKWHzl);
    }

    @Override // o.fDP
    public void OLrzqt(@NotNull RecyclerView.ViewHolder viewHolder, @NotNull java.lang.Object obj, int i) {
        Intrinsics.checkNotNullParameter(viewHolder, "");
        Intrinsics.checkNotNullParameter(obj, "");
        StateListAnimator stateListAnimator = viewHolder instanceof StateListAnimator ? (StateListAnimator) viewHolder : null;
        if (stateListAnimator != null) {
            stateListAnimator.KWHzl((C17740fQn) obj);
        }
    }

    public final class StateListAnimator extends RecyclerView.ViewHolder {
        public final C16914ess KWHzl;
        public final /* synthetic */ fRL copydefault;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StateListAnimator(@NotNull fRL frl, C16914ess c16914ess) {
            super(c16914ess.getRoot());
            Intrinsics.checkNotNullParameter(c16914ess, "");
            this.copydefault = frl;
            this.KWHzl = c16914ess;
        }

        public final void KWHzl(@NotNull final C17740fQn c17740fQn) {
            Intrinsics.checkNotNullParameter(c17740fQn, "");
            this.KWHzl.OLrzqt.setText(c17740fQn.KWHzl().AuCTel());
            if (c17740fQn.KWHzl().zLjUOn()) {
                this.KWHzl.AEQbTJ.setVisibility(0);
                this.KWHzl.AEQbTJ.setText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.setOwners));
                this.KWHzl.AEQbTJ.setOKDSStyle(12);
            } else {
                this.KWHzl.AEQbTJ.setVisibility(8);
            }
            if (c17740fQn.KWHzl().fJNWhG() == WalletType.HDWallet) {
                if (!c17740fQn.KWHzl().AEQbTJ()) {
                    this.KWHzl.AEQbTJ.setVisibility(0);
                    this.KWHzl.AEQbTJ.setOKDSStyle(9);
                    this.KWHzl.AEQbTJ.setText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.getMetadata));
                } else {
                    this.KWHzl.AEQbTJ.setVisibility(8);
                }
            }
            java.lang.String strValueOf = c17740fQn.valueOf();
            if (strValueOf != null) {
                this.KWHzl.KWHzl.setVisibility(0);
                this.KWHzl.KWHzl.setText(strValueOf);
            } else {
                this.KWHzl.KWHzl.setVisibility(8);
            }
            if (c17740fQn.EZpvd()) {
                this.KWHzl.copydefault.setVisibility(0);
                ConstraintLayout root = this.KWHzl.getRoot();
                final fRL frl = this.copydefault;
                root.setOnClickListener(new View.OnClickListener() { // from class: o.fRM
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // android.view.View.OnClickListener
                    public final void onClick(android.view.View view) {
                        fRL.StateListAnimator.copydefault(frl, c17740fQn, view);
                    }
                });
                this.KWHzl.copydefault.setRotation(c17740fQn.djBIcL() ? 0.0f : 180.0f);
                return;
            }
            this.KWHzl.copydefault.setVisibility(8);
        }

        public static final void copydefault(fRL frl, C17740fQn c17740fQn, android.view.View view) {
            frl.OLrzqt().invoke(c17740fQn);
        }
    }
}
