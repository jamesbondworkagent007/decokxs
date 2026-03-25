package o;

import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.unify_trade.bot.constant.TacticsUiConst;
import com.okinc.unify_trade.bot.data.ExpandableGridDealRecordItemData;
import com.okinc.unify_trade.bot.data.TacticsInsideItemData;
import com.okinc.unify_trade.bot.data.TransDetailsData;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C52305wGm;
import o.C52761wXj;
import o.C55688xof;
import okhttp3.internal.ws.WebSocketProtocol;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wGm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C52305wGm extends AbstractC59533zio<ExpandableGridDealRecordItemData, Application> {
    public final Function1<ExpandableGridDealRecordItemData, Unit> KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C52305wGm() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Function1<ExpandableGridDealRecordItemData, Unit> OLrzqt() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (wrap:kotlin.jvm.functions.Function1:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null kotlin.jvm.functions.Function1) : (r1v0 kotlin.jvm.functions.Function1))
 A[MD:(kotlin.jvm.functions.Function1<? super com.okinc.unify_trade.bot.data.ExpandableGridDealRecordItemData, kotlin.Unit>):void (m)] (LINE:29) call: o.wGm.<init>(kotlin.jvm.functions.Function1):void type: THIS */
    public /* synthetic */ C52305wGm(Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : function1);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.jvm.functions.Function1<? super com.okinc.unify_trade.bot.data.ExpandableGridDealRecordItemData, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public C52305wGm(Function1<? super ExpandableGridDealRecordItemData, Unit> function1) {
        this.KWHzl = function1;
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public Application onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        C48429uRb c48429uRbAEQbTJ = C48429uRb.AEQbTJ(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c48429uRbAEQbTJ, "");
        return new Application(this, c48429uRbAEQbTJ);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull Application application, @NotNull ExpandableGridDealRecordItemData expandableGridDealRecordItemData) {
        Intrinsics.checkNotNullParameter(application, "");
        Intrinsics.checkNotNullParameter(expandableGridDealRecordItemData, "");
        application.AEQbTJ(expandableGridDealRecordItemData);
        application.copydefault(expandableGridDealRecordItemData);
        application.KWHzl(expandableGridDealRecordItemData);
    }

    /* JADX INFO: renamed from: o.wGm$Application */
    public final class Application extends RecyclerView.ViewHolder {
        public final C48429uRb KWHzl;
        public final /* synthetic */ C52305wGm OLrzqt;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Application(@NotNull C52305wGm c52305wGm, C48429uRb c48429uRb) {
            super(c48429uRb.getRoot());
            Intrinsics.checkNotNullParameter(c48429uRb, "");
            this.OLrzqt = c52305wGm;
            this.KWHzl = c48429uRb;
        }

        public final void copydefault(@NotNull ExpandableGridDealRecordItemData expandableGridDealRecordItemData) {
            Intrinsics.checkNotNullParameter(expandableGridDealRecordItemData, "");
            this.KWHzl.OLrzqt.setRotation(expandableGridDealRecordItemData.isExpanded() ? 180.0f : 0.0f);
        }

        public final void KWHzl(@NotNull ExpandableGridDealRecordItemData expandableGridDealRecordItemData) {
            Intrinsics.checkNotNullParameter(expandableGridDealRecordItemData, "");
            if (expandableGridDealRecordItemData.isExpanded() && (!expandableGridDealRecordItemData.getDetails().isEmpty())) {
                android.widget.LinearLayout linearLayout = this.KWHzl.copydefault;
                linearLayout.setDescendantFocusability(393216);
                linearLayout.removeAllViews();
                for (TransDetailsData transDetailsData : expandableGridDealRecordItemData.getDetails()) {
                    C48429uRb c48429uRb = this.KWHzl;
                    c48429uRb.copydefault.addView(EZpvd(c48429uRb, transDetailsData));
                }
                return;
            }
            this.KWHzl.copydefault.removeAllViews();
        }

        public final void AEQbTJ(@NotNull ExpandableGridDealRecordItemData expandableGridDealRecordItemData) {
            Intrinsics.checkNotNullParameter(expandableGridDealRecordItemData, "");
            this.KWHzl.gEmmrt.setText(expandableGridDealRecordItemData.getTitle());
            this.KWHzl.AYXKKw.setText(expandableGridDealRecordItemData.getPnlText());
            if (expandableGridDealRecordItemData.getPnlTextColor() == null) {
                this.KWHzl.AYXKKw.setTextAppearance(C52761wXj.LoaderManager.OFhtUX);
                this.KWHzl.AYXKKw.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.Dmq));
            } else {
                this.KWHzl.AYXKKw.setTextAppearance(C52761wXj.LoaderManager.OFhtUX);
                AppCompatTextView appCompatTextView = this.KWHzl.AYXKKw;
                java.lang.Integer pnlTextColor = expandableGridDealRecordItemData.getPnlTextColor();
                Intrinsics.copydefault(pnlTextColor);
                appCompatTextView.setTextColor(pnlTextColor.intValue());
            }
            android.widget.LinearLayout linearLayout = this.KWHzl.AEQbTJ;
            linearLayout.setOnClickListener(new TaskDescription(linearLayout, 1000L, this.OLrzqt, expandableGridDealRecordItemData));
        }

        public final android.view.View EZpvd(C48429uRb c48429uRb, TransDetailsData transDetailsData) {
            final android.content.Context context = c48429uRb.getRoot().getContext();
            C50820vbP c50820vbPAEQbTJ = C50820vbP.AEQbTJ(android.view.LayoutInflater.from(context), c48429uRb.copydefault, false);
            Intrinsics.checkNotNullExpressionValue(c50820vbPAEQbTJ, "");
            c50820vbPAEQbTJ.copydefault.setVisibility(8);
            c50820vbPAEQbTJ.djBIcL.setVisibility(8);
            c50820vbPAEQbTJ.AkhnZx.setVisibility(8);
            c50820vbPAEQbTJ.OLrzqt.setVisibility(8);
            c50820vbPAEQbTJ.DbNXlk.setText(transDetailsData.getTitle());
            C55251xgS c55251xgS = c50820vbPAEQbTJ.fetchVPNInfo;
            c55251xgS.setText(transDetailsData.getTradeType());
            c55251xgS.setOKDSSize(-5);
            c55251xgS.setOKDSStyle(transDetailsData.getTradeTypeTagStyle());
            android.widget.ImageView imageView = c50820vbPAEQbTJ.OLrzqt;
            Intrinsics.checkNotNullExpressionValue(imageView, "");
            imageView.setVisibility(8);
            if (C33129mqd.OLrzqt((java.lang.CharSequence) transDetailsData.getTime())) {
                c50820vbPAEQbTJ.isConnected.setVisibility(0);
                c50820vbPAEQbTJ.isConnected.setText(transDetailsData.getTime());
            } else {
                c50820vbPAEQbTJ.isConnected.setVisibility(8);
            }
            if (C33129mqd.OLrzqt((java.lang.CharSequence) transDetailsData.getDealOrdType())) {
                c50820vbPAEQbTJ.gEmmrt.setVisibility(0);
                c50820vbPAEQbTJ.gEmmrt.setText(transDetailsData.getDealOrdType());
            } else {
                c50820vbPAEQbTJ.gEmmrt.setVisibility(8);
            }
            c50820vbPAEQbTJ.DbNXlk.setCompoundDrawablesRelative(null, null, null, null);
            android.widget.TextView textView = c50820vbPAEQbTJ.AYXKKw;
            Intrinsics.checkNotNullExpressionValue(textView, "");
            textView.setVisibility(8);
            C59534zip c59534zip = new C59534zip();
            android.content.Context context2 = c50820vbPAEQbTJ.AEQbTJ.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            c59534zip.register(TacticsInsideItemData.class, new C52518wOj(context2, null, false, 0, false, null, null, new Function1() { // from class: o.wGp
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C52305wGm.Application.KWHzl(context, (Triple) obj);
                }
            }, WebSocketProtocol.PAYLOAD_SHORT, null));
            c59534zip.setItems(transDetailsData.getList());
            if (context != null) {
                c50820vbPAEQbTJ.AEQbTJ.setLayoutManager(C33047mpA.copydefault(context, 2));
                c50820vbPAEQbTJ.AEQbTJ.setAdapter(c59534zip);
            }
            if (c50820vbPAEQbTJ.AEQbTJ.getItemDecorationCount() == 0) {
                RecyclerView recyclerView = c50820vbPAEQbTJ.AEQbTJ;
                Intrinsics.copydefault(context);
                recyclerView.addItemDecoration(new C57584ylF(2, 0, C55298xhM.copydefault(16.0f, context)));
            }
            ConstraintLayout root = c50820vbPAEQbTJ.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "");
            return root;
        }

        public static final Unit KWHzl(android.content.Context context, Triple triple) {
            Intrinsics.checkNotNullParameter(triple, "");
            TacticsUiConst.BotListSubItemType botListSubItemType = (TacticsUiConst.BotListSubItemType) triple.component1();
            TacticsInsideItemData tacticsInsideItemData = (TacticsInsideItemData) triple.component3();
            if (tacticsInsideItemData == null) {
                return Unit.INSTANCE;
            }
            if (Intrinsics.EZpvd(botListSubItemType, TacticsUiConst.BotListSubItemType.BotSubTip.Default.KWHzl)) {
                Intrinsics.copydefault(context);
                final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(context);
                if (C33129mqd.OLrzqt((java.lang.CharSequence) tacticsInsideItemData.getDoubtTitle())) {
                    viewOnClickListenerC54939xaY.setTitle(tacticsInsideItemData.getDoubtTitle());
                }
                viewOnClickListenerC54939xaY.EZpvd(tacticsInsideItemData.getDoubtMsg());
                viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) C33070mpX.AYXKKw(C55688xof.Application.onCreate), new View.OnClickListener() { // from class: o.wGo
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // android.view.View.OnClickListener
                    public final void onClick(android.view.View view) {
                        C52305wGm.Application.AEQbTJ(viewOnClickListenerC54939xaY, view);
                    }
                });
                viewOnClickListenerC54939xaY.show();
            }
            return Unit.INSTANCE;
        }

        public static final void AEQbTJ(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
            viewOnClickListenerC54939xaY.dismiss();
        }

        /* JADX INFO: renamed from: o.wGm$Application$TaskDescription */
        public static final class TaskDescription implements View.OnClickListener {
            public final /* synthetic */ android.view.View AEQbTJ;
            public final /* synthetic */ ExpandableGridDealRecordItemData EZpvd;
            public final /* synthetic */ long KWHzl;
            public final /* synthetic */ C52305wGm OLrzqt;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public TaskDescription(android.view.View view, long j, C52305wGm c52305wGm, ExpandableGridDealRecordItemData expandableGridDealRecordItemData) {
                this.AEQbTJ = view;
                this.KWHzl = j;
                this.OLrzqt = c52305wGm;
                this.EZpvd = expandableGridDealRecordItemData;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.KWHzl || (this.AEQbTJ instanceof android.widget.Checkable)) {
                    C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                    Function1<ExpandableGridDealRecordItemData, Unit> function1OLrzqt = this.OLrzqt.OLrzqt();
                    if (function1OLrzqt != null) {
                        function1OLrzqt.invoke(this.EZpvd);
                    }
                }
            }
        }
    }
}
