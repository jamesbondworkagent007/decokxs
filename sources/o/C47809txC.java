package o;

import androidx.lifecycle.LifecycleOwnerKt;
import com.immomo.mls.InitData;
import com.okinc.planet_api.model.DefiFeedParams;
import com.okinc.rxutils.RxBus;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.C47501trL;
import o.tWP;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.txC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C47809txC extends AbstractC43061riF {
    public static final Activity Companion = new Activity(null);
    public static final int KWHzl = 8;
    public boolean OLrzqt;
    public boolean copydefault;
    public java.lang.String EZpvd = "insights";
    public boolean AEQbTJ = true;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC43061riF
    public java.lang.String copydefault() {
        return "KlineFeedDexHome.lua";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return C47501trL.Application.spnCvw;
    }

    /* JADX INFO: renamed from: o.txC$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.txC.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final C47809txC copydefault(@NotNull DefiFeedParams defiFeedParams) {
            Intrinsics.checkNotNullParameter(defiFeedParams, "");
            C47809txC c47809txC = new C47809txC();
            c47809txC.EZpvd = defiFeedParams.getDefaultTab();
            c47809txC.OLrzqt = defiFeedParams.getNeedKeyStories();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("token", defiFeedParams.getToken());
            bundle.putString("chainId", defiFeedParams.getChainId());
            bundle.putString("contractAddress", defiFeedParams.getContractAddress());
            c47809txC.setArguments(bundle);
            return c47809txC;
        }
    }

    public final java.lang.String AYXKKw() {
        java.lang.String string;
        android.os.Bundle arguments = getArguments();
        return (arguments == null || (string = arguments.getString("token")) == null) ? "BTC" : string;
    }

    public final java.lang.String KWHzl() {
        java.lang.String string;
        android.os.Bundle arguments = getArguments();
        return (arguments == null || (string = arguments.getString("chainId")) == null) ? "" : string;
    }

    public final java.lang.String AhwBna() {
        java.lang.String string;
        android.os.Bundle arguments = getArguments();
        return (arguments == null || (string = arguments.getString("contractAddress")) == null) ? "" : string;
    }

    @Override // o.AbstractC43061riF
    public android.view.ViewGroup EZpvd() {
        android.view.View view = getView();
        if (view != null) {
            return (android.view.ViewGroup) view.findViewById(C47501trL.TaskDescription.DcMfJKgMxgjU);
        }
        return null;
    }

    @Override // o.AbstractC43061riF
    public InitData OLrzqt() {
        java.util.HashMap mapAYXKKw = C56424yEw.AYXKKw(C56390yDp.OLrzqt("token", AYXKKw()), C56390yDp.OLrzqt("chainId", KWHzl()), C56390yDp.OLrzqt("contractAddress", AhwBna()), C56390yDp.OLrzqt("selectTabName", this.EZpvd), C56390yDp.OLrzqt("entryIdentifier", java.lang.String.valueOf(hashCode())));
        if (Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) "news") && this.OLrzqt) {
            mapAYXKKw.put("important", "selected");
        }
        return C43056riA.AEQbTJ.EZpvd("market", "/feed/klineFeedDexHome", mapAYXKKw);
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        view.post(new java.lang.Runnable() { // from class: o.txH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C47809txC.AEQbTJ(this.copydefault);
            }
        });
    }

    public static final void AEQbTJ(C47809txC c47809txC) {
        if (c47809txC.copydefault) {
            return;
        }
        c47809txC.copydefault = true;
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) c47809txC, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    @Override // o.AbstractC32998moE, o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        if (this.AEQbTJ) {
            AbstractC58185ywX abstractC58185ywXKWHzl = RxBus.KWHzl(tWP.class, "");
            Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
            C58156yvv.EZpvd(abstractC58185ywXKWHzl, this).subscribe(new RxBus.EventCallback<tWP>() { // from class: com.okinc.planet.biz_feed_kline.KlineDefiFeedCombineFragment$onResume$1
                {
                    super(this.this$0);
                }

                /* JADX DEBUG: Method merged with bridge method: onEvent(Ljava/lang/Object;)V */
                @Override // com.okinc.rxutils.RxBus.EventCallback
                public void onEvent(tWP twp) {
                    Intrinsics.checkNotNullParameter(twp, "");
                    BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this.this$0), null, null, new KlineDefiFeedCombineFragment$onResume$1$onEvent$1(twp, this.this$0, null), 3, null);
                }

                @Override // com.okinc.rxutils.BaseSubscriber, o.InterfaceC60097zve
                public void onComplete() {
                    super.onComplete();
                    this.this$0.AEQbTJ = true;
                }

                @Override // com.okinc.rxutils.BaseSubscriber, o.InterfaceC58217yxC
                public void dispose() {
                    super.dispose();
                    this.this$0.AEQbTJ = true;
                }
            });
            this.AEQbTJ = false;
        }
    }

    @Override // o.AbstractC43061riF, o.AbstractC32998moE
    public void onVisible() {
        super.onVisible();
    }
}
