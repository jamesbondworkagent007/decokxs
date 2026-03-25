package o;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import com.okinc.core.util.SPUtils;
import com.okinc.rxutils.RxBus;
import com.okinc.uilab.banner.OKAlertBanner;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class vBL extends android.widget.FrameLayout {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int EZpvd = 8;
    public final AbstractC50827vbW KWHzl;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vBL(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        AbstractC50827vbW abstractC50827vbWKWHzl = AbstractC50827vbW.KWHzl(android.view.LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(abstractC50827vbWKWHzl, "");
        this.KWHzl = abstractC50827vbWKWHzl;
        OKAlertBanner oKAlertBanner = abstractC50827vbWKWHzl.AEQbTJ;
        C52794wYp c52794wYpAEQbTJ = oKAlertBanner.AEQbTJ();
        c52794wYpAEQbTJ.setOnClickListener(new ActionBar(c52794wYpAEQbTJ, 1000L, context));
        android.widget.ImageView imageViewOLrzqt = oKAlertBanner.OLrzqt();
        imageViewOLrzqt.setOnClickListener(new Application(imageViewOLrzqt, 1000L, oKAlertBanner));
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.vBL.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void copydefault() {
        int i;
        xOU xouWlaJM;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        if (Intrinsics.EZpvd((java.lang.Object) ((interfaceC54581xNrOLrzqt == null || (xouWlaJM = interfaceC54581xNrOLrzqt.wlaJM()) == null) ? null : xouWlaJM.OLrzqt()), (java.lang.Object) "arbitrage")) {
            java.lang.String strGEmmrt = C55697xoo.OLrzqt.gEmmrt();
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append("sp_key_arbitrage_smart_guide-");
            sb.append(strGEmmrt);
            i = SPUtils.getBoolean(sb.toString(), true) ? 0 : 8;
        }
        setVisibility(i);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        LifecycleOwner lifecycleOwner = ViewTreeLifecycleOwner.get(this);
        if (lifecycleOwner != null) {
            AbstractC58185ywX<java.lang.String> abstractC58185ywXAEQbTJ = RxBus.AEQbTJ("bot_arb_smart_guide_need_finish");
            Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
            AbstractC58185ywX abstractC58185ywXOLrzqt = C58156yvv.OLrzqt(abstractC58185ywXAEQbTJ, lifecycleOwner, Lifecycle.Event.ON_DESTROY);
            final java.lang.Object obj = new java.lang.Object();
            abstractC58185ywXOLrzqt.subscribe(new RxBus.EventCallback<java.lang.String>(obj) { // from class: com.okinc.tradingbot.impl.order.strategy.arbitrage.view.ArbitrageSmartGuideView$onAttachedToWindow$1$1
                /* JADX DEBUG: Method merged with bridge method: onEvent(Ljava/lang/Object;)V */
                @Override // com.okinc.rxutils.RxBus.EventCallback
                public void onEvent(String str) {
                    Intrinsics.checkNotNullParameter(str, "");
                    Context context = this.this$0.getContext();
                    Activity activity = context instanceof Activity ? (Activity) context : null;
                    if (activity != null) {
                        activity.finish();
                    }
                }
            });
        }
    }

    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ android.content.Context copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, android.content.Context context) {
            this.KWHzl = view;
            this.AEQbTJ = j;
            this.copydefault = context;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.AEQbTJ || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                C52841waI.Companion.EZpvd(C35334ntP.KWHzl(this.copydefault));
            }
        }
    }

    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ OKAlertBanner OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, OKAlertBanner oKAlertBanner) {
            this.EZpvd = view;
            this.AEQbTJ = j;
            this.OLrzqt = oKAlertBanner;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.AEQbTJ || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                SPUtils.put("sp_key_arbitrage_smart_guide-" + C55697xoo.OLrzqt.gEmmrt(), java.lang.Boolean.FALSE);
                Intrinsics.copydefault(this.OLrzqt);
                this.OLrzqt.setVisibility(8);
            }
        }
    }
}
