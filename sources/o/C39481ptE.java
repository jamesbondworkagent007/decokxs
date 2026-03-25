package o;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.kline.data.KLineEventBean;
import com.okinc.localization.util.format.OKDateEnum;
import com.okinc.localization.util.format.OKTimeEnum;
import java.util.Date;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C35964oKf;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ptE, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C39481ptE extends AbstractC59533zio<KLineEventBean, Application> {
    public final android.content.Context AEQbTJ;
    public final Function2<java.lang.Integer, KLineEventBean, Unit> EZpvd;
    public final boolean OLrzqt;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? false : (r2v0 boolean))
  (wrap:kotlin.jvm.functions.Function2:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null kotlin.jvm.functions.Function2) : (r3v0 kotlin.jvm.functions.Function2))
 A[MD:(android.content.Context, boolean, kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super com.okinc.kline.data.KLineEventBean, kotlin.Unit>):void (m)] (LINE:33) call: o.ptE.<init>(android.content.Context, boolean, kotlin.jvm.functions.Function2):void type: THIS */
    public /* synthetic */ C39481ptE(android.content.Context context, boolean z, Function2 function2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? false : z, (i & 4) != 0 ? null : function2);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super com.okinc.kline.data.KLineEventBean, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public C39481ptE(@NotNull android.content.Context context, boolean z, Function2<? super java.lang.Integer, ? super KLineEventBean, Unit> function2) {
        Intrinsics.checkNotNullParameter(context, "");
        this.AEQbTJ = context;
        this.OLrzqt = z;
        this.EZpvd = function2;
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public Application onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        android.view.View viewInflate = layoutInflater.inflate(C35964oKf.Application.ODXsMY, viewGroup, false);
        Intrinsics.copydefault(viewInflate);
        return new Application(viewInflate);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0022  */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onBindViewHolder(@NotNull Application application, @NotNull KLineEventBean kLineEventBean) {
        boolean z;
        Intrinsics.checkNotNullParameter(application, "");
        Intrinsics.checkNotNullParameter(kLineEventBean, "");
        java.util.Locale locale = java.util.Locale.getDefault();
        Intrinsics.checkNotNullExpressionValue(locale, "");
        if (!C38303pTu.OLrzqt(locale)) {
            java.util.Locale locale2 = java.util.Locale.getDefault();
            Intrinsics.checkNotNullExpressionValue(locale2, "");
            if (C38303pTu.KWHzl(locale2)) {
                copydefault(application);
            }
        }
        android.widget.TextView textViewDjBIcL = application.djBIcL();
        if (textViewDjBIcL != null) {
            textViewDjBIcL.setText(kLineEventBean.getEventName());
        }
        android.widget.TextView textViewValueOf = application.valueOf();
        if (textViewValueOf != null) {
            textViewValueOf.setText(pTA.format$default(new Date(kLineEventBean.getDate()), OKDateEnum.DATE_FORMAT_SIMPLE, OKTimeEnum.TIME_FORMAT_SIMPLE_HM, null, null, false, 28, null));
        }
        android.widget.TextView textViewAhwBna = application.AhwBna();
        if (textViewAhwBna != null) {
            java.lang.String actual = kLineEventBean.getActual();
            if (actual.length() == 0) {
                actual = "-";
            }
            textViewAhwBna.setText(actual);
        }
        android.widget.TextView textViewGEmmrt = application.gEmmrt();
        if (textViewGEmmrt != null) {
            java.lang.String forecast = kLineEventBean.getForecast();
            if (forecast.length() == 0) {
                forecast = "-";
            }
            textViewGEmmrt.setText(forecast);
        }
        android.widget.TextView textViewAYXKKw = application.AYXKKw();
        if (textViewAYXKKw != null) {
            java.lang.String previous = kLineEventBean.getPrevious();
            if (previous.length() == 0) {
                previous = "-";
            }
            textViewAYXKKw.setText(previous);
        }
        android.widget.TextView textViewAhwBna2 = application.AhwBna();
        if (Intrinsics.EZpvd((java.lang.Object) (textViewAhwBna2 != null ? textViewAhwBna2.getText() : null), (java.lang.Object) "-")) {
            android.widget.TextView textViewGEmmrt2 = application.gEmmrt();
            if (Intrinsics.EZpvd((java.lang.Object) (textViewGEmmrt2 != null ? textViewGEmmrt2.getText() : null), (java.lang.Object) "-")) {
                android.widget.TextView textViewAYXKKw2 = application.AYXKKw();
                if (Intrinsics.EZpvd((java.lang.Object) (textViewAYXKKw2 != null ? textViewAYXKKw2.getText() : null), (java.lang.Object) "-")) {
                    z = true;
                }
            }
        } else {
            z = false;
        }
        android.widget.LinearLayout linearLayoutAEQbTJ = application.AEQbTJ();
        if (linearLayoutAEQbTJ != null) {
            linearLayoutAEQbTJ.setVisibility(z ^ true ? 0 : 8);
        }
        android.widget.LinearLayout linearLayoutEZpvd = application.EZpvd();
        if (linearLayoutEZpvd != null) {
            linearLayoutEZpvd.setVisibility(z ^ true ? 0 : 8);
        }
        android.widget.LinearLayout linearLayoutKWHzl = application.KWHzl();
        if (linearLayoutKWHzl != null) {
            linearLayoutKWHzl.setVisibility(z ^ true ? 0 : 8);
        }
        if (application.getBindingAdapterPosition() == getAdapter().getItemCount() - 1) {
            android.view.View viewCopydefault = application.copydefault();
            if (viewCopydefault != null) {
                viewCopydefault.setVisibility(8);
            }
        } else {
            android.view.View viewCopydefault2 = application.copydefault();
            if (viewCopydefault2 != null) {
                viewCopydefault2.setVisibility(0);
            }
        }
        OLrzqt(application, kLineEventBean);
    }

    public final void OLrzqt(Application application, KLineEventBean kLineEventBean) {
        pGS pgsOLrzqt = application.OLrzqt();
        if (pgsOLrzqt != null) {
            pgsOLrzqt.setVisibility((!this.OLrzqt || kLineEventBean.getDate() <= java.lang.System.currentTimeMillis()) ? 8 : 0);
            if (pgsOLrzqt.getVisibility() == 0) {
                pgsOLrzqt.setOnClickListener(new ActionBar(pgsOLrzqt, 1000L, this, application, kLineEventBean));
                pgsOLrzqt.EZpvd(kLineEventBean.isAddReminder(), Intrinsics.EZpvd((java.lang.Object) pFN.OLrzqt.KWHzl(), (java.lang.Object) "kline_dark"));
            }
        }
    }

    public final void copydefault(Application application) {
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.LayoutParams layoutParams2;
        ViewGroup.LayoutParams layoutParams3;
        android.widget.TextView textViewDbNXlk = application.DbNXlk();
        if (textViewDbNXlk != null && (layoutParams3 = textViewDbNXlk.getLayoutParams()) != null) {
            layoutParams3.width = C55298xhM.dp2px$default(56.0f, null, 1, null);
        }
        android.widget.TextView textViewIsConnected = application.isConnected();
        if (textViewIsConnected != null && (layoutParams2 = textViewIsConnected.getLayoutParams()) != null) {
            layoutParams2.width = C55298xhM.dp2px$default(56.0f, null, 1, null);
        }
        android.widget.TextView textViewAkhnZx = application.AkhnZx();
        if (textViewAkhnZx == null || (layoutParams = textViewAkhnZx.getLayoutParams()) == null) {
            return;
        }
        layoutParams.width = C55298xhM.dp2px$default(56.0f, null, 1, null);
    }

    /* JADX INFO: renamed from: o.ptE$Application */
    public static final class Application extends RecyclerView.ViewHolder {
        public final android.widget.LinearLayout AEQbTJ;
        public final android.widget.TextView AYXKKw;
        public final android.widget.TextView AhwBna;
        public final android.widget.TextView AkhnZx;
        public final android.widget.LinearLayout EZpvd;
        public final pGS KWHzl;
        public final android.view.View OLrzqt;
        public final android.widget.LinearLayout copydefault;
        public final android.widget.TextView djBIcL;
        public final android.widget.TextView fetchVPNInfo;
        public final android.widget.TextView gEmmrt;
        public final android.widget.TextView isConnected;
        public final android.widget.TextView valueOf;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final android.widget.LinearLayout AEQbTJ() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final android.widget.TextView AYXKKw() {
            return this.AhwBna;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final android.widget.TextView AhwBna() {
            return this.djBIcL;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final android.widget.TextView AkhnZx() {
            return this.isConnected;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final android.widget.TextView DbNXlk() {
            return this.fetchVPNInfo;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final android.widget.LinearLayout EZpvd() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final android.widget.LinearLayout KWHzl() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final pGS OLrzqt() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final android.view.View copydefault() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final android.widget.TextView djBIcL() {
            return this.valueOf;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final android.widget.TextView gEmmrt() {
            return this.AYXKKw;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final android.widget.TextView isConnected() {
            return this.AkhnZx;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final android.widget.TextView valueOf() {
            return this.gEmmrt;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Application(@NotNull android.view.View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "");
            this.KWHzl = (pGS) view.findViewById(C35964oKf.StateListAnimator.AxsJAYaxsJAY);
            this.valueOf = (android.widget.TextView) view.findViewById(C35964oKf.StateListAnimator.getVolumeControl);
            this.gEmmrt = (android.widget.TextView) view.findViewById(C35964oKf.StateListAnimator.MediaControllerCompatMediaControllerImplApi21);
            this.djBIcL = (android.widget.TextView) view.findViewById(C35964oKf.StateListAnimator.MediaBrowserCompatSubscriptionCallbackSubscriptionCallbackApi21);
            this.fetchVPNInfo = (android.widget.TextView) view.findViewById(C35964oKf.StateListAnimator.MediaControllerCompatTransportControlsApi23);
            this.AYXKKw = (android.widget.TextView) view.findViewById(C35964oKf.StateListAnimator.RatingCompat);
            this.AkhnZx = (android.widget.TextView) view.findViewById(C35964oKf.StateListAnimator.MediaControllerCompatTransportControlsApi21);
            this.AhwBna = (android.widget.TextView) view.findViewById(C35964oKf.StateListAnimator.setShuffleModeEnabledRemoved);
            this.isConnected = (android.widget.TextView) view.findViewById(C35964oKf.StateListAnimator.skipToPrevious);
            this.OLrzqt = view.findViewById(C35964oKf.StateListAnimator.DLGVGj);
            this.copydefault = (android.widget.LinearLayout) view.findViewById(C35964oKf.StateListAnimator.copydefault);
            this.EZpvd = (android.widget.LinearLayout) view.findViewById(C35964oKf.StateListAnimator.iPSTqm);
            this.AEQbTJ = (android.widget.LinearLayout) view.findViewById(C35964oKf.StateListAnimator.QAQCdZ);
        }
    }

    /* JADX INFO: renamed from: o.ptE$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ Application EZpvd;
        public final /* synthetic */ KLineEventBean KWHzl;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ C39481ptE copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, C39481ptE c39481ptE, Application application, KLineEventBean kLineEventBean) {
            this.AEQbTJ = view;
            this.OLrzqt = j;
            this.copydefault = c39481ptE;
            this.EZpvd = application;
            this.KWHzl = kLineEventBean;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.OLrzqt || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                Function2 function2 = this.copydefault.EZpvd;
                if (function2 != null) {
                }
            }
        }
    }
}
