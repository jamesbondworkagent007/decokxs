package o;

import android.animation.Animator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C45914tAy;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tAy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C45914tAy extends RecyclerView.Adapter<Application> {
    public final java.util.List<C45913tAx> EZpvd;
    public Function1<? super java.lang.Integer, Unit> KWHzl;
    public final java.util.Map<java.lang.Integer, Application> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(Function1<? super java.lang.Integer, Unit> function1) {
        this.KWHzl = function1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit>, kotlin.jvm.functions.Function1<java.lang.Integer, kotlin.Unit> */
    public final Function1<java.lang.Integer, Unit> copydefault() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 java.util.List)
  (wrap:kotlin.jvm.functions.Function1:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null kotlin.jvm.functions.Function1) : (r2v0 kotlin.jvm.functions.Function1))
 A[MD:(java.util.List<o.tAx>, kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit>):void (m)] (LINE:13) call: o.tAy.<init>(java.util.List, kotlin.jvm.functions.Function1):void type: THIS */
    public /* synthetic */ C45914tAy(java.util.List list, Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, (i & 2) != 0 ? null : function1);
    }

    public C45914tAy(@NotNull java.util.List<C45913tAx> list, Function1<? super java.lang.Integer, Unit> function1) {
        Intrinsics.checkNotNullParameter(list, "");
        this.EZpvd = list;
        this.KWHzl = function1;
        this.copydefault = new LinkedHashMap();
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public Application onCreateViewHolder(@NotNull android.view.ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        tMP tmpOLrzqt = tMP.OLrzqt(android.view.LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(tmpOLrzqt, "");
        return new Application(this, tmpOLrzqt);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull Application application, int i) {
        Intrinsics.checkNotNullParameter(application, "");
        this.copydefault.put(java.lang.Integer.valueOf(i), application);
        application.copydefault(this.EZpvd.get(i));
    }

    /* JADX DEBUG: Method merged with bridge method: onViewRecycled(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public void onViewRecycled(@NotNull Application application) {
        Intrinsics.checkNotNullParameter(application, "");
        super.onViewRecycled(application);
        int bindingAdapterPosition = application.getBindingAdapterPosition();
        if (bindingAdapterPosition != -1) {
            this.copydefault.remove(java.lang.Integer.valueOf(bindingAdapterPosition));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.EZpvd.size();
    }

    public final void EZpvd(int i) {
        Application application = this.copydefault.get(java.lang.Integer.valueOf(i));
        if (application != null) {
            application.KWHzl();
        }
    }

    public final void KWHzl(int i) {
        Application application = this.copydefault.get(java.lang.Integer.valueOf(i));
        if (application != null) {
            application.copydefault();
        }
    }

    public final void OLrzqt(int i) {
        Application application = this.copydefault.get(java.lang.Integer.valueOf(i));
        if (application != null) {
            application.OLrzqt();
        }
    }

    public final void copydefault(int i) {
        Application application = this.copydefault.get(java.lang.Integer.valueOf(i));
        if (application != null) {
            application.AEQbTJ();
        }
    }

    public final void OLrzqt(int i, float f) {
        Application application = this.copydefault.get(java.lang.Integer.valueOf(i));
        if (application != null) {
            application.EZpvd(f);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: o.tAy */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void fadeOutAnimationAt$default(C45914tAy c45914tAy, int i, long j, float f, Function0 function0, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            j = 300;
        }
        long j2 = j;
        if ((i2 & 4) != 0) {
            f = 0.3f;
        }
        float f2 = f;
        if ((i2 & 8) != 0) {
            function0 = null;
        }
        c45914tAy.AEQbTJ(i, j2, f2, function0);
    }

    public final void AEQbTJ(int i, long j, float f, Function0<Unit> function0) {
        Application application = this.copydefault.get(java.lang.Integer.valueOf(i));
        if (application != null) {
            application.KWHzl(j, f, function0);
        } else if (function0 != null) {
            function0.invoke();
        }
    }

    /* JADX INFO: renamed from: o.tAy$Application */
    /* JADX INFO: loaded from: classes19.dex */
    public final class Application extends RecyclerView.ViewHolder {
        public boolean AEQbTJ;
        public final tMP EZpvd;
        public final /* synthetic */ C45914tAy KWHzl;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Application(@NotNull C45914tAy c45914tAy, tMP tmp) {
            super(tmp.getRoot());
            Intrinsics.checkNotNullParameter(tmp, "");
            this.KWHzl = c45914tAy;
            this.EZpvd = tmp;
        }

        public final void copydefault(@NotNull C45913tAx c45913tAx) {
            Intrinsics.checkNotNullParameter(c45913tAx, "");
            tMP tmp = this.EZpvd;
            tmp.AEQbTJ.setAlpha(1.0f);
            tmp.AEQbTJ.setRepeatCount(0);
            tmp.AEQbTJ.setAnimation(c45913tAx.copydefault());
            this.AEQbTJ = true;
            tmp.OLrzqt.setText(c45913tAx.EZpvd());
            if (c45913tAx.KWHzl().length() > 0) {
                tmp.copydefault.setText(c45913tAx.KWHzl());
            } else {
                tmp.copydefault.setText("");
            }
        }

        public final void AEQbTJ() {
            this.EZpvd.AEQbTJ.animate().cancel();
            this.EZpvd.AEQbTJ.setAlpha(1.0f);
        }

        public final void EZpvd(float f) {
            this.EZpvd.AEQbTJ.animate().cancel();
            this.EZpvd.AEQbTJ.setAlpha(f);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.tAy$Application */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void fadeOutAnimation$default(Application application, long j, float f, Function0 function0, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                j = 300;
            }
            if ((i & 2) != 0) {
                f = 0.3f;
            }
            if ((i & 4) != 0) {
                function0 = null;
            }
            application.KWHzl(j, f, function0);
        }

        public final void KWHzl(long j, float f, final Function0<Unit> function0) {
            this.EZpvd.AEQbTJ.animate().cancel();
            this.EZpvd.AEQbTJ.animate().alpha(f).setDuration(j).withEndAction(new java.lang.Runnable() { // from class: o.tAv
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    C45914tAy.Application.KWHzl(function0);
                }
            }).start();
        }

        public static final void KWHzl(Function0 function0) {
            if (function0 != null) {
                function0.invoke();
            }
        }

        public final void KWHzl() {
            if (this.AEQbTJ) {
                this.EZpvd.AEQbTJ.removeAllAnimatorListeners();
                this.EZpvd.AEQbTJ.cancelAnimation();
                this.EZpvd.AEQbTJ.setProgress(0.0f);
                this.EZpvd.AEQbTJ.addAnimatorListener(new C0955Application(new boolean[]{false}, this, this.KWHzl));
                this.EZpvd.AEQbTJ.playAnimation();
            }
        }

        /* JADX INFO: renamed from: o.tAy$Application$Application, reason: collision with other inner class name */
        public static final class C0955Application implements Animator.AnimatorListener {
            public final /* synthetic */ Application AEQbTJ;
            public final /* synthetic */ C45914tAy EZpvd;
            public final /* synthetic */ boolean[] KWHzl;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(android.animation.Animator animator) {
                Intrinsics.checkNotNullParameter(animator, "");
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(android.animation.Animator animator) {
                Intrinsics.checkNotNullParameter(animator, "");
            }

            public C0955Application(boolean[] zArr, Application application, C45914tAy c45914tAy) {
                this.KWHzl = zArr;
                this.AEQbTJ = application;
                this.EZpvd = c45914tAy;
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(android.animation.Animator animator) {
                Intrinsics.checkNotNullParameter(animator, "");
                this.KWHzl[0] = true;
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(android.animation.Animator animator) {
                int bindingAdapterPosition;
                Function1<java.lang.Integer, Unit> function1Copydefault;
                Intrinsics.checkNotNullParameter(animator, "");
                if (this.KWHzl[0] || (bindingAdapterPosition = this.AEQbTJ.getBindingAdapterPosition()) == -1 || (function1Copydefault = this.EZpvd.copydefault()) == null) {
                    return;
                }
                function1Copydefault.invoke(java.lang.Integer.valueOf(bindingAdapterPosition));
            }
        }

        public final void copydefault() {
            this.EZpvd.AEQbTJ.removeAllAnimatorListeners();
            this.EZpvd.AEQbTJ.cancelAnimation();
        }

        public final void OLrzqt() {
            this.EZpvd.AEQbTJ.removeAllAnimatorListeners();
            this.EZpvd.AEQbTJ.cancelAnimation();
            this.EZpvd.AEQbTJ.setProgress(0.0f);
            AEQbTJ();
        }
    }
}
