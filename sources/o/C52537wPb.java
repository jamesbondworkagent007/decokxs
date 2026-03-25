package o;

import android.view.View;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.unify_trade.bot.data.DcaDetailsData;
import com.okinc.unify_trade.bot.data.TransDetailsData;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import o.C52761wXj;
import o.C55688xof;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wPb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C52537wPb extends AbstractC59533zio<DcaDetailsData, StateListAnimator> {
    public final Function2<java.lang.String, java.lang.String, Unit> EZpvd;
    public final Function1<java.lang.String, Unit> KWHzl;

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function2<? super java.lang.String, ? super java.lang.String, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public C52537wPb(@NotNull Function1<? super java.lang.String, Unit> function1, @NotNull Function2<? super java.lang.String, ? super java.lang.String, Unit> function2) {
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function2, "");
        this.KWHzl = function1;
        this.EZpvd = function2;
    }

    /* JADX INFO: renamed from: o.wPb$StateListAnimator */
    public final class StateListAnimator extends RecyclerView.ViewHolder {
        public final C50823vbS EZpvd;
        public final /* synthetic */ C52537wPb copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C50823vbS copydefault() {
            return this.EZpvd;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StateListAnimator(@NotNull C52537wPb c52537wPb, C50823vbS c50823vbS) {
            super(c50823vbS.getRoot());
            Intrinsics.checkNotNullParameter(c50823vbS, "");
            this.copydefault = c52537wPb;
            this.EZpvd = c50823vbS;
        }
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public StateListAnimator onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        C50823vbS c50823vbSCopydefault = C50823vbS.copydefault(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c50823vbSCopydefault, "");
        return new StateListAnimator(this, c50823vbSCopydefault);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull StateListAnimator stateListAnimator, @NotNull DcaDetailsData dcaDetailsData) {
        Intrinsics.checkNotNullParameter(stateListAnimator, "");
        Intrinsics.checkNotNullParameter(dcaDetailsData, "");
        C50823vbS c50823vbSCopydefault = stateListAnimator.copydefault();
        c50823vbSCopydefault.EZpvd.setText(dcaDetailsData.getCycleIdText());
        c50823vbSCopydefault.AYXKKw.setText(dcaDetailsData.getCreateTime());
        EZpvd(c50823vbSCopydefault, dcaDetailsData);
        android.content.Context context = c50823vbSCopydefault.getRoot().getContext();
        C59534zip c59534zip = new C59534zip();
        c59534zip.register(C57637ymF.class, new C57634ymC(null, 1, null));
        Intrinsics.copydefault(context);
        c59534zip.register(TransDetailsData.class, new wOT(context, new Function2() { // from class: o.wOZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C52537wPb.copydefault(this.KWHzl, (java.lang.String) obj, (java.lang.String) obj2);
            }
        }));
        c50823vbSCopydefault.copydefault.setLayoutManager(new LinearLayoutManager(context));
        c50823vbSCopydefault.copydefault.setAdapter(c59534zip);
        LinearLayoutCompat linearLayoutCompat = c50823vbSCopydefault.djBIcL;
        linearLayoutCompat.setOnClickListener(new Application(linearLayoutCompat, 1000L, this, dcaDetailsData));
        C55353xiO c55353xiO = c50823vbSCopydefault.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(c55353xiO, "");
        int i = 0;
        c55353xiO.setVisibility(dcaDetailsData.getShowLoading() ? 0 : 8);
        if (dcaDetailsData.getShowLoading()) {
            c50823vbSCopydefault.OLrzqt.setAnimationFromUrl(uLQ.Companion.EZpvd().AhwBna());
        }
        java.util.List<TransDetailsData> detailsData = dcaDetailsData.getDetailsData();
        if (detailsData != null) {
            KWHzl(c59534zip, context, detailsData);
        }
        OLrzqt(c50823vbSCopydefault, dcaDetailsData.isDetailsVisible());
        android.view.View view = c50823vbSCopydefault.AhwBna;
        try {
            int bindingAdapterPosition = stateListAnimator.getBindingAdapterPosition();
            java.util.List<?> items = getAdapter().getItems();
            Intrinsics.checkNotNullExpressionValue(items, "");
            if (bindingAdapterPosition == yDY.AuCTel(items)) {
                i = 4;
            }
        } catch (java.lang.Exception unused) {
        }
        view.setVisibility(i);
    }

    public static final Unit copydefault(C52537wPb c52537wPb, java.lang.String str, java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        c52537wPb.EZpvd.invoke(str, str2);
        return Unit.INSTANCE;
    }

    public final void OLrzqt(C50823vbS c50823vbS, boolean z) {
        c50823vbS.gEmmrt.setRotation(z ? 180.0f : 0.0f);
        RecyclerView recyclerView = c50823vbS.copydefault;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "");
        recyclerView.setVisibility(z ? 0 : 8);
    }

    public final void KWHzl(C59534zip c59534zip, android.content.Context context, java.util.List<? extends TransDetailsData> list) {
        C57636ymE.refreshDataOrEmpty$default(c59534zip, context, list, C33070mpX.AYXKKw(C48033uCm.Fragment.hlkKmr), 0.0f, 8, (java.lang.Object) null);
    }

    public final void EZpvd(C50823vbS c50823vbS, DcaDetailsData dcaDetailsData) {
        android.widget.TextView textView = c50823vbS.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        textView.setVisibility(dcaDetailsData.isPendingSell() ^ true ? 0 : 8);
        if (dcaDetailsData.isPendingSell()) {
            c50823vbS.KWHzl.setText(C55688xof.Application.OBJEWx);
            c50823vbS.KWHzl.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.fdOvFl));
        } else {
            c50823vbS.AEQbTJ.setText(dcaDetailsData.getProfit());
            c50823vbS.KWHzl.setText(dcaDetailsData.getProfitRatio());
            c50823vbS.AEQbTJ.setTextColor(dcaDetailsData.getProfitColor());
            c50823vbS.KWHzl.setTextColor(dcaDetailsData.getProfitColor());
        }
    }

    /* JADX INFO: renamed from: o.wPb$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ C52537wPb EZpvd;
        public final /* synthetic */ DcaDetailsData KWHzl;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, C52537wPb c52537wPb, DcaDetailsData dcaDetailsData) {
            this.copydefault = view;
            this.AEQbTJ = j;
            this.EZpvd = c52537wPb;
            this.KWHzl = dcaDetailsData;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.AEQbTJ || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                this.EZpvd.KWHzl.invoke(this.KWHzl.getCycleId());
            }
        }
    }
}
