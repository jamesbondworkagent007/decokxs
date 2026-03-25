package o;

import androidx.core.os.BundleKt;
import com.immomo.mls.InitData;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C7343ahz;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.vwe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C51948vwe extends AbstractC43061riF {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int OLrzqt = 8;
    public final java.lang.String KWHzl = "MySignalBotListPage";
    public final int EZpvd = C7343ahz.Activity.valueOf;
    public final InterfaceC56387yDm AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.vwf
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C51948vwe.EZpvd(this.OLrzqt);
        }
    });

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC43061riF
    public java.lang.String copydefault() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
    }

    /* JADX INFO: renamed from: o.vwe$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.vwe.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final C51948vwe AEQbTJ(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            C51948vwe c51948vwe = new C51948vwe();
            c51948vwe.setArguments(BundleKt.bundleOf(C56390yDp.OLrzqt("type", str)));
            return c51948vwe;
        }
    }

    @Override // o.AbstractC43061riF
    public android.view.ViewGroup EZpvd() {
        android.view.View view = getView();
        if (view != null) {
            return (android.view.ViewGroup) view.findViewById(C7343ahz.TaskDescription.OcIXYQ);
        }
        return null;
    }

    private final java.lang.String KWHzl() {
        return (java.lang.String) this.AEQbTJ.getValue();
    }

    public static final java.lang.String EZpvd(C51948vwe c51948vwe) {
        android.os.Bundle arguments = c51948vwe.getArguments();
        java.lang.String string = arguments != null ? arguments.getString("type") : null;
        return string == null ? "" : string;
    }

    @Override // o.AbstractC43061riF
    public InitData OLrzqt() {
        return C43056riA.AEQbTJ.EZpvd("okluatradingeco", "/bot/signal_bot/my_signal_bots_list", C56423yEv.EZpvd(C56390yDp.OLrzqt("type", KWHzl())));
    }
}
