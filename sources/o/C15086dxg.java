package o;

import androidx.databinding.DataBindingUtil;
import com.immomo.mls.InitData;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.dLX;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.dxg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C15086dxg extends AbstractC43061riF {
    public boolean KWHzl;
    public AbstractC13468dMl OLrzqt;
    public static final Application Companion = new Application(null);
    public static final int AEQbTJ = 8;
    public final java.lang.String copydefault = "DAppNewHome.lua";
    public final int EZpvd = dLX.Fragment.valueOf;
    public java.lang.String valueOf = "";

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC43061riF
    public java.lang.String copydefault() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return this.EZpvd;
    }

    @Override // o.AbstractC43061riF
    public android.view.ViewGroup EZpvd() {
        AbstractC13468dMl abstractC13468dMl = this.OLrzqt;
        Intrinsics.copydefault(abstractC13468dMl);
        android.widget.FrameLayout frameLayout = abstractC13468dMl.KWHzl;
        Intrinsics.checkNotNullExpressionValue(frameLayout, "");
        return frameLayout;
    }

    @Override // o.AbstractC43061riF, androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        java.lang.String string;
        super.onCreate(bundle);
        android.os.Bundle arguments = getArguments();
        if (arguments == null || (string = arguments.getString("rootPage")) == null) {
            string = "";
        }
        this.valueOf = string;
        android.os.Bundle arguments2 = getArguments();
        this.KWHzl = arguments2 != null ? arguments2.getBoolean("isRootPage") : false;
        if (bundle == null || !C33129mqd.OLrzqt((java.lang.CharSequence) this.valueOf)) {
            return;
        }
        C15148dyp c15148dyp = C15148dyp.copydefault;
        java.lang.String str = this.valueOf;
        androidx.fragment.app.Fragment parentFragment = getParentFragment();
        C15148dyp.storeFragmentData$default(c15148dyp, str, parentFragment != null ? parentFragment.getParentFragmentManager() : null, null, null, null, 28, null);
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        this.OLrzqt = (AbstractC13468dMl) DataBindingUtil.bind(view);
    }

    @Override // o.AbstractC43061riF
    public InitData OLrzqt() {
        return C43056riA.createInitDataForMiniApp$default(C43056riA.AEQbTJ, "okluadiscover", "/dappHomeTab", null, 4, null);
    }

    @Override // o.AbstractC43061riF, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // o.AbstractC43061riF
    public java.util.HashMap<java.lang.String, java.lang.Object> AEQbTJ() {
        return C56424yEw.AYXKKw(C56390yDp.OLrzqt("rootPage", this.valueOf));
    }

    /* JADX INFO: renamed from: o.dxg$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.dxg.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public static /* synthetic */ C15086dxg newInstance$default(Application application, java.lang.String str, boolean z, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = null;
            }
            if ((i & 2) != 0) {
                z = false;
            }
            return application.EZpvd(str, z);
        }

        public final C15086dxg EZpvd(java.lang.String str, boolean z) {
            C15086dxg c15086dxg = new C15086dxg();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("rootPage", str);
            bundle.putBoolean("isRootPage", z);
            c15086dxg.setArguments(bundle);
            return c15086dxg;
        }
    }
}
