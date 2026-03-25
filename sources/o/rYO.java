package o;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewTreeObserver;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC43294rma;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@yCR
public final class rYO {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int OLrzqt = 8;
    public final android.content.Context copydefault;

    @yCM
    public rYO(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        this.copydefault = context;
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.rYO.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    public final void OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull final java.lang.String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        pUU.KWHzl("ShowInAppBannerUseCase", "in-app banner, title: " + str + ", content: " + str2 + ", deeplink: " + str3);
        C55097xdX c55097xdX = new C55097xdX(this.copydefault, null, 0, 6, null);
        android.widget.TextView textViewEZpvd = c55097xdX.EZpvd();
        textViewEZpvd.setSingleLine();
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textViewEZpvd.setEllipsize(truncateAt);
        android.widget.TextView textViewCopydefault = c55097xdX.copydefault();
        textViewCopydefault.setMaxLines(2);
        textViewCopydefault.setEllipsize(truncateAt);
        c55097xdX.setState(0);
        c55097xdX.setTitle(str);
        c55097xdX.setMessage(str2);
        c55097xdX.setCloseBtnShow(false);
        c55097xdX.setOnClickListener(new View.OnClickListener() { // from class: o.rYQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                rYO.copydefault(this.OLrzqt, str3, view);
            }
        });
        c55097xdX.getViewTreeObserver().addOnWindowAttachListener(new TaskDescription(c55097xdX));
        AEQbTJ("Notification_Top_Banner_View");
        C57656ymY.showNotificationViewWithToast$default(C57656ymY.OLrzqt, c55097xdX, 0L, 48, 0, 0, 26, null);
    }

    public static final void copydefault(rYO ryo, java.lang.String str, android.view.View view) {
        InterfaceC43294rma interfaceC43294rma;
        ryo.AEQbTJ("Notification_Top_Banner_Click");
        android.app.Activity activityAEQbTJ = C54819xWm.KWHzl().AEQbTJ();
        if (activityAEQbTJ == null || (interfaceC43294rma = (InterfaceC43294rma) C43251rlk.OLrzqt(InterfaceC43294rma.class)) == null) {
            return;
        }
        InterfaceC43294rma.Application.processDeeplink$default(interfaceC43294rma, activityAEQbTJ, str, null, new Function1() { // from class: o.rYR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return rYO.AEQbTJ((AbstractC43238rlX) obj);
            }
        }, 4, null);
    }

    public static final Unit AEQbTJ(AbstractC43238rlX abstractC43238rlX) {
        Intrinsics.checkNotNullParameter(abstractC43238rlX, "");
        return Unit.INSTANCE;
    }

    public static final class TaskDescription implements ViewTreeObserver.OnWindowAttachListener {
        public final /* synthetic */ C55097xdX AEQbTJ;

        @Override // android.view.ViewTreeObserver.OnWindowAttachListener
        public void onWindowAttached() {
        }

        public TaskDescription(C55097xdX c55097xdX) {
            this.AEQbTJ = c55097xdX;
        }

        @Override // android.view.ViewTreeObserver.OnWindowAttachListener
        public void onWindowDetached() {
            rYO.this.AEQbTJ("Notification_Top_Banner_Swipe");
            this.AEQbTJ.getViewTreeObserver().removeOnWindowAttachListener(this);
        }
    }

    public final void AEQbTJ(java.lang.String str) {
        C32866mlf.onEvent$default(str, (TrackChannel[]) null, new Function1() { // from class: o.rYP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return rYO.OLrzqt((EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit OLrzqt(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "Category", "im/message", false, 4, null);
        return Unit.INSTANCE;
    }
}
