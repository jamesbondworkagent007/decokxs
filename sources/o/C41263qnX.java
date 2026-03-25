package o;

import android.view.View;
import com.okinc.market.quotation.ui.model.CategoryGroupVo;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qnX, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C41263qnX extends AbstractC40515qYs<Application, C42816rdZ> {
    public CategoryGroupVo AEQbTJ;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CategoryGroupVo copydefault() {
        return this.AEQbTJ;
    }

    public C41263qnX(@NotNull java.util.List<CategoryGroupVo> list, @NotNull CategoryGroupVo categoryGroupVo) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(categoryGroupVo, "");
        this.AEQbTJ = categoryGroupVo;
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        for (CategoryGroupVo categoryGroupVo2 : list) {
            arrayList.add(new Application(categoryGroupVo2, Intrinsics.EZpvd(this.AEQbTJ, categoryGroupVo2)));
        }
        submitList(arrayList);
    }

    /* JADX INFO: renamed from: o.qnX$Application */
    public static final class Application implements InterfaceC40516qYt {
        public static final int KWHzl = CategoryGroupVo.KWHzl;
        public final boolean AEQbTJ;
        public final CategoryGroupVo copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Application copy$default(Application application, CategoryGroupVo categoryGroupVo, boolean z, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                categoryGroupVo = application.copydefault;
            }
            if ((i & 2) != 0) {
                z = application.AEQbTJ;
            }
            return application.copydefault(categoryGroupVo, z);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final CategoryGroupVo OLrzqt() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Application copydefault(@NotNull CategoryGroupVo categoryGroupVo, boolean z) {
            Intrinsics.checkNotNullParameter(categoryGroupVo, "");
            return new Application(categoryGroupVo, z);
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
            return Intrinsics.EZpvd(this.copydefault, application.copydefault) && this.AEQbTJ == application.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (this.copydefault.hashCode() * 31) + java.lang.Boolean.hashCode(this.AEQbTJ);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "SelectableCategoryVo(vo=" + this.copydefault + ", isSelected=" + this.AEQbTJ + ")";
        }

        public Application(@NotNull CategoryGroupVo categoryGroupVo, boolean z) {
            Intrinsics.checkNotNullParameter(categoryGroupVo, "");
            this.copydefault = categoryGroupVo;
            this.AEQbTJ = z;
        }

        @Override // o.InterfaceC40516qYt
        public boolean onCompareItems(@NotNull InterfaceC40516qYt interfaceC40516qYt) {
            Intrinsics.checkNotNullParameter(interfaceC40516qYt, "");
            return (interfaceC40516qYt instanceof Application) && Intrinsics.EZpvd(this.copydefault, ((Application) interfaceC40516qYt).copydefault);
        }

        @Override // o.InterfaceC40516qYt
        public boolean onCompareContents(@NotNull InterfaceC40516qYt interfaceC40516qYt) {
            Intrinsics.checkNotNullParameter(interfaceC40516qYt, "");
            return Intrinsics.EZpvd(this, interfaceC40516qYt);
        }
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/viewbinding/ViewBinding; */
    @Override // o.AbstractC40515qYs
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
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
        c42816rdZ.OLrzqt.setText(application.OLrzqt().AhwBna());
        c42816rdZ.OLrzqt.setSelected(application.copydefault());
        c42816rdZ.OLrzqt.setEnabled(true);
        c42816rdZ.OLrzqt.setOnClickListener(new View.OnClickListener() { // from class: o.qnZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C41263qnX.EZpvd(this.copydefault, application, view);
            }
        });
    }

    public static final void EZpvd(C41263qnX c41263qnX, Application application, android.view.View view) {
        c41263qnX.AEQbTJ = application.OLrzqt();
        java.util.List<Application> listOLrzqt = c41263qnX.OLrzqt();
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listOLrzqt, 10));
        for (Application application2 : listOLrzqt) {
            arrayList.add(Application.copy$default(application2, null, Intrinsics.EZpvd(c41263qnX.AEQbTJ, application2.OLrzqt()), 1, null));
        }
        c41263qnX.submitList(arrayList);
    }
}
