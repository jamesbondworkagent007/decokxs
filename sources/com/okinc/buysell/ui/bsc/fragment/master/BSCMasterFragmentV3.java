package com.okinc.buysell.ui.bsc.fragment.master;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.activity.result.ActivityResultRegistry;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.ColorResources_androidKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.os.BundleKt;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;
import com.google.common.base.Ascii;
import com.okinc.assets.api.model.TransferDetail;
import com.okinc.base.bugreport.DetectionInfoBean;
import com.okinc.business.defi.biz.core.error.WalletImportError;
import com.okinc.buysell.analytics.PaymentsBannerTrackerAttrType;
import com.okinc.buysell.data.BannerPageNames;
import com.okinc.buysell.data.BuyFrequencyOption;
import com.okinc.buysell.ui.bsc.common.BSCTabIndex;
import com.okinc.buysell.ui.bsc.fragment.master.BSCMasterFragmentV3;
import com.okinc.buysell.view.LegacyBuySellHeader;
import com.okinc.okpaymentapi.data.remote.model.management.Channel;
import com.okinc.okpaymentapi.data.remote.model.management.PaymentMethod;
import com.okinc.okrisk.OKRiskLibrarySource;
import com.okinc.okx.paymentapi.presentation.BSCLevel;
import com.okinc.okx.paymentapi.service.BuySellConvertParameters;
import com.okinc.okx.paymentapi.service.OKPaymentSource;
import com.okinc.okx.paymentapi.service.SupportBanner;
import com.okinc.okx.paymentapi.service.TargetTab;
import com.okinc.okx.paymentapi.service.VerificationStatus;
import com.okinc.okx.paymentapi.tracking.PaymentsReporterProperty;
import com.okinc.okx.paymentapi.uv.LandingPageType;
import com.okinc.okx.paymentapi.uv.PreVerifiedResult;
import com.okinc.okx.paymentapi.uv.UnifiedVerificationStatus;
import com.okinc.okx.paymentapi.uv.UnifiedVerificationType;
import com.okinc.rxutils.RxBus;
import com.okinc.tradeapi.bean.SourceResp;
import com.okinc.web.WebActivity;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Job;
import o.AbstractC31494lvA;
import o.AbstractC31520lva;
import o.AbstractC43238rlX;
import o.AbstractC58185ywX;
import o.C29848lCo;
import o.C30342lUv;
import o.C31349lsO;
import o.C31351lsQ;
import o.C32989mnw;
import o.C33070mpX;
import o.C43251rlk;
import o.C43453rpa;
import o.C44103sDl;
import o.C46876tfT;
import o.C46881tfY;
import o.C46979thQ;
import o.C47241tmN;
import o.C47313tng;
import o.C52761wXj;
import o.C52812wZg;
import o.C56390yDp;
import o.C56524yIo;
import o.InterfaceC31422lti;
import o.InterfaceC31670lzr;
import o.InterfaceC43294rma;
import o.InterfaceC46982thT;
import o.InterfaceC47251tmX;
import o.InterfaceC47278tmy;
import o.InterfaceC54581xNr;
import o.InterfaceC56387yDm;
import o.InterfaceC56388yDn;
import o.InterfaceC56514yIe;
import o.InterfaceC58217yxC;
import o.InterfaceC58227yxM;
import o.YY;
import o.Zg;
import o.Zh;
import o.lBF;
import o.lEN;
import o.lGL;
import o.lGM;
import o.lIB;
import o.lzR;
import o.lzT;
import o.mHA;
import o.pUP;
import o.pUU;
import o.yBK;
import o.yCM;
import o.yDY;
import o.yHO;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
public final class BSCMasterFragmentV3 extends lGM<AbstractC31520lva> {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int djBIcL = 8;
    public List<? extends androidx.fragment.app.Fragment> AYXKKw;
    public boolean AkhnZx;
    public C52812wZg AuCTel;
    public boolean DbNXlk;
    public boolean ejfBZ;
    public final Activity fARcdN;
    public boolean fIwbmz;
    public Job fJNWhG;
    public ActionBar fetchVPNInfo;
    public boolean gEmmrt;
    public TabLayoutMediator getFieldNames;
    public MutableLiveData<SourceResp<InterfaceC54581xNr>> getNewProxyInstance;
    public final InterfaceC56387yDm hDKMBd;
    public boolean isConnected;
    public final Observer<SourceResp<InterfaceC54581xNr>> iwGUEr;

    @yCM
    public InterfaceC47278tmy userManager;
    public TabLayout.OnTabSelectedListener uzCIH;
    public boolean values;

