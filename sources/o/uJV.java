package o;

import androidx.core.os.BundleKt;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.Observer;
import androidx.lifecycle.TradeLiveData;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.SimpleItemAnimator;
import com.google.common.base.Ascii;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.tradingbot.impl.botList.domain.model.BacktestFilter;
import com.okinc.tradingbot.impl.botList.ui.backtest.BacktestListFragment$observeState$1;
import com.okinc.tradingbot.impl.botList.ui.backtest.BacktestListViewModel;
import com.okinc.tradingbot.impl.market_place.home.presenter.MarketPlaceHomeHeaderPresenter;
import com.okinc.tradingbot.impl.strategy.view.helper.BotOperatorButtonDisposer;
import com.okinc.uilab.stateful.StatefulView;
import com.okinc.unify_trade.bot.data.TacticsData;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.C48033uCm;
import o.C55688xof;
import o.InterfaceC52662wTs;
import o.uLU;
import org.jetbrains.annotations.NotNull;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: loaded from: classes16.dex */
public final class uJV extends AbstractC48255uKs implements InterfaceC52662wTs {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int EZpvd = 8;
    public final InterfaceC56387yDm AEQbTJ;
    public C48370uOz KWHzl;
    public final InterfaceC56387yDm OLrzqt;
    public TacticsData copydefault;
    public final InterfaceC56387yDm djBIcL;
    public final int gEmmrt = C48033uCm.Activity.QSLkRj;
    public final InterfaceC56387yDm valueOf;

