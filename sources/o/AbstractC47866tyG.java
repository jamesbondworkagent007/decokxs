package o;

import android.view.View;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.uilab.stateful.StatefulView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C47501trL;
import o.InterfaceC47918tzF;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tyG, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public abstract class AbstractC47866tyG<VM extends InterfaceC47918tzF> extends AbstractC32996moC {
    public tMD EZpvd;
    public boolean KWHzl;
    public boolean OLrzqt;
    public final C59534zip AEQbTJ = new C59534zip();
    public final int copydefault = C47501trL.Application.AuCTel;

    /* JADX INFO: renamed from: o.tyG$StateListAnimator */
    public final /* synthetic */ class StateListAnimator {
        public static final /* synthetic */ int[] AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[StatefulView.Status.values().length];
            try {
                iArr[StatefulView.Status.Error.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[StatefulView.Status.Empty.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[StatefulView.Status.Content.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            AEQbTJ = iArr;
        }
    }

    /* JADX INFO: renamed from: o.tyG$TaskDescription */
    public static final /* synthetic */ class TaskDescription implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.EZpvd = function1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean equals(java.lang.Object obj) {
            if ((obj instanceof Observer) && (obj instanceof InterfaceC56514yIe)) {
                return Intrinsics.EZpvd(getFunctionDelegate(), ((InterfaceC56514yIe) obj).getFunctionDelegate());
            }
            return false;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC56514yIe
        public final InterfaceC56388yDn<?> getFunctionDelegate() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(java.lang.Object obj) {
            this.EZpvd.invoke(obj);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void AEQbTJ(@NotNull C59534zip c59534zip) {
        Intrinsics.checkNotNullParameter(c59534zip, "");
    }

    public void OLrzqt(C55173xeu c55173xeu) {
    }

    public abstract VM copydefault();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return this.copydefault;
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        this.EZpvd = tMD.OLrzqt(view);
        AEQbTJ();
        EZpvd();
        tMD tmd = this.EZpvd;
        if (tmd == null) {
            Intrinsics.gEmmrt("");
            tmd = null;
        }
        final C33546myW c33546myW = tmd.KWHzl;
        c33546myW.OLrzqt(new InterfaceC57903yrG() { // from class: o.tyE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC57903yrG
            public final void copydefault(InterfaceC57934yrl interfaceC57934yrl) {
                AbstractC47866tyG.AEQbTJ(this.EZpvd, interfaceC57934yrl);
            }
        });
        c33546myW.KWHzl(new InterfaceC57900yrD() { // from class: o.tyH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC57900yrD
            public final void EZpvd(InterfaceC57934yrl interfaceC57934yrl) {
                AbstractC47866tyG.KWHzl(this.copydefault, c33546myW, interfaceC57934yrl);
            }
        });
        pUU.KWHzl("BaseMineActivityFragment", "initView-->:" + getClass().getSimpleName());
    }

    public static final void AEQbTJ(AbstractC47866tyG abstractC47866tyG, InterfaceC57934yrl interfaceC57934yrl) {
        Intrinsics.checkNotNullParameter(interfaceC57934yrl, "");
        abstractC47866tyG.copydefault().EZpvd(false);
    }

    public static final void KWHzl(AbstractC47866tyG abstractC47866tyG, C33546myW c33546myW, InterfaceC57934yrl interfaceC57934yrl) {
        Intrinsics.checkNotNullParameter(interfaceC57934yrl, "");
        if (abstractC47866tyG.copydefault().OLrzqt()) {
            return;
        }
        c33546myW.AYXKKw();
    }

    @Override // o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        if (this.KWHzl) {
            return;
        }
        copydefault().EZpvd(true);
        this.KWHzl = true;
    }

    private final void EZpvd() {
        InterfaceC47918tzF interfaceC47918tzFCopydefault = copydefault();
        interfaceC47918tzFCopydefault.EZpvd().observe(getViewLifecycleOwner(), new TaskDescription(new Function1() { // from class: o.tyM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AbstractC47866tyG.AEQbTJ(this.KWHzl, (C47914tzB) obj);
            }
        }));
        interfaceC47918tzFCopydefault.copydefault().observe(getViewLifecycleOwner(), new TaskDescription(new Function1() { // from class: o.tyL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AbstractC47866tyG.KWHzl(this.AEQbTJ, (java.lang.String) obj);
            }
        }));
    }

    public static final Unit AEQbTJ(AbstractC47866tyG abstractC47866tyG, C47914tzB c47914tzB) {
        tMD tmd = abstractC47866tyG.EZpvd;
        if (tmd == null) {
            Intrinsics.gEmmrt("");
            tmd = null;
        }
        C55237xgE c55237xgE = tmd.copydefault;
        Intrinsics.checkNotNullExpressionValue(c55237xgE, "");
        tMD tmd2 = abstractC47866tyG.EZpvd;
        if (tmd2 == null) {
            Intrinsics.gEmmrt("");
            tmd2 = null;
        }
        C33546myW c33546myW = tmd2.KWHzl;
        Intrinsics.checkNotNullExpressionValue(c33546myW, "");
        c55237xgE.setStatus(c47914tzB.OLrzqt());
        int i = StateListAnimator.AEQbTJ[c47914tzB.OLrzqt().ordinal()];
        if (i == 1) {
            c33546myW.AhwBna(false);
            c33546myW.AEQbTJ();
            android.view.View viewAEQbTJ = c55237xgE.AEQbTJ(StatefulView.Status.Error);
            abstractC47866tyG.EZpvd(viewAEQbTJ != null ? (C55173xeu) viewAEQbTJ.findViewById(C47501trL.TaskDescription.vLaW) : null);
            if (!abstractC47866tyG.OLrzqt) {
                abstractC47866tyG.OLrzqt = true;
                rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) abstractC47866tyG, false, (java.lang.String) null, 2, (java.lang.Object) null);
            }
        } else if (i == 2) {
            c33546myW.AhwBna(false);
            c33546myW.AEQbTJ();
            android.view.View viewAEQbTJ2 = c55237xgE.AEQbTJ(StatefulView.Status.Empty);
            abstractC47866tyG.OLrzqt(viewAEQbTJ2 != null ? (C55173xeu) viewAEQbTJ2.findViewById(C47501trL.TaskDescription.swzYdv) : null);
            if (!abstractC47866tyG.OLrzqt) {
                abstractC47866tyG.OLrzqt = true;
                rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) abstractC47866tyG, true, (java.lang.String) null, 2, (java.lang.Object) null);
            }
        } else if (i == 3) {
            if (c47914tzB.EZpvd()) {
                if (c47914tzB.KWHzl()) {
                    c33546myW.AhwBna(true);
                    c33546myW.AEQbTJ();
                } else {
                    c33546myW.AhwBna(false);
                    c33546myW.OLrzqt();
                }
            } else if (c47914tzB.KWHzl()) {
                c33546myW.AhwBna(true);
                c33546myW.valueOf();
            } else {
                c33546myW.AhwBna(false);
                c33546myW.AYXKKw();
            }
            abstractC47866tyG.AEQbTJ.setItems(c47914tzB.AEQbTJ());
            abstractC47866tyG.AEQbTJ.notifyDataSetChanged();
            if (!abstractC47866tyG.OLrzqt) {
                abstractC47866tyG.OLrzqt = true;
                rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) abstractC47866tyG, true, (java.lang.String) null, 2, (java.lang.Object) null);
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(AbstractC47866tyG abstractC47866tyG, java.lang.String str) {
        tMD tmd = abstractC47866tyG.EZpvd;
        if (tmd == null) {
            Intrinsics.gEmmrt("");
            tmd = null;
        }
        tmd.KWHzl.valueOf();
        if (str != null) {
            C55326xho.toastWithFailedIcon$default(str, 0, 1, (java.lang.Object) null);
        }
        return Unit.INSTANCE;
    }

    public void EZpvd(C55173xeu c55173xeu) {
        if (c55173xeu != null) {
            c55173xeu.setRetryClickListener(new View.OnClickListener() { // from class: o.tyD
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    AbstractC47866tyG.AEQbTJ(this.KWHzl, view);
                }
            });
        }
    }

    public static final void AEQbTJ(AbstractC47866tyG abstractC47866tyG, android.view.View view) {
        abstractC47866tyG.copydefault().EZpvd(true);
    }

    private final void AEQbTJ() {
        tMD tmd = this.EZpvd;
        if (tmd == null) {
            Intrinsics.gEmmrt("");
            tmd = null;
        }
        RecyclerView recyclerView = tmd.EZpvd;
        recyclerView.setLayoutManager(C33047mpA.KWHzl(recyclerView.getContext()));
        this.AEQbTJ.register(java.lang.String.class, new C47961tzw());
        AEQbTJ(this.AEQbTJ);
        recyclerView.addItemDecoration(new C47954tzp(this.AEQbTJ));
        recyclerView.setAdapter(this.AEQbTJ);
    }
}
