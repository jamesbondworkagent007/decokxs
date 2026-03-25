package o;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.immomo.mls.InitData;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.qZH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.niQ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C34752niQ extends AbstractC34821njg {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int EZpvd = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC43061riF
    public java.lang.String copydefault() {
        return "CRKlineFeedHome.lua";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return qZH.ActionBar.spnCvw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
    }

    /* JADX INFO: renamed from: o.niQ$TaskDescription */
    /* JADX INFO: loaded from: classes23.dex */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.niQ.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public static /* synthetic */ C34752niQ newInstance$default(TaskDescription taskDescription, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, int i2, java.lang.Object obj) {
            if ((i2 & 2) != 0) {
                str2 = "Translate";
            }
            if ((i2 & 4) != 0) {
                str3 = "Primary";
            }
            if ((i2 & 8) != 0) {
                i = 24;
            }
            return taskDescription.EZpvd(str, str2, str3, i);
        }

        public final C34752niQ EZpvd(@NotNull java.lang.String str, java.lang.String str2, java.lang.String str3, int i) {
            Intrinsics.checkNotNullParameter(str, "");
            C34752niQ c34752niQ = new C34752niQ();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("data", str);
            bundle.putString("bgStyle", str2);
            bundle.putString(TtmlNode.TAG_STYLE, str3);
            bundle.putInt("edge", i);
            c34752niQ.setArguments(bundle);
            return c34752niQ;
        }
    }

    public final java.lang.String AhwBna() {
        java.lang.String string;
        android.os.Bundle arguments = getArguments();
        return (arguments == null || (string = arguments.getString("data")) == null) ? "BTC" : string;
    }

    /* JADX DEBUG: Possible override for method o.njg.KWHzl()V */
    public final java.lang.String KWHzl() {
        java.lang.String string;
        android.os.Bundle arguments = getArguments();
        return (arguments == null || (string = arguments.getString("bgStyle")) == null) ? "Translate" : string;
    }

    public final java.lang.String AYXKKw() {
        java.lang.String string;
        android.os.Bundle arguments = getArguments();
        return (arguments == null || (string = arguments.getString(TtmlNode.TAG_STYLE)) == null) ? "Primary" : string;
    }

    public final int djBIcL() {
        android.os.Bundle arguments = getArguments();
        if (arguments != null) {
            return arguments.getInt("edge", 24);
        }
        return 24;
    }

    @Override // o.AbstractC43061riF
    public android.view.ViewGroup EZpvd() {
        android.view.View view = getView();
        if (view != null) {
            return (android.view.ViewGroup) view.findViewById(qZH.StateListAnimator.GiPPlLRPuVlr);
        }
        return null;
    }

    @Override // o.AbstractC43061riF, o.AbstractC32998moE
    public void onVisible() {
        super.onVisible();
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) this, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    @Override // o.AbstractC43061riF
    public InitData OLrzqt() {
        return C43056riA.AEQbTJ.EZpvd("market", "/feed/CRKlineFeed", C56424yEw.gEmmrt(C56390yDp.OLrzqt("CoinName", AhwBna()), C56390yDp.OLrzqt("bgStyle", KWHzl()), C56390yDp.OLrzqt("styleName", AYXKKw()), C56390yDp.OLrzqt("edgeMargin", java.lang.Integer.valueOf(djBIcL()))));
    }
}
