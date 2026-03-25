package com.okinc.core.ok_app.homepage.lite;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.media.AudioManager;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.provider.Settings;
import android.view.MenuItem;
import android.widget.FrameLayout;
import android.widget.Toast;
import androidx.activity.OnBackPressedCallback;
import androidx.annotation.IdRes;
import androidx.compose.material3.TooltipKt;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentContainerView;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.airbnb.lottie.LottieDrawable;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import com.okinc.business.defi.biz.core.error.WalletImportError;
import com.okinc.business.market.market.fragment.SpotQuoteNewFragment$handleTradeData$lambda$6$$inlined$viewModels$default$14;
import com.okinc.core.ok_app.homepage.lite.OKLiteMainContainerActivity;
import com.okinc.pop.manager.CheckMode;
import com.okinc.pop.manager.DialogQueueManager;
import com.okinc.rxutils.RxBus;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import o.AbstractActivityC33268mtJ;
import o.C10749buN;
import o.C17477fGu;
import o.C32805mkX;
import o.C33070mpX;
import o.C33160mrH;
import o.C33238msg;
import o.C33269mtK;
import o.C33292mth;
import o.C33494mxX;
import o.C33512mxp;
import o.C43251rlk;
import o.C52761wXj;
import o.C55089xdP;
import o.C55326xho;
import o.C56391yDq;
import o.C56403yEb;
import o.C56442yFn;
import o.C56524yIo;
import o.C6777aVl;
import o.InterfaceC33171mrS;
import o.InterfaceC33209msD;
import o.InterfaceC33212msG;
import o.InterfaceC33215msJ;
import o.InterfaceC33338mua;
import o.InterfaceC35204nqs;
import o.InterfaceC35205nqt;
import o.InterfaceC46518tXh;
import o.InterfaceC56387yDm;
import o.YY;
import o.Zk;
import o.mNP;
import o.pUU;
import o.rVN;
import o.yCM;
import o.yDY;
import o.yET;
import okio.Utf8;
import org.jetbrains.annotations.NotNull;
import org.luaj.vm2.LuaValue;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: loaded from: classes8.dex */
public final class OKLiteMainContainerActivity extends AbstractActivityC33268mtJ implements InterfaceC35204nqs, InterfaceC35205nqt, InterfaceC33215msJ {
    private static char[] AubY;
    public static final ActionBar Companion;
    public static final int djBIcL;
    private static int zsXlph;
    public FrameLayout AYXKKw;
    public String AkhnZx;
    public boolean AuCTel;
    public Long DbNXlk;
    public C55089xdP ejfBZ;
    public boolean fJNWhG;
    public FragmentContainerView fetchVPNInfo;
    public String gEmmrt;
    public final Set<InterfaceC33212msG> getNewProxyInstance;
    public final DialogQueueManager isConnected;
    public FrameLayout iwGUEr;

    @yCM
    public C33269mtK liteAmpCommonParamUseCase;
    public FrameLayout uzCIH;
    public String valueOf;
    public final InterfaceC56387yDm wlaJM;
    private static final byte[] $$c = {1, Ascii.US, 50, -112};
    private static final int $$f = 235;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {35, 2, -25, -2, -62, 58, 1, 5, Ascii.SI, -12, 53, -11, 6, -8, -54, 55, 16, 9, -4, -8, Ascii.EM, -19, 1, Ascii.NAK, 4, -5, -4, -52, 69, 4, -11, -50, Utf8.REPLACEMENT_BYTE, -4, 1, Ascii.FF, -4, 5, -52, 69, 5, 0, 10, -10, -2, 4, 16, -65, 66, -7, 5, 10, 0, -1, 1, 5, -52, 34, Ascii.EM, -27, 42, 0, -1, 1, 5, -23, Ascii.GS, Ascii.ETB, -38, Ascii.DC4, Ascii.VT, Ascii.FF, -40, 33, Ascii.FF, -6, 16, -14, Ascii.SYN, -2, 6, -28, 32, -4, -62, 58, -21, -6, -62, 74, -40, 17, 0, 41, Ascii.VT, -6, 6, -62, 72, 4, -9, -62, 62, -14, 32, -78, 51, 16, Ascii.NAK, -5, -21, 36, -16, 5, Ascii.VT, -38, 54, -9, 6, -5, 4, 16, -62, 60, -29, 8, -62, Ascii.SYN, 51, -1, Ascii.EM, -1, -66, 72, -12, 10, -58, SignedBytes.MAX_POWER_OF_TWO, 7, 8, -5, 0, 8, -61, 72, -11, 16, 7, -10, -3, 5, 17, -66, 56, Ascii.SI, -5, 10, -2, Ascii.SO, -2, -3, -2, 4, Ascii.FF, 9, -8, Ascii.SO, 8, -72, 72, -11, 16, -11, 4, -52, Ascii.CAN, 50, -10, -1, Ascii.SYN, -12, -25, Ascii.RS, 4, Ascii.FF, 9, -8, Ascii.SO, 8, -38, 34, 3, 0, -26, 36, -8, 16, -14, Ascii.SYN, -8, 9, 2, -24, Ascii.NAK, 16, -6, -5, Ascii.SO, 0, Ascii.DC4, -18, 16, -36, 44, -77, 82, -11, 16, -6, -5, Ascii.SO, 0, Ascii.DC4, -18, -31, 50, -10, -1, Ascii.SYN, -12, -25, Ascii.RS, 4, Ascii.FF, 9, -8, Ascii.SO, 8, -38, 34, 3, 0, -26, 36, -8, 16, -14, Ascii.SYN, -8, 9, 2, -41, 48, -8, Ascii.CAN, -82, 16, -10, Ascii.NAK, 7, Ascii.SI, Ascii.DC4, -11, -7, -62, 59, 7, -19, -45, 37, 47, -14, 9, 9, -5, Ascii.FF, 9, -36, Ascii.ETB, 16, -10, 9, 1, 16, Ascii.SI, 4, Ascii.FF, -18, 4, 4, -2, Ascii.ETB, -6, Ascii.VT, -62, SignedBytes.MAX_POWER_OF_TWO, -38, 52, Ascii.SI, 1, -60, 68, -1, 1, 8, -8, -50, 68, -1, -3, Ascii.SYN, -71, 56, 5, Ascii.FF, 9, -12, 16, -65, 74, -9, -56, 59, Ascii.SI, -14, 9, 9, -5, Ascii.FF, 9, -67, 35, Ascii.SUB, Ascii.DC2, 6, -5, 6, -4, -38, 48, 8, 3, -2, 1, -23, Ascii.CAN, 0, 3, Ascii.DC2, -43, 47, -14, 9, 9, -5, Ascii.FF, 9, -77, 82, 0, -8, 1, 9, -5, Ascii.SO, -69, 3, 72, 8, 1, 0, 8, -6, 2, -61, SignedBytes.MAX_POWER_OF_TWO, 5, Ascii.DC4, -8, 16, -10, Ascii.SO, 8, -32, Ascii.SYN, -1, Ascii.NAK, -39, 37, -8, 4, 10, 10, -76, 67, 4, 4, -2, Ascii.ETB, -6, Ascii.VT, -77, 16, -62, 73, -34, 9, -62, Ascii.ETB, 51, -23};
    private static final int $$e = 5;
    private static final byte[] $$a = {Ascii.RS, -87, -60, -80, -22, -23, -7, 17, 2, -39, -9, 8, -4, -13, Ascii.SO, -51, Ascii.CR, -7, 39, -8, -27, Ascii.SYN, -40, -16, 52, -45, Ascii.FF, -13, -2, -10, Ascii.DC4, -2, -2, 4, -21, 8, -9, Ascii.DC4, -12, -10, Ascii.SI, Ascii.NAK, -24, -5, -13, -18, Ascii.CR, 9};
    private static final int $$b = 198;
    private static int AwvSrB = 1;
    private static int AuCTelauCTel = 0;
    private static int zLjUOn = 1;
    public final TabUIElementsManager getFieldNames = new TabUIElementsManager();
    public String AhwBna = "OKLiteMainContainerActivity";
    public final FragmentManager hDKMBd = new FragmentManager();
    public final HashMap<Integer, InterfaceC33338mua> values = new HashMap<>();
    public final TaskDescription fIwbmz = new TaskDescription();
    public final List<InterfaceC33338mua> fARcdN = new ArrayList();

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$g(short s, short s2, short s3) {
        int i;
        int i2;
        int i3 = 122 - s2;
        int i4 = (s * 3) + 1;
        byte[] bArr = $$c;
        int i5 = 3 - (s3 * 4);
        byte[] bArr2 = new byte[i4];
        if (bArr == null) {
            int i6 = i5;
            i2 = 0;
            int i7 = i4;
            i3 = (-i3) + i7;
            i5 = i6;
            i = i2;
            int i8 = i5 + 1;
            i2 = i + 1;
            bArr2[i] = (byte) i3;
            if (i2 == i4) {
                return new String(bArr2, 0);
            }
            byte b = bArr[i8];
            i7 = i3;
            i3 = b;
            i6 = i8;
            i3 = (-i3) + i7;
            i5 = i6;
            i = i2;
            int i82 = i5 + 1;
            i2 = i + 1;
            bArr2[i] = (byte) i3;
            if (i2 == i4) {
            }
        } else {
            i = 0;
            int i822 = i5 + 1;
            i2 = i + 1;
            bArr2[i] = (byte) i3;
            if (i2 == i4) {
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static /* synthetic */ Object EZpvd(int i, int i2, int i3, int i4, Object[] objArr, int i5, int i6) {
        int i7 = ~i4;
        int i8 = ~i2;
        int i9 = ~(i7 | i8);
        int i10 = (~(i7 | i3)) | i9 | (~(i8 | i3));
        int i11 = ~i3;
        int i12 = (~(i8 | i11)) | i9;
        int i13 = (~(i11 | i7)) | i2;
        int i14 = i4 + i2 + i + ((-700610695) * i6) + ((-1151578525) * i5);
        int i15 = i14 * i14;
        int i16 = (1165304685 * i4) + 1030029312 + ((-1366800679) * i2) + (i10 * (-1762861932)) + (i12 * (-1762861932)) + ((-1762861932) * i13) + ((-597557248) * i) + ((-665714688) * i6) + (367394816 * i5) + (374145024 * i15);
        int i17 = ((i4 * 323709325) - 650539883) + (i2 * 323709049) + (i10 * 276) + (i12 * 276) + (i13 * 276) + (i * 323709601) + (i6 * (-499299047)) + (i5 * 1568885315) + (i15 * (-395509760));
        int i18 = i16 + (i17 * i17 * (-772603904));
        return i18 != 1 ? i18 != 2 ? i18 != 3 ? i18 != 4 ? OLrzqt(objArr) : KWHzl(objArr) : copydefault(objArr) : AEQbTJ(objArr) : EZpvd(objArr);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(byte b, byte b2, byte b3, Object[] objArr) {
        int i;
        int i2 = b2 + 65;
        byte[] bArr = $$a;
        int i3 = b3 + 4;
        byte[] bArr2 = new byte[11 - b];
        int i4 = 10 - b;
        if (bArr == null) {
            int i5 = i3;
            int i6 = 0;
            int i7 = i4;
            int i8 = i7 + (-i2);
            int i9 = i5 + 1;
            int i10 = i8 - 1;
            i = i6;
            i3 = i9;
            i2 = i10;
            bArr2[i] = (byte) i2;
            i6 = i + 1;
            if (i == i4) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            byte b4 = bArr[i3];
            int i11 = i3;
            i7 = i2;
            i2 = b4;
            i5 = i11;
            int i82 = i7 + (-i2);
            int i92 = i5 + 1;
            int i102 = i82 - 1;
            i = i6;
            i3 = i92;
            i2 = i102;
            bArr2[i] = (byte) i2;
            i6 = i + 1;
            if (i == i4) {
            }
        } else {
            i = 0;
            bArr2[i] = (byte) i2;
            i6 = i + 1;
            if (i == i4) {
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void c(short s, int i, byte b, Object[] objArr) {
        int i2;
        int i3 = 407 - s;
        byte[] bArr = $$d;
        int i4 = (b * 2) + 65;
        byte[] bArr2 = new byte[130 - i];
        int i5 = 129 - i;
        if (bArr == 0) {
            int i6 = i3;
            int i7 = 0;
            i3++;
            i4 = (i4 + i6) - 3;
            i2 = i7;
            bArr2[i2] = (byte) i4;
            i7 = i2 + 1;
            if (i2 == i5) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            i6 = bArr[i3];
            i3++;
            i4 = (i4 + i6) - 3;
            i2 = i7;
            bArr2[i2] = (byte) i4;
            i7 = i2 + 1;
            if (i2 == i5) {
            }
        } else {
            i2 = 0;
            bArr2[i2] = (byte) i4;
            i7 = i2 + 1;
            if (i2 == i5) {
            }
        }
    }

    public static final /* synthetic */ boolean EZpvd(OKLiteMainContainerActivity oKLiteMainContainerActivity) {
        int i = 2 % 2;
        int i2 = AuCTelauCTel + 37;
        zLjUOn = i2 % 128;
        int i3 = i2 % 2;
        boolean zHDKMBd = oKLiteMainContainerActivity.hDKMBd();
        int i4 = zLjUOn + 101;
        AuCTelauCTel = i4 % 128;
        int i5 = i4 % 2;
        return zHDKMBd;
    }

    public static final /* synthetic */ OKLiteMainContainerViewModel KWHzl(OKLiteMainContainerActivity oKLiteMainContainerActivity) {
        int i = 2 % 2;
        int i2 = zLjUOn + 109;
        AuCTelauCTel = i2 % 128;
        int i3 = i2 % 2;
        OKLiteMainContainerViewModel oKLiteMainContainerViewModelDbNXlk = oKLiteMainContainerActivity.DbNXlk();
        int i4 = AuCTelauCTel + 99;
        zLjUOn = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 5 / 0;
        }
        return oKLiteMainContainerViewModelDbNXlk;
    }

    public OKLiteMainContainerActivity() {
        final Function0 function0 = null;
        this.wlaJM = new ViewModelLazy(C56524yIo.AEQbTJ(OKLiteMainContainerViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.core.ok_app.homepage.lite.OKLiteMainContainerActivity$special$$inlined$viewModels$default$2
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                ViewModelStore viewModelStore = this.getViewModelStore();
                Intrinsics.checkNotNullExpressionValue(viewModelStore, "");
                return viewModelStore;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.core.ok_app.homepage.lite.OKLiteMainContainerActivity$special$$inlined$viewModels$default$1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory = this.getDefaultViewModelProviderFactory();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "");
                return defaultViewModelProviderFactory;
            }
        }, new Function0<CreationExtras>() { // from class: com.okinc.core.ok_app.homepage.lite.OKLiteMainContainerActivity$special$$inlined$viewModels$default$3
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
                CreationExtras defaultViewModelCreationExtras = this.getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "");
                return defaultViewModelCreationExtras;
            }
        });
        Set<InterfaceC33212msG> setSynchronizedSet = Collections.synchronizedSet(new LinkedHashSet());
        setSynchronizedSet.addAll(AYXKKw());
        this.getNewProxyInstance = setSynchronizedSet;
        DialogQueueManager dialogQueueManager = new DialogQueueManager(this, CheckMode.PARALLEL);
        dialogQueueManager.KWHzl(true);
        this.isConnected = dialogQueueManager;
    }

    public static final class FragmentManager implements C33512mxp.ActionBar {
        public FragmentManager() {
        }

        @Override // o.C33512mxp.ActionBar
        public void copydefault(int i) {
            OKLiteMainContainerActivity.this.recreate();
        }

        @Override // o.C33512mxp.ActionBar
        public void AEQbTJ(int i) {
            OKLiteMainContainerActivity.this.recreate();
        }
    }

    public final List<InterfaceC33338mua> AYXKKw() {
        int i = 2 % 2;
        List<InterfaceC33338mua> listKWHzl = C43251rlk.KWHzl(C56524yIo.AEQbTJ(InterfaceC33338mua.class));
        if (listKWHzl != null) {
            return listKWHzl;
        }
        int i2 = AuCTelauCTel + 35;
        zLjUOn = i2 % 128;
        int i3 = i2 % 2;
        List<InterfaceC33338mua> listAhwBna = yDY.AhwBna();
        int i4 = AuCTelauCTel + 57;
        zLjUOn = i4 % 128;
        int i5 = i4 % 2;
        return listAhwBna;
    }

    public static final class Activity<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return yET.KWHzl(Integer.valueOf(((InterfaceC33338mua) t).KWHzl()), Integer.valueOf(((InterfaceC33338mua) t2).KWHzl()));
        }
    }

    public static final class Application<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return yET.KWHzl(Integer.valueOf(((InterfaceC33338mua) t).KWHzl()), Integer.valueOf(((InterfaceC33338mua) t2).KWHzl()));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [106=4] */
    public final Map<String, InterfaceC33338mua> values() {
        int i = 2 % 2;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int i2 = zLjUOn + 13;
        AuCTelauCTel = i2 % 128;
        int i3 = i2 % 2;
        for (InterfaceC33338mua interfaceC33338mua : AYXKKw()) {
            int i4 = AuCTelauCTel + WalletImportError.ERROR_CODE_HARDWARE_ACCOUNT_EXIST;
            zLjUOn = i4 % 128;
            int i5 = i4 % 2;
            String strOLrzqt = interfaceC33338mua.OLrzqt();
            if (strOLrzqt != null) {
                int i6 = zLjUOn + 41;
                AuCTelauCTel = i6 % 128;
                int i7 = i6 % 2;
                linkedHashMap.put(strOLrzqt, interfaceC33338mua);
            }
        }
        return linkedHashMap;
    }

