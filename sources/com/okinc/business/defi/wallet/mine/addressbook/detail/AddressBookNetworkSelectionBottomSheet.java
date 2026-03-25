package com.okinc.business.defi.wallet.mine.addressbook.detail;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.Checkable;
import android.widget.EditText;
import android.widget.ImageView;
import androidx.annotation.DrawableRes;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.okinc.business.defi.wallet.mine.addressbook.detail.AddressBookNetworkSelectionBottomSheet;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParam;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.liveness.lca.EopTrackEvent;
import com.okinc.uilab.list.OKAnchorSelection;
import com.okinc.web3.security.track.Web3SecurityTrackEvent;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.LazyThreadSafetyMode;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.AbstractC16417ejY;
import o.AbstractC18712fna;
import o.C10854bwM;
import o.C10954byG;
import o.C13754dXa;
import o.C13784dYd;
import o.C32866mlf;
import o.C33054mpH;
import o.C33069mpW;
import o.C52761wXj;
import o.C52781wYc;
import o.C52794wYp;
import o.C55043xcW;
import o.C55173xeu;
import o.C55296xhK;
import o.C55298xhM;
import o.C56390yDp;
import o.C56392yDr;
import o.C56403yEb;
import o.C56424yEw;
import o.C56444yFp;
import o.C56524yIo;
import o.C6777aVl;
import o.InterfaceC55105xdf;
import o.InterfaceC56387yDm;
import o.InterfaceC56445yFq;
import o.ViewOnClickListenerC54939xaY;
import o.pUU;
import o.wYF;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
public final class AddressBookNetworkSelectionBottomSheet extends AbstractC18712fna {
    public static final Application Companion = new Application(null);
    public static final int EZpvd = 8;
    public AbstractC16417ejY AEQbTJ;
    public StateListAnimator OLrzqt;
    public final InterfaceC56387yDm copydefault;

    public interface StateListAnimator {
        void KWHzl(@NotNull List<AddressChainUiData> list);
    }

    @Override // o.wXX
    public boolean getHasFooter() {
        return true;
    }

