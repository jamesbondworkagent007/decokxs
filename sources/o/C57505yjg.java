package o;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.web3Uilib.bean.TransactionAddressPermissionInfoBean;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C57406yhn;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yjg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C57505yjg extends android.widget.LinearLayout {
    public C57390yhX OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C57505yjg(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C57505yjg(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:17) call: o.yjg.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C57505yjg(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57505yjg(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        C57390yhX c57390yhXEZpvd = C57390yhX.EZpvd(android.view.LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(c57390yhXEZpvd, "");
        this.OLrzqt = c57390yhXEZpvd;
        setOrientation(1);
        setPadding(C55298xhM.dpInt$default(24, (android.content.Context) null, 1, (java.lang.Object) null), 0, C55298xhM.dpInt$default(24, (android.content.Context) null, 1, (java.lang.Object) null), 0);
        this.OLrzqt.copydefault.setLayoutManager(new LinearLayoutManager(context));
        this.OLrzqt.copydefault.setAdapter(new Application(new java.util.ArrayList()));
    }

    public final void setViewDataBean(@NotNull TransactionAddressPermissionInfoBean transactionAddressPermissionInfoBean) {
        Intrinsics.checkNotNullParameter(transactionAddressPermissionInfoBean, "");
        this.OLrzqt.EZpvd.setText(transactionAddressPermissionInfoBean.getTitle());
        RecyclerView.Adapter adapter = this.OLrzqt.copydefault.getAdapter();
        Intrinsics.copydefault(adapter, "");
        Application application = (Application) adapter;
        application.copydefault(transactionAddressPermissionInfoBean.getDataList());
        application.notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: o.yjg$Application */
    public static final class Application extends RecyclerView.Adapter<StateListAnimator> {
        public final java.util.List<TransactionAddressPermissionInfoBean.AddressPermissionDataBean> OLrzqt;

        public Application(@NotNull java.util.List<TransactionAddressPermissionInfoBean.AddressPermissionDataBean> list) {
            Intrinsics.checkNotNullParameter(list, "");
            this.OLrzqt = list;
        }

        public final void copydefault(@NotNull java.util.List<TransactionAddressPermissionInfoBean.AddressPermissionDataBean> list) {
            Intrinsics.checkNotNullParameter(list, "");
            this.OLrzqt.clear();
            this.OLrzqt.addAll(list);
        }

        /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public StateListAnimator onCreateViewHolder(@NotNull android.view.ViewGroup viewGroup, int i) {
            Intrinsics.checkNotNullParameter(viewGroup, "");
            android.view.View viewInflate = android.view.LayoutInflater.from(viewGroup.getContext()).inflate(C57406yhn.TaskDescription.values, viewGroup, false);
            Intrinsics.checkNotNullExpressionValue(viewInflate, "");
            return new StateListAnimator(viewInflate);
        }

        /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V */
        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(@NotNull StateListAnimator stateListAnimator, int i) {
            Intrinsics.checkNotNullParameter(stateListAnimator, "");
            stateListAnimator.EZpvd(this.OLrzqt.get(i));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return this.OLrzqt.size();
        }
    }

    /* JADX INFO: renamed from: o.yjg$StateListAnimator */
    public static final class StateListAnimator extends RecyclerView.ViewHolder {
        public final android.widget.TextView EZpvd;
        public final android.widget.TextView KWHzl;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StateListAnimator(@NotNull android.view.View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "");
            this.EZpvd = (android.widget.TextView) view.findViewById(C57406yhn.StateListAnimator.Ufzxmz);
            this.KWHzl = (android.widget.TextView) view.findViewById(C57406yhn.StateListAnimator.dUDNAs);
        }

        public final void EZpvd(@NotNull TransactionAddressPermissionInfoBean.AddressPermissionDataBean addressPermissionDataBean) {
            Intrinsics.checkNotNullParameter(addressPermissionDataBean, "");
            this.EZpvd.setText(addressPermissionDataBean.getTitle());
            this.KWHzl.setText(addressPermissionDataBean.getAddress());
        }
    }
}
