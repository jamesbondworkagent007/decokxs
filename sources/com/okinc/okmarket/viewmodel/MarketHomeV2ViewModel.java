package com.okinc.okmarket.viewmodel;

import androidx.lifecycle.ViewModelKt;
import com.okinc.business.defi.biz.core.error.WalletImportError;
import com.okinc.core.util.SPUtils;
import com.okinc.market.alert.database.MarketAlertDataBase;
import com.okinc.market.common.service.BizMarketService;
import com.okinc.market.watch.data.MarketUserFavorite;
import com.okinc.market.watch.data.UserGroup;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.okmarket.ui.market.data.UserGroupVo;
import com.okinc.okmarket.viewmodel.MarketHomeV2ViewModel;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.CoinWatchInstrument;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import o.AbstractC49408unw;
import o.AbstractC49411unz;
import o.C33024moe;
import o.C33070mpX;
import o.C33129mqd;
import o.C38383pWt;
import o.C38384pWu;
import o.C40483qXn;
import o.C43417ror;
import o.C46863tfG;
import o.C49373unN;
import o.C55326xho;
import o.C55686xod;
import o.C56391yDq;
import o.C56392yDr;
import o.C56402yEa;
import o.C56442yFn;
import o.C56443yFo;
import o.C56524yIo;
import o.InterfaceC49371unL;
import o.InterfaceC56387yDm;
import o.pUU;
import o.qWM;
import o.qWQ;
import o.qWX;
import o.qZH;
import o.xUD;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class MarketHomeV2ViewModel extends AbstractC49411unz<ActionBar> {
    public static final Activity Companion = new Activity(null);
    public static final int OLrzqt = 8;
    public final qWX AEQbTJ;
    public final InterfaceC56387yDm AYXKKw;
    public Job AhwBna;
    public final InterfaceC56387yDm EZpvd;
    public String KWHzl;
    public final C40483qXn copydefault;
    public final qWM djBIcL;
    public final C46863tfG valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.KWHzl = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String djBIcL() {
        return this.KWHzl;
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okmarket.viewmodel.MarketHomeV2ViewModel.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @yCM
    public MarketHomeV2ViewModel(@NotNull qWM qwm, @NotNull C40483qXn c40483qXn, @NotNull qWX qwx, @NotNull C46863tfG c46863tfG) {
        super(new ActionBar(null, null, null, null, null, 31, null));
        Intrinsics.checkNotNullParameter(qwm, "");
        Intrinsics.checkNotNullParameter(c40483qXn, "");
        Intrinsics.checkNotNullParameter(qwx, "");
        Intrinsics.checkNotNullParameter(c46863tfG, "");
        this.djBIcL = qwm;
        this.copydefault = c40483qXn;
        this.AEQbTJ = qwx;
        this.valueOf = c46863tfG;
        this.KWHzl = "SP_KEY_FAVORITE_TYPE_STR";
        this.AYXKKw = C56392yDr.copydefault(new Function0() { // from class: o.tfH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return MarketHomeV2ViewModel.copydefault();
            }
        });
        this.EZpvd = C56392yDr.copydefault(new Function0() { // from class: o.tfM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return MarketHomeV2ViewModel.EZpvd();
            }
        });
    }

    public static final class ActionBar extends AbstractC49408unw<ActionBar> {
        public Application AEQbTJ;
        public UserGroupVo EZpvd;
        public InterfaceC49371unL<TaskDescription> KWHzl;
        public Application OLrzqt;
        public InterfaceC49371unL<Unit> copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar() {
            this(null, null, null, null, null, 31, null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: com.okinc.okmarket.viewmodel.MarketHomeV2ViewModel$ActionBar */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ActionBar copy$default(ActionBar actionBar, InterfaceC49371unL interfaceC49371unL, InterfaceC49371unL interfaceC49371unL2, UserGroupVo userGroupVo, Application application, Application application2, int i, Object obj) {
            if ((i & 1) != 0) {
                interfaceC49371unL = actionBar.KWHzl;
            }
            if ((i & 2) != 0) {
                interfaceC49371unL2 = actionBar.copydefault;
            }
            InterfaceC49371unL interfaceC49371unL3 = interfaceC49371unL2;
            if ((i & 4) != 0) {
                userGroupVo = actionBar.EZpvd;
            }
            UserGroupVo userGroupVo2 = userGroupVo;
            if ((i & 8) != 0) {
                application = actionBar.OLrzqt;
            }
            Application application3 = application;
            if ((i & 16) != 0) {
                application2 = actionBar.AEQbTJ;
            }
            return actionBar.AEQbTJ(interfaceC49371unL, interfaceC49371unL3, userGroupVo2, application3, application2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ActionBar AEQbTJ(@NotNull InterfaceC49371unL<TaskDescription> interfaceC49371unL, @NotNull InterfaceC49371unL<Unit> interfaceC49371unL2, UserGroupVo userGroupVo, Application application, Application application2) {
            Intrinsics.checkNotNullParameter(interfaceC49371unL, "");
            Intrinsics.checkNotNullParameter(interfaceC49371unL2, "");
            return new ActionBar(interfaceC49371unL, interfaceC49371unL2, userGroupVo, application, application2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Application AEQbTJ() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(@NotNull InterfaceC49371unL<Unit> interfaceC49371unL) {
            Intrinsics.checkNotNullParameter(interfaceC49371unL, "");
            this.copydefault = interfaceC49371unL;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final InterfaceC49371unL<Unit> EZpvd() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(Application application) {
            this.AEQbTJ = application;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final InterfaceC49371unL<TaskDescription> KWHzl() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(@NotNull InterfaceC49371unL<TaskDescription> interfaceC49371unL) {
            Intrinsics.checkNotNullParameter(interfaceC49371unL, "");
            this.KWHzl = interfaceC49371unL;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final UserGroupVo OLrzqt() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(UserGroupVo userGroupVo) {
            this.EZpvd = userGroupVo;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(Application application) {
            this.OLrzqt = application;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Application copydefault() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ActionBar)) {
                return false;
            }
            ActionBar actionBar = (ActionBar) obj;
            return Intrinsics.EZpvd(this.KWHzl, actionBar.KWHzl) && Intrinsics.EZpvd(this.copydefault, actionBar.copydefault) && Intrinsics.EZpvd(this.EZpvd, actionBar.EZpvd) && Intrinsics.EZpvd(this.OLrzqt, actionBar.OLrzqt) && Intrinsics.EZpvd(this.AEQbTJ, actionBar.AEQbTJ);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = this.KWHzl.hashCode();
            int iHashCode2 = this.copydefault.hashCode();
            UserGroupVo userGroupVo = this.EZpvd;
            int iHashCode3 = userGroupVo == null ? 0 : userGroupVo.hashCode();
            Application application = this.OLrzqt;
            int iHashCode4 = application == null ? 0 : application.hashCode();
            Application application2 = this.AEQbTJ;
            return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (application2 != null ? application2.hashCode() : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "HomeGroupWatchUiState(tabList=" + this.KWHzl + ", rearrangeGroupsUiState=" + this.copydefault + ", switchFavUserGroup=" + this.EZpvd + ", hotRankingInstType=" + this.OLrzqt + ", upRankingInstType=" + this.AEQbTJ + ")";
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x002f: CONSTRUCTOR 
  (wrap:o.unL:?: TERNARY null = ((wrap:int:0x0000: ARITH (r9v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:o.unL:0x0008: CONSTRUCTOR (null java.lang.Object), (1 int), (null kotlin.jvm.internal.DefaultConstructorMarker) A[MD:(java.lang.Object, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:76) call: o.unL.StateListAnimator.<init>(java.lang.Object, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r4v0 o.unL))
  (wrap:o.unL:0x0014: TERNARY null = ((wrap:int:0x000b: ARITH (r9v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:o.unL:0x0011: CONSTRUCTOR (null java.lang.Object), (1 int), (null kotlin.jvm.internal.DefaultConstructorMarker) A[MD:(java.lang.Object, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:77) call: o.unL.StateListAnimator.<init>(java.lang.Object, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r5v0 o.unL))
  (wrap:com.okinc.okmarket.ui.market.data.UserGroupVo:?: TERNARY null = ((wrap:int:0x0015: ARITH (r9v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.okmarket.ui.market.data.UserGroupVo) : (r6v0 com.okinc.okmarket.ui.market.data.UserGroupVo))
  (wrap:com.okinc.okmarket.viewmodel.MarketHomeV2ViewModel$Application:?: TERNARY null = ((wrap:int:0x001c: ARITH (r9v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.okmarket.viewmodel.MarketHomeV2ViewModel$Application) : (r7v0 com.okinc.okmarket.viewmodel.MarketHomeV2ViewModel$Application))
  (wrap:com.okinc.okmarket.viewmodel.MarketHomeV2ViewModel$Application:?: TERNARY null = ((wrap:int:0x0023: ARITH (r9v0 int) & (16 int) A[WRAPPED]) == (0 int)) ? (r8v0 com.okinc.okmarket.viewmodel.MarketHomeV2ViewModel$Application) : (null com.okinc.okmarket.viewmodel.MarketHomeV2ViewModel$Application))
 A[MD:(o.unL<com.okinc.okmarket.viewmodel.MarketHomeV2ViewModel$TaskDescription>, o.unL<kotlin.Unit>, com.okinc.okmarket.ui.market.data.UserGroupVo, com.okinc.okmarket.viewmodel.MarketHomeV2ViewModel$Application, com.okinc.okmarket.viewmodel.MarketHomeV2ViewModel$Application):void (m)] (LINE:75) call: com.okinc.okmarket.viewmodel.MarketHomeV2ViewModel.ActionBar.<init>(o.unL, o.unL, com.okinc.okmarket.ui.market.data.UserGroupVo, com.okinc.okmarket.viewmodel.MarketHomeV2ViewModel$Application, com.okinc.okmarket.viewmodel.MarketHomeV2ViewModel$Application):void type: THIS */
        public /* synthetic */ ActionBar(InterfaceC49371unL interfaceC49371unL, InterfaceC49371unL interfaceC49371unL2, UserGroupVo userGroupVo, Application application, Application application2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? new InterfaceC49371unL.StateListAnimator(null, 1, null) : interfaceC49371unL, (i & 2) != 0 ? new InterfaceC49371unL.StateListAnimator(null, 1, null) : interfaceC49371unL2, (i & 4) != 0 ? null : userGroupVo, (i & 8) != 0 ? null : application, (i & 16) == 0 ? application2 : null);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ActionBar(@NotNull InterfaceC49371unL<TaskDescription> interfaceC49371unL, @NotNull InterfaceC49371unL<Unit> interfaceC49371unL2, UserGroupVo userGroupVo, Application application, Application application2) {
            super(new Function1() { // from class: o.tfN
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return MarketHomeV2ViewModel.ActionBar.AEQbTJ((MarketHomeV2ViewModel.ActionBar) obj);
                }
            });
            Intrinsics.checkNotNullParameter(interfaceC49371unL, "");
            Intrinsics.checkNotNullParameter(interfaceC49371unL2, "");
            this.KWHzl = interfaceC49371unL;
            this.copydefault = interfaceC49371unL2;
            this.EZpvd = userGroupVo;
            this.OLrzqt = application;
            this.AEQbTJ = application2;
        }

        public static final ActionBar AEQbTJ(ActionBar actionBar) {
            Intrinsics.checkNotNullParameter(actionBar, "");
            return copy$default(actionBar, null, null, null, null, null, 31, null);
        }
    }

    public static final class TaskDescription {
        public final boolean KWHzl;
        public final List<UserGroupVo> OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.okmarket.viewmodel.MarketHomeV2ViewModel$TaskDescription */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ TaskDescription copy$default(TaskDescription taskDescription, List list, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                list = taskDescription.OLrzqt;
            }
            if ((i & 2) != 0) {
                z = taskDescription.KWHzl;
            }
            return taskDescription.KWHzl(list, z);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final List<UserGroupVo> EZpvd() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TaskDescription KWHzl(@NotNull List<UserGroupVo> list, boolean z) {
            Intrinsics.checkNotNullParameter(list, "");
            return new TaskDescription(list, z);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean copydefault() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TaskDescription)) {
                return false;
            }
            TaskDescription taskDescription = (TaskDescription) obj;
            return Intrinsics.EZpvd(this.OLrzqt, taskDescription.OLrzqt) && this.KWHzl == taskDescription.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (this.OLrzqt.hashCode() * 31) + Boolean.hashCode(this.KWHzl);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "UserGroupVoCombineData(userGroupsVo=" + this.OLrzqt + ", haveAnyWatchListData=" + this.KWHzl + ")";
        }

        public TaskDescription(@NotNull List<UserGroupVo> list, boolean z) {
            Intrinsics.checkNotNullParameter(list, "");
            this.OLrzqt = list;
            this.KWHzl = z;
        }
    }

    public static final class Application {
        public final boolean EZpvd;
        public final String KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Application copy$default(Application application, String str, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                str = application.KWHzl;
            }
            if ((i & 2) != 0) {
                z = application.EZpvd;
            }
            return application.OLrzqt(str, z);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String AEQbTJ() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean KWHzl() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Application OLrzqt(String str, boolean z) {
            return new Application(str, z);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Application)) {
                return false;
            }
            Application application = (Application) obj;
            return Intrinsics.EZpvd((Object) this.KWHzl, (Object) application.KWHzl) && this.EZpvd == application.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            String str = this.KWHzl;
            return ((str == null ? 0 : str.hashCode()) * 31) + Boolean.hashCode(this.EZpvd);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "RankingInstTypeData(instType=" + this.KWHzl + ", isSwitch=" + this.EZpvd + ")";
        }

        public Application(String str, boolean z) {
            this.KWHzl = str;
            this.EZpvd = z;
        }
    }

    public final C38383pWt gEmmrt() {
        return (C38383pWt) this.AYXKKw.getValue();
    }

    public static final C38383pWt copydefault() {
        return new C38383pWt(C38384pWu.Companion.copydefault(MarketAlertDataBase.Companion.EZpvd()));
    }

    public final UserGroupVo valueOf() {
        return (UserGroupVo) this.EZpvd.getValue();
    }

    public static final UserGroupVo EZpvd() {
        return new UserGroupVo(new UserGroup("ALL", C55686xod.KWHzl(), 0, false, true, null, 36, null));
    }

    public static /* synthetic */ void loadGroupData$default(MarketHomeV2ViewModel marketHomeV2ViewModel, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        marketHomeV2ViewModel.copydefault(z);
    }

    public final void copydefault(boolean z) {
        Job job;
        if (z || (job = this.AhwBna) == null || !job.isActive()) {
            Job job2 = this.AhwBna;
            if (job2 != null) {
                Job.DefaultImpls.cancel$default(job2, (CancellationException) null, 1, (Object) null);
            }
            this.AhwBna = BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new MarketHomeV2ViewModel$loadGroupData$1(this, null), 3, null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ee A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x008b -> B:26:0x0090). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object KWHzl(List<UserGroupVo> list, Continuation<? super Unit> continuation) throws Throwable {
        MarketHomeV2ViewModel$checkFavUserGroup$1 marketHomeV2ViewModel$checkFavUserGroup$1;
        int i;
        MarketHomeV2ViewModel marketHomeV2ViewModel;
        Iterator<UserGroupVo> it;
        UserGroupVo userGroupVoValueOf;
        Object next;
        if (continuation instanceof MarketHomeV2ViewModel$checkFavUserGroup$1) {
            marketHomeV2ViewModel$checkFavUserGroup$1 = (MarketHomeV2ViewModel$checkFavUserGroup$1) continuation;
            int i2 = marketHomeV2ViewModel$checkFavUserGroup$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                marketHomeV2ViewModel$checkFavUserGroup$1.label = i2 - Integer.MIN_VALUE;
            } else {
                marketHomeV2ViewModel$checkFavUserGroup$1 = new MarketHomeV2ViewModel$checkFavUserGroup$1(this, continuation);
            }
        }
        Object obj = marketHomeV2ViewModel$checkFavUserGroup$1.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i3 = marketHomeV2ViewModel$checkFavUserGroup$1.label;
        if (i3 != 0) {
            if (i3 != 1) {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                return Unit.INSTANCE;
            }
            int i4 = marketHomeV2ViewModel$checkFavUserGroup$1.I$0;
            String str = (String) marketHomeV2ViewModel$checkFavUserGroup$1.L$3;
            it = (Iterator) marketHomeV2ViewModel$checkFavUserGroup$1.L$2;
            List<UserGroupVo> list2 = (List) marketHomeV2ViewModel$checkFavUserGroup$1.L$1;
            marketHomeV2ViewModel = (MarketHomeV2ViewModel) marketHomeV2ViewModel$checkFavUserGroup$1.L$0;
            C56391yDq.AEQbTJ(obj);
            if (!Intrinsics.EZpvd(str, obj)) {
                i = i4 + 1;
                list = list2;
                if (it.hasNext()) {
                    list2 = list;
                    i4 = -1;
                } else {
                    String groupName = it.next().getUserGroup().getGroupName();
                    marketHomeV2ViewModel$checkFavUserGroup$1.L$0 = marketHomeV2ViewModel;
                    marketHomeV2ViewModel$checkFavUserGroup$1.L$1 = list;
                    marketHomeV2ViewModel$checkFavUserGroup$1.L$2 = it;
                    marketHomeV2ViewModel$checkFavUserGroup$1.L$3 = groupName;
                    marketHomeV2ViewModel$checkFavUserGroup$1.I$0 = i;
                    marketHomeV2ViewModel$checkFavUserGroup$1.label = 1;
                    Object objAEQbTJ = marketHomeV2ViewModel.AEQbTJ(marketHomeV2ViewModel$checkFavUserGroup$1);
                    if (objAEQbTJ == objCopydefault) {
                        return objCopydefault;
                    }
                    list2 = list;
                    i4 = i;
                    str = groupName;
                    obj = objAEQbTJ;
                    if (!Intrinsics.EZpvd(str, obj)) {
                    }
                }
            }
            if (!C33129mqd.OLrzqt(C56443yFo.AEQbTJ(i4), C56443yFo.AEQbTJ(-1))) {
                userGroupVoValueOf = list2.get(i4);
            } else {
                Iterator<T> it2 = list2.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it2.next();
                    if (Intrinsics.EZpvd((Object) ((UserGroupVo) next).getUserGroup().getGroupName(), (Object) "ALL")) {
                        break;
                    }
                }
                userGroupVoValueOf = (UserGroupVo) next;
                if (userGroupVoValueOf == null) {
                    userGroupVoValueOf = marketHomeV2ViewModel.valueOf();
                }
            }
            marketHomeV2ViewModel$checkFavUserGroup$1.L$0 = null;
            marketHomeV2ViewModel$checkFavUserGroup$1.L$1 = null;
            marketHomeV2ViewModel$checkFavUserGroup$1.L$2 = null;
            marketHomeV2ViewModel$checkFavUserGroup$1.L$3 = null;
            marketHomeV2ViewModel$checkFavUserGroup$1.label = 2;
            if (marketHomeV2ViewModel.OLrzqt(userGroupVoValueOf, marketHomeV2ViewModel$checkFavUserGroup$1) == objCopydefault) {
                return objCopydefault;
            }
            return Unit.INSTANCE;
        }
        C56391yDq.AEQbTJ(obj);
        if (list.isEmpty()) {
            userGroupVoValueOf = valueOf();
            marketHomeV2ViewModel = this;
            marketHomeV2ViewModel$checkFavUserGroup$1.L$0 = null;
            marketHomeV2ViewModel$checkFavUserGroup$1.L$1 = null;
            marketHomeV2ViewModel$checkFavUserGroup$1.L$2 = null;
            marketHomeV2ViewModel$checkFavUserGroup$1.L$3 = null;
            marketHomeV2ViewModel$checkFavUserGroup$1.label = 2;
            if (marketHomeV2ViewModel.OLrzqt(userGroupVoValueOf, marketHomeV2ViewModel$checkFavUserGroup$1) == objCopydefault) {
            }
            return Unit.INSTANCE;
        }
        i = 0;
        marketHomeV2ViewModel = this;
        it = list.iterator();
        if (it.hasNext()) {
        }
    }

    public final Object OLrzqt(@NotNull UserGroupVo userGroupVo, @NotNull Continuation<? super Unit> continuation) {
        Object objKWHzl = KWHzl(new MutablePropertyReference1Impl() { // from class: com.okinc.okmarket.viewmodel.MarketHomeV2ViewModel$switchFavUserGroup$2
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56560yJx
            public Object get(Object obj) {
                return ((MarketHomeV2ViewModel.ActionBar) obj).OLrzqt();
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56554yJr
            public void set(Object obj, Object obj2) {
                ((MarketHomeV2ViewModel.ActionBar) obj).OLrzqt((UserGroupVo) obj2);
            }
        }, userGroupVo, continuation);
        return objKWHzl == C56442yFn.copydefault() ? objKWHzl : Unit.INSTANCE;
    }

    public final void OLrzqt() {
        C33024moe.subscribeOnIO$default(((BizMarketService) C43417ror.OLrzqt(C56524yIo.AEQbTJ(BizMarketService.class))).getListByInstrument(), new Function1() { // from class: o.tfJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return MarketHomeV2ViewModel.OLrzqt((java.lang.Throwable) obj);
            }
        }, (Function0) null, new Function1() { // from class: o.tfI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return MarketHomeV2ViewModel.KWHzl(this.copydefault, (ResponseData) obj);
            }
        }, 2, (Object) null);
    }

    public static final Unit OLrzqt(Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        pUU.AEQbTJ("MarketHomeV2ViewModel", "getAllReminds network error: " + th.getMessage(), th);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object AEQbTJ(MarketUserFavorite marketUserFavorite, @NotNull String str, @NotNull Continuation<? super Unit> continuation) throws Throwable {
        MarketHomeV2ViewModel$unStar$1 marketHomeV2ViewModel$unStar$1;
        Object objM7377constructorimpl;
        String message;
        if (continuation instanceof MarketHomeV2ViewModel$unStar$1) {
            marketHomeV2ViewModel$unStar$1 = (MarketHomeV2ViewModel$unStar$1) continuation;
            int i = marketHomeV2ViewModel$unStar$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                marketHomeV2ViewModel$unStar$1.label = i - Integer.MIN_VALUE;
            } else {
                marketHomeV2ViewModel$unStar$1 = new MarketHomeV2ViewModel$unStar$1(this, continuation);
            }
        }
        Object obj = marketHomeV2ViewModel$unStar$1.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = marketHomeV2ViewModel$unStar$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(obj);
                if (marketUserFavorite == null) {
                    return Unit.INSTANCE;
                }
                Result.Application application = Result.Companion;
                qWQ qwqOLrzqt = this.copydefault.OLrzqt();
                List<MarketUserFavorite> listEZpvd = C56402yEa.EZpvd(marketUserFavorite);
                marketHomeV2ViewModel$unStar$1.label = 1;
                if (qwqOLrzqt.copydefault(listEZpvd, str, marketHomeV2ViewModel$unStar$1) == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (Result.m7384isSuccessimpl(objM7377constructorimpl)) {
            C55326xho.toastWithSuccessfulIcon$default(C33070mpX.AYXKKw(qZH.PendingIntent.gHZMYf), 0, 1, (Object) null);
        }
        Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null && (message = thM7380exceptionOrNullimpl.getMessage()) != null) {
            C55326xho.toastWithFailedIcon$default(message, 0, 1, (Object) null);
        }
        return Unit.INSTANCE;
    }

    public final BizInstrument AEQbTJ(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return Intrinsics.EZpvd((Object) str2, (Object) "COIN") ? new CoinWatchInstrument(str, str2) : xUD.getWatchMarketInstrument$default(str2, str, null, null, false, 28, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object AEQbTJ(@NotNull Continuation<? super String> continuation) throws Throwable {
        MarketHomeV2ViewModel$getCurrentGroupName$1 marketHomeV2ViewModel$getCurrentGroupName$1;
        MarketHomeV2ViewModel marketHomeV2ViewModel;
        UserGroup userGroup;
        if (continuation instanceof MarketHomeV2ViewModel$getCurrentGroupName$1) {
            marketHomeV2ViewModel$getCurrentGroupName$1 = (MarketHomeV2ViewModel$getCurrentGroupName$1) continuation;
            int i = marketHomeV2ViewModel$getCurrentGroupName$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                marketHomeV2ViewModel$getCurrentGroupName$1.label = i - Integer.MIN_VALUE;
            } else {
                marketHomeV2ViewModel$getCurrentGroupName$1 = new MarketHomeV2ViewModel$getCurrentGroupName$1(this, continuation);
            }
        }
        Object objOLrzqt = marketHomeV2ViewModel$getCurrentGroupName$1.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = marketHomeV2ViewModel$getCurrentGroupName$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objOLrzqt);
            marketHomeV2ViewModel$getCurrentGroupName$1.L$0 = this;
            marketHomeV2ViewModel$getCurrentGroupName$1.label = 1;
            objOLrzqt = OLrzqt(this, marketHomeV2ViewModel$getCurrentGroupName$1);
            if (objOLrzqt == objCopydefault) {
                return objCopydefault;
            }
            marketHomeV2ViewModel = this;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objOLrzqt);
                String str = (String) objOLrzqt;
                return (str != null || StringsKt__StringsKt.fARcdN((CharSequence) str)) ? "ALL" : str;
            }
            marketHomeV2ViewModel = (MarketHomeV2ViewModel) marketHomeV2ViewModel$getCurrentGroupName$1.L$0;
            C56391yDq.AEQbTJ(objOLrzqt);
        }
        UserGroupVo userGroupVoOLrzqt = ((ActionBar) objOLrzqt).OLrzqt();
        String groupName = (userGroupVoOLrzqt == null || (userGroup = userGroupVoOLrzqt.getUserGroup()) == null) ? null : userGroup.getGroupName();
        if (groupName != null && !StringsKt__StringsKt.fARcdN((CharSequence) groupName)) {
            return groupName;
        }
        CoroutineDispatcher coroutineDispatcher = Dispatchers.getDefault();
        MarketHomeV2ViewModel$getCurrentGroupName$2 marketHomeV2ViewModel$getCurrentGroupName$2 = new MarketHomeV2ViewModel$getCurrentGroupName$2(marketHomeV2ViewModel, null);
        marketHomeV2ViewModel$getCurrentGroupName$1.L$0 = null;
        marketHomeV2ViewModel$getCurrentGroupName$1.label = 2;
        objOLrzqt = BuildersKt.withContext(coroutineDispatcher, marketHomeV2ViewModel$getCurrentGroupName$2, marketHomeV2ViewModel$getCurrentGroupName$1);
        if (objOLrzqt == objCopydefault) {
            return objCopydefault;
        }
        String str2 = (String) objOLrzqt;
        if (str2 != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object copydefault(@NotNull Continuation<? super Boolean> continuation) throws Throwable {
        MarketHomeV2ViewModel$isEmptyState$1 marketHomeV2ViewModel$isEmptyState$1;
        if (continuation instanceof MarketHomeV2ViewModel$isEmptyState$1) {
            marketHomeV2ViewModel$isEmptyState$1 = (MarketHomeV2ViewModel$isEmptyState$1) continuation;
            int i = marketHomeV2ViewModel$isEmptyState$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                marketHomeV2ViewModel$isEmptyState$1.label = i - Integer.MIN_VALUE;
            } else {
                marketHomeV2ViewModel$isEmptyState$1 = new MarketHomeV2ViewModel$isEmptyState$1(this, continuation);
            }
        }
        Object objOLrzqt = marketHomeV2ViewModel$isEmptyState$1.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = marketHomeV2ViewModel$isEmptyState$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objOLrzqt);
            marketHomeV2ViewModel$isEmptyState$1.label = 1;
            objOLrzqt = OLrzqt(this, marketHomeV2ViewModel$isEmptyState$1);
            if (objOLrzqt == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objOLrzqt);
        }
        return C56443yFo.KWHzl(((ActionBar) objOLrzqt).KWHzl() instanceof InterfaceC49371unL.TaskDescription);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object EZpvd(@NotNull Continuation<? super List<UserGroupVo>> continuation) throws Throwable {
        MarketHomeV2ViewModel$getCurrentTabList$1 marketHomeV2ViewModel$getCurrentTabList$1;
        TaskDescription taskDescription;
        if (continuation instanceof MarketHomeV2ViewModel$getCurrentTabList$1) {
            marketHomeV2ViewModel$getCurrentTabList$1 = (MarketHomeV2ViewModel$getCurrentTabList$1) continuation;
            int i = marketHomeV2ViewModel$getCurrentTabList$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                marketHomeV2ViewModel$getCurrentTabList$1.label = i - Integer.MIN_VALUE;
            } else {
                marketHomeV2ViewModel$getCurrentTabList$1 = new MarketHomeV2ViewModel$getCurrentTabList$1(this, continuation);
            }
        }
        Object objOLrzqt = marketHomeV2ViewModel$getCurrentTabList$1.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = marketHomeV2ViewModel$getCurrentTabList$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objOLrzqt);
            marketHomeV2ViewModel$getCurrentTabList$1.label = 1;
            objOLrzqt = OLrzqt(this, marketHomeV2ViewModel$getCurrentTabList$1);
            if (objOLrzqt == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objOLrzqt);
        }
        InterfaceC49371unL<TaskDescription> interfaceC49371unLKWHzl = ((ActionBar) objOLrzqt).KWHzl();
        InterfaceC49371unL.Activity activity = interfaceC49371unLKWHzl instanceof InterfaceC49371unL.Activity ? (InterfaceC49371unL.Activity) interfaceC49371unLKWHzl : null;
        if (activity == null || (taskDescription = (TaskDescription) activity.copydefault()) == null) {
            return null;
        }
        return taskDescription.EZpvd();
    }

    public final void OLrzqt(@NotNull List<UserGroupVo> list) {
        Intrinsics.checkNotNullParameter(list, "");
        C49373unN.AEQbTJ(this, new MutablePropertyReference1Impl() { // from class: com.okinc.okmarket.viewmodel.MarketHomeV2ViewModel$requestRearrangeGroupListOrder$1
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56560yJx
            public Object get(Object obj) {
                return ((MarketHomeV2ViewModel.ActionBar) obj).EZpvd();
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56554yJr
            public void set(Object obj, Object obj2) {
                ((MarketHomeV2ViewModel.ActionBar) obj).AEQbTJ((InterfaceC49371unL<Unit>) obj2);
            }
        }, (WalletImportError.ERROR_CODE_AA_CREATE_KEY & 2) != 0 ? null : null, (WalletImportError.ERROR_CODE_AA_CREATE_KEY & 4) != 0 ? null : null, (WalletImportError.ERROR_CODE_AA_CREATE_KEY & 8) != 0 ? null : null, (WalletImportError.ERROR_CODE_AA_CREATE_KEY & 16) != 0 ? null : new MarketHomeV2ViewModel$requestRearrangeGroupListOrder$2(this, null), (WalletImportError.ERROR_CODE_AA_CREATE_KEY & 32) != 0 ? null : null, (WalletImportError.ERROR_CODE_AA_CREATE_KEY & 64) != 0 ? null : null, new MarketHomeV2ViewModel$requestRearrangeGroupListOrder$3(this, list, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object KWHzl(String str, @NotNull Continuation<? super Unit> continuation) throws Throwable {
        MarketHomeV2ViewModel$updateHotRankingInstType$1 marketHomeV2ViewModel$updateHotRankingInstType$1;
        if (continuation instanceof MarketHomeV2ViewModel$updateHotRankingInstType$1) {
            marketHomeV2ViewModel$updateHotRankingInstType$1 = (MarketHomeV2ViewModel$updateHotRankingInstType$1) continuation;
            int i = marketHomeV2ViewModel$updateHotRankingInstType$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                marketHomeV2ViewModel$updateHotRankingInstType$1.label = i - Integer.MIN_VALUE;
            } else {
                marketHomeV2ViewModel$updateHotRankingInstType$1 = new MarketHomeV2ViewModel$updateHotRankingInstType$1(this, continuation);
            }
        }
        Object obj = marketHomeV2ViewModel$updateHotRankingInstType$1.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = marketHomeV2ViewModel$updateHotRankingInstType$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            MarketHomeV2ViewModel$updateHotRankingInstType$2 marketHomeV2ViewModel$updateHotRankingInstType$2 = new MutablePropertyReference1Impl() { // from class: com.okinc.okmarket.viewmodel.MarketHomeV2ViewModel$updateHotRankingInstType$2
                @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56560yJx
                public Object get(Object obj2) {
                    return ((MarketHomeV2ViewModel.ActionBar) obj2).AEQbTJ();
                }

                @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56554yJr
                public void set(Object obj2, Object obj3) {
                    ((MarketHomeV2ViewModel.ActionBar) obj2).OLrzqt((MarketHomeV2ViewModel.Application) obj3);
                }
            };
            Application application = new Application(str, true);
            marketHomeV2ViewModel$updateHotRankingInstType$1.L$0 = str;
            marketHomeV2ViewModel$updateHotRankingInstType$1.label = 1;
            if (KWHzl(marketHomeV2ViewModel$updateHotRankingInstType$2, application, marketHomeV2ViewModel$updateHotRankingInstType$1) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (String) marketHomeV2ViewModel$updateHotRankingInstType$1.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        SPUtils.put("SP_KEY_HOT_RANKING_INST_TYPE", str, "marketHome");
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OLrzqt(@NotNull Continuation<? super String> continuation) throws Throwable {
        MarketHomeV2ViewModel$getHotRankingInstType$1 marketHomeV2ViewModel$getHotRankingInstType$1;
        MarketHomeV2ViewModel marketHomeV2ViewModel;
        String str;
        String strAEQbTJ;
        if (continuation instanceof MarketHomeV2ViewModel$getHotRankingInstType$1) {
            marketHomeV2ViewModel$getHotRankingInstType$1 = (MarketHomeV2ViewModel$getHotRankingInstType$1) continuation;
            int i = marketHomeV2ViewModel$getHotRankingInstType$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                marketHomeV2ViewModel$getHotRankingInstType$1.label = i - Integer.MIN_VALUE;
            } else {
                marketHomeV2ViewModel$getHotRankingInstType$1 = new MarketHomeV2ViewModel$getHotRankingInstType$1(this, continuation);
            }
        }
        Object objOLrzqt = marketHomeV2ViewModel$getHotRankingInstType$1.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = marketHomeV2ViewModel$getHotRankingInstType$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objOLrzqt);
            marketHomeV2ViewModel$getHotRankingInstType$1.L$0 = this;
            marketHomeV2ViewModel$getHotRankingInstType$1.label = 1;
            objOLrzqt = OLrzqt(this, marketHomeV2ViewModel$getHotRankingInstType$1);
            if (objOLrzqt == objCopydefault) {
                return objCopydefault;
            }
            marketHomeV2ViewModel = this;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str = (String) marketHomeV2ViewModel$getHotRankingInstType$1.L$0;
                C56391yDq.AEQbTJ(objOLrzqt);
                Intrinsics.checkNotNullExpressionValue(str, "");
                return str;
            }
            marketHomeV2ViewModel = (MarketHomeV2ViewModel) marketHomeV2ViewModel$getHotRankingInstType$1.L$0;
            C56391yDq.AEQbTJ(objOLrzqt);
        }
        Application applicationAEQbTJ = ((ActionBar) objOLrzqt).AEQbTJ();
        if (applicationAEQbTJ != null && (strAEQbTJ = applicationAEQbTJ.AEQbTJ()) != null) {
            return strAEQbTJ;
        }
        String string = SPUtils.getString("SP_KEY_HOT_RANKING_INST_TYPE", "SPOT", "marketHome");
        MarketHomeV2ViewModel$getHotRankingInstType$2$1 marketHomeV2ViewModel$getHotRankingInstType$2$1 = new MutablePropertyReference1Impl() { // from class: com.okinc.okmarket.viewmodel.MarketHomeV2ViewModel$getHotRankingInstType$2$1
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56560yJx
            public Object get(Object obj) {
                return ((MarketHomeV2ViewModel.ActionBar) obj).AEQbTJ();
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56554yJr
            public void set(Object obj, Object obj2) {
                ((MarketHomeV2ViewModel.ActionBar) obj).OLrzqt((MarketHomeV2ViewModel.Application) obj2);
            }
        };
        Application application = new Application(string, false);
        marketHomeV2ViewModel$getHotRankingInstType$1.L$0 = string;
        marketHomeV2ViewModel$getHotRankingInstType$1.label = 2;
        if (marketHomeV2ViewModel.KWHzl(marketHomeV2ViewModel$getHotRankingInstType$2$1, application, marketHomeV2ViewModel$getHotRankingInstType$1) == objCopydefault) {
            return objCopydefault;
        }
        str = string;
        Intrinsics.checkNotNullExpressionValue(str, "");
        return str;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object copydefault(String str, @NotNull Continuation<? super Unit> continuation) throws Throwable {
        MarketHomeV2ViewModel$updateUpRankingInstType$1 marketHomeV2ViewModel$updateUpRankingInstType$1;
        if (continuation instanceof MarketHomeV2ViewModel$updateUpRankingInstType$1) {
            marketHomeV2ViewModel$updateUpRankingInstType$1 = (MarketHomeV2ViewModel$updateUpRankingInstType$1) continuation;
            int i = marketHomeV2ViewModel$updateUpRankingInstType$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                marketHomeV2ViewModel$updateUpRankingInstType$1.label = i - Integer.MIN_VALUE;
            } else {
                marketHomeV2ViewModel$updateUpRankingInstType$1 = new MarketHomeV2ViewModel$updateUpRankingInstType$1(this, continuation);
            }
        }
        Object obj = marketHomeV2ViewModel$updateUpRankingInstType$1.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = marketHomeV2ViewModel$updateUpRankingInstType$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            MarketHomeV2ViewModel$updateUpRankingInstType$2 marketHomeV2ViewModel$updateUpRankingInstType$2 = new MutablePropertyReference1Impl() { // from class: com.okinc.okmarket.viewmodel.MarketHomeV2ViewModel$updateUpRankingInstType$2
                @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56560yJx
                public Object get(Object obj2) {
                    return ((MarketHomeV2ViewModel.ActionBar) obj2).copydefault();
                }

                @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56554yJr
                public void set(Object obj2, Object obj3) {
                    ((MarketHomeV2ViewModel.ActionBar) obj2).EZpvd((MarketHomeV2ViewModel.Application) obj3);
                }
            };
            Application application = new Application(str, true);
            marketHomeV2ViewModel$updateUpRankingInstType$1.L$0 = str;
            marketHomeV2ViewModel$updateUpRankingInstType$1.label = 1;
            if (KWHzl(marketHomeV2ViewModel$updateUpRankingInstType$2, application, marketHomeV2ViewModel$updateUpRankingInstType$1) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (String) marketHomeV2ViewModel$updateUpRankingInstType$1.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        SPUtils.put("SP_KEY_UP_RANKING_INST_TYPE", str, "marketHome");
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object KWHzl(@NotNull Continuation<? super String> continuation) throws Throwable {
        MarketHomeV2ViewModel$getUpRankingInstType$1 marketHomeV2ViewModel$getUpRankingInstType$1;
        MarketHomeV2ViewModel marketHomeV2ViewModel;
        String str;
        String strAEQbTJ;
        if (continuation instanceof MarketHomeV2ViewModel$getUpRankingInstType$1) {
            marketHomeV2ViewModel$getUpRankingInstType$1 = (MarketHomeV2ViewModel$getUpRankingInstType$1) continuation;
            int i = marketHomeV2ViewModel$getUpRankingInstType$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                marketHomeV2ViewModel$getUpRankingInstType$1.label = i - Integer.MIN_VALUE;
            } else {
                marketHomeV2ViewModel$getUpRankingInstType$1 = new MarketHomeV2ViewModel$getUpRankingInstType$1(this, continuation);
            }
        }
        Object objOLrzqt = marketHomeV2ViewModel$getUpRankingInstType$1.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = marketHomeV2ViewModel$getUpRankingInstType$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objOLrzqt);
            marketHomeV2ViewModel$getUpRankingInstType$1.L$0 = this;
            marketHomeV2ViewModel$getUpRankingInstType$1.label = 1;
            objOLrzqt = OLrzqt(this, marketHomeV2ViewModel$getUpRankingInstType$1);
            if (objOLrzqt == objCopydefault) {
                return objCopydefault;
            }
            marketHomeV2ViewModel = this;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str = (String) marketHomeV2ViewModel$getUpRankingInstType$1.L$0;
                C56391yDq.AEQbTJ(objOLrzqt);
                Intrinsics.checkNotNullExpressionValue(str, "");
                return str;
            }
            marketHomeV2ViewModel = (MarketHomeV2ViewModel) marketHomeV2ViewModel$getUpRankingInstType$1.L$0;
            C56391yDq.AEQbTJ(objOLrzqt);
        }
        Application applicationCopydefault = ((ActionBar) objOLrzqt).copydefault();
        if (applicationCopydefault != null && (strAEQbTJ = applicationCopydefault.AEQbTJ()) != null) {
            return strAEQbTJ;
        }
        String string = SPUtils.getString("SP_KEY_UP_RANKING_INST_TYPE", "SPOT", "marketHome");
        MarketHomeV2ViewModel$getUpRankingInstType$2$1 marketHomeV2ViewModel$getUpRankingInstType$2$1 = new MutablePropertyReference1Impl() { // from class: com.okinc.okmarket.viewmodel.MarketHomeV2ViewModel$getUpRankingInstType$2$1
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56560yJx
            public Object get(Object obj) {
                return ((MarketHomeV2ViewModel.ActionBar) obj).copydefault();
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56554yJr
            public void set(Object obj, Object obj2) {
                ((MarketHomeV2ViewModel.ActionBar) obj).EZpvd((MarketHomeV2ViewModel.Application) obj2);
            }
        };
        Application application = new Application(string, false);
        marketHomeV2ViewModel$getUpRankingInstType$1.L$0 = string;
        marketHomeV2ViewModel$getUpRankingInstType$1.label = 2;
        if (marketHomeV2ViewModel.KWHzl(marketHomeV2ViewModel$getUpRankingInstType$2$1, application, marketHomeV2ViewModel$getUpRankingInstType$1) == objCopydefault) {
            return objCopydefault;
        }
        str = string;
        Intrinsics.checkNotNullExpressionValue(str, "");
        return str;
    }

    public static final Unit KWHzl(MarketHomeV2ViewModel marketHomeV2ViewModel, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(marketHomeV2ViewModel), null, null, new MarketHomeV2ViewModel$getAllReminds$2$1(responseData, marketHomeV2ViewModel, null), 3, null);
        }
        return Unit.INSTANCE;
    }
}
