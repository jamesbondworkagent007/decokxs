package o;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C33834nHo;
import o.C35399nuc;
import o.InterfaceC35897oHt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nHo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C33834nHo implements InterfaceC35897oHt<java.lang.Object> {
    public Function1<? super nGS, Unit> AEQbTJ;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: kotlin.jvm.functions.Function1<? super o.nGS, kotlin.Unit>, kotlin.jvm.functions.Function1<o.nGS, kotlin.Unit> */
    public final Function1<nGS, Unit> KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(Function1<? super nGS, Unit> function1) {
        this.AEQbTJ = function1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC35897oHt
    public void copydefault(@NotNull C35895oHr c35895oHr, @NotNull java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(c35895oHr, "");
        Intrinsics.checkNotNullParameter(obj, "");
    }

    @Override // o.InterfaceC35897oHt
    public void AEQbTJ(@NotNull C35895oHr c35895oHr, @NotNull java.lang.Object obj, @NotNull java.util.List<? extends java.lang.Object> list) {
        InterfaceC35897oHt.Application.AEQbTJ(this, c35895oHr, obj, list);
    }

    /* JADX INFO: renamed from: o.nHo$StateListAnimator */
    public final class StateListAnimator extends C35895oHr {
        public final C35901oHx EZpvd;
        public final /* synthetic */ C33834nHo KWHzl;
        public final RecyclerView copydefault;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StateListAnimator(@NotNull final C33834nHo c33834nHo, android.view.View view) {
            super(view.getContext(), view);
            Intrinsics.checkNotNullParameter(view, "");
            this.KWHzl = c33834nHo;
            android.view.View viewFindViewById = view.findViewById(C35399nuc.StateListAnimator.fDu);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "");
            RecyclerView recyclerView = (RecyclerView) viewFindViewById;
            this.copydefault = recyclerView;
            C35901oHx c35901oHx = new C35901oHx(new Function1() { // from class: o.nHr
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C33834nHo.StateListAnimator.OLrzqt(c33834nHo, (nGS) obj);
                }
            }, false, null, 4, null);
            this.EZpvd = c35901oHx;
            recyclerView.setLayoutManager(new LinearLayoutManager(view.getContext(), 0, false));
            recyclerView.setAdapter(c35901oHx);
            recyclerView.setPadding(C55298xhM.dp2px$default(12.0f, null, 1, null), 0, C55298xhM.dp2px$default(12.0f, null, 1, null), 0);
            recyclerView.setClipToPadding(false);
            recyclerView.addOnItemTouchListener(new RecyclerView.OnItemTouchListener() { // from class: o.nHo.StateListAnimator.1
                @Override // androidx.recyclerview.widget.RecyclerView.OnItemTouchListener
                public void onRequestDisallowInterceptTouchEvent(boolean z) {
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // androidx.recyclerview.widget.RecyclerView.OnItemTouchListener
                public void onTouchEvent(RecyclerView recyclerView2, android.view.MotionEvent motionEvent) {
                    Intrinsics.checkNotNullParameter(recyclerView2, "");
                    Intrinsics.checkNotNullParameter(motionEvent, "");
                }

                @Override // androidx.recyclerview.widget.RecyclerView.OnItemTouchListener
                public boolean onInterceptTouchEvent(RecyclerView recyclerView2, android.view.MotionEvent motionEvent) {
                    Intrinsics.checkNotNullParameter(recyclerView2, "");
                    Intrinsics.checkNotNullParameter(motionEvent, "");
                    if (motionEvent.getAction() != 0) {
                        return false;
                    }
                    recyclerView2.getParent().requestDisallowInterceptTouchEvent(true);
                    return false;
                }
            });
        }

        public static final Unit OLrzqt(C33834nHo c33834nHo, nGS ngs) {
            Intrinsics.checkNotNullParameter(ngs, "");
            Function1<nGS, Unit> function1KWHzl = c33834nHo.KWHzl();
            if (function1KWHzl != null) {
                function1KWHzl.invoke(ngs);
            }
            return Unit.INSTANCE;
        }

        public final void KWHzl(@NotNull nGP ngp) {
            Intrinsics.checkNotNullParameter(ngp, "");
            this.EZpvd.copydefault(CollectionsKt___CollectionsKt.AhwBna((java.lang.Iterable) ngp.AEQbTJ(), 10));
        }
    }

    @Override // o.InterfaceC35897oHt
    public C35895oHr AEQbTJ(@NotNull android.view.ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        android.view.View viewInflate = android.view.LayoutInflater.from(viewGroup.getContext()).inflate(C35399nuc.Dialog.invokespecialROgMPW, viewGroup, false);
        Intrinsics.copydefault(viewInflate);
        return new StateListAnimator(this, viewInflate);
    }

    @Override // o.InterfaceC35897oHt
    public boolean AEQbTJ(@NotNull java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return obj instanceof nGP;
    }

    @Override // o.InterfaceC35897oHt
    public void AEQbTJ(@NotNull C35895oHr c35895oHr, @NotNull java.lang.Object obj, int i) {
        Intrinsics.checkNotNullParameter(c35895oHr, "");
        Intrinsics.checkNotNullParameter(obj, "");
        if ((c35895oHr instanceof StateListAnimator) && (obj instanceof nGP)) {
            ((StateListAnimator) c35895oHr).KWHzl((nGP) obj);
        }
    }
}
