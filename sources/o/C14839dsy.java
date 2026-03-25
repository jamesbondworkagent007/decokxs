package o;

import androidx.databinding.DataBindingUtil;
import com.immomo.mls.InitData;
import com.okinc.mln_ui.ui.okkit.UDGlobalValue;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.dLX;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.dsy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C14839dsy extends AbstractC43061riF {
    public static final Application Companion = new Application(null);
    public static final int KWHzl = 8;
    public AbstractC13468dMl OLrzqt;
    public final int copydefault = dLX.Fragment.valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC43061riF
    public java.lang.String copydefault() {
        return "DAppBoostHome.lua";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return this.copydefault;
    }

    @Override // o.AbstractC43061riF
    public android.view.ViewGroup EZpvd() {
        AbstractC13468dMl abstractC13468dMl = this.OLrzqt;
        Intrinsics.copydefault(abstractC13468dMl);
        android.widget.FrameLayout frameLayout = abstractC13468dMl.KWHzl;
        Intrinsics.checkNotNullExpressionValue(frameLayout, "");
        return frameLayout;
    }

    /* JADX INFO: renamed from: o.dsy$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.dsy.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final C14839dsy KWHzl() {
            return new C14839dsy();
        }
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        pUU.copydefault("BoostLuaHomeFragment initView");
        this.OLrzqt = (AbstractC13468dMl) DataBindingUtil.bind(view);
    }

    @Override // o.AbstractC43061riF
    public InitData OLrzqt() {
        return C43056riA.createInitDataForMiniApp$default(C43056riA.AEQbTJ, "okluadiscover", "/boost", null, 4, null);
    }

    @Override // o.AbstractC43061riF, o.AbstractC32998moE
    public void onVisible() {
        super.onVisible();
        ((xWN) C43251rlk.copydefault(xWN.class)).EZpvd(true);
    }

    @Override // o.AbstractC43061riF, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        UDGlobalValue.AEQbTJ();
    }

    @Override // o.AbstractC43061riF
    public java.util.HashMap<java.lang.String, java.lang.Object> AEQbTJ() {
        return C56424yEw.AYXKKw(C56390yDp.OLrzqt("appearance", "alternativeweb3"));
    }
}
