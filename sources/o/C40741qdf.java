package o;

import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import com.okinc.market.quotation.ui.model.FuturesTypeEnum;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.qZH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qdf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C40741qdf extends AbstractC40515qYs<Activity, C42816rdZ> {
    public FuturesTypeEnum AEQbTJ;
    public final Function1<FuturesTypeEnum, Unit> KWHzl;

    /* JADX INFO: renamed from: o.qdf$TaskDescription */
    public final /* synthetic */ class TaskDescription {
        public static final /* synthetic */ int[] AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[FuturesTypeEnum.values().length];
            try {
                iArr[FuturesTypeEnum.ALL.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[FuturesTypeEnum.PERPETUAL.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[FuturesTypeEnum.EXPIRY.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            AEQbTJ = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final FuturesTypeEnum copydefault() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: kotlin.jvm.functions.Function1<? super com.okinc.market.quotation.ui.model.FuturesTypeEnum, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public C40741qdf(@NotNull java.util.List<? extends FuturesTypeEnum> list, @NotNull FuturesTypeEnum futuresTypeEnum, @NotNull Function1<? super FuturesTypeEnum, Unit> function1) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(futuresTypeEnum, "");
        Intrinsics.checkNotNullParameter(function1, "");
        this.AEQbTJ = futuresTypeEnum;
        this.KWHzl = function1;
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        for (FuturesTypeEnum futuresTypeEnum2 : list) {
            arrayList.add(new Activity(futuresTypeEnum2, this.AEQbTJ == futuresTypeEnum2));
        }
        submitList(arrayList);
    }

    /* JADX INFO: renamed from: o.qdf$Activity */
    public static final class Activity implements InterfaceC40516qYt {
        public final boolean EZpvd;
        public final FuturesTypeEnum OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Activity copy$default(Activity activity, FuturesTypeEnum futuresTypeEnum, boolean z, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                futuresTypeEnum = activity.OLrzqt;
            }
            if ((i & 2) != 0) {
                z = activity.EZpvd;
            }
            return activity.copydefault(futuresTypeEnum, z);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean AEQbTJ() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final FuturesTypeEnum copydefault() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Activity copydefault(@NotNull FuturesTypeEnum futuresTypeEnum, boolean z) {
            Intrinsics.checkNotNullParameter(futuresTypeEnum, "");
            return new Activity(futuresTypeEnum, z);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Activity)) {
                return false;
            }
            Activity activity = (Activity) obj;
            return this.OLrzqt == activity.OLrzqt && this.EZpvd == activity.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (this.OLrzqt.hashCode() * 31) + java.lang.Boolean.hashCode(this.EZpvd);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "SelectableTypeVo(type=" + this.OLrzqt + ", isSelected=" + this.EZpvd + ")";
        }

        public Activity(@NotNull FuturesTypeEnum futuresTypeEnum, boolean z) {
            Intrinsics.checkNotNullParameter(futuresTypeEnum, "");
            this.OLrzqt = futuresTypeEnum;
            this.EZpvd = z;
        }

        @Override // o.InterfaceC40516qYt
        public boolean onCompareItems(@NotNull InterfaceC40516qYt interfaceC40516qYt) {
            Intrinsics.checkNotNullParameter(interfaceC40516qYt, "");
            return (interfaceC40516qYt instanceof Activity) && this.OLrzqt == ((Activity) interfaceC40516qYt).OLrzqt;
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
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public void copydefault(@NotNull C42816rdZ c42816rdZ, int i, @NotNull final Activity activity) {
        java.lang.String strAYXKKw;
        Intrinsics.checkNotNullParameter(c42816rdZ, "");
        Intrinsics.checkNotNullParameter(activity, "");
        AppCompatTextView appCompatTextView = c42816rdZ.OLrzqt;
        int i2 = TaskDescription.AEQbTJ[activity.copydefault().ordinal()];
        if (i2 == 1) {
            strAYXKKw = C33070mpX.AYXKKw(qZH.PendingIntent.idLUrz);
        } else if (i2 == 2) {
            strAYXKKw = C33070mpX.AYXKKw(qZH.PendingIntent.QMuEJi);
        } else {
            strAYXKKw = i2 != 3 ? null : C33070mpX.AYXKKw(qZH.PendingIntent.OStAOF);
        }
        appCompatTextView.setText(strAYXKKw);
        c42816rdZ.OLrzqt.setSelected(activity.AEQbTJ());
        c42816rdZ.OLrzqt.setEnabled(true);
        c42816rdZ.OLrzqt.setOnClickListener(new View.OnClickListener() { // from class: o.qdm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C40741qdf.EZpvd(this.copydefault, activity, view);
            }
        });
    }

    public static final void EZpvd(C40741qdf c40741qdf, Activity activity, android.view.View view) {
        c40741qdf.AEQbTJ = activity.copydefault();
        java.util.List<Activity> listOLrzqt = c40741qdf.OLrzqt();
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listOLrzqt, 10));
        for (Activity activity2 : listOLrzqt) {
            arrayList.add(Activity.copy$default(activity2, null, c40741qdf.AEQbTJ == activity2.copydefault(), 1, null));
        }
        c40741qdf.submitList(arrayList);
        c40741qdf.KWHzl.invoke(c40741qdf.copydefault());
    }
}
