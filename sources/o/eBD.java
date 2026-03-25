package o;

import android.view.View;
import android.view.ViewGroup;
import androidx.activity.result.ActivityResultCaller;
import androidx.appcompat.widget.LinearLayoutCompat;
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
import com.okinc.business.defi.biz.core.wallet.update.WalletUpdateWorker;
import com.okinc.business.defi.wallet.home.bean.QuickCopyAddressItemBean;
import com.okinc.business.defi.wallet.mine.search.data.model.WalletSearchRequest;
import com.okinc.uilab.list.OKAnchorSelection;
import com.okinc.wallet.api.bean.AddressType;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.ActivityC18568fkp;
import o.C13754dXa;
import o.eBA;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class eBD extends AbstractC32996moC implements WalletUpdateWorker.TaskDescription, eBA.StateListAnimator {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int EZpvd = 8;
    public boolean AEQbTJ;
    public java.lang.String AYXKKw;
    public int KWHzl;
    public final InterfaceC56387yDm OLrzqt;
    public AbstractC16621enQ copydefault;

    public static final /* synthetic */ class Activity implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.OLrzqt = function1;
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
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(java.lang.Object obj) {
            this.OLrzqt.invoke(obj);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return C13754dXa.TaskDescription.invokespecialhlXVux;
    }

    public eBD() {
        final Function0<androidx.fragment.app.Fragment> function0 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.business.defi.wallet.detail.WalletAccountAddressFragment$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.business.defi.wallet.detail.WalletAccountAddressFragment$special$$inlined$viewModels$default$2
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
        this.OLrzqt = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(C18303ffp.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.defi.wallet.detail.WalletAccountAddressFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.defi.wallet.detail.WalletAccountAddressFragment$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.defi.wallet.detail.WalletAccountAddressFragment$special$$inlined$viewModels$default$5
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
        this.AYXKKw = "";
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.eBD.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public static /* synthetic */ eBD newInstance$default(TaskDescription taskDescription, java.lang.String str, int i, int i2, java.lang.Object obj) {
            if ((i2 & 2) != 0) {
                i = 0;
            }
            return taskDescription.OLrzqt(str, i);
        }

        public final eBD OLrzqt(@NotNull java.lang.String str, int i) {
            Intrinsics.checkNotNullParameter(str, "");
            eBD ebd = new eBD();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("wallet_id", str);
            bundle.putInt("type", i);
            ebd.setArguments(bundle);
            return ebd;
        }
    }

    public final C18303ffp copydefault() {
        return (C18303ffp) this.OLrzqt.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        java.lang.String string;
        super.onCreate(bundle);
        android.os.Bundle arguments = getArguments();
        if (arguments == null || (string = arguments.getString("wallet_id")) == null) {
            string = "";
        }
        this.AYXKKw = string;
        android.os.Bundle arguments2 = getArguments();
        this.KWHzl = arguments2 != null ? arguments2.getInt("type") : 0;
        AEQbTJ();
        WalletUpdateWorker.Application.getInstance$default(WalletUpdateWorker.Companion, null, 1, null).KWHzl(this);
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        ViewDataBinding viewDataBindingBind = DataBindingUtil.bind(view);
        Intrinsics.copydefault(viewDataBindingBind);
        AbstractC16621enQ abstractC16621enQ = (AbstractC16621enQ) viewDataBindingBind;
        this.copydefault = abstractC16621enQ;
        AbstractC16621enQ abstractC16621enQ2 = null;
        if (abstractC16621enQ == null) {
            Intrinsics.gEmmrt("");
            abstractC16621enQ = null;
        }
        C55173xeu c55173xeuCopydefault = abstractC16621enQ.OLrzqt.copydefault();
        if (c55173xeuCopydefault != null) {
            c55173xeuCopydefault.setTitle(C33070mpX.AYXKKw(C13754dXa.FragmentManager.ActivityResultContractsStartActivityForResult));
        }
        AbstractC16621enQ abstractC16621enQ3 = this.copydefault;
        if (abstractC16621enQ3 == null) {
            Intrinsics.gEmmrt("");
            abstractC16621enQ3 = null;
        }
        abstractC16621enQ3.OLrzqt.djBIcL().setCursorStyleWeb3();
        if (this.KWHzl == 0) {
            AbstractC16621enQ abstractC16621enQ4 = this.copydefault;
            if (abstractC16621enQ4 == null) {
                Intrinsics.gEmmrt("");
                abstractC16621enQ4 = null;
            }
            abstractC16621enQ4.OLrzqt.setStyle(OKAnchorSelection.OKAnchorSelectionStyle.PAGE);
        } else {
            AbstractC16621enQ abstractC16621enQ5 = this.copydefault;
            if (abstractC16621enQ5 == null) {
                Intrinsics.gEmmrt("");
                abstractC16621enQ5 = null;
            }
            abstractC16621enQ5.OLrzqt.setStyle(OKAnchorSelection.OKAnchorSelectionStyle.SHEET);
        }
        AbstractC16621enQ abstractC16621enQ6 = this.copydefault;
        if (abstractC16621enQ6 == null) {
            Intrinsics.gEmmrt("");
            abstractC16621enQ6 = null;
        }
        abstractC16621enQ6.OLrzqt.djBIcL().EZpvd().setHint(C33070mpX.AYXKKw(C13754dXa.FragmentManager.getVisualMimeTypeactivity_release));
        copydefault().OLrzqt(this.AYXKKw);
        AbstractC16621enQ abstractC16621enQ7 = this.copydefault;
        if (abstractC16621enQ7 == null) {
            Intrinsics.gEmmrt("");
            abstractC16621enQ7 = null;
        }
        final OKAnchorSelection oKAnchorSelection = abstractC16621enQ7.OLrzqt;
        C55230xfy c55230xfyDjBIcL = oKAnchorSelection.djBIcL();
        ViewGroup.LayoutParams layoutParams = c55230xfyDjBIcL.getLayoutParams();
        if (layoutParams != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            int marginStart = marginLayoutParams.getMarginStart();
            android.content.Context context = oKAnchorSelection.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            marginLayoutParams.setMarginStart(marginStart + C55298xhM.OLrzqt(8, context));
            int marginEnd = marginLayoutParams.getMarginEnd();
            android.content.Context context2 = oKAnchorSelection.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            marginLayoutParams.setMarginEnd(marginEnd + C55298xhM.OLrzqt(8, context2));
            c55230xfyDjBIcL.setLayoutParams(marginLayoutParams);
            oKAnchorSelection.setConvertViewCallback(new Function2() { // from class: o.eBK
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return eBD.copydefault(this.OLrzqt, oKAnchorSelection, (C55043xcW) obj, obj2);
                }
            });
            AbstractC16621enQ abstractC16621enQ8 = this.copydefault;
            if (abstractC16621enQ8 == null) {
                Intrinsics.gEmmrt("");
            } else {
                abstractC16621enQ2 = abstractC16621enQ8;
            }
            abstractC16621enQ2.OLrzqt.setSearchResultCallback(new Function1() { // from class: o.eBJ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return eBD.copydefault(this.EZpvd, (java.lang.CharSequence) obj);
                }
            });
            return;
        }
        throw new java.lang.NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
    }

    public static final Unit copydefault(final eBD ebd, OKAnchorSelection oKAnchorSelection, C55043xcW c55043xcW, java.lang.Object obj) {
        C10854bwM c10854bwMKWHzl;
        Intrinsics.checkNotNullParameter(c55043xcW, "");
        Intrinsics.copydefault(obj, "");
        final QuickCopyAddressItemBean quickCopyAddressItemBean = (QuickCopyAddressItemBean) obj;
        android.widget.ImageView imageView = (android.widget.ImageView) c55043xcW.EZpvd(C13754dXa.ActionBar.zAGdSp);
        if (imageView != null) {
            C57659ymb.loadFixSizeBorderImage$default(imageView, quickCopyAddressItemBean.getCoinUrl(), C14726dqr.OLrzqt.OLrzqt(), 0.0f, 0.0f, 12, null);
        }
        java.lang.String address = quickCopyAddressItemBean.getAddress();
        c55043xcW.EZpvd(C13754dXa.ActionBar.addMenuProvider, quickCopyAddressItemBean.getChainName());
        c55043xcW.EZpvd(C13754dXa.ActionBar.isAttachedToWindow, address);
        if (quickCopyAddressItemBean.getBtcAddressType() == AddressType.P2TRType.getValue() && (c10854bwMKWHzl = C10954byG.EZpvd.valueOf().KWHzl(quickCopyAddressItemBean.getCoinId())) != null && c10854bwMKWHzl.RKDWNf()) {
            android.view.View viewEZpvd = c55043xcW.EZpvd(C13754dXa.ActionBar.onComplete);
            if (viewEZpvd != null) {
                viewEZpvd.setVisibility(0);
            }
            c55043xcW.EZpvd(C13754dXa.ActionBar.suggest, C33069mpW.copydefault(ebd, C13754dXa.FragmentManager.getDescription, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56424yEw.gEmmrt(C56390yDp.OLrzqt("contractType", C33070mpX.AYXKKw(C13754dXa.FragmentManager.isPlayable)), C56390yDp.OLrzqt("contractName", C33070mpX.AYXKKw(C13754dXa.FragmentManager.writeToParcel)))));
        } else {
            android.view.View viewEZpvd2 = c55043xcW.EZpvd(C13754dXa.ActionBar.onComplete);
            if (viewEZpvd2 != null) {
                viewEZpvd2.setVisibility(8);
            }
        }
        if (quickCopyAddressItemBean.getNeedGenerateAddress()) {
            C55251xgS c55251xgS = (C55251xgS) c55043xcW.EZpvd(C13754dXa.ActionBar.addOnConfigurationChangedListener);
            if (c55251xgS != null) {
                java.lang.String addressTypeContent = quickCopyAddressItemBean.getAddressTypeContent();
                if (addressTypeContent.length() == 0) {
                    addressTypeContent = "other address";
                }
                c55251xgS.setText(addressTypeContent);
            }
            C55251xgS c55251xgS2 = (C55251xgS) c55043xcW.EZpvd(C13754dXa.ActionBar.addOnConfigurationChangedListener);
            if (c55251xgS2 != null) {
                c55251xgS2.setVisibility(0);
            }
        } else {
            C55251xgS c55251xgS3 = (C55251xgS) c55043xcW.EZpvd(C13754dXa.ActionBar.addOnConfigurationChangedListener);
            if (c55251xgS3 != null) {
                c55251xgS3.setText(quickCopyAddressItemBean.getAddressTypeContent());
            }
            C55251xgS c55251xgS4 = (C55251xgS) c55043xcW.EZpvd(C13754dXa.ActionBar.addOnConfigurationChangedListener);
            if (c55251xgS4 != null) {
                c55251xgS4.setVisibility(quickCopyAddressItemBean.getAddressTypeContent().length() == 0 ? 8 : 0);
            }
        }
        if (quickCopyAddressItemBean.getAddress().length() == 0) {
            android.view.View viewEZpvd3 = c55043xcW.EZpvd(C13754dXa.ActionBar.isAttachedToWindow);
            if (viewEZpvd3 != null) {
                viewEZpvd3.setVisibility(8);
            }
            android.view.View viewEZpvd4 = c55043xcW.EZpvd(C13754dXa.ActionBar.isInitInProgress);
            if (viewEZpvd4 != null) {
                viewEZpvd4.setVisibility(8);
            }
            android.view.View viewEZpvd5 = c55043xcW.EZpvd(C13754dXa.ActionBar.RVsVBY);
            if (viewEZpvd5 != null) {
                viewEZpvd5.setVisibility(0);
            }
            if (quickCopyAddressItemBean.getNeedGenerateAddress()) {
                C52794wYp c52794wYp = (C52794wYp) c55043xcW.EZpvd(C13754dXa.ActionBar.RVsVBY);
                if (c52794wYp != null) {
                    c52794wYp.setText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.getClipDataUrisactivity_release));
                }
            } else {
                C52794wYp c52794wYp2 = (C52794wYp) c55043xcW.EZpvd(C13754dXa.ActionBar.RVsVBY);
                if (c52794wYp2 != null) {
                    c52794wYp2.setText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.ActivityResultContractsRequestPermission));
                }
            }
        } else {
            android.view.View viewEZpvd6 = c55043xcW.EZpvd(C13754dXa.ActionBar.isAttachedToWindow);
            if (viewEZpvd6 != null) {
                viewEZpvd6.setVisibility(0);
            }
            android.view.View viewEZpvd7 = c55043xcW.EZpvd(C13754dXa.ActionBar.isInitInProgress);
            if (viewEZpvd7 != null) {
                viewEZpvd7.setVisibility(0);
            }
            android.view.View viewEZpvd8 = c55043xcW.EZpvd(C13754dXa.ActionBar.RVsVBY);
            if (viewEZpvd8 != null) {
                viewEZpvd8.setVisibility(8);
            }
        }
        android.view.View viewEZpvd9 = c55043xcW.EZpvd(C13754dXa.ActionBar.gBtXYZ);
        if (viewEZpvd9 != null) {
            viewEZpvd9.setOnClickListener(new Application(viewEZpvd9, 500L, ebd, quickCopyAddressItemBean));
        }
        android.view.View viewEZpvd10 = c55043xcW.EZpvd(C13754dXa.ActionBar.onQueueChanged);
        if (viewEZpvd10 != null) {
            viewEZpvd10.setVisibility(quickCopyAddressItemBean.getMoreAddressList().isEmpty() ^ true ? 0 : 8);
        }
        if (!quickCopyAddressItemBean.getMoreAddressList().isEmpty()) {
            LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) c55043xcW.EZpvd(C13754dXa.ActionBar.onCaptioningEnabledChanged);
            if (linearLayoutCompat != null) {
                linearLayoutCompat.removeAllViews();
            }
            c55043xcW.AEQbTJ(C13754dXa.ActionBar.onPlaybackStateChanged, new View.OnClickListener() { // from class: o.eBI
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    eBD.AEQbTJ(this.EZpvd, quickCopyAddressItemBean, view);
                }
            });
            c55043xcW.AEQbTJ(C13754dXa.ActionBar.onExtrasChanged, new View.OnClickListener() { // from class: o.eBE
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    eBD.KWHzl(this.KWHzl, quickCopyAddressItemBean, view);
                }
            });
            if (quickCopyAddressItemBean.isExpanded()) {
                android.view.View viewEZpvd11 = c55043xcW.EZpvd(C13754dXa.ActionBar.onCaptioningEnabledChanged);
                if (viewEZpvd11 != null) {
                    viewEZpvd11.setVisibility(0);
                }
                android.view.View viewEZpvd12 = c55043xcW.EZpvd(C13754dXa.ActionBar.onExtrasChanged);
                if (viewEZpvd12 != null) {
                    viewEZpvd12.setVisibility(0);
                }
                android.view.View viewEZpvd13 = c55043xcW.EZpvd(C13754dXa.ActionBar.onPlaybackStateChanged);
                if (viewEZpvd13 != null) {
                    viewEZpvd13.setVisibility(8);
                }
                for (QuickCopyAddressItemBean quickCopyAddressItemBean2 : quickCopyAddressItemBean.getMoreAddressList()) {
                    android.content.Context context = oKAnchorSelection.getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "");
                    eBA eba = new eBA(context, null, 0, 6, null);
                    eba.KWHzl(quickCopyAddressItemBean2, ebd);
                    if (linearLayoutCompat != null) {
                        linearLayoutCompat.addView(eba);
                    }
                }
            } else {
                android.view.View viewEZpvd14 = c55043xcW.EZpvd(C13754dXa.ActionBar.onCaptioningEnabledChanged);
                if (viewEZpvd14 != null) {
                    viewEZpvd14.setVisibility(8);
                }
                android.view.View viewEZpvd15 = c55043xcW.EZpvd(C13754dXa.ActionBar.onExtrasChanged);
                if (viewEZpvd15 != null) {
                    viewEZpvd15.setVisibility(8);
                }
                android.view.View viewEZpvd16 = c55043xcW.EZpvd(C13754dXa.ActionBar.onPlaybackStateChanged);
                if (viewEZpvd16 != null) {
                    viewEZpvd16.setVisibility(0);
                }
            }
        }
        return Unit.INSTANCE;
    }

    public static final void AEQbTJ(eBD ebd, QuickCopyAddressItemBean quickCopyAddressItemBean, android.view.View view) {
        ebd.copydefault().KWHzl(quickCopyAddressItemBean, true);
    }

    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ QuickCopyAddressItemBean AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ eBD copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, eBD ebd, QuickCopyAddressItemBean quickCopyAddressItemBean) {
            this.KWHzl = view;
            this.EZpvd = j;
            this.copydefault = ebd;
            this.AEQbTJ = quickCopyAddressItemBean;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.EZpvd || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                this.copydefault.EZpvd(this.AEQbTJ);
            }
        }
    }

    public static final void KWHzl(eBD ebd, QuickCopyAddressItemBean quickCopyAddressItemBean, android.view.View view) {
        ebd.copydefault().KWHzl(quickCopyAddressItemBean, false);
    }

    public static final Unit copydefault(eBD ebd, java.lang.CharSequence charSequence) {
        ebd.copydefault().AEQbTJ(java.lang.String.valueOf(charSequence));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void showToast$default(eBD ebd, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            str3 = "";
        }
        ebd.copydefault(str, str2, str3);
    }

    public final void copydefault(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        java.lang.String strCopydefault;
        if (str.length() == 0) {
            strCopydefault = getString(C13754dXa.FragmentManager.ActivityResultContractsTakeVideo);
        } else if (str3.length() > 0) {
            strCopydefault = C33069mpW.copydefault(this, C13754dXa.FragmentManager.getCallbacks, C56424yEw.AYXKKw(C56390yDp.OLrzqt("chainName", str), C56390yDp.OLrzqt(WalletSearchRequest.SEARCH_SOURCE_ADDRESS, str3)));
        } else {
            strCopydefault = C33069mpW.copydefault(this, C13754dXa.FragmentManager.getView, C56424yEw.AYXKKw(C56390yDp.OLrzqt("network", str)));
        }
        Intrinsics.copydefault((java.lang.Object) strCopydefault);
        OLrzqt(str2);
        C19595gIe.Companion.AEQbTJ(strCopydefault, str2).KWHzl(getContext());
    }

    public final void OLrzqt(java.lang.String str) {
        try {
            java.lang.Object systemService = requireActivity().getSystemService("clipboard");
            Intrinsics.copydefault(systemService, "");
            ((android.content.ClipboardManager) systemService).setPrimaryClip(android.content.ClipData.newPlainText("", str));
        } catch (java.lang.Exception e) {
            pUU.copydefault("hanbin", "error message :" + e.getMessage());
        }
    }

    public final void AEQbTJ() {
        copydefault().OLrzqt().observe(this, new Activity(new Function1() { // from class: o.eBH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return eBD.copydefault(this.copydefault, (java.lang.Boolean) obj);
            }
        }));
        copydefault().AEQbTJ().observe(this, new Activity(new Function1() { // from class: o.eBF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return eBD.KWHzl(this.AEQbTJ, (java.util.ArrayList) obj);
            }
        }));
        copydefault().copydefault().observe(this, new Activity(new Function1() { // from class: o.eBG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return eBD.copydefault(this.OLrzqt, (java.util.List) obj);
            }
        }));
        copydefault().EZpvd().observe(this, new Activity(new Function1() { // from class: o.eBM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return eBD.OLrzqt(this.copydefault, (Unit) obj);
            }
        }));
    }

    public static final Unit copydefault(eBD ebd, java.lang.Boolean bool) {
        AbstractC16621enQ abstractC16621enQ = ebd.copydefault;
        if (abstractC16621enQ == null) {
            Intrinsics.gEmmrt("");
            abstractC16621enQ = null;
        }
        abstractC16621enQ.OLrzqt.djBIcL().setVisibility(bool.booleanValue() ? 0 : 8);
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(eBD ebd, java.util.ArrayList arrayList) {
        AbstractC16621enQ abstractC16621enQ = ebd.copydefault;
        if (abstractC16621enQ == null) {
            Intrinsics.gEmmrt("");
            abstractC16621enQ = null;
        }
        OKAnchorSelection oKAnchorSelection = abstractC16621enQ.OLrzqt;
        Intrinsics.copydefault(arrayList);
        oKAnchorSelection.setSearchResultList(CollectionsKt___CollectionsKt.fJNWhG((java.util.Collection) arrayList));
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(final eBD ebd, java.util.List list) {
        AbstractC16621enQ abstractC16621enQ = ebd.copydefault;
        if (abstractC16621enQ == null) {
            Intrinsics.gEmmrt("");
            abstractC16621enQ = null;
        }
        final OKAnchorSelection oKAnchorSelection = abstractC16621enQ.OLrzqt;
        oKAnchorSelection.setDividerLineVisibility(!ebd.copydefault().valueOf());
        oKAnchorSelection.OLrzqt().setVisibility(ebd.copydefault().valueOf() ^ true ? 0 : 8);
        oKAnchorSelection.EZpvd();
        Intrinsics.copydefault(list);
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            oKAnchorSelection.OLrzqt((InterfaceC55105xdf) it.next());
        }
        oKAnchorSelection.setIndexList(ebd.copydefault().KWHzl());
        if (!ebd.AEQbTJ) {
            ebd.AEQbTJ = true;
            oKAnchorSelection.post(new java.lang.Runnable() { // from class: o.eBL
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    eBD.OLrzqt(this.copydefault, oKAnchorSelection);
                }
            });
        }
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) ebd, true, (java.lang.String) null, 2, (java.lang.Object) null);
        return Unit.INSTANCE;
    }

    public static final void OLrzqt(eBD ebd, OKAnchorSelection oKAnchorSelection) {
        ActivityResultCaller parentFragment = ebd.getParentFragment();
        InterfaceC18090fbo interfaceC18090fbo = parentFragment instanceof InterfaceC18090fbo ? (InterfaceC18090fbo) parentFragment : null;
        if (interfaceC18090fbo != null) {
            interfaceC18090fbo.OLrzqt(oKAnchorSelection.getHeight());
        }
    }

    public static final Unit OLrzqt(eBD ebd, Unit unit) {
        pUU.OLrzqt(">>>btc  expandedBtcLiveData trigger");
        AbstractC16621enQ abstractC16621enQ = ebd.copydefault;
        if (abstractC16621enQ == null) {
            Intrinsics.gEmmrt("");
            abstractC16621enQ = null;
        }
        abstractC16621enQ.OLrzqt.fetchVPNInfo();
        return Unit.INSTANCE;
    }

    public final void EZpvd(QuickCopyAddressItemBean quickCopyAddressItemBean) {
        if (quickCopyAddressItemBean.getAddress().length() == 0) {
            if (quickCopyAddressItemBean.isEos()) {
                ActivityC18568fkp.Activity activity = ActivityC18568fkp.Companion;
                FragmentActivity activity2 = getActivity();
                if (activity2 == null) {
                    return;
                }
                activity.AEQbTJ(activity2, (28 & 2) != 0 ? "" : this.AYXKKw, (28 & 4) != 0 ? "" : null, (28 & 8) != 0 ? "" : null, (28 & 16) != 0 ? "" : null);
                return;
            }
            if (quickCopyAddressItemBean.getNeedGenerateAddress()) {
                androidx.fragment.app.FragmentManager childFragmentManager = getChildFragmentManager();
                Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
                new C14461dlr(childFragmentManager, "completeAddress", null, null, null, false, 60, null).EZpvd();
                return;
            } else {
                C9930beq c9930beqEZpvd = C9930beq.Companion.EZpvd(quickCopyAddressItemBean.getCoinId());
                c9930beqEZpvd.copydefault(new Function1() { // from class: o.eBN
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return eBD.EZpvd(this.KWHzl, ((java.lang.Boolean) obj).booleanValue());
                    }
                });
                c9930beqEZpvd.show(getChildFragmentManager(), "QuickCopyAddressDialogFragment");
                return;
            }
        }
        copydefault(quickCopyAddressItemBean.getChainName(), quickCopyAddressItemBean.getAddress(), quickCopyAddressItemBean.getAddressTypeContent());
        ActivityResultCaller parentFragment = getParentFragment();
        InterfaceC18090fbo interfaceC18090fbo = parentFragment instanceof InterfaceC18090fbo ? (InterfaceC18090fbo) parentFragment : null;
        if (interfaceC18090fbo != null) {
            interfaceC18090fbo.copydefault(quickCopyAddressItemBean);
        }
    }

    public static final Unit EZpvd(eBD ebd, boolean z) {
        if (z) {
            ebd.copydefault().OLrzqt(ebd.AYXKKw);
        }
        return Unit.INSTANCE;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        WalletUpdateWorker.Application.getInstance$default(WalletUpdateWorker.Companion, null, 1, null).EZpvd(this);
    }

    @Override // com.okinc.business.defi.biz.core.wallet.update.WalletUpdateWorker.TaskDescription
    public void KWHzl() {
        pUU.OLrzqt(">>>btc onSuccess");
        copydefault().OLrzqt(this.AYXKKw);
    }

    @Override // com.okinc.business.defi.biz.core.wallet.update.WalletUpdateWorker.TaskDescription
    public void EZpvd(@NotNull java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        C55326xho.toast$default(th.getMessage(), (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
    }

    @Override // o.eBA.StateListAnimator
    public void KWHzl(@NotNull QuickCopyAddressItemBean quickCopyAddressItemBean) {
        Intrinsics.checkNotNullParameter(quickCopyAddressItemBean, "");
        EZpvd(quickCopyAddressItemBean);
    }
}
