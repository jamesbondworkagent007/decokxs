package o;

import android.view.View;
import com.okinc.market.time.filter.PeriodEnum;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qdg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C40742qdg extends AbstractC40515qYs<Application, C42816rdZ> {
    public PeriodEnum EZpvd;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PeriodEnum copydefault() {
        return this.EZpvd;
    }

    public C40742qdg(@NotNull java.util.List<? extends PeriodEnum> list, @NotNull PeriodEnum periodEnum) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(periodEnum, "");
        this.EZpvd = periodEnum;
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        for (PeriodEnum periodEnum2 : list) {
            arrayList.add(new Application(periodEnum2, this.EZpvd == periodEnum2));
        }
        submitList(arrayList);
    }

    /* JADX INFO: renamed from: o.qdg$Application */
    public static final class Application implements InterfaceC40516qYt {
        public final boolean AEQbTJ;
        public final PeriodEnum OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Application copy$default(Application application, PeriodEnum periodEnum, boolean z, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                periodEnum = application.OLrzqt;
            }
            if ((i & 2) != 0) {
                z = application.AEQbTJ;
            }
            return application.EZpvd(periodEnum, z);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Application EZpvd(@NotNull PeriodEnum periodEnum, boolean z) {
            Intrinsics.checkNotNullParameter(periodEnum, "");
            return new Application(periodEnum, z);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final PeriodEnum KWHzl() {
            return this.OLrzqt;
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
            return this.OLrzqt == application.OLrzqt && this.AEQbTJ == application.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (this.OLrzqt.hashCode() * 31) + java.lang.Boolean.hashCode(this.AEQbTJ);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "SelectablePeriodVo(vo=" + this.OLrzqt + ", isSelected=" + this.AEQbTJ + ")";
        }

        public Application(@NotNull PeriodEnum periodEnum, boolean z) {
            Intrinsics.checkNotNullParameter(periodEnum, "");
            this.OLrzqt = periodEnum;
            this.AEQbTJ = z;
        }

        @Override // o.InterfaceC40516qYt
        public boolean onCompareItems(@NotNull InterfaceC40516qYt interfaceC40516qYt) {
            Intrinsics.checkNotNullParameter(interfaceC40516qYt, "");
            return (interfaceC40516qYt instanceof Application) && this.OLrzqt == ((Application) interfaceC40516qYt).OLrzqt;
        }

        @Override // o.InterfaceC40516qYt
        public boolean onCompareContents(@NotNull InterfaceC40516qYt interfaceC40516qYt) {
            Intrinsics.checkNotNullParameter(interfaceC40516qYt, "");
            return Intrinsics.EZpvd(this, interfaceC40516qYt);
        }
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/viewbinding/ViewBinding; */
    @Override // o.AbstractC40515qYs
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public C42816rdZ AEQbTJ(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        C42816rdZ c42816rdZKWHzl = C42816rdZ.KWHzl(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c42816rdZKWHzl, "");
        return c42816rdZKWHzl;
    }

    /* JADX DEBUG: Method merged with bridge method: copydefault(Landroidx/viewbinding/ViewBinding;ILo/qYt;)V */
    @Override // o.AbstractC40515qYs
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public void copydefault(@NotNull C42816rdZ c42816rdZ, int i, @NotNull final Application application) {
        Intrinsics.checkNotNullParameter(c42816rdZ, "");
        Intrinsics.checkNotNullParameter(application, "");
        c42816rdZ.OLrzqt.setText(C33070mpX.AYXKKw(application.KWHzl().getTitleResId()));
        c42816rdZ.OLrzqt.setSelected(application.copydefault());
        c42816rdZ.OLrzqt.setEnabled(true);
        c42816rdZ.OLrzqt.setOnClickListener(new View.OnClickListener() { // from class: o.qdh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C40742qdg.OLrzqt(this.OLrzqt, application, view);
            }
        });
    }

    public static final void OLrzqt(C40742qdg c40742qdg, Application application, android.view.View view) {
        c40742qdg.EZpvd = application.KWHzl();
        java.util.List<Application> listOLrzqt = c40742qdg.OLrzqt();
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listOLrzqt, 10));
        for (Application application2 : listOLrzqt) {
            arrayList.add(Application.copy$default(application2, null, c40742qdg.EZpvd == application2.KWHzl(), 1, null));
        }
        c40742qdg.submitList(arrayList);
    }
}
