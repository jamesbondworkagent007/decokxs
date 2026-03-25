package o;

import android.view.View;
import androidx.compose.material3.CalendarModelKt;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.business.defi.wallet.mine.walletmanage.walletmanageradapter.WalletManageSmartAccountTipViewHolderCreate$ViewHolder$startTimer$1;
import java.util.Date;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Job;
import o.C13754dXa;
import o.C52761wXj;
import o.InterfaceC17407fEe;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fFe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C17434fFe implements fDP {
    public final Function1<AbstractC12782ctV, Unit> AEQbTJ;
    public final Function1<AbstractC12782ctV, Unit> KWHzl;
    public final LifecycleOwner OLrzqt;

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super o.ctV, kotlin.Unit> */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: kotlin.jvm.functions.Function1<? super o.ctV, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public C17434fFe(@NotNull LifecycleOwner lifecycleOwner, @NotNull Function1<? super AbstractC12782ctV, Unit> function1, Function1<? super AbstractC12782ctV, Unit> function12) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        Intrinsics.checkNotNullParameter(function1, "");
        this.OLrzqt = lifecycleOwner;
        this.AEQbTJ = function1;
        this.KWHzl = function12;
    }

    @Override // o.fDP
    public RecyclerView.ViewHolder AEQbTJ(@NotNull android.view.ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        C16870esA c16870esACopydefault = C16870esA.copydefault(android.view.LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c16870esACopydefault, "");
        return new StateListAnimator(c16870esACopydefault, this.OLrzqt);
    }

    @Override // o.fDP
    public void OLrzqt(@NotNull RecyclerView.ViewHolder viewHolder, @NotNull java.lang.Object obj, int i) {
        Intrinsics.checkNotNullParameter(viewHolder, "");
        Intrinsics.checkNotNullParameter(obj, "");
        StateListAnimator stateListAnimator = viewHolder instanceof StateListAnimator ? (StateListAnimator) viewHolder : null;
        if (stateListAnimator == null) {
            return;
        }
        C17432fFc c17432fFc = obj instanceof C17432fFc ? (C17432fFc) obj : null;
        if (c17432fFc == null) {
            return;
        }
        stateListAnimator.copydefault(c17432fFc.AEQbTJ(), c17432fFc.AEQbTJ().fIwbmz(), this.AEQbTJ, this.KWHzl);
    }

    @Override // o.fDP
    public void AEQbTJ(@NotNull RecyclerView.ViewHolder viewHolder) {
        Intrinsics.checkNotNullParameter(viewHolder, "");
        StateListAnimator stateListAnimator = viewHolder instanceof StateListAnimator ? (StateListAnimator) viewHolder : null;
        if (stateListAnimator != null) {
            stateListAnimator.KWHzl();
        }
    }

    /* JADX INFO: renamed from: o.fFe$StateListAnimator */
    public static final class StateListAnimator extends RecyclerView.ViewHolder {
        public DefaultLifecycleObserver AEQbTJ;
        public Job EZpvd;
        public final LifecycleOwner KWHzl;
        public final C16870esA OLrzqt;
        public final C17403fEa copydefault;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StateListAnimator(@NotNull C16870esA c16870esA, @NotNull LifecycleOwner lifecycleOwner) {
            super(c16870esA.getRoot());
            Intrinsics.checkNotNullParameter(c16870esA, "");
            Intrinsics.checkNotNullParameter(lifecycleOwner, "");
            this.OLrzqt = c16870esA;
            this.KWHzl = lifecycleOwner;
            this.copydefault = new C17403fEa(C33070mpX.copydefault(C52761wXj.Activity.gdmIOq));
        }

        /* JADX INFO: renamed from: o.fFe$StateListAnimator$TaskDescription */
        public static abstract class TaskDescription {
            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.fFe.StateListAnimator.TaskDescription.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* JADX INFO: renamed from: o.fFe$StateListAnimator$TaskDescription$Application */
            public static final class Application extends TaskDescription {
                public static final Application AEQbTJ = new Application();

                private Application() {
                    super(null);
                }
            }

            private TaskDescription() {
            }

            /* JADX INFO: renamed from: o.fFe$StateListAnimator$TaskDescription$TaskDescription, reason: collision with other inner class name */
            public static final class C0843TaskDescription extends TaskDescription {
                public final long copydefault;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public static /* synthetic */ C0843TaskDescription copy$default(C0843TaskDescription c0843TaskDescription, long j, int i, java.lang.Object obj) {
                    if ((i & 1) != 0) {
                        j = c0843TaskDescription.copydefault;
                    }
                    return c0843TaskDescription.copydefault(j);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final long EZpvd() {
                    return this.copydefault;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final C0843TaskDescription copydefault(long j) {
                    return new C0843TaskDescription(j);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public boolean equals(java.lang.Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof C0843TaskDescription) && this.copydefault == ((C0843TaskDescription) obj).copydefault;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public int hashCode() {
                    return java.lang.Long.hashCode(this.copydefault);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public java.lang.String toString() {
                    return "ShowDate(timestamp=" + this.copydefault + ")";
                }

                public C0843TaskDescription(long j) {
                    super(null);
                    this.copydefault = j;
                }
            }

            /* JADX INFO: renamed from: o.fFe$StateListAnimator$TaskDescription$StateListAnimator, reason: collision with other inner class name */
            public static final class C0842StateListAnimator extends TaskDescription {
                public final long EZpvd;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public static /* synthetic */ C0842StateListAnimator copy$default(C0842StateListAnimator c0842StateListAnimator, long j, int i, java.lang.Object obj) {
                    if ((i & 1) != 0) {
                        j = c0842StateListAnimator.EZpvd;
                    }
                    return c0842StateListAnimator.copydefault(j);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final long KWHzl() {
                    return this.EZpvd;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final C0842StateListAnimator copydefault(long j) {
                    return new C0842StateListAnimator(j);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public boolean equals(java.lang.Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof C0842StateListAnimator) && this.EZpvd == ((C0842StateListAnimator) obj).EZpvd;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public int hashCode() {
                    return java.lang.Long.hashCode(this.EZpvd);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public java.lang.String toString() {
                    return "ShowCountdown(timestamp=" + this.EZpvd + ")";
                }

                public C0842StateListAnimator(long j) {
                    super(null);
                    this.EZpvd = j;
                }
            }
        }

        public final TaskDescription OLrzqt(AbstractC12782ctV abstractC12782ctV, long j) {
            if (abstractC12782ctV.QbewEr() && !abstractC12782ctV.DTwDnp()) {
                return TaskDescription.Application.AEQbTJ;
            }
            long jCurrentTimeMillis = j - java.lang.System.currentTimeMillis();
            if (C17922fXg.AEQbTJ(abstractC12782ctV) || jCurrentTimeMillis > 172800000) {
                return TaskDescription.Application.AEQbTJ;
            }
            if (jCurrentTimeMillis > CalendarModelKt.MillisecondsIn24Hours) {
                return new TaskDescription.C0843TaskDescription(j);
            }
            if (jCurrentTimeMillis > 0) {
                return new TaskDescription.C0842StateListAnimator(j);
            }
            return TaskDescription.Application.AEQbTJ;
        }

        public final void copydefault(@NotNull AbstractC12782ctV abstractC12782ctV, long j, @NotNull Function1<? super AbstractC12782ctV, Unit> function1, Function1<? super AbstractC12782ctV, Unit> function12) {
            Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
            Intrinsics.checkNotNullParameter(function1, "");
            copydefault();
            OLrzqt();
            AEQbTJ(abstractC12782ctV, j, function12);
            copydefault(abstractC12782ctV, j, function12);
            ConstraintLayout constraintLayout = this.OLrzqt.copydefault;
            constraintLayout.setOnClickListener(new ViewOnClickListenerC0841StateListAnimator(constraintLayout, 1000L, function1, abstractC12782ctV));
        }

        public final void KWHzl() {
            copydefault();
            OLrzqt();
        }

        public final void AEQbTJ(AbstractC12782ctV abstractC12782ctV, long j, Function1<? super AbstractC12782ctV, Unit> function1) {
            TaskDescription taskDescriptionOLrzqt = OLrzqt(abstractC12782ctV, j);
            if (taskDescriptionOLrzqt instanceof TaskDescription.C0843TaskDescription) {
                OLrzqt(((TaskDescription.C0843TaskDescription) taskDescriptionOLrzqt).EZpvd());
            } else if (taskDescriptionOLrzqt instanceof TaskDescription.C0842StateListAnimator) {
                KWHzl(abstractC12782ctV, ((TaskDescription.C0842StateListAnimator) taskDescriptionOLrzqt).KWHzl(), function1);
            } else {
                if (!(taskDescriptionOLrzqt instanceof TaskDescription.Application)) {
                    throw new NoWhenBranchMatchedException();
                }
                AEQbTJ();
            }
        }

        public final void AEQbTJ() {
            this.OLrzqt.EZpvd.setText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.OsDdEf));
            this.OLrzqt.EZpvd.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.DCUTEIddSDPG));
        }

        public final void OLrzqt(long j) {
            java.lang.String simpleDate$default = pTA.formatSimpleDate$default(new Date(j), null, 1, null);
            this.OLrzqt.EZpvd.setText(InterfaceC17407fEe.ActionBar.generate$default(this.copydefault, C33069mpW.copydefault(C13754dXa.FragmentManager.DRtzUu, C56423yEv.EZpvd(C56390yDp.OLrzqt("countdown", simpleDate$default))), simpleDate$default, false, 4, null));
        }

        public final void KWHzl(AbstractC12782ctV abstractC12782ctV, long j, Function1<? super AbstractC12782ctV, Unit> function1) {
            long jCurrentTimeMillis = j - java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis > 0) {
                copydefault(jCurrentTimeMillis);
                OLrzqt(abstractC12782ctV, j, function1);
            } else if (function1 != null) {
                function1.invoke(abstractC12782ctV);
            }
        }

        public final void copydefault(long j) {
            java.lang.String strEZpvd = EZpvd(j);
            this.OLrzqt.EZpvd.setText(InterfaceC17407fEe.ActionBar.generate$default(this.copydefault, C33069mpW.copydefault(C13754dXa.FragmentManager.DRtzUu, C56423yEv.EZpvd(C56390yDp.OLrzqt("countdown", strEZpvd))), strEZpvd, false, 4, null));
        }

        /* JADX INFO: renamed from: o.fFe$StateListAnimator$StateListAnimator, reason: collision with other inner class name */
        public static final class ViewOnClickListenerC0841StateListAnimator implements View.OnClickListener {
            public final /* synthetic */ Function1 AEQbTJ;
            public final /* synthetic */ android.view.View EZpvd;
            public final /* synthetic */ long OLrzqt;
            public final /* synthetic */ AbstractC12782ctV copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public ViewOnClickListenerC0841StateListAnimator(android.view.View view, long j, Function1 function1, AbstractC12782ctV abstractC12782ctV) {
                this.EZpvd = view;
                this.OLrzqt = j;
                this.AEQbTJ = function1;
                this.copydefault = abstractC12782ctV;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.OLrzqt || (this.EZpvd instanceof android.widget.Checkable)) {
                    C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                    this.AEQbTJ.invoke(this.copydefault);
                }
            }
        }

        public final void OLrzqt(AbstractC12782ctV abstractC12782ctV, long j, Function1<? super AbstractC12782ctV, Unit> function1) {
            copydefault();
            this.EZpvd = BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this.KWHzl), null, null, new WalletManageSmartAccountTipViewHolderCreate$ViewHolder$startTimer$1(j, function1, abstractC12782ctV, this, null), 3, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void copydefault() {
            Job job = this.EZpvd;
            if (job != null) {
                Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (java.lang.Object) null);
            }
            this.EZpvd = null;
        }

        public final void copydefault(final AbstractC12782ctV abstractC12782ctV, final long j, final Function1<? super AbstractC12782ctV, Unit> function1) {
            this.AEQbTJ = new DefaultLifecycleObserver() { // from class: com.okinc.business.defi.wallet.mine.walletmanage.walletmanageradapter.WalletManageSmartAccountTipViewHolderCreate$ViewHolder$setupLifecycleObserver$1
                @Override // androidx.lifecycle.DefaultLifecycleObserver
                public void onStart(LifecycleOwner lifecycleOwner) {
                    Intrinsics.checkNotNullParameter(lifecycleOwner, "");
                    this.EZpvd.AEQbTJ(abstractC12782ctV, j, function1);
                }

                @Override // androidx.lifecycle.DefaultLifecycleObserver
                public void onStop(LifecycleOwner lifecycleOwner) {
                    Intrinsics.checkNotNullParameter(lifecycleOwner, "");
                    this.EZpvd.copydefault();
                }
            };
            Lifecycle lifecycle = this.KWHzl.getLifecycle();
            DefaultLifecycleObserver defaultLifecycleObserver = this.AEQbTJ;
            Intrinsics.copydefault(defaultLifecycleObserver);
            lifecycle.addObserver(defaultLifecycleObserver);
        }

        public final void OLrzqt() {
            DefaultLifecycleObserver defaultLifecycleObserver = this.AEQbTJ;
            if (defaultLifecycleObserver != null) {
                this.KWHzl.getLifecycle().removeObserver(defaultLifecycleObserver);
            }
            this.AEQbTJ = null;
        }

        private final java.lang.String EZpvd(long j) {
            long j2 = 60;
            C56529yIt c56529yIt = C56529yIt.KWHzl;
            java.lang.String str = java.lang.String.format("%02d:%02d:%02d", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Long.valueOf(j / ((long) 3600000)), java.lang.Long.valueOf((j / ((long) 60000)) % j2), java.lang.Long.valueOf((j / ((long) 1000)) % j2)}, 3));
            Intrinsics.checkNotNullExpressionValue(str, "");
            return str;
        }
    }
}
