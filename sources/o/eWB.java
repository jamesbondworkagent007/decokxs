package o;

import com.okinc.business.defi.wallet.home.addressDetail.data.resposity.ProfilePnlPrefsDataSource$currencyToggleFlow$1;
import com.okinc.business.defi.wallet.home.addressDetail.data.resposity.ProfilePnlPrefsDataSource$currencyToggleFlow$2;
import com.okinc.core.util.SPUtils;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class eWB {
    public final CoroutineDispatcher KWHzl;
    public final android.content.Context OLrzqt;
    public static final ActionBar Companion = new ActionBar(null);
    public static final int AEQbTJ = 8;

    public eWB(@NotNull android.content.Context context, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.OLrzqt = context;
        this.KWHzl = coroutineDispatcher;
    }

    public final boolean KWHzl() {
        return SPUtils.getBoolean("profile_display_currency", true, "wallet_profile_prefs");
    }

    public final void OLrzqt(boolean z) {
        SPUtils.put("profile_display_currency", java.lang.Boolean.valueOf(z), "wallet_profile_prefs");
    }

    public final Flow<java.lang.Boolean> EZpvd() {
        return FlowKt.flowOn(FlowKt.distinctUntilChanged(FlowKt.onStart(FlowKt.callbackFlow(new ProfilePnlPrefsDataSource$currencyToggleFlow$1(this, null)), new ProfilePnlPrefsDataSource$currencyToggleFlow$2(this, null))), this.KWHzl);
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.eWB.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public static /* synthetic */ eWB getInstance$default(ActionBar actionBar, android.content.Context context, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                context = C9678baC.Companion.AEQbTJ();
            }
            return actionBar.AEQbTJ(context);
        }

        public final eWB AEQbTJ(@NotNull android.content.Context context) {
            Intrinsics.checkNotNullParameter(context, "");
            return C13458dMb.EZpvd(context).fIwbmz();
        }
    }
}
