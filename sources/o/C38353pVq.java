package o;

import android.animation.ValueAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.okinc.unify_trade.biz.BizInstrument;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.oZI;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.pVq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C38353pVq {
    public final BizInstrument AEQbTJ;
    public final RecyclerView AYXKKw;
    public boolean AhwBna;
    public final Function1<android.view.View, Unit> AkhnZx;
    public int AuCTel;
    public C39764pyW DbNXlk;
    public final android.content.Context EZpvd;
    public final boolean KWHzl;
    public final Function1<java.lang.Boolean, Unit> OLrzqt;
    public final Function0<oZI.Application> copydefault;
    public final Function0<Unit> djBIcL;
    public final Function1<java.lang.String, Unit> fIwbmz;
    public RecyclerView.OnScrollListener fetchVPNInfo;
    public oZI gEmmrt;
    public java.lang.String isConnected;
    public int valueOf;
    public android.view.View values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ() {
        this.AhwBna = true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean EZpvd() {
        return this.DbNXlk != null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean KWHzl() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> */
    /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: kotlin.jvm.functions.Function1<? super android.view.View, kotlin.Unit> */
    /* JADX DEBUG: Multi-variable search result rejected for r8v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public C38353pVq(@NotNull android.content.Context context, @NotNull RecyclerView recyclerView, @NotNull Function0<Unit> function0, @NotNull Function0<oZI.Application> function02, @NotNull Function1<? super java.lang.Boolean, Unit> function1, @NotNull Function1<? super android.view.View, Unit> function12, @NotNull Function1<? super java.lang.String, Unit> function13, boolean z, BizInstrument bizInstrument) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(recyclerView, "");
        Intrinsics.checkNotNullParameter(function0, "");
        Intrinsics.checkNotNullParameter(function02, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function12, "");
        Intrinsics.checkNotNullParameter(function13, "");
        this.EZpvd = context;
        this.AYXKKw = recyclerView;
        this.djBIcL = function0;
        this.copydefault = function02;
        this.OLrzqt = function1;
        this.AkhnZx = function12;
        this.fIwbmz = function13;
        this.KWHzl = z;
        this.AEQbTJ = bizInstrument;
        this.valueOf = 2;
        this.AhwBna = true;
        this.isConnected = TtmlNode.RIGHT;
    }

    public final void djBIcL() {
        this.AYXKKw.setItemAnimator(null);
        this.AYXKKw.setLayoutManager(new LinearLayoutManager(this.EZpvd, 0, false));
        RecyclerView.LayoutManager layoutManager = this.AYXKKw.getLayoutManager();
        Intrinsics.copydefault(layoutManager, "");
        RecyclerView recyclerView = this.AYXKKw;
        oZI ozi = new oZI(null, this.djBIcL, (LinearLayoutManager) layoutManager, recyclerView, 1, null);
        this.gEmmrt = ozi;
        this.AYXKKw.setAdapter(ozi);
        this.AYXKKw.addItemDecoration(new C31703mAu(C55298xhM.OLrzqt(20, this.EZpvd), 0));
        C39764pyW c39764pyW = new C39764pyW(this.AYXKKw);
        this.DbNXlk = c39764pyW;
        c39764pyW.attachToRecyclerView(this.AYXKKw);
        StateListAnimator stateListAnimator = new StateListAnimator();
        this.fetchVPNInfo = stateListAnimator;
        this.AYXKKw.addOnScrollListener(stateListAnimator);
    }

    /* JADX INFO: renamed from: o.pVq$StateListAnimator */
    public static final class StateListAnimator extends RecyclerView.OnScrollListener {
        public StateListAnimator() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            Intrinsics.checkNotNullParameter(recyclerView, "");
            super.onScrolled(recyclerView, i, i2);
            if (i != 0) {
                C38353pVq.this.isConnected = i > 0 ? TtmlNode.RIGHT : TtmlNode.LEFT;
                C38353pVq.this.AuCTel += i;
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            Intrinsics.checkNotNullParameter(recyclerView, "");
            super.onScrollStateChanged(recyclerView, i);
            if (i == 0) {
                C38353pVq.this.OLrzqt();
            } else if (i == 1) {
                C38353pVq.this.copydefault();
            }
            C38353pVq.this.AhwBna = false;
        }
    }

    public final void OLrzqt() {
        java.lang.Integer numValueOf;
        oZI.Application applicationInvoke;
        if (this.valueOf == 0) {
            return;
        }
        if (this.AuCTel != 0) {
            C39764pyW c39764pyW = this.DbNXlk;
            if (c39764pyW == null) {
                Intrinsics.gEmmrt("");
                c39764pyW = null;
            }
            c39764pyW.OLrzqt(this.AuCTel > 0 ? 1 : 2);
            this.AuCTel = 0;
        }
        this.valueOf = 0;
        this.AYXKKw.setHorizontalFadingEdgeEnabled(true);
        if (this.AhwBna) {
            this.AYXKKw.setFadingEdgeLength(0);
        } else {
            AEQbTJ(this.AYXKKw, 0);
        }
        C39764pyW c39764pyW2 = this.DbNXlk;
        if (c39764pyW2 == null) {
            Intrinsics.gEmmrt("");
            c39764pyW2 = null;
        }
        RecyclerView.LayoutManager layoutManager = this.AYXKKw.getLayoutManager();
        if (layoutManager == null) {
            return;
        }
        this.values = c39764pyW2.findSnapView(layoutManager);
        C39764pyW c39764pyW3 = this.DbNXlk;
        if (c39764pyW3 == null) {
            Intrinsics.gEmmrt("");
            c39764pyW3 = null;
        }
        c39764pyW3.OLrzqt(this.values);
        android.view.View view = this.values;
        if (view != null) {
            RecyclerView.LayoutManager layoutManager2 = this.AYXKKw.getLayoutManager();
            Intrinsics.copydefault(layoutManager2, "");
            numValueOf = java.lang.Integer.valueOf(((LinearLayoutManager) layoutManager2).getPosition(view));
        } else {
            numValueOf = null;
        }
        pUU.KWHzl("handleScrollStateIdle", "adapterPosition: " + numValueOf);
        if (numValueOf != null) {
            int iIntValue = numValueOf.intValue();
            oZI ozi = this.gEmmrt;
            if (ozi == null) {
                Intrinsics.gEmmrt("");
                ozi = null;
            }
            ozi.EZpvd(iIntValue, true);
        }
        BizInstrument bizInstrument = this.AEQbTJ;
        if (bizInstrument != null) {
            if ((bizInstrument.isPreMarketPair() ? bizInstrument : null) != null && (applicationInvoke = this.copydefault.invoke()) != null) {
                applicationInvoke.OLrzqt();
            }
        }
        this.OLrzqt.invoke(java.lang.Boolean.FALSE);
        this.AkhnZx.invoke(this.values);
        if (this.AhwBna || this.KWHzl) {
            return;
        }
        android.view.View view2 = this.values;
        if (view2 != null) {
            C37942pGk.AEQbTJ(view2);
        }
        this.fIwbmz.invoke(this.isConnected);
    }

    public final void copydefault() {
        C39764pyW c39764pyW = this.DbNXlk;
        oZI ozi = null;
        if (c39764pyW == null) {
            Intrinsics.gEmmrt("");
            c39764pyW = null;
        }
        c39764pyW.KWHzl();
        C39764pyW c39764pyW2 = this.DbNXlk;
        if (c39764pyW2 == null) {
            Intrinsics.gEmmrt("");
            c39764pyW2 = null;
        }
        c39764pyW2.AEQbTJ(false);
        this.valueOf = 1;
        oZI ozi2 = this.gEmmrt;
        if (ozi2 == null) {
            Intrinsics.gEmmrt("");
        } else {
            ozi = ozi2;
        }
        ozi.KWHzl();
        this.OLrzqt.invoke(java.lang.Boolean.TRUE);
        this.AYXKKw.setHorizontalFadingEdgeEnabled(true);
        AEQbTJ(this.AYXKKw, 38);
    }

    public final void AEQbTJ(final RecyclerView recyclerView, int i) {
        android.animation.ValueAnimator valueAnimatorOfInt = android.animation.ValueAnimator.ofInt(recyclerView.getHorizontalFadingEdgeLength(), i);
        valueAnimatorOfInt.setDuration(200L);
        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: o.pVw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
                C38353pVq.AEQbTJ(recyclerView, valueAnimator);
            }
        });
        valueAnimatorOfInt.start();
    }

    public static final void AEQbTJ(RecyclerView recyclerView, android.animation.ValueAnimator valueAnimator) {
        Intrinsics.checkNotNullParameter(valueAnimator, "");
        java.lang.Object animatedValue = valueAnimator.getAnimatedValue();
        Intrinsics.copydefault(animatedValue, "");
        recyclerView.setFadingEdgeLength(((java.lang.Integer) animatedValue).intValue());
        recyclerView.invalidate();
    }

    public final void AEQbTJ(@NotNull java.util.List<pWP> list) {
        Intrinsics.checkNotNullParameter(list, "");
        oZI ozi = this.gEmmrt;
        if (ozi == null) {
            Intrinsics.gEmmrt("");
            ozi = null;
        }
        ozi.KWHzl(list);
    }

    public final void valueOf() {
        this.valueOf = 1;
        C39764pyW c39764pyW = this.DbNXlk;
        RecyclerView.OnScrollListener onScrollListener = null;
        if (c39764pyW == null) {
            Intrinsics.gEmmrt("");
            c39764pyW = null;
        }
        c39764pyW.KWHzl();
        C39764pyW c39764pyW2 = this.DbNXlk;
        if (c39764pyW2 == null) {
            Intrinsics.gEmmrt("");
            c39764pyW2 = null;
        }
        c39764pyW2.AEQbTJ(true);
        RecyclerView.OnScrollListener onScrollListener2 = this.fetchVPNInfo;
        if (onScrollListener2 == null) {
            Intrinsics.gEmmrt("");
        } else {
            onScrollListener = onScrollListener2;
        }
        onScrollListener.onScrollStateChanged(this.AYXKKw, 0);
    }
}
