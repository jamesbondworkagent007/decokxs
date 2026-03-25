package o;

import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.rxutils.RxBus;
import com.okinc.uilab.edit.OKEditText;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.Bitmap;
import o.C10026bgg;
import o.C10087bho;
import o.C13754dXa;
import o.C32113mPz;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.bho, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C10087bho extends AbstractC32996moC {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int OLrzqt = 8;
    public long AEQbTJ = Long.MIN_VALUE;
    public final InterfaceC56387yDm AYXKKw;
    public final InterfaceC56387yDm EZpvd;
    public final InterfaceC56387yDm KWHzl;
    public AbstractC16684eoa copydefault;

    /* JADX INFO: renamed from: o.bho$StateListAnimator */
    public static final /* synthetic */ class StateListAnimator implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(Function1 function1) {
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
        return C13754dXa.TaskDescription.DaTmkG;
    }

    public C10087bho() {
        final Function0<androidx.fragment.app.Fragment> function0 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.business.defi.assets.coinmanagement.WalletRecentlyRemovedCoinFragment$special$$inlined$viewModels$default$1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Fragment invoke() {
                return this;
            }
        };
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(lazyThreadSafetyMode, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.business.defi.assets.coinmanagement.WalletRecentlyRemovedCoinFragment$special$$inlined$viewModels$default$2
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) function0.invoke();
            }
        });
        final Function0 function02 = null;
        this.AYXKKw = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(C10006bgM.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.defi.assets.coinmanagement.WalletRecentlyRemovedCoinFragment$special$$inlined$viewModels$default$3
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                ViewModelStore viewModelStore = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd).getViewModelStore();
                Intrinsics.checkNotNullExpressionValue(viewModelStore, "");
                return viewModelStore;
            }
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.defi.assets.coinmanagement.WalletRecentlyRemovedCoinFragment$special$$inlined$viewModels$default$4
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
                Function0 function03 = function02;
                if (function03 != null && (creationExtras = (CreationExtras) function03.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerM5735viewModels$lambda1 = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM5735viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM5735viewModels$lambda1 : null;
                CreationExtras defaultViewModelCreationExtras = hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : null;
                return defaultViewModelCreationExtras == null ? CreationExtras.Empty.INSTANCE : defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.defi.assets.coinmanagement.WalletRecentlyRemovedCoinFragment$special$$inlined$viewModels$default$5
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory;
                ViewModelStoreOwner viewModelStoreOwnerM5735viewModels$lambda1 = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM5735viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM5735viewModels$lambda1 : null;
                if (hasDefaultViewModelProviderFactory == null || (defaultViewModelProviderFactory = hasDefaultViewModelProviderFactory.getDefaultViewModelProviderFactory()) == null) {
                    defaultViewModelProviderFactory = this.getDefaultViewModelProviderFactory();
                }
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "");
                return defaultViewModelProviderFactory;
            }
        });
        final Function0<androidx.fragment.app.Fragment> function03 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.business.defi.assets.coinmanagement.WalletRecentlyRemovedCoinFragment$special$$inlined$viewModels$default$6
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Fragment invoke() {
                return this;
            }
        };
        final InterfaceC56387yDm interfaceC56387yDmEZpvd2 = C56392yDr.EZpvd(lazyThreadSafetyMode, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.business.defi.assets.coinmanagement.WalletRecentlyRemovedCoinFragment$special$$inlined$viewModels$default$7
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) function03.invoke();
            }
        });
        this.EZpvd = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(C10096bhx.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.defi.assets.coinmanagement.WalletRecentlyRemovedCoinFragment$special$$inlined$viewModels$default$8
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                ViewModelStore viewModelStore = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd2).getViewModelStore();
                Intrinsics.checkNotNullExpressionValue(viewModelStore, "");
                return viewModelStore;
            }
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.defi.assets.coinmanagement.WalletRecentlyRemovedCoinFragment$special$$inlined$viewModels$default$9
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
                Function0 function04 = function02;
                if (function04 != null && (creationExtras = (CreationExtras) function04.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerM5735viewModels$lambda1 = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd2);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM5735viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM5735viewModels$lambda1 : null;
                CreationExtras defaultViewModelCreationExtras = hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : null;
                return defaultViewModelCreationExtras == null ? CreationExtras.Empty.INSTANCE : defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.defi.assets.coinmanagement.WalletRecentlyRemovedCoinFragment$special$$inlined$viewModels$default$10
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory;
                ViewModelStoreOwner viewModelStoreOwnerM5735viewModels$lambda1 = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd2);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM5735viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM5735viewModels$lambda1 : null;
                if (hasDefaultViewModelProviderFactory == null || (defaultViewModelProviderFactory = hasDefaultViewModelProviderFactory.getDefaultViewModelProviderFactory()) == null) {
                    defaultViewModelProviderFactory = this.getDefaultViewModelProviderFactory();
                }
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "");
                return defaultViewModelProviderFactory;
            }
        });
        this.KWHzl = C56392yDr.copydefault(new Function0() { // from class: o.bhw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C10087bho.EZpvd();
            }
        });
    }

    /* JADX INFO: renamed from: o.bho$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.bho.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public static /* synthetic */ C10087bho newInstance$default(TaskDescription taskDescription, long j, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                j = Long.MIN_VALUE;
            }
            return taskDescription.AEQbTJ(j);
        }

        public final C10087bho AEQbTJ(long j) {
            C10087bho c10087bho = new C10087bho();
            c10087bho.ensureArguments().putLong("chain_id", j);
            return c10087bho;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C10006bgM AhwBna() {
        return (C10006bgM) this.AYXKKw.getValue();
    }

    public final C10096bhx AEQbTJ() {
        return (C10096bhx) this.EZpvd.getValue();
    }

    public static final C59534zip EZpvd() {
        return new C59534zip();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C59534zip OLrzqt() {
        return (C59534zip) this.KWHzl.getValue();
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        ViewDataBinding viewDataBindingBind = DataBindingUtil.bind(view);
        Intrinsics.copydefault(viewDataBindingBind);
        this.copydefault = (AbstractC16684eoa) viewDataBindingBind;
        this.AEQbTJ = ensureArguments().getLong("chain_id");
        gEmmrt();
        copydefault();
        AYXKKw();
        AhwBna().EZpvd(this.AEQbTJ);
    }

    private final void AYXKKw() {
        AhwBna().OLrzqt().observe(this, new StateListAnimator(new Function1() { // from class: o.bht
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C10087bho.OLrzqt(this.KWHzl, (Bitmap) obj);
            }
        }));
    }

    public static final Unit OLrzqt(C10087bho c10087bho, Bitmap bitmap) {
        C55230xfy c55230xfy;
        if (bitmap instanceof Bitmap.StateListAnimator) {
            c10087bho.dismissLoading();
            java.util.ArrayList<C10026bgg.TaskDescription> arrayList = new java.util.ArrayList<>();
            arrayList.addAll(c10087bho.AhwBna().KWHzl());
            c10087bho.AEQbTJ().AEQbTJ(arrayList);
            C33064mpR.OLrzqt(c10087bho.OLrzqt(), arrayList);
            rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) c10087bho, true, (java.lang.String) null, 2, (java.lang.Object) null);
            AbstractC16684eoa abstractC16684eoa = c10087bho.copydefault;
            if (abstractC16684eoa != null && (c55230xfy = abstractC16684eoa.OLrzqt) != null) {
                c55230xfy.setVisibility(arrayList.size() <= 5 ? 8 : 0);
            }
        } else if (bitmap instanceof Bitmap.ActionBar) {
            c10087bho.dismissLoading();
            C55326xho.toast$default(((Bitmap.ActionBar) bitmap).AEQbTJ(), (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
            rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) c10087bho, false, (java.lang.String) null, 2, (java.lang.Object) null);
        } else {
            c10087bho.showLoading();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.bho$ActionBar */
    public static final class ActionBar implements android.text.TextWatcher {
        @Override // android.text.TextWatcher
        public void beforeTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        }

        public ActionBar() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(android.text.Editable editable) {
            C55173xeu c55173xeu;
            RecyclerView recyclerView;
            RecyclerView recyclerView2;
            C55173xeu c55173xeu2;
            java.util.ArrayList<C10026bgg.TaskDescription> arrayListCopydefault = C10087bho.this.AEQbTJ().copydefault(C10087bho.this.AhwBna().KWHzl(), java.lang.String.valueOf(editable));
            if (!arrayListCopydefault.isEmpty()) {
                AbstractC16684eoa abstractC16684eoa = C10087bho.this.copydefault;
                if (abstractC16684eoa != null && (c55173xeu2 = abstractC16684eoa.AEQbTJ) != null) {
                    c55173xeu2.setVisibility(8);
                }
                AbstractC16684eoa abstractC16684eoa2 = C10087bho.this.copydefault;
                if (abstractC16684eoa2 != null && (recyclerView2 = abstractC16684eoa2.KWHzl) != null) {
                    recyclerView2.setVisibility(0);
                }
                C33064mpR.OLrzqt(C10087bho.this.OLrzqt(), arrayListCopydefault);
                return;
            }
            AbstractC16684eoa abstractC16684eoa3 = C10087bho.this.copydefault;
            if (abstractC16684eoa3 != null && (recyclerView = abstractC16684eoa3.KWHzl) != null) {
                recyclerView.setVisibility(8);
            }
            AbstractC16684eoa abstractC16684eoa4 = C10087bho.this.copydefault;
            if (abstractC16684eoa4 != null && (c55173xeu = abstractC16684eoa4.AEQbTJ) != null) {
                c55173xeu.setVisibility(0);
            }
            C10087bho c10087bho = C10087bho.this;
            c10087bho.EZpvd(c10087bho.AEQbTJ().AEQbTJ());
        }
    }

    private final void gEmmrt() {
        RecyclerView recyclerView;
        AbstractC16684eoa abstractC16684eoa = this.copydefault;
        if (abstractC16684eoa != null && (recyclerView = abstractC16684eoa.KWHzl) != null) {
            recyclerView.setHasFixedSize(true);
            recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext(), 1, false));
            recyclerView.setAdapter(OLrzqt());
        }
        OLrzqt().register(C10026bgg.TaskDescription.class, new Application(C13754dXa.TaskDescription.FQMcgEfQMcgE, dTV.AkhnZx));
    }

    /* JADX INFO: renamed from: o.bho$Application */
    /* JADX INFO: loaded from: classes18.dex */
    public static final class Application extends C43318rmy<C10026bgg.TaskDescription, AbstractC16812eqw> {
        public Application(int i, int i2) {
            super(i, i2);
        }

        /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
        /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Lo/rms;Ljava/lang/Object;)V */
        @Override // o.AbstractC43310rmq
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(final C43312rms<AbstractC16812eqw> c43312rms, C10026bgg.TaskDescription taskDescription) {
            java.lang.String strOLrzqt;
            java.lang.String string;
            Intrinsics.checkNotNullParameter(c43312rms, "");
            Intrinsics.checkNotNullParameter(taskDescription, "");
            super.onBindViewHolder((C43312rms) c43312rms, taskDescription);
            if (!taskDescription.OLrzqt()) {
                strOLrzqt = taskDescription.AYXKKw();
            } else {
                java.lang.Character chWlaJM = C59454zhO.wlaJM(taskDescription.isConnected());
                if (chWlaJM == null || (string = chWlaJM.toString()) == null || (strOLrzqt = C9700baY.OLrzqt(string)) == null) {
                    strOLrzqt = "";
                }
            }
            taskDescription.OLrzqt(strOLrzqt);
            android.widget.ImageView imageView = ((AbstractC16812eqw) c43312rms.OLrzqt()).AEQbTJ;
            Intrinsics.checkNotNullExpressionValue(imageView, "");
            C14725dqq.loadFixSizeBorderImage$default(imageView, taskDescription.AYXKKw(), C52761wXj.TaskDescription.aHXSQp, 0.0f, 0.0f, 0, false, 60, null);
            ((AbstractC16812eqw) c43312rms.OLrzqt()).AYXKKw.setText(C33061mpO.KWHzl(taskDescription.isConnected(), C10087bho.this.AEQbTJ().AEQbTJ(), new Function1() { // from class: o.bhs
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C10087bho.Application.copydefault(c43312rms, (java.util.List) obj);
                }
            }));
            ((AbstractC16812eqw) c43312rms.OLrzqt()).EZpvd.setAlpha(1.0f);
            ((AbstractC16812eqw) c43312rms.OLrzqt()).valueOf.clearAnimation();
            ((AbstractC16812eqw) c43312rms.OLrzqt()).valueOf.setAlpha(0.0f);
            ((AbstractC16812eqw) c43312rms.OLrzqt()).EZpvd.setOnCheckStateChangeListener(new TaskDescription(c43312rms, C10087bho.this, taskDescription));
        }

        public static final Unit copydefault(C43312rms c43312rms, java.util.List list) {
            Intrinsics.checkNotNullParameter(list, "");
            int i = C52761wXj.ActionBar.DCUTEI;
            android.content.Context context = ((AbstractC16812eqw) c43312rms.OLrzqt()).getRoot().getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            list.add(new android.text.style.ForegroundColorSpan(C55366xib.KWHzl(i, context)));
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: o.bho$Application$TaskDescription */
        public static final class TaskDescription implements InterfaceC10330bmS {
            public final /* synthetic */ C10026bgg.TaskDescription AEQbTJ;
            public final /* synthetic */ C10087bho OLrzqt;
            public final /* synthetic */ C43312rms<AbstractC16812eqw> copydefault;

            public TaskDescription(C43312rms<AbstractC16812eqw> c43312rms, C10087bho c10087bho, C10026bgg.TaskDescription taskDescription) {
                this.copydefault = c43312rms;
                this.OLrzqt = c10087bho;
                this.AEQbTJ = taskDescription;
            }

            /* JADX INFO: renamed from: o.bho$Application$TaskDescription$StateListAnimator */
            public static final class StateListAnimator extends android.animation.AnimatorListenerAdapter {
                public final /* synthetic */ C10026bgg.TaskDescription EZpvd;
                public final /* synthetic */ C10087bho KWHzl;
                public final /* synthetic */ C43312rms<AbstractC16812eqw> OLrzqt;

                public StateListAnimator(C43312rms<AbstractC16812eqw> c43312rms, C10087bho c10087bho, C10026bgg.TaskDescription taskDescription) {
                    this.OLrzqt = c43312rms;
                    this.KWHzl = c10087bho;
                    this.EZpvd = taskDescription;
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(android.animation.Animator animator) {
                    Intrinsics.checkNotNullParameter(animator, "");
                    ((AbstractC16812eqw) this.OLrzqt.OLrzqt()).EZpvd.setAlpha(0.0f);
                    ((AbstractC16812eqw) this.OLrzqt.OLrzqt()).valueOf.setAlpha(1.0f);
                    ((AbstractC16812eqw) this.OLrzqt.OLrzqt()).valueOf.setAnimation(C13754dXa.Fragment.AEQbTJ);
                    ((AbstractC16812eqw) this.OLrzqt.OLrzqt()).valueOf.addAnimatorListener(new C0826TaskDescription(this.KWHzl, this.EZpvd, this.OLrzqt));
                    ((AbstractC16812eqw) this.OLrzqt.OLrzqt()).valueOf.playAnimation();
                }

                /* JADX INFO: renamed from: o.bho$Application$TaskDescription$StateListAnimator$TaskDescription, reason: collision with other inner class name */
                public static final class C0826TaskDescription extends android.animation.AnimatorListenerAdapter {
                    public final /* synthetic */ C10026bgg.TaskDescription EZpvd;
                    public final /* synthetic */ C10087bho KWHzl;
                    public final /* synthetic */ C43312rms<AbstractC16812eqw> OLrzqt;

                    public C0826TaskDescription(C10087bho c10087bho, C10026bgg.TaskDescription taskDescription, C43312rms<AbstractC16812eqw> c43312rms) {
                        this.KWHzl = c10087bho;
                        this.EZpvd = taskDescription;
                        this.OLrzqt = c43312rms;
                    }

                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public void onAnimationEnd(android.animation.Animator animator) {
                        Intrinsics.checkNotNullParameter(animator, "");
                        C10096bhx c10096bhxAEQbTJ = this.KWHzl.AEQbTJ();
                        java.util.ArrayList<C10026bgg.TaskDescription> arrayListKWHzl = this.KWHzl.AhwBna().KWHzl();
                        final C10026bgg.TaskDescription taskDescription = this.EZpvd;
                        final C10087bho c10087bho = this.KWHzl;
                        c10096bhxAEQbTJ.OLrzqt(arrayListKWHzl, taskDescription, new yHO() { // from class: o.bhB
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // o.yHO
                            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                                return C10087bho.Application.TaskDescription.StateListAnimator.C0826TaskDescription.EZpvd(c10087bho, taskDescription, ((java.lang.Integer) obj).intValue(), ((java.lang.Boolean) obj2).booleanValue(), ((java.lang.Boolean) obj3).booleanValue());
                            }
                        });
                        ((AbstractC16812eqw) this.OLrzqt.OLrzqt()).valueOf.removeAnimatorListener(this);
                    }

                    public static final Unit EZpvd(C10087bho c10087bho, final C10026bgg.TaskDescription taskDescription, int i, boolean z, boolean z2) {
                        C55173xeu c55173xeu;
                        RecyclerView recyclerView;
                        c10087bho.OLrzqt().notifyItemRemoved(i);
                        RxBus.AEQbTJ(new C9934beu());
                        C32866mlf.onEvent$default("Web3WalletHomepage_ManageCrypto_AddCrypto_Click", (TrackChannel[]) null, new Function1() { // from class: o.bhv
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj) {
                                return C10087bho.Application.TaskDescription.StateListAnimator.C0826TaskDescription.EZpvd(taskDescription, (EventParamsList) obj);
                            }
                        }, 1, (java.lang.Object) null);
                        if (z) {
                            FragmentActivity activity = c10087bho.getActivity();
                            if (activity != null) {
                                activity.finish();
                            }
                        } else if (z2) {
                            AbstractC16684eoa abstractC16684eoa = c10087bho.copydefault;
                            if (abstractC16684eoa != null && (recyclerView = abstractC16684eoa.KWHzl) != null) {
                                recyclerView.setVisibility(8);
                            }
                            AbstractC16684eoa abstractC16684eoa2 = c10087bho.copydefault;
                            if (abstractC16684eoa2 != null && (c55173xeu = abstractC16684eoa2.AEQbTJ) != null) {
                                c55173xeu.setVisibility(0);
                            }
                            c10087bho.EZpvd(c10087bho.AEQbTJ().AEQbTJ());
                        }
                        return Unit.INSTANCE;
                    }

                    public static final Unit EZpvd(C10026bgg.TaskDescription taskDescription, EventParamsList eventParamsList) {
                        C10854bwM c10854bwMKWHzl;
                        C10854bwM c10854bwMKWHzl2;
                        C10854bwM c10854bwMKWHzl3;
                        Intrinsics.checkNotNullParameter(eventParamsList, "");
                        EventParamsList.put$default(eventParamsList, "token_symbol", taskDescription.isConnected(), false, 4, null);
                        C10525bqB c10525bqBCopydefault = taskDescription.copydefault();
                        java.lang.String strOLrzqt = null;
                        java.lang.String strFJNWhG = (c10525bqBCopydefault == null || (c10854bwMKWHzl2 = c10525bqBCopydefault.KWHzl()) == null || (c10854bwMKWHzl3 = c10854bwMKWHzl2.KWHzl()) == null) ? null : c10854bwMKWHzl3.fJNWhG();
                        EventParamsList.put$default(eventParamsList, "chain_symbol", strFJNWhG == null ? "" : strFJNWhG, false, 4, null);
                        C10525bqB c10525bqBCopydefault2 = taskDescription.copydefault();
                        if (c10525bqBCopydefault2 != null && (c10854bwMKWHzl = c10525bqBCopydefault2.KWHzl()) != null) {
                            strOLrzqt = c10854bwMKWHzl.OLrzqt();
                        }
                        EventParamsList.put$default(eventParamsList, "token_contract_address", strOLrzqt == null ? "" : strOLrzqt, false, 4, null);
                        eventParamsList.put("source_page", "recently_removed", true);
                        return Unit.INSTANCE;
                    }
                }
            }

            @Override // o.InterfaceC10330bmS
            public void KWHzl(C10324bmM c10324bmM, int i) {
                Intrinsics.checkNotNullParameter(c10324bmM, "");
                if (i == 1) {
                    ((AbstractC16812eqw) this.copydefault.OLrzqt()).EZpvd.animate().setListener(new StateListAnimator(this.copydefault, this.OLrzqt, this.AEQbTJ)).alpha(0.0f).start();
                }
            }
        }

        /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
        @Override // o.AbstractC43310rmq, o.AbstractC59533zio
        public C43312rms<AbstractC16812eqw> onCreateViewHolder(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup) {
            Intrinsics.checkNotNullParameter(layoutInflater, "");
            Intrinsics.checkNotNullParameter(viewGroup, "");
            C43312rms<AbstractC16812eqw> c43312rmsOnCreateViewHolder = super.onCreateViewHolder(layoutInflater, viewGroup);
            Intrinsics.checkNotNullExpressionValue(c43312rmsOnCreateViewHolder, "");
            ((AbstractC16812eqw) c43312rmsOnCreateViewHolder.OLrzqt()).EZpvd.setAutoSetState(false);
            return c43312rmsOnCreateViewHolder;
        }
    }

    public final void copydefault() {
        C55230xfy c55230xfy;
        C55230xfy c55230xfy2;
        C55230xfy c55230xfy3;
        OKEditText oKEditTextKWHzl;
        AbstractC16684eoa abstractC16684eoa = this.copydefault;
        if (abstractC16684eoa != null && (c55230xfy3 = abstractC16684eoa.OLrzqt) != null && (oKEditTextKWHzl = c55230xfy3.KWHzl()) != null) {
            oKEditTextKWHzl.addTextChangedListener(new ActionBar());
        }
        AbstractC16684eoa abstractC16684eoa2 = this.copydefault;
        if (abstractC16684eoa2 != null && (c55230xfy2 = abstractC16684eoa2.OLrzqt) != null) {
            c55230xfy2.setShowCancelButton(false);
        }
        AbstractC16684eoa abstractC16684eoa3 = this.copydefault;
        if (abstractC16684eoa3 == null || (c55230xfy = abstractC16684eoa3.OLrzqt) == null) {
            return;
        }
        c55230xfy.setOnSearchBarClick(new Function0() { // from class: o.bhu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C10087bho.AhwBna(this.OLrzqt);
            }
        });
    }

    public static final Unit AhwBna(C10087bho c10087bho) {
        C55230xfy c55230xfy;
        AbstractC16684eoa abstractC16684eoa = c10087bho.copydefault;
        if (abstractC16684eoa != null && (c55230xfy = abstractC16684eoa.OLrzqt) != null) {
            c55230xfy.setSearchBarEditable(true);
        }
        return Unit.INSTANCE;
    }

    public final void EZpvd(java.lang.String str) {
        final C55173xeu c55173xeu;
        AbstractC16684eoa abstractC16684eoa = this.copydefault;
        if (abstractC16684eoa == null || (c55173xeu = abstractC16684eoa.AEQbTJ) == null) {
            return;
        }
        c55173xeu.EZpvd().setTextColor(C33070mpX.copydefault(C52761wXj.Activity.QwvEab));
        c55173xeu.setSubTitle(C33061mpO.KWHzl(C33069mpW.OLrzqt(C33070mpX.AYXKKw(C13754dXa.FragmentManager.getMimeType), C56424yEw.AYXKKw(C56390yDp.OLrzqt("token", str))), str, new Function1() { // from class: o.bhp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C10087bho.KWHzl(c55173xeu, (java.util.List) obj);
            }
        }));
        c55173xeu.AEQbTJ().setVisibility(4);
    }

    public static final Unit KWHzl(C55173xeu c55173xeu, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        list.add(new android.text.style.TextAppearanceSpan(c55173xeu.getContext(), C32113mPz.Dialog.fetchVPNInfo));
        list.add(new android.text.style.ForegroundColorSpan(C33070mpX.copydefault(C52761wXj.Activity.Dmq)));
        return Unit.INSTANCE;
    }
}
