package o;

import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import o.C52761wXj;
import o.InterfaceC28823khz;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jQw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC26071jQw extends androidx.fragment.app.Fragment {
    public boolean EZpvd;
    public final InterfaceC56387yDm KWHzl = C56392yDr.copydefault(new Function0() { // from class: o.jQB
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return AbstractC26071jQw.KWHzl(this.AEQbTJ);
        }
    });
    public C23473hyr OLrzqt;

    public abstract void AEQbTJ();

    public abstract boolean AEQbTJ(@NotNull java.lang.String str);

    public abstract Flow<java.util.List<InterfaceC28823khz.ActionBar>> EZpvd();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void EZpvd(@NotNull RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "");
    }

    public void OLrzqt() {
    }

    public abstract void gEmmrt();

    public final kMM KWHzl() {
        return (kMM) this.KWHzl.getValue();
    }

    public static final kMM KWHzl(final AbstractC26071jQw abstractC26071jQw) {
        C28821khx c28821khx = new C28821khx(new Function1() { // from class: o.jQy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Boolean.valueOf(AbstractC26071jQw.EZpvd(this.EZpvd, (java.lang.String) obj));
            }
        }, 0, 2, null);
        kMM kmm = new kMM();
        kmm.register(InterfaceC28823khz.ActionBar.class, c28821khx);
        kmm.register(InterfaceC28823khz.StateListAnimator.class, new C28820khw());
        return kmm;
    }

    public static final boolean EZpvd(AbstractC26071jQw abstractC26071jQw, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return abstractC26071jQw.AEQbTJ(str);
    }

    @Override // androidx.fragment.app.Fragment
    public android.view.View onCreateView(@NotNull android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        C23473hyr c23473hyrEZpvd = C23473hyr.EZpvd(layoutInflater, viewGroup, false);
        this.OLrzqt = c23473hyrEZpvd;
        if (c23473hyrEZpvd != null) {
            return c23473hyrEZpvd.getRoot();
        }
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        OLrzqt();
        valueOf();
        AYXKKw();
    }

    private final void valueOf() {
        C23473hyr c23473hyr = this.OLrzqt;
        if (c23473hyr != null) {
            RecyclerView recyclerView = c23473hyr.djBIcL;
            recyclerView.setAdapter(KWHzl());
            recyclerView.setItemAnimator(null);
            recyclerView.setLayoutManager(new GridLayoutManager(recyclerView.getContext(), 2));
            recyclerView.addItemDecoration(new C31707mAy(0, C55298xhM.dp2px$default(12.0f, null, 1, null)));
            Intrinsics.copydefault(recyclerView);
            EZpvd(recyclerView);
            wYF wyf = c23473hyr.OLrzqt;
            Intrinsics.checkNotNullExpressionValue(wyf, "");
            wyf.setVisibility(8);
            c23473hyr.copydefault.setOnClickListener(new View.OnClickListener() { // from class: o.jQA
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    AbstractC26071jQw.AEQbTJ(this.KWHzl, view);
                }
            });
        }
    }

    public static final void AEQbTJ(AbstractC26071jQw abstractC26071jQw, android.view.View view) {
        boolean z = !abstractC26071jQw.EZpvd;
        abstractC26071jQw.EZpvd = z;
        if (z) {
            abstractC26071jQw.AEQbTJ();
        } else {
            abstractC26071jQw.gEmmrt();
        }
        abstractC26071jQw.AhwBna();
    }

    /* JADX INFO: renamed from: o.jQw$StateListAnimator */
    public static final class StateListAnimator<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object emit(java.util.List<InterfaceC28823khz.ActionBar> list, Continuation<? super Unit> continuation) {
            boolean z;
            android.widget.TextView textView;
            java.util.List listFJNWhG = CollectionsKt___CollectionsKt.fJNWhG((java.util.Collection) list);
            if (listFJNWhG.size() % 2 == 1) {
                listFJNWhG.add(InterfaceC28823khz.StateListAnimator.KWHzl);
            }
            kMM.setData$default(AbstractC26071jQw.this.KWHzl(), listFJNWhG, null, 2, null);
            AbstractC26071jQw abstractC26071jQw = AbstractC26071jQw.this;
            boolean z2 = list instanceof java.util.Collection;
            int i = 0;
            if (z2 && list.isEmpty()) {
                z = true;
            } else {
                java.util.Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    if (!((InterfaceC28823khz.ActionBar) it.next()).EZpvd()) {
                        z = false;
                        break;
                    }
                }
                z = true;
            }
            abstractC26071jQw.EZpvd = z;
            C23473hyr c23473hyr = AbstractC26071jQw.this.OLrzqt;
            if (c23473hyr != null && (textView = c23473hyr.EZpvd) != null) {
                if (!z2 || !list.isEmpty()) {
                    java.util.Iterator<T> it2 = list.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        if (!(!((InterfaceC28823khz.ActionBar) it2.next()).EZpvd())) {
                            i = 4;
                            break;
                        }
                    }
                }
                textView.setVisibility(i);
            }
            AbstractC26071jQw.this.AhwBna();
            rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) AbstractC26071jQw.this, true, (java.lang.String) null, 2, (java.lang.Object) null);
            return Unit.INSTANCE;
        }
    }

    private final void AYXKKw() {
        C25390ivn.collectOnViewLifecycle$default(this, EZpvd(), null, new StateListAnimator(), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void AhwBna() {
        android.widget.ImageView imageView;
        C23473hyr c23473hyr = this.OLrzqt;
        if (c23473hyr == null || (imageView = c23473hyr.AEQbTJ) == null) {
            return;
        }
        imageView.setImageResource(this.EZpvd ? C52761wXj.TaskDescription.gqESXP : C52761wXj.TaskDescription.QqiRNA);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.OLrzqt = null;
    }
}
