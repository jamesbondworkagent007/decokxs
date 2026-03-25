package o;

import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.lottie.LottieAnimationView;
import com.okinc.business.market.data.model.common.ChainInfoData;
import com.okinc.business.market.data.model.common.ProtocolInfoData;
import com.okinc.business.market.features.meme.MemePumpFragment$adapter$2$5;
import com.okinc.business.market.features.meme.domain.model.ConfigInfoData;
import com.okinc.business.market.features.meme.domain.model.MemeTabType;
import com.okinc.business.market.features.meme.domain.model.MemeUiModel;
import com.okinc.business.market.features.meme.filter.domain.MemeFilter;
import com.okinc.business.market.features.meme.filter.domain.MemeFilterParams;
import com.okinc.business.market.features.meme.filter.domain.TokenAgeType;
import com.okinc.business.market.features.meme.protocol_filter.ui.MemeProtocolFilterBottomSheetParams;
import com.okinc.business.market.features.meme.selection_filter.MemeSelection;
import com.okinc.business.market.features.meme.selection_filter.MemeSelectionParams;
import com.okinc.business.market.features.meme.token_detail_sheet.ui.TokenDetailTabType;
import com.okinc.business.market.features.meme.ui.MemeActivityViewModelV2;
import com.okinc.business.utils.FragmentUtils$marketMatchViewModel$$inlined$viewModels$default$1;
import com.okinc.business.utils.FragmentUtils$marketMatchViewModel$$inlined$viewModels$default$2;
import com.okinc.business.utils.FragmentUtils$marketMatchViewModel$$inlined$viewModels$default$3;
import com.okinc.business.utils.FragmentUtils$marketMatchViewModel$$inlined$viewModels$default$4;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.liveness.lca.EopTrackEvent;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;
import o.AbstractC22421hez;
import o.C23274hvD;
import o.C28819khv;
import o.C31197lpV;
import o.C52761wXj;
import o.C57406yhn;
import o.InterfaceC28694kfc;
import o.InterfaceC28695kfd;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kdP, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C28575kdP extends AbstractC28609kdx implements InterfaceC28815khr, InterfaceC28773khB, InterfaceC28758kgn {
    public final InterfaceC56387yDm AYXKKw;
    public final InterfaceC56387yDm AkhnZx;
    public final InterfaceC56387yDm DbNXlk;
    public final InterfaceC56387yDm djBIcL;
    public boolean gEmmrt;
    public hAV valueOf;
    public boolean values;
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int AhwBna = 8;

    public static final void KWHzl(android.view.View view) {
    }

    /* JADX INFO: renamed from: o.kdP$LoaderManager */
    public static final class LoaderManager implements Function0<ViewModelStoreOwner> {
        public final /* synthetic */ androidx.fragment.app.Fragment copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public LoaderManager(androidx.fragment.app.Fragment fragment) {
            this.copydefault = fragment;
        }

        /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public final ViewModelStoreOwner invoke() {
            java.lang.Object next;
            java.util.Iterator it = C59405zgS.EZpvd(this.copydefault, (Function1<? super androidx.fragment.app.Fragment, ? extends androidx.fragment.app.Fragment>) ((Function1<? super java.lang.Object, ? extends java.lang.Object>) C31197lpV.StateListAnimator.AnonymousClass1.KWHzl)).iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (((androidx.fragment.app.Fragment) next) instanceof C28569kdJ) {
                    break;
                }
            }
            androidx.fragment.app.Fragment fragment = (androidx.fragment.app.Fragment) next;
            if (fragment != null) {
                return fragment;
            }
            FragmentActivity fragmentActivityRequireActivity = this.copydefault.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
            return fragmentActivityRequireActivity;
        }
    }

    public C28575kdP() {
        C31197lpV c31197lpV = C31197lpV.EZpvd;
        LoaderManager loaderManager = new LoaderManager(this);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(lazyThreadSafetyMode, new FragmentUtils$marketMatchViewModel$$inlined$viewModels$default$1(loaderManager));
        this.DbNXlk = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(MemeActivityViewModelV2.class), new FragmentUtils$marketMatchViewModel$$inlined$viewModels$default$2(interfaceC56387yDmEZpvd), new FragmentUtils$marketMatchViewModel$$inlined$viewModels$default$3(null, interfaceC56387yDmEZpvd), new FragmentUtils$marketMatchViewModel$$inlined$viewModels$default$4(this, interfaceC56387yDmEZpvd));
        this.AkhnZx = C31200lpY.copydefault(this);
        this.djBIcL = C56392yDr.copydefault(new Function0() { // from class: o.kdT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C28575kdP.values(this.EZpvd);
            }
        });
        this.AYXKKw = C56392yDr.EZpvd(lazyThreadSafetyMode, new Function0() { // from class: o.keg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C28575kdP.AuCTel(this.OLrzqt);
            }
        });
    }

    public final MemeActivityViewModelV2 gEmmrt() {
        return (MemeActivityViewModelV2) this.DbNXlk.getValue();
    }

    private final java.lang.String values() {
        return (java.lang.String) this.AkhnZx.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int AkhnZx() {
        android.os.Bundle arguments = getArguments();
        if (arguments != null) {
            return arguments.getInt("key.position");
        }
        return 0;
    }

    /* JADX DEBUG: Possible override for method o.kdx.OLrzqt()V */
    public final C28908kje OLrzqt() {
        return (C28908kje) this.djBIcL.getValue();
    }

    public static final C28908kje values(final C28575kdP c28575kdP) {
        int iAkhnZx = c28575kdP.AkhnZx();
        LifecycleOwner viewLifecycleOwner = c28575kdP.getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        return new C28908kje(iAkhnZx, LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), new Function1() { // from class: o.kdY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C28575kdP.EZpvd(this.AEQbTJ, (MemeUiModel) obj);
            }
        }, new Function1() { // from class: o.kdX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C28575kdP.KWHzl(this.KWHzl, (MemeUiModel) obj);
            }
        }, new Function2() { // from class: o.keb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C28575kdP.KWHzl(this.copydefault, (MemeUiModel) obj, (TokenDetailTabType) obj2);
            }
        }, new Function1() { // from class: o.kea
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C28575kdP.valueOf(this.EZpvd, (MemeUiModel) obj);
            }
        }, new MemePumpFragment$adapter$2$5(c28575kdP), new Function2() { // from class: o.kdZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C28575kdP.KWHzl(this.OLrzqt, ((java.lang.Integer) obj).intValue(), (java.lang.String) obj2);
            }
        });
    }

    public static final Unit EZpvd(C28575kdP c28575kdP, MemeUiModel memeUiModel) {
        Intrinsics.checkNotNullParameter(memeUiModel, "");
        C28648kej.copydefault(c28575kdP, memeUiModel.KWHzl(), memeUiModel.AuCTel());
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(C28575kdP c28575kdP, MemeUiModel memeUiModel) {
        Intrinsics.checkNotNullParameter(memeUiModel, "");
        AbstractC22421hez.Companion.EZpvd(AbstractC22421hez.Dialog.EZpvd);
        C28648kej.OLrzqt(c28575kdP, memeUiModel, c28575kdP.values());
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(C28575kdP c28575kdP, MemeUiModel memeUiModel, TokenDetailTabType tokenDetailTabType) {
        Intrinsics.checkNotNullParameter(memeUiModel, "");
        Intrinsics.checkNotNullParameter(tokenDetailTabType, "");
        AbstractC22421hez.Companion.EZpvd(AbstractC22421hez.Dialog.EZpvd);
        C28648kej.EZpvd(c28575kdP, memeUiModel, c28575kdP.values(), tokenDetailTabType);
        return Unit.INSTANCE;
    }

    public static final Unit valueOf(C28575kdP c28575kdP, MemeUiModel memeUiModel) {
        Intrinsics.checkNotNullParameter(memeUiModel, "");
        AbstractC22421hez.Companion.EZpvd(AbstractC22421hez.FragmentManager.OLrzqt);
        C28648kej.AEQbTJ(c28575kdP, memeUiModel, "default_trade", "meme_factory");
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(C28575kdP c28575kdP, final int i, java.lang.String str) {
        RecyclerView recyclerView;
        Intrinsics.checkNotNullParameter(str, "");
        C32866mlf.onEvent$default("DEXMarket_Memefactory_FullPage_Click", (TrackChannel[]) null, new Function1() { // from class: o.kdV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C28575kdP.copydefault(i, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
        hAV hav = c28575kdP.valueOf;
        if (hav != null && (recyclerView = hav.DbNXlk) != null) {
            C28648kej.KWHzl(recyclerView, str);
        }
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(int i, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "is_tee", "false", false, 4, null);
        EventParamsList.put$default(eventParamsList, "module", "memepump", false, 4, null);
        EventParamsList.put$default(eventParamsList, "product_type", "memepump", false, 4, null);
        EventParamsList.put$default(eventParamsList, "page_name", "memepump", false, 4, null);
        MemeTabType.StateListAnimator stateListAnimator = MemeTabType.Companion;
        EventParamsList.put$default(eventParamsList, "token_column", stateListAnimator.copydefault(stateListAnimator.AEQbTJ(i)), false, 4, null);
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_BUTTON_NAME, "token_detail_swipe", false, 4, null);
        return Unit.INSTANCE;
    }

    public static final C28607kdv AuCTel(C28575kdP c28575kdP) {
        return new C28607kdv(c28575kdP);
    }

    public final C28607kdv valueOf() {
        return (C28607kdv) this.AYXKKw.getValue();
    }

    /* JADX INFO: renamed from: o.kdP$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.kdP.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final C28575kdP OLrzqt(@NotNull java.lang.String str, int i) {
            Intrinsics.checkNotNullParameter(str, "");
            C28575kdP c28575kdP = new C28575kdP();
            android.os.Bundle bundle = new android.os.Bundle();
            C31200lpY.EZpvd(bundle, str);
            bundle.putInt("key.position", i);
            c28575kdP.setArguments(bundle);
            return c28575kdP;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        rVN.copydefault(this);
        gEmmrt().AYXKKw(AkhnZx());
        if (this.gEmmrt) {
            OLrzqt().EZpvd();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        gEmmrt().gEmmrt(AkhnZx());
        valueOf().AEQbTJ();
        if (this.gEmmrt) {
            OLrzqt().valueOf();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        if (this.gEmmrt) {
            OLrzqt().KWHzl();
        }
        valueOf().AEQbTJ();
        this.valueOf = null;
    }

    /* JADX INFO: renamed from: o.kdP$TaskDescription */
    public static final class TaskDescription<T> implements FlowCollector {
        public final /* synthetic */ hAV AEQbTJ;
        public final /* synthetic */ C28575kdP OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(hAV hav, C28575kdP c28575kdP) {
            this.AEQbTJ = hav;
            this.OLrzqt = c28575kdP;
        }

        /* JADX INFO: renamed from: o.kdP$TaskDescription$StateListAnimator */
        public static final class StateListAnimator implements View.OnClickListener {
            public final /* synthetic */ long EZpvd;
            public final /* synthetic */ boolean KWHzl;
            public final /* synthetic */ C28575kdP OLrzqt;
            public final /* synthetic */ android.view.View copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public StateListAnimator(android.view.View view, long j, boolean z, C28575kdP c28575kdP) {
                this.copydefault = view;
                this.EZpvd = j;
                this.KWHzl = z;
                this.OLrzqt = c28575kdP;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.EZpvd || (this.copydefault instanceof android.widget.Checkable)) {
                    C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                    if (this.KWHzl) {
                        this.OLrzqt.AYXKKw();
                    }
                }
            }
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        /* JADX DEBUG: Multi-variable search result rejected for r3v15, resolved type: java.lang.Object[] */
        /* JADX DEBUG: Multi-variable search result rejected for r5v15, resolved type: java.lang.Object[] */
        /* JADX DEBUG: Multi-variable search result rejected for r7v2, resolved type: byte */
        /* JADX DEBUG: Multi-variable search result rejected for r7v3, resolved type: byte */
        /* JADX DEBUG: Multi-variable search result rejected for r7v6, resolved type: byte */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object emit(C28634keV c28634keV, Continuation<? super Unit> continuation) {
            ChainInfoData chainInfoData;
            android.graphics.drawable.Drawable drawableEZpvd;
            java.lang.String strKWHzl;
            java.util.List<ChainInfoData> chainInfos;
            T next;
            T next2;
            hAV hav = this.AEQbTJ;
            C28575kdP c28575kdP = this.OLrzqt;
            java.util.List<java.lang.String> listOLrzqt = c28634keV.AEQbTJ().OLrzqt();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Iterator<T> it = listOLrzqt.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                java.lang.String str = (java.lang.String) it.next();
                java.util.Iterator<T> it2 = c28634keV.AEQbTJ().copydefault().iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        next2 = (T) null;
                        break;
                    }
                    next2 = it2.next();
                    if (Intrinsics.EZpvd((java.lang.Object) ((ProtocolInfoData) next2).getProtocolId(), (java.lang.Object) str)) {
                        break;
                    }
                }
                ProtocolInfoData protocolInfoData = next2;
                C25406iwC c25406iwC = protocolInfoData != null ? new C25406iwC(protocolInfoData.getProtocolLogo(), null, C56443yFo.AEQbTJ(C57406yhn.Activity.QKVWgx), protocolInfoData.getProtocolName(), 2, null) : null;
                if (c25406iwC != null) {
                    arrayList.add(c25406iwC);
                }
            }
            boolean z = c28634keV.AEQbTJ().copydefault().size() > 1;
            C25455iwz.setSelection$default(hav.EZpvd, arrayList, z, 0.0f, 4, null);
            C25455iwz c25455iwz = hav.EZpvd;
            c25455iwz.setOnClickListener(new StateListAnimator(c25455iwz, 1000L, z, c28575kdP));
            ConfigInfoData configInfoDataEZpvd = c28575kdP.gEmmrt().EZpvd();
            if (configInfoDataEZpvd == null || (chainInfos = configInfoDataEZpvd.getChainInfos()) == null) {
                chainInfoData = null;
            } else {
                java.util.Iterator<T> it3 = chainInfos.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        next = (T) null;
                        break;
                    }
                    next = it3.next();
                    if (Intrinsics.EZpvd((java.lang.Object) ((ChainInfoData) next).EZpvd(), (java.lang.Object) c28634keV.copydefault())) {
                        break;
                    }
                }
                chainInfoData = next;
            }
            C54989xbV c54989xbV = hav.KWHzl;
            Intrinsics.checkNotNullExpressionValue(c54989xbV, "");
            c54989xbV.setVisibility((chainInfoData != null) != false ? 0 : 8);
            android.widget.ImageView imageViewAEQbTJ = hav.KWHzl.AEQbTJ();
            imageViewAEQbTJ.setVisibility(C33129mqd.OLrzqt((java.lang.CharSequence) (chainInfoData != null ? chainInfoData.KWHzl() : null)) ? 0 : 8);
            if (chainInfoData != null && (strKWHzl = chainInfoData.KWHzl()) != null) {
                C33054mpH.AEQbTJ(imageViewAEQbTJ, strKWHzl);
                android.widget.TextView textViewEZpvd = hav.KWHzl.EZpvd();
                ViewGroup.LayoutParams layoutParams = textViewEZpvd.getLayoutParams();
                if (layoutParams != null) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
                    if (marginLayoutParams != null) {
                        C55296xhK.AEQbTJ(marginLayoutParams, C55298xhM.dpInt$default(4.0f, (android.content.Context) null, 1, (java.lang.Object) null), 0, 0, 0);
                    }
                    textViewEZpvd.setLayoutParams(layoutParams);
                } else {
                    throw new java.lang.NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                }
            }
            android.widget.TextView textViewEZpvd2 = hav.KWHzl.EZpvd();
            java.lang.String strOLrzqt = chainInfoData != null ? chainInfoData.OLrzqt() : null;
            if (strOLrzqt == null) {
                strOLrzqt = "";
            }
            textViewEZpvd2.setText(strOLrzqt);
            android.widget.ImageView imageView = hav.OLrzqt;
            if (c28634keV.OLrzqt()) {
                int i = C52761wXj.TaskDescription.GVpNrs;
                android.content.Context context = hav.OLrzqt.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                drawableEZpvd = C33070mpX.EZpvd(i, context);
            } else {
                int i2 = C52761wXj.TaskDescription.dPnHjp;
                android.content.Context context2 = hav.OLrzqt.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "");
                drawableEZpvd = C33070mpX.EZpvd(i2, context2);
            }
            imageView.setImageDrawable(drawableEZpvd);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: o.kdP$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ C28575kdP EZpvd;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, C28575kdP c28575kdP) {
            this.KWHzl = view;
            this.copydefault = j;
            this.EZpvd = c28575kdP;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.copydefault || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                this.EZpvd.gEmmrt().copydefault(this.EZpvd.AkhnZx(), true);
            }
        }
    }

    /* JADX INFO: renamed from: o.kdP$Dialog */
    public static final class Dialog implements View.OnClickListener {
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ C28575kdP copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Dialog(android.view.View view, long j, C28575kdP c28575kdP) {
            this.EZpvd = view;
            this.OLrzqt = j;
            this.copydefault = c28575kdP;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.OLrzqt || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                this.copydefault.djBIcL();
            }
        }
    }

    /* JADX INFO: renamed from: o.kdP$Fragment */
    public static final class Fragment implements View.OnClickListener {
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ C28575kdP OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Fragment(android.view.View view, long j, C28575kdP c28575kdP) {
            this.EZpvd = view;
            this.copydefault = j;
            this.OLrzqt = c28575kdP;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.copydefault || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                this.OLrzqt.AYXKKw();
            }
        }
    }

    /* JADX INFO: renamed from: o.kdP$FragmentManager */
    public static final class FragmentManager implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ android.view.View OLrzqt;
        public final /* synthetic */ C28575kdP copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public FragmentManager(android.view.View view, long j, C28575kdP c28575kdP) {
            this.OLrzqt = view;
            this.AEQbTJ = j;
            this.copydefault = c28575kdP;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.AEQbTJ || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                this.copydefault.DbNXlk();
            }
        }
    }

    /* JADX INFO: renamed from: o.kdP$PendingIntent */
    public static final class PendingIntent implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ C28575kdP EZpvd;
        public final /* synthetic */ android.view.View KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public PendingIntent(android.view.View view, long j, C28575kdP c28575kdP) {
            this.KWHzl = view;
            this.AEQbTJ = j;
            this.EZpvd = c28575kdP;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.AEQbTJ || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                this.EZpvd.gEmmrt().EZpvd(this.EZpvd.AkhnZx(), true);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean z) {
        super.onHiddenChanged(z);
        if (!z) {
            if (this.gEmmrt) {
                OLrzqt().EZpvd();
            }
        } else {
            C28648kej.OLrzqt(this);
            valueOf().AEQbTJ();
            if (this.gEmmrt) {
                OLrzqt().valueOf();
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public android.view.View onCreateView(@NotNull android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        hAV havCopydefault = hAV.copydefault(layoutInflater, viewGroup, false);
        this.valueOf = havCopydefault;
        ConstraintLayout root = havCopydefault.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        return root;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        fetchVPNInfo();
        isConnected();
    }

    public final void fetchVPNInfo() {
        hAV hav = this.valueOf;
        if (hav != null) {
            RecyclerView recyclerView = hav.DbNXlk;
            C28908kje c28908kjeOLrzqt = OLrzqt();
            this.gEmmrt = true;
            recyclerView.setAdapter(c28908kjeOLrzqt);
            hav.DbNXlk.setItemAnimator(null);
            hav.DbNXlk.addOnScrollListener(C28648kej.AEQbTJ(new Function0() { // from class: o.keh
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return java.lang.Boolean.valueOf(C28575kdP.fIwbmz(this.copydefault));
                }
            }, new Function0() { // from class: o.kel
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C28575kdP.fJNWhG(this.EZpvd);
                }
            }, new Function0() { // from class: o.kek
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C28575kdP.ejfBZ(this.OLrzqt);
                }
            }, new Function0() { // from class: o.kdU
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return java.lang.Boolean.valueOf(C28575kdP.fARcdN(this.OLrzqt));
                }
            }, new Function0() { // from class: o.kdS
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C28575kdP.iwGUEr(this.copydefault);
                }
            }, new Function0() { // from class: o.kdW
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C28575kdP.getNewProxyInstance(this.OLrzqt);
                }
            }));
            android.widget.ImageView imageView = hav.valueOf;
            imageView.setOnClickListener(new ActionBar(imageView, 1000L, this));
            LottieAnimationView lottieAnimationView = hav.AEQbTJ;
            lottieAnimationView.setOnClickListener(new PendingIntent(lottieAnimationView, 1000L, this));
            android.widget.ImageView imageView2 = hav.OLrzqt;
            imageView2.setOnClickListener(new Dialog(imageView2, 1000L, this));
            C54989xbV c54989xbV = hav.KWHzl;
            c54989xbV.setOnClickListener(new FragmentManager(c54989xbV, 1000L, this));
            C25455iwz c25455iwz = hav.EZpvd;
            c25455iwz.setOnClickListener(new Fragment(c25455iwz, 1000L, this));
        }
    }

    public static final boolean fIwbmz(C28575kdP c28575kdP) {
        return c28575kdP.values;
    }

    public static final Unit fJNWhG(C28575kdP c28575kdP) {
        c28575kdP.gEmmrt().copydefault(c28575kdP.AkhnZx(), false);
        return Unit.INSTANCE;
    }

    public static final Unit ejfBZ(C28575kdP c28575kdP) {
        MemeActivityViewModelV2.pauseUpdates$default(c28575kdP.gEmmrt(), c28575kdP.AkhnZx(), false, 2, null);
        return Unit.INSTANCE;
    }

    public static final boolean fARcdN(C28575kdP c28575kdP) {
        return !((((StateFlow) CollectionsKt___CollectionsKt.AkhnZx(c28575kdP.gEmmrt().copydefault(), c28575kdP.AkhnZx())) != null ? (InterfaceC28695kfd) r1.getValue() : null) instanceof InterfaceC28695kfd.Activity);
    }

    public static final Unit iwGUEr(C28575kdP c28575kdP) {
        c28575kdP.OLrzqt().copydefault();
        return Unit.INSTANCE;
    }

    public static final Unit getNewProxyInstance(C28575kdP c28575kdP) {
        c28575kdP.values = false;
        return Unit.INSTANCE;
    }

    private final void isConnected() {
        StateFlow stateFlow = (StateFlow) CollectionsKt___CollectionsKt.AkhnZx(gEmmrt().AEQbTJ(), AkhnZx());
        if (stateFlow != null) {
            C25390ivn.collectOnViewLifecycle$default(this, stateFlow, null, new Application(), 2, null);
        }
    }

    /* JADX INFO: renamed from: o.kdP$Application */
    public static final class Application<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object emit(InterfaceC28694kfc interfaceC28694kfc, Continuation<? super Unit> continuation) {
            C28575kdP.this.AEQbTJ(interfaceC28694kfc);
            return Unit.INSTANCE;
        }
    }

    public final void AEQbTJ(InterfaceC28694kfc interfaceC28694kfc) {
        RecyclerView recyclerView;
        final hAV hav = this.valueOf;
        if (hav != null) {
            boolean z = interfaceC28694kfc instanceof InterfaceC28694kfc.TaskDescription;
            if (!z) {
                hav.AYXKKw.copydefault();
            }
            C55113xdn c55113xdn = hav.AYXKKw;
            Intrinsics.checkNotNullExpressionValue(c55113xdn, "");
            int i = 0;
            c55113xdn.setVisibility(z ? 0 : 8);
            boolean z2 = interfaceC28694kfc instanceof InterfaceC28694kfc.Application;
            if (!z2) {
                OLrzqt().submitList(yDY.AhwBna());
            }
            RecyclerView recyclerView2 = hav.DbNXlk;
            Intrinsics.checkNotNullExpressionValue(recyclerView2, "");
            recyclerView2.setVisibility(z2 ? 0 : 8);
            C55173xeu c55173xeu = hav.copydefault;
            Intrinsics.checkNotNullExpressionValue(c55173xeu, "");
            if (!(interfaceC28694kfc instanceof InterfaceC28694kfc.Activity) && !(interfaceC28694kfc instanceof InterfaceC28694kfc.StateListAnimator)) {
                i = 8;
            }
            c55173xeu.setVisibility(i);
            if (z2) {
                rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) this, true, (java.lang.String) null, 2, (java.lang.Object) null);
                hAV hav2 = this.valueOf;
                if (hav2 != null && (recyclerView = hav2.DbNXlk) != null) {
                    InterfaceC28694kfc.Application application = (InterfaceC28694kfc.Application) interfaceC28694kfc;
                    valueOf().EZpvd(application.KWHzl(), application.EZpvd(), recyclerView, AkhnZx(), gEmmrt());
                }
                C28908kje c28908kjeOLrzqt = OLrzqt();
                this.gEmmrt = true;
                c28908kjeOLrzqt.submitList(((InterfaceC28694kfc.Application) interfaceC28694kfc).KWHzl(), new java.lang.Runnable() { // from class: o.kef
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // java.lang.Runnable
                    public final void run() {
                        C28575kdP.AEQbTJ(hav, this);
                    }
                });
            } else if (Intrinsics.EZpvd(interfaceC28694kfc, InterfaceC28694kfc.Activity.KWHzl)) {
                C55173xeu c55173xeu2 = hav.copydefault;
                c55173xeu2.setEmptyTypeImage(7);
                java.lang.String string = c55173xeu2.getContext().getString(C23274hvD.Fragment.isConnected);
                Intrinsics.checkNotNullExpressionValue(string, "");
                c55173xeu2.setTitle(string);
                java.lang.String string2 = c55173xeu2.getContext().getString(C23274hvD.Fragment.EZpvd);
                Intrinsics.checkNotNullExpressionValue(string2, "");
                c55173xeu2.setRetry(string2);
                c55173xeu2.setRetryClickListener(new View.OnClickListener() { // from class: o.ked
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // android.view.View.OnClickListener
                    public final void onClick(android.view.View view) {
                        C28575kdP.copydefault(this.KWHzl, view);
                    }
                });
                Intrinsics.copydefault(c55173xeu2);
            } else if (Intrinsics.EZpvd(interfaceC28694kfc, InterfaceC28694kfc.TaskDescription.EZpvd)) {
                C55113xdn.showLoading$default(hav.AYXKKw, 0L, 1, null);
            } else {
                if (!Intrinsics.EZpvd(interfaceC28694kfc, InterfaceC28694kfc.StateListAnimator.copydefault)) {
                    throw new NoWhenBranchMatchedException();
                }
                final C28634keV c28634keVAEQbTJ = gEmmrt().AEQbTJ(AkhnZx());
                C55173xeu c55173xeu3 = hav.copydefault;
                if (c28634keVAEQbTJ.KWHzl().equals(new MemeFilter((java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (TokenAgeType) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.util.List) null, 0, -1, 31, (DefaultConstructorMarker) null))) {
                    c55173xeu3.setEmptyTypeImage(6);
                    java.lang.String string3 = c55173xeu3.getContext().getString(C23274hvD.Fragment.AkhnZx);
                    Intrinsics.checkNotNullExpressionValue(string3, "");
                    c55173xeu3.setTitle(string3);
                    c55173xeu3.setRetry("");
                    c55173xeu3.setRetryClickListener(new View.OnClickListener() { // from class: o.kee
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // android.view.View.OnClickListener
                        public final void onClick(android.view.View view) {
                            C28575kdP.KWHzl(view);
                        }
                    });
                } else {
                    c55173xeu3.setEmptyTypeImage(7);
                    java.lang.String string4 = c55173xeu3.getContext().getString(C23274hvD.Fragment.isConnected);
                    Intrinsics.checkNotNullExpressionValue(string4, "");
                    c55173xeu3.setTitle(string4);
                    java.lang.String string5 = c55173xeu3.getContext().getString(C23274hvD.Fragment.MediaControllerCompatApi21Callback);
                    Intrinsics.checkNotNullExpressionValue(string5, "");
                    c55173xeu3.setRetry(string5);
                    c55173xeu3.setRetryClickListener(new View.OnClickListener() { // from class: o.kec
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // android.view.View.OnClickListener
                        public final void onClick(android.view.View view) {
                            C28575kdP.copydefault(this.AEQbTJ, c28634keVAEQbTJ, view);
                        }
                    });
                }
                Intrinsics.copydefault(c55173xeu3);
            }
            StateFlow stateFlow = (StateFlow) CollectionsKt___CollectionsKt.AkhnZx(gEmmrt().copydefault(), AkhnZx());
            if (stateFlow != null) {
                C25390ivn.collectOnViewLifecycle$default(this, stateFlow, null, new Activity(hav, this), 2, null);
            }
            StateFlow stateFlow2 = (StateFlow) CollectionsKt___CollectionsKt.AkhnZx(gEmmrt().OLrzqt(), AkhnZx());
            if (stateFlow2 != null) {
                C25390ivn.collectOnViewLifecycle$default(this, stateFlow2, null, new TaskDescription(hav, this), 2, null);
            }
        }
    }

    public static final void AEQbTJ(hAV hav, C28575kdP c28575kdP) {
        if (hav.DbNXlk.getScrollState() == 0) {
            StateFlow stateFlow = (StateFlow) CollectionsKt___CollectionsKt.AkhnZx(c28575kdP.gEmmrt().copydefault(), c28575kdP.AkhnZx());
            if ((stateFlow != null ? (InterfaceC28695kfd) stateFlow.getValue() : null) instanceof InterfaceC28695kfd.ActionBar) {
                c28575kdP.values = true;
                hav.DbNXlk.scrollToPosition(0);
            }
        }
    }

    public static final void copydefault(C28575kdP c28575kdP, android.view.View view) {
        c28575kdP.gEmmrt().djBIcL(c28575kdP.AkhnZx());
    }

    public static final void copydefault(C28575kdP c28575kdP, C28634keV c28634keV, android.view.View view) {
        MemeActivityViewModelV2.modifyTabFilter$default(c28575kdP.gEmmrt(), c28575kdP.AkhnZx(), c28634keV.copydefault(), c28634keV.AEQbTJ(), new MemeFilter((java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (TokenAgeType) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.util.List) null, 0, -1, 31, (DefaultConstructorMarker) null), false, 16, null);
    }

    /* JADX INFO: renamed from: o.kdP$Activity */
    public static final class Activity<T> implements FlowCollector {
        public final /* synthetic */ C28575kdP AEQbTJ;
        public final /* synthetic */ hAV KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(hAV hav, C28575kdP c28575kdP) {
            this.KWHzl = hav;
            this.AEQbTJ = c28575kdP;
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object emit(InterfaceC28695kfd interfaceC28695kfd, Continuation<? super Unit> continuation) {
            hAV hav = this.KWHzl;
            C28575kdP c28575kdP = this.AEQbTJ;
            if (C22416heu.ejfBZ()) {
                LottieAnimationView lottieAnimationView = hav.AEQbTJ;
                Intrinsics.checkNotNullExpressionValue(lottieAnimationView, "");
                lottieAnimationView.setVisibility(8);
                hav.AEQbTJ.pauseAnimation();
                return Unit.INSTANCE;
            }
            if (Intrinsics.EZpvd(interfaceC28695kfd, InterfaceC28695kfd.ActionBar.KWHzl) || Intrinsics.EZpvd(interfaceC28695kfd, InterfaceC28695kfd.Activity.copydefault)) {
                android.widget.ImageView imageView = hav.valueOf;
                Intrinsics.checkNotNullExpressionValue(imageView, "");
                imageView.setVisibility(8);
                LottieAnimationView lottieAnimationView2 = hav.AEQbTJ;
                Intrinsics.checkNotNullExpressionValue(lottieAnimationView2, "");
                lottieAnimationView2.setVisibility(0);
                if (hav.DbNXlk.getScrollState() != 1 && (interfaceC28695kfd instanceof InterfaceC28695kfd.ActionBar)) {
                    c28575kdP.values = true;
                    hav.DbNXlk.scrollToPosition(0);
                }
            } else {
                if (!Intrinsics.EZpvd(interfaceC28695kfd, InterfaceC28695kfd.Application.EZpvd) && !Intrinsics.EZpvd(interfaceC28695kfd, InterfaceC28695kfd.StateListAnimator.OLrzqt)) {
                    throw new NoWhenBranchMatchedException();
                }
                android.widget.ImageView imageView2 = hav.valueOf;
                Intrinsics.checkNotNullExpressionValue(imageView2, "");
                imageView2.setVisibility(0);
                LottieAnimationView lottieAnimationView3 = hav.AEQbTJ;
                Intrinsics.checkNotNullExpressionValue(lottieAnimationView3, "");
                lottieAnimationView3.setVisibility(8);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void DbNXlk() {
        ConstraintLayout root;
        android.content.Context context;
        java.util.List listAhwBna;
        java.util.List<ChainInfoData> chainInfos;
        hAV hav = this.valueOf;
        if (hav == null || (root = hav.getRoot()) == null || (context = root.getContext()) == null) {
            return;
        }
        ConfigInfoData configInfoDataEZpvd = gEmmrt().EZpvd();
        if (configInfoDataEZpvd == null || (chainInfos = configInfoDataEZpvd.getChainInfos()) == null) {
            listAhwBna = yDY.AhwBna();
        } else {
            listAhwBna = new java.util.ArrayList(C56403yEb.AYXKKw(chainInfos, 10));
            int i = 0;
            for (java.lang.Object obj : chainInfos) {
                if (i < 0) {
                    yDY.AYXKKw();
                }
                ChainInfoData chainInfoData = (ChainInfoData) obj;
                java.lang.String strEZpvd = chainInfoData.EZpvd();
                listAhwBna.add(new MemeSelection(chainInfoData.OLrzqt(), null, chainInfoData.KWHzl(), java.lang.Integer.valueOf(C57406yhn.Activity.QKVWgx), Intrinsics.EZpvd((java.lang.Object) chainInfoData.EZpvd(), (java.lang.Object) gEmmrt().AEQbTJ(AkhnZx()).copydefault()), strEZpvd, i == 0 ? "web3_dex_market_pump_first_chain_selection_item" : "", 2, null));
                i++;
            }
        }
        C28819khv.StateListAnimator stateListAnimator = C28819khv.Companion;
        java.lang.String string = context.getString(C23274hvD.Fragment.ActivityResultRegistryOwner);
        Intrinsics.checkNotNullExpressionValue(string, "");
        stateListAnimator.KWHzl(new MemeSelectionParams(listAhwBna, string, AkhnZx())).show(getChildFragmentManager(), "DexSelectionBottomSheet");
    }

    public final void AYXKKw() {
        C25455iwz c25455iwz;
        hAV hav = this.valueOf;
        if (hav != null && (c25455iwz = hav.EZpvd) != null) {
            c25455iwz.KWHzl(true);
        }
        C28811khn c28811khnKWHzl = C28811khn.Companion.KWHzl(new MemeProtocolFilterBottomSheetParams(gEmmrt().AEQbTJ(AkhnZx()).AEQbTJ(), AkhnZx()));
        androidx.fragment.app.FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        c28811khnKWHzl.show(childFragmentManager);
    }

    public final void djBIcL() {
        if (getChildFragmentManager().findFragmentByTag("MemeFilterBottomSheet") != null) {
            return;
        }
        C28757kgm.Companion.KWHzl(new MemeFilterParams(gEmmrt().AEQbTJ(AkhnZx()).KWHzl(), null, null, 0, false, 30, null)).show(getChildFragmentManager(), "MemeFilterBottomSheet");
    }

    @Override // o.InterfaceC28815khr
    public void EZpvd(@NotNull java.util.List<java.lang.String> list, int i) {
        C25455iwz c25455iwz;
        Intrinsics.checkNotNullParameter(list, "");
        hAV hav = this.valueOf;
        if (hav != null && (c25455iwz = hav.EZpvd) != null) {
            c25455iwz.KWHzl(false);
        }
        gEmmrt().OLrzqt(i, list);
    }

    @Override // o.InterfaceC28815khr
    public void AhwBna() {
        C25455iwz c25455iwz;
        hAV hav = this.valueOf;
        if (hav == null || (c25455iwz = hav.EZpvd) == null) {
            return;
        }
        c25455iwz.KWHzl(false);
    }

    public final void KWHzl(kotlin.Pair<java.lang.Integer, java.lang.Integer> pair, MemeUiModel memeUiModel, int i) {
        C28648kej.EZpvd(this, pair, memeUiModel, i, gEmmrt(), OLrzqt(), new Function0() { // from class: o.kdQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C28575kdP.getFieldNames(this.AEQbTJ);
            }
        });
    }

    public static final Unit getFieldNames(C28575kdP c28575kdP) {
        C28648kej.KWHzl(c28575kdP);
        return Unit.INSTANCE;
    }

    @Override // o.InterfaceC28773khB
    public void copydefault(MemeSelection memeSelection, int i) {
        java.lang.String strKWHzl;
        if (memeSelection == null || (strKWHzl = memeSelection.KWHzl()) == null) {
            return;
        }
        gEmmrt().KWHzl(i, strKWHzl);
    }

    @Override // o.InterfaceC28758kgn
    public void OLrzqt(@NotNull MemeFilter memeFilter, @NotNull java.util.List<java.lang.String> list, @NotNull java.util.List<java.lang.String> list2, boolean z) {
        RecyclerView recyclerView;
        Intrinsics.checkNotNullParameter(memeFilter, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        MemeActivityViewModelV2.onLocalFilterSet$default(gEmmrt(), AkhnZx(), memeFilter, null, z, 4, null);
        hAV hav = this.valueOf;
        if (hav == null || (recyclerView = hav.DbNXlk) == null) {
            return;
        }
        recyclerView.scrollToPosition(0);
    }
}
