package o;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.unify_trade.bot.data.TacticsInsideItemData;
import com.okinc.unify_trade.bot.data.TransDetailsData;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class wOH extends AbstractC59533zio<TransDetailsData, StateListAnimator> {
    public final Function2<java.lang.String, java.lang.String, Unit> AEQbTJ;
    public final android.content.Context KWHzl;

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function2<? super java.lang.String, ? super java.lang.String, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public wOH(android.content.Context context, Function2<? super java.lang.String, ? super java.lang.String, Unit> function2) {
        this.KWHzl = context;
        this.AEQbTJ = function2;
    }

    public static final class StateListAnimator extends RecyclerView.ViewHolder {
        public C55251xgS AEQbTJ;
        public android.widget.TextView AYXKKw;
        public android.widget.TextView AhwBna;
        public android.widget.TextView AkhnZx;
        public android.view.View EZpvd;
        public RecyclerView KWHzl;
        public android.widget.ImageView OLrzqt;
        public android.widget.ImageView copydefault;
        public android.widget.TextView djBIcL;
        public android.widget.TextView gEmmrt;
        public C55251xgS isConnected;
        public android.widget.TextView valueOf;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final android.widget.ImageView AEQbTJ() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final android.widget.TextView AYXKKw() {
            return this.djBIcL;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final android.widget.TextView AhwBna() {
            return this.AYXKKw;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C55251xgS DbNXlk() {
            return this.isConnected;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final android.view.View EZpvd() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C55251xgS KWHzl() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final android.widget.ImageView OLrzqt() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final RecyclerView copydefault() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final android.widget.TextView djBIcL() {
            return this.gEmmrt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final android.widget.TextView gEmmrt() {
            return this.valueOf;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final android.widget.TextView valueOf() {
            return this.AhwBna;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final android.widget.TextView values() {
            return this.AkhnZx;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StateListAnimator(@NotNull android.view.View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "");
            android.view.View viewFindViewById = view.findViewById(C48033uCm.Application.onNothingSelected);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "");
            this.AkhnZx = (android.widget.TextView) viewFindViewById;
            android.view.View viewFindViewById2 = view.findViewById(C48033uCm.Application.INotificationSideChannelStub);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "");
            this.copydefault = (android.widget.ImageView) viewFindViewById2;
            android.view.View viewFindViewById3 = view.findViewById(C48033uCm.Application.ensureSubDecor);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "");
            this.gEmmrt = (android.widget.TextView) viewFindViewById3;
            android.view.View viewFindViewById4 = view.findViewById(C48033uCm.Application.flushMarshmallows);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "");
            this.isConnected = (C55251xgS) viewFindViewById4;
            android.view.View viewFindViewById5 = view.findViewById(C48033uCm.Application.MediaSessionCompat);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "");
            this.AEQbTJ = (C55251xgS) viewFindViewById5;
            android.view.View viewFindViewById6 = view.findViewById(C48033uCm.Application.shouldAnimateActionModeView);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "");
            this.valueOf = (android.widget.TextView) viewFindViewById6;
            android.view.View viewFindViewById7 = view.findViewById(C48033uCm.Application.AppCompatDelegateImplActionBarMenuCallback);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById7, "");
            this.djBIcL = (android.widget.TextView) viewFindViewById7;
            android.view.View viewFindViewById8 = view.findViewById(C48033uCm.Application.throwFeatureRequestIfSubDecorInstalled);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById8, "");
            this.AYXKKw = (android.widget.TextView) viewFindViewById8;
            android.view.View viewFindViewById9 = view.findViewById(C48033uCm.Application.detect);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById9, "");
            this.AhwBna = (android.widget.TextView) viewFindViewById9;
            android.view.View viewFindViewById10 = view.findViewById(C48033uCm.Application.IResultReceiverStub);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById10, "");
            this.KWHzl = (RecyclerView) viewFindViewById10;
            android.view.View viewFindViewById11 = view.findViewById(C48033uCm.Application.updateStateFromTypedArray);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById11, "");
            this.EZpvd = viewFindViewById11;
            android.view.View viewFindViewById12 = view.findViewById(C48033uCm.Application.getNotifyChildrenChangedOptions);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById12, "");
            this.OLrzqt = (android.widget.ImageView) viewFindViewById12;
        }
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public StateListAnimator onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        android.view.View viewInflate = layoutInflater.inflate(C48033uCm.Activity.HrFqwD, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "");
        return new StateListAnimator(viewInflate);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull StateListAnimator stateListAnimator, @NotNull TransDetailsData transDetailsData) {
        Intrinsics.checkNotNullParameter(stateListAnimator, "");
        Intrinsics.checkNotNullParameter(transDetailsData, "");
        stateListAnimator.OLrzqt().setVisibility(8);
        stateListAnimator.gEmmrt().setVisibility(8);
        stateListAnimator.AYXKKw().setVisibility(8);
        stateListAnimator.AEQbTJ().setVisibility(8);
        stateListAnimator.values().setText(transDetailsData.getTitle());
        stateListAnimator.AEQbTJ().setVisibility(8);
        C55251xgS c55251xgSDbNXlk = stateListAnimator.DbNXlk();
        c55251xgSDbNXlk.setText(transDetailsData.getTradeType());
        c55251xgSDbNXlk.setOKDSSize(-5);
        c55251xgSDbNXlk.setOKDSStyle(transDetailsData.getTradeTypeTagStyle());
        stateListAnimator.KWHzl().setVisibility(transDetailsData.getShowManualTag() ? 0 : 8);
        if (transDetailsData.getShowManualTag()) {
            C55251xgS c55251xgSKWHzl = stateListAnimator.KWHzl();
            c55251xgSKWHzl.setText(C33070mpX.AYXKKw(C48033uCm.Fragment.OtRJxF));
            c55251xgSKWHzl.setOKDSSize(-5);
            c55251xgSKWHzl.setOKDSStyle(6);
        }
        if (C33129mqd.OLrzqt((java.lang.CharSequence) transDetailsData.getTime())) {
            stateListAnimator.valueOf().setVisibility(0);
            stateListAnimator.valueOf().setText(transDetailsData.getTime());
        } else {
            stateListAnimator.valueOf().setVisibility(8);
        }
        if (C33129mqd.OLrzqt((java.lang.CharSequence) transDetailsData.getDealOrdType())) {
            stateListAnimator.AhwBna().setVisibility(0);
            stateListAnimator.AhwBna().setText(transDetailsData.getDealOrdType());
        } else {
            stateListAnimator.AhwBna().setVisibility(8);
        }
        stateListAnimator.values().setCompoundDrawablesRelative(null, null, null, null);
        if (C33129mqd.OLrzqt((java.lang.CharSequence) transDetailsData.getState())) {
            stateListAnimator.djBIcL().setVisibility(0);
            stateListAnimator.djBIcL().setText(transDetailsData.getState());
        } else {
            stateListAnimator.djBIcL().setVisibility(8);
        }
        stateListAnimator.djBIcL().setBackgroundResource(transDetailsData.getStateClickable() ? C48033uCm.ActionBar.wlaJM : 0);
        android.widget.TextView textViewDjBIcL = stateListAnimator.djBIcL();
        textViewDjBIcL.setOnClickListener(new TaskDescription(textViewDjBIcL, 1000L, transDetailsData, this));
        stateListAnimator.djBIcL().setTextColor(transDetailsData.getStateColor());
        C59534zip c59534zip = new C59534zip();
        android.content.Context context = stateListAnimator.copydefault().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        c59534zip.register(TacticsInsideItemData.class, new C52518wOj(context, null, false, 0, false, null, null, null, 254, null));
        c59534zip.setItems(transDetailsData.getList());
        if (this.KWHzl != null) {
            stateListAnimator.copydefault().setLayoutManager(C33047mpA.copydefault(this.KWHzl, 2));
            stateListAnimator.copydefault().setAdapter(c59534zip);
        }
        if (stateListAnimator.copydefault().getItemDecorationCount() == 0) {
            RecyclerView recyclerViewCopydefault = stateListAnimator.copydefault();
            android.content.Context context2 = stateListAnimator.itemView.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            recyclerViewCopydefault.addItemDecoration(new C57584ylF(2, 0, C33052mpF.EZpvd(16.0f, context2)));
        }
        stateListAnimator.EZpvd().setVisibility(getAdapter().getItems().size() == stateListAnimator.getBindingAdapterPosition() + 1 ? 4 : 0);
    }

    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ TransDetailsData EZpvd;
        public final /* synthetic */ wOH KWHzl;
        public final /* synthetic */ android.view.View OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, TransDetailsData transDetailsData, wOH woh) {
            this.OLrzqt = view;
            this.copydefault = j;
            this.EZpvd = transDetailsData;
            this.KWHzl = woh;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            Function2 function2;
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.copydefault || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                if (!this.EZpvd.getStateClickable() || (function2 = this.KWHzl.AEQbTJ) == null) {
                    return;
                }
                function2.invoke(this.EZpvd.getAlgoId(), this.EZpvd.getOrderId());
            }
        }
    }
}
