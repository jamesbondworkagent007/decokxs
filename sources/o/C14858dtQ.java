package o;

import androidx.databinding.DataBindingUtil;
import com.immomo.mls.InitData;
import com.okinc.dapp.bean.VibeFeedsParamsBean;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.dLX;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.dtQ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C14858dtQ extends AbstractC43061riF {
    public static final Activity Companion = new Activity(null);
    public static final int OLrzqt = 8;
    public int AhwBna;
    public long KWHzl;
    public int copydefault;
    public AbstractC13468dMl djBIcL;
    public long valueOf;
    public final java.lang.String AEQbTJ = "DAppDexVibePresentedFeedsHome.lua";
    public final int gEmmrt = dLX.Fragment.valueOf;
    public java.lang.String EZpvd = "";
    public java.lang.String isConnected = "";
    public java.lang.String AkhnZx = "";
    public java.lang.String AYXKKw = "";

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC43061riF
    public java.lang.String copydefault() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return this.gEmmrt;
    }

    @Override // o.AbstractC43061riF
    public android.view.ViewGroup EZpvd() {
        AbstractC13468dMl abstractC13468dMl = this.djBIcL;
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
            this.valueOf = arguments.getLong("eventTime");
            java.lang.String string = arguments.getString("chainId");
            if (string == null) {
                string = "";
            }
            this.EZpvd = string;
            java.lang.String string2 = arguments.getString("tokenTicker");
            if (string2 == null) {
                string2 = "";
            }
            this.isConnected = string2;
            java.lang.String string3 = arguments.getString("tokenContractAddress");
            if (string3 == null) {
                string3 = "";
            }
            this.AkhnZx = string3;
            this.copydefault = arguments.getInt("dimensionType");
            this.KWHzl = arguments.getLong("duration");
            this.AhwBna = arguments.getInt("timeUnit");
            java.lang.String string4 = arguments.getString("firstMentionContentId");
            this.AYXKKw = string4 != null ? string4 : "";
        }
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        this.djBIcL = (AbstractC13468dMl) DataBindingUtil.bind(view);
    }

    @Override // o.AbstractC43061riF
    public InitData OLrzqt() {
        return C43056riA.createInitDataForMiniApp$default(C43056riA.AEQbTJ, "okluadiscover", "/dexKOLFeeds", null, 4, null);
    }

    @Override // o.AbstractC43061riF
    public java.util.HashMap<java.lang.String, java.lang.Object> AEQbTJ() {
        return C56424yEw.AYXKKw(C56390yDp.OLrzqt("eventTime", C33129mqd.gEmmrt(java.lang.Long.valueOf(this.valueOf))), C56390yDp.OLrzqt("chainId", this.EZpvd), C56390yDp.OLrzqt("tokenTicker", this.isConnected), C56390yDp.OLrzqt("tokenContractAddress", this.AkhnZx), C56390yDp.OLrzqt("dimensionType", java.lang.Integer.valueOf(this.copydefault)), C56390yDp.OLrzqt("duration", C33129mqd.gEmmrt(java.lang.Long.valueOf(this.KWHzl))), C56390yDp.OLrzqt("timeUnit", java.lang.Integer.valueOf(this.AhwBna)), C56390yDp.OLrzqt("firstMentionContentId", this.AYXKKw), C56390yDp.OLrzqt("appearance", "alternativeweb3"));
    }

    /* JADX INFO: renamed from: o.dtQ$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.dtQ.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final C14858dtQ AEQbTJ(@NotNull VibeFeedsParamsBean vibeFeedsParamsBean) {
            Intrinsics.checkNotNullParameter(vibeFeedsParamsBean, "");
            C14858dtQ c14858dtQ = new C14858dtQ();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putLong("eventTime", vibeFeedsParamsBean.getEventTime());
            bundle.putString("chainId", vibeFeedsParamsBean.getChainId());
            bundle.putString("tokenTicker", vibeFeedsParamsBean.getTokenTicker());
            bundle.putString("tokenContractAddress", vibeFeedsParamsBean.getTokenContractAddress());
            bundle.putInt("dimensionType", vibeFeedsParamsBean.getDimensionType());
            bundle.putLong("duration", vibeFeedsParamsBean.getDuration());
            bundle.putInt("timeUnit", vibeFeedsParamsBean.getTimeUnit());
            bundle.putString("firstMentionContentId", vibeFeedsParamsBean.getFirstMentionContentId());
            c14858dtQ.setArguments(bundle);
            return c14858dtQ;
        }
    }
}
