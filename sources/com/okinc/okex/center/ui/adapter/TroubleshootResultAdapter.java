package com.okinc.okex.center.ui.adapter;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Checkable;
import android.widget.TextView;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.okex.center.bean.SelfServiceToolBean;
import com.okinc.okex.center.bean.enums.TransactionType;
import com.okinc.okex.center.ui.adapter.TroubleshootResultAdapter;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.AbstractC45384sol;
import o.AbstractC47442tqC;
import o.AbstractC47443tqD;
import o.AbstractC47447tqH;
import o.AbstractC5449Sd;
import o.C33070mpX;
import o.C45060sif;
import o.C45074sit;
import o.C45076siv;
import o.C45077siw;
import o.C45386son;
import o.C52761wXj;
import o.C52794wYp;
import o.C55251xgS;
import o.C55296xhK;
import o.C55298xhM;
import o.C56392yDr;
import o.C56444yFp;
import o.InterfaceC5460So;
import o.InterfaceC56387yDm;
import o.InterfaceC56445yFq;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class TroubleshootResultAdapter extends AbstractC45384sol<RecyclerView.ViewHolder> implements C45060sif.Activity {
    public final InterfaceC56387yDm AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.sig
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return TroubleshootResultAdapter.KWHzl(this.EZpvd);
        }
    });
    public TaskDescription EZpvd;
    public Activity KWHzl;

    /* JADX INFO: loaded from: classes16.dex */
    public interface Activity {
        void AEQbTJ(SelfServiceToolBean selfServiceToolBean);

        void EZpvd(@NotNull String str, @NotNull TransactionType transactionType);
    }

    public static abstract class TaskDescription {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TaskDescription OLrzqt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
        this.KWHzl = activity;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class ResultScenario {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ ResultScenario[] $VALUES;
        public static final ResultScenario TRANSFER_FOUND = new ResultScenario("TRANSFER_FOUND", 0);
        public static final ResultScenario TXID_ONLY_NO_TRANSFER = new ResultScenario("TXID_ONLY_NO_TRANSFER", 1);
        public static final ResultScenario NO_TXID_NOT_OKX_TXN = new ResultScenario("NO_TXID_NOT_OKX_TXN", 2);

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ ResultScenario[] $values() {
            return new ResultScenario[]{TRANSFER_FOUND, TXID_ONLY_NO_TRANSFER, NO_TXID_NOT_OKX_TXN};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<ResultScenario> getEntries() {
            return $ENTRIES;
        }

        private ResultScenario(String str, int i) {
        }

        static {
            ResultScenario[] resultScenarioArr$values = $values();
            $VALUES = resultScenarioArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(resultScenarioArr$values);
        }

        public static ResultScenario valueOf(String str) {
            return (ResultScenario) Enum.valueOf(ResultScenario.class, str);
        }

        public static ResultScenario[] values() {
            return (ResultScenario[]) $VALUES.clone();
        }
    }

    public final void OLrzqt(TaskDescription taskDescription) {
        if (Intrinsics.EZpvd(this.EZpvd, taskDescription)) {
            return;
        }
        this.EZpvd = taskDescription;
        notifyItemChanged(0);
    }

    public final C45060sif EZpvd() {
        return (C45060sif) this.AEQbTJ.getValue();
    }

    public static final C45060sif KWHzl(TroubleshootResultAdapter troubleshootResultAdapter) {
        C45060sif c45060sif = new C45060sif(null, 1, 0 == true ? 1 : 0);
        c45060sif.AEQbTJ(troubleshootResultAdapter);
        return c45060sif;
    }

    @Override // o.C45060sif.Activity
    public void EZpvd(SelfServiceToolBean selfServiceToolBean) {
        Activity activity = this.KWHzl;
        if (activity != null) {
            activity.AEQbTJ(selfServiceToolBean);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(@NotNull ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(viewGroup.getContext());
        if (i == ResultScenario.TRANSFER_FOUND.ordinal()) {
            AbstractC47447tqH abstractC47447tqHKWHzl = AbstractC47447tqH.KWHzl(layoutInflaterFrom, viewGroup, false);
            Intrinsics.checkNotNullExpressionValue(abstractC47447tqHKWHzl, "");
            return new StateListAnimator(this, abstractC47447tqHKWHzl);
        }
        if (i == ResultScenario.TXID_ONLY_NO_TRANSFER.ordinal()) {
            AbstractC47442tqC abstractC47442tqCOLrzqt = AbstractC47442tqC.OLrzqt(layoutInflaterFrom, viewGroup, false);
            Intrinsics.checkNotNullExpressionValue(abstractC47442tqCOLrzqt, "");
            return new Application(this, abstractC47442tqCOLrzqt);
        }
        if (i == ResultScenario.NO_TXID_NOT_OKX_TXN.ordinal()) {
            AbstractC47443tqD abstractC47443tqDCopydefault = AbstractC47443tqD.copydefault(layoutInflaterFrom, viewGroup, false);
            Intrinsics.checkNotNullExpressionValue(abstractC47443tqDCopydefault, "");
            int iOLrzqt = C33070mpX.OLrzqt(C52761wXj.StateListAnimator.AxsJAYaxsJAY);
            abstractC47443tqDCopydefault.OLrzqt.setAdapter(EZpvd());
            RecyclerView recyclerView = abstractC47443tqDCopydefault.OLrzqt;
            Context context = viewGroup.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            recyclerView.addItemDecoration(new C45386son(context, 0, 0, 0.0f, 0, 0, iOLrzqt + C55298xhM.dp2px$default(24.0f, null, 1, null), iOLrzqt, 0.0f, TypedValues.AttributesType.TYPE_PIVOT_TARGET, null));
            return new ActionBar(this, abstractC47443tqDCopydefault);
        }
        throw new IllegalArgumentException("Invalid viewType: " + i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) throws Exception {
        TaskDescription taskDescription = this.EZpvd;
        if (taskDescription instanceof C45076siv) {
            return ResultScenario.TRANSFER_FOUND.ordinal();
        }
        if (taskDescription instanceof C45077siw) {
            return ResultScenario.TXID_ONLY_NO_TRANSFER.ordinal();
        }
        if (taskDescription instanceof C45074sit) {
            return ResultScenario.NO_TXID_NOT_OKX_TXN.ordinal();
        }
        throw new Exception("Unrecognised display model: " + taskDescription);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull RecyclerView.ViewHolder viewHolder, int i) {
        Intrinsics.checkNotNullParameter(viewHolder, "");
        if (viewHolder instanceof StateListAnimator) {
            ((StateListAnimator) viewHolder).KWHzl();
        } else if (viewHolder instanceof Application) {
            ((Application) viewHolder).copydefault();
        } else if (viewHolder instanceof ActionBar) {
            ((ActionBar) viewHolder).OLrzqt();
        }
    }

    public final class StateListAnimator extends RecyclerView.ViewHolder {
        public final /* synthetic */ TroubleshootResultAdapter KWHzl;
        public final AbstractC47447tqH copydefault;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StateListAnimator(@NotNull TroubleshootResultAdapter troubleshootResultAdapter, AbstractC47447tqH abstractC47447tqH) {
            super(abstractC47447tqH.getRoot());
            Intrinsics.checkNotNullParameter(abstractC47447tqH, "");
            this.KWHzl = troubleshootResultAdapter;
            this.copydefault = abstractC47447tqH;
        }

        public final void KWHzl() {
            TaskDescription taskDescriptionOLrzqt = this.KWHzl.OLrzqt();
            C45076siv c45076siv = taskDescriptionOLrzqt instanceof C45076siv ? (C45076siv) taskDescriptionOLrzqt : null;
            if (c45076siv != null) {
                TroubleshootResultAdapter troubleshootResultAdapter = this.KWHzl;
                AbstractC47447tqH abstractC47447tqH = this.copydefault;
                abstractC47447tqH.KWHzl.setText(c45076siv.AEQbTJ());
                copydefault(c45076siv.EZpvd());
                abstractC47447tqH.gEmmrt.setText(c45076siv.OLrzqt());
                abstractC47447tqH.gEmmrt.setEnabled(c45076siv.KWHzl());
                abstractC47447tqH.djBIcL.setText(c45076siv.copydefault());
                C55251xgS c55251xgS = abstractC47447tqH.djBIcL;
                Intrinsics.checkNotNullExpressionValue(c55251xgS, "");
                String strCopydefault = c45076siv.copydefault();
                c55251xgS.setVisibility((strCopydefault == null || !(StringsKt__StringsKt.fARcdN((CharSequence) strCopydefault) ^ true)) ? 8 : 0);
                abstractC47447tqH.valueOf.setText(c45076siv.AhwBna());
                abstractC47447tqH.AkhnZx.setText(c45076siv.gEmmrt());
                abstractC47447tqH.values.setText(c45076siv.AYXKKw());
                TextView textView = abstractC47447tqH.copydefault;
                textView.setOnClickListener(new TaskDescription(textView, 1000L, troubleshootResultAdapter, c45076siv));
            }
        }

        private final void copydefault(String str) {
            if (!StringsKt__StringsKt.fARcdN((CharSequence) str)) {
                int iDp2px$default = C55298xhM.dp2px$default(24.0f, null, 1, null);
                AbstractC47447tqH abstractC47447tqH = this.copydefault;
            }
        }

        public static final class Activity extends AbstractC5449Sd<Drawable> {
            public final /* synthetic */ AbstractC47447tqH copydefault;

            @Override // o.InterfaceC5462Sq
            public void a_(Drawable drawable) {
            }

            public Activity(AbstractC47447tqH abstractC47447tqH) {
                this.copydefault = abstractC47447tqH;
            }

            /* JADX DEBUG: Method merged with bridge method: copydefault(Ljava/lang/Object;Lo/So;)V */
            @Override // o.InterfaceC5462Sq
            /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
            public void copydefault(Drawable drawable, InterfaceC5460So<? super Drawable> interfaceC5460So) {
                Intrinsics.checkNotNullParameter(drawable, "");
                TextView textView = this.copydefault.KWHzl;
                Intrinsics.checkNotNullExpressionValue(textView, "");
                if (!C55296xhK.AEQbTJ(textView)) {
                    this.copydefault.KWHzl.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
                } else {
                    this.copydefault.KWHzl.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, drawable, (Drawable) null);
                }
            }
        }

        public static final class TaskDescription implements View.OnClickListener {
            public final /* synthetic */ TroubleshootResultAdapter AEQbTJ;
            public final /* synthetic */ C45076siv KWHzl;
            public final /* synthetic */ View OLrzqt;
            public final /* synthetic */ long copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public TaskDescription(View view, long j, TroubleshootResultAdapter troubleshootResultAdapter, C45076siv c45076siv) {
                this.OLrzqt = view;
                this.copydefault = j;
                this.AEQbTJ = troubleshootResultAdapter;
                this.KWHzl = c45076siv;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.copydefault || (this.OLrzqt instanceof Checkable)) {
                    C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                    Activity activity = this.AEQbTJ.KWHzl;
                    if (activity != null) {
                        activity.EZpvd(this.KWHzl.djBIcL(), this.KWHzl.valueOf());
                    }
                }
            }
        }
    }

    public final class Application extends RecyclerView.ViewHolder {
        public final AbstractC47442tqC AEQbTJ;
        public final /* synthetic */ TroubleshootResultAdapter OLrzqt;

        /* JADX INFO: renamed from: com.okinc.okex.center.ui.adapter.TroubleshootResultAdapter$Application$Application, reason: collision with other inner class name */
        public static final class ViewOnClickListenerC0537Application implements View.OnClickListener {
            public final /* synthetic */ C45077siw AEQbTJ;
            public final /* synthetic */ long EZpvd;
            public final /* synthetic */ View KWHzl;
            public final /* synthetic */ TroubleshootResultAdapter OLrzqt;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public ViewOnClickListenerC0537Application(View view, long j, TroubleshootResultAdapter troubleshootResultAdapter, C45077siw c45077siw) {
                this.KWHzl = view;
                this.EZpvd = j;
                this.OLrzqt = troubleshootResultAdapter;
                this.AEQbTJ = c45077siw;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.EZpvd || (this.KWHzl instanceof Checkable)) {
                    C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                    Activity activity = this.OLrzqt.KWHzl;
                    if (activity != null) {
                        activity.AEQbTJ(this.AEQbTJ.KWHzl());
                    }
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Application(@NotNull TroubleshootResultAdapter troubleshootResultAdapter, AbstractC47442tqC abstractC47442tqC) {
            super(abstractC47442tqC.getRoot());
            Intrinsics.checkNotNullParameter(abstractC47442tqC, "");
            this.OLrzqt = troubleshootResultAdapter;
            this.AEQbTJ = abstractC47442tqC;
        }

        public final void copydefault() {
            TaskDescription taskDescriptionOLrzqt = this.OLrzqt.OLrzqt();
            C45077siw c45077siw = taskDescriptionOLrzqt instanceof C45077siw ? (C45077siw) taskDescriptionOLrzqt : null;
            if (c45077siw != null) {
                TroubleshootResultAdapter troubleshootResultAdapter = this.OLrzqt;
                AbstractC47442tqC abstractC47442tqC = this.AEQbTJ;
                abstractC47442tqC.copydefault.setText(c45077siw.EZpvd());
                abstractC47442tqC.AEQbTJ.setText(c45077siw.OLrzqt());
                abstractC47442tqC.EZpvd.setText(c45077siw.AEQbTJ());
                if (c45077siw.KWHzl() != null) {
                    abstractC47442tqC.KWHzl.setText(c45077siw.KWHzl().getTitle());
                    C52794wYp c52794wYp = abstractC47442tqC.KWHzl;
                    c52794wYp.setOnClickListener(new ViewOnClickListenerC0537Application(c52794wYp, 1000L, troubleshootResultAdapter, c45077siw));
                    C52794wYp c52794wYp2 = abstractC47442tqC.KWHzl;
                    Intrinsics.checkNotNullExpressionValue(c52794wYp2, "");
                    c52794wYp2.setVisibility(0);
                    return;
                }
                C52794wYp c52794wYp3 = abstractC47442tqC.KWHzl;
                Intrinsics.checkNotNullExpressionValue(c52794wYp3, "");
                c52794wYp3.setVisibility(8);
            }
        }
    }

    public final class ActionBar extends RecyclerView.ViewHolder {
        public final AbstractC47443tqD EZpvd;
        public final /* synthetic */ TroubleshootResultAdapter OLrzqt;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ActionBar(@NotNull TroubleshootResultAdapter troubleshootResultAdapter, AbstractC47443tqD abstractC47443tqD) {
            super(abstractC47443tqD.getRoot());
            Intrinsics.checkNotNullParameter(abstractC47443tqD, "");
            this.OLrzqt = troubleshootResultAdapter;
            this.EZpvd = abstractC47443tqD;
        }

        public final void OLrzqt() {
            TaskDescription taskDescriptionOLrzqt = this.OLrzqt.OLrzqt();
            C45074sit c45074sit = taskDescriptionOLrzqt instanceof C45074sit ? (C45074sit) taskDescriptionOLrzqt : null;
            if (c45074sit != null) {
                TroubleshootResultAdapter troubleshootResultAdapter = this.OLrzqt;
                AbstractC47443tqD abstractC47443tqD = this.EZpvd;
                abstractC47443tqD.EZpvd.setText(c45074sit.EZpvd());
                abstractC47443tqD.KWHzl.setText(c45074sit.copydefault());
                troubleshootResultAdapter.EZpvd().OLrzqt(c45074sit.AEQbTJ());
            }
        }
    }
}
