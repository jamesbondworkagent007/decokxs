package o;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.business.defi.biz.constant.MultiTransferMode;
import com.okinc.business.defi.wallet.transfer.batch.multiTransferBean.AddressGroupBean;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.goS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C20837goS extends AbstractC59533zio<AddressGroupBean, ActionBar> {
    public Function1<? super AddressGroupBean, Unit> KWHzl;
    public int OLrzqt;
    public Function2<? super AddressGroupBean, ? super java.lang.Boolean, Unit> copydefault;

    public C20837goS(int i, Function2<? super AddressGroupBean, ? super java.lang.Boolean, Unit> function2, Function1<? super AddressGroupBean, Unit> function1) {
        this.OLrzqt = i;
        this.copydefault = function2;
        this.KWHzl = function1;
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public ActionBar onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        C17068evn c17068evnAEQbTJ = C17068evn.AEQbTJ(android.view.LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c17068evnAEQbTJ, "");
        return new ActionBar(c17068evnAEQbTJ);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull final ActionBar actionBar, @NotNull final AddressGroupBean addressGroupBean) {
        Intrinsics.checkNotNullParameter(actionBar, "");
        Intrinsics.checkNotNullParameter(addressGroupBean, "");
        actionBar.OLrzqt().AEQbTJ.setText(addressGroupBean.getTitle());
        if (addressGroupBean.isExpanded()) {
            actionBar.OLrzqt().KWHzl.setRotation(0.0f);
        } else {
            actionBar.OLrzqt().KWHzl.setRotation(180.0f);
        }
        actionBar.OLrzqt().OLrzqt.setOnClickListener(new View.OnClickListener() { // from class: o.gpa
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C20837goS.KWHzl(addressGroupBean, actionBar, this, view);
            }
        });
        if (AEQbTJ()) {
            actionBar.OLrzqt().EZpvd.setVisibility(0);
            actionBar.OLrzqt().EZpvd.setImageDrawable(C33070mpX.KWHzl(C13754dXa.Activity.UrRBLY));
            actionBar.OLrzqt().EZpvd.setOnClickListener(new View.OnClickListener() { // from class: o.goY
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C20837goS.EZpvd(this.AEQbTJ, addressGroupBean, view);
                }
            });
            actionBar.OLrzqt().EZpvd.setSelected(addressGroupBean.isSelected());
            return;
        }
        actionBar.OLrzqt().EZpvd.setVisibility(8);
    }

    public static final void KWHzl(AddressGroupBean addressGroupBean, ActionBar actionBar, C20837goS c20837goS, android.view.View view) {
        if (addressGroupBean.isExpanded()) {
            actionBar.OLrzqt().KWHzl.setRotation(180.0f);
            Function2<? super AddressGroupBean, ? super java.lang.Boolean, Unit> function2 = c20837goS.copydefault;
            if (function2 != null) {
                function2.invoke(addressGroupBean, java.lang.Boolean.FALSE);
                return;
            }
            return;
        }
        actionBar.OLrzqt().KWHzl.setRotation(0.0f);
        Function2<? super AddressGroupBean, ? super java.lang.Boolean, Unit> function22 = c20837goS.copydefault;
        if (function22 != null) {
            function22.invoke(addressGroupBean, java.lang.Boolean.TRUE);
        }
    }

    public static final void EZpvd(C20837goS c20837goS, AddressGroupBean addressGroupBean, android.view.View view) {
        Function1<? super AddressGroupBean, Unit> function1 = c20837goS.KWHzl;
        if (function1 != null) {
            function1.invoke(addressGroupBean);
        }
    }

    /* JADX INFO: renamed from: o.goS$ActionBar */
    public static final class ActionBar extends RecyclerView.ViewHolder {
        public final C17068evn EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C17068evn OLrzqt() {
            return this.EZpvd;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ActionBar(@NotNull C17068evn c17068evn) {
            super(c17068evn.getRoot());
            Intrinsics.checkNotNullParameter(c17068evn, "");
            this.EZpvd = c17068evn;
        }
    }

    private final boolean AEQbTJ() {
        return this.OLrzqt == MultiTransferMode.MODE_ONE_TO_MANY.getValue() || this.OLrzqt == MultiTransferMode.MODE_MANY_TO_MANY.getValue();
    }
}
