package o;

import android.view.View;
import com.okinc.localization.util.format.OKTimeEnum;
import com.okinc.okcomponents.feature.oknotificationcenter.api.business.notificationmessage.model.SystemNotification;
import com.okinc.okcomponents.feature.oknotificationcenter.impl.presentation.notificationcenter.ui.NotificationReadStatus;
import java.util.Date;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC42594rYq;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.saJ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C44614saJ extends AbstractC42594rYq<SystemNotification, rYK> {
    public final InterfaceC56387yDm AEQbTJ;
    public final Function2<SystemNotification, java.lang.Integer, Unit> copydefault;

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function2<? super com.okinc.okcomponents.feature.oknotificationcenter.api.business.notificationmessage.model.SystemNotification, ? super java.lang.Integer, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public C44614saJ(@NotNull Function2<? super SystemNotification, ? super java.lang.Integer, Unit> function2) {
        Intrinsics.checkNotNullParameter(function2, "");
        this.copydefault = function2;
        this.AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.saL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return java.lang.Boolean.valueOf(C44614saJ.KWHzl());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean KWHzl() {
        return C33492mxV.OLrzqt();
    }

    private final boolean OLrzqt() {
        return ((java.lang.Boolean) this.AEQbTJ.getValue()).booleanValue();
    }

    public final java.lang.String OLrzqt(long j) {
        return pTA.formatTime$default(new Date(j), OKTimeEnum.TIME_FORMAT_SIMPLE_HM, null, null, false, 14, null);
    }

    public final void OLrzqt(android.widget.ImageView imageView, SystemNotification systemNotification) {
        java.lang.String darkIconLink = OLrzqt() ? systemNotification.getDarkIconLink() : systemNotification.getLightIconLink();
        if (darkIconLink != null) {
            C42592rYo.KWHzl.copydefault(imageView, darkIconLink);
        }
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/viewbinding/ViewBinding; */
    @Override // o.AbstractC42594rYq
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public rYK KWHzl(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        rYK rykAEQbTJ = rYK.AEQbTJ(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(rykAEQbTJ, "");
        return rykAEQbTJ;
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull final AbstractC42594rYq<SystemNotification, rYK>.StateListAnimator<rYK> stateListAnimator, @NotNull final SystemNotification systemNotification) {
        Intrinsics.checkNotNullParameter(stateListAnimator, "");
        Intrinsics.checkNotNullParameter(systemNotification, "");
        rYK ryk = (rYK) stateListAnimator.AEQbTJ();
        C42593rYp c42593rYp = ryk.copydefault;
        Intrinsics.checkNotNullExpressionValue(c42593rYp, "");
        OLrzqt(c42593rYp, systemNotification);
        android.widget.TextView textView = ryk.AEQbTJ;
        java.lang.String content = systemNotification.getContent();
        if (content == null) {
            content = "";
        }
        textView.setText(content);
        ryk.EZpvd.setText(OLrzqt(C33129mqd.valueOf(systemNotification.getPushTime())));
        android.widget.TextView textView2 = ryk.valueOf;
        java.lang.String title = systemNotification.getTitle();
        if (title == null) {
            title = "";
        }
        textView2.setText(title);
        android.view.View view = ryk.djBIcL;
        Intrinsics.checkNotNullExpressionValue(view, "");
        java.lang.Integer readStatus = systemNotification.getReadStatus();
        view.setVisibility((readStatus != null && readStatus.intValue() == NotificationReadStatus.READ.getValue()) ? 8 : 0);
        ryk.OLrzqt.setOnClickListener(new View.OnClickListener() { // from class: o.saK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view2) {
                C44614saJ.OLrzqt(this.EZpvd, systemNotification, stateListAnimator, view2);
            }
        });
    }

    public static final void OLrzqt(C44614saJ c44614saJ, SystemNotification systemNotification, AbstractC42594rYq.StateListAnimator stateListAnimator, android.view.View view) {
        c44614saJ.copydefault.invoke(systemNotification, java.lang.Integer.valueOf(c44614saJ.getPosition(stateListAnimator)));
        systemNotification.setReadStatus(java.lang.Integer.valueOf(NotificationReadStatus.READ.getValue()));
    }
}
