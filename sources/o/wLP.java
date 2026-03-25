package o;

import androidx.core.os.BundleKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class wLP extends AbstractC32996moC {
    public static final ActionBar Companion = new ActionBar(null);
    public final int EZpvd = C48033uCm.Activity.UlJrfe;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return this.EZpvd;
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.wLP.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final wLP OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            wLP wlp = new wLP();
            wlp.setArguments(BundleKt.bundleOf(C56390yDp.OLrzqt("instId", str), C56390yDp.OLrzqt("instType", str2)));
            return wlp;
        }
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        android.os.Bundle arguments = getArguments();
        java.lang.String string = arguments != null ? arguments.getString("instId") : null;
        if (string == null) {
            string = "";
        }
        android.os.Bundle arguments2 = getArguments();
        java.lang.String string2 = arguments2 != null ? arguments2.getString("instType") : null;
        if (string2 == null) {
            string2 = "";
        }
        androidx.fragment.app.FragmentManager parentFragmentManager = getParentFragmentManager();
        Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "");
        androidx.fragment.app.FragmentTransaction fragmentTransactionBeginTransaction = parentFragmentManager.beginTransaction();
        Intrinsics.checkNotNullExpressionValue(fragmentTransactionBeginTransaction, "");
        fragmentTransactionBeginTransaction.add(C48033uCm.Application.getPercentRating, C51973vxC.Companion.copydefault(string, string2, "kline_strategy_tab"));
        fragmentTransactionBeginTransaction.commit();
    }

    public final void KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        C7323ahf.KWHzl().AEQbTJ("OKTE_RELOAD_BOT_HOME_TAB_NOTIFICATION", null, C56424yEw.gEmmrt(C56390yDp.OLrzqt("instId", str), C56390yDp.OLrzqt("instType", str2)));
    }
}
