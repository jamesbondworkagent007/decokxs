package o;

import com.okinc.account.api.model.security.otp.OtpEventTracker;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.liveness.lca.EopTrackEvent;
import com.okinc.okpaymentapi.data.remote.model.management.PaymentMethod;
import com.okinc.web3.security.track.Web3SecurityTrackEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C31351lsQ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final class lLV extends C30106lMc {
    @Override // o.lLS, o.InterfaceC30116lMm
    public void AEQbTJ() {
        TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
        C32866mlf.onEvent$default("ManageCard_Sheet_ChangeCard_View", (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1) null, 2, (java.lang.Object) null);
    }

    @Override // o.lLS, o.InterfaceC30116lMm
    public void AEQbTJ(java.lang.String str) {
        OLrzqt("ManageCard_Sheet_ChangeCard_Click", EopTrackEvent.KEY_BUTTON_NAME, "add_card");
        OLrzqt("ManageCard_Sheet_ChangeCard_Click", "to_flow", "add_card");
    }

    @Override // o.lLS, o.InterfaceC30116lMm
    public void EZpvd() {
        OLrzqt("ManageCard_Sheet_ChangeCard_Click", EopTrackEvent.KEY_BUTTON_NAME, EopTrackEvent.EXIT);
    }

    @Override // o.lLS, o.InterfaceC30116lMm
    public void AEQbTJ(@NotNull PaymentMethod paymentMethod) {
        Intrinsics.checkNotNullParameter(paymentMethod, "");
        TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
        C32866mlf.EZpvd("ManageCard_Sheet_ChangeCard_Click", (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.lLZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return lLV.KWHzl((EventParamsList) obj);
            }
        });
    }

    public static final Unit KWHzl(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put(EopTrackEvent.KEY_BUTTON_NAME, "select_card", true);
        return Unit.INSTANCE;
    }

    @Override // o.lLS, o.InterfaceC30116lMm
    public void KWHzl(@NotNull PaymentMethod paymentMethod) {
        Intrinsics.checkNotNullParameter(paymentMethod, "");
        TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
        C32866mlf.onEvent$default("ManageCard_Pop_RemoveCard_View", (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1) null, 2, (java.lang.Object) null);
        copydefault("remove_card");
    }

    @Override // o.lLS, o.InterfaceC30116lMm
    public void EZpvd(@NotNull PaymentMethod paymentMethod) {
        Intrinsics.checkNotNullParameter(paymentMethod, "");
        OLrzqt("ManageCard_Pop_RemoveCard_Click", EopTrackEvent.KEY_BUTTON_NAME, OtpEventTracker.OTP_EVENT_VALUE_CANCEL);
    }

    @Override // o.lLS, o.InterfaceC30116lMm
    public void copydefault(@NotNull PaymentMethod paymentMethod) {
        Intrinsics.checkNotNullParameter(paymentMethod, "");
        OLrzqt("ManageCard_Pop_RemoveCard_Click", EopTrackEvent.KEY_BUTTON_NAME, Web3SecurityTrackEvent.VALUE_CONFIRM);
    }

    @Override // o.lLS, o.InterfaceC30116lMm
    public java.lang.String OLrzqt() {
        return C33070mpX.AYXKKw(C31351lsQ.Activity.RbVjfb);
    }

    @Override // o.lLS, o.InterfaceC30116lMm
    public java.lang.String KWHzl() {
        return C33070mpX.AYXKKw(C31351lsQ.Activity.DcMfJK);
    }

    @Override // o.lLS, o.InterfaceC30116lMm
    public java.lang.String djBIcL() {
        return C33070mpX.AYXKKw(C31351lsQ.Activity.RTWSvT);
    }

    @Override // o.lLS, o.InterfaceC30116lMm
    public java.lang.String OLrzqt(@NotNull PaymentMethod paymentMethod) {
        Intrinsics.checkNotNullParameter(paymentMethod, "");
        return C33069mpW.KWHzl(C43246rlf.OLrzqt.valueOf(), C31351lsQ.Activity.isReflectionWorking, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("cardNameLastFour", paymentMethod.getPaymentMethod() + " " + lNB.KWHzl(paymentMethod))));
    }

    @Override // o.lLS, o.InterfaceC30116lMm
    public java.lang.String copydefault() {
        return C33070mpX.AYXKKw(C31351lsQ.Activity.DTeKQX);
    }

    @Override // o.lLS, o.InterfaceC30116lMm
    public java.lang.String gEmmrt() {
        return C33070mpX.AYXKKw(C31351lsQ.Activity.RIuxYh);
    }

    public final void OLrzqt(java.lang.String str, final java.lang.String str2, final java.lang.String str3) {
        TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
        C32866mlf.EZpvd(str, (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.lLX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return lLV.EZpvd(str2, str3, (EventParamsList) obj);
            }
        });
    }

    public static final Unit EZpvd(java.lang.String str, java.lang.String str2, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put(str, str2, true);
        return Unit.INSTANCE;
    }

    public final void copydefault(final java.lang.String str) {
        TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
        C32866mlf.EZpvd("ManageCard_Sheet_RemoveCard_Click", (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.lLW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return lLV.copydefault(str, (EventParamsList) obj);
            }
        });
    }

    public static final Unit copydefault(java.lang.String str, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put(EopTrackEvent.KEY_BUTTON_NAME, str, true);
        return Unit.INSTANCE;
    }
}
