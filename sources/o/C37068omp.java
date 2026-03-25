package o;

import androidx.compose.material3.TooltipKt;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.im.imui.messageV2.view.messagelist.MessageListViewModel;
import com.okinc.okimcore.model.im.OKMessage;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.omp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C37068omp {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int copydefault = 8;
    public final C37005olf AEQbTJ;
    public final RecyclerView AYXKKw;
    public java.lang.Integer AhwBna;
    public boolean EZpvd;
    public final C36568odS KWHzl;
    public final LifecycleCoroutineScope OLrzqt;
    public final MessageListViewModel djBIcL;

    public C37068omp(@NotNull RecyclerView recyclerView, @NotNull C37005olf c37005olf, @NotNull MessageListViewModel messageListViewModel, @NotNull LifecycleCoroutineScope lifecycleCoroutineScope) {
        Intrinsics.checkNotNullParameter(recyclerView, "");
        Intrinsics.checkNotNullParameter(c37005olf, "");
        Intrinsics.checkNotNullParameter(messageListViewModel, "");
        Intrinsics.checkNotNullParameter(lifecycleCoroutineScope, "");
        this.AYXKKw = recyclerView;
        this.AEQbTJ = c37005olf;
        this.djBIcL = messageListViewModel;
        this.OLrzqt = lifecycleCoroutineScope;
        this.KWHzl = new C36568odS(recyclerView, lifecycleCoroutineScope);
        this.AhwBna = 0;
        recyclerView.addOnScrollListener(new RecyclerView.OnScrollListener() { // from class: o.omp.5
            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public void onScrollStateChanged(RecyclerView recyclerView2, int i) {
                Intrinsics.checkNotNullParameter(recyclerView2, "");
                super.onScrollStateChanged(recyclerView2, i);
                java.lang.Integer num = C37068omp.this.AhwBna;
                if (num != null && num.intValue() == 1 && i == 2) {
                    C37068omp.this.EZpvd = true;
                }
                C37068omp.this.AhwBna = java.lang.Integer.valueOf(i);
                if (i == 0) {
                    C37068omp.this.EZpvd = false;
                }
            }

            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public void onScrolled(RecyclerView recyclerView2, int i, int i2) {
                Intrinsics.checkNotNullParameter(recyclerView2, "");
                super.onScrolled(recyclerView2, i, i2);
            }
        });
    }

    /* JADX INFO: renamed from: o.omp$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.omp.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    public final java.lang.Integer copydefault(long j) {
        java.util.List<C35254nrp> currentList = this.AEQbTJ.getCurrentList();
        Intrinsics.checkNotNullExpressionValue(currentList, "");
        java.util.Iterator<C35254nrp> it = currentList.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            if (it.next().OLrzqt().getSeq() == j) {
                break;
            }
            i++;
        }
        java.lang.Integer numValueOf = java.lang.Integer.valueOf(i);
        if (numValueOf.intValue() >= 0) {
            return numValueOf;
        }
        return null;
    }

    public static /* synthetic */ void scrollToCenterByMessageId$default(C37068omp c37068omp, long j, boolean z, Function0 function0, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        c37068omp.copydefault(j, z, (Function0<Unit>) function0);
    }

    public final void copydefault(long j, boolean z, Function0<Unit> function0) {
        pUU.EZpvd("MessageListScrollController", "postScrollToCenter: " + j);
        java.lang.Integer numCopydefault = copydefault(j);
        if (numCopydefault != null) {
            this.KWHzl.copydefault(numCopydefault.intValue(), z, function0);
        }
    }

    public final void EZpvd(boolean z) {
        pUU.EZpvd("MessageListScrollController", "scrollToBottom animate=" + z);
        java.util.List<C35254nrp> currentList = this.AEQbTJ.getCurrentList();
        Intrinsics.checkNotNullExpressionValue(currentList, "");
        int iAuCTel = yDY.AuCTel(currentList);
        pUU.EZpvd("MessageListScrollController", "scrollToBottom lastPosition=" + iAuCTel);
        if (iAuCTel >= 0) {
            if (z) {
                C35956oJy.AEQbTJ(this.AYXKKw, iAuCTel);
            } else {
                this.AYXKKw.scrollToPosition(iAuCTel);
            }
        }
    }

    public final boolean EZpvd() {
        boolean z = !this.AYXKKw.canScrollVertically(1);
        pUU.EZpvd("MessageListScrollController", "isAtBottom: " + z);
        return z;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.omp */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void handle$default(C37068omp c37068omp, MessageListViewModel.ActionBar actionBar, Function0 function0, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            function0 = null;
        }
        c37068omp.copydefault(actionBar, (Function0<Unit>) function0);
    }

    public final void copydefault(@NotNull MessageListViewModel.ActionBar actionBar, Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(actionBar, "");
        pUU.EZpvd("MessageListScrollController", "handle: scenario=" + actionBar.copydefault());
        java.lang.Integer numCopydefault = actionBar.copydefault();
        if (numCopydefault != null && numCopydefault.intValue() == 0) {
            AEQbTJ(actionBar, function0);
            return;
        }
        if (numCopydefault != null && numCopydefault.intValue() == 1) {
            KWHzl(actionBar, function0);
            return;
        }
        if (numCopydefault != null && numCopydefault.intValue() == 2) {
            EZpvd(actionBar, function0);
            return;
        }
        if (numCopydefault != null && numCopydefault.intValue() == 4) {
            AYXKKw(actionBar, function0);
            return;
        }
        if (numCopydefault != null && numCopydefault.intValue() == 3) {
            OLrzqt(actionBar, function0);
            return;
        }
        if (numCopydefault != null && numCopydefault.intValue() == 5) {
            valueOf(actionBar, function0);
        } else if (numCopydefault != null && numCopydefault.intValue() == 6) {
            AYXKKw(actionBar, function0);
        } else {
            OLrzqt(actionBar, function0);
        }
    }

    public final void AEQbTJ(MessageListViewModel.ActionBar actionBar, final Function0<Unit> function0) {
        this.AEQbTJ.submitList(actionBar.KWHzl().AEQbTJ(), new java.lang.Runnable() { // from class: o.omu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C37068omp.OLrzqt(this.EZpvd, function0);
            }
        });
    }

    public static final void OLrzqt(C37068omp c37068omp, Function0 function0) {
        c37068omp.djBIcL.AhwBna((OKMessage) null);
        c37068omp.EZpvd(false);
        if (function0 != null) {
            function0.invoke();
        }
    }

    public final void KWHzl(MessageListViewModel.ActionBar actionBar, final Function0<Unit> function0) {
        OKMessage oKMessageAkhnZx = actionBar.KWHzl().AkhnZx();
        final java.lang.Long lValueOf = oKMessageAkhnZx != null ? java.lang.Long.valueOf(oKMessageAkhnZx.getSeq()) : null;
        java.util.List<C35254nrp> listAEQbTJ = actionBar.KWHzl().AEQbTJ();
        if (lValueOf == null) {
            this.AEQbTJ.submitList(listAEQbTJ, new java.lang.Runnable() { // from class: o.omz
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    C37068omp.EZpvd(function0);
                }
            });
        } else {
            this.AEQbTJ.submitList(listAEQbTJ, new java.lang.Runnable() { // from class: o.omE
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    C37068omp.KWHzl(this.KWHzl, lValueOf, function0);
                }
            });
        }
    }

    public static final void EZpvd(Function0 function0) {
        if (function0 != null) {
            function0.invoke();
        }
    }

    public static final void KWHzl(final C37068omp c37068omp, java.lang.Long l, Function0 function0) {
        c37068omp.djBIcL.AhwBna((OKMessage) null);
        scrollToCenterByMessageId$default(c37068omp, l.longValue(), false, new Function0() { // from class: o.omD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C37068omp.AhwBna(this.copydefault);
            }
        }, 2, null);
        if (function0 != null) {
            function0.invoke();
        }
    }

    public static final Unit AhwBna(final C37068omp c37068omp) {
        c37068omp.AYXKKw.postDelayed(new java.lang.Runnable() { // from class: o.omB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C37068omp.gEmmrt(this.OLrzqt);
            }
        }, 3000L);
        return Unit.INSTANCE;
    }

    public static final void gEmmrt(C37068omp c37068omp) {
        c37068omp.djBIcL.zLjUOn();
    }

    public final void valueOf(MessageListViewModel.ActionBar actionBar, final Function0<Unit> function0) {
        final java.lang.Long lCopydefault = actionBar.KWHzl().copydefault();
        java.util.List<C35254nrp> listAEQbTJ = actionBar.KWHzl().AEQbTJ();
        if (lCopydefault == null) {
            this.AEQbTJ.submitList(listAEQbTJ, new java.lang.Runnable() { // from class: o.omH
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    C37068omp.AYXKKw(function0);
                }
            });
        } else {
            this.AEQbTJ.submitList(listAEQbTJ, new java.lang.Runnable() { // from class: o.omv
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    C37068omp.djBIcL(this.copydefault, lCopydefault, function0);
                }
            });
        }
    }

    public static final void AYXKKw(Function0 function0) {
        if (function0 != null) {
            function0.invoke();
        }
    }

    public static final void djBIcL(C37068omp c37068omp, java.lang.Long l, Function0 function0) {
        c37068omp.djBIcL.AhwBna((OKMessage) null);
        c37068omp.copydefault(l.longValue(), false, new Function0() { // from class: o.omA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C37068omp.KWHzl();
            }
        });
        if (function0 != null) {
            function0.invoke();
        }
    }

    public static final Unit KWHzl() {
        return Unit.INSTANCE;
    }

    public final void EZpvd(MessageListViewModel.ActionBar actionBar, final Function0<Unit> function0) {
        OKMessage oKMessageAkhnZx = actionBar.KWHzl().AkhnZx();
        final java.lang.Long lValueOf = oKMessageAkhnZx != null ? java.lang.Long.valueOf(oKMessageAkhnZx.getSeq()) : null;
        java.util.List<C35254nrp> listAEQbTJ = actionBar.KWHzl().AEQbTJ();
        if (lValueOf == null) {
            this.AEQbTJ.submitList(listAEQbTJ, new java.lang.Runnable() { // from class: o.omt
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    C37068omp.copydefault(function0);
                }
            });
        } else {
            this.AEQbTJ.submitList(listAEQbTJ, new java.lang.Runnable() { // from class: o.omy
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    C37068omp.AEQbTJ(this.AEQbTJ, lValueOf, function0);
                }
            });
        }
    }

    public static final void copydefault(Function0 function0) {
        if (function0 != null) {
            function0.invoke();
        }
    }

    public static final void AEQbTJ(final C37068omp c37068omp, java.lang.Long l, Function0 function0) {
        c37068omp.djBIcL.AhwBna((OKMessage) null);
        scrollToCenterByMessageId$default(c37068omp, l.longValue(), false, new Function0() { // from class: o.omw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C37068omp.AYXKKw(this.AEQbTJ);
            }
        }, 2, null);
        if (function0 != null) {
            function0.invoke();
        }
    }

    public static final Unit AYXKKw(final C37068omp c37068omp) {
        c37068omp.AYXKKw.postDelayed(new java.lang.Runnable() { // from class: o.omx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C37068omp.valueOf(this.AEQbTJ);
            }
        }, TooltipKt.TooltipDuration);
        return Unit.INSTANCE;
    }

    public static final void valueOf(C37068omp c37068omp) {
        c37068omp.djBIcL.zLjUOn();
    }

    public final boolean KWHzl(OKMessage oKMessage) {
        java.lang.String strKWHzl = C44157sFk.KWHzl();
        if (oKMessage == null) {
            return false;
        }
        return Intrinsics.EZpvd((java.lang.Object) oKMessage.getSenderUserId(), (java.lang.Object) strKWHzl);
    }

    public final void OLrzqt(MessageListViewModel.ActionBar actionBar, final Function0<Unit> function0) {
        java.util.List<C35254nrp> listAEQbTJ = actionBar.KWHzl().AEQbTJ();
        final OKMessage oKMessageAhwBna = actionBar.KWHzl().AhwBna();
        this.AEQbTJ.submitList(listAEQbTJ, new java.lang.Runnable() { // from class: o.omG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C37068omp.copydefault(this.AEQbTJ, oKMessageAhwBna, function0);
            }
        });
    }

    public static final void copydefault(C37068omp c37068omp, OKMessage oKMessage, Function0 function0) {
        boolean zOLrzqt = c37068omp.OLrzqt(oKMessage);
        c37068omp.djBIcL.AhwBna((OKMessage) null);
        if (zOLrzqt) {
            c37068omp.EZpvd(true);
        }
        if (function0 != null) {
            function0.invoke();
        }
    }

    public final boolean OLrzqt(OKMessage oKMessage) {
        if (oKMessage == null || this.EZpvd) {
            return false;
        }
        boolean zKWHzl = KWHzl(oKMessage);
        boolean zEZpvd = EZpvd();
        java.lang.Integer num = this.AhwBna;
        return zEZpvd || zKWHzl || (num != null && num.intValue() == 2);
    }

    public final void AYXKKw(MessageListViewModel.ActionBar actionBar, final Function0<Unit> function0) {
        this.AEQbTJ.submitList(actionBar.KWHzl().AEQbTJ(), new java.lang.Runnable() { // from class: o.omC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C37068omp.KWHzl(this.copydefault, function0);
            }
        });
    }

    public static final void KWHzl(C37068omp c37068omp, Function0 function0) {
        c37068omp.djBIcL.AhwBna((OKMessage) null);
        c37068omp.EZpvd(true);
        if (function0 != null) {
            function0.invoke();
        }
    }
}
