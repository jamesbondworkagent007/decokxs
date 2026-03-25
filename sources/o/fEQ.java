package o;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.business.defi.wallet.mine.search.data.model.WalletSearchRequest;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import o.fDP;
import o.fEQ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class fEQ implements fDP {
    public final Function1<C17420fEr, Unit> EZpvd;
    public java.lang.String OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.OLrzqt = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Function1<C17420fEr, Unit> copydefault() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super o.fEr, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public fEQ(@NotNull Function1<? super C17420fEr, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.EZpvd = function1;
        this.OLrzqt = "";
    }

    @Override // o.fDP
    public void AEQbTJ(@NotNull RecyclerView.ViewHolder viewHolder) {
        fDP.Activity.copydefault(this, viewHolder);
    }

    @Override // o.fDP
    public RecyclerView.ViewHolder AEQbTJ(@NotNull android.view.ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        C16821erE c16821erEOLrzqt = C16821erE.OLrzqt(android.view.LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c16821erEOLrzqt, "");
        return new StateListAnimator(c16821erEOLrzqt);
    }

    @Override // o.fDP
    public void OLrzqt(@NotNull RecyclerView.ViewHolder viewHolder, @NotNull java.lang.Object obj, int i) {
        Intrinsics.checkNotNullParameter(viewHolder, "");
        Intrinsics.checkNotNullParameter(obj, "");
        StateListAnimator stateListAnimator = (StateListAnimator) viewHolder;
        stateListAnimator.OLrzqt((C17420fEr) obj, this.OLrzqt);
        android.view.View view = stateListAnimator.itemView;
        view.setOnClickListener(new Activity(view, 1000L, this, obj));
    }

    public static final class StateListAnimator extends RecyclerView.ViewHolder {
        public final C16821erE OLrzqt;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StateListAnimator(@NotNull C16821erE c16821erE) {
            super(c16821erE.getRoot());
            Intrinsics.checkNotNullParameter(c16821erE, "");
            this.OLrzqt = c16821erE;
        }

        public final void OLrzqt(@NotNull C17420fEr c17420fEr, @NotNull java.lang.String str) {
            java.lang.String strCopydefault;
            Intrinsics.checkNotNullParameter(c17420fEr, "");
            Intrinsics.checkNotNullParameter(str, "");
            C16821erE c16821erE = this.OLrzqt;
            AppCompatImageView appCompatImageView = c16821erE.OLrzqt;
            Intrinsics.checkNotNullExpressionValue(appCompatImageView, "");
            C14725dqq.copydefault(appCompatImageView, c17420fEr.AEQbTJ(), C13754dXa.Activity.fJNWhG, new Function1() { // from class: o.fER
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return fEQ.StateListAnimator.copydefault((C5335Nt) obj);
                }
            }, 32.0f);
            c16821erE.EZpvd.setText(c17420fEr.KWHzl());
            AppCompatTextView appCompatTextView = c16821erE.AEQbTJ;
            Intrinsics.checkNotNullExpressionValue(appCompatTextView, "");
            java.lang.CharSequence charSequenceCopydefault = c17420fEr.copydefault();
            appCompatTextView.setVisibility((charSequenceCopydefault == null || charSequenceCopydefault.length() == 0) ? 8 : 0);
            if (c17420fEr.copydefault() != null) {
                if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) c17420fEr.copydefault().toString())) {
                    strCopydefault = C33069mpW.copydefault(C13754dXa.FragmentManager.setMessage, C56424yEw.AYXKKw(C56390yDp.OLrzqt(WalletSearchRequest.SEARCH_SOURCE_ADDRESS, "")));
                } else {
                    strCopydefault = C33069mpW.copydefault(C13754dXa.FragmentManager.ActionBar, C56424yEw.AYXKKw(C56390yDp.OLrzqt(WalletSearchRequest.SEARCH_SOURCE_ADDRESS, "")));
                }
                c16821erE.AEQbTJ.setText(android.text.TextUtils.concat(strCopydefault, c17420fEr.copydefault()));
            } else {
                c16821erE.AEQbTJ.setText("");
            }
            C17927fXl.KWHzl.OLrzqt(c17420fEr.OLrzqt(), c16821erE.copydefault, false, new android.widget.TextView[0]);
            AppCompatImageView appCompatImageView2 = c16821erE.gEmmrt;
            Intrinsics.checkNotNullExpressionValue(appCompatImageView2, "");
            appCompatImageView2.setVisibility(c17420fEr.AYXKKw() ? 0 : 8);
        }

        public static final Unit copydefault(C5335Nt c5335Nt) {
            Intrinsics.checkNotNullParameter(c5335Nt, "");
            c5335Nt.EZpvd((NN<android.graphics.Bitmap>) new C5417Qx(C55298xhM.dp2px$default(4.0f, null, 1, null)));
            return Unit.INSTANCE;
        }
    }

    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ fEQ AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ java.lang.Object KWHzl;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, fEQ feq, java.lang.Object obj) {
            this.copydefault = view;
            this.EZpvd = j;
            this.AEQbTJ = feq;
            this.KWHzl = obj;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r7v5, resolved type: kotlin.jvm.functions.Function1<o.fEr, kotlin.Unit> */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.EZpvd || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                this.AEQbTJ.copydefault().invoke(this.KWHzl);
            }
        }
    }
}
