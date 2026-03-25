package o;

import com.okinc.business.defi.biz.constant.WalletMustSyncOperation;
import com.okinc.business.defi.biz.constant.WalletSyncOperation;
import com.okinc.business.defi.biz.constant.WalletSyncStatus;
import com.okinc.business.defi.biz.constant.WalletType;
import com.okinc.business.defi.biz.core.wallet.create.WalletSyncManager$addAsyncTasks$1;
import com.okinc.business.defi.biz.core.wallet.create.WalletSyncManager$addAsyncTasks$2$1;
import com.okinc.business.defi.biz.core.wallet.create.WalletSyncManager$addSyncTasks$1;
import com.okinc.business.defi.biz.core.wallet.create.WalletSyncManager$addTaskList$1$1;
import com.okinc.business.defi.biz.core.wallet.create.WalletSyncManager$batchSyncWalletListWithCountLimit$2;
import com.okinc.business.defi.biz.core.wallet.create.WalletSyncManager$createWalletsToServer$2;
import com.okinc.business.defi.biz.core.wallet.create.WalletSyncManager$refreshWallet$1;
import com.okinc.business.defi.biz.core.wallet.create.WalletSyncManager$requestEosInfo$2;
import com.okinc.business.defi.biz.core.wallet.create.WalletSyncManager$requestNearAccountsSuspend$1;
import com.okinc.business.defi.biz.core.wallet.create.WalletSyncManager$requestSegwitAddress$2;
import com.okinc.business.defi.biz.core.wallet.create.WalletSyncManager$requestWalletAssets$1;
import com.okinc.business.defi.biz.core.wallet.create.WalletSyncManager$requestWalletAssets$2;
import com.okinc.business.defi.biz.core.wallet.create.WalletSyncManager$syncOr$1;
import com.okinc.business.defi.biz.core.wallet.create.WalletSyncManager$syncWalletAddressList$2;
import com.okinc.business.defi.biz.core.wallet.create.WalletSyncManager$syncWalletList$2;
import com.okinc.business.defi.biz.core.wallet.create.WalletSyncManager$syncWalletNames$1;
import com.okinc.business.defi.biz.core.wallet.create.WalletSyncManager$syncWallets$1;
import com.okinc.business.defi.biz.core.wallet.create.WalletSyncManager$updateWalletToHasSync$1;
import com.okinc.business.defi.biz.core.wallet.update.WalletUpdateWorker;
import com.okinc.business.defi.biz.database.wallet.entity.ChainAddressEntity;
import com.okinc.business.defi.biz.database.wallet.entity.WalletEntity;
import com.okinc.business.defi.biz.model.ChainAddress;
import com.okinc.business.defi.biz.net.bean.AAActiveRes;
import com.okinc.business.defi.biz.net.bean.AAGenerateReq;
import com.okinc.business.defi.biz.net.bean.CreateWalletReqNew;
import com.okinc.business.defi.biz.net.bean.GetNearAccountIdReq;
import com.okinc.business.defi.biz.net.bean.GetNearAccountIdResp;
import com.okinc.business.defi.biz.net.bean.GetNearAccountIdRespBatch;
import com.okinc.business.defi.biz.net.bean.InternalChainAddressNew;
import com.okinc.business.defi.biz.net.bean.ResponseSingeResult;
import com.okinc.business.defi.biz.net.bean.SyncWalletReqNew;
import com.okinc.business.defi.biz.net.bean.TeeAndEip7702Item;
import com.okinc.core.util.SPUtils;
import com.okinc.network.okg.response.OKServerException;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.rx2.RxAwaitKt;
import kotlinx.coroutines.rx2.RxFlowableKt;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;
import o.AbstractC43419rot;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.cyk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C13062cyk {
    public static final Application Companion = new Application(null);
    public static final int copydefault = 8;
    public final CoroutineScope AEQbTJ;
    public final fVJ AYXKKw;
    public volatile boolean AhwBna;
    public final C13058cyg AkhnZx;
    public final InterfaceC56387yDm EZpvd;
    public final java.util.Set<java.lang.String> KWHzl;
    public final cOG OLrzqt;
    public final Mutex djBIcL;
    public final C13934dbu gEmmrt;
    public final cQM isConnected;
    public final InterfaceC56387yDm valueOf;

    /* JADX INFO: renamed from: o.cyk$Dialog */
    public final /* synthetic */ class Dialog {
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
            AEQbTJ = iArr;
        }
    }

    public C13062cyk(@NotNull cOG cog, @NotNull C13934dbu c13934dbu, @NotNull cQM cqm, @NotNull C13058cyg c13058cyg, @NotNull fVJ fvj) {
        Intrinsics.checkNotNullParameter(cog, "");
        Intrinsics.checkNotNullParameter(c13934dbu, "");
        Intrinsics.checkNotNullParameter(cqm, "");
        Intrinsics.checkNotNullParameter(c13058cyg, "");
        Intrinsics.checkNotNullParameter(fvj, "");
        this.OLrzqt = cog;
        this.gEmmrt = c13934dbu;
        this.isConnected = cqm;
        this.AkhnZx = c13058cyg;
        this.AYXKKw = fvj;
        this.AEQbTJ = CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default((Job) null, 1, (java.lang.Object) null).plus(Dispatchers.getDefault()));
        this.EZpvd = C56392yDr.copydefault(new Function0() { // from class: o.cyh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C13062cyk.KWHzl();
            }
        });
        this.valueOf = C56392yDr.copydefault(new Function0() { // from class: o.cyl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C13062cyk.values(this.OLrzqt);
            }
        });
        this.djBIcL = MutexKt.Mutex$default(false, 1, null);
        this.KWHzl = Collections.synchronizedSet(new java.util.HashSet());
    }

    /* JADX INFO: renamed from: o.cyk$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.cyk.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public static /* synthetic */ C13062cyk getInstance$default(Application application, android.content.Context context, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                context = C9678baC.Companion.AEQbTJ();
            }
            return application.copydefault(context);
        }

        public final C13062cyk copydefault(@NotNull android.content.Context context) {
            Intrinsics.checkNotNullParameter(context, "");
            return C13458dMb.EZpvd(context).QbewEr();
        }

        public final boolean AEQbTJ(@NotNull WalletEntity walletEntity, @NotNull WalletMustSyncOperation walletMustSyncOperation) {
            Intrinsics.checkNotNullParameter(walletEntity, "");
            Intrinsics.checkNotNullParameter(walletMustSyncOperation, "");
            return StringsKt__StringsKt.split$default((java.lang.CharSequence) walletEntity.getCompletedSyncOperation(), new java.lang.String[]{","}, false, 0, 6, (java.lang.Object) null).contains(java.lang.String.valueOf(walletMustSyncOperation.getValue()));
        }

        public final boolean EZpvd(@NotNull WalletEntity walletEntity, @NotNull WalletSyncOperation walletSyncOperation) {
            java.util.List listSplit$default;
            Intrinsics.checkNotNullParameter(walletEntity, "");
            Intrinsics.checkNotNullParameter(walletSyncOperation, "");
            java.lang.String syncOperation = walletEntity.getSyncOperation();
            if (syncOperation == null || (listSplit$default = StringsKt__StringsKt.split$default((java.lang.CharSequence) syncOperation, new java.lang.String[]{","}, false, 0, 6, (java.lang.Object) null)) == null) {
                return false;
            }
            return listSplit$default.contains(java.lang.String.valueOf(walletSyncOperation.getValue()));
        }
    }

    public static final android.os.Handler KWHzl() {
        return new android.os.Handler(android.os.Looper.getMainLooper());
    }

    public final android.os.Handler EZpvd() {
        return (android.os.Handler) this.EZpvd.getValue();
    }

    /* JADX INFO: renamed from: o.cyk$LoaderManager */
    public static abstract class LoaderManager {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.cyk.LoaderManager.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ LoaderManager(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: o.cyk$LoaderManager$TaskDescription */
        public static final class TaskDescription extends LoaderManager {
            public static final TaskDescription OLrzqt = new TaskDescription();

            private TaskDescription() {
                super(null);
            }
        }

        private LoaderManager() {
        }

        /* JADX INFO: renamed from: o.cyk$LoaderManager$Application */
        public static final class Application extends LoaderManager {
            public final java.util.List<java.lang.String> OLrzqt;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.cyk$LoaderManager$Application */
            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ Application copy$default(Application application, java.util.List list, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    list = application.OLrzqt;
                }
                return application.KWHzl(list);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Application KWHzl(@NotNull java.util.List<java.lang.String> list) {
                Intrinsics.checkNotNullParameter(list, "");
                return new Application(list);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final java.util.List<java.lang.String> OLrzqt() {
                return this.OLrzqt;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(java.lang.Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Application) && Intrinsics.EZpvd(this.OLrzqt, ((Application) obj).OLrzqt);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return this.OLrzqt.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public java.lang.String toString() {
                return "SelectedWallets(walletIdList=" + this.OLrzqt + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Application(@NotNull java.util.List<java.lang.String> list) {
                super(null);
                Intrinsics.checkNotNullParameter(list, "");
                this.OLrzqt = list;
            }
        }

        /* JADX INFO: renamed from: o.cyk$LoaderManager$Activity */
        public static final class Activity extends LoaderManager {
            public static final Activity AEQbTJ = new Activity();

            private Activity() {
                super(null);
            }
        }

        /* JADX INFO: renamed from: o.cyk$LoaderManager$StateListAnimator */
        public static final class StateListAnimator extends LoaderManager {
            public static final StateListAnimator EZpvd = new StateListAnimator();

            private StateListAnimator() {
                super(null);
            }
        }
    }

    public static /* synthetic */ AbstractC58185ywX sync$default(C13062cyk c13062cyk, boolean z, boolean z2, java.lang.String str, LoaderManager loaderManager, int i, java.lang.Object obj) {
        if ((i & 8) != 0) {
            loaderManager = LoaderManager.TaskDescription.OLrzqt;
        }
        return c13062cyk.OLrzqt(z, z2, str, loaderManager);
    }

    public final AbstractC58185ywX<java.lang.Integer> OLrzqt(boolean z, boolean z2, @NotNull java.lang.String str, @NotNull LoaderManager loaderManager) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(loaderManager, "");
        C10856bwO.copydefault("WalletSyncManager", 0, "sync  forceSync=" + z + "  isDelay=" + z2 + "  from=" + str + "  isAlreadySync=" + this.AhwBna);
        return AEQbTJ(z, z2, str, loaderManager);
    }

    public final <T> StateListAnimator<T> EZpvd(AbstractC43419rot<?, OKServerException> abstractC43419rot, T t) {
        AbstractC43419rot.ActionBar actionBar = abstractC43419rot instanceof AbstractC43419rot.ActionBar ? (AbstractC43419rot.ActionBar) abstractC43419rot : null;
        if (actionBar != null) {
            return new StateListAnimator<>(t, ((OKServerException) actionBar.KWHzl()).getCode(), ((OKServerException) actionBar.KWHzl()).getMessage());
        }
        return new StateListAnimator<>(t, -1, "");
    }

    public static /* synthetic */ AbstractC58185ywX syncOr$default(C13062cyk c13062cyk, boolean z, boolean z2, java.lang.String str, LoaderManager loaderManager, int i, java.lang.Object obj) {
        if ((i & 8) != 0) {
            loaderManager = LoaderManager.TaskDescription.OLrzqt;
        }
        return c13062cyk.AEQbTJ(z, z2, str, loaderManager);
    }

    /* JADX DEBUG: Class process forced to load method for inline: kotlinx.coroutines.rx2.RxFlowableKt.rxFlowable$default(kotlin.coroutines.CoroutineContext, kotlin.jvm.functions.Function2, int, java.lang.Object):o.ywX */
    public final AbstractC58185ywX<java.lang.Integer> AEQbTJ(boolean z, boolean z2, @NotNull java.lang.String str, @NotNull LoaderManager loaderManager) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(loaderManager, "");
        return RxFlowableKt.rxFlowable$default(null, new WalletSyncManager$syncOr$1(z, this, java.lang.System.currentTimeMillis(), loaderManager, z2, str, null), 1, null);
    }

    public final C12977cxE<ActionBar<java.lang.String>> copydefault() {
        return (C12977cxE) this.valueOf.getValue();
    }

    public static final C12977cxE values(C13062cyk c13062cyk) {
        return new C12977cxE(c13062cyk.AEQbTJ);
    }

    public final java.util.List<C12979cxG<ActionBar<java.lang.String>>> KWHzl(CoroutineScope coroutineScope, java.util.List<WalletEntity> list, boolean z, java.lang.String str, LoaderManager loaderManager) {
        if (list.isEmpty()) {
            return yDY.AhwBna();
        }
        int size = list.size() / 10;
        int i = list.size() % 10 == 0 ? 0 : 1;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i2 = 0; i2 < size + i; i2++) {
            int i3 = i2 * 10;
            arrayList.add(AEQbTJ(coroutineScope, list.subList(i3, C56548yJl.valueOf(i3 + 10, list.size())), z, str, loaderManager));
        }
        return arrayList;
    }

    public static final Deferred KWHzl(CoroutineScope coroutineScope, C13062cyk c13062cyk, java.util.List list, boolean z, java.lang.String str, LoaderManager loaderManager) {
        return BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new WalletSyncManager$addTaskList$1$1(c13062cyk, list, z, str, loaderManager, null), 3, null);
    }

    public final C12979cxG<ActionBar<java.lang.String>> AEQbTJ(final CoroutineScope coroutineScope, final java.util.List<WalletEntity> list, final boolean z, final java.lang.String str, final LoaderManager loaderManager) {
        return copydefault().AEQbTJ(list, new Function0() { // from class: o.cyq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C13062cyk.KWHzl(coroutineScope, this, list, z, str, loaderManager);
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object KWHzl(CoroutineScope coroutineScope, java.util.List<WalletEntity> list, boolean z, java.lang.String str, LoaderManager loaderManager, Continuation<? super Unit> continuation) throws java.lang.Throwable {
        WalletSyncManager$addAsyncTasks$1 walletSyncManager$addAsyncTasks$1;
        Mutex mutex;
        java.util.List<WalletEntity> list2;
        java.lang.String str2;
        boolean z2;
        C13062cyk c13062cyk;
        LoaderManager loaderManager2;
        CoroutineScope coroutineScope2;
        if (continuation instanceof WalletSyncManager$addAsyncTasks$1) {
            walletSyncManager$addAsyncTasks$1 = (WalletSyncManager$addAsyncTasks$1) continuation;
            int i = walletSyncManager$addAsyncTasks$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                walletSyncManager$addAsyncTasks$1.label = i - Integer.MIN_VALUE;
            } else {
                walletSyncManager$addAsyncTasks$1 = new WalletSyncManager$addAsyncTasks$1(this, continuation);
            }
        }
        java.lang.Object obj = walletSyncManager$addAsyncTasks$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = walletSyncManager$addAsyncTasks$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            mutex = this.djBIcL;
            walletSyncManager$addAsyncTasks$1.L$0 = this;
            walletSyncManager$addAsyncTasks$1.L$1 = coroutineScope;
            list2 = list;
            walletSyncManager$addAsyncTasks$1.L$2 = list2;
            str2 = str;
            walletSyncManager$addAsyncTasks$1.L$3 = str2;
            walletSyncManager$addAsyncTasks$1.L$4 = loaderManager;
            walletSyncManager$addAsyncTasks$1.L$5 = mutex;
            z2 = z;
            walletSyncManager$addAsyncTasks$1.Z$0 = z2;
            walletSyncManager$addAsyncTasks$1.label = 1;
            if (mutex.lock(null, walletSyncManager$addAsyncTasks$1) == objCopydefault) {
                return objCopydefault;
            }
            c13062cyk = this;
            loaderManager2 = loaderManager;
            coroutineScope2 = coroutineScope;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            boolean z3 = walletSyncManager$addAsyncTasks$1.Z$0;
            mutex = (Mutex) walletSyncManager$addAsyncTasks$1.L$5;
            loaderManager2 = (LoaderManager) walletSyncManager$addAsyncTasks$1.L$4;
            java.lang.String str3 = (java.lang.String) walletSyncManager$addAsyncTasks$1.L$3;
            java.util.List<WalletEntity> list3 = (java.util.List) walletSyncManager$addAsyncTasks$1.L$2;
            coroutineScope2 = (CoroutineScope) walletSyncManager$addAsyncTasks$1.L$1;
            c13062cyk = (C13062cyk) walletSyncManager$addAsyncTasks$1.L$0;
            C56391yDq.AEQbTJ(obj);
            z2 = z3;
            str2 = str3;
            list2 = list3;
        }
        try {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj2 : list2) {
                if (c13062cyk.copydefault().KWHzl((WalletEntity) obj2) == null) {
                    arrayList.add(obj2);
                }
            }
            BuildersKt__Builders_commonKt.async$default(coroutineScope2, Dispatchers.getIO(), null, new WalletSyncManager$addAsyncTasks$2$1(c13062cyk, c13062cyk.KWHzl(coroutineScope2, arrayList, z2, str2, loaderManager2), null), 2, null);
            mutex.unlock(null);
            return Unit.INSTANCE;
        } catch (java.lang.Throwable th) {
            mutex.unlock(null);
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object EZpvd(CoroutineScope coroutineScope, java.util.List<WalletEntity> list, boolean z, java.lang.String str, LoaderManager loaderManager, Continuation<? super java.util.List<C12979cxG<ActionBar<java.lang.String>>>> continuation) throws java.lang.Throwable {
        WalletSyncManager$addSyncTasks$1 walletSyncManager$addSyncTasks$1;
        Mutex mutex;
        java.util.List<WalletEntity> list2;
        java.lang.String str2;
        boolean z2;
        C13062cyk c13062cyk;
        LoaderManager loaderManager2;
        CoroutineScope coroutineScope2;
        if (continuation instanceof WalletSyncManager$addSyncTasks$1) {
            walletSyncManager$addSyncTasks$1 = (WalletSyncManager$addSyncTasks$1) continuation;
            int i = walletSyncManager$addSyncTasks$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                walletSyncManager$addSyncTasks$1.label = i - Integer.MIN_VALUE;
            } else {
                walletSyncManager$addSyncTasks$1 = new WalletSyncManager$addSyncTasks$1(this, continuation);
            }
        }
        java.lang.Object obj = walletSyncManager$addSyncTasks$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = walletSyncManager$addSyncTasks$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            mutex = this.djBIcL;
            walletSyncManager$addSyncTasks$1.L$0 = this;
            walletSyncManager$addSyncTasks$1.L$1 = coroutineScope;
            list2 = list;
            walletSyncManager$addSyncTasks$1.L$2 = list2;
            str2 = str;
            walletSyncManager$addSyncTasks$1.L$3 = str2;
            walletSyncManager$addSyncTasks$1.L$4 = loaderManager;
            walletSyncManager$addSyncTasks$1.L$5 = mutex;
            z2 = z;
            walletSyncManager$addSyncTasks$1.Z$0 = z2;
            walletSyncManager$addSyncTasks$1.label = 1;
            if (mutex.lock(null, walletSyncManager$addSyncTasks$1) == objCopydefault) {
                return objCopydefault;
            }
            c13062cyk = this;
            loaderManager2 = loaderManager;
            coroutineScope2 = coroutineScope;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            boolean z3 = walletSyncManager$addSyncTasks$1.Z$0;
            mutex = (Mutex) walletSyncManager$addSyncTasks$1.L$5;
            loaderManager2 = (LoaderManager) walletSyncManager$addSyncTasks$1.L$4;
            java.lang.String str3 = (java.lang.String) walletSyncManager$addSyncTasks$1.L$3;
            java.util.List<WalletEntity> list3 = (java.util.List) walletSyncManager$addSyncTasks$1.L$2;
            coroutineScope2 = (CoroutineScope) walletSyncManager$addSyncTasks$1.L$1;
            c13062cyk = (C13062cyk) walletSyncManager$addSyncTasks$1.L$0;
            C56391yDq.AEQbTJ(obj);
            z2 = z3;
            str2 = str3;
            list2 = list3;
        }
        try {
            java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list2, 10));
            java.util.Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(c13062cyk.copydefault().KWHzl((WalletEntity) it.next()));
            }
            java.util.List listQbewEr = CollectionsKt___CollectionsKt.QbewEr(CollectionsKt___CollectionsKt.QfsBiF(arrayList));
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            for (java.lang.Object obj2 : list2) {
                if (c13062cyk.copydefault().KWHzl((WalletEntity) obj2) == null) {
                    arrayList2.add(obj2);
                }
            }
            java.util.List listFJNWhG = CollectionsKt___CollectionsKt.fJNWhG((java.util.Collection) c13062cyk.KWHzl(coroutineScope2, arrayList2, z2, str2, loaderManager2));
            listFJNWhG.addAll(listQbewEr);
            return listFJNWhG;
        } finally {
            mutex.unlock(null);
        }
    }

    /* JADX INFO: renamed from: o.cyk$ActionBar */
    public static final class ActionBar<T> {
        public final java.lang.String EZpvd;
        public final java.util.List<T> KWHzl;
        public final java.util.List<T> OLrzqt;
        public final int copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.cyk$ActionBar */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ActionBar copy$default(ActionBar actionBar, java.util.List list, java.util.List list2, int i, java.lang.String str, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                list = actionBar.OLrzqt;
            }
            if ((i2 & 2) != 0) {
                list2 = actionBar.KWHzl;
            }
            if ((i2 & 4) != 0) {
                i = actionBar.copydefault;
            }
            if ((i2 & 8) != 0) {
                str = actionBar.EZpvd;
            }
            return actionBar.EZpvd(list, list2, i, str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<T> EZpvd() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ActionBar<T> EZpvd(@NotNull java.util.List<? extends T> list, @NotNull java.util.List<? extends T> list2, int i, java.lang.String str) {
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(list2, "");
            return new ActionBar<>(list, list2, i, str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<T> KWHzl() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ActionBar)) {
                return false;
            }
            ActionBar actionBar = (ActionBar) obj;
            return Intrinsics.EZpvd(this.OLrzqt, actionBar.OLrzqt) && Intrinsics.EZpvd(this.KWHzl, actionBar.KWHzl) && this.copydefault == actionBar.copydefault && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) actionBar.EZpvd);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = this.OLrzqt.hashCode();
            int iHashCode2 = this.KWHzl.hashCode();
            int iHashCode3 = java.lang.Integer.hashCode(this.copydefault);
            java.lang.String str = this.EZpvd;
            return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (str == null ? 0 : str.hashCode());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "SyncResult(success=" + this.OLrzqt + ", fail=" + this.KWHzl + ", code=" + this.copydefault + ", msg=" + this.EZpvd + ")";
        }

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.List<? extends T> */
        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.util.List<? extends T> */
        /* JADX WARN: Multi-variable type inference failed */
        public ActionBar(@NotNull java.util.List<? extends T> list, @NotNull java.util.List<? extends T> list2, int i, java.lang.String str) {
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(list2, "");
            this.OLrzqt = list;
            this.KWHzl = list2;
            this.copydefault = i;
            this.EZpvd = str;
        }
    }

    public static /* synthetic */ java.lang.Object batchSyncWalletListWithCountLimit$default(C13062cyk c13062cyk, java.util.List list, boolean z, LoaderManager loaderManager, Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return c13062cyk.KWHzl((java.util.List<java.lang.String>) list, z, loaderManager, (Continuation<? super ActionBar<java.lang.String>>) continuation);
    }

    public final java.lang.Object KWHzl(@NotNull java.util.List<java.lang.String> list, boolean z, @NotNull LoaderManager loaderManager, @NotNull Continuation<? super ActionBar<java.lang.String>> continuation) {
        return CoroutineScopeKt.coroutineScope(new WalletSyncManager$batchSyncWalletListWithCountLimit$2(list, this, z, loaderManager, null), continuation);
    }

    public final boolean AEQbTJ(StateListAnimator<?> stateListAnimator) {
        return stateListAnimator.copydefault() == 0;
    }

    public final ActionBar<java.lang.String> OLrzqt(StateListAnimator<?> stateListAnimator) {
        return new ActionBar<>(yDY.AhwBna(), yDY.AhwBna(), stateListAnimator.copydefault(), stateListAnimator.EZpvd());
    }

    public final java.lang.Object EZpvd(java.util.List<WalletEntity> list, boolean z, java.lang.String str, LoaderManager loaderManager, Continuation<? super ActionBar<java.lang.String>> continuation) {
        return CoroutineScopeKt.coroutineScope(new WalletSyncManager$syncWalletList$2(this, list, z, str, loaderManager, null), continuation);
    }

    public final java.lang.Object OLrzqt(java.util.List<WalletEntity> list, final java.util.Map<java.lang.String, ? extends java.util.List<ChainAddress>> map, Continuation<? super Unit> continuation) {
        java.lang.Object objKWHzl = this.AYXKKw.KWHzl(C59467zhb.zuBGHE(C59467zhb.wlaJM(C59467zhb.fetchVPNInfo(C59467zhb.DbNXlk(CollectionsKt___CollectionsKt.QVAiDq(list), new Function1() { // from class: o.cyn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Boolean.valueOf(C13062cyk.EZpvd((WalletEntity) obj));
            }
        }), new Function1() { // from class: o.cyp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C13062cyk.EZpvd(map, (WalletEntity) obj);
            }
        }))), continuation);
        return objKWHzl == C56442yFn.copydefault() ? objKWHzl : Unit.INSTANCE;
    }

    public static final boolean EZpvd(WalletEntity walletEntity) {
        Intrinsics.checkNotNullParameter(walletEntity, "");
        return C11600cUg.KWHzl(walletEntity.getBackup()) || C11600cUg.KWHzl(walletEntity.getCloudBackup()) || C11600cUg.KWHzl(walletEntity.getIHuaweiBackup());
    }

    public static final TeeAndEip7702Item EZpvd(java.util.Map map, WalletEntity walletEntity) {
        java.util.List list;
        Intrinsics.checkNotNullParameter(walletEntity, "");
        int i = Dialog.AEQbTJ[WalletType.Companion.KWHzl(walletEntity.getType()).ordinal()];
        if (i == 1) {
            java.lang.String id = walletEntity.getId();
            C17927fXl c17927fXl = C17927fXl.KWHzl;
            java.util.List<ChainAddress> listAhwBna = (java.util.List) map.get(walletEntity.getId());
            if (listAhwBna == null) {
                listAhwBna = yDY.AhwBna();
            }
            return new TeeAndEip7702Item(id, c17927fXl.AEQbTJ(listAhwBna));
        }
        if (i == 2 && (list = (java.util.List) map.get(walletEntity.getId())) != null && !list.isEmpty()) {
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                C10854bwM c10854bwMKWHzl = C10954byG.EZpvd.valueOf().KWHzl(((ChainAddress) it.next()).getCoinId());
                if (c10854bwMKWHzl != null && c10854bwMKWHzl.ejfBZ()) {
                    return new TeeAndEip7702Item(walletEntity.getId(), "");
                }
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object AYXKKw(java.util.List<WalletEntity> list, Continuation<? super Unit> continuation) throws java.lang.Throwable {
        WalletSyncManager$updateWalletToHasSync$1 walletSyncManager$updateWalletToHasSync$1;
        C13062cyk c13062cyk;
        if (continuation instanceof WalletSyncManager$updateWalletToHasSync$1) {
            walletSyncManager$updateWalletToHasSync$1 = (WalletSyncManager$updateWalletToHasSync$1) continuation;
            int i = walletSyncManager$updateWalletToHasSync$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                walletSyncManager$updateWalletToHasSync$1.label = i - Integer.MIN_VALUE;
            } else {
                walletSyncManager$updateWalletToHasSync$1 = new WalletSyncManager$updateWalletToHasSync$1(this, continuation);
            }
        }
        java.lang.Object objKWHzl = walletSyncManager$updateWalletToHasSync$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = walletSyncManager$updateWalletToHasSync$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objKWHzl);
            C13058cyg c13058cyg = this.AkhnZx;
            java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
            java.util.Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((WalletEntity) it.next()).getId());
            }
            walletSyncManager$updateWalletToHasSync$1.L$0 = this;
            walletSyncManager$updateWalletToHasSync$1.L$1 = list;
            walletSyncManager$updateWalletToHasSync$1.label = 1;
            objKWHzl = c13058cyg.KWHzl(arrayList, walletSyncManager$updateWalletToHasSync$1);
            if (objKWHzl == objCopydefault) {
                return objCopydefault;
            }
            c13062cyk = this;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objKWHzl);
                return Unit.INSTANCE;
            }
            list = (java.util.List) walletSyncManager$updateWalletToHasSync$1.L$1;
            c13062cyk = (C13062cyk) walletSyncManager$updateWalletToHasSync$1.L$0;
            C56391yDq.AEQbTJ(objKWHzl);
        }
        java.util.List list2 = (java.util.List) objKWHzl;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.Iterator<T> it2 = list.iterator();
        while (true) {
            java.lang.Object obj = null;
            if (!it2.hasNext()) {
                break;
            }
            java.lang.Object next = it2.next();
            WalletEntity walletEntity = (WalletEntity) next;
            java.util.Iterator it3 = list2.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    break;
                }
                java.lang.Object next2 = it3.next();
                if (Intrinsics.EZpvd((java.lang.Object) ((C11288cIr) next2).AEQbTJ(), (java.lang.Object) walletEntity.getId())) {
                    obj = next2;
                    break;
                }
            }
            C11288cIr c11288cIr = (C11288cIr) obj;
            if (walletEntity.getSyncStatus() == WalletSyncStatus.HasCreate.getValue() && (C11600cUg.KWHzl(walletEntity.getFromCreate()) || Companion.AEQbTJ(walletEntity, WalletMustSyncOperation.HasRequestAsset))) {
                if (c11288cIr == null || (c11288cIr.EZpvd().isEmpty() && c11288cIr.KWHzl().isEmpty())) {
                    if (!Companion.EZpvd(walletEntity, WalletSyncOperation.UpgradeAddress)) {
                        arrayList2.add(next);
                    }
                }
            }
        }
        java.util.Iterator it4 = arrayList2.iterator();
        while (it4.hasNext()) {
            ((WalletEntity) it4.next()).setSyncStatus(WalletSyncStatus.HasSync.getValue());
        }
        walletSyncManager$updateWalletToHasSync$1.L$0 = null;
        walletSyncManager$updateWalletToHasSync$1.L$1 = null;
        walletSyncManager$updateWalletToHasSync$1.label = 2;
        if (c13062cyk.AEQbTJ(arrayList2, walletSyncManager$updateWalletToHasSync$1) == objCopydefault) {
            return objCopydefault;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object KWHzl(java.util.List<WalletEntity> list, Continuation<? super java.util.List<WalletEntity>> continuation) throws java.lang.Throwable {
        WalletSyncManager$refreshWallet$1 walletSyncManager$refreshWallet$1;
        if (continuation instanceof WalletSyncManager$refreshWallet$1) {
            walletSyncManager$refreshWallet$1 = (WalletSyncManager$refreshWallet$1) continuation;
            int i = walletSyncManager$refreshWallet$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                walletSyncManager$refreshWallet$1.label = i - Integer.MIN_VALUE;
            } else {
                walletSyncManager$refreshWallet$1 = new WalletSyncManager$refreshWallet$1(this, continuation);
            }
        }
        java.lang.Object objAwait = walletSyncManager$refreshWallet$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = walletSyncManager$refreshWallet$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objAwait);
            java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
            java.util.Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((WalletEntity) it.next()).getId());
            }
            AbstractC58260yxt<java.util.List<WalletEntity>> abstractC58260yxtCopydefault = this.isConnected.copydefault(arrayList);
            walletSyncManager$refreshWallet$1.label = 1;
            objAwait = RxAwaitKt.await(abstractC58260yxtCopydefault, walletSyncManager$refreshWallet$1);
            if (objAwait == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objAwait);
        }
        Intrinsics.checkNotNullExpressionValue(objAwait, "");
        return objAwait;
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x021a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0234 A[LOOP:2: B:77:0x022e->B:79:0x0234, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0256 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x02af  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object KWHzl(java.util.List<WalletEntity> list, boolean z, boolean z2, java.lang.String str, LoaderManager loaderManager, Continuation<? super StateListAnimator<kotlin.Pair<java.util.List<WalletEntity>, java.util.Map<java.lang.String, java.util.List<ChainAddress>>>>> continuation) throws java.lang.Throwable {
        WalletSyncManager$syncWallets$1 walletSyncManager$syncWallets$1;
        C13062cyk c13062cyk;
        java.util.List<WalletEntity> list2;
        StateListAnimator stateListAnimator;
        java.util.List list3;
        java.util.List<WalletEntity> list4;
        C13062cyk c13062cyk2;
        java.util.List list5;
        StateListAnimator stateListAnimator2;
        java.util.List<WalletEntity> list6;
        C13062cyk c13062cyk3;
        java.util.Iterator it;
        if (continuation instanceof WalletSyncManager$syncWallets$1) {
            walletSyncManager$syncWallets$1 = (WalletSyncManager$syncWallets$1) continuation;
            int i = walletSyncManager$syncWallets$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                walletSyncManager$syncWallets$1.label = i - Integer.MIN_VALUE;
            } else {
                walletSyncManager$syncWallets$1 = new WalletSyncManager$syncWallets$1(this, continuation);
            }
        }
        WalletSyncManager$syncWallets$1 walletSyncManager$syncWallets$12 = walletSyncManager$syncWallets$1;
        java.lang.Object objCopydefault = walletSyncManager$syncWallets$12.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = walletSyncManager$syncWallets$12.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objCopydefault);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : list) {
                WalletEntity walletEntity = (WalletEntity) obj;
                if (walletEntity.getSyncStatus() >= WalletSyncStatus.HasCreate.getValue()) {
                    if (C11600cUg.KWHzl(walletEntity.getFromCreate())) {
                        Application application = Companion;
                        if (application.EZpvd(walletEntity, WalletSyncOperation.UpdateDefaultAddress) || application.EZpvd(walletEntity, WalletSyncOperation.UpgradeAddress) || walletEntity.getSyncStatus() < WalletSyncStatus.HasSync.getValue()) {
                        }
                    }
                    arrayList.add(obj);
                }
            }
            if (arrayList.isEmpty()) {
                return new StateListAnimator(C56390yDp.OLrzqt(list, C56424yEw.KWHzl()), 0, null, 6, null);
            }
            java.util.List<WalletEntity> listGEmmrt = CollectionsKt___CollectionsKt.gEmmrt((java.lang.Iterable) list, (java.lang.Iterable) CollectionsKt___CollectionsKt.OqFWZa(arrayList));
            walletSyncManager$syncWallets$12.L$0 = this;
            walletSyncManager$syncWallets$12.L$1 = listGEmmrt;
            walletSyncManager$syncWallets$12.label = 1;
            objCopydefault = copydefault(arrayList, z, z2, str, loaderManager, walletSyncManager$syncWallets$12);
            if (objCopydefault == objCopydefault2) {
                return objCopydefault2;
            }
            c13062cyk = this;
            list2 = listGEmmrt;
        } else if (i2 == 1) {
            java.util.List<WalletEntity> list7 = (java.util.List) walletSyncManager$syncWallets$12.L$1;
            c13062cyk = (C13062cyk) walletSyncManager$syncWallets$12.L$0;
            C56391yDq.AEQbTJ(objCopydefault);
            list2 = list7;
        } else if (i2 == 2) {
            list4 = (java.util.List) walletSyncManager$syncWallets$12.L$4;
            list3 = (java.util.List) walletSyncManager$syncWallets$12.L$3;
            stateListAnimator = (StateListAnimator) walletSyncManager$syncWallets$12.L$2;
            list2 = (java.util.List) walletSyncManager$syncWallets$12.L$1;
            c13062cyk2 = (C13062cyk) walletSyncManager$syncWallets$12.L$0;
            C56391yDq.AEQbTJ(objCopydefault);
            java.util.List<C11288cIr> list8 = (java.util.List) objCopydefault;
            java.util.ArrayList<kotlin.Pair> arrayList2 = new java.util.ArrayList();
            for (java.lang.Object obj2 : list3) {
                if (((WalletEntity) ((kotlin.Pair) obj2).getFirst()).getSyncStatus() >= WalletSyncStatus.HasCreate.getValue()) {
                    arrayList2.add(obj2);
                }
            }
            for (kotlin.Pair pair : arrayList2) {
                WalletEntity walletEntity2 = (WalletEntity) pair.getFirst();
                walletEntity2.setSyncStatus(WalletSyncStatus.HasSync.getValue());
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                Application application2 = Companion;
                WalletSyncOperation walletSyncOperation = WalletSyncOperation.UpdateDefaultAddress;
                if (application2.EZpvd(walletEntity2, walletSyncOperation)) {
                    arrayList3.add(walletSyncOperation);
                }
                WalletSyncOperation walletSyncOperation2 = WalletSyncOperation.UpgradeAddress;
                if (application2.EZpvd(walletEntity2, walletSyncOperation2) && c13062cyk2.OLrzqt(list8, (SyncWalletReqNew) pair.getSecond())) {
                    arrayList3.add(walletSyncOperation2);
                }
                if (!arrayList3.isEmpty()) {
                    c13062cyk2.KWHzl(walletEntity2, arrayList3);
                }
                list4.add(walletEntity2);
            }
            walletSyncManager$syncWallets$12.L$0 = c13062cyk2;
            walletSyncManager$syncWallets$12.L$1 = list2;
            walletSyncManager$syncWallets$12.L$2 = stateListAnimator;
            walletSyncManager$syncWallets$12.L$3 = list3;
            walletSyncManager$syncWallets$12.L$4 = null;
            walletSyncManager$syncWallets$12.label = 3;
            if (c13062cyk2.AEQbTJ(list4, walletSyncManager$syncWallets$12) != objCopydefault2) {
                return objCopydefault2;
            }
            list5 = list3;
            stateListAnimator2 = stateListAnimator;
            list6 = list2;
            c13062cyk3 = c13062cyk2;
            java.util.ArrayList arrayList4 = new java.util.ArrayList(C56403yEb.AYXKKw(list5, 10));
            it = list5.iterator();
            while (it.hasNext()) {
            }
            walletSyncManager$syncWallets$12.L$0 = list6;
            walletSyncManager$syncWallets$12.L$1 = stateListAnimator2;
            walletSyncManager$syncWallets$12.L$2 = list5;
            walletSyncManager$syncWallets$12.L$3 = null;
            walletSyncManager$syncWallets$12.label = 4;
            objCopydefault = c13062cyk3.AEQbTJ(list6, arrayList4, walletSyncManager$syncWallets$12);
            if (objCopydefault == objCopydefault2) {
            }
            if (((java.lang.Number) objCopydefault).intValue() > 0) {
            }
        } else {
            if (i2 != 3) {
                if (i2 != 4) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                list5 = (java.util.List) walletSyncManager$syncWallets$12.L$2;
                stateListAnimator2 = (StateListAnimator) walletSyncManager$syncWallets$12.L$1;
                list6 = (java.util.List) walletSyncManager$syncWallets$12.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                if (((java.lang.Number) objCopydefault).intValue() > 0) {
                    java.util.ArrayList arrayList5 = new java.util.ArrayList(C56403yEb.AYXKKw(list5, 10));
                    java.util.Iterator it2 = list5.iterator();
                    while (it2.hasNext()) {
                        arrayList5.add((WalletEntity) ((kotlin.Pair) it2.next()).getFirst());
                    }
                    java.util.List listFJNWhG = CollectionsKt___CollectionsKt.fJNWhG((java.util.Collection) arrayList5);
                    listFJNWhG.addAll(list6);
                    return new StateListAnimator(C56390yDp.OLrzqt(listFJNWhG, ((kotlin.Pair) stateListAnimator2.OLrzqt()).getSecond()), 0, null, 6, null);
                }
                java.util.ArrayList arrayList6 = new java.util.ArrayList(C56403yEb.AYXKKw(list5, 10));
                java.util.Iterator it3 = list5.iterator();
                while (it3.hasNext()) {
                    arrayList6.add((WalletEntity) ((kotlin.Pair) it3.next()).getFirst());
                }
                return new StateListAnimator(C56390yDp.OLrzqt(arrayList6, ((kotlin.Pair) stateListAnimator2.OLrzqt()).getSecond()), 0, null, 6, null);
            }
            list5 = (java.util.List) walletSyncManager$syncWallets$12.L$3;
            stateListAnimator2 = (StateListAnimator) walletSyncManager$syncWallets$12.L$2;
            list6 = (java.util.List) walletSyncManager$syncWallets$12.L$1;
            c13062cyk3 = (C13062cyk) walletSyncManager$syncWallets$12.L$0;
            C56391yDq.AEQbTJ(objCopydefault);
            java.util.ArrayList arrayList42 = new java.util.ArrayList(C56403yEb.AYXKKw(list5, 10));
            it = list5.iterator();
            while (it.hasNext()) {
                arrayList42.add((SyncWalletReqNew) ((kotlin.Pair) it.next()).getSecond());
            }
            walletSyncManager$syncWallets$12.L$0 = list6;
            walletSyncManager$syncWallets$12.L$1 = stateListAnimator2;
            walletSyncManager$syncWallets$12.L$2 = list5;
            walletSyncManager$syncWallets$12.L$3 = null;
            walletSyncManager$syncWallets$12.label = 4;
            objCopydefault = c13062cyk3.AEQbTJ(list6, arrayList42, walletSyncManager$syncWallets$12);
            if (objCopydefault == objCopydefault2) {
                return objCopydefault2;
            }
            if (((java.lang.Number) objCopydefault).intValue() > 0) {
            }
        }
        stateListAnimator = (StateListAnimator) objCopydefault;
        java.util.List list9 = (java.util.List) ((kotlin.Pair) stateListAnimator.OLrzqt()).getFirst();
        java.util.ArrayList arrayList7 = new java.util.ArrayList();
        C13058cyg c13058cyg = c13062cyk.AkhnZx;
        java.util.ArrayList arrayList8 = new java.util.ArrayList(C56403yEb.AYXKKw(list9, 10));
        java.util.Iterator it4 = list9.iterator();
        while (it4.hasNext()) {
            arrayList8.add(((WalletEntity) ((kotlin.Pair) it4.next()).getFirst()).getId());
        }
        walletSyncManager$syncWallets$12.L$0 = c13062cyk;
        walletSyncManager$syncWallets$12.L$1 = list2;
        walletSyncManager$syncWallets$12.L$2 = stateListAnimator;
        walletSyncManager$syncWallets$12.L$3 = list9;
        walletSyncManager$syncWallets$12.L$4 = arrayList7;
        walletSyncManager$syncWallets$12.label = 2;
        java.lang.Object objKWHzl = c13058cyg.KWHzl(arrayList8, walletSyncManager$syncWallets$12);
        if (objKWHzl == objCopydefault2) {
            return objCopydefault2;
        }
        C13062cyk c13062cyk4 = c13062cyk;
        list3 = list9;
        list4 = arrayList7;
        objCopydefault = objKWHzl;
        c13062cyk2 = c13062cyk4;
        java.util.List<C11288cIr> list82 = (java.util.List) objCopydefault;
        java.util.ArrayList<kotlin.Pair> arrayList22 = new java.util.ArrayList();
        while (r11.hasNext()) {
        }
        while (r6.hasNext()) {
        }
        walletSyncManager$syncWallets$12.L$0 = c13062cyk2;
        walletSyncManager$syncWallets$12.L$1 = list2;
        walletSyncManager$syncWallets$12.L$2 = stateListAnimator;
        walletSyncManager$syncWallets$12.L$3 = list3;
        walletSyncManager$syncWallets$12.L$4 = null;
        walletSyncManager$syncWallets$12.label = 3;
        if (c13062cyk2.AEQbTJ(list4, walletSyncManager$syncWallets$12) != objCopydefault2) {
        }
    }

    public final boolean OLrzqt(java.util.List<C11288cIr> list, SyncWalletReqNew syncWalletReqNew) {
        java.lang.Object obj;
        java.lang.Object next;
        java.util.List<C11283cIm> listEZpvd;
        java.util.List<C11283cIm> listKWHzl;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        java.util.Iterator<T> it = syncWalletReqNew.getAddAddresses().iterator();
        while (it.hasNext()) {
            linkedHashSet.addAll(((InternalChainAddressNew) it.next()).getChainIndexList());
        }
        java.util.Iterator<T> it2 = list.iterator();
        while (true) {
            obj = null;
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
            if (Intrinsics.EZpvd((java.lang.Object) ((C11288cIr) next).AEQbTJ(), (java.lang.Object) syncWalletReqNew.getAccountId())) {
                break;
            }
        }
        C11288cIr c11288cIr = (C11288cIr) next;
        if (c11288cIr != null && (listKWHzl = c11288cIr.KWHzl()) != null) {
            java.util.Iterator<T> it3 = listKWHzl.iterator();
            while (it3.hasNext()) {
                if (!linkedHashSet.contains(java.lang.Long.valueOf(((C11283cIm) it3.next()).KWHzl()))) {
                    return false;
                }
            }
        }
        linkedHashSet.clear();
        java.util.Iterator<T> it4 = syncWalletReqNew.getUpdateAddresses().iterator();
        while (it4.hasNext()) {
            linkedHashSet.addAll(((InternalChainAddressNew) it4.next()).getChainIndexList());
        }
        java.util.Iterator<T> it5 = list.iterator();
        while (true) {
            if (!it5.hasNext()) {
                break;
            }
            java.lang.Object next2 = it5.next();
            if (Intrinsics.EZpvd((java.lang.Object) ((C11288cIr) next2).AEQbTJ(), (java.lang.Object) syncWalletReqNew.getAccountId())) {
                obj = next2;
                break;
            }
        }
        C11288cIr c11288cIr2 = (C11288cIr) obj;
        if (c11288cIr2 == null || (listEZpvd = c11288cIr2.EZpvd()) == null) {
            return true;
        }
        java.util.Iterator<T> it6 = listEZpvd.iterator();
        while (it6.hasNext()) {
            if (!linkedHashSet.contains(java.lang.Long.valueOf(((C11283cIm) it6.next()).KWHzl()))) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ java.lang.Object requestWalletAssets$default(C13062cyk c13062cyk, java.util.List list, boolean z, Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return c13062cyk.OLrzqt((java.util.List<WalletEntity>) list, z, (Continuation<? super StateListAnimator<java.util.List<WalletEntity>>>) continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x01c4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object OLrzqt(java.util.List<WalletEntity> list, boolean z, Continuation<? super StateListAnimator<java.util.List<WalletEntity>>> continuation) throws java.lang.Throwable {
        WalletSyncManager$requestWalletAssets$1 walletSyncManager$requestWalletAssets$1;
        java.lang.Object obj;
        boolean z2;
        java.util.Map map;
        java.util.List list2;
        C13062cyk c13062cyk;
        C13062cyk c13062cyk2;
        java.util.List list3;
        java.util.List<WalletEntity> list4;
        WalletMustSyncOperation walletMustSyncOperation;
        java.util.List list5;
        if (continuation instanceof WalletSyncManager$requestWalletAssets$1) {
            walletSyncManager$requestWalletAssets$1 = (WalletSyncManager$requestWalletAssets$1) continuation;
            int i = walletSyncManager$requestWalletAssets$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                walletSyncManager$requestWalletAssets$1.label = i - Integer.MIN_VALUE;
            } else {
                walletSyncManager$requestWalletAssets$1 = new WalletSyncManager$requestWalletAssets$1(this, continuation);
            }
        }
        java.lang.Object obj2 = walletSyncManager$requestWalletAssets$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = walletSyncManager$requestWalletAssets$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj2);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj3 : list) {
                WalletEntity walletEntity = (WalletEntity) obj3;
                if (walletEntity.getSyncStatus() >= WalletSyncStatus.HasCreate.getValue() && !C11600cUg.KWHzl(walletEntity.getFromCreate()) && !Companion.AEQbTJ(walletEntity, WalletMustSyncOperation.HasRequestAsset)) {
                    arrayList.add(obj3);
                }
            }
            if (arrayList.isEmpty()) {
                return new StateListAnimator(list, 0, null, 6, null);
            }
            java.util.List listFJNWhG = CollectionsKt___CollectionsKt.fJNWhG((java.util.Collection) CollectionsKt___CollectionsKt.gEmmrt((java.lang.Iterable) arrayList, (java.lang.Iterable) arrayList));
            LinkedHashMap linkedHashMap = new LinkedHashMap(C56548yJl.copydefault(C56423yEv.copydefault(C56403yEb.AYXKKw(arrayList, 10)), 16));
            for (java.lang.Object obj4 : arrayList) {
                linkedHashMap.put(((WalletEntity) obj4).getId(), obj4);
            }
            if (arrayList.isEmpty()) {
                return new StateListAnimator(list, 0, null, 6, null);
            }
            WalletEntity walletEntity2 = (WalletEntity) CollectionsKt___CollectionsKt.AuCTelauCTel(arrayList);
            java.lang.String id = walletEntity2.getId();
            java.lang.String xpriv = walletEntity2.getXpriv();
            java.lang.String xpub = walletEntity2.getXpub();
            C13934dbu c13934dbu = this.gEmmrt;
            java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(arrayList, 10));
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((WalletEntity) it.next()).getId());
            }
            java.lang.String strAhwBna = WalletUpdateWorker.Application.getInstance$default(WalletUpdateWorker.Companion, null, 1, null).AhwBna();
            java.lang.Boolean boolKWHzl = C56443yFo.KWHzl(z);
            walletSyncManager$requestWalletAssets$1.L$0 = this;
            walletSyncManager$requestWalletAssets$1.L$1 = listFJNWhG;
            walletSyncManager$requestWalletAssets$1.L$2 = linkedHashMap;
            walletSyncManager$requestWalletAssets$1.Z$0 = z;
            walletSyncManager$requestWalletAssets$1.label = 1;
            obj = null;
            java.lang.Object objCopydefault2 = c13934dbu.copydefault(xpriv, xpub, id, arrayList2, strAhwBna, (java.lang.Long) null, boolKWHzl, 0, walletSyncManager$requestWalletAssets$1);
            if (objCopydefault2 == objCopydefault) {
                return objCopydefault;
            }
            z2 = z;
            map = linkedHashMap;
            obj2 = objCopydefault2;
            list2 = listFJNWhG;
            c13062cyk = this;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    list4 = (java.util.List) walletSyncManager$requestWalletAssets$1.L$1;
                    java.util.List list6 = (java.util.List) walletSyncManager$requestWalletAssets$1.L$0;
                    C56391yDq.AEQbTJ(obj2);
                    list5 = list6;
                    list5.addAll(list4);
                    return new StateListAnimator(list5, 0, null, 4, null);
                }
                list4 = (java.util.List) walletSyncManager$requestWalletAssets$1.L$2;
                list3 = (java.util.List) walletSyncManager$requestWalletAssets$1.L$1;
                c13062cyk2 = (C13062cyk) walletSyncManager$requestWalletAssets$1.L$0;
                C56391yDq.AEQbTJ(obj2);
                obj = null;
                walletMustSyncOperation = WalletMustSyncOperation.HasRequestAsset;
                walletSyncManager$requestWalletAssets$1.L$0 = list3;
                walletSyncManager$requestWalletAssets$1.L$1 = list4;
                walletSyncManager$requestWalletAssets$1.L$2 = obj;
                walletSyncManager$requestWalletAssets$1.label = 3;
                if (c13062cyk2.OLrzqt(list4, walletMustSyncOperation, walletSyncManager$requestWalletAssets$1) != objCopydefault) {
                    return objCopydefault;
                }
                list5 = list3;
                list5.addAll(list4);
                return new StateListAnimator(list5, 0, null, 4, null);
            }
            boolean z3 = walletSyncManager$requestWalletAssets$1.Z$0;
            java.util.Map map2 = (java.util.Map) walletSyncManager$requestWalletAssets$1.L$2;
            java.util.List list7 = (java.util.List) walletSyncManager$requestWalletAssets$1.L$1;
            C13062cyk c13062cyk3 = (C13062cyk) walletSyncManager$requestWalletAssets$1.L$0;
            C56391yDq.AEQbTJ(obj2);
            map = map2;
            list2 = list7;
            obj = null;
            z2 = z3;
            c13062cyk = c13062cyk3;
        }
        AbstractC43419rot<?, OKServerException> abstractC43419rot = (AbstractC43419rot) obj2;
        if (abstractC43419rot.EZpvd()) {
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.util.List list8 = (java.util.List) abstractC43419rot.AEQbTJ();
            CoroutineDispatcher io2 = Dispatchers.getIO();
            WalletSyncManager$requestWalletAssets$2 walletSyncManager$requestWalletAssets$2 = new WalletSyncManager$requestWalletAssets$2(list8, z2, map, arrayList3, null);
            walletSyncManager$requestWalletAssets$1.L$0 = c13062cyk;
            walletSyncManager$requestWalletAssets$1.L$1 = list2;
            walletSyncManager$requestWalletAssets$1.L$2 = arrayList3;
            walletSyncManager$requestWalletAssets$1.label = 2;
            if (BuildersKt.withContext(io2, walletSyncManager$requestWalletAssets$2, walletSyncManager$requestWalletAssets$1) == objCopydefault) {
                return objCopydefault;
            }
            c13062cyk2 = c13062cyk;
            list3 = list2;
            list4 = arrayList3;
            walletMustSyncOperation = WalletMustSyncOperation.HasRequestAsset;
            walletSyncManager$requestWalletAssets$1.L$0 = list3;
            walletSyncManager$requestWalletAssets$1.L$1 = list4;
            walletSyncManager$requestWalletAssets$1.L$2 = obj;
            walletSyncManager$requestWalletAssets$1.label = 3;
            if (c13062cyk2.OLrzqt(list4, walletMustSyncOperation, walletSyncManager$requestWalletAssets$1) != objCopydefault) {
            }
        } else {
            return c13062cyk.EZpvd(abstractC43419rot, list2);
        }
    }

    /* JADX DEBUG: Class process forced to load method for inline: com.okinc.business.defi.biz.database.wallet.entity.ChainAddressEntity.copy$default(com.okinc.business.defi.biz.database.wallet.entity.ChainAddressEntity, java.lang.String, long, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, java.lang.Object):com.okinc.business.defi.biz.database.wallet.entity.ChainAddressEntity */
    /* JADX WARN: Removed duplicated region for block: B:131:0x037b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0386  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x03a6 A[LOOP:1: B:137:0x03a0->B:139:0x03a6, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:143:0x03d9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:144:0x03da  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x03e7  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x03f0  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0408  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x04ac  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0507  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0275  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:160:0x0487 -> B:161:0x0489). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object EZpvd(java.util.List<WalletEntity> list, Continuation<? super StateListAnimator<java.util.List<WalletEntity>>> continuation) throws java.lang.Throwable {
        WalletSyncManager$requestNearAccountsSuspend$1 walletSyncManager$requestNearAccountsSuspend$1;
        java.util.List listFJNWhG;
        C13062cyk c13062cyk;
        java.util.List<WalletEntity> list2;
        java.util.List list3;
        java.util.Map map;
        java.util.ArrayList arrayList;
        java.util.Iterator it;
        C13062cyk c13062cyk2;
        java.util.List list4;
        java.util.HashMap map2;
        java.util.List list5;
        java.lang.Object next;
        AbstractC43419rot abstractC43419rot;
        Activity activity;
        java.util.Map map3;
        java.util.List<ChainAddressEntity> list6;
        java.util.List<WalletEntity> list7;
        WalletEntity walletEntity;
        ResponseSingeResult<GetNearAccountIdResp> responseResult;
        GetNearAccountIdResp getNearAccountIdResp;
        java.lang.String accountId;
        GetNearAccountIdResp getNearAccountIdResp2;
        java.util.List list8;
        java.lang.Long l;
        WalletMustSyncOperation walletMustSyncOperation;
        java.lang.Long l2;
        C13062cyk c13062cyk3;
        java.util.Iterator<T> it2;
        java.util.List list9;
        C13062cyk c13062cyk4;
        java.util.HashMap map4;
        java.util.Iterator it3;
        java.util.List<WalletEntity> list10;
        long j;
        C13062cyk c13062cyk5;
        ChainAddressEntity chainAddressEntity;
        if (continuation instanceof WalletSyncManager$requestNearAccountsSuspend$1) {
            walletSyncManager$requestNearAccountsSuspend$1 = (WalletSyncManager$requestNearAccountsSuspend$1) continuation;
            int i = walletSyncManager$requestNearAccountsSuspend$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                walletSyncManager$requestNearAccountsSuspend$1.label = i - Integer.MIN_VALUE;
            } else {
                walletSyncManager$requestNearAccountsSuspend$1 = new WalletSyncManager$requestNearAccountsSuspend$1(this, continuation);
            }
        }
        java.lang.Object objEZpvd = walletSyncManager$requestNearAccountsSuspend$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        switch (walletSyncManager$requestNearAccountsSuspend$1.label) {
            case 0:
                C56391yDq.AEQbTJ(objEZpvd);
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                for (java.lang.Object obj : list) {
                    WalletEntity walletEntity2 = (WalletEntity) obj;
                    if (walletEntity2.getSyncStatus() >= WalletSyncStatus.HasCreate.getValue() && (walletEntity2.getType() == WalletType.HDWallet.ordinal() || walletEntity2.getType() == WalletType.KeyWallet.ordinal())) {
                        if (!C11600cUg.KWHzl(walletEntity2.getFromCreate()) && !Companion.AEQbTJ(walletEntity2, WalletMustSyncOperation.HasRequestNearAccount)) {
                            arrayList2.add(obj);
                        }
                    }
                }
                if (arrayList2.isEmpty()) {
                    return new StateListAnimator(list, 0, null, 4, null);
                }
                listFJNWhG = CollectionsKt___CollectionsKt.fJNWhG((java.util.Collection) CollectionsKt___CollectionsKt.gEmmrt((java.lang.Iterable) list, (java.lang.Iterable) CollectionsKt___CollectionsKt.OqFWZa(arrayList2)));
                LinkedHashMap linkedHashMap = new LinkedHashMap(C56548yJl.copydefault(C56423yEv.copydefault(C56403yEb.AYXKKw(arrayList2, 10)), 16));
                for (java.lang.Object obj2 : arrayList2) {
                    linkedHashMap.put(((WalletEntity) obj2).getId(), obj2);
                }
                java.util.ArrayList arrayList3 = new java.util.ArrayList(C56403yEb.AYXKKw(arrayList2, 10));
                java.util.Iterator it4 = arrayList2.iterator();
                while (it4.hasNext()) {
                    arrayList3.add(((WalletEntity) it4.next()).getId());
                }
                cQM cqm = this.isConnected;
                walletSyncManager$requestNearAccountsSuspend$1.L$0 = this;
                walletSyncManager$requestNearAccountsSuspend$1.L$1 = list;
                walletSyncManager$requestNearAccountsSuspend$1.L$2 = listFJNWhG;
                walletSyncManager$requestNearAccountsSuspend$1.L$3 = linkedHashMap;
                walletSyncManager$requestNearAccountsSuspend$1.L$4 = arrayList3;
                walletSyncManager$requestNearAccountsSuspend$1.label = 1;
                objEZpvd = cqm.EZpvd(arrayList3, walletSyncManager$requestNearAccountsSuspend$1);
                if (objEZpvd == objCopydefault) {
                    return objCopydefault;
                }
                c13062cyk = this;
                list2 = list;
                list3 = arrayList3;
                map = linkedHashMap;
                java.util.Map map5 = (java.util.Map) objEZpvd;
                arrayList = new java.util.ArrayList();
                java.util.HashMap map6 = new java.util.HashMap();
                it = list3.iterator();
                while (it.hasNext()) {
                    java.util.List list11 = (java.util.List) map5.get((java.lang.String) it.next());
                    if (list11 != null) {
                        java.util.Iterator it5 = list11.iterator();
                        while (true) {
                            if (it5.hasNext()) {
                                next = it5.next();
                                list5 = listFJNWhG;
                                C10854bwM c10854bwMKWHzl = C10954byG.EZpvd.valueOf().KWHzl(((ChainAddressEntity) next).getChainId());
                                if (c10854bwMKWHzl == null || !c10854bwMKWHzl.QVsKAR()) {
                                    listFJNWhG = list5;
                                }
                            } else {
                                list5 = listFJNWhG;
                                next = null;
                            }
                        }
                        ChainAddressEntity chainAddressEntity2 = (ChainAddressEntity) next;
                        if (chainAddressEntity2 != null && C33129mqd.OLrzqt((java.lang.CharSequence) chainAddressEntity2.getAddress())) {
                            arrayList.add(new GetNearAccountIdReq(chainAddressEntity2.getPublicKey(), chainAddressEntity2.getWalletId()));
                            map6.put(chainAddressEntity2.getWalletId(), chainAddressEntity2);
                        }
                        Unit unit = Unit.INSTANCE;
                    } else {
                        list5 = listFJNWhG;
                    }
                    listFJNWhG = list5;
                }
                java.util.List list12 = listFJNWhG;
                if (!(!arrayList.isEmpty())) {
                    C13934dbu c13934dbu = c13062cyk.gEmmrt;
                    walletSyncManager$requestNearAccountsSuspend$1.L$0 = c13062cyk;
                    walletSyncManager$requestNearAccountsSuspend$1.L$1 = list12;
                    walletSyncManager$requestNearAccountsSuspend$1.L$2 = map;
                    walletSyncManager$requestNearAccountsSuspend$1.L$3 = map6;
                    walletSyncManager$requestNearAccountsSuspend$1.L$4 = null;
                    walletSyncManager$requestNearAccountsSuspend$1.label = 2;
                    objEZpvd = c13934dbu.OLrzqt(arrayList, walletSyncManager$requestNearAccountsSuspend$1);
                    if (objEZpvd == objCopydefault) {
                        return objCopydefault;
                    }
                    c13062cyk2 = c13062cyk;
                    list4 = list12;
                    map2 = map6;
                    abstractC43419rot = (AbstractC43419rot) objEZpvd;
                    if (!abstractC43419rot.EZpvd()) {
                        java.util.ArrayList arrayList4 = new java.util.ArrayList();
                        java.util.ArrayList arrayList5 = new java.util.ArrayList();
                        java.util.ArrayList arrayList6 = new java.util.ArrayList();
                        java.util.List<GetNearAccountIdRespBatch> list13 = (java.util.List) abstractC43419rot.copydefault();
                        if (list13 != null) {
                            for (GetNearAccountIdRespBatch getNearAccountIdRespBatch : list13) {
                                ResponseSingeResult<GetNearAccountIdResp> responseResult2 = getNearAccountIdRespBatch.getResponseResult();
                                if (responseResult2 != null && responseResult2.getCode() == 0 && (responseResult = getNearAccountIdRespBatch.getResponseResult()) != null && (getNearAccountIdResp = (GetNearAccountIdResp) responseResult.getData()) != null && (accountId = getNearAccountIdResp.getAccountId()) != null && C33129mqd.OLrzqt((java.lang.CharSequence) accountId)) {
                                    ResponseSingeResult<GetNearAccountIdResp> responseResult3 = getNearAccountIdRespBatch.getResponseResult();
                                    java.lang.String accountId2 = (responseResult3 == null || (getNearAccountIdResp2 = (GetNearAccountIdResp) responseResult3.getData()) == null) ? null : getNearAccountIdResp2.getAccountId();
                                    java.lang.String str = accountId2 == null ? "" : accountId2;
                                    ChainAddressEntity chainAddressEntity3 = (ChainAddressEntity) map2.get(getNearAccountIdRespBatch.getAccountId());
                                    if (chainAddressEntity3 != null) {
                                        arrayList4.add(chainAddressEntity3.copy((251 & 1) != 0 ? chainAddressEntity3.walletId : null, (251 & 2) != 0 ? chainAddressEntity3.chainId : 0L, (251 & 4) != 0 ? chainAddressEntity3.address : str, (251 & 8) != 0 ? chainAddressEntity3.addressType : 0, (251 & 16) != 0 ? chainAddressEntity3.publicKey : null, (251 & 32) != 0 ? chainAddressEntity3.derivePath : null, (251 & 64) != 0 ? chainAddressEntity3.proxyAddress : null, (251 & 128) != 0 ? chainAddressEntity3.eoaAddress : null));
                                        Unit unit2 = Unit.INSTANCE;
                                    }
                                } else {
                                    ResponseSingeResult<GetNearAccountIdResp> responseResult4 = getNearAccountIdRespBatch.getResponseResult();
                                    if (responseResult4 != null && responseResult4.getCode() == 10002) {
                                        WalletEntity walletEntity3 = (WalletEntity) map.get(getNearAccountIdRespBatch.getAccountId());
                                        if (walletEntity3 != null) {
                                            arrayList5.add(walletEntity3);
                                            Unit unit3 = Unit.INSTANCE;
                                        }
                                    } else {
                                        ResponseSingeResult<GetNearAccountIdResp> responseResult5 = getNearAccountIdRespBatch.getResponseResult();
                                        if (responseResult5 != null && responseResult5.getCode() == 0 && (walletEntity = (WalletEntity) map.get(getNearAccountIdRespBatch.getAccountId())) != null) {
                                            arrayList6.add(walletEntity);
                                            Unit unit4 = Unit.INSTANCE;
                                        }
                                        Unit unit5 = Unit.INSTANCE;
                                    }
                                }
                            }
                            Unit unit6 = Unit.INSTANCE;
                        }
                        walletSyncManager$requestNearAccountsSuspend$1.L$0 = c13062cyk2;
                        walletSyncManager$requestNearAccountsSuspend$1.L$1 = list4;
                        walletSyncManager$requestNearAccountsSuspend$1.L$2 = map;
                        walletSyncManager$requestNearAccountsSuspend$1.L$3 = map2;
                        walletSyncManager$requestNearAccountsSuspend$1.L$4 = arrayList4;
                        walletSyncManager$requestNearAccountsSuspend$1.L$5 = arrayList6;
                        walletSyncManager$requestNearAccountsSuspend$1.label = 3;
                        if (c13062cyk2.copydefault(arrayList5, walletSyncManager$requestNearAccountsSuspend$1) == objCopydefault) {
                            return objCopydefault;
                        }
                        map3 = map;
                        list6 = arrayList4;
                        list7 = arrayList6;
                        cOG cog = c13062cyk2.OLrzqt;
                        walletSyncManager$requestNearAccountsSuspend$1.L$0 = c13062cyk2;
                        walletSyncManager$requestNearAccountsSuspend$1.L$1 = list4;
                        walletSyncManager$requestNearAccountsSuspend$1.L$2 = map3;
                        walletSyncManager$requestNearAccountsSuspend$1.L$3 = map2;
                        walletSyncManager$requestNearAccountsSuspend$1.L$4 = list6;
                        walletSyncManager$requestNearAccountsSuspend$1.L$5 = list7;
                        walletSyncManager$requestNearAccountsSuspend$1.label = 4;
                        objEZpvd = cog.AEQbTJ(list6, walletSyncManager$requestNearAccountsSuspend$1);
                        if (objEZpvd == objCopydefault) {
                            return objCopydefault;
                        }
                        list8 = list4;
                        l = (java.lang.Long) CollectionsKt___CollectionsKt.firstOrNull((java.util.List) objEZpvd);
                        if (l != null && C33129mqd.AEQbTJ(l, C56443yFo.AEQbTJ(0))) {
                            java.util.ArrayList arrayList7 = new java.util.ArrayList(C56403yEb.AYXKKw(list6, 10));
                            it2 = list6.iterator();
                            while (it2.hasNext()) {
                                arrayList7.add((WalletEntity) map3.get(((ChainAddressEntity) it2.next()).getWalletId()));
                            }
                            list7.addAll(CollectionsKt___CollectionsKt.QfsBiF(arrayList7));
                        }
                        walletMustSyncOperation = WalletMustSyncOperation.HasRequestNearAccount;
                        walletSyncManager$requestNearAccountsSuspend$1.L$0 = c13062cyk2;
                        walletSyncManager$requestNearAccountsSuspend$1.L$1 = list8;
                        walletSyncManager$requestNearAccountsSuspend$1.L$2 = map2;
                        walletSyncManager$requestNearAccountsSuspend$1.L$3 = list7;
                        l2 = null;
                        walletSyncManager$requestNearAccountsSuspend$1.L$4 = null;
                        walletSyncManager$requestNearAccountsSuspend$1.L$5 = null;
                        walletSyncManager$requestNearAccountsSuspend$1.label = 5;
                        if (c13062cyk2.OLrzqt(list7, walletMustSyncOperation, walletSyncManager$requestNearAccountsSuspend$1) == objCopydefault) {
                            return objCopydefault;
                        }
                        c13062cyk3 = c13062cyk2;
                        C10854bwM c10854bwMAuCTel = C10954byG.EZpvd.valueOf().AuCTel();
                        long jCopydefault = C11600cUg.copydefault(c10854bwMAuCTel == null ? C56443yFo.KWHzl(c10854bwMAuCTel.fetchVPNInfo()) : l2);
                        list9 = list8;
                        c13062cyk4 = c13062cyk3;
                        map4 = map2;
                        it3 = list7.iterator();
                        list10 = list7;
                        j = jCopydefault;
                        while (it3.hasNext()) {
                            ChainAddressEntity chainAddressEntity4 = (ChainAddressEntity) map4.get(((WalletEntity) it3.next()).getId());
                            if (chainAddressEntity4 == null || chainAddressEntity4.getAddress().length() == 0) {
                                c13062cyk4 = c13062cyk4;
                                list9 = list9;
                                map4 = map4;
                            } else {
                                C13058cyg c13058cyg = c13062cyk4.AkhnZx;
                                java.lang.String walletId = chainAddressEntity4.getWalletId();
                                java.util.List list14 = list9;
                                java.util.HashMap map7 = map4;
                                java.util.List<C11283cIm> listEZpvd = C56402yEa.EZpvd(new C11283cIm(chainAddressEntity4.getAddressType(), j, "", null, null, 24, null));
                                java.util.List<C11283cIm> listAhwBna = yDY.AhwBna();
                                c13062cyk5 = c13062cyk4;
                                walletSyncManager$requestNearAccountsSuspend$1.L$0 = c13062cyk5;
                                walletSyncManager$requestNearAccountsSuspend$1.L$1 = list14;
                                walletSyncManager$requestNearAccountsSuspend$1.L$2 = map7;
                                walletSyncManager$requestNearAccountsSuspend$1.L$3 = list10;
                                walletSyncManager$requestNearAccountsSuspend$1.L$4 = it3;
                                chainAddressEntity = chainAddressEntity4;
                                walletSyncManager$requestNearAccountsSuspend$1.L$5 = chainAddressEntity;
                                walletSyncManager$requestNearAccountsSuspend$1.L$6 = chainAddressEntity;
                                walletSyncManager$requestNearAccountsSuspend$1.J$0 = j;
                                walletSyncManager$requestNearAccountsSuspend$1.label = 6;
                                if (c13058cyg.copydefault(walletId, listEZpvd, listAhwBna, walletSyncManager$requestNearAccountsSuspend$1) == objCopydefault) {
                                    return objCopydefault;
                                }
                                list9 = list14;
                                map4 = map7;
                                c13062cyk5.isConnected.OLrzqt(chainAddressEntity.getWalletId(), WalletSyncOperation.UpdateDefaultAddress);
                                c13062cyk4 = c13062cyk5;
                                while (it3.hasNext()) {
                                }
                            }
                        }
                        activity = new Activity(list10, C56443yFo.AEQbTJ(0), "");
                        list4 = list9;
                        java.util.List list15 = (java.util.List) activity.AEQbTJ();
                        int iIntValue = ((java.lang.Number) activity.OLrzqt()).intValue();
                        java.lang.String str2 = (java.lang.String) activity.EZpvd();
                        list4.addAll(list15);
                        return new StateListAnimator(list4, iIntValue, str2);
                    }
                    AbstractC43419rot.ActionBar actionBar = abstractC43419rot instanceof AbstractC43419rot.ActionBar ? (AbstractC43419rot.ActionBar) abstractC43419rot : null;
                    if (actionBar != null) {
                        activity = new Activity(yDY.AhwBna(), C56443yFo.AEQbTJ(((OKServerException) actionBar.KWHzl()).getCode()), ((OKServerException) actionBar.KWHzl()).getMessage());
                    } else {
                        activity = new Activity(yDY.AhwBna(), C56443yFo.AEQbTJ(-1), "");
                    }
                    java.util.List list152 = (java.util.List) activity.AEQbTJ();
                    int iIntValue2 = ((java.lang.Number) activity.OLrzqt()).intValue();
                    java.lang.String str22 = (java.lang.String) activity.EZpvd();
                    list4.addAll(list152);
                    return new StateListAnimator(list4, iIntValue2, str22);
                }
                return new StateListAnimator(list2, 0, null, 4, null);
            case 1:
                list3 = (java.util.List) walletSyncManager$requestNearAccountsSuspend$1.L$4;
                map = (java.util.Map) walletSyncManager$requestNearAccountsSuspend$1.L$3;
                listFJNWhG = (java.util.List) walletSyncManager$requestNearAccountsSuspend$1.L$2;
                java.util.List<WalletEntity> list16 = (java.util.List) walletSyncManager$requestNearAccountsSuspend$1.L$1;
                c13062cyk = (C13062cyk) walletSyncManager$requestNearAccountsSuspend$1.L$0;
                C56391yDq.AEQbTJ(objEZpvd);
                list2 = list16;
                java.util.Map map52 = (java.util.Map) objEZpvd;
                arrayList = new java.util.ArrayList();
                java.util.HashMap map62 = new java.util.HashMap();
                it = list3.iterator();
                while (it.hasNext()) {
                }
                java.util.List list122 = listFJNWhG;
                if (!(!arrayList.isEmpty())) {
                }
                break;
            case 2:
                java.util.HashMap map8 = (java.util.HashMap) walletSyncManager$requestNearAccountsSuspend$1.L$3;
                map = (java.util.Map) walletSyncManager$requestNearAccountsSuspend$1.L$2;
                java.util.List list17 = (java.util.List) walletSyncManager$requestNearAccountsSuspend$1.L$1;
                C13062cyk c13062cyk6 = (C13062cyk) walletSyncManager$requestNearAccountsSuspend$1.L$0;
                C56391yDq.AEQbTJ(objEZpvd);
                list4 = list17;
                c13062cyk2 = c13062cyk6;
                map2 = map8;
                abstractC43419rot = (AbstractC43419rot) objEZpvd;
                if (!abstractC43419rot.EZpvd()) {
                }
                break;
            case 3:
                list7 = (java.util.List) walletSyncManager$requestNearAccountsSuspend$1.L$5;
                list6 = (java.util.List) walletSyncManager$requestNearAccountsSuspend$1.L$4;
                map2 = (java.util.HashMap) walletSyncManager$requestNearAccountsSuspend$1.L$3;
                map3 = (java.util.Map) walletSyncManager$requestNearAccountsSuspend$1.L$2;
                list4 = (java.util.List) walletSyncManager$requestNearAccountsSuspend$1.L$1;
                c13062cyk2 = (C13062cyk) walletSyncManager$requestNearAccountsSuspend$1.L$0;
                C56391yDq.AEQbTJ(objEZpvd);
                cOG cog2 = c13062cyk2.OLrzqt;
                walletSyncManager$requestNearAccountsSuspend$1.L$0 = c13062cyk2;
                walletSyncManager$requestNearAccountsSuspend$1.L$1 = list4;
                walletSyncManager$requestNearAccountsSuspend$1.L$2 = map3;
                walletSyncManager$requestNearAccountsSuspend$1.L$3 = map2;
                walletSyncManager$requestNearAccountsSuspend$1.L$4 = list6;
                walletSyncManager$requestNearAccountsSuspend$1.L$5 = list7;
                walletSyncManager$requestNearAccountsSuspend$1.label = 4;
                objEZpvd = cog2.AEQbTJ(list6, walletSyncManager$requestNearAccountsSuspend$1);
                if (objEZpvd == objCopydefault) {
                }
                list8 = list4;
                l = (java.lang.Long) CollectionsKt___CollectionsKt.firstOrNull((java.util.List) objEZpvd);
                if (l != null) {
                    java.util.ArrayList arrayList72 = new java.util.ArrayList(C56403yEb.AYXKKw(list6, 10));
                    it2 = list6.iterator();
                    while (it2.hasNext()) {
                    }
                    list7.addAll(CollectionsKt___CollectionsKt.QfsBiF(arrayList72));
                }
                walletMustSyncOperation = WalletMustSyncOperation.HasRequestNearAccount;
                walletSyncManager$requestNearAccountsSuspend$1.L$0 = c13062cyk2;
                walletSyncManager$requestNearAccountsSuspend$1.L$1 = list8;
                walletSyncManager$requestNearAccountsSuspend$1.L$2 = map2;
                walletSyncManager$requestNearAccountsSuspend$1.L$3 = list7;
                l2 = null;
                walletSyncManager$requestNearAccountsSuspend$1.L$4 = null;
                walletSyncManager$requestNearAccountsSuspend$1.L$5 = null;
                walletSyncManager$requestNearAccountsSuspend$1.label = 5;
                if (c13062cyk2.OLrzqt(list7, walletMustSyncOperation, walletSyncManager$requestNearAccountsSuspend$1) == objCopydefault) {
                }
                break;
            case 4:
                list7 = (java.util.List) walletSyncManager$requestNearAccountsSuspend$1.L$5;
                list6 = (java.util.List) walletSyncManager$requestNearAccountsSuspend$1.L$4;
                map2 = (java.util.HashMap) walletSyncManager$requestNearAccountsSuspend$1.L$3;
                map3 = (java.util.Map) walletSyncManager$requestNearAccountsSuspend$1.L$2;
                list4 = (java.util.List) walletSyncManager$requestNearAccountsSuspend$1.L$1;
                c13062cyk2 = (C13062cyk) walletSyncManager$requestNearAccountsSuspend$1.L$0;
                C56391yDq.AEQbTJ(objEZpvd);
                list8 = list4;
                l = (java.lang.Long) CollectionsKt___CollectionsKt.firstOrNull((java.util.List) objEZpvd);
                if (l != null) {
                }
                walletMustSyncOperation = WalletMustSyncOperation.HasRequestNearAccount;
                walletSyncManager$requestNearAccountsSuspend$1.L$0 = c13062cyk2;
                walletSyncManager$requestNearAccountsSuspend$1.L$1 = list8;
                walletSyncManager$requestNearAccountsSuspend$1.L$2 = map2;
                walletSyncManager$requestNearAccountsSuspend$1.L$3 = list7;
                l2 = null;
                walletSyncManager$requestNearAccountsSuspend$1.L$4 = null;
                walletSyncManager$requestNearAccountsSuspend$1.L$5 = null;
                walletSyncManager$requestNearAccountsSuspend$1.label = 5;
                if (c13062cyk2.OLrzqt(list7, walletMustSyncOperation, walletSyncManager$requestNearAccountsSuspend$1) == objCopydefault) {
                }
                break;
            case 5:
                list7 = (java.util.List) walletSyncManager$requestNearAccountsSuspend$1.L$3;
                java.util.HashMap map9 = (java.util.HashMap) walletSyncManager$requestNearAccountsSuspend$1.L$2;
                list8 = (java.util.List) walletSyncManager$requestNearAccountsSuspend$1.L$1;
                c13062cyk3 = (C13062cyk) walletSyncManager$requestNearAccountsSuspend$1.L$0;
                C56391yDq.AEQbTJ(objEZpvd);
                map2 = map9;
                l2 = null;
                C10854bwM c10854bwMAuCTel2 = C10954byG.EZpvd.valueOf().AuCTel();
                long jCopydefault2 = C11600cUg.copydefault(c10854bwMAuCTel2 == null ? C56443yFo.KWHzl(c10854bwMAuCTel2.fetchVPNInfo()) : l2);
                list9 = list8;
                c13062cyk4 = c13062cyk3;
                map4 = map2;
                it3 = list7.iterator();
                list10 = list7;
                j = jCopydefault2;
                while (it3.hasNext()) {
                }
                activity = new Activity(list10, C56443yFo.AEQbTJ(0), "");
                list4 = list9;
                java.util.List list1522 = (java.util.List) activity.AEQbTJ();
                int iIntValue22 = ((java.lang.Number) activity.OLrzqt()).intValue();
                java.lang.String str222 = (java.lang.String) activity.EZpvd();
                list4.addAll(list1522);
                return new StateListAnimator(list4, iIntValue22, str222);
            case 6:
                long j2 = walletSyncManager$requestNearAccountsSuspend$1.J$0;
                ChainAddressEntity chainAddressEntity5 = (ChainAddressEntity) walletSyncManager$requestNearAccountsSuspend$1.L$6;
                it3 = (java.util.Iterator) walletSyncManager$requestNearAccountsSuspend$1.L$4;
                java.util.List<WalletEntity> list18 = (java.util.List) walletSyncManager$requestNearAccountsSuspend$1.L$3;
                java.util.HashMap map10 = (java.util.HashMap) walletSyncManager$requestNearAccountsSuspend$1.L$2;
                java.util.List list19 = (java.util.List) walletSyncManager$requestNearAccountsSuspend$1.L$1;
                C13062cyk c13062cyk7 = (C13062cyk) walletSyncManager$requestNearAccountsSuspend$1.L$0;
                C56391yDq.AEQbTJ(objEZpvd);
                list10 = list18;
                map4 = map10;
                list9 = list19;
                c13062cyk5 = c13062cyk7;
                chainAddressEntity = chainAddressEntity5;
                j = j2;
                c13062cyk5.isConnected.OLrzqt(chainAddressEntity.getWalletId(), WalletSyncOperation.UpdateDefaultAddress);
                c13062cyk4 = c13062cyk5;
                while (it3.hasNext()) {
                }
                activity = new Activity(list10, C56443yFo.AEQbTJ(0), "");
                list4 = list9;
                java.util.List list15222 = (java.util.List) activity.AEQbTJ();
                int iIntValue222 = ((java.lang.Number) activity.OLrzqt()).intValue();
                java.lang.String str2222 = (java.lang.String) activity.EZpvd();
                list4.addAll(list15222);
                return new StateListAnimator(list4, iIntValue222, str2222);
            default:
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public final java.lang.Object AEQbTJ(java.util.List<WalletEntity> list, boolean z, Continuation<? super StateListAnimator<TaskDescription>> continuation) {
        return CoroutineScopeKt.coroutineScope(new WalletSyncManager$requestEosInfo$2(list, this, null), continuation);
    }

    /* JADX INFO: renamed from: o.cyk$StateListAnimator */
    public static final class StateListAnimator<T> {
        public final T EZpvd;
        public final int KWHzl;
        public final java.lang.String OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.cyk$StateListAnimator */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ StateListAnimator copy$default(StateListAnimator stateListAnimator, java.lang.Object obj, int i, java.lang.String str, int i2, java.lang.Object obj2) {
            if ((i2 & 1) != 0) {
                obj = stateListAnimator.EZpvd;
            }
            if ((i2 & 2) != 0) {
                i = stateListAnimator.KWHzl;
            }
            if ((i2 & 4) != 0) {
                str = stateListAnimator.OLrzqt;
            }
            return stateListAnimator.copydefault(obj, i, str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String EZpvd() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final T OLrzqt() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int copydefault() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final StateListAnimator<T> copydefault(T t, int i, java.lang.String str) {
            return new StateListAnimator<>(t, i, str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof StateListAnimator)) {
                return false;
            }
            StateListAnimator stateListAnimator = (StateListAnimator) obj;
            return Intrinsics.EZpvd(this.EZpvd, stateListAnimator.EZpvd) && this.KWHzl == stateListAnimator.KWHzl && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) stateListAnimator.OLrzqt);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            T t = this.EZpvd;
            int iHashCode = t == null ? 0 : t.hashCode();
            int iHashCode2 = java.lang.Integer.hashCode(this.KWHzl);
            java.lang.String str = this.OLrzqt;
            return (((iHashCode * 31) + iHashCode2) * 31) + (str != null ? str.hashCode() : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Result(result=" + this.EZpvd + ", code=" + this.KWHzl + ", msg=" + this.OLrzqt + ")";
        }

        public StateListAnimator(T t, int i, java.lang.String str) {
            this.EZpvd = t;
            this.KWHzl = i;
            this.OLrzqt = str;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (r1v0 java.lang.Object)
  (wrap:int:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r2v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
 A[MD:(T, int, java.lang.String):void (m)] (LINE:1127) call: o.cyk.StateListAnimator.<init>(java.lang.Object, int, java.lang.String):void type: THIS */
        public /* synthetic */ StateListAnimator(java.lang.Object obj, int i, java.lang.String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(obj, (i2 & 2) != 0 ? 0 : i, (i2 & 4) != 0 ? "" : str);
        }
    }

    /* JADX INFO: renamed from: o.cyk$TaskDescription */
    public static final class TaskDescription {
        public final java.util.List<WalletEntity> AEQbTJ;
        public final java.util.List<WalletEntity> EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.cyk$TaskDescription */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ TaskDescription copy$default(TaskDescription taskDescription, java.util.List list, java.util.List list2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = taskDescription.EZpvd;
            }
            if ((i & 2) != 0) {
                list2 = taskDescription.AEQbTJ;
            }
            return taskDescription.copydefault(list, list2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<WalletEntity> EZpvd() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<WalletEntity> copydefault() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TaskDescription copydefault(@NotNull java.util.List<WalletEntity> list, @NotNull java.util.List<WalletEntity> list2) {
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(list2, "");
            return new TaskDescription(list, list2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TaskDescription)) {
                return false;
            }
            TaskDescription taskDescription = (TaskDescription) obj;
            return Intrinsics.EZpvd(this.EZpvd, taskDescription.EZpvd) && Intrinsics.EZpvd(this.AEQbTJ, taskDescription.AEQbTJ);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (this.EZpvd.hashCode() * 31) + this.AEQbTJ.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "AsyncResults(successList=" + this.EZpvd + ", shouldSyncList=" + this.AEQbTJ + ")";
        }

        public TaskDescription(@NotNull java.util.List<WalletEntity> list, @NotNull java.util.List<WalletEntity> list2) {
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(list2, "");
            this.EZpvd = list;
            this.AEQbTJ = list2;
        }
    }

    /* JADX INFO: renamed from: o.cyk$Activity */
    public static final class Activity<R, T, S> {
        public final R EZpvd;
        public final T KWHzl;
        public final S copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.cyk$Activity */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Activity copy$default(Activity activity, java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, int i, java.lang.Object obj4) {
            if ((i & 1) != 0) {
                obj = activity.EZpvd;
            }
            if ((i & 2) != 0) {
                obj2 = activity.KWHzl;
            }
            if ((i & 4) != 0) {
                obj3 = activity.copydefault;
            }
            return activity.KWHzl(obj, obj2, obj3);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final R AEQbTJ() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final S EZpvd() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Activity<R, T, S> KWHzl(R r, T t, S s) {
            return new Activity<>(r, t, s);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final T OLrzqt() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Activity)) {
                return false;
            }
            Activity activity = (Activity) obj;
            return Intrinsics.EZpvd(this.EZpvd, activity.EZpvd) && Intrinsics.EZpvd(this.KWHzl, activity.KWHzl) && Intrinsics.EZpvd(this.copydefault, activity.copydefault);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            R r = this.EZpvd;
            int iHashCode = r == null ? 0 : r.hashCode();
            T t = this.KWHzl;
            int iHashCode2 = t == null ? 0 : t.hashCode();
            S s = this.copydefault;
            return (((iHashCode * 31) + iHashCode2) * 31) + (s != null ? s.hashCode() : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Tuple(first=" + this.EZpvd + ", second=" + this.KWHzl + ", third=" + this.copydefault + ")";
        }

        public Activity(R r, T t, S s) {
            this.EZpvd = r;
            this.KWHzl = t;
            this.copydefault = s;
        }
    }

    public final java.lang.Object KWHzl(java.util.List<WalletEntity> list, boolean z, Continuation<? super StateListAnimator<TaskDescription>> continuation) {
        return CoroutineScopeKt.coroutineScope(new WalletSyncManager$requestSegwitAddress$2(list, this, null), continuation);
    }

    public final java.lang.Object copydefault(java.util.List<WalletEntity> list, boolean z, boolean z2, java.lang.String str, LoaderManager loaderManager, Continuation<? super StateListAnimator<kotlin.Pair<java.util.List<kotlin.Pair<WalletEntity, SyncWalletReqNew>>, java.util.Map<java.lang.String, java.util.List<ChainAddress>>>>> continuation) {
        return CoroutineScopeKt.coroutineScope(new WalletSyncManager$syncWalletAddressList$2(this, list, z, z2, loaderManager, str, null), continuation);
    }

    public final java.util.List<ChainAddress> AEQbTJ(java.util.HashMap<java.lang.String, java.util.List<ChainAddress>> map, java.lang.String str) {
        java.util.List<ChainAddress> arrayList = map.get(str);
        if (arrayList == null) {
            arrayList = new java.util.ArrayList<>();
            map.put(str, arrayList);
        }
        return C56532yIw.OLrzqt(arrayList);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object OLrzqt(java.util.List<WalletEntity> list, Continuation<? super StateListAnimator<java.util.List<WalletEntity>>> continuation) throws java.lang.Throwable {
        WalletSyncManager$syncWalletNames$1 walletSyncManager$syncWalletNames$1;
        C13062cyk c13062cyk;
        java.util.List<WalletEntity> list2;
        AbstractC43419rot<?, OKServerException> abstractC43419rot;
        OKServerException oKServerException;
        java.util.List<WalletEntity> list3;
        C13062cyk c13062cyk2;
        java.util.List<WalletEntity> list4;
        AbstractC43419rot<?, OKServerException> abstractC43419rot2;
        if (continuation instanceof WalletSyncManager$syncWalletNames$1) {
            walletSyncManager$syncWalletNames$1 = (WalletSyncManager$syncWalletNames$1) continuation;
            int i = walletSyncManager$syncWalletNames$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                walletSyncManager$syncWalletNames$1.label = i - Integer.MIN_VALUE;
            } else {
                walletSyncManager$syncWalletNames$1 = new WalletSyncManager$syncWalletNames$1(this, continuation);
            }
        }
        java.lang.Object obj = walletSyncManager$syncWalletNames$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = walletSyncManager$syncWalletNames$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj2 : list) {
                if (Companion.EZpvd((WalletEntity) obj2, WalletSyncOperation.Rename)) {
                    arrayList.add(obj2);
                }
            }
            if (arrayList.isEmpty()) {
                return new StateListAnimator(list, 0, null, 6, null);
            }
            C13934dbu c13934dbu = this.gEmmrt;
            walletSyncManager$syncWalletNames$1.L$0 = this;
            walletSyncManager$syncWalletNames$1.L$1 = list;
            walletSyncManager$syncWalletNames$1.L$2 = arrayList;
            walletSyncManager$syncWalletNames$1.label = 1;
            java.lang.Object objGEmmrt = c13934dbu.gEmmrt(arrayList, walletSyncManager$syncWalletNames$1);
            if (objGEmmrt == objCopydefault) {
                return objCopydefault;
            }
            c13062cyk = this;
            list2 = arrayList;
            obj = objGEmmrt;
        } else {
            if (i2 != 1) {
                if (i2 == 2) {
                    list = (java.util.List) walletSyncManager$syncWalletNames$1.L$0;
                    C56391yDq.AEQbTJ(obj);
                    return new StateListAnimator(list, 0, null, 6, null);
                }
                if (i2 != 3) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                abstractC43419rot2 = (AbstractC43419rot) walletSyncManager$syncWalletNames$1.L$3;
                list3 = (java.util.List) walletSyncManager$syncWalletNames$1.L$2;
                list4 = (java.util.List) walletSyncManager$syncWalletNames$1.L$1;
                c13062cyk2 = (C13062cyk) walletSyncManager$syncWalletNames$1.L$0;
                C56391yDq.AEQbTJ(obj);
                abstractC43419rot = abstractC43419rot2;
                c13062cyk = c13062cyk2;
                list = list4;
                list2 = list3;
                return c13062cyk.EZpvd(abstractC43419rot, CollectionsKt___CollectionsKt.gEmmrt((java.lang.Iterable) list, (java.lang.Iterable) CollectionsKt___CollectionsKt.OqFWZa(list2)));
            }
            java.util.List<WalletEntity> list5 = (java.util.List) walletSyncManager$syncWalletNames$1.L$2;
            java.util.List<WalletEntity> list6 = (java.util.List) walletSyncManager$syncWalletNames$1.L$1;
            c13062cyk = (C13062cyk) walletSyncManager$syncWalletNames$1.L$0;
            C56391yDq.AEQbTJ(obj);
            list2 = list5;
            list = list6;
        }
        abstractC43419rot = (AbstractC43419rot) obj;
        if (abstractC43419rot.EZpvd()) {
            java.util.List<? extends WalletSyncOperation> listEZpvd = C56402yEa.EZpvd(WalletSyncOperation.Rename);
            walletSyncManager$syncWalletNames$1.L$0 = list;
            walletSyncManager$syncWalletNames$1.L$1 = null;
            walletSyncManager$syncWalletNames$1.L$2 = null;
            walletSyncManager$syncWalletNames$1.label = 2;
            if (c13062cyk.EZpvd(list, listEZpvd, walletSyncManager$syncWalletNames$1) == objCopydefault) {
                return objCopydefault;
            }
            return new StateListAnimator(list, 0, null, 6, null);
        }
        AbstractC43419rot.ActionBar actionBar = abstractC43419rot instanceof AbstractC43419rot.ActionBar ? (AbstractC43419rot.ActionBar) abstractC43419rot : null;
        if (actionBar != null && (oKServerException = (OKServerException) actionBar.KWHzl()) != null && oKServerException.getCode() == 10002) {
            walletSyncManager$syncWalletNames$1.L$0 = c13062cyk;
            walletSyncManager$syncWalletNames$1.L$1 = list;
            walletSyncManager$syncWalletNames$1.L$2 = list2;
            walletSyncManager$syncWalletNames$1.L$3 = abstractC43419rot;
            walletSyncManager$syncWalletNames$1.label = 3;
            if (c13062cyk.copydefault(list2, walletSyncManager$syncWalletNames$1) == objCopydefault) {
                return objCopydefault;
            }
            list3 = list2;
            c13062cyk2 = c13062cyk;
            list4 = list;
            abstractC43419rot2 = abstractC43419rot;
            abstractC43419rot = abstractC43419rot2;
            c13062cyk = c13062cyk2;
            list = list4;
            list2 = list3;
        }
        return c13062cyk.EZpvd(abstractC43419rot, CollectionsKt___CollectionsKt.gEmmrt((java.lang.Iterable) list, (java.lang.Iterable) CollectionsKt___CollectionsKt.OqFWZa(list2)));
    }

    public final boolean copydefault(java.lang.String str) {
        return Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "createWallet");
    }

    public final void AEQbTJ(java.util.List<WalletEntity> list, java.util.List<? extends WalletSyncOperation> list2) {
        java.util.List listSplit$default;
        Sequence sequenceQVAiDq;
        Sequence sequenceDbNXlk;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        final java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list2, 10));
        java.util.Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(java.lang.String.valueOf(((WalletSyncOperation) it.next()).getValue()));
        }
        for (WalletEntity walletEntity : list) {
            java.lang.String syncOperation = walletEntity.getSyncOperation();
            if (syncOperation != null && (listSplit$default = StringsKt__StringsKt.split$default((java.lang.CharSequence) syncOperation, new java.lang.String[]{","}, false, 0, 6, (java.lang.Object) null)) != null && (sequenceQVAiDq = CollectionsKt___CollectionsKt.QVAiDq(listSplit$default)) != null && (sequenceDbNXlk = C59467zhb.DbNXlk(sequenceQVAiDq, new Function1() { // from class: o.cyv
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return java.lang.Boolean.valueOf(C13062cyk.OLrzqt(arrayList, (java.lang.String) obj));
                }
            })) != null) {
                java.util.Iterator it2 = sequenceDbNXlk.iterator();
                while (it2.hasNext()) {
                    sb.append((java.lang.String) it2.next());
                    sb.append(",");
                }
            }
            if (StringsKt__StringsKt.endsWith$default((java.lang.CharSequence) sb, (java.lang.CharSequence) ",", false, 2, (java.lang.Object) null)) {
                Intrinsics.checkNotNullExpressionValue(sb.deleteCharAt(StringsKt__StringsKt.fIwbmz(sb)), "");
            }
            walletEntity.setSyncOperation(sb.toString());
        }
    }

    public static final boolean OLrzqt(java.util.List list, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return !list.contains(str);
    }

    public final void KWHzl(WalletEntity walletEntity, java.util.List<? extends WalletSyncOperation> list) {
        java.util.List listSplit$default;
        Sequence sequenceQVAiDq;
        Sequence sequenceDbNXlk;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        final java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(java.lang.String.valueOf(((WalletSyncOperation) it.next()).getValue()));
        }
        java.lang.String syncOperation = walletEntity.getSyncOperation();
        if (syncOperation != null && (listSplit$default = StringsKt__StringsKt.split$default((java.lang.CharSequence) syncOperation, new java.lang.String[]{","}, false, 0, 6, (java.lang.Object) null)) != null && (sequenceQVAiDq = CollectionsKt___CollectionsKt.QVAiDq(listSplit$default)) != null && (sequenceDbNXlk = C59467zhb.DbNXlk(sequenceQVAiDq, new Function1() { // from class: o.cyo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Boolean.valueOf(C13062cyk.EZpvd(arrayList, (java.lang.String) obj));
            }
        })) != null) {
            java.util.Iterator it2 = sequenceDbNXlk.iterator();
            while (it2.hasNext()) {
                sb.append((java.lang.String) it2.next());
                sb.append(",");
            }
        }
        if (StringsKt__StringsKt.endsWith$default((java.lang.CharSequence) sb, (java.lang.CharSequence) ",", false, 2, (java.lang.Object) null)) {
            Intrinsics.checkNotNullExpressionValue(sb.deleteCharAt(StringsKt__StringsKt.fIwbmz(sb)), "");
        }
        walletEntity.setSyncOperation(sb.toString());
    }

    public static final boolean EZpvd(java.util.List list, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return !list.contains(str);
    }

    public final java.lang.Object EZpvd(java.util.List<WalletEntity> list, java.util.List<? extends WalletSyncOperation> list2, Continuation<? super Unit> continuation) {
        AEQbTJ(list, list2);
        java.lang.Object objDjBIcL = this.isConnected.djBIcL(list, (Continuation<? super java.lang.Integer>) continuation);
        return objDjBIcL == C56442yFn.copydefault() ? objDjBIcL : Unit.INSTANCE;
    }

    public final java.lang.Object AEQbTJ(java.util.List<WalletEntity> list, Continuation<? super java.lang.Integer> continuation) {
        return this.isConnected.djBIcL(list, continuation);
    }

    public final java.lang.Object AEQbTJ(java.util.List<WalletEntity> list, java.util.List<SyncWalletReqNew> list2, Continuation<? super java.lang.Integer> continuation) {
        return this.isConnected.OLrzqt(list, list2, continuation);
    }

    public final java.lang.Object copydefault(java.util.List<WalletEntity> list, boolean z, java.lang.String str, LoaderManager loaderManager, Continuation<? super StateListAnimator<java.util.List<WalletEntity>>> continuation) {
        return CoroutineScopeKt.coroutineScope(new WalletSyncManager$createWalletsToServer$2(this, list, z, loaderManager, str, null), continuation);
    }

    public final void AEQbTJ() {
        C10854bwM c10854bwMOLrzqt = C10954byG.EZpvd.valueOf().copydefault(70000078L);
        C10856bwO.copydefault("WalletSyncManager", 0, "logInitiaChainInfo coinId=" + (c10854bwMOLrzqt != null ? java.lang.Long.valueOf(c10854bwMOLrzqt.AhwBna()) : null) + " chainId=" + (c10854bwMOLrzqt != null ? java.lang.Long.valueOf(c10854bwMOLrzqt.QKVWgx()) : null) + " realChainId=" + (c10854bwMOLrzqt != null ? java.lang.Long.valueOf(c10854bwMOLrzqt.fetchVPNInfo()) : null));
    }

    public final CreateWalletReqNew OLrzqt(java.lang.String str, java.lang.String str2, java.lang.String str3, java.util.List<ChainAddress> list, int i, java.lang.String str4, C11291cIu c11291cIu, boolean z, long j) {
        return new CreateWalletReqNew(str4, str2, str3, (java.util.List) this.AkhnZx.EZpvd(str, list, c11291cIu != null ? c11291cIu.copydefault() : null, z), i, j, str, false, 128, (DefaultConstructorMarker) null);
    }

    public final boolean KWHzl(WalletEntity walletEntity) {
        C10854bwM c10854bwMKWHzl;
        return walletEntity.getType() == WalletType.KeyWallet.ordinal() && (c10854bwMKWHzl = C10954byG.EZpvd.valueOf().KWHzl(walletEntity.getChainId())) != null && c10854bwMKWHzl.OuxcSI();
    }

    public final AbstractC58185ywX<AAActiveRes> AEQbTJ(@NotNull java.lang.String str, long j) {
        Intrinsics.checkNotNullParameter(str, "");
        AbstractC58185ywX abstractC58185ywXUnwrapResponseData$default = C43423rox.unwrapResponseData$default(this.gEmmrt.KWHzl(C56402yEa.EZpvd(new AAGenerateReq(str, j))), (Function1) null, 1, (java.lang.Object) null);
        final Function1 function1 = new Function1() { // from class: o.cym
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C13062cyk.copydefault((java.util.List) obj);
            }
        };
        AbstractC58185ywX<AAActiveRes> abstractC58185ywXAEQbTJ = abstractC58185ywXUnwrapResponseData$default.AEQbTJ(new InterfaceC58229yxO() { // from class: o.cyr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C13062cyk.AEQbTJ(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        return abstractC58185ywXAEQbTJ;
    }

    public static final AAActiveRes AEQbTJ(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (AAActiveRes) function1.invoke(obj);
    }

    public static final AAActiveRes copydefault(java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        AAActiveRes aAActiveRes = (AAActiveRes) CollectionsKt___CollectionsKt.firstOrNull(list);
        return aAActiveRes == null ? new AAActiveRes((java.lang.String) null, (java.lang.Long) null, (java.lang.Boolean) null, (java.lang.String) null, (java.lang.String) null, 31, (DefaultConstructorMarker) null) : aAActiveRes;
    }

    public final java.lang.Object OLrzqt(java.util.List<WalletEntity> list, WalletMustSyncOperation walletMustSyncOperation, Continuation<? super Unit> continuation) {
        java.lang.String strValueOf;
        for (WalletEntity walletEntity : list) {
            if (!Companion.AEQbTJ(walletEntity, walletMustSyncOperation)) {
                java.lang.String completedSyncOperation = walletEntity.getCompletedSyncOperation();
                if (completedSyncOperation == null || completedSyncOperation.length() == 0) {
                    strValueOf = java.lang.String.valueOf(walletMustSyncOperation.getValue());
                } else {
                    strValueOf = walletEntity.getCompletedSyncOperation() + "," + walletMustSyncOperation.getValue();
                }
                walletEntity.setCompletedSyncOperation(strValueOf);
            }
        }
        java.lang.Object objDjBIcL = this.isConnected.djBIcL(list, (Continuation<? super java.lang.Integer>) continuation);
        return objDjBIcL == C56442yFn.copydefault() ? objDjBIcL : Unit.INSTANCE;
    }

    public final java.lang.Object copydefault(java.util.List<WalletEntity> list, Continuation<? super Unit> continuation) {
        for (WalletEntity walletEntity : list) {
            walletEntity.setSyncStatus(WalletSyncStatus.NotSync.getValue());
            SPUtils.commit("has_supple_create_data_" + walletEntity.getId(), C56443yFo.KWHzl(false), "wallet_biz_sp_file");
        }
        java.lang.Object objDjBIcL = this.isConnected.djBIcL(list, (Continuation<? super java.lang.Integer>) continuation);
        return objDjBIcL == C56442yFn.copydefault() ? objDjBIcL : Unit.INSTANCE;
    }

    public final java.lang.Object djBIcL(java.util.List<WalletEntity> list, Continuation<? super java.lang.Integer> continuation) {
        cQM cqm = this.isConnected;
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((WalletEntity) it.next()).getId());
        }
        return cqm.EZpvd(list, arrayList, continuation);
    }
}
