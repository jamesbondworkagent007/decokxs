package o;

import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.Lifecycle;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import java.util.LinkedHashSet;
import java.util.Objects;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC40511qYo;
import o.C52761wXj;
import o.qZH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qad, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C40580qad extends AbstractC40511qYo<pZT, C42794rdD> {
    public static final Activity Companion = new Activity(null);
    public static final int EZpvd = 8;
    public final Lifecycle AEQbTJ;
    public RecyclerView KWHzl;
    public final java.util.Set<android.os.CountDownTimer> OLrzqt;

    /* JADX INFO: renamed from: o.qad$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.qad.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    public C40580qad(@NotNull Lifecycle lifecycle) {
        Intrinsics.checkNotNullParameter(lifecycle, "");
        this.AEQbTJ = lifecycle;
        this.OLrzqt = new LinkedHashSet();
    }

    /* JADX DEBUG: Method merged with bridge method: OLrzqt(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/viewbinding/ViewBinding; */
    @Override // o.AbstractC40511qYo
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public C42794rdD OLrzqt(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        java.lang.Object objM7377constructorimpl;
        int iEZpvd;
        int i;
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        C42794rdD c42794rdDCopydefault = C42794rdD.copydefault(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c42794rdDCopydefault, "");
        try {
            Result.Application application = Result.Companion;
            C33566myq c33566myq = C33566myq.EZpvd;
            android.content.Context context = c42794rdDCopydefault.getRoot().getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            c33566myq.EZpvd(context);
            C55298xhM.dp2px$default(48.0f, null, 1, null);
            android.content.Context context2 = c42794rdDCopydefault.getRoot().getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            c33566myq.EZpvd(context2);
            C55298xhM.dp2px$default(48.0f, null, 1, null);
            android.content.Context context3 = c42794rdDCopydefault.AYXKKw.getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "");
            if (copydefault(context3)) {
                int itemCount = getItemCount();
                if (itemCount == 1) {
                    android.content.Context context4 = c42794rdDCopydefault.getRoot().getContext();
                    Intrinsics.checkNotNullExpressionValue(context4, "");
                    iEZpvd = c33566myq.EZpvd(context4) - C55298xhM.dp2px$default(48.0f, null, 1, null);
                } else if (itemCount == 2) {
                    android.content.Context context5 = c42794rdDCopydefault.getRoot().getContext();
                    Intrinsics.checkNotNullExpressionValue(context5, "");
                    iEZpvd = (c33566myq.EZpvd(context5) - C55298xhM.dp2px$default(64.0f, null, 1, null)) / 2;
                } else {
                    iEZpvd = C55298xhM.dp2px$default(500.0f, null, 1, null);
                    i = -1;
                    ViewGroup.LayoutParams layoutParams = c42794rdDCopydefault.AYXKKw.getLayoutParams();
                    Intrinsics.copydefault(layoutParams, "");
                    ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
                    ((ViewGroup.MarginLayoutParams) layoutParams2).width = i;
                    layoutParams2.matchConstraintMaxWidth = iEZpvd;
                    ((ViewGroup.MarginLayoutParams) layoutParams2).height = C55298xhM.dp2px$default(330.0f, null, 1, null);
                    c42794rdDCopydefault.AYXKKw.setLayoutParams(layoutParams2);
                    c42794rdDCopydefault.getRoot().setMaxWidth(iEZpvd);
                }
                i = iEZpvd;
                ViewGroup.LayoutParams layoutParams3 = c42794rdDCopydefault.AYXKKw.getLayoutParams();
                Intrinsics.copydefault(layoutParams3, "");
                ConstraintLayout.LayoutParams layoutParams22 = (ConstraintLayout.LayoutParams) layoutParams3;
                ((ViewGroup.MarginLayoutParams) layoutParams22).width = i;
                layoutParams22.matchConstraintMaxWidth = iEZpvd;
                ((ViewGroup.MarginLayoutParams) layoutParams22).height = C55298xhM.dp2px$default(330.0f, null, 1, null);
                c42794rdDCopydefault.AYXKKw.setLayoutParams(layoutParams22);
                c42794rdDCopydefault.getRoot().setMaxWidth(iEZpvd);
            }
            objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        java.lang.Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
            pUU.AEQbTJ("MarketBoostBanner", "set card width failed:" + thM7380exceptionOrNullimpl.getMessage(), thM7380exceptionOrNullimpl);
        }
        return c42794rdDCopydefault;
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V */
    /* JADX DEBUG: Type inference failed for r1v2. Raw type applied. Possible types: Vo */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r13v6, types: [android.os.CountDownTimer] */
    /* JADX WARN: Type inference failed for: r13v9 */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull AbstractC40511qYo.Activity<C42794rdD> activity, int i) {
        C52794wYp c52794wYp;
        java.lang.Object objM7377constructorimpl;
        java.lang.Object objM7377constructorimpl2;
        C52794wYp c52794wYp2;
        int iDp2px$default;
        Intrinsics.checkNotNullParameter(activity, "");
        try {
            Result.Application application = Result.Companion;
            pZT pzt = (pZT) getItem(i);
            java.lang.Object tag = activity.itemView.getTag(qZH.StateListAnimator.sElUiK);
            android.os.CountDownTimer countDownTimer = tag instanceof android.os.CountDownTimer ? (android.os.CountDownTimer) tag : null;
            if (countDownTimer != null) {
                this.OLrzqt.remove(countDownTimer);
                countDownTimer.cancel();
            }
            C42794rdD c42794rdDKWHzl = activity.KWHzl();
            C42794rdD c42794rdD = c42794rdDKWHzl;
            ConstraintLayout constraintLayoutCopydefault = c42794rdD.getRoot();
            constraintLayoutCopydefault.setOnClickListener(new ActionBar(constraintLayoutCopydefault, 1000L, c42794rdD, pzt, i, this));
            c42794rdD.EZpvd.setText(pzt.djBIcL());
            c42794rdD.AEQbTJ.setText(pzt.EZpvd());
            C52794wYp c52794wYp3 = c42794rdD.AEQbTJ;
            Intrinsics.checkNotNullExpressionValue(c52794wYp3, "");
            c52794wYp3.setVisibility(C33129mqd.OLrzqt((java.lang.CharSequence) pzt.EZpvd()) ? 0 : 8);
            C52794wYp c52794wYp4 = c42794rdD.AEQbTJ;
            c52794wYp4.setOnClickListener(new Application(c52794wYp4, 1000L, c42794rdD, pzt, i, this));
            boolean zEZpvd = Intrinsics.EZpvd((java.lang.Object) pzt.EZpvd(), (java.lang.Object) C33070mpX.AYXKKw(qZH.PendingIntent.fsSxsn));
            boolean zEZpvd2 = Intrinsics.EZpvd((java.lang.Object) pzt.EZpvd(), (java.lang.Object) C33070mpX.AYXKKw(qZH.PendingIntent.hlkKmr));
            if (zEZpvd || zEZpvd2) {
                c42794rdD.AEQbTJ.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.igXuih));
                c42794rdD.AEQbTJ.setBackgroundTintList(C33070mpX.AEQbTJ(C52761wXj.Activity.hlXVux));
            } else {
                c42794rdD.AEQbTJ.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.zqTOFw));
                c42794rdD.AEQbTJ.setBackgroundTintList(C33070mpX.AEQbTJ(C52761wXj.Activity.zblBkD));
            }
            boolean z = true;
            try {
                int width = c42794rdD.OLrzqt.getWidth() > 0 ? c42794rdD.OLrzqt.getWidth() : c42794rdD.OLrzqt.getLayoutParams().width;
                android.content.Context context = c42794rdD.getRoot().getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                android.widget.ImageView imageView = c42794rdD.OLrzqt;
                Intrinsics.checkNotNullExpressionValue(imageView, "");
                java.lang.String strKWHzl = pzt.KWHzl();
                android.content.Context context2 = c42794rdD.getRoot().getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "");
                try {
                    if (copydefault(context2)) {
                        c52794wYp2 = null;
                        iDp2px$default = C55298xhM.dp2px$default(330.0f, null, 1, null);
                    } else {
                        c52794wYp2 = null;
                        iDp2px$default = C55298xhM.dp2px$default(210.0f, null, 1, null);
                    }
                    c52794wYp = c52794wYp2;
                    c52794wYp4 = null;
                } catch (java.lang.Throwable th) {
                    th = th;
                    c52794wYp = c52794wYp4;
                }
                try {
                    loadTiledBackgroundForImageView$default(this, context, imageView, strKWHzl, 0, width, iDp2px$default, 8, null);
                    objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
                } catch (java.lang.Throwable th2) {
                    th = th2;
                    Result.Application application2 = Result.Companion;
                    objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                }
            } catch (java.lang.Throwable th3) {
                th = th3;
                c52794wYp = null;
            }
            java.lang.Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
            if (thM7380exceptionOrNullimpl != null) {
                pUU.AEQbTJ("MarketBoostBanner", "load banner image failed:" + thM7380exceptionOrNullimpl.getMessage(), thM7380exceptionOrNullimpl);
            }
            C40432qVq c40432qVqAEQbTJ = pzt.AEQbTJ();
            if ((c40432qVqAEQbTJ != null ? c40432qVqAEQbTJ.AEQbTJ() : 0L) <= java.lang.System.currentTimeMillis() || pzt.OLrzqt().getFirst().intValue() == 6) {
                z = false;
            }
            Objects.toString(pzt);
            if (z) {
                C40432qVq c40432qVqAEQbTJ2 = pzt.AEQbTJ();
                long jKWHzl = c40432qVqAEQbTJ2 != null ? c40432qVqAEQbTJ2.KWHzl() : 0L;
                if (jKWHzl > 0) {
                    C40432qVq third = pzt.OLrzqt().getThird();
                    StateListAnimator stateListAnimator = new StateListAnimator(jKWHzl, this, c42794rdD, pzt, third != null ? third.AEQbTJ() : 0L);
                    java.lang.Object tag2 = activity.itemView.getTag(qZH.StateListAnimator.sElUiK);
                    ?? r13 = tag2 instanceof android.os.CountDownTimer ? (android.os.CountDownTimer) tag2 : c52794wYp;
                    if (r13 != 0) {
                        r13.cancel();
                    }
                    activity.itemView.setTag(qZH.StateListAnimator.sElUiK, stateListAnimator);
                    stateListAnimator.start();
                    this.OLrzqt.add(stateListAnimator);
                }
            } else {
                try {
                    Result.Application application3 = Result.Companion;
                    c42794rdD.copydefault.setText(C33070mpX.AYXKKw(pzt.OLrzqt().getSecond().intValue()));
                    objM7377constructorimpl2 = Result.m7377constructorimpl(Unit.INSTANCE);
                } catch (java.lang.Throwable th4) {
                    Result.Application application4 = Result.Companion;
                    objM7377constructorimpl2 = Result.m7377constructorimpl(C56391yDq.EZpvd(th4));
                }
                Result.m7376boximpl(objM7377constructorimpl2);
            }
            Result.m7377constructorimpl(c42794rdDKWHzl);
        } catch (java.lang.Throwable th5) {
            Result.Application application5 = Result.Companion;
            Result.m7377constructorimpl(C56391yDq.EZpvd(th5));
        }
    }

    /* JADX INFO: renamed from: o.qad$StateListAnimator */
    public static final class StateListAnimator extends android.os.CountDownTimer {
        public final /* synthetic */ pZT AEQbTJ;
        public final /* synthetic */ C42794rdD EZpvd;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ C40580qad copydefault;

        @Override // android.os.CountDownTimer
        public void onFinish() {
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StateListAnimator(long j, C40580qad c40580qad, C42794rdD c42794rdD, pZT pzt, long j2) {
            super(j, 1000L);
            this.copydefault = c40580qad;
            this.EZpvd = c42794rdD;
            this.AEQbTJ = pzt;
            this.OLrzqt = j2;
        }

        @Override // android.os.CountDownTimer
        public void onTick(long j) {
            C40580qad c40580qad = this.copydefault;
            C42794rdD c42794rdD = this.EZpvd;
            pZT pzt = this.AEQbTJ;
            long j2 = this.OLrzqt;
            try {
                Result.Application application = Result.Companion;
                pUU.KWHzl("MarketBoostBanner", "CedefiBoostCardAdapter onTick millisUntilFinished=" + j);
                if (c40580qad.AEQbTJ.getCurrentState().isAtLeast(Lifecycle.State.RESUMED)) {
                    c42794rdD.copydefault.setText(C33069mpW.copydefault(pzt.OLrzqt().getSecond().intValue(), C56423yEv.EZpvd(C56390yDp.OLrzqt("countdown", C40433qVr.EZpvd(j2)))));
                }
                Result.m7377constructorimpl(Unit.INSTANCE);
            } catch (java.lang.Throwable th) {
                Result.Application application2 = Result.Companion;
                Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
        }
    }

    /* JADX INFO: renamed from: o.qad$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ C40580qad AEQbTJ;
        public final /* synthetic */ long AYXKKw;
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ int KWHzl;
        public final /* synthetic */ pZT OLrzqt;
        public final /* synthetic */ C42794rdD copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, C42794rdD c42794rdD, pZT pzt, int i, C40580qad c40580qad) {
            this.EZpvd = view;
            this.AYXKKw = j;
            this.copydefault = c42794rdD;
            this.OLrzqt = pzt;
            this.KWHzl = i;
            this.AEQbTJ = c40580qad;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.AYXKKw || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                C42794rdD c42794rdD = this.copydefault;
                try {
                    Result.Application application = Result.Companion;
                    pZI.copydefault(false, true, false, C33129mqd.gEmmrt(java.lang.Long.valueOf(this.OLrzqt.copydefault())), pZI.copydefault(this.OLrzqt.OLrzqt().getFirst().intValue()), this.KWHzl);
                    this.AEQbTJ.EZpvd(c42794rdD, this.OLrzqt);
                    Result.m7377constructorimpl(Unit.INSTANCE);
                } catch (java.lang.Throwable th) {
                    Result.Application application2 = Result.Companion;
                    Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                }
            }
        }
    }

    /* JADX INFO: renamed from: o.qad$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ C42794rdD AEQbTJ;
        public final /* synthetic */ long AYXKKw;
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ pZT KWHzl;
        public final /* synthetic */ int OLrzqt;
        public final /* synthetic */ C40580qad copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, C42794rdD c42794rdD, pZT pzt, int i, C40580qad c40580qad) {
            this.EZpvd = view;
            this.AYXKKw = j;
            this.AEQbTJ = c42794rdD;
            this.KWHzl = pzt;
            this.OLrzqt = i;
            this.copydefault = c40580qad;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.AYXKKw || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                C42794rdD c42794rdD = this.AEQbTJ;
                try {
                    Result.Application application = Result.Companion;
                    pZI.copydefault(false, false, true, C33129mqd.gEmmrt(java.lang.Long.valueOf(this.KWHzl.copydefault())), pZI.copydefault(this.KWHzl.OLrzqt().getFirst().intValue()), this.OLrzqt);
                    this.copydefault.EZpvd(c42794rdD, this.KWHzl);
                    Result.m7377constructorimpl(Unit.INSTANCE);
                } catch (java.lang.Throwable th) {
                    Result.Application application2 = Result.Companion;
                    Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                }
            }
        }
    }

    /* JADX DEBUG: Method merged with bridge method: onViewAttachedToWindow(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public void onViewAttachedToWindow(@NotNull AbstractC40511qYo.Activity<C42794rdD> activity) {
        Intrinsics.checkNotNullParameter(activity, "");
        super.onViewAttachedToWindow(activity);
        java.lang.Object tag = activity.itemView.getTag(qZH.StateListAnimator.sElUiK);
        android.os.CountDownTimer countDownTimer = tag instanceof android.os.CountDownTimer ? (android.os.CountDownTimer) tag : null;
        if (countDownTimer != null) {
            pUU.KWHzl("MarketBoostBanner", "onViewAttachedToWindow: start count down timer");
            countDownTimer.cancel();
            countDownTimer.start();
            this.OLrzqt.add(countDownTimer);
        }
    }

    /* JADX DEBUG: Method merged with bridge method: onViewDetachedFromWindow(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public void onViewDetachedFromWindow(@NotNull AbstractC40511qYo.Activity<C42794rdD> activity) {
        Intrinsics.checkNotNullParameter(activity, "");
        super.onViewDetachedFromWindow(activity);
        java.lang.Object tag = activity.itemView.getTag(qZH.StateListAnimator.sElUiK);
        android.os.CountDownTimer countDownTimer = tag instanceof android.os.CountDownTimer ? (android.os.CountDownTimer) tag : null;
        if (countDownTimer != null) {
            pUU.KWHzl("MarketBoostBanner", "onViewDetachedFromWindow: cancel count down timer");
            countDownTimer.cancel();
            this.OLrzqt.remove(countDownTimer);
        }
    }

    /* JADX DEBUG: Method merged with bridge method: onViewRecycled(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V */
    @Override // o.AbstractC40511qYo, androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public void onViewRecycled(@NotNull AbstractC40511qYo.Activity<C42794rdD> activity) {
        Intrinsics.checkNotNullParameter(activity, "");
        super.onViewRecycled(activity);
        java.lang.Object tag = activity.itemView.getTag(qZH.StateListAnimator.sElUiK);
        android.os.CountDownTimer countDownTimer = tag instanceof android.os.CountDownTimer ? (android.os.CountDownTimer) tag : null;
        if (countDownTimer != null) {
            pUU.KWHzl("MarketBoostBanner", "onViewRecycled: cancel count down timer");
            countDownTimer.cancel();
            this.OLrzqt.remove(countDownTimer);
        }
    }

    public final void EZpvd(C42794rdD c42794rdD, pZT pzt) {
        xWA xwa;
        if ((pzt != null ? pzt.copydefault() : 0L) > 0) {
            java.util.List listKWHzl = C43251rlk.KWHzl(C56524yIo.AEQbTJ(xWA.class));
            if (listKWHzl == null || (xwa = (xWA) CollectionsKt___CollectionsKt.AuCTelauCTel(listKWHzl)) == null) {
                return;
            }
            java.lang.String strGEmmrt = C33129mqd.gEmmrt(pzt != null ? java.lang.Long.valueOf(pzt.copydefault()) : null);
            android.content.Context context = c42794rdD.getRoot().getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            xwa.OLrzqt(strGEmmrt, context);
            return;
        }
        pUU.KWHzl("MarketBoostBanner", "click card failed activityId is invalid:" + (pzt != null ? java.lang.Long.valueOf(pzt.copydefault()) : null));
    }

    public static /* synthetic */ void loadTiledBackgroundForImageView$default(C40580qad c40580qad, android.content.Context context, android.widget.ImageView imageView, java.lang.String str, int i, int i2, int i3, int i4, java.lang.Object obj) {
        if ((i4 & 8) != 0) {
            i = qZH.Activity.fIwbmz;
        }
        int i5 = i;
        if ((i4 & 16) != 0) {
            C33566myq c33566myq = C33566myq.EZpvd;
            android.content.Context context2 = imageView.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            i2 = c33566myq.EZpvd(context2) - C55298xhM.dp2px$default(60.0f, null, 1, null);
        }
        int i6 = i2;
        if ((i4 & 32) != 0) {
            i3 = C55298xhM.dp2px$default(210.0f, null, 1, null);
        }
        c40580qad.EZpvd(context, imageView, str, i5, i6, i3);
    }

    public final void EZpvd(android.content.Context context, android.widget.ImageView imageView, java.lang.String str, int i, int i2, int i3) {
        Glide.KWHzl(imageView).EZpvd(str).fetchVPNInfo().OLrzqt((RX<?>) new C5448Sc().copydefault(i2, i3)).OLrzqt(new TaskDescription(imageView));
    }

    /* JADX INFO: renamed from: o.qad$TaskDescription */
    public static final class TaskDescription extends C5452Sg {
        public final /* synthetic */ android.widget.ImageView AYXKKw;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TaskDescription(android.widget.ImageView imageView) {
            super(imageView);
            this.AYXKKw = imageView;
        }

        @Override // o.AbstractC5458Sm, o.AbstractC5453Sh, o.InterfaceC5462Sq
        public void AEQbTJ(android.graphics.drawable.Drawable drawable) {
            this.AYXKKw.setImageDrawable(null);
        }
    }

    public final boolean copydefault(@NotNull android.content.Context context) {
        java.lang.Object objM7377constructorimpl;
        Intrinsics.checkNotNullParameter(context, "");
        try {
            Result.Application application = Result.Companion;
            android.view.WindowManager windowManager = (android.view.WindowManager) context.getSystemService(android.view.WindowManager.class);
            if (windowManager == null) {
                return false;
            }
            android.util.DisplayMetrics displayMetrics = new android.util.DisplayMetrics();
            android.view.Display defaultDisplay = windowManager.getDefaultDisplay();
            if (defaultDisplay == null) {
                return false;
            }
            defaultDisplay.getMetrics(displayMetrics);
            objM7377constructorimpl = Result.m7377constructorimpl(java.lang.Boolean.valueOf(((float) displayMetrics.widthPixels) / displayMetrics.density >= 724.0f));
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
            objM7377constructorimpl = bool;
        }
        return ((java.lang.Boolean) objM7377constructorimpl).booleanValue();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onAttachedToRecyclerView(@NotNull RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "");
        super.onAttachedToRecyclerView(recyclerView);
        this.KWHzl = recyclerView;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onDetachedFromRecyclerView(@NotNull RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "");
        super.onDetachedFromRecyclerView(recyclerView);
        this.KWHzl = null;
    }

    public final void EZpvd() {
        try {
            Result.Application application = Result.Companion;
            pUU.KWHzl("MarketBoostBanner", "cancelAllTimers: canceling " + this.OLrzqt.size() + " timers");
            java.util.Iterator<T> it = this.OLrzqt.iterator();
            while (it.hasNext()) {
                ((android.os.CountDownTimer) it.next()).cancel();
            }
            this.OLrzqt.clear();
            Result.m7377constructorimpl(Unit.INSTANCE);
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
    }
}