    public AddressBookNetworkSelectionBottomSheet() {
        final Function0<Fragment> function0 = new Function0<Fragment>() { // from class: com.okinc.business.defi.wallet.mine.addressbook.detail.AddressBookNetworkSelectionBottomSheet$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.business.defi.wallet.mine.addressbook.detail.AddressBookNetworkSelectionBottomSheet$special$$inlined$viewModels$default$2
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
        this.copydefault = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(AddressBookNetworkSelectionViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.defi.wallet.mine.addressbook.detail.AddressBookNetworkSelectionBottomSheet$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.defi.wallet.mine.addressbook.detail.AddressBookNetworkSelectionBottomSheet$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.defi.wallet.mine.addressbook.detail.AddressBookNetworkSelectionBottomSheet$special$$inlined$viewModels$default$5
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
    }

    /* JADX DEBUG: Possible override for method o.fna.KWHzl()V */
    public final AddressBookNetworkSelectionViewModel KWHzl() {
        return (AddressBookNetworkSelectionViewModel) this.copydefault.getValue();
    }

    @Override // o.AbstractC18712fna, o.wXX, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onAttach(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        super.onAttach(context);
        setDynamicFullScreen(true);
        try {
            Object parentFragment = getParentFragment();
            if (parentFragment == null) {
                parentFragment = getActivity();
            }
            Intrinsics.copydefault(parentFragment, "");
            this.OLrzqt = (StateListAnimator) parentFragment;
        } catch (ClassCastException e) {
            C6777aVl.Companion.EZpvd(new IllegalStateException("AddressBookNetworkSelectionBottomSheet:: OnNetworkChainsSelectedListener is not set. Have you implemented OnNetworkChainsSelectedListener in your host fragment or activity?"));
            pUU.KWHzl(e);
        }
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull C52781wYc c52781wYc) {
        Intrinsics.checkNotNullParameter(c52781wYc, "");
        super.onCreateHeader(c52781wYc);
        Context context = getContext();
        if (context == null) {
            return;
        }
        c52781wYc.setType(9);
        String string = context.getString(C13754dXa.FragmentManager.INotificationSideChannelDefault);
        Intrinsics.checkNotNullExpressionValue(string, "");
        c52781wYc.setTitle(string);
    }

    @Override // o.wXX, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        Dialog dialog = getDialog();
        Intrinsics.copydefault(dialog, "");
        ((BottomSheetDialog) dialog).getBehavior().setSkipCollapsed(true);
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        String strDjBIcL;
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        Context context = getContext();
        if (context == null) {
            return;
        }
        AbstractC16417ejY abstractC16417ejYAEQbTJ = AbstractC16417ejY.AEQbTJ(getCustomLayoutInflater(), constraintLayout, false);
        this.AEQbTJ = abstractC16417ejYAEQbTJ;
        AbstractC16417ejY abstractC16417ejY = null;
        if (abstractC16417ejYAEQbTJ == null) {
            Intrinsics.gEmmrt("");
            abstractC16417ejYAEQbTJ = null;
        }
        abstractC16417ejYAEQbTJ.EZpvd.setDividerLineVisibility(false);
        AbstractC16417ejY abstractC16417ejY2 = this.AEQbTJ;
        if (abstractC16417ejY2 == null) {
            Intrinsics.gEmmrt("");
            abstractC16417ejY2 = null;
        }
        abstractC16417ejY2.EZpvd.setStyle(OKAnchorSelection.OKAnchorSelectionStyle.SHEET);
        AbstractC16417ejY abstractC16417ejY3 = this.AEQbTJ;
        if (abstractC16417ejY3 == null) {
            Intrinsics.gEmmrt("");
            abstractC16417ejY3 = null;
        }
        ViewGroup.LayoutParams layoutParams = abstractC16417ejY3.EZpvd.djBIcL().getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            marginLayoutParams.setMarginStart(C55298xhM.dpInt$default(24, (Context) null, 1, (Object) null));
            marginLayoutParams.setMarginEnd(C55298xhM.dpInt$default(24, (Context) null, 1, (Object) null));
            AbstractC16417ejY abstractC16417ejY4 = this.AEQbTJ;
            if (abstractC16417ejY4 == null) {
                Intrinsics.gEmmrt("");
                abstractC16417ejY4 = null;
            }
            abstractC16417ejY4.EZpvd.djBIcL().setLayoutParams(marginLayoutParams);
        }
        AbstractC16417ejY abstractC16417ejY5 = this.AEQbTJ;
        if (abstractC16417ejY5 == null) {
            Intrinsics.gEmmrt("");
            abstractC16417ejY5 = null;
        }
        EditText editTextEZpvd = abstractC16417ejY5.EZpvd.djBIcL().EZpvd();
        editTextEZpvd.setHint(context.getString(C13754dXa.FragmentManager.notifyNotificationWithChannel));
        editTextEZpvd.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: o.fmS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(android.view.View view, boolean z) {
                AddressBookNetworkSelectionBottomSheet.AEQbTJ(this.OLrzqt, view, z);
            }
        });
        AbstractC16417ejY abstractC16417ejY6 = this.AEQbTJ;
        if (abstractC16417ejY6 == null) {
            Intrinsics.gEmmrt("");
            abstractC16417ejY6 = null;
        }
        constraintLayout.addView(abstractC16417ejY6.EZpvd, new ConstraintLayout.LayoutParams(-1, -2));
        AbstractC16417ejY abstractC16417ejY7 = this.AEQbTJ;
        if (abstractC16417ejY7 == null) {
            Intrinsics.gEmmrt("");
            abstractC16417ejY7 = null;
        }
        abstractC16417ejY7.EZpvd.EZpvd();
        List listAhwBna = yDY.AhwBna(context.getString(C13754dXa.FragmentManager.notify), context.getString(C13754dXa.FragmentManager.INotificationSideChannel));
        ArrayList<InterfaceC55105xdf> arrayList = new ArrayList();
        String string = context.getString(C13754dXa.FragmentManager.INotificationSideChannel);
        Intrinsics.checkNotNullExpressionValue(string, "");
        List<Object> listAhwBna2 = yDY.AhwBna(new QuickSelectionItem(string, C52761wXj.TaskDescription.createSocket, false, QuickSelectionItem.NetworkType.ALL_NETWORKS, 4, null));
        if (KWHzl().gEmmrt()) {
            String string2 = context.getString(C13754dXa.FragmentManager.ITrustedWebActivityServiceStub);
            Intrinsics.checkNotNullExpressionValue(string2, "");
            listAhwBna2.add(new QuickSelectionItem(string2, C13754dXa.Activity.QfsBiF, false, QuickSelectionItem.NetworkType.EVM_NETWORKS, 4, null));
        }
        if (KWHzl().fetchVPNInfo()) {
            String string3 = context.getString(C13754dXa.FragmentManager.isDrawerSlideAnimationEnabled);
            Intrinsics.checkNotNullExpressionValue(string3, "");
            listAhwBna2.add(new QuickSelectionItem(string3, C13754dXa.Activity.QbewEr, false, QuickSelectionItem.NetworkType.SVM_NETWORKS, 4, null));
        }
        if (KWHzl().valueOf()) {
            String string4 = context.getString(C13754dXa.FragmentManager.hkDICb);
            Intrinsics.checkNotNullExpressionValue(string4, "");
            listAhwBna2.add(new QuickSelectionItem(string4, C13754dXa.Activity.QUSxYX, false, QuickSelectionItem.NetworkType.APTOS_NETWORKS, 4, null));
        }
        if (KWHzl().AhwBna()) {
            int i = C13754dXa.FragmentManager.read;
            Pair[] pairArr = new Pair[1];
            C10854bwM c10854bwMCopydefault = C10954byG.EZpvd.valueOf().copydefault();
            if (c10854bwMCopydefault == null || (strDjBIcL = c10854bwMCopydefault.djBIcL()) == null) {
                strDjBIcL = "";
            }
            pairArr[0] = C56390yDp.OLrzqt("chainName", strDjBIcL);
            listAhwBna2.add(new QuickSelectionItem(C33069mpW.KWHzl(context, i, C56424yEw.AYXKKw(pairArr)), C13754dXa.Activity.QVAiDq, false, QuickSelectionItem.NetworkType.BTC_NETWORKS, 4, null));
        }
        final List<Object> listFJNWhG = CollectionsKt___CollectionsKt.fJNWhG((Collection) KWHzl().djBIcL());
        arrayList.add(new C13784dYd(true, (String) listAhwBna.get(0), listAhwBna2));
        arrayList.add(new C13784dYd(true, (String) listAhwBna.get(1), listFJNWhG));
        for (InterfaceC55105xdf interfaceC55105xdf : arrayList) {
            AbstractC16417ejY abstractC16417ejY8 = this.AEQbTJ;
            if (abstractC16417ejY8 == null) {
                Intrinsics.gEmmrt("");
                abstractC16417ejY8 = null;
            }
            abstractC16417ejY8.EZpvd.OLrzqt(interfaceC55105xdf);
        }
        OLrzqt(listAhwBna2);
        copydefault(listAhwBna2);
        djBIcL(listAhwBna2);
        EZpvd(listAhwBna2);
        KWHzl(listAhwBna2);
        AEQbTJ(listFJNWhG);
        AbstractC16417ejY abstractC16417ejY9 = this.AEQbTJ;
        if (abstractC16417ejY9 == null) {
            Intrinsics.gEmmrt("");
            abstractC16417ejY9 = null;
        }
        abstractC16417ejY9.EZpvd.OLrzqt().setVisibility(8);
        AbstractC16417ejY abstractC16417ejY10 = this.AEQbTJ;
        if (abstractC16417ejY10 == null) {
            Intrinsics.gEmmrt("");
            abstractC16417ejY10 = null;
        }
        OKAnchorSelection oKAnchorSelection = abstractC16417ejY10.EZpvd;
        oKAnchorSelection.setConvertViewCallback(new Function2() { // from class: o.fmY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return AddressBookNetworkSelectionBottomSheet.OLrzqt(this.AEQbTJ, (C55043xcW) obj, obj2);
            }
        });
        C55173xeu c55173xeuCopydefault = oKAnchorSelection.copydefault();
        if (c55173xeuCopydefault != null) {
            String string5 = context.getString(C13754dXa.FragmentManager.MediaBrowserCompatSubscription);
            Intrinsics.checkNotNullExpressionValue(string5, "");
            c55173xeuCopydefault.setSubTitle((CharSequence) string5);
        }
        C55173xeu c55173xeuCopydefault2 = oKAnchorSelection.copydefault();
        if (c55173xeuCopydefault2 != null) {
            c55173xeuCopydefault2.setEmptyTypeImage(6);
        }
        AbstractC16417ejY abstractC16417ejY11 = this.AEQbTJ;
        if (abstractC16417ejY11 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC16417ejY = abstractC16417ejY11;
        }
        abstractC16417ejY.EZpvd.setSearchResultCallback(new Function1() { // from class: o.fmU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AddressBookNetworkSelectionBottomSheet.copydefault(listFJNWhG, this, (java.lang.CharSequence) obj);
            }
        });
    }

    public static final void AEQbTJ(AddressBookNetworkSelectionBottomSheet addressBookNetworkSelectionBottomSheet, View view, boolean z) {
        if (z) {
            addressBookNetworkSelectionBottomSheet.OLrzqt("search");
        }
    }

    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ AddressBookNetworkSelectionBottomSheet KWHzl;
        public final /* synthetic */ View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(View view, long j, AddressBookNetworkSelectionBottomSheet addressBookNetworkSelectionBottomSheet) {
            this.copydefault = view;
            this.EZpvd = j;
            this.KWHzl = addressBookNetworkSelectionBottomSheet;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.EZpvd || (this.copydefault instanceof Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                this.KWHzl.OLrzqt(Web3SecurityTrackEvent.VALUE_CONFIRM);
                this.KWHzl.dismissAllowingStateLoss();
                Set<Long> value = this.KWHzl.KWHzl().AYXKKw().getValue();
                StateListAnimator stateListAnimator = this.KWHzl.OLrzqt;
                if (stateListAnimator != null) {
                    List<AddressChainUiData> listDjBIcL = this.KWHzl.KWHzl().djBIcL();
                    ArrayList<AddressChainUiData> arrayList = new ArrayList();
                    for (Object obj : listDjBIcL) {
                        if (value.contains(Long.valueOf(((AddressChainUiData) obj).OLrzqt()))) {
                            arrayList.add(obj);
                        }
                    }
                    ArrayList arrayList2 = new ArrayList(C56403yEb.AYXKKw(arrayList, 10));
                    for (AddressChainUiData addressChainUiData : arrayList) {
                        arrayList2.add(addressChainUiData.EZpvd((255 & 1) != 0 ? addressChainUiData.AEQbTJ : null, (255 & 2) != 0 ? addressChainUiData.EZpvd : 0L, (255 & 4) != 0 ? addressChainUiData.KWHzl : null, (255 & 8) != 0 ? addressChainUiData.gEmmrt : false, (255 & 16) != 0 ? addressChainUiData.AYXKKw : false, (255 & 32) != 0 ? addressChainUiData.OLrzqt : false, (255 & 64) != 0 ? addressChainUiData.copydefault : false, (255 & 128) != 0 ? addressChainUiData.AhwBna : true));
                    }
                    stateListAnimator.KWHzl(arrayList2);
                }
            }
        }
    }

    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ View AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ Context KWHzl;
        public final /* synthetic */ AddressBookNetworkSelectionBottomSheet OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(View view, long j, AddressBookNetworkSelectionBottomSheet addressBookNetworkSelectionBottomSheet, Context context) {
            this.AEQbTJ = view;
            this.EZpvd = j;
            this.OLrzqt = addressBookNetworkSelectionBottomSheet;
            this.KWHzl = context;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            String string;
            String strDjBIcL;
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.EZpvd || (this.AEQbTJ instanceof Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                if (!this.OLrzqt.KWHzl().gEmmrt()) {
                    if (!this.OLrzqt.KWHzl().fetchVPNInfo()) {
                        if (!this.OLrzqt.KWHzl().valueOf()) {
                            if (this.OLrzqt.KWHzl().AhwBna()) {
                                Context context = this.KWHzl;
                                int i = C13754dXa.FragmentManager.IconCompatParcelizer;
                                Pair[] pairArr = new Pair[1];
                                C10854bwM c10854bwMCopydefault = C10954byG.EZpvd.valueOf().copydefault();
                                if (c10854bwMCopydefault == null || (strDjBIcL = c10854bwMCopydefault.djBIcL()) == null) {
                                    strDjBIcL = "";
                                }
                                pairArr[0] = C56390yDp.OLrzqt("chainName", strDjBIcL);
                                string = C33069mpW.KWHzl(context, i, C56424yEw.AYXKKw(pairArr));
                            } else {
                                string = this.KWHzl.getString(C13754dXa.FragmentManager.cancelNotification);
                            }
                        } else {
                            string = this.KWHzl.getString(C13754dXa.FragmentManager.RbMRq);
                        }
                    } else {
                        string = this.KWHzl.getString(C13754dXa.FragmentManager.onDrawerOpened);
                    }
                } else {
                    string = this.KWHzl.getString(C13754dXa.FragmentManager.cancelNotification);
                }
                Intrinsics.copydefault((Object) string);
                this.OLrzqt.OLrzqt("allevm_info");
                Context contextRequireContext = this.OLrzqt.requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
                ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(contextRequireContext);
                viewOnClickListenerC54939xaY.EZpvd(string);
                String string2 = this.KWHzl.getString(C13754dXa.FragmentManager.getNotifyChildrenChangedOptions);
                Intrinsics.checkNotNullExpressionValue(string2, "");
                ViewOnClickListenerC54939xaY.addPrimaryButton$default(viewOnClickListenerC54939xaY, string2, (View.OnClickListener) null, 2, (Object) null);
                viewOnClickListenerC54939xaY.show();
            }
        }
    }

    public static final Unit OLrzqt(AddressBookNetworkSelectionBottomSheet addressBookNetworkSelectionBottomSheet, C55043xcW c55043xcW, Object obj) {
        Intrinsics.checkNotNullParameter(c55043xcW, "");
        if (obj instanceof QuickSelectionItem) {
            addressBookNetworkSelectionBottomSheet.EZpvd(c55043xcW, (QuickSelectionItem) obj);
        } else if (obj instanceof AddressChainUiData) {
            addressBookNetworkSelectionBottomSheet.OLrzqt(c55043xcW, (AddressChainUiData) obj);
        }
        return Unit.INSTANCE;
    }

    public final void EZpvd(final C55043xcW c55043xcW, final QuickSelectionItem quickSelectionItem) {
        final Context context = getContext();
        if (context == null) {
            return;
        }
        final CheckBox checkBox = (CheckBox) c55043xcW.EZpvd(C13754dXa.ActionBar.release);
        int i = 0;
        if (checkBox != null) {
            checkBox.setClickable(false);
        }
        if (checkBox != null) {
            checkBox.setFocusable(false);
        }
        ImageView imageView = (ImageView) c55043xcW.EZpvd(C13754dXa.ActionBar.QSbQqJ);
        if (imageView != null) {
            if (!Intrinsics.EZpvd((Object) quickSelectionItem.KWHzl(), (Object) context.getString(C13754dXa.FragmentManager.ITrustedWebActivityServiceStub)) && !Intrinsics.EZpvd((Object) quickSelectionItem.KWHzl(), (Object) context.getString(C13754dXa.FragmentManager.isDrawerSlideAnimationEnabled)) && !Intrinsics.EZpvd((Object) quickSelectionItem.KWHzl(), (Object) context.getString(C13754dXa.FragmentManager.hkDICb))) {
                i = 8;
            }
            imageView.setVisibility(i);
        }
        if (imageView != null) {
            imageView.setOnClickListener(new TaskDescription(imageView, 1000L, this, context));
        }
        ImageView imageView2 = (ImageView) c55043xcW.EZpvd(C13754dXa.ActionBar.MediaBrowserCompatMediaBrowserImplBase1);
        if (imageView2 != null) {
            imageView2.setImageDrawable(ContextCompat.getDrawable(context, quickSelectionItem.copydefault()));
        }
        c55043xcW.EZpvd(C13754dXa.ActionBar.MediaBrowserCompatMediaBrowserImplBase5, quickSelectionItem.KWHzl());
        c55043xcW.KWHzl(C13754dXa.ActionBar.release, quickSelectionItem.gEmmrt());
        c55043xcW.itemView.setOnClickListener(new View.OnClickListener() { // from class: o.fmQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                AddressBookNetworkSelectionBottomSheet.KWHzl(checkBox, quickSelectionItem, context, this, c55043xcW, view);
            }
        });
    }

    public static final void KWHzl(CheckBox checkBox, QuickSelectionItem quickSelectionItem, Context context, AddressBookNetworkSelectionBottomSheet addressBookNetworkSelectionBottomSheet, C55043xcW c55043xcW, View view) {
        String strDjBIcL;
        if (checkBox != null) {
            c55043xcW.KWHzl(C13754dXa.ActionBar.release, !checkBox.isChecked());
        }
        quickSelectionItem.OLrzqt(!quickSelectionItem.gEmmrt());
        String strKWHzl = quickSelectionItem.KWHzl();
        if (Intrinsics.EZpvd((Object) strKWHzl, (Object) context.getString(C13754dXa.FragmentManager.INotificationSideChannel))) {
            addressBookNetworkSelectionBottomSheet.OLrzqt("allnetwork");
            addressBookNetworkSelectionBottomSheet.KWHzl().KWHzl(quickSelectionItem.gEmmrt());
            return;
        }
        if (Intrinsics.EZpvd((Object) strKWHzl, (Object) context.getString(C13754dXa.FragmentManager.ITrustedWebActivityServiceStub))) {
            addressBookNetworkSelectionBottomSheet.OLrzqt("allevm");
            addressBookNetworkSelectionBottomSheet.KWHzl().EZpvd(quickSelectionItem.gEmmrt());
            return;
        }
        if (Intrinsics.EZpvd((Object) strKWHzl, (Object) context.getString(C13754dXa.FragmentManager.isDrawerSlideAnimationEnabled))) {
            addressBookNetworkSelectionBottomSheet.KWHzl().OLrzqt(quickSelectionItem.gEmmrt());
            return;
        }
        if (Intrinsics.EZpvd((Object) strKWHzl, (Object) context.getString(C13754dXa.FragmentManager.hkDICb))) {
            addressBookNetworkSelectionBottomSheet.KWHzl().AEQbTJ(quickSelectionItem.gEmmrt());
            return;
        }
        int i = C13754dXa.FragmentManager.read;
        Pair[] pairArr = new Pair[1];
        C10854bwM c10854bwMCopydefault = C10954byG.EZpvd.valueOf().copydefault();
        if (c10854bwMCopydefault == null || (strDjBIcL = c10854bwMCopydefault.djBIcL()) == null) {
            strDjBIcL = "";
        }
        pairArr[0] = C56390yDp.OLrzqt("chainName", strDjBIcL);
        if (Intrinsics.EZpvd((Object) strKWHzl, (Object) C33069mpW.KWHzl(context, i, C56424yEw.AYXKKw(pairArr)))) {
            addressBookNetworkSelectionBottomSheet.KWHzl().copydefault(quickSelectionItem.gEmmrt());
        }
    }

    public final void OLrzqt(final C55043xcW c55043xcW, final AddressChainUiData addressChainUiData) {
        final CheckBox checkBox = (CheckBox) c55043xcW.EZpvd(C13754dXa.ActionBar.release);
        ImageView imageView = (ImageView) c55043xcW.EZpvd(C13754dXa.ActionBar.QSbQqJ);
        if (checkBox != null) {
            checkBox.setClickable(false);
        }
        if (checkBox != null) {
            checkBox.setFocusable(false);
        }
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        ImageView imageView2 = (ImageView) c55043xcW.EZpvd(C13754dXa.ActionBar.MediaBrowserCompatMediaBrowserImplBase1);
        if (imageView2 != null) {
            C33054mpH.EZpvd(imageView2, addressChainUiData.copydefault(), C52761wXj.TaskDescription.aHXSQp);
        }
        c55043xcW.EZpvd(C13754dXa.ActionBar.MediaBrowserCompatMediaBrowserImplBase5, addressChainUiData.EZpvd());
        c55043xcW.KWHzl(C13754dXa.ActionBar.release, addressChainUiData.AhwBna());
        c55043xcW.itemView.setOnClickListener(new View.OnClickListener() { // from class: o.fmP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                AddressBookNetworkSelectionBottomSheet.EZpvd(checkBox, addressChainUiData, this, c55043xcW, view);
            }
        });
    }

    public static final void EZpvd(CheckBox checkBox, AddressChainUiData addressChainUiData, AddressBookNetworkSelectionBottomSheet addressBookNetworkSelectionBottomSheet, C55043xcW c55043xcW, View view) {
        if (checkBox != null) {
            c55043xcW.KWHzl(C13754dXa.ActionBar.release, !checkBox.isChecked());
        }
        addressChainUiData.OLrzqt(!addressChainUiData.AhwBna());
        addressBookNetworkSelectionBottomSheet.KWHzl().EZpvd(addressChainUiData.OLrzqt(), addressChainUiData.AhwBna());
    }

    public final void AEQbTJ(List<Object> list) {
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new AddressBookNetworkSelectionBottomSheet$observeSelectedNetworkChainIdsState$1(this, list, null), 3, null);
    }

    public final void copydefault(List<Object> list) {
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new AddressBookNetworkSelectionBottomSheet$observeEvmNetworksSelectedState$1(this, list, null), 3, null);
    }

    public final void djBIcL(List<Object> list) {
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new AddressBookNetworkSelectionBottomSheet$observeSvmNetworksSelectedState$1(this, list, null), 3, null);
    }

    public final void EZpvd(List<Object> list) {
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new AddressBookNetworkSelectionBottomSheet$observeAptosNetworksSelectedState$1(this, list, null), 3, null);
    }

    public final void KWHzl(List<Object> list) {
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new AddressBookNetworkSelectionBottomSheet$observeBTCNetworksSelectedState$1(this, list, null), 3, null);
    }

    public final void OLrzqt(List<Object> list) {
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new AddressBookNetworkSelectionBottomSheet$observeAllNetworksSelectedState$1(this, list, null), 3, null);
    }

    @Override // o.wXX
    public void onFooterCreated(@NotNull wYF wyf) {
        Intrinsics.checkNotNullParameter(wyf, "");
        super.onFooterCreated(wyf);
        wyf.setOKDSSize(52);
        wyf.setPrimaryText(wyf.getContext().getString(C13754dXa.FragmentManager.GiPPlL));
        C52794wYp c52794wYpCopydefault = wyf.copydefault();
        if (c52794wYpCopydefault != null) {
            c52794wYpCopydefault.setOnClickListener(new Activity(c52794wYpCopydefault, 1000L, this));
        }
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.wallet.mine.addressbook.detail.AddressBookNetworkSelectionBottomSheet.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final AddressBookNetworkSelectionBottomSheet OLrzqt(@NotNull ArrayList<AddressChainUiData> arrayList) {
            Intrinsics.checkNotNullParameter(arrayList, "");
            AddressBookNetworkSelectionBottomSheet addressBookNetworkSelectionBottomSheet = new AddressBookNetworkSelectionBottomSheet();
            Bundle bundle = new Bundle();
            bundle.putParcelableArrayList("chain_ui_data", arrayList);
            addressBookNetworkSelectionBottomSheet.setArguments(bundle);
            return addressBookNetworkSelectionBottomSheet;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void OLrzqt(final String str) {
        C32866mlf.onEvent$default("Web3AddAddress_Sheet_SelectNetwork_Click", (TrackChannel[]) null, new Function1() { // from class: o.fmT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AddressBookNetworkSelectionBottomSheet.AEQbTJ(str, (EventParamsList) obj);
            }
        }, 1, (Object) null);
    }

    public static final Unit AEQbTJ(String str, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.add(new EventParam(EopTrackEvent.KEY_BUTTON_NAME, str, true));
        return Unit.INSTANCE;
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class QuickSelectionItem {
        public final String AEQbTJ;
        public boolean EZpvd;
        public final int KWHzl;
        public final NetworkType OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ QuickSelectionItem copy$default(QuickSelectionItem quickSelectionItem, String str, int i, boolean z, NetworkType networkType, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = quickSelectionItem.AEQbTJ;
            }
            if ((i2 & 2) != 0) {
                i = quickSelectionItem.KWHzl;
            }
            if ((i2 & 4) != 0) {
                z = quickSelectionItem.EZpvd;
            }
            if ((i2 & 8) != 0) {
                networkType = quickSelectionItem.OLrzqt;
            }
            return quickSelectionItem.AEQbTJ(str, i, z, networkType);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final QuickSelectionItem AEQbTJ(@NotNull String str, @DrawableRes int i, boolean z, @NotNull NetworkType networkType) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(networkType, "");
            return new QuickSelectionItem(str, i, z, networkType);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String KWHzl() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(boolean z) {
            this.EZpvd = z;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int copydefault() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof QuickSelectionItem)) {
                return false;
            }
            QuickSelectionItem quickSelectionItem = (QuickSelectionItem) obj;
            return Intrinsics.EZpvd((Object) this.AEQbTJ, (Object) quickSelectionItem.AEQbTJ) && this.KWHzl == quickSelectionItem.KWHzl && this.EZpvd == quickSelectionItem.EZpvd && this.OLrzqt == quickSelectionItem.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean gEmmrt() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((((this.AEQbTJ.hashCode() * 31) + Integer.hashCode(this.KWHzl)) * 31) + Boolean.hashCode(this.EZpvd)) * 31) + this.OLrzqt.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "QuickSelectionItem(text=" + this.AEQbTJ + ", imageRes=" + this.KWHzl + ", isSelected=" + this.EZpvd + ", type=" + this.OLrzqt + ")";
        }

        public QuickSelectionItem(@NotNull String str, @DrawableRes int i, boolean z, @NotNull NetworkType networkType) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(networkType, "");
            this.AEQbTJ = str;
            this.KWHzl = i;
            this.EZpvd = z;
            this.OLrzqt = networkType;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 java.lang.String)
  (r2v0 int)
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? false : (r3v0 boolean))
  (r4v0 com.okinc.business.defi.wallet.mine.addressbook.detail.AddressBookNetworkSelectionBottomSheet$QuickSelectionItem$NetworkType)
 A[MD:(java.lang.String, int, boolean, com.okinc.business.defi.wallet.mine.addressbook.detail.AddressBookNetworkSelectionBottomSheet$QuickSelectionItem$NetworkType):void (m)] (LINE:482) call: com.okinc.business.defi.wallet.mine.addressbook.detail.AddressBookNetworkSelectionBottomSheet.QuickSelectionItem.<init>(java.lang.String, int, boolean, com.okinc.business.defi.wallet.mine.addressbook.detail.AddressBookNetworkSelectionBottomSheet$QuickSelectionItem$NetworkType):void type: THIS */
        public /* synthetic */ QuickSelectionItem(String str, int i, boolean z, NetworkType networkType, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i, (i2 & 4) != 0 ? false : z, networkType);
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public static final class NetworkType {
            private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
            private static final /* synthetic */ NetworkType[] $VALUES;
            public static final NetworkType ALL_NETWORKS = new NetworkType("ALL_NETWORKS", 0);
            public static final NetworkType EVM_NETWORKS = new NetworkType("EVM_NETWORKS", 1);
            public static final NetworkType SVM_NETWORKS = new NetworkType("SVM_NETWORKS", 2);
            public static final NetworkType APTOS_NETWORKS = new NetworkType("APTOS_NETWORKS", 3);
            public static final NetworkType BTC_NETWORKS = new NetworkType("BTC_NETWORKS", 4);

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            private static final /* synthetic */ NetworkType[] $values() {
                return new NetworkType[]{ALL_NETWORKS, EVM_NETWORKS, SVM_NETWORKS, APTOS_NETWORKS, BTC_NETWORKS};
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static InterfaceC56445yFq<NetworkType> getEntries() {
                return $ENTRIES;
            }

            private NetworkType(String str, int i) {
            }

            static {
                NetworkType[] networkTypeArr$values = $values();
                $VALUES = networkTypeArr$values;
                $ENTRIES = C56444yFp.AEQbTJ(networkTypeArr$values);
            }

            public static NetworkType valueOf(String str) {
                return (NetworkType) Enum.valueOf(NetworkType.class, str);
            }

            public static NetworkType[] values() {
                return (NetworkType[]) $VALUES.clone();
            }
        }

        public final boolean AYXKKw() {
            return this.OLrzqt == NetworkType.ALL_NETWORKS;
        }

        public final boolean AEQbTJ() {
            return this.OLrzqt == NetworkType.EVM_NETWORKS;
        }

        public final boolean AhwBna() {
            return this.OLrzqt == NetworkType.SVM_NETWORKS;
        }

        public final boolean EZpvd() {
            return this.OLrzqt == NetworkType.APTOS_NETWORKS;
        }

        public final boolean OLrzqt() {
            return this.OLrzqt == NetworkType.BTC_NETWORKS;
        }
    }

    public static final Unit copydefault(List list, AddressBookNetworkSelectionBottomSheet addressBookNetworkSelectionBottomSheet, CharSequence charSequence) {
        AbstractC16417ejY abstractC16417ejY;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (true) {
            abstractC16417ejY = null;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            Intrinsics.copydefault(next, "");
            String strEZpvd = ((AddressChainUiData) next).EZpvd();
            String string = charSequence != null ? charSequence.toString() : null;
            if (StringsKt__StringsKt.AhwBna((CharSequence) strEZpvd, (CharSequence) (string != null ? string : ""), true)) {
                arrayList.add(next);
            }
        }
        AbstractC16417ejY abstractC16417ejY2 = addressBookNetworkSelectionBottomSheet.AEQbTJ;
        if (abstractC16417ejY2 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC16417ejY = abstractC16417ejY2;
        }
        abstractC16417ejY.EZpvd.setSearchResultList(CollectionsKt___CollectionsKt.fJNWhG((Collection) arrayList));
        return Unit.INSTANCE;
    }
}
