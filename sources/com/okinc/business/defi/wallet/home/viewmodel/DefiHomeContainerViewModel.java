package com.okinc.business.defi.wallet.home.viewmodel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.okinc.business.defi.biz.constant.WalletStatus;
import com.okinc.business.defi.biz.constant.WalletType;
import com.okinc.business.defi.biz.core.wallet.update.WalletUpdateWorker;
import com.okinc.business.defi.biz.model.ChainAddress;
import com.okinc.business.defi.wallet.home.viewmodel.DefiHomeContainerViewModel;
import com.okinc.core.util.SPUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.AbstractC12782ctV;
import o.AbstractC12784ctX;
import o.AbstractC18810fpT;
import o.AbstractC33073mpa;
import o.AbstractC58260yxt;
import o.C11607cUn;
import o.C12827cuN;
import o.C13754dXa;
import o.C18814fpX;
import o.C18909frM;
import o.C33070mpX;
import o.C56548yJl;
import o.InterfaceC58227yxM;
import o.InterfaceC58229yxO;
import o.InterfaceC58261yxu;
import o.cOA;
import o.pUU;
import o.yBI;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class DefiHomeContainerViewModel extends AbstractC33073mpa {
    public final C18909frM AEQbTJ;
    public final MutableLiveData<WalletStatus> AYXKKw;
    public final MutableLiveData<AbstractC18810fpT> EZpvd;
    public boolean KWHzl;
    public final C18814fpX OLrzqt;
    public boolean copydefault;
    public final LiveData<AbstractC18810fpT> gEmmrt;
    public final MutableLiveData<Boolean> valueOf;

    public static final /* synthetic */ class Activity implements InterfaceC58229yxO {
        public final /* synthetic */ Function1 OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.OLrzqt = function1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC58229yxO
        public final /* synthetic */ Object apply(Object obj) {
            return this.OLrzqt.invoke(obj);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<AbstractC18810fpT> AYXKKw() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<Boolean> AhwBna() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(boolean z) {
        this.KWHzl = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean djBIcL() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<WalletStatus> gEmmrt() {
        return this.AYXKKw;
    }

    @yCM
    public DefiHomeContainerViewModel(@NotNull C18909frM c18909frM, @NotNull C18814fpX c18814fpX) {
        Intrinsics.checkNotNullParameter(c18909frM, "");
        Intrinsics.checkNotNullParameter(c18814fpX, "");
        this.AEQbTJ = c18909frM;
        this.OLrzqt = c18814fpX;
        this.AYXKKw = new MutableLiveData<>();
        this.valueOf = new MutableLiveData<>();
        MutableLiveData<AbstractC18810fpT> mutableLiveData = new MutableLiveData<>();
        this.EZpvd = mutableLiveData;
        this.gEmmrt = mutableLiveData;
    }

    public final void isConnected() {
        final String strAYXKKw = C33070mpX.AYXKKw(C13754dXa.FragmentManager.OnBackPressedDispatcher1);
        final String strAYXKKw2 = C33070mpX.AYXKKw(C13754dXa.FragmentManager.setEnabledChangedCallbackactivity_release);
        final String strAYXKKw3 = C33070mpX.AYXKKw(C13754dXa.FragmentManager.updateBackInvokedCallbackStateactivity_release);
        final String strAYXKKw4 = C33070mpX.AYXKKw(C13754dXa.FragmentManager.getOnBackInvokedDispatcher);
        final String strAYXKKw5 = C33070mpX.AYXKKw(C13754dXa.FragmentManager.setOnBackInvokedDispatcher);
        AbstractC58260yxt<Boolean> abstractC58260yxtAEQbTJ = cOA.AEQbTJ.AEQbTJ(strAYXKKw, strAYXKKw5);
        final Function1 function1 = new Function1() { // from class: o.feY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return DefiHomeContainerViewModel.KWHzl(strAYXKKw, strAYXKKw2, strAYXKKw3, strAYXKKw4, strAYXKKw5, (java.lang.Boolean) obj);
            }
        };
        AbstractC58260yxt<R> abstractC58260yxtOLrzqt = abstractC58260yxtAEQbTJ.OLrzqt(new InterfaceC58229yxO() { // from class: o.feX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return DefiHomeContainerViewModel.valueOf(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtOLrzqt, "");
        yBI.subscribeBy$default(abstractC58260yxtOLrzqt, (Function1) null, new Function1() { // from class: o.ffi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return DefiHomeContainerViewModel.EZpvd(this.OLrzqt, (java.util.ArrayList) obj);
            }
        }, 1, (Object) null);
    }

    public static final InterfaceC58261yxu valueOf(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58261yxu) function1.invoke(obj);
    }

    public static final InterfaceC58261yxu KWHzl(String str, String str2, String str3, String str4, String str5, Boolean bool) {
        Intrinsics.checkNotNullParameter(bool, "");
        return WalletUpdateWorker.Application.getInstance$default(WalletUpdateWorker.Companion, null, 1, null).copydefault(str, str2, str3, str4, str5);
    }

    public static final Unit EZpvd(DefiHomeContainerViewModel defiHomeContainerViewModel, ArrayList arrayList) {
        if (!SPUtils.getBoolean("connect_wallet_is_change", false)) {
            defiHomeContainerViewModel.copydefault();
        } else {
            defiHomeContainerViewModel.OLrzqt();
        }
        return Unit.INSTANCE;
    }

    public final void copydefault() {
        final String strAYXKKw = C33070mpX.AYXKKw(C13754dXa.FragmentManager.updateBackInvokedCallbackStateactivity_release);
        final String strAYXKKw2 = C33070mpX.AYXKKw(C13754dXa.FragmentManager.setOnBackInvokedDispatcher);
        AbstractC58260yxt abstractC58260yxtOLrzqt = C12827cuN.getAllRootWallets$default(C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null), false, false, 3, null).OLrzqt(new Activity(new Function1() { // from class: o.ffa
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return DefiHomeContainerViewModel.copydefault(strAYXKKw, this, strAYXKKw2, (java.util.List) obj);
            }
        }));
        final Application application = new Application();
        InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.ffe
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                DefiHomeContainerViewModel.djBIcL(application, obj);
            }
        };
        final Function1 function1 = new Function1() { // from class: o.ffd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return DefiHomeContainerViewModel.OLrzqt(this.EZpvd, (java.lang.Throwable) obj);
            }
        };
        call().AEQbTJ(abstractC58260yxtOLrzqt.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.ffc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                DefiHomeContainerViewModel.AYXKKw(function1, obj);
            }
        }));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r12v2, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r12v6, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v4, types: [T, o.ctX] */
    public static final InterfaceC58261yxu copydefault(String str, final DefiHomeContainerViewModel defiHomeContainerViewModel, final String str2, List list) {
        Intrinsics.checkNotNullParameter(list, "");
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        final Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ?? r3 = (AbstractC12784ctX) it.next();
            if (r3.fJNWhG() == WalletType.ConnectWallet) {
                objectRef2.element = r3;
            } else if (r3.fJNWhG() == WalletType.TrackingWallet) {
                objectRef.element = r3;
            }
        }
        T t = objectRef2.element;
        if (t != 0 && objectRef.element == 0) {
            ((AbstractC12784ctX) t).EZpvd(WalletType.TrackingWallet);
            final Ref.IntRef intRef = new Ref.IntRef();
            InterfaceC58261yxu interfaceC58261yxuOLrzqt = ((AbstractC12784ctX) objectRef2.element).copydefault(str).OLrzqt(new Activity(new Function1() { // from class: o.fff
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return DefiHomeContainerViewModel.KWHzl(this.KWHzl, intRef, objectRef2, (java.lang.Integer) obj);
                }
            }));
            Intrinsics.copydefault(interfaceC58261yxuOLrzqt);
            return interfaceC58261yxuOLrzqt;
        }
        if (t != 0 && objectRef.element != 0) {
            AbstractC58260yxt abstractC58260yxtFetchAllWallets$default = C12827cuN.fetchAllWallets$default(C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null), false, false, false, 7, null);
            final Function1 function1 = new Function1() { // from class: o.ffj
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return DefiHomeContainerViewModel.AEQbTJ(objectRef, str2, defiHomeContainerViewModel, objectRef2, (java.util.List) obj);
                }
            };
            AbstractC58260yxt abstractC58260yxtOLrzqt = abstractC58260yxtFetchAllWallets$default.OLrzqt(new InterfaceC58229yxO() { // from class: o.ffg
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58229yxO
                public final java.lang.Object apply(java.lang.Object obj) {
                    return DefiHomeContainerViewModel.AhwBna(function1, obj);
                }
            });
            Intrinsics.copydefault(abstractC58260yxtOLrzqt);
            return abstractC58260yxtOLrzqt;
        }
        AbstractC58260yxt abstractC58260yxtCopydefault = AbstractC58260yxt.copydefault("");
        Intrinsics.copydefault(abstractC58260yxtCopydefault);
        return abstractC58260yxtCopydefault;
    }

    public static final InterfaceC58261yxu KWHzl(final DefiHomeContainerViewModel defiHomeContainerViewModel, final Ref.IntRef intRef, final Ref.ObjectRef objectRef, Integer num) {
        Intrinsics.checkNotNullParameter(num, "");
        return C12827cuN.fetchAllWallets$default(C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null), false, false, false, 7, null).OLrzqt(new Activity(new Function1() { // from class: o.ffl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return DefiHomeContainerViewModel.KWHzl(this.OLrzqt, intRef, objectRef, (java.util.List) obj);
            }
        }));
    }

    public static final InterfaceC58261yxu KWHzl(DefiHomeContainerViewModel defiHomeContainerViewModel, final Ref.IntRef intRef, final Ref.ObjectRef objectRef, List list) {
        Intrinsics.checkNotNullParameter(list, "");
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AbstractC12782ctV abstractC12782ctV = (AbstractC12782ctV) it.next();
            if (abstractC12782ctV.QwvEab() == WalletType.ConnectWallet) {
                boolean zEZpvd = defiHomeContainerViewModel.EZpvd(abstractC12782ctV, (List<? extends AbstractC12782ctV>) list);
                abstractC12782ctV.copydefault(WalletType.TrackingWallet);
                if (zEZpvd) {
                    arrayList.add(abstractC12782ctV.djBIcL(""));
                } else {
                    intRef.element++;
                    arrayList.add(abstractC12782ctV.DCUTEIddSDPG());
                }
            }
        }
        return C11607cUn.valueOf(C11607cUn.KWHzl(arrayList)).OLrzqt(new Activity(new Function1() { // from class: o.ffk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return DefiHomeContainerViewModel.EZpvd(intRef, objectRef, (java.util.List) obj);
            }
        }));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v4, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public static final InterfaceC58261yxu EZpvd(Ref.IntRef intRef, Ref.ObjectRef objectRef, List list) {
        Intrinsics.checkNotNullParameter(list, "");
        if (intRef.element == 0) {
            return ((AbstractC12784ctX) objectRef.element).AEQbTJ("");
        }
        AbstractC58260yxt abstractC58260yxtCopydefault = AbstractC58260yxt.copydefault("");
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtCopydefault, "");
        return C11607cUn.valueOf(abstractC58260yxtCopydefault);
    }

    public static final InterfaceC58261yxu AhwBna(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58261yxu) function1.invoke(obj);
    }

    public static final InterfaceC58261yxu gEmmrt(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58261yxu) function1.invoke(obj);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public static final InterfaceC58261yxu copydefault(Ref.ObjectRef objectRef, List list) {
        Intrinsics.checkNotNullParameter(list, "");
        return ((AbstractC12784ctX) objectRef.element).AEQbTJ("");
    }

    public static final class Application implements Function1<?, Unit> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(Object obj) {
            EZpvd(obj);
            return Unit.INSTANCE;
        }

        public final void EZpvd(Object obj) {
            SPUtils.put("connect_wallet_is_change", Boolean.TRUE);
            DefiHomeContainerViewModel.this.OLrzqt();
            pUU.copydefault("getAllRootWallets finish ");
        }
    }

    public static final void djBIcL(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    public static final void AYXKKw(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    public static final Unit OLrzqt(DefiHomeContainerViewModel defiHomeContainerViewModel, Throwable th) {
        pUU.copydefault("getAllRootWallets it.message  = " + th.getMessage());
        defiHomeContainerViewModel.OLrzqt();
        return Unit.INSTANCE;
    }

    public final boolean EZpvd(AbstractC12782ctV abstractC12782ctV, List<? extends AbstractC12782ctV> list) {
        String address = ((ChainAddress) CollectionsKt___CollectionsKt.AuCTelauCTel(abstractC12782ctV.valueOf())).getAddress();
        for (AbstractC12782ctV abstractC12782ctV2 : list) {
            if (!Intrinsics.EZpvd(abstractC12782ctV, abstractC12782ctV2) && abstractC12782ctV2.QwvEab() != WalletType.ConnectWallet) {
                Iterator<ChainAddress> it = abstractC12782ctV2.valueOf().iterator();
                while (it.hasNext()) {
                    if (Intrinsics.EZpvd((Object) it.next().getAddress(), (Object) address)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final String OLrzqt(int i) {
        if (i < 10) {
            return "0" + i;
        }
        return String.valueOf(i);
    }

    public final void OLrzqt() {
        C12827cuN.Application application = C12827cuN.Companion;
        if (C12827cuN.Application.getInstance$default(application, null, 1, null).fetchVPNInfo() != WalletStatus.NoWallet) {
            this.AYXKKw.setValue(C12827cuN.Application.getInstance$default(application, null, 1, null).fetchVPNInfo());
        } else {
            call().AEQbTJ(C11607cUn.subscribeOnIO$default(C12827cuN.Application.getInstance$default(application, null, 1, null).djBIcL(), (Function1) null, new Function1() { // from class: o.ffh
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return DefiHomeContainerViewModel.AEQbTJ(this.copydefault, (WalletStatus) obj);
                }
            }, 1, (Object) null));
        }
        WalletUpdateWorker.Application.getInstance$default(WalletUpdateWorker.Companion, null, 1, null).gEmmrt();
    }

    public static final Unit AEQbTJ(DefiHomeContainerViewModel defiHomeContainerViewModel, WalletStatus walletStatus) {
        Intrinsics.checkNotNullParameter(walletStatus, "");
        if (walletStatus != defiHomeContainerViewModel.AYXKKw.getValue()) {
            defiHomeContainerViewModel.AEQbTJ(walletStatus);
        }
        return Unit.INSTANCE;
    }

    public final void values() {
        WalletStatus value = this.AYXKKw.getValue();
        C12827cuN.Application application = C12827cuN.Companion;
        if (value != C12827cuN.Application.getInstance$default(application, null, 1, null).fetchVPNInfo()) {
            if (this.AYXKKw.getValue() != null) {
                AEQbTJ(C12827cuN.Application.getInstance$default(application, null, 1, null).fetchVPNInfo());
            }
            call().AEQbTJ(C11607cUn.OLrzqt(C12827cuN.Application.getInstance$default(application, null, 1, null).djBIcL(), (Function1<? super Throwable, Unit>) new Function1() { // from class: o.ffn
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return DefiHomeContainerViewModel.copydefault((java.lang.Throwable) obj);
                }
            }, new Function1() { // from class: o.feZ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return DefiHomeContainerViewModel.OLrzqt(this.OLrzqt, (WalletStatus) obj);
                }
            }));
        }
    }

    public static final Unit OLrzqt(DefiHomeContainerViewModel defiHomeContainerViewModel, WalletStatus walletStatus) {
        Intrinsics.checkNotNullParameter(walletStatus, "");
        if (walletStatus != defiHomeContainerViewModel.AYXKKw.getValue()) {
            defiHomeContainerViewModel.AEQbTJ(walletStatus);
        }
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        pUU.copydefault("refreshWalletStatus it.message = " + th.getMessage());
        return Unit.INSTANCE;
    }

    public final void AEQbTJ(WalletStatus walletStatus) {
        C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null).EZpvd(walletStatus);
        this.AYXKKw.setValue(walletStatus);
        this.copydefault = true;
    }

    public final void AEQbTJ() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new DefiHomeContainerViewModel$checkCreateAvailable$1(null), 3, null);
    }

    public final void valueOf() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new DefiHomeContainerViewModel$fetchTagMetaData$1(this, null), 3, null);
    }

    public final void KWHzl() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new DefiHomeContainerViewModel$checkTermsVersion$1(this, null), 3, null);
    }

    public final void EZpvd() {
        this.EZpvd.postValue(null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r8v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public static final InterfaceC58261yxu AEQbTJ(Ref.ObjectRef objectRef, String str, DefiHomeContainerViewModel defiHomeContainerViewModel, final Ref.ObjectRef objectRef2, List list) {
        Intrinsics.checkNotNullParameter(list, "");
        Iterator it = list.iterator();
        int i = 0;
        int iCopydefault = 0;
        int iCopydefault2 = 0;
        while (it.hasNext()) {
            AbstractC12782ctV abstractC12782ctV = (AbstractC12782ctV) it.next();
            if (abstractC12782ctV.QwvEab() == WalletType.TrackingWallet) {
                iCopydefault = C56548yJl.copydefault(abstractC12782ctV.finit(), iCopydefault);
                iCopydefault2 = C56548yJl.copydefault(abstractC12782ctV.dmfpNf(), iCopydefault2);
            }
        }
        ArrayList arrayList = new ArrayList();
        Iterator it2 = list.iterator();
        int i2 = 0;
        while (it2.hasNext()) {
            AbstractC12782ctV abstractC12782ctV2 = (AbstractC12782ctV) it2.next();
            if (abstractC12782ctV2.QwvEab() == WalletType.ConnectWallet) {
                i++;
                i2++;
                abstractC12782ctV2.copydefault((AbstractC12784ctX) objectRef.element);
                abstractC12782ctV2.OLrzqt(iCopydefault + i);
                abstractC12782ctV2.AEQbTJ(iCopydefault2 + i2);
                abstractC12782ctV2.fARcdN(str + defiHomeContainerViewModel.OLrzqt(abstractC12782ctV2.finit() + 1));
                boolean zEZpvd = defiHomeContainerViewModel.EZpvd(abstractC12782ctV2, (List<? extends AbstractC12782ctV>) list);
                abstractC12782ctV2.copydefault(WalletType.TrackingWallet);
                if (zEZpvd) {
                    arrayList.add(abstractC12782ctV2.djBIcL(""));
                } else {
                    arrayList.add(abstractC12782ctV2.DCUTEIddSDPG());
                }
            }
        }
        AbstractC58260yxt abstractC58260yxtValueOf = C11607cUn.valueOf(C11607cUn.KWHzl(arrayList));
        final Function1 function1 = new Function1() { // from class: o.feW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return DefiHomeContainerViewModel.copydefault(objectRef2, (java.util.List) obj);
            }
        };
        return abstractC58260yxtValueOf.OLrzqt(new InterfaceC58229yxO() { // from class: o.ffb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return DefiHomeContainerViewModel.gEmmrt(function1, obj);
            }
        });
    }
}
