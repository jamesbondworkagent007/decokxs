package o;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentResultListener;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.google.common.base.Ascii;
import com.google.common.primitives.UnsignedBytes;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import com.okinc.business.defi.biz.core.error.WalletImportError;
import com.okinc.business.defi.wallet.common.FragmentUtilKt$getParentViewModel$$inlined$viewModels$default$1;
import com.okinc.business.defi.wallet.common.FragmentUtilKt$getParentViewModel$$inlined$viewModels$default$2;
import com.okinc.business.defi.wallet.common.FragmentUtilKt$getParentViewModel$$inlined$viewModels$default$3;
import com.okinc.business.defi.wallet.common.FragmentUtilKt$getParentViewModel$$inlined$viewModels$default$4;
import com.okinc.business.defi.wallet.mine.search.data.model.AddressSearchHistory;
import com.okinc.business.defi.wallet.mine.search.data.model.DAppSearchHistory;
import com.okinc.business.defi.wallet.mine.search.data.model.MarketChainBean;
import com.okinc.business.defi.wallet.mine.search.data.model.SearchAddressModel;
import com.okinc.business.defi.wallet.mine.search.data.model.SearchRecommendResponse;
import com.okinc.business.defi.wallet.mine.search.data.model.SearchRecommendTokenModel;
import com.okinc.business.defi.wallet.mine.search.data.model.TagEventProperty;
import com.okinc.business.defi.wallet.mine.search.data.model.TokenSearchHistory;
import com.okinc.business.defi.wallet.mine.search.ui.navigation.SearchItemNavigationHandler;
import com.okinc.business.defi.wallet.mine.search.ui.view.WalletSearchAllResultFragment$addDataListener$1;
import com.okinc.business.defi.wallet.mine.search.ui.view.WalletSearchAllResultFragment$addDataListener$2;
import com.okinc.business.defi.wallet.mine.search.ui.view.WalletSearchAllResultFragment$addDataListener$3;
import com.okinc.business.defi.wallet.mine.search.ui.view.WalletSearchAllResultFragment$addDataListener$4;
import com.okinc.business.defi.wallet.mine.search.ui.view.WalletSearchAllResultFragment$openChainSelectionBottomSheet$1;
import com.okinc.business.defi.wallet.mine.search.ui.viewmodel.TokenSearchResultViewModel;
import com.okinc.business.defi.wallet.mine.search.ui.viewmodel.WalletSearchAllResultViewModel;
import com.okinc.business.defi.wallet.mine.search.ui.viewmodel.WalletSearchHistoryViewModel;
import com.okinc.business.defi.wallet.mine.walletmanage.walletmanageradapter.SafeLinearLayoutManager;
import com.okinc.business.dex.api.bean.TokenBase;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import java.math.BigDecimal;
import java.util.LinkedHashMap;
import java.util.NoSuchElementException;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.C12827cuN;
import o.C13754dXa;
import o.dZM;
import o.gKO;
import org.jetbrains.annotations.NotNull;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: renamed from: o.fuA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C19056fuA extends AbstractC19054ftz {
    public C16629enY AhwBna;
    public final InterfaceC56387yDm AkhnZx;
    public final InterfaceC56387yDm ejfBZ;
    public final InterfaceC56387yDm fJNWhG;
    public RecyclerView.OnScrollListener fetchVPNInfo;
    public final InterfaceC56387yDm isConnected;
    public C18998fsw valueOf;
    public static final Application Companion = new Application(null);
    public static final int AYXKKw = 8;
    public java.lang.String gEmmrt = "";
    public final int djBIcL = 5;
    public final int DbNXlk = 3;
    public final InterfaceC56387yDm values = C56392yDr.copydefault(new Function0() { // from class: o.fuD
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C19056fuA.AkhnZx(this.OLrzqt);
        }
    });

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return C13754dXa.TaskDescription.DPHOMC;
    }

    @Override // o.AbstractC32998moE
    public void onInvisible() {
    }

    @Override // o.AbstractC32998moE
    public void onVisible() {
    }

    /* JADX INFO: renamed from: o.fuA$Activity */
    public static final class Activity implements Function0<ViewModelStoreOwner> {
        public final /* synthetic */ androidx.fragment.app.Fragment KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(androidx.fragment.app.Fragment fragment) {
            this.KWHzl = fragment;
        }

        /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public final ViewModelStoreOwner invoke() {
            java.lang.Object next;
            java.util.Iterator it = C59405zgS.EZpvd(this.KWHzl.getParentFragment(), (Function1<? super androidx.fragment.app.Fragment, ? extends androidx.fragment.app.Fragment>) ((Function1<? super java.lang.Object, ? extends java.lang.Object>) dZM.Activity.Application.EZpvd)).iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (((androidx.fragment.app.Fragment) next) instanceof C19095fun) {
                    break;
                }
            }
            androidx.fragment.app.Fragment fragment = (androidx.fragment.app.Fragment) next;
            if (fragment != null) {
                return fragment;
            }
            pUU.copydefault("FragmentUtil", "No parent fragment matching condition found for " + C56524yIo.AEQbTJ(WalletSearchAllResultViewModel.class).valueOf() + " in " + C56524yIo.AEQbTJ(this.KWHzl.getClass()).valueOf() + ". Falling back to Activity scope. This may cause memory leaks if the fragment is added/removed multiple times.");
            FragmentActivity fragmentActivityRequireActivity = this.KWHzl.requireActivity();
            Intrinsics.copydefault(fragmentActivityRequireActivity);
            return fragmentActivityRequireActivity;
        }
    }

    /* JADX INFO: renamed from: o.fuA$StateListAnimator */
    public static final class StateListAnimator implements Function0<ViewModelStoreOwner> {
        public final /* synthetic */ androidx.fragment.app.Fragment AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(androidx.fragment.app.Fragment fragment) {
            this.AEQbTJ = fragment;
        }

        /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public final ViewModelStoreOwner invoke() {
            java.lang.Object next;
            java.util.Iterator it = C59405zgS.EZpvd(this.AEQbTJ.getParentFragment(), (Function1<? super androidx.fragment.app.Fragment, ? extends androidx.fragment.app.Fragment>) ((Function1<? super java.lang.Object, ? extends java.lang.Object>) dZM.Activity.Application.EZpvd)).iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (((androidx.fragment.app.Fragment) next) instanceof C19095fun) {
                    break;
                }
            }
            androidx.fragment.app.Fragment fragment = (androidx.fragment.app.Fragment) next;
            if (fragment != null) {
                return fragment;
            }
            pUU.copydefault("FragmentUtil", "No parent fragment matching condition found for " + C56524yIo.AEQbTJ(TokenSearchResultViewModel.class).valueOf() + " in " + C56524yIo.AEQbTJ(this.AEQbTJ.getClass()).valueOf() + ". Falling back to Activity scope. This may cause memory leaks if the fragment is added/removed multiple times.");
            FragmentActivity fragmentActivityRequireActivity = this.AEQbTJ.requireActivity();
            Intrinsics.copydefault(fragmentActivityRequireActivity);
            return fragmentActivityRequireActivity;
        }
    }

    /* JADX INFO: renamed from: o.fuA$TaskDescription */
    public static final class TaskDescription implements Function0<ViewModelStoreOwner> {
        public final /* synthetic */ androidx.fragment.app.Fragment KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(androidx.fragment.app.Fragment fragment) {
            this.KWHzl = fragment;
        }

        /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public final ViewModelStoreOwner invoke() {
            java.lang.Object next;
            java.util.Iterator it = C59405zgS.EZpvd(this.KWHzl.getParentFragment(), (Function1<? super androidx.fragment.app.Fragment, ? extends androidx.fragment.app.Fragment>) ((Function1<? super java.lang.Object, ? extends java.lang.Object>) dZM.Activity.Application.EZpvd)).iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (((androidx.fragment.app.Fragment) next) instanceof C19095fun) {
                    break;
                }
            }
            androidx.fragment.app.Fragment fragment = (androidx.fragment.app.Fragment) next;
            if (fragment != null) {
                return fragment;
            }
            pUU.copydefault("FragmentUtil", "No parent fragment matching condition found for " + C56524yIo.AEQbTJ(WalletSearchHistoryViewModel.class).valueOf() + " in " + C56524yIo.AEQbTJ(this.KWHzl.getClass()).valueOf() + ". Falling back to Activity scope. This may cause memory leaks if the fragment is added/removed multiple times.");
            FragmentActivity fragmentActivityRequireActivity = this.KWHzl.requireActivity();
            Intrinsics.copydefault(fragmentActivityRequireActivity);
            return fragmentActivityRequireActivity;
        }
    }

    public C19056fuA() {
        StateListAnimator stateListAnimator = new StateListAnimator(this);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(lazyThreadSafetyMode, new FragmentUtilKt$getParentViewModel$$inlined$viewModels$default$1(stateListAnimator));
        this.fJNWhG = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(TokenSearchResultViewModel.class), new FragmentUtilKt$getParentViewModel$$inlined$viewModels$default$2(interfaceC56387yDmEZpvd), new FragmentUtilKt$getParentViewModel$$inlined$viewModels$default$3(null, interfaceC56387yDmEZpvd), new FragmentUtilKt$getParentViewModel$$inlined$viewModels$default$4(this, interfaceC56387yDmEZpvd));
        InterfaceC56387yDm interfaceC56387yDmEZpvd2 = C56392yDr.EZpvd(lazyThreadSafetyMode, new FragmentUtilKt$getParentViewModel$$inlined$viewModels$default$1(new Activity(this)));
        this.ejfBZ = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(WalletSearchAllResultViewModel.class), new FragmentUtilKt$getParentViewModel$$inlined$viewModels$default$2(interfaceC56387yDmEZpvd2), new FragmentUtilKt$getParentViewModel$$inlined$viewModels$default$3(null, interfaceC56387yDmEZpvd2), new FragmentUtilKt$getParentViewModel$$inlined$viewModels$default$4(this, interfaceC56387yDmEZpvd2));
        InterfaceC56387yDm interfaceC56387yDmEZpvd3 = C56392yDr.EZpvd(lazyThreadSafetyMode, new FragmentUtilKt$getParentViewModel$$inlined$viewModels$default$1(new TaskDescription(this)));
        this.AkhnZx = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(WalletSearchHistoryViewModel.class), new FragmentUtilKt$getParentViewModel$$inlined$viewModels$default$2(interfaceC56387yDmEZpvd3), new FragmentUtilKt$getParentViewModel$$inlined$viewModels$default$3(null, interfaceC56387yDmEZpvd3), new FragmentUtilKt$getParentViewModel$$inlined$viewModels$default$4(this, interfaceC56387yDmEZpvd3));
        this.isConnected = C56392yDr.copydefault(new Function0() { // from class: o.fuB
            private static long OLrzqt;
            private static char[] copydefault;
            private static final byte[] $$c = {0, UnsignedBytes.MAX_POWER_OF_TWO, -73, -32, 16};
            private static final int $$d = CipherSuite.TLS_RSA_PSK_WITH_NULL_SHA256;
            private static int $10 = 0;
            private static int $11 = 1;
            private static final byte[] $$a = {101, -78, -82, -26, -25, Ascii.FF, -36, 35, Ascii.EM, Ascii.CR, Ascii.ETB};
            private static final int $$b = 122;
            private static int AEQbTJ = 0;
            private static int EZpvd = 1;

            /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002c). Please report as a decompilation issue!!! */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            private static java.lang.String $$e(int i, byte b, int i2) {
                int i3;
                int i4;
                byte[] bArr = $$c;
                int i5 = 5 - (b * 4);
                int i6 = i2 * 3;
                int i7 = i + WalletImportError.ERROR_CODE_AA_EXIST;
                byte[] bArr2 = new byte[1 - i6];
                int i8 = 0 - i6;
                if (bArr == null) {
                    int i9 = i5;
                    int i10 = 0;
                    i5 += -i7;
                    i4 = i9 + 1;
                    i3 = i10;
                    bArr2[i3] = (byte) i5;
                    i10 = i3 + 1;
                    if (i3 == i8) {
                        return new java.lang.String(bArr2, 0);
                    }
                    i9 = i4;
                    i7 = bArr[i4];
                    i5 += -i7;
                    i4 = i9 + 1;
                    i3 = i10;
                    bArr2[i3] = (byte) i5;
                    i10 = i3 + 1;
                    if (i3 == i8) {
                    }
                } else {
                    i3 = 0;
                    i5 = i7;
                    i4 = i5;
                    bArr2[i3] = (byte) i5;
                    i10 = i3 + 1;
                    if (i3 == i8) {
                    }
                }
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Duplicate block (B:10:0x002c) to fix multi-entry loop: BACK_EDGE: B:9:0x0025 -> B:10:0x002c */
            private static void b(short s, int i, int i2, java.lang.Object[] objArr) {
                int i3 = i + 4;
                int i4 = i2 + 65;
                byte[] bArr = $$a;
                byte[] bArr2 = new byte[4 - s];
                int i5 = 3 - s;
                int i6 = -1;
                if (bArr == null) {
                    i6 = -1;
                    i4 = i4 + (-i3) + 16;
                    i3 = i3;
                }
                while (true) {
                    int i7 = i3 + 1;
                    int i8 = i6 + 1;
                    bArr2[i8] = (byte) i4;
                    if (i8 == i5) {
                        objArr[0] = new java.lang.String(bArr2, 0);
                        return;
                    }
                    i6 = i8;
                    i4 = i4 + (-bArr[i7]) + 16;
                    i3 = i7;
                }
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                int i = 2 % 2;
                int i2 = EZpvd + 121;
                AEQbTJ = i2 % 128;
                if (i2 % 2 == 0) {
                    return C19056fuA.AYXKKw();
                }
                C19056fuA.AYXKKw();
                java.lang.Object obj = null;
                obj.hashCode();
                throw null;
            }

            /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [99=4] */
            /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
            private static void a(char c, int i, int i2, java.lang.Object[] objArr) throws java.lang.Throwable {
                int i3 = 2 % 2;
                Zn zn = new Zn();
                long[] jArr = new long[i];
                zn.EZpvd = 0;
                while (zn.EZpvd < i) {
                    int i4 = zn.EZpvd;
                    try {
                        java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(copydefault[i2 + i4])};
                        java.lang.Object objEZpvd = YY.EZpvd(927695670);
                        if (objEZpvd == null) {
                            byte b = $$c[0];
                            byte b2 = b;
                            objEZpvd = YY.EZpvd(217, 4, (char) 0, 862670410, false, $$e(b, b2, b2), new java.lang.Class[]{java.lang.Integer.TYPE});
                        }
                        java.lang.Object[] objArr3 = {java.lang.Long.valueOf(((java.lang.Long) ((java.lang.reflect.Method) objEZpvd).invoke(null, objArr2)).longValue()), java.lang.Long.valueOf(i4), java.lang.Long.valueOf(OLrzqt), java.lang.Integer.valueOf(c)};
                        java.lang.Object objEZpvd2 = YY.EZpvd(-297691357);
                        if (objEZpvd2 == null) {
                            byte b3 = $$c[0];
                            objEZpvd2 = YY.EZpvd(TypedValues.CycleType.TYPE_WAVE_PERIOD, 5, (char) 0, -362718625, false, $$e((byte) 2, b3, b3), new java.lang.Class[]{java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Integer.TYPE});
                        }
                        jArr[i4] = ((java.lang.Long) ((java.lang.reflect.Method) objEZpvd2).invoke(null, objArr3)).longValue();
                        java.lang.Object[] objArr4 = {zn, zn};
                        java.lang.Object objEZpvd3 = YY.EZpvd(1191971121);
                        if (objEZpvd3 == null) {
                            byte b4 = $$c[0];
                            byte b5 = (byte) (b4 + 1);
                            byte b6 = b4;
                            objEZpvd3 = YY.EZpvd(226, 4, (char) 0, 1127007309, false, $$e(b5, b6, b6), new java.lang.Class[]{java.lang.Object.class, java.lang.Object.class});
                        }
                        ((java.lang.reflect.Method) objEZpvd3).invoke(null, objArr4);
                        int i5 = $10 + 9;
                        $11 = i5 % 128;
                        int i6 = i5 % 2;
                    } catch (java.lang.Throwable th) {
                        java.lang.Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                char[] cArr = new char[i];
                zn.EZpvd = 0;
                int i7 = $11 + 121;
                $10 = i7 % 128;
                int i8 = i7 % 2;
                while (zn.EZpvd < i) {
                    int i9 = $10 + 19;
                    $11 = i9 % 128;
                    if (i9 % 2 == 0) {
                        cArr[zn.EZpvd] = (char) jArr[zn.EZpvd];
                        java.lang.Object[] objArr5 = {zn, zn};
                        java.lang.Object objEZpvd4 = YY.EZpvd(1191971121);
                        if (objEZpvd4 == null) {
                            byte b7 = $$c[0];
                            byte b8 = (byte) (b7 + 1);
                            byte b9 = b7;
                            objEZpvd4 = YY.EZpvd(226, 4, (char) 0, 1127007309, false, $$e(b8, b9, b9), new java.lang.Class[]{java.lang.Object.class, java.lang.Object.class});
                        }
                        ((java.lang.reflect.Method) objEZpvd4).invoke(null, objArr5);
                        throw null;
                    }
                    cArr[zn.EZpvd] = (char) jArr[zn.EZpvd];
                    try {
                        java.lang.Object[] objArr6 = {zn, zn};
                        java.lang.Object objEZpvd5 = YY.EZpvd(1191971121);
                        if (objEZpvd5 == null) {
                            byte b10 = $$c[0];
                            byte b11 = (byte) (b10 + 1);
                            byte b12 = b10;
                            objEZpvd5 = YY.EZpvd(226, 4, (char) 0, 1127007309, false, $$e(b11, b12, b12), new java.lang.Class[]{java.lang.Object.class, java.lang.Object.class});
                        }
                        ((java.lang.reflect.Method) objEZpvd5).invoke(null, objArr6);
                    } catch (java.lang.Throwable th2) {
                        java.lang.Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                }
                objArr[0] = new java.lang.String(cArr);
            }

            static {
                char[] cArr = new char[1959];
                java.nio.ByteBuffer.wrap("\f©¬\u0089L5í±\u008d\u0005.öÎkn\u0007\u000fº¯#HÁèl\u0089ê)¶É=j§\nR«ïKeë\u0004\u0084©$\u001eÅÇek\u0006ï¦\u0096F=\u0083ï#ÏÃsb÷\u0002C¡°A-áA\u0080ü eÇ\u0087g*\u0006¬¦ðFjåì\u0085\u0000$¾Ä\u0019dU\u000bì«uJ\u0091ê)\u0089¬\f©¬\u0089L5í±\u008d\u0005.öÎkn\u0007\u000fº¯#HÁèl\u0089ê)¶É/jº\nX«þïÿOÈ¯\u007f\u000eânSÍª-=\u008dYìýL\u007f«\u009b\u000bfj³ÊÐ*f\u0089ñé\u0006H¢¨%\bIgÓÇu&\u0083\u00869å¬EÆ¥|\u0004à\f©¬\u0088L$í¤\u008d\u0005.õÎcnE\u000f®¯7HÇèo\u0011ÿ±ÞQrðò\u0090S3´Ó;sP\u0012¦²cU\u008cõ&\u0094¤\u0098\u00998®Ø\u0004y\u0094\u0019{ºÓZPút\u009b¼;3ÜÕ|@\u001dÄ½¼](þ\u0092\u009er?Ì*w\u008aWjïËm«\u0095\b`èôHÖ)p\u0089în\u001fÎ¯¯:\u000fX\fô¬\u0082L~í¥\u008dE.þÎpnE\u000f¬¯ HÌèm\u0089í)\u0080É8j\u009c\nX«øKtë(\u0084¾$/ÅÇe*T9ôO\u0014³µhÕ\u0088v3\u0096½6\u0088Wa÷í\u0010\u0001° Ñ qM\u0091õ2QR\u0095ó5\u0013¹³åÜs|â\u009d\n=ä\f©¬\u009eL)í´\u008d^.ôÎinD\u000f²¯,HÊè0\u0089î)\u0080É>j\u00ad\nT«³Ksë\u0018\fä¬\u0084L7í©\u008dE.énÚÎí.Z\u008fÇï-L\u0087¬\u001a\f7mÏÍ_*µ\u008aCë\u009fKÿ«B\bÅh\u0013É£)^\u0089jæÌF_§²\u0007Ed\u009eÄé$E\u0085Èå3B\u0085¢\u0013\f©¬\u009eL)í´\u008d^.ôÎinD\u000f¼¯,HÆè0\u0089ì)\u008cÉ1j¶\n`«ÐK-ë\u0007\u0084¨$.ÅÄ\f©¬\u009eL)í´\u008d^.ôÎinD\u000f²¯,HÊè0\u0089î)\u0080É>j\u00ad\nS«ðKuë!\u0084\u0097$1ÅÆet\u0006þ¦ÛF+ç \f©¬\u0089L5í±\u008d\u0005.ÿÎan\u0006\u000f«¯\"HÝèz\u0089ñ)\u009d\fô¬\u0082L~í¥\u008d_.øÎhn\u000f\u000fð¯-HÇèl\u0089ö\fè¬\u0088L1í´\u008dO.¿Îjn\u000e\u000fª\f©¬\u009dL\"í¨\u008dI.¾Îbn\u0002\u000f²¯ HÛèf\u0089ñ)\u009dÉ9j®\nEL0ìP\få\u00adjÍ\u0081n/\fÚ¬¬0\u0007\u0090qp\u008dÑD±«\u0012\rò\u0093Rí3N\u0093ÂtuÔ\u0081µ\u0010\u0015tõÚVV6¤\u0097\rw\u0087×ñ¸[\u0018×ù5ì8LQ¬ç\rg\fö¬\u0088L\"í´\u008dC.âÎpnE\u000f\u00ad¯<HÛè1\u0089à)\u008dÉrj§\nS«ÿKuë\u0010\u0084ô$&ÅÄen\u0006 ¦\u0093F9ç¤\u0087W ÆÀk`\u0003\u0001\u0093¡\u0012BÂâB\u0083ä#\u0095Ã\u0001|¹\u001c[½×Î/nQ\u008eû/mO\u009aì;\f©¬\u009cÍtmå\u008a\u0002*èK9ëT\u000b«¨~È\u008ai&\u0089¬)ÉF-æÿ\u0007\u001d§·ÄydJ\u0084à%}E\u008eâ\u001f\u0002²¢ÚÃJcË\u0080\u001f \u009bA=áL\u0001Ò¾`\u0091Ö1¨Ñ\u0002p\u0094\u0010c³ÂSPóe\u0092\u008d2\u001cÕûu\u0011\u0014À´\u00adTR÷\u0087\u0097s6ßÖUv0\u0019Ô¹\u0013Xûø\u0015\u009bÍ;¤Û\u0011\fö¬\u0088L\"í´\u008dC.âÎpnE\u000f\u00ad¯<HÛè1\u0089à)\u008dÉrj§\nS«ÿKuë\u0010\u0084ô$3ÅÛe5\u0006â¦\u0094F;\fö¬\u0088L\"í´\u008dC.âÎpnE\u000f\u00ad¯<HÛè1\u0089à)\u008dÉrj§\nS«ÿKuë\u0010\u0084ô$3ÅÛe5\u0006ã¦\u0096F;$æ\u0084\u0098d2Å¤¥S\u0006òæ`FU'½\u0087,`ËÀ!¡ð\u0001\u009dábB·\"C\u0083ïceÃ\u0000¬ä\f#íËM%.ó\u008e\u008bn+\fð¬\u008fL?í¿\u008dY.÷LÇìó\fL\u00adÆÍ'nÐ\u008e\u0007.jOÔï^\bª¨\u0014É\u009f\fð¬\u008fL?í¿\u008dM.äÎan\u0018\u000fª\u0003C£\nC¼â<\u0082Å!|Áòa\u0080\u00003 ©:æ\u009a\u0096z.Û¼»P\u0018óø\u007f\få¬\u0085L\"í¨\u008dG.øÎqn\u0006â@B6¢Ê\u0003\u0003cìÀJ Ô\u0080ªá\tA\u0085¦2\u0006ÏgSÇ+'\u0081\u0084\u0014äç\fð¬\u008fL?í¿\u008d\u0012.§Ît\fá¬\u0088L>í¢\u008dX.øÎg\fá¬\u0088L>í¢\u008dX.øÎgn4\u000f¦¯}H\u009e\u0087\u0082'ëÇ]fÁ\u0006;¥\u009bE\u0004åW\u0084Å$\u001eÃýc#\u0002×¢¾\fô¬\u0082L~í·\u008dX.þÎ`n\u001e\u000f½¯1H\u0086èr\u0089í)\u008dÉ9j¯Ùåy\u0099\u0099+z=Ú^:û\u009buû\u0095X;¸µ\u0018Ç\fÇ¬\u009dL íç\u008dx.äÎjn\u001f\u000f·¯(HÍè?\u0089ä)\u0086É.jã\nu«õKrë\u0018\u0084·$$6t\u00960v\u0087×\u0006·ö\u0014KôÓTø5>\u0095²rPÒ\u008c³S\u0013/ó\u0086P\u001c0ñ\u0091\u000eqÕÑ«¾\u001b\u001eÒÿ\u007f_\u0090<\u000bô·Tó´D\u0015Åu5Ö\u00886\u0010\u0096;÷ýWq°\u0093\u0010Oq\u0090Ñì1E\u0092ßò2SÍ³\u0016\u0013h|ØÜ\u0011=¼\u009dSþÈ^Ú¾\u001e\u001f\u008b\fô¬\u0082L~í¯\u008dK.ãÎ`n\u001c\u000f¿¯7HÍ\fá¬\u0082L<í£\u008dL.øÎwn\u0003\fð¬\u008fL?í¿\u008d\u0012.§\fô¬\u008cL>í¤\u008dB.ä\fô¬\u0082L~í·\u008dX.þÎ`n\u001e\u000f½¯1H\u0086è}\u0089ð)\u0088É2j§Ä¢dÔ\u0084(%úE\u0019æµ\u0006<¦XÇäg=\u0080\u008f ,A¹áÊ\f·û\u008e[ø»\u0004\u001aÎz5Ù\u00889\u000b\u0099cøÁ\f¶¨h\b\u001eèâI9)Ã\u008adjôÊ\u0093«l\u000b©ìFLì-z\u008d\u0000m£Î+©\u0002\tzéÞHI(\u0097\u008b\u000bkÞË¿ßb\u007f\u0014\u009fè>3^Éýn\u001dþ½\u0099Üf|µ\u009bW;çZsú\u001a\u001a¸¹%ÙÒxb\u0098ø8\u0095;Ë\u009b¢{\u0014Ú\u0088ºr\u0019ÒùMYn8\u0087\u0098\u000b\u007féß\u001a¾Ï\u001e¦þ\u0018]\u008c=n\u009cÞ|I\fá¬\u0088L>í¢\u008dX.øÎgn4\u000f¦¯}H\u009eè0\u0089ñ)\u008dÉ7j\u009c\nN«¥K6ëX\u0084½$$ÅÚe~\u0006ü¦\u009cF;ç\u0090\u0087J ¡À:\fá¬\u0088L>í¢\u008dX.øÎgnD\u000f¹¯*HÇèx\u0089î)\u008cÉ\u0003j°\nR«öK/ë\u0010\u0084¿$/ÅÑei\u0006ç¦\u0096\fá¬\u0088L>í¢\u008dX.øÎgnD\u000f¨¯'HÇèg\u0089º)ßÉ,jì\n@«ÿKoë\u000f\u0084â$wÅÄ\r\u0003\u00ad`MÝìB\u008c¤/\u0016ÏÉoú\u000eX®ÌI\u0015é\u009a\u0088\u0010(cÈÑkO\u000b±ª J\u009aê\u00ad\u0085\u000e%\u008cÄ1d\u009c\u0007\u0002§rGÈæD\u0086³!$Á\u0096a©\u00002\u009c×<¡Ü]}\u0086\u001df¾Ý^Sþ$\u009f\u0092?\u0007ØïxY\u0019Ó\fô¬\u0082L~í¥\u008dE.þÎpn\u0002\u000f³¯$HÏèz\u0089¬)\u008bÉ)jª\nZ«ùK.ë\u0011\u0084³$/ÅÓe~\u0006ü¦\u0085F*ç¦\u0087\\ í\fÇ¬\u0083L4íµ\u008dE.øÎ`nF\u000f¦¯}H\u009e\fô¬\u0082L~í¥\u008d_.øÎhn\u000f\u000fð¯!HÁèl\u0089ò)\u0085É=jº\n\u0018«ôKd\tE©?I\u0094è\u0004\u0088°\fï¬\u0083L9í³\u008d\u0004.âÎrn\b\u000fð¯4HÍèr\u0089÷)ÄÉ,j±\nY«íKsæXF'¦\u0092\u0007\u001dg«ÄV$Ü\u0084êå\u001cE\u008b¢n\u0002ÞcFÃ##\u008a\u0080\u001f\f÷¬\u0088L=í²\u008d\u0004.âÎbnE\u000f¸¯$HÃèz\u0089Ý)\u008aÉ=j®\nS«ïKa\f÷¬\u0088L=í²\u008d\u0004.âÎbnE\u000f²¯&HÌè@\u0089æ)\u008cÉ2j°\n_«éKy\fô¬\u0082L~í¬\u008dO.ãÎjn\u000e\u000f²¯kHÉèq\u0089æ)\u009bÉ3jª\nR«³Kqë\u0012\u0084·$4ÅÐ\u0081\u009a!ìÁ\u0010`Ë\u0000+£\u0090C\u001eã+\u0082Á\"NÅ«e\u0004\u0004Â¤æDDçÉ\u0087\u0007&\u009dÆ\u000fft\tÑ\fô¬\u0082L~í¨\u008dN.üÎ*n\t\u000f«¯,HÄè{\u0089¬)\u008fÉ5j\u00ad\nQ«øKrë\u0007\u0084¨$(ÅÚeoûÿ[\u0089»u\u001a¼zSÙõ9k\u0099\u0015ø¶X:¿\u008d\u001fv~üÞ\u008b>;\u009d¬ý\u0013\\ð¼b\u001c\u0012s¶Ó/2Í\u0092`ñ÷Q\u0097±=\u0010°\fô¬\u0082L~í´\u008dS.âÎpn\u000e\u000f³¯kHÊèj\u0089ë)\u0085É8jí\nP«ôKnë\u0010\u0084¿$3ÅÄei\u0006ç¦\u009bF,\"\u0014\u0082bb\u009eÃT£³\u0000\u0002à\u0090@î!S\u0081úf-Æ\u0087§\u0016\u0007'çÞDV$¿\u0085\u0011e\u0084Å¹ª\\\nÈë:K\u009c(\u000b\u0088ghÈÉ]©»\u000e\u0017î\u0098\fô¬\u0082L~í±\u008dO.ÿÎ`n\u0004\u000f¬¯kHÊèj\u0089ë)\u0085É8jí\nP«ôKnë\u0010\u0084¿$3ÅÄei\u0006ç¦\u009bF,\fô¬\u0082L~í±\u008dO.ÿÎ`n\u0004\u000f¬¯\u001aHÌès\u0089é)\u0084Érj¡\nC«ôKlë\u0013\u0084ô$'ÅÝeu\u0006é¦\u0090F*ç¿\u0087@ ðÀb`\u0007\f¼\f©¬\u0089L5í±\u008d\u0005.àÎan\u0006\u000f«¯\u001aHØèv\u0089ò)\u008c\f©¬\u0089L5í±\u008d\u0005.âÎkn\b\u000fµ¯ HÜè0\u0089à)\u0088É/j¦\nT«üKnë\u0013\u0084\u0085$&ÅÑeu\u0006÷¦\u0091\"ë\u0082ËbwÃó£G\u0000 à)@J!÷\u0081bf\u009eÆr§§\u0007ÎçpDø$\u0010%Ã\u0085ãe_ÄÛ¤o\u0007\u0088ç\u0001Gb&ß\u0086Ja¶ÁZ \u0099\u0000æà[CÜ#8\f©¬\u009eL)í´\u008d\u0005.àÎan\u0006\u000f«¯\u001aHÜèm\u0089ã)\u008aÉ9\f©¬\u009eL)í´\u008d^.ôÎinD\u000f²¯,HÊè0\u0089î)\u0080É>j \ni«ðKaë\u001b\u0084¶$.Å×eD\u0006ê¦\u0090F:çº\u0087U ÆÀ}`\u0016\u0001\u008b¡8B\u009eâT\u0083å\u0004ã¤ÃD\u007fåû\u0085O&¹Æ=fU\u0007Ë§h@\u0092à&\f©¬\u0089L5í±\u008d\u0005.óÎwn\u001f\u000f\u0081¯1HÁèr\u0089ç\f©¬\u0089L5í±\u008d\u0005.âÎkn\b\u000fµ¯ HÜè0\u0089à)\u009aÉ(j¥\nY«ñKdë\u0012\u0084¨$%Ðªp\u009d\u0090*1·Q]ò÷\u0012j²GÓ±s/\u0094É43Uíõ\u0083\u0015=¶¢ÖFwê\u0097e7\u001bXµø&\u0019Ò¹jÚÒz\u009c\u009a5;¥[\u001füé\u001c`\u009eö>ÖÞj\u007fî\u001fZ¼¬\\(ü@\u009dà=yÚ\u0094z%\u0014ª´\u008aT6õ²\u0095\u00066ðÖtv\u001c\u0017º·?PÙðs\f©¬\u0089L5í±\u008d\u0005.óÎwn\u001f\u000f³¯ HÏèq\f©¬\u0089L5í±\u008d\u0005.óÎwn\u001f\u000f±¯7HÁèzE\u008eå®\u0005\u0012¤\u0096Ä\"gÔ\u0087P'8F\u008fæ\u000f\u0001ü¡_öYVy¶Å\u0017AwõÔ\u00034\u0087\u0094ïõ^UÒ²9\u0012\u0086s\u0002Óz\f©¬\u0089L5í±\u008d\u0005.óÎwn\u001f\u000f\u0081¯,HÅèz\f©¬\u0089L1í³\u008dK.¾Î`n\u0004\u000f©¯+HÄèp\u0089ã)\u008dÉ/jì\n\u0018«åKbëX\u0084¸$2ÅÀep\f©¬\u0080L>í³\u008d\u0005.æÎmn\u0005\u000fº¯*Hßèl\u0089\u00ad)«É/j·\ne«õKaë\u0005\u0084¿$%Åòet\u0006â¦\u0091F=ç½\f©¬\u009dL\"í¨\u008dI.¾Îmn\u0004\u000f®¯*HÚèk\u0089ñü\u000f\\2¼\u008f\u001d^}©\u0005í¥ÙEfäì\u0084\r'úÇ3gJ\u0006ö¦gAÃá6\u0080§ ÝÀk\u0083\u0001#\u007fÃÑbK\u0002¦¡\u001eA\u0087á¥\u0080Y ÊÇ$g\u009b\u0006\u0004¦`FÏåK\u0085ø$\u000eÄ\u008f\fê¬\u0084L2í\u0080\u008df.ÔÎWn4\u000f¼¯6HÜè1\u0089ñ)\u0086;%\u009b\u0004{¨Ú(º\u0089\u0019pùíY\u00838;\u0098¨\u007f{ßð¾a\u001e\u0001þµ],=É\u009c?|ôÜ\u0096³:\u0000\u0013 v@ÒáU\u0081®\"\u0012Â\u0092bÿ\u0003B£ÁK\u0018ë9\u000b\u0095ª\u0015Ê´iM\u0089Ú)¯H\u0001è\u0080\u000fj\u009aÿ:ßÚg{å\u001b\u001d¸èX6øR\u0099ÿ9}Þ\u0092~&\u001fµ¿Û_yüº\u009cN=¯Ý&}\u000e\u0012í²gS\u0092ó>\u0090ö0ÛÐcqõ\f©¬\u009dL\"í¨\u008dI.¾Îgn\u001b\u000f«¯,HÆèy\u0089í\fÁ¬\u0082L<í£\u008dL.øÎwn\u0003¯\u0092\u000f²ï\nN\u0088.p\u008d\u0085mRÍ9¬\u0096\f\u001dë¼KT*Ë\u008a½j\u0001É\u0091©a\bÃèHHc'\u0082\u0087\u000ffýÆ\u000f¥\u0085\u0005áå\u0000D\u009b$d\u0083\u008ccZÃ!¢¾\u0002\u0004áäAj Ø\u0080¸`+ßÞ¿h\u001eûþ^^1=°\u009d\u001f|â".getBytes("ISO-8859-1")).asCharBuffer().get(cArr, 0, 1959);
                copydefault = cArr;
                OLrzqt = -7128128402961158931L;
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
            public static java.lang.Object[] KWHzl(android.content.Context r82, int r83, int r84, int r85) {
                /*
                    r1 = r83
                    r2 = r85
                    r3 = 2
                    int r0 = r3 % r3
                    int r0 = o.C19057fuB.AEQbTJ
                    r4 = r0 ^ 67
                    r0 = r0 & 67
                    r5 = 1
                    int r0 = r0 << r5
                    int r4 = r4 + r0
                    int r0 = r4 % 128
                    o.C19057fuB.EZpvd = r0
                    int r4 = r4 % r3
                    java.lang.Object[] r0 = new java.lang.Object[r5]
                    r4 = 30430(0x76de, float:4.2642E-41)
                    r6 = 8
                    r7 = 717(0x2cd, float:1.005E-42)
                    a(r4, r6, r7, r0)
                    r4 = 0
                    r0 = r0[r4]
                    java.lang.String r0 = (java.lang.String) r0
                    java.lang.Object[] r7 = new java.lang.Object[r5]
                    r14 = 27
                    a(r4, r14, r4, r7)
                    r7 = r7[r4]
                    java.lang.String r7 = (java.lang.String) r7
                    java.lang.Object[] r8 = new java.lang.Object[r5]
                    r9 = 36678(0x8f46, float:5.1397E-41)
                    r10 = 25
                    a(r9, r10, r14, r8)
                    r8 = r8[r4]
                    java.lang.String r8 = (java.lang.String) r8
                    java.lang.Object[] r9 = new java.lang.Object[r5]
                    r10 = 18
                    r11 = 52
                    a(r4, r10, r11, r9)
                    r9 = r9[r4]
                    java.lang.String r9 = (java.lang.String) r9
                    java.lang.Object[] r10 = new java.lang.Object[r5]
                    r11 = 58198(0xe356, float:8.1553E-41)
                    r15 = 28
                    r12 = 70
                    a(r11, r15, r12, r10)
                    r10 = r10[r4]
                    java.lang.String r10 = (java.lang.String) r10
                    java.lang.String[] r7 = new java.lang.String[]{r7, r8, r9, r10}
                    r8 = r4
                L60:
                    r13 = -1
                    r12 = 32
                    r11 = 4
                    r10 = 0
                    if (r8 >= r11) goto L1bb
                    r9 = r7[r8]
                    java.lang.Object[] r9 = new java.lang.Object[]{r9}     // Catch: java.lang.Throwable -> L1b8
                    r16 = 1704729038(0x659c19ce, float:9.214565E22)
                    java.lang.Object r16 = o.YY.EZpvd(r16)     // Catch: java.lang.Throwable -> L1b8
                    if (r16 != 0) goto L9f
                    r17 = 511(0x1ff, float:7.16E-43)
                    r18 = 5
                    r19 = 43308(0xa92c, float:6.0687E-41)
                    r20 = 1639765170(0x61bcd4b2, float:4.3541427E20)
                    r21 = 0
                    byte r6 = (byte) r5     // Catch: java.lang.Throwable -> L1b8
                    int r14 = -r6
                    byte r14 = (byte) r14     // Catch: java.lang.Throwable -> L1b8
                    int r15 = r14 + 4
                    byte r15 = (byte) r15     // Catch: java.lang.Throwable -> L1b8
                    java.lang.Object[] r11 = new java.lang.Object[r5]     // Catch: java.lang.Throwable -> L1b8
                    b(r6, r14, r15, r11)     // Catch: java.lang.Throwable -> L1b8
                    r6 = r11[r4]     // Catch: java.lang.Throwable -> L1b8
                    r22 = r6
                    java.lang.String r22 = (java.lang.String) r22     // Catch: java.lang.Throwable -> L1b8
                    java.lang.Class[] r6 = new java.lang.Class[r5]     // Catch: java.lang.Throwable -> L1b8
                    java.lang.Class<java.lang.String> r11 = java.lang.String.class
                    r6[r4] = r11     // Catch: java.lang.Throwable -> L1b8
                    r23 = r6
                    java.lang.Object r16 = o.YY.EZpvd(r17, r18, r19, r20, r21, r22, r23)     // Catch: java.lang.Throwable -> L1b8
                L9f:
                    r6 = r16
                    java.lang.reflect.Method r6 = (java.lang.reflect.Method) r6     // Catch: java.lang.Throwable -> L1b8
                    java.lang.Object r6 = r6.invoke(r10, r9)     // Catch: java.lang.Throwable -> L1b8
                    java.lang.Long r6 = (java.lang.Long) r6     // Catch: java.lang.Throwable -> L1b8
                    long r14 = r6.longValue()     // Catch: java.lang.Throwable -> L1b8
                    r6 = 1202580847(0x47aded6f, float:89050.87)
                    long r10 = (long) r6
                    r6 = -721(0xfffffffffffffd2f, float:NaN)
                    long r3 = (long) r6
                    long r19 = r3 * r10
                    long r3 = r3 * r14
                    long r19 = r19 + r3
                    r3 = 1444(0x5a4, float:2.023E-42)
                    long r3 = (long) r3
                    long r5 = (long) r1
                    r9 = r7
                    r22 = r8
                    long r7 = (long) r13
                    long r26 = r5 ^ r7
                    long r28 = r10 ^ r7
                    long r30 = r14 ^ r7
                    long r32 = r28 | r30
                    long r32 = r32 ^ r7
                    long r26 = r26 | r32
                    long r32 = r10 | r14
                    long r32 = r32 ^ r7
                    long r26 = r26 | r32
                    long r3 = r3 * r26
                    long r19 = r19 + r3
                    r3 = -1444(0xfffffffffffffa5c, float:NaN)
                    long r3 = (long) r3
                    long r26 = r10 | r5
                    long r26 = r26 ^ r7
                    long r26 = r32 | r26
                    long r5 = r5 | r14
                    long r5 = r5 ^ r7
                    long r5 = r26 | r5
                    long r3 = r3 * r5
                    long r19 = r19 + r3
                    r3 = 722(0x2d2, float:1.012E-42)
                    long r3 = (long) r3
                    long r5 = r28 | r14
                    long r5 = r5 ^ r7
                    long r10 = r30 | r10
                    long r7 = r7 ^ r10
                    long r5 = r5 | r7
                    long r3 = r3 * r5
                    long r19 = r19 + r3
                    r3 = -1368177574(0xffffffffae73445a, float:-5.531251E-11)
                    long r3 = (long) r3
                    long r3 = r19 + r3
                    long r5 = r3 >> r12
                    int r5 = (int) r5
                    java.lang.Runtime r6 = java.lang.Runtime.getRuntime()
                    long r6 = r6.freeMemory()
                    int r6 = (int) r6
                    int r7 = ~r6
                    r8 = 2011163605(0x77dfebd5, float:9.083324E33)
                    r8 = r8 | r7
                    int r8 = ~r8
                    r10 = -274246422(0xffffffffefa754ea, float:-1.035733E29)
                    r10 = r10 | r6
                    int r10 = ~r10
                    r8 = r8 | r10
                    int r8 = r8 * 988
                    r10 = 806443398(0x30115986, float:5.2877913E-10)
                    int r8 = r8 + r10
                    r10 = 299690773(0x11dceb15, float:3.485476E-28)
                    r6 = r6 | r10
                    int r6 = ~r6
                    r10 = 1711472832(0x660300c0, float:1.5466096E23)
                    r6 = r6 | r10
                    r10 = -274246422(0xffffffffefa754ea, float:-1.035733E29)
                    r7 = r7 | r10
                    int r7 = ~r7
                    r6 = r6 | r7
                    int r6 = r6 * 988
                    int r8 = r8 + r6
                    r5 = r5 & r8
                    int r3 = (int) r3
                    int r4 = ~r1
                    r6 = 1085784795(0x40b7c2db, float:5.742536)
                    r6 = r6 | r4
                    int r6 = ~r6
                    r7 = 2228353(0x220081, float:3.122588E-39)
                    r7 = r7 | r6
                    int r7 = r7 * (-970)
                    r8 = 1941514779(0x73b92a1b, float:2.9340482E31)
                    int r7 = r7 + r8
                    r8 = 1083556442(0x4095c25a, float:4.6799746)
                    r6 = r6 | r8
                    int r6 = r6 * 970
                    int r7 = r7 + r6
                    r3 = r3 & r7
                    r6 = r5 ^ r3
                    r3 = r3 & r5
                    r3 = r3 | r6
                    long r5 = (long) r3
                    int r3 = (int) r5
                    if (r3 == 0) goto L1a8
                    r3 = r22
                    int r8 = r3 * 471
                    int r5 = ~r8
                    r6 = 89489(0x15d91, float:1.25401E-40)
                    int r6 = r6 - r5
                    r5 = r3 ^ 190(0xbe, float:2.66E-43)
                    r7 = r3 & 190(0xbe, float:2.66E-43)
                    r5 = r5 | r7
                    int r5 = r5 * (-470)
                    int r5 = -r5
                    int r5 = -r5
                    r7 = r6 | r5
                    r8 = 1
                    int r7 = r7 << r8
                    r5 = r5 ^ r6
                    int r7 = r7 - r5
                    int r5 = ~r3
                    r6 = -191(0xffffffffffffff41, float:NaN)
                    r8 = r6 ^ r5
                    r5 = r5 & r6
                    r5 = r5 | r8
                    int r5 = ~r5
                    int r6 = ~r3
                    r8 = r6 | r1
                    int r8 = ~r8
                    r9 = r5 ^ r8
                    r5 = r5 & r8
                    r5 = r5 | r9
                    r8 = r4 ^ 190(0xbe, float:2.66E-43)
                    r4 = r4 & 190(0xbe, float:2.66E-43)
                    r4 = r4 | r8
                    r8 = r4 ^ r3
                    r4 = r4 & r3
                    r4 = r4 | r8
                    int r4 = ~r4
                    r8 = r5 ^ r4
                    r4 = r4 & r5
                    r4 = r4 | r8
                    int r4 = r4 * (-470)
                    r5 = r7 | r4
                    r8 = 1
                    int r5 = r5 << r8
                    r4 = r4 ^ r7
                    int r5 = r5 - r4
                    r4 = r6 | 190(0xbe, float:2.66E-43)
                    r6 = r4 ^ r1
                    r4 = r4 & r1
                    r4 = r4 | r6
                    int r4 = ~r4
                    int r6 = ~r1
                    r7 = r6 ^ 190(0xbe, float:2.66E-43)
                    r6 = r6 & 190(0xbe, float:2.66E-43)
                    r6 = r6 | r7
                    r3 = r3 | r6
                    int r3 = ~r3
                    r3 = r3 | r4
                    int r3 = r3 * 470
                    r4 = r5 ^ r3
                    r3 = r3 & r5
                    r5 = 1
                    int r3 = r3 << r5
                    int r4 = r4 + r3
                    r3 = r1 & r4
                    int r3 = ~r3
                    r4 = r4 | r1
                    r3 = r3 & r4
                    goto L1bc
                L1a8:
                    r3 = r22
                    int r8 = r3 + 1
                    r7 = r9
                    r3 = 2
                    r4 = 0
                    r5 = 1
                    r6 = 8
                    r14 = 27
                    r15 = 28
                    goto L60
                L1b8:
                    r0 = move-exception
                    goto L2ae5
                L1bb:
                    r3 = r1
                L1bc:
                    r4 = -17
                    r5 = 16
                    r6 = 3
                    r14 = 5
                    if (r3 == r1) goto L293
                    java.lang.Object[] r0 = new java.lang.Object[r14]
                    r7 = 1
                    int[] r8 = new int[r7]
                    r9 = 0
                    r0[r9] = r8
                    int[] r8 = new int[r7]
                    r9 = 2
                    r0[r9] = r8
                    int[] r9 = new int[r7]
                    r0[r6] = r9
                    int[] r8 = (int[]) r8
                    int r6 = o.C19057fuB.AEQbTJ
                    int r6 = r6 + 79
                    int r7 = r6 % 128
                    o.C19057fuB.EZpvd = r7
                    r10 = 2
                    int r6 = r6 % r10
                    r6 = 0
                    r8[r6] = r1
                    int[] r9 = (int[]) r9
                    r9[r6] = r3
                    r3 = 0
                    r6 = 1
                    r0[r6] = r3
                    int r7 = r7 + 95
                    int r6 = r7 % 128
                    o.C19057fuB.AEQbTJ = r6
                    r6 = 2
                    int r7 = r7 % r6
                    if (r7 != 0) goto L28b
                    r6 = 4
                    r0[r6] = r3
                    r3 = 14671494(0xdfde86, float:2.0559142E-38)
                    r3 = r3 | r1
                    int r3 = ~r3
                    r6 = -1272970920(0xffffffffb4200158, float:-1.490165E-7)
                    r3 = r3 | r6
                    r6 = 1260203045(0x4b1d2c25, float:1.0300453E7)
                    r6 = r6 | r1
                    int r6 = ~r6
                    r3 = r3 | r6
                    int r3 = r3 * (-744)
                    r6 = 1955989939(0x749609b3, float:9.509781E31)
                    int r6 = r6 + r3
                    int r3 = ~r1
                    r7 = 1903620(0x1d0c04, float:2.66754E-39)
                    r3 = r3 | r7
                    int r3 = r3 * 744
                    int r6 = r6 + r3
                    r3 = 1272970919(0x4bdffea7, float:2.9359438E7)
                    r1 = r1 | r3
                    int r1 = r1 * 744
                    int r6 = r6 + r1
                    int r1 = o.C14220dhO.OLrzqt()
                    int r3 = r6 * (-167)
                    int r3 = -r3
                    int r3 = -r3
                    r7 = -2672(0xfffffffffffff590, float:NaN)
                    r8 = r7 | r3
                    r9 = 1
                    int r8 = r8 << r9
                    r3 = r3 ^ r7
                    int r8 = r8 - r3
                    int r3 = ~r6
                    r7 = r4 ^ r3
                    r4 = r4 & r3
                    r4 = r4 | r7
                    int r4 = ~r4
                    r7 = r3 ^ r1
                    r9 = r3 & r1
                    r7 = r7 | r9
                    int r7 = ~r7
                    r9 = r4 ^ r7
                    r4 = r4 & r7
                    r4 = r4 | r9
                    int r4 = r4 * 336
                    r7 = r8 & r4
                    r4 = r4 | r8
                    int r7 = r7 + r4
                    r4 = r5 ^ r6
                    r6 = r6 & r5
                    r4 = r4 | r6
                    int r4 = ~r4
                    r6 = r5 | r1
                    int r6 = ~r6
                    r8 = r4 ^ r6
                    r4 = r4 & r6
                    r4 = r4 | r8
                    int r4 = r4 * (-168)
                    r6 = r7 & r4
                    r4 = r4 | r7
                    int r6 = r6 + r4
                    int r1 = ~r1
                    r4 = r1 ^ 16
                    r1 = r1 & r5
                    r1 = r1 | r4
                    int r1 = ~r1
                    r4 = r3 ^ r1
                    r1 = r1 & r3
                    r1 = r1 | r4
                    int r1 = r1 * 168
                    r3 = r6 & r1
                    r1 = r1 | r6
                    int r3 = r3 + r1
                    int r1 = -r3
                    int r1 = -r1
                    r3 = r2 | r1
                    r4 = 1
                    int r3 = r3 << r4
                    r1 = r1 ^ r2
                    int r3 = r3 - r1
                    int r1 = r3 << 13
                    r2 = r3 & r1
                    int r2 = ~r2
                    r1 = r1 | r3
                    r1 = r1 & r2
                    int r2 = r1 >>> 17
                    r3 = r1 & r2
                    int r3 = ~r3
                    r1 = r1 | r2
                    r1 = r1 & r3
                    int r2 = r1 << 5
                    r3 = r1 & r2
                    int r3 = ~r3
                    r1 = r1 | r2
                    r1 = r1 & r3
                    r3 = 0
                    r2 = r0[r3]
                    int[] r2 = (int[]) r2
                    r2[r3] = r1
                    goto L2ae4
                L28b:
                    r2 = r3
                    r1 = 4
                    r0[r1] = r2
                    o.C14220dhO.OLrzqt()
                    throw r2
                L293:
                    r3 = 0
                    r7 = 1
                    java.lang.Object[] r8 = new java.lang.Object[r7]
                    r15 = 12
                    r9 = 98
                    a(r3, r15, r9, r8)
                    r8 = r8[r3]
                    java.lang.String r8 = (java.lang.String) r8
                    java.lang.Object[] r9 = new java.lang.Object[r7]
                    r10 = 7510(0x1d56, float:1.0524E-41)
                    r11 = 13
                    r15 = 110(0x6e, float:1.54E-43)
                    a(r10, r11, r15, r9)
                    r9 = r9[r3]
                    java.lang.String r9 = (java.lang.String) r9
                    java.lang.Object[] r10 = new java.lang.Object[r7]
                    r7 = 37936(0x9430, float:5.316E-41)
                    r15 = 18
                    r11 = 123(0x7b, float:1.72E-43)
                    a(r7, r15, r11, r10)
                    r7 = r10[r3]
                    java.lang.String r7 = (java.lang.String) r7
                    java.lang.String[] r3 = new java.lang.String[]{r8, r9, r7}
                    r7 = 0
                L2c6:
                    if (r7 >= r6) goto L430
                    r8 = r3[r7]
                    java.lang.Object[] r8 = new java.lang.Object[]{r8}     // Catch: java.lang.Throwable -> L1b8
                    r9 = 1229107605(0x4942b195, float:797465.3)
                    java.lang.Object r9 = o.YY.EZpvd(r9)     // Catch: java.lang.Throwable -> L1b8
                    if (r9 != 0) goto L303
                    r26 = 511(0x1ff, float:7.16E-43)
                    r27 = 5
                    r28 = 43308(0xa92c, float:6.0687E-41)
                    r29 = 1298300137(0x4d627ce9, float:2.37489808E8)
                    r30 = 0
                    r9 = 0
                    byte r10 = (byte) r9     // Catch: java.lang.Throwable -> L1b8
                    int r11 = r10 + 1
                    byte r11 = (byte) r11     // Catch: java.lang.Throwable -> L1b8
                    int r15 = r11 + (-1)
                    byte r15 = (byte) r15     // Catch: java.lang.Throwable -> L1b8
                    r4 = 1
                    java.lang.Object[] r5 = new java.lang.Object[r4]     // Catch: java.lang.Throwable -> L1b8
                    b(r10, r11, r15, r5)     // Catch: java.lang.Throwable -> L1b8
                    r5 = r5[r9]     // Catch: java.lang.Throwable -> L1b8
                    r31 = r5
                    java.lang.String r31 = (java.lang.String) r31     // Catch: java.lang.Throwable -> L1b8
                    java.lang.Class[] r5 = new java.lang.Class[r4]     // Catch: java.lang.Throwable -> L1b8
                    java.lang.Class<java.lang.String> r4 = java.lang.String.class
                    r5[r9] = r4     // Catch: java.lang.Throwable -> L1b8
                    r32 = r5
                    java.lang.Object r9 = o.YY.EZpvd(r26, r27, r28, r29, r30, r31, r32)     // Catch: java.lang.Throwable -> L1b8
                L303:
                    java.lang.reflect.Method r9 = (java.lang.reflect.Method) r9     // Catch: java.lang.Throwable -> L1b8
                    r4 = 0
                    java.lang.Object r5 = r9.invoke(r4, r8)     // Catch: java.lang.Throwable -> L1b8
                    java.lang.Long r5 = (java.lang.Long) r5     // Catch: java.lang.Throwable -> L1b8
                    long r4 = r5.longValue()     // Catch: java.lang.Throwable -> L1b8
                    r8 = -76574583(0xfffffffffb6f9089, float:-1.2438905E36)
                    long r8 = (long) r8
                    java.lang.Runtime r10 = java.lang.Runtime.getRuntime()
                    long r10 = r10.freeMemory()
                    int r10 = (int) r10
                    r11 = 960(0x3c0, float:1.345E-42)
                    long r14 = (long) r11
                    long r14 = r14 * r8
                    r11 = -1917(0xfffffffffffff883, float:NaN)
                    r28 = r7
                    long r6 = (long) r11
                    long r6 = r6 * r4
                    long r14 = r14 + r6
                    r6 = 959(0x3bf, float:1.344E-42)
                    long r6 = (long) r6
                    r11 = r3
                    long r2 = (long) r13
                    long r4 = r4 ^ r2
                    long r12 = (long) r10
                    long r31 = r12 ^ r2
                    long r33 = r4 | r31
                    long r33 = r33 ^ r2
                    long r35 = r8 | r12
                    long r35 = r35 ^ r2
                    long r33 = r33 | r35
                    long r33 = r33 * r6
                    long r14 = r14 + r33
                    r10 = -959(0xfffffffffffffc41, float:NaN)
                    r33 = r11
                    long r10 = (long) r10
                    long r10 = r10 * r4
                    long r14 = r14 + r10
                    long r4 = r4 | r12
                    long r4 = r4 ^ r2
                    long r8 = r31 | r8
                    long r2 = r2 ^ r8
                    long r2 = r2 | r4
                    long r6 = r6 * r2
                    long r14 = r14 + r6
                    r2 = 2104408869(0x7d6ebb25, float:1.9832998E37)
                    long r2 = (long) r2
                    long r14 = r14 + r2
                    r2 = 32
                    long r3 = r14 >> r2
                    int r2 = (int) r3
                    r3 = -553912451(0xffffffffdefbf77d, float:-9.0780589E18)
                    r3 = r3 | r1
                    int r3 = ~r3
                    r4 = 76611880(0x4910128, float:3.4090398E-36)
                    r3 = r3 | r4
                    int r3 = r3 * 501
                    r4 = -922850312(0xffffffffc8fe6bf8, float:-521055.75)
                    int r3 = r3 + r4
                    int r4 = ~r1
                    r5 = -553912451(0xffffffffdefbf77d, float:-9.0780589E18)
                    r5 = r5 | r4
                    int r5 = ~r5
                    int r5 = r5 * 501
                    int r3 = r3 + r5
                    r2 = r2 & r3
                    int r3 = (int) r14
                    java.util.Random r5 = new java.util.Random
                    r5.<init>()
                    int r5 = r5.nextInt()
                    int r6 = ~r5
                    r7 = -450581967(0xffffffffe524aa31, float:-4.8600474E22)
                    r8 = r7 | r6
                    int r8 = ~r8
                    r9 = 173692038(0xa5a5486, float:1.0512215E-32)
                    r8 = r8 | r9
                    r9 = 1887808376(0x7085ab78, float:3.309504E29)
                    r10 = r9 | r6
                    int r10 = ~r10
                    r8 = r8 | r10
                    int r8 = r8 * (-1136)
                    r10 = -1738041619(0xffffffff986796ed, float:-2.9932248E-24)
                    int r10 = r10 + r8
                    r7 = r7 | r5
                    int r7 = ~r7
                    r8 = r9 | r5
                    int r8 = ~r8
                    r7 = r7 | r8
                    r8 = 450581966(0x1adb55ce, float:9.07149E-23)
                    r8 = r8 | r6
                    r9 = -1610918449(0xffffffff9ffb55cf, float:-1.06444593E-19)
                    r9 = r9 | r6
                    int r9 = ~r9
                    r7 = r7 | r9
                    int r7 = r7 * (-568)
                    int r10 = r10 + r7
                    int r7 = ~r8
                    r8 = -1887808377(0xffffffff8f7a5487, float:-1.2342231E-29)
                    r6 = r6 | r8
                    int r6 = ~r6
                    r6 = r6 | r7
                    r7 = -173692039(0xfffffffff5a5ab79, float:-4.200229E32)
                    r5 = r5 | r7
                    int r5 = ~r5
                    r5 = r5 | r6
                    int r5 = r5 * 568
                    int r10 = r10 + r5
                    r3 = r3 & r10
                    r5 = r2 ^ r3
                    r2 = r2 & r3
                    r2 = r2 | r5
                    long r2 = (long) r2
                    int r2 = (int) r2
                    if (r2 == 0) goto L41d
                    int r2 = o.C14220dhO.OLrzqt()
                    int r7 = r28 * 53
                    r3 = -13770(0xffffffffffffca36, float:NaN)
                    int r3 = r3 + r7
                    int r5 = ~r2
                    r6 = r5 ^ 270(0x10e, float:3.78E-43)
                    r7 = r5 & 270(0x10e, float:3.78E-43)
                    r6 = r6 | r7
                    r7 = r6 ^ r28
                    r8 = r6 & r28
                    r7 = r7 | r8
                    int r7 = ~r7
                    int r7 = r7 * 52
                    int r7 = ~r7
                    int r3 = r3 - r7
                    r7 = 1
                    int r3 = r3 - r7
                    r7 = r28
                    int r8 = ~r7
                    int r2 = ~r2
                    r9 = r8 ^ r2
                    r2 = r2 & r8
                    r2 = r2 | r9
                    int r2 = ~r2
                    int r8 = ~r7
                    r9 = r8 ^ 270(0x10e, float:3.78E-43)
                    r8 = r8 & 270(0x10e, float:3.78E-43)
                    r8 = r8 | r9
                    int r8 = ~r8
                    r9 = r2 ^ r8
                    r2 = r2 & r8
                    r2 = r2 | r9
                    int r6 = ~r6
                    r8 = r2 ^ r6
                    r2 = r2 & r6
                    r2 = r2 | r8
                    int r2 = r2 * (-52)
                    int r2 = -r2
                    int r2 = -r2
                    int r2 = ~r2
                    int r3 = r3 - r2
                    r2 = 1
                    int r3 = r3 - r2
                    r2 = -271(0xfffffffffffffef1, float:NaN)
                    r6 = r2 ^ r5
                    r2 = r2 & r5
                    r2 = r2 | r6
                    int r2 = ~r2
                    r5 = -271(0xfffffffffffffef1, float:NaN)
                    r6 = r5 ^ r7
                    r5 = r5 & r7
                    r5 = r5 | r6
                    int r5 = ~r5
                    r6 = r2 ^ r5
                    r2 = r2 & r5
                    r2 = r2 | r6
                    int r2 = r2 * 52
                    int r2 = -r2
                    int r2 = -r2
                    r5 = r3 ^ r2
                    r2 = r2 & r3
                    r3 = 1
                    int r2 = r2 << r3
                    int r5 = r5 + r2
                    int r2 = ~r5
                    r2 = r2 & r1
                    r3 = r5 & r4
                    r2 = r2 | r3
                    goto L431
                L41d:
                    r7 = r28
                    int r7 = r7 + 1
                    r2 = r85
                    r3 = r33
                    r4 = -17
                    r5 = 16
                    r6 = 3
                    r12 = 32
                    r13 = -1
                    r14 = 5
                    goto L2c6
                L430:
                    r2 = r1
                L431:
                    if (r2 == r1) goto L4f4
                    r3 = 5
                    java.lang.Object[] r0 = new java.lang.Object[r3]
                    r3 = 1
                    int[] r4 = new int[r3]
                    r5 = 0
                    r0[r5] = r4
                    int[] r4 = new int[r3]
                    r6 = 2
                    r0[r6] = r4
                    int[] r6 = new int[r3]
                    r7 = 3
                    r0[r7] = r6
                    int[] r4 = (int[]) r4
                    r4[r5] = r1
                    int[] r6 = (int[]) r6
                    r6[r5] = r2
                    r2 = 0
                    r0[r3] = r2
                    r3 = 4
                    r0[r3] = r2
                    long r2 = android.os.Process.getStartElapsedRealtime()
                    int r2 = (int) r2
                    int r3 = ~r2
                    r4 = -223879240(0xfffffffff2a7dfb8, float:-6.6501704E30)
                    r4 = r4 | r3
                    int r4 = ~r4
                    r5 = -1050995301(0xffffffffc15b159b, float:-13.692775)
                    r5 = r5 | r2
                    int r5 = ~r5
                    r4 = r4 | r5
                    int r4 = r4 * 1900
                    r5 = 1324839961(0x4ef77419, float:2.07579046E9)
                    int r5 = r5 + r4
                    r4 = 1050995300(0x3ea4ea64, float:0.32210076)
                    r6 = r3 | r4
                    int r6 = ~r6
                    r7 = 223879239(0xd582047, float:6.659899E-31)
                    r8 = r2 | r7
                    int r8 = ~r8
                    r6 = r6 | r8
                    int r6 = r6 * (-950)
                    int r5 = r5 + r6
                    r3 = r3 | r7
                    int r3 = ~r3
                    r2 = r2 | r4
                    int r2 = ~r2
                    r2 = r2 | r3
                    int r2 = r2 * 950
                    int r5 = r5 + r2
                    r2 = r5 & 16
                    r3 = 16
                    r3 = r3 | r5
                    int r2 = r2 + r3
                    int r3 = r2 * (-830)
                    r4 = r85
                    int r5 = r4 * 832
                    int r5 = -r5
                    int r5 = -r5
                    int r5 = ~r5
                    int r3 = r3 - r5
                    r5 = 1
                    int r3 = r3 - r5
                    int r5 = ~r4
                    int r6 = ~r1
                    r7 = r5 ^ r6
                    r5 = r5 & r6
                    r5 = r5 | r7
                    int r5 = ~r5
                    r6 = r2 | r4
                    r7 = r6 ^ r1
                    r6 = r6 & r1
                    r6 = r6 | r7
                    int r6 = ~r6
                    r5 = r5 | r6
                    int r5 = r5 * (-831)
                    int r3 = r3 + r5
                    int r5 = ~r4
                    r6 = r5 ^ r2
                    r5 = r5 & r2
                    r5 = r5 | r6
                    r5 = r5 | r1
                    int r5 = ~r5
                    int r5 = r5 * (-1662)
                    r6 = r3 | r5
                    r7 = 1
                    int r6 = r6 << r7
                    r3 = r3 ^ r5
                    int r6 = r6 - r3
                    int r3 = ~r2
                    int r5 = ~r1
                    r3 = r3 | r5
                    int r3 = ~r3
                    r5 = r2 ^ r1
                    r2 = r2 & r1
                    r2 = r2 | r5
                    int r2 = ~r2
                    r5 = r3 ^ r2
                    r2 = r2 & r3
                    r2 = r2 | r5
                    r3 = r4 ^ r1
                    r1 = r1 & r4
                    r1 = r1 | r3
                    int r1 = ~r1
                    r3 = r2 ^ r1
                    r1 = r1 & r2
                    r1 = r1 | r3
                    int r1 = r1 * 831
                    int r1 = -r1
                    int r1 = -r1
                    r2 = r6 | r1
                    r3 = 1
                    int r2 = r2 << r3
                    r1 = r1 ^ r6
                    int r2 = r2 - r1
                    int r1 = r2 << 13
                    int r3 = ~r1
                    r3 = r3 & r2
                    int r2 = ~r2
                    r1 = r1 & r2
                    r1 = r1 | r3
                    int r2 = r1 >>> 17
                    int r3 = ~r2
                    r3 = r3 & r1
                    int r1 = ~r1
                    r1 = r1 & r2
                    r1 = r1 | r3
                    int r2 = r1 << 5
                    int r3 = ~r2
                    r3 = r3 & r1
                    int r1 = ~r1
                    r1 = r1 & r2
                    r1 = r1 | r3
                    r2 = 0
                    r3 = r0[r2]
                    int[] r3 = (int[]) r3
                    r3[r2] = r1
                    goto L2ae4
                L4f4:
                    r4 = r85
                    r2 = 0
                    r3 = 1
                    java.lang.Object[] r5 = new java.lang.Object[r3]
                    r3 = 9950(0x26de, float:1.3943E-41)
                    r6 = 14
                    r7 = 141(0x8d, float:1.98E-43)
                    a(r3, r6, r7, r5)
                    r3 = r5[r2]
                    java.lang.String r3 = (java.lang.String) r3
                    java.lang.Object[] r2 = new java.lang.Object[]{r3}     // Catch: java.lang.Throwable -> L1b8
                    r3 = -924280847(0xffffffffc8e897f1, float:-476351.53)
                    java.lang.Object r3 = o.YY.EZpvd(r3)     // Catch: java.lang.Throwable -> L1b8
                    if (r3 != 0) goto L53a
                    r7 = 511(0x1ff, float:7.16E-43)
                    r8 = 5
                    r9 = 43308(0xa92c, float:6.0687E-41)
                    r10 = -859284851(0xffffffffccc85a8d, float:-1.05043048E8)
                    r11 = 0
                    r3 = 1
                    byte r5 = (byte) r3     // Catch: java.lang.Throwable -> L1b8
                    int r12 = r5 + 3
                    byte r12 = (byte) r12     // Catch: java.lang.Throwable -> L1b8
                    r13 = 49
                    byte r13 = (byte) r13     // Catch: java.lang.Throwable -> L1b8
                    java.lang.Object[] r14 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L1b8
                    b(r5, r12, r13, r14)     // Catch: java.lang.Throwable -> L1b8
                    r5 = 0
                    r12 = r14[r5]     // Catch: java.lang.Throwable -> L1b8
                    java.lang.String r12 = (java.lang.String) r12     // Catch: java.lang.Throwable -> L1b8
                    java.lang.Class[] r13 = new java.lang.Class[r3]     // Catch: java.lang.Throwable -> L1b8
                    java.lang.Class<java.lang.String> r3 = java.lang.String.class
                    r13[r5] = r3     // Catch: java.lang.Throwable -> L1b8
                    java.lang.Object r3 = o.YY.EZpvd(r7, r8, r9, r10, r11, r12, r13)     // Catch: java.lang.Throwable -> L1b8
                L53a:
                    java.lang.reflect.Method r3 = (java.lang.reflect.Method) r3     // Catch: java.lang.Throwable -> L1b8
                    r5 = 0
                    java.lang.Object r2 = r3.invoke(r5, r2)     // Catch: java.lang.Throwable -> L1b8
                    java.lang.Long r2 = (java.lang.Long) r2     // Catch: java.lang.Throwable -> L1b8
                    long r2 = r2.longValue()     // Catch: java.lang.Throwable -> L1b8
                    r5 = 224267866(0xd5e0e5a, float:6.8426307E-31)
                    long r7 = (long) r5
                    java.lang.Runtime r5 = java.lang.Runtime.getRuntime()
                    long r9 = r5.totalMemory()
                    int r5 = (int) r9
                    r9 = -1975(0xfffffffffffff849, float:NaN)
                    long r9 = (long) r9
                    long r9 = r9 * r7
                    r11 = 989(0x3dd, float:1.386E-42)
                    long r11 = (long) r11
                    long r11 = r11 * r2
                    long r9 = r9 + r11
                    r11 = 988(0x3dc, float:1.384E-42)
                    long r11 = (long) r11
                    long r13 = (long) r5
                    r31 = r9
                    r5 = -1
                    long r9 = (long) r5
                    long r33 = r7 ^ r9
                    long r33 = r33 | r2
                    long r33 = r33 ^ r9
                    long r35 = r13 | r33
                    long r35 = r35 * r11
                    long r31 = r31 + r35
                    r5 = -1976(0xfffffffffffff848, float:NaN)
                    long r5 = (long) r5
                    long r35 = r2 ^ r9
                    long r37 = r35 | r7
                    long r37 = r37 ^ r9
                    long r39 = r13 ^ r9
                    long r7 = r39 | r7
                    long r7 = r7 ^ r9
                    long r7 = r37 | r7
                    long r5 = r5 * r7
                    long r31 = r31 + r5
                    long r5 = r35 | r13
                    long r5 = r5 ^ r9
                    long r5 = r33 | r5
                    long r2 = r39 | r2
                    long r2 = r2 ^ r9
                    long r2 = r2 | r5
                    long r11 = r11 * r2
                    long r31 = r31 + r11
                    r2 = -535435960(0xffffffffe015e548, float:-4.3204474E19)
                    long r2 = (long) r2
                    long r2 = r31 + r2
                    r5 = 32
                    long r6 = r2 >> r5
                    int r5 = (int) r6
                    r6 = 177994088(0xa9bf968, float:1.5019773E-32)
                    r7 = r6 | r1
                    int r7 = r7 * 140
                    r8 = -957612030(0xffffffffc6ec0002, float:-30208.004)
                    int r8 = r8 + r7
                    int r14 = ~r1
                    r6 = r6 | r14
                    int r6 = ~r6
                    r7 = 1090782210(0x41040402, float:8.250978)
                    r6 = r6 | r7
                    int r6 = r6 * (-280)
                    int r8 = r8 + r6
                    r6 = 1259232322(0x4b0e5c42, float:9329730.0)
                    r6 = r6 | r14
                    int r6 = ~r6
                    r7 = 9543976(0x91a128, float:1.3373959E-38)
                    r6 = r6 | r7
                    r7 = -1090782211(0xffffffffbefbfbfd, float:-0.4921569)
                    r7 = r7 | r1
                    int r7 = ~r7
                    r6 = r6 | r7
                    int r6 = r6 * 140
                    int r8 = r8 + r6
                    r5 = r5 & r8
                    int r2 = (int) r2
                    long r6 = android.os.Process.getElapsedCpuTime()
                    int r3 = (int) r6
                    r6 = 1487581800(0x58aab268, float:1.50146581E15)
                    r7 = r6 | r3
                    int r7 = ~r7
                    r8 = -1537928919(0xffffffffa4551129, float:-4.6201548E-17)
                    r7 = r7 | r8
                    int r7 = r7 * 262
                    r8 = 971516133(0x39e828e5, float:4.4280957E-4)
                    int r7 = r7 + r8
                    int r3 = ~r3
                    r3 = r3 | r6
                    int r3 = ~r3
                    r6 = -1537928919(0xffffffffa4551129, float:-4.6201548E-17)
                    r3 = r3 | r6
                    int r3 = r3 * 262
                    int r7 = r7 + r3
                    r2 = r2 & r7
                    r3 = r5 ^ r2
                    r2 = r2 & r5
                    r2 = r2 | r3
                    long r2 = (long) r2
                    int r2 = (int) r2
                    r3 = 1845277648(0x6dfcb3d0, float:9.7759503E27)
                    if (r2 == 0) goto L5f6
                    r2 = r1 & (-267(0xfffffffffffffef5, float:NaN))
                    r5 = r14 & 266(0x10a, float:3.73E-43)
                    r2 = r2 | r5
                    goto L6b7
                L5f6:
                    r2 = 1
                    java.lang.Object[] r5 = new java.lang.Object[r2]
                    r2 = 24
                    r6 = 155(0x9b, float:2.17E-43)
                    r7 = 0
                    a(r7, r2, r6, r5)
                    r2 = r5[r7]
                    java.lang.String r2 = (java.lang.String) r2
                    java.lang.Object[] r2 = new java.lang.Object[]{r2}     // Catch: java.lang.Throwable -> L1b8
                    java.lang.Object r5 = o.YY.EZpvd(r3)     // Catch: java.lang.Throwable -> L1b8
                    if (r5 != 0) goto L639
                    r31 = 531(0x213, float:7.44E-43)
                    r32 = 5
                    r33 = 0
                    r34 = 1776058028(0x69dc7eac, float:3.3320234E25)
                    r35 = 0
                    r5 = 1
                    byte r6 = (byte) r5     // Catch: java.lang.Throwable -> L1b8
                    int r7 = -r6
                    byte r7 = (byte) r7     // Catch: java.lang.Throwable -> L1b8
                    int r8 = r7 + 4
                    byte r8 = (byte) r8     // Catch: java.lang.Throwable -> L1b8
                    java.lang.Object[] r11 = new java.lang.Object[r5]     // Catch: java.lang.Throwable -> L1b8
                    b(r6, r7, r8, r11)     // Catch: java.lang.Throwable -> L1b8
                    r6 = 0
                    r7 = r11[r6]     // Catch: java.lang.Throwable -> L1b8
                    r36 = r7
                    java.lang.String r36 = (java.lang.String) r36     // Catch: java.lang.Throwable -> L1b8
                    java.lang.Class[] r7 = new java.lang.Class[r5]     // Catch: java.lang.Throwable -> L1b8
                    java.lang.Class<java.lang.String> r5 = java.lang.String.class
                    r7[r6] = r5     // Catch: java.lang.Throwable -> L1b8
                    r37 = r7
                    java.lang.Object r5 = o.YY.EZpvd(r31, r32, r33, r34, r35, r36, r37)     // Catch: java.lang.Throwable -> L1b8
                L639:
                    java.lang.reflect.Method r5 = (java.lang.reflect.Method) r5     // Catch: java.lang.Throwable -> L1b8
                    r6 = 0
                    java.lang.Object r2 = r5.invoke(r6, r2)     // Catch: java.lang.Throwable -> L1b8
                    java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Throwable -> L1b8
                    if (r2 == 0) goto L651
                    int r2 = r2.length()
                    if (r2 == 0) goto L651
                L64a:
                    r2 = r1 & 267(0x10b, float:3.74E-43)
                    int r2 = ~r2
                    r5 = r1 | 267(0x10b, float:3.74E-43)
                    r2 = r2 & r5
                    goto L6b7
                L651:
                    r2 = 1
                    java.lang.Object[] r5 = new java.lang.Object[r2]
                    r2 = 22733(0x58cd, float:3.1856E-41)
                    r6 = 24
                    r7 = 179(0xb3, float:2.51E-43)
                    a(r2, r6, r7, r5)
                    r2 = 0
                    r5 = r5[r2]
                    java.lang.String r5 = (java.lang.String) r5
                    java.lang.Object[] r2 = new java.lang.Object[]{r5}     // Catch: java.lang.Throwable -> L1b8
                    java.lang.Object r5 = o.YY.EZpvd(r3)     // Catch: java.lang.Throwable -> L1b8
                    if (r5 != 0) goto L696
                    r31 = 531(0x213, float:7.44E-43)
                    r32 = 5
                    r33 = 0
                    r34 = 1776058028(0x69dc7eac, float:3.3320234E25)
                    r35 = 0
                    r5 = 1
                    byte r6 = (byte) r5     // Catch: java.lang.Throwable -> L1b8
                    int r7 = -r6
                    byte r7 = (byte) r7     // Catch: java.lang.Throwable -> L1b8
                    int r8 = r7 + 4
                    byte r8 = (byte) r8     // Catch: java.lang.Throwable -> L1b8
                    java.lang.Object[] r11 = new java.lang.Object[r5]     // Catch: java.lang.Throwable -> L1b8
                    b(r6, r7, r8, r11)     // Catch: java.lang.Throwable -> L1b8
                    r6 = 0
                    r7 = r11[r6]     // Catch: java.lang.Throwable -> L1b8
                    r36 = r7
                    java.lang.String r36 = (java.lang.String) r36     // Catch: java.lang.Throwable -> L1b8
                    java.lang.Class[] r7 = new java.lang.Class[r5]     // Catch: java.lang.Throwable -> L1b8
                    java.lang.Class<java.lang.String> r5 = java.lang.String.class
                    r7[r6] = r5     // Catch: java.lang.Throwable -> L1b8
                    r37 = r7
                    java.lang.Object r5 = o.YY.EZpvd(r31, r32, r33, r34, r35, r36, r37)     // Catch: java.lang.Throwable -> L1b8
                L696:
                    java.lang.reflect.Method r5 = (java.lang.reflect.Method) r5     // Catch: java.lang.Throwable -> L1b8
                    r6 = 0
                    java.lang.Object r2 = r5.invoke(r6, r2)     // Catch: java.lang.Throwable -> L1b8
                    java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Throwable -> L1b8
                    if (r2 == 0) goto L6b6
                    int r2 = r2.length()
                    if (r2 == 0) goto L6b6
                    int r2 = o.C19057fuB.AEQbTJ
                    int r2 = r2 + 83
                    int r5 = r2 % 128
                    o.C19057fuB.EZpvd = r5
                    r5 = 2
                    int r2 = r2 % r5
                    if (r2 != 0) goto L64a
                    r2 = r1 ^ 8835(0x2283, float:1.238E-41)
                    goto L6b7
                L6b6:
                    r2 = r1
                L6b7:
                    if (r2 == r1) goto L72c
                    o.C14220dhO.OLrzqt()
                    o.C14220dhO.OLrzqt()
                    r3 = 5
                    java.lang.Object[] r0 = new java.lang.Object[r3]
                    r3 = 1
                    int[] r5 = new int[r3]
                    r6 = 0
                    r0[r6] = r5
                    int[] r7 = new int[r3]
                    r8 = 2
                    r0[r8] = r7
                    int[] r8 = new int[r3]
                    r3 = 3
                    r0[r3] = r8
                    int[] r7 = (int[]) r7
                    r7[r6] = r1
                    int[] r8 = (int[]) r8
                    int r3 = o.C19057fuB.EZpvd
                    int r3 = r3 + 43
                    int r7 = r3 % 128
                    o.C19057fuB.AEQbTJ = r7
                    r7 = 2
                    int r3 = r3 % r7
                    r8[r6] = r2
                    r2 = 0
                    r3 = 1
                    r0[r3] = r2
                    r3 = 4
                    r0[r3] = r2
                    r2 = 986756410(0x3ad0b53a, float:0.001592315)
                    r3 = r1 | r2
                    int r3 = ~r3
                    r6 = -288118130(0xffffffffeed3aa8e, float:-3.2753763E28)
                    r3 = r3 | r6
                    int r3 = r3 * (-465)
                    r7 = 1883470774(0x70437bb6, float:2.4199654E29)
                    int r7 = r7 + r3
                    r3 = r6 | r1
                    int r3 = ~r3
                    r2 = r2 | r3
                    int r2 = r2 * 930
                    int r7 = r7 + r2
                    r2 = -19677250(0xfffffffffed3bfbe, float:-1.4073134E38)
                    r1 = r1 | r2
                    int r1 = r1 * 465
                    int r7 = r7 + r1
                    r1 = r7 & 16
                    r2 = 16
                    r2 = r2 | r7
                    int r1 = r1 + r2
                    int r1 = r1 + r4
                    int r2 = r1 << 13
                    int r3 = ~r2
                    r3 = r3 & r1
                    int r1 = ~r1
                    r1 = r1 & r2
                    r1 = r1 | r3
                    int r2 = r1 >>> 17
                    r3 = r1 & r2
                    int r3 = ~r3
                    r1 = r1 | r2
                    r1 = r1 & r3
                    int r2 = r1 << 5
                    r3 = r1 & r2
                    int r3 = ~r3
                    r1 = r1 | r2
                    r1 = r1 & r3
                    int[] r5 = (int[]) r5
                    r2 = 0
                    r5[r2] = r1
                    goto L2ae4
                L72c:
                    r2 = 0
                    r5 = 1039002550(0x3dedebb6, float:0.11617224)
                    java.lang.Object r5 = o.YY.EZpvd(r5)     // Catch: java.lang.Throwable -> L1b8
                    if (r5 != 0) goto L75c
                    r31 = 610(0x262, float:8.55E-43)
                    r32 = 5
                    r33 = 0
                    r34 = 969746122(0x39cd26ca, float:3.9129547E-4)
                    r35 = 0
                    byte r5 = (byte) r2     // Catch: java.lang.Throwable -> L1b8
                    int r6 = r5 + 1
                    byte r6 = (byte) r6     // Catch: java.lang.Throwable -> L1b8
                    int r7 = r6 + (-1)
                    byte r7 = (byte) r7     // Catch: java.lang.Throwable -> L1b8
                    r8 = 1
                    java.lang.Object[] r11 = new java.lang.Object[r8]     // Catch: java.lang.Throwable -> L1b8
                    b(r5, r6, r7, r11)     // Catch: java.lang.Throwable -> L1b8
                    r5 = r11[r2]     // Catch: java.lang.Throwable -> L1b8
                    r36 = r5
                    java.lang.String r36 = (java.lang.String) r36     // Catch: java.lang.Throwable -> L1b8
                    java.lang.Class[] r5 = new java.lang.Class[r2]     // Catch: java.lang.Throwable -> L1b8
                    r37 = r5
                    java.lang.Object r5 = o.YY.EZpvd(r31, r32, r33, r34, r35, r36, r37)     // Catch: java.lang.Throwable -> L1b8
                L75c:
                    java.lang.reflect.Method r5 = (java.lang.reflect.Method) r5     // Catch: java.lang.Throwable -> L1b8
                    r2 = 0
                    java.lang.Object r5 = r5.invoke(r2, r2)     // Catch: java.lang.Throwable -> L1b8
                    java.lang.Long r5 = (java.lang.Long) r5     // Catch: java.lang.Throwable -> L1b8
                    long r5 = r5.longValue()     // Catch: java.lang.Throwable -> L1b8
                    r2 = -124374662(0xfffffffff896317a, float:-2.437025E34)
                    long r7 = (long) r2
                    int r2 = android.os.Process.myPid()
                    r11 = -129(0xffffffffffffff7f, float:NaN)
                    long r11 = (long) r11
                    long r31 = r11 * r7
                    r13 = 131(0x83, float:1.84E-43)
                    long r3 = (long) r13
                    long r33 = r3 * r5
                    long r31 = r31 + r33
                    r13 = 130(0x82, float:1.82E-43)
                    r33 = r3
                    long r3 = (long) r13
                    long r35 = r5 ^ r9
                    r37 = r11
                    long r11 = (long) r2
                    long r39 = r11 ^ r9
                    long r39 = r35 | r39
                    long r39 = r39 | r7
                    long r39 = r39 ^ r9
                    long r39 = r39 * r3
                    long r31 = r31 + r39
                    r2 = -260(0xfffffffffffffefc, float:NaN)
                    r39 = r0
                    long r0 = (long) r2
                    long r35 = r35 | r7
                    long r40 = r35 ^ r9
                    long r40 = r40 * r0
                    long r31 = r31 + r40
                    long r7 = r7 ^ r9
                    long r5 = r5 | r7
                    long r5 = r5 ^ r9
                    long r7 = r35 | r11
                    long r7 = r7 ^ r9
                    long r5 = r5 | r7
                    long r5 = r5 * r3
                    long r31 = r31 + r5
                    r2 = 2128558248(0x7edf38a8, float:1.4835601E38)
                    long r5 = (long) r2
                    long r5 = r31 + r5
                    r2 = 32
                    long r7 = r5 >> r2
                    int r2 = (int) r7
                    r7 = -295073(0xfffffffffffb7f5f, float:NaN)
                    r7 = r7 | r14
                    int r7 = r7 * 184
                    r8 = -643857158(0xffffffffd99f84fa, float:-5.6125913E15)
                    int r8 = r8 + r7
                    r7 = -221025529(0xfffffffff2d36b07, float:-8.375133E30)
                    r7 = r7 | r14
                    int r7 = ~r7
                    r11 = 1878687323(0x6ffa7e5b, float:1.5504801E29)
                    r7 = r7 | r11
                    int r7 = r7 * 184
                    int r8 = r8 + r7
                    r2 = r2 & r8
                    int r5 = (int) r5
                    int r6 = android.os.Process.myTid()
                    r7 = -42611803(0xfffffffffd75cba5, float:-2.041989E37)
                    r7 = r7 | r6
                    int r7 = ~r7
                    r8 = -1479838213(0xffffffffa7cb75fb, float:-5.6471733E-15)
                    r8 = r8 | r6
                    int r8 = ~r8
                    r7 = r7 | r8
                    int r7 = r7 * 69
                    r8 = 1206016560(0x47e25a30, float:115892.375)
                    int r8 = r8 + r7
                    r7 = 2037746181(0x79758a05, float:7.9682006E34)
                    r7 = r7 | r6
                    int r7 = ~r7
                    r11 = -2080357984(0xffffffff840041a0, float:-1.5076461E-36)
                    r7 = r7 | r11
                    r11 = 600519771(0x23cb345b, float:2.2031478E-17)
                    r6 = r6 | r11
                    int r6 = ~r6
                    r6 = r6 | r7
                    int r6 = r6 * (-69)
                    int r8 = r8 + r6
                    r6 = -159055803(0xfffffffff6850045, float:-1.3487909E33)
                    int r8 = r8 + r6
                    r5 = r5 & r8
                    r2 = r2 | r5
                    long r5 = (long) r2
                    int r2 = (int) r5
                    if (r2 == 0) goto L852
                    int r5 = r2 * 319
                    int r5 = -r5
                    int r5 = -r5
                    r6 = 317(0x13d, float:4.44E-43)
                    r7 = r6 | r5
                    r8 = 1
                    int r7 = r7 << r8
                    r5 = r5 ^ r6
                    int r7 = r7 - r5
                    int r5 = ~r2
                    r11 = r0
                    r1 = r83
                    r0 = r5 ^ r1
                    r6 = r5 & r1
                    r0 = r0 | r6
                    int r0 = ~r0
                    r6 = r14 ^ (-1)
                    r6 = r6 | r14
                    r6 = r6 | r2
                    int r6 = ~r6
                    r8 = r0 ^ r6
                    r0 = r0 & r6
                    r0 = r0 | r8
                    int r0 = r0 * (-318)
                    r6 = r7 ^ r0
                    r0 = r0 & r7
                    r7 = 1
                    int r0 = r0 << r7
                    int r6 = r6 + r0
                    int r0 = ~r2
                    r2 = r0 ^ (-1)
                    r0 = r0 | r2
                    int r0 = ~r0
                    r2 = -1
                    r7 = r2 ^ r1
                    r7 = r7 | r1
                    int r7 = ~r7
                    r8 = r0 ^ r7
                    r0 = r0 & r7
                    r0 = r0 | r8
                    int r0 = r0 * (-318)
                    r7 = r6 & r0
                    r0 = r0 | r6
                    int r7 = r7 + r0
                    int r0 = ~r1
                    r6 = r5 ^ r0
                    r0 = r0 & r5
                    r0 = r0 | r6
                    int r0 = r0 * 318
                    int r0 = -r0
                    int r0 = -r0
                    int r0 = ~r0
                    int r7 = r7 - r0
                    r5 = 1
                    int r7 = r7 - r5
                    r0 = r7 ^ 200(0xc8, float:2.8E-43)
                    r6 = r7 & 200(0xc8, float:2.8E-43)
                    int r6 = r6 << r5
                    int r0 = r0 + r6
                    r6 = r1 & r0
                    int r6 = ~r6
                    r0 = r0 | r1
                    r0 = r0 & r6
                    goto L858
                L852:
                    r11 = r0
                    r2 = -1
                    r5 = 1
                    r1 = r83
                    r0 = r1
                L858:
                    if (r0 == r1) goto L92e
                    r6 = 5
                    java.lang.Object[] r2 = new java.lang.Object[r6]
                    int[] r3 = new int[r5]
                    r4 = 0
                    r2[r4] = r3
                    int[] r3 = new int[r5]
                    r6 = 2
                    r2[r6] = r3
                    int[] r6 = new int[r5]
                    r7 = 3
                    r2[r7] = r6
                    int[] r3 = (int[]) r3
                    r3[r4] = r1
                    int[] r6 = (int[]) r6
                    r6[r4] = r0
                    r3 = 0
                    r2[r5] = r3
                    r4 = 4
                    r2[r4] = r3
                    r0 = 1154399230(0x44cebbfe, float:1653.8748)
                    r0 = r0 | r1
                    int r0 = ~r0
                    r1 = 1086370130(0x40c0b152, float:6.0216455)
                    r1 = r1 | r0
                    int r1 = r1 * (-196)
                    r3 = -993746493(0xffffffffc4c4a1c3, float:-1573.055)
                    int r1 = r1 + r3
                    r3 = 68029100(0x40e0aac, float:1.669692E-36)
                    r0 = r0 | r3
                    int r0 = r0 * 196
                    int r1 = r1 + r0
                    int r0 = o.C14220dhO.OLrzqt()
                    int r3 = r1 * 246
                    r4 = -3904(0xfffffffffffff0c0, float:NaN)
                    int r4 = r4 + r3
                    int r3 = ~r1
                    int r5 = ~r0
                    r6 = r3 ^ r5
                    r5 = r5 & r3
                    r5 = r5 | r6
                    int r5 = ~r5
                    r6 = r3 ^ 16
                    r7 = r3 & 16
                    r6 = r6 | r7
                    int r6 = ~r6
                    r7 = r5 ^ r6
                    r5 = r5 & r6
                    r5 = r5 | r7
                    int r5 = r5 * (-245)
                    r6 = r4 | r5
                    r7 = 1
                    int r6 = r6 << r7
                    r4 = r4 ^ r5
                    int r6 = r6 - r4
                    r3 = r3 | r0
                    int r3 = ~r3
                    int r3 = r3 * (-245)
                    r4 = r6 & r3
                    r3 = r3 | r6
                    int r4 = r4 + r3
                    int r1 = ~r1
                    r3 = r1 ^ r0
                    r0 = r0 & r1
                    r0 = r0 | r3
                    int r0 = ~r0
                    r1 = r0 ^ 16
                    r3 = 16
                    r0 = r0 & r3
                    r0 = r0 | r1
                    int r0 = r0 * 245
                    int r0 = -r0
                    int r0 = -r0
                    r1 = r4 ^ r0
                    r0 = r0 & r4
                    r3 = 1
                    int r0 = r0 << r3
                    int r1 = r1 + r0
                    int r0 = o.C14220dhO.OLrzqt()
                    int r3 = r1 * 302
                    r5 = r85
                    int r4 = r5 * 603
                    int r3 = r3 + r4
                    int r4 = ~r1
                    int r6 = ~r0
                    r7 = r4 | r6
                    int r7 = ~r7
                    r7 = r7 | r5
                    int r7 = r7 * (-602)
                    int r7 = -r7
                    int r7 = -r7
                    r8 = r3 & r7
                    r3 = r3 | r7
                    int r8 = r8 + r3
                    int r3 = ~r1
                    int r7 = ~r5
                    r9 = r3 ^ r7
                    r3 = r3 & r7
                    r3 = r3 | r9
                    int r3 = ~r3
                    r4 = r4 | r0
                    int r4 = ~r4
                    r3 = r3 | r4
                    int r0 = ~r0
                    r4 = r0 ^ r1
                    r0 = r0 & r1
                    r0 = r0 | r4
                    r0 = r0 | r5
                    int r0 = ~r0
                    r1 = r3 ^ r0
                    r0 = r0 & r3
                    r0 = r0 | r1
                    int r0 = r0 * (-301)
                    int r0 = -r0
                    int r0 = -r0
                    r1 = r8 | r0
                    r3 = 1
                    int r1 = r1 << r3
                    r0 = r0 ^ r8
                    int r1 = r1 - r0
                    r0 = r6 ^ r5
                    r4 = r6 & r5
                    r0 = r0 | r4
                    int r0 = ~r0
                    int r0 = r0 * 301
                    int r0 = ~r0
                    int r1 = r1 - r0
                    int r1 = r1 - r3
                    int r0 = r1 << 13
                    r0 = r0 ^ r1
                    int r1 = r0 >>> 17
                    r3 = r0 & r1
                    int r3 = ~r3
                    r0 = r0 | r1
                    r0 = r0 & r3
                    int r1 = r0 << 5
                    r3 = r0 & r1
                    int r3 = ~r3
                    r0 = r0 | r1
                    r0 = r0 & r3
                    r6 = 0
                    r1 = r2[r6]
                    int[] r1 = (int[]) r1
                    r1[r6] = r0
                L92b:
                    r0 = r2
                    goto L2ae4
                L92e:
                    r13 = r5
                    r7 = r33
                    r6 = 0
                    r5 = r85
                    java.lang.Object[] r0 = new java.lang.Object[r13]
                    r2 = 20
                    r15 = 203(0xcb, float:2.84E-43)
                    a(r6, r2, r15, r0)
                    r0 = r0[r6]
                    java.lang.String r0 = (java.lang.String) r0
                    java.lang.Object[] r2 = new java.lang.Object[r13]
                    r13 = 6
                    r15 = 223(0xdf, float:3.12E-43)
                    a(r6, r13, r15, r2)
                    r2 = r2[r6]
                    java.lang.String r2 = (java.lang.String) r2
                    java.lang.Object[] r0 = new java.lang.Object[]{r0, r2}     // Catch: java.lang.Throwable -> L1b8
                    r2 = -1888477952(0xffffffff8f701d00, float:-1.1838499E-29)
                    java.lang.Object r2 = o.YY.EZpvd(r2)     // Catch: java.lang.Throwable -> L1b8
                    if (r2 != 0) goto L990
                    r40 = 200(0xc8, float:2.8E-43)
                    r41 = 4
                    r42 = 45158(0xb066, float:6.328E-41)
                    r43 = -1957638020(0xffffffff8b50d07c, float:-4.021619E-32)
                    r44 = 0
                    r2 = 0
                    byte r6 = (byte) r2     // Catch: java.lang.Throwable -> L1b8
                    int r15 = r6 + 1
                    byte r15 = (byte) r15     // Catch: java.lang.Throwable -> L1b8
                    int r13 = r15 + (-1)
                    byte r13 = (byte) r13     // Catch: java.lang.Throwable -> L1b8
                    r33 = r11
                    r2 = 1
                    java.lang.Object[] r11 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L1b8
                    b(r6, r15, r13, r11)     // Catch: java.lang.Throwable -> L1b8
                    r2 = 0
                    r6 = r11[r2]     // Catch: java.lang.Throwable -> L1b8
                    r45 = r6
                    java.lang.String r45 = (java.lang.String) r45     // Catch: java.lang.Throwable -> L1b8
                    r6 = 2
                    java.lang.Class[] r11 = new java.lang.Class[r6]     // Catch: java.lang.Throwable -> L1b8
                    java.lang.Class<java.lang.String> r6 = java.lang.String.class
                    r11[r2] = r6     // Catch: java.lang.Throwable -> L1b8
                    java.lang.Class<java.lang.String> r2 = java.lang.String.class
                    r6 = 1
                    r11[r6] = r2     // Catch: java.lang.Throwable -> L1b8
                    r46 = r11
                    java.lang.Object r2 = o.YY.EZpvd(r40, r41, r42, r43, r44, r45, r46)     // Catch: java.lang.Throwable -> L1b8
                    goto L992
                L990:
                    r33 = r11
                L992:
                    java.lang.reflect.Method r2 = (java.lang.reflect.Method) r2     // Catch: java.lang.Throwable -> L1b8
                    r6 = 0
                    java.lang.Object r0 = r2.invoke(r6, r0)     // Catch: java.lang.Throwable -> L1b8
                    java.lang.Long r0 = (java.lang.Long) r0     // Catch: java.lang.Throwable -> L1b8
                    long r11 = r0.longValue()     // Catch: java.lang.Throwable -> L1b8
                    r0 = 265159677(0xfce03fd, float:2.0314705E-29)
                    r35 = r3
                    long r2 = (long) r0
                    r0 = 71
                    r40 = r7
                    long r6 = (long) r0
                    long r42 = r6 * r2
                    r0 = -69
                    r44 = r6
                    long r6 = (long) r0
                    long r46 = r6 * r11
                    long r42 = r42 + r46
                    r0 = -140(0xffffffffffffff74, float:NaN)
                    r46 = r6
                    long r6 = (long) r0
                    long r48 = r2 ^ r9
                    long r48 = r48 | r11
                    long r48 = r48 ^ r9
                    long r4 = (long) r1
                    long r50 = r11 | r4
                    long r50 = r50 ^ r9
                    long r50 = r48 | r50
                    long r50 = r50 * r6
                    long r42 = r42 + r50
                    r0 = 70
                    r50 = r6
                    long r6 = (long) r0
                    long r52 = r2 | r11
                    long r52 = r52 | r4
                    long r52 = r52 ^ r9
                    long r52 = r52 * r6
                    long r42 = r42 + r52
                    long r11 = r11 ^ r9
                    long r11 = r11 | r2
                    long r11 = r11 ^ r9
                    long r11 = r48 | r11
                    long r2 = r2 | r4
                    long r2 = r2 ^ r9
                    long r2 = r2 | r11
                    long r2 = r2 * r6
                    long r42 = r42 + r2
                    r0 = -1438015110(0xffffffffaa49a17a, float:-1.790841E-13)
                    long r2 = (long) r0
                    long r2 = r42 + r2
                    r8 = 32
                    long r11 = r2 >> r8
                    int r0 = (int) r11
                    r8 = -176163417(0xfffffffff57ff5a7, float:-3.2446731E32)
                    r8 = r8 | r14
                    int r8 = r8 * (-369)
                    r11 = -802173004(0xffffffffd02fcfb4, float:-1.17984993E10)
                    int r11 = r11 + r8
                    r8 = -1634465192(0xffffffff9e940a58, float:-1.5674388E-20)
                    r8 = r8 | r14
                    int r8 = ~r8
                    r12 = -197238781(0xfffffffff43e6003, float:-6.033226E31)
                    r8 = r8 | r12
                    int r8 = r8 * (-369)
                    int r11 = r11 + r8
                    r8 = 1634465191(0x616bf5a7, float:2.7204287E20)
                    r8 = r8 | r1
                    int r8 = ~r8
                    r12 = -1810628608(0xffffffff94140000, float:-7.4720905E-27)
                    r8 = r8 | r12
                    r12 = -21075365(0xfffffffffebe6a5b, float:-1.2655277E38)
                    r12 = r12 | r14
                    int r12 = ~r12
                    r8 = r8 | r12
                    int r8 = r8 * 369
                    int r11 = r11 + r8
                    r0 = r0 & r11
                    int r2 = (int) r2
                    r3 = -709684104(0xffffffffd5b31478, float:-2.46125617E13)
                    r3 = r3 | r14
                    int r3 = ~r3
                    r8 = 709116161(0x2a444101, float:1.743085E-13)
                    r3 = r3 | r8
                    r8 = -2146910514(0xffffffff8008bece, float:-8.03132E-40)
                    r8 = r8 | r14
                    int r8 = ~r8
                    r3 = r3 | r8
                    int r3 = r3 * (-397)
                    r8 = 708196013(0x2a3636ad, float:1.6183817E-13)
                    int r3 = r3 + r8
                    r8 = -1438362295(0xffffffffaa445549, float:-1.7437886E-13)
                    r8 = r8 | r1
                    int r8 = r8 * 397
                    int r3 = r3 + r8
                    r2 = r2 & r3
                    r3 = r0 ^ r2
                    r0 = r0 & r2
                    r0 = r0 | r3
                    long r2 = (long) r0
                    int r0 = (int) r2
                    if (r0 == 0) goto La44
                    r0 = r1 & (-263(0xfffffffffffffef9, float:NaN))
                    r2 = r14 & 262(0x106, float:3.67E-43)
                    r0 = r0 | r2
                    goto La45
                La44:
                    r0 = r1
                La45:
                    if (r0 == r1) goto Lb3e
                    r2 = 5
                    java.lang.Object[] r2 = new java.lang.Object[r2]
                    r3 = 1
                    int[] r4 = new int[r3]
                    r5 = 0
                    r2[r5] = r4
                    int[] r4 = new int[r3]
                    r6 = 2
                    r2[r6] = r4
                    int[] r6 = new int[r3]
                    r7 = 3
                    r2[r7] = r6
                    int[] r4 = (int[]) r4
                    r4[r5] = r1
                    int[] r6 = (int[]) r6
                    r6[r5] = r0
                    r4 = 0
                    r2[r3] = r4
                    r3 = 4
                    r2[r3] = r4
                    r0 = 1274541739(0x4bf7f6ab, float:3.2501078E7)
                    r0 = r0 | r14
                    int r0 = ~r0
                    r3 = 332800(0x51400, float:4.66352E-40)
                    r0 = r0 | r3
                    int r0 = r0 * 220
                    r3 = 638354991(0x260c862f, float:4.875411E-16)
                    int r3 = r3 + r0
                    r0 = 1244083842(0x4a273682, float:2739616.5)
                    r0 = r0 | r14
                    int r0 = ~r0
                    r4 = 30790697(0x1d5d429, float:7.854828E-38)
                    r0 = r0 | r4
                    int r0 = r0 * (-440)
                    int r3 = r3 + r0
                    r0 = 1274541739(0x4bf7f6ab, float:3.2501078E7)
                    r0 = r0 | r1
                    int r0 = r0 * 220
                    int r3 = r3 + r0
                    int r0 = r3 * (-712)
                    r4 = 11424(0x2ca0, float:1.6008E-41)
                    r5 = r4 & r0
                    r0 = r0 | r4
                    int r5 = r5 + r0
                    r4 = -17
                    r0 = r4 | r14
                    int r0 = ~r0
                    r6 = r4 ^ r3
                    r4 = r4 & r3
                    r4 = r4 | r6
                    int r4 = ~r4
                    r6 = r0 ^ r4
                    r0 = r0 & r4
                    r0 = r0 | r6
                    int r3 = ~r3
                    r4 = r3 ^ 16
                    r6 = r3 & 16
                    r4 = r4 | r6
                    r6 = r4 ^ r1
                    r4 = r4 & r1
                    r4 = r4 | r6
                    int r4 = ~r4
                    r0 = r0 | r4
                    int r0 = r0 * (-713)
                    int r5 = r5 + r0
                    r0 = r3 | 16
                    r4 = r0 ^ r1
                    r0 = r0 & r1
                    r0 = r0 | r4
                    int r0 = ~r0
                    int r0 = r0 * 1426
                    r4 = r5 ^ r0
                    r0 = r0 & r5
                    r5 = 1
                    int r0 = r0 << r5
                    int r4 = r4 + r0
                    int r0 = ~r1
                    r1 = r3 ^ r0
                    r0 = r0 & r3
                    r0 = r0 | r1
                    int r0 = ~r0
                    int r0 = r0 * 713
                    int r4 = r4 + r0
                    int r0 = o.C14220dhO.OLrzqt()
                    int r1 = r4 * 51
                    r3 = r85
                    int r5 = r3 * (-49)
                    int r5 = -r5
                    int r5 = -r5
                    r6 = r1 ^ r5
                    r1 = r1 & r5
                    r5 = 1
                    int r1 = r1 << r5
                    int r6 = r6 + r1
                    r1 = r4 ^ r0
                    r7 = r4 & r0
                    r1 = r1 | r7
                    int r1 = r1 * (-50)
                    r7 = r6 ^ r1
                    r1 = r1 & r6
                    int r1 = r1 << r5
                    int r7 = r7 + r1
                    int r1 = ~r4
                    int r3 = ~r3
                    r5 = r1 ^ r3
                    r1 = r1 & r3
                    r1 = r1 | r5
                    r5 = r1 ^ r0
                    r1 = r1 & r0
                    r1 = r1 | r5
                    int r1 = ~r1
                    int r5 = ~r0
                    r5 = r5 | r3
                    r6 = r5 ^ r4
                    r5 = r5 & r4
                    r5 = r5 | r6
                    int r5 = ~r5
                    r6 = r1 ^ r5
                    r1 = r1 & r5
                    r1 = r1 | r6
                    int r1 = r1 * 50
                    int r1 = ~r1
                    int r7 = r7 - r1
                    r1 = 1
                    int r7 = r7 - r1
                    int r0 = ~r0
                    r1 = r3 ^ r0
                    r5 = r3 & r0
                    r1 = r1 | r5
                    int r1 = ~r1
                    r5 = r3 ^ r4
                    r3 = r3 & r4
                    r3 = r3 | r5
                    int r3 = ~r3
                    r5 = r1 ^ r3
                    r1 = r1 & r3
                    r1 = r1 | r5
                    r3 = r0 ^ r4
                    r0 = r0 & r4
                    r0 = r0 | r3
                    int r0 = ~r0
                    r3 = r1 ^ r0
                    r0 = r0 & r1
                    r0 = r0 | r3
                    int r0 = r0 * 50
                    int r0 = -r0
                    int r0 = -r0
                    r1 = r7 | r0
                    r3 = 1
                    int r1 = r1 << r3
                    r0 = r0 ^ r7
                    int r1 = r1 - r0
                    int r0 = r1 << 13
                    int r3 = ~r0
                    r3 = r3 & r1
                    int r1 = ~r1
                    r0 = r0 & r1
                    r0 = r0 | r3
                    int r1 = r0 >>> 17
                    r0 = r0 ^ r1
                    int r1 = r0 << 5
                    int r3 = ~r1
                    r3 = r3 & r0
                    int r0 = ~r0
                    r0 = r0 & r1
                    r0 = r0 | r3
                    r4 = 0
                    r1 = r2[r4]
                    int[] r1 = (int[]) r1
                    r1[r4] = r0
                    goto L92b
                Lb3e:
                    r3 = r85
                    r42 = r4
                    r2 = 1
                    r4 = 0
                    java.lang.Object[] r0 = new java.lang.Object[r2]
                    r5 = 25203(0x6273, float:3.5317E-41)
                    r8 = 31
                    r11 = 229(0xe5, float:3.21E-43)
                    a(r5, r8, r11, r0)
                    r0 = r0[r4]
                    java.lang.String r0 = (java.lang.String) r0
                    java.lang.Object[] r5 = new java.lang.Object[r2]
                    r8 = 23
                    r11 = 260(0x104, float:3.64E-43)
                    a(r4, r8, r11, r5)
                    r5 = r5[r4]
                    java.lang.String r5 = (java.lang.String) r5
                    java.lang.Object[] r8 = new java.lang.Object[r2]
                    r11 = 283(0x11b, float:3.97E-43)
                    r12 = 28
                    a(r4, r12, r11, r8)
                    r8 = r8[r4]
                    java.lang.String r8 = (java.lang.String) r8
                    java.lang.Object[] r11 = new java.lang.Object[r2]
                    r2 = 311(0x137, float:4.36E-43)
                    r12 = 14
                    a(r4, r12, r2, r11)
                    r2 = r11[r4]
                    java.lang.String r2 = (java.lang.String) r2
                    java.lang.String[] r0 = new java.lang.String[]{r0, r5, r8, r2}
                    r2 = 0
                Lb7f:
                    r4 = 4
                    if (r2 >= r4) goto Lc73
                    r4 = r0[r2]
                    java.lang.Object[] r4 = new java.lang.Object[]{r4}     // Catch: java.lang.Throwable -> L1b8
                    r5 = -924280847(0xffffffffc8e897f1, float:-476351.53)
                    java.lang.Object r5 = o.YY.EZpvd(r5)     // Catch: java.lang.Throwable -> L1b8
                    if (r5 != 0) goto Lbbd
                    r52 = 511(0x1ff, float:7.16E-43)
                    r53 = 5
                    r54 = 43308(0xa92c, float:6.0687E-41)
                    r55 = -859284851(0xffffffffccc85a8d, float:-1.05043048E8)
                    r56 = 0
                    r5 = 1
                    byte r8 = (byte) r5     // Catch: java.lang.Throwable -> L1b8
                    int r11 = r8 + 3
                    byte r11 = (byte) r11     // Catch: java.lang.Throwable -> L1b8
                    r12 = 49
                    byte r12 = (byte) r12     // Catch: java.lang.Throwable -> L1b8
                    java.lang.Object[] r13 = new java.lang.Object[r5]     // Catch: java.lang.Throwable -> L1b8
                    b(r8, r11, r12, r13)     // Catch: java.lang.Throwable -> L1b8
                    r8 = 0
                    r11 = r13[r8]     // Catch: java.lang.Throwable -> L1b8
                    r57 = r11
                    java.lang.String r57 = (java.lang.String) r57     // Catch: java.lang.Throwable -> L1b8
                    java.lang.Class[] r11 = new java.lang.Class[r5]     // Catch: java.lang.Throwable -> L1b8
                    java.lang.Class<java.lang.String> r5 = java.lang.String.class
                    r11[r8] = r5     // Catch: java.lang.Throwable -> L1b8
                    r58 = r11
                    java.lang.Object r5 = o.YY.EZpvd(r52, r53, r54, r55, r56, r57, r58)     // Catch: java.lang.Throwable -> L1b8
                Lbbd:
                    java.lang.reflect.Method r5 = (java.lang.reflect.Method) r5     // Catch: java.lang.Throwable -> L1b8
                    r8 = 0
                    java.lang.Object r4 = r5.invoke(r8, r4)     // Catch: java.lang.Throwable -> L1b8
                    java.lang.Long r4 = (java.lang.Long) r4     // Catch: java.lang.Throwable -> L1b8
                    long r4 = r4.longValue()     // Catch: java.lang.Throwable -> L1b8
                    r8 = 199880061(0xbe9ed7d, float:9.010567E-32)
                    long r11 = (long) r8
                    r8 = -464(0xfffffffffffffe30, float:NaN)
                    r48 = r6
                    long r6 = (long) r8
                    long r6 = r6 * r11
                    r8 = -929(0xfffffffffffffc5f, float:NaN)
                    r13 = r2
                    long r2 = (long) r8
                    long r2 = r2 * r4
                    long r6 = r6 + r2
                    r2 = -465(0xfffffffffffffe2f, float:NaN)
                    long r2 = (long) r2
                    long r11 = r11 ^ r9
                    long r52 = r4 | r42
                    long r54 = r52 ^ r9
                    long r54 = r11 | r54
                    long r2 = r2 * r54
                    long r6 = r6 + r2
                    r2 = 930(0x3a2, float:1.303E-42)
                    long r2 = (long) r2
                    long r54 = r11 | r42
                    long r54 = r54 ^ r9
                    long r4 = r4 | r54
                    long r2 = r2 * r4
                    long r6 = r6 + r2
                    r2 = 465(0x1d1, float:6.52E-43)
                    long r2 = (long) r2
                    long r4 = r52 | r11
                    long r2 = r2 * r4
                    long r6 = r6 + r2
                    r2 = -511048155(0xffffffffe18a0625, float:-3.1826168E20)
                    long r2 = (long) r2
                    long r6 = r6 + r2
                    r2 = 32
                    long r3 = r6 >> r2
                    int r2 = (int) r3
                    r3 = -1342701573(0xffffffffaff7fffb, float:-4.5110923E-10)
                    r3 = r3 | r1
                    int r3 = ~r3
                    r4 = 25241616(0x1812810, float:4.7444603E-38)
                    r3 = r3 | r4
                    int r3 = r3 * 449
                    r5 = -1332492666(0xffffffffb093c686, float:-1.0752081E-9)
                    int r3 = r3 + r5
                    r5 = -1342701573(0xffffffffaff7fffb, float:-4.5110923E-10)
                    r5 = r5 | r14
                    int r5 = ~r5
                    r4 = r4 | r5
                    int r4 = r4 * 449
                    int r3 = r3 + r4
                    r2 = r2 & r3
                    int r3 = (int) r6
                    long r4 = android.os.Process.getStartUptimeMillis()
                    int r4 = (int) r4
                    int r5 = ~r4
                    r6 = -29661205(0xfffffffffe3b67eb, float:-6.22763E37)
                    r6 = r6 | r5
                    int r6 = ~r6
                    r7 = -1407565206(0xffffffffac1a426a, float:-2.1921583E-12)
                    r6 = r6 | r7
                    int r6 = r6 * 220
                    r7 = -1751625423(0xffffffff97985131, float:-9.843265E-25)
                    int r7 = r7 + r6
                    r6 = -1371905046(0xffffffffae3a63ea, float:-4.2380245E-11)
                    r5 = r5 | r6
                    int r5 = ~r5
                    r6 = -65321365(0xfffffffffc1b466b, float:-3.224937E36)
                    r5 = r5 | r6
                    int r5 = r5 * (-440)
                    int r7 = r7 + r5
                    r5 = -29661205(0xfffffffffe3b67eb, float:-6.22763E37)
                    r4 = r4 | r5
                    int r4 = r4 * 220
                    int r7 = r7 + r4
                    int r4 = o.C19057fuB.AEQbTJ
                    int r4 = r4 + 123
                    int r5 = r4 % 128
                    o.C19057fuB.EZpvd = r5
                    r5 = 2
                    int r4 = r4 % r5
                    r3 = r3 & r7
                    r4 = r2 ^ r3
                    r2 = r2 & r3
                    r2 = r2 | r4
                    long r2 = (long) r2
                    int r2 = (int) r2
                    if (r2 == 0) goto Lc62
                    r2 = r13
                    r0 = r2 ^ 252(0xfc, float:3.53E-43)
                    r2 = r2 & 252(0xfc, float:3.53E-43)
                    r3 = 1
                    int r2 = r2 << r3
                    int r0 = r0 + r2
                    r0 = r0 ^ r1
                    goto Lc76
                Lc62:
                    r2 = r13
                    r3 = r2 & (-73)
                    r2 = r2 | (-73)
                    int r3 = r3 + r2
                    r2 = r3 & 74
                    r3 = r3 | 74
                    int r2 = r2 + r3
                    r3 = r85
                    r6 = r48
                    goto Lb7f
                Lc73:
                    r48 = r6
                    r0 = r1
                Lc76:
                    if (r0 == r1) goto Lce4
                    r2 = 5
                    java.lang.Object[] r2 = new java.lang.Object[r2]
                    r3 = 1
                    int[] r4 = new int[r3]
                    r5 = 0
                    r2[r5] = r4
                    int[] r6 = new int[r3]
                    r7 = 2
                    r2[r7] = r6
                    int[] r7 = new int[r3]
                    r8 = 3
                    r2[r8] = r7
                    int[] r6 = (int[]) r6
                    r6[r5] = r1
                    int[] r7 = (int[]) r7
                    r7[r5] = r0
                    r5 = 0
                    r2[r3] = r5
                    r3 = 4
                    r2[r3] = r5
                    r0 = 16532514(0xfc4422, float:2.3166986E-38)
                    r3 = r1 | r0
                    int r3 = r3 * 988
                    r5 = 921978359(0x36f445f7, float:7.2799116E-6)
                    int r5 = r5 + r3
                    r3 = 217863906(0xcfc56e2, float:3.8879038E-31)
                    r3 = r3 | r14
                    int r3 = ~r3
                    r6 = 855679241(0x3300a109, float:2.9948783E-8)
                    r3 = r3 | r6
                    int r3 = r3 * (-1976)
                    int r5 = r5 + r3
                    r3 = -1057010634(0xffffffffc0ff4c36, float:-7.978053)
                    r1 = r1 | r3
                    int r1 = ~r1
                    r0 = r0 | r1
                    r1 = 1057010633(0x3f00b3c9, float:0.5027433)
                    r1 = r1 | r14
                    int r1 = ~r1
                    r0 = r0 | r1
                    int r0 = r0 * 988
                    int r5 = r5 + r0
                    r0 = r5 & 16
                    r1 = 16
                    r1 = r1 | r5
                    int r0 = r0 + r1
                    r3 = r85
                    int r0 = r0 + r3
                    int r1 = r0 << 13
                    r3 = r0 & r1
                    int r3 = ~r3
                    r0 = r0 | r1
                    r0 = r0 & r3
                    int r1 = r0 >>> 17
                    int r3 = ~r1
                    r3 = r3 & r0
                    int r0 = ~r0
                    r0 = r0 & r1
                    r0 = r0 | r3
                    int r1 = r0 << 5
                    r3 = r0 & r1
                    int r3 = ~r3
                    r0 = r0 | r1
                    r0 = r0 & r3
                    int[] r4 = (int[]) r4
                    r5 = 0
                    r4[r5] = r0
                    goto L92b
                Lce4:
                    r3 = r85
                    r2 = 1
                    r5 = 0
                    java.lang.Object[] r0 = new java.lang.Object[r2]
                    r2 = 325(0x145, float:4.55E-43)
                    r4 = 13
                    a(r5, r4, r2, r0)
                    r0 = r0[r5]
                    java.lang.String r0 = (java.lang.String) r0
                    java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch: java.lang.Throwable -> L1b8
                    r2 = 1845277648(0x6dfcb3d0, float:9.7759503E27)
                    java.lang.Object r4 = o.YY.EZpvd(r2)     // Catch: java.lang.Throwable -> L1b8
                    if (r4 != 0) goto Ld2c
                    r52 = 531(0x213, float:7.44E-43)
                    r53 = 5
                    r54 = 0
                    r55 = 1776058028(0x69dc7eac, float:3.3320234E25)
                    r56 = 0
                    r2 = 1
                    byte r4 = (byte) r2     // Catch: java.lang.Throwable -> L1b8
                    int r5 = -r4
                    byte r5 = (byte) r5     // Catch: java.lang.Throwable -> L1b8
                    int r6 = r5 + 4
                    byte r6 = (byte) r6     // Catch: java.lang.Throwable -> L1b8
                    java.lang.Object[] r7 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L1b8
                    b(r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L1b8
                    r4 = 0
                    r5 = r7[r4]     // Catch: java.lang.Throwable -> L1b8
                    r57 = r5
                    java.lang.String r57 = (java.lang.String) r57     // Catch: java.lang.Throwable -> L1b8
                    java.lang.Class[] r5 = new java.lang.Class[r2]     // Catch: java.lang.Throwable -> L1b8
                    java.lang.Class<java.lang.String> r2 = java.lang.String.class
                    r5[r4] = r2     // Catch: java.lang.Throwable -> L1b8
                    r58 = r5
                    java.lang.Object r4 = o.YY.EZpvd(r52, r53, r54, r55, r56, r57, r58)     // Catch: java.lang.Throwable -> L1b8
                Ld2c:
                    java.lang.reflect.Method r4 = (java.lang.reflect.Method) r4     // Catch: java.lang.Throwable -> L1b8
                    r2 = 0
                    java.lang.Object r0 = r4.invoke(r2, r0)     // Catch: java.lang.Throwable -> L1b8
                    java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> L1b8
                    if (r0 == 0) goto Ld63
                    r2 = 1
                    java.lang.Object[] r4 = new java.lang.Object[r2]
                    r2 = 9
                    r5 = 338(0x152, float:4.74E-43)
                    r6 = 0
                    a(r6, r2, r5, r4)
                    r2 = r4[r6]
                    java.lang.String r2 = (java.lang.String) r2
                    boolean r0 = r0.contains(r2)
                    if (r0 == 0) goto Ld63
                    int r0 = o.C19057fuB.EZpvd
                    int r0 = r0 + 25
                    int r2 = r0 % 128
                    o.C19057fuB.AEQbTJ = r2
                    r2 = 2
                    int r0 = r0 % r2
                    if (r0 == 0) goto Ld5d
                    r0 = r1 & (-31696(0xffffffffffff8430, float:NaN))
                    r2 = r14 & 31695(0x7bcf, float:4.4414E-41)
                    goto Ld61
                Ld5d:
                    r0 = r1 & (-251(0xffffffffffffff05, float:NaN))
                    r2 = r14 & 250(0xfa, float:3.5E-43)
                Ld61:
                    r0 = r0 | r2
                    goto Ld64
                Ld63:
                    r0 = r1
                Ld64:
                    if (r0 == r1) goto Le13
                    int r2 = o.C19057fuB.AEQbTJ
                    r4 = r2 ^ 57
                    r2 = r2 & 57
                    r5 = 1
                    int r2 = r2 << r5
                    int r4 = r4 + r2
                    int r2 = r4 % 128
                    o.C19057fuB.EZpvd = r2
                    r2 = 2
                    int r4 = r4 % r2
                    r4 = 5
                    java.lang.Object[] r4 = new java.lang.Object[r4]
                    int[] r6 = new int[r5]
                    r7 = 0
                    r4[r7] = r6
                    int[] r8 = new int[r5]
                    r4[r2] = r8
                    int[] r2 = new int[r5]
                    r9 = 3
                    r4[r9] = r2
                    int[] r8 = (int[]) r8
                    r8[r7] = r1
                    int[] r2 = (int[]) r2
                    r2[r7] = r0
                    r2 = 0
                    r4[r5] = r2
                    r5 = 4
                    r4[r5] = r2
                    r0 = -52174892(0xfffffffffce3dfd4, float:-9.465529E36)
                    r0 = r0 | r1
                    int r0 = r0 * (-676)
                    r2 = 121481503(0x73da91f, float:1.426848E-34)
                    int r2 = r2 + r0
                    r0 = 954259264(0x38e0d740, float:1.0721246E-4)
                    r0 = r0 | r14
                    int r0 = ~r0
                    r5 = 52174891(0x31c202b, float:4.5881207E-37)
                    r0 = r0 | r5
                    int r0 = r0 * 676
                    int r2 = r2 + r0
                    r0 = -320615276(0xffffffffece3cc94, float:-2.203138E27)
                    r0 = r0 | r14
                    int r0 = ~r0
                    r5 = 268440384(0x10001340, float:2.525838E-29)
                    r0 = r0 | r5
                    r5 = 1006434155(0x3bfcf76b, float:0.007719924)
                    r5 = r5 | r1
                    int r5 = ~r5
                    r0 = r0 | r5
                    int r0 = r0 * 676
                    int r2 = r2 + r0
                    int r0 = r2 * (-755)
                    r5 = -12080(0xffffffffffffd0d0, float:NaN)
                    r7 = r5 & r0
                    r0 = r0 | r5
                    int r7 = r7 + r0
                    int r0 = ~r2
                    r5 = -17
                    r8 = r5 ^ r0
                    r0 = r0 & r5
                    r0 = r0 | r8
                    int r0 = ~r0
                    int r0 = r0 * 1512
                    r8 = r7 | r0
                    r9 = 1
                    int r8 = r8 << r9
                    r0 = r0 ^ r7
                    int r8 = r8 - r0
                    int r0 = ~r2
                    r0 = r0 | r5
                    int r0 = ~r0
                    r5 = r2 ^ 16
                    r7 = 16
                    r2 = r2 & r7
                    r2 = r2 | r5
                    r5 = r2 ^ r1
                    r1 = r1 & r2
                    r1 = r1 | r5
                    int r1 = ~r1
                    r5 = r0 ^ r1
                    r0 = r0 & r1
                    r0 = r0 | r5
                    int r0 = r0 * (-756)
                    r1 = r8 ^ r0
                    r0 = r0 & r8
                    r5 = 1
                    int r0 = r0 << r5
                    int r1 = r1 + r0
                    r0 = r2 ^ r14
                    r2 = r2 & r14
                    r0 = r0 | r2
                    int r0 = r0 * 756
                    int r1 = r1 + r0
                    r0 = r3 ^ r1
                    r1 = r1 & r3
                    int r1 = r1 << r5
                    int r0 = r0 + r1
                    int r1 = r0 << 13
                    r0 = r0 ^ r1
                    int r1 = r0 >>> 17
                    r2 = r0 & r1
                    int r2 = ~r2
                    r0 = r0 | r1
                    r0 = r0 & r2
                    int r1 = r0 << 5
                    r2 = r0 & r1
                    int r2 = ~r2
                    r0 = r0 | r1
                    r0 = r0 & r2
                    int[] r6 = (int[]) r6
                    r2 = 0
                    r6[r2] = r0
                Le10:
                    r0 = r4
                    goto L2ae4
                Le13:
                    r2 = 0
                    r4 = 1
                    java.lang.Object[] r0 = new java.lang.Object[r4]
                    r5 = 17
                    r6 = 347(0x15b, float:4.86E-43)
                    a(r2, r5, r6, r0)
                    r0 = r0[r2]
                    java.lang.String r0 = (java.lang.String) r0
                    java.lang.Object[] r6 = new java.lang.Object[r4]
                    r4 = 16600(0x40d8, float:2.3262E-41)
                    r7 = 364(0x16c, float:5.1E-43)
                    r8 = 6
                    a(r4, r8, r7, r6)
                    r4 = r6[r2]
                    java.lang.String r4 = (java.lang.String) r4
                    java.io.File r2 = new java.io.File
                    r2.<init>(r0)
                    boolean r0 = r2.exists()
                    if (r0 == 0) goto Le77
                    boolean r0 = r2.isFile()
                    if (r0 == 0) goto Le77
                    java.util.Scanner r0 = new java.util.Scanner     // Catch: java.io.IOException -> Le77
                    java.io.FileInputStream r6 = new java.io.FileInputStream     // Catch: java.io.IOException -> Le77
                    r6.<init>(r2)     // Catch: java.io.IOException -> Le77
                    r0.<init>(r6)     // Catch: java.io.IOException -> Le77
                    r2 = 1
                    java.lang.Object[] r6 = new java.lang.Object[r2]     // Catch: java.io.IOException -> Le77
                    r2 = 370(0x172, float:5.18E-43)
                    r7 = 2
                    r8 = 0
                    a(r8, r7, r2, r6)     // Catch: java.io.IOException -> Le77
                    r2 = r6[r8]     // Catch: java.io.IOException -> Le77
                    java.lang.String r2 = (java.lang.String) r2     // Catch: java.io.IOException -> Le77
                    java.util.Scanner r0 = r0.useDelimiter(r2)     // Catch: java.io.IOException -> Le77
                    boolean r2 = r0.hasNext()     // Catch: java.io.IOException -> Le77
                    if (r2 == 0) goto Le68
                    java.lang.String r2 = r0.next()     // Catch: java.io.IOException -> Le77
                    goto Le6a
                Le68:
                    java.lang.String r2 = ""
                Le6a:
                    r0.close()     // Catch: java.io.IOException -> Le77
                    boolean r0 = r2.contains(r4)     // Catch: java.io.IOException -> Le77
                    if (r0 == 0) goto Le77
                    r2 = 1
                    r21 = 1
                    goto Le7a
                Le77:
                    r2 = 1
                    r21 = 0
                Le7a:
                    r0 = r21 ^ 1
                    if (r0 == r2) goto Le84
                    r0 = r1 & (-252(0xffffffffffffff04, float:NaN))
                    r2 = r14 & 251(0xfb, float:3.52E-43)
                    r0 = r0 | r2
                    goto Le85
                Le84:
                    r0 = r1
                Le85:
                    if (r0 == r1) goto Lef7
                    int r2 = o.C19057fuB.EZpvd
                    r4 = r2 ^ 117(0x75, float:1.64E-43)
                    r2 = r2 & 117(0x75, float:1.64E-43)
                    r5 = 1
                    int r2 = r2 << r5
                    int r4 = r4 + r2
                    int r2 = r4 % 128
                    o.C19057fuB.AEQbTJ = r2
                    r2 = 2
                    int r4 = r4 % r2
                    r4 = 5
                    java.lang.Object[] r4 = new java.lang.Object[r4]
                    int[] r6 = new int[r5]
                    r7 = 0
                    r4[r7] = r6
                    int[] r6 = new int[r5]
                    r4[r2] = r6
                    int[] r2 = new int[r5]
                    r8 = 3
                    r4[r8] = r2
                    int[] r6 = (int[]) r6
                    r6[r7] = r1
                    int[] r2 = (int[]) r2
                    r2[r7] = r0
                    r1 = 0
                    r4[r5] = r1
                    r2 = 4
                    r4[r2] = r1
                    long r0 = android.os.Process.getElapsedCpuTime()
                    int r0 = (int) r0
                    r1 = 1055166558(0x3ee4905e, float:0.44641393)
                    r2 = r0 | r1
                    int r2 = ~r2
                    r5 = 219707981(0xd187a4d, float:4.698583E-31)
                    r2 = r2 | r5
                    int r2 = r2 * 191
                    r5 = 1933672985(0x73418219, float:1.5331299E31)
                    int r5 = r5 + r2
                    int r0 = ~r0
                    r0 = r0 | r1
                    int r0 = ~r0
                    r1 = 18377217(0x1186a01, float:2.7994045E-38)
                    r0 = r0 | r1
                    int r0 = r0 * 191
                    int r5 = r5 + r0
                    r0 = r5 | 16
                    r1 = 1
                    int r0 = r0 << r1
                    r1 = 16
                    r1 = r1 ^ r5
                    int r0 = r0 - r1
                    int r0 = r0 + r3
                    int r1 = r0 << 13
                    r0 = r0 ^ r1
                    int r1 = r0 >>> 17
                    int r2 = ~r1
                    r2 = r2 & r0
                    int r0 = ~r0
                    r0 = r0 & r1
                    r0 = r0 | r2
                    int r1 = r0 << 5
                    int r2 = ~r1
                    r2 = r2 & r0
                    int r0 = ~r0
                    r0 = r0 & r1
                    r0 = r0 | r2
                    r2 = 0
                    r1 = r4[r2]
                    int[] r1 = (int[]) r1
                    r1[r2] = r0
                    goto Le10
                Lef7:
                    r2 = 0
                    r4 = 1
                    java.lang.Object[] r0 = new java.lang.Object[r4]
                    r4 = 15603(0x3cf3, float:2.1864E-41)
                    r6 = 23
                    r7 = 372(0x174, float:5.21E-43)
                    a(r4, r6, r7, r0)
                    r0 = r0[r2]
                    java.lang.String r0 = (java.lang.String) r0
                    java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch: java.lang.Throwable -> L1b8
                    r2 = 1845277648(0x6dfcb3d0, float:9.7759503E27)
                    java.lang.Object r4 = o.YY.EZpvd(r2)     // Catch: java.lang.Throwable -> L1b8
                    if (r4 != 0) goto Lf3f
                    r52 = 531(0x213, float:7.44E-43)
                    r53 = 5
                    r54 = 0
                    r55 = 1776058028(0x69dc7eac, float:3.3320234E25)
                    r56 = 0
                    r2 = 1
                    byte r4 = (byte) r2     // Catch: java.lang.Throwable -> L1b8
                    int r6 = -r4
                    byte r6 = (byte) r6     // Catch: java.lang.Throwable -> L1b8
                    int r7 = r6 + 4
                    byte r7 = (byte) r7     // Catch: java.lang.Throwable -> L1b8
                    java.lang.Object[] r8 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L1b8
                    b(r4, r6, r7, r8)     // Catch: java.lang.Throwable -> L1b8
                    r4 = 0
                    r6 = r8[r4]     // Catch: java.lang.Throwable -> L1b8
                    r57 = r6
                    java.lang.String r57 = (java.lang.String) r57     // Catch: java.lang.Throwable -> L1b8
                    java.lang.Class[] r6 = new java.lang.Class[r2]     // Catch: java.lang.Throwable -> L1b8
                    java.lang.Class<java.lang.String> r2 = java.lang.String.class
                    r6[r4] = r2     // Catch: java.lang.Throwable -> L1b8
                    r58 = r6
                    java.lang.Object r4 = o.YY.EZpvd(r52, r53, r54, r55, r56, r57, r58)     // Catch: java.lang.Throwable -> L1b8
                Lf3f:
                    java.lang.reflect.Method r4 = (java.lang.reflect.Method) r4     // Catch: java.lang.Throwable -> L1b8
                    r2 = 0
                    java.lang.Object r0 = r4.invoke(r2, r0)     // Catch: java.lang.Throwable -> L1b8
                    java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> L1b8
                    java.lang.String r0 = r0.toLowerCase()
                    int r2 = o.C19057fuB.AEQbTJ
                    int r2 = r2 + 37
                    int r4 = r2 % 128
                    o.C19057fuB.EZpvd = r4
                    r4 = 2
                    int r2 = r2 % r4
                    r2 = 1
                    java.lang.Object[] r4 = new java.lang.Object[r2]
                    r2 = 57561(0xe0d9, float:8.066E-41)
                    r6 = 395(0x18b, float:5.54E-43)
                    r7 = 4
                    a(r2, r7, r6, r4)
                    r2 = 0
                    r4 = r4[r2]
                    java.lang.String r4 = (java.lang.String) r4
                    boolean r0 = r0.contains(r4)
                    if (r0 == 0) goto Lf74
                    r0 = r1 & 264(0x108, float:3.7E-43)
                    int r0 = ~r0
                    r2 = r1 | 264(0x108, float:3.7E-43)
                    r0 = r0 & r2
                    goto Lf75
                Lf74:
                    r0 = r1
                Lf75:
                    if (r0 == r1) goto Lfe1
                    int r2 = o.C19057fuB.EZpvd
                    int r2 = r2 + 71
                    int r4 = r2 % 128
                    o.C19057fuB.AEQbTJ = r4
                    r4 = 2
                    int r2 = r2 % r4
                    r2 = 5
                    java.lang.Object[] r2 = new java.lang.Object[r2]
                    r5 = 1
                    int[] r6 = new int[r5]
                    r7 = 0
                    r2[r7] = r6
                    int[] r8 = new int[r5]
                    r2[r4] = r8
                    int[] r4 = new int[r5]
                    r9 = 3
                    r2[r9] = r4
                    int[] r8 = (int[]) r8
                    r8[r7] = r1
                    int[] r4 = (int[]) r4
                    r4[r7] = r0
                    r1 = 0
                    r2[r5] = r1
                    r4 = 4
                    r2[r4] = r1
                    r0 = -586334785(0xffffffffdd0d3dbf, float:-6.360938E17)
                    r0 = r0 | r14
                    int r0 = r0 * 184
                    r1 = -1568771581(0xffffffffa27e7203, float:-3.4483776E-18)
                    int r1 = r1 + r0
                    r0 = 486877243(0x1d05283b, float:1.7623202E-21)
                    r0 = r0 | r14
                    int r0 = ~r0
                    r4 = -871549516(0xffffffffcc0d35b4, float:-3.7017296E7)
                    r0 = r0 | r4
                    int r0 = r0 * 184
                    int r1 = r1 + r0
                    r0 = r1 & 16
                    r4 = 16
                    r1 = r1 | r4
                    int r0 = r0 + r1
                    int r0 = -r0
                    int r0 = -r0
                    r1 = r3 | r0
                    r4 = 1
                    int r1 = r1 << r4
                    r0 = r0 ^ r3
                    int r1 = r1 - r0
                    int r0 = r1 << 13
                    r3 = r1 & r0
                    int r3 = ~r3
                    r0 = r0 | r1
                    r0 = r0 & r3
                    int r1 = r0 >>> 17
                    r3 = r0 & r1
                    int r3 = ~r3
                    r0 = r0 | r1
                    r0 = r0 & r3
                    int r1 = r0 << 5
                    r3 = r0 & r1
                    int r3 = ~r3
                    r0 = r0 | r1
                    r0 = r0 & r3
                    int[] r6 = (int[]) r6
                    r4 = 0
                    r6[r4] = r0
                    goto L92b
                Lfe1:
                    r2 = 1
                    r4 = 0
                    java.lang.Object[] r0 = new java.lang.Object[r2]
                    r6 = 42
                    r7 = 399(0x18f, float:5.59E-43)
                    a(r4, r6, r7, r0)
                    r0 = r0[r4]
                    r52 = r0
                    java.lang.String r52 = (java.lang.String) r52
                    java.lang.Object[] r0 = new java.lang.Object[r2]
                    r6 = 49881(0xc2d9, float:6.9898E-41)
                    r7 = 40
                    r8 = 441(0x1b9, float:6.18E-43)
                    a(r6, r7, r8, r0)
                    r0 = r0[r4]
                    r53 = r0
                    java.lang.String r53 = (java.lang.String) r53
                    java.lang.Object[] r0 = new java.lang.Object[r2]
                    r6 = 40224(0x9d20, float:5.6366E-41)
                    r7 = 481(0x1e1, float:6.74E-43)
                    r8 = 27
                    a(r6, r8, r7, r0)
                    r0 = r0[r4]
                    r54 = r0
                    java.lang.String r54 = (java.lang.String) r54
                    java.lang.Object[] r0 = new java.lang.Object[r2]
                    r6 = 508(0x1fc, float:7.12E-43)
                    a(r4, r8, r6, r0)
                    r0 = r0[r4]
                    r55 = r0
                    java.lang.String r55 = (java.lang.String) r55
                    java.lang.Object[] r0 = new java.lang.Object[r2]
                    r6 = 535(0x217, float:7.5E-43)
                    a(r4, r8, r6, r0)
                    r0 = r0[r4]
                    r56 = r0
                    java.lang.String r56 = (java.lang.String) r56
                    java.lang.Object[] r0 = new java.lang.Object[r2]
                    r2 = 10256(0x2810, float:1.4372E-41)
                    r6 = 562(0x232, float:7.88E-43)
                    a(r2, r8, r6, r0)
                    r0 = r0[r4]
                    r57 = r0
                    java.lang.String r57 = (java.lang.String) r57
                    java.lang.String[] r0 = new java.lang.String[]{r52, r53, r54, r55, r56, r57}
                    r2 = 0
                L1044:
                    r4 = 6
                    if (r2 >= r4) goto L10a4
                    int r4 = o.C19057fuB.EZpvd
                    int r4 = r4 + 21
                    int r6 = r4 % 128
                    o.C19057fuB.AEQbTJ = r6
                    r6 = 2
                    int r4 = r4 % r6
                    r4 = r0[r2]
                    java.lang.Object[] r4 = new java.lang.Object[]{r4}     // Catch: java.lang.Throwable -> L1b8
                    r6 = 1845277648(0x6dfcb3d0, float:9.7759503E27)
                    java.lang.Object r7 = o.YY.EZpvd(r6)     // Catch: java.lang.Throwable -> L1b8
                    if (r7 != 0) goto L108a
                    r52 = 531(0x213, float:7.44E-43)
                    r53 = 5
                    r54 = 0
                    r55 = 1776058028(0x69dc7eac, float:3.3320234E25)
                    r56 = 0
                    r6 = 1
                    byte r7 = (byte) r6     // Catch: java.lang.Throwable -> L1b8
                    int r8 = -r7
                    byte r8 = (byte) r8     // Catch: java.lang.Throwable -> L1b8
                    int r11 = r8 + 4
                    byte r11 = (byte) r11     // Catch: java.lang.Throwable -> L1b8
                    java.lang.Object[] r12 = new java.lang.Object[r6]     // Catch: java.lang.Throwable -> L1b8
                    b(r7, r8, r11, r12)     // Catch: java.lang.Throwable -> L1b8
                    r7 = 0
                    r8 = r12[r7]     // Catch: java.lang.Throwable -> L1b8
                    r57 = r8
                    java.lang.String r57 = (java.lang.String) r57     // Catch: java.lang.Throwable -> L1b8
                    java.lang.Class[] r8 = new java.lang.Class[r6]     // Catch: java.lang.Throwable -> L1b8
                    java.lang.Class<java.lang.String> r6 = java.lang.String.class
                    r8[r7] = r6     // Catch: java.lang.Throwable -> L1b8
                    r58 = r8
                    java.lang.Object r7 = o.YY.EZpvd(r52, r53, r54, r55, r56, r57, r58)     // Catch: java.lang.Throwable -> L1b8
                L108a:
                    java.lang.reflect.Method r7 = (java.lang.reflect.Method) r7     // Catch: java.lang.Throwable -> L1b8
                    r6 = 0
                    java.lang.Object r4 = r7.invoke(r6, r4)     // Catch: java.lang.Throwable -> L1b8
                    java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Throwable -> L1b8
                    if (r4 == 0) goto L10a1
                    int r4 = r4.length()
                    if (r4 == 0) goto L10a1
                    r0 = r1 & (-266(0xfffffffffffffef6, float:NaN))
                    r2 = r14 & 265(0x109, float:3.71E-43)
                    r0 = r0 | r2
                    goto L10a5
                L10a1:
                    int r2 = r2 + 1
                    goto L1044
                L10a4:
                    r0 = r1
                L10a5:
                    if (r0 == r1) goto L111d
                    r2 = 5
                    java.lang.Object[] r4 = new java.lang.Object[r2]
                    r2 = 1
                    int[] r5 = new int[r2]
                    r6 = 0
                    r4[r6] = r5
                    int[] r5 = new int[r2]
                    r6 = 2
                    r4[r6] = r5
                    int[] r5 = new int[r2]
                    r2 = 3
                    r4[r2] = r5
                    int r2 = o.C19057fuB.AEQbTJ
                    int r2 = r2 + 91
                    int r7 = r2 % 128
                    o.C19057fuB.EZpvd = r7
                    int r2 = r2 % r6
                    if (r2 != 0) goto L10c8
                    r17 = 5
                    goto L10ca
                L10c8:
                    r17 = 2
                L10ca:
                    r2 = r4[r17]
                    int[] r2 = (int[]) r2
                    r6 = 0
                    r2[r6] = r1
                    int[] r5 = (int[]) r5
                    r5[r6] = r0
                    r1 = 0
                    r2 = 1
                    r4[r2] = r1
                    r2 = 4
                    r4[r2] = r1
                    long r0 = android.os.SystemClock.elapsedRealtime()
                    int r0 = (int) r0
                    r1 = -636269990(0xffffffffda134a5a, float:-1.0364643E16)
                    r1 = r1 | r0
                    int r1 = ~r1
                    r2 = 32284833(0x1eca0a1, float:8.69232E-38)
                    r1 = r1 | r2
                    int r1 = r1 * (-566)
                    r2 = -1926746463(0xffffffff8d282ea1, float:-5.1825124E-31)
                    int r1 = r1 + r2
                    r2 = -603985157(0xffffffffdbffeafb, float:-1.44068966E17)
                    r0 = r0 | r2
                    int r0 = ~r0
                    int r0 = r0 * 566
                    int r1 = r1 + r0
                    r0 = r1 | 16
                    r2 = 1
                    int r0 = r0 << r2
                    r5 = 16
                    r1 = r1 ^ r5
                    int r0 = r0 - r1
                    int r0 = -r0
                    int r0 = -r0
                    r1 = r3 ^ r0
                    r0 = r0 & r3
                    int r0 = r0 << r2
                    int r1 = r1 + r0
                    int r0 = r1 << 13
                    r0 = r0 ^ r1
                    int r1 = r0 >>> 17
                    r0 = r0 ^ r1
                    int r1 = r0 << 5
                    r2 = r0 & r1
                    int r2 = ~r2
                    r0 = r0 | r1
                    r0 = r0 & r2
                    r2 = 0
                    r1 = r4[r2]
                    int[] r1 = (int[]) r1
                    r1[r2] = r0
                    goto Le10
                L111d:
                    r2 = 0
                    r4 = 1
                    java.lang.Object[] r0 = new java.lang.Object[r4]
                    r6 = 347(0x15b, float:4.86E-43)
                    a(r2, r5, r6, r0)
                    r0 = r0[r2]
                    java.lang.String r0 = (java.lang.String) r0
                    java.lang.Object[] r6 = new java.lang.Object[r4]
                    r4 = 589(0x24d, float:8.25E-43)
                    r7 = 6
                    a(r2, r7, r4, r6)
                    r4 = r6[r2]
                    java.lang.String r4 = (java.lang.String) r4
                    java.lang.Object[] r0 = new java.lang.Object[]{r0, r4}     // Catch: java.lang.Throwable -> L1b8
                    r2 = -1888477952(0xffffffff8f701d00, float:-1.1838499E-29)
                    java.lang.Object r2 = o.YY.EZpvd(r2)     // Catch: java.lang.Throwable -> L1b8
                    if (r2 != 0) goto L1175
                    r52 = 200(0xc8, float:2.8E-43)
                    r53 = 4
                    r54 = 45158(0xb066, float:6.328E-41)
                    r55 = -1957638020(0xffffffff8b50d07c, float:-4.021619E-32)
                    r56 = 0
                    r2 = 0
                    byte r4 = (byte) r2     // Catch: java.lang.Throwable -> L1b8
                    int r6 = r4 + 1
                    byte r6 = (byte) r6     // Catch: java.lang.Throwable -> L1b8
                    int r7 = r6 + (-1)
                    byte r7 = (byte) r7     // Catch: java.lang.Throwable -> L1b8
                    r8 = 1
                    java.lang.Object[] r11 = new java.lang.Object[r8]     // Catch: java.lang.Throwable -> L1b8
                    b(r4, r6, r7, r11)     // Catch: java.lang.Throwable -> L1b8
                    r4 = r11[r2]     // Catch: java.lang.Throwable -> L1b8
                    r57 = r4
                    java.lang.String r57 = (java.lang.String) r57     // Catch: java.lang.Throwable -> L1b8
                    r4 = 2
                    java.lang.Class[] r6 = new java.lang.Class[r4]     // Catch: java.lang.Throwable -> L1b8
                    java.lang.Class<java.lang.String> r4 = java.lang.String.class
                    r6[r2] = r4     // Catch: java.lang.Throwable -> L1b8
                    java.lang.Class<java.lang.String> r2 = java.lang.String.class
                    r4 = 1
                    r6[r4] = r2     // Catch: java.lang.Throwable -> L1b8
                    r58 = r6
                    java.lang.Object r2 = o.YY.EZpvd(r52, r53, r54, r55, r56, r57, r58)     // Catch: java.lang.Throwable -> L1b8
                L1175:
                    java.lang.reflect.Method r2 = (java.lang.reflect.Method) r2     // Catch: java.lang.Throwable -> L1b8
                    r4 = 0
                    java.lang.Object r0 = r2.invoke(r4, r0)     // Catch: java.lang.Throwable -> L1b8
                    java.lang.Long r0 = (java.lang.Long) r0     // Catch: java.lang.Throwable -> L1b8
                    long r6 = r0.longValue()     // Catch: java.lang.Throwable -> L1b8
                    r0 = -428241498(0xffffffffe6798da6, float:-2.9462055E23)
                    long r11 = (long) r0
                    r0 = 51
                    r52 = r6
                    long r5 = (long) r0
                    long r5 = r5 * r11
                    r0 = -49
                    long r7 = (long) r0
                    long r7 = r7 * r52
                    long r5 = r5 + r7
                    r0 = -50
                    long r7 = (long) r0
                    long r54 = r11 | r42
                    long r7 = r7 * r54
                    long r5 = r5 + r7
                    r0 = 50
                    long r7 = (long) r0
                    long r54 = r11 ^ r9
                    long r52 = r52 ^ r9
                    long r54 = r54 | r52
                    long r54 = r54 | r42
                    long r54 = r54 ^ r9
                    long r56 = r42 ^ r9
                    long r58 = r52 | r56
                    long r60 = r58 | r11
                    long r60 = r60 ^ r9
                    long r54 = r54 | r60
                    long r54 = r54 * r7
                    long r5 = r5 + r54
                    long r54 = r58 ^ r9
                    long r52 = r52 | r11
                    long r52 = r52 ^ r9
                    long r52 = r54 | r52
                    long r11 = r56 | r11
                    long r11 = r11 ^ r9
                    long r11 = r52 | r11
                    long r7 = r7 * r11
                    long r5 = r5 + r7
                    r0 = -744613935(0xffffffffd39e17d1, float:-1.35800881E12)
                    long r7 = (long) r0
                    long r5 = r5 + r7
                    r4 = 32
                    long r7 = r5 >> r4
                    int r0 = o.C19057fuB.EZpvd
                    r4 = r0 ^ 83
                    r0 = r0 & 83
                    r11 = 1
                    int r0 = r0 << r11
                    int r4 = r4 + r0
                    int r0 = r4 % 128
                    o.C19057fuB.AEQbTJ = r0
                    r11 = 2
                    int r4 = r4 % r11
                    int r0 = (int) r7
                    if (r4 == 0) goto L123f
                    r4 = 1764488686(0x692bf5ee, float:1.299298E25)
                    r4 = r4 | r1
                    int r4 = ~r4
                    r7 = -1093252199(0xffffffffbed64b99, float:-0.4185455)
                    r7 = r7 | r1
                    int r7 = ~r7
                    r4 = r4 | r7
                    int r4 = r4 * 69
                    r7 = -568153086(0xffffffffde22ac02, float:-2.93043653E18)
                    int r7 = r7 + r4
                    r4 = 1630139886(0x6129f5ee, float:1.959513E20)
                    r4 = r4 | r1
                    int r4 = ~r4
                    r8 = 134348800(0x8020000, float:3.912045E-34)
                    r4 = r4 | r8
                    r8 = -1227600999(0xffffffffb6d44b99, float:-6.326893E-6)
                    r8 = r8 | r1
                    int r8 = ~r8
                    r4 = r4 | r8
                    int r4 = r4 * (-69)
                    int r7 = r7 + r4
                    r4 = -1609455192(0xffffffffa011a9a8, float:-1.2338112E-19)
                    int r7 = r7 + r4
                    r0 = r0 & r7
                    int r4 = (int) r5
                    java.lang.Runtime r5 = java.lang.Runtime.getRuntime()
                    long r5 = r5.freeMemory()
                    int r5 = (int) r5
                    int r5 = ~r5
                    r6 = -675660639(0xffffffffd7ba3ca1, float:-4.09539124E14)
                    r6 = r6 | r5
                    r7 = -675283209(0xffffffffd7bffef7, float:-4.22203573E14)
                    r7 = r7 | r5
                    int r7 = ~r7
                    r8 = 2112887048(0x7df01908, float:3.9893086E37)
                    r8 = r8 | r5
                    r11 = 2113264478(0x7df5db5e, float:4.0849985E37)
                    r5 = r5 | r11
                    int r5 = ~r5
                    r5 = r5 | r7
                    int r5 = r5 * (-184)
                    r7 = 1019428157(0x3cc33d3d, float:0.023832912)
                    int r7 = r7 + r5
                    r5 = 377430(0x5c256, float:5.28892E-40)
                    int r6 = ~r6
                    r5 = r5 | r6
                    int r6 = ~r8
                    r5 = r5 | r6
                    int r5 = r5 * 184
                    int r7 = r7 + r5
                    r5 = 1768865608(0x696ebf48, float:1.8039228E25)
                    int r7 = r7 + r5
                    r4 = r4 & r7
                    r0 = r0 | r4
                    r4 = 15
                    r5 = 0
                    int r4 = r4 / r5
                    goto L1297
                L123f:
                    long r7 = android.os.SystemClock.elapsedRealtime()
                    int r4 = (int) r7
                    int r7 = ~r4
                    r8 = 1656472687(0x62bbc46f, float:1.7318478E21)
                    r11 = r8 | r7
                    int r11 = ~r11
                    r12 = 83894656(0x5002180, float:6.024684E-36)
                    r11 = r11 | r12
                    int r11 = r11 * 98
                    r12 = 1830193028(0x6d168784, float:2.9116612E27)
                    int r12 = r12 + r11
                    r11 = 1201268197(0x4799e5e5, float:78795.79)
                    r7 = r7 | r11
                    int r7 = ~r7
                    r7 = r7 | r8
                    r11 = -1201268198(0xffffffffb8661a1a, float:-5.4860582E-5)
                    r11 = r11 | r4
                    int r11 = ~r11
                    r7 = r7 | r11
                    int r7 = r7 * (-49)
                    int r12 = r12 + r7
                    r4 = r4 | r8
                    int r4 = ~r4
                    r7 = 1117373541(0x4299c465, float:76.88358)
                    r4 = r4 | r7
                    int r4 = r4 * 49
                    int r12 = r12 + r4
                    r0 = r0 & r12
                    int r4 = (int) r5
                    int r5 = android.os.Process.myTid()
                    r6 = 475742709(0x1c5b41f5, float:7.254627E-22)
                    r6 = r6 | r5
                    int r6 = ~r6
                    r7 = -1029657590(0xffffffffc2a0ac0a, float:-80.33601)
                    r6 = r6 | r7
                    int r7 = ~r5
                    r8 = -407568821(0xffffffffe7b4fe4b, float:-1.7094337E24)
                    r7 = r7 | r8
                    int r7 = ~r7
                    r6 = r6 | r7
                    int r6 = r6 * (-470)
                    r8 = -44989263(0xfffffffffd5184b1, float:-1.7406102E37)
                    int r8 = r8 + r6
                    r6 = -553914881(0xffffffffdefbedff, float:-9.076723E18)
                    r5 = r5 | r6
                    int r5 = ~r5
                    r5 = r5 | r7
                    int r5 = r5 * 470
                    int r8 = r8 + r5
                    r4 = r4 & r8
                    r5 = r0 ^ r4
                    r0 = r0 & r4
                    r0 = r0 | r5
                L1297:
                    long r4 = (long) r0
                    int r0 = (int) r4
                    if (r0 == 0) goto L12a0
                    r0 = r1 ^ 260(0x104, float:3.64E-43)
                    r11 = 13
                    goto L1309
                L12a0:
                    r4 = 1
                    java.lang.Object[] r0 = new java.lang.Object[r4]
                    r5 = 16494(0x406e, float:2.3113E-41)
                    r6 = 595(0x253, float:8.34E-43)
                    r11 = 13
                    a(r5, r11, r6, r0)
                    r5 = 0
                    r0 = r0[r5]
                    java.lang.String r0 = (java.lang.String) r0
                    java.lang.Object[] r6 = new java.lang.Object[r4]
                    r7 = 9
                    r8 = 608(0x260, float:8.52E-43)
                    a(r5, r7, r8, r6)
                    r6 = r6[r5]
                    java.lang.String r6 = (java.lang.String) r6
                    java.io.File r5 = new java.io.File
                    r5.<init>(r0)
                    boolean r0 = r5.exists()
                    r0 = r0 ^ r4
                    if (r0 == r4) goto L1308
                    boolean r0 = r5.isFile()
                    if (r0 == 0) goto L1308
                    java.util.Scanner r0 = new java.util.Scanner     // Catch: java.io.IOException -> L1308
                    java.io.FileInputStream r7 = new java.io.FileInputStream     // Catch: java.io.IOException -> L1308
                    r7.<init>(r5)     // Catch: java.io.IOException -> L1308
                    r0.<init>(r7)     // Catch: java.io.IOException -> L1308
                    java.lang.Object[] r5 = new java.lang.Object[r4]     // Catch: java.io.IOException -> L1308
                    r4 = 370(0x172, float:5.18E-43)
                    r7 = 2
                    r8 = 0
                    a(r8, r7, r4, r5)     // Catch: java.io.IOException -> L1308
                    r4 = r5[r8]     // Catch: java.io.IOException -> L1308
                    java.lang.String r4 = (java.lang.String) r4     // Catch: java.io.IOException -> L1308
                    java.util.Scanner r0 = r0.useDelimiter(r4)     // Catch: java.io.IOException -> L1308
                    boolean r4 = r0.hasNext()     // Catch: java.io.IOException -> L1308
                    if (r4 == 0) goto L12f6
                    java.lang.String r4 = r0.next()     // Catch: java.io.IOException -> L1308
                    goto L12f8
                L12f6:
                    java.lang.String r4 = ""
                L12f8:
                    r0.close()     // Catch: java.io.IOException -> L1308
                    boolean r0 = r4.contains(r6)     // Catch: java.io.IOException -> L1308
                    if (r0 == 0) goto L1308
                    r0 = r1 & 261(0x105, float:3.66E-43)
                    int r0 = ~r0
                    r4 = r1 | 261(0x105, float:3.66E-43)
                    r0 = r0 & r4
                    goto L1309
                L1308:
                    r0 = r1
                L1309:
                    if (r0 == r1) goto L13d6
                    r4 = 5
                    java.lang.Object[] r2 = new java.lang.Object[r4]
                    r4 = 1
                    int[] r5 = new int[r4]
                    r6 = 0
                    r2[r6] = r5
                    int[] r5 = new int[r4]
                    r7 = 2
                    r2[r7] = r5
                    int[] r7 = new int[r4]
                    r8 = 3
                    r2[r8] = r7
                    int[] r5 = (int[]) r5
                    r5[r6] = r1
                    int[] r7 = (int[]) r7
                    r7[r6] = r0
                    r5 = 0
                    r2[r4] = r5
                    r4 = 4
                    r2[r4] = r5
                    int r0 = android.os.Process.myPid()
                    int r4 = ~r0
                    r5 = -910149015(0xffffffffc9c03a69, float:-1574733.1)
                    r6 = r5 | r4
                    int r6 = ~r6
                    r7 = 364725525(0x15bd4515, float:7.6445484E-26)
                    r6 = r6 | r7
                    int r6 = r6 * (-602)
                    r8 = 873254763(0x340ccf6b, float:1.3113974E-7)
                    int r8 = r8 + r6
                    r0 = r0 | r5
                    int r0 = ~r0
                    r5 = 339559700(0x143d4514, float:9.555685E-27)
                    r0 = r0 | r5
                    r5 = 935314839(0x37bfc597, float:2.2860984E-5)
                    r5 = r5 | r4
                    int r5 = ~r5
                    r0 = r0 | r5
                    int r0 = r0 * (-301)
                    int r8 = r8 + r0
                    r0 = r4 | r7
                    int r0 = ~r0
                    int r0 = r0 * 301
                    int r8 = r8 + r0
                    int r0 = o.C14220dhO.OLrzqt()
                    int r4 = r8 * (-489)
                    r5 = 7856(0x1eb0, float:1.1009E-41)
                    int r5 = r5 + r4
                    int r4 = ~r8
                    r6 = -17
                    r6 = r6 | r4
                    int r7 = ~r0
                    r9 = r6 ^ r7
                    r6 = r6 & r7
                    r6 = r6 | r9
                    int r6 = r6 * (-490)
                    int r5 = r5 + r6
                    r6 = r4 ^ 16
                    r7 = 16
                    r4 = r4 & r7
                    r4 = r4 | r6
                    int r4 = ~r4
                    int r6 = ~r8
                    r0 = r0 | r6
                    int r0 = ~r0
                    r6 = r4 ^ r0
                    r0 = r0 & r4
                    r0 = r0 | r6
                    int r0 = r0 * 490
                    int r5 = r5 + r0
                    int r0 = o.C19057fuB.AEQbTJ
                    int r0 = r0 + 79
                    int r4 = r0 % 128
                    o.C19057fuB.EZpvd = r4
                    r4 = 2
                    int r0 = r0 % r4
                    r0 = r5 ^ (-8330(0xffffffffffffdf76, float:NaN))
                    r4 = r5 & (-8330(0xffffffffffffdf76, float:NaN))
                    r5 = 1
                    int r4 = r4 << r5
                    int r0 = r0 + r4
                    int r4 = r0 * 530
                    int r4 = r4 + 1058
                    int r6 = r3 * 530
                    r7 = r4 ^ r6
                    r4 = r4 & r6
                    int r4 = r4 << r5
                    int r7 = r7 + r4
                    r4 = r14 | r0
                    int r4 = ~r4
                    r5 = r0 | r3
                    int r5 = ~r5
                    r6 = r4 ^ r5
                    r4 = r4 & r5
                    r4 = r4 | r6
                    int r4 = r4 * 529
                    r5 = r7 | r4
                    r6 = 1
                    int r5 = r5 << r6
                    r4 = r4 ^ r7
                    int r5 = r5 - r4
                    int r3 = ~r3
                    r4 = r0 ^ r1
                    r0 = r0 & r1
                    r0 = r0 | r4
                    int r0 = ~r0
                    r1 = r3 ^ r0
                    r0 = r0 & r3
                    r0 = r0 | r1
                    int r0 = r0 * 529
                    r1 = r5 | r0
                    r3 = 1
                    int r1 = r1 << r3
                    r0 = r0 ^ r5
                    int r1 = r1 - r0
                    int r0 = r1 << 13
                    int r3 = ~r0
                    r3 = r3 & r1
                    int r1 = ~r1
                    r0 = r0 & r1
                    r0 = r0 | r3
                    int r1 = r0 >>> 17
                    r0 = r0 ^ r1
                    int r1 = r0 << 5
                    r3 = r0 & r1
                    int r3 = ~r3
                    r0 = r0 | r1
                    r0 = r0 & r3
                    r4 = 0
                    r1 = r2[r4]
                    int[] r1 = (int[]) r1
                    r1[r4] = r0
                    goto L92b
                L13d6:
                    r4 = 0
                    r0 = 1163119633(0x4553cc11, float:3388.7542)
                    java.lang.Object r0 = o.YY.EZpvd(r0)     // Catch: java.lang.Throwable -> L1b8
                    if (r0 != 0) goto L1407
                    r58 = 635(0x27b, float:8.9E-43)
                    r59 = 5
                    r60 = 40467(0x9e13, float:5.6706E-41)
                    r61 = 1098056045(0x4173016d, float:15.187848)
                    r62 = 0
                    byte r0 = (byte) r4     // Catch: java.lang.Throwable -> L1b8
                    int r5 = r0 + 1
                    byte r5 = (byte) r5     // Catch: java.lang.Throwable -> L1b8
                    int r6 = r5 + (-1)
                    byte r6 = (byte) r6     // Catch: java.lang.Throwable -> L1b8
                    r7 = 1
                    java.lang.Object[] r8 = new java.lang.Object[r7]     // Catch: java.lang.Throwable -> L1b8
                    b(r0, r5, r6, r8)     // Catch: java.lang.Throwable -> L1b8
                    r0 = r8[r4]     // Catch: java.lang.Throwable -> L1b8
                    r63 = r0
                    java.lang.String r63 = (java.lang.String) r63     // Catch: java.lang.Throwable -> L1b8
                    java.lang.Class[] r0 = new java.lang.Class[r4]     // Catch: java.lang.Throwable -> L1b8
                    r64 = r0
                    java.lang.Object r0 = o.YY.EZpvd(r58, r59, r60, r61, r62, r63, r64)     // Catch: java.lang.Throwable -> L1b8
                L1407:
                    java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0     // Catch: java.lang.Throwable -> L1b8
                    r4 = 0
                    java.lang.Object r0 = r0.invoke(r4, r4)     // Catch: java.lang.Throwable -> L1b8
                    java.lang.Long r0 = (java.lang.Long) r0     // Catch: java.lang.Throwable -> L1b8
                    long r4 = r0.longValue()     // Catch: java.lang.Throwable -> L1b8
                    r0 = -1914146694(0xffffffff8de8707a, float:-1.4325182E-30)
                    long r6 = (long) r0
                    long r12 = android.os.Process.getStartElapsedRealtime()
                    int r0 = (int) r12
                    r8 = 85
                    long r12 = (long) r8
                    long r52 = r12 * r6
                    long r12 = r12 * r4
                    long r52 = r52 + r12
                    r8 = -84
                    long r12 = (long) r8
                    long r54 = r6 ^ r9
                    long r58 = r4 ^ r9
                    long r60 = r54 | r58
                    long r60 = r60 ^ r9
                    long r2 = (long) r0
                    long r62 = r2 ^ r9
                    long r54 = r54 | r62
                    long r54 = r54 ^ r9
                    long r54 = r60 | r54
                    long r60 = r58 | r62
                    long r60 = r60 ^ r9
                    long r54 = r54 | r60
                    long r60 = r6 | r4
                    long r64 = r60 | r2
                    long r64 = r64 ^ r9
                    long r54 = r54 | r64
                    long r54 = r54 * r12
                    long r52 = r52 + r54
                    long r2 = r58 | r2
                    long r2 = r2 ^ r9
                    long r2 = r2 | r6
                    long r4 = r62 | r4
                    long r4 = r4 ^ r9
                    long r2 = r2 | r4
                    long r12 = r12 * r2
                    long r52 = r52 + r12
                    r0 = 84
                    long r2 = (long) r0
                    long r6 = r60 ^ r9
                    long r4 = r4 | r6
                    long r2 = r2 * r4
                    long r52 = r52 + r2
                    r0 = -3612755(0xffffffffffc8dfad, float:NaN)
                    long r2 = (long) r0
                    long r2 = r52 + r2
                    r4 = 32
                    long r5 = r2 >> r4
                    int r0 = (int) r5
                    int r4 = android.os.Process.myUid()
                    int r5 = ~r4
                    r6 = -298569520(0xffffffffee3430d0, float:-1.3941578E28)
                    r7 = r6 | r5
                    int r7 = ~r7
                    r12 = -1138656892(0xffffffffbc217984, float:-0.009855632)
                    r13 = r12 | r4
                    int r13 = ~r13
                    r7 = r7 | r13
                    r13 = 1138656891(0x43de867b, float:445.05063)
                    r8 = r5 | r13
                    int r8 = ~r8
                    r7 = r7 | r8
                    int r7 = r7 * 959
                    r8 = -1610760620(0xffffffff9ffdbe54, float:-1.0746454E-19)
                    int r7 = r7 + r8
                    r5 = r5 | r12
                    int r5 = ~r5
                    r6 = r6 | r4
                    int r6 = ~r6
                    r5 = r5 | r6
                    r4 = r4 | r13
                    int r4 = ~r4
                    r4 = r4 | r5
                    int r4 = r4 * 959
                    int r7 = r7 + r4
                    r0 = r0 & r7
                    int r4 = o.C19057fuB.EZpvd
                    r5 = r4 | 123(0x7b, float:1.72E-43)
                    r6 = 1
                    int r5 = r5 << r6
                    r4 = r4 ^ 123(0x7b, float:1.72E-43)
                    int r5 = r5 - r4
                    int r4 = r5 % 128
                    o.C19057fuB.AEQbTJ = r4
                    r4 = 2
                    int r5 = r5 % r4
                    int r2 = (int) r2
                    if (r5 == 0) goto L14eb
                    java.lang.Runtime r3 = java.lang.Runtime.getRuntime()
                    long r3 = r3.totalMemory()
                    int r3 = (int) r3
                    int r4 = ~r3
                    r5 = -393987(0xfffffffffff9fcfd, float:NaN)
                    r5 = r5 | r4
                    int r5 = ~r5
                    r6 = 34572034(0x20f8702, float:1.0544726E-37)
                    r6 = r6 | r3
                    int r6 = ~r6
                    r5 = r5 | r6
                    int r5 = r5 * 520
                    r6 = 191374797(0xb6825cd, float:4.4710013E-32)
                    int r6 = r6 + r5
                    r5 = -34572035(0xfffffffffdf078fd, float:-3.9955366E37)
                    r5 = r5 | r4
                    int r5 = ~r5
                    r7 = -1471798445(0xffffffffa8462353, float:-1.0998868E-14)
                    r3 = r3 | r7
                    int r3 = ~r3
                    r5 = r5 | r3
                    int r5 = r5 * (-1040)
                    int r6 = r6 + r5
                    r5 = 1471798444(0x57b9dcac, float:4.08714859E14)
                    r4 = r4 | r5
                    int r4 = ~r4
                    r5 = 34178048(0x2098400, float:1.0103053E-37)
                    r4 = r4 | r5
                    r3 = r3 | r4
                    int r3 = r3 * 520
                    int r6 = r6 + r3
                    r2 = r2 & r6
                    r0 = r0 | r2
                    long r2 = (long) r0
                    int r0 = (int) r2
                    r2 = 1
                    if (r0 != r2) goto L14e5
                    goto L150d
                L14e5:
                    r4 = r85
                    r3 = r2
                    r2 = 0
                    goto L1586
                L14eb:
                    r3 = -473810058(0xffffffffe3c23b76, float:-7.165906E21)
                    r3 = r3 | r14
                    int r3 = ~r3
                    r4 = 202753160(0xc15c488, float:1.1537684E-31)
                    r3 = r3 | r4
                    int r3 = r3 * (-241)
                    r4 = -1496162983(0xffffffffa6d25d59, float:-1.4596979E-15)
                    int r3 = r3 + r4
                    r4 = -271056898(0xffffffffefd7fffe, float:-1.3369751E29)
                    r4 = r4 | r14
                    int r4 = ~r4
                    r5 = -2113789628(0xffffffff82022144, float:-9.560438E-38)
                    r4 = r4 | r5
                    int r4 = r4 * 241
                    int r3 = r3 + r4
                    r2 = r2 & r3
                    r0 = r0 | r2
                    long r2 = (long) r0
                    int r0 = (int) r2
                    r2 = 1
                    if (r0 != r2) goto L1582
                L150d:
                    int r0 = o.C19057fuB.AEQbTJ
                    r3 = r0 ^ 45
                    r0 = r0 & 45
                    int r0 = r0 << r2
                    int r3 = r3 + r0
                    int r0 = r3 % 128
                    o.C19057fuB.EZpvd = r0
                    r4 = 2
                    int r3 = r3 % r4
                    r3 = 5
                    java.lang.Object[] r0 = new java.lang.Object[r3]
                    int[] r3 = new int[r2]
                    r5 = 0
                    r0[r5] = r3
                    int[] r6 = new int[r2]
                    r0[r4] = r6
                    int[] r4 = new int[r2]
                    r7 = 3
                    r0[r7] = r4
                    int[] r6 = (int[]) r6
                    r6[r5] = r1
                    int[] r4 = (int[]) r4
                    r4[r5] = r1
                    r4 = 0
                    r0[r2] = r4
                    r2 = 4
                    r0[r2] = r4
                    r2 = -16778274(0xfffffffffefffbde, float:-1.7013045E38)
                    r2 = r2 | r14
                    int r2 = ~r2
                    int r2 = r2 * 433
                    r4 = -1722634044(0xffffffff9952b0c4, float:-1.0892443E-23)
                    int r4 = r4 + r2
                    r2 = -921629643(0xffffffffc9110c35, float:-594115.3)
                    r2 = r2 | r1
                    int r2 = ~r2
                    r5 = -353244898(0xffffffffeaf1e91e, float:-1.4622599E26)
                    r2 = r2 | r5
                    int r2 = r2 * (-433)
                    int r4 = r4 + r2
                    r1 = r1 | r5
                    int r1 = ~r1
                    r2 = -938407916(0xffffffffc8110814, float:-148512.31)
                    r1 = r1 | r2
                    int r1 = r1 * 433
                    int r4 = r4 + r1
                    int r1 = r4 << 1
                    int r1 = r1 - r4
                    int r1 = -r1
                    int r1 = -r1
                    int r1 = ~r1
                    r4 = r85
                    int r1 = r4 - r1
                    r2 = 1
                    int r1 = r1 - r2
                    int r2 = r1 << 13
                    r4 = r1 & r2
                    int r4 = ~r4
                    r1 = r1 | r2
                    r1 = r1 & r4
                    int r2 = r1 >>> 17
                    r4 = r1 & r2
                    int r4 = ~r4
                    r1 = r1 | r2
                    r1 = r1 & r4
                    int r2 = r1 << 5
                    r4 = r1 & r2
                    int r4 = ~r4
                    r1 = r1 | r2
                    r1 = r1 & r4
                    int[] r3 = (int[]) r3
                    r2 = 0
                    r3[r2] = r1
                    goto L2ae4
                L1582:
                    r4 = r85
                    r2 = 0
                    r3 = 1
                L1586:
                    java.lang.Object[] r0 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L1b8
                    java.lang.Integer r5 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> L1b8
                    r0[r2] = r5     // Catch: java.lang.Throwable -> L1b8
                    r3 = 140339483(0x85d691b, float:6.662832E-34)
                    java.lang.Object r3 = o.YY.EZpvd(r3)     // Catch: java.lang.Throwable -> L1b8
                    if (r3 != 0) goto L15c1
                    r58 = 393(0x189, float:5.51E-43)
                    r59 = 5
                    r60 = 5431(0x1537, float:7.61E-42)
                    r61 = 209560679(0xc7da467, float:1.9539884E-31)
                    r62 = 0
                    byte r3 = (byte) r2     // Catch: java.lang.Throwable -> L1b8
                    int r5 = r3 + 1
                    byte r5 = (byte) r5     // Catch: java.lang.Throwable -> L1b8
                    int r6 = r5 + (-1)
                    byte r6 = (byte) r6     // Catch: java.lang.Throwable -> L1b8
                    r7 = 1
                    java.lang.Object[] r8 = new java.lang.Object[r7]     // Catch: java.lang.Throwable -> L1b8
                    b(r3, r5, r6, r8)     // Catch: java.lang.Throwable -> L1b8
                    r3 = r8[r2]     // Catch: java.lang.Throwable -> L1b8
                    r63 = r3
                    java.lang.String r63 = (java.lang.String) r63     // Catch: java.lang.Throwable -> L1b8
                    java.lang.Class[] r3 = new java.lang.Class[r7]     // Catch: java.lang.Throwable -> L1b8
                    java.lang.Class r5 = java.lang.Integer.TYPE     // Catch: java.lang.Throwable -> L1b8
                    r3[r2] = r5     // Catch: java.lang.Throwable -> L1b8
                    r64 = r3
                    java.lang.Object r3 = o.YY.EZpvd(r58, r59, r60, r61, r62, r63, r64)     // Catch: java.lang.Throwable -> L1b8
                L15c1:
                    java.lang.reflect.Method r3 = (java.lang.reflect.Method) r3     // Catch: java.lang.Throwable -> L1b8
                    r2 = 0
                    java.lang.Object r0 = r3.invoke(r2, r0)     // Catch: java.lang.Throwable -> L1b8
                    java.lang.Long r0 = (java.lang.Long) r0     // Catch: java.lang.Throwable -> L1b8
                    long r2 = r0.longValue()     // Catch: java.lang.Throwable -> L1b8
                    r0 = 1350162153(0x5079d6e9, float:1.67664445E10)
                    long r5 = (long) r0
                    long r7 = android.os.SystemClock.uptimeMillis()
                    int r0 = (int) r7
                    long r7 = r37 * r5
                    long r12 = r40 * r2
                    long r7 = r7 + r12
                    long r12 = r2 ^ r9
                    r37 = r14
                    long r14 = (long) r0
                    long r40 = r14 ^ r9
                    long r40 = r12 | r40
                    long r40 = r40 | r5
                    long r40 = r40 ^ r9
                    long r40 = r40 * r35
                    long r7 = r7 + r40
                    long r12 = r12 | r5
                    long r40 = r12 ^ r9
                    long r33 = r33 * r40
                    long r7 = r7 + r33
                    long r5 = r5 ^ r9
                    long r2 = r2 | r5
                    long r2 = r2 ^ r9
                    long r5 = r12 | r14
                    long r5 = r5 ^ r9
                    long r2 = r2 | r5
                    long r2 = r2 * r35
                    long r7 = r7 + r2
                    r0 = 539769470(0x202c3a7e, float:1.458832E-19)
                    long r2 = (long) r0
                    long r7 = r7 + r2
                    r2 = 32
                    long r5 = r7 >> r2
                    int r0 = (int) r5
                    long r2 = android.os.SystemClock.elapsedRealtime()
                    int r2 = (int) r2
                    int r3 = ~r2
                    r5 = 1593644351(0x5efd153f, float:9.1182758E18)
                    r6 = r5 | r3
                    int r6 = ~r6
                    r12 = -1264096534(0xffffffffb4a76aea, float:-3.1183964E-7)
                    r6 = r6 | r12
                    int r6 = r6 * (-602)
                    r13 = 2009711534(0x77c9c3ae, float:8.1845353E33)
                    int r13 = r13 + r6
                    r2 = r2 | r5
                    int r2 = ~r2
                    r5 = -1610454336(0xffffffffa0026ac0, float:-1.1046749E-19)
                    r2 = r2 | r5
                    r5 = -1247286550(0xffffffffb5a7eaea, float:-1.2510839E-6)
                    r5 = r5 | r3
                    int r5 = ~r5
                    r2 = r2 | r5
                    int r2 = r2 * (-301)
                    int r13 = r13 + r2
                    r2 = r3 | r12
                    int r2 = ~r2
                    int r2 = r2 * 301
                    int r13 = r13 + r2
                    r0 = r0 & r13
                    int r2 = (int) r7
                    long r5 = android.os.Process.getElapsedCpuTime()
                    int r3 = (int) r5
                    int r5 = ~r3
                    r6 = -1363082048(0xffffffffaec104c0, float:-8.7774676E-11)
                    r7 = r6 | r5
                    int r7 = ~r7
                    r8 = -1494658839(0xffffffffa6e950e9, float:-1.6189554E-15)
                    r12 = r8 | r5
                    int r12 = ~r12
                    r7 = r7 | r12
                    int r7 = r7 * (-867)
                    r12 = -1972008908(0xffffffff8a758834, float:-1.1821938E-32)
                    int r12 = r12 + r7
                    r6 = r6 | r3
                    int r6 = ~r6
                    r7 = 1360440086(0x5116ab16, float:4.0444715E10)
                    r6 = r6 | r7
                    r7 = r8 | r3
                    int r7 = ~r7
                    r6 = r6 | r7
                    int r6 = r6 * (-1734)
                    int r12 = r12 + r6
                    r6 = -1360440087(0xffffffffaee954e9, float:-1.06106963E-10)
                    r5 = r5 | r6
                    int r5 = ~r5
                    r6 = -2641962(0xffffffffffd7afd6, float:NaN)
                    r6 = r6 | r3
                    int r6 = ~r6
                    r5 = r5 | r6
                    r6 = -134218753(0xfffffffff7fffbff, float:-1.0383959E34)
                    r3 = r3 | r6
                    int r3 = ~r3
                    r3 = r3 | r5
                    int r3 = r3 * 867
                    int r12 = r12 + r3
                    r2 = r2 & r12
                    r3 = r0 ^ r2
                    r0 = r0 & r2
                    r0 = r0 | r3
                    long r2 = (long) r0
                    int r0 = (int) r2
                    if (r0 == 0) goto L167f
                    r0 = r1 & 220(0xdc, float:3.08E-43)
                    int r0 = ~r0
                    r2 = r1 | 220(0xdc, float:3.08E-43)
                    r0 = r0 & r2
                    goto L1680
                L167f:
                    r0 = r1
                L1680:
                    if (r0 == r1) goto L1754
                    r2 = 5
                    java.lang.Object[] r2 = new java.lang.Object[r2]
                    r3 = 1
                    int[] r5 = new int[r3]
                    r6 = 0
                    r2[r6] = r5
                    int[] r5 = new int[r3]
                    r7 = 2
                    r2[r7] = r5
                    int[] r7 = new int[r3]
                    r8 = 3
                    r2[r8] = r7
                    int[] r5 = (int[]) r5
                    r5[r6] = r1
                    int[] r7 = (int[]) r7
                    r7[r6] = r0
                    r5 = 0
                    r2[r3] = r5
                    r3 = 4
                    r2[r3] = r5
                    java.util.Random r0 = new java.util.Random
                    r0.<init>()
                    r3 = 494809515(0x1d7e31ab, float:3.3642298E-21)
                    int r0 = r0.nextInt(r3)
                    r3 = -536880325(0xffffffffdfffdb3b, float:-3.6872789E19)
                    r3 = r3 | r0
                    int r3 = ~r3
                    int r5 = ~r0
                    r6 = 737994215(0x2bfce5e7, float:1.7969488E-12)
                    r5 = r5 | r6
                    int r5 = ~r5
                    r3 = r3 | r5
                    int r3 = r3 * (-318)
                    r5 = 1602593957(0x5f85a4a5, float:1.9260007E19)
                    int r5 = r5 + r3
                    r3 = 596403428(0x238c64e4, float:1.522156E-17)
                    r3 = r3 | r0
                    int r3 = ~r3
                    r6 = 141590787(0x8708103, float:7.2374025E-34)
                    r3 = r3 | r6
                    int r3 = r3 * (-318)
                    int r5 = r5 + r3
                    r3 = -596403429(0xffffffffdc739b1b, float:-2.74275838E17)
                    r0 = r0 | r3
                    int r0 = ~r0
                    r3 = -678471112(0xffffffffd78f5a38, float:-3.15235299E14)
                    r0 = r0 | r3
                    int r0 = r0 * 318
                    int r5 = r5 + r0
                    int r0 = r5 * 517
                    int r0 = -r0
                    int r0 = -r0
                    r3 = -8240(0xffffffffffffdfd0, float:NaN)
                    r6 = r3 ^ r0
                    r0 = r0 & r3
                    r3 = 1
                    int r0 = r0 << r3
                    int r6 = r6 + r0
                    int r0 = ~r5
                    r3 = r0 ^ r1
                    r0 = r0 & r1
                    r0 = r0 | r3
                    int r0 = ~r0
                    r3 = r37 ^ 16
                    r7 = r37 & 16
                    r3 = r3 | r7
                    int r3 = ~r3
                    r7 = r0 ^ r3
                    r0 = r0 & r3
                    r0 = r0 | r7
                    r3 = r37 ^ r5
                    r7 = r37 & r5
                    r3 = r3 | r7
                    int r3 = ~r3
                    r7 = r0 ^ r3
                    r0 = r0 & r3
                    r0 = r0 | r7
                    int r0 = r0 * (-516)
                    int r0 = ~r0
                    int r6 = r6 - r0
                    r3 = 1
                    int r6 = r6 - r3
                    int r0 = ~r5
                    r3 = -17
                    r7 = r3 ^ r0
                    r0 = r0 & r3
                    r0 = r0 | r7
                    r7 = r0 ^ r1
                    r0 = r0 & r1
                    r0 = r0 | r7
                    int r0 = ~r0
                    r7 = r3 | r37
                    r3 = r7 ^ r5
                    r7 = r7 & r5
                    r3 = r3 | r7
                    int r3 = ~r3
                    r7 = r0 ^ r3
                    r0 = r0 & r3
                    r0 = r0 | r7
                    int r0 = r0 * 516
                    r3 = r6 & r0
                    r0 = r0 | r6
                    int r3 = r3 + r0
                    r6 = -17
                    r0 = r6 | r5
                    int r0 = ~r0
                    int r1 = ~r1
                    r1 = r1 | r5
                    int r1 = ~r1
                    r5 = r0 ^ r1
                    r0 = r0 & r1
                    r0 = r0 | r5
                    int r0 = r0 * 516
                    r1 = r3 ^ r0
                    r0 = r0 & r3
                    r3 = 1
                    int r0 = r0 << r3
                    int r1 = r1 + r0
                    r0 = r4 & r1
                    r1 = r1 | r4
                    int r0 = r0 + r1
                    int r1 = r0 << 13
                    r3 = r0 & r1
                    int r3 = ~r3
                    r0 = r0 | r1
                    r0 = r0 & r3
                    int r1 = r0 >>> 17
                    r0 = r0 ^ r1
                    int r1 = r0 << 5
                    r3 = r0 & r1
                    int r3 = ~r3
                    r0 = r0 | r1
                    r0 = r0 & r3
                    r5 = 0
                    r1 = r2[r5]
                    int[] r1 = (int[]) r1
                    r1[r5] = r0
                    goto L92b
                L1754:
                    r2 = 1
                    r3 = 4
                    r5 = 0
                    java.lang.Object[] r0 = new java.lang.Object[r2]
                    r2 = 15603(0x3cf3, float:2.1864E-41)
                    r6 = 23
                    r7 = 372(0x174, float:5.21E-43)
                    a(r2, r6, r7, r0)
                    r0 = r0[r5]
                    java.lang.String r0 = (java.lang.String) r0
                    java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch: java.lang.Throwable -> L1b8
                    r2 = 1845277648(0x6dfcb3d0, float:9.7759503E27)
                    java.lang.Object r5 = o.YY.EZpvd(r2)     // Catch: java.lang.Throwable -> L1b8
                    if (r5 != 0) goto L179d
                    r58 = 531(0x213, float:7.44E-43)
                    r59 = 5
                    r60 = 0
                    r61 = 1776058028(0x69dc7eac, float:3.3320234E25)
                    r62 = 0
                    r2 = 1
                    byte r5 = (byte) r2     // Catch: java.lang.Throwable -> L1b8
                    int r6 = -r5
                    byte r6 = (byte) r6     // Catch: java.lang.Throwable -> L1b8
                    int r7 = r6 + 4
                    byte r7 = (byte) r7     // Catch: java.lang.Throwable -> L1b8
                    java.lang.Object[] r8 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L1b8
                    b(r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L1b8
                    r5 = 0
                    r6 = r8[r5]     // Catch: java.lang.Throwable -> L1b8
                    r63 = r6
                    java.lang.String r63 = (java.lang.String) r63     // Catch: java.lang.Throwable -> L1b8
                    java.lang.Class[] r6 = new java.lang.Class[r2]     // Catch: java.lang.Throwable -> L1b8
                    java.lang.Class<java.lang.String> r2 = java.lang.String.class
                    r6[r5] = r2     // Catch: java.lang.Throwable -> L1b8
                    r64 = r6
                    java.lang.Object r5 = o.YY.EZpvd(r58, r59, r60, r61, r62, r63, r64)     // Catch: java.lang.Throwable -> L1b8
                L179d:
                    java.lang.reflect.Method r5 = (java.lang.reflect.Method) r5     // Catch: java.lang.Throwable -> L1b8
                    r2 = 0
                    java.lang.Object r0 = r5.invoke(r2, r0)     // Catch: java.lang.Throwable -> L1b8
                    r5 = 19
                    if (r0 == 0) goto L188e
                    r2 = 2
                    java.lang.Object[] r6 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L1b8
                    r2 = 42
                    java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L1b8
                    r7 = 1
                    r6[r7] = r2     // Catch: java.lang.Throwable -> L1b8
                    r2 = 0
                    r6[r2] = r0     // Catch: java.lang.Throwable -> L1b8
                    r0 = 1485637403(0x588d071b, float:1.24049326E15)
                    java.lang.Object r0 = o.YY.EZpvd(r0)     // Catch: java.lang.Throwable -> L1b8
                    if (r0 != 0) goto L17f0
                    r58 = 398(0x18e, float:5.58E-43)
                    r59 = 5
                    r60 = 0
                    r61 = 1554893415(0x5cadca67, float:3.91341718E17)
                    r62 = 0
                    byte r0 = (byte) r2     // Catch: java.lang.Throwable -> L1b8
                    int r7 = r0 + 1
                    byte r7 = (byte) r7     // Catch: java.lang.Throwable -> L1b8
                    int r8 = r7 + (-1)
                    byte r8 = (byte) r8     // Catch: java.lang.Throwable -> L1b8
                    r12 = 1
                    java.lang.Object[] r13 = new java.lang.Object[r12]     // Catch: java.lang.Throwable -> L1b8
                    b(r0, r7, r8, r13)     // Catch: java.lang.Throwable -> L1b8
                    r0 = r13[r2]     // Catch: java.lang.Throwable -> L1b8
                    r63 = r0
                    java.lang.String r63 = (java.lang.String) r63     // Catch: java.lang.Throwable -> L1b8
                    r7 = 2
                    java.lang.Class[] r0 = new java.lang.Class[r7]     // Catch: java.lang.Throwable -> L1b8
                    java.lang.Class<java.lang.String> r7 = java.lang.String.class
                    r0[r2] = r7     // Catch: java.lang.Throwable -> L1b8
                    java.lang.Class r2 = java.lang.Integer.TYPE     // Catch: java.lang.Throwable -> L1b8
                    r7 = 1
                    r0[r7] = r2     // Catch: java.lang.Throwable -> L1b8
                    r64 = r0
                    java.lang.Object r0 = o.YY.EZpvd(r58, r59, r60, r61, r62, r63, r64)     // Catch: java.lang.Throwable -> L1b8
                L17f0:
                    java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0     // Catch: java.lang.Throwable -> L1b8
                    r12 = 0
                    java.lang.Object r0 = r0.invoke(r12, r6)     // Catch: java.lang.Throwable -> L1b8
                    java.lang.Long r0 = (java.lang.Long) r0     // Catch: java.lang.Throwable -> L1b8
                    long r6 = r0.longValue()     // Catch: java.lang.Throwable -> L1b8
                    r0 = -583089971(0xffffffffdd3ec0cd, float:-8.5907572E17)
                    long r13 = (long) r0
                    r0 = 375(0x177, float:5.25E-43)
                    long r11 = (long) r0
                    long r11 = r11 * r13
                    r0 = -747(0xfffffffffffffd15, float:NaN)
                    long r3 = (long) r0
                    long r3 = r3 * r6
                    long r11 = r11 + r3
                    r0 = -374(0xfffffffffffffe8a, float:NaN)
                    long r2 = (long) r0
                    long r34 = r13 ^ r9
                    long r40 = r34 | r6
                    long r40 = r40 ^ r9
                    long r52 = r56 | r13
                    long r52 = r52 ^ r9
                    long r40 = r40 | r52
                    long r2 = r2 * r40
                    long r11 = r11 + r2
                    r0 = 748(0x2ec, float:1.048E-42)
                    long r2 = (long) r0
                    long r6 = r6 ^ r9
                    long r13 = r13 | r6
                    long r13 = r13 ^ r9
                    long r2 = r2 * r13
                    long r11 = r11 + r2
                    r0 = 374(0x176, float:5.24E-43)
                    long r2 = (long) r0
                    long r6 = r34 | r6
                    long r6 = r6 ^ r9
                    long r6 = r6 | r52
                    long r2 = r2 * r6
                    long r11 = r11 + r2
                    r0 = 1911043501(0x71e835ad, float:2.2996932E30)
                    long r2 = (long) r0
                    long r11 = r11 + r2
                    r3 = 32
                    long r6 = r11 >> r3
                    int r0 = (int) r6
                    r2 = -626328593(0xffffffffdaaafbef, float:-2.4063875E16)
                    r2 = r2 | r1
                    int r2 = ~r2
                    int r2 = r2 * 501
                    r4 = 1179214426(0x4649625a, float:12888.588)
                    int r2 = r2 + r4
                    r4 = -626328593(0xffffffffdaaafbef, float:-2.4063875E16)
                    r4 = r37 | r4
                    int r4 = ~r4
                    int r4 = r4 * 501
                    int r2 = r2 + r4
                    r0 = r0 & r2
                    int r2 = (int) r11
                    r4 = 1734638538(0x67647bca, float:1.07898306E24)
                    r6 = r4 | r1
                    int r6 = ~r6
                    r7 = 278529056(0x109a0420, float:6.0748645E-29)
                    r6 = r6 | r7
                    int r6 = r6 * 336
                    r7 = -501357939(0xffffffffe21de28d, float:-7.281159E20)
                    int r7 = r7 + r6
                    r6 = 297412128(0x11ba2620, float:2.9369122E-28)
                    r8 = r6 | r1
                    int r8 = ~r8
                    r11 = 1715755466(0x664459ca, float:2.3181004E23)
                    r8 = r8 | r11
                    int r8 = r8 * (-168)
                    int r7 = r7 + r8
                    r6 = r37 | r6
                    int r6 = ~r6
                    r4 = r4 | r6
                    int r4 = r4 * 168
                    int r7 = r7 + r4
                    r2 = r2 & r7
                    r0 = r0 | r2
                    long r6 = (long) r0
                    int r0 = (int) r6
                    r2 = 1986687685(0x766a72c5, float:1.1887942E33)
                    if (r0 != r2) goto L1890
                    r5 = r85
                    r30 = r44
                    r34 = r46
                    r44 = r48
                    r40 = r50
                    r2 = -1
                    r3 = 0
                    r4 = 0
                    r6 = 4
                    r7 = 1
                    r46 = r9
                    goto L1eee
                L188e:
                    r3 = 32
                L1890:
                    r4 = 1
                    java.lang.Object[] r0 = new java.lang.Object[r4]
                    r2 = 15603(0x3cf3, float:2.1864E-41)
                    r6 = 23
                    r7 = 372(0x174, float:5.21E-43)
                    a(r2, r6, r7, r0)
                    r6 = 0
                    r0 = r0[r6]
                    java.lang.String r0 = (java.lang.String) r0
                    java.lang.Object[] r2 = new java.lang.Object[r4]
                    r7 = 3970(0xf82, float:5.563E-42)
                    r8 = 10
                    r11 = 617(0x269, float:8.65E-43)
                    a(r7, r8, r11, r2)
                    r2 = r2[r6]
                    java.lang.String r2 = (java.lang.String) r2
                    java.lang.Object[] r7 = new java.lang.Object[r4]
                    r8 = 13845(0x3615, float:1.9401E-41)
                    r11 = 7
                    r12 = 627(0x273, float:8.79E-43)
                    a(r8, r11, r12, r7)
                    r7 = r7[r6]
                    java.lang.String r7 = (java.lang.String) r7
                    java.lang.Object[] r8 = new java.lang.Object[r4]
                    r11 = 634(0x27a, float:8.88E-43)
                    r12 = 8
                    a(r6, r12, r11, r8)
                    r8 = r8[r6]
                    java.lang.String r8 = (java.lang.String) r8
                    java.lang.String[] r58 = new java.lang.String[]{r0, r2, r7, r8}
                    java.lang.Object[] r0 = new java.lang.Object[r4]
                    r2 = 61108(0xeeb4, float:8.563E-41)
                    r7 = 642(0x282, float:9.0E-43)
                    r8 = 17
                    a(r2, r8, r7, r0)
                    r0 = r0[r6]
                    java.lang.String r0 = (java.lang.String) r0
                    java.lang.Object[] r7 = new java.lang.Object[r4]
                    r8 = 7
                    r11 = 659(0x293, float:9.23E-43)
                    a(r6, r8, r11, r7)
                    r7 = r7[r6]
                    java.lang.String r7 = (java.lang.String) r7
                    java.lang.Object[] r8 = new java.lang.Object[r4]
                    r11 = 7
                    r12 = 666(0x29a, float:9.33E-43)
                    a(r6, r11, r12, r8)
                    r8 = r8[r6]
                    java.lang.String r8 = (java.lang.String) r8
                    java.lang.Object[] r11 = new java.lang.Object[r4]
                    r12 = 11
                    r13 = 673(0x2a1, float:9.43E-43)
                    a(r6, r12, r13, r11)
                    r11 = r11[r6]
                    java.lang.String r11 = (java.lang.String) r11
                    java.lang.Object[] r12 = new java.lang.Object[r4]
                    r13 = 35683(0x8b63, float:5.0003E-41)
                    r14 = 684(0x2ac, float:9.58E-43)
                    r15 = 14
                    a(r13, r15, r14, r12)
                    r12 = r12[r6]
                    java.lang.String r12 = (java.lang.String) r12
                    java.lang.String[] r59 = new java.lang.String[]{r0, r7, r8, r11, r12}
                    java.lang.Object[] r0 = new java.lang.Object[r4]
                    r7 = 698(0x2ba, float:9.78E-43)
                    r8 = 16
                    a(r6, r8, r7, r0)
                    r0 = r0[r6]
                    r7 = r0
                    java.lang.String r7 = (java.lang.String) r7
                    java.lang.Object[] r0 = new java.lang.Object[r4]
                    r8 = 54544(0xd510, float:7.6432E-41)
                    r11 = 714(0x2ca, float:1.0E-42)
                    r12 = 3
                    a(r8, r12, r11, r0)
                    r0 = r0[r6]
                    r8 = r0
                    java.lang.String r8 = (java.lang.String) r8
                    java.lang.Object[] r0 = new java.lang.Object[r4]
                    r11 = 22
                    r12 = 725(0x2d5, float:1.016E-42)
                    a(r6, r11, r12, r0)
                    r0 = r0[r6]
                    java.lang.String r0 = (java.lang.String) r0
                    java.lang.Object[] r11 = new java.lang.Object[r4]
                    r12 = 15027(0x3ab3, float:2.1057E-41)
                    r13 = 25
                    r14 = 747(0x2eb, float:1.047E-42)
                    a(r12, r13, r14, r11)
                    r11 = r11[r6]
                    java.lang.String r11 = (java.lang.String) r11
                    java.lang.Object[] r12 = new java.lang.Object[r4]
                    r4 = 63600(0xf870, float:8.9123E-41)
                    r13 = 772(0x304, float:1.082E-42)
                    r14 = 28
                    a(r4, r14, r13, r12)
                    r4 = r12[r6]
                    r12 = r4
                    java.lang.String r12 = (java.lang.String) r12
                    r30 = r44
                    r34 = r46
                    r44 = r48
                    r40 = r50
                    r46 = r9
                    r9 = r39
                    r4 = 0
                    r10 = r0
                    r0 = 13
                    r6 = 4
                    java.lang.String[] r60 = new java.lang.String[]{r7, r8, r9, r10, r11, r12}
                    r7 = 1
                    java.lang.Object[] r8 = new java.lang.Object[r7]
                    r9 = 11
                    r10 = 800(0x320, float:1.121E-42)
                    r11 = 0
                    a(r11, r9, r10, r8)
                    r8 = r8[r11]
                    java.lang.String r8 = (java.lang.String) r8
                    java.lang.Object[] r9 = new java.lang.Object[r7]
                    r10 = 811(0x32b, float:1.136E-42)
                    r12 = 8
                    a(r11, r12, r10, r9)
                    r9 = r9[r11]
                    java.lang.String r9 = (java.lang.String) r9
                    java.lang.Object[] r10 = new java.lang.Object[r7]
                    r12 = 819(0x333, float:1.148E-42)
                    r13 = 6
                    a(r11, r13, r12, r10)
                    r10 = r10[r11]
                    java.lang.String r10 = (java.lang.String) r10
                    java.lang.Object[] r12 = new java.lang.Object[r7]
                    r14 = 825(0x339, float:1.156E-42)
                    a(r11, r13, r14, r12)
                    r12 = r12[r11]
                    java.lang.String r12 = (java.lang.String) r12
                    java.lang.String[] r61 = new java.lang.String[]{r8, r9, r10, r12}
                    java.lang.Object[] r8 = new java.lang.Object[r7]
                    r9 = 831(0x33f, float:1.164E-42)
                    r10 = 16
                    a(r11, r10, r9, r8)
                    r8 = r8[r11]
                    java.lang.String r8 = (java.lang.String) r8
                    java.lang.Object[] r9 = new java.lang.Object[r7]
                    r10 = 7
                    r12 = 666(0x29a, float:9.33E-43)
                    a(r11, r10, r12, r9)
                    r9 = r9[r11]
                    java.lang.String r9 = (java.lang.String) r9
                    java.lang.Object[] r10 = new java.lang.Object[r7]
                    r12 = 634(0x27a, float:8.88E-43)
                    r14 = 8
                    a(r11, r14, r12, r10)
                    r10 = r10[r11]
                    java.lang.String r10 = (java.lang.String) r10
                    java.lang.String[] r62 = new java.lang.String[]{r8, r9, r10}
                    java.lang.Object[] r8 = new java.lang.Object[r7]
                    r9 = 51286(0xc856, float:7.1867E-41)
                    r10 = 847(0x34f, float:1.187E-42)
                    r12 = 14
                    a(r9, r12, r10, r8)
                    r8 = r8[r11]
                    java.lang.String r8 = (java.lang.String) r8
                    java.lang.Object[] r9 = new java.lang.Object[r7]
                    r10 = 861(0x35d, float:1.207E-42)
                    a(r11, r7, r10, r9)
                    r9 = r9[r11]
                    java.lang.String r9 = (java.lang.String) r9
                    java.lang.String[] r63 = new java.lang.String[]{r8, r9}
                    java.lang.Object[] r8 = new java.lang.Object[r7]
                    r9 = 63354(0xf77a, float:8.8778E-41)
                    r10 = 9
                    r12 = 862(0x35e, float:1.208E-42)
                    a(r9, r10, r12, r8)
                    r8 = r8[r11]
                    java.lang.String r8 = (java.lang.String) r8
                    java.lang.Object[] r9 = new java.lang.Object[r7]
                    r10 = 871(0x367, float:1.22E-42)
                    a(r11, r7, r10, r9)
                    r9 = r9[r11]
                    java.lang.String r9 = (java.lang.String) r9
                    java.lang.String[] r64 = new java.lang.String[]{r8, r9}
                    java.lang.Object[] r8 = new java.lang.Object[r7]
                    r9 = 42140(0xa49c, float:5.9051E-41)
                    r10 = 872(0x368, float:1.222E-42)
                    r12 = 16
                    a(r9, r12, r10, r8)
                    r8 = r8[r11]
                    r48 = r8
                    java.lang.String r48 = (java.lang.String) r48
                    java.lang.Object[] r8 = new java.lang.Object[r7]
                    r9 = 54544(0xd510, float:7.6432E-41)
                    r10 = 714(0x2ca, float:1.0E-42)
                    r12 = 3
                    a(r9, r12, r10, r8)
                    r8 = r8[r11]
                    r49 = r8
                    java.lang.String r49 = (java.lang.String) r49
                    java.lang.Object[] r8 = new java.lang.Object[r7]
                    r9 = 7
                    r10 = 659(0x293, float:9.23E-43)
                    a(r11, r9, r10, r8)
                    r8 = r8[r11]
                    r50 = r8
                    java.lang.String r50 = (java.lang.String) r50
                    java.lang.Object[] r8 = new java.lang.Object[r7]
                    r9 = 42466(0xa5e2, float:5.9508E-41)
                    r10 = 888(0x378, float:1.244E-42)
                    r12 = 8
                    a(r9, r12, r10, r8)
                    r8 = r8[r11]
                    r51 = r8
                    java.lang.String r51 = (java.lang.String) r51
                    java.lang.Object[] r8 = new java.lang.Object[r7]
                    r9 = 11
                    r10 = 673(0x2a1, float:9.43E-43)
                    a(r11, r9, r10, r8)
                    r8 = r8[r11]
                    r52 = r8
                    java.lang.String r52 = (java.lang.String) r52
                    java.lang.Object[] r8 = new java.lang.Object[r7]
                    r7 = 35683(0x8b63, float:5.0003E-41)
                    r9 = 684(0x2ac, float:9.58E-43)
                    r10 = 14
                    a(r7, r10, r9, r8)
                    r7 = r8[r11]
                    r53 = r7
                    java.lang.String r53 = (java.lang.String) r53
                    java.lang.String[] r65 = new java.lang.String[]{r48, r49, r50, r51, r52, r53}
                    r7 = 1
                    java.lang.Object[] r8 = new java.lang.Object[r7]
                    r9 = 54166(0xd396, float:7.5903E-41)
                    r10 = 20
                    r11 = 896(0x380, float:1.256E-42)
                    a(r9, r10, r11, r8)
                    r9 = 0
                    r8 = r8[r9]
                    java.lang.String r8 = (java.lang.String) r8
                    java.lang.Object[] r10 = new java.lang.Object[r7]
                    r11 = 14122(0x372a, float:1.9789E-41)
                    r12 = 916(0x394, float:1.284E-42)
                    a(r11, r5, r12, r10)
                    r10 = r10[r9]
                    java.lang.String r10 = (java.lang.String) r10
                    java.lang.Object[] r11 = new java.lang.Object[r7]
                    r12 = 31
                    r14 = 935(0x3a7, float:1.31E-42)
                    a(r9, r12, r14, r11)
                    r11 = r11[r9]
                    java.lang.String r11 = (java.lang.String) r11
                    java.lang.Object[] r12 = new java.lang.Object[r7]
                    r14 = 26
                    r2 = 966(0x3c6, float:1.354E-42)
                    a(r9, r14, r2, r12)
                    r2 = r12[r9]
                    java.lang.String r2 = (java.lang.String) r2
                    java.lang.Object[] r12 = new java.lang.Object[r7]
                    r14 = 23
                    r13 = 992(0x3e0, float:1.39E-42)
                    a(r9, r14, r13, r12)
                    r12 = r12[r9]
                    java.lang.String r12 = (java.lang.String) r12
                    java.lang.Object[] r13 = new java.lang.Object[r7]
                    r7 = 482(0x1e2, float:6.75E-43)
                    r14 = 33
                    r15 = 1015(0x3f7, float:1.422E-42)
                    a(r7, r14, r15, r13)
                    r7 = r13[r9]
                    r13 = r7
                    java.lang.String r13 = (java.lang.String) r13
                    r7 = r8
                    r8 = r10
                    r9 = r11
                    r10 = r2
                    r11 = r12
                    r12 = r13
                    r2 = -1
                    r14 = 6
                    r13 = r39
                    java.lang.String[] r66 = new java.lang.String[]{r7, r8, r9, r10, r11, r12, r13}
                    r7 = 1
                    java.lang.Object[] r8 = new java.lang.Object[r7]
                    r9 = 36899(0x9023, float:5.1707E-41)
                    r10 = 1048(0x418, float:1.469E-42)
                    a(r9, r0, r10, r8)
                    r9 = 0
                    r8 = r8[r9]
                    java.lang.String r8 = (java.lang.String) r8
                    java.lang.Object[] r10 = new java.lang.Object[r7]
                    r11 = 13845(0x3615, float:1.9401E-41)
                    r12 = 7
                    r13 = 627(0x273, float:8.79E-43)
                    a(r11, r12, r13, r10)
                    r10 = r10[r9]
                    java.lang.String r10 = (java.lang.String) r10
                    java.lang.String[] r67 = new java.lang.String[]{r8, r10}
                    java.lang.Object[] r8 = new java.lang.Object[r7]
                    r10 = 30
                    r11 = 1061(0x425, float:1.487E-42)
                    a(r9, r10, r11, r8)
                    r8 = r8[r9]
                    java.lang.String r8 = (java.lang.String) r8
                    java.lang.Object[] r10 = new java.lang.Object[r7]
                    r11 = 11
                    r12 = 1091(0x443, float:1.529E-42)
                    a(r9, r11, r12, r10)
                    r10 = r10[r9]
                    java.lang.String r10 = (java.lang.String) r10
                    java.lang.String[] r68 = new java.lang.String[]{r8, r10}
                    java.lang.Object[] r8 = new java.lang.Object[r7]
                    r10 = 1102(0x44e, float:1.544E-42)
                    a(r9, r5, r10, r8)
                    r8 = r8[r9]
                    java.lang.String r8 = (java.lang.String) r8
                    java.lang.Object[] r10 = new java.lang.Object[r7]
                    r11 = 1463(0x5b7, float:2.05E-42)
                    r12 = 1121(0x461, float:1.571E-42)
                    r13 = 5
                    a(r11, r13, r12, r10)
                    r10 = r10[r9]
                    java.lang.String r10 = (java.lang.String) r10
                    java.lang.String[] r69 = new java.lang.String[]{r8, r10}
                    java.lang.Object[] r8 = new java.lang.Object[r7]
                    r10 = 1126(0x466, float:1.578E-42)
                    a(r9, r5, r10, r8)
                    r8 = r8[r9]
                    java.lang.String r8 = (java.lang.String) r8
                    java.lang.String[] r70 = new java.lang.String[]{r8}
                    java.lang.Object[] r8 = new java.lang.Object[r7]
                    r10 = 60079(0xeaaf, float:8.4189E-41)
                    r11 = 1145(0x479, float:1.604E-42)
                    r12 = 16
                    a(r10, r12, r11, r8)
                    r8 = r8[r9]
                    java.lang.String r8 = (java.lang.String) r8
                    java.lang.String[] r71 = new java.lang.String[]{r8}
                    java.lang.Object[] r8 = new java.lang.Object[r7]
                    r10 = 1161(0x489, float:1.627E-42)
                    a(r9, r5, r10, r8)
                    r8 = r8[r9]
                    java.lang.String r8 = (java.lang.String) r8
                    java.lang.String[] r72 = new java.lang.String[]{r8}
                    java.lang.Object[] r8 = new java.lang.Object[r7]
                    r10 = 1180(0x49c, float:1.654E-42)
                    a(r9, r5, r10, r8)
                    r8 = r8[r9]
                    java.lang.String r8 = (java.lang.String) r8
                    java.lang.String[] r73 = new java.lang.String[]{r8}
                    java.lang.Object[] r8 = new java.lang.Object[r7]
                    r10 = 23
                    r11 = 1199(0x4af, float:1.68E-42)
                    a(r9, r10, r11, r8)
                    r8 = r8[r9]
                    java.lang.String r8 = (java.lang.String) r8
                    java.lang.String[] r74 = new java.lang.String[]{r8}
                    java.lang.Object[] r8 = new java.lang.Object[r7]
                    r10 = 36206(0x8d6e, float:5.0735E-41)
                    r11 = 21
                    r12 = 1222(0x4c6, float:1.712E-42)
                    a(r10, r11, r12, r8)
                    r8 = r8[r9]
                    java.lang.String r8 = (java.lang.String) r8
                    java.lang.String[] r75 = new java.lang.String[]{r8}
                    java.lang.Object[] r8 = new java.lang.Object[r7]
                    r10 = 24
                    r11 = 1243(0x4db, float:1.742E-42)
                    a(r9, r10, r11, r8)
                    r8 = r8[r9]
                    java.lang.String r8 = (java.lang.String) r8
                    r10 = r39
                    java.lang.String[] r76 = new java.lang.String[]{r8, r10}
                    java.lang.Object[] r8 = new java.lang.Object[r7]
                    r11 = 63243(0xf70b, float:8.8622E-41)
                    r12 = 1267(0x4f3, float:1.775E-42)
                    r13 = 28
                    a(r11, r13, r12, r8)
                    r8 = r8[r9]
                    java.lang.String r8 = (java.lang.String) r8
                    java.lang.String[] r77 = new java.lang.String[]{r8, r10}
                    java.lang.Object[] r8 = new java.lang.Object[r7]
                    r11 = 1295(0x50f, float:1.815E-42)
                    r12 = 27
                    a(r9, r12, r11, r8)
                    r8 = r8[r9]
                    java.lang.String r8 = (java.lang.String) r8
                    java.lang.String[] r78 = new java.lang.String[]{r8, r10}
                    java.lang.Object[] r8 = new java.lang.Object[r7]
                    r11 = 12000(0x2ee0, float:1.6816E-41)
                    r12 = 31
                    r13 = 1322(0x52a, float:1.853E-42)
                    a(r11, r12, r13, r8)
                    r8 = r8[r9]
                    java.lang.String r8 = (java.lang.String) r8
                    java.lang.String[] r79 = new java.lang.String[]{r8, r10}
                    java.lang.Object[] r8 = new java.lang.Object[r7]
                    r11 = 1353(0x549, float:1.896E-42)
                    r12 = 27
                    a(r9, r12, r11, r8)
                    r8 = r8[r9]
                    java.lang.String r8 = (java.lang.String) r8
                    java.lang.String[] r80 = new java.lang.String[]{r8, r10}
                    java.lang.Object[] r8 = new java.lang.Object[r7]
                    r7 = 1380(0x564, float:1.934E-42)
                    a(r9, r3, r7, r8)
                    r7 = r8[r9]
                    java.lang.String r7 = (java.lang.String) r7
                    java.lang.String[] r81 = new java.lang.String[]{r7, r10}
                    java.lang.String[][] r7 = new java.lang.String[][]{r58, r59, r60, r61, r62, r63, r64, r65, r66, r67, r68, r69, r70, r71, r72, r73, r74, r75, r76, r77, r78, r79, r80, r81}
                    java.util.ArrayList r8 = new java.util.ArrayList
                    r8.<init>()
                    r12 = r1
                    r10 = r9
                    r11 = r10
                L1c1d:
                    r13 = 24
                    if (r10 >= r13) goto L1cec
                    r13 = r7[r10]
                    r15 = r13[r9]
                    java.lang.Object[] r9 = new java.lang.Object[]{r15}     // Catch: java.lang.Throwable -> L1b8
                    r15 = 1845277648(0x6dfcb3d0, float:9.7759503E27)
                    java.lang.Object r25 = o.YY.EZpvd(r15)     // Catch: java.lang.Throwable -> L1b8
                    if (r25 != 0) goto L1c5c
                    r48 = 531(0x213, float:7.44E-43)
                    r49 = 5
                    r50 = 0
                    r51 = 1776058028(0x69dc7eac, float:3.3320234E25)
                    r52 = 0
                    r15 = 1
                    byte r14 = (byte) r15     // Catch: java.lang.Throwable -> L1b8
                    int r5 = -r14
                    byte r5 = (byte) r5     // Catch: java.lang.Throwable -> L1b8
                    int r0 = r5 + 4
                    byte r0 = (byte) r0     // Catch: java.lang.Throwable -> L1b8
                    java.lang.Object[] r3 = new java.lang.Object[r15]     // Catch: java.lang.Throwable -> L1b8
                    b(r14, r5, r0, r3)     // Catch: java.lang.Throwable -> L1b8
                    r5 = 0
                    r0 = r3[r5]     // Catch: java.lang.Throwable -> L1b8
                    r53 = r0
                    java.lang.String r53 = (java.lang.String) r53     // Catch: java.lang.Throwable -> L1b8
                    java.lang.Class[] r0 = new java.lang.Class[r15]     // Catch: java.lang.Throwable -> L1b8
                    java.lang.Class<java.lang.String> r3 = java.lang.String.class
                    r0[r5] = r3     // Catch: java.lang.Throwable -> L1b8
                    r54 = r0
                    java.lang.Object r25 = o.YY.EZpvd(r48, r49, r50, r51, r52, r53, r54)     // Catch: java.lang.Throwable -> L1b8
                L1c5c:
                    r0 = r25
                    java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0     // Catch: java.lang.Throwable -> L1b8
                    java.lang.Object r0 = r0.invoke(r4, r9)     // Catch: java.lang.Throwable -> L1b8
                    java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> L1b8
                    int r3 = r13.length
                    r5 = 1
                    java.lang.Object[] r3 = java.util.Arrays.copyOfRange(r13, r5, r3)
                    java.lang.String[] r3 = (java.lang.String[]) r3
                    if (r0 == 0) goto L1cd4
                    int r9 = r0.length()
                    if (r9 == 0) goto L1cd4
                    int r9 = r13.length
                    if (r9 == r5) goto L1c94
                    int r5 = r3.length
                    r9 = 0
                L1c7b:
                    if (r9 >= r5) goto L1cd4
                    r13 = r3[r9]
                    boolean r13 = r0.contains(r13)
                    if (r13 == 0) goto L1c86
                    goto L1c94
                L1c86:
                    r13 = r9 | 83
                    r14 = 1
                    int r13 = r13 << r14
                    r9 = r9 ^ 83
                    int r13 = r13 - r9
                    r9 = r13 | (-82)
                    int r9 = r9 << r14
                    r13 = r13 ^ (-82)
                    int r9 = r9 - r13
                    goto L1c7b
                L1c94:
                    int r11 = r11 + 1
                    int r3 = r10 + 10
                    r5 = r1 & r3
                    int r5 = ~r5
                    r3 = r3 | r1
                    r12 = r5 & r3
                    java.lang.StringBuilder r3 = new java.lang.StringBuilder
                    r3.<init>()
                    r3.append(r0)
                    r5 = 1
                    java.lang.Object[] r9 = new java.lang.Object[r5]
                    r13 = 1412(0x584, float:1.979E-42)
                    r14 = 0
                    a(r14, r5, r13, r9)
                    r5 = r9[r14]
                    java.lang.String r5 = (java.lang.String) r5
                    r3.append(r5)
                    r3.append(r0)
                    java.lang.String r0 = r3.toString()
                    int r3 = o.C19057fuB.AEQbTJ
                    r5 = r3 & 79
                    r3 = r3 | 79
                    int r5 = r5 + r3
                    int r3 = r5 % 128
                    o.C19057fuB.EZpvd = r3
                    r3 = 2
                    int r5 = r5 % r3
                    r8.add(r0)
                    if (r5 == 0) goto L1cd0
                    goto L1cd4
                L1cd0:
                    r4.hashCode()
                    throw r4
                L1cd4:
                    r0 = r10 | 3
                    r3 = 1
                    int r0 = r0 << r3
                    r5 = r10 ^ 3
                    int r0 = r0 - r5
                    r5 = r0 ^ (-2)
                    r0 = r0 & (-2)
                    int r0 = r0 << r3
                    int r10 = r5 + r0
                    r0 = 13
                    r3 = 32
                    r5 = 19
                    r9 = 0
                    r14 = 6
                    goto L1c1d
                L1cec:
                    r3 = 2
                    if (r11 <= r3) goto L1d80
                    int r0 = o.C19057fuB.AEQbTJ
                    r5 = r0 | 63
                    r7 = 1
                    int r5 = r5 << r7
                    r0 = r0 ^ 63
                    int r5 = r5 - r0
                    int r0 = r5 % 128
                    o.C19057fuB.EZpvd = r0
                    int r5 = r5 % r3
                    r5 = 5
                    java.lang.Object[] r0 = new java.lang.Object[r5]
                    int[] r5 = new int[r7]
                    r9 = 0
                    r0[r9] = r5
                    int[] r5 = new int[r7]
                    r0[r3] = r5
                    int[] r3 = new int[r7]
                    r10 = 3
                    r0[r10] = r3
                    int[] r5 = (int[]) r5
                    r5[r9] = r1
                    int[] r3 = (int[]) r3
                    r3[r9] = r12
                    r0[r7] = r8
                    r0[r6] = r4
                    r3 = -927022641(0xffffffffc8bec1cf, float:-390670.47)
                    r3 = r3 | r37
                    int r3 = ~r3
                    r5 = 335612976(0x14010c30, float:6.515239E-27)
                    r3 = r3 | r5
                    int r3 = r3 * 446
                    r5 = -383486783(0xffffffffe92474c1, float:-1.2425949E25)
                    int r5 = r5 + r3
                    r3 = -591409665(0xffffffffdcbfcdff, float:-4.31905725E17)
                    r3 = r3 | r1
                    int r3 = ~r3
                    r7 = 12238923(0xbac04b, float:1.7150384E-38)
                    r3 = r3 | r7
                    int r3 = r3 * 446
                    int r5 = r5 + r3
                    r3 = -640468064(0xffffffffd9d33ba0, float:-7.4320973E15)
                    int r5 = r5 + r3
                    int r3 = o.C14220dhO.OLrzqt()
                    int r7 = r5 * 450
                    int r8 = ~r5
                    int r8 = ~r8
                    r9 = r2 ^ r5
                    r9 = r9 | r5
                    r10 = r9 ^ r3
                    r3 = r3 & r9
                    r3 = r3 | r10
                    int r3 = ~r3
                    r9 = r8 ^ r3
                    r3 = r3 & r8
                    r3 = r3 | r9
                    int r3 = r3 * 449
                    int r7 = r7 + r3
                    int r3 = ~r5
                    int r8 = ~r3
                    int r8 = r8 * (-1347)
                    int r7 = r7 + r8
                    int r3 = ~r3
                    r8 = r2 ^ r5
                    r5 = r5 | r8
                    int r5 = ~r5
                    r8 = r3 ^ r5
                    r3 = r3 & r5
                    r3 = r3 | r8
                    int r3 = r3 * 449
                    int r3 = -r3
                    int r3 = -r3
                    r5 = r7 ^ r3
                    r3 = r3 & r7
                    r7 = 1
                    int r3 = r3 << r7
                    int r5 = r5 + r3
                    int r3 = r5 << 13
                    r3 = r3 ^ r5
                    int r5 = r3 >>> 17
                    r3 = r3 ^ r5
                    int r5 = r3 << 5
                    r7 = r3 & r5
                    int r7 = ~r7
                    r3 = r3 | r5
                    r3 = r3 & r7
                    r5 = 0
                    r7 = r0[r5]
                    int[] r7 = (int[]) r7
                    r7[r5] = r3
                L1d7d:
                    r3 = 3
                    goto L1e1c
                L1d80:
                    r3 = 5
                    r5 = 0
                    java.lang.Object[] r0 = new java.lang.Object[r3]
                    r3 = 1
                    int[] r7 = new int[r3]
                    r0[r5] = r7
                    int[] r7 = new int[r3]
                    r8 = 2
                    r0[r8] = r7
                    int[] r8 = new int[r3]
                    r3 = 3
                    r0[r3] = r8
                    int[] r7 = (int[]) r7
                    r7[r5] = r1
                    int[] r8 = (int[]) r8
                    r8[r5] = r1
                    int r3 = o.C19057fuB.AEQbTJ
                    r5 = r3 | 81
                    r7 = 1
                    int r5 = r5 << r7
                    r3 = r3 ^ 81
                    int r5 = r5 - r3
                    int r3 = r5 % 128
                    o.C19057fuB.EZpvd = r3
                    r3 = 2
                    int r5 = r5 % r3
                    if (r5 != 0) goto L1de1
                    r3 = 0
                    r0[r3] = r4
                    r3 = 5
                    r0[r3] = r4
                    java.util.Random r3 = new java.util.Random
                    r3.<init>()
                    r5 = 140013120(0x8586e40, float:6.5129734E-34)
                    int r3 = r3.nextInt(r5)
                    r5 = -707821826(0xffffffffd5cf7efe, float:-2.85180418E13)
                    r5 = r5 | r3
                    int r5 = r5 * (-627)
                    r7 = 1757293436(0x68be2b7c, float:7.184414E24)
                    int r7 = r7 + r5
                    r5 = -298280159(0xffffffffee389b21, float:-1.4283195E28)
                    r5 = r5 | r3
                    int r5 = ~r5
                    r8 = 976594381(0x3a35a5cd, float:6.9293083E-4)
                    r5 = r5 | r8
                    int r5 = r5 * (-627)
                    int r7 = r7 + r5
                    int r5 = ~r3
                    r9 = 298280158(0x11c764de, float:3.1458828E-28)
                    r5 = r5 | r9
                    int r5 = ~r5
                    r3 = r3 | r8
                    int r3 = ~r3
                    r3 = r3 | r5
                    int r3 = r3 * 627
                    int r7 = r7 + r3
                    goto L1dfe
                L1de1:
                    r3 = 1
                    r0[r3] = r4
                    r0[r6] = r4
                    r3 = 482088002(0x1cbc1442, float:1.2446033E-21)
                    r3 = r37 | r3
                    int r3 = ~r3
                    r5 = 280756226(0x10bc0002, float:7.415294E-29)
                    r5 = r5 | r3
                    int r5 = r5 * (-374)
                    r7 = 914847767(0x36877817, float:4.037294E-6)
                    int r5 = r5 + r7
                    r7 = 201331776(0xc001440, float:9.866855E-32)
                    r3 = r3 | r7
                    int r3 = r3 * 374
                    int r7 = r5 + r3
                L1dfe:
                    int r3 = r7 << 13
                    r5 = r7 & r3
                    int r5 = ~r5
                    r3 = r3 | r7
                    r3 = r3 & r5
                    int r5 = r3 >>> 17
                    int r7 = ~r5
                    r7 = r7 & r3
                    int r3 = ~r3
                    r3 = r3 & r5
                    r3 = r3 | r7
                    int r5 = r3 << 5
                    r7 = r3 & r5
                    int r7 = ~r7
                    r3 = r3 | r5
                    r3 = r3 & r7
                    r5 = 0
                    r7 = r0[r5]
                    int[] r7 = (int[]) r7
                    r7[r5] = r3
                    goto L1d7d
                L1e1c:
                    r7 = r0[r3]
                    int[] r7 = (int[]) r7
                    r7 = r7[r5]
                    if (r7 == r1) goto L1eea
                    r8 = 5
                    java.lang.Object[] r2 = new java.lang.Object[r8]
                    r8 = 1
                    int[] r9 = new int[r8]
                    r2[r5] = r9
                    int[] r9 = new int[r8]
                    r10 = 2
                    r2[r10] = r9
                    int[] r10 = new int[r8]
                    r2[r3] = r10
                    r0 = r0[r8]
                    java.util.List r0 = (java.util.List) r0
                    int[] r9 = (int[]) r9
                    r9[r5] = r1
                    int[] r10 = (int[]) r10
                    r10[r5] = r7
                    r2[r8] = r0
                    r2[r6] = r4
                    java.lang.Runtime r0 = java.lang.Runtime.getRuntime()
                    long r0 = r0.maxMemory()
                    int r0 = (int) r0
                    int r1 = ~r0
                    r3 = -991506605(0xffffffffc4e6cf53, float:-1846.4789)
                    r3 = r3 | r1
                    int r3 = ~r3
                    r4 = 268505260(0x100110ac, float:2.5453608E-29)
                    r3 = r3 | r4
                    int r3 = r3 * 168
                    r4 = 1844316787(0x6dee0a73, float:9.208758E27)
                    int r4 = r4 + r3
                    r3 = -268505261(0xffffffffeffeef53, float:-1.5779704E29)
                    r3 = r3 | r0
                    int r3 = ~r3
                    int r3 = r3 * 168
                    int r4 = r4 + r3
                    r3 = -283367936(0xffffffffef1c2600, float:-4.83256E28)
                    r1 = r1 | r3
                    int r1 = ~r1
                    r3 = 14862675(0xe2c953, float:2.0827044E-38)
                    r1 = r1 | r3
                    r3 = -723001345(0xffffffffd4e7dfff, float:-7.9671638E12)
                    r0 = r0 | r3
                    int r0 = ~r0
                    r0 = r0 | r1
                    int r0 = r0 * 168
                    int r4 = r4 + r0
                    int r0 = o.C14220dhO.OLrzqt()
                    int r1 = r4 * (-903)
                    r3 = 14480(0x3890, float:2.0291E-41)
                    int r3 = r3 + r1
                    r1 = -17
                    r5 = r1 ^ r0
                    r6 = r1 & r0
                    r1 = r5 | r6
                    int r1 = ~r1
                    int r5 = ~r0
                    r6 = r5 | r4
                    int r6 = ~r6
                    r7 = r1 ^ r6
                    r1 = r1 & r6
                    r1 = r1 | r7
                    int r1 = r1 * (-1808)
                    int r3 = r3 + r1
                    int r1 = ~r4
                    r6 = -17
                    r7 = r6 ^ r1
                    r1 = r1 & r6
                    r1 = r1 | r7
                    r6 = r1 ^ r0
                    r1 = r1 & r0
                    r1 = r1 | r6
                    int r1 = ~r1
                    r6 = r5 ^ 16
                    r7 = 16
                    r5 = r5 & r7
                    r5 = r5 | r6
                    r6 = r5 | r4
                    int r6 = ~r6
                    r1 = r1 | r6
                    int r1 = r1 * 904
                    int r3 = r3 + r1
                    r1 = -17
                    r6 = r1 ^ r4
                    r1 = r1 & r4
                    r1 = r1 | r6
                    int r1 = ~r1
                    int r4 = ~r4
                    r6 = r4 ^ r0
                    r0 = r0 & r4
                    r0 = r0 | r6
                    int r0 = ~r0
                    r4 = r1 ^ r0
                    r0 = r0 & r1
                    r0 = r0 | r4
                    int r1 = ~r5
                    r0 = r0 | r1
                    int r0 = r0 * 904
                    int r0 = -r0
                    int r0 = -r0
                    int r0 = ~r0
                    int r3 = r3 - r0
                    r1 = 1
                    int r3 = r3 - r1
                    r5 = r85
                    r0 = r5 & r3
                    r1 = r5 | r3
                    int r0 = r0 + r1
                    int r1 = r0 << 13
                    r3 = r0 & r1
                    int r3 = ~r3
                    r0 = r0 | r1
                    r0 = r0 & r3
                    int r1 = r0 >>> 17
                    r0 = r0 ^ r1
                    int r1 = r0 << 5
                    r3 = r0 & r1
                    int r3 = ~r3
                    r0 = r0 | r1
                    r0 = r0 & r3
                    r3 = 0
                    r1 = r2[r3]
                    int[] r1 = (int[]) r1
                    r1[r3] = r0
                    goto L92b
                L1eea:
                    r3 = r5
                    r5 = r85
                    r7 = 1
                L1eee:
                    java.lang.Object[] r0 = new java.lang.Object[r7]
                    r7 = 698(0x2ba, float:9.78E-43)
                    r8 = 16
                    a(r3, r8, r7, r0)
                    r0 = r0[r3]
                    java.lang.String r0 = (java.lang.String) r0
                    java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch: java.lang.Throwable -> L1b8
                    r3 = 1845277648(0x6dfcb3d0, float:9.7759503E27)
                    java.lang.Object r3 = o.YY.EZpvd(r3)     // Catch: java.lang.Throwable -> L1b8
                    if (r3 != 0) goto L1f2d
                    r7 = 531(0x213, float:7.44E-43)
                    r8 = 5
                    r9 = 0
                    r10 = 1776058028(0x69dc7eac, float:3.3320234E25)
                    r11 = 0
                    r3 = 1
                    byte r12 = (byte) r3     // Catch: java.lang.Throwable -> L1b8
                    int r13 = -r12
                    byte r13 = (byte) r13     // Catch: java.lang.Throwable -> L1b8
                    int r14 = r13 + 4
                    byte r14 = (byte) r14     // Catch: java.lang.Throwable -> L1b8
                    java.lang.Object[] r15 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L1b8
                    b(r12, r13, r14, r15)     // Catch: java.lang.Throwable -> L1b8
                    r12 = 0
                    r13 = r15[r12]     // Catch: java.lang.Throwable -> L1b8
                    java.lang.String r13 = (java.lang.String) r13     // Catch: java.lang.Throwable -> L1b8
                    java.lang.Class[] r14 = new java.lang.Class[r3]     // Catch: java.lang.Throwable -> L1b8
                    java.lang.Class<java.lang.String> r3 = java.lang.String.class
                    r14[r12] = r3     // Catch: java.lang.Throwable -> L1b8
                    r12 = r13
                    r13 = r14
                    java.lang.Object r3 = o.YY.EZpvd(r7, r8, r9, r10, r11, r12, r13)     // Catch: java.lang.Throwable -> L1b8
                L1f2d:
                    java.lang.reflect.Method r3 = (java.lang.reflect.Method) r3     // Catch: java.lang.Throwable -> L1b8
                    java.lang.Object r0 = r3.invoke(r4, r0)     // Catch: java.lang.Throwable -> L1b8
                    if (r0 != 0) goto L1f38
                    r0 = 0
                    goto L2023
                L1f38:
                    r3 = 2
                    java.lang.Object[] r7 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L1b8
                    r3 = 42
                    java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> L1b8
                    r8 = 1
                    r7[r8] = r3     // Catch: java.lang.Throwable -> L1b8
                    r3 = 0
                    r7[r3] = r0     // Catch: java.lang.Throwable -> L1b8
                    r0 = 1485637403(0x588d071b, float:1.24049326E15)
                    java.lang.Object r0 = o.YY.EZpvd(r0)     // Catch: java.lang.Throwable -> L1b8
                    if (r0 != 0) goto L1f7a
                    r8 = 398(0x18e, float:5.58E-43)
                    r9 = 5
                    r10 = 0
                    r11 = 1554893415(0x5cadca67, float:3.91341718E17)
                    r12 = 0
                    byte r0 = (byte) r3     // Catch: java.lang.Throwable -> L1b8
                    int r13 = r0 + 1
                    byte r13 = (byte) r13     // Catch: java.lang.Throwable -> L1b8
                    int r14 = r13 + (-1)
                    byte r14 = (byte) r14     // Catch: java.lang.Throwable -> L1b8
                    r15 = 1
                    java.lang.Object[] r2 = new java.lang.Object[r15]     // Catch: java.lang.Throwable -> L1b8
                    b(r0, r13, r14, r2)     // Catch: java.lang.Throwable -> L1b8
                    r0 = r2[r3]     // Catch: java.lang.Throwable -> L1b8
                    r13 = r0
                    java.lang.String r13 = (java.lang.String) r13     // Catch: java.lang.Throwable -> L1b8
                    r2 = 2
                    java.lang.Class[] r14 = new java.lang.Class[r2]     // Catch: java.lang.Throwable -> L1b8
                    java.lang.Class<java.lang.String> r0 = java.lang.String.class
                    r14[r3] = r0     // Catch: java.lang.Throwable -> L1b8
                    java.lang.Class r0 = java.lang.Integer.TYPE     // Catch: java.lang.Throwable -> L1b8
                    r2 = 1
                    r14[r2] = r0     // Catch: java.lang.Throwable -> L1b8
                    java.lang.Object r0 = o.YY.EZpvd(r8, r9, r10, r11, r12, r13, r14)     // Catch: java.lang.Throwable -> L1b8
                L1f7a:
                    java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0     // Catch: java.lang.Throwable -> L1b8
                    java.lang.Object r0 = r0.invoke(r4, r7)     // Catch: java.lang.Throwable -> L1b8
                    java.lang.Long r0 = (java.lang.Long) r0     // Catch: java.lang.Throwable -> L1b8
                    long r2 = r0.longValue()     // Catch: java.lang.Throwable -> L1b8
                    r0 = -588088930(0xffffffffdcf2799e, float:-5.46005311E17)
                    long r7 = (long) r0
                    r0 = -665(0xfffffffffffffd67, float:NaN)
                    long r9 = (long) r0
                    long r9 = r9 * r7
                    r0 = 334(0x14e, float:4.68E-43)
                    long r11 = (long) r0
                    long r11 = r11 * r2
                    long r9 = r9 + r11
                    r0 = -333(0xfffffffffffffeb3, float:NaN)
                    long r11 = (long) r0
                    long r7 = r7 ^ r46
                    long r11 = r11 * r7
                    long r9 = r9 + r11
                    r0 = 333(0x14d, float:4.67E-43)
                    long r11 = (long) r0
                    long r13 = r7 | r56
                    long r13 = r13 ^ r46
                    long r38 = r2 | r42
                    long r38 = r38 ^ r46
                    long r13 = r13 | r38
                    long r13 = r13 * r11
                    long r9 = r9 + r13
                    long r7 = r7 | r42
                    long r7 = r7 ^ r46
                    long r2 = r56 | r2
                    long r2 = r2 ^ r46
                    long r2 = r2 | r7
                    long r11 = r11 * r2
                    long r9 = r9 + r11
                    r0 = 1916042460(0x72347cdc, float:3.5749278E30)
                    long r2 = (long) r0
                    long r9 = r9 + r2
                    r2 = 32
                    long r7 = r9 >> r2
                    int r0 = (int) r7
                    java.lang.Runtime r2 = java.lang.Runtime.getRuntime()
                    long r2 = r2.totalMemory()
                    int r2 = (int) r2
                    int r3 = ~r2
                    r7 = 1274096472(0x4bf12b58, float:3.1610544E7)
                    r7 = r7 | r3
                    int r7 = ~r7
                    r8 = 1583644412(0x5e647efc, float:4.11621859E18)
                    r8 = r8 | r2
                    int r8 = ~r8
                    r7 = r7 | r8
                    int r7 = r7 * 210
                    r8 = 1485640364(0x588d12ac, float:1.24089068E15)
                    int r8 = r8 + r7
                    r7 = -26280193(0xfffffffffe6efeff, float:-7.942007E37)
                    r3 = r3 | r7
                    int r3 = ~r3
                    r7 = -335828133(0xffffffffebfbab5b, float:-6.0849917E26)
                    r2 = r2 | r7
                    int r2 = ~r2
                    r2 = r2 | r3
                    int r2 = r2 * 210
                    int r8 = r8 + r2
                    r0 = r0 & r8
                    int r2 = (int) r9
                    java.lang.Runtime r3 = java.lang.Runtime.getRuntime()
                    long r7 = r3.freeMemory()
                    int r3 = (int) r7
                    int r7 = ~r3
                    r8 = -43373185(0xfffffffffd6a2d7f, float:-1.9454724E37)
                    r8 = r8 | r7
                    int r8 = ~r8
                    r9 = 1480599594(0x5840282a, float:8.4511494E14)
                    r8 = r8 | r9
                    r9 = 580900544(0x229fd6c0, float:4.332441E-18)
                    r3 = r3 | r9
                    int r3 = ~r3
                    r3 = r3 | r8
                    int r3 = r3 * (-68)
                    r8 = -2077437207(0xffffffff842cd2e9, float:-2.0315348E-36)
                    int r8 = r8 + r3
                    r3 = 2061500138(0x7adffeea, float:5.8152624E35)
                    r3 = r3 | r7
                    int r3 = ~r3
                    int r3 = r3 * (-68)
                    int r8 = r8 + r3
                    r3 = -580900545(0xffffffffdd60293f, float:-1.00953193E18)
                    r3 = r3 | r7
                    int r3 = ~r3
                    r7 = 2018126954(0x784a2c6a, float:1.6402262E34)
                    r3 = r3 | r7
                    int r3 = r3 * 68
                    int r8 = r8 + r3
                    r2 = r2 & r8
                    r3 = r0 ^ r2
                    r0 = r0 & r2
                    r0 = r0 | r3
                    long r2 = (long) r0
                    int r0 = (int) r2
                L2023:
                    r2 = 1986687685(0x766a72c5, float:1.1887942E33)
                    if (r0 == r2) goto L2463
                    r2 = -1514516938(0xffffffffa5ba4e36, float:-3.2318854E-16)
                    if (r0 != r2) goto L202f
                    goto L2463
                L202f:
                    r2 = 1
                    java.lang.Object[] r0 = new java.lang.Object[r2]
                    r3 = 1413(0x585, float:1.98E-42)
                    r7 = 14
                    r8 = 0
                    a(r8, r7, r3, r0)
                    r0 = r0[r8]
                    r58 = r0
                    java.lang.String r58 = (java.lang.String) r58
                    java.lang.Object[] r0 = new java.lang.Object[r2]
                    r3 = 26
                    r7 = 1427(0x593, float:2.0E-42)
                    a(r8, r3, r7, r0)
                    r0 = r0[r8]
                    r59 = r0
                    java.lang.String r59 = (java.lang.String) r59
                    java.lang.Object[] r0 = new java.lang.Object[r2]
                    r3 = 11842(0x2e42, float:1.6594E-41)
                    r7 = 1453(0x5ad, float:2.036E-42)
                    r9 = 17
                    a(r3, r9, r7, r0)
                    r0 = r0[r8]
                    r60 = r0
                    java.lang.String r60 = (java.lang.String) r60
                    java.lang.Object[] r0 = new java.lang.Object[r2]
                    r3 = 10602(0x296a, float:1.4857E-41)
                    r7 = 1470(0x5be, float:2.06E-42)
                    a(r3, r9, r7, r0)
                    r0 = r0[r8]
                    r61 = r0
                    java.lang.String r61 = (java.lang.String) r61
                    java.lang.Object[] r0 = new java.lang.Object[r2]
                    r3 = 15
                    r7 = 1487(0x5cf, float:2.084E-42)
                    a(r8, r3, r7, r0)
                    r0 = r0[r8]
                    r62 = r0
                    java.lang.String r62 = (java.lang.String) r62
                    java.lang.Object[] r0 = new java.lang.Object[r2]
                    r3 = 37
                    r7 = 1502(0x5de, float:2.105E-42)
                    a(r8, r3, r7, r0)
                    r0 = r0[r8]
                    r63 = r0
                    java.lang.String r63 = (java.lang.String) r63
                    java.lang.Object[] r0 = new java.lang.Object[r2]
                    r3 = 2122(0x84a, float:2.974E-42)
                    r7 = 1539(0x603, float:2.157E-42)
                    r9 = 12
                    a(r3, r9, r7, r0)
                    r0 = r0[r8]
                    r64 = r0
                    java.lang.String r64 = (java.lang.String) r64
                    java.lang.Object[] r0 = new java.lang.Object[r2]
                    r3 = 1551(0x60f, float:2.173E-42)
                    r7 = 13
                    a(r8, r7, r3, r0)
                    r0 = r0[r8]
                    r65 = r0
                    java.lang.String r65 = (java.lang.String) r65
                    java.lang.Object[] r0 = new java.lang.Object[r2]
                    r3 = 22
                    r7 = 1564(0x61c, float:2.192E-42)
                    a(r8, r3, r7, r0)
                    r0 = r0[r8]
                    r66 = r0
                    java.lang.String r66 = (java.lang.String) r66
                    java.lang.Object[] r0 = new java.lang.Object[r2]
                    r3 = 56323(0xdc03, float:7.8925E-41)
                    r7 = 31
                    r9 = 1586(0x632, float:2.222E-42)
                    a(r3, r7, r9, r0)
                    r0 = r0[r8]
                    r67 = r0
                    java.lang.String r67 = (java.lang.String) r67
                    java.lang.Object[] r0 = new java.lang.Object[r2]
                    r3 = 37471(0x925f, float:5.2508E-41)
                    r7 = 1617(0x651, float:2.266E-42)
                    r9 = 12
                    a(r3, r9, r7, r0)
                    r0 = r0[r8]
                    r68 = r0
                    java.lang.String r68 = (java.lang.String) r68
                    java.lang.Object[] r0 = new java.lang.Object[r2]
                    r3 = 6147(0x1803, float:8.614E-42)
                    r7 = 1629(0x65d, float:2.283E-42)
                    a(r3, r9, r7, r0)
                    r0 = r0[r8]
                    r69 = r0
                    java.lang.String r69 = (java.lang.String) r69
                    java.lang.Object[] r0 = new java.lang.Object[r2]
                    r3 = 1641(0x669, float:2.3E-42)
                    a(r8, r9, r3, r0)
                    r0 = r0[r8]
                    r70 = r0
                    java.lang.String r70 = (java.lang.String) r70
                    java.lang.Object[] r0 = new java.lang.Object[r2]
                    r3 = 1653(0x675, float:2.316E-42)
                    a(r8, r9, r3, r0)
                    r0 = r0[r8]
                    r71 = r0
                    java.lang.String r71 = (java.lang.String) r71
                    java.lang.Object[] r0 = new java.lang.Object[r2]
                    r3 = 18727(0x4927, float:2.6242E-41)
                    r7 = 1665(0x681, float:2.333E-42)
                    a(r3, r9, r7, r0)
                    r0 = r0[r8]
                    r72 = r0
                    java.lang.String r72 = (java.lang.String) r72
                    java.lang.Object[] r0 = new java.lang.Object[r2]
                    r3 = 64240(0xfaf0, float:9.002E-41)
                    r7 = 1677(0x68d, float:2.35E-42)
                    r9 = 14
                    a(r3, r9, r7, r0)
                    r0 = r0[r8]
                    r73 = r0
                    java.lang.String r73 = (java.lang.String) r73
                    java.lang.Object[] r0 = new java.lang.Object[r2]
                    r3 = 1691(0x69b, float:2.37E-42)
                    r7 = 12
                    a(r8, r7, r3, r0)
                    r0 = r0[r8]
                    r74 = r0
                    java.lang.String r74 = (java.lang.String) r74
                    java.lang.Object[] r0 = new java.lang.Object[r2]
                    r3 = 24
                    r7 = 1703(0x6a7, float:2.386E-42)
                    a(r8, r3, r7, r0)
                    r0 = r0[r8]
                    r75 = r0
                    java.lang.String r75 = (java.lang.String) r75
                    java.lang.Object[] r0 = new java.lang.Object[r2]
                    r2 = 1727(0x6bf, float:2.42E-42)
                    r3 = 28
                    a(r8, r3, r2, r0)
                    r0 = r0[r8]
                    r76 = r0
                    java.lang.String r76 = (java.lang.String) r76
                    java.lang.String[] r0 = new java.lang.String[]{r58, r59, r60, r61, r62, r63, r64, r65, r66, r67, r68, r69, r70, r71, r72, r73, r74, r75, r76}
                    r2 = 19
                    r13 = 0
                L215e:
                    if (r13 >= r2) goto L233c
                    r2 = r0[r13]
                    java.lang.Object[] r3 = new java.lang.Object[]{r2}     // Catch: java.lang.Throwable -> L1b8
                    r7 = -924280847(0xffffffffc8e897f1, float:-476351.53)
                    java.lang.Object r7 = o.YY.EZpvd(r7)     // Catch: java.lang.Throwable -> L1b8
                    if (r7 != 0) goto L219b
                    r48 = 511(0x1ff, float:7.16E-43)
                    r49 = 5
                    r50 = 43308(0xa92c, float:6.0687E-41)
                    r51 = -859284851(0xffffffffccc85a8d, float:-1.05043048E8)
                    r52 = 0
                    r7 = 1
                    byte r8 = (byte) r7     // Catch: java.lang.Throwable -> L1b8
                    int r9 = r8 + 3
                    byte r9 = (byte) r9     // Catch: java.lang.Throwable -> L1b8
                    r10 = 49
                    byte r10 = (byte) r10     // Catch: java.lang.Throwable -> L1b8
                    java.lang.Object[] r11 = new java.lang.Object[r7]     // Catch: java.lang.Throwable -> L1b8
                    b(r8, r9, r10, r11)     // Catch: java.lang.Throwable -> L1b8
                    r8 = 0
                    r9 = r11[r8]     // Catch: java.lang.Throwable -> L1b8
                    r53 = r9
                    java.lang.String r53 = (java.lang.String) r53     // Catch: java.lang.Throwable -> L1b8
                    java.lang.Class[] r9 = new java.lang.Class[r7]     // Catch: java.lang.Throwable -> L1b8
                    java.lang.Class<java.lang.String> r7 = java.lang.String.class
                    r9[r8] = r7     // Catch: java.lang.Throwable -> L1b8
                    r54 = r9
                    java.lang.Object r7 = o.YY.EZpvd(r48, r49, r50, r51, r52, r53, r54)     // Catch: java.lang.Throwable -> L1b8
                L219b:
                    java.lang.reflect.Method r7 = (java.lang.reflect.Method) r7     // Catch: java.lang.Throwable -> L1b8
                    java.lang.Object r3 = r7.invoke(r4, r3)     // Catch: java.lang.Throwable -> L1b8
                    java.lang.Long r3 = (java.lang.Long) r3     // Catch: java.lang.Throwable -> L1b8
                    long r7 = r3.longValue()     // Catch: java.lang.Throwable -> L1b8
                    r3 = 999554428(0x3b93fd7c, float:0.0045163017)
                    long r9 = (long) r3
                    r3 = -964(0xfffffffffffffc3c, float:NaN)
                    long r11 = (long) r3
                    r3 = -963(0xfffffffffffffc3d, float:NaN)
                    long r4 = (long) r3
                    long r4 = r4 * r9
                    long r4 = r4 + r11
                    r3 = 965(0x3c5, float:1.352E-42)
                    long r14 = (long) r3
                    long r14 = r14 * r7
                    long r4 = r4 + r14
                    long r14 = r9 ^ r46
                    long r7 = r7 ^ r46
                    long r38 = r7 | r42
                    long r38 = r38 ^ r46
                    long r14 = r14 | r38
                    long r14 = r14 * r11
                    long r4 = r4 + r14
                    long r14 = r7 | r56
                    long r14 = r14 ^ r46
                    long r7 = r7 | r9
                    long r7 = r7 ^ r46
                    long r7 = r7 | r14
                    long r11 = r11 * r7
                    long r4 = r4 + r11
                    r3 = -1310722522(0xffffffffb1dff626, float:-6.518138E-9)
                    long r7 = (long) r3
                    long r4 = r4 + r7
                    r3 = 32
                    long r7 = r4 >> r3
                    int r3 = (int) r7
                    long r7 = android.os.Process.getElapsedCpuTime()
                    int r7 = (int) r7
                    r8 = 160531746(0x9918522, float:3.5032678E-33)
                    r8 = r8 | r7
                    int r8 = r8 * 614
                    r9 = -431695562(0xffffffffe644d936, float:-2.3239767E23)
                    int r9 = r9 + r8
                    int r7 = ~r7
                    r8 = -664628327(0xffffffffd8629399, float:-9.9649422E14)
                    r8 = r8 | r7
                    int r8 = ~r8
                    r10 = 26280994(0x1910422, float:5.327052E-38)
                    r8 = r8 | r10
                    r10 = 772598084(0x2e0ce944, float:3.2039496E-11)
                    r10 = r10 | r7
                    int r10 = ~r10
                    r8 = r8 | r10
                    int r8 = r8 * (-1228)
                    int r9 = r9 + r8
                    r8 = -638347333(0xffffffffd9f397bb, float:-8.5706561E15)
                    r8 = r8 | r7
                    int r8 = ~r8
                    r10 = 798879078(0x2f9ded66, float:2.8726815E-10)
                    r7 = r7 | r10
                    int r7 = ~r7
                    r7 = r7 | r8
                    int r7 = r7 * 614
                    int r9 = r9 + r7
                    r3 = r3 & r9
                    int r4 = (int) r4
                    r5 = -1244035102(0xffffffffb5d987e2, float:-1.6207307E-6)
                    r5 = r5 | r1
                    int r5 = ~r5
                    r7 = 1781496381(0x6a2f7a3d, float:5.303482E25)
                    r7 = r37 | r7
                    int r7 = ~r7
                    r5 = r5 | r7
                    int r5 = r5 * (-406)
                    r7 = -1199668349(0xffffffffb87e8383, float:-6.06808E-5)
                    int r7 = r7 + r5
                    r5 = -167790598(0xfffffffff5ffb7fa, float:-6.4832382E32)
                    r5 = r37 | r5
                    int r5 = ~r5
                    int r5 = r5 * (-406)
                    int r7 = r7 + r5
                    r5 = -1613705785(0xffffffff9fd0cdc7, float:-8.8431857E-20)
                    r5 = r5 | r1
                    int r5 = ~r5
                    r8 = 1244035101(0x4a26781d, float:2727431.2)
                    r8 = r37 | r8
                    int r8 = ~r8
                    r5 = r5 | r8
                    int r5 = r5 * 406
                    int r7 = r7 + r5
                    r4 = r4 & r7
                    r3 = r3 | r4
                    long r3 = (long) r3
                    int r3 = (int) r3
                    if (r3 == 0) goto L223c
                    goto L233d
                L223c:
                    r3 = 1
                    java.lang.Object[] r4 = new java.lang.Object[r3]
                    r3 = 64240(0xfaf0, float:9.002E-41)
                    r5 = 1677(0x68d, float:2.35E-42)
                    r7 = 14
                    a(r3, r7, r5, r4)
                    r3 = 0
                    r4 = r4[r3]
                    java.lang.String r4 = (java.lang.String) r4
                    boolean r3 = r2.equals(r4)
                    if (r3 == 0) goto L2332
                    java.lang.Object[] r2 = new java.lang.Object[]{r2}     // Catch: java.lang.Throwable -> L1b8
                    r3 = 1704729038(0x659c19ce, float:9.214565E22)
                    java.lang.Object r3 = o.YY.EZpvd(r3)     // Catch: java.lang.Throwable -> L1b8
                    if (r3 != 0) goto L228c
                    r48 = 511(0x1ff, float:7.16E-43)
                    r49 = 5
                    r50 = 43308(0xa92c, float:6.0687E-41)
                    r51 = 1639765170(0x61bcd4b2, float:4.3541427E20)
                    r52 = 0
                    r3 = 1
                    byte r4 = (byte) r3     // Catch: java.lang.Throwable -> L1b8
                    int r5 = -r4
                    byte r5 = (byte) r5     // Catch: java.lang.Throwable -> L1b8
                    int r7 = r5 + 4
                    byte r7 = (byte) r7     // Catch: java.lang.Throwable -> L1b8
                    java.lang.Object[] r8 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L1b8
                    b(r4, r5, r7, r8)     // Catch: java.lang.Throwable -> L1b8
                    r4 = 0
                    r5 = r8[r4]     // Catch: java.lang.Throwable -> L1b8
                    r53 = r5
                    java.lang.String r53 = (java.lang.String) r53     // Catch: java.lang.Throwable -> L1b8
                    java.lang.Class[] r5 = new java.lang.Class[r3]     // Catch: java.lang.Throwable -> L1b8
                    java.lang.Class<java.lang.String> r3 = java.lang.String.class
                    r5[r4] = r3     // Catch: java.lang.Throwable -> L1b8
                    r54 = r5
                    java.lang.Object r3 = o.YY.EZpvd(r48, r49, r50, r51, r52, r53, r54)     // Catch: java.lang.Throwable -> L1b8
                L228c:
                    java.lang.reflect.Method r3 = (java.lang.reflect.Method) r3     // Catch: java.lang.Throwable -> L1b8
                    r4 = 0
                    java.lang.Object r2 = r3.invoke(r4, r2)     // Catch: java.lang.Throwable -> L1b8
                    java.lang.Long r2 = (java.lang.Long) r2     // Catch: java.lang.Throwable -> L1b8
                    long r2 = r2.longValue()     // Catch: java.lang.Throwable -> L1b8
                    r4 = -48897679(0xfffffffffd15e171, float:-1.2451596E37)
                    long r4 = (long) r4
                    int r7 = android.os.Process.myTid()
                    long r8 = r30 * r4
                    long r10 = r34 * r2
                    long r8 = r8 + r10
                    long r10 = r4 ^ r46
                    long r10 = r10 | r2
                    long r10 = r10 ^ r46
                    long r6 = (long) r7
                    long r19 = r2 | r6
                    long r19 = r19 ^ r46
                    long r19 = r10 | r19
                    long r19 = r19 * r40
                    long r8 = r8 + r19
                    long r19 = r4 | r2
                    long r19 = r19 | r6
                    long r19 = r19 ^ r46
                    long r19 = r19 * r44
                    long r8 = r8 + r19
                    long r2 = r2 ^ r46
                    long r2 = r2 | r4
                    long r2 = r2 ^ r46
                    long r2 = r2 | r10
                    long r4 = r4 | r6
                    long r4 = r4 ^ r46
                    long r2 = r2 | r4
                    long r6 = r44 * r2
                    long r8 = r8 + r6
                    r2 = -116699048(0xfffffffff90b5058, float:-4.5209927E34)
                    long r2 = (long) r2
                    long r8 = r8 + r2
                    int r2 = o.C19057fuB.AEQbTJ
                    r3 = r2 | 99
                    r4 = 1
                    int r3 = r3 << r4
                    r2 = r2 ^ 99
                    int r3 = r3 - r2
                    int r2 = r3 % 128
                    o.C19057fuB.EZpvd = r2
                    r2 = 2
                    int r3 = r3 % r2
                    r2 = 32
                    long r3 = r8 >> r2
                    int r2 = (int) r3
                    r3 = -714525270(0xffffffffd56935aa, float:-1.60260434E13)
                    r4 = r3 | r1
                    int r4 = ~r4
                    r5 = -2143215616(0xffffffff80412000, float:-5.980787E-39)
                    r4 = r4 | r5
                    int r4 = r4 * (-756)
                    r5 = -615883870(0xffffffffdb4a5ba2, float:-5.6958697E16)
                    int r5 = r5 + r4
                    r3 = r3 | r37
                    int r3 = r3 * 756
                    int r5 = r5 + r3
                    r2 = r2 & r5
                    int r3 = (int) r8
                    r4 = 1705965373(0x65aef73d, float:1.0328156E23)
                    r4 = r4 | r37
                    int r4 = r4 * (-369)
                    r5 = 802172634(0x2fd02eda, float:3.786827E-10)
                    int r5 = r5 + r4
                    r4 = -1169078078(0xffffffffba5148c2, float:-7.983559E-4)
                    r4 = r4 | r37
                    int r4 = ~r4
                    r6 = 1688662808(0x64a6f318, float:2.463741E22)
                    r4 = r4 | r6
                    int r4 = r4 * (-369)
                    int r5 = r5 + r4
                    r4 = 1169078077(0x45aeb73d, float:5590.905)
                    r4 = r4 | r1
                    int r4 = ~r4
                    r6 = 536887296(0x20004000, float:1.0863198E-19)
                    r4 = r4 | r6
                    r6 = -17302566(0xfffffffffef7fbda, float:-1.648135E38)
                    r6 = r37 | r6
                    int r6 = ~r6
                    r4 = r4 | r6
                    int r4 = r4 * 369
                    int r5 = r5 + r4
                    r3 = r3 & r5
                    r4 = r2 ^ r3
                    r2 = r2 & r3
                    r2 = r2 | r4
                    long r2 = (long) r2
                    int r2 = (int) r2
                    if (r2 == 0) goto L2332
                    goto L233d
                L2332:
                    int r13 = r13 + 1
                    r5 = r85
                    r2 = 19
                    r4 = 0
                    r6 = 4
                    goto L215e
                L233c:
                    r13 = -1
                L233d:
                    if (r13 < 0) goto L245f
                    int r0 = o.C14220dhO.OLrzqt()
                    int r2 = r13 * 971
                    int r2 = -r2
                    int r2 = -r2
                    r3 = -252070(0xfffffffffffc275a, float:NaN)
                    r4 = r3 ^ r2
                    r2 = r2 & r3
                    r3 = 1
                    int r2 = r2 << r3
                    int r4 = r4 + r2
                    int r2 = ~r13
                    r3 = r2 | 130(0x82, float:1.82E-43)
                    int r3 = ~r3
                    int r0 = ~r0
                    r5 = r0 | r13
                    int r5 = ~r5
                    r6 = r3 ^ r5
                    r3 = r3 & r5
                    r3 = r3 | r6
                    int r3 = r3 * (-970)
                    r5 = r4 | r3
                    r6 = 1
                    int r5 = r5 << r6
                    r3 = r3 ^ r4
                    int r5 = r5 - r3
                    r3 = -131(0xffffffffffffff7d, float:NaN)
                    r4 = r3 ^ r13
                    r3 = r3 & r13
                    r3 = r3 | r4
                    int r3 = ~r3
                    int r3 = r3 * 1940
                    int r3 = -r3
                    int r3 = -r3
                    r4 = r5 & r3
                    r3 = r3 | r5
                    int r4 = r4 + r3
                    r3 = -131(0xffffffffffffff7d, float:NaN)
                    r5 = r3 ^ r2
                    r2 = r2 & r3
                    r2 = r2 | r5
                    int r2 = ~r2
                    r3 = r0 ^ r13
                    r0 = r0 & r13
                    r0 = r0 | r3
                    int r0 = ~r0
                    r3 = r2 ^ r0
                    r0 = r0 & r2
                    r0 = r0 | r3
                    int r0 = r0 * 970
                    int r4 = r4 + r0
                    r0 = r1 & r4
                    int r0 = ~r0
                    r2 = r1 | r4
                    r0 = r0 & r2
                    if (r0 == r1) goto L245f
                    int r2 = o.C19057fuB.AEQbTJ
                    r3 = r2 & 61
                    r2 = r2 | 61
                    int r3 = r3 + r2
                    int r2 = r3 % 128
                    o.C19057fuB.EZpvd = r2
                    r2 = 2
                    int r3 = r3 % r2
                    r3 = 5
                    java.lang.Object[] r3 = new java.lang.Object[r3]
                    r4 = 1
                    int[] r5 = new int[r4]
                    r6 = 0
                    r3[r6] = r5
                    int[] r7 = new int[r4]
                    r3[r2] = r7
                    int[] r2 = new int[r4]
                    r8 = 3
                    r3[r8] = r2
                    int[] r7 = (int[]) r7
                    r7[r6] = r1
                    int[] r2 = (int[]) r2
                    r2[r6] = r0
                    r2 = 0
                    r3[r4] = r2
                    r4 = 4
                    r3[r4] = r2
                    r0 = -865257992(0xffffffffcc6d35f8, float:-6.2183392E7)
                    r0 = r0 | r37
                    int r0 = ~r0
                    r2 = 1006291623(0x3bfacaa7, float:0.0076535526)
                    r2 = r2 | r1
                    int r2 = ~r2
                    r0 = r0 | r2
                    int r0 = r0 * (-831)
                    r2 = 1955791624(0x74930308, float:9.317982E31)
                    int r2 = r2 + r0
                    r0 = -596675076(0xffffffffdc6f75fc, float:-2.69608979E17)
                    r0 = r0 | r1
                    int r0 = ~r0
                    int r0 = r0 * (-1662)
                    int r2 = r2 + r0
                    r0 = -409616549(0xffffffffe795bf5b, float:-1.414325E24)
                    r0 = r0 | r37
                    int r0 = ~r0
                    r4 = 409616548(0x186a40a4, float:3.0276426E-24)
                    r4 = r4 | r1
                    int r4 = ~r4
                    r0 = r0 | r4
                    r4 = 865257991(0x3392ca07, float:6.835403E-8)
                    r4 = r4 | r1
                    int r4 = ~r4
                    r0 = r0 | r4
                    int r0 = r0 * 831
                    int r2 = r2 + r0
                    int r0 = r2 * 569
                    r4 = 9104(0x2390, float:1.2757E-41)
                    int r4 = r4 + r0
                    int r0 = ~r2
                    r6 = -17
                    r7 = r6 ^ r0
                    r8 = r6 & r0
                    r7 = r7 | r8
                    int r8 = ~r7
                    int r9 = ~r1
                    r10 = r6 | r9
                    int r6 = ~r10
                    r6 = r6 | r8
                    int r8 = ~r2
                    r10 = r8 ^ r9
                    r8 = r8 & r9
                    r8 = r8 | r10
                    int r8 = ~r8
                    r6 = r6 | r8
                    int r6 = r6 * (-1136)
                    int r4 = r4 + r6
                    r6 = -17
                    r6 = r6 | r1
                    int r6 = ~r6
                    r0 = r0 | r1
                    int r0 = ~r0
                    r8 = r6 ^ r0
                    r0 = r0 & r6
                    r0 = r0 | r8
                    r6 = r9 ^ 16
                    r8 = 16
                    r8 = r8 & r9
                    r6 = r6 | r8
                    r6 = r6 | r2
                    int r6 = ~r6
                    r8 = r0 ^ r6
                    r0 = r0 & r6
                    r0 = r0 | r8
                    int r0 = r0 * (-568)
                    int r4 = r4 + r0
                    r0 = r37 ^ 16
                    r6 = r37 & 16
                    r0 = r0 | r6
                    int r0 = ~r0
                    r6 = r37 ^ r2
                    r2 = r37 & r2
                    r2 = r2 | r6
                    int r2 = ~r2
                    r6 = r0 ^ r2
                    r0 = r0 & r2
                    r0 = r0 | r6
                    r2 = r7 ^ r1
                    r1 = r1 & r7
                    r1 = r1 | r2
                    int r1 = ~r1
                    r2 = r0 ^ r1
                    r0 = r0 & r1
                    r0 = r0 | r2
                    int r0 = r0 * 568
                    int r0 = -r0
                    int r0 = -r0
                    r1 = r4 & r0
                    r0 = r0 | r4
                    int r1 = r1 + r0
                    r2 = r85
                    r0 = r2 & r1
                    r1 = r1 | r2
                    int r0 = r0 + r1
                    int r1 = r0 << 13
                    r2 = r0 & r1
                    int r2 = ~r2
                    r0 = r0 | r1
                    r0 = r0 & r2
                    int r1 = r0 >>> 17
                    r0 = r0 ^ r1
                    int r1 = r0 << 5
                    int r2 = ~r1
                    r2 = r2 & r0
                    int r0 = ~r0
                    r0 = r0 & r1
                    r0 = r0 | r2
                    int[] r5 = (int[]) r5
                    r4 = 0
                    r5[r4] = r0
                    goto L2741
                L245f:
                    r2 = r85
                L2461:
                    r4 = 0
                    goto L2465
                L2463:
                    r2 = r5
                    goto L2461
                L2465:
                    r3 = 1
                    java.lang.Object[] r0 = new java.lang.Object[r3]
                    r5 = 1755(0x6db, float:2.459E-42)
                    r6 = 13
                    a(r4, r6, r5, r0)
                    r0 = r0[r4]
                    java.lang.String r0 = (java.lang.String) r0
                    java.lang.Object[] r5 = new java.lang.Object[r3]
                    r6 = 61625(0xf0b9, float:8.6355E-41)
                    r7 = 1768(0x6e8, float:2.477E-42)
                    r8 = 5
                    a(r6, r8, r7, r5)
                    r5 = r5[r4]
                    java.lang.String r5 = (java.lang.String) r5
                    java.lang.String[] r0 = new java.lang.String[]{r0, r5}
                    java.lang.Object[] r5 = new java.lang.Object[r3]
                    r6 = 2372(0x944, float:3.324E-42)
                    r7 = 15
                    r8 = 1773(0x6ed, float:2.485E-42)
                    a(r6, r7, r8, r5)
                    r5 = r5[r4]
                    java.lang.String r5 = (java.lang.String) r5
                    java.lang.Object[] r6 = new java.lang.Object[r3]
                    r7 = 36832(0x8fe0, float:5.1613E-41)
                    r8 = 1788(0x6fc, float:2.506E-42)
                    r9 = 19
                    a(r7, r9, r8, r6)
                    r6 = r6[r4]
                    java.lang.String r6 = (java.lang.String) r6
                    java.lang.Object[] r7 = new java.lang.Object[r3]
                    r8 = 1807(0x70f, float:2.532E-42)
                    r9 = 14
                    a(r4, r9, r8, r7)
                    r7 = r7[r4]
                    java.lang.String r7 = (java.lang.String) r7
                    java.lang.String[] r5 = new java.lang.String[]{r5, r6, r7}
                    java.lang.Object[] r6 = new java.lang.Object[r3]
                    r7 = 14220(0x378c, float:1.9926E-41)
                    r8 = 21
                    r9 = 1821(0x71d, float:2.552E-42)
                    a(r7, r8, r9, r6)
                    r6 = r6[r4]
                    java.lang.String r6 = (java.lang.String) r6
                    java.lang.Object[] r7 = new java.lang.Object[r3]
                    r8 = 3319(0xcf7, float:4.651E-42)
                    r9 = 10
                    r10 = 1842(0x732, float:2.581E-42)
                    a(r8, r9, r10, r7)
                    r7 = r7[r4]
                    java.lang.String r7 = (java.lang.String) r7
                    java.lang.String[] r6 = new java.lang.String[]{r6, r7}
                    java.lang.Object[] r7 = new java.lang.Object[r3]
                    r8 = 18353(0x47b1, float:2.5718E-41)
                    r9 = 11
                    r10 = 1852(0x73c, float:2.595E-42)
                    a(r8, r9, r10, r7)
                    r7 = r7[r4]
                    java.lang.String r7 = (java.lang.String) r7
                    java.lang.Object[] r8 = new java.lang.Object[r3]
                    r9 = 589(0x24d, float:8.25E-43)
                    r10 = 6
                    a(r4, r10, r9, r8)
                    r8 = r8[r4]
                    java.lang.String r8 = (java.lang.String) r8
                    java.lang.String[] r7 = new java.lang.String[]{r7, r8}
                    java.lang.Object[] r8 = new java.lang.Object[r3]
                    r9 = 38486(0x9656, float:5.393E-41)
                    r10 = 1863(0x747, float:2.61E-42)
                    r11 = 28
                    a(r9, r11, r10, r8)
                    r8 = r8[r4]
                    java.lang.String r8 = (java.lang.String) r8
                    java.lang.Object[] r9 = new java.lang.Object[r3]
                    r3 = 3319(0xcf7, float:4.651E-42)
                    r10 = 10
                    r11 = 1842(0x732, float:2.581E-42)
                    a(r3, r10, r11, r9)
                    r3 = r9[r4]
                    java.lang.String r3 = (java.lang.String) r3
                    java.lang.String[] r3 = new java.lang.String[]{r8, r3}
                    java.lang.String[][] r0 = new java.lang.String[][]{r0, r5, r6, r7, r3}
                    r3 = r4
                    r5 = 5
                    r13 = -1
                L2521:
                    if (r3 >= r5) goto L2630
                    r5 = r0[r3]
                    r6 = r5[r4]
                    int r4 = r5.length
                    r7 = 1
                    java.lang.Object[] r4 = java.util.Arrays.copyOfRange(r5, r7, r4)
                    java.lang.String[] r4 = (java.lang.String[]) r4
                    int r5 = r4.length
                    r7 = 0
                L2531:
                    if (r7 >= r5) goto L2623
                    r8 = r4[r7]
                    int r13 = r13 + 1
                    java.lang.Object[] r8 = new java.lang.Object[]{r6, r8}     // Catch: java.lang.Throwable -> L1b8
                    r9 = -1888477952(0xffffffff8f701d00, float:-1.1838499E-29)
                    java.lang.Object r9 = o.YY.EZpvd(r9)     // Catch: java.lang.Throwable -> L1b8
                    if (r9 != 0) goto L2576
                    r48 = 200(0xc8, float:2.8E-43)
                    r49 = 4
                    r50 = 45158(0xb066, float:6.328E-41)
                    r51 = -1957638020(0xffffffff8b50d07c, float:-4.021619E-32)
                    r52 = 0
                    r9 = 0
                    byte r10 = (byte) r9     // Catch: java.lang.Throwable -> L1b8
                    int r11 = r10 + 1
                    byte r11 = (byte) r11     // Catch: java.lang.Throwable -> L1b8
                    int r14 = r11 + (-1)
                    byte r14 = (byte) r14     // Catch: java.lang.Throwable -> L1b8
                    r15 = 1
                    java.lang.Object[] r12 = new java.lang.Object[r15]     // Catch: java.lang.Throwable -> L1b8
                    b(r10, r11, r14, r12)     // Catch: java.lang.Throwable -> L1b8
                    r10 = r12[r9]     // Catch: java.lang.Throwable -> L1b8
                    r53 = r10
                    java.lang.String r53 = (java.lang.String) r53     // Catch: java.lang.Throwable -> L1b8
                    r10 = 2
                    java.lang.Class[] r11 = new java.lang.Class[r10]     // Catch: java.lang.Throwable -> L1b8
                    java.lang.Class<java.lang.String> r10 = java.lang.String.class
                    r11[r9] = r10     // Catch: java.lang.Throwable -> L1b8
                    java.lang.Class<java.lang.String> r9 = java.lang.String.class
                    r10 = 1
                    r11[r10] = r9     // Catch: java.lang.Throwable -> L1b8
                    r54 = r11
                    java.lang.Object r9 = o.YY.EZpvd(r48, r49, r50, r51, r52, r53, r54)     // Catch: java.lang.Throwable -> L1b8
                L2576:
                    java.lang.reflect.Method r9 = (java.lang.reflect.Method) r9     // Catch: java.lang.Throwable -> L1b8
                    r10 = 0
                    java.lang.Object r8 = r9.invoke(r10, r8)     // Catch: java.lang.Throwable -> L1b8
                    java.lang.Long r8 = (java.lang.Long) r8     // Catch: java.lang.Throwable -> L1b8
                    long r8 = r8.longValue()     // Catch: java.lang.Throwable -> L1b8
                    r10 = 366092192(0x15d21fa0, float:8.486822E-26)
                    long r10 = (long) r10
                    long r14 = r30 * r10
                    long r19 = r34 * r8
                    long r14 = r14 + r19
                    long r19 = r10 ^ r46
                    long r19 = r19 | r8
                    long r19 = r19 ^ r46
                    long r38 = r8 | r42
                    long r38 = r38 ^ r46
                    long r38 = r19 | r38
                    long r38 = r38 * r40
                    long r14 = r14 + r38
                    long r38 = r10 | r8
                    long r38 = r38 | r42
                    long r38 = r38 ^ r46
                    long r38 = r38 * r44
                    long r14 = r14 + r38
                    long r8 = r8 ^ r46
                    long r8 = r8 | r10
                    long r8 = r8 ^ r46
                    long r8 = r19 | r8
                    long r10 = r10 | r42
                    long r10 = r10 ^ r46
                    long r8 = r8 | r10
                    long r8 = r8 * r44
                    long r14 = r14 + r8
                    r8 = -1538947625(0xffffffffa44585d7, float:-4.2830932E-17)
                    long r8 = (long) r8
                    long r14 = r14 + r8
                    r8 = 32
                    long r9 = r14 >> r8
                    int r8 = (int) r9
                    r9 = -1739668947(0xffffffff984ec22d, float:-2.672291E-24)
                    r10 = r9 | r1
                    int r10 = r10 * (-859)
                    r11 = 61341242(0x3a7fe3a, float:9.873745E-37)
                    int r11 = r11 + r10
                    r9 = r37 | r9
                    int r9 = ~r9
                    r10 = 1739947474(0x67b57dd2, float:1.7141386E24)
                    r10 = r10 | r1
                    int r10 = ~r10
                    r9 = r9 | r10
                    int r9 = r9 * 859
                    int r11 = r11 + r9
                    r9 = 1118071938(0x42a46c82, float:82.21193)
                    r9 = r9 | r37
                    int r9 = ~r9
                    r10 = 621875536(0x25111150, float:1.2582611E-16)
                    r9 = r9 | r10
                    int r9 = r9 * 859
                    int r11 = r11 + r9
                    r8 = r8 & r11
                    int r9 = (int) r14
                    int r10 = android.os.Process.myPid()
                    int r10 = ~r10
                    r11 = -1758588329(0xffffffff972e1257, float:-5.624558E-25)
                    r11 = r11 | r10
                    int r11 = ~r11
                    r12 = -1099152558(0xffffffffbe7c4352, float:-0.24635056)
                    r11 = r11 | r12
                    int r11 = r11 * (-983)
                    r14 = 982558464(0x3a90a700, float:0.0011036098)
                    int r14 = r14 + r11
                    r10 = r10 | r12
                    int r10 = ~r10
                    r11 = 16912389(0x1021005, float:2.3888722E-38)
                    r10 = r10 | r11
                    int r10 = r10 * 983
                    int r14 = r14 + r10
                    r9 = r9 & r14
                    r10 = r8 ^ r9
                    r8 = r8 & r9
                    r8 = r8 | r10
                    long r8 = (long) r8
                    int r8 = (int) r8
                    if (r8 == 0) goto L261a
                    r0 = r13 | 170(0xaa, float:2.38E-43)
                    r3 = 1
                    int r0 = r0 << r3
                    r3 = r13 ^ 170(0xaa, float:2.38E-43)
                    int r0 = r0 - r3
                    int r3 = ~r0
                    r3 = r3 & r1
                    r0 = r0 & r37
                    r0 = r0 | r3
                    r5 = 1
                    goto L2632
                L261a:
                    r8 = r7 ^ 1
                    r7 = r7 & 1
                    r9 = 1
                    int r7 = r7 << r9
                    int r7 = r7 + r8
                    goto L2531
                L2623:
                    r4 = r3 | (-124(0xffffffffffffff84, float:NaN))
                    r5 = 1
                    int r4 = r4 << r5
                    r3 = r3 ^ (-124(0xffffffffffffff84, float:NaN))
                    int r4 = r4 - r3
                    int r3 = r4 + 125
                    r4 = 0
                    r5 = 5
                    goto L2521
                L2630:
                    r5 = 1
                    r0 = r1
                L2632:
                    if (r0 == r1) goto L2744
                    r3 = 5
                    java.lang.Object[] r3 = new java.lang.Object[r3]
                    int[] r4 = new int[r5]
                    r6 = 0
                    r3[r6] = r4
                    int[] r7 = new int[r5]
                    r8 = 2
                    r3[r8] = r7
                    int[] r8 = new int[r5]
                    r9 = 3
                    r3[r9] = r8
                    int[] r7 = (int[]) r7
                    r7[r6] = r1
                    int[] r8 = (int[]) r8
                    r8[r6] = r0
                    r6 = 0
                    r3[r5] = r6
                    r5 = 4
                    r3[r5] = r6
                    r0 = -1065422194(0xffffffffc07ef28e, float:-3.9835544)
                    r0 = r0 | r1
                    int r0 = ~r0
                    r5 = 209452346(0xc7bfd3a, float:1.9412539E-31)
                    r5 = r37 | r5
                    int r5 = ~r5
                    r0 = r0 | r5
                    r5 = 1065422193(0x3f810d71, float:1.0082227)
                    r5 = r37 | r5
                    int r5 = ~r5
                    r0 = r0 | r5
                    int r0 = r0 * (-516)
                    r6 = 573684103(0x2231b987, float:2.408619E-18)
                    int r6 = r6 + r0
                    r0 = -201395505(0xfffffffff3fef2cf, float:-4.0398198E31)
                    r0 = r0 | r1
                    int r0 = ~r0
                    r7 = -8056843(0xffffffffff850ff5, float:NaN)
                    r7 = r37 | r7
                    int r7 = ~r7
                    r0 = r0 | r7
                    int r0 = r0 * 516
                    int r6 = r6 + r0
                    r0 = 8056842(0x7af00a, float:1.129004E-38)
                    r0 = r0 | r5
                    int r0 = r0 * 516
                    int r6 = r6 + r0
                    int r0 = r6 * 263
                    int r0 = -r0
                    int r0 = -r0
                    r5 = -8368(0xffffffffffffdf50, float:NaN)
                    r7 = r5 & r0
                    r0 = r0 | r5
                    int r7 = r7 + r0
                    r5 = -17
                    r0 = r5 ^ r6
                    r8 = r5 & r6
                    r0 = r0 | r8
                    int r0 = ~r0
                    int r5 = ~r6
                    r8 = r5 | 16
                    int r8 = ~r8
                    r9 = r0 ^ r8
                    r0 = r0 & r8
                    r0 = r0 | r9
                    r8 = r5 ^ r1
                    r9 = r5 & r1
                    r8 = r8 | r9
                    int r8 = ~r8
                    r9 = r0 ^ r8
                    r0 = r0 & r8
                    r0 = r0 | r9
                    int r0 = r0 * 262
                    int r0 = -r0
                    int r0 = -r0
                    r8 = r7 | r0
                    r9 = 1
                    int r8 = r8 << r9
                    r0 = r0 ^ r7
                    int r8 = r8 - r0
                    r0 = r5 ^ 16
                    r7 = 16
                    r5 = r5 & r7
                    r0 = r0 | r5
                    int r0 = ~r0
                    int r0 = r0 * (-786)
                    int r0 = ~r0
                    int r8 = r8 - r0
                    r5 = 1
                    int r8 = r8 - r5
                    int r0 = ~r6
                    r5 = r0 ^ r37
                    r7 = r0 & r37
                    r5 = r5 | r7
                    int r5 = ~r5
                    r7 = -17
                    r6 = r6 | r7
                    int r6 = ~r6
                    r7 = r5 ^ r6
                    r5 = r5 & r6
                    r5 = r5 | r7
                    r6 = r0 ^ 16
                    r7 = 16
                    r0 = r0 & r7
                    r0 = r0 | r6
                    int r0 = ~r0
                    r0 = r0 | r5
                    int r0 = r0 * 262
                    r5 = r8 & r0
                    r0 = r0 | r8
                    int r5 = r5 + r0
                    int r0 = r5 * 70
                    int r6 = r2 * (-68)
                    r7 = r0 | r6
                    r8 = 1
                    int r7 = r7 << r8
                    r0 = r0 ^ r6
                    int r7 = r7 - r0
                    int r0 = ~r5
                    int r6 = ~r2
                    r8 = r0 ^ r6
                    r6 = r6 & r0
                    r6 = r6 | r8
                    r8 = r6 ^ r1
                    r6 = r6 & r1
                    r6 = r6 | r8
                    int r6 = ~r6
                    r8 = r5 | r2
                    r9 = r8 ^ r1
                    r8 = r8 & r1
                    r8 = r8 | r9
                    int r8 = ~r8
                    r9 = r6 ^ r8
                    r6 = r6 & r8
                    r6 = r6 | r9
                    int r6 = r6 * 69
                    int r7 = r7 + r6
                    int r6 = ~r5
                    r8 = r6 ^ r2
                    r6 = r6 & r2
                    r6 = r6 | r8
                    int r6 = ~r6
                    r8 = r0 ^ r1
                    r0 = r0 & r1
                    r0 = r0 | r8
                    int r0 = ~r0
                    r0 = r0 | r6
                    r6 = r2 ^ r1
                    r1 = r1 & r2
                    r1 = r1 | r6
                    int r1 = ~r1
                    r6 = r0 ^ r1
                    r0 = r0 & r1
                    r0 = r0 | r6
                    int r0 = r0 * (-69)
                    r1 = r7 | r0
                    r6 = 1
                    int r1 = r1 << r6
                    r0 = r0 ^ r7
                    int r1 = r1 - r0
                    int r0 = ~r2
                    r2 = r0 ^ r5
                    r0 = r0 & r5
                    r0 = r0 | r2
                    int r0 = ~r0
                    int r0 = r0 * 69
                    int r0 = -r0
                    int r0 = -r0
                    r2 = r1 | r0
                    r5 = 1
                    int r2 = r2 << r5
                    r0 = r0 ^ r1
                    int r2 = r2 - r0
                    int r0 = r2 << 13
                    r0 = r0 ^ r2
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
                    int[] r4 = (int[]) r4
                    r5 = 0
                    r4[r5] = r0
                L2741:
                    r0 = r3
                    goto L2ae4
                L2744:
                    r3 = r5
                    r5 = 0
                    java.lang.Object[] r0 = new java.lang.Object[r3]     // Catch: java.lang.Exception -> L284b
                    r4 = 1891(0x763, float:2.65E-42)
                    r6 = 13
                    a(r5, r6, r4, r0)     // Catch: java.lang.Exception -> L284b
                    r0 = r0[r5]     // Catch: java.lang.Exception -> L284b
                    java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Exception -> L284b
                    java.lang.Object[] r4 = new java.lang.Object[r3]     // Catch: java.lang.Exception -> L284b
                    r3 = 1904(0x770, float:2.668E-42)
                    r6 = 8
                    a(r5, r6, r3, r4)     // Catch: java.lang.Exception -> L284b
                    r3 = r4[r5]     // Catch: java.lang.Exception -> L284b
                    java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Exception -> L284b
                    java.lang.Object[] r0 = new java.lang.Object[]{r0, r3}     // Catch: java.lang.Throwable -> L2842
                    r3 = -1888477952(0xffffffff8f701d00, float:-1.1838499E-29)
                    java.lang.Object r3 = o.YY.EZpvd(r3)     // Catch: java.lang.Throwable -> L2842
                    if (r3 != 0) goto L279a
                    r4 = 200(0xc8, float:2.8E-43)
                    r5 = 4
                    r6 = 45158(0xb066, float:6.328E-41)
                    r7 = -1957638020(0xffffffff8b50d07c, float:-4.021619E-32)
                    r8 = 0
                    r3 = 0
                    byte r9 = (byte) r3     // Catch: java.lang.Throwable -> L2842
                    int r10 = r9 + 1
                    byte r10 = (byte) r10     // Catch: java.lang.Throwable -> L2842
                    int r11 = r10 + (-1)
                    byte r11 = (byte) r11     // Catch: java.lang.Throwable -> L2842
                    r13 = 1
                    java.lang.Object[] r14 = new java.lang.Object[r13]     // Catch: java.lang.Throwable -> L2842
                    b(r9, r10, r11, r14)     // Catch: java.lang.Throwable -> L2842
                    r9 = r14[r3]     // Catch: java.lang.Throwable -> L2842
                    java.lang.String r9 = (java.lang.String) r9     // Catch: java.lang.Throwable -> L2842
                    r10 = 2
                    java.lang.Class[] r11 = new java.lang.Class[r10]     // Catch: java.lang.Throwable -> L2842
                    java.lang.Class<java.lang.String> r10 = java.lang.String.class
                    r11[r3] = r10     // Catch: java.lang.Throwable -> L2842
                    java.lang.Class<java.lang.String> r3 = java.lang.String.class
                    r10 = 1
                    r11[r10] = r3     // Catch: java.lang.Throwable -> L2842
                    r10 = r11
                    java.lang.Object r3 = o.YY.EZpvd(r4, r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L2842
                L279a:
                    java.lang.reflect.Method r3 = (java.lang.reflect.Method) r3     // Catch: java.lang.Throwable -> L2842
                    r4 = 0
                    java.lang.Object r0 = r3.invoke(r4, r0)     // Catch: java.lang.Throwable -> L2842
                    java.lang.Long r0 = (java.lang.Long) r0     // Catch: java.lang.Throwable -> L2842
                    long r3 = r0.longValue()     // Catch: java.lang.Throwable -> L2842
                    r0 = 156348538(0x951b07a, float:2.5240439E-33)
                    long r5 = (long) r0
                    r0 = -317(0xfffffffffffffec3, float:NaN)
                    long r7 = (long) r0
                    long r7 = r7 * r5
                    r0 = 319(0x13f, float:4.47E-43)
                    long r9 = (long) r0
                    long r9 = r9 * r3
                    long r7 = r7 + r9
                    r0 = -318(0xfffffffffffffec2, float:NaN)
                    long r9 = (long) r0
                    long r13 = r5 ^ r46
                    long r19 = r3 ^ r46
                    long r24 = r13 | r19
                    long r24 = r24 | r42
                    long r24 = r24 ^ r46
                    long r28 = r56 | r5
                    long r3 = r28 | r3
                    long r3 = r3 ^ r46
                    long r3 = r24 | r3
                    long r3 = r3 * r9
                    long r7 = r7 + r3
                    long r3 = r19 | r5
                    long r3 = r3 ^ r46
                    long r5 = r5 | r42
                    long r5 = r5 ^ r46
                    long r3 = r3 | r5
                    long r9 = r9 * r3
                    long r7 = r7 + r9
                    r0 = 318(0x13e, float:4.46E-43)
                    long r3 = (long) r0
                    long r5 = r13 | r42
                    long r5 = r5 ^ r46
                    long r5 = r19 | r5
                    long r3 = r3 * r5
                    long r7 = r7 + r3
                    r0 = -1329203971(0xffffffffb0c5f4fd, float:-1.4403266E-9)
                    long r3 = (long) r0
                    long r7 = r7 + r3
                    r3 = 32
                    long r4 = r7 >> r3
                    int r0 = (int) r4
                    r3 = -69206051(0xfffffffffbdfffdd, float:-2.3261434E36)
                    r3 = r3 | r37
                    int r3 = r3 * 494
                    r4 = -227046766(0xfffffffff2778a92, float:-4.9030604E30)
                    int r4 = r4 + r3
                    r3 = -1182420280(0xffffffffb985b2c8, float:-2.550094E-4)
                    r3 = r37 | r3
                    int r3 = ~r3
                    r5 = -631312427(0xffffffffda5eefd5, float:-1.56877857E16)
                    r3 = r3 | r5
                    int r3 = r3 * 494
                    int r4 = r4 + r3
                    r0 = r0 & r4
                    int r3 = (int) r7
                    long r4 = android.os.SystemClock.uptimeMillis()     // Catch: java.lang.Exception -> L284b
                    int r4 = (int) r4     // Catch: java.lang.Exception -> L284b
                    int r5 = ~r4     // Catch: java.lang.Exception -> L284b
                    r6 = -554184543(0xffffffffdef7d0a1, float:-8.9284748E18)
                    r7 = r5 | r6
                    int r7 = ~r7     // Catch: java.lang.Exception -> L284b
                    r8 = -883041868(0xffffffffcb5dd9b4, float:-1.4539188E7)
                    r7 = r7 | r8
                    int r7 = r7 * (-1042)
                    r8 = -973200896(0xffffffffc5fe2200, float:-8132.25)
                    int r8 = r8 + r7
                    r6 = r6 | r4
                    int r6 = r6 * 521
                    int r8 = r8 + r6
                    r6 = 883041867(0x34a2264b, float:3.0202713E-7)
                    r4 = r4 | r6
                    int r4 = ~r4     // Catch: java.lang.Exception -> L284b
                    r6 = -900345696(0xffffffffca55d0a0, float:-3503144.0)
                    r4 = r4 | r6
                    r6 = -536880715(0xffffffffdfffd9b5, float:-3.6871931E19)
                    r5 = r5 | r6
                    int r5 = ~r5     // Catch: java.lang.Exception -> L284b
                    r4 = r4 | r5
                    int r4 = r4 * 521
                    int r8 = r8 + r4
                    r3 = r3 & r8
                    r4 = r0 ^ r3
                    r0 = r0 & r3
                    r0 = r0 | r4
                    long r3 = (long) r0     // Catch: java.lang.Exception -> L284b
                    int r0 = (int) r3     // Catch: java.lang.Exception -> L284b
                    if (r0 == 0) goto L2840
                    r0 = r1 & 150(0x96, float:2.1E-43)
                    int r0 = ~r0     // Catch: java.lang.Exception -> L284b
                    r3 = r1 | 150(0x96, float:2.1E-43)
                    goto L2850
                L2840:
                    r0 = r1
                    goto L2851
                L2842:
                    r0 = move-exception
                    java.lang.Throwable r3 = r0.getCause()     // Catch: java.lang.Exception -> L284b
                    if (r3 == 0) goto L284a
                    throw r3     // Catch: java.lang.Exception -> L284b
                L284a:
                    throw r0     // Catch: java.lang.Exception -> L284b
                L284b:
                    r0 = r1 & 151(0x97, float:2.12E-43)
                    int r0 = ~r0
                    r3 = r1 | 151(0x97, float:2.12E-43)
                L2850:
                    r0 = r0 & r3
                L2851:
                    if (r0 == r1) goto L28d9
                    r3 = 5
                    java.lang.Object[] r3 = new java.lang.Object[r3]
                    r4 = 1
                    int[] r5 = new int[r4]
                    r6 = 0
                    r3[r6] = r5
                    int[] r5 = new int[r4]
                    r6 = 2
                    r3[r6] = r5
                    int[] r7 = new int[r4]
                    r4 = 3
                    r3[r4] = r7
                    int r4 = o.C19057fuB.AEQbTJ
                    int r4 = r4 + 25
                    int r8 = r4 % 128
                    o.C19057fuB.EZpvd = r8
                    int r4 = r4 % r6
                    if (r4 != 0) goto L287c
                    int[] r5 = (int[]) r5
                    r4 = 0
                    r5[r4] = r1
                    r6 = 4
                    r1 = r3[r6]
                    int[] r1 = (int[]) r1
                    goto L2885
                L287c:
                    r4 = 0
                    r6 = 4
                    int[] r5 = (int[]) r5
                    r5[r4] = r1
                    r1 = r7
                    int[] r1 = (int[]) r1
                L2885:
                    r1[r4] = r0
                    r1 = 0
                    r4 = 1
                    r3[r4] = r1
                    r3[r6] = r1
                    long r0 = android.os.Process.getStartUptimeMillis()
                    int r0 = (int) r0
                    r1 = -986948585(0xffffffffc52c5c17, float:-2757.7556)
                    r4 = r1 | r0
                    int r4 = ~r4
                    r5 = -1006364652(0xffffffffc4041814, float:-528.3762)
                    r4 = r4 | r5
                    int r4 = r4 * (-502)
                    r5 = -3083975(0xffffffffffd0f139, float:NaN)
                    int r5 = r5 + r4
                    int r4 = ~r0
                    r6 = -718438697(0xffffffffd52d7ed7, float:-1.19225178E13)
                    r4 = r4 | r6
                    int r4 = ~r4
                    int r4 = r4 * (-502)
                    int r5 = r5 + r4
                    r4 = -287925956(0xffffffffeed6993c, float:-3.320752E28)
                    r0 = r0 | r4
                    int r0 = ~r0
                    r0 = r0 | r1
                    int r0 = r0 * 502
                    int r5 = r5 + r0
                    r0 = r5 & 16
                    r1 = 16
                    r1 = r1 | r5
                    int r0 = r0 + r1
                    int r0 = r0 + r2
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
                    int r2 = ~r1
                    r2 = r2 & r0
                    int r0 = ~r0
                    r0 = r0 & r1
                    r0 = r0 | r2
                    r4 = 0
                    r1 = r3[r4]
                    int[] r1 = (int[]) r1
                    r1[r4] = r0
                    goto L2741
                L28d9:
                    r3 = 1
                    r4 = 0
                    java.lang.Object[] r0 = new java.lang.Object[r3]
                    r3 = 41787(0xa33b, float:5.8556E-41)
                    r5 = 47
                    r6 = 1912(0x778, float:2.679E-42)
                    a(r3, r5, r6, r0)
                    r0 = r0[r4]
                    java.lang.String r0 = (java.lang.String) r0
                    java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch: java.lang.Throwable -> L1b8
                    r3 = 1704729038(0x659c19ce, float:9.214565E22)
                    java.lang.Object r3 = o.YY.EZpvd(r3)     // Catch: java.lang.Throwable -> L1b8
                    if (r3 != 0) goto L291f
                    r4 = 511(0x1ff, float:7.16E-43)
                    r5 = 5
                    r6 = 43308(0xa92c, float:6.0687E-41)
                    r7 = 1639765170(0x61bcd4b2, float:4.3541427E20)
                    r8 = 0
                    r3 = 1
                    byte r9 = (byte) r3     // Catch: java.lang.Throwable -> L1b8
                    int r10 = -r9
                    byte r10 = (byte) r10     // Catch: java.lang.Throwable -> L1b8
                    int r11 = r10 + 4
                    byte r11 = (byte) r11     // Catch: java.lang.Throwable -> L1b8
                    java.lang.Object[] r13 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L1b8
                    b(r9, r10, r11, r13)     // Catch: java.lang.Throwable -> L1b8
                    r9 = 0
                    r10 = r13[r9]     // Catch: java.lang.Throwable -> L1b8
                    java.lang.String r10 = (java.lang.String) r10     // Catch: java.lang.Throwable -> L1b8
                    java.lang.Class[] r11 = new java.lang.Class[r3]     // Catch: java.lang.Throwable -> L1b8
                    java.lang.Class<java.lang.String> r3 = java.lang.String.class
                    r11[r9] = r3     // Catch: java.lang.Throwable -> L1b8
                    r9 = r10
                    r10 = r11
                    java.lang.Object r3 = o.YY.EZpvd(r4, r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L1b8
                L291f:
                    java.lang.reflect.Method r3 = (java.lang.reflect.Method) r3     // Catch: java.lang.Throwable -> L1b8
                    r4 = 0
                    java.lang.Object r0 = r3.invoke(r4, r0)     // Catch: java.lang.Throwable -> L1b8
                    java.lang.Long r0 = (java.lang.Long) r0     // Catch: java.lang.Throwable -> L1b8
                    long r3 = r0.longValue()     // Catch: java.lang.Throwable -> L1b8
                    r0 = 1741449775(0x67cc6a2f, float:1.930643E24)
                    long r5 = (long) r0
                    java.lang.Runtime r0 = java.lang.Runtime.getRuntime()
                    long r7 = r0.maxMemory()
                    int r0 = (int) r7
                    r7 = 367(0x16f, float:5.14E-43)
                    long r7 = (long) r7
                    long r9 = r7 * r5
                    long r7 = r7 * r3
                    long r9 = r9 + r7
                    r7 = -366(0xfffffffffffffe92, float:NaN)
                    long r7 = (long) r7
                    long r13 = r5 | r3
                    long r13 = r13 * r7
                    long r9 = r9 + r13
                    long r13 = r3 ^ r46
                    long r11 = (long) r0
                    long r19 = r13 | r11
                    long r19 = r19 ^ r46
                    long r19 = r5 | r19
                    long r7 = r7 * r19
                    long r9 = r9 + r7
                    r0 = 366(0x16e, float:5.13E-43)
                    long r7 = (long) r0
                    long r19 = r5 ^ r46
                    long r3 = r19 | r3
                    long r3 = r3 ^ r46
                    long r5 = r5 | r13
                    long r5 = r5 | r11
                    long r5 = r5 ^ r46
                    long r3 = r3 | r5
                    long r7 = r7 * r3
                    long r9 = r9 + r7
                    r0 = -1907046502(0xffffffff8e54c79a, float:-2.6227122E-30)
                    long r3 = (long) r0
                    long r9 = r9 + r3
                    r3 = 32
                    long r3 = r9 >> r3
                    int r0 = (int) r3
                    long r3 = android.os.Process.getElapsedCpuTime()
                    int r3 = (int) r3
                    r4 = -1748238869(0xffffffff97cbfdeb, float:-1.3182665E-24)
                    r4 = r4 | r3
                    int r4 = ~r4
                    r5 = -311012458(0xffffffffed765396, float:-4.7646476E27)
                    r5 = r5 | r3
                    int r5 = ~r5
                    r4 = r4 | r5
                    int r4 = r4 * 69
                    r5 = 409438112(0x186787a0, float:2.9924523E-24)
                    int r5 = r5 + r4
                    r4 = -1769345813(0xffffffff9689eceb, float:-2.228306E-25)
                    r4 = r4 | r3
                    int r4 = ~r4
                    r6 = 21106944(0x1421100, float:3.564437E-38)
                    r4 = r4 | r6
                    r6 = -332119402(0xffffffffec344296, float:-8.7168436E26)
                    r3 = r3 | r6
                    int r3 = ~r3
                    r3 = r3 | r4
                    int r3 = r3 * (-69)
                    int r5 = r5 + r3
                    r3 = -1810799862(0xffffffff9411630a, float:-7.340161E-27)
                    int r5 = r5 + r3
                    r0 = r0 & r5
                    int r3 = (int) r9
                    long r4 = android.os.SystemClock.uptimeMillis()
                    int r4 = (int) r4
                    int r5 = ~r4
                    r6 = -1396154060(0xffffffffacc86134, float:-5.6951336E-12)
                    r6 = r6 | r5
                    int r6 = ~r6
                    r7 = 1359284225(0x51050801, float:3.5710308E10)
                    r7 = r7 | r6
                    int r7 = r7 * (-712)
                    r8 = 1308276093(0x4dfab57d, float:5.25774752E8)
                    int r8 = r8 + r7
                    r7 = -1359284226(0xffffffffaefaf7fe, float:-1.1412736E-10)
                    r5 = r5 | r7
                    int r5 = ~r5
                    r7 = -36869835(0xfffffffffdcd6935, float:-3.412975E37)
                    r4 = r4 | r7
                    int r4 = ~r4
                    r4 = r4 | r5
                    int r4 = r4 * (-712)
                    int r8 = r8 + r4
                    r4 = 41072350(0x272b6de, float:1.7831832E-37)
                    r4 = r4 | r6
                    int r4 = r4 * 712
                    int r8 = r8 + r4
                    r3 = r3 & r8
                    r4 = r0 ^ r3
                    r0 = r0 & r3
                    r0 = r0 | r4
                    long r3 = (long) r0
                    int r0 = (int) r3
                    int r0 = r0 * 263
                    r3 = r1 & r0
                    int r3 = ~r3
                    r0 = r0 | r1
                    r0 = r0 & r3
                    r3 = 5
                    if (r0 == r1) goto L2a89
                    java.lang.Object[] r3 = new java.lang.Object[r3]
                    r4 = 1
                    int[] r5 = new int[r4]
                    r6 = 0
                    r3[r6] = r5
                    int[] r5 = new int[r4]
                    r7 = 2
                    r3[r7] = r5
                    int[] r7 = new int[r4]
                    r8 = 3
                    r3[r8] = r7
                    int[] r5 = (int[]) r5
                    r5[r6] = r1
                    int[] r7 = (int[]) r7
                    r7[r6] = r0
                    r5 = 0
                    r3[r4] = r5
                    r4 = 4
                    r3[r4] = r5
                    r0 = -193508965(0xfffffffff477499b, float:-7.8368544E31)
                    r0 = r0 | r37
                    int r0 = ~r0
                    r4 = 5188(0x1444, float:7.27E-42)
                    r0 = r0 | r4
                    r4 = -1081365576(0xffffffffbf8babb8, float:-1.0911779)
                    r5 = r4 | r37
                    int r5 = ~r5
                    r0 = r0 | r5
                    r5 = 1274869351(0x4bfcf667, float:3.3156302E7)
                    r5 = r5 | r1
                    int r5 = ~r5
                    r0 = r0 | r5
                    int r0 = r0 * (-84)
                    r5 = 990153415(0x3b048ac7, float:0.002022432)
                    int r5 = r5 + r0
                    r0 = r4 | r1
                    int r0 = ~r0
                    r1 = 193508964(0xb88b664, float:5.2659725E-32)
                    r0 = r0 | r1
                    r1 = 1081365575(0x40745447, float:3.817644)
                    r1 = r37 | r1
                    int r1 = ~r1
                    r0 = r0 | r1
                    int r0 = r0 * (-84)
                    int r5 = r5 + r0
                    r0 = -1274869352(0xffffffffb4030998, float:-1.2203816E-7)
                    r0 = r0 | r1
                    int r0 = r0 * 84
                    int r5 = r5 + r0
                    int r0 = o.C14220dhO.OLrzqt()
                    int r1 = r5 * (-657)
                    int r1 = -r1
                    int r1 = -r1
                    int r1 = ~r1
                    int r1 = 10543 - r1
                    r4 = -17
                    r6 = r4 ^ r5
                    r4 = r4 & r5
                    r4 = r4 | r6
                    int r4 = ~r4
                    int r6 = ~r5
                    r7 = r6 ^ 16
                    r8 = 16
                    r6 = r6 & r8
                    r6 = r6 | r7
                    int r6 = ~r6
                    r4 = r4 | r6
                    r6 = r0 ^ 16
                    r0 = r0 & r8
                    r0 = r0 | r6
                    int r0 = ~r0
                    r4 = r4 | r0
                    int r4 = r4 * (-658)
                    int r4 = -r4
                    int r4 = -r4
                    r6 = r1 & r4
                    r1 = r1 | r4
                    int r6 = r6 + r1
                    int r1 = ~r5
                    r4 = r1 ^ 16
                    r5 = r1 & 16
                    r4 = r4 | r5
                    int r4 = ~r4
                    int r4 = r4 * 658
                    int r6 = r6 + r4
                    r4 = 16
                    r1 = r1 | r4
                    int r1 = ~r1
                    r4 = r1 ^ r0
                    r0 = r0 & r1
                    r0 = r0 | r4
                    int r0 = r0 * 658
                    r1 = r6 ^ r0
                    r0 = r0 & r6
                    r4 = 1
                    int r0 = r0 << r4
                    int r1 = r1 + r0
                    int r0 = -r1
                    int r0 = -r0
                    r1 = r2 & r0
                    r0 = r0 | r2
                    int r1 = r1 + r0
                    int r0 = r1 << 13
                    r0 = r0 ^ r1
                    int r1 = r0 >>> 17
                    r0 = r0 ^ r1
                    int r1 = r0 << 5
                    r2 = r0 & r1
                    int r2 = ~r2
                    r0 = r0 | r1
                    r0 = r0 & r2
                    r4 = 0
                    r1 = r3[r4]
                    int[] r1 = (int[]) r1
                    r1[r4] = r0
                    goto L2741
                L2a89:
                    r4 = 0
                    java.lang.Object[] r0 = new java.lang.Object[r3]
                    r3 = 1
                    int[] r5 = new int[r3]
                    r0[r4] = r5
                    int[] r6 = new int[r3]
                    r7 = 2
                    r0[r7] = r6
                    int[] r7 = new int[r3]
                    r8 = 3
                    r0[r8] = r7
                    int[] r6 = (int[]) r6
                    r6[r4] = r1
                    int[] r7 = (int[]) r7
                    r7[r4] = r1
                    r4 = 0
                    r0[r3] = r4
                    r3 = 4
                    r0[r3] = r4
                    r3 = 670889855(0x27fcf77f, float:7.0212386E-15)
                    r3 = r37 | r3
                    int r3 = ~r3
                    int r3 = r3 * (-116)
                    r4 = -581683921(0xffffffffdd54352f, float:-9.5569874E17)
                    int r4 = r4 + r3
                    r3 = 620761900(0x2500132c, float:1.1108726E-16)
                    r3 = r3 | r1
                    int r3 = r3 * 116
                    int r4 = r4 + r3
                    r3 = -654112640(0xffffffffd9030880, float:-2.30516049E15)
                    r1 = r1 | r3
                    int r1 = ~r1
                    r3 = 603984684(0x2400132c, float:2.7771815E-17)
                    r1 = r1 | r3
                    int r1 = r1 * 116
                    int r4 = r4 + r1
                    int r1 = -r4
                    int r1 = -r1
                    r3 = r2 & r1
                    r1 = r1 | r2
                    int r3 = r3 + r1
                    int r1 = r3 << 13
                    int r2 = ~r1
                    r2 = r2 & r3
                    int r3 = ~r3
                    r1 = r1 & r3
                    r1 = r1 | r2
                    int r2 = r1 >>> 17
                    r1 = r1 ^ r2
                    int r2 = r1 << 5
                    r3 = r1 & r2
                    int r3 = ~r3
                    r1 = r1 | r2
                    r1 = r1 & r3
                    int[] r5 = (int[]) r5
                    r2 = 0
                    r5[r2] = r1
                L2ae4:
                    return r0
                L2ae5:
                    java.lang.Throwable r1 = r0.getCause()
                    if (r1 == 0) goto L2aec
                    throw r1
                L2aec:
                    throw r0
                */
                throw new UnsupportedOperationException("Method not decompiled: o.C19057fuB.KWHzl(android.content.Context, int, int, int):java.lang.Object[]");
            }
        });
        this.valueOf = new C18998fsw(Long.MIN_VALUE, "", "");
    }

    /* JADX INFO: renamed from: o.fuA$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.fuA.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final C19056fuA OLrzqt(android.os.Bundle bundle) {
            C19056fuA c19056fuA = new C19056fuA();
            c19056fuA.setArguments(bundle);
            return c19056fuA;
        }
    }

    private final java.lang.String AhwBna() {
        return (java.lang.String) this.values.getValue();
    }

    public static final java.lang.String AkhnZx(C19056fuA c19056fuA) {
        android.os.Bundle arguments = c19056fuA.getArguments();
        if (arguments != null) {
            return arguments.getString("arg_source");
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TokenSearchResultViewModel DbNXlk() {
        return (TokenSearchResultViewModel) this.fJNWhG.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final WalletSearchAllResultViewModel isConnected() {
        return (WalletSearchAllResultViewModel) this.ejfBZ.getValue();
    }

    private final WalletSearchHistoryViewModel valueOf() {
        return (WalletSearchHistoryViewModel) this.AkhnZx.getValue();
    }

    public static final C19197fwj AYXKKw() {
        return new C19197fwj();
    }

    public final C19197fwj djBIcL() {
        return (C19197fwj) this.isConnected.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        gEmmrt();
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        this.AhwBna = C16629enY.OLrzqt(view);
        gEmmrt();
        AkhnZx();
        values();
    }

    private final void gEmmrt() {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new WalletSearchAllResultFragment$addDataListener$1(this, null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new WalletSearchAllResultFragment$addDataListener$2(this, null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new WalletSearchAllResultFragment$addDataListener$3(this, null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new WalletSearchAllResultFragment$addDataListener$4(this, null), 3, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:71:0x019c A[Catch: Exception -> 0x035b, TryCatch #0 {Exception -> 0x035b, blocks: (B:3:0x0006, B:5:0x0014, B:7:0x002f, B:10:0x004a, B:12:0x0050, B:13:0x0059, B:15:0x005f, B:17:0x0074, B:18:0x007c, B:21:0x0085, B:24:0x008d, B:25:0x00a0, B:27:0x00a6, B:29:0x00bf, B:30:0x00c3, B:32:0x00cd, B:41:0x0108, B:43:0x0120, B:44:0x0126, B:46:0x012c, B:48:0x0132, B:49:0x0135, B:51:0x0147, B:69:0x0196, B:56:0x0157, B:58:0x015d, B:61:0x0172, B:68:0x0194, B:62:0x0176, B:64:0x017c, B:67:0x0191, B:71:0x019c, B:73:0x01a2, B:74:0x01aa, B:35:0x00d8, B:36:0x00e7, B:39:0x0102, B:75:0x01b5, B:76:0x01ba, B:79:0x01d0, B:81:0x01d6, B:99:0x0233, B:100:0x0237, B:102:0x023d, B:104:0x024d, B:106:0x0271, B:108:0x0277, B:123:0x02a3, B:125:0x02ae, B:126:0x02b2, B:128:0x02b8, B:130:0x02c8, B:131:0x02d0, B:133:0x02d6, B:134:0x02da, B:136:0x02e0, B:138:0x02f0, B:139:0x02f8, B:141:0x02fe, B:142:0x0302, B:144:0x0308, B:145:0x0316, B:147:0x031c, B:148:0x0320, B:150:0x0326, B:151:0x0334, B:110:0x027d, B:112:0x0283, B:114:0x0289, B:116:0x028f, B:118:0x0295, B:120:0x029b, B:152:0x0343, B:153:0x034a, B:83:0x01dc, B:85:0x01f0, B:87:0x01fb, B:93:0x0216, B:94:0x021d, B:95:0x0221, B:97:0x0227, B:8:0x0045, B:78:0x01bd), top: B:158:0x0006 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void copydefault(java.util.List<C18982fsg> list, SearchRecommendResponse searchRecommendResponse, C19000fsy c19000fsy, java.util.List<SearchAddressModel> list2, java.util.List<C18977fsb> list3, java.lang.String str, boolean z) {
        java.util.List<C18978fsc> listOLrzqt;
        java.util.List<C18999fsx> listKWHzl;
        java.util.List<C18990fso> listCopydefault;
        LinkedHashMap linkedHashMap;
        try {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            if (C33129mqd.KWHzl((java.util.Collection) list)) {
                arrayList.add(new C18951fsB(14.0f, 0.0f, 2, null));
                arrayList.add(this.valueOf);
                Intrinsics.copydefault(list);
                int size = list.size();
                int i = this.djBIcL;
                if (size > i) {
                    arrayList.addAll(CollectionsKt___CollectionsKt.AhwBna((java.lang.Iterable) list, i));
                    arrayList.add(new C18953fsD(C33070mpX.AYXKKw(C13754dXa.FragmentManager.DCUTEI), 1));
                } else {
                    arrayList.addAll(list);
                }
                if (searchRecommendResponse != null) {
                    java.util.List<SearchRecommendTokenModel> tokenList = searchRecommendResponse.getTokenList();
                    if (tokenList != null) {
                        linkedHashMap = new LinkedHashMap();
                        for (java.lang.Object obj : tokenList) {
                            java.lang.Integer numValueOf = java.lang.Integer.valueOf(((SearchRecommendTokenModel) obj).getStrategyType());
                            java.lang.Object arrayList2 = linkedHashMap.get(numValueOf);
                            if (arrayList2 == null) {
                                arrayList2 = new java.util.ArrayList();
                                linkedHashMap.put(numValueOf, arrayList2);
                            }
                            ((java.util.List) arrayList2).add(obj);
                        }
                    } else {
                        linkedHashMap = null;
                    }
                    if (linkedHashMap != null && !linkedHashMap.isEmpty()) {
                        C18951fsB c18951fsB = new C18951fsB(18.0f, 0.0f, 2, null);
                        arrayList.add(c18951fsB);
                        java.util.ArrayList arrayList3 = new java.util.ArrayList();
                        for (java.lang.Object obj2 : list) {
                            C18982fsg c18982fsg = (C18982fsg) obj2;
                            if (Intrinsics.EZpvd((java.lang.Object) c18982fsg.copydefault().fetchVPNInfo(), (java.lang.Object) c18982fsg.OLrzqt())) {
                                arrayList3.add(obj2);
                            }
                        }
                        java.util.Iterator it = arrayList3.iterator();
                        if (!it.hasNext()) {
                            throw new NoSuchElementException();
                        }
                        java.lang.Object next = it.next();
                        if (it.hasNext()) {
                            BigDecimal bigDecimalEZpvd = C33129mqd.EZpvd(((C18982fsg) next).copydefault().KWHzl());
                            do {
                                java.lang.Object next2 = it.next();
                                BigDecimal bigDecimalEZpvd2 = C33129mqd.EZpvd(((C18982fsg) next2).copydefault().KWHzl());
                                if (bigDecimalEZpvd.compareTo(bigDecimalEZpvd2) < 0) {
                                    next = next2;
                                    bigDecimalEZpvd = bigDecimalEZpvd2;
                                }
                            } while (it.hasNext());
                        }
                        arrayList.add(new C19001fsz(((C18982fsg) next).copydefault().isConnected()));
                        java.util.List<java.lang.Integer> strategyTypeList = searchRecommendResponse.getStrategyTypeList();
                        if (strategyTypeList != null) {
                            int i2 = 0;
                            int i3 = 0;
                            for (java.lang.Object obj3 : strategyTypeList) {
                                if (i3 < 0) {
                                    yDY.AYXKKw();
                                }
                                int iIntValue = ((java.lang.Number) obj3).intValue();
                                java.util.List<SearchRecommendTokenModel> list4 = (java.util.List) linkedHashMap.get(java.lang.Integer.valueOf(iIntValue));
                                if (i3 > 0) {
                                    arrayList.add(new C18951fsB(8.0f, 0.0f, 2, null));
                                }
                                if (iIntValue == 0) {
                                    if (C33129mqd.KWHzl((java.util.Collection) list4)) {
                                        arrayList.add(new C18996fsu(C33070mpX.AYXKKw(C13754dXa.FragmentManager.Rinterpolator)));
                                        java.util.List<C18952fsC> listEZpvd = EZpvd(list4);
                                        if (listEZpvd != null) {
                                            arrayList.addAll(listEZpvd);
                                            i2++;
                                        }
                                    }
                                } else if (iIntValue == 1 && C33129mqd.KWHzl((java.util.Collection) list4)) {
                                    arrayList.add(new C18996fsu(C33070mpX.AYXKKw(C13754dXa.FragmentManager.Rinteger)));
                                    java.util.List<C18952fsC> listEZpvd2 = EZpvd(list4);
                                    if (listEZpvd2 != null) {
                                        arrayList.addAll(listEZpvd2);
                                        i2++;
                                    }
                                }
                                i3++;
                            }
                            if (i2 == 0) {
                                for (int iIndexOf = arrayList.indexOf(c18951fsB); iIndexOf > 0; iIndexOf = arrayList.indexOf(c18951fsB)) {
                                    C56406yEe.getFieldNames(arrayList);
                                }
                                arrayList.add(new C18951fsB(16.0f, 0.0f, 2, null));
                            }
                        }
                    }
                }
            } else if (z) {
                arrayList.add(this.valueOf);
                arrayList.add(new C18994fss(C33070mpX.AYXKKw(C13754dXa.FragmentManager.MediaSessionCompatMediaSessionImplBase)));
            }
            if (C33129mqd.KWHzl((java.util.Collection) list3) || str.length() > 0) {
                arrayList.add(new C18950fsA(C33070mpX.AYXKKw(C13754dXa.FragmentManager.invokespecialsiEkQe)));
                if (C33129mqd.KWHzl((java.util.Collection) list3)) {
                    Intrinsics.copydefault(list3);
                    int size2 = list3.size();
                    int i4 = this.djBIcL;
                    if (size2 > i4) {
                        arrayList.addAll(CollectionsKt___CollectionsKt.AhwBna((java.lang.Iterable) list3, i4));
                        arrayList.add(new C18953fsD(C33070mpX.AYXKKw(C13754dXa.FragmentManager.DCUTEI), (C33129mqd.KWHzl((java.util.Collection) list) || z) ? 2 : 1));
                    } else {
                        arrayList.addAll(list3);
                    }
                } else if (str.length() > 0) {
                    arrayList.add(new C18983fsh(str));
                }
            }
            if (list2 != null) {
                for (SearchAddressModel searchAddressModel : list2) {
                    if (C33129mqd.OLrzqt((java.lang.CharSequence) searchAddressModel.getAddress())) {
                        arrayList.add(new C18950fsA(C33070mpX.AYXKKw(C13754dXa.FragmentManager.flVtFt)));
                        java.lang.String address = searchAddressModel.getAddress();
                        Intrinsics.copydefault((java.lang.Object) address);
                        arrayList.add(new C18997fsv(address, searchAddressModel.getChainIndexes()));
                    }
                }
            }
            if (c19000fsy != null) {
                java.util.List<C18992fsq> listAEQbTJ = c19000fsy.AEQbTJ();
                if ((listAEQbTJ == null || listAEQbTJ.isEmpty()) && (((listOLrzqt = c19000fsy.OLrzqt()) == null || listOLrzqt.isEmpty()) && (((listKWHzl = c19000fsy.KWHzl()) == null || listKWHzl.isEmpty()) && ((listCopydefault = c19000fsy.copydefault()) == null || listCopydefault.isEmpty())))) {
                    C19188fwa.submitList$default(djBIcL(), arrayList, null, 2, null);
                } else {
                    java.util.ArrayList arrayList4 = new java.util.ArrayList();
                    java.util.List<C18992fsq> listAEQbTJ2 = c19000fsy.AEQbTJ();
                    if (listAEQbTJ2 != null) {
                        for (C18992fsq c18992fsq : listAEQbTJ2) {
                            if (C33129mqd.OLrzqt((java.lang.CharSequence) c18992fsq.AhwBna())) {
                                arrayList4.add(c18992fsq.AhwBna());
                            }
                        }
                    }
                    java.util.List<C18978fsc> listOLrzqt2 = c19000fsy.OLrzqt();
                    if (listOLrzqt2 != null) {
                        for (C18978fsc c18978fsc : listOLrzqt2) {
                            if (C33129mqd.OLrzqt((java.lang.CharSequence) c18978fsc.AhwBna())) {
                                arrayList4.add(c18978fsc.AhwBna());
                            }
                        }
                    }
                    java.util.List<C18999fsx> listKWHzl2 = c19000fsy.KWHzl();
                    if (listKWHzl2 != null) {
                        java.util.Iterator<T> it2 = listKWHzl2.iterator();
                        while (it2.hasNext()) {
                            arrayList4.add(((C18999fsx) it2.next()).AEQbTJ());
                        }
                    }
                    java.util.List<C18990fso> listCopydefault2 = c19000fsy.copydefault();
                    if (listCopydefault2 != null) {
                        java.util.Iterator<T> it3 = listCopydefault2.iterator();
                        while (it3.hasNext()) {
                            arrayList4.add(((C18990fso) it3.next()).AEQbTJ());
                        }
                    }
                    arrayList.add(new C18991fsp(C33070mpX.AYXKKw(C13754dXa.FragmentManager.Rlayout), arrayList4));
                }
            }
            djBIcL().OLrzqt(arrayList, new Function0() { // from class: o.fuR
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C19056fuA.djBIcL(this.copydefault);
                }
            });
            rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) this, true, (java.lang.String) null, 2, (java.lang.Object) null);
        } catch (java.lang.Exception e) {
            pUU.copydefault(getTAG(), "error message :" + e.getMessage());
            C6777aVl.Companion.OLrzqt(e, C56424yEw.gEmmrt(C56390yDp.OLrzqt("Fragment", "WalletSearchAllResultFragment"), C56390yDp.OLrzqt(FirebaseAnalytics.Param.METHOD, "mergeShowData")), java.lang.Boolean.TRUE);
        }
    }

    public static final Unit djBIcL(C19056fuA c19056fuA) {
        RecyclerView recyclerView;
        C16629enY c16629enY = c19056fuA.AhwBna;
        if (c16629enY != null && (recyclerView = c16629enY.EZpvd) != null) {
            recyclerView.scrollToPosition(0);
        }
        return Unit.INSTANCE;
    }

    private final void values() {
        djBIcL().register(C18982fsg.class, new C19172fwK(new Function1() { // from class: o.fuS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C19056fuA.OLrzqt(this.OLrzqt, (C18982fsg) obj);
            }
        }, new Function1() { // from class: o.fuU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C19056fuA.KWHzl(this.copydefault, (C18982fsg) obj);
            }
        }, new Function1() { // from class: o.fuX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C19056fuA.AEQbTJ((java.lang.String) obj);
            }
        }, new Function1() { // from class: o.fuV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C19056fuA.copydefault(this.KWHzl, (TagEventProperty) obj);
            }
        }));
        djBIcL().register(C18953fsD.class, new C19176fwO(new Function1() { // from class: o.fuT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C19056fuA.copydefault(this.EZpvd, ((java.lang.Integer) obj).intValue());
            }
        }));
        djBIcL().register(C18994fss.class, new C19175fwN());
        djBIcL().register(C18991fsp.class, new C19171fwJ(new Function0() { // from class: o.fuW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C19056fuA.AYXKKw(this.AEQbTJ);
            }
        }));
        djBIcL().register(C18951fsB.class, new C19236fxV());
        djBIcL().register(C19001fsz.class, new C19241fxa());
        djBIcL().register(C18996fsu.class, new C19185fwX());
        djBIcL().register(C18952fsC.class, new C19170fwI(new Function1() { // from class: o.fuz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C19056fuA.EZpvd(this.AEQbTJ, (C18952fsC) obj);
            }
        }));
        djBIcL().register(C18997fsv.class, new C19180fwS(new Function1() { // from class: o.fuH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C19056fuA.copydefault(this.AEQbTJ, (C18997fsv) obj);
            }
        }));
        djBIcL().register(C18950fsA.class, new C19187fwZ());
        djBIcL().register(C18977fsb.class, new C19204fwq(new Function1() { // from class: o.fuG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C19056fuA.AEQbTJ(this.OLrzqt, (C18977fsb) obj);
            }
        }));
        djBIcL().register(C18983fsh.class, new C19210fww(new Function1() { // from class: o.fuI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C19056fuA.AEQbTJ(this.OLrzqt, (C18983fsh) obj);
            }
        }));
        djBIcL().register(C18998fsw.class, new C19249fxi(new Function0() { // from class: o.fuQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C19056fuA.fetchVPNInfo(this.KWHzl);
            }
        }));
    }

    public static final Unit OLrzqt(C19056fuA c19056fuA, final C18982fsg c18982fsg) {
        Intrinsics.checkNotNullParameter(c18982fsg, "");
        C32866mlf.onEvent$default("GlobalSearch_InputBox_SearchResult_Click", (TrackChannel[]) null, new Function1() { // from class: o.fuN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C19056fuA.KWHzl(c18982fsg, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
        c19056fuA.OLrzqt(c18982fsg);
        c19056fuA.DbNXlk().copydefault(c18982fsg.copydefault().OLrzqt(), c18982fsg.copydefault().fetchVPNInfo());
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(C18982fsg c18982fsg, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "module", "all", false, 4, null);
        EventParamsList.put$default(eventParamsList, "token_ca", c18982fsg.copydefault().fetchVPNInfo(), false, 4, null);
        EventParamsList.put$default(eventParamsList, "token_symbol", c18982fsg.copydefault().isConnected(), false, 4, null);
        EventParamsList.put$default(eventParamsList, "token_network", java.lang.String.valueOf(c18982fsg.copydefault().OLrzqt()), false, 4, null);
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(C19056fuA c19056fuA, C18982fsg c18982fsg) {
        Intrinsics.checkNotNullParameter(c18982fsg, "");
        c19056fuA.KWHzl(c18982fsg.copydefault());
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C55326xho.toast$default(str, (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(C19056fuA c19056fuA, TagEventProperty tagEventProperty) {
        Intrinsics.checkNotNullParameter(tagEventProperty, "");
        android.content.Context context = c19056fuA.getContext();
        if (context == null) {
            return Unit.INSTANCE;
        }
        C18956fsG.EZpvd(tagEventProperty, context);
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(C19056fuA c19056fuA, int i) {
        c19056fuA.isConnected().KWHzl(i);
        return Unit.INSTANCE;
    }

    public static final Unit AYXKKw(C19056fuA c19056fuA) {
        C18995fst value = c19056fuA.isConnected().KWHzl().getValue();
        if (value == null) {
            return Unit.INSTANCE;
        }
        int i = C33129mqd.KWHzl((java.util.Collection) value.AEQbTJ().AYXKKw()) ? 2 : 1;
        if (C33129mqd.KWHzl((java.util.Collection) value.AEQbTJ().OLrzqt()) || value.AEQbTJ().EZpvd().length() > 0) {
            i++;
        }
        if (C33129mqd.KWHzl((java.util.Collection) value.AEQbTJ().KWHzl())) {
            i++;
        }
        c19056fuA.isConnected().KWHzl(i);
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(C19056fuA c19056fuA, final C18952fsC c18952fsC) {
        Intrinsics.checkNotNullParameter(c18952fsC, "");
        if (c18952fsC.AYXKKw() == 0) {
            C32866mlf.onEvent$default("GlobalSearch_InputBox_SearchResult_Click", (TrackChannel[]) null, new Function1() { // from class: o.fuE
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C19056fuA.EZpvd(c18952fsC, (EventParamsList) obj);
                }
            }, 1, (java.lang.Object) null);
        } else {
            C32866mlf.onEvent$default("GlobalSearch_InputBox_SearchResult_Click", (TrackChannel[]) null, new Function1() { // from class: o.fuF
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C19056fuA.copydefault(c18952fsC, (EventParamsList) obj);
                }
            }, 1, (java.lang.Object) null);
        }
        c19056fuA.copydefault(c18952fsC);
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(C18952fsC c18952fsC, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "module", "same_dev", false, 4, null);
        EventParamsList.put$default(eventParamsList, "token_ca", c18952fsC.AEQbTJ(), false, 4, null);
        EventParamsList.put$default(eventParamsList, "token_symbol", c18952fsC.DbNXlk(), false, 4, null);
        EventParamsList.put$default(eventParamsList, "token_network", c18952fsC.OLrzqt(), false, 4, null);
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(C18952fsC c18952fsC, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "module", "other_trendings", false, 4, null);
        EventParamsList.put$default(eventParamsList, "token_ca", c18952fsC.AEQbTJ(), false, 4, null);
        EventParamsList.put$default(eventParamsList, "token_symbol", c18952fsC.DbNXlk(), false, 4, null);
        EventParamsList.put$default(eventParamsList, "token_network", c18952fsC.OLrzqt(), false, 4, null);
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(C19056fuA c19056fuA, C18997fsv c18997fsv) {
        Intrinsics.checkNotNullParameter(c18997fsv, "");
        c19056fuA.AEQbTJ(c18997fsv);
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(C19056fuA c19056fuA, C18977fsb c18977fsb) {
        Intrinsics.checkNotNullParameter(c18977fsb, "");
        c19056fuA.KWHzl(c18977fsb);
        c19056fuA.AEQbTJ(c18977fsb);
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(C19056fuA c19056fuA, C18983fsh c18983fsh) {
        Intrinsics.checkNotNullParameter(c18983fsh, "");
        c19056fuA.OLrzqt(c18983fsh);
        return Unit.INSTANCE;
    }

    public static final Unit fetchVPNInfo(C19056fuA c19056fuA) {
        c19056fuA.fetchVPNInfo();
        return Unit.INSTANCE;
    }

    private final void KWHzl(C18988fsm c18988fsm) {
        TokenBase tokenBase = new TokenBase(C33129mqd.gEmmrt(java.lang.Long.valueOf(c18988fsm.OLrzqt())), c18988fsm.fetchVPNInfo(), c18988fsm.DbNXlk(), c18988fsm.AEQbTJ(), null, c18988fsm.isConnected(), c18988fsm.AkhnZx(), 0, 0, 0, 0, null, null, null, null, null, null, 0, 0, false, null, null, false, false, null, null, null, 0, false, null, null, false, -112, null);
        gKO gko = (gKO) C43251rlk.copydefault(gKO.class);
        androidx.fragment.app.FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        gKO.StateListAnimator.openMemeQuickTransaction$default(gko, childFragmentManager, "wallet_trade", tokenBase, 0, null, null, null, WalletImportError.ERROR_CODE_AA_EXIST, null);
        KWHzl(c18988fsm.fetchVPNInfo(), c18988fsm.OLrzqt(), c18988fsm.AYXKKw() ? java.lang.Boolean.TRUE : null);
    }

    private final void AkhnZx() {
        final C16629enY c16629enY = this.AhwBna;
        if (c16629enY != null) {
            c16629enY.EZpvd.setLayoutManager(new SafeLinearLayoutManager(c16629enY.EZpvd.getContext()));
            c16629enY.EZpvd.setAdapter(djBIcL());
            c16629enY.EZpvd.postDelayed(new java.lang.Runnable() { // from class: o.fuL
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    C19056fuA.OLrzqt(this.KWHzl, c16629enY);
                }
            }, 500L);
        }
    }

    public static final void OLrzqt(C19056fuA c19056fuA, C16629enY c16629enY) {
        RecyclerView recyclerView = c16629enY.EZpvd;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "");
        FragmentActivity activity = c19056fuA.getActivity();
        if (activity == null) {
            return;
        }
        c19056fuA.fetchVPNInfo = C17779fRz.OLrzqt(recyclerView, activity);
    }

    private final void OLrzqt(C18982fsg c18982fsg) {
        valueOf().KWHzl(new TokenSearchHistory(c18982fsg.copydefault().isConnected(), c18982fsg.copydefault().AkhnZx(), c18982fsg.copydefault().OLrzqt(), c18982fsg.copydefault().fetchVPNInfo(), c18982fsg.copydefault().DbNXlk(), c18982fsg.copydefault().AEQbTJ(), C59449zhJ.gEmmrt(c18982fsg.copydefault().fetchVPNInfo(), this.gEmmrt, true), 0L, 128, (DefaultConstructorMarker) null));
        SearchItemNavigationHandler searchItemNavigationHandler = SearchItemNavigationHandler.EZpvd;
        FragmentActivity activity = getActivity();
        if (activity == null) {
            return;
        }
        searchItemNavigationHandler.EZpvd(activity, c18982fsg.copydefault().OLrzqt(), c18982fsg.copydefault().fetchVPNInfo(), c18982fsg.copydefault().isConnected());
        KWHzl(c18982fsg.copydefault().fetchVPNInfo(), c18982fsg.copydefault().OLrzqt(), c18982fsg.copydefault().AYXKKw() ? java.lang.Boolean.FALSE : null);
    }

    public final void copydefault(C18952fsC c18952fsC) {
        valueOf().KWHzl(new TokenSearchHistory(c18952fsC.DbNXlk(), c18952fsC.DbNXlk(), C33129mqd.valueOf(c18952fsC.OLrzqt()), c18952fsC.AEQbTJ(), c18952fsC.djBIcL(), c18952fsC.copydefault(), true, 0L, 128, (DefaultConstructorMarker) null));
        SearchItemNavigationHandler searchItemNavigationHandler = SearchItemNavigationHandler.EZpvd;
        FragmentActivity activity = getActivity();
        if (activity == null) {
            return;
        }
        searchItemNavigationHandler.EZpvd(activity, C33129mqd.valueOf(c18952fsC.OLrzqt()), c18952fsC.AEQbTJ(), c18952fsC.DbNXlk());
        KWHzl(c18952fsC.AEQbTJ(), C33129mqd.valueOf(c18952fsC.OLrzqt()), (java.lang.Boolean) null);
    }

    private final void AEQbTJ(C18997fsv c18997fsv) {
        valueOf().KWHzl(new AddressSearchHistory(c18997fsv.KWHzl(), c18997fsv.OLrzqt(), C59449zhJ.gEmmrt(c18997fsv.KWHzl(), this.gEmmrt, true), 0L, 8, (DefaultConstructorMarker) null));
        SearchItemNavigationHandler searchItemNavigationHandler = SearchItemNavigationHandler.EZpvd;
        FragmentActivity activity = getActivity();
        if (activity == null) {
            return;
        }
        searchItemNavigationHandler.EZpvd(activity, c18997fsv.KWHzl(), c18997fsv.OLrzqt());
        copydefault(c18997fsv.KWHzl());
    }

    public final void KWHzl(final java.lang.String str, final long j, final java.lang.Boolean bool) {
        C32866mlf.onEvent$default("Web3WalletHomepage_SearchInputAndResults_Search_Click", (TrackChannel[]) null, new Function1() { // from class: o.fuP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C19056fuA.AEQbTJ(this.OLrzqt, str, j, bool, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit AEQbTJ(C19056fuA c19056fuA, java.lang.String str, long j, java.lang.Boolean bool, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        AbstractC12782ctV abstractC12782ctV = (AbstractC12782ctV) CollectionsKt___CollectionsKt.firstOrNull(C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null).copydefault());
        java.lang.String strDbNXlk = abstractC12782ctV != null ? abstractC12782ctV.DbNXlk() : null;
        EventParamsList.put$default(eventParamsList, "account_id", strDbNXlk == null ? "" : strDbNXlk, false, 4, null);
        EventParamsList.put$default(eventParamsList, CrashHianalyticsData.TIME, java.lang.String.valueOf(java.lang.System.currentTimeMillis() / ((long) 1000)), false, 4, null);
        EventParamsList.put$default(eventParamsList, "query", c19056fuA.gEmmrt, false, 4, null);
        EventParamsList.put$default(eventParamsList, "clicked_TokenCA", str, false, 4, null);
        EventParamsList.put$default(eventParamsList, "clicked_TokenChainid", java.lang.String.valueOf(j), false, 4, null);
        if (bool != null) {
            EventParamsList.put$default(eventParamsList, "clicked_quickTrade", java.lang.String.valueOf(C11600cUg.OLrzqt(bool.booleanValue())), false, 4, null);
        }
        java.lang.String strAhwBna = c19056fuA.AhwBna();
        eventParamsList.put("source_id", strAhwBna != null ? strAhwBna : "", true);
        return Unit.INSTANCE;
    }

    private final void EZpvd(final java.lang.String str) {
        C32866mlf.onEvent$default("Web3WalletHomepage_SearchInputAndResults_Search_Click", (TrackChannel[]) null, new Function1() { // from class: o.fuO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C19056fuA.OLrzqt(this.EZpvd, str, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit OLrzqt(C19056fuA c19056fuA, java.lang.String str, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        AbstractC12782ctV abstractC12782ctV = (AbstractC12782ctV) CollectionsKt___CollectionsKt.firstOrNull(C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null).copydefault());
        java.lang.String strDbNXlk = abstractC12782ctV != null ? abstractC12782ctV.DbNXlk() : null;
        EventParamsList.put$default(eventParamsList, "account_id", strDbNXlk == null ? "" : strDbNXlk, false, 4, null);
        EventParamsList.put$default(eventParamsList, CrashHianalyticsData.TIME, java.lang.String.valueOf(java.lang.System.currentTimeMillis() / ((long) 1000)), false, 4, null);
        EventParamsList.put$default(eventParamsList, "query", c19056fuA.gEmmrt, false, 4, null);
        EventParamsList.put$default(eventParamsList, "clicked_DAppUrl", str, false, 4, null);
        java.lang.String strAhwBna = c19056fuA.AhwBna();
        eventParamsList.put("source_id", strAhwBna != null ? strAhwBna : "", true);
        return Unit.INSTANCE;
    }

    private final void OLrzqt(final java.lang.String str) {
        C32866mlf.onEvent$default("Web3WalletHomepage_SearchInputAndResults_Search_Click", (TrackChannel[]) null, new Function1() { // from class: o.fuK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C19056fuA.valueOf(this.KWHzl, str, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit valueOf(C19056fuA c19056fuA, java.lang.String str, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        AbstractC12782ctV abstractC12782ctV = (AbstractC12782ctV) CollectionsKt___CollectionsKt.firstOrNull(C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null).copydefault());
        java.lang.String strDbNXlk = abstractC12782ctV != null ? abstractC12782ctV.DbNXlk() : null;
        EventParamsList.put$default(eventParamsList, "account_id", strDbNXlk == null ? "" : strDbNXlk, false, 4, null);
        EventParamsList.put$default(eventParamsList, CrashHianalyticsData.TIME, java.lang.String.valueOf(java.lang.System.currentTimeMillis() / ((long) 1000)), false, 4, null);
        EventParamsList.put$default(eventParamsList, "query", c19056fuA.gEmmrt, false, 4, null);
        EventParamsList.put$default(eventParamsList, "clicked_ExtraInfo", str, false, 4, null);
        java.lang.String strAhwBna = c19056fuA.AhwBna();
        eventParamsList.put("source_id", strAhwBna != null ? strAhwBna : "", true);
        return Unit.INSTANCE;
    }

    public final void copydefault(final java.lang.String str) {
        C32866mlf.onEvent$default("Web3WalletHomepage_SearchInputAndResults_Search_Click", (TrackChannel[]) null, new Function1() { // from class: o.fuM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C19056fuA.EZpvd(this.OLrzqt, str, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit EZpvd(C19056fuA c19056fuA, java.lang.String str, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        AbstractC12782ctV abstractC12782ctV = (AbstractC12782ctV) CollectionsKt___CollectionsKt.firstOrNull(C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null).copydefault());
        java.lang.String strDbNXlk = abstractC12782ctV != null ? abstractC12782ctV.DbNXlk() : null;
        EventParamsList.put$default(eventParamsList, "account_id", strDbNXlk == null ? "" : strDbNXlk, false, 4, null);
        EventParamsList.put$default(eventParamsList, CrashHianalyticsData.TIME, java.lang.String.valueOf(java.lang.System.currentTimeMillis() / ((long) 1000)), false, 4, null);
        EventParamsList.put$default(eventParamsList, "query", c19056fuA.gEmmrt, false, 4, null);
        EventParamsList.put$default(eventParamsList, "clicked_Address", str, false, 4, null);
        java.lang.String strAhwBna = c19056fuA.AhwBna();
        eventParamsList.put("source_id", strAhwBna != null ? strAhwBna : "", true);
        return Unit.INSTANCE;
    }

    private final void fetchVPNInfo() {
        java.util.List<MarketChainBean> listAEQbTJ = DbNXlk().AEQbTJ();
        if (listAEQbTJ != null && !listAEQbTJ.isEmpty()) {
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new WalletSearchAllResultFragment$openChainSelectionBottomSheet$1(this, null), 3, null);
            getChildFragmentManager().setFragmentResultListener("SELECT_NETWORK_REQUEST_KEY", getViewLifecycleOwner(), new FragmentResultListener() { // from class: o.fuJ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // androidx.fragment.app.FragmentResultListener
                public final void onFragmentResult(java.lang.String str, android.os.Bundle bundle) {
                    C19056fuA.EZpvd(this.OLrzqt, str, bundle);
                }
            });
        } else {
            C55326xho.toast$default(C33070mpX.AYXKKw(C13754dXa.FragmentManager.HJWChPQPAeHI), (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
        }
    }

    public static final void EZpvd(C19056fuA c19056fuA, java.lang.String str, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(bundle, "");
        MarketChainBean marketChainBean = (MarketChainBean) bundle.getParcelable("SELECT_NETWORK_RESULT_KEY");
        if (marketChainBean == null) {
            c19056fuA.OLrzqt(new C18998fsw(Long.MIN_VALUE, C33070mpX.AYXKKw(C13754dXa.FragmentManager.setSupportActionBar), ""));
        } else {
            c19056fuA.OLrzqt(new C18998fsw(C33129mqd.valueOf(marketChainBean.getChainId()), marketChainBean.getChainName(), marketChainBean.getChainLogo()));
        }
    }

    private final void OLrzqt(C18998fsw c18998fsw) {
        DbNXlk().AEQbTJ(c18998fsw, this.gEmmrt);
    }

    private final void KWHzl(C18977fsb c18977fsb) {
        valueOf().KWHzl(new DAppSearchHistory(c18977fsb.KWHzl().KWHzl(), c18977fsb.KWHzl().EZpvd(), c18977fsb.KWHzl().AYXKKw(), c18977fsb.KWHzl().copydefault(), 0L, 16, (DefaultConstructorMarker) null));
    }

    private final void AEQbTJ(C18977fsb c18977fsb) {
        InterfaceC18922frZ interfaceC18922frZCopydefault;
        KWHzl(c18977fsb);
        SearchItemNavigationHandler searchItemNavigationHandler = SearchItemNavigationHandler.EZpvd;
        FragmentActivity activity = getActivity();
        if (activity == null || (interfaceC18922frZCopydefault = C18976fsa.copydefault(this)) == null) {
            return;
        }
        searchItemNavigationHandler.copydefault(activity, interfaceC18922frZCopydefault, c18977fsb.KWHzl().AYXKKw(), C33129mqd.gEmmrt(java.lang.Long.valueOf(c18977fsb.KWHzl().KWHzl())), c18977fsb.KWHzl().EZpvd(), c18977fsb.KWHzl().copydefault());
        EZpvd(c18977fsb.KWHzl().AYXKKw());
    }

    private final void OLrzqt(C18983fsh c18983fsh) {
        SearchItemNavigationHandler searchItemNavigationHandler = SearchItemNavigationHandler.EZpvd;
        FragmentActivity activity = getActivity();
        if (activity == null) {
            return;
        }
        java.lang.String strEZpvd = c18983fsh.EZpvd();
        InterfaceC18922frZ interfaceC18922frZCopydefault = C18976fsa.copydefault(this);
        if (interfaceC18922frZCopydefault == null) {
            return;
        }
        searchItemNavigationHandler.AEQbTJ(activity, strEZpvd, interfaceC18922frZCopydefault);
        OLrzqt(c18983fsh.EZpvd());
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        C16629enY c16629enY;
        RecyclerView recyclerView;
        super.onDestroyView();
        RecyclerView.OnScrollListener onScrollListener = this.fetchVPNInfo;
        if (onScrollListener != null && (c16629enY = this.AhwBna) != null && (recyclerView = c16629enY.EZpvd) != null) {
            recyclerView.removeOnScrollListener(onScrollListener);
        }
        this.fetchVPNInfo = null;
        this.AhwBna = null;
    }

    public final java.util.List<C18952fsC> EZpvd(java.util.List<SearchRecommendTokenModel> list) {
        if (list == null) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        for (SearchRecommendTokenModel searchRecommendTokenModel : list) {
            java.util.List<java.lang.Integer> tags = searchRecommendTokenModel.getTags();
            boolean z = false;
            if (tags != null) {
                java.util.Iterator<T> it = tags.iterator();
                while (it.hasNext()) {
                    if (((java.lang.Number) it.next()).intValue() == 13) {
                        z = true;
                    }
                }
            }
            boolean z2 = z;
            java.lang.String tokenLogoUrl = searchRecommendTokenModel.getTokenLogoUrl();
            java.lang.String chainLogoUrl = searchRecommendTokenModel.getChainLogoUrl();
            int strategyType = searchRecommendTokenModel.getStrategyType();
            java.lang.String strategyName = searchRecommendTokenModel.getStrategyName();
            int recRank = searchRecommendTokenModel.getRecRank();
            java.lang.String chainIndex = searchRecommendTokenModel.getChainIndex();
            java.lang.String contractAddress = searchRecommendTokenModel.getContractAddress();
            java.lang.String tokenSymbol = searchRecommendTokenModel.getTokenSymbol();
            java.lang.String tokenName = searchRecommendTokenModel.getTokenName();
            java.lang.String tokenPrice = searchRecommendTokenModel.getTokenPrice();
            java.lang.String tokenPrice24hChange = searchRecommendTokenModel.getTokenPrice24hChange();
            java.lang.String tokenMcp = searchRecommendTokenModel.getTokenMcp();
            java.lang.String sameUserNumber = searchRecommendTokenModel.getSameUserNumber();
            if (sameUserNumber == null) {
                sameUserNumber = "";
            }
            arrayList.add(new C18952fsC(tokenLogoUrl, chainLogoUrl, strategyType, strategyName, recRank, chainIndex, contractAddress, tokenSymbol, tokenName, tokenPrice, tokenPrice24hChange, tokenMcp, sameUserNumber, z2));
        }
        return CollectionsKt___CollectionsKt.AhwBna((java.lang.Iterable) arrayList, this.DbNXlk);
    }
}
