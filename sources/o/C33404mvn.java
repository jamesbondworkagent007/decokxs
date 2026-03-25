package o;

import com.okinc.core.util.SPUtils;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mvn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C33404mvn {
    public static final ActionBar Companion = new ActionBar(null);
    public static final InterfaceC56387yDm<C33404mvn> EZpvd = C56392yDr.copydefault(new Function0() { // from class: o.mvm
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C33404mvn.copydefault();
        }
    });

    public final void AEQbTJ(@NotNull AbstractC33244msm abstractC33244msm, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(abstractC33244msm, "");
        Intrinsics.checkNotNullParameter(str, "");
        pUU.KWHzl("ModeSwitch-Preference", "saveMode: mode=" + abstractC33244msm + ", uid=" + str);
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("OK_APP_SUB_MODE_");
        sb.append(str);
        SPUtils.put(sb.toString(), abstractC33244msm.EZpvd());
        SPUtils.put("OK_APP_MODE_GROUP_TO_MODE_" + str + "_" + abstractC33244msm.KWHzl().OLrzqt().OLrzqt(), abstractC33244msm.KWHzl().copydefault());
        SPUtils.put("OK_APP_MODE_TO_SUB_MODE_" + str + "_" + abstractC33244msm.KWHzl().copydefault(), abstractC33244msm.EZpvd());
    }

    public final AbstractC33244msm EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return AbstractC33244msm.Companion.AEQbTJ(SPUtils.getString("OK_APP_SUB_MODE_" + str, ""));
    }

    public final AbstractC33244msm OLrzqt(@NotNull java.lang.String str, @NotNull AbstractC33247msp abstractC33247msp) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(abstractC33247msp, "");
        return AbstractC33244msm.Companion.AEQbTJ(SPUtils.getString("OK_APP_MODE_TO_SUB_MODE_" + str + "_" + abstractC33247msp.copydefault(), ""));
    }

    public final AbstractC33244msm AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return AbstractC33244msm.Companion.AEQbTJ(C33449mwf.Companion.copydefault().EZpvd("LITE_SUB_MODE_SP_KEY_" + str, ""));
    }

    /* JADX INFO: renamed from: o.mvn$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.mvn.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final C33404mvn copydefault() {
            return (C33404mvn) C33404mvn.EZpvd.getValue();
        }
    }

    public static final C33404mvn copydefault() {
        return new C33404mvn();
    }
}
