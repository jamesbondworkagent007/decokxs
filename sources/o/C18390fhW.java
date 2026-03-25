package o;

import com.okinc.business.defi.api.bean.DappSignArgs;
import com.okinc.business.defi.api.bean.NewSignCallbackBean;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.wallet.widget.bottomsheet.DefiBottomSheetContainerTxConfirmBaseFragment;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fhW, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C18390fhW extends DefiBottomSheetContainerTxConfirmBaseFragment {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int EZpvd = 8;
    public Function1<? super NewSignCallbackBean, ? extends AbstractC58185ywX<ResponseData<java.lang.String>>> KWHzl;

    @Override // com.okinc.wallet.widget.bottomsheet.DefiBottomSheetContainerTxConfirmBaseFragment
    public boolean EZpvd() {
        return true;
    }

    /* JADX INFO: renamed from: o.fhW$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.fhW.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final C18390fhW OLrzqt(@NotNull DappSignArgs dappSignArgs, Function1<? super NewSignCallbackBean, ? extends AbstractC58185ywX<ResponseData<java.lang.String>>> function1) {
            Intrinsics.checkNotNullParameter(dappSignArgs, "");
            C18390fhW c18390fhW = new C18390fhW();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putParcelable("dappSignArgs", dappSignArgs);
            c18390fhW.setArguments(bundle);
            c18390fhW.KWHzl = function1;
            return c18390fhW;
        }
    }

    @Override // com.okinc.wallet.widget.bottomsheet.DefiBottomSheetContainerTxConfirmBaseFragment, o.AbstractDialogInterfaceOnKeyListenerC57208yeA, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        android.os.Bundle arguments = getArguments();
        DappSignArgs dappSignArgs = arguments != null ? (DappSignArgs) arguments.getParcelable("dappSignArgs") : null;
        InterfaceC9731bbC interfaceC9731bbCEZpvd = ((InterfaceC9852bdR) C43251rlk.copydefault(InterfaceC9852bdR.class)).copydefault().EZpvd(C33129mqd.valueOf(dappSignArgs != null ? dappSignArgs.getChainId() : null), true);
        C10854bwM c10854bwM = interfaceC9731bbCEZpvd instanceof C10854bwM ? (C10854bwM) interfaceC9731bbCEZpvd : null;
        if (c10854bwM == null) {
            C33134mqi.AEQbTJ(getString(C13754dXa.FragmentManager.invokespecialaVhqwO));
            dismissAllowingStateLoss();
            return;
        }
        C18472fiz c18472fizOLrzqt = c10854bwM.AxsJAYaxsJAY() ? C18472fiz.Companion.OLrzqt(dappSignArgs, this.KWHzl) : null;
        if (c18472fizOLrzqt == null) {
            C33134mqi.AEQbTJ(getString(C13754dXa.FragmentManager.invokespecialaVhqwO));
            dismissAllowingStateLoss();
        } else {
            C57211yeD c57211yeDKWHzl = KWHzl();
            if (c57211yeDKWHzl != null) {
                c57211yeDKWHzl.AEQbTJ(null, c18472fizOLrzqt, false, true);
            }
        }
    }

    @Override // com.okinc.wallet.widget.bottomsheet.DefiBottomSheetContainerTxConfirmBaseFragment
    public java.lang.String copydefault() {
        DappSignArgs dappSignArgs;
        android.os.Bundle arguments = getArguments();
        if (arguments == null || (dappSignArgs = (DappSignArgs) arguments.getParcelable("dappSignArgs")) == null) {
            return "";
        }
        return dappSignArgs.getSource() + " " + dappSignArgs.getWalletId();
    }
}
