package o;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C33826nHg;
import o.C35399nuc;
import o.InterfaceC35897oHt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nHg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C33826nHg implements InterfaceC35897oHt<java.lang.Object> {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int OLrzqt = 8;
    public Function1<? super nGS, Unit> KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: kotlin.jvm.functions.Function1<? super o.nGS, kotlin.Unit>, kotlin.jvm.functions.Function1<o.nGS, kotlin.Unit> */
    public final Function1<nGS, Unit> KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(Function1<? super nGS, Unit> function1) {
        this.KWHzl = function1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC35897oHt
    public void copydefault(@NotNull C35895oHr c35895oHr, @NotNull java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(c35895oHr, "");
        Intrinsics.checkNotNullParameter(obj, "");
    }

    /* JADX INFO: renamed from: o.nHg$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.nHg.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    @Override // o.InterfaceC35897oHt
    public void AEQbTJ(@NotNull C35895oHr c35895oHr, @NotNull java.lang.Object obj, @NotNull java.util.List<? extends java.lang.Object> list) {
        InterfaceC35897oHt.Application.AEQbTJ(this, c35895oHr, obj, list);
    }

    /* JADX INFO: renamed from: o.nHg$TaskDescription */
    public final class TaskDescription extends C35895oHr {
        public final C35901oHx AEQbTJ;
        public final /* synthetic */ C33826nHg OLrzqt;
        public final RecyclerView copydefault;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TaskDescription(@NotNull final C33826nHg c33826nHg, android.view.View view) {
            super(view.getContext(), view);
            Intrinsics.checkNotNullParameter(view, "");
            this.OLrzqt = c33826nHg;
            android.view.View viewFindViewById = view.findViewById(C35399nuc.StateListAnimator.fDu);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "");
            RecyclerView recyclerView = (RecyclerView) viewFindViewById;
            this.copydefault = recyclerView;
            C35901oHx c35901oHx = new C35901oHx(new Function1() { // from class: o.nHk
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C33826nHg.TaskDescription.EZpvd(c33826nHg, (nGS) obj);
                }
            }, true, null, 4, null);
            this.AEQbTJ = c35901oHx;
            recyclerView.setLayoutManager(new LinearLayoutManager(view.getContext(), 1, false));
            recyclerView.setAdapter(c35901oHx);
        }

        public static final Unit EZpvd(C33826nHg c33826nHg, nGS ngs) {
            Intrinsics.checkNotNullParameter(ngs, "");
            Function1<nGS, Unit> function1KWHzl = c33826nHg.KWHzl();
            if (function1KWHzl != null) {
                function1KWHzl.invoke(ngs);
            }
            return Unit.INSTANCE;
        }

        public final void copydefault(@NotNull nGP ngp) {
            Intrinsics.checkNotNullParameter(ngp, "");
            this.AEQbTJ.copydefault(CollectionsKt___CollectionsKt.AhwBna((java.lang.Iterable) ngp.AEQbTJ(), 10));
        }
    }

    @Override // o.InterfaceC35897oHt
    public C35895oHr AEQbTJ(@NotNull android.view.ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        android.view.View viewInflate = android.view.LayoutInflater.from(viewGroup.getContext()).inflate(C35399nuc.Dialog.invokespecialROgMPW, viewGroup, false);
        Intrinsics.copydefault(viewInflate);
        return new TaskDescription(this, viewInflate);
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
        if ((c35895oHr instanceof TaskDescription) && (obj instanceof nGP)) {
            ((TaskDescription) c35895oHr).copydefault((nGP) obj);
        }
    }
}
