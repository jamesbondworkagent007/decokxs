package o;

import android.view.View;
import androidx.core.view.KeyEventDispatcher;
import com.okinc.business.defi.assets.utxo.utxomanagement.InvestUtxoAction;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.blD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C10262blD extends AbstractC52785wYg {
    public static final Application Companion = new Application(null);

    @Override // o.AbstractC52785wYg
    public boolean AhwBna() {
        return false;
    }

    public final InvestUtxoAction OLrzqt() {
        InvestUtxoAction investUtxoAction;
        android.os.Bundle arguments = getArguments();
        if (arguments == null || (investUtxoAction = (InvestUtxoAction) arguments.getParcelable("key.action")) == null) {
            throw new java.lang.IllegalStateException("Must provide unlock request");
        }
        return investUtxoAction;
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.setStyle(4);
        wxq.AEQbTJ().setVisibility(8);
        wxq.valueOf().setVisibility(8);
        wxq.KWHzl().setVisibility(8);
    }

    @Override // o.AbstractC52785wYg
    public void AEQbTJ(@NotNull C54954xan c54954xan) {
        Intrinsics.checkNotNullParameter(c54954xan, "");
        c54954xan.KWHzl.setImageResource(C52761wXj.TaskDescription.FdcJU);
        c54954xan.AEQbTJ.setText(getString(C13754dXa.FragmentManager.aGOrKO));
        c54954xan.OLrzqt.setText(C33069mpW.copydefault(this, C13754dXa.FragmentManager.write, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("chainName", OLrzqt().AEQbTJ()))));
        wYK wyk = c54954xan.EZpvd;
        Intrinsics.checkNotNullExpressionValue(wyk, "");
        wyk.setVisibility(8);
    }

    @Override // o.AbstractC52785wYg, o.wXX
    public void onFooterCreated(@NotNull wYF wyf) {
        Intrinsics.checkNotNullParameter(wyf, "");
        super.onFooterCreated(wyf);
        wyf.setType(7);
        wyf.setOKDSSize(52);
        android.content.Context context = wyf.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        int iOLrzqt = C55298xhM.OLrzqt(32, context);
        android.content.Context context2 = wyf.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        int iOLrzqt2 = C55298xhM.OLrzqt(12, context2);
        android.content.Context context3 = wyf.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "");
        int iOLrzqt3 = C55298xhM.OLrzqt(32, context3);
        android.content.Context context4 = wyf.getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "");
        wyf.setPaddingRelative(iOLrzqt, iOLrzqt2, iOLrzqt3, C55298xhM.OLrzqt(16, context4));
        wyf.setPrimaryText(getString(C13754dXa.FragmentManager.getSessionToken2Bundle));
        C52794wYp c52794wYpCopydefault = wyf.copydefault();
        if (c52794wYpCopydefault != null) {
            c52794wYpCopydefault.setOnClickListener(new View.OnClickListener() { // from class: o.blA
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C10262blD.AEQbTJ(this.EZpvd, view);
                }
            });
        }
        wyf.setSecondaryText(getString(C13754dXa.FragmentManager.ihnvzI));
        C52794wYp c52794wYpAEQbTJ = wyf.AEQbTJ();
        if (c52794wYpAEQbTJ != null) {
            c52794wYpAEQbTJ.setOKDSType(260);
        }
        C52794wYp c52794wYpAEQbTJ2 = wyf.AEQbTJ();
        if (c52794wYpAEQbTJ2 != null) {
            c52794wYpAEQbTJ2.setOnClickListener(new View.OnClickListener() { // from class: o.blG
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C10262blD.OLrzqt(this.KWHzl, view);
                }
            });
        }
    }

    public static final void AEQbTJ(C10262blD c10262blD, android.view.View view) {
        KeyEventDispatcher.Component activity = c10262blD.getActivity();
        InterfaceC10352bmo interfaceC10352bmo = activity instanceof InterfaceC10352bmo ? (InterfaceC10352bmo) activity : null;
        if (interfaceC10352bmo != null) {
            interfaceC10352bmo.copydefault(c10262blD.OLrzqt());
        }
        c10262blD.dismissAllowingStateLoss();
    }

    public static final void OLrzqt(C10262blD c10262blD, android.view.View view) {
        c10262blD.dismissAllowingStateLoss();
    }

    /* JADX INFO: renamed from: o.blD$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.blD.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final C10262blD copydefault(@NotNull InvestUtxoAction investUtxoAction) {
            Intrinsics.checkNotNullParameter(investUtxoAction, "");
            C10262blD c10262blD = new C10262blD();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putParcelable("key.action", investUtxoAction);
            c10262blD.setArguments(bundle);
            return c10262blD;
        }
    }
}
