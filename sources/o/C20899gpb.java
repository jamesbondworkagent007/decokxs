package o;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.business.defi.biz.constant.MultiTransferMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.C21004gra;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.gpb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C20899gpb extends AbstractC59533zio<C21004gra.Activity, Application> {
    public Function2<? super C21004gra.Activity, ? super java.lang.Boolean, Unit> EZpvd;
    public int KWHzl;
    public Function2<? super java.lang.String, ? super java.lang.Boolean, Unit> OLrzqt;

    public C20899gpb(int i, Function2<? super C21004gra.Activity, ? super java.lang.Boolean, Unit> function2, Function2<? super java.lang.String, ? super java.lang.Boolean, Unit> function22) {
        this.KWHzl = i;
        this.EZpvd = function2;
        this.OLrzqt = function22;
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public Application onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        AbstractC17071evq abstractC17071evqEZpvd = AbstractC17071evq.EZpvd(android.view.LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(abstractC17071evqEZpvd, "");
        return new Application(abstractC17071evqEZpvd);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull Application application, @NotNull final C21004gra.Activity activity) {
        Intrinsics.checkNotNullParameter(application, "");
        Intrinsics.checkNotNullParameter(activity, "");
        application.copydefault().AEQbTJ.setText(activity.copydefault().AEQbTJ());
        application.copydefault().copydefault.setRotation(activity.KWHzl() ? 0.0f : 180.0f);
        application.copydefault().OLrzqt.setOnClickListener(new View.OnClickListener() { // from class: o.gph
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C20899gpb.copydefault(activity, this, view);
            }
        });
        if (OLrzqt()) {
            wYC wyc = application.copydefault().EZpvd;
            wyc.setVisibility(0);
            wyc.setSelected(activity.OLrzqt());
            wyc.setOnClickListener(new View.OnClickListener() { // from class: o.gpi
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C20899gpb.KWHzl(this.copydefault, activity, view);
                }
            });
            Intrinsics.copydefault(wyc);
            return;
        }
        application.copydefault().EZpvd.setVisibility(8);
    }

    public static final void copydefault(C21004gra.Activity activity, C20899gpb c20899gpb, android.view.View view) {
        if (activity.KWHzl()) {
            Function2<? super C21004gra.Activity, ? super java.lang.Boolean, Unit> function2 = c20899gpb.EZpvd;
            if (function2 != null) {
                function2.invoke(activity, java.lang.Boolean.FALSE);
                return;
            }
            return;
        }
        Function2<? super C21004gra.Activity, ? super java.lang.Boolean, Unit> function22 = c20899gpb.EZpvd;
        if (function22 != null) {
            function22.invoke(activity, java.lang.Boolean.TRUE);
        }
    }

    public static final void KWHzl(C20899gpb c20899gpb, C21004gra.Activity activity, android.view.View view) {
        Function2<? super java.lang.String, ? super java.lang.Boolean, Unit> function2 = c20899gpb.OLrzqt;
        if (function2 != null) {
            function2.invoke(activity.copydefault().EZpvd(), java.lang.Boolean.TRUE);
        }
    }

    /* JADX INFO: renamed from: o.gpb$Application */
    public static final class Application extends RecyclerView.ViewHolder {
        public final AbstractC17071evq copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final AbstractC17071evq copydefault() {
            return this.copydefault;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Application(@NotNull AbstractC17071evq abstractC17071evq) {
            super(abstractC17071evq.getRoot());
            Intrinsics.checkNotNullParameter(abstractC17071evq, "");
            this.copydefault = abstractC17071evq;
        }
    }

    private final boolean OLrzqt() {
        return this.KWHzl == MultiTransferMode.MODE_MANY_TO_ONE.getValue() || this.KWHzl == MultiTransferMode.MODE_MANY_TO_MANY.getValue();
    }
}
