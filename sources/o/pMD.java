package o;

import com.okinc.lifecycle.impl.deeplink.usecase.HandleDeferredDeeplinkUseCaseImpl$listenToConfigUpdate$1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.GlobalScope;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class pMD implements InterfaceC38120pMz {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public final pMX AEQbTJ;
    public final pLH OLrzqt;

    public pMD(@NotNull pMX pmx, @NotNull pLH plh) {
        Intrinsics.checkNotNullParameter(pmx, "");
        Intrinsics.checkNotNullParameter(plh, "");
        this.AEQbTJ = pmx;
        this.OLrzqt = plh;
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.pMD.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    @Override // o.InterfaceC38120pMz
    public void copydefault() {
        android.content.SharedPreferences sharedPreferences = C43246rlf.OLrzqt.valueOf().getApplicationContext().getSharedPreferences("`deeplink_sp_store`", 0);
        if (sharedPreferences == null || sharedPreferences.getBoolean("check_deferred_deeplink", false)) {
            return;
        }
        sharedPreferences.edit().putBoolean("check_deferred_deeplink", true).apply();
        pUU.KWHzl("HandleDeferredDeeplink", "Checking deferred deeplink");
        OLrzqt();
    }

    public final void OLrzqt() {
        BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, null, null, new HandleDeferredDeeplinkUseCaseImpl$listenToConfigUpdate$1(this, null), 3, null);
    }

    public final boolean AEQbTJ(java.lang.String str) {
        return C33129mqd.OLrzqt((java.lang.CharSequence) str) && this.OLrzqt.AEQbTJ(str);
    }

    public final java.lang.String KWHzl() {
        android.content.Context applicationContext = C43246rlf.OLrzqt.valueOf().getApplicationContext();
        Intrinsics.copydefault(applicationContext);
        java.lang.String strOLrzqt = OLrzqt("deep_link_attribution", applicationContext);
        if (strOLrzqt != null) {
            if (!(!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strOLrzqt))) {
                strOLrzqt = null;
            }
            if (strOLrzqt != null) {
                return strOLrzqt;
            }
        }
        return OLrzqt("deep_link_result", applicationContext);
    }

    public final java.lang.String OLrzqt(java.lang.String str, android.content.Context context) {
        return context.getSharedPreferences(str, 0).getString("deep_link_value", null);
    }
}
