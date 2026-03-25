package o;

import android.view.View;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.okex.feedback.FeedbackHistoryContentFragment$initViewModel$1$2;
import com.okinc.okex.feedback.FeedbackHistoryContentFragment$requestData$1;
import com.okinc.okex.feedback.FeedbackStatus;
import com.okinc.okex.feedback.net.bean.LoopholeListResp;
import com.okinc.okex.feedback.net.bean.LoopholeResp;
import com.okinc.okex.feedback.viewmodel.FeedbackListViewModel;
import com.okinc.uilab.view.OKSortTextView;
import java.util.Date;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.C45552ssG;
import o.C47315tni;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ssG, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C45552ssG extends AbstractC45609stK {
    public final InterfaceC56387yDm OLrzqt;
    public java.lang.Integer djBIcL;
    public AbstractC47375top gEmmrt;
    public final int EZpvd = C47315tni.ActionBar.gHZMYf;
    public final InterfaceC56387yDm KWHzl = C56392yDr.copydefault(new Function0() { // from class: o.ssK
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C45552ssG.valueOf(this.copydefault);
        }
    });
    public final java.util.ArrayList<LoopholeResp> AEQbTJ = new java.util.ArrayList<>();
    public int copydefault = 1;
    public int AYXKKw = 20;

    /* JADX INFO: renamed from: o.ssG$ActionBar */
    public static final /* synthetic */ class ActionBar implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.EZpvd = function1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean equals(java.lang.Object obj) {
            if ((obj instanceof Observer) && (obj instanceof InterfaceC56514yIe)) {
                return Intrinsics.EZpvd(getFunctionDelegate(), ((InterfaceC56514yIe) obj).getFunctionDelegate());
            }
            return false;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC56514yIe
        public final InterfaceC56388yDn<?> getFunctionDelegate() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(java.lang.Object obj) {
            this.EZpvd.invoke(obj);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return this.EZpvd;
    }

    @Override // o.AbstractC32998moE
    public void onInvisible() {
    }

    public C45552ssG() {
        final Function0 function0 = null;
        this.OLrzqt = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(FeedbackListViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.okex.feedback.FeedbackHistoryContentFragment$special$$inlined$activityViewModels$default$1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                ViewModelStore viewModelStore = this.requireActivity().getViewModelStore();
                Intrinsics.checkNotNullExpressionValue(viewModelStore, "");
                return viewModelStore;
            }
        }, new Function0<CreationExtras>() { // from class: com.okinc.okex.feedback.FeedbackHistoryContentFragment$special$$inlined$activityViewModels$default$2
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function02 = function0;
                if (function02 != null && (creationExtras = (CreationExtras) function02.invoke()) != null) {
                    return creationExtras;
                }
                CreationExtras defaultViewModelCreationExtras = this.requireActivity().getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "");
                return defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.okex.feedback.FeedbackHistoryContentFragment$special$$inlined$activityViewModels$default$3
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory = this.requireActivity().getDefaultViewModelProviderFactory();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "");
                return defaultViewModelProviderFactory;
            }
        });
    }

    public final FeedbackListViewModel AEQbTJ() {
        return (FeedbackListViewModel) this.OLrzqt.getValue();
    }

    public final java.util.ArrayList<FeedbackStatus> AYXKKw() {
        return (java.util.ArrayList) this.KWHzl.getValue();
    }

    public static final java.util.ArrayList valueOf(C45552ssG c45552ssG) {
        if (c45552ssG.fetchVPNInfo() == 0) {
            return yDY.copydefault(FeedbackStatus.ALL, FeedbackStatus.SUBMITTED, FeedbackStatus.PENDING, FeedbackStatus.REVIEWING_FEEDBACK, FeedbackStatus.DECLINED, FeedbackStatus.PENDING_YOUR_APPROVAL, FeedbackStatus.YOU_REJECTED_THE_RESULT, FeedbackStatus.TO_BE_REWARDED, FeedbackStatus.REWARDED);
        }
        return yDY.copydefault(FeedbackStatus.ALL, FeedbackStatus.SUBMITTED, FeedbackStatus.PENDING, FeedbackStatus.REVIEWING_BUG, FeedbackStatus.DECLINED, FeedbackStatus.TO_BE_REWARDED, FeedbackStatus.REWARDED);
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        final AbstractC47375top abstractC47375topOLrzqt = AbstractC47375top.OLrzqt(view);
        this.gEmmrt = abstractC47375topOLrzqt;
        if (abstractC47375topOLrzqt != null) {
            C6989aZl c6989aZl = abstractC47375topOLrzqt.KWHzl;
            c6989aZl.setDyDrawable(C47315tni.Application.OLrzqt, true);
            c6989aZl.setDyTextColor(C47315tni.Activity.AhwBna, true);
            java.util.ArrayList<FeedbackStatus> arrayListAYXKKw = AYXKKw();
            java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(arrayListAYXKKw, 10));
            java.util.Iterator<T> it = arrayListAYXKKw.iterator();
            while (it.hasNext()) {
                arrayList.add(C33070mpX.AYXKKw(((FeedbackStatus) it.next()).getText()));
            }
            c6989aZl.setFilterData(arrayList, KWHzl(), new Function1() { // from class: o.ssL
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C45552ssG.KWHzl(this.copydefault, ((java.lang.Integer) obj).intValue());
                }
            });
            abstractC47375topOLrzqt.AEQbTJ.setSortType(OKSortTextView.SortType.DOWN, false);
            abstractC47375topOLrzqt.AEQbTJ.setOnClickListener(new View.OnClickListener() { // from class: o.ssM
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view2) {
                    C45552ssG.KWHzl(this.KWHzl, abstractC47375topOLrzqt, view2);
                }
            });
            RecyclerView recyclerView = abstractC47375topOLrzqt.EZpvd;
            C59534zip c59534zip = new C59534zip();
            c59534zip.register(LoopholeResp.class, new StateListAnimator());
            recyclerView.setAdapter(c59534zip);
            abstractC47375topOLrzqt.copydefault.setNoMoreDataEffective(true);
            abstractC47375topOLrzqt.copydefault.OLrzqt((InterfaceC57901yrE) new Application());
        }
        java.lang.Integer numGEmmrt = gEmmrt();
        if (numGEmmrt == null || numGEmmrt.intValue() != -1) {
            this.djBIcL = numGEmmrt;
        }
        AkhnZx();
    }

    public static final Unit KWHzl(C45552ssG c45552ssG, int i) {
        c45552ssG.djBIcL = i == 0 ? null : java.lang.Integer.valueOf(c45552ssG.AYXKKw().get(i).getStatus());
        requestData$default(c45552ssG, false, 1, null);
        return Unit.INSTANCE;
    }

    public static final void KWHzl(C45552ssG c45552ssG, AbstractC47375top abstractC47375top, android.view.View view) {
        if (c45552ssG.copydefault == 1) {
            c45552ssG.copydefault = 0;
            abstractC47375top.AEQbTJ.setSortType(OKSortTextView.SortType.UP, false);
        } else {
            c45552ssG.copydefault = 1;
            abstractC47375top.AEQbTJ.setSortType(OKSortTextView.SortType.DOWN, false);
        }
        requestData$default(c45552ssG, false, 1, null);
    }

    /* JADX INFO: renamed from: o.ssG$StateListAnimator */
    /* JADX INFO: loaded from: classes19.dex */
    public static final class StateListAnimator extends AbstractC59533zio<LoopholeResp, RecyclerView.ViewHolder> {
        public StateListAnimator() {
        }

        /* JADX INFO: renamed from: o.ssG$StateListAnimator$Activity */
        public static final class Activity extends RecyclerView.ViewHolder {
            public Activity(android.view.View view) {
                super(view);
            }
        }

        @Override // o.AbstractC59533zio
        public RecyclerView.ViewHolder onCreateViewHolder(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup) {
            Intrinsics.checkNotNullParameter(layoutInflater, "");
            Intrinsics.checkNotNullParameter(viewGroup, "");
            return new Activity(layoutInflater.inflate(C47315tni.ActionBar.iRxXKY, viewGroup, false));
        }

        /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
        @Override // o.AbstractC59533zio
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, final LoopholeResp loopholeResp) {
            Intrinsics.checkNotNullParameter(viewHolder, "");
            Intrinsics.checkNotNullParameter(loopholeResp, "");
            ((android.widget.TextView) viewHolder.itemView.findViewById(C47315tni.TaskDescription.gGvvIC)).setText(C45552ssG.this.copydefault(loopholeResp.getCreateTime()));
            ((android.widget.TextView) viewHolder.itemView.findViewById(C47315tni.TaskDescription.DPHOMC)).setText(loopholeResp.getTitle());
            android.view.View viewFindViewById = viewHolder.itemView.findViewById(C47315tni.TaskDescription.ggKfIT);
            C45552ssG c45552ssG = C45552ssG.this;
            android.widget.TextView textView = (android.widget.TextView) viewFindViewById;
            textView.setText(c45552ssG.copydefault(loopholeResp.getStatus()));
            textView.setTextColor(c45552ssG.EZpvd(loopholeResp.getStatus()));
            android.view.View view = viewHolder.itemView;
            final C45552ssG c45552ssG2 = C45552ssG.this;
            view.setOnClickListener(new View.OnClickListener() { // from class: o.ssN
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view2) {
                    C45552ssG.StateListAnimator.OLrzqt(c45552ssG2, loopholeResp, view2);
                }
            });
            android.view.View viewFindViewById2 = viewHolder.itemView.findViewById(C47315tni.TaskDescription.copydefault);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "");
            C33054mpH.setBooleanVisibility$default(viewFindViewById2, loopholeResp.getStatus() == 6, false, 2, null);
            android.widget.TextView textView2 = (android.widget.TextView) viewHolder.itemView.findViewById(C47315tni.TaskDescription.iUnTnt);
            C45552ssG c45552ssG3 = C45552ssG.this;
            java.lang.String rewardAmount = loopholeResp.getRewardAmount();
            textView2.setText(c45552ssG3.KWHzl(rewardAmount != null ? rewardAmount : ""));
            C52794wYp c52794wYp = (C52794wYp) viewHolder.itemView.findViewById(C47315tni.TaskDescription.fGQ);
            final C45552ssG c45552ssG4 = C45552ssG.this;
            c52794wYp.setOnClickListener(new View.OnClickListener() { // from class: o.ssJ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view2) {
                    C45552ssG.StateListAnimator.AEQbTJ(c45552ssG4, loopholeResp, view2);
                }
            });
            C52794wYp c52794wYp2 = (C52794wYp) viewHolder.itemView.findViewById(C47315tni.TaskDescription.AYXKKw);
            final C45552ssG c45552ssG5 = C45552ssG.this;
            c52794wYp2.setOnClickListener(new View.OnClickListener() { // from class: o.ssP
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view2) {
                    C45552ssG.StateListAnimator.AYXKKw(c45552ssG5, loopholeResp, view2);
                }
            });
        }

        public static final void OLrzqt(C45552ssG c45552ssG, LoopholeResp loopholeResp, android.view.View view) {
            c45552ssG.EZpvd(loopholeResp.getId(), loopholeResp.getTitle());
        }

        public static final void AEQbTJ(C45552ssG c45552ssG, LoopholeResp loopholeResp, android.view.View view) {
            c45552ssG.OLrzqt(loopholeResp.getId(), loopholeResp.getTitle());
            C32866mlf.EZpvd("app_support_feedback_reject_click", new TrackChannel[]{TrackChannel.All}, (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.ssQ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C45552ssG.StateListAnimator.OLrzqt((EventParamsList) obj);
                }
            });
        }

        public static final Unit OLrzqt(EventParamsList eventParamsList) {
            Intrinsics.checkNotNullParameter(eventParamsList, "");
            eventParamsList.put("origin", "History page", true);
            return Unit.INSTANCE;
        }

        public static final void AYXKKw(C45552ssG c45552ssG, LoopholeResp loopholeResp, android.view.View view) {
            c45552ssG.copydefault(loopholeResp.getId(), loopholeResp.getTitle());
            C32866mlf.EZpvd("app_support_feedback_approve_click", new TrackChannel[]{TrackChannel.All}, (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.ssO
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C45552ssG.StateListAnimator.EZpvd((EventParamsList) obj);
                }
            });
        }

        public static final Unit EZpvd(EventParamsList eventParamsList) {
            Intrinsics.checkNotNullParameter(eventParamsList, "");
            eventParamsList.put("origin", "History page", true);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: o.ssG$Application */
    public static final class Application implements InterfaceC57901yrE {
        public Application() {
        }

        @Override // o.InterfaceC57903yrG
        public void copydefault(InterfaceC57934yrl interfaceC57934yrl) {
            Intrinsics.checkNotNullParameter(interfaceC57934yrl, "");
            C45552ssG.requestData$default(C45552ssG.this, false, 1, null);
        }

        @Override // o.InterfaceC57900yrD
        public void EZpvd(InterfaceC57934yrl interfaceC57934yrl) {
            Intrinsics.checkNotNullParameter(interfaceC57934yrl, "");
            C45552ssG.this.AEQbTJ(false);
        }
    }

    private final void AkhnZx() {
        FeedbackListViewModel feedbackListViewModelAEQbTJ = AEQbTJ();
        feedbackListViewModelAEQbTJ.EZpvd().observe(this, new ActionBar(new Function1() { // from class: o.ssE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C45552ssG.OLrzqt(this.EZpvd, (FeedbackListViewModel.ActionBar) obj);
            }
        }));
        LifecycleOwnerKt.getLifecycleScope(this).launchWhenStarted(new FeedbackHistoryContentFragment$initViewModel$1$2(feedbackListViewModelAEQbTJ, this, null));
        requestData$default(this, false, 1, null);
    }

    public static final Unit OLrzqt(C45552ssG c45552ssG, FeedbackListViewModel.ActionBar actionBar) {
        if (c45552ssG.fetchVPNInfo() == 1) {
            return Unit.INSTANCE;
        }
        Intrinsics.copydefault(actionBar);
        c45552ssG.AEQbTJ(actionBar);
        return Unit.INSTANCE;
    }

    public final int KWHzl() {
        java.lang.Integer numGEmmrt = gEmmrt();
        if (numGEmmrt == null || numGEmmrt.intValue() == -1 || fetchVPNInfo() != 0) {
            return 0;
        }
        return numGEmmrt.intValue() - 1;
    }

    public final java.lang.Integer gEmmrt() {
        android.os.Bundle arguments = getArguments();
        if (arguments != null) {
            return java.lang.Integer.valueOf(arguments.getInt("status"));
        }
        return null;
    }

    public final java.lang.String KWHzl(java.lang.String str) {
        return C33069mpW.copydefault(this, C47315tni.PendingIntent.sTzBva, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("rewardAmount", str)));
    }

    public final java.lang.String copydefault(long j) {
        return pTA.formatSimpleDate$default(new Date(j), null, 1, null);
    }

    public final java.lang.String copydefault(int i) {
        java.lang.String strAYXKKw;
        FeedbackStatus feedbackStatusEZpvd = FeedbackStatus.Companion.EZpvd(i);
        return (feedbackStatusEZpvd == null || (strAYXKKw = C33070mpX.AYXKKw(feedbackStatusEZpvd.getText())) == null) ? "" : strAYXKKw;
    }

    public final int EZpvd(int i) {
        FeedbackStatus feedbackStatusEZpvd = FeedbackStatus.Companion.EZpvd(i);
        if (feedbackStatusEZpvd != null) {
            return C33070mpX.copydefault(feedbackStatusEZpvd.getColor());
        }
        return 0;
    }

    private final int fetchVPNInfo() {
        android.os.Bundle arguments = getArguments();
        if (arguments != null) {
            return arguments.getInt("type");
        }
        return 0;
    }

    public final int valueOf() {
        return fetchVPNInfo() == 0 ? 1 : 2;
    }

    public final void AEQbTJ(FeedbackListViewModel.ActionBar actionBar) {
        LoopholeResp loopholeRespPrevious;
        java.util.ArrayList<LoopholeResp> arrayList = this.AEQbTJ;
        java.util.ListIterator<LoopholeResp> listIterator = arrayList.listIterator(arrayList.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                loopholeRespPrevious = null;
                break;
            } else {
                loopholeRespPrevious = listIterator.previous();
                if (loopholeRespPrevious.getId() == actionBar.EZpvd()) {
                    break;
                }
            }
        }
        LoopholeResp loopholeResp = loopholeRespPrevious;
        if (loopholeResp != null) {
            if (this.djBIcL == null) {
                loopholeResp.setStatus(actionBar.AEQbTJ());
            } else {
                this.AEQbTJ.remove(loopholeResp);
            }
            AbstractC47375top abstractC47375top = this.gEmmrt;
            if (abstractC47375top != null) {
                if (this.AEQbTJ.isEmpty()) {
                    C33546myW c33546myW = abstractC47375top.copydefault;
                    Intrinsics.checkNotNullExpressionValue(c33546myW, "");
                    c33546myW.setVisibility(8);
                    android.widget.RelativeLayout relativeLayout = abstractC47375top.OLrzqt;
                    Intrinsics.checkNotNullExpressionValue(relativeLayout, "");
                    relativeLayout.setVisibility(0);
                    return;
                }
                C33546myW c33546myW2 = abstractC47375top.copydefault;
                Intrinsics.checkNotNullExpressionValue(c33546myW2, "");
                c33546myW2.setVisibility(0);
                android.widget.RelativeLayout relativeLayout2 = abstractC47375top.OLrzqt;
                Intrinsics.checkNotNullExpressionValue(relativeLayout2, "");
                relativeLayout2.setVisibility(8);
                RecyclerView.Adapter adapter = abstractC47375top.EZpvd.getAdapter();
                if (adapter != null) {
                    adapter.notifyDataSetChanged();
                }
            }
        }
    }

    public static /* synthetic */ void requestData$default(C45552ssG c45552ssG, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        c45552ssG.AEQbTJ(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void AEQbTJ(boolean z) {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new FeedbackHistoryContentFragment$requestData$1(this, z, null), 3, null);
    }

    public final void EZpvd() {
        AbstractC47375top abstractC47375top = this.gEmmrt;
        if (abstractC47375top != null) {
            C33546myW c33546myW = abstractC47375top.copydefault;
            Intrinsics.checkNotNullExpressionValue(c33546myW, "");
            c33546myW.setVisibility(8);
            android.widget.RelativeLayout relativeLayout = abstractC47375top.OLrzqt;
            Intrinsics.checkNotNullExpressionValue(relativeLayout, "");
            relativeLayout.setVisibility(0);
        }
    }

    public final void OLrzqt(LoopholeListResp loopholeListResp, boolean z) {
        AbstractC47375top abstractC47375top = this.gEmmrt;
        if (abstractC47375top != null) {
            C33546myW c33546myW = abstractC47375top.copydefault;
            Intrinsics.checkNotNullExpressionValue(c33546myW, "");
            c33546myW.setVisibility(0);
            android.widget.RelativeLayout relativeLayout = abstractC47375top.OLrzqt;
            Intrinsics.checkNotNullExpressionValue(relativeLayout, "");
            relativeLayout.setVisibility(8);
            if (z) {
                this.AEQbTJ.clear();
            }
            this.AEQbTJ.addAll(loopholeListResp.getList());
            abstractC47375top.copydefault.AEQbTJ();
            if (this.AEQbTJ.size() == loopholeListResp.getTotal()) {
                abstractC47375top.copydefault.AYXKKw();
            } else {
                abstractC47375top.copydefault.valueOf();
                abstractC47375top.copydefault.copydefault();
            }
            RecyclerView.Adapter adapter = abstractC47375top.EZpvd.getAdapter();
            C59534zip c59534zip = adapter instanceof C59534zip ? (C59534zip) adapter : null;
            if (c59534zip != null) {
                c59534zip.setItems(this.AEQbTJ);
                c59534zip.notifyDataSetChanged();
            }
        }
    }

    public final void OLrzqt() {
        AbstractC47375top abstractC47375top = this.gEmmrt;
        if (abstractC47375top != null) {
            C33546myW c33546myW = abstractC47375top.copydefault;
            c33546myW.AEQbTJ();
            c33546myW.valueOf();
            Intrinsics.copydefault(c33546myW);
            c33546myW.setVisibility(8);
            android.widget.RelativeLayout relativeLayout = abstractC47375top.OLrzqt;
            Intrinsics.checkNotNullExpressionValue(relativeLayout, "");
            relativeLayout.setVisibility(0);
        }
    }

    public final void EZpvd(int i, java.lang.String str) {
        C45563ssR c45563ssR = new C45563ssR();
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt("id", i);
        bundle.putString("title", str);
        bundle.putInt("type", fetchVPNInfo());
        c45563ssR.setArguments(bundle);
        c45563ssR.show(getChildFragmentManager(), C45563ssR.class.getSimpleName());
    }

    public final void copydefault(int i, java.lang.String str) {
        C45576sse c45576sse = new C45576sse();
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt("id", i);
        bundle.putString("title", str);
        c45576sse.setArguments(bundle);
        c45576sse.show(getChildFragmentManager(), C45576sse.class.getSimpleName());
    }

    public final void OLrzqt(int i, java.lang.String str) {
        C45625sta c45625sta = new C45625sta();
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt("id", i);
        bundle.putString("title", str);
        c45625sta.setArguments(bundle);
        androidx.fragment.app.FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        c45625sta.show(childFragmentManager, C45625sta.class.getSimpleName());
    }

    @Override // o.AbstractC32998moE
    public void onVisible() {
        if (fetchVPNInfo() == 0) {
            TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
            C32866mlf.onEvent$default("app_support_feedback_history_view", (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1) null, 2, (java.lang.Object) null);
        } else {
            TrackChannel[] trackChannelArrCopydefault2 = C32868mlh.OLrzqt.copydefault();
            C32866mlf.onEvent$default("app_support_security_bug_history_view", (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault2, trackChannelArrCopydefault2.length), (Function1) null, 2, (java.lang.Object) null);
        }
    }
}
