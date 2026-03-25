package o;

import android.view.View;
import android.view.ViewGroup;
import androidx.activity.OnBackPressedCallback;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.OnBackPressedDispatcherKt;
import androidx.core.view.KeyEventDispatcher;
import androidx.core.view.ViewGroupKt;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import com.okinc.business.defi.api.model.tx.signdata.PlatformItem;
import com.okinc.business.defi.biz.constant.WalletType;
import com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction;
import com.okinc.business.defi.common.utils.CDNSourceManager;
import com.okinc.business.defi.wallet.transaction.moduleModel.bean.ButtonGroupModuleModel;
import com.okinc.business.defi.wallet.transaction.moduleModel.bean.MevInfo;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.liveness.lca.EopTrackEvent;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.wallet.api.WalletDexService;
import com.okinc.web3.security.track.Web3SecurityTrackEvent;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC20082gaF;
import o.C13754dXa;
import o.C14638dpI;
import o.C52761wXj;
import o.InterfaceC9730bbB;
import o.InterfaceC9740bbL;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.gaF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC20082gaF<T extends OKWBaseTransaction<?>> extends AbstractC32996moC {
    public AbstractC20082gaF<T>.ActionBar AYXKKw;
    public boolean EZpvd;
    public Function0<Unit> KWHzl;
    public AbstractC16641enk OLrzqt;
    public C14638dpI djBIcL;
    public AbstractC20082gaF<T>.ActionBar valueOf;
    public AbstractC20082gaF<T>.ActionBar values;
    public static final Activity Companion = new Activity(null);
    public static final int AEQbTJ = 8;
    public final int gEmmrt = C13754dXa.TaskDescription.RIuxYh;
    public final InterfaceC56387yDm fetchVPNInfo = C56392yDr.copydefault(new Function0() { // from class: o.gaM
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return AbstractC20082gaF.values(this.OLrzqt);
        }
    });
    public final InterfaceC56387yDm AkhnZx = C56392yDr.copydefault(new Function0() { // from class: o.gaN
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return AbstractC20082gaF.fetchVPNInfo(this.KWHzl);
        }
    });
    public final InterfaceC56387yDm AhwBna = C56392yDr.copydefault(new Function0() { // from class: o.gaO
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return AbstractC20082gaF.AYXKKw();
        }
    });

    /* JADX INFO: renamed from: o.gaF$StateListAnimator */
    public final /* synthetic */ class StateListAnimator {
        public static final /* synthetic */ int[] AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[WalletType.values().length];
            try {
                iArr[WalletType.HDWallet.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[WalletType.KeyWallet.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[WalletType.MPCWallet.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[WalletType.AAWallet.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[WalletType.HardwareWallet.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            AEQbTJ = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(@NotNull AbstractC20082gaF<T>.ActionBar actionBar) {
        Intrinsics.checkNotNullParameter(actionBar, "");
        this.valueOf = actionBar;
    }

    public abstract void AEQbTJ(@NotNull AbstractC20082gaF<T>.ActionBar actionBar, boolean z);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(@NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        this.KWHzl = function0;
    }

    public abstract void EZpvd(@NotNull AbstractC20082gaF<T>.ActionBar actionBar);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(@NotNull AbstractC20082gaF<T>.ActionBar actionBar) {
        Intrinsics.checkNotNullParameter(actionBar, "");
        this.values = actionBar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(boolean z) {
        this.EZpvd = z;
    }

    public abstract void OLrzqt(@NotNull C9748bbT c9748bbT);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(@NotNull AbstractC16641enk abstractC16641enk) {
        Intrinsics.checkNotNullParameter(abstractC16641enk, "");
        this.OLrzqt = abstractC16641enk;
    }

    public abstract void OLrzqt(@NotNull AbstractC20082gaF<T>.ActionBar actionBar);

    public abstract void copydefault(@NotNull java.util.Collection<? extends AbstractC9832bcy> collection);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(@NotNull AbstractC20082gaF<T>.ActionBar actionBar) {
        Intrinsics.checkNotNullParameter(actionBar, "");
        this.AYXKKw = actionBar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return this.gEmmrt;
    }

    public abstract boolean uzCIH();

    public final AbstractC16641enk gEmmrt() {
        AbstractC16641enk abstractC16641enk = this.OLrzqt;
        if (abstractC16641enk != null) {
            return abstractC16641enk;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    public final fXM<T> fARcdN() {
        return (fXM) this.fetchVPNInfo.getValue();
    }

    public static final fXM values(AbstractC20082gaF abstractC20082gaF) {
        FragmentActivity fragmentActivityRequireActivity = abstractC20082gaF.requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
        ViewModel viewModel = new ViewModelProvider(fragmentActivityRequireActivity).get(fXM.class);
        Intrinsics.copydefault(viewModel, "");
        return (fXM) viewModel;
    }

    public final T ejfBZ() {
        return (T) this.AkhnZx.getValue();
    }

    public static final OKWBaseTransaction fetchVPNInfo(AbstractC20082gaF abstractC20082gaF) {
        OKWBaseTransaction oKWBaseTransactionAEQbTJ = abstractC20082gaF.fARcdN().AEQbTJ();
        Intrinsics.copydefault(oKWBaseTransactionAEQbTJ);
        return oKWBaseTransactionAEQbTJ;
    }

    public final AbstractC20082gaF<T>.ActionBar DbNXlk() {
        AbstractC20082gaF<T>.ActionBar actionBar = this.values;
        if (actionBar != null) {
            return actionBar;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    public final AbstractC20082gaF<T>.ActionBar isConnected() {
        AbstractC20082gaF<T>.ActionBar actionBar = this.valueOf;
        if (actionBar != null) {
            return actionBar;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    public final AbstractC20082gaF<T>.ActionBar fetchVPNInfo() {
        AbstractC20082gaF<T>.ActionBar actionBar = this.AYXKKw;
        if (actionBar != null) {
            return actionBar;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    public final fXW AkhnZx() {
        return (fXW) this.AhwBna.getValue();
    }

    public static final fXW AYXKKw() {
        return new fXW();
    }

    /* JADX INFO: renamed from: o.gaF$ActionBar */
    public final class ActionBar {
        public final android.view.ViewGroup KWHzl;
        public final /* synthetic */ AbstractC20082gaF<T> copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(@NotNull Unit unit) {
            Intrinsics.checkNotNullParameter(unit, "");
        }

        public ActionBar(@NotNull AbstractC20082gaF abstractC20082gaF, android.view.ViewGroup viewGroup) {
            Intrinsics.checkNotNullParameter(viewGroup, "");
            this.copydefault = abstractC20082gaF;
            this.KWHzl = viewGroup;
        }

        public final void copydefault() {
            this.KWHzl.removeAllViews();
        }

        public final int EZpvd() {
            return this.KWHzl.getChildCount();
        }

        public final boolean KWHzl() {
            java.util.Iterator<android.view.View> it = ViewGroupKt.getChildren(this.KWHzl).iterator();
            while (it.hasNext()) {
                if (!(!(it.next().getVisibility() == 0))) {
                    return false;
                }
            }
            return true;
        }

        public final android.view.View OLrzqt(android.view.View view) {
            if (view != null) {
                this.KWHzl.addView(view);
            }
            return view;
        }

        public final void KWHzl(java.lang.Object obj) {
            if (obj instanceof android.view.View) {
                OLrzqt((android.view.View) obj);
                return;
            }
            if (!(obj instanceof java.lang.Object[])) {
                if (obj instanceof java.util.List) {
                    java.util.Iterator it = ((java.lang.Iterable) obj).iterator();
                    while (it.hasNext()) {
                        KWHzl(it.next());
                    }
                    return;
                }
                return;
            }
            for (java.lang.Object obj2 : (java.lang.Object[]) obj) {
                KWHzl(obj2);
            }
        }

        public final void EZpvd(@NotNull android.view.View view) {
            Intrinsics.checkNotNullParameter(view, "");
            this.KWHzl.removeView(view);
        }

        public final void AEQbTJ(@NotNull android.view.View view, int i) {
            Intrinsics.checkNotNullParameter(view, "");
            this.KWHzl.addView(view, i);
        }

        public final int KWHzl(@NotNull android.view.View view) {
            Intrinsics.checkNotNullParameter(view, "");
            return this.KWHzl.indexOfChild(view);
        }

        /* JADX WARN: Incorrect return type in method signature: <T:Landroid/view/View;>(Ljava/lang/String;)TT; */
        public final android.view.View AEQbTJ(@NotNull java.lang.String str) {
            android.view.View next;
            Intrinsics.checkNotNullParameter(str, "");
            java.util.Iterator<android.view.View> it = ViewGroupKt.getChildren(this.KWHzl).iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (Intrinsics.EZpvd(next.getTag(C13754dXa.ActionBar.UiThread), (java.lang.Object) str)) {
                    break;
                }
            }
            return next;
        }

        public final void copydefault(android.view.View[] viewArr) {
            if (viewArr != null) {
                for (android.view.View view : viewArr) {
                    this.KWHzl.addView(view);
                }
            }
        }

        public final void EZpvd(java.util.List<? extends android.view.View> list) {
            if (list != null) {
                java.util.Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    this.KWHzl.addView((android.view.View) it.next());
                }
            }
        }
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        OnBackPressedDispatcher onBackPressedDispatcher;
        Intrinsics.checkNotNullParameter(view, "");
        ViewDataBinding viewDataBindingBind = DataBindingUtil.bind(view);
        Intrinsics.copydefault(viewDataBindingBind);
        OLrzqt((AbstractC16641enk) viewDataBindingBind);
        fIwbmz();
        OLrzqt();
        fJNWhG();
        android.widget.LinearLayout linearLayout = gEmmrt().EZpvd;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "");
        KWHzl(new ActionBar(this, linearLayout));
        android.widget.LinearLayout linearLayout2 = gEmmrt().AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(linearLayout2, "");
        AEQbTJ(new ActionBar(this, linearLayout2));
        android.widget.LinearLayout linearLayout3 = gEmmrt().OLrzqt;
        Intrinsics.checkNotNullExpressionValue(linearLayout3, "");
        copydefault(new ActionBar(this, linearLayout3));
        EZpvd(DbNXlk());
        AEQbTJ(isConnected(), true);
        OLrzqt(fetchVPNInfo());
        FragmentActivity activity = getActivity();
        if (activity != null && (onBackPressedDispatcher = activity.getOnBackPressedDispatcher()) != null) {
            OnBackPressedDispatcherKt.addCallback$default(onBackPressedDispatcher, getViewLifecycleOwner(), false, new Function1() { // from class: o.gaQ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return AbstractC20082gaF.OLrzqt(this.copydefault, (OnBackPressedCallback) obj);
                }
            }, 2, null);
        }
        view.post(new java.lang.Runnable() { // from class: o.gaR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC20082gaF.valueOf(this.EZpvd);
            }
        });
    }

    public static final Unit OLrzqt(AbstractC20082gaF abstractC20082gaF, OnBackPressedCallback onBackPressedCallback) {
        Intrinsics.checkNotNullParameter(onBackPressedCallback, "");
        abstractC20082gaF.AuCTelauCTel();
        FragmentActivity activity = abstractC20082gaF.getActivity();
        if (activity != null) {
            activity.finish();
        }
        return Unit.INSTANCE;
    }

    public static final void valueOf(AbstractC20082gaF abstractC20082gaF) {
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) abstractC20082gaF, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    public final void fIwbmz() {
        getViewLifecycleOwner().getLifecycle().addObserver(new LifecycleEventObserver() { // from class: com.okinc.business.defi.wallet.transaction.ui.base.OKWBaseTransactionFragment$$ExternalSyntheticLambda18
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                AbstractC20082gaF.AEQbTJ(this.AEQbTJ, lifecycleOwner, event);
            }
        });
    }

    public static final void AEQbTJ(final AbstractC20082gaF abstractC20082gaF, LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        Intrinsics.checkNotNullParameter(event, "");
        if (event == Lifecycle.Event.ON_START) {
            AbstractC58185ywX<java.util.Collection<AbstractC9832bcy>> abstractC58185ywXAEQbTJ = abstractC20082gaF.ejfBZ().UlJrfe().AEQbTJ();
            LifecycleOwner viewLifecycleOwner = abstractC20082gaF.getViewLifecycleOwner();
            Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
            AbstractC58185ywX abstractC58185ywXOLrzqt = C58156yvv.OLrzqt(abstractC58185ywXAEQbTJ, viewLifecycleOwner, Lifecycle.Event.ON_STOP);
            final Function1 function1 = new Function1() { // from class: o.gaW
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return AbstractC20082gaF.AEQbTJ(this.copydefault, (java.util.Collection) obj);
                }
            };
            abstractC58185ywXOLrzqt.AEQbTJ(new InterfaceC58227yxM() { // from class: o.gaY
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    AbstractC20082gaF.AhwBna(function1, obj);
                }
            });
        }
    }

    public static final void AhwBna(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AEQbTJ(AbstractC20082gaF abstractC20082gaF, java.util.Collection collection) {
        abstractC20082gaF.copydefault(!abstractC20082gaF.AuCTel());
        Intrinsics.copydefault(collection);
        abstractC20082gaF.copydefault((java.util.Collection<? extends AbstractC9832bcy>) collection);
        return Unit.INSTANCE;
    }

    public final void fJNWhG() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            C14638dpI c14638dpI = new C14638dpI(activity);
            this.djBIcL = c14638dpI;
            c14638dpI.copydefault(new TaskDescription(this));
        }
    }

    /* JADX INFO: renamed from: o.gaF$TaskDescription */
    public static final class TaskDescription implements C14638dpI.Application {
        public final /* synthetic */ AbstractC20082gaF<T> KWHzl;
        public int copydefault;

        public TaskDescription(AbstractC20082gaF<T> abstractC20082gaF) {
            this.KWHzl = abstractC20082gaF;
        }

        @Override // o.C14638dpI.Application
        public void AEQbTJ(boolean z, int i) {
            if (this.copydefault == i) {
                return;
            }
            this.copydefault = i;
            if (this.KWHzl.uzCIH()) {
                return;
            }
            if (z) {
                this.KWHzl.gEmmrt().KWHzl.setVisibility(8);
                return;
            }
            C57468yiw c57468yiw = this.KWHzl.gEmmrt().KWHzl;
            final AbstractC20082gaF<T> abstractC20082gaF = this.KWHzl;
            c57468yiw.postDelayed(new java.lang.Runnable() { // from class: o.gbc
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    AbstractC20082gaF.TaskDescription.EZpvd(abstractC20082gaF);
                }
            }, 100L);
        }

        public static final void EZpvd(AbstractC20082gaF abstractC20082gaF) {
            abstractC20082gaF.gEmmrt().KWHzl.setVisibility(0);
        }
    }

    private final void OLrzqt() {
        if (uzCIH()) {
            gEmmrt().KWHzl.setVisibility(8);
            return;
        }
        if (ejfBZ().dUDNAs().gHZMYf() || ejfBZ().dUDNAs().AEQbTJ(WalletType.HardwareWallet)) {
            gEmmrt().KWHzl.copydefault().setVisibility(8);
            gEmmrt().KWHzl.setSecondaryButtonText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.getRccStateFromState));
            gEmmrt().KWHzl.setSecondaryButtonCallBack(new Function0() { // from class: o.gaT
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return AbstractC20082gaF.AYXKKw(this.AEQbTJ);
                }
            });
        } else {
            gEmmrt().KWHzl.setPrimaryButtonText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.RZNAhV));
            gEmmrt().KWHzl.setPrimaryButtonCallBack(new Function0() { // from class: o.gaU
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return AbstractC20082gaF.gEmmrt(this.AEQbTJ);
                }
            });
            gEmmrt().KWHzl.setSecondaryButtonText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.invokespecialRtjmuc));
            gEmmrt().KWHzl.setSecondaryButtonCallBack(new Function0() { // from class: o.gaV
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return AbstractC20082gaF.djBIcL(this.KWHzl);
                }
            });
        }
    }

    public static final Unit AYXKKw(AbstractC20082gaF abstractC20082gaF) {
        abstractC20082gaF.getFieldNames();
        return Unit.INSTANCE;
    }

    public static final Unit gEmmrt(AbstractC20082gaF abstractC20082gaF) {
        abstractC20082gaF.getNewProxyInstance();
        return Unit.INSTANCE;
    }

    public static final Unit djBIcL(AbstractC20082gaF abstractC20082gaF) {
        abstractC20082gaF.getFieldNames();
        return Unit.INSTANCE;
    }

    public final void OLrzqt(@NotNull ButtonGroupModuleModel.ButtonGroup buttonGroup) {
        Intrinsics.checkNotNullParameter(buttonGroup, "");
        C57468yiw c57468yiw = gEmmrt().KWHzl;
        java.lang.String primaryButtonText = buttonGroup.getPrimaryButtonText();
        if (primaryButtonText == null) {
            primaryButtonText = C33070mpX.AYXKKw(C13754dXa.FragmentManager.RZNAhV);
        }
        c57468yiw.setPrimaryButtonText(primaryButtonText);
        C57468yiw c57468yiw2 = gEmmrt().KWHzl;
        java.lang.String secondaryButtonText = buttonGroup.getSecondaryButtonText();
        if (secondaryButtonText == null) {
            secondaryButtonText = C33070mpX.AYXKKw(C13754dXa.FragmentManager.invokespecialRtjmuc);
        }
        c57468yiw2.setSecondaryButtonText(secondaryButtonText);
    }

    public void getFieldNames() {
        zsXlph();
        if (AuCTel()) {
            return;
        }
        EZpvd();
    }

    public void getNewProxyInstance() {
        AxsJAY();
        Function0<Unit> function0 = this.KWHzl;
        if (function0 != null) {
            if (function0 != null) {
                function0.invoke();
            }
        } else {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                activity.finish();
            }
        }
    }

    public final android.view.View OLrzqt(int i) {
        android.view.View view = new android.view.View(requireContext());
        view.setLayoutParams(new ViewGroup.MarginLayoutParams(-1, i));
        return view;
    }

    public final AbstractC9832bcy values() {
        java.util.Set<Map.Entry<java.lang.Integer, AbstractC9832bcy>> setEntrySet = ejfBZ().UlJrfe().copydefault().entrySet();
        Intrinsics.checkNotNullExpressionValue(setEntrySet, "");
        Map.Entry entry = (Map.Entry) CollectionsKt___CollectionsKt.RcXXUw(setEntrySet);
        if (entry != null) {
            return (AbstractC9832bcy) entry.getValue();
        }
        return null;
    }

    public final boolean AuCTel() {
        java.util.Collection<AbstractC9832bcy> collectionValues = ejfBZ().UlJrfe().copydefault().values();
        Intrinsics.checkNotNullExpressionValue(collectionValues, "");
        java.util.Collection<AbstractC9832bcy> collection = collectionValues;
        if (!collection.isEmpty()) {
            java.util.Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                if (((AbstractC9832bcy) it.next()).EZpvd()) {
                    return true;
                }
            }
        }
        return false;
    }

    private final void EZpvd() {
        C8396bBt c8396bBt = C8396bBt.AEQbTJ;
        FragmentActivity activity = getActivity();
        if (activity == null) {
            return;
        }
        OKWBaseTransaction oKWBaseTransactionEjfBZ = ejfBZ();
        boolean z = this.EZpvd;
        AbstractC58260yxt abstractC58260yxtSubmitWithIgnoreCondition$default = C8396bBt.submitWithIgnoreCondition$default(c8396bBt, activity, oKWBaseTransactionEjfBZ, false, z, z, false, new Application(this), 32, null);
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        AbstractC58260yxt abstractC58260yxtAEQbTJ = C58156yvv.AEQbTJ(abstractC58260yxtSubmitWithIgnoreCondition$default, viewLifecycleOwner, Lifecycle.Event.ON_DESTROY);
        final Function1 function1 = new Function1() { // from class: o.gaX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AbstractC20082gaF.copydefault(this.copydefault, (ResponseData) obj);
            }
        };
        InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.gba
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                AbstractC20082gaF.valueOf(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.gbb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AbstractC20082gaF.AEQbTJ(this.KWHzl, (java.lang.Throwable) obj);
            }
        };
        abstractC58260yxtAEQbTJ.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.gaK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                AbstractC20082gaF.EZpvd(function12, obj);
            }
        });
    }

    /* JADX INFO: renamed from: o.gaF$Application */
    public static final class Application implements InterfaceC9740bbL.TaskDescription {
        public final /* synthetic */ AbstractC20082gaF<T> EZpvd;

        public Application(AbstractC20082gaF<T> abstractC20082gaF) {
            this.EZpvd = abstractC20082gaF;
        }

        @Override // o.InterfaceC9740bbL.TaskDescription
        public void copydefault() {
            C52794wYp.startLoading$default(this.EZpvd.gEmmrt().KWHzl.EZpvd(), 0L, 1, null);
            FragmentActivity activity = this.EZpvd.getActivity();
            AbstractActivityC17933fXr abstractActivityC17933fXr = activity instanceof AbstractActivityC17933fXr ? (AbstractActivityC17933fXr) activity : null;
            if (abstractActivityC17933fXr != null) {
                abstractActivityC17933fXr.OLrzqt(true);
            }
            this.EZpvd.fARcdN().copydefault().setValue(java.lang.Boolean.TRUE);
        }

        @Override // o.InterfaceC9740bbL.TaskDescription
        public void EZpvd() {
            FragmentActivity activity = this.EZpvd.getActivity();
            AbstractActivityC17933fXr abstractActivityC17933fXr = activity instanceof AbstractActivityC17933fXr ? (AbstractActivityC17933fXr) activity : null;
            if (abstractActivityC17933fXr != null) {
                abstractActivityC17933fXr.OLrzqt(false);
            }
            this.EZpvd.fARcdN().copydefault().setValue(java.lang.Boolean.FALSE);
            this.EZpvd.gEmmrt().KWHzl.EZpvd().fIwbmz();
        }
    }

    public static final void valueOf(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit copydefault(AbstractC20082gaF abstractC20082gaF, ResponseData responseData) {
        int code = responseData.getCode();
        if (code != -5014) {
            if (code == -5001) {
                java.lang.Object data = responseData.getData();
                Intrinsics.copydefault(data);
                abstractC20082gaF.OLrzqt((C9748bbT) data);
            } else {
                switch (code) {
                    case -5007:
                        break;
                    case -5006:
                        C55326xho.toastWithFailedIcon$default(C13754dXa.FragmentManager.unregisterCallbackListener, 0, 1, (java.lang.Object) null);
                        break;
                    case -5005:
                        C55326xho.toastWithFailedIcon$default(C13754dXa.FragmentManager.DRGLNw, 0, 1, (java.lang.Object) null);
                        break;
                    case -5004:
                        C55326xho.toastWithFailedIcon$default(C13754dXa.FragmentManager.sYcwUD, 0, 1, (java.lang.Object) null);
                        break;
                    default:
                        if (responseData.getMsg().length() == 0) {
                            C55326xho.toastWithFailedIcon$default(C13754dXa.FragmentManager.Dfm, 0, 1, (java.lang.Object) null);
                        } else {
                            C55326xho.toastWithFailedIcon$default(responseData.getMsg(), 0, 1, (java.lang.Object) null);
                        }
                        break;
                }
            }
        }
        C10350bmm.AEQbTJ.copydefault(true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void EZpvd(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AEQbTJ(AbstractC20082gaF abstractC20082gaF, java.lang.Throwable th) {
        if (abstractC20082gaF.getViewLifecycleOwner().getLifecycle().getCurrentState() == Lifecycle.State.DESTROYED) {
            return Unit.INSTANCE;
        }
        abstractC20082gaF.gEmmrt().KWHzl.EZpvd().fIwbmz();
        FragmentActivity activity = abstractC20082gaF.getActivity();
        AbstractActivityC17933fXr abstractActivityC17933fXr = activity instanceof AbstractActivityC17933fXr ? (AbstractActivityC17933fXr) activity : null;
        if (abstractActivityC17933fXr != null) {
            abstractActivityC17933fXr.OLrzqt(false);
        }
        abstractC20082gaF.fARcdN().copydefault().setValue(java.lang.Boolean.FALSE);
        C10350bmm.AEQbTJ.copydefault(true);
        Intrinsics.copydefault(th);
        C10857bwP.copydefault("BaseTransactionFragment", th);
        return Unit.INSTANCE;
    }

    public final java.lang.String AhwBna() {
        PlatformItem dapp = ejfBZ().OJuSTm().getDapp();
        java.lang.String platform = dapp != null ? dapp.getPlatform() : null;
        return (platform == null || platform.length() == 0) ? C33070mpX.AYXKKw(C13754dXa.FragmentManager.AppCompatDelegateImpl) : platform;
    }

    public void copydefault(boolean z) {
        gEmmrt().KWHzl.setSecondaryButtonEnabled(z);
    }

    public final void hDKMBd() {
        java.lang.Object objEjfBZ = ejfBZ();
        Intrinsics.copydefault(objEjfBZ, "");
        ((InterfaceC9743bbO) objEjfBZ).fARcdN();
    }

    public final void AuCTelauCTel() {
        trackClickEvent$default(this, ejfBZ(), "back", null, 4, null);
    }

    public final void sSMYrx() {
        trackClickEvent$default(this, ejfBZ(), "wallet_used_address", null, 4, null);
    }

    public final void zsXlph() {
        trackClickEvent$default(this, ejfBZ(), Web3SecurityTrackEvent.VALUE_CONFIRM, null, 4, null);
    }

    public final void AxsJAY() {
        trackClickEvent$default(this, ejfBZ(), "reject", null, 4, null);
    }

    public final void AubY() {
        trackClickEvent$default(this, ejfBZ(), "approve_edit", null, 4, null);
    }

    public final void wlaJM() {
        trackClickEvent$default(this, ejfBZ(), "network_fee", null, 4, null);
    }

    public static /* synthetic */ void trackClickEvent$default(AbstractC20082gaF abstractC20082gaF, OKWBaseTransaction oKWBaseTransaction, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: trackClickEvent");
        }
        if ((i & 4) != 0) {
            str2 = null;
        }
        abstractC20082gaF.OLrzqt(oKWBaseTransaction, str, str2);
    }

    public final void OLrzqt(@NotNull final OKWBaseTransaction<?> oKWBaseTransaction, @NotNull final java.lang.String str, final java.lang.String str2) {
        Intrinsics.checkNotNullParameter(oKWBaseTransaction, "");
        Intrinsics.checkNotNullParameter(str, "");
        TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
        C32866mlf.AEQbTJ("AllConfirmation_Full_Button_Click", (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.gaS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AbstractC20082gaF.KWHzl(str, oKWBaseTransaction, str2, (EventParamsList) obj);
            }
        });
    }

    /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit KWHzl(java.lang.String str, OKWBaseTransaction oKWBaseTransaction, java.lang.String str2, EventParamsList eventParamsList) {
        java.lang.String str3 = "";
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("all_confirmation", str, true);
        int i = StateListAnimator.AEQbTJ[oKWBaseTransaction.dUDNAs().QwvEab().ordinal()];
        if (i == 1) {
            str3 = Web3SecurityTrackEvent.VALUE_SEED_PHRASE;
        } else if (i == 2) {
            str3 = Web3SecurityTrackEvent.VALUE_PRIVATE_KEY;
        } else if (i == 3) {
            str3 = "mpc";
        } else if (i == 4) {
            str3 = "aa";
        } else if (i == 5) {
            str3 = "hardware";
        }
        eventParamsList.put("wallet_type", str3, true);
        OKWBaseTransaction.TransactionType transactionTypeAUsmxb = oKWBaseTransaction.aUsmxb();
        if (str2 == null) {
            if (transactionTypeAUsmxb.isTransfer()) {
                str2 = "send";
            } else if (transactionTypeAUsmxb.isApprove()) {
                str2 = transactionTypeAUsmxb == OKWBaseTransaction.TransactionType.CancelApprove ? "revoke_approval" : "approve";
            } else {
                str2 = transactionTypeAUsmxb.isMessage() ? "sign" : "contract_interaction";
            }
        }
        eventParamsList.put(EopTrackEvent.KEY_PAGE_TYPE, str2, true);
        eventParamsList.put("network", oKWBaseTransaction.dHguZz().djBIcL(), false);
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) Web3SecurityTrackEvent.VALUE_CONFIRM)) {
            if (transactionTypeAUsmxb == OKWBaseTransaction.TransactionType.Approve) {
                InterfaceC9730bbB interfaceC9730bbB = oKWBaseTransaction instanceof InterfaceC9730bbB ? (InterfaceC9730bbB) oKWBaseTransaction : null;
                if (interfaceC9730bbB != null && interfaceC9730bbB.w_()) {
                    if (Intrinsics.EZpvd((java.lang.Object) InterfaceC9730bbB.Application.getApproveAmount$default(interfaceC9730bbB, false, 1, null), (java.lang.Object) "115792089237316195423570985008687907853269984665640564039457584007913129639935")) {
                        eventParamsList.put("approve", "unlimited", true);
                    } else {
                        eventParamsList.put("approve", "custom", true);
                    }
                }
            }
            AbstractC8564bFB abstractC8564bFB = oKWBaseTransaction instanceof AbstractC8564bFB ? (AbstractC8564bFB) oKWBaseTransaction : null;
            AbstractC8426bCW abstractC8426bCWQKudOq = abstractC8564bFB != null ? abstractC8564bFB.QKudOq() : null;
            AbstractC8485bDc abstractC8485bDc = abstractC8426bCWQKudOq instanceof AbstractC8485bDc ? (AbstractC8485bDc) abstractC8426bCWQKudOq : null;
            if (abstractC8485bDc != null) {
                int iDbNXlk = abstractC8485bDc.DbNXlk();
                if (iDbNXlk == 4) {
                    eventParamsList.put("network_use", "custom", true);
                } else {
                    switch (iDbNXlk) {
                        case 31:
                            eventParamsList.put("network_use", "slow", true);
                            break;
                        case 32:
                            eventParamsList.put("network_use", "average", true);
                            break;
                        case 33:
                            eventParamsList.put("network_use", "fast", true);
                            break;
                    }
                }
            }
        }
        return Unit.INSTANCE;
    }

    public final void iwGUEr() {
        KeyEventDispatcher.Component activity = getActivity();
        InterfaceC57493yjU interfaceC57493yjU = activity instanceof InterfaceC57493yjU ? (InterfaceC57493yjU) activity : null;
        if (interfaceC57493yjU != null) {
            interfaceC57493yjU.OLrzqt(new Function1() { // from class: o.gaL
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return AbstractC20082gaF.EZpvd(this.EZpvd, (android.widget.ImageView) obj);
                }
            });
        }
    }

    public static final Unit EZpvd(final AbstractC20082gaF abstractC20082gaF, android.widget.ImageView imageView) {
        Intrinsics.checkNotNullParameter(imageView, "");
        android.graphics.drawable.Drawable drawableKWHzl = C33070mpX.KWHzl(C52761wXj.TaskDescription.v);
        Intrinsics.copydefault(drawableKWHzl);
        drawableKWHzl.setBounds(0, 0, C55298xhM.dpInt$default(20, (android.content.Context) null, 1, (java.lang.Object) null), C55298xhM.dpInt$default(20, (android.content.Context) null, 1, (java.lang.Object) null));
        imageView.setImageDrawable(drawableKWHzl);
        imageView.setImageTintList(android.content.res.ColorStateList.valueOf(C33070mpX.copydefault(C52761wXj.Activity.fdOvFl)));
        imageView.setOnClickListener(new View.OnClickListener() { // from class: o.gaI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                AbstractC20082gaF.EZpvd(this.copydefault, view);
            }
        });
        return Unit.INSTANCE;
    }

    public static final void EZpvd(AbstractC20082gaF abstractC20082gaF, android.view.View view) {
        C20195gcM c20195gcMOLrzqt = C20195gcM.Companion.OLrzqt(CDNSourceManager.ImageSource.TxConfirmApprove, C33070mpX.AYXKKw(C13754dXa.FragmentManager.ZaDspl), "", C33070mpX.AYXKKw(C13754dXa.FragmentManager.OfWYUE), "", C33070mpX.AYXKKw(C13754dXa.FragmentManager.WFXFk), (64 & 64) != 0 ? false : false);
        androidx.fragment.app.FragmentManager childFragmentManager = abstractC20082gaF.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        c20195gcMOLrzqt.show(childFragmentManager);
    }

    public void zLjUOn() {
        KeyEventDispatcher.Component activity = getActivity();
        InterfaceC57493yjU interfaceC57493yjU = activity instanceof InterfaceC57493yjU ? (InterfaceC57493yjU) activity : null;
        if (interfaceC57493yjU != null) {
            interfaceC57493yjU.OLrzqt(new Function1() { // from class: o.gaH
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return AbstractC20082gaF.copydefault(this.EZpvd, (android.widget.ImageView) obj);
                }
            });
        }
    }

    public static final Unit copydefault(final AbstractC20082gaF abstractC20082gaF, android.widget.ImageView imageView) {
        Intrinsics.checkNotNullParameter(imageView, "");
        android.graphics.drawable.Drawable drawableKWHzl = C33070mpX.KWHzl(C52761wXj.TaskDescription.v);
        Intrinsics.copydefault(drawableKWHzl);
        drawableKWHzl.setBounds(0, 0, C55298xhM.dpInt$default(20, (android.content.Context) null, 1, (java.lang.Object) null), C55298xhM.dpInt$default(20, (android.content.Context) null, 1, (java.lang.Object) null));
        imageView.setImageDrawable(drawableKWHzl);
        imageView.setImageTintList(android.content.res.ColorStateList.valueOf(C33070mpX.copydefault(C52761wXj.Activity.fdOvFl)));
        imageView.setOnClickListener(new View.OnClickListener() { // from class: o.gaP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                AbstractC20082gaF.copydefault(this.EZpvd, view);
            }
        });
        return Unit.INSTANCE;
    }

    public static final void copydefault(AbstractC20082gaF abstractC20082gaF, android.view.View view) {
        C20195gcM c20195gcMOLrzqt = C20195gcM.Companion.OLrzqt(CDNSourceManager.ImageSource.TxConfirmPermit, C33070mpX.AYXKKw(C13754dXa.FragmentManager.iflRwn), C33070mpX.AYXKKw(C13754dXa.FragmentManager.fhwtiV), C33070mpX.AYXKKw(C13754dXa.FragmentManager.svUkWZ), C33070mpX.AYXKKw(C13754dXa.FragmentManager.isAvailable), C33070mpX.AYXKKw(C13754dXa.FragmentManager.DKr), true);
        androidx.fragment.app.FragmentManager childFragmentManager = abstractC20082gaF.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        c20195gcMOLrzqt.show(childFragmentManager);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        C14638dpI c14638dpI = this.djBIcL;
        if (c14638dpI != null) {
            c14638dpI.EZpvd();
        }
    }

    public final void gHZMYf() {
        trackClickEvent$default(this, ejfBZ(), "fiiup_gas", null, 4, null);
    }

    /* JADX INFO: renamed from: o.gaF$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.gaF.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    public final void OLrzqt(java.util.List<MevInfo.MevNode> list) {
        if (list != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
            for (MevInfo.MevNode mevNode : list) {
                java.lang.String vendorIcon = null;
                java.lang.String name = mevNode != null ? mevNode.getName() : null;
                java.lang.String gas = mevNode != null ? mevNode.getGas() : null;
                java.lang.String supplier = mevNode != null ? mevNode.getSupplier() : null;
                java.util.List<java.lang.Integer> chainIds = mevNode != null ? mevNode.getChainIds() : null;
                java.lang.String priorityRate = mevNode != null ? mevNode.getPriorityRate() : null;
                if (mevNode != null) {
                    vendorIcon = mevNode.getVendorIcon();
                }
                arrayList.add(new WalletDexService.SupportedMevNodeBean(name, gas, supplier, chainIds, priorityRate, vendorIcon));
            }
            java.lang.Object objEjfBZ = ejfBZ();
            Intrinsics.copydefault(objEjfBZ, "");
            ((InterfaceC9743bbO) objEjfBZ).a_(arrayList);
        }
    }
}
