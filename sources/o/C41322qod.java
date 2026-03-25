package o;

import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import com.okinc.market.quotation.ui.model.ChargeGroupVo;
import kotlin.jvm.internal.Intrinsics;
import o.qZH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qod, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C41322qod extends AbstractC40515qYs<Application, C42816rdZ> {
    public final java.lang.Boolean EZpvd;
    public ChargeGroupVo copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ChargeGroupVo KWHzl() {
        return this.copydefault;
    }

    public C41322qod(@NotNull java.util.List<ChargeGroupVo> list, @NotNull ChargeGroupVo chargeGroupVo, java.lang.Boolean bool) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(chargeGroupVo, "");
        this.copydefault = chargeGroupVo;
        this.EZpvd = bool;
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        for (ChargeGroupVo chargeGroupVo2 : list) {
            arrayList.add(new Application(chargeGroupVo2, Intrinsics.EZpvd(this.copydefault, chargeGroupVo2)));
        }
        submitList(arrayList);
    }

    /* JADX INFO: renamed from: o.qod$Application */
    public static final class Application implements InterfaceC40516qYt {
        public static final int OLrzqt = ChargeGroupVo.EZpvd;
        public final boolean AEQbTJ;
        public final ChargeGroupVo EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Application copy$default(Application application, ChargeGroupVo chargeGroupVo, boolean z, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                chargeGroupVo = application.EZpvd;
            }
            if ((i & 2) != 0) {
                z = application.AEQbTJ;
            }
            return application.copydefault(chargeGroupVo, z);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ChargeGroupVo EZpvd() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Application copydefault(@NotNull ChargeGroupVo chargeGroupVo, boolean z) {
            Intrinsics.checkNotNullParameter(chargeGroupVo, "");
            return new Application(chargeGroupVo, z);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean copydefault() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Application)) {
                return false;
            }
            Application application = (Application) obj;
            return Intrinsics.EZpvd(this.EZpvd, application.EZpvd) && this.AEQbTJ == application.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (this.EZpvd.hashCode() * 31) + java.lang.Boolean.hashCode(this.AEQbTJ);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "SelectableChargeGroupVo(vo=" + this.EZpvd + ", isSelected=" + this.AEQbTJ + ")";
        }

        public Application(@NotNull ChargeGroupVo chargeGroupVo, boolean z) {
            Intrinsics.checkNotNullParameter(chargeGroupVo, "");
            this.EZpvd = chargeGroupVo;
            this.AEQbTJ = z;
        }

        @Override // o.InterfaceC40516qYt
        public boolean onCompareItems(@NotNull InterfaceC40516qYt interfaceC40516qYt) {
            Intrinsics.checkNotNullParameter(interfaceC40516qYt, "");
            return (interfaceC40516qYt instanceof Application) && Intrinsics.EZpvd(this.EZpvd, ((Application) interfaceC40516qYt).EZpvd);
        }

        @Override // o.InterfaceC40516qYt
        public boolean onCompareContents(@NotNull InterfaceC40516qYt interfaceC40516qYt) {
            Intrinsics.checkNotNullParameter(interfaceC40516qYt, "");
            return Intrinsics.EZpvd(this, interfaceC40516qYt);
        }
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/viewbinding/ViewBinding; */
    @Override // o.AbstractC40515qYs
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public C42816rdZ AEQbTJ(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        C42816rdZ c42816rdZKWHzl = C42816rdZ.KWHzl(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c42816rdZKWHzl, "");
        return c42816rdZKWHzl;
    }

    /* JADX DEBUG: Method merged with bridge method: copydefault(Landroidx/viewbinding/ViewBinding;ILo/qYt;)V */
    @Override // o.AbstractC40515qYs
    public void copydefault(@NotNull C42816rdZ c42816rdZ, int i, @NotNull final Application application) {
        Intrinsics.checkNotNullParameter(c42816rdZ, "");
        Intrinsics.checkNotNullParameter(application, "");
        ChargeGroupVo chargeGroupVoEZpvd = application.EZpvd();
        ChargeGroupVo.Application application2 = ChargeGroupVo.Companion;
        if (Intrinsics.EZpvd(chargeGroupVoEZpvd, application2.KWHzl())) {
            c42816rdZ.OLrzqt.setText(qZH.PendingIntent.profile);
        } else if (Intrinsics.EZpvd((java.lang.Object) application.EZpvd().OLrzqt().getId(), (java.lang.Object) "10")) {
            c42816rdZ.OLrzqt.setText(qZH.PendingIntent.processStrongAuthMessage);
        } else if (application.EZpvd().OLrzqt().getDisplayName().length() == 0) {
            AppCompatTextView appCompatTextView = c42816rdZ.OLrzqt;
            android.content.Context context = c42816rdZ.getRoot().getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            appCompatTextView.setText(C33069mpW.KWHzl(context, qZH.PendingIntent.hlXVux, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("ccy", application.EZpvd().OLrzqt().getName()))));
        } else {
            AppCompatTextView appCompatTextView2 = c42816rdZ.OLrzqt;
            android.content.Context context2 = c42816rdZ.getRoot().getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            appCompatTextView2.setText(C33069mpW.KWHzl(context2, qZH.PendingIntent.hlXVux, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("ccy", application.EZpvd().OLrzqt().getDisplayName()))));
        }
        c42816rdZ.OLrzqt.setSelected(application.copydefault());
        c42816rdZ.OLrzqt.setEnabled((Intrinsics.EZpvd(this.EZpvd, java.lang.Boolean.TRUE) && Intrinsics.EZpvd(application.EZpvd(), application2.KWHzl())) ? false : true);
        c42816rdZ.OLrzqt.setOnClickListener(new View.OnClickListener() { // from class: o.qof
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C41322qod.OLrzqt(this.OLrzqt, application, view);
            }
        });
    }

    public static final void OLrzqt(C41322qod c41322qod, Application application, android.view.View view) {
        c41322qod.copydefault = application.EZpvd();
        java.util.List<Application> listOLrzqt = c41322qod.OLrzqt();
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listOLrzqt, 10));
        for (Application application2 : listOLrzqt) {
            arrayList.add(Application.copy$default(application2, null, Intrinsics.EZpvd(c41322qod.copydefault, application2.EZpvd()), 1, null));
        }
        c41322qod.submitList(arrayList);
    }
}
