package o;

import androidx.databinding.DataBindingUtil;
import com.immomo.mls.InitData;
import com.okinc.dapp.bean.KOLProfileParamsBean;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.dLX;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.dtO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C14856dtO extends AbstractC43061riF {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int OLrzqt = 8;
    public AbstractC13468dMl EZpvd;
    public final java.lang.String copydefault = "DAppFeedsExtendedAuthorHome.lua";
    public final int AEQbTJ = dLX.Fragment.valueOf;
    public java.lang.String KWHzl = "";
    public java.lang.String AhwBna = "";
    public java.lang.String djBIcL = "";
    public java.lang.String AYXKKw = "";

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC43061riF
    public java.lang.String copydefault() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return this.AEQbTJ;
    }

    @Override // o.AbstractC43061riF
    public android.view.ViewGroup EZpvd() {
        AbstractC13468dMl abstractC13468dMl = this.EZpvd;
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
            java.lang.String string = arguments.getString("authorId");
            if (string == null) {
                string = "";
            }
            this.KWHzl = string;
            java.lang.String string2 = arguments.getString("nickName");
            if (string2 == null) {
                string2 = "";
            }
            this.AhwBna = string2;
            java.lang.String string3 = arguments.getString("portrait");
            if (string3 == null) {
                string3 = "";
            }
            this.djBIcL = string3;
            java.lang.String string4 = arguments.getString("source");
            this.AYXKKw = string4 != null ? string4 : "";
        }
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        this.EZpvd = (AbstractC13468dMl) DataBindingUtil.bind(view);
    }

    @Override // o.AbstractC43061riF
    public InitData OLrzqt() {
        return C43056riA.createInitDataForMiniApp$default(C43056riA.AEQbTJ, "okluadiscover", "/feeds/author", null, 4, null);
    }

    @Override // o.AbstractC43061riF
    public java.util.HashMap<java.lang.String, java.lang.Object> AEQbTJ() {
        return C56424yEw.AYXKKw(C56390yDp.OLrzqt("authorId", this.KWHzl), C56390yDp.OLrzqt("nickName", this.AhwBna), C56390yDp.OLrzqt("portrait", this.djBIcL), C56390yDp.OLrzqt("source", this.AYXKKw), C56390yDp.OLrzqt("appearance", "alternativeweb3"));
    }

    /* JADX INFO: renamed from: o.dtO$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.dtO.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final C14856dtO OLrzqt(@NotNull KOLProfileParamsBean kOLProfileParamsBean) {
            Intrinsics.checkNotNullParameter(kOLProfileParamsBean, "");
            C14856dtO c14856dtO = new C14856dtO();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("authorId", kOLProfileParamsBean.getAuthorId());
            bundle.putString("nickName", kOLProfileParamsBean.getNickName());
            bundle.putString("portrait", kOLProfileParamsBean.getPortrait());
            bundle.putString("source", kOLProfileParamsBean.getSource());
            c14856dtO.setArguments(bundle);
            return c14856dtO;
        }
    }
}
