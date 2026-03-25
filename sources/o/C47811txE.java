package o;

import com.immomo.mls.InitData;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C47501trL;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.txE, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C47811txE extends AbstractC43061riF {
    public static final Application Companion = new Application(null);
    public static final int EZpvd = 8;
    public boolean AEQbTJ;
    public final java.lang.String KWHzl = "MarketAssetInsightEntry.lua";
    public final int OLrzqt = C47501trL.Application.finit;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC43061riF
    public java.lang.String copydefault() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return this.OLrzqt;
    }

    /* JADX INFO: renamed from: o.txE$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.txE.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    @Override // o.AbstractC43061riF
    public android.view.ViewGroup EZpvd() {
        android.view.View view = getView();
        if (view != null) {
            return (android.view.ViewGroup) view.findViewById(C47501trL.TaskDescription.svY);
        }
        return null;
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        view.post(new java.lang.Runnable() { // from class: o.txB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C47811txE.EZpvd(this.copydefault);
            }
        });
    }

    public static final void EZpvd(C47811txE c47811txE) {
        if (c47811txE.AEQbTJ) {
            return;
        }
        c47811txE.AEQbTJ = true;
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) c47811txE, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    @Override // o.AbstractC43061riF
    public InitData OLrzqt() {
        java.lang.String string;
        C43056riA c43056riA = C43056riA.AEQbTJ;
        android.os.Bundle arguments = getArguments();
        if (arguments == null || (string = arguments.getString("token")) == null) {
            string = "";
        }
        return c43056riA.EZpvd("market", "/feed/assetInsight", C56423yEv.EZpvd(C56390yDp.OLrzqt("token", string)));
    }
}