    private static /* synthetic */ Object KWHzl(Object[] objArr) {
        Object next;
        int i = 2 % 2;
        List<InterfaceC33338mua> listAYXKKw = ((OKLiteMainContainerActivity) objArr[0]).AYXKKw();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = listAYXKKw.iterator();
        while (!(!it.hasNext())) {
            int i2 = zLjUOn + 25;
            AuCTelauCTel = i2 % 128;
            if (i2 % 2 != 0) {
                next = it.next();
                int i3 = 14 / 0;
                if (((InterfaceC33338mua) next).EZpvd()) {
                    arrayList.add(next);
                }
            } else {
                next = it.next();
                if (((InterfaceC33338mua) next).EZpvd()) {
                    arrayList.add(next);
                }
            }
        }
        List listAhwBna = CollectionsKt___CollectionsKt.AhwBna((Iterable) CollectionsKt___CollectionsKt.EZpvd(arrayList, new Activity()), 5);
        int i4 = AuCTelauCTel + 9;
        zLjUOn = i4 % 128;
        int i5 = i4 % 2;
        return listAhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OKLiteMainContainerViewModel DbNXlk() {
        OKLiteMainContainerViewModel oKLiteMainContainerViewModel;
        int i = 2 % 2;
        int i2 = zLjUOn + 105;
        AuCTelauCTel = i2 % 128;
        if (i2 % 2 != 0) {
            oKLiteMainContainerViewModel = (OKLiteMainContainerViewModel) this.wlaJM.getValue();
            int i3 = 69 / 0;
        } else {
            oKLiteMainContainerViewModel = (OKLiteMainContainerViewModel) this.wlaJM.getValue();
        }
        int i4 = zLjUOn + 29;
        AuCTelauCTel = i4 % 128;
        int i5 = i4 % 2;
        return oKLiteMainContainerViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static /* synthetic */ Object copydefault(Object[] objArr) {
        OKLiteMainContainerActivity oKLiteMainContainerActivity = (OKLiteMainContainerActivity) objArr[0];
        int i = 2 % 2;
        int i2 = AuCTelauCTel + 93;
        zLjUOn = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            C33269mtK c33269mtK = oKLiteMainContainerActivity.liteAmpCommonParamUseCase;
            throw null;
        }
        C33269mtK c33269mtK2 = oKLiteMainContainerActivity.liteAmpCommonParamUseCase;
        if (c33269mtK2 != null) {
            return c33269mtK2;
        }
        Intrinsics.gEmmrt("");
        int i3 = zLjUOn + 115;
        AuCTelauCTel = i3 % 128;
        if (i3 % 2 == 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    public static final class StateListAnimator extends OnBackPressedCallback {
        public StateListAnimator() {
            super(true);
        }

        @Override // androidx.activity.OnBackPressedCallback
        public void handleOnBackPressed() {
            if (OKLiteMainContainerActivity.EZpvd(OKLiteMainContainerActivity.this)) {
                OKLiteMainContainerActivity.this.moveTaskToBack(true);
            }
        }
    }

    /* JADX INFO: renamed from: com.okinc.core.ok_app.homepage.lite.OKLiteMainContainerActivity$onCreate$6, reason: invalid class name */
    /* JADX INFO: loaded from: classes18.dex */
    public static final class AnonymousClass6 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AnonymousClass6(Continuation<? super AnonymousClass6> continuation) {
            super(2, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return OKLiteMainContainerActivity.this.new AnonymousClass6(continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass6) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX INFO: renamed from: com.okinc.core.ok_app.homepage.lite.OKLiteMainContainerActivity$onCreate$6$1, reason: invalid class name */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
            /* synthetic */ boolean Z$0;
            int label;
            final /* synthetic */ OKLiteMainContainerActivity this$0;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(OKLiteMainContainerActivity oKLiteMainContainerActivity, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = oKLiteMainContainerActivity;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.Z$0 = ((Boolean) obj).booleanValue();
                return anonymousClass1;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function2
            public /* synthetic */ Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
                return invoke(bool.booleanValue(), continuation);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Object invoke(boolean z, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(Boolean.valueOf(z), continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                C56442yFn.copydefault();
                if (this.label == 0) {
                    C56391yDq.AEQbTJ(obj);
                    boolean z = this.Z$0;
                    if (mNP.AEQbTJ.copydefault() && !z) {
                        return Unit.INSTANCE;
                    }
                    this.this$0.copydefault(z);
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                StateFlow<Boolean> stateFlowCopydefault = OKLiteMainContainerActivity.KWHzl(OKLiteMainContainerActivity.this).copydefault();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(OKLiteMainContainerActivity.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(stateFlowCopydefault, anonymousClass1, this) == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [220=7] */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    private static void a(byte[] bArr, boolean z, int[] iArr, Object[] objArr) throws Throwable {
        int i;
        int length;
        char[] cArr;
        int i2;
        int i3 = 2 % 2;
        Zk zk = new Zk();
        int i4 = iArr[0];
        int i5 = iArr[1];
        int i6 = iArr[2];
        int i7 = iArr[3];
        char[] cArr2 = AubY;
        if (cArr2 != null) {
            int i8 = $10 + 107;
            $11 = i8 % 128;
            if (i8 % 2 == 0) {
                length = cArr2.length;
                cArr = new char[length];
                i2 = 1;
            } else {
                length = cArr2.length;
                cArr = new char[length];
                i2 = 0;
            }
            while (i2 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i2])};
                    Object objEZpvd = YY.EZpvd(-455689676);
                    if (objEZpvd == null) {
                        byte b = $$c[0];
                        byte b2 = (byte) (b - 1);
                        objEZpvd = YY.EZpvd(398, 5, (char) 0, -520718520, false, $$g(b2, (byte) (b2 | 56), (byte) (b - 1)), new Class[]{Integer.TYPE});
                    }
                    cArr[i2] = ((Character) ((Method) objEZpvd).invoke(null, objArr2)).charValue();
                    i2++;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            int i9 = $11 + 27;
            $10 = i9 % 128;
            int i10 = i9 % 2;
            cArr2 = cArr;
        }
        char[] cArr3 = new char[i5];
        System.arraycopy(cArr2, i4, cArr3, 0, i5);
        if (bArr != null) {
            char[] cArr4 = new char[i5];
            zk.EZpvd = 0;
            char c = 0;
            while (zk.EZpvd < i5) {
                if (bArr[zk.EZpvd] == 1) {
                    int i11 = zk.EZpvd;
                    Object[] objArr3 = {Integer.valueOf(cArr3[zk.EZpvd]), Integer.valueOf(c)};
                    Object objEZpvd2 = YY.EZpvd(-1969893699);
                    if (objEZpvd2 == null) {
                        byte b3 = $$c[0];
                        byte b4 = (byte) (b3 - 1);
                        objEZpvd2 = YY.EZpvd(CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA256, 4, (char) 0, -1900739647, false, $$g(b4, (byte) (b4 | 55), (byte) (b3 - 1)), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i11] = ((Character) ((Method) objEZpvd2).invoke(null, objArr3)).charValue();
                } else {
                    int i12 = zk.EZpvd;
                    Object[] objArr4 = {Integer.valueOf(cArr3[zk.EZpvd]), Integer.valueOf(c)};
                    Object objEZpvd3 = YY.EZpvd(1852960686);
                    if (objEZpvd3 == null) {
                        byte b5 = (byte) ($$c[0] - 1);
                        byte b6 = b5;
                        objEZpvd3 = YY.EZpvd(125, 4, (char) 0, 1783702226, false, $$g(b5, b6, b6), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i12] = ((Character) ((Method) objEZpvd3).invoke(null, objArr4)).charValue();
                }
                c = cArr4[zk.EZpvd];
                Object[] objArr5 = {zk, zk};
                Object objEZpvd4 = YY.EZpvd(795576183);
                if (objEZpvd4 == null) {
                    byte b7 = $$c[0];
                    byte b8 = (byte) (b7 - 1);
                    objEZpvd4 = YY.EZpvd(97, 4, (char) 0, 726354443, false, $$g(b8, (byte) (b8 | 49), (byte) (b7 - 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objEZpvd4).invoke(null, objArr5);
            }
            cArr3 = cArr4;
        }
        if (i7 > 0) {
            int i13 = $10 + 51;
            $11 = i13 % 128;
            int i14 = i13 % 2;
            char[] cArr5 = new char[i5];
            System.arraycopy(cArr3, 0, cArr5, 0, i5);
            int i15 = i5 - i7;
            System.arraycopy(cArr5, 0, cArr3, i15, i7);
            System.arraycopy(cArr5, i7, cArr3, 0, i15);
        }
        if (z) {
            char[] cArr6 = new char[i5];
            zk.EZpvd = 0;
            while (zk.EZpvd < i5) {
                int i16 = $11 + 81;
                $10 = i16 % 128;
                if (i16 % 2 != 0) {
                    cArr6[zk.EZpvd] = cArr3[(zk.EZpvd * i5) - 1];
                    i = zk.EZpvd % 1;
                } else {
                    cArr6[zk.EZpvd] = cArr3[(i5 - zk.EZpvd) - 1];
                    i = zk.EZpvd + 1;
                }
                zk.EZpvd = i;
            }
            cArr3 = cArr6;
        }
        if (i6 > 0) {
            int i17 = $10 + 23;
            $11 = i17 % 128;
            int i18 = i17 % 2;
            zk.EZpvd = 0;
            while (zk.EZpvd < i5) {
                cArr3[zk.EZpvd] = (char) (cArr3[zk.EZpvd] - iArr[2]);
                zk.EZpvd++;
            }
        }
        objArr[0] = new String(cArr3);
    }

    static {
        zsXlph = 0;
        uzCIH();
        Companion = new ActionBar(null);
        djBIcL = 8;
        int i = AwvSrB + 123;
        zsXlph = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public static /* synthetic */ Unit AEQbTJ(OKLiteMainContainerActivity oKLiteMainContainerActivity, int i) {
        int i2 = 2 % 2;
        int i3 = zLjUOn + 13;
        AuCTelauCTel = i3 % 128;
        int i4 = i3 % 2;
        Unit unitCopydefault = copydefault(oKLiteMainContainerActivity, i);
        int i5 = AuCTelauCTel + 85;
        zLjUOn = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 7 / 0;
        }
        return unitCopydefault;
    }

    public static /* synthetic */ boolean EZpvd(OKLiteMainContainerActivity oKLiteMainContainerActivity, MenuItem menuItem) {
        int i = 2 % 2;
        int i2 = zLjUOn + 15;
        AuCTelauCTel = i2 % 128;
        int i3 = i2 % 2;
        boolean zOLrzqt = OLrzqt(oKLiteMainContainerActivity, menuItem);
        int i4 = zLjUOn + 29;
        AuCTelauCTel = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 6 / 0;
        }
        return zOLrzqt;
    }

    public static /* synthetic */ void OLrzqt(OKLiteMainContainerActivity oKLiteMainContainerActivity) {
        int i = 2 % 2;
        int i2 = zLjUOn + 107;
        AuCTelauCTel = i2 % 128;
        int i3 = i2 % 2;
        AEQbTJ(oKLiteMainContainerActivity);
        if (i3 != 0) {
            throw null;
        }
    }

    public static /* synthetic */ void copydefault(OKLiteMainContainerActivity oKLiteMainContainerActivity, int i, InterfaceC33338mua interfaceC33338mua) {
        int i2 = 2 % 2;
        int i3 = zLjUOn + 35;
        AuCTelauCTel = i3 % 128;
        int i4 = i3 % 2;
        AEQbTJ(oKLiteMainContainerActivity, i, interfaceC33338mua);
        int i5 = AuCTelauCTel + 101;
        zLjUOn = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // o.AbstractActivityC33041mov, o.InterfaceC33019moZ
    public boolean animOpen() {
        int i = 2 % 2;
        int i2 = zLjUOn + 9;
        AuCTelauCTel = i2 % 128;
        int i3 = i2 % 2;
        return false;
    }

    public static final class TaskDescription {
        public final Map<Integer, InterfaceC33338mua> copydefault = new HashMap();
        public final Map<InterfaceC33338mua, Integer> OLrzqt = new HashMap();

        public final void EZpvd(int i, @NotNull InterfaceC33338mua interfaceC33338mua) {
            Intrinsics.checkNotNullParameter(interfaceC33338mua, "");
            this.copydefault.put(Integer.valueOf(i), interfaceC33338mua);
            this.OLrzqt.put(interfaceC33338mua, Integer.valueOf(i));
        }

        public final InterfaceC33338mua OLrzqt(@IdRes int i) {
            return this.copydefault.get(Integer.valueOf(i));
        }

        public final Integer EZpvd(@NotNull InterfaceC33338mua interfaceC33338mua) {
            Intrinsics.checkNotNullParameter(interfaceC33338mua, "");
            return this.OLrzqt.get(interfaceC33338mua);
        }

        public final void AEQbTJ() {
            this.copydefault.clear();
            this.OLrzqt.clear();
        }
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.core.ok_app.homepage.lite.OKLiteMainContainerActivity.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [335=11] */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r30v0, resolved type: com.okinc.core.ok_app.homepage.lite.OKLiteMainContainerActivity */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x059e  */
    /* JADX WARN: Type inference failed for: r5v3, types: [boolean, int] */
    @Override // o.AbstractActivityC33268mtJ, o.AbstractActivityC33008moO, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onCreate(Bundle bundle) throws Throwable {
        Object[] objArr;
        Object[] objArr2;
        Object[] objArr3;
        int i = 2 % 2;
        Object objEZpvd = YY.EZpvd(1466271760);
        if (objEZpvd == null) {
            Object[] objArr4 = new Object[1];
            b((byte) ($$b & 31), (byte) (-$$a[29]), r12[47], objArr4);
            objEZpvd = YY.EZpvd(469, 4, (char) 64485, 1397048684, false, (String) objArr4[0], null);
        }
        Object obj = null;
        long j = ((Field) objEZpvd).getLong(null);
        if (j != -1) {
            int i2 = zLjUOn + 69;
            AuCTelauCTel = i2 % 128;
            int i3 = i2 % 2;
            long j2 = j + 4611686018427387881L;
            Object[] objArr5 = new Object[1];
            a(new byte[]{1, 1, 0, 0, 1, 0, 1, 0, 1, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0}, false, new int[]{0, 22, 0, 0}, objArr5);
            Class<?> cls = Class.forName((String) objArr5[0]);
            Object[] objArr6 = new Object[1];
            a(new byte[]{1, 1, 1, 1, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 0}, false, new int[]{22, 15, 0, 0}, objArr6);
            if (j2 >= ((Long) cls.getDeclaredMethod((String) objArr6[0], new Class[0]).invoke(null, new Object[0])).longValue()) {
                int i4 = AuCTelauCTel + 79;
                zLjUOn = i4 % 128;
                int i5 = i4 % 2;
                Object objEZpvd2 = YY.EZpvd(574053742);
                if (objEZpvd2 == null) {
                    byte b = (byte) 0;
                    Object[] objArr7 = new Object[1];
                    b(b, (byte) (b | 34), (byte) (-$$a[5]), objArr7);
                    objEZpvd2 = YY.EZpvd(469, 4, (char) 64485, 639078418, false, (String) objArr7[0], null);
                }
                Object[] objArr8 = (Object[]) ((Field) objEZpvd2).get(null);
                int i6 = ((int[]) objArr8[2])[0];
                int i7 = ((int[]) objArr8[0])[0];
                String[] strArr = (String[]) objArr8[3];
                int[] iArr = {i6};
                int[] iArr2 = {i7};
                int iIdentityHashCode = System.identityHashCode(this);
                int i8 = ~iIdentityHashCode;
                int i9 = 412657701 + (((~((-337) | i8)) | (~(2116817276 | iIdentityHashCode))) * 520);
                int i10 = ~((-2116817277) | i8);
                int i11 = ~(iIdentityHashCode | 30486353);
                int i12 = i9 + ((i10 | i11) * (-1040)) + ((i11 | (~(i8 | (-30486354))) | 2116816940) * 520) + 647423635;
                int i13 = (i12 << 13) ^ i12;
                int i14 = i13 ^ (i13 >>> 17);
                ((int[]) objArr[1])[0] = i14 ^ (i14 << 5);
                objArr = new Object[]{iArr2, new int[1], iArr, strArr};
            } else {
                Object[] objArr9 = new Object[1];
                a(new byte[]{1, 1, 1, 1, 1, 1, 0, 0, 1, 1, 0, 1, 1, 1, 1, 1}, false, new int[]{37, 16, 81, 11}, objArr9);
                Class<?> cls2 = Class.forName((String) objArr9[0]);
                Object[] objArr10 = new Object[1];
                a(new byte[]{0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 0, 1, 1, 0, 1, 1}, false, new int[]{53, 16, 75, 0}, objArr10);
                int iIntValue = ((Integer) cls2.getMethod((String) objArr10[0], Object.class).invoke(null, this)).intValue();
                int i15 = zLjUOn + 103;
                int i16 = i15 % 128;
                AuCTelauCTel = i16;
                int i17 = i15 % 2;
                int i18 = i16 + 61;
                zLjUOn = i18 % 128;
                int i19 = i18 % 2;
                try {
                    Object[] objArr11 = {Integer.valueOf(iIntValue), 647423635};
                    short s = $$d[24];
                    Object[] objArr12 = new Object[1];
                    c(s, (byte) (s | 121), r3[67], objArr12);
                    Class<?> cls3 = Class.forName((String) objArr12[0]);
                    Object[] objArr13 = new Object[1];
                    c((short) 315, (byte) 124, r3[138], objArr13);
                    objArr = (Object[]) cls3.getMethod((String) objArr13[0], Integer.TYPE, Integer.TYPE).invoke(null, objArr11);
                    Object objEZpvd3 = YY.EZpvd(574053742);
                    if (objEZpvd3 == null) {
                        byte b2 = (byte) 0;
                        Object[] objArr14 = new Object[1];
                        b(b2, (byte) (b2 | 34), (byte) (-$$a[5]), objArr14);
                        objEZpvd3 = YY.EZpvd(469, 4, (char) 64485, 639078418, false, (String) objArr14[0], null);
                    }
                    ((Field) objEZpvd3).set(null, objArr);
                    try {
                        Object[] objArr15 = new Object[1];
                        a(new byte[]{1, 1, 0, 0, 1, 0, 1, 0, 1, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0}, false, new int[]{0, 22, 0, 0}, objArr15);
                        Class<?> cls4 = Class.forName((String) objArr15[0]);
                        Object[] objArr16 = new Object[1];
                        a(new byte[]{1, 1, 1, 1, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 0}, false, new int[]{22, 15, 0, 0}, objArr16);
                        Long lValueOf = Long.valueOf(((Long) cls4.getDeclaredMethod((String) objArr16[0], new Class[0]).invoke(null, new Object[0])).longValue());
                        Object objEZpvd4 = YY.EZpvd(1466271760);
                        if (objEZpvd4 == null) {
                            Object[] objArr17 = new Object[1];
                            b((byte) ($$b & 31), (byte) (-$$a[29]), r10[47], objArr17);
                            objEZpvd4 = YY.EZpvd(469, 4, (char) 64485, 1397048684, false, (String) objArr17[0], null);
                        }
                        ((Field) objEZpvd4).set(null, lValueOf);
                    } catch (Exception unused) {
                        throw new RuntimeException();
                    }
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
        }
        int i20 = ((int[]) objArr[0])[0];
        int i21 = ((int[]) objArr[2])[0];
        if (i21 != i20) {
            ArrayList arrayList = new ArrayList();
            String[] strArr2 = (String[]) objArr[3];
            if (strArr2 != null) {
                for (String str : strArr2) {
                    int i22 = AuCTelauCTel + 69;
                    zLjUOn = i22 % 128;
                    int i23 = i22 % 2;
                    arrayList.add(str);
                }
            }
            throw new RuntimeException(String.valueOf(i21));
        }
        int i24 = ((int[]) objArr[1])[0];
        int i25 = ((int[]) objArr[2])[0];
        int i26 = ((int[]) objArr[0])[0];
        String[] strArr3 = (String[]) objArr[3];
        int i27 = ~((~((int) Runtime.getRuntime().freeMemory())) | 287764146);
        int i28 = i24 + ((287354016 | i27) * (-374)) + 2090134593 + ((i27 | 410130) * 374);
        int i29 = (i28 << 13) ^ i28;
        int i30 = i29 ^ (i29 >>> 17);
        ((int[]) objArr[1])[0] = i30 ^ (i30 << 5);
        Object[] objArr18 = {new int[]{i26}, new int[1], new int[]{i25}, strArr3};
        super.onCreate(bundle);
        Iterator<T> it = AYXKKw().iterator();
        while (it.hasNext()) {
            ((InterfaceC33338mua) it.next()).copydefault(this);
        }
        C33292mth c33292mthCopydefault = C33292mth.copydefault(getLayoutInflater());
        setContentView(c33292mthCopydefault.getRoot());
        this.AYXKKw = c33292mthCopydefault.OLrzqt;
        this.fetchVPNInfo = c33292mthCopydefault.AEQbTJ;
        this.iwGUEr = c33292mthCopydefault.valueOf;
        this.uzCIH = c33292mthCopydefault.copydefault;
        C55089xdP c55089xdP = c33292mthCopydefault.EZpvd;
        Intrinsics.checkNotNullExpressionValue(c55089xdP, "");
        c55089xdP.setUseArcTopTabBarStyle(false);
        this.ejfBZ = c55089xdP;
        getLifecycle().addObserver(DbNXlk());
        TabUIElementsManager tabUIElementsManager = this.getFieldNames;
        androidx.fragment.app.FragmentManager supportFragmentManager = getSupportFragmentManager();
        String strConcat = "1,".concat("getSupportFragmentManager(...)");
        int i31 = ((int[]) objArr18[1])[0];
        int i32 = i31 * i31;
        int i33 = -(i31 * 505599145);
        int i34 = (i32 & i33) + (i33 | i32);
        int i35 = -(i31 * 1626723345);
        int i36 = (i34 & i35) + (i34 | i35);
        int i37 = ((i36 | 663038409) << 1) - (663038409 ^ i36);
        int i38 = i37 >> 24;
        int i39 = ((((i38 | (-511)) << 1) - (i38 ^ (-511))) / 256) + 1;
        int i40 = (i37 ^ i39) + ((i39 & i37) << 1);
        int i41 = i37 >> 27;
        int i42 = ((i41 ^ (-63)) + ((i41 & (-63)) << 1)) / 32;
        int i43 = (-(i40 ^ ((i42 ^ 1) + ((i42 & 1) << 1)))) + 8;
        int i44 = ((i43 >> 29) - 15) / 8;
        int i45 = ((i44 | 1) << 1) - (i44 ^ 1);
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, strConcat.substring(31760 / ((i43 & (-((i45 ^ 1) + ((i45 & 1) << 1)))) * 1985)));
        FrameLayout frameLayout = this.iwGUEr;
        if (frameLayout == null) {
            Intrinsics.gEmmrt("");
            frameLayout = null;
        }
        FrameLayout frameLayout2 = this.uzCIH;
        if (frameLayout2 == null) {
            int i46 = AuCTelauCTel + 75;
            zLjUOn = i46 % 128;
            if (i46 % 2 == 0) {
                Intrinsics.gEmmrt("");
                obj.hashCode();
                throw null;
            }
            Intrinsics.gEmmrt("");
            frameLayout2 = null;
        }
        Lifecycle lifecycle = getLifecycle();
        Intrinsics.checkNotNullExpressionValue(lifecycle, "");
        tabUIElementsManager.OLrzqt(supportFragmentManager, frameLayout, frameLayout2, lifecycle);
        Intent intent = getIntent();
        Boolean boolValueOf = intent != null ? Boolean.valueOf(intent.getBooleanExtra("show", false)) : null;
        Intent intent2 = getIntent();
        if (intent2 != null) {
            int i47 = zLjUOn + 103;
            AuCTelauCTel = i47 % 128;
            if (i47 % 2 != 0) {
                intent2.removeExtra("show");
                obj.hashCode();
                throw null;
            }
            intent2.removeExtra("show");
        }
        this.AuCTel = boolValueOf != null ? boolValueOf.booleanValue() : false;
        getNewProxyInstance();
        fetchVPNInfo();
        if (bundle != null) {
            this.AkhnZx = bundle.getString("current_tab");
            this.gEmmrt = bundle.getString("current_tab_tag");
            this.valueOf = bundle.getString("current_navigation_target");
            bundle.remove("current_tab");
            bundle.remove("current_tab_tag");
            bundle.remove("current_navigation_target");
            fIwbmz();
        }
        Object objEZpvd5 = YY.EZpvd(862119861);
        if (objEZpvd5 == null) {
            byte b3 = (byte) (-$$a[43]);
            Object[] objArr19 = new Object[1];
            b(b3, (byte) (b3 - 5), r0[18], objArr19);
            objEZpvd5 = YY.EZpvd(129, 4, (char) 39078, 927083209, false, (String) objArr19[0], null);
        }
        long j3 = ((Field) objEZpvd5).getLong(null);
        if (j3 != -1) {
            long j4 = j3 + 1911;
            Object[] objArr20 = new Object[1];
            a(new byte[]{1, 1, 0, 0, 1, 0, 1, 0, 1, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0}, false, new int[]{0, 22, 0, 0}, objArr20);
            Class<?> cls5 = Class.forName((String) objArr20[0]);
            Object[] objArr21 = new Object[1];
            a(new byte[]{1, 1, 1, 1, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 0}, false, new int[]{22, 15, 0, 0}, objArr21);
            if (j4 >= ((Long) cls5.getDeclaredMethod((String) objArr21[0], new Class[0]).invoke(null, new Object[0])).longValue()) {
                Object objEZpvd6 = YY.EZpvd(2079129037);
                if (objEZpvd6 == null) {
                    byte b4 = (byte) ($$b & 31);
                    byte b5 = $$a[33];
                    Object[] objArr22 = new Object[1];
                    b(b4, b5, (byte) (b5 - 4), objArr22);
                    objEZpvd6 = YY.EZpvd(129, 4, (char) 39078, 2144088241, false, (String) objArr22[0], null);
                }
                Object[] objArr23 = (Object[]) ((Field) objEZpvd6).get(null);
                objArr2 = new Object[]{new int[1], new int[]{i}, strArr, new int[]{i}};
                int i48 = ((int[]) objArr23[3])[0];
                int i49 = ((int[]) objArr23[1])[0];
                String[] strArr4 = (String[]) objArr23[2];
                int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
                int i50 = 322355685 + (((-81997) | (~iFreeMemory)) * (-490)) + (((~(iFreeMemory | (-1990023150))) | 1989941153) * 490) + 1903000594;
                int i51 = (i50 << 13) ^ i50;
                int i52 = i51 ^ (i51 >>> 17);
                ((int[]) objArr2[0])[0] = i52 ^ (i52 << 5);
            } else {
                Context baseContext = getBaseContext();
                if (baseContext == null) {
                    Object[] objArr24 = new Object[1];
                    a(new byte[]{0, 1, 0, 1, 0, 0, 1, 1, 1, 1, 1, 1, 1, 0, 1, 0, 0, 1, 1, 0, 1, 0, 1, 0, 0, 1}, true, new int[]{69, 26, 128, 0}, objArr24);
                    Class<?> cls6 = Class.forName((String) objArr24[0]);
                    Object[] objArr25 = new Object[1];
                    a(new byte[]{0, 1, 0, 0, 1, 0, 0, 1, 1, 0, 1, 1, 0, 1, 0, 1, 1, 0}, false, new int[]{95, 18, 77, 11}, objArr25);
                    baseContext = (Context) cls6.getMethod((String) objArr25[0], new Class[0]).invoke(null, null);
                }
                if (baseContext != null) {
                    int i53 = zLjUOn + 73;
                    AuCTelauCTel = i53 % 128;
                    if (i53 % 2 != 0) {
                        boolean z = baseContext instanceof ContextWrapper;
                        obj.hashCode();
                        throw null;
                    }
                    if ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) {
                        int i54 = AuCTelauCTel + 101;
                        zLjUOn = i54 % 128;
                        int i55 = i54 % 2;
                        baseContext = null;
                    } else {
                        baseContext = baseContext.getApplicationContext();
                    }
                }
                Object[] objArr26 = new Object[1];
                a(new byte[]{1, 1, 1, 1, 1, 1, 0, 0, 1, 1, 0, 1, 1, 1, 1, 1}, false, new int[]{37, 16, 81, 11}, objArr26);
                Class<?> cls7 = Class.forName((String) objArr26[0]);
                Object[] objArr27 = new Object[1];
                a(new byte[]{0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 0, 1, 1, 0, 1, 1}, false, new int[]{53, 16, 75, 0}, objArr27);
                int iIntValue2 = ((Integer) cls7.getMethod((String) objArr27[0], Object.class).invoke(null, this)).intValue();
                Object[] objArr28 = new Object[1];
                a(new byte[]{1, 0, 1, 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 1, 0, 0, 1, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 0, 1, 0, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 1, 1, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1, 1, 1, 0, 0, 1, 0, 1, 0, 1, 1, 0}, false, new int[]{WalletImportError.ERROR_CODE_HARDWARE_ACCOUNT_EXIST, 64, 0, 0}, objArr28);
                String[] strArr5 = {(String) objArr28[0]};
                int i56 = zLjUOn + 107;
                AuCTelauCTel = i56 % 128;
                int i57 = i56 % 2;
                Object[] objArr29 = {baseContext, strArr5, Integer.valueOf(iIntValue2), 1, 365941576};
                short s2 = $$d[41];
                Object[] objArr30 = new Object[1];
                c(s2, (byte) (s2 | 125), r4[67], objArr30);
                Class<?> cls8 = Class.forName((String) objArr30[0]);
                short s3 = (short) 123;
                Object[] objArr31 = new Object[1];
                c(s3, (byte) (s3 - 4), r4[91], objArr31);
                Object[] objArr32 = (Object[]) cls8.getMethod((String) objArr31[0], Context.class, String[].class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr29);
                int i58 = ((int[]) objArr32[1])[0];
                int i59 = ((int[]) objArr32[3])[0];
                if (baseContext != null) {
                    Object objEZpvd7 = YY.EZpvd(2079129037);
                    if (objEZpvd7 == null) {
                        byte b6 = (byte) ($$b & 31);
                        byte b7 = $$a[33];
                        Object[] objArr33 = new Object[1];
                        b(b6, b7, (byte) (b7 - 4), objArr33);
                        objEZpvd7 = YY.EZpvd(129, 4, (char) 39078, 2144088241, false, (String) objArr33[0], null);
                    }
                    ((Field) objEZpvd7).set(null, objArr32);
                    try {
                        Object[] objArr34 = new Object[1];
                        a(new byte[]{1, 1, 0, 0, 1, 0, 1, 0, 1, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0}, false, new int[]{0, 22, 0, 0}, objArr34);
                        Class<?> cls9 = Class.forName((String) objArr34[0]);
                        Object[] objArr35 = new Object[1];
                        a(new byte[]{1, 1, 1, 1, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 0}, false, new int[]{22, 15, 0, 0}, objArr35);
                        Long lValueOf2 = Long.valueOf(((Long) cls9.getDeclaredMethod((String) objArr35[0], new Class[0]).invoke(null, new Object[0])).longValue());
                        Object objEZpvd8 = YY.EZpvd(862119861);
                        if (objEZpvd8 == null) {
                            byte[] bArr = $$a;
                            byte b8 = (byte) (-bArr[43]);
                            byte b9 = bArr[18];
                            Object[] objArr36 = new Object[1];
                            b(b8, (byte) (b8 - 5), b9, objArr36);
                            objEZpvd8 = YY.EZpvd(129, 4, (char) 39078, 927083209, false, (String) objArr36[0], null);
                        }
                        ((Field) objEZpvd8).set(null, lValueOf2);
                    } catch (Exception unused2) {
                        throw new RuntimeException();
                    }
                }
                objArr2 = objArr32;
            }
        }
        int i60 = ((int[]) objArr2[1])[0];
        int i61 = ((int[]) objArr2[3])[0];
        if (i61 == i60) {
            objArr3 = new Object[]{new int[1], new int[]{i}, strArr, new int[]{i}};
            int i62 = ((int[]) objArr2[0])[0];
            int i63 = ((int[]) objArr2[3])[0];
            int i64 = ((int[]) objArr2[1])[0];
            String[] strArr6 = (String[]) objArr2[2];
            int iIdentityHashCode2 = System.identityHashCode(this);
            int i65 = i62 + 2061513595 + (((~((-1294179309) | iIdentityHashCode2)) | 134420556) * 576) + (((~((~iIdentityHashCode2) | (-1159758753))) | 584582147) * 576) + 116828928;
            int i66 = (i65 << 13) ^ i65;
            int i67 = i66 ^ (i66 >>> 17);
            ((int[]) objArr3[0])[0] = i67 ^ (i67 << 5);
        } else {
            ArrayList arrayList2 = new ArrayList();
            String[] strArr7 = (String[]) objArr2[2];
            if (strArr7 != null) {
                for (String str2 : strArr7) {
                    arrayList2.add(str2);
                }
            }
            int[] iArr3 = new int[i61];
            int i68 = i61 - 1;
            iArr3[i68] = 1;
            Toast.makeText((Context) null, iArr3[((i61 * i68) % 2) - 1], 1).show();
            objArr3 = new Object[]{new int[1], new int[]{i}, strArr, new int[]{i}};
            int i69 = ((int[]) objArr2[0])[0];
            int i70 = ((int[]) objArr2[3])[0];
            int i71 = ((int[]) objArr2[1])[0];
            String[] strArr8 = (String[]) objArr2[2];
            int mode = ((AudioManager) ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getSystemService(MimeTypes.BASE_TYPE_AUDIO)).getMode();
            int i72 = i69 + (-71202069) + (((~((-623931699) | mode)) | 16640) * 1504) + ((~(mode | (-623915059))) * (-1504)) + 2059357520;
            int i73 = (i72 << 13) ^ i72;
            int i74 = i73 ^ (i73 >>> 17);
            ((int[]) objArr3[0])[0] = i74 ^ (i74 << 5);
        }
        EZpvd(C10749buN.EZpvd(), 548335275, C10749buN.EZpvd(), -548335273, new Object[]{this, getIntent(), this.AkhnZx}, C10749buN.EZpvd(), C17477fGu.AEQbTJ());
        int i75 = ((int[]) objArr3[0])[0];
        int i76 = i75 * i75;
        int i77 = -(1188435416 * i75);
        int i78 = (i76 & i77) + (i76 | i77);
        int i79 = -(i75 * 1605387712);
        int i80 = (i78 & i79) + (i79 | i78);
        int i81 = ((i80 | 1224301200) << 1) - (1224301200 ^ i80);
        int i82 = i81 >> 15;
        int i83 = ((i82 ^ (-262143)) + ((i82 & (-262143)) << 1)) / 131072;
        int i84 = ((i81 >> 22) - 2047) / 1024;
        int i85 = (-(((i81 - (~((i83 ^ 1) + ((i83 & 1) << 1)))) - 1) ^ ((i84 ^ 1) + ((i84 & 1) << 1)))) + 6;
        int i86 = i85 >> 26;
        int i87 = ((((i86 | (-127)) << 1) - (i86 ^ (-127))) / 64) + 1;
        copydefault((boolean) (0 / ((i85 & (-(((i87 | 1) << 1) - (i87 ^ 1)))) * 1035)));
        getOnBackPressedDispatcher().addCallback(new StateListAnimator());
        LifecycleOwnerKt.getLifecycleScope(this).launchWhenStarted(new AnonymousClass6(null));
        ((C33269mtK) EZpvd(C10749buN.EZpvd(), 1595173864, C17477fGu.AEQbTJ(), -1595173861, new Object[]{this}, C17477fGu.AEQbTJ(), C17477fGu.AEQbTJ())).copydefault(LifecycleOwnerKt.getLifecycleScope(this));
        C33512mxp.AEQbTJ.KWHzl(this.hDKMBd);
        RxBus.KWHzl("event_home_page_created");
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [664=4] */
    @Override // o.AbstractActivityC33268mtJ, o.AbstractActivityC33008moO, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        int i = 2 % 2;
        int i2 = zLjUOn + 115;
        AuCTelauCTel = i2 % 128;
        try {
        } catch (Exception e) {
            C6777aVl.Companion.EZpvd(e);
        }
        if (i2 % 2 != 0) {
            super.onStart();
            throw null;
        }
        super.onStart();
        int i3 = zLjUOn + 45;
        AuCTelauCTel = i3 % 128;
        int i4 = i3 % 2;
        C32805mkX.EZpvd.OLrzqt(this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractActivityC33041mov, androidx.activity.ComponentActivity, android.app.Activity
    public void onNewIntent(@NotNull Intent intent) {
        int i = 2 % 2;
        int i2 = AuCTelauCTel + 59;
        zLjUOn = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(intent, "");
        super.onNewIntent(intent);
        handleIntentControl$default(this, intent, null, 2, null);
        int i4 = zLjUOn + 35;
        AuCTelauCTel = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(@NotNull Bundle bundle) {
        int i = 2 % 2;
        int i2 = AuCTelauCTel + 33;
        zLjUOn = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(bundle, "");
        bundle.putString("current_tab", this.AkhnZx);
        bundle.putString("current_tab_tag", this.gEmmrt);
        bundle.putString("current_navigation_target", this.valueOf);
        super.onSaveInstanceState(bundle);
        int i4 = AuCTelauCTel + 97;
        zLjUOn = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractActivityC33268mtJ, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        int i = 2 % 2;
        int i2 = zLjUOn + 69;
        AuCTelauCTel = i2 % 128;
        if (i2 % 2 == 0) {
            this.getFieldNames.EZpvd(values());
            super.onDestroy();
            C33512mxp.AEQbTJ.AEQbTJ(this.hDKMBd);
            this.getFieldNames.AEQbTJ();
            return;
        }
        this.getFieldNames.EZpvd(values());
        super.onDestroy();
        C33512mxp.AEQbTJ.AEQbTJ(this.hDKMBd);
        this.getFieldNames.AEQbTJ();
        throw null;
    }

    /* JADX DEBUG: Possible override for method o.mtJ.OLrzqt()V */
    @Override // o.InterfaceC33215msJ
    public Lifecycle OLrzqt() {
        int i = 2 % 2;
        int i2 = AuCTelauCTel + 69;
        zLjUOn = i2 % 128;
        int i3 = i2 % 2;
        Lifecycle lifecycle = getLifecycle();
        Intrinsics.checkNotNullExpressionValue(lifecycle, "");
        int i4 = AuCTelauCTel + 81;
        zLjUOn = i4 % 128;
        int i5 = i4 % 2;
        return lifecycle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [1095=4, 711=4, 702=6] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d0  */
    @Override // o.InterfaceC33215msJ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean EZpvd(String str, boolean z) {
        Object next;
        int i = 2 % 2;
        pUU.KWHzl(getTAG(), "refreshAllTabs: pageId=" + str + ", forceRefresh=" + z + ", currentPageId=" + this.AkhnZx);
        if (this.ejfBZ == null) {
            int i2 = AuCTelauCTel + 93;
            zLjUOn = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        EZpvd(C10749buN.EZpvd(), 1486116115, C10749buN.EZpvd(), -1486116115, new Object[]{this}, C10749buN.EZpvd(), C10749buN.EZpvd());
        Object obj = null;
        if (!z) {
            int i4 = AuCTelauCTel + 85;
            zLjUOn = i4 % 128;
            if (i4 % 2 == 0) {
                AuCTel();
                obj.hashCode();
                throw null;
            }
            if (!AuCTel()) {
                return false;
            }
        }
        AhwBna();
        if (str == null && (str = this.AkhnZx) == null) {
            int i5 = AuCTelauCTel + 41;
            zLjUOn = i5 % 128;
            if (i5 % 2 == 0) {
                this.fARcdN.iterator();
                obj.hashCode();
                throw null;
            }
            Iterator<T> it = this.fARcdN.iterator();
            int i6 = AuCTelauCTel + 13;
            zLjUOn = i6 % 128;
            int i7 = i6 % 2;
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (Intrinsics.EZpvd((Object) ((InterfaceC33338mua) next).AEQbTJ(), (Object) this.valueOf)) {
                    break;
                }
            }
            InterfaceC33338mua interfaceC33338mua = (InterfaceC33338mua) next;
            if (interfaceC33338mua != null) {
                int i8 = zLjUOn + 19;
                AuCTelauCTel = i8 % 128;
                if (i8 % 2 != 0) {
                    interfaceC33338mua.OLrzqt();
                    obj.hashCode();
                    throw null;
                }
                str = interfaceC33338mua.OLrzqt();
                if (str == null) {
                    str = "LiteHomePageId";
                }
            }
        }
        ((Boolean) EZpvd(C10749buN.EZpvd(), 2016856839, C10749buN.EZpvd(), -2016856838, new Object[]{this, str, true}, C10749buN.EZpvd(), C10749buN.EZpvd())).booleanValue();
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Possible override for method o.mtJ.KWHzl()V */
    @Override // o.InterfaceC33215msJ
    public BottomNavigationView KWHzl() {
        C55089xdP c55089xdP;
        int i = 2 % 2;
        int i2 = AuCTelauCTel;
        int i3 = i2 + 23;
        zLjUOn = i3 % 128;
        if (i3 % 2 == 0) {
            c55089xdP = this.ejfBZ;
            int i4 = 98 / 0;
            if (c55089xdP == null) {
                return null;
            }
        } else {
            c55089xdP = this.ejfBZ;
            if (c55089xdP == null) {
                return null;
            }
        }
        if (c55089xdP != null) {
            return c55089xdP;
        }
        int i5 = i2 + 99;
        zLjUOn = i5 % 128;
        int i6 = i5 % 2;
        Intrinsics.gEmmrt("");
        if (i6 != 0) {
            return null;
        }
        int i7 = 20 / 0;
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [751=4] */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        int i3 = 2 % 2;
        int i4 = AuCTelauCTel + 69;
        zLjUOn = i4 % 128;
        int i5 = i4 % 2;
        super.onActivityResult(i, i2, intent);
        List listKWHzl = C43251rlk.KWHzl(C56524yIo.AEQbTJ(InterfaceC33209msD.class));
        if (listKWHzl != null) {
            int i6 = zLjUOn + 117;
            AuCTelauCTel = i6 % 128;
            if (i6 % 2 != 0) {
                throw null;
            }
            InterfaceC33209msD interfaceC33209msD = (InterfaceC33209msD) CollectionsKt___CollectionsKt.firstOrNull(listKWHzl);
            if (interfaceC33209msD != null) {
                interfaceC33209msD.onActivityResult(i, i2, intent);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private final boolean hDKMBd() {
        long jLongValue;
        int i = 2 % 2;
        if (this.DbNXlk == null) {
            this.DbNXlk = Long.valueOf(System.currentTimeMillis());
            C55326xho.toast$default(C33070mpX.AYXKKw(C33238msg.Application.OLrzqt), (Drawable) null, 0, (Integer) null, 0, 0, 31, (Object) null);
            return false;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        Long l = this.DbNXlk;
        if (l != null) {
            int i2 = zLjUOn + 59;
            AuCTelauCTel = i2 % 128;
            if (i2 % 2 != 0) {
                jLongValue = l.longValue();
                int i3 = 75 / 0;
            } else {
                jLongValue = l.longValue();
            }
        } else {
            jLongValue = 0;
        }
        if (jCurrentTimeMillis - jLongValue >= 3000) {
            C55326xho.toast$default(C33070mpX.AYXKKw(C33238msg.Application.OLrzqt), (Drawable) null, 0, (Integer) null, 0, 0, 31, (Object) null);
            this.DbNXlk = Long.valueOf(System.currentTimeMillis());
            return false;
        }
        int i4 = zLjUOn + 101;
        int i5 = i4 % 128;
        AuCTelauCTel = i5;
        int i6 = i4 % 2;
        int i7 = i5 + 51;
        zLjUOn = i7 % 128;
        int i8 = i7 % 2;
        return true;
    }

    public static /* synthetic */ boolean tryJumpToTargetTab$default(OKLiteMainContainerActivity oKLiteMainContainerActivity, Intent intent, String str, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = AuCTelauCTel + 97;
        int i4 = i3 % 128;
        zLjUOn = i4;
        if (i3 % 2 != 0 ? (i & 2) != 0 : (i & 4) != 0) {
            int i5 = i4 + 17;
            AuCTelauCTel = i5 % 128;
            int i6 = i5 % 2;
            str = null;
        }
        boolean zCopydefault = oKLiteMainContainerActivity.copydefault(intent, str);
        int i7 = AuCTelauCTel + 63;
        zLjUOn = i7 % 128;
        int i8 = i7 % 2;
        return zCopydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0062 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean copydefault(Intent intent, String str) {
        String strOLrzqt;
        Object next;
        Iterator<T> it;
        Object next2;
        InterfaceC33338mua interfaceC33338mua;
        int i = 2 % 2;
        int i2 = AuCTelauCTel + 77;
        zLjUOn = i2 % 128;
        int i3 = i2 % 2;
        List<InterfaceC33338mua> list = this.fARcdN;
        if ((list instanceof Collection) && list.isEmpty()) {
            it = this.fARcdN.iterator();
            while (true) {
                if (it.hasNext()) {
                }
            }
            interfaceC33338mua = (InterfaceC33338mua) next2;
            if (interfaceC33338mua == null) {
            }
        } else {
            Iterator<T> it2 = list.iterator();
            while (it2.hasNext()) {
                int i4 = AuCTelauCTel + 123;
                zLjUOn = i4 % 128;
                int i5 = i4 % 2;
                if (Intrinsics.EZpvd((Object) ((InterfaceC33338mua) it2.next()).OLrzqt(), (Object) str)) {
                    int i6 = zLjUOn + 73;
                    AuCTelauCTel = i6 % 128;
                    int i7 = i6 % 2;
                    strOLrzqt = str;
                    break;
                }
            }
            it = this.fARcdN.iterator();
            while (true) {
                if (it.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it.next();
                if (((InterfaceC33338mua) next2).KWHzl(intent)) {
                    break;
                }
            }
            interfaceC33338mua = (InterfaceC33338mua) next2;
            if (interfaceC33338mua == null) {
                int i8 = AuCTelauCTel + 19;
                zLjUOn = i8 % 128;
                if (i8 % 2 == 0) {
                    interfaceC33338mua.OLrzqt();
                    strOLrzqt.hashCode();
                    throw null;
                }
                strOLrzqt = interfaceC33338mua.OLrzqt();
            } else {
                strOLrzqt = null;
            }
        }
        if (strOLrzqt == null) {
            int i9 = zLjUOn + 17;
            AuCTelauCTel = i9 % 128;
            if (i9 % 2 != 0) {
                throw null;
            }
            strOLrzqt = "LiteHomePageId";
        }
        Iterator<T> it3 = this.fARcdN.iterator();
        while (true) {
            if (!it3.hasNext()) {
                next = null;
                break;
            }
            next = it3.next();
            if (Intrinsics.EZpvd((Object) ((InterfaceC33338mua) next).AEQbTJ(), (Object) this.valueOf)) {
                break;
            }
        }
        InterfaceC33338mua interfaceC33338mua2 = (InterfaceC33338mua) next;
        strOLrzqt = interfaceC33338mua2 != null ? interfaceC33338mua2.OLrzqt() : null;
        pUU.KWHzl(getTAG(), "tryJumpToTargetTab: " + strOLrzqt + " -> " + strOLrzqt);
        boolean z = false;
        if (Intrinsics.EZpvd((Object) strOLrzqt, (Object) strOLrzqt)) {
            int i10 = AuCTelauCTel + 17;
            zLjUOn = i10 % 128;
            int i11 = i10 % 2;
            if (str == null) {
                return false;
            }
        }
        if (str != null) {
            int i12 = AuCTelauCTel + 125;
            zLjUOn = i12 % 128;
            if (i12 % 2 != 0) {
                z = true;
            }
        }
        boolean zBooleanValue = ((Boolean) EZpvd(C10749buN.EZpvd(), 2016856839, C10749buN.EZpvd(), -2016856838, new Object[]{this, strOLrzqt, Boolean.valueOf(z)}, C10749buN.EZpvd(), C10749buN.EZpvd())).booleanValue();
        if (!zBooleanValue) {
            pUU.EZpvd("Failed tryJumpToTargetTab failed, pageId=" + strOLrzqt);
        }
        return zBooleanValue;
    }

    public final void getNewProxyInstance() {
        int i = 2 % 2;
        int i2 = AuCTelauCTel + 35;
        zLjUOn = i2 % 128;
        if (i2 % 2 == 0) {
            isConnected();
            throw null;
        }
        if (isConnected()) {
            getContentView(this).setVisibility(4);
            InterfaceC33171mrS.Activity.showAnim$default((InterfaceC33171mrS) C43251rlk.copydefault(InterfaceC33171mrS.class), this, 2, null, null, new Function1() { // from class: o.mtN
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return OKLiteMainContainerActivity.AEQbTJ(this.copydefault, ((java.lang.Integer) obj).intValue());
                }
            }, 12, null);
        }
        int i3 = zLjUOn + 89;
        AuCTelauCTel = i3 % 128;
        int i4 = i3 % 2;
    }

    public static final Unit copydefault(OKLiteMainContainerActivity oKLiteMainContainerActivity, int i) {
        int i2 = 2 % 2;
        int i3 = zLjUOn + 99;
        AuCTelauCTel = i3 % 128;
        int i4 = i3 % 2;
        if (i == 1) {
            oKLiteMainContainerActivity.getContentView(oKLiteMainContainerActivity).setVisibility(0);
            oKLiteMainContainerActivity.fJNWhG = true;
            int i5 = zLjUOn + 73;
            AuCTelauCTel = i5 % 128;
            int i6 = i5 % 2;
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [835=4, 829=4] */
    public final void fetchVPNInfo() {
        int i = 2 % 2;
        int i2 = AuCTelauCTel + 63;
        zLjUOn = i2 % 128;
        if (i2 % 2 == 0) {
            isConnected();
            throw null;
        }
        if (isConnected()) {
            this.isConnected.EZpvd(TooltipKt.TooltipDuration);
        }
        List listKWHzl = C43251rlk.KWHzl(C56524yIo.AEQbTJ(InterfaceC33209msD.class));
        if (listKWHzl != null) {
            int i3 = zLjUOn + 103;
            AuCTelauCTel = i3 % 128;
            if (i3 % 2 != 0) {
                throw null;
            }
            InterfaceC33209msD interfaceC33209msD = (InterfaceC33209msD) CollectionsKt___CollectionsKt.firstOrNull(listKWHzl);
            if (interfaceC33209msD != null) {
                androidx.fragment.app.FragmentManager supportFragmentManager = getSupportFragmentManager();
                Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
                InterfaceC46518tXh updateManageableContainer = interfaceC33209msD.getUpdateManageableContainer(this, supportFragmentManager, true);
                if (updateManageableContainer != null) {
                    int i4 = zLjUOn + 9;
                    AuCTelauCTel = i4 % 128;
                    if (i4 % 2 == 0) {
                        this.isConnected.AEQbTJ(updateManageableContainer);
                    } else {
                        this.isConnected.AEQbTJ(updateManageableContainer);
                        throw null;
                    }
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void AhwBna() {
        C55089xdP c55089xdP;
        int i = 2 % 2;
        int i2 = zLjUOn + 75;
        AuCTelauCTel = i2 % 128;
        C55089xdP c55089xdP2 = null;
        if (i2 % 2 != 0) {
            c55089xdP = this.ejfBZ;
            int i3 = 56 / 0;
            if (c55089xdP == null) {
                Intrinsics.gEmmrt("");
                c55089xdP = null;
            }
        } else {
            c55089xdP = this.ejfBZ;
            if (c55089xdP == null) {
            }
        }
        c55089xdP.getMenu().clear();
        this.fIwbmz.AEQbTJ();
        this.values.clear();
        int i4 = AuCTelauCTel + 47;
        zLjUOn = i4 % 128;
        int i5 = i4 % 2;
        for (InterfaceC33338mua interfaceC33338mua : this.fARcdN) {
            C55089xdP c55089xdP3 = this.ejfBZ;
            if (c55089xdP3 == null) {
                Intrinsics.gEmmrt("");
                c55089xdP3 = null;
            }
            MenuItem menuItemKWHzl = interfaceC33338mua.KWHzl(c55089xdP3);
            if (menuItemKWHzl != null) {
                int i6 = AuCTelauCTel + 57;
                zLjUOn = i6 % 128;
                int i7 = i6 % 2;
                this.fIwbmz.EZpvd(menuItemKWHzl.getItemId(), interfaceC33338mua);
                this.values.put(Integer.valueOf(interfaceC33338mua.KWHzl()), interfaceC33338mua);
            }
        }
        for (InterfaceC33338mua interfaceC33338mua2 : this.fARcdN) {
            int i8 = AuCTelauCTel + 71;
            zLjUOn = i8 % 128;
            int i9 = i8 % 2;
            C55089xdP c55089xdP4 = this.ejfBZ;
            if (c55089xdP4 == null) {
                Intrinsics.gEmmrt("");
                c55089xdP4 = null;
            }
            interfaceC33338mua2.AEQbTJ(c55089xdP4);
            int i10 = zLjUOn + 27;
            AuCTelauCTel = i10 % 128;
            int i11 = i10 % 2;
        }
        C55089xdP c55089xdP5 = this.ejfBZ;
        if (c55089xdP5 == null) {
            Intrinsics.gEmmrt("");
        } else {
            c55089xdP2 = c55089xdP5;
        }
        c55089xdP2.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() { // from class: o.mtR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // com.google.android.material.navigation.NavigationBarView.OnItemSelectedListener
            public final boolean onNavigationItemSelected(android.view.MenuItem menuItem) {
                return OKLiteMainContainerActivity.EZpvd(this.EZpvd, menuItem);
            }
        });
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final boolean OLrzqt(OKLiteMainContainerActivity oKLiteMainContainerActivity, MenuItem menuItem) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(menuItem, "");
        InterfaceC33338mua interfaceC33338muaAEQbTJ = oKLiteMainContainerActivity.AEQbTJ(menuItem.getItemId());
        if (interfaceC33338muaAEQbTJ == null) {
            int i2 = zLjUOn + 101;
            AuCTelauCTel = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        if (!interfaceC33338muaAEQbTJ.AhwBna()) {
            int i4 = AuCTelauCTel + 25;
            zLjUOn = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        oKLiteMainContainerActivity.AEQbTJ(interfaceC33338muaAEQbTJ);
        int i6 = zLjUOn + 89;
        AuCTelauCTel = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 64 / 0;
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: Removed duplicated region for block: B:41:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0166  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean AEQbTJ(InterfaceC33338mua interfaceC33338mua) {
        String strAEQbTJ;
        int i;
        FragmentContainerView fragmentContainerView;
        int i2 = 2 % 2;
        if (Intrinsics.EZpvd((Object) this.valueOf, (Object) interfaceC33338mua.AEQbTJ())) {
            return false;
        }
        Iterator<InterfaceC33212msG> it = this.getNewProxyInstance.iterator();
        while (it.hasNext()) {
            it.next().OLrzqt(this.valueOf, interfaceC33338mua.AEQbTJ());
        }
        String strCopydefault = interfaceC33338mua.copydefault();
        if (strCopydefault == null || (strAEQbTJ = interfaceC33338mua.AEQbTJ()) == null) {
            return false;
        }
        Fragment fragmentFindFragmentByTag = getSupportFragmentManager().findFragmentByTag(strCopydefault);
        FragmentContainerView fragmentContainerView2 = null;
        if (fragmentFindFragmentByTag == null) {
            int i3 = AuCTelauCTel + 33;
            zLjUOn = i3 % 128;
            if (i3 % 2 == 0) {
                interfaceC33338mua.copydefault(getIntent());
                fragmentContainerView2.hashCode();
                throw null;
            }
            fragmentFindFragmentByTag = interfaceC33338mua.copydefault(getIntent());
            if (fragmentFindFragmentByTag == null) {
                int i4 = zLjUOn + 11;
                AuCTelauCTel = i4 % 128;
                int i5 = i4 % 2;
                return false;
            }
        }
        Fragment fragmentFindFragmentByTag2 = getSupportFragmentManager().findFragmentByTag(this.gEmmrt);
        if (Intrinsics.EZpvd(fragmentFindFragmentByTag, fragmentFindFragmentByTag2)) {
            return false;
        }
        FragmentTransaction fragmentTransactionBeginTransaction = getSupportFragmentManager().beginTransaction();
        Intrinsics.checkNotNullExpressionValue(fragmentTransactionBeginTransaction, "");
        if (fragmentFindFragmentByTag2 != null) {
            int i6 = zLjUOn + 71;
            AuCTelauCTel = i6 % 128;
            if (i6 % 2 != 0) {
                fragmentTransactionBeginTransaction.hide(fragmentFindFragmentByTag2);
                fragmentFindFragmentByTag2.isAdded();
                throw null;
            }
            fragmentTransactionBeginTransaction.hide(fragmentFindFragmentByTag2);
            if (fragmentFindFragmentByTag2.isAdded()) {
                fragmentTransactionBeginTransaction.setMaxLifecycle(fragmentFindFragmentByTag2, Lifecycle.State.STARTED);
                pUU.KWHzl(getTAG(), "hide fragment: " + fragmentFindFragmentByTag2.getTag());
                if (fragmentFindFragmentByTag.isAdded()) {
                    fragmentTransactionBeginTransaction.add(C33160mrH.StateListAnimator.DbNXlk, fragmentFindFragmentByTag, strCopydefault);
                    pUU.KWHzl(getTAG(), "add fragment: " + strCopydefault);
                } else {
                    fragmentTransactionBeginTransaction.show(fragmentFindFragmentByTag).setMaxLifecycle(fragmentFindFragmentByTag, Lifecycle.State.RESUMED);
                    pUU.KWHzl(getTAG(), "show fragment: " + strCopydefault);
                }
                fragmentTransactionBeginTransaction.commitAllowingStateLoss();
                this.gEmmrt = strCopydefault;
                String str = this.AkhnZx;
                this.AkhnZx = interfaceC33338mua.OLrzqt();
                this.valueOf = strAEQbTJ;
                KWHzl(str);
                fragmentContainerView = this.fetchVPNInfo;
                if (fragmentContainerView != null) {
                    Intrinsics.gEmmrt("");
                } else {
                    fragmentContainerView2 = fragmentContainerView;
                }
                fragmentContainerView2.post(new Runnable() { // from class: o.mtQ
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // java.lang.Runnable
                    public final void run() {
                        OKLiteMainContainerActivity.OLrzqt(this.OLrzqt);
                    }
                });
                return true;
            }
            pUU.valueOf(getTAG(), "hide fragment: " + fragmentFindFragmentByTag2.getTag() + ": not attach");
            i = AuCTelauCTel + 79;
            zLjUOn = i % 128;
        } else {
            pUU.valueOf(getTAG(), "hide fragment: currentFragment is null");
            i = zLjUOn + 125;
            AuCTelauCTel = i % 128;
        }
        int i7 = i % 2;
        if (fragmentFindFragmentByTag.isAdded()) {
        }
        fragmentTransactionBeginTransaction.commitAllowingStateLoss();
        this.gEmmrt = strCopydefault;
        String str2 = this.AkhnZx;
        this.AkhnZx = interfaceC33338mua.OLrzqt();
        this.valueOf = strAEQbTJ;
        KWHzl(str2);
        fragmentContainerView = this.fetchVPNInfo;
        if (fragmentContainerView != null) {
        }
        fragmentContainerView2.post(new Runnable() { // from class: o.mtQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                OKLiteMainContainerActivity.OLrzqt(this.OLrzqt);
            }
        });
        return true;
    }

    public static final void AEQbTJ(OKLiteMainContainerActivity oKLiteMainContainerActivity) {
        int i = 2 % 2;
        int i2 = zLjUOn + 59;
        AuCTelauCTel = i2 % 128;
        rVN.reportFullyDrawn$default((android.app.Activity) oKLiteMainContainerActivity, true, (String) null, i2 % 2 != 0 ? 3 : 2, (Object) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InterfaceC33338mua AEQbTJ(@IdRes int i) {
        HashMap<Integer, InterfaceC33338mua> map;
        int i2;
        int i3 = 2 % 2;
        InterfaceC33338mua interfaceC33338muaOLrzqt = this.fIwbmz.OLrzqt(i);
        if (interfaceC33338muaOLrzqt == null) {
            int i4 = zLjUOn + 89;
            AuCTelauCTel = i4 % 128;
            if (i4 % 2 != 0) {
                map = this.values;
                i2 = 0;
            } else {
                map = this.values;
                i2 = 0;
            }
            interfaceC33338muaOLrzqt = map.get(i2);
        }
        int i5 = zLjUOn + 77;
        AuCTelauCTel = i5 % 128;
        if (i5 % 2 == 0) {
            return interfaceC33338muaOLrzqt;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ boolean trySetSelectedMenuItem$default(OKLiteMainContainerActivity oKLiteMainContainerActivity, String str, boolean z, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = zLjUOn + 17;
        int i4 = i3 % 128;
        AuCTelauCTel = i4;
        if (i3 % 2 == 0 ? (i & 2) != 0 : (i & 4) != 0) {
            int i5 = i4 + 23;
            zLjUOn = i5 % 128;
            int i6 = i5 % 2;
            z = false;
        }
        Object[] objArr = {oKLiteMainContainerActivity, str, Boolean.valueOf(z)};
        int iEZpvd = C10749buN.EZpvd();
        return ((Boolean) EZpvd(C10749buN.EZpvd(), 2016856839, iEZpvd, -2016856838, objArr, C10749buN.EZpvd(), C10749buN.EZpvd())).booleanValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [929=5] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x008a A[PHI: r10
  0x008a: PHI (r10v11 o.xdP) = (r10v9 o.xdP), (r10v12 o.xdP) binds: [B:17:0x0084, B:14:0x007f] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object EZpvd(Object[] objArr) {
        Integer numEZpvd;
        C55089xdP c55089xdP;
        final OKLiteMainContainerActivity oKLiteMainContainerActivity = (OKLiteMainContainerActivity) objArr[0];
        String str = (String) objArr[1];
        boolean zBooleanValue = ((Boolean) objArr[2]).booleanValue();
        int i = 2 % 2;
        pUU.KWHzl(oKLiteMainContainerActivity.getTAG(), "trySetSelectedMenuItem: pageId=" + str + ", refresh=" + zBooleanValue);
        final InterfaceC33338mua interfaceC33338mua = oKLiteMainContainerActivity.values().get(str);
        if (interfaceC33338mua == null || (numEZpvd = oKLiteMainContainerActivity.fIwbmz.EZpvd(interfaceC33338mua)) == null) {
            return false;
        }
        int i2 = AuCTelauCTel + 53;
        zLjUOn = i2 % 128;
        int i3 = i2 % 2;
        final int iIntValue = numEZpvd.intValue();
        C55089xdP c55089xdP2 = oKLiteMainContainerActivity.ejfBZ;
        C55089xdP c55089xdP3 = null;
        if (c55089xdP2 == null) {
            Intrinsics.gEmmrt("");
            int i4 = AuCTelauCTel + 77;
            zLjUOn = i4 % 128;
            int i5 = i4 % 2;
            c55089xdP2 = null;
        }
        c55089xdP2.setSelectedItemId(iIntValue);
        if (zBooleanValue) {
            int i6 = zLjUOn + 57;
            AuCTelauCTel = i6 % 128;
            if (i6 % 2 != 0) {
                c55089xdP = oKLiteMainContainerActivity.ejfBZ;
                int i7 = 9 / 0;
                if (c55089xdP == null) {
                    Intrinsics.gEmmrt("");
                } else {
                    c55089xdP3 = c55089xdP;
                }
            } else {
                c55089xdP = oKLiteMainContainerActivity.ejfBZ;
                if (c55089xdP == null) {
                }
            }
            c55089xdP3.post(new Runnable() { // from class: o.mtO
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    OKLiteMainContainerActivity.copydefault(this.copydefault, iIntValue, interfaceC33338mua);
                }
            });
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [936=5] */
    public static final void AEQbTJ(OKLiteMainContainerActivity oKLiteMainContainerActivity, int i, InterfaceC33338mua interfaceC33338mua) {
        Drawable icon;
        LottieDrawable lottieDrawable;
        float f;
        int i2 = 2 % 2;
        C55089xdP c55089xdP = oKLiteMainContainerActivity.ejfBZ;
        Object obj = null;
        if (c55089xdP == null) {
            int i3 = zLjUOn + WalletImportError.ERROR_CODE_GET_EOA_ADDRESS_KEY;
            AuCTelauCTel = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.gEmmrt("");
            c55089xdP = null;
        }
        MenuItem menuItemFindItem = c55089xdP.getMenu().findItem(i);
        if (menuItemFindItem != null && (icon = menuItemFindItem.getIcon()) != null && (icon instanceof LottieDrawable)) {
            int i5 = AuCTelauCTel + 61;
            zLjUOn = i5 % 128;
            if (i5 % 2 == 0) {
                lottieDrawable = (LottieDrawable) icon;
                f = 0.0f;
            } else {
                lottieDrawable = (LottieDrawable) icon;
                f = 1.0f;
            }
            lottieDrawable.setProgress(f);
        }
        Set<InterfaceC33212msG> set = oKLiteMainContainerActivity.getNewProxyInstance;
        Intrinsics.checkNotNullExpressionValue(set, "");
        Iterator<T> it = set.iterator();
        while (it.hasNext()) {
            int i6 = zLjUOn + 11;
            AuCTelauCTel = i6 % 128;
            if (i6 % 2 != 0) {
                ((InterfaceC33212msG) it.next()).OLrzqt(null, interfaceC33338mua.AEQbTJ());
                obj.hashCode();
                throw null;
            }
            ((InterfaceC33212msG) it.next()).OLrzqt(null, interfaceC33338mua.AEQbTJ());
            int i7 = AuCTelauCTel + WalletImportError.ERROR_CODE_HARDWARE_ACCOUNT_EXIST;
            zLjUOn = i7 % 128;
            int i8 = i7 % 2;
        }
    }

    public static /* synthetic */ void handleIntentControl$default(OKLiteMainContainerActivity oKLiteMainContainerActivity, Intent intent, String str, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 2) != 0) {
            int i3 = zLjUOn + 69;
            int i4 = i3 % 128;
            AuCTelauCTel = i4;
            int i5 = i3 % 2;
            int i6 = i4 + 1;
            zLjUOn = i6 % 128;
            int i7 = i6 % 2;
            str = null;
        }
        int iEZpvd = C10749buN.EZpvd();
        EZpvd(C10749buN.EZpvd(), 548335275, iEZpvd, -548335273, new Object[]{oKLiteMainContainerActivity, intent, str}, C10749buN.EZpvd(), C17477fGu.AEQbTJ());
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [959=4] */
    private static /* synthetic */ Object AEQbTJ(Object[] objArr) {
        OKLiteMainContainerActivity oKLiteMainContainerActivity = (OKLiteMainContainerActivity) objArr[0];
        Intent intent = (Intent) objArr[1];
        String str = (String) objArr[2];
        int i = 2 % 2;
        pUU.KWHzl(oKLiteMainContainerActivity.getTAG(), "handleIntentControl, targetPageId: " + str);
        Iterator<T> it = oKLiteMainContainerActivity.AYXKKw().iterator();
        int i2 = AuCTelauCTel + 39;
        while (true) {
            zLjUOn = i2 % 128;
            int i3 = i2 % 2;
            if (!it.hasNext()) {
                break;
            }
            ((InterfaceC33338mua) it.next()).AEQbTJ(intent);
            i2 = AuCTelauCTel + 59;
        }
        EZpvd(C10749buN.EZpvd(), 1486116115, C10749buN.EZpvd(), -1486116115, new Object[]{oKLiteMainContainerActivity}, C10749buN.EZpvd(), C10749buN.EZpvd());
        if (!(!oKLiteMainContainerActivity.AuCTel())) {
            oKLiteMainContainerActivity.AhwBna();
        }
        oKLiteMainContainerActivity.copydefault(intent, str);
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static /* synthetic */ Object OLrzqt(Object[] objArr) {
        OKLiteMainContainerActivity oKLiteMainContainerActivity = (OKLiteMainContainerActivity) objArr[0];
        int i = 2 % 2;
        int i2 = zLjUOn + 71;
        AuCTelauCTel = i2 % 128;
        int i3 = i2 % 2;
        oKLiteMainContainerActivity.fARcdN.clear();
        List<InterfaceC33338mua> list = oKLiteMainContainerActivity.fARcdN;
        int iEZpvd = C10749buN.EZpvd();
        list.addAll((List) EZpvd(C10749buN.EZpvd(), 178187505, iEZpvd, -178187501, new Object[]{oKLiteMainContainerActivity}, C10749buN.EZpvd(), C10749buN.EZpvd()));
        oKLiteMainContainerActivity.fJNWhG();
        int i4 = zLjUOn + 55;
        AuCTelauCTel = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void fJNWhG() {
        int i = 2 % 2;
        List<InterfaceC33338mua> list = this.fARcdN;
        ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(list, 10));
        int i2 = 0;
        for (Object obj : list) {
            int i3 = zLjUOn + 75;
            AuCTelauCTel = i3 % 128;
            int i4 = i3 % 2;
            if (i2 < 0) {
                int i5 = AuCTelauCTel + 35;
                zLjUOn = i5 % 128;
                int i6 = i5 % 2;
                yDY.AYXKKw();
            }
            InterfaceC33338mua interfaceC33338mua = (InterfaceC33338mua) obj;
            arrayList.add("[" + i2 + "] pageId=" + interfaceC33338mua.OLrzqt() + ", pos=" + interfaceC33338mua.KWHzl() + ", enabled=" + interfaceC33338mua.EZpvd() + ", target=" + interfaceC33338mua.AEQbTJ());
            i2++;
        }
        String strJoinToString$default = CollectionsKt___CollectionsKt.joinToString$default(arrayList, "\n", null, null, 0, null, null, 62, null);
        pUU.KWHzl(getTAG(), "Tab Snapshot:\n" + strJoinToString$default);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AuCTel() {
        int i = 2 % 2;
        Collection<InterfaceC33338mua> collectionValues = this.values.values();
        Intrinsics.checkNotNullExpressionValue(collectionValues, "");
        List listEZpvd = CollectionsKt___CollectionsKt.EZpvd(collectionValues, new Application());
        List<InterfaceC33338mua> list = this.fARcdN;
        boolean z = false;
        if (listEZpvd.size() == list.size()) {
            int size = listEZpvd.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    z = true;
                    break;
                }
                int i3 = AuCTelauCTel + 85;
                zLjUOn = i3 % 128;
                Object obj = null;
                if (i3 % 2 == 0) {
                    Intrinsics.EZpvd((Object) ((InterfaceC33338mua) listEZpvd.get(i2)).OLrzqt(), (Object) list.get(i2).OLrzqt());
                    throw null;
                }
                InterfaceC33338mua interfaceC33338mua = (InterfaceC33338mua) listEZpvd.get(i2);
                InterfaceC33338mua interfaceC33338mua2 = list.get(i2);
                if (!Intrinsics.EZpvd((Object) interfaceC33338mua.OLrzqt(), (Object) interfaceC33338mua2.OLrzqt())) {
                    break;
                }
                int i4 = zLjUOn + 37;
                AuCTelauCTel = i4 % 128;
                if (i4 % 2 != 0) {
                    interfaceC33338mua.EZpvd();
                    interfaceC33338mua2.EZpvd();
                    obj.hashCode();
                    throw null;
                }
                if (interfaceC33338mua.EZpvd() != interfaceC33338mua2.EZpvd()) {
                    break;
                }
                i2++;
            }
        }
        return !z;
    }

    public void fIwbmz() {
        int i = 2 % 2;
        int i2 = AuCTelauCTel + 23;
        zLjUOn = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        KWHzl((String) null);
        int i4 = zLjUOn + 107;
        AuCTelauCTel = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(String str) {
        int i = 2 % 2;
        int i2 = zLjUOn + 41;
        AuCTelauCTel = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        String str2 = this.AkhnZx;
        if (str2 != null) {
            this.getFieldNames.OLrzqt(str, str2, values());
        }
        int i3 = AuCTelauCTel + 89;
        zLjUOn = i3 % 128;
        int i4 = i3 % 2;
    }

    @Override // o.AbstractActivityC33041mov
    public void addConfig() {
        int i = 2 % 2;
        int i2 = AuCTelauCTel + 85;
        zLjUOn = i2 % 128;
        if (i2 % 2 == 0) {
            super.addConfig();
            C33494mxX.copydefault.EZpvd(this, C52761wXj.Activity.fAklCm);
            int i3 = 69 / 0;
        } else {
            super.addConfig();
            C33494mxX.copydefault.EZpvd(this, C52761wXj.Activity.fAklCm);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void copydefault(boolean z) {
        int i;
        int i2 = 2 % 2;
        C55089xdP c55089xdP = this.ejfBZ;
        if (c55089xdP == null) {
            int i3 = AuCTelauCTel + 75;
            zLjUOn = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.gEmmrt("");
            c55089xdP = null;
        }
        if (!z) {
            i = 8;
        } else {
            int i5 = zLjUOn;
            int i6 = i5 + 57;
            AuCTelauCTel = i6 % 128;
            int i7 = i6 % 2;
            int i8 = i5 + 17;
            AuCTelauCTel = i8 % 128;
            int i9 = i8 % 2;
            i = 0;
        }
        c55089xdP.setVisibility(i);
    }

    @Override // o.InterfaceC35205nqt
    public boolean AwvSrB() {
        int i = 2 % 2;
        int i2 = AuCTelauCTel + 13;
        int i3 = i2 % 128;
        zLjUOn = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 109;
        AuCTelauCTel = i5 % 128;
        int i6 = i5 % 2;
        return true;
    }

    @Override // o.InterfaceC33215msJ
    public String EZpvd() {
        int i = 2 % 2;
        int i2 = zLjUOn;
        int i3 = i2 + 103;
        AuCTelauCTel = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        String str = this.gEmmrt;
        int i4 = i2 + 43;
        AuCTelauCTel = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    /* JADX DEBUG: Class process forced to load method for inline: com.okinc.business.market.market.fragment.SpotQuoteNewFragment$handleTradeData$lambda$6$$inlined$viewModels$default$14.AEQbTJ$1908f70b(int, int, java.lang.Object, int, boolean):java.lang.Object[] */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    /* JADX WARN: Removed duplicated region for block: B:248:0x1859  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0900  */
    @Override // o.InterfaceC35204nqs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void fARcdN() throws Throwable {
        Object[] objArrAEQbTJ$1908f70b;
        Object[] objArr;
        char c;
        Object[] objArr2;
        char c2;
        int i;
        Object[] objArr3;
        char c3;
        String str;
        int i2;
        Object[] objArr4;
        Object[] objArr5;
        Object[] objArr6;
        Object[] objArr7;
        char c4;
        Object[] objArr8;
        int i3 = 2 % 2;
        Object[] objArr9 = new Object[1];
        a(new byte[]{1, 1, 0, 0, 1, 0, 1, 0, 1, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0}, false, new int[]{0, 22, 0, 0}, objArr9);
        String str2 = (String) objArr9[0];
        Object[] objArr10 = new Object[1];
        a(new byte[]{1, 1, 1, 1, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 0}, false, new int[]{22, 15, 0, 0}, objArr10);
        String str3 = (String) objArr10[0];
        Object[] objArr11 = new Object[1];
        a(new byte[]{1, 1, 1, 1, 1, 1, 0, 0, 1, 1, 0, 1, 1, 1, 1, 1}, false, new int[]{37, 16, 81, 11}, objArr11);
        String str4 = (String) objArr11[0];
        Object[] objArr12 = new Object[1];
        a(new byte[]{0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 0, 1, 1, 0, 1, 1}, false, new int[]{53, 16, 75, 0}, objArr12);
        String str5 = (String) objArr12[0];
        Object objEZpvd = YY.EZpvd(-160594826);
        if (objEZpvd == null) {
            byte b = (byte) ($$b & 31);
            byte b2 = $$a[33];
            Object[] objArr13 = new Object[1];
            b(b, b2, (byte) (b2 - 4), objArr13);
            objEZpvd = YY.EZpvd(250, 5, (char) 0, -229816054, false, (String) objArr13[0], null);
        }
        long j = ((Field) objEZpvd).getLong(null);
        if (j == -1 || j + 1983 < ((Long) Class.forName(str2).getDeclaredMethod(str3, new Class[0]).invoke(null, new Object[0])).longValue()) {
            int iIntValue = ((Integer) Class.forName(str4).getMethod(str5, Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr14 = {-1689528419};
                Object objEZpvd2 = YY.EZpvd(-336872700);
                if (objEZpvd2 == null) {
                    objEZpvd2 = YY.EZpvd(245, 5, (char) 0, -271878536, false, null, new Class[]{Integer.TYPE});
                }
                objArrAEQbTJ$1908f70b = SpotQuoteNewFragment$handleTradeData$lambda$6$$inlined$viewModels$default$14.AEQbTJ$1908f70b(iIntValue, 0, ((Constructor) objEZpvd2).newInstance(objArr14), 1337214121, false);
                Object objEZpvd3 = YY.EZpvd(4139753);
                if (objEZpvd3 == null) {
                    Object[] objArr15 = new Object[1];
                    b((byte) (-$$a[43]), r7[14], r7[33], objArr15);
                    objEZpvd3 = YY.EZpvd(250, 5, (char) 0, 69199765, false, (String) objArr15[0], null);
                }
                ((Field) objEZpvd3).set(null, objArrAEQbTJ$1908f70b);
                try {
                    Long lValueOf = Long.valueOf(((Long) Class.forName(str2).getDeclaredMethod(str3, new Class[0]).invoke(null, new Object[0])).longValue());
                    Object objEZpvd4 = YY.EZpvd(-160594826);
                    if (objEZpvd4 == null) {
                        byte b3 = (byte) ($$b & 31);
                        byte b4 = $$a[33];
                        Object[] objArr16 = new Object[1];
                        b(b3, b4, (byte) (b4 - 4), objArr16);
                        objEZpvd4 = YY.EZpvd(250, 5, (char) 0, -229816054, false, (String) objArr16[0], null);
                    }
                    ((Field) objEZpvd4).set(null, lValueOf);
                } catch (Exception unused) {
                    throw new RuntimeException();
                }
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        } else {
            Object objEZpvd5 = YY.EZpvd(4139753);
            if (objEZpvd5 == null) {
                Object[] objArr17 = new Object[1];
                b((byte) (-$$a[43]), r7[14], r7[33], objArr17);
                objEZpvd5 = YY.EZpvd(250, 5, (char) 0, 69199765, false, (String) objArr17[0], null);
            }
            Object[] objArr18 = (Object[]) ((Field) objEZpvd5).get(null);
            objArrAEQbTJ$1908f70b = new Object[]{new int[]{((int[]) objArr18[0])[0]}, new int[]{((int[]) objArr18[1])[0]}, new int[1], (String[]) objArr18[3]};
            int iMyUid = Process.myUid();
            int i4 = ~iMyUid;
            int i5 = (((~((-1390372905) | i4)) | (~((-423046501) | iMyUid)) | (~(i4 | 423046500))) * 959) + 626477419 + (((~(iMyUid | 423046500)) | (~((-423046501) | i4)) | (~((-1390372905) | iMyUid))) * 959) + 1337214121;
            int i6 = (i5 << 13) ^ i5;
            int i7 = i6 ^ (i6 >>> 17);
            ((int[]) objArrAEQbTJ$1908f70b[2])[0] = i7 ^ (i7 << 5);
        }
        int i8 = ((int[]) objArrAEQbTJ$1908f70b[0])[0];
        int i9 = ((int[]) objArrAEQbTJ$1908f70b[1])[0];
        if (i9 == i8) {
            int i10 = ((int[]) objArrAEQbTJ$1908f70b[2])[0];
            Object[] objArr19 = {new int[]{((int[]) objArrAEQbTJ$1908f70b[0])[0]}, new int[]{((int[]) objArrAEQbTJ$1908f70b[1])[0]}, new int[1], (String[]) objArrAEQbTJ$1908f70b[3]};
            int streamMaxVolume = ((AudioManager) ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getSystemService(MimeTypes.BASE_TYPE_AUDIO)).getStreamMaxVolume(3);
            int i11 = (~((-1197897472) | streamMaxVolume)) | 69211789;
            int i12 = ~((~streamMaxVolume) | 1744207615);
            int i13 = i10 + (-16778134) + ((i11 | i12) * (-470)) + (((~((-1128685683) | streamMaxVolume)) | i12) * 470);
            int i14 = (i13 << 13) ^ i13;
            int i15 = i14 ^ (i14 >>> 17);
            ((int[]) objArr19[2])[0] = i15 ^ (i15 << 5);
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArrAEQbTJ$1908f70b[3];
            if (strArr != null) {
                for (String str6 : strArr) {
                    arrayList.add(str6);
                }
            }
            try {
                Object[] objArr20 = {Long.valueOf((((long) (-322044537)) << 32) ^ ((long) (i8 ^ i9))), Long.valueOf(-322044539)};
                int i16 = $$e;
                Object[] objArr21 = new Object[1];
                c((short) 403, (byte) (i16 | 120), $$d[67], objArr21);
                Class<?> cls = Class.forName((String) objArr21[0]);
                Object[] objArr22 = new Object[1];
                c((short) (i16 | 394), (byte) (i16 | 120), (byte) i16, objArr22);
                cls.getMethod((String) objArr22[0], Long.TYPE, Long.TYPE).invoke(null, objArr20);
                int i17 = ((int[]) objArrAEQbTJ$1908f70b[2])[0];
                Object[] objArr23 = {new int[]{((int[]) objArrAEQbTJ$1908f70b[0])[0]}, new int[]{((int[]) objArrAEQbTJ$1908f70b[1])[0]}, new int[1], (String[]) objArrAEQbTJ$1908f70b[3]};
                int streamVolume = ((AudioManager) ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getSystemService(MimeTypes.BASE_TYPE_AUDIO)).getStreamVolume(3);
                int i18 = i17 + (-255021007) + (((~(streamVolume | 1587140499)) | 226278905) * 191) + (((~((~streamVolume) | 1587140499)) | 23341160) * 191);
                int i19 = (i18 << 13) ^ i18;
                int i20 = i19 ^ (i19 >>> 17);
                ((int[]) objArr23[2])[0] = i20 ^ (i20 << 5);
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 == null) {
                    throw th2;
                }
                throw cause2;
            }
        }
        Object objEZpvd6 = YY.EZpvd(1772514135);
        if (objEZpvd6 == null) {
            Object[] objArr24 = new Object[1];
            b((byte) ($$b & 31), (byte) (-$$a[29]), r3[47], objArr24);
            objEZpvd6 = YY.EZpvd(172, 4, (char) 0, 1837540907, false, (String) objArr24[0], null);
        }
        long j2 = ((Field) objEZpvd6).getLong(null);
        if (j2 == -1 || j2 + 2049 < ((Long) Class.forName(str2).getDeclaredMethod(str3, new Class[0]).invoke(null, new Object[0])).longValue()) {
            Context baseContext = getBaseContext();
            if (baseContext == null) {
                Object[] objArr25 = new Object[1];
                a(new byte[]{0, 1, 0, 1, 0, 0, 1, 1, 1, 1, 1, 1, 1, 0, 1, 0, 0, 1, 1, 0, 1, 0, 1, 0, 0, 1}, true, new int[]{69, 26, 128, 0}, objArr25);
                Class<?> cls2 = Class.forName((String) objArr25[0]);
                Object[] objArr26 = new Object[1];
                a(new byte[]{0, 1, 0, 0, 1, 0, 0, 1, 1, 0, 1, 1, 0, 1, 0, 1, 1, 0}, false, new int[]{95, 18, 77, 11}, objArr26);
                baseContext = (Context) cls2.getMethod((String) objArr26[0], new Class[0]).invoke(null, null);
            }
            if (baseContext != null) {
                if ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) {
                    baseContext = null;
                } else {
                    baseContext = baseContext.getApplicationContext();
                    int i21 = AuCTelauCTel + 73;
                    zLjUOn = i21 % 128;
                    int i22 = i21 % 2;
                }
            }
            try {
                Object[] objArr27 = {baseContext, Integer.valueOf(((Integer) Class.forName(str4).getMethod(str5, Object.class).invoke(null, this)).intValue()), 0, -1304497441};
                Object[] objArr28 = new Object[1];
                c((short) 395, (byte) ($$d[5] - 1), r7[67], objArr28);
                Class<?> cls3 = Class.forName((String) objArr28[0]);
                int i23 = $$e;
                Object[] objArr29 = new Object[1];
                c((short) (i23 | 394), (byte) (i23 | 120), (byte) i23, objArr29);
                objArr = (Object[]) cls3.getMethod((String) objArr29[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr27);
                if (baseContext != null) {
                    Object objEZpvd7 = YY.EZpvd(1361516365);
                    if (objEZpvd7 == null) {
                        Object[] objArr30 = new Object[1];
                        b((byte) (-$$a[43]), r0[14], r0[33], objArr30);
                        objEZpvd7 = YY.EZpvd(172, 4, (char) 0, 1426577969, false, (String) objArr30[0], null);
                    }
                    ((Field) objEZpvd7).set(null, objArr);
                    try {
                        Long lValueOf2 = Long.valueOf(((Long) Class.forName(str2).getDeclaredMethod(str3, new Class[0]).invoke(null, new Object[0])).longValue());
                        Object objEZpvd8 = YY.EZpvd(1772514135);
                        if (objEZpvd8 == null) {
                            Object[] objArr31 = new Object[1];
                            b((byte) ($$b & 31), (byte) (-$$a[29]), r4[47], objArr31);
                            objEZpvd8 = YY.EZpvd(172, 4, (char) 0, 1837540907, false, (String) objArr31[0], null);
                        }
                        ((Field) objEZpvd8).set(null, lValueOf2);
                    } catch (Exception unused2) {
                        throw new RuntimeException();
                    }
                }
                c = 0;
            } catch (Throwable th3) {
                Throwable cause3 = th3.getCause();
                if (cause3 == null) {
                    throw th3;
                }
                throw cause3;
            }
        } else {
            Object objEZpvd9 = YY.EZpvd(1361516365);
            if (objEZpvd9 == null) {
                Object[] objArr32 = new Object[1];
                b((byte) (-$$a[43]), r0[14], r0[33], objArr32);
                objEZpvd9 = YY.EZpvd(172, 4, (char) 0, 1426577969, false, (String) objArr32[0], null);
            }
            Object[] objArr33 = (Object[]) ((Field) objEZpvd9).get(null);
            objArr = new Object[]{new int[]{i}, str, new int[1], new int[]{i}};
            int i24 = ((int[]) objArr33[3])[0];
            int i25 = ((int[]) objArr33[0])[0];
            String str7 = (String) objArr33[1];
            int iIdentityHashCode = System.identityHashCode(this);
            int i26 = ((((-309298481) + (((~(954373570 | iIdentityHashCode)) | 6292610) * (-502))) + ((~((~iIdentityHashCode) | 1071904734)) * (-502))) + (((~(iIdentityHashCode | (-1065612125))) | 954373570) * 502)) - 1304497441;
            int i27 = (i26 << 13) ^ i26;
            int i28 = i27 ^ (i27 >>> 17);
            ((int[]) objArr[2])[0] = i28 ^ (i28 << 5);
            c = 0;
        }
        int i29 = ((int[]) objArr[c])[c];
        int i30 = ((int[]) objArr[3])[c];
        if (i30 == i29) {
            Object[] objArr34 = new Object[4];
            int[] iArr = new int[1];
            objArr34[c] = iArr;
            objArr34[2] = new int[1];
            int[] iArr2 = new int[1];
            objArr34[3] = iArr2;
            int i31 = ((int[]) objArr[2])[c];
            int i32 = ((int[]) objArr[3])[c];
            int i33 = ((int[]) objArr[c])[c];
            String str8 = (String) objArr[1];
            iArr2[c] = i32;
            iArr[c] = i33;
            objArr34[1] = str8;
            int iIdentityHashCode2 = System.identityHashCode(this);
            int i34 = ~iIdentityHashCode2;
            int i35 = i31 + (-1786995606) + (((~((-970092462) | i34)) | (-858853908)) * 519) + (((~(i34 | (-823132674))) | (~((-35721235) | iIdentityHashCode2))) * (-519)) + (((~(iIdentityHashCode2 | (-858853908))) | 970092461) * 519);
            int i36 = (i35 << 13) ^ i35;
            int i37 = i36 ^ (i36 >>> 17);
            ((int[]) objArr34[2])[0] = i37 ^ (i37 << 5);
        } else {
            Object[] objArr35 = {Long.valueOf(((long) (i29 ^ i30)) ^ (((long) (-48879437)) << 32)), Long.valueOf(-48879433)};
            int i38 = $$e;
            Object[] objArr36 = new Object[1];
            c((short) 323, (byte) (i38 | 120), $$d[67], objArr36);
            Class<?> cls4 = Class.forName((String) objArr36[0]);
            Object[] objArr37 = new Object[1];
            c((short) (i38 | 394), (byte) (i38 | 120), (byte) i38, objArr37);
            cls4.getMethod((String) objArr37[0], Long.TYPE, Long.TYPE).invoke(null, objArr35);
            Object[] objArr38 = {new int[]{i}, str, new int[1], new int[]{i}};
            int i39 = ((int[]) objArr[2])[0];
            int i40 = ((int[]) objArr[3])[0];
            int i41 = ((int[]) objArr[0])[0];
            String str9 = (String) objArr[1];
            int iIdentityHashCode3 = System.identityHashCode(this);
            int i42 = ~iIdentityHashCode3;
            int i43 = i39 + (-1786995606) + (((~((-287508593) | i42)) | (-176270039)) * 519) + (((~(i42 | (-67665))) | (~((-176202375) | iIdentityHashCode3))) * (-519)) + (((~(iIdentityHashCode3 | (-176270039))) | 287508592) * 519);
            int i44 = (i43 << 13) ^ i43;
            int i45 = i44 ^ (i44 >>> 17);
            ((int[]) objArr38[2])[0] = i45 ^ (i45 << 5);
        }
        Object objEZpvd10 = YY.EZpvd(114367195);
        if (objEZpvd10 == null) {
            Object[] objArr39 = new Object[1];
            b((byte) (-$$a[43]), (byte) 35, r0[16], objArr39);
            objEZpvd10 = YY.EZpvd(172, 4, (char) 0, 49403815, false, (String) objArr39[0], null);
        }
        long j3 = ((Field) objEZpvd10).getLong(null);
        if (j3 != -1) {
            int i46 = AuCTelauCTel + 109;
            zLjUOn = i46 % 128;
            int i47 = i46 % 2;
            if (j3 + 1950 >= ((Long) Class.forName(str2).getDeclaredMethod(str3, new Class[0]).invoke(null, new Object[0])).longValue()) {
                Object objEZpvd11 = YY.EZpvd(-1686262422);
                if (objEZpvd11 == null) {
                    byte[] bArr = $$a;
                    byte b5 = (byte) (-bArr[43]);
                    Object[] objArr40 = new Object[1];
                    b(b5, (byte) (b5 - 5), (byte) (-bArr[45]), objArr40);
                    objEZpvd11 = YY.EZpvd(172, 4, (char) 0, -1621270506, false, (String) objArr40[0], null);
                }
                Object[] objArr41 = (Object[]) ((Field) objEZpvd11).get(null);
                objArr2 = new Object[]{new int[]{i}, str, new int[1], new int[]{i}};
                int i48 = ((int[]) objArr41[3])[0];
                int i49 = ((int[]) objArr41[0])[0];
                String str10 = (String) objArr41[1];
                int iIdentityHashCode4 = System.identityHashCode(this);
                int i50 = (-2029666081) + (((-157805999) | iIdentityHashCode4) * 614);
                int i51 = ~iIdentityHashCode4;
                int i52 = i50 + (((~((-714909110) | i51)) | 580386833 | (~((-603670556) | i51))) * (-1228)) + (((~(i51 | (-23283723))) | (~((-134522277) | i51))) * 614) + 582303730;
                int i53 = (i52 << 13) ^ i52;
                int i54 = i53 ^ (i53 >>> 17);
                ((int[]) objArr2[2])[0] = i54 ^ (i54 << 5);
                c2 = 0;
            } else {
                Object[] objArr42 = {Integer.valueOf(((Integer) Class.forName(str4).getMethod(str5, Object.class).invoke(null, this)).intValue()), 582303730};
                int i55 = $$e;
                byte[] bArr2 = $$d;
                Object[] objArr43 = new Object[1];
                c((short) (i55 | 314), (byte) (i55 | 120), bArr2[67], objArr43);
                Class<?> cls5 = Class.forName((String) objArr43[0]);
                Object[] objArr44 = new Object[1];
                c((short) 315, (byte) 124, bArr2[138], objArr44);
                objArr2 = (Object[]) cls5.getMethod((String) objArr44[0], Integer.TYPE, Integer.TYPE).invoke(null, objArr42);
                Object objEZpvd12 = YY.EZpvd(-1686262422);
                if (objEZpvd12 == null) {
                    byte[] bArr3 = $$a;
                    byte b6 = (byte) (-bArr3[43]);
                    Object[] objArr45 = new Object[1];
                    b(b6, (byte) (b6 - 5), (byte) (-bArr3[45]), objArr45);
                    objEZpvd12 = YY.EZpvd(172, 4, (char) 0, -1621270506, false, (String) objArr45[0], null);
                }
                ((Field) objEZpvd12).set(null, objArr2);
                try {
                    Long lValueOf3 = Long.valueOf(((Long) Class.forName(str2).getDeclaredMethod(str3, new Class[0]).invoke(null, new Object[0])).longValue());
                    Object objEZpvd13 = YY.EZpvd(114367195);
                    if (objEZpvd13 == null) {
                        Object[] objArr46 = new Object[1];
                        b((byte) (-$$a[43]), (byte) 35, r3[16], objArr46);
                        objEZpvd13 = YY.EZpvd(172, 4, (char) 0, 49403815, false, (String) objArr46[0], null);
                    }
                    ((Field) objEZpvd13).set(null, lValueOf3);
                    c2 = 0;
                } catch (Exception unused3) {
                    throw new RuntimeException();
                }
            }
        }
        int i56 = ((int[]) objArr2[c2])[c2];
        int i57 = ((int[]) objArr2[3])[c2];
        if (i57 == i56) {
            int i58 = zLjUOn + 95;
            AuCTelauCTel = i58 % 128;
            int i59 = i58 % 2;
            Object[] objArr47 = {new int[]{i}, str, new int[1], new int[]{i}};
            int i60 = ((int[]) objArr2[2])[0];
            int i61 = ((int[]) objArr2[3])[0];
            int i62 = ((int[]) objArr2[0])[0];
            String str11 = (String) objArr2[1];
            int mode = ((AudioManager) ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getSystemService(MimeTypes.BASE_TYPE_AUDIO)).getMode();
            int i63 = ~(385961769 | mode);
            int i64 = i60 + (-672228021) + (((-392167344) | i63) * (-814)) + ((i63 | (~((~mode) | 274723215)) | 268517641) * 407) + (((~(mode | (-274723216))) | (~((-385961770) | mode)) | 268517641) * 407);
            int i65 = (i64 << 13) ^ i64;
            int i66 = i65 ^ (i65 >>> 17);
            ((int[]) objArr47[2])[0] = i66 ^ (i66 << 5);
            i = 0;
        } else {
            new ArrayList().add((String) objArr2[1]);
            long j4 = ((long) (i56 ^ i57)) ^ (((long) (-1602460155)) << 32);
            long j5 = -1602460139;
            int i67 = zLjUOn + 87;
            AuCTelauCTel = i67 % 128;
            int i68 = i67 % 2;
            Object[] objArr48 = {Long.valueOf(j4), Long.valueOf(j5)};
            int i69 = $$e;
            Object[] objArr49 = new Object[1];
            c((short) 310, (byte) (i69 | 120), $$d[67], objArr49);
            Class<?> cls6 = Class.forName((String) objArr49[0]);
            Object[] objArr50 = new Object[1];
            c((short) (i69 | 394), (byte) (i69 | 120), (byte) i69, objArr50);
            cls6.getMethod((String) objArr50[0], Long.TYPE, Long.TYPE).invoke(null, objArr48);
            Object[] objArr51 = {new int[]{i}, str, new int[1], new int[]{i}};
            int i70 = ((int[]) objArr2[2])[0];
            int i71 = ((int[]) objArr2[3])[0];
            int i72 = ((int[]) objArr2[0])[0];
            String str12 = (String) objArr2[1];
            int ringerMode = ((AudioManager) ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getSystemService(MimeTypes.BASE_TYPE_AUDIO)).getRingerMode();
            int i73 = ~ringerMode;
            int i74 = i70 + (-687002294) + ((ringerMode | 520151102) * (-859)) + (((~(ringerMode | (-117465115))) | (~(520151102 | i73))) * 859) + (((~(408912548 | i73)) | (-526377663)) * 859);
            int i75 = (i74 << 13) ^ i74;
            int i76 = i75 ^ (i75 >>> 17);
            i = 0;
            ((int[]) objArr51[2])[0] = i76 ^ (i76 << 5);
        }
        Object objEZpvd14 = YY.EZpvd(1457287029);
        if (objEZpvd14 == null) {
            byte b7 = (byte) i;
            Object[] objArr52 = new Object[1];
            b(b7, (byte) (b7 | 34), (byte) (-$$a[5]), objArr52);
            objEZpvd14 = YY.EZpvd(172, 4, (char) 0, 1392288265, false, (String) objArr52[i], null);
        }
        long j6 = ((Field) objEZpvd14).getLong(null);
        if (j6 == -1 || j6 + 1889 < ((Long) Class.forName(str2).getDeclaredMethod(str3, new Class[0]).invoke(null, new Object[0])).longValue()) {
            Context baseContext2 = getBaseContext();
            if (baseContext2 == null) {
                Object[] objArr53 = new Object[1];
                a(new byte[]{0, 1, 0, 1, 0, 0, 1, 1, 1, 1, 1, 1, 1, 0, 1, 0, 0, 1, 1, 0, 1, 0, 1, 0, 0, 1}, true, new int[]{69, 26, 128, 0}, objArr53);
                Class<?> cls7 = Class.forName((String) objArr53[0]);
                Object[] objArr54 = new Object[1];
                a(new byte[]{0, 1, 0, 0, 1, 0, 0, 1, 1, 0, 1, 1, 0, 1, 0, 1, 1, 0}, false, new int[]{95, 18, 77, 11}, objArr54);
                Method method = cls7.getMethod((String) objArr54[0], new Class[0]);
                baseContext2 = (Context) method.invoke(null, null);
            }
            if (baseContext2 != null) {
                baseContext2 = ((baseContext2 instanceof ContextWrapper) && ((ContextWrapper) baseContext2).getBaseContext() == null) ? null : baseContext2.getApplicationContext();
            }
            int iIntValue2 = ((Integer) Class.forName(str4).getMethod(str5, Object.class).invoke(null, this)).intValue();
            int i77 = zLjUOn + 121;
            AuCTelauCTel = i77 % 128;
            int i78 = i77 % 2;
            Object[] objArr55 = {baseContext2, Integer.valueOf(iIntValue2), 506155182};
            byte[] bArr4 = $$d;
            Object[] objArr56 = new Object[1];
            c((short) 306, (byte) 108, bArr4[67], objArr56);
            Class<?> cls8 = Class.forName((String) objArr56[0]);
            Object[] objArr57 = new Object[1];
            c((short) 315, (byte) 124, bArr4[138], objArr57);
            Object[] objArr58 = (Object[]) cls8.getMethod((String) objArr57[0], Context.class, Integer.TYPE, Integer.TYPE).invoke(null, objArr55);
            if (baseContext2 != null) {
                Object objEZpvd15 = YY.EZpvd(1362558065);
                if (objEZpvd15 == null) {
                    byte b8 = $$a[33];
                    byte b9 = (byte) (b8 | 49);
                    Object[] objArr59 = new Object[1];
                    b(b8, b9, (byte) (b9 & 235), objArr59);
                    objEZpvd15 = YY.EZpvd(172, 4, (char) 0, 1427517709, false, (String) objArr59[0], null);
                }
                ((Field) objEZpvd15).set(null, objArr58);
                try {
                    Long lValueOf4 = Long.valueOf(((Long) Class.forName(str2).getDeclaredMethod(str3, new Class[0]).invoke(null, new Object[0])).longValue());
                    Object objEZpvd16 = YY.EZpvd(1457287029);
                    if (objEZpvd16 == null) {
                        byte b10 = (byte) 0;
                        Object[] objArr60 = new Object[1];
                        b(b10, (byte) (b10 | 34), (byte) (-$$a[5]), objArr60);
                        objEZpvd16 = YY.EZpvd(172, 4, (char) 0, 1392288265, false, (String) objArr60[0], null);
                    }
                    ((Field) objEZpvd16).set(null, lValueOf4);
                } catch (Exception unused4) {
                    throw new RuntimeException();
                }
            }
            objArr3 = objArr58;
            c3 = 0;
        } else {
            Object objEZpvd17 = YY.EZpvd(1362558065);
            if (objEZpvd17 == null) {
                byte b11 = $$a[33];
                byte b12 = (byte) (b11 | 49);
                Object[] objArr61 = new Object[1];
                b(b11, b12, (byte) (b12 & 235), objArr61);
                objEZpvd17 = YY.EZpvd(172, 4, (char) 0, 1427517709, false, (String) objArr61[0], null);
            }
            Object[] objArr62 = (Object[]) ((Field) objEZpvd17).get(null);
            Object[] objArr63 = {new int[]{i}, str, new int[1], new int[]{i}};
            int i79 = ((int[]) objArr62[3])[0];
            int i80 = ((int[]) objArr62[0])[0];
            String str13 = (String) objArr62[1];
            int iIdentityHashCode5 = System.identityHashCode(this);
            int i81 = (-514239501) + (((~iIdentityHashCode5) | 187696794) * 1324) + (((~(iIdentityHashCode5 | (-885975361))) | (~(997213914 | iIdentityHashCode5))) * (-1324)) + 1729181148;
            int i82 = (i81 << 13) ^ i81;
            int i83 = i82 ^ (i82 >>> 17);
            c3 = 0;
            ((int[]) objArr63[2])[0] = i83 ^ (i83 << 5);
            objArr3 = objArr63;
        }
        int i84 = ((int[]) objArr3[c3])[c3];
        int i85 = ((int[]) objArr3[3])[c3];
        if (i85 == i84) {
            Object[] objArr64 = new Object[4];
            int[] iArr3 = new int[1];
            objArr64[c3] = iArr3;
            objArr64[2] = new int[1];
            int[] iArr4 = new int[1];
            objArr64[3] = iArr4;
            int i86 = ((int[]) objArr3[2])[c3];
            int i87 = ((int[]) objArr3[3])[c3];
            int i88 = ((int[]) objArr3[c3])[c3];
            String str14 = (String) objArr3[1];
            iArr4[c3] = i87;
            iArr3[c3] = i88;
            objArr64[1] = str14;
            str = str4;
            int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
            int i89 = i86 + (-647468757) + (((~((~iElapsedRealtime) | (-403183873))) | (~((-2147459) | iElapsedRealtime))) * (-302)) + ((~((-403183873) | iElapsedRealtime)) * (-604)) + (((~(iElapsedRealtime | (-405331331))) | (-518717343)) * 302);
            int i90 = (i89 << 13) ^ i89;
            int i91 = i90 ^ (i90 >>> 17);
            ((int[]) objArr64[2])[0] = i91 ^ (i91 << 5);
            i2 = 0;
        } else {
            str = str4;
            long j7 = (((long) 2092519659) << 32) ^ ((long) (i84 ^ i85));
            long j8 = 2092520171;
            int i92 = AuCTelauCTel + 39;
            zLjUOn = i92 % 128;
            int i93 = i92 % 2;
            Object[] objArr65 = {Long.valueOf(j7), Long.valueOf(j8)};
            int i94 = $$e;
            Object[] objArr66 = new Object[1];
            c((short) 323, (byte) (i94 | 120), $$d[67], objArr66);
            Class<?> cls9 = Class.forName((String) objArr66[0]);
            Object[] objArr67 = new Object[1];
            c((short) (i94 | 394), (byte) (i94 | 120), (byte) i94, objArr67);
            cls9.getMethod((String) objArr67[0], Long.TYPE, Long.TYPE).invoke(null, objArr65);
            Object[] objArr68 = {new int[]{i}, str, new int[1], new int[]{i}};
            int i95 = ((int[]) objArr3[2])[0];
            int i96 = ((int[]) objArr3[3])[0];
            int i97 = ((int[]) objArr3[0])[0];
            String str15 = (String) objArr3[1];
            int i98 = ~System.identityHashCode(this);
            int i99 = i95 + 615707109 + ((~(i98 | (-2051))) * 52) + (((~(381150717 | i98)) | (~(269912163 | i98)) | (-381152768)) * (-52)) + (((~(i98 | (-381150718))) | 269910113) * 52);
            int i100 = (i99 << 13) ^ i99;
            int i101 = i100 ^ (i100 >>> 17);
            i2 = 0;
            ((int[]) objArr68[2])[0] = i101 ^ (i101 << 5);
        }
        Object objEZpvd18 = YY.EZpvd(-1484370570);
        if (objEZpvd18 == null) {
            byte b13 = (byte) i2;
            Object[] objArr69 = new Object[1];
            b(b13, (byte) (b13 | 34), (byte) (-$$a[5]), objArr69);
            objEZpvd18 = YY.EZpvd(CipherSuite.TLS_DH_DSS_WITH_CAMELLIA_256_CBC_SHA, 4, (char) 0, -1549369334, false, (String) objArr69[i2], null);
        }
        long j9 = ((Field) objEZpvd18).getLong(null);
        if (j9 == -1 || j9 + 1900 < ((Long) Class.forName(str2).getDeclaredMethod(str3, new Class[0]).invoke(null, new Object[0])).longValue()) {
            Object objEZpvd19 = YY.EZpvd(981579467);
            if (objEZpvd19 == null) {
                objEZpvd19 = YY.EZpvd(PsExtractor.VIDEO_STREAM_MASK, 5, (char) 0, 1050770359, false, null, new Class[0]);
            }
            Object[] objArr70 = {null, ((Constructor) objEZpvd19).newInstance(null), -65932324, 0};
            Object objEZpvd20 = YY.EZpvd(1167604386);
            if (objEZpvd20 == null) {
                Object[] objArr71 = new Object[1];
                b((byte) ($$b & 31), (byte) (-$$a[29]), r5[47], objArr71);
                objEZpvd20 = YY.EZpvd(CipherSuite.TLS_DH_DSS_WITH_CAMELLIA_256_CBC_SHA, 4, (char) 0, 1102641118, false, (String) objArr71[0], new Class[]{(Class) YY.AEQbTJ(CipherSuite.TLS_DH_anon_WITH_CAMELLIA_256_CBC_SHA, 13, (char) 2212), (Class) YY.AEQbTJ(150, 22, (char) 48137), Integer.TYPE, Integer.TYPE});
            }
            objArr4 = (Object[]) ((Method) objEZpvd20).invoke(null, objArr70);
            Object objEZpvd21 = YY.EZpvd(1636616175);
            if (objEZpvd21 == null) {
                byte b14 = (byte) (-$$a[43]);
                Object[] objArr72 = new Object[1];
                b(b14, (byte) (b14 - 5), r0[18], objArr72);
                objEZpvd21 = YY.EZpvd(CipherSuite.TLS_DH_DSS_WITH_CAMELLIA_256_CBC_SHA, 4, (char) 0, 1705773715, false, (String) objArr72[0], null);
            }
            ((Field) objEZpvd21).set(null, objArr4);
            try {
                Long lValueOf5 = Long.valueOf(((Long) Class.forName(str2).getDeclaredMethod(str3, new Class[0]).invoke(null, new Object[0])).longValue());
                Object objEZpvd22 = YY.EZpvd(-1484370570);
                if (objEZpvd22 == null) {
                    byte b15 = (byte) 0;
                    Object[] objArr73 = new Object[1];
                    b(b15, (byte) (b15 | 34), (byte) (-$$a[5]), objArr73);
                    objEZpvd22 = YY.EZpvd(CipherSuite.TLS_DH_DSS_WITH_CAMELLIA_256_CBC_SHA, 4, (char) 0, -1549369334, false, (String) objArr73[0], null);
                }
                ((Field) objEZpvd22).set(null, lValueOf5);
            } catch (Exception unused5) {
                throw new RuntimeException();
            }
        } else {
            int i102 = zLjUOn + 89;
            AuCTelauCTel = i102 % 128;
            int i103 = i102 % 2;
            Object objEZpvd23 = YY.EZpvd(1636616175);
            if (objEZpvd23 == null) {
                byte b16 = (byte) (-$$a[43]);
                Object[] objArr74 = new Object[1];
                b(b16, (byte) (b16 - 5), r0[18], objArr74);
                objEZpvd23 = YY.EZpvd(CipherSuite.TLS_DH_DSS_WITH_CAMELLIA_256_CBC_SHA, 4, (char) 0, 1705773715, false, (String) objArr74[0], null);
            }
            Object[] objArr75 = (Object[]) ((Field) objEZpvd23).get(null);
            objArr4 = new Object[]{new int[1], new int[1], new int[1]};
            int i104 = ((int[]) objArr75[0])[0];
            int i105 = ((int[]) objArr75[2])[0];
            ((int[]) objArr4[0])[0] = i104;
            ((int[]) objArr4[2])[0] = i105;
            int i106 = ~((AudioManager) ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getSystemService(MimeTypes.BASE_TYPE_AUDIO)).getStreamMaxVolume(3);
            int i107 = (((-124987405) + ((1031212909 | i106) * CipherSuite.TLS_RSA_PSK_WITH_NULL_SHA256)) + (((~(i106 | 1007816009)) | 493292388) * CipherSuite.TLS_RSA_PSK_WITH_NULL_SHA256)) - 65932324;
            int i108 = (i107 << 13) ^ i107;
            int i109 = i108 ^ (i108 >>> 17);
            ((int[]) objArr4[1])[0] = i109 ^ (i109 << 5);
        }
        Object obj = objArr4[2];
        int i110 = ((int[]) obj)[0];
        Object obj2 = objArr4[0];
        int i111 = ((int[]) obj2)[0];
        if (i111 == i110) {
            Object[] objArr76 = {new int[1], new int[1], new int[1]};
            int i112 = ((int[]) objArr4[1])[0];
            int i113 = ((int[]) obj2)[0];
            int i114 = ((int[]) obj)[0];
            ((int[]) objArr76[0])[0] = i113;
            ((int[]) objArr76[2])[0] = i114;
            int ringerMode2 = ((AudioManager) ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getSystemService(MimeTypes.BASE_TYPE_AUDIO)).getRingerMode();
            int i115 = ~ringerMode2;
            int i116 = i112 + 338587039 + ((ringerMode2 | 404783328) * 988) + (((-1069386237) | (~(960334076 | i115))) * (-1976)) + (((~(ringerMode2 | 513835488)) | 404783328 | (~((-513835489) | i115))) * 988);
            int i117 = i116 ^ (i116 << 13);
            int i118 = i117 ^ (i117 >>> 17);
            ((int[]) objArr76[1])[0] = i118 ^ (i118 << 5);
        } else {
            Object[] objArr77 = {Long.valueOf(((long) (i110 ^ i111)) ^ (((long) (-1195239737)) << 32)), Long.valueOf(-1195243833)};
            int i119 = $$e;
            Object[] objArr78 = new Object[1];
            c((short) 310, (byte) (i119 | 120), $$d[67], objArr78);
            Class<?> cls10 = Class.forName((String) objArr78[0]);
            Object[] objArr79 = new Object[1];
            c((short) (i119 | 394), (byte) (i119 | 120), (byte) i119, objArr79);
            cls10.getMethod((String) objArr79[0], Long.TYPE, Long.TYPE).invoke(null, objArr77);
            Object[] objArr80 = {new int[1], new int[1], new int[1]};
            int i120 = ((int[]) objArr4[1])[0];
            int i121 = ((int[]) objArr4[0])[0];
            int i122 = ((int[]) objArr4[2])[0];
            ((int[]) objArr80[0])[0] = i121;
            ((int[]) objArr80[2])[0] = i122;
            int ringerMode3 = ((AudioManager) ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getSystemService(MimeTypes.BASE_TYPE_AUDIO)).getRingerMode();
            int i123 = i120 + (-810385240) + (((~(ringerMode3 | 735546060)) | 271057200) * 305) + (((~((~ringerMode3) | 735546060)) | 289047472) * 305);
            int i124 = i123 ^ (i123 << 13);
            int i125 = i124 ^ (i124 >>> 17);
            ((int[]) objArr80[1])[0] = i125 ^ (i125 << 5);
        }
        Object objEZpvd24 = YY.EZpvd(-1909595884);
        if (objEZpvd24 == null) {
            byte b17 = (byte) ($$b & 31);
            byte b18 = $$a[33];
            Object[] objArr81 = new Object[1];
            b(b17, b18, (byte) (b18 - 4), objArr81);
            objEZpvd24 = YY.EZpvd(CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA256, 4, (char) 0, -1978848152, false, (String) objArr81[0], null);
        }
        long j10 = ((Field) objEZpvd24).getLong(null);
        if (j10 == -1 || j10 + 1886 < ((Long) Class.forName(str2).getDeclaredMethod(str3, new Class[0]).invoke(null, new Object[0])).longValue()) {
            Object[] objArr82 = {Integer.valueOf(((Integer) Class.forName(str).getMethod(str5, Object.class).invoke(null, this)).intValue()), 0, 1499432292};
            Object objEZpvd25 = YY.EZpvd(544886635);
            if (objEZpvd25 == null) {
                Object[] objArr83 = new Object[1];
                b((byte) (-$$a[43]), r0[14], r0[33], objArr83);
                objEZpvd25 = YY.EZpvd(CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA256, 4, (char) 0, 609911319, false, (String) objArr83[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE});
            }
            objArr5 = (Object[]) ((Method) objEZpvd25).invoke(null, objArr82);
            Object objEZpvd26 = YY.EZpvd(-131060873);
            if (objEZpvd26 == null) {
                byte b19 = (byte) 0;
                Object[] objArr84 = new Object[1];
                b(b19, (byte) (b19 | 34), (byte) (-$$a[5]), objArr84);
                objEZpvd26 = YY.EZpvd(CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA256, 4, (char) 0, -66001397, false, (String) objArr84[0], null);
            }
            ((Field) objEZpvd26).set(null, objArr5);
            try {
                Long lValueOf6 = Long.valueOf(((Long) Class.forName(str2).getDeclaredMethod(str3, new Class[0]).invoke(null, new Object[0])).longValue());
                Object objEZpvd27 = YY.EZpvd(-1909595884);
                if (objEZpvd27 == null) {
                    byte b20 = (byte) ($$b & 31);
                    byte b21 = $$a[33];
                    Object[] objArr85 = new Object[1];
                    b(b20, b21, (byte) (b21 - 4), objArr85);
                    objEZpvd27 = YY.EZpvd(CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA256, 4, (char) 0, -1978848152, false, (String) objArr85[0], null);
                }
                ((Field) objEZpvd27).set(null, lValueOf6);
            } catch (Exception unused6) {
                throw new RuntimeException();
            }
        } else {
            Object objEZpvd28 = YY.EZpvd(-131060873);
            if (objEZpvd28 == null) {
                byte b22 = (byte) 0;
                Object[] objArr86 = new Object[1];
                b(b22, (byte) (b22 | 34), (byte) (-$$a[5]), objArr86);
                objEZpvd28 = YY.EZpvd(CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA256, 4, (char) 0, -66001397, false, (String) objArr86[0], null);
            }
            Object[] objArr87 = (Object[]) ((Field) objEZpvd28).get(null);
            objArr5 = new Object[]{strArr, new int[]{i}, new int[]{i}, new int[1]};
            int i126 = ((int[]) objArr87[1])[0];
            int i127 = ((int[]) objArr87[2])[0];
            String[] strArr2 = (String[]) objArr87[0];
            int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
            int i128 = 587068470 + (((~((-1523923) | iFreeMemory)) | (-599572141)) * (-948)) + ((~((~iFreeMemory) | (-1310849))) * (-948)) + 1297437192;
            int i129 = (i128 << 13) ^ i128;
            int i130 = i129 ^ (i129 >>> 17);
            ((int[]) objArr5[3])[0] = i130 ^ (i130 << 5);
        }
        Object[] objArr88 = objArr5;
        int i131 = ((int[]) objArr88[2])[0];
        int i132 = ((int[]) objArr88[1])[0];
        if (i132 == i131) {
            Object[] objArr89 = {strArr, new int[]{i}, new int[]{i}, new int[1]};
            int i133 = ((int[]) objArr88[3])[0];
            int i134 = ((int[]) objArr88[1])[0];
            int i135 = ((int[]) objArr88[2])[0];
            String[] strArr3 = (String[]) objArr88[0];
            int iIdentityHashCode6 = System.identityHashCode(this);
            int i136 = ~iIdentityHashCode6;
            int i137 = i133 + 593219444 + (((~((-774148463) | i136)) | (-173052400)) * (-602)) + (((~(iIdentityHashCode6 | (-774148463))) | 606339072 | (~((-5243010) | i136))) * LuaValue.ERR_CLOSE_FILE_ERROR) + ((~(i136 | (-173052400))) * 301);
            int i138 = (i137 << 13) ^ i137;
            int i139 = i138 ^ (i138 >>> 17);
            ((int[]) objArr89[3])[0] = i139 ^ (i139 << 5);
        } else {
            ArrayList arrayList2 = new ArrayList();
            String[] strArr4 = (String[]) objArr88[0];
            if (strArr4 != null) {
                for (String str16 : strArr4) {
                    arrayList2.add(str16);
                }
            }
            Object[] objArr90 = {Long.valueOf(((long) (i131 ^ i132)) ^ (((long) 1816389105) << 32)), Long.valueOf(1816389104)};
            int i140 = $$e;
            Object[] objArr91 = new Object[1];
            c((short) (i140 | 280), (byte) (i140 | 120), $$d[67], objArr91);
            Class<?> cls11 = Class.forName((String) objArr91[0]);
            Object[] objArr92 = new Object[1];
            c((short) (i140 | 394), (byte) (i140 | 120), (byte) i140, objArr92);
            cls11.getMethod((String) objArr92[0], Long.TYPE, Long.TYPE).invoke(null, objArr90);
            Object[] objArr93 = {strArr, new int[]{i}, new int[]{i}, new int[1]};
            int i141 = ((int[]) objArr88[3])[0];
            int i142 = ((int[]) objArr88[1])[0];
            int i143 = ((int[]) objArr88[2])[0];
            String[] strArr5 = (String[]) objArr88[0];
            int iIdentityHashCode7 = System.identityHashCode(this);
            int i144 = i141 + (((~(iIdentityHashCode7 | 126017096)) | 475078966) * 56) + 1137967030 + (((~((~iIdentityHashCode7) | 475078966)) | 126017096) * 56);
            int i145 = (i144 << 13) ^ i144;
            int i146 = i145 ^ (i145 >>> 17);
            ((int[]) objArr93[3])[0] = i146 ^ (i146 << 5);
        }
        Object objEZpvd29 = YY.EZpvd(1699149472);
        if (objEZpvd29 == null) {
            byte b23 = (byte) (-$$a[43]);
            Object[] objArr94 = new Object[1];
            b(b23, (byte) (b23 - 5), r0[18], objArr94);
            objEZpvd29 = YY.EZpvd(368, 5, (char) 0, 1634089948, false, (String) objArr94[0], null);
        }
        long j11 = ((Field) objEZpvd29).getLong(null);
        if (j11 == -1 || j11 + 2004 < ((Long) Class.forName(str2).getDeclaredMethod(str3, new Class[0]).invoke(null, new Object[0])).longValue()) {
            Context baseContext3 = getBaseContext();
            if (baseContext3 == null) {
                Object[] objArr95 = new Object[1];
                a(new byte[]{0, 1, 0, 1, 0, 0, 1, 1, 1, 1, 1, 1, 1, 0, 1, 0, 0, 1, 1, 0, 1, 0, 1, 0, 0, 1}, true, new int[]{69, 26, 128, 0}, objArr95);
                Class<?> cls12 = Class.forName((String) objArr95[0]);
                Object[] objArr96 = new Object[1];
                a(new byte[]{0, 1, 0, 0, 1, 0, 0, 1, 1, 0, 1, 1, 0, 1, 0, 1, 1, 0}, false, new int[]{95, 18, 77, 11}, objArr96);
                baseContext3 = (Context) cls12.getMethod((String) objArr96[0], new Class[0]).invoke(null, null);
            }
            if (baseContext3 != null) {
                int i147 = zLjUOn;
                int i148 = i147 + 93;
                AuCTelauCTel = i148 % 128;
                int i149 = i148 % 2;
                if (baseContext3 instanceof ContextWrapper) {
                    int i150 = i147 + 57;
                    AuCTelauCTel = i150 % 128;
                    int i151 = i150 % 2;
                    baseContext3 = ((ContextWrapper) baseContext3).getBaseContext() != null ? baseContext3.getApplicationContext() : null;
                }
            }
            Object[] objArr97 = {baseContext3, Integer.valueOf(((Integer) Class.forName(str).getMethod(str5, Object.class).invoke(null, this)).intValue()), 0, 1645030768};
            int i152 = $$e;
            Object[] objArr98 = new Object[1];
            c((short) 281, (byte) (i152 | 120), $$d[67], objArr98);
            Class<?> cls13 = Class.forName((String) objArr98[0]);
            Object[] objArr99 = new Object[1];
            c((short) (i152 | 394), (byte) (i152 | 120), (byte) i152, objArr99);
            objArr6 = (Object[]) cls13.getMethod((String) objArr99[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr97);
            if (baseContext3 != null) {
                Object objEZpvd30 = YY.EZpvd(-249174654);
                if (objEZpvd30 == null) {
                    byte b24 = (byte) ($$b & 31);
                    byte b25 = $$a[33];
                    Object[] objArr100 = new Object[1];
                    b(b24, b25, (byte) (b25 - 4), objArr100);
                    objEZpvd30 = YY.EZpvd(368, 5, (char) 0, -184211202, false, (String) objArr100[0], null);
                }
                ((Field) objEZpvd30).set(null, objArr6);
                try {
                    Long lValueOf7 = Long.valueOf(((Long) Class.forName(str2).getDeclaredMethod(str3, new Class[0]).invoke(null, new Object[0])).longValue());
                    Object objEZpvd31 = YY.EZpvd(1699149472);
                    if (objEZpvd31 == null) {
                        byte b26 = (byte) (-$$a[43]);
                        Object[] objArr101 = new Object[1];
                        b(b26, (byte) (b26 - 5), r4[18], objArr101);
                        objEZpvd31 = YY.EZpvd(368, 5, (char) 0, 1634089948, false, (String) objArr101[0], null);
                    }
                    ((Field) objEZpvd31).set(null, lValueOf7);
                    int i153 = AuCTelauCTel + 91;
                    zLjUOn = i153 % 128;
                    int i154 = i153 % 2;
                } catch (Exception unused7) {
                    throw new RuntimeException();
                }
            }
        } else {
            Object objEZpvd32 = YY.EZpvd(-249174654);
            if (objEZpvd32 == null) {
                byte b27 = (byte) ($$b & 31);
                byte b28 = $$a[33];
                Object[] objArr102 = new Object[1];
                b(b27, b28, (byte) (b28 - 4), objArr102);
                objEZpvd32 = YY.EZpvd(368, 5, (char) 0, -184211202, false, (String) objArr102[0], null);
            }
            Object[] objArr103 = (Object[]) ((Field) objEZpvd32).get(null);
            objArr6 = new Object[]{new int[1], new int[]{((int[]) objArr103[1])[0]}, (String) objArr103[2], new int[]{((int[]) objArr103[3])[0]}, (String) objArr103[4]};
            int i155 = ~Process.myPid();
            int i156 = (((~((-903891395) | i155)) | 287328704) * (-241)) + 1363816066 + (((~(i155 | (-616562691))) | 1475604) * 241) + 1645030768;
            int i157 = (i156 << 13) ^ i156;
            int i158 = i157 ^ (i157 >>> 17);
            ((int[]) objArr6[0])[0] = i158 ^ (i158 << 5);
        }
        int i159 = ((int[]) objArr6[1])[0];
        int i160 = ((int[]) objArr6[3])[0];
        if (i160 == i159) {
            int i161 = ((int[]) objArr6[0])[0];
            Object[] objArr104 = {new int[1], new int[]{((int[]) objArr6[1])[0]}, (String) objArr6[2], new int[]{((int[]) objArr6[3])[0]}, (String) objArr6[4]};
            int i162 = ~System.identityHashCode(this);
            int i163 = i161 + (((108473954 + (((~((-471732925) | i162)) | (~((-720962779) | r0))) * (-370))) + ((((~(r0 | (-471732925))) | (~(i162 | (-720962779)))) | (-1056904959)) * (-370))) - 212810894);
            int i164 = (i163 << 13) ^ i163;
            int i165 = i164 ^ (i164 >>> 17);
            ((int[]) objArr104[0])[0] = i165 ^ (i165 << 5);
        } else {
            ArrayList arrayList3 = new ArrayList();
            arrayList3.add((String) objArr6[2]);
            arrayList3.add((String) objArr6[4]);
            Object[] objArr105 = {Long.valueOf(((long) (i159 ^ i160)) ^ (((long) (-709337033)) << 32)), Long.valueOf(-709337065)};
            short s = (short) ($$e | 272);
            byte[] bArr5 = $$d;
            Object[] objArr106 = new Object[1];
            c(s, bArr5[41], bArr5[16], objArr106);
            Class<?> cls14 = Class.forName((String) objArr106[0]);
            Object[] objArr107 = new Object[1];
            c((short) CipherSuite.TLS_RSA_PSK_WITH_AES_128_CBC_SHA, (byte) 124, bArr5[41], objArr107);
            cls14.getMethod((String) objArr107[0], Long.TYPE, Long.TYPE).invoke(null, objArr105);
            int i166 = ((int[]) objArr6[0])[0];
            Object[] objArr108 = {new int[1], new int[]{((int[]) objArr6[1])[0]}, (String) objArr6[2], new int[]{((int[]) objArr6[3])[0]}, (String) objArr6[4]};
            int i167 = i166 + ((((~((-390486850) | r0)) | 268845824) * (-566)) - 1259390570) + ((~(((AudioManager) ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getSystemService(MimeTypes.BASE_TYPE_AUDIO)).getStreamMaxVolume(3) | (-121641026))) * 566);
            int i168 = (i167 << 13) ^ i167;
            int i169 = i168 ^ (i168 >>> 17);
            ((int[]) objArr108[0])[0] = i169 ^ (i169 << 5);
        }
        Object objEZpvd33 = YY.EZpvd(-1900789179);
        if (objEZpvd33 == null) {
            Object[] objArr109 = new Object[1];
            b((byte) (-$$a[43]), r0[14], r0[33], objArr109);
            objEZpvd33 = YY.EZpvd(226, 4, (char) 0, -1969975495, false, (String) objArr109[0], null);
        }
        long j12 = ((Field) objEZpvd33).getLong(null);
        if (j12 == -1 || j12 + 1898 < ((Long) Class.forName(str2).getDeclaredMethod(str3, new Class[0]).invoke(null, new Object[0])).longValue()) {
            Object[] objArr110 = {Integer.valueOf(((Integer) Class.forName(str).getMethod(str5, Object.class).invoke(null, this)).intValue()), 1144129056};
            Object objEZpvd34 = YY.EZpvd(777374025);
            if (objEZpvd34 == null) {
                byte b29 = (byte) ($$b & 31);
                byte b30 = $$a[33];
                Object[] objArr111 = new Object[1];
                b(b29, b30, (byte) (b30 - 4), objArr111);
                objEZpvd34 = YY.EZpvd(226, 4, (char) 0, 712311861, false, (String) objArr111[0], new Class[]{Integer.TYPE, Integer.TYPE});
            }
            Object[] objArr112 = (Object[]) ((Method) objEZpvd34).invoke(null, objArr110);
            Object objEZpvd35 = YY.EZpvd(193597850);
            if (objEZpvd35 == null) {
                byte b31 = (byte) ($$b & 31);
                byte b32 = $$a[33];
                Object[] objArr113 = new Object[1];
                b(b31, b32, (byte) (b32 - 4), objArr113);
                objEZpvd35 = YY.EZpvd(226, 4, (char) 0, 262855910, false, (String) objArr113[0], null);
            }
            ((Field) objEZpvd35).set(null, objArr112);
            try {
                Long lValueOf8 = Long.valueOf(((Long) Class.forName(str2).getDeclaredMethod(str3, new Class[0]).invoke(null, new Object[0])).longValue());
                Object objEZpvd36 = YY.EZpvd(-1900789179);
                if (objEZpvd36 == null) {
                    Object[] objArr114 = new Object[1];
                    b((byte) (-$$a[43]), r5[14], r5[33], objArr114);
                    objEZpvd36 = YY.EZpvd(226, 4, (char) 0, -1969975495, false, (String) objArr114[0], null);
                }
                ((Field) objEZpvd36).set(null, lValueOf8);
                objArr7 = objArr112;
                c4 = 0;
            } catch (Exception unused8) {
                throw new RuntimeException();
            }
        } else {
            Object objEZpvd37 = YY.EZpvd(193597850);
            if (objEZpvd37 == null) {
                byte b33 = (byte) ($$b & 31);
                byte b34 = $$a[33];
                Object[] objArr115 = new Object[1];
                b(b33, b34, (byte) (b34 - 4), objArr115);
                objEZpvd37 = YY.EZpvd(226, 4, (char) 0, 262855910, false, (String) objArr115[0], null);
            }
            Object[] objArr116 = (Object[]) ((Field) objEZpvd37).get(null);
            Object[] objArr117 = {new int[1], new int[1], new int[1]};
            int i170 = ((int[]) objArr116[1])[0];
            int i171 = ((int[]) objArr116[0])[0];
            ((int[]) objArr117[1])[0] = i170;
            ((int[]) objArr117[0])[0] = i171;
            int i172 = ~Process.myUid();
            int i173 = 2052686629 + (((~(i172 | 472756748)) | 55594146) * (-160)) + (((~(i172 | 393530534)) | 472756748) * CipherSuite.TLS_DH_RSA_WITH_AES_128_GCM_SHA256) + 1144129056;
            int i174 = (i173 << 13) ^ i173;
            int i175 = i174 ^ (i174 >>> 17);
            c4 = 0;
            ((int[]) objArr117[2])[0] = i175 ^ (i175 << 5);
            objArr7 = objArr117;
        }
        Object obj3 = objArr7[c4];
        int i176 = ((int[]) obj3)[c4];
        Object obj4 = objArr7[1];
        int i177 = ((int[]) obj4)[c4];
        if (i177 == i176) {
            Object[] objArr118 = {new int[1], new int[1], new int[1]};
            int i178 = ((int[]) objArr7[2])[c4];
            int i179 = ((int[]) obj4)[c4];
            int i180 = ((int[]) obj3)[c4];
            ((int[]) objArr118[1])[c4] = i179;
            ((int[]) objArr118[c4])[c4] = i180;
            int iIdentityHashCode8 = System.identityHashCode(this);
            int i181 = (~(627714401 | iIdentityHashCode8)) | 167839366;
            int i182 = ~iIdentityHashCode8;
            int i183 = i178 + 751724549 + ((i181 | (~((-88613153) | i182))) * 886) + (((~(i182 | (-627714402))) | 706940615) * (-1772)) + ((~(i182 | 706940615)) * 886);
            int i184 = i183 ^ (i183 << 13);
            int i185 = i184 ^ (i184 >>> 17);
            ((int[]) objArr118[2])[0] = i185 ^ (i185 << 5);
        } else {
            Object[] objArr119 = {Long.valueOf(((long) (i176 ^ i177)) ^ (((long) (-640102073)) << 32)), Long.valueOf(-640100025)};
            int i186 = $$e;
            byte[] bArr6 = $$d;
            Object[] objArr120 = new Object[1];
            c((short) (i186 | 138), (byte) (i186 | 104), bArr6[67], objArr120);
            Class<?> cls15 = Class.forName((String) objArr120[0]);
            short s2 = (short) 123;
            Object[] objArr121 = new Object[1];
            c(s2, (byte) (s2 - 4), bArr6[91], objArr121);
            cls15.getMethod((String) objArr121[0], Long.TYPE, Long.TYPE).invoke(null, objArr119);
            Object[] objArr122 = {new int[1], new int[1], new int[1]};
            int i187 = ((int[]) objArr7[2])[0];
            int i188 = ((int[]) objArr7[1])[0];
            int i189 = ((int[]) objArr7[0])[0];
            ((int[]) objArr122[1])[0] = i188;
            ((int[]) objArr122[0])[0] = i189;
            int i190 = Settings.System.getInt(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getContentResolver(), "screen_brightness", -1);
            int i191 = ~i190;
            int i192 = i187 + 1500144693 + (((~(i191 | 267925947)) | (~(188699733 | i191)) | (-268402176)) * 464) + (((-79702443) | i190) * (-464)) + (((~(i190 | 267925947)) | (-268402176)) * 464);
            int i193 = (i192 << 13) ^ i192;
            int i194 = i193 ^ (i193 >>> 17);
            ((int[]) objArr122[2])[0] = i194 ^ (i194 << 5);
        }
        Object objEZpvd38 = YY.EZpvd(1378450737);
        if (objEZpvd38 == null) {
            byte b35 = (byte) (-$$a[43]);
            Object[] objArr123 = new Object[1];
            b(b35, (byte) (b35 - 5), r0[18], objArr123);
            objEZpvd38 = YY.EZpvd(CipherSuite.TLS_RSA_PSK_WITH_NULL_SHA256, 4, (char) 22195, 1443475533, false, (String) objArr123[0], null);
        }
        long j13 = ((Field) objEZpvd38).getLong(null);
        if (j13 == -1 || j13 + 1879 < ((Long) Class.forName(str2).getDeclaredMethod(str3, new Class[0]).invoke(null, new Object[0])).longValue()) {
            Context baseContext4 = getBaseContext();
            if (baseContext4 == null) {
                Object[] objArr124 = new Object[1];
                a(new byte[]{0, 1, 0, 1, 0, 0, 1, 1, 1, 1, 1, 1, 1, 0, 1, 0, 0, 1, 1, 0, 1, 0, 1, 0, 0, 1}, true, new int[]{69, 26, 128, 0}, objArr124);
                Class<?> cls16 = Class.forName((String) objArr124[0]);
                Object[] objArr125 = new Object[1];
                a(new byte[]{0, 1, 0, 0, 1, 0, 0, 1, 1, 0, 1, 1, 0, 1, 0, 1, 1, 0}, false, new int[]{95, 18, 77, 11}, objArr125);
                baseContext4 = (Context) cls16.getMethod((String) objArr125[0], new Class[0]).invoke(null, null);
            }
            if (baseContext4 != null) {
                baseContext4 = ((baseContext4 instanceof ContextWrapper) && ((ContextWrapper) baseContext4).getBaseContext() == null) ? null : baseContext4.getApplicationContext();
            }
            Object[] objArr126 = {baseContext4, Integer.valueOf(((Integer) Class.forName(str).getMethod(str5, Object.class).invoke(null, this)).intValue()), 0, 1099783222};
            short s3 = (short) WalletImportError.ERROR_CODE_HARDWARE_ACCOUNT_EXIST;
            Object[] objArr127 = new Object[1];
            c(s3, (byte) (s3 | 12), $$d[67], objArr127);
            Class<?> cls17 = Class.forName((String) objArr127[0]);
            int i195 = $$e;
            Object[] objArr128 = new Object[1];
            c((short) (i195 | 394), (byte) (i195 | 120), (byte) i195, objArr128);
            Object[] objArr129 = (Object[]) cls17.getMethod((String) objArr128[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr126);
            Object objEZpvd39 = YY.EZpvd(-813709103);
            if (objEZpvd39 == null) {
                byte b36 = (byte) ($$b & 31);
                byte b37 = $$a[33];
                Object[] objArr130 = new Object[1];
                b(b36, b37, (byte) (b37 - 4), objArr130);
                objEZpvd39 = YY.EZpvd(CipherSuite.TLS_RSA_PSK_WITH_NULL_SHA256, 4, (char) 22195, -882965075, false, (String) objArr130[0], null);
            }
            ((Field) objEZpvd39).set(null, objArr129);
            try {
                Long lValueOf9 = Long.valueOf(((Long) Class.forName(str2).getDeclaredMethod(str3, new Class[0]).invoke(null, new Object[0])).longValue());
                Object objEZpvd40 = YY.EZpvd(1378450737);
                if (objEZpvd40 == null) {
                    byte b38 = (byte) (-$$a[43]);
                    Object[] objArr131 = new Object[1];
                    b(b38, (byte) (b38 - 5), r2[18], objArr131);
                    objEZpvd40 = YY.EZpvd(CipherSuite.TLS_RSA_PSK_WITH_NULL_SHA256, 4, (char) 22195, 1443475533, false, (String) objArr131[0], null);
                }
                ((Field) objEZpvd40).set(null, lValueOf9);
                objArr8 = objArr129;
            } catch (Exception unused9) {
                throw new RuntimeException();
            }
        } else {
            Object objEZpvd41 = YY.EZpvd(-813709103);
            if (objEZpvd41 == null) {
                byte b39 = (byte) ($$b & 31);
                byte b40 = $$a[33];
                Object[] objArr132 = new Object[1];
                b(b39, b40, (byte) (b40 - 4), objArr132);
                objEZpvd41 = YY.EZpvd(CipherSuite.TLS_RSA_PSK_WITH_NULL_SHA256, 4, (char) 22195, -882965075, false, (String) objArr132[0], null);
            }
            Object[] objArr133 = (Object[]) ((Field) objEZpvd41).get(null);
            objArr8 = new Object[]{new int[1], (List) objArr133[1], new int[]{((int[]) objArr133[2])[0]}, new int[]{((int[]) objArr133[3])[0]}, (List) objArr133[4]};
            int startUptimeMillis = (int) Process.getStartUptimeMillis();
            int i196 = ~startUptimeMillis;
            int i197 = (-99502948) + (((~(i196 | 713729800)) | (-737863596) | (~((-537010945) | startUptimeMillis))) * 717) + (((~(startUptimeMillis | 713729800)) | (~(i196 | (-537010945))) | (-737863596)) * 717) + 1099783222;
            int i198 = (i197 << 13) ^ i197;
            int i199 = i198 ^ (i198 >>> 17);
            ((int[]) objArr8[0])[0] = i199 ^ (i199 << 5);
        }
        int i200 = ((int[]) objArr8[3])[0];
        int i201 = ((int[]) objArr8[2])[0];
        if (i201 == i200) {
            int i202 = ((int[]) objArr8[0])[0];
            Object[] objArr134 = {new int[1], (List) objArr8[1], new int[]{((int[]) objArr8[2])[0]}, new int[]{((int[]) objArr8[3])[0]}, (List) objArr8[4]};
            int iElapsedRealtime2 = (int) SystemClock.elapsedRealtime();
            int i203 = ~iElapsedRealtime2;
            int i204 = i202 + 2006198528 + (((~(i203 | 616126175)) | 658748364) * (-1042)) + ((616126175 | iElapsedRealtime2) * 521) + (((~(iElapsedRealtime2 | (-658748365))) | 604050124 | (~(i203 | 670824415))) * 521);
            int i205 = (i204 << 13) ^ i204;
            int i206 = i205 ^ (i205 >>> 17);
            ((int[]) objArr134[0])[0] = i206 ^ (i206 << 5);
            return;
        }
        ArrayList arrayList4 = new ArrayList();
        Object[] objArr135 = {objArr8};
        Object objEZpvd42 = YY.EZpvd(494303840);
        if (objEZpvd42 == null) {
            objEZpvd42 = YY.EZpvd(948, 5, (char) 0, 425113372, false, "KWHzl", new Class[]{Object[].class});
        }
        arrayList4.add(((Method) objEZpvd42).invoke(null, objArr135));
        Object[] objArr136 = {objArr8};
        Object objEZpvd43 = YY.EZpvd(-709912695);
        if (objEZpvd43 == null) {
            objEZpvd43 = YY.EZpvd(948, 5, (char) 0, -779134219, false, "AEQbTJ", new Class[]{Object[].class});
        }
        arrayList4.add(((Method) objEZpvd43).invoke(null, objArr136));
        Object[] objArr137 = {Long.valueOf(((long) (i200 ^ i201)) ^ (((long) (-704911270)) << 32)), Long.valueOf(-704911278)};
        short s4 = (short) ($$e | 104);
        byte[] bArr7 = $$d;
        Object[] objArr138 = new Object[1];
        c(s4, bArr7[175], bArr7[91], objArr138);
        Class<?> cls18 = Class.forName((String) objArr138[0]);
        Object[] objArr139 = new Object[1];
        c((short) CipherSuite.TLS_RSA_PSK_WITH_AES_128_CBC_SHA, (byte) 124, bArr7[41], objArr139);
        cls18.getMethod((String) objArr139[0], Long.TYPE, Long.TYPE).invoke(null, objArr137);
        int i207 = ((int[]) objArr8[0])[0];
        Object[] objArr140 = {new int[1], (List) objArr8[1], new int[]{((int[]) objArr8[2])[0]}, new int[]{((int[]) objArr8[3])[0]}, (List) objArr8[4]};
        int iNextInt = new Random().nextInt(290890732);
        int i208 = i207 + 1948992195 + (((~((-752132184) | iNextInt)) | 522742356) * (-366)) + (((~(iNextInt | (-550797316))) | 321407488) * 366);
        int i209 = (i208 << 13) ^ i208;
        int i210 = i209 ^ (i209 >>> 17);
        ((int[]) objArr140[0])[0] = i210 ^ (i210 << 5);
    }

    @Override // o.AbstractActivityC33041mov
    public String getTAG() {
        int i = 2 % 2;
        int i2 = zLjUOn;
        int i3 = i2 + 11;
        AuCTelauCTel = i3 % 128;
        int i4 = i3 % 2;
        String str = this.AhwBna;
        int i5 = i2 + 5;
        AuCTelauCTel = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001d, code lost:
    
        if (r4.fJNWhG == false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x001f, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0018, code lost:
    
        if (r4.fJNWhG == false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean isConnected() {
        int i = 2 % 2;
        if (this.AuCTel) {
            int i2 = zLjUOn + 103;
            AuCTelauCTel = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 56 / 0;
            }
        }
        int i4 = AuCTelauCTel + 79;
        zLjUOn = i4 % 128;
        int i5 = i4 % 2;
        return false;
    }

    @Override // o.AbstractActivityC33041mov, o.InterfaceC33507mxk
    public boolean needChangeUpDownColor() {
        int i = 2 % 2;
        int i2 = zLjUOn;
        int i3 = i2 + 99;
        AuCTelauCTel = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 85;
        AuCTelauCTel = i5 % 128;
        if (i5 % 2 == 0) {
            return false;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.AbstractActivityC33041mov
    public void setTAG(@NotNull String str) {
        int i = 2 % 2;
        int i2 = zLjUOn + 35;
        AuCTelauCTel = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        this.AhwBna = str;
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static void uzCIH() {
        AubY = new char[]{20285, 20330, 20324, 20326, 20349, 20321, 20331, 20292, 20291, 20348, 20317, 20301, 20331, 20347, 20350, 20321, 20324, 20309, 20314, 20320, 20324, 20330, 20287, 20325, 20331, 20325, 20348, 20321, 20329, 20310, 20310, 20334, 20331, 20349, 20323, 20326, 20324, 20307, 20410, 20405, 20406, 20374, 20380, 20410, 20426, 20425, 20400, 20407, 20401, 20411, 20401, 20401, 20373, 20311, 20412, 20386, 20409, 20401, 20404, 20404, 20428, 20390, 20370, 20408, 20405, 20397, 20393, 20409, 20386, 20351, 20463, 20462, 20454, 20448, 20435, 20459, 20475, 20451, 20450, 20450, 20451, 20454, 20447, 20410, 20418, 20477, 20453, 20426, 20420, 20459, 20449, 20477, 20454, 20452, 20458, 20298, 20392, 20400, 20406, 20410, 20414, 20386, 20410, 20406, 20404, 20406, 20408, 20404, 20429, 20402, 20405, 20411, 20403, 20246, 20282, 20289, 20288, 20282, 20283, 20280, 20283, 20291, 20291, 20290, 20288, 20294, 20295, 20288, 20294, 20286, 20277, 20288, 20332, 20292, 20281, 20280, 20281, 20286, 20281, 20283, 20295, 20292, 20292, 20334, 20294, 20280, 20282, 20286, 20295, 20295, 20284, 20295, 20335, 20292, 20287, 20294, 20334, 20295, 20295, 20335, 20288, 20290, 20331, 20329, 20334, 20335, 20289, 20281, 20292, 20335, 20335, 20289, 20280, 20286, 20285, 20295, 20290};
    }

    @Override // o.AbstractActivityC33268mtJ, o.AbstractActivityC33008moO, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        int i = 2 % 2;
        int i2 = zLjUOn + 107;
        AuCTelauCTel = i2 % 128;
        int i3 = i2 % 2;
        super.attachBaseContext(context);
        int i4 = AuCTelauCTel + 65;
        zLjUOn = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    @Override // o.AbstractActivityC33268mtJ, o.AbstractActivityC33008moO, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        int i = 2 % 2;
        int i2 = AuCTelauCTel + 117;
        zLjUOn = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        if (i3 == 0) {
            throw null;
        }
        int i4 = zLjUOn + 1;
        AuCTelauCTel = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 95 / 0;
        }
    }

    @Override // o.AbstractActivityC33268mtJ, o.AbstractActivityC33008moO, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        int i = 2 % 2;
        int i2 = AuCTelauCTel + 7;
        zLjUOn = i2 % 128;
        int i3 = i2 % 2;
        super.onResume();
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean OLrzqt(String str, boolean z) {
        Object[] objArr = {this, str, Boolean.valueOf(z)};
        int iEZpvd = C10749buN.EZpvd();
        return ((Boolean) EZpvd(C10749buN.EZpvd(), 2016856839, iEZpvd, -2016856838, objArr, C10749buN.EZpvd(), C10749buN.EZpvd())).booleanValue();
    }

    public final void ejfBZ() {
        int iEZpvd = C10749buN.EZpvd();
        EZpvd(C10749buN.EZpvd(), 1486116115, iEZpvd, -1486116115, new Object[]{this}, C10749buN.EZpvd(), C10749buN.EZpvd());
    }

    public final void AEQbTJ(Intent intent, String str) {
        int iEZpvd = C10749buN.EZpvd();
        EZpvd(C10749buN.EZpvd(), 548335275, iEZpvd, -548335273, new Object[]{this, intent, str}, C10749buN.EZpvd(), C17477fGu.AEQbTJ());
    }

    public final List<InterfaceC33338mua> AkhnZx() {
        int iEZpvd = C10749buN.EZpvd();
        return (List) EZpvd(C10749buN.EZpvd(), 178187505, iEZpvd, -178187501, new Object[]{this}, C10749buN.EZpvd(), C10749buN.EZpvd());
    }

    public final C33269mtK djBIcL() {
        int iAEQbTJ = C17477fGu.AEQbTJ();
        return (C33269mtK) EZpvd(C10749buN.EZpvd(), 1595173864, iAEQbTJ, -1595173861, new Object[]{this}, C17477fGu.AEQbTJ(), C17477fGu.AEQbTJ());
    }
}
