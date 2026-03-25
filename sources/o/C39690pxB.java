package o;

import android.view.View;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.paging.LoadState;
import androidx.paging.LoadStateAdapter;
import androidx.paging.PagingDataAdapter;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.kline.ui.unlock.data.po.UnlockTokenEvent;
import com.okinc.kline.ui.unlock.ui.UnlockTokenEventListFragment$EventListAdapter$ViewHolder$bind$1;
import com.okinc.kline.ui.unlock.ui.UnlockTokenEventListFragment$initView$2;
import com.okinc.kline.ui.unlock.ui.UnlockTokenEventListFragment$initView$3;
import com.okinc.kline.ui.unlock.ui.model.CountDownTime;
import com.okinc.kline.ui.unlock.ui.model.UnlockTokenStageDataVo;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
import o.C35964oKf;
import o.C35966oKh;
import o.C39690pxB;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.pxB, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C39690pxB extends AbstractC32998moE {
    public C36098oPe KWHzl;
    public Application copydefault;
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int AEQbTJ = 8;
    public final InterfaceC56387yDm djBIcL = C56392yDr.copydefault(new Function0() { // from class: o.pxC
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C39690pxB.gEmmrt(this.EZpvd);
        }
    });
    public final InterfaceC56387yDm OLrzqt = C56392yDr.copydefault(new Function0() { // from class: o.pxz
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C39690pxB.djBIcL(this.OLrzqt);
        }
    });
    public final InterfaceC56387yDm EZpvd = C56392yDr.copydefault(new Function0() { // from class: o.pxE
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C39690pxB.AhwBna(this.copydefault);
        }
    });

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C36098oPe AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return C35964oKf.Application.DKtBnz;
    }

    @Override // o.AbstractC32998moE
    public void onInvisible() {
    }

    @Override // o.AbstractC32998moE
    public void onVisible() {
    }

    /* JADX INFO: renamed from: o.pxB$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.pxB.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final C39690pxB OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            C39690pxB c39690pxB = new C39690pxB();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("type", str2);
            bundle.putString("data", str);
            c39690pxB.setArguments(bundle);
            return c39690pxB;
        }
    }

    public final C39712pxX copydefault() {
        return (C39712pxX) this.djBIcL.getValue();
    }

    public static final C39712pxX gEmmrt(C39690pxB c39690pxB) {
        return new C39712pxX(c39690pxB.OLrzqt(), c39690pxB.EZpvd());
    }

    public final java.lang.String EZpvd() {
        return (java.lang.String) this.OLrzqt.getValue();
    }

    public static final java.lang.String djBIcL(C39690pxB c39690pxB) {
        java.lang.String string;
        android.os.Bundle arguments = c39690pxB.getArguments();
        return (arguments == null || (string = arguments.getString("type")) == null) ? "" : string;
    }

    public final java.lang.String OLrzqt() {
        return (java.lang.String) this.EZpvd.getValue();
    }

    public static final java.lang.String AhwBna(C39690pxB c39690pxB) {
        java.lang.String string;
        android.os.Bundle arguments = c39690pxB.getArguments();
        return (arguments == null || (string = arguments.getString("data")) == null) ? "" : string;
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        C36098oPe c36098oPeAEQbTJ = C36098oPe.AEQbTJ(view);
        this.KWHzl = c36098oPeAEQbTJ;
        if (c36098oPeAEQbTJ != null) {
            c36098oPeAEQbTJ.AEQbTJ.setLayoutManager(new LinearLayoutManager(view.getContext()));
            Application application = new Application(this, new ActionBar());
            this.copydefault = application;
            c36098oPeAEQbTJ.AEQbTJ.setAdapter(application.withLoadStateFooter(new TaskDescription(new Function0() { // from class: o.pxA
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C39690pxB.AYXKKw(this.KWHzl);
                }
            })));
        }
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new UnlockTokenEventListFragment$initView$2(this, null), 3, null);
        LifecycleOwnerKt.getLifecycleScope(this).launchWhenResumed(new UnlockTokenEventListFragment$initView$3(this, null));
    }

    /* JADX INFO: renamed from: o.pxB$ActionBar */
    public static final class ActionBar extends DiffUtil.ItemCallback<UnlockTokenEvent> {
        /* JADX DEBUG: Method merged with bridge method: areItemsTheSame(Ljava/lang/Object;Ljava/lang/Object;)Z */
        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public boolean areItemsTheSame(UnlockTokenEvent unlockTokenEvent, UnlockTokenEvent unlockTokenEvent2) {
            Intrinsics.checkNotNullParameter(unlockTokenEvent, "");
            Intrinsics.checkNotNullParameter(unlockTokenEvent2, "");
            return Intrinsics.EZpvd((java.lang.Object) unlockTokenEvent.getUnlockedTs(), (java.lang.Object) unlockTokenEvent2.getUnlockedTs());
        }

        /* JADX DEBUG: Method merged with bridge method: areContentsTheSame(Ljava/lang/Object;Ljava/lang/Object;)Z */
        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public boolean areContentsTheSame(UnlockTokenEvent unlockTokenEvent, UnlockTokenEvent unlockTokenEvent2) {
            Intrinsics.checkNotNullParameter(unlockTokenEvent, "");
            Intrinsics.checkNotNullParameter(unlockTokenEvent2, "");
            return Intrinsics.EZpvd((java.lang.Object) unlockTokenEvent.getUnlockedTs(), (java.lang.Object) unlockTokenEvent2.getUnlockedTs());
        }
    }

    public static final Unit AYXKKw(C39690pxB c39690pxB) {
        Application application = c39690pxB.copydefault;
        if (application != null) {
            application.retry();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void OLrzqt(C55173xeu c55173xeu) {
        c55173xeu.setSubTitle((java.lang.CharSequence) C33070mpX.AYXKKw(C35966oKh.TaskDescription.djBIcL));
        c55173xeu.setTitle(C33070mpX.AYXKKw(C35964oKf.Fragment.dpErvT));
        c55173xeu.setRetry(C33070mpX.AYXKKw(C35966oKh.TaskDescription.OLrzqt));
        c55173xeu.setRetryClickListener(new View.OnClickListener() { // from class: o.pxD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C39690pxB.EZpvd(this.OLrzqt, view);
            }
        });
    }

    public static final void EZpvd(C39690pxB c39690pxB, android.view.View view) {
        Application application = c39690pxB.copydefault;
        if (application != null) {
            application.retry();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void EZpvd(C55173xeu c55173xeu) {
        c55173xeu.setTitle(C33070mpX.AYXKKw(C35964oKf.Fragment.RJOkX));
        c55173xeu.setEmptyTypeImage(6);
    }

    @Override // androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean z) {
        super.onHiddenChanged(z);
    }

    public final void copydefault(boolean z) {
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        C36098oPe c36098oPe = this.KWHzl;
        if (c36098oPe != null && (recyclerView2 = c36098oPe.AEQbTJ) != null) {
            recyclerView2.setNestedScrollingEnabled(z);
        }
        C36098oPe c36098oPe2 = this.KWHzl;
        if (c36098oPe2 == null || (recyclerView = c36098oPe2.AEQbTJ) == null) {
            return;
        }
        recyclerView.requestLayout();
    }

    /* JADX INFO: renamed from: o.pxB$Application */
    public final class Application extends PagingDataAdapter<UnlockTokenEvent, StateListAnimator> {
        public final /* synthetic */ C39690pxB EZpvd;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Application(@NotNull C39690pxB c39690pxB, DiffUtil.ItemCallback<UnlockTokenEvent> itemCallback) {
            super(itemCallback, (CoroutineContext) null, (CoroutineContext) null, 6, (DefaultConstructorMarker) null);
            Intrinsics.checkNotNullParameter(itemCallback, "");
            this.EZpvd = c39690pxB;
        }

        /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public StateListAnimator onCreateViewHolder(@NotNull android.view.ViewGroup viewGroup, int i) {
            Intrinsics.checkNotNullParameter(viewGroup, "");
            C36110oPq c36110oPqCopydefault = C36110oPq.copydefault(android.view.LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
            Intrinsics.checkNotNullExpressionValue(c36110oPqCopydefault, "");
            return new StateListAnimator(this, c36110oPqCopydefault);
        }

        /* JADX DEBUG: Method merged with bridge method: onViewRecycled(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V */
        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public void onViewRecycled(@NotNull StateListAnimator stateListAnimator) {
            Intrinsics.checkNotNullParameter(stateListAnimator, "");
            super.onViewRecycled(stateListAnimator);
            stateListAnimator.KWHzl();
        }

        /* JADX DEBUG: Method merged with bridge method: onViewDetachedFromWindow(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V */
        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public void onViewDetachedFromWindow(@NotNull StateListAnimator stateListAnimator) {
            Intrinsics.checkNotNullParameter(stateListAnimator, "");
            super.onViewDetachedFromWindow(stateListAnimator);
            stateListAnimator.KWHzl();
        }

        /* JADX DEBUG: Method merged with bridge method: onFailedToRecycleView(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)Z */
        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public boolean onFailedToRecycleView(@NotNull StateListAnimator stateListAnimator) {
            Intrinsics.checkNotNullParameter(stateListAnimator, "");
            stateListAnimator.KWHzl();
            return super.onFailedToRecycleView(stateListAnimator);
        }

        /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V */
        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(@NotNull StateListAnimator stateListAnimator, int i) {
            Intrinsics.checkNotNullParameter(stateListAnimator, "");
            UnlockTokenEvent item = getItem(i);
            if (item != null) {
                stateListAnimator.AEQbTJ(new UnlockTokenStageDataVo(this.EZpvd.OLrzqt(), "", item.getUnlockedTs(), item.getUnlocked(), item.getPercOfUnlocked(), item.getUnlockedValue(), item.getPercOfUnlockedValue(), new CountDownTime(C33129mqd.valueOf(item.getUnlockedTs()), false, 2, null)));
            }
        }

        /* JADX INFO: renamed from: o.pxB$Application$StateListAnimator */
        public final class StateListAnimator extends RecyclerView.ViewHolder {
            public final C36110oPq AEQbTJ;
            public final /* synthetic */ Application copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final C36110oPq EZpvd() {
                return this.AEQbTJ;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public StateListAnimator(@NotNull Application application, C36110oPq c36110oPq) {
                super(c36110oPq.getRoot());
                Intrinsics.checkNotNullParameter(c36110oPq, "");
                this.copydefault = application;
                this.AEQbTJ = c36110oPq;
            }

            public final void AEQbTJ(@NotNull UnlockTokenStageDataVo unlockTokenStageDataVo) {
                Intrinsics.checkNotNullParameter(unlockTokenStageDataVo, "");
                BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this.copydefault.EZpvd), Dispatchers.getMain().getImmediate(), null, new UnlockTokenEventListFragment$EventListAdapter$ViewHolder$bind$1(this, unlockTokenStageDataVo, null), 2, null);
            }

            public final void KWHzl() {
                C39784pyq.AEQbTJ(this.AEQbTJ);
            }
        }
    }

    /* JADX INFO: renamed from: o.pxB$TaskDescription */
    public static final class TaskDescription extends LoadStateAdapter<Activity> {
        public final Function0<Unit> KWHzl;

        public TaskDescription(@NotNull Function0<Unit> function0) {
            Intrinsics.checkNotNullParameter(function0, "");
            this.KWHzl = function0;
        }

        /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/ViewGroup;Landroidx/paging/LoadState;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
        @Override // androidx.paging.LoadStateAdapter
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public Activity onCreateViewHolder(@NotNull android.view.ViewGroup viewGroup, @NotNull LoadState loadState) {
            Intrinsics.checkNotNullParameter(viewGroup, "");
            Intrinsics.checkNotNullParameter(loadState, "");
            return new Activity(viewGroup, this.KWHzl);
        }

        /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Landroidx/paging/LoadState;)V */
        @Override // androidx.paging.LoadStateAdapter
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(@NotNull Activity activity, @NotNull LoadState loadState) {
            Intrinsics.checkNotNullParameter(activity, "");
            Intrinsics.checkNotNullParameter(loadState, "");
            activity.copydefault(loadState);
        }
    }

    /* JADX INFO: renamed from: o.pxB$Activity */
    public static final class Activity extends RecyclerView.ViewHolder {
        public final C36105oPl AEQbTJ;
        public final android.widget.ProgressBar EZpvd;
        public final android.widget.TextView KWHzl;
        public final android.widget.Button OLrzqt;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Activity(@NotNull android.view.ViewGroup viewGroup, @NotNull final Function0<Unit> function0) {
            super(android.view.LayoutInflater.from(viewGroup.getContext()).inflate(C35964oKf.Application.geLlBI, viewGroup, false));
            Intrinsics.checkNotNullParameter(viewGroup, "");
            Intrinsics.checkNotNullParameter(function0, "");
            C36105oPl c36105oPlAEQbTJ = C36105oPl.AEQbTJ(this.itemView);
            Intrinsics.checkNotNullExpressionValue(c36105oPlAEQbTJ, "");
            this.AEQbTJ = c36105oPlAEQbTJ;
            android.widget.ProgressBar progressBar = c36105oPlAEQbTJ.copydefault;
            Intrinsics.checkNotNullExpressionValue(progressBar, "");
            this.EZpvd = progressBar;
            android.widget.TextView textView = c36105oPlAEQbTJ.OLrzqt;
            Intrinsics.checkNotNullExpressionValue(textView, "");
            this.KWHzl = textView;
            C52794wYp c52794wYp = c36105oPlAEQbTJ.AEQbTJ;
            c52794wYp.setOnClickListener(new View.OnClickListener() { // from class: o.pxG
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C39690pxB.Activity.EZpvd(function0, view);
                }
            });
            Intrinsics.checkNotNullExpressionValue(c52794wYp, "");
            this.OLrzqt = c52794wYp;
        }

        public static final void EZpvd(Function0 function0, android.view.View view) {
            function0.invoke();
        }

        public final void copydefault(@NotNull LoadState loadState) {
            Intrinsics.checkNotNullParameter(loadState, "");
            boolean z = loadState instanceof LoadState.Error;
            if (z) {
                this.KWHzl.setText(((LoadState.Error) loadState).getError().getLocalizedMessage());
            }
            this.EZpvd.setVisibility(loadState instanceof LoadState.Loading ? 0 : 8);
            this.OLrzqt.setVisibility(z ? 0 : 8);
            this.KWHzl.setVisibility(z ? 0 : 8);
        }
    }
}
