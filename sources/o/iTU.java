package o;

import android.widget.CompoundButton;
import com.okinc.business.invest_biz.ui.screens.product_details.tab.ProductDetailsUserTradeAction;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC24092iUp;
import o.C24101iUy;
import o.C25493ixk;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class iTU extends AbstractC24092iUp implements C24101iUy.StateListAnimator {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int OLrzqt = 8;
    public ProductDetailsUserTradeAction EZpvd;
    public Application copydefault;
    public java.lang.Long KWHzl = 0L;
    public final InterfaceC56387yDm AEQbTJ = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0() { // from class: o.iTT
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return iTU.OLrzqt(this.OLrzqt);
        }
    });

    public interface Application {
        void copydefault(ProductDetailsUserTradeAction productDetailsUserTradeAction, java.lang.Long l);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(java.lang.Long l) {
        this.KWHzl = l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(ProductDetailsUserTradeAction productDetailsUserTradeAction) {
        this.EZpvd = productDetailsUserTradeAction;
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.iTU.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public static /* synthetic */ iTU newInstance$default(StateListAnimator stateListAnimator, ProductDetailsUserTradeAction productDetailsUserTradeAction, java.lang.Long l, Application application, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                productDetailsUserTradeAction = null;
            }
            if ((i & 2) != 0) {
                l = 0L;
            }
            return stateListAnimator.OLrzqt(productDetailsUserTradeAction, l, application);
        }

        public final iTU OLrzqt(ProductDetailsUserTradeAction productDetailsUserTradeAction, java.lang.Long l, Application application) {
            iTU itu = new iTU();
            itu.copydefault(productDetailsUserTradeAction);
            itu.EZpvd(l);
            itu.copydefault = application;
            return itu;
        }
    }

    @Override // o.AbstractC24092iUp
    public AbstractC24092iUp.Application AEQbTJ() {
        return (AbstractC24092iUp.Application) this.AEQbTJ.getValue();
    }

    public static final AbstractC24092iUp.Application OLrzqt(iTU itu) {
        java.lang.String string = itu.getString(C25493ixk.FragmentManager.values);
        Intrinsics.checkNotNullExpressionValue(string, "");
        java.lang.String string2 = itu.getString(C25493ixk.FragmentManager.AkhnZx);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        java.lang.String string3 = itu.getString(C25493ixk.FragmentManager.init);
        Intrinsics.checkNotNullExpressionValue(string3, "");
        return new AbstractC24092iUp.Application("sp_invest_friendlyreminder_dialog_never_show", string, string2, null, string3, false, 0, "images/web3_defi/defi_invest_disclaimer.webp", true, C55298xhM.dp2px$default(200.0f, null, 1, null), C55298xhM.dp2px$default(200.0f, null, 1, null), 104, null);
    }

    @Override // o.AbstractC24092iUp
    public void OLrzqt() {
        Application application = this.copydefault;
        if (application != null) {
            application.copydefault(this.EZpvd, this.KWHzl);
        }
    }

    @Override // o.C24101iUy.StateListAnimator
    public void EZpvd() {
        dismiss();
        Application application = this.copydefault;
        if (application != null) {
            application.copydefault(this.EZpvd, this.KWHzl);
        }
    }

    @Override // o.AbstractC24092iUp
    public void OLrzqt(@NotNull C23820iKn c23820iKn, @NotNull final AbstractC24092iUp.Application application) {
        Intrinsics.checkNotNullParameter(c23820iKn, "");
        Intrinsics.checkNotNullParameter(application, "");
        wYK wyk = c23820iKn.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(wyk, "");
        wyk.setVisibility(application.EZpvd() ? 0 : 8);
        c23820iKn.OLrzqt.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: o.iTR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(android.widget.CompoundButton compoundButton, boolean z) {
                iTU.AEQbTJ(application, this, compoundButton, z);
            }
        });
        C27577jxn c27577jxn = C27577jxn.copydefault;
        wYK wyk2 = c23820iKn.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(wyk2, "");
        java.lang.String strCopydefault = C33069mpW.copydefault(this, C25493ixk.FragmentManager.gEmmrt, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("RiskDisclaimer", getString(C25493ixk.FragmentManager.AhwBna))));
        java.lang.String string = getString(C25493ixk.FragmentManager.AhwBna);
        Intrinsics.checkNotNullExpressionValue(string, "");
        c27577jxn.copydefault(wyk2, strCopydefault, string, new Function0() { // from class: o.iTS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return iTU.copydefault(this.OLrzqt);
            }
        });
    }

    public static final void AEQbTJ(AbstractC24092iUp.Application application, iTU itu, android.widget.CompoundButton compoundButton, boolean z) {
        C23821iKo c23821iKoKWHzl;
        C52794wYp c52794wYp;
        if (!application.djBIcL() || (c23821iKoKWHzl = itu.KWHzl()) == null || (c52794wYp = c23821iKoKWHzl.EZpvd) == null) {
            return;
        }
        c52794wYp.setEnabled(z);
    }

    public static final Unit copydefault(iTU itu) {
        new C24101iUy().show(itu.getChildFragmentManager(), C24101iUy.class.getName());
        return Unit.INSTANCE;
    }
}
