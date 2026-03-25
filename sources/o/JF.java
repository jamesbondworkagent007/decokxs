package o;

import com.amplitude.android.plugins.AndroidNetworkConnectivityCheckerPlugin$setup$1;
import com.amplitude.core.platform.Plugin;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.JX;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class JF implements com.amplitude.core.platform.Plugin {
    public static final Activity Companion = new Activity(null);
    public static final java.lang.Void EZpvd = null;
    public final Plugin.Type AEQbTJ = Plugin.Type.Before;
    public JZ KWHzl;
    public JX OLrzqt;
    public JO copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.amplitude.core.platform.Plugin
    public void AEQbTJ(@NotNull JZ jz) {
        Intrinsics.checkNotNullParameter(jz, "");
        this.KWHzl = jz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.amplitude.core.platform.Plugin
    public Plugin.Type EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(@NotNull JO jo) {
        Intrinsics.checkNotNullParameter(jo, "");
        this.copydefault = jo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(@NotNull JX jx) {
        Intrinsics.checkNotNullParameter(jx, "");
        this.OLrzqt = jx;
    }

    public final JO copydefault() {
        JO jo = this.copydefault;
        if (jo != null) {
            return jo;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    public final JX AEQbTJ() {
        JX jx = this.OLrzqt;
        if (jx != null) {
            return jx;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.JF.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final java.lang.Void AEQbTJ() {
            return JF.EZpvd;
        }
    }

    @Override // com.amplitude.core.platform.Plugin
    public void KWHzl(@NotNull JZ jz) {
        Intrinsics.checkNotNullParameter(jz, "");
        super.KWHzl(jz);
        jz.DbNXlk().OLrzqt("Installing AndroidNetworkConnectivityPlugin, offline feature should be supported.");
        C5244Kg c5244KgDjBIcL = jz.djBIcL();
        Intrinsics.copydefault(c5244KgDjBIcL, "");
        EZpvd(new JO(((C5216Je) c5244KgDjBIcL).copydefault(), jz.DbNXlk()));
        BuildersKt__Builders_commonKt.launch$default(jz.AYXKKw(), jz.fJNWhG(), null, new AndroidNetworkConnectivityCheckerPlugin$setup$1(jz, this, null), 2, null);
        StateListAnimator stateListAnimator = new StateListAnimator(jz);
        C5244Kg c5244KgDjBIcL2 = jz.djBIcL();
        Intrinsics.copydefault(c5244KgDjBIcL2, "");
        copydefault(new JX(((C5216Je) c5244KgDjBIcL2).copydefault(), jz.DbNXlk()));
        AEQbTJ().OLrzqt(stateListAnimator);
        AEQbTJ().AEQbTJ();
    }

    public static final class StateListAnimator implements JX.TaskDescription {
        public final /* synthetic */ JZ AEQbTJ;

        public StateListAnimator(JZ jz) {
            this.AEQbTJ = jz;
        }

        @Override // o.JX.TaskDescription
        public void OLrzqt() {
            this.AEQbTJ.DbNXlk().OLrzqt("AndroidNetworkListener, onNetworkAvailable.");
            this.AEQbTJ.djBIcL().OLrzqt(java.lang.Boolean.FALSE);
            this.AEQbTJ.gEmmrt();
        }

        @Override // o.JX.TaskDescription
        public void AEQbTJ() {
            this.AEQbTJ.DbNXlk().OLrzqt("AndroidNetworkListener, onNetworkUnavailable.");
            this.AEQbTJ.djBIcL().OLrzqt(java.lang.Boolean.TRUE);
        }
    }
}
