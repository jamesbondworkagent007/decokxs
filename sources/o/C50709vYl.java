package o;

import androidx.recyclerview.widget.LinearLayoutManager;
import com.okinc.unify_trade.bot.data.ExplainContentData;
import com.okinc.unify_trade.bot.data.ExplainTitleData;
import com.okinc.unify_trade.bot.signalbot.viewmodel.SignalBotExplainedPresenter;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.vYl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C50709vYl extends AbstractC54505xKx<AbstractC48422uQx, SignalBotExplainedPresenter> {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int EZpvd = 8;
    public final int KWHzl = C48033uCm.Activity.UscePu;
    public final C43316rmw copydefault = new C43316rmw();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return this.KWHzl;
    }

    /* JADX INFO: renamed from: o.vYl$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.vYl.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final C50709vYl KWHzl(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            C50709vYl c50709vYl = new C50709vYl();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("explain_type", str);
            c50709vYl.setArguments(bundle);
            return c50709vYl;
        }
    }

    @Override // o.AbstractC56129xww, o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        SignalBotExplainedPresenter signalBotExplainedPresenterDxcTrN = dxcTrN();
        android.os.Bundle arguments = getArguments();
        signalBotExplainedPresenterDxcTrN.KWHzl(arguments != null ? arguments.getString("explain_type") : null);
        KWHzl();
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) this, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    private final void KWHzl() {
        this.copydefault.register(ExplainContentData.class, new vZP());
        this.copydefault.register(ExplainTitleData.class, new vZM());
        gGvvIC().EZpvd.setLayoutManager(new LinearLayoutManager(getContext()));
        gGvvIC().EZpvd.setAdapter(this.copydefault);
        C33064mpR.OLrzqt(this.copydefault, (java.util.List<? extends java.lang.Object>) dxcTrN().KWHzl());
    }
}
