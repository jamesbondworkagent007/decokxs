package o;

import androidx.core.os.BundleKt;
import com.appsflyer.AppsFlyerProperties;
import com.immomo.mls.InitData;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C7343ahz;
import okhttp3.internal.ws.WebSocketProtocol;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.vxC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C51973vxC extends AbstractC43061riF {
    public static final Activity Companion = new Activity(null);
    public static final int copydefault = 8;
    public final InterfaceC56387yDm EZpvd = C56392yDr.copydefault(new Function0() { // from class: o.vxE
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C51973vxC.AEQbTJ(this.EZpvd);
        }
    });
    public final InterfaceC56387yDm KWHzl = C56392yDr.copydefault(new Function0() { // from class: o.vxD
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C51973vxC.AhwBna(this.EZpvd);
        }
    });
    public final InterfaceC56387yDm AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.vxG
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C51973vxC.OLrzqt(this.EZpvd);
        }
    });
    public final int AYXKKw = C7343ahz.Activity.valueOf;
    public final java.lang.String OLrzqt = "KlineStrategyPage";

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC43061riF
    public java.lang.String copydefault() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return this.AYXKKw;
    }

    /* JADX INFO: renamed from: o.vxC$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.vxC.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final C51973vxC copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            C51973vxC c51973vxC = new C51973vxC();
            c51973vxC.setArguments(BundleKt.bundleOf(C56390yDp.OLrzqt("INST_ID", str), C56390yDp.OLrzqt("INST_TYPE", str2), C56390yDp.OLrzqt(AppsFlyerProperties.CHANNEL, str3)));
            return c51973vxC;
        }
    }

    private final java.lang.String djBIcL() {
        return (java.lang.String) this.EZpvd.getValue();
    }

    public static final java.lang.String AEQbTJ(C51973vxC c51973vxC) {
        android.os.Bundle arguments = c51973vxC.getArguments();
        java.lang.String string = arguments != null ? arguments.getString("INST_ID") : null;
        return string == null ? "" : string;
    }

    private final java.lang.String gEmmrt() {
        return (java.lang.String) this.KWHzl.getValue();
    }

    public static final java.lang.String AhwBna(C51973vxC c51973vxC) {
        android.os.Bundle arguments = c51973vxC.getArguments();
        java.lang.String string = arguments != null ? arguments.getString("INST_TYPE") : null;
        return string == null ? "" : string;
    }

    private final java.lang.String KWHzl() {
        return (java.lang.String) this.AEQbTJ.getValue();
    }

    public static final java.lang.String OLrzqt(C51973vxC c51973vxC) {
        android.os.Bundle arguments = c51973vxC.getArguments();
        java.lang.String string = arguments != null ? arguments.getString(AppsFlyerProperties.CHANNEL) : null;
        return string == null ? "" : string;
    }

    @Override // o.AbstractC43061riF
    public android.view.ViewGroup EZpvd() {
        android.view.View view = getView();
        if (view != null) {
            return (android.view.ViewGroup) view.findViewById(C7343ahz.TaskDescription.OcIXYQ);
        }
        return null;
    }

    @Override // o.AbstractC43061riF
    public InitData OLrzqt() {
        return C43056riA.AEQbTJ.EZpvd("okluatradingeco", "/klineStrategy", C56424yEw.gEmmrt(C56390yDp.OLrzqt("page", "nmp"), C56390yDp.OLrzqt(AppsFlyerProperties.CHANNEL, KWHzl()), C56390yDp.OLrzqt("PAGE_LOCATION", "TRADE"), C56390yDp.OLrzqt("INST_ID", djBIcL()), C56390yDp.OLrzqt("INST_TYPE", gEmmrt()), C56390yDp.OLrzqt("minversion", "6.119.0")));
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        C56058xve.Companion.copydefault().KWHzl(KWHzl(), (WebSocketProtocol.PAYLOAD_SHORT & 2) != 0 ? null : null, (WebSocketProtocol.PAYLOAD_SHORT & 4) != 0 ? null : null, (WebSocketProtocol.PAYLOAD_SHORT & 8) != 0 ? null : null, (WebSocketProtocol.PAYLOAD_SHORT & 16) != 0 ? null : null, (WebSocketProtocol.PAYLOAD_SHORT & 32) != 0 ? null : null, (WebSocketProtocol.PAYLOAD_SHORT & 64) == 0 ? null : null);
    }
}
