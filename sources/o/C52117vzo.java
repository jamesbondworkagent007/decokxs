package o;

import android.view.View;
import android.widget.CompoundButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bumptech.glide.Glide;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.okinc.account.api.model.security.otp.OtpEventTracker;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.liveness.lca.EopTrackEvent;
import com.okinc.tradingbot.impl.widget.ArbitrageOrderConfirmData;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C48033uCm;
import o.C55688xof;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.vzo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C52117vzo extends wXX {
    public static final Application Companion = new Application(null);
    public static final int KWHzl = 8;
    public ArbitrageOrderConfirmData AEQbTJ;
    public ArbitrageOrderConfirmData EZpvd;
    public Function0<Unit> OLrzqt;
    public InterfaceC58217yxC copydefault;

    /* JADX INFO: renamed from: o.vzo$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.vzo.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final C52117vzo copydefault(@NotNull ArbitrageOrderConfirmData arbitrageOrderConfirmData, @NotNull ArbitrageOrderConfirmData arbitrageOrderConfirmData2, @NotNull Function0<Unit> function0) {
            Intrinsics.checkNotNullParameter(arbitrageOrderConfirmData, "");
            Intrinsics.checkNotNullParameter(arbitrageOrderConfirmData2, "");
            Intrinsics.checkNotNullParameter(function0, "");
            C52117vzo c52117vzo = new C52117vzo();
            if (c52117vzo.getArguments() == null) {
                c52117vzo.setArguments(new android.os.Bundle());
            }
            android.os.Bundle arguments = c52117vzo.getArguments();
            if (arguments != null) {
                arguments.putParcelable(TtmlNode.LEFT, arbitrageOrderConfirmData);
            }
            android.os.Bundle arguments2 = c52117vzo.getArguments();
            if (arguments2 != null) {
                arguments2.putParcelable(TtmlNode.RIGHT, arbitrageOrderConfirmData2);
            }
            c52117vzo.OLrzqt = function0;
            return c52117vzo;
        }
    }

    @Override // o.wXX, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        android.os.Bundle arguments = getArguments();
        this.EZpvd = arguments != null ? (ArbitrageOrderConfirmData) arguments.getParcelable(TtmlNode.LEFT) : null;
        android.os.Bundle arguments2 = getArguments();
        this.AEQbTJ = arguments2 != null ? (ArbitrageOrderConfirmData) arguments2.getParcelable(TtmlNode.RIGHT) : null;
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.setStyle(1);
        wxq.setTitle(C33070mpX.AYXKKw(C55688xof.Application.LayoutRes));
        wxq.KWHzl().setVisibility(0);
        wxq.AEQbTJ().setVisibility(8);
        wxq.setDividerVisibility(true);
        android.widget.ImageView imageViewKWHzl = wxq.KWHzl();
        imageViewKWHzl.setOnClickListener(new ActionBar(imageViewKWHzl, 1000L, this));
    }

    /* JADX INFO: renamed from: o.vzo$TaskDescription */
    public static final class TaskDescription implements Function1<EventParamsList, Unit> {
        public static final TaskDescription AEQbTJ = new TaskDescription();

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(EventParamsList eventParamsList) {
            KWHzl(eventParamsList);
            return Unit.INSTANCE;
        }

        public final void KWHzl(EventParamsList eventParamsList) {
            Intrinsics.checkNotNullParameter(eventParamsList, "");
            eventParamsList.put("button_type", "arbitrage", true);
            eventParamsList.put(EopTrackEvent.KEY_BUTTON_NAME, OtpEventTracker.OTP_EVENT_VALUE_CANCEL, true);
        }
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        android.view.View viewInflate = getCustomLayoutInflater().inflate(C48033uCm.Activity.znKlvJ, (android.view.ViewGroup) constraintLayout, true);
        wUH wuh = (wUH) viewInflate.findViewById(C48033uCm.Application.MediaSessionCompat2);
        wUH wuh2 = (wUH) viewInflate.findViewById(C48033uCm.Application.onCustomAction);
        final wYK wyk = (wYK) viewInflate.findViewById(C48033uCm.Application.DlABUU);
        C52794wYp c52794wYp = (C52794wYp) viewInflate.findViewById(C48033uCm.Application.RXdAnZ);
        android.widget.ImageView imageView = (android.widget.ImageView) viewInflate.findViewById(C48033uCm.Application.cancelAll);
        android.widget.ImageView imageView2 = (android.widget.ImageView) viewInflate.findViewById(C48033uCm.Application.ITrustedWebActivityServiceDefault);
        android.widget.TextView textView = (android.widget.TextView) viewInflate.findViewById(C48033uCm.Application.getAutoBatteryNightModeManager);
        android.widget.TextView textView2 = (android.widget.TextView) viewInflate.findViewById(C48033uCm.Application.getAutoTimeNightModeManager);
        wyk.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: o.vzr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(android.widget.CompoundButton compoundButton, boolean z) {
                C52117vzo.EZpvd(wyk, compoundButton, z);
            }
        });
        ArbitrageOrderConfirmData arbitrageOrderConfirmData = this.EZpvd;
        if (arbitrageOrderConfirmData != null) {
            wuh.setData(arbitrageOrderConfirmData);
            Intrinsics.copydefault(imageView);
            Intrinsics.copydefault(textView);
            EZpvd(arbitrageOrderConfirmData, imageView, textView);
        }
        ArbitrageOrderConfirmData arbitrageOrderConfirmData2 = this.AEQbTJ;
        if (arbitrageOrderConfirmData2 != null) {
            wuh2.setData(arbitrageOrderConfirmData2);
            Intrinsics.copydefault(imageView2);
            Intrinsics.copydefault(textView2);
            EZpvd(arbitrageOrderConfirmData2, imageView2, textView2);
        }
        c52794wYp.setOnClickListener(new StateListAnimator(c52794wYp, 1000L, wyk, this));
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) this, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    public static final void EZpvd(wYK wyk, android.widget.CompoundButton compoundButton, boolean z) {
        wyk.setChecked(z);
    }

    public final void EZpvd(ArbitrageOrderConfirmData arbitrageOrderConfirmData, android.widget.ImageView imageView, android.widget.TextView textView) {
        if (C33129mqd.OLrzqt((java.lang.CharSequence) arbitrageOrderConfirmData.AEQbTJ())) {
            imageView.setVisibility(0);
            ComponentCallbacks2C5333Nr componentCallbacks2C5333NrEZpvd = Glide.EZpvd(this);
            Intrinsics.checkNotNullExpressionValue(componentCallbacks2C5333NrEZpvd, "");
            Intrinsics.copydefault(C55297xhL.AEQbTJ(componentCallbacks2C5333NrEZpvd, arbitrageOrderConfirmData.AEQbTJ(), "lfit", 60, 60).EZpvd((NN<android.graphics.Bitmap>) new C33484mxN(getContext())).EZpvd(imageView));
        } else {
            imageView.setVisibility(8);
        }
        java.lang.String strValueOf = arbitrageOrderConfirmData.valueOf();
        if (StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strValueOf)) {
            strValueOf = "--";
        }
        textView.setText(strValueOf);
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        InterfaceC58217yxC interfaceC58217yxC = this.copydefault;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
    }

    /* JADX INFO: renamed from: o.vzo$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ C52117vzo KWHzl;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, C52117vzo c52117vzo) {
            this.copydefault = view;
            this.OLrzqt = j;
            this.KWHzl = c52117vzo;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.OLrzqt || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                C32866mlf.onEvent$default("BotPlaceOrder_Sheet_ConfirmOrder_Click", (TrackChannel[]) null, TaskDescription.AEQbTJ, 1, (java.lang.Object) null);
                this.KWHzl.dismissAllowingStateLoss();
            }
        }
    }

    /* JADX INFO: renamed from: o.vzo$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ wYK AEQbTJ;
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ C52117vzo copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, wYK wyk, C52117vzo c52117vzo) {
            this.EZpvd = view;
            this.OLrzqt = j;
            this.AEQbTJ = wyk;
            this.copydefault = c52117vzo;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            InterfaceC54581xNr interfaceC54581xNrOLrzqt;
            C54630xPm c54630xPmAuCTelauCTel;
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.OLrzqt || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                if (this.AEQbTJ.isChecked() && (interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt()) != null && (c54630xPmAuCTelauCTel = interfaceC54581xNrOLrzqt.AuCTelauCTel()) != null) {
                    C54630xPm.setOrderConfirm$default(c54630xPmAuCTelauCTel, false, null, 2, null);
                }
                Function0 function0 = this.copydefault.OLrzqt;
                if (function0 != null) {
                    function0.invoke();
                }
                this.copydefault.dismissAllowingStateLoss();
            }
        }
    }
}
