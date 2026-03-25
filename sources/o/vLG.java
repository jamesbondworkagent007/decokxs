package o;

import android.view.View;
import com.okinc.unify_trade.bot.data.TacticsInsideItemData;
import com.okinc.unify_trade.bot.dcd.presenter.DcdRecommendPresenter;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class vLG extends AbstractC49945uyC<uMW, DcdRecommendPresenter> {
    public static final Application Companion = new Application(null);
    public static final int OLrzqt = 8;
    public Function0<Unit> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC49945uyC
    public int AEQbTJ() {
        return C48033uCm.Activity.zuBGHE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(@NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        this.copydefault = function0;
    }

    @Override // o.wXX
    public boolean getHasFooter() {
        return true;
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.vLG.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.vLG$Application */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ vLG newInstance$default(Application application, java.util.ArrayList arrayList, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                arrayList = null;
            }
            return application.KWHzl(arrayList);
        }

        public final vLG KWHzl(java.util.ArrayList<TacticsInsideItemData> arrayList) {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putParcelableArrayList("bot_dcd_recommend_data", arrayList);
            vLG vlg = new vLG();
            vlg.setArguments(bundle);
            return vlg;
        }
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.setStyle(1);
        wxq.setTitle(C33070mpX.AYXKKw(C48033uCm.Fragment.aJFbMH));
    }

    @Override // o.wXX, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        copydefault();
        isConnected();
    }

    private final void copydefault() {
        OLrzqt().AEQbTJ(getArguments());
    }

    private final void isConnected() {
        values().copydefault.setText(C33070mpX.AYXKKw(C48033uCm.Fragment.dLBcXg));
        values().KWHzl.setMatchResult("0", OLrzqt().OLrzqt(), C33070mpX.AYXKKw(C48033uCm.Fragment.aHXSQp));
    }

    @Override // o.wXX
    public void onFooterCreated(@NotNull wYF wyf) {
        Intrinsics.checkNotNullParameter(wyf, "");
        super.onFooterCreated(wyf);
        wyf.setType(5);
        wyf.setPrimaryText(C33070mpX.AYXKKw(C48033uCm.Fragment.OTwTPd));
        C52794wYp c52794wYpCopydefault = wyf.copydefault();
        if (c52794wYpCopydefault != null) {
            c52794wYpCopydefault.setOnClickListener(new Activity(c52794wYpCopydefault, 1000L, this));
        }
    }

    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ vLG EZpvd;
        public final /* synthetic */ long KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, vLG vlg) {
            this.AEQbTJ = view;
            this.KWHzl = j;
            this.EZpvd = vlg;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.KWHzl || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                Function0 function0 = this.EZpvd.copydefault;
                if (function0 != null) {
                    function0.invoke();
                }
                this.EZpvd.dismiss();
            }
        }
    }
}
