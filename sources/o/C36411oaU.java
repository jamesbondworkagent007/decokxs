package o;

import android.view.View;
import com.okinc.components.track.TrackChannel;
import com.okinc.okimcore.model.im.OKMentionedInfo;
import com.okinc.okimcore.model.im.OKMessage;
import com.okinc.okimcore.model.im.OKMessageContent;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C35399nuc;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.oaU, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C36411oaU {
    public static InterfaceC58217yxC EZpvd;
    public static ViewOnClickListenerC54939xaY OLrzqt;
    public static final C36411oaU AEQbTJ = new C36411oaU();
    public static final android.os.Handler KWHzl = new android.os.Handler(android.os.Looper.getMainLooper());
    public static final int copydefault = 8;

    private C36411oaU() {
    }

    public final void AEQbTJ(final boolean z, @NotNull final OKMessage oKMessage) {
        Intrinsics.checkNotNullParameter(oKMessage, "");
        InterfaceC58217yxC interfaceC58217yxC = EZpvd;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
        AbstractC58185ywX abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(java.lang.Boolean.valueOf(C36404oaN.EZpvd.copydefault(oKMessage)));
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        AbstractC58185ywX abstractC58185ywXKWHzl2 = C33024moe.KWHzl(abstractC58185ywXKWHzl);
        final Function1 function1 = new Function1() { // from class: o.oaY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C36411oaU.OLrzqt(z, oKMessage, (java.lang.Boolean) obj);
            }
        };
        InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.oba
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C36411oaU.KWHzl(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.oaZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C36411oaU.KWHzl((java.lang.Throwable) obj);
            }
        };
        EZpvd = abstractC58185ywXKWHzl2.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.oaX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C36411oaU.OLrzqt(function12, obj);
            }
        });
    }

    public static final void KWHzl(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit OLrzqt(boolean z, OKMessage oKMessage, java.lang.Boolean bool) {
        final java.lang.String mentionedContent;
        OKMentionedInfo mentionedInfo;
        pUU.KWHzl("IMBOT", "handleMentionedRobot-->hasMentionedRobot:" + bool + " canMentionedRobot:" + z);
        if (bool.booleanValue()) {
            if (z) {
                final java.lang.String targetId = oKMessage.getTargetId();
                OKMessageContent content = oKMessage.getContent();
                if (content == null || (mentionedInfo = content.getMentionedInfo()) == null || (mentionedContent = mentionedInfo.getMentionedContent()) == null) {
                    mentionedContent = "";
                }
                pUU.KWHzl("IMBOT", "performAtRobot-->targetId:" + targetId + "  mentionedContent:" + mentionedContent);
                KWHzl.postDelayed(new java.lang.Runnable() { // from class: o.oaV
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // java.lang.Runnable
                    public final void run() {
                        C36411oaU.KWHzl(targetId, mentionedContent);
                    }
                }, 300L);
            } else {
                android.app.Activity activityAEQbTJ = C54819xWm.KWHzl().AEQbTJ();
                if (activityAEQbTJ != null) {
                    AEQbTJ.OLrzqt(activityAEQbTJ);
                }
            }
        }
        return Unit.INSTANCE;
    }

    public static final void KWHzl(java.lang.String str, java.lang.String str2) {
        AEQbTJ.EZpvd(str, str2);
    }

    public static final void OLrzqt(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit KWHzl(java.lang.Throwable th) {
        Intrinsics.copydefault(th);
        java.lang.String strCopydefault = C44157sFk.copydefault(th);
        pUU.copydefault("IMBOT", "performAtRobot-->OnError:" + strCopydefault);
        C55326xho.toast$default(strCopydefault, (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
        return Unit.INSTANCE;
    }

    public final void EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        if (((InterfaceC35180nqU) C43251rlk.OLrzqt(InterfaceC35180nqU.class)) == null) {
            throw new java.lang.IllegalArgumentException("OKIM Service not available".toString());
        }
        TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
        C32866mlf.onEvent$default("app_okim_chatbotmentioned_send_click", (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1) null, 2, (java.lang.Object) null);
    }

    public final void OLrzqt(android.app.Activity activity) {
        final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(activity);
        viewOnClickListenerC54939xaY.EZpvd(C33070mpX.AYXKKw(C35399nuc.LoaderManager.RhjxDW));
        viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) C33070mpX.AYXKKw(C35399nuc.LoaderManager.dXcUrg), new View.OnClickListener() { // from class: o.oaR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C36411oaU.copydefault(viewOnClickListenerC54939xaY, view);
            }
        });
        viewOnClickListenerC54939xaY.setCancelable(true);
        viewOnClickListenerC54939xaY.setCanceledOnTouchOutside(true);
        viewOnClickListenerC54939xaY.show();
        OLrzqt = viewOnClickListenerC54939xaY;
    }

    public static final void copydefault(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        viewOnClickListenerC54939xaY.dismiss();
    }

    public final void OLrzqt() {
        InterfaceC58217yxC interfaceC58217yxC = EZpvd;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
        EZpvd = null;
        C33062mpP.OLrzqt(OLrzqt);
    }
}
