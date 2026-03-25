package o;

import androidx.databinding.DataBindingUtil;
import com.immomo.mls.InitData;
import com.okinc.dapp.bean.FeedsParamBean;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.dLX;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.dwZ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C15026dwZ extends AbstractC43061riF {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int copydefault = 8;
    public AbstractC13468dMl OLrzqt;
    public final java.lang.String KWHzl = "DAppDexFeedsHome.lua";
    public final int EZpvd = dLX.Fragment.valueOf;
    public java.lang.String AEQbTJ = "";
    public java.lang.String AhwBna = "";

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
        super.onCreate(bundle);
        android.os.Bundle arguments = getArguments();
        if (arguments != null) {
            java.lang.String string = arguments.getString("chainId");
            if (string == null) {
                string = "";
            }
            this.AEQbTJ = string;
            java.lang.String string2 = arguments.getString("tokenAddress");
            this.AhwBna = string2 != null ? string2 : "";
        }
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        this.OLrzqt = (AbstractC13468dMl) DataBindingUtil.bind(view);
    }

    @Override // o.AbstractC43061riF
    public InitData OLrzqt() {
        return C43056riA.createInitDataForMiniApp$default(C43056riA.AEQbTJ, "okluadiscover", "/dexFeeds", null, 4, null);
    }

    @Override // o.AbstractC43061riF
    public java.util.HashMap<java.lang.String, java.lang.Object> AEQbTJ() {
        return C56424yEw.AYXKKw(C56390yDp.OLrzqt("chainId", this.AEQbTJ), C56390yDp.OLrzqt("tokenAddress", this.AhwBna), C56390yDp.OLrzqt("appearance", "alternativeweb3"));
    }

    /* JADX INFO: renamed from: o.dwZ$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.dwZ.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final C15026dwZ KWHzl(@NotNull FeedsParamBean feedsParamBean) {
            Intrinsics.checkNotNullParameter(feedsParamBean, "");
            java.lang.String chainId = feedsParamBean.getChainId();
            if (chainId == null) {
                chainId = "";
            }
            java.lang.String tokenAddress = feedsParamBean.getTokenAddress();
            java.lang.String str = tokenAddress != null ? tokenAddress : "";
            C15026dwZ c15026dwZ = new C15026dwZ();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("chainId", chainId);
            bundle.putString("tokenAddress", str);
            c15026dwZ.setArguments(bundle);
            return c15026dwZ;
        }
    }
}
