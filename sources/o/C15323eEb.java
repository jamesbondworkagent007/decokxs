package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.okinc.business.defi.biz.core.error.WalletImportError;
import com.okinc.business.defi.wallet.hardware.HardwareWalletDerivationPath;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.eEb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C15323eEb extends AbstractC52792wYn {
    public HardwareWalletDerivationPath EZpvd;
    public Function1<? super HardwareWalletDerivationPath, Unit> KWHzl;
    public C55198xfS copydefault;
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int AEQbTJ = 8;

    /* JADX INFO: renamed from: o.eEb$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.eEb.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final void KWHzl(@NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull java.util.ArrayList<HardwareWalletDerivationPath> arrayList, HardwareWalletDerivationPath hardwareWalletDerivationPath, @NotNull Function1<? super HardwareWalletDerivationPath, Unit> function1) {
            Intrinsics.checkNotNullParameter(fragmentManager, "");
            Intrinsics.checkNotNullParameter(arrayList, "");
            Intrinsics.checkNotNullParameter(function1, "");
            copydefault(arrayList, hardwareWalletDerivationPath, function1).show(fragmentManager);
        }

        public final C15323eEb copydefault(@NotNull java.util.ArrayList<HardwareWalletDerivationPath> arrayList, HardwareWalletDerivationPath hardwareWalletDerivationPath, @NotNull Function1<? super HardwareWalletDerivationPath, Unit> function1) {
            Intrinsics.checkNotNullParameter(arrayList, "");
            Intrinsics.checkNotNullParameter(function1, "");
            C15323eEb c15323eEb = new C15323eEb();
            c15323eEb.KWHzl = function1;
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putParcelableArrayList("HARDWARE_WALLET_DERIVATION_PATH_LIST", arrayList);
            bundle.putParcelable("HARDWARE_WALLET_SELECTED", hardwareWalletDerivationPath);
            c15323eEb.setArguments(bundle);
            return c15323eEb;
        }
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.setStyle(2);
        wxq.AYXKKw().setGravity(17);
        wxq.setTitle(C33070mpX.AYXKKw(C13754dXa.FragmentManager.iTrKTi));
        wxq.setDividerVisibility(false);
    }

    @Override // o.AbstractC52792wYn, o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        constraintLayout.setPaddingRelative(0, 0, 0, C55298xhM.OLrzqt(24, contextRequireContext));
    }

    @Override // o.AbstractC52792wYn
    public void EZpvd(@NotNull C55198xfS c55198xfS) {
        java.util.ArrayList<HardwareWalletDerivationPath> arrayList;
        Intrinsics.checkNotNullParameter(c55198xfS, "");
        this.copydefault = c55198xfS;
        c55198xfS.setType(2);
        android.os.Bundle arguments = getArguments();
        if (arguments == null || (arrayList = arguments.getParcelableArrayList("HARDWARE_WALLET_DERIVATION_PATH_LIST")) == null) {
            arrayList = new java.util.ArrayList();
        }
        android.os.Bundle arguments2 = getArguments();
        this.EZpvd = arguments2 != null ? (HardwareWalletDerivationPath) arguments2.getParcelable("HARDWARE_WALLET_SELECTED") : null;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (HardwareWalletDerivationPath hardwareWalletDerivationPath : arrayList) {
            java.lang.String title = hardwareWalletDerivationPath.getTitle();
            java.lang.String description = hardwareWalletDerivationPath.getDescription();
            java.lang.String str = description == null ? "" : description;
            HardwareWalletDerivationPath hardwareWalletDerivationPath2 = this.EZpvd;
            arrayList2.add(new C55276xgr(title, hardwareWalletDerivationPath, str, hardwareWalletDerivationPath2 != null && hardwareWalletDerivationPath.getId() == hardwareWalletDerivationPath2.getId(), false, null, null, WalletImportError.ERROR_CODE_AA_EXIST, null));
        }
        c55198xfS.setSingleOneColumnData(arrayList2, new yHO() { // from class: o.eEa
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.yHO
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return C15323eEb.EZpvd(this.copydefault, (C55276xgr) obj, (C55276xgr) obj2, (C55276xgr) obj3);
            }
        });
    }

    public static final Unit EZpvd(C15323eEb c15323eEb, C55276xgr c55276xgr, C55276xgr c55276xgr2, C55276xgr c55276xgr3) {
        Function1<? super HardwareWalletDerivationPath, Unit> function1 = c15323eEb.KWHzl;
        if (function1 != null) {
            java.lang.Object objOLrzqt = c55276xgr != null ? c55276xgr.OLrzqt() : null;
            Intrinsics.copydefault(objOLrzqt, "");
            function1.invoke((HardwareWalletDerivationPath) objOLrzqt);
        }
        c15323eEb.dismiss();
        return Unit.INSTANCE;
    }
}
