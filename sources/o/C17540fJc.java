package o;

import android.graphics.drawable.GradientDrawable;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import o.C17540fJc;
import o.C52761wXj;
import o.fDP;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fJc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C17540fJc implements fDP {
    public final Function1<AbstractC12782ctV, Unit> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Function1<AbstractC12782ctV, Unit> OLrzqt() {
        return this.copydefault;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super o.ctV, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public C17540fJc(@NotNull Function1<? super AbstractC12782ctV, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.copydefault = function1;
    }

    @Override // o.fDP
    public void AEQbTJ(@NotNull RecyclerView.ViewHolder viewHolder) {
        fDP.Activity.copydefault(this, viewHolder);
    }

    @Override // o.fDP
    public RecyclerView.ViewHolder AEQbTJ(@NotNull android.view.ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        android.view.View viewInflate = android.view.LayoutInflater.from(viewGroup.getContext()).inflate(C13754dXa.TaskDescription.idLUrz, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "");
        return new ActionBar(viewInflate);
    }

    @Override // o.fDP
    public void OLrzqt(@NotNull RecyclerView.ViewHolder viewHolder, @NotNull java.lang.Object obj, int i) {
        Intrinsics.checkNotNullParameter(viewHolder, "");
        Intrinsics.checkNotNullParameter(obj, "");
        ActionBar actionBar = (ActionBar) viewHolder;
        actionBar.AEQbTJ((AbstractC12782ctV) obj);
        ConstraintLayout constraintLayoutEZpvd = actionBar.EZpvd();
        constraintLayoutEZpvd.setOnClickListener(new TaskDescription(constraintLayoutEZpvd, 1000L, this, obj));
    }

    /* JADX INFO: renamed from: o.fJc$ActionBar */
    /* JADX INFO: loaded from: classes18.dex */
    public static final class ActionBar extends RecyclerView.ViewHolder {
        public final AppCompatImageView AEQbTJ;
        public final android.widget.TextView EZpvd;
        public final android.widget.TextView KWHzl;
        public final ConstraintLayout OLrzqt;
        public final android.widget.TextView copydefault;
        public final InterfaceC56387yDm djBIcL;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ConstraintLayout EZpvd() {
            return this.OLrzqt;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ActionBar(@NotNull android.view.View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "");
            this.djBIcL = C56392yDr.copydefault(new Function0() { // from class: o.fJd
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C17540fJc.ActionBar.OLrzqt();
                }
            });
            android.view.View viewFindViewById = view.findViewById(C13754dXa.ActionBar.DMb);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "");
            this.OLrzqt = (ConstraintLayout) viewFindViewById;
            this.AEQbTJ = (AppCompatImageView) view.findViewById(C13754dXa.ActionBar.ejfBZ);
            this.copydefault = (android.widget.TextView) view.findViewById(C13754dXa.ActionBar.uzCIH);
            this.KWHzl = (android.widget.TextView) view.findViewById(C13754dXa.ActionBar.AuCTel);
            this.EZpvd = (android.widget.TextView) view.findViewById(C13754dXa.ActionBar.getVisualMimeTypeactivity_release);
        }

        private final C17412fEj copydefault() {
            return (C17412fEj) this.djBIcL.getValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final C17412fEj OLrzqt() {
            return new C17412fEj();
        }

        public final void AEQbTJ(@NotNull AbstractC12782ctV abstractC12782ctV) {
            Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
            this.copydefault.setText(copydefault().copydefault(abstractC12782ctV));
            AppCompatImageView appCompatImageView = this.AEQbTJ;
            Intrinsics.checkNotNullExpressionValue(appCompatImageView, "");
            C14725dqq.copydefault(appCompatImageView, abstractC12782ctV.AEQbTJ(), C13754dXa.Activity.fJNWhG, new Function1() { // from class: o.fJg
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C17540fJc.ActionBar.OLrzqt((C5335Nt) obj);
                }
            }, 32.0f);
            this.KWHzl.setText(copydefault().OLrzqt(abstractC12782ctV));
            android.widget.TextView textView = this.EZpvd;
            if (abstractC12782ctV.DCUTEIdCUTEI()) {
                textView.setVisibility(0);
                if (abstractC12782ctV.fERRXa()) {
                    textView.setText(textView.getContext().getString(C13754dXa.FragmentManager.BackHandlerKtBackHandler2invokeinlinedonDispose1));
                    textView.setCompoundDrawablePadding(C55298xhM.dpInt$default(4.0f, (android.content.Context) null, 1, (java.lang.Object) null));
                    textView.setCompoundDrawablesRelative(null, null, null, null);
                    textView.setTextColor(ContextCompat.getColor(textView.getContext(), C52761wXj.Activity.unregister));
                    return;
                }
                textView.setText(textView.getContext().getString(C13754dXa.FragmentManager.ComponentActivityKt));
                textView.setCompoundDrawablePadding(C55298xhM.dpInt$default(4.0f, (android.content.Context) null, 1, (java.lang.Object) null));
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setCornerRadius(C55298xhM.dp2pxFloat$default(6.0f, null, 1, null));
                gradientDrawable.setColor(ContextCompat.getColor(textView.getContext(), C52761wXj.Activity.DQzvGN));
                gradientDrawable.setBounds(0, 0, C55298xhM.dpInt$default(6.0f, (android.content.Context) null, 1, (java.lang.Object) null), C55298xhM.dpInt$default(6.0f, (android.content.Context) null, 1, (java.lang.Object) null));
                textView.setCompoundDrawablesRelative(gradientDrawable, null, null, null);
                textView.setTextColor(ContextCompat.getColor(textView.getContext(), C52761wXj.Activity.DQzvGN));
                return;
            }
            textView.setText("");
            textView.setVisibility(8);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit OLrzqt(C5335Nt c5335Nt) {
            Intrinsics.checkNotNullParameter(c5335Nt, "");
            c5335Nt.EZpvd((NN<android.graphics.Bitmap>) new C5417Qx(C55298xhM.dp2px$default(4.0f, null, 1, null)));
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: o.fJc$TaskDescription */
    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ java.lang.Object EZpvd;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ C17540fJc copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, C17540fJc c17540fJc, java.lang.Object obj) {
            this.KWHzl = view;
            this.OLrzqt = j;
            this.copydefault = c17540fJc;
            this.EZpvd = obj;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r7v7, resolved type: kotlin.jvm.functions.Function1<o.ctV, kotlin.Unit> */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.OLrzqt || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                this.copydefault.OLrzqt().invoke(this.EZpvd);
            }
        }
    }
}
