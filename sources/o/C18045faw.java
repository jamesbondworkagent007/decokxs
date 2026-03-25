package o;

import android.view.View;
import androidx.constraintlayout.widget.Group;
import androidx.core.os.BundleKt;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.imageview.ShapeableImageView;
import com.okinc.business.defi.wallet.home.escapebind.model.EscapeAccountDetailUIBean;
import com.okinc.business.defi.wallet.home.escapebind.model.EscapeBindAccountListUIBean;
import com.okinc.business.defi.wallet.home.escapebind.ui.OKWEscapeBindAccountDetailFragment$initView$1;
import com.okinc.business.defi.wallet.tx.send.CeDeFiAAAssetInfo;
import com.okinc.localization.util.format.DisplaySign;
import java.math.RoundingMode;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.C13754dXa;
import o.C32113mPz;
import o.C52761wXj;
import o.C9694baS;
import o.gGW;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.faw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C18045faw extends AbstractC32996moC {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int KWHzl = 8;
    public final C43316rmw AEQbTJ = new C43316rmw();
    public AbstractC16636enf OLrzqt;
    public final InterfaceC56387yDm copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return C13754dXa.TaskDescription.DQzvGNdrmXxudrmXxu;
    }

    public C18045faw() {
        final Function0 function0 = null;
        this.copydefault = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(C18000faD.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.defi.wallet.home.escapebind.ui.OKWEscapeBindAccountDetailFragment$special$$inlined$activityViewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.defi.wallet.home.escapebind.ui.OKWEscapeBindAccountDetailFragment$special$$inlined$activityViewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.defi.wallet.home.escapebind.ui.OKWEscapeBindAccountDetailFragment$special$$inlined$activityViewModels$default$3
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

    /* JADX INFO: renamed from: o.faw$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.faw.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final C18045faw EZpvd(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            C18045faw c18045faw = new C18045faw();
            c18045faw.setArguments(BundleKt.bundleOf(C56390yDp.OLrzqt("wallet_id", str)));
            return c18045faw;
        }
    }

    public final C18000faD AEQbTJ() {
        return (C18000faD) this.copydefault.getValue();
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        this.OLrzqt = AbstractC16636enf.AEQbTJ(view);
        android.os.Bundle arguments = getArguments();
        java.lang.String string = arguments != null ? arguments.getString("wallet_id") : null;
        if (string == null) {
            string = "";
        }
        AEQbTJ().OLrzqt(string);
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new OKWEscapeBindAccountDetailFragment$initView$1(this, null), 3, null);
    }

    public final void OLrzqt(EscapeBindAccountListUIBean escapeBindAccountListUIBean) {
        java.lang.String valuationFromAsset$default;
        C55173xeu c55173xeu;
        Group group;
        java.util.List<EscapeAccountDetailUIBean> tokens;
        C55173xeu c55173xeu2;
        Group group2;
        java.lang.String totalCurrencyAmount;
        AbstractC16636enf abstractC16636enf = this.OLrzqt;
        if (abstractC16636enf != null) {
            android.widget.TextView textView = abstractC16636enf.djBIcL;
            if (escapeBindAccountListUIBean == null || (totalCurrencyAmount = escapeBindAccountListUIBean.getTotalCurrencyAmount()) == null || (valuationFromAsset$default = C54880xYt.formatValuationFromAsset$default(totalCurrencyAmount, null, false, 0, false, 15, null)) == null) {
                valuationFromAsset$default = "--";
            }
            textView.setText(valuationFromAsset$default);
            if (escapeBindAccountListUIBean == null || (tokens = escapeBindAccountListUIBean.getTokens()) == null || !(!tokens.isEmpty())) {
                AbstractC16636enf abstractC16636enf2 = this.OLrzqt;
                if (abstractC16636enf2 != null && (group = abstractC16636enf2.OLrzqt) != null) {
                    group.setVisibility(4);
                }
                AbstractC16636enf abstractC16636enf3 = this.OLrzqt;
                if (abstractC16636enf3 == null || (c55173xeu = abstractC16636enf3.copydefault) == null) {
                    return;
                }
                c55173xeu.setVisibility(0);
                return;
            }
            AbstractC16636enf abstractC16636enf4 = this.OLrzqt;
            if (abstractC16636enf4 != null && (group2 = abstractC16636enf4.OLrzqt) != null) {
                group2.setVisibility(0);
            }
            AbstractC16636enf abstractC16636enf5 = this.OLrzqt;
            if (abstractC16636enf5 != null && (c55173xeu2 = abstractC16636enf5.copydefault) != null) {
                c55173xeu2.setVisibility(4);
            }
            RecyclerView recyclerView = abstractC16636enf.EZpvd;
            recyclerView.setHasFixedSize(true);
            recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext(), 1, false));
            this.AEQbTJ.register(EscapeAccountDetailUIBean.class, new ActionBar(escapeBindAccountListUIBean, C13754dXa.TaskDescription.DRGLNw, dTV.isConnected));
            recyclerView.setAdapter(this.AEQbTJ);
            C43316rmw c43316rmw = this.AEQbTJ;
            java.util.List<EscapeAccountDetailUIBean> tokens2 = escapeBindAccountListUIBean != null ? escapeBindAccountListUIBean.getTokens() : null;
            if (tokens2 == null) {
                tokens2 = yDY.AhwBna();
            }
            c43316rmw.AhwBna(tokens2);
        }
    }

    /* JADX INFO: renamed from: o.faw$ActionBar */
    public static final class ActionBar extends C43318rmy<EscapeAccountDetailUIBean, AbstractC16854erl> {
        public final /* synthetic */ EscapeBindAccountListUIBean OLrzqt;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ActionBar(EscapeBindAccountListUIBean escapeBindAccountListUIBean, int i, int i2) {
            super(i, i2);
            this.OLrzqt = escapeBindAccountListUIBean;
        }

        /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
        /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Lo/rms;Ljava/lang/Object;)V */
        @Override // o.AbstractC43310rmq
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(C43312rms<AbstractC16854erl> c43312rms, EscapeAccountDetailUIBean escapeAccountDetailUIBean) {
            Intrinsics.checkNotNullParameter(c43312rms, "");
            Intrinsics.checkNotNullParameter(escapeAccountDetailUIBean, "");
            ViewDataBinding viewDataBindingOLrzqt = c43312rms.OLrzqt();
            C18045faw c18045faw = C18045faw.this;
            EscapeBindAccountListUIBean escapeBindAccountListUIBean = this.OLrzqt;
            AbstractC16854erl abstractC16854erl = (AbstractC16854erl) viewDataBindingOLrzqt;
            ShapeableImageView shapeableImageView = abstractC16854erl.KWHzl;
            Intrinsics.checkNotNullExpressionValue(shapeableImageView, "");
            C14725dqq.loadFixSizeBorderImage$default(shapeableImageView, escapeAccountDetailUIBean.getLogo(), C52761wXj.TaskDescription.aHXSQp, 0.0f, 32.0f, C33070mpX.copydefault(C32113mPz.ActionBar.fJNWhG), false, 36, null);
            abstractC16854erl.AYXKKw.setText(escapeAccountDetailUIBean.getSymbol());
            abstractC16854erl.AEQbTJ.setText(escapeAccountDetailUIBean.getChainName());
            android.widget.ImageView imageView = abstractC16854erl.EZpvd;
            Intrinsics.checkNotNullExpressionValue(imageView, "");
            imageView.setVisibility(escapeAccountDetailUIBean.getRiskType() == 1 ? 0 : 8);
            abstractC16854erl.AhwBna.setText(C54870xYj.OLrzqt(escapeAccountDetailUIBean.getCoinAmount(), (249 & 1) != 0 ? 0 : 0, escapeAccountDetailUIBean.getDisplayPrecision(), null, (249 & 8) != 0 ? DisplaySign.AUTO : null, (249 & 16) != 0 ? false : false, (249 & 32) != 0 ? null : null, (249 & 64) != 0 ? false : false, (249 & 128) != 0 ? RoundingMode.DOWN : null));
            abstractC16854erl.djBIcL.setText(C54880xYt.formatValuationFromAsset$default(escapeAccountDetailUIBean.getCurrencyAmount(), null, false, 0, false, 15, null));
            android.view.View root = abstractC16854erl.getRoot();
            root.setOnClickListener(new Application(root, 1000L, c18045faw, escapeAccountDetailUIBean, escapeBindAccountListUIBean));
        }

        /* JADX INFO: renamed from: o.faw$ActionBar$StateListAnimator */
        public static final class StateListAnimator implements Function2<java.lang.Integer, android.content.Intent, Unit> {
            public final /* synthetic */ EscapeBindAccountListUIBean AEQbTJ;
            public final /* synthetic */ EscapeAccountDetailUIBean KWHzl;
            public final /* synthetic */ C18045faw copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public StateListAnimator(EscapeBindAccountListUIBean escapeBindAccountListUIBean, EscapeAccountDetailUIBean escapeAccountDetailUIBean, C18045faw c18045faw) {
                this.AEQbTJ = escapeBindAccountListUIBean;
                this.KWHzl = escapeAccountDetailUIBean;
                this.copydefault = c18045faw;
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // kotlin.jvm.functions.Function2
            public /* synthetic */ Unit invoke(java.lang.Integer num, android.content.Intent intent) {
                EZpvd(num.intValue(), intent);
                return Unit.INSTANCE;
            }

            public final void EZpvd(int i, android.content.Intent intent) {
                if (i == -1) {
                    if (this.AEQbTJ.getTokens().isEmpty() || (this.AEQbTJ.getTokens().size() == 1 && Intrinsics.EZpvd((java.lang.Object) this.KWHzl.getTokenAddress(), (java.lang.Object) ((EscapeAccountDetailUIBean) CollectionsKt___CollectionsKt.AuCTelauCTel(this.AEQbTJ.getTokens())).getTokenAddress()))) {
                        FragmentActivity activity = this.copydefault.getActivity();
                        if (activity != null) {
                            activity.setResult(-1);
                        }
                        FragmentActivity activity2 = this.copydefault.getActivity();
                        if (activity2 != null) {
                            activity2.finish();
                        }
                    }
                }
            }
        }

        /* JADX INFO: renamed from: o.faw$ActionBar$Application */
        public static final class Application implements View.OnClickListener {
            public final /* synthetic */ EscapeAccountDetailUIBean AEQbTJ;
            public final /* synthetic */ EscapeBindAccountListUIBean EZpvd;
            public final /* synthetic */ C18045faw KWHzl;
            public final /* synthetic */ android.view.View OLrzqt;
            public final /* synthetic */ long copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public Application(android.view.View view, long j, C18045faw c18045faw, EscapeAccountDetailUIBean escapeAccountDetailUIBean, EscapeBindAccountListUIBean escapeBindAccountListUIBean) {
                this.OLrzqt = view;
                this.copydefault = j;
                this.KWHzl = c18045faw;
                this.AEQbTJ = escapeAccountDetailUIBean;
                this.EZpvd = escapeBindAccountListUIBean;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                java.lang.String string;
                long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.copydefault || (this.OLrzqt instanceof android.widget.Checkable)) {
                    C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                    C9694baS.Application application = C9694baS.Companion;
                    C18045faw c18045faw = this.KWHzl;
                    gGW.StateListAnimator stateListAnimator = gGW.Companion;
                    FragmentActivity activity = c18045faw.getActivity();
                    if (activity == null) {
                        return;
                    }
                    java.lang.String strAEQbTJ = this.KWHzl.AEQbTJ().AEQbTJ();
                    EscapeAccountDetailUIBean escapeAccountDetailUIBean = this.AEQbTJ;
                    android.os.Bundle arguments = this.KWHzl.getArguments();
                    if (arguments == null || (string = arguments.getString("wallet_id")) == null) {
                        return;
                    }
                    application.KWHzl(c18045faw, stateListAnimator.KWHzl(activity, strAEQbTJ, new CeDeFiAAAssetInfo(string, escapeAccountDetailUIBean.getAddress(), escapeAccountDetailUIBean.getChainIndex(), escapeAccountDetailUIBean.getCoinId(), escapeAccountDetailUIBean.getSymbol(), escapeAccountDetailUIBean.getOriginalCoinAmount(), escapeAccountDetailUIBean.getCurrencyAmount(), escapeAccountDetailUIBean.getDecimalNum(), escapeAccountDetailUIBean.getDisplayPrecision(), escapeAccountDetailUIBean.getTokenAddress(), escapeAccountDetailUIBean.getLogo(), escapeAccountDetailUIBean.isMainCoin())), new StateListAnimator(this.EZpvd, this.AEQbTJ, this.KWHzl));
                }
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        AEQbTJ().djBIcL();
    }
}
