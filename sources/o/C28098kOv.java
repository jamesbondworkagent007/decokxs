package o;

import com.okinc.localization.util.format.OKDateEnum;
import com.okinc.localization.util.format.OKTimeEnum;
import com.okinc.market.common.bean.PreMarketLandingBean;
import java.util.Date;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.qZH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kOv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C28098kOv extends android.widget.FrameLayout {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int copydefault = 8;
    public android.widget.TextView AEQbTJ;
    public android.view.View AhwBna;
    public android.widget.TextView EZpvd;
    public android.widget.TextView KWHzl;
    public android.widget.TextView OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setView(@NotNull android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        this.AhwBna = view;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28098kOv(@NotNull android.content.Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "");
        setView(android.view.View.inflate(context, qZH.ActionBar.ODWQjV, null));
    }

    public final android.view.View copydefault() {
        android.view.View view = this.AhwBna;
        if (view != null) {
            return view;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    /* JADX INFO: renamed from: o.kOv$TaskDescription */
    /* JADX INFO: loaded from: classes18.dex */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.kOv.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    public final void setData(@NotNull PreMarketLandingBean preMarketLandingBean, @NotNull android.graphics.drawable.Drawable drawable) {
        Intrinsics.checkNotNullParameter(preMarketLandingBean, "");
        Intrinsics.checkNotNullParameter(drawable, "");
        xUW xuw = xUW.KWHzl;
        java.lang.String instId = preMarketLandingBean.getInstId();
        if (instId == null) {
            instId = "";
        }
        java.lang.String upperCase = C44585sZg.AEQbTJ(xuw.AEQbTJ(instId)).AEQbTJ().toUpperCase(java.util.Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase, "");
        ((android.widget.TextView) copydefault().findViewById(qZH.StateListAnimator.ICustomTabsService)).setText(preMarketLandingBean.getCcy());
        ((android.widget.TextView) copydefault().findViewById(qZH.StateListAnimator.ICustomTabsCallbackDefault)).setText(preMarketLandingBean.getFullName());
        this.KWHzl = (android.widget.TextView) copydefault().findViewById(qZH.StateListAnimator.asInterface);
        this.EZpvd = (android.widget.TextView) copydefault().findViewById(qZH.StateListAnimator.ICustomTabsCallbackStub);
        this.OLrzqt = (android.widget.TextView) copydefault().findViewById(qZH.StateListAnimator.ICustomTabsCallbackStubProxy);
        android.widget.TextView textView = this.KWHzl;
        if (textView != null) {
            xMR xmr = xMR.copydefault;
            java.lang.String lastPrice = preMarketLandingBean.getLastPrice();
            if (lastPrice == null) {
                lastPrice = "";
            }
            textView.setText(xmr.copydefault(lastPrice) + " " + upperCase);
        }
        C54536xML c54536xML = new C54536xML();
        java.lang.String totalVolume = preMarketLandingBean.getTotalVolume();
        if (totalVolume == null) {
            totalVolume = "";
        }
        java.lang.String strOLrzqt = c54536xML.OLrzqt(totalVolume);
        android.widget.TextView textView2 = (android.widget.TextView) copydefault().findViewById(qZH.StateListAnimator.setDefaultImpl);
        textView2.setText(strOLrzqt + " " + upperCase);
        this.AEQbTJ = textView2;
        kOD kod = (kOD) copydefault().findViewById(qZH.StateListAnimator.zdxASf);
        java.lang.String state = preMarketLandingBean.getState();
        kod.setTagStyle(state != null ? state : "", true);
        android.widget.TextView textView3 = (android.widget.TextView) copydefault().findViewById(qZH.StateListAnimator.izFvvl);
        if (Intrinsics.EZpvd((java.lang.Object) preMarketLandingBean.getState(), (java.lang.Object) "preopen")) {
            textView3.setVisibility(0);
            android.widget.TextView textView4 = this.EZpvd;
            if (textView4 != null) {
                textView4.setVisibility(8);
            }
            android.widget.TextView textView5 = this.KWHzl;
            if (textView5 != null) {
                textView5.setVisibility(8);
            }
            android.widget.TextView textView6 = this.OLrzqt;
            if (textView6 != null) {
                textView6.setVisibility(8);
            }
            android.widget.TextView textView7 = this.AEQbTJ;
            if (textView7 != null) {
                textView7.setVisibility(8);
            }
            if (C33129mqd.OLrzqt((java.lang.CharSequence) preMarketLandingBean.getListTime())) {
                textView3.setText(C33069mpW.copydefault(qZH.PendingIntent.HJWChPURsaBn, C56423yEv.EZpvd(C56390yDp.OLrzqt("dateTime", pTA.format$default(new Date(C33129mqd.valueOf(preMarketLandingBean.getListTime())), OKDateEnum.DATE_FORMAT_SIMPLE_MD, OKTimeEnum.TIME_FORMAT_STANDARD, null, null, false, 28, null)))));
                return;
            } else {
                Intrinsics.copydefault(textView3);
                textView3.setText(C41431qqg.copydefault(textView3, qZH.PendingIntent.HJWChPzRXNTw));
                return;
            }
        }
        textView3.setVisibility(8);
        android.widget.TextView textView8 = this.EZpvd;
        if (textView8 != null) {
            textView8.setVisibility(0);
        }
        android.widget.TextView textView9 = this.KWHzl;
        if (textView9 != null) {
            textView9.setVisibility(0);
        }
        android.widget.TextView textView10 = this.OLrzqt;
        if (textView10 != null) {
            textView10.setVisibility(0);
        }
        android.widget.TextView textView11 = this.AEQbTJ;
        if (textView11 != null) {
            textView11.setVisibility(0);
        }
    }
}
