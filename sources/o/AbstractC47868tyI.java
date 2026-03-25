package o;

import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.Observer;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.core.util.SPUtils;
import com.okinc.network.okg.response.OKServerException;
import com.okinc.planet.biz_notifications.model.FollowStatusV2Enum;
import com.okinc.planet.biz_notifications.ui.BaseNotificationFragment$initView$2;
import com.okinc.planet.biz_notifications.ui.BaseNotificationFragment$initView$3;
import com.okinc.planet.biz_onboarding.OrbitEditProfileScenario;
import com.okinc.planet.domain.remote.dto.RelatedAuthorInfo;
import com.okinc.planet.domain.remote.dto.UnreadMsg;
import com.okinc.planet_api.model.PlanetNotificationCategory;
import com.okinc.uilab.stateful.StatefulView;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.SharedFlow;
import o.C46388tSm;
import o.C47501trL;
import o.C47925tzM;
import o.InterfaceC8104awT;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tyI, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public abstract class AbstractC47868tyI extends AbstractC32996moC {
    public final boolean AEQbTJ;
    public final int AYXKKw;
    public final C59534zip AhwBna;
    public final InterfaceC56387yDm AkhnZx;
    public boolean EZpvd;
    public boolean KWHzl;
    public boolean OLrzqt;
    public final InterfaceC56387yDm djBIcL;
    public final InterfaceC56387yDm gEmmrt;
    public tMD valueOf;

    /* JADX INFO: renamed from: o.tyI$Activity */
    public final /* synthetic */ class Activity {
        public static final /* synthetic */ int[] AEQbTJ;
        public static final /* synthetic */ int[] OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[StatefulView.Status.values().length];
            try {
                iArr[StatefulView.Status.Error.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[StatefulView.Status.Empty.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[StatefulView.Status.Content.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            OLrzqt = iArr;
            int[] iArr2 = new int[FollowStatusV2Enum.values().length];
            try {
                iArr2[FollowStatusV2Enum.FOLLOWING_EACH_OTHER.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr2[FollowStatusV2Enum.I_FOLLOWING_OTHER_PARTY.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr2[FollowStatusV2Enum.OTHER_PARTY_FOLLOW_ME.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            AEQbTJ = iArr2;
        }
    }

    /* JADX INFO: renamed from: o.tyI$TaskDescription */
    public static final /* synthetic */ class TaskDescription implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(Function1 function1) {
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
    public boolean OLrzqt() {
        return this.AEQbTJ;
    }

    public void copydefault(C55173xeu c55173xeu) {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void copydefault(@NotNull C59534zip c59534zip) {
        Intrinsics.checkNotNullParameter(c59534zip, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return this.AYXKKw;
    }

    public AbstractC47868tyI() {
        Function0 function0 = new Function0() { // from class: o.tza
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return AbstractC47868tyI.AEQbTJ(this.AEQbTJ);
            }
        };
        final Function0<androidx.fragment.app.Fragment> function02 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.planet.biz_notifications.ui.BaseNotificationFragment$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.planet.biz_notifications.ui.BaseNotificationFragment$special$$inlined$viewModels$default$2
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) function02.invoke();
            }
        });
        final Function0 function03 = null;
        this.gEmmrt = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(C47931tzS.class), new Function0<ViewModelStore>() { // from class: com.okinc.planet.biz_notifications.ui.BaseNotificationFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.planet.biz_notifications.ui.BaseNotificationFragment$special$$inlined$viewModels$default$4
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
                Function0 function04 = function03;
                if (function04 != null && (creationExtras = (CreationExtras) function04.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerM5735viewModels$lambda1 = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM5735viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM5735viewModels$lambda1 : null;
                CreationExtras defaultViewModelCreationExtras = hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : null;
                return defaultViewModelCreationExtras == null ? CreationExtras.Empty.INSTANCE : defaultViewModelCreationExtras;
            }
        }, function0);
        this.djBIcL = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(C47925tzM.class), new Function0<ViewModelStore>() { // from class: com.okinc.planet.biz_notifications.ui.BaseNotificationFragment$special$$inlined$activityViewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.planet.biz_notifications.ui.BaseNotificationFragment$special$$inlined$activityViewModels$default$2
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
                Function0 function04 = function03;
                if (function04 != null && (creationExtras = (CreationExtras) function04.invoke()) != null) {
                    return creationExtras;
                }
                CreationExtras defaultViewModelCreationExtras = this.requireActivity().getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "");
                return defaultViewModelCreationExtras;
            }
        }, new Function0() { // from class: o.tyX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return AbstractC47868tyI.EZpvd(this.AEQbTJ);
            }
        });
        this.AYXKKw = C47501trL.Application.AuCTel;
        this.AhwBna = new C59534zip();
        this.AkhnZx = C56392yDr.copydefault(new Function0() { // from class: o.tyO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return AbstractC47868tyI.KWHzl();
            }
        });
    }

    public final C47931tzS valueOf() {
        return (C47931tzS) this.gEmmrt.getValue();
    }

    public static final ViewModelProvider.Factory AEQbTJ(AbstractC47868tyI abstractC47868tyI) {
        return new tRJ(abstractC47868tyI, abstractC47868tyI.getArguments(), new Function1() { // from class: o.tyR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AbstractC47868tyI.copydefault((SavedStateHandle) obj);
            }
        });
    }

    public static final C47931tzS copydefault(SavedStateHandle savedStateHandle) {
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        return new C47931tzS(savedStateHandle, null, null, 6, null);
    }

    public final C47925tzM gEmmrt() {
        return (C47925tzM) this.djBIcL.getValue();
    }

    public static final C47925tzM AEQbTJ(SavedStateHandle savedStateHandle) {
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        return new C47925tzM(savedStateHandle, null, null, null, 14, null);
    }

    public static final ViewModelProvider.Factory EZpvd(AbstractC47868tyI abstractC47868tyI) {
        FragmentActivity fragmentActivityRequireActivity = abstractC47868tyI.requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
        android.content.Intent intent = abstractC47868tyI.requireActivity().getIntent();
        return new tRJ(fragmentActivityRequireActivity, intent != null ? intent.getExtras() : null, new Function1() { // from class: o.tyP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AbstractC47868tyI.AEQbTJ((SavedStateHandle) obj);
            }
        });
    }

    public static final InterfaceC47278tmy KWHzl() {
        return (InterfaceC47278tmy) C43251rlk.copydefault(InterfaceC47278tmy.class);
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        tMD tmdOLrzqt = tMD.OLrzqt(view);
        Intrinsics.copydefault(tmdOLrzqt);
        this.valueOf = tmdOLrzqt;
        AYXKKw();
        djBIcL();
        tMD tmd = this.valueOf;
        if (tmd == null) {
            Intrinsics.gEmmrt("");
            tmd = null;
        }
        final C33546myW c33546myW = tmd.KWHzl;
        c33546myW.OLrzqt(new InterfaceC57903yrG() { // from class: o.tyS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC57903yrG
            public final void copydefault(InterfaceC57934yrl interfaceC57934yrl) {
                AbstractC47868tyI.copydefault(this.OLrzqt, interfaceC57934yrl);
            }
        });
        c33546myW.KWHzl(new InterfaceC57900yrD() { // from class: o.tyT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC57900yrD
            public final void EZpvd(InterfaceC57934yrl interfaceC57934yrl) {
                AbstractC47868tyI.OLrzqt(this.AEQbTJ, c33546myW, interfaceC57934yrl);
            }
        });
        pUU.KWHzl("PlanetNotification", "initView-->:" + getClass().getSimpleName());
        SharedFlow<C47925tzM.StateListAnimator> sharedFlowEZpvd = gEmmrt().EZpvd();
        Lifecycle.State state = Lifecycle.State.CREATED;
        C46373tRy.AEQbTJ(sharedFlowEZpvd, this, state, new BaseNotificationFragment$initView$2(this, null));
        C46373tRy.AEQbTJ(gEmmrt().gEmmrt(), this, state, new BaseNotificationFragment$initView$3(this, null));
    }

    public static final void copydefault(AbstractC47868tyI abstractC47868tyI, InterfaceC57934yrl interfaceC57934yrl) {
        Intrinsics.checkNotNullParameter(interfaceC57934yrl, "");
        abstractC47868tyI.valueOf().EZpvd(false);
    }

    public static final void OLrzqt(AbstractC47868tyI abstractC47868tyI, C33546myW c33546myW, InterfaceC57934yrl interfaceC57934yrl) {
        Intrinsics.checkNotNullParameter(interfaceC57934yrl, "");
        if (abstractC47868tyI.valueOf().KWHzl()) {
            return;
        }
        c33546myW.AYXKKw();
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        pUU.KWHzl("PlanetNotification", "onCreate-->:" + getClass().getSimpleName());
    }

    public final PlanetNotificationCategory EZpvd() {
        return valueOf().copydefault();
    }

    @Override // o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        pUU.KWHzl("PlanetNotification", AEQbTJ() + "->onResume-->:" + getClass().getSimpleName());
        C47910tyy.copydefault.AEQbTJ(EZpvd());
        if (this.EZpvd) {
            return;
        }
        pUU.KWHzl("PlanetNotification", AEQbTJ() + "->first load refreshMessageList-->");
        valueOf().EZpvd(true);
        this.EZpvd = true;
    }

    public final void AEQbTJ(java.lang.String str, boolean z, java.lang.String str2) {
        java.lang.String strCopydefault;
        if (C33129mqd.OLrzqt((java.lang.CharSequence) str)) {
            java.util.List<?> items = this.AhwBna.getItems();
            Intrinsics.checkNotNullExpressionValue(items, "");
            int i = 0;
            for (java.lang.Object obj : items) {
                if (i < 0) {
                    yDY.AYXKKw();
                }
                if (obj instanceof UnreadMsg) {
                    UnreadMsg unreadMsg = (UnreadMsg) obj;
                    RelatedAuthorInfo relatedAuthorInfo = unreadMsg.getRelatedAuthorInfo();
                    if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) (relatedAuthorInfo != null ? relatedAuthorInfo.getAuthorId() : null)) && (strCopydefault = copydefault(unreadMsg.getRelatedAuthorInfo().getFollowStatusV2(), z, str2)) != null) {
                        unreadMsg.getRelatedAuthorInfo().setFollowStatusV2(strCopydefault);
                        this.AhwBna.notifyItemChanged(i);
                    }
                }
                i++;
            }
        }
    }

    public final java.lang.String copydefault(java.lang.String str, boolean z, java.lang.String str2) {
        FollowStatusV2Enum followStatusV2EnumCopydefault;
        if (C33129mqd.OLrzqt((java.lang.CharSequence) str2)) {
            return str2;
        }
        FollowStatusV2Enum.Activity activity = FollowStatusV2Enum.Companion;
        if (activity.OLrzqt(str) == z || (followStatusV2EnumCopydefault = activity.copydefault(str)) == null) {
            return null;
        }
        return followStatusV2EnumCopydefault.getStatus();
    }

    public final void copydefault(long j) {
        java.util.List<?> items = this.AhwBna.getItems();
        Intrinsics.checkNotNullExpressionValue(items, "");
        int i = 0;
        for (java.lang.Object obj : items) {
            if (i < 0) {
                yDY.AYXKKw();
            }
            if ((obj instanceof UnreadMsg) && ((UnreadMsg) obj).getMsgId() == j) {
                pUU.KWHzl("PlanetNotification", AEQbTJ() + "->onUnreadSetChanged, notifyItemChanged index=" + i + ", msgId=" + j);
                this.AhwBna.notifyItemChanged(i);
                return;
            }
            i++;
        }
    }

    public final java.lang.String AEQbTJ() {
        return getClass().getSimpleName();
    }

    public final void KWHzl(long j) {
        SPUtils.put(C47904tys.EZpvd.KWHzl(), java.lang.Long.valueOf(j));
    }

    private final void djBIcL() {
        C47931tzS c47931tzSValueOf = valueOf();
        c47931tzSValueOf.AEQbTJ().observe(getViewLifecycleOwner(), new TaskDescription(new Function1() { // from class: o.tyV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AbstractC47868tyI.copydefault(this.OLrzqt, (C47914tzB) obj);
            }
        }));
        c47931tzSValueOf.EZpvd().observe(getViewLifecycleOwner(), new TaskDescription(new Function1() { // from class: o.tyU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AbstractC47868tyI.OLrzqt(this.AEQbTJ, (java.lang.String) obj);
            }
        }));
    }

    public static final Unit copydefault(AbstractC47868tyI abstractC47868tyI, C47914tzB c47914tzB) {
        pUU.KWHzl("PlanetNotification", abstractC47868tyI.AEQbTJ() + "->UIState->status:" + c47914tzB.OLrzqt() + " size:" + c47914tzB.AEQbTJ().size() + " cursor:" + c47914tzB.copydefault());
        tMD tmd = abstractC47868tyI.valueOf;
        if (tmd == null) {
            Intrinsics.gEmmrt("");
            tmd = null;
        }
        C55237xgE c55237xgE = tmd.copydefault;
        Intrinsics.checkNotNullExpressionValue(c55237xgE, "");
        tMD tmd2 = abstractC47868tyI.valueOf;
        if (tmd2 == null) {
            Intrinsics.gEmmrt("");
            tmd2 = null;
        }
        C33546myW c33546myW = tmd2.KWHzl;
        Intrinsics.checkNotNullExpressionValue(c33546myW, "");
        c55237xgE.setStatus(c47914tzB.OLrzqt());
        int i = Activity.OLrzqt[c47914tzB.OLrzqt().ordinal()];
        if (i == 1) {
            c33546myW.AhwBna(false);
            c33546myW.AEQbTJ();
            android.view.View viewAEQbTJ = c55237xgE.AEQbTJ(StatefulView.Status.Error);
            abstractC47868tyI.OLrzqt(viewAEQbTJ != null ? (C55173xeu) viewAEQbTJ.findViewById(C47501trL.TaskDescription.vLaW) : null);
            if (!abstractC47868tyI.OLrzqt) {
                abstractC47868tyI.OLrzqt = true;
                rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) abstractC47868tyI, false, (java.lang.String) null, 2, (java.lang.Object) null);
            }
        } else if (i == 2) {
            c33546myW.AhwBna(false);
            c33546myW.AEQbTJ();
            android.view.View viewAEQbTJ2 = c55237xgE.AEQbTJ(StatefulView.Status.Empty);
            abstractC47868tyI.copydefault(viewAEQbTJ2 != null ? (C55173xeu) viewAEQbTJ2.findViewById(C47501trL.TaskDescription.swzYdv) : null);
            if (!abstractC47868tyI.OLrzqt) {
                abstractC47868tyI.OLrzqt = true;
                rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) abstractC47868tyI, true, (java.lang.String) null, 2, (java.lang.Object) null);
            }
        } else if (i == 3) {
            if (c47914tzB.EZpvd()) {
                if (c47914tzB.KWHzl()) {
                    c33546myW.AhwBna(true);
                    c33546myW.AEQbTJ();
                } else {
                    c33546myW.AhwBna(false);
                    c33546myW.OLrzqt();
                }
            } else if (c47914tzB.KWHzl()) {
                c33546myW.AhwBna(true);
                c33546myW.valueOf();
            } else {
                c33546myW.AhwBna(false);
                c33546myW.AYXKKw();
            }
            for (java.lang.Object obj : c47914tzB.AEQbTJ()) {
                if (obj instanceof UnreadMsg) {
                    UnreadMsg unreadMsg = (UnreadMsg) obj;
                    if (unreadMsg.getReadStatus() == 1 && !unreadMsg.isUnreadAdded()) {
                        unreadMsg.setUnreadAdded(true);
                        abstractC47868tyI.gEmmrt().OLrzqt().add(java.lang.Long.valueOf(unreadMsg.getMsgId()));
                    }
                }
            }
            abstractC47868tyI.AhwBna.setItems(c47914tzB.AEQbTJ());
            abstractC47868tyI.AhwBna.notifyDataSetChanged();
            if (!abstractC47868tyI.OLrzqt) {
                abstractC47868tyI.OLrzqt = true;
                rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) abstractC47868tyI, true, (java.lang.String) null, 2, (java.lang.Object) null);
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(AbstractC47868tyI abstractC47868tyI, java.lang.String str) {
        tMD tmd = abstractC47868tyI.valueOf;
        if (tmd == null) {
            Intrinsics.gEmmrt("");
            tmd = null;
        }
        tmd.KWHzl.valueOf();
        if (str != null) {
            C55326xho.toastWithFailedIcon$default(str, 0, 1, (java.lang.Object) null);
        }
        return Unit.INSTANCE;
    }

    public void OLrzqt(C55173xeu c55173xeu) {
        if (c55173xeu != null) {
            c55173xeu.setRetryClickListener(new View.OnClickListener() { // from class: o.tyW
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    AbstractC47868tyI.AEQbTJ(this.KWHzl, view);
                }
            });
        }
    }

    public static final void AEQbTJ(AbstractC47868tyI abstractC47868tyI, android.view.View view) {
        abstractC47868tyI.valueOf().EZpvd(true);
    }

    private final void AYXKKw() {
        tMD tmd = this.valueOf;
        if (tmd == null) {
            Intrinsics.gEmmrt("");
            tmd = null;
        }
        RecyclerView recyclerView = tmd.EZpvd;
        recyclerView.setLayoutManager(C33047mpA.KWHzl(recyclerView.getContext()));
        this.AhwBna.register(java.lang.String.class, new C47961tzw());
        copydefault(this.AhwBna);
        recyclerView.addItemDecoration(new C47954tzp(this.AhwBna));
        recyclerView.setAdapter(this.AhwBna);
    }

    public final void OLrzqt(final UnreadMsg unreadMsg, @NotNull final C52794wYp c52794wYp) {
        RelatedAuthorInfo relatedAuthorInfo;
        Intrinsics.checkNotNullParameter(c52794wYp, "");
        C46388tSm.TaskDescription taskDescription = C46388tSm.Companion;
        if (!taskDescription.KWHzl().gEmmrt()) {
            InterfaceC8104awT interfaceC8104awT = (InterfaceC8104awT) C43251rlk.copydefault(InterfaceC8104awT.class);
            FragmentActivity fragmentActivityRequireActivity = requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
            InterfaceC8104awT.StateListAnimator.routeLogin$default(interfaceC8104awT, fragmentActivityRequireActivity, null, 2, null);
            return;
        }
        if (FollowStatusV2Enum.Companion.OLrzqt((unreadMsg == null || (relatedAuthorInfo = unreadMsg.getRelatedAuthorInfo()) == null) ? null : relatedAuthorInfo.getFollowStatusV2())) {
            KWHzl(unreadMsg, c52794wYp);
            return;
        }
        if (taskDescription.KWHzl().AYXKKw()) {
            tTY.EZpvd.copydefault(tUB.copydefault.EZpvd(), C33070mpX.AYXKKw(C47501trL.Fragment.call));
            return;
        }
        final tKX tkxOLrzqt = tKX.Companion.OLrzqt();
        FragmentActivity fragmentActivityRequireActivity2 = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity2, "");
        tkxOLrzqt.OLrzqt(fragmentActivityRequireActivity2, null, true, new Function0() { // from class: o.tyQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return AbstractC47868tyI.AEQbTJ(tkxOLrzqt, this, unreadMsg, c52794wYp);
            }
        });
    }

    public static final Unit AEQbTJ(tKX tkx, final AbstractC47868tyI abstractC47868tyI, final UnreadMsg unreadMsg, final C52794wYp c52794wYp) {
        FragmentActivity fragmentActivityRequireActivity = abstractC47868tyI.requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
        tKX.checkProfileModified$default(tkx, fragmentActivityRequireActivity, OrbitEditProfileScenario.CompleteOrbiterProfile.KWHzl, true, new Function0() { // from class: o.tyN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return AbstractC47868tyI.copydefault(this.KWHzl, unreadMsg, c52794wYp);
            }
        }, null, 16, null);
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(AbstractC47868tyI abstractC47868tyI, UnreadMsg unreadMsg, C52794wYp c52794wYp) {
        abstractC47868tyI.KWHzl(true, unreadMsg, c52794wYp);
        return Unit.INSTANCE;
    }

    public final void KWHzl(final UnreadMsg unreadMsg, final C52794wYp c52794wYp) {
        RelatedAuthorInfo relatedAuthorInfo;
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(contextRequireContext);
        viewOnClickListenerC54939xaY.EZpvd(0);
        viewOnClickListenerC54939xaY.setTitle(C33069mpW.copydefault(C47501trL.Fragment.bindToGooglePlayService, C56423yEv.EZpvd(C56390yDp.OLrzqt("name", C33129mqd.gEmmrt((unreadMsg == null || (relatedAuthorInfo = unreadMsg.getRelatedAuthorInfo()) == null) ? null : relatedAuthorInfo.getNickname())))));
        viewOnClickListenerC54939xaY.copydefault(C47501trL.Fragment.DfrfUJ);
        viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) C33070mpX.AYXKKw(C47501trL.Fragment.fJNWhG), new View.OnClickListener() { // from class: o.tyJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                AbstractC47868tyI.EZpvd(this.OLrzqt, unreadMsg, c52794wYp, viewOnClickListenerC54939xaY, view);
            }
        });
        ViewOnClickListenerC54939xaY.setSecondaryButton$default(viewOnClickListenerC54939xaY, C33070mpX.AYXKKw(C47501trL.Fragment.ejfBZ), (View.OnClickListener) null, 2, (java.lang.Object) null);
        viewOnClickListenerC54939xaY.show();
    }

    public static final void EZpvd(AbstractC47868tyI abstractC47868tyI, UnreadMsg unreadMsg, C52794wYp c52794wYp, ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        abstractC47868tyI.KWHzl(false, unreadMsg, c52794wYp);
        viewOnClickListenerC54939xaY.dismiss();
    }

    public final boolean KWHzl(boolean z, final UnreadMsg unreadMsg, @NotNull final C52794wYp c52794wYp) {
        RelatedAuthorInfo relatedAuthorInfo;
        RelatedAuthorInfo relatedAuthorInfo2;
        Intrinsics.checkNotNullParameter(c52794wYp, "");
        java.lang.String authorId = (unreadMsg == null || (relatedAuthorInfo2 = unreadMsg.getRelatedAuthorInfo()) == null) ? null : relatedAuthorInfo2.getAuthorId();
        if (!C33129mqd.OLrzqt((java.lang.CharSequence) authorId)) {
            return false;
        }
        c52794wYp.OLrzqt(0L);
        C47925tzM c47925tzMGEmmrt = gEmmrt();
        Intrinsics.copydefault((java.lang.Object) authorId);
        FollowStatusV2Enum followStatusV2EnumCopydefault = FollowStatusV2Enum.Companion.copydefault((unreadMsg == null || (relatedAuthorInfo = unreadMsg.getRelatedAuthorInfo()) == null) ? null : relatedAuthorInfo.getFollowStatusV2());
        c47925tzMGEmmrt.KWHzl(z, authorId, followStatusV2EnumCopydefault != null ? followStatusV2EnumCopydefault.getStatus() : null, new Function2() { // from class: o.tyK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return AbstractC47868tyI.copydefault(c52794wYp, this, unreadMsg, ((java.lang.Boolean) obj).booleanValue(), (OKServerException) obj2);
            }
        });
        return true;
    }

    public static final Unit copydefault(C52794wYp c52794wYp, AbstractC47868tyI abstractC47868tyI, UnreadMsg unreadMsg, boolean z, OKServerException oKServerException) {
        java.lang.String strEZpvd;
        java.lang.String strAYXKKw;
        int i;
        RelatedAuthorInfo relatedAuthorInfo;
        RelatedAuthorInfo relatedAuthorInfo2;
        RelatedAuthorInfo relatedAuthorInfo3;
        RelatedAuthorInfo relatedAuthorInfo4;
        c52794wYp.fIwbmz();
        java.lang.String followStatusV2 = null;
        if (z) {
            abstractC47868tyI.KWHzl = true;
            if (unreadMsg != null && (relatedAuthorInfo4 = unreadMsg.getRelatedAuthorInfo()) != null) {
                FollowStatusV2Enum.Activity activity = FollowStatusV2Enum.Companion;
                RelatedAuthorInfo relatedAuthorInfo5 = unreadMsg.getRelatedAuthorInfo();
                FollowStatusV2Enum followStatusV2EnumCopydefault = activity.copydefault(relatedAuthorInfo5 != null ? relatedAuthorInfo5.getFollowStatusV2() : null);
                relatedAuthorInfo4.setFollowStatusV2(followStatusV2EnumCopydefault != null ? followStatusV2EnumCopydefault.getStatus() : null);
            }
            FollowStatusV2Enum.Activity activity2 = FollowStatusV2Enum.Companion;
            if (activity2.OLrzqt((unreadMsg == null || (relatedAuthorInfo3 = unreadMsg.getRelatedAuthorInfo()) == null) ? null : relatedAuthorInfo3.getFollowStatusV2())) {
                C55326xho.toastWithSuccessfulIcon$default(C33069mpW.copydefault(abstractC47868tyI, C47501trL.Fragment.DztXDE, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("name", C33129mqd.gEmmrt((unreadMsg == null || (relatedAuthorInfo2 = unreadMsg.getRelatedAuthorInfo()) == null) ? null : relatedAuthorInfo2.getNickname())))), 0, 1, (java.lang.Object) null);
            }
            if (unreadMsg != null && (relatedAuthorInfo = unreadMsg.getRelatedAuthorInfo()) != null) {
                followStatusV2 = relatedAuthorInfo.getFollowStatusV2();
            }
            FollowStatusV2Enum followStatusV2EnumAEQbTJ = activity2.AEQbTJ(followStatusV2);
            int i2 = followStatusV2EnumAEQbTJ == null ? -1 : Activity.AEQbTJ[followStatusV2EnumAEQbTJ.ordinal()];
            if (i2 == 1 || i2 == 2) {
                strAYXKKw = C33070mpX.AYXKKw(C47501trL.Fragment.aHXSQp);
                i = 260;
            } else {
                i = 259;
                if (i2 == 3) {
                    strAYXKKw = C33070mpX.AYXKKw(C47501trL.Fragment.zuWLRA);
                } else {
                    strAYXKKw = C33070mpX.AYXKKw(C47501trL.Fragment.akftKQ);
                }
            }
            c52794wYp.setText(strAYXKKw);
            c52794wYp.setOKDSType(i);
        } else if (oKServerException != null && oKServerException.getCode() == 50034 && C46437tUh.OLrzqt.AEQbTJ()) {
            tKX tkxOLrzqt = tKX.Companion.OLrzqt();
            FragmentActivity fragmentActivityRequireActivity = abstractC47868tyI.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
            tKX.openProfileEditPage$default(tkxOLrzqt, fragmentActivityRequireActivity, OrbitEditProfileScenario.CompleteOrbiterProfile.KWHzl, true, null, 8, null);
        } else if (oKServerException != null && (strEZpvd = tRK.EZpvd(oKServerException)) != null) {
            C55326xho.toastWithFailedIcon$default(strEZpvd, 0, 1, (java.lang.Object) null);
        }
        return Unit.INSTANCE;
    }
}