    public static final /* synthetic */ class StateListAnimator implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.copydefault = function1;
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
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(java.lang.Object obj) {
            this.copydefault.invoke(obj);
        }
    }

    @Override // o.InterfaceC52662wTs
    public void fARcdN() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return this.gEmmrt;
    }

    @Override // o.InterfaceC52662wTs
    public void DbNXlk() {
        InterfaceC52662wTs.TaskDescription.AEQbTJ(this);
    }

    public uJV() {
        final Function0<androidx.fragment.app.Fragment> function0 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.tradingbot.impl.botList.ui.backtest.BacktestListFragment$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.tradingbot.impl.botList.ui.backtest.BacktestListFragment$special$$inlined$viewModels$default$2
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
        this.valueOf = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(BacktestListViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.tradingbot.impl.botList.ui.backtest.BacktestListFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.tradingbot.impl.botList.ui.backtest.BacktestListFragment$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.tradingbot.impl.botList.ui.backtest.BacktestListFragment$special$$inlined$viewModels$default$5
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
        this.djBIcL = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(MarketPlaceHomeHeaderPresenter.class), new Function0<ViewModelStore>() { // from class: com.okinc.tradingbot.impl.botList.ui.backtest.BacktestListFragment$special$$inlined$activityViewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.tradingbot.impl.botList.ui.backtest.BacktestListFragment$special$$inlined$activityViewModels$default$2
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
                CreationExtras defaultViewModelCreationExtras = this.requireActivity().getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "");
                return defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.tradingbot.impl.botList.ui.backtest.BacktestListFragment$special$$inlined$activityViewModels$default$3
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
        this.OLrzqt = C56392yDr.copydefault(new Function0() { // from class: o.uJW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return uJV.gEmmrt(this.OLrzqt);
            }
        });
        this.AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.uJZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return uJV.EZpvd(this.KWHzl);
            }
        });
    }

    public final BacktestListViewModel KWHzl() {
        return (BacktestListViewModel) this.valueOf.getValue();
    }

    private final MarketPlaceHomeHeaderPresenter values() {
        return (MarketPlaceHomeHeaderPresenter) this.djBIcL.getValue();
    }

    private final BotOperatorButtonDisposer AkhnZx() {
        return (BotOperatorButtonDisposer) this.OLrzqt.getValue();
    }

    public static final BotOperatorButtonDisposer gEmmrt(uJV ujv) {
        return new BotOperatorButtonDisposer(ujv, false);
    }

    public final uJS AEQbTJ() {
        return (uJS) this.AEQbTJ.getValue();
    }

    public static final class Application implements uJM {
        public Application() {
        }

        @Override // o.uJM
        public void OLrzqt(uJO ujo) {
            Intrinsics.checkNotNullParameter(ujo, "");
            uJV.this.copydefault(ujo);
        }

        @Override // o.uJM
        public void copydefault(uJO ujo) {
            Intrinsics.checkNotNullParameter(ujo, "");
            uJV.this.EZpvd(ujo);
        }

        @Override // o.uJM
        public void AEQbTJ(java.lang.String str, java.lang.String str2, Function0<Unit> function0) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            TacticsData tacticsDataCopydefault = uJV.this.KWHzl().copydefault(str2);
            if (tacticsDataCopydefault == null) {
                return;
            }
            uJV.this.copydefault(str, tacticsDataCopydefault, function0);
        }

        @Override // o.uJM
        public void AEQbTJ(java.lang.String str, java.lang.String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            TacticsData tacticsDataCopydefault = uJV.this.KWHzl().copydefault(str2);
            if (tacticsDataCopydefault == null) {
                return;
            }
            uJV.this.AEQbTJ(str, tacticsDataCopydefault);
        }
    }

    public static final uJS EZpvd(final uJV ujv) {
        return new uJS(ujv.new Application(), false, new Function1() { // from class: o.uJR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return uJV.copydefault(this.EZpvd, (java.lang.String) obj);
            }
        });
    }

    public static final TacticsData copydefault(uJV ujv, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return ujv.KWHzl().copydefault(str);
    }

    /* JADX INFO: loaded from: classes19.dex */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.uJV.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public static /* synthetic */ uJV newInstance$default(TaskDescription taskDescription, BacktestFilter backtestFilter, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                backtestFilter = BacktestFilter.ALL;
            }
            return taskDescription.KWHzl(backtestFilter);
        }

        public final uJV KWHzl(@NotNull BacktestFilter backtestFilter) {
            Intrinsics.checkNotNullParameter(backtestFilter, "");
            uJV ujv = new uJV();
            ujv.setArguments(BundleKt.bundleOf(C56390yDp.OLrzqt("filter", backtestFilter.name())));
            return ujv;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004a  */
    @Override // o.AbstractC32996moC
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        java.lang.Object objM7377constructorimpl;
        BacktestFilter backtestFilter;
        Intrinsics.checkNotNullParameter(view, "");
        this.KWHzl = C48370uOz.EZpvd(view);
        AuCTel();
        ejfBZ();
        djBIcL();
        fIwbmz();
        android.os.Bundle arguments = getArguments();
        java.lang.String string = arguments != null ? arguments.getString("filter") : null;
        if (string != null) {
            try {
                Result.Application application = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(BacktestFilter.valueOf(string));
            } catch (java.lang.Throwable th) {
                Result.Application application2 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
            backtestFilter = (BacktestFilter) (Result.m7383isFailureimpl(objM7377constructorimpl) ? null : objM7377constructorimpl);
            if (backtestFilter == null) {
                backtestFilter = BacktestFilter.ALL;
            }
        }
        KWHzl().OLrzqt(new BacktestListViewModel.StateListAnimator.Activity(backtestFilter));
    }

    @Override // o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        if (isReenter()) {
            KWHzl().OLrzqt(BacktestListViewModel.StateListAnimator.ActionBar.OLrzqt);
        }
    }

    public final void djBIcL() {
        C56111xwe<java.lang.Boolean> c56111xweValueOf = values().valueOf();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        c56111xweValueOf.observe(viewLifecycleOwner, new StateListAnimator(new Function1() { // from class: o.uJX
            private static final byte[] $$c = {38, 48, 91, -91};
            private static final int $$d = 55;
            private static int $10 = 0;
            private static int $11 = 1;
            private static final byte[] $$a = {101, Ascii.SO, 96, -49, 36, -35, -25};
            private static final int $$b = CipherSuite.TLS_DHE_RSA_WITH_AES_128_GCM_SHA256;
            private static int KWHzl = 0;
            private static int AEQbTJ = 1;
            private static long copydefault = 1124804756196556864L;

            /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0029). Please report as a decompilation issue!!! */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            private static java.lang.String $$e(byte b, byte b2, byte b3) {
                int i;
                int i2 = b2 * 2;
                byte[] bArr = $$c;
                int i3 = b3 + 4;
                int i4 = 100 - (b * 2);
                byte[] bArr2 = new byte[1 - i2];
                int i5 = 0 - i2;
                if (bArr == null) {
                    int i6 = i4;
                    i4 = i5;
                    i = 0;
                    i4 += i6;
                    bArr2[i] = (byte) i4;
                    if (i == i5) {
                        return new java.lang.String(bArr2, 0);
                    }
                    i3++;
                    i++;
                    i6 = bArr[i3];
                    i4 += i6;
                    bArr2[i] = (byte) i4;
                    if (i == i5) {
                    }
                } else {
                    i = 0;
                    bArr2[i] = (byte) i4;
                    if (i == i5) {
                    }
                }
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002b). Please report as a decompilation issue!!! */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            private static void b(int i, short s, byte b, java.lang.Object[] objArr) {
                int i2;
                int i3 = i + 4;
                int i4 = s * 3;
                int i5 = 65 - (b * 3);
                byte[] bArr = $$a;
                byte[] bArr2 = new byte[i4 + 4];
                int i6 = i4 + 3;
                if (bArr == null) {
                    int i7 = i5;
                    i2 = 0;
                    i5 = i6;
                    i5 = i5 + i7 + 16;
                    bArr2[i2] = (byte) i5;
                    i3++;
                    if (i2 == i6) {
                        objArr[0] = new java.lang.String(bArr2, 0);
                        return;
                    }
                    i2++;
                    i7 = bArr[i3];
                    i5 = i5 + i7 + 16;
                    bArr2[i2] = (byte) i5;
                    i3++;
                    if (i2 == i6) {
                    }
                } else {
                    i2 = 0;
                    bArr2[i2] = (byte) i5;
                    i3++;
                    if (i2 == i6) {
                    }
                }
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                int i = 2 % 2;
                int i2 = AEQbTJ + 7;
                KWHzl = i2 % 128;
                int i3 = i2 % 2;
                Unit unitOLrzqt = uJV.OLrzqt(this.OLrzqt, ((java.lang.Boolean) obj).booleanValue());
                if (i3 != 0) {
                    int i4 = 27 / 0;
                }
                return unitOLrzqt;
            }

            /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [77=5] */
            /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
            private static void a(char[] cArr, int i, java.lang.Object[] objArr) throws java.lang.Throwable {
                int i2 = 2 % 2;
                Zi zi = new Zi();
                zi.OLrzqt = i;
                int length = cArr.length;
                long[] jArr = new long[length];
                zi.AEQbTJ = 0;
                int i3 = $11 + 77;
                $10 = i3 % 128;
                int i4 = i3 % 2;
                while (zi.AEQbTJ < cArr.length) {
                    int i5 = $10 + 49;
                    $11 = i5 % 128;
                    int i6 = i5 % 2;
                    int i7 = zi.AEQbTJ;
                    try {
                        java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(cArr[zi.AEQbTJ]), zi, zi};
                        java.lang.Object objEZpvd = YY.EZpvd(-295504478);
                        if (objEZpvd == null) {
                            byte b = (byte) 0;
                            byte b2 = b;
                            objEZpvd = YY.EZpvd(217, 4, (char) 0, -364758818, false, $$e(b, b2, (byte) (b2 - 1)), new java.lang.Class[]{java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class});
                        }
                        jArr[i7] = ((java.lang.Long) ((java.lang.reflect.Method) objEZpvd).invoke(null, objArr2)).longValue() ^ (copydefault ^ 5439468278228498061L);
                        java.lang.Object[] objArr3 = {zi, zi};
                        java.lang.Object objEZpvd2 = YY.EZpvd(1444313200);
                        if (objEZpvd2 == null) {
                            byte b3 = (byte) ($$d & 1);
                            byte b4 = (byte) (b3 - 1);
                            objEZpvd2 = YY.EZpvd(615, 5, (char) 1207, 1379317004, false, $$e(b3, b4, (byte) (b4 - 1)), new java.lang.Class[]{java.lang.Object.class, java.lang.Object.class});
                        }
                        ((java.lang.reflect.Method) objEZpvd2).invoke(null, objArr3);
                    } catch (java.lang.Throwable th) {
                        java.lang.Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                char[] cArr2 = new char[length];
                zi.AEQbTJ = 0;
                while (zi.AEQbTJ < cArr.length) {
                    cArr2[zi.AEQbTJ] = (char) jArr[zi.AEQbTJ];
                    java.lang.Object[] objArr4 = {zi, zi};
                    java.lang.Object objEZpvd3 = YY.EZpvd(1444313200);
                    if (objEZpvd3 == null) {
                        byte b5 = (byte) ($$d & 1);
                        byte b6 = (byte) (b5 - 1);
                        objEZpvd3 = YY.EZpvd(615, 5, (char) 1207, 1379317004, false, $$e(b5, b6, (byte) (b6 - 1)), new java.lang.Class[]{java.lang.Object.class, java.lang.Object.class});
                    }
                    ((java.lang.reflect.Method) objEZpvd3).invoke(null, objArr4);
                    int i8 = $11 + 97;
                    $10 = i8 % 128;
                    int i9 = i8 % 2;
                }
                objArr[0] = new java.lang.String(cArr2);
            }

            /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
            /*  JADX ERROR: NoSuchElementException in pass: ReplaceNewArray
                java.util.NoSuchElementException
                	at java.base/java.util.TreeMap.key(TreeMap.java:1602)
                	at java.base/java.util.TreeMap.lastKey(TreeMap.java:298)
                	at jadx.core.dex.visitors.ReplaceNewArray.processNewArray(ReplaceNewArray.java:171)
                	at jadx.core.dex.visitors.ReplaceNewArray.processInsn(ReplaceNewArray.java:72)
                	at jadx.core.dex.visitors.ReplaceNewArray.visit(ReplaceNewArray.java:53)
                */
            public static java.lang.Object[] OLrzqt(int r31, int r32) {
                /*
                    r1 = r31
                    r2 = r32
                    r3 = 2
                    int r0 = r3 % r3
                    int r0 = o.uJX.AEQbTJ
                    r4 = r0 ^ 119(0x77, float:1.67E-43)
                    r0 = r0 & 119(0x77, float:1.67E-43)
                    r5 = 1
                    int r0 = r0 << r5
                    int r4 = r4 + r0
                    int r0 = r4 % 128
                    o.uJX.KWHzl = r0
                    int r4 = r4 % r3
                    r6 = -17
                    r7 = 16
                    r8 = 4
                    r9 = 3
                    r10 = 0
                    r11 = 0
                    java.lang.String[] r0 = new java.lang.String[r3]     // Catch: java.lang.Exception -> L257
                    r12 = 19
                    char[] r12 = new char[r12]     // Catch: java.lang.Exception -> L257
                    r12 = {x08d2: FILL_ARRAY_DATA , data: [-18780, 6181, -5185, -17031, 3267, -8257, -24312, 28823, -15760, -27188, 25728, 13835, -26137, 27516, 15058, -29253, 24329, 12003, -4017} // fill-array     // Catch: java.lang.Exception -> L257
                    java.lang.Object[] r13 = new java.lang.Object[r5]     // Catch: java.lang.Exception -> L257
                    r14 = 44699(0xae9b, float:6.2637E-41)
                    a(r12, r14, r13)     // Catch: java.lang.Exception -> L257
                    r12 = r13[r11]     // Catch: java.lang.Exception -> L257
                    java.lang.String r12 = (java.lang.String) r12     // Catch: java.lang.Exception -> L257
                    r0[r11] = r12     // Catch: java.lang.Exception -> L257
                    r12 = 18
                    char[] r12 = new char[r12]     // Catch: java.lang.Exception -> L257
                    r12 = {x08ea: FILL_ARRAY_DATA , data: [-18758, -6401, 5634, 17984, -2072, 10044, 22360, -31538, 13370, 25684, -27209, -15047, 30027, -23921, -11744, 631, -19560, -7364} // fill-array     // Catch: java.lang.Exception -> L257
                    java.lang.Object[] r13 = new java.lang.Object[r5]     // Catch: java.lang.Exception -> L257
                    r14 = 20563(0x5053, float:2.8815E-41)
                    a(r12, r14, r13)     // Catch: java.lang.Exception -> L257
                    r12 = r13[r11]     // Catch: java.lang.Exception -> L257
                    java.lang.String r12 = (java.lang.String) r12     // Catch: java.lang.Exception -> L257
                    r0[r5] = r12     // Catch: java.lang.Exception -> L257
                    r12 = r11
                L49:
                    if (r12 >= r3) goto L1d1
                    r13 = r0[r12]     // Catch: java.lang.Exception -> L257
                    char[] r14 = new char[r7]     // Catch: java.lang.Exception -> L257
                    r14 = {x0900: FILL_ARRAY_DATA , data: [-18772, 26120, 6143, -15170, -3058, -23053, 21163, 590, 13306, -8003, -28595, 16848, 32428, 11776, -8222, -29521} // fill-array     // Catch: java.lang.Exception -> L257
                    java.lang.Object[] r15 = new java.lang.Object[r5]     // Catch: java.lang.Exception -> L257
                    r4 = 53419(0xd0ab, float:7.4856E-41)
                    a(r14, r4, r15)     // Catch: java.lang.Exception -> L257
                    r4 = r15[r11]     // Catch: java.lang.Exception -> L257
                    java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Exception -> L257
                    java.lang.Class r4 = java.lang.Class.forName(r4)     // Catch: java.lang.Exception -> L257
                    int r14 = o.uJX.KWHzl
                    r15 = r14 & 101(0x65, float:1.42E-43)
                    r14 = r14 | 101(0x65, float:1.42E-43)
                    int r15 = r15 + r14
                    int r14 = r15 % 128
                    o.uJX.AEQbTJ = r14
                    int r15 = r15 % r3
                    if (r15 != 0) goto L7b
                    java.lang.Class[] r14 = new java.lang.Class[r5]     // Catch: java.lang.Exception -> L257
                    java.lang.reflect.Method r13 = r4.getMethod(r13, r14)     // Catch: java.lang.Exception -> L257
                L76:
                    java.lang.Object r4 = r13.invoke(r4, r10)     // Catch: java.lang.Exception -> L257
                    goto L82
                L7b:
                    java.lang.Class[] r14 = new java.lang.Class[r11]     // Catch: java.lang.Exception -> L257
                    java.lang.reflect.Method r13 = r4.getMethod(r13, r14)     // Catch: java.lang.Exception -> L257
                    goto L76
                L82:
                    java.lang.Boolean r4 = (java.lang.Boolean) r4     // Catch: java.lang.Exception -> L257
                    boolean r4 = r4.booleanValue()     // Catch: java.lang.Exception -> L257
                    if (r4 == 0) goto L1cb
                    r0 = r1 & (-2)
                    int r4 = ~r1     // Catch: java.lang.Exception -> L257
                    r12 = r4 & 1
                    r0 = r0 | r12
                    java.lang.Object[] r12 = new java.lang.Object[r8]     // Catch: java.lang.Exception -> L257
                    int[] r13 = new int[r5]     // Catch: java.lang.Exception -> L257
                    r12[r11] = r13     // Catch: java.lang.Exception -> L257
                    int r14 = o.uJX.AEQbTJ
                    r15 = r14 | 111(0x6f, float:1.56E-43)
                    int r15 = r15 << r5
                    r14 = r14 ^ 111(0x6f, float:1.56E-43)
                    int r15 = r15 - r14
                    int r14 = r15 % 128
                    o.uJX.KWHzl = r14
                    int r15 = r15 % r3
                    if (r15 == 0) goto Lb0
                    int[] r15 = new int[r5]     // Catch: java.lang.Exception -> L257
                    r12[r9] = r15     // Catch: java.lang.Exception -> L257
                    int[] r15 = new int[r5]     // Catch: java.lang.Exception -> L257
                    r12[r3] = r15     // Catch: java.lang.Exception -> L257
                    r15 = 25
                    goto Lb9
                Lb0:
                    int[] r15 = new int[r5]     // Catch: java.lang.Exception -> L257
                    r12[r3] = r15     // Catch: java.lang.Exception -> L257
                    int[] r15 = new int[r5]     // Catch: java.lang.Exception -> L257
                    r12[r9] = r15     // Catch: java.lang.Exception -> L257
                    r15 = r7
                Lb9:
                    r16 = r12[r9]     // Catch: java.lang.Exception -> L257
                    int[] r16 = (int[]) r16     // Catch: java.lang.Exception -> L257
                    r16[r11] = r1     // Catch: java.lang.Exception -> L257
                    r16 = r14 ^ 69
                    r14 = r14 & 69
                    int r14 = r14 << r5
                    int r14 = r16 + r14
                    int r7 = r14 % 128
                    o.uJX.AEQbTJ = r7
                    int r14 = r14 % r3
                    if (r14 != 0) goto Lfd
                    int[] r13 = (int[]) r13     // Catch: java.lang.Exception -> L257
                    r13[r11] = r0     // Catch: java.lang.Exception -> L257
                    r12[r5] = r10     // Catch: java.lang.Exception -> L257
                    java.util.Random r0 = new java.util.Random     // Catch: java.lang.Exception -> L257
                    r0.<init>()     // Catch: java.lang.Exception -> L257
                    r4 = 1333566(0x14593e, float:1.868724E-39)
                    int r0 = r0.nextInt(r4)     // Catch: java.lang.Exception -> L257
                    r4 = -46249345(0xfffffffffd3e4a7f, float:-1.5808758E37)
                    r4 = r4 | r0
                    int r4 = ~r4     // Catch: java.lang.Exception -> L257
                    r7 = 46243840(0x2c1a000, float:2.8450637E-37)
                    r4 = r4 | r7
                    int r7 = ~r0     // Catch: java.lang.Exception -> L257
                    r13 = 64994713(0x3dfbd99, float:1.31502915E-36)
                    r7 = r7 | r13
                    int r7 = ~r7     // Catch: java.lang.Exception -> L257
                    r4 = r4 | r7
                    int r4 = r4 * (-470)
                    r13 = 371006873(0x161d1d99, float:1.2691698E-25)
                    int r13 = r13 + r4
                    r4 = -5505(0xffffffffffffea7f, float:NaN)
                    r0 = r0 | r4
                    int r0 = ~r0     // Catch: java.lang.Exception -> L257
                    r0 = r0 | r7
                    int r0 = r0 * 470
                    goto L123
                Lfd:
                    int[] r13 = (int[]) r13     // Catch: java.lang.Exception -> L257
                    r13[r11] = r0     // Catch: java.lang.Exception -> L257
                    r12[r5] = r10     // Catch: java.lang.Exception -> L257
                    r0 = -868800552(0xffffffffcc3727d8, float:-4.8013152E7)
                    r4 = r4 | r0
                    int r4 = ~r4     // Catch: java.lang.Exception -> L257
                    r7 = -757561998(0xffffffffd2d88572, float:-4.64975888E11)
                    r4 = r4 | r7
                    int r4 = r4 * (-235)
                    r13 = -1450915662(0xffffffffa984c8b2, float:-5.8967927E-14)
                    int r13 = r13 + r4
                    r0 = r0 | r1
                    int r0 = ~r0     // Catch: java.lang.Exception -> L257
                    r0 = r0 | r7
                    int r0 = r0 * (-470)
                    int r13 = r13 + r0
                    r0 = -553670662(0xffffffffdeffa7fa, float:-9.2109838E18)
                    r0 = r0 | r1
                    int r0 = ~r0     // Catch: java.lang.Exception -> L257
                    r4 = -1072691888(0xffffffffc0100550, float:-2.2503242)
                    r0 = r0 | r4
                    int r0 = r0 * 235
                L123:
                    int r13 = r13 + r0
                    int r13 = r13 + r15
                    int r0 = o.C9566bXx.OLrzqt()     // Catch: java.lang.Exception -> L257
                    int r4 = r13 * 567
                    int r7 = r2 * (-565)
                    int r7 = -r7
                    int r7 = -r7
                    r14 = r4 & r7
                    r4 = r4 | r7
                    int r14 = r14 + r4
                    int r4 = o.uJX.KWHzl
                    r7 = r4 ^ 99
                    r15 = r4 & 99
                    int r15 = r15 << r5
                    int r7 = r7 + r15
                    int r15 = r7 % 128
                    o.uJX.AEQbTJ = r15
                    int r7 = r7 % r3
                    if (r7 != 0) goto L15e
                    int r7 = ~r13
                    r15 = r7 ^ r2
                    r17 = r7 & r2
                    r15 = r15 | r17
                    int r15 = ~r15
                    r17 = r7 ^ r0
                    r7 = r7 & r0
                    r7 = r17 | r7
                    int r7 = ~r7
                    r17 = r15 ^ r7
                    r7 = r7 & r15
                    r7 = r17 | r7
                    r15 = r7 ^ (-566(0xfffffffffffffdca, float:NaN))
                    r7 = r7 & (-566(0xfffffffffffffdca, float:NaN))
                    int r7 = r7 << r5
                    int r15 = r15 + r7
                    int r7 = r14 << r15
                    goto L174
                L15e:
                    int r7 = ~r13
                    r15 = r7 ^ r2
                    r7 = r7 & r2
                    r7 = r7 | r15
                    int r7 = ~r7
                    int r15 = ~r13
                    r17 = r15 ^ r0
                    r15 = r15 & r0
                    r15 = r17 | r15
                    int r15 = ~r15
                    r7 = r7 | r15
                    int r7 = r7 * (-566)
                    int r7 = -r7
                    int r7 = -r7
                    int r7 = ~r7
                    int r14 = r14 - r7
                    int r7 = r14 + (-1)
                L174:
                    int r14 = ~r2
                    r15 = r14 ^ r13
                    r14 = r14 & r13
                    r14 = r14 | r15
                    int r14 = ~r14
                    r15 = 566(0x236, float:7.93E-43)
                    int r15 = r15 * r14
                    int r14 = -r15
                    int r14 = -r14
                    int r14 = ~r14
                    int r7 = r7 - r14
                    int r7 = r7 - r5
                    int r13 = ~r13
                    int r14 = ~r2
                    r15 = r13 ^ r14
                    r13 = r13 & r14
                    r13 = r13 | r15
                    r14 = r13 ^ r0
                    r0 = r0 & r13
                    r0 = r0 | r14
                    int r0 = ~r0
                    int r0 = r0 * 566
                    int r7 = r7 + r0
                    int r4 = r4 + 111
                    int r0 = r4 % 128
                    o.uJX.AEQbTJ = r0
                    int r4 = r4 % r3
                    if (r4 != 0) goto L1b6
                    int r0 = r7 + 13
                    r4 = r7 & r0
                    int r4 = ~r4
                    r0 = r0 | r7
                    r0 = r0 & r4
                    int r4 = r0 % 51
                    r7 = r0 & r4
                    int r7 = ~r7     // Catch: java.lang.Exception -> L257
                    r0 = r0 | r4
                    r0 = r0 & r7
                    int r4 = r0 * 5
                    r7 = r0 & r4
                    int r7 = ~r7     // Catch: java.lang.Exception -> L257
                    r0 = r0 | r4
                    r0 = r0 & r7
                    r4 = r12[r8]     // Catch: java.lang.Exception -> L257
                    int[] r4 = (int[]) r4     // Catch: java.lang.Exception -> L257
                    r4[r11] = r0     // Catch: java.lang.Exception -> L257
                    goto L331
                L1b6:
                    int r0 = r7 << 13
                    r0 = r0 ^ r7
                    int r4 = r0 >>> 17
                    int r7 = ~r4     // Catch: java.lang.Exception -> L257
                    r7 = r7 & r0
                    int r0 = ~r0     // Catch: java.lang.Exception -> L257
                    r0 = r0 & r4
                    r0 = r0 | r7
                    int r4 = r0 << 5
                    r0 = r0 ^ r4
                    r4 = r12[r3]     // Catch: java.lang.Exception -> L257
                    int[] r4 = (int[]) r4     // Catch: java.lang.Exception -> L257
                    r4[r11] = r0     // Catch: java.lang.Exception -> L257
                    goto L331
                L1cb:
                    int r12 = r12 + 1
                    r7 = 16
                    goto L49
                L1d1:
                    java.lang.Object[] r12 = new java.lang.Object[r8]     // Catch: java.lang.Exception -> L257
                    int[] r0 = new int[r5]     // Catch: java.lang.Exception -> L257
                    r12[r11] = r0     // Catch: java.lang.Exception -> L257
                    int[] r4 = new int[r5]     // Catch: java.lang.Exception -> L257
                    r12[r3] = r4     // Catch: java.lang.Exception -> L257
                    int[] r7 = new int[r5]     // Catch: java.lang.Exception -> L257
                    r12[r9] = r7     // Catch: java.lang.Exception -> L257
                    int r13 = o.uJX.KWHzl
                    int r14 = r13 + 41
                    int r15 = r14 % 128
                    o.uJX.AEQbTJ = r15
                    int r14 = r14 % r3
                    int[] r7 = (int[]) r7     // Catch: java.lang.Exception -> L257
                    r7[r11] = r1     // Catch: java.lang.Exception -> L257
                    r7 = r13 | 123(0x7b, float:1.72E-43)
                    int r7 = r7 << r5
                    r14 = r13 ^ 123(0x7b, float:1.72E-43)
                    int r7 = r7 - r14
                    int r14 = r7 % 128
                    o.uJX.AEQbTJ = r14
                    int r7 = r7 % r3
                    int[] r0 = (int[]) r0     // Catch: java.lang.Exception -> L257
                    r0[r11] = r1     // Catch: java.lang.Exception -> L257
                    r12[r5] = r10     // Catch: java.lang.Exception -> L257
                    int r0 = r13 + 61
                    int r7 = r0 % 128
                    o.uJX.AEQbTJ = r7
                    int r0 = r0 % r3
                    if (r0 != 0) goto L208
                    r0 = r11
                    goto L231
                L208:
                    r0 = 511137517(0x1e7756ed, float:1.3094047E-20)
                    r0 = r0 | r1
                    int r0 = ~r0
                    r7 = 25209106(0x180a912, float:4.726238E-38)
                    r0 = r0 | r7
                    r7 = -399898964(0xffffffffe82a06ac, float:-3.2117015E24)
                    r7 = r7 | r1
                    int r7 = ~r7
                    r0 = r0 | r7
                    int r0 = r0 * (-744)
                    r7 = -1045866255(0xffffffffc1a958f1, float:-21.168428)
                    int r7 = r7 + r0
                    int r0 = ~r1
                    r14 = 136447660(0x82206ac, float:4.8757944E-34)
                    r0 = r0 | r14
                    int r0 = r0 * 744
                    int r7 = r7 + r0
                    r0 = -25209107(0xfffffffffe7f56ed, float:-8.485112E37)
                    r0 = r0 | r1
                    int r0 = r0 * 744
                    int r7 = r7 + r0
                    r0 = r2 | r7
                    int r0 = r0 << r5
                    r7 = r7 ^ r2
                    int r0 = r0 - r7
                L231:
                    int r7 = r0 << 13
                    int r14 = ~r7
                    r14 = r14 & r0
                    int r0 = ~r0
                    r0 = r0 & r7
                    r0 = r0 | r14
                    int r7 = r0 >>> 17
                    r14 = r0 & r7
                    int r14 = ~r14
                    r0 = r0 | r7
                    r0 = r0 & r14
                    int r7 = r0 << 5
                    int r14 = ~r7
                    r14 = r14 & r0
                    int r0 = ~r0
                    r0 = r0 & r7
                    r0 = r0 | r14
                    int[] r4 = (int[]) r4     // Catch: java.lang.Exception -> L257
                    r4[r11] = r0     // Catch: java.lang.Exception -> L257
                    r0 = r13 | 95
                    int r0 = r0 << r5
                    r4 = r13 ^ 95
                    int r0 = r0 - r4
                    int r4 = r0 % 128
                    o.uJX.AEQbTJ = r4
                    int r0 = r0 % r3
                    goto L331
                L257:
                    r0 = r1 & (-3)
                    int r4 = ~r1
                    r7 = r4 & 2
                    r0 = r0 | r7
                    java.lang.Object[] r12 = new java.lang.Object[r8]
                    int[] r7 = new int[r5]
                    r12[r11] = r7
                    int[] r13 = new int[r5]
                    r12[r3] = r13
                    int[] r13 = new int[r5]
                    r12[r9] = r13
                    int[] r13 = (int[]) r13
                    r13[r11] = r1
                    int[] r7 = (int[]) r7
                    r7[r11] = r0
                    r12[r5] = r10
                    r0 = -67578797(0xfffffffffbf8d453, float:-2.5839921E36)
                    r7 = r0 | r1
                    int r7 = ~r7
                    r13 = 139692(0x221ac, float:1.9575E-40)
                    r7 = r7 | r13
                    int r7 = r7 * 336
                    r13 = -1396969167(0xffffffffacbbf131, float:-5.3416373E-12)
                    int r13 = r13 + r7
                    r7 = 43659757(0x29a31ed, float:2.2656922E-37)
                    r14 = r1 | r7
                    int r14 = ~r14
                    r15 = -111098862(0xfffffffff960c412, float:-7.2940705E34)
                    r14 = r14 | r15
                    int r14 = r14 * (-168)
                    int r13 = r13 + r14
                    r4 = r4 | r7
                    int r4 = ~r4
                    r0 = r0 | r4
                    int r0 = r0 * 168
                    int r13 = r13 + r0
                    int r0 = r13 * (-751)
                    int r0 = ~r0
                    int r0 = (-12017) - r0
                    int r4 = ~r13
                    r7 = r6 ^ r4
                    r4 = r4 & r6
                    r4 = r4 | r7
                    int r4 = ~r4
                    r7 = r6 | r1
                    int r7 = ~r7
                    r4 = r4 | r7
                    int r4 = r4 * 1504
                    int r4 = ~r4
                    int r0 = r0 - r4
                    int r0 = r0 - r5
                    r4 = r6 ^ r13
                    r7 = r6 & r13
                    r4 = r4 | r7
                    r4 = r4 | r1
                    int r4 = ~r4
                    int r4 = r4 * (-1504)
                    r7 = r0 & r4
                    r0 = r0 | r4
                    int r7 = r7 + r0
                    r0 = r6 ^ r13
                    r4 = r6 & r13
                    r0 = r0 | r4
                    int r0 = ~r0
                    int r4 = ~r13
                    r13 = r4 ^ 16
                    r14 = 16
                    r4 = r4 & r14
                    r4 = r4 | r13
                    int r4 = ~r4
                    r13 = r0 ^ r4
                    r0 = r0 & r4
                    r0 = r0 | r13
                    int r0 = r0 * 752
                    int r7 = r7 + r0
                    int r0 = o.C9566bXx.OLrzqt()
                    int r4 = r7 * (-209)
                    int r13 = r2 * (-209)
                    int r4 = r4 + r13
                    int r13 = ~r7
                    int r14 = ~r2
                    r15 = r13 ^ r14
                    r17 = r13 & r14
                    r15 = r15 | r17
                    int r15 = ~r15
                    int r15 = r15 * 210
                    int r15 = ~r15
                    int r4 = r4 - r15
                    int r4 = r4 - r5
                    int r15 = ~r2
                    int r6 = ~r0
                    r18 = r15 ^ r6
                    r6 = r6 & r15
                    r6 = r18 | r6
                    int r6 = ~r6
                    int r15 = ~r7
                    r18 = r15 ^ r0
                    r15 = r15 & r0
                    r15 = r18 | r15
                    int r15 = ~r15
                    r18 = r6 ^ r15
                    r6 = r6 & r15
                    r6 = r18 | r6
                    int r6 = r6 * 210
                    int r4 = r4 + r6
                    int r6 = ~r0
                    r15 = r13 ^ r6
                    r6 = r6 & r13
                    r6 = r6 | r15
                    r13 = r6 ^ r2
                    r6 = r6 & r2
                    r6 = r6 | r13
                    int r6 = ~r6
                    r13 = r14 ^ r7
                    r7 = r7 & r14
                    r7 = r7 | r13
                    r13 = r7 ^ r0
                    r0 = r0 & r7
                    r0 = r0 | r13
                    int r0 = ~r0
                    r7 = r6 ^ r0
                    r0 = r0 & r6
                    r0 = r0 | r7
                    int r0 = r0 * 210
                    int r4 = r4 + r0
                    int r0 = r4 << 13
                    r6 = r4 & r0
                    int r6 = ~r6
                    r0 = r0 | r4
                    r0 = r0 & r6
                    int r4 = r0 >>> 17
                    r6 = r0 & r4
                    int r6 = ~r6
                    r0 = r0 | r4
                    r0 = r0 & r6
                    int r4 = r0 << 5
                    r6 = r0 & r4
                    int r6 = ~r6
                    r0 = r0 | r4
                    r0 = r0 & r6
                    r4 = r12[r3]
                    int[] r4 = (int[]) r4
                    r4[r11] = r0
                L331:
                    r0 = r12[r11]
                    int[] r0 = (int[]) r0
                    r0 = r0[r11]
                    if (r1 == r0) goto L34d
                    int r0 = o.uJX.KWHzl
                    r1 = r0 ^ 3
                    r0 = r0 & r9
                    int r0 = r0 << r5
                    int r1 = r1 + r0
                    int r0 = r1 % 128
                    o.uJX.AEQbTJ = r0
                    int r1 = r1 % r3
                    if (r1 == 0) goto L349
                    goto L8c2
                L349:
                    r10.hashCode()
                    throw r10
                L34d:
                    r0 = 914885467(0x36880b5b, float:4.054438E-6)
                    java.lang.Object r0 = o.YY.EZpvd(r0)     // Catch: java.lang.Throwable -> L8c8
                    r4 = -1
                    if (r0 != 0) goto L37a
                    r18 = 590(0x24e, float:8.27E-43)
                    r19 = 5
                    r20 = 0
                    r21 = 849921575(0x32a8c627, float:1.9647883E-8)
                    r22 = 0
                    byte r0 = (byte) r4     // Catch: java.lang.Throwable -> L8c8
                    int r6 = r0 + 1
                    byte r6 = (byte) r6     // Catch: java.lang.Throwable -> L8c8
                    byte r7 = (byte) r6     // Catch: java.lang.Throwable -> L8c8
                    java.lang.Object[] r12 = new java.lang.Object[r5]     // Catch: java.lang.Throwable -> L8c8
                    b(r0, r6, r7, r12)     // Catch: java.lang.Throwable -> L8c8
                    r0 = r12[r11]     // Catch: java.lang.Throwable -> L8c8
                    r23 = r0
                    java.lang.String r23 = (java.lang.String) r23     // Catch: java.lang.Throwable -> L8c8
                    java.lang.Class[] r0 = new java.lang.Class[r11]     // Catch: java.lang.Throwable -> L8c8
                    r24 = r0
                    java.lang.Object r0 = o.YY.EZpvd(r18, r19, r20, r21, r22, r23, r24)     // Catch: java.lang.Throwable -> L8c8
                L37a:
                    java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0     // Catch: java.lang.Throwable -> L8c8
                    java.lang.Object r0 = r0.invoke(r10, r10)     // Catch: java.lang.Throwable -> L8c8
                    java.lang.Long r0 = (java.lang.Long) r0     // Catch: java.lang.Throwable -> L8c8
                    long r6 = r0.longValue()     // Catch: java.lang.Throwable -> L8c8
                    r0 = -1570028317(0xffffffffa26b44e3, float:-3.1884907E-18)
                    long r12 = (long) r0
                    r0 = 141(0x8d, float:1.98E-43)
                    long r14 = (long) r0
                    long r14 = r14 * r12
                    r0 = -139(0xffffffffffffff75, float:NaN)
                    long r9 = (long) r0
                    long r9 = r9 * r6
                    long r14 = r14 + r9
                    r0 = -280(0xfffffffffffffee8, float:NaN)
                    long r9 = (long) r0
                    r21 = r9
                    long r8 = (long) r4
                    long r23 = r12 ^ r8
                    long r25 = r23 | r6
                    long r25 = r25 ^ r8
                    long r4 = (long) r1
                    long r27 = r23 | r4
                    long r27 = r27 ^ r8
                    long r25 = r25 | r27
                    long r21 = r21 * r25
                    long r14 = r14 + r21
                    r0 = 140(0x8c, float:1.96E-43)
                    long r10 = (long) r0
                    long r25 = r6 ^ r8
                    long r29 = r25 | r4
                    long r29 = r29 ^ r8
                    long r27 = r27 | r29
                    long r27 = r27 * r10
                    long r14 = r14 + r27
                    long r27 = r23 | r25
                    long r27 = r27 | r4
                    long r27 = r27 ^ r8
                    long r4 = r4 ^ r8
                    long r23 = r23 | r4
                    long r6 = r23 | r6
                    long r6 = r6 ^ r8
                    long r6 = r27 | r6
                    long r4 = r25 | r4
                    long r4 = r4 | r12
                    long r4 = r4 ^ r8
                    long r4 = r4 | r6
                    long r10 = r10 * r4
                    long r14 = r14 + r10
                    r0 = 1580833232(0x5e3999d0, float:3.34348732E18)
                    long r4 = (long) r0
                    long r14 = r14 + r4
                    int r0 = o.uJX.AEQbTJ
                    int r0 = r0 + 47
                    int r4 = r0 % 128
                    o.uJX.KWHzl = r4
                    int r0 = r0 % r3
                    r0 = 32
                    long r4 = r14 >> r0
                    int r0 = (int) r4
                    int r4 = ~r1
                    r5 = 957637580(0x391463cc, float:1.4151557E-4)
                    r6 = r5 | r4
                    int r6 = ~r6
                    r7 = 1900103304(0x71414688, float:9.57054E29)
                    r8 = r7 | r1
                    int r8 = ~r8
                    r6 = r6 | r8
                    int r6 = r6 * 217
                    r8 = 445665621(0x1a905155, float:5.96884E-23)
                    int r8 = r8 + r6
                    r5 = r5 | r1
                    int r5 = ~r5
                    r6 = -2035640269(0xffffffff86aa9833, float:-6.417053E-35)
                    r5 = r5 | r6
                    int r5 = r5 * 217
                    int r8 = r8 + r5
                    r5 = r7 | r4
                    int r5 = ~r5
                    r6 = -957637581(0xffffffffc6eb9c33, float:-30158.1)
                    r5 = r5 | r6
                    int r5 = r5 * 217
                    int r8 = r8 + r5
                    r0 = r0 & r8
                    int r5 = (int) r14
                    long r6 = android.os.Process.getStartElapsedRealtime()
                    int r6 = (int) r6
                    int r7 = ~r6
                    r8 = -1347473900(0xffffffffafaf2e14, float:-3.1865055E-10)
                    r7 = r7 | r8
                    int r7 = ~r7
                    r9 = 5243265(0x500181, float:7.347379E-39)
                    r7 = r7 | r9
                    int r7 = r7 * (-245)
                    r9 = 1628140234(0x610b72ca, float:1.6077305E20)
                    int r9 = r9 + r7
                    r6 = r6 | r8
                    int r6 = ~r6
                    int r7 = r6 * (-245)
                    int r9 = r9 + r7
                    r7 = 1510266986(0x5a04d86a, float:9.3481617E15)
                    r6 = r6 | r7
                    int r6 = r6 * 245
                    int r9 = r9 + r6
                    r5 = r5 & r9
                    r6 = r0 ^ r5
                    r0 = r0 & r5
                    r0 = r0 | r6
                    long r5 = (long) r0
                    int r0 = (int) r5
                    r5 = 1
                    if (r0 != r5) goto L50e
                    r0 = r1 ^ 10
                    r6 = 4
                    java.lang.Object[] r7 = new java.lang.Object[r6]
                    int[] r6 = new int[r5]
                    r8 = 0
                    r7[r8] = r6
                    int[] r9 = new int[r5]
                    r7[r3] = r9
                    int[] r9 = new int[r5]
                    r10 = 3
                    r7[r10] = r9
                    int[] r9 = (int[]) r9
                    r9[r8] = r1
                    int[] r6 = (int[]) r6
                    r6[r8] = r0
                    r6 = 0
                    r7[r5] = r6
                    int r0 = android.os.Process.myTid()
                    int r0 = ~r0
                    r5 = 119075454(0x718f27e, float:1.1506471E-34)
                    r0 = r0 | r5
                    int r0 = ~r0
                    r5 = 1085540(0x109064, float:1.521166E-39)
                    r5 = r5 | r0
                    int r5 = r5 * (-374)
                    r6 = -661324363(0xffffffffd894fdb5, float:-1.31053907E15)
                    int r5 = r5 + r6
                    r6 = 117989914(0x708621a, float:1.0260332E-34)
                    r0 = r0 | r6
                    int r0 = r0 * 374
                    int r5 = r5 + r0
                    int r0 = o.uJX.AEQbTJ
                    r6 = r0 | 23
                    r8 = 1
                    int r6 = r6 << r8
                    r8 = r0 ^ 23
                    int r6 = r6 - r8
                    int r8 = r6 % 128
                    o.uJX.KWHzl = r8
                    int r6 = r6 % r3
                    r6 = r5 & 16
                    r8 = 16
                    r5 = r5 | r8
                    int r6 = r6 + r5
                    int r5 = r6 * 829
                    int r8 = r2 * 829
                    int r8 = -r8
                    int r8 = -r8
                    int r8 = ~r8
                    int r5 = r5 - r8
                    r8 = 1
                    int r5 = r5 - r8
                    int r8 = ~r6
                    int r9 = ~r2
                    r8 = r8 | r9
                    int r8 = ~r8
                    int r9 = ~r1
                    r11 = r9 ^ r6
                    r9 = r9 & r6
                    r9 = r9 | r11
                    r11 = r9 ^ r2
                    r9 = r9 & r2
                    r9 = r9 | r11
                    int r9 = ~r9
                    r8 = r8 | r9
                    int r8 = r8 * (-828)
                    r9 = r5 | r8
                    r10 = 1
                    int r9 = r9 << r10
                    r5 = r5 ^ r8
                    int r9 = r9 - r5
                    r5 = r0 | 27
                    int r5 = r5 << r10
                    r0 = r0 ^ 27
                    int r5 = r5 - r0
                    int r0 = r5 % 128
                    o.uJX.KWHzl = r0
                    int r5 = r5 % r3
                    if (r5 == 0) goto L4d6
                    r0 = r6 ^ r2
                    r5 = r6 & r2
                    r0 = r0 | r5
                    r5 = r0 ^ r4
                    r6 = r0 & r4
                    r5 = r5 | r6
                    int r5 = r5 * (-828)
                    int r5 = -r5
                    int r5 = -r5
                    r6 = r9 & r5
                    r5 = r5 | r9
                    int r6 = r6 + r5
                    r5 = 828(0x33c, float:1.16E-42)
                    int r0 = ~r0
                    int r0 = r5 >> r0
                    int r0 = r6 >>> r0
                    r5 = r0 ^ (-126(0xffffffffffffff82, float:NaN))
                    r6 = r0 & (-126(0xffffffffffffff82, float:NaN))
                    r8 = 1
                    int r6 = r6 << r8
                    int r5 = r5 + r6
                    int r6 = ~r5
                    r6 = r6 & r0
                    int r0 = ~r0
                    r0 = r0 & r5
                    r0 = r0 | r6
                    goto L4f7
                L4d6:
                    r0 = r6 | r2
                    r5 = r0 ^ r4
                    r0 = r0 & r4
                    r0 = r0 | r5
                    int r0 = r0 * (-828)
                    int r0 = ~r0
                    int r9 = r9 - r0
                    r5 = 1
                    int r9 = r9 - r5
                    r0 = r6 ^ r2
                    r6 = r6 & r2
                    r0 = r0 | r6
                    int r0 = ~r0
                    int r0 = r0 * 828
                    int r0 = -r0
                    int r0 = -r0
                    r6 = r9 | r0
                    int r6 = r6 << r5
                    r0 = r0 ^ r9
                    int r6 = r6 - r0
                    int r0 = r6 << 13
                    r5 = r6 & r0
                    int r5 = ~r5
                    r0 = r0 | r6
                    r0 = r0 & r5
                L4f7:
                    int r5 = r0 >>> 17
                    int r6 = ~r5
                    r6 = r6 & r0
                    int r0 = ~r0
                    r0 = r0 & r5
                    r0 = r0 | r6
                    int r5 = r0 << 5
                    int r6 = ~r5
                    r6 = r6 & r0
                    int r0 = ~r0
                    r0 = r0 & r5
                    r0 = r0 | r6
                    r5 = r7[r3]
                    int[] r5 = (int[]) r5
                    r6 = 0
                    r5[r6] = r0
                    r12 = r7
                    goto L56c
                L50e:
                    r5 = 4
                    r6 = 0
                    java.lang.Object[] r0 = new java.lang.Object[r5]
                    r5 = 1
                    int[] r7 = new int[r5]
                    r0[r6] = r7
                    int[] r8 = new int[r5]
                    r0[r3] = r8
                    int[] r9 = new int[r5]
                    r10 = 3
                    r0[r10] = r9
                    int[] r9 = (int[]) r9
                    r9[r6] = r1
                    int[] r7 = (int[]) r7
                    r7[r6] = r1
                    r6 = 0
                    r0[r5] = r6
                    r5 = -4927086(0xffffffffffb4d192, float:NaN)
                    r5 = r5 | r4
                    int r5 = ~r5
                    r6 = 4721669(0x480c05, float:6.616468E-39)
                    r5 = r5 | r6
                    int r5 = r5 * 184
                    r6 = -694986367(0xffffffffd6935981, float:-8.1006313E13)
                    int r6 = r6 + r5
                    r5 = -116371056(0xfffffffff9105190, float:-4.6834064E34)
                    r5 = r5 | r1
                    int r5 = r5 * (-184)
                    int r6 = r6 + r5
                    r5 = -116165640(0xfffffffff91373f8, float:-4.7851235E34)
                    r5 = r5 | r4
                    int r5 = ~r5
                    int r5 = r5 * 184
                    int r6 = r6 + r5
                    int r5 = -r6
                    int r5 = -r5
                    r6 = r2 | r5
                    r7 = 1
                    int r6 = r6 << r7
                    r5 = r5 ^ r2
                    int r6 = r6 - r5
                    int r5 = r6 << 13
                    r7 = r6 & r5
                    int r7 = ~r7
                    r5 = r5 | r6
                    r5 = r5 & r7
                    int r6 = r5 >>> 17
                    r7 = r5 & r6
                    int r7 = ~r7
                    r5 = r5 | r6
                    r5 = r5 & r7
                    int r6 = r5 << 5
                    int r7 = ~r6
                    r7 = r7 & r5
                    int r5 = ~r5
                    r5 = r5 & r6
                    r5 = r5 | r7
                    int[] r8 = (int[]) r8
                    r6 = 0
                    r8[r6] = r5
                    r12 = r0
                L56c:
                    r0 = r12[r6]
                    int[] r0 = (int[]) r0
                    int r5 = o.uJX.KWHzl
                    r6 = r5 | 25
                    r7 = 1
                    int r6 = r6 << r7
                    r7 = r5 ^ 25
                    int r6 = r6 - r7
                    int r7 = r6 % 128
                    o.uJX.AEQbTJ = r7
                    int r6 = r6 % r3
                    if (r6 == 0) goto L8c3
                    r6 = 0
                    r0 = r0[r6]
                    if (r1 == r0) goto L593
                    r0 = r5 | 97
                    r1 = 1
                    int r0 = r0 << r1
                    r1 = r5 ^ 97
                    int r0 = r0 - r1
                    int r1 = r0 % 128
                    o.uJX.AEQbTJ = r1
                    int r0 = r0 % r3
                    goto L8c2
                L593:
                    java.io.File r0 = new java.io.File     // Catch: java.lang.Exception -> L614
                    r5 = 40
                    char[] r5 = new char[r5]     // Catch: java.lang.Exception -> L614
                    r5 = {x0914: FILL_ARRAY_DATA , data: [-18718, -19861, -16610, -18239, -23114, -20849, -21930, -26772, -28661, -25131, -30989, -31803, -28843, -30599, -2807, -317, -1030, -6969, -8125, -4752, -10744, -11305, -8982, -9856, -15022, -12753, -13556, 13519, 12787, 15006, 9822, 9064, 11289, 10727, 4851, 8096, 7000, 1127, 310, 2764} // fill-array     // Catch: java.lang.Exception -> L614
                    r6 = 1
                    java.lang.Object[] r7 = new java.lang.Object[r6]     // Catch: java.lang.Exception -> L614
                    r6 = 1237(0x4d5, float:1.733E-42)
                    a(r5, r6, r7)     // Catch: java.lang.Exception -> L614
                    r5 = 0
                    r6 = r7[r5]     // Catch: java.lang.Exception -> L614
                    java.lang.String r6 = (java.lang.String) r6     // Catch: java.lang.Exception -> L614
                    r0.<init>(r6)     // Catch: java.lang.Exception -> L614
                    int r5 = o.uJX.KWHzl
                    int r5 = r5 + 71
                    int r6 = r5 % 128
                    o.uJX.AEQbTJ = r6
                    int r5 = r5 % r3
                    if (r5 == 0) goto L60a
                    boolean r5 = r0.canRead()     // Catch: java.lang.Exception -> L614
                    r6 = 1
                    if (r5 == r6) goto L5bf
                    goto L614
                L5bf:
                    java.io.FileReader r5 = new java.io.FileReader     // Catch: java.lang.Exception -> L614
                    r5.<init>(r0)     // Catch: java.lang.Exception -> L614
                    java.io.BufferedReader r6 = new java.io.BufferedReader     // Catch: java.lang.Exception -> L614
                    r6.<init>(r5)     // Catch: java.lang.Exception -> L614
                    java.lang.String r0 = r6.readLine()     // Catch: java.lang.Throwable -> L602
                    r7 = 3
                    char[] r8 = new char[r7]     // Catch: java.lang.Throwable -> L602
                    r8 = {x0940: FILL_ARRAY_DATA , data: [-18781, -1649, 10471} // fill-array     // Catch: java.lang.Throwable -> L602
                    r7 = 1
                    java.lang.Object[] r9 = new java.lang.Object[r7]     // Catch: java.lang.Throwable -> L602
                    r10 = 20269(0x4f2d, float:2.8403E-41)
                    a(r8, r10, r9)     // Catch: java.lang.Throwable -> L602
                    r8 = 0
                    r9 = r9[r8]     // Catch: java.lang.Throwable -> L602
                    java.lang.String r9 = (java.lang.String) r9     // Catch: java.lang.Throwable -> L602
                    boolean r8 = r0.equals(r9)     // Catch: java.lang.Throwable -> L602
                    r8 = r8 ^ r7
                    if (r8 == r7) goto L5ee
                    r5.close()     // Catch: java.lang.Exception -> L614
                    r6.close()     // Catch: java.lang.Exception -> L614
                    goto L614
                L5ee:
                    int r8 = o.uJX.AEQbTJ
                    r9 = r8 | 59
                    int r9 = r9 << r7
                    r7 = r8 ^ 59
                    int r9 = r9 - r7
                    int r7 = r9 % 128
                    o.uJX.KWHzl = r7
                    int r9 = r9 % r3
                    r5.close()     // Catch: java.lang.Exception -> L614
                    r6.close()     // Catch: java.lang.Exception -> L614
                    goto L615
                L602:
                    r0 = move-exception
                    r5.close()     // Catch: java.lang.Exception -> L614
                    r6.close()     // Catch: java.lang.Exception -> L614
                    throw r0     // Catch: java.lang.Exception -> L614
                L60a:
                    r0.canRead()     // Catch: java.lang.Exception -> L614
                    r5 = 0
                    r5.hashCode()     // Catch: java.lang.Throwable -> L612 java.lang.Exception -> L614
                    throw r5     // Catch: java.lang.Throwable -> L612 java.lang.Exception -> L614
                L612:
                    r0 = move-exception
                    throw r0
                L614:
                    r0 = 0
                L615:
                    java.io.File r5 = new java.io.File     // Catch: java.lang.Exception -> L79c
                    r6 = 31
                    char[] r6 = new char[r6]     // Catch: java.lang.Exception -> L79c
                    r6 = {x0948: FILL_ARRAY_DATA , data: [-18718, -21624, -29483, -7875, -15750, 9451, 6528, 31431, 24342, -20417, -27980, -2065, -5949, -13038, 11854, 186, 26034, 17966, -17661, -25520, -376, -11273, 13350, 10577, 2640, 27790, 16846, -24008, -30867, -1623, -9569} // fill-array     // Catch: java.lang.Exception -> L79c
                    r7 = 1
                    java.lang.Object[] r8 = new java.lang.Object[r7]     // Catch: java.lang.Exception -> L79c
                    r7 = 7477(0x1d35, float:1.0478E-41)
                    a(r6, r7, r8)     // Catch: java.lang.Exception -> L79c
                    r6 = 0
                    r7 = r8[r6]     // Catch: java.lang.Exception -> L79c
                    java.lang.String r7 = (java.lang.String) r7     // Catch: java.lang.Exception -> L79c
                    r5.<init>(r7)     // Catch: java.lang.Exception -> L79c
                    boolean r6 = r5.canRead()     // Catch: java.lang.Exception -> L79c
                    if (r6 != 0) goto L63f
                    int r0 = o.uJX.KWHzl
                    int r0 = r0 + 121
                    int r5 = r0 % 128
                    o.uJX.AEQbTJ = r5
                    int r0 = r0 % r3
                    goto L79c
                L63f:
                    java.io.FileReader r6 = new java.io.FileReader     // Catch: java.lang.Exception -> L79c
                    r6.<init>(r5)     // Catch: java.lang.Exception -> L79c
                    java.io.BufferedReader r5 = new java.io.BufferedReader     // Catch: java.lang.Exception -> L79c
                    r5.<init>(r6)     // Catch: java.lang.Exception -> L79c
                    java.lang.String r7 = r5.readLine()     // Catch: java.lang.Throwable -> L794
                    r8 = 1
                    char[] r9 = new char[r8]     // Catch: java.lang.Throwable -> L794
                    r10 = 46844(0xb6fc, float:6.5642E-41)
                    r11 = 0
                    r9[r11] = r10     // Catch: java.lang.Throwable -> L794
                    java.lang.Object[] r12 = new java.lang.Object[r8]     // Catch: java.lang.Throwable -> L794
                    r8 = 4327(0x10e7, float:6.063E-42)
                    a(r9, r8, r12)     // Catch: java.lang.Throwable -> L794
                    r8 = r12[r11]     // Catch: java.lang.Throwable -> L794
                    java.lang.String r8 = (java.lang.String) r8     // Catch: java.lang.Throwable -> L794
                    int r9 = o.uJX.KWHzl
                    r11 = r9 & 61
                    r9 = r9 | 61
                    int r11 = r11 + r9
                    int r9 = r11 % 128
                    o.uJX.AEQbTJ = r9
                    int r11 = r11 % r3
                    boolean r7 = r7.equals(r8)     // Catch: java.lang.Throwable -> L794
                    r6.close()     // Catch: java.lang.Exception -> L79c
                    r5.close()     // Catch: java.lang.Exception -> L79c
                    if (r7 == 0) goto L79c
                    java.io.File r5 = new java.io.File     // Catch: java.lang.Exception -> L79c
                    r6 = 36
                    char[] r6 = new char[r6]     // Catch: java.lang.Exception -> L79c
                    r6 = {x096c: FILL_ARRAY_DATA , data: [-18718, 16311, -23386, 11685, -27962, 7051, -32610, 2432, -277, 26617, -4869, 21889, -9531, 17373, -14127, -20161, 9786, -20613, 5147, -25324, 536, -29933, 28770, -1684, 28274, -10493, 23635, -15028, 19024, 12459, -18006, 11956, -26742, 7355, -31344, 2712} // fill-array     // Catch: java.lang.Exception -> L79c
                    r7 = 1
                    java.lang.Object[] r8 = new java.lang.Object[r7]     // Catch: java.lang.Exception -> L79c
                    r7 = 35081(0x8909, float:4.9159E-41)
                    a(r6, r7, r8)     // Catch: java.lang.Exception -> L79c
                    r6 = 0
                    r7 = r8[r6]     // Catch: java.lang.Exception -> L79c
                    java.lang.String r7 = (java.lang.String) r7     // Catch: java.lang.Exception -> L79c
                    r5.<init>(r7)     // Catch: java.lang.Exception -> L79c
                    boolean r6 = r5.canRead()     // Catch: java.lang.Exception -> L79c
                    if (r6 != 0) goto L69b
                    goto L79c
                L69b:
                    java.io.FileReader r6 = new java.io.FileReader     // Catch: java.lang.Exception -> L79c
                    r6.<init>(r5)     // Catch: java.lang.Exception -> L79c
                    java.io.BufferedReader r5 = new java.io.BufferedReader     // Catch: java.lang.Exception -> L79c
                    r5.<init>(r6)     // Catch: java.lang.Exception -> L79c
                    java.lang.String r7 = r5.readLine()     // Catch: java.lang.Throwable -> L78c
                    r8 = 1
                    char[] r9 = new char[r8]     // Catch: java.lang.Throwable -> L78c
                    r10 = 46844(0xb6fc, float:6.5642E-41)
                    r11 = 0
                    r9[r11] = r10     // Catch: java.lang.Throwable -> L78c
                    java.lang.Object[] r12 = new java.lang.Object[r8]     // Catch: java.lang.Throwable -> L78c
                    r8 = 4327(0x10e7, float:6.063E-42)
                    a(r9, r8, r12)     // Catch: java.lang.Throwable -> L78c
                    r8 = r12[r11]     // Catch: java.lang.Throwable -> L78c
                    java.lang.String r8 = (java.lang.String) r8     // Catch: java.lang.Throwable -> L78c
                    boolean r7 = r7.equals(r8)     // Catch: java.lang.Throwable -> L78c
                    r6.close()     // Catch: java.lang.Exception -> L79c
                    r5.close()     // Catch: java.lang.Exception -> L79c
                    int r5 = o.uJX.AEQbTJ
                    r6 = 25
                    int r5 = r5 + r6
                    int r6 = r5 % 128
                    o.uJX.KWHzl = r6
                    int r5 = r5 % r3
                    if (r7 == 0) goto L79c
                    if (r0 == 0) goto L79c
                    r5 = r6 | 37
                    r7 = 1
                    int r5 = r5 << r7
                    r6 = r6 ^ 37
                    int r5 = r5 - r6
                    int r6 = r5 % 128
                    o.uJX.AEQbTJ = r6
                    int r5 = r5 % r3
                    r5 = r1 & 20
                    int r5 = ~r5
                    r6 = r1 | 20
                    r5 = r5 & r6
                    r6 = 4
                    java.lang.Object[] r12 = new java.lang.Object[r6]
                    r6 = 1
                    int[] r7 = new int[r6]
                    r8 = 0
                    r12[r8] = r7
                    int[] r9 = new int[r6]
                    r12[r3] = r9
                    int[] r9 = new int[r6]
                    r10 = 3
                    r12[r10] = r9
                    int[] r9 = (int[]) r9
                    r9[r8] = r1
                    int[] r7 = (int[]) r7
                    r7[r8] = r5
                    r12[r6] = r0
                    r0 = 724328748(0x2b2c612c, float:6.124153E-13)
                    r0 = r0 | r1
                    int r0 = ~r0
                    r5 = -613090195(0xffffffffdb74fc6d, float:-6.8957439E16)
                    r0 = r0 | r5
                    int r0 = r0 * 672
                    r6 = 888354009(0x34f334d9, float:4.530073E-7)
                    int r6 = r6 + r0
                    r0 = -724328749(0xffffffffd4d39ed3, float:-7.2712218E12)
                    r0 = r0 | r4
                    int r0 = ~r0
                    r1 = r1 | r5
                    int r1 = ~r1
                    r0 = r0 | r1
                    int r0 = r0 * (-672)
                    int r6 = r6 + r0
                    r0 = 613090194(0x248b0392, float:6.028769E-17)
                    r0 = r0 | r4
                    int r0 = ~r0
                    r1 = -800023487(0xffffffffd0509c41, float:-1.39996047E10)
                    r0 = r0 | r1
                    int r0 = r0 * 672
                    int r6 = r6 + r0
                    int r0 = o.C9566bXx.OLrzqt()
                    int r1 = r6 * 370
                    int r1 = ~r1
                    int r1 = 5919 - r1
                    r4 = r6 ^ 16
                    r5 = r6 & 16
                    r4 = r4 | r5
                    int r5 = ~r0
                    r4 = r4 | r5
                    int r4 = r4 * (-369)
                    int r1 = r1 + r4
                    r4 = -17
                    r7 = r4 ^ r5
                    r4 = r4 & r5
                    r4 = r4 | r7
                    int r5 = ~r4
                    r7 = r6 ^ r5
                    r5 = r5 & r6
                    r5 = r5 | r7
                    int r5 = r5 * (-369)
                    int r5 = -r5
                    int r5 = -r5
                    r7 = r1 | r5
                    r8 = 1
                    int r7 = r7 << r8
                    r1 = r1 ^ r5
                    int r7 = r7 - r1
                    int r1 = ~r6
                    r5 = 16
                    r1 = r1 | r5
                    int r1 = ~r1
                    r8 = r0 ^ 16
                    r0 = r0 & r5
                    r0 = r0 | r8
                    int r0 = ~r0
                    r5 = r1 ^ r0
                    r0 = r0 & r1
                    r0 = r0 | r5
                    r1 = r4 ^ r6
                    r4 = r4 & r6
                    r1 = r1 | r4
                    int r1 = ~r1
                    r4 = r0 ^ r1
                    r0 = r0 & r1
                    r0 = r0 | r4
                    int r0 = r0 * 369
                    r1 = r7 ^ r0
                    r0 = r0 & r7
                    r4 = 1
                    int r0 = r0 << r4
                    int r1 = r1 + r0
                    int r0 = r2 + r1
                    int r1 = r0 << 13
                    r2 = r0 & r1
                    int r2 = ~r2
                    r0 = r0 | r1
                    r0 = r0 & r2
                    int r1 = r0 >>> 17
                    r2 = r0 & r1
                    int r2 = ~r2
                    r0 = r0 | r1
                    r0 = r0 & r2
                    int r1 = r0 << 5
                    r0 = r0 ^ r1
                    r1 = r12[r3]
                    int[] r1 = (int[]) r1
                    r2 = 0
                    r1[r2] = r0
                    goto L8c2
                L78c:
                    r0 = move-exception
                    r6.close()     // Catch: java.lang.Exception -> L79c
                    r5.close()     // Catch: java.lang.Exception -> L79c
                    throw r0     // Catch: java.lang.Exception -> L79c
                L794:
                    r0 = move-exception
                    r6.close()     // Catch: java.lang.Exception -> L79c
                    r5.close()     // Catch: java.lang.Exception -> L79c
                    throw r0     // Catch: java.lang.Exception -> L79c
                L79c:
                    r5 = 4
                    java.lang.Object[] r12 = new java.lang.Object[r5]
                    r5 = 1
                    int[] r0 = new int[r5]
                    r6 = 0
                    r12[r6] = r0
                    int[] r7 = new int[r5]
                    r12[r3] = r7
                    int[] r7 = new int[r5]
                    r5 = 3
                    r12[r5] = r7
                    int[] r7 = (int[]) r7
                    r7[r6] = r1
                    int[] r0 = (int[]) r0
                    int r7 = o.uJX.KWHzl
                    int r7 = r7 + r5
                    int r5 = r7 % 128
                    o.uJX.AEQbTJ = r5
                    int r7 = r7 % r3
                    if (r7 != 0) goto L7f0
                    r0[r6] = r1
                    r5 = 0
                    r12[r6] = r5
                    r0 = -25233417(0xfffffffffe7ef7f7, float:-8.4727855E37)
                    r0 = r0 | r4
                    int r0 = r0 * (-369)
                    r5 = -1791408350(0xffffffff95394722, float:-3.7416566E-26)
                    int r5 = r5 + r0
                    r0 = -439810035(0xffffffffe5c9080d, float:-1.1866802E23)
                    r0 = r0 | r4
                    int r0 = ~r0
                    r6 = -328571481(0xffffffffec6a65a7, float:-1.1334747E27)
                    r0 = r0 | r6
                    int r0 = r0 * (-369)
                    int r5 = r5 + r0
                    r0 = 439810034(0x1a36f7f2, float:3.7837006E-23)
                    r0 = r0 | r1
                    int r0 = ~r0
                    r6 = -465043451(0xffffffffe4480005, float:-1.4757401E22)
                    r0 = r0 | r6
                    r6 = -303338065(0xffffffffedeb6daf, float:-9.107697E27)
                    r6 = r6 | r4
                    int r6 = ~r6
                    r0 = r0 | r6
                    int r0 = r0 * 369
                    int r5 = r5 + r0
                L7eb:
                    int r0 = o.C9566bXx.OLrzqt()
                    goto L81f
                L7f0:
                    r5 = r6
                    r0[r5] = r1
                    r5 = 0
                    r6 = 1
                    r12[r6] = r5
                    java.lang.Runtime r0 = java.lang.Runtime.getRuntime()
                    long r5 = r0.maxMemory()
                    int r0 = (int) r5
                    int r0 = ~r0
                    r5 = -249913934(0xfffffffff11a9db2, float:-7.656213E29)
                    r5 = r5 | r0
                    int r5 = ~r5
                    r6 = 138675379(0x84404b3, float:5.898713E-34)
                    r5 = r5 | r6
                    int r5 = r5 * (-933)
                    r7 = 1887814718(0x7085c43e, float:3.3119E29)
                    int r7 = r7 + r5
                    r0 = r0 | r6
                    int r0 = ~r0
                    r5 = -249915136(0xfffffffff11a9900, float:-7.655305E29)
                    r0 = r0 | r5
                    int r0 = r0 * 933
                    int r7 = r7 + r0
                    r0 = 1121466(0x111cba, float:1.571509E-39)
                    int r5 = r7 + r0
                    goto L7eb
                L81f:
                    int r6 = r5 * (-520)
                    int r6 = ~r6
                    r7 = -1
                    int r6 = (-1) - r6
                    int r7 = ~r0
                    r8 = r7 ^ r5
                    r7 = r7 & r5
                    r7 = r7 | r8
                    int r7 = ~r7
                    int r7 = r7 * (-1042)
                    int r7 = ~r7
                    int r6 = r6 - r7
                    r7 = 1
                    int r6 = r6 - r7
                    r7 = r5 ^ r0
                    r8 = r5 & r0
                    r7 = r7 | r8
                    int r7 = r7 * 521
                    int r7 = -r7
                    int r7 = -r7
                    r8 = r6 & r7
                    r6 = r6 | r7
                    int r8 = r8 + r6
                    int r6 = o.uJX.KWHzl
                    r7 = r6 & 111(0x6f, float:1.56E-43)
                    r6 = r6 | 111(0x6f, float:1.56E-43)
                    int r7 = r7 + r6
                    int r6 = r7 % 128
                    o.uJX.AEQbTJ = r6
                    int r7 = r7 % r3
                    int r0 = ~r0
                    r6 = r0 ^ r5
                    r0 = r0 & r5
                    r0 = r0 | r6
                    int r0 = ~r0
                    r5 = 521(0x209, float:7.3E-43)
                    int r5 = r5 * r0
                    int r0 = -r5
                    int r0 = -r0
                    r5 = r8 ^ r0
                    r0 = r0 & r8
                    r6 = 1
                    int r0 = r0 << r6
                    int r5 = r5 + r0
                    int r0 = r5 * 399
                    int r7 = r2 * 399
                    int r7 = ~r7
                    int r0 = r0 - r7
                    int r0 = r0 - r6
                    int r6 = ~r5
                    r7 = r6 ^ r2
                    r6 = r6 & r2
                    r6 = r6 | r7
                    int r6 = ~r6
                    int r7 = ~r2
                    r8 = r7 ^ r5
                    r9 = r7 & r5
                    r8 = r8 | r9
                    int r8 = ~r8
                    r9 = r6 ^ r8
                    r6 = r6 & r8
                    r6 = r6 | r9
                    r8 = r7 ^ r1
                    r1 = r1 & r7
                    r1 = r1 | r8
                    int r1 = ~r1
                    r1 = r1 | r6
                    int r1 = r1 * 398
                    int r0 = r0 + r1
                    o.C9566bXx.OLrzqt()
                    o.C9566bXx.OLrzqt()
                    r1 = r5 ^ r2
                    r6 = r5 & r2
                    r1 = r1 | r6
                    int r1 = r1 * (-1194)
                    int r1 = -r1
                    int r1 = -r1
                    r6 = r0 | r1
                    r8 = 1
                    int r6 = r6 << r8
                    r0 = r0 ^ r1
                    int r6 = r6 - r0
                    r0 = r7 | r4
                    int r0 = ~r0
                    int r1 = ~r5
                    r4 = r1 ^ r2
                    r1 = r1 & r2
                    r1 = r1 | r4
                    int r1 = ~r1
                    r0 = r0 | r1
                    int r1 = ~r2
                    r2 = r1 ^ r5
                    r1 = r1 & r5
                    r1 = r1 | r2
                    int r1 = ~r1
                    r0 = r0 | r1
                    int r0 = r0 * 398
                    r1 = r6 | r0
                    r2 = 1
                    int r1 = r1 << r2
                    r0 = r0 ^ r6
                    int r1 = r1 - r0
                    int r0 = r1 << 13
                    r0 = r0 ^ r1
                    int r1 = r0 >>> 17
                    r2 = r0 & r1
                    int r2 = ~r2
                    r0 = r0 | r1
                    r0 = r0 & r2
                    int r1 = r0 << 5
                    int r2 = ~r1
                    r2 = r2 & r0
                    int r0 = ~r0
                    r0 = r0 & r1
                    r0 = r0 | r2
                    r1 = r12[r3]
                    int[] r1 = (int[]) r1
                    r2 = 0
                    r1[r2] = r0
                L8c2:
                    return r12
                L8c3:
                    r2 = 0
                    r0 = r0[r2]
                    r1 = 0
                    throw r1
                L8c8:
                    r0 = move-exception
                    java.lang.Throwable r1 = r0.getCause()
                    if (r1 == 0) goto L8d0
                    throw r1
                L8d0:
                    throw r0
                */
                throw new UnsupportedOperationException("Method not decompiled: o.uJX.OLrzqt(int, int):java.lang.Object[]");
            }
        }));
    }

    public static final Unit OLrzqt(uJV ujv, boolean z) {
        if (ujv.isVisible()) {
            ujv.EZpvd();
        }
        return Unit.INSTANCE;
    }

    private final void AuCTel() {
        C48370uOz c48370uOz = this.KWHzl;
        if (c48370uOz == null) {
            Intrinsics.gEmmrt("");
            c48370uOz = null;
        }
        RecyclerView recyclerView = c48370uOz.KWHzl;
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        recyclerView.setAdapter(AEQbTJ());
        RecyclerView.ItemAnimator itemAnimator = recyclerView.getItemAnimator();
        SimpleItemAnimator simpleItemAnimator = itemAnimator instanceof SimpleItemAnimator ? (SimpleItemAnimator) itemAnimator : null;
        if (simpleItemAnimator != null) {
            simpleItemAnimator.setSupportsChangeAnimations(false);
            simpleItemAnimator.setMoveDuration(0L);
        }
    }

    private final void ejfBZ() {
        C48370uOz c48370uOz = this.KWHzl;
        if (c48370uOz == null) {
            Intrinsics.gEmmrt("");
            c48370uOz = null;
        }
        C33546myW c33546myW = c48370uOz.EZpvd;
        c33546myW.djBIcL(false);
        c33546myW.AhwBna(true);
        c33546myW.setNoMoreDataEffective(true);
        c33546myW.KWHzl(new InterfaceC57900yrD() { // from class: o.uJT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC57900yrD
            public final void EZpvd(InterfaceC57934yrl interfaceC57934yrl) {
                uJV.copydefault(this.OLrzqt, interfaceC57934yrl);
            }
        });
    }

    public static final void copydefault(uJV ujv, InterfaceC57934yrl interfaceC57934yrl) {
        Intrinsics.checkNotNullParameter(interfaceC57934yrl, "");
        ujv.KWHzl().OLrzqt(BacktestListViewModel.StateListAnimator.TaskDescription.KWHzl);
    }

    private final void fIwbmz() {
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new BacktestListFragment$observeState$1(this, null), 3, null);
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.uyK.showNormalEmpty$default(o.xgE, java.lang.String, boolean, java.lang.String, boolean, int, boolean, int, java.lang.Object):void */
    public final void copydefault(uLU<BacktestListViewModel.Activity> ulu) {
        C48370uOz c48370uOz = null;
        if (ulu instanceof uLU.TaskDescription) {
            if (((uLU.TaskDescription) ulu).AEQbTJ()) {
                C48370uOz c48370uOz2 = this.KWHzl;
                if (c48370uOz2 == null) {
                    Intrinsics.gEmmrt("");
                    c48370uOz2 = null;
                }
                C55237xgE c55237xgE = c48370uOz2.copydefault;
                StatefulView.Status status = StatefulView.Status.Loading;
                c55237xgE.setStatus(status);
                C48370uOz c48370uOz3 = this.KWHzl;
                if (c48370uOz3 == null) {
                    Intrinsics.gEmmrt("");
                } else {
                    c48370uOz = c48370uOz3;
                }
                android.view.View viewAEQbTJ = c48370uOz.copydefault.AEQbTJ(status);
                if (viewAEQbTJ != null) {
                    wMZ.copydefault(viewAEQbTJ);
                    return;
                }
                return;
            }
            return;
        }
        if (ulu instanceof uLU.ActionBar) {
            valueOf();
            BacktestListViewModel.Activity activity = (BacktestListViewModel.Activity) ((uLU.ActionBar) ulu).KWHzl();
            AEQbTJ().submitList(activity.OLrzqt());
            C48370uOz c48370uOz4 = this.KWHzl;
            if (c48370uOz4 == null) {
                Intrinsics.gEmmrt("");
                c48370uOz4 = null;
            }
            C33546myW c33546myW = c48370uOz4.EZpvd;
            Intrinsics.checkNotNullExpressionValue(c33546myW, "");
            C57589ylK.KWHzl(c33546myW, !activity.EZpvd());
            if (!activity.OLrzqt().isEmpty()) {
                C48370uOz c48370uOz5 = this.KWHzl;
                if (c48370uOz5 == null) {
                    Intrinsics.gEmmrt("");
                } else {
                    c48370uOz = c48370uOz5;
                }
                c48370uOz.copydefault.setStatus(StatefulView.Status.Content);
                return;
            }
            C48370uOz c48370uOz6 = this.KWHzl;
            if (c48370uOz6 == null) {
                Intrinsics.gEmmrt("");
                c48370uOz6 = null;
            }
            C55237xgE c55237xgE2 = c48370uOz6.copydefault;
            Intrinsics.checkNotNullExpressionValue(c55237xgE2, "");
            C49953uyK.showNormalEmpty$default(c55237xgE2, null, false, null, false, C55298xhM.dpInt$default(56.0f, (android.content.Context) null, 1, (java.lang.Object) null), false, 47, null);
            return;
        }
        if (!(ulu instanceof uLU.Activity)) {
            throw new NoWhenBranchMatchedException();
        }
        valueOf();
        C48370uOz c48370uOz7 = this.KWHzl;
        if (c48370uOz7 == null) {
            Intrinsics.gEmmrt("");
            c48370uOz7 = null;
        }
        C33546myW c33546myW2 = c48370uOz7.EZpvd;
        Intrinsics.checkNotNullExpressionValue(c33546myW2, "");
        C57589ylK.KWHzl(c33546myW2, true);
        uLU.Activity activity2 = (uLU.Activity) ulu;
        BacktestListViewModel.Activity activity3 = (BacktestListViewModel.Activity) activity2.KWHzl();
        java.util.List<uJO> listOLrzqt = activity3 != null ? activity3.OLrzqt() : null;
        if (listOLrzqt == null || listOLrzqt.isEmpty()) {
            C48370uOz c48370uOz8 = this.KWHzl;
            if (c48370uOz8 == null) {
                Intrinsics.gEmmrt("");
                c48370uOz8 = null;
            }
            C55237xgE c55237xgE3 = c48370uOz8.copydefault;
            Intrinsics.checkNotNullExpressionValue(c55237xgE3, "");
            C49953uyK.KWHzl(c55237xgE3, (21 & 1) != 0 ? false : false, (21 & 2) != 0 ? c55237xgE3.getContext().getString(C55688xof.Application.putInt) : C49968uyZ.OLrzqt(activity2.EZpvd(), C33070mpX.AYXKKw(C48033uCm.Fragment.RTWSvT)), (21 & 4) != 0 ? false : false, (21 & 8) != 0 ? 0 : C55298xhM.dpInt$default(56.0f, (android.content.Context) null, 1, (java.lang.Object) null), (21 & 16) != 0 ? false : false, new Function0() { // from class: o.uJY
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return uJV.valueOf(this.copydefault);
                }
            });
        }
    }

    public static final Unit valueOf(uJV ujv) {
        ujv.KWHzl().OLrzqt(BacktestListViewModel.StateListAnimator.Application.OLrzqt);
        return Unit.INSTANCE;
    }

    public final void valueOf() {
        C48370uOz c48370uOz = this.KWHzl;
        C48370uOz c48370uOz2 = null;
        if (c48370uOz == null) {
            Intrinsics.gEmmrt("");
            c48370uOz = null;
        }
        StatefulView.Status statusOLrzqt = c48370uOz.copydefault.OLrzqt();
        StatefulView.Status status = StatefulView.Status.Loading;
        if (statusOLrzqt == status) {
            C48370uOz c48370uOz3 = this.KWHzl;
            if (c48370uOz3 == null) {
                Intrinsics.gEmmrt("");
            } else {
                c48370uOz2 = c48370uOz3;
            }
            android.view.View viewAEQbTJ = c48370uOz2.copydefault.AEQbTJ(status);
            if (viewAEQbTJ != null) {
                wMZ.KWHzl(viewAEQbTJ);
            }
        }
    }

    public final void copydefault(uJO ujo) {
        TacticsData tacticsDataCopydefault = KWHzl().copydefault(ujo.EZpvd());
        if (tacticsDataCopydefault != null) {
            AkhnZx().AEQbTJ("strategy_button_details", tacticsDataCopydefault);
        }
    }

    public final void EZpvd(uJO ujo) {
        uJL ujlCopydefault = ujo.copydefault();
        if (ujlCopydefault == null) {
            return;
        }
        C43056riA c43056riA = C43056riA.AEQbTJ;
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        float fEZpvd = ujlCopydefault.EZpvd();
        c43056riA.OLrzqt(contextRequireContext, "okluatradingeco", "/bot/ai/backtest-progress-info", C56424yEw.gEmmrt(C56390yDp.OLrzqt("progress", pTB.formatICUPercent$default(java.lang.Float.valueOf(fEZpvd), null, C38307pTy.Companion.EZpvd(0), null, java.lang.Double.valueOf(100.0d), null, 21, null)), C56390yDp.OLrzqt("timeSpent", wUB.OLrzqt(ujlCopydefault.AEQbTJ())), C56390yDp.OLrzqt("timeLeft", wUB.OLrzqt(ujlCopydefault.OLrzqt()))));
    }

    /* JADX DEBUG: Class process forced to load method for inline: com.okinc.tradingbot.impl.strategy.view.helper.BotOperatorButtonDisposer.dispose$default(com.okinc.tradingbot.impl.strategy.view.helper.BotOperatorButtonDisposer, java.lang.String, com.okinc.unify_trade.bot.data.TacticsData, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, o.xwe, o.xwe, int, java.lang.Object):void */
    public final void copydefault(java.lang.String str, final TacticsData tacticsData, Function0<Unit> function0) {
        this.copydefault = tacticsData;
        BotOperatorButtonDisposer.dispose$default(AkhnZx(), str, tacticsData, function0, new Function0() { // from class: o.uKa
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return uJV.OLrzqt(this.OLrzqt, tacticsData);
            }
        }, null, null, 48, null);
        if (function0 != null) {
            function0.invoke();
        }
    }

    public static final Unit OLrzqt(uJV ujv, TacticsData tacticsData) {
        ujv.EZpvd(tacticsData);
        return Unit.INSTANCE;
    }

    public final void AEQbTJ(java.lang.String str, TacticsData tacticsData) {
        pUU.EZpvd(getTAG(), "handleDisableClick ButtonType: " + str);
    }

    public final void EZpvd() {
        KWHzl().OLrzqt(BacktestListViewModel.StateListAnimator.Application.OLrzqt);
    }

    public final void copydefault(@NotNull BacktestFilter backtestFilter) {
        Intrinsics.checkNotNullParameter(backtestFilter, "");
        KWHzl().OLrzqt(new BacktestListViewModel.StateListAnimator.Activity(backtestFilter));
    }

    /* JADX DEBUG: Possible override for method o.uKs.OLrzqt()V */
    @Override // o.InterfaceC52662wTs
    public TradeLiveData<java.util.ArrayList<java.lang.Object>> OLrzqt() {
        TacticsData tacticsData = this.copydefault;
        if (tacticsData == null) {
            return new TradeLiveData<>(new java.util.ArrayList());
        }
        return new TradeLiveData<>(yDY.copydefault(tacticsData));
    }

    @Override // o.InterfaceC52662wTs
    public void copydefault(@NotNull java.lang.String str, int i, boolean z) {
        android.view.View root;
        android.view.View view;
        Intrinsics.checkNotNullParameter(str, "");
        android.content.Context context = getContext();
        if (context != null) {
            androidx.fragment.app.Fragment parentFragment = getParentFragment();
            if (parentFragment == null || (view = parentFragment.getView()) == null || (root = view.getRootView()) == null) {
                C48370uOz c48370uOz = this.KWHzl;
                if (c48370uOz == null) {
                    Intrinsics.gEmmrt("");
                    c48370uOz = null;
                }
                root = c48370uOz.getRoot();
                Intrinsics.checkNotNullExpressionValue(root, "");
            }
            C55284xgz c55284xgzAEQbTJ = C55284xgz.Companion.AEQbTJ(context, root, str);
            if (c55284xgzAEQbTJ != null) {
                c55284xgzAEQbTJ.isConnected(i);
                c55284xgzAEQbTJ.hDKMBd();
            }
        }
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.wrm.shareAiBot$default(com.okinc.unify_trade.bot.data.TacticsData, o.mov, boolean, boolean, int, java.lang.Object):void */
    @Override // o.InterfaceC52662wTs
    public void EZpvd(@NotNull TacticsData tacticsData) {
        Intrinsics.checkNotNullParameter(tacticsData, "");
        C32866mlf.onEvent$default("TradingBot_SharePoster_Button_Click", (TrackChannel[]) null, new Function1() { // from class: o.uJU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return uJV.KWHzl((EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
        FragmentActivity activity = getActivity();
        AbstractActivityC33041mov abstractActivityC33041mov = activity instanceof AbstractActivityC33041mov ? (AbstractActivityC33041mov) activity : null;
        if (abstractActivityC33041mov != null) {
            C53772wrm.shareAiBot$default(tacticsData, abstractActivityC33041mov, false, false, 6, null);
        }
    }

    public static final Unit KWHzl(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "bot_type", "ai_bot", false, 4, null);
        return Unit.INSTANCE;
    }

    @Override // o.InterfaceC52662wTs
    public void bz_() {
        KWHzl().OLrzqt(BacktestListViewModel.StateListAnimator.ActionBar.OLrzqt);
    }

    @Override // o.InterfaceC52662wTs
    public void gEmmrt() {
        KWHzl().OLrzqt(BacktestListViewModel.StateListAnimator.ActionBar.OLrzqt);
    }

    @Override // o.InterfaceC52662wTs
    public void OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        KWHzl().OLrzqt(new BacktestListViewModel.StateListAnimator.LoaderManager(str, str2));
    }
}
