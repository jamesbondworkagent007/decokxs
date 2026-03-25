package o;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.business.defi.wallet.home.escapebind.model.EscapeAccountDetailUIBean;
import com.okinc.business.defi.wallet.home.escapebind.model.EscapeBindAccountListUIBean;
import com.okinc.business.defi.wallet.home.escapebind.ui.OKWEscapeBindAccountListFragment$observeAddressesState$1;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.C13754dXa;
import o.C18048faz;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.faz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C18048faz extends AbstractC32996moC {
    public static final Activity Companion = new Activity(null);
    public static final int KWHzl = 8;
    public final C43316rmw AEQbTJ = new C43316rmw();
    public final InterfaceC56387yDm OLrzqt;
    public AbstractC16638enh copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return C13754dXa.TaskDescription.DcMfJK;
    }

    public C18048faz() {
        final Function0 function0 = null;
        this.OLrzqt = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(C18000faD.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.defi.wallet.home.escapebind.ui.OKWEscapeBindAccountListFragment$special$$inlined$activityViewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.defi.wallet.home.escapebind.ui.OKWEscapeBindAccountListFragment$special$$inlined$activityViewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.defi.wallet.home.escapebind.ui.OKWEscapeBindAccountListFragment$special$$inlined$activityViewModels$default$3
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

    /* JADX INFO: renamed from: o.faz$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.faz.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final C18048faz copydefault() {
            return new C18048faz();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C18000faD KWHzl() {
        return (C18000faD) this.OLrzqt.getValue();
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        this.copydefault = AbstractC16638enh.EZpvd(view);
        EZpvd();
        KWHzl().KWHzl();
        copydefault();
    }

    private final void EZpvd() {
        AbstractC16638enh abstractC16638enh = this.copydefault;
        if (abstractC16638enh != null) {
            RecyclerView recyclerView = abstractC16638enh.copydefault;
            recyclerView.setHasFixedSize(true);
            recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext(), 1, false));
            this.AEQbTJ.register(EscapeBindAccountListUIBean.class, new TaskDescription(C13754dXa.TaskDescription.fsw, dTV.isConnected));
            recyclerView.setAdapter(this.AEQbTJ);
        }
    }

    /* JADX INFO: renamed from: o.faz$TaskDescription */
    /* JADX INFO: loaded from: classes18.dex */
    public static final class TaskDescription extends C43318rmy<EscapeBindAccountListUIBean, AbstractC16855erm> {
        public TaskDescription(int i, int i2) {
            super(i, i2);
        }

        /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
        /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Lo/rms;Ljava/lang/Object;)V */
        @Override // o.AbstractC43310rmq
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(C43312rms<AbstractC16855erm> c43312rms, EscapeBindAccountListUIBean escapeBindAccountListUIBean) {
            Intrinsics.checkNotNullParameter(c43312rms, "");
            Intrinsics.checkNotNullParameter(escapeBindAccountListUIBean, "");
            ViewDataBinding viewDataBindingOLrzqt = c43312rms.OLrzqt();
            C18048faz c18048faz = C18048faz.this;
            AbstractC16855erm abstractC16855erm = (AbstractC16855erm) viewDataBindingOLrzqt;
            AppCompatImageView appCompatImageView = abstractC16855erm.AEQbTJ;
            Intrinsics.checkNotNullExpressionValue(appCompatImageView, "");
            C14725dqq.copydefault(appCompatImageView, c18048faz.KWHzl(escapeBindAccountListUIBean), C13754dXa.Activity.fJNWhG, new Function1() { // from class: o.faC
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C18048faz.TaskDescription.OLrzqt((C5335Nt) obj);
                }
            }, 32.0f);
            abstractC16855erm.EZpvd.setText(C33069mpW.copydefault(C13754dXa.FragmentManager.zHQtTQ, C56423yEv.EZpvd(C56390yDp.OLrzqt("from", escapeBindAccountListUIBean.getAaAccountName()))));
            abstractC16855erm.OLrzqt.setText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.QfgJNx));
            abstractC16855erm.copydefault.setText(C54880xYt.formatValuationFromAsset$default(escapeBindAccountListUIBean.getTotalCurrencyAmount(), null, false, 0, false, 15, null));
            android.view.View root = abstractC16855erm.getRoot();
            root.setOnClickListener(new ViewOnClickListenerC0848TaskDescription(root, 1000L, c18048faz, escapeBindAccountListUIBean));
        }

        public static final Unit OLrzqt(C5335Nt c5335Nt) {
            Intrinsics.checkNotNullParameter(c5335Nt, "");
            c5335Nt.EZpvd((NN<android.graphics.Bitmap>) new C5417Qx(C55298xhM.dp2px$default(4.0f, null, 1, null)));
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: o.faz$TaskDescription$TaskDescription, reason: collision with other inner class name */
        public static final class ViewOnClickListenerC0848TaskDescription implements View.OnClickListener {
            public final /* synthetic */ long AEQbTJ;
            public final /* synthetic */ android.view.View EZpvd;
            public final /* synthetic */ C18048faz OLrzqt;
            public final /* synthetic */ EscapeBindAccountListUIBean copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public ViewOnClickListenerC0848TaskDescription(android.view.View view, long j, C18048faz c18048faz, EscapeBindAccountListUIBean escapeBindAccountListUIBean) {
                this.EZpvd = view;
                this.AEQbTJ = j;
                this.OLrzqt = c18048faz;
                this.copydefault = escapeBindAccountListUIBean;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.AEQbTJ || (this.EZpvd instanceof android.widget.Checkable)) {
                    C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                    this.OLrzqt.AEQbTJ(this.copydefault.getAaAccountId(), true);
                }
            }
        }
    }

    public final java.lang.String KWHzl(EscapeBindAccountListUIBean escapeBindAccountListUIBean) {
        java.lang.Object next;
        java.lang.Object next2;
        if (!(!escapeBindAccountListUIBean.getTokens().isEmpty())) {
            return "";
        }
        java.util.Iterator<T> it = escapeBindAccountListUIBean.getTokens().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            C10854bwM c10854bwMCopydefault = C10954byG.EZpvd.valueOf().copydefault(C33129mqd.valueOf(((EscapeAccountDetailUIBean) next).getChainIndex()));
            if (c10854bwMCopydefault != null && c10854bwMCopydefault.QkdxfA()) {
                break;
            }
        }
        EscapeAccountDetailUIBean escapeAccountDetailUIBean = (EscapeAccountDetailUIBean) next;
        java.lang.String address = escapeAccountDetailUIBean != null ? escapeAccountDetailUIBean.getAddress() : null;
        java.util.Iterator<T> it2 = escapeBindAccountListUIBean.getTokens().iterator();
        while (true) {
            if (!it2.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it2.next();
            C10854bwM c10854bwMCopydefault2 = C10954byG.EZpvd.valueOf().copydefault(C33129mqd.valueOf(((EscapeAccountDetailUIBean) next2).getChainIndex()));
            if (c10854bwMCopydefault2 != null && c10854bwMCopydefault2.fARcdN()) {
                break;
            }
        }
        EscapeAccountDetailUIBean escapeAccountDetailUIBean2 = (EscapeAccountDetailUIBean) next2;
        java.lang.String address2 = escapeAccountDetailUIBean2 != null ? escapeAccountDetailUIBean2.getAddress() : null;
        java.lang.String str = address2 != null ? address2 : "";
        return (address == null || address.length() == 0) ? str : address;
    }

    public final void copydefault() {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new OKWEscapeBindAccountListFragment$observeAddressesState$1(this, null), 3, null);
    }

    public final void KWHzl(java.util.List<EscapeBindAccountListUIBean> list) {
        RecyclerView recyclerView;
        C55173xeu c55173xeu;
        if (list.isEmpty()) {
            AEQbTJ("", false);
            return;
        }
        if (list.size() == 1) {
            EscapeBindAccountListUIBean escapeBindAccountListUIBean = (EscapeBindAccountListUIBean) CollectionsKt___CollectionsKt.firstOrNull(list);
            java.lang.String aaAccountId = escapeBindAccountListUIBean != null ? escapeBindAccountListUIBean.getAaAccountId() : null;
            AEQbTJ(aaAccountId != null ? aaAccountId : "", false);
            return;
        }
        AbstractC16638enh abstractC16638enh = this.copydefault;
        if (abstractC16638enh != null && (c55173xeu = abstractC16638enh.OLrzqt) != null) {
            c55173xeu.setVisibility(8);
        }
        AbstractC16638enh abstractC16638enh2 = this.copydefault;
        if (abstractC16638enh2 != null && (recyclerView = abstractC16638enh2.copydefault) != null) {
            recyclerView.setVisibility(0);
        }
        this.AEQbTJ.AhwBna(list);
    }

    public final void AEQbTJ(java.lang.String str, boolean z) {
        androidx.fragment.app.FragmentManager supportFragmentManager;
        FragmentActivity activity = getActivity();
        if (activity == null || (supportFragmentManager = activity.getSupportFragmentManager()) == null) {
            return;
        }
        androidx.fragment.app.FragmentTransaction fragmentTransactionBeginTransaction = supportFragmentManager.beginTransaction();
        Intrinsics.checkNotNullExpressionValue(fragmentTransactionBeginTransaction, "");
        if (z) {
            fragmentTransactionBeginTransaction.setCustomAnimations(C52761wXj.Application.OLrzqt, C52761wXj.Application.AYXKKw, C52761wXj.Application.KWHzl, C52761wXj.Application.djBIcL);
            fragmentTransactionBeginTransaction.add(C13754dXa.ActionBar.XW, C18045faw.Companion.EZpvd(str));
            fragmentTransactionBeginTransaction.addToBackStack(null);
        } else {
            fragmentTransactionBeginTransaction.replace(C13754dXa.ActionBar.XW, C18045faw.Companion.EZpvd(str));
        }
        fragmentTransactionBeginTransaction.commit();
    }
}
