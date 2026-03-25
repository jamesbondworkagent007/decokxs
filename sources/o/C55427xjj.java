package o;

import android.graphics.Bitmap;
import android.os.Build;
import android.view.PixelCopy;
import android.view.WindowManager;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.core.os.BundleKt;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentContainerView;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentOnAttachListener;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.okinc.biz.share.ShareFileProvider;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParam;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.im.bean.IMMessageShareModel;
import com.okinc.kline.api.bean.MarketArbCoinInfo;
import com.okinc.kline.api.bean.MarketCoinInfo;
import com.okinc.kline.data.KlineChangeScreenVo;
import com.okinc.kline.ui.viewmodel.KlineHeaderViewModel;
import com.okinc.kline.ui.viewmodel.KlineTimeAnchorViewModel;
import com.okinc.kyc.api.biz.restriction.OKComplianceRestrictionService;
import com.okinc.rxutils.RxBus;
import com.okinc.share.api.preview.ISharePreviewConfig;
import com.okinc.share.bean.ShareConfig;
import com.okinc.share.bean.image.ImageDefaultPreviewConfig;
import com.okinc.share.bean.image.ImageShareParams;
import com.okinc.tradeapi.framework.constant.TradeKey;
import com.okinc.uilab.reminder.OKReminder;
import com.okinc.unified.data.CeFiData;
import com.okinc.unified.fragment.CeFiKlineFragment$initView$7;
import com.okinc.unified.fragment.CeFiKlineFragment$showCedefiOnlineReminder$1$1;
import com.okinc.unified.shared.CeDeFiSharedViewModel;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.BotWebHook;
import com.okinc.unify_trade.biz.FutureInstrument;
import com.okinc.unify_trade.message.TradeMessagePresenter;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.UUID;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.C35964oKf;
import o.C38795pgF;
import o.InterfaceC48895ueM;
import o.InterfaceC54581xNr;
import o.YY;
import o.Zg;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xjj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C55427xjj extends AbstractC55482xkl implements InterfaceC39499ptW, InterfaceC39508ptf {
    public static final Activity Companion = new Activity(null);
    public static final int EZpvd = 8;
    public BizInstrument AEQbTJ;
    public java.lang.String AYXKKw;
    public java.lang.String AhwBna;
    public java.lang.String AkhnZx;
    public java.lang.String AuCTel;
    public C38795pgF AuCTelauCTel;
    public final InterfaceC56387yDm AubY;
    public boolean AwvSrB;
    public InterfaceC39560pue AxsJAY;
    public InterfaceC58217yxC DTwDnp;
    public boolean DbNXlk;
    public java.lang.String KWHzl;
    public final InterfaceC56387yDm OLrzqt;
    public final InterfaceC56387yDm ORxRYg;
    public InterfaceC58217yxC QKVWgx;
    public int QOLQEE;
    public java.lang.String QUSxYX;
    public java.lang.String QfsBiF;
    public C36026oMn copydefault;
    public final InterfaceC56387yDm djBIcL;
    public java.lang.String fARcdN;
    public FragmentOnAttachListener fIwbmz;
    public C49352umt fJNWhG;
    public final InterfaceC56387yDm fetchVPNInfo;
    public boolean gEmmrt;
    public boolean gHZMYf;
    public boolean getFieldNames;
    public ViewOnClickListenerC38659pdc getNewProxyInstance;
    public InterfaceC37933pGb hDKMBd;
    public boolean isConnected;
    public MarketCoinInfo iwGUEr;
    public boolean sSMYrx;
    public final InterfaceC56387yDm valueOf;
    public boolean values;
    public ViewOnClickListenerC38857phO wlaJM;
    public xHY zLjUOn;
    public InterfaceC58217yxC zsXlph;
    public java.lang.String zuBGHE;
    public java.lang.String OcIXYQ = "";
    public boolean uzCIH = true;
    public final InterfaceC56387yDm ejfBZ = C56392yDr.copydefault(new Function0() { // from class: o.xju
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C55427xjj.OLrzqt(this.EZpvd);
        }
    });

    /* JADX INFO: renamed from: o.xjj$StateListAnimator */
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC39499ptW
    public boolean AhwBna() {
        return this.gHZMYf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AuCTel() {
        return this.getFieldNames;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(@NotNull InterfaceC37933pGb interfaceC37933pGb) {
        Intrinsics.checkNotNullParameter(interfaceC37933pGb, "");
        this.hDKMBd = interfaceC37933pGb;
    }

    @Override // o.InterfaceC39556pua
    public void KWHzl(MarketArbCoinInfo marketArbCoinInfo) {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC39499ptW
    public void copydefault(InterfaceC37933pGb interfaceC37933pGb) {
        this.hDKMBd = interfaceC37933pGb;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC39499ptW
    public void fARcdN() {
        this.DbNXlk = false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String gEmmrt() {
        return this.QUSxYX;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return C35964oKf.Application.hDKMBd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC39508ptf
    public void setClickLockListener(InterfaceC39560pue interfaceC39560pue) {
        this.AxsJAY = interfaceC39560pue;
    }

    public C55427xjj() {
        final Function0 function0 = null;
        this.OLrzqt = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(pGZ.class), new Function0<ViewModelStore>() { // from class: com.okinc.unified.fragment.CeFiKlineFragment$special$$inlined$activityViewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.unified.fragment.CeFiKlineFragment$special$$inlined$activityViewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.unified.fragment.CeFiKlineFragment$special$$inlined$activityViewModels$default$3
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
        C43248rlh c43248rlh = C43248rlh.KWHzl;
        this.sSMYrx = !((OKComplianceRestrictionService) c43248rlh.AEQbTJ(OKComplianceRestrictionService.class)).OLrzqt(OKComplianceRestrictionService.Feature.BANNER);
        this.AwvSrB = !((OKComplianceRestrictionService) c43248rlh.AEQbTJ(OKComplianceRestrictionService.class)).OLrzqt(OKComplianceRestrictionService.Feature.RISK_BANNER);
        this.zuBGHE = "0";
        this.AkhnZx = "0";
        this.gEmmrt = true;
        this.QUSxYX = "";
        this.valueOf = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(pCW.class), new Function0<ViewModelStore>() { // from class: com.okinc.unified.fragment.CeFiKlineFragment$special$$inlined$activityViewModels$default$4
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.unified.fragment.CeFiKlineFragment$special$$inlined$activityViewModels$default$5
            private static final byte[] $$c = {Ascii.RS, -87, -60, -80};
            private static final int $$d = 2;
            private static int $10 = 0;
            private static int $11 = 1;
            private static final byte[] $$a = {SignedBytes.MAX_POWER_OF_TWO, -61, 50, Ascii.FS, 36, -35, -25};
            private static final int $$b = 38;
            private static int AEQbTJ = 0;
            private static int copydefault = 1;
            private static char[] KWHzl = {11837, 11778, 11776, 11855, 11802, 11838, 11807, 11799, 11809, 11793, 11781, 11787, 11792, 11833, 11857, 11788, 11839, 11804, 11834, 11780, 11782, 11785, 11832, 11794, 11800, 11835, 11790, 11803, 11783, 11805, 11856, 11801, 11797, 11777, 11789, 11786};
            private static char EZpvd = 7138;

            /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002b). Please report as a decompilation issue!!! */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            private static String $$e(int i, short s, int i2) {
                int i3;
                int i4;
                int i5 = 1 - (s * 3);
                byte[] bArr = $$c;
                int i6 = i2 + 4;
                int i7 = i + 65;
                byte[] bArr2 = new byte[i5];
                if (bArr == null) {
                    int i8 = i6;
                    i4 = 0;
                    i7 += i8;
                    i3 = i4;
                    int i9 = i6;
                    int i10 = i7;
                    i4 = i3 + 1;
                    bArr2[i3] = (byte) i10;
                    int i11 = i9 + 1;
                    if (i4 == i5) {
                        return new String(bArr2, 0);
                    }
                    i6 = i11;
                    i7 = bArr[i11];
                    i8 = i10;
                    i7 += i8;
                    i3 = i4;
                    int i92 = i6;
                    int i102 = i7;
                    i4 = i3 + 1;
                    bArr2[i3] = (byte) i102;
                    int i112 = i92 + 1;
                    if (i4 == i5) {
                    }
                } else {
                    i3 = 0;
                    int i922 = i6;
                    int i1022 = i7;
                    i4 = i3 + 1;
                    bArr2[i3] = (byte) i1022;
                    int i1122 = i922 + 1;
                    if (i4 == i5) {
                    }
                }
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002e). Please report as a decompilation issue!!! */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            private static void b(byte b, short s, int i, Object[] objArr) {
                int i2;
                int i3 = 65 - (b * 3);
                byte[] bArr = $$a;
                int i4 = s * 2;
                int i5 = i + 4;
                byte[] bArr2 = new byte[i4 + 4];
                int i6 = i4 + 3;
                if (bArr == null) {
                    int i7 = i6;
                    int i8 = i5;
                    i2 = 0;
                    int i9 = i5 + i7 + 16;
                    i5 = i8;
                    i3 = i9;
                    bArr2[i2] = (byte) i3;
                    if (i2 == i6) {
                        objArr[0] = new String(bArr2, 0);
                        return;
                    }
                    int i10 = i5 + 1;
                    i2++;
                    i7 = bArr[i10];
                    i5 = i3;
                    i8 = i10;
                    int i92 = i5 + i7 + 16;
                    i5 = i8;
                    i3 = i92;
                    bArr2[i2] = (byte) i3;
                    if (i2 == i6) {
                    }
                } else {
                    i2 = 0;
                    bArr2[i2] = (byte) i3;
                    if (i2 == i6) {
                    }
                }
            }

            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ CreationExtras invoke() {
                int i = 2 % 2;
                int i2 = copydefault + 47;
                AEQbTJ = i2 % 128;
                int i3 = i2 % 2;
                CreationExtras creationExtrasInvoke = invoke();
                int i4 = AEQbTJ + 93;
                copydefault = i4 % 128;
                int i5 = i4 % 2;
                return creationExtrasInvoke;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                int i = 2 % 2;
                int i2 = AEQbTJ + 95;
                copydefault = i2 % 128;
                int i3 = i2 % 2;
                Function0 function02 = function0;
                if (function02 != null && (creationExtras = (CreationExtras) function02.invoke()) != null) {
                    return creationExtras;
                }
                CreationExtras defaultViewModelCreationExtras = this.requireActivity().getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "");
                int i4 = AEQbTJ + 75;
                copydefault = i4 % 128;
                int i5 = i4 % 2;
                return defaultViewModelCreationExtras;
            }

            /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [273=5] */
            /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
            private static void a(int i, byte b, char[] cArr, Object[] objArr) throws Throwable {
                int i2;
                Object obj;
                int i3;
                int i4 = 2 % 2;
                Zg zg = new Zg();
                char[] cArr2 = KWHzl;
                int i5 = 555755035;
                Object obj2 = null;
                if (cArr2 != null) {
                    int length = cArr2.length;
                    char[] cArr3 = new char[length];
                    int i6 = $11 + 99;
                    $10 = i6 % 128;
                    int i7 = i6 % 2;
                    int i8 = 0;
                    while (i8 < length) {
                        try {
                            Object[] objArr2 = {Integer.valueOf(cArr2[i8])};
                            Object objEZpvd = YY.EZpvd(i5);
                            if (objEZpvd == null) {
                                int i9 = $$d;
                                byte b2 = (byte) (i9 | 53);
                                byte b3 = (byte) (i9 - 2);
                                objEZpvd = YY.EZpvd(117, 4, (char) 13956, 620817255, false, $$e(b2, b3, (byte) (b3 - 1)), new Class[]{Integer.TYPE});
                            }
                            cArr3[i8] = ((Character) ((Method) objEZpvd).invoke(null, objArr2)).charValue();
                            i8++;
                            i5 = 555755035;
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    }
                    cArr2 = cArr3;
                }
                Object[] objArr3 = {Integer.valueOf(EZpvd)};
                Object objEZpvd2 = YY.EZpvd(555755035);
                if (objEZpvd2 == null) {
                    int i10 = $$d;
                    byte b4 = (byte) (i10 | 53);
                    byte b5 = (byte) (i10 - 2);
                    objEZpvd2 = YY.EZpvd(117, 4, (char) 13956, 620817255, false, $$e(b4, b5, (byte) (b5 - 1)), new Class[]{Integer.TYPE});
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
                        zg.AEQbTJ = cArr[zg.KWHzl];
                        zg.OLrzqt = cArr[zg.KWHzl + 1];
                        if (zg.AEQbTJ == zg.OLrzqt) {
                            cArr4[zg.KWHzl] = (char) (zg.AEQbTJ - b);
                            cArr4[zg.KWHzl + 1] = (char) (zg.OLrzqt - b);
                            obj = obj2;
                        } else {
                            Object[] objArr4 = {zg, zg, Integer.valueOf(cCharValue), zg, zg, Integer.valueOf(cCharValue), zg, zg, Integer.valueOf(cCharValue), zg, zg, Integer.valueOf(cCharValue), zg};
                            Object objEZpvd3 = YY.EZpvd(-526958001);
                            if (objEZpvd3 == null) {
                                byte b6 = (byte) ($$d + 1);
                                byte b7 = (byte) (b6 - 3);
                                objEZpvd3 = YY.EZpvd(491, 5, (char) 30951, -457732301, false, $$e(b6, b7, (byte) (b7 - 1)), new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                            }
                            if (((Integer) ((Method) objEZpvd3).invoke(null, objArr4)).intValue() == zg.djBIcL) {
                                Object[] objArr5 = {zg, zg, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), zg, zg, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), zg, Integer.valueOf(cCharValue), zg};
                                Object objEZpvd4 = YY.EZpvd(1348337226);
                                if (objEZpvd4 == null) {
                                    byte b8 = (byte) ($$d - 2);
                                    byte b9 = b8;
                                    objEZpvd4 = YY.EZpvd(221, 5, (char) 3937, 1417491254, false, $$e(b8, b9, (byte) (b9 - 1)), new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                                }
                                obj = null;
                                int iIntValue = ((Integer) ((Method) objEZpvd4).invoke(null, objArr5)).intValue();
                                int i11 = (zg.EZpvd * cCharValue) + zg.djBIcL;
                                cArr4[zg.KWHzl] = cArr2[iIntValue];
                                cArr4[zg.KWHzl + 1] = cArr2[i11];
                            } else {
                                obj = null;
                                if (zg.copydefault == zg.EZpvd) {
                                    int i12 = $11 + 115;
                                    $10 = i12 % 128;
                                    int i13 = i12 % 2;
                                    zg.AYXKKw = ((zg.AYXKKw + cCharValue) - 1) % cCharValue;
                                    zg.djBIcL = ((zg.djBIcL + cCharValue) - 1) % cCharValue;
                                    int i14 = (zg.copydefault * cCharValue) + zg.AYXKKw;
                                    int i15 = (zg.EZpvd * cCharValue) + zg.djBIcL;
                                    cArr4[zg.KWHzl] = cArr2[i14];
                                    cArr4[zg.KWHzl + 1] = cArr2[i15];
                                } else {
                                    int i16 = (zg.copydefault * cCharValue) + zg.djBIcL;
                                    int i17 = (zg.EZpvd * cCharValue) + zg.AYXKKw;
                                    cArr4[zg.KWHzl] = cArr2[i16];
                                    cArr4[zg.KWHzl + 1] = cArr2[i17];
                                    int i18 = $10 + 109;
                                    $11 = i18 % 128;
                                    i3 = 2;
                                    int i19 = i18 % 2;
                                    zg.KWHzl += i3;
                                    obj2 = obj;
                                }
                            }
                        }
                        i3 = 2;
                        zg.KWHzl += i3;
                        obj2 = obj;
                    }
                }
                for (int i20 = 0; i20 < i; i20++) {
                    cArr4[i20] = (char) (cArr4[i20] ^ 13722);
                }
                objArr[0] = new String(cArr4);
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
            public static java.lang.Object[] KWHzl(int r26, int r27) {
                /*
                    r1 = r26
                    r2 = r27
                    r3 = 2
                    int r0 = r3 % r3
                    int r0 = o.C31232lqD.Activity.copydefault()
                    int r4 = ~r0
                    r5 = 1146665140(0x4458b8b4, float:866.886)
                    r6 = r5 | r4
                    int r6 = ~r6
                    r7 = 1773869451(0x69bb198b, float:2.827372E25)
                    r8 = r7 ^ r0
                    r7 = r7 & r0
                    r7 = r7 | r8
                    int r7 = ~r7
                    r6 = r6 | r7
                    int r6 = r6 * 217
                    int r6 = -r6
                    int r6 = -r6
                    r7 = -806487995(0xffffffffcfedf845, float:-7.9849416E9)
                    r8 = r7 ^ r6
                    r6 = r6 & r7
                    r7 = 1
                    int r6 = r6 << r7
                    int r8 = r8 + r6
                    r6 = r5 ^ r0
                    r0 = r0 & r5
                    r0 = r0 | r6
                    int r0 = ~r0
                    r5 = -1845213632(0xffffffff92044640, float:-4.1738446E-28)
                    r6 = r5 ^ r0
                    r0 = r0 & r5
                    r0 = r0 | r6
                    int r0 = r0 * 217
                    r5 = r8 ^ r0
                    r0 = r0 & r8
                    int r0 = r0 << r7
                    int r5 = r5 + r0
                    r0 = 1773869451(0x69bb198b, float:2.827372E25)
                    r6 = r0 ^ r4
                    r0 = r0 & r4
                    r0 = r0 | r6
                    int r0 = ~r0
                    r4 = -1146665141(0xffffffffbba7474b, float:-0.0051049343)
                    r0 = r0 | r4
                    int r0 = r0 * 217
                    r4 = r5 & r0
                    r0 = r0 | r5
                    int r4 = r4 + r0
                    int r0 = o.C31232lqD.Activity.copydefault()
                    r5 = 1056956383(0x3effdfdf, float:0.49975488)
                    r6 = r5 ^ r0
                    r5 = r5 & r0
                    r5 = r5 | r6
                    int r5 = ~r5
                    int r6 = ~r0
                    r8 = -251516759(0xfffffffff10228a9, float:-6.445153E29)
                    r9 = r6 ^ r8
                    r6 = r6 & r8
                    r6 = r6 | r9
                    r9 = -843749520(0xffffffffcdb56770, float:-3.80431872E8)
                    r10 = r6 ^ r9
                    r6 = r6 & r9
                    r6 = r6 | r10
                    int r6 = ~r6
                    r9 = r5 ^ r6
                    r5 = r5 & r6
                    r5 = r5 | r9
                    int r5 = r5 * (-318)
                    r6 = -446723253(0xffffffffe55f8b4b, float:-6.5978577E22)
                    r9 = r6 ^ r5
                    r5 = r5 & r6
                    int r5 = r5 << r7
                    int r9 = r9 + r5
                    r5 = r8 ^ r0
                    r6 = r8 & r0
                    r5 = r5 | r6
                    int r5 = ~r5
                    r6 = 213206864(0xcb54750, float:2.7930385E-31)
                    r5 = r5 | r6
                    int r5 = r5 * (-318)
                    int r9 = r9 + r5
                    r5 = 251516758(0xefdd756, float:6.2576676E-30)
                    r6 = r5 ^ r0
                    r0 = r0 & r5
                    r0 = r0 | r6
                    int r0 = ~r0
                    r5 = 843749519(0x324a988f, float:1.1792635E-8)
                    r6 = r5 ^ r0
                    r0 = r0 & r5
                    r0 = r0 | r6
                    int r0 = r0 * 318
                    r5 = r9 & r0
                    r0 = r0 | r9
                    int r5 = r5 + r0
                    r6 = 0
                    if (r4 > r5) goto L9f
                    r0 = 28
                    int r0 = r0 / r6
                L9f:
                    r4 = 16
                    r5 = 4
                    r8 = 0
                    r9 = 3
                    java.lang.String[] r0 = new java.lang.String[r3]     // Catch: java.lang.Exception -> L26e
                    r10 = 19
                    char[] r10 = new char[r10]     // Catch: java.lang.Exception -> L26e
                    r10 = {x0952: FILL_ARRAY_DATA , data: [10, 31, 21, 24, 23, 17, 13907, 13907, 33, 21, 3, 6, 13898, 13898, 28, 24, 33, 29, 13908} // fill-array     // Catch: java.lang.Exception -> L26e
                    java.lang.Object[] r11 = new java.lang.Object[r7]     // Catch: java.lang.Exception -> L26e
                    r12 = 19
                    r13 = 86
                    a(r12, r13, r10, r11)     // Catch: java.lang.Exception -> L26e
                    r10 = r11[r6]     // Catch: java.lang.Exception -> L26e
                    java.lang.String r10 = (java.lang.String) r10     // Catch: java.lang.Exception -> L26e
                    r0[r6] = r10     // Catch: java.lang.Exception -> L26e
                    r10 = 18
                    char[] r10 = new char[r10]     // Catch: java.lang.Exception -> L26e
                    r10 = {x096a: FILL_ARRAY_DATA , data: [18, 9, 11, 31, 6, 13, 34, 19, 15, 21, 21, 24, 23, 17, 13912, 13912, 33, 21} // fill-array     // Catch: java.lang.Exception -> L26e
                    int r11 = com.okinc.unified.fragment.CeFiKlineFragment$special$$inlined$activityViewModels$default$5.copydefault
                    r12 = r11 | 65
                    int r12 = r12 << r7
                    r11 = r11 ^ 65
                    int r12 = r12 - r11
                    int r11 = r12 % 128
                    com.okinc.unified.fragment.CeFiKlineFragment$special$$inlined$activityViewModels$default$5.AEQbTJ = r11
                    int r12 = r12 % r3
                    r11 = 18
                    r13 = 91
                    if (r12 == 0) goto Le2
                    java.lang.Object[] r12 = new java.lang.Object[r7]     // Catch: java.lang.Exception -> L26e
                    a(r11, r13, r10, r12)     // Catch: java.lang.Exception -> L26e
                    r10 = r12[r6]     // Catch: java.lang.Exception -> L26e
                    java.lang.String r10 = (java.lang.String) r10     // Catch: java.lang.Exception -> L26e
                    r0[r7] = r10     // Catch: java.lang.Exception -> L26e
                    goto Led
                Le2:
                    java.lang.Object[] r12 = new java.lang.Object[r7]     // Catch: java.lang.Exception -> L26e
                    a(r11, r13, r10, r12)     // Catch: java.lang.Exception -> L26e
                    r10 = r12[r6]     // Catch: java.lang.Exception -> L26e
                    java.lang.String r10 = (java.lang.String) r10     // Catch: java.lang.Exception -> L26e
                    r0[r7] = r10     // Catch: java.lang.Exception -> L26e
                Led:
                    r10 = r6
                Lee:
                    if (r10 >= r3) goto L21a
                    int r11 = com.okinc.unified.fragment.CeFiKlineFragment$special$$inlined$activityViewModels$default$5.AEQbTJ
                    int r11 = r11 + 29
                    int r12 = r11 % 128
                    com.okinc.unified.fragment.CeFiKlineFragment$special$$inlined$activityViewModels$default$5.copydefault = r12
                    int r11 = r11 % r3
                    r11 = r0[r10]     // Catch: java.lang.Exception -> L26e
                    char[] r12 = new char[r4]     // Catch: java.lang.Exception -> L26e
                    r12 = {x0980: FILL_ARRAY_DATA , data: [12, 18, 3, 16, 10, 8, 0, 34, 10, 33, 0, 24, 29, 15, 7, 35} // fill-array     // Catch: java.lang.Exception -> L26e
                    java.lang.Object[] r13 = new java.lang.Object[r7]     // Catch: java.lang.Exception -> L26e
                    r14 = 20
                    a(r4, r14, r12, r13)     // Catch: java.lang.Exception -> L26e
                    r12 = r13[r6]     // Catch: java.lang.Exception -> L26e
                    java.lang.String r12 = (java.lang.String) r12     // Catch: java.lang.Exception -> L26e
                    java.lang.Class r12 = java.lang.Class.forName(r12)     // Catch: java.lang.Exception -> L26e
                    java.lang.Class[] r13 = new java.lang.Class[r6]     // Catch: java.lang.Exception -> L26e
                    java.lang.reflect.Method r11 = r12.getMethod(r11, r13)     // Catch: java.lang.Exception -> L26e
                    java.lang.Object r11 = r11.invoke(r12, r8)     // Catch: java.lang.Exception -> L26e
                    java.lang.Boolean r11 = (java.lang.Boolean) r11     // Catch: java.lang.Exception -> L26e
                    boolean r11 = r11.booleanValue()     // Catch: java.lang.Exception -> L26e
                    if (r11 == 0) goto L206
                    int r0 = com.okinc.unified.fragment.CeFiKlineFragment$special$$inlined$activityViewModels$default$5.AEQbTJ
                    r10 = r0 | 81
                    int r10 = r10 << r7
                    r0 = r0 ^ 81
                    int r10 = r10 - r0
                    int r0 = r10 % 128
                    com.okinc.unified.fragment.CeFiKlineFragment$special$$inlined$activityViewModels$default$5.copydefault = r0
                    int r10 = r10 % r3
                    r0 = r1 & (-2)
                    int r10 = ~r1
                    r11 = r10 & 1
                    r0 = r0 | r11
                    java.lang.Object[] r11 = new java.lang.Object[r5]     // Catch: java.lang.Exception -> L26e
                    int[] r12 = new int[r7]     // Catch: java.lang.Exception -> L26e
                    r11[r6] = r12     // Catch: java.lang.Exception -> L26e
                    int[] r13 = new int[r7]     // Catch: java.lang.Exception -> L26e
                    r11[r3] = r13     // Catch: java.lang.Exception -> L26e
                    int[] r13 = new int[r7]     // Catch: java.lang.Exception -> L26e
                    r11[r9] = r13     // Catch: java.lang.Exception -> L26e
                    int[] r13 = (int[]) r13     // Catch: java.lang.Exception -> L26e
                    r13[r6] = r1     // Catch: java.lang.Exception -> L26e
                    int[] r12 = (int[]) r12     // Catch: java.lang.Exception -> L26e
                    r12[r6] = r0     // Catch: java.lang.Exception -> L26e
                    r11[r7] = r8     // Catch: java.lang.Exception -> L26e
                    long r12 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.Exception -> L26e
                    int r0 = (int) r12     // Catch: java.lang.Exception -> L26e
                    r12 = 811077737(0x30581069, float:7.860366E-10)
                    r13 = r12 | r0
                    int r13 = ~r13     // Catch: java.lang.Exception -> L26e
                    r13 = r13 | 4200(0x1068, float:5.885E-42)
                    int r13 = r13 * (-502)
                    r14 = 1825797083(0x6cd373db, float:2.0450437E27)
                    int r14 = r14 + r13
                    int r13 = ~r0     // Catch: java.lang.Exception -> L26e
                    r15 = 922320491(0x36f97e6b, float:7.4354953E-6)
                    r13 = r13 | r15
                    int r13 = ~r13     // Catch: java.lang.Exception -> L26e
                    int r13 = r13 * (-502)
                    int r14 = r14 + r13
                    r13 = -922316292(0xffffffffc90691fc, float:-551199.75)
                    r0 = r0 | r13
                    int r0 = ~r0     // Catch: java.lang.Exception -> L26e
                    r0 = r0 | r12
                    int r0 = r0 * 502
                    int r14 = r14 + r0
                    r0 = r14 | 16
                    int r0 = r0 << r7
                    r12 = r14 ^ 16
                    int r0 = r0 - r12
                    int r12 = r0 * 868
                    int r13 = r2 * 868
                    r14 = r12 & r13
                    r12 = r12 | r13
                    int r14 = r14 + r12
                    int r12 = ~r0     // Catch: java.lang.Exception -> L26e
                    r13 = r12 ^ r10
                    r15 = r12 & r10
                    r13 = r13 | r15
                    int r13 = ~r13     // Catch: java.lang.Exception -> L26e
                    int r15 = ~r2     // Catch: java.lang.Exception -> L26e
                    int r4 = ~r1     // Catch: java.lang.Exception -> L26e
                    r16 = r15 ^ r4
                    r4 = r4 & r15
                    r4 = r16 | r4
                    int r4 = ~r4     // Catch: java.lang.Exception -> L26e
                    r15 = r13 ^ r4
                    r4 = r4 & r13
                    r4 = r4 | r15
                    int r4 = r4 * (-867)
                    int r4 = -r4
                    int r4 = -r4
                    r13 = r14 ^ r4
                    r4 = r4 & r14
                    int r4 = r4 << r7
                    int r13 = r13 + r4
                    int r4 = ~r2     // Catch: java.lang.Exception -> L26e
                    r14 = r12 ^ r4
                    r15 = r12 & r4
                    r14 = r14 | r15
                    int r14 = ~r14     // Catch: java.lang.Exception -> L26e
                    int r15 = ~r0     // Catch: java.lang.Exception -> L26e
                    r16 = r15 ^ r1
                    r15 = r15 & r1
                    r15 = r16 | r15
                    int r15 = ~r15     // Catch: java.lang.Exception -> L26e
                    r16 = r14 ^ r15
                    r14 = r14 & r15
                    r14 = r16 | r14
                    r15 = r4 | r1
                    int r15 = ~r15     // Catch: java.lang.Exception -> L26e
                    r16 = r14 ^ r15
                    r14 = r14 & r15
                    r14 = r16 | r14
                    int r14 = r14 * (-1734)
                    r15 = r13 & r14
                    r13 = r13 | r14
                    int r15 = r15 + r13
                    r13 = r12 ^ r4
                    r14 = r12 & r4
                    r13 = r13 | r14
                    r14 = r13 ^ r10
                    r10 = r10 & r13
                    r10 = r10 | r14
                    int r10 = ~r10     // Catch: java.lang.Exception -> L26e
                    r12 = r12 | r2
                    r13 = r12 ^ r1
                    r12 = r12 & r1
                    r12 = r12 | r13
                    int r12 = ~r12     // Catch: java.lang.Exception -> L26e
                    r13 = r10 ^ r12
                    r10 = r10 & r12
                    r10 = r10 | r13
                    r12 = r4 ^ r0
                    r0 = r0 & r4
                    r0 = r0 | r12
                    r4 = r0 ^ r1
                    r0 = r0 & r1
                    r0 = r0 | r4
                    int r0 = ~r0     // Catch: java.lang.Exception -> L26e
                    r4 = r10 ^ r0
                    r0 = r0 & r10
                    r0 = r0 | r4
                    int r0 = r0 * 867
                    int r15 = r15 + r0
                    int r0 = r15 << 13
                    r4 = r15 & r0
                    int r4 = ~r4     // Catch: java.lang.Exception -> L26e
                    r0 = r0 | r15
                    r0 = r0 & r4
                    int r4 = r0 >>> 17
                    r0 = r0 ^ r4
                    int r4 = r0 << 5
                    int r10 = ~r4     // Catch: java.lang.Exception -> L26e
                    r10 = r10 & r0
                    int r0 = ~r0     // Catch: java.lang.Exception -> L26e
                    r0 = r0 & r4
                    r0 = r0 | r10
                    r4 = r11[r3]     // Catch: java.lang.Exception -> L26e
                    int[] r4 = (int[]) r4     // Catch: java.lang.Exception -> L26e
                    r4[r6] = r0     // Catch: java.lang.Exception -> L26e
                    int r0 = com.okinc.unified.fragment.CeFiKlineFragment$special$$inlined$activityViewModels$default$5.AEQbTJ
                    r4 = r0 ^ 69
                    r0 = r0 & 69
                    int r0 = r0 << r7
                    int r4 = r4 + r0
                    int r0 = r4 % 128
                    com.okinc.unified.fragment.CeFiKlineFragment$special$$inlined$activityViewModels$default$5.copydefault = r0
                    int r4 = r4 % r3
                    goto L354
                L206:
                    r4 = r10 & (-4)
                    r10 = r10 | (-4)
                    int r4 = r4 + r10
                    int r10 = r4 + 5
                    int r4 = com.okinc.unified.fragment.CeFiKlineFragment$special$$inlined$activityViewModels$default$5.copydefault
                    int r4 = r4 + 43
                    int r11 = r4 % 128
                    com.okinc.unified.fragment.CeFiKlineFragment$special$$inlined$activityViewModels$default$5.AEQbTJ = r11
                    int r4 = r4 % r3
                    r4 = 16
                    goto Lee
                L21a:
                    java.lang.Object[] r11 = new java.lang.Object[r5]     // Catch: java.lang.Exception -> L26e
                    int[] r0 = new int[r7]     // Catch: java.lang.Exception -> L26e
                    r11[r6] = r0     // Catch: java.lang.Exception -> L26e
                    int[] r4 = new int[r7]     // Catch: java.lang.Exception -> L26e
                    r11[r3] = r4     // Catch: java.lang.Exception -> L26e
                    int[] r4 = new int[r7]     // Catch: java.lang.Exception -> L26e
                    r11[r9] = r4     // Catch: java.lang.Exception -> L26e
                    int[] r4 = (int[]) r4     // Catch: java.lang.Exception -> L26e
                    r4[r6] = r1     // Catch: java.lang.Exception -> L26e
                    int[] r0 = (int[]) r0     // Catch: java.lang.Exception -> L26e
                    r0[r6] = r1     // Catch: java.lang.Exception -> L26e
                    r11[r7] = r8     // Catch: java.lang.Exception -> L26e
                    int r0 = android.os.Process.myTid()     // Catch: java.lang.Exception -> L26e
                    r4 = -693265688(0xffffffffd6ad9ae8, float:-9.5440414E13)
                    r10 = r0 | r4
                    int r10 = ~r10     // Catch: java.lang.Exception -> L26e
                    int r10 = r10 * 420
                    r12 = 1517892957(0x5a79355d, float:1.75364857E16)
                    int r10 = r10 + r12
                    int r0 = ~r0     // Catch: java.lang.Exception -> L26e
                    r0 = r0 | r4
                    int r0 = ~r0     // Catch: java.lang.Exception -> L26e
                    r4 = 111248032(0x6a182a0, float:6.0753405E-35)
                    r0 = r0 | r4
                    int r0 = r0 * 420
                    int r10 = r10 + r0
                    int r0 = r10 << 1
                    int r0 = r0 - r10
                    int r0 = -r0
                    int r0 = -r0
                    int r0 = ~r0     // Catch: java.lang.Exception -> L26e
                    int r0 = r2 - r0
                    int r0 = r0 - r7
                    int r4 = r0 << 13
                    int r10 = ~r4     // Catch: java.lang.Exception -> L26e
                    r10 = r10 & r0
                    int r0 = ~r0     // Catch: java.lang.Exception -> L26e
                    r0 = r0 & r4
                    r0 = r0 | r10
                    int r4 = r0 >>> 17
                    int r10 = ~r4     // Catch: java.lang.Exception -> L26e
                    r10 = r10 & r0
                    int r0 = ~r0     // Catch: java.lang.Exception -> L26e
                    r0 = r0 & r4
                    r0 = r0 | r10
                    int r4 = r0 << 5
                    r0 = r0 ^ r4
                    r4 = r11[r3]     // Catch: java.lang.Exception -> L26e
                    int[] r4 = (int[]) r4     // Catch: java.lang.Exception -> L26e
                    r4[r6] = r0     // Catch: java.lang.Exception -> L26e
                    goto L354
                L26e:
                    r0 = r1 & 2
                    int r0 = ~r0
                    r4 = r1 | 2
                    r0 = r0 & r4
                    java.lang.Object[] r11 = new java.lang.Object[r5]
                    int[] r4 = new int[r7]
                    r11[r6] = r4
                    int[] r10 = new int[r7]
                    r11[r3] = r10
                    int[] r10 = new int[r7]
                    r11[r9] = r10
                    int[] r10 = (int[]) r10
                    r10[r6] = r1
                    int[] r4 = (int[]) r4
                    r4[r6] = r0
                    r11[r7] = r8
                    int r0 = android.os.Process.myTid()
                    int r4 = ~r0
                    r10 = -564378004(0xffffffffde5c466c, float:-3.96812317E18)
                    r12 = r10 | r4
                    int r12 = ~r12
                    r13 = -453139450(0xffffffffe4fda406, float:-3.7430763E22)
                    r12 = r12 | r13
                    int r12 = r12 * (-602)
                    r14 = 278283660(0x1096458c, float:5.927172E-29)
                    int r14 = r14 + r12
                    r0 = r0 | r10
                    int r0 = ~r0
                    r10 = 547463170(0x20a1a002, float:2.7380345E-19)
                    r0 = r0 | r10
                    r10 = -436224617(0xffffffffe5ffbd97, float:-1.509626E23)
                    r10 = r10 | r4
                    int r10 = ~r10
                    r0 = r0 | r10
                    int r0 = r0 * (-301)
                    int r14 = r14 + r0
                    r0 = r4 | r13
                    int r0 = ~r0
                    int r0 = r0 * 301
                    int r14 = r14 + r0
                    int r0 = r14 * (-159)
                    r4 = -2544(0xfffffffffffff610, float:NaN)
                    r10 = r4 | r0
                    int r10 = r10 << r7
                    r0 = r0 ^ r4
                    int r10 = r10 - r0
                    r0 = r14 ^ (-17)
                    r4 = r14 & (-17)
                    r0 = r0 | r4
                    int r0 = r0 * 160
                    int r0 = ~r0
                    int r10 = r10 - r0
                    int r10 = r10 - r7
                    int r0 = ~r1
                    r4 = r0 ^ 16
                    r12 = 16
                    r0 = r0 & r12
                    r0 = r0 | r4
                    int r0 = ~r0
                    r4 = r14 ^ 16
                    r12 = r14 & 16
                    r4 = r4 | r12
                    int r4 = ~r4
                    r12 = r0 ^ r4
                    r0 = r0 & r4
                    r0 = r0 | r12
                    int r0 = r0 * (-160)
                    int r0 = -r0
                    int r0 = -r0
                    r4 = r10 ^ r0
                    r0 = r0 & r10
                    int r0 = r0 << r7
                    int r4 = r4 + r0
                    int r0 = ~r14
                    int r10 = ~r1
                    r12 = r0 ^ r10
                    r0 = r0 & r10
                    r0 = r0 | r12
                    int r0 = ~r0
                    r10 = r0 ^ 16
                    r12 = 16
                    r0 = r0 & r12
                    r0 = r0 | r10
                    int r0 = r0 * 160
                    r10 = r4 | r0
                    int r10 = r10 << r7
                    r0 = r0 ^ r4
                    int r10 = r10 - r0
                    int r0 = o.C31232lqD.Activity.copydefault()
                    int r4 = r10 * (-661)
                    int r12 = r2 * (-661)
                    int r12 = -r12
                    int r12 = -r12
                    r13 = r4 | r12
                    int r13 = r13 << r7
                    r4 = r4 ^ r12
                    int r13 = r13 - r4
                    int r4 = ~r0
                    int r12 = ~r10
                    int r14 = ~r2
                    r15 = r12 ^ r14
                    r14 = r14 & r12
                    r14 = r14 | r15
                    int r14 = ~r14
                    r15 = r4 ^ r14
                    r4 = r4 & r14
                    r4 = r4 | r15
                    int r4 = r4 * 1324
                    int r13 = r13 + r4
                    r4 = r10 ^ r0
                    r14 = r10 & r0
                    r4 = r4 | r14
                    int r4 = ~r4
                    r0 = r0 | r2
                    int r0 = ~r0
                    r0 = r0 | r4
                    int r0 = r0 * (-1324)
                    int r0 = -r0
                    int r0 = -r0
                    r4 = r13 & r0
                    r0 = r0 | r13
                    int r4 = r4 + r0
                    r0 = r12 ^ r2
                    r12 = r12 & r2
                    r0 = r0 | r12
                    int r0 = ~r0
                    int r12 = ~r2
                    r13 = r12 ^ r10
                    r10 = r10 & r12
                    r10 = r10 | r13
                    int r10 = ~r10
                    r12 = r0 ^ r10
                    r0 = r0 & r10
                    r0 = r0 | r12
                    int r0 = r0 * 662
                    r10 = r4 | r0
                    int r10 = r10 << r7
                    r0 = r0 ^ r4
                    int r10 = r10 - r0
                    int r0 = r10 << 13
                    int r4 = ~r0
                    r4 = r4 & r10
                    int r10 = ~r10
                    r0 = r0 & r10
                    r0 = r0 | r4
                    int r4 = r0 >>> 17
                    r0 = r0 ^ r4
                    int r4 = r0 << 5
                    int r10 = ~r4
                    r10 = r10 & r0
                    int r0 = ~r0
                    r0 = r0 & r4
                    r0 = r0 | r10
                    r4 = r11[r3]
                    int[] r4 = (int[]) r4
                    r4[r6] = r0
                L354:
                    r0 = r11[r6]
                    int[] r0 = (int[]) r0
                    r0 = r0[r6]
                    if (r1 == r0) goto L35e
                    goto L92f
                L35e:
                    r0 = 914885467(0x36880b5b, float:4.054438E-6)
                    java.lang.Object r0 = o.YY.EZpvd(r0)     // Catch: java.lang.Throwable -> L949
                    if (r0 != 0) goto L38a
                    r16 = 590(0x24e, float:8.27E-43)
                    r17 = 5
                    r18 = 0
                    r19 = 849921575(0x32a8c627, float:1.9647883E-8)
                    r20 = 0
                    byte r0 = (byte) r6     // Catch: java.lang.Throwable -> L949
                    byte r4 = (byte) r0     // Catch: java.lang.Throwable -> L949
                    int r10 = r4 + (-1)
                    byte r10 = (byte) r10     // Catch: java.lang.Throwable -> L949
                    java.lang.Object[] r11 = new java.lang.Object[r7]     // Catch: java.lang.Throwable -> L949
                    b(r0, r4, r10, r11)     // Catch: java.lang.Throwable -> L949
                    r0 = r11[r6]     // Catch: java.lang.Throwable -> L949
                    r21 = r0
                    java.lang.String r21 = (java.lang.String) r21     // Catch: java.lang.Throwable -> L949
                    java.lang.Class[] r0 = new java.lang.Class[r6]     // Catch: java.lang.Throwable -> L949
                    r22 = r0
                    java.lang.Object r0 = o.YY.EZpvd(r16, r17, r18, r19, r20, r21, r22)     // Catch: java.lang.Throwable -> L949
                L38a:
                    java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0     // Catch: java.lang.Throwable -> L949
                    java.lang.Object r0 = r0.invoke(r8, r8)     // Catch: java.lang.Throwable -> L949
                    java.lang.Long r0 = (java.lang.Long) r0     // Catch: java.lang.Throwable -> L949
                    long r10 = r0.longValue()     // Catch: java.lang.Throwable -> L949
                    int r0 = com.okinc.unified.fragment.CeFiKlineFragment$special$$inlined$activityViewModels$default$5.AEQbTJ
                    r4 = r0 ^ 119(0x77, float:1.67E-43)
                    r0 = r0 & 119(0x77, float:1.67E-43)
                    int r0 = r0 << r7
                    int r4 = r4 + r0
                    int r0 = r4 % 128
                    com.okinc.unified.fragment.CeFiKlineFragment$special$$inlined$activityViewModels$default$5.copydefault = r0
                    int r4 = r4 % r3
                    if (r4 == 0) goto L944
                    r4 = -2042532112(0xffffffff86416ef0, float:-3.638077E-35)
                    long r12 = (long) r4
                    r4 = -964(0xfffffffffffffc3c, float:NaN)
                    long r14 = (long) r4
                    r4 = -963(0xfffffffffffffc3d, float:NaN)
                    long r8 = (long) r4
                    long r8 = r8 * r12
                    long r8 = r8 + r14
                    r4 = 965(0x3c5, float:1.352E-42)
                    long r5 = (long) r4
                    long r5 = r5 * r10
                    long r8 = r8 + r5
                    r4 = -1
                    long r4 = (long) r4
                    long r20 = r12 ^ r4
                    long r10 = r10 ^ r4
                    r22 = r8
                    long r7 = (long) r1
                    long r24 = r10 | r7
                    long r24 = r24 ^ r4
                    long r20 = r20 | r24
                    long r20 = r20 * r14
                    long r20 = r22 + r20
                    long r7 = r7 ^ r4
                    long r7 = r7 | r10
                    long r7 = r7 ^ r4
                    long r9 = r10 | r12
                    long r4 = r4 ^ r9
                    long r4 = r4 | r7
                    long r14 = r14 * r4
                    long r20 = r20 + r14
                    r4 = 2053337027(0x7a636fc3, float:2.9522955E35)
                    long r4 = (long) r4
                    long r4 = r20 + r4
                    r7 = r0 | 79
                    r6 = 1
                    int r7 = r7 << r6
                    r8 = r0 ^ 79
                    int r7 = r7 - r8
                    int r8 = r7 % 128
                    com.okinc.unified.fragment.CeFiKlineFragment$special$$inlined$activityViewModels$default$5.AEQbTJ = r8
                    int r7 = r7 % r3
                    r7 = 32
                    long r7 = r4 >> r7
                    int r7 = (int) r7
                    int r8 = ~r1
                    r9 = 2145801038(0x7fe6534e, float:NaN)
                    r9 = r9 | r8
                    int r9 = ~r9
                    r10 = 711939846(0x2a6f5706, float:2.1257657E-13)
                    r10 = r10 | r1
                    int r10 = ~r10
                    r9 = r9 | r10
                    int r9 = r9 * 1900
                    r10 = 1871737038(0x6f9070ce, float:8.940443E28)
                    int r10 = r10 + r9
                    r9 = -711939847(0xffffffffd590a8f9, float:-1.98819258E13)
                    r11 = r8 | r9
                    int r11 = ~r11
                    r12 = -2145801039(0xffffffff8019acb1, float:-2.357837E-39)
                    r13 = r12 | r1
                    int r13 = ~r13
                    r11 = r11 | r13
                    int r11 = r11 * (-950)
                    int r10 = r10 + r11
                    r11 = r8 | r12
                    int r11 = ~r11
                    r9 = r9 | r1
                    int r9 = ~r9
                    r9 = r9 | r11
                    int r9 = r9 * 950
                    int r10 = r10 + r9
                    r7 = r7 & r10
                    int r4 = (int) r4
                    r5 = 1628122105(0x610b2bf9, float:1.6045412E20)
                    r5 = r5 | r1
                    int r5 = ~r5
                    r9 = 190895695(0xb60d64f, float:4.330206E-32)
                    r5 = r5 | r9
                    int r5 = r5 * (-366)
                    r9 = -2134586647(0xffffffff80c4cae9, float:-1.8072548E-38)
                    int r9 = r9 + r5
                    r5 = 1802239999(0x6b6bffff, float:2.8530647E26)
                    r5 = r5 | r1
                    int r5 = ~r5
                    r10 = 16777801(0x1000249, float:2.3511527E-38)
                    r5 = r5 | r10
                    int r5 = r5 * 366
                    int r9 = r9 + r5
                    r4 = r4 & r9
                    r4 = r4 | r7
                    long r4 = (long) r4
                    int r4 = (int) r4
                    r5 = -17
                    r6 = 1
                    if (r4 != r6) goto L5d9
                    int r0 = r0 + r6
                    int r4 = r0 % 128
                    com.okinc.unified.fragment.CeFiKlineFragment$special$$inlined$activityViewModels$default$5.AEQbTJ = r4
                    int r0 = r0 % r3
                    if (r0 == 0) goto L45b
                    r0 = r1 & (-111(0xffffffffffffff91, float:NaN))
                    r7 = r8 & 110(0x6e, float:1.54E-43)
                    r0 = r0 | r7
                    r7 = 5
                    java.lang.Object[] r7 = new java.lang.Object[r7]
                    r9 = 0
                    int[] r10 = new int[r9]
                    r7[r9] = r10
                    int[] r10 = new int[r9]
                    r11 = 3
                    r7[r11] = r10
                    int[] r10 = new int[r9]
                    r7[r3] = r10
                    r6 = 1
                    r11 = 3
                    goto L473
                L45b:
                    r9 = 0
                    r0 = r1 & (-11)
                    r7 = r8 & 10
                    r0 = r0 | r7
                    r7 = 4
                    java.lang.Object[] r10 = new java.lang.Object[r7]
                    r6 = 1
                    int[] r7 = new int[r6]
                    r10[r9] = r7
                    int[] r7 = new int[r6]
                    r10[r3] = r7
                    int[] r7 = new int[r6]
                    r11 = 3
                    r10[r11] = r7
                    r7 = r10
                L473:
                    r10 = r7[r11]
                    int[] r10 = (int[]) r10
                    r10[r9] = r1
                    r10 = r7[r9]
                    int[] r10 = (int[]) r10
                    r9 = r4 | 13
                    int r9 = r9 << r6
                    r4 = r4 ^ 13
                    int r9 = r9 - r4
                    int r4 = r9 % 128
                    com.okinc.unified.fragment.CeFiKlineFragment$special$$inlined$activityViewModels$default$5.copydefault = r4
                    int r9 = r9 % r3
                    r4 = 0
                    r10[r4] = r0
                    r4 = 0
                    r7[r6] = r4
                    int r0 = android.os.Process.myPid()
                    r4 = -180777964(0xfffffffff5398c14, float:-2.35209E32)
                    r4 = r4 | r0
                    int r4 = ~r4
                    int r9 = ~r0
                    r10 = -69539410(0xfffffffffbdae9ae, float:-2.2733206E36)
                    r10 = r10 | r9
                    int r10 = ~r10
                    r4 = r4 | r10
                    int r4 = r4 * (-1808)
                    r10 = -1235122943(0xffffffffb6618501, float:-3.3605031E-6)
                    int r10 = r10 + r4
                    r4 = -180511147(0xfffffffff53d9e55, float:-2.4036999E32)
                    r4 = r4 | r0
                    int r4 = ~r4
                    r11 = 180777963(0xac673eb, float:1.911031E-32)
                    r11 = r11 | r9
                    r12 = -69272593(0xfffffffffbdefbef, float:-2.3155994E36)
                    r9 = r9 | r12
                    int r9 = ~r9
                    r4 = r4 | r9
                    int r4 = r4 * 904
                    int r10 = r10 + r4
                    r4 = 69539409(0x4251651, float:1.9405904E-36)
                    r0 = r0 | r4
                    int r0 = ~r0
                    r4 = 266817(0x41241, float:3.7389E-40)
                    r0 = r0 | r4
                    int r4 = ~r11
                    r0 = r0 | r4
                    int r0 = r0 * 904
                    int r10 = r10 + r0
                    int r0 = com.okinc.unified.fragment.CeFiKlineFragment$special$$inlined$activityViewModels$default$5.copydefault
                    r4 = r0 | 117(0x75, float:1.64E-43)
                    r6 = 1
                    int r4 = r4 << r6
                    r0 = r0 ^ 117(0x75, float:1.64E-43)
                    int r4 = r4 - r0
                    int r0 = r4 % 128
                    com.okinc.unified.fragment.CeFiKlineFragment$special$$inlined$activityViewModels$default$5.AEQbTJ = r0
                    int r4 = r4 % r3
                    if (r4 == 0) goto L4f1
                    r0 = -949(0xfffffffffffffc4b, float:NaN)
                    int r0 = r0 % r10
                    r4 = -5
                    int r0 = r4 << r0
                    int r4 = ~r10
                    r9 = r4 ^ r8
                    r4 = r4 & r8
                    r4 = r4 | r9
                    int r4 = ~r4
                    r9 = r5 ^ r1
                    r11 = r5 & r1
                    r9 = r9 | r11
                    int r9 = ~r9
                    r11 = r4 ^ r9
                    r4 = r4 & r9
                    r4 = r4 | r11
                    int r4 = -r4
                    int r4 = -r4
                    int r4 = ~r4
                    int r4 = 1899 - r4
                    int r0 = r0 >>> r4
                    goto L50b
                L4f1:
                    int r0 = r10 * (-949)
                    int r0 = -r0
                    int r0 = -r0
                    int r0 = ~r0
                    int r0 = (-15185) - r0
                    int r4 = ~r10
                    r9 = r4 ^ r8
                    r4 = r4 & r8
                    r4 = r4 | r9
                    int r4 = ~r4
                    r9 = r5 ^ r1
                    r11 = r5 & r1
                    r9 = r9 | r11
                    int r9 = ~r9
                    r11 = r4 ^ r9
                    r4 = r4 & r9
                    r4 = r4 | r11
                    int r4 = r4 * 1900
                    int r0 = r0 + r4
                L50b:
                    r4 = r8 ^ 16
                    r9 = r8 & 16
                    r4 = r4 | r9
                    int r4 = ~r4
                    r9 = r10 ^ r1
                    r11 = r10 & r1
                    r9 = r9 | r11
                    int r9 = ~r9
                    r11 = r4 ^ r9
                    r4 = r4 & r9
                    r4 = r4 | r11
                    r9 = -950(0xfffffffffffffc4a, float:NaN)
                    int r9 = r9 * r4
                    r4 = r0 | r9
                    r6 = 1
                    int r4 = r4 << r6
                    r0 = r0 ^ r9
                    int r4 = r4 - r0
                    r0 = r8 ^ r10
                    r9 = r8 & r10
                    r0 = r0 | r9
                    int r0 = ~r0
                    r9 = r1 ^ 16
                    r10 = r1 & 16
                    r9 = r9 | r10
                    int r9 = ~r9
                    r10 = r0 ^ r9
                    r0 = r0 & r9
                    r0 = r0 | r10
                    int r0 = r0 * 950
                    r9 = r4 ^ r0
                    r0 = r0 & r4
                    r4 = 1
                    int r0 = r0 << r4
                    int r9 = r9 + r0
                    int r0 = o.C31232lqD.Activity.copydefault()
                    int r4 = r9 * 303
                    int r10 = r2 * (-301)
                    int r4 = r4 + r10
                    int r10 = ~r9
                    int r11 = ~r0
                    r11 = r11 | r10
                    r12 = r11 ^ r2
                    r11 = r11 & r2
                    r11 = r11 | r12
                    int r11 = ~r11
                    r12 = r9 ^ r2
                    r13 = r9 & r2
                    r12 = r12 | r13
                    r13 = r12 ^ r0
                    r12 = r12 & r0
                    r12 = r12 | r13
                    int r12 = ~r12
                    int r13 = com.okinc.unified.fragment.CeFiKlineFragment$special$$inlined$activityViewModels$default$5.copydefault
                    int r13 = r13 + 49
                    int r14 = r13 % 128
                    com.okinc.unified.fragment.CeFiKlineFragment$special$$inlined$activityViewModels$default$5.AEQbTJ = r14
                    int r13 = r13 % r3
                    r14 = -302(0xfffffffffffffed2, float:NaN)
                    r11 = r11 | r12
                    if (r13 == 0) goto L58f
                    int r14 = r14 / r11
                    int r4 = r4 >>> r14
                    r11 = r10 ^ r2
                    r10 = r10 & r2
                    r10 = r10 | r11
                    r11 = r10 ^ r0
                    r10 = r10 & r0
                    r10 = r10 | r11
                    int r10 = ~r10
                    r11 = -604(0xfffffffffffffda4, float:NaN)
                    int r10 = r11 >> r10
                    int r10 = -r10
                    int r10 = -r10
                    r11 = r4 ^ r10
                    r4 = r4 & r10
                    r6 = 1
                    int r4 = r4 << r6
                    int r11 = r11 + r4
                    int r4 = ~r2
                    r4 = r4 | r9
                    int r4 = ~r4
                    r9 = r2 ^ r0
                    r0 = r0 & r2
                    r0 = r0 | r9
                    int r0 = ~r0
                    r9 = r4 ^ r0
                    r0 = r0 & r4
                    r0 = r0 | r9
                    r4 = 302(0x12e, float:4.23E-43)
                    int r0 = r4 >> r0
                    int r0 = r11 >> r0
                    goto L5c3
                L58f:
                    int r11 = r11 * r14
                    int r11 = -r11
                    int r11 = -r11
                    r12 = r4 ^ r11
                    r4 = r4 & r11
                    r6 = 1
                    int r4 = r4 << r6
                    int r12 = r12 + r4
                    r4 = r10 ^ r2
                    r10 = r10 & r2
                    r4 = r4 | r10
                    r10 = r4 ^ r0
                    r4 = r4 & r0
                    r4 = r4 | r10
                    int r4 = ~r4
                    int r4 = r4 * (-604)
                    r10 = r12 ^ r4
                    r4 = r4 & r12
                    r6 = 1
                    int r4 = r4 << r6
                    int r10 = r10 + r4
                    int r4 = ~r2
                    r11 = r4 ^ r9
                    r4 = r4 & r9
                    r4 = r4 | r11
                    int r4 = ~r4
                    r9 = r2 ^ r0
                    r0 = r0 & r2
                    r0 = r0 | r9
                    int r0 = ~r0
                    r9 = r4 ^ r0
                    r0 = r0 & r4
                    r0 = r0 | r9
                    int r0 = r0 * 302
                    int r0 = -r0
                    int r0 = -r0
                    r4 = r10 | r0
                    r6 = 1
                    int r4 = r4 << r6
                    r0 = r0 ^ r10
                    int r0 = r4 - r0
                L5c3:
                    int r4 = r0 << 13
                    r0 = r0 ^ r4
                    int r4 = r0 >>> 17
                    int r9 = ~r4
                    r9 = r9 & r0
                    int r0 = ~r0
                    r0 = r0 & r4
                    r0 = r0 | r9
                    int r4 = r0 << 5
                    r0 = r0 ^ r4
                    r4 = r7[r3]
                    int[] r4 = (int[]) r4
                    r9 = 0
                    r4[r9] = r0
                    r11 = r7
                    goto L62b
                L5d9:
                    r4 = 4
                    r9 = 0
                    java.lang.Object[] r0 = new java.lang.Object[r4]
                    r4 = 1
                    int[] r6 = new int[r4]
                    r0[r9] = r6
                    int[] r7 = new int[r4]
                    r0[r3] = r7
                    int[] r10 = new int[r4]
                    r11 = 3
                    r0[r11] = r10
                    int[] r10 = (int[]) r10
                    r10[r9] = r1
                    int[] r6 = (int[]) r6
                    r6[r9] = r1
                    r6 = 0
                    r0[r4] = r6
                    r4 = 928978986(0x375f182a, float:1.3297462E-5)
                    r9 = r1 | r4
                    int r9 = ~r9
                    r10 = 10527376(0xa0a290, float:1.4751996E-38)
                    r9 = r9 | r10
                    int r9 = r9 * 305
                    r10 = -320740540(0xffffffffece1e344, float:-2.1846523E27)
                    int r10 = r10 + r9
                    r4 = r4 | r8
                    int r4 = ~r4
                    r9 = 817740432(0x30bdba90, float:1.3804584E-9)
                    r4 = r4 | r9
                    int r4 = r4 * 305
                    int r10 = r10 + r4
                    int r4 = ~r10
                    int r4 = r2 - r4
                    r6 = 1
                    int r4 = r4 - r6
                    int r9 = r4 << 13
                    r4 = r4 ^ r9
                    int r9 = r4 >>> 17
                    r10 = r4 & r9
                    int r10 = ~r10
                    r4 = r4 | r9
                    r4 = r4 & r10
                    int r9 = r4 << 5
                    int r10 = ~r9
                    r10 = r10 & r4
                    int r4 = ~r4
                    r4 = r4 & r9
                    r4 = r4 | r10
                    int[] r7 = (int[]) r7
                    r9 = 0
                    r7[r9] = r4
                    r11 = r0
                L62b:
                    r0 = r11[r9]
                    int[] r0 = (int[]) r0
                    r0 = r0[r9]
                    if (r1 == r0) goto L635
                    goto L92f
                L635:
                    r4 = 11
                    java.io.File r0 = new java.io.File     // Catch: java.lang.Exception -> L6ae
                    r7 = 40
                    char[] r7 = new char[r7]     // Catch: java.lang.Exception -> L6ae
                    r7 = {x0994: FILL_ARRAY_DATA , data: [16, 32, 34, 4, 20, 2, 33, 21, 15, 24, 20, 17, 3, 28, 23, 17, 32, 13, 33, 17, 11, 24, 6, 13, 32, 13, 35, 17, 13825, 13825, 24, 15, 32, 11, 33, 17, 11, 24, 33, 21} // fill-array     // Catch: java.lang.Exception -> L6ae
                    r6 = 1
                    java.lang.Object[] r9 = new java.lang.Object[r6]     // Catch: java.lang.Exception -> L6ae
                    r10 = 40
                    r11 = 25
                    a(r10, r11, r7, r9)     // Catch: java.lang.Exception -> L6ae
                    r7 = 0
                    r9 = r9[r7]     // Catch: java.lang.Exception -> L6ae
                    java.lang.String r9 = (java.lang.String) r9     // Catch: java.lang.Exception -> L6ae
                    r0.<init>(r9)     // Catch: java.lang.Exception -> L6ae
                    int r7 = com.okinc.unified.fragment.CeFiKlineFragment$special$$inlined$activityViewModels$default$5.copydefault
                    int r7 = r7 + 87
                    int r9 = r7 % 128
                    com.okinc.unified.fragment.CeFiKlineFragment$special$$inlined$activityViewModels$default$5.AEQbTJ = r9
                    int r7 = r7 % r3
                    if (r7 == 0) goto L66b
                    boolean r7 = r0.canRead()     // Catch: java.lang.Exception -> L6ae
                    r9 = 67
                    r10 = 0
                    int r9 = r9 / r10
                    if (r7 != 0) goto L672
                    goto L671
                L668:
                    r0 = move-exception
                    r1 = r0
                    throw r1
                L66b:
                    boolean r7 = r0.canRead()     // Catch: java.lang.Exception -> L6ae
                    if (r7 != 0) goto L672
                L671:
                    goto L6b6
                L672:
                    java.io.FileReader r7 = new java.io.FileReader     // Catch: java.lang.Exception -> L6ae
                    r7.<init>(r0)     // Catch: java.lang.Exception -> L6ae
                    java.io.BufferedReader r9 = new java.io.BufferedReader     // Catch: java.lang.Exception -> L6ae
                    r9.<init>(r7)     // Catch: java.lang.Exception -> L6ae
                    java.lang.String r0 = r9.readLine()     // Catch: java.lang.Throwable -> L6a6
                    r10 = 3
                    char[] r11 = new char[r10]     // Catch: java.lang.Throwable -> L6a6
                    r11 = {x09c0: FILL_ARRAY_DATA , data: [15, 6, 13806} // fill-array     // Catch: java.lang.Throwable -> L6a6
                    r6 = 1
                    java.lang.Object[] r12 = new java.lang.Object[r6]     // Catch: java.lang.Throwable -> L6a6
                    r13 = 4
                    a(r10, r13, r11, r12)     // Catch: java.lang.Throwable -> L6a6
                    r10 = 0
                    r11 = r12[r10]     // Catch: java.lang.Throwable -> L6a6
                    java.lang.String r11 = (java.lang.String) r11     // Catch: java.lang.Throwable -> L6a6
                    boolean r10 = r0.equals(r11)     // Catch: java.lang.Throwable -> L6a6
                    if (r10 != 0) goto L69f
                    r7.close()     // Catch: java.lang.Exception -> L6ae
                    r9.close()     // Catch: java.lang.Exception -> L6ae
                    goto L6b7
                L69f:
                    r7.close()     // Catch: java.lang.Exception -> L6ae
                    r9.close()     // Catch: java.lang.Exception -> L6ae
                    goto L6ae
                L6a6:
                    r0 = move-exception
                    r7.close()     // Catch: java.lang.Exception -> L6ae
                    r9.close()     // Catch: java.lang.Exception -> L6ae
                    throw r0     // Catch: java.lang.Exception -> L6ae
                L6ae:
                    int r0 = com.okinc.unified.fragment.CeFiKlineFragment$special$$inlined$activityViewModels$default$5.AEQbTJ
                    int r0 = r0 + r4
                    int r7 = r0 % 128
                    com.okinc.unified.fragment.CeFiKlineFragment$special$$inlined$activityViewModels$default$5.copydefault = r7
                    int r0 = r0 % r3
                L6b6:
                    r0 = 0
                L6b7:
                    java.io.File r7 = new java.io.File     // Catch: java.lang.Exception -> L890
                    r9 = 31
                    char[] r9 = new char[r9]     // Catch: java.lang.Exception -> L890
                    r9 = {x09c8: FILL_ARRAY_DATA , data: [20, 32, 21, 15, 26, 17, 4, 34, 32, 16, 33, 26, 16, 13, 29, 21, 12, 26, 33, 17, 11, 24, 26, 9, 24, 15, 11, 12, 21, 29, 13833} // fill-array     // Catch: java.lang.Exception -> L890
                    r6 = 1
                    java.lang.Object[] r10 = new java.lang.Object[r6]     // Catch: java.lang.Exception -> L890
                    r11 = 31
                    a(r11, r4, r9, r10)     // Catch: java.lang.Exception -> L890
                    r4 = 0
                    r9 = r10[r4]     // Catch: java.lang.Exception -> L890
                    java.lang.String r9 = (java.lang.String) r9     // Catch: java.lang.Exception -> L890
                    r7.<init>(r9)     // Catch: java.lang.Exception -> L890
                    boolean r4 = r7.canRead()     // Catch: java.lang.Exception -> L890
                    r9 = 26
                    r6 = 1
                    if (r4 == r6) goto L6f4
                    int r4 = com.okinc.unified.fragment.CeFiKlineFragment$special$$inlined$activityViewModels$default$5.AEQbTJ
                    int r4 = r4 + 21
                    int r7 = r4 % 128
                    com.okinc.unified.fragment.CeFiKlineFragment$special$$inlined$activityViewModels$default$5.copydefault = r7
                    int r4 = r4 % r3
                    if (r4 != 0) goto L6e6
                    r4 = 1
                    goto L6e7
                L6e6:
                    r4 = 0
                L6e7:
                    r10 = r7 | 121(0x79, float:1.7E-43)
                    r6 = 1
                    int r10 = r10 << r6
                    r7 = r7 ^ 121(0x79, float:1.7E-43)
                    int r10 = r10 - r7
                    int r7 = r10 % 128
                    com.okinc.unified.fragment.CeFiKlineFragment$special$$inlined$activityViewModels$default$5.AEQbTJ = r7
                    int r10 = r10 % r3
                    goto L71e
                L6f4:
                    java.io.FileReader r4 = new java.io.FileReader     // Catch: java.lang.Exception -> L890
                    r4.<init>(r7)     // Catch: java.lang.Exception -> L890
                    java.io.BufferedReader r7 = new java.io.BufferedReader     // Catch: java.lang.Exception -> L890
                    r7.<init>(r4)     // Catch: java.lang.Exception -> L890
                    java.lang.String r10 = r7.readLine()     // Catch: java.lang.Throwable -> L888
                    r6 = 1
                    char[] r11 = new char[r6]     // Catch: java.lang.Throwable -> L888
                    r12 = 13765(0x35c5, float:1.9289E-41)
                    r13 = 0
                    r11[r13] = r12     // Catch: java.lang.Throwable -> L888
                    java.lang.Object[] r12 = new java.lang.Object[r6]     // Catch: java.lang.Throwable -> L888
                    a(r6, r9, r11, r12)     // Catch: java.lang.Throwable -> L888
                    r11 = r12[r13]     // Catch: java.lang.Throwable -> L888
                    java.lang.String r11 = (java.lang.String) r11     // Catch: java.lang.Throwable -> L888
                    boolean r10 = r10.equals(r11)     // Catch: java.lang.Throwable -> L888
                    r4.close()     // Catch: java.lang.Exception -> L890
                    r7.close()     // Catch: java.lang.Exception -> L890
                    r4 = r10
                L71e:
                    if (r4 == 0) goto L890
                    java.io.File r4 = new java.io.File     // Catch: java.lang.Exception -> L890
                    r7 = 36
                    char[] r7 = new char[r7]     // Catch: java.lang.Exception -> L890
                    r7 = {x09ec: FILL_ARRAY_DATA , data: [16, 32, 34, 4, 20, 2, 33, 21, 15, 24, 20, 17, 3, 28, 23, 17, 32, 13, 33, 17, 11, 24, 6, 13, 32, 13, 33, 17, 11, 24, 6, 13, 32, 7, 6, 15} // fill-array     // Catch: java.lang.Exception -> L890
                    r6 = 1
                    java.lang.Object[] r10 = new java.lang.Object[r6]     // Catch: java.lang.Exception -> L890
                    r11 = 36
                    r12 = 52
                    a(r11, r12, r7, r10)     // Catch: java.lang.Exception -> L890
                    r7 = 0
                    r10 = r10[r7]     // Catch: java.lang.Exception -> L890
                    java.lang.String r10 = (java.lang.String) r10     // Catch: java.lang.Exception -> L890
                    r4.<init>(r10)     // Catch: java.lang.Exception -> L890
                    boolean r7 = r4.canRead()     // Catch: java.lang.Exception -> L890
                    if (r7 != 0) goto L743
                    goto L890
                L743:
                    java.io.FileReader r7 = new java.io.FileReader     // Catch: java.lang.Exception -> L890
                    r7.<init>(r4)     // Catch: java.lang.Exception -> L890
                    java.io.BufferedReader r4 = new java.io.BufferedReader     // Catch: java.lang.Exception -> L890
                    r4.<init>(r7)     // Catch: java.lang.Exception -> L890
                    int r10 = com.okinc.unified.fragment.CeFiKlineFragment$special$$inlined$activityViewModels$default$5.copydefault
                    int r10 = r10 + 51
                    int r11 = r10 % 128
                    com.okinc.unified.fragment.CeFiKlineFragment$special$$inlined$activityViewModels$default$5.AEQbTJ = r11
                    int r10 = r10 % r3
                    java.lang.String r10 = r4.readLine()     // Catch: java.lang.Throwable -> L880
                    r6 = 1
                    char[] r11 = new char[r6]     // Catch: java.lang.Throwable -> L880
                    r12 = 13765(0x35c5, float:1.9289E-41)
                    r13 = 0
                    r11[r13] = r12     // Catch: java.lang.Throwable -> L880
                    java.lang.Object[] r12 = new java.lang.Object[r6]     // Catch: java.lang.Throwable -> L880
                    a(r6, r9, r11, r12)     // Catch: java.lang.Throwable -> L880
                    r9 = r12[r13]     // Catch: java.lang.Throwable -> L880
                    java.lang.String r9 = (java.lang.String) r9     // Catch: java.lang.Throwable -> L880
                    int r11 = com.okinc.unified.fragment.CeFiKlineFragment$special$$inlined$activityViewModels$default$5.copydefault
                    r12 = r11 & 43
                    r11 = r11 | 43
                    int r12 = r12 + r11
                    int r11 = r12 % 128
                    com.okinc.unified.fragment.CeFiKlineFragment$special$$inlined$activityViewModels$default$5.AEQbTJ = r11
                    int r12 = r12 % r3
                    boolean r9 = r10.equals(r9)     // Catch: java.lang.Throwable -> L880
                    r7.close()     // Catch: java.lang.Exception -> L890
                    r4.close()     // Catch: java.lang.Exception -> L890
                    if (r9 == 0) goto L890
                    if (r0 == 0) goto L890
                    int r4 = com.okinc.unified.fragment.CeFiKlineFragment$special$$inlined$activityViewModels$default$5.copydefault
                    r7 = r4 ^ 13
                    r4 = r4 & 13
                    r6 = 1
                    int r4 = r4 << r6
                    int r7 = r7 + r4
                    int r4 = r7 % 128
                    com.okinc.unified.fragment.CeFiKlineFragment$special$$inlined$activityViewModels$default$5.AEQbTJ = r4
                    int r7 = r7 % r3
                    r4 = r1 & 20
                    int r4 = ~r4
                    r7 = r1 | 20
                    r4 = r4 & r7
                    r7 = 4
                    java.lang.Object[] r11 = new java.lang.Object[r7]
                    r6 = 1
                    int[] r7 = new int[r6]
                    o.C31232lqD.Activity.copydefault()
                    r9 = 0
                    r11[r9] = r7
                    int[] r10 = new int[r6]
                    r11[r3] = r10
                    int[] r10 = new int[r6]
                    r12 = 3
                    r11[r12] = r10
                    int[] r10 = (int[]) r10
                    r10[r9] = r1
                    int[] r7 = (int[]) r7
                    int r1 = com.okinc.unified.fragment.CeFiKlineFragment$special$$inlined$activityViewModels$default$5.copydefault
                    int r1 = r1 + 101
                    int r9 = r1 % 128
                    com.okinc.unified.fragment.CeFiKlineFragment$special$$inlined$activityViewModels$default$5.AEQbTJ = r9
                    int r1 = r1 % r3
                    if (r1 == 0) goto L7e1
                    r1 = 1
                    r7[r1] = r4
                    r11[r1] = r0
                    long r0 = android.os.Process.getStartUptimeMillis()
                    int r0 = (int) r0
                    int r0 = ~r0
                    r1 = 12998449(0xc65731, float:1.8214707E-38)
                    r0 = r0 | r1
                    int r0 = ~r0
                    r1 = 282897(0x45111, float:3.96423E-40)
                    r1 = r1 | r0
                    int r1 = r1 * (-374)
                    r4 = -243607121(0xfffffffff17ad9af, float:-1.24215065E30)
                    int r1 = r1 + r4
                    r4 = 12715552(0xc20620, float:1.7818283E-38)
                    r0 = r0 | r4
                    int r0 = r0 * 374
                    int r1 = r1 + r0
                    goto L804
                L7e1:
                    r1 = 0
                    r7[r1] = r4
                    r1 = 1
                    r11[r1] = r0
                    long r0 = android.os.SystemClock.elapsedRealtime()
                    int r0 = (int) r0
                    r1 = -111414683(0xfffffffff95bf265, float:-7.1376835E34)
                    int r4 = ~r0
                    r1 = r1 | r4
                    int r1 = ~r1
                    r4 = 176128(0x2b000, float:2.46808E-40)
                    r1 = r1 | r4
                    int r1 = r1 * (-591)
                    r4 = 1636898414(0x6191166e, float:3.3454927E20)
                    int r4 = r4 + r1
                    r1 = -111414683(0xfffffffff95bf265, float:-7.1376835E34)
                    r0 = r0 | r1
                    int r0 = r0 * 591
                    int r1 = r4 + r0
                L804:
                    int r0 = com.okinc.unified.fragment.CeFiKlineFragment$special$$inlined$activityViewModels$default$5.copydefault
                    r4 = r0 | 67
                    r6 = 1
                    int r4 = r4 << r6
                    r7 = r0 ^ 67
                    int r4 = r4 - r7
                    int r7 = r4 % 128
                    com.okinc.unified.fragment.CeFiKlineFragment$special$$inlined$activityViewModels$default$5.AEQbTJ = r7
                    int r4 = r4 % r3
                    if (r4 == 0) goto L81b
                    r4 = 242(0xf2, float:3.39E-43)
                    int r4 = r4 >> r1
                    r7 = 3
                    int r9 = r7 / r4
                    goto L820
                L81b:
                    int r4 = r1 * 242
                    int r4 = ~r4
                    int r9 = 7727 - r4
                L820:
                    int r4 = ~r1
                    r7 = r5 ^ r4
                    r4 = r4 & r5
                    r4 = r4 | r7
                    int r4 = ~r4
                    r7 = r5 ^ r8
                    r10 = r5 & r8
                    r7 = r7 | r10
                    int r7 = ~r7
                    r10 = r4 ^ r7
                    r4 = r4 & r7
                    r4 = r4 | r10
                    r7 = -241(0xffffffffffffff0f, float:NaN)
                    int r7 = r7 * r4
                    int r9 = r9 + r7
                    r4 = r1 ^ 16
                    r7 = r1 & 16
                    r4 = r4 | r7
                    int r4 = r4 * (-482)
                    int r4 = -r4
                    int r4 = -r4
                    int r4 = ~r4
                    int r9 = r9 - r4
                    r4 = 1
                    int r9 = r9 - r4
                    int r0 = r0 + 123
                    int r4 = r0 % 128
                    com.okinc.unified.fragment.CeFiKlineFragment$special$$inlined$activityViewModels$default$5.AEQbTJ = r4
                    int r0 = r0 % r3
                    int r0 = ~r1
                    r4 = r0 ^ 16
                    r7 = 16
                    r0 = r0 & r7
                    r0 = r0 | r4
                    int r0 = ~r0
                    r4 = r5 ^ r8
                    r5 = r5 & r8
                    r4 = r4 | r5
                    r5 = r4 ^ r1
                    r1 = r1 & r4
                    r1 = r1 | r5
                    int r1 = ~r1
                    r0 = r0 | r1
                    r1 = 241(0xf1, float:3.38E-43)
                    int r1 = r1 * r0
                    r0 = r9 ^ r1
                    r1 = r1 & r9
                    r4 = 1
                    int r1 = r1 << r4
                    int r0 = r0 + r1
                    int r0 = -r0
                    int r0 = -r0
                    r1 = r2 | r0
                    int r1 = r1 << r4
                    r0 = r0 ^ r2
                    int r1 = r1 - r0
                    int r0 = r1 << 13
                    int r2 = ~r0
                    r2 = r2 & r1
                    int r1 = ~r1
                    r0 = r0 & r1
                    r0 = r0 | r2
                    int r1 = r0 >>> 17
                    r0 = r0 ^ r1
                    int r1 = r0 << 5
                    r0 = r0 ^ r1
                    r1 = r11[r3]
                    int[] r1 = (int[]) r1
                    r2 = 0
                    r1[r2] = r0
                    goto L92f
                L880:
                    r0 = move-exception
                    r7.close()     // Catch: java.lang.Exception -> L890
                    r4.close()     // Catch: java.lang.Exception -> L890
                    throw r0     // Catch: java.lang.Exception -> L890
                L888:
                    r0 = move-exception
                    r4.close()     // Catch: java.lang.Exception -> L890
                    r7.close()     // Catch: java.lang.Exception -> L890
                    throw r0     // Catch: java.lang.Exception -> L890
                L890:
                    r4 = 4
                    java.lang.Object[] r11 = new java.lang.Object[r4]
                    r4 = 1
                    int[] r0 = new int[r4]
                    r5 = 0
                    r11[r5] = r0
                    int[] r6 = new int[r4]
                    r11[r3] = r6
                    int[] r6 = new int[r4]
                    r7 = 3
                    r11[r7] = r6
                    int[] r6 = (int[]) r6
                    r6[r5] = r1
                    int[] r0 = (int[]) r0
                    r0[r5] = r1
                    r5 = 0
                    r11[r4] = r5
                    r0 = 806503512(0x30124458, float:5.3211613E-10)
                    r0 = r0 | r8
                    int r0 = r0 * (-192)
                    r4 = -5795751(0xffffffffffa79059, float:NaN)
                    int r4 = r4 + r0
                    r0 = 816998238(0x30b2675e, float:1.2980583E-9)
                    r0 = r0 | r8
                    int r0 = ~r0
                    r5 = 121733280(0x74180a0, float:1.4557506E-34)
                    r0 = r0 | r5
                    int r0 = r0 * (-384)
                    int r4 = r4 + r0
                    r0 = -121733281(0xfffffffff8be7f5f, float:-3.0909994E34)
                    r0 = r0 | r1
                    int r0 = ~r0
                    r5 = 938731518(0x37f3e7fe, float:2.9075887E-5)
                    r5 = r5 | r8
                    int r5 = ~r5
                    r0 = r0 | r5
                    r5 = -10494727(0xffffffffff5fdcf9, float:-2.975652E38)
                    r1 = r1 | r5
                    int r1 = ~r1
                    r0 = r0 | r1
                    int r0 = r0 * 192
                    int r4 = r4 + r0
                    int r0 = o.C31232lqD.Activity.copydefault()
                    int r1 = r4 * (-301)
                    int r5 = ~r0
                    r7 = -1
                    r7 = r7 ^ r5
                    r5 = r5 | r7
                    r5 = r5 | r4
                    int r5 = ~r5
                    r7 = r4 | r0
                    int r7 = ~r7
                    r8 = r5 ^ r7
                    r5 = r5 & r7
                    r5 = r5 | r8
                    int r5 = r5 * (-302)
                    r7 = r1 ^ r5
                    r1 = r1 & r5
                    r5 = 1
                    int r1 = r1 << r5
                    int r7 = r7 + r1
                    int r1 = ~r4
                    int r1 = ~r1
                    r5 = r4 ^ r0
                    r0 = r0 & r4
                    r0 = r0 | r5
                    int r0 = ~r0
                    r0 = r0 | r1
                    int r0 = r0 * 302
                    int r7 = r7 + r0
                    int r0 = -r7
                    int r0 = -r0
                    r1 = r2 | r0
                    r4 = 1
                    int r1 = r1 << r4
                    r0 = r0 ^ r2
                    int r1 = r1 - r0
                    int r0 = r1 << 13
                    r2 = r1 & r0
                    int r2 = ~r2
                    r0 = r0 | r1
                    r0 = r0 & r2
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
                    r1 = r11[r3]
                    int[] r1 = (int[]) r1
                    r2 = 0
                    r1[r2] = r0
                    int r0 = com.okinc.unified.fragment.CeFiKlineFragment$special$$inlined$activityViewModels$default$5.copydefault
                    r1 = r0 | 27
                    r2 = 1
                    int r1 = r1 << r2
                    r0 = r0 ^ 27
                    int r1 = r1 - r0
                    int r0 = r1 % 128
                    com.okinc.unified.fragment.CeFiKlineFragment$special$$inlined$activityViewModels$default$5.AEQbTJ = r0
                    int r1 = r1 % r3
                L92f:
                    int r0 = com.okinc.unified.fragment.CeFiKlineFragment$special$$inlined$activityViewModels$default$5.copydefault
                    r1 = r0 ^ 69
                    r0 = r0 & 69
                    r2 = 1
                    int r0 = r0 << r2
                    int r1 = r1 + r0
                    int r0 = r1 % 128
                    com.okinc.unified.fragment.CeFiKlineFragment$special$$inlined$activityViewModels$default$5.AEQbTJ = r0
                    int r1 = r1 % r3
                    if (r1 == 0) goto L943
                    r0 = 76
                    r1 = 0
                    int r0 = r0 / r1
                L943:
                    return r11
                L944:
                    r1 = r8
                    r1.hashCode()
                    throw r1
                L949:
                    r0 = move-exception
                    java.lang.Throwable r1 = r0.getCause()
                    if (r1 == 0) goto L951
                    throw r1
                L951:
                    throw r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.okinc.unified.fragment.CeFiKlineFragment$special$$inlined$activityViewModels$default$5.KWHzl(int, int):java.lang.Object[]");
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.unified.fragment.CeFiKlineFragment$special$$inlined$activityViewModels$default$6
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
        this.ORxRYg = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(CeDeFiSharedViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.unified.fragment.CeFiKlineFragment$special$$inlined$activityViewModels$default$7
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.unified.fragment.CeFiKlineFragment$special$$inlined$activityViewModels$default$8
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.unified.fragment.CeFiKlineFragment$special$$inlined$activityViewModels$default$9
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
        this.djBIcL = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(KlineHeaderViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.unified.fragment.CeFiKlineFragment$special$$inlined$activityViewModels$default$10
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.unified.fragment.CeFiKlineFragment$special$$inlined$activityViewModels$default$11
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.unified.fragment.CeFiKlineFragment$special$$inlined$activityViewModels$default$12
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
        this.fetchVPNInfo = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(C54822xWp.class), new Function0<ViewModelStore>() { // from class: com.okinc.unified.fragment.CeFiKlineFragment$special$$inlined$activityViewModels$default$13
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.unified.fragment.CeFiKlineFragment$special$$inlined$activityViewModels$default$14
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.unified.fragment.CeFiKlineFragment$special$$inlined$activityViewModels$default$15
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
        this.AubY = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(C37854pDd.class), new Function0<ViewModelStore>() { // from class: com.okinc.unified.fragment.CeFiKlineFragment$special$$inlined$activityViewModels$default$16
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.unified.fragment.CeFiKlineFragment$special$$inlined$activityViewModels$default$17
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.unified.fragment.CeFiKlineFragment$special$$inlined$activityViewModels$default$18
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
    }

    /* JADX INFO: renamed from: o.xjj$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.xjj.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final C55427xjj copydefault() {
            return new C55427xjj();
        }
    }

    private final pGZ AuCTelauCTel() {
        return (pGZ) this.OLrzqt.getValue();
    }

    private final InterfaceC56387yDm<KlineTimeAnchorViewModel> AwvSrB() {
        return (InterfaceC56387yDm) this.ejfBZ.getValue();
    }

    public final void OLrzqt(MarketCoinInfo marketCoinInfo) {
        this.iwGUEr = marketCoinInfo;
        KWHzl(marketCoinInfo);
    }

    private final pCW zLjUOn() {
        return (pCW) this.valueOf.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CeDeFiSharedViewModel AxsJAY() {
        return (CeDeFiSharedViewModel) this.ORxRYg.getValue();
    }

    private final KlineHeaderViewModel sSMYrx() {
        return (KlineHeaderViewModel) this.djBIcL.getValue();
    }

    public final C54822xWp OLrzqt() {
        return (C54822xWp) this.fetchVPNInfo.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C37854pDd zuBGHE() {
        return (C37854pDd) this.AubY.getValue();
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.mli.onNewOKexEventWithParams$default(java.lang.String, com.okinc.components.track.TrackChannel[], kotlin.jvm.functions.Function1, int, java.lang.Object):void */
    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        InterfaceC54577xNn interfaceC54577xNn;
        java.lang.String str;
        Intrinsics.checkNotNullParameter(view, "");
        this.copydefault = C36026oMn.OLrzqt(view);
        pFN pfn = pFN.OLrzqt;
        C37830pCg c37830pCg = C37830pCg.EZpvd;
        java.lang.String strCopydefault = c37830pCg.copydefault();
        Intrinsics.checkNotNullExpressionValue(strCopydefault, "");
        pfn.EZpvd(strCopydefault, c37830pCg);
        uzCIH();
        this.OcIXYQ = C33129mqd.divS$default(java.lang.Long.valueOf(java.lang.System.currentTimeMillis()), 1000, null, null, null, 14, null);
        zLjUOn().AEQbTJ(this.OcIXYQ);
        CeFiData value = AxsJAY().EZpvd().getValue();
        if (value != null) {
            OLrzqt(value.gEmmrt());
            this.fARcdN = value.EZpvd();
            this.AuCTel = value.AEQbTJ();
            this.AhwBna = value.KWHzl();
            this.AYXKKw = value.copydefault();
            this.KWHzl = value.OLrzqt();
            this.gEmmrt = value.AhwBna();
            this.isConnected = value.fetchVPNInfo();
            this.zuBGHE = value.AYXKKw();
            this.AkhnZx = value.valueOf();
            this.QfsBiF = value.djBIcL();
        }
        this.QUSxYX = C33129mqd.gEmmrt(UUID.randomUUID());
        zLjUOn().AhwBna(this.QUSxYX);
        pfn.EZpvd(new WeakReference<>(this));
        if (bundle != null) {
            this.gHZMYf = bundle.getBoolean("open_draw_line_tools");
            OLrzqt((MarketCoinInfo) bundle.getParcelable("save_tag"));
            this.values = bundle.getBoolean("save_not_first");
            this.DbNXlk = bundle.getBoolean("open_trade_view");
            sSMYrx().OLrzqt(bundle.getBoolean("is_portrait"));
            pEI.EZpvd.AEQbTJ(this.DbNXlk);
        }
        MarketCoinInfo marketCoinInfo = this.iwGUEr;
        if (marketCoinInfo != null) {
            this.fARcdN = marketCoinInfo != null ? marketCoinInfo.getInstrumentId() : null;
            MarketCoinInfo marketCoinInfo2 = this.iwGUEr;
            this.AuCTel = marketCoinInfo2 != null ? marketCoinInfo2.getInstrumentType() : null;
        }
        if (this.iwGUEr == null && (str = this.fARcdN) != null && this.AuCTel != null) {
            Intrinsics.copydefault((java.lang.Object) str);
            java.lang.String str2 = this.AuCTel;
            Intrinsics.copydefault((java.lang.Object) str2);
            OLrzqt(new MarketCoinInfo(str, str2, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 28, (DefaultConstructorMarker) null));
        }
        java.lang.String str3 = this.fARcdN;
        if (str3 == null) {
            str3 = "";
        }
        java.lang.String str4 = this.AuCTel;
        if (str4 == null) {
            str4 = "";
        }
        OLrzqt(str3, str4, (java.lang.String) null);
        AbstractC58185ywX abstractC58185ywXKWHzl = RxBus.KWHzl(C39387prP.class, new java.lang.String[0]);
        final Function1 function1 = new Function1() { // from class: o.xjB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C55427xjj.AEQbTJ(this.KWHzl, (C39387prP) obj);
            }
        };
        this.DTwDnp = abstractC58185ywXKWHzl.AEQbTJ(new InterfaceC58227yxM() { // from class: o.xjD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C55427xjj.djBIcL(function1, obj);
            }
        });
        C36312oXc.AEQbTJ((C36250oUv) null).getFieldNames();
        FragmentActivity activity = getActivity();
        if (activity != null && copydefault(activity)) {
            OLrzqt(true);
            EZpvd(activity);
        }
        DTwDnp();
        InterfaceC49425uoM interfaceC49425uoM = (InterfaceC49425uoM) C43251rlk.OLrzqt(InterfaceC49425uoM.class);
        if (interfaceC49425uoM != null && (interfaceC54577xNn = (InterfaceC54577xNn) interfaceC49425uoM.KWHzl(TradeKey.MANAGER)) != null && interfaceC54577xNn.EZpvd()) {
            C32866mlf.onEvent$default("app_demo_trading_chart_view", (TrackChannel[]) null, new Function1() { // from class: o.xjE
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C55427xjj.KWHzl(this.OLrzqt, (EventParamsList) obj);
                }
            }, 1, (java.lang.Object) null);
        }
        C32869mli.onNewOKexEventWithParams$default("app_page_enter", null, new Function1() { // from class: o.xjG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C55427xjj.OLrzqt(this.copydefault, (EventParamsList) obj);
            }
        }, 1, null);
        OLrzqt().KWHzl().observe(this, new StateListAnimator(new Function1() { // from class: o.xjJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C55427xjj.OLrzqt(this.copydefault, (MarketCoinInfo) obj);
            }
        }));
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new CeFiKlineFragment$initView$7(this, null), 3, null);
        zuBGHE().copydefault().observe(this, new StateListAnimator(new Function1() { // from class: o.xjL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C55427xjj.copydefault(this.EZpvd, (java.lang.Boolean) obj);
            }
        }));
        this.zLjUOn = new TradeMessagePresenter();
        this.fIwbmz = new FragmentOnAttachListener() { // from class: o.xjI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.fragment.app.FragmentOnAttachListener
            public final void onAttachFragment(androidx.fragment.app.FragmentManager fragmentManager, androidx.fragment.app.Fragment fragment) {
                C55427xjj.copydefault(this.KWHzl, fragmentManager, fragment);
            }
        };
        pXB pxb = pXB.EZpvd;
        kotlin.Pair[] pairArr = new kotlin.Pair[1];
        java.lang.String str5 = this.fARcdN;
        if (str5 == null) {
            str5 = "";
        }
        java.lang.String str6 = this.AuCTel;
        pairArr[0] = new kotlin.Pair(str5, str6 != null ? str6 : "");
        pXB.registerTradeFragmentTrack$default(pxb, this, "MarketDetailActivity", pairArr, null, 4, null);
        if (C36246oUr.copydefault().DNMMPQ()) {
            wlaJM();
        }
        AxsJAY().AhwBna().observe(getViewLifecycleOwner(), new StateListAnimator(new Function1() { // from class: o.xjK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C55427xjj.EZpvd(this.OLrzqt, (java.lang.Boolean) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void djBIcL(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AEQbTJ(C55427xjj c55427xjj, C39387prP c39387prP) {
        if (c39387prP.EZpvd()) {
            c55427xjj.sSMYrx().OLrzqt(true);
            c55427xjj.sSMYrx().EZpvd(true);
            c55427xjj.DTwDnp();
        } else {
            c55427xjj.setPortraitNormal(null);
        }
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(C55427xjj c55427xjj, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("type", c55427xjj.djBIcL(), false);
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(C55427xjj c55427xjj, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        java.lang.String str = c55427xjj.AuCTel;
        if (str != null) {
            eventParamsList.put("deal_type", str, false);
        }
        java.lang.String str2 = c55427xjj.fARcdN;
        if (str2 != null) {
            eventParamsList.put("deal_name", str2, false);
        }
        eventParamsList.put("page_id", "page_k", false);
        java.lang.String str3 = c55427xjj.AhwBna;
        if (str3 != null) {
            eventParamsList.put("pre_page_id", str3, false);
        }
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(C55427xjj c55427xjj, MarketCoinInfo marketCoinInfo) {
        c55427xjj.EZpvd(marketCoinInfo);
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(C55427xjj c55427xjj, java.lang.Boolean bool) {
        if (bool.booleanValue()) {
            c55427xjj.AEQbTJ(c55427xjj.QOLQEE);
        }
        return Unit.INSTANCE;
    }

    public static final void copydefault(final C55427xjj c55427xjj, androidx.fragment.app.FragmentManager fragmentManager, androidx.fragment.app.Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(fragment, "");
        if ((fragment instanceof C32995moB ? fragment : null) != null) {
            fragment.getLifecycle().addObserver(new DefaultLifecycleObserver() { // from class: com.okinc.unified.fragment.CeFiKlineFragment$initView$9$2$1
                @Override // androidx.lifecycle.DefaultLifecycleObserver
                public void onDestroy(LifecycleOwner lifecycleOwner) {
                    FragmentActivity activity;
                    FragmentManager supportFragmentManager;
                    Intrinsics.checkNotNullParameter(lifecycleOwner, "");
                    super.onDestroy(lifecycleOwner);
                    this.KWHzl.zuBGHE().djBIcL().setValue(Boolean.FALSE);
                    FragmentOnAttachListener fragmentOnAttachListener = this.KWHzl.fIwbmz;
                    if (fragmentOnAttachListener == null || (activity = this.KWHzl.getActivity()) == null || (supportFragmentManager = activity.getSupportFragmentManager()) == null) {
                        return;
                    }
                    supportFragmentManager.removeFragmentOnAttachListener(fragmentOnAttachListener);
                }
            });
        }
    }

    public static final Unit EZpvd(C55427xjj c55427xjj, java.lang.Boolean bool) {
        pUU.KWHzl("KlinePageInit", "showLoadingLiveData received: " + bool);
        if (bool.booleanValue()) {
            c55427xjj.uzCIH();
        } else {
            c55427xjj.AEQbTJ();
            c55427xjj.getFieldNames();
        }
        return Unit.INSTANCE;
    }

    private final boolean copydefault(FragmentActivity fragmentActivity) {
        return pEN.EZpvd.AEQbTJ(fragmentActivity) == 2 && (!C34703nhO.AYXKKw(fragmentActivity) || AxsJAY().AYXKKw());
    }

    public final void KWHzl(androidx.fragment.app.Fragment fragment) {
        getChildFragmentManager().beginTransaction().replace(C35964oKf.StateListAnimator.accept, fragment, fragment.getClass().getName()).commitAllowingStateLoss();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void KWHzl(MarketCoinInfo marketCoinInfo) {
        BizInstrument bizInstrumentValueOf;
        if (marketCoinInfo == null) {
            bizInstrumentValueOf = null;
        } else {
            InterfaceC54581xNr interfaceC54581xNrCopydefault = ((InterfaceC54577xNn) ((InterfaceC49425uoM) C43248rlh.KWHzl.AEQbTJ(InterfaceC49425uoM.class)).KWHzl(TradeKey.MANAGER)).copydefault();
            if (interfaceC54581xNrCopydefault == null || (bizInstrumentValueOf = InterfaceC54581xNr.TaskDescription.getMinSuggestedInstrument$default(interfaceC54581xNrCopydefault, marketCoinInfo.getInstrumentType(), marketCoinInfo.getInstrumentId(), null, null, 12, null)) == null) {
                AbstractC54531xLw abstractC54531xLwKWHzl = xUD.KWHzl(marketCoinInfo.getInstrumentType());
                if (abstractC54531xLwKWHzl != null) {
                    bizInstrumentValueOf = abstractC54531xLwKWHzl.valueOf(marketCoinInfo.getInstrumentId());
                }
            }
        }
        this.AEQbTJ = bizInstrumentValueOf;
    }

    @Override // o.InterfaceC39508ptf
    public void setImageResource(int i) {
        C38795pgF c38795pgF = this.AuCTelauCTel;
        if (c38795pgF != null) {
            c38795pgF.valueOf(i);
        }
        ViewOnClickListenerC38659pdc viewOnClickListenerC38659pdc = this.getNewProxyInstance;
        if (viewOnClickListenerC38659pdc != null) {
            viewOnClickListenerC38659pdc.djBIcL(i);
        }
    }

    @Override // o.InterfaceC39508ptf
    public void ejfBZ() {
        C38795pgF c38795pgF = this.AuCTelauCTel;
        if (c38795pgF != null) {
            c38795pgF.ixgjPv();
        }
        ViewOnClickListenerC38659pdc viewOnClickListenerC38659pdc = this.getNewProxyInstance;
        if (viewOnClickListenerC38659pdc != null) {
            viewOnClickListenerC38659pdc.DCUTEIddSDPG();
        }
    }

    @Override // o.InterfaceC39508ptf
    public void valueOf() {
        C38795pgF c38795pgF = this.AuCTelauCTel;
        if (c38795pgF != null) {
            c38795pgF.UlJrfe();
        }
        ViewOnClickListenerC38659pdc viewOnClickListenerC38659pdc = this.getNewProxyInstance;
        if (viewOnClickListenerC38659pdc != null) {
            viewOnClickListenerC38659pdc.htlTjW();
        }
    }

    @Override // o.InterfaceC39508ptf
    public void AkhnZx() {
        C38795pgF c38795pgF = this.AuCTelauCTel;
        if (c38795pgF != null) {
            c38795pgF.fERRXa();
        }
        ViewOnClickListenerC38659pdc viewOnClickListenerC38659pdc = this.getNewProxyInstance;
        if (viewOnClickListenerC38659pdc != null) {
            viewOnClickListenerC38659pdc.DCUTEIdCUTEI();
        }
    }

    @Override // o.InterfaceC39508ptf
    public void KWHzl(double d, double d2) {
        C38795pgF c38795pgF = this.AuCTelauCTel;
        if (c38795pgF != null) {
            c38795pgF.KWHzl(d, d2);
        }
        ViewOnClickListenerC38659pdc viewOnClickListenerC38659pdc = this.getNewProxyInstance;
        if (viewOnClickListenerC38659pdc != null) {
            viewOnClickListenerC38659pdc.EZpvd(d, d2);
        }
    }

    @Override // o.InterfaceC39508ptf
    public void fetchVPNInfo() {
        C38795pgF c38795pgF = this.AuCTelauCTel;
        if (c38795pgF != null) {
            c38795pgF.dUDNAs();
        }
        ViewOnClickListenerC38659pdc viewOnClickListenerC38659pdc = this.getNewProxyInstance;
        if (viewOnClickListenerC38659pdc != null) {
            viewOnClickListenerC38659pdc.fjfviF();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(@NotNull android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(bundle, "");
        super.onSaveInstanceState(bundle);
        try {
            MarketCoinInfo marketCoinInfo = this.iwGUEr;
            if (marketCoinInfo != null) {
                bundle.putParcelable("save_tag", marketCoinInfo);
            }
            bundle.putBoolean("save_not_first", this.values);
            bundle.putBoolean("open_draw_line_tools", this.gHZMYf);
            bundle.putBoolean("open_trade_view", pEI.EZpvd.copydefault());
            bundle.putBoolean("is_portrait", sSMYrx().AYXKKw());
        } catch (java.lang.Exception e) {
            C32866mlf.onEvent$default("Kline_crash_track", (TrackChannel[]) null, new Function1() { // from class: o.xjx
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C55427xjj.copydefault(e, (EventParamsList) obj);
                }
            }, 1, (java.lang.Object) null);
        }
    }

    public static final Unit copydefault(java.lang.Exception exc, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        java.lang.String simpleName = eventParamsList.getClass().getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "");
        eventParamsList.put("Kline_crash_track_page_info", simpleName, false);
        eventParamsList.put("Kline_crash_track_exception", exc.toString(), false);
        eventParamsList.put("Kline_crash_track_time", C33129mqd.gEmmrt(java.lang.Long.valueOf(java.lang.System.currentTimeMillis())), false);
        return Unit.INSTANCE;
    }

    @Override // o.InterfaceC39556pua
    public void EZpvd(MarketCoinInfo marketCoinInfo) {
        OLrzqt(marketCoinInfo);
        MarketCoinInfo marketCoinInfo2 = this.iwGUEr;
        this.fARcdN = marketCoinInfo2 != null ? marketCoinInfo2.getInstrumentId() : null;
        MarketCoinInfo marketCoinInfo3 = this.iwGUEr;
        this.AuCTel = marketCoinInfo3 != null ? marketCoinInfo3.getInstrumentType() : null;
    }

    @Override // o.InterfaceC39499ptW
    public void OLrzqt(int i) {
        KWHzl(i);
    }

    @Override // o.InterfaceC39499ptW
    public void OLrzqt(boolean z) {
        androidx.fragment.app.FragmentManager supportFragmentManager;
        FragmentActivity activity = getActivity();
        if (activity != null) {
            activity.setRequestedOrientation(pEN.EZpvd.KWHzl(activity));
        }
        sSMYrx().OLrzqt(false);
        sSMYrx().EZpvd(false);
        FragmentActivity activity2 = getActivity();
        if (activity2 != null && (supportFragmentManager = activity2.getSupportFragmentManager()) != null) {
            supportFragmentManager.setFragmentResult("switch_orientation_manually", BundleKt.bundleOf(C56390yDp.OLrzqt("manually_orientation", "horizontal")));
        }
        this.uzCIH = z;
    }

    @Override // o.InterfaceC39499ptW
    public void setPortraitFullScreen(android.view.View view) {
        ViewOnClickListenerC38659pdc viewOnClickListenerC38659pdcOLrzqt;
        java.lang.String str;
        sSMYrx().OLrzqt(true);
        sSMYrx().EZpvd(true);
        if (view == null) {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                activity.setRequestedOrientation(1);
                return;
            }
            return;
        }
        hDKMBd();
        C36246oUr.copydefault().fIwbmz(this.sSMYrx && this.AwvSrB);
        java.lang.String str2 = this.fARcdN;
        if (str2 == null || (str = this.AuCTel) == null) {
            viewOnClickListenerC38659pdcOLrzqt = null;
        } else {
            viewOnClickListenerC38659pdcOLrzqt = ViewOnClickListenerC38659pdc.Companion.OLrzqt(str2, str, (16 & 4) != 0 ? null : this.AhwBna, (16 & 8) != 0, (16 & 16) != 0 ? false : false, (16 & 32) != 0 ? null : this.AYXKKw, (16 & 64) != 0 ? null : this.QfsBiF);
        }
        this.getNewProxyInstance = viewOnClickListenerC38659pdcOLrzqt;
        if (viewOnClickListenerC38659pdcOLrzqt != null) {
            getChildFragmentManager().beginTransaction().addSharedElement(view, "transition_chart").replace(C35964oKf.StateListAnimator.accept, viewOnClickListenerC38659pdcOLrzqt, ViewOnClickListenerC38659pdc.class.getName()).commitAllowingStateLoss();
        }
        copydefault(true);
        KWHzl(true);
    }

    @Override // o.InterfaceC39499ptW
    public void setPortraitNormal(android.view.View view) {
        java.lang.String str;
        sSMYrx().OLrzqt(true);
        sSMYrx().EZpvd(false);
        C36246oUr.copydefault().fIwbmz(this.sSMYrx && this.AwvSrB);
        java.lang.String str2 = this.fARcdN;
        ViewOnClickListenerC38857phO viewOnClickListenerC38857phOOLrzqt = (str2 == null || (str = this.AuCTel) == null) ? null : ViewOnClickListenerC38857phO.Companion.OLrzqt(str2, str, this.AhwBna, false, this.AYXKKw, this.QfsBiF);
        this.wlaJM = viewOnClickListenerC38857phOOLrzqt;
        if (viewOnClickListenerC38857phOOLrzqt != null) {
            androidx.fragment.app.FragmentTransaction fragmentTransactionBeginTransaction = getChildFragmentManager().beginTransaction();
            if (view != null) {
                hDKMBd();
                fragmentTransactionBeginTransaction.setReorderingAllowed(true);
                fragmentTransactionBeginTransaction.addSharedElement(view, "transition_chart");
            }
            fragmentTransactionBeginTransaction.replace(C35964oKf.StateListAnimator.accept, viewOnClickListenerC38857phOOLrzqt);
            fragmentTransactionBeginTransaction.commitAllowingStateLoss();
        }
        copydefault(true);
        KWHzl(false);
    }

    public final void hDKMBd() {
        if (pDX.AEQbTJ.djBIcL()) {
            AwvSrB().getValue().KWHzl(true);
            AwvSrB().getValue().AEQbTJ(new KlineChangeScreenVo(C36246oUr.copydefault().AxsJAYsNCnLh()));
        }
    }

    @Override // o.InterfaceC39499ptW
    public void isConnected() {
        androidx.fragment.app.FragmentManager supportFragmentManager;
        sSMYrx().OLrzqt(true);
        sSMYrx().EZpvd(false);
        ORxRYg();
        FragmentActivity activity = getActivity();
        if (activity != null) {
            activity.setRequestedOrientation(1);
        }
        FragmentActivity activity2 = getActivity();
        if (activity2 == null || (supportFragmentManager = activity2.getSupportFragmentManager()) == null) {
            return;
        }
        supportFragmentManager.setFragmentResult("switch_orientation_manually", BundleKt.bundleOf(C56390yDp.OLrzqt("manually_orientation", "vertical")));
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(@NotNull android.content.res.Configuration configuration) {
        Intrinsics.checkNotNullParameter(configuration, "");
        super.onConfigurationChanged(configuration);
        FragmentActivity activity = getActivity();
        if (activity == null) {
            return;
        }
        if (configuration.orientation == 2) {
            sSMYrx().OLrzqt(false);
            sSMYrx().EZpvd(false);
            EZpvd(activity);
        } else {
            sSMYrx().OLrzqt(true);
            activity.getWindow().clearFlags(1024);
        }
        DTwDnp();
    }

    public final void EZpvd(FragmentActivity fragmentActivity) {
        WindowManager.LayoutParams attributes = fragmentActivity.getWindow().getAttributes();
        attributes.flags |= 1024;
        fragmentActivity.getWindow().setAttributes(attributes);
    }

    private final void ORxRYg() {
        C38795pgF c38795pgF = this.AuCTelauCTel;
        if (c38795pgF != null) {
            getChildFragmentManager().beginTransaction().remove(c38795pgF).commitNowAllowingStateLoss();
        }
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.pdc.StateListAnimator.newInstance$default(o.pdc$StateListAnimator, java.lang.String, java.lang.String, java.lang.String, boolean, boolean, java.lang.String, java.lang.String, int, java.lang.Object):o.pdc */
    /* JADX DEBUG: Class process forced to load method for inline: o.pgF.ActionBar.newInstance$default(o.pgF$ActionBar, java.lang.String, java.lang.String, boolean, boolean, boolean, int, java.lang.Object):o.pgF */
    /* JADX DEBUG: Class process forced to load method for inline: o.phO.Application.newInstance$default(o.phO$Application, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, int, java.lang.Object):o.phO */
    private final void DTwDnp() {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        boolean z = false;
        C38795pgF c38795pgFNewInstance$default = null;
        viewOnClickListenerC38659pdcOLrzqt = null;
        ViewOnClickListenerC38659pdc viewOnClickListenerC38659pdcOLrzqt = null;
        viewOnClickListenerC38857phOOLrzqt = null;
        ViewOnClickListenerC38857phO viewOnClickListenerC38857phOOLrzqt = null;
        c38795pgFNewInstance$default = null;
        if (sSMYrx().AYXKKw()) {
            this.AuCTelauCTel = null;
            C36246oUr c36246oUrCopydefault = C36246oUr.copydefault();
            if (this.sSMYrx && this.AwvSrB) {
                z = true;
            }
            c36246oUrCopydefault.fIwbmz(z);
            if (sSMYrx().djBIcL() && !pEI.EZpvd.AEQbTJ()) {
                java.lang.String str4 = this.fARcdN;
                if (str4 != null && (str3 = this.AuCTel) != null) {
                    viewOnClickListenerC38659pdcOLrzqt = ViewOnClickListenerC38659pdc.Companion.OLrzqt(str4, str3, (16 & 4) != 0 ? null : this.AhwBna, (16 & 8) != 0 ? true : true, (16 & 16) != 0 ? false : false, (16 & 32) != 0 ? null : this.AYXKKw, (16 & 64) != 0 ? null : this.QfsBiF);
                }
                this.getNewProxyInstance = viewOnClickListenerC38659pdcOLrzqt;
                if (viewOnClickListenerC38659pdcOLrzqt != null) {
                    KWHzl(viewOnClickListenerC38659pdcOLrzqt);
                }
                copydefault(true);
                return;
            }
            java.lang.String str5 = this.fARcdN;
            if (str5 != null && (str2 = this.AuCTel) != null) {
                viewOnClickListenerC38857phOOLrzqt = ViewOnClickListenerC38857phO.Companion.OLrzqt(str5, str2, (8 & 4) != 0 ? null : this.AhwBna, (8 & 8) != 0, (8 & 16) != 0 ? null : this.AYXKKw, (8 & 32) != 0 ? null : this.QfsBiF);
            }
            this.wlaJM = viewOnClickListenerC38857phOOLrzqt;
            if (viewOnClickListenerC38857phOOLrzqt != null) {
                KWHzl(viewOnClickListenerC38857phOOLrzqt);
            }
            copydefault(true);
            return;
        }
        this.getNewProxyInstance = null;
        C36246oUr.copydefault().fIwbmz(false);
        java.lang.String str6 = this.fARcdN;
        if (str6 != null && (str = this.AuCTel) != null) {
            c38795pgFNewInstance$default = C38795pgF.ActionBar.newInstance$default(C38795pgF.Companion, str6, str, this.uzCIH, false, false, 24, null);
        }
        this.AuCTelauCTel = c38795pgFNewInstance$default;
        if (c38795pgFNewInstance$default != null) {
            KWHzl(c38795pgFNewInstance$default);
        }
        copydefault(false);
    }

    private final void copydefault(boolean z) {
        androidx.fragment.app.FragmentManager supportFragmentManager;
        FragmentActivity activity = getActivity();
        if (activity == null || (supportFragmentManager = activity.getSupportFragmentManager()) == null) {
            return;
        }
        supportFragmentManager.setFragmentResult("switch_header", BundleKt.bundleOf(C56390yDp.OLrzqt("kline_show_header", java.lang.Boolean.valueOf(z))));
    }

    public static /* synthetic */ void switchPortraitOrFullScreen$default(C55427xjj c55427xjj, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        c55427xjj.KWHzl(z);
    }

    public final void KWHzl(boolean z) {
        androidx.fragment.app.FragmentManager supportFragmentManager;
        FragmentActivity activity = getActivity();
        if (activity == null || (supportFragmentManager = activity.getSupportFragmentManager()) == null) {
            return;
        }
        supportFragmentManager.setFragmentResult("switch_full_screen", BundleKt.bundleOf(C56390yDp.OLrzqt("kline_full_screen", java.lang.Boolean.valueOf(z))));
    }

    @Override // o.InterfaceC39499ptW
    public void EZpvd(int i) {
        AppCompatDelegate delegate;
        FragmentActivity activity = getActivity();
        AppCompatActivity appCompatActivity = activity instanceof AppCompatActivity ? (AppCompatActivity) activity : null;
        if (appCompatActivity == null || (delegate = appCompatActivity.getDelegate()) == null) {
            return;
        }
        delegate.setLocalNightMode(i);
    }

    @Override // o.InterfaceC39499ptW
    public void AEQbTJ(boolean z) {
        InterfaceC37933pGb interfaceC37933pGb;
        this.getFieldNames = z;
        if (z || (interfaceC37933pGb = this.hDKMBd) == null) {
            return;
        }
        interfaceC37933pGb.AhwBna();
    }

    @Override // o.InterfaceC39499ptW
    public void AYXKKw() {
        ViewOnClickListenerC38857phO viewOnClickListenerC38857phO = this.wlaJM;
        if (viewOnClickListenerC38857phO != null) {
            viewOnClickListenerC38857phO.AxsJAY();
        }
        ViewOnClickListenerC38659pdc viewOnClickListenerC38659pdc = this.getNewProxyInstance;
        if (viewOnClickListenerC38659pdc != null) {
            viewOnClickListenerC38659pdc.ixgjPv();
        }
        FragmentActivity activity = getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    private final void KWHzl(int i) {
        FragmentActivity activity;
        androidx.fragment.app.FragmentManager supportFragmentManager;
        if (pEI.EZpvd.AEQbTJ() && i == 0) {
            FragmentOnAttachListener fragmentOnAttachListener = this.fIwbmz;
            if (fragmentOnAttachListener != null && (activity = getActivity()) != null && (supportFragmentManager = activity.getSupportFragmentManager()) != null) {
                supportFragmentManager.addFragmentOnAttachListener(fragmentOnAttachListener);
            }
            zuBGHE().djBIcL().setValue(java.lang.Boolean.TRUE);
            this.QOLQEE = i;
            return;
        }
        AEQbTJ(i);
    }

    public final void AEQbTJ(int i) {
        java.lang.String instrumentId;
        java.lang.String instrumentType;
        InterfaceC54577xNn interfaceC54577xNn;
        FragmentActivity activity = getActivity();
        final AbstractActivityC33041mov abstractActivityC33041mov = activity instanceof AbstractActivityC33041mov ? (AbstractActivityC33041mov) activity : null;
        if (abstractActivityC33041mov == null) {
            return;
        }
        fIwbmz();
        InterfaceC49425uoM interfaceC49425uoM = (InterfaceC49425uoM) C43251rlk.OLrzqt(InterfaceC49425uoM.class);
        if (interfaceC49425uoM != null && (interfaceC54577xNn = (InterfaceC54577xNn) interfaceC49425uoM.KWHzl(TradeKey.MANAGER)) != null && interfaceC54577xNn.EZpvd()) {
            C49352umt c49352umt = this.fJNWhG;
            if (c49352umt != null) {
                InterfaceC48895ueM.Application.setSrcFrom$default(c49352umt, null, new Function0() { // from class: o.xjp
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return C55427xjj.AEQbTJ(this.KWHzl, abstractActivityC33041mov);
                    }
                }, 1, null);
            }
            C32866mlf.onEvent$default("app_demo_trading_chart_button_click", (TrackChannel[]) null, new Function1() { // from class: o.xjo
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C55427xjj.AhwBna(this.KWHzl, (EventParamsList) obj);
                }
            }, 1, (java.lang.Object) null);
        } else {
            MarketCoinInfo marketCoinInfo = this.iwGUEr;
            java.lang.String str = "";
            if (marketCoinInfo == null || (instrumentId = marketCoinInfo.getInstrumentId()) == null) {
                instrumentId = "";
            }
            MarketCoinInfo marketCoinInfo2 = this.iwGUEr;
            if (marketCoinInfo2 != null && (instrumentType = marketCoinInfo2.getInstrumentType()) != null) {
                str = instrumentType;
            }
            final java.lang.String str2 = "okx://pro/trade_kline?id=" + instrumentId + "&type=" + str + "&source=share";
            java.lang.String strGHZMYf = gHZMYf();
            InterfaceC48893ueK interfaceC48893ueK = (InterfaceC48893ueK) C43248rlh.KWHzl.AEQbTJ(InterfaceC48893ueK.class);
            C49352umt c49352umt2 = this.fJNWhG;
            if (c49352umt2 != null) {
                c49352umt2.setQRCode(interfaceC48893ueK.DTwDnp().djBIcL());
            }
            InterfaceC58217yxC interfaceC58217yxC = this.QKVWgx;
            if (interfaceC58217yxC != null) {
                interfaceC58217yxC.dispose();
            }
            AbstractC58185ywX abstractC58185ywXEZpvd = C58156yvv.EZpvd(interfaceC48893ueK.AEQbTJ(strGHZMYf, new C48891ueI("market_kline", str2, false, null, null, 28, null)), this);
            final Function1 function1 = new Function1() { // from class: o.xjr
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C55427xjj.EZpvd(this.OLrzqt, abstractActivityC33041mov, str2, (C48887ueE) obj);
                }
            };
            InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.xjq
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    C55427xjj.AEQbTJ(function1, obj);
                }
            };
            final Function1 function12 = new Function1() { // from class: o.xjn
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C55427xjj.KWHzl((java.lang.Throwable) obj);
                }
            };
            this.QKVWgx = abstractC58185ywXEZpvd.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.xjs
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    C55427xjj.copydefault(function12, obj);
                }
            });
        }
        C32866mlf.EZpvd("KLine_PageInteraction_Share_View", new EventParam("type", i == 0 ? "chart" : "info", false));
    }

    public static final Unit AEQbTJ(final C55427xjj c55427xjj, final AbstractActivityC33041mov abstractActivityC33041mov) {
        c55427xjj.copydefault(abstractActivityC33041mov, new Function1() { // from class: o.xjv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C55427xjj.KWHzl(this.EZpvd, abstractActivityC33041mov, (android.graphics.Bitmap) obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(C55427xjj c55427xjj, final AbstractActivityC33041mov abstractActivityC33041mov, android.graphics.Bitmap bitmap) {
        if (bitmap == null) {
            return Unit.INSTANCE;
        }
        android.graphics.Bitmap bitmapOLrzqt = C33487mxQ.OLrzqt(bitmap, C33570myu.EZpvd(c55427xjj.fJNWhG));
        ShareFileProvider.StateListAnimator stateListAnimator = ShareFileProvider.Companion;
        Intrinsics.copydefault(bitmapOLrzqt);
        stateListAnimator.copydefault(bitmapOLrzqt, c55427xjj, new Function1() { // from class: o.xjw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C55427xjj.EZpvd((java.lang.Throwable) obj);
            }
        }, new Function1() { // from class: o.xjy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C55427xjj.KWHzl(abstractActivityC33041mov, (java.io.File) obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(AbstractActivityC33041mov abstractActivityC33041mov, java.io.File file) {
        Intrinsics.checkNotNullParameter(file, "");
        InterfaceC48893ueK interfaceC48893ueK = (InterfaceC48893ueK) C43248rlh.KWHzl.AEQbTJ(InterfaceC48893ueK.class);
        ShareConfig.ActionBar actionBar = ShareConfig.Companion;
        ImageShareParams.ActionBar actionBar2 = ImageShareParams.Companion;
        java.lang.String absolutePath = file.getAbsolutePath();
        Intrinsics.checkNotNullExpressionValue(absolutePath, "");
        interfaceC48893ueK.copydefault(abstractActivityC33041mov, ShareConfig.ActionBar.create$default(actionBar, actionBar2.KWHzl(absolutePath, new Function1() { // from class: o.xjC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C55427xjj.KWHzl((ImageShareParams) obj);
            }
        }), null, 2, null));
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(ImageShareParams imageShareParams) {
        Intrinsics.checkNotNullParameter(imageShareParams, "");
        imageShareParams.setShareFrom("market_kline");
        return Unit.INSTANCE;
    }

    public static final Unit AhwBna(C55427xjj c55427xjj, EventParamsList eventParamsList) {
        java.lang.String instrumentId;
        java.lang.String str = "";
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put(BotWebHook.KEY_ACTION, "share", false);
        eventParamsList.put("type", c55427xjj.djBIcL(), false);
        MarketCoinInfo marketCoinInfo = c55427xjj.iwGUEr;
        if (marketCoinInfo != null && (instrumentId = marketCoinInfo.getInstrumentId()) != null) {
            str = instrumentId;
        }
        eventParamsList.put("pair", str, false);
        return Unit.INSTANCE;
    }

    public static final void AEQbTJ(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit EZpvd(final C55427xjj c55427xjj, final AbstractActivityC33041mov abstractActivityC33041mov, final java.lang.String str, final C48887ueE c48887ueE) {
        c55427xjj.copydefault(abstractActivityC33041mov, new Function1() { // from class: o.xjk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C55427xjj.AEQbTJ(this.KWHzl, abstractActivityC33041mov, c48887ueE, str, (android.graphics.Bitmap) obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(final C55427xjj c55427xjj, final AbstractActivityC33041mov abstractActivityC33041mov, final C48887ueE c48887ueE, final java.lang.String str, android.graphics.Bitmap bitmap) {
        if (bitmap == null) {
            return Unit.INSTANCE;
        }
        ShareFileProvider.StateListAnimator stateListAnimator = ShareFileProvider.Companion;
        final java.io.File fileAEQbTJ = stateListAnimator.AEQbTJ(bitmap);
        android.graphics.Bitmap bitmapOLrzqt = C33487mxQ.OLrzqt(bitmap, C33570myu.EZpvd(c55427xjj.fJNWhG));
        Intrinsics.copydefault(bitmapOLrzqt);
        stateListAnimator.copydefault(bitmapOLrzqt, c55427xjj, new Function1() { // from class: o.xjz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C55427xjj.EZpvd(this.KWHzl, (java.lang.Throwable) obj);
            }
        }, new Function1() { // from class: o.xjF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C55427xjj.KWHzl(abstractActivityC33041mov, c55427xjj, c48887ueE, fileAEQbTJ, str, (java.io.File) obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(C55427xjj c55427xjj, java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        pUU.copydefault(c55427xjj.getTAG(), "shareBitmap failed: " + th);
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(AbstractActivityC33041mov abstractActivityC33041mov, final C55427xjj c55427xjj, final C48887ueE c48887ueE, final java.io.File file, final java.lang.String str, final java.io.File file2) {
        Intrinsics.checkNotNullParameter(file2, "");
        ImageShareParams.ActionBar actionBar = ImageShareParams.Companion;
        java.lang.String absolutePath = file2.getAbsolutePath();
        Intrinsics.checkNotNullExpressionValue(absolutePath, "");
        ShareConfig shareConfigCreate$default = ShareConfig.ActionBar.create$default(ShareConfig.Companion, actionBar.KWHzl(absolutePath, new Function1() { // from class: o.xjm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C55427xjj.OLrzqt(this.copydefault, c48887ueE, file2, file, str, (ImageShareParams) obj);
            }
        }), null, 2, null);
        ISharePreviewConfig previewConfig = shareConfigCreate$default.getPreviewConfig();
        ImageDefaultPreviewConfig imageDefaultPreviewConfig = previewConfig instanceof ImageDefaultPreviewConfig ? (ImageDefaultPreviewConfig) previewConfig : null;
        if (imageDefaultPreviewConfig != null) {
            imageDefaultPreviewConfig.setPreviewBottomTips("");
        }
        ((InterfaceC48893ueK) C43248rlh.KWHzl.AEQbTJ(InterfaceC48893ueK.class)).copydefault(abstractActivityC33041mov, shareConfigCreate$default);
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(C55427xjj c55427xjj, C48887ueE c48887ueE, java.io.File file, java.io.File file2, java.lang.String str, ImageShareParams imageShareParams) {
        Intrinsics.checkNotNullParameter(imageShareParams, "");
        imageShareParams.setShareFrom("market_kline");
        imageShareParams.setBody(C33069mpW.copydefault(c55427xjj, C35964oKf.Fragment.isScanInProgress, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56424yEw.gEmmrt(C56390yDp.OLrzqt(RemoteMessageConst.Notification.TICKER, c55427xjj.KWHzl()), C56390yDp.OLrzqt("link", c48887ueE.OLrzqt()))));
        imageShareParams.getExtras().putBoolean("isEnableIMShare", true);
        imageShareParams.setPendingShareImagePath(file.getAbsolutePath());
        IMMessageShareModel.CTAType cTAType = IMMessageShareModel.CTAType.TradeNow;
        imageShareParams.getExtras().putParcelable("imMessageShare", new IMMessageShareModel((java.lang.String) null, (java.lang.String) null, C33070mpX.AYXKKw(C35964oKf.Fragment.RVsVBY), file2 != null ? file2.getAbsolutePath() : null, (java.lang.String) null, str, c48887ueE.OLrzqt(), (java.lang.String) null, cTAType, (java.util.Map) null, "okkline_kline", 659, (DefaultConstructorMarker) null));
        return Unit.INSTANCE;
    }

    public static final void copydefault(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit KWHzl(java.lang.Throwable th) {
        th.printStackTrace();
        return Unit.INSTANCE;
    }

    private final void copydefault(android.app.Activity activity, final Function1<? super android.graphics.Bitmap, Unit> function1) {
        try {
            Result.Application application = Result.Companion;
            android.view.Window window = activity.getWindow();
            Intrinsics.checkNotNullExpressionValue(window, "");
            android.view.View decorView = window.getDecorView();
            Intrinsics.checkNotNullExpressionValue(decorView, "");
            int height = decorView.getHeight();
            ViewOnClickListenerC38857phO viewOnClickListenerC38857phO = this.wlaJM;
            int iDbNXlk = height - (viewOnClickListenerC38857phO != null ? viewOnClickListenerC38857phO.DbNXlk() : 0);
            final android.graphics.Bitmap bitmapCreateBitmap = android.graphics.Bitmap.createBitmap(decorView.getWidth(), iDbNXlk, Bitmap.Config.ARGB_8888);
            Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "");
            int[] iArr = new int[2];
            decorView.getLocationInWindow(iArr);
            int i = iArr[0];
            android.graphics.Rect rect = new android.graphics.Rect(i, iArr[1], decorView.getWidth() + i, iArr[1] + iDbNXlk);
            if (Build.VERSION.SDK_INT >= 26) {
                PixelCopy.request(window, rect, bitmapCreateBitmap, new PixelCopy.OnPixelCopyFinishedListener() { // from class: o.xjt
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
                    public final void onPixelCopyFinished(int i2) {
                        C55427xjj.OLrzqt(function1, bitmapCreateBitmap, i2);
                    }
                }, decorView.getHandler());
            }
            Result.m7377constructorimpl(Unit.INSTANCE);
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
    }

    public static final void OLrzqt(Function1 function1, android.graphics.Bitmap bitmap, int i) {
        if (i == 0) {
            function1.invoke(bitmap);
        } else {
            function1.invoke(null);
        }
    }

    /* JADX DEBUG: Possible override for method o.xkl.KWHzl()V */
    public final java.lang.String KWHzl() {
        MarketCoinInfo marketCoinInfo = this.iwGUEr;
        if (marketCoinInfo == null) {
            return "";
        }
        if (copydefault(marketCoinInfo)) {
            C48914uef c48914uef = C48914uef.EZpvd;
            MarketCoinInfo marketCoinInfo2 = this.iwGUEr;
            java.lang.String premarketTitle$default = C48914uef.getPremarketTitle$default(c48914uef, marketCoinInfo2 != null ? marketCoinInfo2.getInstrumentId() : null, false, 2, null);
            return premarketTitle$default == null ? "" : premarketTitle$default;
        }
        C48914uef c48914uef2 = C48914uef.EZpvd;
        MarketCoinInfo marketCoinInfo3 = this.iwGUEr;
        java.lang.String instrumentId = marketCoinInfo3 != null ? marketCoinInfo3.getInstrumentId() : null;
        MarketCoinInfo marketCoinInfo4 = this.iwGUEr;
        return C48914uef.getTitleByIdAndType$default(c48914uef2, instrumentId, marketCoinInfo4 != null ? marketCoinInfo4.getInstrumentType() : null, false, false, null, false, false, 124, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean copydefault(MarketCoinInfo marketCoinInfo) {
        BizInstrument bizInstrumentValueOf;
        if (marketCoinInfo == null) {
            bizInstrumentValueOf = null;
        } else {
            InterfaceC54581xNr interfaceC54581xNrCopydefault = ((InterfaceC54577xNn) ((InterfaceC49425uoM) C43251rlk.copydefault(InterfaceC49425uoM.class)).KWHzl(TradeKey.MANAGER)).copydefault();
            if (interfaceC54581xNrCopydefault == null || (bizInstrumentValueOf = InterfaceC54581xNr.TaskDescription.getMinSuggestedInstrument$default(interfaceC54581xNrCopydefault, marketCoinInfo.getInstrumentType(), marketCoinInfo.getInstrumentId(), null, null, 12, null)) == null) {
                AbstractC54531xLw abstractC54531xLwKWHzl = xUD.KWHzl(marketCoinInfo.getInstrumentType());
                if (abstractC54531xLwKWHzl != null) {
                    bizInstrumentValueOf = abstractC54531xLwKWHzl.valueOf(marketCoinInfo.getInstrumentId());
                }
            }
        }
        return bizInstrumentValueOf != null && bizInstrumentValueOf.isPreMarketPair();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0112  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final java.lang.String gHZMYf() {
        java.lang.String lowerCase;
        java.lang.String instrumentId;
        java.lang.String instrumentType;
        FutureInstrument futureInstrumentFetchVPNInfo;
        java.lang.String lowerCase2;
        java.lang.String instrumentType2;
        MarketCoinInfo marketCoinInfo = this.iwGUEr;
        java.lang.String str = "";
        if (marketCoinInfo == null) {
            return "";
        }
        if (!Intrinsics.EZpvd((java.lang.Object) (marketCoinInfo != null ? marketCoinInfo.getInstrumentType() : null), (java.lang.Object) "FUTURES")) {
            MarketCoinInfo marketCoinInfo2 = this.iwGUEr;
            if (marketCoinInfo2 == null || (instrumentType = marketCoinInfo2.getInstrumentType()) == null) {
                lowerCase = "";
            } else {
                lowerCase = instrumentType.toLowerCase(java.util.Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "");
                if (lowerCase == null) {
                }
            }
            MarketCoinInfo marketCoinInfo3 = this.iwGUEr;
            if (marketCoinInfo3 != null && (instrumentId = marketCoinInfo3.getInstrumentId()) != null) {
                java.lang.String lowerCase3 = instrumentId.toLowerCase(java.util.Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(lowerCase3, "");
                if (lowerCase3 != null) {
                    str = lowerCase3;
                }
            }
            return "https://www.okx.com/trade-" + lowerCase + "/" + str;
        }
        MarketCoinInfo marketCoinInfo4 = this.iwGUEr;
        java.lang.String instrumentId2 = marketCoinInfo4 != null ? marketCoinInfo4.getInstrumentId() : null;
        ViewOnClickListenerC38857phO viewOnClickListenerC38857phO = this.wlaJM;
        if (viewOnClickListenerC38857phO != null && (futureInstrumentFetchVPNInfo = viewOnClickListenerC38857phO.fetchVPNInfo()) != null) {
            java.lang.String alias = futureInstrumentFetchVPNInfo.getAlias();
            if (C33129mqd.OLrzqt((java.lang.CharSequence) alias)) {
                switch (alias.hashCode()) {
                    case -927019468:
                        if (alias.equals("next_month")) {
                            alias = "monthly";
                        }
                        break;
                    case -560300811:
                        if (alias.equals("this_week")) {
                            alias = "weekly";
                        }
                        break;
                    case -198384225:
                        if (alias.equals("this_month")) {
                            alias = "bimonthly";
                        }
                        break;
                    case 651403948:
                        if (alias.equals("quarter")) {
                            alias = "quarterly";
                        }
                        break;
                    case 1217310144:
                        if (alias.equals("next_week")) {
                            alias = "biweekly";
                        }
                        break;
                    case 1902260576:
                        if (alias.equals("next_quarter")) {
                            alias = "biquarterly";
                        }
                        break;
                }
                java.util.List listSplit$default = instrumentId2 != null ? StringsKt__StringsKt.split$default((java.lang.CharSequence) instrumentId2, new java.lang.String[]{"-"}, false, 0, 6, (java.lang.Object) null) : null;
                if (listSplit$default != null && listSplit$default.size() == 3) {
                    java.lang.String str2 = listSplit$default.get(0) + "-" + listSplit$default.get(1) + "-" + alias;
                    MarketCoinInfo marketCoinInfo5 = this.iwGUEr;
                    if (marketCoinInfo5 == null || (instrumentType2 = marketCoinInfo5.getInstrumentType()) == null) {
                        lowerCase2 = "";
                    } else {
                        lowerCase2 = instrumentType2.toLowerCase(java.util.Locale.ROOT);
                        Intrinsics.checkNotNullExpressionValue(lowerCase2, "");
                        if (lowerCase2 == null) {
                        }
                    }
                    java.lang.String lowerCase4 = str2.toLowerCase(java.util.Locale.ROOT);
                    Intrinsics.checkNotNullExpressionValue(lowerCase4, "");
                    return "https://www.okx.com/trade-" + lowerCase2 + "/" + lowerCase4;
                }
            }
        }
        return "";
    }

    public final void fIwbmz() {
        FragmentActivity activity = getActivity();
        if (activity == null) {
            return;
        }
        android.view.View viewInflate = android.view.View.inflate(activity, C35964oKf.Application.RgLUBD, null);
        android.util.DisplayMetrics displayMetrics = new android.util.DisplayMetrics();
        activity.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        C33487mxQ.EZpvd(viewInflate, displayMetrics.widthPixels, displayMetrics.heightPixels);
        this.fJNWhG = (C49352umt) viewInflate.findViewById(C35964oKf.StateListAnimator.sbu);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004a A[RETURN, SYNTHETIC] */
    @Override // o.InterfaceC39499ptW
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.String djBIcL() {
        MarketCoinInfo marketCoinInfo = this.iwGUEr;
        java.lang.String instrumentType = marketCoinInfo != null ? marketCoinInfo.getInstrumentType() : null;
        if (instrumentType != null) {
            switch (instrumentType.hashCode()) {
                case -2027980370:
                    if (instrumentType.equals("MARGIN")) {
                        return "bb";
                    }
                    break;
                case -1956807563:
                    if (instrumentType.equals("OPTION")) {
                        return "options";
                    }
                    break;
                case 2552066:
                    if (!instrumentType.equals("SPOT")) {
                    }
                    break;
                case 2558355:
                    if (instrumentType.equals("SWAP")) {
                        return "swap";
                    }
                    break;
                case 214415088:
                    if (instrumentType.equals("FUTURES")) {
                        return "futures";
                    }
                    break;
            }
        }
        return "";
    }

    @Override // o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onStop() {
        InterfaceC43033rhe interfaceC43033rhe;
        android.content.Context context;
        super.onStop();
        if (!Intrinsics.EZpvd((java.lang.Object) this.zuBGHE, (java.lang.Object) "1") || (interfaceC43033rhe = (InterfaceC43033rhe) C43251rlk.OLrzqt(InterfaceC43033rhe.class)) == null || (context = getContext()) == null) {
            return;
        }
        interfaceC43033rhe.KWHzl(context);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        C36246oUr.copydefault().AubY(false);
        pEI.EZpvd.EZpvd();
        C36312oXc.AEQbTJ((C36250oUv) null).getFieldNames();
        AEQbTJ((java.lang.String) null);
        getNewProxyInstance();
        InterfaceC58217yxC interfaceC58217yxC = this.zsXlph;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
        InterfaceC58217yxC interfaceC58217yxC2 = this.DTwDnp;
        if (interfaceC58217yxC2 != null) {
            interfaceC58217yxC2.dispose();
        }
        InterfaceC58217yxC interfaceC58217yxC3 = this.QKVWgx;
        if (interfaceC58217yxC3 != null) {
            interfaceC58217yxC3.dispose();
        }
    }

    @Override // o.InterfaceC39499ptW
    public void DbNXlk() {
        InterfaceC39560pue interfaceC39560pue = this.AxsJAY;
        if (interfaceC39560pue != null) {
            interfaceC39560pue.OLrzqt();
        }
    }

    @Override // o.InterfaceC39499ptW
    public void fJNWhG() {
        InterfaceC39560pue interfaceC39560pue = this.AxsJAY;
        if (interfaceC39560pue != null) {
            interfaceC39560pue.KWHzl();
        }
    }

    @Override // o.InterfaceC39499ptW
    public java.lang.Boolean values() {
        return java.lang.Boolean.valueOf(this.DbNXlk);
    }

    @Override // o.InterfaceC39499ptW
    public void OLrzqt(java.lang.Boolean bool) {
        if (bool != null) {
            this.gHZMYf = bool.booleanValue();
        }
    }

    @Override // o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        pEI pei = pEI.EZpvd;
        pei.KWHzl();
        pei.AYXKKw();
        pFU.AEQbTJ.KWHzl(true);
        xHY xhy = this.zLjUOn;
        if (xhy != null) {
            xhy.KWHzl();
        }
    }

    @Override // o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        if (Intrinsics.EZpvd(zuBGHE().KWHzl().getValue(), java.lang.Boolean.FALSE)) {
            pFU.AEQbTJ.KWHzl(false);
            C36246oUr.copydefault().gEmmrt();
            xHY xhy = this.zLjUOn;
            if (xhy != null) {
                xhy.EZpvd();
            }
        }
    }

    public final void uzCIH() {
        C55113xdn c55113xdn;
        android.widget.FrameLayout frameLayout;
        pUU.KWHzl("KlinePageInit", "show3DLoading");
        C36026oMn c36026oMn = this.copydefault;
        if (c36026oMn != null && (frameLayout = c36026oMn.AEQbTJ) != null) {
            frameLayout.setVisibility(0);
        }
        C36026oMn c36026oMn2 = this.copydefault;
        if (c36026oMn2 == null || (c55113xdn = c36026oMn2.KWHzl) == null) {
            return;
        }
        c55113xdn.KWHzl(0L);
    }

    public final void AEQbTJ() {
        C36026oMn c36026oMn = this.copydefault;
        if (c36026oMn != null) {
            android.widget.FrameLayout frameLayout = c36026oMn.AEQbTJ;
            Intrinsics.checkNotNullExpressionValue(frameLayout, "");
            frameLayout.setVisibility(8);
            c36026oMn.KWHzl.copydefault();
            pUU.KWHzl("KlinePageInit", "dismiss3DLoading");
        }
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) this, true, (java.lang.String) null, 2, (java.lang.Object) null);
        if (C33129mqd.OLrzqt((java.lang.CharSequence) this.KWHzl) && sSMYrx().AYXKKw() && !sSMYrx().djBIcL()) {
            ViewOnClickListenerC38857phO viewOnClickListenerC38857phO = this.wlaJM;
            if (viewOnClickListenerC38857phO != null) {
                java.lang.String str = this.KWHzl;
                Intrinsics.copydefault((java.lang.Object) str);
                viewOnClickListenerC38857phO.EZpvd(str);
            }
            this.KWHzl = null;
        }
        java.lang.Boolean value = OLrzqt().valueOf().getValue();
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        if (Intrinsics.EZpvd(value, bool) || !this.isConnected) {
            return;
        }
        OLrzqt().valueOf().setValue(bool);
    }

    public final void OLrzqt(@NotNull final java.lang.String str, @NotNull final java.lang.String str2, final java.lang.String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        if (str3 == null || str3.length() == 0) {
            java.lang.String str4 = this.AYXKKw;
            str3 = (str4 == null || str4.length() == 0) ? this.AhwBna : this.AYXKKw;
        }
        C32866mlf.onEvent$default("KLine_Chart_ChartType_View", (TrackChannel[]) null, new Function1() { // from class: o.xjA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C55427xjj.KWHzl(str, str2, this, str3, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit KWHzl(java.lang.String str, java.lang.String str2, C55427xjj c55427xjj, java.lang.String str3, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("trade_pair", str, false);
        eventParamsList.put("business_line", str2, true);
        eventParamsList.put("chart_type", pEI.EZpvd.AEQbTJ() ? "tradingview" : "original", true);
        java.lang.String str4 = c55427xjj.AYXKKw;
        if (str4 != null) {
            str4.length();
        }
        if (str3 == null) {
            str3 = "";
        }
        eventParamsList.put("last_page", str3, true);
        return Unit.INSTANCE;
    }

    public final void AEQbTJ(java.lang.String str) {
        java.lang.String str2;
        if (str == null || str.length() == 0) {
            java.lang.String str3 = this.AYXKKw;
            str2 = (str3 == null || str3.length() == 0) ? this.AhwBna : this.AYXKKw;
        } else {
            str2 = str;
        }
        C39215poB c39215poB = C39215poB.OLrzqt;
        java.lang.String str4 = this.QUSxYX;
        java.lang.String str5 = this.AuCTel;
        if (str5 == null) {
            str5 = "";
        }
        c39215poB.KWHzl(str2, str4, str5, C33129mqd.subS$default(C33129mqd.divS$default(java.lang.Long.valueOf(java.lang.System.currentTimeMillis()), 1000, null, null, null, 14, null), this.OcIXYQ, null, null, null, 14, null), zLjUOn().OLrzqt(), this.fARcdN);
    }

    public final void getNewProxyInstance() {
        java.lang.String str = this.AYXKKw;
        java.lang.String str2 = (str == null || str.length() == 0) ? this.AhwBna : this.AYXKKw;
        C39215poB c39215poB = C39215poB.OLrzqt;
        java.lang.String str3 = this.QUSxYX;
        java.lang.String str4 = this.AuCTel;
        if (str4 == null) {
            str4 = "";
        }
        c39215poB.copydefault(str2, str3, str4, C33129mqd.subS$default(C33129mqd.divS$default(java.lang.Long.valueOf(java.lang.System.currentTimeMillis()), 1000, null, null, null, 14, null), this.OcIXYQ, null, null, null, 14, null), zLjUOn().OLrzqt().AkhnZx(), this.fARcdN, zLjUOn().OLrzqt());
    }

    private final void wlaJM() {
        AuCTelauCTel().EZpvd();
    }

    public final androidx.fragment.app.Fragment EZpvd() {
        FragmentContainerView fragmentContainerView;
        C36026oMn c36026oMn = this.copydefault;
        if (c36026oMn == null || (fragmentContainerView = c36026oMn.EZpvd) == null) {
            return null;
        }
        return fragmentContainerView.getFragment();
    }

    public final void getFieldNames() {
        OKReminder oKReminder;
        C36026oMn c36026oMn = this.copydefault;
        if (c36026oMn == null || (oKReminder = c36026oMn.copydefault) == null || !Intrinsics.EZpvd((java.lang.Object) this.AkhnZx, (java.lang.Object) "1")) {
            return;
        }
        this.AkhnZx = "";
        oKReminder.setVisibility(0);
        oKReminder.setStyle(0);
        oKReminder.OLrzqt().setVisibility(8);
        oKReminder.setMessage(C33070mpX.AYXKKw(C35964oKf.Fragment.aeJQwa));
        mUR.safeLaunch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new CeFiKlineFragment$showCedefiOnlineReminder$1$1(oKReminder, null), 3, null);
    }

    public static final InterfaceC56387yDm OLrzqt(final C55427xjj c55427xjj) {
        final Function0 function0 = null;
        return FragmentViewModelLazyKt.createViewModelLazy(c55427xjj, C56524yIo.AEQbTJ(KlineTimeAnchorViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.unified.fragment.CeFiKlineFragment$klineTimeAnchorViewModel_delegate$lambda$0$$inlined$activityViewModels$default$1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                ViewModelStore viewModelStore = c55427xjj.requireActivity().getViewModelStore();
                Intrinsics.checkNotNullExpressionValue(viewModelStore, "");
                return viewModelStore;
            }
        }, new Function0<CreationExtras>() { // from class: com.okinc.unified.fragment.CeFiKlineFragment$klineTimeAnchorViewModel_delegate$lambda$0$$inlined$activityViewModels$default$2
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
                CreationExtras defaultViewModelCreationExtras = c55427xjj.requireActivity().getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "");
                return defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.unified.fragment.CeFiKlineFragment$klineTimeAnchorViewModel_delegate$lambda$0$$inlined$activityViewModels$default$3
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory = c55427xjj.requireActivity().getDefaultViewModelProviderFactory();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "");
                return defaultViewModelProviderFactory;
            }
        });
    }
}
