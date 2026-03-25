package o;

import android.view.View;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.localization.util.format.OKDateEnum;
import com.okinc.localization.util.format.OKTimeEnum;
import com.okinc.p2p.api.OtcExtraKeys;
import com.okinc.unify_trade.biz.DcdArbRecord;
import com.okinc.unify_trade.bot.data.BotParamItemData;
import com.okinc.unify_trade.bot.dcd.config.DcdOptionType;
import java.util.Date;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class wOY extends AbstractC59533zio<DcdArbRecord, TaskDescription> {
    public static final StateListAnimator Companion = new StateListAnimator(null);

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.wOY.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public TaskDescription onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        ViewDataBinding viewDataBindingInflate = DataBindingUtil.inflate(layoutInflater, C48033uCm.Activity.ikIEnW, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(viewDataBindingInflate, "");
        return new TaskDescription((AbstractC50766vaO) viewDataBindingInflate);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull final TaskDescription taskDescription, @NotNull final DcdArbRecord dcdArbRecord) {
        java.lang.String strAYXKKw;
        java.util.List<?> listAhwBna;
        Intrinsics.checkNotNullParameter(taskDescription, "");
        Intrinsics.checkNotNullParameter(dcdArbRecord, "");
        AbstractC50766vaO abstractC50766vaOCopydefault = taskDescription.copydefault();
        android.widget.TextView textView = abstractC50766vaOCopydefault.KWHzl;
        xMR xmr = xMR.copydefault;
        java.lang.String cycle = dcdArbRecord.getCycle();
        if (cycle == null) {
            cycle = "";
        }
        textView.setText(xmr.copydefault(cycle));
        android.widget.TextView textView2 = abstractC50766vaOCopydefault.AhwBna;
        java.lang.String dcdOptionType = dcdArbRecord.getDcdOptionType();
        if (Intrinsics.EZpvd((java.lang.Object) dcdOptionType, (java.lang.Object) DcdOptionType.PUT.getMode())) {
            if (Intrinsics.EZpvd(dcdArbRecord.isConverted(), java.lang.Boolean.TRUE)) {
                int i = C48033uCm.Fragment.DaRZkR;
                java.lang.String amount = dcdArbRecord.getAmount();
                java.lang.String str = amount == null ? "" : amount;
                java.lang.String currency = dcdArbRecord.getCurrency();
                strAYXKKw = C33069mpW.copydefault(i, C56423yEv.EZpvd(C56390yDp.OLrzqt(OtcExtraKeys.AMOUNT, C56033xvF.copydefault(str, currency == null ? "" : currency, (88 & 4) != 0 ? false : true, (88 & 8) != 0 ? null : "8", (88 & 16) != 0 ? false : false, (88 & 32) == 0 ? false : false, (88 & 64) == 0 ? null : null))));
            } else {
                strAYXKKw = C33070mpX.AYXKKw(C48033uCm.Fragment.DGgnkA);
            }
        } else if (!Intrinsics.EZpvd((java.lang.Object) dcdOptionType, (java.lang.Object) DcdOptionType.CALL.getMode())) {
            strAYXKKw = "";
        } else if (Intrinsics.EZpvd(dcdArbRecord.isConverted(), java.lang.Boolean.TRUE)) {
            int i2 = C48033uCm.Fragment.DNMMPQ;
            java.lang.String amount2 = dcdArbRecord.getAmount();
            java.lang.String str2 = amount2 == null ? "" : amount2;
            java.lang.String currency2 = dcdArbRecord.getCurrency();
            strAYXKKw = C33069mpW.copydefault(i2, C56423yEv.EZpvd(C56390yDp.OLrzqt(OtcExtraKeys.AMOUNT, C56033xvF.copydefault(str2, currency2 == null ? "" : currency2, (88 & 4) != 0 ? false : true, (88 & 8) != 0 ? null : "8", (88 & 16) != 0 ? false : false, (88 & 32) == 0 ? false : false, (88 & 64) == 0 ? null : null))));
        } else {
            strAYXKKw = C33070mpX.AYXKKw(C48033uCm.Fragment.DsrFlB);
        }
        textView2.setText(strAYXKKw);
        abstractC50766vaOCopydefault.valueOf.setText(pTA.format$default(new Date(C33129mqd.valueOf(dcdArbRecord.getSettleTime())), OKDateEnum.DATE_FORMAT_SIMPLE, OKTimeEnum.TIME_FORMAT_SIMPLE, null, null, false, 28, null));
        abstractC50766vaOCopydefault.EZpvd.setImageResource(dcdArbRecord.isFold() ? C52761wXj.TaskDescription.DCUTEIddSDPG : C52761wXj.TaskDescription.DNMMPQ);
        int size = 3;
        abstractC50766vaOCopydefault.copydefault.setLayoutManager(new GridLayoutManager(abstractC50766vaOCopydefault.getRoot().getContext(), 3));
        if (C33129mqd.valueOf(java.lang.Integer.valueOf(abstractC50766vaOCopydefault.copydefault.getItemDecorationCount()), 0)) {
            RecyclerView recyclerView = abstractC50766vaOCopydefault.copydefault;
            C8042avK c8042avK = new C8042avK(C55298xhM.dp2px$default(12.0f, null, 1, null));
            c8042avK.copydefault(false);
            recyclerView.addItemDecoration(c8042avK);
        }
        if (!dcdArbRecord.isFold()) {
            java.util.List<BotParamItemData> insideItems = dcdArbRecord.getInsideItems();
            size = insideItems != null ? insideItems.size() : 0;
        }
        RecyclerView recyclerView2 = abstractC50766vaOCopydefault.copydefault;
        C43316rmw c43316rmw = new C43316rmw();
        c43316rmw.register(BotParamItemData.class, new C52538wPc());
        java.util.List<BotParamItemData> insideItems2 = dcdArbRecord.getInsideItems();
        if (insideItems2 == null || (listAhwBna = CollectionsKt___CollectionsKt.AhwBna((java.lang.Iterable) insideItems2, size)) == null) {
            listAhwBna = yDY.AhwBna();
        }
        c43316rmw.setItems(listAhwBna);
        recyclerView2.setAdapter(c43316rmw);
        abstractC50766vaOCopydefault.EZpvd.setOnClickListener(new View.OnClickListener() { // from class: o.wPe
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                wOY.AEQbTJ(dcdArbRecord, taskDescription, this, view);
            }
        });
        android.view.View view = abstractC50766vaOCopydefault.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(view, "");
        RecyclerView.Adapter<? extends RecyclerView.ViewHolder> bindingAdapter = taskDescription.getBindingAdapter();
        view.setVisibility((bindingAdapter != null && taskDescription.getAbsoluteAdapterPosition() + 1 == bindingAdapter.getItemCount()) ^ true ? 0 : 8);
    }

    public static final void AEQbTJ(DcdArbRecord dcdArbRecord, TaskDescription taskDescription, wOY woy, android.view.View view) {
        dcdArbRecord.setFold(!dcdArbRecord.isFold());
        int bindingAdapterPosition = taskDescription.getBindingAdapterPosition();
        if (C33129mqd.copydefault((java.lang.Object) java.lang.Integer.valueOf(bindingAdapterPosition), (java.lang.Object) 0)) {
            woy.getAdapter().notifyItemChanged(bindingAdapterPosition);
        }
    }

    public static final class TaskDescription extends RecyclerView.ViewHolder {
        public final AbstractC50766vaO copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final AbstractC50766vaO copydefault() {
            return this.copydefault;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TaskDescription(@NotNull AbstractC50766vaO abstractC50766vaO) {
            super(abstractC50766vaO.getRoot());
            Intrinsics.checkNotNullParameter(abstractC50766vaO, "");
            this.copydefault = abstractC50766vaO;
        }
    }
}
