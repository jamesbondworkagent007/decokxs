package o;

import com.okinc.kline.ui.component.basic.BaseFragmentDataComponent;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.C39037pkj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.pka, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public abstract class AbstractC39028pka extends AbstractC39009pkH {
    public final InterfaceC56387yDm AEQbTJ;
    public java.lang.String EZpvd;
    public android.content.Context KWHzl;

    public abstract java.util.Set<C39037pkj.TaskDescription> AEQbTJ();

    public AbstractC39028pka() {
        java.lang.String simpleName = getClass().getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "");
        this.EZpvd = simpleName;
        this.AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.pkf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return AbstractC39028pka.AEQbTJ(this.OLrzqt);
            }
        });
    }

    public final C39037pkj KWHzl() {
        return (C39037pkj) this.AEQbTJ.getValue();
    }

    public static final C39037pkj AEQbTJ(AbstractC39028pka abstractC39028pka) {
        return C39035pkh.copydefault(abstractC39028pka.AEQbTJ());
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        super.onAttach(context);
        this.KWHzl = context;
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        for (InterfaceC39040pkm interfaceC39040pkm : KWHzl().KWHzl()) {
            if (interfaceC39040pkm instanceof BaseFragmentDataComponent) {
                ((BaseFragmentDataComponent) interfaceC39040pkm).KWHzl(this);
            }
            if (interfaceC39040pkm instanceof InterfaceC39042pko) {
                ((InterfaceC39042pko) interfaceC39040pkm).OLrzqt(bundle);
            }
            getLifecycle().addObserver(interfaceC39040pkm);
        }
    }

    @Override // o.AbstractC32996moC, androidx.fragment.app.Fragment
    public android.view.View onCreateView(@NotNull android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        KWHzl().AEQbTJ().OLrzqt(viewGroup);
        C39043pkp<?> c39043pkpAEQbTJ = KWHzl().AEQbTJ();
        if (!(c39043pkpAEQbTJ instanceof C39043pkp)) {
            c39043pkpAEQbTJ = null;
        }
        if (c39043pkpAEQbTJ != null) {
            c39043pkpAEQbTJ.EZpvd();
        }
        return KWHzl().AEQbTJ().AEQbTJ();
    }

    @Override // o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        for (InterfaceC39046pks interfaceC39046pks : KWHzl().OLrzqt()) {
            if (interfaceC39046pks instanceof InterfaceC39042pko) {
                ((InterfaceC39042pko) interfaceC39046pks).OLrzqt(bundle);
            }
            if (interfaceC39046pks instanceof InterfaceC39038pkk) {
                ((InterfaceC39038pkk) interfaceC39046pks).KWHzl(view, bundle);
            }
            getLifecycle().addObserver(interfaceC39046pks);
        }
        view.post(new java.lang.Runnable() { // from class: o.pki
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC39028pka.copydefault(this.KWHzl);
            }
        });
    }

    public static final void copydefault(AbstractC39028pka abstractC39028pka) {
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) abstractC39028pka, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    @Override // o.AbstractC32998moE, o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
    }

    @Override // o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        C39043pkp<?> c39043pkpAEQbTJ = KWHzl().AEQbTJ();
        if (!(c39043pkpAEQbTJ instanceof C39043pkp)) {
            c39043pkpAEQbTJ = null;
        }
        if (c39043pkpAEQbTJ != null) {
            c39043pkpAEQbTJ.OLrzqt();
        }
    }
}
