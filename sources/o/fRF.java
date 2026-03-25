package o;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import o.fDP;
import o.fRF;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class fRF implements fDP {
    public final Function1<C17420fEr, Unit> AEQbTJ;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Function1<C17420fEr, Unit> KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super o.fEr, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public fRF(@NotNull Function1<? super C17420fEr, Unit> function1) {
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
        C16874esE c16874esECopydefault = C16874esE.copydefault(android.view.LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c16874esECopydefault, "");
        return new Activity(c16874esECopydefault);
    }

    @Override // o.fDP
    public void OLrzqt(@NotNull RecyclerView.ViewHolder viewHolder, @NotNull java.lang.Object obj, int i) {
        Intrinsics.checkNotNullParameter(viewHolder, "");
        Intrinsics.checkNotNullParameter(obj, "");
        Activity activity = (Activity) viewHolder;
        activity.KWHzl((C17420fEr) obj);
        android.view.View view = activity.itemView;
        view.setOnClickListener(new TaskDescription(view, 1000L, this, obj));
    }

    public static final class Activity extends RecyclerView.ViewHolder {
        public final C16874esE copydefault;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Activity(@NotNull C16874esE c16874esE) {
            super(c16874esE.getRoot());
            Intrinsics.checkNotNullParameter(c16874esE, "");
            this.copydefault = c16874esE;
        }

        public final void KWHzl(@NotNull C17420fEr c17420fEr) {
            Intrinsics.checkNotNullParameter(c17420fEr, "");
            C16874esE c16874esE = this.copydefault;
            AppCompatImageView appCompatImageView = c16874esE.OLrzqt;
            Intrinsics.checkNotNullExpressionValue(appCompatImageView, "");
            C14725dqq.copydefault(appCompatImageView, c17420fEr.AEQbTJ(), C13754dXa.Activity.DGUQLI, new Function1() { // from class: o.fRH
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return fRF.Activity.AEQbTJ((C5335Nt) obj);
                }
            }, 32.0f);
            c16874esE.KWHzl.setText(c17420fEr.KWHzl());
            AppCompatTextView appCompatTextView = c16874esE.AEQbTJ;
            Intrinsics.checkNotNullExpressionValue(appCompatTextView, "");
            java.lang.CharSequence charSequenceCopydefault = c17420fEr.copydefault();
            appCompatTextView.setVisibility((charSequenceCopydefault == null || charSequenceCopydefault.length() == 0) ? 8 : 0);
            if (c17420fEr.copydefault() != null) {
                c16874esE.AEQbTJ.setText(android.text.TextUtils.concat(this.itemView.getContext().getString(C13754dXa.FragmentManager.Rstyle), c17420fEr.copydefault()));
            } else {
                c16874esE.AEQbTJ.setText("");
            }
            C17927fXl.KWHzl.OLrzqt(c17420fEr.OLrzqt(), c16874esE.copydefault, false, new android.widget.TextView[0]);
            AppCompatImageView appCompatImageView2 = c16874esE.AhwBna;
            Intrinsics.checkNotNullExpressionValue(appCompatImageView2, "");
            appCompatImageView2.setVisibility(c17420fEr.AYXKKw() ? 0 : 8);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit AEQbTJ(C5335Nt c5335Nt) {
            Intrinsics.checkNotNullParameter(c5335Nt, "");
            c5335Nt.EZpvd((NN<android.graphics.Bitmap>) new C5417Qx(C55298xhM.dp2px$default(4.0f, null, 1, null)));
            return Unit.INSTANCE;
        }
    }

    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ java.lang.Object OLrzqt;
        public final /* synthetic */ fRF copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, fRF frf, java.lang.Object obj) {
            this.EZpvd = view;
            this.AEQbTJ = j;
            this.copydefault = frf;
            this.OLrzqt = obj;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r7v5, resolved type: kotlin.jvm.functions.Function1<o.fEr, kotlin.Unit> */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.AEQbTJ || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                this.copydefault.KWHzl().invoke(this.OLrzqt);
            }
        }
    }
}
