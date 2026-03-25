package o;

import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.business.defi.api.bean.DappInteractionArgs;
import com.okinc.business.defi.wallet.approve.ApproveListItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.ActivityC13761dXh;
import o.C13754dXa;
import o.dXU;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public final class dXU extends AbstractC59533zio<dXW, RecyclerView.ViewHolder> {
    public final androidx.fragment.app.FragmentManager EZpvd;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final androidx.fragment.app.FragmentManager OLrzqt() {
        return this.EZpvd;
    }

    public dXU(@NotNull androidx.fragment.app.FragmentManager fragmentManager) {
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        this.EZpvd = fragmentManager;
    }

    public static final class StateListAnimator extends RecyclerView.ViewHolder {
        public StateListAnimator(android.view.View view) {
            super(view);
        }
    }

    @Override // o.AbstractC59533zio
    public RecyclerView.ViewHolder onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        return new StateListAnimator(layoutInflater.inflate(C13754dXa.TaskDescription.scanPackages, viewGroup, false));
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull RecyclerView.ViewHolder viewHolder, @NotNull dXW dxw) {
        Intrinsics.checkNotNullParameter(viewHolder, "");
        Intrinsics.checkNotNullParameter(dxw, "");
        AbstractC16658eoA abstractC16658eoA = (AbstractC16658eoA) DataBindingUtil.bind(viewHolder.itemView);
        if (abstractC16658eoA == null) {
            return;
        }
        android.content.Context context = viewHolder.itemView.getContext();
        abstractC16658eoA.OLrzqt.setText(dxw.OLrzqt());
        C43316rmw c43316rmw = new C43316rmw();
        c43316rmw.register(ApproveListItem.class, new Activity(context, this));
        abstractC16658eoA.KWHzl.setAdapter(c43316rmw);
        c43316rmw.setItems(dxw.KWHzl());
        c43316rmw.notifyDataSetChanged();
    }

    public static final class Activity extends AbstractC13764dXk {
        public final /* synthetic */ android.content.Context AEQbTJ;
        public final /* synthetic */ dXU OLrzqt;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Activity(android.content.Context context, dXU dxu) {
            super(true);
            this.AEQbTJ = context;
            this.OLrzqt = dxu;
        }

        @Override // o.AbstractC13764dXk
        public void KWHzl(ApproveListItem approveListItem) {
            Intrinsics.checkNotNullParameter(approveListItem, "");
            ActivityC13761dXh.Application application = ActivityC13761dXh.Companion;
            android.content.Context context = this.AEQbTJ;
            Intrinsics.copydefault(context);
            ActivityC13761dXh.Application.startActivity$default(application, context, approveListItem, null, 4, null);
        }

        @Override // o.AbstractC13764dXk
        public void copydefault(ApproveListItem approveListItem) {
            Intrinsics.checkNotNullParameter(approveListItem, "");
            C13757dXd c13757dXd = C13757dXd.copydefault;
            android.content.Context context = this.AEQbTJ;
            Intrinsics.copydefault(context);
            final java.util.List<DappInteractionArgs> listOLrzqt = c13757dXd.OLrzqt(approveListItem, context, C15523eLm.KWHzl);
            if (!listOLrzqt.isEmpty()) {
                androidx.fragment.app.FragmentManager fragmentManagerOLrzqt = this.OLrzqt.OLrzqt();
                final android.content.Context context2 = this.AEQbTJ;
                new C14506dmj(fragmentManagerOLrzqt, "approveTokenGroup", true, new Function1() { // from class: o.dXV
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return dXU.Activity.AEQbTJ(context2, listOLrzqt, (java.lang.String) obj);
                    }
                }, new Function0() { // from class: o.dYb
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return dXU.Activity.EZpvd();
                    }
                }).EZpvd();
            }
        }

        public static final Unit AEQbTJ(android.content.Context context, java.util.List list, java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            InterfaceC9854bdT interfaceC9854bdT = (InterfaceC9854bdT) C43251rlk.OLrzqt(InterfaceC9854bdT.class);
            if (interfaceC9854bdT != null) {
                Intrinsics.copydefault(context);
                interfaceC9854bdT.OLrzqt(context, list);
            }
            return Unit.INSTANCE;
        }

        public static final Unit EZpvd() {
            return Unit.INSTANCE;
        }
    }
}
