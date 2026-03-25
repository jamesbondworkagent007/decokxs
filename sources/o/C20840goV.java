package o;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.business.defi.biz.constant.MultiTransferMode;
import com.okinc.business.defi.wallet.transfer.batch.multiTransferBean.AddressChildBean;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.goV, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C20840goV extends AbstractC59533zio<AddressChildBean, StateListAnimator> {
    public final Function1<AddressChildBean, Unit> EZpvd;
    public final int KWHzl;
    public final java.lang.Long OLrzqt;

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super com.okinc.business.defi.wallet.transfer.batch.multiTransferBean.AddressChildBean, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public C20840goV(java.lang.Long l, int i, Function1<? super AddressChildBean, Unit> function1) {
        this.OLrzqt = l;
        this.KWHzl = i;
        this.EZpvd = function1;
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public StateListAnimator onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        C17067evm c17067evmCopydefault = C17067evm.copydefault(android.view.LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c17067evmCopydefault, "");
        return new StateListAnimator(c17067evmCopydefault);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull StateListAnimator stateListAnimator, @NotNull final AddressChildBean addressChildBean) {
        java.lang.String strFJNWhG;
        Intrinsics.checkNotNullParameter(stateListAnimator, "");
        Intrinsics.checkNotNullParameter(addressChildBean, "");
        java.lang.String addressStr$default = C14079deg.getAddressStr$default(C14079deg.EZpvd, addressChildBean.getAddress(), false, 2, null);
        java.lang.String name = addressChildBean.getName();
        if (name.length() == 0) {
            name = addressStr$default;
        }
        stateListAnimator.OLrzqt().gEmmrt.setText(name);
        AppCompatImageView appCompatImageView = stateListAnimator.OLrzqt().AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(appCompatImageView, "");
        C14725dqq.copydefault(appCompatImageView, addressChildBean.getAddress(), C13754dXa.Activity.fJNWhG, new Function1() { // from class: o.goR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C20840goV.AEQbTJ((C5335Nt) obj);
            }
        }, 32.0f);
        if (addressChildBean.isShowBalance()) {
            stateListAnimator.OLrzqt().valueOf.setVisibility(0);
            stateListAnimator.OLrzqt().AhwBna.setText(addressStr$default);
            C10854bwM c10854bwMKWHzl = C10954byG.EZpvd.valueOf().KWHzl(this.OLrzqt);
            if (c10854bwMKWHzl == null || (strFJNWhG = c10854bwMKWHzl.fJNWhG()) == null) {
                strFJNWhG = "";
            }
            android.widget.TextView textView = stateListAnimator.OLrzqt().AYXKKw;
            android.content.Context context = stateListAnimator.OLrzqt().getRoot().getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            int i = C13754dXa.FragmentManager.observeReporter;
            kotlin.Pair[] pairArr = new kotlin.Pair[2];
            pairArr[0] = C56390yDp.OLrzqt("token", strFJNWhG);
            java.lang.String coinBalance = addressChildBean.getCoinBalance();
            if (coinBalance == null) {
                coinBalance = "0";
            }
            pairArr[1] = C56390yDp.OLrzqt("num", coinBalance);
            textView.setText(C33069mpW.KWHzl(context, i, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56424yEw.gEmmrt(pairArr)));
        } else {
            stateListAnimator.OLrzqt().AYXKKw.setText(addressChildBean.getAddress());
            stateListAnimator.OLrzqt().valueOf.setVisibility(8);
        }
        if (KWHzl()) {
            stateListAnimator.OLrzqt().copydefault.setVisibility(0);
            stateListAnimator.OLrzqt().copydefault.setImageDrawable(C33070mpX.KWHzl(C13754dXa.Activity.UrRBLY));
        } else {
            stateListAnimator.OLrzqt().copydefault.setImageDrawable(C33070mpX.KWHzl(C13754dXa.Activity.DWgRXt));
        }
        stateListAnimator.OLrzqt().copydefault.setSelected(addressChildBean.isSelected());
        stateListAnimator.itemView.setOnClickListener(new View.OnClickListener() { // from class: o.goT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C20840goV.EZpvd(this.AEQbTJ, addressChildBean, view);
            }
        });
    }

    public static final Unit AEQbTJ(C5335Nt c5335Nt) {
        Intrinsics.checkNotNullParameter(c5335Nt, "");
        c5335Nt.EZpvd((NN<android.graphics.Bitmap>) new C5417Qx(C55298xhM.dpInt$default(4, (android.content.Context) null, 1, (java.lang.Object) null)));
        return Unit.INSTANCE;
    }

    public static final void EZpvd(C20840goV c20840goV, AddressChildBean addressChildBean, android.view.View view) {
        Function1<AddressChildBean, Unit> function1 = c20840goV.EZpvd;
        if (function1 != null) {
            function1.invoke(addressChildBean);
        }
    }

    /* JADX INFO: renamed from: o.goV$StateListAnimator */
    public static final class StateListAnimator extends RecyclerView.ViewHolder {
        public final C17067evm copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C17067evm OLrzqt() {
            return this.copydefault;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StateListAnimator(@NotNull C17067evm c17067evm) {
            super(c17067evm.getRoot());
            Intrinsics.checkNotNullParameter(c17067evm, "");
            this.copydefault = c17067evm;
        }
    }

    public final boolean KWHzl() {
        return this.KWHzl == MultiTransferMode.MODE_ONE_TO_MANY.getValue() || this.KWHzl == MultiTransferMode.MODE_MANY_TO_MANY.getValue();
    }
}
