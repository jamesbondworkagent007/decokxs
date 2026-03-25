package o;

import android.view.View;
import com.okinc.okcomponents.feature.oknotificationcenter.api.business.systempush.model.DeeplinkType;
import com.okinc.okimcore.model.im.OKMessage;
import com.okinc.okimcore.model.im.OKSystemNotificationMessage;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.oyj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C37698oyj extends AbstractC37694oyf<OKSystemNotificationMessage> {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC35703oAo
    public java.lang.Class<OKSystemNotificationMessage> KWHzl() {
        return OKSystemNotificationMessage.class;
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Landroid/content/Context;Lcom/okinc/okimcore/model/im/OKMessageContent;Lcom/okinc/okimcore/model/im/OKMessage;)Ljava/lang/CharSequence; */
    @Override // o.AbstractC35703oAo
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public java.lang.CharSequence KWHzl(@NotNull android.content.Context context, @NotNull OKSystemNotificationMessage oKSystemNotificationMessage, @NotNull OKMessage oKMessage) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(oKSystemNotificationMessage, "");
        Intrinsics.checkNotNullParameter(oKMessage, "");
        java.lang.String pushTitle = oKSystemNotificationMessage.getPushTitle();
        return pushTitle != null ? pushTitle : "";
    }

    @Override // o.AbstractC37694oyf
    public void AEQbTJ(@NotNull oGY<AbstractC34018nOj> ogy, @NotNull C35254nrp c35254nrp, @NotNull final OKSystemNotificationMessage oKSystemNotificationMessage) {
        Intrinsics.checkNotNullParameter(ogy, "");
        Intrinsics.checkNotNullParameter(c35254nrp, "");
        Intrinsics.checkNotNullParameter(oKSystemNotificationMessage, "");
        super.AEQbTJ(ogy, c35254nrp, oKSystemNotificationMessage);
        AbstractC34018nOj abstractC34018nOj = (AbstractC34018nOj) ogy.copydefault();
        final android.content.Context context = abstractC34018nOj.gEmmrt.getContext();
        java.lang.String pushTitle = oKSystemNotificationMessage.getPushTitle();
        if (pushTitle != null) {
            abstractC34018nOj.gEmmrt.setText(android.text.Html.fromHtml(pushTitle).toString());
        }
        java.lang.String content = oKSystemNotificationMessage.getContent();
        if (content != null) {
            abstractC34018nOj.djBIcL.setText(android.text.Html.fromHtml(content).toString());
        }
        if (oKSystemNotificationMessage.getJumpStatus() == 1) {
            abstractC34018nOj.AEQbTJ.setVisibility(0);
            abstractC34018nOj.AYXKKw.setVisibility(0);
            abstractC34018nOj.EZpvd.setVisibility(0);
            abstractC34018nOj.getRoot().setOnClickListener(new View.OnClickListener() { // from class: o.oyl
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C37698oyj.OLrzqt(oKSystemNotificationMessage, context, view);
                }
            });
            return;
        }
        abstractC34018nOj.AEQbTJ.setVisibility(8);
        abstractC34018nOj.AYXKKw.setVisibility(8);
        abstractC34018nOj.EZpvd.setVisibility(8);
        abstractC34018nOj.getRoot().setOnClickListener(null);
    }

    public static final void OLrzqt(final OKSystemNotificationMessage oKSystemNotificationMessage, android.content.Context context, android.view.View view) {
        final java.lang.String strAEQbTJ = C34704nhP.copydefault.AEQbTJ();
        if (C59449zhJ.startsWith$default(oKSystemNotificationMessage.getUrl(), strAEQbTJ, false, 2, null)) {
            boolean zStartsWith$default = C59449zhJ.startsWith$default(oKSystemNotificationMessage.getUrl(), "okex://web", false, 2, null);
            final Function0 function0 = new Function0() { // from class: o.oyg
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C37698oyj.AEQbTJ(oKSystemNotificationMessage, strAEQbTJ);
                }
            };
            if (!zStartsWith$default) {
                android.app.Activity activityAEQbTJ = C54819xWm.KWHzl().AEQbTJ();
                if (activityAEQbTJ != null) {
                    C37692oyd.copydefault.EZpvd(activityAEQbTJ, DeeplinkType.ALL, new Function0() { // from class: o.oym
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return C37698oyj.copydefault(function0);
                        }
                    });
                    return;
                }
                return;
            }
            return;
        }
        oGV ogv = oGV.EZpvd;
        Intrinsics.copydefault(context);
        oGV.processDeeplink$default(ogv, context, "web?url=" + oKSystemNotificationMessage.getUrl(), null, null, new Function1() { // from class: o.oyo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C37698oyj.EZpvd((AbstractC43238rlX) obj);
            }
        }, 12, null);
    }

    public static final Unit AEQbTJ(OKSystemNotificationMessage oKSystemNotificationMessage, java.lang.String str) {
        java.lang.String strSubstringAfter$default = StringsKt__StringsKt.substringAfter$default(oKSystemNotificationMessage.getUrl(), str + "://", (java.lang.String) null, 2, (java.lang.Object) null);
        android.app.Activity activityAEQbTJ = C54819xWm.KWHzl().AEQbTJ();
        if (activityAEQbTJ == null) {
            return null;
        }
        oGV.processDeeplink$default(oGV.EZpvd, activityAEQbTJ, strSubstringAfter$default, null, null, new Function1() { // from class: o.oyk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C37698oyj.KWHzl((AbstractC43238rlX) obj);
            }
        }, 12, null);
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(AbstractC43238rlX abstractC43238rlX) {
        Intrinsics.checkNotNullParameter(abstractC43238rlX, "");
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(AbstractC43238rlX abstractC43238rlX) {
        Intrinsics.checkNotNullParameter(abstractC43238rlX, "");
        return Unit.INSTANCE;
    }
}
