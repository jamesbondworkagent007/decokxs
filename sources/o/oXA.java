package o;

import android.view.View;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.StateFlow;
import o.C52761wXj;
import o.InterfaceC43294rma;
import o.InterfaceC46936tga;
import o.oXA;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class oXA {
    public static final Application Companion = new Application(null);
    public static final int OLrzqt = 8;
    public final android.os.Handler copydefault = new android.os.Handler(android.os.Looper.getMainLooper());
    public final java.lang.String AEQbTJ = "price_alert/notification";

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.AEQbTJ;
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.oXA.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final C55097xdX EZpvd(@NotNull C46952tgq c46952tgq, @NotNull final android.content.Context context) {
            Intrinsics.checkNotNullParameter(c46952tgq, "");
            Intrinsics.checkNotNullParameter(context, "");
            final C55097xdX c55097xdX = new C55097xdX(context, null, 0, 4, null);
            c55097xdX.setLeadingIcon(C33070mpX.KWHzl(C52761wXj.TaskDescription.UeEOUB));
            java.lang.String strGEmmrt = c46952tgq.gEmmrt();
            c55097xdX.setTitle(strGEmmrt != null ? strGEmmrt : "");
            c55097xdX.setMessage(c46952tgq.OLrzqt());
            c55097xdX.setState(4);
            final java.lang.String strCopydefault = c46952tgq.copydefault();
            if (strCopydefault != null) {
                c55097xdX.setOnClickListener(new View.OnClickListener() { // from class: o.oXB
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // android.view.View.OnClickListener
                    public final void onClick(android.view.View view) {
                        oXA.Application.KWHzl(c55097xdX, strCopydefault, context, view);
                    }
                });
            }
            c55097xdX.setOnCloseCallback(new Function0() { // from class: o.oXC
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return oXA.Application.copydefault(c55097xdX);
                }
            });
            return c55097xdX;
        }

        public static final void KWHzl(C55097xdX c55097xdX, java.lang.String str, android.content.Context context, android.view.View view) {
            C32866mlf.onEvent$default("PriceAlert_InAppPushNotification_OpenInApp_Click", (TrackChannel[]) null, new Function1() { // from class: o.oXD
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return oXA.Application.OLrzqt((EventParamsList) obj);
                }
            }, 1, (java.lang.Object) null);
            C57656ymY c57656ymY = C57656ymY.OLrzqt;
            c57656ymY.KWHzl(c55097xdX);
            c57656ymY.AhwBna();
            InterfaceC43294rma.Application.processDeeplink$default((InterfaceC43294rma) C43251rlk.copydefault(InterfaceC43294rma.class), context, str + "&refreshWidget=1", null, new Function1() { // from class: o.oXG
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return oXA.Application.KWHzl((AbstractC43238rlX) obj);
                }
            }, 4, null);
        }

        public static final Unit OLrzqt(EventParamsList eventParamsList) {
            Intrinsics.checkNotNullParameter(eventParamsList, "");
            EventParamsList.put$default(eventParamsList, "Page", "kline", false, 4, null);
            return Unit.INSTANCE;
        }

        public static final Unit KWHzl(AbstractC43238rlX abstractC43238rlX) {
            Intrinsics.checkNotNullParameter(abstractC43238rlX, "");
            return Unit.INSTANCE;
        }

        public static final Unit copydefault(C55097xdX c55097xdX) {
            C32866mlf.onEvent$default("PriceAlert_InAppPushNotification_CloseIcon_Click", (TrackChannel[]) null, new Function1() { // from class: o.oXI
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return oXA.Application.KWHzl((EventParamsList) obj);
                }
            }, 1, (java.lang.Object) null);
            C57656ymY.OLrzqt.KWHzl(c55097xdX);
            return Unit.INSTANCE;
        }

        public static final Unit KWHzl(EventParamsList eventParamsList) {
            Intrinsics.checkNotNullParameter(eventParamsList, "");
            EventParamsList.put$default(eventParamsList, "Page", "kline", false, 4, null);
            return Unit.INSTANCE;
        }
    }

    public final void copydefault(@NotNull StateFlow<java.lang.Boolean> stateFlow) {
        Intrinsics.checkNotNullParameter(stateFlow, "");
        OLrzqt(stateFlow);
        copydefault();
    }

    public static final class TaskDescription implements InterfaceC46949tgn {
        public final /* synthetic */ StateFlow<java.lang.Boolean> EZpvd;
        public final /* synthetic */ oXA OLrzqt;

        public TaskDescription(StateFlow<java.lang.Boolean> stateFlow, oXA oxa) {
            this.EZpvd = stateFlow;
            this.OLrzqt = oxa;
        }

        @Override // o.InterfaceC46949tgn
        public void copydefault(final C46952tgq c46952tgq) {
            Intrinsics.checkNotNullParameter(c46952tgq, "");
            pUU.KWHzl("KLinePriceAlertNotification", "isForeground:" + this.EZpvd.getValue() + " notification: " + c46952tgq);
            if (this.EZpvd.getValue().booleanValue()) {
                android.os.Handler handler = this.OLrzqt.copydefault;
                final oXA oxa = this.OLrzqt;
                handler.post(new java.lang.Runnable() { // from class: o.oXE
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // java.lang.Runnable
                    public final void run() {
                        oXA.TaskDescription.EZpvd(oxa, c46952tgq);
                    }
                });
            }
        }

        public static final void EZpvd(oXA oxa, C46952tgq c46952tgq) {
            android.app.Activity activityAEQbTJ = C54819xWm.KWHzl().AEQbTJ();
            if (activityAEQbTJ == null) {
                return;
            }
            oxa.KWHzl(c46952tgq, activityAEQbTJ);
        }

        @Override // o.InterfaceC46949tgn
        public C46953tgr OLrzqt() {
            return new C46953tgr(this.EZpvd.getValue().booleanValue());
        }
    }

    public final void OLrzqt(@NotNull StateFlow<java.lang.Boolean> stateFlow) {
        Intrinsics.checkNotNullParameter(stateFlow, "");
        C46945tgj.AEQbTJ.djBIcL().EZpvd("price_alert/notification", new TaskDescription(stateFlow, this));
    }

    public static final class Activity implements InterfaceC46936tga {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC46936tga
        public java.lang.String EZpvd() {
            return "price_alert/notification";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC46936tga
        public boolean OLrzqt(C46941tgf c46941tgf) {
            Intrinsics.checkNotNullParameter(c46941tgf, "");
            return false;
        }

        @Override // o.InterfaceC46936tga
        public int KWHzl() {
            return InterfaceC46936tga.Activity.AEQbTJ(this);
        }
    }

    public final void copydefault() {
        C46938tgc.copydefault.copydefault(new Activity());
    }

    public final void KWHzl(@NotNull C46952tgq c46952tgq, @NotNull android.content.Context context) {
        java.lang.Object objM7377constructorimpl;
        Intrinsics.checkNotNullParameter(c46952tgq, "");
        Intrinsics.checkNotNullParameter(context, "");
        try {
            Result.Application application = Result.Companion;
            if (c46952tgq.EZpvd() != null) {
                C57656ymY.showNotificationViewWithToast$default(C57656ymY.OLrzqt, Companion.EZpvd(c46952tgq, context), 4000L, 0, 0, 0, 28, null);
                C32866mlf.onEvent$default("PriceAlert_InAppPushNotification_Notification_View", (TrackChannel[]) null, new Function1() { // from class: o.oXz
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return oXA.copydefault((EventParamsList) obj);
                    }
                }, 1, (java.lang.Object) null);
            }
            objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        java.lang.Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
            pUU.KWHzl(thM7380exceptionOrNullimpl);
        }
    }

    public static final Unit copydefault(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "Page", "kline", false, 4, null);
        return Unit.INSTANCE;
    }
}
