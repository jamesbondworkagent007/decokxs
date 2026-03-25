package o;

import android.view.View;
import androidx.fragment.app.ViewKt;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC39957qEa;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class qEF extends AbstractC39964qEh<C40002qFs, C42882rem> {
    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/viewbinding/ViewBinding; */
    @Override // o.AbstractC40510qYn
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public C42882rem AEQbTJ(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        C42882rem c42882remKWHzl = C42882rem.KWHzl(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c42882remKWHzl, "");
        return c42882remKWHzl;
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Landroidx/viewbinding/ViewBinding;ILo/qYt;)V */
    @Override // o.AbstractC40510qYn
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public void AEQbTJ(@NotNull final C42882rem c42882rem, final int i, @NotNull final C40002qFs c40002qFs) {
        Intrinsics.checkNotNullParameter(c42882rem, "");
        Intrinsics.checkNotNullParameter(c40002qFs, "");
        C41431qqg.AEQbTJ(c42882rem.OLrzqt, c40002qFs.EZpvd(), (Function1<? super C52794wYp, Unit>) new Function1() { // from class: o.qED
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return qEF.EZpvd(c42882rem, c40002qFs, i, (C52794wYp) obj);
            }
        });
    }

    public static final Unit EZpvd(C42882rem c42882rem, C40002qFs c40002qFs, int i, C52794wYp c52794wYp) {
        Intrinsics.checkNotNullParameter(c52794wYp, "");
        c52794wYp.setOnClickListener(new ActionBar(c52794wYp, 1000L, c42882rem, c40002qFs, c52794wYp, i));
        return Unit.INSTANCE;
    }

    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ int AEQbTJ;
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ C52794wYp KWHzl;
        public final /* synthetic */ C40002qFs OLrzqt;
        public final /* synthetic */ C42882rem copydefault;
        public final /* synthetic */ long gEmmrt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, C42882rem c42882rem, C40002qFs c40002qFs, C52794wYp c52794wYp, int i) {
            this.EZpvd = view;
            this.gEmmrt = j;
            this.copydefault = c42882rem;
            this.OLrzqt = c40002qFs;
            this.KWHzl = c52794wYp;
            this.AEQbTJ = i;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            java.lang.Object objM7377constructorimpl;
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.gEmmrt || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                android.widget.FrameLayout root = this.copydefault.getRoot();
                Intrinsics.checkNotNullExpressionValue(root, "");
                try {
                    Result.Application application = Result.Companion;
                    objM7377constructorimpl = Result.m7377constructorimpl(ViewKt.findFragment(root));
                } catch (java.lang.Throwable th) {
                    Result.Application application2 = Result.Companion;
                    objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                }
                if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
                    objM7377constructorimpl = null;
                }
                androidx.fragment.app.Fragment fragment = (androidx.fragment.app.Fragment) objM7377constructorimpl;
                if (fragment != null) {
                    boolean z = fragment instanceof InterfaceC39957qEa;
                    java.lang.Object obj = fragment;
                    if (!z) {
                        androidx.fragment.app.Fragment parentFragment = fragment.getParentFragment();
                        while (parentFragment != null && !(parentFragment instanceof InterfaceC39957qEa)) {
                            parentFragment = parentFragment.getParentFragment();
                        }
                        boolean z2 = parentFragment instanceof InterfaceC39957qEa;
                        java.lang.Object obj2 = parentFragment;
                        if (!z2) {
                            obj2 = null;
                        }
                        obj = (InterfaceC39957qEa) obj2;
                    }
                    InterfaceC39957qEa interfaceC39957qEa = (InterfaceC39957qEa) obj;
                    if (interfaceC39957qEa != null) {
                        InterfaceC39957qEa.ActionBar.navToPage$default(interfaceC39957qEa, this.OLrzqt.OLrzqt(), false, 2, null);
                    }
                }
                Intrinsics.copydefault(this.KWHzl);
                qHN qhnOLrzqt = qHO.OLrzqt(this.KWHzl);
                if (qhnOLrzqt != null) {
                    qhnOLrzqt.copydefault(this.AEQbTJ, this.OLrzqt.OLrzqt());
                }
            }
        }
    }
}
