package com.okinc.business.defi.wallet;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.media.AudioManager;
import android.net.Uri;
import android.os.BadParcelableException;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.os.SystemClock;
import android.provider.Settings;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Toast;
import androidx.activity.OnBackPressedCallback;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.OnBackPressedDispatcherKt;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.Insets;
import androidx.core.os.BundleKt;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentContainerView;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.bytedance.applog.encryptor.IEncryptorType;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.gms.common.Scopes;
import com.google.android.gms.internal.fido.zzep;
import com.google.android.material.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.ClassLoaderChecker;
import com.google.android.material.navigation.NavigationBarItemView;
import com.google.android.material.navigation.NavigationBarView;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import com.okinc.business.appupdate.api.AppUpdateService;
import com.okinc.business.defi.api.bean.VerifyDAppDomainUrlResponse;
import com.okinc.business.defi.biz.constant.WalletStatus;
import com.okinc.business.defi.biz.constant.WalletType;
import com.okinc.business.defi.biz.core.error.WalletImportError;
import com.okinc.business.defi.biz.core.ws.channel.WalletTxStatusSubManager;
import com.okinc.business.defi.biz.model.ChainAddress;
import com.okinc.business.defi.biz.rpc.RPCManager;
import com.okinc.business.defi.biz.walletconnect.ShowWCAuthRequestArgs;
import com.okinc.business.defi.biz.walletconnect.WCSessionMeta;
import com.okinc.business.defi.common.utils.ReferralManager;
import com.okinc.business.defi.wallet.DefiWalletMainActivity;
import com.okinc.business.defi.wallet.common.WalletConnectUtils;
import com.okinc.business.defi.wallet.home.WalletStateChecker;
import com.okinc.business.defi.wallet.home.WcConnectExtra;
import com.okinc.business.defi.wallet.home.viewmodel.DefiHomeContainerViewModel;
import com.okinc.business.defi.wallet.mine.search.data.model.WalletSearchRequest;
import com.okinc.components.track.ABTestManager;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.amplitude.AmplitudeName;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.core.util.SPUtils;
import com.okinc.kyc.api.biz.restriction.FeatureRestrictionInfo;
import com.okinc.kyc.api.biz.restriction.OKComplianceRestrictionService;
import com.okinc.network.okg.cor.SubdomainStrategy;
import com.okinc.network.okg.response.OKServerException;
import com.okinc.p2p.api.OtcExtraKeys;
import com.okinc.rxutils.RxBus;
import com.okinc.rxutils.SubHelper;
import com.okinc.trade.experience.view.UDOKMarketReferralView;
import com.okinc.wallet.api.MpcWalletService;
import com.okinc.wallet.api.WalletCefiBindingService;
import com.okinc.wallet.widget.dialog.DefiWalletVReminderDFragment;
import com.okinc.web.WebActivity;
import com.okinc.web.bean.WebShareInfo;
import com.okinc.web.web.IWebActivityAPI;
import com.reown.android.Core;
import com.reown.android.CoreClient;
import com.reown.android.CoreInterface;
import com.reown.android.relay.ConnectionType;
import com.reown.android.relay.NetworkClientTimeout;
import com.reown.android.relay.RelayConnectionInterface;
import com.reown.walletkit.client.Wallet;
import com.reown.walletkit.client.WalletKit;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.function.BiConsumer;
import kotlin.Pair;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt__StringNumberConversionsKt;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.rx2.RxAwaitKt;
import o.AbstractActivityC13756dXc;
import o.AbstractActivityC33041mov;
import o.AbstractC12782ctV;
import o.AbstractC12784ctX;
import o.AbstractC43419rot;
import o.AbstractC58185ywX;
import o.AbstractC58260yxt;
import o.ActivityC10049bhC;
import o.ActivityC15218eAe;
import o.ActivityC15273eCf;
import o.ActivityC16169eep;
import o.ActivityC16285egz;
import o.ActivityC17216eyc;
import o.ActivityC17337fBp;
import o.ActivityC17352fCd;
import o.ActivityC17837fUc;
import o.ActivityC18241feg;
import o.ActivityC18321fgG;
import o.ActivityC18484fjK;
import o.ActivityC18493fjT;
import o.ActivityC18691fnF;
import o.ActivityC18750foL;
import o.C10856bwO;
import o.C11205cFp;
import o.C11607cUn;
import o.C12779ctS;
import o.C12806ctt;
import o.C12827cuN;
import o.C13021cxw;
import o.C13023cxy;
import o.C13754dXa;
import o.C13912dbY;
import o.C13934dbu;
import o.C13982dcp;
import o.C14319djH;
import o.C14320djI;
import o.C14325djN;
import o.C14326djO;
import o.C14390dkZ;
import o.C14445dlb;
import o.C14449dlf;
import o.C14557dnh;
import o.C14564dno;
import o.C14565dnp;
import o.C14616don;
import o.C15572eNh;
import o.C15714eSo;
import o.C15733eTg;
import o.C15935eaT;
import o.C16058eck;
import o.C16158eee;
import o.C16325ehm;
import o.C17114ewg;
import o.C17351fCc;
import o.C17922fXg;
import o.C18061fbL;
import o.C18158fdC;
import o.C18170fdO;
import o.C18199fdr;
import o.C18285ffX;
import o.C18343fgc;
import o.C18351fgk;
import o.C18943fru;
import o.C19595gIe;
import o.C19629gJl;
import o.C19665gKu;
import o.C21027grx;
import o.C21113gtd;
import o.C21118gti;
import o.C32805mkX;
import o.C32866mlf;
import o.C32979mnm;
import o.C33069mpW;
import o.C33070mpX;
import o.C33084mpl;
import o.C33129mqd;
import o.C33238msg;
import o.C33492mxV;
import o.C34703nhO;
import o.C34717nhc;
import o.C35202nqq;
import o.C43251rlk;
import o.C43386roM;
import o.C52761wXj;
import o.C54819xWm;
import o.C54827xWu;
import o.C55113xdn;
import o.C55298xhM;
import o.C55326xho;
import o.C55328xhq;
import o.C56390yDp;
import o.C56391yDq;
import o.C56392yDr;
import o.C56403yEb;
import o.C56423yEv;
import o.C56442yFn;
import o.C56443yFo;
import o.C56524yIo;
import o.C57309yfw;
import o.C58156yvv;
import o.C58266yxz;
import o.C59449zhJ;
import o.C6777aVl;
import o.C8347bAx;
import o.C8561bEz;
import o.C9768bbn;
import o.InterfaceC13426dKx;
import o.InterfaceC14563dnn;
import o.InterfaceC15734eTh;
import o.InterfaceC18198fdq;
import o.InterfaceC18204fdw;
import o.InterfaceC32807mkZ;
import o.InterfaceC33171mrS;
import o.InterfaceC35204nqs;
import o.InterfaceC35205nqt;
import o.InterfaceC56387yDm;
import o.InterfaceC56388yDn;
import o.InterfaceC56514yIe;
import o.InterfaceC56551yJo;
import o.InterfaceC58217yxC;
import o.InterfaceC58223yxI;
import o.InterfaceC58227yxM;
import o.InterfaceC58229yxO;
import o.InterfaceC58239yxY;
import o.InterfaceC58261yxu;
import o.InterfaceC8106awV;
import o.InterfaceC9765bbk;
import o.InterfaceC9769bbo;
import o.InterfaceC9770bbp;
import o.InterfaceC9771bbq;
import o.InterfaceC9772bbr;
import o.InterfaceC9773bbs;
import o.InterfaceC9774bbt;
import o.InterfaceC9851bdQ;
import o.ViewOnClickListenerC20941gqQ;
import o.YY;
import o.Ze;
import o.dTI;
import o.dTK;
import o.dTQ;
import o.eAZ;
import o.eCS;
import o.eEY;
import o.eGQ;
import o.eUI;
import o.eVQ;
import o.gKO;
import o.pHH;
import o.pUU;
import o.rVN;
import o.xWN;
import o.xWP;
import o.xWR;
import o.xXA;
import o.xXG;
import o.xXH;
import o.xXJ;
import o.xXO;
import o.xXQ;
import o.xXT;
import o.xZF;
import o.xZT;
import o.yBI;
import o.yBP;
import o.yDY;
import o.yET;
import o.yHO;
import okio.Utf8;
import org.jetbrains.annotations.NotNull;
import org.luaj.vm2.LuaValue;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: loaded from: classes4.dex */
public final class DefiWalletMainActivity extends AbstractActivityC13756dXc implements WalletConnectUtils.StateListAnimator, InterfaceC35205nqt, InterfaceC35204nqs, InterfaceC15734eTh {
    public static final StateListAnimator Companion;
    public static boolean EZpvd;
    public static final int KWHzl;
    public static int OLrzqt;
    private static char[] QfsBiF;
    private static int RcXXUw;
    private static boolean UeEOUB;
    private static boolean djSkpj;
    private static int dxcTrN;
    public int AhwBna;
    public final ActivityResultLauncher<Context> AkhnZx;
    public boolean AwvSrB;
    public final InterfaceC56387yDm DTwDnp;
    public final LoaderManager DbNXlk;
    public final ActivityResultLauncher<C21118gti.Application> ORxRYg;
    public yHO<? super AbstractActivityC33041mov, ? super IWebActivityAPI, ? super WebShareInfo, Unit> OcIXYQ;
    public final InterfaceC56387yDm QOLQEE;
    public final InterfaceC14563dnn copydefault;
    public C18199fdr djBIcL;
    public final InterfaceC56387yDm ejfBZ;
    public boolean fARcdN;
    public boolean fJNWhG;
    public final PictureInPictureParams gHZMYf;
    public final ActivityResultLauncher<Context> getNewProxyInstance;
    public Long hDKMBd;
    public final InterfaceC56387yDm isConnected;
    public String sSMYrx;
    public boolean uzCIH;
    public final Runnable valueOf;
    public InterfaceC58217yxC values;
    public C16325ehm zLjUOn;
    public boolean zuBGHE;
    private static final byte[] $$c = {Ascii.DC2, 102, 73, -44};
    private static final int $$f = 254;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {65, -118, 1, 100, -66, 75, -47, 7, 3, Ascii.VT, 16, -15, -11, Ascii.VT, -3, -64, SignedBytes.MAX_POWER_OF_TWO, -5, -3, 4, -12, -54, 60, 0, -4, 4, -10, -56, 70, -2, -12, 2, -63, Ascii.RS, 19, 16, -8, -7, Ascii.SO, -31, Ascii.DC2, -5, 17, -43, 33, -12, 0, 6, -34, 40, -81, 75, -16, 16, -14, 8, 5, -31, Ascii.DC2, -5, 17, -43, 33, -12, 0, 6, 6, -80, -1, 68, 4, -3, -4, 4, -10, -2, -65, 81, -14, -5, 17, -43, 33, -12, 0, 6, 6, -80, Utf8.REPLACEMENT_BYTE, 0, 0, -6, 19, -10, 7, -81, Ascii.FF, Ascii.VT, -16, 49, -15, -66, 52, -33, 6, Ascii.VT, 0, 8, -22, 0, 0, -6, 19, -10, 7, -66, 71, 0, -3, -4, 37, 7, -10, 2, -66, 60, 10, -18, -66, 56, Ascii.CR, -9, Ascii.DC4, Ascii.NAK, 5, -19, -66, 55, 6, -13, -66, 68, 0, -13, -66, 56, -33, 4, -66, 55, 3, -23, -49, 33, 43, -18, 5, 5, -9, 8, 5, -40, 19, Ascii.FF, -14, 5, -3, Ascii.FF, -66, 55, Ascii.SO, -52, Ascii.VT, -3, -64, SignedBytes.MAX_POWER_OF_TWO, -5, -3, 4, -12, -54, SignedBytes.MAX_POWER_OF_TWO, -5, -7, Ascii.DC2, -75, 52, 1, 8, 5, -16, Ascii.FF, -69, 70, -13, -60, 55, Ascii.VT, -18, 5, 5, -9, 8, 5, -71, Ascii.US, Ascii.SYN, Ascii.SO, 2, -9, 2, -8, -42, 44, 4, -1, -6, -3, -27, Ascii.DC4, -4, -1, Ascii.SO, -47, 43, -18, 5, 5, -9, 8, 5, -81, 78, -4, -12, -3, 5, -9, 10, -73, -1, 68, 4, -3, -4, 4, -10, -2, -65, 60, 1, 16, -12, Ascii.FF, -14, 10, 4, -36, Ascii.DC2, -5, 17, -43, 33, -12, 0, 6, 6, -80, Utf8.REPLACEMENT_BYTE, 0, 0, -6, 19, -10, 7, -81, Ascii.FF, Ascii.VT, -3, -64, 56, 7, -1, -9, 4, -8, -56, 50, Ascii.FF, -11, Ascii.CR, -4, -7, -6, -55, 56, 5, 5, -70, 50, 19, -2, -13, -59, 50, Ascii.SO, -8, -60, 50, 1, -1, Ascii.VT, 5, -8, 5, -1, -3, -18, Ascii.FF, 4, -14, -2, Ascii.FF, -69, 75, -1, -10, Ascii.VT, -3, -64, SignedBytes.MAX_POWER_OF_TWO, -5, -3, 4, -12, -54, 61, 2, -13, -3, 10, -4, 16, -26, Ascii.DC2, -12, 5, -2, -61, -5, 51, 2, -5, Ascii.FF, -65, Ascii.GS, 3, -13, 42, 7, -10, -3, 2, -15, 2, -19, Ascii.DC2, Ascii.CR, 1, -10, 7, -81, Ascii.FS, 33, 16, -12, Ascii.FF, -14, 10, 4};
    private static final int $$e = 83;
    private static final byte[] $$a = {98, Ascii.NAK, Ascii.DC4, -67, 5, Ascii.CR, Ascii.DC2, -13, -9, Ascii.SYN, Ascii.ETB, 7, -17, -2, 39, 9, -8, 4, Ascii.CR, -14, 51, -13, 7, -39, 8, Ascii.ESC, -22, 40, 16, -52, 45, -12, Ascii.CR, 2, 10, -20, 2, 2, -4, Ascii.NAK, -8, 9, -20, Ascii.FF, 10, -15, -21, Ascii.CAN};
    private static final int $$b = CipherSuite.TLS_DH_DSS_WITH_CAMELLIA_128_CBC_SHA256;
    private static int fFgQHt = 0;
    private static int dNCPSb = 0;
    private static int aKErDB = 1;
    public final /* synthetic */ C15733eTg AEQbTJ = new C15733eTg();
    public int AYXKKw = -1;
    public final Map<MenuItem, Integer> AuCTel = new LinkedHashMap();
    public final Object getFieldNames = new Object();
    public final InterfaceC56387yDm wlaJM = C56392yDr.copydefault(new Function0() { // from class: o.dWm
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return DefiWalletMainActivity.KWHzl();
        }
    });
    public final InterfaceC56387yDm gEmmrt = C56392yDr.copydefault(new Function0() { // from class: o.dWs
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return (InterfaceC9771bbq) DefiWalletMainActivity.copydefault(zzep.AEQbTJ(), 512713750, -512713679, new java.lang.Object[0], zzep.AEQbTJ(), zzep.AEQbTJ(), zzep.AEQbTJ());
        }
    });
    public final InterfaceC56387yDm zsXlph = C56392yDr.copydefault(new Function0() { // from class: o.dWu
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return DefiWalletMainActivity.OLrzqt();
        }
    });
    public final InterfaceC56387yDm AubY = C56392yDr.copydefault(new Function0() { // from class: o.dWA
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return DefiWalletMainActivity.AEQbTJ();
        }
    });
    public final InterfaceC56387yDm AuCTelauCTel = C56392yDr.copydefault(new Function0() { // from class: o.dWw
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return DefiWalletMainActivity.djBIcL();
        }
    });
    public final InterfaceC56387yDm iwGUEr = C56392yDr.copydefault(new Function0() { // from class: o.dWy
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return (java.util.List) DefiWalletMainActivity.copydefault(zzep.AEQbTJ(), 994656632, -994656630, new java.lang.Object[0], zzep.AEQbTJ(), zzep.AEQbTJ(), zzep.AEQbTJ());
        }
    });
    public final InterfaceC56387yDm fIwbmz = C56392yDr.copydefault(new Function0() { // from class: o.dWz
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return DefiWalletMainActivity.AYXKKw();
        }
    });
    public final Handler fetchVPNInfo = new Handler(Looper.getMainLooper());
    public final InterfaceC56387yDm QKVWgx = C56392yDr.copydefault(new Function0() { // from class: o.dWB
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return DefiWalletMainActivity.gEmmrt(this.AEQbTJ);
        }
    });
    public final InterfaceC56387yDm AxsJAY = C56392yDr.copydefault(new Function0() { // from class: o.dWE
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return DefiWalletMainActivity.AubY(this.KWHzl);
        }
    });

    public interface Application {
        void KWHzl(@NotNull String str);
    }

    public static final /* synthetic */ class SharedElementCallback implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public SharedElementCallback(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.AEQbTJ = function1;
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
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.AEQbTJ.invoke(obj);
        }
    }

    public final /* synthetic */ class TaskDescription {
        public static final /* synthetic */ int[] copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[WalletStateChecker.WalletState.values().length];
            try {
                iArr[WalletStateChecker.WalletState.ONBOARDING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[WalletStateChecker.WalletState.NORMAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[WalletStateChecker.WalletState.NOT_BACKED_UP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[WalletStateChecker.WalletState.ZERO_ASSETS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            copydefault = iArr;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$g(int i, byte b, short s) {
        int i2;
        int i3 = 101 - (b * 2);
        byte[] bArr = $$c;
        int i4 = s * 3;
        int i5 = 3 - (i * 2);
        byte[] bArr2 = new byte[i4 + 1];
        if (bArr == null) {
            int i6 = i3;
            int i7 = 0;
            int i8 = i5;
            int i9 = (-i5) + i6;
            i2 = i7;
            int i10 = i8;
            i3 = i9;
            i5 = i10;
            int i11 = i5 + 1;
            bArr2[i2] = (byte) i3;
            i7 = i2 + 1;
            if (i2 == i4) {
                return new String(bArr2, 0);
            }
            int i12 = i3;
            i8 = i11;
            i5 = bArr[i11];
            i6 = i12;
            int i92 = (-i5) + i6;
            i2 = i7;
            int i102 = i8;
            i3 = i92;
            i5 = i102;
            int i112 = i5 + 1;
            bArr2[i2] = (byte) i3;
            i7 = i2 + 1;
            if (i2 == i4) {
            }
        } else {
            i2 = 0;
            int i1122 = i5 + 1;
            bArr2[i2] = (byte) i3;
            i7 = i2 + 1;
            if (i2 == i4) {
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(byte b, byte b2, byte b3, Object[] objArr) {
        int i;
        int i2 = 118 - b3;
        int i3 = b + 4;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[b2 + 5];
        int i4 = b2 + 4;
        if (bArr == 0) {
            int i5 = i3;
            int i6 = i4;
            int i7 = 0;
            int i8 = (i3 + i6) - 1;
            i = i7;
            int i9 = i5;
            i2 = i8;
            i3 = i9;
            int i10 = i3 + 1;
            bArr2[i] = (byte) i2;
            i7 = i + 1;
            if (i == i4) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            i6 = bArr[i10];
            int i11 = i2;
            i5 = i10;
            i3 = i11;
            int i82 = (i3 + i6) - 1;
            i = i7;
            int i92 = i5;
            i2 = i82;
            i3 = i92;
            int i102 = i3 + 1;
            bArr2[i] = (byte) i2;
            i7 = i + 1;
            if (i == i4) {
            }
        } else {
            i = 0;
            int i1022 = i3 + 1;
            bArr2[i] = (byte) i2;
            i7 = i + 1;
            if (i == i4) {
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void c(int i, short s, int i2, Object[] objArr) {
        int i3;
        int i4 = 111 - (s * 2);
        byte[] bArr = $$d;
        int i5 = i2 + 4;
        byte[] bArr2 = new byte[106 - i];
        int i6 = 105 - i;
        if (bArr == null) {
            int i7 = i6;
            int i8 = i5;
            i3 = 0;
            int i9 = i5 + i7 + 1;
            i5 = i8;
            i4 = i9;
            bArr2[i3] = (byte) i4;
            int i10 = i5 + 1;
            if (i3 == i6) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            i3++;
            i7 = bArr[i10];
            i5 = i4;
            i8 = i10;
            int i92 = i5 + i7 + 1;
            i5 = i8;
            i4 = i92;
            bArr2[i3] = (byte) i4;
            int i102 = i5 + 1;
            if (i3 == i6) {
            }
        } else {
            i3 = 0;
            bArr2[i3] = (byte) i4;
            int i1022 = i5 + 1;
            if (i3 == i6) {
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01fa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ Object copydefault(int i, int i2, int i3, Object[] objArr, int i4, int i5, int i6) throws Throwable {
        C21027grx c21027grx;
        androidx.fragment.app.FragmentManager supportFragmentManager;
        ActivityResultLauncher<C21118gti.Application> activityResultLauncher;
        String strDbNXlk;
        boolean z;
        Object pair;
        DefiWalletMainActivity$verifyOpenUrl$1 defiWalletMainActivity$verifyOpenUrl$1;
        String str;
        int i7 = ~i2;
        int i8 = i7 | i3;
        int i9 = ~i8;
        int i10 = ~i;
        int i11 = i9 | (~(i10 | i3));
        int i12 = i8 | i10;
        int i13 = (~(i | i3)) | (~(i7 | (~i3)));
        int i14 = i3 + i2 + i5 + ((-1311665080) * i6) + (1761575915 * i4);
        int i15 = i14 * i14;
        int i16 = ((-2073022045) * i3) + 412680192 + (1917570655 * i2) + (i11 * (-1995296350)) + (1995296350 * i12) + ((-1995296350) * i13) + ((-77725696) * i5) + (175112192 * i6) + ((-649461760) * i4) + (1783169024 * i15);
        int i17 = ((i3 * 1226044109) - 1701849991) + (i2 * 1226043089) + (i11 * TypedValues.PositionType.TYPE_POSITION_TYPE) + (i12 * (-510)) + (i13 * TypedValues.PositionType.TYPE_POSITION_TYPE) + (i5 * 1226043599) + (i6 * (-858626504)) + (i4 * 1069087493) + (i15 * 1627848704);
        switch (i16 + (i17 * i17 * 739704832)) {
            case 1:
                return copydefault(objArr);
            case 2:
                return EZpvd(objArr);
            case 3:
                return KWHzl(objArr);
            case 4:
                return AEQbTJ(objArr);
            case 5:
                return OLrzqt(objArr);
            case 6:
                return AYXKKw(objArr);
            case 7:
                return valueOf(objArr);
            case 8:
                return AhwBna(objArr);
            case 9:
                int i18 = 2 % 2;
                int i19 = dNCPSb + 69;
                aKErDB = i19 % 128;
                int i20 = i19 % 2;
                return null;
            case 10:
                Function1 function1 = (Function1) objArr[0];
                Object obj = objArr[1];
                int i21 = 2 % 2;
                int i22 = dNCPSb + 59;
                aKErDB = i22 % 128;
                int i23 = i22 % 2;
                copydefault(zzep.AEQbTJ(), 717357818, -717357813, new Object[]{function1, obj}, zzep.AEQbTJ(), zzep.AEQbTJ(), zzep.AEQbTJ());
                int i24 = dNCPSb + 77;
                aKErDB = i24 % 128;
                int i25 = i24 % 2;
                return null;
            case 11:
                return gEmmrt(objArr);
            case 12:
                return djBIcL(objArr);
            case 13:
                return DbNXlk(objArr);
            case 14:
                return isConnected(objArr);
            case 15:
                return values(objArr);
            case 16:
                return AkhnZx(objArr);
            case 17:
                DefiWalletMainActivity defiWalletMainActivity = (DefiWalletMainActivity) objArr[0];
                int i26 = 2 % 2;
                int i27 = dNCPSb + 5;
                aKErDB = i27 % 128;
                int i28 = i27 % 2;
                ActivityC16169eep.Companion.AEQbTJ(defiWalletMainActivity);
                Unit unit = Unit.INSTANCE;
                int i29 = aKErDB + 119;
                dNCPSb = i29 % 128;
                int i30 = i29 % 2;
                return unit;
            case 18:
                return fetchVPNInfo(objArr);
            case 19:
                return AuCTel(objArr);
            case 20:
                return fARcdN(objArr);
            case 21:
                Function1 function12 = (Function1) objArr[0];
                Object obj2 = objArr[1];
                int i31 = 2 % 2;
                int i32 = dNCPSb + 3;
                aKErDB = i32 % 128;
                int i33 = i32 % 2;
                QbewEr(function12, obj2);
                int i34 = aKErDB + 57;
                dNCPSb = i34 % 128;
                int i35 = i34 % 2;
                return null;
            case 22:
                return fIwbmz(objArr);
            case 23:
                return fJNWhG(objArr);
            case 24:
                return ejfBZ(objArr);
            case 25:
                return iwGUEr(objArr);
            case 26:
                return hDKMBd(objArr);
            case 27:
                return getFieldNames(objArr);
            case 28:
                View view = (View) objArr[0];
                int i36 = 2 % 2;
                int i37 = aKErDB + 49;
                dNCPSb = i37 % 128;
                int i38 = i37 % 2;
                boolean zEZpvd = EZpvd(view);
                int i39 = aKErDB + 69;
                dNCPSb = i39 % 128;
                int i40 = i39 % 2;
                return Boolean.valueOf(zEZpvd);
            case 29:
                final DefiWalletMainActivity defiWalletMainActivity2 = (DefiWalletMainActivity) objArr[0];
                int i41 = 2 % 2;
                defiWalletMainActivity2.KWHzl(C18158fdC.Companion.OLrzqt());
                AbstractC58260yxt<AbstractC12782ctV> abstractC58260yxtCopydefault = C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null).copydefault(false);
                final Function1 function13 = new Function1() { // from class: o.dTS
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj3) {
                        java.lang.Object[] objArr2 = {this.EZpvd, (AbstractC12782ctV) obj3};
                        return (Unit) DefiWalletMainActivity.copydefault(zzep.AEQbTJ(), -539368594, 539368638, objArr2, zzep.AEQbTJ(), zzep.AEQbTJ(), zzep.AEQbTJ());
                    }
                };
                InterfaceC58227yxM<? super AbstractC12782ctV> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.dTT
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.InterfaceC58227yxM
                    public final void accept(java.lang.Object obj3) {
                        DefiWalletMainActivity.wlaJM(function13, obj3);
                    }
                };
                final Function1 function14 = new Function1() { // from class: o.dVj
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj3) {
                        return (Unit) DefiWalletMainActivity.copydefault(zzep.AEQbTJ(), 1727835988, -1727835972, new java.lang.Object[]{(java.lang.Throwable) obj3}, zzep.AEQbTJ(), zzep.AEQbTJ(), zzep.AEQbTJ());
                    }
                };
                defiWalletMainActivity2.addDisposable(abstractC58260yxtCopydefault.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.dVu
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.InterfaceC58227yxM
                    public final void accept(java.lang.Object obj3) throws java.lang.Throwable {
                        DefiWalletMainActivity.fetchVPNInfo(function14, obj3);
                    }
                }));
                Unit unit2 = Unit.INSTANCE;
                int i42 = dNCPSb + 39;
                aKErDB = i42 % 128;
                int i43 = i42 % 2;
                return unit2;
            case 30:
                return uzCIH(objArr);
            case 31:
                return getNewProxyInstance(objArr);
            case 32:
                return AuCTelauCTel(objArr);
            case 33:
                return zLjUOn(objArr);
            case 34:
                return wlaJM(objArr);
            case 35:
                return AubY(objArr);
            case 36:
                return zsXlph(objArr);
            case 37:
                return sSMYrx(objArr);
            case 38:
                return AxsJAY(objArr);
            case 39:
                return gHZMYf(objArr);
            case 40:
                return AwvSrB(objArr);
            case 41:
                return zuBGHE(objArr);
            case 42:
                return OcIXYQ(objArr);
            case 43:
                return DTwDnp(objArr);
            case 44:
                return ORxRYg(objArr);
            case 45:
                return QKVWgx(objArr);
            case 46:
                return QOLQEE(objArr);
            case 47:
                return QVAiDq(objArr);
            case 48:
                return RJOkX(objArr);
            case 49:
                return QfsBiF(objArr);
            case 50:
                DefiWalletMainActivity defiWalletMainActivity3 = (DefiWalletMainActivity) objArr[0];
                AbstractC12782ctV abstractC12782ctV = (AbstractC12782ctV) objArr[1];
                int i44 = 2 % 2;
                int i45 = aKErDB + 81;
                dNCPSb = i45 % 128;
                int i46 = i45 % 2;
                Intrinsics.copydefault(abstractC12782ctV);
                defiWalletMainActivity3.OLrzqt(abstractC12782ctV);
                Unit unit3 = Unit.INSTANCE;
                int i47 = dNCPSb + 37;
                aKErDB = i47 % 128;
                int i48 = i47 % 2;
                return unit3;
            case 51:
                DefiWalletMainActivity defiWalletMainActivity4 = (DefiWalletMainActivity) objArr[0];
                boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
                AbstractC12782ctV abstractC12782ctV2 = (AbstractC12782ctV) objArr[2];
                int i49 = 2 % 2;
                int i50 = aKErDB + 39;
                dNCPSb = i50 % 128;
                if (i50 % 2 != 0) {
                    c21027grx = C21027grx.copydefault;
                    supportFragmentManager = defiWalletMainActivity4.getSupportFragmentManager();
                    Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
                    activityResultLauncher = defiWalletMainActivity4.ORxRYg;
                    strDbNXlk = abstractC12782ctV2.DbNXlk();
                    z = false;
                } else {
                    c21027grx = C21027grx.copydefault;
                    supportFragmentManager = defiWalletMainActivity4.getSupportFragmentManager();
                    Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
                    activityResultLauncher = defiWalletMainActivity4.ORxRYg;
                    strDbNXlk = abstractC12782ctV2.DbNXlk();
                    z = true;
                }
                c21027grx.EZpvd(supportFragmentManager, defiWalletMainActivity4, activityResultLauncher, strDbNXlk, z, zBooleanValue);
                pair = Unit.INSTANCE;
                break;
            case 52:
                return QUSxYX(objArr);
            case 53:
                DefiWalletMainActivity defiWalletMainActivity5 = (DefiWalletMainActivity) objArr[0];
                Function0 function0 = (Function0) objArr[1];
                int i51 = 2 % 2;
                int i52 = aKErDB + 9;
                dNCPSb = i52 % 128;
                if (i52 % 2 != 0) {
                    C12779ctS.KWHzl.copydefault(false);
                    C10856bwO.copydefault(defiWalletMainActivity5.getTAG(), 1, "MPC wallet update success");
                } else {
                    C12779ctS.KWHzl.copydefault(true);
                    C10856bwO.copydefault(defiWalletMainActivity5.getTAG(), 0, "MPC wallet update success");
                }
                function0.invoke();
                pair = Unit.INSTANCE;
                break;
            case 54:
                DefiWalletMainActivity defiWalletMainActivity6 = (DefiWalletMainActivity) objArr[0];
                Bundle bundle = (Bundle) objArr[1];
                Continuation continuation = (Continuation) objArr[2];
                int i53 = 2 % 2;
                if (continuation instanceof DefiWalletMainActivity$verifyOpenUrl$1) {
                    int i54 = dNCPSb + 105;
                    aKErDB = i54 % 128;
                    int i55 = i54 % 2;
                    defiWalletMainActivity$verifyOpenUrl$1 = (DefiWalletMainActivity$verifyOpenUrl$1) continuation;
                    int i56 = defiWalletMainActivity$verifyOpenUrl$1.label;
                    if ((i56 & Integer.MIN_VALUE) != 0) {
                        defiWalletMainActivity$verifyOpenUrl$1.label = i56 - Integer.MIN_VALUE;
                    } else {
                        defiWalletMainActivity$verifyOpenUrl$1 = new DefiWalletMainActivity$verifyOpenUrl$1(defiWalletMainActivity6, continuation);
                    }
                }
                Object objFJNWhG = defiWalletMainActivity$verifyOpenUrl$1.result;
                Object objCopydefault = C56442yFn.copydefault();
                int i57 = defiWalletMainActivity$verifyOpenUrl$1.label;
                if (i57 != 0) {
                    int i58 = dNCPSb + 125;
                    aKErDB = i58 % 128;
                    if (i58 % 2 != 0 ? i57 != 1 : i57 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str = (String) defiWalletMainActivity$verifyOpenUrl$1.L$0;
                    C56391yDq.AEQbTJ(objFJNWhG);
                } else {
                    C56391yDq.AEQbTJ(objFJNWhG);
                    String string = bundle.getString("openUrl");
                    str = string != null ? string : "";
                    C13934dbu c13934dbuDTwDnp = InterfaceC13426dKx.TaskDescription.getInstance$default(InterfaceC13426dKx.Companion, null, 1, null).DTwDnp();
                    defiWalletMainActivity$verifyOpenUrl$1.L$0 = str;
                    defiWalletMainActivity$verifyOpenUrl$1.label = 1;
                    objFJNWhG = c13934dbuDTwDnp.fJNWhG(str, defiWalletMainActivity$verifyOpenUrl$1);
                    if (objFJNWhG == objCopydefault) {
                        return objCopydefault;
                    }
                }
                return new Pair(str, (AbstractC43419rot) objFJNWhG);
            case 55:
                return QbewEr(objArr);
            case 56:
                return dNCPSb(objArr);
            case 57:
                DefiWalletMainActivity defiWalletMainActivity7 = (DefiWalletMainActivity) objArr[0];
                Boolean bool = (Boolean) objArr[1];
                int i59 = 2 % 2;
                int i60 = aKErDB + 11;
                dNCPSb = i60 % 128;
                int i61 = i60 % 2;
                if (bool.booleanValue()) {
                    defiWalletMainActivity7.djBIcL(true);
                }
                int i62 = dNCPSb + 45;
                aKErDB = i62 % 128;
                int i63 = i62 % 2;
                return null;
            case 58:
                return RcXXUw(objArr);
            case 59:
                return aKErDB(objArr);
            case 60:
                Integer num = (Integer) objArr[0];
                AbstractC12782ctV abstractC12782ctV3 = (AbstractC12782ctV) objArr[1];
                int i64 = 2 % 2;
                Intrinsics.checkNotNullParameter(num, "");
                Intrinsics.checkNotNullParameter(abstractC12782ctV3, "");
                pair = new Pair(num, abstractC12782ctV3);
                int i65 = aKErDB + 35;
                dNCPSb = i65 % 128;
                int i66 = i65 % 2;
                break;
            case 61:
                return djSkpj(objArr);
            case 62:
                return UeEOUB(objArr);
            case 63:
                return fZBcTu(objArr);
            case 64:
                DefiWalletMainActivity defiWalletMainActivity8 = (DefiWalletMainActivity) objArr[0];
                Throwable th = (Throwable) objArr[1];
                int i67 = 2 % 2;
                pUU.copydefault(defiWalletMainActivity8.getTAG(), "error message = " + th.getMessage());
                Unit unit4 = Unit.INSTANCE;
                int i68 = dNCPSb + 45;
                aKErDB = i68 % 128;
                int i69 = i68 % 2;
                return unit4;
            case 65:
                DefiWalletMainActivity defiWalletMainActivity9 = (DefiWalletMainActivity) objArr[0];
                int i70 = 2 % 2;
                ((C18285ffX) copydefault(zzep.AEQbTJ(), 739293876, -739293856, new Object[]{defiWalletMainActivity9}, zzep.AEQbTJ(), zzep.AEQbTJ(), zzep.AEQbTJ())).OLrzqt().setValue(Integer.valueOf(C18158fdC.Companion.OLrzqt()));
                RxBus.AEQbTJ(new C14445dlb("collectibles"));
                Unit unit5 = Unit.INSTANCE;
                int i71 = aKErDB + 39;
                dNCPSb = i71 % 128;
                int i72 = i71 % 2;
                return unit5;
            case 66:
                return dvKsVJ(objArr);
            case 67:
                return dxcTrN(objArr);
            case 68:
                return finit(objArr);
            case 69:
                return fFgQHt(objArr);
            case 70:
                return fvQaOB(objArr);
            case 71:
                return gasjUx(objArr);
            case 72:
                return gGvvIC(objArr);
            case 73:
                return flVtFt(objArr);
            case 74:
                return giSNqX(objArr);
            case 75:
                return iRxXKY(objArr);
            case 76:
                return AxsJAYaxsJAY(objArr);
            case 77:
                return hUfVAv(objArr);
            case 78:
                return iZzfmt(objArr);
            default:
                String str2 = (String) objArr[0];
                ((Number) objArr[1]).intValue();
                int i73 = 2 % 2;
                RxBus.AEQbTJ(new C14445dlb(str2));
                Unit unit6 = Unit.INSTANCE;
                int i74 = aKErDB + 85;
                dNCPSb = i74 % 128;
                int i75 = i74 % 2;
                return unit6;
        }
        return pair;
    }

    public static final class AssistContent<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return yET.KWHzl(Integer.valueOf(((InterfaceC18198fdq) t).AYXKKw()), Integer.valueOf(((InterfaceC18198fdq) t2).AYXKKw()));
        }
    }

    public static final class VoiceInteractor<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return yET.KWHzl(Integer.valueOf(((InterfaceC18204fdw) t).AYXKKw()), Integer.valueOf(((InterfaceC18204fdw) t2).AYXKKw()));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [172=5] */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    private static void a(int[] iArr, int i, char[] cArr, byte[] bArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        Ze ze = new Ze();
        char[] cArr2 = QfsBiF;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            for (int i3 = 0; i3 < length; i3++) {
                int i4 = $11 + WalletImportError.ERROR_CODE_GET_EOA_ADDRESS_KEY;
                $10 = i4 % 128;
                int i5 = i4 % 2;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i3])};
                    Object objEZpvd = YY.EZpvd(-855574269);
                    if (objEZpvd == null) {
                        objEZpvd = YY.EZpvd(1075, 5, (char) 0, -920636289, false, IEncryptorType.DEFAULT_ENCRYPTOR, new Class[]{Integer.TYPE});
                    }
                    cArr3[i3] = ((Character) ((Method) objEZpvd).invoke(null, objArr2)).charValue();
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
        Object[] objArr3 = {Integer.valueOf(RcXXUw)};
        Object objEZpvd2 = YY.EZpvd(-1914793274);
        if (objEZpvd2 == null) {
            byte b = (byte) 0;
            byte b2 = (byte) (b + 1);
            objEZpvd2 = YY.EZpvd(496, 5, (char) 0, -1979818054, false, $$g(b, b2, (byte) (b2 - 1)), new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objEZpvd2).invoke(null, objArr3)).intValue();
        int i6 = -1317980492;
        if (!(!djSkpj)) {
            int i7 = $10 + 79;
            $11 = i7 % 128;
            int i8 = i7 % 2;
            ze.copydefault = bArr.length;
            char[] cArr4 = new char[ze.copydefault];
            ze.AEQbTJ = 0;
            while (ze.AEQbTJ < ze.copydefault) {
                cArr4[ze.AEQbTJ] = (char) (cArr2[bArr[(ze.copydefault - 1) - ze.AEQbTJ] + i] - iIntValue);
                Object[] objArr4 = {ze, ze};
                Object objEZpvd3 = YY.EZpvd(-1317980492);
                if (objEZpvd3 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = b3;
                    objEZpvd3 = YY.EZpvd(300, 21, (char) 0, -1252918328, false, $$g(b3, b4, b4), new Class[]{Object.class, Object.class});
                }
                ((Method) objEZpvd3).invoke(null, objArr4);
            }
            objArr[0] = new String(cArr4);
            return;
        }
        if (!UeEOUB) {
            ze.copydefault = iArr.length;
            char[] cArr5 = new char[ze.copydefault];
            ze.AEQbTJ = 0;
            while (ze.AEQbTJ < ze.copydefault) {
                cArr5[ze.AEQbTJ] = (char) (cArr2[iArr[(ze.copydefault - 1) - ze.AEQbTJ] - i] - iIntValue);
                ze.AEQbTJ++;
            }
            objArr[0] = new String(cArr5);
            return;
        }
        int i9 = $10 + 119;
        $11 = i9 % 128;
        int i10 = i9 % 2;
        ze.copydefault = cArr.length;
        char[] cArr6 = new char[ze.copydefault];
        ze.AEQbTJ = 0;
        while (ze.AEQbTJ < ze.copydefault) {
            cArr6[ze.AEQbTJ] = (char) (cArr2[cArr[(ze.copydefault - 1) - ze.AEQbTJ] - i] - iIntValue);
            try {
                Object[] objArr5 = {ze, ze};
                Object objEZpvd4 = YY.EZpvd(i6);
                if (objEZpvd4 == null) {
                    byte b5 = (byte) 0;
                    byte b6 = b5;
                    objEZpvd4 = YY.EZpvd(300, 21, (char) 0, -1252918328, false, $$g(b5, b6, b6), new Class[]{Object.class, Object.class});
                }
                ((Method) objEZpvd4).invoke(null, objArr5);
                i6 = -1317980492;
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 == null) {
                    throw th2;
                }
                throw cause2;
            }
        }
        objArr[0] = new String(cArr6);
    }

    public static final /* synthetic */ Object AEQbTJ(DefiWalletMainActivity defiWalletMainActivity, String str, Bundle bundle, Continuation continuation) throws Throwable {
        int i = 2 % 2;
        int i2 = dNCPSb + 93;
        aKErDB = i2 % 128;
        if (i2 % 2 != 0) {
            return defiWalletMainActivity.AEQbTJ(str, bundle, (Continuation<? super Unit>) continuation);
        }
        defiWalletMainActivity.AEQbTJ(str, bundle, (Continuation<? super Unit>) continuation);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ void AEQbTJ(DefiWalletMainActivity defiWalletMainActivity, Function0 function0) {
        int i = 2 % 2;
        int i2 = dNCPSb + 43;
        aKErDB = i2 % 128;
        int i3 = i2 % 2;
        defiWalletMainActivity.AEQbTJ((Function0<Unit>) function0);
        if (i3 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = dNCPSb + 43;
        aKErDB = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 49 / 0;
        }
    }

    public static final /* synthetic */ int AuCTelauCTel(DefiWalletMainActivity defiWalletMainActivity) {
        int i = 2 % 2;
        int i2 = dNCPSb + 49;
        aKErDB = i2 % 128;
        int i3 = i2 % 2;
        int i4 = defiWalletMainActivity.AhwBna;
        if (i3 != 0) {
            return i4;
        }
        throw null;
    }

    public static final /* synthetic */ Runnable AwvSrB(DefiWalletMainActivity defiWalletMainActivity) {
        int i = 2 % 2;
        int i2 = dNCPSb;
        int i3 = i2 + 27;
        aKErDB = i3 % 128;
        int i4 = i3 % 2;
        Runnable runnable = defiWalletMainActivity.valueOf;
        int i5 = i2 + WalletImportError.ERROR_CODE_GET_EOA_ADDRESS_KEY;
        aKErDB = i5 % 128;
        if (i5 % 2 != 0) {
            return runnable;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ List AxsJAY(DefiWalletMainActivity defiWalletMainActivity) {
        int i = 2 % 2;
        int i2 = aKErDB + 39;
        dNCPSb = i2 % 128;
        int i3 = i2 % 2;
        List list = (List) copydefault(zzep.AEQbTJ(), 959873406, -959873363, new Object[]{defiWalletMainActivity}, zzep.AEQbTJ(), zzep.AEQbTJ(), zzep.AEQbTJ());
        int i4 = aKErDB + 123;
        dNCPSb = i4 % 128;
        if (i4 % 2 == 0) {
            return list;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ void DTwDnp(DefiWalletMainActivity defiWalletMainActivity) {
        int i = 2 % 2;
        int i2 = aKErDB + 69;
        dNCPSb = i2 % 128;
        int i3 = i2 % 2;
        AxsJAYaxsJAY(defiWalletMainActivity);
        if (i3 != 0) {
            throw null;
        }
    }

    public static final /* synthetic */ void KWHzl(DefiWalletMainActivity defiWalletMainActivity, String str) {
        int i = 2 % 2;
        int i2 = aKErDB;
        int i3 = i2 + 87;
        dNCPSb = i3 % 128;
        int i4 = i3 % 2;
        defiWalletMainActivity.sSMYrx = str;
        if (i4 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = i2 + 13;
        dNCPSb = i5 % 128;
        int i6 = i5 % 2;
    }

    public static final /* synthetic */ Object OLrzqt(DefiWalletMainActivity defiWalletMainActivity, Bundle bundle, Continuation continuation) throws Throwable {
        int i = 2 % 2;
        int i2 = dNCPSb + 63;
        aKErDB = i2 % 128;
        int i3 = i2 % 2;
        Object objCopydefault = copydefault(zzep.AEQbTJ(), 1346353819, -1346353765, new Object[]{defiWalletMainActivity, bundle, continuation}, zzep.AEQbTJ(), zzep.AEQbTJ(), zzep.AEQbTJ());
        int i4 = aKErDB + 115;
        dNCPSb = i4 % 128;
        int i5 = i4 % 2;
        return objCopydefault;
    }

    public static final /* synthetic */ eUI ORxRYg(DefiWalletMainActivity defiWalletMainActivity) {
        int i = 2 % 2;
        int i2 = dNCPSb + 17;
        aKErDB = i2 % 128;
        int i3 = i2 % 2;
        eUI euiGiSNqX = defiWalletMainActivity.giSNqX();
        int i4 = aKErDB + 123;
        dNCPSb = i4 % 128;
        int i5 = i4 % 2;
        return euiGiSNqX;
    }

    public static final /* synthetic */ void QOLQEE(DefiWalletMainActivity defiWalletMainActivity) throws Throwable {
        int i = 2 % 2;
        int i2 = dNCPSb + 1;
        aKErDB = i2 % 128;
        if (i2 % 2 != 0) {
            copydefault(zzep.AEQbTJ(), 503061215, -503061181, new Object[]{defiWalletMainActivity}, zzep.AEQbTJ(), zzep.AEQbTJ(), zzep.AEQbTJ());
            return;
        }
        copydefault(zzep.AEQbTJ(), 503061215, -503061181, new Object[]{defiWalletMainActivity}, zzep.AEQbTJ(), zzep.AEQbTJ(), zzep.AEQbTJ());
        int i3 = 96 / 0;
    }

    public static final /* synthetic */ Object copydefault(DefiWalletMainActivity defiWalletMainActivity, String str, String str2, Continuation continuation) throws Throwable {
        int i = 2 % 2;
        int i2 = dNCPSb + 15;
        aKErDB = i2 % 128;
        int i3 = i2 % 2;
        Object objOLrzqt = defiWalletMainActivity.OLrzqt(str, str2, (Continuation<? super Boolean>) continuation);
        int i4 = dNCPSb + 65;
        aKErDB = i4 % 128;
        int i5 = i4 % 2;
        return objOLrzqt;
    }

    public static final /* synthetic */ void copydefault(DefiWalletMainActivity defiWalletMainActivity, int i) {
        int i2 = 2 % 2;
        int i3 = aKErDB;
        int i4 = i3 + 59;
        dNCPSb = i4 % 128;
        int i5 = i4 % 2;
        defiWalletMainActivity.AhwBna = i;
        int i6 = i3 + 97;
        dNCPSb = i6 % 128;
        int i7 = i6 % 2;
    }

    public static final /* synthetic */ void copydefault(DefiWalletMainActivity defiWalletMainActivity, List list) throws Throwable {
        int i = 2 % 2;
        int i2 = dNCPSb + 93;
        aKErDB = i2 % 128;
        int i3 = i2 % 2;
        copydefault(zzep.AEQbTJ(), 365413784, -365413761, new Object[]{defiWalletMainActivity, list}, zzep.AEQbTJ(), zzep.AEQbTJ(), zzep.AEQbTJ());
        int i4 = aKErDB + WalletImportError.ERROR_CODE_GET_EOA_ADDRESS_KEY;
        dNCPSb = i4 % 128;
        int i5 = i4 % 2;
    }

    private static /* synthetic */ Object fvQaOB(Object[] objArr) throws Throwable {
        DefiWalletMainActivity defiWalletMainActivity = (DefiWalletMainActivity) objArr[0];
        int i = 2 % 2;
        int i2 = aKErDB + 31;
        dNCPSb = i2 % 128;
        int i3 = i2 % 2;
        copydefault(zzep.AEQbTJ(), 1741421455, -1741421410, new Object[]{defiWalletMainActivity}, zzep.AEQbTJ(), zzep.AEQbTJ(), zzep.AEQbTJ());
        int i4 = dNCPSb + 51;
        aKErDB = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    public static final /* synthetic */ C16325ehm gHZMYf(DefiWalletMainActivity defiWalletMainActivity) {
        int i = 2 % 2;
        int i2 = dNCPSb;
        int i3 = i2 + 125;
        aKErDB = i3 % 128;
        int i4 = i3 % 2;
        C16325ehm c16325ehm = defiWalletMainActivity.zLjUOn;
        int i5 = i2 + 95;
        aKErDB = i5 % 128;
        int i6 = i5 % 2;
        return c16325ehm;
    }

    private static /* synthetic */ Object sSMYrx(Object[] objArr) {
        DefiWalletMainActivity defiWalletMainActivity = (DefiWalletMainActivity) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        int i = 2 % 2;
        int i2 = dNCPSb + 65;
        aKErDB = i2 % 128;
        int i3 = i2 % 2;
        defiWalletMainActivity.KWHzl(iIntValue);
        if (i3 == 0) {
            int i4 = 77 / 0;
        }
        int i5 = dNCPSb + 125;
        aKErDB = i5 % 128;
        int i6 = i5 % 2;
        return null;
    }

    public static final /* synthetic */ String sSMYrx(DefiWalletMainActivity defiWalletMainActivity) {
        int i = 2 % 2;
        int i2 = dNCPSb + 45;
        aKErDB = i2 % 128;
        int i3 = i2 % 2;
        String str = defiWalletMainActivity.sSMYrx;
        if (i3 == 0) {
            int i4 = 52 / 0;
        }
        return str;
    }

    private static /* synthetic */ Object values(Object[] objArr) {
        DefiWalletMainActivity defiWalletMainActivity = (DefiWalletMainActivity) objArr[0];
        int i = 2 % 2;
        int i2 = dNCPSb + 101;
        aKErDB = i2 % 128;
        int i3 = i2 % 2;
        defiWalletMainActivity.QbewEr();
        if (i3 == 0) {
            throw null;
        }
        int i4 = dNCPSb + 55;
        aKErDB = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 2 / 0;
        }
        return null;
    }

    public static final /* synthetic */ List zuBGHE(DefiWalletMainActivity defiWalletMainActivity) {
        int i = 2 % 2;
        int i2 = aKErDB + 59;
        dNCPSb = i2 % 128;
        int i3 = i2 % 2;
        List<InterfaceC18198fdq> fieldNames = defiWalletMainActivity.getFieldNames();
        int i4 = dNCPSb + 85;
        aKErDB = i4 % 128;
        int i5 = i4 % 2;
        return fieldNames;
    }

    @Override // com.okinc.business.defi.wallet.common.WalletConnectUtils.StateListAnimator
    public void KWHzl(@NotNull String str, @NotNull String str2) {
        int i = 2 % 2;
        int i2 = dNCPSb + 1;
        aKErDB = i2 % 128;
        int i3 = i2 % 2;
        WalletConnectUtils.StateListAnimator.Activity.EZpvd(this, str, str2);
        if (i3 == 0) {
            throw null;
        }
        int i4 = aKErDB + 101;
        dNCPSb = i4 % 128;
        int i5 = i4 % 2;
    }

    public DefiWalletMainActivity() {
        ActivityResultLauncher<Context> activityResultLauncherRegisterForActivityResult;
        Function0<ViewModelProvider.Factory> function0 = new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.defi.wallet.DefiWalletMainActivity$special$$inlined$viewModels$default$1
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
        };
        InterfaceC56551yJo interfaceC56551yJoAEQbTJ = C56524yIo.AEQbTJ(eUI.class);
        Function0<ViewModelStore> function02 = new Function0<ViewModelStore>() { // from class: com.okinc.business.defi.wallet.DefiWalletMainActivity$special$$inlined$viewModels$default$2
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
        };
        ActivityResultLauncher<Context> activityResultLauncherRegisterForActivityResult2 = null;
        final byte b = 0 == true ? 1 : 0;
        this.DTwDnp = new ViewModelLazy(interfaceC56551yJoAEQbTJ, function02, function0, new Function0<CreationExtras>() { // from class: com.okinc.business.defi.wallet.DefiWalletMainActivity$special$$inlined$viewModels$default$3
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
                Function0 function03 = b;
                if (function03 != null && (creationExtras = (CreationExtras) function03.invoke()) != null) {
                    return creationExtras;
                }
                CreationExtras defaultViewModelCreationExtras = this.getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "");
                return defaultViewModelCreationExtras;
            }
        });
        Function0<ViewModelProvider.Factory> function03 = new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.defi.wallet.DefiWalletMainActivity$special$$inlined$viewModels$default$4
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
        };
        InterfaceC56551yJo interfaceC56551yJoAEQbTJ2 = C56524yIo.AEQbTJ(DefiHomeContainerViewModel.class);
        Function0<ViewModelStore> function04 = new Function0<ViewModelStore>() { // from class: com.okinc.business.defi.wallet.DefiWalletMainActivity$special$$inlined$viewModels$default$5
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
        };
        final byte b2 = 0 == true ? 1 : 0;
        this.ejfBZ = new ViewModelLazy(interfaceC56551yJoAEQbTJ2, function04, function03, new Function0<CreationExtras>() { // from class: com.okinc.business.defi.wallet.DefiWalletMainActivity$special$$inlined$viewModels$default$6
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
                Function0 function05 = b2;
                if (function05 != null && (creationExtras = (CreationExtras) function05.invoke()) != null) {
                    return creationExtras;
                }
                CreationExtras defaultViewModelCreationExtras = this.getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "");
                return defaultViewModelCreationExtras;
            }
        });
        Function0<ViewModelProvider.Factory> function05 = new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.defi.wallet.DefiWalletMainActivity$special$$inlined$viewModels$default$7
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
        };
        InterfaceC56551yJo interfaceC56551yJoAEQbTJ3 = C56524yIo.AEQbTJ(C19629gJl.class);
        Function0<ViewModelStore> function06 = new Function0<ViewModelStore>() { // from class: com.okinc.business.defi.wallet.DefiWalletMainActivity$special$$inlined$viewModels$default$8
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
        };
        final byte b3 = 0 == true ? 1 : 0;
        this.QOLQEE = new ViewModelLazy(interfaceC56551yJoAEQbTJ3, function06, function05, new Function0<CreationExtras>() { // from class: com.okinc.business.defi.wallet.DefiWalletMainActivity$special$$inlined$viewModels$default$9
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
                Function0 function07 = b3;
                if (function07 != null && (creationExtras = (CreationExtras) function07.invoke()) != null) {
                    return creationExtras;
                }
                CreationExtras defaultViewModelCreationExtras = this.getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "");
                return defaultViewModelCreationExtras;
            }
        });
        Function0<ViewModelProvider.Factory> function07 = new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.defi.wallet.DefiWalletMainActivity$special$$inlined$viewModels$default$10
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
        };
        InterfaceC56551yJo interfaceC56551yJoAEQbTJ4 = C56524yIo.AEQbTJ(C21113gtd.class);
        Function0<ViewModelStore> function08 = new Function0<ViewModelStore>() { // from class: com.okinc.business.defi.wallet.DefiWalletMainActivity$special$$inlined$viewModels$default$11
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
        };
        final byte b4 = 0 == true ? 1 : 0;
        this.isConnected = new ViewModelLazy(interfaceC56551yJoAEQbTJ4, function08, function07, new Function0<CreationExtras>() { // from class: com.okinc.business.defi.wallet.DefiWalletMainActivity$special$$inlined$viewModels$default$12
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
                Function0 function09 = b4;
                if (function09 != null && (creationExtras = (CreationExtras) function09.invoke()) != null) {
                    return creationExtras;
                }
                CreationExtras defaultViewModelCreationExtras = this.getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "");
                return defaultViewModelCreationExtras;
            }
        });
        this.copydefault = new C14565dnp();
        this.gHZMYf = new PictureInPictureParams();
        this.fJNWhG = true;
        this.DbNXlk = new LoaderManager();
        this.fARcdN = true;
        this.valueOf = new Runnable() { // from class: o.dWF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                DefiWalletMainActivity.wlaJM(this.EZpvd);
            }
        };
        this.sSMYrx = "";
        ActivityResultLauncher<C21118gti.Application> activityResultLauncherRegisterForActivityResult3 = registerForActivityResult(new C21118gti(), new ActivityResultCallback() { // from class: o.dWv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(java.lang.Object obj) throws java.lang.Throwable {
                DefiWalletMainActivity.OLrzqt((java.lang.Integer) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult3, "");
        this.ORxRYg = activityResultLauncherRegisterForActivityResult3;
        InterfaceC8106awV interfaceC8106awV = (InterfaceC8106awV) C43251rlk.OLrzqt(InterfaceC8106awV.class);
        if (interfaceC8106awV != null) {
            activityResultLauncherRegisterForActivityResult = registerForActivityResult(interfaceC8106awV.OLrzqt(true), new ActivityResultCallback() { // from class: o.dWr
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // androidx.activity.result.ActivityResultCallback
                public final void onActivityResult(java.lang.Object obj) throws java.lang.Throwable {
                    DefiWalletMainActivity.OLrzqt(this.KWHzl, (java.lang.Boolean) obj);
                }
            });
        } else {
            int i = aKErDB + 121;
            dNCPSb = i % 128;
            int i2 = i % 2;
            int i3 = 2 % 2;
            activityResultLauncherRegisterForActivityResult = null;
        }
        this.getNewProxyInstance = activityResultLauncherRegisterForActivityResult;
        InterfaceC8106awV interfaceC8106awV2 = (InterfaceC8106awV) C43251rlk.OLrzqt(InterfaceC8106awV.class);
        if (interfaceC8106awV2 != null) {
            activityResultLauncherRegisterForActivityResult2 = registerForActivityResult(interfaceC8106awV2.OLrzqt(true), new ActivityResultCallback() { // from class: o.dWt
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // androidx.activity.result.ActivityResultCallback
                public final void onActivityResult(java.lang.Object obj) throws java.lang.Throwable {
                    DefiWalletMainActivity.AEQbTJ(this.EZpvd, (java.lang.Boolean) obj);
                }
            });
            int i4 = aKErDB + 123;
            dNCPSb = i4 % 128;
            int i5 = i4 % 2;
            int i6 = 2 % 2;
        }
        this.AkhnZx = activityResultLauncherRegisterForActivityResult2;
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.wallet.DefiWalletMainActivity.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final int copydefault() {
            return DefiWalletMainActivity.AhwBna();
        }
    }

    static {
        dxcTrN = 1;
        RJOkX();
        Companion = new StateListAnimator(null);
        KWHzl = 8;
        OLrzqt = C9768bbn.gEmmrt;
        int i = fFgQHt + 71;
        dxcTrN = i % 128;
        int i2 = i % 2;
    }

    private static /* synthetic */ Object DTwDnp(Object[] objArr) {
        int i = 2 % 2;
        List listKWHzl = C43251rlk.KWHzl(C56524yIo.AEQbTJ(InterfaceC18198fdq.class));
        if (listKWHzl != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : listKWHzl) {
                int i2 = dNCPSb + 21;
                aKErDB = i2 % 128;
                int i3 = i2 % 2;
                if (((InterfaceC18198fdq) obj).copydefault()) {
                    arrayList.add(obj);
                }
            }
            List listEZpvd = CollectionsKt___CollectionsKt.EZpvd(arrayList, new AssistContent());
            if (listEZpvd != null) {
                return listEZpvd;
            }
        }
        List listAhwBna = yDY.AhwBna();
        int i4 = aKErDB + 49;
        dNCPSb = i4 % 128;
        int i5 = i4 % 2;
        return listAhwBna;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List<InterfaceC18198fdq> getFieldNames() {
        List<InterfaceC18198fdq> listAhwBna;
        int i = 2 % 2;
        int i2 = dNCPSb + 65;
        aKErDB = i2 % 128;
        if (i2 % 2 != 0) {
            List listKWHzl = C43251rlk.KWHzl(C56524yIo.AEQbTJ(InterfaceC18204fdw.class));
            if (listKWHzl != null) {
                ArrayList arrayList = new ArrayList();
                for (Object obj : listKWHzl) {
                    if (((InterfaceC18204fdw) obj).copydefault()) {
                        arrayList.add(obj);
                    }
                }
                listAhwBna = CollectionsKt___CollectionsKt.EZpvd(arrayList, new VoiceInteractor());
                if (listAhwBna == null) {
                    listAhwBna = yDY.AhwBna();
                    int i3 = dNCPSb + 15;
                    aKErDB = i3 % 128;
                    if (i3 % 2 == 0) {
                        int i4 = 3 / 4;
                    }
                }
            }
            return listAhwBna;
        }
        C43251rlk.KWHzl(C56524yIo.AEQbTJ(InterfaceC18204fdw.class));
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static /* synthetic */ Object fZBcTu(Object[] objArr) {
        DefiWalletMainActivity defiWalletMainActivity = (DefiWalletMainActivity) objArr[0];
        int i = 2 % 2;
        int i2 = aKErDB + 45;
        dNCPSb = i2 % 128;
        if (i2 % 2 == 0) {
            return (List) defiWalletMainActivity.wlaJM.getValue();
        }
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static /* synthetic */ Object QVAiDq(Object[] objArr) {
        int i = 2 % 2;
        int i2 = aKErDB + 63;
        dNCPSb = i2 % 128;
        if (i2 % 2 == 0) {
            return C43251rlk.KWHzl(C56524yIo.AEQbTJ(InterfaceC9773bbs.class));
        }
        C43251rlk.KWHzl(C56524yIo.AEQbTJ(InterfaceC9773bbs.class));
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private final InterfaceC9771bbq dvKsVJ() {
        int i = 2 % 2;
        int i2 = dNCPSb + 9;
        aKErDB = i2 % 128;
        if (i2 % 2 != 0) {
            return (InterfaceC9771bbq) this.gEmmrt.getValue();
        }
        int i3 = 63 / 0;
        return (InterfaceC9771bbq) this.gEmmrt.getValue();
    }

    public static final InterfaceC9771bbq valueOf() {
        int i = 2 % 2;
        int i2 = dNCPSb + 19;
        aKErDB = i2 % 128;
        int i3 = i2 % 2;
        List listKWHzl = C43251rlk.KWHzl(C56524yIo.AEQbTJ(InterfaceC9771bbq.class));
        if (listKWHzl == null) {
            return null;
        }
        int i4 = aKErDB + 63;
        dNCPSb = i4 % 128;
        int i5 = i4 % 2;
        InterfaceC9771bbq interfaceC9771bbq = (InterfaceC9771bbq) CollectionsKt___CollectionsKt.firstOrNull(listKWHzl);
        if (i5 == 0) {
            return interfaceC9771bbq;
        }
        int i6 = 70 / 0;
        return interfaceC9771bbq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static /* synthetic */ Object dxcTrN(Object[] objArr) {
        DefiWalletMainActivity defiWalletMainActivity = (DefiWalletMainActivity) objArr[0];
        int i = 2 % 2;
        int i2 = aKErDB + 65;
        dNCPSb = i2 % 128;
        if (i2 % 2 == 0) {
            return (List) defiWalletMainActivity.zsXlph.getValue();
        }
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final List AkhnZx() {
        int i = 2 % 2;
        int i2 = aKErDB + 49;
        dNCPSb = i2 % 128;
        if (i2 % 2 == 0) {
            return C43251rlk.KWHzl(C56524yIo.AEQbTJ(InterfaceC9772bbr.class));
        }
        int i3 = 93 / 0;
        return C43251rlk.KWHzl(C56524yIo.AEQbTJ(InterfaceC9772bbr.class));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private final List<InterfaceC9774bbt> finit() {
        int i = 2 % 2;
        int i2 = aKErDB + 9;
        dNCPSb = i2 % 128;
        int i3 = i2 % 2;
        List<InterfaceC9774bbt> list = (List) this.AubY.getValue();
        int i4 = dNCPSb + 41;
        aKErDB = i4 % 128;
        int i5 = i4 % 2;
        return list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final List isConnected() {
        int i = 2 % 2;
        int i2 = aKErDB + 57;
        dNCPSb = i2 % 128;
        int i3 = i2 % 2;
        List listKWHzl = C43251rlk.KWHzl(C56524yIo.AEQbTJ(InterfaceC9774bbt.class));
        int i4 = dNCPSb + 73;
        aKErDB = i4 % 128;
        int i5 = i4 % 2;
        return listKWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static /* synthetic */ Object zuBGHE(Object[] objArr) {
        DefiWalletMainActivity defiWalletMainActivity = (DefiWalletMainActivity) objArr[0];
        int i = 2 % 2;
        int i2 = aKErDB + 121;
        dNCPSb = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        List list = (List) defiWalletMainActivity.AuCTelauCTel.getValue();
        int i3 = dNCPSb + 89;
        aKErDB = i3 % 128;
        if (i3 % 2 != 0) {
            return list;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final List fetchVPNInfo() {
        int i = 2 % 2;
        int i2 = dNCPSb + 101;
        aKErDB = i2 % 128;
        if (i2 % 2 != 0) {
            return C43251rlk.KWHzl(C56524yIo.AEQbTJ(InterfaceC9769bbo.class));
        }
        int i3 = 30 / 0;
        return C43251rlk.KWHzl(C56524yIo.AEQbTJ(InterfaceC9769bbo.class));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private final List<InterfaceC9765bbk> dxcTrN() {
        int i = 2 % 2;
        int i2 = dNCPSb + 107;
        aKErDB = i2 % 128;
        int i3 = i2 % 2;
        List<InterfaceC9765bbk> list = (List) this.iwGUEr.getValue();
        int i4 = dNCPSb + 21;
        aKErDB = i4 % 128;
        int i5 = i4 % 2;
        return list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static /* synthetic */ Object iRxXKY(Object[] objArr) {
        int i = 2 % 2;
        int i2 = aKErDB + 19;
        dNCPSb = i2 % 128;
        int i3 = i2 % 2;
        List listKWHzl = C43251rlk.KWHzl(C56524yIo.AEQbTJ(InterfaceC9765bbk.class));
        int i4 = aKErDB + 115;
        dNCPSb = i4 % 128;
        if (i4 % 2 == 0) {
            return listKWHzl;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InterfaceC9770bbp> hDKMBd() {
        int i = 2 % 2;
        int i2 = dNCPSb + 117;
        aKErDB = i2 % 128;
        int i3 = i2 % 2;
        List<InterfaceC9770bbp> list = (List) this.fIwbmz.getValue();
        int i4 = dNCPSb + 51;
        aKErDB = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 7 / 0;
        }
        return list;
    }

    public static final List values() {
        int i = 2 % 2;
        int i2 = aKErDB + 87;
        dNCPSb = i2 % 128;
        int i3 = i2 % 2;
        List listKWHzl = C43251rlk.KWHzl(C56524yIo.AEQbTJ(InterfaceC9770bbp.class));
        if (listKWHzl != null) {
            return listKWHzl;
        }
        int i4 = dNCPSb + 93;
        aKErDB = i4 % 128;
        if (i4 % 2 != 0) {
            return yDY.AhwBna();
        }
        yDY.AhwBna();
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private final C18351fgk flVtFt() {
        int i = 2 % 2;
        int i2 = dNCPSb + 59;
        aKErDB = i2 % 128;
        if (i2 % 2 != 0) {
            return (C18351fgk) this.QKVWgx.getValue();
        }
        throw null;
    }

    public static final C18351fgk QKudOq(DefiWalletMainActivity defiWalletMainActivity) {
        int i = 2 % 2;
        C18351fgk c18351fgk = (C18351fgk) new ViewModelProvider(defiWalletMainActivity).get(C18351fgk.class);
        int i2 = aKErDB + 35;
        dNCPSb = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 66 / 0;
        }
        return c18351fgk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static /* synthetic */ Object fARcdN(Object[] objArr) {
        C18285ffX c18285ffX;
        DefiWalletMainActivity defiWalletMainActivity = (DefiWalletMainActivity) objArr[0];
        int i = 2 % 2;
        int i2 = dNCPSb + 121;
        aKErDB = i2 % 128;
        if (i2 % 2 == 0) {
            c18285ffX = (C18285ffX) defiWalletMainActivity.AxsJAY.getValue();
            int i3 = 92 / 0;
        } else {
            c18285ffX = (C18285ffX) defiWalletMainActivity.AxsJAY.getValue();
        }
        int i4 = aKErDB + WalletImportError.ERROR_CODE_GET_EOA_ADDRESS_KEY;
        dNCPSb = i4 % 128;
        if (i4 % 2 == 0) {
            return c18285ffX;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final C18285ffX iRxXKY(DefiWalletMainActivity defiWalletMainActivity) {
        int i = 2 % 2;
        C18285ffX c18285ffX = (C18285ffX) new ViewModelProvider(defiWalletMainActivity).get(C18285ffX.class);
        int i2 = dNCPSb + 27;
        aKErDB = i2 % 128;
        if (i2 % 2 != 0) {
            return c18285ffX;
        }
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private final eUI giSNqX() {
        int i = 2 % 2;
        int i2 = dNCPSb + 121;
        aKErDB = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        eUI eui = (eUI) this.DTwDnp.getValue();
        int i3 = dNCPSb + WalletImportError.ERROR_CODE_HARDWARE_ACCOUNT_EXIST;
        aKErDB = i3 % 128;
        if (i3 % 2 != 0) {
            return eui;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DefiHomeContainerViewModel iwGUEr() {
        int i = 2 % 2;
        int i2 = aKErDB + WalletImportError.ERROR_CODE_HARDWARE_ACCOUNT_EXIST;
        dNCPSb = i2 % 128;
        if (i2 % 2 == 0) {
            return (DefiHomeContainerViewModel) this.ejfBZ.getValue();
        }
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private final C19629gJl fvQaOB() {
        C19629gJl c19629gJl;
        int i = 2 % 2;
        int i2 = dNCPSb + 41;
        aKErDB = i2 % 128;
        if (i2 % 2 == 0) {
            c19629gJl = (C19629gJl) this.QOLQEE.getValue();
            int i3 = 82 / 0;
        } else {
            c19629gJl = (C19629gJl) this.QOLQEE.getValue();
        }
        int i4 = dNCPSb + 109;
        aKErDB = i4 % 128;
        if (i4 % 2 != 0) {
            return c19629gJl;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C21113gtd uzCIH() {
        int i = 2 % 2;
        int i2 = aKErDB + 45;
        dNCPSb = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        C21113gtd c21113gtd = (C21113gtd) this.isConnected.getValue();
        int i3 = dNCPSb + 83;
        aKErDB = i3 % 128;
        int i4 = i3 % 2;
        return c21113gtd;
    }

    public static final class PictureInPictureParams extends xZF.TaskDescription<WalletTxStatusSubManager.SubResponse> {
        public PictureInPictureParams() {
            super("txStatusSub-MainActivity", null, 2, null);
        }

        @Override // o.xZF.TaskDescription
        public void EZpvd(List<WalletTxStatusSubManager.SubResponse> list) {
            Intrinsics.checkNotNullParameter(list, "");
            if (C54819xWm.KWHzl().AEQbTJ() == null || C54819xWm.KWHzl().AEQbTJ().isDestroyed()) {
                return;
            }
            C19665gKu.OLrzqt.OLrzqt(list, 5000L);
        }
    }

    public static final class LoaderManager extends FragmentManager.FragmentLifecycleCallbacks {
        public C15572eNh OLrzqt;
        public int copydefault;

        public LoaderManager() {
        }

        @Override // androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks
        public void onFragmentResumed(androidx.fragment.app.FragmentManager fragmentManager, androidx.fragment.app.Fragment fragment) {
            Intrinsics.checkNotNullParameter(fragmentManager, "");
            Intrinsics.checkNotNullParameter(fragment, "");
            super.onFragmentResumed(fragmentManager, fragment);
            if (fragment instanceof C15572eNh) {
                C15572eNh c15572eNh = (C15572eNh) fragment;
                this.OLrzqt = c15572eNh;
                if (this.copydefault == 0) {
                    c15572eNh.iRxXKY();
                }
            }
            C15572eNh c15572eNh2 = this.OLrzqt;
            if ((fragment instanceof DialogFragment) && c15572eNh2 != null) {
                if (this.copydefault == 0) {
                    c15572eNh2.DAIeex();
                }
                this.copydefault++;
            }
            if (DefiWalletMainActivity.ORxRYg(DefiWalletMainActivity.this).fetchVPNInfo() && (fragment instanceof C17351fCc)) {
                DefiWalletMainActivity.ORxRYg(DefiWalletMainActivity.this).OLrzqt(false);
                ((C17351fCc) fragment).AhwBna();
            }
            String tag = DefiWalletMainActivity.this.getTAG();
            String simpleName = fragment.getClass().getSimpleName();
            boolean z = c15572eNh2 == null;
            pUU.EZpvd(tag, "onResumed: " + simpleName + ", homeFragment == null? " + z + ", dialogFragmentCount=" + this.copydefault);
        }

        @Override // androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks
        public void onFragmentPaused(androidx.fragment.app.FragmentManager fragmentManager, androidx.fragment.app.Fragment fragment) {
            Intrinsics.checkNotNullParameter(fragmentManager, "");
            Intrinsics.checkNotNullParameter(fragment, "");
            super.onFragmentPaused(fragmentManager, fragment);
            if (fragment instanceof C15572eNh) {
                ((C15572eNh) fragment).DAIeex();
                this.OLrzqt = null;
                this.copydefault = 0;
            }
            C15572eNh c15572eNh = this.OLrzqt;
            if ((fragment instanceof DialogFragment) && c15572eNh != null) {
                int i = this.copydefault - 1;
                this.copydefault = i;
                if (i == 0) {
                    c15572eNh.iRxXKY();
                }
            }
            String tag = DefiWalletMainActivity.this.getTAG();
            String simpleName = fragment.getClass().getSimpleName();
            boolean z = c15572eNh == null;
            pUU.EZpvd(tag, "onPaused: " + simpleName + ", homeFragment == null? " + z + ", dialogFragmentCount=" + this.copydefault);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object getFieldNames(Object[] objArr) {
        boolean z = false;
        DefiWalletMainActivity defiWalletMainActivity = (DefiWalletMainActivity) objArr[0];
        Bundle bundle = (Bundle) objArr[1];
        int i = 2 % 2;
        int i2 = dNCPSb + 121;
        aKErDB = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        if ((bundle != null ? Boolean.valueOf(bundle.getBoolean("show")) : null) != null) {
            int i3 = dNCPSb;
            int i4 = i3 + 39;
            aKErDB = i4 % 128;
            int i5 = i4 % 2;
            if (bundle != null) {
                int i6 = i3 + 75;
                aKErDB = i6 % 128;
                int i7 = i6 % 2;
                if (bundle.getBoolean("show")) {
                    int i8 = dNCPSb + 95;
                    aKErDB = i8 % 128;
                    int i9 = i8 % 2;
                    z = true;
                }
            }
        } else {
            Bundle extras = defiWalletMainActivity.getIntent().getExtras();
            if (extras != null) {
                int i10 = aKErDB + 37;
                dNCPSb = i10 % 128;
                int i11 = i10 % 2;
                if (extras.getBoolean("show")) {
                }
            }
        }
        defiWalletMainActivity.zuBGHE = z;
        defiWalletMainActivity.AwvSrB = z;
        return null;
    }

    public static /* synthetic */ WindowInsetsCompat AEQbTJ(C16325ehm c16325ehm, View view, WindowInsetsCompat windowInsetsCompat) {
        int i = 2 % 2;
        int i2 = dNCPSb + 83;
        aKErDB = i2 % 128;
        if (i2 % 2 != 0) {
            return OLrzqt(c16325ehm, view, windowInsetsCompat);
        }
        OLrzqt(c16325ehm, view, windowInsetsCompat);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ String AEQbTJ(String str, Integer num) {
        int i = 2 % 2;
        int i2 = aKErDB + 23;
        dNCPSb = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {str, num};
        int iAEQbTJ = zzep.AEQbTJ();
        int iAEQbTJ2 = zzep.AEQbTJ();
        int iAEQbTJ3 = zzep.AEQbTJ();
        int iAEQbTJ4 = zzep.AEQbTJ();
        if (i3 != 0) {
            throw null;
        }
        String str2 = (String) copydefault(iAEQbTJ, -507120429, 507120484, objArr, iAEQbTJ4, iAEQbTJ2, iAEQbTJ3);
        int i4 = aKErDB + 73;
        dNCPSb = i4 % 128;
        if (i4 % 2 == 0) {
            return str2;
        }
        throw null;
    }

    public static /* synthetic */ List AEQbTJ() {
        int i = 2 % 2;
        int i2 = aKErDB + 7;
        dNCPSb = i2 % 128;
        int i3 = i2 % 2;
        List listIsConnected = isConnected();
        int i4 = dNCPSb + 93;
        aKErDB = i4 % 128;
        int i5 = i4 % 2;
        return listIsConnected;
    }

    public static /* synthetic */ List AEQbTJ(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = dNCPSb + 57;
        aKErDB = i2 % 128;
        int i3 = i2 % 2;
        List listUeEOUB = UeEOUB(function1, obj);
        if (i3 == 0) {
            int i4 = 20 / 0;
        }
        int i5 = aKErDB + 27;
        dNCPSb = i5 % 128;
        int i6 = i5 % 2;
        return listUeEOUB;
    }

    public static /* synthetic */ Unit AEQbTJ(VerifyDAppDomainUrlResponse verifyDAppDomainUrlResponse, Application application, String str) {
        int i = 2 % 2;
        int i2 = aKErDB + 81;
        dNCPSb = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = (Unit) copydefault(zzep.AEQbTJ(), 1134617423, -1134617401, new Object[]{verifyDAppDomainUrlResponse, application, str}, zzep.AEQbTJ(), zzep.AEQbTJ(), zzep.AEQbTJ());
        int i4 = aKErDB + 55;
        dNCPSb = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ Unit AEQbTJ(DefiWalletMainActivity defiWalletMainActivity, int i, boolean z) {
        int i2 = 2 % 2;
        int i3 = dNCPSb + 75;
        aKErDB = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOLrzqt = OLrzqt(defiWalletMainActivity, i, z);
        int i5 = aKErDB + 117;
        dNCPSb = i5 % 128;
        int i6 = i5 % 2;
        return unitOLrzqt;
    }

    public static /* synthetic */ Unit AEQbTJ(DefiWalletMainActivity defiWalletMainActivity, Bundle bundle) {
        int i = 2 % 2;
        int i2 = aKErDB + 45;
        dNCPSb = i2 % 128;
        int i3 = i2 % 2;
        Unit unitAYXKKw = AYXKKw(defiWalletMainActivity, bundle);
        int i4 = aKErDB + 5;
        dNCPSb = i4 % 128;
        if (i4 % 2 == 0) {
            return unitAYXKKw;
        }
        throw null;
    }

    public static /* synthetic */ Unit AEQbTJ(DefiWalletMainActivity defiWalletMainActivity, Bundle bundle, AbstractC12782ctV abstractC12782ctV) {
        int i = 2 % 2;
        int i2 = dNCPSb + 35;
        aKErDB = i2 % 128;
        int i3 = i2 % 2;
        Unit unitCopydefault = copydefault(defiWalletMainActivity, bundle, abstractC12782ctV);
        int i4 = aKErDB + 35;
        dNCPSb = i4 % 128;
        if (i4 % 2 == 0) {
            return unitCopydefault;
        }
        throw null;
    }

    public static /* synthetic */ Unit AEQbTJ(DefiWalletMainActivity defiWalletMainActivity, List list) {
        int i = 2 % 2;
        int i2 = dNCPSb + 39;
        aKErDB = i2 % 128;
        int i3 = i2 % 2;
        Unit unitEZpvd = EZpvd(defiWalletMainActivity, list);
        int i4 = aKErDB + 97;
        dNCPSb = i4 % 128;
        if (i4 % 2 == 0) {
            return unitEZpvd;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit AEQbTJ(DefiWalletMainActivity defiWalletMainActivity, AbstractC12782ctV abstractC12782ctV) {
        int i = 2 % 2;
        int i2 = aKErDB + 121;
        dNCPSb = i2 % 128;
        int i3 = i2 % 2;
        Unit unitAuCTel = AuCTel(defiWalletMainActivity, abstractC12782ctV);
        if (i3 != 0) {
            int i4 = 47 / 0;
        }
        int i5 = aKErDB + 107;
        dNCPSb = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 10 / 0;
        }
        return unitAuCTel;
    }

    public static /* synthetic */ Unit AEQbTJ(DefiWalletMainActivity defiWalletMainActivity, AbstractC12782ctV abstractC12782ctV, boolean z, int i, String str) throws Throwable {
        int i2 = 2 % 2;
        int i3 = dNCPSb + 115;
        aKErDB = i3 % 128;
        int i4 = i3 % 2;
        Unit unitEZpvd = EZpvd(defiWalletMainActivity, abstractC12782ctV, z, i, str);
        int i5 = dNCPSb + 17;
        aKErDB = i5 % 128;
        if (i5 % 2 != 0) {
            return unitEZpvd;
        }
        throw null;
    }

    public static /* synthetic */ Unit AEQbTJ(FeatureRestrictionInfo featureRestrictionInfo, DefiWalletMainActivity defiWalletMainActivity, WalletStatus walletStatus) {
        int i = 2 % 2;
        int i2 = aKErDB + 39;
        dNCPSb = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            OLrzqt(featureRestrictionInfo, defiWalletMainActivity, walletStatus);
            obj.hashCode();
            throw null;
        }
        Unit unitOLrzqt = OLrzqt(featureRestrictionInfo, defiWalletMainActivity, walletStatus);
        int i3 = aKErDB + 27;
        dNCPSb = i3 % 128;
        if (i3 % 2 == 0) {
            return unitOLrzqt;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit AEQbTJ(Throwable th) {
        int i = 2 % 2;
        int i2 = dNCPSb + 115;
        aKErDB = i2 % 128;
        if (i2 % 2 != 0) {
            return AuCTel(th);
        }
        AuCTel(th);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit AEQbTJ(List list, BottomNavigationView bottomNavigationView, DefiWalletMainActivity defiWalletMainActivity, MenuItem menuItem, Integer num) {
        int i = 2 % 2;
        int i2 = dNCPSb + 21;
        aKErDB = i2 % 128;
        if (i2 % 2 != 0) {
            return OLrzqt(list, bottomNavigationView, defiWalletMainActivity, menuItem, num);
        }
        OLrzqt(list, bottomNavigationView, defiWalletMainActivity, menuItem, num);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void AEQbTJ(Bundle bundle, String str, DefiWalletMainActivity defiWalletMainActivity) {
        int i = 2 % 2;
        int i2 = aKErDB + 31;
        dNCPSb = i2 % 128;
        int i3 = i2 % 2;
        EZpvd(bundle, str, defiWalletMainActivity);
        int i4 = aKErDB + 53;
        dNCPSb = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 77 / 0;
        }
    }

    public static /* synthetic */ void AEQbTJ(DefiWalletMainActivity defiWalletMainActivity) {
        int i = 2 % 2;
        int i2 = dNCPSb + 55;
        aKErDB = i2 % 128;
        int i3 = i2 % 2;
        AxsJAYsNCnLh(defiWalletMainActivity);
        int i4 = dNCPSb + 69;
        aKErDB = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public static /* synthetic */ void AEQbTJ(DefiWalletMainActivity defiWalletMainActivity, Boolean bool) throws Throwable {
        int i = 2 % 2;
        int i2 = aKErDB + 69;
        dNCPSb = i2 % 128;
        int i3 = i2 % 2;
        copydefault(zzep.AEQbTJ(), 2032489530, -2032489473, new Object[]{defiWalletMainActivity, bool}, zzep.AEQbTJ(), zzep.AEQbTJ(), zzep.AEQbTJ());
        int i4 = dNCPSb + 123;
        aKErDB = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public static /* synthetic */ void AEQbTJ(Function2 function2, Object obj, Object obj2) throws Throwable {
        int i = 2 % 2;
        int i2 = dNCPSb + 23;
        aKErDB = i2 % 128;
        if (i2 % 2 == 0) {
            copydefault(zzep.AEQbTJ(), -706843588, 706843589, new Object[]{function2, obj, obj2}, zzep.AEQbTJ(), zzep.AEQbTJ(), zzep.AEQbTJ());
            throw null;
        }
        copydefault(zzep.AEQbTJ(), -706843588, 706843589, new Object[]{function2, obj, obj2}, zzep.AEQbTJ(), zzep.AEQbTJ(), zzep.AEQbTJ());
        int i3 = aKErDB + 35;
        dNCPSb = i3 % 128;
        int i4 = i3 % 2;
    }

    public static final /* synthetic */ void AEQbTJ(boolean z) {
        int i = 2 % 2;
        int i2 = dNCPSb + 21;
        int i3 = i2 % 128;
        aKErDB = i3;
        int i4 = i2 % 2;
        EZpvd = z;
        if (i4 == 0) {
            int i5 = 52 / 0;
        }
        int i6 = i3 + 83;
        dNCPSb = i6 % 128;
        int i7 = i6 % 2;
    }

    public static /* synthetic */ boolean AEQbTJ(xXT xxt) {
        int i = 2 % 2;
        int i2 = dNCPSb + 91;
        aKErDB = i2 % 128;
        int i3 = i2 % 2;
        boolean zKWHzl = KWHzl(xxt);
        int i4 = dNCPSb + 97;
        aKErDB = i4 % 128;
        if (i4 % 2 != 0) {
            return zKWHzl;
        }
        throw null;
    }

    private static /* synthetic */ Object AYXKKw(Object[] objArr) {
        DefiWalletMainActivity defiWalletMainActivity = (DefiWalletMainActivity) objArr[0];
        int i = 2 % 2;
        int i2 = aKErDB + WalletImportError.ERROR_CODE_HARDWARE_ACCOUNT_EXIST;
        dNCPSb = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = (Unit) copydefault(zzep.AEQbTJ(), 1501641126, -1501641122, new Object[]{defiWalletMainActivity}, zzep.AEQbTJ(), zzep.AEQbTJ(), zzep.AEQbTJ());
        int i4 = aKErDB + 7;
        dNCPSb = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ List AYXKKw() {
        int i = 2 % 2;
        int i2 = dNCPSb + 3;
        aKErDB = i2 % 128;
        int i3 = i2 % 2;
        List listValues = values();
        int i4 = dNCPSb + 73;
        aKErDB = i4 % 128;
        int i5 = i4 % 2;
        return listValues;
    }

    public static /* synthetic */ Unit AYXKKw(DefiWalletMainActivity defiWalletMainActivity) {
        int i = 2 % 2;
        int i2 = dNCPSb + 109;
        aKErDB = i2 % 128;
        int i3 = i2 % 2;
        Unit unitAKErDB = aKErDB(defiWalletMainActivity);
        int i4 = aKErDB + 93;
        dNCPSb = i4 % 128;
        if (i4 % 2 == 0) {
            return unitAKErDB;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit AYXKKw(DefiWalletMainActivity defiWalletMainActivity, AbstractC12782ctV abstractC12782ctV) {
        int i = 2 % 2;
        int i2 = dNCPSb + 73;
        aKErDB = i2 % 128;
        int i3 = i2 % 2;
        Unit unitEjfBZ = ejfBZ(defiWalletMainActivity, abstractC12782ctV);
        if (i3 == 0) {
            int i4 = 51 / 0;
        }
        return unitEjfBZ;
    }

    public static /* synthetic */ Unit AYXKKw(Throwable th) {
        int i = 2 % 2;
        int i2 = dNCPSb + 3;
        aKErDB = i2 % 128;
        if (i2 % 2 == 0) {
            uzCIH(th);
            throw null;
        }
        Unit unitUzCIH = uzCIH(th);
        int i3 = dNCPSb + 17;
        aKErDB = i3 % 128;
        int i4 = i3 % 2;
        return unitUzCIH;
    }

    public static /* synthetic */ void AYXKKw(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = dNCPSb + 77;
        aKErDB = i2 % 128;
        int i3 = i2 % 2;
        RJOkX(function1, obj);
        int i4 = dNCPSb + 57;
        aKErDB = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public static final /* synthetic */ int AhwBna() {
        int i = 2 % 2;
        int i2 = aKErDB + 5;
        dNCPSb = i2 % 128;
        if (i2 % 2 == 0) {
            return OLrzqt;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final ActivityResultLauncher<Context> AhwBna(boolean z) {
        int i = 2 % 2;
        if (!z) {
            return this.getNewProxyInstance;
        }
        int i2 = aKErDB + 45;
        int i3 = i2 % 128;
        dNCPSb = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        ActivityResultLauncher<Context> activityResultLauncher = this.AkhnZx;
        int i4 = i3 + 77;
        aKErDB = i4 % 128;
        int i5 = i4 % 2;
        return activityResultLauncher;
    }

    public static /* synthetic */ Unit AhwBna(DefiWalletMainActivity defiWalletMainActivity) {
        int i = 2 % 2;
        int i2 = aKErDB + 3;
        dNCPSb = i2 % 128;
        int i3 = i2 % 2;
        Unit unitQfsBiF = QfsBiF(defiWalletMainActivity);
        int i4 = dNCPSb + 25;
        aKErDB = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 30 / 0;
        }
        return unitQfsBiF;
    }

    public static /* synthetic */ void AhwBna(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = aKErDB + 59;
        dNCPSb = i2 % 128;
        int i3 = i2 % 2;
        QOLQEE(function1, obj);
        if (i3 != 0) {
            throw null;
        }
    }

    private static /* synthetic */ Object AkhnZx(Object[] objArr) {
        Throwable th = (Throwable) objArr[0];
        int i = 2 % 2;
        int i2 = dNCPSb + 83;
        aKErDB = i2 % 128;
        int i3 = i2 % 2;
        Unit unitEjfBZ = ejfBZ(th);
        int i4 = dNCPSb + 87;
        aKErDB = i4 % 128;
        int i5 = i4 % 2;
        return unitEjfBZ;
    }

    public static /* synthetic */ Unit AkhnZx(DefiWalletMainActivity defiWalletMainActivity) {
        int i = 2 % 2;
        int i2 = dNCPSb + 71;
        aKErDB = i2 % 128;
        if (i2 % 2 != 0) {
            return dxcTrN(defiWalletMainActivity);
        }
        dxcTrN(defiWalletMainActivity);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void AkhnZx(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = aKErDB + 55;
        dNCPSb = i2 % 128;
        int i3 = i2 % 2;
        accept(function1, obj);
        if (i3 == 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit AuCTel(DefiWalletMainActivity defiWalletMainActivity) {
        int i = 2 % 2;
        int i2 = dNCPSb + 53;
        aKErDB = i2 % 128;
        int i3 = i2 % 2;
        Unit unitRJOkX = RJOkX(defiWalletMainActivity);
        if (i3 == 0) {
            int i4 = 1 / 0;
        }
        int i5 = aKErDB + 83;
        dNCPSb = i5 % 128;
        if (i5 % 2 == 0) {
            return unitRJOkX;
        }
        throw null;
    }

    private static /* synthetic */ Object AuCTelauCTel(Object[] objArr) {
        String str = (String) objArr[0];
        String str2 = (String) objArr[1];
        EventParamsList eventParamsList = (EventParamsList) objArr[2];
        int i = 2 % 2;
        int i2 = dNCPSb + 79;
        aKErDB = i2 % 128;
        if (i2 % 2 != 0) {
            return EZpvd(str, str2, eventParamsList);
        }
        EZpvd(str, str2, eventParamsList);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void AuCTelauCTel(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = aKErDB + 75;
        dNCPSb = i2 % 128;
        int i3 = i2 % 2;
        QKudOq(function1, obj);
        int i4 = dNCPSb + 117;
        aKErDB = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public static /* synthetic */ C18285ffX AubY(DefiWalletMainActivity defiWalletMainActivity) {
        int i = 2 % 2;
        int i2 = dNCPSb + 87;
        aKErDB = i2 % 128;
        int i3 = i2 % 2;
        C18285ffX c18285ffXIRxXKY = iRxXKY(defiWalletMainActivity);
        int i4 = aKErDB + 19;
        dNCPSb = i4 % 128;
        if (i4 % 2 == 0) {
            return c18285ffXIRxXKY;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void AubY(Function1 function1, Object obj) throws Throwable {
        int i = 2 % 2;
        int i2 = aKErDB + 105;
        dNCPSb = i2 % 128;
        if (i2 % 2 == 0) {
            copydefault(zzep.AEQbTJ(), 1200649810, -1200649749, new Object[]{function1, obj}, zzep.AEQbTJ(), zzep.AEQbTJ(), zzep.AEQbTJ());
            return;
        }
        copydefault(zzep.AEQbTJ(), 1200649810, -1200649749, new Object[]{function1, obj}, zzep.AEQbTJ(), zzep.AEQbTJ(), zzep.AEQbTJ());
        throw null;
    }

    private static /* synthetic */ Object AwvSrB(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        Object obj = objArr[1];
        int i = 2 % 2;
        int i2 = dNCPSb + 35;
        aKErDB = i2 % 128;
        int i3 = i2 % 2;
        djSkpj(function1, obj);
        int i4 = aKErDB + 3;
        dNCPSb = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 75 / 0;
        }
        return null;
    }

    public static /* synthetic */ void AwvSrB(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = dNCPSb + 15;
        aKErDB = i2 % 128;
        int i3 = i2 % 2;
        ORxRYg(function1, obj);
        int i4 = aKErDB + 97;
        dNCPSb = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ void AxsJAY(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = dNCPSb + 23;
        aKErDB = i2 % 128;
        int i3 = i2 % 2;
        AxsJAYaxsJAY(function1, obj);
        if (i3 == 0) {
            throw null;
        }
        int i4 = aKErDB + 53;
        dNCPSb = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 1 / 0;
        }
    }

    private static /* synthetic */ Object AxsJAYaxsJAY(Object[] objArr) {
        String str = (String) objArr[0];
        AbstractC12782ctV abstractC12782ctV = (AbstractC12782ctV) objArr[1];
        int i = 2 % 2;
        int i2 = dNCPSb + 35;
        aKErDB = i2 % 128;
        if (i2 % 2 != 0) {
            return KWHzl(str, abstractC12782ctV);
        }
        KWHzl(str, abstractC12782ctV);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void DTwDnp(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = dNCPSb + 5;
        aKErDB = i2 % 128;
        int i3 = i2 % 2;
        QVAiDq(function1, obj);
        int i4 = aKErDB + 123;
        dNCPSb = i4 % 128;
        int i5 = i4 % 2;
    }

    private static /* synthetic */ Object DbNXlk(Object[] objArr) {
        xXO xxo = (xXO) objArr[0];
        int i = 2 % 2;
        int i2 = dNCPSb + 9;
        aKErDB = i2 % 128;
        if (i2 % 2 == 0) {
            EZpvd(xxo);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitEZpvd = EZpvd(xxo);
        int i3 = dNCPSb + 35;
        aKErDB = i3 % 128;
        int i4 = i3 % 2;
        return unitEZpvd;
    }

    public static /* synthetic */ Unit DbNXlk(DefiWalletMainActivity defiWalletMainActivity) {
        int i = 2 % 2;
        int i2 = aKErDB + 59;
        dNCPSb = i2 % 128;
        int i3 = i2 % 2;
        Unit unitDjSkpj = djSkpj(defiWalletMainActivity);
        int i4 = aKErDB + 73;
        dNCPSb = i4 % 128;
        int i5 = i4 % 2;
        return unitDjSkpj;
    }

    public static /* synthetic */ Unit DbNXlk(Throwable th) {
        int i = 2 % 2;
        int i2 = aKErDB + 3;
        dNCPSb = i2 % 128;
        int i3 = i2 % 2;
        Unit unitAkhnZx = AkhnZx(th);
        int i4 = aKErDB + 23;
        dNCPSb = i4 % 128;
        if (i4 % 2 == 0) {
            return unitAkhnZx;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void DbNXlk(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = dNCPSb + 39;
        aKErDB = i2 % 128;
        int i3 = i2 % 2;
        fFgQHt(function1, obj);
        int i4 = dNCPSb + 95;
        aKErDB = i4 % 128;
        int i5 = i4 % 2;
    }

    private static /* synthetic */ Object EZpvd(Object[] objArr) {
        int i = 2 % 2;
        int i2 = dNCPSb + 77;
        aKErDB = i2 % 128;
        if (i2 % 2 != 0) {
            return (List) copydefault(zzep.AEQbTJ(), 855839258, -855839183, new Object[0], zzep.AEQbTJ(), zzep.AEQbTJ(), zzep.AEQbTJ());
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit EZpvd(DefiWalletMainActivity defiWalletMainActivity, int i) {
        int i2 = 2 % 2;
        int i3 = aKErDB + 11;
        dNCPSb = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOLrzqt = OLrzqt(defiWalletMainActivity, i);
        int i5 = aKErDB + 101;
        dNCPSb = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 16 / 0;
        }
        return unitOLrzqt;
    }

    public static /* synthetic */ Unit EZpvd(DefiWalletMainActivity defiWalletMainActivity, Bundle bundle, Pair pair, String str) {
        int i = 2 % 2;
        int i2 = dNCPSb + 73;
        aKErDB = i2 % 128;
        int i3 = i2 % 2;
        Unit unitCopydefault = copydefault(defiWalletMainActivity, bundle, pair, str);
        int i4 = aKErDB + 7;
        dNCPSb = i4 % 128;
        int i5 = i4 % 2;
        return unitCopydefault;
    }

    public static /* synthetic */ Unit EZpvd(DefiWalletMainActivity defiWalletMainActivity, Throwable th) {
        int i = 2 % 2;
        int i2 = aKErDB + 23;
        dNCPSb = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            gEmmrt(defiWalletMainActivity, th);
            throw null;
        }
        Unit unitGEmmrt = gEmmrt(defiWalletMainActivity, th);
        int i3 = aKErDB + 57;
        dNCPSb = i3 % 128;
        if (i3 % 2 == 0) {
            return unitGEmmrt;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit EZpvd(DefiWalletMainActivity defiWalletMainActivity, AbstractC12782ctV abstractC12782ctV) {
        int i = 2 % 2;
        int i2 = dNCPSb + 7;
        aKErDB = i2 % 128;
        int i3 = i2 % 2;
        Unit unitFARcdN = fARcdN(defiWalletMainActivity, abstractC12782ctV);
        int i4 = dNCPSb + 57;
        aKErDB = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 53 / 0;
        }
        return unitFARcdN;
    }

    public static /* synthetic */ Unit EZpvd(DefiWalletMainActivity defiWalletMainActivity, boolean z, AbstractC12782ctV abstractC12782ctV) {
        int i = 2 % 2;
        int i2 = dNCPSb + 121;
        aKErDB = i2 % 128;
        if (i2 % 2 != 0) {
            return (Unit) copydefault(zzep.AEQbTJ(), -256502746, 256502797, new Object[]{defiWalletMainActivity, Boolean.valueOf(z), abstractC12782ctV}, zzep.AEQbTJ(), zzep.AEQbTJ(), zzep.AEQbTJ());
        }
        Object[] objArr = {defiWalletMainActivity, Boolean.valueOf(z), abstractC12782ctV};
        int i3 = 17 / 0;
        return (Unit) copydefault(zzep.AEQbTJ(), -256502746, 256502797, objArr, zzep.AEQbTJ(), zzep.AEQbTJ(), zzep.AEQbTJ());
    }

    public static /* synthetic */ Unit EZpvd(String str, int i) {
        int i2 = 2 % 2;
        int i3 = aKErDB + 19;
        dNCPSb = i3 % 128;
        int i4 = i3 % 2;
        Unit unit = (Unit) copydefault(zzep.AEQbTJ(), 606379569, -606379569, new Object[]{str, Integer.valueOf(i)}, zzep.AEQbTJ(), zzep.AEQbTJ(), zzep.AEQbTJ());
        int i5 = dNCPSb + 85;
        aKErDB = i5 % 128;
        if (i5 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit EZpvd(Throwable th) {
        int i = 2 % 2;
        int i2 = dNCPSb + 75;
        aKErDB = i2 % 128;
        int i3 = i2 % 2;
        Unit fieldNames = getFieldNames(th);
        int i4 = dNCPSb + 115;
        aKErDB = i4 % 128;
        int i5 = i4 % 2;
        return fieldNames;
    }

    public static /* synthetic */ Unit EZpvd(boolean z) {
        int i = 2 % 2;
        int i2 = dNCPSb + 97;
        aKErDB = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {Boolean.valueOf(z)};
        Unit unit = (Unit) copydefault(zzep.AEQbTJ(), 1428798180, -1428798150, objArr, zzep.AEQbTJ(), zzep.AEQbTJ(), zzep.AEQbTJ());
        int i4 = dNCPSb + 55;
        aKErDB = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ void EZpvd(DefiWalletMainActivity defiWalletMainActivity) {
        int i = 2 % 2;
        int i2 = aKErDB + 67;
        dNCPSb = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        QbewEr(defiWalletMainActivity);
        if (i3 != 0) {
            throw null;
        }
        int i4 = aKErDB + 47;
        dNCPSb = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void EZpvd(DefiWalletMainActivity defiWalletMainActivity, Bundle bundle, Pair pair) {
        int i = 2 % 2;
        int i2 = aKErDB + 123;
        dNCPSb = i2 % 128;
        int i3 = i2 % 2;
        AEQbTJ(defiWalletMainActivity, bundle, pair);
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void EZpvd(Function1 function1, Object obj) throws Throwable {
        int i = 2 % 2;
        int i2 = dNCPSb + 121;
        aKErDB = i2 % 128;
        if (i2 % 2 == 0) {
            copydefault(zzep.AEQbTJ(), -806203615, 806203677, new Object[]{function1, obj}, zzep.AEQbTJ(), zzep.AEQbTJ(), zzep.AEQbTJ());
            int i3 = 36 / 0;
        } else {
            copydefault(zzep.AEQbTJ(), -806203615, 806203677, new Object[]{function1, obj}, zzep.AEQbTJ(), zzep.AEQbTJ(), zzep.AEQbTJ());
        }
        int i4 = dNCPSb + 73;
        aKErDB = i4 % 128;
        int i5 = i4 % 2;
    }

    public static final boolean EZpvd(View view) {
        int i = 2 % 2;
        int i2 = aKErDB + 121;
        int i3 = i2 % 128;
        dNCPSb = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 83;
        aKErDB = i5 % 128;
        int i6 = i5 % 2;
        return true;
    }

    private static /* synthetic */ Object KWHzl(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        Object obj = objArr[1];
        int i = 2 % 2;
        int i2 = aKErDB + 29;
        dNCPSb = i2 % 128;
        int i3 = i2 % 2;
        giSNqX(function1, obj);
        if (i3 != 0) {
            int i4 = 69 / 0;
        }
        int i5 = aKErDB + WalletImportError.ERROR_CODE_GET_EOA_ADDRESS_KEY;
        dNCPSb = i5 % 128;
        Object obj2 = null;
        if (i5 % 2 == 0) {
            return null;
        }
        obj2.hashCode();
        throw null;
    }

    public static /* synthetic */ List KWHzl() {
        int i = 2 % 2;
        int i2 = dNCPSb + 117;
        aKErDB = i2 % 128;
        if (i2 % 2 != 0) {
            return (List) copydefault(zzep.AEQbTJ(), -1833868434, 1833868481, new Object[0], zzep.AEQbTJ(), zzep.AEQbTJ(), zzep.AEQbTJ());
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit KWHzl(int i, DefiWalletMainActivity defiWalletMainActivity, MenuItem menuItem, Integer num) {
        int i2 = 2 % 2;
        int i3 = aKErDB + 123;
        dNCPSb = i3 % 128;
        if (i3 % 2 == 0) {
            return (Unit) copydefault(zzep.AEQbTJ(), 794378107, -794378055, new Object[]{Integer.valueOf(i), defiWalletMainActivity, menuItem, num}, zzep.AEQbTJ(), zzep.AEQbTJ(), zzep.AEQbTJ());
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit KWHzl(DefiWalletMainActivity defiWalletMainActivity) {
        int i = 2 % 2;
        int i2 = dNCPSb + 61;
        aKErDB = i2 % 128;
        int i3 = i2 % 2;
        Unit unitGasjUx = gasjUx(defiWalletMainActivity);
        int i4 = dNCPSb + 109;
        aKErDB = i4 % 128;
        int i5 = i4 % 2;
        return unitGasjUx;
    }

    public static /* synthetic */ Unit KWHzl(DefiWalletMainActivity defiWalletMainActivity, Bundle bundle) {
        int i = 2 % 2;
        int i2 = dNCPSb + 103;
        aKErDB = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = (Unit) copydefault(zzep.AEQbTJ(), -1073514280, 1073514304, new Object[]{defiWalletMainActivity, bundle}, zzep.AEQbTJ(), zzep.AEQbTJ(), zzep.AEQbTJ());
        int i4 = dNCPSb + 69;
        aKErDB = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ Unit KWHzl(DefiWalletMainActivity defiWalletMainActivity, Bundle bundle, AbstractC12782ctV abstractC12782ctV) {
        int i = 2 % 2;
        int i2 = dNCPSb + 31;
        aKErDB = i2 % 128;
        int i3 = i2 % 2;
        Unit unitEZpvd = EZpvd(defiWalletMainActivity, bundle, abstractC12782ctV);
        int i4 = aKErDB + 125;
        dNCPSb = i4 % 128;
        int i5 = i4 % 2;
        return unitEZpvd;
    }

    public static /* synthetic */ Unit KWHzl(DefiWalletMainActivity defiWalletMainActivity, OKComplianceRestrictionService oKComplianceRestrictionService, boolean z) {
        int i = 2 % 2;
        int i2 = dNCPSb + 103;
        aKErDB = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOLrzqt = OLrzqt(defiWalletMainActivity, oKComplianceRestrictionService, z);
        if (i3 == 0) {
            int i4 = 78 / 0;
        }
        return unitOLrzqt;
    }

    public static /* synthetic */ Unit KWHzl(DefiWalletMainActivity defiWalletMainActivity, InterfaceC18198fdq interfaceC18198fdq, MenuItem menuItem, Integer num) {
        int i = 2 % 2;
        int i2 = aKErDB + 85;
        dNCPSb = i2 % 128;
        if (i2 % 2 != 0) {
            AEQbTJ(defiWalletMainActivity, interfaceC18198fdq, menuItem, num);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitAEQbTJ = AEQbTJ(defiWalletMainActivity, interfaceC18198fdq, menuItem, num);
        int i3 = dNCPSb + 3;
        aKErDB = i3 % 128;
        int i4 = i3 % 2;
        return unitAEQbTJ;
    }

    public static /* synthetic */ Unit KWHzl(String str, String str2, String str3, long j, String str4, DefiWalletMainActivity defiWalletMainActivity, String str5, String str6, String str7, String str8, String str9) {
        int i = 2 % 2;
        int i2 = dNCPSb + 87;
        aKErDB = i2 % 128;
        int i3 = i2 % 2;
        Unit unitEZpvd = EZpvd(str, str2, str3, j, str4, defiWalletMainActivity, str5, str6, str7, str8, str9);
        int i4 = aKErDB + 115;
        dNCPSb = i4 % 128;
        int i5 = i4 % 2;
        return unitEZpvd;
    }

    public static /* synthetic */ Unit KWHzl(Throwable th) {
        int i = 2 % 2;
        int i2 = dNCPSb + 69;
        aKErDB = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = (Unit) copydefault(zzep.AEQbTJ(), 1351546829, -1351546751, new Object[]{th}, zzep.AEQbTJ(), zzep.AEQbTJ(), zzep.AEQbTJ());
        int i4 = dNCPSb + 91;
        aKErDB = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ Unit KWHzl(boolean z) {
        int i = 2 % 2;
        int i2 = dNCPSb + 47;
        aKErDB = i2 % 128;
        if (i2 % 2 != 0) {
            return gEmmrt(z);
        }
        gEmmrt(z);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void KWHzl(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = dNCPSb + 35;
        aKErDB = i2 % 128;
        int i3 = i2 % 2;
        ODWQjV(function1, obj);
        if (i3 == 0) {
            int i4 = 20 / 0;
        }
        int i5 = aKErDB + 121;
        dNCPSb = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    public static /* synthetic */ List OLrzqt() {
        int i = 2 % 2;
        int i2 = dNCPSb + 59;
        aKErDB = i2 % 128;
        if (i2 % 2 == 0) {
            AkhnZx();
            throw null;
        }
        List listAkhnZx = AkhnZx();
        int i3 = aKErDB + 27;
        dNCPSb = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 13 / 0;
        }
        return listAkhnZx;
    }

    public static /* synthetic */ Pair OLrzqt(Integer num, AbstractC12782ctV abstractC12782ctV) {
        int i = 2 % 2;
        int i2 = dNCPSb + 75;
        aKErDB = i2 % 128;
        int i3 = i2 % 2;
        Pair pair = (Pair) copydefault(zzep.AEQbTJ(), -1598156196, 1598156256, new Object[]{num, abstractC12782ctV}, zzep.AEQbTJ(), zzep.AEQbTJ(), zzep.AEQbTJ());
        int i4 = aKErDB + 49;
        dNCPSb = i4 % 128;
        int i5 = i4 % 2;
        return pair;
    }

    public static /* synthetic */ Pair OLrzqt(Function2 function2, Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = dNCPSb + 49;
        aKErDB = i2 % 128;
        if (i2 % 2 != 0) {
            return (Pair) copydefault(zzep.AEQbTJ(), -1810538888, 1810538896, new Object[]{function2, obj, obj2}, zzep.AEQbTJ(), zzep.AEQbTJ(), zzep.AEQbTJ());
        }
        Pair pair = (Pair) copydefault(zzep.AEQbTJ(), -1810538888, 1810538896, new Object[]{function2, obj, obj2}, zzep.AEQbTJ(), zzep.AEQbTJ(), zzep.AEQbTJ());
        int i3 = 42 / 0;
        return pair;
    }

    public static /* synthetic */ Unit OLrzqt(Bundle bundle, DefiWalletMainActivity defiWalletMainActivity) {
        int i = 2 % 2;
        int i2 = dNCPSb + 45;
        aKErDB = i2 % 128;
        int i3 = i2 % 2;
        Unit unitKWHzl = KWHzl(bundle, defiWalletMainActivity);
        int i4 = dNCPSb + 49;
        aKErDB = i4 % 128;
        int i5 = i4 % 2;
        return unitKWHzl;
    }

    public static /* synthetic */ Unit OLrzqt(DefiWalletMainActivity defiWalletMainActivity) {
        int i = 2 % 2;
        int i2 = aKErDB + 37;
        dNCPSb = i2 % 128;
        if (i2 % 2 == 0) {
            return gGvvIC(defiWalletMainActivity);
        }
        gGvvIC(defiWalletMainActivity);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit OLrzqt(DefiWalletMainActivity defiWalletMainActivity, Bundle bundle, AbstractC12782ctV abstractC12782ctV) {
        int i = 2 % 2;
        int i2 = aKErDB + 17;
        dNCPSb = i2 % 128;
        int i3 = i2 % 2;
        Unit unitAYXKKw = AYXKKw(defiWalletMainActivity, bundle, abstractC12782ctV);
        int i4 = dNCPSb + 105;
        aKErDB = i4 % 128;
        int i5 = i4 % 2;
        return unitAYXKKw;
    }

    public static /* synthetic */ Unit OLrzqt(DefiWalletMainActivity defiWalletMainActivity, String str) {
        int i = 2 % 2;
        int i2 = aKErDB + 107;
        dNCPSb = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        Unit unit = (Unit) copydefault(zzep.AEQbTJ(), 1019891030, -1019890965, new Object[]{defiWalletMainActivity, str}, zzep.AEQbTJ(), zzep.AEQbTJ(), zzep.AEQbTJ());
        int i3 = dNCPSb + 125;
        aKErDB = i3 % 128;
        int i4 = i3 % 2;
        return unit;
    }

    public static /* synthetic */ Unit OLrzqt(DefiWalletMainActivity defiWalletMainActivity, Throwable th) {
        int i = 2 % 2;
        int i2 = dNCPSb + 57;
        aKErDB = i2 % 128;
        int i3 = i2 % 2;
        Unit unitCopydefault = copydefault(defiWalletMainActivity, th);
        if (i3 == 0) {
            int i4 = 35 / 0;
        }
        int i5 = aKErDB + 97;
        dNCPSb = i5 % 128;
        if (i5 % 2 == 0) {
            return unitCopydefault;
        }
        throw null;
    }

    public static /* synthetic */ Unit OLrzqt(DefiWalletMainActivity defiWalletMainActivity, Function0 function0, Unit unit) {
        int i = 2 % 2;
        int i2 = dNCPSb + 101;
        aKErDB = i2 % 128;
        if (i2 % 2 != 0) {
            return (Unit) copydefault(zzep.AEQbTJ(), -1184429084, 1184429137, new Object[]{defiWalletMainActivity, function0, unit}, zzep.AEQbTJ(), zzep.AEQbTJ(), zzep.AEQbTJ());
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit OLrzqt(DefiWalletMainActivity defiWalletMainActivity, AbstractC12782ctV abstractC12782ctV) {
        int i = 2 % 2;
        int i2 = dNCPSb + 3;
        aKErDB = i2 % 128;
        int i3 = i2 % 2;
        Unit unitFIwbmz = fIwbmz(defiWalletMainActivity, abstractC12782ctV);
        if (i3 == 0) {
            int i4 = 71 / 0;
        }
        int i5 = dNCPSb + 35;
        aKErDB = i5 % 128;
        int i6 = i5 % 2;
        return unitFIwbmz;
    }

    public static /* synthetic */ Unit OLrzqt(DefiWalletMainActivity defiWalletMainActivity, xWR xwr, List list) {
        int i = 2 % 2;
        int i2 = aKErDB + 55;
        dNCPSb = i2 % 128;
        if (i2 % 2 != 0) {
            EZpvd(defiWalletMainActivity, xwr, list);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitEZpvd = EZpvd(defiWalletMainActivity, xwr, list);
        int i3 = aKErDB + 79;
        dNCPSb = i3 % 128;
        int i4 = i3 % 2;
        return unitEZpvd;
    }

    public static /* synthetic */ Unit OLrzqt(DefiWalletMainActivity defiWalletMainActivity, xXT xxt) {
        int i = 2 % 2;
        int i2 = dNCPSb + 91;
        aKErDB = i2 % 128;
        int i3 = i2 % 2;
        Unit unitCopydefault = copydefault(defiWalletMainActivity, xxt);
        int i4 = aKErDB + 1;
        dNCPSb = i4 % 128;
        int i5 = i4 % 2;
        return unitCopydefault;
    }

    public static /* synthetic */ Unit OLrzqt(Throwable th) {
        int i = 2 % 2;
        int i2 = aKErDB + 69;
        dNCPSb = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {th};
        int iAEQbTJ = zzep.AEQbTJ();
        int iAEQbTJ2 = zzep.AEQbTJ();
        int iAEQbTJ3 = zzep.AEQbTJ();
        int iAEQbTJ4 = zzep.AEQbTJ();
        if (i3 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unit = (Unit) copydefault(iAEQbTJ, -1116088909, 1116088944, objArr, iAEQbTJ4, iAEQbTJ2, iAEQbTJ3);
        int i4 = aKErDB + 85;
        dNCPSb = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ void OLrzqt(DefiWalletMainActivity defiWalletMainActivity, Boolean bool) throws Throwable {
        int i = 2 % 2;
        int i2 = aKErDB + 19;
        dNCPSb = i2 % 128;
        if (i2 % 2 != 0) {
            copydefault(zzep.AEQbTJ(), -1395487556, 1395487592, new Object[]{defiWalletMainActivity, bool}, zzep.AEQbTJ(), zzep.AEQbTJ(), zzep.AEQbTJ());
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        copydefault(zzep.AEQbTJ(), -1395487556, 1395487592, new Object[]{defiWalletMainActivity, bool}, zzep.AEQbTJ(), zzep.AEQbTJ(), zzep.AEQbTJ());
        int i3 = dNCPSb + 117;
        aKErDB = i3 % 128;
        int i4 = i3 % 2;
    }

    public static /* synthetic */ void OLrzqt(DefiWalletMainActivity defiWalletMainActivity, List list) {
        int i = 2 % 2;
        int i2 = aKErDB + 27;
        dNCPSb = i2 % 128;
        int i3 = i2 % 2;
        KWHzl(defiWalletMainActivity, list);
        int i4 = dNCPSb + 77;
        aKErDB = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void OLrzqt(Integer num) throws Throwable {
        int i = 2 % 2;
        int i2 = aKErDB + 97;
        dNCPSb = i2 % 128;
        if (i2 % 2 == 0) {
            copydefault(zzep.AEQbTJ(), 230090860, -230090851, new Object[]{num}, zzep.AEQbTJ(), zzep.AEQbTJ(), zzep.AEQbTJ());
            return;
        }
        copydefault(zzep.AEQbTJ(), 230090860, -230090851, new Object[]{num}, zzep.AEQbTJ(), zzep.AEQbTJ(), zzep.AEQbTJ());
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void OLrzqt(Function0 function0) {
        int i = 2 % 2;
        int i2 = dNCPSb + 73;
        aKErDB = i2 % 128;
        int i3 = i2 % 2;
        KWHzl(function0);
        int i4 = aKErDB + 73;
        dNCPSb = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    private static /* synthetic */ Object ORxRYg(Object[] objArr) {
        DefiWalletMainActivity defiWalletMainActivity = (DefiWalletMainActivity) objArr[0];
        AbstractC12782ctV abstractC12782ctV = (AbstractC12782ctV) objArr[1];
        int i = 2 % 2;
        int i2 = dNCPSb + 77;
        aKErDB = i2 % 128;
        int i3 = i2 % 2;
        Unit unitFetchVPNInfo = fetchVPNInfo(defiWalletMainActivity, abstractC12782ctV);
        int i4 = dNCPSb + 95;
        aKErDB = i4 % 128;
        if (i4 % 2 != 0) {
            return unitFetchVPNInfo;
        }
        throw null;
    }

    public static /* synthetic */ void OcIXYQ(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = dNCPSb + 53;
        aKErDB = i2 % 128;
        int i3 = i2 % 2;
        iZzfmt(function1, obj);
        int i4 = aKErDB + 45;
        dNCPSb = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ void QKVWgx(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = aKErDB + 45;
        dNCPSb = i2 % 128;
        int i3 = i2 % 2;
        DarRvM(function1, obj);
        int i4 = aKErDB + 19;
        dNCPSb = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 64 / 0;
        }
    }

    private static /* synthetic */ Object QOLQEE(Object[] objArr) throws Throwable {
        DefiWalletMainActivity defiWalletMainActivity = (DefiWalletMainActivity) objArr[0];
        Integer num = (Integer) objArr[1];
        int i = 2 % 2;
        int i2 = aKErDB + 97;
        dNCPSb = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOLrzqt = OLrzqt(defiWalletMainActivity, num);
        int i4 = dNCPSb + 49;
        aKErDB = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 56 / 0;
        }
        return unitOLrzqt;
    }

    private static /* synthetic */ Object QbewEr(Object[] objArr) {
        String str = (String) objArr[0];
        Integer num = (Integer) objArr[1];
        int i = 2 % 2;
        int i2 = aKErDB + 31;
        dNCPSb = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(num, "");
        if (i3 != 0) {
            int i4 = 95 / 0;
        }
        return str;
    }

    private static /* synthetic */ Object QfsBiF(Object[] objArr) throws Throwable {
        Function1 function1 = (Function1) objArr[0];
        Object obj = objArr[1];
        int i = 2 % 2;
        int i2 = aKErDB + 41;
        dNCPSb = i2 % 128;
        int i3 = i2 % 2;
        copydefault(zzep.AEQbTJ(), 962070565, -962070547, new Object[]{function1, obj}, zzep.AEQbTJ(), zzep.AEQbTJ(), zzep.AEQbTJ());
        int i4 = dNCPSb + 53;
        aKErDB = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 58 / 0;
        }
        return null;
    }

    private static /* synthetic */ Object RcXXUw(Object[] objArr) {
        String str = (String) objArr[0];
        DefiWalletMainActivity defiWalletMainActivity = (DefiWalletMainActivity) objArr[1];
        String str2 = (String) objArr[2];
        Throwable th = (Throwable) objArr[3];
        int i = 2 % 2;
        int i2 = dNCPSb + 23;
        aKErDB = i2 % 128;
        if (i2 % 2 == 0) {
            copydefault(str, defiWalletMainActivity, str2, th);
            throw null;
        }
        Unit unitCopydefault = copydefault(str, defiWalletMainActivity, str2, th);
        int i3 = aKErDB + 77;
        dNCPSb = i3 % 128;
        int i4 = i3 % 2;
        return unitCopydefault;
    }

    public static /* synthetic */ Unit copydefault(DefiWalletMainActivity defiWalletMainActivity, Bundle bundle) {
        int i = 2 % 2;
        int i2 = dNCPSb + 79;
        aKErDB = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOLrzqt = OLrzqt(defiWalletMainActivity, bundle);
        int i4 = aKErDB + 105;
        dNCPSb = i4 % 128;
        int i5 = i4 % 2;
        return unitOLrzqt;
    }

    public static /* synthetic */ Unit copydefault(DefiWalletMainActivity defiWalletMainActivity, OnBackPressedCallback onBackPressedCallback) {
        int i = 2 % 2;
        int i2 = aKErDB + 99;
        dNCPSb = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOLrzqt = OLrzqt(defiWalletMainActivity, onBackPressedCallback);
        if (i3 != 0) {
            int i4 = 81 / 0;
        }
        return unitOLrzqt;
    }

    public static /* synthetic */ Unit copydefault(DefiWalletMainActivity defiWalletMainActivity, Integer num) {
        int i = 2 % 2;
        int i2 = aKErDB + 107;
        dNCPSb = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = (Unit) copydefault(zzep.AEQbTJ(), 247464110, -247464085, new Object[]{defiWalletMainActivity, num}, zzep.AEQbTJ(), zzep.AEQbTJ(), zzep.AEQbTJ());
        int i4 = aKErDB + 57;
        dNCPSb = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ Unit copydefault(DefiWalletMainActivity defiWalletMainActivity, List list, boolean z) {
        int i = 2 % 2;
        int i2 = dNCPSb + 29;
        aKErDB = i2 % 128;
        int i3 = i2 % 2;
        Unit unitEZpvd = EZpvd(defiWalletMainActivity, list, z);
        int i4 = aKErDB + WalletImportError.ERROR_CODE_HARDWARE_ACCOUNT_EXIST;
        dNCPSb = i4 % 128;
        int i5 = i4 % 2;
        return unitEZpvd;
    }

    public static /* synthetic */ Unit copydefault(DefiWalletMainActivity defiWalletMainActivity, Pair pair) {
        int i = 2 % 2;
        int i2 = aKErDB + 105;
        dNCPSb = i2 % 128;
        if (i2 % 2 == 0) {
            return AEQbTJ(defiWalletMainActivity, pair);
        }
        AEQbTJ(defiWalletMainActivity, pair);
        throw null;
    }

    public static /* synthetic */ Unit copydefault(DefiWalletMainActivity defiWalletMainActivity, Function0 function0, Throwable th) {
        int i = 2 % 2;
        int i2 = dNCPSb + 63;
        aKErDB = i2 % 128;
        if (i2 % 2 == 0) {
            KWHzl(defiWalletMainActivity, function0, th);
            throw null;
        }
        Unit unitKWHzl = KWHzl(defiWalletMainActivity, function0, th);
        int i3 = aKErDB + 51;
        dNCPSb = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 2 / 0;
        }
        return unitKWHzl;
    }

    public static /* synthetic */ Unit copydefault(DefiWalletMainActivity defiWalletMainActivity, AbstractC12782ctV abstractC12782ctV) {
        int i = 2 % 2;
        int i2 = dNCPSb + 79;
        aKErDB = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        Unit unit = (Unit) copydefault(zzep.AEQbTJ(), -695497345, 695497395, new Object[]{defiWalletMainActivity, abstractC12782ctV}, zzep.AEQbTJ(), zzep.AEQbTJ(), zzep.AEQbTJ());
        int i3 = dNCPSb + 77;
        aKErDB = i3 % 128;
        int i4 = i3 % 2;
        return unit;
    }

    public static /* synthetic */ Unit copydefault(Throwable th) {
        int i = 2 % 2;
        int i2 = aKErDB + 83;
        dNCPSb = i2 % 128;
        if (i2 % 2 == 0) {
            return values(th);
        }
        values(th);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit copydefault(AbstractC12782ctV abstractC12782ctV) {
        int i = 2 % 2;
        int i2 = aKErDB + WalletImportError.ERROR_CODE_HARDWARE_ACCOUNT_EXIST;
        dNCPSb = i2 % 128;
        int i3 = i2 % 2;
        Unit unitKWHzl = KWHzl(abstractC12782ctV);
        int i4 = dNCPSb + 93;
        aKErDB = i4 % 128;
        int i5 = i4 % 2;
        return unitKWHzl;
    }

    public static /* synthetic */ Unit copydefault(boolean z) {
        int i = 2 % 2;
        int i2 = dNCPSb + 89;
        aKErDB = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {Boolean.valueOf(z)};
        Unit unit = (Unit) copydefault(zzep.AEQbTJ(), 1349411091, -1349411053, objArr, zzep.AEQbTJ(), zzep.AEQbTJ(), zzep.AEQbTJ());
        int i4 = aKErDB + 125;
        dNCPSb = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 39 / 0;
        }
        return unit;
    }

    public static /* synthetic */ void copydefault(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = aKErDB + 35;
        dNCPSb = i2 % 128;
        int i3 = i2 % 2;
        DCJXGO(function1, obj);
        int i4 = dNCPSb + 31;
        aKErDB = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ boolean copydefault(DefiWalletMainActivity defiWalletMainActivity, List list, MenuItem menuItem) {
        int i = 2 % 2;
        int i2 = dNCPSb + WalletImportError.ERROR_CODE_HARDWARE_ACCOUNT_EXIST;
        aKErDB = i2 % 128;
        int i3 = i2 % 2;
        boolean zKWHzl = KWHzl(defiWalletMainActivity, list, menuItem);
        if (i3 == 0) {
            int i4 = 2 / 0;
        }
        int i5 = dNCPSb + 87;
        aKErDB = i5 % 128;
        if (i5 % 2 != 0) {
            return zKWHzl;
        }
        throw null;
    }

    private static /* synthetic */ Object djBIcL(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        Object obj = objArr[1];
        int i = 2 % 2;
        int i2 = dNCPSb + 103;
        aKErDB = i2 % 128;
        int i3 = i2 % 2;
        fvQaOB(function1, obj);
        int i4 = aKErDB + 53;
        dNCPSb = i4 % 128;
        Object obj2 = null;
        if (i4 % 2 == 0) {
            return null;
        }
        obj2.hashCode();
        throw null;
    }

    public static /* synthetic */ List djBIcL() {
        int i = 2 % 2;
        int i2 = dNCPSb + 81;
        aKErDB = i2 % 128;
        int i3 = i2 % 2;
        List listFetchVPNInfo = fetchVPNInfo();
        int i4 = aKErDB + 39;
        dNCPSb = i4 % 128;
        int i5 = i4 % 2;
        return listFetchVPNInfo;
    }

    public static /* synthetic */ Unit djBIcL(DefiWalletMainActivity defiWalletMainActivity, AbstractC12782ctV abstractC12782ctV) {
        int i = 2 % 2;
        int i2 = dNCPSb + 45;
        aKErDB = i2 % 128;
        if (i2 % 2 != 0) {
            return DbNXlk(defiWalletMainActivity, abstractC12782ctV);
        }
        DbNXlk(defiWalletMainActivity, abstractC12782ctV);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit djBIcL(Throwable th) {
        int i = 2 % 2;
        int i2 = dNCPSb + 7;
        aKErDB = i2 % 128;
        if (i2 % 2 != 0) {
            return (Unit) copydefault(zzep.AEQbTJ(), -2049862811, 2049862867, new Object[]{th}, zzep.AEQbTJ(), zzep.AEQbTJ(), zzep.AEQbTJ());
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ InterfaceC58261yxu djBIcL(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = dNCPSb + 57;
        aKErDB = i2 % 128;
        int i3 = i2 % 2;
        InterfaceC58261yxu interfaceC58261yxuFZBcTu = fZBcTu(function1, obj);
        if (i3 == 0) {
            int i4 = 8 / 0;
        }
        return interfaceC58261yxuFZBcTu;
    }

    public static /* synthetic */ Unit ejfBZ(DefiWalletMainActivity defiWalletMainActivity) {
        int i = 2 % 2;
        int i2 = aKErDB + 5;
        dNCPSb = i2 % 128;
        int i3 = i2 % 2;
        Unit unitUeEOUB = UeEOUB(defiWalletMainActivity);
        int i4 = dNCPSb + 107;
        aKErDB = i4 % 128;
        if (i4 % 2 != 0) {
            return unitUeEOUB;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ boolean ejfBZ(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = aKErDB + WalletImportError.ERROR_CODE_HARDWARE_ACCOUNT_EXIST;
        dNCPSb = i2 % 128;
        if (i2 % 2 != 0) {
            DXXBbs(function1, obj);
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        boolean zDXXBbs = DXXBbs(function1, obj);
        int i3 = aKErDB + 51;
        dNCPSb = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 2 / 0;
        }
        return zDXXBbs;
    }

    public static /* synthetic */ Unit fARcdN(DefiWalletMainActivity defiWalletMainActivity) {
        int i = 2 % 2;
        int i2 = aKErDB + 43;
        dNCPSb = i2 % 128;
        if (i2 % 2 != 0) {
            flVtFt(defiWalletMainActivity);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitFlVtFt = flVtFt(defiWalletMainActivity);
        int i3 = aKErDB + 53;
        dNCPSb = i3 % 128;
        int i4 = i3 % 2;
        return unitFlVtFt;
    }

    public static /* synthetic */ Unit fIwbmz(DefiWalletMainActivity defiWalletMainActivity) {
        int i = 2 % 2;
        int i2 = aKErDB + 49;
        dNCPSb = i2 % 128;
        if (i2 % 2 == 0) {
            return fvQaOB(defiWalletMainActivity);
        }
        fvQaOB(defiWalletMainActivity);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void fIwbmz(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = dNCPSb + 29;
        aKErDB = i2 % 128;
        int i3 = i2 % 2;
        QUSxYX(function1, obj);
        int i4 = aKErDB + 123;
        dNCPSb = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public static /* synthetic */ Unit fJNWhG(DefiWalletMainActivity defiWalletMainActivity) {
        int i = 2 % 2;
        int i2 = aKErDB + WalletImportError.ERROR_CODE_HARDWARE_ACCOUNT_EXIST;
        dNCPSb = i2 % 128;
        int i3 = i2 % 2;
        Unit unitFFgQHt = fFgQHt(defiWalletMainActivity);
        if (i3 != 0) {
            int i4 = 27 / 0;
        }
        int i5 = dNCPSb + 43;
        aKErDB = i5 % 128;
        int i6 = i5 % 2;
        return unitFFgQHt;
    }

    public static /* synthetic */ void fJNWhG(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = aKErDB + 27;
        dNCPSb = i2 % 128;
        int i3 = i2 % 2;
        gasjUx(function1, obj);
        int i4 = dNCPSb + 71;
        aKErDB = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public static /* synthetic */ Unit fetchVPNInfo(DefiWalletMainActivity defiWalletMainActivity) {
        int i = 2 % 2;
        int i2 = dNCPSb + 11;
        aKErDB = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIZzfmt = iZzfmt(defiWalletMainActivity);
        int i4 = dNCPSb + 91;
        aKErDB = i4 % 128;
        int i5 = i4 % 2;
        return unitIZzfmt;
    }

    public static /* synthetic */ void fetchVPNInfo(Function1 function1, Object obj) throws Throwable {
        int i = 2 % 2;
        int i2 = aKErDB + 95;
        dNCPSb = i2 % 128;
        int i3 = i2 % 2;
        Object obj2 = null;
        Object[] objArr = {function1, obj};
        int iAEQbTJ = zzep.AEQbTJ();
        if (i3 != 0) {
            copydefault(iAEQbTJ, 789580888, -789580811, objArr, zzep.AEQbTJ(), zzep.AEQbTJ(), zzep.AEQbTJ());
            obj2.hashCode();
            throw null;
        }
        copydefault(iAEQbTJ, 789580888, -789580811, objArr, zzep.AEQbTJ(), zzep.AEQbTJ(), zzep.AEQbTJ());
        int i4 = dNCPSb + 87;
        aKErDB = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    private static /* synthetic */ Object finit(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        Object obj = objArr[1];
        int i = 2 % 2;
        int i2 = aKErDB + 107;
        dNCPSb = i2 % 128;
        int i3 = i2 % 2;
        gGvvIC(function1, obj);
        if (i3 == 0) {
            return null;
        }
        int i4 = 55 / 0;
        return null;
    }

    private static /* synthetic */ Object flVtFt(Object[] objArr) {
        Function2 function2 = (Function2) objArr[0];
        Object obj = objArr[1];
        Object obj2 = objArr[2];
        int i = 2 % 2;
        int i2 = dNCPSb + 79;
        aKErDB = i2 % 128;
        int i3 = i2 % 2;
        AYXKKw(function2, obj, obj2);
        int i4 = dNCPSb + 5;
        aKErDB = i4 % 128;
        Object obj3 = null;
        if (i4 % 2 != 0) {
            return null;
        }
        obj3.hashCode();
        throw null;
    }

    private static /* synthetic */ Object gEmmrt(Object[] objArr) {
        DefiWalletMainActivity defiWalletMainActivity = (DefiWalletMainActivity) objArr[0];
        AbstractC12782ctV abstractC12782ctV = (AbstractC12782ctV) objArr[1];
        int i = 2 % 2;
        int i2 = aKErDB + 91;
        dNCPSb = i2 % 128;
        if (i2 % 2 != 0) {
            values(defiWalletMainActivity, abstractC12782ctV);
            throw null;
        }
        Unit unitValues = values(defiWalletMainActivity, abstractC12782ctV);
        int i3 = aKErDB + 97;
        dNCPSb = i3 % 128;
        int i4 = i3 % 2;
        return unitValues;
    }

    public static /* synthetic */ String gEmmrt(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = aKErDB + WalletImportError.ERROR_CODE_GET_EOA_ADDRESS_KEY;
        dNCPSb = i2 % 128;
        if (i2 % 2 == 0) {
            return (String) copydefault(zzep.AEQbTJ(), 1458616476, -1458616428, new Object[]{function1, obj}, zzep.AEQbTJ(), zzep.AEQbTJ(), zzep.AEQbTJ());
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit gEmmrt(DefiWalletMainActivity defiWalletMainActivity, AbstractC12782ctV abstractC12782ctV) {
        int i = 2 % 2;
        int i2 = aKErDB + 51;
        dNCPSb = i2 % 128;
        if (i2 % 2 != 0) {
            fJNWhG(defiWalletMainActivity, abstractC12782ctV);
            throw null;
        }
        Unit unitFJNWhG = fJNWhG(defiWalletMainActivity, abstractC12782ctV);
        int i3 = dNCPSb + 63;
        aKErDB = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 59 / 0;
        }
        return unitFJNWhG;
    }

    public static /* synthetic */ Unit gEmmrt(Throwable th) {
        int i = 2 % 2;
        int i2 = dNCPSb + 15;
        aKErDB = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = (Unit) copydefault(zzep.AEQbTJ(), -1267693917, 1267693943, new Object[]{th}, zzep.AEQbTJ(), zzep.AEQbTJ(), zzep.AEQbTJ());
        int i4 = dNCPSb + 19;
        aKErDB = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    public static /* synthetic */ C18351fgk gEmmrt(DefiWalletMainActivity defiWalletMainActivity) {
        int i = 2 % 2;
        int i2 = dNCPSb + 31;
        aKErDB = i2 % 128;
        int i3 = i2 % 2;
        C18351fgk c18351fgkQKudOq = QKudOq(defiWalletMainActivity);
        int i4 = aKErDB + 43;
        dNCPSb = i4 % 128;
        if (i4 % 2 == 0) {
            return c18351fgkQKudOq;
        }
        throw null;
    }

    private static /* synthetic */ Object gGvvIC(Object[] objArr) {
        DefiWalletMainActivity defiWalletMainActivity = (DefiWalletMainActivity) objArr[0];
        int i = 2 % 2;
        int i2 = dNCPSb + 89;
        aKErDB = i2 % 128;
        int i3 = i2 % 2;
        Unit unitDNCPSb = dNCPSb(defiWalletMainActivity);
        int i4 = aKErDB + 47;
        dNCPSb = i4 % 128;
        int i5 = i4 % 2;
        return unitDNCPSb;
    }

    private static /* synthetic */ Object gHZMYf(Object[] objArr) {
        DefiWalletMainActivity defiWalletMainActivity = (DefiWalletMainActivity) objArr[0];
        int i = 2 % 2;
        int i2 = dNCPSb + 87;
        aKErDB = i2 % 128;
        if (i2 % 2 == 0) {
            QKVWgx(defiWalletMainActivity);
            throw null;
        }
        Unit unitQKVWgx = QKVWgx(defiWalletMainActivity);
        int i3 = aKErDB + 25;
        dNCPSb = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 20 / 0;
        }
        return unitQKVWgx;
    }

    public static /* synthetic */ void gHZMYf(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = dNCPSb + 121;
        aKErDB = i2 % 128;
        int i3 = i2 % 2;
        Object obj2 = null;
        QfsBiF(function1, obj);
        if (i3 == 0) {
            obj2.hashCode();
            throw null;
        }
        int i4 = dNCPSb + 121;
        aKErDB = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    private static /* synthetic */ Object gasjUx(Object[] objArr) {
        int i = 2 % 2;
        int i2 = aKErDB + 89;
        dNCPSb = i2 % 128;
        if (i2 % 2 == 0) {
            return valueOf();
        }
        valueOf();
        throw null;
    }

    public static /* synthetic */ Unit getFieldNames(DefiWalletMainActivity defiWalletMainActivity) {
        int i = 2 % 2;
        int i2 = dNCPSb + 11;
        aKErDB = i2 % 128;
        if (i2 % 2 != 0) {
            return RcXXUw(defiWalletMainActivity);
        }
        RcXXUw(defiWalletMainActivity);
        throw null;
    }

    public static /* synthetic */ void getFieldNames(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = aKErDB + 115;
        dNCPSb = i2 % 128;
        int i3 = i2 % 2;
        flVtFt(function1, obj);
        if (i3 != 0) {
            throw null;
        }
    }

    private static /* synthetic */ Object getNewProxyInstance(Object[] objArr) {
        DefiWalletMainActivity defiWalletMainActivity = (DefiWalletMainActivity) objArr[0];
        Throwable th = (Throwable) objArr[1];
        int i = 2 % 2;
        int i2 = dNCPSb + 1;
        aKErDB = i2 % 128;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unit = (Unit) copydefault(zzep.AEQbTJ(), 1038050789, -1038050725, new Object[]{defiWalletMainActivity, th}, zzep.AEQbTJ(), zzep.AEQbTJ(), zzep.AEQbTJ());
        int i3 = aKErDB + 65;
        dNCPSb = i3 % 128;
        int i4 = i3 % 2;
        return unit;
    }

    public static /* synthetic */ Unit getNewProxyInstance(DefiWalletMainActivity defiWalletMainActivity) {
        int i = 2 % 2;
        int i2 = dNCPSb + 91;
        aKErDB = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = (Unit) copydefault(zzep.AEQbTJ(), -2072656863, 2072656880, new Object[]{defiWalletMainActivity}, zzep.AEQbTJ(), zzep.AEQbTJ(), zzep.AEQbTJ());
        int i4 = aKErDB + 121;
        dNCPSb = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object giSNqX(Object[] objArr) {
        List list = (List) objArr[0];
        int i = 2 % 2;
        int i2 = aKErDB + 21;
        dNCPSb = i2 % 128;
        int i3 = i2 % 2;
        List listEZpvd = EZpvd(list);
        int i4 = dNCPSb + 1;
        aKErDB = i4 % 128;
        if (i4 % 2 != 0) {
            return listEZpvd;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void hDKMBd(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = dNCPSb + 99;
        aKErDB = i2 % 128;
        int i3 = i2 % 2;
        getPostValueLengthLimit(function1, obj);
        if (i3 != 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    private static /* synthetic */ Object isConnected(Object[] objArr) {
        Function2 function2 = (Function2) objArr[0];
        Object obj = objArr[1];
        Object obj2 = objArr[2];
        int i = 2 % 2;
        int i2 = aKErDB + 63;
        dNCPSb = i2 % 128;
        int i3 = i2 % 2;
        copydefault(function2, obj, obj2);
        int i4 = aKErDB + 47;
        dNCPSb = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    public static /* synthetic */ Unit isConnected(DefiWalletMainActivity defiWalletMainActivity) throws Throwable {
        int i = 2 % 2;
        int i2 = dNCPSb + 81;
        aKErDB = i2 % 128;
        if (i2 % 2 == 0) {
            DAIeex(defiWalletMainActivity);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitDAIeex = DAIeex(defiWalletMainActivity);
        int i3 = aKErDB + 65;
        dNCPSb = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 23 / 0;
        }
        return unitDAIeex;
    }

    public static /* synthetic */ void isConnected(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = aKErDB + 125;
        dNCPSb = i2 % 128;
        int i3 = i2 % 2;
        Object obj2 = null;
        OqFWZa(function1, obj);
        if (i3 != 0) {
            obj2.hashCode();
            throw null;
        }
        int i4 = aKErDB + 105;
        dNCPSb = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        obj2.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit iwGUEr(DefiWalletMainActivity defiWalletMainActivity) {
        int i = 2 % 2;
        int i2 = dNCPSb + WalletImportError.ERROR_CODE_HARDWARE_ACCOUNT_EXIST;
        aKErDB = i2 % 128;
        if (i2 % 2 != 0) {
            return (Unit) copydefault(zzep.AEQbTJ(), 1543451386, -1543451357, new Object[]{defiWalletMainActivity}, zzep.AEQbTJ(), zzep.AEQbTJ(), zzep.AEQbTJ());
        }
        int i3 = 72 / 0;
        return (Unit) copydefault(zzep.AEQbTJ(), 1543451386, -1543451357, new Object[]{defiWalletMainActivity}, zzep.AEQbTJ(), zzep.AEQbTJ(), zzep.AEQbTJ());
    }

    public static /* synthetic */ void iwGUEr(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = dNCPSb + 21;
        aKErDB = i2 % 128;
        int i3 = i2 % 2;
        DAIeex(function1, obj);
        int i4 = aKErDB + 35;
        dNCPSb = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ void sSMYrx(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = dNCPSb + 37;
        aKErDB = i2 % 128;
        int i3 = i2 % 2;
        gkJEwt(function1, obj);
        if (i3 == 0) {
            throw null;
        }
    }

    public static /* synthetic */ Unit uzCIH(DefiWalletMainActivity defiWalletMainActivity) {
        int i = 2 % 2;
        int i2 = dNCPSb + 39;
        aKErDB = i2 % 128;
        if (i2 % 2 != 0) {
            return QUSxYX(defiWalletMainActivity);
        }
        QUSxYX(defiWalletMainActivity);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void uzCIH(Function1 function1, Object obj) throws Throwable {
        int i = 2 % 2;
        int i2 = aKErDB + 53;
        dNCPSb = i2 % 128;
        if (i2 % 2 == 0) {
            copydefault(zzep.AEQbTJ(), -574858646, 574858665, new Object[]{function1, obj}, zzep.AEQbTJ(), zzep.AEQbTJ(), zzep.AEQbTJ());
            return;
        }
        copydefault(zzep.AEQbTJ(), -574858646, 574858665, new Object[]{function1, obj}, zzep.AEQbTJ(), zzep.AEQbTJ(), zzep.AEQbTJ());
        int i3 = 56 / 0;
    }

    private static /* synthetic */ Object valueOf(Object[] objArr) {
        Throwable th = (Throwable) objArr[0];
        int i = 2 % 2;
        int i2 = dNCPSb + 105;
        aKErDB = i2 % 128;
        int i3 = i2 % 2;
        Unit newProxyInstance = getNewProxyInstance(th);
        int i4 = aKErDB + 105;
        dNCPSb = i4 % 128;
        if (i4 % 2 == 0) {
            return newProxyInstance;
        }
        throw null;
    }

    public static /* synthetic */ Unit valueOf(DefiWalletMainActivity defiWalletMainActivity) {
        int i = 2 % 2;
        int i2 = aKErDB + 17;
        dNCPSb = i2 % 128;
        if (i2 % 2 == 0) {
            return finit(defiWalletMainActivity);
        }
        finit(defiWalletMainActivity);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit valueOf(Throwable th) {
        int i = 2 % 2;
        int i2 = dNCPSb + 67;
        aKErDB = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = (Unit) copydefault(zzep.AEQbTJ(), 1012603316, -1012603257, new Object[]{th}, zzep.AEQbTJ(), zzep.AEQbTJ(), zzep.AEQbTJ());
        int i4 = dNCPSb + 97;
        aKErDB = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit values(DefiWalletMainActivity defiWalletMainActivity) {
        int i = 2 % 2;
        int i2 = aKErDB + 67;
        dNCPSb = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            fZBcTu(defiWalletMainActivity);
            throw null;
        }
        Unit unitFZBcTu = fZBcTu(defiWalletMainActivity);
        int i3 = dNCPSb + 115;
        aKErDB = i3 % 128;
        if (i3 % 2 != 0) {
            return unitFZBcTu;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void values(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = aKErDB + 17;
        dNCPSb = i2 % 128;
        int i3 = i2 % 2;
        dNCPSb(function1, obj);
        if (i3 != 0) {
            int i4 = 77 / 0;
        }
    }

    public static /* synthetic */ void wlaJM(DefiWalletMainActivity defiWalletMainActivity) {
        int i = 2 % 2;
        int i2 = dNCPSb + 25;
        aKErDB = i2 % 128;
        int i3 = i2 % 2;
        hUfVAv(defiWalletMainActivity);
        int i4 = dNCPSb + 97;
        aKErDB = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ void wlaJM(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = dNCPSb + 37;
        aKErDB = i2 % 128;
        int i3 = i2 % 2;
        finit(function1, obj);
        int i4 = aKErDB + 15;
        dNCPSb = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 21 / 0;
        }
    }

    private static /* synthetic */ Object zLjUOn(Object[] objArr) {
        DefiWalletMainActivity defiWalletMainActivity = (DefiWalletMainActivity) objArr[0];
        AbstractC12782ctV abstractC12782ctV = (AbstractC12782ctV) objArr[1];
        int i = 2 % 2;
        int i2 = dNCPSb + 123;
        aKErDB = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIsConnected = isConnected(defiWalletMainActivity, abstractC12782ctV);
        int i4 = dNCPSb + 33;
        aKErDB = i4 % 128;
        int i5 = i4 % 2;
        return unitIsConnected;
    }

    public static /* synthetic */ Unit zLjUOn(DefiWalletMainActivity defiWalletMainActivity) {
        int i = 2 % 2;
        int i2 = aKErDB + 99;
        dNCPSb = i2 % 128;
        int i3 = i2 % 2;
        Unit unitGkJEwt = gkJEwt(defiWalletMainActivity);
        int i4 = aKErDB + 25;
        dNCPSb = i4 % 128;
        if (i4 % 2 == 0) {
            return unitGkJEwt;
        }
        throw null;
    }

    public static /* synthetic */ void zuBGHE(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = dNCPSb + 35;
        aKErDB = i2 % 128;
        int i3 = i2 % 2;
        RcXXUw(function1, obj);
        if (i3 == 0) {
            int i4 = 59 / 0;
        }
    }

    @Override // o.AbstractActivityC33041mov, o.InterfaceC33019moZ
    public boolean animOpen() {
        int i = 2 % 2;
        int i2 = dNCPSb + 17;
        aKErDB = i2 % 128;
        int i3 = i2 % 2;
        return false;
    }

    public static final class FragmentManager implements Function1<Core.Model.Error, Unit> {
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(Core.Model.Error error) {
            OLrzqt(error);
            return Unit.INSTANCE;
        }

        public final void OLrzqt(Core.Model.Error error) {
            Intrinsics.checkNotNullParameter(error, "");
            error.getThrowable();
            pUU.AEQbTJ("WalletConnectV2Manager", "initWC  CoreClient initialize", error.getThrowable());
        }
    }

    public static final class Dialog implements Function0<Unit> {
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function0
        public /* synthetic */ Unit invoke() {
            copydefault();
            return Unit.INSTANCE;
        }

        public final void copydefault() {
            pUU.copydefault("WalletConnectV2Manager", "initWC  WalletKit initialize   success");
            C13982dcp.fetchVPNInfo.set(true);
        }
    }

    public static final class Fragment implements Function1<Wallet.Model.Error, Unit> {
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(Wallet.Model.Error error) {
            EZpvd(error);
            return Unit.INSTANCE;
        }

        public final void EZpvd(Wallet.Model.Error error) {
            Intrinsics.checkNotNullParameter(error, "");
            C13982dcp.fetchVPNInfo.set(false);
            error.getThrowable();
            pUU.AEQbTJ("WalletConnectV2Manager", "initWC  WalletKit initialize", error.getThrowable());
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [885=4] */
    public static final Unit gkJEwt(DefiWalletMainActivity defiWalletMainActivity) {
        String str;
        int i = 2 % 2;
        C13982dcp c13982dcp = C13982dcp.AEQbTJ;
        android.app.Application application = defiWalletMainActivity.getApplication();
        Intrinsics.checkNotNullExpressionValue(application, "");
        pUU.KWHzl("WalletConnectV2Manager", "checkInit    isInitialized:" + C13982dcp.fetchVPNInfo);
        if (!C13982dcp.fetchVPNInfo.get()) {
            pUU.KWHzl("WalletConnectV2Manager", "initWC");
            CoreClient coreClient = CoreClient.INSTANCE;
            if (C34703nhO.copydefault()) {
                int i2 = aKErDB + 11;
                dNCPSb = i2 % 128;
                if (i2 % 2 != 0) {
                    int i3 = 97 / 0;
                }
                str = "7f235442ef83a2d6f345f9fdbae72783";
            } else {
                str = "aef737a395c3d77d0df683f9ed219cde";
            }
            String str2 = str;
            int i4 = aKErDB + 45;
            dNCPSb = i4 % 128;
            int i5 = i4 % 2;
            ConnectionType connectionType = ConnectionType.AUTOMATIC;
            String string = application.getString(C13754dXa.FragmentManager.NRYds);
            Intrinsics.checkNotNullExpressionValue(string, "");
            String string2 = application.getString(C13754dXa.FragmentManager.ibnZAm);
            Intrinsics.checkNotNullExpressionValue(string2, "");
            CoreInterface.DefaultImpls.initialize$default((CoreInterface) coreClient, application, str2, new Core.Model.AppMetaData(string, string2, application.getString(C13754dXa.FragmentManager.ONJgbh) + "?version=" + C59449zhJ.replace$default(C32979mnm.EZpvd.EZpvd(), "beta", "", false, 4, (Object) null), yDY.copydefault(C43386roM.EZpvd.EZpvd() + application.getString(C13754dXa.FragmentManager.MediaBrowserCompatSubscriptionCallbackSubscriptionCallbackApi21)), "okx://wallet/wallet/home", null, false, null, 224, null), connectionType, (RelayConnectionInterface) null, (String) null, NetworkClientTimeout.Companion.getDefaultTimeout(), false, (Function1) new FragmentManager(), 48, (Object) null);
            WalletKit walletKit = WalletKit.INSTANCE;
            walletKit.initialize(new Wallet.Params.Init(coreClient), new Dialog(), new Fragment());
            coreClient.setDelegate(C13982dcp.copydefault);
            walletKit.setWalletDelegate(C13982dcp.AkhnZx);
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Unit OLrzqt(DefiWalletMainActivity defiWalletMainActivity, OnBackPressedCallback onBackPressedCallback) {
        int i = 2 % 2;
        int i2 = dNCPSb + 121;
        aKErDB = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(onBackPressedCallback, "");
            if (defiWalletMainActivity.ORxRYg()) {
                int i3 = dNCPSb + 35;
                aKErDB = i3 % 128;
                int i4 = i3 % 2;
                try {
                    defiWalletMainActivity.moveTaskToBack(true);
                    int i5 = aKErDB + 13;
                    dNCPSb = i5 % 128;
                    int i6 = i5 % 2;
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        } else {
            Intrinsics.checkNotNullParameter(onBackPressedCallback, "");
            if (defiWalletMainActivity.ORxRYg()) {
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [919=4] */
    public static final Unit DAIeex(final DefiWalletMainActivity defiWalletMainActivity) throws Throwable {
        int i = 2 % 2;
        int i2 = dNCPSb + 55;
        aKErDB = i2 % 128;
        int i3 = i2 % 2;
        defiWalletMainActivity.AxsJAYaxsJAY();
        defiWalletMainActivity.copydefault.KWHzl(C14564dno.OLrzqt(C14557dnh.StateListAnimator.copydefault));
        copydefault(zzep.AEQbTJ(), -1274408994, 1274409036, new Object[]{defiWalletMainActivity}, zzep.AEQbTJ(), zzep.AEQbTJ(), zzep.AEQbTJ());
        defiWalletMainActivity.getSupportFragmentManager().registerFragmentLifecycleCallbacks(defiWalletMainActivity.DbNXlk, true);
        copydefault(zzep.AEQbTJ(), 804299444, -804299375, new Object[]{defiWalletMainActivity}, zzep.AEQbTJ(), zzep.AEQbTJ(), zzep.AEQbTJ());
        C13021cxw.ActionBar.getInstance$default(C13021cxw.Companion, null, null, 3, null).AEQbTJ(true).DbNXlk();
        OnBackPressedDispatcher onBackPressedDispatcher = defiWalletMainActivity.getOnBackPressedDispatcher();
        if (onBackPressedDispatcher != null) {
            OnBackPressedDispatcherKt.addCallback$default(onBackPressedDispatcher, null, false, new Function1() { // from class: o.dTZ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return DefiWalletMainActivity.copydefault(this.KWHzl, (OnBackPressedCallback) obj);
                }
            }, 3, null);
        }
        Iterator<T> it = defiWalletMainActivity.hDKMBd().iterator();
        while (it.hasNext()) {
            int i4 = aKErDB + 5;
            dNCPSb = i4 % 128;
            if (i4 % 2 != 0) {
                ((InterfaceC9770bbp) it.next()).AEQbTJ(defiWalletMainActivity);
                throw null;
            }
            ((InterfaceC9770bbp) it.next()).AEQbTJ(defiWalletMainActivity);
        }
        if (defiWalletMainActivity.gHZMYf()) {
            defiWalletMainActivity.QfsBiF();
        }
        defiWalletMainActivity.iwGUEr().KWHzl();
        return Unit.INSTANCE;
    }

    public static final void AxsJAYsNCnLh(DefiWalletMainActivity defiWalletMainActivity) {
        int i = 2 % 2;
        int i2 = aKErDB + 9;
        dNCPSb = i2 % 128;
        if (i2 % 2 != 0) {
            rVN.reportFullyDrawn$default((android.app.Activity) defiWalletMainActivity, false, (String) null, 5, (Object) null);
        } else {
            rVN.reportFullyDrawn$default((android.app.Activity) defiWalletMainActivity, true, (String) null, 2, (Object) null);
        }
        int i3 = dNCPSb + 1;
        aKErDB = i3 % 128;
        int i4 = i3 % 2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [933=4] */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v20, resolved type: o.xWN */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0143 A[Catch: all -> 0x0349, TRY_LEAVE, TryCatch #4 {all -> 0x0349, blocks: (B:3:0x003b, B:5:0x0041, B:6:0x0064, B:8:0x0070, B:10:0x00b0, B:12:0x00b9, B:13:0x00e2, B:27:0x027c, B:29:0x028a, B:30:0x0302, B:33:0x0318, B:37:0x0326, B:38:0x032e, B:39:0x0336, B:40:0x0339, B:14:0x0143, B:17:0x01dc, B:19:0x01e2, B:20:0x020b, B:22:0x0212, B:23:0x0246, B:25:0x0253, B:26:0x0277, B:41:0x033a, B:42:0x033f, B:44:0x0341, B:46:0x0347, B:47:0x0348, B:15:0x017f), top: B:119:0x003b, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x04be  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0526  */
    /* JADX WARN: Type inference failed for: r3v28, types: [boolean, int] */
    @Override // o.AbstractActivityC13756dXc, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onCreate(Bundle bundle) throws Throwable {
        Object[] objArr;
        Object[] objArr2;
        Object[] objArr3;
        int i = 2 % 2;
        super.onCreate(bundle);
        ReferralManager.StateListAnimator.getInstance$default(ReferralManager.Companion, null, 1, null).EZpvd();
        addDisposable(AbstractC58260yxt.copydefault(new Callable() { // from class: o.dVI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return DefiWalletMainActivity.zLjUOn(this.EZpvd);
            }
        }).KWHzl(yBP.KWHzl()).OLrzqt(yBP.KWHzl()).bO_());
        try {
            Object objEZpvd = YY.EZpvd(1466271760);
            if (objEZpvd == null) {
                byte b = (byte) 0;
                Object[] objArr4 = new Object[1];
                b($$a[5], b, (byte) (b | 43), objArr4);
                objEZpvd = YY.EZpvd(469, 4, (char) 64485, 1397048684, false, (String) objArr4[0], null);
            }
            long j = ((Field) objEZpvd).getLong(null);
            if (j != -1) {
                long j2 = j + 4611686018427387791L;
                Object[] objArr5 = new Object[1];
                a(null, 127, null, new byte[]{-111, -112, -123, -113, -114, -115, -116, -117, -120, -118, -119, -121, -120, -123, -121, -125, -122, -123, -124, -125, -126, -127}, objArr5);
                Class<?> cls = Class.forName((String) objArr5[0]);
                Object[] objArr6 = new Object[1];
                a(null, 127, null, new byte[]{-116, -115, -122, -117, -113, -127, -116, -109, -125, -116, -120, -110, -127, -113, -116}, objArr6);
                if (j2 >= ((Long) cls.getDeclaredMethod((String) objArr6[0], new Class[0]).invoke(null, new Object[0])).longValue()) {
                    Object objEZpvd2 = YY.EZpvd(574053742);
                    if (objEZpvd2 == null) {
                        byte b2 = $$a[25];
                        Object[] objArr7 = new Object[1];
                        b(b2, (byte) (b2 >>> 2), (byte) ($$b & 87), objArr7);
                        objEZpvd2 = YY.EZpvd(469, 4, (char) 64485, 639078418, false, (String) objArr7[0], null);
                    }
                    Object[] objArr8 = (Object[]) ((Field) objEZpvd2).get(null);
                    int i2 = ((int[]) objArr8[2])[0];
                    int i3 = ((int[]) objArr8[0])[0];
                    String[] strArr = (String[]) objArr8[3];
                    int i4 = ~(System.identityHashCode(this) | 2104387441);
                    int i5 = ((((2103453217 | i4) * (-196)) + 1924165841) + ((i4 | 934224) * CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA256)) - 1356165348;
                    int i6 = (i5 << 13) ^ i5;
                    int i7 = i6 ^ (i6 >>> 17);
                    ((int[]) objArr3[1])[0] = i7 ^ (i7 << 5);
                    objArr3 = new Object[]{new int[]{i3}, new int[1], new int[]{i2}, strArr};
                } else {
                    Object[] objArr9 = new Object[1];
                    a(null, 127, null, new byte[]{-115, -116, -117, -120, -118, -119, -121, -102, -126, -127, -113, -121, -127, -107, -127, -103}, objArr9);
                    Class<?> cls2 = Class.forName((String) objArr9[0]);
                    Object[] objArr10 = new Object[1];
                    a(null, 127, null, new byte[]{-116, -125, -123, -114, -105, -120, -127, -101, -118, -117, -122, -117, -126, -116, -125, -122}, objArr10);
                    try {
                        Object[] objArr11 = {Integer.valueOf(((Integer) cls2.getMethod((String) objArr10[0], Object.class).invoke(null, this)).intValue()), -1356165348};
                        byte[] bArr = $$d;
                        Object[] objArr12 = new Object[1];
                        c(bArr[137], bArr[47], (short) 272, objArr12);
                        Class<?> cls3 = Class.forName((String) objArr12[0]);
                        Object[] objArr13 = new Object[1];
                        c(bArr[3], (byte) (-bArr[151]), bArr[8], objArr13);
                        objArr3 = (Object[]) cls3.getMethod((String) objArr13[0], Integer.TYPE, Integer.TYPE).invoke(null, objArr11);
                        Object objEZpvd3 = YY.EZpvd(574053742);
                        if (objEZpvd3 == null) {
                            byte b3 = $$a[25];
                            Object[] objArr14 = new Object[1];
                            b(b3, (byte) (b3 >>> 2), (byte) ($$b & 87), objArr14);
                            objEZpvd3 = YY.EZpvd(469, 4, (char) 64485, 639078418, false, (String) objArr14[0], null);
                        }
                        ((Field) objEZpvd3).set(null, objArr3);
                        try {
                            Object[] objArr15 = new Object[1];
                            a(null, 127, null, new byte[]{-111, -112, -123, -113, -114, -115, -116, -117, -120, -118, -119, -121, -120, -123, -121, -125, -122, -123, -124, -125, -126, -127}, objArr15);
                            Class<?> cls4 = Class.forName((String) objArr15[0]);
                            Object[] objArr16 = new Object[1];
                            a(null, 127, null, new byte[]{-116, -115, -122, -117, -113, -127, -116, -109, -125, -116, -120, -110, -127, -113, -116}, objArr16);
                            Long lValueOf = Long.valueOf(((Long) cls4.getDeclaredMethod((String) objArr16[0], new Class[0]).invoke(null, new Object[0])).longValue());
                            Object objEZpvd4 = YY.EZpvd(1466271760);
                            if (objEZpvd4 == null) {
                                byte b4 = (byte) 0;
                                Object[] objArr17 = new Object[1];
                                b($$a[5], b4, (byte) (b4 | 43), objArr17);
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
                if (((int[]) objArr3[2])[0] != ((int[]) objArr3[0])[0]) {
                    ArrayList arrayList = new ArrayList();
                    String[] strArr2 = (String[]) objArr3[3];
                    if (strArr2 != null) {
                        int i8 = aKErDB + 71;
                        dNCPSb = i8 % 128;
                        int i9 = i8 % 2;
                        int i10 = 0;
                        while (i10 < strArr2.length) {
                            int i11 = aKErDB + 43;
                            dNCPSb = i11 % 128;
                            if (i11 % 2 != 0) {
                                arrayList.add(strArr2[i10]);
                                i10 += 6;
                            } else {
                                arrayList.add(strArr2[i10]);
                                i10++;
                            }
                        }
                    }
                    throw null;
                }
                int i12 = ((int[]) objArr3[1])[0];
                int i13 = ((int[]) objArr3[2])[0];
                int i14 = ((int[]) objArr3[0])[0];
                String[] strArr3 = (String[]) objArr3[3];
                int iUptimeMillis = (int) SystemClock.uptimeMillis();
                int i15 = i12 + (-98915404) + (((~((-397313) | iUptimeMillis)) | (~(2146906317 | iUptimeMillis))) * 69) + (((~(iUptimeMillis | 1681264841)) | (~((-466038789) | iUptimeMillis)) | 465641476) * (-69)) + 15742509;
                int i16 = (i15 << 13) ^ i15;
                int i17 = i16 ^ (i16 >>> 17);
                ((int[]) objArr[1])[0] = i17 ^ (i17 << 5);
                Object[] objArr18 = {new int[]{i14}, new int[1], new int[]{i13}, strArr3};
                this.zLjUOn = C16325ehm.AEQbTJ(getLayoutInflater());
            }
        } catch (Throwable th2) {
            pUU.AEQbTJ(getTAG(), "onCreate: inflate layout failed", th2);
            this.zLjUOn = C16325ehm.AEQbTJ(getLayoutInflater().inflate(C13754dXa.TaskDescription.AuCTelauCTel, (ViewGroup) null, false));
        }
        C16325ehm c16325ehm = this.zLjUOn;
        setContentView(c16325ehm != null ? c16325ehm.getRoot() : null);
        copydefault(UDOKMarketReferralView.Application.OLrzqt(), -1148523523, 1148523550, new Object[]{this, bundle}, UDOKMarketReferralView.Application.OLrzqt(), zzep.AEQbTJ(), UDOKMarketReferralView.Application.OLrzqt());
        zsXlph();
        copydefault(new Function0() { // from class: o.dVK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return DefiWalletMainActivity.isConnected(this.KWHzl);
            }
        });
        if (C34703nhO.copydefault()) {
            RxBus.KWHzl("event_home_page_created");
        }
        xWN xwn = (xWN) C43251rlk.copydefault(xWN.class);
        xwn.KWHzl(true);
        Object objEZpvd5 = YY.EZpvd(862119861);
        if (objEZpvd5 == null) {
            byte b5 = (byte) ($$a[13] + 1);
            byte b6 = (byte) (-b5);
            Object[] objArr19 = new Object[1];
            b(b5, b6, (byte) (b6 | 52), objArr19);
            objEZpvd5 = YY.EZpvd(129, 4, (char) 39078, 927083209, false, (String) objArr19[0], null);
        }
        long j3 = ((Field) objEZpvd5).getLong(null);
        if (j3 != -1) {
            long j4 = j3 + 1924;
            Object[] objArr20 = new Object[1];
            a(null, 127, null, new byte[]{-111, -112, -123, -113, -114, -115, -116, -117, -120, -118, -119, -121, -120, -123, -121, -125, -122, -123, -124, -125, -126, -127}, objArr20);
            Class<?> cls5 = Class.forName((String) objArr20[0]);
            Object[] objArr21 = new Object[1];
            a(null, 127, null, new byte[]{-116, -115, -122, -117, -113, -127, -116, -109, -125, -116, -120, -110, -127, -113, -116}, objArr21);
            if (j4 >= ((Long) cls5.getDeclaredMethod((String) objArr21[0], new Class[0]).invoke(null, new Object[0])).longValue()) {
                Object objEZpvd6 = YY.EZpvd(2079129037);
                if (objEZpvd6 == null) {
                    byte b7 = $$a[17];
                    byte b8 = (byte) (b7 - 4);
                    Object[] objArr22 = new Object[1];
                    b(b7, b8, (byte) (b8 | 49), objArr22);
                    objEZpvd6 = YY.EZpvd(129, 4, (char) 39078, 2144088241, false, (String) objArr22[0], null);
                }
                Object[] objArr23 = (Object[]) ((Field) objEZpvd6).get(null);
                objArr = new Object[]{new int[1], new int[]{i}, strArr, new int[]{i}};
                int i18 = ((int[]) objArr23[3])[0];
                int i19 = ((int[]) objArr23[1])[0];
                String[] strArr4 = (String[]) objArr23[2];
                int i20 = ((((~(r6 | 1957830762)) * TypedValues.CycleType.TYPE_EASING) - 331645241) + (((~((~((int) Runtime.getRuntime().totalMemory())) | 1957830762)) | 64) * TypedValues.CycleType.TYPE_EASING)) - 1432881512;
                int i21 = (i20 << 13) ^ i20;
                int i22 = i21 ^ (i21 >>> 17);
                ((int[]) objArr[0])[0] = i22 ^ (i22 << 5);
            } else {
                Context baseContext = getBaseContext();
                if (baseContext == null) {
                    int i23 = dNCPSb + 61;
                    aKErDB = i23 % 128;
                    int i24 = i23 % 2;
                    Object[] objArr24 = new Object[1];
                    a(null, 127, null, new byte[]{-125, -127, -116, -124, -105, -106, -118, -117, -122, -107, -122, -117, -112, -108, -121, -110, -110, -127, -121, -125, -122, -123, -124, -125, -126, -127}, objArr24);
                    Class<?> cls6 = Class.forName((String) objArr24[0]);
                    Object[] objArr25 = new Object[1];
                    a(null, 127, null, new byte[]{-126, -123, -122, -117, -127, -112, -122, -113, -110, -110, -108, -117, -126, -116, -124, -124, -104, -112}, objArr25);
                    baseContext = (Context) cls6.getMethod((String) objArr25[0], new Class[0]).invoke(null, null);
                    int i25 = dNCPSb + WalletImportError.ERROR_CODE_HARDWARE_ACCOUNT_EXIST;
                    aKErDB = i25 % 128;
                    int i26 = i25 % 2;
                }
                if (baseContext != null) {
                    if (baseContext instanceof ContextWrapper) {
                        int i27 = dNCPSb + 5;
                        aKErDB = i27 % 128;
                        int i28 = i27 % 2;
                        baseContext = ((ContextWrapper) baseContext).getBaseContext() != null ? baseContext.getApplicationContext() : null;
                    }
                }
                Object[] objArr26 = new Object[1];
                a(null, 127, null, new byte[]{-115, -116, -117, -120, -118, -119, -121, -102, -126, -127, -113, -121, -127, -107, -127, -103}, objArr26);
                Class<?> cls7 = Class.forName((String) objArr26[0]);
                Object[] objArr27 = new Object[1];
                a(null, 127, null, new byte[]{-116, -125, -123, -114, -105, -120, -127, -101, -118, -117, -122, -117, -126, -116, -125, -122}, objArr27);
                int iIntValue = ((Integer) cls7.getMethod((String) objArr27[0], Object.class).invoke(null, this)).intValue();
                Object[] objArr28 = new Object[1];
                a(null, 127, null, new byte[]{-98, -116, -92, -91, -93, -97, -99, -112, -127, -91, -95, -127, -125, -99, -94, -94, -98, -127, -112, -91, -125, -112, -96, -91, -127, -112, -89, -92, -125, -92, -100, -95, -89, -125, -99, -91, -127, -96, -95, -91, -97, -90, -100, -91, -99, -127, -98, -100, -92, -94, -96, -127, -93, -94, -95, -125, -98, -96, -100, -97, -98, -99, -100, -100}, objArr28);
                try {
                    Object[] objArr29 = {baseContext, new String[]{(String) objArr28[0]}, Integer.valueOf(iIntValue), 1, -1432881512};
                    byte[] bArr2 = $$d;
                    Object[] objArr30 = new Object[1];
                    c(bArr2[102], bArr2[47], (short) 322, objArr30);
                    Class<?> cls8 = Class.forName((String) objArr30[0]);
                    Object[] objArr31 = new Object[1];
                    c((byte) (bArr2[3] + 1), bArr2[40], (short) 92, objArr31);
                    objArr = (Object[]) cls8.getMethod((String) objArr31[0], Context.class, String[].class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr29);
                    int i29 = ((int[]) objArr[1])[0];
                    int i30 = ((int[]) objArr[3])[0];
                    if (baseContext != null) {
                        Object objEZpvd7 = YY.EZpvd(2079129037);
                        if (objEZpvd7 == null) {
                            byte b9 = $$a[17];
                            byte b10 = (byte) (b9 - 4);
                            Object[] objArr32 = new Object[1];
                            b(b9, b10, (byte) (b10 | 49), objArr32);
                            objEZpvd7 = YY.EZpvd(129, 4, (char) 39078, 2144088241, false, (String) objArr32[0], null);
                        }
                        ((Field) objEZpvd7).set(null, objArr);
                        try {
                            Object[] objArr33 = new Object[1];
                            a(null, 127, null, new byte[]{-111, -112, -123, -113, -114, -115, -116, -117, -120, -118, -119, -121, -120, -123, -121, -125, -122, -123, -124, -125, -126, -127}, objArr33);
                            Class<?> cls9 = Class.forName((String) objArr33[0]);
                            Object[] objArr34 = new Object[1];
                            a(null, 127, null, new byte[]{-116, -115, -122, -117, -113, -127, -116, -109, -125, -116, -120, -110, -127, -113, -116}, objArr34);
                            Long lValueOf2 = Long.valueOf(((Long) cls9.getDeclaredMethod((String) objArr34[0], new Class[0]).invoke(null, new Object[0])).longValue());
                            Object objEZpvd8 = YY.EZpvd(862119861);
                            if (objEZpvd8 == null) {
                                byte b11 = (byte) ($$a[13] + 1);
                                byte b12 = (byte) (-b11);
                                Object[] objArr35 = new Object[1];
                                b(b11, b12, (byte) (b12 | 52), objArr35);
                                objEZpvd8 = YY.EZpvd(129, 4, (char) 39078, 927083209, false, (String) objArr35[0], null);
                            }
                            ((Field) objEZpvd8).set(null, lValueOf2);
                        } catch (Exception unused2) {
                            throw new RuntimeException();
                        }
                    }
                } catch (Throwable th3) {
                    Throwable cause2 = th3.getCause();
                    if (cause2 == null) {
                        throw th3;
                    }
                    throw cause2;
                }
            }
        }
        int i31 = ((int[]) objArr[1])[0];
        int i32 = ((int[]) objArr[3])[0];
        if (i32 == i31) {
            objArr2 = new Object[]{new int[1], new int[]{i}, strArr, new int[]{i}};
            int i33 = ((int[]) objArr[0])[0];
            int i34 = ((int[]) objArr[3])[0];
            int i35 = ((int[]) objArr[1])[0];
            String[] strArr5 = (String[]) objArr[2];
            int i36 = ~System.identityHashCode(this);
            int i37 = i33 + ((((-1814391025) + (((~(1878915063 | i36)) | 134266948) * (-828))) + ((i36 | 1878915063) * (-828))) - 963511840);
            int i38 = (i37 << 13) ^ i37;
            int i39 = i38 ^ (i38 >>> 17);
            ((int[]) objArr2[0])[0] = i39 ^ (i39 << 5);
        } else {
            ArrayList arrayList2 = new ArrayList();
            String[] strArr6 = (String[]) objArr[2];
            if (strArr6 != null) {
                for (String str : strArr6) {
                    arrayList2.add(str);
                }
            }
            int[] iArr = new int[i32];
            int i40 = i32 - 1;
            iArr[i40] = 1;
            Toast.makeText((Context) null, iArr[((i32 * i40) % 2) - 1], 1).show();
            objArr2 = new Object[]{new int[1], new int[]{i}, strArr, new int[]{i}};
            int i41 = ((int[]) objArr[0])[0];
            int i42 = ((int[]) objArr[3])[0];
            int i43 = ((int[]) objArr[1])[0];
            String[] strArr7 = (String[]) objArr[2];
            int iIdentityHashCode = System.identityHashCode(this);
            int i44 = ~iIdentityHashCode;
            int i45 = (~((-1677479616) | i44)) | 18492;
            int i46 = ~(iIdentityHashCode | 2013163519);
            int i47 = i41 + ((i45 | i46) * (-252)) + 2017841995 + ((i46 | (~(i44 | (-1677461124)))) * 252);
            int i48 = (i47 << 13) ^ i47;
            int i49 = i48 ^ (i48 >>> 17);
            ((int[]) objArr2[0])[0] = i49 ^ (i49 << 5);
        }
        int i50 = ((int[]) objArr2[0])[0];
        int i51 = i50 * i50;
        int i52 = -(1306665506 * i50);
        int i53 = (i51 ^ i52) + ((i51 & i52) << 1);
        int i54 = -(i50 * (-1070626536));
        int i55 = ((i53 & i54) + (i54 | i53)) - 1576099255;
        int i56 = i55 >> 21;
        int i57 = ((i56 ^ (-4095)) + ((i56 & (-4095)) << 1)) / 2048;
        int i58 = (i57 & 1) + (i57 | 1);
        int i59 = ((i55 | i58) << 1) - (i58 ^ i55);
        int i60 = i55 >> 17;
        int i61 = (((i60 | (-65535)) << 1) - (i60 ^ (-65535))) / 32768;
        int i62 = -(((i61 ^ 1) + ((i61 & 1) << 1)) ^ i59);
        int i63 = ((i62 | 1) << 1) - (i62 ^ 1);
        int i64 = ((i63 >> 23) - 1023) / 512;
        xwn.EZpvd(329 / (((-((((i64 | 1) << 1) - (i64 ^ 1)) + 1)) & i63) * 329));
        getWindow().getDecorView().post(new Runnable() { // from class: o.dVL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                DefiWalletMainActivity.AEQbTJ(this.copydefault);
            }
        });
    }

    public static final void ODWQjV(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = aKErDB + 31;
        dNCPSb = i2 % 128;
        int i3 = i2 % 2;
        Object obj2 = null;
        function1.invoke(obj);
        if (i3 != 0) {
            obj2.hashCode();
            throw null;
        }
        int i4 = aKErDB + 35;
        dNCPSb = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        obj2.hashCode();
        throw null;
    }

    public static final Unit EZpvd(DefiWalletMainActivity defiWalletMainActivity, List list, boolean z) {
        int i = 2 % 2;
        int i2 = dNCPSb + 71;
        aKErDB = i2 % 128;
        int i3 = i2 % 2;
        if (z) {
            pUU.EZpvd(defiWalletMainActivity.getTAG(), "testDAppSearchHistoryAPI: Successfully migrated " + list.size() + " DApp items to database");
            try {
                C18943fru.StateListAnimator.getInstance$default(C18943fru.Companion, null, 1, null).EZpvd();
                pUU.EZpvd(defiWalletMainActivity.getTAG(), "testDAppSearchHistoryAPI: Deleted DApp items from SharedPreferences");
            } catch (Exception e) {
                pUU.AEQbTJ(defiWalletMainActivity.getTAG(), "testDAppSearchHistoryAPI: Failed to delete DApp items from SharedPreferences", e);
            }
            SPUtils.put("dapp_history_migration_to_db_completed", Boolean.TRUE, "WEB3_SEARCH_HISTORY");
            pUU.EZpvd(defiWalletMainActivity.getTAG(), "testDAppSearchHistoryAPI: Migration complete - this method won't run again");
        } else {
            pUU.copydefault(defiWalletMainActivity.getTAG(), "testDAppSearchHistoryAPI: Migration failed - will retry on next app launch");
        }
        Unit unit = Unit.INSTANCE;
        int i4 = dNCPSb + 81;
        aKErDB = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [1041=5] */
    public static final Unit EZpvd(final DefiWalletMainActivity defiWalletMainActivity, xWR xwr, final List list) {
        int i = 2 % 2;
        pUU.EZpvd(defiWalletMainActivity.getTAG(), "testDAppSearchHistoryAPI: Got " + list.size() + " DApp history items from SharedPreferences");
        if (list.isEmpty()) {
            int i2 = dNCPSb + 63;
            aKErDB = i2 % 128;
            Object obj = null;
            if (i2 % 2 == 0) {
                pUU.EZpvd(defiWalletMainActivity.getTAG(), "testDAppSearchHistoryAPI: No DApp history to migrate, marking as complete");
                SPUtils.put("dapp_history_migration_to_db_completed", Boolean.TRUE, "WEB3_SEARCH_HISTORY");
                Unit unit = Unit.INSTANCE;
                throw null;
            }
            pUU.EZpvd(defiWalletMainActivity.getTAG(), "testDAppSearchHistoryAPI: No DApp history to migrate, marking as complete");
            SPUtils.put("dapp_history_migration_to_db_completed", Boolean.TRUE, "WEB3_SEARCH_HISTORY");
            Unit unit2 = Unit.INSTANCE;
            int i3 = dNCPSb + 121;
            aKErDB = i3 % 128;
            if (i3 % 2 != 0) {
                return unit2;
            }
            obj.hashCode();
            throw null;
        }
        pUU.EZpvd(defiWalletMainActivity.getTAG(), "testDAppSearchHistoryAPI: Migrating " + list.size() + " DApp items:");
        Intrinsics.copydefault(list);
        int i4 = 0;
        for (Object obj2 : CollectionsKt___CollectionsKt.AhwBna((Iterable) list, 5)) {
            if (i4 < 0) {
                yDY.AYXKKw();
                int i5 = dNCPSb + 49;
                aKErDB = i5 % 128;
                int i6 = i5 % 2;
            }
            C54827xWu c54827xWu = (C54827xWu) obj2;
            pUU.EZpvd(defiWalletMainActivity.getTAG(), "  [" + i4 + "] " + c54827xWu.OLrzqt() + " (" + c54827xWu.KWHzl() + ") - timestamp: " + c54827xWu.EZpvd());
            i4++;
        }
        pUU.EZpvd(defiWalletMainActivity.getTAG(), "testDAppSearchHistoryAPI: Calling updateDAppSearchHistoryTimestamp...");
        xwr.OLrzqt(list, new Function1() { // from class: o.dVN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj3) {
                return DefiWalletMainActivity.copydefault(this.OLrzqt, list, ((java.lang.Boolean) obj3).booleanValue());
            }
        });
        return Unit.INSTANCE;
    }

    public static final void getPostValueLengthLimit(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = aKErDB + 3;
        dNCPSb = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        if (i3 != 0) {
            throw null;
        }
        int i4 = aKErDB + 79;
        dNCPSb = i4 % 128;
        int i5 = i4 % 2;
    }

    public static final Unit gEmmrt(DefiWalletMainActivity defiWalletMainActivity, Throwable th) {
        int i = 2 % 2;
        int i2 = aKErDB + 97;
        dNCPSb = i2 % 128;
        if (i2 % 2 != 0) {
            pUU.AEQbTJ(defiWalletMainActivity.getTAG(), "testDAppSearchHistoryAPI: Error getting DApp search history from SharedPreferences", th);
            int i3 = 59 / 0;
            return Unit.INSTANCE;
        }
        pUU.AEQbTJ(defiWalletMainActivity.getTAG(), "testDAppSearchHistoryAPI: Error getting DApp search history from SharedPreferences", th);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [1050=4] */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001f, code lost:
    
        if (com.okinc.core.util.SPUtils.getBoolean("dapp_history_migration_to_db_completed", false, "WEB3_SEARCH_HISTORY") != false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void QfsBiF() {
        int i = 2 % 2;
        int i2 = aKErDB + 21;
        dNCPSb = i2 % 128;
        try {
            if (i2 % 2 != 0) {
                if (SPUtils.getBoolean("dapp_history_migration_to_db_completed", true, "WEB3_SEARCH_HISTORY")) {
                    int i3 = aKErDB + 37;
                    dNCPSb = i3 % 128;
                    if (i3 % 2 == 0) {
                        pUU.EZpvd(getTAG(), "testDAppSearchHistoryAPI: Migration already completed, skipping");
                        return;
                    } else {
                        pUU.EZpvd(getTAG(), "testDAppSearchHistoryAPI: Migration already completed, skipping");
                        int i4 = 77 / 0;
                        return;
                    }
                }
                final xWR xwr = (xWR) C43251rlk.copydefault(xWR.class);
                pUU.EZpvd(getTAG(), "testDAppSearchHistoryAPI: Starting one-time migration of DApp history from SharedPreferences to database...");
                AbstractC58260yxt<List<C54827xWu>> abstractC58260yxtOLrzqt = xwr.KWHzl().KWHzl(yBP.AEQbTJ()).OLrzqt(C58266yxz.OLrzqt());
                final Function1 function1 = new Function1() { // from class: o.dWi
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return DefiWalletMainActivity.OLrzqt(this.copydefault, xwr, (java.util.List) obj);
                    }
                };
                InterfaceC58227yxM<? super List<C54827xWu>> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.dWo
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.InterfaceC58227yxM
                    public final void accept(java.lang.Object obj) {
                        DefiWalletMainActivity.KWHzl(function1, obj);
                    }
                };
                final Function1 function12 = new Function1() { // from class: o.dWp
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return DefiWalletMainActivity.EZpvd(this.AEQbTJ, (java.lang.Throwable) obj);
                    }
                };
                InterfaceC58217yxC interfaceC58217yxCAEQbTJ = abstractC58260yxtOLrzqt.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.dWq
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.InterfaceC58227yxM
                    public final void accept(java.lang.Object obj) {
                        DefiWalletMainActivity.hDKMBd(function12, obj);
                    }
                });
                addDisposable(interfaceC58217yxCAEQbTJ);
                Intrinsics.copydefault(interfaceC58217yxCAEQbTJ);
            }
        } catch (Exception e) {
            pUU.AEQbTJ(getTAG(), "testDAppSearchHistoryAPI: Exception during migration", e);
            int i5 = aKErDB + 125;
            dNCPSb = i5 % 128;
            int i6 = i5 % 2;
        }
    }

    public static final void DAIeex(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = dNCPSb + 61;
        aKErDB = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        if (i3 == 0) {
            int i4 = 56 / 0;
        }
    }

    public final void copydefault(final Function0<Unit> function0) {
        int i = 2 % 2;
        int i2 = aKErDB + 3;
        dNCPSb = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            if (C12779ctS.KWHzl.KWHzl()) {
                function0.invoke();
                int i3 = dNCPSb + 103;
                aKErDB = i3 % 128;
                int i4 = i3 % 2;
                return;
            }
            AbstractC58260yxt<Unit> abstractC58260yxtDbNXlk = C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null).DbNXlk();
            final Function1 function1 = new Function1() { // from class: o.dVQ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return DefiWalletMainActivity.OLrzqt(this.AEQbTJ, function0, (Unit) obj2);
                }
            };
            InterfaceC58227yxM<? super Unit> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.dVO
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj2) {
                    DefiWalletMainActivity.iwGUEr(function1, obj2);
                }
            };
            final Function1 function12 = new Function1() { // from class: o.dVR
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return DefiWalletMainActivity.copydefault(this.KWHzl, function0, (java.lang.Throwable) obj2);
                }
            };
            abstractC58260yxtDbNXlk.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.dVT
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj2) {
                    DefiWalletMainActivity.AuCTelauCTel(function12, obj2);
                }
            });
            return;
        }
        C12779ctS.KWHzl.KWHzl();
        obj.hashCode();
        throw null;
    }

    public static final void QKudOq(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = dNCPSb + 25;
        aKErDB = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        if (i3 == 0) {
            int i4 = 31 / 0;
        }
        int i5 = dNCPSb + 107;
        aKErDB = i5 % 128;
        int i6 = i5 % 2;
    }

    public static final Unit KWHzl(DefiWalletMainActivity defiWalletMainActivity, Function0 function0, Throwable th) {
        int i = 2 % 2;
        int i2 = dNCPSb + 73;
        aKErDB = i2 % 128;
        int i3 = i2 % 2;
        C12779ctS.KWHzl.copydefault(true);
        C10856bwO.copydefault(defiWalletMainActivity.getTAG(), -1, "MPC wallet update fail", th);
        function0.invoke();
        Unit unit = Unit.INSTANCE;
        int i4 = dNCPSb + 7;
        aKErDB = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.AbstractActivityC33041mov, android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        int i = 2 % 2;
        int i2 = dNCPSb + 125;
        aKErDB = i2 % 128;
        if (i2 % 2 != 0) {
            super.onWindowFocusChanged(z);
            if (this.fJNWhG) {
                this.fJNWhG = false;
                Intent intent = getIntent();
                Intrinsics.checkNotNullExpressionValue(intent, "");
                AEQbTJ(intent);
                xXA.OLrzqt();
                zLjUOn();
                wlaJM();
                AppUpdateService appUpdateService = (AppUpdateService) C43251rlk.copydefault(AppUpdateService.class);
                if (appUpdateService != null) {
                    appUpdateService.checkUpdate(this, true);
                    int i3 = aKErDB + 11;
                    dNCPSb = i3 % 128;
                    if (i3 % 2 != 0) {
                        int i4 = 5 % 4;
                    }
                }
                sSMYrx();
                zuBGHE();
                QVAiDq();
                QUSxYX();
                ejfBZ();
                return;
            }
            return;
        }
        super.onWindowFocusChanged(z);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean gHZMYf() {
        Object objM7377constructorimpl;
        int i = 2 % 2;
        int i2 = aKErDB + 3;
        dNCPSb = i2 % 128;
        int i3 = i2 % 2;
        try {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(Boolean.valueOf(C59449zhJ.equals$default(ABTestManager.AEQbTJ.AEQbTJ("mobile_wallet_search_dapp_history_migration", AmplitudeName.WEB3), "true", false, 2, null)));
        } catch (Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        Boolean bool = Boolean.FALSE;
        if (!(!Result.m7383isFailureimpl(objM7377constructorimpl))) {
            int i4 = dNCPSb + 79;
            aKErDB = i4 % 128;
            if (i4 % 2 == 0) {
                throw null;
            }
            objM7377constructorimpl = bool;
        }
        Boolean bool2 = (Boolean) objM7377constructorimpl;
        boolean zBooleanValue = bool2.booleanValue();
        pUU.KWHzl(getTAG(), "renee feature flag: " + zBooleanValue);
        return bool2.booleanValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(@NotNull Bundle bundle) {
        int i = 2 % 2;
        int i2 = dNCPSb + 69;
        aKErDB = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(bundle, "");
            super.onSaveInstanceState(bundle);
            bundle.putBoolean("show", this.zuBGHE);
        } else {
            Intrinsics.checkNotNullParameter(bundle, "");
            super.onSaveInstanceState(bundle);
            bundle.putBoolean("show", this.zuBGHE);
            int i3 = 83 / 0;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.app.Activity
    public void onRestoreInstanceState(@NotNull Bundle bundle) throws Throwable {
        int i = 2 % 2;
        int i2 = aKErDB + 51;
        dNCPSb = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(bundle, "");
        try {
            super.onRestoreInstanceState(bundle);
        } catch (BadParcelableException e) {
            OLrzqt(e, bundle, EZpvd(bundle, e));
        } catch (Throwable th) {
            throw new Throwable("Failed to restoreInstanceState: " + EZpvd(bundle, th), th);
        }
        this.zuBGHE = bundle.getBoolean("show");
        int i4 = aKErDB + 67;
        dNCPSb = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 95 / 0;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [1123=4] */
    public final void OLrzqt(BadParcelableException badParcelableException, Bundle bundle, String str) {
        Object objM7377constructorimpl;
        int i = 2 % 2;
        int i2 = dNCPSb + 85;
        aKErDB = i2 % 128;
        int i3 = i2 % 2;
        String message = badParcelableException.getMessage();
        if (message != null) {
            Object obj = null;
            String strSubstringAfter$default = StringsKt__StringsKt.substringAfter$default(message, "ClassNotFoundException when unmarshalling: ", (String) null, 2, (Object) null);
            if (strSubstringAfter$default != null) {
                Function0<ClassLoader> function0 = ClassLoaderChecker.INSTANCE.getSavedStateClassLoaders().get(strSubstringAfter$default);
                if (function0 != null) {
                    int i4 = dNCPSb + 59;
                    aKErDB = i4 % 128;
                    if (i4 % 2 == 0) {
                        function0.invoke();
                        obj.hashCode();
                        throw null;
                    }
                    ClassLoader classLoaderInvoke = function0.invoke();
                    if (classLoaderInvoke != null) {
                        try {
                            Result.Application application = Result.Companion;
                            bundle.setClassLoader(classLoaderInvoke);
                            super.onRestoreInstanceState(bundle);
                            objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
                        } catch (Throwable th) {
                            Result.Application application2 = Result.Companion;
                            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                        }
                        if (Result.m7380exceptionOrNullimpl(objM7377constructorimpl) == null) {
                            return;
                        }
                        BadParcelableException badParcelableException2 = new BadParcelableException("Failed to restoreInstanceState with " + classLoaderInvoke + " for " + strSubstringAfter$default + ": " + str);
                        badParcelableException2.initCause(badParcelableException);
                        throw badParcelableException2;
                    }
                }
                BadParcelableException badParcelableException3 = new BadParcelableException("No classLoader for " + strSubstringAfter$default + ": " + str);
                badParcelableException3.initCause(badParcelableException);
                throw badParcelableException3;
            }
        }
        BadParcelableException badParcelableException4 = new BadParcelableException("Canonical name not found: " + str);
        badParcelableException4.initCause(badParcelableException);
        throw badParcelableException4;
    }

    public final void ejfBZ() {
        int i = 2 % 2;
        int i2 = aKErDB + 55;
        dNCPSb = i2 % 128;
        int i3 = i2 % 2;
        ((InterfaceC32807mkZ) C43251rlk.copydefault(InterfaceC32807mkZ.class)).KWHzl(this);
        if (i3 != 0) {
            int i4 = 93 / 0;
        }
    }

    public final String EZpvd(Bundle bundle, Throwable th) {
        int i = 2 % 2;
        String strDumpClassLoaderChecks = ClassLoaderChecker.INSTANCE.dumpClassLoaderChecks(th, bundle.getClassLoader());
        pUU.AEQbTJ(getTAG(), "onRestoreInstanceState: classLoaderDiagnosis=" + strDumpClassLoaderChecks, th);
        C6777aVl.Companion.OLrzqt(th, C56423yEv.EZpvd(C56390yDp.OLrzqt("classLoaderDiagnosis", strDumpClassLoaderChecks)), Boolean.TRUE);
        int i2 = dNCPSb + WalletImportError.ERROR_CODE_GET_EOA_ADDRESS_KEY;
        aKErDB = i2 % 128;
        int i3 = i2 % 2;
        return strDumpClassLoaderChecks;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final boolean DXXBbs(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = dNCPSb + 31;
        aKErDB = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(obj, "");
            return ((Boolean) function1.invoke(obj)).booleanValue();
        }
        Intrinsics.checkNotNullParameter(obj, "");
        ((Boolean) function1.invoke(obj)).booleanValue();
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final boolean KWHzl(xXT xxt) {
        int i = 2 % 2;
        int i2 = aKErDB + 103;
        dNCPSb = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(xxt, "");
            return xxt.OLrzqt();
        }
        Intrinsics.checkNotNullParameter(xxt, "");
        return !xxt.OLrzqt();
    }

    public static final Unit copydefault(DefiWalletMainActivity defiWalletMainActivity, xXT xxt) {
        int i = 2 % 2;
        int i2 = aKErDB + 33;
        dNCPSb = i2 % 128;
        int i3 = i2 % 2;
        ActivityResultLauncher<Context> activityResultLauncherAhwBna = defiWalletMainActivity.AhwBna(false);
        Object obj = null;
        if (activityResultLauncherAhwBna != null) {
            int i4 = aKErDB + 23;
            dNCPSb = i4 % 128;
            int i5 = i4 % 2;
            activityResultLauncherAhwBna.launch(defiWalletMainActivity);
            if (i5 != 0) {
                obj.hashCode();
                throw null;
            }
        }
        Unit unit = Unit.INSTANCE;
        int i6 = aKErDB + 1;
        dNCPSb = i6 % 128;
        if (i6 % 2 == 0) {
            return unit;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static /* synthetic */ Object fFgQHt(Object[] objArr) {
        final DefiWalletMainActivity defiWalletMainActivity = (DefiWalletMainActivity) objArr[0];
        int i = 2 % 2;
        AbstractC58185ywX abstractC58185ywXKWHzl = RxBus.KWHzl(xXT.class, new String[0]);
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        AbstractC58185ywX abstractC58185ywXEZpvd = C58156yvv.EZpvd(abstractC58185ywXKWHzl, defiWalletMainActivity);
        final Function1 function1 = new Function1() { // from class: o.dUm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Boolean.valueOf(DefiWalletMainActivity.AEQbTJ((xXT) obj));
            }
        };
        AbstractC58185ywX abstractC58185ywXKWHzl2 = abstractC58185ywXEZpvd.KWHzl(new InterfaceC58239yxY() { // from class: o.dUp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58239yxY
            public final boolean test(java.lang.Object obj) {
                return DefiWalletMainActivity.ejfBZ(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl2, "");
        yBI.subscribeBy$default(abstractC58185ywXKWHzl2, (Function1) null, (Function0) null, new Function1() { // from class: o.dUl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return DefiWalletMainActivity.OLrzqt(this.AEQbTJ, (xXT) obj);
            }
        }, 3, (Object) null);
        int i2 = dNCPSb + 3;
        aKErDB = i2 % 128;
        int i3 = i2 % 2;
        return null;
    }

    private static /* synthetic */ Object OcIXYQ(Object[] objArr) {
        DefiWalletMainActivity defiWalletMainActivity = (DefiWalletMainActivity) objArr[0];
        int i = 2 % 2;
        Object obj = null;
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(defiWalletMainActivity), null, null, new DefiWalletMainActivity$observeBottomNavigationVisibility$1(defiWalletMainActivity, null), 3, null);
        int i2 = aKErDB + 7;
        dNCPSb = i2 % 128;
        if (i2 % 2 == 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    public final void zLjUOn() {
        int i = 2 % 2;
        int i2 = dNCPSb + 91;
        aKErDB = i2 % 128;
        int i3 = i2 % 2;
        uzCIH().KWHzl();
        int i4 = aKErDB + 49;
        dNCPSb = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void wlaJM() {
        int i = 2 % 2;
        int i2 = dNCPSb + 61;
        aKErDB = i2 % 128;
        int i3 = i2 % 2;
        InterfaceC9851bdQ interfaceC9851bdQ = (InterfaceC9851bdQ) C43251rlk.copydefault(InterfaceC9851bdQ.class);
        interfaceC9851bdQ.AEQbTJ(((C18285ffX) copydefault(zzep.AEQbTJ(), 739293876, -739293856, new Object[]{this}, zzep.AEQbTJ(), zzep.AEQbTJ(), zzep.AEQbTJ())).OLrzqt());
        interfaceC9851bdQ.KWHzl(giSNqX().getNewProxyInstance());
        LiveData<Boolean> liveDataDbNXlk = interfaceC9851bdQ.DbNXlk();
        Intrinsics.copydefault(liveDataDbNXlk, "");
        ((MutableLiveData) liveDataDbNXlk).setValue(Boolean.TRUE);
        int i4 = aKErDB + 67;
        dNCPSb = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 86 / 0;
        }
    }

    private static /* synthetic */ Object iwGUEr(Object[] objArr) {
        DefiWalletMainActivity defiWalletMainActivity = (DefiWalletMainActivity) objArr[0];
        Integer num = (Integer) objArr[1];
        int i = 2 % 2;
        if (num != null) {
            int i2 = aKErDB + 27;
            dNCPSb = i2 % 128;
            if (i2 % 2 != 0) {
                defiWalletMainActivity.KWHzl(num.intValue());
                int i3 = 93 / 0;
            } else {
                defiWalletMainActivity.KWHzl(num.intValue());
            }
            int i4 = dNCPSb + 39;
            aKErDB = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 2 / 5;
            }
        }
        return Unit.INSTANCE;
    }

    private final void AxsJAYaxsJAY() {
        int i = 2 % 2;
        ((C18285ffX) copydefault(zzep.AEQbTJ(), 739293876, -739293856, new Object[]{this}, zzep.AEQbTJ(), zzep.AEQbTJ(), zzep.AEQbTJ())).OLrzqt().observe(this, new SharedElementCallback(new Function1() { // from class: o.dVJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return DefiWalletMainActivity.copydefault(this.copydefault, (java.lang.Integer) obj);
            }
        }));
        fvQaOB().AEQbTJ().observe(this, new SharedElementCallback(new Function1() { // from class: o.dVM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return DefiWalletMainActivity.gEmmrt(this.OLrzqt, (AbstractC12782ctV) obj);
            }
        }));
        int i2 = dNCPSb + 33;
        aKErDB = i2 % 128;
        int i3 = i2 % 2;
    }

    public static final Unit fJNWhG(DefiWalletMainActivity defiWalletMainActivity, AbstractC12782ctV abstractC12782ctV) {
        int i = 2 % 2;
        int i2 = aKErDB + 1;
        dNCPSb = i2 % 128;
        int i3 = i2 % 2;
        defiWalletMainActivity.iwGUEr().gEmmrt().setValue(WalletStatus.DemoWallet);
        Unit unit = Unit.INSTANCE;
        int i4 = dNCPSb + 21;
        aKErDB = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 60 / 0;
        }
        return unit;
    }

    public static final void AxsJAYaxsJAY(DefiWalletMainActivity defiWalletMainActivity) {
        int i = 2 % 2;
        int i2 = dNCPSb + 101;
        aKErDB = i2 % 128;
        int i3 = i2 % 2;
        InterfaceC58217yxC interfaceC58217yxC = defiWalletMainActivity.values;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
        AbstractC58260yxt<AbstractC12782ctV> abstractC58260yxtCopydefault = C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null).copydefault(false);
        final Function1 function1 = new Function1() { // from class: o.dUj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return DefiWalletMainActivity.copydefault((AbstractC12782ctV) obj);
            }
        };
        InterfaceC58227yxM<? super AbstractC12782ctV> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.dUr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) throws java.lang.Throwable {
                DefiWalletMainActivity.EZpvd(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.dUD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return DefiWalletMainActivity.gEmmrt((java.lang.Throwable) obj);
            }
        };
        defiWalletMainActivity.values = abstractC58260yxtCopydefault.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.dUM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                DefiWalletMainActivity.AkhnZx(function12, obj);
            }
        });
        int i4 = aKErDB + 31;
        dNCPSb = i4 % 128;
        int i5 = i4 % 2;
    }

    private static /* synthetic */ Object UeEOUB(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        Object obj = objArr[1];
        int i = 2 % 2;
        int i2 = aKErDB + 25;
        dNCPSb = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        if (i3 == 0) {
            return null;
        }
        int i4 = 29 / 0;
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [3263=5] */
    public static final Unit KWHzl(AbstractC12782ctV abstractC12782ctV) {
        int i = 2 % 2;
        C11205cFp c11205cFp = C11205cFp.EZpvd;
        ArrayList<ChainAddress> arrayListIsConnected = abstractC12782ctV.isConnected();
        ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(arrayListIsConnected, 10));
        Iterator<T> it = arrayListIsConnected.iterator();
        int i2 = dNCPSb + 15;
        aKErDB = i2 % 128;
        int i3 = i2 % 2;
        while (it.hasNext()) {
            int i4 = aKErDB + WalletImportError.ERROR_CODE_GET_EOA_ADDRESS_KEY;
            dNCPSb = i4 % 128;
            if (i4 % 2 != 0) {
                arrayList.add(((ChainAddress) it.next()).getAddress());
                int i5 = 83 / 0;
            } else {
                arrayList.add(((ChainAddress) it.next()).getAddress());
            }
        }
        c11205cFp.OLrzqt(arrayList);
        return Unit.INSTANCE;
    }

    public static final void accept(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = dNCPSb + 49;
        aKErDB = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        if (i3 == 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        int i4 = dNCPSb + 47;
        aKErDB = i4 % 128;
        int i5 = i4 % 2;
    }

    private static /* synthetic */ Object hDKMBd(Object[] objArr) {
        int i = 2 % 2;
        int i2 = dNCPSb + 75;
        aKErDB = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = Unit.INSTANCE;
        int i4 = aKErDB + 105;
        dNCPSb = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 39 / 0;
        }
        return unit;
    }

    public final void sSMYrx() {
        int i = 2 % 2;
        AxsJAYaxsJAY(this);
        AbstractC58185ywX abstractC58185ywXKWHzl = RxBus.KWHzl(C14449dlf.class, new String[0]);
        final Object obj = this.getFieldNames;
        abstractC58185ywXKWHzl.subscribe(new RxBus.EventCallback<C14449dlf>(obj) { // from class: com.okinc.business.defi.wallet.DefiWalletMainActivity$initPushLoginAddress$1
            /* JADX DEBUG: Method merged with bridge method: onEvent(Ljava/lang/Object;)V */
            @Override // com.okinc.rxutils.RxBus.EventCallback
            public void onEvent(C14449dlf c14449dlf) {
                DefiWalletMainActivity.DTwDnp(this.this$0);
            }
        });
        int i2 = aKErDB + 9;
        dNCPSb = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 21 / 0;
        }
    }

    public final void zuBGHE() {
        int i = 2 % 2;
        int i2 = dNCPSb + 69;
        aKErDB = i2 % 128;
        int i3 = i2 % 2;
        C11205cFp.EZpvd.DTwDnp().AEQbTJ(this.gHZMYf);
        int i4 = aKErDB + 13;
        dNCPSb = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 20 / 0;
        }
    }

    public static final Unit OLrzqt(DefiWalletMainActivity defiWalletMainActivity, int i) {
        int i2 = 2 % 2;
        if (i != 1) {
            int i3 = dNCPSb;
            int i4 = i3 + 65;
            aKErDB = i4 % 128;
            if (i4 % 2 != 0 ? i == 2 : i == 4) {
                defiWalletMainActivity.fJNWhG();
            } else {
                int i5 = i3 + 105;
                aKErDB = i5 % 128;
                int i6 = i5 % 2;
            }
        } else {
            defiWalletMainActivity.getContentView(defiWalletMainActivity).setVisibility(0);
        }
        Unit unit = Unit.INSTANCE;
        int i7 = aKErDB + 65;
        dNCPSb = i7 % 128;
        if (i7 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void QVAiDq() {
        int i = 2 % 2;
        int i2 = dNCPSb + 123;
        aKErDB = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        if (this.zuBGHE) {
            this.zuBGHE = false;
            Intent intent = getIntent();
            if (intent != null) {
                int i3 = dNCPSb + 59;
                aKErDB = i3 % 128;
                if (i3 % 2 == 0) {
                    intent.putExtra("show", true);
                } else {
                    intent.putExtra("show", false);
                }
            }
            getContentView(this).setVisibility(4);
            InterfaceC33171mrS.Activity.showAnim$default((InterfaceC33171mrS) C43251rlk.copydefault(InterfaceC33171mrS.class), this, 3, null, null, new Function1() { // from class: o.dTY
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return DefiWalletMainActivity.EZpvd(this.copydefault, ((java.lang.Integer) obj).intValue());
                }
            }, 12, null);
            int i4 = aKErDB + 103;
            dNCPSb = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 2 % 3;
            }
        } else {
            fJNWhG();
        }
        int i6 = dNCPSb + 25;
        aKErDB = i6 % 128;
        int i7 = i6 % 2;
    }

    public final void fJNWhG() {
        int i = 2 % 2;
        final OKComplianceRestrictionService oKComplianceRestrictionService = (OKComplianceRestrictionService) C43251rlk.copydefault(OKComplianceRestrictionService.class);
        pHH.StateListAnimator.fetchLatestFeatureRestrictionStatus$default(oKComplianceRestrictionService, LifecycleOwnerKt.getLifecycleScope(this), null, new Function1() { // from class: o.dUR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return DefiWalletMainActivity.KWHzl(this.AEQbTJ, oKComplianceRestrictionService, ((java.lang.Boolean) obj).booleanValue());
            }
        }, 2, null);
        int i2 = aKErDB + 109;
        dNCPSb = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final Unit QKVWgx(DefiWalletMainActivity defiWalletMainActivity) {
        int i = 2 % 2;
        int i2 = aKErDB + 123;
        dNCPSb = i2 % 128;
        if (i2 % 2 == 0) {
            defiWalletMainActivity.DTwDnp();
            Unit unit = Unit.INSTANCE;
            int i3 = aKErDB + 101;
            dNCPSb = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 25 / 0;
            }
            return unit;
        }
        defiWalletMainActivity.DTwDnp();
        Unit unit2 = Unit.INSTANCE;
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final Unit OLrzqt(FeatureRestrictionInfo featureRestrictionInfo, final DefiWalletMainActivity defiWalletMainActivity, WalletStatus walletStatus) {
        boolean z;
        String countryName;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(walletStatus, "");
        if (walletStatus == WalletStatus.NoWallet) {
            int i2 = aKErDB + WalletImportError.ERROR_CODE_GET_EOA_ADDRESS_KEY;
            int i3 = i2 % 128;
            dNCPSb = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 27;
            aKErDB = i5 % 128;
            int i6 = i5 % 2;
            z = true;
        } else {
            z = false;
        }
        C12806ctt c12806ctt = C12806ctt.copydefault;
        if (featureRestrictionInfo != null) {
            int i7 = aKErDB + 75;
            dNCPSb = i7 % 128;
            int i8 = i7 % 2;
            countryName = featureRestrictionInfo.getCountryName();
        } else {
            countryName = null;
        }
        c12806ctt.AEQbTJ(countryName, z, new Function0() { // from class: o.dWM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                java.lang.Object[] objArr = {this.copydefault};
                return (Unit) DefiWalletMainActivity.copydefault(zzep.AEQbTJ(), -12205524, 12205563, objArr, zzep.AEQbTJ(), zzep.AEQbTJ(), zzep.AEQbTJ());
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(final DefiWalletMainActivity defiWalletMainActivity, OKComplianceRestrictionService oKComplianceRestrictionService, boolean z) {
        int i = 2 % 2;
        pUU.KWHzl(defiWalletMainActivity.getTAG(), "checkForbiddenCountry: state=" + defiWalletMainActivity.getLifecycle().getCurrentState());
        OKComplianceRestrictionService.Feature feature = OKComplianceRestrictionService.Feature.DEFI;
        boolean zOLrzqt = oKComplianceRestrictionService.OLrzqt(feature);
        final FeatureRestrictionInfo featureRestrictionInfoEZpvd = oKComplianceRestrictionService.EZpvd(feature);
        if (zOLrzqt) {
            defiWalletMainActivity.addDisposable(C11607cUn.subscribeOnIO$default(C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null).djBIcL(), (Function1) null, new Function1() { // from class: o.dVW
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return DefiWalletMainActivity.AEQbTJ(featureRestrictionInfoEZpvd, defiWalletMainActivity, (WalletStatus) obj);
                }
            }, 1, (Object) null));
        }
        Unit unit = Unit.INSTANCE;
        int i2 = dNCPSb + WalletImportError.ERROR_CODE_GET_EOA_ADDRESS_KEY;
        aKErDB = i2 % 128;
        int i3 = i2 % 2;
        return unit;
    }

    public final void DTwDnp() {
        int i = 2 % 2;
        int i2 = dNCPSb + WalletImportError.ERROR_CODE_GET_EOA_ADDRESS_KEY;
        aKErDB = i2 % 128;
        int i3 = i2 % 2;
        InterfaceC33171mrS.Activity.switchToCeFi$default((InterfaceC33171mrS) C43251rlk.copydefault(InterfaceC33171mrS.class), this, true, 1, null, null, 24, null);
        int i4 = aKErDB + 99;
        dNCPSb = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 75 / 0;
        }
    }

    public static final class Activity implements Application {
        public final /* synthetic */ Bundle copydefault;

        public Activity(Bundle bundle) {
            this.copydefault = bundle;
        }

        @Override // com.okinc.business.defi.wallet.DefiWalletMainActivity.Application
        public void KWHzl(final String str) {
            Intrinsics.checkNotNullParameter(str, "");
            final DefiWalletMainActivity defiWalletMainActivity = DefiWalletMainActivity.this;
            final Bundle bundle = this.copydefault;
            DefiWalletMainActivity.AEQbTJ(defiWalletMainActivity, new Function0() { // from class: o.dWZ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return DefiWalletMainActivity.Activity.copydefault(defiWalletMainActivity, bundle, str);
                }
            });
        }

        public static final Unit copydefault(DefiWalletMainActivity defiWalletMainActivity, Bundle bundle, String str) throws Throwable {
            Object[] objArr = {defiWalletMainActivity, Integer.valueOf(C18158fdC.Companion.OLrzqt())};
            DefiWalletMainActivity.copydefault(zzep.AEQbTJ(), 1146566760, -1146566723, objArr, zzep.AEQbTJ(), zzep.AEQbTJ(), zzep.AEQbTJ());
            String string = bundle.getString("title");
            if (string == null) {
                string = " ";
            }
            WebActivity.TaskDescription.openPage$default(WebActivity.Companion, defiWalletMainActivity, BundleKt.bundleOf(C56390yDp.OLrzqt("url", str), C56390yDp.OLrzqt("subdomainstrategy", SubdomainStrategy.Global.INSTANCE.toString()), C56390yDp.OLrzqt("title", string)), null, 4, null);
            return Unit.INSTANCE;
        }
    }

    private static /* synthetic */ Object djSkpj(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        Object obj = objArr[1];
        int i = 2 % 2;
        int i2 = dNCPSb + 83;
        aKErDB = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = dNCPSb + 29;
        aKErDB = i4 % 128;
        if (i4 % 2 != 0) {
            return null;
        }
        throw null;
    }

    public static final void gkJEwt(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = dNCPSb + 69;
        aKErDB = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        if (i3 == 0) {
            throw null;
        }
        int i4 = aKErDB + 95;
        dNCPSb = i4 % 128;
        int i5 = i4 % 2;
    }

    public static final Unit EZpvd(xXO xxo) {
        int i = 2 % 2;
        int i2 = aKErDB + 95;
        dNCPSb = i2 % 128;
        if (i2 % 2 == 0) {
            ((xWP) C43251rlk.copydefault(xWP.class)).AEQbTJ();
            return Unit.INSTANCE;
        }
        ((xWP) C43251rlk.copydefault(xWP.class)).AEQbTJ();
        Unit unit = Unit.INSTANCE;
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001d A[PHI: r2
  0x001d: PHI (r2v5 o.ehm) = (r2v4 o.ehm), (r2v33 o.ehm) binds: [B:8:0x001b, B:5:0x0016] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zsXlph() throws Throwable {
        final C16325ehm c16325ehm;
        int i = 2 % 2;
        int i2 = aKErDB + 91;
        dNCPSb = i2 % 128;
        if (i2 % 2 != 0) {
            c16325ehm = this.zLjUOn;
            int i3 = 37 / 0;
            if (c16325ehm != null) {
                ViewCompat.setOnApplyWindowInsetsListener(c16325ehm.OLrzqt, new OnApplyWindowInsetsListener() { // from class: o.dUv
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // androidx.core.view.OnApplyWindowInsetsListener
                    public final WindowInsetsCompat onApplyWindowInsets(android.view.View view, WindowInsetsCompat windowInsetsCompat) {
                        return DefiWalletMainActivity.AEQbTJ(c16325ehm, view, windowInsetsCompat);
                    }
                });
            }
        } else {
            c16325ehm = this.zLjUOn;
            if (c16325ehm != null) {
            }
        }
        if (C17922fXg.OLrzqt() == 0) {
            int i4 = dNCPSb + 69;
            aKErDB = i4 % 128;
            if (i4 % 2 == 0) {
                Object[] objArr = {this, (List) copydefault(zzep.AEQbTJ(), 959873406, -959873363, new Object[]{this}, zzep.AEQbTJ(), zzep.AEQbTJ(), zzep.AEQbTJ())};
                copydefault(zzep.AEQbTJ(), 365413784, -365413761, objArr, zzep.AEQbTJ(), zzep.AEQbTJ(), zzep.AEQbTJ());
            } else {
                Object[] objArr2 = {this, (List) copydefault(zzep.AEQbTJ(), 959873406, -959873363, new Object[]{this}, zzep.AEQbTJ(), zzep.AEQbTJ(), zzep.AEQbTJ())};
                copydefault(zzep.AEQbTJ(), 365413784, -365413761, objArr2, zzep.AEQbTJ(), zzep.AEQbTJ(), zzep.AEQbTJ());
            }
            this.AhwBna = 0;
        } else {
            Object[] objArr3 = {this, getFieldNames()};
            copydefault(zzep.AEQbTJ(), 365413784, -365413761, objArr3, zzep.AEQbTJ(), zzep.AEQbTJ(), zzep.AEQbTJ());
            this.AhwBna = 1;
            int i5 = aKErDB + WalletImportError.ERROR_CODE_GET_EOA_ADDRESS_KEY;
            dNCPSb = i5 % 128;
            int i6 = i5 % 2;
        }
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new DefiWalletMainActivity$handleInitViewData$2(this, null), 3, null);
        AbstractC58185ywX<String> abstractC58185ywXAEQbTJ = RxBus.AEQbTJ("day_night_change");
        final Object obj = this.getFieldNames;
        abstractC58185ywXAEQbTJ.subscribe(new RxBus.EventCallback<String>(obj) { // from class: com.okinc.business.defi.wallet.DefiWalletMainActivity$handleInitViewData$3
            /* JADX DEBUG: Method merged with bridge method: onEvent(Ljava/lang/Object;)V */
            @Override // com.okinc.rxutils.RxBus.EventCallback
            public void onEvent(String str) {
                DefiWalletMainActivity.StateListAnimator stateListAnimator = DefiWalletMainActivity.Companion;
                DefiWalletMainActivity.AEQbTJ(true);
            }
        });
        AbstractC58185ywX abstractC58185ywXKWHzl = RxBus.KWHzl(xXH.class, new String[0]);
        final Object obj2 = this.getFieldNames;
        abstractC58185ywXKWHzl.subscribe(new RxBus.EventCallback<xXH>(obj2) { // from class: com.okinc.business.defi.wallet.DefiWalletMainActivity$handleInitViewData$4
            /* JADX DEBUG: Method merged with bridge method: onEvent(Ljava/lang/Object;)V */
            @Override // com.okinc.rxutils.RxBus.EventCallback
            public void onEvent(xXH xxh) {
                AbstractC12782ctV abstractC12782ctV = (AbstractC12782ctV) CollectionsKt___CollectionsKt.firstOrNull(C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null).copydefault());
                if (abstractC12782ctV != null) {
                    ((dTI) C43251rlk.copydefault(dTI.class)).copydefault(C17922fXg.EZpvd(abstractC12782ctV));
                }
                RxBus.AEQbTJ(new C14390dkZ());
                C13023cxy.Application.getInstance$default(C13023cxy.Companion, null, 1, null).djBIcL();
            }
        });
        AbstractC58185ywX abstractC58185ywXKWHzl2 = RxBus.KWHzl(xXQ.class, new String[0]);
        final Object obj3 = this.getFieldNames;
        abstractC58185ywXKWHzl2.subscribe(new RxBus.EventCallback<xXQ>(obj3) { // from class: com.okinc.business.defi.wallet.DefiWalletMainActivity$handleInitViewData$5
            /* JADX DEBUG: Method merged with bridge method: onEvent(Ljava/lang/Object;)V */
            @Override // com.okinc.rxutils.RxBus.EventCallback
            public void onEvent(xXQ xxq) throws Throwable {
                BottomNavigationView bottomNavigationView;
                if (xxq != null) {
                    DefiWalletMainActivity defiWalletMainActivity = this.this$0;
                    C16325ehm c16325ehmGHZMYf = DefiWalletMainActivity.gHZMYf(defiWalletMainActivity);
                    if (c16325ehmGHZMYf != null && (bottomNavigationView = c16325ehmGHZMYf.OLrzqt) != null) {
                        bottomNavigationView.removeCallbacks(DefiWalletMainActivity.AwvSrB(defiWalletMainActivity));
                    }
                    DefiWalletMainActivity.AwvSrB(defiWalletMainActivity).run();
                    DefiWalletMainActivity.copydefault(zzep.AEQbTJ(), 1146566760, -1146566723, new Object[]{defiWalletMainActivity, Integer.valueOf(xxq.OLrzqt())}, zzep.AEQbTJ(), zzep.AEQbTJ(), zzep.AEQbTJ());
                }
            }
        });
        AbstractC58185ywX<String> abstractC58185ywXAEQbTJ2 = RxBus.AEQbTJ("go2NftPersonalCenter");
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ2, "");
        AbstractC58185ywX abstractC58185ywXOLrzqt = C58156yvv.OLrzqt(abstractC58185ywXAEQbTJ2, this, Lifecycle.Event.ON_DESTROY);
        final Function1 function1 = new Function1() { // from class: o.dUw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj4) {
                return DefiWalletMainActivity.OLrzqt(this.AEQbTJ, (java.lang.String) obj4);
            }
        };
        abstractC58185ywXOLrzqt.AEQbTJ(new InterfaceC58227yxM() { // from class: o.dUE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj4) throws java.lang.Throwable {
                DefiWalletMainActivity.AubY(function1, obj4);
            }
        });
        AbstractC58185ywX abstractC58185ywXKWHzl3 = RxBus.KWHzl(xXO.class, new String[0]);
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl3, "");
        AbstractC58185ywX abstractC58185ywXEZpvd = C58156yvv.EZpvd(abstractC58185ywXKWHzl3, this);
        final Function1 function12 = new Function1() { // from class: o.dUB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj4) {
                return (Unit) DefiWalletMainActivity.copydefault(zzep.AEQbTJ(), -1134665461, 1134665474, new java.lang.Object[]{(xXO) obj4}, zzep.AEQbTJ(), zzep.AEQbTJ(), zzep.AEQbTJ());
            }
        };
        abstractC58185ywXEZpvd.AEQbTJ(new InterfaceC58227yxM() { // from class: o.dUC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj4) {
                DefiWalletMainActivity.sSMYrx(function12, obj4);
            }
        });
        ((xWP) C43251rlk.copydefault(xWP.class)).AEQbTJ();
        if (C33492mxV.OLrzqt()) {
            getWindow().setNavigationBarColor(ContextCompat.getColor(this, C52761wXj.Activity.EZpvd));
        } else if (Build.VERSION.SDK_INT < 27) {
            getWindow().setNavigationBarColor(getResources().getColor(C52761wXj.Activity.DcMfJKDGTeJD));
        } else {
            getWindow().setNavigationBarColor(ContextCompat.getColor(this, C52761wXj.Activity.EZpvd));
            getWindow().getDecorView().setSystemUiVisibility(getWindow().getDecorView().getSystemUiVisibility() | 16);
        }
    }

    public static final class ActionBar implements Application {
        public final /* synthetic */ String AEQbTJ;

        public ActionBar(String str) {
            this.AEQbTJ = str;
        }

        @Override // com.okinc.business.defi.wallet.DefiWalletMainActivity.Application
        public void KWHzl(String str) {
            Intrinsics.checkNotNullParameter(str, "");
            final DefiWalletMainActivity defiWalletMainActivity = DefiWalletMainActivity.this;
            final String str2 = this.AEQbTJ;
            DefiWalletMainActivity.AEQbTJ(defiWalletMainActivity, new Function0() { // from class: o.dWW
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return DefiWalletMainActivity.ActionBar.OLrzqt(defiWalletMainActivity, str2);
                }
            });
        }

        public static final Unit OLrzqt(DefiWalletMainActivity defiWalletMainActivity, String str) {
            C8347bAx c8347bAx = C8347bAx.EZpvd;
            AbstractActivityC33041mov mActivity = defiWalletMainActivity.getMActivity();
            Intrinsics.copydefault((Object) str);
            c8347bAx.EZpvd(mActivity, str);
            return Unit.INSTANCE;
        }
    }

    public static final class PendingIntent implements Application {
        public PendingIntent() {
        }

        @Override // com.okinc.business.defi.wallet.DefiWalletMainActivity.Application
        public void KWHzl(final String str) {
            Intrinsics.checkNotNullParameter(str, "");
            final DefiWalletMainActivity defiWalletMainActivity = DefiWalletMainActivity.this;
            DefiWalletMainActivity.AEQbTJ(defiWalletMainActivity, new Function0() { // from class: o.dWX
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return DefiWalletMainActivity.PendingIntent.KWHzl(defiWalletMainActivity, str);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit KWHzl(DefiWalletMainActivity defiWalletMainActivity, String str) {
            ActivityC16285egz.Companion.KWHzl(defiWalletMainActivity.getMActivity(), str, true, " ");
            return Unit.INSTANCE;
        }
    }

    public static final void copydefault(Function2 function2, Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = dNCPSb + 9;
        aKErDB = i2 % 128;
        int i3 = i2 % 2;
        function2.invoke(obj, obj2);
        if (i3 == 0) {
            int i4 = 79 / 0;
        }
        int i5 = dNCPSb + WalletImportError.ERROR_CODE_GET_EOA_ADDRESS_KEY;
        aKErDB = i5 % 128;
        int i6 = i5 % 2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final Unit OLrzqt(List list, BottomNavigationView bottomNavigationView, DefiWalletMainActivity defiWalletMainActivity, MenuItem menuItem, Integer num) {
        int i = 2 % 2;
        int i2 = dNCPSb + 19;
        aKErDB = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(menuItem, "");
        Intrinsics.checkNotNullParameter(num, "");
        ((InterfaceC18198fdq) list.get(num.intValue())).copydefault(menuItem, bottomNavigationView, defiWalletMainActivity.AuCTel.size() == (num.intValue() * 2) + 1);
        Unit unit = Unit.INSTANCE;
        int i4 = dNCPSb + 93;
        aKErDB = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static final void AYXKKw(Function2 function2, Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = dNCPSb + 17;
        aKErDB = i2 % 128;
        int i3 = i2 % 2;
        function2.invoke(obj, obj2);
        if (i3 == 0) {
            throw null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final Unit AEQbTJ(DefiWalletMainActivity defiWalletMainActivity, InterfaceC18198fdq interfaceC18198fdq, MenuItem menuItem, Integer num) {
        int i = 2 % 2;
        int i2 = aKErDB + WalletImportError.ERROR_CODE_HARDWARE_ACCOUNT_EXIST;
        dNCPSb = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(menuItem, "");
        Intrinsics.checkNotNullParameter(num, "");
        if (num.intValue() == defiWalletMainActivity.AYXKKw) {
            interfaceC18198fdq.valueOf().onNavigationItemSelected(menuItem);
            return Unit.INSTANCE;
        }
        Unit unit = Unit.INSTANCE;
        int i4 = aKErDB + 43;
        dNCPSb = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean KWHzl(final DefiWalletMainActivity defiWalletMainActivity, List list, MenuItem menuItem) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(menuItem, "");
        defiWalletMainActivity.UeEOUB();
        Integer num = defiWalletMainActivity.AuCTel.get(menuItem);
        int iIntValue = num != null ? num.intValue() : defiWalletMainActivity.AYXKKw;
        if (iIntValue == defiWalletMainActivity.AYXKKw) {
            if (defiWalletMainActivity.AxsJAY()) {
                int i2 = aKErDB + 9;
                dNCPSb = i2 % 128;
                int i3 = i2 % 2;
                if (((InterfaceC18198fdq) list.get(defiWalletMainActivity.AYXKKw)).fetchVPNInfo() == C9768bbn.AEQbTJ.copydefault()) {
                    RxBus.AEQbTJ(new xXJ());
                }
            }
            return false;
        }
        if (defiWalletMainActivity.uzCIH) {
            if (iIntValue < ((List) copydefault(zzep.AEQbTJ(), 959873406, -959873363, new Object[]{defiWalletMainActivity}, zzep.AEQbTJ(), zzep.AEQbTJ(), zzep.AEQbTJ())).size()) {
                int i4 = aKErDB + 115;
                dNCPSb = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 45 / 0;
                    if (((InterfaceC18198fdq) list.get(iIntValue)).fetchVPNInfo() == C9768bbn.AEQbTJ.copydefault()) {
                        RxBus.AEQbTJ(new xXG());
                    }
                } else if (((InterfaceC18198fdq) list.get(iIntValue)).fetchVPNInfo() == C9768bbn.AEQbTJ.copydefault()) {
                }
            }
        }
        defiWalletMainActivity.uzCIH = true;
        try {
            InterfaceC18198fdq interfaceC18198fdq = (InterfaceC18198fdq) list.get(iIntValue);
            defiWalletMainActivity.OLrzqt(interfaceC18198fdq);
            boolean z = interfaceC18198fdq.AEQbTJ(defiWalletMainActivity) && interfaceC18198fdq.gEmmrt().onNavigationItemSelected(menuItem);
            Object obj = null;
            if (!(!z)) {
                int i6 = defiWalletMainActivity.AYXKKw;
                if (i6 != -1) {
                    final InterfaceC18198fdq interfaceC18198fdq2 = (InterfaceC18198fdq) list.get(i6);
                    Map<MenuItem, Integer> map = defiWalletMainActivity.AuCTel;
                    final Function2 function2 = new Function2() { // from class: o.dUq
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                            return DefiWalletMainActivity.KWHzl(this.KWHzl, interfaceC18198fdq2, (android.view.MenuItem) obj2, (java.lang.Integer) obj3);
                        }
                    };
                    map.forEach(new BiConsumer() { // from class: o.dUx
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // java.util.function.BiConsumer
                        public final void accept(java.lang.Object obj2, java.lang.Object obj3) throws java.lang.Throwable {
                            java.lang.Object[] objArr = {function2, obj2, obj3};
                            DefiWalletMainActivity.copydefault(zzep.AEQbTJ(), 1372990852, -1372990779, objArr, zzep.AEQbTJ(), zzep.AEQbTJ(), zzep.AEQbTJ());
                        }
                    });
                }
                defiWalletMainActivity.AYXKKw = iIntValue;
                int itemId = menuItem.getItemId();
                OLrzqt = itemId;
                C18199fdr c18199fdr = defiWalletMainActivity.djBIcL;
                if (c18199fdr != null) {
                    int i7 = dNCPSb + 37;
                    aKErDB = i7 % 128;
                    if (i7 % 2 == 0) {
                        C18158fdC.Companion.OLrzqt();
                        obj.hashCode();
                        throw null;
                    }
                    c18199fdr.AEQbTJ(iIntValue, itemId == C18158fdC.Companion.OLrzqt() ? defiWalletMainActivity.AwvSrB : false);
                    int i8 = dNCPSb + 109;
                    aKErDB = i8 % 128;
                    if (i8 % 2 == 0) {
                        int i9 = 4 / 4;
                    }
                }
            }
            if (((InterfaceC18198fdq) list.get(iIntValue)).fetchVPNInfo() == C9768bbn.copydefault) {
                int i10 = aKErDB + 87;
                dNCPSb = i10 % 128;
                if (i10 % 2 != 0) {
                    ((gKO) C43251rlk.copydefault(gKO.class)).OLrzqt(defiWalletMainActivity);
                    obj.hashCode();
                    throw null;
                }
                ((gKO) C43251rlk.copydefault(gKO.class)).OLrzqt(defiWalletMainActivity);
            }
            return z;
        } catch (Exception e) {
            C6777aVl.Companion.EZpvd(new Exception("currentItemIndex : " + iIntValue, e));
            return true;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [1571=4] */
    public static final void KWHzl(DefiWalletMainActivity defiWalletMainActivity, List list) {
        Menu menu;
        int i = 2 % 2;
        int i2 = dNCPSb + 93;
        int i3 = i2 % 128;
        aKErDB = i3;
        int i4 = i2 % 2;
        C16325ehm c16325ehm = defiWalletMainActivity.zLjUOn;
        if (c16325ehm != null) {
            int i5 = i3 + 61;
            dNCPSb = i5 % 128;
            int i6 = i5 % 2;
            BottomNavigationView bottomNavigationView = c16325ehm.OLrzqt;
            if (bottomNavigationView != null) {
                int i7 = aKErDB + 75;
                dNCPSb = i7 % 128;
                if (i7 % 2 != 0) {
                    menu = bottomNavigationView.getMenu();
                    int i8 = 22 / 0;
                    if (menu == null) {
                        return;
                    }
                } else {
                    menu = bottomNavigationView.getMenu();
                    if (menu == null) {
                        return;
                    }
                }
                MenuItem menuItemFindItem = menu.findItem(OLrzqt);
                if (menuItemFindItem != null) {
                    ((InterfaceC18198fdq) list.get(defiWalletMainActivity.AYXKKw)).gEmmrt().onNavigationItemSelected(menuItemFindItem);
                    int i9 = dNCPSb + 95;
                    aKErDB = i9 % 128;
                    int i10 = i9 % 2;
                }
            }
        }
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.fdr.navigateToTab$default(o.fdr, int, boolean, int, java.lang.Object):void */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009c A[PHI: r10
  0x009c: PHI (r10v18 com.google.android.material.bottomnavigation.BottomNavigationView) = 
  (r10v17 com.google.android.material.bottomnavigation.BottomNavigationView)
  (r10v21 com.google.android.material.bottomnavigation.BottomNavigationView)
 binds: [B:33:0x009a, B:30:0x0095] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01c4 A[PHI: r4
  0x01c4: PHI (r4v25 com.google.android.material.bottomnavigation.BottomNavigationView) = 
  (r4v24 com.google.android.material.bottomnavigation.BottomNavigationView)
  (r4v26 com.google.android.material.bottomnavigation.BottomNavigationView)
 binds: [B:72:0x01c2, B:69:0x01bd] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0208 A[PHI: r4
  0x0208: PHI (r4v17 com.google.android.material.bottomnavigation.BottomNavigationView) = 
  (r4v16 com.google.android.material.bottomnavigation.BottomNavigationView)
  (r4v18 com.google.android.material.bottomnavigation.BottomNavigationView)
 binds: [B:91:0x0206, B:88:0x0201] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object fJNWhG(Object[] objArr) {
        BottomNavigationView bottomNavigationView;
        BottomNavigationView bottomNavigationView2;
        BottomNavigationView bottomNavigationView3;
        BottomNavigationView bottomNavigationView4;
        final BottomNavigationView bottomNavigationView5;
        BottomNavigationView bottomNavigationView6;
        BottomNavigationView bottomNavigationView7;
        BottomNavigationView bottomNavigationView8;
        final DefiWalletMainActivity defiWalletMainActivity = (DefiWalletMainActivity) objArr[0];
        final List list = (List) objArr[1];
        int i = 2 % 2;
        C18199fdr c18199fdr = defiWalletMainActivity.djBIcL;
        if (c18199fdr == null) {
            ArrayList arrayList = new ArrayList(list);
            androidx.fragment.app.FragmentManager supportFragmentManager = defiWalletMainActivity.getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
            defiWalletMainActivity.djBIcL = new C18199fdr(arrayList, supportFragmentManager, C13754dXa.ActionBar.getItem);
        } else if (c18199fdr != null) {
            c18199fdr.EZpvd(new ArrayList<>(list));
        }
        defiWalletMainActivity.AuCTel.clear();
        C16325ehm c16325ehm = defiWalletMainActivity.zLjUOn;
        if (c16325ehm != null && (bottomNavigationView8 = c16325ehm.OLrzqt) != null) {
            int i2 = dNCPSb + 63;
            aKErDB = i2 % 128;
            int i3 = i2 % 2;
            Menu menu = bottomNavigationView8.getMenu();
            if (menu != null) {
                menu.clear();
            }
        }
        C16325ehm c16325ehm2 = defiWalletMainActivity.zLjUOn;
        if (c16325ehm2 != null && (bottomNavigationView7 = c16325ehm2.OLrzqt) != null) {
            int i4 = dNCPSb + 23;
            aKErDB = i4 % 128;
            int i5 = i4 % 2;
            bottomNavigationView7.setContentDescription("AppTabbar");
        }
        int iFetchVPNInfo = C9768bbn.gEmmrt;
        int i6 = 0;
        int i7 = 0;
        for (Object obj : list) {
            if (i7 < 0) {
                yDY.AYXKKw();
            }
            InterfaceC18198fdq interfaceC18198fdq = (InterfaceC18198fdq) obj;
            C16325ehm c16325ehm3 = defiWalletMainActivity.zLjUOn;
            if (c16325ehm3 != null) {
                int i8 = dNCPSb + 75;
                aKErDB = i8 % 128;
                if (i8 % 2 == 0) {
                    bottomNavigationView6 = c16325ehm3.OLrzqt;
                    int i9 = 73 / 0;
                    if (bottomNavigationView6 != null) {
                        defiWalletMainActivity.AuCTel.put(interfaceC18198fdq.EZpvd(bottomNavigationView6), Integer.valueOf(i7));
                        if (OLrzqt == interfaceC18198fdq.fetchVPNInfo()) {
                            iFetchVPNInfo = interfaceC18198fdq.fetchVPNInfo();
                            i6 = i7;
                        }
                    }
                } else {
                    bottomNavigationView6 = c16325ehm3.OLrzqt;
                    if (bottomNavigationView6 != null) {
                    }
                }
            }
            i7++;
            int i10 = dNCPSb + 41;
            aKErDB = i10 % 128;
            int i11 = i10 % 2;
        }
        OLrzqt = iFetchVPNInfo;
        defiWalletMainActivity.AYXKKw = i6;
        C16325ehm c16325ehm4 = defiWalletMainActivity.zLjUOn;
        if (c16325ehm4 != null && (bottomNavigationView5 = c16325ehm4.OLrzqt) != null) {
            Map<MenuItem, Integer> map = defiWalletMainActivity.AuCTel;
            final Function2 function2 = new Function2() { // from class: o.dUZ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                    return DefiWalletMainActivity.AEQbTJ(list, bottomNavigationView5, defiWalletMainActivity, (android.view.MenuItem) obj2, (java.lang.Integer) obj3);
                }
            };
            map.forEach(new BiConsumer() { // from class: o.dVa
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.util.function.BiConsumer
                public final void accept(java.lang.Object obj2, java.lang.Object obj3) throws java.lang.Throwable {
                    java.lang.Object[] objArr2 = {function2, obj2, obj3};
                    DefiWalletMainActivity.copydefault(zzep.AEQbTJ(), 650988629, -650988615, objArr2, zzep.AEQbTJ(), zzep.AEQbTJ(), zzep.AEQbTJ());
                }
            });
        }
        C16325ehm c16325ehm5 = defiWalletMainActivity.zLjUOn;
        if (c16325ehm5 != null && (bottomNavigationView4 = c16325ehm5.OLrzqt) != null) {
            int size = bottomNavigationView4.getMenu().size();
            for (int i12 = 0; i12 < size; i12++) {
                int i13 = aKErDB + 75;
                dNCPSb = i13 % 128;
                int i14 = i13 % 2;
                MenuItem item = bottomNavigationView4.getMenu().getItem(i12);
                View viewFindViewById = ((NavigationBarItemView) bottomNavigationView4.findViewById(item.getItemId())).findViewById(R.id.navigation_bar_item_icon_view);
                if (item.getItemId() == C18170fdO.Companion.EZpvd() && defiWalletMainActivity.AxsJAY()) {
                    Intrinsics.copydefault(viewFindViewById);
                    ViewGroup.LayoutParams layoutParams = viewFindViewById.getLayoutParams();
                    if (layoutParams == null) {
                        throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                    }
                    FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                    Context context = bottomNavigationView4.getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "");
                    layoutParams2.width = C55298xhM.OLrzqt(44, context);
                    Context context2 = bottomNavigationView4.getContext();
                    Intrinsics.checkNotNullExpressionValue(context2, "");
                    layoutParams2.height = C55298xhM.OLrzqt(44, context2);
                    Context context3 = bottomNavigationView4.getContext();
                    Intrinsics.checkNotNullExpressionValue(context3, "");
                    layoutParams2.bottomMargin = C55298xhM.OLrzqt(22, context3);
                    viewFindViewById.setLayoutParams(layoutParams2);
                    defiWalletMainActivity.OLrzqt(bottomNavigationView4);
                } else {
                    Intrinsics.copydefault(viewFindViewById);
                    ViewGroup.LayoutParams layoutParams3 = viewFindViewById.getLayoutParams();
                    if (layoutParams3 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                    }
                    FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) layoutParams3;
                    Context context4 = bottomNavigationView4.getContext();
                    Intrinsics.checkNotNullExpressionValue(context4, "");
                    layoutParams4.width = C55298xhM.OLrzqt(24, context4);
                    Context context5 = bottomNavigationView4.getContext();
                    Intrinsics.checkNotNullExpressionValue(context5, "");
                    layoutParams4.height = C55298xhM.OLrzqt(24, context5);
                    Context context6 = bottomNavigationView4.getContext();
                    Intrinsics.checkNotNullExpressionValue(context6, "");
                    layoutParams4.bottomMargin = C55298xhM.OLrzqt(0, context6);
                    viewFindViewById.setLayoutParams(layoutParams4);
                }
            }
        }
        C16325ehm c16325ehm6 = defiWalletMainActivity.zLjUOn;
        if (c16325ehm6 != null) {
            int i15 = aKErDB + 25;
            dNCPSb = i15 % 128;
            if (i15 % 2 != 0) {
                bottomNavigationView3 = c16325ehm6.OLrzqt;
                int i16 = 14 / 0;
                if (bottomNavigationView3 != null) {
                    bottomNavigationView3.setLabelVisibilityMode(1);
                }
            } else {
                bottomNavigationView3 = c16325ehm6.OLrzqt;
                if (bottomNavigationView3 != null) {
                }
            }
        }
        C16325ehm c16325ehm7 = defiWalletMainActivity.zLjUOn;
        if (c16325ehm7 != null && (bottomNavigationView2 = c16325ehm7.OLrzqt) != null) {
            bottomNavigationView2.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() { // from class: o.dVd
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // com.google.android.material.navigation.NavigationBarView.OnItemSelectedListener
                public final boolean onNavigationItemSelected(android.view.MenuItem menuItem) {
                    return DefiWalletMainActivity.copydefault(this.KWHzl, list, menuItem);
                }
            });
        }
        if (defiWalletMainActivity.AuCTel.size() % 2 != 1 || defiWalletMainActivity.AYXKKw != defiWalletMainActivity.AuCTel.size() / 2) {
            defiWalletMainActivity.fARcdN = false;
            C16325ehm c16325ehm8 = defiWalletMainActivity.zLjUOn;
            if (c16325ehm8 != null) {
                int i17 = aKErDB + 15;
                dNCPSb = i17 % 128;
                if (i17 % 2 != 0) {
                    bottomNavigationView = c16325ehm8.OLrzqt;
                    int i18 = 74 / 0;
                    if (bottomNavigationView != null) {
                        bottomNavigationView.setSelectedItemId(OLrzqt);
                    }
                } else {
                    bottomNavigationView = c16325ehm8.OLrzqt;
                    if (bottomNavigationView != null) {
                    }
                }
            }
            defiWalletMainActivity.fetchVPNInfo.postDelayed(new Runnable() { // from class: o.dVb
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    DefiWalletMainActivity.OLrzqt(this.EZpvd, list);
                }
            }, 0L);
            int i19 = aKErDB + 1;
            dNCPSb = i19 % 128;
            int i20 = i19 % 2;
        }
        C18199fdr c18199fdr2 = defiWalletMainActivity.djBIcL;
        if (c18199fdr2 != null) {
            C18199fdr.navigateToTab$default(c18199fdr2, defiWalletMainActivity.AYXKKw, false, 2, null);
        }
        C16325ehm c16325ehm9 = defiWalletMainActivity.zLjUOn;
        if (c16325ehm9 != null) {
            int i21 = dNCPSb + 49;
            aKErDB = i21 % 128;
            if (i21 % 2 == 0) {
                BottomNavigationView bottomNavigationView9 = c16325ehm9.OLrzqt;
                throw null;
            }
            BottomNavigationView bottomNavigationView10 = c16325ehm9.OLrzqt;
            if (bottomNavigationView10 != null) {
                int size2 = bottomNavigationView10.getMenu().size();
                for (int i22 = 0; i22 < size2; i22++) {
                    bottomNavigationView10.findViewById(bottomNavigationView10.getMenu().getItem(i22).getItemId()).setOnLongClickListener(new View.OnLongClickListener() { // from class: o.dVi
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // android.view.View.OnLongClickListener
                        public final boolean onLongClick(android.view.View view) {
                            return ((java.lang.Boolean) DefiWalletMainActivity.copydefault(zzep.AEQbTJ(), -712509449, 712509477, new java.lang.Object[]{view}, zzep.AEQbTJ(), zzep.AEQbTJ(), zzep.AEQbTJ())).booleanValue();
                        }
                    });
                }
            }
        }
        return null;
    }

    public final void OLrzqt(ViewGroup viewGroup) {
        int i = 2 % 2;
        viewGroup.setClipChildren(false);
        viewGroup.setClipToPadding(false);
        int childCount = viewGroup.getChildCount();
        int i2 = 0;
        while (i2 < childCount) {
            View childAt = viewGroup.getChildAt(i2);
            if (!(!(childAt instanceof ViewGroup))) {
                ViewGroup viewGroup2 = (ViewGroup) childAt;
                viewGroup2.setClipChildren(false);
                viewGroup2.setClipToPadding(false);
                OLrzqt(viewGroup2);
            }
            i2++;
            int i3 = dNCPSb + 73;
            aKErDB = i3 % 128;
            int i4 = i3 % 2;
        }
        int i5 = dNCPSb + 39;
        aKErDB = i5 % 128;
        int i6 = i5 % 2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [1602=5] */
    public static final void hUfVAv(DefiWalletMainActivity defiWalletMainActivity) {
        BottomNavigationView bottomNavigationView;
        int i = 2 % 2;
        C16325ehm c16325ehm = defiWalletMainActivity.zLjUOn;
        if (c16325ehm != null && (bottomNavigationView = c16325ehm.OLrzqt) != null) {
            int i2 = aKErDB + WalletImportError.ERROR_CODE_HARDWARE_ACCOUNT_EXIST;
            dNCPSb = i2 % 128;
            int i3 = i2 % 2;
            Menu menu = bottomNavigationView.getMenu();
            if (menu != null) {
                int size = menu.size();
                int i4 = 0;
                while (i4 < size) {
                    int i5 = aKErDB + 1;
                    dNCPSb = i5 % 128;
                    if (i5 % 2 != 0) {
                        MenuItem item = menu.getItem(i4);
                        Intrinsics.checkNotNullExpressionValue(item, "");
                        item.setEnabled(true);
                        i4 += 9;
                    } else {
                        MenuItem item2 = menu.getItem(i4);
                        Intrinsics.checkNotNullExpressionValue(item2, "");
                        item2.setEnabled(true);
                        i4++;
                    }
                }
            }
        }
        int i6 = aKErDB + 45;
        dNCPSb = i6 % 128;
        if (i6 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AxsJAY() {
        BottomNavigationView bottomNavigationView;
        int i = 2 % 2;
        int i2 = dNCPSb + 7;
        aKErDB = i2 % 128;
        int i3 = i2 % 2;
        C16325ehm c16325ehm = this.zLjUOn;
        if (c16325ehm != null && (bottomNavigationView = c16325ehm.OLrzqt) != null) {
            Menu menu = bottomNavigationView.getMenu();
            if (menu == null) {
                int i4 = dNCPSb + 65;
                aKErDB = i4 % 128;
                int i5 = i4 % 2;
            } else if (menu.size() % 2 == 1) {
                MenuItem item = menu.getItem((menu.size() - 1) / 2);
                Intrinsics.checkNotNullExpressionValue(item, "");
                if (item.getItemId() == C14319djH.OLrzqt.AEQbTJ()) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View AubY() {
        View viewFindViewById;
        C16325ehm c16325ehm;
        int i = 2 % 2;
        if (!(!AxsJAY()) && (c16325ehm = this.zLjUOn) != null) {
            int i2 = dNCPSb + WalletImportError.ERROR_CODE_GET_EOA_ADDRESS_KEY;
            aKErDB = i2 % 128;
            int i3 = i2 % 2;
            BottomNavigationView bottomNavigationView = c16325ehm.OLrzqt;
            viewFindViewById = bottomNavigationView != null ? ((NavigationBarItemView) bottomNavigationView.findViewById(bottomNavigationView.getMenu().getItem((bottomNavigationView.getMenu().size() - 1) / 2).getItemId())).findViewById(R.id.navigation_bar_item_icon_view) : null;
        }
        int i4 = aKErDB + 51;
        dNCPSb = i4 % 128;
        if (i4 % 2 == 0) {
            return viewFindViewById;
        }
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private final void UeEOUB() {
        BottomNavigationView bottomNavigationView;
        BottomNavigationView bottomNavigationView2;
        int i = 2 % 2;
        int i2 = aKErDB + 75;
        dNCPSb = i2 % 128;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        C16325ehm c16325ehm = this.zLjUOn;
        if (c16325ehm != null && (bottomNavigationView2 = c16325ehm.OLrzqt) != null) {
            int i3 = aKErDB + 3;
            dNCPSb = i3 % 128;
            int i4 = i3 % 2;
            Menu menu = bottomNavigationView2.getMenu();
            if (menu != null) {
                int size = menu.size();
                for (int i5 = 0; i5 < size; i5++) {
                    MenuItem item = menu.getItem(i5);
                    Intrinsics.checkNotNullExpressionValue(item, "");
                    try {
                        item.setEnabled(false);
                    } catch (Throwable th) {
                        pUU.AEQbTJ(getTAG(), "delayEnabledBottomNavigation: setEnabled failed", th);
                    }
                }
            }
        }
        C16325ehm c16325ehm2 = this.zLjUOn;
        if (c16325ehm2 == null || (bottomNavigationView = c16325ehm2.OLrzqt) == null) {
            return;
        }
        bottomNavigationView.postDelayed(this.valueOf, 100L);
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [1640=5, 1647=4] */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x0043, code lost:
    
        r2 = com.okinc.business.defi.wallet.DefiWalletMainActivity.aKErDB + 5;
        r4 = r2 % 128;
        com.okinc.business.defi.wallet.DefiWalletMainActivity.dNCPSb = r4;
        r2 = r2 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x004d, code lost:
    
        if (r1 == 3) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x004f, code lost:
    
        r4 = r4 + 5;
        r2 = r4 % 128;
        com.okinc.business.defi.wallet.DefiWalletMainActivity.aKErDB = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0057, code lost:
    
        if ((r4 % 2) != 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0059, code lost:
    
        if (r1 != 4) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x005c, code lost:
    
        if (r1 != 4) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x005e, code lost:
    
        r2 = r2 + 109;
        com.okinc.business.defi.wallet.DefiWalletMainActivity.dNCPSb = r2 % 128;
        r2 = r2 % 2;
        r11 = r11.AkhnZx();
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0069, code lost:
    
        if (r11 == null) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x006b, code lost:
    
        r0 = kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.LifecycleOwnerKt.getLifecycleScope(r10), null, null, new com.okinc.business.defi.wallet.DefiWalletMainActivity$trackBottomNavigationClickEvents$4$1(r11, null), 3, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0081, code lost:
    
        throw new kotlin.NoWhenBranchMatchedException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0082, code lost:
    
        r11 = r11.djBIcL();
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0086, code lost:
    
        if (r11 == null) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0088, code lost:
    
        o.C14494dmX.KWHzl.EZpvd(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x008e, code lost:
    
        r11 = r11.KWHzl();
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0092, code lost:
    
        if (r11 == null) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0094, code lost:
    
        r0 = kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.LifecycleOwnerKt.getLifecycleScope(r10), null, null, new com.okinc.business.defi.wallet.DefiWalletMainActivity$trackBottomNavigationClickEvents$2$1(r11, null), 3, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a5, code lost:
    
        r11 = r11.AhwBna();
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00a9, code lost:
    
        if (r11 == null) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00ab, code lost:
    
        r1 = com.okinc.business.defi.wallet.DefiWalletMainActivity.aKErDB + com.okinc.business.defi.biz.core.error.WalletImportError.ERROR_CODE_HARDWARE_ACCOUNT_EXIST;
        com.okinc.business.defi.wallet.DefiWalletMainActivity.dNCPSb = r1 % 128;
        r1 = r1 % 2;
        o.C14494dmX.trackNewWalletMethodButtonClick$default(o.C14494dmX.KWHzl, r11, null, 2, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00b9, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0026, code lost:
    
        if (r1 != 1) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x003f, code lost:
    
        if (r1 != 1) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0041, code lost:
    
        if (r1 == 2) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void OLrzqt(InterfaceC18198fdq interfaceC18198fdq) {
        int i;
        int i2 = 2 % 2;
        int i3 = dNCPSb + 5;
        aKErDB = i3 % 128;
        if (i3 % 2 == 0) {
            i = TaskDescription.copydefault[WalletStateChecker.AEQbTJ.copydefault(iwGUEr(), giSNqX()).ordinal()];
        } else {
            i = TaskDescription.copydefault[WalletStateChecker.AEQbTJ.copydefault(iwGUEr(), giSNqX()).ordinal()];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractActivityC13756dXc, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(@NotNull Context context) {
        int i = 2 % 2;
        int i2 = dNCPSb + 21;
        aKErDB = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(context, "");
            super.attachBaseContext(context);
            C34717nhc.Companion.copydefault(this);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(context, "");
        super.attachBaseContext(context);
        C34717nhc.Companion.copydefault(this);
        int i3 = aKErDB + 85;
        dNCPSb = i3 % 128;
        int i4 = i3 % 2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractActivityC33041mov, androidx.activity.ComponentActivity, android.app.Activity
    public void onNewIntent(@NotNull Intent intent) {
        int i = 2 % 2;
        int i2 = aKErDB + 19;
        dNCPSb = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(intent, "");
            super.onNewIntent(intent);
            setIntent(intent);
            pUU.EZpvd(getTAG(), "onNewIntent");
            AEQbTJ(intent);
            return;
        }
        Intrinsics.checkNotNullParameter(intent, "");
        super.onNewIntent(intent);
        setIntent(intent);
        pUU.EZpvd(getTAG(), "onNewIntent");
        AEQbTJ(intent);
        int i3 = 90 / 0;
    }

    public final void AEQbTJ(Intent intent) {
        int i = 2 % 2;
        if (Intrinsics.EZpvd(copydefault(zzep.AEQbTJ(), 1125100792, -1125100726, new Object[]{this, intent}, UDOKMarketReferralView.Application.OLrzqt(), UDOKMarketReferralView.Application.OLrzqt(), UDOKMarketReferralView.Application.OLrzqt()), (Object) "source_internal_jump")) {
            int i2 = dNCPSb + 29;
            aKErDB = i2 % 128;
            int i3 = i2 % 2;
            copydefault(intent);
            int i4 = dNCPSb + 25;
            aKErDB = i4 % 128;
            int i5 = i4 % 2;
        } else {
            KWHzl(intent);
        }
        int i6 = dNCPSb + 125;
        aKErDB = i6 % 128;
        if (i6 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object dvKsVJ(Object[] objArr) {
        String str;
        Intent intent = (Intent) objArr[1];
        int i = 2 % 2;
        if (intent == null) {
            str = "source_internal_jump";
        } else {
            Bundle extras = intent.getExtras();
            if (extras != null) {
                String string = extras.getString("url");
                if (string != null && string.length() != 0) {
                    str = "source_deeplink";
                }
            } else {
                int i2 = aKErDB + 21;
                dNCPSb = i2 % 128;
                if (i2 % 2 != 0) {
                    throw null;
                }
            }
            str = "source_internal_jump";
        }
        int i3 = dNCPSb + 23;
        aKErDB = i3 % 128;
        int i4 = i3 % 2;
        return str;
    }

    public static final Unit iZzfmt(DefiWalletMainActivity defiWalletMainActivity) {
        int i = 2 % 2;
        int i2 = dNCPSb + 7;
        aKErDB = i2 % 128;
        int i3 = i2 % 2;
        C14616don c14616donKWHzl = C14616don.Companion.KWHzl((226 & 1) != 0 ? 1 : 0, (226 & 2) != 0 ? false : true, (226 & 4) != 0 ? null : null, (226 & 8) != 0 ? yDY.AhwBna() : null, (226 & 16) == 0, (226 & 32) != 0 ? null : null, (226 & 64) != 0 ? new ArrayList() : null, (226 & 128) == 0 ? null : null);
        androidx.fragment.app.FragmentManager supportFragmentManager = defiWalletMainActivity.getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
        c14616donKWHzl.show(supportFragmentManager);
        Unit unit = Unit.INSTANCE;
        int i4 = dNCPSb + 91;
        aKErDB = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 38 / 0;
        }
        return unit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [1757=4] */
    public final void copydefault(Intent intent) {
        int i = 2 % 2;
        if (intent.getBooleanExtra("enterMainWallet", false)) {
            intent.putExtra("enterMainWallet", false);
            boolean booleanExtra = intent.getBooleanExtra("reset_dialog_show", false);
            int intExtra = intent.getIntExtra("main_tab_id", C14319djH.OLrzqt.OLrzqt());
            final String stringExtra = intent.getStringExtra("home_tab_type");
            if (stringExtra == null) {
                stringExtra = "wallet";
            }
            String stringExtra2 = intent.getStringExtra("wallet_id");
            Object obj = null;
            if (stringExtra2 == null) {
                int i2 = aKErDB + 121;
                dNCPSb = i2 % 128;
                if (i2 % 2 != 0) {
                    obj.hashCode();
                    throw null;
                }
                stringExtra2 = "";
            }
            giSNqX().djBIcL(intent.getBooleanExtra("from_wallet_manager", false));
            giSNqX().OLrzqt(intent.getBooleanExtra("hide_wallet_manager", false));
            if (!(!booleanExtra)) {
                C19595gIe.Companion.AEQbTJ(C33070mpX.AYXKKw(C13754dXa.FragmentManager.getSupportActionBar), "").KWHzl(this);
            }
            KWHzl(intExtra);
            if (stringExtra2.length() == 0) {
                RxBus.AEQbTJ(new C14445dlb(stringExtra));
            } else {
                addDisposable(C11607cUn.subscribeOnIO$default(C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null).copydefault(stringExtra2), (Function1) null, new Function1() { // from class: o.dWG
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return DefiWalletMainActivity.EZpvd(stringExtra, ((java.lang.Integer) obj2).intValue());
                    }
                }, 1, (Object) null));
            }
        }
        if (intent.getBooleanExtra("add_wallet", false)) {
            int i3 = dNCPSb + 13;
            aKErDB = i3 % 128;
            int i4 = i3 % 2;
            try {
                if (intent.getBooleanExtra("exist_wallet", false)) {
                    giSNqX().AYXKKw(true);
                } else {
                    AEQbTJ(new Function0() { // from class: o.dWN
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return DefiWalletMainActivity.fetchVPNInfo(this.EZpvd);
                        }
                    });
                }
            } catch (Throwable th) {
                pUU.AEQbTJ(getTAG(), "show add wallet failed: " + th.getMessage(), th);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [1781=4] */
    /* JADX DEBUG: Multi-variable search result rejected for r11v2, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r4v11, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r4v16, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r4v19, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r4v4, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [T, java.lang.String] */
    public final void KWHzl(Intent intent) {
        int i = 2 % 2;
        Object obj = null;
        RPCManager.getUpdateRpcUrlLoader$default(RPCManager.EZpvd, null, null, 3, null);
        Bundle extras = intent.getExtras();
        if (extras == null) {
            return;
        }
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        ?? string = extras.getString("url");
        objectRef.element = string;
        CharSequence charSequence = (CharSequence) string;
        if (charSequence != null) {
            int i2 = aKErDB + 59;
            dNCPSb = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 85 / 0;
                if (charSequence.length() == 0) {
                    return;
                }
            } else if (charSequence.length() == 0) {
                return;
            }
            intent.putExtra("url", "");
            if (StringsKt__StringsKt.contains$default((CharSequence) objectRef.element, (CharSequence) "wc:", false, 2, (Object) null)) {
                int i4 = aKErDB + 91;
                dNCPSb = i4 % 128;
                int i5 = i4 % 2;
                if (C59449zhJ.startsWith$default((String) objectRef.element, "wc:", false, 2, null)) {
                    this.sSMYrx = (String) objectRef.element;
                    objectRef.element = "wc/connect";
                }
            }
            if (C59449zhJ.startsWith$default((String) objectRef.element, "tc://", false, 2, null)) {
                int i6 = dNCPSb + 37;
                aKErDB = i6 % 128;
                if (i6 % 2 == 0) {
                    this.sSMYrx = (String) objectRef.element;
                    objectRef.element = "wallet/tonconnect";
                    obj.hashCode();
                    throw null;
                }
                this.sSMYrx = (String) objectRef.element;
                objectRef.element = "wallet/tonconnect";
            }
            if (intent.getExtras() != null) {
                BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new DefiWalletMainActivity$handleDeeplink$1$1(objectRef, this, extras, null), 3, null);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01b9, code lost:
    
        if (r3 == r7) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01c2, code lost:
    
        if (r3 == r7) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01c4, code lost:
    
        return r7;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0109 A[PHI: r3
  0x0109: PHI (r3v32 o.bbr) = (r3v31 o.bbr), (r3v39 o.bbr) binds: [B:54:0x0107, B:51:0x00fe] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OLrzqt(String str, String str2, Continuation<? super Boolean> continuation) throws Throwable {
        DefiWalletMainActivity$deepLinkIsLimit$1 defiWalletMainActivity$deepLinkIsLimit$1;
        boolean zCopydefault;
        InterfaceC9765bbk interfaceC9765bbk;
        InterfaceC9769bbo interfaceC9769bbo;
        InterfaceC9769bbo interfaceC9769bbo2;
        InterfaceC9774bbt interfaceC9774bbt;
        InterfaceC9774bbt interfaceC9774bbt2;
        InterfaceC9773bbs interfaceC9773bbs;
        InterfaceC9773bbs interfaceC9773bbs2;
        InterfaceC9772bbr interfaceC9772bbr;
        InterfaceC9772bbr interfaceC9772bbr2;
        int i = 2 % 2;
        int i2 = dNCPSb + 97;
        aKErDB = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            boolean z = continuation instanceof DefiWalletMainActivity$deepLinkIsLimit$1;
            obj.hashCode();
            throw null;
        }
        if (continuation instanceof DefiWalletMainActivity$deepLinkIsLimit$1) {
            defiWalletMainActivity$deepLinkIsLimit$1 = (DefiWalletMainActivity$deepLinkIsLimit$1) continuation;
            int i3 = defiWalletMainActivity$deepLinkIsLimit$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                int i4 = aKErDB + 55;
                dNCPSb = i4 % 128;
                if (i4 % 2 != 0) {
                    defiWalletMainActivity$deepLinkIsLimit$1.label = i3 % Integer.MIN_VALUE;
                } else {
                    defiWalletMainActivity$deepLinkIsLimit$1.label = i3 - Integer.MIN_VALUE;
                }
            } else {
                defiWalletMainActivity$deepLinkIsLimit$1 = new DefiWalletMainActivity$deepLinkIsLimit$1(this, continuation);
            }
        }
        Object objEZpvd = defiWalletMainActivity$deepLinkIsLimit$1.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i5 = defiWalletMainActivity$deepLinkIsLimit$1.label;
        if (i5 != 0) {
            if (i5 == 1) {
                C56391yDq.AEQbTJ(objEZpvd);
                zCopydefault = ((Boolean) objEZpvd).booleanValue();
                return C56443yFo.KWHzl(zCopydefault);
            }
            int i6 = aKErDB + 27;
            int i7 = i6 % 128;
            dNCPSb = i7;
            int i8 = i6 % 2;
            if (i5 == 2) {
                C56391yDq.AEQbTJ(objEZpvd);
                zCopydefault = ((Boolean) objEZpvd).booleanValue();
                return C56443yFo.KWHzl(zCopydefault);
            }
            if (i5 == 3) {
                C56391yDq.AEQbTJ(objEZpvd);
                zCopydefault = ((Boolean) objEZpvd).booleanValue();
                return C56443yFo.KWHzl(zCopydefault);
            }
            if (i5 == 4) {
                C56391yDq.AEQbTJ(objEZpvd);
                zCopydefault = ((Boolean) objEZpvd).booleanValue();
                return C56443yFo.KWHzl(zCopydefault);
            }
            if (i5 != 5) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i9 = i7 + 55;
            aKErDB = i9 % 128;
            int i10 = i9 % 2;
            C56391yDq.AEQbTJ(objEZpvd);
            zCopydefault = ((Boolean) objEZpvd).booleanValue();
            return C56443yFo.KWHzl(zCopydefault);
        }
        C56391yDq.AEQbTJ(objEZpvd);
        if (str2 == null) {
            return C56443yFo.KWHzl(true);
        }
        InterfaceC9771bbq interfaceC9771bbqDvKsVJ = dvKsVJ();
        zCopydefault = false;
        if (interfaceC9771bbqDvKsVJ != null && interfaceC9771bbqDvKsVJ.copydefault(str)) {
            int i11 = aKErDB + 27;
            dNCPSb = i11 % 128;
            if (i11 % 2 != 0) {
                dvKsVJ();
                obj.hashCode();
                throw null;
            }
            InterfaceC9771bbq interfaceC9771bbqDvKsVJ2 = dvKsVJ();
            if (interfaceC9771bbqDvKsVJ2 != null) {
                defiWalletMainActivity$deepLinkIsLimit$1.label = 1;
                objEZpvd = interfaceC9771bbqDvKsVJ2.EZpvd(str, this, defiWalletMainActivity$deepLinkIsLimit$1);
                if (objEZpvd == objCopydefault) {
                    return objCopydefault;
                }
                zCopydefault = ((Boolean) objEZpvd).booleanValue();
            }
            return C56443yFo.KWHzl(zCopydefault);
        }
        List list = (List) copydefault(zzep.AEQbTJ(), 148101415, -148101348, new Object[]{this}, zzep.AEQbTJ(), zzep.AEQbTJ(), zzep.AEQbTJ());
        if (list != null) {
            int i12 = dNCPSb + 123;
            aKErDB = i12 % 128;
            if (i12 % 2 == 0) {
                interfaceC9772bbr = (InterfaceC9772bbr) CollectionsKt___CollectionsKt.AuCTelauCTel(list);
                int i13 = 28 / 0;
                if (interfaceC9772bbr != null) {
                    if (interfaceC9772bbr.AEQbTJ(str)) {
                        List list2 = (List) copydefault(zzep.AEQbTJ(), 148101415, -148101348, new Object[]{this}, zzep.AEQbTJ(), zzep.AEQbTJ(), zzep.AEQbTJ());
                        if (list2 != null && (interfaceC9772bbr2 = (InterfaceC9772bbr) CollectionsKt___CollectionsKt.AuCTelauCTel(list2)) != null) {
                            int i14 = aKErDB + 19;
                            dNCPSb = i14 % 128;
                            int i15 = i14 % 2;
                            defiWalletMainActivity$deepLinkIsLimit$1.label = 2;
                            objEZpvd = interfaceC9772bbr2.EZpvd(str2, this, defiWalletMainActivity$deepLinkIsLimit$1);
                            if (objEZpvd == objCopydefault) {
                                return objCopydefault;
                            }
                            zCopydefault = ((Boolean) objEZpvd).booleanValue();
                        }
                        return C56443yFo.KWHzl(zCopydefault);
                    }
                }
            } else {
                interfaceC9772bbr = (InterfaceC9772bbr) CollectionsKt___CollectionsKt.AuCTelauCTel(list);
                if (interfaceC9772bbr != null) {
                }
            }
        }
        List list3 = (List) copydefault(zzep.AEQbTJ(), 1587046147, -1587046084, new Object[]{this}, zzep.AEQbTJ(), zzep.AEQbTJ(), zzep.AEQbTJ());
        if (list3 != null && (interfaceC9773bbs = (InterfaceC9773bbs) CollectionsKt___CollectionsKt.AuCTelauCTel(list3)) != null && interfaceC9773bbs.EZpvd(str)) {
            List list4 = (List) copydefault(zzep.AEQbTJ(), 1587046147, -1587046084, new Object[]{this}, zzep.AEQbTJ(), zzep.AEQbTJ(), zzep.AEQbTJ());
            if (list4 != null && (interfaceC9773bbs2 = (InterfaceC9773bbs) CollectionsKt___CollectionsKt.AuCTelauCTel(list4)) != null) {
                int i16 = dNCPSb + WalletImportError.ERROR_CODE_HARDWARE_ACCOUNT_EXIST;
                aKErDB = i16 % 128;
                if (i16 % 2 == 0) {
                    defiWalletMainActivity$deepLinkIsLimit$1.label = 5;
                    objEZpvd = interfaceC9773bbs2.copydefault(str2, this, defiWalletMainActivity$deepLinkIsLimit$1);
                } else {
                    defiWalletMainActivity$deepLinkIsLimit$1.label = 3;
                    objEZpvd = interfaceC9773bbs2.copydefault(str2, this, defiWalletMainActivity$deepLinkIsLimit$1);
                }
            }
            return C56443yFo.KWHzl(zCopydefault);
        }
        List<InterfaceC9774bbt> listFinit = finit();
        if (listFinit != null && (interfaceC9774bbt = (InterfaceC9774bbt) CollectionsKt___CollectionsKt.firstOrNull(listFinit)) != null && interfaceC9774bbt.AEQbTJ(str)) {
            List<InterfaceC9774bbt> listFinit2 = finit();
            if (listFinit2 != null && (interfaceC9774bbt2 = (InterfaceC9774bbt) CollectionsKt___CollectionsKt.firstOrNull(listFinit2)) != null) {
                defiWalletMainActivity$deepLinkIsLimit$1.label = 4;
                objEZpvd = interfaceC9774bbt2.copydefault(str2, this, defiWalletMainActivity$deepLinkIsLimit$1);
                if (objEZpvd == objCopydefault) {
                    return objCopydefault;
                }
                zCopydefault = ((Boolean) objEZpvd).booleanValue();
            }
            return C56443yFo.KWHzl(zCopydefault);
        }
        List list5 = (List) copydefault(zzep.AEQbTJ(), -1939267607, 1939267648, new Object[]{this}, zzep.AEQbTJ(), zzep.AEQbTJ(), zzep.AEQbTJ());
        if (list5 != null && (interfaceC9769bbo = (InterfaceC9769bbo) CollectionsKt___CollectionsKt.AuCTelauCTel(list5)) != null) {
            int i17 = dNCPSb + 73;
            aKErDB = i17 % 128;
            if (i17 % 2 != 0 ? interfaceC9769bbo.OLrzqt(str) : !interfaceC9769bbo.OLrzqt(str)) {
                List list6 = (List) copydefault(zzep.AEQbTJ(), -1939267607, 1939267648, new Object[]{this}, zzep.AEQbTJ(), zzep.AEQbTJ(), zzep.AEQbTJ());
                if (list6 != null && (interfaceC9769bbo2 = (InterfaceC9769bbo) CollectionsKt___CollectionsKt.AuCTelauCTel(list6)) != null) {
                    defiWalletMainActivity$deepLinkIsLimit$1.label = 5;
                    objEZpvd = interfaceC9769bbo2.EZpvd(str2, this, defiWalletMainActivity$deepLinkIsLimit$1);
                    if (objEZpvd == objCopydefault) {
                        return objCopydefault;
                    }
                    zCopydefault = ((Boolean) objEZpvd).booleanValue();
                }
                return C56443yFo.KWHzl(zCopydefault);
            }
        }
        List<InterfaceC9765bbk> listDxcTrN = dxcTrN();
        if (listDxcTrN != null) {
            int i18 = aKErDB + WalletImportError.ERROR_CODE_GET_EOA_ADDRESS_KEY;
            dNCPSb = i18 % 128;
            int i19 = i18 % 2;
            InterfaceC9765bbk interfaceC9765bbk2 = (InterfaceC9765bbk) CollectionsKt___CollectionsKt.AuCTelauCTel(listDxcTrN);
            if (interfaceC9765bbk2 != null && interfaceC9765bbk2.copydefault(str)) {
                List<InterfaceC9765bbk> listDxcTrN2 = dxcTrN();
                if (listDxcTrN2 != null && (interfaceC9765bbk = (InterfaceC9765bbk) CollectionsKt___CollectionsKt.AuCTelauCTel(listDxcTrN2)) != null) {
                    zCopydefault = interfaceC9765bbk.copydefault(str2, this);
                }
                return C56443yFo.KWHzl(zCopydefault);
            }
        }
        return C56443yFo.KWHzl(false);
    }

    public static final Unit KWHzl(Bundle bundle, DefiWalletMainActivity defiWalletMainActivity) {
        int i = 2 % 2;
        int i2 = aKErDB + 83;
        dNCPSb = i2 % 128;
        if (i2 % 2 == 0) {
            C18158fdC.TaskDescription taskDescription = C18158fdC.Companion;
            int i3 = bundle.getInt("type", taskDescription.OLrzqt());
            defiWalletMainActivity.KWHzl(i3);
            if (i3 == taskDescription.OLrzqt()) {
                RxBus.AEQbTJ(new C14445dlb(bundle.getString(OtcExtraKeys.SUB_TYPE)));
            }
            Unit unit = Unit.INSTANCE;
            int i4 = dNCPSb + 51;
            aKErDB = i4 % 128;
            int i5 = i4 % 2;
            return unit;
        }
        C18158fdC.TaskDescription taskDescription2 = C18158fdC.Companion;
        defiWalletMainActivity.KWHzl(bundle.getInt("type", taskDescription2.OLrzqt()));
        taskDescription2.OLrzqt();
        throw null;
    }

    public static final Unit copydefault(DefiWalletMainActivity defiWalletMainActivity, Bundle bundle, Pair pair, String str) {
        int i = 2 % 2;
        defiWalletMainActivity.KWHzl(C18158fdC.Companion.OLrzqt());
        defiWalletMainActivity.EZpvd(bundle, (String) pair.getFirst(), (AbstractC43419rot<VerifyDAppDomainUrlResponse, OKServerException>) pair.getSecond(), defiWalletMainActivity.new ActionBar(str));
        Unit unit = Unit.INSTANCE;
        int i2 = aKErDB + 91;
        dNCPSb = i2 % 128;
        if (i2 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final void AEQbTJ(DefiWalletMainActivity defiWalletMainActivity, Bundle bundle, Pair pair) {
        int i = 2 % 2;
        defiWalletMainActivity.EZpvd(bundle, (String) pair.getFirst(), (AbstractC43419rot<VerifyDAppDomainUrlResponse, OKServerException>) pair.getSecond(), defiWalletMainActivity.new PendingIntent());
        int i2 = dNCPSb + 65;
        aKErDB = i2 % 128;
        int i3 = i2 % 2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static /* synthetic */ Object AhwBna(Object[] objArr) {
        Function2 function2 = (Function2) objArr[0];
        Object obj = objArr[1];
        Object obj2 = objArr[2];
        int i = 2 % 2;
        int i2 = dNCPSb + 47;
        aKErDB = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(obj, "");
            Intrinsics.checkNotNullParameter(obj2, "");
            return (Pair) function2.invoke(obj, obj2);
        }
        Intrinsics.checkNotNullParameter(obj, "");
        Intrinsics.checkNotNullParameter(obj2, "");
        throw null;
    }

    public static final void QOLQEE(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = aKErDB + 55;
        dNCPSb = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = aKErDB + 23;
        dNCPSb = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [1950=6] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Unit values(DefiWalletMainActivity defiWalletMainActivity, AbstractC12782ctV abstractC12782ctV) {
        String str;
        WalletType walletTypeFJNWhG;
        String strEZpvd;
        int i = 2 % 2;
        int i2 = dNCPSb + 31;
        aKErDB = i2 % 128;
        int i3 = i2 % 2;
        ActivityC18493fjT.Application application = ActivityC18493fjT.Companion;
        AbstractC12784ctX abstractC12784ctXGwTjWJ = abstractC12782ctV.gwTjWJ();
        String str2 = (abstractC12784ctXGwTjWJ == null || (strEZpvd = abstractC12784ctXGwTjWJ.EZpvd()) == null) ? "" : strEZpvd;
        AbstractC12784ctX abstractC12784ctXGwTjWJ2 = abstractC12782ctV.gwTjWJ();
        if (abstractC12784ctXGwTjWJ2 == null) {
            str = "";
        } else {
            String strAuCTel = abstractC12784ctXGwTjWJ2.AuCTel();
            if (strAuCTel == null) {
                int i4 = aKErDB + 81;
                dNCPSb = i4 % 128;
                int i5 = i4 % 2;
                str = "";
            } else {
                str = strAuCTel;
            }
        }
        AbstractC12784ctX abstractC12784ctXGwTjWJ3 = abstractC12782ctV.gwTjWJ();
        if (abstractC12784ctXGwTjWJ3 != null) {
            int i6 = dNCPSb + 61;
            aKErDB = i6 % 128;
            if (i6 % 2 == 0) {
                walletTypeFJNWhG = abstractC12784ctXGwTjWJ3.fJNWhG();
                int i7 = 2 / 0;
                if (walletTypeFJNWhG == null) {
                    walletTypeFJNWhG = WalletType.HDWallet;
                }
            } else {
                walletTypeFJNWhG = abstractC12784ctXGwTjWJ3.fJNWhG();
                if (walletTypeFJNWhG == null) {
                }
            }
        }
        int iOrdinal = walletTypeFJNWhG.ordinal();
        int i8 = aKErDB + 89;
        dNCPSb = i8 % 128;
        if (i8 % 2 == 0) {
            application.OLrzqt(defiWalletMainActivity, str2, str, iOrdinal, "other");
            return Unit.INSTANCE;
        }
        application.OLrzqt(defiWalletMainActivity, str2, str, iOrdinal, "other");
        int i9 = 42 / 0;
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [1960=6] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00bd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Unit AEQbTJ(final DefiWalletMainActivity defiWalletMainActivity, Pair pair) {
        String strEZpvd;
        WalletType walletTypeFJNWhG;
        int i = 2 % 2;
        defiWalletMainActivity.dismissLoading();
        Object first = pair.getFirst();
        String str = "";
        Intrinsics.checkNotNullExpressionValue(first, "");
        int iIntValue = ((Number) first).intValue();
        Object second = pair.getSecond();
        Intrinsics.checkNotNullExpressionValue(second, "");
        final AbstractC12782ctV abstractC12782ctV = (AbstractC12782ctV) second;
        AbstractC12784ctX abstractC12784ctXGwTjWJ = abstractC12782ctV.gwTjWJ();
        WalletType walletTypeFJNWhG2 = abstractC12784ctXGwTjWJ != null ? abstractC12784ctXGwTjWJ.fJNWhG() : null;
        WalletType walletType = WalletType.HDWallet;
        if (walletTypeFJNWhG2 != walletType) {
            C55326xho.toast$default(C33070mpX.AYXKKw(C13754dXa.FragmentManager.onLoadChildren), (Drawable) null, 0, (Integer) 17, 0, 0, 27, (Object) null);
            return Unit.INSTANCE;
        }
        if (iIntValue >= 100) {
            C55326xho.toast$default(C33069mpW.copydefault(C13754dXa.FragmentManager.MediaBrowserCompatItemCallback, C56423yEv.EZpvd(C56390yDp.OLrzqt(OtcExtraKeys.AMOUNT, "100"))), (Drawable) null, 0, (Integer) 17, 0, 0, 27, (Object) null);
            return Unit.INSTANCE;
        }
        if (!abstractC12782ctV.zLjUOn()) {
            new C14325djN().AEQbTJ(defiWalletMainActivity, defiWalletMainActivity.getSupportFragmentManager(), abstractC12782ctV, new Function0() { // from class: o.dUg
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    java.lang.Object[] objArr = {this.EZpvd, abstractC12782ctV};
                    return (Unit) DefiWalletMainActivity.copydefault(zzep.AEQbTJ(), 32354748, -32354737, objArr, zzep.AEQbTJ(), zzep.AEQbTJ(), zzep.AEQbTJ());
                }
            });
            Unit unit = Unit.INSTANCE;
            int i2 = dNCPSb + 3;
            aKErDB = i2 % 128;
            if (i2 % 2 != 0) {
                return unit;
            }
            throw null;
        }
        ActivityC18493fjT.Application application = ActivityC18493fjT.Companion;
        AbstractC12784ctX abstractC12784ctXGwTjWJ2 = abstractC12782ctV.gwTjWJ();
        if (abstractC12784ctXGwTjWJ2 != null) {
            int i3 = aKErDB + 69;
            dNCPSb = i3 % 128;
            if (i3 % 2 != 0) {
                strEZpvd = abstractC12784ctXGwTjWJ2.EZpvd();
                int i4 = 11 / 0;
                if (strEZpvd == null) {
                    strEZpvd = "";
                }
            } else {
                strEZpvd = abstractC12784ctXGwTjWJ2.EZpvd();
                if (strEZpvd == null) {
                }
            }
        }
        AbstractC12784ctX abstractC12784ctXGwTjWJ3 = abstractC12782ctV.gwTjWJ();
        if (abstractC12784ctXGwTjWJ3 != null) {
            int i5 = dNCPSb + 103;
            aKErDB = i5 % 128;
            if (i5 % 2 == 0) {
                abstractC12784ctXGwTjWJ3.AuCTel();
                throw null;
            }
            String strAuCTel = abstractC12784ctXGwTjWJ3.AuCTel();
            if (strAuCTel == null) {
                int i6 = aKErDB + 75;
                dNCPSb = i6 % 128;
                int i7 = i6 % 2;
            } else {
                str = strAuCTel;
            }
        }
        AbstractC12784ctX abstractC12784ctXGwTjWJ4 = abstractC12782ctV.gwTjWJ();
        application.OLrzqt(defiWalletMainActivity, strEZpvd, str, (abstractC12784ctXGwTjWJ4 == null || (walletTypeFJNWhG = abstractC12784ctXGwTjWJ4.fJNWhG()) == null) ? walletType.ordinal() : walletTypeFJNWhG.ordinal(), "other");
        return Unit.INSTANCE;
    }

    public static final void ORxRYg(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = dNCPSb + 123;
        aKErDB = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = dNCPSb + 45;
        aKErDB = i4 % 128;
        int i5 = i4 % 2;
    }

    public static final void QbewEr(final DefiWalletMainActivity defiWalletMainActivity) {
        int i = 2 % 2;
        defiWalletMainActivity.showLoading();
        C12827cuN.Application application = C12827cuN.Companion;
        Object obj = null;
        AbstractC58260yxt<Integer> abstractC58260yxtAkhnZx = C12827cuN.Application.getInstance$default(application, null, 1, null).AkhnZx();
        AbstractC58260yxt<AbstractC12782ctV> abstractC58260yxtCopydefault = C12827cuN.Application.getInstance$default(application, null, 1, null).copydefault(false);
        final Function2 function2 = new Function2() { // from class: o.dVE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                return DefiWalletMainActivity.OLrzqt((java.lang.Integer) obj2, (AbstractC12782ctV) obj3);
            }
        };
        AbstractC58260yxt abstractC58260yxtOLrzqt = AbstractC58260yxt.OLrzqt(abstractC58260yxtAkhnZx, abstractC58260yxtCopydefault, new InterfaceC58223yxI() { // from class: o.dVP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58223yxI
            public final java.lang.Object apply(java.lang.Object obj2, java.lang.Object obj3) {
                return DefiWalletMainActivity.OLrzqt(function2, obj2, obj3);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtOLrzqt, "");
        AbstractC58260yxt abstractC58260yxtValueOf = C11607cUn.valueOf(abstractC58260yxtOLrzqt);
        final Function1 function1 = new Function1() { // from class: o.dVX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj2) {
                return DefiWalletMainActivity.copydefault(this.AEQbTJ, (kotlin.Pair) obj2);
            }
        };
        InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.dWn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj2) {
                DefiWalletMainActivity.AhwBna(function1, obj2);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.dWx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj2) {
                return DefiWalletMainActivity.OLrzqt(this.KWHzl, (java.lang.Throwable) obj2);
            }
        };
        defiWalletMainActivity.addDisposable(abstractC58260yxtValueOf.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.dWJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj2) {
                DefiWalletMainActivity.AwvSrB(function12, obj2);
            }
        }));
        int i2 = dNCPSb + 5;
        aKErDB = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public static final Unit copydefault(DefiWalletMainActivity defiWalletMainActivity, Throwable th) {
        int i = 2 % 2;
        defiWalletMainActivity.dismissLoading();
        pUU.copydefault(defiWalletMainActivity.getTAG(), "batch create account deeplink jump error message = " + th.getMessage());
        Unit unit = Unit.INSTANCE;
        int i2 = aKErDB + 101;
        dNCPSb = i2 % 128;
        int i3 = i2 % 2;
        return unit;
    }

    public static final Unit QfsBiF(DefiWalletMainActivity defiWalletMainActivity) {
        int i = 2 % 2;
        defiWalletMainActivity.KWHzl(C18158fdC.Companion.OLrzqt());
        RxBus.AEQbTJ(new C14445dlb("portfolio"));
        Unit unit = Unit.INSTANCE;
        int i2 = dNCPSb + 35;
        aKErDB = i2 % 128;
        if (i2 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final Unit RJOkX(DefiWalletMainActivity defiWalletMainActivity) {
        int i = 2 % 2;
        defiWalletMainActivity.KWHzl(C18158fdC.Companion.OLrzqt());
        RxBus.AEQbTJ(new C14445dlb("dapps"));
        Unit unit = Unit.INSTANCE;
        int i2 = aKErDB + 71;
        dNCPSb = i2 % 128;
        if (i2 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    public static final Unit QUSxYX(DefiWalletMainActivity defiWalletMainActivity) {
        int i = 2 % 2;
        defiWalletMainActivity.KWHzl(C18158fdC.Companion.OLrzqt());
        RxBus.AEQbTJ(new C14445dlb("approve_manager"));
        Unit unit = Unit.INSTANCE;
        int i2 = aKErDB + WalletImportError.ERROR_CODE_GET_EOA_ADDRESS_KEY;
        dNCPSb = i2 % 128;
        if (i2 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object AEQbTJ(Object[] objArr) {
        DefiWalletMainActivity defiWalletMainActivity = (DefiWalletMainActivity) objArr[0];
        int i = 2 % 2;
        int i2 = dNCPSb + 25;
        aKErDB = i2 % 128;
        if (i2 % 2 == 0) {
            defiWalletMainActivity.KWHzl(C18158fdC.Companion.OLrzqt());
            androidx.fragment.app.FragmentManager supportFragmentManager = defiWalletMainActivity.getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
            defiWalletMainActivity.addDisposable(C18061fbL.EZpvd(defiWalletMainActivity, supportFragmentManager));
            int i3 = 49 / 0;
            return Unit.INSTANCE;
        }
        defiWalletMainActivity.KWHzl(C18158fdC.Companion.OLrzqt());
        androidx.fragment.app.FragmentManager supportFragmentManager2 = defiWalletMainActivity.getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager2, "");
        defiWalletMainActivity.addDisposable(C18061fbL.EZpvd(defiWalletMainActivity, supportFragmentManager2));
        return Unit.INSTANCE;
    }

    @Override // com.okinc.business.defi.wallet.common.WalletConnectUtils.StateListAnimator
    public void AEQbTJ(@NotNull String str, @NotNull String str2) {
        int i = 2 % 2;
        int i2 = aKErDB + 17;
        dNCPSb = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        int i4 = aKErDB + 19;
        dNCPSb = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // o.InterfaceC35205nqt
    public boolean AwvSrB() {
        int i = 2 % 2;
        int i2 = dNCPSb;
        int i3 = i2 + 117;
        aKErDB = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 35;
        aKErDB = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 73 / 0;
        }
        return true;
    }

    @Override // o.InterfaceC15734eTh
    public Object EZpvd(@NotNull AbstractActivityC33041mov abstractActivityC33041mov, @NotNull String str, WcConnectExtra wcConnectExtra, @NotNull Continuation<? super Unit> continuation) {
        int i = 2 % 2;
        int i2 = dNCPSb + 103;
        aKErDB = i2 % 128;
        int i3 = i2 % 2;
        Object objEZpvd = this.AEQbTJ.EZpvd(abstractActivityC33041mov, str, wcConnectExtra, continuation);
        int i4 = aKErDB + 9;
        dNCPSb = i4 % 128;
        int i5 = i4 % 2;
        return objEZpvd;
    }

    @Override // com.okinc.business.defi.wallet.common.WalletConnectUtils.StateListAnimator
    public void KWHzl(@NotNull String str) {
        int i = 2 % 2;
        int i2 = dNCPSb + 85;
        aKErDB = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        if (i3 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = dNCPSb + 51;
        aKErDB = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 14 / 0;
        }
    }

    @Override // com.okinc.business.defi.wallet.common.WalletConnectUtils.StateListAnimator
    public void OLrzqt(@NotNull String str, @NotNull String str2) {
        int i = 2 % 2;
        int i2 = aKErDB + 69;
        dNCPSb = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        if (i3 != 0) {
            throw null;
        }
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.bEz.AEQbTJ$1908f70b(int, int, java.lang.Object, int, boolean):java.lang.Object[] */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    /* JADX WARN: Removed duplicated region for block: B:313:0x1e8c  */
    @Override // o.InterfaceC35204nqs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void fARcdN() throws Throwable {
        Object[] objArr;
        Object[] objArrAEQbTJ$1908f70b;
        Object[] objArr2;
        Object[] objArr3;
        Object[] objArr4;
        Object[] objArr5;
        Object[] objArr6;
        Object[] objArr7;
        Object[] objArr8;
        int i = 2 % 2;
        Object[] objArr9 = new Object[1];
        a(null, 127, null, new byte[]{-111, -112, -123, -113, -114, -115, -116, -117, -120, -118, -119, -121, -120, -123, -121, -125, -122, -123, -124, -125, -126, -127}, objArr9);
        String str = (String) objArr9[0];
        Object[] objArr10 = new Object[1];
        a(null, 127, null, new byte[]{-116, -115, -122, -117, -113, -127, -116, -109, -125, -116, -120, -110, -127, -113, -116}, objArr10);
        String str2 = (String) objArr10[0];
        Object[] objArr11 = new Object[1];
        a(null, 127, null, new byte[]{-115, -116, -117, -120, -118, -119, -121, -102, -126, -127, -113, -121, -127, -107, -127, -103}, objArr11);
        String str3 = (String) objArr11[0];
        Object[] objArr12 = new Object[1];
        a(null, 127, null, new byte[]{-116, -125, -123, -114, -105, -120, -127, -101, -118, -117, -122, -117, -126, -116, -125, -122}, objArr12);
        String str4 = (String) objArr12[0];
        Object objEZpvd = YY.EZpvd(1699149472);
        if (objEZpvd == null) {
            byte b = (byte) ($$a[13] + 1);
            byte b2 = (byte) (-b);
            Object[] objArr13 = new Object[1];
            b(b, b2, (byte) (b2 | 52), objArr13);
            objEZpvd = YY.EZpvd(368, 5, (char) 0, 1634089948, false, (String) objArr13[0], null);
        }
        long j = ((Field) objEZpvd).getLong(null);
        if (j == -1 || j + 2002 < ((Long) Class.forName(str).getDeclaredMethod(str2, new Class[0]).invoke(null, new Object[0])).longValue()) {
            Context baseContext = getBaseContext();
            if (baseContext == null) {
                Object[] objArr14 = new Object[1];
                a(null, 127, null, new byte[]{-125, -127, -116, -124, -105, -106, -118, -117, -122, -107, -122, -117, -112, -108, -121, -110, -110, -127, -121, -125, -122, -123, -124, -125, -126, -127}, objArr14);
                Class<?> cls = Class.forName((String) objArr14[0]);
                Object[] objArr15 = new Object[1];
                a(null, 127, null, new byte[]{-126, -123, -122, -117, -127, -112, -122, -113, -110, -110, -108, -117, -126, -116, -124, -124, -104, -112}, objArr15);
                baseContext = (Context) cls.getMethod((String) objArr15[0], new Class[0]).invoke(null, null);
            }
            if (baseContext != null) {
                baseContext = ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) ? null : baseContext.getApplicationContext();
            }
            int iIntValue = ((Integer) Class.forName(str3).getMethod(str4, Object.class).invoke(null, this)).intValue();
            int i2 = aKErDB + 61;
            dNCPSb = i2 % 128;
            int i3 = i2 % 2;
            try {
                Object[] objArr16 = {baseContext, Integer.valueOf(iIntValue), 0, -589603965};
                byte[] bArr = $$d;
                Object[] objArr17 = new Object[1];
                c((byte) (bArr[3] + 1), bArr[23], bArr[68], objArr17);
                Class<?> cls2 = Class.forName((String) objArr17[0]);
                Object[] objArr18 = new Object[1];
                c(bArr[3], (byte) (-bArr[151]), bArr[8], objArr18);
                objArr = (Object[]) cls2.getMethod((String) objArr18[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr16);
                if (baseContext != null) {
                    Object objEZpvd2 = YY.EZpvd(-249174654);
                    if (objEZpvd2 == null) {
                        byte b3 = $$a[17];
                        byte b4 = (byte) (b3 - 4);
                        Object[] objArr19 = new Object[1];
                        b(b3, b4, (byte) (b4 | 49), objArr19);
                        objEZpvd2 = YY.EZpvd(368, 5, (char) 0, -184211202, false, (String) objArr19[0], null);
                    }
                    ((Field) objEZpvd2).set(null, objArr);
                    try {
                        Long lValueOf = Long.valueOf(((Long) Class.forName(str).getDeclaredMethod(str2, new Class[0]).invoke(null, new Object[0])).longValue());
                        Object objEZpvd3 = YY.EZpvd(1699149472);
                        if (objEZpvd3 == null) {
                            byte b5 = (byte) ($$a[13] + 1);
                            byte b6 = (byte) (-b5);
                            Object[] objArr20 = new Object[1];
                            b(b5, b6, (byte) (b6 | 52), objArr20);
                            objEZpvd3 = YY.EZpvd(368, 5, (char) 0, 1634089948, false, (String) objArr20[0], null);
                        }
                        ((Field) objEZpvd3).set(null, lValueOf);
                    } catch (Exception unused) {
                        throw new RuntimeException();
                    }
                }
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        } else {
            Object objEZpvd4 = YY.EZpvd(-249174654);
            if (objEZpvd4 == null) {
                byte b7 = $$a[17];
                byte b8 = (byte) (b7 - 4);
                Object[] objArr21 = new Object[1];
                b(b7, b8, (byte) (b8 | 49), objArr21);
                objEZpvd4 = YY.EZpvd(368, 5, (char) 0, -184211202, false, (String) objArr21[0], null);
            }
            Object[] objArr22 = (Object[]) ((Field) objEZpvd4).get(null);
            objArr = new Object[]{new int[1], new int[]{((int[]) objArr22[1])[0]}, (String) objArr22[2], new int[]{((int[]) objArr22[3])[0]}, (String) objArr22[4]};
            int streamVolume = ((AudioManager) ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getSystemService(MimeTypes.BASE_TYPE_AUDIO)).getStreamVolume(3);
            int i4 = ~streamVolume;
            int i5 = ((((-1084221748) + ((1056898803 | i4) * (-369))) + (((~((-983186676) | i4)) | 209509027) * (-369))) + ((((~(streamVolume | 983186675)) | 73712128) | (~(i4 | (-847389777)))) * 369)) - 589603965;
            int i6 = i5 ^ (i5 << 13);
            int i7 = i6 ^ (i6 >>> 17);
            ((int[]) objArr[0])[0] = i7 ^ (i7 << 5);
        }
        int i8 = ((int[]) objArr[1])[0];
        int i9 = ((int[]) objArr[3])[0];
        if (i9 == i8) {
            int i10 = ((int[]) objArr[0])[0];
            Object[] objArr23 = {new int[1], new int[]{((int[]) objArr[1])[0]}, (String) objArr[2], new int[]{((int[]) objArr[3])[0]}, (String) objArr[4]};
            int i11 = i10 + ((((~((-897551382) | r5)) | 286754817) * (-241)) - 440740601) + (((~((~Process.myTid()) | (-610796565))) | 8389504) * 241);
            int i12 = (i11 << 13) ^ i11;
            int i13 = i12 ^ (i12 >>> 17);
            ((int[]) objArr23[0])[0] = i13 ^ (i13 << 5);
        } else {
            ArrayList arrayList = new ArrayList();
            arrayList.add((String) objArr[2]);
            arrayList.add((String) objArr[4]);
            try {
                Object[] objArr24 = {Long.valueOf((((long) (-2113625052)) << 32) ^ ((long) (i8 ^ i9))), Long.valueOf(-2113625084)};
                byte[] bArr2 = $$d;
                Object[] objArr25 = new Object[1];
                c(bArr2[133], bArr2[47], bArr2[55], objArr25);
                Class<?> cls3 = Class.forName((String) objArr25[0]);
                Object[] objArr26 = new Object[1];
                c((byte) (bArr2[3] + 1), bArr2[40], (short) 92, objArr26);
                cls3.getMethod((String) objArr26[0], Long.TYPE, Long.TYPE).invoke(null, objArr24);
                int i14 = ((int[]) objArr[0])[0];
                Object[] objArr27 = {new int[1], new int[]{((int[]) objArr[1])[0]}, (String) objArr[2], new int[]{((int[]) objArr[3])[0]}, (String) objArr[4]};
                int iIdentityHashCode = System.identityHashCode(this);
                int i15 = i14 + 356399508 + ((~(1039601526 | iIdentityHashCode)) * LuaValue.ERR_CLOSE_FILE_ERROR) + (((~((-1030162983) | iIdentityHashCode)) | (~((~iIdentityHashCode) | 162532720))) * LuaValue.ERR_CLOSE_FILE_ERROR) + (((~(iIdentityHashCode | (-162532721))) | (-1030162983)) * 301);
                int i16 = (i15 << 13) ^ i15;
                int i17 = i16 ^ (i16 >>> 17);
                ((int[]) objArr27[0])[0] = i17 ^ (i17 << 5);
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 == null) {
                    throw th2;
                }
                throw cause2;
            }
        }
        Object objEZpvd5 = YY.EZpvd(-160594826);
        if (objEZpvd5 == null) {
            byte b9 = $$a[17];
            byte b10 = (byte) (b9 - 4);
            Object[] objArr28 = new Object[1];
            b(b9, b10, (byte) (b10 | 49), objArr28);
            objEZpvd5 = YY.EZpvd(250, 5, (char) 0, -229816054, false, (String) objArr28[0], null);
        }
        long j2 = ((Field) objEZpvd5).getLong(null);
        if (j2 == -1 || j2 + 1963 < ((Long) Class.forName(str).getDeclaredMethod(str2, new Class[0]).invoke(null, new Object[0])).longValue()) {
            int iIntValue2 = ((Integer) Class.forName(str3).getMethod(str4, Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr29 = {1432500432};
                Object objEZpvd6 = YY.EZpvd(-336872700);
                if (objEZpvd6 == null) {
                    objEZpvd6 = YY.EZpvd(245, 5, (char) 0, -271878536, false, null, new Class[]{Integer.TYPE});
                }
                objArrAEQbTJ$1908f70b = C8561bEz.AEQbTJ$1908f70b(iIntValue2, 0, ((Constructor) objEZpvd6).newInstance(objArr29), 1639759166, false);
                Object objEZpvd7 = YY.EZpvd(4139753);
                if (objEZpvd7 == null) {
                    byte[] bArr3 = $$a;
                    Object[] objArr30 = new Object[1];
                    b(bArr3[24], (byte) ($$b & 5), bArr3[14], objArr30);
                    objEZpvd7 = YY.EZpvd(250, 5, (char) 0, 69199765, false, (String) objArr30[0], null);
                }
                ((Field) objEZpvd7).set(null, objArrAEQbTJ$1908f70b);
                try {
                    Long lValueOf2 = Long.valueOf(((Long) Class.forName(str).getDeclaredMethod(str2, new Class[0]).invoke(null, new Object[0])).longValue());
                    Object objEZpvd8 = YY.EZpvd(-160594826);
                    if (objEZpvd8 == null) {
                        byte b11 = $$a[17];
                        byte b12 = (byte) (b11 - 4);
                        Object[] objArr31 = new Object[1];
                        b(b11, b12, (byte) (b12 | 49), objArr31);
                        objEZpvd8 = YY.EZpvd(250, 5, (char) 0, -229816054, false, (String) objArr31[0], null);
                    }
                    ((Field) objEZpvd8).set(null, lValueOf2);
                } catch (Exception unused2) {
                    throw new RuntimeException();
                }
            } catch (Throwable th3) {
                Throwable cause3 = th3.getCause();
                if (cause3 == null) {
                    throw th3;
                }
                throw cause3;
            }
        } else {
            Object objEZpvd9 = YY.EZpvd(4139753);
            if (objEZpvd9 == null) {
                byte[] bArr4 = $$a;
                Object[] objArr32 = new Object[1];
                b(bArr4[24], (byte) ($$b & 5), bArr4[14], objArr32);
                objEZpvd9 = YY.EZpvd(250, 5, (char) 0, 69199765, false, (String) objArr32[0], null);
            }
            Object[] objArr33 = (Object[]) ((Field) objEZpvd9).get(null);
            objArrAEQbTJ$1908f70b = new Object[]{new int[]{((int[]) objArr33[0])[0]}, new int[]{((int[]) objArr33[1])[0]}, new int[1], (String[]) objArr33[3]};
            int streamVolume2 = ((AudioManager) ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getSystemService(MimeTypes.BASE_TYPE_AUDIO)).getStreamVolume(3);
            int i18 = ((((286327052 | r6) | (~(780331632 | streamVolume2))) * (-338)) - 192284828) + (((~(streamVolume2 | 1066658684)) | (~((-780331633) | (~streamVolume2)))) * 338) + 1639759166;
            int i19 = (i18 << 13) ^ i18;
            int i20 = i19 ^ (i19 >>> 17);
            ((int[]) objArrAEQbTJ$1908f70b[2])[0] = i20 ^ (i20 << 5);
        }
        int i21 = ((int[]) objArrAEQbTJ$1908f70b[0])[0];
        int i22 = ((int[]) objArrAEQbTJ$1908f70b[1])[0];
        if (i22 == i21) {
            int i23 = ((int[]) objArrAEQbTJ$1908f70b[2])[0];
            Object[] objArr34 = {new int[]{((int[]) objArrAEQbTJ$1908f70b[0])[0]}, new int[]{((int[]) objArrAEQbTJ$1908f70b[1])[0]}, new int[1], (String[]) objArrAEQbTJ$1908f70b[3]};
            int mode = ((AudioManager) ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getSystemService(MimeTypes.BASE_TYPE_AUDIO)).getMode();
            int i24 = i23 + 1511397068 + (((~(1742041982 | mode)) | 71377422) * (-756)) + (((~mode) | 1742041982) * 756);
            int i25 = (i24 << 13) ^ i24;
            int i26 = i25 ^ (i25 >>> 17);
            ((int[]) objArr34[2])[0] = i26 ^ (i26 << 5);
        } else {
            ArrayList arrayList2 = new ArrayList();
            String[] strArr = (String[]) objArrAEQbTJ$1908f70b[3];
            if (strArr != null) {
                for (String str5 : strArr) {
                    arrayList2.add(str5);
                }
            }
            Object[] objArr35 = {Long.valueOf((((long) (-778591794)) << 32) ^ ((long) (i21 ^ i22))), Long.valueOf(-778591796)};
            byte[] bArr5 = $$d;
            byte b13 = (byte) (bArr5[3] + 1);
            byte b14 = bArr5[23];
            Object[] objArr36 = new Object[1];
            c(b13, b14, (short) (b14 | 96), objArr36);
            Class<?> cls4 = Class.forName((String) objArr36[0]);
            Object[] objArr37 = new Object[1];
            c((byte) ($$e | 12), bArr5[47], bArr5[3], objArr37);
            cls4.getMethod((String) objArr37[0], Long.TYPE, Long.TYPE).invoke(null, objArr35);
            int i27 = ((int[]) objArrAEQbTJ$1908f70b[2])[0];
            Object[] objArr38 = {new int[]{((int[]) objArrAEQbTJ$1908f70b[0])[0]}, new int[]{((int[]) objArrAEQbTJ$1908f70b[1])[0]}, new int[1], (String[]) objArrAEQbTJ$1908f70b[3]};
            int ringerMode = ((AudioManager) ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getSystemService(MimeTypes.BASE_TYPE_AUDIO)).getRingerMode();
            int i28 = ~((-952256060) | (~ringerMode));
            int i29 = i27 + ((51644736 | i28 | (~(952256059 | ringerMode))) * (-338)) + 2089470988 + (((~(ringerMode | 1003900795)) | i28) * 338);
            int i30 = (i29 << 13) ^ i29;
            int i31 = i30 ^ (i30 >>> 17);
            ((int[]) objArr38[2])[0] = i31 ^ (i31 << 5);
        }
        Object objEZpvd10 = YY.EZpvd(1772514135);
        if (objEZpvd10 == null) {
            byte b15 = (byte) 0;
            Object[] objArr39 = new Object[1];
            b($$a[5], b15, (byte) (b15 | 43), objArr39);
            objEZpvd10 = YY.EZpvd(172, 4, (char) 0, 1837540907, false, (String) objArr39[0], null);
        }
        long j3 = ((Field) objEZpvd10).getLong(null);
        if (j3 == -1 || j3 + 2011 < ((Long) Class.forName(str).getDeclaredMethod(str2, new Class[0]).invoke(null, new Object[0])).longValue()) {
            Context baseContext2 = getBaseContext();
            if (baseContext2 == null) {
                Object[] objArr40 = new Object[1];
                a(null, 127, null, new byte[]{-125, -127, -116, -124, -105, -106, -118, -117, -122, -107, -122, -117, -112, -108, -121, -110, -110, -127, -121, -125, -122, -123, -124, -125, -126, -127}, objArr40);
                Class<?> cls5 = Class.forName((String) objArr40[0]);
                Object[] objArr41 = new Object[1];
                a(null, 127, null, new byte[]{-126, -123, -122, -117, -127, -112, -122, -113, -110, -110, -108, -117, -126, -116, -124, -124, -104, -112}, objArr41);
                baseContext2 = (Context) cls5.getMethod((String) objArr41[0], new Class[0]).invoke(null, null);
            }
            if (baseContext2 != null) {
                int i32 = aKErDB + 57;
                dNCPSb = i32 % 128;
                int i33 = i32 % 2;
                baseContext2 = ((baseContext2 instanceof ContextWrapper) && ((ContextWrapper) baseContext2).getBaseContext() == null) ? null : baseContext2.getApplicationContext();
            }
            Object[] objArr42 = {baseContext2, Integer.valueOf(((Integer) Class.forName(str3).getMethod(str4, Object.class).invoke(null, this)).intValue()), 0, -681324989};
            byte[] bArr6 = $$d;
            byte b16 = (byte) (bArr6[3] + 1);
            byte b17 = bArr6[23];
            Object[] objArr43 = new Object[1];
            c(b16, b17, (short) (b17 | 110), objArr43);
            Class<?> cls6 = Class.forName((String) objArr43[0]);
            byte b18 = bArr6[3];
            byte b19 = bArr6[10];
            Object[] objArr44 = new Object[1];
            c(b18, b19, (short) (b19 | 98), objArr44);
            objArr2 = (Object[]) cls6.getMethod((String) objArr44[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr42);
            if (baseContext2 != null) {
                int i34 = aKErDB + 61;
                dNCPSb = i34 % 128;
                int i35 = i34 % 2;
                Object objEZpvd11 = YY.EZpvd(1361516365);
                if (objEZpvd11 == null) {
                    byte[] bArr7 = $$a;
                    Object[] objArr45 = new Object[1];
                    b(bArr7[24], (byte) ($$b & 5), bArr7[14], objArr45);
                    objEZpvd11 = YY.EZpvd(172, 4, (char) 0, 1426577969, false, (String) objArr45[0], null);
                }
                ((Field) objEZpvd11).set(null, objArr2);
                try {
                    Long lValueOf3 = Long.valueOf(((Long) Class.forName(str).getDeclaredMethod(str2, new Class[0]).invoke(null, new Object[0])).longValue());
                    Object objEZpvd12 = YY.EZpvd(1772514135);
                    if (objEZpvd12 == null) {
                        byte b20 = (byte) 0;
                        Object[] objArr46 = new Object[1];
                        b($$a[5], b20, (byte) (b20 | 43), objArr46);
                        objEZpvd12 = YY.EZpvd(172, 4, (char) 0, 1837540907, false, (String) objArr46[0], null);
                    }
                    ((Field) objEZpvd12).set(null, lValueOf3);
                } catch (Exception unused3) {
                    throw new RuntimeException();
                }
            }
        } else {
            Object objEZpvd13 = YY.EZpvd(1361516365);
            if (objEZpvd13 == null) {
                byte[] bArr8 = $$a;
                Object[] objArr47 = new Object[1];
                b(bArr8[24], (byte) ($$b & 5), bArr8[14], objArr47);
                objEZpvd13 = YY.EZpvd(172, 4, (char) 0, 1426577969, false, (String) objArr47[0], null);
            }
            Object[] objArr48 = (Object[]) ((Field) objEZpvd13).get(null);
            objArr2 = new Object[]{new int[]{i}, str, new int[1], new int[]{i}};
            int i36 = ((int[]) objArr48[3])[0];
            int i37 = ((int[]) objArr48[0])[0];
            String str6 = (String) objArr48[1];
            int ringerMode2 = ((AudioManager) ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getSystemService(MimeTypes.BASE_TYPE_AUDIO)).getRingerMode();
            int i38 = ~ringerMode2;
            int i39 = ((((-1129772783) + ((((~((-252565334) | i38)) | 117540420) | (~(141326779 | i38))) * (-1136))) + ((((~((-252565334) | ringerMode2)) | (~(141326779 | ringerMode2))) | (~((-6301867) | i38))) * (-568))) + (((~(ringerMode2 | (-117540421))) | ((~(i38 | (-141326780))) | (~(252565333 | i38)))) * 568)) - 681324989;
            int i40 = (i39 << 13) ^ i39;
            int i41 = i40 ^ (i40 >>> 17);
            ((int[]) objArr2[2])[0] = i41 ^ (i41 << 5);
        }
        int i42 = ((int[]) objArr2[0])[0];
        int i43 = ((int[]) objArr2[3])[0];
        if (i43 == i42) {
            Object[] objArr49 = {new int[]{i}, str, new int[1], new int[]{i}};
            int i44 = ((int[]) objArr2[2])[0];
            int i45 = ((int[]) objArr2[3])[0];
            int i46 = ((int[]) objArr2[0])[0];
            String str7 = (String) objArr2[1];
            int i47 = ~((int) Process.getStartUptimeMillis());
            int i48 = i44 + 1237861243 + (((-110100501) | i47) * 494) + (((~(i47 | (-535872669))) | 962782890) * 494);
            int i49 = (i48 << 13) ^ i48;
            int i50 = i49 ^ (i49 >>> 17);
            ((int[]) objArr49[2])[0] = i50 ^ (i50 << 5);
        } else {
            Object[] objArr50 = {Long.valueOf((((long) (-1971427523)) << 32) ^ ((long) (i42 ^ i43))), Long.valueOf(-1971427527)};
            byte[] bArr9 = $$d;
            byte b21 = (byte) (bArr9[3] + 1);
            byte b22 = bArr9[23];
            Object[] objArr51 = new Object[1];
            c(b21, b22, (short) (b22 | 119), objArr51);
            Class<?> cls7 = Class.forName((String) objArr51[0]);
            byte b23 = bArr9[3];
            byte b24 = bArr9[10];
            Object[] objArr52 = new Object[1];
            c(b23, b24, (short) (b24 | 98), objArr52);
            cls7.getMethod((String) objArr52[0], Long.TYPE, Long.TYPE).invoke(null, objArr50);
            Object[] objArr53 = {new int[]{i}, str, new int[1], new int[]{i}};
            int i51 = ((int[]) objArr2[2])[0];
            int i52 = ((int[]) objArr2[3])[0];
            int i53 = ((int[]) objArr2[0])[0];
            String str8 = (String) objArr2[1];
            int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
            int i54 = ~iElapsedRealtime;
            int i55 = i51 + 586860902 + ((iElapsedRealtime | 58396104) * (-859)) + (((~(iElapsedRealtime | (-52563393))) | (~(58396104 | i54))) * 859) + (((~((-52842450) | i54)) | 279057) * 859);
            int i56 = (i55 << 13) ^ i55;
            int i57 = i56 ^ (i56 >>> 17);
            ((int[]) objArr53[2])[0] = i57 ^ (i57 << 5);
        }
        Object objEZpvd14 = YY.EZpvd(114367195);
        if (objEZpvd14 == null) {
            byte b25 = (byte) (-$$a[12]);
            Object[] objArr54 = new Object[1];
            b(b25, (byte) (b25 & 7), r1[6], objArr54);
            objEZpvd14 = YY.EZpvd(172, 4, (char) 0, 49403815, false, (String) objArr54[0], null);
        }
        long j4 = ((Field) objEZpvd14).getLong(null);
        if (j4 == -1 || j4 + 1934 < ((Long) Class.forName(str).getDeclaredMethod(str2, new Class[0]).invoke(null, new Object[0])).longValue()) {
            Object[] objArr55 = {Integer.valueOf(((Integer) Class.forName(str3).getMethod(str4, Object.class).invoke(null, this)).intValue()), -1165759428};
            byte[] bArr10 = $$d;
            byte b26 = (byte) (bArr10[3] + 1);
            byte b27 = bArr10[23];
            Object[] objArr56 = new Object[1];
            c(b26, b27, (short) (b27 | 123), objArr56);
            Class<?> cls8 = Class.forName((String) objArr56[0]);
            byte b28 = (byte) (bArr10[3] + 1);
            byte b29 = bArr10[133];
            Object[] objArr57 = new Object[1];
            c(b28, b29, (short) (b29 | 106), objArr57);
            objArr3 = (Object[]) cls8.getMethod((String) objArr57[0], Integer.TYPE, Integer.TYPE).invoke(null, objArr55);
            Object objEZpvd15 = YY.EZpvd(-1686262422);
            if (objEZpvd15 == null) {
                byte b30 = $$a[9];
                byte b31 = (byte) ($$b & 5);
                Object[] objArr58 = new Object[1];
                b(b30, b31, (byte) (b31 | 52), objArr58);
                objEZpvd15 = YY.EZpvd(172, 4, (char) 0, -1621270506, false, (String) objArr58[0], null);
            }
            ((Field) objEZpvd15).set(null, objArr3);
            try {
                Long lValueOf4 = Long.valueOf(((Long) Class.forName(str).getDeclaredMethod(str2, new Class[0]).invoke(null, new Object[0])).longValue());
                Object objEZpvd16 = YY.EZpvd(114367195);
                if (objEZpvd16 == null) {
                    byte b32 = (byte) (-$$a[12]);
                    Object[] objArr59 = new Object[1];
                    b(b32, (byte) (b32 & 7), r6[6], objArr59);
                    objEZpvd16 = YY.EZpvd(172, 4, (char) 0, 49403815, false, (String) objArr59[0], null);
                }
                ((Field) objEZpvd16).set(null, lValueOf4);
            } catch (Exception unused4) {
                throw new RuntimeException();
            }
        } else {
            Object objEZpvd17 = YY.EZpvd(-1686262422);
            if (objEZpvd17 == null) {
                byte b33 = $$a[9];
                byte b34 = (byte) ($$b & 5);
                Object[] objArr60 = new Object[1];
                b(b33, b34, (byte) (b34 | 52), objArr60);
                objEZpvd17 = YY.EZpvd(172, 4, (char) 0, -1621270506, false, (String) objArr60[0], null);
            }
            Object[] objArr61 = (Object[]) ((Field) objEZpvd17).get(null);
            objArr3 = new Object[]{new int[]{i}, str, new int[1], new int[]{i}};
            int i58 = ((int[]) objArr61[3])[0];
            int i59 = ((int[]) objArr61[0])[0];
            String str9 = (String) objArr61[1];
            int i60 = Settings.System.getInt(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getContentResolver(), "screen_brightness", -1);
            int i61 = (((-320740540) + (((~(i60 | 242826583)) | 25608872) * 305)) + (((~((~i60) | 242826583)) | 131588029) * 305)) - 1165759428;
            int i62 = (i61 << 13) ^ i61;
            int i63 = i62 ^ (i62 >>> 17);
            ((int[]) objArr3[2])[0] = i63 ^ (i63 << 5);
        }
        int i64 = ((int[]) objArr3[0])[0];
        int i65 = ((int[]) objArr3[3])[0];
        if (i65 == i64) {
            Object[] objArr62 = {new int[]{i}, str, new int[1], new int[]{i}};
            int i66 = ((int[]) objArr3[2])[0];
            int i67 = ((int[]) objArr3[3])[0];
            int i68 = ((int[]) objArr3[0])[0];
            String str10 = (String) objArr3[1];
            int iIdentityHashCode2 = System.identityHashCode(this);
            int i69 = ~(710445799 | iIdentityHashCode2);
            int i70 = i66 + (-1730237419) + (((-738177008) | i69) * (-814)) + ((i69 | (~((~iIdentityHashCode2) | 599207245)) | 571476037) * 407) + (((~(iIdentityHashCode2 | (-599207246))) | (~((-710445800) | iIdentityHashCode2)) | 571476037) * 407);
            int i71 = (i70 << 13) ^ i70;
            int i72 = i71 ^ (i71 >>> 17);
            ((int[]) objArr62[2])[0] = i72 ^ (i72 << 5);
        } else {
            new ArrayList().add((String) objArr3[1]);
            long j5 = (((long) 1781933406) << 32) ^ ((long) (i64 ^ i65));
            long j6 = 1781933390;
            int i73 = dNCPSb + 123;
            int i74 = i73 % 128;
            aKErDB = i74;
            int i75 = i73 % 2;
            int i76 = i74 + 85;
            dNCPSb = i76 % 128;
            int i77 = i76 % 2;
            Object[] objArr63 = {Long.valueOf(j5), Long.valueOf(j6)};
            byte[] bArr11 = $$d;
            byte b35 = (byte) (bArr11[3] + 1);
            byte b36 = bArr11[23];
            Object[] objArr64 = new Object[1];
            c(b35, b36, (short) (b36 | 119), objArr64);
            Class<?> cls9 = Class.forName((String) objArr64[0]);
            byte b37 = bArr11[3];
            byte b38 = bArr11[10];
            Object[] objArr65 = new Object[1];
            c(b37, b38, (short) (b38 | 98), objArr65);
            cls9.getMethod((String) objArr65[0], Long.TYPE, Long.TYPE).invoke(null, objArr63);
            Object[] objArr66 = {new int[]{i}, str, new int[1], new int[]{i}};
            int i78 = ((int[]) objArr3[2])[0];
            int i79 = ((int[]) objArr3[3])[0];
            int i80 = ((int[]) objArr3[0])[0];
            String str11 = (String) objArr3[1];
            int iNextInt = new Random().nextInt();
            int i81 = ~iNextInt;
            int i82 = i78 + (((~(i81 | (-543361025))) | (~((-654599579) | i81)) | 536870912) * (-397)) + 570840824 + ((iNextInt | (-124218779)) * 397);
            int i83 = (i82 << 13) ^ i82;
            int i84 = i83 ^ (i83 >>> 17);
            ((int[]) objArr66[2])[0] = i84 ^ (i84 << 5);
        }
        Object objEZpvd18 = YY.EZpvd(1457287029);
        if (objEZpvd18 == null) {
            byte b39 = $$a[25];
            Object[] objArr67 = new Object[1];
            b(b39, (byte) (b39 >>> 2), (byte) ($$b & 87), objArr67);
            objEZpvd18 = YY.EZpvd(172, 4, (char) 0, 1392288265, false, (String) objArr67[0], null);
        }
        long j7 = ((Field) objEZpvd18).getLong(null);
        if (j7 == -1 || j7 + 1906 < ((Long) Class.forName(str).getDeclaredMethod(str2, new Class[0]).invoke(null, new Object[0])).longValue()) {
            Context baseContext3 = getBaseContext();
            if (baseContext3 == null) {
                Object[] objArr68 = new Object[1];
                a(null, 127, null, new byte[]{-125, -127, -116, -124, -105, -106, -118, -117, -122, -107, -122, -117, -112, -108, -121, -110, -110, -127, -121, -125, -122, -123, -124, -125, -126, -127}, objArr68);
                Class<?> cls10 = Class.forName((String) objArr68[0]);
                Object[] objArr69 = new Object[1];
                a(null, 127, null, new byte[]{-126, -123, -122, -117, -127, -112, -122, -113, -110, -110, -108, -117, -126, -116, -124, -124, -104, -112}, objArr69);
                baseContext3 = (Context) cls10.getMethod((String) objArr69[0], new Class[0]).invoke(null, null);
            }
            if (baseContext3 != null) {
                baseContext3 = ((baseContext3 instanceof ContextWrapper) && ((ContextWrapper) baseContext3).getBaseContext() == null) ? null : baseContext3.getApplicationContext();
            }
            int iIntValue3 = ((Integer) Class.forName(str3).getMethod(str4, Object.class).invoke(null, this)).intValue();
            int i85 = dNCPSb + 11;
            aKErDB = i85 % 128;
            int i86 = i85 % 2;
            Object[] objArr70 = {baseContext3, Integer.valueOf(iIntValue3), 52560863};
            byte[] bArr12 = $$d;
            byte b40 = (byte) (bArr12[3] + 1);
            byte b41 = bArr12[23];
            Object[] objArr71 = new Object[1];
            c(b40, b41, (short) (b41 | 131), objArr71);
            Class<?> cls11 = Class.forName((String) objArr71[0]);
            Object[] objArr72 = new Object[1];
            c(bArr12[3], (byte) (-bArr12[151]), bArr12[8], objArr72);
            objArr4 = (Object[]) cls11.getMethod((String) objArr72[0], Context.class, Integer.TYPE, Integer.TYPE).invoke(null, objArr70);
            if (baseContext3 != null) {
                Object objEZpvd19 = YY.EZpvd(1362558065);
                if (objEZpvd19 == null) {
                    byte b42 = $$a[33];
                    Object[] objArr73 = new Object[1];
                    b((byte) 37, b42, (byte) (b42 - 2), objArr73);
                    objEZpvd19 = YY.EZpvd(172, 4, (char) 0, 1427517709, false, (String) objArr73[0], null);
                }
                ((Field) objEZpvd19).set(null, objArr4);
                try {
                    Long lValueOf5 = Long.valueOf(((Long) Class.forName(str).getDeclaredMethod(str2, new Class[0]).invoke(null, new Object[0])).longValue());
                    Object objEZpvd20 = YY.EZpvd(1457287029);
                    if (objEZpvd20 == null) {
                        byte b43 = $$a[25];
                        Object[] objArr74 = new Object[1];
                        b(b43, (byte) (b43 >>> 2), (byte) ($$b & 87), objArr74);
                        objEZpvd20 = YY.EZpvd(172, 4, (char) 0, 1392288265, false, (String) objArr74[0], null);
                    }
                    ((Field) objEZpvd20).set(null, lValueOf5);
                } catch (Exception unused5) {
                    throw new RuntimeException();
                }
            }
        } else {
            int i87 = aKErDB + WalletImportError.ERROR_CODE_HARDWARE_ACCOUNT_EXIST;
            dNCPSb = i87 % 128;
            int i88 = i87 % 2;
            Object objEZpvd21 = YY.EZpvd(1362558065);
            if (objEZpvd21 == null) {
                byte b44 = $$a[33];
                Object[] objArr75 = new Object[1];
                b((byte) 37, b44, (byte) (b44 - 2), objArr75);
                objEZpvd21 = YY.EZpvd(172, 4, (char) 0, 1427517709, false, (String) objArr75[0], null);
            }
            Object[] objArr76 = (Object[]) ((Field) objEZpvd21).get(null);
            objArr4 = new Object[]{new int[]{i}, str, new int[1], new int[]{i}};
            int i89 = ((int[]) objArr76[3])[0];
            int i90 = ((int[]) objArr76[0])[0];
            String str12 = (String) objArr76[1];
            int iIdentityHashCode3 = System.identityHashCode(this);
            int i91 = ((((~(277555116 | r5)) | (~(iIdentityHashCode3 | 388793670))) * 959) - 810400859) + (((~(iIdentityHashCode3 | 277555116)) | (~((~iIdentityHashCode3) | 388793670))) * 959) + 52560863;
            int i92 = (i91 << 13) ^ i91;
            int i93 = i92 ^ (i92 >>> 17);
            ((int[]) objArr4[2])[0] = i93 ^ (i93 << 5);
        }
        int i94 = ((int[]) objArr4[0])[0];
        int i95 = ((int[]) objArr4[3])[0];
        if (i95 == i94) {
            Object[] objArr77 = {new int[]{i}, str, new int[1], new int[]{i}};
            int i96 = ((int[]) objArr4[2])[0];
            int i97 = ((int[]) objArr4[3])[0];
            int i98 = ((int[]) objArr4[0])[0];
            String str13 = (String) objArr4[1];
            int elapsedCpuTime = (int) Process.getElapsedCpuTime();
            int i99 = (-762673011) + ((elapsedCpuTime | (-52874754)) * CipherSuite.TLS_PSK_WITH_AES_128_CBC_SHA);
            int i100 = ~elapsedCpuTime;
            int i101 = i96 + i99 + (((~((-52874754) | i100)) | 16779777) * (-280)) + (((~(elapsedCpuTime | (-16779778))) | (~(164113307 | i100)) | (-200208284)) * CipherSuite.TLS_PSK_WITH_AES_128_CBC_SHA);
            int i102 = (i101 << 13) ^ i101;
            int i103 = i102 ^ (i102 >>> 17);
            ((int[]) objArr77[2])[0] = i103 ^ (i103 << 5);
        } else {
            Object[] objArr78 = {Long.valueOf((((long) 1233960390) << 32) ^ ((long) (i94 ^ i95))), Long.valueOf(1233960902)};
            byte[] bArr13 = $$d;
            byte b45 = (byte) (bArr13[3] + 1);
            byte b46 = bArr13[23];
            Object[] objArr79 = new Object[1];
            c(b45, b46, (short) (b46 | 119), objArr79);
            Class<?> cls12 = Class.forName((String) objArr79[0]);
            byte b47 = bArr13[3];
            byte b48 = bArr13[10];
            Object[] objArr80 = new Object[1];
            c(b47, b48, (short) (b48 | 98), objArr80);
            cls12.getMethod((String) objArr80[0], Long.TYPE, Long.TYPE).invoke(null, objArr78);
            Object[] objArr81 = {new int[]{i}, str, new int[1], new int[]{i}};
            int i104 = ((int[]) objArr4[2])[0];
            int i105 = ((int[]) objArr4[3])[0];
            int i106 = ((int[]) objArr4[0])[0];
            String str14 = (String) objArr4[1];
            int iNextInt2 = new Random().nextInt();
            int i107 = ~iNextInt2;
            int i108 = i104 + 1465351669 + (((~(67025789 | i107)) | 44212764) * 220) + (((~(i107 | 62303036)) | 48935517) * (-440)) + ((iNextInt2 | 67025789) * 220);
            int i109 = (i108 << 13) ^ i108;
            int i110 = i109 ^ (i109 >>> 17);
            ((int[]) objArr81[2])[0] = i110 ^ (i110 << 5);
        }
        Object objEZpvd22 = YY.EZpvd(-1484370570);
        if (objEZpvd22 == null) {
            byte b49 = $$a[25];
            Object[] objArr82 = new Object[1];
            b(b49, (byte) (b49 >>> 2), (byte) ($$b & 87), objArr82);
            objEZpvd22 = YY.EZpvd(CipherSuite.TLS_DH_DSS_WITH_CAMELLIA_256_CBC_SHA, 4, (char) 0, -1549369334, false, (String) objArr82[0], null);
        }
        long j8 = ((Field) objEZpvd22).getLong(null);
        if (j8 == -1 || j8 + 1967 < ((Long) Class.forName(str).getDeclaredMethod(str2, new Class[0]).invoke(null, new Object[0])).longValue()) {
            Object objEZpvd23 = YY.EZpvd(981579467);
            if (objEZpvd23 == null) {
                objEZpvd23 = YY.EZpvd(PsExtractor.VIDEO_STREAM_MASK, 5, (char) 0, 1050770359, false, null, new Class[0]);
            }
            Object[] objArr83 = {null, ((Constructor) objEZpvd23).newInstance(null), 1381309686, 0};
            Object objEZpvd24 = YY.EZpvd(1167604386);
            if (objEZpvd24 == null) {
                byte b50 = (byte) 0;
                Object[] objArr84 = new Object[1];
                b($$a[5], b50, (byte) (b50 | 43), objArr84);
                objEZpvd24 = YY.EZpvd(CipherSuite.TLS_DH_DSS_WITH_CAMELLIA_256_CBC_SHA, 4, (char) 0, 1102641118, false, (String) objArr84[0], new Class[]{(Class) YY.AEQbTJ(CipherSuite.TLS_DH_anon_WITH_CAMELLIA_256_CBC_SHA, 13, (char) 2212), (Class) YY.AEQbTJ(150, 22, (char) 48137), Integer.TYPE, Integer.TYPE});
            }
            objArr5 = (Object[]) ((Method) objEZpvd24).invoke(null, objArr83);
            Object objEZpvd25 = YY.EZpvd(1636616175);
            if (objEZpvd25 == null) {
                byte b51 = (byte) ($$a[13] + 1);
                byte b52 = (byte) (-b51);
                Object[] objArr85 = new Object[1];
                b(b51, b52, (byte) (b52 | 52), objArr85);
                objEZpvd25 = YY.EZpvd(CipherSuite.TLS_DH_DSS_WITH_CAMELLIA_256_CBC_SHA, 4, (char) 0, 1705773715, false, (String) objArr85[0], null);
            }
            ((Field) objEZpvd25).set(null, objArr5);
            try {
                Long lValueOf6 = Long.valueOf(((Long) Class.forName(str).getDeclaredMethod(str2, new Class[0]).invoke(null, new Object[0])).longValue());
                Object objEZpvd26 = YY.EZpvd(-1484370570);
                if (objEZpvd26 == null) {
                    byte b53 = $$a[25];
                    Object[] objArr86 = new Object[1];
                    b(b53, (byte) (b53 >>> 2), (byte) ($$b & 87), objArr86);
                    objEZpvd26 = YY.EZpvd(CipherSuite.TLS_DH_DSS_WITH_CAMELLIA_256_CBC_SHA, 4, (char) 0, -1549369334, false, (String) objArr86[0], null);
                }
                ((Field) objEZpvd26).set(null, lValueOf6);
            } catch (Exception unused6) {
                throw new RuntimeException();
            }
        } else {
            int i111 = dNCPSb + 11;
            aKErDB = i111 % 128;
            int i112 = i111 % 2;
            Object objEZpvd27 = YY.EZpvd(1636616175);
            if (objEZpvd27 == null) {
                byte b54 = (byte) ($$a[13] + 1);
                byte b55 = (byte) (-b54);
                Object[] objArr87 = new Object[1];
                b(b54, b55, (byte) (b55 | 52), objArr87);
                objEZpvd27 = YY.EZpvd(CipherSuite.TLS_DH_DSS_WITH_CAMELLIA_256_CBC_SHA, 4, (char) 0, 1705773715, false, (String) objArr87[0], null);
            }
            Object[] objArr88 = (Object[]) ((Field) objEZpvd27).get(null);
            objArr5 = new Object[]{new int[1], new int[1], new int[1]};
            int i113 = ((int[]) objArr88[0])[0];
            int i114 = ((int[]) objArr88[2])[0];
            ((int[]) objArr5[0])[0] = i113;
            ((int[]) objArr5[2])[0] = i114;
            int i115 = ~((AudioManager) ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getSystemService(MimeTypes.BASE_TYPE_AUDIO)).getMode();
            int i116 = 947148475 + (((~(i115 | 642123499)) | 162068740) * (-160)) + (((~(i115 | 195624911)) | 642123499) * CipherSuite.TLS_DH_RSA_WITH_AES_128_GCM_SHA256) + 1381309686;
            int i117 = (i116 << 13) ^ i116;
            int i118 = i117 ^ (i117 >>> 17);
            ((int[]) objArr5[1])[0] = i118 ^ (i118 << 5);
        }
        Object obj = objArr5[2];
        int i119 = ((int[]) obj)[0];
        Object obj2 = objArr5[0];
        int i120 = ((int[]) obj2)[0];
        if (i120 == i119) {
            Object[] objArr89 = {new int[1], new int[1], new int[1]};
            int i121 = ((int[]) objArr5[1])[0];
            int i122 = ((int[]) obj2)[0];
            int i123 = ((int[]) obj)[0];
            ((int[]) objArr89[0])[0] = i122;
            ((int[]) objArr89[2])[0] = i123;
            int iIdentityHashCode4 = System.identityHashCode(this);
            int i124 = i121 + 1255285795 + (((~((-58507579) | iIdentityHashCode4)) | 52445472) * 104) + ((~((~iIdentityHashCode4) | 394053115)) * (-104)) + ((iIdentityHashCode4 | 387991009) * 104);
            int i125 = i124 ^ (i124 << 13);
            int i126 = i125 ^ (i125 >>> 17);
            ((int[]) objArr89[1])[0] = i126 ^ (i126 << 5);
        } else {
            Object[] objArr90 = {Long.valueOf(((long) (i119 ^ i120)) ^ (((long) (-480751527)) << 32)), Long.valueOf(-480755623)};
            byte[] bArr14 = $$d;
            byte b56 = (byte) (bArr14[3] + 1);
            byte b57 = bArr14[23];
            Object[] objArr91 = new Object[1];
            c(b56, b57, (short) (b57 | 135), objArr91);
            Class<?> cls13 = Class.forName((String) objArr91[0]);
            Object[] objArr92 = new Object[1];
            c((byte) (bArr14[3] + 1), bArr14[40], (short) 92, objArr92);
            cls13.getMethod((String) objArr92[0], Long.TYPE, Long.TYPE).invoke(null, objArr90);
            Object[] objArr93 = {new int[1], new int[1], new int[1]};
            int i127 = ((int[]) objArr5[1])[0];
            int i128 = ((int[]) objArr5[0])[0];
            int i129 = ((int[]) objArr5[2])[0];
            ((int[]) objArr93[0])[0] = i128;
            ((int[]) objArr93[2])[0] = i129;
            int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
            int i130 = ~iMaxMemory;
            int i131 = i127 + 654625539 + (((~((-936108399) | i130)) | 583082284 | (~(489609810 | i130))) * (-1136)) + (((~((-936108399) | iMaxMemory)) | (~(489609810 | iMaxMemory)) | (~((-136583697) | i130))) * (-568)) + (((~(iMaxMemory | (-583082285))) | (~(i130 | (-489609811))) | (~(936108398 | i130))) * 568);
            int i132 = (i131 << 13) ^ i131;
            int i133 = i132 ^ (i132 >>> 17);
            ((int[]) objArr93[1])[0] = i133 ^ (i133 << 5);
        }
        Object objEZpvd28 = YY.EZpvd(-1909595884);
        if (objEZpvd28 == null) {
            byte b58 = $$a[17];
            byte b59 = (byte) (b58 - 4);
            Object[] objArr94 = new Object[1];
            b(b58, b59, (byte) (b59 | 49), objArr94);
            objEZpvd28 = YY.EZpvd(CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA256, 4, (char) 0, -1978848152, false, (String) objArr94[0], null);
        }
        long j9 = ((Field) objEZpvd28).getLong(null);
        if (j9 == -1 || j9 + 1939 < ((Long) Class.forName(str).getDeclaredMethod(str2, new Class[0]).invoke(null, new Object[0])).longValue()) {
            Object[] objArr95 = {Integer.valueOf(((Integer) Class.forName(str3).getMethod(str4, Object.class).invoke(null, this)).intValue()), 0, -1729921709};
            Object objEZpvd29 = YY.EZpvd(544886635);
            if (objEZpvd29 == null) {
                byte[] bArr15 = $$a;
                Object[] objArr96 = new Object[1];
                b(bArr15[24], (byte) ($$b & 5), bArr15[14], objArr96);
                objEZpvd29 = YY.EZpvd(CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA256, 4, (char) 0, 609911319, false, (String) objArr96[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE});
            }
            objArr6 = (Object[]) ((Method) objEZpvd29).invoke(null, objArr95);
            Object objEZpvd30 = YY.EZpvd(-131060873);
            if (objEZpvd30 == null) {
                byte b60 = $$a[25];
                Object[] objArr97 = new Object[1];
                b(b60, (byte) (b60 >>> 2), (byte) ($$b & 87), objArr97);
                objEZpvd30 = YY.EZpvd(CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA256, 4, (char) 0, -66001397, false, (String) objArr97[0], null);
            }
            ((Field) objEZpvd30).set(null, objArr6);
            try {
                Long lValueOf7 = Long.valueOf(((Long) Class.forName(str).getDeclaredMethod(str2, new Class[0]).invoke(null, new Object[0])).longValue());
                Object objEZpvd31 = YY.EZpvd(-1909595884);
                if (objEZpvd31 == null) {
                    byte b61 = $$a[17];
                    byte b62 = (byte) (b61 - 4);
                    Object[] objArr98 = new Object[1];
                    b(b61, b62, (byte) (b62 | 49), objArr98);
                    objEZpvd31 = YY.EZpvd(CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA256, 4, (char) 0, -1978848152, false, (String) objArr98[0], null);
                }
                ((Field) objEZpvd31).set(null, lValueOf7);
            } catch (Exception unused7) {
                throw new RuntimeException();
            }
        } else {
            Object objEZpvd32 = YY.EZpvd(-131060873);
            if (objEZpvd32 == null) {
                byte b63 = $$a[25];
                Object[] objArr99 = new Object[1];
                b(b63, (byte) (b63 >>> 2), (byte) ($$b & 87), objArr99);
                objEZpvd32 = YY.EZpvd(CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA256, 4, (char) 0, -66001397, false, (String) objArr99[0], null);
            }
            Object[] objArr100 = (Object[]) ((Field) objEZpvd32).get(null);
            objArr6 = new Object[]{strArr, new int[]{i}, new int[]{i}, new int[1]};
            int i134 = ((int[]) objArr100[1])[0];
            int i135 = ((int[]) objArr100[2])[0];
            String[] strArr2 = (String[]) objArr100[0];
            int i136 = Settings.System.getInt(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getContentResolver(), "screen_brightness", -1);
            int i137 = ~i136;
            int i138 = (-417951956) + (((~((-56953643) | i137)) | 52496936) * (-1188));
            int i139 = (~(i136 | 56953642)) | 52496936;
            int i140 = ~(658049705 | i137);
            int i141 = ((i138 + ((i139 | i140) * 594)) + ((((~(56953642 | i137)) | (-662506412)) | i140) * 594)) - 1729921709;
            int i142 = (i141 << 13) ^ i141;
            int i143 = i142 ^ (i142 >>> 17);
            ((int[]) objArr6[3])[0] = i143 ^ (i143 << 5);
        }
        int i144 = ((int[]) objArr6[2])[0];
        int i145 = ((int[]) objArr6[1])[0];
        if (i145 == i144) {
            Object[] objArr101 = {strArr, new int[]{i}, new int[]{i}, new int[1]};
            int i146 = ((int[]) objArr6[3])[0];
            int i147 = ((int[]) objArr6[1])[0];
            int i148 = ((int[]) objArr6[2])[0];
            String[] strArr3 = (String[]) objArr6[0];
            int iIdentityHashCode5 = System.identityHashCode(this);
            int i149 = ~iIdentityHashCode5;
            int i150 = i146 + (-932443438) + (((~((-73924609) | iIdentityHashCode5)) | (~(i149 | 107692324)) | (-527171455)) * 717) + (((~(iIdentityHashCode5 | 107692324)) | (~((-73924609) | i149)) | (-527171455)) * 717);
            int i151 = (i150 << 13) ^ i150;
            int i152 = i151 ^ (i151 >>> 17);
            ((int[]) objArr101[3])[0] = i152 ^ (i152 << 5);
        } else {
            ArrayList arrayList3 = new ArrayList();
            String[] strArr4 = (String[]) objArr6[0];
            if (strArr4 != null) {
                for (String str15 : strArr4) {
                    arrayList3.add(str15);
                }
            }
            Object[] objArr102 = {Long.valueOf((((long) 1976953427) << 32) ^ ((long) (i144 ^ i145))), Long.valueOf(1976953426)};
            byte[] bArr16 = $$d;
            byte b64 = (byte) (bArr16[3] + 1);
            byte b65 = bArr16[23];
            Object[] objArr103 = new Object[1];
            c(b64, b65, (short) (b65 | 139), objArr103);
            Class<?> cls14 = Class.forName((String) objArr103[0]);
            Object[] objArr104 = new Object[1];
            c((byte) (bArr16[3] + 1), bArr16[40], (short) 92, objArr104);
            cls14.getMethod((String) objArr104[0], Long.TYPE, Long.TYPE).invoke(null, objArr102);
            Object[] objArr105 = {strArr, new int[]{i}, new int[]{i}, new int[1]};
            int i153 = ((int[]) objArr6[3])[0];
            int i154 = ((int[]) objArr6[1])[0];
            int i155 = ((int[]) objArr6[2])[0];
            String[] strArr5 = (String[]) objArr6[0];
            int iIdentityHashCode6 = System.identityHashCode(this);
            int i156 = ~iIdentityHashCode6;
            int i157 = i153 + (-1597866466) + (((~(527994725 | i156)) | 225304) * CipherSuite.TLS_RSA_PSK_WITH_NULL_SHA256) + ((iIdentityHashCode6 | 455118692) * (-184)) + ((~((-73101338) | i156)) * CipherSuite.TLS_RSA_PSK_WITH_NULL_SHA256);
            int i158 = (i157 << 13) ^ i157;
            int i159 = i158 ^ (i158 >>> 17);
            ((int[]) objArr105[3])[0] = i159 ^ (i159 << 5);
        }
        Object objEZpvd33 = YY.EZpvd(-1900789179);
        if (objEZpvd33 == null) {
            byte[] bArr17 = $$a;
            Object[] objArr106 = new Object[1];
            b(bArr17[24], (byte) ($$b & 5), bArr17[14], objArr106);
            objEZpvd33 = YY.EZpvd(226, 4, (char) 0, -1969975495, false, (String) objArr106[0], null);
        }
        long j10 = ((Field) objEZpvd33).getLong(null);
        if (j10 == -1 || j10 + 1930 < ((Long) Class.forName(str).getDeclaredMethod(str2, new Class[0]).invoke(null, new Object[0])).longValue()) {
            Object[] objArr107 = {Integer.valueOf(((Integer) Class.forName(str3).getMethod(str4, Object.class).invoke(null, this)).intValue()), 1778704619};
            Object objEZpvd34 = YY.EZpvd(777374025);
            if (objEZpvd34 == null) {
                byte b66 = $$a[17];
                byte b67 = (byte) (b66 - 4);
                Object[] objArr108 = new Object[1];
                b(b66, b67, (byte) (b67 | 49), objArr108);
                objEZpvd34 = YY.EZpvd(226, 4, (char) 0, 712311861, false, (String) objArr108[0], new Class[]{Integer.TYPE, Integer.TYPE});
            }
            objArr7 = (Object[]) ((Method) objEZpvd34).invoke(null, objArr107);
            Object objEZpvd35 = YY.EZpvd(193597850);
            if (objEZpvd35 == null) {
                byte b68 = $$a[17];
                byte b69 = (byte) (b68 - 4);
                Object[] objArr109 = new Object[1];
                b(b68, b69, (byte) (b69 | 49), objArr109);
                objEZpvd35 = YY.EZpvd(226, 4, (char) 0, 262855910, false, (String) objArr109[0], null);
            }
            ((Field) objEZpvd35).set(null, objArr7);
            try {
                Long lValueOf8 = Long.valueOf(((Long) Class.forName(str).getDeclaredMethod(str2, new Class[0]).invoke(null, new Object[0])).longValue());
                Object objEZpvd36 = YY.EZpvd(-1900789179);
                if (objEZpvd36 == null) {
                    byte[] bArr18 = $$a;
                    Object[] objArr110 = new Object[1];
                    b(bArr18[24], (byte) ($$b & 5), bArr18[14], objArr110);
                    objEZpvd36 = YY.EZpvd(226, 4, (char) 0, -1969975495, false, (String) objArr110[0], null);
                }
                ((Field) objEZpvd36).set(null, lValueOf8);
            } catch (Exception unused8) {
                throw new RuntimeException();
            }
        } else {
            Object objEZpvd37 = YY.EZpvd(193597850);
            if (objEZpvd37 == null) {
                byte b70 = $$a[17];
                byte b71 = (byte) (b70 - 4);
                Object[] objArr111 = new Object[1];
                b(b70, b71, (byte) (b71 | 49), objArr111);
                objEZpvd37 = YY.EZpvd(226, 4, (char) 0, 262855910, false, (String) objArr111[0], null);
            }
            Object[] objArr112 = (Object[]) ((Field) objEZpvd37).get(null);
            objArr7 = new Object[]{new int[1], new int[1], new int[1]};
            int i160 = ((int[]) objArr112[1])[0];
            int i161 = ((int[]) objArr112[0])[0];
            ((int[]) objArr7[1])[0] = i160;
            ((int[]) objArr7[0])[0] = i161;
            int iMyTid = Process.myTid();
            int i162 = ((~((~iMyTid) | (-34013217))) * 130) + 2065696795 + (((~(iMyTid | (-34013217))) | 16782661) * 130) + 1778704619;
            int i163 = (i162 << 13) ^ i162;
            int i164 = i163 ^ (i163 >>> 17);
            ((int[]) objArr7[2])[0] = i164 ^ (i164 << 5);
        }
        Object obj3 = objArr7[0];
        int i165 = ((int[]) obj3)[0];
        Object obj4 = objArr7[1];
        int i166 = ((int[]) obj4)[0];
        if (i166 == i165) {
            Object[] objArr113 = {new int[1], new int[1], new int[1]};
            int i167 = ((int[]) objArr7[2])[0];
            int i168 = ((int[]) obj4)[0];
            int i169 = ((int[]) obj3)[0];
            ((int[]) objArr113[1])[0] = i168;
            ((int[]) objArr113[0])[0] = i169;
            int iMyPid = Process.myPid();
            int i170 = i167 + 54002375 + (((~((-359025115) | iMyPid)) | 268831040) * (-140)) + ((~((-90194075) | iMyPid)) * 70) + (((~(iMyPid | 438251328)) | (-259614363)) * 70);
            int i171 = (i170 << 13) ^ i170;
            int i172 = i171 ^ (i171 >>> 17);
            ((int[]) objArr113[2])[0] = i172 ^ (i172 << 5);
        } else {
            Object[] objArr114 = {Long.valueOf(((long) (i165 ^ i166)) ^ (((long) (-570351551)) << 32)), Long.valueOf(-570349503)};
            int i173 = $$e;
            byte b72 = $$d[23];
            Object[] objArr115 = new Object[1];
            c((byte) (i173 + 2), b72, (short) (b72 | 143), objArr115);
            Class<?> cls15 = Class.forName((String) objArr115[0]);
            Object[] objArr116 = new Object[1];
            c((byte) (i173 | 12), r10[47], r10[3], objArr116);
            cls15.getMethod((String) objArr116[0], Long.TYPE, Long.TYPE).invoke(null, objArr114);
            Object[] objArr117 = {new int[1], new int[1], new int[1]};
            int i174 = ((int[]) objArr7[2])[0];
            int i175 = ((int[]) objArr7[1])[0];
            int i176 = ((int[]) objArr7[0])[0];
            ((int[]) objArr117[1])[0] = i175;
            ((int[]) objArr117[0])[0] = i176;
            int streamVolume3 = ((AudioManager) ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getSystemService(MimeTypes.BASE_TYPE_AUDIO)).getStreamVolume(3);
            int i177 = i174 + (-793042493) + (((~((-445009808) | streamVolume3)) | 436601989) * (-140)) + ((~((-8407819) | streamVolume3)) * 70) + (((~(streamVolume3 | 524236021)) | (-96041851)) * 70);
            int i178 = i177 ^ (i177 << 13);
            int i179 = i178 ^ (i178 >>> 17);
            ((int[]) objArr117[2])[0] = i179 ^ (i179 << 5);
        }
        Object objEZpvd38 = YY.EZpvd(1378450737);
        if (objEZpvd38 == null) {
            byte b73 = (byte) ($$a[13] + 1);
            byte b74 = (byte) (-b73);
            Object[] objArr118 = new Object[1];
            b(b73, b74, (byte) (b74 | 52), objArr118);
            objEZpvd38 = YY.EZpvd(CipherSuite.TLS_RSA_PSK_WITH_NULL_SHA256, 4, (char) 22195, 1443475533, false, (String) objArr118[0], null);
        }
        long j11 = ((Field) objEZpvd38).getLong(null);
        if (j11 != -1) {
            int i180 = dNCPSb + 55;
            aKErDB = i180 % 128;
            if (i180 % 2 != 0 ? j11 + 1955 < ((Long) Class.forName(str).getDeclaredMethod(str2, new Class[0]).invoke(null, new Object[0])).longValue() : j11 * 1955 < ((Long) Class.forName(str).getDeclaredMethod(str2, new Class[1]).invoke(null, new Object[1])).longValue()) {
                Context baseContext4 = getBaseContext();
                if (baseContext4 == null) {
                    Object[] objArr119 = new Object[1];
                    a(null, 127, null, new byte[]{-125, -127, -116, -124, -105, -106, -118, -117, -122, -107, -122, -117, -112, -108, -121, -110, -110, -127, -121, -125, -122, -123, -124, -125, -126, -127}, objArr119);
                    Class<?> cls16 = Class.forName((String) objArr119[0]);
                    Object[] objArr120 = new Object[1];
                    a(null, 127, null, new byte[]{-126, -123, -122, -117, -127, -112, -122, -113, -110, -110, -108, -117, -126, -116, -124, -124, -104, -112}, objArr120);
                    baseContext4 = (Context) cls16.getMethod((String) objArr120[0], new Class[0]).invoke(null, null);
                }
                if (baseContext4 != null) {
                    int i181 = aKErDB + 7;
                    dNCPSb = i181 % 128;
                    int i182 = i181 % 2;
                    baseContext4 = ((baseContext4 instanceof ContextWrapper) && ((ContextWrapper) baseContext4).getBaseContext() == null) ? null : baseContext4.getApplicationContext();
                }
                Object[] objArr121 = {baseContext4, Integer.valueOf(((Integer) Class.forName(str3).getMethod(str4, Object.class).invoke(null, this)).intValue()), 0, 1518340006};
                byte[] bArr19 = $$d;
                byte b75 = (byte) (bArr19[3] + 1);
                byte b76 = bArr19[23];
                Object[] objArr122 = new Object[1];
                c(b75, b76, (short) (b76 | 163), objArr122);
                Class<?> cls17 = Class.forName((String) objArr122[0]);
                Object[] objArr123 = new Object[1];
                c((byte) (bArr19[3] + 1), bArr19[40], (short) 92, objArr123);
                Object[] objArr124 = (Object[]) cls17.getMethod((String) objArr123[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr121);
                Object objEZpvd39 = YY.EZpvd(-813709103);
                if (objEZpvd39 == null) {
                    byte b77 = $$a[17];
                    byte b78 = (byte) (b77 - 4);
                    Object[] objArr125 = new Object[1];
                    b(b77, b78, (byte) (b78 | 49), objArr125);
                    objEZpvd39 = YY.EZpvd(CipherSuite.TLS_RSA_PSK_WITH_NULL_SHA256, 4, (char) 22195, -882965075, false, (String) objArr125[0], null);
                }
                ((Field) objEZpvd39).set(null, objArr124);
                try {
                    Long lValueOf9 = Long.valueOf(((Long) Class.forName(str).getDeclaredMethod(str2, new Class[0]).invoke(null, new Object[0])).longValue());
                    Object objEZpvd40 = YY.EZpvd(1378450737);
                    if (objEZpvd40 == null) {
                        byte b79 = (byte) ($$a[13] + 1);
                        byte b80 = (byte) (-b79);
                        Object[] objArr126 = new Object[1];
                        b(b79, b80, (byte) (b80 | 52), objArr126);
                        objEZpvd40 = YY.EZpvd(CipherSuite.TLS_RSA_PSK_WITH_NULL_SHA256, 4, (char) 22195, 1443475533, false, (String) objArr126[0], null);
                    }
                    ((Field) objEZpvd40).set(null, lValueOf9);
                    objArr8 = objArr124;
                } catch (Exception unused9) {
                    throw new RuntimeException();
                }
            } else {
                Object objEZpvd41 = YY.EZpvd(-813709103);
                if (objEZpvd41 == null) {
                    byte b81 = $$a[17];
                    byte b82 = (byte) (b81 - 4);
                    Object[] objArr127 = new Object[1];
                    b(b81, b82, (byte) (b82 | 49), objArr127);
                    objEZpvd41 = YY.EZpvd(CipherSuite.TLS_RSA_PSK_WITH_NULL_SHA256, 4, (char) 22195, -882965075, false, (String) objArr127[0], null);
                }
                Object[] objArr128 = (Object[]) ((Field) objEZpvd41).get(null);
                objArr8 = new Object[]{new int[1], (List) objArr128[1], new int[]{((int[]) objArr128[2])[0]}, new int[]{((int[]) objArr128[3])[0]}, (List) objArr128[4]};
                int iIdentityHashCode7 = System.identityHashCode(this);
                int i183 = (~((-1094465035) | iIdentityHashCode7)) | 5120;
                int i184 = ~iIdentityHashCode7;
                int i185 = (-195441029) + ((i183 | (~(1274869419 | i184))) * 886) + (((~(i184 | 1094465034)) | 180409505) * (-1772)) + ((~(i184 | 180409505)) * 886) + 1518340006;
                int i186 = (i185 << 13) ^ i185;
                int i187 = i186 ^ (i186 >>> 17);
                ((int[]) objArr8[0])[0] = i187 ^ (i187 << 5);
            }
        }
        int i188 = ((int[]) objArr8[3])[0];
        int i189 = ((int[]) objArr8[2])[0];
        if (i189 == i188) {
            int i190 = ((int[]) objArr8[0])[0];
            Object[] objArr129 = {new int[1], (List) objArr8[1], new int[]{((int[]) objArr8[2])[0]}, new int[]{((int[]) objArr8[3])[0]}, (List) objArr8[4]};
            int iMyUid = Process.myUid();
            int i191 = i190 + (-1596555816) + ((~((-154173441) | iMyUid)) * 623) + (((~iMyUid) | 46154275) * (-623)) + (((~(iMyUid | 583427687)) | (~((-691446853) | iMyUid)) | 154173440) * 623);
            int i192 = (i191 << 13) ^ i191;
            int i193 = i192 ^ (i192 >>> 17);
            ((int[]) objArr129[0])[0] = i193 ^ (i193 << 5);
            return;
        }
        ArrayList arrayList4 = new ArrayList();
        Object[] objArr130 = {objArr8};
        Object objEZpvd42 = YY.EZpvd(494303840);
        if (objEZpvd42 == null) {
            objEZpvd42 = YY.EZpvd(948, 5, (char) 0, 425113372, false, "KWHzl", new Class[]{Object[].class});
        }
        arrayList4.add(((Method) objEZpvd42).invoke(null, objArr130));
        Object[] objArr131 = {objArr8};
        Object objEZpvd43 = YY.EZpvd(-709912695);
        if (objEZpvd43 == null) {
            objEZpvd43 = YY.EZpvd(948, 5, (char) 0, -779134219, false, "AEQbTJ", new Class[]{Object[].class});
        }
        arrayList4.add(((Method) objEZpvd43).invoke(null, objArr131));
        Object[] objArr132 = {Long.valueOf((((long) (-118497495)) << 32) ^ ((long) (i188 ^ i189))), Long.valueOf(-118497503)};
        byte[] bArr20 = $$d;
        byte b83 = bArr20[23];
        byte b84 = bArr20[47];
        Object[] objArr133 = new Object[1];
        c(b83, b84, (short) (b84 | 161), objArr133);
        Class<?> cls18 = Class.forName((String) objArr133[0]);
        Object[] objArr134 = new Object[1];
        c(bArr20[3], (byte) (-bArr20[151]), bArr20[8], objArr134);
        cls18.getMethod((String) objArr134[0], Long.TYPE, Long.TYPE).invoke(null, objArr132);
        int i194 = ((int[]) objArr8[0])[0];
        Object[] objArr135 = {new int[1], (List) objArr8[1], new int[]{((int[]) objArr8[2])[0]}, new int[]{((int[]) objArr8[3])[0]}, (List) objArr8[4]};
        int streamVolume4 = ((AudioManager) ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getSystemService(MimeTypes.BASE_TYPE_AUDIO)).getStreamVolume(3);
        int i195 = i194 + 929543776 + ((~((~streamVolume4) | (-557859076))) * 433) + (((~((-448575737) | streamVolume4)) | (-826298804)) * (-433)) + (((~(streamVolume4 | (-826298804))) | (-1006434812)) * 433);
        int i196 = (i195 << 13) ^ i195;
        int i197 = i196 ^ (i196 >>> 17);
        ((int[]) objArr135[0])[0] = i197 ^ (i197 << 5);
    }

    @Override // o.AbstractActivityC33041mov
    public boolean getApplyNavigationBarInsets() {
        int i = 2 % 2;
        int i2 = aKErDB;
        int i3 = i2 + 13;
        dNCPSb = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 97;
        dNCPSb = i5 % 128;
        if (i5 % 2 == 0) {
            return false;
        }
        throw null;
    }

    public static final void RJOkX(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = aKErDB + 69;
        dNCPSb = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = dNCPSb + 101;
        aKErDB = i4 % 128;
        int i5 = i4 % 2;
    }

    public static final void QbewEr(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = dNCPSb + 101;
        aKErDB = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = aKErDB + 5;
        dNCPSb = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public static final Unit copydefault(DefiWalletMainActivity defiWalletMainActivity, Bundle bundle, AbstractC12782ctV abstractC12782ctV) {
        int i = 2 % 2;
        int i2 = dNCPSb + 121;
        aKErDB = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.copydefault(abstractC12782ctV);
            defiWalletMainActivity.AEQbTJ(abstractC12782ctV, bundle);
            int i3 = 54 / 0;
            return Unit.INSTANCE;
        }
        Intrinsics.copydefault(abstractC12782ctV);
        defiWalletMainActivity.AEQbTJ(abstractC12782ctV, bundle);
        return Unit.INSTANCE;
    }

    private static /* synthetic */ Object iZzfmt(Object[] objArr) {
        int i = 2 % 2;
        int i2 = dNCPSb + 17;
        aKErDB = i2 % 128;
        if (i2 % 2 == 0) {
            Unit unit = Unit.INSTANCE;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unit2 = Unit.INSTANCE;
        int i3 = aKErDB + 93;
        dNCPSb = i3 % 128;
        int i4 = i3 % 2;
        return unit2;
    }

    private static /* synthetic */ Object ejfBZ(Object[] objArr) {
        final DefiWalletMainActivity defiWalletMainActivity = (DefiWalletMainActivity) objArr[0];
        final Bundle bundle = (Bundle) objArr[1];
        int i = 2 % 2;
        defiWalletMainActivity.KWHzl(C18158fdC.Companion.OLrzqt());
        AbstractC58260yxt<AbstractC12782ctV> abstractC58260yxtCopydefault = C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null).copydefault(false);
        final Function1 function1 = new Function1() { // from class: o.dWa
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return DefiWalletMainActivity.AEQbTJ(this.KWHzl, bundle, (AbstractC12782ctV) obj);
            }
        };
        InterfaceC58227yxM<? super AbstractC12782ctV> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.dWb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                DefiWalletMainActivity.AYXKKw(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.dWd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return DefiWalletMainActivity.KWHzl((java.lang.Throwable) obj);
            }
        };
        defiWalletMainActivity.addDisposable(abstractC58260yxtCopydefault.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.dWf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) throws java.lang.Throwable {
                java.lang.Object[] objArr2 = {function12, obj};
                DefiWalletMainActivity.copydefault(zzep.AEQbTJ(), -1566173484, 1566173505, objArr2, zzep.AEQbTJ(), zzep.AEQbTJ(), zzep.AEQbTJ());
            }
        }));
        Unit unit = Unit.INSTANCE;
        int i2 = dNCPSb + 115;
        aKErDB = i2 % 128;
        int i3 = i2 % 2;
        return unit;
    }

    public static final void QUSxYX(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = dNCPSb + 47;
        aKErDB = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        if (i3 == 0) {
            int i4 = 70 / 0;
        }
    }

    public static final Unit EZpvd(DefiWalletMainActivity defiWalletMainActivity, Bundle bundle, AbstractC12782ctV abstractC12782ctV) {
        Unit unit;
        int i = 2 % 2;
        int i2 = aKErDB + 9;
        dNCPSb = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.copydefault(abstractC12782ctV);
            defiWalletMainActivity.OLrzqt(abstractC12782ctV, bundle);
            unit = Unit.INSTANCE;
            int i3 = 98 / 0;
        } else {
            Intrinsics.copydefault(abstractC12782ctV);
            defiWalletMainActivity.OLrzqt(abstractC12782ctV, bundle);
            unit = Unit.INSTANCE;
        }
        int i4 = dNCPSb + 27;
        aKErDB = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    public static final void QfsBiF(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = dNCPSb + 83;
        aKErDB = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        if (i3 == 0) {
            int i4 = 41 / 0;
        }
        int i5 = dNCPSb + 67;
        aKErDB = i5 % 128;
        int i6 = i5 % 2;
    }

    public static final Unit values(Throwable th) {
        int i = 2 % 2;
        int i2 = aKErDB + 45;
        dNCPSb = i2 % 128;
        if (i2 % 2 != 0) {
            Unit unit = Unit.INSTANCE;
            throw null;
        }
        Unit unit2 = Unit.INSTANCE;
        int i3 = aKErDB + 121;
        dNCPSb = i3 % 128;
        int i4 = i3 % 2;
        return unit2;
    }

    public static final Unit OLrzqt(final DefiWalletMainActivity defiWalletMainActivity, final Bundle bundle) {
        int i = 2 % 2;
        defiWalletMainActivity.KWHzl(C18158fdC.Companion.OLrzqt());
        AbstractC58260yxt<AbstractC12782ctV> abstractC58260yxtCopydefault = C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null).copydefault(false);
        final Function1 function1 = new Function1() { // from class: o.dUc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return DefiWalletMainActivity.KWHzl(this.OLrzqt, bundle, (AbstractC12782ctV) obj);
            }
        };
        InterfaceC58227yxM<? super AbstractC12782ctV> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.dUb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                DefiWalletMainActivity.fIwbmz(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.dUe
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return DefiWalletMainActivity.copydefault((java.lang.Throwable) obj);
            }
        };
        defiWalletMainActivity.addDisposable(abstractC58260yxtCopydefault.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.dUh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                DefiWalletMainActivity.gHZMYf(function12, obj);
            }
        }));
        Unit unit = Unit.INSTANCE;
        int i2 = dNCPSb + 17;
        aKErDB = i2 % 128;
        if (i2 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    public static final void QVAiDq(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = dNCPSb + 33;
        aKErDB = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        if (i3 == 0) {
            int i4 = 14 / 0;
        }
    }

    public static final Unit AYXKKw(DefiWalletMainActivity defiWalletMainActivity, Bundle bundle, AbstractC12782ctV abstractC12782ctV) {
        int i = 2 % 2;
        int i2 = aKErDB + 23;
        dNCPSb = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.copydefault(abstractC12782ctV);
        defiWalletMainActivity.copydefault(abstractC12782ctV, bundle);
        Unit unit = Unit.INSTANCE;
        int i4 = dNCPSb + 29;
        aKErDB = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static final Unit AkhnZx(Throwable th) {
        int i = 2 % 2;
        int i2 = dNCPSb + 63;
        aKErDB = i2 % 128;
        if (i2 % 2 == 0) {
            Unit unit = Unit.INSTANCE;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unit2 = Unit.INSTANCE;
        int i3 = aKErDB + 77;
        dNCPSb = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 69 / 0;
        }
        return unit2;
    }

    public static final void djSkpj(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = dNCPSb + 63;
        aKErDB = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        if (i3 != 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public static final Unit AYXKKw(final DefiWalletMainActivity defiWalletMainActivity, final Bundle bundle) {
        int i = 2 % 2;
        defiWalletMainActivity.KWHzl(C18158fdC.Companion.OLrzqt());
        AbstractC58260yxt<AbstractC12782ctV> abstractC58260yxtCopydefault = C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null).copydefault(false);
        final Function1 function1 = new Function1() { // from class: o.dUX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return DefiWalletMainActivity.OLrzqt(this.OLrzqt, bundle, (AbstractC12782ctV) obj);
            }
        };
        InterfaceC58227yxM<? super AbstractC12782ctV> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.dUW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                DefiWalletMainActivity.DTwDnp(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.dUV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return DefiWalletMainActivity.DbNXlk((java.lang.Throwable) obj);
            }
        };
        defiWalletMainActivity.addDisposable(abstractC58260yxtCopydefault.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.dUU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) throws java.lang.Throwable {
                java.lang.Object[] objArr = {function12, obj};
                DefiWalletMainActivity.copydefault(zzep.AEQbTJ(), -318552598, 318552638, objArr, zzep.AEQbTJ(), zzep.AEQbTJ(), zzep.AEQbTJ());
            }
        }));
        Unit unit = Unit.INSTANCE;
        int i2 = aKErDB + 79;
        dNCPSb = i2 % 128;
        int i3 = i2 % 2;
        return unit;
    }

    private static /* synthetic */ Object AuCTel(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        Object obj = objArr[1];
        int i = 2 % 2;
        int i2 = aKErDB + 73;
        dNCPSb = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        if (i3 != 0) {
            throw null;
        }
        int i4 = dNCPSb + 87;
        aKErDB = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    public static final void RcXXUw(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = dNCPSb + 21;
        aKErDB = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        if (i3 == 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        int i4 = aKErDB + 119;
        dNCPSb = i4 % 128;
        int i5 = i4 % 2;
    }

    public static final Unit dNCPSb(final DefiWalletMainActivity defiWalletMainActivity) {
        dTQ dtq;
        int i = 2 % 2;
        try {
            dtq = (dTQ) C43251rlk.OLrzqt(dTQ.class);
        } catch (Exception e) {
            pUU.copydefault(defiWalletMainActivity.getTAG(), "error message = " + e.getMessage());
            int i2 = aKErDB + 89;
            dNCPSb = i2 % 128;
            int i3 = i2 % 2;
        }
        if (dtq == null || !dtq.copydefault()) {
            return Unit.INSTANCE;
        }
        AbstractC58260yxt<AbstractC12782ctV> abstractC58260yxtCopydefault = C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null).copydefault(false);
        final Function1 function1 = new Function1() { // from class: o.dUA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return DefiWalletMainActivity.copydefault(this.KWHzl, (AbstractC12782ctV) obj);
            }
        };
        InterfaceC58227yxM<? super AbstractC12782ctV> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.dUG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) throws java.lang.Throwable {
                DefiWalletMainActivity.uzCIH(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.dUI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                java.lang.Object[] objArr = {this.EZpvd, (java.lang.Throwable) obj};
                return (Unit) DefiWalletMainActivity.copydefault(zzep.AEQbTJ(), 77214420, -77214389, objArr, zzep.AEQbTJ(), zzep.AEQbTJ(), zzep.AEQbTJ());
            }
        };
        InterfaceC58217yxC interfaceC58217yxCAEQbTJ = abstractC58260yxtCopydefault.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.dUH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                DefiWalletMainActivity.zuBGHE(function12, obj);
            }
        });
        defiWalletMainActivity.addDisposable(interfaceC58217yxCAEQbTJ);
        Intrinsics.copydefault(interfaceC58217yxCAEQbTJ);
        Unit unit = Unit.INSTANCE;
        int i4 = aKErDB + 99;
        dNCPSb = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 81 / 0;
        }
        return unit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0033 A[PHI: r4
  0x0033: PHI (r4v4 java.util.List) = (r4v3 java.util.List), (r4v10 java.util.List) binds: [B:8:0x0031, B:5:0x0021] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Unit DbNXlk(DefiWalletMainActivity defiWalletMainActivity, AbstractC12782ctV abstractC12782ctV) {
        List listKWHzl;
        int i = 2 % 2;
        int i2 = dNCPSb + 17;
        aKErDB = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
            listKWHzl = C43251rlk.KWHzl(C56524yIo.AEQbTJ(InterfaceC9773bbs.class));
            int i3 = 86 / 0;
            if (listKWHzl != null) {
                InterfaceC9773bbs interfaceC9773bbs = (InterfaceC9773bbs) CollectionsKt___CollectionsKt.firstOrNull(listKWHzl);
                if (interfaceC9773bbs != null) {
                    interfaceC9773bbs.OLrzqt(defiWalletMainActivity, new LinkedHashMap());
                    return Unit.INSTANCE;
                }
                int i4 = dNCPSb + 25;
                aKErDB = i4 % 128;
                int i5 = i4 % 2;
            }
        } else {
            Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
            listKWHzl = C43251rlk.KWHzl(C56524yIo.AEQbTJ(InterfaceC9773bbs.class));
            if (listKWHzl != null) {
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit RcXXUw(final DefiWalletMainActivity defiWalletMainActivity) {
        int i = 2 % 2;
        defiWalletMainActivity.addDisposable(C11607cUn.subscribeOnIO$default(C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null).copydefault(false), (Function1) null, new Function1() { // from class: o.dUs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return DefiWalletMainActivity.djBIcL(this.copydefault, (AbstractC12782ctV) obj);
            }
        }, 1, (Object) null));
        Unit unit = Unit.INSTANCE;
        int i2 = dNCPSb + 55;
        aKErDB = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 97 / 0;
        }
        return unit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final List UeEOUB(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = aKErDB + 17;
        dNCPSb = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(obj, "");
            throw null;
        }
        Intrinsics.checkNotNullParameter(obj, "");
        List list = (List) function1.invoke(obj);
        int i3 = aKErDB + 51;
        dNCPSb = i3 % 128;
        int i4 = i3 % 2;
        return list;
    }

    public static final void dNCPSb(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = aKErDB + 117;
        dNCPSb = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = aKErDB + 91;
        dNCPSb = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public static final Unit AuCTel(Throwable th) {
        int i = 2 % 2;
        int i2 = aKErDB + 75;
        dNCPSb = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = Unit.INSTANCE;
        if (i3 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final Unit EZpvd(DefiWalletMainActivity defiWalletMainActivity, List list) {
        int i = 2 % 2;
        int i2 = aKErDB + 13;
        dNCPSb = i2 % 128;
        if (i2 % 2 == 0) {
            if (!(!list.isEmpty())) {
                C15714eSo.TaskDescription.step$default(C15714eSo.Companion, defiWalletMainActivity, null, 0, false, false, 30, null);
                int i3 = aKErDB + 117;
                dNCPSb = i3 % 128;
                int i4 = i3 % 2;
            } else {
                Intrinsics.copydefault(list);
                ActivityC18321fgG.StateListAnimator.startActivity$default(ActivityC18321fgG.Companion, defiWalletMainActivity, ((AbstractC12782ctV) CollectionsKt___CollectionsKt.AuCTelauCTel(list)).DbNXlk(), false, 4, null);
            }
            defiWalletMainActivity.dismissLoading();
            return Unit.INSTANCE;
        }
        list.isEmpty();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final void fFgQHt(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = aKErDB + 11;
        dNCPSb = i2 % 128;
        int i3 = i2 % 2;
        Object obj2 = null;
        function1.invoke(obj);
        if (i3 != 0) {
            obj2.hashCode();
            throw null;
        }
        int i4 = dNCPSb + 109;
        aKErDB = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        obj2.hashCode();
        throw null;
    }

    public static final Unit UeEOUB(final DefiWalletMainActivity defiWalletMainActivity) {
        int i = 2 % 2;
        AbstractC58260yxt abstractC58260yxtFetchAllWallets$default = C12827cuN.fetchAllWallets$default(C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null), false, false, false, 7, null);
        final Function1 function1 = new Function1() { // from class: o.dUF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return (java.util.List) DefiWalletMainActivity.copydefault(zzep.AEQbTJ(), -939740179, 939740253, new java.lang.Object[]{(java.util.List) obj}, zzep.AEQbTJ(), zzep.AEQbTJ(), zzep.AEQbTJ());
            }
        };
        AbstractC58260yxt abstractC58260yxtCopydefault = abstractC58260yxtFetchAllWallets$default.copydefault(new InterfaceC58229yxO() { // from class: o.dUJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return DefiWalletMainActivity.AEQbTJ(function1, obj);
            }
        });
        final Function1 function12 = new Function1() { // from class: o.dUO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return DefiWalletMainActivity.AEQbTJ(this.copydefault, (java.util.List) obj);
            }
        };
        InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.dUK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                DefiWalletMainActivity.values(function12, obj);
            }
        };
        final Function1 function13 = new Function1() { // from class: o.dUN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return DefiWalletMainActivity.AEQbTJ((java.lang.Throwable) obj);
            }
        };
        defiWalletMainActivity.addDisposable(abstractC58260yxtCopydefault.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.dUL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                DefiWalletMainActivity.DbNXlk(function13, obj);
            }
        }));
        Unit unit = Unit.INSTANCE;
        int i2 = aKErDB + 53;
        dNCPSb = i2 % 128;
        int i3 = i2 % 2;
        return unit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final InterfaceC58261yxu fZBcTu(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = dNCPSb + 125;
        aKErDB = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(obj, "");
        InterfaceC58261yxu interfaceC58261yxu = (InterfaceC58261yxu) function1.invoke(obj);
        int i4 = aKErDB + 81;
        dNCPSb = i4 % 128;
        int i5 = i4 % 2;
        return interfaceC58261yxu;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final InterfaceC58261yxu KWHzl(final String str, AbstractC12782ctV abstractC12782ctV) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
        Object obj = null;
        AbstractC58260yxt<Integer> abstractC58260yxtCopydefault = C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null).copydefault(abstractC12782ctV.DbNXlk());
        final Function1 function1 = new Function1() { // from class: o.dWO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj2) {
                return DefiWalletMainActivity.AEQbTJ(str, (java.lang.Integer) obj2);
            }
        };
        InterfaceC58261yxu interfaceC58261yxuCopydefault = abstractC58260yxtCopydefault.copydefault(new InterfaceC58229yxO() { // from class: o.dWL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj2) {
                return DefiWalletMainActivity.gEmmrt(function1, obj2);
            }
        });
        int i2 = dNCPSb + 95;
        aKErDB = i2 % 128;
        if (i2 % 2 != 0) {
            return interfaceC58261yxuCopydefault;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static /* synthetic */ Object RJOkX(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        Object obj = objArr[1];
        int i = 2 % 2;
        int i2 = aKErDB + 41;
        dNCPSb = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(obj, "");
        String str = (String) function1.invoke(obj);
        int i4 = aKErDB + 57;
        dNCPSb = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 28 / 0;
        }
        return str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final Unit copydefault(String str, DefiWalletMainActivity defiWalletMainActivity, String str2, Throwable th) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(th, "");
        if (C33129mqd.OLrzqt((CharSequence) str)) {
            int i2 = dNCPSb + 49;
            aKErDB = i2 % 128;
            int i3 = i2 % 2;
            C14320djI.openHistoryWebPageWithShare$default(C14320djI.OLrzqt, defiWalletMainActivity, str, str2, null, 8, null);
            int i4 = aKErDB + 55;
            dNCPSb = i4 % 128;
            int i5 = i4 % 2;
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [2197=5] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0086  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Unit EZpvd(String str, String str2, String str3, long j, String str4, DefiWalletMainActivity defiWalletMainActivity, String str5, String str6, String str7, String str8, String str9) {
        String str10;
        String str11;
        int i = 2 % 2;
        int i2 = dNCPSb + 53;
        aKErDB = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        if (str9 == null || str9.length() == 0) {
            if (C33129mqd.OLrzqt((CharSequence) str4)) {
                C14320djI.openHistoryWebPageWithShare$default(C14320djI.OLrzqt, defiWalletMainActivity, str4, str2, null, 8, null);
            }
        } else if (str.length() == 0) {
            int i3 = aKErDB + 41;
            dNCPSb = i3 % 128;
            if (i3 % 2 != 0) {
                str2.length();
                throw null;
            }
            if (str2.length() != 0) {
                if (str3.length() != 0 && !C33129mqd.gEmmrt(Long.valueOf(j), 0)) {
                    ActivityC10049bhC.ActionBar actionBar = ActivityC10049bhC.Companion;
                    if (str5 == null) {
                        int i4 = aKErDB + 105;
                        dNCPSb = i4 % 128;
                        int i5 = i4 % 2;
                        str10 = "";
                    } else {
                        str10 = str5;
                    }
                    if (str6 == null) {
                        int i6 = dNCPSb + 107;
                        aKErDB = i6 % 128;
                        int i7 = i6 % 2;
                        str11 = "";
                    } else {
                        str11 = str6;
                    }
                    actionBar.KWHzl(defiWalletMainActivity, str, str2, str10, str3, str8, str11, j, str7 == null ? "" : str7, true, str4);
                }
            }
        }
        Unit unit = Unit.INSTANCE;
        int i8 = aKErDB + 71;
        dNCPSb = i8 % 128;
        int i9 = i8 % 2;
        return unit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [2197=6] */
    public static final void EZpvd(Bundle bundle, final String str, final DefiWalletMainActivity defiWalletMainActivity) {
        long jValueOf;
        final String strGEmmrt;
        String strGEmmrt2;
        int i = 2 % 2;
        int i2 = aKErDB + 65;
        dNCPSb = i2 % 128;
        int i3 = i2 % 2;
        String strGEmmrt3 = C33129mqd.gEmmrt(bundle.get("coinId"));
        if (strGEmmrt3.length() == 0) {
            jValueOf = -1;
        } else {
            jValueOf = C33129mqd.valueOf(strGEmmrt3);
            int i4 = dNCPSb + 75;
            aKErDB = i4 % 128;
            int i5 = i4 % 2;
        }
        final long j = jValueOf;
        int i6 = dNCPSb + 63;
        int i7 = i6 % 128;
        aKErDB = i7;
        int i8 = i6 % 2;
        int i9 = i7 + 85;
        dNCPSb = i9 % 128;
        int i10 = i9 % 2;
        Object obj = bundle.get("txId");
        String strGEmmrt4 = obj != null ? C33129mqd.gEmmrt(obj) : null;
        if (strGEmmrt4 == null) {
            strGEmmrt4 = "";
        }
        Object obj2 = bundle.get("txHash");
        if (obj2 != null) {
            int i11 = dNCPSb + 1;
            aKErDB = i11 % 128;
            int i12 = i11 % 2;
            strGEmmrt = C33129mqd.gEmmrt(obj2);
        } else {
            strGEmmrt = null;
        }
        if (strGEmmrt == null) {
            strGEmmrt = "";
        }
        final String string = bundle.getString("uOpHash");
        Object obj3 = bundle.get(WalletSearchRequest.SEARCH_SOURCE_ADDRESS);
        String strGEmmrt5 = obj3 != null ? C33129mqd.gEmmrt(obj3) : null;
        if (strGEmmrt5 == null) {
            int i13 = aKErDB;
            int i14 = i13 + 11;
            dNCPSb = i14 % 128;
            int i15 = i14 % 2;
            int i16 = i13 + 61;
            dNCPSb = i16 % 128;
            int i17 = i16 % 2;
            strGEmmrt5 = "";
        }
        Object obj4 = bundle.get("explorerUrl");
        if (obj4 != null) {
            int i18 = aKErDB + 81;
            dNCPSb = i18 % 128;
            int i19 = i18 % 2;
            strGEmmrt2 = C33129mqd.gEmmrt(obj4);
        } else {
            strGEmmrt2 = null;
        }
        final String str2 = strGEmmrt2 == null ? "" : strGEmmrt2;
        final String string2 = bundle.getString("orderId");
        final String string3 = bundle.getString("orderType");
        AbstractC58260yxt<AbstractC12782ctV> abstractC58260yxtOLrzqt = C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null).OLrzqt(str, false);
        final Function1 function1 = new Function1() { // from class: o.dUQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj5) {
                java.lang.Object[] objArr = {str, (AbstractC12782ctV) obj5};
                return (InterfaceC58261yxu) DefiWalletMainActivity.copydefault(zzep.AEQbTJ(), 1622118346, -1622118270, objArr, zzep.AEQbTJ(), zzep.AEQbTJ(), zzep.AEQbTJ());
            }
        };
        AbstractC58260yxt<R> abstractC58260yxtOLrzqt2 = abstractC58260yxtOLrzqt.OLrzqt(new InterfaceC58229yxO() { // from class: o.dUT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj5) {
                return DefiWalletMainActivity.djBIcL(function1, obj5);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtOLrzqt2, "");
        final String str3 = strGEmmrt4;
        final String str4 = strGEmmrt;
        final String str5 = strGEmmrt5;
        final String str6 = str2;
        defiWalletMainActivity.addDisposable(C11607cUn.OLrzqt(abstractC58260yxtOLrzqt2, (Function1<? super Throwable, Unit>) new Function1() { // from class: o.dUP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj5) {
                java.lang.Object[] objArr = {str2, defiWalletMainActivity, strGEmmrt, (java.lang.Throwable) obj5};
                return (Unit) DefiWalletMainActivity.copydefault(zzep.AEQbTJ(), 1846509663, -1846509605, objArr, zzep.AEQbTJ(), zzep.AEQbTJ(), zzep.AEQbTJ());
            }
        }, new Function1() { // from class: o.dUS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj5) {
                return DefiWalletMainActivity.KWHzl(str3, str4, str5, j, str6, defiWalletMainActivity, string, string2, string3, str, (java.lang.String) obj5);
            }
        }));
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.eEY.StateListAnimator.startActivity$default(o.eEY$StateListAnimator, android.content.Context, int, java.lang.String, int, java.lang.Object):void */
    public static final Unit djSkpj(DefiWalletMainActivity defiWalletMainActivity) {
        int i = 2 % 2;
        int i2 = aKErDB + 45;
        dNCPSb = i2 % 128;
        int i3 = i2 % 2;
        eEY.StateListAnimator.startActivity$default(eEY.Companion, defiWalletMainActivity, 0, "from_import", 2, null);
        Unit unit = Unit.INSTANCE;
        int i4 = aKErDB + 59;
        dNCPSb = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final Unit aKErDB(DefiWalletMainActivity defiWalletMainActivity) {
        int i = 2 % 2;
        int i2 = dNCPSb + 59;
        aKErDB = i2 % 128;
        int i3 = i2 % 2;
        eCS.Companion.EZpvd(defiWalletMainActivity, 1);
        return Unit.INSTANCE;
    }

    public static final Unit fFgQHt(DefiWalletMainActivity defiWalletMainActivity) {
        int i = 2 % 2;
        int i2 = dNCPSb + 21;
        aKErDB = i2 % 128;
        int i3 = i2 % 2;
        eGQ.Companion.copydefault(defiWalletMainActivity, 1);
        Unit unit = Unit.INSTANCE;
        int i4 = dNCPSb + 79;
        aKErDB = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final Unit fZBcTu(DefiWalletMainActivity defiWalletMainActivity) {
        int i = 2 % 2;
        int i2 = dNCPSb + 29;
        aKErDB = i2 % 128;
        int i3 = i2 % 2;
        ActivityC17352fCd.StateListAnimator.startActivity$default(ActivityC17352fCd.Companion, defiWalletMainActivity, false, 2, null);
        Unit unit = Unit.INSTANCE;
        int i4 = dNCPSb + 57;
        aKErDB = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    public static final void finit(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = aKErDB + 95;
        dNCPSb = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = aKErDB + 99;
        dNCPSb = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 21 / 0;
        }
    }

    public static final Unit ejfBZ(Throwable th) {
        Unit unit;
        int i = 2 % 2;
        int i2 = dNCPSb + 79;
        aKErDB = i2 % 128;
        if (i2 % 2 == 0) {
            unit = Unit.INSTANCE;
            int i3 = 61 / 0;
        } else {
            unit = Unit.INSTANCE;
        }
        int i4 = aKErDB + 79;
        dNCPSb = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 45 / 0;
        }
        return unit;
    }

    public static final Unit fetchVPNInfo(DefiWalletMainActivity defiWalletMainActivity, AbstractC12782ctV abstractC12782ctV) {
        int i = 2 % 2;
        int i2 = dNCPSb + 81;
        aKErDB = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        C32866mlf.onEvent$default("Web3WalletHomepage_More_Multisender_Click", (TrackChannel[]) null, (Function1) null, 3, (Object) null);
        defiWalletMainActivity.startActivity(ViewOnClickListenerC20941gqQ.Companion.OLrzqt(defiWalletMainActivity, abstractC12782ctV.DbNXlk()));
        Unit unit = Unit.INSTANCE;
        int i4 = dNCPSb + 89;
        aKErDB = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object hUfVAv(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        Object obj = objArr[1];
        int i = 2 % 2;
        int i2 = aKErDB + 49;
        dNCPSb = i2 % 128;
        int i3 = i2 % 2;
        Object obj2 = null;
        function1.invoke(obj);
        if (i3 == 0) {
            return null;
        }
        obj2.hashCode();
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final Unit EZpvd(String str, String str2, EventParamsList eventParamsList) {
        int i = 2 % 2;
        int i2 = aKErDB + 13;
        dNCPSb = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        Intrinsics.copydefault((Object) str);
        EventParamsList.put$default(eventParamsList, "from_channel_id", str, false, 4, null);
        eventParamsList.put("from_module", str2, true);
        eventParamsList.put("to_module", Scopes.PROFILE, true);
        Unit unit = Unit.INSTANCE;
        int i4 = aKErDB + 25;
        dNCPSb = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static final void gasjUx(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = aKErDB + 69;
        dNCPSb = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        if (i3 == 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    private static /* synthetic */ Object AubY(Object[] objArr) {
        int i = 2 % 2;
        int i2 = dNCPSb + 87;
        aKErDB = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = Unit.INSTANCE;
        if (i3 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final void giSNqX(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = aKErDB + 91;
        dNCPSb = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = aKErDB + 67;
        dNCPSb = i4 % 128;
        int i5 = i4 % 2;
    }

    public static final Unit isConnected(DefiWalletMainActivity defiWalletMainActivity, AbstractC12782ctV abstractC12782ctV) {
        Unit unit;
        int i = 2 % 2;
        int i2 = dNCPSb + 29;
        aKErDB = i2 % 128;
        if (i2 % 2 == 0) {
            ActivityC15218eAe.Companion.copydefault(defiWalletMainActivity, abstractC12782ctV.DbNXlk());
            unit = Unit.INSTANCE;
            int i3 = 6 / 0;
        } else {
            ActivityC15218eAe.Companion.copydefault(defiWalletMainActivity, abstractC12782ctV.DbNXlk());
            unit = Unit.INSTANCE;
        }
        int i4 = dNCPSb + 57;
        aKErDB = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static final Unit finit(final DefiWalletMainActivity defiWalletMainActivity) {
        int i = 2 % 2;
        defiWalletMainActivity.KWHzl(C18158fdC.Companion.OLrzqt());
        AbstractC58260yxt<AbstractC12782ctV> abstractC58260yxtCopydefault = C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null).copydefault(false);
        final Function1 function1 = new Function1() { // from class: o.dTW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                java.lang.Object[] objArr = {this.KWHzl, (AbstractC12782ctV) obj};
                return (Unit) DefiWalletMainActivity.copydefault(zzep.AEQbTJ(), 730684577, -730684544, objArr, zzep.AEQbTJ(), zzep.AEQbTJ(), zzep.AEQbTJ());
            }
        };
        InterfaceC58227yxM<? super AbstractC12782ctV> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.dTX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                DefiWalletMainActivity.fJNWhG(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.dUd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return DefiWalletMainActivity.OLrzqt((java.lang.Throwable) obj);
            }
        };
        defiWalletMainActivity.addDisposable(abstractC58260yxtCopydefault.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.dUf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) throws java.lang.Throwable {
                java.lang.Object[] objArr = {function12, obj};
                DefiWalletMainActivity.copydefault(zzep.AEQbTJ(), 996356627, -996356624, objArr, zzep.AEQbTJ(), zzep.AEQbTJ(), zzep.AEQbTJ());
            }
        }));
        Unit unit = Unit.INSTANCE;
        int i2 = aKErDB + 1;
        dNCPSb = i2 % 128;
        if (i2 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    public static final Unit dxcTrN(final DefiWalletMainActivity defiWalletMainActivity) {
        int i = 2 % 2;
        defiWalletMainActivity.KWHzl(C18158fdC.Companion.OLrzqt());
        C16158eee c16158eee = C16158eee.KWHzl;
        androidx.fragment.app.FragmentManager supportFragmentManager = defiWalletMainActivity.getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
        c16158eee.copydefault(supportFragmentManager, new Function0() { // from class: o.dUk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return DefiWalletMainActivity.getNewProxyInstance(this.KWHzl);
            }
        });
        Unit unit = Unit.INSTANCE;
        int i2 = dNCPSb + WalletImportError.ERROR_CODE_GET_EOA_ADDRESS_KEY;
        aKErDB = i2 % 128;
        int i3 = i2 % 2;
        return unit;
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.fjK.StateListAnimator.startActivity$default(o.fjK$StateListAnimator, android.content.Context, int, java.lang.String, int, java.lang.Object):void */
    public static final Unit gasjUx(DefiWalletMainActivity defiWalletMainActivity) {
        int i = 2 % 2;
        int i2 = dNCPSb + 53;
        aKErDB = i2 % 128;
        int i3 = i2 % 2;
        defiWalletMainActivity.KWHzl(C18158fdC.Companion.OLrzqt());
        ActivityC18484fjK.StateListAnimator.startActivity$default(ActivityC18484fjK.Companion, defiWalletMainActivity, 3, null, 4, null);
        Unit unit = Unit.INSTANCE;
        int i4 = aKErDB + 121;
        dNCPSb = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static final void fvQaOB(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = aKErDB + 95;
        dNCPSb = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = aKErDB + 51;
        dNCPSb = i4 % 128;
        int i5 = i4 % 2;
    }

    public static final Unit AuCTel(DefiWalletMainActivity defiWalletMainActivity, AbstractC12782ctV abstractC12782ctV) {
        int i = 2 % 2;
        int i2 = dNCPSb + 71;
        aKErDB = i2 % 128;
        int i3 = i2 % 2;
        eAZ.StateListAnimator stateListAnimator = eAZ.Companion;
        AbstractC12784ctX abstractC12784ctXGwTjWJ = abstractC12782ctV.gwTjWJ();
        if (abstractC12784ctXGwTjWJ != null) {
            int i4 = dNCPSb + 53;
            aKErDB = i4 % 128;
            if (i4 % 2 == 0) {
                abstractC12784ctXGwTjWJ.EZpvd();
                throw null;
            }
            String strEZpvd = abstractC12784ctXGwTjWJ.EZpvd();
            if (strEZpvd != null) {
                stateListAnimator.copydefault(defiWalletMainActivity, strEZpvd);
                return Unit.INSTANCE;
            }
            int i5 = dNCPSb + 83;
            aKErDB = i5 % 128;
            int i6 = i5 % 2;
        }
        return Unit.INSTANCE;
    }

    private static /* synthetic */ Object aKErDB(Object[] objArr) {
        int i = 2 % 2;
        int i2 = dNCPSb + 67;
        aKErDB = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = Unit.INSTANCE;
        if (i3 != 0) {
            return unit;
        }
        throw null;
    }

    public static final void gGvvIC(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = dNCPSb + 121;
        aKErDB = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        if (i3 == 0) {
            throw null;
        }
        int i4 = aKErDB + WalletImportError.ERROR_CODE_GET_EOA_ADDRESS_KEY;
        dNCPSb = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public static final Unit fvQaOB(final DefiWalletMainActivity defiWalletMainActivity) {
        int i = 2 % 2;
        defiWalletMainActivity.KWHzl(C18158fdC.Companion.OLrzqt());
        AbstractC58260yxt<AbstractC12782ctV> abstractC58260yxtCopydefault = C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null).copydefault(false);
        final Function1 function1 = new Function1() { // from class: o.dWS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return DefiWalletMainActivity.AEQbTJ(this.EZpvd, (AbstractC12782ctV) obj);
            }
        };
        InterfaceC58227yxM<? super AbstractC12782ctV> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.dWU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) throws java.lang.Throwable {
                java.lang.Object[] objArr = {function1, obj};
                DefiWalletMainActivity.copydefault(zzep.AEQbTJ(), -923388812, 923388824, objArr, zzep.AEQbTJ(), zzep.AEQbTJ(), zzep.AEQbTJ());
            }
        };
        final Function1 function12 = new Function1() { // from class: o.dWR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return DefiWalletMainActivity.valueOf((java.lang.Throwable) obj);
            }
        };
        defiWalletMainActivity.addDisposable(abstractC58260yxtCopydefault.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.dUa
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) throws java.lang.Throwable {
                java.lang.Object[] objArr = {function12, obj};
                DefiWalletMainActivity.copydefault(zzep.AEQbTJ(), 1822883330, -1822883262, objArr, zzep.AEQbTJ(), zzep.AEQbTJ(), zzep.AEQbTJ());
            }
        }));
        Unit unit = Unit.INSTANCE;
        int i2 = aKErDB + 51;
        dNCPSb = i2 % 128;
        int i3 = i2 % 2;
        return unit;
    }

    public static final void flVtFt(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = aKErDB + 23;
        dNCPSb = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        if (i3 != 0) {
            throw null;
        }
        int i4 = dNCPSb + 41;
        aKErDB = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 38 / 0;
        }
    }

    public static final Unit fIwbmz(DefiWalletMainActivity defiWalletMainActivity, AbstractC12782ctV abstractC12782ctV) {
        int i = 2 % 2;
        int i2 = dNCPSb + 93;
        aKErDB = i2 % 128;
        int i3 = i2 % 2;
        ActivityC17337fBp.StateListAnimator stateListAnimator = ActivityC17337fBp.Companion;
        AbstractC12784ctX abstractC12784ctXGwTjWJ = abstractC12782ctV.gwTjWJ();
        if (abstractC12784ctXGwTjWJ != null) {
            int i4 = aKErDB + 31;
            dNCPSb = i4 % 128;
            int i5 = i4 % 2;
            String strEZpvd = abstractC12784ctXGwTjWJ.EZpvd();
            if (strEZpvd != null) {
                stateListAnimator.EZpvd(defiWalletMainActivity, strEZpvd);
                Unit unit = Unit.INSTANCE;
                int i6 = aKErDB + 27;
                dNCPSb = i6 % 128;
                if (i6 % 2 == 0) {
                    return unit;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }
        return Unit.INSTANCE;
    }

    private static /* synthetic */ Object dNCPSb(Object[] objArr) {
        int i = 2 % 2;
        int i2 = dNCPSb + 43;
        aKErDB = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = Unit.INSTANCE;
        if (i3 != 0) {
            return unit;
        }
        throw null;
    }

    private static /* synthetic */ Object fetchVPNInfo(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        Object obj = objArr[1];
        int i = 2 % 2;
        int i2 = dNCPSb + 5;
        aKErDB = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = aKErDB + 83;
        dNCPSb = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    public static final Unit flVtFt(final DefiWalletMainActivity defiWalletMainActivity) {
        int i = 2 % 2;
        defiWalletMainActivity.KWHzl(C18158fdC.Companion.OLrzqt());
        AbstractC58260yxt<AbstractC12782ctV> abstractC58260yxtCopydefault = C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null).copydefault(false);
        final Function1 function1 = new Function1() { // from class: o.dUn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return DefiWalletMainActivity.OLrzqt(this.KWHzl, (AbstractC12782ctV) obj);
            }
        };
        InterfaceC58227yxM<? super AbstractC12782ctV> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.dUo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                DefiWalletMainActivity.getFieldNames(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.dUu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return DefiWalletMainActivity.djBIcL((java.lang.Throwable) obj);
            }
        };
        defiWalletMainActivity.addDisposable(abstractC58260yxtCopydefault.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.dUt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) throws java.lang.Throwable {
                java.lang.Object[] objArr = {function12, obj};
                DefiWalletMainActivity.copydefault(zzep.AEQbTJ(), -2112948320, 2112948369, objArr, zzep.AEQbTJ(), zzep.AEQbTJ(), zzep.AEQbTJ());
            }
        }));
        Unit unit = Unit.INSTANCE;
        int i2 = dNCPSb + 53;
        aKErDB = i2 % 128;
        int i3 = i2 % 2;
        return unit;
    }

    public static final Unit gGvvIC(DefiWalletMainActivity defiWalletMainActivity) {
        int i = 2 % 2;
        int i2 = dNCPSb + 11;
        aKErDB = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            ActivityC17216eyc.Companion.EZpvd(defiWalletMainActivity);
            Unit unit = Unit.INSTANCE;
            int i3 = aKErDB + WalletImportError.ERROR_CODE_HARDWARE_ACCOUNT_EXIST;
            dNCPSb = i3 % 128;
            if (i3 % 2 == 0) {
                return unit;
            }
            obj.hashCode();
            throw null;
        }
        ActivityC17216eyc.Companion.EZpvd(defiWalletMainActivity);
        Unit unit2 = Unit.INSTANCE;
        obj.hashCode();
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x031c  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x033e  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0354  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x036a  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x038c  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x03a2  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x03ac  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x03b6  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x03cc  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0407  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x041d  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0433  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0463  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0479  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x048f  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x04a5  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0539  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0577  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0593  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x05bf  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x05c9  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x0626 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:269:0x0627  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x063c  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x0646  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x0651  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x06b3  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x06c5  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x06da  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x06ef  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x06f9  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x0704  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x0719  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x072e  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x0744  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x075d  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x0778  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x078a  */
    /* JADX WARN: Removed duplicated region for block: B:332:0x079f  */
    /* JADX WARN: Removed duplicated region for block: B:336:0x07b4  */
    /* JADX WARN: Removed duplicated region for block: B:339:0x07ef  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0219  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object AEQbTJ(String str, Bundle bundle, Continuation<? super Unit> continuation) throws Throwable {
        DefiWalletMainActivity$dispatchDeepLink$1 defiWalletMainActivity$dispatchDeepLink$1;
        final Bundle bundle2;
        final DefiWalletMainActivity defiWalletMainActivity;
        DefiWalletMainActivity defiWalletMainActivity2;
        final String string;
        String str2;
        final Bundle bundle3;
        final DefiWalletMainActivity defiWalletMainActivity3;
        DefiWalletMainActivity defiWalletMainActivity4;
        final Bundle bundle4;
        ArrayList<Long> arrayList;
        List listSplit$default;
        String strGEmmrt;
        String strGEmmrt2;
        String strGEmmrt3;
        String str3;
        DefiWalletMainActivity defiWalletMainActivity5;
        String strGEmmrt4;
        String str4;
        final DefiWalletMainActivity defiWalletMainActivity6;
        final String str5;
        Object objCopydefault;
        String str6 = str;
        int i = 2 % 2;
        int i2 = dNCPSb + 5;
        aKErDB = i2 % 128;
        int i3 = i2 % 2;
        if (continuation instanceof DefiWalletMainActivity$dispatchDeepLink$1) {
            defiWalletMainActivity$dispatchDeepLink$1 = (DefiWalletMainActivity$dispatchDeepLink$1) continuation;
            int i4 = defiWalletMainActivity$dispatchDeepLink$1.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                defiWalletMainActivity$dispatchDeepLink$1.label = i4 - Integer.MIN_VALUE;
            } else {
                defiWalletMainActivity$dispatchDeepLink$1 = new DefiWalletMainActivity$dispatchDeepLink$1(this, continuation);
            }
        }
        Object objAwait = defiWalletMainActivity$dispatchDeepLink$1.result;
        Object objCopydefault2 = C56442yFn.copydefault();
        int i5 = defiWalletMainActivity$dispatchDeepLink$1.label;
        if (i5 == 0) {
            C56391yDq.AEQbTJ(objAwait);
            if (!xZT.EZpvd.copydefault().contains(str6)) {
                bundle2 = bundle;
                defiWalletMainActivity = this;
                string = bundle2.getString("walletId");
                if (string == null) {
                    string = "";
                }
                switch (str6.hashCode()) {
                    case -2004777383:
                        if (str6.equals("wallet/management/editWallet")) {
                            defiWalletMainActivity.AEQbTJ(new Function0() { // from class: o.dVt
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                @Override // kotlin.jvm.functions.Function0
                                public final java.lang.Object invoke() {
                                    return DefiWalletMainActivity.fARcdN(this.copydefault);
                                }
                            });
                            Unit unit = Unit.INSTANCE;
                        } else {
                            pUU.valueOf(defiWalletMainActivity.getTAG(), "Unknown deeplink: " + str6);
                            C55328xhq.show$default(C55328xhq.OLrzqt, C56443yFo.AEQbTJ(C13754dXa.FragmentManager.DPVBvL), (Drawable) null, 0, C56443yFo.AEQbTJ(17), 0, 0, 54, (Object) null);
                        }
                        str3 = str6;
                        defiWalletMainActivity5 = defiWalletMainActivity;
                        if (!Intrinsics.EZpvd((Object) "wallet/referral/invitation", (Object) str3)) {
                        }
                        return Unit.INSTANCE;
                    case -1953806314:
                        if (str6.equals("wallet/management/aboutAccount")) {
                            defiWalletMainActivity.AEQbTJ(new Function0() { // from class: o.dVo
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                @Override // kotlin.jvm.functions.Function0
                                public final java.lang.Object invoke() {
                                    return DefiWalletMainActivity.valueOf(this.EZpvd);
                                }
                            });
                            Unit unit2 = Unit.INSTANCE;
                        }
                        str3 = str6;
                        defiWalletMainActivity5 = defiWalletMainActivity;
                        if (!Intrinsics.EZpvd((Object) "wallet/referral/invitation", (Object) str3)) {
                        }
                        return Unit.INSTANCE;
                    case -1916445200:
                        if (str6.equals("wallet/home/smallAssetsConverter")) {
                            ActivityC17837fUc.Companion.AEQbTJ(defiWalletMainActivity, true);
                            Unit unit3 = Unit.INSTANCE;
                        }
                        str3 = str6;
                        defiWalletMainActivity5 = defiWalletMainActivity;
                        if (!Intrinsics.EZpvd((Object) "wallet/referral/invitation", (Object) str3)) {
                        }
                        return Unit.INSTANCE;
                    case -1804684611:
                        if (str6.equals("wallet/fastTransfer")) {
                            defiWalletMainActivity.copydefault.KWHzl(C14564dno.AEQbTJ(C14557dnh.StateListAnimator.copydefault));
                            defiWalletMainActivity.aKErDB();
                            Unit unit4 = Unit.INSTANCE;
                        }
                        str3 = str6;
                        defiWalletMainActivity5 = defiWalletMainActivity;
                        if (!Intrinsics.EZpvd((Object) "wallet/referral/invitation", (Object) str3)) {
                        }
                        return Unit.INSTANCE;
                    case -1797930095:
                        if (str6.equals("wallet/home/batchCreateAccount")) {
                            C56443yFo.KWHzl(defiWalletMainActivity.fetchVPNInfo.post(new Runnable() { // from class: o.dVC
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                @Override // java.lang.Runnable
                                public final void run() {
                                    DefiWalletMainActivity.EZpvd(this.EZpvd);
                                }
                            }));
                        }
                        str3 = str6;
                        defiWalletMainActivity5 = defiWalletMainActivity;
                        if (!Intrinsics.EZpvd((Object) "wallet/referral/invitation", (Object) str3)) {
                        }
                        return Unit.INSTANCE;
                    case -1603933401:
                        if (str6.equals("wallet/detail")) {
                            defiWalletMainActivity.AEQbTJ(new Function0() { // from class: o.dVr
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                @Override // kotlin.jvm.functions.Function0
                                public final java.lang.Object invoke() {
                                    return DefiWalletMainActivity.values(this.AEQbTJ);
                                }
                            });
                            Unit unit5 = Unit.INSTANCE;
                        }
                        str3 = str6;
                        defiWalletMainActivity5 = defiWalletMainActivity;
                        if (!Intrinsics.EZpvd((Object) "wallet/referral/invitation", (Object) str3)) {
                        }
                        return Unit.INSTANCE;
                    case -1517177897:
                        if (str6.equals("wallet/home/dapp")) {
                            defiWalletMainActivity.AEQbTJ(new Function0() { // from class: o.dVB
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                @Override // kotlin.jvm.functions.Function0
                                public final java.lang.Object invoke() {
                                    return DefiWalletMainActivity.AuCTel(this.EZpvd);
                                }
                            });
                            Unit unit6 = Unit.INSTANCE;
                        }
                        str3 = str6;
                        defiWalletMainActivity5 = defiWalletMainActivity;
                        if (!Intrinsics.EZpvd((Object) "wallet/referral/invitation", (Object) str3)) {
                        }
                        return Unit.INSTANCE;
                    case -1517174370:
                        if (str6.equals("wallet/home/defi")) {
                            defiWalletMainActivity.AEQbTJ(new Function0() { // from class: o.dVA
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                @Override // kotlin.jvm.functions.Function0
                                public final java.lang.Object invoke() {
                                    return DefiWalletMainActivity.AhwBna(this.AEQbTJ);
                                }
                            });
                            Unit unit7 = Unit.INSTANCE;
                        }
                        str3 = str6;
                        defiWalletMainActivity5 = defiWalletMainActivity;
                        if (!Intrinsics.EZpvd((Object) "wallet/referral/invitation", (Object) str3)) {
                        }
                        return Unit.INSTANCE;
                    case -1516820695:
                        if (str6.equals("wallet/home/page")) {
                            defiWalletMainActivity.AEQbTJ(new Function0() { // from class: o.dUY
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                @Override // kotlin.jvm.functions.Function0
                                public final java.lang.Object invoke() {
                                    return DefiWalletMainActivity.OLrzqt(bundle2, defiWalletMainActivity);
                                }
                            });
                            Unit unit8 = Unit.INSTANCE;
                        }
                        str3 = str6;
                        defiWalletMainActivity5 = defiWalletMainActivity;
                        if (!Intrinsics.EZpvd((Object) "wallet/referral/invitation", (Object) str3)) {
                        }
                        return Unit.INSTANCE;
                    case -1516729577:
                        if (str6.equals("wallet/home/scan")) {
                            defiWalletMainActivity.AEQbTJ(new Function0() { // from class: o.dVF
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                @Override // kotlin.jvm.functions.Function0
                                public final java.lang.Object invoke() {
                                    java.lang.Object[] objArr = {this.KWHzl};
                                    return (Unit) DefiWalletMainActivity.copydefault(zzep.AEQbTJ(), 1277143443, -1277143437, objArr, zzep.AEQbTJ(), zzep.AEQbTJ(), zzep.AEQbTJ());
                                }
                            });
                            Unit unit9 = Unit.INSTANCE;
                        }
                        str3 = str6;
                        defiWalletMainActivity5 = defiWalletMainActivity;
                        if (!Intrinsics.EZpvd((Object) "wallet/referral/invitation", (Object) str3)) {
                        }
                        return Unit.INSTANCE;
                    case -1401301710:
                        if (str6.equals("wallet/management/resetWallet")) {
                            defiWalletMainActivity.AEQbTJ(new Function0() { // from class: o.dVw
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                @Override // kotlin.jvm.functions.Function0
                                public final java.lang.Object invoke() {
                                    return DefiWalletMainActivity.KWHzl(this.AEQbTJ);
                                }
                            });
                            Unit unit10 = Unit.INSTANCE;
                        }
                        str3 = str6;
                        defiWalletMainActivity5 = defiWalletMainActivity;
                        if (!Intrinsics.EZpvd((Object) "wallet/referral/invitation", (Object) str3)) {
                        }
                        return Unit.INSTANCE;
                    case -1334683864:
                        if (str6.equals("wallet/home/eip7702Upgrade")) {
                            ActivityC15273eCf.Companion.AEQbTJ(defiWalletMainActivity);
                            Unit unit11 = Unit.INSTANCE;
                        }
                        str3 = str6;
                        defiWalletMainActivity5 = defiWalletMainActivity;
                        if (!Intrinsics.EZpvd((Object) "wallet/referral/invitation", (Object) str3)) {
                        }
                        return Unit.INSTANCE;
                    case -1162691806:
                        if (str6.equals("wallet/home/freeGasPage")) {
                            defiWalletMainActivity$dispatchDeepLink$1.L$0 = defiWalletMainActivity;
                            defiWalletMainActivity$dispatchDeepLink$1.L$1 = str6;
                            defiWalletMainActivity$dispatchDeepLink$1.L$2 = bundle2;
                            defiWalletMainActivity$dispatchDeepLink$1.label = 5;
                            Object objCopydefault3 = copydefault(zzep.AEQbTJ(), 1346353819, -1346353765, new Object[]{defiWalletMainActivity, bundle2, defiWalletMainActivity$dispatchDeepLink$1}, zzep.AEQbTJ(), zzep.AEQbTJ(), zzep.AEQbTJ());
                            if (objCopydefault3 == objCopydefault2) {
                                int i6 = aKErDB + 17;
                                dNCPSb = i6 % 128;
                                if (i6 % 2 == 0) {
                                    return objCopydefault2;
                                }
                                throw null;
                            }
                            str2 = str6;
                            bundle3 = bundle2;
                            defiWalletMainActivity3 = defiWalletMainActivity;
                            objAwait = objCopydefault3;
                            final Pair pair = (Pair) objAwait;
                            C56443yFo.KWHzl(defiWalletMainActivity3.fetchVPNInfo.postDelayed(new Runnable() { // from class: o.dVy
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                @Override // java.lang.Runnable
                                public final void run() {
                                    DefiWalletMainActivity.EZpvd(this.OLrzqt, bundle3, pair);
                                }
                            }, 0L));
                            bundle2 = bundle3;
                            defiWalletMainActivity = defiWalletMainActivity3;
                            str6 = str2;
                            str3 = str6;
                            defiWalletMainActivity5 = defiWalletMainActivity;
                            if (!Intrinsics.EZpvd((Object) "wallet/referral/invitation", (Object) str3)) {
                            }
                            return Unit.INSTANCE;
                        }
                        pUU.valueOf(defiWalletMainActivity.getTAG(), "Unknown deeplink: " + str6);
                        C55328xhq.show$default(C55328xhq.OLrzqt, C56443yFo.AEQbTJ(C13754dXa.FragmentManager.DPVBvL), (Drawable) null, 0, C56443yFo.AEQbTJ(17), 0, 0, 54, (Object) null);
                        str3 = str6;
                        defiWalletMainActivity5 = defiWalletMainActivity;
                        if (!Intrinsics.EZpvd((Object) "wallet/referral/invitation", (Object) str3)) {
                        }
                        return Unit.INSTANCE;
                    case -1081570747:
                        if (str6.equals("mainwc")) {
                            defiWalletMainActivity.AEQbTJ(new Function0() { // from class: o.dVD
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                @Override // kotlin.jvm.functions.Function0
                                public final java.lang.Object invoke() {
                                    return DefiWalletMainActivity.KWHzl(this.copydefault, bundle2);
                                }
                            });
                            Unit unit12 = Unit.INSTANCE;
                        }
                        str3 = str6;
                        defiWalletMainActivity5 = defiWalletMainActivity;
                        if (!Intrinsics.EZpvd((Object) "wallet/referral/invitation", (Object) str3)) {
                        }
                        return Unit.INSTANCE;
                    case -1018754182:
                        if (str6.equals("wallet/home/web")) {
                            CoroutineDispatcher io2 = Dispatchers.getIO();
                            DefiWalletMainActivity$dispatchDeepLink$decodedUrl$1 defiWalletMainActivity$dispatchDeepLink$decodedUrl$1 = new DefiWalletMainActivity$dispatchDeepLink$decodedUrl$1(bundle2, null);
                            defiWalletMainActivity$dispatchDeepLink$1.L$0 = defiWalletMainActivity;
                            defiWalletMainActivity$dispatchDeepLink$1.L$1 = str6;
                            defiWalletMainActivity$dispatchDeepLink$1.L$2 = bundle2;
                            defiWalletMainActivity$dispatchDeepLink$1.label = 3;
                            Object objWithContext = BuildersKt.withContext(io2, defiWalletMainActivity$dispatchDeepLink$decodedUrl$1, defiWalletMainActivity$dispatchDeepLink$1);
                            if (objWithContext == objCopydefault2) {
                                return objCopydefault2;
                            }
                            Bundle bundle5 = bundle2;
                            defiWalletMainActivity4 = defiWalletMainActivity;
                            objAwait = objWithContext;
                            bundle4 = bundle5;
                            String str7 = (String) objAwait;
                            bundle4.putString("openUrl", str7);
                            defiWalletMainActivity$dispatchDeepLink$1.L$0 = defiWalletMainActivity4;
                            defiWalletMainActivity$dispatchDeepLink$1.L$1 = str6;
                            defiWalletMainActivity$dispatchDeepLink$1.L$2 = bundle4;
                            defiWalletMainActivity$dispatchDeepLink$1.L$3 = str7;
                            defiWalletMainActivity$dispatchDeepLink$1.label = 4;
                            objCopydefault = copydefault(zzep.AEQbTJ(), 1346353819, -1346353765, new Object[]{defiWalletMainActivity4, bundle4, defiWalletMainActivity$dispatchDeepLink$1}, zzep.AEQbTJ(), zzep.AEQbTJ(), zzep.AEQbTJ());
                            if (objCopydefault != objCopydefault2) {
                            }
                        }
                        pUU.valueOf(defiWalletMainActivity.getTAG(), "Unknown deeplink: " + str6);
                        C55328xhq.show$default(C55328xhq.OLrzqt, C56443yFo.AEQbTJ(C13754dXa.FragmentManager.DPVBvL), (Drawable) null, 0, C56443yFo.AEQbTJ(17), 0, 0, 54, (Object) null);
                        str3 = str6;
                        defiWalletMainActivity5 = defiWalletMainActivity;
                        if (!Intrinsics.EZpvd((Object) "wallet/referral/invitation", (Object) str3)) {
                        }
                        return Unit.INSTANCE;
                    case -846232267:
                        if (!str6.equals("wallet/home")) {
                        }
                        str3 = str6;
                        defiWalletMainActivity5 = defiWalletMainActivity;
                        if (!Intrinsics.EZpvd((Object) "wallet/referral/invitation", (Object) str3)) {
                        }
                        return Unit.INSTANCE;
                    case -845914146:
                        if (str6.equals("wallet/send")) {
                            defiWalletMainActivity.KWHzl(C18158fdC.Companion.OLrzqt());
                            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(defiWalletMainActivity), null, null, new DefiWalletMainActivity$dispatchDeepLink$17(string, defiWalletMainActivity, null), 3, null);
                        }
                        str3 = str6;
                        defiWalletMainActivity5 = defiWalletMainActivity;
                        if (!Intrinsics.EZpvd((Object) "wallet/referral/invitation", (Object) str3)) {
                        }
                        return Unit.INSTANCE;
                    case -839703806:
                        if (str6.equals("wallet/history/detail")) {
                            C56443yFo.KWHzl(defiWalletMainActivity.fetchVPNInfo.postDelayed(new Runnable() { // from class: o.dVm
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                @Override // java.lang.Runnable
                                public final void run() {
                                    DefiWalletMainActivity.AEQbTJ(bundle2, string, defiWalletMainActivity);
                                }
                            }, 1300L));
                        }
                        str3 = str6;
                        defiWalletMainActivity5 = defiWalletMainActivity;
                        if (!Intrinsics.EZpvd((Object) "wallet/referral/invitation", (Object) str3)) {
                        }
                        return Unit.INSTANCE;
                    case -707421078:
                        if (str6.equals("wallet/home/usdgActivity")) {
                            if (!C35202nqq.OLrzqt.AEQbTJ("web3_usdg_activity_status")) {
                                pUU.copydefault(defiWalletMainActivity.getTAG(), "usdg activity ended gray");
                                C55326xho.toast$default(C33070mpX.AYXKKw(C13754dXa.FragmentManager.AlertControllerAlertParams2), (Drawable) null, 0, (Integer) null, 0, 0, 31, (Object) null);
                                return Unit.INSTANCE;
                            }
                            String strGEmmrt5 = C33129mqd.gEmmrt(bundle2.get("support_coinIds"));
                            if (strGEmmrt5 != null) {
                                int i7 = dNCPSb + WalletImportError.ERROR_CODE_HARDWARE_ACCOUNT_EXIST;
                                aKErDB = i7 % 128;
                                if (i7 % 2 != 0 ? (listSplit$default = StringsKt__StringsKt.split$default((CharSequence) strGEmmrt5, new String[]{","}, false, 0, 6, (Object) null)) == null : (listSplit$default = StringsKt__StringsKt.split$default((CharSequence) strGEmmrt5, new String[]{","}, true, 1, 94, (Object) null)) == null) {
                                    arrayList = null;
                                } else {
                                    ArrayList arrayList2 = new ArrayList();
                                    Iterator it = listSplit$default.iterator();
                                    while (it.hasNext()) {
                                        Long fieldNames = StringsKt__StringNumberConversionsKt.getFieldNames((String) it.next());
                                        if (fieldNames != null) {
                                            arrayList2.add(fieldNames);
                                        }
                                    }
                                    arrayList = new ArrayList<>(arrayList2);
                                }
                                long jValueOf = C33129mqd.valueOf(bundle2.get("banner_id"));
                                if (arrayList == null || arrayList.isEmpty()) {
                                    pUU.copydefault(defiWalletMainActivity.getTAG(), "usdg activity ended coinIdList is empty");
                                    C55326xho.toast$default(C33070mpX.AYXKKw(C13754dXa.FragmentManager.AlertControllerAlertParams2), (Drawable) null, 0, (Integer) null, 0, 0, 31, (Object) null);
                                    return Unit.INSTANCE;
                                }
                                ActivityC18241feg.Companion.copydefault(defiWalletMainActivity, arrayList, C56443yFo.KWHzl(jValueOf));
                                Unit unit13 = Unit.INSTANCE;
                            }
                            if (!Intrinsics.EZpvd((Object) "wallet/referral/invitation", (Object) str3)) {
                            }
                            return Unit.INSTANCE;
                        }
                        str3 = str6;
                        defiWalletMainActivity5 = defiWalletMainActivity;
                        if (!Intrinsics.EZpvd((Object) "wallet/referral/invitation", (Object) str3)) {
                        }
                        return Unit.INSTANCE;
                    case -650071718:
                        if (str6.equals("wallet/hardware/ledger")) {
                            defiWalletMainActivity.AEQbTJ(new Function0() { // from class: o.dVk
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                @Override // kotlin.jvm.functions.Function0
                                public final java.lang.Object invoke() {
                                    return DefiWalletMainActivity.DbNXlk(this.KWHzl);
                                }
                            });
                            Unit unit14 = Unit.INSTANCE;
                        }
                        str3 = str6;
                        defiWalletMainActivity5 = defiWalletMainActivity;
                        if (!Intrinsics.EZpvd((Object) "wallet/referral/invitation", (Object) str3)) {
                        }
                        return Unit.INSTANCE;
                    case -555838934:
                        if (str6.equals("wallet/hardware/onekey")) {
                            defiWalletMainActivity.AEQbTJ(new Function0() { // from class: o.dVl
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                @Override // kotlin.jvm.functions.Function0
                                public final java.lang.Object invoke() {
                                    return DefiWalletMainActivity.fJNWhG(this.OLrzqt);
                                }
                            });
                            Unit unit15 = Unit.INSTANCE;
                        }
                        str3 = str6;
                        defiWalletMainActivity5 = defiWalletMainActivity;
                        if (!Intrinsics.EZpvd((Object) "wallet/referral/invitation", (Object) str3)) {
                        }
                        return Unit.INSTANCE;
                    case -336356339:
                        if (str6.equals("wallet/tonconnect")) {
                            defiWalletMainActivity.AEQbTJ(new Function0() { // from class: o.dVG
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                @Override // kotlin.jvm.functions.Function0
                                public final java.lang.Object invoke() {
                                    return DefiWalletMainActivity.copydefault(this.OLrzqt, bundle2);
                                }
                            });
                            Unit unit16 = Unit.INSTANCE;
                        }
                        str3 = str6;
                        defiWalletMainActivity5 = defiWalletMainActivity;
                        if (!Intrinsics.EZpvd((Object) "wallet/referral/invitation", (Object) str3)) {
                        }
                        return Unit.INSTANCE;
                    case -123383243:
                        if (str6.equals("wallet/referral/invitation")) {
                            Object obj = bundle2.get("ref");
                            String strGEmmrt6 = obj != null ? C33129mqd.gEmmrt(obj) : null;
                            if (strGEmmrt6 != null) {
                                BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(defiWalletMainActivity), null, null, new DefiWalletMainActivity$dispatchDeepLink$28(defiWalletMainActivity, strGEmmrt6, null), 3, null);
                            }
                            Unit unit17 = Unit.INSTANCE;
                        }
                        str3 = str6;
                        defiWalletMainActivity5 = defiWalletMainActivity;
                        if (!Intrinsics.EZpvd((Object) "wallet/referral/invitation", (Object) str3)) {
                        }
                        return Unit.INSTANCE;
                    case 321518689:
                        if (str6.equals("wallet/teeAccount/statusPage")) {
                            defiWalletMainActivity.AEQbTJ(new Function0() { // from class: o.dVg
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                @Override // kotlin.jvm.functions.Function0
                                public final java.lang.Object invoke() {
                                    java.lang.Object[] objArr = {this.OLrzqt};
                                    return (Unit) DefiWalletMainActivity.copydefault(zzep.AEQbTJ(), 1536645977, -1536645905, objArr, zzep.AEQbTJ(), zzep.AEQbTJ(), zzep.AEQbTJ());
                                }
                            });
                            Unit unit18 = Unit.INSTANCE;
                        }
                        str3 = str6;
                        defiWalletMainActivity5 = defiWalletMainActivity;
                        if (!Intrinsics.EZpvd((Object) "wallet/referral/invitation", (Object) str3)) {
                        }
                        return Unit.INSTANCE;
                    case 426685680:
                        if (str6.equals("wallet/management/aboutWallet")) {
                            defiWalletMainActivity.AEQbTJ(new Function0() { // from class: o.dVv
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                @Override // kotlin.jvm.functions.Function0
                                public final java.lang.Object invoke() {
                                    return DefiWalletMainActivity.fIwbmz(this.EZpvd);
                                }
                            });
                            Unit unit19 = Unit.INSTANCE;
                        }
                        str3 = str6;
                        defiWalletMainActivity5 = defiWalletMainActivity;
                        if (!Intrinsics.EZpvd((Object) "wallet/referral/invitation", (Object) str3)) {
                        }
                        return Unit.INSTANCE;
                    case 686096226:
                        if (str6.equals("wallet/referral/affiliates")) {
                            Object obj2 = bundle2.get("code");
                            if (obj2 != null) {
                                int i8 = dNCPSb + 71;
                                aKErDB = i8 % 128;
                                int i9 = i8 % 2;
                                strGEmmrt = C33129mqd.gEmmrt(obj2);
                            } else {
                                strGEmmrt = null;
                            }
                            if (strGEmmrt != null) {
                                BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(defiWalletMainActivity), null, null, new DefiWalletMainActivity$dispatchDeepLink$29(defiWalletMainActivity, strGEmmrt, null), 3, null);
                            }
                            Unit unit20 = Unit.INSTANCE;
                        }
                        str3 = str6;
                        defiWalletMainActivity5 = defiWalletMainActivity;
                        if (!Intrinsics.EZpvd((Object) "wallet/referral/invitation", (Object) str3)) {
                        }
                        return Unit.INSTANCE;
                    case 732524778:
                        if (str6.equals("wallet/home/multiTransfer")) {
                            defiWalletMainActivity.AEQbTJ(new Function0() { // from class: o.dVp
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                @Override // kotlin.jvm.functions.Function0
                                public final java.lang.Object invoke() {
                                    return DefiWalletMainActivity.iwGUEr(this.KWHzl);
                                }
                            });
                            Unit unit21 = Unit.INSTANCE;
                        }
                        str3 = str6;
                        defiWalletMainActivity5 = defiWalletMainActivity;
                        if (!Intrinsics.EZpvd((Object) "wallet/referral/invitation", (Object) str3)) {
                        }
                        return Unit.INSTANCE;
                    case 799422631:
                        if (!str6.equals("wc/connect")) {
                        }
                        str3 = str6;
                        defiWalletMainActivity5 = defiWalletMainActivity;
                        if (!Intrinsics.EZpvd((Object) "wallet/referral/invitation", (Object) str3)) {
                        }
                        return Unit.INSTANCE;
                    case 830976738:
                        if (!str6.equals("main/wc")) {
                        }
                        str3 = str6;
                        defiWalletMainActivity5 = defiWalletMainActivity;
                        if (!Intrinsics.EZpvd((Object) "wallet/referral/invitation", (Object) str3)) {
                        }
                        return Unit.INSTANCE;
                    case 1044333140:
                        if (str6.equals("wallet/pandora/walletTools")) {
                            defiWalletMainActivity.AEQbTJ(new Function0() { // from class: o.dVz
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                @Override // kotlin.jvm.functions.Function0
                                public final java.lang.Object invoke() {
                                    return DefiWalletMainActivity.OLrzqt(this.KWHzl);
                                }
                            });
                            Unit unit22 = Unit.INSTANCE;
                        }
                        str3 = str6;
                        defiWalletMainActivity5 = defiWalletMainActivity;
                        if (!Intrinsics.EZpvd((Object) "wallet/referral/invitation", (Object) str3)) {
                        }
                        return Unit.INSTANCE;
                    case 1186884734:
                        if (str6.equals("wallet/history")) {
                            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(defiWalletMainActivity), null, null, new DefiWalletMainActivity$dispatchDeepLink$19(string, defiWalletMainActivity, null), 3, null);
                        }
                        str3 = str6;
                        defiWalletMainActivity5 = defiWalletMainActivity;
                        if (!Intrinsics.EZpvd((Object) "wallet/referral/invitation", (Object) str3)) {
                        }
                        return Unit.INSTANCE;
                    case 1211302100:
                        if (str6.equals("wallet/connect")) {
                            defiWalletMainActivity.AEQbTJ(new Function0() { // from class: o.dVh
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                @Override // kotlin.jvm.functions.Function0
                                public final java.lang.Object invoke() {
                                    return DefiWalletMainActivity.AEQbTJ(this.AEQbTJ, bundle2);
                                }
                            });
                            Unit unit23 = Unit.INSTANCE;
                        }
                        str3 = str6;
                        defiWalletMainActivity5 = defiWalletMainActivity;
                        if (!Intrinsics.EZpvd((Object) "wallet/referral/invitation", (Object) str3)) {
                        }
                        return Unit.INSTANCE;
                    case 1216235799:
                        if (str6.equals("wallet/hardware/keystone")) {
                            defiWalletMainActivity.AEQbTJ(new Function0() { // from class: o.dVn
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                @Override // kotlin.jvm.functions.Function0
                                public final java.lang.Object invoke() {
                                    return DefiWalletMainActivity.AYXKKw(this.EZpvd);
                                }
                            });
                            Unit unit24 = Unit.INSTANCE;
                        }
                        str3 = str6;
                        defiWalletMainActivity5 = defiWalletMainActivity;
                        if (!Intrinsics.EZpvd((Object) "wallet/referral/invitation", (Object) str3)) {
                        }
                        return Unit.INSTANCE;
                    case 1342241485:
                        if (str6.equals("wallet/receive")) {
                            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(defiWalletMainActivity), null, null, new DefiWalletMainActivity$dispatchDeepLink$18(string, defiWalletMainActivity, null), 3, null);
                        }
                        str3 = str6;
                        defiWalletMainActivity5 = defiWalletMainActivity;
                        if (!Intrinsics.EZpvd((Object) "wallet/referral/invitation", (Object) str3)) {
                        }
                        return Unit.INSTANCE;
                    case 1345449836:
                        if (str6.equals("wallet/objectivity")) {
                            Object obj3 = bundle2.get(WalletSearchRequest.SEARCH_SOURCE_ADDRESS);
                            String strGEmmrt7 = obj3 != null ? C33129mqd.gEmmrt(obj3) : null;
                            String str8 = strGEmmrt7 == null ? "" : strGEmmrt7;
                            Object obj4 = bundle2.get("periodType");
                            String strGEmmrt8 = obj4 != null ? C33129mqd.gEmmrt(obj4) : null;
                            String str9 = strGEmmrt8 == null ? "" : strGEmmrt8;
                            Object obj5 = bundle2.get("selectedChainId");
                            if (obj5 != null) {
                                int i10 = dNCPSb + 95;
                                aKErDB = i10 % 128;
                                int i11 = i10 % 2;
                                strGEmmrt2 = C33129mqd.gEmmrt(obj5);
                            } else {
                                strGEmmrt2 = null;
                            }
                            String str10 = strGEmmrt2 != null ? strGEmmrt2 : "";
                            long jValueOf2 = str10.length() == 0 ? Long.MIN_VALUE : C33129mqd.valueOf(str10);
                            if (str8.length() == 0) {
                                pUU.copydefault(defiWalletMainActivity.getTAG(), "wallet/objectivity deeplink address is empty");
                                return Unit.INSTANCE;
                            }
                            final String string2 = bundle2.getString("from_module");
                            if (bundle2.containsKey("from_module") && string2 != null && !StringsKt__StringsKt.fARcdN((CharSequence) string2)) {
                                final String string3 = bundle2.getString("from_channel_id", "none");
                                C32866mlf.onEvent$default("Web3_ShareLink_VisitAPP_View", (TrackChannel[]) null, new Function1() { // from class: o.dVq
                                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                    @Override // kotlin.jvm.functions.Function1
                                    public final java.lang.Object invoke(java.lang.Object obj6) {
                                        java.lang.Object[] objArr = {string3, string2, (EventParamsList) obj6};
                                        return (Unit) DefiWalletMainActivity.copydefault(zzep.AEQbTJ(), 2098571949, -2098571917, objArr, zzep.AEQbTJ(), zzep.AEQbTJ(), zzep.AEQbTJ());
                                    }
                                }, 1, (Object) null);
                            }
                            eVQ.TaskDescription.startActivity$default(eVQ.Companion, defiWalletMainActivity, str8, null, jValueOf2, str9, 4, null);
                            Unit unit25 = Unit.INSTANCE;
                        }
                        str3 = str6;
                        defiWalletMainActivity5 = defiWalletMainActivity;
                        if (!Intrinsics.EZpvd((Object) "wallet/referral/invitation", (Object) str3)) {
                        }
                        return Unit.INSTANCE;
                    case 1352609767:
                        if (str6.equals("wallet/home/h5")) {
                            defiWalletMainActivity$dispatchDeepLink$1.L$0 = defiWalletMainActivity;
                            defiWalletMainActivity$dispatchDeepLink$1.L$1 = str6;
                            defiWalletMainActivity$dispatchDeepLink$1.L$2 = bundle2;
                            defiWalletMainActivity$dispatchDeepLink$1.label = 2;
                            Object objCopydefault4 = copydefault(zzep.AEQbTJ(), 1346353819, -1346353765, new Object[]{defiWalletMainActivity, bundle2, defiWalletMainActivity$dispatchDeepLink$1}, zzep.AEQbTJ(), zzep.AEQbTJ(), zzep.AEQbTJ());
                            if (objCopydefault4 == objCopydefault2) {
                                return objCopydefault2;
                            }
                            str2 = str6;
                            bundle3 = bundle2;
                            defiWalletMainActivity3 = defiWalletMainActivity;
                            objAwait = objCopydefault4;
                            Pair pair2 = (Pair) objAwait;
                            defiWalletMainActivity3.EZpvd(bundle3, (String) pair2.getFirst(), (AbstractC43419rot<VerifyDAppDomainUrlResponse, OKServerException>) pair2.getSecond(), defiWalletMainActivity3.new Activity(bundle3));
                            Unit unit26 = Unit.INSTANCE;
                            bundle2 = bundle3;
                            defiWalletMainActivity = defiWalletMainActivity3;
                            str6 = str2;
                            str3 = str6;
                            defiWalletMainActivity5 = defiWalletMainActivity;
                            if (!Intrinsics.EZpvd((Object) "wallet/referral/invitation", (Object) str3)) {
                            }
                            return Unit.INSTANCE;
                        }
                        pUU.valueOf(defiWalletMainActivity.getTAG(), "Unknown deeplink: " + str6);
                        C55328xhq.show$default(C55328xhq.OLrzqt, C56443yFo.AEQbTJ(C13754dXa.FragmentManager.DPVBvL), (Drawable) null, 0, C56443yFo.AEQbTJ(17), 0, 0, 54, (Object) null);
                        str3 = str6;
                        defiWalletMainActivity5 = defiWalletMainActivity;
                        if (!Intrinsics.EZpvd((Object) "wallet/referral/invitation", (Object) str3)) {
                        }
                        return Unit.INSTANCE;
                    case 1437139115:
                        if (str6.equals("wallet/home/airdropZone")) {
                            defiWalletMainActivity.AEQbTJ(new Function0() { // from class: o.dVf
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                @Override // kotlin.jvm.functions.Function0
                                public final java.lang.Object invoke() {
                                    return DefiWalletMainActivity.getFieldNames(this.AEQbTJ);
                                }
                            });
                            Unit unit27 = Unit.INSTANCE;
                        }
                        str3 = str6;
                        defiWalletMainActivity5 = defiWalletMainActivity;
                        if (!Intrinsics.EZpvd((Object) "wallet/referral/invitation", (Object) str3)) {
                        }
                        return Unit.INSTANCE;
                    case 1451764231:
                        if (str6.equals("wallet/management/customNetwork")) {
                            defiWalletMainActivity.AEQbTJ(new Function0() { // from class: o.dVx
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                @Override // kotlin.jvm.functions.Function0
                                public final java.lang.Object invoke() {
                                    return DefiWalletMainActivity.AkhnZx(this.OLrzqt);
                                }
                            });
                            Unit unit28 = Unit.INSTANCE;
                        }
                        str3 = str6;
                        defiWalletMainActivity5 = defiWalletMainActivity;
                        if (!Intrinsics.EZpvd((Object) "wallet/referral/invitation", (Object) str3)) {
                        }
                        return Unit.INSTANCE;
                    case 1692199635:
                        if (str6.equals("wallet/home/mpcBackupTip")) {
                            defiWalletMainActivity.showLoading();
                            defiWalletMainActivity.AEQbTJ(new Function0() { // from class: o.dVe
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                @Override // kotlin.jvm.functions.Function0
                                public final java.lang.Object invoke() {
                                    return DefiWalletMainActivity.ejfBZ(this.EZpvd);
                                }
                            });
                            Unit unit29 = Unit.INSTANCE;
                        }
                        str3 = str6;
                        defiWalletMainActivity5 = defiWalletMainActivity;
                        if (!Intrinsics.EZpvd((Object) "wallet/referral/invitation", (Object) str3)) {
                        }
                        return Unit.INSTANCE;
                    case 1695153937:
                        if (str6.equals("wallet/cefiWalletBinding")) {
                            Object obj6 = bundle2.get("walletAddress");
                            String strGEmmrt9 = obj6 != null ? C33129mqd.gEmmrt(obj6) : null;
                            Object obj7 = bundle2.get("chainId");
                            String strGEmmrt10 = obj7 != null ? C33129mqd.gEmmrt(obj7) : null;
                            String string4 = bundle2.getString("source");
                            WalletCefiBindingService.Source sourceEZpvd = string4 != null ? WalletCefiBindingService.Source.Companion.EZpvd(string4) : null;
                            Object obj8 = bundle2.get("redirect");
                            String strGEmmrt11 = obj8 != null ? C33129mqd.gEmmrt(obj8) : null;
                            Object obj9 = bundle2.get("requestId");
                            if (obj9 != null) {
                                int i12 = dNCPSb + 89;
                                aKErDB = i12 % 128;
                                int i13 = i12 % 2;
                                strGEmmrt3 = C33129mqd.gEmmrt(obj9);
                            } else {
                                strGEmmrt3 = null;
                            }
                            String str11 = strGEmmrt3 == null ? "" : strGEmmrt3;
                            if (strGEmmrt9 == null || strGEmmrt9.length() == 0 || strGEmmrt10 == null || strGEmmrt10.length() == 0) {
                                pUU.copydefault(defiWalletMainActivity.getTAG(), "CeFi wallet binding deeplink missing parameters");
                                return Unit.INSTANCE;
                            }
                            defiWalletMainActivity.copydefault(strGEmmrt9, strGEmmrt10, sourceEZpvd, str11, strGEmmrt11);
                            Unit unit30 = Unit.INSTANCE;
                        }
                        str3 = str6;
                        defiWalletMainActivity5 = defiWalletMainActivity;
                        if (!Intrinsics.EZpvd((Object) "wallet/referral/invitation", (Object) str3)) {
                        }
                        return Unit.INSTANCE;
                    case 1921609270:
                        if (str6.equals("wallet/home/approvals")) {
                            defiWalletMainActivity.AEQbTJ(new Function0() { // from class: o.dVH
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                @Override // kotlin.jvm.functions.Function0
                                public final java.lang.Object invoke() {
                                    return DefiWalletMainActivity.uzCIH(this.KWHzl);
                                }
                            });
                            Unit unit31 = Unit.INSTANCE;
                        }
                        str3 = str6;
                        defiWalletMainActivity5 = defiWalletMainActivity;
                        if (!Intrinsics.EZpvd((Object) "wallet/referral/invitation", (Object) str3)) {
                        }
                        return Unit.INSTANCE;
                }
            }
            AbstractC58260yxt<AbstractC12782ctV> abstractC58260yxtCopydefault = C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null).copydefault(false);
            defiWalletMainActivity$dispatchDeepLink$1.L$0 = this;
            defiWalletMainActivity$dispatchDeepLink$1.L$1 = str6;
            bundle2 = bundle;
            defiWalletMainActivity$dispatchDeepLink$1.L$2 = bundle2;
            defiWalletMainActivity$dispatchDeepLink$1.label = 1;
            objAwait = RxAwaitKt.await(abstractC58260yxtCopydefault, defiWalletMainActivity$dispatchDeepLink$1);
            if (objAwait == objCopydefault2) {
                return objCopydefault2;
            }
            defiWalletMainActivity2 = this;
        } else {
            if (i5 != 1) {
                if (i5 == 2) {
                    bundle3 = (Bundle) defiWalletMainActivity$dispatchDeepLink$1.L$2;
                    str2 = (String) defiWalletMainActivity$dispatchDeepLink$1.L$1;
                    defiWalletMainActivity3 = (DefiWalletMainActivity) defiWalletMainActivity$dispatchDeepLink$1.L$0;
                    C56391yDq.AEQbTJ(objAwait);
                    Pair pair22 = (Pair) objAwait;
                    defiWalletMainActivity3.EZpvd(bundle3, (String) pair22.getFirst(), (AbstractC43419rot<VerifyDAppDomainUrlResponse, OKServerException>) pair22.getSecond(), defiWalletMainActivity3.new Activity(bundle3));
                    Unit unit262 = Unit.INSTANCE;
                    bundle2 = bundle3;
                    defiWalletMainActivity = defiWalletMainActivity3;
                    str6 = str2;
                    str3 = str6;
                    defiWalletMainActivity5 = defiWalletMainActivity;
                    if (!Intrinsics.EZpvd((Object) "wallet/referral/invitation", (Object) str3)) {
                    }
                    return Unit.INSTANCE;
                }
                int i14 = aKErDB + 9;
                dNCPSb = i14 % 128;
                if (i14 % 2 == 0 ? i5 != 3 : i5 != 5) {
                    if (i5 == 4) {
                        str5 = (String) defiWalletMainActivity$dispatchDeepLink$1.L$3;
                        bundle4 = (Bundle) defiWalletMainActivity$dispatchDeepLink$1.L$2;
                        str4 = (String) defiWalletMainActivity$dispatchDeepLink$1.L$1;
                        defiWalletMainActivity6 = (DefiWalletMainActivity) defiWalletMainActivity$dispatchDeepLink$1.L$0;
                        C56391yDq.AEQbTJ(objAwait);
                        final Pair pair3 = (Pair) objAwait;
                        defiWalletMainActivity6.AEQbTJ(new Function0() { // from class: o.dVs
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return DefiWalletMainActivity.EZpvd(this.copydefault, bundle4, pair3, str5);
                            }
                        });
                        Unit unit32 = Unit.INSTANCE;
                        defiWalletMainActivity5 = defiWalletMainActivity6;
                        bundle2 = bundle4;
                        str3 = str4;
                        if (!Intrinsics.EZpvd((Object) "wallet/referral/invitation", (Object) str3)) {
                        }
                        return Unit.INSTANCE;
                    }
                    if (i5 != 5) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bundle3 = (Bundle) defiWalletMainActivity$dispatchDeepLink$1.L$2;
                    str2 = (String) defiWalletMainActivity$dispatchDeepLink$1.L$1;
                    defiWalletMainActivity3 = (DefiWalletMainActivity) defiWalletMainActivity$dispatchDeepLink$1.L$0;
                    C56391yDq.AEQbTJ(objAwait);
                    final Pair pair4 = (Pair) objAwait;
                    C56443yFo.KWHzl(defiWalletMainActivity3.fetchVPNInfo.postDelayed(new Runnable() { // from class: o.dVy
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // java.lang.Runnable
                        public final void run() {
                            DefiWalletMainActivity.EZpvd(this.OLrzqt, bundle3, pair4);
                        }
                    }, 0L));
                    bundle2 = bundle3;
                    defiWalletMainActivity = defiWalletMainActivity3;
                    str6 = str2;
                    str3 = str6;
                    defiWalletMainActivity5 = defiWalletMainActivity;
                    if (!Intrinsics.EZpvd((Object) "wallet/referral/invitation", (Object) str3)) {
                    }
                    return Unit.INSTANCE;
                }
                Bundle bundle6 = (Bundle) defiWalletMainActivity$dispatchDeepLink$1.L$2;
                String str12 = (String) defiWalletMainActivity$dispatchDeepLink$1.L$1;
                defiWalletMainActivity4 = (DefiWalletMainActivity) defiWalletMainActivity$dispatchDeepLink$1.L$0;
                C56391yDq.AEQbTJ(objAwait);
                bundle4 = bundle6;
                str6 = str12;
                String str72 = (String) objAwait;
                bundle4.putString("openUrl", str72);
                defiWalletMainActivity$dispatchDeepLink$1.L$0 = defiWalletMainActivity4;
                defiWalletMainActivity$dispatchDeepLink$1.L$1 = str6;
                defiWalletMainActivity$dispatchDeepLink$1.L$2 = bundle4;
                defiWalletMainActivity$dispatchDeepLink$1.L$3 = str72;
                defiWalletMainActivity$dispatchDeepLink$1.label = 4;
                objCopydefault = copydefault(zzep.AEQbTJ(), 1346353819, -1346353765, new Object[]{defiWalletMainActivity4, bundle4, defiWalletMainActivity$dispatchDeepLink$1}, zzep.AEQbTJ(), zzep.AEQbTJ(), zzep.AEQbTJ());
                if (objCopydefault != objCopydefault2) {
                    return objCopydefault2;
                }
                str4 = str6;
                str5 = str72;
                objAwait = objCopydefault;
                defiWalletMainActivity6 = defiWalletMainActivity4;
                final Pair pair32 = (Pair) objAwait;
                defiWalletMainActivity6.AEQbTJ(new Function0() { // from class: o.dVs
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return DefiWalletMainActivity.EZpvd(this.copydefault, bundle4, pair32, str5);
                    }
                });
                Unit unit322 = Unit.INSTANCE;
                defiWalletMainActivity5 = defiWalletMainActivity6;
                bundle2 = bundle4;
                str3 = str4;
                if (!Intrinsics.EZpvd((Object) "wallet/referral/invitation", (Object) str3)) {
                    int i15 = aKErDB + 53;
                    dNCPSb = i15 % 128;
                    int i16 = i15 % 2;
                    if (!Intrinsics.EZpvd((Object) "wallet/referral/dashboard", (Object) str3)) {
                        int i17 = dNCPSb + 63;
                        aKErDB = i17 % 128;
                        if (i17 % 2 == 0) {
                            Intrinsics.EZpvd((Object) "wallet/referral/affiliates", (Object) str3);
                            throw null;
                        }
                        if (!Intrinsics.EZpvd((Object) "wallet/referral/affiliates", (Object) str3)) {
                            Object obj10 = bundle2.get("ref");
                            String strGEmmrt12 = obj10 != null ? C33129mqd.gEmmrt(obj10) : null;
                            Object obj11 = bundle2.get("shareFrom");
                            if (obj11 != null) {
                                int i18 = aKErDB + 33;
                                dNCPSb = i18 % 128;
                                if (i18 % 2 != 0) {
                                    C33129mqd.gEmmrt(obj11);
                                    throw null;
                                }
                                strGEmmrt4 = C33129mqd.gEmmrt(obj11);
                            } else {
                                strGEmmrt4 = null;
                            }
                            if (strGEmmrt12 != null) {
                                BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(defiWalletMainActivity5), null, null, new DefiWalletMainActivity$dispatchDeepLink$36(str3, defiWalletMainActivity5, strGEmmrt12, strGEmmrt4, null), 3, null);
                            }
                        }
                    }
                }
                return Unit.INSTANCE;
            }
            Bundle bundle7 = (Bundle) defiWalletMainActivity$dispatchDeepLink$1.L$2;
            String str13 = (String) defiWalletMainActivity$dispatchDeepLink$1.L$1;
            defiWalletMainActivity2 = (DefiWalletMainActivity) defiWalletMainActivity$dispatchDeepLink$1.L$0;
            C56391yDq.AEQbTJ(objAwait);
            bundle2 = bundle7;
            str6 = str13;
        }
        AbstractC12782ctV abstractC12782ctV = (AbstractC12782ctV) objAwait;
        Intrinsics.copydefault(abstractC12782ctV);
        if (!(C17922fXg.EZpvd(abstractC12782ctV) instanceof dTK.Application)) {
            defiWalletMainActivity = defiWalletMainActivity2;
            string = bundle2.getString("walletId");
            if (string == null) {
            }
            switch (str6.hashCode()) {
                case -2004777383:
                    break;
                case -1953806314:
                    break;
                case -1916445200:
                    break;
                case -1804684611:
                    break;
                case -1797930095:
                    break;
                case -1603933401:
                    break;
                case -1517177897:
                    break;
                case -1517174370:
                    break;
                case -1516820695:
                    break;
                case -1516729577:
                    break;
                case -1401301710:
                    break;
                case -1334683864:
                    break;
                case -1162691806:
                    break;
                case -1081570747:
                    break;
                case -1018754182:
                    break;
                case -846232267:
                    break;
                case -845914146:
                    break;
                case -839703806:
                    break;
                case -707421078:
                    break;
                case -650071718:
                    break;
                case -555838934:
                    break;
                case -336356339:
                    break;
                case -123383243:
                    break;
                case 321518689:
                    break;
                case 426685680:
                    break;
                case 686096226:
                    break;
                case 732524778:
                    break;
                case 799422631:
                    break;
                case 830976738:
                    break;
                case 1044333140:
                    break;
                case 1186884734:
                    break;
                case 1211302100:
                    break;
                case 1216235799:
                    break;
                case 1342241485:
                    break;
                case 1345449836:
                    break;
                case 1352609767:
                    break;
                case 1437139115:
                    break;
                case 1451764231:
                    break;
                case 1692199635:
                    break;
                case 1695153937:
                    break;
                case 1921609270:
                    break;
            }
        } else {
            C55326xho.toast$default(C13754dXa.FragmentManager.getOnBackPressedDispatcherannotations, (Drawable) null, 0, (Integer) null, 0, 0, 31, (Object) null);
            return Unit.INSTANCE;
        }
    }

    public final void OLrzqt(AbstractC12782ctV abstractC12782ctV) {
        int i = 2 % 2;
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new DefiWalletMainActivity$handleSAAccountCheck$1(abstractC12782ctV, this, null), 3, null);
        int i2 = dNCPSb + 63;
        aKErDB = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    public final void AEQbTJ(final AbstractC12782ctV abstractC12782ctV, Bundle bundle) {
        int i = 2 % 2;
        String string = bundle.getString("origin");
        pUU.KWHzl(getTAG(), "entering deepLinkConnectWallet origin: " + string);
        String host = null;
        WalletConnectUtils instance$default = WalletConnectUtils.ActionBar.getInstance$default(WalletConnectUtils.Companion, null, 1, null);
        String str = this.sSMYrx;
        if (string != null) {
            int i2 = dNCPSb + 5;
            aKErDB = i2 % 128;
            int i3 = i2 % 2;
            host = Uri.parse(string).getHost();
            int i4 = dNCPSb + 31;
            aKErDB = i4 % 128;
            int i5 = i4 % 2;
        }
        instance$default.KWHzl(str, abstractC12782ctV, host, new yHO() { // from class: o.dUi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.yHO
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return DefiWalletMainActivity.AEQbTJ(this.OLrzqt, abstractC12782ctV, ((java.lang.Boolean) obj).booleanValue(), ((java.lang.Integer) obj2).intValue(), (java.lang.String) obj3);
            }
        });
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [2562=4] */
    public static final Unit OLrzqt(DefiWalletMainActivity defiWalletMainActivity, Integer num) throws Throwable {
        int i = 2 % 2;
        if (num != null && num.intValue() == 1) {
            int i2 = aKErDB + 77;
            dNCPSb = i2 % 128;
            int i3 = i2 % 2;
            copydefault(zzep.AEQbTJ(), 503061215, -503061181, new Object[]{defiWalletMainActivity}, zzep.AEQbTJ(), zzep.AEQbTJ(), zzep.AEQbTJ());
        } else if (num != null && num.intValue() == 2) {
            int i4 = aKErDB + 45;
            dNCPSb = i4 % 128;
            if (i4 % 2 != 0) {
                defiWalletMainActivity.moveTaskToBack(false);
            } else {
                defiWalletMainActivity.moveTaskToBack(true);
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [2579=5] */
    public static final Unit EZpvd(final DefiWalletMainActivity defiWalletMainActivity, AbstractC12782ctV abstractC12782ctV, boolean z, int i, String str) throws Throwable {
        int i2 = 2 % 2;
        if (z) {
            pUU.KWHzl(defiWalletMainActivity.getTAG(), "deepLinkConnectWallet - connecting");
            defiWalletMainActivity.QbewEr();
        } else {
            pUU.KWHzl(defiWalletMainActivity.getTAG(), "deepLinkConnectWallet - cannot connect: code " + i + ", msg: " + str);
            copydefault(zzep.AEQbTJ(), 1741421455, -1741421410, new Object[]{defiWalletMainActivity}, zzep.AEQbTJ(), zzep.AEQbTJ(), zzep.AEQbTJ());
            if (i != 1) {
                if (i == 2) {
                    pUU.KWHzl(defiWalletMainActivity.getTAG(), "deepLinkConnectWallet - Current wallet is not backed-up");
                    if (defiWalletMainActivity.getSupportFragmentManager().isStateSaved()) {
                        int i3 = aKErDB + 53;
                        dNCPSb = i3 % 128;
                        if (i3 % 2 != 0) {
                            Unit unit = Unit.INSTANCE;
                            strAuCTel.hashCode();
                            throw null;
                        }
                        Unit unit2 = Unit.INSTANCE;
                        int i4 = aKErDB + 109;
                        dNCPSb = i4 % 128;
                        if (i4 % 2 != 0) {
                            int i5 = 27 / 0;
                        }
                        return unit2;
                    }
                    pUU.KWHzl(defiWalletMainActivity.getTAG(), "deepLinkConnectWallet - Show back-up dialog");
                    try {
                        DefiWalletVReminderDFragment.ActionBar actionBar = DefiWalletVReminderDFragment.Companion;
                        int i6 = C52761wXj.TaskDescription.NRYds;
                        String strAYXKKw = C33070mpX.AYXKKw(C13754dXa.FragmentManager.fmB);
                        String strAYXKKw2 = C33070mpX.AYXKKw(C13754dXa.FragmentManager.DcMfJKDCKfqPDCfLja);
                        AbstractC12784ctX abstractC12784ctXGwTjWJ = abstractC12782ctV.gwTjWJ();
                        strAuCTel = abstractC12784ctXGwTjWJ != null ? abstractC12784ctXGwTjWJ.AuCTel() : null;
                        DefiWalletVReminderDFragment defiWalletVReminderDFragmentEZpvd = actionBar.EZpvd(new DefiWalletVReminderDFragment.ReminderDataBean(i6, null, strAYXKKw, C33069mpW.OLrzqt(strAYXKKw2, C56423yEv.EZpvd(C56390yDp.OLrzqt("AccountName", strAuCTel + "-" + abstractC12782ctV.AkhnZx()))), C33070mpX.AYXKKw(C13754dXa.FragmentManager.scanPackages), "", 2, null));
                        androidx.fragment.app.FragmentManager supportFragmentManager = defiWalletMainActivity.getSupportFragmentManager();
                        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
                        defiWalletVReminderDFragmentEZpvd.AEQbTJ(supportFragmentManager, new Function1() { // from class: o.dVY
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj) {
                                java.lang.Object[] objArr = {this.OLrzqt, (java.lang.Integer) obj};
                                return (Unit) DefiWalletMainActivity.copydefault(zzep.AEQbTJ(), -2118778808, 2118778854, objArr, zzep.AEQbTJ(), zzep.AEQbTJ(), zzep.AEQbTJ());
                            }
                        });
                    } catch (Exception e) {
                        pUU.AEQbTJ(defiWalletMainActivity.getTAG(), "deepLinkConnectWallet - Failed to show back-up dialog", e);
                    }
                } else if (i != 3) {
                    int i7 = aKErDB + 13;
                    dNCPSb = i7 % 128;
                    if (i7 % 2 == 0 ? i == 4 : i == 2) {
                        defiWalletMainActivity.flVtFt().AhwBna().setValue(new C18343fgc(defiWalletMainActivity.sSMYrx, null));
                    }
                } else {
                    WalletConnectUtils.ActionBar.getInstance$default(WalletConnectUtils.Companion, null, 1, null).EZpvd();
                }
            } else if (!(!C33129mqd.OLrzqt((CharSequence) str))) {
                C55326xho.toast$default(str, (Drawable) null, 0, (Integer) null, 0, 0, 31, (Object) null);
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [2586=4] */
    public final void OLrzqt(AbstractC12782ctV abstractC12782ctV, Bundle bundle) {
        int i = 2 % 2;
        int i2 = aKErDB + 121;
        dNCPSb = i2 % 128;
        int i3 = i2 % 2;
        pUU.KWHzl(getTAG(), "entering deepLinkTonConnectWallet");
        String string = bundle.getString("origin");
        if (string == null) {
            int i4 = aKErDB;
            int i5 = i4 + 99;
            dNCPSb = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 62 / 0;
            }
            int i7 = i4 + 49;
            dNCPSb = i7 % 128;
            int i8 = i7 % 2;
            string = "";
        }
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new DefiWalletMainActivity$deepLinkTonConnectWallet$1(this, C16058eck.Activity.getInstance$default(C16058eck.Companion, null, 1, null), abstractC12782ctV, string, bundle, null), 3, null);
    }

    public final void copydefault(AbstractC12782ctV abstractC12782ctV, Bundle bundle) {
        int i = 2 % 2;
        int i2 = aKErDB + 45;
        dNCPSb = i2 % 128;
        int i3 = i2 % 2;
        pUU.KWHzl(getTAG(), "entering deepLinkOkxConnectWallet");
        Object obj = null;
        C15935eaT instance$default = C15935eaT.ActionBar.getInstance$default(C15935eaT.Companion, null, 1, null);
        if (instance$default.AEQbTJ(bundle)) {
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new DefiWalletMainActivity$deepLinkOkxConnectWallet$1(this, bundle, instance$default, abstractC12782ctV, null), 3, null);
            int i4 = aKErDB + 23;
            dNCPSb = i4 % 128;
            if (i4 % 2 == 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
    }

    public static final void AxsJAYaxsJAY(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = aKErDB + 59;
        dNCPSb = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        if (i3 != 0) {
            int i4 = 80 / 0;
        }
        int i5 = aKErDB + 13;
        dNCPSb = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    public static final Unit OLrzqt(DefiWalletMainActivity defiWalletMainActivity, int i, boolean z) {
        int i2 = 2 % 2;
        int i3 = dNCPSb + 109;
        aKErDB = i3 % 128;
        if (i3 % 2 != 0 ? i == 5 : i == 3) {
            ActivityResultLauncher<Context> activityResultLauncherAhwBna = defiWalletMainActivity.AhwBna(z);
            if (activityResultLauncherAhwBna != null) {
                activityResultLauncherAhwBna.launch(defiWalletMainActivity);
                int i4 = dNCPSb + 23;
                aKErDB = i4 % 128;
                int i5 = i4 % 2;
            }
        }
        return Unit.INSTANCE;
    }

    private final void aKErDB() {
        int i = 2 % 2;
        AbstractC58260yxt<AbstractC12782ctV> abstractC58260yxtCopydefault = C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null).copydefault(false);
        final Function1 function1 = new Function1() { // from class: o.dWl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return DefiWalletMainActivity.AYXKKw(this.AEQbTJ, (AbstractC12782ctV) obj);
            }
        };
        InterfaceC58227yxM<? super AbstractC12782ctV> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.dWh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                DefiWalletMainActivity.AxsJAY(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.dWj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return DefiWalletMainActivity.AYXKKw((java.lang.Throwable) obj);
            }
        };
        addDisposable(abstractC58260yxtCopydefault.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.dWk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                DefiWalletMainActivity.OcIXYQ(function12, obj);
            }
        }));
        int i2 = dNCPSb + 99;
        aKErDB = i2 % 128;
        int i3 = i2 % 2;
    }

    public static final Unit ejfBZ(final DefiWalletMainActivity defiWalletMainActivity, AbstractC12782ctV abstractC12782ctV) {
        int i = 2 % 2;
        C21027grx c21027grx = C21027grx.copydefault;
        androidx.fragment.app.FragmentManager supportFragmentManager = defiWalletMainActivity.getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
        c21027grx.OLrzqt(supportFragmentManager, defiWalletMainActivity, defiWalletMainActivity.ORxRYg, abstractC12782ctV.DbNXlk(), (128 & 16) != 0, (128 & 32) != 0 ? false : abstractC12782ctV.QfsBiF(), (128 & 64) != 0, (128 & 128) != 0 ? false : false, (128 & 256) != 0 ? null : new Function2() { // from class: o.dWP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return DefiWalletMainActivity.AEQbTJ(this.OLrzqt, ((java.lang.Integer) obj).intValue(), ((java.lang.Boolean) obj2).booleanValue());
            }
        });
        Unit unit = Unit.INSTANCE;
        int i2 = aKErDB + 45;
        dNCPSb = i2 % 128;
        int i3 = i2 % 2;
        return unit;
    }

    public static final void iZzfmt(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = dNCPSb + 95;
        aKErDB = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = dNCPSb + 95;
        aKErDB = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public static final Unit uzCIH(Throwable th) {
        int i = 2 % 2;
        int i2 = aKErDB + 75;
        dNCPSb = i2 % 128;
        if (i2 % 2 != 0) {
            Unit unit = Unit.INSTANCE;
            throw null;
        }
        Unit unit2 = Unit.INSTANCE;
        int i3 = aKErDB + 29;
        dNCPSb = i3 % 128;
        int i4 = i3 % 2;
        return unit2;
    }

    private static /* synthetic */ Object wlaJM(Object[] objArr) {
        DefiWalletMainActivity defiWalletMainActivity = (DefiWalletMainActivity) objArr[0];
        int i = 2 % 2;
        int i2 = dNCPSb + 79;
        aKErDB = i2 % 128;
        int i3 = i2 % 2;
        if (!C13912dbY.copydefault.gEmmrt()) {
            ActivityC18691fnF.Activity.startActivity$default(ActivityC18691fnF.Companion, defiWalletMainActivity, null, "route_backup_wallet_list", 0, 10, null);
            return null;
        }
        ActivityC18750foL.StateListAnimator.startActivity$default(ActivityC18750foL.Companion, defiWalletMainActivity, null, "route_backup_wallet_list", 0, 10, null);
        int i4 = aKErDB + 117;
        dNCPSb = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    private static /* synthetic */ Object zsXlph(Object[] objArr) {
        DefiWalletMainActivity defiWalletMainActivity = (DefiWalletMainActivity) objArr[0];
        Boolean bool = (Boolean) objArr[1];
        int i = 2 % 2;
        int i2 = aKErDB + 29;
        dNCPSb = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 7 / 0;
            if (!bool.booleanValue()) {
                return null;
            }
        } else if (!bool.booleanValue()) {
            return null;
        }
        defiWalletMainActivity.djBIcL(false);
        int i4 = dNCPSb + 65;
        aKErDB = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    private static /* synthetic */ Object OLrzqt(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        Object obj = objArr[1];
        int i = 2 % 2;
        int i2 = aKErDB + 119;
        dNCPSb = i2 % 128;
        int i3 = i2 % 2;
        Object obj2 = null;
        function1.invoke(obj);
        if (i3 != 0) {
            obj2.hashCode();
            throw null;
        }
        int i4 = aKErDB + 63;
        dNCPSb = i4 % 128;
        if (i4 % 2 == 0) {
            return null;
        }
        obj2.hashCode();
        throw null;
    }

    public static final void OqFWZa(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = dNCPSb + 71;
        aKErDB = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = aKErDB + 33;
        dNCPSb = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 25 / 0;
        }
    }

    private final void djBIcL(final boolean z) {
        int i = 2 % 2;
        AbstractC58260yxt<AbstractC12782ctV> abstractC58260yxtCopydefault = C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null).copydefault(false);
        final Function1 function1 = new Function1() { // from class: o.dVU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return DefiWalletMainActivity.EZpvd(this.KWHzl, z, (AbstractC12782ctV) obj);
            }
        };
        InterfaceC58227yxM<? super AbstractC12782ctV> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.dVV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) throws java.lang.Throwable {
                java.lang.Object[] objArr = {function1, obj};
                DefiWalletMainActivity.copydefault(zzep.AEQbTJ(), -735479228, 735479238, objArr, zzep.AEQbTJ(), zzep.AEQbTJ(), zzep.AEQbTJ());
            }
        };
        final Function1 function12 = new Function1() { // from class: o.dVS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return DefiWalletMainActivity.EZpvd((java.lang.Throwable) obj);
            }
        };
        addDisposable(abstractC58260yxtCopydefault.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.dVZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                DefiWalletMainActivity.isConnected(function12, obj);
            }
        }));
        int i2 = dNCPSb + 3;
        aKErDB = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    public static final Unit getFieldNames(Throwable th) {
        int i = 2 % 2;
        int i2 = aKErDB + 103;
        dNCPSb = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = Unit.INSTANCE;
        int i4 = dNCPSb + 9;
        aKErDB = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(final Function0<Unit> function0) {
        int i = 2 % 2;
        this.fetchVPNInfo.postDelayed(new Runnable() { // from class: o.dWC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                DefiWalletMainActivity.OLrzqt(function0);
            }
        }, 500L);
        int i2 = dNCPSb + 97;
        aKErDB = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    public static final void KWHzl(Function0 function0) {
        int i = 2 % 2;
        int i2 = aKErDB + 109;
        dNCPSb = i2 % 128;
        int i3 = i2 % 2;
        function0.invoke();
        if (i3 != 0) {
            throw null;
        }
    }

    private static /* synthetic */ Object copydefault(Object[] objArr) {
        Function2 function2 = (Function2) objArr[0];
        Object obj = objArr[1];
        Object obj2 = objArr[2];
        int i = 2 % 2;
        int i2 = dNCPSb + 37;
        aKErDB = i2 % 128;
        int i3 = i2 % 2;
        function2.invoke(obj, obj2);
        int i4 = aKErDB + 31;
        dNCPSb = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(final int i) {
        BottomNavigationView bottomNavigationView;
        int i2 = 2 % 2;
        int i3 = dNCPSb + 83;
        aKErDB = i3 % 128;
        int i4 = i3 % 2;
        C16325ehm c16325ehm = this.zLjUOn;
        if (c16325ehm == null || (bottomNavigationView = c16325ehm.OLrzqt) == null || bottomNavigationView.getSelectedItemId() != i) {
            Map<MenuItem, Integer> map = this.AuCTel;
            final Function2 function2 = new Function2() { // from class: o.dUy
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return DefiWalletMainActivity.KWHzl(i, this, (android.view.MenuItem) obj, (java.lang.Integer) obj2);
                }
            };
            map.forEach(new BiConsumer() { // from class: o.dUz
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.util.function.BiConsumer
                public final void accept(java.lang.Object obj, java.lang.Object obj2) throws java.lang.Throwable {
                    DefiWalletMainActivity.AEQbTJ(function2, obj, obj2);
                }
            });
        } else {
            int i5 = dNCPSb + 23;
            aKErDB = i5 % 128;
            if (i5 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static /* synthetic */ Object QUSxYX(Object[] objArr) {
        int iIntValue = ((Number) objArr[0]).intValue();
        DefiWalletMainActivity defiWalletMainActivity = (DefiWalletMainActivity) objArr[1];
        MenuItem menuItem = (MenuItem) objArr[2];
        Integer num = (Integer) objArr[3];
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(menuItem, "");
        Intrinsics.checkNotNullParameter(num, "");
        if (menuItem.getItemId() != iIntValue) {
            Unit unit = Unit.INSTANCE;
            int i2 = dNCPSb + 97;
            aKErDB = i2 % 128;
            if (i2 % 2 != 0) {
                return unit;
            }
            throw null;
        }
        int i3 = dNCPSb + 59;
        int i4 = i3 % 128;
        aKErDB = i4;
        int i5 = i3 % 2;
        defiWalletMainActivity.uzCIH = false;
        C16325ehm c16325ehm = defiWalletMainActivity.zLjUOn;
        if (c16325ehm != null) {
            int i6 = i4 + 37;
            dNCPSb = i6 % 128;
            int i7 = i6 % 2;
            BottomNavigationView bottomNavigationView = c16325ehm.OLrzqt;
            if (bottomNavigationView != null) {
                bottomNavigationView.setSelectedItemId(iIntValue);
                int i8 = dNCPSb + 107;
                aKErDB = i8 % 128;
                int i9 = i8 % 2;
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [2851=4] */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        boolean z;
        int i3 = 2 % 2;
        super.onActivityResult(i, i2, intent);
        androidx.fragment.app.Fragment newProxyInstance = getNewProxyInstance();
        if (newProxyInstance != null) {
            newProxyInstance.onActivityResult(i, i2, intent);
            int i4 = aKErDB + 51;
            dNCPSb = i4 % 128;
            int i5 = i4 % 2;
        }
        if (EZpvd) {
            int i6 = aKErDB + 83;
            dNCPSb = i6 % 128;
            if (i6 % 2 != 0) {
                z = true;
                this.zuBGHE = true;
            } else {
                z = false;
                this.zuBGHE = false;
            }
            getIntent().putExtra("show", z);
            EZpvd = z;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.business.defi.wallet.common.WalletConnectUtils.StateListAnimator
    public void copydefault(@NotNull String str, @NotNull String str2) throws Throwable {
        int i = 2 % 2;
        int i2 = dNCPSb + 123;
        aKErDB = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        WalletConnectUtils.StateListAnimator.Activity.copydefault(this, str, str2);
        copydefault(zzep.AEQbTJ(), 1741421455, -1741421410, new Object[]{this}, zzep.AEQbTJ(), zzep.AEQbTJ(), zzep.AEQbTJ());
        if (C33129mqd.OLrzqt((CharSequence) this.sSMYrx)) {
            flVtFt().AhwBna().setValue(new C18343fgc(this.sSMYrx, new WcConnectExtra(str, str2)));
            int i4 = dNCPSb + 37;
            aKErDB = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    public static final void DarRvM(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = aKErDB + 95;
        dNCPSb = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        if (i3 == 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public static final void DCJXGO(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = dNCPSb + 95;
        aKErDB = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        if (i3 == 0) {
            int i4 = 43 / 0;
        }
        int i5 = dNCPSb + 9;
        aKErDB = i5 % 128;
        int i6 = i5 % 2;
    }

    public static final Unit fARcdN(DefiWalletMainActivity defiWalletMainActivity, AbstractC12782ctV abstractC12782ctV) {
        int i = 2 % 2;
        int i2 = dNCPSb + 109;
        aKErDB = i2 % 128;
        int i3 = i2 % 2;
        List<WCSessionMeta> listAhwBna = WalletConnectUtils.ActionBar.getInstance$default(WalletConnectUtils.Companion, null, 1, null).AhwBna(abstractC12782ctV.DbNXlk());
        if (listAhwBna == null || listAhwBna.isEmpty()) {
            defiWalletMainActivity.flVtFt().copydefault().setValue(4);
            int i4 = dNCPSb + 55;
            aKErDB = i4 % 128;
            int i5 = i4 % 2;
        }
        return Unit.INSTANCE;
    }

    public static final Unit getNewProxyInstance(Throwable th) {
        int i = 2 % 2;
        int i2 = aKErDB + 49;
        dNCPSb = i2 % 128;
        if (i2 % 2 != 0) {
            Unit unit = Unit.INSTANCE;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unit2 = Unit.INSTANCE;
        int i3 = aKErDB + 119;
        dNCPSb = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 97 / 0;
        }
        return unit2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.business.defi.wallet.common.WalletConnectUtils.StateListAnimator
    public void KWHzl(@NotNull String str, boolean z) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        WalletConnectUtils.StateListAnimator.Activity.AEQbTJ(this, str, z);
        AbstractC58260yxt<AbstractC12782ctV> abstractC58260yxtCopydefault = C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null).copydefault(false);
        final Function1 function1 = new Function1() { // from class: o.dWD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return DefiWalletMainActivity.EZpvd(this.KWHzl, (AbstractC12782ctV) obj);
            }
        };
        InterfaceC58227yxM<? super AbstractC12782ctV> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.dWK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                DefiWalletMainActivity.QKVWgx(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.dWH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return (Unit) DefiWalletMainActivity.copydefault(zzep.AEQbTJ(), -841861264, 841861271, new java.lang.Object[]{(java.lang.Throwable) obj}, zzep.AEQbTJ(), zzep.AEQbTJ(), zzep.AEQbTJ());
            }
        };
        addDisposable(abstractC58260yxtCopydefault.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.dWI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                DefiWalletMainActivity.copydefault(function12, obj);
            }
        }));
        int i2 = dNCPSb + 49;
        aKErDB = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.okinc.business.defi.wallet.common.WalletConnectUtils.StateListAnimator
    public void OLrzqt(String str) throws Throwable {
        Drawable drawable;
        int i;
        Integer num;
        int i2;
        int i3;
        int i4;
        int i5 = 2 % 2;
        int i6 = aKErDB;
        int i7 = i6 + WalletImportError.ERROR_CODE_GET_EOA_ADDRESS_KEY;
        dNCPSb = i7 % 128;
        if (i7 % 2 == 0) {
            if (str != null) {
                int i8 = i6 + 11;
                dNCPSb = i8 % 128;
                if (i8 % 2 != 0) {
                    drawable = null;
                    i = 1;
                    num = null;
                    i2 = 1;
                    i3 = 1;
                    i4 = 98;
                } else {
                    drawable = null;
                    i = 0;
                    num = null;
                    i2 = 0;
                    i3 = 0;
                    i4 = 31;
                }
                C55326xho.toast$default(str, drawable, i, num, i2, i3, i4, (Object) null);
            }
            flVtFt().copydefault().setValue(5);
            copydefault(zzep.AEQbTJ(), 1741421455, -1741421410, new Object[]{this}, zzep.AEQbTJ(), zzep.AEQbTJ(), zzep.AEQbTJ());
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.business.defi.wallet.common.WalletConnectUtils.StateListAnimator
    public void AEQbTJ(@NotNull ShowWCAuthRequestArgs showWCAuthRequestArgs) throws Throwable {
        WalletConnectUtils.ActionBar actionBar;
        int i;
        int i2 = 2 % 2;
        int i3 = dNCPSb + 21;
        aKErDB = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(showWCAuthRequestArgs, "");
            copydefault(zzep.AEQbTJ(), 1741421455, -1741421410, new Object[]{this}, zzep.AEQbTJ(), zzep.AEQbTJ(), zzep.AEQbTJ());
            actionBar = WalletConnectUtils.Companion;
            i = 0;
        } else {
            Intrinsics.checkNotNullParameter(showWCAuthRequestArgs, "");
            copydefault(zzep.AEQbTJ(), 1741421455, -1741421410, new Object[]{this}, zzep.AEQbTJ(), zzep.AEQbTJ(), zzep.AEQbTJ());
            actionBar = WalletConnectUtils.Companion;
            i = 1;
        }
        WalletConnectUtils.ActionBar.getInstance$default(actionBar, null, i, null).copydefault(this, showWCAuthRequestArgs);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        int i2 = 2 % 2;
        int i3 = dNCPSb + 101;
        aKErDB = i3 % 128;
        int i4 = i3 % 2;
        boolean zOnKeyDown = super.onKeyDown(i, keyEvent);
        int i5 = aKErDB + 123;
        dNCPSb = i5 % 128;
        int i6 = i5 % 2;
        return zOnKeyDown;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void QUSxYX() {
        int i = 2 % 2;
        int i2 = dNCPSb + 37;
        aKErDB = i2 % 128;
        if (i2 % 2 == 0) {
            ((Boolean) C33084mpl.OLrzqt("wallet_show_error_address_dialog", Boolean.TRUE)).booleanValue();
            throw null;
        }
        if (((Boolean) C33084mpl.OLrzqt("wallet_show_error_address_dialog", Boolean.TRUE)).booleanValue()) {
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new DefiWalletMainActivity$showEaterAddressDialogIfNeeded$1("wallet_show_error_address_dialog", this, null), 3, null);
            int i3 = dNCPSb + 115;
            aKErDB = i3 % 128;
            if (i3 % 2 == 0) {
                throw null;
            }
        }
    }

    @Override // o.AbstractActivityC13756dXc, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        int i = 2 % 2;
        int i2 = dNCPSb + 53;
        aKErDB = i2 % 128;
        try {
            if (i2 % 2 == 0) {
                super.onStart();
                int i3 = 91 / 0;
            } else {
                super.onStart();
            }
        } catch (WindowManager.BadTokenException e) {
            pUU.AEQbTJ(getTAG(), "BadTokenException in onStart(), isFinishing=" + isFinishing() + ", isDestroyed=" + isDestroyed() + ", state=" + getLifecycle().getCurrentState(), e);
        } catch (IllegalStateException e2) {
            String message = e2.getMessage();
            if (message != null && StringsKt__StringsKt.contains$default((CharSequence) message, (CharSequence) "has already been added to the window manager.", false, 2, (Object) null)) {
                throw new IllegalStateException("FragmentInfo:", e2);
            }
            throw e2;
        }
        pUU.EZpvd(getTAG(), "onStart");
        C32805mkX.EZpvd.OLrzqt(this);
        int i4 = dNCPSb + 121;
        aKErDB = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 94 / 0;
        }
    }

    private static /* synthetic */ Object AxsJAY(Object[] objArr) {
        ((Boolean) objArr[0]).booleanValue();
        int i = 2 % 2;
        int i2 = dNCPSb + 41;
        aKErDB = i2 % 128;
        if (i2 % 2 == 0) {
            Unit unit = Unit.INSTANCE;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unit2 = Unit.INSTANCE;
        int i3 = aKErDB + 39;
        dNCPSb = i3 % 128;
        int i4 = i3 % 2;
        return unit2;
    }

    private static /* synthetic */ Object uzCIH(Object[] objArr) {
        ((Boolean) objArr[0]).booleanValue();
        int i = 2 % 2;
        int i2 = dNCPSb + 103;
        aKErDB = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = Unit.INSTANCE;
        int i4 = aKErDB + 11;
        dNCPSb = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    public static final Unit gEmmrt(boolean z) {
        int i = 2 % 2;
        int i2 = dNCPSb + 117;
        aKErDB = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = Unit.INSTANCE;
        int i4 = aKErDB + 91;
        dNCPSb = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [2980=5, 2982=4] */
    @Override // o.AbstractActivityC13756dXc, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        int i = 2 % 2;
        pUU.EZpvd(getTAG(), "onDestroy");
        SubHelper.AEQbTJ(this.getFieldNames);
        C11205cFp.EZpvd.DTwDnp().OLrzqt(this.gHZMYf);
        C12806ctt.copydefault.EZpvd(false);
        Object obj = null;
        this.fetchVPNInfo.removeCallbacksAndMessages(null);
        List listKWHzl = C43251rlk.KWHzl(C56524yIo.AEQbTJ(InterfaceC9773bbs.class));
        if (listKWHzl != null) {
            int i2 = aKErDB + 99;
            dNCPSb = i2 % 128;
            if (i2 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            InterfaceC9773bbs interfaceC9773bbs = (InterfaceC9773bbs) CollectionsKt___CollectionsKt.AuCTelauCTel(listKWHzl);
            if (interfaceC9773bbs != null) {
                interfaceC9773bbs.EZpvd();
                int i3 = aKErDB + 3;
                dNCPSb = i3 % 128;
                int i4 = i3 % 2;
            }
        }
        ((MpcWalletService) C43251rlk.copydefault(MpcWalletService.class)).KWHzl(new Function1() { // from class: o.dWe
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj2) {
                return DefiWalletMainActivity.copydefault(((java.lang.Boolean) obj2).booleanValue());
            }
        });
        ((MpcWalletService) C43251rlk.copydefault(MpcWalletService.class)).AEQbTJ(new Function1() { // from class: o.dWc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj2) {
                return DefiWalletMainActivity.EZpvd(((java.lang.Boolean) obj2).booleanValue());
            }
        });
        ((MpcWalletService) C43251rlk.copydefault(MpcWalletService.class)).copydefault(new Function1() { // from class: o.dWg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj2) {
                return DefiWalletMainActivity.KWHzl(((java.lang.Boolean) obj2).booleanValue());
            }
        });
        yHO<? super AbstractActivityC33041mov, ? super IWebActivityAPI, ? super WebShareInfo, Unit> yho = this.OcIXYQ;
        if (yho != null) {
            C57309yfw.AEQbTJ.EZpvd(yho);
        }
        C18199fdr c18199fdr = this.djBIcL;
        if (c18199fdr != null) {
            c18199fdr.KWHzl();
        }
        super.onDestroy();
        Iterator<T> it = hDKMBd().iterator();
        while (it.hasNext()) {
            int i5 = dNCPSb + 69;
            aKErDB = i5 % 128;
            if (i5 % 2 == 0) {
                ((InterfaceC9770bbp) it.next()).KWHzl(this);
                throw null;
            }
            ((InterfaceC9770bbp) it.next()).KWHzl(this);
        }
        C15714eSo.Companion.AEQbTJ();
        InterfaceC58217yxC interfaceC58217yxC = this.values;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean ORxRYg() {
        long jLongValue;
        int i = 2 % 2;
        if (this.hDKMBd == null) {
            this.hDKMBd = Long.valueOf(System.currentTimeMillis());
            C55326xho.toast$default(C33070mpX.AYXKKw(C33238msg.Application.OLrzqt), (Drawable) null, 0, (Integer) null, 0, 0, 31, (Object) null);
            int i2 = aKErDB + 27;
            dNCPSb = i2 % 128;
            int i3 = i2 % 2;
        } else {
            long jCurrentTimeMillis = System.currentTimeMillis();
            Long l = this.hDKMBd;
            if (l != null) {
                jLongValue = l.longValue();
            } else {
                int i4 = dNCPSb + 25;
                aKErDB = i4 % 128;
                int i5 = i4 % 2;
                jLongValue = 0;
            }
            if (jCurrentTimeMillis - jLongValue < 3000) {
                int i6 = dNCPSb + 85;
                aKErDB = i6 % 128;
                int i7 = i6 % 2;
                return true;
            }
            C55326xho.toast$default(C33070mpX.AYXKKw(C33238msg.Application.OLrzqt), (Drawable) null, 0, (Integer) null, 0, 0, 31, (Object) null);
            this.hDKMBd = Long.valueOf(System.currentTimeMillis());
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final androidx.fragment.app.Fragment getNewProxyInstance() {
        androidx.fragment.app.Fragment fragmentOLrzqt;
        int i = 2 % 2;
        C18199fdr c18199fdr = this.djBIcL;
        if (c18199fdr != null) {
            int i2 = aKErDB + 77;
            dNCPSb = i2 % 128;
            if (i2 % 2 != 0) {
                c18199fdr.OLrzqt(this.AYXKKw);
                throw null;
            }
            fragmentOLrzqt = c18199fdr.OLrzqt(this.AYXKKw);
        } else {
            fragmentOLrzqt = null;
        }
        int i3 = aKErDB + 59;
        dNCPSb = i3 % 128;
        if (i3 % 2 == 0) {
            return fragmentOLrzqt;
        }
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [3032=5] */
    @Override // o.AbstractActivityC13756dXc, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        int i = 2 % 2;
        try {
            super.onPause();
            int i2 = aKErDB + 101;
            dNCPSb = i2 % 128;
            int i3 = i2 % 2;
        } catch (Exception e) {
            if (e instanceof ConcurrentModificationException) {
                StringBuilder sb = new StringBuilder("");
                try {
                    List<androidx.fragment.app.Fragment> fragments = getSupportFragmentManager().getFragments();
                    Intrinsics.checkNotNullExpressionValue(fragments, "");
                    Iterator<T> it = fragments.iterator();
                    int i4 = dNCPSb + 65;
                    aKErDB = i4 % 128;
                    int i5 = i4 % 2;
                    while (!(!it.hasNext())) {
                        sb.append(((androidx.fragment.app.Fragment) it.next()).toString());
                    }
                } catch (Exception e2) {
                    pUU.copydefault(getTAG(), e2.toString());
                }
                C6777aVl.Companion.OLrzqt(e, C56423yEv.EZpvd(C56390yDp.OLrzqt("Fragments", sb.toString())), Boolean.TRUE);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [3044=4] */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0028 A[PHI: r1
  0x0028: PHI (r1v10 o.ewg) = (r1v9 o.ewg), (r1v12 o.ewg) binds: [B:10:0x0026, B:7:0x0021] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void QbewEr() {
        C17114ewg c17114ewg;
        int i = 2 % 2;
        pUU.KWHzl(getTAG(), "showLoadingWithWeb3Logo");
        C16325ehm c16325ehm = this.zLjUOn;
        if (c16325ehm != null) {
            int i2 = dNCPSb + 5;
            aKErDB = i2 % 128;
            if (i2 % 2 == 0) {
                c17114ewg = c16325ehm.EZpvd;
                int i3 = 62 / 0;
                if (c17114ewg != null) {
                    RelativeLayout root = c17114ewg.getRoot();
                    if (root != null) {
                        int i4 = aKErDB + 85;
                        dNCPSb = i4 % 128;
                        int i5 = i4 % 2;
                        root.setVisibility(0);
                    }
                }
            } else {
                c17114ewg = c16325ehm.EZpvd;
                if (c17114ewg != null) {
                }
            }
        }
        C16325ehm c16325ehm2 = this.zLjUOn;
        if (c16325ehm2 != null) {
            int i6 = dNCPSb + 61;
            aKErDB = i6 % 128;
            int i7 = i6 % 2;
            C17114ewg c17114ewg2 = c16325ehm2.EZpvd;
            if (i7 == 0) {
                int i8 = 76 / 0;
                if (c17114ewg2 != null) {
                    C55113xdn c55113xdn = c17114ewg2.OLrzqt;
                    if (c55113xdn != null) {
                        int i9 = aKErDB + 45;
                        dNCPSb = i9 % 128;
                        int i10 = i9 % 2;
                        c55113xdn.playAnimation();
                        if (i10 != 0) {
                            Object obj = null;
                            obj.hashCode();
                            throw null;
                        }
                    }
                }
            } else if (c17114ewg2 != null) {
            }
        }
        int i11 = dNCPSb + 75;
        aKErDB = i11 % 128;
        if (i11 % 2 == 0) {
            int i12 = 39 / 0;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [3048=5] */
    private static /* synthetic */ Object QKVWgx(Object[] objArr) {
        C17114ewg c17114ewg;
        C17114ewg c17114ewg2;
        DefiWalletMainActivity defiWalletMainActivity = (DefiWalletMainActivity) objArr[0];
        int i = 2 % 2;
        int i2 = dNCPSb + 45;
        aKErDB = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            pUU.KWHzl(defiWalletMainActivity.getTAG(), "dismissLoadingWithWeb3Logo");
            C16325ehm c16325ehm = defiWalletMainActivity.zLjUOn;
            obj.hashCode();
            throw null;
        }
        pUU.KWHzl(defiWalletMainActivity.getTAG(), "dismissLoadingWithWeb3Logo");
        C16325ehm c16325ehm2 = defiWalletMainActivity.zLjUOn;
        if (c16325ehm2 != null && (c17114ewg2 = c16325ehm2.EZpvd) != null) {
            int i3 = dNCPSb + 59;
            aKErDB = i3 % 128;
            if (i3 % 2 == 0) {
                c17114ewg2.getRoot();
                throw null;
            }
            RelativeLayout root = c17114ewg2.getRoot();
            if (root != null) {
                root.setVisibility(8);
                int i4 = dNCPSb + 67;
                aKErDB = i4 % 128;
                int i5 = i4 % 2;
            }
        }
        C16325ehm c16325ehm3 = defiWalletMainActivity.zLjUOn;
        if (c16325ehm3 != null && (c17114ewg = c16325ehm3.EZpvd) != null) {
            int i6 = aKErDB + 119;
            dNCPSb = i6 % 128;
            int i7 = i6 % 2;
            C55113xdn c55113xdn = c17114ewg.OLrzqt;
            if (c55113xdn != null) {
                c55113xdn.cancelAnimation();
            }
        }
        int i8 = aKErDB + 67;
        dNCPSb = i8 % 128;
        int i9 = i8 % 2;
        return null;
    }

    private static /* synthetic */ Object fIwbmz(Object[] objArr) {
        VerifyDAppDomainUrlResponse verifyDAppDomainUrlResponse = (VerifyDAppDomainUrlResponse) objArr[0];
        Application application = (Application) objArr[1];
        String str = (String) objArr[2];
        int i = 2 % 2;
        int i2 = dNCPSb + WalletImportError.ERROR_CODE_HARDWARE_ACCOUNT_EXIST;
        aKErDB = i2 % 128;
        int i3 = i2 % 2;
        if (Intrinsics.EZpvd((Object) verifyDAppDomainUrlResponse.getNewLevel(), (Object) VerifyDAppDomainUrlResponse.LEVEL_HIGH)) {
            int i4 = dNCPSb + 115;
            aKErDB = i4 % 128;
            if (i4 % 2 != 0) {
                application.KWHzl(str);
            } else {
                application.KWHzl(str);
                throw null;
            }
        }
        return Unit.INSTANCE;
    }

    public final void EZpvd(Bundle bundle, final String str, AbstractC43419rot<VerifyDAppDomainUrlResponse, OKServerException> abstractC43419rot, final Application application) {
        int i = 2 % 2;
        if (abstractC43419rot.EZpvd()) {
            int i2 = dNCPSb + 119;
            aKErDB = i2 % 128;
            int i3 = i2 % 2;
            final VerifyDAppDomainUrlResponse verifyDAppDomainUrlResponseCopydefault = abstractC43419rot.copydefault();
            if (verifyDAppDomainUrlResponseCopydefault != null) {
                int i4 = dNCPSb + 65;
                aKErDB = i4 % 128;
                if (i4 % 2 != 0 ? verifyDAppDomainUrlResponseCopydefault.getHasRisk() : verifyDAppDomainUrlResponseCopydefault.getHasRisk()) {
                    C14326djO.ActionBar actionBar = C14326djO.Companion;
                    String newLevel = verifyDAppDomainUrlResponseCopydefault.getNewLevel();
                    if (newLevel == null) {
                        int i5 = dNCPSb + 5;
                        aKErDB = i5 % 128;
                        int i6 = i5 % 2;
                        newLevel = "";
                    }
                    String rule = verifyDAppDomainUrlResponseCopydefault.getRule();
                    if (rule == null) {
                        rule = "";
                    }
                    C14326djO c14326djOKWHzl = actionBar.KWHzl(newLevel, str, rule, new Function0() { // from class: o.dVc
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return DefiWalletMainActivity.AEQbTJ(verifyDAppDomainUrlResponseCopydefault, application, str);
                        }
                    });
                    androidx.fragment.app.FragmentManager supportFragmentManager = getSupportFragmentManager();
                    Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
                    c14326djOKWHzl.show(supportFragmentManager);
                    return;
                }
            }
        }
        application.KWHzl(str);
    }

    public final void copydefault(String str, String str2, WalletCefiBindingService.Source source, String str3, String str4) {
        int i = 2 % 2;
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new DefiWalletMainActivity$handleCeFiWalletBinding$1(this, str, str2, source, str3, str4, null), 3, null);
        int i2 = dNCPSb + 89;
        aKErDB = i2 % 128;
        int i3 = i2 % 2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final WindowInsetsCompat OLrzqt(C16325ehm c16325ehm, View view, WindowInsetsCompat windowInsetsCompat) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(windowInsetsCompat, "");
        Insets insets = windowInsetsCompat.getInsets(WindowInsetsCompat.Type.navigationBars());
        Intrinsics.checkNotNullExpressionValue(insets, "");
        view.setPadding(insets.left, insets.top, insets.right, 0);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        }
        int i2 = aKErDB + 123;
        dNCPSb = i2 % 128;
        Object obj = null;
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
        if (i2 % 2 != 0) {
            layoutParams2.bottomMargin = insets.bottom;
            view.setLayoutParams(layoutParams2);
            FragmentContainerView fragmentContainerView = c16325ehm.copydefault;
            Intrinsics.checkNotNullExpressionValue(fragmentContainerView, "");
            fragmentContainerView.getLayoutParams();
            obj.hashCode();
            throw null;
        }
        layoutParams2.bottomMargin = insets.bottom;
        view.setLayoutParams(layoutParams2);
        FragmentContainerView fragmentContainerView2 = c16325ehm.copydefault;
        Intrinsics.checkNotNullExpressionValue(fragmentContainerView2, "");
        ViewGroup.LayoutParams layoutParams3 = fragmentContainerView2.getLayoutParams();
        if (layoutParams3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        }
        FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) layoutParams3;
        layoutParams4.bottomMargin = insets.bottom;
        fragmentContainerView2.setLayoutParams(layoutParams4);
        int i3 = aKErDB + 91;
        dNCPSb = i3 % 128;
        if (i3 % 2 == 0) {
            return windowInsetsCompat;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final List EZpvd(List list) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(list, "");
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            int i2 = aKErDB + 121;
            dNCPSb = i2 % 128;
            Object obj = null;
            if (i2 % 2 != 0) {
                ((AbstractC12782ctV) it.next()).QwvEab();
                WalletType walletType = WalletType.MPCWallet;
                obj.hashCode();
                throw null;
            }
            Object next = it.next();
            AbstractC12782ctV abstractC12782ctV = (AbstractC12782ctV) next;
            if (abstractC12782ctV.QwvEab() == WalletType.MPCWallet) {
                int i3 = aKErDB + 99;
                dNCPSb = i3 % 128;
                int i4 = i3 % 2;
                if (abstractC12782ctV.zLjUOn()) {
                    continue;
                } else {
                    int i5 = aKErDB + 35;
                    dNCPSb = i5 % 128;
                    int i6 = i5 % 2;
                    arrayList.add(next);
                    if (i6 != 0) {
                        throw null;
                    }
                }
            }
        }
        return arrayList;
    }

    static void RJOkX() {
        QfsBiF = new char[]{62482, 62469, 62495, 62465, 62468, 62490, 62917, 62464, 62496, 62474, 62479, 62494, 62470, 62512, 62471, 62480, 62488, 62467, 62497, 62514, 62477, 62511, 62491, 62478, 62489, 62492, 62523, 62924, 62481, 62922, 62925, 62927, 62923, 62493, 62926, 62915, 62914, 62912, 62913};
        RcXXUw = 585627123;
        UeEOUB = true;
        djSkpj = true;
    }

    @Override // o.AbstractActivityC13756dXc, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        int i = 2 % 2;
        int i2 = aKErDB + 95;
        dNCPSb = i2 % 128;
        int i3 = i2 % 2;
        super.onResume();
        int i4 = aKErDB + 9;
        dNCPSb = i4 % 128;
        int i5 = i4 % 2;
    }

    public final Object copydefault(Bundle bundle, Continuation<? super Pair<String, ? extends AbstractC43419rot<VerifyDAppDomainUrlResponse, OKServerException>>> continuation) {
        return copydefault(zzep.AEQbTJ(), 1346353819, -1346353765, new Object[]{this, bundle, continuation}, zzep.AEQbTJ(), zzep.AEQbTJ(), zzep.AEQbTJ());
    }

    public final void QOLQEE() throws Throwable {
        copydefault(zzep.AEQbTJ(), 804299444, -804299375, new Object[]{this}, zzep.AEQbTJ(), zzep.AEQbTJ(), zzep.AEQbTJ());
    }

    public final void OcIXYQ() throws Throwable {
        copydefault(zzep.AEQbTJ(), -1274408994, 1274409036, new Object[]{this}, zzep.AEQbTJ(), zzep.AEQbTJ(), zzep.AEQbTJ());
    }

    public final void QKVWgx() throws Throwable {
        copydefault(zzep.AEQbTJ(), 503061215, -503061181, new Object[]{this}, zzep.AEQbTJ(), zzep.AEQbTJ(), zzep.AEQbTJ());
    }

    public final void OLrzqt(Bundle bundle) throws Throwable {
        copydefault(UDOKMarketReferralView.Application.OLrzqt(), -1148523523, 1148523550, new Object[]{this, bundle}, UDOKMarketReferralView.Application.OLrzqt(), zzep.AEQbTJ(), UDOKMarketReferralView.Application.OLrzqt());
    }

    public final String EZpvd(Intent intent) {
        return (String) copydefault(zzep.AEQbTJ(), 1125100792, -1125100726, new Object[]{this, intent}, UDOKMarketReferralView.Application.OLrzqt(), UDOKMarketReferralView.Application.OLrzqt(), UDOKMarketReferralView.Application.OLrzqt());
    }

    public final List<InterfaceC18198fdq> AuCTelauCTel() {
        return (List) copydefault(zzep.AEQbTJ(), 959873406, -959873363, new Object[]{this}, zzep.AEQbTJ(), zzep.AEQbTJ(), zzep.AEQbTJ());
    }

    public final void AuCTel() throws Throwable {
        copydefault(zzep.AEQbTJ(), 1741421455, -1741421410, new Object[]{this}, zzep.AEQbTJ(), zzep.AEQbTJ(), zzep.AEQbTJ());
    }

    public final void OLrzqt(List<? extends InterfaceC18198fdq> list) throws Throwable {
        copydefault(zzep.AEQbTJ(), 365413784, -365413761, new Object[]{this, list}, zzep.AEQbTJ(), zzep.AEQbTJ(), zzep.AEQbTJ());
    }

    public static final void KWHzl(Integer num) throws Throwable {
        copydefault(zzep.AEQbTJ(), 230090860, -230090851, new Object[]{num}, zzep.AEQbTJ(), zzep.AEQbTJ(), zzep.AEQbTJ());
    }

    public static final Unit valueOf(boolean z) {
        Object[] objArr = {Boolean.valueOf(z)};
        return (Unit) copydefault(zzep.AEQbTJ(), 1428798180, -1428798150, objArr, zzep.AEQbTJ(), zzep.AEQbTJ(), zzep.AEQbTJ());
    }

    public static final Unit OLrzqt(boolean z) {
        Object[] objArr = {Boolean.valueOf(z)};
        return (Unit) copydefault(zzep.AEQbTJ(), 1349411091, -1349411053, objArr, zzep.AEQbTJ(), zzep.AEQbTJ(), zzep.AEQbTJ());
    }

    public static final void RlQdEF(Function1 function1, Object obj) throws Throwable {
        copydefault(zzep.AEQbTJ(), 717357818, -717357813, new Object[]{function1, obj}, zzep.AEQbTJ(), zzep.AEQbTJ(), zzep.AEQbTJ());
    }

    public static final Unit KWHzl(DefiWalletMainActivity defiWalletMainActivity, boolean z, AbstractC12782ctV abstractC12782ctV) {
        Object[] objArr = {defiWalletMainActivity, Boolean.valueOf(z), abstractC12782ctV};
        return (Unit) copydefault(zzep.AEQbTJ(), -256502746, 256502797, objArr, zzep.AEQbTJ(), zzep.AEQbTJ(), zzep.AEQbTJ());
    }

    public static final Unit EZpvd(DefiWalletMainActivity defiWalletMainActivity, Function0 function0, Unit unit) {
        return (Unit) copydefault(zzep.AEQbTJ(), -1184429084, 1184429137, new Object[]{defiWalletMainActivity, function0, unit}, zzep.AEQbTJ(), zzep.AEQbTJ(), zzep.AEQbTJ());
    }

    public static final List fIwbmz() {
        return (List) copydefault(zzep.AEQbTJ(), -1833868434, 1833868481, new Object[0], zzep.AEQbTJ(), zzep.AEQbTJ(), zzep.AEQbTJ());
    }

    public static final List DbNXlk() {
        return (List) copydefault(zzep.AEQbTJ(), 855839258, -855839183, new Object[0], zzep.AEQbTJ(), zzep.AEQbTJ(), zzep.AEQbTJ());
    }

    public static final void KWHzl(DefiWalletMainActivity defiWalletMainActivity, Boolean bool) throws Throwable {
        copydefault(zzep.AEQbTJ(), -1395487556, 1395487592, new Object[]{defiWalletMainActivity, bool}, zzep.AEQbTJ(), zzep.AEQbTJ(), zzep.AEQbTJ());
    }

    public static final Unit hDKMBd(Throwable th) {
        return (Unit) copydefault(zzep.AEQbTJ(), -1267693917, 1267693943, new Object[]{th}, zzep.AEQbTJ(), zzep.AEQbTJ(), zzep.AEQbTJ());
    }

    public static final void AxsJAYsNCnLh(Function1 function1, Object obj) throws Throwable {
        copydefault(zzep.AEQbTJ(), -806203615, 806203677, new Object[]{function1, obj}, zzep.AEQbTJ(), zzep.AEQbTJ(), zzep.AEQbTJ());
    }

    public static final Unit EZpvd(DefiWalletMainActivity defiWalletMainActivity, Integer num) {
        return (Unit) copydefault(zzep.AEQbTJ(), 247464110, -247464085, new Object[]{defiWalletMainActivity, num}, zzep.AEQbTJ(), zzep.AEQbTJ(), zzep.AEQbTJ());
    }

    public static final Unit copydefault(VerifyDAppDomainUrlResponse verifyDAppDomainUrlResponse, Application application, String str) {
        return (Unit) copydefault(zzep.AEQbTJ(), 1134617423, -1134617401, new Object[]{verifyDAppDomainUrlResponse, application, str}, zzep.AEQbTJ(), zzep.AEQbTJ(), zzep.AEQbTJ());
    }

    public static final void AhwBna(Function2 function2, Object obj, Object obj2) throws Throwable {
        copydefault(zzep.AEQbTJ(), -706843588, 706843589, new Object[]{function2, obj, obj2}, zzep.AEQbTJ(), zzep.AEQbTJ(), zzep.AEQbTJ());
    }

    public static final Unit OLrzqt(int i, DefiWalletMainActivity defiWalletMainActivity, MenuItem menuItem, Integer num) {
        Object[] objArr = {Integer.valueOf(i), defiWalletMainActivity, menuItem, num};
        return (Unit) copydefault(zzep.AEQbTJ(), 794378107, -794378055, objArr, zzep.AEQbTJ(), zzep.AEQbTJ(), zzep.AEQbTJ());
    }

    public static final Unit OLrzqt(String str, int i) {
        Object[] objArr = {str, Integer.valueOf(i)};
        return (Unit) copydefault(zzep.AEQbTJ(), 606379569, -606379569, objArr, zzep.AEQbTJ(), zzep.AEQbTJ(), zzep.AEQbTJ());
    }

    public static final void hUfVAv(Function1 function1, Object obj) throws Throwable {
        copydefault(zzep.AEQbTJ(), 1200649810, -1200649749, new Object[]{function1, obj}, zzep.AEQbTJ(), zzep.AEQbTJ(), zzep.AEQbTJ());
    }

    public static final Unit EZpvd(DefiWalletMainActivity defiWalletMainActivity, String str) {
        return (Unit) copydefault(zzep.AEQbTJ(), 1019891030, -1019890965, new Object[]{defiWalletMainActivity, str}, zzep.AEQbTJ(), zzep.AEQbTJ(), zzep.AEQbTJ());
    }

    private final C18285ffX gGvvIC() {
        return (C18285ffX) copydefault(zzep.AEQbTJ(), 739293876, -739293856, new Object[]{this}, zzep.AEQbTJ(), zzep.AEQbTJ(), zzep.AEQbTJ());
    }

    private final List<InterfaceC9773bbs> gasjUx() {
        return (List) copydefault(zzep.AEQbTJ(), 1587046147, -1587046084, new Object[]{this}, zzep.AEQbTJ(), zzep.AEQbTJ(), zzep.AEQbTJ());
    }

    private final List<InterfaceC9772bbr> fZBcTu() {
        return (List) copydefault(zzep.AEQbTJ(), 148101415, -148101348, new Object[]{this}, zzep.AEQbTJ(), zzep.AEQbTJ(), zzep.AEQbTJ());
    }

    private final List<InterfaceC9769bbo> fFgQHt() {
        return (List) copydefault(zzep.AEQbTJ(), -1939267607, 1939267648, new Object[]{this}, zzep.AEQbTJ(), zzep.AEQbTJ(), zzep.AEQbTJ());
    }

    public static final void EZpvd(DefiWalletMainActivity defiWalletMainActivity, Boolean bool) throws Throwable {
        copydefault(zzep.AEQbTJ(), 2032489530, -2032489473, new Object[]{defiWalletMainActivity, bool}, zzep.AEQbTJ(), zzep.AEQbTJ(), zzep.AEQbTJ());
    }

    public static final void iRxXKY(Function1 function1, Object obj) throws Throwable {
        copydefault(zzep.AEQbTJ(), 962070565, -962070547, new Object[]{function1, obj}, zzep.AEQbTJ(), zzep.AEQbTJ(), zzep.AEQbTJ());
    }

    public static final Unit fJNWhG(Throwable th) {
        return (Unit) copydefault(zzep.AEQbTJ(), -2049862811, 2049862867, new Object[]{th}, zzep.AEQbTJ(), zzep.AEQbTJ(), zzep.AEQbTJ());
    }

    public static final Unit fARcdN(Throwable th) {
        return (Unit) copydefault(zzep.AEQbTJ(), 1012603316, -1012603257, new Object[]{th}, zzep.AEQbTJ(), zzep.AEQbTJ(), zzep.AEQbTJ());
    }

    public static final Unit giSNqX(DefiWalletMainActivity defiWalletMainActivity) {
        return (Unit) copydefault(zzep.AEQbTJ(), -2072656863, 2072656880, new Object[]{defiWalletMainActivity}, zzep.AEQbTJ(), zzep.AEQbTJ(), zzep.AEQbTJ());
    }

    public static final Unit fIwbmz(Throwable th) {
        return (Unit) copydefault(zzep.AEQbTJ(), -1116088909, 1116088944, new Object[]{th}, zzep.AEQbTJ(), zzep.AEQbTJ(), zzep.AEQbTJ());
    }

    public static final void dvKsVJ(Function1 function1, Object obj) throws Throwable {
        copydefault(zzep.AEQbTJ(), 789580888, -789580811, new Object[]{function1, obj}, zzep.AEQbTJ(), zzep.AEQbTJ(), zzep.AEQbTJ());
    }

    public static final Unit dvKsVJ(DefiWalletMainActivity defiWalletMainActivity) {
        return (Unit) copydefault(zzep.AEQbTJ(), 1543451386, -1543451357, new Object[]{defiWalletMainActivity}, zzep.AEQbTJ(), zzep.AEQbTJ(), zzep.AEQbTJ());
    }

    public static final String dxcTrN(Function1 function1, Object obj) {
        return (String) copydefault(zzep.AEQbTJ(), 1458616476, -1458616428, new Object[]{function1, obj}, zzep.AEQbTJ(), zzep.AEQbTJ(), zzep.AEQbTJ());
    }

    public static final String EZpvd(String str, Integer num) {
        return (String) copydefault(zzep.AEQbTJ(), -507120429, 507120484, new Object[]{str, num}, zzep.AEQbTJ(), zzep.AEQbTJ(), zzep.AEQbTJ());
    }

    public static final Unit AEQbTJ(DefiWalletMainActivity defiWalletMainActivity, Throwable th) {
        return (Unit) copydefault(zzep.AEQbTJ(), 1038050789, -1038050725, new Object[]{defiWalletMainActivity, th}, zzep.AEQbTJ(), zzep.AEQbTJ(), zzep.AEQbTJ());
    }

    public static final void aKErDB(Function1 function1, Object obj) throws Throwable {
        copydefault(zzep.AEQbTJ(), -574858646, 574858665, new Object[]{function1, obj}, zzep.AEQbTJ(), zzep.AEQbTJ(), zzep.AEQbTJ());
    }

    public static final Unit AkhnZx(DefiWalletMainActivity defiWalletMainActivity, AbstractC12782ctV abstractC12782ctV) {
        return (Unit) copydefault(zzep.AEQbTJ(), -695497345, 695497395, new Object[]{defiWalletMainActivity, abstractC12782ctV}, zzep.AEQbTJ(), zzep.AEQbTJ(), zzep.AEQbTJ());
    }

    public static final Unit isConnected(Throwable th) {
        return (Unit) copydefault(zzep.AEQbTJ(), 1351546829, -1351546751, new Object[]{th}, zzep.AEQbTJ(), zzep.AEQbTJ(), zzep.AEQbTJ());
    }

    public static final Unit EZpvd(DefiWalletMainActivity defiWalletMainActivity, Bundle bundle) {
        return (Unit) copydefault(zzep.AEQbTJ(), -1073514280, 1073514304, new Object[]{defiWalletMainActivity, bundle}, zzep.AEQbTJ(), zzep.AEQbTJ(), zzep.AEQbTJ());
    }

    public static final Unit QVAiDq(DefiWalletMainActivity defiWalletMainActivity) {
        return (Unit) copydefault(zzep.AEQbTJ(), 1501641126, -1501641122, new Object[]{defiWalletMainActivity}, zzep.AEQbTJ(), zzep.AEQbTJ(), zzep.AEQbTJ());
    }

    public static final Pair gEmmrt(Function2 function2, Object obj, Object obj2) {
        return (Pair) copydefault(zzep.AEQbTJ(), -1810538888, 1810538896, new Object[]{function2, obj, obj2}, zzep.AEQbTJ(), zzep.AEQbTJ(), zzep.AEQbTJ());
    }

    public static final Pair KWHzl(Integer num, AbstractC12782ctV abstractC12782ctV) {
        return (Pair) copydefault(zzep.AEQbTJ(), -1598156196, 1598156256, new Object[]{num, abstractC12782ctV}, zzep.AEQbTJ(), zzep.AEQbTJ(), zzep.AEQbTJ());
    }

    public static final /* synthetic */ void AEQbTJ(DefiWalletMainActivity defiWalletMainActivity, int i) throws Throwable {
        Object[] objArr = {defiWalletMainActivity, Integer.valueOf(i)};
        copydefault(zzep.AEQbTJ(), 1146566760, -1146566723, objArr, zzep.AEQbTJ(), zzep.AEQbTJ(), zzep.AEQbTJ());
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x001e: CHECK_CAST (kotlin.Unit) (wrap:java.lang.Object:0x001a: INVOKE 
  (wrap:int:0x0004: INVOKE  STATIC call: com.google.android.gms.internal.fido.zzep.AEQbTJ():int A[MD:():int (m), WRAPPED])
  (32354748 int)
  (-32354737 int)
  (wrap:java.lang.Object[]:0x0000: FILLED_NEW_ARRAY (r7v0 com.okinc.business.defi.wallet.DefiWalletMainActivity), (r8v0 o.ctV) A[WRAPPED] (LINE:65328) elemType: java.lang.Object)
  (wrap:int:0x0010: INVOKE  STATIC call: com.google.android.gms.internal.fido.zzep.AEQbTJ():int A[MD:():int (m), WRAPPED])
  (wrap:int:0x0008: INVOKE  STATIC call: com.google.android.gms.internal.fido.zzep.AEQbTJ():int A[MD:():int (m), WRAPPED])
  (wrap:int:0x000c: INVOKE  STATIC call: com.google.android.gms.internal.fido.zzep.AEQbTJ():int A[MD:():int (m), WRAPPED])
 STATIC call: com.okinc.business.defi.wallet.DefiWalletMainActivity.copydefault(int, int, int, java.lang.Object[], int, int, int):java.lang.Object A[MD:(int, int, int, java.lang.Object[], int, int, int):java.lang.Object throws java.lang.Throwable (m), WRAPPED] (LINE:65328)) */
    public static /* synthetic */ Unit AhwBna(DefiWalletMainActivity defiWalletMainActivity, AbstractC12782ctV abstractC12782ctV) {
        return (Unit) copydefault(zzep.AEQbTJ(), 32354748, -32354737, new Object[]{defiWalletMainActivity, abstractC12782ctV}, zzep.AEQbTJ(), zzep.AEQbTJ(), zzep.AEQbTJ());
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x001d: CHECK_CAST (o.bbq) (wrap:java.lang.Object:0x0019: INVOKE 
  (wrap:int:0x0003: INVOKE  STATIC call: com.google.android.gms.internal.fido.zzep.AEQbTJ():int A[MD:():int (m), WRAPPED])
  (512713750 int)
  (-512713679 int)
  (wrap:java.lang.Object[]:0x0001: NEW_ARRAY (0 int) A[WRAPPED] (LINE:65329) type: java.lang.Object[])
  (wrap:int:0x000f: INVOKE  STATIC call: com.google.android.gms.internal.fido.zzep.AEQbTJ():int A[MD:():int (m), WRAPPED])
  (wrap:int:0x0007: INVOKE  STATIC call: com.google.android.gms.internal.fido.zzep.AEQbTJ():int A[MD:():int (m), WRAPPED])
  (wrap:int:0x000b: INVOKE  STATIC call: com.google.android.gms.internal.fido.zzep.AEQbTJ():int A[MD:():int (m), WRAPPED])
 STATIC call: com.okinc.business.defi.wallet.DefiWalletMainActivity.copydefault(int, int, int, java.lang.Object[], int, int, int):java.lang.Object A[MD:(int, int, int, java.lang.Object[], int, int, int):java.lang.Object throws java.lang.Throwable (m), WRAPPED] (LINE:65329)) */
    public static /* synthetic */ InterfaceC9771bbq gEmmrt() {
        return (InterfaceC9771bbq) copydefault(zzep.AEQbTJ(), 512713750, -512713679, new Object[0], zzep.AEQbTJ(), zzep.AEQbTJ(), zzep.AEQbTJ());
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x001e: CHECK_CAST (kotlin.Unit) (wrap:java.lang.Object:0x001a: INVOKE 
  (wrap:int:0x0004: INVOKE  STATIC call: com.google.android.gms.internal.fido.zzep.AEQbTJ():int A[MD:():int (m), WRAPPED])
  (1727835988 int)
  (-1727835972 int)
  (wrap:java.lang.Object[]:0x0000: FILLED_NEW_ARRAY (r7v0 java.lang.Throwable) A[WRAPPED] (LINE:65330) elemType: java.lang.Object)
  (wrap:int:0x0010: INVOKE  STATIC call: com.google.android.gms.internal.fido.zzep.AEQbTJ():int A[MD:():int (m), WRAPPED])
  (wrap:int:0x0008: INVOKE  STATIC call: com.google.android.gms.internal.fido.zzep.AEQbTJ():int A[MD:():int (m), WRAPPED])
  (wrap:int:0x000c: INVOKE  STATIC call: com.google.android.gms.internal.fido.zzep.AEQbTJ():int A[MD:():int (m), WRAPPED])
 STATIC call: com.okinc.business.defi.wallet.DefiWalletMainActivity.copydefault(int, int, int, java.lang.Object[], int, int, int):java.lang.Object A[MD:(int, int, int, java.lang.Object[], int, int, int):java.lang.Object throws java.lang.Throwable (m), WRAPPED] (LINE:65330)) */
    public static /* synthetic */ Unit fetchVPNInfo(Throwable th) {
        return (Unit) copydefault(zzep.AEQbTJ(), 1727835988, -1727835972, new Object[]{th}, zzep.AEQbTJ(), zzep.AEQbTJ(), zzep.AEQbTJ());
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x001e: CHECK_CAST (kotlin.Unit) (wrap:java.lang.Object:0x001a: INVOKE 
  (wrap:int:0x0004: INVOKE  STATIC call: com.google.android.gms.internal.fido.zzep.AEQbTJ():int A[MD:():int (m), WRAPPED])
  (-12205524 int)
  (12205563 int)
  (wrap:java.lang.Object[]:0x0000: FILLED_NEW_ARRAY (r7v0 com.okinc.business.defi.wallet.DefiWalletMainActivity) A[WRAPPED] (LINE:65331) elemType: java.lang.Object)
  (wrap:int:0x0010: INVOKE  STATIC call: com.google.android.gms.internal.fido.zzep.AEQbTJ():int A[MD:():int (m), WRAPPED])
  (wrap:int:0x0008: INVOKE  STATIC call: com.google.android.gms.internal.fido.zzep.AEQbTJ():int A[MD:():int (m), WRAPPED])
  (wrap:int:0x000c: INVOKE  STATIC call: com.google.android.gms.internal.fido.zzep.AEQbTJ():int A[MD:():int (m), WRAPPED])
 STATIC call: com.okinc.business.defi.wallet.DefiWalletMainActivity.copydefault(int, int, int, java.lang.Object[], int, int, int):java.lang.Object A[MD:(int, int, int, java.lang.Object[], int, int, int):java.lang.Object throws java.lang.Throwable (m), WRAPPED] (LINE:65331)) */
    public static /* synthetic */ Unit hDKMBd(DefiWalletMainActivity defiWalletMainActivity) {
        return (Unit) copydefault(zzep.AEQbTJ(), -12205524, 12205563, new Object[]{defiWalletMainActivity}, zzep.AEQbTJ(), zzep.AEQbTJ(), zzep.AEQbTJ());
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x001e: CHECK_CAST (kotlin.Unit) (wrap:java.lang.Object:0x001a: INVOKE 
  (wrap:int:0x0004: INVOKE  STATIC call: com.google.android.gms.internal.fido.zzep.AEQbTJ():int A[MD:():int (m), WRAPPED])
  (-841861264 int)
  (841861271 int)
  (wrap:java.lang.Object[]:0x0000: FILLED_NEW_ARRAY (r7v0 java.lang.Throwable) A[WRAPPED] (LINE:65335) elemType: java.lang.Object)
  (wrap:int:0x0010: INVOKE  STATIC call: com.google.android.gms.internal.fido.zzep.AEQbTJ():int A[MD:():int (m), WRAPPED])
  (wrap:int:0x0008: INVOKE  STATIC call: com.google.android.gms.internal.fido.zzep.AEQbTJ():int A[MD:():int (m), WRAPPED])
  (wrap:int:0x000c: INVOKE  STATIC call: com.google.android.gms.internal.fido.zzep.AEQbTJ():int A[MD:():int (m), WRAPPED])
 STATIC call: com.okinc.business.defi.wallet.DefiWalletMainActivity.copydefault(int, int, int, java.lang.Object[], int, int, int):java.lang.Object A[MD:(int, int, int, java.lang.Object[], int, int, int):java.lang.Object throws java.lang.Throwable (m), WRAPPED] (LINE:65335)) */
    public static /* synthetic */ Unit AhwBna(Throwable th) {
        return (Unit) copydefault(zzep.AEQbTJ(), -841861264, 841861271, new Object[]{th}, zzep.AEQbTJ(), zzep.AEQbTJ(), zzep.AEQbTJ());
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x001e: CHECK_CAST (o.yxu) (wrap:java.lang.Object:0x001a: INVOKE 
  (wrap:int:0x0004: INVOKE  STATIC call: com.google.android.gms.internal.fido.zzep.AEQbTJ():int A[MD:():int (m), WRAPPED])
  (1622118346 int)
  (-1622118270 int)
  (wrap:java.lang.Object[]:0x0000: FILLED_NEW_ARRAY (r7v0 java.lang.String), (r8v0 o.ctV) A[WRAPPED] (LINE:65336) elemType: java.lang.Object)
  (wrap:int:0x0010: INVOKE  STATIC call: com.google.android.gms.internal.fido.zzep.AEQbTJ():int A[MD:():int (m), WRAPPED])
  (wrap:int:0x0008: INVOKE  STATIC call: com.google.android.gms.internal.fido.zzep.AEQbTJ():int A[MD:():int (m), WRAPPED])
  (wrap:int:0x000c: INVOKE  STATIC call: com.google.android.gms.internal.fido.zzep.AEQbTJ():int A[MD:():int (m), WRAPPED])
 STATIC call: com.okinc.business.defi.wallet.DefiWalletMainActivity.copydefault(int, int, int, java.lang.Object[], int, int, int):java.lang.Object A[MD:(int, int, int, java.lang.Object[], int, int, int):java.lang.Object throws java.lang.Throwable (m), WRAPPED] (LINE:65336)) */
    public static /* synthetic */ InterfaceC58261yxu EZpvd(String str, AbstractC12782ctV abstractC12782ctV) {
        return (InterfaceC58261yxu) copydefault(zzep.AEQbTJ(), 1622118346, -1622118270, new Object[]{str, abstractC12782ctV}, zzep.AEQbTJ(), zzep.AEQbTJ(), zzep.AEQbTJ());
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x001e: CHECK_CAST (kotlin.Unit) (wrap:java.lang.Object:0x001a: INVOKE 
  (wrap:int:0x0004: INVOKE  STATIC call: com.google.android.gms.internal.fido.zzep.AEQbTJ():int A[MD:():int (m), WRAPPED])
  (-539368594 int)
  (539368638 int)
  (wrap:java.lang.Object[]:0x0000: FILLED_NEW_ARRAY (r7v0 com.okinc.business.defi.wallet.DefiWalletMainActivity), (r8v0 o.ctV) A[WRAPPED] (LINE:65337) elemType: java.lang.Object)
  (wrap:int:0x0010: INVOKE  STATIC call: com.google.android.gms.internal.fido.zzep.AEQbTJ():int A[MD:():int (m), WRAPPED])
  (wrap:int:0x0008: INVOKE  STATIC call: com.google.android.gms.internal.fido.zzep.AEQbTJ():int A[MD:():int (m), WRAPPED])
  (wrap:int:0x000c: INVOKE  STATIC call: com.google.android.gms.internal.fido.zzep.AEQbTJ():int A[MD:():int (m), WRAPPED])
 STATIC call: com.okinc.business.defi.wallet.DefiWalletMainActivity.copydefault(int, int, int, java.lang.Object[], int, int, int):java.lang.Object A[MD:(int, int, int, java.lang.Object[], int, int, int):java.lang.Object throws java.lang.Throwable (m), WRAPPED] (LINE:65337)) */
    public static /* synthetic */ Unit valueOf(DefiWalletMainActivity defiWalletMainActivity, AbstractC12782ctV abstractC12782ctV) {
        return (Unit) copydefault(zzep.AEQbTJ(), -539368594, 539368638, new Object[]{defiWalletMainActivity, abstractC12782ctV}, zzep.AEQbTJ(), zzep.AEQbTJ(), zzep.AEQbTJ());
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x001e: CHECK_CAST (kotlin.Unit) (wrap:java.lang.Object:0x001a: INVOKE 
  (wrap:int:0x0004: INVOKE  STATIC call: com.google.android.gms.internal.fido.zzep.AEQbTJ():int A[MD:():int (m), WRAPPED])
  (1846509663 int)
  (-1846509605 int)
  (wrap:java.lang.Object[]:0x0000: FILLED_NEW_ARRAY 
  (r7v0 java.lang.String)
  (r8v0 com.okinc.business.defi.wallet.DefiWalletMainActivity)
  (r9v0 java.lang.String)
  (r10v0 java.lang.Throwable)
 A[WRAPPED] (LINE:65339) elemType: java.lang.Object)
  (wrap:int:0x0010: INVOKE  STATIC call: com.google.android.gms.internal.fido.zzep.AEQbTJ():int A[MD:():int (m), WRAPPED])
  (wrap:int:0x0008: INVOKE  STATIC call: com.google.android.gms.internal.fido.zzep.AEQbTJ():int A[MD:():int (m), WRAPPED])
  (wrap:int:0x000c: INVOKE  STATIC call: com.google.android.gms.internal.fido.zzep.AEQbTJ():int A[MD:():int (m), WRAPPED])
 STATIC call: com.okinc.business.defi.wallet.DefiWalletMainActivity.copydefault(int, int, int, java.lang.Object[], int, int, int):java.lang.Object A[MD:(int, int, int, java.lang.Object[], int, int, int):java.lang.Object throws java.lang.Throwable (m), WRAPPED] (LINE:65339)) */
    public static /* synthetic */ Unit KWHzl(String str, DefiWalletMainActivity defiWalletMainActivity, String str2, Throwable th) {
        return (Unit) copydefault(zzep.AEQbTJ(), 1846509663, -1846509605, new Object[]{str, defiWalletMainActivity, str2, th}, zzep.AEQbTJ(), zzep.AEQbTJ(), zzep.AEQbTJ());
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x001e: CHECK_CAST (kotlin.Unit) (wrap:java.lang.Object:0x001a: INVOKE 
  (wrap:int:0x0004: INVOKE  STATIC call: com.google.android.gms.internal.fido.zzep.AEQbTJ():int A[MD:():int (m), WRAPPED])
  (-2118778808 int)
  (2118778854 int)
  (wrap:java.lang.Object[]:0x0000: FILLED_NEW_ARRAY (r7v0 com.okinc.business.defi.wallet.DefiWalletMainActivity), (r8v0 java.lang.Integer) A[WRAPPED] (LINE:65342) elemType: java.lang.Object)
  (wrap:int:0x0010: INVOKE  STATIC call: com.google.android.gms.internal.fido.zzep.AEQbTJ():int A[MD:():int (m), WRAPPED])
  (wrap:int:0x0008: INVOKE  STATIC call: com.google.android.gms.internal.fido.zzep.AEQbTJ():int A[MD:():int (m), WRAPPED])
  (wrap:int:0x000c: INVOKE  STATIC call: com.google.android.gms.internal.fido.zzep.AEQbTJ():int A[MD:():int (m), WRAPPED])
 STATIC call: com.okinc.business.defi.wallet.DefiWalletMainActivity.copydefault(int, int, int, java.lang.Object[], int, int, int):java.lang.Object A[MD:(int, int, int, java.lang.Object[], int, int, int):java.lang.Object throws java.lang.Throwable (m), WRAPPED] (LINE:65342)) */
    public static /* synthetic */ Unit AEQbTJ(DefiWalletMainActivity defiWalletMainActivity, Integer num) {
        return (Unit) copydefault(zzep.AEQbTJ(), -2118778808, 2118778854, new Object[]{defiWalletMainActivity, num}, zzep.AEQbTJ(), zzep.AEQbTJ(), zzep.AEQbTJ());
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x001e: CHECK_CAST (kotlin.Unit) (wrap:java.lang.Object:0x001a: INVOKE 
  (wrap:int:0x0004: INVOKE  STATIC call: com.google.android.gms.internal.fido.zzep.AEQbTJ():int A[MD:():int (m), WRAPPED])
  (1277143443 int)
  (-1277143437 int)
  (wrap:java.lang.Object[]:0x0000: FILLED_NEW_ARRAY (r7v0 com.okinc.business.defi.wallet.DefiWalletMainActivity) A[WRAPPED] (LINE:65343) elemType: java.lang.Object)
  (wrap:int:0x0010: INVOKE  STATIC call: com.google.android.gms.internal.fido.zzep.AEQbTJ():int A[MD:():int (m), WRAPPED])
  (wrap:int:0x0008: INVOKE  STATIC call: com.google.android.gms.internal.fido.zzep.AEQbTJ():int A[MD:():int (m), WRAPPED])
  (wrap:int:0x000c: INVOKE  STATIC call: com.google.android.gms.internal.fido.zzep.AEQbTJ():int A[MD:():int (m), WRAPPED])
 STATIC call: com.okinc.business.defi.wallet.DefiWalletMainActivity.copydefault(int, int, int, java.lang.Object[], int, int, int):java.lang.Object A[MD:(int, int, int, java.lang.Object[], int, int, int):java.lang.Object throws java.lang.Throwable (m), WRAPPED] (LINE:65343)) */
    public static /* synthetic */ Unit djBIcL(DefiWalletMainActivity defiWalletMainActivity) {
        return (Unit) copydefault(zzep.AEQbTJ(), 1277143443, -1277143437, new Object[]{defiWalletMainActivity}, zzep.AEQbTJ(), zzep.AEQbTJ(), zzep.AEQbTJ());
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x001d: CHECK_CAST (java.util.List) (wrap:java.lang.Object:0x0019: INVOKE 
  (wrap:int:0x0003: INVOKE  STATIC call: com.google.android.gms.internal.fido.zzep.AEQbTJ():int A[MD:():int (m), WRAPPED])
  (994656632 int)
  (-994656630 int)
  (wrap:java.lang.Object[]:0x0001: NEW_ARRAY (0 int) A[WRAPPED] (LINE:65344) type: java.lang.Object[])
  (wrap:int:0x000f: INVOKE  STATIC call: com.google.android.gms.internal.fido.zzep.AEQbTJ():int A[MD:():int (m), WRAPPED])
  (wrap:int:0x0007: INVOKE  STATIC call: com.google.android.gms.internal.fido.zzep.AEQbTJ():int A[MD:():int (m), WRAPPED])
  (wrap:int:0x000b: INVOKE  STATIC call: com.google.android.gms.internal.fido.zzep.AEQbTJ():int A[MD:():int (m), WRAPPED])
 STATIC call: com.okinc.business.defi.wallet.DefiWalletMainActivity.copydefault(int, int, int, java.lang.Object[], int, int, int):java.lang.Object A[MD:(int, int, int, java.lang.Object[], int, int, int):java.lang.Object throws java.lang.Throwable (m), WRAPPED] (LINE:65344)) */
    public static /* synthetic */ List EZpvd() {
        return (List) copydefault(zzep.AEQbTJ(), 994656632, -994656630, new Object[0], zzep.AEQbTJ(), zzep.AEQbTJ(), zzep.AEQbTJ());
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x001e: CHECK_CAST (kotlin.Unit) (wrap:java.lang.Object:0x001a: INVOKE 
  (wrap:int:0x0004: INVOKE  STATIC call: com.google.android.gms.internal.fido.zzep.AEQbTJ():int A[MD:():int (m), WRAPPED])
  (730684577 int)
  (-730684544 int)
  (wrap:java.lang.Object[]:0x0000: FILLED_NEW_ARRAY (r7v0 com.okinc.business.defi.wallet.DefiWalletMainActivity), (r8v0 o.ctV) A[WRAPPED] (LINE:65346) elemType: java.lang.Object)
  (wrap:int:0x0010: INVOKE  STATIC call: com.google.android.gms.internal.fido.zzep.AEQbTJ():int A[MD:():int (m), WRAPPED])
  (wrap:int:0x0008: INVOKE  STATIC call: com.google.android.gms.internal.fido.zzep.AEQbTJ():int A[MD:():int (m), WRAPPED])
  (wrap:int:0x000c: INVOKE  STATIC call: com.google.android.gms.internal.fido.zzep.AEQbTJ():int A[MD:():int (m), WRAPPED])
 STATIC call: com.okinc.business.defi.wallet.DefiWalletMainActivity.copydefault(int, int, int, java.lang.Object[], int, int, int):java.lang.Object A[MD:(int, int, int, java.lang.Object[], int, int, int):java.lang.Object throws java.lang.Throwable (m), WRAPPED] (LINE:65346)) */
    public static /* synthetic */ Unit KWHzl(DefiWalletMainActivity defiWalletMainActivity, AbstractC12782ctV abstractC12782ctV) {
        return (Unit) copydefault(zzep.AEQbTJ(), 730684577, -730684544, new Object[]{defiWalletMainActivity, abstractC12782ctV}, zzep.AEQbTJ(), zzep.AEQbTJ(), zzep.AEQbTJ());
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x001e: CHECK_CAST (java.util.List) (wrap:java.lang.Object:0x001a: INVOKE 
  (wrap:int:0x0004: INVOKE  STATIC call: com.google.android.gms.internal.fido.zzep.AEQbTJ():int A[MD:():int (m), WRAPPED])
  (-939740179 int)
  (939740253 int)
  (wrap:java.lang.Object[]:0x0000: FILLED_NEW_ARRAY (r7v0 java.util.List) A[WRAPPED] (LINE:65347) elemType: java.lang.Object)
  (wrap:int:0x0010: INVOKE  STATIC call: com.google.android.gms.internal.fido.zzep.AEQbTJ():int A[MD:():int (m), WRAPPED])
  (wrap:int:0x0008: INVOKE  STATIC call: com.google.android.gms.internal.fido.zzep.AEQbTJ():int A[MD:():int (m), WRAPPED])
  (wrap:int:0x000c: INVOKE  STATIC call: com.google.android.gms.internal.fido.zzep.AEQbTJ():int A[MD:():int (m), WRAPPED])
 STATIC call: com.okinc.business.defi.wallet.DefiWalletMainActivity.copydefault(int, int, int, java.lang.Object[], int, int, int):java.lang.Object A[MD:(int, int, int, java.lang.Object[], int, int, int):java.lang.Object throws java.lang.Throwable (m), WRAPPED] (LINE:65347)) */
    public static /* synthetic */ List copydefault(List list) {
        return (List) copydefault(zzep.AEQbTJ(), -939740179, 939740253, new Object[]{list}, zzep.AEQbTJ(), zzep.AEQbTJ(), zzep.AEQbTJ());
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x001e: CHECK_CAST (kotlin.Unit) (wrap:java.lang.Object:0x001a: INVOKE 
  (wrap:int:0x0004: INVOKE  STATIC call: com.google.android.gms.internal.fido.zzep.AEQbTJ():int A[MD:():int (m), WRAPPED])
  (1536645977 int)
  (-1536645905 int)
  (wrap:java.lang.Object[]:0x0000: FILLED_NEW_ARRAY (r7v0 com.okinc.business.defi.wallet.DefiWalletMainActivity) A[WRAPPED] (LINE:65348) elemType: java.lang.Object)
  (wrap:int:0x0010: INVOKE  STATIC call: com.google.android.gms.internal.fido.zzep.AEQbTJ():int A[MD:():int (m), WRAPPED])
  (wrap:int:0x0008: INVOKE  STATIC call: com.google.android.gms.internal.fido.zzep.AEQbTJ():int A[MD:():int (m), WRAPPED])
  (wrap:int:0x000c: INVOKE  STATIC call: com.google.android.gms.internal.fido.zzep.AEQbTJ():int A[MD:():int (m), WRAPPED])
 STATIC call: com.okinc.business.defi.wallet.DefiWalletMainActivity.copydefault(int, int, int, java.lang.Object[], int, int, int):java.lang.Object A[MD:(int, int, int, java.lang.Object[], int, int, int):java.lang.Object throws java.lang.Throwable (m), WRAPPED] (LINE:65348)) */
    public static /* synthetic */ Unit copydefault(DefiWalletMainActivity defiWalletMainActivity) {
        return (Unit) copydefault(zzep.AEQbTJ(), 1536645977, -1536645905, new Object[]{defiWalletMainActivity}, zzep.AEQbTJ(), zzep.AEQbTJ(), zzep.AEQbTJ());
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x001e: CHECK_CAST (kotlin.Unit) (wrap:java.lang.Object:0x001a: INVOKE 
  (wrap:int:0x0004: INVOKE  STATIC call: com.google.android.gms.internal.fido.zzep.AEQbTJ():int A[MD:():int (m), WRAPPED])
  (77214420 int)
  (-77214389 int)
  (wrap:java.lang.Object[]:0x0000: FILLED_NEW_ARRAY (r7v0 com.okinc.business.defi.wallet.DefiWalletMainActivity), (r8v0 java.lang.Throwable) A[WRAPPED] (LINE:65352) elemType: java.lang.Object)
  (wrap:int:0x0010: INVOKE  STATIC call: com.google.android.gms.internal.fido.zzep.AEQbTJ():int A[MD:():int (m), WRAPPED])
  (wrap:int:0x0008: INVOKE  STATIC call: com.google.android.gms.internal.fido.zzep.AEQbTJ():int A[MD:():int (m), WRAPPED])
  (wrap:int:0x000c: INVOKE  STATIC call: com.google.android.gms.internal.fido.zzep.AEQbTJ():int A[MD:():int (m), WRAPPED])
 STATIC call: com.okinc.business.defi.wallet.DefiWalletMainActivity.copydefault(int, int, int, java.lang.Object[], int, int, int):java.lang.Object A[MD:(int, int, int, java.lang.Object[], int, int, int):java.lang.Object throws java.lang.Throwable (m), WRAPPED] (LINE:65352)) */
    public static /* synthetic */ Unit KWHzl(DefiWalletMainActivity defiWalletMainActivity, Throwable th) {
        return (Unit) copydefault(zzep.AEQbTJ(), 77214420, -77214389, new Object[]{defiWalletMainActivity, th}, zzep.AEQbTJ(), zzep.AEQbTJ(), zzep.AEQbTJ());
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x001e: CHECK_CAST (kotlin.Unit) (wrap:java.lang.Object:0x001a: INVOKE 
  (wrap:int:0x0004: INVOKE  STATIC call: com.google.android.gms.internal.fido.zzep.AEQbTJ():int A[MD:():int (m), WRAPPED])
  (-1134665461 int)
  (1134665474 int)
  (wrap:java.lang.Object[]:0x0000: FILLED_NEW_ARRAY (r7v0 o.xXO) A[WRAPPED] (LINE:65353) elemType: java.lang.Object)
  (wrap:int:0x0010: INVOKE  STATIC call: com.google.android.gms.internal.fido.zzep.AEQbTJ():int A[MD:():int (m), WRAPPED])
  (wrap:int:0x0008: INVOKE  STATIC call: com.google.android.gms.internal.fido.zzep.AEQbTJ():int A[MD:():int (m), WRAPPED])
  (wrap:int:0x000c: INVOKE  STATIC call: com.google.android.gms.internal.fido.zzep.AEQbTJ():int A[MD:():int (m), WRAPPED])
 STATIC call: com.okinc.business.defi.wallet.DefiWalletMainActivity.copydefault(int, int, int, java.lang.Object[], int, int, int):java.lang.Object A[MD:(int, int, int, java.lang.Object[], int, int, int):java.lang.Object throws java.lang.Throwable (m), WRAPPED] (LINE:65353)) */
    public static /* synthetic */ Unit copydefault(xXO xxo) {
        return (Unit) copydefault(zzep.AEQbTJ(), -1134665461, 1134665474, new Object[]{xxo}, zzep.AEQbTJ(), zzep.AEQbTJ(), zzep.AEQbTJ());
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x001e: CHECK_CAST (kotlin.Unit) (wrap:java.lang.Object:0x001a: INVOKE 
  (wrap:int:0x0004: INVOKE  STATIC call: com.google.android.gms.internal.fido.zzep.AEQbTJ():int A[MD:():int (m), WRAPPED])
  (2098571949 int)
  (-2098571917 int)
  (wrap:java.lang.Object[]:0x0000: FILLED_NEW_ARRAY (r7v0 java.lang.String), (r8v0 java.lang.String), (r9v0 com.okinc.components.track.bean.EventParamsList) A[WRAPPED] (LINE:65354) elemType: java.lang.Object)
  (wrap:int:0x0010: INVOKE  STATIC call: com.google.android.gms.internal.fido.zzep.AEQbTJ():int A[MD:():int (m), WRAPPED])
  (wrap:int:0x0008: INVOKE  STATIC call: com.google.android.gms.internal.fido.zzep.AEQbTJ():int A[MD:():int (m), WRAPPED])
  (wrap:int:0x000c: INVOKE  STATIC call: com.google.android.gms.internal.fido.zzep.AEQbTJ():int A[MD:():int (m), WRAPPED])
 STATIC call: com.okinc.business.defi.wallet.DefiWalletMainActivity.copydefault(int, int, int, java.lang.Object[], int, int, int):java.lang.Object A[MD:(int, int, int, java.lang.Object[], int, int, int):java.lang.Object throws java.lang.Throwable (m), WRAPPED] (LINE:65354)) */
    public static /* synthetic */ Unit copydefault(String str, String str2, EventParamsList eventParamsList) {
        return (Unit) copydefault(zzep.AEQbTJ(), 2098571949, -2098571917, new Object[]{str, str2, eventParamsList}, zzep.AEQbTJ(), zzep.AEQbTJ(), zzep.AEQbTJ());
    }
}
