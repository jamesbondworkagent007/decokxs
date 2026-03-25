package o;

import android.view.View;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.okinc.business.dex.api.bean.TokenBase;
import com.okinc.business.market.features.scanner.surge.trending.ui.binder.TrendingTokenItemBinder$1;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C29250kqB;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kqC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C29251kqC extends AbstractC25436iwg<C29250kqB, C21540hDd> {
    public final Function1<C29250kqB, Unit> AEQbTJ;
    public final Function1<TokenBase, Unit> EZpvd;
    public final Function1<TokenBase, Unit> KWHzl;
    public final Function1<C29250kqB, Unit> OLrzqt;
    public final Function1<TokenBase, Unit> copydefault;

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super o.kqB, kotlin.Unit> */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super com.okinc.business.dex.api.bean.TokenBase, kotlin.Unit> */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: kotlin.jvm.functions.Function1<? super com.okinc.business.dex.api.bean.TokenBase, kotlin.Unit> */
    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: kotlin.jvm.functions.Function1<? super o.kqB, kotlin.Unit> */
    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: kotlin.jvm.functions.Function1<? super com.okinc.business.dex.api.bean.TokenBase, kotlin.Unit> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C29251kqC(@NotNull Function1<? super C29250kqB, Unit> function1, @NotNull Function1<? super TokenBase, Unit> function12, @NotNull Function1<? super TokenBase, Unit> function13, @NotNull Function1<? super C29250kqB, Unit> function14, @NotNull Function1<? super TokenBase, Unit> function15) {
        super(TrendingTokenItemBinder$1.INSTANCE);
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function12, "");
        Intrinsics.checkNotNullParameter(function13, "");
        Intrinsics.checkNotNullParameter(function14, "");
        Intrinsics.checkNotNullParameter(function15, "");
        this.AEQbTJ = function1;
        this.KWHzl = function12;
        this.copydefault = function13;
        this.OLrzqt = function14;
        this.EZpvd = function15;
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull C25435iwf<C21540hDd> c25435iwf, @NotNull C29250kqB c29250kqB) {
        Intrinsics.checkNotNullParameter(c25435iwf, "");
        Intrinsics.checkNotNullParameter(c29250kqB, "");
        final C21540hDd c21540hDd = (C21540hDd) c25435iwf.EZpvd();
        android.widget.FrameLayout root = c21540hDd.getRoot();
        root.setOnClickListener(new StateListAnimator(root, 1000L, this, c29250kqB));
        LinearLayoutCompat linearLayoutCompat = c21540hDd.AkhnZx;
        linearLayoutCompat.setOnClickListener(new Activity(linearLayoutCompat, 1000L, this, c29250kqB));
        C29255kqG c29255kqG = c21540hDd.KWHzl;
        c29255kqG.setOnClickListener(new ActionBar(c29255kqG, 1000L, this, c29250kqB));
        if (c29250kqB.ejfBZ() != null) {
            android.widget.ImageView imageView = c21540hDd.AYXKKw;
            imageView.setOnClickListener(new Application(imageView, 1000L, this, c29250kqB));
        }
        C52794wYp c52794wYp = c21540hDd.copydefault;
        c52794wYp.setOnClickListener(new TaskDescription(c52794wYp, 1000L, this, c29250kqB));
        C29252kqD.OLrzqt(c21540hDd);
        C29252kqD.KWHzl(c21540hDd, c29250kqB, this.AEQbTJ);
        C29252kqD.AkhnZx(c21540hDd, c29250kqB);
        C29252kqD.DbNXlk(c21540hDd, c29250kqB);
        C29252kqD.AYXKKw(c21540hDd, c29250kqB);
        C29252kqD.djBIcL(c21540hDd, c29250kqB);
        C29252kqD.gEmmrt(c21540hDd, c29250kqB);
        C29252kqD.AhwBna(c21540hDd, c29250kqB);
        if (c29250kqB.AuCTel()) {
            c21540hDd.getRoot().post(new java.lang.Runnable() { // from class: o.kqF
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    C29251kqC.OLrzqt(this.copydefault, c21540hDd);
                }
            });
        }
    }

    public static final void OLrzqt(C29251kqC c29251kqC, C21540hDd c21540hDd) {
        android.widget.FrameLayout root = c21540hDd.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        c29251kqC.OLrzqt(root);
        android.animation.ObjectAnimator objectAnimatorOfFloat = android.animation.ObjectAnimator.ofFloat(c21540hDd.getRoot(), "alpha", 0.5f, 1.0f);
        objectAnimatorOfFloat.setDuration(500L);
        objectAnimatorOfFloat.start();
    }

    public final void OLrzqt(android.view.View view) {
        android.animation.ObjectAnimator objectAnimatorOfFloat = android.animation.ObjectAnimator.ofFloat(view, "translationX", 0.0f, 25.0f, -25.0f, 0.0f);
        objectAnimatorOfFloat.setDuration(500L);
        objectAnimatorOfFloat.setInterpolator(new android.view.animation.AccelerateDecelerateInterpolator());
        objectAnimatorOfFloat.start();
    }

    /* JADX INFO: renamed from: o.kqC$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ C29250kqB OLrzqt;
        public final /* synthetic */ C29251kqC copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, C29251kqC c29251kqC, C29250kqB c29250kqB) {
            this.AEQbTJ = view;
            this.EZpvd = j;
            this.copydefault = c29251kqC;
            this.OLrzqt = c29250kqB;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.EZpvd || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                this.copydefault.copydefault.invoke(this.OLrzqt.gEmmrt());
            }
        }
    }

    /* JADX INFO: renamed from: o.kqC$Activity */
    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ C29250kqB AEQbTJ;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ C29251kqC copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, C29251kqC c29251kqC, C29250kqB c29250kqB) {
            this.KWHzl = view;
            this.OLrzqt = j;
            this.copydefault = c29251kqC;
            this.AEQbTJ = c29250kqB;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.OLrzqt || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                this.copydefault.copydefault.invoke(this.AEQbTJ.gEmmrt());
            }
        }
    }

    /* JADX INFO: renamed from: o.kqC$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ C29251kqC AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ C29250kqB KWHzl;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, C29251kqC c29251kqC, C29250kqB c29250kqB) {
            this.copydefault = view;
            this.EZpvd = j;
            this.AEQbTJ = c29251kqC;
            this.KWHzl = c29250kqB;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.EZpvd || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                this.AEQbTJ.OLrzqt.invoke(this.KWHzl);
            }
        }
    }

    /* JADX INFO: renamed from: o.kqC$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ C29250kqB AEQbTJ;
        public final /* synthetic */ C29251kqC EZpvd;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ android.view.View OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, C29251kqC c29251kqC, C29250kqB c29250kqB) {
            this.OLrzqt = view;
            this.KWHzl = j;
            this.EZpvd = c29251kqC;
            this.AEQbTJ = c29250kqB;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.KWHzl || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                this.EZpvd.KWHzl.invoke(this.AEQbTJ.gEmmrt());
            }
        }
    }

    /* JADX INFO: renamed from: o.kqC$TaskDescription */
    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ C29251kqC AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ C29250kqB OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, C29251kqC c29251kqC, C29250kqB c29250kqB) {
            this.KWHzl = view;
            this.EZpvd = j;
            this.AEQbTJ = c29251kqC;
            this.OLrzqt = c29250kqB;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.EZpvd || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                this.AEQbTJ.EZpvd.invoke(this.OLrzqt.gEmmrt());
            }
        }
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;Ljava/util/List;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull C25435iwf<C21540hDd> c25435iwf, @NotNull C29250kqB c29250kqB, @NotNull java.util.List<java.lang.Object> list) {
        java.util.Collection collectionEZpvd;
        Intrinsics.checkNotNullParameter(c25435iwf, "");
        Intrinsics.checkNotNullParameter(c29250kqB, "");
        Intrinsics.checkNotNullParameter(list, "");
        java.util.ArrayList<C29250kqB.TaskDescription> arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : list) {
            if (!(obj instanceof java.util.List)) {
                collectionEZpvd = obj instanceof C29250kqB.TaskDescription ? C56402yEa.EZpvd(obj) : yDY.AhwBna();
            } else {
                collectionEZpvd = new java.util.ArrayList();
                for (java.lang.Object obj2 : (java.lang.Iterable) obj) {
                    if (obj2 instanceof C29250kqB.TaskDescription) {
                        collectionEZpvd.add(obj2);
                    }
                }
            }
            C56406yEe.KWHzl(arrayList, collectionEZpvd);
        }
        if (arrayList.isEmpty()) {
            onBindViewHolder(c25435iwf, c29250kqB);
            return;
        }
        C21540hDd c21540hDd = (C21540hDd) c25435iwf.EZpvd();
        C29252kqD.DbNXlk(c21540hDd, c29250kqB);
        for (C29250kqB.TaskDescription taskDescription : arrayList) {
            if (taskDescription instanceof C29250kqB.TaskDescription.C0869TaskDescription) {
                C29252kqD.KWHzl(c21540hDd, c29250kqB, this.AEQbTJ);
            } else if (taskDescription instanceof C29250kqB.TaskDescription.Application) {
                C29252kqD.AkhnZx(c21540hDd, c29250kqB);
                C29252kqD.AYXKKw(c21540hDd, c29250kqB);
                C29252kqD.djBIcL(c21540hDd, c29250kqB);
            } else if (taskDescription instanceof C29250kqB.TaskDescription.ActionBar) {
                C29252kqD.gEmmrt(c21540hDd, c29250kqB);
            } else if (taskDescription instanceof C29250kqB.TaskDescription.Activity) {
                C29252kqD.AhwBna(c21540hDd, c29250kqB);
            } else {
                throw new NoWhenBranchMatchedException();
            }
        }
    }
}
