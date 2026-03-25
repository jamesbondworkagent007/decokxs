package o;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C13754dXa;
import o.dTH;
import o.fDP;
import o.fRE;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class fRE implements fDP {
    public final Function1<C17745fQs, Unit> AEQbTJ;
    public final Function1<C17745fQs, Unit> EZpvd;
    public final Function1<C17745fQs, Unit> copydefault;

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super o.fQs, kotlin.Unit> */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super o.fQs, kotlin.Unit> */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: kotlin.jvm.functions.Function1<? super o.fQs, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public fRE(@NotNull Function1<? super C17745fQs, Unit> function1, @NotNull Function1<? super C17745fQs, Unit> function12, @NotNull Function1<? super C17745fQs, Unit> function13) {
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function12, "");
        Intrinsics.checkNotNullParameter(function13, "");
        this.copydefault = function1;
        this.EZpvd = function12;
        this.AEQbTJ = function13;
    }

    @Override // o.fDP
    public void AEQbTJ(@NotNull RecyclerView.ViewHolder viewHolder) {
        fDP.Activity.copydefault(this, viewHolder);
    }

    @Override // o.fDP
    public RecyclerView.ViewHolder AEQbTJ(@NotNull android.view.ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        C16912esq c16912esqCopydefault = C16912esq.copydefault(android.view.LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c16912esqCopydefault, "");
        return new ActionBar(c16912esqCopydefault, this.EZpvd, this.AEQbTJ);
    }

    @Override // o.fDP
    public void OLrzqt(@NotNull RecyclerView.ViewHolder viewHolder, @NotNull java.lang.Object obj, int i) {
        Intrinsics.checkNotNullParameter(viewHolder, "");
        Intrinsics.checkNotNullParameter(obj, "");
        ActionBar actionBar = viewHolder instanceof ActionBar ? (ActionBar) viewHolder : null;
        if (actionBar != null) {
            C17745fQs c17745fQs = (C17745fQs) obj;
            actionBar.copydefault(c17745fQs);
            android.view.View view = actionBar.itemView;
            view.setOnClickListener(new Application(view, 1000L, c17745fQs, this));
        }
    }

    public static final class ActionBar extends RecyclerView.ViewHolder {
        public final C16912esq AEQbTJ;
        public final Function1<C17745fQs, Unit> EZpvd;
        public final Function1<C17745fQs, Unit> copydefault;

        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super o.fQs, kotlin.Unit> */
        /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: kotlin.jvm.functions.Function1<? super o.fQs, kotlin.Unit> */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public ActionBar(@NotNull C16912esq c16912esq, @NotNull Function1<? super C17745fQs, Unit> function1, @NotNull Function1<? super C17745fQs, Unit> function12) {
            super(c16912esq.getRoot());
            Intrinsics.checkNotNullParameter(c16912esq, "");
            Intrinsics.checkNotNullParameter(function1, "");
            Intrinsics.checkNotNullParameter(function12, "");
            this.AEQbTJ = c16912esq;
            this.copydefault = function1;
            this.EZpvd = function12;
        }

        public final void copydefault(@NotNull C17745fQs c17745fQs) {
            dTH fragmentManager;
            Intrinsics.checkNotNullParameter(c17745fQs, "");
            C16912esq c16912esq = this.AEQbTJ;
            AppCompatImageView appCompatImageView = c16912esq.KWHzl;
            Intrinsics.checkNotNullExpressionValue(appCompatImageView, "");
            C14725dqq.copydefault(appCompatImageView, c17745fQs.EZpvd(), C13754dXa.Activity.DGUQLI, new Function1() { // from class: o.fRD
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return fRE.ActionBar.copydefault((C5335Nt) obj);
                }
            }, 32.0f);
            c16912esq.EZpvd.setText(c17745fQs.djBIcL());
            C17927fXl c17927fXl = C17927fXl.KWHzl;
            if (c17745fQs.gEmmrt()) {
                fragmentManager = C17922fXg.OLrzqt(c17745fQs.DbNXlk());
            } else {
                fragmentManager = new dTH.FragmentManager(c17745fQs.DbNXlk().DbNXlk());
            }
            c17927fXl.OLrzqt(fragmentManager, this.AEQbTJ.djBIcL, false, c16912esq.EZpvd);
            C55251xgS c55251xgS = c16912esq.valueOf;
            Intrinsics.checkNotNullExpressionValue(c55251xgS, "");
            c55251xgS.setVisibility(8);
            AppCompatTextView appCompatTextView = c16912esq.OLrzqt;
            Intrinsics.checkNotNullExpressionValue(appCompatTextView, "");
            appCompatTextView.setVisibility(8);
            ConstraintLayout constraintLayout = c16912esq.AhwBna;
            Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
            constraintLayout.setVisibility(8);
            KWHzl(c16912esq, c17745fQs);
            AppCompatImageView appCompatImageView2 = c16912esq.AkhnZx;
            Intrinsics.checkNotNullExpressionValue(appCompatImageView2, "");
            appCompatImageView2.setVisibility(c17745fQs.valueOf() ? 0 : 8);
            c16912esq.copydefault.setText(c17745fQs.AhwBna());
            this.itemView.setAlpha(c17745fQs.isConnected() ? 1.0f : 0.6f);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit copydefault(C5335Nt c5335Nt) {
            Intrinsics.checkNotNullParameter(c5335Nt, "");
            c5335Nt.EZpvd((NN<android.graphics.Bitmap>) new C5417Qx(C55298xhM.dp2px$default(4.0f, null, 1, null)));
            return Unit.INSTANCE;
        }

        public final void KWHzl(C16912esq c16912esq, C17745fQs c17745fQs) {
            if (StringsKt__StringsKt.fARcdN((java.lang.CharSequence) c17745fQs.OLrzqt())) {
                return;
            }
            if (c17745fQs.values()) {
                android.view.View view = c16912esq.gEmmrt;
                Intrinsics.checkNotNullExpressionValue(view, "");
                view.setVisibility(0);
                AppCompatImageView appCompatImageView = c16912esq.isConnected;
                Intrinsics.checkNotNullExpressionValue(appCompatImageView, "");
                appCompatImageView.setVisibility(0);
                c16912esq.isConnected.setEnabled(c17745fQs.isConnected());
                AppCompatImageView appCompatImageView2 = c16912esq.isConnected;
                appCompatImageView2.setOnClickListener(new TaskDescription(appCompatImageView2, 1000L, c17745fQs, this));
            } else {
                android.view.View view2 = c16912esq.gEmmrt;
                Intrinsics.checkNotNullExpressionValue(view2, "");
                view2.setVisibility(8);
                AppCompatImageView appCompatImageView3 = c16912esq.isConnected;
                Intrinsics.checkNotNullExpressionValue(appCompatImageView3, "");
                appCompatImageView3.setVisibility(8);
            }
            AppCompatImageView appCompatImageView4 = c16912esq.AYXKKw;
            Intrinsics.checkNotNullExpressionValue(appCompatImageView4, "");
            appCompatImageView4.setVisibility(c17745fQs.isConnected() ? 0 : 8);
            ConstraintLayout constraintLayout = c16912esq.AhwBna;
            Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
            constraintLayout.setVisibility(0);
            c16912esq.AEQbTJ.setText(c17745fQs.OLrzqt());
            AppCompatTextView appCompatTextView = c16912esq.AEQbTJ;
            appCompatTextView.setOnClickListener(new ViewOnClickListenerC0844ActionBar(appCompatTextView, 1000L, c17745fQs, this));
            AppCompatImageView appCompatImageView5 = c16912esq.AYXKKw;
            appCompatImageView5.setOnClickListener(new Activity(appCompatImageView5, 1000L, c17745fQs, this));
        }

        /* JADX INFO: renamed from: o.fRE$ActionBar$ActionBar, reason: collision with other inner class name */
        public static final class ViewOnClickListenerC0844ActionBar implements View.OnClickListener {
            public final /* synthetic */ C17745fQs AEQbTJ;
            public final /* synthetic */ ActionBar KWHzl;
            public final /* synthetic */ android.view.View OLrzqt;
            public final /* synthetic */ long copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public ViewOnClickListenerC0844ActionBar(android.view.View view, long j, C17745fQs c17745fQs, ActionBar actionBar) {
                this.OLrzqt = view;
                this.copydefault = j;
                this.AEQbTJ = c17745fQs;
                this.KWHzl = actionBar;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.copydefault || (this.OLrzqt instanceof android.widget.Checkable)) {
                    C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                    if (this.AEQbTJ.isConnected()) {
                        this.KWHzl.EZpvd.invoke(this.AEQbTJ);
                    }
                }
            }
        }

        public static final class Activity implements View.OnClickListener {
            public final /* synthetic */ android.view.View AEQbTJ;
            public final /* synthetic */ ActionBar EZpvd;
            public final /* synthetic */ C17745fQs OLrzqt;
            public final /* synthetic */ long copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public Activity(android.view.View view, long j, C17745fQs c17745fQs, ActionBar actionBar) {
                this.AEQbTJ = view;
                this.copydefault = j;
                this.OLrzqt = c17745fQs;
                this.EZpvd = actionBar;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.copydefault || (this.AEQbTJ instanceof android.widget.Checkable)) {
                    C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                    if (this.OLrzqt.isConnected()) {
                        this.EZpvd.EZpvd.invoke(this.OLrzqt);
                    }
                }
            }
        }

        public static final class TaskDescription implements View.OnClickListener {
            public final /* synthetic */ C17745fQs AEQbTJ;
            public final /* synthetic */ android.view.View EZpvd;
            public final /* synthetic */ ActionBar OLrzqt;
            public final /* synthetic */ long copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public TaskDescription(android.view.View view, long j, C17745fQs c17745fQs, ActionBar actionBar) {
                this.EZpvd = view;
                this.copydefault = j;
                this.AEQbTJ = c17745fQs;
                this.OLrzqt = actionBar;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.copydefault || (this.EZpvd instanceof android.widget.Checkable)) {
                    C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                    if (this.AEQbTJ.isConnected()) {
                        this.OLrzqt.copydefault.invoke(this.AEQbTJ);
                    }
                }
            }
        }
    }

    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ fRE AEQbTJ;
        public final /* synthetic */ C17745fQs KWHzl;
        public final /* synthetic */ android.view.View OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, C17745fQs c17745fQs, fRE fre) {
            this.OLrzqt = view;
            this.copydefault = j;
            this.KWHzl = c17745fQs;
            this.AEQbTJ = fre;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.copydefault || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                if (this.KWHzl.isConnected()) {
                    this.AEQbTJ.copydefault.invoke(this.KWHzl);
                }
            }
        }
    }
}
