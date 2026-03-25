package com.okinc.tradingbot.impl.order.strategy.signalbot.ui;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.liveness.lca.EopTrackEvent;
import com.okinc.rxutils.RxBus;
import com.okinc.tradingbot.impl.order.strategy.signalbot.ui.SignalBotCreateFragment$registerEvent$1;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.ActivityC51906vvp;
import o.C32866mlf;
import o.C33070mpX;
import o.C50674vXd;
import o.C55688xof;
import o.ViewOnClickListenerC54939xaY;

/* JADX INFO: loaded from: classes16.dex */
public final class SignalBotCreateFragment$registerEvent$1 extends RxBus.EventCallback<String> {
    final /* synthetic */ C50674vXd this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SignalBotCreateFragment$registerEvent$1(C50674vXd c50674vXd, Object obj) {
        super(obj);
        this.this$0 = c50674vXd;
    }

    /* JADX DEBUG: Method merged with bridge method: onEvent(Ljava/lang/Object;)V */
    @Override // com.okinc.rxutils.RxBus.EventCallback
    public void onEvent(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        Context contextRequireContext = this.this$0.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(contextRequireContext);
        final C50674vXd c50674vXd = this.this$0;
        viewOnClickListenerC54939xaY.setTitle(C33070mpX.AYXKKw(C55688xof.Application.zdxASf));
        viewOnClickListenerC54939xaY.EZpvd(C33070mpX.AYXKKw(C55688xof.Application.icKaHr));
        viewOnClickListenerC54939xaY.AEQbTJ((CharSequence) C33070mpX.AYXKKw(C55688xof.Application.trackPipAnimationHintViewpositionInWindow), new View.OnClickListener() { // from class: o.vXQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                SignalBotCreateFragment$registerEvent$1.onEvent$lambda$5$lambda$1(viewOnClickListenerC54939xaY, view);
            }
        });
        String strAYXKKw = C33070mpX.AYXKKw(C55688xof.Application.gwwzsY);
        Intrinsics.copydefault(strAYXKKw, "");
        viewOnClickListenerC54939xaY.EZpvd(strAYXKKw, new View.OnClickListener() { // from class: o.vXP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                SignalBotCreateFragment$registerEvent$1.onEvent$lambda$5$lambda$4(c50674vXd, viewOnClickListenerC54939xaY, view);
            }
        });
        viewOnClickListenerC54939xaY.show();
        C32866mlf.onEvent$default("SignalPublishSucces_Full_Page_View", (TrackChannel[]) null, new Function1() { // from class: o.vXY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return SignalBotCreateFragment$registerEvent$1.onEvent$lambda$6((EventParamsList) obj);
            }
        }, 1, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onEvent$lambda$5$lambda$1(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, View view) {
        C32866mlf.onEvent$default("SignalPublishSucces_Full_Page_Click", (TrackChannel[]) null, new Function1() { // from class: o.vXR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return SignalBotCreateFragment$registerEvent$1.onEvent$lambda$5$lambda$1$lambda$0((EventParamsList) obj);
            }
        }, 1, (Object) null);
        viewOnClickListenerC54939xaY.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onEvent$lambda$5$lambda$1$lambda$0(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_BUTTON_NAME, "I_know", false, 4, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onEvent$lambda$5$lambda$4(C50674vXd c50674vXd, ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, View view) {
        FragmentActivity activity = c50674vXd.getActivity();
        if (activity != null) {
            ActivityC51906vvp.Companion.KWHzl(activity, 1);
        }
        C32866mlf.onEvent$default("SignalPublishSucces_Full_Page_Click", (TrackChannel[]) null, new Function1() { // from class: o.vXT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return SignalBotCreateFragment$registerEvent$1.onEvent$lambda$5$lambda$4$lambda$3((EventParamsList) obj);
            }
        }, 1, (Object) null);
        viewOnClickListenerC54939xaY.dismiss();
        FragmentActivity activity2 = c50674vXd.getActivity();
        if (activity2 != null) {
            activity2.finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onEvent$lambda$5$lambda$4$lambda$3(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_BUTTON_NAME, "Order_management", false, 4, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onEvent$lambda$6(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "status", "First_release", false, 4, null);
        return Unit.INSTANCE;
    }
}
