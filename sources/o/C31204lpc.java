package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.okinc.business.dex.api.bean.TokenBase;
import com.okinc.business.trade.features.home.ui.meme.MemeModeTransactionFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.lpc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C31204lpc extends AbstractC31145loW {
    public Function0<Unit> valueOf;
    public static final Application Companion = new Application(null);
    public static final int AhwBna = 8;

    /* JADX INFO: renamed from: o.lpc$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.lpc.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final C31204lpc copydefault(@NotNull java.lang.String str, TokenBase tokenBase, int i, @NotNull java.lang.String str2, @NotNull java.lang.String str3, TokenBase tokenBase2, Function0<Unit> function0) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            C31204lpc c31204lpc = new C31204lpc();
            android.os.Bundle bundle = new android.os.Bundle();
            C31200lpY.EZpvd(bundle, str);
            bundle.putParcelable("transaction_token", tokenBase);
            bundle.putInt("index", i);
            bundle.putString("transaction_amount", str2);
            bundle.putString("limit_strategy_type", str3);
            bundle.putParcelable("currency_token", tokenBase2);
            c31204lpc.setArguments(bundle);
            c31204lpc.valueOf = function0;
            return c31204lpc;
        }
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.setStyle(0);
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        getLayoutInflater().inflate(C23274hvD.Activity.fsw, (android.view.ViewGroup) constraintLayout, true);
    }

    @Override // o.wXX, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        android.os.Bundle bundle2;
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        if (bundle == null) {
            androidx.fragment.app.FragmentManager childFragmentManager = getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
            androidx.fragment.app.FragmentTransaction fragmentTransactionBeginTransaction = childFragmentManager.beginTransaction();
            Intrinsics.checkNotNullExpressionValue(fragmentTransactionBeginTransaction, "");
            int i = C23274hvD.Application.onPrepareFromSearch;
            android.os.Bundle arguments = getArguments();
            if (arguments != null) {
                bundle2 = new android.os.Bundle();
                bundle2.putAll(arguments);
                C31125loC.copydefault(bundle2, C31172lox.Companion.OLrzqt());
            } else {
                bundle2 = null;
            }
            Intrinsics.checkNotNullExpressionValue(fragmentTransactionBeginTransaction.replace(i, MemeModeTransactionFragment.class, bundle2, "MemeModeTransactionFragment"), "");
            fragmentTransactionBeginTransaction.commit();
        }
    }

    @Override // o.wXX, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(@NotNull android.content.DialogInterface dialogInterface) {
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        super.onDismiss(dialogInterface);
        Function0<Unit> function0 = this.valueOf;
        if (function0 != null) {
            function0.invoke();
        }
    }
}
