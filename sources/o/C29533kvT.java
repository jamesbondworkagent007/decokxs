package o;

import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.okinc.business.market.features.smart_money.signal.domain.model.SignalOverviewUiModel;
import com.okinc.business.market.features.smart_money.signal.domain.model.SignalUiModel;
import com.okinc.business.market.features.smart_money.signal.ui.binder.SignalOverviewItemBinder$1;
import com.okinc.localization.util.format.DisplaySign;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import o.C29665kxt;
import o.InterfaceC29579kwM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kvT, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C29533kvT extends AbstractC25436iwg<SignalOverviewUiModel, C21600hFj> {
    public final InterfaceC29581kwO KWHzl;
    public final InterfaceC29538kvY OLrzqt;
    public final java.lang.String copydefault;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29533kvT(InterfaceC29581kwO interfaceC29581kwO, InterfaceC29538kvY interfaceC29538kvY, @NotNull java.lang.String str) {
        super(SignalOverviewItemBinder$1.INSTANCE);
        Intrinsics.checkNotNullParameter(str, "");
        this.KWHzl = interfaceC29581kwO;
        this.OLrzqt = interfaceC29538kvY;
        this.copydefault = str;
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull C25435iwf<C21600hFj> c25435iwf, @NotNull SignalOverviewUiModel signalOverviewUiModel) {
        Intrinsics.checkNotNullParameter(c25435iwf, "");
        Intrinsics.checkNotNullParameter(signalOverviewUiModel, "");
        copydefault(c25435iwf, signalOverviewUiModel);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;Ljava/util/List;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull C25435iwf<C21600hFj> c25435iwf, @NotNull SignalOverviewUiModel signalOverviewUiModel, @NotNull java.util.List<java.lang.Object> list) {
        Intrinsics.checkNotNullParameter(c25435iwf, "");
        Intrinsics.checkNotNullParameter(signalOverviewUiModel, "");
        Intrinsics.checkNotNullParameter(list, "");
        if (list.isEmpty()) {
            copydefault(c25435iwf, signalOverviewUiModel);
        } else {
            copydefault(c25435iwf, signalOverviewUiModel, list);
        }
    }

    public final void copydefault(@NotNull C25435iwf<C21600hFj> c25435iwf, @NotNull SignalOverviewUiModel signalOverviewUiModel) {
        Intrinsics.checkNotNullParameter(c25435iwf, "");
        Intrinsics.checkNotNullParameter(signalOverviewUiModel, "");
        C21600hFj c21600hFj = (C21600hFj) c25435iwf.EZpvd();
        android.content.Context context = c21600hFj.getRoot().getContext();
        LinearLayoutCompat root = c21600hFj.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        ViewGroup.LayoutParams layoutParams = root.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = -2;
            root.setLayoutParams(layoutParams);
            ConstraintLayout constraintLayout = c21600hFj.zsXlph;
            constraintLayout.setOnClickListener(new Activity(constraintLayout, 1000L, this, signalOverviewUiModel));
            c21600hFj.wlaJM.setNestedScrollingEnabled(false);
            Intrinsics.copydefault(context);
            C29531kvR.copydefault(c21600hFj, context, signalOverviewUiModel, this.KWHzl, this.copydefault, false);
            C29531kvR.OLrzqt(c21600hFj, signalOverviewUiModel, this.KWHzl);
            c21600hFj.fJNWhG.OLrzqt(this.KWHzl, (C29665kxt.TaskDescription) new StateListAnimator(signalOverviewUiModel), false, signalOverviewUiModel.OLrzqt().OLrzqt());
            C29531kvR.AEQbTJ(c21600hFj, context, signalOverviewUiModel);
            C29531kvR.OLrzqt(c21600hFj, context, signalOverviewUiModel, this.KWHzl, (16 & 8) != 0 ? false : false, (16 & 16) != 0 ? false : false);
            return;
        }
        throw new java.lang.NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
    }

    /* JADX INFO: renamed from: o.kvT$StateListAnimator */
    public static final class StateListAnimator implements C29665kxt.TaskDescription {
        public final /* synthetic */ SignalOverviewUiModel KWHzl;

        public StateListAnimator(SignalOverviewUiModel signalOverviewUiModel) {
            this.KWHzl = signalOverviewUiModel;
        }

        @Override // o.C29665kxt.TaskDescription
        public void copydefault() {
            InterfaceC29538kvY interfaceC29538kvY = C29533kvT.this.OLrzqt;
            if (interfaceC29538kvY != null) {
                interfaceC29538kvY.OLrzqt(this.KWHzl.valueOf(), this.KWHzl.values(), this.KWHzl.OLrzqt().AEQbTJ());
            }
        }
    }

    public final void copydefault(@NotNull C25435iwf<C21600hFj> c25435iwf, @NotNull SignalOverviewUiModel signalOverviewUiModel, @NotNull java.util.List<java.lang.Object> list) {
        Intrinsics.checkNotNullParameter(c25435iwf, "");
        Intrinsics.checkNotNullParameter(signalOverviewUiModel, "");
        Intrinsics.checkNotNullParameter(list, "");
        java.lang.Object objFirstOrNull = CollectionsKt___CollectionsKt.firstOrNull(list);
        java.util.Set setCopydefault = objFirstOrNull instanceof java.util.Set ? (java.util.Set) objFirstOrNull : null;
        if (setCopydefault == null) {
            setCopydefault = yEE.copydefault();
        }
        C21600hFj c21600hFj = (C21600hFj) c25435iwf.EZpvd();
        android.content.Context context = c21600hFj.getRoot().getContext();
        Intrinsics.copydefault(context);
        C29531kvR.copydefault(c21600hFj, context, signalOverviewUiModel, this.KWHzl, this.copydefault, false);
        if (setCopydefault.contains("chart_load_more") && signalOverviewUiModel.OLrzqt().gEmmrt()) {
            C29531kvR.copydefault(c21600hFj, context, signalOverviewUiModel);
        }
        if (setCopydefault.contains("chart")) {
            C29531kvR.OLrzqt(c21600hFj, signalOverviewUiModel, this.KWHzl);
            C29531kvR.AEQbTJ(c21600hFj, context, signalOverviewUiModel);
        }
        if (setCopydefault.contains("trend")) {
            C29531kvR.OLrzqt(c21600hFj, context, signalOverviewUiModel, this.KWHzl, (16 & 8) != 0 ? false : false, (16 & 16) != 0 ? false : true);
        }
        if (setCopydefault.contains("current")) {
            SignalUiModel signalUiModelGEmmrt = signalOverviewUiModel.gEmmrt();
            c21600hFj.giSNqX.setText(kLY.formatPercentage$default(signalOverviewUiModel.ejfBZ(), DisplaySign.AUTO, false, null, null, 14, null));
            android.content.Context context2 = c21600hFj.getRoot().getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            java.lang.String strAEQbTJ = signalOverviewUiModel.AEQbTJ();
            java.lang.String strDbNXlk = signalUiModelGEmmrt.DbNXlk();
            android.widget.TextView textView = c21600hFj.dvKsVJ;
            Intrinsics.checkNotNullExpressionValue(textView, "");
            android.widget.TextView textView2 = c21600hFj.fZBcTu;
            Intrinsics.checkNotNullExpressionValue(textView2, "");
            android.widget.ImageView imageView = c21600hFj.ejfBZ;
            Intrinsics.checkNotNullExpressionValue(imageView, "");
            C29531kvR.AEQbTJ(context2, signalOverviewUiModel, strAEQbTJ, strDbNXlk, textView, textView2, imageView);
            android.content.Context context3 = c21600hFj.getRoot().getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "");
            java.lang.String strKWHzl = signalOverviewUiModel.KWHzl();
            java.lang.String strAhwBna = signalUiModelGEmmrt.AhwBna();
            android.widget.TextView textView3 = c21600hFj.djSkpj;
            Intrinsics.checkNotNullExpressionValue(textView3, "");
            android.widget.TextView textView4 = c21600hFj.aKErDB;
            Intrinsics.checkNotNullExpressionValue(textView4, "");
            android.widget.ImageView imageView2 = c21600hFj.fetchVPNInfo;
            Intrinsics.checkNotNullExpressionValue(imageView2, "");
            C29531kvR.AEQbTJ(context3, signalOverviewUiModel, strKWHzl, strAhwBna, textView3, textView4, imageView2);
        }
    }

    /* JADX INFO: renamed from: o.kvT$Activity */
    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ C29533kvT AEQbTJ;
        public final /* synthetic */ SignalOverviewUiModel EZpvd;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, C29533kvT c29533kvT, SignalOverviewUiModel signalOverviewUiModel) {
            this.KWHzl = view;
            this.copydefault = j;
            this.AEQbTJ = c29533kvT;
            this.EZpvd = signalOverviewUiModel;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.copydefault || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                InterfaceC29581kwO interfaceC29581kwO = this.AEQbTJ.KWHzl;
                if (interfaceC29581kwO != null) {
                    interfaceC29581kwO.AEQbTJ(new InterfaceC29579kwM.ActionBar(this.EZpvd));
                }
                C29408ktA c29408ktA = C29408ktA.KWHzl;
                c29408ktA.KWHzl(this.EZpvd.fetchVPNInfo(), "card");
                c29408ktA.AYXKKw(this.EZpvd.fetchVPNInfo());
            }
        }
    }

    /* JADX DEBUG: Method merged with bridge method: onViewAttachedToWindow(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public void onViewAttachedToWindow(@NotNull C25435iwf<C21600hFj> c25435iwf) {
        Intrinsics.checkNotNullParameter(c25435iwf, "");
        super.onViewAttachedToWindow(c25435iwf);
    }

    /* JADX DEBUG: Method merged with bridge method: onViewDetachedFromWindow(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public void onViewDetachedFromWindow(@NotNull C25435iwf<C21600hFj> c25435iwf) {
        Intrinsics.checkNotNullParameter(c25435iwf, "");
        super.onViewDetachedFromWindow(c25435iwf);
    }
}