    public static final /* synthetic */ class Application implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.OLrzqt = function1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean equals(Object obj) {
            if ((obj instanceof Observer) && (obj instanceof InterfaceC56514yIe)) {
                return Intrinsics.EZpvd(getFunctionDelegate(), ((InterfaceC56514yIe) obj).getFunctionDelegate());
            }
            return false;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC56514yIe
        public final InterfaceC56388yDn<?> getFunctionDelegate() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.OLrzqt.invoke(obj);
        }
    }

    /* JADX INFO: loaded from: classes18.dex */
    public final /* synthetic */ class StateListAnimator {
        public static final /* synthetic */ int[] KWHzl;
        public static final /* synthetic */ int[] OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[BSCLevel.values().length];
            try {
                iArr[BSCLevel.LEVEL1.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BSCLevel.LEVEL2.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            KWHzl = iArr;
            int[] iArr2 = new int[TargetTab.values().length];
            try {
                iArr2[TargetTab.BUY.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[TargetTab.SELL.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[TargetTab.CONVERT.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            OLrzqt = iArr2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final void EZpvd(SourceResp sourceResp) {
        Intrinsics.checkNotNullParameter(sourceResp, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void AEQbTJ(boolean z) {
        this.DbNXlk = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.lzN
    public boolean AhwBna() {
        return this.DbNXlk;
    }

    @Override // o.lzN
    public boolean values() {
        return false;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ AbstractC31520lva KWHzl(BSCMasterFragmentV3 bSCMasterFragmentV3) {
        return (AbstractC31520lva) bSCMasterFragmentV3.KWHzl();
    }

    public BSCMasterFragmentV3() {
        super(C31351lsQ.ActionBar.QKVWgx);
        this.gEmmrt = true;
        this.isConnected = true;
        final Function0 function0 = null;
        this.hDKMBd = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(BSCMasterViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.buysell.ui.bsc.fragment.master.BSCMasterFragmentV3$special$$inlined$activityViewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.buysell.ui.bsc.fragment.master.BSCMasterFragmentV3$special$$inlined$activityViewModels$default$2
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
                Function0 function02 = function0;
                if (function02 != null && (creationExtras = (CreationExtras) function02.invoke()) != null) {
                    return creationExtras;
                }
                CreationExtras defaultViewModelCreationExtras = this.requireActivity().getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "");
                return defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.buysell.ui.bsc.fragment.master.BSCMasterFragmentV3$special$$inlined$activityViewModels$default$3
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
        this.iwGUEr = new Observer() { // from class: o.lGq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.lifecycle.Observer
            public final void onChanged(java.lang.Object obj) {
                BSCMasterFragmentV3.EZpvd((SourceResp) obj);
            }
        };
        this.AYXKKw = yDY.AhwBna();
        this.fARcdN = new Activity();
    }

    public final BSCMasterViewModel fetchVPNInfo() {
        return (BSCMasterViewModel) this.hDKMBd.getValue();
    }

    /* JADX DEBUG: Possible override for method o.lGM.isConnected()V */
    public final InterfaceC47278tmy isConnected() {
        InterfaceC47278tmy interfaceC47278tmy = this.userManager;
        if (interfaceC47278tmy != null) {
            return interfaceC47278tmy;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    public static final class Fragment implements TabLayout.OnTabSelectedListener {
        private static final byte[] $$c = {44, -69, -1, 85};
        private static final int $$d = 3;
        private static int $10 = 0;
        private static int $11 = 1;
        private static final byte[] $$a = {88, 37, -69, 48, 4, -7, 1, -29, -7, -7, -13, Ascii.FF, -17, 0, -11, Ascii.RS, 0, -17, -5};
        private static final int $$b = 172;
        private static int valueOf = 0;
        private static int djBIcL = 1;
        private static char[] copydefault = {11780, 11803, 11822, 11820, 11795, 11790, 11786, 11787, 11789, 11837, 11833, 11807, 11799, 11781, 11804, 11798, 11825, 11824, 11800, 11805, 11802, 11794, 11792, 11827, 11788, 11783, 11801, 11782, 11821, 11818, 11797, 11844, 11793, 11831, 11870, 11826};
        private static char KWHzl = 7138;
        private static char EZpvd = 54027;
        private static char OLrzqt = 42152;
        private static char gEmmrt = 54762;
        private static char AhwBna = 37438;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002b). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static String $$e(short s, short s2, short s3) {
            int i;
            int i2;
            int i3 = 3 - (s3 * 2);
            byte[] bArr = $$c;
            int i4 = s2 + 65;
            int i5 = (s * 3) + 1;
            byte[] bArr2 = new byte[i5];
            if (bArr == null) {
                int i6 = i3;
                i2 = 0;
                int i7 = i5;
                i4 = (-i4) + i7;
                i3 = i6;
                i = i2;
                int i8 = i3 + 1;
                i2 = i + 1;
                bArr2[i] = (byte) i4;
                if (i2 == i5) {
                    return new String(bArr2, 0);
                }
                int i9 = bArr[i8];
                i7 = i4;
                i4 = i9;
                i6 = i8;
                i4 = (-i4) + i7;
                i3 = i6;
                i = i2;
                int i82 = i3 + 1;
                i2 = i + 1;
                bArr2[i] = (byte) i4;
                if (i2 == i5) {
                }
            } else {
                i = 0;
                int i822 = i3 + 1;
                i2 = i + 1;
                bArr2[i] = (byte) i4;
                if (i2 == i5) {
                }
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002d). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static void c(short s, byte b, int i, Object[] objArr) {
            int i2;
            int i3;
            int i4 = (b * 10) + 4;
            int i5 = 99 - (i * 20);
            int i6 = 11 - (s * 5);
            byte[] bArr = $$a;
            byte[] bArr2 = new byte[i6];
            if (bArr == null) {
                int i7 = i6;
                int i8 = i4;
                i3 = 0;
                int i9 = i7 + i4 + 8;
                int i10 = i8 + 1;
                i2 = i3;
                i5 = i9;
                i4 = i10;
                i3 = i2 + 1;
                bArr2[i2] = (byte) i5;
                if (i3 == i6) {
                    objArr[0] = new String(bArr2, 0);
                    return;
                }
                int i11 = i5;
                i8 = i4;
                i4 = bArr[i4];
                i7 = i11;
                int i92 = i7 + i4 + 8;
                int i102 = i8 + 1;
                i2 = i3;
                i5 = i92;
                i4 = i102;
                i3 = i2 + 1;
                bArr2[i2] = (byte) i5;
                if (i3 == i6) {
                }
            } else {
                i2 = 0;
                i3 = i2 + 1;
                bArr2[i2] = (byte) i5;
                if (i3 == i6) {
                }
            }
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabReselected(TabLayout.Tab tab) {
            int i = 2 % 2;
            int i2 = djBIcL + 83;
            valueOf = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(tab, "");
            if (i3 != 0) {
                int i4 = 18 / 0;
            }
            int i5 = valueOf + WalletImportError.ERROR_CODE_HARDWARE_ACCOUNT_EXIST;
            djBIcL = i5 % 128;
            int i6 = i5 % 2;
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabUnselected(TabLayout.Tab tab) {
            int i = 2 % 2;
            int i2 = djBIcL + 73;
            valueOf = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(tab, "");
            if (i3 != 0) {
                int i4 = 58 / 0;
            }
        }

        /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
        private static void b(char[] cArr, int i, Object[] objArr) throws Throwable {
            int i2 = 2 % 2;
            Zh zh = new Zh();
            char[] cArr2 = new char[cArr.length];
            zh.EZpvd = 0;
            char[] cArr3 = new char[2];
            while (zh.EZpvd < cArr.length) {
                cArr3[0] = cArr[zh.EZpvd];
                cArr3[1] = cArr[zh.EZpvd + 1];
                int i3 = $11 + 45;
                $10 = i3 % 128;
                int i4 = i3 % 2;
                int i5 = 58224;
                for (int i6 = 0; i6 < 16; i6++) {
                    int i7 = $10 + 33;
                    $11 = i7 % 128;
                    int i8 = i7 % 2;
                    char c = cArr3[1];
                    char c2 = cArr3[0];
                    try {
                        Object[] objArr2 = {Integer.valueOf(c), Integer.valueOf((c2 + i5) ^ ((c2 << 4) + ((char) (((long) gEmmrt) ^ 6538634990023091910L)))), Integer.valueOf(c2 >>> 5), Integer.valueOf(AhwBna)};
                        Object objEZpvd = YY.EZpvd(-2045992360);
                        if (objEZpvd == null) {
                            int i9 = $$d;
                            byte b = (byte) (i9 - 3);
                            objEZpvd = YY.EZpvd(501, 5, (char) 0, -2111017180, false, $$e(b, (byte) (b | 53), (byte) (i9 - 3)), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                        }
                        char cCharValue = ((Character) ((Method) objEZpvd).invoke(null, objArr2)).charValue();
                        cArr3[1] = cCharValue;
                        Object[] objArr3 = {Integer.valueOf(cArr3[0]), Integer.valueOf((cCharValue + i5) ^ ((cCharValue << 4) + ((char) (((long) EZpvd) ^ 6538634990023091910L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(OLrzqt)};
                        Object objEZpvd2 = YY.EZpvd(-2045992360);
                        if (objEZpvd2 == null) {
                            int i10 = $$d;
                            byte b2 = (byte) (i10 - 3);
                            objEZpvd2 = YY.EZpvd(501, 5, (char) 0, -2111017180, false, $$e(b2, (byte) (b2 | 53), (byte) (i10 - 3)), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                        }
                        cArr3[0] = ((Character) ((Method) objEZpvd2).invoke(null, objArr3)).charValue();
                        i5 -= 40503;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                cArr2[zh.EZpvd] = cArr3[0];
                cArr2[zh.EZpvd + 1] = cArr3[1];
                Object[] objArr4 = {zh, zh};
                Object objEZpvd3 = YY.EZpvd(-549847163);
                if (objEZpvd3 == null) {
                    int i11 = $$d;
                    byte b3 = (byte) (i11 - 3);
                    objEZpvd3 = YY.EZpvd(615, 5, (char) 1207, -619105543, false, $$e(b3, (byte) (b3 | 54), (byte) (i11 - 3)), new Class[]{Object.class, Object.class});
                }
                ((Method) objEZpvd3).invoke(null, objArr4);
            }
            objArr[0] = new String(cArr2, 0, i);
        }

        /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [273=5] */
        /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
        private static void a(int i, char[] cArr, byte b, Object[] objArr) throws Throwable {
            int i2;
            Object obj;
            int length;
            char[] cArr2;
            int i3;
            int i4 = 2 % 2;
            Zg zg = new Zg();
            char[] cArr3 = copydefault;
            int i5 = 555755035;
            Object obj2 = null;
            if (cArr3 != null) {
                int i6 = $10 + 21;
                $11 = i6 % 128;
                if (i6 % 2 == 0) {
                    length = cArr3.length;
                    cArr2 = new char[length];
                    i3 = 1;
                } else {
                    length = cArr3.length;
                    cArr2 = new char[length];
                    i3 = 0;
                }
                while (i3 < length) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr3[i3])};
                        Object objEZpvd = YY.EZpvd(i5);
                        if (objEZpvd == null) {
                            int i7 = $$d;
                            byte b2 = (byte) (i7 - 3);
                            objEZpvd = YY.EZpvd(117, 4, (char) 13956, 620817255, false, $$e(b2, (byte) (b2 | 55), (byte) (i7 - 3)), new Class[]{Integer.TYPE});
                        }
                        cArr2[i3] = ((Character) ((Method) objEZpvd).invoke(null, objArr2)).charValue();
                        i3++;
                        i5 = 555755035;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                cArr3 = cArr2;
            }
            try {
                Object[] objArr3 = {Integer.valueOf(KWHzl)};
                Object objEZpvd2 = YY.EZpvd(555755035);
                if (objEZpvd2 == null) {
                    int i8 = $$d;
                    byte b3 = (byte) (i8 - 3);
                    objEZpvd2 = YY.EZpvd(117, 4, (char) 13956, 620817255, false, $$e(b3, (byte) (b3 | 55), (byte) (i8 - 3)), new Class[]{Integer.TYPE});
                }
                char cCharValue = ((Character) ((Method) objEZpvd2).invoke(null, objArr3)).charValue();
                char[] cArr4 = new char[i];
                if (i % 2 != 0) {
                    i2 = i - 1;
                    cArr4[i2] = (char) (cArr[i2] - b);
                } else {
                    i2 = i;
                }
                if (i2 > 1) {
                    zg.KWHzl = 0;
                    while (zg.KWHzl < i2) {
                        int i9 = $11 + 75;
                        $10 = i9 % 128;
                        int i10 = i9 % 2;
                        zg.AEQbTJ = cArr[zg.KWHzl];
                        zg.OLrzqt = cArr[zg.KWHzl + 1];
                        if (zg.AEQbTJ == zg.OLrzqt) {
                            int i11 = $11 + 83;
                            $10 = i11 % 128;
                            if (i11 % 2 != 0) {
                                cArr4[zg.KWHzl] = (char) (zg.AEQbTJ % b);
                                cArr4[zg.KWHzl % 1] = (char) (zg.OLrzqt >>> b);
                            } else {
                                cArr4[zg.KWHzl] = (char) (zg.AEQbTJ - b);
                                cArr4[zg.KWHzl + 1] = (char) (zg.OLrzqt - b);
                            }
                            obj = obj2;
                        } else {
                            Object[] objArr4 = {zg, zg, Integer.valueOf(cCharValue), zg, zg, Integer.valueOf(cCharValue), zg, zg, Integer.valueOf(cCharValue), zg, zg, Integer.valueOf(cCharValue), zg};
                            Object objEZpvd3 = YY.EZpvd(-526958001);
                            if (objEZpvd3 == null) {
                                int i12 = $$d;
                                byte b4 = (byte) (i12 - 3);
                                byte b5 = (byte) i12;
                                objEZpvd3 = YY.EZpvd(491, 5, (char) 30951, -457732301, false, $$e(b4, b5, (byte) (b5 - 3)), new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                            }
                            if (((Integer) ((Method) objEZpvd3).invoke(null, objArr4)).intValue() == zg.djBIcL) {
                                Object[] objArr5 = {zg, zg, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), zg, zg, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), zg, Integer.valueOf(cCharValue), zg};
                                Object objEZpvd4 = YY.EZpvd(1348337226);
                                if (objEZpvd4 == null) {
                                    byte b6 = (byte) ($$d - 3);
                                    byte b7 = b6;
                                    objEZpvd4 = YY.EZpvd(221, 5, (char) 3937, 1417491254, false, $$e(b6, b7, b7), new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                                }
                                obj = null;
                                int iIntValue = ((Integer) ((Method) objEZpvd4).invoke(null, objArr5)).intValue();
                                int i13 = (zg.EZpvd * cCharValue) + zg.djBIcL;
                                cArr4[zg.KWHzl] = cArr3[iIntValue];
                                cArr4[zg.KWHzl + 1] = cArr3[i13];
                            } else {
                                obj = null;
                                if (zg.copydefault == zg.EZpvd) {
                                    zg.AYXKKw = ((zg.AYXKKw + cCharValue) - 1) % cCharValue;
                                    zg.djBIcL = ((zg.djBIcL + cCharValue) - 1) % cCharValue;
                                    int i14 = (zg.copydefault * cCharValue) + zg.AYXKKw;
                                    int i15 = (zg.EZpvd * cCharValue) + zg.djBIcL;
                                    cArr4[zg.KWHzl] = cArr3[i14];
                                    cArr4[zg.KWHzl + 1] = cArr3[i15];
                                } else {
                                    int i16 = (zg.copydefault * cCharValue) + zg.djBIcL;
                                    int i17 = (zg.EZpvd * cCharValue) + zg.AYXKKw;
                                    cArr4[zg.KWHzl] = cArr3[i16];
                                    cArr4[zg.KWHzl + 1] = cArr3[i17];
                                }
                            }
                        }
                        zg.KWHzl += 2;
                        obj2 = obj;
                    }
                }
                for (int i18 = 0; i18 < i; i18++) {
                    int i19 = $11 + 57;
                    $10 = i19 % 128;
                    int i20 = i19 % 2;
                    cArr4[i18] = (char) (cArr4[i18] ^ 13722);
                }
                objArr[0] = new String(cArr4);
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 == null) {
                    throw th2;
                }
                throw cause2;
            }
        }

        public Fragment() {
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabSelected(TabLayout.Tab tab) {
            int i = 2 % 2;
            int i2 = valueOf + 33;
            djBIcL = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(tab, "");
            BSCMasterFragmentV3.KWHzl(BSCMasterFragmentV3.this).fARcdN.setCurrentItem(tab.getPosition(), false);
            int i4 = valueOf + 121;
            djBIcL = i4 % 128;
            int i5 = i4 % 2;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
        public static void OLrzqt(long j, long j2) throws Throwable {
            long j3;
            Object obj;
            Object objNewInstance;
            String str;
            int i = 2 % 2;
            int i2 = djBIcL + 61;
            valueOf = i2 % 128;
            if (i2 % 2 != 0) {
                j3 = j ^ (j2 >> 119);
                Object[] objArr = new Object[1];
                a(117, new char[]{'\b', '!', 5, 0, '\n', 23, 14, 30, 13937}, (byte) 74, objArr);
                obj = C44103sDl.class.getField((String) objArr[0]).get(null);
            } else {
                j3 = j ^ (j2 << 32);
                Object[] objArr2 = new Object[1];
                a(9, new char[]{'\b', '!', 5, 0, '\n', 23, 14, 30, 13937}, (byte) 125, objArr2);
                obj = C44103sDl.class.getField((String) objArr2[0]).get(null);
            }
            int i3 = valueOf + 87;
            djBIcL = i3 % 128;
            try {
                if (i3 % 2 == 0) {
                    Constructor declaredConstructor = StringBuilder.class.getDeclaredConstructor(null);
                    declaredConstructor.setAccessible(false);
                    objNewInstance = declaredConstructor.newInstance(null);
                    Object[] objArr3 = new Object[1];
                    a(1, new char[]{11, '\b', 6, 29, 21, 2, 2, 0, 30, 26, '\n', 30, 21, '\r', 7, 25, '#', 18, 2, 5, 30, 26, 26, 29, 23, 7, 13812, 13812, 16, 18, 27, 24, '\n', 5, 0, 2, 27, 6, '\t', 23, 20, 15, 7, 23, 31, ' '}, (byte) 1, objArr3);
                    str = (String) objArr3[0];
                } else {
                    Constructor declaredConstructor2 = StringBuilder.class.getDeclaredConstructor(null);
                    declaredConstructor2.setAccessible(true);
                    objNewInstance = declaredConstructor2.newInstance(null);
                    Object[] objArr4 = new Object[1];
                    a(46, new char[]{11, '\b', 6, 29, 21, 2, 2, 0, 30, 26, '\n', 30, 21, '\r', 7, 25, '#', 18, 2, 5, 30, 26, 26, 29, 23, 7, 13812, 13812, 16, 18, 27, 24, '\n', 5, 0, 2, 27, 6, '\t', 23, 20, 15, 7, 23, 31, ' '}, (byte) 0, objArr4);
                    str = (String) objArr4[0];
                }
                Object[] objArr5 = new Object[1];
                b(new char[]{46432, 62247, 60924, 46701, 64896, 34513}, 6, objArr5);
                Method method = StringBuilder.class.getMethod((String) objArr5[0], String.class);
                method.setAccessible(true);
                method.invoke(objNewInstance, str);
                Object[] objArr6 = {Long.valueOf(j3)};
                Object[] objArr7 = new Object[1];
                b(new char[]{46432, 62247, 60924, 46701, 64896, 34513}, 6, objArr7);
                Method method2 = StringBuilder.class.getMethod((String) objArr7[0], Long.TYPE);
                method2.setAccessible(true);
                method2.invoke(objNewInstance, objArr6);
                Object[] objArr8 = new Object[1];
                b(new char[]{9386, 16858, 30160, 20916, 36992, 56399, 13254, 15288, 12763, 49639, 43745, 15452, 21894, 53035, 54644, 48826, 46727, 45721, 43793, 38443, 18341, 36505}, 22, objArr8);
                String str2 = (String) objArr8[0];
                int i4 = valueOf + 1;
                djBIcL = i4 % 128;
                int i5 = i4 % 2;
                Object[] objArr9 = new Object[1];
                b(new char[]{27065, 39398, 2073, 18438, 57160, 40627, 30110, 35319}, 8, objArr9);
                Method method3 = StringBuilder.class.getMethod((String) objArr9[0], null);
                method3.setAccessible(true);
                Object objInvoke = method3.invoke(objNewInstance, null);
                Object[] objArr10 = new Object[1];
                b(new char[]{43639, 51732, 38683, 29785}, 3, objArr10);
                Object[] objArr11 = {objInvoke, (String) objArr10[0]};
                Object[] objArr12 = new Object[1];
                a(21, new char[]{21, '\r', 7, 25, '#', '\f', 30, '\b', '\r', 11, 13926, 13926, 5, '\b', 29, 6, 5, 2, 7, 0, 13912}, (byte) 112, objArr12);
                Method method4 = Intrinsics.class.getMethod((String) objArr12[0], Object.class, String.class);
                method4.setAccessible(true);
                method4.invoke(null, objArr11);
                if (!pUU.class.getField("AEQbTJ").getBoolean(null)) {
                    Object[] objArr13 = new Object[1];
                    a(23, new char[]{'\f', '\"', 30, '!', 28, ' ', 14, 6, 4, 28, 30, '\b', 30, 16, 18, 16, '\f', 18, '\t', 23, 18, 6, 13908}, (byte) 85, objArr13);
                    Object[] objArr14 = {((String) objArr13[0]).toString()};
                    Constructor declaredConstructor3 = IllegalStateException.class.getDeclaredConstructor(String.class);
                    declaredConstructor3.setAccessible(true);
                    throw ((Throwable) declaredConstructor3.newInstance(objArr14));
                }
                Object obj2 = pUU.class.getField("copydefault").get(null);
                Method method5 = Intrinsics.class.getMethod("copydefault", Object.class);
                method5.setAccessible(true);
                method5.invoke(null, obj2);
                Object[] objArr15 = {str2, objInvoke};
                Method method6 = pUP.class.getMethod("copydefault", String.class, String.class);
                method6.setAccessible(true);
                method6.invoke(obj2, objArr15);
                int i6 = djBIcL + 37;
                valueOf = i6 % 128;
                int i7 = i6 % 2;
                byte[] bArr = $$a;
                byte b = bArr[13];
                byte b2 = b;
                Object[] objArr16 = new Object[1];
                c(b, b2, b2, objArr16);
                Method method7 = C44103sDl.ActionBar.class.getMethod((String) objArr16[0], null);
                method7.setAccessible(true);
                Object objInvoke2 = method7.invoke(obj, null);
                Object[] objArr17 = new Object[1];
                b(new char[]{53990, 45968, 5133, 15977, 20778, 61057, 45089, 53011, 37147, 50838, 46727, 45721, 34970, 43636, 30110, 35319}, 16, objArr17);
                DetectionInfoBean.class.getField((String) objArr17[0]).setBoolean(objInvoke2, true);
                int i8 = djBIcL + 15;
                valueOf = i8 % 128;
                if (i8 % 2 != 0) {
                    byte b3 = bArr[13];
                    byte b4 = b3;
                    Object[] objArr18 = new Object[1];
                    c(b3, b4, b4, objArr18);
                    Method method8 = C44103sDl.ActionBar.class.getMethod((String) objArr18[0], null);
                    method8.setAccessible(true);
                    Object objInvoke3 = method8.invoke(obj, null);
                    Long lValueOf = Long.valueOf(j3);
                    Object[] objArr19 = new Object[1];
                    a(74, new char[]{19, 2, '\r', '\b', 27, ' ', 23, 19, 13915}, (byte) 59, objArr19);
                    DetectionInfoBean.class.getField((String) objArr19[0]).set(objInvoke3, lValueOf);
                } else {
                    byte b5 = bArr[13];
                    byte b6 = b5;
                    Object[] objArr20 = new Object[1];
                    c(b5, b6, b6, objArr20);
                    Method method9 = C44103sDl.ActionBar.class.getMethod((String) objArr20[0], null);
                    method9.setAccessible(true);
                    Object objInvoke4 = method9.invoke(obj, null);
                    Long lValueOf2 = Long.valueOf(j3);
                    Object[] objArr21 = new Object[1];
                    a(9, new char[]{19, 2, '\r', '\b', 27, ' ', 23, 19, 13915}, (byte) 102, objArr21);
                    DetectionInfoBean.class.getField((String) objArr21[0]).set(objInvoke4, lValueOf2);
                }
                byte b7 = bArr[6];
                byte b8 = b7;
                Object[] objArr22 = new Object[1];
                c(b7, b8, b8, objArr22);
                Method method10 = C44103sDl.ActionBar.class.getMethod((String) objArr22[0], null);
                method10.setAccessible(true);
                method10.invoke(obj, null);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
    }

    @Override // o.lzN
    public lzT OLrzqt() {
        return fetchVPNInfo();
    }

    @Override // o.lzN
    public void djBIcL() {
        fetchVPNInfo().EZpvd(BannerPageNames.BSC.getPageName());
        AEQbTJ(fetchVPNInfo().fARcdN() == BSCLevel.LEVEL2 || (fetchVPNInfo().fARcdN() == BSCLevel.LEVEL1 && this.gEmmrt));
        OLrzqt(getArguments());
        getFieldNames();
        if (this.gEmmrt) {
            fetchVPNInfo().DTwDnp();
            if (BuyFrequencyOption.Companion.OLrzqt(fetchVPNInfo().zLjUOn())) {
                fetchVPNInfo().ORxRYg();
            }
        }
    }

    public final void getFieldNames() {
        MutableLiveData<SourceResp<InterfaceC54581xNr>> mutableLiveData = new MutableLiveData<>();
        mutableLiveData.observeForever(this.iwGUEr);
        this.getNewProxyInstance = mutableLiveData;
    }

    @Override // o.lzN, o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        this.AkhnZx = false;
        AkhnZx();
    }

    @Override // o.lzN, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        MutableLiveData<SourceResp<InterfaceC54581xNr>> mutableLiveData = this.getNewProxyInstance;
        if (mutableLiveData != null) {
            mutableLiveData.removeObserver(this.iwGUEr);
        }
        this.getNewProxyInstance = null;
        valueOf().dispose();
    }

    @Override // o.lzN
    public void AYXKKw() {
        if (fetchVPNInfo().fARcdN() == BSCLevel.LEVEL2) {
            AuCTel();
            getNewProxyInstance();
        }
        hDKMBd();
        ejfBZ();
    }

    @Override // o.lzN
    public void AEQbTJ(@NotNull List<SupportBanner> list, int i) {
        Intrinsics.checkNotNullParameter(list, "");
        AuCTel();
        super.AEQbTJ(list, C52761wXj.Activity.copydefault);
    }

    @Override // o.lzN
    public void gEmmrt() {
        AuCTel();
        super.gEmmrt();
    }

    @Override // o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        uzCIH();
    }

    public final void uzCIH() {
        InterfaceC46982thT.TaskDescription.profile$default(C46979thQ.copydefault.OLrzqt(), OKRiskLibrarySource.BSC_SCREEN, null, null, null, 14, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractC32996moC, o.InterfaceC33075mpc
    public void showLoading() {
        ((AbstractC31520lva) KWHzl()).isConnected.setVisibility(0);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractC32996moC, o.InterfaceC33075mpc
    public void dismissLoading() {
        ((AbstractC31520lva) KWHzl()).isConnected.setVisibility(8);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v8, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r1v4, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.lzN, androidx.fragment.app.Fragment
    public void onDestroyView() {
        valueOf().OLrzqt();
        if (((AbstractC31520lva) KWHzl()).fARcdN.getAdapter() != null) {
            ((AbstractC31520lva) KWHzl()).fARcdN.unregisterOnPageChangeCallback(this.fARcdN);
        }
        TabLayoutMediator tabLayoutMediator = this.getFieldNames;
        if (tabLayoutMediator != null) {
            tabLayoutMediator.detach();
        }
        this.getFieldNames = null;
        TabLayout.OnTabSelectedListener onTabSelectedListener = this.uzCIH;
        if (onTabSelectedListener != null) {
            ((AbstractC31520lva) KWHzl()).fIwbmz.removeOnTabSelectedListener(onTabSelectedListener);
        }
        this.uzCIH = null;
        ((AbstractC31520lva) KWHzl()).fIwbmz.clearOnTabSelectedListeners();
        ((AbstractC31520lva) KWHzl()).fARcdN.setAdapter(null);
        this.fetchVPNInfo = null;
        this.AYXKKw = yDY.AhwBna();
        super.onDestroyView();
    }

    public static final class Activity extends ViewPager2.OnPageChangeCallback {
        public Activity() {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageSelected(int i) {
            String str;
            Channel first;
            super.onPageSelected(i);
            Context context = BSCMasterFragmentV3.this.getContext();
            Object systemService = context != null ? context.getSystemService("input_method") : null;
            InputMethodManager inputMethodManager = systemService instanceof InputMethodManager ? (InputMethodManager) systemService : null;
            boolean z = false;
            if (inputMethodManager != null) {
                inputMethodManager.hideSoftInputFromWindow(BSCMasterFragmentV3.KWHzl(BSCMasterFragmentV3.this).fARcdN.getWindowToken(), 0);
            }
            BSCTabIndex bSCTabIndex = BSCTabIndex.BUY;
            if (i == bSCTabIndex.getIndex()) {
                BSCMasterFragmentV3.this.fetchVPNInfo().AEQbTJ(bSCTabIndex);
                str = "buy";
            } else {
                BSCTabIndex bSCTabIndex2 = BSCTabIndex.SELL;
                if (i == bSCTabIndex2.getIndex()) {
                    BSCMasterFragmentV3.this.fetchVPNInfo().AEQbTJ(bSCTabIndex2);
                    str = "sell";
                } else {
                    BSCTabIndex bSCTabIndex3 = BSCTabIndex.CONVERT;
                    if (i == bSCTabIndex3.getIndex()) {
                        BSCMasterFragmentV3.this.fetchVPNInfo().AEQbTJ(bSCTabIndex3);
                        str = "convert";
                    } else {
                        BSCMasterFragmentV3.this.fetchVPNInfo().KWHzl(bSCTabIndex);
                        throw new IllegalStateException("Invalid position: " + i);
                    }
                }
            }
            BSCMasterFragmentV3 bSCMasterFragmentV3 = BSCMasterFragmentV3.this;
            if (bSCMasterFragmentV3.isConnected) {
                bSCMasterFragmentV3.isConnected = false;
            } else {
                bSCMasterFragmentV3.fetchVPNInfo().OLrzqt(str);
            }
            BuySellConvertParameters fieldNames = BSCMasterFragmentV3.this.fetchVPNInfo().getFieldNames();
            if (fieldNames != null && fieldNames.fJNWhG() && BSCMasterFragmentV3.this.fetchVPNInfo().fARcdN() == BSCLevel.LEVEL2) {
                BSCMasterFragmentV3 bSCMasterFragmentV32 = BSCMasterFragmentV3.this;
                bSCMasterFragmentV32.OLrzqt(bSCMasterFragmentV32.fetchVPNInfo().AkhnZx().getIndex());
            }
            Pair<Channel, PaymentMethod> value = BSCMasterFragmentV3.this.fetchVPNInfo().wlaJM().getValue();
            if (value == null || (first = value.getFirst()) == null) {
                return;
            }
            BSCMasterFragmentV3 bSCMasterFragmentV33 = BSCMasterFragmentV3.this;
            if (bSCMasterFragmentV33.fetchVPNInfo().AkhnZx() == bSCTabIndex && C46876tfT.EZpvd(first)) {
                BuySellConvertParameters fieldNames2 = bSCMasterFragmentV33.fetchVPNInfo().getFieldNames();
                if ((fieldNames2 != null ? fieldNames2.AEQbTJ() : null) == null) {
                    z = true;
                }
            }
            bSCMasterFragmentV33.KWHzl(z);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v14, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v19, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v23, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v26, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v30, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v33, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v8, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public final void AuCTel() {
        int i = StateListAnimator.KWHzl[fetchVPNInfo().fARcdN().ordinal()];
        boolean z = true;
        if (i == 1) {
            if ((OLrzqt().djBIcL() == null || !(!r0.isEmpty())) && !fetchVPNInfo().gHZMYf()) {
                z = false;
            }
            ((AbstractC31520lva) KWHzl()).DbNXlk.getRoot().setVisibility(z ? 0 : 4);
            List<SupportBanner> listDjBIcL = OLrzqt().djBIcL();
            if (listDjBIcL != null) {
                copydefault(listDjBIcL);
            }
            ((AbstractC31520lva) KWHzl()).values.setVisibility(8);
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            OLrzqt(((AbstractC31520lva) KWHzl()).values);
            ((AbstractC31520lva) KWHzl()).DbNXlk.getRoot().setVisibility(8);
            ((AbstractC31520lva) KWHzl()).values.setVisibility(0);
            LegacyBuySellHeader.setBackAction$default(((AbstractC31520lva) KWHzl()).values, 0, new Function0() { // from class: o.lGc
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return BSCMasterFragmentV3.gEmmrt(this.AEQbTJ);
                }
            }, 1, null);
            BuySellConvertParameters fieldNames = fetchVPNInfo().getFieldNames();
            if (fieldNames != null && fieldNames.fJNWhG() && fetchVPNInfo().fARcdN() == BSCLevel.LEVEL2) {
                OLrzqt(fetchVPNInfo().AkhnZx().getIndex());
            }
        }
        ((AbstractC31520lva) KWHzl()).OLrzqt.setVisibility(fARcdN() ? 8 : 0);
    }

    public static final Unit gEmmrt(BSCMasterFragmentV3 bSCMasterFragmentV3) {
        bSCMasterFragmentV3.requireActivity().getOnBackPressedDispatcher().onBackPressed();
        return Unit.INSTANCE;
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Dialog implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ List<SupportBanner> EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Dialog(List<SupportBanner> list) {
            this.EZpvd = list;
        }

        /* JADX INFO: renamed from: com.okinc.buysell.ui.bsc.fragment.master.BSCMasterFragmentV3$Dialog$5, reason: invalid class name */
        public static final class AnonymousClass5 implements Function2<Composer, Integer, Unit> {
            public final /* synthetic */ List<SupportBanner> EZpvd;
            public final /* synthetic */ BSCMasterFragmentV3 copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass5(BSCMasterFragmentV3 bSCMasterFragmentV3, List<SupportBanner> list) {
                this.copydefault = bSCMasterFragmentV3;
                this.EZpvd = list;
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // kotlin.jvm.functions.Function2
            public /* synthetic */ Unit invoke(Composer composer, Integer num) {
                OLrzqt(composer, num.intValue());
                return Unit.INSTANCE;
            }

            /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [298=4] */
            public final void OLrzqt(Composer composer, int i) {
                if ((i & 3) == 2 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1250914372, i, -1, "com.okinc.buysell.ui.bsc.fragment.master.BSCMasterFragmentV3.showLevel1AnnouncementPill.<anonymous>.<anonymous> (BSCMasterFragmentV3.kt:296)");
                }
                Alignment.Horizontal centerHorizontally = Alignment.Companion.getCenterHorizontally();
                final BSCMasterFragmentV3 bSCMasterFragmentV3 = this.copydefault;
                List<SupportBanner> list = this.EZpvd;
                composer.startReplaceableGroup(-483455358);
                Modifier.Companion companion = Modifier.Companion;
                MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, composer, 48);
                composer.startReplaceableGroup(-1323940314);
                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
                Function0<ComposeUiNode> constructor = companion2.getConstructor();
                yHO<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> yhoModifierMaterializerOf = LayoutKt.modifierMaterializerOf(companion);
                if (!(composer.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer.startReusableNode();
                if (composer.getInserting()) {
                    composer.createNode(constructor);
                } else {
                    composer.useNode();
                }
                Composer composerM2783constructorimpl = Updater.m2783constructorimpl(composer);
                Updater.m2790setimpl(composerM2783constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                Updater.m2790setimpl(composerM2783constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                if (composerM2783constructorimpl.getInserting() || !Intrinsics.EZpvd(composerM2783constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM2783constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM2783constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                yhoModifierMaterializerOf.invoke(SkippableUpdater.m2774boximpl(SkippableUpdater.m2775constructorimpl(composer)), composer, 0);
                composer.startReplaceableGroup(2058660585);
                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                List<SupportBanner> listAEQbTJ = bSCMasterFragmentV3.fetchVPNInfo().AEQbTJ();
                composer.startReplaceableGroup(94624179);
                boolean zChangedInstance = composer.changedInstance(bSCMasterFragmentV3);
                Object objRememberedValue = composer.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.Companion.getEmpty()) {
                    objRememberedValue = new Function2() { // from class: o.lGD
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            return BSCMasterFragmentV3.Dialog.AnonymousClass5.AEQbTJ(bSCMasterFragmentV3, (java.lang.String) obj, (java.lang.Integer) obj2);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue);
                }
                Function2 function2 = (Function2) objRememberedValue;
                composer.endReplaceableGroup();
                composer.startReplaceableGroup(94635354);
                boolean zChangedInstance2 = composer.changedInstance(bSCMasterFragmentV3);
                Object objRememberedValue2 = composer.rememberedValue();
                if (zChangedInstance2 || objRememberedValue2 == Composer.Companion.getEmpty()) {
                    objRememberedValue2 = new Function1() { // from class: o.lGE
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return BSCMasterFragmentV3.Dialog.AnonymousClass5.copydefault(bSCMasterFragmentV3, (java.util.List) obj);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue2);
                }
                Function1 function1 = (Function1) objRememberedValue2;
                composer.endReplaceableGroup();
                composer.startReplaceableGroup(94645645);
                boolean zChangedInstance3 = composer.changedInstance(bSCMasterFragmentV3);
                Object objRememberedValue3 = composer.rememberedValue();
                if (zChangedInstance3 || objRememberedValue3 == Composer.Companion.getEmpty()) {
                    objRememberedValue3 = new Function0() { // from class: o.lGB
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return BSCMasterFragmentV3.Dialog.AnonymousClass5.AEQbTJ(bSCMasterFragmentV3);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue3);
                }
                Function0 function0 = (Function0) objRememberedValue3;
                composer.endReplaceableGroup();
                composer.startReplaceableGroup(94652988);
                boolean zChangedInstance4 = composer.changedInstance(bSCMasterFragmentV3);
                Object objRememberedValue4 = composer.rememberedValue();
                if (zChangedInstance4 || objRememberedValue4 == Composer.Companion.getEmpty()) {
                    objRememberedValue4 = new Function1() { // from class: o.lGJ
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return BSCMasterFragmentV3.Dialog.AnonymousClass5.copydefault(bSCMasterFragmentV3, ((java.lang.Boolean) obj).booleanValue());
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue4);
                }
                composer.endReplaceableGroup();
                C30342lUv.AEQbTJ(listAEQbTJ, list, function2, function1, function0, (Function1) objRememberedValue4, composer, 0);
                composer.endReplaceableGroup();
                composer.endNode();
                composer.endReplaceableGroup();
                composer.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }

            public static final Unit AEQbTJ(BSCMasterFragmentV3 bSCMasterFragmentV3, String str, Integer num) {
                bSCMasterFragmentV3.fetchVPNInfo().OLrzqt(PaymentsBannerTrackerAttrType.CTA_BUTTON_BANNER, num);
                if (str != null) {
                    bSCMasterFragmentV3.copydefault(str);
                }
                return Unit.INSTANCE;
            }

            public static final Unit copydefault(BSCMasterFragmentV3 bSCMasterFragmentV3, List list) {
                Intrinsics.checkNotNullParameter(list, "");
                bSCMasterFragmentV3.OLrzqt().EZpvd(list);
                lzT.trackBannerV2Event$default(bSCMasterFragmentV3.fetchVPNInfo(), PaymentsBannerTrackerAttrType.BANNER_V2_OK_BUTTON_CLICK, null, 2, null);
                return Unit.INSTANCE;
            }

            public static final Unit AEQbTJ(BSCMasterFragmentV3 bSCMasterFragmentV3) {
                lzT.trackBannerV2Event$default(bSCMasterFragmentV3.fetchVPNInfo(), PaymentsBannerTrackerAttrType.PILL_BUTTON_CLICK, null, 2, null);
                return Unit.INSTANCE;
            }

            public static final Unit copydefault(BSCMasterFragmentV3 bSCMasterFragmentV3, boolean z) {
                if (z) {
                    lzT.trackBannerV2Event$default(bSCMasterFragmentV3.fetchVPNInfo(), PaymentsBannerTrackerAttrType.PILL_BUTTON_VIEW, null, 2, null);
                } else {
                    lzT.trackBannerV2Event$default(bSCMasterFragmentV3.fetchVPNInfo(), PaymentsBannerTrackerAttrType.PILL_BUTTON_VIEW_HIDDEN, null, 2, null);
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function2
        public /* synthetic */ Unit invoke(Composer composer, Integer num) {
            EZpvd(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void EZpvd(Composer composer, int i) {
            if ((i & 3) != 2 || !composer.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1579376535, i, -1, "com.okinc.buysell.ui.bsc.fragment.master.BSCMasterFragmentV3.showLevel1AnnouncementPill.<anonymous> (BSCMasterFragmentV3.kt:295)");
                }
                SurfaceKt.m1994SurfaceT9BRK9s(null, null, ColorResources_androidKt.colorResource(C52761wXj.Activity.copydefault, composer, 0), 0L, 0.0f, 0.0f, null, ComposableLambdaKt.composableLambda(composer, 1250914372, true, new AnonymousClass5(BSCMasterFragmentV3.this, this.EZpvd)), composer, 12582912, 123);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                    return;
                }
                return;
            }
            composer.skipToGroupEnd();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r4v3, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public final void copydefault(List<SupportBanner> list) {
        ((AbstractC31520lva) KWHzl()).DbNXlk.copydefault.setContent(ComposableLambdaKt.composableLambdaInstance(-1579376535, true, new Dialog(list)));
        ((AbstractC31520lva) KWHzl()).DbNXlk.copydefault.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void copydefault(String str) {
        InterfaceC43294rma interfaceC43294rma = (InterfaceC43294rma) C43251rlk.copydefault(InterfaceC43294rma.class);
        if (interfaceC43294rma.values(str)) {
            FragmentActivity fragmentActivityRequireActivity = requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
            interfaceC43294rma.KWHzl(fragmentActivityRequireActivity, str, interfaceC43294rma.fetchVPNInfo(str), new Function1() { // from class: o.lGn
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return BSCMasterFragmentV3.KWHzl((AbstractC43238rlX) obj);
                }
            });
        } else {
            Bundle bundleBundleOf = BundleKt.bundleOf(C56390yDp.OLrzqt("url", str), C56390yDp.OLrzqt("special", Boolean.TRUE));
            WebActivity.TaskDescription taskDescription = WebActivity.Companion;
            FragmentActivity fragmentActivityRequireActivity2 = requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity2, "");
            WebActivity.TaskDescription.openPage$default(taskDescription, fragmentActivityRequireActivity2, bundleBundleOf, null, 4, null);
        }
    }

    public static final Unit KWHzl(AbstractC43238rlX abstractC43238rlX) {
        Intrinsics.checkNotNullParameter(abstractC43238rlX, "");
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v21, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v27, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r5v5, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r5v8, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r6v8, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public final void getNewProxyInstance() {
        String type;
        if (((AbstractC31520lva) KWHzl()).fARcdN.getAdapter() != null) {
            ((AbstractC31520lva) KWHzl()).fARcdN.unregisterOnPageChangeCallback(this.fARcdN);
        }
        AbstractC58185ywX<String> abstractC58185ywXAEQbTJ = RxBus.AEQbTJ("BSC_FORCE_RELOAD");
        final Function1 function1 = new Function1() { // from class: o.lGm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return BSCMasterFragmentV3.copydefault(this.AEQbTJ, (java.lang.String) obj);
            }
        };
        InterfaceC58217yxC interfaceC58217yxCAEQbTJ = abstractC58185ywXAEQbTJ.AEQbTJ(new InterfaceC58227yxM() { // from class: o.lGo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                BSCMasterFragmentV3.EZpvd(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(interfaceC58217yxCAEQbTJ, "");
        yBK.EZpvd(interfaceC58217yxCAEQbTJ, valueOf());
        AbstractC58185ywX<String> abstractC58185ywXAEQbTJ2 = RxBus.AEQbTJ("save_valuation_current_symbol");
        final Function1 function12 = new Function1() { // from class: o.lGp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return BSCMasterFragmentV3.gEmmrt(this.AEQbTJ, (java.lang.String) obj);
            }
        };
        InterfaceC58217yxC interfaceC58217yxCAEQbTJ2 = abstractC58185ywXAEQbTJ2.AEQbTJ(new InterfaceC58227yxM() { // from class: o.lGu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                BSCMasterFragmentV3.AEQbTJ(function12, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(interfaceC58217yxCAEQbTJ2, "");
        yBK.EZpvd(interfaceC58217yxCAEQbTJ2, valueOf());
        AbstractC58185ywX<String> abstractC58185ywXAEQbTJ3 = RxBus.AEQbTJ("offshore_bsc_l2_dismiss_event");
        final Function1 function13 = new Function1() { // from class: o.lGr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return BSCMasterFragmentV3.AYXKKw(this.AEQbTJ, (java.lang.String) obj);
            }
        };
        InterfaceC58217yxC interfaceC58217yxCAEQbTJ3 = abstractC58185ywXAEQbTJ3.AEQbTJ(new InterfaceC58227yxM() { // from class: o.lGs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                BSCMasterFragmentV3.AYXKKw(function13, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(interfaceC58217yxCAEQbTJ3, "");
        yBK.EZpvd(interfaceC58217yxCAEQbTJ3, valueOf());
        try {
            FragmentManager childFragmentManager = getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
            ActionBar actionBar = new ActionBar(childFragmentManager, getViewLifecycleOwner().getLifecycle());
            this.fetchVPNInfo = actionBar;
            List<androidx.fragment.app.Fragment> listAEQbTJ = actionBar.AEQbTJ();
            if (listAEQbTJ == null) {
                listAEQbTJ = yDY.AhwBna();
            }
            this.AYXKKw = listAEQbTJ;
            ViewPager2 viewPager2 = ((AbstractC31520lva) KWHzl()).fARcdN;
            viewPager2.setAdapter(this.fetchVPNInfo);
            viewPager2.setOffscreenPageLimit(2);
            viewPager2.setUserInputEnabled(false);
            viewPager2.setVisibility(0);
            viewPager2.registerOnPageChangeCallback(this.fARcdN);
            TabLayoutMediator tabLayoutMediator = new TabLayoutMediator(((AbstractC31520lva) KWHzl()).fIwbmz, ((AbstractC31520lva) KWHzl()).fARcdN, new TabLayoutMediator.TabConfigurationStrategy() { // from class: o.lGt
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // com.google.android.material.tabs.TabLayoutMediator.TabConfigurationStrategy
                public final void onConfigureTab(TabLayout.Tab tab, int i) {
                    BSCMasterFragmentV3.copydefault(tab, i);
                }
            });
            this.getFieldNames = tabLayoutMediator;
            tabLayoutMediator.attach();
            Fragment fragment = new Fragment();
            this.uzCIH = fragment;
            ((AbstractC31520lva) KWHzl()).fIwbmz.addOnTabSelectedListener((TabLayout.OnTabSelectedListener) fragment);
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new BSCMasterFragmentV3$setupViewPager$9(this, null), 3, null);
        } catch (IllegalStateException e) {
            C31349lsO c31349lsO = C31349lsO.EZpvd;
            String type2 = PaymentsReporterProperty.PaymentsReportAttrPage.BSC_SIMPLE_TRADE.getType();
            BuySellConvertParameters fieldNames = fetchVPNInfo().getFieldNames();
            TargetTab targetTabIsConnected = fieldNames != null ? fieldNames.isConnected() : null;
            int i = targetTabIsConnected == null ? -1 : StateListAnimator.OLrzqt[targetTabIsConnected.ordinal()];
            if (i == 1) {
                type = PaymentsReporterProperty.PaymentsReportAttrType.BUY.getType();
            } else if (i == 2) {
                type = PaymentsReporterProperty.PaymentsReportAttrType.SELL.getType();
            } else if (i == 3) {
                type = PaymentsReporterProperty.PaymentsReportAttrType.CONVERT.getType();
            } else {
                type = String.valueOf(BSCTabIndex.BUY.getIndex());
            }
            String stackTraceString = Log.getStackTraceString(e);
            Intrinsics.checkNotNullExpressionValue(stackTraceString, "");
            C31349lsO.trackPaymentsEvent$default(c31349lsO, null, type2, type + "_error", null, null, null, null, null, null, null, null, stackTraceString, null, 6137, null);
        }
    }

    public static final void EZpvd(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    public static final Unit copydefault(BSCMasterFragmentV3 bSCMasterFragmentV3, String str) {
        if (!((InterfaceC31670lzr) C43251rlk.copydefault(InterfaceC31670lzr.class)).AhwBna()) {
            bSCMasterFragmentV3.fetchVPNInfo().KWHzl(BSCTabIndex.BUY);
        }
        bSCMasterFragmentV3.values = true;
        return Unit.INSTANCE;
    }

    public static final void AEQbTJ(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    public static final Unit gEmmrt(BSCMasterFragmentV3 bSCMasterFragmentV3, String str) {
        bSCMasterFragmentV3.fetchVPNInfo().KWHzl(BSCTabIndex.BUY);
        bSCMasterFragmentV3.values = true;
        return Unit.INSTANCE;
    }

    public static final void AYXKKw(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AYXKKw(BSCMasterFragmentV3 bSCMasterFragmentV3, String str) {
        bSCMasterFragmentV3.requireActivity().finish();
        return Unit.INSTANCE;
    }

    public static final void copydefault(TabLayout.Tab tab, int i) {
        String strAYXKKw;
        String str = "";
        Intrinsics.checkNotNullParameter(tab, "");
        BSCTabIndex bSCTabIndex = BSCTabIndex.BUY;
        if (i == bSCTabIndex.getIndex()) {
            strAYXKKw = C33070mpX.AYXKKw(C31351lsQ.Activity.fZBcTu);
        } else if (i == BSCTabIndex.SELL.getIndex()) {
            strAYXKKw = C33070mpX.AYXKKw(C31351lsQ.Activity.finit);
        } else {
            if (i != BSCTabIndex.CONVERT.getIndex()) {
                throw new IllegalStateException("Invalid position: " + i);
            }
            strAYXKKw = C33070mpX.AYXKKw(C31351lsQ.Activity.fFgQHt);
        }
        tab.setText(strAYXKKw);
        if (i == bSCTabIndex.getIndex()) {
            str = "buyTab";
        } else if (i == BSCTabIndex.SELL.getIndex()) {
            str = "sellTab";
        } else if (i == BSCTabIndex.CONVERT.getIndex()) {
            str = "convertTab";
        }
        tab.setContentDescription(str);
    }

    public final void OLrzqt(Bundle bundle) {
        BSCLevel bSCLevel;
        BuySellConvertParameters buySellConvertParameters;
        BSCTabIndex bSCTabIndex;
        List<VerificationStatus> listAhwBna;
        if (bundle == null || (bSCLevel = (BSCLevel) bundle.getParcelable("entry_level")) == null) {
            bSCLevel = BSCLevel.LEVEL1;
        }
        if (bundle == null || (buySellConvertParameters = (BuySellConvertParameters) bundle.getParcelable("buy_sell_convert_params")) == null) {
            buySellConvertParameters = new BuySellConvertParameters(OKPaymentSource.UNKNOWN_SOURCE, TargetTab.BUY, null, null, null, null, null, null, null, TypedValues.PositionType.TYPE_CURVE_FIT, null);
        }
        fetchVPNInfo().KWHzl(bSCLevel);
        fetchVPNInfo().EZpvd(buySellConvertParameters);
        BuySellConvertParameters fieldNames = fetchVPNInfo().getFieldNames();
        TargetTab targetTabIsConnected = fieldNames != null ? fieldNames.isConnected() : null;
        int i = targetTabIsConnected == null ? -1 : StateListAnimator.OLrzqt[targetTabIsConnected.ordinal()];
        if (i == -1 || i == 1) {
            bSCTabIndex = BSCTabIndex.BUY;
        } else if (i == 2) {
            bSCTabIndex = BSCTabIndex.SELL;
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            bSCTabIndex = BSCTabIndex.CONVERT;
        }
        fetchVPNInfo().KWHzl(bSCTabIndex);
        BSCMasterViewModel bSCMasterViewModelFetchVPNInfo = fetchVPNInfo();
        VerificationStatus.Companion companion = VerificationStatus.Companion;
        BuySellConvertParameters fieldNames2 = fetchVPNInfo().getFieldNames();
        if (fieldNames2 == null || (listAhwBna = fieldNames2.fetchVPNInfo()) == null) {
            listAhwBna = yDY.AhwBna();
        }
        bSCMasterViewModelFetchVPNInfo.AEQbTJ(companion.EZpvd(listAhwBna));
        fetchVPNInfo().OLrzqt(fetchVPNInfo().EZpvd(buySellConvertParameters.OLrzqt(), buySellConvertParameters.AYXKKw()));
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.lzr.TaskDescription.insertInlineUkBanner$default(o.lzr, androidx.fragment.app.FragmentManager, android.view.ViewGroup, com.okinc.okex.lite.ukbanner.UKBannerType, int, java.lang.Object):void */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        if (this.AEQbTJ == 0 || fetchVPNInfo().fARcdN() != BSCLevel.LEVEL1) {
            return;
        }
        InterfaceC31670lzr interfaceC31670lzr = (InterfaceC31670lzr) C43251rlk.copydefault(InterfaceC31670lzr.class);
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        LinearLayout linearLayout = ((AbstractC31520lva) KWHzl()).djBIcL;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "");
        InterfaceC31670lzr.TaskDescription.insertInlineUkBanner$default(interfaceC31670lzr, childFragmentManager, linearLayout, null, 4, null);
    }

    @Override // o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        this.AkhnZx = false;
    }

    @Override // o.lzN, o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onResume() {
        TargetTab targetTab;
        Pair<Channel, PaymentMethod> value;
        Channel first;
        super.onResume();
        this.AkhnZx = true;
        C47241tmN.OLrzqt.copydefault(fetchVPNInfo().fARcdN());
        lzT.runBannerCheck$default(fetchVPNInfo(), this.gEmmrt, false, 2, null);
        if (this.ejfBZ) {
            this.ejfBZ = false;
            InterfaceC31670lzr interfaceC31670lzr = (InterfaceC31670lzr) C43251rlk.copydefault(InterfaceC31670lzr.class);
            FragmentActivity fragmentActivityRequireActivity = requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
            interfaceC31670lzr.AEQbTJ(fragmentActivityRequireActivity);
            return;
        }
        if (this.fIwbmz) {
            this.fIwbmz = false;
            return;
        }
        fIwbmz();
        fJNWhG();
        int index = fetchVPNInfo().AkhnZx().getIndex();
        BSCTabIndex bSCTabIndex = BSCTabIndex.BUY;
        if (index == bSCTabIndex.getIndex()) {
            targetTab = TargetTab.BUY;
        } else if (index == BSCTabIndex.SELL.getIndex()) {
            targetTab = TargetTab.SELL;
        } else {
            targetTab = index == BSCTabIndex.CONVERT.getIndex() ? TargetTab.CONVERT : TargetTab.BUY;
        }
        fetchVPNInfo().KWHzl(targetTab, C46881tfY.KWHzl(fetchVPNInfo().zLjUOn().getFrequencyModel().getFrequency()), (String) mHA.OLrzqt.AEQbTJ(fetchVPNInfo().hDKMBd()));
        C43453rpa c43453rpa = C43453rpa.AEQbTJ;
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        if (c43453rpa.KWHzl(contextRequireContext) && fetchVPNInfo().AkhnZx() == bSCTabIndex && (value = fetchVPNInfo().wlaJM().getValue()) != null && (first = value.getFirst()) != null && C46876tfT.EZpvd(first)) {
            fetchVPNInfo().zsXlph();
        }
    }

    public final void fIwbmz() {
        if (this.gEmmrt) {
            if (fetchVPNInfo().fARcdN() != BSCLevel.LEVEL1) {
                this.gEmmrt = false;
                return;
            }
            showLoading();
            InterfaceC47251tmX interfaceC47251tmX = (InterfaceC47251tmX) C43251rlk.copydefault(InterfaceC47251tmX.class);
            FragmentActivity fragmentActivityRequireActivity = requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
            LandingPageType landingPageType = LandingPageType.SIMPLE_TRADE_LEVEL1_PAGE;
            ActivityResultRegistry activityResultRegistry = requireActivity().getActivityResultRegistry();
            Intrinsics.checkNotNullExpressionValue(activityResultRegistry, "");
            BuySellConvertParameters fieldNames = fetchVPNInfo().getFieldNames();
            String strAhwBna = fieldNames != null ? fieldNames.AhwBna() : null;
            String str = strAhwBna == null ? "" : strAhwBna;
            BuySellConvertParameters fieldNames2 = fetchVPNInfo().getFieldNames();
            String strCopydefault = fieldNames2 != null ? fieldNames2.copydefault() : null;
            InterfaceC47251tmX.StateListAnimator.verifyForLandingPage$default(interfaceC47251tmX, fragmentActivityRequireActivity, this, landingPageType, activityResultRegistry, new C47313tng(null, str, strCopydefault == null ? "" : strCopydefault, null, null, false, 57, null), false, new Function0() { // from class: o.lGj
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return BSCMasterFragmentV3.valueOf(this.AEQbTJ);
                }
            }, false, new Function1() { // from class: o.lGh
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return BSCMasterFragmentV3.OLrzqt(this.KWHzl, (UnifiedVerificationStatus) obj);
                }
            }, 128, null);
            return;
        }
        if (fetchVPNInfo().fARcdN() == BSCLevel.LEVEL1 && isConnected().values()) {
            fetchVPNInfo().OLrzqt(this.gEmmrt, false);
        }
    }

    public static final Unit valueOf(BSCMasterFragmentV3 bSCMasterFragmentV3) {
        Context context = bSCMasterFragmentV3.getContext();
        if (context != null) {
            ((InterfaceC31670lzr) C43251rlk.copydefault(InterfaceC31670lzr.class)).AEQbTJ(context);
        }
        bSCMasterFragmentV3.fIwbmz = true;
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(BSCMasterFragmentV3 bSCMasterFragmentV3, UnifiedVerificationStatus unifiedVerificationStatus) {
        Intrinsics.checkNotNullParameter(unifiedVerificationStatus, "");
        if (unifiedVerificationStatus instanceof UnifiedVerificationStatus.UnifiedVerificationSuccess) {
            bSCMasterFragmentV3.fJNWhG();
            bSCMasterFragmentV3.AuCTel();
            bSCMasterFragmentV3.getNewProxyInstance();
            PreVerifiedResult preVerifiedResultEZpvd = ((UnifiedVerificationStatus.UnifiedVerificationSuccess) unifiedVerificationStatus).EZpvd();
            VerificationStatus[] verificationStatusArr = new VerificationStatus[2];
            verificationStatusArr[0] = (preVerifiedResultEZpvd.KWHzl() ^ true ? preVerifiedResultEZpvd : null) != null ? VerificationStatus.PRE_LOGIN : null;
            if (!(!preVerifiedResultEZpvd.copydefault())) {
                preVerifiedResultEZpvd = null;
            }
            verificationStatusArr[1] = preVerifiedResultEZpvd != null ? VerificationStatus.PRE_KYC : null;
            bSCMasterFragmentV3.fetchVPNInfo().AEQbTJ(VerificationStatus.Companion.EZpvd(yDY.valueOf(verificationStatusArr)));
            bSCMasterFragmentV3.gEmmrt = false;
            bSCMasterFragmentV3.fIwbmz = false;
        } else if (unifiedVerificationStatus instanceof UnifiedVerificationStatus.UnifiedVerificationFailed) {
            UnifiedVerificationStatus.UnifiedVerificationFailed unifiedVerificationFailed = (UnifiedVerificationStatus.UnifiedVerificationFailed) unifiedVerificationStatus;
            if (unifiedVerificationFailed.OLrzqt() == UnifiedVerificationType.LOGIN) {
                bSCMasterFragmentV3.ejfBZ = true;
            }
            bSCMasterFragmentV3.fIwbmz = unifiedVerificationFailed.copydefault();
        } else {
            if (!(unifiedVerificationStatus instanceof UnifiedVerificationStatus.UnifiedVerificationApiError)) {
                throw new NoWhenBranchMatchedException();
            }
            bSCMasterFragmentV3.fIwbmz = ((UnifiedVerificationStatus.UnifiedVerificationApiError) unifiedVerificationStatus).OLrzqt();
        }
        bSCMasterFragmentV3.dismissLoading();
        return Unit.INSTANCE;
    }

    public final void fJNWhG() {
        if (this.values) {
            getNewProxyInstance();
            this.values = false;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v4, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v7, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public final void KWHzl(boolean z) {
        if (!z && fetchVPNInfo().AkhnZx() == BSCTabIndex.BUY) {
            fetchVPNInfo().ORxRYg();
        }
        int i = StateListAnimator.KWHzl[fetchVPNInfo().fARcdN().ordinal()];
        if (i != 1) {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            lIB lib = ((AbstractC31520lva) KWHzl()).values;
            lib.EZpvd().setVisibility(z ? 0 : 8);
            lib.EZpvd().setChipIcon(7);
            lib.EZpvd().setChipText(fetchVPNInfo().zLjUOn().getDisplayLabel());
            lib.AEQbTJ().setVisibility(8);
            Intrinsics.copydefault(lib);
            return;
        }
        AbstractC31494lvA abstractC31494lvA = ((AbstractC31520lva) KWHzl()).DbNXlk;
        if (z) {
            abstractC31494lvA.getRoot().setVisibility(0);
            abstractC31494lvA.OLrzqt.setVisibility(0);
        } else {
            abstractC31494lvA.getRoot().setVisibility(4);
            abstractC31494lvA.OLrzqt.setVisibility(4);
        }
        abstractC31494lvA.OLrzqt.setChipIcon(7);
        abstractC31494lvA.OLrzqt.setChipText(fetchVPNInfo().zLjUOn().getDisplayLabel());
        abstractC31494lvA.valueOf.setVisibility(8);
        Intrinsics.copydefault(abstractC31494lvA);
    }

    public final void iwGUEr() {
        lBF.Companion.KWHzl(fetchVPNInfo().isConnected(), new Function1() { // from class: o.lGi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return BSCMasterFragmentV3.AEQbTJ(this.KWHzl, (BuyFrequencyOption) obj);
            }
        }).show(getParentFragmentManager(), "RecurringFrequencyNewBottomSheet");
    }

    public static final Unit AEQbTJ(BSCMasterFragmentV3 bSCMasterFragmentV3, BuyFrequencyOption buyFrequencyOption) {
        Intrinsics.checkNotNullParameter(buyFrequencyOption, "");
        bSCMasterFragmentV3.fetchVPNInfo().EZpvd(buyFrequencyOption);
        bSCMasterFragmentV3.KWHzl(true);
        bSCMasterFragmentV3.fetchVPNInfo().copydefault(buyFrequencyOption);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v10, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v13, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v19, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v4, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public final void hDKMBd() {
        ((AbstractC31520lva) KWHzl()).DbNXlk.OLrzqt.setOnClickListener(new Function0() { // from class: o.lGF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return BSCMasterFragmentV3.isConnected(this.OLrzqt);
            }
        });
        ((AbstractC31520lva) KWHzl()).values.EZpvd().setOnClickListener(new Function0() { // from class: o.lGk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return BSCMasterFragmentV3.values(this.KWHzl);
            }
        });
        BuySellConvertParameters fieldNames = fetchVPNInfo().getFieldNames();
        if (fieldNames != null && fieldNames.fJNWhG() && fetchVPNInfo().fARcdN() == BSCLevel.LEVEL1) {
            ((AbstractC31520lva) KWHzl()).valueOf.setVisibility(8);
        } else {
            ((AbstractC31520lva) KWHzl()).valueOf.setVisibility(0);
        }
        ((AbstractC31520lva) KWHzl()).OLrzqt.setVisibility(fARcdN() ? 8 : 0);
    }

    public static final Unit isConnected(BSCMasterFragmentV3 bSCMasterFragmentV3) {
        bSCMasterFragmentV3.fetchVPNInfo().AEQbTJ("SimpleTrade_Buy_DropDown_Click");
        bSCMasterFragmentV3.iwGUEr();
        return Unit.INSTANCE;
    }

    public static final Unit values(BSCMasterFragmentV3 bSCMasterFragmentV3) {
        bSCMasterFragmentV3.fetchVPNInfo().AEQbTJ("SimpleTrade_Buy_DropDown_Click");
        bSCMasterFragmentV3.iwGUEr();
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v4, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v7, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public final void ejfBZ() {
        if (((InterfaceC31670lzr) C43251rlk.copydefault(InterfaceC31670lzr.class)).AhwBna()) {
            ((AbstractC31520lva) KWHzl()).AYXKKw.setVisibility(0);
        } else {
            ((AbstractC31520lva) KWHzl()).AYXKKw.setVisibility(8);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public final void OLrzqt(int i) {
        ImageView imageView = ((AbstractC31520lva) KWHzl()).AYXKKw;
        if (i == BSCTabIndex.BUY.getIndex() || i == BSCTabIndex.SELL.getIndex()) {
            imageView.setOnClickListener(new View.OnClickListener() { // from class: o.lGy
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    BSCMasterFragmentV3.KWHzl(this.AEQbTJ, view);
                }
            });
        } else if (i == BSCTabIndex.CONVERT.getIndex()) {
            imageView.setOnClickListener(new View.OnClickListener() { // from class: o.lGC
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    BSCMasterFragmentV3.AEQbTJ(this.KWHzl, view);
                }
            });
        }
    }

    public static final void KWHzl(BSCMasterFragmentV3 bSCMasterFragmentV3, View view) {
        InterfaceC31422lti interfaceC31422lti = (InterfaceC31422lti) C43251rlk.copydefault(InterfaceC31422lti.class);
        Context contextRequireContext = bSCMasterFragmentV3.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        interfaceC31422lti.EZpvd(contextRequireContext);
    }

    public static final void AEQbTJ(BSCMasterFragmentV3 bSCMasterFragmentV3, View view) {
        InterfaceC31670lzr interfaceC31670lzr = (InterfaceC31670lzr) C43251rlk.copydefault(InterfaceC31670lzr.class);
        Context contextRequireContext = bSCMasterFragmentV3.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        interfaceC31670lzr.EZpvd(contextRequireContext);
    }

    @Override // o.lzN
    public void EZpvd() {
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new BSCMasterFragmentV3$addObservers$1(this, null), 3, null);
        LifecycleOwner viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner2), null, null, new BSCMasterFragmentV3$addObservers$2(this, null), 3, null);
        final BSCMasterViewModel bSCMasterViewModelFetchVPNInfo = fetchVPNInfo();
        mHA mha = mHA.OLrzqt;
        LiveData<C32989mnw<Unit>> liveDataSSMYrx = bSCMasterViewModelFetchVPNInfo.sSMYrx();
        LifecycleOwner viewLifecycleOwner3 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner3, "");
        mha.copydefault(liveDataSSMYrx, viewLifecycleOwner3, new Function1() { // from class: o.lGl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return BSCMasterFragmentV3.KWHzl(this.copydefault, (Unit) obj);
            }
        });
        LiveData<C32989mnw<TransferDetail>> newProxyInstance = bSCMasterViewModelFetchVPNInfo.getNewProxyInstance();
        LifecycleOwner viewLifecycleOwner4 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner4, "");
        mha.copydefault(newProxyInstance, viewLifecycleOwner4, new Function1() { // from class: o.lGv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return BSCMasterFragmentV3.EZpvd(this.OLrzqt, (TransferDetail) obj);
            }
        });
        LiveData<C32989mnw<Unit>> liveDataEjfBZ = bSCMasterViewModelFetchVPNInfo.ejfBZ();
        LifecycleOwner viewLifecycleOwner5 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner5, "");
        mha.copydefault(liveDataEjfBZ, viewLifecycleOwner5, new Function1() { // from class: o.lGx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return BSCMasterFragmentV3.copydefault(this.KWHzl, (Unit) obj);
            }
        });
        bSCMasterViewModelFetchVPNInfo.iwGUEr().observe(getViewLifecycleOwner(), new Application(new Function1() { // from class: o.lGA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return BSCMasterFragmentV3.OLrzqt(this.OLrzqt, (java.lang.Integer) obj);
            }
        }));
        LiveData<C32989mnw<List<BuyFrequencyOption>>> liveDataAubY = bSCMasterViewModelFetchVPNInfo.AubY();
        LifecycleOwner viewLifecycleOwner6 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner6, "");
        mha.copydefault(liveDataAubY, viewLifecycleOwner6, new Function1() { // from class: o.lGw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return BSCMasterFragmentV3.copydefault(bSCMasterViewModelFetchVPNInfo, this, (java.util.List) obj);
            }
        });
        LiveData<C32989mnw<Unit>> liveDataAuCTel = bSCMasterViewModelFetchVPNInfo.AuCTel();
        LifecycleOwner viewLifecycleOwner7 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner7, "");
        mha.copydefault(liveDataAuCTel, viewLifecycleOwner7, new Function1() { // from class: o.lGz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return BSCMasterFragmentV3.gEmmrt(this.EZpvd, (Unit) obj);
            }
        });
    }

    public static final Unit KWHzl(BSCMasterFragmentV3 bSCMasterFragmentV3, Unit unit) {
        Intrinsics.checkNotNullParameter(unit, "");
        bSCMasterFragmentV3.KWHzl(false);
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(BSCMasterFragmentV3 bSCMasterFragmentV3, TransferDetail transferDetail) {
        Intrinsics.checkNotNullParameter(transferDetail, "");
        InterfaceC31670lzr interfaceC31670lzr = (InterfaceC31670lzr) C43251rlk.copydefault(InterfaceC31670lzr.class);
        FragmentActivity fragmentActivityRequireActivity = bSCMasterFragmentV3.requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
        interfaceC31670lzr.copydefault(fragmentActivityRequireActivity, transferDetail);
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(BSCMasterFragmentV3 bSCMasterFragmentV3, Unit unit) {
        Intrinsics.checkNotNullParameter(unit, "");
        bSCMasterFragmentV3.gEmmrt = true;
        bSCMasterFragmentV3.getNewProxyInstance();
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit OLrzqt(BSCMasterFragmentV3 bSCMasterFragmentV3, Integer num) {
        ViewPager2 viewPager2 = ((AbstractC31520lva) bSCMasterFragmentV3.KWHzl()).fARcdN;
        Intrinsics.copydefault(num);
        viewPager2.setCurrentItem(num.intValue(), false);
        if (((InterfaceC31670lzr) C43251rlk.copydefault(InterfaceC31670lzr.class)).AhwBna()) {
            bSCMasterFragmentV3.OLrzqt(num.intValue());
        }
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(BSCMasterViewModel bSCMasterViewModel, BSCMasterFragmentV3 bSCMasterFragmentV3, List list) {
        Object next;
        Intrinsics.checkNotNullParameter(list, "");
        bSCMasterViewModel.copydefault((List<BuyFrequencyOption>) list);
        boolean z = false;
        if (list.size() > 1) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (((BuyFrequencyOption) next).getFrequencyType() == bSCMasterViewModel.uzCIH()) {
                    break;
                }
            }
            BuyFrequencyOption buyFrequencyOptionZLjUOn = (BuyFrequencyOption) next;
            if (buyFrequencyOptionZLjUOn == null) {
                buyFrequencyOptionZLjUOn = bSCMasterViewModel.zLjUOn();
            }
            bSCMasterViewModel.EZpvd(buyFrequencyOptionZLjUOn);
            if (bSCMasterFragmentV3.fetchVPNInfo().AkhnZx() == BSCTabIndex.BUY) {
                BuySellConvertParameters fieldNames = bSCMasterFragmentV3.fetchVPNInfo().getFieldNames();
                if ((fieldNames != null ? fieldNames.AEQbTJ() : null) == null) {
                    z = true;
                }
            }
            bSCMasterFragmentV3.KWHzl(z);
        } else {
            bSCMasterViewModel.ORxRYg();
            bSCMasterFragmentV3.KWHzl(false);
        }
        return Unit.INSTANCE;
    }

    public static final Unit gEmmrt(BSCMasterFragmentV3 bSCMasterFragmentV3, Unit unit) {
        Intrinsics.checkNotNullParameter(unit, "");
        int i = StateListAnimator.KWHzl[bSCMasterFragmentV3.fetchVPNInfo().fARcdN().ordinal()];
        if (i == 1) {
            bSCMasterFragmentV3.fetchVPNInfo().OLrzqt(false);
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            bSCMasterFragmentV3.fetchVPNInfo().OLrzqt(true);
        }
        return Unit.INSTANCE;
    }

    public final void AkhnZx() {
        Job job = this.fJNWhG;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        C52812wZg c52812wZg = this.AuCTel;
        if (c52812wZg != null) {
            c52812wZg.KWHzl();
        }
    }

    public final boolean fARcdN() {
        return ((InterfaceC31670lzr) C43251rlk.copydefault(InterfaceC31670lzr.class)).AhwBna() && isConnected().DbNXlk();
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.buysell.ui.bsc.fragment.master.BSCMasterFragmentV3.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public static /* synthetic */ BSCMasterFragmentV3 newInstance$default(TaskDescription taskDescription, BSCLevel bSCLevel, BuySellConvertParameters buySellConvertParameters, int i, Object obj) {
            if ((i & 1) != 0) {
                bSCLevel = BSCLevel.LEVEL1;
            }
            return taskDescription.EZpvd(bSCLevel, buySellConvertParameters);
        }

        public final BSCMasterFragmentV3 EZpvd(@NotNull BSCLevel bSCLevel, @NotNull BuySellConvertParameters buySellConvertParameters) {
            Intrinsics.checkNotNullParameter(bSCLevel, "");
            Intrinsics.checkNotNullParameter(buySellConvertParameters, "");
            BSCMasterFragmentV3 bSCMasterFragmentV3 = new BSCMasterFragmentV3();
            Bundle bundle = new Bundle();
            bundle.putParcelable("entry_level", bSCLevel);
            bundle.putParcelable("buy_sell_convert_params", buySellConvertParameters);
            bSCMasterFragmentV3.setArguments(bundle);
            return bSCMasterFragmentV3;
        }
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class ActionBar extends FragmentStateAdapter {
        public final List<lzR<? extends ViewDataBinding>> AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final List<androidx.fragment.app.Fragment> AEQbTJ() {
            return this.AEQbTJ;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ActionBar(@NotNull FragmentManager fragmentManager, @NotNull Lifecycle lifecycle) {
            super(fragmentManager, lifecycle);
            Intrinsics.checkNotNullParameter(fragmentManager, "");
            Intrinsics.checkNotNullParameter(lifecycle, "");
            this.AEQbTJ = yDY.gEmmrt(lEN.Companion.AEQbTJ(), lGL.Companion.EZpvd(), C29848lCo.Companion.EZpvd());
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return this.AEQbTJ.size();
        }

        @Override // androidx.viewpager2.adapter.FragmentStateAdapter
        public androidx.fragment.app.Fragment createFragment(int i) {
            lzR lzr = (lzR) CollectionsKt___CollectionsKt.AkhnZx(this.AEQbTJ, i);
            if (lzr != null) {
                return lzr;
            }
            throw new IllegalStateException("Invalid position: " + i);
        }
    }
}
