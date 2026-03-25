package o;

import android.os.Build;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentResultListener;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.FlowExtKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.RecyclerView;
import com.amplifyframework.core.model.ModelIdentifier;
import com.okinc.im.bean.tag.TagSize;
import com.okinc.im.imui.group.members.SelectableMemberListFragment$initView$3;
import com.okinc.im.imui.group.members.SelectableMemberListFragment$loadMemberList$2;
import com.okinc.im.imui.group.members.SelectableMemberListViewModel;
import com.okinc.im.widgets.SelectableDelegate;
import com.okinc.okimcore.model.exception.OKIMException;
import com.okinc.okimcore.model.im.OKMessage;
import com.okinc.okimcore.model.im.UpdateGroupMemberMessage;
import com.okinc.okimcore.model.other.GroupInfo;
import com.okinc.okimcore.model.other.GroupMemberInfo;
import com.okinc.okimcore.model.other.GroupRole;
import com.okinc.okimcore.model.other.GroupUserSettingInfo;
import com.okinc.p2p.api.OtcExtraKeys;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import o.C32113mPz;
import o.C35399nuc;
import o.C52761wXj;
import o.InterfaceC43315rmv;
import o.nXG;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public class nXG extends AbstractC34257nXg {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int fetchVPNInfo = 8;
    public AbstractC32943mnC<java.lang.Object> AkhnZx;
    public android.widget.LinearLayout AuCTel;
    public oIS AuCTelauCTel;
    public final C59534zip AubY;
    public C55237xgE AwvSrB;
    public final InterfaceC56387yDm AxsJAY;
    public final C58216yxB DbNXlk;
    public final PendingIntent ejfBZ;
    public C43319rmz fARcdN;
    public android.widget.EditText fIwbmz;
    public C52794wYp fJNWhG;
    public java.lang.Runnable gHZMYf;
    public Application getFieldNames;
    public boolean getNewProxyInstance;
    public final java.util.ArrayList<java.lang.Object> hDKMBd;
    public int isConnected;
    public final InterfaceC56387yDm iwGUEr;
    public InterfaceC35282nsQ sSMYrx;
    public boolean uzCIH;
    public final int values = C35399nuc.Dialog.finit;
    public android.view.ViewGroup wlaJM;
    public final InterfaceC56387yDm zLjUOn;
    public RecyclerView zsXlph;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.util.List<java.lang.Object> AEQbTJ(@NotNull java.util.List<? extends java.lang.Object> list) {
        Intrinsics.checkNotNullParameter(list, "");
        return list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(@NotNull oIS ois) {
        Intrinsics.checkNotNullParameter(ois, "");
        this.AuCTelauCTel = ois;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return this.values;
    }

    public nXG() {
        final Function0<androidx.fragment.app.Fragment> function0 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.im.imui.group.members.SelectableMemberListFragment$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.im.imui.group.members.SelectableMemberListFragment$special$$inlined$viewModels$default$2
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
        this.AxsJAY = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(SelectableMemberListViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.im.imui.group.members.SelectableMemberListFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.im.imui.group.members.SelectableMemberListFragment$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.im.imui.group.members.SelectableMemberListFragment$special$$inlined$viewModels$default$5
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
        this.DbNXlk = new C58216yxB();
        this.iwGUEr = C56392yDr.copydefault(new Function0() { // from class: o.nXH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return nXG.AYXKKw(this.KWHzl);
            }
        });
        java.util.ArrayList<java.lang.Object> arrayList = new java.util.ArrayList<>();
        this.hDKMBd = arrayList;
        this.ejfBZ = new PendingIntent(arrayList);
        this.getNewProxyInstance = true;
        this.AubY = new C59534zip();
        this.zLjUOn = C56392yDr.copydefault(new Function0() { // from class: o.nXD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return nXG.values(this.KWHzl);
            }
        });
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.nXG.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.nXG$StateListAnimator */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ nXG newInstance$default(StateListAnimator stateListAnimator, GroupInfo groupInfo, SelectableDelegate.Mode mode, boolean z, java.util.ArrayList arrayList, int i, java.lang.Object obj) {
            if ((i & 2) != 0) {
                mode = SelectableDelegate.Mode.NONE;
            }
            if ((i & 4) != 0) {
                z = true;
            }
            if ((i & 8) != 0) {
                arrayList = new java.util.ArrayList(0);
            }
            return stateListAnimator.copydefault(groupInfo, mode, z, arrayList);
        }

        public final nXG copydefault(@NotNull GroupInfo groupInfo, @NotNull SelectableDelegate.Mode mode, boolean z, @NotNull java.util.ArrayList<java.lang.String> arrayList) {
            Intrinsics.checkNotNullParameter(groupInfo, "");
            Intrinsics.checkNotNullParameter(mode, "");
            Intrinsics.checkNotNullParameter(arrayList, "");
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putParcelable("info", groupInfo);
            bundle.putParcelable(OtcExtraKeys.MODE, mode);
            bundle.putBoolean("filterable", z);
            bundle.putStringArrayList("selected_ids", arrayList);
            nXG nxg = new nXG();
            nxg.setArguments(bundle);
            return nxg;
        }
    }

    public final SelectableMemberListViewModel AuCTel() {
        return (SelectableMemberListViewModel) this.AxsJAY.getValue();
    }

    public final oIS values() {
        oIS ois = this.AuCTelauCTel;
        if (ois != null) {
            return ois;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final GroupInfo OLrzqt() {
        return (GroupInfo) this.iwGUEr.getValue();
    }

    public static final GroupInfo AYXKKw(nXG nxg) throws OKIMException {
        GroupInfo groupInfo;
        if (Build.VERSION.SDK_INT >= 33) {
            groupInfo = (GroupInfo) nxg.requireArguments().getParcelable("info", GroupInfo.class);
        } else {
            groupInfo = (GroupInfo) nxg.requireArguments().getParcelable("info");
        }
        if (groupInfo != null) {
            return groupInfo;
        }
        throw new OKIMException("Group Info cannot be null", -3);
    }

    public static final class PendingIntent extends AbstractC35896oHs {
        public PendingIntent(java.util.ArrayList<java.lang.Object> arrayList) {
            super(arrayList);
        }

        @Override // o.AbstractC35896oHs
        public java.lang.String OLrzqt(int i) {
            java.util.List<?> items = getItems();
            Intrinsics.checkNotNullExpressionValue(items, "");
            return nXG.this.KWHzl(i, CollectionsKt___CollectionsKt.AkhnZx(items, i));
        }
    }

    public static final class Dialog extends SelectableDelegate<RecyclerView.ViewHolder, java.lang.String> {
        public Dialog(SelectableDelegate.Mode mode, PendingIntent pendingIntent) {
            super(mode, pendingIntent);
        }

        @Override // com.okinc.im.widgets.SelectableDelegate
        public boolean OLrzqt(int i) {
            nXG nxg = nXG.this;
            return nxg.copydefault(i, CollectionsKt___CollectionsKt.AkhnZx(nxg.hDKMBd, i));
        }

        /* JADX DEBUG: Method merged with bridge method: copydefault(I)Ljava/lang/Object; */
        @Override // com.okinc.im.widgets.SelectableDelegate
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public java.lang.String copydefault(int i) {
            java.lang.Object obj = nXG.this.hDKMBd.get(i);
            Intrinsics.checkNotNullExpressionValue(obj, "");
            return obj instanceof GroupMemberInfo ? ((GroupMemberInfo) obj).getMemberId() : "";
        }

        /* JADX DEBUG: Method merged with bridge method: copydefault(Ljava/lang/Object;)I */
        @Override // com.okinc.im.widgets.SelectableDelegate
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public int copydefault(java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            int i = 0;
            for (java.lang.Object obj : nXG.this.hDKMBd) {
                if ((obj instanceof GroupMemberInfo) && Intrinsics.EZpvd((java.lang.Object) ((GroupMemberInfo) obj).getMemberId(), (java.lang.Object) str)) {
                    return i;
                }
                i++;
            }
            return -1;
        }

        @Override // com.okinc.im.widgets.SelectableDelegate
        public void KWHzl(int i) {
            super.KWHzl(i);
            nXG.this.KWHzl(i);
        }

        @Override // com.okinc.im.widgets.SelectableDelegate
        public void EZpvd(SelectableDelegate.Mode mode) {
            Intrinsics.checkNotNullParameter(mode, "");
            nXG.this.copydefault(mode);
        }
    }

    public final Dialog isConnected() {
        return (Dialog) this.zLjUOn.getValue();
    }

    public static final Dialog values(nXG nxg) {
        return nxg.new Dialog(nxg.AkhnZx(), nxg.ejfBZ);
    }

    public void copydefault(@NotNull SelectableDelegate.Mode mode) {
        Intrinsics.checkNotNullParameter(mode, "");
        uzCIH();
    }

    public void KWHzl(int i) {
        uzCIH();
    }

    public final SelectableDelegate.Mode AkhnZx() throws OKIMException {
        SelectableDelegate.Mode mode;
        if (Build.VERSION.SDK_INT >= 33) {
            mode = (SelectableDelegate.Mode) requireArguments().getParcelable(OtcExtraKeys.MODE, SelectableDelegate.Mode.class);
        } else {
            mode = (SelectableDelegate.Mode) requireArguments().getParcelable(OtcExtraKeys.MODE);
        }
        if (mode != null) {
            return mode;
        }
        throw new OKIMException("Mode cannot be null", -3);
    }

    private final java.util.List<java.lang.String> AEQbTJ() {
        java.lang.Iterable stringArrayList = requireArguments().getStringArrayList("selected_ids");
        if (stringArrayList == null) {
            stringArrayList = yDY.AhwBna();
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = stringArrayList.iterator();
        while (it.hasNext()) {
            java.lang.String string = ((java.lang.String) it.next()).toString();
            if (string != null) {
                arrayList.add(string);
            }
        }
        return arrayList;
    }

    public final boolean AhwBna() {
        return AkhnZx() != SelectableDelegate.Mode.NONE;
    }

    public final boolean djBIcL() {
        return requireArguments().getBoolean("filterable");
    }

    public final boolean getFieldNames() {
        android.os.Bundle bundleRequireArguments = requireArguments();
        Intrinsics.checkNotNullExpressionValue(bundleRequireArguments, "");
        return Intrinsics.EZpvd(oGW.KWHzl(bundleRequireArguments, "KEY_IS_VIP_GROUP"), java.lang.Boolean.TRUE);
    }

    public final java.lang.String fIwbmz() {
        Application application = this.getFieldNames;
        if (application != null) {
            return application.AEQbTJ();
        }
        return null;
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        this.AwvSrB = (C55237xgE) view.findViewById(C35399nuc.StateListAnimator.HrFqwD);
        this.wlaJM = (android.view.ViewGroup) view.findViewById(C35399nuc.StateListAnimator.itxZVF);
        this.fIwbmz = ((C55230xfy) view.findViewById(C35399nuc.StateListAnimator.zYHWMc)).KWHzl();
        OLrzqt((oIS) view.findViewById(C35399nuc.StateListAnimator.HJWChPHhYHK));
        values().setIndexBarVisibility(false);
        android.widget.EditText editText = this.fIwbmz;
        if (editText == null) {
            Intrinsics.gEmmrt("");
            editText = null;
        }
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        C33606mzd.copydefault(editText, viewLifecycleOwner, new Function1() { // from class: o.nXF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return nXG.AEQbTJ(this.copydefault, (java.lang.CharSequence) obj);
            }
        });
        this.AuCTel = (android.widget.LinearLayout) view.findViewById(C35399nuc.StateListAnimator.zblBkD);
        this.fJNWhG = (C52794wYp) view.findViewById(C35399nuc.StateListAnimator.ORxRYg);
        values().setIndexBarTextColor(C32113mPz.ActionBar.iwGUEr);
        RecyclerView.ItemAnimator itemAnimator = values().getItemAnimator();
        if (itemAnimator != null) {
            itemAnimator.setChangeDuration(0L);
        }
        values().setLayoutManager(C33047mpA.KWHzl(requireContext()));
        copydefault(this.ejfBZ);
        values().setAdapter(this.ejfBZ);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(C35399nuc.StateListAnimator.fAklCm);
        this.zsXlph = recyclerView;
        if (recyclerView == null) {
            Intrinsics.gEmmrt("");
            recyclerView = null;
        }
        RecyclerView.ItemAnimator itemAnimator2 = recyclerView.getItemAnimator();
        if (itemAnimator2 != null) {
            itemAnimator2.setChangeDuration(0L);
        }
        RecyclerView recyclerView2 = this.zsXlph;
        if (recyclerView2 == null) {
            Intrinsics.gEmmrt("");
            recyclerView2 = null;
        }
        recyclerView2.setLayoutManager(C33047mpA.OLrzqt(requireContext()));
        this.AubY.register(GroupMemberInfo.class, new ActionBar());
        RecyclerView recyclerView3 = this.zsXlph;
        if (recyclerView3 == null) {
            Intrinsics.gEmmrt("");
            recyclerView3 = null;
        }
        recyclerView3.setAdapter(this.AubY);
        this.fARcdN = new C43319rmz(this.AubY, new Activity());
        Flow flowOnEach = FlowKt.onEach(FlowExtKt.flowWithLifecycle$default(AuCTel().OLrzqt(), getViewLifecycleOwner().getLifecycle(), null, 2, null), new SelectableMemberListFragment$initView$3(this, null));
        LifecycleOwner viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "");
        FlowKt.launchIn(flowOnEach, LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner2));
        iwGUEr();
    }

    public static final Unit AEQbTJ(nXG nxg, java.lang.CharSequence charSequence) {
        nxg.uzCIH = true;
        nxg.OLrzqt(charSequence != null ? charSequence.toString() : null);
        return Unit.INSTANCE;
    }

    public static final class Activity implements InterfaceC43315rmv.Application {
        @Override // o.InterfaceC43315rmv.Application
        public java.lang.Object KWHzl(int i, int i2) {
            return null;
        }

        @Override // o.InterfaceC43315rmv.Application
        public boolean KWHzl(java.lang.Object obj, java.lang.Object obj2) {
            return true;
        }

        @Override // o.InterfaceC43315rmv.Application
        public boolean AEQbTJ(java.lang.Object obj, java.lang.Object obj2) {
            if ((obj instanceof GroupMemberInfo) && (obj2 instanceof GroupMemberInfo)) {
                return Intrinsics.EZpvd((java.lang.Object) ((GroupMemberInfo) obj).getMemberId(), (java.lang.Object) ((GroupMemberInfo) obj2).getMemberId());
            }
            return false;
        }
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.odv.registerIMSimpleMessageEventManager$default(o.odv, o.nsQ, java.lang.String, com.okinc.im.config.page.ServiceName, int, java.lang.Object):void */
    public final void iwGUEr() {
        InterfaceC35282nsQ interfaceC35282nsQ = this.sSMYrx;
        if (interfaceC35282nsQ != null) {
            C36597odv.KWHzl.OLrzqt(interfaceC35282nsQ);
        }
        LoaderManager loaderManager = new LoaderManager();
        this.sSMYrx = loaderManager;
        C36597odv.registerIMSimpleMessageEventManager$default(C36597odv.KWHzl, loaderManager, OLrzqt().getGroupId(), null, 4, null);
    }

    public static final class LoaderManager implements InterfaceC35282nsQ {
        public LoaderManager() {
        }

        @Override // o.InterfaceC35282nsQ
        public void KWHzl(OKMessage oKMessage) {
            Intrinsics.checkNotNullParameter(oKMessage, "");
            if (oKMessage.getContent() instanceof UpdateGroupMemberMessage) {
                pUU.EZpvd("SelectableMemberList", "Member update message received");
                Application application = nXG.this.getFieldNames;
                if (application != null) {
                    application.copydefault();
                }
            }
        }
    }

    @Override // o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        requireActivity().getSupportFragmentManager().setFragmentResultListener("REQUEST_KEY_MEMBER_REMOVED", getViewLifecycleOwner(), new FragmentResultListener() { // from class: o.nXI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.fragment.app.FragmentResultListener
            public final void onFragmentResult(java.lang.String str, android.os.Bundle bundle2) {
                nXG.copydefault(this.copydefault, str, bundle2);
            }
        });
        this.getFieldNames = new Application(this, OLrzqt());
        this.isConnected = OLrzqt().getGroupCount();
        C55237xgE c55237xgE = this.AwvSrB;
        if (c55237xgE == null) {
            Intrinsics.gEmmrt("");
            c55237xgE = null;
        }
        Application application = this.getFieldNames;
        if (application != null) {
            FragmentManager fragmentManager = new FragmentManager(c55237xgE, application, C52761wXj.FragmentManager.fIwbmz);
            this.AkhnZx = fragmentManager;
            Application application2 = this.getFieldNames;
            if (application2 != null) {
                application2.observe(getViewLifecycleOwner(), fragmentManager);
                return;
            }
            return;
        }
        throw new java.lang.IllegalArgumentException("Required value was null.".toString());
    }

    public static final void copydefault(nXG nxg, java.lang.String str, android.os.Bundle bundle) {
        Application application;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(bundle, "");
        if (!bundle.getBoolean("RESULT_KEY_MEMBER_REMOVED", false) || (application = nxg.getFieldNames) == null) {
            return;
        }
        application.copydefault();
    }

    public static final class FragmentManager extends AbstractC32943mnC<java.lang.Object> {
        public FragmentManager(C55237xgE c55237xgE, Application application, int i) {
            super(c55237xgE, application, i);
        }

        /* JADX DEBUG: Method merged with bridge method: KWHzl(Ljava/lang/Object;)Z */
        @Override // o.AbstractC32943mnC, o.AbstractC32992mnz
        /* JADX INFO: renamed from: copydefault */
        public boolean KWHzl(java.util.List<? extends java.lang.Object> list) {
            Intrinsics.checkNotNullParameter(list, "");
            return nXG.this.copydefault(list);
        }

        /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Ljava/lang/Object;Landroid/view/View;)V */
        @Override // o.AbstractC32992mnz
        public void AEQbTJ(java.util.List<? extends java.lang.Object> list, android.view.View view) {
            Intrinsics.checkNotNullParameter(list, "");
            super.AEQbTJ(list, view);
            nXG nxg = nXG.this;
            nxg.copydefault(list, nxg.getNewProxyInstance);
            nXG.this.getNewProxyInstance = false;
            rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) nXG.this, true, (java.lang.String) null, 2, (java.lang.Object) null);
        }

        /* JADX DEBUG: Method merged with bridge method: KWHzl(Ljava/lang/Throwable;Ljava/lang/Object;Landroid/view/View;)V */
        @Override // o.AbstractC32992mnz
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public void KWHzl(java.lang.Throwable th, java.util.List<? extends java.lang.Object> list, android.view.View view) {
            Intrinsics.checkNotNullParameter(th, "");
            super.KWHzl(th, list, view);
            C44157sFk.KWHzl(th);
            rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) nXG.this, false, (java.lang.String) null, 2, (java.lang.Object) null);
        }

        /* JADX DEBUG: Method merged with bridge method: copydefault(Ljava/lang/Object;Landroid/view/View;)V */
        @Override // o.AbstractC32992mnz
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public void copydefault(java.util.List<? extends java.lang.Object> list, android.view.View view) {
            Intrinsics.checkNotNullParameter(list, "");
            super.copydefault(list, view);
            nXG.this.KWHzl(list, view);
            rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) nXG.this, true, (java.lang.String) null, 2, (java.lang.Object) null);
        }
    }

    public boolean copydefault(@NotNull java.util.List<? extends java.lang.Object> list) {
        Intrinsics.checkNotNullParameter(list, "");
        Application application = this.getFieldNames;
        if (application == null || !application.gEmmrt()) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : list) {
                if (obj instanceof GroupMemberInfo) {
                    arrayList.add(obj);
                }
            }
            if (arrayList.isEmpty()) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        java.lang.Runnable runnable = this.gHZMYf;
        if (runnable != null) {
            android.widget.EditText editText = this.fIwbmz;
            if (editText == null) {
                Intrinsics.gEmmrt("");
                editText = null;
            }
            editText.removeCallbacks(runnable);
            this.gHZMYf = null;
        }
        values().setAdapter(null);
        RecyclerView recyclerView = this.zsXlph;
        if (recyclerView == null) {
            Intrinsics.gEmmrt("");
            recyclerView = null;
        }
        recyclerView.setAdapter(null);
        this.AkhnZx = null;
        Application application = this.getFieldNames;
        if (application != null) {
            application.removeObservers(getViewLifecycleOwner());
        }
        this.getFieldNames = null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        InterfaceC35282nsQ interfaceC35282nsQ = this.sSMYrx;
        if (interfaceC35282nsQ != null) {
            C36597odv.KWHzl.OLrzqt(interfaceC35282nsQ);
            this.sSMYrx = null;
        }
        this.DbNXlk.OLrzqt();
    }

    @Override // o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        InterfaceC35282nsQ interfaceC35282nsQ = this.sSMYrx;
        if (interfaceC35282nsQ != null) {
            C36597odv.KWHzl.OLrzqt(interfaceC35282nsQ);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void copydefault(java.util.List<? extends java.lang.Object> list, boolean z) {
        android.widget.EditText editText;
        this.hDKMBd.clear();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<T> it = list.iterator();
        while (true) {
            editText = null;
            if (!it.hasNext()) {
                break;
            }
            java.lang.Object next = it.next();
            if (!Intrinsics.EZpvd((java.lang.Object) ((next instanceof GroupMemberInfo ? (GroupMemberInfo) next : null) != null ? r3.getMemberId() : null), (java.lang.Object) C44157sFk.EZpvd())) {
                arrayList.add(next);
            }
        }
        this.hDKMBd.addAll(arrayList);
        this.ejfBZ.notifyDataSetChanged();
        if (z) {
            KWHzl(AEQbTJ());
        }
        uzCIH();
        if (this.uzCIH) {
            java.lang.Runnable runnable = this.gHZMYf;
            if (runnable != null) {
                android.widget.EditText editText2 = this.fIwbmz;
                if (editText2 == null) {
                    Intrinsics.gEmmrt("");
                    editText2 = null;
                }
                editText2.removeCallbacks(runnable);
            }
            java.lang.Runnable runnable2 = new java.lang.Runnable() { // from class: o.nXL
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    nXG.DbNXlk(this.KWHzl);
                }
            };
            this.gHZMYf = runnable2;
            android.widget.EditText editText3 = this.fIwbmz;
            if (editText3 == null) {
                Intrinsics.gEmmrt("");
            } else {
                editText = editText3;
            }
            editText.postDelayed(runnable2, 100L);
        }
        this.uzCIH = false;
    }

    public static final void DbNXlk(nXG nxg) {
        if (!nxg.isAdded() || nxg.getView() == null) {
            return;
        }
        android.widget.EditText editText = nxg.fIwbmz;
        if (editText == null) {
            Intrinsics.gEmmrt("");
            editText = null;
        }
        editText.requestFocus();
    }

    private final void KWHzl(java.util.List<java.lang.String> list) {
        if (AhwBna()) {
            Dialog dialogIsConnected = isConnected();
            java.util.Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                int iCopydefault = dialogIsConnected.copydefault((java.lang.String) it.next());
                if (iCopydefault >= 0) {
                    dialogIsConnected.copydefault(iCopydefault, true);
                }
            }
        }
    }

    private final void uzCIH() {
        final java.util.List<GroupMemberInfo> listEjfBZ = ejfBZ();
        int i = ((listEjfBZ.isEmpty() ^ true) && fJNWhG() == SelectableDelegate.Mode.MULTIPLE) ? 0 : 8;
        RecyclerView recyclerView = this.zsXlph;
        C43319rmz c43319rmz = null;
        C43319rmz c43319rmz2 = null;
        RecyclerView recyclerView2 = null;
        if (recyclerView == null) {
            Intrinsics.gEmmrt("");
            recyclerView = null;
        }
        if (recyclerView.getVisibility() == i) {
            if (i == 0 && (!listEjfBZ.isEmpty())) {
                C43319rmz c43319rmz3 = this.fARcdN;
                if (c43319rmz3 == null) {
                    Intrinsics.gEmmrt("");
                } else {
                    c43319rmz = c43319rmz3;
                }
                c43319rmz.OLrzqt(listEjfBZ);
                return;
            }
            return;
        }
        if (i == 0) {
            RecyclerView recyclerView3 = this.zsXlph;
            if (recyclerView3 == null) {
                Intrinsics.gEmmrt("");
                recyclerView3 = null;
            }
            recyclerView3.setVisibility(i);
            C43319rmz c43319rmz4 = this.fARcdN;
            if (c43319rmz4 == null) {
                Intrinsics.gEmmrt("");
            } else {
                c43319rmz2 = c43319rmz4;
            }
            c43319rmz2.OLrzqt(listEjfBZ);
            return;
        }
        RecyclerView recyclerView4 = this.zsXlph;
        if (recyclerView4 == null) {
            Intrinsics.gEmmrt("");
            recyclerView4 = null;
        }
        recyclerView4.setVisibility(i);
        RecyclerView recyclerView5 = this.zsXlph;
        if (recyclerView5 == null) {
            Intrinsics.gEmmrt("");
        } else {
            recyclerView2 = recyclerView5;
        }
        recyclerView2.post(new java.lang.Runnable() { // from class: o.nXE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                nXG.copydefault(this.EZpvd, listEjfBZ);
            }
        });
    }

    public static final void copydefault(nXG nxg, java.util.List list) {
        if (!nxg.isAdded() || nxg.getView() == null) {
            return;
        }
        C43319rmz c43319rmz = nxg.fARcdN;
        if (c43319rmz == null) {
            Intrinsics.gEmmrt("");
            c43319rmz = null;
        }
        c43319rmz.OLrzqt(list);
    }

    public final GroupInfo fetchVPNInfo() {
        return OLrzqt();
    }

    public final java.util.List<GroupMemberInfo> ejfBZ() {
        java.lang.Object next;
        Application application = this.getFieldNames;
        java.util.List<java.lang.Object> listValueOf = application != null ? application.valueOf() : null;
        if (listValueOf == null || listValueOf.isEmpty()) {
            return yDY.AhwBna();
        }
        java.util.List<java.lang.String> listEZpvd = isConnected().EZpvd();
        java.util.ArrayList arrayList = new java.util.ArrayList(listEZpvd.size());
        for (java.lang.String str : listEZpvd) {
            java.util.Iterator<T> it = listValueOf.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if ((next instanceof GroupMemberInfo) && android.text.TextUtils.equals(((GroupMemberInfo) next).getMemberId(), str)) {
                    break;
                }
            }
            if (next != null) {
                arrayList.add((GroupMemberInfo) next);
            }
        }
        return arrayList;
    }

    public final void OLrzqt(@NotNull SelectableDelegate.Mode mode) {
        Intrinsics.checkNotNullParameter(mode, "");
        requireArguments().putParcelable(OtcExtraKeys.MODE, mode);
        isConnected().KWHzl(mode);
    }

    public final SelectableDelegate.Mode fJNWhG() {
        return isConnected().AEQbTJ();
    }

    @Override // o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onResume() {
        Application application;
        super.onResume();
        iwGUEr();
        if (!isReenter() || (application = this.getFieldNames) == null) {
            return;
        }
        application.copydefault();
    }

    public static final class Fragment extends C36421oae {
        public Fragment(boolean z) {
            super(z);
        }

        @Override // o.C36421oae
        public SelectableDelegate<RecyclerView.ViewHolder, java.lang.String> EZpvd() {
            if (nXG.this.AhwBna()) {
                return nXG.this.isConnected();
            }
            return null;
        }

        @Override // o.C36421oae
        public java.lang.String copydefault() {
            Application application = nXG.this.getFieldNames;
            if (application != null) {
                return application.AEQbTJ();
            }
            return null;
        }

        @Override // o.C36421oae
        public void KWHzl(C43312rms<nNV> c43312rms, GroupMemberInfo groupMemberInfo) {
            Intrinsics.checkNotNullParameter(c43312rms, "");
            Intrinsics.checkNotNullParameter(groupMemberInfo, "");
            nXG.this.KWHzl(c43312rms, groupMemberInfo);
        }

        @Override // o.C36421oae
        public void AEQbTJ() {
            super.AEQbTJ();
            nXG.this.hDKMBd();
        }
    }

    public void copydefault(@NotNull C59534zip c59534zip) {
        Intrinsics.checkNotNullParameter(c59534zip, "");
        c59534zip.register(GroupMemberInfo.class, new Fragment(getFieldNames()));
        c59534zip.register(java.lang.String.class, new TaskDescription());
    }

    public java.lang.String KWHzl(int i, java.lang.Object obj) {
        java.lang.String string;
        java.lang.String str = "";
        if (obj == null) {
            return "";
        }
        if (obj instanceof GroupMemberInfo) {
            java.lang.Character chAhwBna = C59454zhO.AhwBna((java.lang.CharSequence) ((GroupMemberInfo) obj).getDisplayAlphabetText(), 0);
            if (chAhwBna != null && (string = chAhwBna.toString()) != null) {
                str = string;
            }
        } else {
            str = obj instanceof java.lang.String ? (java.lang.String) obj : ModelIdentifier.Helper.PRIMARY_KEY_DELIMITER;
        }
        pUU.KWHzl("SectionIndexerAdapter", "getSectionAlphabetText->position:" + i + "  Alphabet:" + str);
        return str;
    }

    public boolean copydefault(int i, java.lang.Object obj) {
        return obj != null && (obj instanceof GroupMemberInfo);
    }

    public void KWHzl(@NotNull C43312rms<nNV> c43312rms, @NotNull GroupMemberInfo groupMemberInfo) {
        Intrinsics.checkNotNullParameter(c43312rms, "");
        Intrinsics.checkNotNullParameter(groupMemberInfo, "");
        if (C44157sFk.KWHzl(groupMemberInfo.getMemberId())) {
            return;
        }
        AuCTel().KWHzl(groupMemberInfo.getMemberId(), groupMemberInfo.getGroupId());
    }

    /* JADX INFO: loaded from: classes18.dex */
    public final class TaskDescription extends AbstractC43310rmq<java.lang.String, AbstractC33940nLm> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.AbstractC43310rmq
        public int getItemLayoutId() {
            return C35399nuc.Dialog.UhxbNG;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.AbstractC43310rmq
        public int getVariableId() {
            return C35342ntX.djBIcL;
        }

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public TaskDescription() {
        }
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.oyM.performFilter$default(o.oyM, java.lang.String, boolean, int, java.lang.Object):void */
    public final void OLrzqt(java.lang.String str) {
        Application application;
        if (!djBIcL() || (application = this.getFieldNames) == null) {
            return;
        }
        AbstractC37675oyM.performFilter$default(application, str, false, 2, null);
    }

    public AbstractC58185ywX<java.util.List<GroupMemberInfo>> AEQbTJ(@NotNull final GroupInfo groupInfo) {
        Intrinsics.checkNotNullParameter(groupInfo, "");
        InterfaceC35180nqU interfaceC35180nqU = (InterfaceC35180nqU) C43251rlk.OLrzqt(InterfaceC35180nqU.class);
        if (interfaceC35180nqU == null) {
            throw new java.lang.IllegalArgumentException("OKIM Service not available".toString());
        }
        AbstractC58185ywX abstractC58185ywXEZpvd = C44525sTa.copydefault.EZpvd(new SelectableMemberListFragment$loadMemberList$2(interfaceC35180nqU, groupInfo, null));
        final Function1 function1 = new Function1() { // from class: o.nXK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return nXG.AEQbTJ(this.EZpvd, groupInfo, (java.util.List) obj);
            }
        };
        AbstractC58185ywX<java.util.List<GroupMemberInfo>> abstractC58185ywXAEQbTJ = abstractC58185ywXEZpvd.AEQbTJ(new InterfaceC58229yxO() { // from class: o.nXM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return nXG.AYXKKw(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        return abstractC58185ywXAEQbTJ;
    }

    public static final java.util.List AYXKKw(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (java.util.List) function1.invoke(obj);
    }

    public static final java.util.List AEQbTJ(nXG nxg, GroupInfo groupInfo, java.util.List list) {
        java.util.List<GroupMemberInfo> listCopydefault;
        GroupUserSettingInfo userSettingInfo;
        GroupRole role;
        Intrinsics.checkNotNullParameter(list, "");
        if (nxg.getFieldNames()) {
            listCopydefault = C35551nxW.copydefault.AYXKKw(list);
        } else {
            listCopydefault = C35551nxW.copydefault.copydefault((java.util.List<GroupMemberInfo>) list);
        }
        if (!(nxg.getActivity() instanceof ActivityC34289nYl) || groupInfo.isAllowMentionOthers() || ((userSettingInfo = groupInfo.getUserSettingInfo()) != null && (role = userSettingInfo.getRole()) != null && C44170sFx.KWHzl(role))) {
            nxg.isConnected = listCopydefault.size();
            return listCopydefault;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : listCopydefault) {
            GroupMemberInfo groupMemberInfo = (GroupMemberInfo) obj;
            if (C44170sFx.KWHzl(groupMemberInfo.getRole()) || C44170sFx.OLrzqt(groupMemberInfo.getOfficialTags())) {
                arrayList.add(obj);
            }
        }
        nxg.isConnected = arrayList.size();
        return arrayList;
    }

    public void KWHzl(@NotNull java.util.List<? extends java.lang.Object> list, android.view.View view) {
        Intrinsics.checkNotNullParameter(list, "");
        android.widget.TextView textView = view != null ? (android.widget.TextView) view.findViewById(C35399nuc.StateListAnimator.vqBjd) : null;
        android.graphics.drawable.Drawable drawableKWHzl = C33070mpX.KWHzl(C52761wXj.TaskDescription.HJWChPRGtXKC);
        if (textView != null) {
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds((android.graphics.drawable.Drawable) null, drawableKWHzl, (android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null);
        }
        if (textView != null) {
            textView.setText(C35399nuc.LoaderManager.UNDaji);
        }
    }

    /* JADX INFO: loaded from: classes18.dex */
    public final class Application extends AbstractC37675oyM<java.lang.Object> {
        public final /* synthetic */ nXG AhwBna;
        public final GroupInfo copydefault;

        public Application(@NotNull nXG nxg, GroupInfo groupInfo) {
            Intrinsics.checkNotNullParameter(groupInfo, "");
            this.AhwBna = nxg;
            this.copydefault = groupInfo;
        }

        @Override // o.AbstractC37675oyM
        public AbstractC58185ywX<java.util.List<java.lang.Object>> OLrzqt(long j) {
            AbstractC58185ywX abstractC58185ywXKWHzl = C33024moe.KWHzl((AbstractC58185ywX) this.AhwBna.AEQbTJ(this.copydefault));
            final Function1 function1 = new Function1() { // from class: o.nXJ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return nXG.Application.EZpvd((java.util.List) obj);
                }
            };
            AbstractC58185ywX abstractC58185ywXAEQbTJ = abstractC58185ywXKWHzl.AEQbTJ(new InterfaceC58229yxO() { // from class: o.nXN
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58229yxO
                public final java.lang.Object apply(java.lang.Object obj) {
                    return nXG.Application.copydefault(function1, obj);
                }
            });
            final nXG nxg = this.AhwBna;
            final Function1 function12 = new Function1() { // from class: o.nXQ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return nXG.Application.OLrzqt(nxg, (java.util.List) obj);
                }
            };
            AbstractC58185ywX<java.util.List<java.lang.Object>> abstractC58185ywXAEQbTJ2 = abstractC58185ywXAEQbTJ.AEQbTJ(new InterfaceC58229yxO() { // from class: o.nXP
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58229yxO
                public final java.lang.Object apply(java.lang.Object obj) {
                    return nXG.Application.KWHzl(function12, obj);
                }
            });
            Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ2, "");
            return abstractC58185ywXAEQbTJ2;
        }

        public static final java.util.List EZpvd(java.util.List list) {
            Intrinsics.checkNotNullParameter(list, "");
            return C35551nxW.copydefault.KWHzl(list);
        }

        public static final java.util.List copydefault(Function1 function1, java.lang.Object obj) {
            Intrinsics.checkNotNullParameter(obj, "");
            return (java.util.List) function1.invoke(obj);
        }

        public static final java.util.List KWHzl(Function1 function1, java.lang.Object obj) {
            Intrinsics.checkNotNullParameter(obj, "");
            return (java.util.List) function1.invoke(obj);
        }

        public static final java.util.List OLrzqt(nXG nxg, java.util.List list) {
            Intrinsics.checkNotNullParameter(list, "");
            return nxg.AEQbTJ((java.util.List<? extends java.lang.Object>) list);
        }

        @Override // o.AbstractC37675oyM
        public java.util.List<java.lang.Object> KWHzl(java.lang.String str, @NotNull java.util.List<? extends java.lang.Object> list) {
            Intrinsics.checkNotNullParameter(list, "");
            if (str != null && C33129mqd.OLrzqt((java.lang.CharSequence) str)) {
                boolean zAEQbTJ = C44157sFk.AEQbTJ();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                for (java.lang.Object obj : list) {
                    if (obj instanceof GroupMemberInfo) {
                        arrayList.add(obj);
                    }
                }
                list = new java.util.ArrayList<>();
                for (java.lang.Object obj2 : arrayList) {
                    GroupMemberInfo groupMemberInfo = (GroupMemberInfo) obj2;
                    if ((!zAEQbTJ || !StringsKt__StringsKt.AhwBna((java.lang.CharSequence) groupMemberInfo.getMemberId(), (java.lang.CharSequence) str, true)) && !StringsKt__StringsKt.AhwBna((java.lang.CharSequence) groupMemberInfo.getNickName(), (java.lang.CharSequence) str, true)) {
                        java.lang.String remarkName = groupMemberInfo.getRemarkName();
                        if (remarkName == null) {
                            remarkName = "";
                        }
                        if (!StringsKt__StringsKt.AhwBna((java.lang.CharSequence) remarkName, (java.lang.CharSequence) str, true) && !StringsKt__StringsKt.AhwBna((java.lang.CharSequence) C44157sFk.EZpvd(groupMemberInfo), (java.lang.CharSequence) str, true)) {
                        }
                    }
                    list.add(obj2);
                }
            }
            return list;
        }

        @Override // o.AbstractC37675oyM
        public void copydefault(java.lang.String str, @NotNull java.util.List<? extends java.lang.Object> list) {
            Intrinsics.checkNotNullParameter(list, "");
            if (this.AhwBna.AhwBna()) {
                this.AhwBna.isConnected().copydefault();
            }
        }
    }

    /* JADX INFO: loaded from: classes18.dex */
    public final class ActionBar extends AbstractC43310rmq<GroupMemberInfo, nLI> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.AbstractC43310rmq
        public int getItemLayoutId() {
            return C35399nuc.Dialog.dLBcXg;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.AbstractC43310rmq
        public int getVariableId() {
            return C35342ntX.djBIcL;
        }

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public ActionBar() {
        }

        /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
        /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Lo/rms;Ljava/lang/Object;)V */
        @Override // o.AbstractC43310rmq
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(@NotNull C43312rms<nLI> c43312rms, @NotNull final GroupMemberInfo groupMemberInfo) {
            Intrinsics.checkNotNullParameter(c43312rms, "");
            Intrinsics.checkNotNullParameter(groupMemberInfo, "");
            super.onBindViewHolder((C43312rms) c43312rms, groupMemberInfo);
            nLI nli = (nLI) c43312rms.OLrzqt();
            C35893oHp c35893oHp = nli.OLrzqt;
            Intrinsics.checkNotNullExpressionValue(c35893oHp, "");
            C37716ozA.KWHzl(c35893oHp, groupMemberInfo.getOfficialTags(), TagSize.DP_18);
            C35893oHp c35893oHp2 = nli.OLrzqt;
            Intrinsics.checkNotNullExpressionValue(c35893oHp2, "");
            C35891oHn.KWHzl(c35893oHp2, groupMemberInfo);
            android.view.View view = c43312rms.itemView;
            final nXG nxg = nXG.this;
            view.setOnClickListener(new View.OnClickListener() { // from class: o.nXO
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view2) {
                    nXG.ActionBar.KWHzl(groupMemberInfo, nxg, view2);
                }
            });
        }

        public static final void KWHzl(GroupMemberInfo groupMemberInfo, nXG nxg, android.view.View view) {
            nxg.isConnected().AEQbTJ(groupMemberInfo.getMemberId(), false);
            nxg.hDKMBd();
        }
    }

    public final void hDKMBd() {
        android.widget.EditText editText = this.fIwbmz;
        if (editText == null) {
            Intrinsics.gEmmrt("");
            editText = null;
        }
        editText.setText("");
    }

    public final android.widget.ImageView valueOf() {
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.copydefault(fragmentActivityRequireActivity, "");
        return nPO.OLrzqt((nPL) fragmentActivityRequireActivity);
    }

    public final android.widget.TextView fARcdN() {
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.copydefault(fragmentActivityRequireActivity, "");
        return nPO.copydefault((nPL) fragmentActivityRequireActivity);
    }

    public final android.widget.LinearLayout DbNXlk() {
        android.widget.LinearLayout linearLayout = this.AuCTel;
        if (linearLayout != null) {
            return linearLayout;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    public final C52794wYp gEmmrt() {
        C52794wYp c52794wYp = this.fJNWhG;
        if (c52794wYp != null) {
            return c52794wYp;
        }
        Intrinsics.gEmmrt("");
        return null;
    }
}
